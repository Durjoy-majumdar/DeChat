package tl1;

import al1.C0082q;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import cj1.C54795n5;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import d60.C58124b;
import di3.C86312j;
import dj1.C7339i0;
import er1.C58739j4;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import l31.C61212e;
import org.libpag.PAGFile;
import org.libpag.PAGView;
import org.libpag.SimplePAGViewUpdateListener;
import pe3.C89349b;
import qj1.C62660c;
import rl1.C13022d0;
import rx3.C13598b0;
import te3.C49712hj1;
import te3.C50617o01;
import te3.C52204z21;
import zp3.C79406f;

/* renamed from: tl1.m */
public abstract class C13988m extends C62660c {

    /* renamed from: z */
    public static final C13990b f39289z = new C13990b((C8480h) null);

    /* renamed from: p */
    public final C58124b f39290p;

    /* renamed from: q */
    public FrameLayout f39291q;

    /* renamed from: r */
    public PAGView f39292r;

    /* renamed from: s */
    public volatile boolean f39293s;

    /* renamed from: t */
    public C13989a f39294t;

    /* renamed from: u */
    public View f39295u;

    /* renamed from: v */
    public View f39296v;

    /* renamed from: w */
    public WeImageView f39297w;

    /* renamed from: x */
    public C32226l<? super C52204z21, C13598b0> f39298x;

    /* renamed from: y */
    public C52204z21 f39299y = new C52204z21();

    /* renamed from: tl1.m$a */
    public final class C13989a extends SimplePAGViewUpdateListener {

        /* renamed from: d */
        public final WeakReference<C13988m> f39300d;

        /* renamed from: e */
        public final String f39301e = "FinderLiveLotteryCardPlugin";

        /* renamed from: f */
        public C32224a<C13598b0> f39302f;

        public C13989a(C13988m mVar, WeakReference<C13988m> weakReference) {
            C87412m.m108594g(weakReference, "rPlugin");
            this.f39300d = weakReference;
        }

        public void onAnimationCancel(PAGView pAGView) {
            C13988m mVar = this.f39300d.get();
            String str = this.f39301e;
            StringBuilder sb = new StringBuilder();
            sb.append("BigAnimListener onAnimationCancel ViewCallback is null:");
            sb.append(mVar == null);
            Log.m105924i(str, sb.toString());
            PAGView pAGView2 = null;
            FrameLayout frameLayout = mVar != null ? mVar.f39291q : null;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
            if (mVar != null) {
                pAGView2 = mVar.f39292r;
            }
            if (pAGView2 != null) {
                pAGView2.setVisibility(8);
            }
            C32224a<C13598b0> aVar = this.f39302f;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        public void onAnimationEnd(PAGView pAGView) {
            C13988m mVar = this.f39300d.get();
            String str = this.f39301e;
            StringBuilder sb = new StringBuilder();
            sb.append("BigAnimListener onAnimationEnd ViewCallback is null:");
            sb.append(mVar == null);
            Log.m105924i(str, sb.toString());
            PAGView pAGView2 = null;
            FrameLayout frameLayout = mVar != null ? mVar.f39291q : null;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
            if (mVar != null) {
                pAGView2 = mVar.f39292r;
            }
            if (pAGView2 != null) {
                pAGView2.setVisibility(8);
            }
            C32224a<C13598b0> aVar = this.f39302f;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        public void onAnimationRepeat(PAGView pAGView) {
        }

        public void onAnimationStart(PAGView pAGView) {
            PAGView pAGView2;
            C13988m mVar = this.f39300d.get();
            String str = this.f39301e;
            StringBuilder sb = new StringBuilder();
            sb.append("BigAnimListener onAnimationStart ViewCallback is null:");
            sb.append(mVar == null);
            Log.m105924i(str, sb.toString());
            PAGView pAGView3 = null;
            FrameLayout frameLayout = mVar != null ? mVar.f39291q : null;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
            }
            if (mVar != null) {
                pAGView3 = mVar.f39292r;
            }
            if (pAGView3 != null) {
                pAGView3.setVisibility(0);
            }
            if (mVar != null && (pAGView2 = mVar.f39292r) != null) {
                pAGView2.flush();
            }
        }
    }

    /* renamed from: tl1.m$b */
    public static final class C13990b {
        public C13990b(C8480h hVar) {
        }
    }

    /* renamed from: tl1.m$c */
    public static final class C13991c implements C7339i0.C7340a {

        /* renamed from: a */
        public final /* synthetic */ C13988m f39303a;

        /* renamed from: b */
        public final /* synthetic */ C32224a<C13598b0> f39304b;

        public C13991c(C13988m mVar, C32224a<C13598b0> aVar) {
            this.f39303a = mVar;
            this.f39304b = aVar;
        }

        /* renamed from: a */
        public void mo8508a(int i, int i2, String str, C50617o01 o012) {
            Class cls = C13022d0.class;
            C87412m.m108594g(o012, "resp");
            if (i == 0 && i2 == 0) {
                ((C13022d0) this.f39303a.mo87696x0(cls)).mo12537L3(o012.f138872d);
                ((C13022d0) this.f39303a.mo87696x0(cls)).mo12545l3(o012);
            }
            this.f39304b.invoke();
        }
    }

    /* renamed from: tl1.m$d */
    public static final class C13992d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C13988m f39305d;

        public C13992d(C13988m mVar) {
            this.f39305d = mVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/lottery/card/FinderLiveLotteryCardPlugin$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C13988m mVar = this.f39305d;
            mVar.mo10792g(8);
            C58124b.C7172a.m7372a(mVar.f39290p, C58124b.C58125b.FINDER_LIVE_LOTTERY_UPDATE, (Bundle) null, 2, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/lottery/card/FinderLiveLotteryCardPlugin$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: tl1.m$e */
    public static final class C13993e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C13988m f39306d;

        public C13993e(C13988m mVar) {
            this.f39306d = mVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/lottery/card/FinderLiveLotteryCardPlugin$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C13988m mVar = this.f39306d;
            mVar.mo10792g(8);
            C58124b.C7172a.m7372a(mVar.f39290p, C58124b.C58125b.FINDER_LIVE_LOTTERY_UPDATE, (Bundle) null, 2, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/lottery/card/FinderLiveLotteryCardPlugin$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: tl1.m$f */
    public static final class C13994f extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C13988m f39307d;

        /* renamed from: e */
        public final /* synthetic */ C52204z21 f39308e;

        /* renamed from: f */
        public final /* synthetic */ int f39309f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13994f(C13988m mVar, C52204z21 z212, int i) {
            super(0);
            this.f39307d = mVar;
            this.f39308e = z212;
            this.f39309f = i;
        }

        public Object invoke() {
            this.f39307d.f39293s = false;
            StringBuilder sb = new StringBuilder();
            sb.append("playLotteringAnim done, id:");
            sb.append(this.f39308e.f145640d);
            sb.append(",status:");
            sb.append(this.f39309f);
            sb.append(",callback:");
            C32226l<? super C52204z21, C13598b0> lVar = this.f39307d.f39298x;
            sb.append(lVar != null ? Integer.valueOf(lVar.hashCode()) : null);
            Log.m105924i("FinderLiveLotteryCardPlugin", sb.toString());
            C13988m mVar = this.f39307d;
            C32226l<? super C52204z21, C13598b0> lVar2 = mVar.f39298x;
            if (lVar2 != null) {
                lVar2.invoke(mVar.f39299y);
            }
            View view = this.f39307d.f39295u;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/lottery/card/FinderLiveLotteryCardPlugin$playLotteringAnim$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/lottery/card/FinderLiveLotteryCardPlugin$playLotteringAnim$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13988m(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f39290p = bVar;
        C58739j4.f168176a.mo83714i0("FinderLiveLotteryCardPlugin");
        mo13418b1();
    }

    /* renamed from: Z0 */
    public void mo13427Z0() {
        Log.m105924i("FinderLiveLotteryCardPlugin", "changeToUnvisible");
    }

    /* renamed from: a1 */
    public final void mo13428a1(C32224a<C13598b0> aVar) {
        String str;
        C52204z21 z212;
        C87412m.m108594g(aVar, "callback");
        C54795n5 D0 = mo14476D0();
        if (D0 != null) {
            C0082q qVar = ((C13022d0) mo87696x0(C13022d0.class)).f37098n;
            if (qVar == null || (z212 = qVar.f509d) == null || (str = z212.f145640d) == null) {
                str = "";
            }
            D0.mo75711O(str, (C89349b) null, new C13991c(this, aVar));
        }
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return false;
    }

    /* renamed from: b1 */
    public void mo13418b1() {
        Class cls = C61212e.class;
        this.f166287d.setOnClickListener(new C13992d(this));
        this.f39295u = this.f166287d.findViewById(C0966R.C0970id.atk);
        this.f39296v = this.f166287d.findViewById(C0966R.C0970id.arc);
        ((C61212e) C86312j.m106911c(cls)).o30(this.f39296v, "finder_live_lucky_result_card");
        ((C61212e) C86312j.m106911c(cls)).mo86175pO(this.f39296v, 32, 25561);
        this.f39291q = (FrameLayout) this.f166287d.findViewById(C0966R.C0970id.dqn);
        WeImageView weImageView = (WeImageView) this.f166287d.findViewById(C0966R.C0970id.be4);
        this.f39297w = weImageView;
        if (weImageView != null) {
            weImageView.setOnClickListener(new C13993e(this));
        }
        if (mo82893g0()) {
            float f = ((float) C75044y4.m89990b(this.f166287d.getContext()).y) * 0.81f;
            int a = C79406f.m96347a(MMApplicationContext.getContext(), 424.0f);
            float f2 = (float) a;
            float f3 = f / f2;
            if (f3 <= 0.0f) {
                Log.m105924i("FinderLiveLotteryCardPlugin", "adjustLayout invalid scale:" + f3 + ",targetHeight:" + f + ",sourceHeight:" + a);
                return;
            }
            int a2 = C79406f.m96347a(MMApplicationContext.getContext(), 320.0f);
            float f4 = (float) a2;
            float f5 = f4 * f3;
            float f6 = f2 - f;
            float f7 = f4 - f5;
            float f8 = (float) 2;
            float f9 = f6 / f8;
            float f15 = -(f7 / f8);
            Log.m105924i("FinderLiveLotteryCardPlugin", "adjustLayout targetHeight:" + f + ",targetWidth:" + f5 + ",sourceHeight:" + a + ",sourceWidth:" + a2 + ",scale:" + f3 + ",diffHeight:" + f6 + ",translationY:" + f9 + ",diffWidth:" + f7 + ',' + f15);
            View view = this.f39296v;
            if (view != null) {
                view.setScaleX(f3);
            }
            View view2 = this.f39296v;
            if (view2 != null) {
                view2.setScaleY(f3);
            }
            WeImageView weImageView2 = this.f39297w;
            if (weImageView2 != null) {
                weImageView2.setTranslationY(f9);
            }
            WeImageView weImageView3 = this.f39297w;
            if (weImageView3 != null) {
                weImageView3.setTranslationX(f15);
                return;
            }
            return;
        }
        View view3 = this.f39296v;
        if (view3 != null) {
            view3.setScaleX(1.0f);
        }
        View view4 = this.f39296v;
        if (view4 != null) {
            view4.setScaleY(1.0f);
        }
        WeImageView weImageView4 = this.f39297w;
        if (weImageView4 != null) {
            weImageView4.setTranslationY(0.0f);
        }
    }

    /* renamed from: c1 */
    public void mo13419c1(boolean z, C0082q qVar) {
        C87412m.m108594g(qVar, "lotteryInfoWrapper");
        int i = qVar.f506a;
        if (i == 2) {
            C58124b bVar = this.f39290p;
            C58124b.C58125b bVar2 = C58124b.C58125b.FINDER_LIVE_LOTTERY_BUBBLE_HIDE;
            Bundle bundle = new Bundle();
            bundle.putBoolean("PARAM_FINDER_LIVE_LOTTERY_VISIBILITY_CACHE", true);
            C13598b0 b0Var = C13598b0.f38549a;
            bVar.statusChange(bVar2, bundle);
        } else if (i == 3) {
            C58124b bVar3 = this.f39290p;
            C58124b.C58125b bVar4 = C58124b.C58125b.FINDER_LIVE_LOTTERY_BUBBLE_HIDE;
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("PARAM_FINDER_LIVE_LOTTERY_VISIBILITY_CACHE", true);
            C13598b0 b0Var2 = C13598b0.f38549a;
            bVar3.statusChange(bVar4, bundle2);
            C13022d0 d0Var = (C13022d0) mo87696x0(C13022d0.class);
            C52204z21 z212 = qVar.f509d;
            d0Var.mo12533G3(z212 != null ? z212.f145640d : null);
        }
    }

    /* renamed from: d1 */
    public final void mo13429d1(C0082q qVar, C52204z21 z212, int i, C32226l<? super C52204z21, C13598b0> lVar) {
        PAGView pAGView;
        C87412m.m108594g(qVar, "lotteryInfoWrapper");
        C87412m.m108594g(z212, "lotteryInfo");
        C87412m.m108594g(lVar, "callback");
        this.f39298x = lVar;
        this.f39299y = z212;
        boolean z = qVar.f508c;
        boolean z2 = mo14483f0() == 0;
        boolean Vb = ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76821Vb();
        StringBuilder sb = new StringBuilder();
        sb.append("playLotteringAnim id:");
        sb.append(z212.f145640d);
        sb.append(" status:");
        sb.append(i);
        sb.append(", haveLottering:");
        sb.append(z);
        sb.append(", isCardShowing:");
        sb.append(z2);
        sb.append(", lottering:");
        sb.append(this.f39293s);
        sb.append(",callback:");
        C32226l<? super C52204z21, C13598b0> lVar2 = this.f39298x;
        sb.append(lVar2 != null ? Integer.valueOf(lVar2.hashCode()) : null);
        sb.append(",isPagEnable:");
        sb.append(Vb);
        Log.m105924i("FinderLiveLotteryCardPlugin", sb.toString());
        if (!this.f39293s) {
            if (!Vb) {
                C32226l<? super C52204z21, C13598b0> lVar3 = this.f39298x;
                if (lVar3 != null) {
                    lVar3.invoke(this.f39299y);
                }
            } else if (z) {
                C32226l<? super C52204z21, C13598b0> lVar4 = this.f39298x;
                if (lVar4 != null) {
                    lVar4.invoke(this.f39299y);
                }
            } else {
                qVar.f508c = true;
                if (z2) {
                    C32226l<? super C52204z21, C13598b0> lVar5 = this.f39298x;
                    if (lVar5 != null) {
                        lVar5.invoke(this.f39299y);
                        return;
                    }
                    return;
                }
                this.f39293s = true;
                C13994f fVar = new C13994f(this, z212, i);
                PAGView pAGView2 = this.f39292r;
                if ((pAGView2 != null && pAGView2.isPlaying()) && (pAGView = this.f39292r) != null) {
                    pAGView.stop();
                }
                if (this.f39292r == null) {
                    this.f39292r = new PAGView(this.f166287d.getContext());
                    C13989a aVar = new C13989a(this, new WeakReference(this));
                    this.f39294t = aVar;
                    PAGView pAGView3 = this.f39292r;
                    if (pAGView3 != null) {
                        pAGView3.addListener(aVar);
                    }
                }
                FrameLayout frameLayout = this.f39291q;
                if (frameLayout != null && frameLayout.indexOfChild(this.f39292r) == -1) {
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    PAGView pAGView4 = this.f39292r;
                    if (pAGView4 != null) {
                        pAGView4.setLayoutParams(layoutParams);
                    }
                    PAGView pAGView5 = this.f39292r;
                    if (pAGView5 != null) {
                        pAGView5.setComposition(PAGFile.Load(MMApplicationContext.getContext().getResources().getAssets(), "big_lottery_anim.pag"));
                    }
                    FrameLayout frameLayout2 = this.f39291q;
                    if (frameLayout2 != null) {
                        frameLayout2.addView(this.f39292r);
                    }
                    FrameLayout frameLayout3 = this.f39291q;
                    if (frameLayout3 != null) {
                        frameLayout3.setClickable(true);
                    }
                }
                mo10792g(0);
                View view = this.f39295u;
                if (view != null) {
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar2.mo10233c(4);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/lottery/card/FinderLiveLotteryCardPlugin", "showLottering", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/lottery/card/FinderLiveLotteryCardPlugin", "showLottering", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                C13989a aVar3 = this.f39294t;
                if (aVar3 != null) {
                    aVar3.f39302f = fVar;
                }
                PAGView pAGView6 = this.f39292r;
                if (pAGView6 != null) {
                    pAGView6.setProgress(0.0d);
                }
                PAGView pAGView7 = this.f39292r;
                if (pAGView7 != null) {
                    pAGView7.flush();
                }
                PAGView pAGView8 = this.f39292r;
                if (pAGView8 != null) {
                    pAGView8.play();
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0129  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo10792g(int r12) {
        /*
            r11 = this;
            java.lang.Class<cl1.o> r0 = cl1.C54991o.class
            java.lang.Class<rl1.d0> r1 = rl1.C13022d0.class
            androidx.lifecycle.i0 r2 = r11.mo87696x0(r0)
            cl1.o r2 = (cl1.C54991o) r2
            int r2 = r2.f154315f4
            if (r2 == 0) goto L_0x0018
            tl1.m$b r3 = f39289z
            int r3 = r3.hashCode()
            if (r2 != r3) goto L_0x0017
            goto L_0x0018
        L_0x0017:
            return
        L_0x0018:
            r2 = 0
            if (r12 != 0) goto L_0x002a
            androidx.lifecycle.i0 r0 = r11.mo87696x0(r0)
            cl1.o r0 = (cl1.C54991o) r0
            tl1.m$b r3 = f39289z
            int r3 = r3.hashCode()
            r0.f154315f4 = r3
            goto L_0x0032
        L_0x002a:
            androidx.lifecycle.i0 r0 = r11.mo87696x0(r0)
            cl1.o r0 = (cl1.C54991o) r0
            r0.f154315f4 = r2
        L_0x0032:
            int r0 = r11.mo14483f0()
            androidx.lifecycle.i0 r3 = r11.mo87696x0(r1)
            rl1.d0 r3 = (rl1.C13022d0) r3
            al1.q r3 = r3.f37098n
            r4 = 1
            if (r3 == 0) goto L_0x0047
            int r3 = r3.f506a
            if (r3 != r4) goto L_0x0047
            r3 = 1
            goto L_0x0048
        L_0x0047:
            r3 = 0
        L_0x0048:
            if (r3 != 0) goto L_0x0060
            androidx.lifecycle.i0 r3 = r11.mo87696x0(r1)
            rl1.d0 r3 = (rl1.C13022d0) r3
            al1.q r3 = r3.f37098n
            if (r3 == 0) goto L_0x005b
            int r3 = r3.f506a
            r5 = 2
            if (r3 != r5) goto L_0x005b
            r3 = 1
            goto L_0x005c
        L_0x005b:
            r3 = 0
        L_0x005c:
            if (r3 != 0) goto L_0x0060
            r3 = 1
            goto L_0x0061
        L_0x0060:
            r3 = 0
        L_0x0061:
            androidx.lifecycle.i0 r5 = r11.mo87696x0(r1)
            rl1.d0 r5 = (rl1.C13022d0) r5
            al1.q r5 = r5.f37098n
            r6 = 0
            if (r5 == 0) goto L_0x0073
            boolean r5 = r5.f512g
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            goto L_0x0074
        L_0x0073:
            r5 = r6
        L_0x0074:
            androidx.lifecycle.i0 r7 = r11.mo87696x0(r1)
            rl1.d0 r7 = (rl1.C13022d0) r7
            al1.q r7 = r7.f37098n
            if (r7 == 0) goto L_0x0085
            boolean r7 = r7.f510e
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            goto L_0x0086
        L_0x0085:
            r7 = r6
        L_0x0086:
            androidx.lifecycle.i0 r8 = r11.mo87696x0(r1)
            rl1.d0 r8 = (rl1.C13022d0) r8
            java.util.LinkedList<al1.q> r8 = r8.f37097j
            int r8 = r8.size()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "curVisibility:"
            r9.append(r10)
            r9.append(r0)
            java.lang.String r10 = ",lastVisibility:"
            r9.append(r10)
            r9.append(r12)
            java.lang.String r10 = ",lastDoneLottery:"
            r9.append(r10)
            r9.append(r7)
            java.lang.String r7 = ",remoteSize:"
            r9.append(r7)
            r9.append(r8)
            java.lang.String r7 = ",isLotteryFinish:"
            r9.append(r7)
            r9.append(r3)
            java.lang.String r7 = ",bubbleFinish:"
            r9.append(r7)
            r9.append(r5)
            java.lang.String r7 = r9.toString()
            java.lang.String r9 = "FinderLiveLotteryCardPlugin"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r7)
            if (r0 != 0) goto L_0x011e
            if (r12 == 0) goto L_0x011e
            if (r3 == 0) goto L_0x0108
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = gy3.C87412m.m108589b(r5, r0)
            if (r0 != 0) goto L_0x00e0
            if (r8 <= r4) goto L_0x0108
        L_0x00e0:
            androidx.lifecycle.i0 r0 = r11.mo87696x0(r1)
            rl1.d0 r0 = (rl1.C13022d0) r0
            androidx.lifecycle.i0 r3 = r11.mo87696x0(r1)
            rl1.d0 r3 = (rl1.C13022d0) r3
            al1.q r3 = r3.f37098n
            if (r3 == 0) goto L_0x00f6
            te3.z21 r3 = r3.f509d
            if (r3 == 0) goto L_0x00f6
            java.lang.String r6 = r3.f145640d
        L_0x00f6:
            androidx.lifecycle.i0 r3 = r11.mo87696x0(r1)
            rl1.d0 r3 = (rl1.C13022d0) r3
            boolean r3 = r3.mo12541g3()
            rl1.i0 r5 = new rl1.i0
            r5.<init>(r3, r0, r6)
            o40.C61926c.m72668M(r5)
        L_0x0108:
            d60.b r0 = r11.f39290p
            d60.b$b r3 = d60.C58124b.C58125b.FINDER_LIVE_LOTTERY_BUBBLE_SHOW
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            java.lang.String r6 = "PARAM_FINDER_LIVE_LOTTERY_VISIBILITY_CACHE"
            r5.putBoolean(r6, r4)
            rx3.b0 r6 = rx3.C13598b0.f38549a
            r0.statusChange(r3, r5)
            r11.mo13427Z0()
        L_0x011e:
            androidx.lifecycle.i0 r0 = r11.mo87696x0(r1)
            rl1.d0 r0 = (rl1.C13022d0) r0
            al1.q r0 = r0.f37098n
            if (r0 != 0) goto L_0x0129
            goto L_0x012e
        L_0x0129:
            if (r12 != 0) goto L_0x012c
            r2 = 1
        L_0x012c:
            r0.f511f = r2
        L_0x012e:
            super.mo10792g(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tl1.C13988m.mo10792g(int):void");
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        r1 = (r1 = r0.getContext()).getResources();
     */
    /* renamed from: i0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo8357i0() {
        /*
            r3 = this;
            super.mo8357i0()
            android.view.View r0 = r3.f39296v
            if (r0 != 0) goto L_0x0008
            goto L_0x0022
        L_0x0008:
            if (r0 == 0) goto L_0x001e
            android.content.Context r1 = r0.getContext()
            if (r1 == 0) goto L_0x001e
            android.content.res.Resources r1 = r1.getResources()
            if (r1 == 0) goto L_0x001e
            r2 = 2131233370(0x7f080a5a, float:1.8082876E38)
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r2)
            goto L_0x001f
        L_0x001e:
            r1 = 0
        L_0x001f:
            r0.setBackground(r1)
        L_0x0022:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tl1.C13988m.mo8357i0():void");
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return ((C54991o) mo87696x0(C54991o.class)).f154287Z0 != 1;
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        Class cls = C13022d0.class;
        C87412m.m108594g(bVar, "status");
        int ordinal = bVar.ordinal();
        C52204z21 z212 = null;
        if (ordinal == 137) {
            boolean z = bundle != null ? bundle.getBoolean("PARAM_FINDER_LIVE_LOTTERY_CARD_SHOW_STATUS") : true;
            C0082q qVar = ((C13022d0) mo87696x0(cls)).f37098n;
            if (qVar != null) {
                z212 = qVar.f509d;
            }
            if (z212 != null) {
                mo13419c1(z, qVar);
                return;
            }
            mo10792g(8);
            Log.m105924i("FinderLiveLotteryCardPlugin", "openCard statusChange:" + z + " but lotteryInfo is empty!");
        } else if (ordinal == 138) {
            mo10792g(4);
        } else if (ordinal == 140 && mo14483f0() == 0) {
            C0082q qVar2 = ((C13022d0) mo87696x0(cls)).f37098n;
            if (qVar2 != null) {
                z212 = qVar2.f509d;
            }
            if (z212 != null) {
                mo13419c1(false, qVar2);
                return;
            }
            mo10792g(8);
            Log.m105924i("FinderLiveLotteryCardPlugin", "updateCard lotteryInfo is empty!");
        }
    }

    /* renamed from: w0 */
    public void mo3211w0() {
        PAGView pAGView;
        super.mo3211w0();
        View view = this.f39296v;
        if (view != null) {
            view.setBackground((Drawable) null);
        }
        PAGView pAGView2 = this.f39292r;
        boolean z = true;
        if (pAGView2 == null || !pAGView2.isPlaying()) {
            z = false;
        }
        if (z && (pAGView = this.f39292r) != null) {
            pAGView.stop();
        }
    }
}
