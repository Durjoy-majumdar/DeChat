package com.tencent.p014mm.plugin.appbrand.jsapi.share;

import com.tencent.p014mm.plugin.appbrand.jsapi.share.JsApiShareAppMessageBase;
import com.tencent.p014mm.plugin.appbrand.report.C84240s;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.file.XVFSFile;
import eb0.C86493v0;
import kr0.C88267e;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.share.e */
public class C82958e extends JsApiShareAppMessageBase<JsApiShareAppMessageBase.C82939f> {
    public static final int CTRL_INDEX = 73;
    public static final String NAME = "shareAppMessage";

    /* renamed from: H */
    public static void m101748H(String str, String str2, int i, String str3, int i2, int i3) {
        C84240s.m103840f(str, str2, i, str3, Util.nowSecond(), i2, i3);
    }

    /* renamed from: C */
    public void mo115202C(JsApiShareAppMessageBase.C82939f fVar) {
        m101748H(fVar.f242491v, fVar.f242477h, fVar.f242473d ? 16 : 2, "", 2, -1);
    }

    /* renamed from: D */
    public void mo115203D(JsApiShareAppMessageBase.C82939f fVar, int i) {
        m101748H(fVar.f242491v, fVar.f242477h, fVar.f242473d ? 16 : 2, "", 3, i);
    }

    /* renamed from: E */
    public void mo115204E(boolean z, JsApiShareAppMessageBase.C82939f fVar, String str) {
        if (z) {
            m101748H(fVar.f242491v, fVar.f242477h, str.toLowerCase().endsWith("@chatroom") ? 15 : 16, str + XVFSFile.PATH_SEPARATOR, 1, -1);
        } else {
            m101748H(fVar.f242491v, fVar.f242477h, str.toLowerCase().endsWith("@chatroom") ? 9 : 2, "", 1, -1);
        }
        fVar.f242486q.mo115218c(fVar, z);
    }

    /* renamed from: w */
    public JsApiShareAppMessageBase.C82939f mo115207w() {
        return new JsApiShareAppMessageBase.C82939f();
    }

    /* renamed from: z */
    public JsApiShareAppMessageBase.C82939f mo115210z(C88267e eVar, JSONObject jSONObject) {
        JsApiShareAppMessageBase.C82939f z = super.mo115210z(eVar, jSONObject);
        C86493v0.C86495c cVar = z.f242471b.mo116155J0(3).f244320d;
        if (cVar.mo120960g("user_clicked_share_btn")) {
            cVar.mo120963j("user_clicked_share_btn", false);
            return z;
        }
        throw new JsApiShareAppMessageBase.C82938e("not allow to share");
    }
}
