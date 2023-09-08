package com.tencent.p014mm.pluginsdk.res.downloader.checkresupdate;

import com.tencent.p014mm.autogen.events.CheckResUpdateCacheFileEvent;

/* renamed from: com.tencent.mm.pluginsdk.res.downloader.checkresupdate.c */
public class C30691c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f82586d;

    /* renamed from: e */
    public final /* synthetic */ int f82587e;

    /* renamed from: f */
    public final /* synthetic */ String f82588f;

    /* renamed from: g */
    public final /* synthetic */ int f82589g;

    /* renamed from: h */
    public final /* synthetic */ boolean f82590h;

    /* renamed from: i */
    public final /* synthetic */ String f82591i;

    public C30691c(CheckResUpdateHelper checkResUpdateHelper, int i, int i2, String str, int i3, boolean z, String str2) {
        this.f82586d = i;
        this.f82587e = i2;
        this.f82588f = str;
        this.f82589g = i3;
        this.f82590h = z;
        this.f82591i = str2;
    }

    public void run() {
        CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent = new CheckResUpdateCacheFileEvent();
        CheckResUpdateCacheFileEvent.C28720a aVar = checkResUpdateCacheFileEvent.f78743d;
        aVar.f78744a = this.f82586d;
        aVar.f78745b = this.f82587e;
        aVar.f78746c = this.f82588f;
        aVar.f78747d = this.f82589g;
        aVar.f78748e = this.f82590h;
        aVar.f78749f = this.f82591i;
        checkResUpdateCacheFileEvent.publish();
    }
}
