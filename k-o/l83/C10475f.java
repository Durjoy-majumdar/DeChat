package l83;

import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import m83.C10769b;

/* renamed from: l83.f */
public final class C10475f {

    /* renamed from: a */
    public static final C10475f f31710a = new C10475f();

    /* renamed from: a */
    public static final void m10402a(C10475f fVar, int i, int i2, Intent intent, C10769b bVar) {
        fVar.getClass();
        if (i == 1000 && intent != null) {
            int intExtra = intent.getIntExtra("key_result_err_code", -1);
            String stringExtra = intent.getStringExtra("key_result_err_msg");
            Log.m105924i("MicroMsg.NativeDownloadAppManager", "processActivityResult resultCode: " + i2 + ", errCode: " + intExtra + ", errMsg: " + stringExtra);
            if (intExtra != 0) {
                if (intExtra != 2) {
                    if (bVar != null) {
                        Log.m105925i("MicroMsg.CleanNewUI", "onDownloadFailed errCode: %d, errMsg: %s", Integer.valueOf(intExtra), stringExtra);
                    }
                } else if (bVar != null) {
                    Log.m105924i("MicroMsg.CleanNewUI", "onDownloadCancel");
                }
            } else if (bVar != null) {
                Log.m105924i("MicroMsg.CleanNewUI", "onDownloadSuccess");
            }
        }
    }
}
