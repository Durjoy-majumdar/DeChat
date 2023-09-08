package com.tencent.p014mm.plugin.webview.luggage;

import com.tencent.p014mm.plugin.webview.luggage.DownloadProgressImageView;

/* renamed from: com.tencent.mm.plugin.webview.luggage.d */
public class C19420d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ DownloadProgressImageView.GetDownloadWidgeInfoTask f54847d;

    /* renamed from: e */
    public final /* synthetic */ DownloadProgressImageView f54848e;

    public C19420d(DownloadProgressImageView downloadProgressImageView, DownloadProgressImageView.GetDownloadWidgeInfoTask getDownloadWidgeInfoTask) {
        this.f54848e = downloadProgressImageView;
        this.f54847d = getDownloadWidgeInfoTask;
    }

    public void run() {
        this.f54847d.mo114397h();
        DownloadProgressImageView downloadProgressImageView = this.f54848e;
        downloadProgressImageView.f54829h = this.f54847d.f54836f;
        DownloadProgressImageView.m20711p(downloadProgressImageView);
    }
}
