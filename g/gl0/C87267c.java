package gl0;

import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83170k;
import java.nio.ByteBuffer;
import org.json.JSONObject;

/* renamed from: gl0.c */
public class C87267c extends C82268c<C81925i2> {
    public static final int CTRL_INDEX = 861;
    public static final String NAME = "faceDetect";

    /* renamed from: s */
    public ByteBuffer mo115118s(String str, C83170k kVar, int i) {
        return "frameBuffer".equalsIgnoreCase(str) ? kVar.mo115416k1(i, true) : kVar.mo115416k1(i, false);
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C107850a b = C107850a.m146130b();
        b.f322943b.execute(new C107856b(this, b, (C81925i2) fVar, i, jSONObject));
    }
}
