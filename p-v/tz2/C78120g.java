package tz2;

import android.os.Looper;
import android.os.Message;
import az2.C39674e;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C31543z5;
import f40.C86718e;
import gy3.C87412m;
import uz2.C78317u1;
import zt3.C119157j;

/* renamed from: tz2.g */
public final class C78120g {

    /* renamed from: a */
    public static final C78120g f228929a = new C78120g();

    /* renamed from: b */
    public static final MMHandler f228930b = new C78121a(Looper.getMainLooper());

    /* renamed from: tz2.g$a */
    public static final class C78121a extends MMHandler {
        public C78121a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            C87412m.m108594g(message, "msg");
            Log.m105924i("MicroMsg.TextStatus.UploadManager", "retryHandler");
            C78317u1 a = C78120g.f228929a.mo108101a();
            if (a == null) {
                return;
            }
            if (!Util.isNullOrNil(a.f229457p)) {
                Log.m105928w("MicroMsg.TextStatus.UploadManager", "business fial " + a.f229457p);
                return;
            }
            if (a.f229456o) {
                if (a.f229454j > 3) {
                    C39674e.f106452d.mo62252j1(Long.valueOf(a.f229455n), 5);
                    return;
                }
            } else if (a.f229453i > 5) {
                C39674e.f106452d.mo62252j1(Long.valueOf(a.f229455n), 5);
                return;
            }
            if (((long) (C31543z5.m39455e() - a.f229448d.f147245q)) > 1800) {
                Log.m105928w("MicroMsg.TextStatus.UploadManager", "exceed 30min to fial");
                C39674e.f106452d.mo62252j1(Long.valueOf(a.f229455n), 5);
                return;
            }
            ((C119157j) C119157j.f356862d).mo183876g(new C78122h(a), "MicroMsg.TextStatus.UploadPackHelper");
        }
    }

    /* renamed from: a */
    public C78317u1 mo108101a() {
        MultiProcessMMKV b = mo108102b();
        byte[] decodeBytes = b != null ? b.decodeBytes("upload_cache") : null;
        if (decodeBytes == null) {
            return null;
        }
        C78317u1 u1Var = new C78317u1();
        u1Var.parseFrom(decodeBytes);
        return u1Var;
    }

    /* renamed from: b */
    public final MultiProcessMMKV mo108102b() {
        return MultiProcessMMKV.getMMKV("text_status_upload" + C86718e.m107549h());
    }

    /* renamed from: c */
    public void mo108103c(C78317u1 u1Var) {
        C87412m.m108594g(u1Var, "postInfo");
        MultiProcessMMKV b = mo108102b();
        Boolean valueOf = b != null ? Boolean.valueOf(b.encode("upload_cache", u1Var.toByteArray())) : null;
        Log.m105924i("MicroMsg.TextStatus.UploadManager", "saveUploadTask result:" + valueOf + " rowId:" + u1Var.f229455n + " cdnSuccess:" + u1Var.f229456o + " cdnRetryNum:" + u1Var.f229453i + " cgiRetryNum:" + u1Var.f229454j);
    }
}
