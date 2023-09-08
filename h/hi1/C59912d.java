package hi1;

import android.animation.Animator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import cl1.C54963d0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import d60.C58124b;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import il1.C60516s5;
import il1.C8961e;
import j20.C117292a;
import java.util.ArrayList;
import nh1.C11165g;
import nh1.C61742l;
import o40.C61926c;
import p192l4.C10462b;
import qj1.C63068w1;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C51887ww2;

/* renamed from: hi1.d */
public final class C59912d extends C8961e implements View.OnClickListener {

    /* renamed from: h */
    public final View f171008h;

    /* renamed from: i */
    public final C58124b f171009i;

    /* renamed from: j */
    public final C63068w1 f171010j;

    /* renamed from: n */
    public final C32226l<Boolean, C13598b0> f171011n;

    /* renamed from: o */
    public C61742l f171012o;

    /* renamed from: p */
    public boolean f171013p = true;

    /* renamed from: q */
    public final C13601g f171014q = C36568h.m40985a(new C59913a(this));

    /* renamed from: r */
    public final C60516s5 f171015r;

    /* renamed from: hi1.d$a */
    public static final class C59913a extends C87413o implements C32224a<C8533a> {

        /* renamed from: d */
        public final /* synthetic */ C59912d f171016d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59913a(C59912d dVar) {
            super(0);
            this.f171016d = dVar;
        }

        public Object invoke() {
            C59912d dVar = this.f171016d;
            return new C8533a(dVar.f28306d, new C59911c(dVar));
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C59912d(android.view.View r8, d60.C58124b r9, qj1.C63068w1 r10, fy3.C32226l<? super java.lang.Boolean, rx3.C13598b0> r11) {
        /*
            r7 = this;
            java.lang.String r0 = "anchorLinkRoot"
            gy3.C87412m.m108594g(r8, r0)
            java.lang.String r0 = "statusMonitor"
            gy3.C87412m.m108594g(r9, r0)
            java.lang.String r0 = "basePlugin"
            gy3.C87412m.m108594g(r10, r0)
            java.lang.String r0 = "dismiss"
            gy3.C87412m.m108594g(r11, r0)
            android.content.Context r2 = r8.getContext()
            java.lang.String r0 = "anchorLinkRoot.context"
            gy3.C87412m.m108593f(r2, r0)
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            r7.f171008h = r8
            r7.f171009i = r9
            r7.f171010j = r10
            r7.f171011n = r11
            r8 = 1
            r7.f171013p = r8
            hi1.d$a r8 = new hi1.d$a
            r8.<init>(r7)
            rx3.g r8 = rx3.C36568h.m40985a(r8)
            r7.f171014q = r8
            il1.s5 r8 = new il1.s5
            android.view.ViewGroup r11 = r10.f166287d
            r0 = 2131303908(0x7f091de4, float:1.8225944E38)
            android.view.View r11 = r11.findViewById(r0)
            java.lang.String r0 = "basePlugin.root.findView…ve_mic_condition_ui_root)"
            gy3.C87412m.m108593f(r11, r0)
            android.widget.RelativeLayout r11 = (android.widget.RelativeLayout) r11
            r8.<init>(r11, r9, r10)
            r7.f171015r = r8
            fg1.a r8 = r7.f28309g
            android.view.View r8 = r8.f26707c
            android.view.ViewGroup$LayoutParams r8 = r8.getLayoutParams()
            if (r8 == 0) goto L_0x0067
            er1.r3 r9 = er1.C7865r3.f26468a
            int r9 = r9.mo8968a()
            int r9 = r9 / 2
            r8.height = r9
        L_0x0067:
            fg1.a r8 = r7.f28309g
            android.view.View r8 = r8.f26707c
            r9 = 2131232528(0x7f080710, float:1.8081168E38)
            r8.setBackgroundResource(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hi1.C59912d.<init>(android.view.View, d60.b, qj1.w1, fy3.l):void");
    }

    /* renamed from: g */
    public int mo3425g() {
        return C0966R.C0971layout.f7180pj;
    }

    /* renamed from: j */
    public String mo9449j() {
        String string = this.f28306d.getResources().getString(C0966R.string.f8122m0);
        C87412m.m108593f(string, "context.resources.getStr….finder_live_mic_setting)");
        return string;
    }

    /* renamed from: k */
    public void mo3428k(View view) {
        C87412m.m108594g(view, "rootView");
        int i = C0966R.C0970id.ok4;
        ConstraintLayout constraintLayout = (ConstraintLayout) C10462b.m10395a(view, C0966R.C0970id.ok4);
        if (constraintLayout != null) {
            i = C0966R.C0970id.ok6;
            ConstraintLayout constraintLayout2 = (ConstraintLayout) C10462b.m10395a(view, C0966R.C0970id.ok6);
            if (constraintLayout2 != null) {
                i = C0966R.C0970id.omo;
                WeImageView weImageView = (WeImageView) C10462b.m10395a(view, C0966R.C0970id.omo);
                if (weImageView != null) {
                    i = C0966R.C0970id.omp;
                    TextView textView = (TextView) C10462b.m10395a(view, C0966R.C0970id.omp);
                    if (textView != null) {
                        i = C0966R.C0970id.omq;
                        TextView textView2 = (TextView) C10462b.m10395a(view, C0966R.C0970id.omq);
                        if (textView2 != null) {
                            i = C0966R.C0970id.omz;
                            WeImageView weImageView2 = (WeImageView) C10462b.m10395a(view, C0966R.C0970id.omz);
                            if (weImageView2 != null) {
                                i = C0966R.C0970id.f358743on0;
                                TextView textView3 = (TextView) C10462b.m10395a(view, C0966R.C0970id.f358743on0);
                                if (textView3 != null) {
                                    i = C0966R.C0970id.f358744on1;
                                    TextView textView4 = (TextView) C10462b.m10395a(view, C0966R.C0970id.f358744on1);
                                    if (textView4 != null) {
                                        this.f171012o = new C61742l((LinearLayout) view, constraintLayout, constraintLayout2, weImageView, textView, textView2, weImageView2, textView3, textView4);
                                        constraintLayout2.setOnClickListener(this);
                                        C61742l lVar = this.f171012o;
                                        if (lVar != null) {
                                            lVar.f175478a.setOnClickListener(this);
                                            return;
                                        } else {
                                            C87412m.m108603p("uiBinding");
                                            throw null;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: m */
    public void mo3429m() {
        this.f171011n.invoke(Boolean.valueOf(this.f171013p));
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicMoreActionWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        C61742l lVar = this.f171012o;
        if (lVar != null) {
            int id = lVar.f175479b.getId();
            if (valueOf != null && valueOf.intValue() == id) {
                this.f171013p = false;
                mo9763a();
                C51887ww2 ww22 = ((C54963d0) this.f171010j.mo87696x0(C54963d0.class)).f154048B;
                if (ww22 != null) {
                    int i = C61926c.m72696u((int) ww22.f144323d, 16) ? 2 : 1;
                    C8533a aVar = (C8533a) ((C36570n) this.f171014q).getValue();
                    aVar.f27588j = i;
                    if (i == 2) {
                        C11165g gVar = aVar.f27587i;
                        if (gVar != null) {
                            gVar.f32955c.setVisibility(0);
                            C11165g gVar2 = aVar.f27587i;
                            if (gVar2 != null) {
                                gVar2.f32953a.setVisibility(8);
                            } else {
                                C87412m.m108603p("uiBinding");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("uiBinding");
                            throw null;
                        }
                    } else {
                        C11165g gVar3 = aVar.f27587i;
                        if (gVar3 != null) {
                            gVar3.f32955c.setVisibility(8);
                            C11165g gVar4 = aVar.f27587i;
                            if (gVar4 != null) {
                                gVar4.f32953a.setVisibility(0);
                            } else {
                                C87412m.m108603p("uiBinding");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("uiBinding");
                            throw null;
                        }
                    }
                    aVar.mo3431p();
                    this.f171008h.setBackground((Drawable) null);
                }
            } else {
                C61742l lVar2 = this.f171012o;
                if (lVar2 != null) {
                    int id4 = lVar2.f175478a.getId();
                    if (valueOf != null && valueOf.intValue() == id4) {
                        this.f171013p = false;
                        mo9763a();
                        this.f171008h.setBackground(this.f28306d.getResources().getDrawable(C0966R.color.a1u));
                        C60516s5 s5Var = this.f171015r;
                        s5Var.f172488f.mo88005b1();
                        s5Var.f172486d.setVisibility(0);
                        s5Var.mo85486b();
                        s5Var.f172491i.notifyDataSetChanged();
                        s5Var.f172486d.animate().translationY(0.0f).setDuration(200).setListener((Animator.AnimatorListener) null).start();
                    }
                } else {
                    C87412m.m108603p("uiBinding");
                    throw null;
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicMoreActionWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C87412m.m108603p("uiBinding");
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r0 = ((cl1.C54963d0) r0.mo87696x0(cl1.C54963d0.class)).f154048B;
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3431p() {
        /*
            r7 = this;
            super.mo3431p()
            qj1.w1 r0 = r7.f171010j
            if (r0 == 0) goto L_0x0016
            java.lang.Class<cl1.d0> r1 = cl1.C54963d0.class
            androidx.lifecycle.i0 r0 = r0.mo87696x0(r1)
            cl1.d0 r0 = (cl1.C54963d0) r0
            te3.ww2 r0 = r0.f154048B
            if (r0 == 0) goto L_0x0016
            long r0 = r0.f144323d
            goto L_0x0018
        L_0x0016:
            r0 = 0
        L_0x0018:
            ok1.e r2 = ok1.C62042e.f176370a
            r2.getClass()
            int r1 = (int) r0
            r0 = 2
            boolean r0 = o40.C61926c.m72696u(r1, r0)
            java.lang.String r2 = "uiBinding"
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L_0x0045
            nh1.l r0 = r7.f171012o
            if (r0 == 0) goto L_0x0041
            android.widget.TextView r0 = r0.f175480c
            android.content.Context r5 = r7.f28306d
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2131828020(0x7f111d34, float:1.928897E38)
            java.lang.String r5 = r5.getString(r6)
            r0.setText(r5)
            goto L_0x009e
        L_0x0041:
            gy3.C87412m.m108603p(r2)
            throw r4
        L_0x0045:
            boolean r0 = o40.C61926c.m72696u(r1, r3)
            if (r0 == 0) goto L_0x0066
            nh1.l r0 = r7.f171012o
            if (r0 == 0) goto L_0x0062
            android.widget.TextView r0 = r0.f175480c
            android.content.Context r5 = r7.f28306d
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2131828023(0x7f111d37, float:1.9288975E38)
            java.lang.String r5 = r5.getString(r6)
            r0.setText(r5)
            goto L_0x009e
        L_0x0062:
            gy3.C87412m.m108603p(r2)
            throw r4
        L_0x0066:
            r0 = 4
            boolean r0 = o40.C61926c.m72696u(r1, r0)
            if (r0 == 0) goto L_0x0088
            nh1.l r0 = r7.f171012o
            if (r0 == 0) goto L_0x0084
            android.widget.TextView r0 = r0.f175480c
            android.content.Context r5 = r7.f28306d
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2131828018(0x7f111d32, float:1.9288965E38)
            java.lang.String r5 = r5.getString(r6)
            r0.setText(r5)
            goto L_0x009e
        L_0x0084:
            gy3.C87412m.m108603p(r2)
            throw r4
        L_0x0088:
            nh1.l r0 = r7.f171012o
            if (r0 == 0) goto L_0x0108
            android.widget.TextView r0 = r0.f175480c
            android.content.Context r5 = r7.f28306d
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2131828017(0x7f111d31, float:1.9288963E38)
            java.lang.String r5 = r5.getString(r6)
            r0.setText(r5)
        L_0x009e:
            nh1.l r0 = r7.f171012o
            if (r0 == 0) goto L_0x0104
            android.widget.TextView r0 = r0.f175481d
            r5 = 16
            boolean r1 = o40.C61926c.m72696u(r1, r5)
            if (r1 == 0) goto L_0x00ba
            android.content.Context r1 = r7.f28306d
            android.content.res.Resources r1 = r1.getResources()
            r5 = 2131828013(0x7f111d2d, float:1.9288955E38)
            java.lang.String r1 = r1.getString(r5)
            goto L_0x00c7
        L_0x00ba:
            android.content.Context r1 = r7.f28306d
            android.content.res.Resources r1 = r1.getResources()
            r5 = 2131828011(0x7f111d2b, float:1.928895E38)
            java.lang.String r1 = r1.getString(r5)
        L_0x00c7:
            r0.setText(r1)
            r7.f171013p = r3
            android.view.View r0 = r7.f171008h
            r0.setBackground(r4)
            qj1.w1 r0 = r7.f171010j
            r1 = 0
            if (r0 == 0) goto L_0x00e3
            java.lang.Class<cl1.o> r5 = cl1.C54991o.class
            androidx.lifecycle.i0 r0 = r0.mo87696x0(r5)
            cl1.o r0 = (cl1.C54991o) r0
            boolean r0 = r0.f154273W1
            if (r0 != r3) goto L_0x00e3
            goto L_0x00e4
        L_0x00e3:
            r3 = 0
        L_0x00e4:
            if (r3 != 0) goto L_0x00f6
            nh1.l r0 = r7.f171012o
            if (r0 == 0) goto L_0x00f2
            androidx.constraintlayout.widget.ConstraintLayout r0 = r0.f175479b
            r1 = 8
            r0.setVisibility(r1)
            return
        L_0x00f2:
            gy3.C87412m.m108603p(r2)
            throw r4
        L_0x00f6:
            nh1.l r0 = r7.f171012o
            if (r0 == 0) goto L_0x0100
            androidx.constraintlayout.widget.ConstraintLayout r0 = r0.f175479b
            r0.setVisibility(r1)
            return
        L_0x0100:
            gy3.C87412m.m108603p(r2)
            throw r4
        L_0x0104:
            gy3.C87412m.m108603p(r2)
            throw r4
        L_0x0108:
            gy3.C87412m.m108603p(r2)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: hi1.C59912d.mo3431p():void");
    }
}
