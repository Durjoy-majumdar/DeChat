package com.tencent.p014mm.plugin.scanner.view;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C76879j;

/* renamed from: com.tencent.mm.plugin.scanner.view.b */
public class C71027b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ScanCardRectView f205573d;

    /* renamed from: com.tencent.mm.plugin.scanner.view.b$a */
    public class C71028a implements DialogInterface.OnClickListener {
        public C71028a(C71027b bVar) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    public C71027b(ScanCardRectView scanCardRectView) {
        this.f205573d = scanCardRectView;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/scanner/view/ScanCardRectView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C76879j.m92752w(this.f205573d.getContext(), this.f205573d.getContext().getString(C0966R.string.ib7), this.f205573d.getContext().getString(C0966R.string.ib6), View.inflate(this.f205573d.getContext(), C0966R.C0971layout.bu6, (ViewGroup) null), new C71028a(this));
        C117292a.m165361g(this, "com/tencent/mm/plugin/scanner/view/ScanCardRectView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
