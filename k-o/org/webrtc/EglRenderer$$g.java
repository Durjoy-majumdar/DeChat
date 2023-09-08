package org.webrtc;

public final /* synthetic */ class EglRenderer$$g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ EglRenderer f61821d;

    /* renamed from: e */
    public final /* synthetic */ float f61822e;

    /* renamed from: f */
    public final /* synthetic */ float f61823f;

    /* renamed from: g */
    public final /* synthetic */ float f61824g;

    /* renamed from: h */
    public final /* synthetic */ float f61825h;

    public /* synthetic */ EglRenderer$$g(EglRenderer eglRenderer, float f, float f2, float f3, float f4) {
        this.f61821d = eglRenderer;
        this.f61822e = f;
        this.f61823f = f2;
        this.f61824g = f3;
        this.f61825h = f4;
    }

    public final void run() {
        this.f61821d.lambda$clearImage$6(this.f61822e, this.f61823f, this.f61824g, this.f61825h);
    }
}
