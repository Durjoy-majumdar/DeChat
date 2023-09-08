package com.eclipsesource.mmv8;

public class V8TracerAccessible {
    private static volatile IV8Tracer sTracer = IV8Tracer.DUMMY;

    public static void beginSection(String str) {
        IV8Tracer iV8Tracer = sTracer;
        iV8Tracer.beginSection("J2V8#" + str);
    }

    public static void endSection() {
        sTracer.endSection();
    }

    public static void setTracer(IV8Tracer iV8Tracer) {
        sTracer = iV8Tracer;
    }
}
