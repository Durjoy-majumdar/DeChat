package j51;

import com.tencent.p014mm.plugin.downloader_app.p039ui.ProgressImageView;
import com.tencent.p014mm.plugin.downloader_app.p039ui.TaskItemView;

/* renamed from: j51.p */
public class C46415p implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ TaskItemView f125022d;

    public C46415p(TaskItemView taskItemView) {
        this.f125022d = taskItemView;
    }

    public void run() {
        this.f125022d.f110462i.setVisibility(0);
        this.f125022d.f110464n.setVisibility(8);
        ProgressImageView progressImageView = this.f125022d.f110463j;
        progressImageView.f158316i = true;
        progressImageView.f158315h = false;
        progressImageView.setImageResource("download_wait_wifi");
    }
}
