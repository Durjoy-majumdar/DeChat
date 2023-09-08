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

/* renamed from: el1.q */
public final class C7756q implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C7760s f26253d;

    /* renamed from: el1.q$a */
    public static final class C7757a implements MMFragmentActivity$$g {

        /* renamed from: a */
        public final /* synthetic */ C7760s f26254a;

        public C7757a(C7760s sVar) {
            this.f26254a = sVar;
        }

        /* renamed from: a */
        public final void mo5702a(int i, Intent intent) {
            byte[] byteArrayExtra;
            if (!(intent == null || (byteArrayExtra = intent.getByteArrayExtra("KEY_PARAMS_WHITE_LIST")) == null)) {
                C7760s sVar = this.f26254a;
                C51946xa1 xa12 = new C51946xa1();
                xa12.parseFrom(byteArrayExtra);
                sVar.mo8851i3(xa12);
            }
            AppCompatActivity activity = this.f26254a.getActivity();
            C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorWhiteListUI");
            ((FinderLiveVisitorWhiteListUI) activity).mo3041P7(true);
        }
    }

    public C7756q(C7760s sVar) {
        this.f26253d = sVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/viewmodel/state/FinderLiveRehearsalWhiteListUIC$initLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f26253d.mo8848e3().mo7677b(new C7757a(this.f26253d));
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/viewmodel/state/FinderLiveRehearsalWhiteListUIC$initLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
