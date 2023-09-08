package qq2;

import com.tencent.p014mm.plugin.sns.p106ui.OnlineVideoView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import jp2.C98963o;
import p749xh.C66261f3;
import vr2.C102236a0;

/* renamed from: qq2.b */
public class C101235b implements OnlineVideoView.IVideoViewCallbackEx {

    /* renamed from: a */
    public SnsInfo f296423a;

    /* renamed from: b */
    public Reference<OnlineVideoView> f296424b;

    /* renamed from: c */
    public Reference<C98963o> f296425c;

    /* renamed from: d */
    public int f296426d;

    public C101235b(SnsInfo snsInfo, OnlineVideoView onlineVideoView, C98963o oVar, int i) {
        this.f296423a = snsInfo;
        this.f296424b = new WeakReference(onlineVideoView);
        this.f296425c = new WeakReference(oVar);
        this.f296426d = i;
    }

    /* renamed from: c */
    public static String m132794c(int i) {
        SnsMethodCalculate.markStartTimeMs("toItemString", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineAdVideoCallback");
        if (i == 1) {
            SnsMethodCalculate.markEndTimeMs("toItemString", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineAdVideoCallback");
            return "normal time line item";
        } else if (i == 3) {
            SnsMethodCalculate.markEndTimeMs("toItemString", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineAdVideoCallback");
            return "base card time line item";
        } else if (i != 4) {
            SnsMethodCalculate.markEndTimeMs("toItemString", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineAdVideoCallback");
            return "";
        } else {
            SnsMethodCalculate.markEndTimeMs("toItemString", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineAdVideoCallback");
            return "grid card time line item";
        }
    }

    /* renamed from: a */
    public void mo132395a(int i) {
        SnsMethodCalculate.markStartTimeMs(C66261f3.COL_UPDATETIME, "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineAdVideoCallback");
        SnsInfo snsInfo = this.f296423a;
        C98963o oVar = this.f296425c.get();
        OnlineVideoView onlineVideoView = this.f296424b.get();
        if (!(onlineVideoView == null || snsInfo == null || oVar == null)) {
            long j = (long) i;
            long duration = (long) onlineVideoView.getDuration();
            SnsMethodCalculate.markStartTimeMs("doOnlineVideoPlaying", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineAdVideoCallback");
            Log.m105918d("SnsAd.OnlineAdVideoCallback", "doOnlinePlayerPlaying is called , the second  is " + j + " the duration is " + duration);
            long j2 = snsInfo.field_snsId;
            if (!snsInfo.isAd()) {
                Log.m105928w("SnsAd.OnlineAdVideoCallback", "doOnlinePlayerPlaying, the info is not Ad, snsId=" + C102236a0.m134765q0(j2));
                SnsMethodCalculate.markEndTimeMs("doOnlineVideoPlaying", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineAdVideoCallback");
            } else {
                oVar.mo138316w(snsInfo.field_snsId);
                oVar.mo138318y(snsInfo.field_snsId, j);
                if (!oVar.mo138310q(j2)) {
                    oVar.mo138286A(j2, Util.currentTicks());
                    oVar.mo138288C(j2, (int) (duration / 1000), true);
                    oVar.mo138298e(j2, j2);
                    Log.m105918d("SnsAd.OnlineAdVideoCallback", "doOnlinePlayerPlaying, addPlay3s, snsId=" + C102236a0.m134765q0(j2));
                }
                SnsMethodCalculate.markEndTimeMs("doOnlineVideoPlaying", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineAdVideoCallback");
            }
        }
        SnsMethodCalculate.markEndTimeMs(C66261f3.COL_UPDATETIME, "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineAdVideoCallback");
    }

    /* renamed from: b */
    public void mo132396b(int i) {
        SnsMethodCalculate.markStartTimeMs("onStart", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineAdVideoCallback");
        Log.m105918d("SnsAd.OnlineAdVideoCallback", "online player onStart is called, durationSecond=" + i + ", the item is " + m132794c(this.f296426d));
        SnsMethodCalculate.markEndTimeMs("onStart", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineAdVideoCallback");
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0085  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCompletion() {
        /*
            r11 = this;
            java.lang.String r0 = "onCompletion"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineAdVideoCallback"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "online player onCompletion is called , the item is "
            r2.append(r3)
            int r3 = r11.f296426d
            java.lang.String r3 = m132794c(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "SnsAd.OnlineAdVideoCallback"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r2)
            com.tencent.mm.plugin.sns.storage.SnsInfo r2 = r11.f296423a
            java.lang.ref.Reference<jp2.o> r4 = r11.f296425c
            java.lang.Object r4 = r4.get()
            jp2.o r4 = (jp2.C98963o) r4
            java.lang.ref.Reference<com.tencent.mm.plugin.sns.ui.OnlineVideoView> r5 = r11.f296424b
            java.lang.Object r5 = r5.get()
            com.tencent.mm.plugin.sns.ui.OnlineVideoView r5 = (com.tencent.p014mm.plugin.sns.p106ui.OnlineVideoView) r5
            java.lang.String r6 = "doOnlineVideoCompletion"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r1)
            if (r2 == 0) goto L_0x0080
            if (r4 == 0) goto L_0x0080
            long r7 = r2.field_snsId
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "doOnlinePlayerCompletion is called, snsId="
            r9.append(r10)
            java.lang.String r10 = vr2.C102236a0.m134765q0(r7)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r9)
            boolean r2 = r2.isAd()
            if (r2 != 0) goto L_0x007d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "online player completion, !isAd,  snsId="
            r2.append(r4)
            java.lang.String r4 = vr2.C102236a0.m134765q0(r7)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r2)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r1)
            goto L_0x0083
        L_0x007d:
            r4.mo138295b(r7)
        L_0x0080:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r1)
        L_0x0083:
            if (r5 == 0) goto L_0x008a
            r2 = 0
            r3 = 1
            r5.mo132322N(r2, r3)
        L_0x008a:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qq2.C101235b.onCompletion():void");
    }

    public void onPause() {
        SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineAdVideoCallback");
        Log.m105918d("SnsAd.OnlineAdVideoCallback", "online player paused.");
        C98963o oVar = this.f296425c.get();
        SnsInfo snsInfo = this.f296423a;
        if (!(oVar == null || snsInfo == null)) {
            oVar.mo138314u(snsInfo.field_snsId);
        }
        SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineAdVideoCallback");
    }
}
