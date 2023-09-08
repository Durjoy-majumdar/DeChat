package com.tencent.p014mm.plugin.webview.luggage;

import android.os.Bundle;
import com.tencent.p014mm.plugin.webview.luggage.DownloadProgressImageView;
import p237sp.C36768q;

/* renamed from: com.tencent.mm.plugin.webview.luggage.c */
public class C19418c implements C36768q.C36770b {

    /* renamed from: a */
    public final /* synthetic */ DownloadProgressImageView f54845a;

    /* renamed from: com.tencent.mm.plugin.webview.luggage.c$a */
    public class C19419a implements Runnable {
        public C19419a() {
        }

        public void run() {
            DownloadProgressImageView.m20711p(C19418c.this.f54845a);
        }
    }

    public C19418c(DownloadProgressImageView downloadProgressImageView) {
        this.f54845a = downloadProgressImageView;
    }

    /* renamed from: a */
    public void mo25139a(Bundle bundle) {
        if (bundle.getBoolean("downloadInWidget")) {
            int i = bundle.getInt("event");
            int i2 = bundle.getInt("state");
            String string = bundle.getString("appId");
            int i3 = bundle.getInt("progress");
            DownloadProgressImageView.DownloadTaskInfo downloadTaskInfo = new DownloadProgressImageView.DownloadTaskInfo();
            downloadTaskInfo.f54833d = string;
            downloadTaskInfo.f54834e = i2;
            downloadTaskInfo.f54835f = i3;
            if (i == 1 || i == 7) {
                if (!this.f54845a.f54829h.contains(downloadTaskInfo)) {
                    this.f54845a.f54829h.add(0, downloadTaskInfo);
                } else {
                    DownloadProgressImageView.DownloadTaskInfo downloadTaskInfo2 = this.f54845a.f54829h.get(this.f54845a.f54829h.indexOf(downloadTaskInfo));
                    downloadTaskInfo2.f54834e = i2;
                    downloadTaskInfo2.f54835f = i3;
                }
            } else if (i == 4 || i == 9) {
                this.f54845a.f54829h.remove(downloadTaskInfo);
            } else {
                int indexOf = this.f54845a.f54829h.indexOf(downloadTaskInfo);
                if (indexOf != -1) {
                    DownloadProgressImageView.DownloadTaskInfo downloadTaskInfo3 = this.f54845a.f54829h.get(indexOf);
                    downloadTaskInfo3.f54834e = i2;
                    downloadTaskInfo3.f54835f = i3;
                }
            }
            this.f54845a.post(new C19419a());
        }
    }
}
