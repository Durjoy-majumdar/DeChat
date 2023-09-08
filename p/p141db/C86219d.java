package p141db;

import android.app.Activity;
import android.view.View;
import br0.C79774c;
import br0.C79778e;
import br0.C79781f;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.utils.C84752i2;
import com.tencent.p014mm.sdk.platformtools.Log;
import cr0.C86127t;
import org.json.JSONObject;
import rq0.C90086e;

/* renamed from: db.d */
public class C86219d extends C82268c<C81925i2> {
    public static final int CTRL_INDEX = 395;
    public static final String NAME = "setDeviceOrientation";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        Activity activity;
        C81925i2 i2Var = (C81925i2) fVar;
        if (jSONObject == null) {
            i2Var.mo109647a(i, mo115109j("fail"));
            return;
        }
        try {
            C79778e orientationHandler = i2Var.f240292z.getOrientationHandler();
            if (orientationHandler != null) {
                C79778e.C79780b b = C79778e.C79780b.m96933b(jSONObject.optString("value", (String) null));
                if (b == null) {
                    i2Var.mo109647a(i, mo115109j("fail:invalid data"));
                } else if (i2Var.getRuntime() == null || i2Var.getRuntime().mo113026R() == null) {
                    i2Var.mo109647a(i, mo115109j("fail"));
                } else {
                    C90086e eVar = (C90086e) i2Var.mo114341l0().mo116150E0(C90086e.class);
                    if (eVar != null) {
                        eVar.mo116462e(jSONObject.optString("value", (String) null));
                        C79774c cVar = i2Var.f240292z;
                        if (cVar instanceof C86127t) {
                            activity = ((C86127t) cVar).mo120548w();
                        } else {
                            if (cVar instanceof C79781f) {
                                C79774c cVar2 = ((C79781f) cVar).f233806d;
                                if (cVar2 instanceof C86127t) {
                                    activity = ((C86127t) cVar2).mo120548w();
                                }
                            }
                            activity = null;
                        }
                        if (activity == null) {
                            orientationHandler.mo109918b(b, new d$$a(this, i2Var, i));
                            return;
                        }
                        View decorView = activity.getWindow() != null ? activity.getWindow().getDecorView() : null;
                        if (decorView == null || !decorView.getViewTreeObserver().isAlive()) {
                            i2Var.mo109647a(i, mo115109j("fail: no decorView"));
                            return;
                        }
                        boolean[] zArr = {false};
                        int i2 = i;
                        C86220e eVar2 = new C86220e(this, i2Var, C84752i2.m104413a(i2Var), zArr, i2, decorView);
                        decorView.getViewTreeObserver().addOnGlobalLayoutListener(eVar2);
                        orientationHandler.mo109918b(b, new d$$b(this, decorView, eVar2, i2Var, i2, zArr));
                        return;
                    }
                    i2Var.mo109647a(i, mo115109j("fail: extension not found"));
                }
            } else {
                throw new NullPointerException();
            }
        } catch (NullPointerException e) {
            Log.printErrStackTrace("MicroMsg.JsApiSetDeviceOrientation", e, "require WindowOrientationHandler NPE", new Object[0]);
            i2Var.mo109647a(i, mo115109j("fail:internal error"));
        }
    }
}
