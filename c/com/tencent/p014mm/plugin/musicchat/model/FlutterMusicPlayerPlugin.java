package com.tencent.p014mm.plugin.musicchat.model;

import android.widget.Toast;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.pigeon.FlutterMusicPlayerApi;
import di3.C86312j;
import f40.C86709a0;
import gy3.C87412m;
import p172io.flutter.embedding.engine.plugins.FlutterPlugin;
import qc0.C101093a;
import qc0.C101106m;
import qc0.C101107p;
import qc0.C62602o;
import rc0.C63389c;
import te3.C64719t23;

/* renamed from: com.tencent.mm.plugin.musicchat.model.FlutterMusicPlayerPlugin */
public final class FlutterMusicPlayerPlugin extends FlutterMusicPlayerApi.MusicPlayerApi implements FlutterPlugin {

    /* renamed from: d */
    public final String f272332d = "MicroMsg.FlutterMusicPlayerPlugin";

    /* renamed from: e */
    public FlutterMusicPlayerApi.MusicCallbackApi f272333e;

    /* renamed from: f */
    public final String f272334f = "musicHistory_config";

    /* renamed from: g */
    public final String f272335g = "musicHistory";

    /* renamed from: h */
    public boolean f272336h;

    /* renamed from: i */
    public final FlutterMusicPlayerPlugin$musicPlayerListener$1 f272337i = new FlutterMusicPlayerPlugin$musicPlayerListener$1(this, C40008f.f107254d);

    /* renamed from: com.tencent.mm.plugin.musicchat.model.FlutterMusicPlayerPlugin$a */
    public static final class C94261a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f272338d;

        public C94261a(String str) {
            this.f272338d = str;
        }

        public final void run() {
            Toast.makeText(MMApplicationContext.getContext(), this.f272338d, 0).show();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x011e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Boolean canPlayMusic() {
        /*
            r11 = this;
            java.lang.Class<vz.f> r0 = p734vz.C90876f.class
            r1 = 2
            r2 = 0
            r3 = 1
            r4 = 0
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x0041 }
            java.lang.String r6 = "phone"
            java.lang.Object r5 = r5.getSystemService(r6)     // Catch:{ Exception -> 0x0041 }
            boolean r6 = r5 instanceof android.telephony.TelephonyManager     // Catch:{ Exception -> 0x0041 }
            if (r6 == 0) goto L_0x0018
            android.telephony.TelephonyManager r5 = (android.telephony.TelephonyManager) r5     // Catch:{ Exception -> 0x0041 }
            goto L_0x0019
        L_0x0018:
            r5 = r2
        L_0x0019:
            if (r5 == 0) goto L_0x003f
            int r5 = r5.getCallState()     // Catch:{ Exception -> 0x0041 }
            if (r5 == r3) goto L_0x0025
            if (r5 == r1) goto L_0x0025
            r6 = 0
            goto L_0x0026
        L_0x0025:
            r6 = 1
        L_0x0026:
            java.lang.String r7 = r11.f272332d     // Catch:{ Exception -> 0x003d }
            java.lang.String r8 = "isPhoneInUse, isPhoneInUse:%s, callState:%s"
            java.lang.Object[] r9 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x003d }
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r6)     // Catch:{ Exception -> 0x003d }
            r9[r4] = r10     // Catch:{ Exception -> 0x003d }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x003d }
            r9[r3] = r5     // Catch:{ Exception -> 0x003d }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r8, r9)     // Catch:{ Exception -> 0x003d }
            goto L_0x004f
        L_0x003d:
            r5 = move-exception
            goto L_0x0043
        L_0x003f:
            r6 = 0
            goto L_0x004f
        L_0x0041:
            r5 = move-exception
            r6 = 0
        L_0x0043:
            java.lang.String r7 = r11.f272332d
            java.lang.Object[] r8 = new java.lang.Object[r3]
            r8[r4] = r5
            java.lang.String r9 = "isPhoneInUse, exception:%s"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r5, r9, r8)
        L_0x004f:
            if (r6 == 0) goto L_0x005e
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r1 = 2131831439(0x7f112a8f, float:1.9295904E38)
            java.lang.String r0 = r0.getString(r1)
            goto L_0x0104
        L_0x005e:
            boolean r5 = p182kk.C61104a.m71645a()
            r6 = 2131831442(0x7f112a92, float:1.929591E38)
            if (r5 == 0) goto L_0x0071
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r0 = r0.getString(r6)
            goto L_0x0104
        L_0x0071:
            di3.d r5 = di3.C86312j.m106911c(r0)
            vz.f r5 = (p734vz.C90876f) r5
            boolean r5 = r5.mo124867WV()
            if (r5 != 0) goto L_0x00f9
            di3.d r5 = di3.C86312j.m106911c(r0)
            vz.f r5 = (p734vz.C90876f) r5
            boolean r5 = r5.mo124868Wj()
            if (r5 != 0) goto L_0x00f9
            boolean r5 = p182kk.C61104a.m71644D()
            if (r5 != 0) goto L_0x00f9
            boolean r5 = p182kk.C61104a.m71648d()
            if (r5 == 0) goto L_0x0096
            goto L_0x00f9
        L_0x0096:
            di3.d r0 = di3.C86312j.m106911c(r0)
            vz.f r0 = (p734vz.C90876f) r0
            boolean r0 = r0.mo124869yj()
            if (r0 != 0) goto L_0x00f0
            java.lang.Class<com.tencent.mm.plugin.appbrand.backgroundrunning.s> r0 = com.tencent.p014mm.plugin.appbrand.backgroundrunning.C81591s.class
            boolean r5 = di3.C86312j.m106916h(r0)
            if (r5 == 0) goto L_0x00d3
            di3.d r0 = di3.C86312j.m106911c(r0)
            com.tencent.mm.plugin.appbrand.backgroundrunning.s r0 = (com.tencent.p014mm.plugin.appbrand.backgroundrunning.C81591s) r0
            java.util.List r0 = r0.mo113854fA()
            java.util.Iterator r0 = r0.iterator()
        L_0x00b8:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x00d3
            java.lang.Object r5 = r0.next()
            com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningApp r5 = (com.tencent.p014mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningApp) r5
            int r5 = r5.f239209f
            r5 = r5 & r3
            int r5 = r5 << r1
            if (r5 <= 0) goto L_0x00b8
            java.lang.String r0 = r11.f272332d
            java.lang.String r1 = "isAnyAppInVOIP, already exist wxa using VOIP"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            goto L_0x00d4
        L_0x00d3:
            r3 = 0
        L_0x00d4:
            if (r3 == 0) goto L_0x00d7
            goto L_0x00f0
        L_0x00d7:
            boolean r0 = p182kk.C61104a.m71656l(r2, r4)
            if (r0 != 0) goto L_0x00e3
            boolean r0 = p182kk.C61104a.m71662r()
            if (r0 == 0) goto L_0x00ee
        L_0x00e3:
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r1 = 2131831436(0x7f112a8c, float:1.9295898E38)
            java.lang.String r2 = r0.getString(r1)
        L_0x00ee:
            r0 = r2
            goto L_0x0104
        L_0x00f0:
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r0 = r0.getString(r6)
            goto L_0x0104
        L_0x00f9:
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r1 = 2131831443(0x7f112a93, float:1.9295912E38)
            java.lang.String r0 = r0.getString(r1)
        L_0x0104:
            if (r0 == 0) goto L_0x011e
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r1 == 0) goto L_0x010f
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L_0x010f:
            zt3.t r1 = zt3.C119157j.f356862d
            com.tencent.mm.plugin.musicchat.model.FlutterMusicPlayerPlugin$a r2 = new com.tencent.mm.plugin.musicchat.model.FlutterMusicPlayerPlugin$a
            r2.<init>(r0)
            zt3.j r1 = (zt3.C119157j) r1
            r1.mo183895z(r2)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L_0x011e:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.musicchat.model.FlutterMusicPlayerPlugin.canPlayMusic():java.lang.Boolean");
    }

    public void clearHistory() {
        String i = C86709a0.m107523b().mo121111i();
        MultiProcessMMKV.getMMKV(this.f272334f + i).putString(this.f272335g, "");
    }

    public FlutterMusicPlayerApi.FlutterMusicInfo getCurrentMusic() {
        C101106m b = C101093a.m132480b();
        return (b == null || !C101093a.m132481c()) ? new FlutterMusicPlayerApi.FlutterMusicInfo() : mo129595l(b);
    }

    public FlutterMusicPlayerApi.FLMusicIntType getCurrentPosition() {
        FlutterMusicPlayerApi.FLMusicIntType fLMusicIntType = new FlutterMusicPlayerApi.FLMusicIntType();
        fLMusicIntType.setValue(Long.valueOf((long) C101093a.m132479a().f35261b));
        return fLMusicIntType;
    }

    public FlutterMusicPlayerApi.FLMusicIntType getDuration() {
        FlutterMusicPlayerApi.FLMusicIntType fLMusicIntType = new FlutterMusicPlayerApi.FLMusicIntType();
        fLMusicIntType.setValue(Long.valueOf((long) C101093a.m132479a().f35260a));
        return fLMusicIntType;
    }

    public String getHistory() {
        String i = C86709a0.m107523b().mo121111i();
        String string = MultiProcessMMKV.getMMKV(this.f272334f + i).getString(this.f272335g, "");
        return string != null ? string : "";
    }

    /* renamed from: l */
    public final FlutterMusicPlayerApi.FlutterMusicInfo mo129595l(C101106m mVar) {
        FlutterMusicPlayerApi.FlutterMusicInfo flutterMusicInfo = new FlutterMusicPlayerApi.FlutterMusicInfo();
        flutterMusicInfo.setMid(mVar.f295954P);
        flutterMusicInfo.setMusicId(mVar.f295960e);
        flutterMusicInfo.setSinger(mVar.f295963h);
        flutterMusicInfo.setAppid(mVar.f295972t);
        flutterMusicInfo.setWebUrl(mVar.f295968p);
        flutterMusicInfo.setCoverUrl(mVar.f295965j);
        flutterMusicInfo.setLyric(mVar.f295969q);
        flutterMusicInfo.setDuration(getDuration());
        return flutterMusicInfo;
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C87412m.m108594g(flutterPluginBinding, "binding");
        FlutterMusicPlayerApi.MusicPlayerApi.setup(flutterPluginBinding.getBinaryMessenger(), this);
        this.f272337i.alive();
        this.f272333e = new FlutterMusicPlayerApi.MusicCallbackApi(flutterPluginBinding.getBinaryMessenger());
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C87412m.m108594g(flutterPluginBinding, "binding");
        FlutterMusicPlayerApi.MusicPlayerApi.setup(flutterPluginBinding.getBinaryMessenger(), (FlutterMusicPlayerApi.MusicPlayerApi) null);
        this.f272337i.dead();
    }

    public void pause() {
        Log.m105924i(this.f272332d, "pause: ");
        C101093a.m132485g();
    }

    public void play(FlutterMusicPlayerApi.FlutterMusicInfo flutterMusicInfo) {
        C63389c cVar = (C63389c) C86312j.m106911c(C63389c.class);
        if (cVar.mo88296eY()) {
            cVar.mo88293H4(true);
        }
        String str = this.f272332d;
        StringBuilder sb = new StringBuilder();
        sb.append("play ");
        sb.append(flutterMusicInfo != null ? flutterMusicInfo.getMusicId() : null);
        Log.m105924i(str, sb.toString());
        if (flutterMusicInfo != null) {
            C64719t23 t232 = new C64719t23();
            t232.f185472t = flutterMusicInfo.getCoverUrl();
            t232.f185475w = flutterMusicInfo.getCoverUrl();
            t232.f185473u = flutterMusicInfo.getSongName();
            t232.f185474v = flutterMusicInfo.getLyric();
            t232.f185470r = flutterMusicInfo.getMid();
            t232.f185461f = flutterMusicInfo.getCoverUrl();
            C101106m b = C101107p.m132494b(15, flutterMusicInfo.getCoverUrl(), flutterMusicInfo.getSongName(), flutterMusicInfo.getSinger(), flutterMusicInfo.getWebUrl(), "", flutterMusicInfo.getDataUrl(), flutterMusicInfo.getMusicId(), C86709a0.m107535s().f251806d, "", "", flutterMusicInfo.getAppid(), C62602o.m73561a(flutterMusicInfo.getMusicId(), t232));
            b.f295953N = this.f272336h;
            C101093a.m132488j(b);
        }
    }

    public void resume() {
        Log.m105924i(this.f272332d, "resume: ");
        C101093a.m132486h();
    }

    public void seek(FlutterMusicPlayerApi.FLMusicIntType fLMusicIntType) {
        if (fLMusicIntType != null) {
            C101093a.m132487i((int) fLMusicIntType.getValue().longValue());
        }
    }

    public void stop() {
        Log.m105924i(this.f272332d, "stop: ");
        C101093a.m132490l();
    }
}
