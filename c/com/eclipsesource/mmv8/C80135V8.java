package com.eclipsesource.mmv8;

import android.os.Environment;
import android.os.SystemClock;
import com.eclipsesource.mmv8.V8Array;
import com.eclipsesource.mmv8.V8Object;
import com.eclipsesource.mmv8.snapshot.CreateSnapshotParams;
import com.eclipsesource.mmv8.snapshot.CreateSnapshotResult;
import com.eclipsesource.mmv8.utils.V8Executor;
import com.eclipsesource.mmv8.utils.V8Map;
import com.eclipsesource.mmv8.utils.V8Runnable;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.eclipsesource.mmv8.V8 */
public class C80135V8 extends V8Object {
    public static final int MEMORY_PRESSURE_LEVEL_CRITICAL = 2;
    public static final int MEMORY_PRESSURE_LEVEL_MODERATE = 1;
    public static final int MEMORY_PRESSURE_LEVEL_NONE = 0;
    private static Object invalid = new Object();
    private static final Object lock = new Object();
    private static boolean nativeLibraryLoaded = false;
    private static Error nativeLoadError = null;
    private static Exception nativeLoadException = null;
    private static volatile int runtimeCounter = 0;
    private static AtomicBoolean sCachedProtectCreateContextFromSnapshot = new AtomicBoolean(false);
    private static ILoadLibraryDelegate sLoadLibraryDelegate = new ILoadLibraryDelegate() {
        public void loadLibrary(String str) {
            LibraryLoader.loadLibrary(str);
        }
    };
    private static V8Value undefined = new V8Object.Undefined();
    private static String v8Flags = "";
    private static boolean v8TracingAutoStart = false;
    private static String[] v8TracingCategories = null;
    private static String v8TracingConfig = "";
    private static String v8TracingResultFile = (Environment.getExternalStorageDirectory().getPath() + "v8_trace.json");
    private static boolean v8TracingRunning = false;
    public JavaTaskScheduler _javaTaskScheduler;
    private Map<String, Object> data;
    private V8Map<V8Executor> executors;
    private boolean forceTerminateExecutors;
    private Map<Long, MethodDescriptor> functionRegistry;
    public final long isolateCreateDurationMills;
    private final V8Locker locker;
    public Runnable nativeJavaCallback_;
    private long objectReferences;
    private LinkedList<ReferenceHandler> referenceHandlers;
    private LinkedList<V8Runnable> releaseHandlers;
    private List<Releasable> resources;
    /* access modifiers changed from: private */
    public long v8RuntimePtr;
    public Map<Long, V8Value> v8WeakReferences;

    /* renamed from: com.eclipsesource.mmv8.V8$JavaTaskScheduler */
    public interface JavaTaskScheduler {
        void Schedule(Runnable runnable);
    }

    /* renamed from: com.eclipsesource.mmv8.V8$MethodDescriptor */
    public class MethodDescriptor {
        public JavaCallback callback;
        public boolean includeReceiver;
        public Method method;
        public Object object;
        public JavaVoidCallback voidCallback;

        private MethodDescriptor() {
        }
    }

    public C80135V8() {
        this((String) null, true, (byte[]) null, (String) null, false);
    }

    private native void _acquireLock(long j);

    private native void _add(long j, long j2, String str, double d);

    private native void _add(long j, long j2, String str, int i);

    private native void _add(long j, long j2, String str, String str2);

    private native void _add(long j, long j2, String str, boolean z);

    private native void _addArrayBooleanItem(long j, long j2, boolean z);

    private native void _addArrayDoubleItem(long j, long j2, double d);

    private native void _addArrayIntItem(long j, long j2, int i);

    private native void _addArrayNullItem(long j, long j2);

    private native void _addArrayObjectItem(long j, long j2, long j3);

    private native void _addArrayStringItem(long j, long j2, String str);

    private native void _addArrayUndefinedItem(long j, long j2);

    private native void _addNull(long j, long j2, String str);

    private native void _addObject(long j, long j2, String str, long j3);

    private native void _addUndefined(long j, long j2, String str);

    private native Object _arrayGet(long j, int i, long j2, int i2);

    private native boolean _arrayGetBoolean(long j, long j2, int i);

    private native int _arrayGetBooleans(long j, long j2, int i, int i2, boolean[] zArr);

    private native boolean[] _arrayGetBooleans(long j, long j2, int i, int i2);

    private native byte _arrayGetByte(long j, long j2, int i);

    private native int _arrayGetBytes(long j, long j2, int i, int i2, byte[] bArr);

    private native byte[] _arrayGetBytes(long j, long j2, int i, int i2);

    private native double _arrayGetDouble(long j, long j2, int i);

    private native int _arrayGetDoubles(long j, long j2, int i, int i2, double[] dArr);

    private native double[] _arrayGetDoubles(long j, long j2, int i, int i2);

    private native int _arrayGetInteger(long j, long j2, int i);

    private native int _arrayGetIntegers(long j, long j2, int i, int i2, int[] iArr);

    private native int[] _arrayGetIntegers(long j, long j2, int i, int i2);

    private native int _arrayGetSize(long j, long j2);

    private native String _arrayGetString(long j, long j2, int i);

    private native int _arrayGetStrings(long j, long j2, int i, int i2, String[] strArr);

    private native String[] _arrayGetStrings(long j, long j2, int i, int i2);

    private native Object _batchExecuteScripts(long j, V8ScriptEvaluateRequest[] v8ScriptEvaluateRequestArr, String str, ExecuteDetails executeDetails);

    private native void _closeUVLoop(long j);

    private native boolean _contains(long j, long j2, String str);

    private native long _createContext(long j, int i);

    private native long _createContextFromSnapshot(long j, int i, int i2);

    private native long _createIsolate(String str, boolean z, byte[] bArr, String str2, boolean z2);

    private native long _createNodeMainContextFromSnapshot(long j, int i);

    public static native CreateSnapshotResult _createSnapshot(CreateSnapshotParams createSnapshotParams);

    private native void _createTwin(long j, long j2, long j3);

    private native ByteBuffer _createV8ArrayBufferBackingStore(long j, long j2, int i);

    private static native void _debugMessageLoop(long j);

    private static native void _enableNativeTrans(long j);

    private native boolean _equals(long j, long j2, long j3);

    private native boolean _executeBooleanFunction(long j, long j2, String str, long j3);

    private native boolean _executeBooleanScript(long j, String str, String str2, int i, String str3, String str4, int i2, ExecuteDetails executeDetails);

    private static native String _executeDebugScript(long j, String str, String str2);

    private native double _executeDoubleFunction(long j, long j2, String str, long j3);

    private native double _executeDoubleScript(long j, String str, String str2, int i, String str3, String str4, int i2, ExecuteDetails executeDetails);

    private native Object _executeFileScript(long j, int i, V8ScriptFileDescriptor v8ScriptFileDescriptor, String str, int i2, String str2, String str3, int i3, ExecuteDetails executeDetails);

    private native Object _executeFunction(long j, int i, long j2, String str, long j3);

    private native Object _executeFunction(long j, long j2, long j3, long j4);

    private native int _executeIntegerFunction(long j, long j2, String str, long j3);

    private native int _executeIntegerScript(long j, String str, String str2, int i, String str3, String str4, int i2, ExecuteDetails executeDetails);

    private native Object _executeScript(long j, int i, String str, String str2, int i2, String str3, String str4, int i3, ExecuteDetails executeDetails);

    private native String _executeStringFunction(long j, long j2, String str, long j3);

    private native String _executeStringScript(long j, String str, String str2, int i, String str3, String str4, int i2, ExecuteDetails executeDetails);

    private native void _executeVoidFunction(long j, long j2, String str, long j3);

    private native void _executeVoidScript(long j, String str, String str2, int i, String str3, String str4, int i2, ExecuteDetails executeDetails);

    private native Object _get(long j, int i, long j2, String str);

    private native int _getArrayType(long j, long j2);

    private native boolean _getBoolean(long j, long j2, String str);

    private native long _getBuildID();

    private native double _getDouble(long j, long j2, String str);

    private native long _getGlobalObject(long j);

    private native int _getInteger(long j, long j2, String str);

    private native long _getIsolatePtr(long j);

    private native String[] _getKeys(long j, long j2);

    private static native long _getMyLoopIdleTimeMs(long j);

    private static native long _getNativeTransManager();

    private native String _getString(long j, long j2, String str);

    private native int _getType(long j, long j2);

    private native int _getType(long j, long j2, int i);

    private native int _getType(long j, long j2, int i, int i2);

    private native int _getType(long j, long j2, String str);

    private native long _getUVLoopPtr(long j);

    private static native String _getVersion();

    private native int _identityHash(long j, long j2);

    private native long _initNewSharedV8ArrayBuffer(long j, ByteBuffer byteBuffer, int i);

    private native long _initNewV8Array(long j);

    private native long _initNewV8ArrayBuffer(long j, int i);

    private native long _initNewV8ArrayBuffer(long j, ByteBuffer byteBuffer, int i);

    private native long _initNewV8Float32Array(long j, long j2, int i, int i2);

    private native long _initNewV8Float64Array(long j, long j2, int i, int i2);

    private native long[] _initNewV8Function(long j);

    private native long _initNewV8Int16Array(long j, long j2, int i, int i2);

    private native long _initNewV8Int32Array(long j, long j2, int i, int i2);

    private native long _initNewV8Int8Array(long j, long j2, int i, int i2);

    private native long _initNewV8Object(long j);

    private native long _initNewV8UInt16Array(long j, long j2, int i, int i2);

    private native long _initNewV8UInt32Array(long j, long j2, int i, int i2);

    private native long _initNewV8UInt8Array(long j, long j2, int i, int i2);

    private native long _initNewV8UInt8ClampedArray(long j, long j2, int i, int i2);

    private static native boolean _isRunning(long j);

    private native boolean _isWeak(long j, long j2);

    private native void _lowMemoryNotification(long j);

    private static native void _markSnapshotNotNeed(long j);

    private native void _memoryPressureNotification(long j, int i);

    private static native void _nativeDispatch(long j);

    private static native void _nativeLoopStop(long j);

    private static native void _nativeMessageLoop(long j);

    private static native void _nativeTransBroadcastMessage(int i, String str);

    /* access modifiers changed from: private */
    public static native void _nativeTransHandleMessage(long j);

    private static native void _nativeTransPostMessage(int i, String str);

    private static native void _nativeTransSetJavaSchedule(long j);

    private static native void _protectCreateContextFromSnapshot();

    private static native boolean _pumpMessageLoop(long j, boolean z);

    private static native void _pumpMessageLoopDirect(long j);

    private native long _registerJavaMethod(long j, long j2, String str, boolean z);

    private native void _release(long j, long j2);

    private native void _releaseContext(long j, long j2);

    private native void _releaseLock(long j);

    private native void _releaseMethodDescriptor(long j, long j2);

    private native void _releaseRuntime(long j);

    private native boolean _sameValue(long j, long j2, long j3);

    private static native void _setBreakOnStart(boolean z);

    private native void _setCodeCacheDir(long j, String str);

    private native void _setDelaySaveCodeCache(long j, boolean z);

    private static native void _setFlags(String str);

    private native void _setMinimalCodeLength(long j, int i);

    private native void _setPrototype(long j, long j2, long j3);

    private native void _setWeak(long j, long j2);

    private static native void _startNodeJS(long j);

    private native boolean _strictEquals(long j, long j2, long j3);

    private native void _switchContext(long j, long j2);

    private native void _terminateExecution(long j);

    private native String _toString(long j, long j2);

    private static native void _waitForDebuger(long j, String str);

    private static native void _waitForDebuggerWithContexts(long j, String str, long[] jArr, String[] strArr);

    private native void _wakeUpUVLoop(long j);

    public static void broadcastMessage(int i, String str) {
        _nativeTransBroadcastMessage(i, str);
    }

    private void checkArgs(Object[] objArr) {
        int length = objArr.length;
        int i = 0;
        while (i < length) {
            if (objArr[i] != invalid) {
                i++;
            } else {
                throw new IllegalArgumentException("argument type mismatch");
            }
        }
    }

    private static void checkNativeLibraryLoaded() {
        if (nativeLibraryLoaded) {
            return;
        }
        if (nativeLoadError != null) {
            throw new IllegalStateException("J2V8 native library not loaded", nativeLoadError);
        } else if (nativeLoadException != null) {
            throw new IllegalStateException("J2V8 native library not loaded", nativeLoadException);
        } else {
            throw new IllegalStateException("J2V8 native library not loaded");
        }
    }

    private Object checkResult(Object obj) {
        if (obj == null) {
            return obj;
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof Integer) || (obj instanceof Double) || (obj instanceof Boolean) || (obj instanceof String)) {
            return obj;
        }
        if (!(obj instanceof V8Value)) {
            throw new V8RuntimeException("Unknown return type: " + obj.getClass());
        } else if (!((V8Value) obj).isReleased()) {
            return obj;
        } else {
            throw new V8RuntimeException("V8Value already released");
        }
    }

    public static void checkScript(String str) {
        if (str == null) {
            throw new NullPointerException("Script is null");
        }
    }

    public static native void clearSnapshotCacheIfIdle();

    public static native void createNodeSnapshot(String str);

    public static C80135V8 createV8Runtime() {
        return createV8Runtime((String) null, (String) null);
    }

    public static int getActiveRuntimes() {
        return runtimeCounter;
    }

    private Object[] getArgs(V8Object v8Object, MethodDescriptor methodDescriptor, V8Array v8Array, boolean z) {
        int length = methodDescriptor.method.getParameterTypes().length;
        int i = z ? length - 1 : length;
        Object[] defaultValues = setDefaultValues(new Object[length], methodDescriptor.method.getParameterTypes(), v8Object, methodDescriptor.includeReceiver);
        ArrayList arrayList = new ArrayList();
        populateParamters(v8Array, i, defaultValues, arrayList, methodDescriptor.includeReceiver);
        if (z) {
            Object varArgContainer = getVarArgContainer(methodDescriptor.method.getParameterTypes(), arrayList.size());
            System.arraycopy(arrayList.toArray(), 0, varArgContainer, 0, arrayList.size());
            defaultValues[i] = varArgContainer;
        }
        return defaultValues;
    }

    private Object getArrayItem(V8Array v8Array, int i) {
        try {
            int type = v8Array.getType(i);
            if (type == 10) {
                return v8Array.get(i);
            }
            if (type == 99) {
                return getUndefined();
            }
            switch (type) {
                case 1:
                    return Integer.valueOf(v8Array.getInteger(i));
                case 2:
                    return Double.valueOf(v8Array.getDouble(i));
                case 3:
                    return Boolean.valueOf(v8Array.getBoolean(i));
                case 4:
                    return v8Array.getString(i);
                case 5:
                case 8:
                    return v8Array.getArray(i);
                case 6:
                    return v8Array.getObject(i);
                case 7:
                    return v8Array.getObject(i);
                default:
                    return null;
            }
        } catch (V8ResultUndefined unused) {
            return null;
        }
    }

    private Object getDefaultValue(Class<?> cls) {
        return cls.equals(V8Object.class) ? new V8Object.Undefined() : cls.equals(V8Array.class) ? new V8Array.Undefined() : invalid;
    }

    public static String getFlags() {
        return v8Flags;
    }

    public static long getNativeTransManager() {
        return _getNativeTransManager();
    }

    public static native String getNodeVersion();

    public static String getSCMRevision() {
        return "Unknown revision ID";
    }

    public static String[] getTracingCategories() {
        return v8TracingCategories;
    }

    public static String getTracingResultFile() {
        return v8TracingResultFile;
    }

    public static V8Value getUndefined() {
        return undefined;
    }

    public static String getV8Version() {
        return _getVersion();
    }

    private Object getVarArgContainer(Class<?>[] clsArr, int i) {
        Class<?> cls = clsArr[clsArr.length - 1];
        if (cls.isArray()) {
            cls = cls.getComponentType();
        }
        return Array.newInstance(cls, i);
    }

    public static boolean isLoaded() {
        return nativeLibraryLoaded;
    }

    public static boolean isTracingAutoStart() {
        return v8TracingAutoStart;
    }

    public static boolean isV8TracingRunning() {
        return v8TracingRunning;
    }

    private boolean isVoidMethod(Method method) {
        return method.getReturnType().equals(Void.TYPE);
    }

    private static synchronized void load(String str) {
        synchronized (C80135V8.class) {
            try {
                V8TracerAccessible.beginSection("LoadSo");
                sLoadLibraryDelegate.loadLibrary(str);
                nativeLibraryLoaded = true;
            } catch (Error e) {
                nativeLoadError = e;
            } catch (Exception e2) {
                try {
                    nativeLoadException = e2;
                } catch (Throwable th) {
                    V8TracerAccessible.endSection();
                    throw th;
                }
            }
            V8TracerAccessible.endSection();
        }
    }

    private void notifyReferenceCreated(V8Value v8Value) {
        Iterator<ReferenceHandler> it = this.referenceHandlers.iterator();
        while (it.hasNext()) {
            it.next().v8HandleCreated(v8Value);
        }
    }

    private void notifyReferenceDisposed(V8Value v8Value) {
        Iterator<ReferenceHandler> it = this.referenceHandlers.iterator();
        while (it.hasNext()) {
            it.next().v8HandleDisposed(v8Value);
        }
    }

    private void notifyReleaseHandlers(C80135V8 v8) {
        Iterator<V8Runnable> it = this.releaseHandlers.iterator();
        while (it.hasNext()) {
            it.next().run(v8);
        }
    }

    public static void onStartV8Tracing() {
        v8TracingRunning = true;
    }

    public static void onStopV8Tracing() {
        v8TracingRunning = false;
    }

    private void populateParamters(V8Array v8Array, int i, Object[] objArr, List<Object> list, boolean z) {
        for (int i2 = z; i2 < v8Array.length() + (z ? 1 : 0); i2++) {
            if (i2 >= i) {
                list.add(getArrayItem(v8Array, i2 - z));
            } else {
                objArr[i2] = getArrayItem(v8Array, i2 - z);
            }
        }
    }

    public static void postMessage(int i, String str) {
        _nativeTransPostMessage(i, str);
    }

    public static void protectCreateContextFromSnapshot() {
        if (nativeLibraryLoaded) {
            _protectCreateContextFromSnapshot();
        } else {
            sCachedProtectCreateContextFromSnapshot.set(true);
        }
    }

    private void releaseArguments(Object[] objArr, boolean z) {
        if (z && objArr.length > 0 && (objArr[objArr.length - 1] instanceof Object[])) {
            for (Object obj : objArr[objArr.length - 1]) {
                if (obj instanceof V8Value) {
                    ((V8Value) obj).release();
                }
            }
        }
        for (V8Value v8Value : objArr) {
            if (v8Value instanceof V8Value) {
                v8Value.release();
            }
        }
    }

    private void releaseNativeMethodDescriptors() {
        for (Long longValue : this.functionRegistry.keySet()) {
            releaseMethodDescriptor(this.v8RuntimePtr, longValue.longValue());
        }
    }

    private void releaseResources() {
        List<Releasable> list = this.resources;
        if (list != null) {
            for (Releasable release : list) {
                release.release();
            }
            this.resources.clear();
            this.resources = null;
        }
    }

    public static boolean requireSoLoaded(String str) {
        if (nativeLibraryLoaded) {
            return true;
        }
        synchronized (lock) {
            if (!nativeLibraryLoaded) {
                load(str);
            }
        }
        return nativeLibraryLoaded;
    }

    public static void setBreakOnStart(Boolean bool) {
        _setBreakOnStart(bool.booleanValue());
    }

    private Object[] setDefaultValues(Object[] objArr, Class<?>[] clsArr, V8Object v8Object, boolean z) {
        int i = 0;
        if (z) {
            objArr[0] = v8Object;
            i = 1;
        }
        while (i < objArr.length) {
            objArr[i] = getDefaultValue(clsArr[i]);
            i++;
        }
        return objArr;
    }

    public static void setFlags(String str) {
        v8Flags = str;
    }

    public static void setLoadLibraryDelegate(ILoadLibraryDelegate iLoadLibraryDelegate) {
        if (iLoadLibraryDelegate != null) {
            sLoadLibraryDelegate = iLoadLibraryDelegate;
            return;
        }
        throw new IllegalArgumentException("setLoadLibraryDelegate: param delegate null");
    }

    public static void setTracingInfo(String str, String str2, boolean z) {
        v8TracingConfig = str;
        v8TracingResultFile = str2;
        v8TracingAutoStart = z;
        JSONArray jSONArray = new JSONObject(str).getJSONArray("included_categories");
        v8TracingCategories = new String[jSONArray.length()];
        for (int i = 0; i < jSONArray.length(); i++) {
            v8TracingCategories[i] = jSONArray.getString(i);
        }
    }

    public static native void startTracing();

    public static native void stopTracing();

    public void acquireLock(long j) {
        _acquireLock(j);
    }

    public void add(long j, long j2, String str, int i) {
        _add(j, j2, str, i);
    }

    public void addArrayBooleanItem(long j, long j2, boolean z) {
        _addArrayBooleanItem(j, j2, z);
    }

    public void addArrayDoubleItem(long j, long j2, double d) {
        _addArrayDoubleItem(j, j2, d);
    }

    public void addArrayIntItem(long j, long j2, int i) {
        _addArrayIntItem(j, j2, i);
    }

    public void addArrayNullItem(long j, long j2) {
        _addArrayNullItem(j, j2);
    }

    public void addArrayObjectItem(long j, long j2, long j3) {
        _addArrayObjectItem(j, j2, j3);
    }

    public void addArrayStringItem(long j, long j2, String str) {
        _addArrayStringItem(j, j2, str);
    }

    public void addArrayUndefinedItem(long j, long j2) {
        _addArrayUndefinedItem(j, j2);
    }

    public void addNull(long j, long j2, String str) {
        _addNull(j, j2, str);
    }

    public void addObjRef(V8Value v8Value) {
        this.objectReferences++;
        if (!this.referenceHandlers.isEmpty()) {
            notifyReferenceCreated(v8Value);
        }
    }

    public void addObject(long j, long j2, String str, long j3) {
        _addObject(j, j2, str, j3);
    }

    public void addReferenceHandler(ReferenceHandler referenceHandler) {
        this.referenceHandlers.add(0, referenceHandler);
    }

    public void addReleaseHandler(V8Runnable v8Runnable) {
        this.releaseHandlers.add(v8Runnable);
    }

    public void addUndefined(long j, long j2, String str) {
        _addUndefined(j, j2, str);
    }

    public Object arrayGet(long j, int i, long j2, int i2) {
        return _arrayGet(j, i, j2, i2);
    }

    public boolean arrayGetBoolean(long j, long j2, int i) {
        return _arrayGetBoolean(j, j2, i);
    }

    public boolean[] arrayGetBooleans(long j, long j2, int i, int i2) {
        return _arrayGetBooleans(j, j2, i, i2);
    }

    public byte arrayGetByte(long j, long j2, int i) {
        return _arrayGetByte(j, j2, i);
    }

    public byte[] arrayGetBytes(long j, long j2, int i, int i2) {
        return _arrayGetBytes(j, j2, i, i2);
    }

    public double arrayGetDouble(long j, long j2, int i) {
        return _arrayGetDouble(j, j2, i);
    }

    public double[] arrayGetDoubles(long j, long j2, int i, int i2) {
        return _arrayGetDoubles(j, j2, i, i2);
    }

    public int arrayGetInteger(long j, long j2, int i) {
        return _arrayGetInteger(j, j2, i);
    }

    public int[] arrayGetIntegers(long j, long j2, int i, int i2) {
        return _arrayGetIntegers(j, j2, i, i2);
    }

    public int arrayGetSize(long j, long j2) {
        return _arrayGetSize(j, j2);
    }

    public String arrayGetString(long j, long j2, int i) {
        return _arrayGetString(j, j2, i);
    }

    public String[] arrayGetStrings(long j, long j2, int i, int i2) {
        return _arrayGetStrings(j, j2, i, i2);
    }

    public Object batchExecuteScripts(ArrayList<V8ScriptEvaluateRequest> arrayList, String str, ExecuteDetails executeDetails) {
        checkThread();
        if (arrayList == null || arrayList.isEmpty()) {
            throw new IllegalArgumentException("Scripts is Empty");
        }
        return batchExecuteScripts(getV8RuntimePtr(), (V8ScriptEvaluateRequest[]) arrayList.toArray(new V8ScriptEvaluateRequest[arrayList.size()]), str, executeDetails);
    }

    public Object callObjectJavaMethod(long j, V8Object v8Object, V8Array v8Array) {
        MethodDescriptor methodDescriptor = this.functionRegistry.get(Long.valueOf(j));
        JavaCallback javaCallback = methodDescriptor.callback;
        if (javaCallback != null) {
            return checkResult(javaCallback.invoke(v8Object, v8Array));
        }
        boolean isVarArgs = methodDescriptor.method.isVarArgs();
        Object[] args = getArgs(v8Object, methodDescriptor, v8Array, isVarArgs);
        checkArgs(args);
        try {
            Object checkResult = checkResult(methodDescriptor.method.invoke(methodDescriptor.object, args));
            releaseArguments(args, isVarArgs);
            return checkResult;
        } catch (InvocationTargetException e) {
            throw e.getTargetException();
        } catch (IllegalAccessException e2) {
            throw e2;
        } catch (IllegalArgumentException e3) {
            throw e3;
        } catch (Throwable th) {
            releaseArguments(args, isVarArgs);
            throw th;
        }
    }

    public void callVoidJavaMethod(long j, V8Object v8Object, V8Array v8Array) {
        MethodDescriptor methodDescriptor = this.functionRegistry.get(Long.valueOf(j));
        JavaVoidCallback javaVoidCallback = methodDescriptor.voidCallback;
        if (javaVoidCallback != null) {
            javaVoidCallback.invoke(v8Object, v8Array);
            return;
        }
        boolean isVarArgs = methodDescriptor.method.isVarArgs();
        Object[] args = getArgs(v8Object, methodDescriptor, v8Array, isVarArgs);
        checkArgs(args);
        try {
            methodDescriptor.method.invoke(methodDescriptor.object, args);
            releaseArguments(args, isVarArgs);
        } catch (InvocationTargetException e) {
            throw e.getTargetException();
        } catch (IllegalAccessException e2) {
            throw e2;
        } catch (IllegalArgumentException e3) {
            throw e3;
        } catch (Throwable th) {
            releaseArguments(args, isVarArgs);
            throw th;
        }
    }

    public void checkRuntime(V8Value v8Value) {
        if (v8Value != null && !v8Value.isUndefined()) {
            C80135V8 runtime = v8Value.getRuntime();
            if (runtime == null || runtime.isReleased() || runtime != this) {
                throw new Error("Invalid target runtime");
            }
        }
    }

    public void checkThread() {
        this.locker.checkThread();
        if (isReleased()) {
            throw new Error("Runtime disposed error");
        }
    }

    public void closeUVLoop() {
        _closeUVLoop(this.v8RuntimePtr);
    }

    public boolean contains(long j, long j2, String str) {
        return _contains(j, j2, str);
    }

    public void createAndRegisterMethodDescriptor(JavaCallback javaCallback, long j) {
        MethodDescriptor methodDescriptor = new MethodDescriptor();
        methodDescriptor.callback = javaCallback;
        this.functionRegistry.put(Long.valueOf(j), methodDescriptor);
    }

    public void createNodeRuntime() {
        _startNodeJS(this.v8RuntimePtr);
    }

    public void createTwin(V8Value v8Value, V8Value v8Value2) {
        checkThread();
        createTwin(this.v8RuntimePtr, v8Value.getHandle(), v8Value2.getHandle());
    }

    public ByteBuffer createV8ArrayBufferBackingStore(long j, long j2, int i) {
        return _createV8ArrayBufferBackingStore(j, j2, i);
    }

    public long createV8Context(int i) {
        return _createContext(this.v8RuntimePtr, i);
    }

    public long createV8ContextFromSnapshot(int i, int i2) {
        return _createContextFromSnapshot(this.v8RuntimePtr, i, i2);
    }

    public long createV8NodeMainContextFromSnapshot(int i) {
        return _createNodeMainContextFromSnapshot(this.v8RuntimePtr, i);
    }

    public void debuggerMessageLoop() {
        checkThread();
        _debugMessageLoop(this.v8RuntimePtr);
    }

    public void disposeMethodID(long j) {
        this.functionRegistry.remove(Long.valueOf(j));
    }

    public void enableNativeTrans() {
        _enableNativeTrans(this.v8RuntimePtr);
    }

    public boolean equals(long j, long j2, long j3) {
        return _equals(j, j2, j3);
    }

    public V8Array executeArrayScript(String str) {
        return executeArrayScript(str, (String) null, 0, (String) null, (String) null, 0, (ExecuteDetails) null);
    }

    public boolean executeBooleanFunction(long j, long j2, String str, long j3) {
        return _executeBooleanFunction(j, j2, str, j3);
    }

    public boolean executeBooleanScript(String str) {
        return executeBooleanScript(str, (String) null, 0, (String) null, (String) null, 0, (ExecuteDetails) null);
    }

    public String executeDebugScript(String str, String str2) {
        checkThread();
        checkScript(str);
        return _executeDebugScript(this.v8RuntimePtr, str, str2);
    }

    public double executeDoubleFunction(long j, long j2, String str, long j3) {
        return _executeDoubleFunction(j, j2, str, j3);
    }

    public double executeDoubleScript(String str) {
        return executeDoubleScript(str, (String) null, 0, (String) null, (String) null, 0, (ExecuteDetails) null);
    }

    public Object executeFileScript(V8ScriptFileDescriptor v8ScriptFileDescriptor, String str, int i, String str2, String str3, int i2, ExecuteDetails executeDetails) {
        checkThread();
        if (v8ScriptFileDescriptor != null) {
            return executeFileScript(getV8RuntimePtr(), 0, v8ScriptFileDescriptor, str, i, str2, str3, i2, executeDetails);
        }
        throw new NullPointerException("Script is null");
    }

    public Object executeFunction(long j, int i, long j2, String str, long j3) {
        return _executeFunction(j, i, j2, str, j3);
    }

    public int executeIntegerFunction(long j, long j2, String str, long j3) {
        return _executeIntegerFunction(j, j2, str, j3);
    }

    public int executeIntegerScript(String str) {
        return executeIntegerScript(str, (String) null, 0, (String) null, (String) null, 0, (ExecuteDetails) null);
    }

    public V8Object executeObjectScript(String str) {
        return executeObjectScript(str, (String) null, 0, (String) null, (String) null, 0, (ExecuteDetails) null);
    }

    public Object executeScript(String str) {
        return executeScript(str, (String) null, 0, (String) null, (String) null, 0, (ExecuteDetails) null);
    }

    public String executeStringFunction(long j, long j2, String str, long j3) {
        return _executeStringFunction(j, j2, str, j3);
    }

    public String executeStringScript(String str) {
        return executeStringScript(str, (String) null, 0, (String) null, (String) null, 0, (ExecuteDetails) null);
    }

    public void executeVoidFunction(long j, long j2, String str, long j3) {
        _executeVoidFunction(j, j2, str, j3);
    }

    public void executeVoidScript(String str) {
        executeVoidScript(str, (String) null, 0, (String) null, (String) null, 0, (ExecuteDetails) null);
    }

    public Object get(long j, int i, long j2, String str) {
        return _get(j, i, j2, str);
    }

    public int getArrayType(long j, long j2) {
        return _getArrayType(j, j2);
    }

    public boolean getBoolean(long j, long j2, String str) {
        return _getBoolean(j, j2, str);
    }

    public long getBuildID() {
        return _getBuildID();
    }

    public Object getData(String str) {
        Map<String, Object> map = this.data;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public double getDouble(long j, long j2, String str) {
        return _getDouble(j, j2, str);
    }

    public V8Executor getExecutor(V8Object v8Object) {
        checkThread();
        V8Map<V8Executor> v8Map = this.executors;
        if (v8Map == null) {
            return null;
        }
        return v8Map.get(v8Object);
    }

    public long getGlobalObject() {
        return _getGlobalObject(this.v8RuntimePtr);
    }

    public int getInteger(long j, long j2, String str) {
        return _getInteger(j, j2, str);
    }

    public long getIsolatePtr() {
        return _getIsolatePtr(this.v8RuntimePtr);
    }

    public String[] getKeys(long j, long j2) {
        return _getKeys(j, j2);
    }

    public V8Locker getLocker() {
        return this.locker;
    }

    public long getMyLoopIdleTimeMs() {
        return _getMyLoopIdleTimeMs(this.v8RuntimePtr);
    }

    public String getObjectJavaMethodDescription(long j) {
        MethodDescriptor methodDescriptor = this.functionRegistry.get(Long.valueOf(j));
        if (methodDescriptor == null) {
            return "Unknown";
        }
        JavaCallback javaCallback = methodDescriptor.callback;
        if (javaCallback != null) {
            return javaCallback.getClass().getName();
        }
        JavaVoidCallback javaVoidCallback = methodDescriptor.voidCallback;
        if (javaVoidCallback != null) {
            return javaVoidCallback.getClass().getName();
        }
        return methodDescriptor.object.getClass().getName() + "." + methodDescriptor.method.getName();
    }

    public long getObjectReferenceCount() {
        return this.objectReferences - ((long) this.v8WeakReferences.size());
    }

    public String getString(long j, long j2, String str) {
        return _getString(j, j2, str);
    }

    public int getType(long j, long j2) {
        return _getType(j, j2);
    }

    public long getUVLoopPtr() {
        return _getUVLoopPtr(this.v8RuntimePtr);
    }

    public long getV8RuntimePtr() {
        return this.v8RuntimePtr;
    }

    public int identityHash(long j, long j2) {
        return _identityHash(j, j2);
    }

    public long initNewSharedV8ArrayBuffer(long j, ByteBuffer byteBuffer, int i) {
        return _initNewSharedV8ArrayBuffer(j, byteBuffer, i);
    }

    public long initNewV8Array(long j) {
        return _initNewV8Array(j);
    }

    public long initNewV8ArrayBuffer(long j, ByteBuffer byteBuffer, int i) {
        return _initNewV8ArrayBuffer(j, byteBuffer, i);
    }

    public long initNewV8Float32Array(long j, long j2, int i, int i2) {
        return _initNewV8Float32Array(j, j2, i, i2);
    }

    public long initNewV8Float64Array(long j, long j2, int i, int i2) {
        return _initNewV8Float64Array(j, j2, i, i2);
    }

    public long[] initNewV8Function(long j) {
        checkThread();
        return _initNewV8Function(j);
    }

    public long initNewV8Int16Array(long j, long j2, int i, int i2) {
        return _initNewV8Int16Array(j, j2, i, i2);
    }

    public long initNewV8Int32Array(long j, long j2, int i, int i2) {
        return _initNewV8Int32Array(j, j2, i, i2);
    }

    public long initNewV8Int8Array(long j, long j2, int i, int i2) {
        return _initNewV8Int8Array(j, j2, i, i2);
    }

    public long initNewV8Object(long j) {
        return _initNewV8Object(j);
    }

    public long initNewV8UInt16Array(long j, long j2, int i, int i2) {
        return _initNewV8UInt16Array(j, j2, i, i2);
    }

    public long initNewV8UInt32Array(long j, long j2, int i, int i2) {
        return _initNewV8UInt32Array(j, j2, i, i2);
    }

    public long initNewV8UInt8Array(long j, long j2, int i, int i2) {
        return _initNewV8UInt8Array(j, j2, i, i2);
    }

    public long initNewV8UInt8ClampedArray(long j, long j2, int i, int i2) {
        return _initNewV8UInt8ClampedArray(j, j2, i, i2);
    }

    public boolean isRunning() {
        return _isRunning(this.v8RuntimePtr);
    }

    public boolean isWeak(long j, long j2) {
        return _isWeak(j, j2);
    }

    public void lowMemoryNotification() {
        checkThread();
        lowMemoryNotification(getV8RuntimePtr());
    }

    public void markSnapshotNotNeed() {
        _markSnapshotNotNeed(this.v8RuntimePtr);
    }

    public void memoryPressureNotification(int i) {
        _memoryPressureNotification(this.v8RuntimePtr, i);
    }

    public void nativeDispatch() {
        _nativeDispatch(this.v8RuntimePtr);
    }

    public void nativeLoopStop() {
        _nativeLoopStop(this.v8RuntimePtr);
    }

    public void nativeMessageLoop() {
        _nativeMessageLoop(this.v8RuntimePtr);
    }

    public void onNativeRunJavaTask() {
        Runnable runnable = this.nativeJavaCallback_;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void onNativeTransMsgDispatchByJava() {
        JavaTaskScheduler javaTaskScheduler = this._javaTaskScheduler;
        if (javaTaskScheduler != null) {
            javaTaskScheduler.Schedule(new Runnable() {
                public void run() {
                    C80135V8._nativeTransHandleMessage(C80135V8.this.v8RuntimePtr);
                }
            });
        }
    }

    public boolean pumpMessageLoop(boolean z) {
        return _pumpMessageLoop(this.v8RuntimePtr, z);
    }

    public void pumpMessageLoopDirect() {
        _pumpMessageLoopDirect(this.v8RuntimePtr);
    }

    public void registerCallback(Object obj, Method method, long j, String str, boolean z) {
        MethodDescriptor methodDescriptor = new MethodDescriptor();
        methodDescriptor.object = obj;
        methodDescriptor.method = method;
        methodDescriptor.includeReceiver = z;
        this.functionRegistry.put(Long.valueOf(registerJavaMethod(getV8RuntimePtr(), j, str, isVoidMethod(method))), methodDescriptor);
    }

    public long registerJavaMethod(long j, long j2, String str, boolean z) {
        return _registerJavaMethod(j, j2, str, z);
    }

    public void registerResource(Releasable releasable) {
        checkThread();
        if (this.resources == null) {
            this.resources = new ArrayList();
        }
        this.resources.add(releasable);
    }

    public void registerV8Executor(V8Object v8Object, V8Executor v8Executor) {
        checkThread();
        if (this.executors == null) {
            this.executors = new V8Map<>();
        }
        this.executors.put((V8Value) v8Object, v8Executor);
    }

    public void registerVoidCallback(JavaVoidCallback javaVoidCallback, long j, String str) {
        MethodDescriptor methodDescriptor = new MethodDescriptor();
        methodDescriptor.voidCallback = javaVoidCallback;
        this.functionRegistry.put(Long.valueOf(registerJavaMethod(getV8RuntimePtr(), j, str, true)), methodDescriptor);
    }

    public void release() {
        release(true);
    }

    public void releaseLock(long j) {
        _releaseLock(j);
    }

    public void releaseMethodDescriptor(long j, long j2) {
        _releaseMethodDescriptor(j, j2);
    }

    public void releaseObjRef(V8Value v8Value) {
        if (!this.referenceHandlers.isEmpty()) {
            notifyReferenceDisposed(v8Value);
        }
        this.objectReferences--;
    }

    public void releaseV8Context(long j) {
        _releaseContext(this.v8RuntimePtr, j);
    }

    public V8Executor removeExecutor(V8Object v8Object) {
        checkThread();
        V8Map<V8Executor> v8Map = this.executors;
        if (v8Map == null) {
            return null;
        }
        return v8Map.remove(v8Object);
    }

    public void removeReferenceHandler(ReferenceHandler referenceHandler) {
        this.referenceHandlers.remove(referenceHandler);
    }

    public void removeReleaseHandler(V8Runnable v8Runnable) {
        this.releaseHandlers.remove(v8Runnable);
    }

    public boolean sameValue(long j, long j2, long j3) {
        return _sameValue(j, j2, j3);
    }

    public synchronized void setData(String str, Object obj) {
        if (this.data == null) {
            this.data = new HashMap();
        }
        this.data.put(str, obj);
    }

    public void setDelaySaveCodeCache(boolean z) {
        _setDelaySaveCodeCache(this.v8RuntimePtr, z);
    }

    public void setJavaTaskScheduler(JavaTaskScheduler javaTaskScheduler) {
        this._javaTaskScheduler = javaTaskScheduler;
        _nativeTransSetJavaSchedule(1);
    }

    public void setMinimalCodeLength(int i) {
        _setMinimalCodeLength(this.v8RuntimePtr, i);
    }

    public void setNativeJavaCallback(Runnable runnable) {
        this.nativeJavaCallback_ = runnable;
    }

    public void setPrototype(long j, long j2, long j3) {
        _setPrototype(j, j2, j3);
    }

    public void setWeak(long j, long j2) {
        _setWeak(j, j2);
    }

    public void shutdownExecutors(boolean z) {
        checkThread();
        V8Map<V8Executor> v8Map = this.executors;
        if (v8Map != null) {
            for (V8Executor next : v8Map.values()) {
                if (z) {
                    next.forceTermination();
                } else {
                    next.shutdown();
                }
            }
        }
    }

    public boolean strictEquals(long j, long j2, long j3) {
        return _strictEquals(j, j2, j3);
    }

    public void switchV8Context(long j) {
        _switchContext(this.v8RuntimePtr, j);
    }

    public void terminateExecution() {
        this.forceTerminateExecutors = true;
        terminateExecution(this.v8RuntimePtr);
    }

    public String toString(long j, long j2) {
        return _toString(j, j2);
    }

    public void waitForDebugger(String str) {
        checkThread();
        _waitForDebuger(this.v8RuntimePtr, str);
    }

    public void waitForDebuggerWithContexts(String str, long[] jArr, String[] strArr) {
        checkThread();
        _waitForDebuggerWithContexts(this.v8RuntimePtr, str, jArr, strArr);
    }

    public void wakeUpUVLoop() {
        _wakeUpUVLoop(this.v8RuntimePtr);
    }

    public void weakReferenceReleased(long j) {
        V8Value v8Value = this.v8WeakReferences.get(Long.valueOf(j));
        if (v8Value != null) {
            this.v8WeakReferences.remove(Long.valueOf(j));
            try {
                v8Value.release();
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public C80135V8(String str, boolean z, byte[] bArr, String str2, boolean z2) {
        super((C80135V8) null);
        this.v8WeakReferences = new HashMap();
        this.data = null;
        this.objectReferences = 0;
        this.v8RuntimePtr = 0;
        this.resources = null;
        this.executors = null;
        this.forceTerminateExecutors = false;
        this.functionRegistry = new HashMap();
        this.referenceHandlers = new LinkedList<>();
        this.releaseHandlers = new LinkedList<>();
        this._javaTaskScheduler = null;
        this.released = false;
        try {
            V8TracerAccessible.beginSection("CreateIsolate");
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.v8RuntimePtr = _createIsolate(str, z, bArr, str2, z2);
            this.isolateCreateDurationMills = SystemClock.elapsedRealtime() - elapsedRealtime;
            V8TracerAccessible.endSection();
            this.locker = new V8Locker(this);
            checkThread();
            if (z) {
                this.objectHandle = _getGlobalObject(this.v8RuntimePtr);
            }
        } catch (Throwable th) {
            V8TracerAccessible.endSection();
            throw th;
        }
    }

    public static C80135V8 createV8Runtime(String str) {
        return createV8Runtime(str, (String) null);
    }

    public void add(long j, long j2, String str, boolean z) {
        _add(j, j2, str, z);
    }

    public int arrayGetBooleans(long j, long j2, int i, int i2, boolean[] zArr) {
        return _arrayGetBooleans(j, j2, i, i2, zArr);
    }

    public int arrayGetBytes(long j, long j2, int i, int i2, byte[] bArr) {
        return _arrayGetBytes(j, j2, i, i2, bArr);
    }

    public int arrayGetDoubles(long j, long j2, int i, int i2, double[] dArr) {
        return _arrayGetDoubles(j, j2, i, i2, dArr);
    }

    public int arrayGetIntegers(long j, long j2, int i, int i2, int[] iArr) {
        return _arrayGetIntegers(j, j2, i, i2, iArr);
    }

    public int arrayGetStrings(long j, long j2, int i, int i2, String[] strArr) {
        return _arrayGetStrings(j, j2, i, i2, strArr);
    }

    public V8Array executeArrayScript(String str, String str2, int i) {
        return executeArrayScript(str, str2, i, (String) null, (String) null, 0, (ExecuteDetails) null);
    }

    public boolean executeBooleanScript(String str, String str2, int i) {
        return executeBooleanScript(str, str2, i, (String) null, (String) null, 0, (ExecuteDetails) null);
    }

    public double executeDoubleScript(String str, String str2, int i) {
        return executeDoubleScript(str, str2, i, (String) null, (String) null, 0, (ExecuteDetails) null);
    }

    public Object executeFunction(long j, long j2, long j3, long j4) {
        return _executeFunction(j, j2, j3, j4);
    }

    public int executeIntegerScript(String str, String str2, int i) {
        return executeIntegerScript(str, str2, i, (String) null, (String) null, 0, (ExecuteDetails) null);
    }

    public V8Object executeObjectScript(String str, String str2, int i) {
        return executeObjectScript(str, str2, i, (String) null, (String) null, 0, (ExecuteDetails) null);
    }

    public Object executeScript(String str, String str2, int i) {
        return executeScript(str, str2, i, (String) null, (String) null, 0, (ExecuteDetails) null);
    }

    public String executeStringScript(String str, String str2, int i) {
        return executeStringScript(str, str2, i, (String) null, (String) null, 0, (ExecuteDetails) null);
    }

    public void executeVoidScript(String str, String str2, int i) {
        executeVoidScript(str, str2, i, (String) null, (String) null, 0, (ExecuteDetails) null);
    }

    public int getType(long j, long j2, String str) {
        return _getType(j, j2, str);
    }

    public long initNewV8ArrayBuffer(long j, int i) {
        return _initNewV8ArrayBuffer(j, i);
    }

    public void release(boolean z) {
        if (!isReleased()) {
            checkThread();
            try {
                notifyReleaseHandlers(this);
                releaseResources();
                shutdownExecutors(this.forceTerminateExecutors);
                V8Map<V8Executor> v8Map = this.executors;
                if (v8Map != null) {
                    v8Map.clear();
                }
                releaseNativeMethodDescriptors();
                synchronized (lock) {
                    runtimeCounter--;
                }
                this.locker.release();
                _releaseRuntime(this.v8RuntimePtr);
                this.v8RuntimePtr = 0;
                this.released = true;
                if (z && getObjectReferenceCount() > 0) {
                    throw new IllegalStateException(this.objectReferences + " Object(s) still exist in runtime");
                }
            } catch (Throwable th) {
                releaseResources();
                shutdownExecutors(this.forceTerminateExecutors);
                if (this.executors != null) {
                    this.executors.clear();
                }
                releaseNativeMethodDescriptors();
                synchronized (lock) {
                    runtimeCounter--;
                    this.locker.release();
                    _releaseRuntime(this.v8RuntimePtr);
                    this.v8RuntimePtr = 0;
                    this.released = true;
                    if (!z || getObjectReferenceCount() <= 0) {
                        throw th;
                    }
                    throw new IllegalStateException(this.objectReferences + " Object(s) still exist in runtime");
                }
            }
        }
    }

    public static C80135V8 createV8Runtime(String str, String str2) {
        return createV8Runtime(str, str2, true, (String) null, (byte[]) null);
    }

    public void add(long j, long j2, String str, double d) {
        _add(j, j2, str, d);
    }

    public void createTwin(long j, long j2, long j3) {
        _createTwin(j, j2, j3);
    }

    public V8Array executeArrayScript(String str, String str2, int i, String str3, String str4, int i2, ExecuteDetails executeDetails) {
        checkThread();
        Object executeScript = executeScript(str, str2, i, str3, str4, i2, executeDetails);
        if (executeScript instanceof V8Array) {
            return (V8Array) executeScript;
        }
        throw new V8ResultUndefined();
    }

    public boolean executeBooleanScript(String str, String str2, int i, String str3, String str4, int i2, ExecuteDetails executeDetails) {
        checkThread();
        checkScript(str);
        return executeBooleanScript(this.v8RuntimePtr, str, str2, i, str3, str4, i2, executeDetails);
    }

    public double executeDoubleScript(String str, String str2, int i, String str3, String str4, int i2, ExecuteDetails executeDetails) {
        checkThread();
        checkScript(str);
        return executeDoubleScript(this.v8RuntimePtr, str, str2, i, str3, str4, i2, executeDetails);
    }

    public int executeIntegerScript(String str, String str2, int i, String str3, String str4, int i2, ExecuteDetails executeDetails) {
        checkThread();
        checkScript(str);
        return executeIntegerScript(this.v8RuntimePtr, str, str2, i, str3, str4, i2, executeDetails);
    }

    public V8Object executeObjectScript(String str, String str2, int i, String str3, String str4, int i2, ExecuteDetails executeDetails) {
        checkThread();
        Object executeScript = executeScript(str, str2, i, str3, str4, i2, executeDetails);
        if (executeScript instanceof V8Object) {
            return (V8Object) executeScript;
        }
        throw new V8ResultUndefined();
    }

    public Object executeScript(String str, String str2, int i, String str3, String str4, int i2, ExecuteDetails executeDetails) {
        checkThread();
        checkScript(str);
        return executeScript(getV8RuntimePtr(), 0, str, str2, i, str3, str4, i2, executeDetails);
    }

    public String executeStringScript(String str, String str2, int i, String str3, String str4, int i2, ExecuteDetails executeDetails) {
        checkThread();
        checkScript(str);
        return executeStringScript(this.v8RuntimePtr, str, str2, i, str3, str4, i2, executeDetails);
    }

    public void executeVoidScript(String str, String str2, int i, String str3, String str4, int i2, ExecuteDetails executeDetails) {
        checkThread();
        checkScript(str);
        executeVoidScript(this.v8RuntimePtr, str, str2, i, str3, str4, i2, executeDetails);
    }

    public int getType(long j, long j2, int i) {
        return _getType(j, j2, i);
    }

    public void lowMemoryNotification(long j) {
        _lowMemoryNotification(j);
    }

    public void terminateExecution(long j) {
        _terminateExecution(j);
    }

    public static C80135V8 createV8Runtime(String str, String str2, boolean z) {
        return createV8Runtime(str, str2, z, (String) null, (byte[]) null);
    }

    public void add(long j, long j2, String str, String str2) {
        _add(j, j2, str, str2);
    }

    public Object executeFileScript(long j, int i, V8ScriptFileDescriptor v8ScriptFileDescriptor, String str, int i2, String str2, String str3, int i3, ExecuteDetails executeDetails) {
        return _executeFileScript(j, i, v8ScriptFileDescriptor, str, i2, str2, str3, i3, executeDetails);
    }

    public int getType(long j, long j2, int i, int i2) {
        return _getType(j, j2, i, i2);
    }

    public static C80135V8 createV8Runtime(String str, String str2, boolean z, String str3, byte[] bArr) {
        return createV8Runtime(str, str2, z, str3, bArr, (String) null, false);
    }

    public Object batchExecuteScripts(long j, V8ScriptEvaluateRequest[] v8ScriptEvaluateRequestArr, String str, ExecuteDetails executeDetails) {
        return _batchExecuteScripts(j, v8ScriptEvaluateRequestArr, str, executeDetails);
    }

    public static C80135V8 createV8Runtime(String str, String str2, boolean z, String str3, byte[] bArr, String str4, boolean z2) {
        if (!nativeLibraryLoaded) {
            synchronized (lock) {
                if (!nativeLibraryLoaded) {
                    load(str2);
                }
            }
        }
        checkNativeLibraryLoaded();
        if (sCachedProtectCreateContextFromSnapshot.compareAndSet(true, false)) {
            _protectCreateContextFromSnapshot();
        }
        C80135V8 v8 = new C80135V8(str, z, bArr, str4, z2);
        if (str3 != null) {
            v8._setCodeCacheDir(v8.v8RuntimePtr, str3);
        }
        synchronized (lock) {
            runtimeCounter++;
        }
        return v8;
    }

    public boolean executeBooleanScript(long j, String str, String str2, int i, String str3, String str4, int i2, ExecuteDetails executeDetails) {
        return _executeBooleanScript(j, str, str2, i, str3, str4, i2, executeDetails);
    }

    public double executeDoubleScript(long j, String str, String str2, int i, String str3, String str4, int i2, ExecuteDetails executeDetails) {
        return _executeDoubleScript(j, str, str2, i, str3, str4, i2, executeDetails);
    }

    public int executeIntegerScript(long j, String str, String str2, int i, String str3, String str4, int i2, ExecuteDetails executeDetails) {
        return _executeIntegerScript(j, str, str2, i, str3, str4, i2, executeDetails);
    }

    public Object executeScript(long j, int i, String str, String str2, int i2, String str3, String str4, int i3, ExecuteDetails executeDetails) {
        return _executeScript(j, i, str, str2, i2, str3, str4, i3, executeDetails);
    }

    public String executeStringScript(long j, String str, String str2, int i, String str3, String str4, int i2, ExecuteDetails executeDetails) {
        return _executeStringScript(j, str, str2, i, str3, str4, i2, executeDetails);
    }

    public void executeVoidScript(long j, String str, String str2, int i, String str3, String str4, int i2, ExecuteDetails executeDetails) {
        _executeVoidScript(j, str, str2, i, str3, str4, i2, executeDetails);
    }

    public void registerCallback(JavaCallback javaCallback, long j, String str) {
        createAndRegisterMethodDescriptor(javaCallback, registerJavaMethod(getV8RuntimePtr(), j, str, false));
    }

    public void release(long j, long j2) {
        _release(j, j2);
    }
}
