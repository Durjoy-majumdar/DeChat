package y03;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: y03.f */
public class C23200f implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C23184e f66609d;

    public C23200f(C23184e eVar) {
        this.f66609d = eVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f66609d.getFSVideoUIComponent().mo24995y5().f66034h = true;
        C117292a.m165361g(this, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
