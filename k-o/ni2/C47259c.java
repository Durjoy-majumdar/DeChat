package ni2;

import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import e00.C45520t;
import gy3.C87412m;
import te3.C52267zi;

/* renamed from: ni2.c */
public final class C47259c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C47260d f126870d;

    public C47259c(C47260d dVar) {
        this.f126870d = dVar;
    }

    public final void run() {
        Object[] objArr = new Object[1];
        C52267zi ziVar = this.f126870d.f126871f;
        if (ziVar != null) {
            objArr[0] = ziVar.f145968f;
            Log.m105925i("MicroMsg.SelectTextDialog", "startLoadUrl %s", objArr);
            C45520t tVar = this.f126870d.f126873h;
            if (tVar != null) {
                Intent intent = new Intent();
                C52267zi ziVar2 = this.f126870d.f126871f;
                if (ziVar2 != null) {
                    intent.putExtra("rawUrl", ziVar2.f145968f);
                    intent.putExtra("useJs", true);
                    tVar.mo67677I(intent);
                    return;
                }
                C87412m.m108603p("mHomeContext");
                throw null;
            }
            return;
        }
        C87412m.m108603p("mHomeContext");
        throw null;
    }
}
