package vd3;

import android.view.View;
import com.tencent.p014mm.pluginsdk.p133ui.AbstractVideoView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: vd3.b */
public class C102169b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ AbstractVideoView f300833d;

    public C102169b(AbstractVideoView abstractVideoView) {
        this.f300833d = abstractVideoView;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/pluginsdk/ui/AbstractVideoView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        AbstractVideoView abstractVideoView = this.f300833d;
        Log.m105925i(abstractVideoView.f283586e, "%s seek bar play button on click ", abstractVideoView.mo76634K());
        AbstractVideoView abstractVideoView2 = this.f300833d;
        if (abstractVideoView2.f283595q != null) {
            if (abstractVideoView2.isPlaying()) {
                abstractVideoView2.pause();
            } else if (Util.isNullOrNil(abstractVideoView2.f283595q.getVideoPath())) {
                abstractVideoView2.start();
            } else {
                abstractVideoView2.play();
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/AbstractVideoView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
