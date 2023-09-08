package com.tencent.p014mm.plugin.webview.p128ui.tools.widget;

import android.view.View;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C44366w0;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import te3.C49983jf;
import te3.C50751oy;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.x0 */
public final class C44385x0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C44366w0.C44375i f120312d;

    /* renamed from: e */
    public final /* synthetic */ C49983jf f120313e;

    public C44385x0(C44366w0.C44375i iVar, C49983jf jfVar) {
        this.f120312d = iVar;
        this.f120313e = jfVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/widget/MPWriteCommentLayout$MPMyCommentItemAdapter$BizCommentViewHolder$update$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f120312d.f120277f.mo69123q(3);
        C44366w0.C44375i iVar = this.f120312d;
        C44366w0 w0Var = iVar.f120277f;
        C49983jf jfVar = this.f120313e;
        iVar.getClass();
        C87412m.m108594g(jfVar, "info");
        String str = jfVar.f136078i;
        C50751oy oyVar = jfVar.f136083q;
        if (oyVar != null && !Util.isNullOrNil((List) oyVar.f139442d)) {
            int size = jfVar.f136083q.f139442d.size() - 1;
            while (true) {
                if (-1 >= size) {
                    break;
                } else if (jfVar.f136083q.f139442d.get(size).f138833p == 0) {
                    str = jfVar.f136083q.f139442d.get(size).f138824d;
                    break;
                } else {
                    size--;
                }
            }
        }
        C87412m.m108593f(str, "reply");
        w0Var.mo69140w(str, this.f120313e.f136074e, true);
        C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/widget/MPWriteCommentLayout$MPMyCommentItemAdapter$BizCommentViewHolder$update$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
