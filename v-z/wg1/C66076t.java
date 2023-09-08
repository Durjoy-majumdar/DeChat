package wg1;

import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.plugin.finder.live.bubble.FrameBubbleContentLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import er1.C58739j4;
import fj1.C45795b;
import gy3.C87412m;
import ht1.C60200t1;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import l31.C61212e;
import og1.C62008a;
import ok1.C62042e;
import org.libpag.PAGFile;
import org.libpag.PAGView;
import org.libpag.SimplePAGViewUpdateListener;
import q31.C118148a;
import rx3.C13604l;
import sx3.C90364q0;

/* renamed from: wg1.t */
public final class C66076t extends C62008a implements C66088u1 {

    /* renamed from: g */
    public final MMActivity f189964g;

    /* renamed from: h */
    public final C66083t1 f189965h;

    /* renamed from: i */
    public C66077a f189966i;

    /* renamed from: j */
    public final boolean f189967j = ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76821Vb();

    /* renamed from: n */
    public int f189968n;

    /* renamed from: wg1.t$a */
    public static final class C66077a extends SimplePAGViewUpdateListener {

        /* renamed from: d */
        public WeakReference<C66076t> f189969d;

        public C66077a(C66076t tVar) {
            C87412m.m108594g(tVar, "viewCallback");
            this.f189969d = new WeakReference<>(tVar);
        }

        public void onAnimationCancel(PAGView pAGView) {
        }

        public void onAnimationEnd(PAGView pAGView) {
            C66076t tVar = this.f189969d.get();
            boolean z = tVar == null;
            Log.m105924i("Finder.FinderLiveLuckyMoneyBubbleViewCallback", "onAnimationEnd emptyViewCallback:" + z);
            if (tVar != null) {
                PAGView J0 = tVar.mo90121J0();
                if (J0 != null) {
                    J0.setComposition(tVar.f189968n == 1 ? PAGFile.Load(tVar.f189964g.getAssets(), "finder_live_lucky_money_repeated_1.pag") : PAGFile.Load(tVar.f189964g.getAssets(), "finder_live_lucky_money_repeated_2.pag"));
                }
                PAGView J02 = tVar.mo90121J0();
                if (J02 != null) {
                    J02.removeListener(this);
                }
                PAGView J03 = tVar.mo90121J0();
                if (J03 != null) {
                    J03.setRepeatCount(0);
                }
                PAGView J04 = tVar.mo90121J0();
                if (J04 != null) {
                    J04.play();
                }
            }
        }

        public void onAnimationRepeat(PAGView pAGView) {
        }

        public void onAnimationStart(PAGView pAGView) {
        }
    }

    /* renamed from: wg1.t$b */
    public static final class C66078b implements TextureView.SurfaceTextureListener {

        /* renamed from: d */
        public final /* synthetic */ C66076t f189970d;

        public C66078b(C66076t tVar) {
            this.f189970d = tVar;
        }

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            C87412m.m108594g(surfaceTexture, "surface");
            Log.m105924i("Finder.FinderLiveLuckyMoneyBubbleViewCallback", "LotteryBubbleSurface onSurfaceTextureAvailable width: " + i + " height: " + i2 + " pagView: " + this.f189970d.mo90121J0());
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            C87412m.m108594g(surfaceTexture, "surface");
            Log.m105924i("Finder.FinderLiveLuckyMoneyBubbleViewCallback", "LotteryBubbleSurface onSurfaceTextureDestroyed o pagView: " + this.f189970d.mo90121J0());
            return false;
        }

        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            C87412m.m108594g(surfaceTexture, "surface");
            Log.m105924i("Finder.FinderLiveLuckyMoneyBubbleViewCallback", "LotteryBubbleSurface onSurfaceTextureSizeChanged width: " + i + " height: " + i2 + " pagView: " + this.f189970d.mo90121J0());
        }

        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            C87412m.m108594g(surfaceTexture, "surface");
        }
    }

    /* renamed from: wg1.t$c */
    public static final class C66079c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C66076t f189971d;

        public C66079c(C66076t tVar) {
            this.f189971d = tVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/component/FinderLiveAnchorLuckyMoneyBubbleViewCallback$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C66083t1 t1Var = this.f189971d.f189965h;
            if (t1Var != null) {
                t1Var.mo90134b();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/component/FinderLiveAnchorLuckyMoneyBubbleViewCallback$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: wg1.t$d */
    public static final class C66080d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C66076t f189972d;

        public C66080d(C66076t tVar) {
            this.f189972d = tVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/component/FinderLiveAnchorLuckyMoneyBubbleViewCallback$initView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C66083t1 t1Var = this.f189972d.f189965h;
            if (t1Var != null) {
                t1Var.mo90134b();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/component/FinderLiveAnchorLuckyMoneyBubbleViewCallback$initView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: wg1.t$e */
    public static final class C66081e implements C118148a {

        /* renamed from: a */
        public final /* synthetic */ C66076t f189973a;

        public C66081e(C66076t tVar) {
            this.f189973a = tVar;
        }

        /* renamed from: a */
        public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
            return false;
        }

        /* renamed from: b */
        public final Map<String, Object> mo37b(String str) {
            C66083t1 t1Var = this.f189973a.f189965h;
            if (t1Var == null) {
                return null;
            }
            String F0 = t1Var.mo90133F0();
            if (F0 == null) {
                F0 = "";
            }
            int i = 1;
            C13604l[] lVarArr = new C13604l[1];
            if (!C87412m.m108589b(F0, "")) {
                i = 2;
            }
            lVarArr[0] = new C13604l("cur_red_packet_source", Integer.valueOf(i));
            return C90364q0.m113148g(lVarArr);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66076t(MMActivity mMActivity, C66083t1 t1Var, C45795b bVar, View view, FrameBubbleContentLayout frameBubbleContentLayout) {
        super(view, frameBubbleContentLayout);
        C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(view, "rootView");
        this.f189964g = mMActivity;
        this.f189965h = t1Var;
        C58739j4.f168176a.mo83714i0("FinderLiveLuckyMoneyBubbleViewCallback");
    }

    /* renamed from: D */
    public void mo86885D(Bundle bundle) {
        mo90066P(this.f189968n);
        View E0 = mo86886E0(C0966R.C0970id.a8r);
        if (!(E0 instanceof View)) {
            E0 = null;
        }
        if (E0 != null) {
            E0.setOnClickListener(new C66084u(this));
        }
    }

    /* renamed from: F0 */
    public String mo86887F0() {
        return "Finder.FinderLiveLuckyMoneyBubbleViewCallback";
    }

    /* renamed from: I0 */
    public final TextView mo90120I0() {
        View E0 = mo86886E0(C0966R.C0970id.bf9);
        if (E0 instanceof TextView) {
            return (TextView) E0;
        }
        return null;
    }

    /* renamed from: J0 */
    public final PAGView mo90121J0() {
        View E0 = mo86886E0(C0966R.C0970id.gbv);
        if (E0 instanceof PAGView) {
            return (PAGView) E0;
        }
        return null;
    }

    /* renamed from: P */
    public void mo90066P(int i) {
        Log.m105924i("Finder.FinderLiveLuckyMoneyBubbleViewCallback", "updateLuckyMoneyCount: count:" + i + ", currentCnt=" + this.f189968n + ", pagView:" + mo90121J0() + ", isPagEnable:" + this.f189967j);
        int i2 = 0;
        if (i < 1) {
            View b = mo86891b();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view = b;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/component/FinderLiveAnchorLuckyMoneyBubbleViewCallback", "updateLuckyMoneyCount", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            b.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/component/FinderLiveAnchorLuckyMoneyBubbleViewCallback", "updateLuckyMoneyCount", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mo86889H0();
            return;
        }
        if (i == 1) {
            PAGView J0 = mo90121J0();
            if (J0 != null) {
                J0.setComposition(PAGFile.Load(this.f189964g.getAssets(), "finder_live_lucky_money_section_1.pag"));
            }
        } else {
            PAGView J02 = mo90121J0();
            if (J02 != null) {
                J02.setComposition(this.f189968n < 1 ? PAGFile.Load(this.f189964g.getAssets(), "finder_live_lucky_money_complete.pag") : PAGFile.Load(this.f189964g.getAssets(), "finder_live_lucky_money_section_2.pag"));
            }
        }
        this.f189968n = i;
        PAGView J03 = mo90121J0();
        if (J03 != null) {
            J03.setProgress(0.0d);
        }
        PAGView J04 = mo90121J0();
        if (J04 != null) {
            J04.setRepeatCount(1);
        }
        PAGView J05 = mo90121J0();
        if (J05 != null) {
            J05.play();
        }
        PAGView J06 = mo90121J0();
        if (J06 != null) {
            J06.addListener(this.f189966i);
        }
        if (mo86891b().getVisibility() == 8) {
            View b2 = mo86891b();
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(0);
            C117292a.m165358d(b2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/component/FinderLiveAnchorLuckyMoneyBubbleViewCallback", "updateLuckyMoneyCount", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            b2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(b2, "com/tencent/mm/plugin/finder/live/component/FinderLiveAnchorLuckyMoneyBubbleViewCallback", "updateLuckyMoneyCount", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mo11421k0();
        }
        FrameBubbleContentLayout frameBubbleContentLayout = this.f176277f;
        if (frameBubbleContentLayout != null && frameBubbleContentLayout.f159272i == 2) {
            TextView I0 = mo90120I0();
            if (I0 != null) {
                I0.setVisibility(0);
            }
            if (i <= 1) {
                TextView I02 = mo90120I0();
                if (I02 != null) {
                    I02.setText(this.f189964g.getResources().getString(C0966R.string.n94));
                    return;
                }
                return;
            }
            if (2 <= i && i < 10) {
                TextView I03 = mo90120I0();
                if (I03 != null) {
                    I03.setText(this.f189964g.getResources().getString(C0966R.string.f360614n93, new Object[]{Integer.valueOf(i)}));
                    return;
                }
                return;
            }
            TextView I04 = mo90120I0();
            if (I04 != null) {
                StringBuilder sb = new StringBuilder();
                sb.append('x');
                sb.append(i);
                I04.setText(sb.toString());
                return;
            }
            return;
        }
        TextView I05 = mo90120I0();
        if (I05 != null) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append('x');
            sb4.append(i);
            I05.setText(sb4.toString());
        }
        TextView I06 = mo90120I0();
        if (I06 != null) {
            if (i == 1) {
                i2 = 8;
            }
            I06.setVisibility(i2);
        }
    }

    /* renamed from: a */
    public void mo90067a() {
        Class cls = C61212e.class;
        TextView I0 = mo90120I0();
        if (I0 != null) {
            C62042e.f176370a.mo87033P1(I0);
        }
        this.f189966i = new C66077a(this);
        PAGView J0 = mo90121J0();
        if (J0 != null) {
            J0.addListener(this.f189966i);
        }
        PAGView J02 = mo90121J0();
        if (J02 != null) {
            J02.setSurfaceTextureListener(new C66078b(this));
        }
        View b = mo86891b();
        if (b != null) {
            b.setOnClickListener(new C66079c(this));
        }
        View E0 = mo86886E0(C0966R.C0970id.a8r);
        if (!(E0 instanceof View)) {
            E0 = null;
        }
        if (E0 != null) {
            E0.setOnClickListener(new C66080d(this));
        }
        ((C61212e) C86312j.m106911c(cls)).o30(mo90121J0(), "finder_live_red_packet");
        if (!C62042e.f176370a.mo87027N0()) {
            ((C61212e) C86312j.m106911c(cls)).mo86175pO(mo90121J0(), 40, 25561);
            ((C61212e) C86312j.m106911c(cls)).E60(mo90121J0(), new C66081e(this));
        }
    }

    public void destroy() {
    }

    /* renamed from: e */
    public View mo90069e() {
        return mo86891b();
    }

    public MMFragmentActivity getActivity() {
        return this.f189964g;
    }

    /* renamed from: m0 */
    public void mo86892m0(Bundle bundle) {
        mo90066P(this.f189968n);
        View E0 = mo86886E0(C0966R.C0970id.a8r);
        if (!(E0 instanceof View)) {
            E0 = null;
        }
        if (E0 != null) {
            E0.setOnClickListener(new C66084u(this));
        }
    }

    public void release() {
        View b = mo86891b();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(b, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/component/FinderLiveAnchorLuckyMoneyBubbleViewCallback", "release", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        b.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(b, "com/tencent/mm/plugin/finder/live/component/FinderLiveAnchorLuckyMoneyBubbleViewCallback", "release", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        reset();
        mo86889H0();
    }

    public void reset() {
        PAGView J0;
        PAGView J02 = mo90121J0();
        boolean z = true;
        if (J02 == null || !J02.isPlaying()) {
            z = false;
        }
        if (z && (J0 = mo90121J0()) != null) {
            J0.stop();
        }
        PAGView J03 = mo90121J0();
        if (J03 != null) {
            J03.removeListener(this.f189966i);
        }
    }

    /* renamed from: y */
    public Bundle mo86895y() {
        PAGView J0 = mo90121J0();
        if (J0 != null) {
            J0.setProgress(0.5d);
        }
        reset();
        return null;
    }
}
