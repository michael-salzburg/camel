package org.apache.camel.component.file.remote;

import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.pool2.BasePooledObjectFactory;
import org.apache.commons.pool2.ObjectPool;
import org.apache.commons.pool2.PooledObject;
import org.apache.commons.pool2.impl.DefaultPooledObject;
import org.apache.commons.pool2.impl.GenericObjectPool;

public class FTPConnectionPool {
    private final ObjectPool<FTPClient> ftpPool;

    public FTPConnectionPool(String host, int port, String username, String password) {
        ftpPool = new GenericObjectPool<>(new BasePooledObjectFactory<FTPClient>() {
            @Override
            public FTPClient create() throws Exception {
                FTPClient ftpClient = new FTPClient();
                ftpClient.connect(host, port);
                ftpClient.login(username, password);
                return ftpClient;
            }

            @Override
            public PooledObject<FTPClient> wrap(FTPClient ftpClient) {
                return new DefaultPooledObject<>(ftpClient);
            }

            @Override
            public void destroyObject(PooledObject<FTPClient> p) throws Exception {
                p.getObject().logout();
                p.getObject().disconnect();
            }

            @Override
            public boolean validateObject(PooledObject<FTPClient> p) {
                return p.getObject().isConnected();
            }
        });
    }

}
