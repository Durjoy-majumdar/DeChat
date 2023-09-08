package com.tencent.p014mm.plugin.magicbrush.p074fs;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.ipcinvoker.C1255d;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.plugin.magicbrush.C30204k0;
import com.tencent.p014mm.plugin.magicbrush.p074fs.C85264g;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86011o1;
import com.tencent.tinker.loader.shareutil.SharePatchInfo;
import d42.C31068j;
import di3.C86312j;
import e42.C31415g;
import gy3.C87412m;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import q20.C89449a;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.magicbrush.fs.MagicBrushStorageQuotaManager */
public final class MagicBrushStorageQuotaManager {

    /* renamed from: a */
    public static final MagicBrushStorageQuotaManager f248404a = new MagicBrushStorageQuotaManager();

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/magicbrush/fs/MagicBrushStorageQuotaManager$CleanupTempFilesOnMBBIzExitParams;", "Landroid/os/Parcelable;", "mb-impl_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.magicbrush.fs.MagicBrushStorageQuotaManager$CleanupTempFilesOnMBBIzExitParams */
    public static final class CleanupTempFilesOnMBBIzExitParams implements Parcelable {
        public static final Parcelable.Creator<CleanupTempFilesOnMBBIzExitParams> CREATOR = new C4871a();

        /* renamed from: d */
        public final String f19956d;

        /* renamed from: e */
        public final long f19957e;

        /* renamed from: f */
        public final long f19958f;

        /* renamed from: g */
        public final long f19959g;

        /* renamed from: h */
        public final HashMap<String, String> f19960h;

        /* renamed from: com.tencent.mm.plugin.magicbrush.fs.MagicBrushStorageQuotaManager$CleanupTempFilesOnMBBIzExitParams$a */
        public static final class C4871a implements Parcelable.Creator<CleanupTempFilesOnMBBIzExitParams> {
            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                String readString = parcel.readString();
                long readLong = parcel.readLong();
                long readLong2 = parcel.readLong();
                long readLong3 = parcel.readLong();
                int readInt = parcel.readInt();
                HashMap hashMap = new HashMap(readInt);
                for (int i = 0; i != readInt; i++) {
                    hashMap.put(parcel.readString(), parcel.readString());
                }
                return new CleanupTempFilesOnMBBIzExitParams(readString, readLong, readLong2, readLong3, hashMap);
            }

            public Object[] newArray(int i) {
                return new CleanupTempFilesOnMBBIzExitParams[i];
            }
        }

        public CleanupTempFilesOnMBBIzExitParams(String str, long j, long j2, long j3, HashMap<String, String> hashMap) {
            C87412m.m108594g(str, "bizName");
            C87412m.m108594g(hashMap, "storageKey2Path");
            this.f19956d = str;
            this.f19957e = j;
            this.f19958f = j2;
            this.f19959g = j3;
            this.f19960h = hashMap;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CleanupTempFilesOnMBBIzExitParams)) {
                return false;
            }
            CleanupTempFilesOnMBBIzExitParams cleanupTempFilesOnMBBIzExitParams = (CleanupTempFilesOnMBBIzExitParams) obj;
            return C87412m.m108589b(this.f19956d, cleanupTempFilesOnMBBIzExitParams.f19956d) && this.f19957e == cleanupTempFilesOnMBBIzExitParams.f19957e && this.f19958f == cleanupTempFilesOnMBBIzExitParams.f19958f && this.f19959g == cleanupTempFilesOnMBBIzExitParams.f19959g && C87412m.m108589b(this.f19960h, cleanupTempFilesOnMBBIzExitParams.f19960h);
        }

        public int hashCode() {
            long j = this.f19957e;
            long j2 = this.f19958f;
            long j3 = this.f19959g;
            return (((((((this.f19956d.hashCode() * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.f19960h.hashCode();
        }

        public String toString() {
            return "CleanupTempFilesOnMBBIzExitParams(bizName=" + this.f19956d + ", minTempSize=" + this.f19957e + ", maxTempSize=" + this.f19958f + ", maxTotalTempSize=" + this.f19959g + ", storageKey2Path=" + this.f19960h + ')';
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "out");
            parcel.writeString(this.f19956d);
            parcel.writeLong(this.f19957e);
            parcel.writeLong(this.f19958f);
            parcel.writeLong(this.f19959g);
            HashMap<String, String> hashMap = this.f19960h;
            parcel.writeInt(hashMap.size());
            for (Map.Entry next : hashMap.entrySet()) {
                parcel.writeString((String) next.getKey());
                parcel.writeString((String) next.getValue());
            }
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/magicbrush/fs/MagicBrushStorageQuotaManager$a;", "Lcom/tencent/mm/ipcinvoker/d;", "Lcom/tencent/mm/plugin/magicbrush/fs/MagicBrushStorageQuotaManager$CleanupTempFilesOnMBBIzExitParams;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "mb-impl_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    @C89449a
    /* renamed from: com.tencent.mm.plugin.magicbrush.fs.MagicBrushStorageQuotaManager$a */
    public static final class C85258a implements C1255d<CleanupTempFilesOnMBBIzExitParams, IPCVoid> {
        public void invoke(Object obj, C1256g gVar) {
            CleanupTempFilesOnMBBIzExitParams cleanupTempFilesOnMBBIzExitParams = (CleanupTempFilesOnMBBIzExitParams) obj;
            if (cleanupTempFilesOnMBBIzExitParams != null) {
                ((C119157j) C119157j.f356862d).mo183885p(new C85263f(cleanupTempFilesOnMBBIzExitParams), "MagicBrushStorageQuotaManager");
            }
        }
    }

    /* renamed from: a */
    public final long mo118418a(String str, String str2, C86009m1 m1Var) {
        long j;
        C86011o1 o1Var;
        String str3 = str;
        String str4 = str2;
        C86009m1 m1Var2 = m1Var;
        C87412m.m108594g(str3, "bizName");
        C87412m.m108594g(str4, "key");
        C87412m.m108594g(m1Var2, SharePatchInfo.OAT_DIR);
        if (!m1Var.mo119967g() || !m1Var.mo119977o()) {
            Log.m105924i("MicroMsg.MagicBrushStorageQuotaManager", "dir not exist[" + str3 + ',' + str4 + ',' + m1Var.mo119976n() + ']');
            mo118421d(str, str2, 0, true);
            return 0;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (C87412m.m108589b(str4, "temp") ? true : C87412m.m108589b(str4, "saved_temp")) {
            if (C87412m.m108589b(str4, "temp")) {
                C85264g.C85267c cVar = C85264g.f248417a;
                o1Var = C85264g.f248419c;
            } else {
                C85264g.C85267c cVar2 = C85264g.f248417a;
                o1Var = C85264g.f248420d;
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
            j = mo118419b(m1Var2);
        }
        Log.m105924i("MicroMsg.MagicBrushStorageQuotaManager", "calculateStorageSize [" + str3 + ',' + str4 + ',' + m1Var.mo119976n() + "]->" + j + " cost[" + (System.currentTimeMillis() - currentTimeMillis) + ']');
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i >= 0) {
            mo118421d(str, str2, j, true);
        }
        if (i < 0) {
            return 0;
        }
        return j;
    }

    /* renamed from: b */
    public final long mo118419b(C86009m1 m1Var) {
        if (m1Var == null) {
            return -1;
        }
        C86009m1[] u = m1Var.mo119984u();
        long j = 0;
        if (u == null) {
            return 0;
        }
        for (C86009m1 m1Var2 : u) {
            j += m1Var2.mo119978p() ? m1Var2.mo119980r() : mo118419b(m1Var2);
        }
        return j;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.Object[]} */
    /* JADX WARNING: type inference failed for: r0v9, types: [java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo118420c(java.lang.String r8, java.lang.String r9) {
        /*
            r7 = this;
            java.lang.String r0 = "bizName"
            gy3.C87412m.m108594g(r8, r0)
            java.lang.String r0 = "key"
            gy3.C87412m.m108594g(r9, r0)
            java.lang.Class<com.tencent.mm.plugin.magicbrush.k0> r0 = com.tencent.p014mm.plugin.magicbrush.C30204k0.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            com.tencent.mm.plugin.magicbrush.k0 r0 = (com.tencent.p014mm.plugin.magicbrush.C30204k0) r0
            java.lang.String r1 = "MagicStorageQuota"
            r2 = 0
            d42.j r0 = r0.wt0(r1, r2)
            r3 = 0
            if (r0 == 0) goto L_0x00a9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "storage_size_"
            r1.append(r5)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            java.lang.Object[] r0 = r0.mo57966w(r8, r1)
            java.lang.String r1 = "it.get(bizName,\"$MMKV_KEY_PREFIX$key\")"
            gy3.C87412m.m108593f(r0, r1)
            r1 = 0
            r1 = r0[r1]
            java.lang.String r5 = "null cannot be cast to non-null type com.tencent.mm.plugin.magicbrush.base.MBErrorInfo"
            gy3.C87412m.m108592e(r1, r5)
            e42.g r1 = (e42.C31415g) r1
            e42.g r5 = e42.C31415g.C7595b.f25862a
            boolean r6 = gy3.C87412m.m108589b(r1, r5)
            if (r6 == 0) goto L_0x0055
            r2 = 1
            r0 = r0[r2]
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.String"
            gy3.C87412m.m108592e(r0, r2)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
        L_0x0055:
            boolean r0 = gy3.C87412m.m108589b(r1, r5)
            java.lang.String r5 = "MicroMsg.MagicBrushStorageQuotaManager"
            if (r0 == 0) goto L_0x0089
            if (r2 != 0) goto L_0x0060
            goto L_0x0089
        L_0x0060:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "get saved storage size:"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = " for "
            r0.append(r1)
            r0.append(r8)
            r8 = 44
            r0.append(r8)
            r0.append(r9)
            java.lang.String r8 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r8)
            long r8 = java.lang.Long.parseLong(r2)
            return r8
        L_0x0089:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "get saved storage size errno:"
            r8.append(r9)
            int r9 = r1.f84089a
            r8.append(r9)
            java.lang.String r9 = ", errMsg "
            r8.append(r9)
            java.lang.String r9 = r1.f84090b
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r8)
        L_0x00a9:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.magicbrush.p074fs.MagicBrushStorageQuotaManager.mo118420c(java.lang.String, java.lang.String):long");
    }

    /* renamed from: d */
    public final void mo118421d(String str, String str2, long j, boolean z) {
        C87412m.m108594g(str, "bizName");
        C87412m.m108594g(str2, "key");
        if (z) {
            Log.m105924i("MicroMsg.MagicBrushStorageQuotaManager", "save storage size:" + j + " for " + str + ',' + str2);
        }
        C31068j wt02 = ((C30204k0) C86312j.m106911c(C30204k0.class)).wt0("MagicStorageQuota", (String) null);
        if (wt02 != null) {
            if (!C87412m.m108589b(wt02.mo57964b(str, "storage_size_" + str2, String.valueOf(j), "String"), C31415g.C7595b.f25862a)) {
                Log.m105924i("MicroMsg.MagicBrushStorageQuotaManager", "save storage fail: " + str + ',' + str2);
            }
        }
    }
}
