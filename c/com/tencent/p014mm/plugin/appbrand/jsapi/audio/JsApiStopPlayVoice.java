package com.tencent.p014mm.plugin.appbrand.jsapi.audio;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.autogen.events.ExtPlayerEvent;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import org.json.JSONObject;
import p749xh.C66261f3;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiStopPlayVoice */
public class JsApiStopPlayVoice extends C82268c<C81925i2> {
    public static final int CTRL_INDEX = 35;
    public static final String NAME = "stopVoice";

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiStopPlayVoice$StopPlayVoice */
    public static class StopPlayVoice extends MainProcessTask {
        public static final Parcelable.Creator<StopPlayVoice> CREATOR = new C82068b();

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiStopPlayVoice$StopPlayVoice$a */
        public class C82067a implements Runnable {
            public C82067a(StopPlayVoice stopPlayVoice) {
            }

            public void run() {
                ExtPlayerEvent extPlayerEvent = new ExtPlayerEvent();
                extPlayerEvent.f264779d.f264781a = 2;
                extPlayerEvent.publish();
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiStopPlayVoice$StopPlayVoice$b */
        public class C82068b implements Parcelable.Creator<StopPlayVoice> {
            public Object createFromParcel(Parcel parcel) {
                return new StopPlayVoice((C82069a) null);
            }

            public Object[] newArray(int i) {
                return new StopPlayVoice[i];
            }
        }

        public StopPlayVoice() {
        }

        /* renamed from: j */
        public void mo1553j() {
            MMHandlerThread.postToMainThread(new C82067a(this));
        }

        public StopPlayVoice(C82069a aVar) {
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81925i2 i2Var = (C81925i2) fVar;
        Log.m105925i("MicroMsg.JsApiStopPlayVoice", "doStopVoice, appId : %s, localId : %s", i2Var.getAppId(), jSONObject.optString(C66261f3.COL_LOCALID));
        new StopPlayVoice((C82069a) null).mo114395c();
        i2Var.mo109647a(i, mo115109j("ok"));
        JsApiStartPlayVoice.f240653h = null;
    }
}
