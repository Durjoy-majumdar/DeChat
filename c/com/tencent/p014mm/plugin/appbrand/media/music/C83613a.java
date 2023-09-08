package com.tencent.p014mm.plugin.appbrand.media.music;

import android.text.TextUtils;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import qc0.C101093a;
import qc0.C101106m;

/* renamed from: com.tencent.mm.plugin.appbrand.media.music.a */
public class C83613a {

    /* renamed from: a */
    public String f244191a;

    /* renamed from: b */
    public String f244192b;

    /* renamed from: c */
    public C101106m f244193c;

    /* renamed from: d */
    public int f244194d;

    /* renamed from: e */
    public String f244195e;

    /* renamed from: f */
    public String f244196f;

    /* renamed from: g */
    public HashMap<String, IListener> f244197g = new HashMap<>();

    /* renamed from: com.tencent.mm.plugin.appbrand.media.music.a$b */
    public static class C83615b {

        /* renamed from: a */
        public static C83613a f244198a = new C83613a((C83614a) null);
    }

    public C83613a(C83614a aVar) {
    }

    /* renamed from: a */
    public void mo115927a(IListener iListener, String str) {
        if (this.f244197g.get(str) != null) {
            Log.m105925i("MicroMsg.AppBrandMusicPlayerManager", "listeners already add appid: %s", str);
            return;
        }
        iListener.alive();
        this.f244197g.put(str, iListener);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0025, code lost:
        r3 = qc0.C101093a.m132480b();
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo115928b(java.lang.String r3, java.lang.String r4) {
        /*
            r2 = this;
            java.lang.String r0 = "play"
            boolean r4 = r4.equalsIgnoreCase(r0)
            r0 = 0
            r1 = 1
            if (r4 == 0) goto L_0x001d
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r0] = r3
            java.lang.String r3 = r2.f244191a
            r4[r1] = r3
            java.lang.String r3 = "MicroMsg.AppBrandMusicPlayerManager"
            java.lang.String r0 = "play option appid %s, pre appid %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r0, r4)
            return r1
        L_0x001d:
            java.lang.String r4 = r2.f244191a
            boolean r3 = r3.equalsIgnoreCase(r4)
            if (r3 == 0) goto L_0x0036
            qc0.m r3 = qc0.C101093a.m132480b()
            if (r3 == 0) goto L_0x0036
            java.lang.String r3 = r3.f295960e
            java.lang.String r4 = r2.f244192b
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0036
            return r1
        L_0x0036:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.media.music.C83613a.mo115928b(java.lang.String, java.lang.String):boolean");
    }

    /* renamed from: c */
    public boolean mo115929c(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.m105920e("MicroMsg.AppBrandMusicPlayerManager", "appId is empty");
            return false;
        } else if (!str.equalsIgnoreCase(this.f244191a)) {
            Log.m105920e("MicroMsg.AppBrandMusicPlayerManager", "appId is not equals pre play id");
            return false;
        } else if (TextUtils.isEmpty(this.f244192b)) {
            Log.m105920e("MicroMsg.AppBrandMusicPlayerManager", "now app not play music");
            return false;
        } else {
            C101106m b = C101093a.m132480b();
            if (b == null) {
                Log.m105920e("MicroMsg.AppBrandMusicPlayerManager", "wrapper is null");
                return false;
            } else if (!this.f244192b.equalsIgnoreCase(b.f295960e)) {
                Log.m105920e("MicroMsg.AppBrandMusicPlayerManager", "musicId is diff");
                return false;
            } else if (C101093a.m132481c()) {
                return true;
            } else {
                Log.m105924i("MicroMsg.AppBrandMusicPlayerManager", "MusicHelper.isPlayingMusic FALSE");
                return false;
            }
        }
    }

    /* renamed from: d */
    public void mo115930d(String str) {
        if (this.f244197g.get(str) == null) {
            Log.m105925i("MicroMsg.AppBrandMusicPlayerManager", "listeners already remove appid: %s", str);
            return;
        }
        this.f244197g.remove(str).dead();
        this.f244197g.remove(str);
    }
}
