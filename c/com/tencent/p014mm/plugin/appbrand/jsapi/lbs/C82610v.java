package com.tencent.p014mm.plugin.appbrand.jsapi.lbs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.location.model.LocationInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import java.util.HashMap;
import ms0.C88840a;
import qo3.C77407n;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.lbs.v */
public class C82610v implements C88840a.C88842b {

    /* renamed from: d */
    public final /* synthetic */ C81925i2 f241741d;

    /* renamed from: e */
    public final /* synthetic */ int f241742e;

    /* renamed from: f */
    public final /* synthetic */ C82613z f241743f;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.lbs.v$a */
    public class C82611a implements Runnable {
        public C82611a() {
        }

        public void run() {
            C82610v vVar = C82610v.this;
            C82613z zVar = vVar.f241743f;
            C81925i2 i2Var = vVar.f241741d;
            double d = zVar.f241749i;
            double d2 = zVar.f241750j;
            zVar.getClass();
            C77407n nVar = new C77407n(i2Var.getContext(), 1, true);
            nVar.f225771i = new C40471w(zVar, i2Var, d, d2);
            nVar.f225782p = new C82612x(zVar, i2Var, nVar);
            View inflate = LayoutInflater.from(i2Var.getContext()).inflate(C0966R.C0971layout.f6428el, (ViewGroup) null, false);
            ((ImageView) inflate.findViewById(C0966R.C0970id.bep)).setOnClickListener(new C1716y(zVar, nVar));
            ((TextView) inflate.findViewById(C0966R.C0970id.g4w)).setText(i2Var.mo114344o0().getString(C0966R.string.f7766r1, new Object[]{zVar.f241752o.f271933h}));
            nVar.mo107569n(inflate, false);
            nVar.mo107559d(true);
            nVar.mo107573q();
        }
    }

    public C82610v(C82613z zVar, C81925i2 i2Var, int i) {
        this.f241743f = zVar;
        this.f241741d = i2Var;
        this.f241742e = i;
    }

    /* renamed from: f */
    public void mo114898f(int i, String str, C88840a.C88841a aVar) {
        Log.m105925i("MicroMsg.JsApiOpenMapApp", "errCode:%d, errStr:%s, location:%s", Integer.valueOf(i), str, aVar);
        this.f241743f.f241751n.mo114891b(this.f241741d.getRuntime());
        if (i == 0) {
            LocationInfo locationInfo = this.f241743f.f241753p;
            locationInfo.f271930e = aVar.f256263a;
            locationInfo.f271931f = aVar.f256264b;
            locationInfo.f271932g = 15;
            MMHandlerThread.postToMainThread(new C82611a());
            this.f241741d.mo109647a(this.f241742e, this.f241743f.mo115109j("ok"));
            return;
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("errCode", Integer.valueOf(i));
        C81925i2 i2Var = this.f241741d;
        int i2 = this.f241742e;
        C82613z zVar = this.f241743f;
        i2Var.mo109647a(i2, zVar.mo115112m("fail:" + str, hashMap));
    }
}
