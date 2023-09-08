package x03;

import a13.C16424b;
import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.topstory.p113ui.video.TopStoryBaseVideoUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Set;
import nj3.C76912y0;
import p03.C21915i;
import te3.C64467je0;
import te3.xh4;
import y03.C23204j;

/* renamed from: x03.k */
public class C22958k implements C16424b.C16429e {

    /* renamed from: a */
    public final /* synthetic */ xh4 f65961a;

    /* renamed from: b */
    public final /* synthetic */ int f65962b;

    /* renamed from: c */
    public final /* synthetic */ TopStoryBaseVideoUI f65963c;

    public C22958k(TopStoryBaseVideoUI topStoryBaseVideoUI, xh4 xh4, int i) {
        this.f65963c = topStoryBaseVideoUI;
        this.f65961a = xh4;
        this.f65962b = i;
    }

    /* renamed from: a */
    public void mo14887a(Set<C64467je0> set) {
        Log.m105924i("MicroMsg.TopStory.TopStoryBaseVideoUI", "popupWindow commit");
        C76912y0.makeText((Context) this.f65963c.getContext(), (int) C0966R.string.f361468k42, 0).show();
        TopStoryBaseVideoUI topStoryBaseVideoUI = this.f65963c;
        C21915i.m25169a(topStoryBaseVideoUI.f54608o, this.f65961a, set, topStoryBaseVideoUI.f54588K.mo36194e());
        this.f65963c.f54587J.mo36221m();
        this.f65963c.f54588K.mo36196o(this.f65962b);
        if (this.f65963c.f54588K.mo36194e() == 0) {
            this.f65963c.finish();
            return;
        }
        TopStoryBaseVideoUI topStoryBaseVideoUI2 = this.f65963c;
        if (topStoryBaseVideoUI2.f54597U) {
            C22950e eVar = topStoryBaseVideoUI2.f54615v;
            eVar.notifyItemRemoved(this.f65962b + eVar.mo36133O4());
            this.f65963c.f54611r.notifyDataSetChanged();
            this.f65963c.f54613t.smoothScrollBy(0, 3);
            return;
        }
        C22950e eVar2 = topStoryBaseVideoUI2.f54611r;
        eVar2.notifyItemRemoved(this.f65962b + eVar2.mo36133O4());
        this.f65963c.f54615v.notifyDataSetChanged();
    }

    public void onDismiss() {
        Log.m105924i("MicroMsg.TopStory.TopStoryBaseVideoUI", "popupWindow dismiss");
        TopStoryBaseVideoUI topStoryBaseVideoUI = this.f65963c;
        if (topStoryBaseVideoUI.f54591N) {
            topStoryBaseVideoUI.f54587J.mo36219k();
            TopStoryBaseVideoUI topStoryBaseVideoUI2 = this.f65963c;
            topStoryBaseVideoUI2.f54591N = false;
            if (topStoryBaseVideoUI2.f54597U) {
                try {
                    ((C23204j) topStoryBaseVideoUI2.f54587J.f66029c.getControlBar()).mo36651A();
                } catch (Exception unused) {
                }
            }
        }
    }
}
