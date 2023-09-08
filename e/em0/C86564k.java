package em0;

import com.tencent.p014mm.sdk.platformtools.Log;
import kr0.C88267e;
import org.json.JSONObject;
import p918s2.C90111a;

/* renamed from: em0.k */
public class C86564k implements C90111a.C90113b {

    /* renamed from: d */
    public final /* synthetic */ C88267e f251478d;

    /* renamed from: e */
    public final /* synthetic */ JSONObject f251479e;

    /* renamed from: f */
    public final /* synthetic */ int f251480f;

    /* renamed from: g */
    public final /* synthetic */ C86561i f251481g;

    public C86564k(C86561i iVar, C88267e eVar, JSONObject jSONObject, int i) {
        this.f251481g = iVar;
        this.f251478d = eVar;
        this.f251479e = jSONObject;
        this.f251480f = i;
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i != 122) {
            Log.m105920e("MicroMsg.OpenVoice.JsApiOpenVoiceBase", "requestCameraPermission requestCode is not for open voice api");
        } else if (iArr == null || iArr.length <= 0 || iArr[0] != 0) {
            Log.m105920e("MicroMsg.OpenVoice.JsApiOpenVoiceBase", "requestCameraPermission sys perm denied for open voice api");
            this.f251478d.mo109647a(this.f251480f, this.f251481g.mo115109j("fail:system permission denied"));
        } else {
            Log.m105924i("MicroMsg.OpenVoice.JsApiOpenVoiceBase", "requestCameraPermission permission is grant for open voice api");
            this.f251481g.mo1505u(this.f251478d, this.f251479e, this.f251480f);
        }
    }
}
