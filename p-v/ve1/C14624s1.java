package ve1;

import android.content.Context;
import android.view.View;
import bl3.C39818r;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import dp1.C7435f2;
import er1.C58784w3;
import gy3.C87412m;
import jq3.C60905o;
import org.json.JSONException;
import org.json.JSONObject;
import os1.C62153d;
import pl0.C118116u;
import rs1.C13442s8;
import rx3.C13604l;
import te3.C49712hj1;
import te3.C64311db1;
import zp3.C23555k;

/* renamed from: ve1.s1 */
public final class C14624s1 extends C23555k.C23562d {

    /* renamed from: a */
    public final /* synthetic */ BaseFinderFeed f40463a;

    /* renamed from: b */
    public final /* synthetic */ C60905o f40464b;

    public C14624s1(BaseFinderFeed baseFinderFeed, C60905o oVar) {
        this.f40463a = baseFinderFeed;
        this.f40464b = oVar;
    }

    /* renamed from: b */
    public void mo53b(View view, long j, long j2, boolean z) {
        C87412m.m108594g(view, "view");
        if (z) {
            C58784w3 w3Var = C58784w3.f168295a;
            String str = this.f40463a.mo3513o().getLocation().f182663f;
            boolean z2 = true;
            C49712hj1 hj12 = null;
            if (str == null || str.length() == 0) {
                str = null;
            }
            String str2 = this.f40463a.mo3513o().getLocation().f182664g;
            if (!(str2 == null || str2.length() == 0)) {
                z2 = false;
            }
            if (z2) {
                str2 = null;
            }
            String l0 = w3Var.mo83946l0(str, str2);
            C13604l<Float, Float> X0 = ((C62153d) C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C62153d.class)).mo9104X0();
            FinderObjectDesc finderObjectDesc = this.f40463a.mo3513o().getFeedObject().objectDesc;
            C64311db1 db12 = finderObjectDesc != null ? finderObjectDesc.location : null;
            if (db12 != null) {
                C60905o oVar = this.f40464b;
                BaseFinderFeed baseFinderFeed = this.f40463a;
                double f = C118116u.m166641f((double) ((Number) X0.f38556e).floatValue(), (double) ((Number) X0.f38555d).floatValue(), (double) db12.f182662e, (double) db12.f182661d);
                Context context = oVar.f173499A;
                C87412m.m108593f(context, "holder.context");
                String str3 = baseFinderFeed.mo3513o().getFeedObject().recommendReason;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("poi_name", l0);
                    jSONObject.put("geo_distance", String.valueOf((int) f));
                    if (str3 == null) {
                        str3 = "";
                    }
                    jSONObject.put("content", str3);
                } catch (JSONException unused) {
                }
                C7435f2 f2Var = C7435f2.f25626a;
                C13442s8 f2 = C13442s8.f38060Q0.mo12873f(context);
                if (f2 != null) {
                    hj12 = f2.mo12861q3();
                }
                f2Var.mo8577a(hj12, "poi_top_text", 0, jSONObject);
            }
        }
    }
}
