package com.tencent.p014mm.emoji.debug;

import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.LinkedList;
import sx3.C110818d0;
import uc0.C111153e;
import uc0.C65319f;

/* renamed from: com.tencent.mm.emoji.debug.c */
public final class C80846c extends C87413o implements C32226l<C111153e, CharSequence> {

    /* renamed from: d */
    public static final C80846c f237636d = new C80846c();

    public C80846c() {
        super(1);
    }

    public Object invoke(Object obj) {
        C111153e eVar = (C111153e) obj;
        StringBuilder sb = new StringBuilder();
        sb.append(eVar.f332878e);
        sb.append(": \n");
        sb.append(eVar.f332881h);
        sb.append(" - ");
        sb.append(eVar.f332882i);
        sb.append("\n ");
        LinkedList<C65319f> linkedList = eVar.f332877d;
        C87412m.m108593f(linkedList, "it.keyWords");
        sb.append(C110818d0.m150921S(linkedList, "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C55196b.f157032d, 30, (Object) null));
        sb.append("\n---");
        return sb.toString();
    }
}
