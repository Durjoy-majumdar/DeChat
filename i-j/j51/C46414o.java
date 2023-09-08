package j51;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.downloader_app.p039ui.ProgressImageView;
import com.tencent.p014mm.plugin.downloader_app.p039ui.TaskItemView;

/* renamed from: j51.o */
public class C46414o implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ TaskItemView f125021d;

    public C46414o(TaskItemView taskItemView) {
        this.f125021d = taskItemView;
    }

    public void run() {
        this.f125021d.f110462i.setVisibility(0);
        this.f125021d.f110464n.setVisibility(8);
        ProgressImageView progressImageView = this.f125021d.f110463j;
        progressImageView.f158315h = true;
        progressImageView.f158316i = false;
        if (C85875k4.m106211z()) {
            progressImageView.setImageResource((int) C0966R.C0969drawable.an_);
        } else {
            progressImageView.setImageResource((int) C0966R.C0969drawable.ana);
        }
    }
}
