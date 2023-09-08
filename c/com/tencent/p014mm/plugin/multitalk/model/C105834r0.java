package com.tencent.p014mm.plugin.multitalk.model;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import fy3.C32224a;
import gy3.C87412m;
import p80.C110194c;
import rx3.C13598b0;
import u80.C111141c;
import w80.C111742d;

/* renamed from: com.tencent.mm.plugin.multitalk.model.r0 */
public final class C105834r0 {

    /* renamed from: a */
    public C110194c f314770a;

    /* renamed from: b */
    public SurfaceTexture f314771b;

    /* renamed from: c */
    public Surface f314772c;

    /* renamed from: d */
    public HandlerThread f314773d;

    /* renamed from: e */
    public C111742d.C65942b f314774e;

    /* renamed from: f */
    public Handler f314775f;

    /* renamed from: g */
    public int f314776g = 1;

    /* renamed from: h */
    public int f314777h = 1;

    /* renamed from: i */
    public C111141c f314778i;

    /* renamed from: com.tencent.mm.plugin.multitalk.model.r0$a */
    public static final class C105835a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C32224a f314779d;

        public C105835a(C32224a aVar) {
            this.f314779d = aVar;
        }

        public final /* synthetic */ void run() {
            this.f314779d.invoke();
        }
    }

    /* renamed from: a */
    public final void mo150816a(C32224a<C13598b0> aVar) {
        C87412m.m108594g(aVar, "task");
        Handler handler = this.f314775f;
        if (handler != null) {
            handler.post(new C105835a(aVar));
        }
    }
}
