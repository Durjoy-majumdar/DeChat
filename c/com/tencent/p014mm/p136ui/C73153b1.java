package com.tencent.p014mm.p136ui;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import qo3.C77390c0;

/* renamed from: com.tencent.mm.ui.b1 */
public class C73153b1 extends C77390c0 {

    /* renamed from: d */
    public Context f214711d;

    /* renamed from: e */
    public LinearLayout f214712e;

    /* renamed from: f */
    public Button f214713f;

    /* renamed from: g */
    public TextView f214714g = ((TextView) this.f214712e.findViewById(C0966R.C0970id.gux));

    /* renamed from: h */
    public TextView f214715h = ((TextView) this.f214712e.findViewById(C0966R.C0970id.guo));

    /* renamed from: i */
    public View f214716i;

    /* renamed from: j */
    public LinearLayout f214717j;

    /* renamed from: com.tencent.mm.ui.b1$a */
    public class C73154a implements Runnable {
        public C73154a() {
        }

        public void run() {
            C73153b1.this.dismiss();
        }
    }

    public C73153b1(Context context) {
        super(context, C0966R.style.a66);
        this.f214711d = context;
        LinearLayout linearLayout = (LinearLayout) C85868k2.m106137b(context).inflate(C0966R.C0971layout.bbv, (ViewGroup) null);
        this.f214712e = linearLayout;
        this.f214713f = (Button) linearLayout.findViewById(C0966R.C0970id.guw);
        TextView textView = (TextView) this.f214712e.findViewById(C0966R.C0970id.guu);
        this.f214716i = this.f214712e.findViewById(C0966R.C0970id.guy);
        this.f214717j = (LinearLayout) this.f214712e.findViewById(C0966R.C0970id.guq);
        LinearLayout linearLayout2 = (LinearLayout) this.f214712e.findViewById(C0966R.C0970id.guk);
        setCanceledOnTouchOutside(true);
    }

    /* renamed from: c */
    public void mo101591c(boolean z) {
        super.setCancelable(z);
    }

    public void dismiss() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            MMHandlerThread.postToMainThread(new C73154a());
            Log.m105920e("MicroMsg.LiteDependDialog", Util.getStack().toString());
            return;
        }
        try {
            super.dismiss();
        } catch (Exception e) {
            Log.m105920e("MicroMsg.LiteDependDialog", "dismiss exception, e = " + e.getMessage());
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(this.f214712e);
    }

    public void setCancelable(boolean z) {
        super.setCancelable(z);
        setCanceledOnTouchOutside(z);
    }

    public void setTitle(CharSequence charSequence) {
        View view = this.f214716i;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/LiteDependDialog", "setTitle", "(Ljava/lang/CharSequence;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/ui/LiteDependDialog", "setTitle", "(Ljava/lang/CharSequence;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f214714g.setVisibility(0);
        this.f214714g.setMaxLines(2);
        this.f214714g.setText(charSequence);
        TextView textView = this.f214715h;
        if (textView != null) {
            textView.setTextColor(textView.getContext().getResources().getColor(C0966R.color.f3306n5));
        }
    }

    public void show() {
        try {
            super.show();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.LiteDependDialog", e, "", new Object[0]);
        }
    }

    public void setTitle(int i) {
        View view = this.f214716i;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/LiteDependDialog", "setTitle", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/ui/LiteDependDialog", "setTitle", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f214714g.setVisibility(0);
        this.f214714g.setMaxLines(2);
        this.f214714g.setText(i);
        TextView textView = this.f214715h;
        if (textView != null) {
            textView.setTextColor(textView.getContext().getResources().getColor(C0966R.color.f3306n5));
        }
    }
}
