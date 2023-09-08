package qj1;

import a14.C53934p0;
import ak1.C0046d0;
import ak1.C0047e0;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import cl1.C0668l;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.pluginsdk.platformtools.C72715f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import d60.C58124b;
import er1.C58739j4;
import fy3.C32226l;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import nk1.C11207i;
import ok1.C62042e;
import org.libpag.PAGFile;
import org.libpag.PAGView;
import rx3.C13601g;
import rx3.C36570n;
import sg1.C13677a;
import sk1.C63947a;
import te3.C64321dp2;
import te3.C64337e61;
import te3.C64390ga1;
import wc1.C15064b;
import wk1.C15440n;
import wx3.C15601d;
import wx3.C66212f;
import zp3.C23564m;
import zp3.C79406f;

/* renamed from: qj1.t4 */
public final class C12669t4 extends C12252b {

    /* renamed from: A */
    public C64321dp2 f36277A;

    /* renamed from: B */
    public int f36278B;

    /* renamed from: C */
    public boolean f36279C;

    /* renamed from: D */
    public int f36280D;

    /* renamed from: E */
    public PAGView f36281E;

    /* renamed from: F */
    public Drawable f36282F;

    /* renamed from: G */
    public final C13601g f36283G;

    /* renamed from: H */
    public final C13601g f36284H;

    /* renamed from: q */
    public final C58124b f36285q;

    /* renamed from: r */
    public ImageView f36286r;

    /* renamed from: s */
    public View f36287s;

    /* renamed from: t */
    public TextView f36288t;

    /* renamed from: u */
    public TextView f36289u;

    /* renamed from: v */
    public WeImageView f36290v;

    /* renamed from: w */
    public TextView f36291w;

    /* renamed from: x */
    public ViewGroup f36292x;

    /* renamed from: y */
    public View f36293y;

    /* renamed from: z */
    public TextView f36294z;

    /* renamed from: qj1.t4$a */
    public static final class C12670a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C12669t4 f36295d;

        public C12670a(C12669t4 t4Var) {
            this.f36295d = t4Var;
        }

        public final void run() {
            if (this.f36295d.mo82893g0() && this.f36295d.f166287d.getLayoutParams() != null && (this.f36295d.f166287d.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
                ViewGroup.LayoutParams layoutParams = this.f36295d.f166287d.getLayoutParams();
                C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.LayoutParams layoutParams2 = this.f36295d.f166287d.getLayoutParams();
                C87412m.m108592e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((ViewGroup.MarginLayoutParams) layoutParams).setMarginEnd(((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd() + C76577a.m92151b(this.f36295d.f166287d.getContext(), 16));
            }
            if (this.f36295d.mo82893g0()) {
                int a = C12322e5.f35497W.mo12039a() + C79406f.m96347a(MMApplicationContext.getContext(), 42.0f);
                ViewGroup.LayoutParams layoutParams3 = this.f36295d.f166287d.getLayoutParams();
                C87412m.m108592e(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3;
                marginLayoutParams.setMarginStart(a);
                this.f36295d.f166287d.setLayoutParams(marginLayoutParams);
                C12669t4.m12162a1(this.f36295d);
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C12669t4(android.view.ViewGroup r1, d60.C58124b r2, te3.C49712hj1 r3, int r4, gy3.C8480h r5) {
        /*
            r0 = this;
            r4 = r4 & 4
            if (r4 == 0) goto L_0x0005
            r3 = 0
        L_0x0005:
            java.lang.String r4 = "root"
            gy3.C87412m.m108594g(r1, r4)
            java.lang.String r4 = "statusMonitor"
            gy3.C87412m.m108594g(r2, r4)
            r0.<init>(r1, r2, r3)
            r0.f36285q = r2
            qj1.o4 r1 = new qj1.o4
            r1.<init>(r0)
            rx3.g r1 = rx3.C36568h.m40985a(r1)
            r0.f36283G = r1
            qj1.s4 r1 = new qj1.s4
            r1.<init>(r0)
            rx3.g r1 = rx3.C36568h.m40985a(r1)
            r0.f36284H = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C12669t4.<init>(android.view.ViewGroup, d60.b, te3.hj1, int, gy3.h):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004a, code lost:
        r0 = r0.getLayoutParams();
     */
    /* renamed from: Z0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m12161Z0(qj1.C12669t4 r4) {
        /*
            android.view.View r0 = r4.f36293y
            if (r0 == 0) goto L_0x007f
            org.libpag.PAGView r1 = r4.f36281E
            if (r1 == 0) goto L_0x001b
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            if (r1 == 0) goto L_0x001b
            int r2 = r0.getMeasuredWidth()
            wk1.n r3 = wk1.C15440n.f41895a
            int r3 = r3.mo14257f()
            int r2 = r2 + r3
            r1.width = r2
        L_0x001b:
            org.libpag.PAGView r1 = r4.f36281E
            if (r1 == 0) goto L_0x0022
            r1.requestLayout()
        L_0x0022:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "showFreeTimeOverWarning costInnerContainer size:"
            r1.append(r2)
            int r2 = r0.getMeasuredWidth()
            r1.append(r2)
            r2 = 45
            r1.append(r2)
            int r0 = r0.getMeasuredHeight()
            r1.append(r0)
            java.lang.String r0 = ",freeTimeOverPag:"
            r1.append(r0)
            org.libpag.PAGView r0 = r4.f36281E
            r3 = 0
            if (r0 == 0) goto L_0x0057
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            if (r0 == 0) goto L_0x0057
            int r0 = r0.width
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0058
        L_0x0057:
            r0 = r3
        L_0x0058:
            r1.append(r0)
            r1.append(r2)
            org.libpag.PAGView r4 = r4.f36281E
            if (r4 == 0) goto L_0x006e
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            if (r4 == 0) goto L_0x006e
            int r4 = r4.height
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
        L_0x006e:
            r1.append(r3)
            r4 = 33
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r0 = "FinderLiveChargePayLazyPlugin"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r4)
        L_0x007f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C12669t4.m12161Z0(qj1.t4):void");
    }

    /* renamed from: a1 */
    public static final void m12162a1(C12669t4 t4Var) {
        TextView textView = t4Var.f36288t;
        if (textView != null) {
            int width = t4Var.f166287d.getWidth();
            ViewGroup viewGroup = t4Var.f36292x;
            textView.setMaxWidth((width - (viewGroup != null ? viewGroup.getWidth() : 0)) - C79406f.m96347a(MMApplicationContext.getContext(), 72.0f));
        }
    }

    /* renamed from: b1 */
    public static final void m12163b1(C12669t4 t4Var) {
        C64337e61 d3 = ((C0668l) t4Var.mo87696x0(C0668l.class)).mo630d3();
        boolean z = false;
        if (d3 != null && d3.f182920d == 2) {
            z = true;
        }
        if (z) {
            C12723w4.m12223b(t4Var, true);
            return;
        }
        long j = ((C55001u) t4Var.mo87696x0(C55001u.class)).f154420q.f182392d;
        Log.m105924i("FinderLiveChargePayPluginEx", "#payForLiveV2 liveId=" + j);
        C11207i.m11072h(t4Var, (C66212f) null, (C53934p0) null, new C12280d5(t4Var, j, (C15601d<? super C12280d5>) null), 3, (Object) null);
    }

    /* renamed from: i1 */
    public static final void m12164i1(C12669t4 t4Var, boolean z) {
        TextView textView = t4Var.f36289u;
        if (textView != null && !C87412m.m108589b(textView.getTag(), Boolean.valueOf(z))) {
            if (z) {
                textView.setTextColor(t4Var.f166287d.getContext().getResources().getColor(C0966R.color.f2975b6));
                C85875k4.m106189j0(textView.getPaint(), 0.8f);
            } else {
                textView.setTextColor(t4Var.f166287d.getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_8));
                C85875k4.m106193l0(textView.getPaint());
            }
            textView.setTag(Boolean.valueOf(z));
        }
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return true;
    }

    /* renamed from: c1 */
    public final void mo12249c1() {
        Log.m105924i("FinderLiveChargePayLazyPlugin", "finishCountDown freeTimeInfo:" + this.f36277A);
        C64321dp2 dp22 = this.f36277A;
        if (dp22 != null) {
            mo12256l1(dp22);
        }
    }

    /* renamed from: d1 */
    public final void mo12250d1(boolean z) {
        Log.m105924i("FinderLiveChargePayLazyPlugin", "enableCountDown:" + z);
        this.f36279C = z;
    }

    /* renamed from: e1 */
    public final void mo12251e1(boolean z) {
        if (z) {
            WeImageView weImageView = this.f36290v;
            if (weImageView != null) {
                weImageView.setVisibility(0);
            }
            TextView textView = this.f36291w;
            if (textView != null) {
                textView.setVisibility(0);
                return;
            }
            return;
        }
        WeImageView weImageView2 = this.f36290v;
        if (weImageView2 != null) {
            weImageView2.setVisibility(8);
        }
        TextView textView2 = this.f36291w;
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
    }

    /* renamed from: f1 */
    public final void mo12252f1(C64321dp2 dp22, boolean z) {
        C64321dp2 dp23 = dp22;
        Class cls = C0668l.class;
        C87412m.m108594g(dp23, "freeTimeInfo");
        this.f36277A = dp23;
        C64337e61 d3 = ((C0668l) mo87696x0(cls)).mo630d3();
        boolean z2 = false;
        this.f36278B = d3 != null ? d3.f182924h : 0;
        this.f36286r = (ImageView) this.f166287d.findViewById(C0966R.C0970id.nfn);
        this.f36287s = this.f166287d.findViewById(C0966R.C0970id.dsq);
        this.f36288t = (TextView) this.f166287d.findViewById(C0966R.C0970id.f3q);
        TextView textView = (TextView) this.f166287d.findViewById(C0966R.C0970id.eey);
        C15064b bVar = C15064b.f41199a;
        Context context = textView.getContext();
        C87412m.m108593f(context, "context");
        C15064b.m14230a(bVar, context, textView, 15.0f, 0.0f, 8, (Object) null);
        this.f36289u = textView;
        this.f36290v = (WeImageView) this.f166287d.findViewById(C0966R.C0970id.azs);
        TextView textView2 = (TextView) this.f166287d.findViewById(C0966R.C0970id.azt);
        Context context2 = textView2.getContext();
        C87412m.m108593f(context2, "context");
        C15064b.m14230a(bVar, context2, textView2, 15.0f, 0.0f, 8, (Object) null);
        this.f36291w = textView2;
        C58739j4.f168176a.mo83703c0(textView2, false);
        ViewGroup viewGroup = (ViewGroup) this.f166287d.findViewById(C0966R.C0970id.azr);
        this.f36292x = viewGroup;
        if (viewGroup != null) {
            viewGroup.setOnClickListener(new C12594p4(this));
        }
        TextView textView3 = (TextView) this.f166287d.findViewById(C0966R.C0970id.azv);
        Context context3 = textView3.getContext();
        C87412m.m108593f(context3, "context");
        C15064b.m14230a(bVar, context3, textView3, 15.0f, 0.0f, 8, (Object) null);
        this.f36294z = textView3;
        this.f36293y = this.f166287d.findViewById(C0966R.C0970id.azu);
        PAGView pAGView = (PAGView) this.f166287d.findViewById(C0966R.C0970id.o49);
        pAGView.setComposition(PAGFile.Load(pAGView.getContext().getAssets(), "finder_live_charge_free_time_over.pag"));
        pAGView.setRepeatCount(0);
        pAGView.setScaleMode(1);
        this.f36281E = pAGView;
        if (C0668l.m590f3((C0668l) mo87696x0(cls), (C64337e61) null, 1, (Object) null)) {
            C11207i.m11072h(this, (C66212f) null, (C53934p0) null, new C12608q4(this, (C15601d<? super C12608q4>) null), 3, (Object) null);
        } else {
            TextView textView4 = this.f36289u;
            if (textView4 != null) {
                textView4.setTextSize(15.0f);
            }
            TextView textView5 = this.f36289u;
            if (textView5 != null) {
                textView5.setAlpha(1.0f);
            }
            TextView textView6 = this.f36288t;
            if (textView6 != null) {
                textView6.setVisibility(8);
            }
            View view = this.f36287s;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveChargePayLazyPlugin", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveChargePayLazyPlugin", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        mo12250d1(true);
        mo12253g1(false, false);
        mo12254h1();
        C62042e.f176370a.mo87074e(this, false);
        this.f166287d.post(new C12670a(this));
        if (z) {
            this.f166287d.setAlpha(0.0f);
            this.f166287d.animate().alpha(1.0f).start();
        }
        mo10792g(0);
        ViewGroup viewGroup2 = this.f36292x;
        if (((C54991o) mo87696x0(C54991o.class)).f154287Z0 == 2) {
            z2 = true;
        }
        long j = ((C55001u) mo87696x0(C55001u.class)).f154416j;
        if (viewGroup2 != null) {
            C23564m.m28138h(viewGroup2, new C0046d0(z2, j));
        }
        Log.m105924i("FinderLiveChargePayLazyPlugin", "show freeTomeToWatch:" + C63947a.f181274a.mo88731q(dp23));
    }

    /* renamed from: g1 */
    public final void mo12253g1(boolean z, boolean z2) {
        ViewTreeObserver viewTreeObserver;
        View view;
        TextView textView = this.f36291w;
        if (textView != null) {
            textView.setText(String.valueOf(this.f36278B));
        }
        Boolean bool = null;
        boolean z3 = false;
        if (z) {
            View view2 = this.f36293y;
            if (view2 != null) {
                if (!(this.f36280D != 3)) {
                    view2 = null;
                }
                if (view2 != null) {
                    mo12255j1(3);
                    mo12251e1(false);
                    View view3 = this.f36293y;
                    Object tag = view3 != null ? view3.getTag() : null;
                    if (tag instanceof Boolean) {
                        bool = (Boolean) tag;
                    }
                    Log.m105924i("FinderLiveChargePayLazyPlugin", "foldCostLayout layoutFolded:" + bool + '!');
                    Boolean bool2 = Boolean.TRUE;
                    if (!C87412m.m108589b(bool, bool2) && (view = this.f36293y) != null) {
                        int width = view.getWidth();
                        WeImageView weImageView = this.f36290v;
                        int width2 = width - (weImageView != null ? weImageView.getWidth() : 0);
                        TextView textView2 = this.f36291w;
                        int width3 = width2 - (textView2 != null ? textView2.getWidth() : 0);
                        C58739j4 j4Var = C58739j4.f168176a;
                        C58739j4.m68252m(j4Var, view, width, width3, 150, (C32226l) null, 16, (Object) null);
                        view.setTag(bool2);
                        PAGView pAGView = this.f36281E;
                        if (pAGView != null) {
                            C15440n nVar = C15440n.f41895a;
                            C58739j4.m68252m(j4Var, pAGView, width + nVar.mo14257f(), width3 + nVar.mo14257f(), 150, (C32226l) null, 16, (Object) null);
                        }
                    }
                    view2.postDelayed((Runnable) ((C36570n) this.f36284H).getValue(), 10000);
                    C0047e0 e0Var = C0047e0.f58a;
                    if (((C54991o) mo87696x0(C54991o.class)).f154287Z0 == 2) {
                        z3 = true;
                    }
                    e0Var.mo55c(true, z3, ((C55001u) mo87696x0(C55001u.class)).f154416j);
                    return;
                }
                return;
            }
            return;
        }
        C64321dp2 dp22 = this.f36277A;
        if ((dp22 != null ? dp22.f182792e : 0) > 0 || C0668l.m590f3((C0668l) mo87696x0(C0668l.class), (C64337e61) null, 1, (Object) null)) {
            PAGView pAGView2 = this.f36281E;
            if (pAGView2 != null && pAGView2.isPlaying()) {
                z3 = true;
            }
            if (z3) {
                PAGView pAGView3 = this.f36281E;
                if (pAGView3 != null) {
                    pAGView3.stop();
                }
                PAGView pAGView4 = this.f36281E;
                if (pAGView4 != null) {
                    pAGView4.setVisibility(8);
                }
                View view4 = this.f36293y;
                if (!(view4 == null || (viewTreeObserver = view4.getViewTreeObserver()) == null)) {
                    viewTreeObserver.removeOnGlobalLayoutListener((C12541n4) ((C36570n) this.f36283G).getValue());
                }
                View view5 = this.f36293y;
                if (view5 != null) {
                    Drawable drawable = this.f36282F;
                    if (drawable == null) {
                        drawable = this.f166287d.getContext().getResources().getDrawable(C0966R.C0969drawable.f5163yv);
                    }
                    view5.setBackground(drawable);
                }
            }
            if (z2) {
                mo12255j1(1);
                mo12251e1(true);
                this.f166287d.post(new C12696u4(this));
            } else if (this.f36280D != 3) {
                mo12255j1(1);
            }
        } else if (z2) {
            mo12255j1(2);
            mo12251e1(true);
            this.f166287d.post(new C12696u4(this));
        } else {
            if (this.f36280D != 3) {
                mo12255j1(2);
            }
            mo82893g0();
            View view6 = this.f36293y;
            if (view6 != null) {
                view6.postDelayed(new C12705v4(this, view6), 100);
            }
        }
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: h1 */
    public final void mo12254h1() {
        String str;
        int i;
        String str2;
        int i2;
        Class cls = C0668l.class;
        C64321dp2 dp22 = this.f36277A;
        int i3 = 0;
        if ((dp22 != null ? dp22.f182792e : 0) <= 0) {
            m12164i1(this, true);
            if (C0668l.m590f3((C0668l) mo87696x0(cls), (C64337e61) null, 1, (Object) null)) {
                TextView textView = this.f36289u;
                if (textView != null) {
                    textView.setVisibility(8);
                    return;
                }
                return;
            }
            TextView textView2 = this.f36289u;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            TextView textView3 = this.f36289u;
            if (textView3 != null) {
                textView3.setText(this.f166287d.getContext().getResources().getString(C0966R.string.dim));
                return;
            }
            return;
        }
        if ((dp22 != null ? dp22.f182792e : 0) < 60) {
            m12164i1(this, false);
            TextView textView4 = this.f36289u;
            if (textView4 != null) {
                textView4.setVisibility(0);
            }
            C64390ga1 ga12 = ((C0668l) mo87696x0(cls)).f1577j;
            int i4 = ga12 != null ? ga12.f183298g : 0;
            TextView textView5 = this.f36289u;
            if (textView5 != null) {
                if (i4 > 0) {
                    Resources resources = this.f166287d.getContext().getResources();
                    Object[] objArr = new Object[2];
                    objArr[0] = C72715f.m85111d(this.f166287d.getContext().getResources().getString(C0966R.string.n7v), (long) i4);
                    C64321dp2 dp23 = this.f36277A;
                    if (dp23 != null) {
                        i3 = dp23.f182792e;
                    }
                    objArr[1] = Integer.valueOf(i3);
                    str2 = resources.getString(C0966R.string.n7z, objArr);
                } else {
                    Resources resources2 = this.f166287d.getContext().getResources();
                    Object[] objArr2 = new Object[2];
                    C13677a aVar = C13677a.f38723a;
                    Context context = this.f166287d.getContext();
                    C87412m.m108593f(context, "root.context");
                    C64321dp2 dp24 = this.f36277A;
                    if (dp24 != null) {
                        i2 = dp24.f182793f;
                    } else {
                        C64390ga1 ga13 = ((C0668l) mo87696x0(cls)).f1577j;
                        i2 = ga13 != null ? ga13.f183296e : 0;
                    }
                    objArr2[0] = aVar.mo13062b(context, i2);
                    C64321dp2 dp25 = this.f36277A;
                    if (dp25 != null) {
                        i3 = dp25.f182792e;
                    }
                    objArr2[1] = Integer.valueOf(i3);
                    str2 = resources2.getString(C0966R.string.n7x, objArr2);
                }
                textView5.setText(str2);
                return;
            }
            return;
        }
        m12164i1(this, false);
        TextView textView6 = this.f36289u;
        if (textView6 != null) {
            textView6.setVisibility(0);
        }
        C64390ga1 ga14 = ((C0668l) mo87696x0(cls)).f1577j;
        int i5 = ga14 != null ? ga14.f183298g : 0;
        TextView textView7 = this.f36289u;
        if (textView7 != null) {
            if (i5 > 0) {
                str = this.f166287d.getContext().getResources().getString(C0966R.string.n7y, new Object[]{C72715f.m85111d(this.f166287d.getContext().getResources().getString(C0966R.string.n7v), (long) i5)});
            } else {
                Resources resources3 = this.f166287d.getContext().getResources();
                Object[] objArr3 = new Object[1];
                C13677a aVar2 = C13677a.f38723a;
                Context context2 = this.f166287d.getContext();
                C87412m.m108593f(context2, "root.context");
                C64321dp2 dp26 = this.f36277A;
                if (dp26 != null) {
                    i = dp26.f182793f;
                } else {
                    C64390ga1 ga15 = ((C0668l) mo87696x0(cls)).f1577j;
                    i = ga15 != null ? ga15.f183296e : 0;
                }
                objArr3[0] = aVar2.mo13062b(context2, i);
                str = resources3.getString(C0966R.string.n7w, objArr3);
            }
            textView7.setText(str);
        }
    }

    /* renamed from: j1 */
    public final void mo12255j1(int i) {
        TextView textView;
        this.f36280D = i;
        Log.m105924i("FinderLiveChargePayLazyPlugin", "update payStatus:" + i);
        int i2 = this.f36280D;
        if (i2 != 1) {
            if (i2 == 2) {
                TextView textView2 = this.f36294z;
                if (textView2 != null) {
                    textView2.setText(this.f166287d.getContext().getResources().getString(C0966R.string.f360545dj2));
                }
            } else if (i2 == 3 && (textView = this.f36294z) != null) {
                textView.setText(this.f166287d.getContext().getResources().getString(C0966R.string.dj4));
            }
        } else if (C0668l.m590f3((C0668l) mo87696x0(C0668l.class), (C64337e61) null, 1, (Object) null)) {
            TextView textView3 = this.f36294z;
            if (textView3 != null) {
                textView3.setText(this.f166287d.getContext().getResources().getString(C0966R.string.mqx));
            }
        } else {
            TextView textView4 = this.f36294z;
            if (textView4 != null) {
                textView4.setText(this.f166287d.getContext().getResources().getString(C0966R.string.f360545dj2));
            }
        }
    }

    /* renamed from: l1 */
    public final void mo12256l1(C64321dp2 dp22) {
        C87412m.m108594g(dp22, "info");
        this.f36277A = dp22;
        int i = dp22.f182792e;
        ((C0668l) mo87696x0(C0668l.class)).f1578n = i;
        if (this.f36279C) {
            if (i <= 0 && !mo87688G0()) {
                mo12250d1(false);
                C58124b.C7172a.m7372a(this.f36285q, C58124b.C58125b.FINDER_LIVE_CHARGE_FREE_TIME_OVER, (Bundle) null, 2, (Object) null);
            }
            mo12253g1(false, false);
            mo12254h1();
            C62042e eVar = C62042e.f176370a;
            eVar.mo86998D1("FinderLiveChargePayLazyPlugin", "updateTimer " + C63947a.f181274a.mo88731q(dp22) + " finish:" + mo87688G0());
        }
    }

    /* renamed from: m */
    public boolean mo3208m() {
        Class cls = C54991o.class;
        return ((C54991o) mo87696x0(cls)).f154287Z0 == 1 || ((C54991o) mo87696x0(cls)).f154287Z0 == 2;
    }

    /* renamed from: w0 */
    public void mo3211w0() {
        View view;
        ViewTreeObserver viewTreeObserver;
        View view2 = this.f36293y;
        if (view2 != null) {
            view2.removeCallbacks((Runnable) ((C36570n) this.f36284H).getValue());
        }
        PAGView pAGView = this.f36281E;
        if (pAGView != null) {
            pAGView.stop();
        }
        if (!(this.f36281E == null || (view = this.f36293y) == null || (viewTreeObserver = view.getViewTreeObserver()) == null)) {
            viewTreeObserver.removeOnGlobalLayoutListener((C12541n4) ((C36570n) this.f36283G).getValue());
        }
        PAGView pAGView2 = this.f36281E;
        if (pAGView2 != null) {
            pAGView2.setVisibility(8);
        }
    }
}
