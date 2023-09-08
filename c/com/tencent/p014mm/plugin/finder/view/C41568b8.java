package com.tencent.p014mm.plugin.finder.view;

import android.content.ClipboardManager;
import android.view.View;
import com.tencent.p014mm.plugin.finder.view.TestPreloadPreview;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.plugin.finder.view.b8 */
public final class C41568b8 implements View.OnLongClickListener {

    /* renamed from: d */
    public final /* synthetic */ TestPreloadPreview.C41566e f111886d;

    /* renamed from: e */
    public final /* synthetic */ TestPreloadPreview f111887e;

    public C41568b8(TestPreloadPreview.C41566e eVar, TestPreloadPreview testPreloadPreview) {
        this.f111886d = eVar;
        this.f111887e = testPreloadPreview;
    }

    public final boolean onLongClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/view/TestPreloadPreview$TestAdapter$onBindViewHolder$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        Object systemService = MMApplicationContext.getContext().getSystemService("clipboard");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ((ClipboardManager) systemService).setText(this.f111886d.f111884z.getText());
        C76701a.makeText(this.f111887e.getContext(), (CharSequence) "copy done", 0).show();
        C117292a.m165362h(true, this, "com/tencent/mm/plugin/finder/view/TestPreloadPreview$TestAdapter$onBindViewHolder$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
