package com.eclipsesource.mmv8.utils;

import com.eclipsesource.mmv8.C80135V8;
import com.eclipsesource.mmv8.Releasable;
import com.eclipsesource.mmv8.V8Array;
import com.eclipsesource.mmv8.V8ArrayBuffer;
import com.eclipsesource.mmv8.V8Context;
import com.eclipsesource.mmv8.V8Object;
import com.eclipsesource.mmv8.V8TypedArray;
import com.eclipsesource.mmv8.V8Value;
import com.eclipsesource.mmv8.utils.typedarrays.ArrayBuffer;
import com.eclipsesource.mmv8.utils.typedarrays.Float32Array;
import com.eclipsesource.mmv8.utils.typedarrays.Float64Array;
import com.eclipsesource.mmv8.utils.typedarrays.Int16Array;
import com.eclipsesource.mmv8.utils.typedarrays.Int32Array;
import com.eclipsesource.mmv8.utils.typedarrays.Int8Array;
import com.eclipsesource.mmv8.utils.typedarrays.TypedArray;
import com.eclipsesource.mmv8.utils.typedarrays.UInt16Array;
import com.eclipsesource.mmv8.utils.typedarrays.UInt32Array;
import com.eclipsesource.mmv8.utils.typedarrays.UInt8Array;
import com.eclipsesource.mmv8.utils.typedarrays.UInt8ClampedArray;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class V8ObjectUtils {
    private static final TypeAdapter DEFAULT_TYPE_ADAPTER = new DefaultTypeAdapter();
    private static final Object IGNORE = new Object();

    public static class DefaultTypeAdapter implements TypeAdapter {
        public Object adapt(int i, Object obj) {
            return TypeAdapter.DEFAULT;
        }
    }

    public static class ListWrapper {
        private List<? extends Object> list;

        public ListWrapper(List<? extends Object> list2) {
            this.list = list2;
        }

        public boolean equals(Object obj) {
            return (obj instanceof ListWrapper) && ((ListWrapper) obj).list == this.list;
        }

        public int hashCode() {
            return System.identityHashCode(this.list);
        }
    }

    private V8ObjectUtils() {
    }

    public static Object getTypedArray(V8Array v8Array, int i, Object obj) {
        int length = v8Array.length();
        if (i == 1) {
            int[] iArr = (int[]) obj;
            if (iArr == null || iArr.length < length) {
                iArr = new int[length];
            }
            v8Array.getIntegers(0, length, iArr);
            return iArr;
        } else if (i == 2) {
            double[] dArr = (double[]) obj;
            if (dArr == null || dArr.length < length) {
                dArr = new double[length];
            }
            v8Array.getDoubles(0, length, dArr);
            return dArr;
        } else if (i == 3) {
            boolean[] zArr = (boolean[]) obj;
            if (zArr == null || zArr.length < length) {
                zArr = new boolean[length];
            }
            v8Array.getBooleans(0, length, zArr);
            return zArr;
        } else if (i == 4) {
            String[] strArr = (String[]) obj;
            if (strArr == null || strArr.length < length) {
                strArr = new String[length];
            }
            v8Array.getStrings(0, length, strArr);
            return strArr;
        } else if (i == 9) {
            byte[] bArr = (byte[]) obj;
            if (bArr == null || bArr.length < length) {
                bArr = new byte[length];
            }
            v8Array.getBytes(0, length, bArr);
            return bArr;
        } else {
            throw new RuntimeException("Unsupported bulk load type: " + i);
        }
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public static java.lang.Object getV8Result(com.eclipsesource.mmv8.C80135V8 r1, java.lang.Object r2) {
        /*
            if (r2 != 0) goto L_0x0004
            r1 = 0
            return r1
        L_0x0004:
            java.util.Hashtable r0 = new java.util.Hashtable
            r0.<init>()
            java.lang.Object r1 = getV8Result((com.eclipsesource.mmv8.C80135V8) r1, (java.lang.Object) r2, (java.util.Map<java.lang.Object, com.eclipsesource.mmv8.V8Value>) r0)     // Catch:{ all -> 0x0049 }
            boolean r2 = r1 instanceof com.eclipsesource.mmv8.V8Object     // Catch:{ all -> 0x0049 }
            if (r2 == 0) goto L_0x0030
            com.eclipsesource.mmv8.V8Object r1 = (com.eclipsesource.mmv8.V8Object) r1     // Catch:{ all -> 0x0049 }
            com.eclipsesource.mmv8.V8Object r1 = r1.twin()     // Catch:{ all -> 0x0049 }
            java.util.Collection r2 = r0.values()
            java.util.Iterator r2 = r2.iterator()
        L_0x001f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x002f
            java.lang.Object r0 = r2.next()
            com.eclipsesource.mmv8.V8Value r0 = (com.eclipsesource.mmv8.V8Value) r0
            r0.release()
            goto L_0x001f
        L_0x002f:
            return r1
        L_0x0030:
            java.util.Collection r2 = r0.values()
            java.util.Iterator r2 = r2.iterator()
        L_0x0038:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0048
            java.lang.Object r0 = r2.next()
            com.eclipsesource.mmv8.V8Value r0 = (com.eclipsesource.mmv8.V8Value) r0
            r0.release()
            goto L_0x0038
        L_0x0048:
            return r1
        L_0x0049:
            r1 = move-exception
            java.util.Collection r2 = r0.values()
            java.util.Iterator r2 = r2.iterator()
        L_0x0052:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0062
            java.lang.Object r0 = r2.next()
            com.eclipsesource.mmv8.V8Value r0 = (com.eclipsesource.mmv8.V8Value) r0
            r0.release()
            goto L_0x0052
        L_0x0062:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.eclipsesource.mmv8.utils.V8ObjectUtils.getV8Result(com.eclipsesource.mmv8.V8, java.lang.Object):java.lang.Object");
    }

    public static Object getValue(Object obj) {
        return getValue(obj, DEFAULT_TYPE_ADAPTER);
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public static void pushValue(com.eclipsesource.mmv8.C80135V8 r1, com.eclipsesource.mmv8.V8Array r2, java.lang.Object r3) {
        /*
            java.util.Hashtable r0 = new java.util.Hashtable
            r0.<init>()
            pushValue((com.eclipsesource.mmv8.C80135V8) r1, (com.eclipsesource.mmv8.V8Array) r2, (java.lang.Object) r3, (java.util.Map<java.lang.Object, com.eclipsesource.mmv8.V8Value>) r0)     // Catch:{ all -> 0x0021 }
            java.util.Collection r1 = r0.values()
            java.util.Iterator r1 = r1.iterator()
        L_0x0010:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0020
            java.lang.Object r2 = r1.next()
            com.eclipsesource.mmv8.V8Value r2 = (com.eclipsesource.mmv8.V8Value) r2
            r2.release()
            goto L_0x0010
        L_0x0020:
            return
        L_0x0021:
            r1 = move-exception
            java.util.Collection r2 = r0.values()
            java.util.Iterator r2 = r2.iterator()
        L_0x002a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x003a
            java.lang.Object r3 = r2.next()
            com.eclipsesource.mmv8.V8Value r3 = (com.eclipsesource.mmv8.V8Value) r3
            r3.release()
            goto L_0x002a
        L_0x003a:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.eclipsesource.mmv8.utils.V8ObjectUtils.pushValue(com.eclipsesource.mmv8.V8, com.eclipsesource.mmv8.V8Array, java.lang.Object):void");
    }

    private static void setValue(C80135V8 v8, V8Object v8Object, String str, Object obj, Map<Object, V8Value> map) {
        if (obj == null) {
            v8Object.addUndefined(str);
        } else if (obj instanceof Integer) {
            v8Object.add(str, ((Integer) obj).intValue());
        } else if (obj instanceof Long) {
            v8Object.add(str, (double) ((Long) obj).longValue());
        } else if (obj instanceof Double) {
            v8Object.add(str, ((Double) obj).doubleValue());
        } else if (obj instanceof Float) {
            v8Object.add(str, (double) ((Float) obj).floatValue());
        } else if (obj instanceof String) {
            v8Object.add(str, (String) obj);
        } else if (obj instanceof Boolean) {
            v8Object.add(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof V8Object) {
            v8Object.add(str, (V8Value) (V8Object) obj);
        } else if (obj instanceof TypedArray) {
            v8Object.add(str, (V8Value) toV8TypedArray(v8, (TypedArray) obj, map));
        } else if (obj instanceof ArrayBuffer) {
            v8Object.add(str, (V8Value) toV8ArrayBuffer(v8, (ArrayBuffer) obj, map));
        } else if (obj instanceof Map) {
            v8Object.add(str, (V8Value) toV8Object(v8, (Map<String, ? extends Object>) (Map) obj, map));
        } else if (obj instanceof List) {
            v8Object.add(str, (V8Value) toV8Array(v8, (List<? extends Object>) (List) obj, map));
        } else {
            throw new IllegalStateException("Unsupported Object of type: " + obj.getClass());
        }
    }

    public static List<? super Object> toList(V8Array v8Array) {
        return toList(v8Array, DEFAULT_TYPE_ADAPTER);
    }

    public static Map<String, ? super Object> toMap(V8Object v8Object) {
        return toMap(v8Object, DEFAULT_TYPE_ADAPTER);
    }

    private static Object toTypedArray(V8Array v8Array) {
        int type = v8Array.getType();
        ByteBuffer byteBuffer = ((V8TypedArray) v8Array).getByteBuffer();
        if (type == 1) {
            return new Int32Array(byteBuffer);
        }
        if (type == 2) {
            return new Float64Array(byteBuffer);
        }
        if (type == 9) {
            return new Int8Array(byteBuffer);
        }
        switch (type) {
            case 11:
                return new UInt8Array(byteBuffer);
            case 12:
                return new UInt8ClampedArray(byteBuffer);
            case 13:
                return new Int16Array(byteBuffer);
            case 14:
                return new UInt16Array(byteBuffer);
            case 15:
                return new UInt32Array(byteBuffer);
            case 16:
                return new Float32Array(byteBuffer);
            default:
                throw new IllegalStateException("Known Typed Array type: " + V8Value.getStringRepresentation(type));
        }
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public static com.eclipsesource.mmv8.V8Array toV8Array(com.eclipsesource.mmv8.C80135V8 r1, java.util.List<? extends java.lang.Object> r2) {
        /*
            java.util.Hashtable r0 = new java.util.Hashtable
            r0.<init>()
            com.eclipsesource.mmv8.V8Array r1 = toV8Array((com.eclipsesource.mmv8.C80135V8) r1, (java.util.List<? extends java.lang.Object>) r2, (java.util.Map<java.lang.Object, com.eclipsesource.mmv8.V8Value>) r0)     // Catch:{ all -> 0x0026 }
            com.eclipsesource.mmv8.V8Array r1 = r1.twin()     // Catch:{ all -> 0x0026 }
            java.util.Collection r2 = r0.values()
            java.util.Iterator r2 = r2.iterator()
        L_0x0015:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0025
            java.lang.Object r0 = r2.next()
            com.eclipsesource.mmv8.V8Value r0 = (com.eclipsesource.mmv8.V8Value) r0
            r0.release()
            goto L_0x0015
        L_0x0025:
            return r1
        L_0x0026:
            r1 = move-exception
            java.util.Collection r2 = r0.values()
            java.util.Iterator r2 = r2.iterator()
        L_0x002f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x003f
            java.lang.Object r0 = r2.next()
            com.eclipsesource.mmv8.V8Value r0 = (com.eclipsesource.mmv8.V8Value) r0
            r0.release()
            goto L_0x002f
        L_0x003f:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.eclipsesource.mmv8.utils.V8ObjectUtils.toV8Array(com.eclipsesource.mmv8.V8, java.util.List):com.eclipsesource.mmv8.V8Array");
    }

    private static V8ArrayBuffer toV8ArrayBuffer(C80135V8 v8, ArrayBuffer arrayBuffer, Map<Object, V8Value> map) {
        if (map.containsKey(arrayBuffer)) {
            return (V8ArrayBuffer) map.get(arrayBuffer);
        }
        V8ArrayBuffer v8ArrayBuffer = new V8ArrayBuffer(v8, arrayBuffer.getByteBuffer());
        map.put(arrayBuffer, v8ArrayBuffer);
        return v8ArrayBuffer;
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public static com.eclipsesource.mmv8.V8Object toV8Object(com.eclipsesource.mmv8.C80135V8 r1, java.util.Map<java.lang.String, ? extends java.lang.Object> r2) {
        /*
            java.util.Hashtable r0 = new java.util.Hashtable
            r0.<init>()
            com.eclipsesource.mmv8.V8Object r1 = toV8Object((com.eclipsesource.mmv8.C80135V8) r1, (java.util.Map<java.lang.String, ? extends java.lang.Object>) r2, (java.util.Map<java.lang.Object, com.eclipsesource.mmv8.V8Value>) r0)     // Catch:{ all -> 0x0026 }
            com.eclipsesource.mmv8.V8Object r1 = r1.twin()     // Catch:{ all -> 0x0026 }
            java.util.Collection r2 = r0.values()
            java.util.Iterator r2 = r2.iterator()
        L_0x0015:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0025
            java.lang.Object r0 = r2.next()
            com.eclipsesource.mmv8.V8Value r0 = (com.eclipsesource.mmv8.V8Value) r0
            r0.release()
            goto L_0x0015
        L_0x0025:
            return r1
        L_0x0026:
            r1 = move-exception
            java.util.Collection r2 = r0.values()
            java.util.Iterator r2 = r2.iterator()
        L_0x002f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x003f
            java.lang.Object r0 = r2.next()
            com.eclipsesource.mmv8.V8Value r0 = (com.eclipsesource.mmv8.V8Value) r0
            r0.release()
            goto L_0x002f
        L_0x003f:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.eclipsesource.mmv8.utils.V8ObjectUtils.toV8Object(com.eclipsesource.mmv8.V8, java.util.Map):com.eclipsesource.mmv8.V8Object");
    }

    private static V8TypedArray toV8TypedArray(C80135V8 v8, TypedArray typedArray, Map<Object, V8Value> map) {
        if (map.containsKey(typedArray)) {
            return (V8TypedArray) map.get(typedArray);
        }
        V8ArrayBuffer v8ArrayBuffer = new V8ArrayBuffer(v8, typedArray.getByteBuffer());
        try {
            V8TypedArray v8TypedArray = new V8TypedArray(v8, v8ArrayBuffer, typedArray.getType(), 0, typedArray.length());
            map.put(typedArray, v8TypedArray);
            return v8TypedArray;
        } finally {
            v8ArrayBuffer.release();
        }
    }

    public static Object getValue(Object obj, TypeAdapter typeAdapter) {
        V8Map v8Map = new V8Map();
        try {
            if (obj instanceof V8Value) {
                return getValue(obj, ((V8Value) obj).getV8Type(), v8Map, typeAdapter);
            }
            v8Map.release();
            return obj;
        } finally {
            v8Map.release();
        }
    }

    public static List<? super Object> toList(V8Array v8Array, TypeAdapter typeAdapter) {
        V8Map v8Map = new V8Map();
        try {
            return toList(v8Array, v8Map, typeAdapter);
        } finally {
            v8Map.release();
        }
    }

    public static Map<String, ? super Object> toMap(V8Object v8Object, TypeAdapter typeAdapter) {
        V8Map v8Map = new V8Map();
        try {
            return toMap(v8Object, v8Map, typeAdapter);
        } finally {
            v8Map.release();
        }
    }

    private static V8ArrayBuffer toV8ArrayBuffer(V8Context v8Context, ArrayBuffer arrayBuffer, Map<Object, V8Value> map) {
        if (map.containsKey(arrayBuffer)) {
            return (V8ArrayBuffer) map.get(arrayBuffer);
        }
        V8ArrayBuffer newV8ArrayBuffer = v8Context.newV8ArrayBuffer(arrayBuffer.getByteBuffer());
        map.put(arrayBuffer, newV8ArrayBuffer);
        return newV8ArrayBuffer;
    }

    private static List<? super Object> toList(V8Array v8Array, V8Map<Object> v8Map, TypeAdapter typeAdapter) {
        if (v8Array == null) {
            return Collections.emptyList();
        }
        if (v8Map.containsKey(v8Array)) {
            return (List) v8Map.get(v8Array);
        }
        ArrayList arrayList = new ArrayList();
        v8Map.put((V8Value) v8Array, arrayList);
        int i = 0;
        while (i < v8Array.length()) {
            Object obj = null;
            try {
                obj = v8Array.get(i);
                Object value = getValue(obj, v8Array.getType(i), v8Map, typeAdapter);
                if (value != IGNORE) {
                    arrayList.add(value);
                }
                i++;
            } finally {
                if (obj instanceof Releasable) {
                    obj.release();
                }
            }
        }
        return arrayList;
    }

    private static Map<String, ? super Object> toMap(V8Object v8Object, V8Map<Object> v8Map, TypeAdapter typeAdapter) {
        if (v8Object == null) {
            return Collections.emptyMap();
        }
        if (v8Map.containsKey(v8Object)) {
            return (Map) v8Map.get(v8Object);
        }
        V8PropertyMap v8PropertyMap = new V8PropertyMap();
        v8Map.put((V8Value) v8Object, v8PropertyMap);
        String[] keys = v8Object.getKeys();
        int length = keys.length;
        int i = 0;
        while (i < length) {
            String str = keys[i];
            Object obj = null;
            try {
                obj = v8Object.get(str);
                Object value = getValue(obj, v8Object.getType(str), v8Map, typeAdapter);
                if (value != IGNORE) {
                    v8PropertyMap.put(str, value);
                }
                i++;
            } finally {
                if (obj instanceof Releasable) {
                    obj.release();
                }
            }
        }
        return v8PropertyMap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object getValue(com.eclipsesource.mmv8.V8Array r2, int r3) {
        /*
            com.eclipsesource.mmv8.utils.V8Map r0 = new com.eclipsesource.mmv8.utils.V8Map
            r0.<init>()
            java.lang.Object r1 = r2.get(r3)     // Catch:{ all -> 0x0022 }
            int r2 = r2.getType(r3)     // Catch:{ all -> 0x0020 }
            com.eclipsesource.mmv8.utils.TypeAdapter r3 = DEFAULT_TYPE_ADAPTER     // Catch:{ all -> 0x0020 }
            java.lang.Object r2 = getValue(r1, r2, r0, r3)     // Catch:{ all -> 0x0020 }
            boolean r3 = r1 instanceof com.eclipsesource.mmv8.Releasable
            if (r3 == 0) goto L_0x001c
            com.eclipsesource.mmv8.Releasable r1 = (com.eclipsesource.mmv8.Releasable) r1
            r1.release()
        L_0x001c:
            r0.release()
            return r2
        L_0x0020:
            r2 = move-exception
            goto L_0x0024
        L_0x0022:
            r2 = move-exception
            r1 = 0
        L_0x0024:
            boolean r3 = r1 instanceof com.eclipsesource.mmv8.Releasable
            if (r3 == 0) goto L_0x002d
            com.eclipsesource.mmv8.Releasable r1 = (com.eclipsesource.mmv8.Releasable) r1
            r1.release()
        L_0x002d:
            r0.release()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.eclipsesource.mmv8.utils.V8ObjectUtils.getValue(com.eclipsesource.mmv8.V8Array, int):java.lang.Object");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public static void pushValue(com.eclipsesource.mmv8.V8Context r1, com.eclipsesource.mmv8.V8Array r2, java.lang.Object r3) {
        /*
            java.util.Hashtable r0 = new java.util.Hashtable
            r0.<init>()
            pushValue((com.eclipsesource.mmv8.V8Context) r1, (com.eclipsesource.mmv8.V8Array) r2, (java.lang.Object) r3, (java.util.Map<java.lang.Object, com.eclipsesource.mmv8.V8Value>) r0)     // Catch:{ all -> 0x0021 }
            java.util.Collection r1 = r0.values()
            java.util.Iterator r1 = r1.iterator()
        L_0x0010:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0020
            java.lang.Object r2 = r1.next()
            com.eclipsesource.mmv8.V8Value r2 = (com.eclipsesource.mmv8.V8Value) r2
            r2.release()
            goto L_0x0010
        L_0x0020:
            return
        L_0x0021:
            r1 = move-exception
            java.util.Collection r2 = r0.values()
            java.util.Iterator r2 = r2.iterator()
        L_0x002a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x003a
            java.lang.Object r3 = r2.next()
            com.eclipsesource.mmv8.V8Value r3 = (com.eclipsesource.mmv8.V8Value) r3
            r3.release()
            goto L_0x002a
        L_0x003a:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.eclipsesource.mmv8.utils.V8ObjectUtils.pushValue(com.eclipsesource.mmv8.V8Context, com.eclipsesource.mmv8.V8Array, java.lang.Object):void");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public static com.eclipsesource.mmv8.V8Array toV8Array(com.eclipsesource.mmv8.V8Context r1, java.util.List<? extends java.lang.Object> r2) {
        /*
            java.util.Hashtable r0 = new java.util.Hashtable
            r0.<init>()
            com.eclipsesource.mmv8.V8Array r1 = toV8Array((com.eclipsesource.mmv8.V8Context) r1, (java.util.List<? extends java.lang.Object>) r2, (java.util.Map<java.lang.Object, com.eclipsesource.mmv8.V8Value>) r0)     // Catch:{ all -> 0x0026 }
            com.eclipsesource.mmv8.V8Array r1 = r1.twin()     // Catch:{ all -> 0x0026 }
            java.util.Collection r2 = r0.values()
            java.util.Iterator r2 = r2.iterator()
        L_0x0015:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0025
            java.lang.Object r0 = r2.next()
            com.eclipsesource.mmv8.V8Value r0 = (com.eclipsesource.mmv8.V8Value) r0
            r0.release()
            goto L_0x0015
        L_0x0025:
            return r1
        L_0x0026:
            r1 = move-exception
            java.util.Collection r2 = r0.values()
            java.util.Iterator r2 = r2.iterator()
        L_0x002f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x003f
            java.lang.Object r0 = r2.next()
            com.eclipsesource.mmv8.V8Value r0 = (com.eclipsesource.mmv8.V8Value) r0
            r0.release()
            goto L_0x002f
        L_0x003f:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.eclipsesource.mmv8.utils.V8ObjectUtils.toV8Array(com.eclipsesource.mmv8.V8Context, java.util.List):com.eclipsesource.mmv8.V8Array");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public static com.eclipsesource.mmv8.V8Object toV8Object(com.eclipsesource.mmv8.V8Context r1, java.util.Map<java.lang.String, ? extends java.lang.Object> r2) {
        /*
            java.util.Hashtable r0 = new java.util.Hashtable
            r0.<init>()
            com.eclipsesource.mmv8.V8Object r1 = toV8Object((com.eclipsesource.mmv8.V8Context) r1, (java.util.Map<java.lang.String, ? extends java.lang.Object>) r2, (java.util.Map<java.lang.Object, com.eclipsesource.mmv8.V8Value>) r0)     // Catch:{ all -> 0x0026 }
            com.eclipsesource.mmv8.V8Object r1 = r1.twin()     // Catch:{ all -> 0x0026 }
            java.util.Collection r2 = r0.values()
            java.util.Iterator r2 = r2.iterator()
        L_0x0015:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0025
            java.lang.Object r0 = r2.next()
            com.eclipsesource.mmv8.V8Value r0 = (com.eclipsesource.mmv8.V8Value) r0
            r0.release()
            goto L_0x0015
        L_0x0025:
            return r1
        L_0x0026:
            r1 = move-exception
            java.util.Collection r2 = r0.values()
            java.util.Iterator r2 = r2.iterator()
        L_0x002f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x003f
            java.lang.Object r0 = r2.next()
            com.eclipsesource.mmv8.V8Value r0 = (com.eclipsesource.mmv8.V8Value) r0
            r0.release()
            goto L_0x002f
        L_0x003f:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.eclipsesource.mmv8.utils.V8ObjectUtils.toV8Object(com.eclipsesource.mmv8.V8Context, java.util.Map):com.eclipsesource.mmv8.V8Object");
    }

    private static V8TypedArray toV8TypedArray(V8Context v8Context, TypedArray typedArray, Map<Object, V8Value> map) {
        if (map.containsKey(typedArray)) {
            return (V8TypedArray) map.get(typedArray);
        }
        V8ArrayBuffer newV8ArrayBuffer = v8Context.newV8ArrayBuffer(typedArray.getByteBuffer());
        try {
            V8TypedArray newV8TypedArray = v8Context.newV8TypedArray(newV8ArrayBuffer, typedArray.getType(), 0, typedArray.length());
            map.put(typedArray, newV8TypedArray);
            return newV8TypedArray;
        } finally {
            newV8ArrayBuffer.release();
        }
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public static java.lang.Object getV8Result(com.eclipsesource.mmv8.V8Context r1, java.lang.Object r2) {
        /*
            if (r2 != 0) goto L_0x0004
            r1 = 0
            return r1
        L_0x0004:
            java.util.Hashtable r0 = new java.util.Hashtable
            r0.<init>()
            java.lang.Object r1 = getV8Result((com.eclipsesource.mmv8.V8Context) r1, (java.lang.Object) r2, (java.util.Map<java.lang.Object, com.eclipsesource.mmv8.V8Value>) r0)     // Catch:{ all -> 0x0049 }
            boolean r2 = r1 instanceof com.eclipsesource.mmv8.V8Object     // Catch:{ all -> 0x0049 }
            if (r2 == 0) goto L_0x0030
            com.eclipsesource.mmv8.V8Object r1 = (com.eclipsesource.mmv8.V8Object) r1     // Catch:{ all -> 0x0049 }
            com.eclipsesource.mmv8.V8Object r1 = r1.twin()     // Catch:{ all -> 0x0049 }
            java.util.Collection r2 = r0.values()
            java.util.Iterator r2 = r2.iterator()
        L_0x001f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x002f
            java.lang.Object r0 = r2.next()
            com.eclipsesource.mmv8.V8Value r0 = (com.eclipsesource.mmv8.V8Value) r0
            r0.release()
            goto L_0x001f
        L_0x002f:
            return r1
        L_0x0030:
            java.util.Collection r2 = r0.values()
            java.util.Iterator r2 = r2.iterator()
        L_0x0038:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0048
            java.lang.Object r0 = r2.next()
            com.eclipsesource.mmv8.V8Value r0 = (com.eclipsesource.mmv8.V8Value) r0
            r0.release()
            goto L_0x0038
        L_0x0048:
            return r1
        L_0x0049:
            r1 = move-exception
            java.util.Collection r2 = r0.values()
            java.util.Iterator r2 = r2.iterator()
        L_0x0052:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0062
            java.lang.Object r0 = r2.next()
            com.eclipsesource.mmv8.V8Value r0 = (com.eclipsesource.mmv8.V8Value) r0
            r0.release()
            goto L_0x0052
        L_0x0062:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.eclipsesource.mmv8.utils.V8ObjectUtils.getV8Result(com.eclipsesource.mmv8.V8Context, java.lang.Object):java.lang.Object");
    }

    private static void pushValue(C80135V8 v8, V8Array v8Array, Object obj, Map<Object, V8Value> map) {
        if (obj == null) {
            v8Array.pushUndefined();
        } else if (obj instanceof Integer) {
            v8Array.push(obj);
        } else if (obj instanceof Long) {
            v8Array.push((Object) new Double((double) ((Long) obj).longValue()));
        } else if (obj instanceof Double) {
            v8Array.push(obj);
        } else if (obj instanceof Float) {
            v8Array.push(obj);
        } else if (obj instanceof String) {
            v8Array.push((String) obj);
        } else if (obj instanceof Boolean) {
            v8Array.push(obj);
        } else if (obj instanceof V8Object) {
            v8Array.push((V8Value) (V8Object) obj);
        } else if (obj instanceof TypedArray) {
            v8Array.push((V8Value) toV8TypedArray(v8, (TypedArray) obj, map));
        } else if (obj instanceof ArrayBuffer) {
            v8Array.push((V8Value) toV8ArrayBuffer(v8, (ArrayBuffer) obj, map));
        } else if (obj instanceof Map) {
            v8Array.push((V8Value) toV8Object(v8, (Map<String, ? extends Object>) (Map) obj, map));
        } else if (obj instanceof List) {
            v8Array.push((V8Value) toV8Array(v8, (List<? extends Object>) (List) obj, map));
        } else {
            throw new IllegalStateException("Unsupported Object of type: " + obj.getClass());
        }
    }

    private static V8Array toV8Array(C80135V8 v8, List<? extends Object> list, Map<Object, V8Value> map) {
        if (map.containsKey(new ListWrapper(list))) {
            return (V8Array) map.get(new ListWrapper(list));
        }
        V8Array v8Array = new V8Array(v8);
        map.put(new ListWrapper(list), v8Array);
        int i = 0;
        while (i < list.size()) {
            try {
                pushValue(v8, v8Array, (Object) list.get(i), map);
                i++;
            } catch (IllegalStateException e) {
                v8Array.release();
                throw e;
            }
        }
        return v8Array;
    }

    private static V8Object toV8Object(C80135V8 v8, Map<String, ? extends Object> map, Map<Object, V8Value> map2) {
        if (map2.containsKey(map)) {
            return (V8Object) map2.get(map);
        }
        V8Object v8Object = new V8Object(v8);
        map2.put(map, v8Object);
        try {
            for (Map.Entry next : map.entrySet()) {
                setValue(v8, v8Object, (String) next.getKey(), next.getValue(), map2);
            }
            return v8Object;
        } catch (IllegalStateException e) {
            v8Object.release();
            throw e;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object getValue(com.eclipsesource.mmv8.V8Array r2, int r3, com.eclipsesource.mmv8.utils.TypeAdapter r4) {
        /*
            com.eclipsesource.mmv8.utils.V8Map r0 = new com.eclipsesource.mmv8.utils.V8Map
            r0.<init>()
            java.lang.Object r1 = r2.get(r3)     // Catch:{ all -> 0x0020 }
            int r2 = r2.getType(r3)     // Catch:{ all -> 0x001e }
            java.lang.Object r2 = getValue(r1, r2, r0, r4)     // Catch:{ all -> 0x001e }
            boolean r3 = r1 instanceof com.eclipsesource.mmv8.Releasable
            if (r3 == 0) goto L_0x001a
            com.eclipsesource.mmv8.Releasable r1 = (com.eclipsesource.mmv8.Releasable) r1
            r1.release()
        L_0x001a:
            r0.release()
            return r2
        L_0x001e:
            r2 = move-exception
            goto L_0x0022
        L_0x0020:
            r2 = move-exception
            r1 = 0
        L_0x0022:
            boolean r3 = r1 instanceof com.eclipsesource.mmv8.Releasable
            if (r3 == 0) goto L_0x002b
            com.eclipsesource.mmv8.Releasable r1 = (com.eclipsesource.mmv8.Releasable) r1
            r1.release()
        L_0x002b:
            r0.release()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.eclipsesource.mmv8.utils.V8ObjectUtils.getValue(com.eclipsesource.mmv8.V8Array, int, com.eclipsesource.mmv8.utils.TypeAdapter):java.lang.Object");
    }

    public static Object getTypedArray(V8Array v8Array, int i) {
        int length = v8Array.length();
        if (i == 1) {
            return v8Array.getIntegers(0, length);
        }
        if (i == 2) {
            return v8Array.getDoubles(0, length);
        }
        if (i == 3) {
            return v8Array.getBooleans(0, length);
        }
        if (i == 4) {
            return v8Array.getStrings(0, length);
        }
        throw new RuntimeException("Unsupported bulk load type: " + i);
    }

    private static Object getV8Result(C80135V8 v8, Object obj, Map<Object, V8Value> map) {
        if (map.containsKey(obj)) {
            return map.get(obj);
        }
        if (obj instanceof Map) {
            return toV8Object(v8, (Map<String, ? extends Object>) (Map) obj, map);
        }
        if (obj instanceof List) {
            return toV8Array(v8, (List<? extends Object>) (List) obj, map);
        }
        if (obj instanceof TypedArray) {
            return toV8TypedArray(v8, (TypedArray) obj, map);
        }
        return obj instanceof ArrayBuffer ? toV8ArrayBuffer(v8, (ArrayBuffer) obj, map) : obj;
    }

    private static V8Object toV8Object(V8Context v8Context, Map<String, ? extends Object> map, Map<Object, V8Value> map2) {
        if (map2.containsKey(map)) {
            return (V8Object) map2.get(map);
        }
        V8Object newV8Object = v8Context.newV8Object();
        map2.put(map, newV8Object);
        try {
            for (Map.Entry next : map.entrySet()) {
                setValue(v8Context, newV8Object, (String) next.getKey(), next.getValue(), map2);
            }
            return newV8Object;
        } catch (IllegalStateException e) {
            newV8Object.release();
            throw e;
        }
    }

    private static V8Array toV8Array(V8Context v8Context, List<? extends Object> list, Map<Object, V8Value> map) {
        if (map.containsKey(new ListWrapper(list))) {
            return (V8Array) map.get(new ListWrapper(list));
        }
        V8Array newV8Array = v8Context.newV8Array();
        map.put(new ListWrapper(list), newV8Array);
        int i = 0;
        while (i < list.size()) {
            try {
                pushValue(v8Context, newV8Array, (Object) list.get(i), map);
                i++;
            } catch (IllegalStateException e) {
                newV8Array.release();
                throw e;
            }
        }
        return newV8Array;
    }

    private static void setValue(V8Context v8Context, V8Object v8Object, String str, Object obj, Map<Object, V8Value> map) {
        if (obj == null) {
            v8Object.addUndefined(str);
        } else if (obj instanceof Integer) {
            v8Object.add(str, ((Integer) obj).intValue());
        } else if (obj instanceof Long) {
            v8Object.add(str, (double) ((Long) obj).longValue());
        } else if (obj instanceof Double) {
            v8Object.add(str, ((Double) obj).doubleValue());
        } else if (obj instanceof Float) {
            v8Object.add(str, (double) ((Float) obj).floatValue());
        } else if (obj instanceof String) {
            v8Object.add(str, (String) obj);
        } else if (obj instanceof Boolean) {
            v8Object.add(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof V8Object) {
            v8Object.add(str, (V8Value) (V8Object) obj);
        } else if (obj instanceof TypedArray) {
            v8Object.add(str, (V8Value) toV8TypedArray(v8Context, (TypedArray) obj, map));
        } else if (obj instanceof ArrayBuffer) {
            v8Object.add(str, (V8Value) toV8ArrayBuffer(v8Context, (ArrayBuffer) obj, map));
        } else if (obj instanceof Map) {
            v8Object.add(str, (V8Value) toV8Object(v8Context, (Map<String, ? extends Object>) (Map) obj, map));
        } else if (obj instanceof List) {
            v8Object.add(str, (V8Value) toV8Array(v8Context, (List<? extends Object>) (List) obj, map));
        } else {
            throw new IllegalStateException("Unsupported Object of type: " + obj.getClass());
        }
    }

    public static Object getValue(V8Object v8Object, String str) {
        return getValue(v8Object, str, DEFAULT_TYPE_ADAPTER);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object getValue(com.eclipsesource.mmv8.V8Object r2, java.lang.String r3, com.eclipsesource.mmv8.utils.TypeAdapter r4) {
        /*
            com.eclipsesource.mmv8.utils.V8Map r0 = new com.eclipsesource.mmv8.utils.V8Map
            r0.<init>()
            java.lang.Object r1 = r2.get(r3)     // Catch:{ all -> 0x0020 }
            int r2 = r2.getType(r3)     // Catch:{ all -> 0x001e }
            java.lang.Object r2 = getValue(r1, r2, r0, r4)     // Catch:{ all -> 0x001e }
            boolean r3 = r1 instanceof com.eclipsesource.mmv8.Releasable
            if (r3 == 0) goto L_0x001a
            com.eclipsesource.mmv8.Releasable r1 = (com.eclipsesource.mmv8.Releasable) r1
            r1.release()
        L_0x001a:
            r0.release()
            return r2
        L_0x001e:
            r2 = move-exception
            goto L_0x0022
        L_0x0020:
            r2 = move-exception
            r1 = 0
        L_0x0022:
            boolean r3 = r1 instanceof com.eclipsesource.mmv8.Releasable
            if (r3 == 0) goto L_0x002b
            com.eclipsesource.mmv8.Releasable r1 = (com.eclipsesource.mmv8.Releasable) r1
            r1.release()
        L_0x002b:
            r0.release()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.eclipsesource.mmv8.utils.V8ObjectUtils.getValue(com.eclipsesource.mmv8.V8Object, java.lang.String, com.eclipsesource.mmv8.utils.TypeAdapter):java.lang.Object");
    }

    private static Object getV8Result(V8Context v8Context, Object obj, Map<Object, V8Value> map) {
        if (map.containsKey(obj)) {
            return map.get(obj);
        }
        if (obj instanceof Map) {
            return toV8Object(v8Context, (Map<String, ? extends Object>) (Map) obj, map);
        }
        if (obj instanceof List) {
            return toV8Array(v8Context, (List<? extends Object>) (List) obj, map);
        }
        if (obj instanceof TypedArray) {
            return toV8TypedArray(v8Context, (TypedArray) obj, map);
        }
        return obj instanceof ArrayBuffer ? toV8ArrayBuffer(v8Context, (ArrayBuffer) obj, map) : obj;
    }

    private static Object getValue(Object obj, int i, V8Map<Object> v8Map, TypeAdapter typeAdapter) {
        Object adapt = typeAdapter.adapt(i, obj);
        if (TypeAdapter.DEFAULT != adapt) {
            return adapt;
        }
        if (i == 10) {
            return new ArrayBuffer(((V8ArrayBuffer) obj).getBackingStore());
        }
        if (i == 99) {
            return C80135V8.getUndefined();
        }
        switch (i) {
            case 0:
                return null;
            case 1:
            case 2:
            case 3:
            case 4:
                return obj;
            case 5:
                return toList((V8Array) obj, v8Map, typeAdapter);
            case 6:
                return toMap((V8Object) obj, v8Map, typeAdapter);
            case 7:
                return IGNORE;
            case 8:
                return toTypedArray((V8Array) obj);
            default:
                throw new IllegalStateException("Cannot convert type " + V8Value.getStringRepresentation(i));
        }
    }

    private static void pushValue(V8Context v8Context, V8Array v8Array, Object obj, Map<Object, V8Value> map) {
        if (obj == null) {
            v8Array.pushUndefined();
        } else if (obj instanceof Integer) {
            v8Array.push(obj);
        } else if (obj instanceof Long) {
            v8Array.push((Object) new Double((double) ((Long) obj).longValue()));
        } else if (obj instanceof Double) {
            v8Array.push(obj);
        } else if (obj instanceof Float) {
            v8Array.push(obj);
        } else if (obj instanceof String) {
            v8Array.push((String) obj);
        } else if (obj instanceof Boolean) {
            v8Array.push(obj);
        } else if (obj instanceof V8Object) {
            v8Array.push((V8Value) (V8Object) obj);
        } else if (obj instanceof TypedArray) {
            v8Array.push((V8Value) toV8TypedArray(v8Context, (TypedArray) obj, map));
        } else if (obj instanceof ArrayBuffer) {
            v8Array.push((V8Value) toV8ArrayBuffer(v8Context, (ArrayBuffer) obj, map));
        } else if (obj instanceof Map) {
            v8Array.push((V8Value) toV8Object(v8Context, (Map<String, ? extends Object>) (Map) obj, map));
        } else if (obj instanceof List) {
            v8Array.push((V8Value) toV8Array(v8Context, (List<? extends Object>) (List) obj, map));
        } else {
            throw new IllegalStateException("Unsupported Object of type: " + obj.getClass());
        }
    }
}
