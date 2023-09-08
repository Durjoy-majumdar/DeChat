package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import b30.C39724b;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Map;
import p209nt.C47296d;
import t83.C13851h1;
import te3.C49158dk2;
import te3.C49713hj2;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.g0 */
public class C85580g0 implements C47296d.C47297a {

    /* renamed from: a */
    public final /* synthetic */ C13851h1 f249469a;

    /* renamed from: b */
    public final /* synthetic */ MsgHandler$$o0 f249470b;

    /* renamed from: c */
    public final /* synthetic */ int f249471c;

    /* renamed from: d */
    public final /* synthetic */ MsgHandler f249472d;

    public C85580g0(MsgHandler msgHandler, C13851h1 h1Var, MsgHandler$$o0 msgHandler$$o0, int i) {
        this.f249472d = msgHandler;
        this.f249469a = h1Var;
        this.f249470b = msgHandler$$o0;
        this.f249471c = i;
    }

    /* renamed from: a */
    public void mo72338a(int i, int i2, String str, C47296d dVar) {
        Log.m105919d("MicroMsg.MsgHandler", "onSceneEnd errType = %d, errCode = %d ,errMsg = %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        if (i != 0 || i2 != 0) {
            this.f249472d.mo7210k5(this.f249469a, "authorize:fail", (Map<String, Object>) null);
            ((MsgHandler$$h) this.f249470b).mo7246a();
        } else if (!(dVar instanceof C47296d)) {
        } else {
            if (this.f249471c == 2) {
                Log.m105918d("MicroMsg.MsgHandler", "press reject button");
                ((MsgHandler$$h) this.f249470b).mo7246a();
                return;
            }
            C49713hj2 hj22 = ((C49158dk2) ((C39724b) dVar).f106583d.f127056b.f127083a).f132382d;
            int i3 = hj22.f134688d;
            String str2 = hj22.f134689e;
            Log.m105925i("MicroMsg.MsgHandler", "NetSceneJSAuthorizeConfirm jsErrcode %d", Integer.valueOf(i3));
            if (i3 == 0) {
                this.f249472d.mo7210k5(this.f249469a, "authorize:ok", (Map<String, Object>) null);
                ((MsgHandler$$h) this.f249470b).mo7246a();
                return;
            }
            Log.m105921e("MicroMsg.MsgHandler", "onSceneEnd NetSceneJSAuthorizeConfirm ERROR %s", str2);
            this.f249472d.mo7210k5(this.f249469a, "authorize:fail", (Map<String, Object>) null);
            ((MsgHandler$$h) this.f249470b).mo7246a();
        }
    }
}
