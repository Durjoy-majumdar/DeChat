package com.tencent.p014mm.plugin.p019aa.p020ui;

import android.content.DialogInterface;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;

/* renamed from: com.tencent.mm.plugin.aa.ui.p1 */
public class C68320p1 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ PaylistAAUI f196345d;

    /* renamed from: com.tencent.mm.plugin.aa.ui.p1$a */
    public class C68321a implements Runnable {
        public C68321a() {
        }

        public void run() {
            C68320p1.this.f196345d.hideVKB();
        }
    }

    public C68320p1(PaylistAAUI paylistAAUI) {
        this.f196345d = paylistAAUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        MMHandlerThread.postToMainThreadDelayed(new C68321a(), 500);
    }
}
