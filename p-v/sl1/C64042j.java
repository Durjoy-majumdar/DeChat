package sl1;

import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.plugin.finder.live.bubble.FrameBubbleContentLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import er1.C58739j4;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import og1.C62008a;
import org.libpag.PAGFile;
import org.libpag.PAGView;
import org.libpag.SimplePAGViewUpdateListener;
import rx3.C13598b0;

/* renamed from: sl1.j */
public final class C64042j extends C62008a implements C13713b {

    /* renamed from: g */
    public final boolean f181575g;

    /* renamed from: h */
    public final MMActivity f181576h;

    /* renamed from: i */
    public final C13712a f181577i;

    /* renamed from: j */
    public final String f181578j = ("FinderLiveLotteryBubbleViewCallback" + hashCode());

    /* renamed from: n */
    public final String f181579n = "small_lottery_amin.pag";

    /* renamed from: o */
    public PAGView f181580o;

    /* renamed from: p */
    public C64043a f181581p;

    /* renamed from: q */
    public final boolean f181582q = ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76821Vb();

    /* renamed from: r */
    public boolean f181583r;

    /* renamed from: sl1.j$a */
    public final class C64043a extends SimplePAGViewUpdateListener {

        /* renamed from: d */
        public WeakReference<C64042j> f181584d;

        /* renamed from: e */
        public C32224a<C13598b0> f181585e;

        /* renamed from: f */
        public final /* synthetic */ C64042j f181586f;

        public C64043a(C64042j jVar, C64042j jVar2) {
            C87412m.m108594g(jVar2, "viewCallback");
            this.f181586f = jVar;
            this.f181584d = new WeakReference<>(jVar2);
        }

        public void onAnimationCancel(PAGView pAGView) {
            int i = 0;
            boolean z = this.f181584d.get() == null;
            String str = this.f181586f.f181578j;
            StringBuilder sb = new StringBuilder();
            sb.append("showPrepareLottery onAnimationCancel,view:");
            if (pAGView != null) {
                i = pAGView.hashCode();
            }
            sb.append(i);
            sb.append(" emptyViewCallback:");
            sb.append(z);
            Log.m105924i(str, sb.toString());
            C32224a<C13598b0> aVar = this.f181585e;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        public void onAnimationEnd(PAGView pAGView) {
            C64042j jVar = this.f181584d.get();
            boolean z = jVar == null;
            String str = this.f181586f.f181578j;
            StringBuilder sb = new StringBuilder();
            sb.append("showPrepareLottery onAnimationEnd,view:");
            sb.append(pAGView != null ? pAGView.hashCode() : 0);
            sb.append(" emptyViewCallback:");
            sb.append(z);
            Log.m105924i(str, sb.toString());
            TextView J0 = jVar != null ? jVar.mo88794J0() : null;
            if (J0 != null) {
                J0.setVisibility(0);
            }
            C32224a<C13598b0> aVar = this.f181585e;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        public void onAnimationRepeat(PAGView pAGView) {
            String str = this.f181586f.f181578j;
            StringBuilder sb = new StringBuilder();
            sb.append("onAnimationRepeat:$");
            sb.append(pAGView != null ? pAGView.hashCode() : 0);
            Log.m105924i(str, sb.toString());
        }

        public void onAnimationStart(PAGView pAGView) {
            String str = this.f181586f.f181578j;
            StringBuilder sb = new StringBuilder();
            sb.append("onAnimationStart:$");
            sb.append(pAGView != null ? pAGView.hashCode() : 0);
            Log.m105924i(str, sb.toString());
        }
    }

    /* renamed from: sl1.j$b */
    public static final class C64044b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C64042j f181587d;

        public C64044b(C64042j jVar) {
            this.f181587d = jVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/lottery/bubble/FinderLiveLotteryBubbleViewCallback$applyBundle$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C13712a aVar = this.f181587d.f181577i;
            if (aVar != null) {
                aVar.mo13088b();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/lottery/bubble/FinderLiveLotteryBubbleViewCallback$applyBundle$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: sl1.j$c */
    public static final class C64045c implements TextureView.SurfaceTextureListener {

        /* renamed from: d */
        public final /* synthetic */ C64042j f181588d;

        public C64045c(C64042j jVar) {
            this.f181588d = jVar;
        }

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            C87412m.m108594g(surfaceTexture, "surface");
            String str = this.f181588d.f181578j;
            Log.m105924i(str, "LotteryBubbleSurface onSurfaceTextureAvailable width: " + i + " height: " + i2 + " smallAnim: " + this.f181588d.f181580o);
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            C87412m.m108594g(surfaceTexture, "surface");
            String str = this.f181588d.f181578j;
            Log.m105924i(str, "LotteryBubbleSurface onSurfaceTextureDestroyed o smallAnim: " + this.f181588d.f181580o);
            return false;
        }

        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            C87412m.m108594g(surfaceTexture, "surface");
            String str = this.f181588d.f181578j;
            Log.m105924i(str, "LotteryBubbleSurface onSurfaceTextureSizeChanged width: " + i + " height: " + i2 + " smallAnim: " + this.f181588d.f181580o);
        }

        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            C87412m.m108594g(surfaceTexture, "surface");
        }
    }

    /* renamed from: sl1.j$d */
    public static final class C64046d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C64042j f181589d;

        public C64046d(C64042j jVar) {
            this.f181589d = jVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/lottery/bubble/FinderLiveLotteryBubbleViewCallback$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C13712a aVar = this.f181589d.f181577i;
            if (aVar != null) {
                aVar.mo13088b();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/lottery/bubble/FinderLiveLotteryBubbleViewCallback$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: sl1.j$e */
    public static final class C64047e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C64042j f181590d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64047e(C64042j jVar) {
            super(0);
            this.f181590d = jVar;
        }

        public Object invoke() {
            Log.m105924i(this.f181590d.f181578j, "onNotifyShow finish!");
            return C13598b0.f38549a;
        }
    }

    /* renamed from: sl1.j$f */
    public static final class C64048f extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C64042j f181591d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64048f(C64042j jVar) {
            super(0);
            this.f181591d = jVar;
        }

        public Object invoke() {
            Log.m105924i(this.f181591d.f181578j, "onSourceSceneChanged prepare finish!");
            return C13598b0.f38549a;
        }
    }

    /* renamed from: sl1.j$g */
    public static final class C64049g implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C64042j f181592d;

        public C64049g(C64042j jVar) {
            this.f181592d = jVar;
        }

        public final void run() {
            FrameLayout K0 = this.f181592d.mo88795K0();
            if (K0 != null) {
                K0.setVisibility(0);
            }
            PAGView pAGView = this.f181592d.f181580o;
            if (pAGView != null) {
                pAGView.setProgress(1.0d);
            }
        }
    }

    /* renamed from: sl1.j$h */
    public static final class C64050h implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C64042j f181593d;

        public C64050h(C64042j jVar) {
            this.f181593d = jVar;
        }

        public final void run() {
            FrameLayout K0 = this.f181593d.mo88795K0();
            if (K0 != null) {
                K0.setVisibility(0);
            }
            PAGView pAGView = this.f181593d.f181580o;
            if (pAGView != null) {
                pAGView.setProgress(1.0d);
            }
        }
    }

    /* renamed from: sl1.j$i */
    public static final class C64051i implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C64042j f181594d;

        public C64051i(C64042j jVar) {
            this.f181594d = jVar;
        }

        public final void run() {
            FrameLayout K0 = this.f181594d.mo88795K0();
            if (K0 != null) {
                K0.setVisibility(0);
            }
            PAGView pAGView = this.f181594d.f181580o;
            if (pAGView != null) {
                pAGView.setProgress(1.0d);
            }
        }
    }

    /* renamed from: sl1.j$j */
    public static final class C64052j implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ View f181595d;

        /* renamed from: e */
        public final /* synthetic */ float f181596e;

        /* renamed from: f */
        public final /* synthetic */ C64042j f181597f;

        public C64052j(View view, float f, C64042j jVar) {
            this.f181595d = view;
            this.f181596e = f;
            this.f181597f = jVar;
        }

        public final void run() {
            this.f181595d.setScaleX(this.f181596e);
            this.f181595d.setScaleY(this.f181596e);
            this.f181595d.setPivotX(0.0f);
            PAGView pAGView = this.f181597f.f181580o;
            if (pAGView != null) {
                pAGView.setScaleX(this.f181596e);
            }
            PAGView pAGView2 = this.f181597f.f181580o;
            if (pAGView2 != null) {
                pAGView2.setScaleY(this.f181596e);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C64042j(boolean z, View view, FrameBubbleContentLayout frameBubbleContentLayout, MMActivity mMActivity, C13712a aVar) {
        super(view, frameBubbleContentLayout);
        C87412m.m108594g(view, "root");
        C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f181575g = z;
        this.f181576h = mMActivity;
        this.f181577i = aVar;
        C58739j4.f168176a.mo83714i0("FinderLiveLotteryBubbleViewCallback");
        mo86891b().setTag(Float.valueOf(1.0f));
    }

    /* renamed from: D */
    public void mo86885D(Bundle bundle) {
        mo88793I0(bundle);
    }

    /* renamed from: F0 */
    public String mo86887F0() {
        return this.f181578j;
    }

    /* renamed from: I0 */
    public final void mo88793I0(Bundle bundle) {
        String str;
        TextView J0 = mo88794J0();
        if (J0 != null) {
            if (bundle == null || (str = bundle.getString("currentCountDownText")) == null) {
                str = "";
            }
            J0.setText(str);
        }
        View E0 = mo86886E0(C0966R.C0970id.dqo);
        if (E0 != null) {
            E0.setOnClickListener(new C64044b(this));
        }
    }

    /* renamed from: J0 */
    public final TextView mo88794J0() {
        View E0 = mo86886E0(C0966R.C0970id.f357800bu0);
        if (E0 instanceof TextView) {
            return (TextView) E0;
        }
        return null;
    }

    /* renamed from: K */
    public void mo13091K(String str) {
        C87412m.m108594g(str, "remainTime");
        String str2 = this.f181578j;
        Log.m105924i(str2, "updateCountDown remainTime:" + str);
        FrameLayout K0 = mo88795K0();
        if (K0 != null) {
            K0.post(new C64051i(this));
        }
        TextView J0 = mo88794J0();
        if (J0 != null) {
            J0.setVisibility(0);
        }
        TextView J02 = mo88794J0();
        if (J02 != null) {
            J02.setText(str);
        }
    }

    /* renamed from: K0 */
    public final FrameLayout mo88795K0() {
        View E0 = mo86886E0(C0966R.C0970id.f5845q7);
        if (E0 instanceof FrameLayout) {
            return (FrameLayout) E0;
        }
        return null;
    }

    /* renamed from: L0 */
    public final void mo88796L0() {
        if (this.f181582q) {
            if (this.f181580o == null) {
                Log.m105924i(this.f181578j, "initSmallAnim create smallAnim!");
                this.f181580o = new PAGView(mo86891b().getContext());
                C64043a aVar = new C64043a(this, this);
                this.f181581p = aVar;
                PAGView pAGView = this.f181580o;
                if (pAGView != null) {
                    pAGView.addListener(aVar);
                }
                PAGView pAGView2 = this.f181580o;
                if (pAGView2 != null) {
                    pAGView2.setSurfaceTextureListener(new C64045c(this));
                }
            }
            PAGView pAGView3 = this.f181580o;
            if (pAGView3 != null) {
                pAGView3.setTransitionName("pag_anim");
            }
            FrameLayout K0 = mo88795K0();
            boolean z = false;
            if (K0 != null && K0.indexOfChild(this.f181580o) == -1) {
                z = true;
            }
            if (z) {
                Log.m105924i(this.f181578j, "initSmallAnim add smallAnim!");
                PAGView pAGView4 = this.f181580o;
                ViewGroup viewGroup = null;
                ViewParent parent = pAGView4 != null ? pAGView4.getParent() : null;
                if (parent instanceof ViewGroup) {
                    viewGroup = (ViewGroup) parent;
                }
                if (viewGroup != null) {
                    viewGroup.removeView(this.f181580o);
                }
                FrameLayout K02 = mo88795K0();
                if (K02 != null) {
                    K02.removeAllViews();
                }
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                PAGView pAGView5 = this.f181580o;
                if (pAGView5 != null) {
                    pAGView5.setLayoutParams(layoutParams);
                }
                PAGView pAGView6 = this.f181580o;
                if (pAGView6 != null) {
                    pAGView6.setComposition(PAGFile.Load(this.f181576h.getAssets(), this.f181579n));
                }
                FrameLayout K03 = mo88795K0();
                if (K03 != null) {
                    K03.addView(this.f181580o);
                }
            }
        }
    }

    /* renamed from: M0 */
    public void mo88797M0(boolean z) {
        if (z != this.f181583r) {
            String str = this.f181578j;
            Log.m105924i(str, "needResize :" + z);
        }
        this.f181583r = z;
        FrameLayout K0 = mo88795K0();
        boolean z2 = false;
        if (K0 != null && K0.getVisibility() == 0) {
            z2 = true;
        }
        if (z2) {
            mo88799O0();
        }
    }

    /* renamed from: N0 */
    public final Bundle mo88798N0() {
        Bundle bundle = new Bundle();
        TextView J0 = mo88794J0();
        bundle.putString("currentCountDownText", String.valueOf(J0 != null ? J0.getText() : null));
        return bundle;
    }

    /* renamed from: O0 */
    public final void mo88799O0() {
        float f = this.f181583r ? 0.8f : 1.0f;
        View b = mo86891b();
        if (C87412m.m108589b(b.getTag(), Float.valueOf(f))) {
            String str = this.f181578j;
            Log.m105924i(str, "updateRootViewSize fail, scale:" + f + ",width:" + b.getLayoutParams().width);
            return;
        }
        b.setTag(Float.valueOf(f));
        String str2 = this.f181578j;
        Log.m105924i(str2, "updateRootViewSize scale:" + f);
        b.post(new C64052j(b, f, this));
    }

    /* renamed from: Z */
    public Bundle mo86890Z() {
        return mo88798N0();
    }

    /* renamed from: a */
    public void mo13092a() {
        Log.m105924i(this.f181578j, "initView!");
        View E0 = mo86886E0(C0966R.C0970id.dqo);
        if (E0 != null) {
            E0.setOnClickListener(new C64046d(this));
        }
        mo88799O0();
    }

    /* renamed from: b0 */
    public void mo13093b0(C32224a<C13598b0> aVar) {
        C87412m.m108594g(aVar, "callback");
        String str = this.f181578j;
        StringBuilder sb = new StringBuilder();
        sb.append("resumeLotteryBubble smallAnim is null:");
        sb.append(this.f181580o == null);
        Log.m105924i(str, sb.toString());
        mo88796L0();
        FrameLayout K0 = mo88795K0();
        if (K0 != null) {
            K0.setVisibility(0);
        }
        PAGView pAGView = this.f181580o;
        if (pAGView != null) {
            pAGView.setProgress(1.0d);
        }
        TextView J0 = mo88794J0();
        if (J0 != null) {
            J0.setVisibility(8);
        }
        aVar.invoke();
    }

    public MMFragmentActivity getActivity() {
        return this.f181576h;
    }

    /* renamed from: m0 */
    public void mo86892m0(Bundle bundle) {
        mo88793I0(bundle);
        TextView J0 = mo88794J0();
        if (J0 != null) {
            J0.setBackgroundResource(C0966R.C0969drawable.a0f);
        }
        mo13094p0(new C64048f(this));
    }

    /* renamed from: p0 */
    public void mo13094p0(C32224a<C13598b0> aVar) {
        C87412m.m108594g(aVar, "callback");
        String str = this.f181578j;
        StringBuilder sb = new StringBuilder();
        sb.append("showPrepareLottery smallAnim is null:");
        sb.append(this.f181580o == null);
        sb.append(",isPagEnable:");
        sb.append(this.f181582q);
        Log.m105924i(str, sb.toString());
        if (!this.f181582q) {
            aVar.invoke();
            return;
        }
        reset();
        mo88796L0();
        mo88799O0();
        FrameLayout K0 = mo88795K0();
        if (K0 != null) {
            K0.setVisibility(0);
        }
        TextView J0 = mo88794J0();
        if (J0 != null) {
            J0.setVisibility(8);
        }
        C64043a aVar2 = this.f181581p;
        if (aVar2 != null) {
            aVar2.f181585e = aVar;
        }
        PAGView pAGView = this.f181580o;
        if (pAGView != null) {
            pAGView.setProgress(0.0d);
        }
        PAGView pAGView2 = this.f181580o;
        if (pAGView2 != null) {
            pAGView2.play();
        }
    }

    /* renamed from: r0 */
    public void mo13095r0() {
        Log.m105924i(this.f181578j, "showLotteryFinish");
        mo88796L0();
        FrameLayout K0 = mo88795K0();
        if (K0 != null) {
            K0.post(new C64050h(this));
        }
        TextView J0 = mo88794J0();
        if (J0 != null) {
            J0.setVisibility(0);
        }
        TextView J02 = mo88794J0();
        if (J02 != null) {
            J02.setText(mo86891b().getContext().getResources().getString(C0966R.string.dsr));
        }
    }

    public void reset() {
        PAGView pAGView;
        Log.m105924i(this.f181578j, "reset");
        PAGView pAGView2 = this.f181580o;
        boolean z = true;
        if (pAGView2 == null || !pAGView2.isPlaying()) {
            z = false;
        }
        if (z && (pAGView = this.f181580o) != null) {
            pAGView.stop();
        }
    }

    /* renamed from: v */
    public boolean mo86893v() {
        C13712a aVar = this.f181577i;
        boolean z = false;
        if (aVar != null && aVar.getCurrentStatus() == 4) {
            z = true;
        }
        return !z;
    }

    /* renamed from: w0 */
    public void mo13097w0() {
        Log.m105924i(this.f181578j, "showLotteryComputing");
        mo88796L0();
        FrameLayout K0 = mo88795K0();
        if (K0 != null) {
            K0.post(new C64049g(this));
        }
        TextView J0 = mo88794J0();
        if (J0 != null) {
            J0.setVisibility(0);
        }
        TextView J02 = mo88794J0();
        if (J02 != null) {
            J02.setText(mo86891b().getContext().getResources().getString(C0966R.string.dsq));
        }
    }

    /* renamed from: x */
    public void mo86894x() {
        mo13094p0(new C64047e(this));
    }

    /* renamed from: y */
    public Bundle mo86895y() {
        return mo88798N0();
    }
}
