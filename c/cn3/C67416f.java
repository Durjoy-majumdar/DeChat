package cn3;

import android.view.View;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import j20.C117292a;
import java.util.ArrayList;
import um3.C78238c;

/* renamed from: cn3.f */
public final class C67416f implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C67413d f193332d;

    public C67416f(C67413d dVar) {
        this.f193332d = dVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/mvvm/uic/conversation/recent/RecentConversationHeaderUIC$updateView$1$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        String stringExtra = this.f193332d.getActivity().getIntent().getStringExtra("KEY_MSG_CONTENT");
        if (stringExtra == null) {
            stringExtra = "";
        }
        UIStateCenter e3 = this.f193332d.mo14599e3();
        if (e3 != null) {
            e3.dispatch(new C78238c(stringExtra));
        }
        C117292a.m165361g(this, "com/tencent/mm/ui/mvvm/uic/conversation/recent/RecentConversationHeaderUIC$updateView$1$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
