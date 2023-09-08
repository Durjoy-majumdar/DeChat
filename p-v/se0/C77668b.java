package se0;

import android.app.Activity;
import android.content.Intent;
import com.tencent.p014mm.openim.model.IOpenIMKefuConfirmController;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import he0.C46020f;
import he0.C46027q;
import he0.C76161o;
import ie0.C46220j;
import ne0.C47224a;
import rx3.C13598b0;

/* renamed from: se0.b */
public abstract class C77668b implements C22361f {

    /* renamed from: d */
    public Activity f226423d;

    /* renamed from: e */
    public IOpenIMKefuConfirmController f226424e;

    /* renamed from: f */
    public int f226425f = -1;

    /* renamed from: g */
    public C46027q f226426g;

    public C77668b(Activity activity) {
        this.f226423d = activity;
    }

    /* renamed from: a */
    public void mo35492a() {
        if (C76161o.m91464a(this.f226425f)) {
            C46027q qVar = this.f226426g;
            C46220j jVar = null;
            C46020f fVar = qVar != null ? qVar.f124111d : null;
            if (fVar instanceof C46220j) {
                jVar = (C46220j) fVar;
            }
            C46220j jVar2 = jVar;
            IOpenIMKefuConfirmController iOpenIMKefuConfirmController = this.f226424e;
            C47224a.m52532c(jVar2, 22, iOpenIMKefuConfirmController != null ? iOpenIMKefuConfirmController.getScene() : -1, 0, 8, (Object) null);
        }
    }

    /* renamed from: b */
    public void mo35493b(int i, int i2, C46027q qVar) {
        C87412m.m108594g(qVar, "confirmData");
        this.f226425f = i;
        this.f226426g = qVar;
        if (C76161o.m91464a(i)) {
            C46020f fVar = qVar.f124111d;
            C46220j jVar = fVar instanceof C46220j ? (C46220j) fVar : null;
            IOpenIMKefuConfirmController iOpenIMKefuConfirmController = this.f226424e;
            C47224a.m52532c(jVar, 21, iOpenIMKefuConfirmController != null ? iOpenIMKefuConfirmController.getScene() : -1, 0, 8, (Object) null);
        }
    }

    /* renamed from: c */
    public void mo35494c() {
        mo107830g(4, "start conversation failed");
    }

    /* renamed from: e */
    public void mo35496e(IOpenIMKefuConfirmController iOpenIMKefuConfirmController) {
        C87412m.m108594g(iOpenIMKefuConfirmController, "confirmController");
        Log.m105925i("MicroMsg.OpenIMKefuConfirmBaseUIModel", "alvinluo OpenIMKefuConfirmUIModel onCreate: %s", this);
        this.f226424e = iOpenIMKefuConfirmController;
    }

    /* renamed from: f */
    public void mo35497f() {
        mo107830g(3, "user cancel");
    }

    /* renamed from: g */
    public final void mo107830g(int i, String str) {
        Log.m105919d("MicroMsg.OpenIMKefuConfirmBaseUIModel", "alvinluo finishUI errCode: %s, errMsg: %s", Integer.valueOf(i), str);
        IOpenIMKefuConfirmController iOpenIMKefuConfirmController = this.f226424e;
        if (iOpenIMKefuConfirmController != null) {
            Intent intent = new Intent();
            intent.putExtra("key_result_err_code", i);
            intent.putExtra("key_result_err_msg", str);
            C13598b0 b0Var = C13598b0.f38549a;
            iOpenIMKefuConfirmController.mo33203c(-1, i, intent);
        }
    }

    public void release() {
        this.f226423d = null;
    }
}
