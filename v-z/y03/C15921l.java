package y03;

import android.view.MenuItem;
import com.tencent.p014mm.plugin.topstory.p113ui.video.p114fs.TopStoryFSVideoUI;
import nj3.C11184p0;
import v03.C22713a;

/* renamed from: y03.l */
public class C15921l implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ TopStoryFSVideoUI f42790d;

    public C15921l(TopStoryFSVideoUI topStoryFSVideoUI) {
        this.f42790d = topStoryFSVideoUI;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        C22713a aVar;
        if (menuItem.getItemId() == 2 && (aVar = this.f42790d.f54679z) != null) {
            aVar.mo124068H(true, 1);
        }
    }
}
