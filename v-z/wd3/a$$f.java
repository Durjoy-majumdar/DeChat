package wd3;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C76870b0;
import ob0.C117747y;
import te3.pq4;

public class a$$f implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C76870b0 f148296d;

    /* renamed from: e */
    public final /* synthetic */ int f148297e;

    /* renamed from: f */
    public final /* synthetic */ int f148298f;

    /* renamed from: g */
    public final /* synthetic */ String f148299g;

    /* renamed from: h */
    public final /* synthetic */ C117747y f148300h;

    /* renamed from: i */
    public final /* synthetic */ pq4 f148301i;

    /* renamed from: j */
    public final /* synthetic */ C78543a f148302j;

    public a$$f(C78543a aVar, C76870b0 b0Var, int i, int i2, String str, C117747y yVar, pq4 pq4) {
        this.f148302j = aVar;
        this.f148296d = b0Var;
        this.f148297e = i;
        this.f148298f = i2;
        this.f148299g = str;
        this.f148300h = yVar;
        this.f148301i = pq4;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/pluginsdk/ui/applet/AddContact$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f148296d.mo140680z();
        this.f148302j.mo108506i(this.f148297e, this.f148298f, this.f148299g, this.f148300h, this.f148301i.f139908g);
        C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/applet/AddContact$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
