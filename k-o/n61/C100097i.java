package n61;

import com.tencent.p014mm.autogen.mmdata.rpt.EmoticonStoreActionStruct;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import java.util.Map;
import q61.C101037a;
import q61.C101038b;
import q61.C101046c;
import rx3.C13598b0;

/* renamed from: n61.i */
public final class C100097i extends C87413o implements C32226l<C101046c, C13598b0> {

    /* renamed from: d */
    public static final C100097i f293247d = new C100097i();

    public C100097i() {
        super(1);
    }

    public Object invoke(Object obj) {
        C101046c cVar = (C101046c) obj;
        C87412m.m108594g(cVar, LocaleUtil.ITALIAN);
        for (Map.Entry next : cVar.f295836a.entrySet()) {
            EmoticonStoreActionStruct emoticonStoreActionStruct = new EmoticonStoreActionStruct();
            emoticonStoreActionStruct.f265474j = (long) ((Number) next.getKey()).intValue();
            emoticonStoreActionStruct.f265470f = 1;
            emoticonStoreActionStruct.f265469e = 1;
            emoticonStoreActionStruct.f265468d = C101037a.f295825a;
            C101038b.f295826d.mo140508a(emoticonStoreActionStruct, (List) next.getValue());
            emoticonStoreActionStruct.mo86054n();
        }
        return C13598b0.f38549a;
    }
}
