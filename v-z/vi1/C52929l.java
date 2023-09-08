package vi1;

import al1.C39611s;
import android.os.Bundle;
import androidx.lifecycle.C0120a0;
import cl1.C39981t0;
import cl1.C54991o;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;
import gy3.C87412m;
import java.util.Iterator;
import java.util.LinkedList;
import o40.C61926c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: vi1.l */
public final class C52929l<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ C52931n f147778d;

    public C52929l(C52931n nVar) {
        this.f147778d = nVar;
    }

    public void onChanged(Object obj) {
        JSONArray jSONArray;
        Bundle bundle = (Bundle) obj;
        Log.m105924i("MicIntercomPlugin", "micSeiLiveData: " + bundle);
        C52931n nVar = this.f147778d;
        String string = bundle != null ? bundle.getString("live_link_mic_info_in_anchor_sei_msg_mt") : null;
        nVar.getClass();
        if (Util.isNullOrNil(string)) {
            jSONArray = new JSONArray();
        } else {
            try {
                jSONArray = new JSONArray(string);
            } catch (JSONException unused) {
                jSONArray = new JSONArray();
            }
        }
        C52931n nVar2 = this.f147778d;
        nVar2.getClass();
        Class cls = C39981t0.class;
        Log.m105924i("MicIntercomPlugin", "anchorMicIntercomSeiHandle : " + jSONArray);
        if (jSONArray.length() == 0) {
            ((C39981t0) nVar2.mo87696x0(cls)).mo62592j3((LinkedList<C39611s>) null);
        } else {
            LinkedList linkedList = new LinkedList();
            int length = jSONArray.length();
            boolean z = false;
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                String optString = optJSONObject != null ? optJSONObject.optString(DownloadInfo.UID) : null;
                if (optString == null) {
                    optString = "";
                }
                linkedList.add(new C39611s(optString, "", "", "", "", !C61926c.m72696u(optJSONObject != null ? optJSONObject.optInt("us") : 0, 1)));
            }
            if (!linkedList.isEmpty()) {
                Iterator it = linkedList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (C87412m.m108589b(((C39611s) it.next()).f106357a, ((C54991o) nVar2.mo87696x0(C54991o.class)).mo76015n4())) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            Log.m105924i("MicIntercomPlugin", "anchorMicIntercomSeiHandle hasEnterMicInterCom: " + z);
            ((C39981t0) nVar2.mo87696x0(cls)).mo62592j3(linkedList);
        }
        ((C39981t0) nVar2.mo87696x0(cls)).mo62589f3();
        Log.m105924i("MicIntercomPlugin", "EVENT_ANCHOR_NOTIFY_CLOUD_MIXTURE_FOR_FINDER: mListData:" + jSONArray);
    }
}
