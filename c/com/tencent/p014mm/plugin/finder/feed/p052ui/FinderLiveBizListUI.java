package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cl1.C0654b;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.refreshLayout.WxRefreshLayout;
import fy3.C32228q;
import gy3.C87412m;
import hp3.C87581a;
import java.util.Set;
import kotlin.Metadata;
import mq3.C47093a;
import nr3.C89059e;
import o40.C61926c;
import ob0.C89132b;
import qg1.C62611b0;
import qk1.C63218h0;
import rx3.C13598b0;
import te3.C49712hj1;
import te3.C51204s62;
import te3.C64273c21;
import te3.C64281ca1;
import te3.C64675r62;
import vf1.C65718o1;
import vf1.C65721p1;
import vf1.C65723q1;
import vf1.C65725r1;
import vf1.C65726s1;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLiveBizListUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveBizListUI */
public final class FinderLiveBizListUI extends MMFinderUI {

    /* renamed from: v */
    public static final /* synthetic */ int f158960v = 0;

    /* renamed from: o */
    public WxRefreshLayout f158961o;

    /* renamed from: p */
    public RecyclerView f158962p;

    /* renamed from: q */
    public View f158963q;

    /* renamed from: r */
    public View f158964r;

    /* renamed from: s */
    public final C63218h0 f158965s = new C63218h0();

    /* renamed from: t */
    public int f158966t;

    /* renamed from: u */
    public String f158967u;

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveBizListUI$a */
    public static final class C55820a<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ FinderLiveBizListUI f158968a;

        /* renamed from: b */
        public final /* synthetic */ C32228q<Integer, Integer, C51204s62, C13598b0> f158969b;

        public C55820a(FinderLiveBizListUI finderLiveBizListUI, C32228q<? super Integer, ? super Integer, ? super C51204s62, C13598b0> qVar) {
            this.f158968a = finderLiveBizListUI;
            this.f158969b = qVar;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            C62611b0.C35849a aVar = C62611b0.f177808u;
            C87412m.m108593f(cVar, LocaleUtil.ITALIAN);
            C51204s62 s622 = (C51204s62) aVar.mo60444a(cVar, new C51204s62());
            if (s622 != null) {
                FinderLiveBizListUI finderLiveBizListUI = this.f158968a;
                C32228q<Integer, Integer, C51204s62, C13598b0> qVar = this.f158969b;
                if (!(cVar.f256793a == 0) || cVar.f256794b != 0) {
                    int i = FinderLiveBizListUI.f158960v;
                    Log.m105920e("finder_live_biz_list", "GetProfileScreenCastReq Request Fail! errType = " + cVar.f256793a + ", errCode = " + cVar.f256794b + ", errMsg = " + cVar.f256795c);
                } else {
                    finderLiveBizListUI.f158966t = s622.f141346f;
                    finderLiveBizListUI.f158967u = s622.f141347g;
                }
                C61926c.m72668M(new C29956k(qVar, cVar, s622));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: N7 */
    public final void mo77423N7(C32228q<? super Integer, ? super Integer, ? super C51204s62, C13598b0> qVar) {
        C64273c21 c212;
        Class cls = C55001u.class;
        Class cls2 = C54991o.class;
        FinderLiveService finderLiveService = FinderLiveService.f159376d;
        C0654b bVar = (C0654b) finderLiveService.mo77630e(C0654b.class);
        String str = null;
        String str2 = bVar != null ? bVar.f1545g : null;
        if (str2 == null || str2.length() == 0) {
            C54991o oVar = (C54991o) finderLiveService.mo77630e(cls2);
            str2 = oVar != null ? oVar.f154377v3 : null;
        }
        C54991o oVar2 = (C54991o) finderLiveService.mo77630e(cls2);
        if (oVar2 != null) {
            str = oVar2.f154345o;
        }
        C55001u uVar = (C55001u) finderLiveService.mo77630e(cls);
        long j = 0;
        long j2 = uVar != null ? uVar.f154416j : 0;
        C55001u uVar2 = (C55001u) finderLiveService.mo77630e(cls);
        if (!(uVar2 == null || (c212 = uVar2.f154420q) == null)) {
            j = c212.f182392d;
        }
        Log.m105924i("finder_live_biz_list", "username = " + str + ", objectId = " + C61926c.m72691p(j2) + ", liveId = " + j + ", biz username = " + str2);
        C64281ca1 ca12 = new C64281ca1();
        ca12.f182457f = 1;
        ca12.f182458g = str;
        ca12.f182455d = j2;
        ca12.f182456e = j;
        C64675r62 r622 = new C64675r62();
        r622.f185139d = str2;
        r622.f185140e = this.f158966t;
        r622.f185142g = this.f158967u;
        r622.f185141f = 15;
        r622.f185143h = 0;
        C13598b0 b0Var = C13598b0.f38549a;
        C89059e i = new C62611b0("/cgi-bin/mmbiz-bin/finderlivegetprofilescreencast", 9914, r622, ca12, (C49712hj1) null).mo9225i();
        i.mo123420E(new C55820a(this, qVar));
        i.mo11397F(this);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.d1n;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        return null;
    }

    public final void init() {
        View findViewById = findViewById(C0966R.C0970id.is8);
        C87412m.m108593f(findViewById, "findViewById(R.id.retry_layout)");
        this.f158963q = findViewById;
        View findViewById2 = findViewById(C0966R.C0970id.g3t);
        C87412m.m108593f(findViewById2, "findViewById(R.id.loading_view)");
        this.f158964r = findViewById2;
        View view = this.f158963q;
        if (view != null) {
            view.setOnClickListener(new C65723q1(this));
            View findViewById3 = findViewById(C0966R.C0970id.nin);
            C87412m.m108593f(findViewById3, "findViewById(R.id.biz_list)");
            RecyclerView recyclerView = (RecyclerView) findViewById3;
            this.f158962p = recyclerView;
            recyclerView.setAdapter(this.f158965s);
            RecyclerView recyclerView2 = this.f158962p;
            if (recyclerView2 != null) {
                recyclerView2.setLayoutManager(new LinearLayoutManager(this));
                findViewById(C0966R.C0970id.npe).setOnClickListener(new C65725r1(this));
                View findViewById4 = findViewById(C0966R.C0970id.ml8);
                C87412m.m108593f(findViewById4, "findViewById(R.id.refresh_layout)");
                WxRefreshLayout wxRefreshLayout = (WxRefreshLayout) findViewById4;
                this.f158961o = wxRefreshLayout;
                C47093a aVar = new C47093a();
                aVar.f126539a = 0.5f;
                aVar.f126540b = 300;
                aVar.f126541c = false;
                aVar.f126543e = true;
                aVar.f126544f = true;
                aVar.f126545g = true;
                aVar.f126546h = true;
                aVar.f126547i = false;
                aVar.f126548j = true;
                aVar.f126549k = true;
                aVar.f126550l = true;
                aVar.f126551m = false;
                aVar.f126552n = false;
                aVar.f126553o = true;
                aVar.f126554p = false;
                aVar.f126555q = false;
                wxRefreshLayout.setCommonConfig(aVar);
                WxRefreshLayout wxRefreshLayout2 = this.f158961o;
                if (wxRefreshLayout2 != null) {
                    wxRefreshLayout2.setOnSimpleAction(new C65721p1(this));
                    setMMTitle((int) C0966R.string.mvs);
                    setBackBtn(new C65718o1(this));
                    mo77423N7(new C65726s1(this));
                    return;
                }
                C87412m.m108603p("refreshLayout");
                throw null;
            }
            C87412m.m108603p("bizList");
            throw null;
        }
        C87412m.m108603p("retryView");
        throw null;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        String str;
        Bundle extras;
        if (i == 5 && i2 == -1) {
            if (intent == null || (extras = intent.getExtras()) == null || (str = extras.getString("finder_biz_live_article_url")) == null) {
                str = "";
            }
            Intent intent2 = new Intent();
            intent2.putExtra("finder_biz_live_article_url", str);
            setResult(-1, intent2);
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        init();
    }
}
