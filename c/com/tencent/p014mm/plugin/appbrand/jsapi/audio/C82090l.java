package com.tencent.p014mm.plugin.appbrand.jsapi.audio;

import android.text.TextUtils;
import com.google.android.gms.measurement.AppMeasurement;
import com.tencent.p014mm.plugin.appbrand.appcache.WxaPkg;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82870p;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiSetAudioState;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.tav.core.AssetExtension;
import hp0.C87574a;
import hp0.C87575b;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.l */
public class C82090l extends C82268c {
    public static final int CTRL_INDEX = 297;
    public static final String NAME = "operateAudio";

    /* renamed from: g */
    public JsApiSetAudioState.AudioPlayerEventListenerTask f240716g;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.l$a */
    public static final class C82091a extends C82073a {

        /* renamed from: d */
        public C82870p f240717d;

        /* renamed from: e */
        public C82381f f240718e;

        /* renamed from: f */
        public int f240719f;

        /* renamed from: g */
        public String f240720g = "";

        /* renamed from: h */
        public String f240721h = "";

        /* renamed from: i */
        public String f240722i = "";

        /* renamed from: j */
        public int f240723j = 0;

        /* renamed from: n */
        public String f240724n;

        /* renamed from: o */
        public WxaPkg.Info f240725o;

        /* renamed from: p */
        public String f240726p = "";

        /* renamed from: q */
        public String f240727q = "";

        /* renamed from: r */
        public long f240728r;

        /* renamed from: s */
        public long f240729s;

        /* renamed from: t */
        public boolean f240730t = false;

        /* renamed from: u */
        public String f240731u;

        public C82091a(C82870p pVar, C82381f fVar, int i) {
            this.f240717d = pVar;
            this.f240718e = fVar;
            this.f240719f = i;
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x00b8  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x00ca  */
        /* JADX WARNING: Removed duplicated region for block: B:57:0x019d  */
        /* JADX WARNING: Removed duplicated region for block: B:60:0x01ad  */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x01b7  */
        /* JADX WARNING: Removed duplicated region for block: B:95:0x02d1  */
        /* JADX WARNING: Removed duplicated region for block: B:98:0x02dd  */
        /* JADX WARNING: Removed duplicated region for block: B:99:0x02e4  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo114501a() {
            /*
                r18 = this;
                r1 = r18
                r2 = 1
                java.lang.Object[] r0 = new java.lang.Object[r2]
                java.lang.String r3 = r1.f240722i
                r4 = 0
                r0[r4] = r3
                java.lang.String r3 = "MicroMsg.Audio.JsApiOperateAudio"
                java.lang.String r5 = "runTask operationType;%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r5, r0)
                r1.f240730t = r4
                java.lang.String r0 = r1.f240722i
                java.lang.String r5 = "play"
                boolean r5 = r0.equalsIgnoreCase(r5)
                if (r5 == 0) goto L_0x01e2
                java.lang.String r0 = r1.f240721h
                nb0.b r0 = nb0.C88913c.m111005c(r0)
                r5 = 7
                if (r0 != 0) goto L_0x0199
                java.lang.String r0 = "play operate, playParam is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
                com.tencent.mm.plugin.appbrand.jsapi.f r7 = r1.f240718e
                java.lang.String r0 = r1.f240720g
                java.lang.String r8 = r1.f240721h
                java.lang.String r9 = r1.f240727q
                java.lang.String r10 = r1.f240724n
                com.tencent.mm.plugin.appbrand.appcache.WxaPkg$Info r11 = r1.f240725o
                java.lang.String r12 = r1.f240726p
                boolean r13 = android.text.TextUtils.isEmpty(r10)
                r14 = 2
                java.lang.String r15 = "MicroMsg.Audio.AudioPlayerParamParser"
                if (r13 != 0) goto L_0x0188
                boolean r13 = android.text.TextUtils.isEmpty(r9)
                if (r13 == 0) goto L_0x004d
                goto L_0x0188
            L_0x004d:
                java.lang.Object[] r13 = new java.lang.Object[r14]
                r13[r4] = r8
                r13[r2] = r10
                java.lang.String r14 = "parseAudioPlayParam audioId:%s, sourceData:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r14, r13)
                nb0.b r13 = new nb0.b
                r13.<init>()
                r13.f256429n = r0
                r13.f256416a = r8
                r13.f256426k = r12
                r13.f256417b = r9
                r13.f256424i = r4
                org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00a3 }
                r0.<init>(r10)     // Catch:{ JSONException -> 0x00a3 }
                java.lang.String r8 = "startTime"
                int r8 = r0.optInt(r8, r4)     // Catch:{ JSONException -> 0x00a3 }
                java.lang.String r10 = "autoplay"
                boolean r10 = r0.optBoolean(r10, r4)     // Catch:{ JSONException -> 0x00a3 }
                java.lang.String r12 = "loop"
                boolean r12 = r0.optBoolean(r12, r4)     // Catch:{ JSONException -> 0x00a3 }
                java.lang.String r14 = "volume"
                r16 = r7
                r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                r17 = r3
                double r2 = r0.optDouble(r14, r6)     // Catch:{ JSONException -> 0x00a1 }
                java.lang.String r14 = "playbackRate"
                double r6 = r0.optDouble(r14, r6)     // Catch:{ JSONException -> 0x00a1 }
                r13.f256419d = r8     // Catch:{ JSONException -> 0x00a1 }
                r13.f256420e = r8     // Catch:{ JSONException -> 0x00a1 }
                r13.f256422g = r10     // Catch:{ JSONException -> 0x00a1 }
                r13.f256423h = r12     // Catch:{ JSONException -> 0x00a1 }
                r13.f256427l = r2     // Catch:{ JSONException -> 0x00a1 }
                r13.f256428m = r6     // Catch:{ JSONException -> 0x00a1 }
                goto L_0x00b0
            L_0x00a1:
                r0 = move-exception
                goto L_0x00a8
            L_0x00a3:
                r0 = move-exception
                r17 = r3
                r16 = r7
            L_0x00a8:
                java.lang.Object[] r2 = new java.lang.Object[r4]
                java.lang.String r3 = "parseAudioPlayParam"
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r15, r0, r3, r2)
            L_0x00b0:
                java.lang.String r0 = "file://"
                boolean r0 = r9.startsWith(r0)
                if (r0 == 0) goto L_0x00ca
                java.lang.String r0 = r9.substring(r5)
                r13.f256418c = r0
                r2 = 1
                java.lang.Object[] r3 = new java.lang.Object[r2]
                r3[r4] = r0
                java.lang.String r0 = "filePath:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r0, r3)
                goto L_0x0186
            L_0x00ca:
                java.lang.String r0 = "base64"
                boolean r0 = r9.contains(r0)
                if (r0 == 0) goto L_0x00fb
                java.lang.String r0 = "data:audio"
                boolean r0 = r9.startsWith(r0)
                if (r0 == 0) goto L_0x00fb
                java.lang.String r0 = "base64,"
                int r0 = r9.indexOf(r0)
                int r0 = r0 + r5
                java.lang.String r0 = r9.substring(r0)
                java.lang.String r0 = r0.trim()
                java.lang.String r0 = hp0.C8648d.m8496b(r0)
                r13.f256418c = r0
                r2 = 1
                java.lang.Object[] r3 = new java.lang.Object[r2]
                r3[r4] = r0
                java.lang.String r0 = "base64 decode filePath:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r0, r3)
                goto L_0x0186
            L_0x00fb:
                java.lang.String r0 = "wxblob://"
                boolean r0 = r9.startsWith(r0)
                if (r0 == 0) goto L_0x0149
                js0.m r0 = new js0.m
                r0.<init>()
                com.tencent.mm.plugin.appbrand.appstorage.h0 r2 = r16.getFileSystem()
                com.tencent.mm.plugin.appbrand.appstorage.b0 r2 = r2.readFile(r9, r0)
                com.tencent.mm.plugin.appbrand.appstorage.b0 r3 = com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0.OK
                if (r2 != r3) goto L_0x0124
                T r0 = r0.f29691a
                java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
                r13.f256415B = r0
                r13.f256418c = r9
                java.lang.String r0 = "wxblob read ok"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r0)
                goto L_0x0186
            L_0x0124:
                java.lang.String r0 = "wxblob read fail"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r0)
                com.tencent.mm.plugin.appbrand.appstorage.h0 r0 = r16.getFileSystem()
                com.tencent.mm.vfs.m1 r0 = r0.getPrivateAbsoluteFile(r9)
                if (r0 == 0) goto L_0x0142
                boolean r2 = r0.mo119967g()
                if (r2 != 0) goto L_0x013b
                goto L_0x0142
            L_0x013b:
                java.lang.String r0 = r0.mo119971i()
                r13.f256418c = r0
                goto L_0x0186
            L_0x0142:
                java.lang.String r0 = "wxblob localFile is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r0)
                goto L_0x0186
            L_0x0149:
                java.lang.String r0 = "http://"
                boolean r0 = r9.startsWith(r0)
                if (r0 != 0) goto L_0x0186
                java.lang.String r0 = "https://"
                boolean r0 = r9.startsWith(r0)
                if (r0 != 0) goto L_0x0186
                if (r11 != 0) goto L_0x015d
                r0 = 0
                goto L_0x0166
            L_0x015d:
                hp0.c r0 = new hp0.c
                java.lang.String r2 = r11.f238570e
                java.lang.String r3 = r11.f238569d
                r0.<init>(r2, r3)
            L_0x0166:
                if (r0 == 0) goto L_0x0177
                rc.a r2 = r0.f253667f
                if (r2 == 0) goto L_0x016e
                r2 = 1
                goto L_0x016f
            L_0x016e:
                r2 = 0
            L_0x016f:
                if (r2 != 0) goto L_0x0172
                goto L_0x0177
            L_0x0172:
                r13.f256418c = r9
                r13.f256440y = r0
                goto L_0x0186
            L_0x0177:
                r2 = 1
                java.lang.Object[] r3 = new java.lang.Object[r2]
                r3[r4] = r9
                java.lang.String r2 = "the wxa audioDataSource not found for src %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r15, r2, r3)
                s24.C90125c.m112774a(r0)
                goto L_0x0197
            L_0x0186:
                r0 = r13
                goto L_0x019b
            L_0x0188:
                r17 = r3
                java.lang.Object[] r0 = new java.lang.Object[r14]
                r0[r4] = r10
                r2 = 1
                r0[r2] = r9
                java.lang.String r2 = "parseAudioPlayParam, sourceData or src is null, sourceData:%s, src:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r15, r2, r0)
            L_0x0197:
                r0 = 0
                goto L_0x019b
            L_0x0199:
                r17 = r3
            L_0x019b:
                if (r0 == 0) goto L_0x01a5
                long r2 = r1.f240728r
                r0.f256435t = r2
                long r2 = r1.f240729s
                r0.f256436u = r2
            L_0x01a5:
                java.lang.String r2 = r1.f240721h
                boolean r0 = nb0.C88913c.m111008f(r2, r0)
                if (r0 == 0) goto L_0x01b7
                java.lang.String r0 = "play audio ok"
                r2 = r17
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
                goto L_0x02cd
            L_0x01b7:
                r2 = r17
                java.lang.String r0 = r1.f240721h
                vh.a r3 = new vh.a
                r3.<init>()
                vh.a$a r4 = r3.f260748a
                r4.f260750a = r5
                r4.f260751b = r0
                ea2.C20557b.m22327a(r3)
                vh.a$b r0 = r3.f260749b
                boolean r0 = r0.f260756a
                if (r0 == 0) goto L_0x01d8
                r3 = 1
                r1.f240730t = r3
                java.lang.String r0 = "audio is playing, don't play again"
                r1.f240731u = r0
                goto L_0x02cd
            L_0x01d8:
                r3 = 1
                r1.f240730t = r3
                java.lang.String r0 = "play audio fail"
                r1.f240731u = r0
                goto L_0x02cd
            L_0x01e2:
                r2 = r3
                java.lang.String r3 = "pause"
                boolean r3 = r0.equalsIgnoreCase(r3)
                if (r3 == 0) goto L_0x0206
                java.lang.String r0 = r1.f240721h
                boolean r0 = nb0.C88913c.m111007e(r0)
                if (r0 == 0) goto L_0x01fc
                java.lang.String r0 = "pause audio ok"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
                goto L_0x02cd
            L_0x01fc:
                r3 = 1
                r1.f240730t = r3
                java.lang.String r0 = "pause audio fail"
                r1.f240731u = r0
                goto L_0x02cd
            L_0x0206:
                r3 = 1
                java.lang.String r5 = "seek"
                boolean r5 = r0.equalsIgnoreCase(r5)
                if (r5 == 0) goto L_0x0251
                java.lang.Object[] r0 = new java.lang.Object[r3]
                int r5 = r1.f240723j
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r0[r4] = r5
                java.lang.String r5 = "currentTime:%d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r5, r0)
                int r0 = r1.f240723j
                if (r0 >= 0) goto L_0x0238
                java.lang.Object[] r5 = new java.lang.Object[r3]
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r5[r4] = r0
                java.lang.String r0 = "currentTime %d is invalid!"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r0, r5)
                r1.f240730t = r3
                java.lang.String r0 = "currentTime is invalid"
                r1.f240731u = r0
                goto L_0x02cd
            L_0x0238:
                java.lang.String r4 = r1.f240721h
                boolean r0 = nb0.C88913c.m111009g(r4, r0)
                if (r0 == 0) goto L_0x0248
                java.lang.String r0 = "seek audio ok"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
                goto L_0x02cd
            L_0x0248:
                r1.f240730t = r3
                java.lang.String r0 = "seek audio fail"
                r1.f240731u = r0
                goto L_0x02cd
            L_0x0251:
                java.lang.String r3 = "stop"
                boolean r0 = r0.equalsIgnoreCase(r3)
                if (r0 == 0) goto L_0x02c2
                java.lang.String r0 = r1.f240721h
                vh.a r3 = new vh.a
                r3.<init>()
                vh.a$a r5 = r3.f260748a
                r6 = 13
                r5.f260750a = r6
                r5.f260751b = r0
                ea2.C20557b.m22327a(r3)
                vh.a$b r3 = r3.f260749b
                boolean r3 = r3.f260756a
                if (r3 == 0) goto L_0x0294
                r3 = 1
                java.lang.Object[] r5 = new java.lang.Object[r3]
                r5[r4] = r0
                java.lang.String r3 = "MicroMsg.AudioPlayerHelper"
                java.lang.String r4 = "stopAudioOnBackground, audioId:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r5)
                vh.a r3 = new vh.a
                r3.<init>()
                vh.a$a r4 = r3.f260748a
                r5 = 14
                r4.f260750a = r5
                r4.f260751b = r0
                ea2.C20557b.m22327a(r3)
                vh.a$b r0 = r3.f260749b
                boolean r0 = r0.f260756a
                goto L_0x02b0
            L_0x0294:
                vh.a r3 = new vh.a
                r3.<init>()
                vh.a$a r4 = r3.f260748a
                r5 = 17
                r4.f260750a = r5
                r4.f260751b = r0
                ea2.C20557b.m22327a(r3)
                vh.a$b r3 = r3.f260749b
                boolean r3 = r3.f260756a
                if (r3 != 0) goto L_0x02af
                boolean r0 = nb0.C88913c.m111011i(r0)
                goto L_0x02b0
            L_0x02af:
                r0 = 1
            L_0x02b0:
                if (r0 == 0) goto L_0x02b9
                java.lang.String r0 = "stop audio ok"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
                goto L_0x02cd
            L_0x02b9:
                r3 = 1
                r1.f240730t = r3
                java.lang.String r0 = "stop audio fail"
                r1.f240731u = r0
                goto L_0x02cd
            L_0x02c2:
                r3 = 1
                java.lang.String r0 = "operationType is invalid"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
                r1.f240730t = r3
                r1.f240731u = r0
            L_0x02cd:
                boolean r0 = r1.f240730t
                if (r0 == 0) goto L_0x02d6
                java.lang.String r0 = r1.f240731u
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            L_0x02d6:
                super.mo114502b()
                com.tencent.mm.plugin.appbrand.jsapi.f r0 = r1.f240718e
                if (r0 != 0) goto L_0x02e4
                java.lang.String r0 = "server is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
                goto L_0x0314
            L_0x02e4:
                boolean r2 = r1.f240730t
                if (r2 == 0) goto L_0x0307
                int r2 = r1.f240719f
                com.tencent.mm.plugin.appbrand.jsapi.p r3 = r1.f240717d
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "fail:"
                r4.append(r5)
                java.lang.String r5 = r1.f240731u
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                java.lang.String r3 = r3.mo115109j(r4)
                r0.mo109647a(r2, r3)
                goto L_0x0314
            L_0x0307:
                int r2 = r1.f240719f
                com.tencent.mm.plugin.appbrand.jsapi.p r3 = r1.f240717d
                java.lang.String r4 = "ok"
                java.lang.String r3 = r3.mo115109j(r4)
                r0.mo109647a(r2, r3)
            L_0x0314:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.audio.C82090l.C82091a.mo114501a():void");
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        String appId = fVar.getAppId();
        if (!(!((ConcurrentHashMap) C87574a.f253661d).containsKey(appId) ? false : ((Boolean) ((ConcurrentHashMap) C87574a.f253661d).get(appId)).booleanValue())) {
            Log.m105920e("MicroMsg.Audio.JsApiOperateAudio", "can't do operateAudio, App is paused or background");
            fVar.mo109647a(i, mo115109j("fail:App is paused or background"));
        } else if (jSONObject == null) {
            Log.m105920e("MicroMsg.Audio.JsApiOperateAudio", "operateAudio data is null");
            fVar.mo109647a(i, mo115109j("fail:data is null"));
        } else {
            Log.m105925i("MicroMsg.Audio.JsApiOperateAudio", "operateAudio appId:%s, data:%s", fVar.getAppId(), jSONObject.toString());
            String optString = jSONObject.optString("audioId");
            int optInt = jSONObject.optInt("currentTime", 0);
            String optString2 = jSONObject.optString("operationType");
            if (TextUtils.isEmpty(optString)) {
                Log.m105920e("MicroMsg.Audio.JsApiOperateAudio", "audioId is empty");
                fVar.mo109647a(i, mo115109j("fail:audioId is empty"));
            } else if (TextUtils.isEmpty(optString2)) {
                Log.m105920e("MicroMsg.Audio.JsApiOperateAudio", "operationType is empty");
                fVar.mo109647a(i, mo115109j("fail:operationType is empty"));
            } else {
                if (this.f240716g == null) {
                    this.f240716g = new JsApiSetAudioState.AudioPlayerEventListenerTask(fVar);
                }
                this.f240716g.f240598e = fVar.getAppId();
                this.f240716g.mo114528c();
                C82091a aVar = new C82091a(this, fVar, i);
                aVar.f240720g = fVar.getAppId();
                aVar.f240721h = optString;
                aVar.f240723j = optInt;
                aVar.f240722i = optString2;
                if (optString2.equalsIgnoreCase(AssetExtension.SCENE_PLAY)) {
                    long j = 0;
                    long optLong = jSONObject.optLong(AppMeasurement.Param.TIMESTAMP, 0);
                    long currentTimeMillis = System.currentTimeMillis();
                    if (optLong > 0 && optLong < currentTimeMillis) {
                        j = currentTimeMillis - optLong;
                    }
                    aVar.f240728r = j;
                    aVar.f240729s = currentTimeMillis;
                }
                C87575b bVar = (C87575b) ((ConcurrentHashMap) C87574a.f253658a).get(optString);
                if (bVar != null) {
                    aVar.f240724n = bVar.f253663b;
                    aVar.f240725o = bVar.f253662a;
                    aVar.f240727q = bVar.f253664c;
                }
                aVar.f240726p = MMApplicationContext.getProcessName();
                aVar.mo114528c();
            }
        }
    }
}
