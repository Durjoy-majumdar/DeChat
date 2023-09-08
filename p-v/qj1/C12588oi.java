package qj1;

import android.content.Context;
import bd1.C39758f;
import bd1.C39759i;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.plugin.FinderVisitorRoleChooserPlugin;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import o40.C61926c;
import ok1.C62042e;
import qg1.C12217a0;
import rx3.C13598b0;
import te3.C50231l91;
import zc1.C66785b;

/* renamed from: qj1.oi */
public final class C12588oi implements C12217a0.C12218a {

    /* renamed from: a */
    public final /* synthetic */ FinderVisitorRoleChooserPlugin f36110a;

    /* renamed from: b */
    public final /* synthetic */ int f36111b;

    /* renamed from: qj1.oi$a */
    public static final class C12589a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderVisitorRoleChooserPlugin f36112d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12589a(FinderVisitorRoleChooserPlugin finderVisitorRoleChooserPlugin) {
            super(0);
            this.f36112d = finderVisitorRoleChooserPlugin;
        }

        public Object invoke() {
            C62042e eVar = C62042e.f176370a;
            Context context = this.f36112d.getContext();
            C87412m.m108593f(context, "context");
            String string = MMApplicationContext.getContext().getResources().getString(C0966R.string.e_o);
            C87412m.m108593f(string, "getContext().resources.g…_visitor_role_chang_fail)");
            eVar.mo87041S1(context, string);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: qj1.oi$b */
    public static final class C12590b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderVisitorRoleChooserPlugin f36113d;

        /* renamed from: e */
        public final /* synthetic */ int f36114e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12590b(FinderVisitorRoleChooserPlugin finderVisitorRoleChooserPlugin, int i) {
            super(0);
            this.f36113d = finderVisitorRoleChooserPlugin;
            this.f36114e = i;
        }

        public Object invoke() {
            C61926c.m72668M(new C12605pi(this.f36113d));
            C66785b bVar = C66785b.f191882e;
            C39758f fVar = new C39758f();
            int i = this.f36114e;
            FinderVisitorRoleChooserPlugin finderVisitorRoleChooserPlugin = this.f36113d;
            fVar.f131584h = i;
            String tag = finderVisitorRoleChooserPlugin.getTAG();
            Log.m105924i(tag, "[changeRole] current_alias_role_type:" + fVar.f131584h);
            bVar.mo90665S0(fVar, C39759i.SAVE_ROLE_CHOOSER);
            return C13598b0.f38549a;
        }
    }

    public C12588oi(FinderVisitorRoleChooserPlugin finderVisitorRoleChooserPlugin, int i) {
        this.f36110a = finderVisitorRoleChooserPlugin;
        this.f36111b = i;
    }

    /* renamed from: a */
    public void mo11951a(int i, int i2, String str) {
        Log.m105924i(this.f36110a.getTAG(), "[CgiFinderLiveSwitchIdentity] failed");
        C61926c.m72668M(new C12589a(this.f36110a));
    }

    /* renamed from: b */
    public void mo11952b(C50231l91 l912) {
        C87412m.m108594g(l912, "resp");
        String tag = this.f36110a.getTAG();
        Log.m105924i(tag, "[CgiFinderLiveSwitchIdentity] success USERINFO_FINDER_LIVE_VISITOR_ROLE_INT_SYNC " + this.f36111b);
        C61926c.m72668M(new C12590b(this.f36110a, this.f36111b));
    }
}
