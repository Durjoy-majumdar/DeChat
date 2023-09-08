package y03;

import android.view.View;
import com.tencent.p014mm.plugin.topstory.p113ui.video.p114fs.TopStoryFSVideoUI;

/* renamed from: y03.r */
public class C23212r implements View.OnSystemUiVisibilityChangeListener {

    /* renamed from: a */
    public final /* synthetic */ TopStoryFSVideoUI f66645a;

    public C23212r(TopStoryFSVideoUI topStoryFSVideoUI) {
        this.f66645a = topStoryFSVideoUI;
    }

    public void onSystemUiVisibilityChange(int i) {
        TopStoryFSVideoUI topStoryFSVideoUI = this.f66645a;
        int i2 = TopStoryFSVideoUI.f54642T;
        View decorView = topStoryFSVideoUI.getWindow().getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 2 | 4096 | 4);
    }
}
