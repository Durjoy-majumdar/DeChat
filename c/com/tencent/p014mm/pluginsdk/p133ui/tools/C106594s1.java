package com.tencent.p014mm.pluginsdk.p133ui.tools;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.s1 */
public class C106594s1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SynchronizedVideoPlayTextureView f318517d;

    public C106594s1(SynchronizedVideoPlayTextureView synchronizedVideoPlayTextureView) {
        this.f318517d = synchronizedVideoPlayTextureView;
    }

    public void run() {
        synchronized (this.f318517d.f318473K) {
            C106594s1.super.stop();
        }
    }
}
