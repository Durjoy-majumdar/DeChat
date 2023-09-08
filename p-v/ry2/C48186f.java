package ry2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C39622i0;
import az2.C39674e;
import bl3.C39818r;
import com.tencent.p014mm.plugin.textstatus.conversation.p805ui.TextStatusConversationFragment;
import com.tencent.p014mm.plugin.textstatus.conversation.p805ui.TextStatusGreetingActivity;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.xweb.IXWebBroadcastListener;
import fy3.C32228q;
import gy3.C87412m;
import j20.C117292a;
import k20.C9556a;
import p739wi.C78597c;
import p739wi.C78601d;
import rx3.C13598b0;
import rz2.C48203e;
import su0.C13781a;
import uy2.C52657a;
import uy2.C52665g;
import vy2.C53042b;
import vz2.C78501d;
import yj3.C79123a;
import yy2.C53659b;
import yz2.C53700n2;

/* renamed from: ry2.f */
public final class C48186f implements C32228q<View, Integer, C52657a, C13598b0> {

    /* renamed from: d */
    public final TextStatusConversationFragment f129147d;

    public C48186f(TextStatusConversationFragment textStatusConversationFragment) {
        C87412m.m108594g(textStatusConversationFragment, "fragment");
        this.f129147d = textStatusConversationFragment;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        View view = (View) obj;
        ((Number) obj2).intValue();
        C52657a aVar = (C52657a) obj3;
        C87412m.m108594g(view, "view");
        C87412m.m108594g(aVar, "item");
        if (C53042b.m59369a(aVar)) {
            int i = TextStatusGreetingActivity.f116873e;
            Context context = view.getContext();
            C87412m.m108593f(context, "view.context");
            Intent intent = new Intent(context, TextStatusGreetingActivity.class);
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(intent);
            Context context2 = context;
            C117292a.m165358d(context2, aVar2.mo10232b(), "com/tencent/mm/plugin/textstatus/conversation/ui/TextStatusGreetingActivity$Companion", IXWebBroadcastListener.STAGE_START, "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar2.mo10231a(0));
            C117292a.m165359e(context2, "com/tencent/mm/plugin/textstatus/conversation/ui/TextStatusGreetingActivity$Companion", IXWebBroadcastListener.STAGE_START, "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C39674e eVar = C39674e.f106452d;
            C53659b O = eVar.mo62243O();
            ISQLiteDatabase iSQLiteDatabase = O.f150725d;
            String[] strArr = C48203e.f129183e;
            iSQLiteDatabase.execSQL("TextStatusLike", "update TextStatusGreetingItem set Read = 1 where Read != 1");
            O.doNotify(C53659b.f150724f, 6, (Object) null);
            FragmentActivity activity = this.f129147d.getActivity();
            if (activity != null) {
                eVar.mo62241N0();
                C39818r rVar = C39818r.f106831a;
                ((C53700n2) rVar.mo62443b(activity).mo75002a(C53700n2.class)).mo74293i3(1);
                C39622i0 a = rVar.mo62443b(activity).mo75002a(C52665g.class);
                C87412m.m108593f(a, "UICProvider.of(context).…tusReportUIC::class.java)");
                C52665g gVar = (C52665g) a;
                C78501d.m94808j(C78501d.f229945a, (long) 51, (String) null, C52665g.f147056g, 0, (String) null, 0, 0, 0, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 16378, (Object) null);
            }
        } else {
            view.setSelected(true);
            String a2 = C13781a.m13082a();
            C78601d dVar = this.f129147d.f108298t;
            if (dVar != null) {
                C78597c cVar = dVar.f230225d;
                if (cVar != null) {
                    ((C79123a) cVar).mo109074k(aVar.field_sessionId, a2, (Bundle) null, new C48185e(aVar, this, view));
                }
            } else {
                C87412m.m108603p("readyChattingUIC");
                throw null;
            }
        }
        return C13598b0.f38549a;
    }
}
