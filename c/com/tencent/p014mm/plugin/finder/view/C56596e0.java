package com.tencent.p014mm.plugin.finder.view;

import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.FlowLayout;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import te3.C64750uh0;
import te3.C64772vh0;

/* renamed from: com.tencent.mm.plugin.finder.view.e0 */
public final class C56596e0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ View f162250d;

    /* renamed from: e */
    public final /* synthetic */ FinderAdFeedbackWindow f162251e;

    public C56596e0(View view, FinderAdFeedbackWindow finderAdFeedbackWindow) {
        this.f162250d = view;
        this.f162251e = finderAdFeedbackWindow;
    }

    public final void onClick(View view) {
        LinkedList<C64750uh0> linkedList;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/view/FinderAdFeedbackWindow$initFirstPage$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((TextView) this.f162250d.findViewById(C0966R.C0970id.ohq)).setTextColor(this.f162251e.f161998f.getResources().getColor(C0966R.color.f2939n));
        ((WeImageView) this.f162250d.findViewById(C0966R.C0970id.oo4)).setIconColor(this.f162251e.f161998f.getResources().getColor(C0966R.color.f2939n));
        this.f162250d.setBackgroundDrawable(this.f162251e.f161998f.getResources().getDrawable(C0966R.C0969drawable.f5041ux));
        FinderAdFeedbackWindow finderAdFeedbackWindow = this.f162251e;
        finderAdFeedbackWindow.f162005p.setVisibility(8);
        finderAdFeedbackWindow.f162006q.setVisibility(0);
        finderAdFeedbackWindow.f162007r.setVisibility(0);
        finderAdFeedbackWindow.f162006q.setText(finderAdFeedbackWindow.f161998f.getResources().getString(C0966R.string.f8069dl));
        finderAdFeedbackWindow.f162007r.setText(finderAdFeedbackWindow.f161998f.getResources().getString(C0966R.string.f8068dk));
        FlowLayout flowLayout = (FlowLayout) finderAdFeedbackWindow.getContentView().findViewById(C0966R.C0970id.ohp);
        View findViewById = finderAdFeedbackWindow.getContentView().findViewById(C0966R.C0970id.eeu);
        View findViewById2 = finderAdFeedbackWindow.getContentView().findViewById(C0966R.C0970id.olm);
        TextView textView = (TextView) finderAdFeedbackWindow.getContentView().findViewById(C0966R.C0970id.mly);
        textView.setVisibility(0);
        finderAdFeedbackWindow.mo79673b(textView);
        flowLayout.removeAllViews();
        C64772vh0 vh02 = finderAdFeedbackWindow.f162002j;
        if (!(vh02 == null || (linkedList = vh02.f185892j) == null)) {
            for (C64750uh0 uh02 : linkedList) {
                String str = uh02.f185741e;
                if (str == null) {
                    str = "";
                }
                View a = finderAdFeedbackWindow.mo79672a(str, -1);
                flowLayout.addView(a);
                a.setOnClickListener(new C56606f0(a, finderAdFeedbackWindow, uh02, textView));
            }
        }
        textView.setOnClickListener(new C56610g0(finderAdFeedbackWindow));
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view2 = findViewById;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderAdFeedbackWindow", "initSecondPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/view/FinderAdFeedbackWindow", "initSecondPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(8);
        View view3 = findViewById2;
        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderAdFeedbackWindow", "initSecondPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/view/FinderAdFeedbackWindow", "initSecondPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/FinderAdFeedbackWindow$initFirstPage$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
