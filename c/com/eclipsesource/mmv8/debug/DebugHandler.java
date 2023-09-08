package com.eclipsesource.mmv8.debug;

import com.eclipsesource.mmv8.C80135V8;
import com.eclipsesource.mmv8.JavaVoidCallback;
import com.eclipsesource.mmv8.Releasable;
import com.eclipsesource.mmv8.V8Array;
import com.eclipsesource.mmv8.V8Function;
import com.eclipsesource.mmv8.V8Object;
import com.eclipsesource.mmv8.V8Value;
import java.util.ArrayList;
import java.util.List;

public class DebugHandler implements Releasable {
    private static final String CHANGE_BREAK_POINT_CONDITION = "changeBreakPointCondition";
    private static final String CLEAR_BREAK_POINT = "clearBreakPoint";
    private static final String DEBUG_BREAK_HANDLER = "__j2v8_debug_handler";
    public static String DEBUG_OBJECT_NAME = "__j2v8_Debug";
    private static final String DISABLE_ALL_BREAK_POINTS = "disableAllBreakPoints";
    private static final String DISABLE_SCRIPT_BREAK_POINT = "disableScriptBreakPoint";
    private static final String ENABLE_SCRIPT_BREAK_POINT = "enableScriptBreakPoint";
    private static final String FIND_SCRIPT_BREAK_POINT = "findScriptBreakPoint";
    private static final String NUMBER = "number";
    private static final String SCRIPT_BREAK_POINTS = "scriptBreakPoints";
    private static final String SET_BREAK_POINT = "setBreakPoint";
    private static final String SET_LISTENER = "setListener";
    private static final String SET_SCRIPT_BREAK_POINT_BY_NAME = "setScriptBreakPointByName";
    private static final String V8_DEBUG_OBJECT = "Debug";
    /* access modifiers changed from: private */
    public List<BreakHandler> breakHandlers = new ArrayList();
    private V8Object debugObject;
    private C80135V8 runtime;

    /* renamed from: com.eclipsesource.mmv8.debug.DebugHandler$1 */
    public static /* synthetic */ class C801381 {
        public static final /* synthetic */ int[] $SwitchMap$com$eclipsesource$mmv8$debug$DebugHandler$DebugEvent;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.eclipsesource.mmv8.debug.DebugHandler$DebugEvent[] r0 = com.eclipsesource.mmv8.debug.DebugHandler.DebugEvent.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$eclipsesource$mmv8$debug$DebugHandler$DebugEvent = r0
                com.eclipsesource.mmv8.debug.DebugHandler$DebugEvent r1 = com.eclipsesource.mmv8.debug.DebugHandler.DebugEvent.Break     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$eclipsesource$mmv8$debug$DebugHandler$DebugEvent     // Catch:{ NoSuchFieldError -> 0x001d }
                com.eclipsesource.mmv8.debug.DebugHandler$DebugEvent r1 = com.eclipsesource.mmv8.debug.DebugHandler.DebugEvent.BeforeCompile     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$eclipsesource$mmv8$debug$DebugHandler$DebugEvent     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.eclipsesource.mmv8.debug.DebugHandler$DebugEvent r1 = com.eclipsesource.mmv8.debug.DebugHandler.DebugEvent.AfterCompile     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$eclipsesource$mmv8$debug$DebugHandler$DebugEvent     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.eclipsesource.mmv8.debug.DebugHandler$DebugEvent r1 = com.eclipsesource.mmv8.debug.DebugHandler.DebugEvent.Exception     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.eclipsesource.mmv8.debug.DebugHandler.C801381.<clinit>():void");
        }
    }

    public class BreakpointHandler implements JavaVoidCallback {
        private BreakpointHandler() {
        }

        private EventData createDebugEvent(DebugEvent debugEvent, V8Object v8Object) {
            int i = C801381.$SwitchMap$com$eclipsesource$mmv8$debug$DebugHandler$DebugEvent[debugEvent.ordinal()];
            return i != 1 ? i != 2 ? i != 3 ? i != 4 ? new EventData(v8Object) : new ExceptionEvent(v8Object) : new CompileEvent(v8Object) : new CompileEvent(v8Object) : new BreakEvent(v8Object);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: com.eclipsesource.mmv8.debug.EventData} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: com.eclipsesource.mmv8.debug.EventData} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: com.eclipsesource.mmv8.V8Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: com.eclipsesource.mmv8.debug.EventData} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: com.eclipsesource.mmv8.debug.EventData} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: com.eclipsesource.mmv8.debug.EventData} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: com.eclipsesource.mmv8.debug.EventData} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: com.eclipsesource.mmv8.debug.ExecutionState} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: com.eclipsesource.mmv8.debug.EventData} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: com.eclipsesource.mmv8.debug.EventData} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: com.eclipsesource.mmv8.debug.EventData} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void invokeHandler(com.eclipsesource.mmv8.V8Array r6, int r7, com.eclipsesource.mmv8.debug.BreakHandler r8) {
            /*
                r5 = this;
                r0 = 1
                r1 = 0
                com.eclipsesource.mmv8.V8Object r0 = r6.getObject(r0)     // Catch:{ all -> 0x0044 }
                r2 = 2
                com.eclipsesource.mmv8.V8Object r2 = r6.getObject(r2)     // Catch:{ all -> 0x003d }
                r3 = 3
                com.eclipsesource.mmv8.V8Object r6 = r6.getObject(r3)     // Catch:{ all -> 0x0038 }
                com.eclipsesource.mmv8.debug.ExecutionState r3 = new com.eclipsesource.mmv8.debug.ExecutionState     // Catch:{ all -> 0x0035 }
                r3.<init>(r0)     // Catch:{ all -> 0x0035 }
                com.eclipsesource.mmv8.debug.DebugHandler$DebugEvent[] r4 = com.eclipsesource.mmv8.debug.DebugHandler.DebugEvent.values()     // Catch:{ all -> 0x0032 }
                r7 = r4[r7]     // Catch:{ all -> 0x0032 }
                com.eclipsesource.mmv8.debug.EventData r1 = r5.createDebugEvent(r7, r2)     // Catch:{ all -> 0x0032 }
                r8.onBreak(r7, r3, r1, r6)     // Catch:{ all -> 0x0032 }
                r5.safeRelease(r0)
                r5.safeRelease(r2)
                r5.safeRelease(r6)
                r5.safeRelease(r3)
                r5.safeRelease(r1)
                return
            L_0x0032:
                r7 = move-exception
                r8 = r1
                goto L_0x0042
            L_0x0035:
                r7 = move-exception
                r8 = r1
                goto L_0x003b
            L_0x0038:
                r7 = move-exception
                r6 = r1
                r8 = r6
            L_0x003b:
                r3 = r8
                goto L_0x0042
            L_0x003d:
                r7 = move-exception
                r6 = r1
                r8 = r6
                r2 = r8
                r3 = r2
            L_0x0042:
                r1 = r0
                goto L_0x0049
            L_0x0044:
                r7 = move-exception
                r6 = r1
                r8 = r6
                r2 = r8
                r3 = r2
            L_0x0049:
                r5.safeRelease(r1)
                r5.safeRelease(r2)
                r5.safeRelease(r6)
                r5.safeRelease(r3)
                r5.safeRelease(r8)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.eclipsesource.mmv8.debug.DebugHandler.BreakpointHandler.invokeHandler(com.eclipsesource.mmv8.V8Array, int, com.eclipsesource.mmv8.debug.BreakHandler):void");
        }

        private void safeRelease(Releasable releasable) {
            if (releasable != null) {
                releasable.release();
            }
        }

        public void invoke(V8Object v8Object, V8Array v8Array) {
            if (v8Array != null && !v8Array.isUndefined()) {
                int integer = v8Array.getInteger(0);
                for (BreakHandler invokeHandler : DebugHandler.this.breakHandlers) {
                    invokeHandler(v8Array, integer, invokeHandler);
                }
            }
        }

        public /* synthetic */ BreakpointHandler(DebugHandler debugHandler, C801381 r2) {
            this();
        }
    }

    public enum DebugEvent {
        Undefined(0),
        Break(1),
        Exception(2),
        NewFunction(3),
        BeforeCompile(4),
        AfterCompile(5),
        CompileError(6),
        PromiseError(7),
        AsyncTaskEvent(8);
        
        public int index;

        private DebugEvent(int i) {
            this.index = i;
        }
    }

    public DebugHandler(C80135V8 v8) {
        this.runtime = v8;
        setupDebugObject(v8);
        setupBreakpointHandler();
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [com.eclipsesource.mmv8.V8Value, com.eclipsesource.mmv8.V8Function] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void setupBreakpointHandler() {
        /*
            r5 = this;
            com.eclipsesource.mmv8.debug.DebugHandler$BreakpointHandler r0 = new com.eclipsesource.mmv8.debug.DebugHandler$BreakpointHandler
            r1 = 0
            r0.<init>(r5, r1)
            com.eclipsesource.mmv8.V8Object r2 = r5.debugObject
            java.lang.String r3 = "__j2v8_debug_handler"
            r2.registerJavaMethod((com.eclipsesource.mmv8.JavaVoidCallback) r0, (java.lang.String) r3)
            com.eclipsesource.mmv8.V8Object r0 = r5.debugObject     // Catch:{ all -> 0x0044 }
            com.eclipsesource.mmv8.V8Object r0 = r0.getObject(r3)     // Catch:{ all -> 0x0044 }
            com.eclipsesource.mmv8.V8Function r0 = (com.eclipsesource.mmv8.V8Function) r0     // Catch:{ all -> 0x0044 }
            com.eclipsesource.mmv8.V8Array r2 = new com.eclipsesource.mmv8.V8Array     // Catch:{ all -> 0x003f }
            com.eclipsesource.mmv8.V8 r3 = r5.runtime     // Catch:{ all -> 0x003f }
            r2.<init>(r3)     // Catch:{ all -> 0x003f }
            com.eclipsesource.mmv8.V8Array r1 = r2.push((com.eclipsesource.mmv8.V8Value) r0)     // Catch:{ all -> 0x003f }
            com.eclipsesource.mmv8.V8Object r2 = r5.debugObject     // Catch:{ all -> 0x003f }
            java.lang.String r3 = "setListener"
            r2.executeFunction(r3, r1)     // Catch:{ all -> 0x003f }
            if (r0 == 0) goto L_0x0033
            boolean r2 = r0.isReleased()
            if (r2 != 0) goto L_0x0033
            r0.release()
        L_0x0033:
            if (r1 == 0) goto L_0x003e
            boolean r0 = r1.isReleased()
            if (r0 != 0) goto L_0x003e
            r1.release()
        L_0x003e:
            return
        L_0x003f:
            r2 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
            goto L_0x0046
        L_0x0044:
            r2 = move-exception
            r0 = r1
        L_0x0046:
            if (r1 == 0) goto L_0x0051
            boolean r3 = r1.isReleased()
            if (r3 != 0) goto L_0x0051
            r1.release()
        L_0x0051:
            if (r0 == 0) goto L_0x005c
            boolean r1 = r0.isReleased()
            if (r1 != 0) goto L_0x005c
            r0.release()
        L_0x005c:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.eclipsesource.mmv8.debug.DebugHandler.setupBreakpointHandler():void");
    }

    private void setupDebugObject(C80135V8 v8) {
        V8Object object = v8.getObject(DEBUG_OBJECT_NAME);
        try {
            this.debugObject = object.getObject(V8_DEBUG_OBJECT);
        } finally {
            object.release();
        }
    }

    public void addBreakHandler(BreakHandler breakHandler) {
        this.runtime.getLocker().checkThread();
        this.breakHandlers.add(breakHandler);
    }

    public void changeBreakPointCondition(int i, String str) {
        V8Array v8Array = new V8Array(this.runtime);
        v8Array.push(i);
        v8Array.push(str);
        try {
            this.debugObject.executeVoidFunction(CHANGE_BREAK_POINT_CONDITION, v8Array);
        } finally {
            v8Array.release();
        }
    }

    public void clearBreakPoint(int i) {
        V8Array v8Array = new V8Array(this.runtime);
        v8Array.push(i);
        try {
            this.debugObject.executeVoidFunction(CLEAR_BREAK_POINT, v8Array);
        } finally {
            v8Array.release();
        }
    }

    public void disableAllBreakPoints() {
        this.debugObject.executeVoidFunction(DISABLE_ALL_BREAK_POINTS, (V8Array) null);
    }

    public void disableScriptBreakPoint(int i) {
        V8Array v8Array = new V8Array(this.runtime);
        v8Array.push(i);
        try {
            this.debugObject.executeVoidFunction(DISABLE_SCRIPT_BREAK_POINT, v8Array);
        } finally {
            v8Array.release();
        }
    }

    public void enableScriptBreakPoint(int i) {
        V8Array v8Array = new V8Array(this.runtime);
        v8Array.push(i);
        try {
            this.debugObject.executeVoidFunction(ENABLE_SCRIPT_BREAK_POINT, v8Array);
        } finally {
            v8Array.release();
        }
    }

    public ScriptBreakPoint getScriptBreakPoint(int i) {
        V8Array v8Array = new V8Array(this.runtime);
        v8Array.push(i);
        v8Array.push(false);
        V8Object v8Object = null;
        try {
            v8Object = this.debugObject.executeObjectFunction(FIND_SCRIPT_BREAK_POINT, v8Array);
            return new ScriptBreakPoint(v8Object);
        } finally {
            v8Array.release();
            if (v8Object != null) {
                v8Object.release();
            }
        }
    }

    public int getScriptBreakPointCount() {
        V8Array executeArrayFunction = this.debugObject.executeArrayFunction(SCRIPT_BREAK_POINTS, (V8Array) null);
        try {
            return executeArrayFunction.length();
        } finally {
            executeArrayFunction.release();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0029, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int[] getScriptBreakPointIDs() {
        /*
            r6 = this;
            com.eclipsesource.mmv8.V8Object r0 = r6.debugObject
            java.lang.String r1 = "scriptBreakPoints"
            r2 = 0
            com.eclipsesource.mmv8.V8Array r0 = r0.executeArrayFunction(r1, r2)
            int r1 = r0.length()     // Catch:{ all -> 0x0032 }
            int[] r1 = new int[r1]     // Catch:{ all -> 0x0032 }
            r3 = 0
        L_0x0011:
            int r4 = r0.length()     // Catch:{ all -> 0x0032 }
            if (r3 >= r4) goto L_0x002e
            com.eclipsesource.mmv8.V8Object r4 = r0.getObject(r3)     // Catch:{ all -> 0x0032 }
            java.lang.String r5 = "number"
            int r5 = r4.executeIntegerFunction(r5, r2)     // Catch:{ all -> 0x0029 }
            r1[r3] = r5     // Catch:{ all -> 0x0029 }
            r4.release()     // Catch:{ all -> 0x0032 }
            int r3 = r3 + 1
            goto L_0x0011
        L_0x0029:
            r1 = move-exception
            r4.release()     // Catch:{ all -> 0x0032 }
            throw r1     // Catch:{ all -> 0x0032 }
        L_0x002e:
            r0.release()
            return r1
        L_0x0032:
            r1 = move-exception
            r0.release()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.eclipsesource.mmv8.debug.DebugHandler.getScriptBreakPointIDs():int[]");
    }

    public void release() {
        this.debugObject.release();
    }

    public void removeBreakHandler(BreakHandler breakHandler) {
        this.runtime.getLocker().checkThread();
        this.breakHandlers.remove(breakHandler);
    }

    public int setBreakpoint(V8Function v8Function) {
        V8Array v8Array = new V8Array(this.runtime);
        v8Array.push((V8Value) v8Function);
        try {
            return this.debugObject.executeIntegerFunction(SET_BREAK_POINT, v8Array);
        } finally {
            v8Array.release();
        }
    }

    public int setScriptBreakpoint(String str, int i) {
        V8Array v8Array = new V8Array(this.runtime);
        v8Array.push(str);
        v8Array.push(i);
        try {
            return this.debugObject.executeIntegerFunction(SET_SCRIPT_BREAK_POINT_BY_NAME, v8Array);
        } finally {
            v8Array.release();
        }
    }
}
