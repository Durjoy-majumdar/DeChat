package pu2;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.C96085n8;
import com.tencent.p014mm.plugin.sns.p106ui.C96275w6;
import com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineBaseAdapter;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C7335d;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import l31.C61212e;
import ls3.C61397g;
import n31.C61612b;
import p565ir.C60606n;
import pl1.C11978e0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C26236u;
import t91.C64208c;
import te3.C101789j00;
import te3.C64273c21;
import te3.C64623p81;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: pu2.b */
public final class C62510b extends C62508a {

    /* renamed from: a1 */
    public static final /* synthetic */ int f177565a1 = 0;

    /* renamed from: T0 */
    public View f177566T0;

    /* renamed from: U0 */
    public final C13601g f177567U0 = C36568h.m40985a(new C62519i(this));

    /* renamed from: V0 */
    public final C13601g f177568V0 = C36568h.m40985a(new C62511a(this));

    /* renamed from: W0 */
    public final C13601g f177569W0 = C36568h.m40985a(new C62516f(this));

    /* renamed from: X0 */
    public final C13601g f177570X0 = C36568h.m40985a(new C62517g(this));

    /* renamed from: Y0 */
    public final C13601g f177571Y0 = C36568h.m40985a(new C62514d(this));

    /* renamed from: Z0 */
    public final C13601g f177572Z0 = C36568h.m40985a(new C62515e(this));

    /* renamed from: pu2.b$a */
    public static final class C62511a extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C62510b f177573d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62511a(C62510b bVar) {
            super(0);
            this.f177573d = bVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem$bansTv$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem$bansTv$2");
            View I = C62510b.m73474I(this.f177573d);
            TextView textView = I != null ? (TextView) I.findViewById(C0966R.C0970id.f358052mq2) : null;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem$bansTv$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem$bansTv$2");
            return textView;
        }
    }

    /* renamed from: pu2.b$b */
    public static final class C62512b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C62510b f177574d;

        public C62512b(C62510b bVar) {
            this.f177574d = bVar;
        }

        public final void onClick(View view) {
            C96085n8 n8Var;
            View.OnClickListener onClickListener;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/item/improve/ImproveFinderLiveTimelineItem$buildCustomView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem$buildCustomView$1");
            Log.m105924i("MicroMsg.Improve.ImproveFinderLiveTimelineItem", C100960u0.f295631a.mo140476a(this.f177574d.getStruct()) + " perform click");
            view.setTag(this.f177574d.getStruct().f281367a.getTimeLine());
            SnsTimeLineBaseAdapter adapter = this.f177574d.getAdapter();
            if (!(adapter == null || (n8Var = adapter.f278576j) == null || (onClickListener = n8Var.f280588f) == null)) {
                onClickListener.onClick(view);
            }
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem$buildCustomView$1");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/item/improve/ImproveFinderLiveTimelineItem$buildCustomView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: pu2.b$c */
    public static final class C62513c implements C61612b {

        /* renamed from: a */
        public final /* synthetic */ C64623p81 f177575a;

        /* renamed from: b */
        public final /* synthetic */ C62510b f177576b;

        /* renamed from: c */
        public final /* synthetic */ View f177577c;

        /* renamed from: d */
        public final /* synthetic */ long f177578d;

        public C62513c(C64623p81 p812, C62510b bVar, View view, long j) {
            this.f177575a = p812;
            this.f177576b = bVar;
            this.f177577c = view;
            this.f177578d = j;
        }

        /* renamed from: a */
        public final void mo77120a(long j, String str, Map<String, Object> map) {
            C101789j00 j002;
            C64623p81 p812;
            Map<String, Object> map2 = map;
            SnsMethodCalculate.markStartTimeMs("onEventOccur", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem$buildCustomView$2$1$1");
            int i = this.f177575a.f184791t == 1 ? 1 : 2;
            C64208c.C64209a aVar = C64208c.f181951a;
            C87412m.m108593f(str, "eventId");
            C87412m.m108593f(map2, "params");
            if (!(aVar.mo89028c(j, str, map, i) || (j002 = this.f177576b.getStruct().f281367a.getTimeLine().ContentObj) == null || (p812 = j002.f298435s) == null)) {
                C62510b bVar = this.f177576b;
                if (!bVar.mo87539O(p812.f184779e, this.f177577c, this.f177578d)) {
                    C64273c21 c212 = p812.f184761E;
                    SnsMethodCalculate.markStartTimeMs("access$isLiveReplay", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem");
                    boolean P = bVar.mo87540P(p812, c212);
                    SnsMethodCalculate.markEndTimeMs("access$isLiveReplay", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem");
                    if (!P) {
                        ((C61212e) C86312j.m106911c(C61212e.class)).mo86157Z5(j, str, aVar.mo89034i(map2, i), C26236u.m33719b(26236), false);
                    }
                }
            }
            SnsMethodCalculate.markEndTimeMs("onEventOccur", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem$buildCustomView$2$1$1");
        }
    }

    /* renamed from: pu2.b$d */
    public static final class C62514d extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C62510b f177579d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62514d(C62510b bVar) {
            super(0);
            this.f177579d = bVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem$finderEndedUI$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem$finderEndedUI$2");
            View I = C62510b.m73474I(this.f177579d);
            View findViewById = I != null ? I.findViewById(C0966R.C0970id.nej) : null;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem$finderEndedUI$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem$finderEndedUI$2");
            return findViewById;
        }
    }

    /* renamed from: pu2.b$e */
    public static final class C62515e extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C62510b f177580d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62515e(C62510b bVar) {
            super(0);
            this.f177580d = bVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem$finderLiveEndedUITip$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem$finderLiveEndedUITip$2");
            View H = C62510b.m73473H(this.f177580d);
            TextView textView = H != null ? (TextView) H.findViewById(C0966R.C0970id.nek) : null;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem$finderLiveEndedUITip$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem$finderLiveEndedUITip$2");
            return textView;
        }
    }

    /* renamed from: pu2.b$f */
    public static final class C62516f extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C62510b f177581d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62516f(C62510b bVar) {
            super(0);
            this.f177581d = bVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem$finderLivingUI$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem$finderLivingUI$2");
            View I = C62510b.m73474I(this.f177581d);
            View findViewById = I != null ? I.findViewById(C0966R.C0970id.nf5) : null;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem$finderLivingUI$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem$finderLivingUI$2");
            return findViewById;
        }
    }

    /* renamed from: pu2.b$g */
    public static final class C62517g extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C62510b f177582d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62517g(C62510b bVar) {
            super(0);
            this.f177582d = bVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem$finderLivingUITip$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem$finderLivingUITip$2");
            View J = C62510b.m73475J(this.f177582d);
            TextView textView = J != null ? (TextView) J.findViewById(C0966R.C0970id.nf6) : null;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem$finderLivingUITip$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem$finderLivingUITip$2");
            return textView;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem", mo125469f = "ImproveFinderLiveTimelineItem.kt", mo125470l = {136, 139}, mo125471m = "loadCustomItemInfo")
    /* renamed from: pu2.b$h */
    public static final class C62518h extends C66704d {

        /* renamed from: d */
        public Object f177583d;

        /* renamed from: e */
        public Object f177584e;

        /* renamed from: f */
        public /* synthetic */ Object f177585f;

        /* renamed from: g */
        public final /* synthetic */ C62510b f177586g;

        /* renamed from: h */
        public int f177587h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62518h(C62510b bVar, C15601d<? super C62518h> dVar) {
            super(dVar);
            this.f177586g = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem$loadCustomItemInfo$1");
            this.f177585f = obj;
            this.f177587h |= Integer.MIN_VALUE;
            Object B = this.f177586g.mo87537B(this);
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem$loadCustomItemInfo$1");
            return B;
        }
    }

    /* renamed from: pu2.b$i */
    public static final class C62519i extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ C62510b f177588d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62519i(C62510b bVar) {
            super(0);
            this.f177588d = bVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem$thumbImg$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem$thumbImg$2");
            View I = C62510b.m73474I(this.f177588d);
            ImageView imageView = I != null ? (ImageView) I.findViewById(C0966R.C0970id.jtg) : null;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem$thumbImg$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem$thumbImg$2");
            return imageView;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62510b(Context context, C96275w6 w6Var, SnsTimeLineBaseAdapter snsTimeLineBaseAdapter) {
        super(context, w6Var, snsTimeLineBaseAdapter);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(w6Var, "struct");
        C87412m.m108594g(snsTimeLineBaseAdapter, "adapter");
    }

    /* renamed from: H */
    public static final /* synthetic */ View m73473H(C62510b bVar) {
        SnsMethodCalculate.markStartTimeMs("access$getFinderEndedUI", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem");
        View finderEndedUI = bVar.getFinderEndedUI();
        SnsMethodCalculate.markEndTimeMs("access$getFinderEndedUI", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem");
        return finderEndedUI;
    }

    /* renamed from: I */
    public static final /* synthetic */ View m73474I(C62510b bVar) {
        SnsMethodCalculate.markStartTimeMs("access$getFinderLiveView$p", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem");
        View view = bVar.f177566T0;
        SnsMethodCalculate.markEndTimeMs("access$getFinderLiveView$p", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem");
        return view;
    }

    /* renamed from: J */
    public static final /* synthetic */ View m73475J(C62510b bVar) {
        SnsMethodCalculate.markStartTimeMs("access$getFinderLivingUI", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem");
        View finderLivingUI = bVar.getFinderLivingUI();
        SnsMethodCalculate.markEndTimeMs("access$getFinderLivingUI", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem");
        return finderLivingUI;
    }

    /* renamed from: K */
    public static final void m73476K(C62510b bVar, C62552v0 v0Var, int i) {
        String str;
        C62510b bVar2 = bVar;
        int i2 = i;
        SnsMethodCalculate.markStartTimeMs("access$showEndTag", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem");
        bVar.getClass();
        SnsMethodCalculate.markStartTimeMs("showEndTag", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem");
        bVar2.mo140441m("MicroMsg.Improve.ImproveFinderLiveTimelineItem", "showEndTag flag:" + i2);
        View finderLivingUI = bVar.getFinderLivingUI();
        if (finderLivingUI == null) {
            str = "access$showEndTag";
        } else {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view = finderLivingUI;
            str = "access$showEndTag";
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/item/improve/ImproveFinderLiveTimelineItem", "showEndTag", "(Lcom/tencent/mm/plugin/sns/ui/item/improve/UrlAndToken;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            finderLivingUI.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ui/item/improve/ImproveFinderLiveTimelineItem", "showEndTag", "(Lcom/tencent/mm/plugin/sns/ui/item/improve/UrlAndToken;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        View finderEndedUI = bVar.getFinderEndedUI();
        if (finderEndedUI != null) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view2 = finderEndedUI;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/item/improve/ImproveFinderLiveTimelineItem", "showEndTag", "(Lcom/tencent/mm/plugin/sns/ui/item/improve/UrlAndToken;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            finderEndedUI.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/item/improve/ImproveFinderLiveTimelineItem", "showEndTag", "(Lcom/tencent/mm/plugin/sns/ui/item/improve/UrlAndToken;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (!bVar2.mo87538N(bVar.getThumbImg(), v0Var.mo87555a(), 3)) {
            bVar2.mo140441m("MicroMsg.Improve.ImproveFinderLiveTimelineItem", "loadBgBlurImageRadius25");
            C7335d c = C86312j.m106911c(C60200t1.class);
            C87412m.m108593f(c, "getService(IFinderCommon…atureService::class.java)");
            C60200t1.C60201a.m70368f((C60200t1) c, v0Var.mo87556b(), bVar.getThumbImg(), v0Var.mo87555a(), (C11978e0.C11979a) null, 8, (Object) null);
            bVar2.mo87541Q(bVar.getThumbImg(), v0Var.mo87555a(), 3);
        }
        TextView bansTv = bVar.getBansTv();
        if (bansTv != null) {
            bansTv.setVisibility(8);
        }
        ((C60606n) C86312j.m106911c(C60606n.class)).Ej0(bVar.getFinderLiveEndedUITip(), true, i2);
        SnsMethodCalculate.markEndTimeMs("showEndTag", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem");
        SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x00e8, code lost:
        r2 = r1.f182386Y;
     */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m73477L(pu2.C62510b r29, te3.C64273c21 r30, pu2.C62552v0 r31, int r32) {
        /*
            r0 = r29
            r1 = r30
            r2 = r32
            java.lang.String r3 = "access$showLiveTag"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            r29.getClass()
            java.lang.Class<ht1.t1> r5 = ht1.C60200t1.class
            java.lang.String r6 = "showLiveTag"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r4)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "showLiveTag flag:"
            r7.append(r8)
            r7.append(r2)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "MicroMsg.Improve.ImproveFinderLiveTimelineItem"
            r0.mo140441m(r8, r7)
            android.view.View r7 = r29.getFinderLivingUI()
            r15 = 0
            if (r7 != 0) goto L_0x003c
            r19 = r3
            r20 = r4
            r4 = 0
            goto L_0x008a
        L_0x003c:
            k20.a r14 = new k20.a
            r14.<init>()
            java.lang.ThreadLocal<k20.a> r9 = k20.C60958c.f173611a
            java.lang.Integer r9 = java.lang.Integer.valueOf(r15)
            r14.mo10233c(r9)
            java.lang.Object[] r10 = r14.mo10232b()
            java.lang.String r11 = "com/tencent/mm/plugin/sns/ui/item/improve/ImproveFinderLiveTimelineItem"
            java.lang.String r12 = "showLiveTag"
            java.lang.String r13 = "(Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/plugin/sns/ui/item/improve/UrlAndToken;I)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r9 = r7
            r19 = r3
            r3 = r14
            r14 = r16
            r20 = r4
            r4 = 0
            r15 = r17
            r16 = r18
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r3 = r3.mo10231a(r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r7.setVisibility(r3)
            java.lang.String r10 = "com/tencent/mm/plugin/sns/ui/item/improve/ImproveFinderLiveTimelineItem"
            java.lang.String r11 = "showLiveTag"
            java.lang.String r12 = "(Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/plugin/sns/ui/item/improve/UrlAndToken;I)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
        L_0x008a:
            android.view.View r3 = r29.getFinderEndedUI()
            r7 = 8
            if (r3 != 0) goto L_0x0093
            goto L_0x00d6
        L_0x0093:
            k20.a r9 = new k20.a
            r9.<init>()
            java.lang.ThreadLocal<k20.a> r10 = k20.C60958c.f173611a
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            r9.mo10233c(r10)
            java.lang.Object[] r22 = r9.mo10232b()
            java.lang.String r23 = "com/tencent/mm/plugin/sns/ui/item/improve/ImproveFinderLiveTimelineItem"
            java.lang.String r24 = "showLiveTag"
            java.lang.String r25 = "(Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/plugin/sns/ui/item/improve/UrlAndToken;I)V"
            java.lang.String r26 = "android/view/View_EXEC_"
            java.lang.String r27 = "setVisibility"
            java.lang.String r28 = "(I)V"
            r21 = r3
            j20.C117292a.m165358d(r21, r22, r23, r24, r25, r26, r27, r28)
            java.lang.Object r9 = r9.mo10231a(r4)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r3.setVisibility(r9)
            java.lang.String r22 = "com/tencent/mm/plugin/sns/ui/item/improve/ImproveFinderLiveTimelineItem"
            java.lang.String r23 = "showLiveTag"
            java.lang.String r24 = "(Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/plugin/sns/ui/item/improve/UrlAndToken;I)V"
            java.lang.String r25 = "android/view/View_EXEC_"
            java.lang.String r26 = "setVisibility"
            java.lang.String r27 = "(I)V"
            j20.C117292a.m165359e(r21, r22, r23, r24, r25, r26, r27)
        L_0x00d6:
            java.lang.Class<ir.n> r3 = p565ir.C60606n.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            ir.n r3 = (p565ir.C60606n) r3
            android.widget.TextView r9 = r29.getFinderLivingUITip()
            r3.Ej0(r9, r4, r2)
            r15 = 1
            if (r1 == 0) goto L_0x00f2
            te3.ix0 r2 = r1.f182386Y
            if (r2 == 0) goto L_0x00f2
            int r2 = r2.f183745d
            if (r2 != r15) goto L_0x00f2
            r2 = 1
            goto L_0x00f3
        L_0x00f2:
            r2 = 0
        L_0x00f3:
            java.lang.String r3 = "getService(IFinderCommon…atureService::class.java)"
            if (r2 != 0) goto L_0x013e
            android.widget.ImageView r1 = r29.getThumbImg()
            java.lang.String r2 = r31.mo87555a()
            boolean r1 = r0.mo87538N(r1, r2, r4)
            if (r1 != 0) goto L_0x0133
            java.lang.String r1 = "loadImage not ban"
            r0.mo140441m(r8, r1)
            di3.d r1 = di3.C86312j.m106911c(r5)
            gy3.C87412m.m108593f(r1, r3)
            r8 = r1
            ht1.t1 r8 = (ht1.C60200t1) r8
            java.lang.String r9 = r31.mo87556b()
            android.widget.ImageView r10 = r29.getThumbImg()
            java.lang.String r11 = r31.mo87555a()
            r12 = 0
            r13 = 8
            r14 = 0
            ht1.C60200t1.C60201a.m70369g(r8, r9, r10, r11, r12, r13, r14)
            android.widget.ImageView r1 = r29.getThumbImg()
            java.lang.String r2 = r31.mo87555a()
            r0.mo87541Q(r1, r2, r4)
        L_0x0133:
            android.widget.TextView r0 = r29.getBansTv()
            if (r0 != 0) goto L_0x013a
            goto L_0x019b
        L_0x013a:
            r0.setVisibility(r7)
            goto L_0x019b
        L_0x013e:
            android.widget.ImageView r2 = r29.getThumbImg()
            java.lang.String r7 = r31.mo87555a()
            boolean r2 = r0.mo87538N(r2, r7, r15)
            if (r2 != 0) goto L_0x017a
            java.lang.String r2 = "loadImage ban"
            r0.mo140441m(r8, r2)
            di3.d r2 = di3.C86312j.m106911c(r5)
            gy3.C87412m.m108593f(r2, r3)
            r7 = r2
            ht1.t1 r7 = (ht1.C60200t1) r7
            java.lang.String r8 = r31.mo87556b()
            android.widget.ImageView r9 = r29.getThumbImg()
            java.lang.String r10 = r31.mo87555a()
            r11 = 0
            r12 = 8
            r13 = 0
            ht1.C60200t1.C60201a.m70366d(r7, r8, r9, r10, r11, r12, r13)
            android.widget.ImageView r2 = r29.getThumbImg()
            java.lang.String r3 = r31.mo87555a()
            r0.mo87541Q(r2, r3, r15)
        L_0x017a:
            android.widget.TextView r2 = r29.getBansTv()
            if (r2 != 0) goto L_0x0181
            goto L_0x0191
        L_0x0181:
            if (r1 == 0) goto L_0x018c
            te3.ix0 r1 = r1.f182386Y
            if (r1 == 0) goto L_0x018c
            java.lang.String r1 = r1.f183746e
            if (r1 == 0) goto L_0x018c
            goto L_0x018e
        L_0x018c:
            java.lang.String r1 = ""
        L_0x018e:
            r2.setText(r1)
        L_0x0191:
            android.widget.TextView r0 = r29.getBansTv()
            if (r0 != 0) goto L_0x0198
            goto L_0x019b
        L_0x0198:
            r0.setVisibility(r4)
        L_0x019b:
            r0 = r20
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r0)
            r1 = r19
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pu2.C62510b.m73477L(pu2.b, te3.c21, pu2.v0, int):void");
    }

    private final TextView getBansTv() {
        SnsMethodCalculate.markStartTimeMs("getBansTv", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem");
        TextView textView = (TextView) ((C36570n) this.f177568V0).getValue();
        SnsMethodCalculate.markEndTimeMs("getBansTv", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem");
        return textView;
    }

    private final View getFinderEndedUI() {
        SnsMethodCalculate.markStartTimeMs("getFinderEndedUI", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem");
        View view = (View) ((C36570n) this.f177571Y0).getValue();
        SnsMethodCalculate.markEndTimeMs("getFinderEndedUI", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem");
        return view;
    }

    private final TextView getFinderLiveEndedUITip() {
        SnsMethodCalculate.markStartTimeMs("getFinderLiveEndedUITip", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem");
        TextView textView = (TextView) ((C36570n) this.f177572Z0).getValue();
        SnsMethodCalculate.markEndTimeMs("getFinderLiveEndedUITip", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem");
        return textView;
    }

    private final View getFinderLivingUI() {
        SnsMethodCalculate.markStartTimeMs("getFinderLivingUI", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem");
        View view = (View) ((C36570n) this.f177569W0).getValue();
        SnsMethodCalculate.markEndTimeMs("getFinderLivingUI", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem");
        return view;
    }

    private final TextView getFinderLivingUITip() {
        SnsMethodCalculate.markStartTimeMs("getFinderLivingUITip", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem");
        TextView textView = (TextView) ((C36570n) this.f177570X0).getValue();
        SnsMethodCalculate.markEndTimeMs("getFinderLivingUITip", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem");
        return textView;
    }

    private final ImageView getThumbImg() {
        SnsMethodCalculate.markStartTimeMs("getThumbImg", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem");
        ImageView imageView = (ImageView) ((C36570n) this.f177567U0).getValue();
        SnsMethodCalculate.markEndTimeMs("getThumbImg", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem");
        return imageView;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo87537B(wx3.C15601d<? super java.lang.Boolean> r11) {
        /*
            r10 = this;
            java.lang.String r0 = "loadCustomItemInfo"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            boolean r2 = r11 instanceof pu2.C62510b.C62518h
            if (r2 == 0) goto L_0x001b
            r2 = r11
            pu2.b$h r2 = (pu2.C62510b.C62518h) r2
            int r3 = r2.f177587h
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x001b
            int r3 = r3 - r4
            r2.f177587h = r3
            goto L_0x0020
        L_0x001b:
            pu2.b$h r2 = new pu2.b$h
            r2.<init>(r10, r11)
        L_0x0020:
            java.lang.Object r11 = r2.f177585f
            xx3.a r3 = xx3.C15911a.COROUTINE_SUSPENDED
            int r4 = r2.f177587h
            r5 = 2
            r6 = 1
            r7 = 0
            if (r4 == 0) goto L_0x004b
            if (r4 == r6) goto L_0x003f
            if (r4 != r5) goto L_0x0034
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x00cb
        L_0x0034:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r2)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            throw r11
        L_0x003f:
            java.lang.Object r4 = r2.f177584e
            te3.p81 r4 = (te3.C64623p81) r4
            java.lang.Object r6 = r2.f177583d
            pu2.b r6 = (pu2.C62510b) r6
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x0096
        L_0x004b:
            kotlin.ResultKt.throwOnFailure(r11)
            com.tencent.mm.plugin.sns.ui.w6 r11 = r10.getStruct()
            com.tencent.mm.plugin.sns.storage.SnsInfo r11 = r11.f281367a
            com.tencent.mm.protocal.protobuf.TimeLineObject r11 = r11.getTimeLine()
            te3.j00 r11 = r11.ContentObj
            if (r11 == 0) goto L_0x0060
            te3.p81 r11 = r11.f298435s
            r4 = r11
            goto L_0x0061
        L_0x0060:
            r4 = r7
        L_0x0061:
            if (r4 != 0) goto L_0x0069
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r11
        L_0x0069:
            r2.f177583d = r10
            r2.f177584e = r4
            r2.f177587h = r6
            java.lang.String r11 = "updateLiveTag$default"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r1)
            java.lang.String r6 = "updateLiveTag"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r1)
            a14.h0 r8 = a14.C53872d1.f151117a
            a14.k2 r8 = f14.C58901s.f168555a
            pu2.d r9 = new pu2.d
            r9.<init>(r10, r4, r7, r7)
            java.lang.Object r8 = a14.C53895h.m60469g(r8, r9, r2)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r1)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r1)
            if (r8 != r3) goto L_0x0094
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r3
        L_0x0094:
            r6 = r10
            r11 = r8
        L_0x0096:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L_0x00cb
            com.tencent.mm.plugin.sns.ui.w6 r11 = r6.getStruct()
            com.tencent.mm.plugin.sns.storage.SnsInfo r11 = r11.f281367a
            r2.f177583d = r7
            r2.f177584e = r7
            r2.f177587h = r5
            java.lang.String r5 = "checkLiveStatus"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r1)
            a14.h0 r8 = a14.C53872d1.f151117a
            pu2.c r9 = new pu2.c
            r9.<init>(r4, r6, r11, r7)
            java.lang.Object r11 = a14.C53895h.m60469g(r8, r9, r2)
            if (r11 != r3) goto L_0x00c0
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r1)
            goto L_0x00c5
        L_0x00c0:
            rx3.b0 r11 = rx3.C13598b0.f38549a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r1)
        L_0x00c5:
            if (r11 != r3) goto L_0x00cb
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r3
        L_0x00cb:
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: pu2.C62510b.mo87537B(wx3.d):java.lang.Object");
    }

    /* renamed from: G */
    public View mo87535G(int i) {
        SnsMethodCalculate.markStartTimeMs("getPositionView", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem");
        View view = this.f177566T0;
        SnsMethodCalculate.markEndTimeMs("getPositionView", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem");
        return view;
    }

    /* renamed from: N */
    public final boolean mo87538N(ImageView imageView, String str, int i) {
        SnsMethodCalculate.markStartTimeMs("checkIsImageLoaded", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem");
        if (imageView == null) {
            mo140440l("MicroMsg.Improve.ImproveFinderLiveTimelineItem", "notice!thumb view is null!");
            SnsMethodCalculate.markEndTimeMs("checkIsImageLoaded", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem");
            return false;
        }
        Object tag = imageView.getTag(C0966R.C0970id.n4_);
        mo140441m("MicroMsg.Improve.ImproveFinderLiveTimelineItem", "checkIsImageLoaded[" + C87412m.m108589b(tag, str + i) + "] last:" + tag + " current:$" + str + i);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i);
        boolean b = C87412m.m108589b(tag, sb.toString());
        SnsMethodCalculate.markEndTimeMs("checkIsImageLoaded", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem");
        return b;
    }

    /* renamed from: O */
    public final boolean mo87539O(String str, View view, long j) {
        SnsMethodCalculate.markStartTimeMs("isLiveReplay", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem");
        if (view == null) {
            SnsMethodCalculate.markEndTimeMs("isLiveReplay", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem");
            return false;
        }
        boolean Nj0 = ((C61397g) C86312j.m106911c(C61397g.class)).Nj0(str, view.findViewById(C0966R.C0970id.dnt), view.findViewById(C0966R.C0970id.dke), j);
        SnsMethodCalculate.markEndTimeMs("isLiveReplay", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem");
        return Nj0;
    }

    /* renamed from: P */
    public final boolean mo87540P(C64623p81 p812, C64273c21 c212) {
        Class cls = C61397g.class;
        SnsMethodCalculate.markStartTimeMs("isLiveReplay", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem");
        boolean ah02 = c212 != null ? ((C61397g) C86312j.m106911c(cls)).ah0(p812.f184779e, c212) : ((C61397g) C86312j.m106911c(cls)).mo83476G0(p812);
        SnsMethodCalculate.markEndTimeMs("isLiveReplay", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem");
        return ah02;
    }

    /* renamed from: Q */
    public final void mo87541Q(ImageView imageView, String str, int i) {
        SnsMethodCalculate.markStartTimeMs("setLoadedImageTagAndClearOther", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem");
        if (imageView != null) {
            imageView.setTag(C0966R.C0970id.n4_, str + i);
        }
        SnsMethodCalculate.markEndTimeMs("setLoadedImageTagAndClearOther", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0048, code lost:
        r4 = z04.C66731x.m78732f(r4);
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a8  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public rx3.C13604l<android.view.View, androidx.constraintlayout.widget.ConstraintLayout.LayoutParams> mo87542f() {
        /*
            r12 = this;
            java.lang.Class<l31.e> r0 = l31.C61212e.class
            java.lang.String r1 = "buildCustomView"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            android.content.Context r3 = r12.getContext()
            android.view.LayoutInflater r3 = com.tencent.p014mm.p136ui.C85868k2.m106137b(r3)
            r4 = 2131497655(0x7f0c12b7, float:1.861891E38)
            r5 = 0
            android.view.View r3 = r3.inflate(r4, r12, r5)
            r12.f177566T0 = r3
            if (r3 == 0) goto L_0x0025
            pu2.b$b r4 = new pu2.b$b
            r4.<init>(r12)
            r3.setOnClickListener(r4)
        L_0x0025:
            com.tencent.mm.plugin.sns.ui.w6 r3 = r12.getStruct()
            com.tencent.mm.plugin.sns.storage.SnsInfo r3 = r3.f281367a
            com.tencent.mm.protocal.protobuf.TimeLineObject r3 = r3.getTimeLine()
            te3.j00 r3 = r3.ContentObj
            if (r3 == 0) goto L_0x00ce
            te3.p81 r7 = r3.f298435s
            if (r7 == 0) goto L_0x00ce
            android.view.View r3 = r12.f177566T0
            if (r3 == 0) goto L_0x00ce
            di3.d r4 = di3.C86312j.m106911c(r0)
            l31.e r4 = (l31.C61212e) r4
            r4.se0(r3)
            java.lang.String r4 = r7.f184778d
            if (r4 == 0) goto L_0x0053
            java.lang.Long r4 = z04.C66731x.m78732f(r4)
            if (r4 == 0) goto L_0x0053
            long r8 = r4.longValue()
            goto L_0x0055
        L_0x0053:
            r8 = 0
        L_0x0055:
            r10 = r8
            te3.c21 r4 = r7.f184761E
            boolean r4 = r12.mo87540P(r7, r4)
            if (r4 != 0) goto L_0x00ce
            java.lang.String r4 = r7.f184779e
            boolean r4 = r12.mo87539O(r4, r3, r10)
            if (r4 != 0) goto L_0x00ce
            java.lang.String r4 = "isNeedToCheckLiveStatus"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r2)
            te3.c21 r6 = r7.f184761E
            r8 = 1
            if (r6 == 0) goto L_0x0094
            java.lang.Class<ir.n> r9 = p565ir.C60606n.class
            di3.d r9 = di3.C86312j.m106911c(r9)
            ir.n r9 = (p565ir.C60606n) r9
            boolean r9 = r9.mo85008I1(r6)
            if (r9 == 0) goto L_0x0082
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r2)
            goto L_0x00a6
        L_0x0082:
            java.lang.Class<ls3.g> r9 = ls3.C61397g.class
            di3.d r9 = di3.C86312j.m106911c(r9)
            ls3.g r9 = (ls3.C61397g) r9
            boolean r6 = r9.mo83480Qg(r6)
            if (r6 == 0) goto L_0x009d
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r2)
            goto L_0x00a6
        L_0x0094:
            int r6 = r7.f184759C
            r9 = 2
            if (r6 != r9) goto L_0x009d
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r2)
            goto L_0x00a6
        L_0x009d:
            int r6 = r7.f184791t
            if (r6 != r8) goto L_0x00a2
            r5 = 1
        L_0x00a2:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r2)
            r8 = r5
        L_0x00a6:
            if (r8 == 0) goto L_0x00b4
            t91.c$a r4 = t91.C64208c.f181951a
            java.lang.String r5 = r7.f184778d
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r6 = 0
            r4.mo89030e(r5, r6)
        L_0x00b4:
            di3.d r0 = di3.C86312j.m106911c(r0)
            l31.e r0 = (l31.C61212e) r0
            java.lang.String r4 = "live_room_card"
            l31.e r0 = r0.o30(r3, r4)
            r4 = 40
            pu2.b$c r5 = new pu2.b$c
            r6 = r5
            r8 = r12
            r9 = r3
            r6.<init>(r7, r8, r9, r10)
            r0.r80(r3, r4, r5)
        L_0x00ce:
            android.content.Context r0 = r12.getContext()
            android.util.Pair r0 = ad0.C91999u.m115564j(r0)
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r3 = new androidx.constraintlayout.widget.ConstraintLayout$LayoutParams
            java.lang.Object r4 = r0.first
            java.lang.String r5 = "pair.first"
            gy3.C87412m.m108593f(r4, r5)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            java.lang.Object r0 = r0.second
            java.lang.String r5 = "pair.second"
            gy3.C87412m.m108593f(r0, r5)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r3.<init>((int) r4, (int) r0)
            rx3.l r0 = new rx3.l
            android.view.View r4 = r12.f177566T0
            gy3.C87412m.m108591d(r4)
            r0.<init>(r4, r3)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: pu2.C62510b.mo87542f():rx3.l");
    }

    public int getViewType() {
        SnsMethodCalculate.markStartTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem");
        SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem");
        return 20;
    }

    /* renamed from: n */
    public String mo87544n() {
        SnsMethodCalculate.markStartTimeMs("name", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem");
        SnsMethodCalculate.markEndTimeMs("name", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderLiveTimelineItem");
        return "ImproveFinderLiveTimelineItem";
    }
}
