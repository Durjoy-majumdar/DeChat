package vl2;

import android.os.Bundle;
import com.tencent.p014mm.autogen.events.PayAuthNativeEvent;

public class j$$s implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C102212j f300980a;

    /* renamed from: d */
    public final /* synthetic */ PayAuthNativeEvent f300981d;

    public j$$s(C102212j jVar, PayAuthNativeEvent payAuthNativeEvent) {
        this.f300980a = jVar;
        this.f300981d = payAuthNativeEvent;
    }

    public void run() {
        C102212j jVar = this.f300980a;
        if (jVar.f300947t != null) {
            PayAuthNativeEvent.C67753b bVar = this.f300981d.f193808e;
            if (bVar == null || bVar.f193820a != 1) {
                jVar.mo141750n(false, (Bundle) null);
            }
        }
    }
}
