package po1;

import android.util.Base64;
import android.widget.FrameLayout;
import com.tencent.p014mm.plugin.finder.view.C56612h5;
import com.tencent.p014mm.plugin.finder.view.C56621j5;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import go3.C59600d;
import gy3.C87412m;
import qy2.C77455o;
import qy2.C77456r;
import uz2.C65488a0;
import uz2.C65490m;

/* renamed from: po1.c */
public class C62417c implements C77456r {
    /* renamed from: IT */
    public C59600d mo84138IT(String str, FrameLayout frameLayout, C65488a0 a0Var, C65490m mVar) {
        C87412m.m108594g(frameLayout, "container");
        C87412m.m108594g(a0Var, "jumpInfo");
        C87412m.m108594g(mVar, "pullDownParam");
        boolean z = false;
        byte[] decode = Base64.decode(a0Var.f188441f, 0);
        FinderObject finderObject = new FinderObject();
        finderObject.parseFrom(decode);
        FinderObjectDesc finderObjectDesc = finderObject.objectDesc;
        if (finderObjectDesc != null && finderObjectDesc.mediaType == 2) {
            z = true;
        }
        return z ? new C56612h5(str, frameLayout, a0Var, mVar, finderObject) : new C56621j5(str, frameLayout, a0Var, mVar, finderObject);
    }

    public C77455o l30(String str) {
        return new C62415b(str, "Finder.TextStatusProvider");
    }

    public void release() {
    }
}
