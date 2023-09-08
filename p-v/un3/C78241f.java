package un3;

import android.content.DialogInterface;
import com.tencent.p014mm.roomsdk.model.factory.C72940a;
import gy3.C8479f0;

/* renamed from: un3.f */
public final class C78241f implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C78244i f229207d;

    /* renamed from: e */
    public final /* synthetic */ C8479f0<C72940a> f229208e;

    public C78241f(C78244i iVar, C8479f0<C72940a> f0Var) {
        this.f229207d = iVar;
        this.f229208e = f0Var;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f229207d.f229212d = false;
        ((C72940a) this.f229208e.f27484d).cancel();
    }
}
