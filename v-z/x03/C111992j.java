package x03;

import android.view.MenuItem;
import com.tencent.p014mm.plugin.topstory.p113ui.video.TopStoryBaseVideoUI;
import nj3.C11184p0;
import v03.C22713a;

/* renamed from: x03.j */
public class C111992j implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ TopStoryBaseVideoUI f335249d;

    public C111992j(TopStoryBaseVideoUI topStoryBaseVideoUI) {
        this.f335249d = topStoryBaseVideoUI;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        C22713a aVar;
        if (menuItem.getItemId() == 2 && (aVar = this.f335249d.f54617x) != null) {
            aVar.mo124068H(true, 1);
        }
    }
}
