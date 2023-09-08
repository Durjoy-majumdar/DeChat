package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86009m1;
import di3.C86312j;
import fy3.C32224a;
import gy3.C8479f0;
import java.io.ByteArrayOutputStream;
import p140cw.C7138g;
import rx3.C13598b0;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.g */
public final class C5354g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Bitmap f20993d;

    /* renamed from: e */
    public final /* synthetic */ String f20994e;

    /* renamed from: f */
    public final /* synthetic */ ColorfulChatroomQRCodeUI f20995f;

    /* renamed from: g */
    public final /* synthetic */ C32224a<C13598b0> f20996g;

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.g$a */
    public static final class C5355a implements BitmapUtil.ImageWriteOSCallback {

        /* renamed from: a */
        public final /* synthetic */ C8479f0<byte[]> f20997a;

        public C5355a(C8479f0<byte[]> f0Var) {
            this.f20997a = f0Var;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
            throw r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
            cy3.C58003b.m67160a(r3, r0);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void callback(java.io.OutputStream r3) {
            /*
                r2 = this;
                java.lang.String r0 = "os"
                gy3.C87412m.m108594g(r3, r0)
                gy3.f0<byte[]> r0 = r2.f20997a
                T r0 = r0.f27484d     // Catch:{ all -> 0x0016 }
                byte[] r0 = (byte[]) r0     // Catch:{ all -> 0x0016 }
                r3.write(r0)     // Catch:{ all -> 0x0016 }
                rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0016 }
                r0 = 0
                cy3.C58003b.m67160a(r3, r0)
                return
            L_0x0016:
                r0 = move-exception
                throw r0     // Catch:{ all -> 0x0018 }
            L_0x0018:
                r1 = move-exception
                cy3.C58003b.m67160a(r3, r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.setting.p102ui.setting.C5354g.C5355a.callback(java.io.OutputStream):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.g$b */
    public static final class C5356b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C32224a<C13598b0> f20998d;

        public C5356b(C32224a<C13598b0> aVar) {
            this.f20998d = aVar;
        }

        public final void run() {
            this.f20998d.invoke();
        }
    }

    public C5354g(Bitmap bitmap, String str, ColorfulChatroomQRCodeUI colorfulChatroomQRCodeUI, C32224a<C13598b0> aVar) {
        this.f20993d = bitmap;
        this.f20994e = str;
        this.f20995f = colorfulChatroomQRCodeUI;
        this.f20996g = aVar;
    }

    public final void run() {
        C8479f0 f0Var = new C8479f0();
        if (this.f20993d != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            this.f20993d.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
            f0Var.f27484d = byteArrayOutputStream.toByteArray();
        }
        T t = f0Var.f27484d;
        if (t != null && ((byte[]) t).length > 0) {
            C86009m1 m1Var = new C86009m1(this.f20994e);
            try {
                BitmapUtil.getImageWriteOutputStream(m1Var, (BitmapUtil.ImageWriteOSCallback) new C5355a(f0Var));
                ((C119157j) C119157j.f356862d).mo183895z(new C5356b(this.f20996g));
                ((C7138g) C86312j.m106911c(C7138g.class)).mo8315Wr(m1Var.mo119971i(), this.f20995f.getContext());
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.ColorfulChatroomQRCodeUI", e, "", new Object[0]);
            }
        }
    }
}
