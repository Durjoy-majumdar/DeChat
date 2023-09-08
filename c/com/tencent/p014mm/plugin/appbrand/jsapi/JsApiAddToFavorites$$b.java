package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import com.tencent.p014mm.autogen.events.DoFavoriteEvent;
import com.tencent.p014mm.autogen.events.FavoriteOperationEvent;
import com.tencent.p014mm.p136ui.widget.snackbar.C75018a;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.JsApiAddToFavorites;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C75592q0;
import gc1.C87177b;
import pb1.C100745t;
import te3.C101801kd0;
import te3.C101834rc0;
import te3.C101835rd0;
import te3.C90431pc0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiAddToFavorites$$b */
public final class JsApiAddToFavorites$$b extends AppBrandProxyUIProcessTask {

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiAddToFavorites$$b$a */
    public class C81981a implements C75018a.C75025e {

        /* renamed from: a */
        public final /* synthetic */ JsApiAddToFavorites.IPCFavResult f240401a;

        public C81981a(JsApiAddToFavorites.IPCFavResult iPCFavResult) {
            this.f240401a = iPCFavResult;
        }

        /* renamed from: a */
        public void mo6958a() {
        }

        public void onHide() {
            JsApiAddToFavorites$$b.this.finishProcess(this.f240401a);
        }

        public void onShow() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiAddToFavorites$$b$b */
    public class C81982b implements C75018a.C75024d {
        public C81982b() {
        }

        /* renamed from: a */
        public void mo7429a() {
            FavoriteOperationEvent favoriteOperationEvent = new FavoriteOperationEvent();
            FavoriteOperationEvent.C92515a aVar = favoriteOperationEvent.f264833d;
            aVar.f264835a = 35;
            aVar.f264842h = JsApiAddToFavorites$$b.this.getActivityContext();
            favoriteOperationEvent.publish();
        }
    }

    public void handleRequest(AppBrandProxyUIProcessTask.ProcessRequest processRequest) {
        JsApiAddToFavorites.IPCFavRequest iPCFavRequest = (JsApiAddToFavorites.IPCFavRequest) processRequest;
        C101834rc0 rc02 = new C101834rc0();
        rc02.mo141260p(19);
        String str = iPCFavRequest.f240389n;
        rc02.f299286W = str;
        if (Util.isNullOrNil(str)) {
            rc02.mo141232F(true);
        }
        rc02.f299284V = iPCFavRequest.f240389n;
        rc02.mo141246U(iPCFavRequest.f240388j);
        rc02.mo141265u(iPCFavRequest.f240388j);
        rc02.mo141257m(C100745t.m131892d(rc02.toString(), 19));
        C101835rd0 rd02 = new C101835rd0();
        rd02.mo141275k(C75592q0.m90789s());
        rd02.mo141273f(Util.nowMilliSecond());
        rd02.mo141277m(iPCFavRequest.f240392q);
        C90431pc0 pc02 = new C90431pc0();
        pc02.f259742e = iPCFavRequest.f240383e;
        pc02.f259744g = iPCFavRequest.f240385g;
        pc02.f259746i = iPCFavRequest.f240384f;
        pc02.f259743f = iPCFavRequest.f240387i;
        pc02.f259748n = iPCFavRequest.f240386h;
        pc02.f259741d = iPCFavRequest.f240382d;
        pc02.f259749o = iPCFavRequest.f240390o;
        pc02.f259753s = iPCFavRequest.f240391p;
        pc02.f259751q = iPCFavRequest.f240393r;
        pc02.f259752r = iPCFavRequest.f240394s;
        C101801kd0 kd02 = new C101801kd0();
        kd02.f298618f.add(rc02);
        kd02.f298610I = pc02;
        kd02.f298611J = true;
        kd02.mo141219q(rd02);
        DoFavoriteEvent doFavoriteEvent = new DoFavoriteEvent();
        kd02.mo141220r(iPCFavRequest.f240388j);
        DoFavoriteEvent.C92474a aVar = doFavoriteEvent.f264674d;
        String str2 = iPCFavRequest.f240388j;
        aVar.f264680e = str2;
        aVar.f264679d = str2;
        aVar.f264676a = kd02;
        aVar.f264678c = 19;
        doFavoriteEvent.publish();
        int i = doFavoriteEvent.f264675e.f9046a;
        JsApiAddToFavorites.IPCFavResult iPCFavResult = new JsApiAddToFavorites.IPCFavResult();
        iPCFavResult.f240396d = i;
        Log.m105925i("MicroMsg.JsApiAddToFavorites", "fav result:%d", Integer.valueOf(i));
        ((C87177b) C86312j.m106911c(C87177b.class)).mo121616Mc(-1, i, 32, getActivityContext(), (Fragment) null, new C81981a(iPCFavResult), (DialogInterface.OnClickListener) null, new C81982b());
    }
}
