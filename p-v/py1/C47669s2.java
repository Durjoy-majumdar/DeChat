package py1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.s2 */
public class C47669s2 extends C47465a {

    /* renamed from: d */
    public int f127994d;

    /* renamed from: e */
    public String f127995e;

    /* renamed from: f */
    public C47628m3 f127996f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47669s2)) {
            return false;
        }
        C47669s2 s2Var = (C47669s2) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f127994d), Integer.valueOf(s2Var.f127994d)) && C46238a.m51546a(this.f127995e, s2Var.f127995e) && C46238a.m51546a(this.f127996f, s2Var.f127996f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f127994d);
            String str = this.f127995e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            C47628m3 m3Var = this.f127996f;
            if (m3Var != null) {
                aVar.mo74322i(3, m3Var.computeSize());
                this.f127996f.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f127994d) + 0;
            String str2 = this.f127995e;
            if (str2 != null) {
                e += C52418a.m58683j(2, str2);
            }
            C47628m3 m3Var2 = this.f127996f;
            return m3Var2 != null ? e + C52418a.m58682i(3, m3Var2.computeSize()) : e;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C47669s2 s2Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                s2Var.f127994d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                s2Var.f127995e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C47628m3 m3Var3 = new C47628m3();
                    if (bArr != null && bArr.length > 0) {
                        m3Var3.parseFrom(bArr);
                    }
                    s2Var.f127996f = m3Var3;
                }
                return 0;
            }
        }
    }
}
