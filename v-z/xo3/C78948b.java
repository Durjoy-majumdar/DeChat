package xo3;

import android.view.View;
import com.tencent.p014mm.p136ui.C85975v4;
import j20.C117292a;
import java.util.ArrayList;
import xo3.C78950d;

/* renamed from: xo3.b */
public class C78948b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C78950d f231824d;

    public C78948b(C78950d dVar) {
        this.f231824d = dVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/widget/textview/SelectableTextHelper$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C85975v4.m106304a("SelectableTextHelper", "onClick", new Object[0]);
        View.OnClickListener onClickListener = this.f231824d.f231846h;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        C78950d dVar = this.f231824d;
        dVar.f231828C = true;
        dVar.f231829D = true;
        dVar.mo108921e();
        this.f231824d.mo108922f();
        C78950d.C78963m mVar = this.f231824d.f231845g;
        if (mVar != null) {
            mVar.mo103116a();
        }
        C117292a.m165361g(this, "com/tencent/mm/ui/widget/textview/SelectableTextHelper$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
