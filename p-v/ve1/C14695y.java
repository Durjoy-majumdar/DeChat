package ve1;

import cm1.C55034v;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.protocal.protobuf.NativeInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import ht1.C8794p5;
import jq3.C60905o;
import o40.C61926c;
import org.json.JSONException;
import org.json.JSONObject;
import te3.C50542nh0;
import te3.C51954xc1;

/* renamed from: ve1.y */
public final class C14695y implements C8794p5<C51954xc1> {

    /* renamed from: d */
    public final /* synthetic */ boolean f40638d;

    /* renamed from: e */
    public final /* synthetic */ FinderJumpInfo f40639e;

    /* renamed from: f */
    public final /* synthetic */ C14680x f40640f;

    /* renamed from: g */
    public final /* synthetic */ C60905o f40641g;

    /* renamed from: h */
    public final /* synthetic */ C55034v f40642h;

    public C14695y(boolean z, FinderJumpInfo finderJumpInfo, C14680x xVar, C60905o oVar, C55034v vVar) {
        this.f40638d = z;
        this.f40639e = finderJumpInfo;
        this.f40640f = xVar;
        this.f40641g = oVar;
        this.f40642h = vVar;
    }

    /* renamed from: c5 */
    public void mo705c5(Object obj, C50542nh0 nh02) {
        String str;
        NativeInfo nativeInfo;
        C51954xc1 xc12 = (C51954xc1) obj;
        C87412m.m108594g(xc12, "req");
        C87412m.m108594g(nh02, "ret");
        Log.m105924i("Finder.FeedCommentHeaderConvert", "feedId:" + C61926c.m72691p(xc12.f144586d) + ", scene:" + xc12.f144587e + ", optype:" + xc12.f144588f);
        if (nh02.f138603e == 0) {
            boolean z = !this.f40638d;
            FinderJumpInfo finderJumpInfo = this.f40639e;
            if (finderJumpInfo == null || (nativeInfo = finderJumpInfo.native_info) == null || (str = nativeInfo.necessary_params) == null) {
                str = "";
            }
            Log.m105924i("FinderMusicTopicUtils", "[updateOpParams] hideFlag:" + (z ? 1 : 0) + ", necessaryParams:" + str);
            try {
                JSONObject jSONObject = new JSONObject(str);
                jSONObject.put("hide_flag", z);
                NativeInfo nativeInfo2 = finderJumpInfo != null ? finderJumpInfo.native_info : null;
                if (nativeInfo2 != null) {
                    nativeInfo2.necessary_params = jSONObject.toString();
                }
            } catch (JSONException unused) {
            }
            this.f40640f.mo13868p(this.f40641g, this.f40642h.f154508w, true);
        }
    }
}
