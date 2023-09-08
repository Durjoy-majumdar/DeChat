package lq2;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import bv2.C92312b;
import bv2.C92313c;
import co2.C92448q;
import co2.C92449r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.RoundedCornerFrameLayout;
import com.tencent.p014mm.plugin.sns.p104ad.timeline.item.adSlideFullCard.AdSlideRecyclerView;
import com.tencent.p014mm.plugin.sns.p104ad.widget.recyclerview.CardLayoutManager;
import com.tencent.p014mm.plugin.sns.p106ui.AdFrameLayout;
import com.tencent.p014mm.plugin.sns.p106ui.BaseTimeLine;
import com.tencent.p014mm.plugin.sns.p106ui.C96275w6;
import com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineBaseAdapter;
import com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI;
import com.tencent.p014mm.plugin.sns.p106ui.improve.ImproveSnsTimelineUI;
import com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.video.C96254a;
import com.tencent.p014mm.plugin.sns.storage.ADXml;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tav.core.AssetExtension;
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
import lq2.C99583c;
import qq2.C101239f;
import rq2.C63505q;
import up2.C102064e;
import vr2.C102236a0;

/* renamed from: lq2.a */
public class C99578a extends BaseTimeLineItem implements C92312b, C97693b, C97692a, C98957g {

    /* renamed from: A */
    public FrameLayout f291880A;

    /* renamed from: B */
    public Rect f291881B = new Rect();

    /* renamed from: C */
    public Point f291882C = new Point();

    /* renamed from: D */
    public C98183a f291883D = new C99580b();

    /* renamed from: q */
    public C99582d f291884q;

    /* renamed from: r */
    public SnsInfo f291885r;

    /* renamed from: s */
    public CardLayoutManager f291886s;

    /* renamed from: t */
    public C101239f f291887t = new C101239f();

    /* renamed from: u */
    public C99588h f291888u;

    /* renamed from: v */
    public C99583c f291889v;

    /* renamed from: w */
    public C102064e f291890w;

    /* renamed from: x */
    public int f291891x;

    /* renamed from: y */
    public ViewGroup f291892y;

    /* renamed from: z */
    public C98189d f291893z;

    /* renamed from: lq2.a$a */
    public class C99579a implements C102064e.C102069c {

        /* renamed from: a */
        public final /* synthetic */ C99582d f291894a;

        public C99579a(C99582d dVar) {
            this.f291894a = dVar;
        }

        /* renamed from: a */
        public ViewGroup mo132650a() {
            SnsMethodCalculate.markStartTimeMs("onGetAnimContentView", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem$1");
            AdSlideRecyclerView adSlideRecyclerView = this.f291894a.f291901H0;
            SnsMethodCalculate.markEndTimeMs("onGetAnimContentView", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem$1");
            return adSlideRecyclerView;
        }

        /* renamed from: b */
        public void mo132651b() {
            SnsMethodCalculate.markStartTimeMs("onPrepareOpenCanvasAnim", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem$1");
            C99578a aVar = C99578a.this;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
            SnsTimeLineBaseAdapter snsTimeLineBaseAdapter = aVar.f279906g;
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
            snsTimeLineBaseAdapter.f278572f.mo133540C(this.f291894a);
            SnsMethodCalculate.markEndTimeMs("onPrepareOpenCanvasAnim", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem$1");
        }
    }

    /* renamed from: lq2.a$b */
    public class C99580b implements C98183a {
        public C99580b() {
        }

        /* renamed from: a */
        public Rect mo137482a() {
            SnsMethodCalculate.markStartTimeMs("onGetAnimDiplayRect", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem$2");
            try {
                C99578a aVar = C99578a.this;
                SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
                C99582d dVar = aVar.f291884q;
                SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
                int width = dVar.f279983t0.getWidth();
                int[] iArr = new int[2];
                dVar.f279983t0.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                if (dVar.f291902I0 == null) {
                    dVar.f291902I0 = dVar.f279983t0.findViewById(C0966R.C0970id.a7q);
                }
                dVar.f291902I0.getLocationOnScreen(iArr2);
                int height = (iArr2[1] + dVar.f291902I0.getHeight()) - iArr[1];
                C99578a aVar2 = C99578a.this;
                SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
                Rect rect = aVar2.f291881B;
                SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
                rect.set(0, 0, width, height);
                StringBuilder sb = new StringBuilder();
                sb.append("onGetAnimDiplayRect, locRoot=");
                sb.append(iArr[0]);
                sb.append(", ");
                sb.append(iArr[1]);
                sb.append(", locComment=");
                sb.append(iArr2[0]);
                sb.append(", ");
                sb.append(iArr2[1]);
                sb.append(", ret=");
                C99578a aVar3 = C99578a.this;
                SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
                Rect rect2 = aVar3.f291881B;
                SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
                sb.append(rect2);
                Log.m105924i("SnsAd.AdSlideFullCardTimeLineItem", sb.toString());
                C99578a aVar4 = C99578a.this;
                SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
                Rect rect3 = aVar4.f291881B;
                SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
                SnsMethodCalculate.markEndTimeMs("onGetAnimDiplayRect", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem$2");
                return rect3;
            } catch (Throwable th) {
                Log.m105920e("SnsAd.AdSlideFullCardTimeLineItem", "onGetAnimDiplayRect, exp=" + th.toString());
                SnsMethodCalculate.markEndTimeMs("onGetAnimDiplayRect", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem$2");
                return null;
            }
        }

        /* renamed from: b */
        public Point mo137483b() {
            SnsMethodCalculate.markStartTimeMs("onGetCoordOffset", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem$2");
            try {
                C99578a aVar = C99578a.this;
                SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
                C99582d dVar = aVar.f291884q;
                SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
                if (dVar.f291900G0 != null) {
                    C99578a aVar2 = C99578a.this;
                    SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
                    FrameLayout frameLayout = aVar2.f291880A;
                    SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
                    if (frameLayout != null) {
                        int[] iArr = new int[2];
                        C99578a aVar3 = C99578a.this;
                        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
                        C99582d dVar2 = aVar3.f291884q;
                        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
                        dVar2.f291900G0.getLocationOnScreen(iArr);
                        int[] iArr2 = new int[2];
                        C99578a aVar4 = C99578a.this;
                        SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
                        FrameLayout frameLayout2 = aVar4.f291880A;
                        SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
                        frameLayout2.getLocationOnScreen(iArr2);
                        Log.m105924i("SnsAd.AdSlideFullCardTimeLineItem", "onGetCoordOffset, contentLoc=" + iArr[0] + ", " + iArr[1] + ", animLoc=" + iArr2[0] + ", " + iArr2[1]);
                        C99578a aVar5 = C99578a.this;
                        SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
                        Point point = aVar5.f291882C;
                        SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
                        point.x = iArr[0] - iArr2[0];
                        C99578a aVar6 = C99578a.this;
                        SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
                        Point point2 = aVar6.f291882C;
                        SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
                        point2.y = iArr[1] - iArr2[1];
                    }
                }
            } catch (Throwable th) {
                Log.m105920e("SnsAd.AdSlideFullCardTimeLineItem", "onGetCoordOffset, exp=" + th.toString());
            }
            C99578a aVar7 = C99578a.this;
            SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
            Point point3 = aVar7.f291882C;
            SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
            SnsMethodCalculate.markEndTimeMs("onGetCoordOffset", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem$2");
            return point3;
        }
    }

    /* renamed from: lq2.a$c */
    public class C99581c implements C102064e.C102069c {

        /* renamed from: a */
        public final /* synthetic */ SnsTimeLineBaseAdapter f291897a;

        /* renamed from: b */
        public final /* synthetic */ C99582d f291898b;

        public C99581c(C99578a aVar, SnsTimeLineBaseAdapter snsTimeLineBaseAdapter, C99582d dVar) {
            this.f291897a = snsTimeLineBaseAdapter;
            this.f291898b = dVar;
        }

        /* renamed from: a */
        public ViewGroup mo132650a() {
            SnsMethodCalculate.markStartTimeMs("onGetAnimContentView", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem$3");
            AdSlideRecyclerView adSlideRecyclerView = this.f291898b.f291901H0;
            SnsMethodCalculate.markEndTimeMs("onGetAnimContentView", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem$3");
            return adSlideRecyclerView;
        }

        /* renamed from: b */
        public void mo132651b() {
            SnsMethodCalculate.markStartTimeMs("onPrepareOpenCanvasAnim", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem$3");
            this.f291897a.f278572f.mo133540C(this.f291898b);
            SnsMethodCalculate.markEndTimeMs("onPrepareOpenCanvasAnim", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem$3");
        }
    }

    /* renamed from: lq2.a$d */
    public static class C99582d extends BaseTimeLineItem.BaseViewHolder {

        /* renamed from: F0 */
        public ViewGroup f291899F0;

        /* renamed from: G0 */
        public RoundedCornerFrameLayout f291900G0;

        /* renamed from: H0 */
        public AdSlideRecyclerView f291901H0;

        /* renamed from: I0 */
        public View f291902I0;
    }

    /* renamed from: C */
    public void mo138945C(View view, SnsInfo snsInfo, int i) {
        SnsMethodCalculate.markStartTimeMs("doClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
        if (snsInfo == null || snsInfo.getAdXml() == null || snsInfo.getAdXml().adSliderFullCardInfo == null) {
            SnsMethodCalculate.markEndTimeMs("doClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
            return;
        }
        C92449r rVar = snsInfo.getAdXml().adSliderFullCardInfo;
        List<C92448q> list = rVar.f264582a;
        if (list == null || ((ArrayList) list).size() <= 0) {
            SnsMethodCalculate.markEndTimeMs("doClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
            return;
        }
        C92448q qVar = (C92448q) ((ArrayList) rVar.f264582a).get(i);
        if (qVar == null || qVar.f264578f == null) {
            SnsMethodCalculate.markEndTimeMs("doClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
            return;
        }
        this.f291890w.mo141560i(qVar.f264578f, snsInfo, rVar.mo126436a(i));
        this.f291890w.mo141556e(view);
        SnsMethodCalculate.markEndTimeMs("doClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005f  */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo138946D(lq2.C99578a.C99582d r18, com.tencent.p014mm.plugin.sns.storage.SnsInfo r19, co2.C92449r r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            java.lang.String r3 = "fillSlideFullCardContent"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            lq2.h r5 = r0.f291888u
            if (r5 == 0) goto L_0x001e
            java.lang.String r6 = "setSnsInfo"
            java.lang.String r7 = "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r7)
            r5.f291950d = r2
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r7)
        L_0x001e:
            com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideRecyclerView r5 = r1.f291901H0
            if (r5 == 0) goto L_0x00ab
            androidx.recyclerview.widget.RecyclerView$e r6 = r5.getAdapter()
            boolean r7 = r6 instanceof lq2.C99586f
            r8 = 1
            r9 = 0
            java.lang.String r10 = "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter"
            if (r7 == 0) goto L_0x005c
            r7 = r6
            lq2.f r7 = (lq2.C99586f) r7
            r7.getClass()
            java.lang.String r11 = "isSameSnsInfo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r10)
            if (r2 != 0) goto L_0x0040
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r10)
            goto L_0x0055
        L_0x0040:
            com.tencent.mm.plugin.sns.storage.SnsInfo r7 = r7.f291925e     // Catch:{ all -> 0x0052 }
            java.lang.String r7 = vr2.C102236a0.m134728W(r7)     // Catch:{ all -> 0x0052 }
            java.lang.String r12 = vr2.C102236a0.m134728W(r19)     // Catch:{ all -> 0x0052 }
            boolean r7 = java.util.Objects.equals(r7, r12)     // Catch:{ all -> 0x0052 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r10)
            goto L_0x0056
        L_0x0052:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r10)
        L_0x0055:
            r7 = 0
        L_0x0056:
            if (r7 == 0) goto L_0x005c
            r6.notifyDataSetChanged()
            goto L_0x005d
        L_0x005c:
            r9 = 1
        L_0x005d:
            if (r9 == 0) goto L_0x00ab
            java.lang.String r6 = "SnsAd.AdSlideFullCardTimeLineItem"
            java.lang.String r7 = "the adapter sns info is not same"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r7)
            com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter r6 = r0.f279906g
            lq2.f r7 = new lq2.f
            com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideRecyclerView r9 = r1.f291901H0
            up2.e r15 = new up2.e
            android.app.Activity r12 = r0.f279904e
            r13 = 0
            jp2.o r14 = r0.mo138948F(r6)
            r16 = 0
            lq2.a$c r11 = new lq2.a$c
            r11.<init>(r0, r6, r1)
            r1 = r11
            r11 = r15
            r6 = r15
            r15 = r16
            r16 = r1
            r11.<init>(r12, r13, r14, r15, r16)
            r7.<init>(r9, r2, r6)
            int r1 = r0.f291891x
            r7.mo138955F4(r1)
            r7.setHasStableIds(r8)
            java.lang.String r1 = "setItemClickListener"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r10)
            r7.f291928h = r0
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r10)
            java.lang.String r1 = "setItemActionBtnClickListener"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r10)
            r7.f291929i = r0
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r10)
            r5.setAdapter(r7)
        L_0x00ab:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lq2.C99578a.mo138946D(lq2.a$d, com.tencent.mm.plugin.sns.storage.SnsInfo, co2.r):void");
    }

    /* renamed from: E */
    public final void mo138947E(C99582d dVar) {
        SnsMethodCalculate.markStartTimeMs("fillViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
        if (dVar == null) {
            SnsMethodCalculate.markEndTimeMs("fillViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
            return;
        }
        ViewGroup viewGroup = this.f291884q.f291899F0;
        if (viewGroup == null) {
            Log.m105920e("SnsAd.AdSlideFullCardTimeLineItem", "fillViewHolder::the root null, is it right????");
            SnsMethodCalculate.markEndTimeMs("fillViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
            return;
        }
        dVar.f291900G0 = (RoundedCornerFrameLayout) viewGroup.findViewById(C0966R.C0970id.f359242jr1);
        AdSlideRecyclerView adSlideRecyclerView = (AdSlideRecyclerView) viewGroup.findViewById(C0966R.C0970id.f359241jr0);
        dVar.f291901H0 = adSlideRecyclerView;
        View view = dVar.f279959h0;
        if (view instanceof ViewGroup) {
            this.f291892y = (ViewGroup) view;
        }
        if (adSlideRecyclerView != null) {
            this.f291891x = C99585d.m129999c(this.f279904e, 0);
            dVar.f291901H0.setHasFixedSize(true);
            CardLayoutManager cardLayoutManager = new CardLayoutManager(dVar.f291901H0);
            this.f291886s = cardLayoutManager;
            this.f291888u = new C99588h(this.f291887t, this.f291889v);
            cardLayoutManager.mo24707E(new C20611c(C76577a.m92151b(this.f279904e, 12), C76577a.m92151b(this.f279904e, 8)));
            this.f291886s.mo24708F(this.f291888u);
            dVar.f291901H0.setLayoutManager(this.f291886s);
            this.f291890w = new C102064e(this.f279904e, 0, mo138948F(this.f279906g), (C102064e.C102068b) null, new C99579a(dVar));
        }
        SnsMethodCalculate.markEndTimeMs("fillViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
    }

    /* renamed from: F */
    public C98963o mo138948F(SnsTimeLineBaseAdapter snsTimeLineBaseAdapter) {
        C98963o oVar;
        BaseTimeLine baseTimeLine;
        SnsMethodCalculate.markStartTimeMs("getSnsAdStatistic", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
        if (snsTimeLineBaseAdapter == null || (baseTimeLine = snsTimeLineBaseAdapter.f278568b) == null || (oVar = baseTimeLine.f276699f) == null) {
            Activity activity = this.f279904e;
            oVar = activity instanceof SnsTimeLineUI ? ((SnsTimeLineUI) activity).mo132956s8() : null;
        }
        SnsMethodCalculate.markEndTimeMs("getSnsAdStatistic", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
        return oVar;
    }

    /* renamed from: G */
    public void mo138949G(CardLayoutManager cardLayoutManager) {
        SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
        C99588h hVar = this.f291888u;
        if (hVar != null) {
            SnsMethodCalculate.markStartTimeMs("pausePlayByTimeline", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
            hVar.f291948b = false;
            Log.m105918d("SnsAd.SlideFullCardVideoPlayHelper", "the time line is paused, ready to play is false");
            C101239f fVar = hVar.f291949c;
            if (fVar != null) {
                try {
                    fVar.mo140707d();
                } catch (Throwable unused) {
                }
            }
            SnsMethodCalculate.markEndTimeMs("pausePlayByTimeline", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
        }
        if (cardLayoutManager != null) {
            cardLayoutManager.mo24712u();
        }
        SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
    }

    /* renamed from: b */
    public void mo126294b() {
        SnsMethodCalculate.markStartTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
        try {
            Log.m105918d("SnsAd.AdSlideFullCardTimeLineItem", "the item video onUIPause!!! item hash " + hashCode());
            mo138949G(this.f291886s);
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
    }

    /* renamed from: c */
    public void mo136948c(ViewGroup viewGroup, View view, int i) {
        SnsMethodCalculate.markStartTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
        try {
            mo138945C(view, this.f291885r, i);
            C99583c cVar = this.f291889v;
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
        SnsMethodCalculate.markEndTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
    }

    /* renamed from: d */
    public void mo133425d(String str) {
        SnsMethodCalculate.markStartTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
        try {
            C99583c cVar = this.f291889v;
            if (cVar != null) {
                SnsMethodCalculate.markStartTimeMs("resetCurrentIndex", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
                cVar.f291909g = -1;
                SnsMethodCalculate.markEndTimeMs("resetCurrentIndex", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
            }
            if (this.f279904e instanceof ImproveSnsTimelineUI) {
                mo138949G(this.f291886s);
            }
            SnsInfo snsInfo = this.f291885r;
            if (snsInfo != null) {
                String W = C102236a0.m134728W(snsInfo);
                if (!TextUtils.isEmpty(W) && W.equals(str)) {
                    C63505q.m74843b(this.f291889v);
                }
            }
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markStartTimeMs("reportTouchDuration", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
        try {
            ADXml adXml = this.f291885r.getAdXml();
            boolean z = (adXml == null || adXml.touchParticleAnimConfig == null || this.f291880A == null) ? false : true;
            AdSlideRecyclerView adSlideRecyclerView = this.f291884q.f291901H0;
            int totalTouchDuration = (int) adSlideRecyclerView.getTotalTouchDuration();
            int totalTouchCount = adSlideRecyclerView.getTotalTouchCount();
            SnsMethodCalculate.markStartTimeMs("resetTouchReportData", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideRecyclerView");
            Log.m105924i("AdSlideRecyclerView", "reset");
            adSlideRecyclerView.f274181z1 = 0;
            adSlideRecyclerView.f274179B1 = 0;
            adSlideRecyclerView.f274178A1 = 0;
            SnsMethodCalculate.markEndTimeMs("resetTouchReportData", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideRecyclerView");
            C63505q.m74843b(new C61378b(this.f291885r, 1, totalTouchDuration, totalTouchCount, z));
        } catch (Throwable th) {
            Log.m105920e("SnsAd.AdSlideFullCardTimeLineItem", "reportTouchDuration, exp=" + th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("reportTouchDuration", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
        SnsMethodCalculate.markEndTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
    }

    /* renamed from: e */
    public void mo126295e(BaseTimeLineItem.BaseViewHolder baseViewHolder, int i) {
        SnsMethodCalculate.markStartTimeMs(AssetExtension.SCENE_PLAY, "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
        try {
            Log.m105918d("SnsAd.AdSlideFullCardTimeLineItem", "the item video play!!! item hash " + hashCode());
            C96254a.m123394d().mo133938k();
            C92313c.m116089a().mo126302e(this);
            C99588h hVar = this.f291888u;
            if (hVar != null) {
                hVar.mo138965f(this.f291886s);
            }
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs(AssetExtension.SCENE_PLAY, "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
    }

    /* renamed from: f */
    public void mo136947f(View view, int i) {
        SnsMethodCalculate.markStartTimeMs("onItemActionBtnClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
        try {
            C99583c cVar = this.f291889v;
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
        SnsMethodCalculate.markEndTimeMs("onItemActionBtnClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
    }

    public Rect getDisplayRect() {
        RoundedCornerFrameLayout roundedCornerFrameLayout;
        SnsMethodCalculate.markStartTimeMs("getDisplayRect", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
        try {
            C99582d dVar = this.f291884q;
            if (!(dVar == null || (roundedCornerFrameLayout = dVar.f291900G0) == null)) {
                int[] iArr = new int[2];
                roundedCornerFrameLayout.getLocationOnScreen(iArr);
                int i = iArr[0];
                int i2 = iArr[1];
                Rect rect = new Rect(i, i2, dVar.f291900G0.getWidth() + i, dVar.f291900G0.getHeight() + i2);
                SnsMethodCalculate.markEndTimeMs("getDisplayRect", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
                return rect;
            }
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("getDisplayRect", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
        return null;
    }

    /* renamed from: h */
    public void mo81014h(ViewStub viewStub, BaseTimeLineItem.BaseViewHolder baseViewHolder) {
        SnsMethodCalculate.markStartTimeMs("buildContent", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
        Log.m105918d("SnsAd.AdSlideFullCardTimeLineItem", "AdSlideFullCardTimeLineItem build content is called");
        if (!(baseViewHolder instanceof C99582d)) {
            Log.m105920e("SnsAd.AdSlideFullCardTimeLineItem", "buildContent::the holder is not type of AdSlideFullCardItemViewHolder!!!");
            SnsMethodCalculate.markEndTimeMs("buildContent", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
            return;
        }
        this.f291884q = (C99582d) baseViewHolder;
        try {
            if (BaseTimeLineItem.m122773q(baseViewHolder) != null) {
                BaseTimeLineItem.m122773q(baseViewHolder).setLayoutResource(C0966R.C0971layout.c1t);
                if (!baseViewHolder.f279976q) {
                    this.f291884q.f291899F0 = (ViewGroup) BaseTimeLineItem.m122773q(baseViewHolder).inflate();
                    baseViewHolder.f279976q = true;
                }
            } else if (!baseViewHolder.f279976q) {
                this.f291884q.f291899F0 = (ViewGroup) baseViewHolder.f279960i.findViewById(C0966R.C0970id.f5532hl);
                baseViewHolder.f279976q = true;
            }
            this.f291889v = new C99583c(1);
            mo138947E(this.f291884q);
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("buildContent", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
    }

    /* renamed from: o */
    public void mo81015o(BaseTimeLineItem.BaseViewHolder baseViewHolder, int i, C96275w6 w6Var, TimeLineObject timeLineObject, int i2, SnsTimeLineBaseAdapter snsTimeLineBaseAdapter) {
        FrameLayout frameLayout;
        BaseTimeLineItem.BaseViewHolder baseViewHolder2 = baseViewHolder;
        C96275w6 w6Var2 = w6Var;
        TimeLineObject timeLineObject2 = timeLineObject;
        SnsMethodCalculate.markStartTimeMs("fillItem", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
        if (!(baseViewHolder2 instanceof C99582d)) {
            Log.m105920e("SnsAd.AdSlideFullCardTimeLineItem", "fillItem::the holder is not type of AdSlideFullCardItemViewHolder!!!");
            SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
        } else if (w6Var2 == null) {
            Log.m105920e("SnsAd.AdSlideFullCardTimeLineItem", "fillItem::the struct is null!!!");
            SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
        } else if (baseViewHolder2.f279985u0) {
            Log.m105924i("SnsAd.AdSlideFullCardTimeLineItem", "holder is busy");
            SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
        } else {
            baseViewHolder2.f279985u0 = true;
            SnsInfo snsInfo = w6Var2.f281367a;
            if (snsInfo == null || snsInfo.getAdXml() == null) {
                SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
                return;
            }
            this.f291885r = snsInfo;
            C99582d dVar = (C99582d) baseViewHolder2;
            try {
                C92449r rVar = snsInfo.getAdXml().adSliderFullCardInfo;
                C99585d.m129997a(dVar.f291899F0, baseViewHolder2.f279961i0, baseViewHolder2.f279963j0, this.f291892y, this.f291891x, 0);
                mo138946D(dVar, snsInfo, rVar);
                C99583c cVar = this.f291889v;
                if (cVar != null) {
                    cVar.mo138952e(snsInfo, 0, rVar);
                }
                SnsMethodCalculate.markStartTimeMs("addOnRemovedListener", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
                C98963o F = mo138948F(snsTimeLineBaseAdapter);
                if (F != null) {
                    String W = C102236a0.m134728W(snsInfo);
                    if (!TextUtils.isEmpty(W) && !"0".equals(W)) {
                        F.mo138294a(W, this);
                    }
                }
                SnsMethodCalculate.markEndTimeMs("addOnRemovedListener", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
            } catch (Throwable unused) {
            }
            baseViewHolder2.f279985u0 = false;
            StringBuilder sb = new StringBuilder();
            sb.append("ad fillItem, slidefullCardAd, pos=");
            sb.append(i);
            sb.append(", snsId=");
            sb.append(timeLineObject2 == null ? "" : timeLineObject2.f283893Id);
            sb.append(", hash=");
            sb.append(hashCode());
            Log.m105924i("SnsAd.AdSlideFullCardTimeLineItem", sb.toString());
            mo133391g(w6Var2, 3);
            ADXml adXml = snsInfo.getAdXml();
            C98185c cVar2 = null;
            if (adXml == null || adXml.touchParticleAnimConfig == null) {
                dVar.f291901H0.setTouchEventProxy((C98184b) null);
            } else {
                if (this.f291880A == null) {
                    try {
                        AdFrameLayout adFrameLayout = (AdFrameLayout) dVar.f279983t0.findViewById(C0966R.C0970id.jtt);
                        if (adFrameLayout != null) {
                            this.f291880A = adFrameLayout.getAdFullFrameAnimContainer();
                        } else {
                            Log.m105920e("SnsAd.AdSlideFullCardTimeLineItem", "adFrameLayout==null");
                        }
                    } catch (Throwable th) {
                        Log.m105920e("SnsAd.AdSlideFullCardTimeLineItem", "touch anim exp=" + th.toString());
                    }
                }
                if (this.f291893z == null && (frameLayout = this.f291880A) != null) {
                    this.f291893z = new C98189d(this.f279904e, frameLayout, this.f291883D, 1);
                }
                cVar2 = adXml.touchParticleAnimConfig;
                dVar.f291901H0.setTouchEventProxy(this.f291893z);
            }
            try {
                C98189d dVar2 = this.f291893z;
                if (dVar2 != null) {
                    dVar2.mo137489b(cVar2);
                }
            } catch (Throwable th4) {
                Log.m105920e("SnsAd.AdSlideFullCardTimeLineItem", "setTouchAnimConfig, exp=" + th4.toString());
            }
            SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
        }
    }

    public void pause() {
        SnsMethodCalculate.markStartTimeMs("pause", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
        try {
            Log.m105918d("SnsAd.AdSlideFullCardTimeLineItem", "the item video pause!!! item hash " + hashCode());
            mo138949G(this.f291886s);
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("pause", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
    }

    public void stop() {
        SnsMethodCalculate.markStartTimeMs("stop", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
        try {
            Log.m105918d("SnsAd.AdSlideFullCardTimeLineItem", "the item video stop!!! item hash " + hashCode());
            C101239f fVar = this.f291887t;
            if (fVar != null) {
                fVar.mo140712i();
            }
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("stop", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
    }

    /* renamed from: t */
    public String mo81016t() {
        SnsMethodCalculate.markStartTimeMs("name", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
        SnsMethodCalculate.markEndTimeMs("name", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
        return "AdSlideFullCardTimeLineItem";
    }
}
