package com.tencent.p014mm.plugin.finder.viewmodel.component;

import android.graphics.Point;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import bl3.C113200q;
import bl3.C39818r;
import cm1.C0740i2;
import cm1.C0790x;
import cm1.C55018j0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import er1.C58784w3;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C8757a2;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jq3.C60905o;
import rs1.C13180d2;
import rs1.C13181d3;
import rs1.C13268i1;
import rs1.C13282j2;
import rs1.C13308kb;
import rs1.C13312l1;
import rs1.C13470u2;
import rs1.C13502w6;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36570n;
import te3.C51252sj0;
import up1.C37521f;
import zc1.C66785b;

@C113200q(initialMode = 2)
/* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC */
public final class FinderDescPanelUIC extends UIComponent implements C8757a2 {

    /* renamed from: J */
    public static final Map<Long, Integer> f18610J = new LinkedHashMap();

    /* renamed from: A */
    public final boolean f18611A;

    /* renamed from: B */
    public final boolean f18612B;

    /* renamed from: C */
    public final boolean f18613C;

    /* renamed from: D */
    public final boolean f18614D;

    /* renamed from: E */
    public final boolean f18615E;

    /* renamed from: F */
    public final boolean f18616F;

    /* renamed from: G */
    public final boolean f18617G;

    /* renamed from: H */
    public final boolean f18618H;

    /* renamed from: I */
    public final C13601g f18619I;

    /* renamed from: d */
    public final Map<Long, Integer> f18620d = new LinkedHashMap();

    /* renamed from: e */
    public final List<Integer> f18621e;

    /* renamed from: f */
    public boolean f18622f;

    /* renamed from: g */
    public boolean f18623g;

    /* renamed from: h */
    public boolean f18624h;

    /* renamed from: i */
    public boolean f18625i;

    /* renamed from: j */
    public long f18626j;

    /* renamed from: n */
    public long f18627n;

    /* renamed from: o */
    public final MMHandler f18628o;

    /* renamed from: p */
    public WeakReference<C60905o> f18629p;

    /* renamed from: q */
    public final FinderDescPanelUIC$videoFinishListener$1 f18630q;

    /* renamed from: r */
    public final C13601g f18631r;

    /* renamed from: s */
    public final C13601g f18632s;

    /* renamed from: t */
    public final C13601g f18633t;

    /* renamed from: u */
    public final C13601g f18634u;

    /* renamed from: v */
    public long f18635v;

    /* renamed from: w */
    public boolean f18636w;

    /* renamed from: x */
    public int f18637x;

    /* renamed from: y */
    public final List<Integer> f18638y;

    /* renamed from: z */
    public final Map<Integer, C13308kb> f18639z;

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC$a */
    public static final class C4259a extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C4259a f18640d = new C4259a();

        public C4259a() {
            super(0);
        }

        public Object invoke() {
            C51252sj0 sj02 = C66785b.f191882e.mo90673n0().mo62397b().f140481y;
            int i = sj02 != null ? sj02.f141554o : 0;
            if (i <= 0) {
                i = 30;
            }
            return Integer.valueOf(i);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC$b */
    public static final class C4260b extends C87413o implements C32224a<C13180d2> {

        /* renamed from: d */
        public final /* synthetic */ FinderDescPanelUIC f18641d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4260b(FinderDescPanelUIC finderDescPanelUIC) {
            super(0);
            this.f18641d = finderDescPanelUIC;
        }

        public Object invoke() {
            return (C13180d2) C39818r.f106831a.mo62443b(this.f18641d.getContext()).mo62449e(C13180d2.class);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC$c */
    public static final class C4261c extends C87413o implements C32224a<C13282j2> {

        /* renamed from: d */
        public final /* synthetic */ FinderDescPanelUIC f18642d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4261c(FinderDescPanelUIC finderDescPanelUIC) {
            super(0);
            this.f18642d = finderDescPanelUIC;
        }

        public Object invoke() {
            return (C13282j2) C39818r.f106831a.mo62443b(this.f18642d.getContext()).mo62449e(C13282j2.class);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC$d */
    public static final class C4262d extends C87413o implements C32224a<C13470u2> {

        /* renamed from: d */
        public final /* synthetic */ FinderDescPanelUIC f18643d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4262d(FinderDescPanelUIC finderDescPanelUIC) {
            super(0);
            this.f18643d = finderDescPanelUIC;
        }

        public Object invoke() {
            return (C13470u2) C39818r.f106831a.mo62443b(this.f18643d.getContext()).mo62449e(C13470u2.class);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC$e */
    public static final class C4263e implements MMHandler.Callback {

        /* renamed from: d */
        public final /* synthetic */ FinderDescPanelUIC f18644d;

        public C4263e(FinderDescPanelUIC finderDescPanelUIC) {
            this.f18644d = finderDescPanelUIC;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: rs1.kb} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x00e4  */
        /* JADX WARNING: Removed duplicated region for block: B:78:0x025a  */
        /* JADX WARNING: Removed duplicated region for block: B:81:0x025f A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:82:0x0260  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean handleMessage(android.os.Message r23) {
            /*
                r22 = this;
                r0 = r22
                r1 = r23
                java.lang.String r2 = "msg"
                gy3.C87412m.m108594g(r1, r2)
                com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC r2 = r0.f18644d
                boolean r2 = r2.f18622f
                r3 = 1
                if (r2 != 0) goto L_0x0011
                return r3
            L_0x0011:
                int r2 = r1.what
                if (r2 != r3) goto L_0x042f
                java.lang.String r2 = "Finder.DescPanelUIC"
                java.lang.String r4 = "show next"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
                com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC r4 = r0.f18644d
                r5 = -1
                r4.f18627n = r5
                java.lang.Object r1 = r1.obj
                boolean r5 = r1 instanceof jq3.C60905o
                if (r5 == 0) goto L_0x002c
                jq3.o r1 = (jq3.C60905o) r1
                goto L_0x002d
            L_0x002c:
                r1 = 0
            L_0x002d:
                if (r1 != 0) goto L_0x0030
                return r3
            L_0x0030:
                java.lang.Object r5 = r1.f173503E
                boolean r7 = r5 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
                if (r7 == 0) goto L_0x0039
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r5 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r5
                goto L_0x003a
            L_0x0039:
                r5 = 0
            L_0x003a:
                if (r5 != 0) goto L_0x003d
                return r3
            L_0x003d:
                bl3.r r7 = bl3.C39818r.f106831a
                android.app.Activity r4 = r4.getContext()
                bl3.r$a r4 = r7.mo62443b(r4)
                java.lang.Class<rs1.h1> r8 = rs1.C13256h1.class
                bl3.t r4 = r4.mo62449e(r8)
                rs1.h1 r4 = (rs1.C13256h1) r4
                r8 = 2
                r9 = 3
                r10 = 0
                if (r4 == 0) goto L_0x025c
                java.lang.Class<rs1.v9> r11 = rs1.C13490v9.class
                f40.o r12 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r12 = r12.mo121142i()
                com.tencent.mm.storage.y1$a r13 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_CLICK_DESC_TIPS_CNT_INT_SYNC
                int r12 = r12.mo119689j(r13, r10)
                if (r12 < r3) goto L_0x0069
            L_0x0066:
                r4 = 0
                goto L_0x0258
            L_0x0069:
                androidx.appcompat.app.AppCompatActivity r14 = r4.getActivity()
                bl3.r$a r14 = r7.mo62444c(r14)
                androidx.lifecycle.i0 r14 = r14.mo75002a(r11)
                rs1.v9 r14 = (rs1.C13490v9) r14
                boolean r14 = r14.mo12899d3()
                if (r14 != 0) goto L_0x0066
                androidx.appcompat.app.AppCompatActivity r14 = r4.getActivity()
                bl3.r$a r14 = r7.mo62444c(r14)
                androidx.lifecycle.i0 r11 = r14.mo75002a(r11)
                rs1.v9 r11 = (rs1.C13490v9) r11
                com.tencent.mm.plugin.finder.view.m5<com.tencent.mm.plugin.finder.model.BaseFinderFeed> r11 = r11.f38220d
                if (r11 == 0) goto L_0x0097
                boolean r11 = r11.isShowing()
                if (r11 != r3) goto L_0x0097
                r11 = 1
                goto L_0x0098
            L_0x0097:
                r11 = 0
            L_0x0098:
                if (r11 == 0) goto L_0x009b
                goto L_0x0066
            L_0x009b:
                f40.o r11 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r11 = r11.mo121142i()
                com.tencent.mm.storage.y1$a r14 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_FULL_LIKE_FEED_GUIDE_INT
                int r11 = r11.mo119689j(r14, r10)
                if (r11 >= r9) goto L_0x00ac
                goto L_0x0066
            L_0x00ac:
                int r11 = r5.mo3480N()
                if (r11 == r3) goto L_0x0243
                androidx.appcompat.app.AppCompatActivity r11 = r4.getActivity()
                bl3.r$a r11 = r7.mo62444c(r11)
                java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.FinderLikeGuideUIC> r14 = com.tencent.p014mm.plugin.finder.viewmodel.component.FinderLikeGuideUIC.class
                androidx.lifecycle.i0 r11 = r11.mo75002a(r14)
                com.tencent.mm.plugin.finder.viewmodel.component.FinderLikeGuideUIC r11 = (com.tencent.p014mm.plugin.finder.viewmodel.component.FinderLikeGuideUIC) r11
                android.widget.LinearLayout r14 = r11.f18758d
                if (r14 == 0) goto L_0x00ce
                int r14 = r14.getVisibility()
                if (r14 != 0) goto L_0x00ce
                r14 = 1
                goto L_0x00cf
            L_0x00ce:
                r14 = 0
            L_0x00cf:
                if (r14 == 0) goto L_0x00df
                android.widget.LinearLayout r11 = r11.f18758d
                if (r11 == 0) goto L_0x00da
                android.view.ViewParent r11 = r11.getParent()
                goto L_0x00db
            L_0x00da:
                r11 = 0
            L_0x00db:
                if (r11 == 0) goto L_0x00df
                r11 = 1
                goto L_0x00e0
            L_0x00df:
                r11 = 0
            L_0x00e0:
                if (r11 == 0) goto L_0x00e4
                goto L_0x0243
            L_0x00e4:
                r11 = 2131315111(0x7f0949a7, float:1.8248666E38)
                android.view.View r11 = r1.mo85812D(r11)
                com.tencent.neattextview.textview.view.NeatTextView r11 = (com.tencent.neattextview.textview.view.NeatTextView) r11
                if (r11 != 0) goto L_0x00f1
                goto L_0x0066
            L_0x00f1:
                java.lang.String r14 = r4.f37627d
                java.lang.Object[] r15 = new java.lang.Object[r3]
                boolean r16 = r5.mo3473G()
                java.lang.Boolean r16 = java.lang.Boolean.valueOf(r16)
                r15[r10] = r16
                java.lang.String r6 = "isEllipsize %b"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r6, r15)
                int r6 = r11.getLineCount()
                if (r6 < r8) goto L_0x0066
                int r6 = r11.getLineCount()
                if (r6 != r8) goto L_0x0118
                boolean r6 = r5.mo3473G()
                if (r6 != 0) goto L_0x0118
                goto L_0x0066
            L_0x0118:
                r6 = 2131300418(0x7f091042, float:1.8218865E38)
                android.view.View r6 = r1.mo85812D(r6)
                if (r6 != 0) goto L_0x012a
                java.lang.String r4 = r4.f37627d
                java.lang.String r6 = "no footer"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r6)
                goto L_0x0066
            L_0x012a:
                java.lang.String r11 = r4.f37627d
                java.lang.String r14 = "show"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r14)
                f40.o r11 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r11 = r11.mo121142i()
                int r12 = r12 + r3
                java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
                r11.mo119677K(r13, r12)
                android.view.View r11 = r1.f44854d
                java.lang.String r12 = "null cannot be cast to non-null type android.view.ViewGroup"
                gy3.C87412m.m108592e(r11, r12)
                android.view.ViewGroup r11 = (android.view.ViewGroup) r11
                r12 = 2131302703(0x7f09192f, float:1.82235E38)
                android.view.View r12 = r11.findViewById(r12)
                if (r12 != 0) goto L_0x01b2
                android.content.Context r12 = r1.f173499A
                android.view.LayoutInflater r12 = com.tencent.p014mm.p136ui.C85868k2.m106137b(r12)
                r13 = 2131494528(0x7f0c0680, float:1.8612567E38)
                android.view.View r12 = r12.inflate(r13, r11, r10)
                r13 = 0
                k20.a r15 = new k20.a
                r15.<init>()
                java.lang.ThreadLocal<k20.a> r14 = k20.C60958c.f173611a
                java.lang.Float r13 = java.lang.Float.valueOf(r13)
                r15.mo10233c(r13)
                java.lang.Object[] r13 = r15.mo10232b()
                java.lang.String r16 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderDescClickGuideUIC"
                java.lang.String r17 = "checkShowClickDescTips"
                java.lang.String r18 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)Z"
                java.lang.String r19 = "android/view/View_EXEC_"
                java.lang.String r20 = "setAlpha"
                java.lang.String r21 = "(F)V"
                r14 = r12
                r9 = r15
                r15 = r13
                j20.C117292a.m165358d(r14, r15, r16, r17, r18, r19, r20, r21)
                java.lang.Object r9 = r9.mo10231a(r10)
                java.lang.Float r9 = (java.lang.Float) r9
                float r9 = r9.floatValue()
                r12.setAlpha(r9)
                java.lang.String r15 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderDescClickGuideUIC"
                java.lang.String r16 = "checkShowClickDescTips"
                java.lang.String r17 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)Z"
                java.lang.String r18 = "android/view/View_EXEC_"
                java.lang.String r19 = "setAlpha"
                java.lang.String r20 = "(F)V"
                j20.C117292a.m165359e(r14, r15, r16, r17, r18, r19, r20)
                r11.addView(r12)
                int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r10)
                int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r10)
                r12.measure(r9, r13)
            L_0x01b2:
                r4.f37628e = r3
                android.graphics.Rect r9 = new android.graphics.Rect
                r9.<init>()
                r6.getGlobalVisibleRect(r9)
                int r6 = r12.getMeasuredHeight()
                if (r6 != 0) goto L_0x01f0
                r6 = 2131299685(0x7f090d65, float:1.8217378E38)
                android.view.View r6 = r12.findViewById(r6)
                android.widget.TextView r6 = (android.widget.TextView) r6
                if (r6 != 0) goto L_0x01d0
            L_0x01cd:
                r4 = 1
                goto L_0x0258
            L_0x01d0:
                android.text.TextPaint r13 = r6.getPaint()
                android.graphics.Paint$FontMetrics r13 = r13.getFontMetrics()
                float r13 = r13.bottom
                android.text.TextPaint r6 = r6.getPaint()
                android.graphics.Paint$FontMetrics r6 = r6.getFontMetrics()
                float r6 = r6.top
                float r13 = r13 - r6
                int r6 = (int) r13
                int r13 = r12.getPaddingBottom()
                int r6 = r6 + r13
                int r13 = r12.getPaddingTop()
                int r6 = r6 + r13
            L_0x01f0:
                android.app.Activity r4 = r4.getContext()
                android.content.res.Resources r4 = r4.getResources()
                r13 = 2131165324(0x7f07008c, float:1.7944862E38)
                float r4 = r4.getDimension(r13)
                int r9 = r9.top
                int r9 = r9 - r6
                int r6 = r11.getTop()
                int r9 = r9 - r6
                float r6 = (float) r9
                android.content.Context r9 = r1.f173499A
                android.content.res.Resources r9 = r9.getResources()
                r11 = 2131165371(0x7f0700bb, float:1.7944957E38)
                float r9 = r9.getDimension(r11)
                float r6 = r6 - r9
                r12.setTranslationX(r4)
                r12.setTranslationY(r6)
                float r4 = r12.getAlpha()
                r6 = 1065353216(0x3f800000, float:1.0)
                int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r4 != 0) goto L_0x0228
                r4 = 1
                goto L_0x0229
            L_0x0228:
                r4 = 0
            L_0x0229:
                if (r4 != 0) goto L_0x01cd
                android.view.ViewPropertyAnimator r4 = r12.animate()
                r11 = 0
                android.view.ViewPropertyAnimator r4 = r4.setStartDelay(r11)
                r11 = 200(0xc8, double:9.9E-322)
                android.view.ViewPropertyAnimator r4 = r4.setDuration(r11)
                android.view.ViewPropertyAnimator r4 = r4.alpha(r6)
                r4.start()
                goto L_0x01cd
            L_0x0243:
                java.lang.String r4 = r4.f37627d
                java.lang.Object[] r6 = new java.lang.Object[r3]
                int r9 = r5.mo3480N()
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                r6[r10] = r9
                java.lang.String r9 = "ignore tip %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r9, r6)
                goto L_0x0066
            L_0x0258:
                if (r4 != r3) goto L_0x025c
                r4 = 1
                goto L_0x025d
            L_0x025c:
                r4 = 0
            L_0x025d:
                if (r4 == 0) goto L_0x0260
                return r3
            L_0x0260:
                com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC r4 = r0.f18644d
                boolean r4 = r4.mo5119f3(r5)
                com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC r6 = r0.f18644d
                android.app.Activity r6 = r6.getContext()
                bl3.r$a r6 = r7.mo62443b(r6)
                java.lang.Class<rs1.w6> r7 = rs1.C13502w6.class
                bl3.t r6 = r6.mo62449e(r7)
                rs1.w6 r6 = (rs1.C13502w6) r6
                if (r6 == 0) goto L_0x027f
                boolean r6 = r6.mo12926o3(r1)
                goto L_0x0280
            L_0x027f:
                r6 = 0
            L_0x0280:
                com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC r7 = r0.f18644d
                boolean r9 = r7.f18623g
                if (r9 != 0) goto L_0x042f
                if (r6 != 0) goto L_0x042f
                if (r4 != 0) goto L_0x042f
                java.util.Map<java.lang.Integer, rs1.kb> r4 = r7.f18639z
                int r6 = r7.f18637x
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                java.util.LinkedHashMap r4 = (java.util.LinkedHashMap) r4
                java.lang.Object r4 = r4.get(r6)
                rs1.kb r4 = (rs1.C13308kb) r4
                com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC r6 = r0.f18644d
                int r7 = r6.f18637x
                java.util.List<java.lang.Integer> r9 = r6.f18638y
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                java.util.ArrayList r9 = (java.util.ArrayList) r9
                int r7 = r9.indexOf(r7)
                java.util.List<java.lang.Integer> r9 = r6.f18638y
                java.util.ArrayList r9 = (java.util.ArrayList) r9
                int r9 = r9.size()
                int r9 = r9 - r3
                r11 = 0
            L_0x02b4:
                java.lang.String r12 = " isNeedShow = "
                if (r11 >= r9) goto L_0x031c
                java.util.List<java.lang.Integer> r13 = r6.f18638y
                int r7 = r7 + r3
                java.util.ArrayList r13 = (java.util.ArrayList) r13
                int r14 = r13.size()
                int r14 = r7 % r14
                java.lang.Object r13 = r13.get(r14)
                java.lang.Number r13 = (java.lang.Number) r13
                int r13 = r13.intValue()
                java.util.Map<java.lang.Integer, rs1.kb> r14 = r6.f18639z
                java.lang.Integer r15 = java.lang.Integer.valueOf(r13)
                java.util.LinkedHashMap r14 = (java.util.LinkedHashMap) r14
                java.lang.Object r14 = r14.get(r15)
                rs1.kb r14 = (rs1.C13308kb) r14
                if (r14 == 0) goto L_0x02e7
                boolean r15 = r6.f18636w
                boolean r15 = r14.mo12620e3(r1, r15)
                if (r15 == 0) goto L_0x02e7
                r15 = 1
                goto L_0x02e8
            L_0x02e7:
                r15 = 0
            L_0x02e8:
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r3 = "findNextItem findKey = "
                r8.append(r3)
                r8.append(r13)
                r8.append(r12)
                r8.append(r15)
                java.lang.String r3 = r8.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
                if (r15 == 0) goto L_0x0317
                rx3.l r3 = r6.mo5120g3(r13, r10)
                B r3 = r3.f38556e
                java.lang.Boolean r3 = (java.lang.Boolean) r3
                boolean r3 = r3.booleanValue()
                boolean r8 = r6.f18636w
                if (r8 != 0) goto L_0x031e
                if (r3 == 0) goto L_0x0317
                goto L_0x031e
            L_0x0317:
                int r11 = r11 + 1
                r3 = 1
                r8 = 2
                goto L_0x02b4
            L_0x031c:
                r13 = -1
                r14 = 0
            L_0x031e:
                if (r14 != 0) goto L_0x0330
                java.util.Map<java.lang.Integer, rs1.kb> r3 = r6.f18639z
                java.lang.Integer r6 = java.lang.Integer.valueOf(r10)
                java.util.LinkedHashMap r3 = (java.util.LinkedHashMap) r3
                java.lang.Object r3 = r3.get(r6)
                r14 = r3
                rs1.kb r14 = (rs1.C13308kb) r14
                r13 = 0
            L_0x0330:
                java.lang.Integer r3 = java.lang.Integer.valueOf(r13)
                gy3.C87412m.m108591d(r14)
                java.lang.Number r3 = (java.lang.Number) r3
                int r3 = r3.intValue()
                com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC r6 = r0.f18644d
                boolean r7 = r6.f18636w
                if (r7 != 0) goto L_0x03fb
                java.util.List<java.lang.Integer> r7 = r6.f18638y
                java.util.ArrayList r7 = (java.util.ArrayList) r7
                java.util.Iterator r7 = r7.iterator()
            L_0x034b:
                boolean r8 = r7.hasNext()
                if (r8 == 0) goto L_0x03fb
                java.lang.Object r8 = r7.next()
                java.lang.Number r8 = (java.lang.Number) r8
                int r8 = r8.intValue()
                if (r8 != 0) goto L_0x035e
                goto L_0x034b
            L_0x035e:
                java.util.Map<java.lang.Integer, rs1.kb> r9 = r6.f18639z
                java.lang.Integer r11 = java.lang.Integer.valueOf(r8)
                java.util.LinkedHashMap r9 = (java.util.LinkedHashMap) r9
                java.lang.Object r9 = r9.get(r11)
                rs1.kb r9 = (rs1.C13308kb) r9
                if (r9 != 0) goto L_0x036f
                goto L_0x034b
            L_0x036f:
                boolean r11 = r6.f18636w
                boolean r9 = r9.mo12620e3(r1, r11)
                rx3.l r11 = r6.mo5120g3(r8, r10)
                A r13 = r11.f38555d
                java.lang.Boolean r13 = (java.lang.Boolean) r13
                boolean r13 = r13.booleanValue()
                B r11 = r11.f38556e
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                boolean r11 = r11.booleanValue()
                java.lang.StringBuilder r15 = new java.lang.StringBuilder
                r15.<init>()
                java.lang.String r10 = "tryReport key = "
                r15.append(r10)
                r15.append(r8)
                java.lang.String r10 = " isHit = "
                r15.append(r10)
                r15.append(r13)
                r15.append(r12)
                r15.append(r9)
                java.lang.String r9 = " isShow = "
                r15.append(r9)
                r15.append(r11)
                java.lang.String r9 = r15.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r9)
                if (r13 == 0) goto L_0x03f8
                r9 = 1
                if (r8 == r9) goto L_0x03c8
                r9 = 2
                if (r8 == r9) goto L_0x03c4
                r10 = 3
                if (r8 == r10) goto L_0x03c1
                r11 = 0
                goto L_0x03cc
            L_0x03c1:
                h81.h$c r11 = h81.C32735h.C32737c.hotcomment_flag_kv
                goto L_0x03cc
            L_0x03c4:
                r10 = 3
                h81.h$c r11 = h81.C32735h.C32737c.ringtone_flag_kv
                goto L_0x03cc
            L_0x03c8:
                r9 = 2
                r10 = 3
                h81.h$c r11 = h81.C32735h.C32737c.buzzword_flag_kv
            L_0x03cc:
                if (r11 == 0) goto L_0x03f8
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                java.lang.String r15 = "hitReport key = "
                r13.append(r15)
                r13.append(r8)
                java.lang.String r8 = " fromUser = "
                r13.append(r8)
                r8 = 0
                r13.append(r8)
                java.lang.String r13 = r13.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r13)
                java.lang.Class<h81.h> r13 = h81.C32735h.class
                di3.d r13 = di3.C86312j.m106911c(r13)
                h81.h r13 = (h81.C32735h) r13
                if (r13 == 0) goto L_0x03f8
                r13.mo58779Qe(r11, r8)
            L_0x03f8:
                r10 = 0
                goto L_0x034b
            L_0x03fb:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = "SHOW_NEXT item.desc = "
                r6.append(r7)
                com.tencent.mm.plugin.finder.storage.FinderItem r5 = r5.mo3513o()
                java.lang.String r5 = r5.getDescription()
                r6.append(r5)
                java.lang.String r5 = " nextKey = "
                r6.append(r5)
                r6.append(r3)
                java.lang.String r3 = r6.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
                boolean r2 = gy3.C87412m.m108589b(r14, r4)
                if (r2 == 0) goto L_0x0427
                r2 = 1
                return r2
            L_0x0427:
                r2 = 1
                com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC r3 = r0.f18644d
                r5 = 0
                r3.mo5124l3(r1, r4, r14, r5)
                goto L_0x0430
            L_0x042f:
                r2 = 1
            L_0x0430:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.viewmodel.component.FinderDescPanelUIC.C4263e.handleMessage(android.os.Message):boolean");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC$f */
    public static final class C4264f extends C87413o implements C32224a<C13181d3> {

        /* renamed from: d */
        public final /* synthetic */ FinderDescPanelUIC f18645d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4264f(FinderDescPanelUIC finderDescPanelUIC) {
            super(0);
            this.f18645d = finderDescPanelUIC;
        }

        public Object invoke() {
            return (C13181d3) C39818r.f106831a.mo62443b(this.f18645d.getContext()).mo62449e(C13181d3.class);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01c0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FinderDescPanelUIC(androidx.appcompat.app.AppCompatActivity r8) {
        /*
            r7 = this;
            java.lang.String r0 = "activity"
            gy3.C87412m.m108594g(r8, r0)
            r7.<init>((androidx.appcompat.app.AppCompatActivity) r8)
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r8.<init>()
            r7.f18620d = r8
            r8 = 3
            java.lang.Integer[] r8 = new java.lang.Integer[r8]
            r0 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r2 = 0
            r8[r2] = r1
            r1 = 2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r8[r0] = r3
            r3 = 8
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r8[r1] = r3
            java.util.List r8 = sx3.C64197v.m75537f(r8)
            r7.f18621e = r8
            r3 = -1
            r7.f18626j = r3
            r7.f18627n = r3
            com.tencent.mm.sdk.platformtools.MMHandler r8 = new com.tencent.mm.sdk.platformtools.MMHandler
            android.os.Looper r5 = android.os.Looper.getMainLooper()
            com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC$e r6 = new com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC$e
            r6.<init>(r7)
            r8.<init>((android.os.Looper) r5, (com.tencent.p014mm.sdk.platformtools.MMHandler.Callback) r6)
            r7.f18628o = r8
            com.tencent.mm.app.f r8 = com.tencent.p014mm.app.C40008f.f107254d
            com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC$videoFinishListener$1 r5 = new com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC$videoFinishListener$1
            r5.<init>(r7, r8)
            r7.f18630q = r5
            com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC$b r8 = new com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC$b
            r8.<init>(r7)
            rx3.g r8 = rx3.C36568h.m40985a(r8)
            r7.f18631r = r8
            com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC$f r8 = new com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC$f
            r8.<init>(r7)
            rx3.g r8 = rx3.C36568h.m40985a(r8)
            r7.f18632s = r8
            com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC$d r8 = new com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC$d
            r8.<init>(r7)
            rx3.g r8 = rx3.C36568h.m40985a(r8)
            r7.f18633t = r8
            com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC$c r8 = new com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC$c
            r8.<init>(r7)
            rx3.g r8 = rx3.C36568h.m40985a(r8)
            r7.f18634u = r8
            r7.f18635v = r3
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r7.f18638y = r8
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r8.<init>()
            r7.f18639z = r8
            up1.f r8 = up1.C37521f.f99374d
            r8.getClass()
            pe1.c<java.lang.Integer> r3 = up1.C37521f.f99408g7
            java.lang.Object r4 = r3.mo60266n()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            if (r4 == r1) goto L_0x00b4
            zc1.b r4 = zc1.C66785b.f191882e
            bd1.e r4 = r4.mo90673n0()
            te3.qq2 r4 = r4.mo62397b()
            te3.sj0 r4 = r4.f140481y
            if (r4 == 0) goto L_0x00ae
            boolean r4 = r4.f141546d
            goto L_0x00af
        L_0x00ae:
            r4 = 0
        L_0x00af:
            if (r4 == 0) goto L_0x00b2
            goto L_0x00b4
        L_0x00b2:
            r4 = 0
            goto L_0x00b5
        L_0x00b4:
            r4 = 1
        L_0x00b5:
            r7.f18611A = r4
            r8.getClass()
            java.lang.Object r4 = r3.mo60266n()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            if (r4 != 0) goto L_0x00dd
            zc1.b r4 = zc1.C66785b.f191882e
            bd1.e r4 = r4.mo90673n0()
            te3.qq2 r4 = r4.mo62397b()
            te3.sj0 r4 = r4.f140481y
            if (r4 == 0) goto L_0x00d7
            boolean r4 = r4.f141547e
            goto L_0x00d8
        L_0x00d7:
            r4 = 0
        L_0x00d8:
            if (r4 == 0) goto L_0x00db
            goto L_0x00dd
        L_0x00db:
            r4 = 0
            goto L_0x00de
        L_0x00dd:
            r4 = 1
        L_0x00de:
            r7.f18612B = r4
            r8.getClass()
            java.lang.Object r4 = r3.mo60266n()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            if (r4 == r1) goto L_0x0106
            zc1.b r4 = zc1.C66785b.f191882e
            bd1.e r4 = r4.mo90673n0()
            te3.qq2 r4 = r4.mo62397b()
            te3.sj0 r4 = r4.f140481y
            if (r4 == 0) goto L_0x0100
            boolean r4 = r4.f141548f
            goto L_0x0101
        L_0x0100:
            r4 = 0
        L_0x0101:
            if (r4 == 0) goto L_0x0104
            goto L_0x0106
        L_0x0104:
            r4 = 0
            goto L_0x0107
        L_0x0106:
            r4 = 1
        L_0x0107:
            r7.f18613C = r4
            r8.getClass()
            java.lang.Object r3 = r3.mo60266n()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            if (r3 != 0) goto L_0x012f
            zc1.b r3 = zc1.C66785b.f191882e
            bd1.e r3 = r3.mo90673n0()
            te3.qq2 r3 = r3.mo62397b()
            te3.sj0 r3 = r3.f140481y
            if (r3 == 0) goto L_0x0129
            boolean r3 = r3.f141549g
            goto L_0x012a
        L_0x0129:
            r3 = 0
        L_0x012a:
            if (r3 == 0) goto L_0x012d
            goto L_0x012f
        L_0x012d:
            r3 = 0
            goto L_0x0130
        L_0x012f:
            r3 = 1
        L_0x0130:
            r7.f18614D = r3
            r8.getClass()
            pe1.c<java.lang.Integer> r3 = up1.C37521f.f99426i7
            java.lang.Object r4 = r3.mo60266n()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            if (r4 == r1) goto L_0x015a
            zc1.b r4 = zc1.C66785b.f191882e
            bd1.e r4 = r4.mo90673n0()
            te3.qq2 r4 = r4.mo62397b()
            te3.sj0 r4 = r4.f140481y
            if (r4 == 0) goto L_0x0154
            boolean r4 = r4.f141550h
            goto L_0x0155
        L_0x0154:
            r4 = 0
        L_0x0155:
            if (r4 == 0) goto L_0x0158
            goto L_0x015a
        L_0x0158:
            r4 = 0
            goto L_0x015b
        L_0x015a:
            r4 = 1
        L_0x015b:
            r7.f18615E = r4
            r8.getClass()
            java.lang.Object r3 = r3.mo60266n()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            if (r3 != 0) goto L_0x0183
            zc1.b r3 = zc1.C66785b.f191882e
            bd1.e r3 = r3.mo90673n0()
            te3.qq2 r3 = r3.mo62397b()
            te3.sj0 r3 = r3.f140481y
            if (r3 == 0) goto L_0x017d
            boolean r3 = r3.f141551i
            goto L_0x017e
        L_0x017d:
            r3 = 0
        L_0x017e:
            if (r3 == 0) goto L_0x0181
            goto L_0x0183
        L_0x0181:
            r3 = 0
            goto L_0x0184
        L_0x0183:
            r3 = 1
        L_0x0184:
            r7.f18616F = r3
            r8.getClass()
            pe1.c<java.lang.Integer> r3 = up1.C37521f.f99417h7
            java.lang.Object r4 = r3.mo60266n()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            if (r4 == r1) goto L_0x01ae
            zc1.b r1 = zc1.C66785b.f191882e
            bd1.e r1 = r1.mo90673n0()
            te3.qq2 r1 = r1.mo62397b()
            te3.sj0 r1 = r1.f140481y
            if (r1 == 0) goto L_0x01a8
            boolean r1 = r1.f141552j
            goto L_0x01a9
        L_0x01a8:
            r1 = 0
        L_0x01a9:
            if (r1 == 0) goto L_0x01ac
            goto L_0x01ae
        L_0x01ac:
            r1 = 0
            goto L_0x01af
        L_0x01ae:
            r1 = 1
        L_0x01af:
            r7.f18617G = r1
            r8.getClass()
            java.lang.Object r8 = r3.mo60266n()
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            if (r8 != 0) goto L_0x01d6
            zc1.b r8 = zc1.C66785b.f191882e
            bd1.e r8 = r8.mo90673n0()
            te3.qq2 r8 = r8.mo62397b()
            te3.sj0 r8 = r8.f140481y
            if (r8 == 0) goto L_0x01d1
            boolean r8 = r8.f141553n
            goto L_0x01d2
        L_0x01d1:
            r8 = 0
        L_0x01d2:
            if (r8 == 0) goto L_0x01d5
            goto L_0x01d6
        L_0x01d5:
            r0 = 0
        L_0x01d6:
            r7.f18618H = r0
            com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC$a r8 = com.tencent.p014mm.plugin.finder.viewmodel.component.FinderDescPanelUIC.C4259a.f18640d
            rx3.g r8 = rx3.C36568h.m40985a(r8)
            r7.f18619I = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.viewmodel.component.FinderDescPanelUIC.<init>(androidx.appcompat.app.AppCompatActivity):void");
    }

    /* renamed from: c3 */
    public final void mo5116c3(C60905o oVar) {
        View D;
        View D2;
        View findViewById;
        View D3;
        View D4;
        View findViewById2;
        C87412m.m108594g(oVar, "holder");
        C0740i2 i2Var = (C0740i2) oVar.f173503E;
        if (i2Var instanceof C55018j0) {
            C37521f.f99374d.getClass();
            ((C37521f.C37542s0) C37521f.f99310V4).getClass();
            Integer num = 0;
            if (num.intValue() == 0 && (D3 = oVar.mo85812D(C0966R.C0970id.ol9)) != null && (D4 = oVar.mo85812D(C0966R.C0970id.e6u)) != null && (findViewById2 = D4.findViewById(C0966R.C0970id.f358957i24)) != null) {
                findViewById2.post(new C13312l1(this, oVar, D3, D4, findViewById2));
            }
        } else if ((i2Var instanceof C0790x) && (D = oVar.mo85812D(C0966R.C0970id.e6u)) != null && (D2 = oVar.mo85812D(C0966R.C0970id.f3j)) != null && (findViewById = D.findViewById(C0966R.C0970id.a2r)) != null) {
            D2.post(new C13268i1(oVar, D2, D, findViewById));
        }
    }

    /* renamed from: d3 */
    public final void mo5117d3() {
        ((ArrayList) this.f18638y).clear();
        ((LinkedHashMap) this.f18639z).clear();
        C13180d2 d2Var = (C13180d2) ((C36570n) this.f18631r).getValue();
        if (d2Var != null) {
            d2Var.f37764d = 0;
            ((ArrayList) this.f18638y).add(0);
            C13308kb put = this.f18639z.put(0, d2Var);
        }
        C13470u2 u2Var = (C13470u2) ((C36570n) this.f18633t).getValue();
        if (u2Var != null) {
            u2Var.f37764d = 2;
            ((ArrayList) this.f18638y).add(2);
            C13308kb put2 = this.f18639z.put(2, u2Var);
        }
        C13181d3 d3Var = (C13181d3) ((C36570n) this.f18632s).getValue();
        if (d3Var != null) {
            d3Var.f37764d = 1;
            ((ArrayList) this.f18638y).add(1);
            C13308kb put3 = this.f18639z.put(1, d3Var);
        }
        C13282j2 j2Var = (C13282j2) ((C36570n) this.f18634u).getValue();
        if (j2Var != null) {
            j2Var.f37764d = 3;
            ((ArrayList) this.f18638y).add(3);
            C13308kb put4 = this.f18639z.put(3, j2Var);
        }
    }

    /* renamed from: e3 */
    public final int mo5118e3(View view) {
        int height = view.getHeight();
        ViewParent parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (height > 0 || view2 == null) {
            return height;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(view2.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(view2.getHeight(), 0));
        return new Point(view.getMeasuredWidth(), view.getMeasuredHeight()).y;
    }

    /* renamed from: f3 */
    public final boolean mo5119f3(BaseFinderFeed baseFinderFeed) {
        C87412m.m108594g(baseFinderFeed, "feed");
        Map<Long, Integer> map = this.f18620d;
        Long valueOf = Long.valueOf(baseFinderFeed.getItemId());
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        int i = linkedHashMap.get(valueOf);
        if (i == null) {
            i = 0;
            linkedHashMap.put(valueOf, 0);
        }
        int intValue = ((Number) i).intValue();
        boolean z = intValue > 0;
        Log.m105924i("Finder.DescPanelUIC", "isShowingBlackListLink bitset = " + intValue + ", whiteList=" + this.f18621e + " result = " + z);
        return z || C58784w3.f168295a.mo83878J0(baseFinderFeed.mo3513o().getFeedObject());
    }

    /* renamed from: g3 */
    public final C13604l<Boolean, Boolean> mo5120g3(int i, boolean z) {
        if (i == 0) {
            Boolean bool = Boolean.TRUE;
            return new C13604l<>(bool, bool);
        } else if (i == 1) {
            return z ? new C13604l<>(Boolean.valueOf(this.f18614D), Boolean.valueOf(this.f18613C)) : new C13604l<>(Boolean.valueOf(this.f18612B), Boolean.valueOf(this.f18611A));
        } else {
            if (i == 2) {
                return new C13604l<>(Boolean.valueOf(this.f18618H), Boolean.valueOf(this.f18617G));
            }
            if (i == 3) {
                return new C13604l<>(Boolean.valueOf(this.f18616F), Boolean.valueOf(this.f18615E));
            }
            if (i != 4) {
                Boolean bool2 = Boolean.FALSE;
                return new C13604l<>(bool2, bool2);
            }
            Boolean bool3 = Boolean.TRUE;
            return new C13604l<>(bool3, bool3);
        }
    }

    /* renamed from: i3 */
    public final void mo5121i3(C60905o oVar) {
        C87412m.m108594g(oVar, "holder");
        this.f18628o.removeMessages(1);
        long uptimeMillis = SystemClock.uptimeMillis();
        long j = this.f18627n;
        if (j > 0) {
            this.f18625i = true;
            this.f18626j = Math.max(0, j - uptimeMillis);
        }
    }

    /* renamed from: j3 */
    public final void mo5122j3(C60905o oVar) {
        C87412m.m108594g(oVar, "holder");
        if (this.f18625i && this.f18626j > 0) {
            this.f18628o.removeMessages(1);
            this.f18625i = false;
            long uptimeMillis = SystemClock.uptimeMillis() + this.f18626j;
            this.f18628o.sendMessageAtTime(this.f18628o.obtainMessage(1, oVar), uptimeMillis);
            this.f18627n = uptimeMillis;
        }
    }

    /* renamed from: k3 */
    public final void mo5123k3(long j, int i) {
        if (this.f18621e.contains(Integer.valueOf(i))) {
            Log.m105924i("Finder.DescPanelUIC", "setLinkShowing linkBit = " + i + " hit white list");
            return;
        }
        Map<Long, Integer> map = this.f18620d;
        Long valueOf = Long.valueOf(j);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        int i2 = linkedHashMap.get(valueOf);
        if (i2 == null) {
            i2 = 0;
            linkedHashMap.put(valueOf, 0);
        }
        int intValue = ((Number) i2).intValue() | i;
        Log.m105924i("Finder.DescPanelUIC", "setLinkShowing linkBit = " + i + " result = " + intValue);
        this.f18620d.put(Long.valueOf(j), Integer.valueOf(intValue));
    }

    /* renamed from: l3 */
    public final void mo5124l3(C60905o oVar, C13308kb kbVar, C13308kb kbVar2, boolean z) {
        Object obj = oVar.f173503E;
        BaseFinderFeed baseFinderFeed = obj instanceof BaseFinderFeed ? (BaseFinderFeed) obj : null;
        if (baseFinderFeed != null && kbVar != null && kbVar2 != null) {
            boolean booleanValue = ((Boolean) mo5120g3(kbVar2.f37764d, z).f38556e).booleanValue();
            if (this.f18636w || booleanValue) {
                View c3 = kbVar.mo12677c3(oVar);
                int e3 = c3 != null ? mo5118e3(c3) : 0;
                View c35 = kbVar2.mo12677c3(oVar);
                int e35 = (c35 != null ? mo5118e3(c35) : 0) - e3;
                kbVar.mo12619d3(oVar, z);
                kbVar2.mo12621i3(oVar, z);
                ViewGroup viewGroup = (ViewGroup) oVar.mo85812D(C0966R.C0970id.d97);
                if (viewGroup != null) {
                    int childCount = viewGroup.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = viewGroup.getChildAt(i);
                        if (childAt.getId() == C0966R.C0970id.lz4 || childAt.getId() == C0966R.C0970id.edb) {
                            break;
                        }
                        float f = (float) e35;
                        childAt.setTranslationY(childAt.getTranslationY() + f);
                        childAt.animate().translationYBy(-f).setDuration(250).start();
                    }
                }
                this.f18637x = kbVar2.f37764d;
                f18610J.put(Long.valueOf(baseFinderFeed.getItemId()), Integer.valueOf(this.f18637x));
            }
        }
    }

    /* renamed from: m3 */
    public final void mo5125m3(C60905o oVar, int i, boolean z) {
        C87412m.m108594g(oVar, "holder");
        C13502w6 w6Var = (C13502w6) C39818r.f106831a.mo62443b(getContext()).mo62449e(C13502w6.class);
        boolean o3 = w6Var != null ? w6Var.mo12926o3(oVar) : false;
        Object obj = oVar.f173503E;
        BaseFinderFeed baseFinderFeed = obj instanceof BaseFinderFeed ? (BaseFinderFeed) obj : null;
        if (baseFinderFeed != null) {
            boolean f3 = mo5119f3(baseFinderFeed);
            if (((ArrayList) this.f18638y).contains(Integer.valueOf(i)) && !o3 && !f3) {
                C13308kb kbVar = (C13308kb) ((LinkedHashMap) this.f18639z).get(Integer.valueOf(i));
                if (kbVar != null) {
                    C13308kb kbVar2 = (C13308kb) ((LinkedHashMap) this.f18639z).get(Integer.valueOf(this.f18637x));
                    if (kbVar2 != null && !C87412m.m108589b(kbVar, kbVar2) && kbVar.mo12620e3(oVar, this.f18636w) && ((Boolean) mo5120g3(i, z).f38556e).booleanValue()) {
                        mo5124l3(oVar, kbVar2, kbVar, z);
                        this.f18637x = i;
                        if (z) {
                            this.f18622f = true;
                        }
                    }
                }
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.m105924i("Finder.DescPanelUIC", "Carousel Config：buzz_carousel = " + this.f18611A + '+' + this.f18612B + ", buzz_fav = " + this.f18613C + '+' + this.f18614D + ", hot_comment = " + this.f18615E + '+' + this.f18616F + ", ringtone = " + this.f18617G + '+' + this.f18618H);
        mo5117d3();
    }

    public void onPause() {
        super.onPause();
        this.f18630q.dead();
    }

    public void onResume() {
        super.onResume();
        this.f18630q.alive();
    }
}
