package eo1;

import bo1.C54512y;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.LinkedList;

/* renamed from: eo1.d */
public final class C58656d extends C87413o implements C32226l<C54512y, Boolean> {

    /* renamed from: d */
    public final /* synthetic */ String f167927d;

    /* renamed from: e */
    public final /* synthetic */ LinkedList<C54512y> f167928e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58656d(String str, LinkedList<C54512y> linkedList) {
        super(1);
        this.f167927d = str;
        this.f167928e = linkedList;
    }

    public Object invoke(Object obj) {
        C54512y yVar = (C54512y) obj;
        C87412m.m108594g(yVar, LocaleUtil.ITALIAN);
        String str = this.f167927d;
        boolean z = str == null || C87412m.m108589b(yVar.f152814l1, str);
        if (z) {
            this.f167928e.add(yVar);
        }
        return Boolean.valueOf(z);
    }
}
