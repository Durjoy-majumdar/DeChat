package em0;

import com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105181w;
import com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C85147b;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import kr0.C88267e;
import org.json.JSONException;
import org.json.JSONObject;
import p576jp.C88007b;
import wq0.C91062d;

/* renamed from: em0.f */
public class C86548f extends C86561i {
    public static final int CTRL_INDEX = 521;
    public static final String NAME = "updateVoIPChatMuteConfig";

    /* renamed from: i */
    public boolean f251443i = false;

    /* renamed from: j */
    public boolean f251444j = false;

    /* renamed from: em0.f$a */
    public class C86549a implements C85147b<String> {

        /* renamed from: a */
        public final /* synthetic */ C88267e f251445a;

        /* renamed from: b */
        public final /* synthetic */ int f251446b;

        public C86549a(C88267e eVar, int i) {
            this.f251445a = eVar;
            this.f251446b = i;
        }

        /* renamed from: a */
        public void mo118169a(int i, int i2, String str, Object obj) {
            String str2 = (String) obj;
            Log.m105925i("MicroMsg.OpenVoice.JsApiCloudVoiceUpdateVoIPChatMuteConfig", "hy: earphone done! %d, %d, %s", Integer.valueOf(i), Integer.valueOf(i2), str);
            if (i == 0 && i2 == 0) {
                C86548f fVar = C86548f.this;
                fVar.f251444j = true;
                C88267e eVar = this.f251445a;
                int i3 = this.f251446b;
                if (fVar.f251443i) {
                    eVar.mo109647a(i3, fVar.mo115109j("ok"));
                    return;
                }
                return;
            }
            C88267e eVar2 = this.f251445a;
            int i4 = this.f251446b;
            C86548f fVar2 = C86548f.this;
            eVar2.mo109647a(i4, fVar2.mo115109j("fail: " + str));
        }
    }

    /* renamed from: em0.f$b */
    public class C86550b implements C85147b<String> {

        /* renamed from: a */
        public final /* synthetic */ boolean f251448a;

        /* renamed from: b */
        public final /* synthetic */ C88267e f251449b;

        /* renamed from: c */
        public final /* synthetic */ int f251450c;

        public C86550b(boolean z, C88267e eVar, int i) {
            this.f251448a = z;
            this.f251449b = eVar;
            this.f251450c = i;
        }

        /* renamed from: a */
        public void mo118169a(int i, int i2, String str, Object obj) {
            String str2 = (String) obj;
            Log.m105925i("MicroMsg.OpenVoice.JsApiCloudVoiceUpdateVoIPChatMuteConfig", "hy: microphone done! %d, %d, %s", Integer.valueOf(i), Integer.valueOf(i2), str);
            if (i == 0 && i2 == 0) {
                C86548f fVar = C86548f.this;
                fVar.f251443i = true;
                fVar.mo121019B(!this.f251448a);
                C86548f fVar2 = C86548f.this;
                C88267e eVar = this.f251449b;
                int i3 = this.f251450c;
                if (fVar2.f251443i && fVar2.f251444j) {
                    eVar.mo109647a(i3, fVar2.mo115109j("ok"));
                    return;
                }
                return;
            }
            C88267e eVar2 = this.f251449b;
            int i4 = this.f251450c;
            C86548f fVar3 = C86548f.this;
            eVar2.mo109647a(i4, fVar3.mo115109j("fail: " + str));
        }
    }

    /* renamed from: em0.f$c */
    public class C86551c implements C85147b<String> {
        public C86551c(C86548f fVar) {
        }

        /* renamed from: a */
        public void mo118169a(int i, int i2, String str, Object obj) {
            String str2 = (String) obj;
            Log.m105925i("MicroMsg.OpenVoice.JsApiCloudVoiceUpdateVoIPChatMuteConfig", "hy: setHandsFree done! %d, %d, %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        }
    }

    public C86548f() {
        C91062d.m114234a(NAME);
    }

    /* renamed from: z */
    public void mo121015z(C88267e eVar, JSONObject jSONObject, int i) {
        Class cls = C88007b.class;
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("muteConfig");
            boolean z = jSONObject2.getBoolean("muteMicrophone");
            boolean z2 = jSONObject2.getBoolean("muteEarphone");
            boolean optBoolean = jSONObject.optBoolean("handsFree", false);
            Log.m105925i("MicroMsg.OpenVoice.JsApiCloudVoiceUpdateVoIPChatMuteConfig", "hy: muteMicroPhone:%b, muteEarPhone:%b, handsFree:%b", Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(optBoolean));
            ((C105181w) ((C88007b) C86312j.m106911c(cls)).mo59116Bp()).mo149503j(z2, new C86549a(eVar, i));
            ((C105181w) ((C88007b) C86312j.m106911c(cls)).mo59116Bp()).mo149504k(z, new C86550b(z, eVar, i));
            ((C105181w) ((C88007b) C86312j.m106911c(cls)).mo59116Bp()).mo149502i(optBoolean, new C86551c(this));
        } catch (JSONException e) {
            Log.printErrStackTrace("MicroMsg.OpenVoice.JsApiCloudVoiceUpdateVoIPChatMuteConfig", e, "", new Object[0]);
        }
    }
}
