package el1;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLivePostSelectContactUI;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveVisitorWhiteListUI;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import te3.C51946xa1;

/* renamed from: el1.j */
public final class C7749j implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C7741d f26245d;

    public C7749j(C7741d dVar) {
        this.f26245d = dVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/viewmodel/state/FinderLiveChargeWhiteListUIC$initLayout$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C7741d dVar = this.f26245d;
        dVar.getClass();
        Intent intent = new Intent(dVar.getActivity(), FinderLivePostSelectContactUI.class);
        intent.putExtra("KEY_PARAMS_MAX_USER_COUNT", dVar.getIntent().getIntExtra("KEY_PARAMS_MAX_USER_COUNT", 0));
        C51946xa1 xa12 = dVar.f26214A.f140582f;
        if (xa12 != null) {
            intent.putExtra("KEY_PARAMS_WHITE_LIST", xa12.toByteArray());
        }
        AppCompatActivity activity = dVar.getActivity();
        C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorWhiteListUI");
        ((FinderLiveVisitorWhiteListUI) activity).startActivityForResult(intent).mo7677b(new C7744e(dVar));
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/viewmodel/state/FinderLiveChargeWhiteListUIC$initLayout$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
