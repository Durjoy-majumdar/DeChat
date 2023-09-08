package pv0;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: pv0.h0 */
public class C47530h0 extends C47465a {

    /* renamed from: d */
    public long f127519d;

    /* renamed from: e */
    public long f127520e;

    /* renamed from: f */
    public String f127521f;

    /* renamed from: g */
    public int f127522g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47530h0)) {
            return false;
        }
        C47530h0 h0Var = (C47530h0) aVar;
        return C46238a.m51546a(Long.valueOf(this.f127519d), Long.valueOf(h0Var.f127519d)) && C46238a.m51546a(Long.valueOf(this.f127520e), Long.valueOf(h0Var.f127520e)) && C46238a.m51546a(this.f127521f, h0Var.f127521f) && C46238a.m51546a(Integer.valueOf(this.f127522g), Integer.valueOf(h0Var.f127522g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f127521f != null) {
                aVar.mo74321h(1, this.f127519d);
                aVar.mo74321h(2, this.f127520e);
                String str = this.f127521f;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                aVar.mo74318e(4, this.f127522g);
                return 0;
            }
            throw new C52419b("Not all required fields were included: MediaID");
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f127519d) + 0 + C52418a.m58681h(2, this.f127520e);
            String str2 = this.f127521f;
            if (str2 != null) {
                h += C52418a.m58683j(3, str2);
            }
            return h + C52418a.m58678e(4, this.f127522g);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f127521f != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: MediaID");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C47530h0 h0Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                h0Var.f127519d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 2) {
                h0Var.f127520e = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 3) {
                h0Var.f127521f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                h0Var.f127522g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
