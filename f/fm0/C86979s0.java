package fm0;

import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import org.json.JSONObject;

/* renamed from: fm0.s0 */
public class C86979s0 extends C82268c<C81879g> {
    public static final int CTRL_INDEX = 8;
    public static final String NAME = "setNavigationBarTitle";

    /* renamed from: t */
    public boolean mo1769t() {
        return true;
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81879g gVar = (C81879g) fVar;
        if (!jSONObject.has(FFmpegMetadataRetriever.METADATA_KEY_TITLE)) {
            gVar.mo109647a(i, mo115109j("fail:invalid data"));
            return;
        }
        C86976r0 r0Var = new C86976r0(this, gVar, i, jSONObject.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE));
        if ((gVar instanceof C83780d1) || !gVar.getRuntime().mo113039X0()) {
            r0Var.run();
        } else {
            gVar.getRuntime().mo113020N0(r0Var);
        }
    }
}
