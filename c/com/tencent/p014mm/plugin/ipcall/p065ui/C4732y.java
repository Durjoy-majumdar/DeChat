package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.widget.AbsListView;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.y */
public class C4732y implements AbsListView.OnScrollListener {

    /* renamed from: d */
    public final /* synthetic */ IPCallContactUI f19746d;

    public C4732y(IPCallContactUI iPCallContactUI) {
        this.f19746d = iPCallContactUI;
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(absListView);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Integer.valueOf(i2));
        arrayList.add(Integer.valueOf(i3));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/ipcall/ui/IPCallContactUI$8", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        IPCallContactUI iPCallContactUI = this.f19746d;
        if (iPCallContactUI.f19460q == -1) {
            iPCallContactUI.f19460q = i;
            C117292a.m165361g(this, "com/tencent/mm/plugin/ipcall/ui/IPCallContactUI$8", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
            return;
        }
        if (iPCallContactUI.f19461r == -1) {
            iPCallContactUI.f19461r = i;
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/ipcall/ui/IPCallContactUI$8", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(absListView);
        arrayList.add(Integer.valueOf(i));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/ipcall/ui/IPCallContactUI$8", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        this.f19746d.hideVKB();
        C117292a.m165361g(this, "com/tencent/mm/plugin/ipcall/ui/IPCallContactUI$8", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }
}
