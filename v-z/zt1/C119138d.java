package zt1;

import android.widget.TextView;
import au1.C0222b;
import bu1.C0381a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiStopRecordVoice;
import com.tencent.p014mm.plugin.facedetect.model.C85191v;
import com.tencent.p014mm.plugin.facedetectlight.Utils.YTAGFaceReflectForWXJNIInterface;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import eb1.C116764b;
import eb1.C97635w;
import eb1.C97636x;
import gb1.C116924a;
import java.util.HashMap;
import jb1.C108680a;
import kg3.C76577a;
import ob0.C117747y;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p375qh.C89658b;
import pe3.C89349b;
import te3.C118453od;

/* renamed from: zt1.d */
public class C119138d extends C119133a {

    /* renamed from: B */
    public C116924a f356819B = new C116924a();

    /* renamed from: C */
    public String f356820C = "";

    /* renamed from: zt1.d$a */
    public interface C16403a {
        /* renamed from: a */
        void mo5293a(C116924a aVar);
    }

    /* renamed from: a */
    public void mo14859a(TextView textView) {
        C0381a.m332i(textView, C76577a.m92166q(textView.getContext(), C0966R.string.ck4));
    }

    /* renamed from: e */
    public int mo14860e() {
        return 1;
    }

    /* renamed from: g */
    public int mo14861g() {
        return 0;
    }

    /* renamed from: i */
    public int mo14862i() {
        return 0;
    }

    /* renamed from: o */
    public String mo183841o(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            C118453od odVar = new C118453od();
            byte[] b = C119139h.m168005b(jSONObject, String.valueOf(this.f356797f));
            odVar.f354209e = C89349b.m111674a(b);
            odVar.f354208d = C89349b.m111674a(C119139h.m168004a(String.valueOf(this.f356797f), b));
            String j = C85191v.m105071j();
            C85191v.m105075n(odVar.toByteArray(), j);
            Log.m105925i("MicroMsg.FaceFlashManagerNumber", "save verify result to bioId:%s file:%s  fileSize:%s", String.valueOf(this.f356797f), j, Long.valueOf(C86013q1.m106451l(j)));
            return j;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.FaceFlashManagerError", e, "number get yt result data error", new Object[0]);
            return "";
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        int i3 = i2;
        C117747y yVar2 = yVar;
        if ((yVar2 instanceof C97635w) || (yVar2 instanceof C97636x)) {
            Log.m105925i("MicroMsg.FaceFlashManagerNumber", "[cgi-ret]NetSceneGetBioConfig errType:%s errCode:%s errMsg:%s", Integer.valueOf(i), Integer.valueOf(i2), str);
            this.f356810v = System.currentTimeMillis();
            C0222b.m173l("rspCfg", Integer.valueOf(i2));
            C0222b.m163b().f9703s = System.currentTimeMillis();
            C0222b.m163b().f9691g = i3;
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject();
            if (i == 0 && i3 == 0) {
                C116764b bVar = (C116764b) yVar2;
                this.f356797f = bVar.mo136899r0();
                String decrypt = YTAGFaceReflectForWXJNIInterface.decrypt(this.f356797f + "", bVar.mo136898l(), (long) bVar.mo136898l().length);
                Log.m105925i("MicroMsg.FaceFlashManagerNumber", "mBioId:%s decryptConfig:%s", Long.valueOf(this.f356797f), decrypt);
                try {
                    jSONObject.put(TPReportKeys.LiveExKeys.LIVE_EX_ERR_CODE, 0);
                    jSONObject.put("errormsg", "OK");
                    jSONObject.put("type", 1);
                    JSONArray optJSONArray = new JSONObject(decrypt).optJSONArray("face_action_seq");
                    if (optJSONArray != null) {
                        for (int i4 = 0; i4 < optJSONArray.length(); i4++) {
                            JSONObject optJSONObject = optJSONArray.optJSONObject(i4);
                            if (optJSONObject != null && optJSONObject.optInt("action_id", 0) == 4) {
                                String optString = optJSONObject.optString("action_data");
                                this.f356820C = optString;
                                String replaceAll = optString.replaceAll("(.)", "$1,");
                                jSONObject.put("action_data", replaceAll.substring(0, replaceAll.length() - 1));
                            }
                        }
                    }
                } catch (JSONException e) {
                    Log.printErrStackTrace("MicroMsg.FaceFlashManagerError", e, "reflect get config error", new Object[0]);
                }
            } else {
                Log.m105920e("MicroMsg.FaceFlashManagerError", "get mBioId failed");
                C0222b.m163b().f9686B = 3;
                try {
                    jSONObject.put(TPReportKeys.LiveExKeys.LIVE_EX_ERR_CODE, 90036);
                    jSONObject.put("errormsg", "WeChat face get config error!");
                    jSONObject.put("err_feedback", this.f356802n);
                    jSONObject.put("err_msg", C76577a.m92166q(this.f356803o, C0966R.string.net_fetch_failed));
                } catch (JSONException e2) {
                    Log.printErrStackTrace("MicroMsg.FaceFlashManagerError", e2, "reflect get config error2", new Object[0]);
                }
            }
            hashMap.put("response", jSONObject.toString());
            Log.m105925i("MicroMsg.FaceFlashManagerNumber", "set ytsdk number config:%s", hashMap);
            this.f356795d.onNetworkResponseEvent(hashMap, (Exception) null);
            return;
        }
        super.onSceneEnd(i, i2, str, yVar);
    }

    public void release() {
        Log.m105924i("MicroMsg.FaceFlashManagerNumber", "release");
        super.release();
        C116924a aVar = this.f356819B;
        aVar.getClass();
        Log.m105924i("MicroMsg.FaceVoiceRecordLogic", "hy: recycling voice.");
        aVar.f350361a = null;
        this.f356819B.mo180900b();
    }

    public void reset() {
        Log.m105924i("MicroMsg.FaceFlashManagerNumber", "reset");
        super.reset();
        mo183847s();
        C116924a aVar = this.f356819B;
        aVar.getClass();
        Log.m105924i("MicroMsg.FaceVoiceRecordLogic", "hy: recycling voice.");
        aVar.f350361a = null;
        this.f356819B.mo180900b();
        this.f356819B = new C116924a();
    }

    /* renamed from: s */
    public void mo183847s() {
        Log.m105924i("MicroMsg.FaceFlashManagerNumber", JsApiStopRecordVoice.NAME);
        this.f356819B.mo180901c();
        C116924a aVar = this.f356819B;
        aVar.getClass();
        Log.m105924i("MicroMsg.FaceVoiceRecordLogic", "hy: recycling voice.");
        aVar.f350361a = null;
        C116924a aVar2 = this.f356819B;
        C89658b f = C108680a.m147401e().mo159698f();
        synchronized (aVar2.f350367g) {
            aVar2.f350367g.remove(f);
        }
    }
}
