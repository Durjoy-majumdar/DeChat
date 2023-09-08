package mo1;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import lo1.C10586a;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: mo1.s1 */
public final class C61526s1 extends UIComponent {

    /* renamed from: d */
    public final C13601g f174892d = C36568h.m40985a(new C61531e(this));

    /* renamed from: e */
    public final C13601g f174893e = C36568h.m40985a(new C61530d(this));

    /* renamed from: f */
    public final C13601g f174894f = C36568h.m40985a(new C61527a(this));

    /* renamed from: g */
    public final C13601g f174895g = C36568h.m40985a(new C61528b(this));

    /* renamed from: h */
    public final C13601g f174896h = C36568h.m40985a(new C61529c(this));

    /* renamed from: i */
    public WxRecyclerAdapter<C10586a> f174897i;

    /* renamed from: j */
    public final ArrayList<C10586a> f174898j = new ArrayList<>();

    /* renamed from: n */
    public boolean f174899n;

    /* renamed from: mo1.s1$a */
    public static final class C61527a extends C87413o implements C32224a<WxRecyclerView> {

        /* renamed from: d */
        public final /* synthetic */ C61526s1 f174900d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61527a(C61526s1 s1Var) {
            super(0);
            this.f174900d = s1Var;
        }

        public Object invoke() {
            return (WxRecyclerView) ((View) ((C36570n) this.f174900d.f174892d).getValue()).findViewById(C0966R.C0970id.jci);
        }
    }

    /* renamed from: mo1.s1$b */
    public static final class C61528b extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C61526s1 f174901d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61528b(C61526s1 s1Var) {
            super(0);
            this.f174901d = s1Var;
        }

        public Object invoke() {
            return this.f174901d.getActivity().findViewById(C0966R.C0970id.jb6);
        }
    }

    /* renamed from: mo1.s1$c */
    public static final class C61529c extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C61526s1 f174902d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61529c(C61526s1 s1Var) {
            super(0);
            this.f174902d = s1Var;
        }

        public Object invoke() {
            return (TextView) this.f174902d.getActivity().findViewById(C0966R.C0970id.e65);
        }
    }

    /* renamed from: mo1.s1$d */
    public static final class C61530d extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C61526s1 f174903d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61530d(C61526s1 s1Var) {
            super(0);
            this.f174903d = s1Var;
        }

        public Object invoke() {
            return this.f174903d.getActivity().findViewById(C0966R.C0970id.hjc);
        }
    }

    /* renamed from: mo1.s1$e */
    public static final class C61531e extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C61526s1 f174904d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61531e(C61526s1 s1Var) {
            super(0);
            this.f174904d = s1Var;
        }

        public Object invoke() {
            return this.f174904d.getActivity().findViewById(C0966R.C0970id.jch);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61526s1(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x01fa  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0295  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0298  */
    /* renamed from: c3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo86480c3(fe1.C58969q r56) {
        /*
            r55 = this;
            r0 = r55
            r1 = r56
            if (r1 != 0) goto L_0x0007
            return
        L_0x0007:
            android.app.Activity r2 = r55.getContext()
            r3 = 24
            int r2 = kg3.C76577a.m92151b(r2, r3)
            te3.dr0 r3 = r1.field_jumpInfoList
            java.lang.String r4 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            r5 = 0
            if (r3 == 0) goto L_0x01f7
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderJumpInfo> r3 = r3.f132483d
            if (r3 == 0) goto L_0x01f7
            boolean r7 = r3.isEmpty()
            r8 = 1
            r7 = r7 ^ r8
            if (r7 == 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r3 = 0
        L_0x0026:
            if (r3 == 0) goto L_0x01f7
            rx3.g r7 = r0.f174892d
            rx3.n r7 = (rx3.C36570n) r7
            java.lang.Object r7 = r7.getValue()
            android.view.View r7 = (android.view.View) r7
            k20.a r15 = new k20.a
            r15.<init>()
            java.lang.ThreadLocal<k20.a> r9 = k20.C60958c.f173611a
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            r15.mo10233c(r9)
            java.lang.Object[] r10 = r15.mo10232b()
            java.lang.String r11 = "com/tencent/mm/plugin/finder/profile/uic/FinderProfileServiceMenuUIC"
            java.lang.String r12 = "handleServiceMenu"
            java.lang.String r13 = "(Lcom/tencent/mm/plugin/finder/api/LocalFinderContact;)V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            r9 = r7
            r6 = r15
            r15 = r16
            r16 = r17
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r6 = r6.mo10231a(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r7.setVisibility(r6)
            java.lang.String r10 = "com/tencent/mm/plugin/finder/profile/uic/FinderProfileServiceMenuUIC"
            java.lang.String r11 = "handleServiceMenu"
            java.lang.String r12 = "(Lcom/tencent/mm/plugin/finder/api/LocalFinderContact;)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
            rx3.g r6 = r0.f174893e
            rx3.n r6 = (rx3.C36570n) r6
            java.lang.Object r6 = r6.getValue()
            android.view.View r6 = (android.view.View) r6
            rx3.g r7 = r0.f174893e
            rx3.n r7 = (rx3.C36570n) r7
            java.lang.Object r7 = r7.getValue()
            android.view.View r7 = (android.view.View) r7
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            gy3.C87412m.m108592e(r7, r4)
            android.view.ViewGroup$MarginLayoutParams r7 = (android.view.ViewGroup.MarginLayoutParams) r7
            r7.topMargin = r2
            r6.setLayoutParams(r7)
            java.util.ArrayList<lo1.a> r6 = r0.f174898j
            r6.clear()
            java.util.ArrayList<lo1.a> r6 = r0.f174898j
            java.util.ArrayList r7 = new java.util.ArrayList
            r9 = 10
            int r9 = sx3.C36907w.m41090l(r3, r9)
            r7.<init>(r9)
            java.util.Iterator r3 = r3.iterator()
        L_0x00af:
            boolean r9 = r3.hasNext()
            if (r9 == 0) goto L_0x012e
            java.lang.Object r9 = r3.next()
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r9 = (com.tencent.p014mm.protocal.protobuf.FinderJumpInfo) r9
            pf1.q r10 = new pf1.q
            r10.<init>(r9)
            r10.f34835i = r1
            int r9 = r9.jumpinfo_type
            if (r9 != r8) goto L_0x0125
            java.lang.String r9 = r56.getUsername()
            r10.f34836j = r9
            di0.o r9 = new di0.o
            r9.<init>()
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r11 = new com.tencent.mm.plugin.appbrand.config.HalfScreenConfig
            r18 = r11
            r19 = 1
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$c r26 = com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig.C55453c.SINGLE_CLOSE
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 1
            r44 = 0
            r45 = 0
            r46 = 0
            r47 = 0
            r48 = 0
            r49 = 0
            r50 = 0
            r51 = 0
            r52 = -16777346(0xfffffffffeffff7e, float:-1.7013987E38)
            r53 = 1
            r54 = 0
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54)
            r9.f250912A = r11
            r10.f34837k = r9
        L_0x0125:
            lo1.a r9 = new lo1.a
            r9.<init>(r10)
            r7.add(r9)
            goto L_0x00af
        L_0x012e:
            r6.addAll(r7)
            java.util.ArrayList<lo1.a> r1 = r0.f174898j
            java.util.Iterator r1 = r1.iterator()
        L_0x0137:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0157
            java.lang.Object r3 = r1.next()
            r6 = r3
            lo1.a r6 = (lo1.C10586a) r6
            pf1.q r6 = r6.f31939d
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r6 = r6.f34827a
            com.tencent.mm.protocal.protobuf.NativeInfo r6 = r6.native_info
            if (r6 == 0) goto L_0x0153
            int r6 = r6.native_type
            r7 = 7
            if (r6 != r7) goto L_0x0153
            r6 = 1
            goto L_0x0154
        L_0x0153:
            r6 = 0
        L_0x0154:
            if (r6 == 0) goto L_0x0137
            goto L_0x0158
        L_0x0157:
            r3 = 0
        L_0x0158:
            lo1.a r3 = (lo1.C10586a) r3
            if (r3 == 0) goto L_0x0186
            rx3.g r1 = r0.f174896h
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            android.widget.TextView r1 = (android.widget.TextView) r1
            pf1.q r6 = r3.f31939d
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r6 = r6.f34827a
            java.lang.String r6 = r6.wording
            r1.setText(r6)
            rx3.g r1 = r0.f174895g
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            android.view.View r1 = (android.view.View) r1
            mo1.t1 r6 = new mo1.t1
            r6.<init>(r0, r3)
            r1.setOnClickListener(r6)
            java.util.ArrayList<lo1.a> r1 = r0.f174898j
            r1.remove(r3)
        L_0x0186:
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter<lo1.a> r1 = r0.f174897i
            if (r1 == 0) goto L_0x0190
            r1.notifyDataSetChanged()
            rx3.b0 r6 = rx3.C13598b0.f38549a
            goto L_0x0191
        L_0x0190:
            r6 = 0
        L_0x0191:
            if (r6 != 0) goto L_0x01f4
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r1 = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter
            com.tencent.mm.plugin.finder.profile.uic.FinderProfileServiceMenuUIC$refreshMenu$5$1 r3 = new com.tencent.mm.plugin.finder.profile.uic.FinderProfileServiceMenuUIC$refreshMenu$5$1
            r3.<init>()
            java.util.ArrayList<lo1.a> r6 = r0.f174898j
            r1.<init>(r3, r6, r5)
            r0.f174897i = r1
            rx3.g r1 = r0.f174894f
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            com.tencent.mm.view.recyclerview.WxRecyclerView r1 = (com.tencent.p014mm.view.recyclerview.WxRecyclerView) r1
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter<lo1.a> r3 = r0.f174897i
            r1.setAdapter(r3)
            rx3.g r1 = r0.f174894f
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            com.tencent.mm.view.recyclerview.WxRecyclerView r1 = (com.tencent.p014mm.view.recyclerview.WxRecyclerView) r1
            r1.setNestedScrollingEnabled(r5)
            rx3.g r1 = r0.f174894f
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            com.tencent.mm.view.recyclerview.WxRecyclerView r1 = (com.tencent.p014mm.view.recyclerview.WxRecyclerView) r1
            android.app.Activity r3 = r55.getContext()
            com.tencent.mm.plugin.finder.profile.uic.FinderProfileServiceMenuUIC$refreshMenu$5$2 r6 = new com.tencent.mm.plugin.finder.profile.uic.FinderProfileServiceMenuUIC$refreshMenu$5$2
            r6.<init>(r3)
            r1.setLayoutManager(r6)
            rx3.g r1 = r0.f174894f
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            com.tencent.mm.view.recyclerview.WxRecyclerView r1 = (com.tencent.p014mm.view.recyclerview.WxRecyclerView) r1
            lo1.g r3 = new lo1.g
            android.app.Activity r6 = r55.getContext()
            android.content.res.Resources r6 = r6.getResources()
            r7 = 2131165283(0x7f070063, float:1.7944779E38)
            int r6 = r6.getDimensionPixelOffset(r7)
            r3.<init>(r6)
            r1.mo17085h0(r3)
        L_0x01f4:
            rx3.b0 r6 = rx3.C13598b0.f38549a
            goto L_0x01f8
        L_0x01f7:
            r6 = 0
        L_0x01f8:
            if (r6 != 0) goto L_0x0268
            rx3.g r1 = r0.f174892d
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            android.view.View r1 = (android.view.View) r1
            r3 = 8
            k20.a r14 = new k20.a
            r14.<init>()
            java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r14.mo10233c(r3)
            java.lang.Object[] r7 = r14.mo10232b()
            java.lang.String r8 = "com/tencent/mm/plugin/finder/profile/uic/FinderProfileServiceMenuUIC"
            java.lang.String r9 = "handleServiceMenu"
            java.lang.String r10 = "(Lcom/tencent/mm/plugin/finder/api/LocalFinderContact;)V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            r6 = r1
            j20.C117292a.m165358d(r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.Object r3 = r14.mo10231a(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r1.setVisibility(r3)
            java.lang.String r7 = "com/tencent/mm/plugin/finder/profile/uic/FinderProfileServiceMenuUIC"
            java.lang.String r8 = "handleServiceMenu"
            java.lang.String r9 = "(Lcom/tencent/mm/plugin/finder/api/LocalFinderContact;)V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            j20.C117292a.m165359e(r6, r7, r8, r9, r10, r11, r12)
            rx3.g r1 = r0.f174893e
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            android.view.View r1 = (android.view.View) r1
            rx3.g r3 = r0.f174893e
            rx3.n r3 = (rx3.C36570n) r3
            java.lang.Object r3 = r3.getValue()
            android.view.View r3 = (android.view.View) r3
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            gy3.C87412m.m108592e(r3, r4)
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            r3.topMargin = r5
            r1.setLayoutParams(r3)
        L_0x0268:
            rx3.g r1 = r0.f174892d
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            android.view.View r1 = (android.view.View) r1
            rx3.g r3 = r0.f174892d
            rx3.n r3 = (rx3.C36570n) r3
            java.lang.Object r3 = r3.getValue()
            android.view.View r3 = (android.view.View) r3
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            gy3.C87412m.m108592e(r3, r4)
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            rx3.g r4 = r0.f174893e
            rx3.n r4 = (rx3.C36570n) r4
            java.lang.Object r4 = r4.getValue()
            android.view.View r4 = (android.view.View) r4
            int r4 = r4.getVisibility()
            if (r4 != 0) goto L_0x0298
            r3.bottomMargin = r5
            goto L_0x029a
        L_0x0298:
            r3.bottomMargin = r2
        L_0x029a:
            r1.setLayoutParams(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mo1.C61526s1.mo86480c3(fe1.q):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61526s1(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }
}
