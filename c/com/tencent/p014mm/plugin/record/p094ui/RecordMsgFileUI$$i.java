package com.tencent.p014mm.plugin.record.p094ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;

/* renamed from: com.tencent.mm.plugin.record.ui.RecordMsgFileUI$$i */
public class RecordMsgFileUI$$i implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ String f20374d;

    /* renamed from: e */
    public final /* synthetic */ RecordMsgFileUI f20375e;

    public RecordMsgFileUI$$i(RecordMsgFileUI recordMsgFileUI, String str) {
        this.f20375e = recordMsgFileUI;
        this.f20374d = str;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/record/ui/RecordMsgFileUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Intent intent = new Intent();
        intent.putExtra("rawUrl", this.f20374d);
        C88144b.m109791i(this.f20375e.getContext(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/record/ui/RecordMsgFileUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
