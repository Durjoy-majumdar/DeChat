package com.tencent.p014mm.plugin.appbrand.jsapi.audio;

import android.text.TextUtils;
import com.google.android.gms.measurement.AppMeasurement;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.AudioPlayerEvent;
import com.tencent.p014mm.plugin.appbrand.appcache.WxaPkg;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82870p;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82919r2;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import ea2.C20557b;
import hp0.C8648d;
import hp0.C87574a;
import hp0.C87576c;
import java.nio.ByteBuffer;
import java.util.HashMap;
import jk0.C87975a;
import js0.C9514m;
import nb0.C88912b;
import nb0.C88913c;
import org.json.JSONObject;
import p1055vh.C90804a;
import s24.C90125c;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetAudioState */
public class JsApiSetAudioState extends C82268c {
    public static final int CTRL_INDEX = 292;
    public static final String NAME = "setAudioState";

    /* renamed from: g */
    public AudioPlayerEventListenerTask f240596g;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetAudioState$AudioPlayerEventListenerTask */
    public static class AudioPlayerEventListenerTask extends C82073a {

        /* renamed from: d */
        public C82381f f240597d;

        /* renamed from: e */
        public String f240598e = "";

        /* renamed from: f */
        public String f240599f;

        /* renamed from: g */
        public int f240600g;

        /* renamed from: h */
        public String f240601h;

        /* renamed from: i */
        public IListener f240602i = new IListener<AudioPlayerEvent>(C40008f.f107254d) {
            {
                this.__eventId = 1218151603;
            }

            public boolean callback(IEvent iEvent) {
                AudioPlayerEvent audioPlayerEvent = (AudioPlayerEvent) iEvent;
                String str = audioPlayerEvent.f48073d.f48078e;
                if (!AudioPlayerEventListenerTask.this.f240598e.equals(str)) {
                    Log.m105925i("MicroMsg.Audio.JsApiSetAudioState", "appId is not equals preAppId, don't send any event, appId:%s, eventAppId:%s, action:%d", AudioPlayerEventListenerTask.this.f240598e, str, Integer.valueOf(audioPlayerEvent.f48073d.f48074a));
                    return false;
                }
                HashMap hashMap = new HashMap();
                AudioPlayerEvent.C17674a aVar = audioPlayerEvent.f48073d;
                String str2 = aVar.f48077d;
                AudioPlayerEventListenerTask.this.f240601h = aVar.f48076c;
                Log.m105919d("MicroMsg.Audio.JsApiSetAudioState", "mAudioListener callback action:%d， audioId:%s, state:%s", Integer.valueOf(aVar.f48074a), AudioPlayerEventListenerTask.this.f240601h, str2);
                hashMap.put("state", str2);
                hashMap.put("audioId", AudioPlayerEventListenerTask.this.f240601h);
                AudioPlayerEventListenerTask audioPlayerEventListenerTask = AudioPlayerEventListenerTask.this;
                AudioPlayerEvent.C17674a aVar2 = audioPlayerEvent.f48073d;
                int i = aVar2.f48074a;
                audioPlayerEventListenerTask.f240600g = i;
                if (i == 4) {
                    hashMap.put("errMsg", aVar2.f48080g);
                    hashMap.put("errCode", Integer.valueOf(audioPlayerEvent.f48073d.f48079f));
                } else if (i == 11) {
                    hashMap.put(AppMeasurement.Param.TIMESTAMP, Long.valueOf(System.currentTimeMillis()));
                }
                AudioPlayerEventListenerTask.this.f240599f = new JSONObject(hashMap).toString();
                AudioPlayerEventListenerTask audioPlayerEventListenerTask2 = AudioPlayerEventListenerTask.this;
                if (audioPlayerEventListenerTask2.f240597d == null) {
                    Log.m105920e("MicroMsg.Audio.JsApiSetAudioState", "server is null");
                    return true;
                }
                Log.m105925i("MicroMsg.Audio.JsApiSetAudioState", "AudioListenerTask action:%d, retJson:%s", Integer.valueOf(audioPlayerEventListenerTask2.f240600g), audioPlayerEventListenerTask2.f240599f);
                if (Util.isNullOrNil(audioPlayerEventListenerTask2.f240599f)) {
                    Log.m105920e("MicroMsg.Audio.JsApiSetAudioState", "jsonResult is null, err");
                    return true;
                }
                C82051a aVar3 = new C82051a();
                C87975a a = C82077c.f240688e.mo114530a(audioPlayerEventListenerTask2.f240598e);
                if (a == null || a.mo122426a(audioPlayerEventListenerTask2.f240601h) == null) {
                    aVar3.mo115161k(audioPlayerEventListenerTask2.f240597d);
                    aVar3.mo115163m(audioPlayerEventListenerTask2.f240599f);
                    aVar3.mo115158h();
                    return true;
                }
                aVar3.mo115161k(audioPlayerEventListenerTask2.f240597d);
                aVar3.mo115163m(audioPlayerEventListenerTask2.f240599f);
                aVar3.mo115159i(a.mo122426a(audioPlayerEventListenerTask2.f240601h));
                return true;
            }
        };

        public AudioPlayerEventListenerTask(C82381f fVar) {
            this.f240597d = fVar;
        }

        /* renamed from: a */
        public void mo114501a() {
            Log.m105918d("MicroMsg.Audio.JsApiSetAudioState", "AudioListenerTask, runTask");
            C87574a.m108909b(this.f240598e);
            String str = this.f240598e;
            IListener iListener = this.f240602i;
            if (TextUtils.isEmpty(str)) {
                Log.m105920e("MicroMsg.Audio.AppBrandAudioClientService", "appId is empty");
            } else if (iListener == null) {
                Log.m105920e("MicroMsg.Audio.AppBrandAudioClientService", "listener is null");
            } else {
                if (((HashMap) C87574a.f253659b).containsKey(str)) {
                    C87574a.m108909b(str);
                }
                Log.m105919d("MicroMsg.Audio.AppBrandAudioClientService", "addAudioPlayerListener,appId:%s", str);
                ((HashMap) C87574a.f253659b).put(str, iListener);
                if (!C87574a.f253660c.contains(str)) {
                    C87574a.f253660c.add(str);
                }
                iListener.alive();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetAudioState$a */
    public static final class C82051a extends C82919r2 {
        private static final int CTRL_INDEX = -2;
        private static final String NAME = "onAudioStateChange";
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetAudioState$b */
    public static class C82052b extends C82073a {

        /* renamed from: d */
        public C82870p f240604d;

        /* renamed from: e */
        public C82381f f240605e;

        /* renamed from: f */
        public int f240606f;

        /* renamed from: g */
        public String f240607g = "";

        /* renamed from: h */
        public String f240608h = "";

        /* renamed from: i */
        public String f240609i = "";

        /* renamed from: j */
        public int f240610j = 0;

        /* renamed from: n */
        public boolean f240611n = false;

        /* renamed from: o */
        public boolean f240612o = false;

        /* renamed from: p */
        public WxaPkg.Info f240613p;

        /* renamed from: q */
        public String f240614q = "";

        /* renamed from: r */
        public double f240615r;

        /* renamed from: s */
        public double f240616s;

        /* renamed from: t */
        public long f240617t;

        /* renamed from: u */
        public long f240618u;

        /* renamed from: v */
        public String f240619v = null;

        /* renamed from: w */
        public String f240620w = null;

        /* renamed from: x */
        public boolean f240621x = false;

        /* renamed from: y */
        public String f240622y;

        public C82052b(C82870p pVar, C82381f fVar, int i) {
            this.f240604d = pVar;
            this.f240605e = fVar;
            this.f240606f = i;
        }

        /* renamed from: a */
        public void mo114501a() {
            Log.m105924i("MicroMsg.Audio.JsApiSetAudioState", "SetAudioTask runTask");
            this.f240621x = false;
            this.f240622y = "";
            C88912b c = C88913c.m111005c(this.f240608h);
            C88912b bVar = new C88912b();
            bVar.f256416a = this.f240608h;
            String str = this.f240609i;
            bVar.f256417b = str;
            int i = this.f240610j;
            bVar.f256419d = i;
            bVar.f256420e = i;
            bVar.f256422g = this.f240611n;
            bVar.f256423h = this.f240612o;
            bVar.f256426k = this.f240614q;
            bVar.f256427l = this.f240615r;
            bVar.f256429n = this.f240607g;
            bVar.f256424i = 0;
            bVar.f256428m = this.f240616s;
            bVar.f256433r = this.f240617t;
            bVar.f256434s = this.f240618u;
            bVar.f256437v = this.f240619v;
            bVar.f256438w = this.f240620w;
            if (c != null && str.equalsIgnoreCase(c.f256417b)) {
                String str2 = this.f240608h;
                C90804a aVar = new C90804a();
                C90804a.C90805a aVar2 = aVar.f260748a;
                aVar2.f260750a = 7;
                aVar2.f260751b = str2;
                C20557b.m22327a(aVar);
                if (aVar.f260749b.f260756a) {
                    Log.m105924i("MicroMsg.Audio.JsApiSetAudioState", "same src is playing audio, not to start again, but setAudioParam to update");
                    Log.m105925i("MicroMsg.AudioPlayerHelper", "setAudioParam, audioId:%s, src:%s", bVar.f256416a, bVar.f256417b);
                    C90804a aVar3 = new C90804a();
                    C90804a.C90805a aVar4 = aVar3.f260748a;
                    aVar4.f260750a = 18;
                    aVar4.f260751b = bVar.f256416a;
                    aVar4.f260754e = bVar;
                    C20557b.m22327a(aVar3);
                    if (!aVar3.f260749b.f260756a) {
                        this.f240621x = true;
                        this.f240622y = "not to set audio param, the audioId is err";
                        Log.m105920e("MicroMsg.Audio.JsApiSetAudioState", "not to set audio param, the audioId is err");
                    }
                    mo114502b();
                    return;
                }
            }
            Log.m105925i("MicroMsg.Audio.JsApiSetAudioState", "appId:%s, audioId:%s, src:%s, startTime:%d", this.f240607g, this.f240608h, this.f240609i, Integer.valueOf(this.f240610j));
            if (this.f240609i.startsWith("file://")) {
                String substring = this.f240609i.substring(7);
                bVar.f256418c = substring;
                Log.m105925i("MicroMsg.Audio.JsApiSetAudioState", "filePath:%s", substring);
            } else if (this.f240609i.contains("base64") && this.f240609i.startsWith("data:audio")) {
                String str3 = this.f240609i;
                String b = C8648d.m8496b(str3.substring(str3.indexOf("base64,") + 7).trim());
                bVar.f256418c = b;
                Log.m105925i("MicroMsg.Audio.JsApiSetAudioState", "base64 decode filePath:%s", b);
            } else if (this.f240609i.startsWith("wxblob://")) {
                C9514m mVar = new C9514m();
                if (this.f240605e.getFileSystem().readFile(this.f240609i, mVar) == C81410b0.OK) {
                    bVar.f256415B = (ByteBuffer) mVar.f29691a;
                    bVar.f256418c = this.f240609i;
                    Log.m105924i("MicroMsg.Audio.JsApiSetAudioState", "wxblob read ok");
                } else {
                    Log.m105920e("MicroMsg.Audio.JsApiSetAudioState", "wxblob read fail");
                    C86009m1 privateAbsoluteFile = this.f240605e.getFileSystem().getPrivateAbsoluteFile(this.f240609i);
                    if (privateAbsoluteFile == null || !privateAbsoluteFile.mo119967g()) {
                        Log.m105920e("MicroMsg.Audio.JsApiSetAudioState", "wxblob localFile is null");
                        this.f240621x = true;
                        this.f240622y = "wxblob localFile is null";
                    } else {
                        bVar.f256418c = privateAbsoluteFile.mo119971i();
                    }
                }
            } else if (!this.f240609i.startsWith(HttpWrapperBase.PROTOCAL_HTTP) && !this.f240609i.startsWith(HttpWrapperBase.PROTOCAL_HTTPS)) {
                WxaPkg.Info info = this.f240613p;
                C87576c cVar = info == null ? null : new C87576c(info.f238570e, info.f238569d);
                if (cVar != null) {
                    if (cVar.f253667f != null) {
                        if (c == null || !this.f240609i.equalsIgnoreCase(c.f256417b) || TextUtils.isEmpty(c.f256418c)) {
                            bVar.f256418c = C8648d.m8495a(this.f240605e, this.f240609i);
                        } else {
                            bVar.f256418c = c.f256418c;
                        }
                        bVar.f256440y = cVar;
                    }
                }
                C90125c.m112774a(cVar);
                this.f240621x = true;
                this.f240622y = "the file not exist for src";
                Log.m105921e("MicroMsg.Audio.JsApiSetAudioState", "the wxa audioDataSource not found for src %s", this.f240609i);
                mo114502b();
                return;
            }
            if (!this.f240621x) {
                C88913c.m111010h(bVar);
            }
            mo114502b();
        }

        /* renamed from: b */
        public void mo114502b() {
            super.mo114502b();
            C82381f fVar = this.f240605e;
            if (fVar == null) {
                Log.m105920e("MicroMsg.Audio.JsApiSetAudioState", "server is null");
            } else if (this.f240621x) {
                int i = this.f240606f;
                C82870p pVar = this.f240604d;
                fVar.mo109647a(i, pVar.mo115109j("fail:" + this.f240622y));
            } else {
                fVar.mo109647a(this.f240606f, this.f240604d.mo115109j("ok"));
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0203  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0209  */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1505u(com.tencent.p014mm.plugin.appbrand.jsapi.C82381f r25, org.json.JSONObject r26, int r27) {
        /*
            r24 = this;
            r1 = r24
            r2 = r25
            r3 = r26
            r0 = r27
            java.lang.String r4 = r25.getAppId()
            java.util.Map<java.lang.String, java.lang.Boolean> r5 = hp0.C87574a.f253661d
            java.util.concurrent.ConcurrentHashMap r5 = (java.util.concurrent.ConcurrentHashMap) r5
            boolean r5 = r5.containsKey(r4)
            r6 = 0
            if (r5 != 0) goto L_0x0019
            r4 = 0
            goto L_0x0027
        L_0x0019:
            java.util.Map<java.lang.String, java.lang.Boolean> r5 = hp0.C87574a.f253661d
            java.util.concurrent.ConcurrentHashMap r5 = (java.util.concurrent.ConcurrentHashMap) r5
            java.lang.Object r4 = r5.get(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
        L_0x0027:
            java.lang.String r5 = "MicroMsg.Audio.JsApiSetAudioState"
            if (r4 != 0) goto L_0x003a
            java.lang.String r3 = "can't do operateAudio, App is paused or background"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r3)
            java.lang.String r3 = "fail:App is paused or background"
            java.lang.String r3 = r1.mo115109j(r3)
            r2.mo109647a(r0, r3)
            return
        L_0x003a:
            if (r3 != 0) goto L_0x004c
            java.lang.String r3 = "setAudioState data is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r3)
            java.lang.String r3 = "fail:data is null"
            java.lang.String r3 = r1.mo115109j(r3)
            r2.mo109647a(r0, r3)
            return
        L_0x004c:
            r4 = 1
            java.lang.Object[] r7 = new java.lang.Object[r4]
            java.lang.String r8 = r26.toString()
            r7[r6] = r8
            java.lang.String r8 = "setAudioState data:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r8, r7)
            java.lang.String r7 = "audioId"
            java.lang.String r7 = r3.optString(r7)
            java.lang.String r8 = "startTime"
            int r8 = r3.optInt(r8, r6)
            java.lang.String r9 = "src"
            java.lang.String r9 = r3.optString(r9)
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            java.lang.String r11 = "MicroMsg.Audio.WxaAudioUtils"
            java.lang.String r12 = "src is empty"
            if (r10 == 0) goto L_0x007e
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r12)
            goto L_0x00d0
        L_0x007e:
            java.lang.String r10 = "wxfile://"
            boolean r10 = r9.startsWith(r10)
            java.lang.String r13 = "getRealSrc:src:%s"
            if (r10 == 0) goto L_0x00d3
            com.tencent.mm.plugin.appbrand.appstorage.h0 r10 = r25.getFileSystem()
            if (r10 != 0) goto L_0x0095
            java.lang.String r9 = "getFileSystem() is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r9)
            goto L_0x00d0
        L_0x0095:
            com.tencent.mm.plugin.appbrand.appstorage.h0 r10 = r25.getFileSystem()
            com.tencent.mm.vfs.m1 r9 = r10.getAbsoluteFile(r9)
            if (r9 == 0) goto L_0x00cb
            boolean r10 = r9.mo119967g()
            if (r10 != 0) goto L_0x00a6
            goto L_0x00cb
        L_0x00a6:
            java.lang.String r9 = r9.mo119971i()
            if (r9 == 0) goto L_0x00c3
            java.lang.String r10 = "file://"
            boolean r14 = r9.startsWith(r10)
            if (r14 != 0) goto L_0x00c3
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r10)
            r14.append(r9)
            java.lang.String r9 = r14.toString()
        L_0x00c3:
            java.lang.Object[] r10 = new java.lang.Object[r4]
            r10[r6] = r9
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r13, r10)
            goto L_0x00e2
        L_0x00cb:
            java.lang.String r9 = "localFile is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r9)
        L_0x00d0:
            java.lang.String r9 = ""
            goto L_0x00e2
        L_0x00d3:
            int r10 = r9.length()
            r14 = 250(0xfa, float:3.5E-43)
            if (r10 > r14) goto L_0x00e2
            java.lang.Object[] r10 = new java.lang.Object[r4]
            r10[r6] = r9
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r13, r10)
        L_0x00e2:
            java.lang.String r10 = "autoplay"
            boolean r10 = r3.optBoolean(r10, r6)
            java.lang.String r11 = "loop"
            boolean r11 = r3.optBoolean(r11, r6)
            r13 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            java.lang.String r15 = "volume"
            r16 = r5
            double r4 = r3.optDouble(r15, r13)
            java.lang.String r15 = "playbackRate"
            double r17 = r3.optDouble(r15, r13)
            r19 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r15 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r15 < 0) goto L_0x010f
            r19 = 4611686018427387904(0x4000000000000000, double:2.0)
            int r15 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r15 <= 0) goto L_0x010d
            goto L_0x010f
        L_0x010d:
            r13 = r17
        L_0x010f:
            r17 = r7
            r6 = 0
            java.lang.String r15 = "timestamp"
            long r19 = r3.optLong(r15, r6)
            java.lang.Long r15 = java.lang.Long.valueOf(r19)
            java.lang.Long r19 = java.lang.Long.valueOf(r6)
            long r20 = java.lang.System.currentTimeMillis()
            java.lang.Long r20 = java.lang.Long.valueOf(r20)
            if (r10 == 0) goto L_0x014f
            long r21 = r15.longValue()
            int r23 = (r21 > r6 ? 1 : (r21 == r6 ? 0 : -1))
            if (r23 <= 0) goto L_0x0153
            long r6 = r15.longValue()
            long r21 = r20.longValue()
            int r23 = (r6 > r21 ? 1 : (r6 == r21 ? 0 : -1))
            if (r23 > 0) goto L_0x0153
            long r6 = r20.longValue()
            long r21 = r15.longValue()
            long r6 = r6 - r21
            java.lang.Long r19 = java.lang.Long.valueOf(r6)
            goto L_0x0153
        L_0x014f:
            java.lang.Long r20 = java.lang.Long.valueOf(r6)
        L_0x0153:
            boolean r6 = android.text.TextUtils.isEmpty(r17)
            if (r6 == 0) goto L_0x016a
            java.lang.String r3 = "audioId is empty"
            r6 = r16
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r3)
            java.lang.String r3 = "fail:audioId is empty"
            java.lang.String r3 = r1.mo115109j(r3)
            r2.mo109647a(r0, r3)
            return
        L_0x016a:
            r6 = r16
            boolean r7 = android.text.TextUtils.isEmpty(r9)
            if (r7 == 0) goto L_0x017f
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r12)
            java.lang.String r3 = "fail:src is empty"
            java.lang.String r3 = r1.mo115109j(r3)
            r2.mo109647a(r0, r3)
            return
        L_0x017f:
            com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetAudioState$AudioPlayerEventListenerTask r6 = r1.f240596g
            if (r6 != 0) goto L_0x018a
            com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetAudioState$AudioPlayerEventListenerTask r6 = new com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetAudioState$AudioPlayerEventListenerTask
            r6.<init>(r2)
            r1.f240596g = r6
        L_0x018a:
            com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetAudioState$AudioPlayerEventListenerTask r6 = r1.f240596g
            java.lang.String r7 = r25.getAppId()
            r6.f240598e = r7
            com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetAudioState$AudioPlayerEventListenerTask r6 = r1.f240596g
            r6.mo114528c()
            com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetAudioState$b r6 = new com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetAudioState$b
            r6.<init>(r1, r2, r0)
            java.lang.String r0 = r25.getAppId()
            r6.f240607g = r0
            r7 = r17
            r6.f240608h = r7
            r6.f240609i = r9
            r6.f240610j = r8
            r6.f240611n = r10
            r6.f240612o = r11
            r8 = 0
            com.tencent.mm.plugin.appbrand.appstorage.h0 r0 = r25.getFileSystem()     // Catch:{ Exception -> 0x01cd }
            boolean r0 = r0 instanceof com.tencent.p014mm.plugin.appbrand.appstorage.C81428p0     // Catch:{ Exception -> 0x01cd }
            if (r0 == 0) goto L_0x01de
            com.tencent.mm.plugin.appbrand.appstorage.h0 r0 = r25.getFileSystem()     // Catch:{ Exception -> 0x01cd }
            com.tencent.mm.plugin.appbrand.appstorage.p0 r0 = (com.tencent.p014mm.plugin.appbrand.appstorage.C81428p0) r0     // Catch:{ Exception -> 0x01cd }
            java.lang.Class<com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing> r10 = com.tencent.p014mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing.class
            com.tencent.mm.plugin.appbrand.appstorage.h0 r0 = r0.mo113748b(r10)     // Catch:{ Exception -> 0x01cd }
            com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing r0 = (com.tencent.p014mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing) r0     // Catch:{ Exception -> 0x01cd }
            java.util.Objects.requireNonNull(r0)     // Catch:{ Exception -> 0x01cd }
            com.tencent.mm.plugin.appbrand.appcache.WxaPkg$Info r0 = r0.openReadPartialInfo(r9)     // Catch:{ Exception -> 0x01cd }
            goto L_0x01df
        L_0x01cd:
            r0 = move-exception
            r10 = 2
            java.lang.Object[] r10 = new java.lang.Object[r10]
            r11 = 0
            r10[r11] = r9
            r11 = 1
            r10[r11] = r0
            java.lang.String r0 = "MicroMsg.JsApiSetAudioStateWxaApp"
            java.lang.String r11 = "getPkgPath with audioSrc(%s), e=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r11, r10)
        L_0x01de:
            r0 = r8
        L_0x01df:
            r6.f240613p = r0
            r6.f240615r = r4
            r6.f240616s = r13
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getProcessName()
            r6.f240614q = r0
            long r4 = r19.longValue()
            r6.f240617t = r4
            long r4 = r20.longValue()
            r6.f240618u = r4
            java.lang.Class<km0.a> r0 = km0.C88224a.class
            ra.b r0 = p224ra.C89909e.m112436a(r0)
            km0.a r0 = (km0.C88224a) r0
            java.lang.String r4 = "invalidReferrer"
            if (r0 != 0) goto L_0x0209
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r8, r4)
            goto L_0x022d
        L_0x0209:
            java.lang.String r5 = r0.mo117490BT(r3)
            if (r5 == 0) goto L_0x0227
            km0.c r10 = r0.mo117494kn(r5)
            if (r10 != 0) goto L_0x0219
            km0.c r10 = r0.mo117492eV(r2)
        L_0x0219:
            km0.c r11 = km0.C88226c.NO_REFERRER
            if (r11 != r10) goto L_0x021e
            goto L_0x0228
        L_0x021e:
            km0.c r8 = km0.C88226c.ORIGIN
            if (r8 != r10) goto L_0x0227
            java.lang.String r8 = r0.mo117489A4(r2)
            goto L_0x0228
        L_0x0227:
            r8 = r4
        L_0x0228:
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r5, r8)
        L_0x022d:
            java.lang.Object r2 = r0.first
            java.lang.String r2 = (java.lang.String) r2
            r6.f240619v = r2
            java.lang.Object r0 = r0.second
            java.lang.String r0 = (java.lang.String) r0
            r6.f240620w = r0
            r6.mo114528c()
            hp0.b r0 = new hp0.b
            r0.<init>()
            com.tencent.mm.plugin.appbrand.appcache.WxaPkg$Info r2 = r6.f240613p
            r0.f253662a = r2
            java.lang.String r2 = r26.toString()
            r0.f253663b = r2
            r0.f253664c = r9
            java.util.Map<java.lang.String, hp0.b> r2 = hp0.C87574a.f253658a
            java.util.concurrent.ConcurrentHashMap r2 = (java.util.concurrent.ConcurrentHashMap) r2
            r2.put(r7, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiSetAudioState.mo1505u(com.tencent.mm.plugin.appbrand.jsapi.f, org.json.JSONObject, int):void");
    }
}
