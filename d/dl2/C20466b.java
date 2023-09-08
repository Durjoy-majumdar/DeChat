package dl2;

import android.os.Bundle;
import com.tencent.p014mm.plugin.scanner.model.C19027m0;
import com.tencent.p014mm.sdk.platformtools.Log;
import dl2.C20461a;
import wl2.C102461j;

/* renamed from: dl2.b */
public class C20466b implements C19027m0 {

    /* renamed from: d */
    public final /* synthetic */ String f57519d;

    /* renamed from: e */
    public final /* synthetic */ int f57520e;

    /* renamed from: f */
    public final /* synthetic */ int f57521f;

    /* renamed from: g */
    public final /* synthetic */ C20461a.C20465d f57522g;

    /* renamed from: h */
    public final /* synthetic */ long f57523h;

    public C20466b(C20461a aVar, String str, int i, int i2, C20461a.C20465d dVar, long j) {
        this.f57519d = str;
        this.f57520e = i;
        this.f57521f = i2;
        this.f57522g = dVar;
        this.f57523h = j;
    }

    public void run() {
        try {
            byte[] b = C102461j.m135248b(this.f57519d, this.f57520e, -1, (C102461j.C102462a) null);
            if (b != null && b.length <= 122880) {
                Log.m105925i("MicroMsg.AiScanImageDecodeQueueNew", "alvinluo compressImage success final data length: %d", Integer.valueOf(b.length));
                Bundle bundle = new Bundle();
                bundle.putInt("scan_source", this.f57521f);
                bundle.putInt("key_scan_goods_mode", 1);
                bundle.putBoolean("result_is_best_img", true);
                bundle.putByteArray("result_best_img", b);
                C20461a.C20465d dVar = this.f57522g;
                if (dVar != null) {
                    dVar.mo24353a(this.f57523h, bundle);
                    return;
                }
                return;
            }
            Log.m105920e("MicroMsg.AiScanImageDecodeQueueNew", "alvinluo compressImage failed");
            C20461a.C20465d dVar2 = this.f57522g;
            if (dVar2 != null) {
                dVar2.mo24355b(this.f57523h, this.f57521f, 1, "");
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.AiScanImageDecodeQueueNew", e, "alvinluo decodeFile exception", new Object[0]);
        }
    }
}
