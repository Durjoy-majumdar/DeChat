package com.tencent.p014mm.plugin.fts.p059ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.tools.ActionBarSearchView;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.fts.ui.widget.FTSActionBarSearchView */
public class FTSActionBarSearchView extends ActionBarSearchView {

    /* renamed from: v */
    public View f313187v;

    /* renamed from: com.tencent.mm.plugin.fts.ui.widget.FTSActionBarSearchView$a */
    public class C105366a implements View.OnClickListener {
        public C105366a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/fts/ui/widget/FTSActionBarSearchView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FTSActionBarSearchView.this.mo153791c();
            FTSActionBarSearchView fTSActionBarSearchView = FTSActionBarSearchView.this;
            ((InputMethodManager) fTSActionBarSearchView.getContext().getSystemService("input_method")).showSoftInput(fTSActionBarSearchView.f319071e, 0);
            C117292a.m165361g(this, "com/tencent/mm/plugin/fts/ui/widget/FTSActionBarSearchView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public FTSActionBarSearchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.atc;
    }

    public void setCursorVisible(boolean z) {
        this.f319071e.setCursorVisible(z);
    }

    public FTSActionBarSearchView(Context context) {
        super(context);
        View findViewById = findViewById(C0966R.C0970id.j5u);
        this.f313187v = findViewById;
        findViewById.setOnClickListener(new C105366a());
    }
}
