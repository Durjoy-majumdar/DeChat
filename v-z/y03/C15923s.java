package y03;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.plugin.topstory.p113ui.video.p114fs.TopStoryFSVideoUI;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C77407n;

/* renamed from: y03.s */
public class C15923s implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ TopStoryFSVideoUI f42792d;

    public C15923s(TopStoryFSVideoUI topStoryFSVideoUI) {
        this.f42792d = topStoryFSVideoUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        TopStoryFSVideoUI topStoryFSVideoUI = this.f42792d;
        int i = TopStoryFSVideoUI.f54642T;
        C77407n nVar = new C77407n((Context) topStoryFSVideoUI.getContext(), 1, false);
        nVar.f225771i = new C15924t(topStoryFSVideoUI);
        nVar.f225782p = new C15921l(topStoryFSVideoUI);
        nVar.mo107573q();
        C117292a.m165361g(this, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
