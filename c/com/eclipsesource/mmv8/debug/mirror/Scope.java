package com.eclipsesource.mmv8.debug.mirror;

import com.eclipsesource.mmv8.V8Array;
import com.eclipsesource.mmv8.V8Object;
import com.eclipsesource.mmv8.V8Value;

public class Scope extends Mirror {
    private static final String SCOPE_OBJECT = "scopeObject";
    private static final String SCOPE_TYPE = "scopeType";
    private static final String SET_VARIABLE_VALUE = "setVariableValue";

    public enum ScopeType {
        Global(0),
        Local(1),
        With(2),
        Closure(3),
        Catch(4),
        Block(5),
        Script(6);
        
        public int index;

        private ScopeType(int i) {
            this.index = i;
        }
    }

    public Scope(V8Object v8Object) {
        super(v8Object);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: com.eclipsesource.mmv8.V8Array} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: com.eclipsesource.mmv8.V8Array} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: com.eclipsesource.mmv8.V8Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: com.eclipsesource.mmv8.V8Array} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.eclipsesource.mmv8.debug.mirror.ObjectMirror getScopeObject() {
        /*
            r3 = this;
            r0 = 0
            com.eclipsesource.mmv8.V8Object r1 = r3.v8Object     // Catch:{ all -> 0x0016 }
            java.lang.String r2 = "scopeObject"
            com.eclipsesource.mmv8.V8Object r0 = r1.executeObjectFunction(r2, r0)     // Catch:{ all -> 0x0016 }
            com.eclipsesource.mmv8.debug.mirror.ValueMirror r1 = com.eclipsesource.mmv8.debug.mirror.Mirror.createMirror(r0)     // Catch:{ all -> 0x0016 }
            com.eclipsesource.mmv8.debug.mirror.ObjectMirror r1 = (com.eclipsesource.mmv8.debug.mirror.ObjectMirror) r1     // Catch:{ all -> 0x0016 }
            if (r0 == 0) goto L_0x0015
            r0.release()
        L_0x0015:
            return r1
        L_0x0016:
            r1 = move-exception
            if (r0 == 0) goto L_0x001c
            r0.release()
        L_0x001c:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.eclipsesource.mmv8.debug.mirror.Scope.getScopeObject():com.eclipsesource.mmv8.debug.mirror.ObjectMirror");
    }

    public ScopeType getType() {
        return ScopeType.values()[this.v8Object.executeIntegerFunction(SCOPE_TYPE, (V8Array) null)];
    }

    public void setVariableValue(String str, int i) {
        V8Array v8Array = new V8Array(this.v8Object.getRuntime());
        v8Array.push(str);
        v8Array.push(i);
        try {
            this.v8Object.executeVoidFunction(SET_VARIABLE_VALUE, v8Array);
        } finally {
            v8Array.release();
        }
    }

    public void setVariableValue(String str, V8Value v8Value) {
        V8Array v8Array = new V8Array(this.v8Object.getRuntime());
        v8Array.push(str);
        v8Array.push(v8Value);
        try {
            this.v8Object.executeVoidFunction(SET_VARIABLE_VALUE, v8Array);
        } finally {
            v8Array.release();
        }
    }

    public void setVariableValue(String str, boolean z) {
        V8Array v8Array = new V8Array(this.v8Object.getRuntime());
        v8Array.push(str);
        v8Array.push(z);
        try {
            this.v8Object.executeVoidFunction(SET_VARIABLE_VALUE, v8Array);
        } finally {
            v8Array.release();
        }
    }

    public void setVariableValue(String str, String str2) {
        V8Array v8Array = new V8Array(this.v8Object.getRuntime());
        v8Array.push(str);
        v8Array.push(str2);
        try {
            this.v8Object.executeVoidFunction(SET_VARIABLE_VALUE, v8Array);
        } finally {
            v8Array.release();
        }
    }

    public void setVariableValue(String str, double d) {
        V8Array v8Array = new V8Array(this.v8Object.getRuntime());
        v8Array.push(str);
        v8Array.push(d);
        try {
            this.v8Object.executeVoidFunction(SET_VARIABLE_VALUE, v8Array);
        } finally {
            v8Array.release();
        }
    }
}
