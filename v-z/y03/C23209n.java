package y03;

import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.plugin.topstory.p113ui.video.p114fs.TopStoryFSVideoUI;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: y03.n */
public class C23209n implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ TopStoryFSVideoUI f66642d;

    public C23209n(TopStoryFSVideoUI topStoryFSVideoUI) {
        this.f66642d = topStoryFSVideoUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        TopStoryFSVideoUI topStoryFSVideoUI = this.f66642d;
        topStoryFSVideoUI.f54649G.mo36203a();
        Intent intent = new Intent();
        intent.putExtra("key_video_play_info", Util.listToString(topStoryFSVideoUI.f54649G.f66026g, ";"));
        intent.putExtra("key_search_id", topStoryFSVideoUI.f54665i.f64643j);
        topStoryFSVideoUI.setResult(-1, intent);
        if (!topStoryFSVideoUI.f54679z.mo67896U(2, false)) {
            topStoryFSVideoUI.finish();
        }
        if (!topStoryFSVideoUI.f54678y.mo64004y0(2)) {
            topStoryFSVideoUI.finish();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
