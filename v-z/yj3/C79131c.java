package yj3;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import p739wi.C78597c;

/* renamed from: yj3.c */
public class C79131c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C79123a f232381d;

    public C79131c(C79123a aVar) {
        this.f232381d = aVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/compat/ChattingCompat$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C79123a aVar = this.f232381d;
        if (!aVar.f232358o) {
            aVar.f232364u.removeCallbacks(aVar.f232369z);
            C78597c.C78599c cVar = this.f232381d.f232366w;
            if (cVar != null) {
                cVar.onFinish();
            }
            this.f232381d.f232350d.finish();
        }
        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/compat/ChattingCompat$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
