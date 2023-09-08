package com.tencent.p014mm.plugin.appbrand.launching.precondition;

import android.os.Looper;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.precondition.n$$b */
public final class n$$b extends MTimerHandler {

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.precondition.n$$b$a */
    public class C83427a implements MTimerHandler.CallBack {

        /* renamed from: d */
        public final /* synthetic */ String f243799d;

        public C83427a(String str) {
            this.f243799d = str;
        }

        public boolean onTimerExpired() {
            C83426n j = C83426n.m102381j(this.f243799d);
            if (j == null) {
                return false;
            }
            j.mo115708d();
            return false;
        }
    }

    public n$$b(String str) {
        super(Looper.getMainLooper(), (MTimerHandler.CallBack) new C83427a(str), false);
    }
}
