package com.tencent.p014mm.plugin.appbrand.video.player.thumb;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import t62.C22438a;
import u62.C22595e;

/* renamed from: com.tencent.mm.plugin.appbrand.video.player.thumb.b */
public final class C18045b implements C22438a {

    /* renamed from: a */
    public final C22595e f49863a;

    /* renamed from: b */
    public final String f49864b;

    /* renamed from: c */
    public final String f49865c;

    /* renamed from: d */
    public long f49866d;

    /* renamed from: e */
    public long f49867e;

    /* renamed from: f */
    public boolean f49868f;

    /* renamed from: g */
    public String f49869g = "";

    /* renamed from: h */
    public int f49870h;

    public C18045b(C22595e eVar, String str, String str2) {
        C87412m.m108594g(eVar, "onePlayContext");
        C87412m.m108594g(str, "mediaId");
        C87412m.m108594g(str2, "localPath");
        this.f49863a = eVar;
        this.f49864b = str;
        this.f49865c = str2;
    }

    /* renamed from: a */
    public boolean mo22517a() {
        long j = this.f49866d;
        if (j > 0) {
            long j2 = this.f49867e;
            return j2 > 0 && j2 == j;
        }
    }

    /* renamed from: b */
    public long mo22518b() {
        return this.f49867e;
    }

    /* renamed from: c */
    public long mo22519c() {
        return this.f49866d;
    }

    /* renamed from: d */
    public void mo22520d(String str) {
        C87412m.m108594g(str, "fileFormat");
        this.f49869g = str;
        String b = this.f49863a.mo35698b("MemoryCache");
        Log.m105924i(b, "updateFileFormat:" + str);
    }

    /* renamed from: e */
    public boolean mo22521e() {
        return this.f49868f;
    }

    /* renamed from: f */
    public void mo22522f() {
        this.f49868f = true;
    }

    /* renamed from: g */
    public void mo22523g(int i) {
        String b = this.f49863a.mo35698b("MemoryCache");
        Log.m105924i(b, "updateDecoderType:" + i);
    }

    public String getFilePath() {
        return this.f49865c;
    }

    /* renamed from: h */
    public void mo22525h(int i) {
        String b = this.f49863a.mo35698b("MemoryCache");
        Log.m105924i(b, "markStateError:" + i);
    }

    /* renamed from: i */
    public void mo22526i(long j, long j2, int i) {
        this.f49866d = j2;
        this.f49867e = j;
        this.f49870h = i;
    }
}
