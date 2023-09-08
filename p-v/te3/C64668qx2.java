package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.qx2 */
public class C64668qx2 extends C47465a {

    /* renamed from: d */
    public String f185084d;

    /* renamed from: e */
    public String f185085e;

    /* renamed from: f */
    public int f185086f;

    /* renamed from: g */
    public int f185087g;

    /* renamed from: h */
    public String f185088h;

    /* renamed from: i */
    public String f185089i;

    /* renamed from: j */
    public String f185090j;

    /* renamed from: n */
    public C64333dx2 f185091n;

    /* renamed from: o */
    public C50749ox2 f185092o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64668qx2)) {
            return false;
        }
        C64668qx2 qx22 = (C64668qx2) aVar;
        return C46238a.m51546a(this.f185084d, qx22.f185084d) && C46238a.m51546a(this.f185085e, qx22.f185085e) && C46238a.m51546a(Integer.valueOf(this.f185086f), Integer.valueOf(qx22.f185086f)) && C46238a.m51546a(Integer.valueOf(this.f185087g), Integer.valueOf(qx22.f185087g)) && C46238a.m51546a(this.f185088h, qx22.f185088h) && C46238a.m51546a(this.f185089i, qx22.f185089i) && C46238a.m51546a(this.f185090j, qx22.f185090j) && C46238a.m51546a(this.f185091n, qx22.f185091n) && C46238a.m51546a(this.f185092o, qx22.f185092o);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f185084d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f185085e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f185086f);
            aVar.mo74318e(4, this.f185087g);
            String str3 = this.f185088h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            String str4 = this.f185089i;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            String str5 = this.f185090j;
            if (str5 != null) {
                aVar.mo74323j(7, str5);
            }
            C64333dx2 dx22 = this.f185091n;
            if (dx22 != null) {
                aVar.mo74322i(8, dx22.computeSize());
                this.f185091n.writeFields(aVar);
            }
            C50749ox2 ox22 = this.f185092o;
            if (ox22 != null) {
                aVar.mo74322i(9, ox22.computeSize());
                this.f185092o.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            String str6 = this.f185084d;
            if (str6 != null) {
                i2 = 0 + C52418a.m58683j(1, str6);
            }
            String str7 = this.f185085e;
            if (str7 != null) {
                i2 += C52418a.m58683j(2, str7);
            }
            int e = i2 + C52418a.m58678e(3, this.f185086f) + C52418a.m58678e(4, this.f185087g);
            String str8 = this.f185088h;
            if (str8 != null) {
                e += C52418a.m58683j(5, str8);
            }
            String str9 = this.f185089i;
            if (str9 != null) {
                e += C52418a.m58683j(6, str9);
            }
            String str10 = this.f185090j;
            if (str10 != null) {
                e += C52418a.m58683j(7, str10);
            }
            C64333dx2 dx23 = this.f185091n;
            if (dx23 != null) {
                e += C52418a.m58682i(8, dx23.computeSize());
            }
            C50749ox2 ox23 = this.f185092o;
            return ox23 != null ? e + C52418a.m58682i(9, ox23.computeSize()) : e;
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
            C64668qx2 qx22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    qx22.f185084d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    qx22.f185085e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    qx22.f185086f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    qx22.f185087g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    qx22.f185088h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    qx22.f185089i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    qx22.f185090j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C64333dx2 dx24 = new C64333dx2();
                        if (bArr != null && bArr.length > 0) {
                            dx24.parseFrom(bArr);
                        }
                        qx22.f185091n = dx24;
                    }
                    return 0;
                case 9:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C50749ox2 ox24 = new C50749ox2();
                        if (bArr2 != null && bArr2.length > 0) {
                            ox24.parseFrom(bArr2);
                        }
                        qx22.f185092o = ox24;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
