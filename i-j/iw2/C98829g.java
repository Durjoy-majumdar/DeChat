package iw2;

import fy3.C32224a;
import gw2.C98266k;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import rx3.C13598b0;

/* renamed from: iw2.g */
public final class C98829g extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ boolean f289720d;

    /* renamed from: e */
    public final /* synthetic */ C98820f f289721e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C98829g(boolean z, C98820f fVar) {
        super(0);
        this.f289720d = z;
        this.f289721e = fVar;
    }

    public Object invoke() {
        if (this.f289720d) {
            int size = this.f289721e.f289691i.size();
            C98820f fVar = this.f289721e;
            int i = fVar.f289694o;
            boolean z = false;
            if (i >= 0 && i < size) {
                ArrayList<C98266k> arrayList = fVar.f289691i.get(i);
                C87412m.m108593f(arrayList, "dateGalleryMap[deleteRowIndex]");
                ArrayList arrayList2 = arrayList;
                int size2 = arrayList2.size();
                int i2 = this.f289721e.f289695p;
                if (i2 >= 0 && i2 < size2) {
                    z = true;
                }
                if (z) {
                    arrayList2.remove(i2);
                    C98820f fVar2 = this.f289721e;
                    fVar2.mo138199n(fVar2.f289694o, arrayList2);
                }
            }
        }
        this.f289721e.f289689g.mo134401i(this.f289720d);
        C98820f fVar3 = this.f289721e;
        fVar3.f289694o = -1;
        fVar3.f289695p = -1;
        return C13598b0.f38549a;
    }
}
