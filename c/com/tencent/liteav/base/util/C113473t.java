package com.tencent.liteav.base.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: com.tencent.liteav.base.util.t */
public final class C113473t extends Handler {

    /* renamed from: a */
    private int f339537a;

    /* renamed from: b */
    private boolean f339538b = false;

    /* renamed from: c */
    private final C113474a f339539c;

    /* renamed from: com.tencent.liteav.base.util.t$a */
    public interface C113474a {
        /* renamed from: a_ */
        void mo20405a_();
    }

    public C113473t(Looper looper, C113474a aVar) {
        super(looper);
        this.f339539c = aVar;
    }

    /* renamed from: a */
    public final void mo169974a(int i, int i2) {
        mo169973a();
        this.f339537a = i2;
        this.f339538b = true;
        sendEmptyMessageDelayed(0, (long) i);
    }

    public final void handleMessage(Message message) {
        if (this.f339538b) {
            removeMessages(0);
            sendEmptyMessageDelayed(0, (long) this.f339537a);
        }
        C113474a aVar = this.f339539c;
        if (aVar != null) {
            aVar.mo20405a_();
        }
    }

    /* renamed from: a */
    public final void mo169973a() {
        while (hasMessages(0)) {
            removeMessages(0);
        }
        this.f339538b = false;
    }
}
