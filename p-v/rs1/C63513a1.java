package rs1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C113200q;
import cm1.C55018j0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.api.SmileyPanel;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.tools.C45078p0;
import com.tencent.p014mm.p136ui.tools.KeyboardHeightProvider;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.appbrand.widget.input.C84975p1;
import com.tencent.p014mm.plugin.finder.bullet.MegaVideoBulletView;
import com.tencent.p014mm.plugin.finder.megavideo.p053ui.MegaVideoInputLayout;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.video.FinderFullSeekBarLayout;
import com.tencent.p014mm.plugin.finder.video.FinderVideoLayout;
import com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import er1.C58784w3;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gr1.C59667n2;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import he1.C59839b;
import he1.C59840c;
import he1.C59842e;
import he1.C59854m;
import it1.C9247b;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import kf1.C10008v1;
import nj3.C76912y0;
import o40.C61926c;
import ob0.C89132b;
import p001ak.C54053a;
import p006bk.C54484g;
import p248ug.C78160t0;
import p749xh.C66261f3;
import p871zj.C66846j;
import p871zj.C66856o;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import uo3.C78253a;
import up1.C37521f;
import z04.C112550d0;
import zh0.C16195a;

@C113200q(initialMode = 2)
/* renamed from: rs1.a1 */
public final class C63513a1 extends UIComponent implements C16195a {

    /* renamed from: v */
    public static final C63515b f180138v = new C63515b((C8480h) null);

    /* renamed from: w */
    public static final C13601g<Integer> f180139w = C36568h.m40985a(C13104a.f37312d);

    /* renamed from: d */
    public final C13601g f180140d = C36568h.m40985a(new C63514a0(this));

    /* renamed from: e */
    public int f180141e;

    /* renamed from: f */
    public C32226l<? super Integer, C13598b0> f180142f;

    /* renamed from: g */
    public final C13601g f180143g = C36568h.m40985a(new C63525j(this));

    /* renamed from: h */
    public C10008v1 f180144h;

    /* renamed from: i */
    public final C13601g f180145i;

    /* renamed from: j */
    public final C13601g f180146j;

    /* renamed from: n */
    public final C13601g f180147n;

    /* renamed from: o */
    public final ArrayList<View> f180148o;

    /* renamed from: p */
    public MegaVideoBulletView f180149p;

    /* renamed from: q */
    public boolean f180150q;

    /* renamed from: r */
    public long f180151r;

    /* renamed from: s */
    public C60905o f180152s;

    /* renamed from: t */
    public boolean f180153t;

    /* renamed from: u */
    public final C13601g f180154u;

    /* renamed from: rs1.a1$a */
    public static final class C13104a extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C13104a f37312d = new C13104a();

        public C13104a() {
            super(0);
        }

        public Object invoke() {
            C37521f.f99374d.getClass();
            return C37521f.f99362b5.mo60266n();
        }
    }

    /* renamed from: rs1.a1$n */
    public static final class C13105n implements View.OnKeyListener {

        /* renamed from: d */
        public final /* synthetic */ C32224a<C13598b0> f37313d;

        public C13105n(C32224a<C13598b0> aVar) {
            this.f37313d = aVar;
        }

        public final boolean onKey(View view, int i, KeyEvent keyEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(keyEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/viewmodel/component/FinderBulletUIC$refreshBulletLayout$1$2", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z", this, array);
            if (i == 66 && keyEvent.getAction() == 1) {
                this.f37313d.invoke();
            }
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderBulletUIC$refreshBulletLayout$1$2", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
            return false;
        }
    }

    /* renamed from: rs1.a1$v */
    public static final class C13106v implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C63513a1 f37314d;

        /* renamed from: e */
        public final /* synthetic */ C60905o f37315e;

        public C13106v(C63513a1 a1Var, C60905o oVar) {
            this.f37314d = a1Var;
            this.f37315e = oVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/viewmodel/component/FinderBulletUIC$refreshBulletLayout$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C63513a1.m74853e3(this.f37314d, this.f37315e, false, false, false, 14, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderBulletUIC$refreshBulletLayout$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: rs1.a1$w */
    public static final class C13107w implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C63513a1 f37316d;

        /* renamed from: e */
        public final /* synthetic */ C60905o f37317e;

        public C13107w(C63513a1 a1Var, C60905o oVar) {
            this.f37316d = a1Var;
            this.f37317e = oVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/viewmodel/component/FinderBulletUIC$refreshBulletLayout$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C63513a1.m74853e3(this.f37316d, this.f37317e, false, false, false, 12, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderBulletUIC$refreshBulletLayout$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: rs1.a1$z */
    public static final class C13108z extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ View f37318d;

        public C13108z(View view) {
            this.f37318d = view;
        }

        public void onAnimationEnd(Animator animator) {
            View view = this.f37318d;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(1.0f));
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderBulletUIC$restoreHiddenViews$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderBulletUIC$restoreHiddenViews$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
    }

    /* renamed from: rs1.a1$l */
    public static final class C36470l extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C36470l f97044d = new C36470l();

        public C36470l() {
            super(0);
        }

        public Object invoke() {
            C37521f.f99374d.getClass();
            int intValue = C37521f.f99388e5.mo60266n().intValue();
            if (intValue <= 0) {
                intValue = 2;
            }
            return Integer.valueOf(intValue);
        }
    }

    /* renamed from: rs1.a1$a0 */
    public static final class C63514a0 extends C87413o implements C32224a<SmileyPanel> {

        /* renamed from: d */
        public final /* synthetic */ C63513a1 f180155d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63514a0(C63513a1 a1Var) {
            super(0);
            this.f180155d = a1Var;
        }

        public Object invoke() {
            return C78160t0.m94372c(this.f180155d.getContext(), false);
        }
    }

    /* renamed from: rs1.a1$b */
    public static final class C63515b {
        public C63515b(C8480h hVar) {
        }

        /* renamed from: a */
        public static final int m74870a(C63515b bVar) {
            bVar.getClass();
            return ((Number) ((C36570n) C63513a1.f180139w).getValue()).intValue();
        }
    }

    /* renamed from: rs1.a1$c */
    public static final class C63516c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C60905o f180156d;

        /* renamed from: e */
        public final /* synthetic */ C55018j0 f180157e;

        /* renamed from: f */
        public final /* synthetic */ MegaVideoBulletView f180158f;

        public C63516c(C60905o oVar, C55018j0 j0Var, MegaVideoBulletView megaVideoBulletView) {
            this.f180156d = oVar;
            this.f180157e = j0Var;
            this.f180158f = megaVideoBulletView;
        }

        public final void run() {
            ((FinderVideoLayout) this.f180156d.mo85812D(C0966R.C0970id.d7a)).setBulletLifecycle(!this.f180157e.mo76076p0() ? null : this.f180158f.getPlayStatusListener());
        }
    }

    /* renamed from: rs1.a1$d */
    public static final class C63517d implements C66846j.C66848b {

        /* renamed from: a */
        public final /* synthetic */ C60905o f180159a;

        /* renamed from: b */
        public final /* synthetic */ C63513a1 f180160b;

        /* renamed from: c */
        public final /* synthetic */ C55018j0 f180161c;

        /* renamed from: d */
        public final /* synthetic */ MegaVideoBulletView f180162d;

        /* renamed from: rs1.a1$d$a */
        public static final class C63518a implements PopupWindow.OnDismissListener {

            /* renamed from: d */
            public final /* synthetic */ C59839b f180163d;

            /* renamed from: e */
            public final /* synthetic */ C59840c f180164e;

            /* renamed from: f */
            public final /* synthetic */ C54053a<?, ?> f180165f;

            /* renamed from: g */
            public final /* synthetic */ C60905o f180166g;

            /* renamed from: h */
            public final /* synthetic */ C63513a1 f180167h;

            public C63518a(C59839b bVar, C59840c cVar, C54053a<?, ?> aVar, C60905o oVar, C63513a1 a1Var) {
                this.f180163d = bVar;
                this.f180164e = cVar;
                this.f180165f = aVar;
                this.f180166g = oVar;
                this.f180167h = a1Var;
            }

            public final void onDismiss() {
                C59839b bVar = this.f180163d;
                int i = this.f180164e.f170850a.f138064j;
                bVar.f170847d.setBackground((Drawable) null);
                this.f180165f.f151366w = true;
                Object obj = (FinderFullSeekBarLayout) this.f180166g.mo85812D(C0966R.C0970id.eh4);
                if (obj == null) {
                    obj = this.f180166g.mo85812D(C0966R.C0970id.n9t);
                }
                if (obj != null) {
                    ((C59667n2) obj).mo4259i("exitBulletInput");
                }
                C63513a1 a1Var = this.f180167h;
                C63515b bVar2 = C63513a1.f180138v;
                a1Var.mo88367I3(false);
            }
        }

        /* renamed from: rs1.a1$d$b */
        public static final class C63519b extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ MegaVideoBulletView f180168d;

            /* renamed from: e */
            public final /* synthetic */ C54053a<?, ?> f180169e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C63519b(MegaVideoBulletView megaVideoBulletView, C54053a<?, ?> aVar) {
                super(0);
                this.f180168d = megaVideoBulletView;
                this.f180169e = aVar;
            }

            public Object invoke() {
                C66846j b = this.f180168d.getBulletManager().mo84815b();
                C54053a<?, ?> aVar = this.f180169e;
                C66856o oVar = (C66856o) b.f192019d.f191978G;
                for (int i = 0; i < oVar.f192033j; i++) {
                    C54053a<?, ?>[] aVarArr = oVar.f192035l;
                    if (aVarArr[i] == aVar) {
                        aVarArr[i] = null;
                    }
                }
                int size = ((ArrayList) oVar.f192036m).size();
                for (int i2 = 0; i2 < size; i2++) {
                    Iterator it = ((List) ((ArrayList) oVar.f192036m).get(i2)).iterator();
                    while (it.hasNext()) {
                        C54053a<?, ?> aVar2 = (C54053a) it.next();
                        if (aVar2 == aVar) {
                            it.remove();
                            oVar.f191958a--;
                            ((LinkedList) oVar.f191960c).add(aVar2);
                        }
                    }
                }
                return C13598b0.f38549a;
            }
        }

        public C63517d(C60905o oVar, C63513a1 a1Var, C55018j0 j0Var, MegaVideoBulletView megaVideoBulletView) {
            this.f180159a = oVar;
            this.f180160b = a1Var;
            this.f180161c = j0Var;
            this.f180162d = megaVideoBulletView;
        }

        /* JADX WARNING: Removed duplicated region for block: B:26:0x0170  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x0188  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x0191  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x01ad  */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x01b0  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x01de  */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x01e5  */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x021c A[ADDED_TO_REGION] */
        /* JADX WARNING: Removed duplicated region for block: B:69:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo84284a(p001ak.C54053a<?, ?> r25, p848dk.C58306h r26, p848dk.C58297b r27) {
            /*
                r24 = this;
                r0 = r24
                r7 = r25
                r1 = r26
                java.lang.String r2 = "danmaku"
                gy3.C87412m.m108594g(r7, r2)
                java.lang.String r2 = "touchPoint"
                gy3.C87412m.m108594g(r1, r2)
                DATA r2 = r7.f151367x
                java.lang.String r3 = "null cannot be cast to non-null type com.tencent.mm.plugin.finder.bullet.FinderBulletInfo"
                gy3.C87412m.m108592e(r2, r3)
                r3 = r2
                he1.c r3 = (he1.C59840c) r3
                rs1.s8$a r2 = rs1.C13442s8.f38060Q0
                jq3.o r4 = r0.f180159a
                android.content.Context r4 = r4.f173499A
                java.lang.String r5 = "holder.context"
                gy3.C87412m.m108593f(r4, r5)
                rs1.s8 r2 = r2.mo12873f(r4)
                if (r2 == 0) goto L_0x0032
                te3.hj1 r2 = r2.mo12861q3()
                r12 = r2
                goto L_0x0033
            L_0x0032:
                r12 = 0
            L_0x0033:
                float r2 = r1.f166951d
                float r4 = r7.f151363t
                r5 = 1073741824(0x40000000, float:2.0)
                float r4 = r4 / r5
                float r15 = r2 + r4
                float r2 = r1.f166952e
                float r4 = r7.f151364u
                float r14 = r2 + r4
                java.lang.String r2 = ", yOffset="
                java.lang.String r4 = "FinderBulletUIC"
                r5 = 0
                int r6 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
                if (r6 <= 0) goto L_0x026f
                int r5 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
                if (r5 > 0) goto L_0x0051
                goto L_0x026f
            L_0x0051:
                he1.j r16 = he1.C59853j.f170902a
                rs1.a1 r5 = r0.f180160b
                android.app.Activity r17 = r5.getContext()
                bl3.r r5 = bl3.C39818r.f106831a
                rs1.a1 r6 = r0.f180160b
                android.app.Activity r6 = r6.getContext()
                bl3.r$a r6 = r5.mo62443b(r6)
                java.lang.Class<rs1.s8> r9 = rs1.C13442s8.class
                androidx.lifecycle.i0 r6 = r6.mo75002a(r9)
                rs1.s8 r6 = (rs1.C13442s8) r6
                te3.hj1 r18 = r6.mo12861q3()
                r20 = 1
                org.json.JSONObject r6 = new org.json.JSONObject
                r6.<init>()
                cm1.j0 r9 = r0.f180161c
                te3.mj r10 = r3.f170850a
                long r10 = r10.f138058d
                java.lang.String r10 = o40.C61926c.m72691p(r10)
                java.lang.String r11 = "bs_id"
                r6.put(r11, r10)
                long r9 = r9.getItemId()
                java.lang.String r9 = o40.C61926c.m72691p(r9)
                java.lang.String r10 = "feedid"
                r6.put(r10, r9)
                rx3.b0 r9 = rx3.C13598b0.f38549a
                rs1.a1 r9 = r0.f180160b
                rs1.a1$b r10 = rs1.C63513a1.f180138v
                boolean r22 = r9.mo88378n3()
                te3.mj r9 = r3.f170850a
                int r9 = r9.f138064j
                java.lang.String r19 = "bullet_screen"
                r21 = r6
                r23 = r9
                r16.mo84811a(r17, r18, r19, r20, r21, r22, r23)
                boolean r6 = r7 instanceof p001ak.C54057e
                if (r6 == 0) goto L_0x00b3
                r6 = r7
                ak.e r6 = (p001ak.C54057e) r6
                goto L_0x00b4
            L_0x00b3:
                r6 = 0
            L_0x00b4:
                if (r6 == 0) goto L_0x026e
                rs1.a1 r9 = r0.f180160b
                jq3.o r10 = r0.f180159a
                com.tencent.mm.plugin.finder.bullet.MegaVideoBulletView r11 = r0.f180162d
                cm1.j0 r13 = r0.f180161c
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r0 = "danmakuClick: xOffset="
                r8.append(r0)
                r8.append(r15)
                r8.append(r2)
                r8.append(r14)
                java.lang.String r0 = ", info="
                r8.append(r0)
                r8.append(r3)
                java.lang.String r0 = ", touchPoint="
                r8.append(r0)
                r8.append(r1)
                java.lang.String r0 = ", feedId="
                r8.append(r0)
                long r0 = r9.f180151r
                java.lang.String r0 = o40.C61926c.m72691p(r0)
                r8.append(r0)
                java.lang.String r0 = r8.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
                ck.f$a r0 = r6.f151373E
                java.lang.String r1 = "null cannot be cast to non-null type com.tencent.mm.plugin.finder.bullet.BulletViewHolder"
                gy3.C87412m.m108592e(r0, r1)
                r2 = r0
                he1.b r2 = (he1.C59839b) r2
                te3.mj r0 = r3.f170850a
                int r0 = r0.f138064j
                android.view.View r0 = r2.f170847d
                r1 = 2131232358(0x7f080666, float:1.8080823E38)
                r0.setBackgroundResource(r1)
                r0 = 1
                r7.f151366w = r0
                r1 = 2131305309(0x7f09235d, float:1.8228785E38)
                android.view.View r1 = r10.mo85812D(r1)
                com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout r1 = (com.tencent.p014mm.plugin.finder.video.FinderFullSeekBarLayout) r1
                java.lang.String r4 = "bulletClick"
                r8 = 2
                r6 = 0
                if (r1 == 0) goto L_0x012b
                boolean r0 = r1.f17507V
                if (r0 != 0) goto L_0x0141
                r0 = 0
                gr1.C59667n2.C8415a.m8377a(r1, r4, r6, r8, r0)
                r1 = 1
                r9.mo88376l3(r10, r1)
                goto L_0x0141
            L_0x012b:
                r0 = 0
                r1 = 2131304472(0x7f092018, float:1.8227088E38)
                android.view.View r1 = r10.mo85812D(r1)
                com.tencent.mm.plugin.finder.video.FinderVideoGreenSeekBar r1 = (com.tencent.p014mm.plugin.finder.video.FinderVideoGreenSeekBar) r1
                if (r1 == 0) goto L_0x0141
                r16 = r14
                boolean r14 = r1.f17581y0
                if (r14 != 0) goto L_0x0143
                gr1.C59667n2.C8415a.m8377a(r1, r4, r6, r8, r0)
                goto L_0x0143
            L_0x0141:
                r16 = r14
            L_0x0143:
                he1.m r0 = r11.getBulletManager()
                zj.j r0 = r0.mo84815b()
                r1 = 1
                r0.mo90848g(r1)
                r0.mo90845d()
                androidx.appcompat.app.AppCompatActivity r0 = r9.getActivity()
                bl3.r$a r0 = r5.mo62444c(r0)
                java.lang.Class<rs1.y3> r1 = rs1.C13539y3.class
                bl3.t r0 = r0.mo62449e(r1)
                rs1.y3 r0 = (rs1.C13539y3) r0
                androidx.appcompat.app.AppCompatActivity r1 = r9.getActivity()
                java.lang.String r4 = "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity"
                gy3.C87412m.m108592e(r1, r4)
                r14 = r1
                com.tencent.mm.ui.MMFragmentActivity r14 = (com.tencent.p014mm.p136ui.MMFragmentActivity) r14
                if (r0 == 0) goto L_0x0185
                rs1.y3$a r1 = r0.mo12947e3()
                r4 = 2131302819(0x7f0919a3, float:1.8223735E38)
                android.view.View r1 = r1.findViewById(r4)
                if (r1 == 0) goto L_0x017f
                r1 = 1
                goto L_0x0180
            L_0x017f:
                r1 = 0
            L_0x0180:
                r4 = 1
                if (r1 != r4) goto L_0x0185
                r1 = 1
                goto L_0x0186
            L_0x0185:
                r1 = 0
            L_0x0186:
                if (r1 == 0) goto L_0x0191
                rs1.y3$a r0 = r0.mo12947e3()
                android.view.View r0 = r0.getBulletStubView()
                goto L_0x0198
            L_0x0191:
                r0 = 2131298489(0x7f0908b9, float:1.8214953E38)
                android.view.View r0 = r10.mo85812D(r0)
            L_0x0198:
                java.lang.String r1 = "if (orientationUIC?.isBu…(R.id.bullet_layout_stub)"
                gy3.C87412m.m108593f(r0, r1)
                te3.mj r5 = r3.f170850a
                boolean r17 = r9.mo88378n3()
                com.tencent.mm.plugin.finder.bullet.MegaVideoBulletView r1 = r9.f180149p
                if (r1 == 0) goto L_0x01b0
                he1.m r1 = r1.getBulletManager()
                if (r1 == 0) goto L_0x01b0
                long r6 = r1.f170907g
                goto L_0x01b2
            L_0x01b0:
                r6 = 0
            L_0x01b2:
                r1 = 1000(0x3e8, float:1.401E-42)
                r19 = r9
                long r8 = (long) r1
                long r6 = r6 / r8
                int r7 = (int) r6
                rs1.a1$d$a r8 = new rs1.a1$d$a
                r1 = r8
                r4 = r25
                r9 = r5
                r5 = r10
                r21 = 0
                r6 = r19
                r1.<init>(r2, r3, r4, r5, r6)
                rs1.a1$d$b r1 = new rs1.a1$d$b
                r2 = r25
                r1.<init>(r11, r2)
                java.lang.String r2 = "feed"
                gy3.C87412m.m108594g(r13, r2)
                java.lang.String r2 = "bulletInfo"
                gy3.C87412m.m108594g(r9, r2)
                he1.C59842e.f170856b = r21
                ob0.b<?> r2 = he1.C59842e.f170857c
                if (r2 == 0) goto L_0x01e1
                r2.mo85581g()
            L_0x01e1:
                it1.b r2 = he1.C59842e.f170858d
                if (r2 == 0) goto L_0x01e8
                r2.mo8913b()
            L_0x01e8:
                r2 = 0
                he1.C59842e.f170857c = r2
                he1.C59842e.f170858d = r2
                he1.i r2 = new he1.i
                r3 = r9
                r9 = r2
                r10 = r14
                r11 = r3
                r3 = r13
                r13 = r0
                r5 = r16
                r14 = r3
                r3 = r15
                r15 = r17
                r16 = r8
                r17 = r1
                r18 = r7
                r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)
                r1 = 2
                int[] r1 = new int[r1]
                r0.getLocationInWindow(r1)
                r4 = r1[r21]
                float r4 = (float) r4
                float r4 = r4 + r3
                int r3 = (int) r4
                r4 = 1
                r1 = r1[r4]
                float r1 = (float) r1
                float r1 = r1 + r5
                int r1 = (int) r1
                he1.g r4 = new he1.g
                r4.<init>(r8)
                if (r3 <= 0) goto L_0x026e
                if (r1 > 0) goto L_0x021f
                goto L_0x026e
            L_0x021f:
                uo3.a r5 = he1.C59842e.f170855a
                if (r5 == 0) goto L_0x0226
                r5.mo108266a()
            L_0x0226:
                uo3.a r5 = new uo3.a
                android.content.Context r6 = r0.getContext()
                r5.<init>(r6)
                r6 = 1
                r5.f229257z = r6
                r5.f229233I = r6
                r5.f229227C = r4
                he1.f r4 = he1.C76162f.f223095a
                r5.f229235K = r4
                he1.C59842e.f170855a = r5
                r5.f229251t = r2
                r5.f229240f = r0
                boolean r0 = r0 instanceof android.widget.TextView
                if (r0 != 0) goto L_0x024b
                if (r3 == 0) goto L_0x0248
                if (r1 != 0) goto L_0x024b
            L_0x0248:
                r5.mo108277l()
            L_0x024b:
                nj3.e0 r0 = r5.f229254w
                r0.clear()
                nj3.e0 r0 = r5.f229254w
                r2 = 5
                java.lang.String r4 = ""
                r6 = 2131755966(0x7f1003be, float:1.9142826E38)
                r7 = -1
                r0.mo107146h(r2, r4, r6, r7)
                r2 = 6
                r6 = 2131756091(0x7f10043b, float:1.914308E38)
                r0.mo107146h(r2, r4, r6, r7)
                if (r3 != 0) goto L_0x026b
                if (r1 != 0) goto L_0x026b
                r5.mo70679m()
                goto L_0x026e
            L_0x026b:
                r5.mo71743n(r3, r1)
            L_0x026e:
                return
            L_0x026f:
                r5 = r14
                r3 = r15
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "danmakuClick: error xOffset="
                r0.append(r1)
                r0.append(r3)
                r0.append(r2)
                r0.append(r5)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: rs1.C63513a1.C63517d.mo84284a(ak.a, dk.h, dk.b):void");
        }

        /* renamed from: b */
        public void mo84285b(List<C54053a<Object, C54484g>> list) {
        }

        /* renamed from: c */
        public void mo84286c(boolean z) {
        }
    }

    /* renamed from: rs1.a1$e */
    public static final class C63520e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ EditText f180170d;

        /* renamed from: e */
        public final /* synthetic */ C63513a1 f180171e;

        public C63520e(EditText editText, C63513a1 a1Var) {
            this.f180170d = editText;
            this.f180171e = a1Var;
        }

        public final void run() {
            this.f180170d.requestFocus();
            this.f180171e.mo88369K3();
        }
    }

    /* renamed from: rs1.a1$f */
    public static final class C63521f extends C87413o implements C32227p<Boolean, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60905o f180172d;

        /* renamed from: e */
        public final /* synthetic */ C63513a1 f180173e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63521f(C60905o oVar, C63513a1 a1Var) {
            super(2);
            this.f180172d = oVar;
            this.f180173e = a1Var;
        }

        public Object invoke(Object obj, Object obj2) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            int intValue = ((Number) obj2).intValue();
            int c = C75044y4.m89991c(this.f180172d.f173499A);
            boolean z = this.f180172d.f173499A.getResources().getConfiguration().orientation == 1;
            Log.m105924i("FinderBulletUIC", "onKeyboardChange: isShow=" + booleanValue + ", height=" + intValue + ", navigationBarHeight=" + c + ", isPortrait=" + z);
            if (booleanValue) {
                ChatFooterPanel j3 = this.f180173e.mo88375j3();
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, intValue);
                if (z) {
                    layoutParams.bottomMargin = c;
                } else {
                    layoutParams.setMarginEnd(c);
                }
                j3.setLayoutParams(layoutParams);
                this.f180173e.mo88379o3(false);
            } else {
                C63513a1 a1Var = this.f180173e;
                if (a1Var.f180141e == 1) {
                    ChatFooterPanel j35 = a1Var.mo88375j3();
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, 0);
                    if (z) {
                        layoutParams2.bottomMargin = c;
                    } else {
                        layoutParams2.setMarginEnd(c);
                    }
                    j35.setLayoutParams(layoutParams2);
                    MegaVideoInputLayout f3 = this.f180173e.mo88372f3();
                    if (f3 != null) {
                        f3.mo3457a();
                    }
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: rs1.a1$g */
    public static final class C63522g extends C87413o implements C32224a<LinearLayout> {

        /* renamed from: d */
        public final /* synthetic */ C63513a1 f180174d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63522g(C63513a1 a1Var) {
            super(0);
            this.f180174d = a1Var;
        }

        public Object invoke() {
            return (LinearLayout) this.f180174d.mo88373g3().findViewById(C0966R.C0970id.msd);
        }
    }

    /* renamed from: rs1.a1$h */
    public static final class C63523h extends C87413o implements C32224a<MegaVideoInputLayout> {

        /* renamed from: d */
        public final /* synthetic */ C63513a1 f180175d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63523h(C63513a1 a1Var) {
            super(0);
            this.f180175d = a1Var;
        }

        public Object invoke() {
            return (MegaVideoInputLayout) this.f180175d.mo88373g3().findViewById(C0966R.C0970id.msc);
        }
    }

    /* renamed from: rs1.a1$i */
    public static final class C63524i extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f180176d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63524i(AppCompatActivity appCompatActivity) {
            super(0);
            this.f180176d = appCompatActivity;
        }

        public Object invoke() {
            return C85868k2.m106137b(this.f180176d).inflate(C0966R.C0971layout.ctk, (ViewGroup) null);
        }
    }

    /* renamed from: rs1.a1$j */
    public static final class C63525j extends C87413o implements C32224a<KeyboardHeightProvider> {

        /* renamed from: d */
        public final /* synthetic */ C63513a1 f180177d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63525j(C63513a1 a1Var) {
            super(0);
            this.f180177d = a1Var;
        }

        public Object invoke() {
            return new KeyboardHeightProvider(this.f180177d.getContext());
        }
    }

    /* renamed from: rs1.a1$k */
    public static final class C63526k implements Animator.AnimatorListener {

        /* renamed from: d */
        public final /* synthetic */ C63513a1 f180178d;

        public C63526k(C63513a1 a1Var) {
            this.f180178d = a1Var;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            this.f180178d.mo88375j3().setAlpha(1.0f);
            this.f180178d.mo88375j3().setVisibility(4);
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: rs1.a1$m */
    public static final class C63527m implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ MMEditText f180179d;

        /* renamed from: e */
        public final /* synthetic */ C63513a1 f180180e;

        public C63527m(MMEditText mMEditText, C63513a1 a1Var) {
            this.f180179d = mMEditText;
            this.f180180e = a1Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/viewmodel/component/FinderBulletUIC$refreshBulletLayout$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f180179d.setShowSoftInputOnFocus(true);
            this.f180179d.requestFocus();
            C63513a1 a1Var = this.f180180e;
            C63515b bVar = C63513a1.f180138v;
            a1Var.mo88369K3();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderBulletUIC$refreshBulletLayout$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: rs1.a1$o */
    public static final class C63528o implements MMEditText.C74949b {

        /* renamed from: a */
        public final /* synthetic */ C63513a1 f180181a;

        /* renamed from: b */
        public final /* synthetic */ C60905o f180182b;

        public C63528o(C63513a1 a1Var, C60905o oVar) {
            this.f180181a = a1Var;
            this.f180182b = oVar;
        }

        /* renamed from: a */
        public final void mo65425a() {
            C63513a1.m74854k3(this.f180181a, this.f180182b, false, 2, (Object) null);
        }
    }

    /* renamed from: rs1.a1$p */
    public static final class C63529p implements View.OnFocusChangeListener {

        /* renamed from: d */
        public final /* synthetic */ MMEditText f180183d;

        /* renamed from: e */
        public final /* synthetic */ C63532s f180184e;

        public C63529p(MMEditText mMEditText, C63532s sVar) {
            this.f180183d = mMEditText;
            this.f180184e = sVar;
        }

        public final void onFocusChange(View view, boolean z) {
            if (z) {
                this.f180183d.addTextChangedListener(this.f180184e);
            } else {
                this.f180183d.removeTextChangedListener(this.f180184e);
            }
        }
    }

    /* renamed from: rs1.a1$q */
    public static final class C63530q implements ChatFooterPanel.C72719a {

        /* renamed from: a */
        public final /* synthetic */ MMEditText f180185a;

        /* renamed from: b */
        public final /* synthetic */ C32224a<C13598b0> f180186b;

        public C63530q(MMEditText mMEditText, C32224a<C13598b0> aVar) {
            this.f180185a = mMEditText;
            this.f180186b = aVar;
        }

        /* renamed from: a */
        public void mo64626a() {
            this.f180186b.invoke();
        }

        /* renamed from: b */
        public void mo64627b(String str) {
            this.f180185a.mo98046o(str);
        }

        /* renamed from: c */
        public void mo64628c() {
            this.f180185a.getInputConnection().sendKeyEvent(new KeyEvent(0, 67));
            this.f180185a.getInputConnection().sendKeyEvent(new KeyEvent(1, 67));
        }

        /* renamed from: d */
        public void mo64629d(boolean z) {
        }
    }

    /* renamed from: rs1.a1$r */
    public static final class C63531r extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ MMEditText f180187d;

        /* renamed from: e */
        public final /* synthetic */ C60905o f180188e;

        /* renamed from: f */
        public final /* synthetic */ C63513a1 f180189f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63531r(MMEditText mMEditText, C60905o oVar, C63513a1 a1Var) {
            super(0);
            this.f180187d = mMEditText;
            this.f180188e = oVar;
            this.f180189f = a1Var;
        }

        public Object invoke() {
            String str;
            C59854m bulletManager;
            String obj = this.f180187d.getText().toString();
            C63515b bVar = C63513a1.f180138v;
            boolean z = true;
            if (C45078p0.m49923b(C63515b.m74870a(bVar) * 2, obj) / 2 < 0) {
                Context context = this.f180188e.f173499A;
                C76912y0.makeText(context, (CharSequence) context.getString(C0966R.string.gqr, new Object[]{Integer.valueOf(C63515b.m74870a(bVar))}), 0).show();
            } else {
                String obj2 = C112550d0.m153799i0(obj).toString();
                if (obj2.length() > 0) {
                    C63513a1 a1Var = this.f180189f;
                    C60905o oVar = this.f180188e;
                    Object obj3 = oVar.f173503E;
                    C87412m.m108593f(obj3, "holder.getAssociatedObject()");
                    BaseFinderFeed baseFinderFeed = (BaseFinderFeed) obj3;
                    a1Var.getClass();
                    C58784w3 w3Var = C58784w3.f168295a;
                    FinderObject feedObject = baseFinderFeed.mo3513o().getFeedObject();
                    w3Var.getClass();
                    C87412m.m108594g(feedObject, C66261f3.COL_FINDEROBJECT);
                    if ((feedObject.permissionFlag & 2048) != 0) {
                        z = false;
                    }
                    if (!z) {
                        Context context2 = oVar.f173499A;
                        C87412m.m108593f(context2, "holder.context");
                        String string = oVar.f173499A.getString(C0966R.string.gqq);
                        C87412m.m108593f(string, "holder.context.getString…_bullet_has_closed_toast)");
                        w3Var.mo83879J1(context2, string);
                        Log.m105928w("FinderBulletUIC", "doPostBullet: this feed is close bullet, feedId=" + C61926c.m72691p(baseFinderFeed.getItemId()));
                    } else {
                        if (C87412m.m108589b(a1Var.mo88373g3().findViewById(C0966R.C0970id.mq5).getTag(), Boolean.FALSE)) {
                            Log.m105924i("FinderBulletUIC", "doPostBullet: reopen bullet switch feedId=" + C61926c.m72691p(baseFinderFeed.getItemId()) + ", isSelf=" + a1Var.mo88378n3());
                            str = "FinderBulletUIC";
                            C63513a1.m74853e3(a1Var, oVar, false, false, true, 4, (Object) null);
                        } else {
                            str = "FinderBulletUIC";
                        }
                        a1Var.f180150q = false;
                        Log.m105924i(str, "doPostBullet: post feedId=" + C61926c.m72691p(baseFinderFeed.getItemId()) + ", isSelf=" + a1Var.mo88378n3());
                        MegaVideoBulletView megaVideoBulletView = a1Var.f180149p;
                        if (!(megaVideoBulletView == null || (bulletManager = megaVideoBulletView.getBulletManager()) == null)) {
                            boolean n3 = a1Var.mo88378n3();
                            C59854m.C32869b bVar2 = C59854m.f170903r;
                            bulletManager.mo84819f(obj2, n3, 0, 0);
                        }
                    }
                    this.f180187d.setText((CharSequence) null);
                    C63513a1.m74854k3(this.f180189f, this.f180188e, false, 2, (Object) null);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: rs1.a1$s */
    public static final class C63532s implements TextWatcher {

        /* renamed from: d */
        public final /* synthetic */ TextView f180190d;

        /* renamed from: e */
        public final /* synthetic */ C60905o f180191e;

        /* renamed from: f */
        public final /* synthetic */ boolean f180192f;

        public C63532s(TextView textView, C60905o oVar, boolean z) {
            this.f180190d = textView;
            this.f180191e = oVar;
            this.f180192f = z;
        }

        public void afterTextChanged(Editable editable) {
            C87412m.m108594g(editable, "s");
            int b = C45078p0.m49923b(C63515b.m74870a(C63513a1.f180138v) * 2, editable.toString()) / 2;
            if (b >= 0 && b < 6) {
                TextView textView = this.f180190d;
                if (textView != null) {
                    textView.setVisibility(0);
                }
                TextView textView2 = this.f180190d;
                if (textView2 != null) {
                    textView2.setText(String.valueOf(b));
                }
                TextView textView3 = this.f180190d;
                if (textView3 != null) {
                    textView3.setTextColor(this.f180191e.f173499A.getResources().getColor(this.f180192f ? C0966R.color.BW_0_Alpha_0_5 : C0966R.color.f3583yg));
                }
            } else if (b < 0) {
                TextView textView4 = this.f180190d;
                if (textView4 != null) {
                    textView4.setVisibility(0);
                }
                TextView textView5 = this.f180190d;
                if (textView5 != null) {
                    textView5.setText(String.valueOf(b));
                }
                TextView textView6 = this.f180190d;
                if (textView6 != null) {
                    textView6.setTextColor(this.f180191e.f173499A.getResources().getColor(C0966R.color.Red_100));
                }
            } else {
                TextView textView7 = this.f180190d;
                if (textView7 != null) {
                    textView7.setVisibility(8);
                }
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: rs1.a1$t */
    public static final class C63533t implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C63513a1 f180193d;

        /* renamed from: e */
        public final /* synthetic */ C60905o f180194e;

        /* renamed from: f */
        public final /* synthetic */ boolean f180195f;

        public C63533t(C63513a1 a1Var, C60905o oVar, boolean z) {
            this.f180193d = a1Var;
            this.f180194e = oVar;
            this.f180195f = z;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/viewmodel/component/FinderBulletUIC$refreshBulletLayout$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C63513a1 a1Var = this.f180193d;
            C60905o oVar = this.f180194e;
            boolean z = this.f180195f;
            C63515b bVar = C63513a1.f180138v;
            a1Var.mo88371d3(oVar, z, false);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderBulletUIC$refreshBulletLayout$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: rs1.a1$u */
    public static final class C63534u implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C63513a1 f180196d;

        /* renamed from: e */
        public final /* synthetic */ C60905o f180197e;

        public C63534u(C63513a1 a1Var, C60905o oVar) {
            this.f180196d = a1Var;
            this.f180197e = oVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/viewmodel/component/FinderBulletUIC$refreshBulletLayout$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C63513a1 a1Var = this.f180196d;
            C60905o oVar = this.f180197e;
            C63515b bVar = C63513a1.f180138v;
            a1Var.mo88371d3(oVar, false, true);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderBulletUIC$refreshBulletLayout$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: rs1.a1$x */
    public static final class C63535x implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C63513a1 f180198d;

        /* renamed from: e */
        public final /* synthetic */ C60905o f180199e;

        public C63535x(C63513a1 a1Var, C60905o oVar) {
            this.f180198d = a1Var;
            this.f180199e = oVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/viewmodel/component/FinderBulletUIC$refreshBulletLayout$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C63513a1 a1Var = this.f180198d;
            C60905o oVar = this.f180199e;
            boolean z = false;
            boolean z2 = a1Var.f180141e != 2;
            a1Var.getClass();
            Log.m105924i("FinderBulletUIC", "onSmileyBtnClick: feedId=" + C61926c.m72691p(a1Var.f180151r) + "}, isShowSmiley=" + z2);
            WeImageView weImageView = (WeImageView) a1Var.mo88373g3().findViewById(C0966R.C0970id.mse);
            if (!z2) {
                a1Var.mo88379o3(false);
                a1Var.mo88369K3();
            } else {
                Log.m105924i("FinderBulletUIC", "onShowSmileyPanel: feedId=" + C61926c.m72691p(a1Var.f180151r) + '}');
                a1Var.mo88375j3().setVisibility(0);
                WeImageView weImageView2 = (WeImageView) a1Var.mo88373g3().findViewById(C0966R.C0970id.mse);
                if (weImageView2 != null) {
                    weImageView2.setImageResource(a1Var.f180153t ? C0966R.raw.icons_outlined_keyboard : C0966R.raw.icons_filled_keyboard);
                    weImageView2.setIconColor(a1Var.getContext().getResources().getColor(a1Var.f180153t ? C0966R.color.f3133gi : C0966R.color.f2975b6));
                }
                a1Var.mo88368J3(2);
                if (a1Var.mo88375j3().getLayoutParams().height == 0) {
                    int c = C75044y4.m89991c(a1Var.getActivity());
                    if (a1Var.getActivity().getResources().getConfiguration().orientation == 1) {
                        z = true;
                    }
                    int i = z ? a1Var.getActivity().getResources().getDisplayMetrics().heightPixels / 3 : a1Var.getActivity().getResources().getDisplayMetrics().heightPixels / 2;
                    ChatFooterPanel j3 = a1Var.mo88375j3();
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, i);
                    if (z) {
                        layoutParams.bottomMargin = c;
                    } else {
                        layoutParams.setMarginEnd(c);
                    }
                    j3.setLayoutParams(layoutParams);
                }
                a1Var.mo88375j3().setAlpha(0.0f);
                a1Var.mo88375j3().animate().alpha(1.0f).setDuration(220).setListener((Animator.AnimatorListener) null).start();
                Context context = oVar.f173499A;
                C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                ((MMActivity) context).hideVKB();
            }
            if (weImageView != null) {
                if (z2) {
                    weImageView.setImageResource(a1Var.f180153t ? C0966R.raw.icons_outlined_keyboard : C0966R.raw.icons_filled_keyboard);
                } else {
                    weImageView.setImageResource(a1Var.f180153t ? C0966R.raw.icons_outlined_sticker : C0966R.raw.icons_filled_sticker);
                }
                weImageView.setIconColor(a1Var.getContext().getResources().getColor(a1Var.f180153t ? C0966R.color.f3133gi : C0966R.color.f2975b6));
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderBulletUIC$refreshBulletLayout$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: rs1.a1$y */
    public static final class C63536y implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C63513a1 f180200d;

        /* renamed from: e */
        public final /* synthetic */ C60905o f180201e;

        public C63536y(C63513a1 a1Var, C60905o oVar) {
            this.f180200d = a1Var;
            this.f180201e = oVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/viewmodel/component/FinderBulletUIC$refreshBulletLayout$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C63513a1.m74854k3(this.f180200d, this.f180201e, false, 2, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderBulletUIC$refreshBulletLayout$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63513a1(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f180145i = C36568h.m40985a(new C63524i(appCompatActivity));
        this.f180146j = C36568h.m40985a(new C63522g(this));
        this.f180147n = C36568h.m40985a(new C63523h(this));
        this.f180148o = new ArrayList<>();
        this.f180154u = C36568h.m40985a(C36470l.f97044d);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00cd, code lost:
        if ((r10 != null && r10.mo76076p0()) != false) goto L_0x00d3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x023c  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01c2  */
    /* renamed from: e3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m74853e3(rs1.C63513a1 r25, jq3.C60905o r26, boolean r27, boolean r28, boolean r29, int r30, java.lang.Object r31) {
        /*
            r0 = r25
            r1 = r26
            r2 = r30 & 2
            r3 = 1
            if (r2 == 0) goto L_0x000b
            r2 = 1
            goto L_0x000d
        L_0x000b:
            r2 = r27
        L_0x000d:
            r4 = r30 & 4
            if (r4 == 0) goto L_0x0013
            r4 = 0
            goto L_0x0015
        L_0x0013:
            r4 = r28
        L_0x0015:
            r6 = 8
            r7 = r30 & 8
            if (r7 == 0) goto L_0x001d
            r7 = 0
            goto L_0x001f
        L_0x001d:
            r7 = r29
        L_0x001f:
            r25.getClass()
            java.lang.Class<rs1.s8> r8 = rs1.C13442s8.class
            java.lang.String r9 = "holder"
            gy3.C87412m.m108594g(r1, r9)
            android.view.View r9 = r25.mo88373g3()
            r10 = 2131302695(0x7f091927, float:1.8223483E38)
            android.view.View r9 = r9.findViewById(r10)
            java.lang.Object r10 = r1.f173503E
            boolean r11 = r10 instanceof cm1.C55018j0
            if (r11 == 0) goto L_0x003d
            cm1.j0 r10 = (cm1.C55018j0) r10
            goto L_0x003e
        L_0x003d:
            r10 = 0
        L_0x003e:
            java.lang.Object r11 = r9.getTag()
            java.lang.Boolean r13 = java.lang.Boolean.FALSE
            boolean r11 = gy3.C87412m.m108589b(r11, r13)
            f40.o r14 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r14 = r14.mo121142i()
            com.tencent.mm.storage.y1$a r15 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_FINDER_BULLET_SWITCH_BOOLEAN
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r11)
            r14.mo119677K(r15, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r14 = "bulletSwitchClick: feedId="
            r6.append(r14)
            long r14 = r0.f180151r
            java.lang.String r14 = o40.C61926c.m72691p(r14)
            r6.append(r14)
            java.lang.String r14 = "}, needFocus="
            r6.append(r14)
            r6.append(r2)
            java.lang.String r14 = ", turnOn="
            r6.append(r14)
            r6.append(r11)
            java.lang.String r6 = r6.toString()
            java.lang.String r14 = "FinderBulletUIC"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r6)
            com.tencent.mm.plugin.finder.bullet.MegaVideoBulletView r6 = r0.f180149p
            if (r6 == 0) goto L_0x008f
            he1.m r6 = r6.getBulletManager()
            goto L_0x0090
        L_0x008f:
            r6 = 0
        L_0x0090:
            android.view.View r14 = r25.mo88373g3()
            java.lang.String r15 = "bulletInputUI"
            gy3.C87412m.m108593f(r14, r15)
            r0.mo88366G3(r11, r14, r2)
            boolean r14 = r0.f180150q
            r15 = 2131305309(0x7f09235d, float:1.8228785E38)
            android.view.View r15 = r1.mo85812D(r15)
            com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout r15 = (com.tencent.p014mm.plugin.finder.video.FinderFullSeekBarLayout) r15
            if (r15 == 0) goto L_0x0116
            android.view.View r12 = r15.getBulletBtn()
            if (r10 == 0) goto L_0x00bb
            boolean r5 = r25.mo88378n3()
            boolean r5 = r10.mo76077q0(r5)
            if (r5 != r3) goto L_0x00bb
            r5 = 1
            goto L_0x00bc
        L_0x00bb:
            r5 = 0
        L_0x00bc:
            if (r5 != 0) goto L_0x00d3
            boolean r5 = r15.f17507V
            if (r5 == 0) goto L_0x00d0
            if (r10 == 0) goto L_0x00cc
            boolean r5 = r10.mo76076p0()
            if (r5 != r3) goto L_0x00cc
            r5 = 1
            goto L_0x00cd
        L_0x00cc:
            r5 = 0
        L_0x00cd:
            if (r5 == 0) goto L_0x00d0
            goto L_0x00d3
        L_0x00d0:
            r5 = 8
            goto L_0x00d4
        L_0x00d3:
            r5 = 0
        L_0x00d4:
            k20.a r15 = new k20.a
            r15.<init>()
            java.lang.ThreadLocal<k20.a> r16 = k20.C60958c.f173611a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r15.mo10233c(r5)
            java.lang.Object[] r17 = r15.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderBulletUIC"
            java.lang.String r19 = "bulletSwitchClick"
            java.lang.String r20 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;ZZZ)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r12
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            r5 = 0
            java.lang.Object r15 = r15.mo10231a(r5)
            java.lang.Integer r15 = (java.lang.Integer) r15
            int r5 = r15.intValue()
            r12.setVisibility(r5)
            java.lang.String r17 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderBulletUIC"
            java.lang.String r18 = "bulletSwitchClick"
            java.lang.String r19 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;ZZZ)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
        L_0x0116:
            r27 = r4
            r3 = 0
            if (r11 == 0) goto L_0x0164
            java.lang.Boolean r13 = java.lang.Boolean.TRUE
            r9.setTag(r13)
            if (r2 == 0) goto L_0x0126
            r25.mo88369K3()
        L_0x0126:
            if (r10 == 0) goto L_0x0144
            rx3.g r2 = r10.f154482g
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            he1.a r2 = (he1.C59838a) r2
            if (r2 == 0) goto L_0x0144
            boolean r9 = r2.f170844a
            if (r9 == 0) goto L_0x0144
            long r12 = r2.f170846c
            int r9 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r9 != 0) goto L_0x0144
            long r12 = eb0.C31543z5.m39453c()
            r2.f170846c = r12
        L_0x0144:
            if (r6 == 0) goto L_0x01a5
            r2 = 2131302685(0x7f09191d, float:1.8223463E38)
            android.view.View r9 = r1.mo85812D(r2)
            com.tencent.mm.plugin.finder.video.FinderVideoLayout r9 = (com.tencent.p014mm.plugin.finder.video.FinderVideoLayout) r9
            gr1.o2 r2 = r9.getVideoView()
            if (r2 == 0) goto L_0x015d
            boolean r2 = r2.isPlaying()
            if (r2 != 0) goto L_0x015d
            r2 = 1
            goto L_0x015e
        L_0x015d:
            r2 = 0
        L_0x015e:
            he1.m$b r9 = he1.C59854m.f170903r
            r6.mo84820g(r3, r2)
            goto L_0x01a5
        L_0x0164:
            r9.setTag(r13)
            if (r6 == 0) goto L_0x016c
            r6.mo84822i()
        L_0x016c:
            r5 = 1
            r0.mo88379o3(r5)
            if (r10 == 0) goto L_0x0198
            rx3.g r6 = r10.f154482g
            rx3.n r6 = (rx3.C36570n) r6
            java.lang.Object r6 = r6.getValue()
            he1.a r6 = (he1.C59838a) r6
            if (r6 == 0) goto L_0x0198
            boolean r9 = r6.f170844a
            if (r9 == 0) goto L_0x0194
            long r12 = r6.f170846c
            int r9 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r9 <= 0) goto L_0x0194
            long r12 = r6.f170845b
            long r15 = eb0.C31543z5.m39453c()
            long r3 = r6.f170846c
            long r15 = r15 - r3
            long r12 = r12 + r15
            r6.f170845b = r12
        L_0x0194:
            r3 = 0
            r6.f170846c = r3
        L_0x0198:
            if (r27 != 0) goto L_0x01a5
            if (r2 == 0) goto L_0x01a5
            jq3.o r2 = r0.f180152s
            r6 = 2
            r9 = 0
            r12 = 0
            m74854k3(r0, r2, r9, r6, r12)
            goto L_0x01a6
        L_0x01a5:
            r9 = 0
        L_0x01a6:
            androidx.appcompat.app.AppCompatActivity r2 = r25.getActivity()
            if (r11 == 0) goto L_0x01b0
            r6 = 2131826649(0x7f1117d9, float:1.9286188E38)
            goto L_0x01b3
        L_0x01b0:
            r6 = 2131826570(0x7f11178a, float:1.9286028E38)
        L_0x01b3:
            android.widget.Toast r2 = nj3.C76912y0.makeText((android.content.Context) r2, (int) r6, (int) r9)
            r2.show()
            java.lang.String r2 = "is_stop_feed"
            java.lang.String r6 = "click_video_time"
            java.lang.String r12 = "feedid"
            if (r27 == 0) goto L_0x023c
            he1.j r15 = he1.C59853j.f170902a
            android.app.Activity r16 = r25.getContext()
            bl3.r r7 = bl3.C39818r.f106831a
            android.app.Activity r0 = r25.getContext()
            bl3.r$a r0 = r7.mo62443b(r0)
            androidx.lifecycle.i0 r0 = r0.mo75002a(r8)
            rs1.s8 r0 = (rs1.C13442s8) r0
            te3.hj1 r17 = r0.mo12861q3()
            if (r11 != 0) goto L_0x01e2
            java.lang.String r0 = "share_menu_ignore_bullet_screen"
            goto L_0x01e5
        L_0x01e2:
            java.lang.String r0 = "share_menu_look_bullet_screen"
        L_0x01e5:
            r18 = r0
            r19 = 1
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            if (r10 == 0) goto L_0x01f4
            long r3 = r10.getItemId()
        L_0x01f4:
            java.lang.String r3 = o40.C61926c.m72691p(r3)
            r0.put(r12, r3)
            r3 = 2131302685(0x7f09191d, float:1.8223463E38)
            android.view.View r4 = r1.mo85812D(r3)
            com.tencent.mm.plugin.finder.video.FinderVideoLayout r4 = (com.tencent.p014mm.plugin.finder.video.FinderVideoLayout) r4
            if (r4 == 0) goto L_0x020b
            int r4 = r4.getCurrentPosSec()
            goto L_0x020c
        L_0x020b:
            r4 = 0
        L_0x020c:
            r0.put(r6, r4)
            if (r11 == 0) goto L_0x022b
            android.view.View r1 = r1.mo85812D(r3)
            com.tencent.mm.plugin.finder.video.FinderVideoLayout r1 = (com.tencent.p014mm.plugin.finder.video.FinderVideoLayout) r1
            if (r1 == 0) goto L_0x0227
            gr1.o2 r1 = r1.getVideoView()
            if (r1 == 0) goto L_0x0227
            boolean r1 = r1.isPlaying()
            if (r1 != 0) goto L_0x0227
            r3 = 1
            goto L_0x0228
        L_0x0227:
            r3 = 0
        L_0x0228:
            r0.put(r2, r3)
        L_0x022b:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            r21 = 0
            r22 = 0
            r23 = 64
            r24 = 0
            r20 = r0
            he1.C59853j.m69742b(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            goto L_0x02e4
        L_0x023c:
            if (r7 == 0) goto L_0x0285
            he1.j r1 = he1.C59853j.f170902a
            android.app.Activity r2 = r25.getContext()
            bl3.r r6 = bl3.C39818r.f106831a
            android.app.Activity r0 = r25.getContext()
            bl3.r$a r0 = r6.mo62443b(r0)
            androidx.lifecycle.i0 r0 = r0.mo75002a(r8)
            rs1.s8 r0 = (rs1.C13442s8) r0
            te3.hj1 r0 = r0.mo12861q3()
            r6 = 1
            org.json.JSONObject r7 = new org.json.JSONObject
            r7.<init>()
            if (r10 == 0) goto L_0x0264
            long r3 = r10.getItemId()
        L_0x0264:
            java.lang.String r3 = o40.C61926c.m72691p(r3)
            r7.put(r12, r3)
            java.lang.String r3 = "open_type"
            r4 = 1
            r7.put(r3, r4)
            rx3.b0 r3 = rx3.C13598b0.f38549a
            r8 = 0
            r9 = 0
            r10 = 64
            r11 = 0
            java.lang.String r4 = "already_show_bullet_screen"
            r3 = r0
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            he1.C59853j.m69742b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            goto L_0x02e4
        L_0x0285:
            he1.j r5 = he1.C59853j.f170902a
            android.app.Activity r13 = r25.getContext()
            bl3.r r7 = bl3.C39818r.f106831a
            android.app.Activity r0 = r25.getContext()
            bl3.r$a r0 = r7.mo62443b(r0)
            androidx.lifecycle.i0 r0 = r0.mo75002a(r8)
            rs1.s8 r0 = (rs1.C13442s8) r0
            te3.hj1 r0 = r0.mo12861q3()
            if (r11 != 0) goto L_0x02a4
            java.lang.String r7 = "ignore_bullet_screen"
            goto L_0x02a6
        L_0x02a4:
            java.lang.String r7 = "look_bullet_screen"
        L_0x02a6:
            r15 = r7
            r16 = 1
            org.json.JSONObject r7 = new org.json.JSONObject
            r7.<init>()
            if (r10 == 0) goto L_0x02b4
            long r3 = r10.getItemId()
        L_0x02b4:
            java.lang.String r3 = o40.C61926c.m72691p(r3)
            r7.put(r12, r3)
            r3 = 2131302685(0x7f09191d, float:1.8223463E38)
            android.view.View r1 = r1.mo85812D(r3)
            com.tencent.mm.plugin.finder.video.FinderVideoLayout r1 = (com.tencent.p014mm.plugin.finder.video.FinderVideoLayout) r1
            if (r1 == 0) goto L_0x02cb
            int r1 = r1.getCurrentPosSec()
            r9 = r1
        L_0x02cb:
            r7.put(r6, r9)
            if (r11 == 0) goto L_0x02d3
            r7.put(r2, r14)
        L_0x02d3:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            r18 = 0
            r19 = 0
            r20 = 64
            r21 = 0
            r12 = r5
            r14 = r0
            r17 = r7
            he1.C59853j.m69742b(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
        L_0x02e4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rs1.C63513a1.m74853e3(rs1.a1, jq3.o, boolean, boolean, boolean, int, java.lang.Object):void");
    }

    /* JADX WARNING: type inference failed for: r11v11, types: [android.view.ViewParent] */
    /* JADX WARNING: type inference failed for: r11v13, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: k3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m74854k3(rs1.C63513a1 r10, jq3.C60905o r11, boolean r12, int r13, java.lang.Object r14) {
        /*
            r13 = r13 & 2
            r14 = 0
            if (r13 == 0) goto L_0x0006
            r12 = 0
        L_0x0006:
            android.view.View r13 = r10.mo88373g3()
            if (r13 == 0) goto L_0x00df
            int r0 = r13.getVisibility()
            if (r0 == 0) goto L_0x0014
            goto L_0x00df
        L_0x0014:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "hideBulletInputLayout: feedId="
            r0.append(r1)
            long r1 = r10.f180151r
            java.lang.String r1 = o40.C61926c.m72691p(r1)
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FinderBulletUIC"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            boolean r0 = r10.f180150q
            r8 = 0
            if (r0 != 0) goto L_0x005c
            if (r11 == 0) goto L_0x0047
            r0 = 2131305309(0x7f09235d, float:1.8228785E38)
            android.view.View r0 = r11.mo85812D(r0)
            com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout r0 = (com.tencent.p014mm.plugin.finder.video.FinderFullSeekBarLayout) r0
            if (r0 != 0) goto L_0x0055
        L_0x0047:
            if (r11 == 0) goto L_0x0054
            r0 = 2131304472(0x7f092018, float:1.8227088E38)
            android.view.View r11 = r11.mo85812D(r0)
            r0 = r11
            com.tencent.mm.plugin.finder.video.FinderVideoGreenSeekBar r0 = (com.tencent.p014mm.plugin.finder.video.FinderVideoGreenSeekBar) r0
            goto L_0x0055
        L_0x0054:
            r0 = r8
        L_0x0055:
            if (r0 == 0) goto L_0x005c
            java.lang.String r11 = "exitBulletInput"
            r0.mo4259i(r11)
        L_0x005c:
            r10.f180150q = r14
            r11 = 8
            k20.a r9 = new k20.a
            r9.<init>()
            java.lang.ThreadLocal<k20.a> r0 = k20.C60958c.f173611a
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r9.mo10233c(r11)
            java.lang.Object[] r1 = r9.mo10232b()
            java.lang.String r2 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderBulletUIC"
            java.lang.String r3 = "hideBulletInputLayout"
            java.lang.String r4 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)Z"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setVisibility"
            java.lang.String r7 = "(I)V"
            r0 = r13
            j20.C117292a.m165358d(r0, r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object r11 = r9.mo10231a(r14)
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r13.setVisibility(r11)
            java.lang.String r1 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderBulletUIC"
            java.lang.String r2 = "hideBulletInputLayout"
            java.lang.String r3 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)Z"
            java.lang.String r4 = "android/view/View_EXEC_"
            java.lang.String r5 = "setVisibility"
            java.lang.String r6 = "(I)V"
            j20.C117292a.m165359e(r0, r1, r2, r3, r4, r5, r6)
            androidx.appcompat.app.AppCompatActivity r11 = r10.getActivity()
            java.lang.String r13 = "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity"
            gy3.C87412m.m108592e(r11, r13)
            com.tencent.mm.ui.MMActivity r11 = (com.tencent.p014mm.p136ui.MMActivity) r11
            r11.hideVKB()
            r10.mo88367I3(r12)
            r10.mo88379o3(r14)
            r10.mo88368J3(r14)
            com.tencent.mm.plugin.finder.megavideo.ui.MegaVideoInputLayout r11 = r10.mo88372f3()
            if (r11 == 0) goto L_0x00c0
            r11.mo3457a()
        L_0x00c0:
            com.tencent.mm.ui.tools.KeyboardHeightProvider r11 = r10.mo88374i3()
            r11.f220015b = r8
            com.tencent.mm.plugin.finder.megavideo.ui.MegaVideoInputLayout r11 = r10.mo88372f3()
            android.view.ViewParent r11 = r11.getParent()
            boolean r12 = r11 instanceof android.view.ViewGroup
            if (r12 == 0) goto L_0x00d5
            r8 = r11
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
        L_0x00d5:
            if (r8 == 0) goto L_0x00de
            android.view.View r10 = r10.mo88373g3()
            r8.removeView(r10)
        L_0x00de:
            r14 = 1
        L_0x00df:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: rs1.C63513a1.m74854k3(rs1.a1, jq3.o, boolean, int, java.lang.Object):boolean");
    }

    /* JADX WARNING: type inference failed for: r3v14, types: [android.view.View] */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ee, code lost:
        if ((r7 != null && r7.mo76076p0()) != false) goto L_0x00f4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: F3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo88365F3(jq3.C60905o r19, com.tencent.p014mm.plugin.finder.model.BaseFinderFeed r20, boolean r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            java.lang.Class<rs1.y3> r4 = rs1.C13539y3.class
            java.lang.String r5 = "holder"
            gy3.C87412m.m108594g(r1, r5)
            java.lang.String r5 = "item"
            gy3.C87412m.m108594g(r2, r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "refreshBulletLayout: isLightMode="
            r5.append(r6)
            r5.append(r3)
            java.lang.String r6 = ", feedId = "
            r5.append(r6)
            long r6 = r20.getItemId()
            java.lang.String r6 = o40.C61926c.m72691p(r6)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "FinderBulletUIC"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
            r0.f180153t = r3
            android.view.View r5 = r18.mo88373g3()
            r6 = 2131304846(0x7f09218e, float:1.8227846E38)
            android.view.View r5 = r5.findViewById(r6)
            com.tencent.mm.ui.widget.MMEditText r5 = (com.tencent.p014mm.p136ui.widget.MMEditText) r5
            r6 = 1
            if (r5 == 0) goto L_0x009f
            r5.setEnableSendBtn(r6)
            rs1.a1$r r7 = new rs1.a1$r
            r7.<init>(r5, r1, r0)
            android.view.View r8 = r18.mo88373g3()
            r9 = 2131304847(0x7f09218f, float:1.8227848E38)
            android.view.View r8 = r8.findViewById(r9)
            if (r8 == 0) goto L_0x0069
            rs1.a1$m r9 = new rs1.a1$m
            r9.<init>(r5, r0)
            r8.setOnClickListener(r9)
        L_0x0069:
            rs1.a1$n r8 = new rs1.a1$n
            r8.<init>(r7)
            r5.setOnKeyListener(r8)
            rs1.a1$o r8 = new rs1.a1$o
            r8.<init>(r0, r1)
            r5.setBackListener(r8)
            android.view.View r8 = r18.mo88373g3()
            r9 = 2131304855(0x7f092197, float:1.8227864E38)
            android.view.View r8 = r8.findViewById(r9)
            android.widget.TextView r8 = (android.widget.TextView) r8
            rs1.a1$s r9 = new rs1.a1$s
            r9.<init>(r8, r1, r3)
            rs1.a1$p r8 = new rs1.a1$p
            r8.<init>(r5, r9)
            r5.setOnFocusChangeListener(r8)
            com.tencent.mm.pluginsdk.ui.ChatFooterPanel r8 = r18.mo88375j3()
            rs1.a1$q r9 = new rs1.a1$q
            r9.<init>(r5, r7)
            r8.setOnTextOperationListener(r9)
        L_0x009f:
            r5 = 2131305309(0x7f09235d, float:1.8228785E38)
            android.view.View r5 = r1.mo85812D(r5)
            com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout r5 = (com.tencent.p014mm.plugin.finder.video.FinderFullSeekBarLayout) r5
            if (r5 == 0) goto L_0x00b0
            android.view.View r5 = r5.getBulletBtn()
            if (r5 != 0) goto L_0x00b7
        L_0x00b0:
            r5 = 2131304845(0x7f09218d, float:1.8227844E38)
            android.view.View r5 = r1.mo85812D(r5)
        L_0x00b7:
            r14 = 0
            if (r5 == 0) goto L_0x0145
            boolean r7 = r2 instanceof cm1.C55018j0
            if (r7 == 0) goto L_0x00c2
            r8 = r2
            cm1.j0 r8 = (cm1.C55018j0) r8
            goto L_0x00c3
        L_0x00c2:
            r8 = 0
        L_0x00c3:
            if (r8 == 0) goto L_0x00d1
            boolean r9 = r18.mo88378n3()
            boolean r8 = r8.mo76077q0(r9)
            if (r8 != r6) goto L_0x00d1
            r8 = 1
            goto L_0x00d2
        L_0x00d1:
            r8 = 0
        L_0x00d2:
            if (r8 != 0) goto L_0x00f4
            androidx.appcompat.app.AppCompatActivity r8 = r18.getActivity()
            boolean r8 = r8 instanceof com.tencent.p014mm.plugin.finder.feed.p052ui.FinderNewStyleTimelineUI
            if (r8 == 0) goto L_0x00f1
            if (r7 == 0) goto L_0x00e2
            r7 = r2
            cm1.j0 r7 = (cm1.C55018j0) r7
            goto L_0x00e3
        L_0x00e2:
            r7 = 0
        L_0x00e3:
            if (r7 == 0) goto L_0x00ed
            boolean r7 = r7.mo76076p0()
            if (r7 != r6) goto L_0x00ed
            r7 = 1
            goto L_0x00ee
        L_0x00ed:
            r7 = 0
        L_0x00ee:
            if (r7 == 0) goto L_0x00f1
            goto L_0x00f4
        L_0x00f1:
            r7 = 8
            goto L_0x00f5
        L_0x00f4:
            r7 = 0
        L_0x00f5:
            k20.a r13 = new k20.a
            r13.<init>()
            java.lang.ThreadLocal<k20.a> r8 = k20.C60958c.f173611a
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r13.mo10233c(r7)
            java.lang.Object[] r8 = r13.mo10232b()
            java.lang.String r9 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderBulletUIC"
            java.lang.String r10 = "refreshBulletLayout"
            java.lang.String r11 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Z)V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            r7 = r5
            r15 = r13
            r13 = r16
            r6 = 0
            r14 = r17
            j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.Object r7 = r15.mo10231a(r6)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r5.setVisibility(r7)
            java.lang.String r8 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderBulletUIC"
            java.lang.String r9 = "refreshBulletLayout"
            java.lang.String r10 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Z)V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            r7 = r5
            j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
            rs1.a1$t r7 = new rs1.a1$t
            r7.<init>(r0, r1, r3)
            r5.setOnClickListener(r7)
            goto L_0x0146
        L_0x0145:
            r6 = 0
        L_0x0146:
            bl3.r r3 = bl3.C39818r.f106831a
            androidx.appcompat.app.AppCompatActivity r5 = r18.getActivity()
            bl3.r$a r5 = r3.mo62444c(r5)
            bl3.t r5 = r5.mo62449e(r4)
            rs1.y3 r5 = (rs1.C13539y3) r5
            if (r5 == 0) goto L_0x0172
            rs1.y3$a r5 = r5.mo12947e3()
            if (r5 == 0) goto L_0x0172
            com.tencent.mm.plugin.finder.view.HorizontalVideoSeekBarLayout r5 = r5.getLongVideoSeekBarLayout()
            if (r5 == 0) goto L_0x0172
            android.view.View r5 = r5.getBulletBtnLayout()
            if (r5 == 0) goto L_0x0172
            rs1.a1$u r7 = new rs1.a1$u
            r7.<init>(r0, r1)
            r5.setOnClickListener(r7)
        L_0x0172:
            android.view.View r5 = r18.mo88373g3()
            r7 = 2131302695(0x7f091927, float:1.8223483E38)
            android.view.View r5 = r5.findViewById(r7)
            f40.o r7 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r7 = r7.mo121142i()
            com.tencent.mm.storage.y1$a r8 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_FINDER_BULLET_SWITCH_BOOLEAN
            r9 = 1
            boolean r7 = r7.mo119686g(r8, r9)
            android.view.View r8 = r18.mo88373g3()
            java.lang.String r9 = "bulletInputUI"
            gy3.C87412m.m108593f(r8, r9)
            r0.mo88366G3(r7, r8, r6)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r7)
            r5.setTag(r6)
            rs1.a1$v r6 = new rs1.a1$v
            r6.<init>(r0, r1)
            r5.setOnClickListener(r6)
            androidx.appcompat.app.AppCompatActivity r5 = r18.getActivity()
            bl3.r$a r3 = r3.mo62444c(r5)
            bl3.t r3 = r3.mo62449e(r4)
            rs1.y3 r3 = (rs1.C13539y3) r3
            if (r3 == 0) goto L_0x01d1
            rs1.y3$a r3 = r3.mo12947e3()
            if (r3 == 0) goto L_0x01d1
            com.tencent.mm.plugin.finder.view.HorizontalVideoSeekBarLayout r3 = r3.getLongVideoSeekBarLayout()
            if (r3 == 0) goto L_0x01d1
            android.widget.ImageView r3 = r3.getBulletSwitch()
            if (r3 == 0) goto L_0x01d1
            rs1.a1$w r4 = new rs1.a1$w
            r4.<init>(r0, r1)
            r3.setOnClickListener(r4)
        L_0x01d1:
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r20.mo3513o()
            boolean r3 = r3.isLongVideo()
            if (r3 == 0) goto L_0x01e6
            r3 = 2131302819(0x7f0919a3, float:1.8223735E38)
            android.view.View r3 = r1.mo85812D(r3)
            r15 = r3
            com.tencent.mm.plugin.finder.bullet.MegaVideoBulletView r15 = (com.tencent.p014mm.plugin.finder.bullet.MegaVideoBulletView) r15
            goto L_0x01e7
        L_0x01e6:
            r15 = 0
        L_0x01e7:
            r0.f180149p = r15
            long r3 = r20.getItemId()
            r0.f180151r = r3
            r0.f180152s = r1
            com.tencent.mm.plugin.finder.bullet.MegaVideoBulletView r3 = r0.f180149p
            if (r3 == 0) goto L_0x0221
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r20.mo3513o()
            boolean r2 = r2.isLongVideo()
            if (r2 == 0) goto L_0x0221
            androidx.appcompat.app.AppCompatActivity r2 = r18.getActivity()
            boolean r2 = r2 instanceof com.tencent.p014mm.plugin.finder.feed.p052ui.FinderNewStyleTimelineUI
            if (r2 == 0) goto L_0x0209
            r2 = 2
            goto L_0x0217
        L_0x0209:
            rx3.g r2 = r0.f180154u
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
        L_0x0217:
            he1.m r3 = r3.getBulletManager()
            he1.m$b r4 = he1.C59854m.f170903r
            r4 = 1
            r3.mo84821h(r2, r4)
        L_0x0221:
            android.view.View r2 = r18.mo88373g3()
            r3 = 2131304853(0x7f092195, float:1.822786E38)
            android.view.View r2 = r2.findViewById(r3)
            com.tencent.mm.ui.widget.imageview.WeImageView r2 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r2
            if (r2 == 0) goto L_0x0238
            rs1.a1$x r3 = new rs1.a1$x
            r3.<init>(r0, r1)
            r2.setOnClickListener(r3)
        L_0x0238:
            android.view.View r2 = r18.mo88373g3()
            rs1.a1$y r3 = new rs1.a1$y
            r3.<init>(r0, r1)
            r2.setOnClickListener(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rs1.C63513a1.mo88365F3(jq3.o, com.tencent.mm.plugin.finder.model.BaseFinderFeed, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0024, code lost:
        r3 = (r3 = r3.mo12947e3()).getLongVideoSeekBarLayout();
     */
    /* renamed from: G3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo88366G3(boolean r10, android.view.View r11, boolean r12) {
        /*
            r9 = this;
            java.lang.Class<rs1.y3> r0 = rs1.C13539y3.class
            r1 = 2131302695(0x7f091927, float:1.8223483E38)
            android.view.View r1 = r11.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            bl3.r r2 = bl3.C39818r.f106831a
            androidx.appcompat.app.AppCompatActivity r3 = r9.getActivity()
            bl3.r$a r3 = r2.mo62444c(r3)
            bl3.t r3 = r3.mo62449e(r0)
            rs1.y3 r3 = (rs1.C13539y3) r3
            r4 = 0
            if (r3 == 0) goto L_0x002f
            rs1.y3$a r3 = r3.mo12947e3()
            if (r3 == 0) goto L_0x002f
            com.tencent.mm.plugin.finder.view.HorizontalVideoSeekBarLayout r3 = r3.getLongVideoSeekBarLayout()
            if (r3 == 0) goto L_0x002f
            android.widget.ImageView r3 = r3.getBulletSwitch()
            goto L_0x0030
        L_0x002f:
            r3 = r4
        L_0x0030:
            androidx.appcompat.app.AppCompatActivity r5 = r9.getActivity()
            bl3.r$a r5 = r2.mo62444c(r5)
            bl3.t r5 = r5.mo62449e(r0)
            rs1.y3 r5 = (rs1.C13539y3) r5
            if (r5 == 0) goto L_0x0051
            rs1.y3$a r5 = r5.mo12947e3()
            if (r5 == 0) goto L_0x0051
            com.tencent.mm.plugin.finder.view.HorizontalVideoSeekBarLayout r5 = r5.getLongVideoSeekBarLayout()
            if (r5 == 0) goto L_0x0051
            android.widget.TextView r5 = r5.getBulletHintTv()
            goto L_0x0052
        L_0x0051:
            r5 = r4
        L_0x0052:
            androidx.appcompat.app.AppCompatActivity r6 = r9.getActivity()
            bl3.r$a r6 = r2.mo62444c(r6)
            bl3.t r0 = r6.mo62449e(r0)
            rs1.y3 r0 = (rs1.C13539y3) r0
            if (r0 == 0) goto L_0x0072
            rs1.y3$a r0 = r0.mo12947e3()
            if (r0 == 0) goto L_0x0072
            com.tencent.mm.plugin.finder.view.HorizontalVideoSeekBarLayout r0 = r0.getLongVideoSeekBarLayout()
            if (r0 == 0) goto L_0x0072
            android.view.View r4 = r0.getBulletBtnLayout()
        L_0x0072:
            r0 = 2131304853(0x7f092195, float:1.822786E38)
            android.view.View r0 = r11.findViewById(r0)
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r0
            if (r10 == 0) goto L_0x0081
            r6 = 2131755967(0x7f1003bf, float:1.9142828E38)
            goto L_0x0084
        L_0x0081:
            r6 = 2131755965(0x7f1003bd, float:1.9142824E38)
        L_0x0084:
            boolean r7 = r9.f180153t
            if (r7 == 0) goto L_0x00af
            boolean r7 = com.tencent.p014mm.p136ui.C85875k4.m106211z()
            r8 = 2131756237(0x7f1004cd, float:1.9143376E38)
            if (r10 == 0) goto L_0x0094
            if (r7 != 0) goto L_0x0094
            goto L_0x00ab
        L_0x0094:
            if (r10 == 0) goto L_0x009c
            if (r7 == 0) goto L_0x009c
            r8 = 2131756238(0x7f1004ce, float:1.9143378E38)
            goto L_0x00ab
        L_0x009c:
            if (r10 != 0) goto L_0x00a4
            if (r7 != 0) goto L_0x00a4
            r8 = 2131756235(0x7f1004cb, float:1.9143372E38)
            goto L_0x00ab
        L_0x00a4:
            if (r10 != 0) goto L_0x00ab
            if (r7 == 0) goto L_0x00ab
            r8 = 2131756236(0x7f1004cc, float:1.9143374E38)
        L_0x00ab:
            r1.setImageResource(r8)
            goto L_0x00b2
        L_0x00af:
            r1.setImageResource(r6)
        L_0x00b2:
            androidx.appcompat.app.AppCompatActivity r7 = r9.getActivity()
            bl3.r$a r2 = r2.mo62444c(r7)
            java.lang.Class<rs1.o6> r7 = rs1.C13354o6.class
            bl3.t r2 = r2.mo62449e(r7)
            rs1.o6 r2 = (rs1.C13354o6) r2
            if (r2 == 0) goto L_0x00e1
            com.tencent.mm.plugin.finder.feed.n r2 = r2.f37856d
            jq3.o r2 = r2.mo2931f()
            r7 = 2131304845(0x7f09218d, float:1.8227844E38)
            android.view.View r2 = r2.mo85812D(r7)
            com.tencent.mm.ui.widget.imageview.WeImageView r2 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r2
            if (r2 == 0) goto L_0x00e1
            if (r10 == 0) goto L_0x00db
            r7 = 2131756247(0x7f1004d7, float:1.9143396E38)
            goto L_0x00de
        L_0x00db:
            r7 = 2131756234(0x7f1004ca, float:1.914337E38)
        L_0x00de:
            r2.setImageResource(r7)
        L_0x00e1:
            if (r3 == 0) goto L_0x00e6
            r3.setImageResource(r6)
        L_0x00e6:
            r2 = 2131304846(0x7f09218e, float:1.8227846E38)
            android.view.View r11 = r11.findViewById(r2)
            com.tencent.mm.ui.widget.MMEditText r11 = (com.tencent.p014mm.p136ui.widget.MMEditText) r11
            boolean r2 = r9.mo88378n3()
            r6 = 8
            r7 = 0
            if (r3 != 0) goto L_0x00f9
            goto L_0x0102
        L_0x00f9:
            if (r2 == 0) goto L_0x00fe
            r8 = 8
            goto L_0x00ff
        L_0x00fe:
            r8 = 0
        L_0x00ff:
            r3.setVisibility(r8)
        L_0x0102:
            if (r2 == 0) goto L_0x0107
            r3 = 8
            goto L_0x0108
        L_0x0107:
            r3 = 0
        L_0x0108:
            r1.setVisibility(r3)
            if (r10 != 0) goto L_0x0125
            if (r2 == 0) goto L_0x0110
            goto L_0x0125
        L_0x0110:
            if (r4 != 0) goto L_0x0113
            goto L_0x0116
        L_0x0113:
            r4.setClickable(r7)
        L_0x0116:
            if (r5 == 0) goto L_0x011e
            r10 = 2131826658(0x7f1117e2, float:1.9286207E38)
            r5.setText(r10)
        L_0x011e:
            if (r5 != 0) goto L_0x0121
            goto L_0x014d
        L_0x0121:
            r5.setVisibility(r6)
            goto L_0x014d
        L_0x0125:
            r10 = 1
            if (r4 != 0) goto L_0x0129
            goto L_0x012c
        L_0x0129:
            r4.setClickable(r10)
        L_0x012c:
            r0.setEnabled(r10)
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.setAlpha(r1)
            r0 = 2131826659(0x7f1117e3, float:1.9286209E38)
            r11.setHint(r0)
            if (r5 == 0) goto L_0x013f
            r5.setText(r0)
        L_0x013f:
            if (r5 != 0) goto L_0x0142
            goto L_0x0145
        L_0x0142:
            r5.setVisibility(r7)
        L_0x0145:
            r11.setEnabled(r10)
            if (r12 == 0) goto L_0x014d
            r11.requestFocus()
        L_0x014d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rs1.C63513a1.mo88366G3(boolean, android.view.View, boolean):void");
    }

    /* renamed from: I3 */
    public final void mo88367I3(boolean z) {
        Log.m105924i("FinderBulletUIC", "restoreHiddenViews: feedId=" + C61926c.m72691p(this.f180151r) + '}');
        for (View view : this.f180148o) {
            if (view != null && view.getVisibility() == 8) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderBulletUIC", "restoreHiddenViews", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderBulletUIC", "restoreHiddenViews", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (z) {
                    view.animate().cancel();
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(Float.valueOf(0.0f));
                    C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderBulletUIC", "restoreHiddenViews", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderBulletUIC", "restoreHiddenViews", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view.animate().alpha(1.0f).setDuration(300).setListener(new C13108z(view)).start();
                }
            }
        }
        this.f180148o.clear();
    }

    /* renamed from: J3 */
    public final void mo88368J3(int i) {
        C32226l<? super Integer, C13598b0> lVar = this.f180142f;
        if (lVar != null) {
            lVar.invoke(Integer.valueOf(i));
        }
        this.f180141e = i;
    }

    /* renamed from: K3 */
    public final void mo88369K3() {
        EditText editText = (EditText) mo88373g3().findViewById(C0966R.C0970id.msa);
        if (editText != null) {
            InputMethodManager b = C84975p1.m104767b(editText);
            if (!b.showSoftInput(editText, 1)) {
                b.showSoftInput(editText, 2);
                return;
            }
            return;
        }
        AppCompatActivity activity = getActivity();
        C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((MMActivity) activity).showVKB();
    }

    /* renamed from: c3 */
    public final void mo88370c3(C60905o oVar, C10008v1 v1Var, boolean z) {
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(v1Var, "contract");
        this.f180144h = v1Var;
        Object obj = oVar.f173503E;
        C55018j0 j0Var = obj instanceof C55018j0 ? (C55018j0) obj : null;
        if (j0Var != null) {
            View D = oVar.mo85812D(C0966R.C0970id.mq7);
            if (D != null && z) {
                int f = C75044y4.m89994f(getActivity());
                ViewGroup.LayoutParams layoutParams = D.getLayoutParams();
                C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = f + getActivity().getResources().getDimensionPixelOffset(C0966R.dimen.avv);
                D.requestLayout();
            }
            MegaVideoBulletView megaVideoBulletView = (MegaVideoBulletView) oVar.mo85812D(C0966R.C0970id.mq8);
            if (megaVideoBulletView != null) {
                boolean z2 = false;
                if (!j0Var.mo76076p0()) {
                    megaVideoBulletView.setVisibility(8);
                } else {
                    megaVideoBulletView.setVisibility(0);
                    z2 = true;
                }
                Log.m105924i("FinderBulletUIC", "bindBullet: feedId=" + C61926c.m72691p(j0Var.getItemId()) + "}, isShowBullet=" + z2);
                megaVideoBulletView.setFeed(j0Var);
                megaVideoBulletView.post(new C63516c(oVar, j0Var, megaVideoBulletView));
                megaVideoBulletView.getBulletManager().f170910j = new C63517d(oVar, this, j0Var, megaVideoBulletView);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0051, code lost:
        r9 = r9.getVideoView();
     */
    /* renamed from: d3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo88371d3(jq3.C60905o r22, boolean r23, boolean r24) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r24
            java.lang.Class<rs1.y3> r4 = rs1.C13539y3.class
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "bulletBtnClick: isLightMode="
            r5.append(r6)
            r5.append(r2)
            java.lang.String r6 = ", isLand="
            r5.append(r6)
            r5.append(r3)
            java.lang.String r6 = ", feedId="
            r5.append(r6)
            java.lang.Object r6 = r1.f173503E
            cm1.i2 r6 = (cm1.C0740i2) r6
            long r6 = r6.getItemId()
            java.lang.String r6 = o40.C61926c.m72691p(r6)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "FinderBulletUIC"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
            r5 = 1
            r0.mo88368J3(r5)
            r0.f180153t = r2
            r6 = 2131302685(0x7f09191d, float:1.8223463E38)
            r7 = 0
            r8 = 0
            if (r3 != 0) goto L_0x00af
            android.view.View r9 = r1.mo85812D(r6)
            com.tencent.mm.plugin.finder.video.FinderVideoLayout r9 = (com.tencent.p014mm.plugin.finder.video.FinderVideoLayout) r9
            if (r9 == 0) goto L_0x005f
            gr1.o2 r9 = r9.getVideoView()
            if (r9 == 0) goto L_0x005f
            boolean r9 = r9.isPlaying()
            if (r9 != 0) goto L_0x005f
            r9 = 1
            goto L_0x0060
        L_0x005f:
            r9 = 0
        L_0x0060:
            if (r9 == 0) goto L_0x00af
            java.lang.Object r9 = r1.f173503E
            boolean r10 = r9 instanceof cm1.C55018j0
            if (r10 == 0) goto L_0x006b
            cm1.j0 r9 = (cm1.C55018j0) r9
            goto L_0x006c
        L_0x006b:
            r9 = r7
        L_0x006c:
            he1.j r10 = he1.C59853j.f170902a
            android.app.Activity r11 = r21.getContext()
            bl3.r r12 = bl3.C39818r.f106831a
            android.app.Activity r13 = r21.getContext()
            bl3.r$a r12 = r12.mo62443b(r13)
            java.lang.Class<rs1.s8> r13 = rs1.C13442s8.class
            androidx.lifecycle.i0 r12 = r12.mo75002a(r13)
            rs1.s8 r12 = (rs1.C13442s8) r12
            te3.hj1 r12 = r12.mo12861q3()
            r14 = 1
            org.json.JSONObject r15 = new org.json.JSONObject
            r15.<init>()
            if (r9 == 0) goto L_0x0095
            long r16 = r9.getItemId()
            goto L_0x0097
        L_0x0095:
            r16 = 0
        L_0x0097:
            java.lang.String r9 = o40.C61926c.m72691p(r16)
            java.lang.String r13 = "feedid"
            r15.put(r13, r9)
            rx3.b0 r9 = rx3.C13598b0.f38549a
            r16 = 0
            r17 = 0
            r18 = 64
            r19 = 0
            java.lang.String r13 = "bullet_screen_button"
            he1.C59853j.m69742b(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
        L_0x00af:
            android.view.View r9 = r21.mo88373g3()
            android.view.ViewParent r9 = r9.getParent()
            if (r9 == 0) goto L_0x00d2
            android.view.View r9 = r21.mo88373g3()
            android.view.ViewParent r9 = r9.getParent()
            boolean r10 = r9 instanceof android.view.ViewGroup
            if (r10 == 0) goto L_0x00c8
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            goto L_0x00c9
        L_0x00c8:
            r9 = r7
        L_0x00c9:
            if (r9 == 0) goto L_0x00d2
            android.view.View r10 = r21.mo88373g3()
            r9.removeView(r10)
        L_0x00d2:
            androidx.appcompat.app.AppCompatActivity r9 = r21.getActivity()
            android.view.Window r9 = r9.getWindow()
            android.view.View r9 = r9.getDecorView()
            java.lang.String r10 = "null cannot be cast to non-null type android.view.ViewGroup"
            gy3.C87412m.m108592e(r9, r10)
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            android.view.View r11 = r21.mo88373g3()
            r9.addView(r11)
            r9 = 2131305309(0x7f09235d, float:1.8228785E38)
            android.view.View r9 = r1.mo85812D(r9)
            com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout r9 = (com.tencent.p014mm.plugin.finder.video.FinderFullSeekBarLayout) r9
            if (r9 != 0) goto L_0x00fe
            r9 = 2131304472(0x7f092018, float:1.8227088E38)
            android.view.View r9 = r1.mo85812D(r9)
        L_0x00fe:
            if (r9 == 0) goto L_0x010c
            gr1.n2 r9 = (gr1.C59667n2) r9
            boolean r11 = r9.mo4264n()
            r0.f180150q = r11
            r11 = 3
            gr1.C59667n2.C8415a.m8377a(r9, r7, r8, r11, r7)
        L_0x010c:
            com.tencent.mm.ui.tools.KeyboardHeightProvider r9 = r21.mo88374i3()
            com.tencent.mm.plugin.finder.megavideo.ui.MegaVideoInputLayout r11 = r21.mo88372f3()
            r9.f220015b = r11
            com.tencent.mm.ui.tools.KeyboardHeightProvider r9 = r21.mo88374i3()
            r9.mo104022e()
            bl3.r r9 = bl3.C39818r.f106831a
            androidx.appcompat.app.AppCompatActivity r11 = r21.getActivity()
            bl3.r$a r11 = r9.mo62444c(r11)
            bl3.t r11 = r11.mo62449e(r4)
            rs1.y3 r11 = (rs1.C13539y3) r11
            if (r11 == 0) goto L_0x0144
            rs1.y3$a r11 = r11.mo12947e3()
            if (r11 == 0) goto L_0x0144
            com.tencent.mm.plugin.finder.view.HorizontalVideoSeekBarLayout r11 = r11.getLongVideoSeekBarLayout()
            if (r11 == 0) goto L_0x0144
            com.tencent.mm.plugin.finder.video.FinderLongVideoPlayerSeekBar r11 = r11.getLongVideoSeekBar()
            if (r11 == 0) goto L_0x0144
            r11.setIsPlay(r8)
        L_0x0144:
            android.view.View r11 = r21.mo88373g3()
            k20.a r15 = new k20.a
            r15.<init>()
            java.lang.ThreadLocal<k20.a> r12 = k20.C60958c.f173611a
            java.lang.Integer r12 = java.lang.Integer.valueOf(r8)
            r15.mo10233c(r12)
            java.lang.Object[] r13 = r15.mo10232b()
            java.lang.String r14 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderBulletUIC"
            java.lang.String r16 = "bulletBtnClick"
            java.lang.String r17 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;ZZ)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            r12 = r11
            r6 = r15
            r15 = r16
            r16 = r17
            r17 = r18
            r18 = r19
            r19 = r20
            j20.C117292a.m165358d(r12, r13, r14, r15, r16, r17, r18, r19)
            java.lang.Object r6 = r6.mo10231a(r8)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r11.setVisibility(r6)
            java.lang.String r13 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderBulletUIC"
            java.lang.String r14 = "bulletBtnClick"
            java.lang.String r15 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;ZZ)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            j20.C117292a.m165359e(r12, r13, r14, r15, r16, r17, r18)
            android.view.View r6 = r21.mo88373g3()
            android.view.ViewPropertyAnimator r6 = r6.animate()
            r6.cancel()
            android.view.View r6 = r21.mo88373g3()
            r11 = 1065353216(0x3f800000, float:1.0)
            k20.a r15 = new k20.a
            r15.<init>()
            java.lang.Float r11 = java.lang.Float.valueOf(r11)
            r15.mo10233c(r11)
            java.lang.Object[] r12 = r15.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderBulletUIC"
            java.lang.String r14 = "bulletBtnClick"
            java.lang.String r16 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;ZZ)V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setAlpha"
            java.lang.String r19 = "(F)V"
            r11 = r6
            r7 = r15
            r15 = r16
            r16 = r17
            r17 = r18
            r18 = r19
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r7 = r7.mo10231a(r8)
            java.lang.Float r7 = (java.lang.Float) r7
            float r7 = r7.floatValue()
            r6.setAlpha(r7)
            java.lang.String r12 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderBulletUIC"
            java.lang.String r13 = "bulletBtnClick"
            java.lang.String r14 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;ZZ)V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setAlpha"
            java.lang.String r17 = "(F)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
            android.view.View r6 = r21.mo88373g3()
            r7 = 2131304846(0x7f09218e, float:1.8227846E38)
            android.view.View r6 = r6.findViewById(r7)
            android.widget.EditText r6 = (android.widget.EditText) r6
            if (r6 == 0) goto L_0x0205
            r6.setFocusableInTouchMode(r5)
            rs1.a1$e r5 = new rs1.a1$e
            r5.<init>(r6, r0)
            r6.post(r5)
        L_0x0205:
            android.view.View r5 = r21.mo88373g3()
            r6 = 2131302695(0x7f091927, float:1.8223483E38)
            android.view.View r5 = r5.findViewById(r6)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            if (r3 != 0) goto L_0x021d
            boolean r11 = r21.mo88378n3()
            if (r11 == 0) goto L_0x021b
            goto L_0x021d
        L_0x021b:
            r11 = 0
            goto L_0x021f
        L_0x021d:
            r11 = 8
        L_0x021f:
            r5.setVisibility(r11)
            android.app.Activity r5 = r21.getContext()
            android.content.res.Resources r5 = r5.getResources()
            if (r3 == 0) goto L_0x0230
            r11 = 2131165355(0x7f0700ab, float:1.7944925E38)
            goto L_0x0233
        L_0x0230:
            r11 = 2131165371(0x7f0700bb, float:1.7944957E38)
        L_0x0233:
            int r5 = r5.getDimensionPixelOffset(r11)
            com.tencent.mm.plugin.finder.megavideo.ui.MegaVideoInputLayout r11 = r21.mo88372f3()
            int r12 = r11.getPaddingTop()
            int r13 = r11.getPaddingBottom()
            r11.setPadding(r5, r12, r5, r13)
            android.view.View r5 = r21.mo88373g3()
            android.view.View r5 = r5.findViewById(r7)
            android.widget.EditText r5 = (android.widget.EditText) r5
            r7 = 2131100932(0x7f060504, float:1.781426E38)
            if (r2 == 0) goto L_0x0291
            com.tencent.mm.plugin.finder.megavideo.ui.MegaVideoInputLayout r11 = r21.mo88372f3()
            android.app.Activity r12 = r21.getContext()
            android.content.res.Resources r12 = r12.getResources()
            r13 = 2131099724(0x7f06004c, float:1.781181E38)
            int r12 = r12.getColor(r13)
            r11.setBackgroundColor(r12)
            android.app.Activity r11 = r21.getContext()
            android.content.res.Resources r11 = r11.getResources()
            r12 = 2131099682(0x7f060022, float:1.7811724E38)
            int r11 = r11.getColor(r12)
            r5.setTextColor(r11)
            android.app.Activity r11 = r21.getContext()
            android.content.res.Resources r11 = r11.getResources()
            r12 = 2131099669(0x7f060015, float:1.7811698E38)
            int r11 = r11.getColor(r12)
            r5.setHintTextColor(r11)
            r12 = 0
            goto L_0x02ba
        L_0x0291:
            com.tencent.mm.plugin.finder.megavideo.ui.MegaVideoInputLayout r11 = r21.mo88372f3()
            r12 = 0
            r11.setBackground(r12)
            android.app.Activity r11 = r21.getContext()
            android.content.res.Resources r11 = r11.getResources()
            r13 = 2131100935(0x7f060507, float:1.7814265E38)
            int r11 = r11.getColor(r13)
            r5.setTextColor(r11)
            android.app.Activity r11 = r21.getContext()
            android.content.res.Resources r11 = r11.getResources()
            int r11 = r11.getColor(r7)
            r5.setHintTextColor(r11)
        L_0x02ba:
            com.tencent.mm.plugin.finder.megavideo.ui.MegaVideoInputLayout r5 = r21.mo88372f3()
            r11 = 2131304855(0x7f092197, float:1.8227864E38)
            android.view.View r5 = r5.findViewById(r11)
            android.widget.TextView r5 = (android.widget.TextView) r5
            android.app.Activity r11 = r21.getContext()
            android.content.res.Resources r11 = r11.getResources()
            if (r2 == 0) goto L_0x02d4
            r7 = 2131099674(0x7f06001a, float:1.7811708E38)
        L_0x02d4:
            int r7 = r11.getColor(r7)
            r5.setTextColor(r7)
            android.view.View r5 = r21.mo88373g3()
            r7 = 2131304853(0x7f092195, float:1.822786E38)
            android.view.View r5 = r5.findViewById(r7)
            com.tencent.mm.ui.widget.imageview.WeImageView r5 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r5
            if (r5 == 0) goto L_0x030e
            android.app.Activity r7 = r21.getContext()
            android.content.res.Resources r7 = r7.getResources()
            if (r2 == 0) goto L_0x02f8
            r11 = 2131100168(0x7f060208, float:1.781271E38)
            goto L_0x02fb
        L_0x02f8:
            r11 = 2131099940(0x7f060124, float:1.7812247E38)
        L_0x02fb:
            int r7 = r7.getColor(r11)
            r5.setIconColor(r7)
            if (r2 == 0) goto L_0x0308
            r7 = 2131756457(0x7f1005a9, float:1.9143822E38)
            goto L_0x030b
        L_0x0308:
            r7 = 2131756168(0x7f100488, float:1.9143236E38)
        L_0x030b:
            r5.setImageResource(r7)
        L_0x030e:
            android.view.View r5 = r21.mo88373g3()
            r7 = 2131304847(0x7f09218f, float:1.8227848E38)
            android.view.View r5 = r5.findViewById(r7)
            if (r2 == 0) goto L_0x031f
            r2 = 2131233741(0x7f080bcd, float:1.8083628E38)
            goto L_0x0322
        L_0x031f:
            r2 = 2131233740(0x7f080bcc, float:1.8083626E38)
        L_0x0322:
            r5.setBackgroundResource(r2)
            com.tencent.mm.plugin.finder.bullet.MegaVideoBulletView r2 = r0.f180149p
            if (r2 == 0) goto L_0x0366
            he1.m r2 = r2.getBulletManager()
            if (r2 == 0) goto L_0x0366
            r5 = 2131302685(0x7f09191d, float:1.8223463E38)
            android.view.View r5 = r1.mo85812D(r5)
            com.tencent.mm.plugin.finder.video.FinderVideoLayout r5 = (com.tencent.p014mm.plugin.finder.video.FinderVideoLayout) r5
            long r13 = r5.getCurrentPosMs()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "recordClickBulletBtnTime: videoTimeMs="
            r5.append(r7)
            r5.append(r13)
            java.lang.String r7 = ", currentTime="
            r5.append(r7)
            long r6 = r2.f170907g
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "FinderBulletManager"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
            long r5 = r2.f170907g
            int r7 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0363
            goto L_0x0364
        L_0x0363:
            r13 = r5
        L_0x0364:
            r2.f170911n = r13
        L_0x0366:
            rx3.g r2 = r0.f180146j
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            if (r2 == 0) goto L_0x03ab
            com.tencent.mm.pluginsdk.ui.ChatFooterPanel r5 = r21.mo88375j3()
            android.view.ViewParent r5 = r5.getParent()
            boolean r5 = gy3.C87412m.m108589b(r5, r2)
            if (r5 != 0) goto L_0x03ab
            com.tencent.mm.pluginsdk.ui.ChatFooterPanel r5 = r21.mo88375j3()
            android.view.ViewParent r5 = r5.getParent()
            if (r5 == 0) goto L_0x039e
            com.tencent.mm.pluginsdk.ui.ChatFooterPanel r5 = r21.mo88375j3()
            android.view.ViewParent r5 = r5.getParent()
            gy3.C87412m.m108592e(r5, r10)
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            com.tencent.mm.pluginsdk.ui.ChatFooterPanel r6 = r21.mo88375j3()
            r5.removeView(r6)
        L_0x039e:
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r6 = -1
            r5.<init>(r6, r8)
            com.tencent.mm.pluginsdk.ui.ChatFooterPanel r6 = r21.mo88375j3()
            r2.addView(r6, r5)
        L_0x03ab:
            r0.mo88376l3(r1, r8)
            if (r3 == 0) goto L_0x03d9
            androidx.appcompat.app.AppCompatActivity r2 = r21.getActivity()
            bl3.r$a r2 = r9.mo62444c(r2)
            bl3.t r2 = r2.mo62449e(r4)
            rs1.y3 r2 = (rs1.C13539y3) r2
            if (r2 == 0) goto L_0x03cb
            rs1.y3$a r2 = r2.mo12947e3()
            if (r2 == 0) goto L_0x03cb
            com.tencent.mm.plugin.finder.view.HorizontalVideoSeekBarLayout r7 = r2.getLongVideoSeekBarLayout()
            goto L_0x03cc
        L_0x03cb:
            r7 = r12
        L_0x03cc:
            java.util.ArrayList<android.view.View> r2 = r0.f180148o
            r2.add(r7)
            if (r7 != 0) goto L_0x03d4
            goto L_0x03d9
        L_0x03d4:
            r2 = 8
            r7.setVisibility(r2)
        L_0x03d9:
            com.tencent.mm.plugin.finder.megavideo.ui.MegaVideoInputLayout r2 = r21.mo88372f3()
            if (r2 == 0) goto L_0x03e7
            rs1.a1$f r3 = new rs1.a1$f
            r3.<init>(r1, r0)
            r2.setOnKeyboardChange(r3)
        L_0x03e7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rs1.C63513a1.mo88371d3(jq3.o, boolean, boolean):void");
    }

    public void dismiss() {
        C78253a aVar;
        C78253a aVar2 = C59842e.f170855a;
        boolean z = true;
        if (aVar2 == null || !aVar2.mo108269d()) {
            z = false;
        }
        if (z && (aVar = C59842e.f170855a) != null) {
            aVar.mo108266a();
        }
        C59842e.f170855a = null;
        C89132b<?> bVar = C59842e.f170857c;
        if (bVar != null) {
            bVar.mo85581g();
        }
        C59842e.f170857c = null;
        C9247b bVar2 = C59842e.f170858d;
        if (bVar2 != null) {
            bVar2.mo8913b();
        }
        C59842e.f170858d = null;
    }

    /* renamed from: f3 */
    public final MegaVideoInputLayout mo88372f3() {
        return (MegaVideoInputLayout) ((C36570n) this.f180147n).getValue();
    }

    /* renamed from: g3 */
    public final View mo88373g3() {
        return (View) ((C36570n) this.f180145i).getValue();
    }

    /* renamed from: i3 */
    public final KeyboardHeightProvider mo88374i3() {
        return (KeyboardHeightProvider) ((C36570n) this.f180143g).getValue();
    }

    /* renamed from: j3 */
    public final ChatFooterPanel mo88375j3() {
        Object value = ((C36570n) this.f180140d).getValue();
        C87412m.m108593f(value, "<get-smileyPanel>(...)");
        return (ChatFooterPanel) value;
    }

    /* renamed from: l3 */
    public final void mo88376l3(C60905o oVar, boolean z) {
        WeImageView floatPlayIcon;
        Log.m105924i("FinderBulletUIC", "hideOtherViews: feedId=" + C61926c.m72691p(this.f180151r) + "}， onlySeekBar=" + z);
        if (!z) {
            this.f180148o.add(oVar.mo85812D(C0966R.C0970id.d97));
        }
        ViewGroup viewGroup = (ViewGroup) oVar.mo85812D(C0966R.C0970id.e6u);
        if (viewGroup != null && viewGroup.getVisibility() == 0) {
            this.f180148o.add(viewGroup);
        }
        FinderFullSeekBarLayout finderFullSeekBarLayout = (FinderFullSeekBarLayout) oVar.mo85812D(C0966R.C0970id.eh4);
        if (!(finderFullSeekBarLayout == null || (floatPlayIcon = finderFullSeekBarLayout.getFloatPlayIcon()) == null || floatPlayIcon.getVisibility() != 0)) {
            this.f180148o.add(floatPlayIcon);
        }
        for (View view : this.f180148o) {
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderBulletUIC", "hideOtherViews", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderBulletUIC", "hideOtherViews", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    /* renamed from: m3 */
    public final boolean mo88377m3() {
        return mo88373g3().getParent() != null && mo88373g3().getVisibility() == 0;
    }

    /* renamed from: n3 */
    public final boolean mo88378n3() {
        C10008v1 v1Var = this.f180144h;
        if (v1Var != null) {
            return v1Var.mo2497u0();
        }
        return false;
    }

    /* renamed from: o3 */
    public final void mo88379o3(boolean z) {
        if (this.f180141e == 2) {
            Log.m105924i("FinderBulletUIC", "onHideSmileyPanel: feedId=" + C61926c.m72691p(this.f180151r) + '}');
            WeImageView weImageView = (WeImageView) mo88373g3().findViewById(C0966R.C0970id.mse);
            if (weImageView != null) {
                weImageView.setImageResource(this.f180153t ? C0966R.raw.icons_outlined_sticker : C0966R.raw.icons_filled_sticker);
                weImageView.setIconColor(getContext().getResources().getColor(this.f180153t ? C0966R.color.f3133gi : C0966R.color.f2975b6));
            }
            mo88375j3().animate().alpha(0.0f).setDuration(220).setListener(new C63526k(this)).start();
            if (z && this.f180141e == 2) {
                int c = C75044y4.m89991c(getActivity());
                boolean z2 = getActivity().getResources().getConfiguration().orientation == 1;
                ChatFooterPanel j3 = mo88375j3();
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
                if (z2) {
                    layoutParams.bottomMargin = c;
                } else {
                    layoutParams.setMarginEnd(c);
                }
                j3.setLayoutParams(layoutParams);
                MegaVideoInputLayout f3 = mo88372f3();
                if (f3 != null) {
                    f3.mo3457a();
                }
            }
            if (mo88373g3().getVisibility() == 0) {
                mo88368J3(1);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        ChatFooterPanel j3 = mo88375j3();
        int i = ChatFooterPanel.f211589f;
        j3.setEntranceScene(13);
        mo88375j3().mo100191d();
        mo88375j3().mo100192e(true);
        mo88375j3().mo100193f(false, false);
        mo88375j3().setVisibility(4);
        mo88375j3().setShowSend(true);
        mo88375j3().mo100197i();
    }

    public void onDestroy() {
        C78253a aVar;
        this.f180149p = null;
        this.f180152s = null;
        C78253a aVar2 = C59842e.f170855a;
        boolean z = true;
        if (aVar2 == null || !aVar2.mo108269d()) {
            z = false;
        }
        if (z && (aVar = C59842e.f170855a) != null) {
            aVar.mo108266a();
        }
        C59842e.f170855a = null;
        C89132b<?> bVar = C59842e.f170857c;
        if (bVar != null) {
            bVar.mo85581g();
        }
        C59842e.f170857c = null;
        C9247b bVar2 = C59842e.f170858d;
        if (bVar2 != null) {
            bVar2.mo8913b();
        }
        C59842e.f170858d = null;
    }

    public void onPause() {
        mo88374i3().mo104021d();
    }

    public void onResume() {
        mo88374i3().mo104022e();
    }
}
