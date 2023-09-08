package ve1;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import bl3.C39818r;
import com.tencent.p014mm.p136ui.MMActivity;
import di3.C86312j;
import dp1.C58417y0;
import eb0.C31543z5;
import f40.C86709a0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Vector;
import je1.C46510b3;
import jq3.C60905o;
import p749xh.C66276va;
import rs1.C13442s8;
import wp1.C53194i;

/* renamed from: ve1.o5 */
public final class C52819o5 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C66276va f147564d;

    /* renamed from: e */
    public final /* synthetic */ C65634p5 f147565e;

    /* renamed from: f */
    public final /* synthetic */ TextView f147566f;

    /* renamed from: g */
    public final /* synthetic */ C60905o f147567g;

    public C52819o5(C66276va vaVar, C65634p5 p5Var, TextView textView, C60905o oVar) {
        this.f147564d = vaVar;
        this.f147565e = p5Var;
        this.f147566f = textView;
        this.f147567g = oVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderMsgFollowApplyConvert$setAccept$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        String str = this.f147564d.field_username;
        C87412m.m108593f(str, "mention.field_username");
        ((C58417y0) C86312j.m106911c(C58417y0.class)).uy0(str, 1, C31543z5.m39455e());
        this.f147565e.mo89711l(this.f147566f, this.f147567g);
        Vector<Long> vector = C53194i.f148390a;
        C66276va vaVar = this.f147564d;
        C87412m.m108594g(vaVar, "mention");
        C53194i.f148390a.add(Long.valueOf(vaVar.field_id));
        C39818r rVar = C39818r.f106831a;
        Context context = this.f147567g.f173499A;
        C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        C86709a0.m107524d().mo123460f(new C46510b3(this.f147564d, 1, ((C13442s8) rVar.mo62444c((MMActivity) context).mo75002a(C13442s8.class)).mo12861q3(), this.f147565e.f188854g));
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderMsgFollowApplyConvert$setAccept$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
