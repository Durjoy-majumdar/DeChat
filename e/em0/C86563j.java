package em0;

import com.tencent.p014mm.sdk.platformtools.Log;
import kr0.C88267e;
import org.json.JSONObject;
import p918s2.C90111a;

/* renamed from: em0.j */
public class C86563j implements C90111a.C90113b {

    /* renamed from: d */
    public final /* synthetic */ C88267e f251474d;

    /* renamed from: e */
    public final /* synthetic */ JSONObject f251475e;

    /* renamed from: f */
    public final /* synthetic */ int f251476f;

    /* renamed from: g */
    public final /* synthetic */ C86561i f251477g;

    public C86563j(C86561i iVar, C88267e eVar, JSONObject jSONObject, int i) {
        this.f251477g = iVar;
        this.f251474d = eVar;
        this.f251475e = jSONObject;
        this.f251476f = i;
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i != 121) {
            Log.m105920e("MicroMsg.OpenVoice.JsApiOpenVoiceBase", "requestAudioPermission requestCode is not for open voice api");
        } else if (iArr == null || iArr.length <= 0 || iArr[0] != 0) {
            Log.m105920e("MicroMsg.OpenVoice.JsApiOpenVoiceBase", "requestAudioPermission sys perm denied for open voice api");
            this.f251474d.mo109647a(this.f251476f, this.f251477g.mo115109j("fail:system permission denied"));
        } else {
            Log.m105924i("MicroMsg.OpenVoice.JsApiOpenVoiceBase", "requestAudioPermission permission is grant for open voice api");
            this.f251477g.mo1505u(this.f251474d, this.f251475e, this.f251476f);
        }
    }
}
