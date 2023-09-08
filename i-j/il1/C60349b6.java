package il1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.pluginsdk.location.C57534a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import dd3.C58256b;
import er1.C58790x4;
import fe1.C58964h;
import fe1.C8014g;
import gy3.C87412m;
import ht1.C60200t1;
import java.util.List;
import o40.C61926c;
import rx3.C13604l;
import sx3.C110818d0;
import te3.C64311db1;
import te3.C64885zm2;

/* renamed from: il1.b6 */
public final class C60349b6 implements C58256b.C58257a {

    /* renamed from: d */
    public final MMActivity f172014d;

    /* renamed from: e */
    public final View f172015e;

    /* renamed from: f */
    public C58964h f172016f;

    /* renamed from: g */
    public boolean f172017g;

    /* renamed from: h */
    public boolean f172018h;

    public C60349b6(MMActivity mMActivity, View view) {
        C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(view, "root");
        this.f172014d = mMActivity;
        this.f172015e = view;
        mMActivity.getIntent().putExtra("saveLocation", false);
        mMActivity.getIntent().putExtra("show_city", false);
        mMActivity.getIntent().putExtra("poi_show_none", true);
        mMActivity.getIntent().putExtra("can_show_create_poi_tips", false);
        C58964h hVar = (C58964h) C39818r.f106831a.mo62442a(C58964h.class);
        View findViewById = view.findViewById(C0966R.C0970id.i0b);
        C87412m.m108593f(findViewById, "root.findViewById<Finder…(R.id.post_location_view)");
        hVar.mo83368g(mMActivity, (C57534a) findViewById, (WxRecyclerView) null, 20000);
        this.f172016f = hVar;
        Intent intent = mMActivity.getIntent();
        C87412m.m108593f(intent, "activity.intent");
        hVar.mo8612b(intent, new Bundle());
        this.f172016f.mo83373m().setIconColor(view.getContext().getResources().getColor(C0966R.color.f2975b6));
        this.f172016f.mo83373m().setTextColor(view.getContext().getResources().getColor(C0966R.color.f2975b6));
        this.f172016f.mo83373m().setDefaultStateIconColor(view.getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_8));
        this.f172016f.mo83373m().setDefaultStateTextColor(view.getContext().getResources().getColor(C0966R.color.f2975b6));
        this.f172016f.mo83373m().setDefaultLoadingPBarColor(view.getContext().getResources().getColor(C0966R.color.f2975b6));
        this.f172016f.mo83373m().setDefaultLoadingTipColor(view.getContext().getResources().getColor(C0966R.color.f2975b6));
        this.f172016f.mo83373m().mo3296f(C0966R.raw.finder_live_icon_location_loading);
        C61926c.m72656A((String) null, new C60566z5(this));
    }

    /* renamed from: a */
    public final C64311db1 mo85314a() {
        Class cls = C8014g.class;
        Class<C60200t1> cls2 = C60200t1.class;
        C64311db1 a = this.f172016f.mo83363a();
        if (a != null) {
            return a;
        }
        C39818r rVar = C39818r.f106831a;
        if (!((C8014g) rVar.mo62446e(cls2).mo62447c(cls)).mo9103H()) {
            Log.m105924i("Finder.FinderLivePostLocationWidget", "getLocation no permission");
            return null;
        }
        C64311db1 db12 = new C64311db1();
        C13604l<Float, Float> X0 = ((C8014g) rVar.mo62446e(cls2).mo62447c(cls)).mo9104X0();
        db12.f182662e = ((Number) X0.f38556e).floatValue();
        db12.f182661d = ((Number) X0.f38555d).floatValue();
        return db12;
    }

    /* renamed from: r2 */
    public void mo75059r2(String str, List<C64885zm2> list) {
        if (this.f172017g || this.f172018h) {
            Log.m105924i("Finder.FinderLivePostLocationWidget", "#onGetLbsLifes isDestroy=" + this.f172017g + " ignore=" + this.f172018h);
            return;
        }
        if (!(list == null || list.isEmpty())) {
            Log.m105924i("Finder.FinderLivePostUIC", "get lbsLife success");
            this.f172016f.mo83366e(str, (C64885zm2) C110818d0.m150914L(list), (C58790x4) null);
            this.f172016f.mo83365d();
            return;
        }
        Log.m105924i("Finder.FinderLivePostUIC", "get lbsLife fail");
        this.f172016f.mo83365d();
    }
}
