package xn2;

import android.view.View;
import com.tencent.p014mm.plugin.sight.decode.p1077ui.VideoPlayView;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: xn2.f */
public class C102701f implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ VideoPlayView f303322d;

    public C102701f(VideoPlayView videoPlayView) {
        this.f303322d = videoPlayView;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sight/decode/ui/VideoPlayView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        VideoPlayView videoPlayView = this.f303322d;
        videoPlayView.f273592s.removeCallbacks(videoPlayView.f273578F);
        VideoPlayView videoPlayView2 = this.f303322d;
        videoPlayView2.f273592s.postDelayed(videoPlayView2.f273578F, 3000);
        if (this.f303322d.f273586j.isPlaying()) {
            this.f303322d.mo130123f(-1);
            C102692b bVar = this.f303322d.f273587n;
            if (bVar != null) {
                bVar.setIsPlay(false);
            }
        } else {
            this.f303322d.mo130125h(false);
            VideoPlayView videoPlayView3 = this.f303322d;
            videoPlayView3.f273586j.mo24788d(videoPlayView3.f273588o);
            C102692b bVar2 = this.f303322d.f273587n;
            if (bVar2 != null) {
                bVar2.setIsPlay(true);
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/sight/decode/ui/VideoPlayView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
