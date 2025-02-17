/*
 * Camel ApiMethod Enumeration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.google.drive.internal;

import java.lang.reflect.Method;
import java.util.List;

import com.google.api.services.drive.Drive.Teamdrives;

import org.apache.camel.support.component.ApiMethod;
import org.apache.camel.support.component.ApiMethodArg;
import org.apache.camel.support.component.ApiMethodImpl;

import static org.apache.camel.support.component.ApiMethodArg.arg;

/**
 * Camel {@link ApiMethod} Enumeration for com.google.api.services.drive.Drive$Teamdrives
 */
public enum DriveTeamdrivesApiMethod implements ApiMethod {

    DELETE(
        com.google.api.services.drive.Drive.Teamdrives.Delete.class,
        "delete",
        arg("teamDriveId", String.class)),

    GET(
        com.google.api.services.drive.Drive.Teamdrives.Get.class,
        "get",
        arg("teamDriveId", String.class)),

    INSERT(
        com.google.api.services.drive.Drive.Teamdrives.Insert.class,
        "insert",
        arg("requestId", String.class),
        arg("content", com.google.api.services.drive.model.TeamDrive.class)),

    LIST(
        com.google.api.services.drive.Drive.Teamdrives.List.class,
        "list"),

    UPDATE(
        com.google.api.services.drive.Drive.Teamdrives.Update.class,
        "update",
        arg("teamDriveId", String.class),
        arg("content", com.google.api.services.drive.model.TeamDrive.class));

    private final ApiMethod apiMethod;

    private DriveTeamdrivesApiMethod(Class<?> resultType, String name, ApiMethodArg... args) {
        this.apiMethod = new ApiMethodImpl(Teamdrives.class, resultType, name, args);
    }

    @Override
    public String getName() { return apiMethod.getName(); }

    @Override
    public Class<?> getResultType() { return apiMethod.getResultType(); }

    @Override
    public List<String> getArgNames() { return apiMethod.getArgNames(); }

    @Override
    public List<Class<?>> getArgTypes() { return apiMethod.getArgTypes(); }

    @Override
    public Method getMethod() { return apiMethod.getMethod(); }
}
