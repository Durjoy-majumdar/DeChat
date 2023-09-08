package com.eclipsesource.mmv8;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.nio.ByteBuffer;
import java.util.ArrayList;

class V8ContextWrapper implements InvocationHandler {
    private static final String TAG = "V8ContextWrapper";
    /* access modifiers changed from: private */
    public final MultiContextV8 multiContextV8;
    private final V8Context proxy = ((V8Context) Proxy.newProxyInstance(V8ContextWrapper.class.getClassLoader(), new Class[]{V8Context.class}, this));
    private final V8ContextImpl v8ContextImpl;
    private final long v8ContextPtr;

    public final class V8ContextImpl extends V8Object implements V8Context {
        private final long ptr;

        public V8ContextImpl(long j) {
            super(V8ContextWrapper.this.multiContextV8.getV8());
            this.objectHandle = this.f234641v8.getGlobalObject();
            this.ptr = j;
        }

        private void shareObjectImpl(String str, V8Context v8Context, String str2) {
            checkReleased();
            this.f234641v8.checkThread();
            if (str != null && !str.isEmpty() && v8Context != null) {
                V8Object object = getObject(str);
                if (str2 != null && !str2.isEmpty()) {
                    str = str2;
                }
                v8Context.add(str, (V8Value) object);
                object.release();
            }
        }

        public Object batchExecuteScripts(ArrayList<V8ScriptEvaluateRequest> arrayList, String str, ExecuteDetails executeDetails) {
            return this.f234641v8.batchExecuteScripts(arrayList, str, executeDetails);
        }

        public V8Array executeArrayScript(String str, ExecuteDetails executeDetails) {
            return this.f234641v8.executeArrayScript(str, (String) null, 0, (String) null, (String) null, 0, executeDetails);
        }

        public boolean executeBooleanScript(String str, ExecuteDetails executeDetails) {
            return this.f234641v8.executeBooleanScript(str, (String) null, 0, (String) null, (String) null, 0, executeDetails);
        }

        public String executeDebugScript(String str, String str2) {
            return this.f234641v8.executeDebugScript(str, str2);
        }

        public double executeDoubleScript(String str, ExecuteDetails executeDetails) {
            return this.f234641v8.executeDoubleScript(str, (String) null, 0, (String) null, (String) null, 0, executeDetails);
        }

        public Object executeFileScript(V8ScriptFileDescriptor v8ScriptFileDescriptor, String str, int i, String str2, String str3, int i2, ExecuteDetails executeDetails) {
            return this.f234641v8.executeFileScript(v8ScriptFileDescriptor, str, i, str2, str3, i2, executeDetails);
        }

        public int executeIntegerScript(String str, ExecuteDetails executeDetails) {
            return this.f234641v8.executeIntegerScript(str, (String) null, 0, (String) null, (String) null, 0, executeDetails);
        }

        public V8Object executeObjectScript(String str, ExecuteDetails executeDetails) {
            return this.f234641v8.executeObjectScript(str, (String) null, 0, (String) null, (String) null, 0, executeDetails);
        }

        public Object executeScript(String str, ExecuteDetails executeDetails) {
            return this.f234641v8.executeScript(str, (String) null, 0, (String) null, (String) null, 0, executeDetails);
        }

        public String executeStringScript(String str, ExecuteDetails executeDetails) {
            return this.f234641v8.executeStringScript(str, (String) null, 0, (String) null, (String) null, 0, executeDetails);
        }

        public void executeVoidScript(String str, ExecuteDetails executeDetails) {
            this.f234641v8.executeVoidScript(str, (String) null, 0, (String) null, (String) null, 0, executeDetails);
        }

        public V8Object getGlobalObject() {
            return this;
        }

        public long getPtr() {
            return this.ptr;
        }

        public SharedV8ArrayBuffer newSharedV8ArrayBuffer(ByteBuffer byteBuffer) {
            return new SharedV8ArrayBuffer(this.f234641v8, byteBuffer);
        }

        public V8Array newV8Array() {
            return new V8Array(this.f234641v8);
        }

        public V8ArrayBuffer newV8ArrayBuffer(int i) {
            return new V8ArrayBuffer(this.f234641v8, i);
        }

        public V8Function newV8Function(JavaCallback javaCallback) {
            return new V8Function(this.f234641v8, javaCallback);
        }

        public V8Object newV8Object() {
            return new V8Object(this.f234641v8);
        }

        public V8TypedArray newV8TypedArray(V8ArrayBuffer v8ArrayBuffer, int i, int i2, int i3) {
            return new V8TypedArray(this.f234641v8, v8ArrayBuffer, i, i2, i3);
        }

        public void release() {
            if (!isReleased()) {
                this.f234641v8.releaseObjRef(this);
                V8ContextWrapper.this.multiContextV8.releaseContext(V8ContextWrapper.this);
                this.released = true;
            }
        }

        public void shareObject(String str, V8Context v8Context) {
            shareObjectImpl(str, v8Context, (String) null);
        }

        public V8Array executeArrayScript(String str, String str2, int i, ExecuteDetails executeDetails) {
            return this.f234641v8.executeArrayScript(str, str2, i, (String) null, (String) null, 0, executeDetails);
        }

        public boolean executeBooleanScript(String str, String str2, int i, ExecuteDetails executeDetails) {
            return this.f234641v8.executeBooleanScript(str, str2, i, (String) null, (String) null, 0, executeDetails);
        }

        public double executeDoubleScript(String str, String str2, int i, ExecuteDetails executeDetails) {
            return this.f234641v8.executeDoubleScript(str, str2, i, (String) null, (String) null, 0, executeDetails);
        }

        public int executeIntegerScript(String str, String str2, int i, ExecuteDetails executeDetails) {
            return this.f234641v8.executeIntegerScript(str, str2, i, (String) null, (String) null, 0, executeDetails);
        }

        public V8Object executeObjectScript(String str, String str2, int i, ExecuteDetails executeDetails) {
            return this.f234641v8.executeObjectScript(str, str2, i, (String) null, (String) null, 0, executeDetails);
        }

        public Object executeScript(String str, String str2, int i, ExecuteDetails executeDetails) {
            return this.f234641v8.executeScript(str, str2, i, (String) null, (String) null, 0, executeDetails);
        }

        public String executeStringScript(String str, String str2, int i, ExecuteDetails executeDetails) {
            return this.f234641v8.executeStringScript(str, str2, i, (String) null, (String) null, 0, executeDetails);
        }

        public void executeVoidScript(String str, String str2, int i, ExecuteDetails executeDetails) {
            this.f234641v8.executeVoidScript(str, str2, i, (String) null, (String) null, 0, executeDetails);
        }

        public V8ArrayBuffer newV8ArrayBuffer(ByteBuffer byteBuffer) {
            return new V8ArrayBuffer(this.f234641v8, byteBuffer);
        }

        public void shareObject(String str, V8Context v8Context, String str2) {
            shareObjectImpl(str, v8Context, str2);
        }

        public V8Array executeArrayScript(String str, String str2, int i, String str3, String str4, int i2, ExecuteDetails executeDetails) {
            return this.f234641v8.executeArrayScript(str, str2, i, str3, str4, i2, executeDetails);
        }

        public boolean executeBooleanScript(String str, String str2, int i, String str3, String str4, int i2, ExecuteDetails executeDetails) {
            return this.f234641v8.executeBooleanScript(str, str2, i, str3, str4, i2, executeDetails);
        }

        public double executeDoubleScript(String str, String str2, int i, String str3, String str4, int i2, ExecuteDetails executeDetails) {
            return this.f234641v8.executeDoubleScript(str, str2, i, str3, str4, i2, executeDetails);
        }

        public int executeIntegerScript(String str, String str2, int i, String str3, String str4, int i2, ExecuteDetails executeDetails) {
            return this.f234641v8.executeIntegerScript(str, str2, i, str3, str4, i2, executeDetails);
        }

        public V8Object executeObjectScript(String str, String str2, int i, String str3, String str4, int i2, ExecuteDetails executeDetails) {
            return this.f234641v8.executeObjectScript(str, str2, i, str3, str4, i2, executeDetails);
        }

        public Object executeScript(String str, String str2, int i, String str3, String str4, int i2, ExecuteDetails executeDetails) {
            return this.f234641v8.executeScript(str, str2, i, str3, str4, i2, executeDetails);
        }

        public String executeStringScript(String str, String str2, int i, String str3, String str4, int i2, ExecuteDetails executeDetails) {
            return this.f234641v8.executeStringScript(str, str2, i, str3, str4, i2, executeDetails);
        }

        public void executeVoidScript(String str, String str2, int i, String str3, String str4, int i2, ExecuteDetails executeDetails) {
            this.f234641v8.executeVoidScript(str, str2, i, str3, str4, i2, executeDetails);
        }
    }

    public V8ContextWrapper(MultiContextV8 multiContextV82, long j) {
        this.multiContextV8 = multiContextV82;
        this.v8ContextPtr = j;
        enterContext();
        this.v8ContextImpl = new V8ContextImpl(j);
    }

    private void enterContext() {
        this.multiContextV8.enterContext(this);
    }

    public V8Context context() {
        return this.proxy;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.v8ContextPtr == ((V8ContextWrapper) obj).v8ContextPtr;
    }

    public long getPtr() {
        return this.v8ContextPtr;
    }

    public int hashCode() {
        long j = this.v8ContextPtr;
        return (int) (j ^ (j >>> 32));
    }

    public Object invoke(Object obj, Method method, Object[] objArr) {
        if (!method.getName().equals("isReleased")) {
            this.v8ContextImpl.checkReleased();
            enterContext();
        }
        try {
            return method.invoke(this.v8ContextImpl, objArr);
        } catch (InvocationTargetException e) {
            throw e.getCause();
        }
    }
}
