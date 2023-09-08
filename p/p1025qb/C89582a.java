package p1025qb;

import br0.C79783h;
import com.tencent.luggage.sdk.customize.impl.C80228b;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82558k7;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82564l7;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82870p;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.C82720h;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.C82725i2;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.C82729j0;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.C82732k0;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.C82736l;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.C82738m2;
import com.tencent.p014mm.plugin.appbrand.jsapi.picker.C17926h;
import com.tencent.p014mm.plugin.appbrand.jsapi.video.AppBrandVideoWrapper;
import com.tencent.p014mm.plugin.appbrand.utils.C84779q2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C8480h;
import java.util.HashMap;
import java.util.Map;
import km0.C88224a;
import li0.C88509c;
import p224ra.C89909e;
import rk0.C89996i;
import sl0.C90220f;
import ym0.C91511i;

/* renamed from: qb.a */
public class C89582a {

    /* renamed from: a */
    public Map<String, C82870p> f257782a = new HashMap();

    static {
        Map<String, C88509c.C88512b> map = C82564l7.f241668a;
        C90220f.f259024p = new C82558k7();
        C17926h.f49439j = C79783h.f233808b;
        C89909e.m112440e(C89996i.class, C80228b.f234902d);
        C89909e.m112440e(C88224a.class, C84779q2.f247202d);
        C82738m2 m2Var = C82738m2.f242059d;
        m2Var.getClass();
        C89909e.m112440e(C82729j0.class, m2Var);
        C89909e.m112440e(C82732k0.C82734b.class, new C82736l(C82720h.f242037a, (C82732k0) null, 2, (C8480h) null));
        C82725i2.C82726a aVar = C82725i2.f242039e;
        Log.m105924i("MicroMsg.Video.LuggageVideoNonSameLayerStrategy", "init, use ExoVideoView");
        AppBrandVideoWrapper.setVideoViewFactory(new C91511i());
        AppBrandVideoWrapper.setAudioFocusComponentFactory(aVar);
    }

    public C89582a() {
        new HashMap();
    }

    /* renamed from: a */
    public void mo123892a(C82870p pVar) {
        if (pVar != null && !Util.isNullOrNil(pVar.mo114779e())) {
            ((HashMap) this.f257782a).put(pVar.mo114779e(), pVar);
        }
    }
}
