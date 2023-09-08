package te0;

import android.app.Activity;
import android.content.Context;
import androidx.appcompat.app.C103422m;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.openim.p018ui.dialog.OpenIMKefuConfirmDialogView;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import he0.C46027q;
import se0.C22361f;
import ue0.C78151a;

/* renamed from: te0.f */
public final class C77900f extends C103422m implements C78151a {

    /* renamed from: f */
    public final Context f226958f;

    /* renamed from: g */
    public OpenIMKefuConfirmDialogView f226959g;

    /* renamed from: h */
    public C46027q f226960h;

    /* renamed from: i */
    public C22361f.C22363b f226961i;

    public C77900f(Context context) {
        super(context, C0966R.style.f8691rb);
        this.f226958f = context;
    }

    public void dismiss() {
        OpenIMKefuConfirmDialogView openIMKefuConfirmDialogView;
        if (isShowing() && (openIMKefuConfirmDialogView = this.f226959g) != null) {
            openIMKefuConfirmDialogView.mo93671b(5);
        }
    }

    /* renamed from: h */
    public void mo108000h(int i) {
        Log.m105926v("MicroMsg.OpenIMKefuConfirmDialog", "dismissDialog exitType: " + i);
        try {
            if (isShowing()) {
                super.dismiss();
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004f, code lost:
        r2 = (r2 = r2.getResources()).getDisplayMetrics();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r4) {
        /*
            r3 = this;
            super.onCreate(r4)
            java.lang.String r4 = "MicroMsg.OpenIMKefuConfirmDialog"
            java.lang.String r0 = "alvinluo OpenIMKefuConfirmDialog onCreate"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            android.view.Window r4 = r3.getWindow()
            r0 = -2
            r1 = -1
            if (r4 == 0) goto L_0x0015
            r4.setLayout(r1, r0)
        L_0x0015:
            android.view.Window r4 = r3.getWindow()
            if (r4 == 0) goto L_0x0020
            r2 = 67108864(0x4000000, float:1.5046328E-36)
            r4.addFlags(r2)
        L_0x0020:
            android.view.Window r4 = r3.getWindow()
            if (r4 == 0) goto L_0x002b
            r2 = 1056964608(0x3f000000, float:0.5)
            r4.setDimAmount(r2)
        L_0x002b:
            android.view.Window r4 = r3.getWindow()
            if (r4 == 0) goto L_0x0037
            r2 = 2131886334(0x7f1200fe, float:1.9407244E38)
            r4.setWindowAnimations(r2)
        L_0x0037:
            android.view.Window r4 = r3.getWindow()
            if (r4 == 0) goto L_0x0067
            android.view.View r4 = r4.getDecorView()
            if (r4 == 0) goto L_0x0067
            android.content.Context r2 = r4.getContext()
            if (r2 == 0) goto L_0x0058
            android.content.res.Resources r2 = r2.getResources()
            if (r2 == 0) goto L_0x0058
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            if (r2 == 0) goto L_0x0058
            int r2 = r2.widthPixels
            goto L_0x0060
        L_0x0058:
            android.content.Context r2 = r4.getContext()
            int r2 = kg3.C76577a.m92145A(r2)
        L_0x0060:
            r4.setMinimumWidth(r2)
            r2 = 0
            r4.setPadding(r2, r2, r2, r2)
        L_0x0067:
            android.view.Window r4 = r3.getWindow()
            if (r4 == 0) goto L_0x007b
            android.view.WindowManager$LayoutParams r4 = r4.getAttributes()
            if (r4 == 0) goto L_0x007b
            r4.width = r1
            r4.height = r0
            r0 = 80
            r4.gravity = r0
        L_0x007b:
            com.tencent.mm.openim.ui.dialog.OpenIMKefuConfirmDialogView r4 = new com.tencent.mm.openim.ui.dialog.OpenIMKefuConfirmDialogView
            android.content.Context r0 = r3.f226958f
            if (r0 != 0) goto L_0x008a
            android.content.Context r0 = r3.getContext()
            java.lang.String r2 = "context"
            gy3.C87412m.m108593f(r0, r2)
        L_0x008a:
            r2 = 0
            r4.<init>(r0, r2)
            r3.f226959g = r4
            r4.f195881i = r3
            he0.q r0 = r3.f226960h
            r4.setConfirmData(r0)
            com.tencent.mm.openim.ui.dialog.OpenIMKefuConfirmDialogView r4 = r3.f226959g
            if (r4 == 0) goto L_0x00a0
            se0.f$b r0 = r3.f226961i
            r4.setOnConfirmDialogOpListener(r0)
        L_0x00a0:
            com.tencent.mm.openim.ui.dialog.OpenIMKefuConfirmDialogView r4 = r3.f226959g
            gy3.C87412m.m108591d(r4)
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r0.<init>(r1, r1)
            r3.setContentView(r4, r0)
            te0.e r4 = new te0.e
            r4.<init>(r3)
            r3.setOnShowListener(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: te0.C77900f.onCreate(android.os.Bundle):void");
    }

    public void show() {
        try {
            if (getContext() instanceof Activity) {
                Context context = getContext();
                C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
                if (((Activity) context).isFinishing()) {
                    Log.m105928w("MicroMsg.OpenIMKefuConfirmDialog", "realShowDialog ui is finishing and ignore");
                    return;
                }
            }
            super.show();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.OpenIMKefuConfirmDialog", e, "realShowDialog exception", new Object[0]);
        }
    }
}
