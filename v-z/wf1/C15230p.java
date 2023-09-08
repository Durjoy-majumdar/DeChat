package wf1;

import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.view.recyclerview.MaxHeightWxRecyclerView;
import dj1.C7341l;
import gy3.C87412m;
import kg3.C76577a;
import nr3.C89059e;
import o40.C61926c;
import rx3.C36570n;
import zc1.C66785b;

/* renamed from: wf1.p */
public final class C15230p implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C15193l f41449d;

    public C15230p(C15193l lVar) {
        this.f41449d = lVar;
    }

    public final void run() {
        TextView textView = (TextView) ((C36570n) this.f41449d.f41385h).getValue();
        C87412m.m108593f(textView, "giftTotalPrice");
        int i = C61926c.m72690o(textView)[1];
        MaxHeightWxRecyclerView i3 = this.f41449d.mo14132i3();
        C87412m.m108593f(i3, "giftRv");
        this.f41449d.mo14132i3().setMaxHeight((i - C76577a.m92157h(this.f41449d.getContext(), C0966R.dimen.f3738cr)) - C61926c.m72690o(i3)[1]);
        this.f41449d.mo14132i3().invalidate();
        C15193l lVar = this.f41449d;
        lVar.getClass();
        C89059e i2 = new C7341l(C15193l.f41365R, C15193l.f41364Q, C15193l.f41367T, C66785b.f191882e.mo90662O5(), 0, C15193l.f41363P, C15193l.f41366S, 1).mo9225i();
        i2.mo123420E(new C15178f0(lVar));
        if (lVar.getActivity() != null && (lVar.getActivity() instanceof MMActivity)) {
            AppCompatActivity activity = lVar.getActivity();
            C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            i2.mo11397F((MMActivity) activity);
        }
    }
}
