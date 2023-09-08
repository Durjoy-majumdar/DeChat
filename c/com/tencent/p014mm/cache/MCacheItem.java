package com.tencent.p014mm.cache;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.mm.cache.MCacheItem */
public class MCacheItem implements Parcelable {
    public static final Parcelable.Creator<MCacheItem> CREATOR = new C67854a();

    /* renamed from: d */
    public IAutoDBItem f194765d;

    /* renamed from: com.tencent.mm.cache.MCacheItem$a */
    public class C67854a implements Parcelable.Creator<MCacheItem> {
        public Object createFromParcel(Parcel parcel) {
            return new MCacheItem(parcel);
        }

        public Object[] newArray(int i) {
            return new MCacheItem[i];
        }
    }

    /* renamed from: com.tencent.mm.cache.MCacheItem$b */
    public static class C67855b {

        /* renamed from: a */
        public static Map<Class<?>, Method> f194766a = new HashMap();

        /* renamed from: b */
        public static Map<Class<?>, Method> f194767b = new HashMap();

        static {
            Class<String> cls = String.class;
            Class<Long> cls2 = Long.class;
            Class<Double> cls3 = Double.class;
            Class<Float> cls4 = Float.class;
            Class<Integer> cls5 = Integer.class;
            Class<Boolean> cls6 = Boolean.class;
            Class<Short> cls7 = Short.class;
            Class<byte[]> cls8 = byte[].class;
            Class<Object> cls9 = Object.class;
            String str = "keep_readBoolean";
            Class<C67855b> cls10 = C67855b.class;
            String str2 = "keep_readShort";
            try {
                Class<String> cls11 = cls;
                f194766a.put(cls8, cls10.getMethod("keep_writeByteArray", new Class[]{Parcel.class, Field.class, cls9}));
                f194766a.put(Short.TYPE, cls10.getMethod("keep_writeShort", new Class[]{Parcel.class, Field.class, cls9}));
                f194766a.put(cls7, cls10.getMethod("keep_writeShort", new Class[]{Parcel.class, Field.class, cls9}));
                Map<Class<?>, Method> map = f194766a;
                Class cls12 = Boolean.TYPE;
                map.put(cls12, cls10.getMethod("keep_writeBoolean", new Class[]{Parcel.class, Field.class, cls9}));
                f194766a.put(cls6, cls10.getMethod("keep_writeBoolean", new Class[]{Parcel.class, Field.class, cls9}));
                Map<Class<?>, Method> map2 = f194766a;
                Class cls13 = Integer.TYPE;
                map2.put(cls13, cls10.getMethod("keep_writeInt", new Class[]{Parcel.class, Field.class, cls9}));
                f194766a.put(cls5, cls10.getMethod("keep_writeInt", new Class[]{Parcel.class, Field.class, cls9}));
                Map<Class<?>, Method> map3 = f194766a;
                Class cls14 = Float.TYPE;
                map3.put(cls14, cls10.getMethod("keep_writeFloat", new Class[]{Parcel.class, Field.class, cls9}));
                f194766a.put(cls4, cls10.getMethod("keep_writeFloat", new Class[]{Parcel.class, Field.class, cls9}));
                f194766a.put(Double.TYPE, cls10.getMethod("keep_writeDouble", new Class[]{Parcel.class, Field.class, cls9}));
                f194766a.put(cls3, cls10.getMethod("keep_writeDouble", new Class[]{Parcel.class, Field.class, cls9}));
                Map<Class<?>, Method> map4 = f194766a;
                Class cls15 = Long.TYPE;
                String str3 = "keep_writeLong";
                map4.put(cls15, cls10.getMethod(str3, new Class[]{Parcel.class, Field.class, cls9}));
                Map<Class<?>, Method> map5 = f194766a;
                Method method = cls10.getMethod(str3, new Class[]{Parcel.class, Field.class, cls9});
                Class<Long> cls16 = cls2;
                map5.put(cls16, method);
                Map<Class<?>, Method> map6 = f194766a;
                Method method2 = cls10.getMethod("keep_writeString", new Class[]{Parcel.class, Field.class, cls9});
                Class<String> cls17 = cls11;
                map6.put(cls17, method2);
                Class<String> cls18 = cls17;
                f194767b.put(cls8, cls10.getMethod("keep_readByteArray", new Class[]{Parcel.class, Field.class, cls9}));
                String str4 = str2;
                f194767b.put(Short.TYPE, cls10.getMethod(str4, new Class[]{Parcel.class, Field.class, cls9}));
                f194767b.put(cls7, cls10.getMethod(str4, new Class[]{Parcel.class, Field.class, cls9}));
                String str5 = str;
                f194767b.put(cls12, cls10.getMethod(str5, new Class[]{Parcel.class, Field.class, cls9}));
                f194767b.put(cls6, cls10.getMethod(str5, new Class[]{Parcel.class, Field.class, cls9}));
                f194767b.put(cls13, cls10.getMethod("keep_readInt", new Class[]{Parcel.class, Field.class, cls9}));
                f194767b.put(cls5, cls10.getMethod("keep_readInt", new Class[]{Parcel.class, Field.class, cls9}));
                f194767b.put(cls14, cls10.getMethod("keep_readFloat", new Class[]{Parcel.class, Field.class, cls9}));
                f194767b.put(cls4, cls10.getMethod("keep_readFloat", new Class[]{Parcel.class, Field.class, cls9}));
                f194767b.put(Double.TYPE, cls10.getMethod("keep_readDouble", new Class[]{Parcel.class, Field.class, cls9}));
                f194767b.put(cls3, cls10.getMethod("keep_readDouble", new Class[]{Parcel.class, Field.class, cls9}));
                f194767b.put(cls15, cls10.getMethod("keep_readLong", new Class[]{Parcel.class, Field.class, cls9}));
                f194767b.put(cls16, cls10.getMethod("keep_readLong", new Class[]{Parcel.class, Field.class, cls9}));
                Class<String> cls19 = cls18;
                f194767b.put(cls19, cls10.getMethod("keep_readString", new Class[]{Parcel.class, Field.class, cls9}));
            } catch (Exception e) {
                Log.m105921e("MicroMsg.MCacheItem", "exception:%s", Util.stackTraceToString(e));
            }
        }

        public static void keep_readBoolean(Parcel parcel, Field field, Object obj) {
            try {
                field.setBoolean(obj, parcel.readInt() != 0);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.MCacheItem", "exception:%s", Util.stackTraceToString(e));
            }
        }

        public static void keep_readByteArray(Parcel parcel, Field field, Object obj) {
            try {
                field.set(obj, parcel.createByteArray());
            } catch (Exception e) {
                Log.m105921e("MicroMsg.MCacheItem", "exception:%s", Util.stackTraceToString(e));
            }
        }

        public static void keep_readDouble(Parcel parcel, Field field, Object obj) {
            try {
                field.setDouble(obj, parcel.readDouble());
            } catch (Exception e) {
                Log.m105921e("MicroMsg.MCacheItem", "exception:%s", Util.stackTraceToString(e));
            }
        }

        public static void keep_readFloat(Parcel parcel, Field field, Object obj) {
            try {
                field.setFloat(obj, parcel.readFloat());
            } catch (Exception e) {
                Log.m105921e("MicroMsg.MCacheItem", "exception:%s", Util.stackTraceToString(e));
            }
        }

        public static void keep_readInt(Parcel parcel, Field field, Object obj) {
            try {
                field.setInt(obj, parcel.readInt());
            } catch (Exception e) {
                Log.m105921e("MicroMsg.MCacheItem", "exception:%s", Util.stackTraceToString(e));
            }
        }

        public static void keep_readLong(Parcel parcel, Field field, Object obj) {
            try {
                field.set(obj, Long.valueOf(parcel.readLong()));
            } catch (Exception e) {
                Log.m105921e("MicroMsg.MCacheItem", "exception:%s", Util.stackTraceToString(e));
            }
        }

        public static void keep_readShort(Parcel parcel, Field field, Object obj) {
            try {
                field.setShort(obj, (short) parcel.readInt());
            } catch (Exception e) {
                Log.m105921e("MicroMsg.MCacheItem", "exception:%s", Util.stackTraceToString(e));
            }
        }

        public static void keep_readString(Parcel parcel, Field field, Object obj) {
            try {
                field.set(obj, parcel.readString());
            } catch (Exception e) {
                Log.m105921e("MicroMsg.MCacheItem", "exception:%s", Util.stackTraceToString(e));
            }
        }

        public static void keep_writeBoolean(Parcel parcel, Field field, Object obj) {
            try {
                parcel.writeInt(field.getBoolean(obj) ? 1 : 0);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.MCacheItem", "exception:%s", Util.stackTraceToString(e));
            }
        }

        public static void keep_writeByteArray(Parcel parcel, Field field, Object obj) {
            try {
                parcel.writeByteArray((byte[]) field.get(obj));
            } catch (Exception e) {
                Log.m105921e("MicroMsg.MCacheItem", "exception:%s", Util.stackTraceToString(e));
            }
        }

        public static void keep_writeDouble(Parcel parcel, Field field, Object obj) {
            try {
                parcel.writeDouble(field.getDouble(obj));
            } catch (Exception e) {
                Log.m105921e("MicroMsg.MCacheItem", "exception:%s", Util.stackTraceToString(e));
            }
        }

        public static void keep_writeFloat(Parcel parcel, Field field, Object obj) {
            try {
                parcel.writeFloat(field.getFloat(obj));
            } catch (Exception e) {
                Log.m105921e("MicroMsg.MCacheItem", "exception:%s", Util.stackTraceToString(e));
            }
        }

        public static void keep_writeInt(Parcel parcel, Field field, Object obj) {
            try {
                parcel.writeInt(field.getInt(obj));
            } catch (Exception e) {
                Log.m105921e("MicroMsg.MCacheItem", "exception:%s", Util.stackTraceToString(e));
            }
        }

        public static void keep_writeLong(Parcel parcel, Field field, Object obj) {
            try {
                parcel.writeLong(field.getLong(obj));
            } catch (Exception e) {
                Log.m105921e("MicroMsg.MCacheItem", "exception:%s", Util.stackTraceToString(e));
            }
        }

        public static void keep_writeShort(Parcel parcel, Field field, Object obj) {
            try {
                parcel.writeInt(field.getShort(obj));
            } catch (Exception e) {
                Log.m105921e("MicroMsg.MCacheItem", "exception:%s", Util.stackTraceToString(e));
            }
        }

        public static void keep_writeString(Parcel parcel, Field field, Object obj) {
            try {
                parcel.writeString((String) field.get(obj));
            } catch (Exception e) {
                Log.m105921e("MicroMsg.MCacheItem", "exception:%s", Util.stackTraceToString(e));
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|(3:8|(4:10|11|12|25)(1:24)|16)|22|17|20|21) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001a */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022 A[Catch:{ Exception -> 0x0056 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MCacheItem(android.os.Parcel r13) {
        /*
            r12 = this;
            r12.<init>()
            java.lang.String r0 = "exception:%s"
            java.lang.String r1 = "MicroMsg.MCacheItem"
            r2 = 0
            r3 = 1
            r4 = 0
            java.lang.String r5 = r13.readString()     // Catch:{ Exception -> 0x0056 }
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ Exception -> 0x0056 }
            java.lang.Object r6 = r5.newInstance()     // Catch:{ Exception -> 0x001a }
            com.tencent.mm.sdk.storage.IAutoDBItem r6 = (com.tencent.p014mm.sdk.storage.IAutoDBItem) r6     // Catch:{ Exception -> 0x001a }
            r12.f194765d = r6     // Catch:{ Exception -> 0x001a }
        L_0x001a:
            java.lang.reflect.Field[] r5 = com.tencent.p014mm.sdk.storage.IAutoDBItem.getValidFields(r5)     // Catch:{ Exception -> 0x0056 }
            int r6 = r5.length     // Catch:{ Exception -> 0x0056 }
            r7 = 0
        L_0x0020:
            if (r7 >= r6) goto L_0x0053
            r8 = r5[r7]     // Catch:{ Exception -> 0x0056 }
            java.util.Map<java.lang.Class<?>, java.lang.reflect.Method> r9 = com.tencent.p014mm.cache.MCacheItem.C67855b.f194767b     // Catch:{ Exception -> 0x0056 }
            java.lang.Class r10 = r8.getType()     // Catch:{ Exception -> 0x0056 }
            java.util.HashMap r9 = (java.util.HashMap) r9     // Catch:{ Exception -> 0x0056 }
            java.lang.Object r9 = r9.get(r10)     // Catch:{ Exception -> 0x0056 }
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9     // Catch:{ Exception -> 0x0056 }
            if (r9 == 0) goto L_0x0050
            r10 = 3
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x0044 }
            r10[r4] = r13     // Catch:{ Exception -> 0x0044 }
            r10[r3] = r8     // Catch:{ Exception -> 0x0044 }
            r8 = 2
            com.tencent.mm.sdk.storage.IAutoDBItem r11 = r12.f194765d     // Catch:{ Exception -> 0x0044 }
            r10[r8] = r11     // Catch:{ Exception -> 0x0044 }
            r9.invoke(r2, r10)     // Catch:{ Exception -> 0x0044 }
            goto L_0x0050
        L_0x0044:
            r8 = move-exception
            java.lang.Object[] r9 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0056 }
            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r8)     // Catch:{ Exception -> 0x0056 }
            r9[r4] = r8     // Catch:{ Exception -> 0x0056 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r0, r9)     // Catch:{ Exception -> 0x0056 }
        L_0x0050:
            int r7 = r7 + 1
            goto L_0x0020
        L_0x0053:
            com.tencent.mm.sdk.storage.IAutoDBItem r2 = r12.f194765d     // Catch:{ Exception -> 0x0056 }
            goto L_0x0062
        L_0x0056:
            r13 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r13 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r13)
            r3[r4] = r13
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r0, r3)
        L_0x0062:
            r12.f194765d = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.cache.MCacheItem.<init>(android.os.Parcel):void");
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f194765d.getClass().getName());
        for (Field field : IAutoDBItem.getValidFields(this.f194765d.getClass())) {
            Method method = (Method) ((HashMap) C67855b.f194766a).get(field.getType());
            if (method != null) {
                try {
                    method.invoke((Object) null, new Object[]{parcel, field, this.f194765d});
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.MCacheItem", "exception:%s", Util.stackTraceToString(e));
                }
            }
        }
    }

    public MCacheItem(IAutoDBItem iAutoDBItem) {
        this.f194765d = iAutoDBItem;
    }
}
