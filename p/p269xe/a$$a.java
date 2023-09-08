package p269xe;

import com.tencent.matrix.batterycanary.monitor.feature.C80373t0;
import p981ie.C87705i;

/* renamed from: xe.a$$a */
public final /* synthetic */ class a$$a implements C87705i {

    /* renamed from: a */
    public final /* synthetic */ String f261427a;

    public /* synthetic */ a$$a(String str) {
        this.f261427a = str;
    }

    public final void accept(Object obj) {
        String str = this.f261427a;
        C80373t0 t0Var = (C80373t0) obj;
        str.getClass();
        if (str.equals("startScan")) {
            t0Var.f235258b.f235261a++;
        } else if (str.equals("getScanResults")) {
            t0Var.f235258b.f235262b++;
        }
    }
}
