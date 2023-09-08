package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.provider.Settings;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import org.json.JSONException;
import t83.C48590l;
import we0.C53156a;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.o2 */
public final class C44128o2 implements C53156a.C38082b {

    /* renamed from: d */
    public final /* synthetic */ C44097n2 f119543d;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.o2$a */
    public /* synthetic */ class C44129a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f119544a;

        static {
            int[] iArr = new int[C53156a.C53157a.values().length];
            iArr[2] = 1;
            iArr[4] = 2;
            iArr[1] = 3;
            iArr[3] = 4;
            f119544a = iArr;
        }
    }

    public C44128o2(C44097n2 n2Var) {
        this.f119543d = n2Var;
    }

    /* renamed from: a */
    public final void mo12953a(C53156a.C53157a aVar, C53156a.C53157a aVar2) {
        int i;
        C48590l lVar;
        C44097n2 n2Var = this.f119543d;
        int i2 = aVar2 == null ? -1 : C44129a.f119544a[aVar2.ordinal()];
        if (i2 == 1) {
            i = 90;
        } else if (i2 == 2) {
            i = -90;
        } else if (i2 == 3) {
            i = 0;
        } else if (i2 == 4) {
            i = 180;
        } else {
            return;
        }
        n2Var.f119458b = i;
        C44097n2 n2Var2 = this.f119543d;
        int i3 = n2Var2.f119458b;
        if (i3 != n2Var2.f119459c) {
            n2Var2.f119459c = i3;
            Log.m105924i("MicroMsg.WebViewVideoFullScreenHelper", "onOrientationsChange currentOrientation=" + this.f119543d.f119458b);
            try {
                WebViewUI b = this.f119543d.mo68388b();
                if (b != null && (lVar = b.f118508Z) != null) {
                    C44097n2 n2Var3 = this.f119543d;
                    int i4 = n2Var3.f119458b;
                    n2Var3.getClass();
                    int i5 = Settings.System.getInt(MMApplicationContext.getContext().getContentResolver(), "accelerometer_rotation", 0);
                    Log.m105924i("MicroMsg.WebViewVideoFullScreenHelper", "accRotation=" + i5);
                    lVar.mo73226W(i4, i5 == 0 ? 1 : 0);
                }
            } catch (JSONException e) {
                Log.m105921e("MicroMsg.WebViewVideoFullScreenHelper", "onOrientationsChange fail", e);
            }
        }
    }
}
