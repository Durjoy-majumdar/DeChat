package com.tencent.p014mm.plugin.appbrand.appstorage;

import android.content.SharedPreferences;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.autogen.mmdata.rpt.WeAppFileSystemTempFileLastOccupationStatStruct;
import com.tencent.p014mm.ipcinvoker.C1255d;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.plugin.appbrand.app.C1510o;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81429q;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86011o1;
import com.tencent.tinker.loader.shareutil.SharePatchInfo;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import q20.C89449a;
import rx3.C13598b0;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.appstorage.AppBrandStorageQuotaManager */
public final class AppBrandStorageQuotaManager {

    /* renamed from: a */
    public static final AppBrandStorageQuotaManager f238916a = new AppBrandStorageQuotaManager();

    /* renamed from: b */
    public static final HashMap<String, String> f238917b = new HashMap<>();

    /* renamed from: c */
    public static final Map<String, List<String>> f238918c = new LinkedHashMap();

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/appstorage/AppBrandStorageQuotaManager$CleanupTempFilesOnExitParams;", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.appstorage.AppBrandStorageQuotaManager$CleanupTempFilesOnExitParams */
    public static final class CleanupTempFilesOnExitParams implements Parcelable {
        public static final Parcelable.Creator<CleanupTempFilesOnExitParams> CREATOR = new C1519a();

        /* renamed from: d */
        public final String f10870d;

        /* renamed from: e */
        public final long f10871e;

        /* renamed from: f */
        public final long f10872f;

        /* renamed from: g */
        public final long f10873g;

        /* renamed from: h */
        public final HashMap<String, String> f10874h;

        /* renamed from: i */
        public final boolean f10875i;

        /* renamed from: j */
        public final long f10876j;

        /* renamed from: n */
        public final int f10877n;

        /* renamed from: o */
        public final long f10878o;

        /* renamed from: p */
        public final boolean f10879p;

        /* renamed from: q */
        public final Map<String, List<String>> f10880q;

        /* renamed from: com.tencent.mm.plugin.appbrand.appstorage.AppBrandStorageQuotaManager$CleanupTempFilesOnExitParams$a */
        public static final class C1519a implements Parcelable.Creator<CleanupTempFilesOnExitParams> {
            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                String readString = parcel.readString();
                long readLong = parcel.readLong();
                long readLong2 = parcel.readLong();
                long readLong3 = parcel.readLong();
                int readInt = parcel.readInt();
                HashMap hashMap = new HashMap(readInt);
                int i = 0;
                for (int i2 = 0; i2 != readInt; i2++) {
                    hashMap.put(parcel.readString(), parcel.readString());
                }
                boolean z = parcel.readInt() != 0;
                long readLong4 = parcel.readLong();
                int readInt2 = parcel.readInt();
                long readLong5 = parcel.readLong();
                boolean z2 = parcel.readInt() != 0;
                int readInt3 = parcel.readInt();
                long j = readLong5;
                LinkedHashMap linkedHashMap = new LinkedHashMap(readInt3);
                while (i != readInt3) {
                    linkedHashMap.put(parcel.readString(), parcel.createStringArrayList());
                    i++;
                    Parcel parcel2 = parcel;
                    readInt3 = readInt3;
                }
                return new CleanupTempFilesOnExitParams(readString, readLong, readLong2, readLong3, hashMap, z, readLong4, readInt2, j, z2, linkedHashMap);
            }

            public Object[] newArray(int i) {
                return new CleanupTempFilesOnExitParams[i];
            }
        }

        public CleanupTempFilesOnExitParams(String str, long j, long j2, long j3, HashMap<String, String> hashMap, boolean z, long j4, int i, long j5, boolean z2, Map<String, List<String>> map) {
            Map<String, List<String>> map2 = map;
            C87412m.m108594g(str, "appId");
            C87412m.m108594g(hashMap, "storageKey2Path");
            C87412m.m108594g(map2, "supportRuntimeSpaceStaticsMap");
            this.f10870d = str;
            this.f10871e = j;
            this.f10872f = j2;
            this.f10873g = j3;
            this.f10874h = hashMap;
            this.f10875i = z;
            this.f10876j = j4;
            this.f10877n = i;
            this.f10878o = j5;
            this.f10879p = z2;
            this.f10880q = map2;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CleanupTempFilesOnExitParams)) {
                return false;
            }
            CleanupTempFilesOnExitParams cleanupTempFilesOnExitParams = (CleanupTempFilesOnExitParams) obj;
            return C87412m.m108589b(this.f10870d, cleanupTempFilesOnExitParams.f10870d) && this.f10871e == cleanupTempFilesOnExitParams.f10871e && this.f10872f == cleanupTempFilesOnExitParams.f10872f && this.f10873g == cleanupTempFilesOnExitParams.f10873g && C87412m.m108589b(this.f10874h, cleanupTempFilesOnExitParams.f10874h) && this.f10875i == cleanupTempFilesOnExitParams.f10875i && this.f10876j == cleanupTempFilesOnExitParams.f10876j && this.f10877n == cleanupTempFilesOnExitParams.f10877n && this.f10878o == cleanupTempFilesOnExitParams.f10878o && this.f10879p == cleanupTempFilesOnExitParams.f10879p && C87412m.m108589b(this.f10880q, cleanupTempFilesOnExitParams.f10880q);
        }

        public int hashCode() {
            long j = this.f10871e;
            long j2 = this.f10872f;
            long j3 = this.f10873g;
            int hashCode = ((((((((this.f10870d.hashCode() * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.f10874h.hashCode()) * 31;
            boolean z = this.f10875i;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            long j4 = this.f10876j;
            long j5 = this.f10878o;
            int i = (((((((hashCode + (z ? 1 : 0)) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + this.f10877n) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31;
            boolean z3 = this.f10879p;
            if (!z3) {
                z2 = z3;
            }
            return ((i + (z2 ? 1 : 0)) * 31) + this.f10880q.hashCode();
        }

        public String toString() {
            return "CleanupTempFilesOnExitParams(appId=" + this.f10870d + ", minTempSize=" + this.f10871e + ", maxTempSize=" + this.f10872f + ", maxTotalTempSize=" + this.f10873g + ", storageKey2Path=" + this.f10874h + ", report=" + this.f10875i + ", appVersion=" + this.f10876j + ", appState=" + this.f10877n + ", appType=" + this.f10878o + ", storageSpaceStatisticsEnable=" + this.f10879p + ", supportRuntimeSpaceStaticsMap=" + this.f10880q + ')';
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "out");
            parcel.writeString(this.f10870d);
            parcel.writeLong(this.f10871e);
            parcel.writeLong(this.f10872f);
            parcel.writeLong(this.f10873g);
            HashMap<String, String> hashMap = this.f10874h;
            parcel.writeInt(hashMap.size());
            for (Map.Entry next : hashMap.entrySet()) {
                parcel.writeString((String) next.getKey());
                parcel.writeString((String) next.getValue());
            }
            parcel.writeInt(this.f10875i ? 1 : 0);
            parcel.writeLong(this.f10876j);
            parcel.writeInt(this.f10877n);
            parcel.writeLong(this.f10878o);
            parcel.writeInt(this.f10879p ? 1 : 0);
            Map<String, List<String>> map = this.f10880q;
            parcel.writeInt(map.size());
            for (Map.Entry next2 : map.entrySet()) {
                parcel.writeString((String) next2.getKey());
                parcel.writeStringList((List) next2.getValue());
            }
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/appstorage/AppBrandStorageQuotaManager$a;", "Lcom/tencent/mm/ipcinvoker/d;", "Lcom/tencent/mm/plugin/appbrand/appstorage/AppBrandStorageQuotaManager$CleanupTempFilesOnExitParams;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    @C89449a
    /* renamed from: com.tencent.mm.plugin.appbrand.appstorage.AppBrandStorageQuotaManager$a */
    public static final class C81402a implements C1255d<CleanupTempFilesOnExitParams, IPCVoid> {
        /* renamed from: a */
        public static final WeAppFileSystemTempFileLastOccupationStatStruct m99846a(C81402a aVar, CleanupTempFilesOnExitParams cleanupTempFilesOnExitParams) {
            aVar.getClass();
            WeAppFileSystemTempFileLastOccupationStatStruct weAppFileSystemTempFileLastOccupationStatStruct = new WeAppFileSystemTempFileLastOccupationStatStruct();
            weAppFileSystemTempFileLastOccupationStatStruct.f236566j = 1;
            weAppFileSystemTempFileLastOccupationStatStruct.f236560d = weAppFileSystemTempFileLastOccupationStatStruct.mo86045b("AppId", cleanupTempFilesOnExitParams.f10870d, true);
            weAppFileSystemTempFileLastOccupationStatStruct.f236561e = cleanupTempFilesOnExitParams.f10876j;
            int i = cleanupTempFilesOnExitParams.f10877n;
            weAppFileSystemTempFileLastOccupationStatStruct.f236562f = i != 1 ? i != 2 ? i != 3 ? null : WeAppFileSystemTempFileLastOccupationStatStruct.C80750a.demo : WeAppFileSystemTempFileLastOccupationStatStruct.C80750a.debug : WeAppFileSystemTempFileLastOccupationStatStruct.C80750a.release;
            weAppFileSystemTempFileLastOccupationStatStruct.f236563g = cleanupTempFilesOnExitParams.f10878o;
            return weAppFileSystemTempFileLastOccupationStatStruct;
        }

        public void invoke(Object obj, C1256g gVar) {
            CleanupTempFilesOnExitParams cleanupTempFilesOnExitParams = (CleanupTempFilesOnExitParams) obj;
            if (cleanupTempFilesOnExitParams != null) {
                ((C119157j) C119157j.f356862d).mo183885p(new C81422o(cleanupTempFilesOnExitParams, this, cleanupTempFilesOnExitParams), "AppBrandStorageQuotaManager");
            }
        }
    }

    /* renamed from: a */
    public final long mo113684a(String str, String str2, C86009m1 m1Var) {
        long j;
        C86011o1 o1Var;
        String str3 = str;
        String str4 = str2;
        C86009m1 m1Var2 = m1Var;
        C87412m.m108594g(str3, "appId");
        C87412m.m108594g(str4, "key");
        C87412m.m108594g(m1Var2, SharePatchInfo.OAT_DIR);
        if (!m1Var.mo119967g() || !m1Var.mo119977o()) {
            Log.m105924i("MicroMsg.AppBrandStorageQuotaManager", "dir not exist[" + str3 + ',' + str4 + ',' + m1Var.mo119976n() + ']');
            mo113690g(str, str2, 0, true);
            return 0;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (C87412m.m108589b(str4, "temp") ? true : C87412m.m108589b(str4, "saved_temp")) {
            if (C87412m.m108589b(str4, "temp")) {
                C81429q.C81431b bVar = C81429q.f238972a;
                o1Var = C81429q.f238974c;
            } else {
                o1Var = LuggageLocalFileObjectManager.f238919e;
            }
            C86009m1[] v = m1Var2.mo119985v(o1Var);
            if (v != null) {
                j = 0;
                for (C86009m1 r : v) {
                    j += r.mo119980r();
                }
            } else {
                j = 0;
            }
        } else {
            j = C81412d0.m99869c(m1Var);
        }
        Log.m105924i("MicroMsg.AppBrandStorageQuotaManager", "calculateStorageSize [" + str3 + ',' + str4 + ',' + m1Var.mo119976n() + "]->" + j + " cost[" + (System.currentTimeMillis() - currentTimeMillis) + ']');
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i >= 0) {
            mo113690g(str, str2, j, true);
        }
        if (i < 0) {
            return 0;
        }
        return j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a1  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo113685b(java.lang.String r22, long r23, long r25, long r27) {
        /*
            r21 = this;
            r1 = r22
            java.lang.String r0 = "appId"
            gy3.C87412m.m108594g(r1, r0)
            r0 = 1
            com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime r2 = com.tencent.p014mm.plugin.appbrand.report.quality.C84185b.m103770c(r1, r0)
            r3 = 0
            if (r2 == 0) goto L_0x0011
            r9 = 1
            goto L_0x0012
        L_0x0011:
            r9 = 0
        L_0x0012:
            com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC r4 = com.tencent.p014mm.plugin.appbrand.C81682d.m100225e(r22)
            r5 = 0
            if (r4 == 0) goto L_0x0021
            com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo r4 = r4.f261072r
            if (r4 == 0) goto L_0x0021
            int r4 = r4.pkgVersion
            goto L_0x0025
        L_0x0021:
            if (r2 == 0) goto L_0x0028
            int r4 = r2.f245837i
        L_0x0025:
            long r7 = (long) r4
            r10 = r7
            goto L_0x0029
        L_0x0028:
            r10 = r5
        L_0x0029:
            if (r2 == 0) goto L_0x002f
            int r4 = r2.f245834f
            r12 = r4
            goto L_0x0030
        L_0x002f:
            r12 = 0
        L_0x0030:
            if (r2 == 0) goto L_0x0037
            int r2 = r2.f245835g
            long r4 = (long) r2
            r13 = r4
            goto L_0x0038
        L_0x0037:
            r13 = r5
        L_0x0038:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "start check: appId["
            r2.append(r4)
            r2.append(r1)
            java.lang.String r4 = "] minTemp["
            r2.append(r4)
            r4 = r23
            r2.append(r4)
            java.lang.String r6 = "] maxTemp["
            r2.append(r6)
            r6 = r25
            r2.append(r6)
            java.lang.String r8 = "] maxTotal["
            r2.append(r8)
            r6 = r27
            r2.append(r6)
            java.lang.String r8 = "] "
            r2.append(r8)
            r2.append(r9)
            r8 = 32
            r2.append(r8)
            r2.append(r13)
            r2.append(r8)
            r2.append(r12)
            r2.append(r8)
            r2.append(r10)
            java.lang.String r2 = r2.toString()
            java.lang.String r8 = "MicroMsg.AppBrandStorageQuotaManager"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r2)
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r2 = com.tencent.p014mm.plugin.appbrand.C81682d.m100222b(r22)
            r15 = 0
            if (r2 == 0) goto L_0x009b
            com.tencent.mm.plugin.appbrand.appstorage.h0 r2 = r2.f238163z
            com.tencent.mm.plugin.appbrand.jsapi.file.d1 r2 = (com.tencent.p014mm.plugin.appbrand.jsapi.file.C82419d1) r2
            if (r2 == 0) goto L_0x009b
            com.tencent.mm.plugin.appbrand.appstorage.k0 r2 = r2.getStorageSpaceStatistics()
            goto L_0x009c
        L_0x009b:
            r2 = r15
        L_0x009c:
            if (r2 == 0) goto L_0x00a1
            r16 = 1
            goto L_0x00a3
        L_0x00a1:
            r16 = 0
        L_0x00a3:
            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.WeChatProcess.PROCESS_MAIN
            com.tencent.mm.plugin.appbrand.appstorage.AppBrandStorageQuotaManager$CleanupTempFilesOnExitParams r2 = new com.tencent.mm.plugin.appbrand.appstorage.AppBrandStorageQuotaManager$CleanupTempFilesOnExitParams
            java.util.HashMap<java.lang.String, java.lang.String> r17 = f238917b
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r18 = f238918c
            r0 = r2
            r1 = r22
            r19 = r2
            r2 = r23
            r4 = r25
            r6 = r27
            r20 = r8
            r8 = r17
            r15 = r16
            r16 = r18
            r0.<init>(r1, r2, r4, r6, r8, r9, r10, r12, r13, r15, r16)
            java.lang.Class<com.tencent.mm.plugin.appbrand.appstorage.AppBrandStorageQuotaManager$a> r0 = com.tencent.p014mm.plugin.appbrand.appstorage.AppBrandStorageQuotaManager.C81402a.class
            r2 = r19
            r1 = r20
            r3 = 0
            com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker.m98748a(r1, r2, r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.appstorage.AppBrandStorageQuotaManager.mo113685b(java.lang.String, long, long, long):void");
    }

    /* renamed from: c */
    public final long mo113686c(String str, String str2) {
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(str2, "key");
        MultiProcessMMKV b = C1510o.f10864a.mo1517b("AppBrandStorageQuota");
        long j = 0;
        if (b != null) {
            j = b.getLong("storage_size_" + str + '_' + str2, 0);
        }
        Log.m105924i("MicroMsg.AppBrandStorageQuotaManager", "get saved storage size:" + j + " for " + str + ',' + str2);
        return j;
    }

    /* renamed from: d */
    public final boolean mo113687d(String str, String str2) {
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(str2, "key");
        MultiProcessMMKV b = C1510o.f10864a.mo1517b("AppBrandStorageQuota");
        if (b == null) {
            return false;
        }
        return b.containsKey("storage_size_" + str + '_' + str2);
    }

    /* renamed from: e */
    public final void mo113688e(String str, String str2) {
        C87412m.m108594g(str2, "key");
        if (str != null) {
            Map<String, List<String>> map = f238918c;
            if (((List) ((LinkedHashMap) map).get(str)) == null) {
                map.put(str, new ArrayList());
                C13598b0 b0Var = C13598b0.f38549a;
            }
            List list = (List) ((LinkedHashMap) map).get(str);
            if (list != null) {
                list.add(str2);
            }
        }
    }

    /* renamed from: f */
    public final void mo113689f(String str, String str2) {
        C87412m.m108594g(str, "key");
        C87412m.m108594g(str2, "path");
        boolean z = true;
        if (!(str.length() == 0)) {
            if (str2.length() != 0) {
                z = false;
            }
            if (!z) {
                f238917b.put(str, str2);
            }
        }
    }

    /* renamed from: g */
    public final void mo113690g(String str, String str2, long j, boolean z) {
        SharedPreferences.Editor edit;
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(str2, "key");
        if (z) {
            Log.m105924i("MicroMsg.AppBrandStorageQuotaManager", "save storage size:" + j + " for " + str + ',' + str2);
        }
        MultiProcessMMKV b = C1510o.f10864a.mo1517b("AppBrandStorageQuota");
        if (b != null && (edit = b.edit()) != null) {
            SharedPreferences.Editor putLong = edit.putLong("storage_size_" + str + '_' + str2, j);
            if (putLong != null) {
                putLong.apply();
            }
        }
    }
}
