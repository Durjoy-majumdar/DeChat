package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.a31 */
public class C48659a31 extends C47465a {

    /* renamed from: d */
    public int f130267d;

    /* renamed from: e */
    public int f130268e;

    /* renamed from: f */
    public String f130269f;

    /* renamed from: g */
    public C51483u21 f130270g;

    /* renamed from: h */
    public int f130271h;

    /* renamed from: i */
    public long f130272i;

    /* renamed from: j */
    public C51633v21 f130273j;

    /* renamed from: n */
    public int f130274n;

    /* renamed from: o */
    public String f130275o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48659a31)) {
            return false;
        }
        C48659a31 a312 = (C48659a31) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f130267d), Integer.valueOf(a312.f130267d)) && C46238a.m51546a(Integer.valueOf(this.f130268e), Integer.valueOf(a312.f130268e)) && C46238a.m51546a(this.f130269f, a312.f130269f) && C46238a.m51546a(this.f130270g, a312.f130270g) && C46238a.m51546a(Integer.valueOf(this.f130271h), Integer.valueOf(a312.f130271h)) && C46238a.m51546a(Long.valueOf(this.f130272i), Long.valueOf(a312.f130272i)) && C46238a.m51546a(this.f130273j, a312.f130273j) && C46238a.m51546a(Integer.valueOf(this.f130274n), Integer.valueOf(a312.f130274n)) && C46238a.m51546a(this.f130275o, a312.f130275o);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f130267d);
            aVar.mo74318e(2, this.f130268e);
            String str = this.f130269f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            C51483u21 u212 = this.f130270g;
            if (u212 != null) {
                aVar.mo74322i(4, u212.computeSize());
                this.f130270g.writeFields(aVar);
            }
            aVar.mo74318e(5, this.f130271h);
            aVar.mo74321h(6, this.f130272i);
            C51633v21 v212 = this.f130273j;
            if (v212 != null) {
                aVar.mo74322i(7, v212.computeSize());
                this.f130273j.writeFields(aVar);
            }
            aVar.mo74318e(8, this.f130274n);
            String str2 = this.f130275o;
            if (str2 != null) {
                aVar.mo74323j(9, str2);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f130267d) + 0 + C52418a.m58678e(2, this.f130268e);
            String str3 = this.f130269f;
            if (str3 != null) {
                e += C52418a.m58683j(3, str3);
            }
            C51483u21 u213 = this.f130270g;
            if (u213 != null) {
                e += C52418a.m58682i(4, u213.computeSize());
            }
            int e2 = e + C52418a.m58678e(5, this.f130271h) + C52418a.m58681h(6, this.f130272i);
            C51633v21 v213 = this.f130273j;
            if (v213 != null) {
                e2 += C52418a.m58682i(7, v213.computeSize());
            }
            int e3 = e2 + C52418a.m58678e(8, this.f130274n);
            String str4 = this.f130275o;
            return str4 != null ? e3 + C52418a.m58683j(9, str4) : e3;
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
            C48659a31 a312 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    a312.f130267d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    a312.f130268e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    a312.f130269f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C51483u21 u214 = new C51483u21();
                        if (bArr != null && bArr.length > 0) {
                            u214.parseFrom(bArr);
                        }
                        a312.f130270g = u214;
                    }
                    return 0;
                case 5:
                    a312.f130271h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    a312.f130272i = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        C51633v21 v214 = new C51633v21();
                        if (bArr2 != null && bArr2.length > 0) {
                            v214.parseFrom(bArr2);
                        }
                        a312.f130273j = v214;
                    }
                    return 0;
                case 8:
                    a312.f130274n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    a312.f130275o = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
