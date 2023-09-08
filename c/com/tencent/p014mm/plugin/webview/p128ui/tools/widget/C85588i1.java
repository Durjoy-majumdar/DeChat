package com.tencent.p014mm.plugin.webview.p128ui.tools.widget;

import android.content.DialogInterface;
import android.widget.ListAdapter;
import com.tencent.p014mm.p136ui.base.AuthorizeItemListView;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.i1 */
public class C85588i1 implements DialogInterface.OnDismissListener {

    /* renamed from: d */
    public final /* synthetic */ C85590k1 f249497d;

    public C85588i1(C85590k1 k1Var) {
        this.f249497d = k1Var;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        AuthorizeItemListView authorizeItemListView = this.f249497d.f249501c;
        if (authorizeItemListView != null) {
            authorizeItemListView.setAdapter((ListAdapter) null);
        }
    }
}
