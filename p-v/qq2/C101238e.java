package qq2;

import android.text.TextUtils;
import android.view.ViewGroup;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import jp2.C98963o;
import te3.C101804kv2;

/* renamed from: qq2.e */
public final class C101238e {

    /* renamed from: a */
    public final String f296436a;

    /* renamed from: b */
    public C98963o f296437b;

    /* renamed from: c */
    public SnsInfo f296438c;

    /* renamed from: d */
    public C101804kv2 f296439d;

    /* renamed from: e */
    public ViewGroup f296440e;

    /* renamed from: f */
    public String f296441f;

    /* renamed from: g */
    public String f296442g;

    public C101238e(String str) {
        this.f296436a = TextUtils.isEmpty(str) ? "OnlineVideoPlayBuilder" : str;
    }

    /* JADX WARNING: type inference failed for: r11v18, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo140703a(int r18, com.tencent.p014mm.plugin.sns.p106ui.video.SnsTimelineVideoView.C96253d r19) {
        /*
            r17 = this;
            r0 = r17
            java.lang.String r1 = "start"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoPlayBuilder"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            com.tencent.mm.plugin.sns.storage.SnsInfo r3 = r0.f296438c
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x0019
            java.lang.String r3 = r0.f296436a
            java.lang.String r6 = "OnlinePlayerHelper:the sns info is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r6)
            r3 = 0
            goto L_0x001a
        L_0x0019:
            r3 = 1
        L_0x001a:
            te3.kv2 r6 = r0.f296439d
            if (r6 != 0) goto L_0x0026
            java.lang.String r3 = r0.f296436a
            java.lang.String r6 = "OnlinePlayerHelper:the media object is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r6)
            r3 = 0
        L_0x0026:
            android.view.ViewGroup r6 = r0.f296440e
            if (r6 != 0) goto L_0x0032
            java.lang.String r3 = r0.f296436a
            java.lang.String r6 = "OnlinePlayerHelper:the container is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r6)
            r3 = 0
        L_0x0032:
            java.lang.String r6 = r0.f296441f
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 == 0) goto L_0x0042
            java.lang.String r3 = r0.f296436a
            java.lang.String r6 = "OnlinePlayerHelper:the time line id is empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r6)
            r3 = 0
        L_0x0042:
            java.lang.String r6 = r0.f296442g
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 == 0) goto L_0x0052
            java.lang.String r3 = r0.f296436a
            java.lang.String r6 = "OnlinePlayerHelper:the sns local id is empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r6)
            r3 = 0
        L_0x0052:
            jp2.o r6 = r0.f296437b
            if (r6 != 0) goto L_0x005e
            java.lang.String r3 = r0.f296436a
            java.lang.String r6 = "OnlinePlayerHelper:the snsAdStatistic is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r6)
            r3 = 0
        L_0x005e:
            if (r3 == 0) goto L_0x0179
            com.tencent.mm.plugin.sns.storage.SnsInfo r3 = r0.f296438c
            te3.kv2 r6 = r0.f296439d
            java.lang.String r13 = r0.f296441f
            android.view.ViewGroup r7 = r0.f296440e
            java.lang.String r8 = r0.f296442g
            jp2.o r9 = r0.f296437b
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            java.lang.String r10 = r0.f296436a
            java.lang.String r11 = "the online is to start"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r10, r11)
            if (r3 == 0) goto L_0x0176
            if (r6 == 0) goto L_0x0176
            if (r7 == 0) goto L_0x0176
            java.lang.String r10 = r0.f296436a
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "the sns info is "
            r11.append(r12)
            r11.append(r3)
            java.lang.String r12 = " the media is "
            r11.append(r12)
            r11.append(r6)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r11)
            bv2.f r10 = new bv2.f
            r10.<init>()
            r10.f264168a = r6
            r10.f264169b = r8
            long r11 = r3.field_snsId
            java.lang.String r8 = vr2.C102236a0.m134765q0(r11)
            r10.f264171d = r8
            int r8 = r3.getCreateTime()
            r10.f264170c = r8
            r8 = 0
            boolean r11 = rq2.C101432s.m133123e(r7)
            if (r11 == 0) goto L_0x00c5
            android.view.View r11 = r7.getChildAt(r5)
            boolean r12 = r11 instanceof com.tencent.p014mm.plugin.sns.p106ui.video.SnsTimelineVideoView
            if (r12 == 0) goto L_0x00c5
            r8 = r11
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView r8 = (com.tencent.p014mm.plugin.sns.p106ui.video.SnsTimelineVideoView) r8
        L_0x00c5:
            if (r8 == 0) goto L_0x00f4
            boolean r11 = r8.f281254N1
            if (r11 != 0) goto L_0x00f4
            bv2.f r11 = r8.f281250J1
            if (r11 == 0) goto L_0x00f4
            te3.kv2 r11 = r11.f264168a
            if (r11 == 0) goto L_0x00f4
            java.lang.String r11 = r8.f281251K1
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r13, (java.lang.String) r11)
            if (r11 == 0) goto L_0x00f4
            bv2.f r11 = r8.f281250J1
            te3.kv2 r11 = r11.f264168a
            java.lang.String r11 = r11.f298689d
            java.lang.String r6 = r6.f298689d
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r11, (java.lang.String) r6)
            if (r6 == 0) goto L_0x00f4
            java.lang.String r5 = r0.f296436a
            java.lang.String r6 = "the time line online video is already added!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r6)
            r5 = r19
            goto L_0x014f
        L_0x00f4:
            java.lang.String r6 = r0.f296436a
            java.lang.String r8 = "the time line online video is added, it need to be replaced"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r6, r8)
            long r11 = android.os.SystemClock.currentThreadTimeMillis()
            rq2.C101432s.m133121c(r7)
            com.tencent.mm.plugin.sns.ui.video.a r6 = com.tencent.p014mm.plugin.sns.p106ui.video.C96254a.m123394d()
            android.content.Context r8 = r7.getContext()
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView r6 = r6.mo133931c(r8)
            java.lang.String r8 = r0.f296436a
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "the time line online video is added, getAvailableVideoView, called: take "
            r14.append(r15)
            long r15 = android.os.SystemClock.currentThreadTimeMillis()
            long r11 = r15 - r11
            r14.append(r11)
            java.lang.String r11 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r11)
            java.lang.String r8 = "hasParent"
            java.lang.String r11 = "com.tencent.mm.plugin.sns.ad.utils.ViewUtils"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r11)
            android.view.ViewParent r12 = r6.getParent()
            if (r12 == 0) goto L_0x013a
            r5 = 1
        L_0x013a:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r11)
            if (r5 == 0) goto L_0x0145
            r6.mo133915c0()
            rq2.C101432s.m133126h(r6)
        L_0x0145:
            r5 = -1
            rq2.C101432s.m133131m(r6, r5, r5)
            rq2.C101432s.m133120b(r7, r6, r5)
            r5 = r19
            r8 = r6
        L_0x014f:
            r8.setUICallback(r5)
            rq2.C101432s.m133132n(r8, r4)
            android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.CENTER_CROP
            r8.setThumbViewScaleType(r4)
            com.tencent.mm.pluginsdk.ui.a$e r4 = com.tencent.p014mm.pluginsdk.p133ui.C96814a.C96817e.COVER
            r8.setVideoScaleType(r4)
            qq2.b r4 = new qq2.b
            r5 = r18
            r4.<init>(r3, r8, r9, r5)
            r8.setVideoCallback(r4)
            com.tencent.mm.plugin.sns.ui.video.a r7 = com.tencent.p014mm.plugin.sns.p106ui.video.C96254a.m123394d()
            r11 = 0
            r12 = 1
            java.lang.String r3 = ""
            r9 = r10
            r10 = r3
            r7.mo133939l(r8, r9, r10, r11, r12, r13)
        L_0x0176:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
        L_0x0179:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qq2.C101238e.mo140703a(int, com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView$d):void");
    }
}
