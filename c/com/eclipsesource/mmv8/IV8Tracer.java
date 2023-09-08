package com.eclipsesource.mmv8;

public interface IV8Tracer {
    public static final IV8Tracer DUMMY = new IV8Tracer() {
        public void beginSection(String str) {
        }

        public void endSection() {
        }
    };

    void beginSection(String str);

    void endSection();
}
