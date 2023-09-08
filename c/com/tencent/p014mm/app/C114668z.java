package com.tencent.p014mm.app;

import android.os.Handler;

/* renamed from: com.tencent.mm.app.z */
public interface C114668z {

    /* renamed from: com.tencent.mm.app.z$a */
    public static abstract class C104589a implements C114668z {
        public C114668z wrapper = new C24245a();

        /* renamed from: com.tencent.mm.app.z$a$a */
        public class C24245a implements C114668z {

            /* renamed from: com.tencent.mm.app.z$a$a$a */
            public class C24246a implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ String f69410d;

                public C24246a(String str) {
                    this.f69410d = str;
                }

                public void run() {
                    C104589a.this.onAppForeground(this.f69410d);
                }
            }

            /* renamed from: com.tencent.mm.app.z$a$a$b */
            public class C24247b implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ String f69412d;

                public C24247b(String str) {
                    this.f69412d = str;
                }

                public void run() {
                    C104589a.this.onAppBackground(this.f69412d);
                }
            }

            public C24245a() {
            }

            public void onAppBackground(String str) {
                if (C104589a.this.getHandler() != null) {
                    C104589a.this.getHandler().post(new C24247b(str));
                } else {
                    C104589a.this.onAppBackground(str);
                }
            }

            public void onAppForeground(String str) {
                if (C104589a.this.getHandler() != null) {
                    C104589a.this.getHandler().post(new C24246a(str));
                } else {
                    C104589a.this.onAppForeground(str);
                }
            }
        }

        public void alive() {
            AppForegroundDelegate.INSTANCE.mo174208a(this.wrapper);
        }

        public void dead() {
            AppForegroundDelegate.INSTANCE.mo174215k(this.wrapper);
        }

        public Handler getHandler() {
            return null;
        }
    }

    void onAppBackground(String str);

    void onAppForeground(String str);
}
