package x73;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.search.FTSEditTextView;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: x73.c */
public final class C53295c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ View f148886d;

    public C53295c(View view) {
        this.f148886d = view;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/websearch/emojisearch/ui/EmojiSearchDialog$initContentView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        FTSEditTextView fTSEditTextView = (FTSEditTextView) this.f148886d.findViewById(C0966R.C0970id.eg6);
        if (fTSEditTextView != null) {
            fTSEditTextView.mo70355k();
        }
        FTSEditTextView fTSEditTextView2 = (FTSEditTextView) this.f148886d.findViewById(C0966R.C0970id.eg6);
        if (fTSEditTextView2 != null) {
            fTSEditTextView2.mo70360p();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/websearch/emojisearch/ui/EmojiSearchDialog$initContentView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
