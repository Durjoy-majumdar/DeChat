package q83;

import android.view.View;
import com.tencent.p014mm.plugin.webview.fts.p810ui.FtsWebVideoView;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: q83.a */
public class C101049a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FtsWebVideoView f295841d;

    public C101049a(FtsWebVideoView ftsWebVideoView) {
        this.f295841d = ftsWebVideoView;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f295841d.mo134753h(!this.f295841d.mo134742d());
        C117292a.m165361g(this, "com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
