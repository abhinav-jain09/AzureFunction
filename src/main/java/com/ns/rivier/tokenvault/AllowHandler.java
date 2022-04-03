package com.ns.rivier.tokenvault;
import com.google.gson.Gson;
import com.microsoft.azure.functions.ExecutionContext;
import com.microsoft.azure.functions.HttpMethod;
import com.microsoft.azure.functions.HttpRequestMessage;
import com.microsoft.azure.functions.annotation.AuthorizationLevel;
import com.microsoft.azure.functions.annotation.FunctionName;
import com.microsoft.azure.functions.annotation.HttpTrigger;
import com.ns.rivier.tokenvault.Entity.AllowList;
import com.ns.rivier.tokenvault.request.AllowRequest;
import org.springframework.cloud.function.adapter.azure.FunctionInvoker;

import java.util.Optional;

/**
 * AllowHandler
 * <br>
 * <code>com.ns.rivier.tokenvault.AllowHandler</code>
 * <br>
 *
 * @author Abhinav Jain
 * @since 22 March 2022
 */
public class AllowHandler extends FunctionInvoker<String, String>{

    @FunctionName("hello")
    public String execute(
            @HttpTrigger(
                    name = "request",
                    methods = {HttpMethod.POST},
                    authLevel = AuthorizationLevel.ANONYMOUS
            ) HttpRequestMessage<Optional<String>> request,
            ExecutionContext context) {
        context.getLogger().info("input json string " + request.getBody());
         String inputJson = request.getBody().get();

        AllowList allowList = new Gson().fromJson(inputJson, AllowList.class);
        context.getLogger().info("mapped object in to string" + allowList.toString());

        return handleRequest(allowList.getServices().toString(), context);
    }
}
