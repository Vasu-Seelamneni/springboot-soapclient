
package com.sws.springbootsoapclient.stub;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sws.springbootsoapclient.stub package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sws.springbootsoapclient.stub
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateAccountRequest }
     * 
     * @return
     *     the new instance of {@link CreateAccountRequest }
     */
    public CreateAccountRequest createCreateAccountRequest() {
        return new CreateAccountRequest();
    }

    /**
     * Create an instance of {@link CreateAccountResponse }
     * 
     * @return
     *     the new instance of {@link CreateAccountResponse }
     */
    public CreateAccountResponse createCreateAccountResponse() {
        return new CreateAccountResponse();
    }

    /**
     * Create an instance of {@link GetAccountBalanceRequest }
     * 
     * @return
     *     the new instance of {@link GetAccountBalanceRequest }
     */
    public GetAccountBalanceRequest createGetAccountBalanceRequest() {
        return new GetAccountBalanceRequest();
    }

    /**
     * Create an instance of {@link GetAccountBalanceResponse }
     * 
     * @return
     *     the new instance of {@link GetAccountBalanceResponse }
     */
    public GetAccountBalanceResponse createGetAccountBalanceResponse() {
        return new GetAccountBalanceResponse();
    }

}
