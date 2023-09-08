package pn0;

import android.view.View;
import com.tencent.p014mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoView;
import com.tencent.p014mm.plugin.appbrand.jsapi.video.videoview.BaseVideoView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: pn0.d */
public class C22000d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ AbstractVideoView f62256d;

    public C22000d(AbstractVideoView abstractVideoView) {
        this.f62256d = abstractVideoView;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/jsapi/video/videoview/AbstractVideoView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105925i("MicroMsg.Video.AbstractVideoView", "%s seek bar play button on click ", this.f62256d.mo22453k());
        AbstractVideoView abstractVideoView = this.f62256d;
        if (abstractVideoView.f49704o != null) {
            if (abstractVideoView.isPlaying()) {
                abstractVideoView.pause();
            } else if (Util.isNullOrNil(abstractVideoView.f49704o.getVideoPath())) {
                ((BaseVideoView) abstractVideoView).start();
            } else {
                abstractVideoView.play();
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/jsapi/video/videoview/AbstractVideoView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
