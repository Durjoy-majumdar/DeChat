package ul2;

import android.view.View;
import com.tencent.p014mm.plugin.scanner.p101ui.widget.BaseScrollTabView;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import sx3.C110818d0;

/* renamed from: ul2.d */
public final class C111197d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ BaseScrollTabView f333008d;

    /* renamed from: e */
    public final /* synthetic */ int f333009e;

    /* renamed from: f */
    public final /* synthetic */ View f333010f;

    public C111197d(BaseScrollTabView baseScrollTabView, int i, View view) {
        this.f333008d = baseScrollTabView;
        this.f333009e = i;
        this.f333010f = view;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/scanner/ui/widget/BaseScrollTabView$initTabClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        BaseScrollTabView baseScrollTabView = this.f333008d;
        if (!baseScrollTabView.f315953f) {
            Log.m105928w("MicroMsg.BaseScrollTabView", "alvinluo onTabClick not enableSwitchTab");
            C117292a.m165361g(this, "com/tencent/mm/plugin/scanner/ui/widget/BaseScrollTabView$initTabClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        baseScrollTabView.setCanVibrate(true);
        Log.m105925i("MicroMsg.BaseScrollTabView", "alvinluo onTabClick index: %d", Integer.valueOf(this.f333009e));
        C111199e eVar = (C111199e) C110818d0.m150917O(this.f333008d.f315954g, this.f333009e);
        if (eVar != null) {
            eVar.getTabId();
            this.f333008d.getClass();
        }
        this.f333008d.mo151707j(this.f333009e, 1);
        C117292a.m165361g(this, "com/tencent/mm/plugin/scanner/ui/widget/BaseScrollTabView$initTabClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
