package com.tencent.p014mm.storage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.ChannelUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.thumbplayer.utils.TPGlobalEventNofication;
import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import kj2.C117407d;
import qe3.C89625d;

/* renamed from: com.tencent.mm.storage.ConfigFileStorageProxyMMKV */
public class ConfigFileStorageProxyMMKV {

    /* renamed from: a */
    public boolean f249871a;

    /* renamed from: b */
    public String f249872b;

    /* renamed from: c */
    public String f249873c;

    /* renamed from: d */
    public MultiProcessMMKV f249874d;

    /* renamed from: com.tencent.mm.storage.ConfigFileStorageProxyMMKV$a */
    public static class C85795a implements Serializable {

        /* renamed from: d */
        public Object f249877d;

        public C85795a(Object obj) {
            this.f249877d = obj;
        }
    }

    public ConfigFileStorageProxyMMKV(String str) {
        boolean z;
        String str2 = str;
        if (str2 != null) {
            Log.m105925i("MicroMsg.ConfigFileStorageProxyMMKV", "proxySwitch commandSwitch is [%b], xSwitch is [%b]", Boolean.valueOf(MultiProcessMMKV.getMMKV("MMKVForStorageProxy_COMMAND_TAG").getBoolean("MMKVForStorageProxy_COMMAND_KEY", false)), Boolean.TRUE);
            if (TextUtils.isEmpty(str)) {
                z = false;
            } else {
                Uri n = C116299g2.m163858n(str);
                String path = n.getPath();
                if (path != null) {
                    String k = C116299g2.m163855k(path, false, false);
                    if (!n.getPath().equals(k)) {
                        n = n.buildUpon().path(k).build();
                    }
                }
                String path2 = n.getPath();
                int lastIndexOf = path2.lastIndexOf("/");
                path2 = lastIndexOf >= 0 ? path2.substring(lastIndexOf + 1) : path2;
                z = !TextUtils.equals(path2, "MM_stepcounter.cfg") && !TextUtils.equals(path2, "PUSH_stepcounter.cfg");
                Log.m105925i("MicroMsg.ConfigFileStorageProxyMMKV", "selectFile name is %s, returnVal is %b", path2, Boolean.valueOf(z));
            }
            boolean z2 = z;
            this.f249871a = z2;
            if (z2) {
                C86009m1 m1Var = new C86009m1(str2);
                String i = m1Var.mo119971i();
                if (!TextUtils.equals(i, str2)) {
                    Log.m105929w("MicroMsg.ConfigFileStorageProxyMMKV", "path is [%s], canonicalpath is [%s]", str2, i);
                }
                if (!m1Var.mo119967g()) {
                    mo119644i(43);
                    mo119647l(i, false, 0, 0, 0, (String) null, (String) null, (String) null, 43, true);
                }
                this.f249872b = i;
                this.f249874d = MultiProcessMMKV.getSingleMMKV(i);
            }
        }
    }

    /* renamed from: a */
    public final synchronized boolean mo119636a(Map<Integer, Object> map) {
        boolean z;
        Map<Integer, Object> map2 = map;
        synchronized (this) {
            z = false;
            long j = 0;
            if (!(this.f249874d == null || ((long) map.size()) == this.f249874d.count())) {
                Log.m105925i("MicroMsg.ConfigFileStorageProxyMMKV", "compareV2 size mmkv:%d, cfg:%d", Long.valueOf(this.f249874d.count()), Integer.valueOf(map.size()));
                if (map2.containsKey(100001) && !this.f249874d.containsKey(Integer.toString(100001))) {
                    Log.m105920e("MicroMsg.ConfigFileStorageProxyMMKV", "compareV2 mmkv not contain md time key");
                    mo119644i(21);
                    mo119646k(21, (String) null);
                    if (this.f249874d.count() != 0) {
                        mo119644i(22);
                        mo119646k(22, (String) null);
                    }
                }
                if (this.f249874d.count() != 0) {
                    mo119644i(25);
                    mo119646k(25, (String) null);
                }
            }
            long e = mo119640e(100001, 0);
            Object obj = map2.get(100001);
            if (obj instanceof Long) {
                j = ((Long) obj).longValue();
            }
            long j2 = j;
            Object[] objArr = new Object[5];
            int i = (e > j2 ? 1 : (e == j2 ? 0 : -1));
            objArr[0] = Boolean.valueOf(i == 0);
            objArr[1] = Long.valueOf(e);
            objArr[2] = Long.valueOf(this.f249874d.count());
            objArr[3] = Long.valueOf(j2);
            objArr[4] = Integer.valueOf(map.size());
            Log.m105925i("MicroMsg.ConfigFileStorageProxyMMKV", "compareV2 time compare result is [%b], mmkvTime is [%s], size:%d, storageTime is [%s], size:[%d]", objArr);
            if (i == 0) {
                mo119642g(map, e, j2);
            } else {
                z = mo119641f(map, e, j2);
            }
            String formatVersion = ChannelUtil.formatVersion(MMApplicationContext.getContext(), C89625d.f257841g, true);
            map2.put(Integer.valueOf(TPGlobalEventNofication.EVENT_ID_UPC_CHANGED), formatVersion);
            mo119648m(TPGlobalEventNofication.EVENT_ID_UPC_CHANGED, formatVersion);
            if (!this.f249874d.containsKey(Integer.toString(100001))) {
                long currentTimeMillis = System.currentTimeMillis() / 1000;
                map2.put(100001, Long.valueOf(currentTimeMillis));
                mo119648m(100001, Long.valueOf(currentTimeMillis));
                mo119644i(30);
                mo119646k(30, (String) null);
            }
        }
        return z;
    }

    /* renamed from: b */
    public final boolean mo119637b(Map<Integer, Object> map) {
        String formatVersion = ChannelUtil.formatVersion(MMApplicationContext.getContext(), C89625d.f257841g, true);
        Object obj = map.get(Integer.valueOf(TPGlobalEventNofication.EVENT_ID_UPC_CHANGED));
        String str = obj instanceof String ? (String) obj : "0";
        if (TextUtils.equals(str, "0")) {
            return false;
        }
        return !TextUtils.equals(formatVersion, str);
    }

    /* renamed from: c */
    public Object mo119638c(int i, Object obj) {
        if (this.f249874d == null) {
            Log.m105920e("MicroMsg.ConfigFileStorageProxyMMKV", "get mmkv is null ,return default val");
            mo119644i(31);
            mo119646k(31, (String) null);
            return obj;
        }
        MMKVTypeObject mMKVTypeObject = (MMKVTypeObject) this.f249874d.decodeParcelable(String.valueOf(i), MMKVTypeObject.class);
        if (mMKVTypeObject != null) {
            return mMKVTypeObject.f249876e;
        }
        Log.m105920e("MicroMsg.ConfigFileStorageProxyMMKV", "get mmkv value is null，get value fail");
        mo119644i(32);
        mo119646k(32, (String) null);
        return obj;
    }

    /* renamed from: d */
    public final String mo119639d() {
        if (TextUtils.isEmpty(this.f249872b)) {
            return "";
        }
        if (TextUtils.isEmpty(this.f249873c)) {
            Uri n = C116299g2.m163858n(this.f249872b);
            String path = n.getPath();
            if (path != null) {
                String k = C116299g2.m163855k(path, false, false);
                if (!n.getPath().equals(k)) {
                    n = n.buildUpon().path(k).build();
                }
            }
            String path2 = n.getPath();
            int lastIndexOf = path2.lastIndexOf("/");
            if (lastIndexOf >= 0) {
                path2 = path2.substring(lastIndexOf + 1);
            }
            this.f249873c = path2;
        }
        return this.f249873c;
    }

    /* renamed from: e */
    public long mo119640e(int i, long j) {
        Object c = mo119638c(i, Long.valueOf(j));
        return c instanceof Long ? ((Long) c).longValue() : j;
    }

    /* renamed from: f */
    public final boolean mo119641f(Map<Integer, Object> map, long j, long j2) {
        long q = 2 + (new C86009m1(this.f249872b).mo119979q() / 1000);
        if (j2 >= j) {
            mo119649n(map);
            if (j != 0 || j2 <= 0) {
                mo119644i(11);
            } else {
                mo119644i(7);
            }
            mo119645j(11, q, j2, j);
        } else if (q < j) {
            mo119644i(12);
            mo119645j(12, q, j2, j);
            mo119643h(map);
            return true;
        } else if (q - j >= 600) {
            if (mo119637b(map)) {
                mo119644i(13);
                mo119645j(13, q, j2, j);
            } else {
                mo119644i(14);
                mo119645j(14, q, j2, j);
            }
            mo119649n(map);
        } else {
            mo119644i(15);
            mo119645j(15, q, j2, j);
            mo119643h(map);
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final boolean mo119642g(Map<Integer, Object> map, long j, long j2) {
        long j3 = 0;
        if (j == 0) {
            Object[] objArr = new Object[2];
            MultiProcessMMKV multiProcessMMKV = this.f249874d;
            if (multiProcessMMKV != null) {
                j3 = multiProcessMMKV.count();
            }
            objArr[0] = Long.valueOf(j3);
            objArr[1] = Integer.valueOf(map.size());
            Log.m105925i("MicroMsg.ConfigFileStorageProxyMMKV", "mmkv has no data, mmkv:%d, cfg:%d", objArr);
            mo119649n(map);
            return false;
        }
        long q = (new C86009m1(this.f249872b).mo119979q() / 1000) + 2;
        if (q >= j) {
            if (q - j >= 600) {
                mo119649n(map);
                mo119644i(2);
                mo119645j(2, q, j2, j);
            } else if (!mo119637b(map)) {
                return false;
            } else {
                mo119644i(3);
                mo119645j(3, q, j2, j);
                mo119649n(map);
            }
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            Map<Integer, Object> map2 = map;
            map.put(100001, Long.valueOf(currentTimeMillis));
            mo119648m(100001, Long.valueOf(currentTimeMillis));
        } else {
            mo119644i(1);
            mo119645j(1, q, j2, j);
        }
        return false;
    }

    /* renamed from: h */
    public void mo119643h(Map<Integer, Object> map) {
        if (this.f249874d != null && map != null) {
            Log.m105925i("MicroMsg.ConfigFileStorageProxyMMKV", "mmKVCoverStorage storage size:[%d]", Integer.valueOf(map.size()));
            map.clear();
            String[] allKeys = this.f249874d.allKeys();
            if (allKeys != null && allKeys.length != 0) {
                for (String str : allKeys) {
                    try {
                        int safeParseInt = Util.safeParseInt(str);
                        MMKVTypeObject mMKVTypeObject = (MMKVTypeObject) this.f249874d.decodeParcelable(str, MMKVTypeObject.class);
                        if (mMKVTypeObject != null) {
                            map.put(Integer.valueOf(safeParseInt), mMKVTypeObject.f249876e);
                        } else {
                            Log.m105920e("MicroMsg.ConfigFileStorageProxyMMKV", "get mmkv value is null，get value fail");
                            mo119644i(32);
                            mo119646k(32, (String) null);
                        }
                    } catch (NumberFormatException e) {
                        Log.printErrStackTrace("MicroMsg.ConfigFileStorageProxyMMKV", e, "NumberFormatException", new Object[0]);
                    }
                }
            }
        }
    }

    /* renamed from: i */
    public void mo119644i(int i) {
        try {
            Log.m105921e("MicroMsg.ConfigFileStorageProxyMMKV", "compareV2 reportData, case is [%s], filename:[%s]", Integer.valueOf(i), mo119639d());
            Log.printInfoStack("MicroMsg.ConfigFileStorageProxyMMKV", "reportIDKeyData stack", new Object[0]);
            C117407d.INSTANCE.idkeyStat(1041, (long) i, 1, false);
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.ConfigFileStorageProxyMMKV", th, "reportIDKeyData error", new Object[0]);
        }
    }

    /* renamed from: j */
    public void mo119645j(int i, long j, long j2, long j3) {
        mo119647l((String) null, false, j, j2, j3, (String) null, (String) null, (String) null, i, false);
    }

    /* renamed from: k */
    public void mo119646k(int i, String str) {
        mo119647l((String) null, false, 0, 0, 0, str, (String) null, (String) null, i, true);
    }

    /* renamed from: l */
    public void mo119647l(String str, boolean z, long j, long j2, long j3, String str2, String str3, String str4, int i, boolean z2) {
        boolean z3;
        C86009m1 m1Var;
        String str5;
        if (!TextUtils.isEmpty(str) || TextUtils.isEmpty(this.f249872b)) {
            m1Var = null;
            str5 = str;
            z3 = z;
        } else {
            str5 = this.f249872b;
            m1Var = new C86009m1(str5);
            z3 = m1Var.mo119967g();
        }
        String str6 = "null";
        if (TextUtils.isEmpty(str5)) {
            str5 = str6;
        }
        long q = (j != 0 || m1Var == null) ? j : m1Var.mo119979q() / 1000;
        String str7 = str2 == null ? "" : str2;
        String str8 = str3 == null ? str6 : str3;
        if (str4 != null) {
            str6 = str4;
        }
        try {
            Log.m105925i("MicroMsg.ConfigFileStorageProxyMMKV", "reportKVData [%s]", String.format("%s,%s,%d,%d,%d,%s,%s,%s,%d,%s,%s", new Object[]{str5, String.valueOf(z3), Long.valueOf(q), Long.valueOf(j2), Long.valueOf(j3), str7, str8, str6, Integer.valueOf(i), Boolean.valueOf(z2), MMApplicationContext.getProcessName()}));
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.ConfigFileStorageProxyMMKV", e, "reportKVData error", new Object[0]);
        }
    }

    /* renamed from: m */
    public void mo119648m(int i, Object obj) {
        if (this.f249874d != null) {
            String valueOf = String.valueOf(i);
            String str = "null";
            MMKVTypeObject mMKVTypeObject = new MMKVTypeObject(obj != null ? obj.getClass().getSimpleName() : str, obj);
            boolean encode = this.f249874d.encode(valueOf, (Parcelable) mMKVTypeObject);
            Object c = mo119638c(i, (Object) null);
            if (!encode) {
                mo119644i(18);
                mo119646k(18, valueOf);
                Log.m105920e("MicroMsg.ConfigFileStorageProxyMMKV", "write data fail");
            }
            if (c == null) {
                Object[] objArr = new Object[4];
                objArr[0] = mMKVTypeObject.f249875d;
                objArr[1] = mMKVTypeObject.f249876e;
                objArr[2] = valueOf;
                if (obj != null) {
                    str = obj;
                }
                objArr[3] = str;
                Log.m105921e("MicroMsg.ConfigFileStorageProxyMMKV", "innerObject set get data null, type:[%s], obj:[%s], key:[%s], value:[%s]", objArr);
                Log.printInfoStack("MicroMsg.ConfigFileStorageProxyMMKV", "innerObject stack", new Object[0]);
                if (obj != null) {
                    mo119644i(23);
                    mo119646k(23, (String) null);
                }
                if (((MMKVTypeObject) this.f249874d.decodeParcelable(valueOf, MMKVTypeObject.class)) == null) {
                    Log.m105920e("MicroMsg.ConfigFileStorageProxyMMKV", "get mmkv value again, value is null");
                    mo119644i(33);
                    mo119646k(33, valueOf);
                }
            }
            if (obj != null && !obj.equals(c)) {
                mo119644i(20);
                mo119646k(20, valueOf);
                Log.m105921e("MicroMsg.ConfigFileStorageProxyMMKV", "set get data not equal, type:%s", mMKVTypeObject.f249875d);
            }
        }
    }

    /* renamed from: n */
    public void mo119649n(Map<Integer, Object> map) {
        MultiProcessMMKV multiProcessMMKV;
        if (map != null && (multiProcessMMKV = this.f249874d) != null) {
            multiProcessMMKV.clear();
            Log.m105925i("MicroMsg.ConfigFileStorageProxyMMKV", "storageCoverMMKV storage size:[%d]", Integer.valueOf(map.size()));
            for (Map.Entry next : map.entrySet()) {
                mo119648m(((Integer) next.getKey()).intValue(), next.getValue());
            }
        }
    }

    /* renamed from: o */
    public synchronized void mo119650o(Map<Integer, Object> map) {
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        map.put(100001, Long.valueOf(currentTimeMillis));
        mo119648m(100001, Long.valueOf(currentTimeMillis));
        if (!(this.f249874d == null || ((long) map.size()) == this.f249874d.count())) {
            mo119644i(24);
            mo119646k(24, (String) null);
        }
    }

    /* renamed from: com.tencent.mm.storage.ConfigFileStorageProxyMMKV$MMKVTypeObject */
    public static class MMKVTypeObject implements Parcelable {
        public static final Parcelable.Creator<MMKVTypeObject> CREATOR = new C85794a();

        /* renamed from: d */
        public String f249875d;

        /* renamed from: e */
        public Object f249876e;

        /* renamed from: com.tencent.mm.storage.ConfigFileStorageProxyMMKV$MMKVTypeObject$a */
        public class C85794a implements Parcelable.Creator<MMKVTypeObject> {
            public Object createFromParcel(Parcel parcel) {
                return new MMKVTypeObject(parcel);
            }

            public Object[] newArray(int i) {
                return new MMKVTypeObject[i];
            }
        }

        public MMKVTypeObject(String str, Object obj) {
            this.f249875d = str;
            if (obj instanceof LinkedHashMap) {
                this.f249876e = new C85795a(obj);
            } else {
                this.f249876e = obj;
            }
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("type = ");
            sb.append(this.f249875d);
            sb.append(" object = ");
            Object obj = this.f249876e;
            sb.append(obj != null ? obj.toString() : "");
            return sb.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            try {
                parcel.writeString(this.f249875d);
                parcel.writeValue(this.f249876e);
            } catch (RuntimeException e) {
                Log.printErrStackTrace("MicroMsg.ConfigFileStorageProxyMMKV", e, "", new Object[0]);
            }
        }

        public MMKVTypeObject(Parcel parcel) {
            try {
                String readString = parcel.readString();
                this.f249875d = readString;
                try {
                    if (!TextUtils.equals(readString, HashMap.class.getSimpleName()) && !TextUtils.equals(this.f249875d, HashSet.class.getSimpleName())) {
                        TextUtils.equals(this.f249875d, LinkedHashMap.class.getSimpleName());
                    }
                    Object readValue = parcel.readValue((ClassLoader) null);
                    if (readValue instanceof C85795a) {
                        this.f249876e = ((C85795a) readValue).f249877d;
                    } else {
                        this.f249876e = readValue;
                    }
                } catch (Exception e) {
                    C117407d.INSTANCE.idkeyStat(1041, 44, 1, true);
                    Log.printErrStackTrace("MicroMsg.ConfigFileStorageProxyMMKV", e, "MMKVTypeObject readValue error", new Object[0]);
                }
            } catch (RuntimeException e2) {
                Log.printErrStackTrace("MicroMsg.ConfigFileStorageProxyMMKV", e2, "", new Object[0]);
            }
        }
    }
}
