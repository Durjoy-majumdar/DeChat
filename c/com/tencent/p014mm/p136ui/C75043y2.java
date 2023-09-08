package com.tencent.p014mm.p136ui;

import android.os.Looper;

/* renamed from: com.tencent.mm.ui.y2 */
public class C75043y2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ NewChattingTabUI f220797d;

    public C75043y2(NewChattingTabUI newChattingTabUI) {
        this.f220797d = newChattingTabUI;
    }

    public void run() {
        Looper.myQueue().addIdleHandler(this.f220797d.f214579f);
    }
}
