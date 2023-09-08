package dr1;

import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import fy3.C32224a;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.List;
import rx3.C13598b0;

/* renamed from: dr1.f */
public final class C7480f extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C7483i f25697d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7480f(C7483i iVar) {
        super(0);
        this.f25697d = iVar;
    }

    public Object invoke() {
        ArrayList arrayList;
        this.f25697d.f25700a.getIntent().removeExtra("JUMP_INFO");
        C7483i iVar = this.f25697d;
        List<? extends FinderJumpInfo> list = iVar.f25709j;
        if (list != null) {
            arrayList = new ArrayList();
            for (T next : list) {
                boolean z = true;
                if (((FinderJumpInfo) next).business_type == 1) {
                    z = false;
                }
                if (z) {
                    arrayList.add(next);
                }
            }
        } else {
            arrayList = null;
        }
        iVar.f25709j = arrayList;
        this.f25697d.mo8624g((FinderJumpInfo) null);
        return C13598b0.f38549a;
    }
}
