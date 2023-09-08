package p00;

import ac3.C0031n;
import ac3.C103353f0;
import ac3.C103355g1;
import ac3.C103363k;
import ac3.C103365l;
import ac3.C103367l1;
import ac3.C103369q;
import ac3.C103371s;
import ac3.C27850e0;
import ac3.C27862u0;
import ac3.C27871x0;
import ac3.C27873y0;
import ac3.C54009m;
import ac3.C54010o;
import ac3.C54011p;
import ac3.C91992q0;
import com.tencent.tav.decoder.logger.Logger;
import di3.C86301e;
import ei3.C86522b;
import gy3.C8480h;
import gy3.C87412m;
import java.util.LinkedList;
import q00.C110264g;
import q00.C12025f;
import q00.C62570d;
import q00.C62571i;
import sx3.C110818d0;
import te3.b05;
import yp3.C112478a;

@C86522b
/* renamed from: p00.b */
public final class C110094b extends C86301e implements C62571i, C62570d {
    /* renamed from: HP */
    public C0031n mo87566HP() {
        return new C103365l();
    }

    /* renamed from: IR */
    public C12025f mo87567IR() {
        return C91992q0.f263331a;
    }

    public String Qr0() {
        C27862u0 u0Var = C27862u0.f77002a;
        LinkedList<b05> linkedList = C27862u0.f77006e.f130188d;
        C87412m.m108593f(linkedList, "targetModelInfo.NewConfigList");
        String S = C110818d0.m150921S(linkedList, "\n\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C27873y0.f77021d, 30, (Object) null);
        StringBuilder sb = new StringBuilder();
        sb.append("----------cgiInfo----------\n");
        sb.append(S);
        sb.append("\n\n\n----------localInfo----------\n");
        LinkedList<b05> linkedList2 = C27862u0.f77005d.f130188d;
        C87412m.m108593f(linkedList2, "localModelInfo.NewConfigList");
        sb.append(C110818d0.m150921S(linkedList2, "\n\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C27871x0.f77017d, 30, (Object) null));
        return sb.toString();
    }

    /* renamed from: Ra */
    public void mo87569Ra() {
        C103367l1.m137008a();
    }

    public void Up0() {
        Logger.setLogProxy(new C27850e0());
        Logger.setLevel(2);
        C112478a.f336787a = new C103353f0();
    }

    /* renamed from: WL */
    public C54011p mo87570WL() {
        return new C103371s();
    }

    /* renamed from: ab */
    public C54009m mo87571ab() {
        return new C103363k();
    }

    public C110264g eo0(int i, C110264g.C47730a aVar) {
        C87412m.m108594g(aVar, "appScene");
        return new C103355g1(i, false, false, false, false, false, aVar, 62, (C8480h) null);
    }

    /* renamed from: oo */
    public C54010o mo87573oo() {
        return new C103369q();
    }

    /* renamed from: qb */
    public C110264g mo87574qb() {
        return new C103355g1(0, false, false, false, false, false, (C110264g.C47730a) null, 127, (C8480h) null);
    }
}
