package p292ad;

import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.rtmp.ITXLivePlayListener;
import com.tencent.rtmp.TXLiveConstants;
import jo0.C87995c;
import jo0.C87997d;
import org.json.JSONException;
import org.json.JSONObject;
import p1066yc.C91399c0;
import p932bd.C79687a;
import p932bd.C79688b;

/* renamed from: ad.h */
public class C79508h implements ITXLivePlayListener {

    /* renamed from: d */
    public final /* synthetic */ C79502b f233144d;

    public C79508h(C79502b bVar) {
        this.f233144d = bVar;
    }

    public void onNetStatus(Bundle bundle) {
        C79502b bVar = this.f233144d;
        C79688b bVar2 = bVar.f233099j;
        if (bVar2 != null) {
            int i = bVar.f253971d;
            C87997d dVar = (C87997d) bVar2;
            dVar.getClass();
            C87997d.C88002e eVar = new C87997d.C88002e((C87997d.C87998a) null);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("viewId", i);
                JSONObject jSONObject2 = new JSONObject();
                if (bundle != null) {
                    for (String next : bundle.keySet()) {
                        jSONObject2.put(next, bundle.get(next));
                    }
                }
                jSONObject.put("info", jSONObject2);
                dVar.mo122451a(eVar, jSONObject);
            } catch (JSONException e) {
                Log.m105921e("MicroMsg.SameLayer.AppBrandLivePlayerEventHandler", "onXWebLivePlayerNetStatus fail", e);
            }
        }
    }

    public void onPlayEvent(int i, Bundle bundle) {
        if (2006 == i || -2301 == i) {
            this.f233144d.mo109503D(new h$$a(this));
        }
        C79502b bVar = this.f233144d;
        C79688b bVar2 = bVar.f233099j;
        if (bVar2 != null) {
            int i2 = bVar.f253971d;
            C87997d dVar = (C87997d) bVar2;
            dVar.getClass();
            C87997d.C88001d dVar2 = new C87997d.C88001d((C87997d.C87998a) null);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("viewId", i2);
                jSONObject.put("errCode", i);
                jSONObject.put("errMsg", bundle == null ? "" : bundle.getString(TXLiveConstants.EVT_DESCRIPTION));
                dVar.mo122451a(dVar2, jSONObject);
            } catch (JSONException e) {
                Log.m105921e("MicroMsg.SameLayer.AppBrandLivePlayerEventHandler", "onXWebLivePlayerEvent fail", e);
            }
        }
        C79502b bVar3 = this.f233144d;
        C79687a aVar = bVar3.f233100n;
        if (aVar != null) {
            ((C87995c) aVar).mo122447b(bVar3.f253971d, i, bundle);
        }
        if (i == -2301) {
            C79502b bVar4 = this.f233144d;
            C91399c0 c0Var = bVar4.f233084J;
            if (c0Var != null) {
                c0Var.onStop();
            } else {
                bVar4.f233085K = 6;
            }
            Log.m105924i(this.f233144d.mo109516v(), "onStop, abandonFocus");
            this.f233144d.f233111y.mo115002L();
        } else if (i == 2003) {
            C79502b bVar5 = this.f233144d;
            C91399c0 c0Var2 = bVar5.f233084J;
            if (c0Var2 != null) {
                c0Var2.mo110189f();
                C79502b bVar6 = this.f233144d;
                bVar6.f233084J.mo110186c(bVar6.f233086L);
            } else {
                bVar5.f233085K = bVar5.f233086L ? 2 : 3;
            }
            Log.m105919d(this.f233144d.mo109516v(), "onPlayEvent play, mIsWebViewInBackground: %b, isRuntimeInBackground: %b", Boolean.valueOf(this.f233144d.f233078D), Boolean.valueOf(this.f233144d.f233077C));
            if (!this.f233144d.f233078D) {
                C79502b bVar7 = this.f233144d;
                if (!bVar7.f233077C && !bVar7.mo109517w()) {
                    Log.m105924i(this.f233144d.mo109516v(), "onPlayEvent play, requestFocus");
                    if (!this.f233144d.f233111y.requestFocus()) {
                        Log.m105924i(this.f233144d.mo109516v(), "onPlayEvent play, can not play");
                        C79502b.m96468q(this.f233144d);
                    }
                }
            }
        } else if (i == 2006) {
            C79502b bVar8 = this.f233144d;
            C91399c0 c0Var3 = bVar8.f233084J;
            if (c0Var3 != null) {
                c0Var3.mo110198j();
            } else {
                bVar8.f233085K = 7;
            }
            Log.m105924i(this.f233144d.mo109516v(), "onPlayEnd, abandonFocus");
            this.f233144d.f233111y.mo115002L();
        } else if (i == 2007) {
            C79502b bVar9 = this.f233144d;
            C91399c0 c0Var4 = bVar9.f233084J;
            if (c0Var4 != null) {
                c0Var4.mo110188e();
            } else {
                bVar9.f233085K = 0;
            }
        }
    }
}
