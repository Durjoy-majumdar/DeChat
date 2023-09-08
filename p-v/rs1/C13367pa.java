package rs1;

import android.os.Looper;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C113200q;
import bl3.C39818r;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.p056ui.fragment.FinderHomeTabFragment;
import com.tencent.p014mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore;
import com.tencent.p014mm.plugin.finder.view.C4194v2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import do1.C58341h;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.HashMap;
import java.util.Map;
import os1.C11739f;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

@C113200q(initialMode = 2)
/* renamed from: rs1.pa */
public final class C13367pa extends UIComponent implements C4194v2 {

    /* renamed from: d */
    public final C13601g f37878d = C36568h.m40985a(C13369b.f37882d);

    /* renamed from: e */
    public final HashMap<Integer, Runnable> f37879e = new HashMap<>();

    /* renamed from: f */
    public final C13601g f37880f = C36568h.m40985a(C13370c.f37883d);

    /* renamed from: rs1.pa$a */
    public abstract class C13368a implements Runnable {

        /* renamed from: d */
        public final int f37881d;

        public C13368a(C13367pa paVar, int i) {
            this.f37881d = i;
        }
    }

    /* renamed from: rs1.pa$b */
    public static final class C13369b extends C87413o implements C32224a<MMHandler> {

        /* renamed from: d */
        public static final C13369b f37882d = new C13369b();

        public C13369b() {
            super(0);
        }

        public Object invoke() {
            return new MMHandler(Looper.getMainLooper());
        }
    }

    /* renamed from: rs1.pa$c */
    public static final class C13370c extends C87413o implements C32224a<C11739f> {

        /* renamed from: d */
        public static final C13370c f37883d = new C13370c();

        public C13370c() {
            super(0);
        }

        public Object invoke() {
            return (C11739f) C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C11739f.class);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13367pa(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: k */
    public void mo5077k(int i, int i2, int i3, int i4) {
        Runnable remove = this.f37879e.remove(Integer.valueOf(i4));
        if (remove != null) {
            Log.m105924i("FinderTabPreloadUIC", "onFragmentChange: tabType = " + i4 + ", remove inside preload by fragment visible");
            ((MMHandler) ((C36570n) this.f37878d).getValue()).removeCallbacks(remove);
        }
    }

    public void onDestroy() {
        for (Map.Entry<Integer, Runnable> value : this.f37879e.entrySet()) {
            ((MMHandler) ((C36570n) this.f37878d).getValue()).removeCallbacks((Runnable) value.getValue());
        }
        this.f37879e.clear();
        for (C58341h hVar : ((FinderStreamTabPreloadCore) C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(FinderStreamTabPreloadCore.class)).f160333e) {
            C58341h.C58342a aVar = hVar.f167040p;
            if (aVar.f167044b != null && aVar.f167045c == C58341h.C58344f.InsideTimeout) {
                hVar.mo83089e(true, "clearAllInside");
            }
        }
    }

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageScrolled(int i, float f, int i2) {
    }

    /* renamed from: v */
    public void mo5078v(boolean z, int i, FinderHomeTabFragment finderHomeTabFragment) {
        C87412m.m108594g(finderHomeTabFragment, "fragment");
    }
}
