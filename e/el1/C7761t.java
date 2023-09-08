package el1;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity$$g;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveVisitorWhiteListUI;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import te3.C51946xa1;

/* renamed from: el1.t */
public final class C7761t implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C7765v f26257d;

    /* renamed from: el1.t$a */
    public static final class C7762a implements MMFragmentActivity$$g {

        /* renamed from: a */
        public final /* synthetic */ C7765v f26258a;

        public C7762a(C7765v vVar) {
            this.f26258a = vVar;
        }

        /* renamed from: a */
        public final void mo5702a(int i, Intent intent) {
            byte[] byteArrayExtra;
            if (!(intent == null || (byteArrayExtra = intent.getByteArrayExtra("KEY_PARAMS_WHITE_LIST")) == null)) {
                C7765v vVar = this.f26258a;
                C51946xa1 xa12 = new C51946xa1();
                xa12.parseFrom(byteArrayExtra);
                vVar.mo8851i3(xa12);
            }
            AppCompatActivity activity = this.f26258a.getActivity();
            C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorWhiteListUI");
            FinderLiveVisitorWhiteListUI.C2981a aVar = FinderLiveVisitorWhiteListUI.f14583v;
            ((FinderLiveVisitorWhiteListUI) activity).mo3041P7(false);
        }
    }

    public C7761t(C7765v vVar) {
        this.f26257d = vVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/viewmodel/state/FinderLiveWhiteListUIC$initLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f26257d.mo8848e3().mo7677b(new C7762a(this.f26257d));
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/viewmodel/state/FinderLiveWhiteListUIC$initLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
