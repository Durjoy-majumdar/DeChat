package mf1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import bl3.C113200q;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.p056ui.FinderHomeUI;
import com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy;
import com.tencent.p014mm.plugin.finder.video.FinderVideoLayout;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import eb0.C31543z5;
import er1.C58784w3;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60171g1;
import ht1.C8776j2;
import ht1.C8808v4;
import j20.C117292a;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import pf1.C11888a;
import pf1.C11891b;
import pf1.C11894d;
import pf1.C11903i;
import pf1.C11908k;
import pf1.C11917o0;
import pf1.C11919p0;
import pf1.C11920q;
import pf1.C11925t;
import pf1.C11926u;
import pf1.C11927v;
import pf1.C11928w;
import pf1.C11930y;
import pf1.C62266e;
import rf1.C12982a;
import rf1.C12991c;
import rf1.C12992d;
import rs1.C13442s8;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C64197v;
import sx3.C90364q0;

@C113200q(initialMode = 2)
/* renamed from: mf1.a1 */
public final class C10786a1 extends C10846o0 implements C8776j2 {

    /* renamed from: D */
    public static final Map<Integer, Integer> f32256D = C90364q0.m113147f(new C13604l(1, Integer.valueOf(C0966R.C0970id.mzf)), new C13604l(2, Integer.valueOf(C0966R.C0970id.mzg)), new C13604l(3, Integer.valueOf(C0966R.C0970id.mzh)), new C13604l(4, Integer.valueOf(C0966R.C0970id.mzi)), new C13604l(5, Integer.valueOf(C0966R.C0970id.mze)), new C13604l(6, Integer.valueOf(C0966R.C0970id.mzd)), new C13604l(7, Integer.valueOf(C0966R.C0970id.n8e)), new C13604l(9, Integer.valueOf(C0966R.C0970id.gqw)), new C13604l(10, Integer.valueOf(C0966R.C0970id.gr8)), new C13604l(11, Integer.valueOf(C0966R.C0970id.f6196x7)), new C13604l(12, Integer.valueOf(C0966R.C0970id.ocw)));

    /* renamed from: E */
    public static final Map<Integer, Integer> f32257E;

    /* renamed from: A */
    public boolean f32258A;

    /* renamed from: B */
    public final C88144b.C9614f f32259B = new C10791e(this);

    /* renamed from: C */
    public final List<Integer> f32260C = C64197v.m75537f(11, 13);

    /* renamed from: v */
    public final long f32261v = C31543z5.m39453c();

    /* renamed from: w */
    public boolean f32262w;

    /* renamed from: x */
    public long f32263x;

    /* renamed from: y */
    public C60905o f32264y;

    /* renamed from: z */
    public final List<Integer> f32265z = C64197v.m75537f(52, 1, 58);

    /* renamed from: mf1.a1$a */
    public static final class C10787a extends C10788b<LinearLayout> {
        public C10787a() {
            super(7);
        }

        /* renamed from: a */
        public ViewGroup mo11030a(View view) {
            C87412m.m108594g(view, "view");
            LinearLayout linearLayout = (LinearLayout) super.mo11030a(view);
            int dimensionPixelSize = view.getContext().getResources().getDimensionPixelSize(C0966R.dimen.auz);
            int dimensionPixelSize2 = view.getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3725ce);
            if (linearLayout != null) {
                linearLayout.setPadding(0, dimensionPixelSize, 0, dimensionPixelSize2);
            }
            View findViewById = view.findViewById(C0966R.C0970id.n7y);
            if (findViewById != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = findViewById;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/component/FinderFeedJumperUIC$CommentBottomObserver", "getContainLayout", "(Landroid/view/View;)Landroid/widget/LinearLayout;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/feed/component/FinderFeedJumperUIC$CommentBottomObserver", "getContainLayout", "(Landroid/view/View;)Landroid/widget/LinearLayout;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            return linearLayout;
        }
    }

    /* renamed from: mf1.a1$b */
    public static class C10788b<T extends ViewGroup> implements C12991c<T> {

        /* renamed from: a */
        public final int f32266a;

        public C10788b(int i) {
            this.f32266a = i;
        }

        /* renamed from: a */
        public T mo11030a(View view) {
            C87412m.m108594g(view, "view");
            Map<Integer, Integer> map = C10786a1.f32256D;
            Integer num = C10786a1.f32256D.get(Integer.valueOf(this.f32266a));
            return (ViewGroup) view.findViewById(num != null ? num.intValue() : 0);
        }

        /* renamed from: b */
        public int mo11031b(int i) {
            Map<Integer, Integer> map = C10786a1.f32256D;
            Integer num = C10786a1.f32257E.get(Integer.valueOf(i));
            if (num != null) {
                return num.intValue();
            }
            return 0;
        }

        /* renamed from: c */
        public C12982a mo11032c(int i) {
            Map<Integer, Integer> map = C10786a1.f32256D;
            switch (i) {
                case 0:
                    return new C10884z();
                case 1:
                    return new C10793b0();
                case 2:
                    return new C10785a0();
                case 3:
                    return new C10872v();
                case 4:
                    return new C10813e0();
                case 5:
                    return new C10816f0();
                case 6:
                    return new C10859q();
                case 7:
                    return new C10863s();
                case 11:
                    return new C10831k();
                case 12:
                    return new C10828j();
                case 13:
                    return new C10824i();
                case 14:
                    return new C10804c0();
                case 15:
                    return new C10882y();
                case 16:
                    return new C10809d0();
                default:
                    return null;
            }
        }
    }

    /* renamed from: mf1.a1$c */
    public static final class C10789c extends C87413o implements C32226l<C12982a, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60905o f32267d;

        /* renamed from: e */
        public final /* synthetic */ int f32268e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10789c(C60905o oVar, int i) {
            super(1);
            this.f32267d = oVar;
            this.f32268e = i;
        }

        public Object invoke(Object obj) {
            C12982a aVar = (C12982a) obj;
            C87412m.m108594g(aVar, "observer");
            C11920q qVar = aVar.f37015d;
            View view = aVar.f37012a;
            C60905o oVar = this.f32267d;
            int i = this.f32268e;
            if (!(qVar == null || view == null)) {
                C87412m.m108594g(oVar, "holder");
                C11917o0 o0Var = aVar.f37020i;
                if (o0Var != null) {
                    o0Var.mo11774m(oVar, i);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: mf1.a1$d */
    public static final class C10790d extends C87413o implements C32226l<C12982a, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ int f32269d;

        /* renamed from: e */
        public final /* synthetic */ C60905o f32270e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10790d(int i, C60905o oVar) {
            super(1);
            this.f32269d = i;
            this.f32270e = oVar;
        }

        public Object invoke(Object obj) {
            View view;
            C12982a aVar = (C12982a) obj;
            C87412m.m108594g(aVar, "observer");
            C11920q qVar = aVar.f37015d;
            if (!(qVar == null || (view = aVar.f37012a) == null || !qVar.f34847u)) {
                int i = this.f32269d;
                if (i < qVar.f34850x || i >= qVar.f34851y) {
                    C12992d.C12993a.m12458a(aVar, this.f32270e, view, qVar, false, (C32224a) null, 16, (Object) null);
                } else {
                    C12992d.C12993a.m12459b(aVar, this.f32270e, view, qVar, false, (C32224a) null, 16, (Object) null);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: mf1.a1$e */
    public static final class C10791e implements C88144b.C9614f {

        /* renamed from: a */
        public final /* synthetic */ C10786a1 f32271a;

        public C10791e(C10786a1 a1Var) {
            this.f32271a = a1Var;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
            r1 = r3.getComponent();
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo1258a(android.content.Context r1, android.app.Activity r2, android.content.Intent r3, int r4, android.os.Bundle r5) {
            /*
                r0 = this;
                mf1.a1 r1 = r0.f32271a
                r2 = 1
                r1.f32258A = r2
                if (r3 == 0) goto L_0x0012
                android.content.ComponentName r1 = r3.getComponent()
                if (r1 == 0) goto L_0x0012
                java.lang.String r1 = r1.getClassName()
                goto L_0x0013
            L_0x0012:
                r1 = 0
            L_0x0013:
                if (r1 == 0) goto L_0x0023
                mf1.a1 r2 = r0.f32271a
                jq3.o r3 = r2.f32264y
                if (r3 == 0) goto L_0x0023
                mf1.b1 r4 = new mf1.b1
                r4.<init>(r1)
                r2.mo11061f3(r3, r4)
            L_0x0023:
                r1 = 0
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: mf1.C10786a1.C10791e.mo1258a(android.content.Context, android.app.Activity, android.content.Intent, int, android.os.Bundle):boolean");
        }
    }

    static {
        Integer valueOf = Integer.valueOf(C0966R.C0971layout.f359683cy0);
        Integer valueOf2 = Integer.valueOf(C0966R.C0971layout.all);
        f32257E = C90364q0.m113147f(new C13604l(0, Integer.valueOf(C0966R.C0971layout.cl_)), new C13604l(1, Integer.valueOf(C0966R.C0971layout.a_z)), new C13604l(2, Integer.valueOf(C0966R.C0971layout.a_y)), new C13604l(3, Integer.valueOf(C0966R.C0971layout.a8u)), new C13604l(4, Integer.valueOf(C0966R.C0971layout.cop)), new C13604l(7, valueOf), new C13604l(5, valueOf), new C13604l(6, valueOf), new C13604l(12, valueOf2), new C13604l(11, Integer.valueOf(C0966R.C0971layout.alm)), new C13604l(13, valueOf2), new C13604l(15, Integer.valueOf(C0966R.C0971layout.f7160rh)), new C13604l(14, Integer.valueOf(C0966R.C0971layout.d9l)), new C13604l(16, Integer.valueOf(C0966R.C0971layout.f359687ab3)));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10786a1(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: I3 */
    public Map<Integer, C12991c<?>> mo11022I3() {
        return C90364q0.m113147f(new C13604l(2, new C10788b(2)), new C13604l(1, new C10788b(1)), new C13604l(3, new C10788b(3)), new C13604l(4, new C10788b(4)), new C13604l(5, new C10788b(5)), new C13604l(6, new C10788b(6)), new C13604l(7, new C10787a()), new C13604l(9, new C10788b(9)), new C13604l(10, new C10788b(10)), new C13604l(11, new C10788b(11)), new C13604l(12, new C10788b(12)));
    }

    /* renamed from: M3 */
    public final void mo11023M3(int i, boolean z) {
        C60905o oVar;
        if ((z || !this.f32265z.contains(Integer.valueOf(i))) && (oVar = this.f32264y) != null) {
            mo11061f3(oVar, new C10789c(oVar, i));
        }
    }

    /* renamed from: e3 */
    public boolean mo11024e3() {
        return !this.f32262w && !((C8808v4) C86312j.m106911c(C8808v4.class)).mo9635e();
    }

    /* renamed from: i3 */
    public C11930y mo11025i3(C11920q qVar) {
        C87412m.m108594g(qVar, "infoEx");
        FinderJumpInfo finderJumpInfo = qVar.f34827a;
        if (finderJumpInfo.business_type == 2) {
            return (finderJumpInfo.ext_type == 3 || finderJumpInfo.red_packet_type == 1) ? new C11927v() : new C11891b();
        }
        return null;
    }

    /* renamed from: k3 */
    public Map<Integer, Integer> mo11026k3() {
        return f32256D;
    }

    /* renamed from: l3 */
    public C11917o0 mo11027l3(C11920q qVar) {
        C87412m.m108594g(qVar, "infoEx");
        FinderJumpInfo finderJumpInfo = qVar.f34827a;
        int i = finderJumpInfo.business_type;
        if (i == 1) {
            return new C62266e();
        }
        if (i != 2) {
            return i != 3 ? i != 13 ? i != 21 ? i != 25 ? new C11903i() : new C11925t() : new C11919p0() : new C11926u() : new C11928w();
        }
        int i2 = finderJumpInfo.ext_type;
        if (i2 != 1) {
            if (i2 == 3) {
                return finderJumpInfo.red_packet_type == 1 ? !this.f32260C.contains(Integer.valueOf(qVar.f34842p)) ? new C11888a() : new C11908k() : new C11888a();
            }
            if (i2 != 4) {
                return new C11908k();
            }
        }
        return new C11894d();
    }

    /* renamed from: m3 */
    public void mo11028m3(BaseFinderFeed baseFinderFeed, C60905o oVar, View view, C11920q qVar, String str, C12982a aVar) {
        C87412m.m108594g(baseFinderFeed, "feed");
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(qVar, "infoEx");
        C87412m.m108594g(str, FirebaseAnalytics.C113379b.SOURCE);
        C87412m.m108594g(aVar, "observer");
        super.mo11028m3(baseFinderFeed, oVar, view, qVar, str, aVar);
        Object tag = oVar.f44854d.getTag(C0966R.C0970id.ntt);
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        boolean z = false;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        if (C87412m.m108589b(this.f32264y, oVar)) {
            C10817f1 f1Var = qVar.f34823A;
            if (f1Var != null && f1Var.f32317a) {
                z = true;
            }
            if (!z && !booleanValue && !qVar.f34846t) {
                mo11061f3(oVar, new C10871u0(oVar, this));
            }
        }
    }

    public void onFinished() {
        super.onFinished();
        C13442s8 f = C13442s8.f38060Q0.mo12873f(getContext());
        boolean z = false;
        if (f != null && f.mo12846M3()) {
            z = true;
        }
        if (z) {
            mo11023M3(58, true);
        } else if (getContext() instanceof FinderHomeUI) {
            mo11023M3(5, true);
        }
    }

    public void onPause() {
        boolean z = !getContext().isFinishing() && !this.f32258A;
        this.f32258A = false;
        if (z) {
            mo11023M3(52, true);
        }
        C60905o oVar = this.f32264y;
        if (oVar != null) {
            Object obj = oVar.f173503E;
            BaseFinderFeed baseFinderFeed = obj instanceof BaseFinderFeed ? (BaseFinderFeed) obj : null;
            if (baseFinderFeed != null && C58784w3.f168295a.mo83872H0(baseFinderFeed.mo3513o().getFeedObject())) {
                mo11061f3(oVar, new C10807c1(oVar, baseFinderFeed));
            }
        }
        super.onPause();
        this.f32263x = 0;
        C60905o oVar2 = this.f32264y;
        if (oVar2 != null) {
            mo11060L3(oVar2);
        }
        this.f32264y = null;
        C88144b.C9614f fVar = this.f32259B;
        if (fVar == null) {
            List<C88144b.C9613e> list = C88144b.f254911a;
        } else {
            ((CopyOnWriteArrayList) C88144b.f254912b).remove(fVar);
        }
    }

    public void onResume() {
        super.onResume();
        C88144b.C9614f fVar = this.f32259B;
        if (fVar == null) {
            List<C88144b.C9613e> list = C88144b.f254911a;
        } else {
            ((CopyOnWriteArrayList) C88144b.f254912b).add(fVar);
        }
        C60905o oVar = this.f32264y;
        if (oVar != null) {
            FinderVideoLayout finderVideoLayout = (FinderVideoLayout) oVar.mo85812D(C0966R.C0970id.d7a);
            FinderThumbPlayerProxy finderThumbPlayerProxy = null;
            C60171g1 videoView = finderVideoLayout != null ? finderVideoLayout.getVideoView() : null;
            if (videoView instanceof FinderThumbPlayerProxy) {
                finderThumbPlayerProxy = (FinderThumbPlayerProxy) videoView;
            }
            mo11061f3(oVar, new C10790d(finderThumbPlayerProxy != null ? finderThumbPlayerProxy.getCurrentPlaySecond() : 0, oVar));
        }
    }

    public void onStartActivityForResult(Intent intent, int i, Bundle bundle) {
        super.onStartActivityForResult(intent, i, bundle);
        this.f32258A = true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10786a1(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }
}
