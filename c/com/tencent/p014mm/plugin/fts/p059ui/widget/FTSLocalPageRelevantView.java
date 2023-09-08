package com.tencent.p014mm.plugin.fts.p059ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import j20.C117292a;
import java.util.ArrayList;
import te3.C13878hu3;

/* renamed from: com.tencent.mm.plugin.fts.ui.widget.FTSLocalPageRelevantView */
public class FTSLocalPageRelevantView extends LinearLayout implements View.OnClickListener {

    /* renamed from: com.tencent.mm.plugin.fts.ui.widget.FTSLocalPageRelevantView$a */
    public class C4411a {
    }

    /* renamed from: com.tencent.mm.plugin.fts.ui.widget.FTSLocalPageRelevantView$b */
    public interface C4412b {
        /* renamed from: a */
        void mo5342a(C13878hu3 hu32, String str, int i);
    }

    public FTSLocalPageRelevantView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public String getQuery() {
        return "";
    }

    public String getSearchId() {
        return "";
    }

    public String getWordList() {
        return new StringBuilder("").toString();
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/fts/ui/widget/FTSLocalPageRelevantView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C117292a.m165361g(this, "com/tencent/mm/plugin/fts/ui/widget/FTSLocalPageRelevantView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void setOnRelevantClickListener(C4412b bVar) {
    }

    public FTSLocalPageRelevantView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
