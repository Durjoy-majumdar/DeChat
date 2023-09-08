package com.tencent.p014mm.plugin.appbrand.jsapi.audio;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.autogen.events.ExtPlayerEvent;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82531i;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82870p;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import eb0.C86493v0;
import java.util.HashMap;
import ob0.C76996p;
import org.json.JSONObject;
import p749xh.C66261f3;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiStartPlayVoice */
public class JsApiStartPlayVoice extends C82268c<C81925i2> {
    public static final int CTRL_INDEX = 33;
    public static final String NAME = "playVoice";

    /* renamed from: h */
    public static String f240653h;

    /* renamed from: g */
    public StartPlayVoice f240654g;

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81925i2 i2Var = (C81925i2) fVar;
        String nullAs = Util.nullAs(jSONObject.optString(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, (String) null), jSONObject.optString(C66261f3.COL_LOCALID));
        Log.m105925i("MicroMsg.JsApiStartPlayVoice", "doPlayVoice, appId : %s, localId : %s", i2Var.getAppId(), nullAs);
        if (Util.isNullOrNil(nullAs)) {
            i2Var.mo109647a(i, mo115109j("fail_missing arguments"));
            return;
        }
        C86009m1 absoluteFile = i2Var.getFileSystem().getAbsoluteFile(nullAs);
        C83780d1 l0 = i2Var.mo114341l0();
        if (absoluteFile == null || !absoluteFile.mo119967g() || l0 == null) {
            i2Var.mo109647a(i, mo115109j("fail"));
            return;
        }
        C86493v0 d = C86493v0.m107224d();
        C86493v0.C86495c c = d.mo120947c("JsApi@" + l0.hashCode(), true);
        C82531i.C82533b bVar = (C82531i.C82533b) c.mo120956c("onBackgroundListener", null);
        if (bVar == null) {
            bVar = new C82103x(this, l0);
            c.mo120962i("onBackgroundListener", bVar);
        }
        l0.mo114864j(bVar);
        if (((C82531i.C82534c) c.mo120956c("onDestroyListener", null)) == null) {
            C82104y yVar = new C82104y(this, l0);
            c.mo120962i("onDestroyListener", yVar);
            l0.mo114865m(yVar);
        }
        if (this.f240654g == null) {
            this.f240654g = new StartPlayVoice(this, i2Var, i);
        }
        if (f240653h != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(C66261f3.COL_LOCALID, this.f240654g.f240658i);
            i2Var.mo109647a(this.f240654g.f240657h, mo115112m("fail", hashMap));
            return;
        }
        StartPlayVoice startPlayVoice = this.f240654g;
        startPlayVoice.f240655f = this;
        startPlayVoice.f240656g = i2Var;
        startPlayVoice.f240657h = i;
        startPlayVoice.f240658i = nullAs;
        startPlayVoice.f240659j = absoluteFile.mo119971i();
        this.f240654g.mo114395c();
        f240653h = nullAs;
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiStartPlayVoice$StartPlayVoice */
    public static class StartPlayVoice extends MainProcessTask {
        public static final Parcelable.Creator<StartPlayVoice> CREATOR = new C82057b();

        /* renamed from: f */
        public C82870p f240655f;

        /* renamed from: g */
        public C81925i2 f240656g;

        /* renamed from: h */
        public int f240657h;

        /* renamed from: i */
        public String f240658i;

        /* renamed from: j */
        public String f240659j;

        /* renamed from: n */
        public boolean f240660n = false;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiStartPlayVoice$StartPlayVoice$b */
        public class C82057b implements Parcelable.Creator<StartPlayVoice> {
            public Object createFromParcel(Parcel parcel) {
                return new StartPlayVoice(parcel);
            }

            public Object[] newArray(int i) {
                return new StartPlayVoice[i];
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiStartPlayVoice$StartPlayVoice$a */
        public class C82058a implements Runnable {

            /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiStartPlayVoice$StartPlayVoice$a$a */
            public class C82059a implements C76996p.C77000a {
                public C82059a() {
                }

                public void onCompletion() {
                    StartPlayVoice startPlayVoice = StartPlayVoice.this;
                    startPlayVoice.f240660n = false;
                    startPlayVoice.mo114394b();
                }
            }

            /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiStartPlayVoice$StartPlayVoice$a$b */
            public class C82060b implements C76996p.C77001b {
                public C82060b() {
                }

                /* renamed from: a */
                public void mo96016a() {
                    StartPlayVoice startPlayVoice = StartPlayVoice.this;
                    startPlayVoice.f240660n = true;
                    startPlayVoice.mo114394b();
                }
            }

            public C82058a() {
            }

            public void run() {
                String str = StartPlayVoice.this.f240659j;
                C82059a aVar = new C82059a();
                C82060b bVar = new C82060b();
                ExtPlayerEvent extPlayerEvent = new ExtPlayerEvent();
                ExtPlayerEvent.C92500a aVar2 = extPlayerEvent.f264779d;
                aVar2.f264781a = 1;
                aVar2.f264782b = str;
                aVar2.f264783c = true;
                aVar2.f264784d = true;
                aVar2.f264785e = aVar;
                aVar2.f264786f = bVar;
                extPlayerEvent.publish();
            }
        }

        public StartPlayVoice(C82870p pVar, C81925i2 i2Var, int i) {
            this.f240655f = pVar;
            this.f240656g = i2Var;
            this.f240657h = i;
        }

        /* renamed from: g */
        public void mo1551g(Parcel parcel) {
            this.f240658i = parcel.readString();
            this.f240659j = parcel.readString();
            this.f240660n = parcel.readByte() != 0;
        }

        /* renamed from: i */
        public void mo1552i() {
            HashMap hashMap = new HashMap();
            hashMap.put(C66261f3.COL_LOCALID, this.f240658i);
            this.f240656g.mo109647a(this.f240657h, this.f240655f.mo115112m(this.f240660n ? "fail" : "ok", hashMap));
            JsApiStartPlayVoice.f240653h = null;
        }

        /* renamed from: j */
        public void mo1553j() {
            MMHandlerThread.postToMainThread(new C82058a());
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f240658i);
            parcel.writeString(this.f240659j);
            parcel.writeByte(this.f240660n ? (byte) 1 : 0);
        }

        public StartPlayVoice(Parcel parcel) {
            mo1551g(parcel);
        }
    }
}
