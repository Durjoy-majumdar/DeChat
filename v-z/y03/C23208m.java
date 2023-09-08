package y03;

import a13.C16424b;
import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.topstory.p113ui.video.p114fs.TopStoryFSVideoUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Set;
import nj3.C76912y0;
import p03.C21915i;
import te3.C64467je0;
import te3.xh4;

/* renamed from: y03.m */
public class C23208m implements C16424b.C16429e {

    /* renamed from: a */
    public final /* synthetic */ xh4 f66639a;

    /* renamed from: b */
    public final /* synthetic */ int f66640b;

    /* renamed from: c */
    public final /* synthetic */ TopStoryFSVideoUI f66641c;

    public C23208m(TopStoryFSVideoUI topStoryFSVideoUI, xh4 xh4, int i) {
        this.f66641c = topStoryFSVideoUI;
        this.f66639a = xh4;
        this.f66640b = i;
    }

    /* renamed from: a */
    public void mo14887a(Set<C64467je0> set) {
        Log.m105924i("MicroMsg.TopStory.TopStoryFSVideoUI", "popupWindow commit");
        C76912y0.makeText((Context) this.f66641c.getContext(), (int) C0966R.string.f361468k42, 0).show();
        TopStoryFSVideoUI topStoryFSVideoUI = this.f66641c;
        C21915i.m25169a(topStoryFSVideoUI.f54665i, this.f66639a, set, topStoryFSVideoUI.f54652J.mo36194e());
        this.f66641c.f54651I.mo36221m();
        this.f66641c.f54652J.mo36196o(this.f66640b);
        if (this.f66641c.f54652J.mo36194e() == 0) {
            this.f66641c.finish();
            return;
        }
        C23214v vVar = this.f66641c.f54668o;
        vVar.notifyItemRemoved(this.f66640b + vVar.mo36133O4());
        this.f66641c.f54666j.smoothScrollBy(0, 3);
    }

    public void onDismiss() {
        Log.m105924i("MicroMsg.TopStory.TopStoryFSVideoUI", "popupWindow dismiss");
        TopStoryFSVideoUI topStoryFSVideoUI = this.f66641c;
        if (topStoryFSVideoUI.f54658Q) {
            topStoryFSVideoUI.f54651I.mo36219k();
            TopStoryFSVideoUI topStoryFSVideoUI2 = this.f66641c;
            topStoryFSVideoUI2.f54658Q = false;
            try {
                ((C23204j) topStoryFSVideoUI2.f54651I.f66029c.getControlBar()).mo36651A();
            } catch (Exception unused) {
            }
        }
    }
}
