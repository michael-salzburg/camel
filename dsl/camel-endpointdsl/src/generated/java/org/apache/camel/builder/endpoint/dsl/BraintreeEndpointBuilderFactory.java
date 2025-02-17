/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.endpoint.dsl;

import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;
import javax.annotation.processing.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Process payments using Braintree Payments.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface BraintreeEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Braintree component.
     */
    public interface BraintreeEndpointBuilder extends EndpointProducerBuilder {
        default AdvancedBraintreeEndpointBuilder advanced() {
            return (AdvancedBraintreeEndpointBuilder) this;
        }
        /**
         * The environment Either SANDBOX or PRODUCTION.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param environment the value to set
         * @return the dsl builder
         */
        default BraintreeEndpointBuilder environment(String environment) {
            doSetProperty("environment", environment);
            return this;
        }
        /**
         * Sets the name of a parameter to be passed in the exchange In Body.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param inBody the value to set
         * @return the dsl builder
         */
        default BraintreeEndpointBuilder inBody(String inBody) {
            doSetProperty("inBody", inBody);
            return this;
        }
        /**
         * The merchant id provided by Braintree.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param merchantId the value to set
         * @return the dsl builder
         */
        default BraintreeEndpointBuilder merchantId(String merchantId) {
            doSetProperty("merchantId", merchantId);
            return this;
        }
        /**
         * Set logging level for http calls, see java.util.logging.Level.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: logging
         * 
         * @param httpLogLevel the value to set
         * @return the dsl builder
         */
        default BraintreeEndpointBuilder httpLogLevel(String httpLogLevel) {
            doSetProperty("httpLogLevel", httpLogLevel);
            return this;
        }
        /**
         * Set log category to use to log http calls.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: Braintree
         * Group: logging
         * 
         * @param httpLogName the value to set
         * @return the dsl builder
         */
        default BraintreeEndpointBuilder httpLogName(String httpLogName) {
            doSetProperty("httpLogName", httpLogName);
            return this;
        }
        /**
         * Sets whether to enable the BraintreeLogHandler. It may be desirable
         * to set this to 'false' where an existing JUL - SLF4J logger bridge is
         * on the classpath. This option can also be configured globally on the
         * BraintreeComponent.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: logging
         * 
         * @param logHandlerEnabled the value to set
         * @return the dsl builder
         */
        default BraintreeEndpointBuilder logHandlerEnabled(
                boolean logHandlerEnabled) {
            doSetProperty("logHandlerEnabled", logHandlerEnabled);
            return this;
        }
        /**
         * Sets whether to enable the BraintreeLogHandler. It may be desirable
         * to set this to 'false' where an existing JUL - SLF4J logger bridge is
         * on the classpath. This option can also be configured globally on the
         * BraintreeComponent.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: true
         * Group: logging
         * 
         * @param logHandlerEnabled the value to set
         * @return the dsl builder
         */
        default BraintreeEndpointBuilder logHandlerEnabled(
                String logHandlerEnabled) {
            doSetProperty("logHandlerEnabled", logHandlerEnabled);
            return this;
        }
        /**
         * The proxy host.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: proxy
         * 
         * @param proxyHost the value to set
         * @return the dsl builder
         */
        default BraintreeEndpointBuilder proxyHost(String proxyHost) {
            doSetProperty("proxyHost", proxyHost);
            return this;
        }
        /**
         * The proxy port.
         * 
         * The option is a: &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Group: proxy
         * 
         * @param proxyPort the value to set
         * @return the dsl builder
         */
        default BraintreeEndpointBuilder proxyPort(Integer proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * The proxy port.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Group: proxy
         * 
         * @param proxyPort the value to set
         * @return the dsl builder
         */
        default BraintreeEndpointBuilder proxyPort(String proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * The access token granted by a merchant to another in order to process
         * transactions on their behalf. Used in place of environment, merchant
         * id, public key and private key fields.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param accessToken the value to set
         * @return the dsl builder
         */
        default BraintreeEndpointBuilder accessToken(String accessToken) {
            doSetProperty("accessToken", accessToken);
            return this;
        }
        /**
         * The private key provided by Braintree.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param privateKey the value to set
         * @return the dsl builder
         */
        default BraintreeEndpointBuilder privateKey(String privateKey) {
            doSetProperty("privateKey", privateKey);
            return this;
        }
        /**
         * The public key provided by Braintree.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param publicKey the value to set
         * @return the dsl builder
         */
        default BraintreeEndpointBuilder publicKey(String publicKey) {
            doSetProperty("publicKey", publicKey);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Braintree component.
     */
    public interface AdvancedBraintreeEndpointBuilder
            extends
                EndpointProducerBuilder {
        default BraintreeEndpointBuilder basic() {
            return (BraintreeEndpointBuilder) this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedBraintreeEndpointBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedBraintreeEndpointBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Set read timeout for http calls.
         * 
         * The option is a: &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param httpReadTimeout the value to set
         * @return the dsl builder
         */
        default AdvancedBraintreeEndpointBuilder httpReadTimeout(
                Integer httpReadTimeout) {
            doSetProperty("httpReadTimeout", httpReadTimeout);
            return this;
        }
        /**
         * Set read timeout for http calls.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param httpReadTimeout the value to set
         * @return the dsl builder
         */
        default AdvancedBraintreeEndpointBuilder httpReadTimeout(
                String httpReadTimeout) {
            doSetProperty("httpReadTimeout", httpReadTimeout);
            return this;
        }
    }

    public interface BraintreeBuilders {
        /**
         * Braintree (camel-braintree)
         * Process payments using Braintree Payments.
         * 
         * Category: saas
         * Since: 2.17
         * Maven coordinates: org.apache.camel:camel-braintree
         * 
         * Syntax: <code>braintree:apiName/methodName</code>
         * 
         * Path parameter: apiName (required)
         * What kind of operation to perform
         * There are 17 enums and the value can be one of: ADD_ON, ADDRESS,
         * CLIENT_TOKEN, CREDIT_CARD_VERIFICATION, CUSTOMER, DISCOUNT, DISPUTE,
         * DOCUMENT_UPLOAD, MERCHANT_ACCOUNT, PAYMENT_METHOD,
         * PAYMENT_METHOD_NONCE, PLAN, REPORT, SETTLEMENT_BATCH_SUMMARY,
         * SUBSCRIPTION, TRANSACTION, WEBHOOK_NOTIFICATION
         * 
         * Path parameter: methodName (required)
         * What sub operation to use for the selected operation
         * There are 31 enums and the value can be one of: accept,
         * addFileEvidence, addTextEvidence, cancel, cancelRelease,
         * cloneTransaction, create, createForCurrency, credit, delete,
         * fetchMerchantAccounts, finalize, find, generate, grant, holdInEscrow,
         * parse, refund, releaseFromEscrow, removeEvidence, retryCharge,
         * revoke, sale, search, submitForPartialSettlement,
         * submitForSettlement, transactionLevelFees, update, updateDetails,
         * verify, voidTransaction
         * 
         * @param path apiName/methodName
         * @return the dsl builder
         */
        default BraintreeEndpointBuilder braintree(String path) {
            return BraintreeEndpointBuilderFactory.endpointBuilder("braintree", path);
        }
        /**
         * Braintree (camel-braintree)
         * Process payments using Braintree Payments.
         * 
         * Category: saas
         * Since: 2.17
         * Maven coordinates: org.apache.camel:camel-braintree
         * 
         * Syntax: <code>braintree:apiName/methodName</code>
         * 
         * Path parameter: apiName (required)
         * What kind of operation to perform
         * There are 17 enums and the value can be one of: ADD_ON, ADDRESS,
         * CLIENT_TOKEN, CREDIT_CARD_VERIFICATION, CUSTOMER, DISCOUNT, DISPUTE,
         * DOCUMENT_UPLOAD, MERCHANT_ACCOUNT, PAYMENT_METHOD,
         * PAYMENT_METHOD_NONCE, PLAN, REPORT, SETTLEMENT_BATCH_SUMMARY,
         * SUBSCRIPTION, TRANSACTION, WEBHOOK_NOTIFICATION
         * 
         * Path parameter: methodName (required)
         * What sub operation to use for the selected operation
         * There are 31 enums and the value can be one of: accept,
         * addFileEvidence, addTextEvidence, cancel, cancelRelease,
         * cloneTransaction, create, createForCurrency, credit, delete,
         * fetchMerchantAccounts, finalize, find, generate, grant, holdInEscrow,
         * parse, refund, releaseFromEscrow, removeEvidence, retryCharge,
         * revoke, sale, search, submitForPartialSettlement,
         * submitForSettlement, transactionLevelFees, update, updateDetails,
         * verify, voidTransaction
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path apiName/methodName
         * @return the dsl builder
         */
        default BraintreeEndpointBuilder braintree(
                String componentName,
                String path) {
            return BraintreeEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static BraintreeEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class BraintreeEndpointBuilderImpl extends AbstractEndpointBuilder implements BraintreeEndpointBuilder, AdvancedBraintreeEndpointBuilder {
            public BraintreeEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new BraintreeEndpointBuilderImpl(path);
    }
}