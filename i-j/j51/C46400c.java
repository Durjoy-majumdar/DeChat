package j51;

import android.view.View;
import com.tencent.p014mm.plugin.downloader_app.model.C41008v;
import com.tencent.p014mm.plugin.downloader_app.model.v$$b;
import com.tencent.p014mm.plugin.downloader_app.p039ui.DeleteTaskFooterView;
import d51.C7171c;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: j51.c */
public class C46400c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ DeleteTaskFooterView f125003d;

    public C46400c(DeleteTaskFooterView deleteTaskFooterView) {
        this.f125003d = deleteTaskFooterView;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/downloader_app/ui/DeleteTaskFooterView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        DeleteTaskFooterView deleteTaskFooterView = this.f125003d;
        if (deleteTaskFooterView.f110425j) {
            deleteTaskFooterView.f110425j = false;
            C7171c.m7371a(deleteTaskFooterView.f110420e, "checkbox_cell_off");
        } else {
            deleteTaskFooterView.f110425j = true;
            C7171c.m7371a(deleteTaskFooterView.f110420e, "checkbox_cell_on");
        }
        DeleteTaskFooterView deleteTaskFooterView2 = this.f125003d;
        if (deleteTaskFooterView2.f110424i) {
            boolean z = deleteTaskFooterView2.f110425j;
            deleteTaskFooterView2.getClass();
            Iterator<v$$b> it = C41008v.f110375a.iterator();
            while (it.hasNext()) {
                it.next().mo64026a(z);
            }
        }
        this.f125003d.f110424i = true;
        C117292a.m165361g(this, "com/tencent/mm/plugin/downloader_app/ui/DeleteTaskFooterView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
