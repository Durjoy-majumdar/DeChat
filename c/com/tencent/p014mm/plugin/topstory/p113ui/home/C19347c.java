package com.tencent.p014mm.plugin.topstory.p113ui.home;

import com.tencent.p014mm.plugin.topstory.p113ui.home.TopStoryHomeUIComponentImpl;
import t03.C22426h;

/* renamed from: com.tencent.mm.plugin.topstory.ui.home.c */
public class C19347c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C22426h.C22429c f54563d;

    /* renamed from: e */
    public final /* synthetic */ int f54564e;

    /* renamed from: f */
    public final /* synthetic */ String f54565f;

    public C19347c(TopStoryHomeUIComponentImpl.C19327e eVar, C22426h.C22429c cVar, int i, String str) {
        this.f54563d = cVar;
        this.f54564e = i;
        this.f54565f = str;
    }

    public void run() {
        this.f54563d.mo35581b(this.f54564e, this.f54565f);
    }
}
