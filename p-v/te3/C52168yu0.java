package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.yu0 */
public class C52168yu0 extends C47465a {

    /* renamed from: d */
    public int f145507d;

    /* renamed from: e */
    public int f145508e;

    /* renamed from: f */
    public int f145509f;

    /* renamed from: g */
    public C49151di2 f145510g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52168yu0)) {
            return false;
        }
        C52168yu0 yu02 = (C52168yu0) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f145507d), Integer.valueOf(yu02.f145507d)) && C46238a.m51546a(Integer.valueOf(this.f145508e), Integer.valueOf(yu02.f145508e)) && C46238a.m51546a(Integer.valueOf(this.f145509f), Integer.valueOf(yu02.f145509f)) && C46238a.m51546a(this.f145510g, yu02.f145510g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f145507d);
            aVar.mo74318e(2, this.f145508e);
            aVar.mo74318e(3, this.f145509f);
            C49151di2 di22 = this.f145510g;
            if (di22 != null) {
                aVar.mo74322i(4, di22.computeSize());
                this.f145510g.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f145507d) + 0 + C52418a.m58678e(2, this.f145508e) + C52418a.m58678e(3, this.f145509f);
            C49151di2 di23 = this.f145510g;
            return di23 != null ? e + C52418a.m58682i(4, di23.computeSize()) : e;
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
            C52168yu0 yu02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                yu02.f145507d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                yu02.f145508e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                yu02.f145509f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C49151di2 di24 = new C49151di2();
                    if (bArr != null && bArr.length > 0) {
                        di24.parseFrom(bArr);
                    }
                    yu02.f145510g = di24;
                }
                return 0;
            }
        }
    }
}
