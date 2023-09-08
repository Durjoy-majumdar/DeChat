package p857mg;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C39622i0;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.album.p836ui.gallery.view.AlbumVideoView;
import com.tencent.p014mm.modelcdntran.C55385t;
import com.tencent.p014mm.p136ui.C74928u;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.pluginsdk.p133ui.C96814a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C7335d;
import di3.C86312j;
import gj3.C59476i;
import gy3.C87412m;
import i40.C98597b;
import i40.C98598e;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import mh0.C99864d;
import p1086ro.C101415b;
import p278yh.C66644d;
import p434ig.C98672d;
import p663qo.C63287k;
import p855lg.C61278a;
import p858ng.C61718q;
import ph0.C100792a;
import th0.C101880a;

/* renamed from: mg.o */
public final class C61477o extends C60896i<C61278a> {

    /* renamed from: e */
    public final AppCompatActivity f174804e;

    public C61477o(AppCompatActivity appCompatActivity) {
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f174804e = appCompatActivity;
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.d7_;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C61278a aVar = (C61278a) cVar;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(aVar, "item");
        C66644d dVar = new C66644d(oVar.f44854d);
        dVar.mo90695a().f154686j.setVisibility(8);
        dVar.mo90695a().setCallback(new C61476n(this));
        C101880a aVar2 = C101880a.f299976a;
        AlbumVideoView a = dVar.mo90695a();
        C87412m.m108593f(a, "uiBinding.videoView");
        aVar2.mo141345b(aVar, i, a);
        C100792a aVar3 = C100792a.f295260a;
        String v = aVar3.mo140250v(aVar.f174389h, aVar.f174390i);
        long j = 0;
        if (C86013q1.m106450k(v)) {
            dVar.mo90695a().setThumbView(v);
        } else {
            Log.m105925i("MicroMsg.AlbumGalleryVideoItemConvert", "getView, no video source, start download, path:%s", v);
            C98597b.C60245a aVar4 = C98597b.f289091e;
            C7335d c = C86312j.m106911c(C99864d.class);
            C87412m.m108593f(c, "getService(AlbumFeatureService::class.java)");
            C101415b bVar = (C101415b) aVar4.mo85231a((C98598e) c, C101415b.class);
            C72963f4 f4Var = aVar.f174390i;
            C98672d dVar2 = aVar.f174389h;
            C87412m.m108594g(dVar2, "dataItem");
            String o = aVar3.mo140243o(aVar3.mo140249u(dVar2.mo55264K()), f4Var, true);
            C55385t tVar = new C55385t();
            tVar.f157719a = dVar2.mo55254F();
            tVar.f157720b = dVar2.mo55256G();
            tVar.f157721c = dVar2.mo55264K();
            tVar.f157722d = o;
            tVar.f157724f = dVar2.mo55344y0();
            tVar.f157725g = o.hashCode();
            tVar.f157726h = v;
            tVar.f157727i = dVar2.mo55336u0();
            tVar.f157728j = true;
            tVar.f157732n = dVar2.mo55338v0();
            tVar.f157733o = f4Var != null ? f4Var.getMsgId() : 0;
            ((C63287k) C86312j.m106911c(C63287k.class)).mo88184wS(tVar);
        }
        if (C85875k4.m106157N()) {
            dVar.mo90695a().setVideoScaleType(C96814a.C96817e.CONTAIN);
        } else {
            dVar.mo90695a().setVideoScaleType(C96814a.C96817e.DEFAULT);
        }
        C72963f4 f4Var2 = aVar.f174390i;
        if (f4Var2 != null) {
            j = f4Var2.getMsgId();
        }
        String a2 = C74928u.C57854a.m66842a(i, j);
        View thumbView = dVar.mo90695a().getThumbView();
        C87412m.m108593f(thumbView, "uiBinding.videoView.thumbView");
        C87412m.m108593f(a2, "transitionName");
        C59476i.m69400b(thumbView, a2, (Object) null, 2, (Object) null);
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
        super.mo45f(recyclerView, oVar, i);
        View view = oVar.f44854d;
        AppCompatActivity appCompatActivity = this.f174804e;
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C39622i0 a = C39818r.f106831a.mo62444c(appCompatActivity).mo75002a(C61718q.class);
        C87412m.m108593f(a, "UICProvider.of(activity)…leryVideoUIC::class.java)");
        AlbumVideoView albumVideoView = (AlbumVideoView) view.findViewById(C0966R.C0970id.l7x);
        C87412m.m108593f(albumVideoView, "uiBinding.videoView");
        ((C61718q) a).f175428h.add(albumVideoView);
    }
}
