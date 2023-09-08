package y03;

import android.media.AudioManager;
import android.view.View;
import com.tencent.p014mm.plugin.topstory.p113ui.video.p114fs.TopStoryFSVideoUI;
import j20.C117292a;
import java.util.ArrayList;
import p331dj.C107043a;
import te3.uh4;

/* renamed from: y03.o */
public class C23210o implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ TopStoryFSVideoUI f66643d;

    public C23210o(TopStoryFSVideoUI topStoryFSVideoUI) {
        this.f66643d = topStoryFSVideoUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        TopStoryFSVideoUI topStoryFSVideoUI = this.f66643d;
        uh4 uh4 = topStoryFSVideoUI.f54665i;
        if (uh4.f64654x) {
            uh4.f64654x = false;
            if (topStoryFSVideoUI.mo25010I7() == 0) {
                C107043a.m144905c((AudioManager) topStoryFSVideoUI.getContext().getSystemService("audio"), 3, 1, 0);
            }
        } else {
            uh4.f64654x = true;
        }
        topStoryFSVideoUI.mo25013L7();
        topStoryFSVideoUI.mo24943A();
        topStoryFSVideoUI.mo24974Y();
        C117292a.m165361g(this, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
