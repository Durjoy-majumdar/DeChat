package dr1;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import java.util.Map;
import je1.C9329k2;
import nj3.C76912y0;
import ot1.C11767a;
import qo3.C77426q;
import rx3.C13598b0;
import z04.C112550d0;

/* renamed from: dr1.p */
public final class C7501p extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ int f25744d;

    /* renamed from: e */
    public final /* synthetic */ C7493o f25745e;

    /* renamed from: f */
    public final /* synthetic */ String f25746f;

    /* renamed from: g */
    public final /* synthetic */ String f25747g;

    /* renamed from: h */
    public final /* synthetic */ int f25748h;

    /* renamed from: i */
    public final /* synthetic */ int f25749i;

    /* renamed from: j */
    public final /* synthetic */ FinderJumpInfo f25750j;

    /* renamed from: n */
    public final /* synthetic */ String f25751n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7501p(int i, C7493o oVar, String str, String str2, int i2, int i3, FinderJumpInfo finderJumpInfo, String str3) {
        super(0);
        this.f25744d = i;
        this.f25745e = oVar;
        this.f25746f = str;
        this.f25747g = str2;
        this.f25748h = i2;
        this.f25749i = i3;
        this.f25750j = finderJumpInfo;
        this.f25751n = str3;
    }

    public Object invoke() {
        int i = this.f25744d;
        Map<String, String> map = C9329k2.f29148a;
        if (i == 0) {
            String link = this.f25745e.f25730b.getLink();
            if (C87412m.m108589b(link != null ? C112550d0.m153799i0(link).toString() : null, this.f25746f)) {
                this.f25745e.mo8633o(this.f25746f, this.f25747g, this.f25748h, this.f25749i, this.f25750j);
            }
        } else {
            if (i == -4054) {
                String str = this.f25751n;
                if (str == null) {
                    str = "";
                }
                C77426q qVar = new C77426q(((C60200t1) C86312j.m106911c(C60200t1.class)).mo76771JP());
                qVar.mo107595g(str);
                qVar.mo107601m(C0966R.string.lkg);
                qVar.mo107589a(true);
                qVar.mo107600l(C11767a.C11768a.f34454a);
                qVar.mo107603o();
            } else {
                C76912y0.makeText((Context) this.f25745e.f25729a, (int) C0966R.string.d7w, 0).show();
            }
            this.f25745e.f25730b.mo4490a();
        }
        return C13598b0.f38549a;
    }
}
