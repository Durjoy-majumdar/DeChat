package q91;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import gy3.C87412m;
import java.lang.ref.WeakReference;

/* renamed from: q91.b */
public final class C101074b implements C101078e {

    /* renamed from: a */
    public final C101077d f295890a;

    /* renamed from: b */
    public final long f295891b;

    /* renamed from: c */
    public long f295892c = 0;

    /* renamed from: d */
    public WeakReference<View> f295893d = null;

    /* renamed from: e */
    public final Handler f295894e = new C101075a(this, Looper.getMainLooper());

    /* renamed from: q91.b$a */
    public static final class C101075a extends Handler {

        /* renamed from: a */
        public final /* synthetic */ C101074b f295895a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C101075a(C101074b bVar, Looper looper) {
            super(looper);
            this.f295895a = bVar;
        }

        public void handleMessage(Message message) {
            C101074b bVar;
            C101077d dVar;
            C87412m.m108594g(message, "msg");
            super.handleMessage(message);
            if (message.what == 100 && (dVar = bVar.f295890a) != null) {
                WeakReference<View> weakReference = (bVar = this.f295895a).f295893d;
                dVar.mo102106a(weakReference != null ? weakReference.get() : null, message.arg1, message.arg2);
            }
        }
    }

    public C101074b(C101077d dVar, long j) {
        this.f295890a = dVar;
        this.f295891b = j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001e, code lost:
        if ((r0 != null ? r0.get() : null) == null) goto L_0x0020;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo139597a(android.view.View r8, int r9, int r10) {
        /*
            r7 = this;
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r7.f295892c
            long r2 = r0 - r2
            long r4 = r7.f295891b
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x0038
            r7.f295892c = r0
            java.lang.ref.WeakReference<android.view.View> r0 = r7.f295893d
            if (r0 == 0) goto L_0x0020
            if (r0 == 0) goto L_0x001d
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            goto L_0x001e
        L_0x001d:
            r0 = 0
        L_0x001e:
            if (r0 != 0) goto L_0x0027
        L_0x0020:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r8)
            r7.f295893d = r0
        L_0x0027:
            android.os.Message r8 = android.os.Message.obtain()
            r0 = 100
            r8.what = r0
            r8.arg1 = r9
            r8.arg2 = r10
            android.os.Handler r9 = r7.f295894e
            r9.sendMessage(r8)
        L_0x0038:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q91.C101074b.mo139597a(android.view.View, int, int):void");
    }

    /* renamed from: b */
    public void mo139598b(View view, int i) {
        WeakReference<View> weakReference = this.f295893d;
        if (weakReference != null) {
            if ((weakReference != null ? weakReference.get() : null) != null) {
                return;
            }
        }
        this.f295893d = new WeakReference<>(view);
    }
}
