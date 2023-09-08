package com.tencent.p014mm.p136ui.chatting.gallery;

import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import hd0.C98429r0;

/* renamed from: com.tencent.mm.ui.chatting.gallery.s1 */
public class C97125s1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C97132t1 f284968d;

    public C97125s1(C97132t1 t1Var) {
        this.f284968d = t1Var;
    }

    public void run() {
        C97132t1 t1Var = this.f284968d;
        if (t1Var.f284998d != null) {
            if (this.f284968d.mo136034d(C98429r0.m127811b(t1Var.f285003i, t1Var.f284999e))) {
                C97132t1 t1Var2 = this.f284968d;
                if (t1Var2.f285009o == 0 && t1Var2.f285012r == 0) {
                    t1Var2.mo136036f();
                }
                C97132t1 t1Var3 = this.f284968d;
                ImageGalleryVideoHandler imageGalleryVideoHandler = t1Var3.f284998d;
                String str = t1Var3.f284999e;
                imageGalleryVideoHandler.getClass();
                MMHandlerThread.postToMainThread(new C97116p0(imageGalleryVideoHandler, str, true));
                this.f284968d.f285015u = true;
            }
        }
    }
}
