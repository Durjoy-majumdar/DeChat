package com.tencent.p014mm.plugin.component.editor;

import android.widget.LinearLayout;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.RecyclerView;
import j20.C117292a;
import java.util.ArrayList;
import v21.C102127d;
import v21.C102132i;
import v21.C102142r;

/* renamed from: com.tencent.mm.plugin.component.editor.k */
public class C93077k extends RecyclerView.C0130p {

    /* renamed from: d */
    public final /* synthetic */ EditorUI f268124d;

    public C93077k(EditorUI editorUI) {
        this.f268124d = editorUI;
    }

    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/component/editor/EditorUI$23", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        super.onScrollStateChanged(recyclerView, i);
        boolean z = true;
        if (i == 0) {
            PopupWindow popupWindow = C102132i.m134538h().f300771r;
            C102132i.m134538h().mo141675x(popupWindow != null && popupWindow.isShowing());
            PopupWindow popupWindow2 = C102132i.m134538h().f300774u;
            if (popupWindow2 == null || !popupWindow2.isShowing()) {
                z = false;
            }
            C102132i.m134538h().mo141677z(z);
            C102132i.m134538h().mo141651E(false, 50);
        } else if (i == 1) {
            C102132i.m134538h().mo141665n();
            C102132i.m134538h().mo141667p();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/component/editor/EditorUI$23", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        LinearLayout linearLayout;
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Integer.valueOf(i2));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/component/editor/EditorUI$23", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        super.onScrolled(recyclerView, i, i2);
        if (i2 > 30) {
            C102132i.m134538h().mo141665n();
            C102132i.m134538h().mo141667p();
        }
        C102127d l = C102132i.m134538h().mo141663l();
        EditorUI editorUI = this.f268124d;
        if ((editorUI.f268054s || ((linearLayout = editorUI.f268044f) != null && linearLayout.getVisibility() == 0)) && l.mo141642a() == 2 && C102142r.m134571b(recyclerView, l.f300735a) == null) {
            this.f268124d.mo127481O7();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/component/editor/EditorUI$23", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
