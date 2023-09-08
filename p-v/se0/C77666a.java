package se0;

import android.app.Activity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.openim.model.IOpenIMKefuConfirmController;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMActivityController;
import gy3.C87412m;
import he0.C46027q;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: se0.a */
public final class C77666a extends C77668b {

    /* renamed from: se0.a$a */
    public static final class C77667a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C77666a f226422d;

        public C77667a(C77666a aVar) {
            this.f226422d = aVar;
        }

        public final void run() {
            C77666a.m93639h(this.f226422d);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C77666a(Activity activity) {
        super(activity);
        C87412m.m108594g(activity, "context");
    }

    /* renamed from: h */
    public static final void m93639h(C77666a aVar) {
        aVar.mo107830g(0, "");
    }

    /* renamed from: a */
    public void mo35492a() {
        super.mo35492a();
    }

    /* renamed from: b */
    public void mo35493b(int i, int i2, C46027q qVar) {
        C87412m.m108594g(qVar, "confirmData");
        super.mo35493b(i, i2, qVar);
        IOpenIMKefuConfirmController iOpenIMKefuConfirmController = this.f226424e;
        if (iOpenIMKefuConfirmController != null) {
            iOpenIMKefuConfirmController.mo33202b(i);
        }
    }

    /* renamed from: d */
    public void mo35495d() {
        C119179t tVar = C119157j.f356862d;
        C77667a aVar = new C77667a(this);
        C119157j jVar = (C119157j) tVar;
        jVar.getClass();
        jVar.mo183892w(aVar, 400, false);
    }

    /* renamed from: e */
    public void mo35496e(IOpenIMKefuConfirmController iOpenIMKefuConfirmController) {
        C87412m.m108594g(iOpenIMKefuConfirmController, "confirmController");
        super.mo35496e(iOpenIMKefuConfirmController);
        Activity activity = this.f226423d;
        if (activity instanceof MMActivity) {
            C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            MMActivityController controller = ((MMActivity) activity).getController();
            Activity activity2 = this.f226423d;
            C87412m.m108591d(activity2);
            controller.mo177105z0(C74933u4.m89764a(activity2.getResources().getColor(C0966R.color.al6), 0));
        }
    }
}
