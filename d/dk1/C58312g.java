package dk1;

import ak1.C54067f0;
import ak1.C54108o;
import al1.C54127h;
import al1.C54129i;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cj1.C54741c;
import com.tencent.p014mm.live.api.LiveConfig;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.live.FinderLivePresenter;
import com.tencent.p014mm.plugin.finder.live.sidebar.FinderLiveSideBar;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C7335d;
import di3.C86312j;
import gy3.C87412m;
import ht1.C60172g4;
import ht1.C8777j5;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import o40.C61926c;
import org.json.JSONObject;
import rx3.C13604l;
import z04.C112551y;

/* renamed from: dk1.g */
public final class C58312g extends UIComponent {

    /* renamed from: d */
    public final String f166966d = "Finder.FinderLiveSideBarUIC";

    /* renamed from: e */
    public boolean f166967e;

    /* renamed from: f */
    public FinderLiveSideBar f166968f;

    /* renamed from: g */
    public FinderLivePresenter f166969g;

    /* renamed from: h */
    public final LinkedList<C54741c> f166970h = new LinkedList<>();

    /* renamed from: i */
    public C58313a f166971i = new C58313a(0);

    /* renamed from: dk1.g$a */
    public final class C58313a {

        /* renamed from: a */
        public int f166972a;

        /* renamed from: b */
        public long f166973b;

        /* renamed from: c */
        public boolean f166974c;

        /* renamed from: d */
        public int f166975d = -1;

        /* renamed from: e */
        public int f166976e = -1;

        /* renamed from: f */
        public int f166977f = -1;

        /* renamed from: g */
        public int f166978g = 2;

        /* renamed from: h */
        public int f166979h = 2;

        /* renamed from: i */
        public final HashSet<Integer> f166980i = new HashSet<>();

        public C58313a(int i) {
            this.f166972a = i;
        }

        /* renamed from: a */
        public final String mo83063a(String str, String str2, String str3) {
            try {
                JSONObject jSONObject = new JSONObject(C112551y.m153814n(str, ";", ",", false));
                jSONObject.put(str2, str3);
                String jSONObject2 = jSONObject.toString();
                C87412m.m108593f(jSONObject2, "jsonObject.toString()");
                return C112551y.m153814n(jSONObject2, ",", ";", false);
            } catch (Exception e) {
                String str4 = C58312g.this.f166966d;
                Log.m105924i(str4, "report appendChnlExtra error, " + e.getMessage());
                return str;
            }
        }

        /* renamed from: b */
        public final C13604l<Boolean, String> mo83064b() {
            String z3 = ((C60172g4) C39818r.f106831a.mo62443b(C58312g.this.getContext()).mo62447c(C60172g4.class)).mo12868z3();
            String a = this.f166974c ? mo83063a(mo83063a(z3, "active_id", String.valueOf(this.f166972a)), "active_index", String.valueOf(this.f166976e)) : mo83063a(mo83063a(mo83063a(z3, "single_stream_type", "active"), "active_id", String.valueOf(this.f166972a)), "active_index", String.valueOf(this.f166976e));
            String str = C58312g.this.f166966d;
            Log.m105924i(str, C58312g.this.f166971i.hashCode() + "report genJoinLiveChnlExtra " + this.f166974c + ", " + this.f166972a + ", " + this.f166976e + ", " + a);
            return new C13604l<>(Boolean.valueOf(this.f166974c), a);
        }

        /* renamed from: c */
        public final void mo83065c() {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("banner_type", "common_recmd");
            linkedHashMap.put("active_id", String.valueOf(this.f166972a));
            linkedHashMap.put("screen_type", C58312g.this.getContext().getResources().getConfiguration().orientation == 2 ? "2" : "1");
            C7335d c = C86312j.m106911c(C54108o.class);
            C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
            C8777j5.C8778a.m8606g((C8777j5) c, C54067f0.C0064m.SIDEBAR_BANNER, linkedHashMap, (String) null, 4, (Object) null);
            String str = C58312g.this.f166966d;
            Log.m105924i(str, "report reportBannerClick " + this.f166972a);
        }

        /* renamed from: d */
        public final void mo83066d(int i, C58307a aVar, int i2) {
            String str;
            C54129i q;
            C54127h b;
            LiveConfig liveConfig;
            if (aVar == null) {
                Log.m105924i(C58312g.this.f166966d, "report reportSideBarItemExpose feed is null");
                return;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("banner_type", "common_recmd");
            linkedHashMap.put("active_id", String.valueOf(this.f166972a));
            linkedHashMap.put("active_index", String.valueOf(i));
            linkedHashMap.put("card_exp_type", String.valueOf(i2));
            linkedHashMap.put("liveId", C61926c.m72691p(aVar.f166953d.f151977d.f157064e));
            linkedHashMap.put("feedId", C61926c.m72691p(aVar.f166953d.f151977d.f157075s));
            FinderLivePresenter finderLivePresenter = C58312g.this.f166969g;
            if (finderLivePresenter == null || (q = finderLivePresenter.mo77507q()) == null || (b = q.mo74924b()) == null || (liveConfig = b.f151977d) == null || (str = Long.valueOf(liveConfig.f157064e).toString()) == null) {
                str = "";
            }
            linkedHashMap.put("liveid_id", str);
            ((C54108o) C86312j.m106911c(C54108o.class)).mo9602Jz(C54067f0.C0066n.SIDEBAR_CARD, linkedHashMap);
            String str2 = C58312g.this.f166966d;
            Log.m105924i(str2, "report reportSideBarItemExpose " + this.f166972a + ", " + i + ", " + C61926c.m72691p(aVar.f166953d.f151977d.f157064e) + ", " + C61926c.m72691p(aVar.f166953d.f151977d.f157075s) + ' ');
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58312g(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public final void mo83061c3(boolean z) {
        String str = this.f166966d;
        Log.m105924i(str, "set inSideBarStatus:" + z);
        this.f166967e = z;
    }

    /* renamed from: d3 */
    public final void mo83062d3() {
        FinderLiveSideBar finderLiveSideBar = this.f166968f;
        if (finderLiveSideBar != null) {
            Log.m105924i(finderLiveSideBar.f159510b, "unmount");
            finderLiveSideBar.f159517i.clear();
            finderLiveSideBar.f159518j = 0;
            finderLiveSideBar.f159513e.clear();
            RecyclerView.C16613e adapter = finderLiveSideBar.mo77736c().getAdapter();
            if (adapter != null) {
                adapter.notifyDataSetChanged();
            }
            finderLiveSideBar.mo77742i(false);
        }
    }
}
