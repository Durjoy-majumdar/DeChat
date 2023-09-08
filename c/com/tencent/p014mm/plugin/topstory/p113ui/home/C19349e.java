package com.tencent.p014mm.plugin.topstory.p113ui.home;

import com.tencent.p014mm.plugin.topstory.p113ui.home.TopStoryHomeUIComponentImpl;

/* renamed from: com.tencent.mm.plugin.topstory.ui.home.e */
public class C19349e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f54567d;

    /* renamed from: e */
    public final /* synthetic */ long f54568e;

    /* renamed from: f */
    public final /* synthetic */ TopStoryHomeUIComponentImpl.C19327e f54569f;

    public C19349e(TopStoryHomeUIComponentImpl.C19327e eVar, String str, long j) {
        this.f54569f = eVar;
        this.f54567d = str;
        this.f54568e = j;
    }

    public void run() {
        TopStoryHomeUIComponentImpl.this.mo24895b(this.f54567d, this.f54568e);
    }
}
