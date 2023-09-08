package qb1;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import java.util.List;
import pb1.C100755z;
import rx3.C13598b0;

/* renamed from: qb1.c */
public final class C101092c extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ List<C100755z> f295928d;

    /* renamed from: e */
    public final /* synthetic */ int f295929e;

    /* renamed from: f */
    public final /* synthetic */ int f295930f;

    /* renamed from: g */
    public final /* synthetic */ String f295931g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C101092c(List<? extends C100755z> list, int i, int i2, String str) {
        super(0);
        this.f295928d = list;
        this.f295929e = i;
        this.f295930f = i2;
        this.f295931g = str;
    }

    public Object invoke() {
        Log.m105924i("MicroMsg.FavDelMgr", "updateDelInfo() called with: items = " + this.f295928d.size() + ", delType = " + this.f295929e + ", delFlag = " + this.f295930f + ", callMsg = " + this.f295931g);
        C101089b bVar = C101089b.f295920a;
        List<C100755z> list = this.f295928d;
        String str = this.f295931g;
        int i = this.f295929e;
        int i2 = this.f295930f;
        for (C100755z b : list) {
            C101089b.f295920a.mo140542b(b, str, i, i2);
        }
        return C13598b0.f38549a;
    }
}
