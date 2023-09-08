package qj1;

import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.LiveBottomSheetPanel;
import d60.C58124b;
import fy3.C32226l;
import gg1.C32444a;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;

/* renamed from: qj1.ch */
public final class C12271ch extends C62660c {

    /* renamed from: p */
    public final C58124b f35358p;

    /* renamed from: q */
    public final View f35359q;

    /* renamed from: r */
    public final View f35360r;

    /* renamed from: s */
    public final TextView f35361s;

    /* renamed from: t */
    public final CheckBox f35362t;

    /* renamed from: u */
    public final View f35363u;

    /* renamed from: v */
    public final LiveBottomSheetPanel f35364v;

    /* renamed from: w */
    public int f35365w;

    /* renamed from: x */
    public int f35366x;

    /* renamed from: qj1.ch$a */
    public static final class C12272a extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C12271ch f35367d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12272a(C12271ch chVar) {
            super(1);
            this.f35367d = chVar;
        }

        public Object invoke(Object obj) {
            if (!((Boolean) obj).booleanValue()) {
                this.f35367d.mo10792g(8);
                C58124b.C7172a.m7372a(this.f35367d.f35358p, C58124b.C58125b.FINDER_LIVE_LINK_MIC_HIDE_APPLY_LICENSE, (Bundle) null, 2, (Object) null);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: qj1.ch$b */
    public static final class C12273b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C12271ch f35368d;

        public C12273b(C12271ch chVar) {
            this.f35368d = chVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorLinkMicLisencePlugin$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            CheckBox checkBox = this.f35368d.f35362t;
            checkBox.setChecked(!checkBox.isChecked());
            C12271ch chVar = this.f35368d;
            chVar.f35365w = chVar.f35362t.isChecked() ? 1 : 0;
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorLinkMicLisencePlugin$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qj1.ch$c */
    public static final class C12274c implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        public final /* synthetic */ C12271ch f35369a;

        public C12274c(C12271ch chVar) {
            this.f35369a = chVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            C12271ch chVar = this.f35369a;
            chVar.f35365w = chVar.f35362t.isChecked() ? 1 : 0;
            C12271ch chVar2 = this.f35369a;
            chVar2.f35361s.setActivated(chVar2.f35365w != 0);
        }
    }

    /* renamed from: qj1.ch$d */
    public static final class C12275d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C12271ch f35370d;

        public C12275d(C12271ch chVar) {
            this.f35370d = chVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorLinkMicLisencePlugin$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f35370d.f35364v.mo78802a();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorLinkMicLisencePlugin$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qj1.ch$e */
    public static final class C12276e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C12271ch f35371d;

        public C12276e(C12271ch chVar) {
            this.f35371d = chVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorLinkMicLisencePlugin$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f35371d.f35364v.mo78802a();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorLinkMicLisencePlugin$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qj1.ch$f */
    public static final class C12277f implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C12271ch f35372d;

        public C12277f(C12271ch chVar) {
            this.f35372d = chVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorLinkMicLisencePlugin$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C12271ch chVar = this.f35372d;
            int i = chVar.f35365w;
            if (i != 1) {
                chVar.f35363u.startAnimation(AnimationUtils.loadAnimation(chVar.f166287d.getContext(), C0966R.C0968anim.f2342a7));
            } else {
                C32444a.f86121a.mo58624e(i);
                C58124b bVar = this.f35372d.f35358p;
                C58124b.C58125b bVar2 = C58124b.C58125b.FINDER_LIVE_LINK_MIC_CHECKED;
                Bundle bundle = new Bundle();
                bundle.putInt("PARAM_FINDER_LIVE_LINK_MIC_POSITION", this.f35372d.f35366x);
                C13598b0 b0Var = C13598b0.f38549a;
                bVar.statusChange(bVar2, bundle);
                this.f35372d.f35364v.mo78802a();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorLinkMicLisencePlugin$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C12271ch(android.view.ViewGroup r18, d60.C58124b r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            java.lang.String r3 = "root"
            gy3.C87412m.m108594g(r1, r3)
            java.lang.String r3 = "statusMonitor"
            gy3.C87412m.m108594g(r2, r3)
            r3 = 0
            r0.<init>(r1, r2, r3)
            r0.f35358p = r2
            r2 = 2131303121(0x7f091ad1, float:1.8224347E38)
            android.view.View r2 = r1.findViewById(r2)
            r0.f35359q = r2
            r3 = 2131303120(0x7f091ad0, float:1.8224345E38)
            android.view.View r3 = r1.findViewById(r3)
            r0.f35360r = r3
            r4 = 2131303127(0x7f091ad7, float:1.822436E38)
            android.view.View r4 = r1.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r0.f35361s = r4
            r5 = 2131303124(0x7f091ad4, float:1.8224354E38)
            android.view.View r5 = r1.findViewById(r5)
            android.widget.CheckBox r5 = (android.widget.CheckBox) r5
            r0.f35362t = r5
            r6 = 2131303126(0x7f091ad6, float:1.8224358E38)
            android.view.View r6 = r1.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r7 = 2131303125(0x7f091ad5, float:1.8224356E38)
            android.view.View r7 = r1.findViewById(r7)
            r0.f35363u = r7
            r8 = 2131303122(0x7f091ad2, float:1.822435E38)
            android.view.View r8 = r1.findViewById(r8)
            java.lang.String r9 = "root.findViewById(R.id.f…_lisence_ui_content_area)"
            gy3.C87412m.m108593f(r8, r9)
            com.tencent.mm.ui.widget.LiveBottomSheetPanel r8 = (com.tencent.p014mm.p136ui.widget.LiveBottomSheetPanel) r8
            r0.f35364v = r8
            android.content.Context r9 = r18.getContext()
            android.graphics.Point r9 = com.tencent.p014mm.p136ui.C75044y4.m89990b(r9)
            int r9 = r9.y
            float r9 = (float) r9
            r8.setTranslationY(r9)
            qj1.ch$a r9 = new qj1.ch$a
            r9.<init>(r0)
            r8.setOnVisibilityListener(r9)
            qj1.ch$b r9 = new qj1.ch$b
            r9.<init>(r0)
            r7.setOnClickListener(r9)
            qj1.ch$c r7 = new qj1.ch$c
            r7.<init>(r0)
            r5.setOnCheckedChangeListener(r7)
            java.lang.String r5 = "lisenceTv"
            gy3.C87412m.m108593f(r6, r5)
            android.content.Context r5 = r6.getContext()
            android.content.res.Resources r5 = r5.getResources()
            r7 = 2131826982(0x7f111926, float:1.9286864E38)
            java.lang.String r5 = r5.getString(r7)
            java.lang.String r7 = "tv.context.resources.get…inder_live_anchor_iterms)"
            gy3.C87412m.m108593f(r5, r7)
            android.content.Context r7 = r6.getContext()
            android.content.res.Resources r7 = r7.getResources()
            r9 = 2131827025(0x7f111951, float:1.928695E38)
            java.lang.String r7 = r7.getString(r9)
            java.lang.String r9 = "tv.context.resources.get…der_live_anchor_standard)"
            gy3.C87412m.m108593f(r7, r9)
            android.content.Context r9 = r6.getContext()
            android.content.res.Resources r9 = r9.getResources()
            r10 = 2131826954(0x7f11190a, float:1.9286807E38)
            java.lang.String r9 = r9.getString(r10)
            java.lang.String r10 = "tv.context.resources.get…ng.finder_live_agree_new)"
            gy3.C87412m.m108593f(r9, r10)
            r10 = 2
            java.lang.Object[] r11 = new java.lang.Object[r10]
            r12 = 0
            r11[r12] = r5
            r12 = 1
            r11[r12] = r7
            java.lang.Object[] r10 = java.util.Arrays.copyOf(r11, r10)
            java.lang.String r15 = java.lang.String.format(r9, r10)
            java.lang.String r9 = "format(format, *args)"
            gy3.C87412m.m108593f(r15, r9)
            r11 = 0
            r12 = 0
            r13 = 6
            r14 = 0
            r9 = r15
            r10 = r5
            int r9 = z04.C112550d0.m153769E(r9, r10, r11, r12, r13, r14)
            int r5 = r5.length()
            int r5 = r5 + r9
            r13 = 0
            r14 = 6
            r16 = 0
            r10 = r15
            r11 = r7
            r1 = r15
            r15 = r16
            int r10 = z04.C112550d0.m153769E(r10, r11, r12, r13, r14, r15)
            int r7 = r7.length()
            int r7 = r7 + r10
            android.text.SpannableString r11 = new android.text.SpannableString
            r11.<init>(r1)
            qj1.dh r1 = new qj1.dh
            r1.<init>(r0)
            qj1.eh r12 = new qj1.eh
            r12.<init>(r0)
            r13 = 33
            r11.setSpan(r1, r9, r5, r13)
            r11.setSpan(r12, r10, r7, r13)
            android.content.Context r1 = r6.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r5 = 17170445(0x106000d, float:2.461195E-38)
            int r1 = r1.getColor(r5)
            r6.setHighlightColor(r1)
            android.text.method.MovementMethod r1 = android.text.method.LinkMovementMethod.getInstance()
            r6.setMovementMethod(r1)
            r6.setText(r11)
            qj1.ch$d r1 = new qj1.ch$d
            r1.<init>(r0)
            r3.setOnClickListener(r1)
            qj1.ch$e r1 = new qj1.ch$e
            r1.<init>(r0)
            r2.setOnClickListener(r1)
            qj1.ch$f r1 = new qj1.ch$f
            r1.<init>(r0)
            r4.setOnClickListener(r1)
            boolean r1 = r17.mo82893g0()
            if (r1 != 0) goto L_0x0171
            int r1 = r18.getPaddingLeft()
            int r2 = r18.getPaddingTop()
            int r3 = r18.getPaddingRight()
            int r4 = r18.getPaddingBottom()
            android.content.Context r5 = r18.getContext()
            int r5 = com.tencent.p014mm.p136ui.C75044y4.m89991c(r5)
            int r4 = r4 + r5
            r8.setPadding(r1, r2, r3, r4)
        L_0x0171:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C12271ch.<init>(android.view.ViewGroup, d60.b):void");
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return false;
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return ((C54991o) mo87696x0(C54991o.class)).f154287Z0 != 1;
    }
}
