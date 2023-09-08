package ve1;

import android.view.View;
import com.tencent.p014mm.plugin.finder.feed.model.C2815r0;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: ve1.u8 */
public final class C14652u8 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C14629s8 f40528d;

    /* renamed from: e */
    public final /* synthetic */ C2815r0 f40529e;

    public C14652u8(C14629s8 s8Var, C2815r0 r0Var) {
        this.f40528d = s8Var;
        this.f40529e = r0Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderWordingConvert$onBindViewHolder$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f40528d.f40475e.invoke(this.f40529e);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderWordingConvert$onBindViewHolder$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
