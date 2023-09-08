package com.eclipsesource.mmv8;

public class V8Array extends V8Object {

    public static class Undefined extends V8Array {
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

        public int executeIntegerFunction(String str, V8Array v8Array) {
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

        public Object get(int i) {
            throw new UnsupportedOperationException();
        }

        public V8Array getArray(String str) {
            throw new UnsupportedOperationException();
        }

        public boolean getBoolean(String str) {
            throw new UnsupportedOperationException();
        }

        public boolean[] getBooleans(int i, int i2) {
            throw new UnsupportedOperationException();
        }

        public byte getByte(int i) {
            throw new UnsupportedOperationException();
        }

        public byte[] getBytes(int i, int i2) {
            throw new UnsupportedOperationException();
        }

        public double getDouble(String str) {
            throw new UnsupportedOperationException();
        }

        public double[] getDoubles(int i, int i2) {
            throw new UnsupportedOperationException();
        }

        public int getInteger(String str) {
            throw new UnsupportedOperationException();
        }

        public int[] getIntegers(int i, int i2) {
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

        public String[] getStrings(int i, int i2) {
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

        public int length() {
            throw new UnsupportedOperationException();
        }

        public V8Array push(boolean z) {
            throw new UnsupportedOperationException();
        }

        public V8Array pushUndefined() {
            throw new UnsupportedOperationException();
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

        public V8Array getArray(int i) {
            throw new UnsupportedOperationException();
        }

        public boolean getBoolean(int i) {
            throw new UnsupportedOperationException();
        }

        public int getBooleans(int i, int i2, boolean[] zArr) {
            throw new UnsupportedOperationException();
        }

        public int getBytes(int i, int i2, byte[] bArr) {
            throw new UnsupportedOperationException();
        }

        public double getDouble(int i) {
            throw new UnsupportedOperationException();
        }

        public int getDoubles(int i, int i2, double[] dArr) {
            throw new UnsupportedOperationException();
        }

        public int getInteger(int i) {
            throw new UnsupportedOperationException();
        }

        public int getIntegers(int i, int i2, int[] iArr) {
            throw new UnsupportedOperationException();
        }

        public V8Object getObject(int i) {
            throw new UnsupportedOperationException();
        }

        public String getString(int i) {
            throw new UnsupportedOperationException();
        }

        public int getStrings(int i, int i2, String[] strArr) {
            throw new UnsupportedOperationException();
        }

        public int getType() {
            throw new UnsupportedOperationException();
        }

        public V8Array push(double d) {
            throw new UnsupportedOperationException();
        }

        public V8Object registerJavaMethod(JavaVoidCallback javaVoidCallback, String str) {
            throw new UnsupportedOperationException();
        }

        public V8Object add(String str, int i) {
            throw new UnsupportedOperationException();
        }

        public int getType(int i) {
            throw new UnsupportedOperationException();
        }

        public V8Array push(int i) {
            throw new UnsupportedOperationException();
        }

        public V8Object registerJavaMethod(Object obj, String str, String str2, Class<?>[] clsArr, boolean z) {
            throw new UnsupportedOperationException();
        }

        public V8Object add(String str, String str2) {
            throw new UnsupportedOperationException();
        }

        public int getType(int i, int i2) {
            throw new UnsupportedOperationException();
        }

        public V8Array push(String str) {
            throw new UnsupportedOperationException();
        }

        public Undefined twin() {
            return (Undefined) V8Array.super.twin();
        }

        public V8Object add(String str, V8Value v8Value) {
            throw new UnsupportedOperationException();
        }

        public V8Array push(V8Value v8Value) {
            throw new UnsupportedOperationException();
        }
    }

    public V8Array() {
    }

    public V8Value createTwin() {
        return new V8Array(this.f234641v8);
    }

    public Object get(int i) {
        this.f234641v8.checkThread();
        checkReleased();
        C80135V8 v8 = this.f234641v8;
        return v8.arrayGet(v8.getV8RuntimePtr(), 6, this.objectHandle, i);
    }

    public V8Array getArray(int i) {
        this.f234641v8.checkThread();
        checkReleased();
        C80135V8 v8 = this.f234641v8;
        Object arrayGet = v8.arrayGet(v8.getV8RuntimePtr(), 5, this.objectHandle, i);
        if (arrayGet == null || (arrayGet instanceof V8Array)) {
            return (V8Array) arrayGet;
        }
        throw new V8ResultUndefined();
    }

    public boolean getBoolean(int i) {
        this.f234641v8.checkThread();
        checkReleased();
        C80135V8 v8 = this.f234641v8;
        return v8.arrayGetBoolean(v8.getV8RuntimePtr(), getHandle(), i);
    }

    public boolean[] getBooleans(int i, int i2) {
        this.f234641v8.checkThread();
        checkReleased();
        C80135V8 v8 = this.f234641v8;
        return v8.arrayGetBooleans(v8.getV8RuntimePtr(), getHandle(), i, i2);
    }

    public byte getByte(int i) {
        this.f234641v8.checkThread();
        checkReleased();
        C80135V8 v8 = this.f234641v8;
        return v8.arrayGetByte(v8.getV8RuntimePtr(), getHandle(), i);
    }

    public byte[] getBytes(int i, int i2) {
        this.f234641v8.checkThread();
        checkReleased();
        C80135V8 v8 = this.f234641v8;
        return v8.arrayGetBytes(v8.getV8RuntimePtr(), getHandle(), i, i2);
    }

    public double getDouble(int i) {
        this.f234641v8.checkThread();
        checkReleased();
        C80135V8 v8 = this.f234641v8;
        return v8.arrayGetDouble(v8.getV8RuntimePtr(), getHandle(), i);
    }

    public double[] getDoubles(int i, int i2) {
        this.f234641v8.checkThread();
        checkReleased();
        C80135V8 v8 = this.f234641v8;
        return v8.arrayGetDoubles(v8.getV8RuntimePtr(), getHandle(), i, i2);
    }

    public int getInteger(int i) {
        this.f234641v8.checkThread();
        checkReleased();
        C80135V8 v8 = this.f234641v8;
        return v8.arrayGetInteger(v8.getV8RuntimePtr(), getHandle(), i);
    }

    public int[] getIntegers(int i, int i2) {
        this.f234641v8.checkThread();
        checkReleased();
        C80135V8 v8 = this.f234641v8;
        return v8.arrayGetIntegers(v8.getV8RuntimePtr(), getHandle(), i, i2);
    }

    public V8Object getObject(int i) {
        this.f234641v8.checkThread();
        checkReleased();
        C80135V8 v8 = this.f234641v8;
        Object arrayGet = v8.arrayGet(v8.getV8RuntimePtr(), 6, this.objectHandle, i);
        if (arrayGet == null || (arrayGet instanceof V8Object)) {
            return (V8Object) arrayGet;
        }
        throw new V8ResultUndefined();
    }

    public String getString(int i) {
        this.f234641v8.checkThread();
        checkReleased();
        C80135V8 v8 = this.f234641v8;
        return v8.arrayGetString(v8.getV8RuntimePtr(), getHandle(), i);
    }

    public String[] getStrings(int i, int i2) {
        this.f234641v8.checkThread();
        checkReleased();
        C80135V8 v8 = this.f234641v8;
        return v8.arrayGetStrings(v8.getV8RuntimePtr(), getHandle(), i, i2);
    }

    public int getType(int i) {
        this.f234641v8.checkThread();
        checkReleased();
        C80135V8 v8 = this.f234641v8;
        return v8.getType(v8.getV8RuntimePtr(), getHandle(), i);
    }

    public void initialize(long j, Object obj) {
        long initNewV8Array = this.f234641v8.initNewV8Array(j);
        this.released = false;
        addObjectReference(initNewV8Array);
    }

    public int length() {
        this.f234641v8.checkThread();
        checkReleased();
        C80135V8 v8 = this.f234641v8;
        return v8.arrayGetSize(v8.getV8RuntimePtr(), getHandle());
    }

    public V8Array push(int i) {
        this.f234641v8.checkThread();
        checkReleased();
        C80135V8 v8 = this.f234641v8;
        v8.addArrayIntItem(v8.getV8RuntimePtr(), getHandle(), i);
        return this;
    }

    public V8Array pushNull() {
        this.f234641v8.checkThread();
        checkReleased();
        C80135V8 v8 = this.f234641v8;
        v8.addArrayNullItem(v8.getV8RuntimePtr(), getHandle());
        return this;
    }

    public V8Array pushUndefined() {
        this.f234641v8.checkThread();
        checkReleased();
        C80135V8 v8 = this.f234641v8;
        v8.addArrayUndefinedItem(v8.getV8RuntimePtr(), getHandle());
        return this;
    }

    public String toString() {
        return (this.released || this.f234641v8.isReleased()) ? "[Array released]" : super.toString();
    }

    public V8Array(C80135V8 v8) {
        super(v8);
        v8.checkThread();
    }

    public V8Array twin() {
        return (V8Array) super.twin();
    }

    public V8Array(C80135V8 v8, Object obj) {
        super(v8, obj);
    }

    public int getBooleans(int i, int i2, boolean[] zArr) {
        this.f234641v8.checkThread();
        checkReleased();
        if (i2 <= zArr.length) {
            C80135V8 v8 = this.f234641v8;
            return v8.arrayGetBooleans(v8.getV8RuntimePtr(), getHandle(), i, i2, zArr);
        }
        throw new IndexOutOfBoundsException();
    }

    public int getBytes(int i, int i2, byte[] bArr) {
        this.f234641v8.checkThread();
        checkReleased();
        if (i2 <= bArr.length) {
            C80135V8 v8 = this.f234641v8;
            return v8.arrayGetBytes(v8.getV8RuntimePtr(), getHandle(), i, i2, bArr);
        }
        throw new IndexOutOfBoundsException();
    }

    public int getDoubles(int i, int i2, double[] dArr) {
        this.f234641v8.checkThread();
        checkReleased();
        if (i2 <= dArr.length) {
            C80135V8 v8 = this.f234641v8;
            return v8.arrayGetDoubles(v8.getV8RuntimePtr(), getHandle(), i, i2, dArr);
        }
        throw new IndexOutOfBoundsException();
    }

    public int getIntegers(int i, int i2, int[] iArr) {
        this.f234641v8.checkThread();
        checkReleased();
        if (i2 <= iArr.length) {
            C80135V8 v8 = this.f234641v8;
            return v8.arrayGetIntegers(v8.getV8RuntimePtr(), getHandle(), i, i2, iArr);
        }
        throw new IndexOutOfBoundsException();
    }

    public int getStrings(int i, int i2, String[] strArr) {
        this.f234641v8.checkThread();
        checkReleased();
        if (i2 <= strArr.length) {
            C80135V8 v8 = this.f234641v8;
            return v8.arrayGetStrings(v8.getV8RuntimePtr(), getHandle(), i, i2, strArr);
        }
        throw new IndexOutOfBoundsException();
    }

    public int getType() {
        this.f234641v8.checkThread();
        checkReleased();
        C80135V8 v8 = this.f234641v8;
        return v8.getArrayType(v8.getV8RuntimePtr(), getHandle());
    }

    public V8Array push(boolean z) {
        this.f234641v8.checkThread();
        checkReleased();
        C80135V8 v8 = this.f234641v8;
        v8.addArrayBooleanItem(v8.getV8RuntimePtr(), getHandle(), z);
        return this;
    }

    public int getType(int i, int i2) {
        this.f234641v8.checkThread();
        checkReleased();
        C80135V8 v8 = this.f234641v8;
        return v8.getType(v8.getV8RuntimePtr(), getHandle(), i, i2);
    }

    public V8Array push(double d) {
        this.f234641v8.checkThread();
        checkReleased();
        C80135V8 v8 = this.f234641v8;
        v8.addArrayDoubleItem(v8.getV8RuntimePtr(), getHandle(), d);
        return this;
    }

    public V8Array push(String str) {
        this.f234641v8.checkThread();
        checkReleased();
        if (str == null) {
            C80135V8 v8 = this.f234641v8;
            v8.addArrayNullItem(v8.getV8RuntimePtr(), getHandle());
        } else if (str.equals(C80135V8.getUndefined())) {
            C80135V8 v84 = this.f234641v8;
            v84.addArrayUndefinedItem(v84.getV8RuntimePtr(), getHandle());
        } else {
            C80135V8 v85 = this.f234641v8;
            v85.addArrayStringItem(v85.getV8RuntimePtr(), getHandle(), str);
        }
        return this;
    }

    public V8Array push(V8Value v8Value) {
        this.f234641v8.checkThread();
        checkReleased();
        this.f234641v8.checkRuntime(v8Value);
        if (v8Value == null) {
            C80135V8 v8 = this.f234641v8;
            v8.addArrayNullItem(v8.getV8RuntimePtr(), getHandle());
        } else if (v8Value.equals(C80135V8.getUndefined())) {
            C80135V8 v84 = this.f234641v8;
            v84.addArrayUndefinedItem(v84.getV8RuntimePtr(), getHandle());
        } else {
            C80135V8 v85 = this.f234641v8;
            v85.addArrayObjectItem(v85.getV8RuntimePtr(), getHandle(), v8Value.getHandle());
        }
        return this;
    }

    public V8Array push(Object obj) {
        this.f234641v8.checkThread();
        checkReleased();
        if (obj instanceof V8Value) {
            this.f234641v8.checkRuntime((V8Value) obj);
        }
        if (obj == null) {
            C80135V8 v8 = this.f234641v8;
            v8.addArrayNullItem(v8.getV8RuntimePtr(), getHandle());
        } else if (obj.equals(C80135V8.getUndefined())) {
            C80135V8 v84 = this.f234641v8;
            v84.addArrayUndefinedItem(v84.getV8RuntimePtr(), getHandle());
        } else if (obj instanceof Double) {
            C80135V8 v85 = this.f234641v8;
            v85.addArrayDoubleItem(v85.getV8RuntimePtr(), getHandle(), ((Double) obj).doubleValue());
        } else if (obj instanceof Integer) {
            C80135V8 v86 = this.f234641v8;
            v86.addArrayIntItem(v86.getV8RuntimePtr(), getHandle(), ((Integer) obj).intValue());
        } else if (obj instanceof Float) {
            C80135V8 v87 = this.f234641v8;
            v87.addArrayDoubleItem(v87.getV8RuntimePtr(), getHandle(), ((Float) obj).doubleValue());
        } else if (obj instanceof Number) {
            C80135V8 v88 = this.f234641v8;
            v88.addArrayDoubleItem(v88.getV8RuntimePtr(), getHandle(), ((Number) obj).doubleValue());
        } else if (obj instanceof Boolean) {
            C80135V8 v89 = this.f234641v8;
            v89.addArrayBooleanItem(v89.getV8RuntimePtr(), getHandle(), ((Boolean) obj).booleanValue());
        } else if (obj instanceof String) {
            C80135V8 v810 = this.f234641v8;
            v810.addArrayStringItem(v810.getV8RuntimePtr(), getHandle(), (String) obj);
        } else if (obj instanceof V8Value) {
            C80135V8 v811 = this.f234641v8;
            v811.addArrayObjectItem(v811.getV8RuntimePtr(), getHandle(), ((V8Value) obj).getHandle());
        } else {
            throw new IllegalArgumentException();
        }
        return this;
    }
}
