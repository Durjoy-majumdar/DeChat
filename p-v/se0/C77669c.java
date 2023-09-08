package se0;

import android.app.Activity;
import android.content.DialogInterface;
import android.view.KeyEvent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.openim.model.IOpenIMKefuConfirmController;
import com.tencent.p014mm.openim.p018ui.dialog.OpenIMKefuConfirmDialogView;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import ge0.C32415b;
import gy3.C87412m;
import he0.C46027q;
import qf0.C77330b;
import se0.C22361f;
import te0.C77900f;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: se0.c */
public final class C77669c extends C77668b {

    /* renamed from: h */
    public C22361f.C22363b f226427h;

    /* renamed from: i */
    public C77900f f226428i;

    /* renamed from: se0.c$a */
    public static final class C77670a implements C77330b {

        /* renamed from: a */
        public final /* synthetic */ C77669c f226429a;

        public C77670a(C77669c cVar) {
            this.f226429a = cVar;
        }

        /* renamed from: a */
        public final void mo107459a(Object obj) {
            C77669c.super.mo35494c();
        }
    }

    /* renamed from: se0.c$b */
    public static final class C77671b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C77669c f226430d;

        public C77671b(C77669c cVar) {
            this.f226430d = cVar;
        }

        public final void run() {
            C77669c.m93651i(this.f226430d);
        }
    }

    /* renamed from: se0.c$c */
    public static final class C77672c implements DialogInterface.OnDismissListener {

        /* renamed from: d */
        public final /* synthetic */ C77330b f226431d;

        public C77672c(C77330b bVar) {
            this.f226431d = bVar;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            this.f226431d.mo107459a(dialogInterface);
        }
    }

    /* renamed from: se0.c$d */
    public static final class C77673d implements C22361f.C22363b {

        /* renamed from: a */
        public final /* synthetic */ C77669c f226432a;

        /* renamed from: b */
        public final /* synthetic */ int f226433b;

        /* renamed from: se0.c$d$a */
        public static final class C77674a implements C77330b {

            /* renamed from: a */
            public final /* synthetic */ C77669c f226434a;

            public C77674a(C77669c cVar) {
                this.f226434a = cVar;
            }

            /* renamed from: a */
            public final void mo107459a(Object obj) {
                IOpenIMKefuConfirmController iOpenIMKefuConfirmController = this.f226434a.f226424e;
                if (iOpenIMKefuConfirmController != null) {
                    iOpenIMKefuConfirmController.cancel();
                }
            }
        }

        public C77673d(C77669c cVar, int i) {
            this.f226432a = cVar;
            this.f226433b = i;
        }

        /* renamed from: a */
        public void mo35499a(int i) {
            Log.m105924i("MicroMsg.OpenIMKefuConfirmDialogUIModelImpl", "alvinluo showConfirmDialog onClose exitType: " + i);
            C77669c cVar = this.f226432a;
            cVar.mo107831j(new C77674a(cVar));
            C77900f fVar = this.f226432a.f226428i;
            if (fVar != null) {
                fVar.dismiss();
            }
        }

        /* renamed from: b */
        public void mo35500b() {
            Log.m105924i("MicroMsg.OpenIMKefuConfirmDialogUIModelImpl", "alvinluo showConfirmDialog onConfirmClick");
            IOpenIMKefuConfirmController iOpenIMKefuConfirmController = this.f226432a.f226424e;
            if (iOpenIMKefuConfirmController != null) {
                iOpenIMKefuConfirmController.mo33202b(this.f226433b);
            }
        }
    }

    /* renamed from: se0.c$e */
    public static final class C77675e implements DialogInterface.OnKeyListener {

        /* renamed from: d */
        public final /* synthetic */ C77669c f226435d;

        /* renamed from: se0.c$e$a */
        public static final class C77676a implements C77330b {

            /* renamed from: a */
            public final /* synthetic */ C77669c f226436a;

            public C77676a(C77669c cVar) {
                this.f226436a = cVar;
            }

            /* renamed from: a */
            public final void mo107459a(Object obj) {
                IOpenIMKefuConfirmController iOpenIMKefuConfirmController = this.f226436a.f226424e;
                if (iOpenIMKefuConfirmController != null) {
                    iOpenIMKefuConfirmController.cancel();
                }
            }
        }

        public C77675e(C77669c cVar) {
            this.f226435d = cVar;
        }

        public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            if (i != 4) {
                return false;
            }
            C77669c cVar = this.f226435d;
            cVar.mo107831j(new C77676a(cVar));
            if (dialogInterface != null) {
                dialogInterface.dismiss();
            }
            return true;
        }
    }

    /* renamed from: se0.c$f */
    public static final class C77677f implements DialogInterface.OnShowListener {

        /* renamed from: d */
        public static final C77677f f226437d = new C77677f();

        public final void onShow(DialogInterface dialogInterface) {
        }
    }

    /* renamed from: se0.c$g */
    public static final class C77678g implements C77330b {

        /* renamed from: a */
        public final /* synthetic */ C77669c f226438a;

        public C77678g(C77669c cVar) {
            this.f226438a = cVar;
        }

        /* renamed from: a */
        public final void mo107459a(Object obj) {
            IOpenIMKefuConfirmController iOpenIMKefuConfirmController = this.f226438a.f226424e;
            if (iOpenIMKefuConfirmController != null) {
                iOpenIMKefuConfirmController.cancel();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C77669c(Activity activity) {
        super(activity);
        C87412m.m108594g(activity, "context");
    }

    /* renamed from: i */
    public static final void m93651i(C77669c cVar) {
        cVar.mo107830g(0, "");
    }

    /* renamed from: a */
    public void mo35492a() {
        super.mo35492a();
    }

    /* renamed from: b */
    public void mo35493b(int i, int i2, C46027q qVar) {
        C87412m.m108594g(qVar, "confirmData");
        super.mo35493b(i, i2, qVar);
        this.f226427h = new C77673d(this, i);
        C77900f fVar = new C77900f(this.f226423d);
        fVar.f226960h = qVar;
        fVar.setOnKeyListener(new C77675e(this));
        fVar.setOnShowListener(C77677f.f226437d);
        mo107831j(new C77678g(this));
        fVar.f226961i = this.f226427h;
        fVar.setCanceledOnTouchOutside(false);
        this.f226428i = fVar;
        fVar.show();
    }

    /* renamed from: c */
    public void mo35494c() {
        IOpenIMKefuConfirmController iOpenIMKefuConfirmController = this.f226424e;
        boolean z = true;
        if (iOpenIMKefuConfirmController == null || !iOpenIMKefuConfirmController.mo33205d()) {
            z = false;
        }
        if (z) {
            mo107831j(new C77670a(this));
            C77900f fVar = this.f226428i;
            if (fVar != null) {
                fVar.dismiss();
            }
        }
    }

    /* renamed from: d */
    public void mo35495d() {
        C119179t tVar = C119157j.f356862d;
        C77671b bVar = new C77671b(this);
        C119157j jVar = (C119157j) tVar;
        jVar.getClass();
        jVar.mo183892w(bVar, 500, false);
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

    /* renamed from: f */
    public void mo35497f() {
        IOpenIMKefuConfirmController iOpenIMKefuConfirmController = this.f226424e;
        boolean z = true;
        if (iOpenIMKefuConfirmController == null || !iOpenIMKefuConfirmController.mo33201a()) {
            z = false;
        }
        if (z) {
            super.mo35497f();
        }
    }

    /* renamed from: j */
    public final void mo107831j(C77330b bVar) {
        C77900f fVar = this.f226428i;
        if (fVar != null) {
            fVar.setOnDismissListener(new C77672c(bVar));
        }
    }

    public void release() {
        OpenIMKefuConfirmDialogView openIMKefuConfirmDialogView;
        C77900f fVar;
        this.f226423d = null;
        C77900f fVar2 = this.f226428i;
        boolean z = true;
        if (fVar2 == null || !fVar2.isShowing()) {
            z = false;
        }
        if (z && (fVar = this.f226428i) != null) {
            fVar.mo108000h(0);
        }
        C77900f fVar3 = this.f226428i;
        if (fVar3 != null && (openIMKefuConfirmDialogView = fVar3.f226959g) != null) {
            ((C32415b) C86312j.m106911c(C32415b.class)).Bx0().remove(openIMKefuConfirmDialogView);
        }
    }
}
