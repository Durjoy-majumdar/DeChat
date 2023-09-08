package zd0;

import android.view.View;
import android.widget.CheckBox;
import com.tencent.p014mm.msgsubscription.SubscribeMsgTmpItem;
import j20.C117292a;
import java.util.ArrayList;
import zd0.C119102m;

/* renamed from: zd0.o */
public final class C119105o implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C119102m.C119103a f356665d;

    /* renamed from: e */
    public final /* synthetic */ C119102m f356666e;

    /* renamed from: f */
    public final /* synthetic */ SubscribeMsgTmpItem f356667f;

    public C119105o(C119102m.C119103a aVar, C119102m mVar, SubscribeMsgTmpItem subscribeMsgTmpItem) {
        this.f356665d = aVar;
        this.f356666e = mVar;
        this.f356667f = subscribeMsgTmpItem;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/msgsubscription/ui/SubscribeMsgListAdapter$fillSubscribeCheckBox$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        CheckBox checkBox = this.f356665d.f356662z;
        checkBox.setChecked(!checkBox.isChecked());
        this.f356666e.f356658g.mo35620a(this.f356667f, this.f356665d.f356662z.isChecked());
        C117292a.m165361g(this, "com/tencent/mm/msgsubscription/ui/SubscribeMsgListAdapter$fillSubscribeCheckBox$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
