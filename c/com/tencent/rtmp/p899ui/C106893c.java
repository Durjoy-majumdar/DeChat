package com.tencent.rtmp.p899ui;

/* renamed from: com.tencent.rtmp.ui.c */
final /* synthetic */ class C106893c implements Runnable {

    /* renamed from: a */
    private final TXCloudVideoView f320101a;

    private C106893c(TXCloudVideoView tXCloudVideoView) {
        this.f320101a = tXCloudVideoView;
    }

    /* renamed from: a */
    public static Runnable m144633a(TXCloudVideoView tXCloudVideoView) {
        return new C106893c(tXCloudVideoView);
    }

    public final void run() {
        this.f320101a.hideIndicatorView();
    }
}
