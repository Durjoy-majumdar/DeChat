package wf1;

import android.content.DialogInterface;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C101218e0;

/* renamed from: wf1.f */
public final class C15177f implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ DialogInterface.OnClickListener f41330d;

    /* renamed from: e */
    public final /* synthetic */ C101218e0 f41331e;

    public C15177f(DialogInterface.OnClickListener onClickListener, C101218e0 e0Var) {
        this.f41330d = onClickListener;
        this.f41331e = e0Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/uic/ChatRoomCustomUIC$initOnCreate$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        DialogInterface.OnClickListener onClickListener = this.f41330d;
        if (onClickListener != null) {
            onClickListener.onClick((DialogInterface) null, -2);
        }
        this.f41331e.mo140680z();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/uic/ChatRoomCustomUIC$initOnCreate$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
