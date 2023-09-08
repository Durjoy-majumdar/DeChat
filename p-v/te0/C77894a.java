package te0;

import android.app.Activity;
import android.content.Context;
import androidx.appcompat.app.C103422m;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.openim.p018ui.dialog.OpenIMConfirmDialogView;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import p239sv.C77790f;
import p239sv.C77791o;
import ue0.C78151a;

/* renamed from: te0.a */
public final class C77894a extends C103422m implements C78151a, C77791o {

    /* renamed from: f */
    public final Context f226946f;

    /* renamed from: g */
    public OpenIMConfirmDialogView f226947g;

    /* renamed from: h */
    public C77895a f226948h;

    /* renamed from: i */
    public C77790f f226949i;

    /* renamed from: te0.a$a */
    public static final class C77895a {

        /* renamed from: a */
        public final CharSequence f226950a;

        /* renamed from: b */
        public final CharSequence f226951b;

        /* renamed from: c */
        public final String f226952c;

        /* renamed from: d */
        public final String f226953d;

        public C77895a(CharSequence charSequence, CharSequence charSequence2, String str, String str2) {
            this.f226950a = charSequence;
            this.f226951b = charSequence2;
            this.f226952c = str;
            this.f226953d = str2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C77895a)) {
                return false;
            }
            C77895a aVar = (C77895a) obj;
            return C87412m.m108589b(this.f226950a, aVar.f226950a) && C87412m.m108589b(this.f226951b, aVar.f226951b) && C87412m.m108589b(this.f226952c, aVar.f226952c) && C87412m.m108589b(this.f226953d, aVar.f226953d);
        }

        public int hashCode() {
            CharSequence charSequence = this.f226950a;
            int i = 0;
            int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
            CharSequence charSequence2 = this.f226951b;
            int hashCode2 = (hashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
            String str = this.f226952c;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f226953d;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode3 + i;
        }

        public String toString() {
            return "OpenIMConfirmDialogData(name=" + this.f226950a + ", companyName=" + this.f226951b + ", userName=" + this.f226952c + ", spamWording=" + this.f226953d + ')';
        }
    }

    public C77894a(Context context) {
        super(context, C0966R.style.f8691rb);
        this.f226946f = context;
    }

    public void dismiss() {
        OpenIMConfirmDialogView openIMConfirmDialogView;
        if (isShowing() && (openIMConfirmDialogView = this.f226947g) != null) {
            openIMConfirmDialogView.mo93671b(5);
        }
    }

    /* renamed from: h */
    public void mo108000h(int i) {
        Log.m105926v("MicroMsg.OpenIMConfirmDialog", "dismissDialog exitType: " + i);
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
            java.lang.String r4 = "MicroMsg.OpenIMConfirmDialog"
            java.lang.String r0 = "onCreate"
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
            com.tencent.mm.openim.ui.dialog.OpenIMConfirmDialogView r4 = new com.tencent.mm.openim.ui.dialog.OpenIMConfirmDialogView
            android.content.Context r0 = r3.f226946f
            if (r0 != 0) goto L_0x008a
            android.content.Context r0 = r3.getContext()
            java.lang.String r2 = "context"
            gy3.C87412m.m108593f(r0, r2)
        L_0x008a:
            r2 = 0
            r4.<init>(r0, r2)
            r3.f226947g = r4
            r4.f195881i = r3
            te0.a$a r0 = r3.f226948h
            r4.setConfirmData(r0)
            com.tencent.mm.openim.ui.dialog.OpenIMConfirmDialogView r4 = r3.f226947g
            if (r4 == 0) goto L_0x00a0
            sv.f r0 = r3.f226949i
            r4.setOnConfirmDialogOpListener(r0)
        L_0x00a0:
            com.tencent.mm.openim.ui.dialog.OpenIMConfirmDialogView r4 = r3.f226947g
            gy3.C87412m.m108591d(r4)
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r0.<init>(r1, r1)
            r3.setContentView(r4, r0)
            te0.b r4 = new te0.b
            r4.<init>(r3)
            r3.setOnShowListener(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: te0.C77894a.onCreate(android.os.Bundle):void");
    }

    public void show() {
        try {
            if (getContext() instanceof Activity) {
                Context context = getContext();
                C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
                if (((Activity) context).isFinishing()) {
                    Log.m105928w("MicroMsg.OpenIMConfirmDialog", "realShowDialog ui is finishing and ignore");
                    return;
                }
            }
            super.show();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.OpenIMConfirmDialog", e, "realShowDialog exception", new Object[0]);
        }
    }
}
