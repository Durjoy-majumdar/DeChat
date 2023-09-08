package vg3;

import android.content.DialogInterface;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: vg3.c */
public class C14870c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ DialogInterface.OnClickListener f40892d;

    /* renamed from: e */
    public final /* synthetic */ boolean f40893e;

    /* renamed from: f */
    public final /* synthetic */ C118677e f40894f;

    public C14870c(C118677e eVar, DialogInterface.OnClickListener onClickListener, boolean z) {
        this.f40894f = eVar;
        this.f40892d = onClickListener;
        this.f40893e = z;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/sdcard_migrate/ui/NoSVGMMAlertDialog$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        DialogInterface.OnClickListener onClickListener = this.f40892d;
        if (onClickListener != null) {
            onClickListener.onClick(this.f40894f, -1);
        }
        if (this.f40893e) {
            this.f40894f.dismiss();
        }
        C117292a.m165361g(this, "com/tencent/mm/sdcard_migrate/ui/NoSVGMMAlertDialog$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
