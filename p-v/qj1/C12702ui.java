package qj1;

import fy3.C32224a;
import gy3.C87413o;
import java.util.LinkedList;
import qj1.C12360e8;
import rx3.C13598b0;
import sx3.C26236u;
import sx3.C64197v;
import te3.C51354t71;
import te3.C51628v11;
import te3.C51769w11;

/* renamed from: qj1.ui */
public final class C12702ui extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C51354t71 f36393d;

    /* renamed from: e */
    public final /* synthetic */ C12666si f36394e;

    /* renamed from: f */
    public final /* synthetic */ String f36395f;

    /* renamed from: g */
    public final /* synthetic */ String f36396g;

    /* renamed from: h */
    public final /* synthetic */ C12360e8.C12365c.C12366a f36397h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12702ui(C51354t71 t712, C12666si siVar, String str, String str2, C12360e8.C12365c.C12366a aVar) {
        super(0);
        this.f36393d = t712;
        this.f36394e = siVar;
        this.f36395f = str;
        this.f36396g = str2;
        this.f36397h = aVar;
    }

    public Object invoke() {
        C51628v11 v112 = this.f36393d.f142018g;
        LinkedList<C51769w11> linkedList = v112 != null ? v112.f143244e : null;
        if (linkedList != null) {
            C12666si siVar = this.f36394e;
            String str = this.f36395f;
            String str2 = this.f36396g;
            C12360e8.C12365c.C12366a aVar = this.f36397h;
            int i = 0;
            for (T next : linkedList) {
                int i2 = i + 1;
                if (i >= 0) {
                    int i3 = siVar.f36272f + 1;
                    siVar.f36272f = i3;
                    C12360e8.f35587T.mo12056a(str, i3, str2, 1, false, aVar, C26236u.m33719b((C51769w11) next));
                    i = i2;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
        }
        return C13598b0.f38549a;
    }
}
