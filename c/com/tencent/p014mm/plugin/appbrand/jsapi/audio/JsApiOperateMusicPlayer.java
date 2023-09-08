package com.tencent.p014mm.plugin.appbrand.jsapi.audio;

import a70.C112760b;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.MusicPlayerEvent;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.C83231l;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandSysConfigWC;
import com.tencent.p014mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82870p;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82926s;
import com.tencent.p014mm.plugin.appbrand.media.music.C83613a;
import com.tencent.p014mm.plugin.appbrand.p026ui.banner.C84496e;
import com.tencent.p014mm.plugin.appbrand.p026ui.banner.C84498l;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tav.core.AssetExtension;
import com.tencent.xweb.file.XVFSFile;
import eb0.C86493v0;
import f12.C7970a;
import java.util.HashMap;
import java.util.Set;
import kr0.C88267e;
import org.json.JSONObject;
import qc0.C101093a;
import qc0.C101106m;
import qc0.C12154i;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiOperateMusicPlayer */
public class JsApiOperateMusicPlayer extends C82268c<C88267e> {
    public static final int CTRL_INDEX = 47;
    public static final String NAME = "operateMusicPlayer";

    /* renamed from: g */
    public OperateMusicPlayer f240537g;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiOperateMusicPlayer$a */
    public static final class C82041a extends C82926s {
        private static final int CTRL_INDEX = 82;
        private static final String NAME = "onMusicEnd";

        public C82041a(C82095p pVar) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiOperateMusicPlayer$b */
    public static final class C82042b extends C82926s {
        private static final int CTRL_INDEX = 81;
        private static final String NAME = "onMusicPause";

        public C82042b(C82095p pVar) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiOperateMusicPlayer$c */
    public static final class C82043c extends C82926s {
        private static final int CTRL_INDEX = 80;
        private static final String NAME = "onMusicPlay";

        public C82043c(C82095p pVar) {
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        OperateMusicPlayer operateMusicPlayer;
        C88267e eVar = (C88267e) fVar;
        this.f240537g = new OperateMusicPlayer(this, eVar, i);
        C86493v0.C86495c c = C86493v0.m107224d().mo120947c(C86493v0.m107223a("AppBrandService#" + eVar.hashCode()), true);
        synchronized (c) {
            C84498l lVar = (C84498l) c.mo120956c("StickyBannerChangeListener", null);
            if (lVar == null) {
                lVar = new C82095p(this, c, eVar);
                AppBrandSysConfigWC S1 = eVar.getRuntime().mo113213o1();
                if (S1 != null) {
                    c.mo120962i("pkgType", Integer.valueOf(S1.f261072r.f238585d));
                }
                c.mo120962i("StickyBannerChangeListener", lVar);
                c.mo120962i("appId", eVar.getAppId());
            }
            if (((C83231l.C83234d) c.mo120956c("AppBrandLifeCycle.Listener", null)) == null) {
                C82096q qVar = new C82096q(this, c, eVar);
                c.mo120962i("AppBrandLifeCycle.Listener", qVar);
                this.f240537g.f240540h = qVar;
            }
            operateMusicPlayer = this.f240537g;
            operateMusicPlayer.f240539g = lVar;
            operateMusicPlayer.f240538f = c;
        }
        operateMusicPlayer.f240544o = jSONObject.toString();
        this.f240537g.f240545p = eVar.getAppId();
        this.f240537g.mo114395c();
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiOperateMusicPlayer$OperateMusicPlayer */
    public static class OperateMusicPlayer extends MainProcessTask {
        public static final Parcelable.Creator<OperateMusicPlayer> CREATOR = new C82040f();

        /* renamed from: f */
        public C86493v0.C86495c f240538f;

        /* renamed from: g */
        public C84498l f240539g;

        /* renamed from: h */
        public C83231l.C83234d f240540h;

        /* renamed from: i */
        public C82870p f240541i;

        /* renamed from: j */
        public C81925i2 f240542j;

        /* renamed from: n */
        public int f240543n;

        /* renamed from: o */
        public String f240544o;

        /* renamed from: p */
        public String f240545p;

        /* renamed from: q */
        public boolean f240546q = false;

        /* renamed from: r */
        public String f240547r;

        /* renamed from: s */
        public int f240548s;

        /* renamed from: t */
        public String f240549t;

        /* renamed from: u */
        public final IListener f240550u = new IListener<MusicPlayerEvent>(C40008f.f107254d) {
            {
                this.__eventId = -1155728636;
            }

            public boolean callback(IEvent iEvent) {
                MusicPlayerEvent musicPlayerEvent = (MusicPlayerEvent) iEvent;
                Log.m105925i("MicroMsg.JsApiOperateMusicPlayer", "callback in(action : %s)", Integer.valueOf(musicPlayerEvent.f9336d.f9337a));
                C101106m mVar = musicPlayerEvent.f9336d.f9338b;
                if (mVar != null) {
                    String str = mVar.f295966n;
                    HashMap hashMap = new HashMap();
                    hashMap.put("dataUrl", str);
                    OperateMusicPlayer.this.f240547r = new JSONObject(hashMap).toString();
                    OperateMusicPlayer operateMusicPlayer = OperateMusicPlayer.this;
                    operateMusicPlayer.f240548s = musicPlayerEvent.f9336d.f9337a;
                    operateMusicPlayer.mo114394b();
                }
                return false;
            }
        };

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiOperateMusicPlayer$OperateMusicPlayer$a */
        public class C82035a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f240552d;

            /* renamed from: e */
            public final /* synthetic */ String f240553e;

            /* renamed from: f */
            public final /* synthetic */ String f240554f;

            /* renamed from: g */
            public final /* synthetic */ String f240555g;

            /* renamed from: h */
            public final /* synthetic */ String f240556h;

            /* renamed from: i */
            public final /* synthetic */ String f240557i;

            /* renamed from: j */
            public final /* synthetic */ String f240558j;

            public C82035a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
                this.f240552d = str;
                this.f240553e = str2;
                this.f240554f = str3;
                this.f240555g = str4;
                this.f240556h = str5;
                this.f240557i = str6;
                this.f240558j = str7;
            }

            public void run() {
                String str = "" + (OperateMusicPlayer.this.f240545p + this.f240552d + this.f240553e).hashCode();
                String str2 = this.f240553e;
                String str3 = this.f240554f;
                String str4 = this.f240555g;
                String str5 = this.f240556h;
                String str6 = this.f240557i;
                String str7 = this.f240552d;
                C112760b.m154195C();
                String str8 = this.f240558j;
                C101106m mVar = new C101106m();
                mVar.f295959d = 7;
                mVar.f295965j = str2;
                mVar.f295976x = str2;
                mVar.f295962g = str3;
                mVar.f295963h = str4;
                mVar.f295968p = str5;
                mVar.f295967o = str6;
                mVar.f295966n = str7;
                mVar.f295972t = "";
                mVar.f295970r = C7970a.m8127a() + this.f240553e.hashCode();
                mVar.f295960e = str;
                mVar.f295961f = 0.0f;
                mVar.f295964i = str8;
                mVar.f295969q = null;
                mVar.f295975w = str;
                mVar.f295941B = true;
                C101093a.m132488j(mVar);
                C83613a aVar = C83613a.C83615b.f244198a;
                OperateMusicPlayer operateMusicPlayer = OperateMusicPlayer.this;
                aVar.mo115927a(operateMusicPlayer.f240550u, operateMusicPlayer.f240545p);
                C83613a aVar2 = C83613a.C83615b.f244198a;
                aVar2.f244191a = OperateMusicPlayer.this.f240545p;
                aVar2.f244192b = mVar.f295960e;
                Log.m105924i("MicroMsg.JsApiOperateMusicPlayer", "startPlayMusic");
                OperateMusicPlayer operateMusicPlayer2 = OperateMusicPlayer.this;
                operateMusicPlayer2.f240548s = -1;
                operateMusicPlayer2.f240549t = "";
                operateMusicPlayer2.f240546q = false;
                operateMusicPlayer2.mo114394b();
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiOperateMusicPlayer$OperateMusicPlayer$b */
        public class C82036b implements Runnable {
            public C82036b() {
            }

            public void run() {
                Log.m105924i("MicroMsg.JsApiOperateMusicPlayer", "resume ok");
                OperateMusicPlayer operateMusicPlayer = OperateMusicPlayer.this;
                operateMusicPlayer.f240548s = -1;
                operateMusicPlayer.f240549t = "";
                operateMusicPlayer.f240546q = false;
                operateMusicPlayer.mo114394b();
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiOperateMusicPlayer$OperateMusicPlayer$c */
        public class C82037c implements Runnable {
            public C82037c() {
            }

            public void run() {
                Log.m105924i("MicroMsg.JsApiOperateMusicPlayer", "pause ok");
                OperateMusicPlayer operateMusicPlayer = OperateMusicPlayer.this;
                operateMusicPlayer.f240548s = -1;
                operateMusicPlayer.f240546q = false;
                operateMusicPlayer.f240549t = "";
                operateMusicPlayer.mo114394b();
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiOperateMusicPlayer$OperateMusicPlayer$d */
        public class C82038d implements Runnable {
            public C82038d() {
            }

            public void run() {
                Log.m105924i("MicroMsg.JsApiOperateMusicPlayer", "seek ok");
                OperateMusicPlayer operateMusicPlayer = OperateMusicPlayer.this;
                operateMusicPlayer.f240548s = -1;
                operateMusicPlayer.f240546q = false;
                operateMusicPlayer.f240549t = "";
                operateMusicPlayer.mo114394b();
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiOperateMusicPlayer$OperateMusicPlayer$e */
        public class C82039e implements Runnable {
            public C82039e() {
            }

            public void run() {
                Log.m105924i("MicroMsg.JsApiOperateMusicPlayer", "stop ok");
                OperateMusicPlayer operateMusicPlayer = OperateMusicPlayer.this;
                operateMusicPlayer.f240548s = -1;
                operateMusicPlayer.f240546q = false;
                operateMusicPlayer.f240549t = "";
                operateMusicPlayer.mo114394b();
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiOperateMusicPlayer$OperateMusicPlayer$f */
        public class C82040f implements Parcelable.Creator<OperateMusicPlayer> {
            public Object createFromParcel(Parcel parcel) {
                return new OperateMusicPlayer(parcel);
            }

            public Object[] newArray(int i) {
                return new OperateMusicPlayer[i];
            }
        }

        public OperateMusicPlayer(C82870p pVar, C81925i2 i2Var, int i) {
            this.f240541i = pVar;
            this.f240542j = i2Var;
            this.f240543n = i;
        }

        /* renamed from: g */
        public void mo1551g(Parcel parcel) {
            this.f240544o = parcel.readString();
            this.f240545p = parcel.readString();
            this.f240546q = parcel.readByte() != 0;
            this.f240547r = parcel.readString();
            this.f240548s = parcel.readInt();
            this.f240549t = parcel.readString();
        }

        /* renamed from: i */
        public void mo1552i() {
            String str;
            String str2;
            Log.m105925i("MicroMsg.JsApiOperateMusicPlayer", "runInClientProcess(action : %s)", Integer.valueOf(this.f240548s));
            C81925i2 i2Var = this.f240542j;
            int i = this.f240543n;
            C82870p pVar = this.f240541i;
            if (this.f240546q) {
                StringBuilder sb = new StringBuilder();
                sb.append("fail");
                if (TextUtils.isEmpty(this.f240549t)) {
                    str2 = "";
                } else {
                    str2 = XVFSFile.PATH_SEPARATOR + this.f240549t;
                }
                sb.append(str2);
                str = sb.toString();
            } else {
                str = "ok";
            }
            i2Var.mo109647a(i, pVar.mo115109j(str));
            int i2 = this.f240548s;
            if (i2 == 0) {
                Log.m105924i("MicroMsg.JsApiOperateMusicPlayer", "onMusicPlay in");
                C82043c cVar = new C82043c((C82095p) null);
                cVar.mo115194p(this.f240542j);
                cVar.f242407f = this.f240547r;
                cVar.mo115158h();
                this.f240538f.mo120962i("Music#isPlaying", Boolean.TRUE);
                Set<C84498l> set = C84496e.f246615a;
                C83231l.m102140a(this.f240542j.getAppId(), this.f240540h);
            } else if (i2 != 1) {
                if (i2 == 2) {
                    Log.m105924i("MicroMsg.JsApiOperateMusicPlayer", "onMusicStop in");
                    C82041a aVar = new C82041a((C82095p) null);
                    aVar.mo115194p(this.f240542j);
                    aVar.f242407f = this.f240547r;
                    aVar.mo115158h();
                } else if (i2 == 3) {
                    Log.m105924i("MicroMsg.JsApiOperateMusicPlayer", "onMusicPause in");
                    C82042b bVar = new C82042b((C82095p) null);
                    bVar.mo115194p(this.f240542j);
                    bVar.f242407f = this.f240547r;
                    bVar.mo115158h();
                    this.f240538f.mo120962i("Music#isPlaying", Boolean.FALSE);
                    Set<C84498l> set2 = C84496e.f246615a;
                    C83231l.m102144e(this.f240542j.getAppId(), this.f240540h);
                    return;
                } else if (i2 == 4) {
                    Log.m105924i("MicroMsg.JsApiOperateMusicPlayer", "onMusicError in");
                    this.f240542j.mo109652f("onMusicError", this.f240547r, 0);
                    this.f240538f.mo120962i("Music#isPlaying", Boolean.FALSE);
                    Set<C84498l> set3 = C84496e.f246615a;
                    C83231l.m102144e(this.f240542j.getAppId(), this.f240540h);
                    return;
                } else if (i2 != 7) {
                    return;
                }
                Log.m105924i("MicroMsg.JsApiOperateMusicPlayer", "onMusicEnd in");
                this.f240538f.mo120962i("Music#isPlaying", Boolean.FALSE);
                Set<C84498l> set4 = C84496e.f246615a;
                C83231l.m102144e(this.f240542j.getAppId(), this.f240540h);
            } else {
                Log.m105924i("MicroMsg.JsApiOperateMusicPlayer", "onMusicResume in");
                this.f240538f.mo120962i("Music#isPlaying", Boolean.TRUE);
                Set<C84498l> set5 = C84496e.f246615a;
                C83231l.m102140a(this.f240542j.getAppId(), this.f240540h);
            }
        }

        /* renamed from: j */
        public void mo1553j() {
            try {
                JSONObject jSONObject = new JSONObject(this.f240544o);
                String optString = jSONObject.optString("operationType");
                String optString2 = jSONObject.optString("dataUrl");
                if (Util.isNullOrNil(optString)) {
                    this.f240548s = -1;
                    this.f240546q = true;
                    this.f240549t = "operationType is null or nil";
                    mo114394b();
                } else if (!C83613a.C83615b.f244198a.mo115928b(this.f240545p, optString)) {
                    Log.m105924i("MicroMsg.JsApiOperateMusicPlayer", "appid not match cannot operate");
                    this.f240548s = -1;
                    this.f240546q = true;
                    this.f240549t = "appid not match cannot operate";
                    mo114394b();
                } else {
                    if (C101093a.m132483e() && !C101093a.m132481c() && optString.equalsIgnoreCase(AssetExtension.SCENE_PLAY)) {
                        C101106m b = C101093a.m132480b();
                        if (b == null || (!Util.isNullOrNil(optString2) && !optString2.equals(b.f295966n))) {
                            Log.m105924i("MicroMsg.JsApiOperateMusicPlayer", "data url has changed ,restart play");
                        } else if (C83613a.C83615b.f244198a.mo115928b(this.f240545p, "resume")) {
                            Log.m105925i("MicroMsg.JsApiOperateMusicPlayer", "same appid %s, change play to resume", this.f240545p);
                            optString = "resume";
                        } else {
                            Log.m105924i("MicroMsg.JsApiOperateMusicPlayer", "not same not same appid ,restart play");
                        }
                    }
                    if (optString.equalsIgnoreCase(AssetExtension.SCENE_PLAY)) {
                        String optString3 = jSONObject.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                        String optString4 = jSONObject.optString("singer");
                        String optString5 = jSONObject.optString("epname");
                        String optString6 = jSONObject.optString("coverImgUrl");
                        if (Util.isNullOrNil(optString2)) {
                            this.f240548s = -1;
                            this.f240546q = true;
                            this.f240549t = "dataUrl is null or nil";
                            mo114394b();
                            return;
                        }
                        Log.m105925i("MicroMsg.JsApiOperateMusicPlayer", "title : %s, singer : %s, epName : %s, coverImgUrl : %s, dataUrl : %s, lowbandUrl : %s, webUrl : %s", optString3, optString4, optString5, optString6, optString2, optString2, optString2);
                        C101093a.m132490l();
                        String str = C83613a.C83615b.f244198a.f244191a;
                        if (!Util.isNullOrNil(str)) {
                            Log.m105925i("MicroMsg.JsApiOperateMusicPlayer", "remove listener preAppid is %s, appid is %s", str, this.f240545p);
                            C83613a.C83615b.f244198a.mo115930d(str);
                        }
                        MMHandlerThread.postToMainThreadDelayed(new C82035a(optString2, optString6, optString3, optString4, optString2, optString2, optString5), 500);
                    } else if (optString.equalsIgnoreCase("resume")) {
                        String str2 = C83613a.C83615b.f244198a.f244191a;
                        if (!Util.isNullOrNil(str2)) {
                            Log.m105925i("MicroMsg.JsApiOperateMusicPlayer", "remove listener preAppid is %s, appid is %s", str2, this.f240545p);
                            C83613a.C83615b.f244198a.mo115930d(str2);
                        }
                        C83613a.C83615b.f244198a.mo115927a(this.f240550u, this.f240545p);
                        C83613a.C83615b.f244198a.f244191a = this.f240545p;
                        C101106m b2 = C101093a.m132480b();
                        if (b2 != null) {
                            C83613a.C83615b.f244198a.f244192b = b2.f295960e;
                        }
                        if (C12154i.m11769c()) {
                            MMHandlerThread.postToMainThreadDelayed(new C82036b(), 500);
                            return;
                        }
                        Log.m105924i("MicroMsg.JsApiOperateMusicPlayer", "resume fail");
                        this.f240548s = -1;
                        this.f240546q = true;
                        this.f240549t = "resume play fail";
                        mo114394b();
                    } else if (optString.equalsIgnoreCase("pause")) {
                        if (C12154i.m11768b()) {
                            MMHandlerThread.postToMainThreadDelayed(new C82037c(), 500);
                            return;
                        }
                        Log.m105924i("MicroMsg.JsApiOperateMusicPlayer", "pause fail");
                        this.f240548s = -1;
                        this.f240546q = true;
                        this.f240549t = "pause play fail";
                        mo114394b();
                    } else if (optString.equalsIgnoreCase("seek")) {
                        if (C101093a.m132487i(Util.getInt(Util.notNullToString(jSONObject.optString("position")), -1) * 1000)) {
                            MMHandlerThread.postToMainThreadDelayed(new C82038d(), 500);
                            return;
                        }
                        Log.m105924i("MicroMsg.JsApiOperateMusicPlayer", "seek fail");
                        this.f240548s = -1;
                        this.f240546q = true;
                        this.f240549t = "seek fail";
                        mo114394b();
                    } else if (!optString.equalsIgnoreCase("stop")) {
                        this.f240548s = -1;
                        this.f240546q = true;
                        mo114394b();
                    } else if (C12154i.m11770d()) {
                        MMHandlerThread.postToMainThreadDelayed(new C82039e(), 500);
                    } else {
                        Log.m105924i("MicroMsg.JsApiOperateMusicPlayer", "stop fail");
                        this.f240548s = -1;
                        this.f240546q = false;
                        this.f240549t = "stop play fail";
                        mo114394b();
                    }
                }
            } catch (Exception e) {
                Log.m105920e("MicroMsg.JsApiOperateMusicPlayer", e.toString());
                this.f240548s = -1;
                this.f240546q = true;
                this.f240549t = "data is null";
                mo114394b();
            }
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f240544o);
            parcel.writeString(this.f240545p);
            parcel.writeByte(this.f240546q ? (byte) 1 : 0);
            parcel.writeString(this.f240547r);
            parcel.writeInt(this.f240548s);
            parcel.writeString(this.f240549t);
        }

        public OperateMusicPlayer(Parcel parcel) {
            mo1551g(parcel);
        }
    }
}
