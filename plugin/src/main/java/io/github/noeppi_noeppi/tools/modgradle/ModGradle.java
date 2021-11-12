package io.github.noeppi_noeppi.tools.modgradle;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.function.Supplier;

public class ModGradle {
    
    // TODO
    //  Check for usages of gradle.api.internal
    //  Check if Files.createDirectories should use PathUtils.createParentDirectories instead

    public static final String SOURCE_TRANSFORM = "io.github.noeppi_noeppi.tools:SourceTransform:1.0.10:fatjar";

    // Target minecraft version. Acts as default
    // ModGradle can still be used with other minecraft versions
    // For example this is the fallback when using an unknown
    // version in the Versioning class
    public static final String TARGET_MINECRAFT = "1.17.1";

    // Target java version for ModGradle and external tools
    // not for the toolchain
    public static final int TARGET_JAVA = 16;

    @SuppressWarnings("TrivialFunctionalExpressionUsage")
    public static final Gson GSON = ((Supplier<Gson>) () -> {
        GsonBuilder builder = new GsonBuilder();
        builder.disableHtmlEscaping();
        builder.setLenient();
        builder.setPrettyPrinting();
        return builder.create();
    }).get();

    @SuppressWarnings("TrivialFunctionalExpressionUsage")
    public static final Gson INTERNAL = ((Supplier<Gson>) () -> {
        GsonBuilder builder = new GsonBuilder();
        builder.disableHtmlEscaping();
        return builder.create();
    }).get();
}
