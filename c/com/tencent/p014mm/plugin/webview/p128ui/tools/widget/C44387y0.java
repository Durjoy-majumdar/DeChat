package com.tencent.p014mm.plugin.webview.p128ui.tools.widget;

import al3.C0086a;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C44366w0;
import i93.C8866a;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C77389a;
import qo3.C77398g;
import te3.C49519g6;
import te3.C49983jf;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.y0 */
public final class C44387y0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C44366w0.C44375i f120314d;

    /* renamed from: e */
    public final /* synthetic */ C49983jf f120315e;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.y0$a */
    public static final class C44388a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C49983jf f120316d;

        /* renamed from: e */
        public final /* synthetic */ C44366w0.C44375i f120317e;

        public C44388a(C49983jf jfVar, C44366w0.C44375i iVar) {
            this.f120316d = jfVar;
            this.f120317e = iVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C49519g6 g6Var = new C49519g6();
            g6Var.f133878h = this.f120316d.f136074e;
            g6Var.f133877g = 2;
            this.f120317e.f120277f.mo69122p(g6Var);
            C8866a.m8686c(13);
        }
    }

    public C44387y0(C44366w0.C44375i iVar, C49983jf jfVar) {
        this.f120314d = iVar;
        this.f120315e = jfVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/widget/MPWriteCommentLayout$MPMyCommentItemAdapter$updateCommentContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Context context = this.f120314d.f120275d;
        C77389a aVar = new C77389a();
        aVar.f225644a = this.f120314d.f120275d.getString(C0966R.string.aqv);
        aVar.f225660q = "";
        aVar.f225638U = this.f120314d.f120275d.getResources().getColor(C0966R.color.Red_100);
        aVar.f225663t = C0086a.m38a(context).getString(C0966R.string.f7944x1);
        aVar.f225620C = new C44388a(this.f120315e, this.f120314d);
        aVar.f225664u = C0086a.m38a(context).getString(C0966R.string.atx);
        C77398g gVar = new C77398g(context, C0966R.style.a66);
        gVar.mo107525e(aVar);
        gVar.show();
        C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/widget/MPWriteCommentLayout$MPMyCommentItemAdapter$updateCommentContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
