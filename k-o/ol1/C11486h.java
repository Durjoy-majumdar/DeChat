package ol1;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import ml1.C10929b;
import ml1.C10930c;
import rx3.C13598b0;
import te3.C48648a11;
import te3.C51280sp2;

/* renamed from: ol1.h */
public final class C11486h extends C11475a<C48648a11> {

    /* renamed from: j */
    public final C10930c f33757j;

    /* renamed from: n */
    public ConstraintLayout f33758n;

    /* renamed from: ol1.h$a */
    public final class C11487a {

        /* renamed from: a */
        public C51280sp2 f33759a;

        /* renamed from: b */
        public final C32226l<C51280sp2, C13598b0> f33760b;

        /* renamed from: c */
        public final View f33761c;

        /* renamed from: d */
        public final View f33762d;

        /* renamed from: ol1.h$a$a */
        public static final class C11488a implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C11487a f33763d;

            public C11488a(C11487a aVar) {
                this.f33763d = aVar;
            }

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/finder/live/wish/widget/WishAudiencePanelWidget$GiftItemView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C11487a aVar = this.f33763d;
                aVar.f33760b.invoke(aVar.f33759a);
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/wish/widget/WishAudiencePanelWidget$GiftItemView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x009d, code lost:
            if (r5 == null) goto L_0x00a4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x00a2, code lost:
            if (r5 == null) goto L_0x00a4;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C11487a(ol1.C11486h r17, te3.C51280sp2 r18, fy3.C32226l<? super te3.C51280sp2, rx3.C13598b0> r19) {
            /*
                r16 = this;
                r0 = r16
                r1 = r17
                r2 = r18
                r3 = r19
                java.lang.String r4 = "data"
                gy3.C87412m.m108594g(r2, r4)
                java.lang.String r5 = "sendClick"
                gy3.C87412m.m108594g(r3, r5)
                r16.<init>()
                r0.f33759a = r2
                r0.f33760b = r3
                android.content.Context r2 = r1.f28306d
                android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
                androidx.constraintlayout.widget.ConstraintLayout r3 = r1.f33758n
                if (r3 == 0) goto L_0x01aa
                r6 = 2131494832(0x7f0c07b0, float:1.8613184E38)
                r7 = 0
                android.view.View r2 = r2.inflate(r6, r3, r7)
                r0.f33761c = r2
                r3 = 2131303552(0x7f091c80, float:1.8225222E38)
                android.view.View r3 = r2.findViewById(r3)
                android.widget.ImageView r3 = (android.widget.ImageView) r3
                r6 = 2131303564(0x7f091c8c, float:1.8225246E38)
                android.view.View r6 = r2.findViewById(r6)
                android.widget.TextView r6 = (android.widget.TextView) r6
                r8 = 2131317132(0x7f09518c, float:1.8252765E38)
                android.view.View r8 = r2.findViewById(r8)
                android.widget.TextView r8 = (android.widget.TextView) r8
                r9 = 2131317128(0x7f095188, float:1.8252757E38)
                android.view.View r9 = r2.findViewById(r9)
                android.widget.TextView r9 = (android.widget.TextView) r9
                r10 = 2131317018(0x7f09511a, float:1.8252534E38)
                android.view.View r10 = r2.findViewById(r10)
                android.widget.TextView r10 = (android.widget.TextView) r10
                r11 = 2131313165(0x7f09420d, float:1.824472E38)
                android.view.View r11 = r2.findViewById(r11)
                android.widget.TextView r11 = (android.widget.TextView) r11
                r12 = 2131303649(0x7f091ce1, float:1.8225418E38)
                android.view.View r12 = r2.findViewById(r12)
                r0.f33762d = r12
                te3.sp2 r13 = r0.f33759a
                gy3.C87412m.m108594g(r13, r4)
                r0.f33759a = r13
                int r4 = r13.hashCode()
                r2.setId(r4)
                te3.p11 r4 = r13.f141663d
                if (r4 == 0) goto L_0x0156
                java.lang.String r14 = r4.f139509f
                if (r14 == 0) goto L_0x008c
                int r14 = r14.length()
                if (r14 != 0) goto L_0x008a
                goto L_0x008c
            L_0x008a:
                r14 = 0
                goto L_0x008d
            L_0x008c:
                r14 = 1
            L_0x008d:
                if (r14 == 0) goto L_0x00a0
                cj1.y1 r14 = cj1.C0639y1.f1510a
                java.lang.String r5 = r4.f139507d
                ig1.d r5 = r14.mo612d(r5)
                if (r5 == 0) goto L_0x009c
                java.lang.String r5 = r5.field_thumbnailFileUrl
                goto L_0x009d
            L_0x009c:
                r5 = 0
            L_0x009d:
                if (r5 != 0) goto L_0x00a6
                goto L_0x00a4
            L_0x00a0:
                java.lang.String r5 = r4.f139509f
                if (r5 != 0) goto L_0x00a6
            L_0x00a4:
                java.lang.String r5 = ""
            L_0x00a6:
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                java.lang.String r15 = "updateView giftId: "
                r14.append(r15)
                java.lang.String r15 = r4.f139507d
                r14.append(r15)
                java.lang.String r15 = " giftUrl: "
                r14.append(r15)
                r14.append(r5)
                java.lang.String r14 = r14.toString()
                java.lang.String r15 = "WishAudiencePanelWidget"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r14)
                bl3.r r14 = bl3.C39818r.f106831a
                java.lang.Class<ht1.t1> r15 = ht1.C60200t1.class
                bl3.r$a r14 = r14.mo62446e(r15)
                java.lang.Class<pl1.s0> r15 = pl1.C11990s0.class
                bl3.c r14 = r14.mo62447c(r15)
                pl1.s0 r14 = (pl1.C11990s0) r14
                k60.d r14 = r14.mo11871f2()
                pl1.n0 r15 = new pl1.n0
                up1.y r7 = up1.C27696y.THUMB_IMAGE
                r15.<init>(r5, r7)
                l60.b r5 = r14.mo85955a(r15)
                java.lang.String r7 = "giftView"
                gy3.C87412m.m108593f(r3, r7)
                l60.a r5 = (l60.C99342a) r5
                r5.mo85954d(r3)
                java.lang.String r3 = r4.f139515o
                r6.setText(r3)
                float r3 = r4.f139516p
                int r3 = (int) r3
                java.lang.String r3 = java.lang.String.valueOf(r3)
                r10.setText(r3)
                int r3 = r4.f139519s
                r4 = 8
                boolean r3 = o40.C61926c.m72696u(r3, r4)
                if (r3 == 0) goto L_0x0130
                r3 = 0
                r11.setEnabled(r3)
                android.content.Context r1 = r1.f28306d
                android.content.res.Resources r1 = r1.getResources()
                r3 = 2131100928(0x7f060500, float:1.7814251E38)
                int r1 = r1.getColor(r3)
                r11.setTextColor(r1)
                android.content.Context r1 = r2.getContext()
                android.content.res.Resources r1 = r1.getResources()
                r2 = 2131827585(0x7f111b81, float:1.9288087E38)
                java.lang.String r1 = r1.getString(r2)
                r11.setText(r1)
                goto L_0x0156
            L_0x0130:
                r3 = 1
                r11.setEnabled(r3)
                android.content.Context r1 = r1.f28306d
                android.content.res.Resources r1 = r1.getResources()
                r3 = 2131101836(0x7f06088c, float:1.7816093E38)
                int r1 = r1.getColor(r3)
                r11.setTextColor(r1)
                android.content.Context r1 = r2.getContext()
                android.content.res.Resources r1 = r1.getResources()
                r2 = 2131829083(0x7f11215b, float:1.9291125E38)
                java.lang.String r1 = r1.getString(r2)
                r11.setText(r1)
            L_0x0156:
                ok1.e r1 = ok1.C62042e.f176370a
                java.lang.String r2 = "tagView"
                gy3.C87412m.m108593f(r12, r2)
                te3.p11 r2 = r13.f141663d
                if (r2 == 0) goto L_0x0169
                ig1.d$a r3 = ig1.C8916d.f28211b1
                ig1.d r5 = r3.mo9727a(r2)
                goto L_0x016a
            L_0x0169:
                r5 = 0
            L_0x016a:
                r1.mo87007G1(r12, r5)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r2 = 47
                r1.append(r2)
                long r2 = r13.f141664e
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r8.setText(r1)
                long r1 = r13.f141665f
                r3 = 1000000(0xf4240, double:4.940656E-318)
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 <= 0) goto L_0x018f
                java.lang.String r1 = "100万+"
                goto L_0x0193
            L_0x018f:
                java.lang.String r1 = java.lang.String.valueOf(r1)
            L_0x0193:
                r9.setText(r1)
                ol1.h$a$a r1 = new ol1.h$a$a
                r1.<init>(r0)
                r11.setOnClickListener(r1)
                er1.j4 r1 = er1.C58739j4.f168176a
                java.lang.String r2 = "priceText"
                gy3.C87412m.m108593f(r10, r2)
                r2 = 0
                r1.mo83703c0(r10, r2)
                return
            L_0x01aa:
                java.lang.String r1 = "giftPanelLayout"
                gy3.C87412m.m108603p(r1)
                r1 = 0
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: ol1.C11486h.C11487a.<init>(ol1.h, te3.sp2, fy3.l):void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11486h(Context context, C0125s sVar, C10929b bVar, C10930c cVar) {
        super(context, sVar);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(sVar, "owner");
        C87412m.m108594g(bVar, "serviceLive");
        C87412m.m108594g(cVar, "viewEvent");
        this.f33757j = cVar;
    }

    /* renamed from: g */
    public int mo3425g() {
        return C0966R.C0971layout.b1_;
    }

    /* renamed from: j */
    public String mo9449j() {
        String string = this.f28306d.getResources().getString(C0966R.string.fyq);
        C87412m.m108593f(string, "context.resources.getStr…wish_banner_anchor_title)");
        return string;
    }

    /* renamed from: k */
    public void mo3428k(View view) {
        C87412m.m108594g(view, "rootView");
        View findViewById = view.findViewById(C0966R.C0970id.izj);
        C87412m.m108593f(findViewById, "rootView.findViewById(R.…ve_wish_edit_gift_layout)");
        this.f33758n = (ConstraintLayout) findViewById;
    }

    public void onChanged(Object obj) {
        C48648a11 a112 = (C48648a11) obj;
        Log.m105924i("WishAudiencePanelWidget", "onChanged: " + a112);
        if (a112 != null) {
            ConstraintLayout constraintLayout = this.f33758n;
            if (constraintLayout != null) {
                constraintLayout.removeAllViews();
                LinkedList<C51280sp2> linkedList = a112.f130203d;
                C87412m.m108593f(linkedList, "wish_list");
                for (C51280sp2 sp22 : linkedList) {
                    C87412m.m108593f(sp22, LocaleUtil.ITALIAN);
                    C11487a aVar = new C11487a(this, sp22, new C11489i(this, a112));
                    ConstraintLayout constraintLayout2 = this.f33758n;
                    if (constraintLayout2 != null) {
                        View view = aVar.f33761c;
                        C87412m.m108593f(view, "rootView");
                        constraintLayout2.addView(view);
                    } else {
                        C87412m.m108603p("giftPanelLayout");
                        throw null;
                    }
                }
            } else {
                C87412m.m108603p("giftPanelLayout");
                throw null;
            }
        }
        ConstraintLayout constraintLayout3 = this.f33758n;
        if (constraintLayout3 != null) {
            mo11446r(constraintLayout3);
        } else {
            C87412m.m108603p("giftPanelLayout");
            throw null;
        }
    }
}
