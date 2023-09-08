package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ef1 */
public class C49277ef1 extends C47465a {

    /* renamed from: d */
    public long f132898d;

    /* renamed from: e */
    public String f132899e;

    /* renamed from: f */
    public String f132900f;

    /* renamed from: g */
    public int f132901g;

    /* renamed from: h */
    public C49295ek0 f132902h;

    /* renamed from: i */
    public long f132903i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49277ef1)) {
            return false;
        }
        C49277ef1 ef12 = (C49277ef1) aVar;
        return C46238a.m51546a(Long.valueOf(this.f132898d), Long.valueOf(ef12.f132898d)) && C46238a.m51546a(this.f132899e, ef12.f132899e) && C46238a.m51546a(this.f132900f, ef12.f132900f) && C46238a.m51546a(Integer.valueOf(this.f132901g), Integer.valueOf(ef12.f132901g)) && C46238a.m51546a(this.f132902h, ef12.f132902h) && C46238a.m51546a(Long.valueOf(this.f132903i), Long.valueOf(ef12.f132903i));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f132898d);
            String str = this.f132899e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f132900f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74318e(4, this.f132901g);
            C49295ek0 ek02 = this.f132902h;
            if (ek02 != null) {
                aVar.mo74322i(5, ek02.computeSize());
                this.f132902h.writeFields(aVar);
            }
            aVar.mo74321h(6, this.f132903i);
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f132898d) + 0;
            String str3 = this.f132899e;
            if (str3 != null) {
                h += C52418a.m58683j(2, str3);
            }
            String str4 = this.f132900f;
            if (str4 != null) {
                h += C52418a.m58683j(3, str4);
            }
            int e = h + C52418a.m58678e(4, this.f132901g);
            C49295ek0 ek03 = this.f132902h;
            if (ek03 != null) {
                e += C52418a.m58682i(5, ek03.computeSize());
            }
            return e + C52418a.m58681h(6, this.f132903i);
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
            C49277ef1 ef12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    ef12.f132898d = aVar3.mo141631i(intValue);
                    return 0;
                case 2:
                    ef12.f132899e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    ef12.f132900f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    ef12.f132901g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C49295ek0 ek04 = new C49295ek0();
                        if (bArr != null && bArr.length > 0) {
                            ek04.parseFrom(bArr);
                        }
                        ef12.f132902h = ek04;
                    }
                    return 0;
                case 6:
                    ef12.f132903i = aVar3.mo141631i(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
