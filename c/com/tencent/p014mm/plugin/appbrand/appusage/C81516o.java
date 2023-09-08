package com.tencent.p014mm.plugin.appbrand.appusage;

import android.os.Bundle;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import js0.C88024r;

/* renamed from: com.tencent.mm.plugin.appbrand.appusage.o */
public final class C81516o extends MStorage {

    /* renamed from: d */
    public static volatile C81516o f239117d;

    /* renamed from: com.tencent.mm.plugin.appbrand.appusage.o$b */
    public interface C68588b {
        /* renamed from: a */
        void mo94253a(boolean z, String str);
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appusage.o$a */
    public class C81517a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f239118d;

        /* renamed from: e */
        public final /* synthetic */ int f239119e;

        /* renamed from: f */
        public final /* synthetic */ boolean f239120f;

        /* renamed from: g */
        public final /* synthetic */ long f239121g;

        /* renamed from: h */
        public final /* synthetic */ Bundle f239122h;

        /* renamed from: i */
        public final /* synthetic */ int f239123i;

        /* renamed from: j */
        public final /* synthetic */ long f239124j;

        /* renamed from: n */
        public final /* synthetic */ C68588b f239125n;

        public C81517a(int i, int i2, boolean z, long j, Bundle bundle, int i3, long j2, C68588b bVar) {
            this.f239118d = i;
            this.f239119e = i2;
            this.f239120f = z;
            this.f239121g = j;
            this.f239122h = bundle;
            this.f239123i = i3;
            this.f239124j = j2;
            this.f239125n = bVar;
        }

        public void run() {
            C81516o oVar = C81516o.this;
            int i = this.f239118d;
            int i2 = this.f239119e;
            boolean z = this.f239120f;
            Integer num = C81506j0.f239106d;
            C81516o.m100006jo(oVar, i, i2, (z & true ? 2 : 0) | 1, this.f239121g, z, this.f239122h, this.f239123i, this.f239124j, this.f239125n);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* renamed from: jo */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m100006jo(com.tencent.p014mm.plugin.appbrand.appusage.C81516o r15, int r16, int r17, int r18, long r19, boolean r21, android.os.Bundle r22, int r23, long r24, com.tencent.p014mm.plugin.appbrand.appusage.C81516o.C68588b r26) {
        /*
            r9 = r16
            r15.getClass()
            boolean r0 = f40.C86709a0.m107522a()
            if (r0 != 0) goto L_0x000d
            goto L_0x00b4
        L_0x000d:
            r0 = 2
            r1 = 0
            r3 = 1
            r4 = 0
            if (r0 != r9) goto L_0x0015
            goto L_0x0055
        L_0x0015:
            r0 = 6
            if (r0 != r9) goto L_0x0057
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
            if (r0 != 0) goto L_0x0057
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_PURPLE
            if (r0 == 0) goto L_0x0021
            goto L_0x0057
        L_0x0021:
            android.content.SharedPreferences r0 = com.tencent.p014mm.plugin.appbrand.app.PluginAppBrand.getProcessSharedPrefs()
            java.lang.String r5 = "com.tencent.mm.plugin.appbrand.appusage.AppBrandHistoryLogic.KEY_LAST_SYNC_HISTORY_TIME_SECONDS_BY_MAIN_FRAME_TASK_OPEN"
            long r6 = r0.getLong(r5, r1)
            long r10 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            long r10 = r10 - r6
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MINUTES
            com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig r6 = com.tencent.p014mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.m100099b()
            int r6 = r6.f239320x
            long r6 = (long) r6
            long r6 = r0.toSeconds(r6)
            int r0 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x0055
            android.content.SharedPreferences r0 = com.tencent.p014mm.plugin.appbrand.app.PluginAppBrand.getProcessSharedPrefs()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            long r6 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            android.content.SharedPreferences$Editor r0 = r0.putLong(r5, r6)
            r0.apply()
            goto L_0x0057
        L_0x0055:
            r0 = 0
            goto L_0x0058
        L_0x0057:
            r0 = 1
        L_0x0058:
            if (r0 != 0) goto L_0x005b
            goto L_0x00b4
        L_0x005b:
            r5 = -1
            int r0 = (r24 > r5 ? 1 : (r24 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0063
            r10 = 1
            goto L_0x0064
        L_0x0063:
            r10 = 0
        L_0x0064:
            if (r10 == 0) goto L_0x0069
            r3 = r24
            goto L_0x0081
        L_0x0069:
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r3 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_APP_BRAND_HISTORY_LIST_PAGING_LAST_SERVER_MIN_UPDATE_TIME_LONG
            java.lang.Long r4 = java.lang.Long.valueOf(r5)
            java.lang.Object r0 = r0.mo119685f(r3, r4)
            java.lang.Long r0 = (java.lang.Long) r0
            long r3 = r0.longValue()
        L_0x0081:
            com.tencent.mm.plugin.appbrand.appusage.q r14 = new com.tencent.mm.plugin.appbrand.appusage.q
            if (r21 != 0) goto L_0x008d
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x008a
            goto L_0x008d
        L_0x008a:
            int r0 = (int) r3
            r5 = r0
            goto L_0x0093
        L_0x008d:
            r0 = 2147483647(0x7fffffff, float:NaN)
            r5 = 2147483647(0x7fffffff, float:NaN)
        L_0x0093:
            if (r23 <= 0) goto L_0x0098
            r6 = r23
            goto L_0x009c
        L_0x0098:
            r0 = 32
            r6 = 32
        L_0x009c:
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            r7 = r26
            r8 = r18
            r9 = r16
            r11 = r22
            r12 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r14.mo9225i()
        L_0x00b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.appusage.C81516o.m100006jo(com.tencent.mm.plugin.appbrand.appusage.o, int, int, int, long, boolean, android.os.Bundle, int, long, com.tencent.mm.plugin.appbrand.appusage.o$b):void");
    }

    /* renamed from: qq */
    public static C81516o m100007qq() {
        if (f239117d == null) {
            synchronized (C81516o.class) {
                if (f239117d == null) {
                    f239117d = new C81516o();
                }
            }
        }
        return f239117d;
    }

    /* renamed from: vF */
    public static boolean m100008vF() {
        if (!C86709a0.m107522a()) {
            return false;
        }
        return ((Boolean) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_APP_BRAND_HISTORY_HAS_MORE_BOOLEAN, Boolean.FALSE)).booleanValue();
    }

    /* renamed from: Lo */
    public void mo113802Lo(long j, boolean z, Bundle bundle, int i, int i2, int i3, long j2, C68588b bVar) {
        C88024r.m109571a().postToWorker(new C81517a(i, i2, z, j, bundle, i3, j2, bVar));
    }

    public void sp0(long j, boolean z, Bundle bundle, int i, int i2) {
        mo113802Lo(j, z, bundle, i, i2, -1, -1, (C68588b) null);
    }
}
