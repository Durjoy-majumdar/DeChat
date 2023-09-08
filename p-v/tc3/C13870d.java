package tc3;

import com.tencent.p014mm.autogen.mmdata.rpt.InstrumentErrorRptStruct;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: tc3.d */
public final class C13870d extends C87413o implements C32226l<InstrumentErrorRptStruct, Boolean> {

    /* renamed from: d */
    public static final C13870d f39035d = new C13870d();

    public C13870d() {
        super(1);
    }

    public Object invoke(Object obj) {
        InstrumentErrorRptStruct instrumentErrorRptStruct = (InstrumentErrorRptStruct) obj;
        C87412m.m108594g(instrumentErrorRptStruct, LocaleUtil.ITALIAN);
        instrumentErrorRptStruct.mo86054n();
        return Boolean.TRUE;
    }
}
