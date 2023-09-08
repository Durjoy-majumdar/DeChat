package com.tencent.p014mm.plugin.finder.view;

import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.CheckBox;
import com.google.android.material.bottomsheet.C104428a;
import com.tencent.p014mm.C0966R;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.finder.view.z3 */
public final class C4238z3 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderPostOriginView f18555d;

    public C4238z3(FinderPostOriginView finderPostOriginView) {
        this.f18555d = finderPostOriginView;
    }

    public final void onClick(View view) {
        View decorView;
        CheckBox checkBox;
        View decorView2;
        Button button;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/view/FinderPostOriginView$initAnnounceView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C104428a aVar = this.f18555d.f17919t;
        if (aVar != null && aVar.isShowing()) {
            Window window = aVar.getWindow();
            if (!(window == null || (decorView2 = window.getDecorView()) == null || (button = (Button) decorView2.findViewById(C0966R.C0970id.f358943n30)) == null || button.getVisibility() != 0)) {
                button.setEnabled(true);
            }
            Window window2 = aVar.getWindow();
            if (!(window2 == null || (decorView = window2.getDecorView()) == null || (checkBox = (CheckBox) decorView.findViewById(C0966R.C0970id.n2t)) == null || checkBox.getVisibility() != 0)) {
                checkBox.setChecked(true);
            }
        }
        C41592j jVar = this.f18555d.f17920u;
        if (jVar != null) {
            jVar.mo64704b();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/FinderPostOriginView$initAnnounceView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
