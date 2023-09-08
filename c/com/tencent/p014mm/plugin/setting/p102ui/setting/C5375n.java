package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import fy3.C32224a;
import gy3.C8479f0;
import java.io.ByteArrayOutputStream;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.n */
public final class C5375n implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Bitmap f21018d;

    /* renamed from: e */
    public final /* synthetic */ String f21019e;

    /* renamed from: f */
    public final /* synthetic */ ColorfulSelfQRCodeUI f21020f;

    /* renamed from: g */
    public final /* synthetic */ C32224a<C13598b0> f21021g;

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.n$a */
    public static final class C5376a implements BitmapUtil.ImageWriteOSCallback {

        /* renamed from: a */
        public final /* synthetic */ C8479f0<byte[]> f21022a;

        /* renamed from: b */
        public final /* synthetic */ String f21023b;

        /* renamed from: c */
        public final /* synthetic */ ColorfulSelfQRCodeUI f21024c;

        /* renamed from: d */
        public final /* synthetic */ C32224a<C13598b0> f21025d;

        /* renamed from: com.tencent.mm.plugin.setting.ui.setting.n$a$a */
        public static final class C5377a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C32224a<C13598b0> f21026d;

            public C5377a(C32224a<C13598b0> aVar) {
                this.f21026d = aVar;
            }

            public final void run() {
                this.f21026d.invoke();
            }
        }

        public C5376a(C8479f0<byte[]> f0Var, String str, ColorfulSelfQRCodeUI colorfulSelfQRCodeUI, C32224a<C13598b0> aVar) {
            this.f21022a = f0Var;
            this.f21023b = str;
            this.f21024c = colorfulSelfQRCodeUI;
            this.f21025d = aVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0039, code lost:
            throw r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0035, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0036, code lost:
            cy3.C58003b.m67160a(r7, r0);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void callback(java.io.OutputStream r7) {
            /*
                r6 = this;
                if (r7 == 0) goto L_0x003a
                gy3.f0<byte[]> r0 = r6.f21022a
                java.lang.String r1 = r6.f21023b
                com.tencent.mm.plugin.setting.ui.setting.ColorfulSelfQRCodeUI r2 = r6.f21024c
                fy3.a<rx3.b0> r3 = r6.f21025d
                r4 = 0
                T r0 = r0.f27484d     // Catch:{ all -> 0x0033 }
                byte[] r0 = (byte[]) r0     // Catch:{ all -> 0x0033 }
                r7.write(r0)     // Catch:{ all -> 0x0033 }
                zt3.t r0 = zt3.C119157j.f356862d     // Catch:{ all -> 0x0033 }
                com.tencent.mm.plugin.setting.ui.setting.n$a$a r5 = new com.tencent.mm.plugin.setting.ui.setting.n$a$a     // Catch:{ all -> 0x0033 }
                r5.<init>(r3)     // Catch:{ all -> 0x0033 }
                zt3.j r0 = (zt3.C119157j) r0     // Catch:{ all -> 0x0033 }
                r0.mo183895z(r5)     // Catch:{ all -> 0x0033 }
                java.lang.Class<cw.g> r0 = p140cw.C7138g.class
                di3.d r0 = di3.C86312j.m106911c(r0)     // Catch:{ all -> 0x0033 }
                cw.g r0 = (p140cw.C7138g) r0     // Catch:{ all -> 0x0033 }
                androidx.appcompat.app.AppCompatActivity r2 = r2.getContext()     // Catch:{ all -> 0x0033 }
                r0.mo8315Wr(r1, r2)     // Catch:{ all -> 0x0033 }
                rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0033 }
                cy3.C58003b.m67160a(r7, r4)
                goto L_0x003a
            L_0x0033:
                r0 = move-exception
                throw r0     // Catch:{ all -> 0x0035 }
            L_0x0035:
                r1 = move-exception
                cy3.C58003b.m67160a(r7, r0)
                throw r1
            L_0x003a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.setting.p102ui.setting.C5375n.C5376a.callback(java.io.OutputStream):void");
        }
    }

    public C5375n(Bitmap bitmap, String str, ColorfulSelfQRCodeUI colorfulSelfQRCodeUI, C32224a<C13598b0> aVar) {
        this.f21018d = bitmap;
        this.f21019e = str;
        this.f21020f = colorfulSelfQRCodeUI;
        this.f21021g = aVar;
    }

    public final void run() {
        C8479f0 f0Var = new C8479f0();
        if (this.f21018d != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            this.f21018d.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
            f0Var.f27484d = byteArrayOutputStream.toByteArray();
        }
        T t = f0Var.f27484d;
        if (t != null && ((byte[]) t).length > 0) {
            String str = this.f21019e;
            BitmapUtil.getImageWriteOutputStream(str, (BitmapUtil.ImageWriteOSCallback) new C5376a(f0Var, str, this.f21020f, this.f21021g));
        }
    }
}
