package zd0;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import be0.C0265d;
import be0.C28301e;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.msgsubscription.SubscribeMsgTmpItem;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C76879j;
import qo3.C77398g;

/* renamed from: zd0.n */
public final class C119104n implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C119102m f356663d;

    /* renamed from: e */
    public final /* synthetic */ SubscribeMsgTmpItem f356664e;

    public C119104n(C119102m mVar, SubscribeMsgTmpItem subscribeMsgTmpItem) {
        this.f356663d = mVar;
        this.f356664e = subscribeMsgTmpItem;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/msgsubscription/ui/SubscribeMsgListAdapter$fillInfoIcon$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C119102m mVar = this.f356663d;
        Context context = mVar.f356657f;
        String str = mVar.f356656e;
        SubscribeMsgTmpItem subscribeMsgTmpItem = this.f356664e;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "exampleTitle");
        C87412m.m108594g(subscribeMsgTmpItem, "item");
        C77398g w = C76879j.m92752w(context, str, context.getString(C0966R.string.f8029zr), C0265d.f821a.mo309a(context, subscribeMsgTmpItem.f49024i, context.getResources().getDimensionPixelSize(C0966R.dimen.f3956le)), C28301e.f77898d);
        w.mo107543y(Color.parseColor("#07C160"));
        w.setCancelable(false);
        w.setCanceledOnTouchOutside(false);
        C117292a.m165361g(this, "com/tencent/mm/msgsubscription/ui/SubscribeMsgListAdapter$fillInfoIcon$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
