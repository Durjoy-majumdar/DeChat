package d60;

import android.os.Bundle;
import android.view.ViewGroup;
import com.tencent.p014mm.live.model.RoomLiveService;
import com.tencent.p014mm.p136ui.C74942w4;
import fy3.C32224a;
import gy3.C87413o;
import java.util.Iterator;
import my3.C34690i;
import my3.C61594j;
import my3.C61595o;
import o40.C61926c;
import rx3.C13598b0;
import sx3.C36904l0;
import y50.C66524m;

/* renamed from: d60.d0 */
public final class C58129d0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ ViewGroup f166521d;

    /* renamed from: e */
    public final /* synthetic */ C58130e0 f166522e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58129d0(ViewGroup viewGroup, C58130e0 e0Var) {
        super(0);
        this.f166521d = viewGroup;
        this.f166522e = e0Var;
    }

    public Object invoke() {
        if (this.f166521d.getVisibility() == 0) {
            int i = RoomLiveService.f157197h.f133057n;
            C58130e0 e0Var = this.f166522e;
            int i2 = i - e0Var.f166532r;
            if (i2 > 5) {
                i2 = 5;
            }
            if (i2 > 0) {
                e0Var.f166532r = i;
                Bundle bundle = new Bundle();
                int[] iArr = {0, 0};
                this.f166522e.f166527j.getLocationOnScreen(iArr);
                bundle.putInt("PARAM_LIVE_LIKE_CONFETTI_X", (iArr[0] + (this.f166522e.f166527j.getWidth() / 2)) - (C66524m.C66525a.f191366a / 2));
                bundle.putInt("PARAM_LIVE_LIKE_CONFETTI_Y", iArr[1] - C74942w4.m89784a(this.f166521d.getContext(), 16));
                C61594j i3 = C61595o.m72301i(0, i2);
                C58130e0 e0Var2 = this.f166522e;
                Iterator it = i3.iterator();
                while (((C34690i) it).hasNext()) {
                    C61926c.m72666K(((long) ((C36904l0) it).mo59695a()) * 500, new C58127c0(e0Var2, bundle));
                }
            }
        }
        return C13598b0.f38549a;
    }
}
