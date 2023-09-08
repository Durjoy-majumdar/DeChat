package gb1;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: gb1.d */
public class C45903d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C116932c f123872d;

    public C45903d(C116932c cVar) {
        this.f123872d = cVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/facedetect/motion/NormalFaceMotion$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f123872d.f350383b = true;
        C117292a.m165361g(this, "com/tencent/mm/plugin/facedetect/motion/NormalFaceMotion$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
