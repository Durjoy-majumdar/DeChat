package qk1;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.C0966R;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C76912y0;

/* renamed from: qk1.q */
public final class C12829q implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ Context f36718d;

    public C12829q(Context context) {
        this.f36718d = context;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorPromoteInfoAdapter$onBindViewHolder$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Context context = this.f36718d;
        C76912y0.m92773l(context, context.getResources().getString(C0966R.string.e59));
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorPromoteInfoAdapter$onBindViewHolder$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
