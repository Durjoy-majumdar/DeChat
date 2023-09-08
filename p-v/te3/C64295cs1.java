package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.cs1 */
public class C64295cs1 extends C47465a {

    /* renamed from: d */
    public int f182560d;

    /* renamed from: e */
    public String f182561e;

    /* renamed from: f */
    public int f182562f;

    /* renamed from: g */
    public C64669qy0 f182563g;

    /* renamed from: h */
    public C64874za1 f182564h;

    /* renamed from: i */
    public boolean f182565i;

    /* renamed from: j */
    public String f182566j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64295cs1)) {
            return false;
        }
        C64295cs1 cs12 = (C64295cs1) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f182560d), Integer.valueOf(cs12.f182560d)) && C46238a.m51546a(this.f182561e, cs12.f182561e) && C46238a.m51546a(Integer.valueOf(this.f182562f), Integer.valueOf(cs12.f182562f)) && C46238a.m51546a(this.f182563g, cs12.f182563g) && C46238a.m51546a(this.f182564h, cs12.f182564h) && C46238a.m51546a(Boolean.valueOf(this.f182565i), Boolean.valueOf(cs12.f182565i)) && C46238a.m51546a(this.f182566j, cs12.f182566j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f182560d);
            String str = this.f182561e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f182562f);
            C64669qy0 qy02 = this.f182563g;
            if (qy02 != null) {
                aVar.mo74322i(4, qy02.computeSize());
                this.f182563g.writeFields(aVar);
            }
            C64874za1 za12 = this.f182564h;
            if (za12 != null) {
                aVar.mo74322i(5, za12.computeSize());
                this.f182564h.writeFields(aVar);
            }
            aVar.mo74314a(6, this.f182565i);
            String str2 = this.f182566j;
            if (str2 != null) {
                aVar.mo74323j(7, str2);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f182560d) + 0;
            String str3 = this.f182561e;
            if (str3 != null) {
                e += C52418a.m58683j(2, str3);
            }
            int e2 = e + C52418a.m58678e(3, this.f182562f);
            C64669qy0 qy03 = this.f182563g;
            if (qy03 != null) {
                e2 += C52418a.m58682i(4, qy03.computeSize());
            }
            C64874za1 za13 = this.f182564h;
            if (za13 != null) {
                e2 += C52418a.m58682i(5, za13.computeSize());
            }
            int a = e2 + C52418a.m58674a(6, this.f182565i);
            String str4 = this.f182566j;
            return str4 != null ? a + C52418a.m58683j(7, str4) : a;
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
            C64295cs1 cs12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    cs12.f182560d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    cs12.f182561e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    cs12.f182562f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C64669qy0 qy04 = new C64669qy0();
                        if (bArr != null && bArr.length > 0) {
                            qy04.parseFrom(bArr);
                        }
                        cs12.f182563g = qy04;
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        C64874za1 za14 = new C64874za1();
                        if (bArr2 != null && bArr2.length > 0) {
                            za14.parseFrom(bArr2);
                        }
                        cs12.f182564h = za14;
                    }
                    return 0;
                case 6:
                    cs12.f182565i = aVar3.mo141625c(intValue);
                    return 0;
                case 7:
                    cs12.f182566j = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
