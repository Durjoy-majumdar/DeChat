package com.tencent.p014mm.plugin.mmsight.p077ui;

import android.content.DialogInterface;
import android.graphics.Bitmap;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.vfs.C86013q1;
import nj3.C76879j;
import p248ug.C111161j0;
import p248ug.C111168v;

/* renamed from: com.tencent.mm.plugin.mmsight.ui.o */
public class C105549o implements C111168v {

    /* renamed from: d */
    public final /* synthetic */ C105562q f313958d;

    /* renamed from: com.tencent.mm.plugin.mmsight.ui.o$a */
    public class C105550a implements C111161j0 {

        /* renamed from: com.tencent.mm.plugin.mmsight.ui.o$a$a */
        public class C105551a implements Runnable {
            public C105551a() {
            }

            public void run() {
                C105562q qVar = C105549o.this.f313958d;
                MMActivity mMActivity = qVar.f313991j;
                qVar.f313996o = C76879j.m92723Q(mMActivity, (String) null, mMActivity.getString(C0966R.string.gtb), true, false, (DialogInterface.OnCancelListener) null);
                C105549o.this.f313958d.f313989h.pause();
                C105562q.m141755b(C105549o.this.f313958d, (Bitmap) null);
            }
        }

        /* renamed from: com.tencent.mm.plugin.mmsight.ui.o$a$b */
        public class C105552b implements Runnable {
            public C105552b() {
            }

            public void run() {
                C105549o.this.f313958d.f313997p.mo150278b();
            }
        }

        /* renamed from: com.tencent.mm.plugin.mmsight.ui.o$a$c */
        public class C105553c implements Runnable {
            public C105553c() {
            }

            public void run() {
                C105562q qVar = C105549o.this.f313958d;
                MMActivity mMActivity = qVar.f313991j;
                qVar.f313996o = C76879j.m92723Q(mMActivity, (String) null, mMActivity.getString(C0966R.string.gtb), true, false, (DialogInterface.OnCancelListener) null);
                C105549o.this.f313958d.f313989h.pause();
                C105562q.m141755b(C105549o.this.f313958d, (Bitmap) null);
            }
        }

        /* renamed from: com.tencent.mm.plugin.mmsight.ui.o$a$d */
        public class C105554d implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Bitmap f313963d;

            public C105554d(Bitmap bitmap) {
                this.f313963d = bitmap;
            }

            public void run() {
                C105562q qVar = C105549o.this.f313958d;
                MMActivity mMActivity = qVar.f313991j;
                qVar.f313996o = C76879j.m92723Q(mMActivity, (String) null, mMActivity.getString(C0966R.string.gtb), true, false, (DialogInterface.OnCancelListener) null);
                C105549o.this.f313958d.f313989h.pause();
                C105562q.m141755b(C105549o.this.f313958d, this.f313963d);
            }
        }

        public C105550a() {
        }

        /* renamed from: a */
        public void mo79184a(Bitmap bitmap, boolean z) {
            int i;
            Log.m105925i("MicroMsg.MMSightVideoEditor", "photoEditor onSuccess: %s isNever：%s", bitmap, Boolean.valueOf(z));
            if (z) {
                if (bitmap != null && !bitmap.isRecycled()) {
                    bitmap.recycle();
                }
                C105562q qVar = C105549o.this.f313958d;
                if (qVar.f313997p != null && !qVar.f314001t) {
                    int i2 = qVar.f313986e;
                    if (i2 <= 0 || (i = qVar.f313984c) <= 0 || i2 > i) {
                        qVar.f313979A = C86013q1.m106456q(qVar.f313987f);
                        MMHandlerThread.postToMainThread(new C105552b());
                        return;
                    }
                    MMHandlerThread.postToMainThread(new C105551a());
                } else if (qVar.f314001t) {
                    MMHandlerThread.postToMainThread(new C105553c());
                }
            } else if (bitmap != null) {
                MMHandlerThread.postToMainThread(new C105554d(bitmap));
            }
        }

        /* renamed from: b */
        public void mo79185b(Exception exc) {
            Log.m105921e("MicroMsg.MMSightVideoEditor", "photoEditor onError: %s", exc);
        }
    }

    /* renamed from: com.tencent.mm.plugin.mmsight.ui.o$b */
    public class C105555b implements Runnable {
        public C105555b() {
        }

        public void run() {
            C105549o.this.f313958d.f313997p.mo150279c();
        }
    }

    public C105549o(C105562q qVar) {
        this.f313958d = qVar;
    }

    /* renamed from: o0 */
    public void mo79182o0() {
        Log.m105924i("MicroMsg.MMSightVideoEditor", "photoEditor onExit");
        this.f313958d.mo150417e();
        if (this.f313958d.f313997p != null) {
            MMHandlerThread.postToMainThread(new C105555b());
        }
    }

    public void onFinish() {
        Log.m105924i("MicroMsg.MMSightVideoEditor", "photoEditor onFinish");
        this.f313958d.f313992k.mo162898g(new C105550a());
    }
}
