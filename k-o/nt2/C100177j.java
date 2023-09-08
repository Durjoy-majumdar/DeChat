package nt2;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import co2.C92448q;
import co2.C92449r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.RoundedCornerFrameLayout;
import com.tencent.p014mm.plugin.sns.p104ad.timeline.item.adSlideFullCard.AdSlideRecyclerView;
import com.tencent.p014mm.plugin.sns.p104ad.widget.recyclerview.CardLayoutManager;
import com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.ADXml;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import er2.C20611c;
import er2.C97692a;
import er2.C97693b;
import gr2.C98183a;
import gr2.C98184b;
import gr2.C98185c;
import gr2.C98189d;
import java.util.ArrayList;
import java.util.List;
import jp2.C98957g;
import jp2.C98963o;
import kg3.C76577a;
import lq2.C61378b;
import lq2.C99583c;
import lq2.C99585d;
import lq2.C99586f;
import lq2.C99588h;
import qq2.C101239f;
import rq2.C63505q;
import up2.C102064e;
import vr2.C102236a0;

/* renamed from: nt2.j */
public class C100177j extends C100165c implements C97693b, C97692a, C98957g {

    /* renamed from: A */
    public ViewGroup f293478A;

    /* renamed from: B */
    public C98189d f293479B;

    /* renamed from: C */
    public FrameLayout f293480C;

    /* renamed from: D */
    public Rect f293481D = new Rect();

    /* renamed from: E */
    public Point f293482E = new Point();

    /* renamed from: F */
    public View f293483F;

    /* renamed from: G */
    public int[] f293484G = new int[2];

    /* renamed from: H */
    public int[] f293485H = new int[2];

    /* renamed from: I */
    public int[] f293486I = new int[2];

    /* renamed from: J */
    public int[] f293487J = new int[2];

    /* renamed from: K */
    public C98183a f293488K = new C100178a();

    /* renamed from: o */
    public Context f293489o;

    /* renamed from: p */
    public View f293490p;

    /* renamed from: q */
    public int f293491q;

    /* renamed from: r */
    public RoundedCornerFrameLayout f293492r;

    /* renamed from: s */
    public AdSlideRecyclerView f293493s;

    /* renamed from: t */
    public CardLayoutManager f293494t;

    /* renamed from: u */
    public C98963o f293495u;

    /* renamed from: v */
    public C101239f f293496v = new C101239f();

    /* renamed from: w */
    public C99588h f293497w;

    /* renamed from: x */
    public C99583c f293498x;

    /* renamed from: y */
    public C102064e f293499y;

    /* renamed from: z */
    public ViewGroup f293500z;

    /* renamed from: nt2.j$a */
    public class C100178a implements C98183a {
        public C100178a() {
        }

        /* renamed from: a */
        public Rect mo137482a() {
            SnsMethodCalculate.markStartTimeMs("onGetAnimDiplayRect", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem$1");
            try {
                int width = C100177j.this.f293416i.getWidth();
                C100177j jVar = C100177j.this;
                jVar.f293416i.getLocationOnScreen(C100177j.m130915h(jVar));
                C100177j jVar2 = C100177j.this;
                jVar2.f293416i.getLocalVisibleRect(C100177j.m130916i(jVar2));
                C100177j jVar3 = C100177j.this;
                SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
                View view = jVar3.f293483F;
                SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
                view.getLocationOnScreen(C100177j.m130917j(C100177j.this));
                Log.m105918d("SnsAd.SlideFullCardDetailItem", "onGetAnimDiplayRect, locRoot=" + C100177j.m130915h(C100177j.this)[0] + ", " + C100177j.m130915h(C100177j.this)[1] + ", locComment=" + C100177j.m130917j(C100177j.this)[0] + ", " + C100177j.m130917j(C100177j.this)[1] + ", ret=" + C100177j.m130916i(C100177j.this));
                int i = C100177j.m130917j(C100177j.this)[1];
                C100177j jVar4 = C100177j.this;
                SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
                View view2 = jVar4.f293483F;
                SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
                C100177j.m130916i(C100177j.this).set(0, 0, width, ((i + view2.getHeight()) - C100177j.m130915h(C100177j.this)[1]) - C100177j.m130916i(C100177j.this).top);
                Rect i2 = C100177j.m130916i(C100177j.this);
                SnsMethodCalculate.markEndTimeMs("onGetAnimDiplayRect", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem$1");
                return i2;
            } catch (Throwable th) {
                Log.m105920e("SnsAd.SlideFullCardDetailItem", "onGetAnimDiplayRect, exp=" + th.toString());
                SnsMethodCalculate.markEndTimeMs("onGetAnimDiplayRect", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem$1");
                return null;
            }
        }

        /* renamed from: b */
        public Point mo137483b() {
            SnsMethodCalculate.markStartTimeMs("onGetCoordOffset", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem$1");
            try {
                C100177j jVar = C100177j.this;
                if (jVar.f293492r != null) {
                    SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
                    FrameLayout frameLayout = jVar.f293480C;
                    SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
                    if (frameLayout != null) {
                        C100177j jVar2 = C100177j.this;
                        jVar2.f293492r.getLocationOnScreen(C100177j.m130918k(jVar2));
                        C100177j jVar3 = C100177j.this;
                        SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
                        FrameLayout frameLayout2 = jVar3.f293480C;
                        SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
                        frameLayout2.getLocationOnScreen(C100177j.m130919l(C100177j.this));
                        Log.m105918d("SnsAd.SlideFullCardDetailItem", "onGetCoordOffset, contentLoc=" + C100177j.m130918k(C100177j.this)[0] + ", " + C100177j.m130918k(C100177j.this)[1] + ", animLoc=" + C100177j.m130919l(C100177j.this)[0] + ", " + C100177j.m130919l(C100177j.this)[1]);
                        C100177j jVar4 = C100177j.this;
                        SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
                        Point point = jVar4.f293482E;
                        SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
                        point.x = C100177j.m130918k(C100177j.this)[0] - C100177j.m130919l(C100177j.this)[0];
                        C100177j jVar5 = C100177j.this;
                        SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
                        Point point2 = jVar5.f293482E;
                        SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
                        point2.y = C100177j.m130918k(C100177j.this)[1] - C100177j.m130919l(C100177j.this)[1];
                    }
                }
            } catch (Throwable th) {
                Log.m105920e("SnsAd.SlideFullCardDetailItem", "onGetCoordOffset, exp=" + th.toString());
            }
            C100177j jVar6 = C100177j.this;
            SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
            Point point3 = jVar6.f293482E;
            SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
            SnsMethodCalculate.markEndTimeMs("onGetCoordOffset", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem$1");
            return point3;
        }
    }

    /* renamed from: nt2.j$b */
    public class C100179b implements C102064e.C102069c {
        public C100179b() {
        }

        /* renamed from: a */
        public ViewGroup mo132650a() {
            SnsMethodCalculate.markStartTimeMs("onGetAnimContentView", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem$ClickActionHandler");
            AdSlideRecyclerView adSlideRecyclerView = C100177j.this.f293493s;
            SnsMethodCalculate.markEndTimeMs("onGetAnimContentView", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem$ClickActionHandler");
            return adSlideRecyclerView;
        }

        /* renamed from: b */
        public void mo132651b() {
            SnsMethodCalculate.markStartTimeMs("onPrepareOpenCanvasAnim", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem$ClickActionHandler");
            C100177j jVar = C100177j.this;
            TimelineClickListener timelineClickListener = jVar.f293418n;
            if (timelineClickListener != null) {
                timelineClickListener.mo133538A(jVar);
            }
            SnsMethodCalculate.markEndTimeMs("onPrepareOpenCanvasAnim", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem$ClickActionHandler");
        }
    }

    public C100177j(TimeLineObject timeLineObject, SnsInfo snsInfo, TimelineClickListener timelineClickListener, C98963o oVar) {
        this.f293411d = timeLineObject;
        this.f293412e = snsInfo;
        this.f293418n = timelineClickListener;
        this.f293495u = oVar;
        this.f293498x = new C99583c(2);
    }

    /* renamed from: h */
    public static /* synthetic */ int[] m130915h(C100177j jVar) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
        int[] iArr = jVar.f293484G;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
        return iArr;
    }

    /* renamed from: i */
    public static /* synthetic */ Rect m130916i(C100177j jVar) {
        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
        Rect rect = jVar.f293481D;
        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
        return rect;
    }

    /* renamed from: j */
    public static /* synthetic */ int[] m130917j(C100177j jVar) {
        SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
        int[] iArr = jVar.f293485H;
        SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
        return iArr;
    }

    /* renamed from: k */
    public static /* synthetic */ int[] m130918k(C100177j jVar) {
        SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
        int[] iArr = jVar.f293486I;
        SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
        return iArr;
    }

    /* renamed from: l */
    public static /* synthetic */ int[] m130919l(C100177j jVar) {
        SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
        int[] iArr = jVar.f293487J;
        SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
        return iArr;
    }

    /* renamed from: a */
    public void mo139451a(View view, View view2) {
        SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
        try {
            mo139470o(view, view2);
        } catch (Throwable unused) {
            Log.m105920e("SnsAd.SlideFullCardDetailItem", "the init view failed");
        }
        SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:4|(2:6|7)|8|9) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0031 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo139452b() {
        /*
            r7 = this;
            java.lang.String r0 = "onPause"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.String r2 = "SnsAd.SlideFullCardDetailItem"
            java.lang.String r3 = "the onPause is called"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r3)
            super.mo139452b()     // Catch:{ all -> 0x003b }
            lq2.h r2 = r7.f293497w     // Catch:{ all -> 0x003b }
            if (r2 == 0) goto L_0x0034
            java.lang.String r3 = "pausePlayByTimeline"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)     // Catch:{ all -> 0x003b }
            r5 = 0
            r2.f291948b = r5     // Catch:{ all -> 0x003b }
            java.lang.String r5 = "SnsAd.SlideFullCardVideoPlayHelper"
            java.lang.String r6 = "the time line is paused, ready to play is false"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r6)     // Catch:{ all -> 0x003b }
            qq2.f r2 = r2.f291949c     // Catch:{ all -> 0x003b }
            if (r2 == 0) goto L_0x0031
            r2.mo140707d()     // Catch:{ all -> 0x0031 }
        L_0x0031:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)     // Catch:{ all -> 0x003b }
        L_0x0034:
            com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager r2 = r7.f293494t     // Catch:{ all -> 0x003b }
            if (r2 == 0) goto L_0x003b
            r2.mo24712u()     // Catch:{ all -> 0x003b }
        L_0x003b:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nt2.C100177j.mo139452b():void");
    }

    /* renamed from: c */
    public void mo136948c(ViewGroup viewGroup, View view, int i) {
        SnsMethodCalculate.markStartTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
        try {
            mo139468m(view, this.f293412e, i);
            C99583c cVar = this.f293498x;
            if (cVar != null) {
                SnsMethodCalculate.markStartTimeMs("updateItemDataClickCount", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
                C99583c.C99584a d = cVar.mo138951d(i);
                if (d != null) {
                    d.f291914e++;
                }
                SnsMethodCalculate.markEndTimeMs("updateItemDataClickCount", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
            }
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
    }

    /* renamed from: d */
    public void mo133425d(String str) {
        SnsMethodCalculate.markStartTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
        try {
            SnsInfo snsInfo = this.f293412e;
            if (snsInfo != null) {
                String W = C102236a0.m134728W(snsInfo);
                if (!TextUtils.isEmpty(W) && W.equals(str)) {
                    C63505q.m74843b(this.f293498x);
                }
            }
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markStartTimeMs("reportTouchDuration", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
        try {
            ADXml adXml = this.f293412e.getAdXml();
            boolean z = (adXml == null || adXml.touchParticleAnimConfig == null || this.f293480C == null) ? false : true;
            int totalTouchDuration = (int) this.f293493s.getTotalTouchDuration();
            int totalTouchCount = this.f293493s.getTotalTouchCount();
            AdSlideRecyclerView adSlideRecyclerView = this.f293493s;
            adSlideRecyclerView.getClass();
            SnsMethodCalculate.markStartTimeMs("resetTouchReportData", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideRecyclerView");
            Log.m105924i("AdSlideRecyclerView", "reset");
            adSlideRecyclerView.f274181z1 = 0;
            adSlideRecyclerView.f274179B1 = 0;
            adSlideRecyclerView.f274178A1 = 0;
            SnsMethodCalculate.markEndTimeMs("resetTouchReportData", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideRecyclerView");
            C63505q.m74843b(new C61378b(this.f293412e, 2, totalTouchDuration, totalTouchCount, z));
        } catch (Throwable th) {
            Log.m105920e("SnsAd.SlideFullCardDetailItem", "reportTouchDuration, exp=" + th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("reportTouchDuration", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
        SnsMethodCalculate.markEndTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
    }

    /* renamed from: f */
    public void mo136947f(View view, int i) {
        SnsMethodCalculate.markStartTimeMs("onItemActionBtnClick", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
        try {
            C99583c cVar = this.f293498x;
            if (cVar != null) {
                SnsMethodCalculate.markStartTimeMs("updateItemDataBtnClickCount", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
                C99583c.C99584a d = cVar.mo138951d(i);
                if (d != null) {
                    d.f291915f++;
                }
                SnsMethodCalculate.markEndTimeMs("updateItemDataBtnClickCount", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
            }
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("onItemActionBtnClick", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
    }

    /* renamed from: g */
    public void mo139454g() {
        SnsMethodCalculate.markStartTimeMs("refreshView", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
        try {
            Log.m105918d("SnsAd.SlideFullCardDetailItem", "the refresh view is called");
            C99585d.m129997a(this.f293490p, this.f293500z, this.f293478A, (ViewGroup) null, this.f293491q, mo139469n());
            C99588h hVar = this.f293497w;
            if (hVar != null) {
                hVar.mo138965f(this.f293494t);
            }
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("refreshView", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
    }

    /* renamed from: m */
    public void mo139468m(View view, SnsInfo snsInfo, int i) {
        SnsMethodCalculate.markStartTimeMs("doClick", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
        if (snsInfo == null || snsInfo.getAdXml() == null || snsInfo.getAdXml().adSliderFullCardInfo == null) {
            SnsMethodCalculate.markEndTimeMs("doClick", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
            return;
        }
        C92449r rVar = snsInfo.getAdXml().adSliderFullCardInfo;
        List<C92448q> list = rVar.f264582a;
        if (list == null || ((ArrayList) list).size() <= 0) {
            SnsMethodCalculate.markEndTimeMs("doClick", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
            return;
        }
        C92448q qVar = (C92448q) ((ArrayList) rVar.f264582a).get(i);
        if (qVar == null || qVar.f264578f == null) {
            SnsMethodCalculate.markEndTimeMs("doClick", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
            return;
        }
        this.f293499y.mo141560i(qVar.f264578f, snsInfo, rVar.mo126436a(i));
        this.f293499y.mo141556e(view);
        SnsMethodCalculate.markEndTimeMs("doClick", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
    }

    /* renamed from: n */
    public final int mo139469n() {
        SnsMethodCalculate.markStartTimeMs("getSource", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
        C98963o oVar = this.f293495u;
        if (oVar != null) {
            int i = oVar.f290131k;
            SnsMethodCalculate.markEndTimeMs("getSource", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
            return i;
        }
        SnsMethodCalculate.markEndTimeMs("getSource", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
        return 1;
    }

    /* renamed from: o */
    public void mo139470o(View view, View view2) {
        SnsInfo snsInfo;
        FrameLayout frameLayout;
        View view3;
        ViewStub viewStub;
        SnsMethodCalculate.markStartTimeMs("initViewInternal", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
        if (view == null || (snsInfo = this.f293412e) == null || snsInfo.getAdXml() == null) {
            Log.m105928w("SnsAd.SlideFullCardDetailItem", "the content view is null??? the init view can't complete!!!!");
            SnsMethodCalculate.markEndTimeMs("initViewInternal", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
            return;
        }
        C92449r rVar = this.f293412e.getAdXml().adSliderFullCardInfo;
        if (rVar == null) {
            Log.m105928w("SnsAd.SlideFullCardDetailItem", "the adSliderFullCardInfo is null");
            SnsMethodCalculate.markEndTimeMs("initViewInternal", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
            return;
        }
        C99583c cVar = this.f293498x;
        if (cVar != null) {
            cVar.mo138952e(this.f293412e, mo139469n(), rVar);
        }
        this.f293490p = view;
        this.f293489o = view.getContext();
        this.f293492r = (RoundedCornerFrameLayout) view.findViewById(C0966R.C0970id.f359242jr1);
        this.f293493s = (AdSlideRecyclerView) view.findViewById(C0966R.C0970id.f359241jr0);
        this.f293500z = (ViewGroup) this.f293416i.findViewById(C0966R.C0970id.jub);
        this.f293478A = (ViewGroup) this.f293416i.findViewById(C0966R.C0970id.a7q);
        this.f293483F = this.f293416i.findViewById(C0966R.C0970id.lvp);
        if (this.f293493s != null) {
            this.f293491q = C99585d.m129999c(this.f293489o, mo139469n());
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof LinearLayout.LayoutParams) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.topMargin += C76577a.m92151b(this.f293489o, 8);
                view.setLayoutParams(layoutParams2);
            }
            this.f293493s.setHasFixedSize(true);
            this.f293494t = new CardLayoutManager(this.f293493s);
            C99588h hVar = new C99588h(this.f293496v, this.f293498x);
            this.f293497w = hVar;
            SnsInfo snsInfo2 = this.f293412e;
            SnsMethodCalculate.markStartTimeMs("setSnsInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
            hVar.f291950d = snsInfo2;
            SnsMethodCalculate.markEndTimeMs("setSnsInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
            this.f293494t.mo24707E(new C20611c(C76577a.m92151b(this.f293489o, 12), C76577a.m92151b(this.f293489o, 8)));
            this.f293494t.mo24708F(this.f293497w);
            CardLayoutManager cardLayoutManager = this.f293494t;
            int n = mo139469n();
            cardLayoutManager.getClass();
            SnsMethodCalculate.markStartTimeMs("setSource", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
            cardLayoutManager.f54233y = n;
            SnsMethodCalculate.markEndTimeMs("setSource", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
            this.f293493s.setLayoutManager(this.f293494t);
            this.f293499y = new C102064e(this.f293489o, mo139469n(), this.f293495u, (C102064e.C102068b) null, new C100179b());
            C99586f fVar = new C99586f(this.f293493s, this.f293412e, new C102064e(this.f293489o, mo139469n(), this.f293495u, (C102064e.C102068b) null, new C100179b()));
            fVar.mo138955F4(this.f293491q);
            fVar.setHasStableIds(true);
            SnsMethodCalculate.markStartTimeMs("setItemClickListener", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
            fVar.f291928h = this;
            SnsMethodCalculate.markEndTimeMs("setItemClickListener", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
            SnsMethodCalculate.markStartTimeMs("setItemActionBtnClickListener", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
            fVar.f291929i = this;
            SnsMethodCalculate.markEndTimeMs("setItemActionBtnClickListener", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
            this.f293493s.setAdapter(fVar);
        }
        SnsMethodCalculate.markStartTimeMs("addOnRemovedListener", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
        C98963o oVar = this.f293495u;
        if (oVar != null) {
            String W = C102236a0.m134728W(this.f293412e);
            if (!TextUtils.isEmpty(W) && !"0".equals(W)) {
                oVar.mo138294a(W, this);
            }
        }
        SnsMethodCalculate.markEndTimeMs("addOnRemovedListener", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
        try {
            ADXml adXml = this.f293412e.getAdXml();
            C98185c cVar2 = null;
            if (adXml == null || adXml.touchParticleAnimConfig == null) {
                this.f293493s.setTouchEventProxy((C98184b) null);
            } else {
                if (!(this.f293480C != null || (view3 = this.f293417j) == null || (viewStub = (ViewStub) view3.findViewById(C0966R.C0970id.n5u)) == null)) {
                    this.f293480C = (FrameLayout) viewStub.inflate();
                }
                if (this.f293479B == null && (frameLayout = this.f293480C) != null) {
                    this.f293479B = new C98189d(this.f293489o, frameLayout, this.f293488K, 2);
                }
                cVar2 = adXml.touchParticleAnimConfig;
                this.f293493s.setTouchEventProxy(this.f293479B);
            }
            C98189d dVar = this.f293479B;
            if (dVar != null) {
                dVar.mo137489b(cVar2);
            }
        } catch (Throwable th) {
            Log.m105920e("SnsAd.SlideFullCardDetailItem", "touch anim exp=" + th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("initViewInternal", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
    }
}
