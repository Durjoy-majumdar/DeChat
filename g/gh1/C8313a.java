package gh1;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import cl1.C54991o;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomController;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomControllerStore;
import com.tencent.p014mm.plugin.finder.live.view.C3206b2;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import fy3.C32224a;
import gy3.C87412m;
import hh1.C59905m;
import java.util.regex.Pattern;
import o40.C61926c;
import qj1.C62660c;
import rx3.C13598b0;

/* renamed from: gh1.a */
public abstract class C8313a extends LiveRoomController implements C59462y, C59905m {

    /* renamed from: d */
    public final String f27260d = "BaseLiveRoomController";

    /* renamed from: e */
    public C3206b2 f27261e;

    /* renamed from: f */
    public int f27262f;

    /* renamed from: g */
    public C32224a<C13598b0> f27263g;

    /* renamed from: h */
    public C32224a<C13598b0> f27264h;

    /* renamed from: i */
    public C59461x f27265i;

    /* renamed from: gh1.a$a */
    public static final class C8314a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C8313a f27266d;

        public C8314a(C8313a aVar) {
            this.f27266d = aVar;
        }

        public final void run() {
            if (this.f27266d.mo9310g3()) {
                C32224a<C13598b0> aVar = this.f27266d.f27264h;
                if (aVar != null) {
                    if (aVar != null) {
                        aVar.invoke();
                    }
                    this.f27266d.f27264h = null;
                    return;
                }
                return;
            }
            C32224a<C13598b0> aVar2 = this.f27266d.f27263g;
            if (aVar2 != null) {
                if (aVar2 != null) {
                    aVar2.invoke();
                }
                this.f27266d.f27263g = null;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8313a(LiveRoomControllerStore liveRoomControllerStore) {
        super(liveRoomControllerStore);
        C87412m.m108594g(liveRoomControllerStore, "store");
    }

    /* renamed from: I */
    public void mo9305I(int i) {
        int i2 = this.f27262f;
        Pattern pattern = C61926c.f176038a;
        int i3 = (~i) & i2;
        this.f27262f = i3;
        mo9314l3(i3);
    }

    public final void afterViewMount(ViewGroup viewGroup) {
        C87412m.m108594g(viewGroup, "pluginLayout");
        viewGroup.postDelayed(new C8314a(this), 600);
    }

    /* renamed from: c3 */
    public final MMActivity mo9306c3() {
        C3206b2 b2Var = this.f27261e;
        View view = b2Var instanceof View ? (View) b2Var : null;
        Context context = view != null ? view.getContext() : null;
        if (context instanceof MMActivity) {
            return (MMActivity) context;
        }
        return null;
    }

    /* renamed from: d3 */
    public final <T extends C62660c> T mo9307d3(Class<T> cls) {
        C87412m.m108594g(cls, "modelClass");
        C3206b2 b2Var = this.f27261e;
        if (b2Var != null) {
            return b2Var.getPlugin(cls);
        }
        return null;
    }

    /* renamed from: e3 */
    public final <T extends View> T mo9308e3(int i) {
        C3206b2 b2Var = this.f27261e;
        View view = b2Var instanceof View ? (View) b2Var : null;
        if (view != null) {
            return view.findViewById(i);
        }
        return null;
    }

    /* renamed from: f3 */
    public final <T extends View> T mo9309f3(int i, int i2) {
        C3206b2 b2Var = this.f27261e;
        T t = null;
        View view = b2Var instanceof View ? (View) b2Var : null;
        if (view == null) {
            return null;
        }
        T findViewById = view.findViewById(i2);
        if (findViewById != null) {
            return findViewById;
        }
        ViewStub viewStub = (ViewStub) view.findViewById(i);
        T inflate = viewStub != null ? viewStub.inflate() : null;
        if (inflate instanceof View) {
            t = inflate;
        }
        return t;
    }

    /* renamed from: g3 */
    public final boolean mo9310g3() {
        Resources resources;
        Configuration configuration;
        Resources resources2;
        Resources resources3;
        Resources resources4;
        Configuration configuration2;
        C3206b2 b2Var = this.f27261e;
        Configuration configuration3 = null;
        View view = b2Var instanceof View ? (View) b2Var : null;
        Context context = view != null ? view.getContext() : null;
        String str = this.f27260d;
        StringBuilder sb = new StringBuilder();
        sb.append("isLandscape orientation: ");
        sb.append((context == null || (resources4 = context.getResources()) == null || (configuration2 = resources4.getConfiguration()) == null) ? null : Integer.valueOf(configuration2.orientation));
        sb.append(" context: ");
        sb.append(context);
        sb.append("  hashCode: ");
        Configuration configuration4 = (context == null || (resources3 = context.getResources()) == null) ? null : resources3.getConfiguration();
        sb.append(configuration4 != null ? configuration4.hashCode() : 0);
        sb.append(" configuration: ");
        if (!(context == null || (resources2 = context.getResources()) == null)) {
            configuration3 = resources2.getConfiguration();
        }
        sb.append(configuration3);
        Log.m105924i(str, sb.toString());
        return (context == null || (resources = context.getResources()) == null || (configuration = resources.getConfiguration()) == null || configuration.orientation != 2) ? false : true;
    }

    /* renamed from: i3 */
    public final void mo9311i3(String str, String str2) {
        C87412m.m108594g(str, "tag");
        C87412m.m108594g(str2, "str");
        Log.m105924i(str, hashCode() + ' ' + str2);
    }

    /* renamed from: j3 */
    public final void mo9312j3(C32224a<C13598b0> aVar) {
        Class cls = C54991o.class;
        C87412m.m108594g(aVar, "callback");
        this.f27263g = aVar;
        C3206b2 b2Var = this.f27261e;
        C56032b bVar = b2Var instanceof C56032b ? (C56032b) b2Var : null;
        if (bVar != null) {
            bVar.onPortraitAction(((C54991o) business(cls)).f154295b1, ((C54991o) business(cls)).f154291a1, (Bundle) null, (Object) null);
        }
    }

    /* renamed from: k3 */
    public final void mo9313k3(C58124b.C58125b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        C3206b2 b2Var = this.f27261e;
        C56032b bVar2 = b2Var instanceof C56032b ? (C56032b) b2Var : null;
        if (bVar2 != null) {
            bVar2.statusChange(bVar, bundle);
        }
    }

    /* renamed from: l3 */
    public void mo9314l3(int i) {
    }

    /* renamed from: m */
    public boolean mo9315m() {
        return true;
    }

    public void onLiveDeactivate() {
        this.f27263g = null;
        this.f27264h = null;
    }

    public void onViewUnmount(ViewGroup viewGroup) {
        C87412m.m108594g(viewGroup, "pluginLayout");
        this.f27265i = null;
    }

    /* renamed from: r */
    public void mo9316r(int i) {
        this.f27262f = i;
        mo9314l3(i);
    }

    /* renamed from: y1 */
    public void mo9317y1(int i) {
        int i2 = this.f27262f;
        Pattern pattern = C61926c.f176038a;
        int i3 = i | i2;
        this.f27262f = i3;
        mo9314l3(i3);
    }
}
