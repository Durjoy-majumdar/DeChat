package tc3;

import com.tencent.p014mm.autogen.mmdata.rpt.InstrumentErrorRptStruct;
import java.util.ArrayList;
import java.util.List;
import kj2.C117407d;

/* renamed from: tc3.e */
public final class C13871e {

    /* renamed from: a */
    public static final C13871e f39036a = new C13871e();

    /* renamed from: b */
    public static final List<long[]> f39037b = new ArrayList();

    /* renamed from: c */
    public static final List<InstrumentErrorRptStruct> f39038c = new ArrayList();

    /* renamed from: d */
    public static boolean f39039d;

    /* renamed from: a */
    public static void m13176a(C13871e eVar, long j, long j2, long j3, int i, Object obj) {
        if ((i & 4) != 0) {
            j3 = 1;
        }
        long j4 = j3;
        eVar.getClass();
        if (f39039d) {
            C117407d.INSTANCE.mo182089r(j, j2, j4);
            return;
        }
        long[] jArr = {j, j2, j4};
        ((ArrayList) f39037b).add(jArr);
    }

    /* renamed from: b */
    public final void mo13201b(int i) {
        if (f39039d) {
            InstrumentErrorRptStruct instrumentErrorRptStruct = new InstrumentErrorRptStruct();
            instrumentErrorRptStruct.f9921d = i;
            instrumentErrorRptStruct.mo86054n();
            return;
        }
        List<InstrumentErrorRptStruct> list = f39038c;
        InstrumentErrorRptStruct instrumentErrorRptStruct2 = new InstrumentErrorRptStruct();
        instrumentErrorRptStruct2.f9921d = i;
        ((ArrayList) list).add(instrumentErrorRptStruct2);
    }
}
