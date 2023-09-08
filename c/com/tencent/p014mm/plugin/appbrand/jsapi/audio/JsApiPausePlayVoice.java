package com.tencent.p014mm.plugin.appbrand.jsapi.audio;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.autogen.events.ExtPlayerEvent;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiPausePlayVoice */
public class JsApiPausePlayVoice extends C82268c<C81925i2> {
    public static final int CTRL_INDEX = 34;
    public static final String NAME = "pauseVoice";

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiPausePlayVoice$PausePlayVoice */
    public static class PausePlayVoice extends MainProcessTask {
        public static final Parcelable.Creator<PausePlayVoice> CREATOR = new C82048b();

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiPausePlayVoice$PausePlayVoice$a */
        public class C82047a implements Runnable {
            public C82047a(PausePlayVoice pausePlayVoice) {
            }

            public void run() {
                ExtPlayerEvent extPlayerEvent = new ExtPlayerEvent();
                extPlayerEvent.f264779d.f264781a = 4;
                extPlayerEvent.publish();
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiPausePlayVoice$PausePlayVoice$b */
        public class C82048b implements Parcelable.Creator<PausePlayVoice> {
            public Object createFromParcel(Parcel parcel) {
                return new PausePlayVoice((C82049a) null);
            }

            public Object[] newArray(int i) {
                return new PausePlayVoice[i];
            }
        }

        public PausePlayVoice() {
        }

        /* renamed from: j */
        public void mo1553j() {
            MMHandlerThread.postToMainThread(new C82047a(this));
        }

        public PausePlayVoice(C82049a aVar) {
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        new PausePlayVoice((C82049a) null).mo114395c();
        JsApiStartPlayVoice.f240653h = null;
        ((C81925i2) fVar).mo109647a(i, mo115109j("ok"));
    }
}
