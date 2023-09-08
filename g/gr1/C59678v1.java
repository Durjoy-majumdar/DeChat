package gr1;

import android.view.View;
import com.tencent.p014mm.plugin.finder.video.FinderVideoLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import qt1.C12931a;

/* renamed from: gr1.v1 */
public final class C59678v1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderVideoLayout f170500d;

    public C59678v1(FinderVideoLayout finderVideoLayout) {
        this.f170500d = finderVideoLayout;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/video/FinderVideoLayout$retryBtn$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        String fTPPTag = this.f170500d.getFTPPTag();
        Log.m105924i(fTPPTag, "retry video, position:" + this.f170500d.getPlayAdapterPosition());
        FinderVideoLayout.C56521b playInfo = this.f170500d.getPlayInfo();
        boolean z = true;
        if (playInfo == null || !playInfo.f161898g) {
            z = false;
        }
        if (z) {
            C59670o2 videoView = this.f170500d.getVideoView();
            if (videoView != null) {
                videoView.stop();
            }
            FinderVideoLayout finderVideoLayout = this.f170500d;
            FinderVideoLayout.m65078D(finderVideoLayout, finderVideoLayout.getPlayAdapterPosition(), (C12931a) null, 2, (Object) null);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/video/FinderVideoLayout$retryBtn$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
