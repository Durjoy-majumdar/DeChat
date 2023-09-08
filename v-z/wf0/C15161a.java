package wf0;

import com.google.android.gms.common.server.response.FastJsonResponse;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import f62.C75711y0;
import ob0.C35136m;

/* renamed from: wf0.a */
public class C15161a implements C75711y0 {
    /* renamed from: C4 */
    public void mo14111C4(C35136m.C35137a aVar, C72963f4 f4Var, String str, String str2, boolean z) {
    }

    /* renamed from: u4 */
    public void mo14112u4(C35136m.C35137a aVar, C72963f4 f4Var, String str, String str2, boolean z) {
        if (!z && f4Var != null && !Util.isNullOrNil(f4Var.getContent())) {
            String str3 = C85875k4.m106211z() ? "#7D90A9" : "#576B95";
            String content = f4Var.getContent();
            f4Var.mo108732L2(content.replace("color=\"#037AFF\"", "color=\"" + str3 + FastJsonResponse.QUOTE));
        }
    }
}
