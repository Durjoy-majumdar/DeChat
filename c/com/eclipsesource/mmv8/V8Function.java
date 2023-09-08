package com.eclipsesource.mmv8;

public class V8Function extends V8Object {
    public V8Function(C80135V8 v8, JavaCallback javaCallback) {
        super(v8, javaCallback);
    }

    public Object call(V8Object v8Object, V8Array v8Array) {
        this.f234641v8.checkThread();
        checkReleased();
        this.f234641v8.checkRuntime(v8Object);
        this.f234641v8.checkRuntime(v8Array);
        if (v8Object == null) {
            v8Object = this.f234641v8;
        }
        long handle = v8Array == null ? 0 : v8Array.getHandle();
        if (v8Object.isUndefined()) {
            v8Object = this.f234641v8;
        }
        C80135V8 v8 = this.f234641v8;
        return v8.executeFunction(v8.getV8RuntimePtr(), v8Object.getHandle(), this.objectHandle, handle);
    }

    public V8Value createTwin() {
        return new V8Function(this.f234641v8);
    }

    public void initialize(long j, Object obj) {
        if (obj == null) {
            super.initialize(j, (Object) null);
            return;
        }
        long[] initNewV8Function = this.f234641v8.initNewV8Function(j);
        this.f234641v8.createAndRegisterMethodDescriptor((JavaCallback) obj, initNewV8Function[1]);
        this.released = false;
        addObjectReference(initNewV8Function[0]);
    }

    public String toString() {
        return (this.released || this.f234641v8.isReleased()) ? "[Function released]" : super.toString();
    }

    public V8Function(C80135V8 v8) {
        this(v8, (JavaCallback) null);
    }

    public V8Function twin() {
        return (V8Function) super.twin();
    }
}
