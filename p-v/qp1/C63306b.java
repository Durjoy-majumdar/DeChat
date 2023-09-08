package qp1;

import ak1.C54108o;
import android.app.Activity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.shopping.presenter.FinderLiveShoppingManagerPresenter;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import di3.C86312j;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import nj3.C76912y0;
import o40.C61926c;
import ob0.C89132b;
import org.json.JSONObject;
import qo3.C89779i0;
import rx3.C13598b0;
import te3.C49255ea1;
import z04.C112551y;

/* renamed from: qp1.b */
public final class C63306b extends C87413o implements C32226l<C89132b.C89134c<C49255ea1>, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C89779i0 f179631d;

    /* renamed from: e */
    public final /* synthetic */ FinderLiveShoppingManagerPresenter f179632e;

    /* renamed from: f */
    public final /* synthetic */ long f179633f;

    /* renamed from: g */
    public final /* synthetic */ String f179634g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63306b(C89779i0 i0Var, FinderLiveShoppingManagerPresenter finderLiveShoppingManagerPresenter, long j, String str) {
        super(1);
        this.f179631d = i0Var;
        this.f179632e = finderLiveShoppingManagerPresenter;
        this.f179633f = j;
        this.f179634g = str;
    }

    public Object invoke(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        this.f179631d.dismiss();
        boolean z = true;
        String str = null;
        if (cVar != null && cVar.f256793a == 0) {
            if (cVar != null && cVar.f256794b == 0) {
                C63313h hVar = this.f179632e.f160923e;
                if (hVar == null) {
                    return null;
                }
                long j = this.f179633f;
                String str2 = this.f179634g;
                C87412m.m108594g(str2, "wording");
                C61926c.m72668M(new C63312g(hVar, j, str2));
                return C13598b0.f38549a;
            }
        }
        Activity activity = this.f179632e.f160919a;
        String str3 = cVar != null ? cVar.f256795c : null;
        if (!(str3 == null || str3.length() == 0)) {
            if (cVar != null) {
                str = cVar.f256795c;
            }
            C87412m.m108591d(str);
        } else {
            if (cVar == null || cVar.f256794b != -200167) {
                z = false;
            }
            if (z) {
                JSONObject jSONObject = new JSONObject();
                long j2 = this.f179633f;
                String str4 = this.f179634g;
                jSONObject.put("type", "8");
                jSONObject.put("product", C61926c.m72691p(j2));
                jSONObject.put(FFmpegMetadataRetriever.METADATA_KEY_COMMENT, str4);
                String jSONObject2 = jSONObject.toString();
                C87412m.m108593f(jSONObject2, "this.toString()");
                ((C54108o) C86312j.m106911c(C54108o.class)).Yx0(C112551y.m153814n(jSONObject2, ",", ";", false));
                str = this.f179632e.f160919a.getString(C0966R.string.lqz);
                C87412m.m108593f(str, "{\n                      …                        }");
            } else {
                str = this.f179632e.f160919a.getString(C0966R.string.f360695lr0);
                C87412m.m108593f(str, "{\n                      …                        }");
            }
        }
        C76912y0.m92767f(activity, str);
        return C13598b0.f38549a;
    }
}
