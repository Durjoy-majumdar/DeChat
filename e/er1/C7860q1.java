package er1;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import dp1.C7435f2;
import gy3.C87412m;
import jq3.C60905o;
import org.json.JSONObject;
import rs1.C13442s8;
import rx3.C13598b0;
import te3.C49712hj1;
import zp3.C23555k;

/* renamed from: er1.q1 */
public final class C7860q1 extends C23555k.C23562d {

    /* renamed from: a */
    public final /* synthetic */ String f26459a;

    /* renamed from: b */
    public final /* synthetic */ C60905o f26460b;

    public C7860q1(String str, C60905o oVar) {
        this.f26459a = str;
        this.f26460b = oVar;
    }

    /* renamed from: b */
    public void mo53b(View view, long j, long j2, boolean z) {
        C87412m.m108594g(view, "view");
        if (z) {
            Log.m105924i("Finder.FeedFullConvert", "reportOriginExpose exposed " + this.f26459a);
            C7435f2 f2Var = C7435f2.f25626a;
            C13442s8.C13443a aVar = C13442s8.f38060Q0;
            Context context = this.f26460b.f173499A;
            C87412m.m108593f(context, "holder.context");
            C13442s8 f = aVar.mo12873f(context);
            C49712hj1 q3 = f != null ? f.mo12861q3() : null;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("feedid", this.f26459a);
            C13598b0 b0Var = C13598b0.f38549a;
            f2Var.mo8580d(q3, "link_original_author_profile", false, jSONObject);
        }
    }
}
