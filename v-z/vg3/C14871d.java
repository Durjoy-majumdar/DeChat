package vg3;

import android.content.DialogInterface;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: vg3.d */
public class C14871d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ DialogInterface.OnClickListener f40895d;

    /* renamed from: e */
    public final /* synthetic */ boolean f40896e;

    /* renamed from: f */
    public final /* synthetic */ C118677e f40897f;

    public C14871d(C118677e eVar, DialogInterface.OnClickListener onClickListener, boolean z) {
        this.f40897f = eVar;
        this.f40895d = onClickListener;
        this.f40896e = z;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/sdcard_migrate/ui/NoSVGMMAlertDialog$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        DialogInterface.OnClickListener onClickListener = this.f40895d;
        if (onClickListener != null) {
            onClickListener.onClick(this.f40897f, -2);
        }
        if (this.f40896e) {
            this.f40897f.cancel();
        }
        C117292a.m165361g(this, "com/tencent/mm/sdcard_migrate/ui/NoSVGMMAlertDialog$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
