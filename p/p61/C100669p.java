package p61;

import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import gy3.C87412m;
import java.util.List;

/* renamed from: p61.p */
public final class C100669p extends C100657j<C100682w> {

    /* renamed from: B */
    public final TextView f294938B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100669p(View view, C100640a0 a0Var) {
        super(view, a0Var);
        C87412m.m108594g(view, "itemView");
        View findViewById = view.findViewById(C0966R.C0970id.ci_);
        C87412m.m108593f(findViewById, "itemView.findViewById(R.id.emoji_title)");
        this.f294938B = (TextView) findViewById;
    }

    /* renamed from: y */
    public void mo140091y(C100684y yVar, List<Object> list) {
        C87412m.m108594g(yVar, "item");
        C87412m.m108594g(list, "payloads");
        this.f294874A = yVar;
        String str = null;
        C100682w wVar = yVar instanceof C100682w ? (C100682w) yVar : null;
        TextView textView = this.f294938B;
        if (wVar != null) {
            str = wVar.f294994a;
        }
        textView.setText(str);
        C85875k4.m106191k0(this.f294938B.getPaint());
    }
}
