package com.tencent.p014mm.p136ui.chatting.viewitems;

import ck3.C67391b;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import ic0.C108455d;
import java.lang.ref.WeakReference;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.n7 */
public class C19779n7 implements C108455d {

    /* renamed from: a */
    public final /* synthetic */ WeakReference f56243a;

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.n7$a */
    public class C19780a implements Runnable {
        public C19780a() {
        }

        public void run() {
            if (C19779n7.this.f56243a.get() != null && ((C67391b) C19779n7.this.f56243a.get()).mo91565f() != null && !((C67391b) C19779n7.this.f56243a.get()).mo91565f().isFinishing()) {
                ((C67391b) C19779n7.this.f56243a.get()).mo91540A();
            }
        }
    }

    public C19779n7(WeakReference weakReference) {
        this.f56243a = weakReference;
    }

    /* renamed from: a */
    public void mo26263a(boolean z, Object... objArr) {
        if (z) {
            MMHandlerThread.postToMainThread(new C19780a());
        }
    }
}
