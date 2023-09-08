package com.tencent.p014mm.plugin.webview.luggage;

import android.content.Intent;
import android.view.View;
import di3.C86312j;
import e51.C45544c;
import e51.C45547h;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.webview.luggage.e */
public class C5873e implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ DownloadProgressImageView f22085d;

    public C5873e(DownloadProgressImageView downloadProgressImageView) {
        this.f22085d = downloadProgressImageView;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/webview/luggage/DownloadProgressImageView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Intent intent = new Intent();
        intent.putExtra("view_task", true);
        intent.putExtra("from_scene", 3);
        ((C45547h) C86312j.m106911c(C45547h.class)).p30(this.f22085d.getContext(), intent, (C45544c) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/webview/luggage/DownloadProgressImageView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
