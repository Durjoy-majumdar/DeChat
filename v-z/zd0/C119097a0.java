package zd0;

import android.view.View;
import com.tencent.p014mm.msgsubscription.SubscribeMsgTmpItem;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: zd0.a0 */
public final class C119097a0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C119108z f356651d;

    /* renamed from: e */
    public final /* synthetic */ SubscribeMsgTmpItem f356652e;

    /* renamed from: f */
    public final /* synthetic */ int f356653f;

    public C119097a0(C119108z zVar, SubscribeMsgTmpItem subscribeMsgTmpItem, int i) {
        this.f356651d = zVar;
        this.f356652e = subscribeMsgTmpItem;
        this.f356653f = i;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/msgsubscription/ui/SubscribeMsgSecondaryMenuListAdapter$filling$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f356651d.f356672g.mo35841b(this.f356652e, this.f356653f);
        C117292a.m165361g(this, "com/tencent/mm/msgsubscription/ui/SubscribeMsgSecondaryMenuListAdapter$filling$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
