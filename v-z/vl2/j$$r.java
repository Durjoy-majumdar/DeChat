package vl2;

import android.content.Context;
import com.tencent.p014mm.autogen.events.PayAuthNativeEvent;

public class j$$r implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ PayAuthNativeEvent f300977d;

    /* renamed from: e */
    public final /* synthetic */ C102212j f300978e;

    /* renamed from: f */
    public final /* synthetic */ Context f300979f;

    public j$$r(C102212j jVar, Context context, PayAuthNativeEvent payAuthNativeEvent) {
        this.f300978e = jVar;
        this.f300979f = context;
        this.f300977d = payAuthNativeEvent;
    }

    public void run() {
        PayAuthNativeEvent.C67753b bVar;
        if (this.f300979f != null && (bVar = this.f300977d.f193808e) != null) {
            int i = bVar.f193820a;
            if (i == 1) {
                this.f300978e.mo141756s(true);
            } else if (i == 2) {
                this.f300978e.mo141756s(false);
            }
        }
    }
}
