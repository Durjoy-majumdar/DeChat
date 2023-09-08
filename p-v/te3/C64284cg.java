package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.cg */
public class C64284cg extends C47465a {

    /* renamed from: d */
    public String f182468d;

    /* renamed from: e */
    public String f182469e;

    /* renamed from: f */
    public String f182470f;

    /* renamed from: g */
    public int f182471g;

    /* renamed from: h */
    public int f182472h;

    /* renamed from: i */
    public C64709se f182473i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64284cg)) {
            return false;
        }
        C64284cg cgVar = (C64284cg) aVar;
        return C46238a.m51546a(this.f182468d, cgVar.f182468d) && C46238a.m51546a(this.f182469e, cgVar.f182469e) && C46238a.m51546a(this.f182470f, cgVar.f182470f) && C46238a.m51546a(Integer.valueOf(this.f182471g), Integer.valueOf(cgVar.f182471g)) && C46238a.m51546a(Integer.valueOf(this.f182472h), Integer.valueOf(cgVar.f182472h)) && C46238a.m51546a(this.f182473i, cgVar.f182473i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f182468d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f182469e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f182470f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            aVar.mo74318e(4, this.f182471g);
            aVar.mo74318e(5, this.f182472h);
            C64709se seVar = this.f182473i;
            if (seVar != null) {
                aVar.mo74322i(6, seVar.computeSize());
                this.f182473i.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            String str4 = this.f182468d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            String str5 = this.f182469e;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            String str6 = this.f182470f;
            if (str6 != null) {
                i2 += C52418a.m58683j(3, str6);
            }
            int e = i2 + C52418a.m58678e(4, this.f182471g) + C52418a.m58678e(5, this.f182472h);
            C64709se seVar2 = this.f182473i;
            return seVar2 != null ? e + C52418a.m58682i(6, seVar2.computeSize()) : e;
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
            C64284cg cgVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    cgVar.f182468d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    cgVar.f182469e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    cgVar.f182470f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    cgVar.f182471g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    cgVar.f182472h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C64709se seVar3 = new C64709se();
                        if (bArr != null && bArr.length > 0) {
                            seVar3.parseFrom(bArr);
                        }
                        cgVar.f182473i = seVar3;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
