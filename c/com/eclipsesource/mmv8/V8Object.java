package com.eclipsesource.mmv8;

import java.lang.reflect.Method;

public class V8Object extends V8Value {

    public static class Undefined extends V8Object {
        public V8Object add(String str, boolean z) {
            throw new UnsupportedOperationException();
        }

        public V8Object addUndefined(String str) {
            throw new UnsupportedOperationException();
        }

        public boolean contains(String str) {
            throw new UnsupportedOperationException();
        }

        public boolean equals(Object obj) {
            return (obj instanceof V8Object) && ((V8Object) obj).isUndefined();
        }

        public V8Array executeArrayFunction(String str, V8Array v8Array) {
            throw new UnsupportedOperationException();
        }

        public boolean executeBooleanFunction(String str, V8Array v8Array) {
            throw new UnsupportedOperationException();
        }

        public double executeDoubleFunction(String str, V8Array v8Array) {
            throw new UnsupportedOperationException();
        }

        public Object executeFunction(String str, V8Array v8Array) {
            throw new UnsupportedOperationException();
        }

        public int executeIntegerFunction(String str, V8Array v8Array) {
            throw new UnsupportedOperationException();
        }

        public Object executeJSFunction(String str, Object... objArr) {
            throw new UnsupportedOperationException();
        }

        public V8Object executeObjectFunction(String str, V8Array v8Array) {
            throw new UnsupportedOperationException();
        }

        public String executeStringFunction(String str, V8Array v8Array) {
            throw new UnsupportedOperationException();
        }

        public void executeVoidFunction(String str, V8Array v8Array) {
            throw new UnsupportedOperationException();
        }

        public V8Array getArray(String str) {
            throw new UnsupportedOperationException();
        }

        public boolean getBoolean(String str) {
            throw new UnsupportedOperationException();
        }

        public double getDouble(String str) {
            throw new UnsupportedOperationException();
        }

        public int getInteger(String str) {
            throw new UnsupportedOperationException();
        }

        public String[] getKeys() {
            throw new UnsupportedOperationException();
        }

        public V8Object getObject(String str) {
            throw new UnsupportedOperationException();
        }

        public C80135V8 getRuntime() {
            throw new UnsupportedOperationException();
        }

        public String getString(String str) {
            throw new UnsupportedOperationException();
        }

        public int getType(String str) {
            throw new UnsupportedOperationException();
        }

        public int hashCode() {
            return 919;
        }

        public boolean isReleased() {
            return false;
        }

        public boolean isUndefined() {
            return true;
        }

        public V8Object registerJavaMethod(JavaCallback javaCallback, String str) {
            throw new UnsupportedOperationException();
        }

        public void release() {
        }

        public V8Object setPrototype(V8Object v8Object) {
            throw new UnsupportedOperationException();
        }

        public String toString() {
            return "undefined";
        }

        public V8Object add(String str, double d) {
            throw new UnsupportedOperationException();
        }

        public V8Object registerJavaMethod(JavaVoidCallback javaVoidCallback, String str) {
            throw new UnsupportedOperationException();
        }

        public V8Object add(String str, int i) {
            throw new UnsupportedOperationException();
        }

        public V8Object registerJavaMethod(Object obj, String str, String str2, Class<?>[] clsArr, boolean z) {
            throw new UnsupportedOperationException();
        }

        public Undefined twin() {
            return (Undefined) V8Object.super.twin();
        }

        public V8Object add(String str, String str2) {
            throw new UnsupportedOperationException();
        }

        public V8Object add(String str, V8Value v8Value) {
            throw new UnsupportedOperationException();
        }
    }

    public V8Object(C80135V8 v8) {
        this(v8, (Object) null);
    }

    private void checkKey(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Key cannot be null");
        }
    }

    public V8Object add(String str, int i) {
        this.f234641v8.checkThread();
        checkReleased();
        C80135V8 v8 = this.f234641v8;
        v8.add(v8.getV8RuntimePtr(), this.objectHandle, str, i);
        return this;
    }

    public V8Object addNull(String str) {
        this.f234641v8.checkThread();
        checkReleased();
        C80135V8 v8 = this.f234641v8;
        v8.addNull(v8.getV8RuntimePtr(), this.objectHandle, str);
        return this;
    }

    public V8Object addUndefined(String str) {
        this.f234641v8.checkThread();
        checkReleased();
        C80135V8 v8 = this.f234641v8;
        v8.addUndefined(v8.getV8RuntimePtr(), this.objectHandle, str);
        return this;
    }

    public boolean contains(String str) {
        this.f234641v8.checkThread();
        checkReleased();
        checkKey(str);
        C80135V8 v8 = this.f234641v8;
        return v8.contains(v8.getV8RuntimePtr(), this.objectHandle, str);
    }

    public V8Value createTwin() {
        return new V8Object(this.f234641v8);
    }

    public V8Array executeArrayFunction(String str, V8Array v8Array) {
        this.f234641v8.checkThread();
        checkReleased();
        this.f234641v8.checkRuntime(v8Array);
        long handle = v8Array == null ? 0 : v8Array.getHandle();
        C80135V8 v8 = this.f234641v8;
        Object executeFunction = v8.executeFunction(v8.getV8RuntimePtr(), 5, this.objectHandle, str, handle);
        if (executeFunction instanceof V8Array) {
            return (V8Array) executeFunction;
        }
        throw new V8ResultUndefined();
    }

    public boolean executeBooleanFunction(String str, V8Array v8Array) {
        this.f234641v8.checkThread();
        checkReleased();
        this.f234641v8.checkRuntime(v8Array);
        long handle = v8Array == null ? 0 : v8Array.getHandle();
        C80135V8 v8 = this.f234641v8;
        return v8.executeBooleanFunction(v8.getV8RuntimePtr(), getHandle(), str, handle);
    }

    public double executeDoubleFunction(String str, V8Array v8Array) {
        this.f234641v8.checkThread();
        checkReleased();
        this.f234641v8.checkRuntime(v8Array);
        long handle = v8Array == null ? 0 : v8Array.getHandle();
        C80135V8 v8 = this.f234641v8;
        return v8.executeDoubleFunction(v8.getV8RuntimePtr(), getHandle(), str, handle);
    }

    public Object executeFunction(String str, V8Array v8Array) {
        this.f234641v8.checkThread();
        checkReleased();
        this.f234641v8.checkRuntime(v8Array);
        long handle = v8Array == null ? 0 : v8Array.getHandle();
        C80135V8 v8 = this.f234641v8;
        return v8.executeFunction(v8.getV8RuntimePtr(), 0, this.objectHandle, str, handle);
    }

    public int executeIntegerFunction(String str, V8Array v8Array) {
        this.f234641v8.checkThread();
        checkReleased();
        this.f234641v8.checkRuntime(v8Array);
        long handle = v8Array == null ? 0 : v8Array.getHandle();
        C80135V8 v8 = this.f234641v8;
        return v8.executeIntegerFunction(v8.getV8RuntimePtr(), getHandle(), str, handle);
    }

    public Object executeJSFunction(String str) {
        return executeFunction(str, (V8Array) null);
    }

    public V8Object executeObjectFunction(String str, V8Array v8Array) {
        this.f234641v8.checkThread();
        checkReleased();
        this.f234641v8.checkRuntime(v8Array);
        long handle = v8Array == null ? 0 : v8Array.getHandle();
        C80135V8 v8 = this.f234641v8;
        Object executeFunction = v8.executeFunction(v8.getV8RuntimePtr(), 6, this.objectHandle, str, handle);
        if (executeFunction instanceof V8Object) {
            return (V8Object) executeFunction;
        }
        throw new V8ResultUndefined();
    }

    public String executeStringFunction(String str, V8Array v8Array) {
        this.f234641v8.checkThread();
        checkReleased();
        this.f234641v8.checkRuntime(v8Array);
        long handle = v8Array == null ? 0 : v8Array.getHandle();
        C80135V8 v8 = this.f234641v8;
        return v8.executeStringFunction(v8.getV8RuntimePtr(), getHandle(), str, handle);
    }

    public void executeVoidFunction(String str, V8Array v8Array) {
        this.f234641v8.checkThread();
        checkReleased();
        this.f234641v8.checkRuntime(v8Array);
        long handle = v8Array == null ? 0 : v8Array.getHandle();
        C80135V8 v8 = this.f234641v8;
        v8.executeVoidFunction(v8.getV8RuntimePtr(), this.objectHandle, str, handle);
    }

    public Object get(String str) {
        this.f234641v8.checkThread();
        checkReleased();
        checkKey(str);
        C80135V8 v8 = this.f234641v8;
        return v8.get(v8.getV8RuntimePtr(), 6, this.objectHandle, str);
    }

    public V8Array getArray(String str) {
        this.f234641v8.checkThread();
        checkReleased();
        checkKey(str);
        C80135V8 v8 = this.f234641v8;
        Object obj = v8.get(v8.getV8RuntimePtr(), 5, this.objectHandle, str);
        if (obj == null || (obj instanceof V8Array)) {
            return (V8Array) obj;
        }
        throw new V8ResultUndefined();
    }

    public boolean getBoolean(String str) {
        this.f234641v8.checkThread();
        checkReleased();
        checkKey(str);
        C80135V8 v8 = this.f234641v8;
        return v8.getBoolean(v8.getV8RuntimePtr(), this.objectHandle, str);
    }

    public double getDouble(String str) {
        this.f234641v8.checkThread();
        checkReleased();
        checkKey(str);
        C80135V8 v8 = this.f234641v8;
        return v8.getDouble(v8.getV8RuntimePtr(), this.objectHandle, str);
    }

    public int getInteger(String str) {
        this.f234641v8.checkThread();
        checkReleased();
        checkKey(str);
        C80135V8 v8 = this.f234641v8;
        return v8.getInteger(v8.getV8RuntimePtr(), this.objectHandle, str);
    }

    public String[] getKeys() {
        this.f234641v8.checkThread();
        checkReleased();
        C80135V8 v8 = this.f234641v8;
        return v8.getKeys(v8.getV8RuntimePtr(), this.objectHandle);
    }

    public V8Object getObject(String str) {
        this.f234641v8.checkThread();
        checkReleased();
        checkKey(str);
        C80135V8 v8 = this.f234641v8;
        Object obj = v8.get(v8.getV8RuntimePtr(), 6, this.objectHandle, str);
        if (obj == null || (obj instanceof V8Object)) {
            return (V8Object) obj;
        }
        throw new V8ResultUndefined();
    }

    public String getString(String str) {
        this.f234641v8.checkThread();
        checkReleased();
        checkKey(str);
        C80135V8 v8 = this.f234641v8;
        return v8.getString(v8.getV8RuntimePtr(), this.objectHandle, str);
    }

    public int getType(String str) {
        this.f234641v8.checkThread();
        checkReleased();
        checkKey(str);
        C80135V8 v8 = this.f234641v8;
        return v8.getType(v8.getV8RuntimePtr(), this.objectHandle, str);
    }

    public V8Object registerJavaMethod(JavaCallback javaCallback, String str) {
        this.f234641v8.checkThread();
        checkReleased();
        this.f234641v8.registerCallback(javaCallback, getHandle(), str);
        return this;
    }

    public V8Object setPrototype(V8Object v8Object) {
        this.f234641v8.checkThread();
        checkReleased();
        C80135V8 v8 = this.f234641v8;
        v8.setPrototype(v8.getV8RuntimePtr(), this.objectHandle, v8Object.getHandle());
        return this;
    }

    public String toString() {
        if (isReleased() || this.f234641v8.isReleased()) {
            return "[Object released]";
        }
        this.f234641v8.checkThread();
        C80135V8 v8 = this.f234641v8;
        return v8.toString(v8.getV8RuntimePtr(), getHandle());
    }

    public V8Object(C80135V8 v8, Object obj) {
        super(v8);
        if (v8 != null) {
            this.f234641v8.checkThread();
            initialize(this.f234641v8.getV8RuntimePtr(), obj);
        }
    }

    public Object executeJSFunction(String str, Object... objArr) {
        if (objArr == null) {
            return executeFunction(str, (V8Array) null);
        }
        V8Array v8Array = new V8Array(this.f234641v8.getRuntime());
        try {
            for (V8Value v8Value : objArr) {
                if (v8Value == null) {
                    v8Array.pushNull();
                } else if (v8Value instanceof V8Value) {
                    v8Array.push(v8Value);
                } else if (v8Value instanceof Integer) {
                    v8Array.push((Object) (Integer) v8Value);
                } else if (v8Value instanceof Double) {
                    v8Array.push((Object) (Double) v8Value);
                } else if (v8Value instanceof Long) {
                    v8Array.push(((Long) v8Value).doubleValue());
                } else if (v8Value instanceof Float) {
                    v8Array.push((double) ((Float) v8Value).floatValue());
                } else if (v8Value instanceof Boolean) {
                    v8Array.push((Object) (Boolean) v8Value);
                } else if (v8Value instanceof String) {
                    v8Array.push((String) v8Value);
                } else {
                    throw new IllegalArgumentException("Unsupported Object of type: " + v8Value.getClass());
                }
            }
            return executeFunction(str, v8Array);
        } finally {
            v8Array.release();
        }
    }

    public V8Object twin() {
        return (V8Object) super.twin();
    }

    public V8Object add(String str, boolean z) {
        this.f234641v8.checkThread();
        checkReleased();
        C80135V8 v8 = this.f234641v8;
        v8.add(v8.getV8RuntimePtr(), this.objectHandle, str, z);
        return this;
    }

    public V8Object registerJavaMethod(JavaVoidCallback javaVoidCallback, String str) {
        this.f234641v8.checkThread();
        checkReleased();
        this.f234641v8.registerVoidCallback(javaVoidCallback, getHandle(), str);
        return this;
    }

    public V8Object() {
    }

    public V8Object add(String str, double d) {
        this.f234641v8.checkThread();
        checkReleased();
        C80135V8 v8 = this.f234641v8;
        v8.add(v8.getV8RuntimePtr(), this.objectHandle, str, d);
        return this;
    }

    public V8Object registerJavaMethod(Object obj, String str, String str2, Class<?>[] clsArr) {
        return registerJavaMethod(obj, str, str2, clsArr, false);
    }

    public V8Object registerJavaMethod(Object obj, String str, String str2, Class<?>[] clsArr, boolean z) {
        this.f234641v8.checkThread();
        checkReleased();
        try {
            Method method = obj.getClass().getMethod(str, clsArr);
            method.setAccessible(true);
            this.f234641v8.registerCallback(obj, method, getHandle(), str2, z);
            return this;
        } catch (NoSuchMethodException e) {
            throw new IllegalStateException(e);
        } catch (SecurityException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public V8Object add(String str, String str2) {
        this.f234641v8.checkThread();
        checkReleased();
        if (str2 == null) {
            C80135V8 v8 = this.f234641v8;
            v8.addNull(v8.getV8RuntimePtr(), this.objectHandle, str);
        } else if (str2.equals(C80135V8.getUndefined())) {
            C80135V8 v84 = this.f234641v8;
            v84.addUndefined(v84.getV8RuntimePtr(), this.objectHandle, str);
        } else {
            C80135V8 v85 = this.f234641v8;
            v85.add(v85.getV8RuntimePtr(), this.objectHandle, str, str2);
        }
        return this;
    }

    public V8Object add(String str, V8Value v8Value) {
        V8Value v8Value2 = v8Value;
        this.f234641v8.checkThread();
        checkReleased();
        this.f234641v8.checkRuntime(v8Value2);
        if (v8Value2 == null) {
            C80135V8 v8 = this.f234641v8;
            v8.addNull(v8.getV8RuntimePtr(), this.objectHandle, str);
        } else if (v8Value2.equals(C80135V8.getUndefined())) {
            C80135V8 v84 = this.f234641v8;
            v84.addUndefined(v84.getV8RuntimePtr(), this.objectHandle, str);
        } else {
            C80135V8 v85 = this.f234641v8;
            v85.addObject(v85.getV8RuntimePtr(), this.objectHandle, str, v8Value.getHandle());
        }
        return this;
    }
}
