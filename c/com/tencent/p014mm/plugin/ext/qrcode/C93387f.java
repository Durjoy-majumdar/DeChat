package com.tencent.p014mm.plugin.ext.qrcode;

import android.content.Context;
import android.os.Looper;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.autogen.events.RequestRecogQBarInYuvEvent;
import com.tencent.p014mm.plugin.ext.qrcode.C93383d;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.SyncTask;

/* renamed from: com.tencent.mm.plugin.ext.qrcode.f */
public class C93387f {

    /* renamed from: b */
    public static C93387f f269572b;

    /* renamed from: a */
    public Context f269573a = null;

    /* renamed from: com.tencent.mm.plugin.ext.qrcode.f$a */
    public class C93388a extends SyncTask<C93389b> {

        /* renamed from: a */
        public final /* synthetic */ C93383d.C93385b f269574a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C93388a(C93387f fVar, long j, C93389b bVar, boolean z, C93383d.C93385b bVar2) {
            super(j, bVar, z);
            this.f269574a = bVar2;
        }

        public Object run() {
            try {
                Log.m105918d("MicroMsg.ExtQrCodeHandler", "hy: start scan qrcode");
                if (this.f269574a != null) {
                    RequestRecogQBarInYuvEvent requestRecogQBarInYuvEvent = new RequestRecogQBarInYuvEvent();
                    RequestRecogQBarInYuvEvent.C92556a aVar = requestRecogQBarInYuvEvent.f265068d;
                    C93383d.C93385b bVar = this.f269574a;
                    aVar.f265070b = bVar.f269566b;
                    aVar.f265071c = bVar.f269567c;
                    aVar.f265072d = bVar.f269569e;
                    aVar.f265073e = bVar.f269568d;
                    aVar.f265069a = bVar.f269565a;
                    aVar.f265074f = new C93386e(this);
                    requestRecogQBarInYuvEvent.publish();
                } else {
                    Log.m105928w("MicroMsg.ExtQrCodeHandler", "hy: qrcode data not retrieved");
                    setResultFinish(null);
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.ExtQrCodeHandler", e, "hy: error when syncTaskScanQrCode", new Object[0]);
                setResultFinish(null);
            }
            return null;
        }
    }

    /* renamed from: a */
    public static void m117947a(String str, int i, int i2) {
        C115669n.INSTANCE.mo160131h(14869, str, Integer.valueOf(i), Integer.valueOf(i2));
    }

    /* renamed from: b */
    public static C93387f m117948b() {
        C93387f fVar;
        C93387f fVar2 = f269572b;
        if (fVar2 != null) {
            return fVar2;
        }
        synchronized (C93387f.class) {
            if (f269572b == null) {
                f269572b = new C93387f();
            }
            fVar = f269572b;
        }
        return fVar;
    }

    /* renamed from: c */
    public static void m117949c(String str, int i, int i2) {
        C115669n.INSTANCE.mo160131h(14868, str, Integer.valueOf(i), Integer.valueOf(i2));
    }

    /* renamed from: d */
    public final C93389b mo128190d(C93383d.C93385b bVar) {
        long currentTimeMillis = System.currentTimeMillis();
        C93389b bVar2 = (C93389b) new C93388a(this, FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION, new C93389b(true), true, bVar).exec(new MMHandler(Looper.getMainLooper()));
        Object[] objArr = new Object[2];
        objArr[0] = bVar2 != null ? bVar2.toString() : "null";
        objArr[1] = Long.valueOf(System.currentTimeMillis() - currentTimeMillis);
        Log.m105925i("MicroMsg.ExtQrCodeHandler", "hy: resolved qrcode: %s, using: %d ms", objArr);
        return bVar2;
    }

    /* renamed from: com.tencent.mm.plugin.ext.qrcode.f$b */
    public static class C93389b {

        /* renamed from: a */
        public int f269575a;

        /* renamed from: b */
        public String f269576b;

        /* renamed from: c */
        public int f269577c;

        /* renamed from: d */
        public boolean f269578d;

        public C93389b(int i, String str, int i2) {
            this.f269575a = i;
            this.f269576b = str;
            this.f269578d = false;
            this.f269577c = i2;
        }

        public String toString() {
            return "QrCodeModel{type=" + this.f269575a + ", url='" + this.f269576b + '\'' + ", flagTimeout=" + this.f269578d + '}';
        }

        public C93389b(boolean z) {
            this.f269578d = z;
        }
    }
}
