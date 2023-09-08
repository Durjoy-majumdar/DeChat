package q83;

import android.view.View;
import com.tencent.p014mm.plugin.webview.fts.p810ui.FtsWebVideoView;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: q83.d */
public class C101052d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FtsWebVideoView f295844d;

    public C101052d(FtsWebVideoView ftsWebVideoView) {
        this.f295844d = ftsWebVideoView;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f295844d.f282960e.isPlaying()) {
            MTimerHandler mTimerHandler = this.f295844d.f282962g.f282905L;
            if (mTimerHandler != null) {
                mTimerHandler.stopTimer();
            }
            this.f295844d.mo134754i();
        } else {
            this.f295844d.f282962g.mo134731z();
            this.f295844d.mo134762p(true);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
