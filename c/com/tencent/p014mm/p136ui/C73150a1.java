package com.tencent.p014mm.p136ui;

import android.content.DialogInterface;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.ui.a1 */
public class C73150a1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ DialogInterface.OnClickListener f214688d;

    /* renamed from: e */
    public final /* synthetic */ boolean f214689e;

    /* renamed from: f */
    public final /* synthetic */ C73153b1 f214690f;

    public C73150a1(C73153b1 b1Var, DialogInterface.OnClickListener onClickListener, boolean z) {
        this.f214690f = b1Var;
        this.f214688d = onClickListener;
        this.f214689e = z;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/LiteDependDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        DialogInterface.OnClickListener onClickListener = this.f214688d;
        if (onClickListener != null) {
            onClickListener.onClick(this.f214690f, -1);
        }
        if (this.f214689e) {
            this.f214690f.dismiss();
        }
        C117292a.m165361g(this, "com/tencent/mm/ui/LiteDependDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
