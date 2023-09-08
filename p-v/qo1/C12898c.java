package qo1;

import com.tencent.p014mm.autogen.mmdata.rpt.SnsPostSyncFinderPostStruct;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13604l;

/* renamed from: qo1.c */
public final class C12898c extends C87413o implements C32226l<C13604l<? extends Long, ? extends SnsPostSyncFinderPostStruct>, Boolean> {

    /* renamed from: d */
    public final /* synthetic */ long f36883d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12898c(long j) {
        super(1);
        this.f36883d = j;
    }

    public Object invoke(Object obj) {
        C13604l lVar = (C13604l) obj;
        C87412m.m108594g(lVar, LocaleUtil.ITALIAN);
        return Boolean.valueOf(((Number) lVar.f38555d).longValue() == this.f36883d);
    }
}
