package q83;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.webview.fts.p810ui.FtsWebVideoView;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: q83.b */
public class C101050b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FtsWebVideoView f295842d;

    public C101050b(FtsWebVideoView ftsWebVideoView) {
        this.f295842d = ftsWebVideoView;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        FtsWebVideoView ftsWebVideoView = this.f295842d;
        boolean z = !ftsWebVideoView.f282948J;
        ftsWebVideoView.f282948J = z;
        ftsWebVideoView.f282960e.setMute(z);
        if (ftsWebVideoView.f282948J) {
            ftsWebVideoView.f282962g.f282899F.setImageResource(C0966R.C0969drawable.c3l);
        } else {
            ftsWebVideoView.f282962g.f282899F.setImageResource(C0966R.C0969drawable.c3i);
        }
        this.f295842d.f282962g.mo134731z();
        C117292a.m165361g(this, "com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
