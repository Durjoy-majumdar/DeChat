package j51;

import android.view.View;
import com.tencent.p014mm.plugin.downloader_app.p039ui.DownloadMainUI;
import com.tencent.p014mm.plugin.downloader_app.p039ui.TaskManagerHeaderView;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: j51.v */
public class C9282v implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ TaskManagerHeaderView f29037d;

    public C9282v(TaskManagerHeaderView taskManagerHeaderView) {
        this.f29037d = taskManagerHeaderView;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/downloader_app/ui/TaskManagerHeaderView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f29037d.getContext() instanceof DownloadMainUI) {
            ((DownloadMainUI) this.f29037d.getContext()).f110429d.mo64076B1();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/downloader_app/ui/TaskManagerHeaderView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
