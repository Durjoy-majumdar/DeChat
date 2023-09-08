package vk2;

import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import e00.C45520t;
import gy3.C87412m;
import te3.C52267zi;

/* renamed from: vk2.t */
public final class C52954t implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C52958x f147797d;

    public C52954t(C52958x xVar) {
        this.f147797d = xVar;
    }

    public final void run() {
        Object[] objArr = new Object[1];
        C52267zi ziVar = this.f147797d.f147807f;
        if (ziVar != null) {
            objArr[0] = ziVar.f145968f;
            Log.m105925i("MicroMsg.ScanBoxDialog", "alvinluo startLoadUrl %s", objArr);
            C45520t tVar = this.f147797d.f147809h;
            if (tVar != null) {
                Intent intent = new Intent();
                C52267zi ziVar2 = this.f147797d.f147807f;
                if (ziVar2 != null) {
                    intent.putExtra("rawUrl", ziVar2.f145968f);
                    intent.putExtra("useJs", true);
                    tVar.mo67677I(intent);
                    return;
                }
                C87412m.m108603p("homeContext");
                throw null;
            }
            return;
        }
        C87412m.m108603p("homeContext");
        throw null;
    }
}
