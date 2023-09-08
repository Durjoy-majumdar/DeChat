package com.tencent.p014mm.plugin.wenote.p131ui.nativenote;

import android.widget.LinearLayout;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.RecyclerView;
import cb3.C92393d;
import cb3.C92400k;
import cb3.C92410t;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.wenote.ui.nativenote.b */
public class C96721b extends RecyclerView.C0130p {

    /* renamed from: d */
    public final /* synthetic */ NoteEditorUI f283333d;

    public C96721b(NoteEditorUI noteEditorUI) {
        this.f283333d = noteEditorUI;
    }

    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI$13", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        super.onScrollStateChanged(recyclerView, i);
        boolean z = true;
        if (i == 0) {
            PopupWindow popupWindow = C92400k.m116191h().f264441r;
            C92400k.m116191h().mo126365A(popupWindow != null && popupWindow.isShowing());
            PopupWindow popupWindow2 = C92400k.m116191h().f264444u;
            if (popupWindow2 == null || !popupWindow2.isShowing()) {
                z = false;
            }
            C92400k.m116191h().mo126367C(z);
            C92400k.m116191h().mo126373I(false, 50);
        } else if (i == 1) {
            C92400k.m116191h().mo126387n();
            C92400k.m116191h().mo126389p();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI$13", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        LinearLayout linearLayout;
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Integer.valueOf(i2));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI$13", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        super.onScrolled(recyclerView, i, i2);
        if (i2 > 30) {
            C92400k.m116191h().mo126387n();
            C92400k.m116191h().mo126389p();
        }
        C92393d l = C92400k.m116191h().mo126385l();
        NoteEditorUI noteEditorUI = this.f283333d;
        if ((noteEditorUI.f283216I || ((linearLayout = noteEditorUI.f283261p) != null && linearLayout.getVisibility() == 0)) && l.mo126357a() == 2 && C92410t.m116228b(recyclerView, l.f264399a) == null) {
            this.f283333d.mo134927V7();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI$13", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
