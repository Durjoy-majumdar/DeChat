package eg1;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ls3.C10649f;
import ob0.C89132b;
import p565ir.C60606n;
import rx3.C13598b0;
import sx3.C26236u;
import te3.C50851pn0;
import te3.C64273c21;
import te3.C64279c90;
import te3.C64686ro2;
import zc1.C66785b;

/* renamed from: eg1.i */
public final class C58579i extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderObject f167698d;

    /* renamed from: e */
    public final /* synthetic */ C58572h f167699e;

    /* renamed from: f */
    public final /* synthetic */ Intent f167700f;

    /* renamed from: g */
    public final /* synthetic */ Context f167701g;

    /* renamed from: h */
    public final /* synthetic */ C64279c90 f167702h;

    /* renamed from: i */
    public final /* synthetic */ Intent f167703i;

    /* renamed from: j */
    public final /* synthetic */ C10649f.C10650a f167704j;

    /* renamed from: n */
    public final /* synthetic */ C89132b.C89134c<C50851pn0> f167705n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58579i(FinderObject finderObject, C58572h hVar, Intent intent, Context context, C64279c90 c902, Intent intent2, C10649f.C10650a aVar, C89132b.C89134c<C50851pn0> cVar) {
        super(0);
        this.f167698d = finderObject;
        this.f167699e = hVar;
        this.f167700f = intent;
        this.f167701g = context;
        this.f167702h = c902;
        this.f167703i = intent2;
        this.f167704j = aVar;
        this.f167705n = cVar;
    }

    public Object invoke() {
        String str;
        String str2;
        FinderObject finderObject = this.f167698d;
        if (finderObject == null) {
            String str3 = this.f167699e.f167658d;
            Log.m105928w(str3, "enterLiveC1 error " + this.f167705n.f256793a + ", " + this.f167705n.f256794b);
            C10649f.C10650a aVar = this.f167704j;
            if (aVar != null) {
                aVar.onFailed(-1);
            }
        } else if (C87412m.m108589b(finderObject.username, C66785b.f191882e.mo90662O5())) {
            Log.m105924i(this.f167699e.f167658d, "enterLiveC1 anchor");
            C60606n nVar = (C60606n) C86312j.m106911c(C60606n.class);
            Intent intent = this.f167700f;
            Context context = this.f167701g;
            FinderObject finderObject2 = this.f167698d;
            long j = finderObject2.f164794id;
            C64273c21 c212 = finderObject2.liveInfo;
            Long valueOf = Long.valueOf(c212 != null ? c212.f182392d : 0);
            FinderObject finderObject3 = this.f167698d;
            String str4 = finderObject3.objectNonceId;
            if (str4 == null) {
                str4 = "";
            }
            FinderObjectDesc finderObjectDesc = finderObject3.objectDesc;
            if (finderObjectDesc == null || (str = finderObjectDesc.description) == null) {
                str = "";
            }
            String str5 = finderObject3.sessionBuffer;
            C64686ro2 ro22 = this.f167702h.f182450j;
            nVar.o90(intent, context, j, valueOf, str4, str, "", str5, (ro22 == null || (str2 = ro22.f185221o) == null) ? "" : str2);
        } else {
            Log.m105924i(this.f167699e.f167658d, "enterLiveC1 visitor");
            this.f167699e.mo10913cP(this.f167701g, this.f167703i, C26236u.m33719b(this.f167698d), 0, this.f167702h, this.f167704j);
        }
        return C13598b0.f38549a;
    }
}
