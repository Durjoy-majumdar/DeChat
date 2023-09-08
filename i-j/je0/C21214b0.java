package je0;

import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.Log;
import he0.C46021h;
import se0.C22361f;
import zt3.C119157j;

/* renamed from: je0.b0 */
public final class C21214b0 implements C46021h.C46023b {

    /* renamed from: a */
    public final /* synthetic */ C21216d0 f59992a;

    public C21214b0(C21216d0 d0Var) {
        this.f59992a = d0Var;
    }

    /* renamed from: a */
    public void mo33199a(int i, Bundle bundle) {
        Log.m105925i("MicroMsg.OpenIMKefuConfirmController", "alvinluo createOpenImKfConversation success cancelled: %s", Boolean.valueOf(this.f59992a.f60006k));
        C21216d0 d0Var = this.f59992a;
        d0Var.f60007l = false;
        if (!d0Var.f60006k) {
            d0Var.mo33206f();
            ((C119157j) C119157j.f356862d).mo183895z(new C21227e0(d0Var));
        }
    }

    /* renamed from: b */
    public void mo33200b(int i, int i2, int i3, String str, Bundle bundle) {
        Log.m105920e("MicroMsg.OpenIMKefuConfirmController", "alvinluo createOpenImKfConversation failed errType: " + i2 + ", errCode: " + i3 + ", errMsg: " + str);
        C21216d0 d0Var = this.f59992a;
        d0Var.f60007l = false;
        if (!d0Var.f60006k) {
            d0Var.mo33206f();
            C21231p0.m23720b(d0Var.mo33211j(), d0Var.mo33212k(), false, 4, "start conversation failed");
            C22361f fVar = d0Var.f59997b;
            if (fVar != null) {
                fVar.mo35494c();
            }
            if (!d0Var.mo33205d()) {
                d0Var.mo33214m();
            }
        }
    }
}
