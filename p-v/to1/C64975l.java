package to1;

import a14.C0000n0;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiStopRecordVoice;
import com.tencent.p014mm.plugin.finder.record.plugin.FinderTemplateListPlugin;
import com.tencent.p014mm.sdk.platformtools.Log;
import ej3.C45662a;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.record.plugin.FinderRecordControlPlugin$templateRecordFinish$2", mo125469f = "FinderRecordControlPlugin.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: to1.l */
public final class C64975l extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C64963d f187082d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C64975l(C64963d dVar, C15601d<? super C64975l> dVar2) {
        super(2, dVar2);
        this.f187082d = dVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C64975l(this.f187082d, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C64975l) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        View view;
        ResultKt.throwOnFailure(obj);
        C64963d dVar = this.f187082d;
        if (dVar.f187066x) {
            dVar.f187053h.setVisibility(0);
        } else {
            View view2 = dVar.f187060r;
            C87412m.m108593f(view2, "templateCloseBtn");
            C45662a.m50855a(view2, 0.0f, 0, (C32224a) null, 7, (Object) null);
        }
        FinderTemplateListPlugin finderTemplateListPlugin = this.f187082d.f187056n;
        finderTemplateListPlugin.getClass();
        Log.m105924i("MicroMsg.FinderTemplateListPlugin", "stop record, cur selected template idx: " + finderTemplateListPlugin.f160704p);
        finderTemplateListPlugin.f160701j = true;
        RecyclerView.LayoutManager layoutManager = finderTemplateListPlugin.f160698g.getLayoutManager();
        C87412m.m108592e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        int C = linearLayoutManager.mo16957C();
        int E = linearLayoutManager.mo16959E();
        if (C <= E) {
            while (true) {
                RecyclerView.C16631z I0 = finderTemplateListPlugin.f160698g.mo17023I0(C);
                if (!(I0 == null || (view = I0.f44854d) == null)) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/record/plugin/FinderTemplateListPlugin", JsApiStopRecordVoice.NAME, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/finder/record/plugin/FinderTemplateListPlugin", JsApiStopRecordVoice.NAME, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(Float.valueOf(1.0f));
                    C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/record/plugin/FinderTemplateListPlugin", JsApiStopRecordVoice.NAME, "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/finder/record/plugin/FinderTemplateListPlugin", JsApiStopRecordVoice.NAME, "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                }
                if (C == E) {
                    break;
                }
                C++;
            }
        }
        finderTemplateListPlugin.f160698g.requestLayout();
        return C13598b0.f38549a;
    }
}
