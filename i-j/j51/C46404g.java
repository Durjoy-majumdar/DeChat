package j51;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.snackbar.C75026b;
import com.tencent.p014mm.plugin.downloader_app.model.C40984c0;
import com.tencent.p014mm.plugin.downloader_app.model.C40990e0;
import com.tencent.p014mm.plugin.downloader_app.p039ui.DownloadMainUI;
import com.tencent.p014mm.plugin.downloader_app.p039ui.TaskListView;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.HashMap;
import k20.C60958c;
import k20.C9556a;

/* renamed from: j51.g */
public class C46404g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ DownloadMainUI f125009d;

    public C46404g(DownloadMainUI downloadMainUI) {
        this.f125009d = downloadMainUI;
    }

    public void run() {
        DownloadMainUI downloadMainUI = this.f125009d;
        if (!downloadMainUI.f110436n) {
            C75026b.m89951a(downloadMainUI, downloadMainUI.getString(C0966R.string.jvc));
        }
        DownloadMainUI downloadMainUI2 = this.f125009d;
        TaskListView taskListView = downloadMainUI2.f110429d;
        C40984c0 c0Var = downloadMainUI2.f110434i;
        String str = downloadMainUI2.f110435j;
        int indexOf = taskListView.f110478C1.f110501d.indexOf((C40990e0) ((HashMap) c0Var.f110321b).get(str));
        if (indexOf < 0 || indexOf >= this.f125009d.f110429d.getSize()) {
            Log.m105920e("MicroMsg.DownloadMainUI", "error position < 0");
            return;
        }
        TaskListView taskListView2 = this.f125009d.f110429d;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(indexOf));
        TaskListView taskListView3 = taskListView2;
        C117292a.m165358d(taskListView3, aVar.mo10232b(), "com/tencent/mm/plugin/downloader_app/ui/DownloadMainUI$8", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        taskListView2.mo17149t1(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(taskListView3, "com/tencent/mm/plugin/downloader_app/ui/DownloadMainUI$8", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
    }
}
