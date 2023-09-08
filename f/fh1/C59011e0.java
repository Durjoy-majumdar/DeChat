package fh1;

import a14.C53872d1;
import a14.C53884f2;
import a14.C53934p0;
import a14.C53973z1;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomControllerStore;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gh1.C59453p;
import gh1.C59461x;
import gh1.C8313a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import nk1.C11207i;
import org.libpag.PAGView;
import sx3.C110818d0;
import sx3.C26236u;
import sx3.C64186f0;
import te3.C48762au0;
import te3.C52005xq0;
import te3.C52051y11;
import te3.C52199z11;
import te3.C52213z4;
import wx3.C15601d;

/* renamed from: fh1.e0 */
public final class C59011e0 extends C8313a {

    /* renamed from: j */
    public final String f168837j = "Finder.HotCommentAnimationController";

    /* renamed from: n */
    public final String f168838n = "hotcommentanimation";

    /* renamed from: o */
    public final ArrayList<C52051y11> f168839o = new ArrayList<>();

    /* renamed from: p */
    public final ConcurrentLinkedQueue<C48762au0> f168840p = new ConcurrentLinkedQueue<>();

    /* renamed from: q */
    public C53973z1 f168841q;

    /* renamed from: r */
    public C59453p f168842r;

    /* renamed from: s */
    public PAGView f168843s;

    /* renamed from: fh1.e0$a */
    public static final class C45785a extends C87413o implements C32226l<C52051y11, CharSequence> {

        /* renamed from: d */
        public static final C45785a f123683d = new C45785a();

        public C45785a() {
            super(1);
        }

        public Object invoke(Object obj) {
            C52051y11 y112 = (C52051y11) obj;
            C87412m.m108594g(y112, LocaleUtil.ITALIAN);
            StringBuilder sb = new StringBuilder();
            sb.append(y112.f145072f);
            sb.append(" port:");
            C52213z4 z4Var = y112.f145071e;
            Integer num = null;
            sb.append(z4Var != null ? z4Var.f145681d : null);
            sb.append(", duration");
            C52213z4 z4Var2 = y112.f145071e;
            sb.append(z4Var2 != null ? Integer.valueOf(z4Var2.f145682e) : null);
            sb.append(", land:");
            C52213z4 z4Var3 = y112.f145070d;
            sb.append(z4Var3 != null ? z4Var3.f145681d : null);
            sb.append(", duration:");
            C52213z4 z4Var4 = y112.f145070d;
            if (z4Var4 != null) {
                num = Integer.valueOf(z4Var4.f145682e);
            }
            sb.append(num);
            return sb.toString();
        }
    }

    /* renamed from: fh1.e0$b */
    public static final class C59012b implements C59461x {

        /* renamed from: a */
        public final /* synthetic */ C59011e0 f168844a;

        public C59012b(C59011e0 e0Var) {
            this.f168844a = e0Var;
        }

        /* renamed from: a */
        public List<C59453p> mo9171a() {
            C59453p pVar = this.f168844a.f168842r;
            return pVar != null ? C26236u.m33719b(pVar) : C64186f0.f181907d;
        }

        /* renamed from: b */
        public List<C59453p> mo9172b() {
            C59453p pVar = this.f168844a.f168842r;
            return pVar != null ? C26236u.m33719b(pVar) : C64186f0.f181907d;
        }

        /* renamed from: c */
        public void mo9173c(boolean z) {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59011e0(LiveRoomControllerStore liveRoomControllerStore) {
        super(liveRoomControllerStore);
        C87412m.m108594g(liveRoomControllerStore, "store");
    }

    /* renamed from: m3 */
    public final void mo84234m3(C48762au0 au02) {
        C87412m.m108594g(au02, "animationInfo");
        String str = this.f168837j;
        Log.m105924i(str, "addAnimation " + au02.f130772d);
        this.f168840p.add(au02);
        C53973z1 z1Var = this.f168841q;
        boolean z = false;
        if (z1Var != null && !((C53884f2) z1Var).isCancelled()) {
            C53973z1 z1Var2 = this.f168841q;
            if (z1Var2 != null && !((C53884f2) z1Var2).mo74530c()) {
                z = true;
            }
            if (z) {
                return;
            }
        }
        String str2 = this.f168837j;
        Log.m105924i(str2, "checkStartJob launch, animationPlayQueue size:" + this.f168840p.size());
        this.f168841q = C11207i.m11071g(this, C53872d1.f151119c, (C53934p0) null, new C59005d0(this, (C15601d<? super C59005d0>) null), 2, (Object) null);
    }

    /* renamed from: n3 */
    public final void mo84235n3() {
        Log.m105924i(this.f168837j, "checkInitView");
        if (!this.f168839o.isEmpty()) {
            View f3 = mo9309f3(C0966R.C0970id.o6z, C0966R.C0970id.o6y);
            if (f3 != null) {
                this.f168842r = new C59453p(f3, this);
                this.f168843s = (PAGView) f3.findViewById(C0966R.C0970id.o8m);
                String str = this.f168837j;
                StringBuilder sb = new StringBuilder();
                sb.append("checkInitView pagView:");
                PAGView pAGView = this.f168843s;
                sb.append(pAGView != null ? pAGView.hashCode() : 0);
                Log.m105924i(str, sb.toString());
                return;
            }
            return;
        }
        Log.m105924i(this.f168837j, "checkInitView but animationResourceList is empty, ignore");
    }

    public void onLiveActivate() {
    }

    public void onLiveStart(C52005xq0 xq02) {
        C52199z11 z112;
        LinkedList<C52051y11> linkedList;
        super.onLiveStart(xq02);
        this.f168839o.clear();
        if (!(xq02 == null || (z112 = xq02.f144843d1) == null || (linkedList = z112.f145630d) == null)) {
            this.f168839o.addAll(linkedList);
        }
        String str = this.f168837j;
        Log.m105924i(str, "onLiveStart animationList:" + C110818d0.m150921S(this.f168839o, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C45785a.f123683d, 31, (Object) null));
        mo84235n3();
    }

    public void onViewMount(ViewGroup viewGroup) {
        C87412m.m108594g(viewGroup, "pluginLayout");
        super.onViewMount(viewGroup);
        this.f168840p.clear();
        this.f27265i = new C59012b(this);
        mo84235n3();
    }

    public void onViewUnmount(ViewGroup viewGroup) {
        C87412m.m108594g(viewGroup, "pluginLayout");
        this.f27265i = null;
        this.f168840p.clear();
        this.f168843s = null;
    }
}
