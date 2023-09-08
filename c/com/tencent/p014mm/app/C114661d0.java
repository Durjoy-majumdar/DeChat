package com.tencent.p014mm.app;

import android.os.Handler;
import p261wl.C15510f;

/* renamed from: com.tencent.mm.app.d0 */
public interface C114661d0 extends C15510f {

    /* renamed from: com.tencent.mm.app.d0$a */
    public static abstract class C28676a implements C114661d0 {
        public Handler getHandler() {
            return null;
        }
    }

    Handler getHandler();

    void onAppBackground(String str);

    void onAppForeground(String str);
}
