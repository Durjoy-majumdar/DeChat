package nt2;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import br2.C54550e;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94938q1;
import com.tencent.p014mm.plugin.sns.p104ad.widget.living.AdLivingStreamContainer;
import com.tencent.p014mm.plugin.sns.p106ui.SnsCommentDetailUI;
import com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.video.SnsTimelineVideoView;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.pluginsdk.p133ui.C96814a;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import jp2.C98957g;
import jp2.C98963o;
import jq2.C99000r;
import kg3.C76577a;
import lo2.C99556n;
import os2.C100416r;
import qq2.C101235b;
import rq2.C101432s;
import te3.C101789j00;
import te3.C101804kv2;
import vr2.C102236a0;

/* renamed from: nt2.b */
public class C100162b extends C100165c implements C98957g {

    /* renamed from: o */
    public Context f293398o;

    /* renamed from: p */
    public C98963o f293399p;

    /* renamed from: q */
    public boolean f293400q;

    /* renamed from: r */
    public SnsTimelineVideoView f293401r;

    /* renamed from: s */
    public ViewGroup f293402s;

    /* renamed from: t */
    public C99000r f293403t;

    /* renamed from: u */
    public int f293404u;

    /* renamed from: v */
    public int f293405v;

    /* renamed from: w */
    public ViewStub f293406w;

    /* renamed from: x */
    public AdLivingStreamContainer f293407x;

    /* renamed from: y */
    public C54550e f293408y;

    /* renamed from: z */
    public Handler f293409z = new Handler(Looper.getMainLooper());

    /* renamed from: nt2.b$a */
    public class C100163a implements SnsTimelineVideoView.C96253d {
        public C100163a(C100162b bVar) {
        }

        /* renamed from: O3 */
        public void mo133426O3(String str) {
            SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.detail.item.AdNormalSightDetailItem$1");
            Log.m105928w("MicroMsg.AdNormalSightDetailItem", "timelineVideoView setUICallback onDestroy");
            SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.detail.item.AdNormalSightDetailItem$1");
        }
    }

    /* renamed from: nt2.b$b */
    public class C100164b implements Runnable {
        public C100164b() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.detail.item.AdNormalSightDetailItem$2");
            if (C100162b.m130878h(C100162b.this).mo132371x() || C100162b.m130878h(C100162b.this).mo133919h0()) {
                Log.m105918d("MicroMsg.AdNormalSightDetailItem", "resumePlay");
                C100162b.m130878h(C100162b.this).mo130404K();
            } else {
                Log.m105918d("MicroMsg.AdNormalSightDetailItem", "onResume");
                C100162b.m130878h(C100162b.this).mo130403E();
            }
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.detail.item.AdNormalSightDetailItem$2");
        }
    }

    public C100162b(TimeLineObject timeLineObject, SnsInfo snsInfo, TimelineClickListener timelineClickListener, C98963o oVar) {
        this.f293411d = timeLineObject;
        this.f293412e = snsInfo;
        this.f293418n = timelineClickListener;
        this.f293399p = oVar;
        snsInfo.getLocalid();
    }

    /* renamed from: h */
    public static /* synthetic */ SnsTimelineVideoView m130878h(C100162b bVar) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.detail.item.AdNormalSightDetailItem");
        SnsTimelineVideoView snsTimelineVideoView = bVar.f293401r;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.detail.item.AdNormalSightDetailItem");
        return snsTimelineVideoView;
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x0305  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0336  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0353  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x041f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo139451a(android.view.View r20, android.view.View r21) {
        /*
            r19 = this;
            r0 = r19
            java.lang.String r1 = "initView"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ui.detail.item.AdNormalSightDetailItem"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            r3 = r20
            r0.f293413f = r3
            android.content.Context r3 = r20.getContext()
            r0.f293398o = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "initView, hash="
            r3.append(r4)
            int r4 = r19.hashCode()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "MicroMsg.AdNormalSightDetailItem"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            com.tencent.mm.protocal.protobuf.TimeLineObject r3 = r0.f293411d
            java.lang.String r5 = ""
            r6 = 1
            r7 = 0
            if (r3 == 0) goto L_0x043f
            com.tencent.mm.plugin.sns.storage.SnsInfo r3 = r0.f293412e
            if (r3 == 0) goto L_0x043f
            boolean r3 = r3.isAd()
            if (r3 != 0) goto L_0x0041
            goto L_0x043f
        L_0x0041:
            android.content.Context r3 = r0.f293398o
            java.lang.String r8 = "window"
            java.lang.Object r3 = r3.getSystemService(r8)
            android.view.WindowManager r3 = (android.view.WindowManager) r3
            android.view.Display r3 = r3.getDefaultDisplay()
            int r3 = r3.getWidth()
            com.tencent.mm.plugin.sns.ui.m2 r8 = new com.tencent.mm.plugin.sns.ui.m2
            r8.<init>()
            r0.f293415h = r8
            android.view.View r8 = r0.f293413f
            r9 = 2131299182(0x7f090b6e, float:1.8216358E38)
            android.view.View r9 = r8.findViewById(r9)
            com.tencent.mm.plugin.sns.ui.m2 r10 = r0.f293415h
            r10.f280501d = r8
            r10.f280505h = r9
            r11 = 2131314332(0x7f09469c, float:1.8247086E38)
            android.view.View r11 = r8.findViewById(r11)
            android.widget.ImageView r11 = (android.widget.ImageView) r11
            r10.f280506i = r11
            com.tencent.mm.plugin.sns.ui.m2 r10 = r0.f293415h
            r11 = 2131311498(0x7f093b8a, float:1.8241338E38)
            android.view.View r11 = r8.findViewById(r11)
            com.tencent.mm.ui.widget.MMPinProgressBtn r11 = (com.tencent.p014mm.p136ui.widget.MMPinProgressBtn) r11
            r10.f280507j = r11
            com.tencent.mm.plugin.sns.ui.m2 r10 = r0.f293415h
            r11 = 2131301687(0x7f091537, float:1.8221439E38)
            android.view.View r11 = r8.findViewById(r11)
            android.widget.TextView r11 = (android.widget.TextView) r11
            r10.f280508k = r11
            com.tencent.mm.plugin.sns.ui.m2 r10 = r0.f293415h
            r11 = 2131301661(0x7f09151d, float:1.8221386E38)
            android.view.View r11 = r8.findViewById(r11)
            android.widget.TextView r11 = (android.widget.TextView) r11
            r10.f280509l = r11
            com.tencent.mm.plugin.sns.ui.m2 r10 = r0.f293415h
            com.tencent.mm.protocal.protobuf.TimeLineObject r11 = r0.f293411d
            com.tencent.mm.plugin.sns.storage.SnsInfo r12 = r0.f293412e
            java.lang.String r12 = r12.getLocalid()
            com.tencent.mm.plugin.sns.storage.SnsInfo r13 = r0.f293412e
            boolean r13 = r13.isAd()
            r10.mo133598a(r11, r7, r12, r13)
            com.tencent.mm.plugin.sns.ui.m2 r10 = r0.f293415h
            android.widget.TextView r10 = r10.f280508k
            r11 = 8
            r10.setVisibility(r11)
            com.tencent.mm.plugin.sns.ui.m2 r10 = r0.f293415h
            r11 = 5
            r10.f280512o = r11
            r11 = 2131314093(0x7f0945ad, float:1.8246601E38)
            android.view.View r11 = r8.findViewById(r11)
            android.widget.ImageView r11 = (android.widget.ImageView) r11
            r10.f280510m = r11
            r10 = 2131314162(0x7f0945f2, float:1.8246741E38)
            android.view.View r10 = r8.findViewById(r10)
            android.view.ViewGroup r10 = (android.view.ViewGroup) r10
            r0.f293402s = r10
            r10 = 2131313847(0x7f0944b7, float:1.8246102E38)
            android.view.View r8 = r8.findViewById(r10)
            android.view.ViewStub r8 = (android.view.ViewStub) r8
            r0.f293406w = r8
            com.tencent.mm.plugin.sns.ui.m2 r8 = r0.f293415h
            r9.setTag(r8)
            com.tencent.mm.plugin.sns.ui.m2 r8 = r0.f293415h
            android.view.View r8 = r8.f280505h
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r10 = r0.f293418n
            android.view.View$OnClickListener r10 = r10.f280353I
            r8.setOnClickListener(r10)
            com.tencent.mm.plugin.sns.storage.SnsInfo r8 = r0.f293412e
            boolean r8 = r8.isAd()
            if (r8 == 0) goto L_0x015a
            com.tencent.mm.protocal.protobuf.TimeLineObject r8 = r0.f293411d
            boolean r8 = vr2.C102260r.m134846O(r8)
            if (r8 == 0) goto L_0x015a
            com.tencent.mm.plugin.sns.storage.SnsInfo r8 = r0.f293412e
            if (r8 == 0) goto L_0x0109
            com.tencent.mm.plugin.sns.storage.ADXml r8 = r8.getAdXml()
            int r8 = r8.verticalVideoDisplayType
            goto L_0x010a
        L_0x0109:
            r8 = 0
        L_0x010a:
            if (r8 != r6) goto L_0x0119
            com.tencent.mm.plugin.sns.ui.m2 r8 = r0.f293415h
            android.view.View r8 = r8.f280505h
            android.content.Context r8 = r8.getContext()
            android.util.Pair r8 = ad0.C91999u.m115568n(r8)
            goto L_0x0127
        L_0x0119:
            com.tencent.mm.protocal.protobuf.TimeLineObject r8 = r0.f293411d
            com.tencent.mm.plugin.sns.ui.m2 r10 = r0.f293415h
            android.view.View r10 = r10.f280505h
            android.content.Context r10 = r10.getContext()
            android.util.Pair r8 = ad0.C91999u.m115566l(r8, r10, r7)
        L_0x0127:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "isVerticalAdVideo=true, snsId="
            r10.append(r11)
            com.tencent.mm.plugin.sns.storage.SnsInfo r11 = r0.f293412e
            long r11 = r11.field_snsId
            java.lang.String r11 = vr2.C102236a0.m134765q0(r11)
            r10.append(r11)
            java.lang.String r11 = ", showW="
            r10.append(r11)
            java.lang.Object r11 = r8.first
            r10.append(r11)
            java.lang.String r11 = ", showH="
            r10.append(r11)
            java.lang.Object r11 = r8.second
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r10)
            r10 = 1
            goto L_0x016f
        L_0x015a:
            com.tencent.mm.protocal.protobuf.TimeLineObject r8 = r0.f293411d
            com.tencent.mm.plugin.sns.ui.m2 r10 = r0.f293415h
            android.view.View r10 = r10.f280505h
            android.content.Context r10 = r10.getContext()
            com.tencent.mm.plugin.sns.storage.SnsInfo r11 = r0.f293412e
            boolean r11 = r11.isAd()
            android.util.Pair r8 = ad0.C91999u.m115566l(r8, r10, r11)
            r10 = 0
        L_0x016f:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "set value to size first time, isVerticalAdVideo is "
            r11.append(r12)
            r11.append(r10)
            java.lang.String r12 = ", snsId is "
            r11.append(r12)
            com.tencent.mm.plugin.sns.storage.SnsInfo r13 = r0.f293412e
            long r13 = r13.field_snsId
            java.lang.String r13 = vr2.C102236a0.m134765q0(r13)
            r11.append(r13)
            java.lang.String r13 = ", size first is "
            r11.append(r13)
            java.lang.Object r14 = r8.first
            r11.append(r14)
            java.lang.String r14 = ", size second is "
            r11.append(r14)
            java.lang.Object r15 = r8.second
            r11.append(r15)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r11)
            r0.f293400q = r6
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r15 = "normal ad detail useOnlineVideo="
            r11.append(r15)
            boolean r15 = r0.f293400q
            r11.append(r15)
            java.lang.String r15 = ", snsId="
            r11.append(r15)
            com.tencent.mm.protocal.protobuf.TimeLineObject r15 = r0.f293411d
            if (r15 != 0) goto L_0x01c4
            goto L_0x01c6
        L_0x01c4:
            java.lang.String r5 = r15.f283893Id
        L_0x01c6:
            r11.append(r5)
            java.lang.String r5 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            com.tencent.mm.plugin.sns.storage.SnsInfo r5 = r0.f293412e
            com.tencent.mm.plugin.sns.storage.ADXml r11 = r5.getAdXml()
            if (r11 == 0) goto L_0x02f1
            boolean r15 = r11.isCardAd()
            if (r15 == 0) goto L_0x02f1
            float r15 = r11.adMediaDisplayWidth
            r16 = 0
            int r17 = (r15 > r16 ? 1 : (r15 == r16 ? 0 : -1))
            if (r17 <= 0) goto L_0x02f1
            float r7 = r11.adMediaDisplayHeight
            int r7 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r7 <= 0) goto L_0x02f1
            double r6 = (double) r15
            int r15 = r11.adBasicRemWidth
            r16 = r8
            int r8 = r11.adBasicRootFontSize
            r17 = r1
            r1 = 1
            float r6 = ps2.C100894u.m132234n(r6, r1, r15, r8)
            float r7 = r11.adMediaDisplayHeight
            double r7 = (double) r7
            int r15 = r11.adBasicRemWidth
            r18 = r2
            int r2 = r11.adBasicRootFontSize
            float r2 = ps2.C100894u.m132234n(r7, r1, r15, r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r7 = "set value to size second time previously, isVerticalAdVideo is "
            r1.append(r7)
            r1.append(r10)
            r1.append(r12)
            com.tencent.mm.plugin.sns.storage.SnsInfo r7 = r0.f293412e
            long r7 = r7.field_snsId
            java.lang.String r7 = vr2.C102236a0.m134765q0(r7)
            r1.append(r7)
            java.lang.String r7 = ", adMediaWidth is "
            r1.append(r7)
            r1.append(r6)
            java.lang.String r7 = ", adMediaHeight is "
            r1.append(r7)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
            android.content.Context r1 = r0.f293398o
            r7 = 2131165651(0x7f0701d3, float:1.7945525E38)
            int r1 = kg3.C76577a.m92157h(r1, r7)
            android.content.Context r7 = r0.f293398o
            android.content.res.Resources r7 = r7.getResources()
            r8 = 2131165590(0x7f070196, float:1.7945401E38)
            int r7 = r7.getDimensionPixelSize(r8)
            android.content.Context r8 = r0.f293398o
            r15 = 2131167200(0x7f0707e0, float:1.7948667E38)
            int r8 = kg3.C76577a.m92157h(r8, r15)
            int r15 = r11.adMediaDisplayMode
            if (r15 != 0) goto L_0x027f
            int r3 = r3 - r8
            int r3 = r3 - r1
            int r3 = r3 - r7
            int r3 = r3 - r7
            float r1 = (float) r3
            int r3 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r3 < 0) goto L_0x0270
            float r2 = r11.adMediaDisplayHeight
            float r2 = r2 * r1
            float r3 = r11.adMediaDisplayWidth
            float r2 = r2 / r3
            int r2 = (int) r2
            float r2 = (float) r2
            r6 = r1
        L_0x0270:
            int r1 = (int) r6
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r2 = (int) r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            android.util.Pair r8 = android.util.Pair.create(r1, r2)
            goto L_0x02bd
        L_0x027f:
            r2 = 1
            if (r15 != r2) goto L_0x029e
            int r3 = r3 - r8
            int r3 = r3 - r8
            int r3 = r3 - r1
            int r3 = r3 - r1
            int r3 = r3 - r7
            int r3 = r3 - r7
            float r1 = (float) r3
            float r2 = r11.adMediaDisplayHeight
            float r1 = r1 * r2
            float r2 = r11.adMediaDisplayWidth
            float r1 = r1 / r2
            int r1 = (int) r1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            android.util.Pair r8 = android.util.Pair.create(r2, r1)
            goto L_0x02bd
        L_0x029e:
            r2 = 2
            if (r15 != r2) goto L_0x02bb
            int r3 = r3 - r8
            int r3 = r3 - r1
            int r3 = r3 - r7
            int r3 = r3 - r7
            float r1 = (float) r3
            float r2 = r11.adMediaDisplayHeight
            float r1 = r1 * r2
            float r2 = r11.adMediaDisplayWidth
            float r1 = r1 / r2
            int r1 = (int) r1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            android.util.Pair r8 = android.util.Pair.create(r2, r1)
            goto L_0x02bd
        L_0x02bb:
            r8 = r16
        L_0x02bd:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "set value to size second time, isVerticalAdVideo is "
            r1.append(r2)
            r1.append(r10)
            r1.append(r12)
            com.tencent.mm.plugin.sns.storage.SnsInfo r2 = r0.f293412e
            long r2 = r2.field_snsId
            java.lang.String r2 = vr2.C102236a0.m134765q0(r2)
            r1.append(r2)
            r1.append(r13)
            java.lang.Object r2 = r8.first
            r1.append(r2)
            r1.append(r14)
            java.lang.Object r2 = r8.second
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
            goto L_0x02f9
        L_0x02f1:
            r17 = r1
            r18 = r2
            r16 = r8
            r8 = r16
        L_0x02f9:
            int r1 = r19.mo139457i()
            com.tencent.mm.plugin.sns.storage.ADInfo r1 = r5.getAdInfo(r1)
            jq2.r r2 = r0.f293403t
            if (r2 != 0) goto L_0x030c
            jq2.r r2 = new jq2.r
            r2.<init>()
            r0.f293403t = r2
        L_0x030c:
            com.tencent.mm.plugin.sns.storage.SnsInfo r2 = r0.f293412e
            boolean r2 = r2.isAd()
            if (r2 == 0) goto L_0x0367
            if (r1 == 0) goto L_0x0367
            com.tencent.mm.plugin.sns.storage.ADXml r2 = r5.getAdXml()
            boolean r2 = r2.isLandingPagesAd()
            if (r2 != 0) goto L_0x0367
            jq2.r r2 = r0.f293403t
            if (r2 == 0) goto L_0x0367
            com.tencent.mm.plugin.sns.storage.SnsInfo r3 = r0.f293412e
            boolean r2 = r2.mo138357b(r3)
            if (r2 != 0) goto L_0x0367
            r3 = 0
            boolean r2 = r1.checkCurIndexCanJump(r3)
            r4 = 2131235646(0x7f08133e, float:1.8087492E38)
            if (r2 == 0) goto L_0x0353
            java.util.List<com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo> r2 = r1.adClickActionInfoList
            java.lang.Object r2 = r2.get(r3)
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo r2 = (com.tencent.p014mm.plugin.sns.p104ad.adxml.AdClickActionInfo) r2
            boolean r1 = r1.isWeApp(r2)
            if (r1 == 0) goto L_0x0367
            com.tencent.mm.plugin.sns.ui.m2 r1 = r0.f293415h
            android.widget.ImageView r1 = r1.f280510m
            r1.setVisibility(r3)
            com.tencent.mm.plugin.sns.ui.m2 r1 = r0.f293415h
            android.widget.ImageView r1 = r1.f280510m
            r1.setImageResource(r4)
            goto L_0x0367
        L_0x0353:
            boolean r1 = r1.isWeapp()
            if (r1 == 0) goto L_0x0367
            com.tencent.mm.plugin.sns.ui.m2 r1 = r0.f293415h
            android.widget.ImageView r1 = r1.f280510m
            r1.setVisibility(r3)
            com.tencent.mm.plugin.sns.ui.m2 r1 = r0.f293415h
            android.widget.ImageView r1 = r1.f280510m
            r1.setImageResource(r4)
        L_0x0367:
            com.tencent.mm.plugin.sns.ui.m2 r1 = r0.f293415h
            android.widget.TextView r1 = r1.f280509l
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            java.lang.Object r2 = r8.first
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.width = r2
            java.lang.Object r2 = r8.second
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.height = r2
            com.tencent.mm.plugin.sns.ui.m2 r2 = r0.f293415h
            android.widget.TextView r2 = r2.f280509l
            r2.setLayoutParams(r1)
            android.view.ViewGroup r1 = r0.f293402s
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            java.lang.Object r2 = r8.first
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.width = r2
            java.lang.Object r2 = r8.second
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.height = r2
            android.view.ViewGroup r2 = r0.f293402s
            r2.setLayoutParams(r1)
            com.tencent.mm.plugin.sns.ui.m2 r1 = r0.f293415h
            android.view.View r1 = r1.f280505h
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            java.lang.Object r2 = r8.first
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.width = r2
            java.lang.Object r2 = r8.second
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.height = r2
            com.tencent.mm.plugin.sns.ui.m2 r2 = r0.f293415h
            android.view.View r2 = r2.f280505h
            r2.setLayoutParams(r1)
            com.tencent.mm.plugin.sns.storage.SnsInfo r1 = r0.f293412e
            boolean r1 = br2.C54550e.m61296a(r1)
            if (r1 == 0) goto L_0x03e6
            android.view.ViewStub r1 = r0.f293406w
            if (r1 == 0) goto L_0x03e6
            com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer r2 = r0.f293407x
            if (r2 != 0) goto L_0x03e6
            android.view.View r1 = rq2.C101432s.m133125g(r1)
            com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer r1 = (com.tencent.p014mm.plugin.sns.p104ad.widget.living.AdLivingStreamContainer) r1
            r0.f293407x = r1
        L_0x03e6:
            java.lang.Object r1 = r8.first
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.f293404u = r1
            java.lang.Object r1 = r8.second
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.f293405v = r1
            com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer r1 = r0.f293407x
            java.lang.Object r2 = r8.first
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.lang.Object r3 = r8.second
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            rq2.C101432s.m133131m(r1, r2, r3)
            com.tencent.mm.plugin.sns.ui.m2 r1 = r0.f293415h
            r9.setTag(r1)
            java.lang.String r1 = "addOnRemovedListener"
            r6 = r18
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r6)
            jp2.o r2 = r0.f293399p
            if (r2 == 0) goto L_0x0436
            com.tencent.mm.plugin.sns.storage.SnsInfo r3 = r0.f293412e
            java.lang.String r3 = vr2.C102236a0.m134728W(r3)
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L_0x0436
            java.lang.String r4 = "0"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L_0x0436
            r2.mo138294a(r3, r0)
        L_0x0436:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r6)
            r1 = r17
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r6)
            return
        L_0x043f:
            r6 = r2
            r2 = 1
            r3 = 0
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "initView return, timelineObj==null?"
            r7.append(r8)
            com.tencent.mm.protocal.protobuf.TimeLineObject r8 = r0.f293411d
            if (r8 != 0) goto L_0x0452
            r8 = 1
            goto L_0x0453
        L_0x0452:
            r8 = 0
        L_0x0453:
            r7.append(r8)
            java.lang.String r8 = ", snsInfo==null?"
            r7.append(r8)
            com.tencent.mm.plugin.sns.storage.SnsInfo r8 = r0.f293412e
            if (r8 != 0) goto L_0x0460
            goto L_0x0461
        L_0x0460:
            r2 = 0
        L_0x0461:
            r7.append(r2)
            java.lang.String r2 = ", id="
            r7.append(r2)
            com.tencent.mm.protocal.protobuf.TimeLineObject r2 = r0.f293411d
            if (r2 != 0) goto L_0x046e
            goto L_0x0470
        L_0x046e:
            java.lang.String r5 = r2.f283893Id
        L_0x0470:
            r7.append(r5)
            java.lang.String r2 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r2)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nt2.C100162b.mo139451a(android.view.View, android.view.View):void");
    }

    /* renamed from: b */
    public void mo139452b() {
        SnsInfo snsInfo;
        SnsTimelineVideoView snsTimelineVideoView;
        SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.detail.item.AdNormalSightDetailItem");
        try {
            boolean a = C54550e.m61296a(this.f293412e);
            Log.m105924i("MicroMsg.AdNormalSightDetailItem", "onPause, isAdUseOnlineVideoView=" + this.f293400q + ", isAdLivingStream=" + a);
            if (a) {
                this.f293408y.mo75432g();
                SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.detail.item.AdNormalSightDetailItem");
                return;
            }
            if (this.f293400q && (snsTimelineVideoView = this.f293401r) != null) {
                snsTimelineVideoView.mo132317G();
            }
            C98963o oVar = this.f293399p;
            if (!(oVar == null || (snsInfo = this.f293412e) == null)) {
                oVar.mo138314u(snsInfo.field_snsId);
            }
            SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.detail.item.AdNormalSightDetailItem");
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.AdNormalSightDetailItem", "onPause, exp=" + th.toString());
        }
    }

    /* renamed from: d */
    public void mo133425d(String str) {
        C54550e eVar;
        SnsMethodCalculate.markStartTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ui.detail.item.AdNormalSightDetailItem");
        if (C54550e.m61296a(this.f293412e) && (eVar = this.f293408y) != null) {
            eVar.mo75427b();
        }
        SnsMethodCalculate.markEndTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ui.detail.item.AdNormalSightDetailItem");
    }

    /* renamed from: g */
    public void mo139454g() {
        C99000r rVar;
        SnsMethodCalculate.markStartTimeMs("refreshView", "com.tencent.mm.plugin.sns.ui.detail.item.AdNormalSightDetailItem");
        this.f293412e = C100416r.m131408a(this.f293412e.getSnsId());
        Log.m105924i("MicroMsg.AdNormalSightDetailItem", "refreshView, hash=" + hashCode());
        C101789j00 j002 = this.f293411d.ContentObj;
        boolean z = false;
        C101804kv2 kv22 = (j002 == null || j002.f298427h.size() < 1) ? null : this.f293411d.ContentObj.f298427h.get(0);
        if (kv22 != null && this.f293400q) {
            C99556n.m129940c(this.f293412e, kv22);
        }
        C101789j00 j003 = this.f293411d.ContentObj;
        if (j003 != null && j003.f298427h.size() >= 1) {
            if (C54550e.m61296a(this.f293412e)) {
                C99000r rVar2 = this.f293403t;
                if (rVar2 != null) {
                    rVar2.mo138356a(this.f293398o, this.f293412e, this.f293413f, mo139457i());
                }
                SnsInfo snsInfo = this.f293412e;
                SnsMethodCalculate.markStartTimeMs("fillAdLivingStreamViewInfo", "com.tencent.mm.plugin.sns.ui.detail.item.AdNormalSightDetailItem");
                if (this.f293407x == null) {
                    SnsMethodCalculate.markEndTimeMs("fillAdLivingStreamViewInfo", "com.tencent.mm.plugin.sns.ui.detail.item.AdNormalSightDetailItem");
                } else {
                    this.f293415h.f280506i.setVisibility(8);
                    this.f293415h.f280507j.setVisibility(8);
                    this.f293402s.setVisibility(8);
                    if (this.f293408y == null) {
                        this.f293408y = new C54550e(this.f293407x);
                    }
                    this.f293408y.mo75429d(snsInfo, ((SnsCommentDetailUI) this.f293398o).mo132622j8(), kv22, Integer.valueOf(this.f293404u), Integer.valueOf(this.f293405v));
                    SnsMethodCalculate.markEndTimeMs("fillAdLivingStreamViewInfo", "com.tencent.mm.plugin.sns.ui.detail.item.AdNormalSightDetailItem");
                }
                this.f293408y.mo75434i();
            } else {
                if (!C94866e1.Fx0().mo131141x(kv22)) {
                    if (C94866e1.Fx0().mo131140w(kv22)) {
                        this.f293415h.f280506i.setVisibility(8);
                        this.f293415h.f280507j.setVisibility(0);
                        this.f293415h.f280507j.mo153891a();
                    } else if (!this.f293412e.isAd() || C94866e1.Fx0().mo131133p(this.f293412e) != 5) {
                        C94866e1.Fx0().mo131098R(kv22);
                        this.f293415h.f280506i.setVisibility(0);
                        this.f293415h.f280507j.setVisibility(8);
                        this.f293415h.f280506i.setImageDrawable(C76577a.m92158i(this.f293398o, C0966R.raw.shortvideo_play_btn));
                    } else {
                        C94866e1.Fx0().mo131097Q(kv22);
                        this.f293415h.f280506i.setVisibility(8);
                        this.f293415h.f280507j.setVisibility(0);
                        this.f293415h.f280507j.mo153891a();
                    }
                } else if (C94866e1.Fx0().mo131143z(kv22)) {
                    this.f293415h.f280506i.setVisibility(0);
                    this.f293415h.f280507j.setVisibility(8);
                    this.f293415h.f280506i.setImageDrawable(C76577a.m92158i(this.f293398o, C0966R.raw.shortvideo_play_btn));
                } else if (C94866e1.Fx0().mo131139v(kv22)) {
                    this.f293415h.f280506i.setVisibility(8);
                    this.f293415h.f280507j.setVisibility(8);
                } else if (!this.f293412e.isAd() || C94866e1.Fx0().mo131133p(this.f293412e) > 5) {
                    C94866e1.Fx0().mo131098R(kv22);
                    this.f293415h.f280506i.setVisibility(0);
                    this.f293415h.f280507j.setVisibility(8);
                    this.f293415h.f280506i.setImageDrawable(C76577a.m92158i(this.f293398o, C0966R.raw.shortvideo_play_btn));
                } else {
                    this.f293415h.f280506i.setVisibility(8);
                    this.f293415h.f280507j.setVisibility(8);
                }
                if (this.f293400q) {
                    if (this.f293401r == null) {
                        C101432s.m133121c(this.f293402s);
                        SnsTimelineVideoView snsTimelineVideoView = new SnsTimelineVideoView(this.f293398o, true);
                        this.f293401r = snsTimelineVideoView;
                        snsTimelineVideoView.mo132372y(false);
                        this.f293401r.setVideoScaleType(C96814a.C96817e.COVER);
                        this.f293401r.setThumbViewScaleType(ImageView.ScaleType.CENTER_CROP);
                        C101432s.m133131m(this.f293401r, -1, -1);
                        C101432s.m133132n(this.f293401r, true);
                        C101432s.m133120b(this.f293402s, this.f293401r, 0);
                        this.f293401r.setUICallback(new C100163a(this));
                        SnsTimelineVideoView snsTimelineVideoView2 = this.f293401r;
                        snsTimelineVideoView2.setVideoCallback(new C101235b(this.f293412e, snsTimelineVideoView2, this.f293399p, 1));
                        Log.m105924i("MicroMsg.AdNormalSightDetailItem", "refreshView, new OnLineVideoView, hash=" + this.f293401r.hashCode() + ", innerType=" + this.f293401r.getInnerVideoView());
                    } else {
                        Log.m105924i("MicroMsg.AdNormalSightDetailItem", "refreshView, OnLineVideoView.hash=" + this.f293401r.hashCode() + ", hasErr=" + this.f293401r.mo132368t());
                    }
                    this.f293401r.setMute(true);
                    this.f293401r.mo132324P(kv22, this.f293412e.getLocalid(), this.f293412e.getTimeLine().CreateTime);
                    this.f293401r.mo132334a();
                    this.f293401r.mo132370w();
                    this.f293409z.removeCallbacksAndMessages((Object) null);
                    this.f293409z.postDelayed(new C100164b(), 250);
                    C101432s.m133132n(this.f293415h.f280507j, false);
                    if (this.f293401r.mo132368t()) {
                        Log.m105920e("MicroMsg.AdNormalSightDetailItem", "play video error " + kv22.f298689d + " " + kv22.f298692g + " " + kv22.f298694i);
                        C94866e1.Fx0().mo131098R(kv22);
                        C101432s.m133132n(this.f293415h.f280506i, true);
                        C101432s.m133132n(this.f293415h.f280507j, false);
                        this.f293415h.f280506i.setImageDrawable(C76577a.m92158i(this.f293398o, C0966R.raw.shortvideo_play_btn));
                        C115669n.INSTANCE.mo175911u(1910, 1);
                    }
                }
                if (this.f293399p != null) {
                    String e = C94938q1.m120518e(C94866e1.m120262YO(), kv22.f298689d);
                    String T = C102236a0.m134725T(kv22);
                    if (C86013q1.m106450k(e + T)) {
                        this.f293399p.mo138292G(this.f293412e.field_snsId, (int) kv22.f298684R, true);
                        C99556n.m129942e();
                    } else {
                        this.f293399p.mo138292G(this.f293412e.field_snsId, (int) kv22.f298684R, false);
                    }
                    if (C94866e1.Fx0().mo131133p(this.f293412e) == 5) {
                        z = true;
                    }
                    this.f293399p.mo138290E(this.f293412e.field_snsId, z, 1);
                }
            }
        }
        if (!C54550e.m61296a(this.f293412e) && (rVar = this.f293403t) != null) {
            rVar.mo138356a(this.f293398o, this.f293412e, this.f293413f, mo139457i());
        }
        SnsMethodCalculate.markEndTimeMs("refreshView", "com.tencent.mm.plugin.sns.ui.detail.item.AdNormalSightDetailItem");
    }

    /* renamed from: i */
    public final int mo139457i() {
        SnsMethodCalculate.markStartTimeMs("getSource", "com.tencent.mm.plugin.sns.ui.detail.item.AdNormalSightDetailItem");
        C98963o oVar = this.f293399p;
        if (oVar != null) {
            int i = oVar.f290131k;
            SnsMethodCalculate.markEndTimeMs("getSource", "com.tencent.mm.plugin.sns.ui.detail.item.AdNormalSightDetailItem");
            return i;
        }
        SnsMethodCalculate.markEndTimeMs("getSource", "com.tencent.mm.plugin.sns.ui.detail.item.AdNormalSightDetailItem");
        return 1;
    }
}
