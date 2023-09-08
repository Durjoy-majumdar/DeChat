package cl1;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import java.util.LinkedList;
import java.util.List;
import rx3.C13598b0;
import sx3.C64197v;
import te3.C51790w61;

/* renamed from: cl1.q */
public final class C0679q extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C54991o f1599d;

    /* renamed from: e */
    public final /* synthetic */ LinkedList<C51790w61> f1600e;

    /* renamed from: f */
    public final /* synthetic */ boolean f1601f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0679q(C54991o oVar, LinkedList<C51790w61> linkedList, boolean z) {
        super(0);
        this.f1599d = oVar;
        this.f1600e = linkedList;
        this.f1601f = z;
    }

    public Object invoke() {
        this.f1599d.f154385x2.clear();
        this.f1599d.f154385x2.addAll(this.f1600e);
        C54991o oVar = this.f1599d;
        boolean z = this.f1601f;
        oVar.getClass();
        StringBuilder sb = new StringBuilder("printRedPacketInfoList(" + "reset" + ",fromJoinLive:" + z + ")：");
        List<C51790w61> list = oVar.f154385x2;
        if (list != null) {
            int i = 0;
            for (T next : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    sb.append("index:" + i + ',' + ((C51790w61) next) + "};");
                    i = i2;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
        }
        Log.m105924i(oVar.f154311f, sb.toString());
        return C13598b0.f38549a;
    }
}
