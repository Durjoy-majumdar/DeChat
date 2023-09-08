package p964fd;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import p1066yc.C91399c0;
import p975hd.C87477b;
import p975hd.C87478c;
import po0.C89421g;
import po0.C89422h;
import po0.C89423i;
import po0.C89424j;
import po0.g$$d;
import ym0.C91515l;

/* renamed from: fd.e$$r */
public class e$$r implements C87478c.C87479a {

    /* renamed from: a */
    public final /* synthetic */ C86826e f252080a;

    public e$$r(C86826e eVar) {
        this.f252080a = eVar;
    }

    /* renamed from: a */
    public void mo18001a(String str, int i, int i2) {
        Log.m105929w(this.f252080a.mo121291y(), "send video error event, what:%d, extra:%d", Integer.valueOf(i), Integer.valueOf(i2));
        if (this.f252080a.mo121279N()) {
            C89421g gVar = (C89421g) this.f252080a.f252035i;
            gVar.mo123750k();
            MMHandlerThread.postToMainThread(new C89423i(gVar));
            try {
                JSONObject b = gVar.mo123741b();
                b.put("errMsg", String.format(Locale.US, "%s(%d,%d)", new Object[]{str, Integer.valueOf(i), Integer.valueOf(i2)}));
                gVar.mo123740a(new g$$d((C89422h) null), b);
            } catch (JSONException e) {
                Log.m105921e("MicroMsg.SameLayer.AppBrandVideoEventHandler", "OnXWebVideoError fail", e);
            }
            gVar.mo123742c();
            C91399c0 c0Var = gVar.f257452i;
            if (c0Var != null) {
                c0Var.mo110184a();
            }
        }
        C86826e eVar = this.f252080a;
        C87477b bVar = eVar.f252047q;
        if (bVar != null) {
            bVar.mo121928E(eVar.f252049s, eVar.f252033h, i, i2, str);
        }
        C86826e eVar2 = this.f252080a;
        if (eVar2.f252044o != null) {
            if (!C91515l.m114820d(eVar2.f252033h)) {
                ((C89424j) this.f252080a.f252044o).mo123753a(928, 42, 1, false);
            } else if (i == -1024) {
                ((C89424j) this.f252080a.f252044o).mo123753a(928, (long) (-i2), 1, false);
                ((C89424j) this.f252080a.f252044o).mo123753a(928, 0, 1, false);
            } else {
                ((C89424j) this.f252080a.f252044o).mo123753a(928, 41, 1, false);
            }
        }
        this.f252080a.mo121281P();
    }
}
