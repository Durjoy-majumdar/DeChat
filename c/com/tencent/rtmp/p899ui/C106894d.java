package com.tencent.rtmp.p899ui;

/* renamed from: com.tencent.rtmp.ui.d */
final /* synthetic */ class C106894d implements Runnable {

    /* renamed from: a */
    private final TXCloudVideoView f320102a;

    /* renamed from: b */
    private final int f320103b;

    /* renamed from: c */
    private final int f320104c;

    /* renamed from: d */
    private final int f320105d;

    /* renamed from: e */
    private final int f320106e;

    private C106894d(TXCloudVideoView tXCloudVideoView, int i, int i2, int i3, int i4) {
        this.f320102a = tXCloudVideoView;
        this.f320103b = i;
        this.f320104c = i2;
        this.f320105d = i3;
        this.f320106e = i4;
    }

    /* renamed from: a */
    public static Runnable m144634a(TXCloudVideoView tXCloudVideoView, int i, int i2, int i3, int i4) {
        return new C106894d(tXCloudVideoView, i, i2, i3, i4);
    }

    public final void run() {
        this.f320102a.showFocusViewInternal(this.f320103b, this.f320104c, this.f320105d, this.f320106e);
    }
}
