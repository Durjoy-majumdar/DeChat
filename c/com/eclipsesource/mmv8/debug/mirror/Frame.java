package com.eclipsesource.mmv8.debug.mirror;

import com.eclipsesource.mmv8.V8Array;
import com.eclipsesource.mmv8.V8Object;

public class Frame extends Mirror {
    private static final String ARGUMENT_COUNT = "argumentCount";
    private static final String ARGUMENT_NAME = "argumentName";
    private static final String ARGUMENT_VALUE = "argumentValue";
    private static final String COLUMN = "column";
    private static final String FUNC = "func";
    private static final String LINE = "line";
    private static final String LOCAL_COUNT = "localCount";
    private static final String LOCAL_NAME = "localName";
    private static final String LOCAL_VALUE = "localValue";
    private static final String NAME = "name";
    private static final String POSITION = "position";
    private static final String SCOPE = "scope";
    private static final String SCOPE_COUNT = "scopeCount";
    private static final String SCRIPT = "script";
    private static final String SOURCE_LOCATION = "sourceLocation";
    private static final String SOURCE_TEXT = "sourceText";

    public Frame(V8Object v8Object) {
        super(v8Object);
    }

    public int getArgumentCount() {
        return this.v8Object.executeIntegerFunction(ARGUMENT_COUNT, (V8Array) null);
    }

    public String getArgumentName(int i) {
        V8Array v8Array = new V8Array(this.v8Object.getRuntime());
        v8Array.push(i);
        try {
            return this.v8Object.executeStringFunction(ARGUMENT_NAME, v8Array);
        } finally {
            v8Array.release();
        }
    }

    public ValueMirror getArgumentValue(int i) {
        V8Array v8Array = new V8Array(this.v8Object.getRuntime());
        v8Array.push(i);
        V8Object v8Object = null;
        try {
            v8Object = this.v8Object.executeObjectFunction(ARGUMENT_VALUE, v8Array);
            if (Mirror.isValue(v8Object)) {
                return new ValueMirror(v8Object);
            }
            throw new IllegalStateException("Argument value is not a ValueMirror");
        } finally {
            v8Array.release();
            if (v8Object != null) {
                v8Object.release();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: com.eclipsesource.mmv8.V8Array} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: com.eclipsesource.mmv8.V8Array} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: com.eclipsesource.mmv8.V8Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: com.eclipsesource.mmv8.V8Array} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.eclipsesource.mmv8.debug.mirror.FunctionMirror getFunction() {
        /*
            r3 = this;
            r0 = 0
            com.eclipsesource.mmv8.V8Object r1 = r3.v8Object     // Catch:{ all -> 0x0014 }
            java.lang.String r2 = "func"
            com.eclipsesource.mmv8.V8Object r0 = r1.executeObjectFunction(r2, r0)     // Catch:{ all -> 0x0014 }
            com.eclipsesource.mmv8.debug.mirror.FunctionMirror r1 = new com.eclipsesource.mmv8.debug.mirror.FunctionMirror     // Catch:{ all -> 0x0014 }
            r1.<init>(r0)     // Catch:{ all -> 0x0014 }
            if (r0 == 0) goto L_0x0013
            r0.release()
        L_0x0013:
            return r1
        L_0x0014:
            r1 = move-exception
            if (r0 == 0) goto L_0x001a
            r0.release()
        L_0x001a:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.eclipsesource.mmv8.debug.mirror.Frame.getFunction():com.eclipsesource.mmv8.debug.mirror.FunctionMirror");
    }

    public int getLocalCount() {
        return this.v8Object.executeIntegerFunction(LOCAL_COUNT, (V8Array) null);
    }

    public String getLocalName(int i) {
        V8Array v8Array = new V8Array(this.v8Object.getRuntime());
        v8Array.push(i);
        try {
            return this.v8Object.executeStringFunction(LOCAL_NAME, v8Array);
        } finally {
            v8Array.release();
        }
    }

    public ValueMirror getLocalValue(int i) {
        V8Array v8Array = new V8Array(this.v8Object.getRuntime());
        v8Array.push(i);
        V8Object v8Object = null;
        try {
            v8Object = this.v8Object.executeObjectFunction(LOCAL_VALUE, v8Array);
            if (Mirror.isValue(v8Object)) {
                return Mirror.createMirror(v8Object);
            }
            throw new IllegalStateException("Local value is not a ValueMirror");
        } finally {
            v8Array.release();
            if (v8Object != null) {
                v8Object.release();
            }
        }
    }

    public Scope getScope(int i) {
        V8Array v8Array = new V8Array(this.v8Object.getRuntime());
        v8Array.push(i);
        V8Object v8Object = null;
        try {
            v8Object = this.v8Object.executeObjectFunction(SCOPE, v8Array);
            return new Scope(v8Object);
        } finally {
            v8Array.release();
            if (v8Object != null) {
                v8Object.release();
            }
        }
    }

    public int getScopeCount() {
        return this.v8Object.executeIntegerFunction(SCOPE_COUNT, (V8Array) null);
    }

    public SourceLocation getSourceLocation() {
        String str = null;
        V8Object executeObjectFunction = this.v8Object.executeObjectFunction(SOURCE_LOCATION, (V8Array) null);
        FunctionMirror function = getFunction();
        String scriptName = function.getScriptName();
        try {
            V8Object v8Object = (V8Object) executeObjectFunction.get(SCRIPT);
            if (v8Object != null) {
                str = v8Object.getString("name");
                v8Object.release();
            }
            if (str != null || scriptName == null) {
                scriptName = "undefined";
            }
            return new SourceLocation(scriptName, executeObjectFunction.getInteger(POSITION), executeObjectFunction.getInteger(LINE), executeObjectFunction.getInteger(COLUMN), executeObjectFunction.getString(SOURCE_TEXT));
        } finally {
            function.release();
            executeObjectFunction.release();
        }
    }

    public boolean isFrame() {
        return true;
    }
}
