package wf1;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import cl1.C0690t1;
import com.tencent.neattextview.textview.view.NeatTextView;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity$$g;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveVisitorWhiteListUI;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: wf1.e */
public final class C15174e implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C15162a f41323d;

    /* renamed from: e */
    public final /* synthetic */ C0690t1 f41324e;

    /* renamed from: f */
    public final /* synthetic */ NeatTextView f41325f;

    /* renamed from: wf1.e$a */
    public static final class C15175a implements MMFragmentActivity$$g {

        /* renamed from: a */
        public final /* synthetic */ C0690t1 f41326a;

        /* renamed from: b */
        public final /* synthetic */ NeatTextView f41327b;

        public C15175a(C0690t1 t1Var, NeatTextView neatTextView) {
            this.f41326a = t1Var;
            this.f41327b = neatTextView;
        }

        /* renamed from: a */
        public final void mo5702a(int i, Intent intent) {
            if (i == -1) {
                this.f41326a.mo654g3(intent);
                C15162a.f41297g.mo14114a(this.f41326a, this.f41327b);
            }
        }
    }

    public C15174e(C15162a aVar, C0690t1 t1Var, NeatTextView neatTextView) {
        this.f41323d = aVar;
        this.f41324e = t1Var;
        this.f41325f = neatTextView;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/uic/ChatRoomCustomUIC$beforeGotoLive$2$1$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Intent intent = new Intent();
        intent.putExtra("KEY_PARAMS_FIRST_ENTER_WHITE_LIST", this.f41323d.f41299e);
        C15162a aVar = this.f41323d;
        boolean z = aVar.f41299e;
        if (z) {
            aVar.f41299e = !z;
        }
        this.f41324e.mo652e3(intent);
        intent.setClass(this.f41323d.getContext(), FinderLiveVisitorWhiteListUI.class);
        AppCompatActivity activity = this.f41323d.getActivity();
        C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
        ((MMFragmentActivity) activity).startActivityForResult(intent).mo7677b(new C15175a(this.f41324e, this.f41325f));
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/uic/ChatRoomCustomUIC$beforeGotoLive$2$1$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
