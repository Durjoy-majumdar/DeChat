package p165hr;

import ak1.C54108o;
import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import er1.C58739j4;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import ht1.C8777j5;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import ls3.C61397g;
import o40.C61926c;
import org.json.JSONObject;
import p172io.flutter.embedding.android.PatchedFlutterActivity;
import rx3.C13598b0;
import rx3.C13605o;
import te3.C51713vn0;
import te3.C64273c21;
import tf0.C64916p1;
import z04.C112551y;

/* renamed from: hr.u */
public final class C60128u extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C60106t f171627d;

    /* renamed from: e */
    public final /* synthetic */ FinderObject f171628e;

    /* renamed from: f */
    public final /* synthetic */ int f171629f;

    /* renamed from: g */
    public final /* synthetic */ String f171630g;

    /* renamed from: h */
    public final /* synthetic */ Context f171631h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60128u(C60106t tVar, FinderObject finderObject, int i, String str, Context context) {
        super(0);
        this.f171627d = tVar;
        this.f171628e = finderObject;
        this.f171629f = i;
        this.f171630g = str;
        this.f171631h = context;
    }

    public Object invoke() {
        FinderObjectDesc finderObjectDesc;
        String str;
        String str2;
        String str3;
        C64273c21 c212;
        Class cls = C60200t1.class;
        C60106t tVar = this.f171627d;
        FinderObject finderObject = this.f171628e;
        C64273c21 c213 = finderObject != null ? finderObject.liveInfo : null;
        tVar.getClass();
        long j = 0;
        long j2 = c213 != null ? c213.f182392d : 0;
        if (c213 == null || tVar.f171510g.get(Long.valueOf(j2)) != null) {
            Log.m105920e("MicroMsg.FinderLiveFeatureService", "saveLiveInfo fail,liveId:" + j2 + ",forceReplace:" + false + '!');
        } else {
            Log.m105924i("MicroMsg.FinderLiveFeatureService", "saveLiveInfo liveId:" + j2 + ",forceReplace:" + false + '!');
            ConcurrentHashMap<Long, C13605o<Integer, Long, C51713vn0>> concurrentHashMap = tVar.f171510g;
            Long valueOf = Long.valueOf(j2);
            Integer valueOf2 = Integer.valueOf(c213.f182394f);
            Long valueOf3 = Long.valueOf(System.currentTimeMillis());
            C51713vn0 vn02 = new C51713vn0();
            vn02.f143572d = c213;
            C13598b0 b0Var = C13598b0.f38549a;
            concurrentHashMap.put(valueOf, new C13605o(valueOf2, valueOf3, vn02));
        }
        int i = this.f171629f;
        int i2 = C58739j4.f168176a.mo83685N(this.f171630g) ? 4 : 15;
        String uuid = UUID.randomUUID().toString();
        C87412m.m108593f(uuid, "randomUUID().toString()");
        String str4 = "";
        String str5 = i + '-' + i2 + '-' + 65 + '-' + C112551y.m153814n(uuid, "-", str4, false);
        ((C54108o) C86312j.m106911c(C54108o.class)).cy0(this.f171630g);
        FinderObject finderObject2 = this.f171628e;
        long j3 = finderObject2 != null ? finderObject2.f164794id : 0;
        String valueOf4 = String.valueOf(this.f171629f);
        C60106t tVar2 = this.f171627d;
        FinderObject finderObject3 = this.f171628e;
        int i3 = tVar2.Sj0(finderObject3 != null ? finderObject3.liveInfo : null) ? 1 : 2;
        C87412m.m108594g(valueOf4, "pageType");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("object_id", C61926c.m72691p(j3));
        jSONObject.put(PatchedFlutterActivity.EXTRA_PAGE_TYPE, valueOf4);
        jSONObject.put("object_type", i3);
        jSONObject.put("page_sub_type", 0);
        String jSONObject2 = jSONObject.toString();
        C87412m.m108593f(jSONObject2, "this.toString()");
        ((C8777j5) C86312j.m106911c(C8777j5.class)).hg0("watch_live_record", jSONObject2);
        C61397g gVar = (C61397g) C86312j.m106911c(C61397g.class);
        Intent T5 = ((C60200t1) C86312j.m106911c(cls)).mo76861l7().mo83773T5((Intent) null, String.valueOf(this.f171629f), 0);
        Context context = this.f171631h;
        FinderObject finderObject4 = this.f171628e;
        long j4 = finderObject4 != null ? finderObject4.f164794id : 0;
        if (!(finderObject4 == null || (c212 = finderObject4.liveInfo) == null)) {
            j = c212.f182392d;
        }
        long j5 = j;
        String str6 = (finderObject4 == null || (str3 = finderObject4.username) == null) ? str4 : str3;
        String str7 = (finderObject4 == null || (str2 = finderObject4.objectNonceId) == null) ? str4 : str2;
        C64916p1 p1Var = (C64916p1) C86312j.m106911c(C64916p1.class);
        FinderObject finderObject5 = this.f171628e;
        if (!(finderObject5 == null || (finderObjectDesc = finderObject5.objectDesc) == null || (str = finderObjectDesc.description) == null)) {
            str4 = str;
        }
        gVar.mo83482aR(T5, context, j4, j5, str6, str7, p1Var.du0(str4), str5, ((C60200t1) C86312j.m106911c(cls)).mo76861l7().mo83771R5());
        return C13598b0.f38549a;
    }
}
