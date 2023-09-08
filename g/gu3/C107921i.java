package gu3;

import android.os.Handler;
import android.os.Looper;
import mu3.C109639a;

/* renamed from: gu3.i */
public class C107921i implements C87399g {

    /* renamed from: d */
    public Handler f323134d = new Handler(Looper.getMainLooper());

    public void execute(Runnable runnable) {
        if (Thread.currentThread().getId() == this.f323134d.getLooper().getThread().getId()) {
            runnable.run();
        } else {
            this.f323134d.post(runnable);
        }
    }

    /* renamed from: g */
    public void mo9401g() {
        this.f323134d.removeCallbacksAndMessages((Object) null);
    }

    public String getTag() {
        return C109639a.m148951b().f328237a;
    }
}
