package yl0;

import android.util.Base64;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82919r2;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import rx3.C13604l;
import sx3.C90364q0;

/* renamed from: yl0.d */
public final class C91480d extends C82919r2 {
    public static final int CTRL_INDEX = 790;
    public static final String NAME = "onNFCDiscovered";

    /* renamed from: h */
    public void mo115158h() {
        Log.m105918d("MicroMsg.AppBrand.JsApiEventOnNFCDiscovered", "dispatch, data: " + mo115160j());
        super.mo115158h();
    }

    /* renamed from: k */
    public C82919r2 mo115161k(C82381f fVar) {
        super.mo115161k(fVar);
        return this;
    }

    /* renamed from: p */
    public final void mo125418p(byte[] bArr, List<String> list, HashMap<String, Object> hashMap) {
        Map map;
        C87412m.m108594g(list, "techs");
        if (bArr == null) {
            bArr = new byte[0];
        }
        byte[] encode = Base64.encode(bArr, 2);
        C87412m.m108593f(encode, "encode(id ?: ByteArray(0), Base64.NO_WRAP)");
        Charset charset = StandardCharsets.UTF_8;
        C87412m.m108593f(charset, "UTF_8");
        String str = new String(encode, charset);
        if (hashMap != null) {
            hashMap.put("id", str);
            hashMap.put("techs", list);
            map = hashMap;
        } else {
            map = C90364q0.m113147f(new C13604l("id", str), new C13604l("techs", list));
        }
        mo115165o(map);
        mo115158h();
    }

    /* renamed from: q */
    public C91480d mo125419q(C82381f fVar) {
        super.mo115161k(fVar);
        return this;
    }
}
