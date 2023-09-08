package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.plugin.sns.p106ui.OfflineVideoView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.pointers.PString;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import p749xh.C66261f3;
import ps2.C100880k;
import ps2.C100891r;

/* renamed from: com.tencent.mm.plugin.sns.ui.i2 */
public class C95810i2 implements OfflineVideoView.C95361h {

    /* renamed from: a */
    public final /* synthetic */ SightVideoFullScreenView f279566a;

    /* renamed from: com.tencent.mm.plugin.sns.ui.i2$a */
    public class C95811a implements C100880k.C100881a {
        public C95811a() {
        }

        /* renamed from: a */
        public void mo76113a() {
            SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView$2$1");
            SightVideoFullScreenView sightVideoFullScreenView = C95810i2.this.f279566a;
            int i = SightVideoFullScreenView.f277411x0;
            SnsMethodCalculate.markStartTimeMs("access$902", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
            sightVideoFullScreenView.f277450v = true;
            SnsMethodCalculate.markEndTimeMs("access$902", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
            Log.m105920e("SightVideoFullScreenView", "onDownloadError");
            SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView$2$1");
        }

        /* renamed from: b */
        public void mo76114b() {
            SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView$2$1");
            try {
                SightVideoFullScreenView.m121762j(C95810i2.this.f279566a);
                Log.m105924i("SightVideoFullScreenView", "onStartDownload");
            } catch (Throwable th) {
                Log.m105920e("SightVideoFullScreenView", th.toString());
            }
            SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView$2$1");
        }

        /* renamed from: c */
        public void mo76115c(String str) {
            SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView$2$1");
            try {
                SightVideoFullScreenView sightVideoFullScreenView = C95810i2.this.f279566a;
                int i = SightVideoFullScreenView.f277411x0;
                SnsMethodCalculate.markStartTimeMs("access$902", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
                sightVideoFullScreenView.f277450v = false;
                SnsMethodCalculate.markEndTimeMs("access$902", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
                SightVideoFullScreenView sightVideoFullScreenView2 = C95810i2.this.f279566a;
                SnsMethodCalculate.markStartTimeMs("access$202", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
                sightVideoFullScreenView2.f277451w = true;
                SnsMethodCalculate.markEndTimeMs("access$202", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
                Log.m105924i("SightVideoFullScreenView", "onDownloaded");
                SightVideoFullScreenView.m121754b(C95810i2.this.f279566a).mo132293k(str);
                SightVideoFullScreenView sightVideoFullScreenView3 = C95810i2.this.f279566a;
                SnsMethodCalculate.markStartTimeMs("access$1002", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
                sightVideoFullScreenView3.f277448t = str;
                SnsMethodCalculate.markEndTimeMs("access$1002", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
            } catch (Throwable th) {
                Log.m105920e("SightVideoFullScreenView", th.toString());
            }
            SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView$2$1");
        }
    }

    public C95810i2(SightVideoFullScreenView sightVideoFullScreenView) {
        this.f279566a = sightVideoFullScreenView;
    }

    /* renamed from: a */
    public void mo131754a(int i) {
        SnsMethodCalculate.markStartTimeMs(C66261f3.COL_UPDATETIME, "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView$2");
        try {
            SightVideoFullScreenView.m121755c(this.f279566a, i / 1000);
        } catch (Throwable th) {
            Log.m105920e("SightVideoFullScreenView", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs(C66261f3.COL_UPDATETIME, "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView$2");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x008d A[Catch:{ all -> 0x00b5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0093 A[Catch:{ all -> 0x00b5 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo131755b(int r9) {
        /*
            r8 = this;
            java.lang.String r9 = "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView"
            java.lang.String r0 = "SightVideoFullScreenView"
            java.lang.String r1 = "onStart"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView$2"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView r3 = r8.f279566a     // Catch:{ all -> 0x00b5 }
            int r4 = com.tencent.p014mm.plugin.sns.p106ui.SightVideoFullScreenView.f277411x0     // Catch:{ all -> 0x00b5 }
            java.lang.String r4 = "access$300"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r9)     // Catch:{ all -> 0x00b5 }
            boolean r3 = r3.f277452x     // Catch:{ all -> 0x00b5 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r9)     // Catch:{ all -> 0x00b5 }
            if (r3 == 0) goto L_0x00bd
            java.lang.String r3 = "video onStart"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)     // Catch:{ all -> 0x00b5 }
            com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView r3 = r8.f279566a     // Catch:{ all -> 0x00b5 }
            int r3 = com.tencent.p014mm.plugin.sns.p106ui.SightVideoFullScreenView.m121759g(r3)     // Catch:{ all -> 0x00b5 }
            com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView r4 = r8.f279566a     // Catch:{ all -> 0x00b5 }
            java.lang.String r5 = "access$500"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r9)     // Catch:{ all -> 0x00b5 }
            int r4 = r4.f277417F     // Catch:{ all -> 0x00b5 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r9)     // Catch:{ all -> 0x00b5 }
            r5 = 0
            if (r3 >= r4) goto L_0x0067
            com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView r3 = r8.f279566a     // Catch:{ all -> 0x00b5 }
            int r3 = com.tencent.p014mm.plugin.sns.p106ui.SightVideoFullScreenView.m121759g(r3)     // Catch:{ all -> 0x00b5 }
            if (r3 >= 0) goto L_0x0040
            goto L_0x0067
        L_0x0040:
            com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView r3 = r8.f279566a     // Catch:{ all -> 0x00b5 }
            com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar r3 = com.tencent.p014mm.plugin.sns.p106ui.SightVideoFullScreenView.m121760h(r3)     // Catch:{ all -> 0x00b5 }
            com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView r4 = r8.f279566a     // Catch:{ all -> 0x00b5 }
            int r4 = com.tencent.p014mm.plugin.sns.p106ui.SightVideoFullScreenView.m121759g(r4)     // Catch:{ all -> 0x00b5 }
            int r4 = r4 / 1000
            r3.seek(r4)     // Catch:{ all -> 0x00b5 }
            com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView r3 = r8.f279566a     // Catch:{ all -> 0x00b5 }
            com.tencent.mm.plugin.sns.ui.OfflineVideoView r3 = com.tencent.p014mm.plugin.sns.p106ui.SightVideoFullScreenView.m121754b(r3)     // Catch:{ all -> 0x00b5 }
            com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView r4 = r8.f279566a     // Catch:{ all -> 0x00b5 }
            int r4 = com.tencent.p014mm.plugin.sns.p106ui.SightVideoFullScreenView.m121759g(r4)     // Catch:{ all -> 0x00b5 }
            com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView r6 = r8.f279566a     // Catch:{ all -> 0x00b5 }
            boolean r6 = com.tencent.p014mm.plugin.sns.p106ui.SightVideoFullScreenView.m121761i(r6)     // Catch:{ all -> 0x00b5 }
            r3.mo132301s(r4, r6)     // Catch:{ all -> 0x00b5 }
            goto L_0x007f
        L_0x0067:
            com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView r3 = r8.f279566a     // Catch:{ all -> 0x00b5 }
            com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar r3 = com.tencent.p014mm.plugin.sns.p106ui.SightVideoFullScreenView.m121760h(r3)     // Catch:{ all -> 0x00b5 }
            r3.seek(r5)     // Catch:{ all -> 0x00b5 }
            com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView r3 = r8.f279566a     // Catch:{ all -> 0x00b5 }
            com.tencent.mm.plugin.sns.ui.OfflineVideoView r3 = com.tencent.p014mm.plugin.sns.p106ui.SightVideoFullScreenView.m121754b(r3)     // Catch:{ all -> 0x00b5 }
            com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView r4 = r8.f279566a     // Catch:{ all -> 0x00b5 }
            boolean r4 = com.tencent.p014mm.plugin.sns.p106ui.SightVideoFullScreenView.m121761i(r4)     // Catch:{ all -> 0x00b5 }
            r3.mo132301s(r5, r4)     // Catch:{ all -> 0x00b5 }
        L_0x007f:
            com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView r3 = r8.f279566a     // Catch:{ all -> 0x00b5 }
            java.lang.String r4 = "access$1300"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r9)     // Catch:{ all -> 0x00b5 }
            boolean r3 = r3.f277418G     // Catch:{ all -> 0x00b5 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r9)     // Catch:{ all -> 0x00b5 }
            if (r3 == 0) goto L_0x0093
            com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView r3 = r8.f279566a     // Catch:{ all -> 0x00b5 }
            r3.mo132456l()     // Catch:{ all -> 0x00b5 }
            goto L_0x0098
        L_0x0093:
            com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView r3 = r8.f279566a     // Catch:{ all -> 0x00b5 }
            r3.mo132480x()     // Catch:{ all -> 0x00b5 }
        L_0x0098:
            com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView r3 = r8.f279566a     // Catch:{ all -> 0x00b5 }
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00b5 }
            java.lang.String r4 = "access$1402"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r9)     // Catch:{ all -> 0x00b5 }
            r3.f277425N = r6     // Catch:{ all -> 0x00b5 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r9)     // Catch:{ all -> 0x00b5 }
            com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView r3 = r8.f279566a     // Catch:{ all -> 0x00b5 }
            java.lang.String r4 = "access$302"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r9)     // Catch:{ all -> 0x00b5 }
            r3.f277452x = r5     // Catch:{ all -> 0x00b5 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r9)     // Catch:{ all -> 0x00b5 }
            goto L_0x00bd
        L_0x00b5:
            r9 = move-exception
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r9)
        L_0x00bd:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.C95810i2.mo131755b(int):void");
    }

    /* renamed from: c */
    public boolean mo131756c(PString pString, PString pString2) {
        SnsMethodCalculate.markStartTimeMs("downloadVideo", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView$2");
        try {
            SightVideoFullScreenView sightVideoFullScreenView = this.f279566a;
            int i = SightVideoFullScreenView.f277411x0;
            SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
            String str = sightVideoFullScreenView.f277421J;
            SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
            String n = C100891r.m132219n("adId", str);
            if (C86013q1.m106450k(n)) {
                Log.m105924i("SightVideoFullScreenView", "streamPath is exist");
                pString.value = n;
                SightVideoFullScreenView sightVideoFullScreenView2 = this.f279566a;
                SnsMethodCalculate.markStartTimeMs("access$202", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
                sightVideoFullScreenView2.f277451w = true;
                SnsMethodCalculate.markEndTimeMs("access$202", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
                SightVideoFullScreenView sightVideoFullScreenView3 = this.f279566a;
                SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
                boolean z = sightVideoFullScreenView3.f277452x;
                SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
                if (z) {
                    int g = SightVideoFullScreenView.m121759g(this.f279566a);
                    SightVideoFullScreenView sightVideoFullScreenView4 = this.f279566a;
                    SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
                    int i2 = sightVideoFullScreenView4.f277417F;
                    SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
                    if (g < i2) {
                        if (SightVideoFullScreenView.m121759g(this.f279566a) >= 0) {
                            SightVideoFullScreenView.m121760h(this.f279566a).seek(SightVideoFullScreenView.m121759g(this.f279566a) / 1000);
                            SightVideoFullScreenView.m121754b(this.f279566a).mo132301s(SightVideoFullScreenView.m121759g(this.f279566a), SightVideoFullScreenView.m121761i(this.f279566a));
                        }
                    }
                    SightVideoFullScreenView.m121760h(this.f279566a).seek(0);
                    SightVideoFullScreenView.m121754b(this.f279566a).mo132301s(0, SightVideoFullScreenView.m121761i(this.f279566a));
                }
                SnsMethodCalculate.markEndTimeMs("downloadVideo", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView$2");
                return true;
            }
            SightVideoFullScreenView sightVideoFullScreenView5 = this.f279566a;
            SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
            String str2 = sightVideoFullScreenView5.f277421J;
            SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
            C100891r.m132210e("adId", str2, false, 62, 0, new C95811a());
            SnsMethodCalculate.markEndTimeMs("downloadVideo", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView$2");
            return false;
        } catch (Throwable th) {
            Log.m105920e("SightVideoFullScreenView", th.toString());
            SnsMethodCalculate.markEndTimeMs("downloadVideo", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView$2");
            return false;
        }
    }

    public void onCompletion() {
        SnsMethodCalculate.markStartTimeMs("onCompletion", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView$2");
        SightVideoFullScreenView sightVideoFullScreenView = this.f279566a;
        int i = SightVideoFullScreenView.f277411x0;
        SnsMethodCalculate.markStartTimeMs("access$1108", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        sightVideoFullScreenView.f277429S++;
        SnsMethodCalculate.markEndTimeMs("access$1108", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        SightVideoFullScreenView sightVideoFullScreenView2 = this.f279566a;
        SnsMethodCalculate.markStartTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        sightVideoFullScreenView2.getClass();
        SnsMethodCalculate.markStartTimeMs("restart", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        try {
            sightVideoFullScreenView2.f277438h.mo132294l(0, true);
        } catch (Throwable th) {
            Log.m105920e("SightVideoFullScreenView", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("restart", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        SnsMethodCalculate.markEndTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        SnsMethodCalculate.markEndTimeMs("onCompletion", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView$2");
    }
}
