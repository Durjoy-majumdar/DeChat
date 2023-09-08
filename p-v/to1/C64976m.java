package to1;

import a14.C0000n0;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.finder.record.plugin.FinderTemplateListPlugin;
import com.tencent.p014mm.sdk.platformtools.Log;
import ej3.C45662a;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.record.plugin.FinderRecordControlPlugin$templateRecordStart$2", mo125469f = "FinderRecordControlPlugin.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: to1.m */
public final class C64976m extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C64963d f187083d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C64976m(C64963d dVar, C15601d<? super C64976m> dVar2) {
        super(2, dVar2);
        this.f187083d = dVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C64976m(this.f187083d, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C64976m) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        View view;
        ResultKt.throwOnFailure(obj);
        View view2 = this.f187083d.f187060r;
        C87412m.m108593f(view2, "templateCloseBtn");
        C45662a.m50856b(view2, 0, 0, (C32224a) null, 7, (Object) null);
        FinderTemplateListPlugin finderTemplateListPlugin = this.f187083d.f187056n;
        finderTemplateListPlugin.getClass();
        Log.m105924i("MicroMsg.FinderTemplateListPlugin", "start record, cur selected template idx: " + finderTemplateListPlugin.f160704p);
        finderTemplateListPlugin.f160701j = false;
        RecyclerView.LayoutManager layoutManager = finderTemplateListPlugin.f160698g.getLayoutManager();
        C87412m.m108592e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        int C = linearLayoutManager.mo16957C();
        int E = linearLayoutManager.mo16959E();
        if (C <= E) {
            while (true) {
                if (C != finderTemplateListPlugin.f160704p) {
                    Log.m105924i("MicroMsg.FinderTemplateListPlugin", "startRecord fadeOut view index:" + C);
                    RecyclerView.C16631z I0 = finderTemplateListPlugin.f160698g.mo17023I0(C);
                    if (!(I0 == null || (view = I0.f44854d) == null)) {
                        C45662a.m50856b(view, 0, 0, (C32224a) null, 7, (Object) null);
                    }
                }
                if (C == E) {
                    break;
                }
                C++;
            }
        }
        return C13598b0.f38549a;
    }
}
