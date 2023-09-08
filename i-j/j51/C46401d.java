package j51;

import android.view.View;
import com.tencent.p014mm.plugin.downloader_app.model.C41008v;
import com.tencent.p014mm.plugin.downloader_app.model.v$$c;
import com.tencent.p014mm.plugin.downloader_app.p039ui.DeleteTaskFooterView;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: j51.d */
public class C46401d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ DeleteTaskFooterView f125004d;

    public C46401d(DeleteTaskFooterView deleteTaskFooterView) {
        this.f125004d = deleteTaskFooterView;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/downloader_app/ui/DeleteTaskFooterView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        DeleteTaskFooterView deleteTaskFooterView = this.f125004d;
        int i = DeleteTaskFooterView.f110418o;
        deleteTaskFooterView.getClass();
        Iterator<v$$c> it = C41008v.f110376b.iterator();
        while (it.hasNext()) {
            it.next().mo64027a();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/downloader_app/ui/DeleteTaskFooterView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
