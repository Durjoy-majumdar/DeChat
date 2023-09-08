package vz0;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import dz0.C20483c;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C76879j;
import p823sg.C77710q;

/* renamed from: vz0.i */
public class C53046i implements View.OnLongClickListener {

    /* renamed from: d */
    public final /* synthetic */ C20483c f148083d;

    /* renamed from: e */
    public final /* synthetic */ C53048k f148084e;

    public C53046i(C53048k kVar, C20483c cVar) {
        this.f148084e = kVar;
        this.f148083d = cVar;
    }

    public boolean onLongClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/card/ui/view/CardBaseCodeViewController$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        if (view.getId() == C0966R.C0970id.bfz) {
            ClipboardHelper.setText(this.f148084e.f148088b, this.f148083d.mo23263J0().f63950o);
            C76879j.m92726T(this.f148084e.f148088b, C77710q.m93738a(C0966R.string.f7938wv));
        }
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/card/ui/view/CardBaseCodeViewController$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return false;
    }
}
