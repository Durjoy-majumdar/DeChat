package p141db;

import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82016a0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82446i;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import org.json.JSONObject;
import p547hb.C87464c;

/* renamed from: db.h */
public class C86223h extends C82016a0<C81925i2> {
    public static final int CTRL_INDEX = 401;
    public static final String NAME = "canvasToTempFilePathSync";

    /* renamed from: t */
    public String mo1731t(C82381f fVar, JSONObject jSONObject) {
        C83780d1 l0 = ((C81925i2) fVar).mo114341l0();
        if (((C87464c) l0.mo116150E0(C87464c.class)) == null) {
            return mo115109j("fail");
        }
        C82446i w = C86222g.m106822w(l0, jSONObject, true);
        return mo115112m(w.f242317b, w.f242316a);
    }
}
