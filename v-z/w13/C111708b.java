package w13;

import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.mmdata.rpt.EffectRenderReportStruct;
import com.tencent.p014mm.plugin.vlog.model.C106209x0;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import ei3.C86522b;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import vp3.C111599l;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: w13.b */
public final class C111708b extends C86301e {

    /* renamed from: d */
    public final String f334384d = "MicroMsg.PluginVLog";

    /* renamed from: w13.b$a */
    public static final class C111709a extends C87413o implements C32226l<C111599l, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C111708b f334385d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111709a(C111708b bVar) {
            super(1);
            this.f334385d = bVar;
        }

        public Object invoke(Object obj) {
            C111599l lVar = (C111599l) obj;
            C87412m.m108594g(lVar, LocaleUtil.ITALIAN);
            String str = this.f334385d.f334384d;
            StringBuilder sb = new StringBuilder();
            sb.append("report : ");
            sb.append(lVar.f334061a);
            sb.append(", ");
            sb.append(lVar.f334062b);
            sb.append(", ");
            sb.append(lVar.f334065e);
            sb.append(", ");
            int i = lVar.f334068h;
            long j = 0;
            sb.append(i <= 0 ? 0 : lVar.f334067g / ((long) i));
            Log.m105924i(str, sb.toString());
            EffectRenderReportStruct effectRenderReportStruct = new EffectRenderReportStruct();
            effectRenderReportStruct.f310158d = lVar.f334062b;
            effectRenderReportStruct.f310159e = lVar.f334061a;
            effectRenderReportStruct.f310160f = lVar.f334065e;
            int i2 = lVar.f334068h;
            if (i2 > 0) {
                j = lVar.f334067g / ((long) i2);
            }
            effectRenderReportStruct.f310161g = j;
            effectRenderReportStruct.f310162h = lVar.f334069i ? 1 : 0;
            effectRenderReportStruct.f310163i = lVar.f334070j ? 1 : 0;
            effectRenderReportStruct.f310164j = lVar.f334071k ? 1 : 0;
            effectRenderReportStruct.mo86054n();
            return C13598b0.f38549a;
        }
    }

    public void onCreate(Context context) {
        C87412m.m108594g(context, "context");
        super.onCreate(context);
        C111599l.f334060l = new C111709a(this);
        int i = C106209x0.f316507a;
    }
}
