package com.tencent.p014mm.plugin.appbrand.jsapi.audio;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.tencent.luggage.sdk.config.AppBrandSysConfigLU;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWCAccessible;
import com.tencent.p014mm.plugin.appbrand.C83231l;
import com.tencent.p014mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82870p;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82919r2;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioState;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioStateWC;
import com.tencent.p014mm.plugin.appbrand.media.music.C83613a;
import com.tencent.p014mm.plugin.appbrand.p026ui.banner.C84498l;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tav.core.AssetExtension;
import eb0.C86493v0;
import org.json.JSONException;
import org.json.JSONObject;
import p284zb.C91635f;
import qc0.C101093a;
import qc0.C101106m;
import qc0.C12154i;
import wi0.C90988l;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiOperateBackgroundAudio */
public class JsApiOperateBackgroundAudio<CONTEXT extends C82381f> extends C82268c<CONTEXT> {
    public static final int CTRL_INDEX = 161;
    public static final String NAME = "operateBackgroundAudio";

    /* renamed from: g */
    public JsApiSetBackgroundAudioState.SetBackgroundAudioListenerTask f240527g;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiOperateBackgroundAudio$a */
    public static final class C82031a extends C82919r2 {
        private static final int CTRL_INDEX = 162;
        private static final String NAME = "onBackgroundAudioNext";

        /* renamed from: i */
        public static final C82031a f240535i = new C82031a();
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiOperateBackgroundAudio$b */
    public static final class C82032b extends C82919r2 {
        private static final int CTRL_INDEX = 162;
        private static final String NAME = "onBackgroundAudioPrev";

        /* renamed from: i */
        public static final C82032b f240536i = new C82032b();
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiOperateBackgroundAudio$c */
    public static final class C82033c extends C82919r2 {
        private static final int CTRL_INDEX = 162;
        private static final String NAME = "onBackgroundAudioStateChange";
    }

    /* renamed from: u */
    public void mo1505u(CONTEXT context, JSONObject jSONObject, int i) {
        if (jSONObject == null) {
            context.mo109647a(i, mo115109j("fail:data is null"));
            Log.m105920e("MicroMsg.Music.JsApiOperateBackgroundAudio", "operateBackgroundAudio data is null");
            return;
        }
        String appId = context.getAppId();
        Log.m105925i("MicroMsg.Music.JsApiOperateBackgroundAudio", "operateBackgroundAudio appId:%s", appId);
        if (this.f240527g == null) {
            this.f240527g = new JsApiSetBackgroundAudioStateWC.SetBackgroundAudioListenerTaskWC(this, (C91635f) context, i);
        }
        JsApiSetBackgroundAudioState.SetBackgroundAudioListenerTask setBackgroundAudioListenerTask = this.f240527g;
        setBackgroundAudioListenerTask.f240626h = i;
        setBackgroundAudioListenerTask.f240630o = appId;
        C82094o oVar = (C82094o) this;
        C91635f fVar = (C91635f) context;
        if (oVar.f240527g != null) {
            AppBrandSysConfigLU o1 = fVar.getRuntime().mo113051d0();
            oVar.f240527g.f240627i = o1.f261072r.f238585d;
            JsApiSetBackgroundAudioState.SetBackgroundAudioListenerTask setBackgroundAudioListenerTask2 = oVar.f240527g;
            setBackgroundAudioListenerTask2.f240628j = o1.f261061d;
            setBackgroundAudioListenerTask2.f240629n = AppBrandRuntimeWCAccessible.m99325a(fVar);
            String a = C86493v0.m107223a("AppBrandService#" + fVar.hashCode());
            C86493v0.C86495c c = C86493v0.m107224d().mo120947c(a, true);
            synchronized (c) {
                C84498l lVar = (C84498l) c.mo120956c("StickyBannerChangeListener", null);
                if (lVar == null) {
                    lVar = new C82092m(oVar, c);
                    C90988l lVar2 = (C90988l) fVar.mo109671p(C90988l.class);
                    if (lVar2 != null) {
                        c.mo120962i("pkgType", Integer.valueOf(lVar2.f261072r.f238585d));
                    }
                    c.mo120962i("StickyBannerChangeListener", lVar);
                    c.mo120962i("appId", fVar.getAppId());
                }
                if (((C83231l.C83234d) c.mo120956c("AppBrandLifeCycle.Listener", null)) == null) {
                    C82093n nVar = new C82093n(oVar, c, a);
                    c.mo120962i("AppBrandLifeCycle.Listener", nVar);
                    oVar.f240527g.f240624f = nVar;
                }
                JsApiSetBackgroundAudioState.SetBackgroundAudioListenerTask setBackgroundAudioListenerTask3 = oVar.f240527g;
                if (setBackgroundAudioListenerTask3 instanceof JsApiSetBackgroundAudioStateWC.SetBackgroundAudioListenerTaskWC) {
                    ((JsApiSetBackgroundAudioStateWC.SetBackgroundAudioListenerTaskWC) setBackgroundAudioListenerTask3).f240651u = lVar;
                    ((JsApiSetBackgroundAudioStateWC.SetBackgroundAudioListenerTaskWC) setBackgroundAudioListenerTask3).f240650t = c;
                }
            }
        }
        OperateBackgroundAudioTask operateBackgroundAudioTask = new OperateBackgroundAudioTask(this, context, i);
        operateBackgroundAudioTask.f240530h = i;
        operateBackgroundAudioTask.f240531i = appId;
        operateBackgroundAudioTask.f240532j = jSONObject.toString();
        operateBackgroundAudioTask.mo114395c();
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiOperateBackgroundAudio$OperateBackgroundAudioTask */
    public static class OperateBackgroundAudioTask extends MainProcessTask {
        public static final Parcelable.Creator<OperateBackgroundAudioTask> CREATOR = new C82030a();

        /* renamed from: f */
        public C82870p f240528f;

        /* renamed from: g */
        public C82381f f240529g;

        /* renamed from: h */
        public int f240530h;

        /* renamed from: i */
        public String f240531i;

        /* renamed from: j */
        public String f240532j;

        /* renamed from: n */
        public boolean f240533n = false;

        /* renamed from: o */
        public String f240534o = "";

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiOperateBackgroundAudio$OperateBackgroundAudioTask$a */
        public class C82030a implements Parcelable.Creator<OperateBackgroundAudioTask> {
            public Object createFromParcel(Parcel parcel) {
                return new OperateBackgroundAudioTask(parcel);
            }

            public Object[] newArray(int i) {
                return new OperateBackgroundAudioTask[i];
            }
        }

        public OperateBackgroundAudioTask(C82268c cVar, C82381f fVar, int i) {
            this.f240528f = cVar;
            this.f240529g = fVar;
            this.f240530h = i;
        }

        /* renamed from: g */
        public void mo1551g(Parcel parcel) {
            this.f240531i = parcel.readString();
            this.f240532j = parcel.readString();
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.f240533n = z;
            this.f240534o = parcel.readString();
        }

        /* renamed from: i */
        public void mo1552i() {
            if (this.f240529g == null) {
                Log.m105920e("MicroMsg.Music.JsApiOperateBackgroundAudio", "service is null, don't callback");
                return;
            }
            if (!this.f240533n) {
                Log.m105924i("MicroMsg.Music.JsApiOperateBackgroundAudio", "operateBackgroundAudio ok");
                this.f240529g.mo109647a(this.f240530h, this.f240528f.mo115109j("ok"));
            } else {
                Log.m105921e("MicroMsg.Music.JsApiOperateBackgroundAudio", "operateBackgroundAudio fail:%s", this.f240534o);
                C82381f fVar = this.f240529g;
                int i = this.f240530h;
                C82870p pVar = this.f240528f;
                fVar.mo109647a(i, pVar.mo115109j("fail:" + this.f240534o));
            }
            mo114397h();
        }

        /* renamed from: j */
        public void mo1553j() {
            Log.m105924i("MicroMsg.Music.JsApiOperateBackgroundAudio", "runInMainProcess");
            String str = C83613a.C83615b.f244198a.f244191a;
            if (Util.isNullOrNil(str) || str.equals(this.f240531i)) {
                try {
                    JSONObject jSONObject = new JSONObject(this.f240532j);
                    String optString = jSONObject.optString("operationType");
                    double optDouble = jSONObject.optDouble("currentTime", -1.0d);
                    if (TextUtils.isEmpty(optString)) {
                        Log.m105920e("MicroMsg.Music.JsApiOperateBackgroundAudio", "operationType is null");
                        this.f240533n = true;
                        this.f240534o = "operationType is null";
                        mo114394b();
                        return;
                    }
                    Log.m105925i("MicroMsg.Music.JsApiOperateBackgroundAudio", "operationType;%s, currentTime:%f", optString, Double.valueOf(optDouble));
                    this.f240533n = false;
                    if (optString.equalsIgnoreCase(AssetExtension.SCENE_PLAY)) {
                        C101106m mVar = C83613a.C83615b.f244198a.f244193c;
                        if (mVar == null) {
                            mVar = C101093a.m132480b();
                        }
                        if (mVar != null) {
                            C83613a.C83615b.f244198a.f244192b = mVar.f295960e;
                        }
                        if (C12154i.m11769c()) {
                            Log.m105924i("MicroMsg.Music.JsApiOperateBackgroundAudio", "play music ok");
                        } else if (C101093a.m132481c()) {
                            this.f240533n = true;
                            this.f240534o = "music is playing, don't play again";
                        } else if (mVar == null || !this.f240531i.equals(mVar.f295972t)) {
                            this.f240533n = true;
                            this.f240534o = "play music fail";
                        } else {
                            Log.m105924i("MicroMsg.Music.JsApiOperateBackgroundAudio", "startPlayMusic play music ok, appId is same!");
                            C101093a.m132488j(mVar);
                        }
                    } else if (optString.equalsIgnoreCase("pause")) {
                        if (C12154i.m11768b()) {
                            Log.m105924i("MicroMsg.Music.JsApiOperateBackgroundAudio", "pause music ok");
                        } else {
                            this.f240533n = true;
                            this.f240534o = "pause music fail";
                        }
                    } else if (optString.equalsIgnoreCase("seek")) {
                        if (optDouble < 0.0d) {
                            Log.m105920e("MicroMsg.Music.JsApiOperateBackgroundAudio", "currentTime is invalid!");
                            this.f240533n = true;
                            this.f240534o = "currentTime is invalid";
                        } else if (C101093a.m132487i((int) (optDouble * 1000.0d))) {
                            Log.m105924i("MicroMsg.Music.JsApiOperateBackgroundAudio", "seek music ok");
                        } else {
                            this.f240533n = true;
                            this.f240534o = "seek music fail";
                        }
                    } else if (!optString.equalsIgnoreCase("stop")) {
                        Log.m105920e("MicroMsg.Music.JsApiOperateBackgroundAudio", "operationType is invalid");
                        this.f240533n = true;
                        this.f240534o = "operationType is invalid";
                    } else if (C12154i.m11770d()) {
                        Log.m105924i("MicroMsg.Music.JsApiOperateBackgroundAudio", "stop music ok");
                    } else {
                        this.f240533n = true;
                        this.f240534o = "stop music fail";
                    }
                    if (this.f240533n) {
                        Log.m105920e("MicroMsg.Music.JsApiOperateBackgroundAudio", this.f240534o);
                    }
                    mo114394b();
                } catch (JSONException e) {
                    Log.m105921e("MicroMsg.Music.JsApiOperateBackgroundAudio", "new json exists exception, data is invalid, jsonStr:%s", this.f240532j);
                    this.f240533n = true;
                    this.f240534o = "parser data fail, data is invalid";
                    Log.m105920e("MicroMsg.Music.JsApiOperateBackgroundAudio", "exception:%s" + e.getMessage());
                    mo114394b();
                }
            } else {
                Log.m105925i("MicroMsg.Music.JsApiOperateBackgroundAudio", "appid not match cannot operate, preAppId:%s, appId:%s", str, this.f240531i);
                this.f240533n = true;
                this.f240534o = "appid not match cannot operate";
                mo114394b();
            }
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f240531i);
            parcel.writeString(this.f240532j);
            parcel.writeInt(this.f240533n ? 1 : 0);
            parcel.writeString(this.f240534o);
        }

        public OperateBackgroundAudioTask(Parcel parcel) {
            mo1551g(parcel);
        }
    }
}
