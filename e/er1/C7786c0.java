package er1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import c30.C104289g;
import com.tencent.p014mm.autogen.events.FinderCreateAccountResultEvent;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderCreateAccountStarterActivity;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C60204t3;
import ht1.C60216z4;
import j20.C117292a;
import k20.C9556a;

/* renamed from: er1.c0 */
public final class C7786c0 extends IStaticListener<FinderCreateAccountResultEvent> {

    /* renamed from: d */
    public static final C7787a f26287d = new C7787a((C8480h) null);

    /* renamed from: e */
    public static C60216z4.C8821a<Integer> f26288e;

    /* renamed from: er1.c0$a */
    public static final class C7787a {
        public C7787a(C8480h hVar) {
        }

        /* renamed from: a */
        public final void mo8897a(Context context, C104289g gVar, C60216z4.C8821a<Integer> aVar) {
            String str;
            Activity ub02;
            C87412m.m108594g(context, "context");
            C7786c0.f26288e = aVar;
            if (!(context instanceof Activity) && (ub02 = ((C60204t3) C86312j.m106911c(C60204t3.class)).ub0()) != null) {
                context = ub02;
            }
            Intent intent = new Intent(context, FinderCreateAccountStarterActivity.class);
            if (gVar == null || (str = gVar.toString()) == null) {
                str = "";
            }
            intent.putExtra("param_extra_info", str);
            intent.addFlags(268435456);
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(intent);
            Context context2 = context;
            C117292a.m165358d(context2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/utils/FinderCreateAccountStarter$Companion", "showDialog", "(Landroid/content/Context;Lcom/tencent/mm/json/JSONObject;Lcom/tencent/mm/plugin/findersdk/api/IFinderUtilApi$Callback;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar2.mo10231a(0));
            C117292a.m165359e(context2, "com/tencent/mm/plugin/finder/utils/FinderCreateAccountStarter$Companion", "showDialog", "(Landroid/content/Context;Lcom/tencent/mm/json/JSONObject;Lcom/tencent/mm/plugin/findersdk/api/IFinderUtilApi$Callback;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    public boolean callback(IEvent iEvent) {
        FinderCreateAccountResultEvent finderCreateAccountResultEvent = (FinderCreateAccountResultEvent) iEvent;
        C87412m.m108594g(finderCreateAccountResultEvent, "event");
        StringBuilder sb = new StringBuilder();
        sb.append("createResultEvent callback :");
        FinderCreateAccountResultEvent.C1044a aVar = finderCreateAccountResultEvent.f9191d;
        sb.append(aVar != null ? Integer.valueOf(aVar.f9192a) : null);
        Log.m105924i("Finder.CreateAccountStarter", sb.toString());
        C60216z4.C8821a<Integer> aVar2 = f26288e;
        if (aVar2 == null) {
            return true;
        }
        FinderCreateAccountResultEvent.C1044a aVar3 = finderCreateAccountResultEvent.f9191d;
        aVar2.mo6382a(Integer.valueOf(aVar3 != null ? aVar3.f9192a : 0));
        return true;
    }
}
