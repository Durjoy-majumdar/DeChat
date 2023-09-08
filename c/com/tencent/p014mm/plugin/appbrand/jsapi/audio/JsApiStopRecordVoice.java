package com.tencent.p014mm.plugin.appbrand.jsapi.audio;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.C84072q1;
import com.tencent.p014mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.media.record.C92910c;
import com.tencent.p014mm.sdk.platformtools.Util;
import js0.C88024r;
import org.json.JSONObject;
import qq0.C89816t;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiStopRecordVoice */
public final class JsApiStopRecordVoice extends C82268c<C81925i2> {
    public static final int CTRL_INDEX = 32;
    public static final String NAME = "stopRecord";

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiStopRecordVoice$StopRecordVoice */
    public static class StopRecordVoice extends MainProcessTask {
        public static final Parcelable.Creator<StopRecordVoice> CREATOR = new C82071b();

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiStopRecordVoice$StopRecordVoice$a */
        public class C82070a implements Runnable {
            public C82070a(StopRecordVoice stopRecordVoice) {
            }

            public void run() {
                C92910c.m117223a(1);
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiStopRecordVoice$StopRecordVoice$b */
        public class C82071b implements Parcelable.Creator<StopRecordVoice> {
            public Object createFromParcel(Parcel parcel) {
                return new StopRecordVoice((C82072a) null);
            }

            public Object[] newArray(int i) {
                return new StopRecordVoice[i];
            }
        }

        public StopRecordVoice() {
        }

        /* renamed from: j */
        public void mo1553j() {
            C88024r.m109571a().postToWorker(new C82070a(this));
        }

        public StopRecordVoice(C82072a aVar) {
        }
    }

    /* renamed from: w */
    public static void m100784w(C81925i2 i2Var) {
        if (!Util.isNullOrNil(JsApiStartRecordVoice.f240664j)) {
            C89816t.C89818b bVar = C84072q1.m103587b(i2Var.getAppId()).f245459c;
            if (bVar != null) {
                bVar.dismiss();
            }
            new StopRecordVoice((C82072a) null).mo114395c();
            JsApiStartRecordVoice.f240664j = null;
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81925i2 i2Var = (C81925i2) fVar;
        m100784w(i2Var);
        i2Var.mo109647a(i, mo115109j("ok"));
    }
}
