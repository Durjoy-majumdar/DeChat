package com.tencent.p014mm.p136ui.chatting.gallery;

import android.graphics.Bitmap;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import ic0.C98661k;

/* renamed from: com.tencent.mm.ui.chatting.gallery.m */
public class C73704m implements C98661k {

    /* renamed from: com.tencent.mm.ui.chatting.gallery.m$a */
    public class C73705a implements Runnable {
        public C73705a(C73704m mVar) {
        }

        public void run() {
        }
    }

    public C73704m(C73706n nVar) {
    }

    /* renamed from: a */
    public void mo6935a(String str, View view, Bitmap bitmap, Object... objArr) {
        MMHandlerThread.postToMainThread(new C73705a(this));
    }
}
