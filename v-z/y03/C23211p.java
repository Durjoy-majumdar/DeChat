package y03;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.topstory.p113ui.video.p114fs.TopStoryFSVideoUI;

/* renamed from: y03.p */
public class C23211p implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ TopStoryFSVideoUI f66644d;

    public C23211p(TopStoryFSVideoUI topStoryFSVideoUI) {
        this.f66644d = topStoryFSVideoUI;
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.f66644d.finish();
    }
}
