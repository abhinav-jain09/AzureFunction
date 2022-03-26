package com.ns.rivier.tokenvault;
import com.microsoft.azure.functions.ExecutionContext;
import com.microsoft.azure.functions.HttpMethod;
import com.microsoft.azure.functions.HttpRequestMessage;
import com.microsoft.azure.functions.annotation.AuthorizationLevel;
import com.microsoft.azure.functions.annotation.FunctionName;
import com.microsoft.azure.functions.annotation.HttpTrigger;
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
                    methods = {HttpMethod.GET},
                    authLevel = AuthorizationLevel.ANONYMOUS
            ) HttpRequestMessage<Optional<String>> request,
            ExecutionContext context) {
        context.getLogger().info("Processing a greeting request.");
         String name = request.getQueryParameters().get("name");
        name = "test";

        return handleRequest(name, context);
    }
}
