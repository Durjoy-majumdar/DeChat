package com.tencent.p014mm.plugin.shake.p103ui;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;

/* renamed from: com.tencent.mm.plugin.shake.ui.c */
public class C19235c {

    /* renamed from: a */
    public View f54198a;

    /* renamed from: b */
    public MTimerHandler f54199b = new MTimerHandler(new C19236a(), false);

    /* renamed from: com.tencent.mm.plugin.shake.ui.c$a */
    public class C19236a implements MTimerHandler.CallBack {
        public C19236a() {
        }

        public boolean onTimerExpired() {
            View view = C19235c.this.f54198a;
            if (view != null) {
                view.setKeepScreenOn(false);
            }
            return false;
        }
    }

    public C19235c(View view) {
        this.f54198a = view;
    }
}
