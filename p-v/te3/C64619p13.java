package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.p13 */
public class C64619p13 extends C47465a {

    /* renamed from: d */
    public String f184728d;

    /* renamed from: e */
    public String f184729e;

    /* renamed from: f */
    public String f184730f;

    /* renamed from: g */
    public String f184731g;

    /* renamed from: h */
    public String f184732h;

    /* renamed from: i */
    public int f184733i;

    /* renamed from: j */
    public C64488kb1 f184734j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64619p13)) {
            return false;
        }
        C64619p13 p132 = (C64619p13) aVar;
        return C46238a.m51546a(this.f184728d, p132.f184728d) && C46238a.m51546a(this.f184729e, p132.f184729e) && C46238a.m51546a(this.f184730f, p132.f184730f) && C46238a.m51546a(this.f184731g, p132.f184731g) && C46238a.m51546a(this.f184732h, p132.f184732h) && C46238a.m51546a(Integer.valueOf(this.f184733i), Integer.valueOf(p132.f184733i)) && C46238a.m51546a(this.f184734j, p132.f184734j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f184728d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f184729e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f184730f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f184731g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f184732h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            aVar.mo74318e(6, this.f184733i);
            C64488kb1 kb12 = this.f184734j;
            if (kb12 != null) {
                aVar.mo74322i(7, kb12.computeSize());
                this.f184734j.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            String str6 = this.f184728d;
            if (str6 != null) {
                i2 = 0 + C52418a.m58683j(1, str6);
            }
            String str7 = this.f184729e;
            if (str7 != null) {
                i2 += C52418a.m58683j(2, str7);
            }
            String str8 = this.f184730f;
            if (str8 != null) {
                i2 += C52418a.m58683j(3, str8);
            }
            String str9 = this.f184731g;
            if (str9 != null) {
                i2 += C52418a.m58683j(4, str9);
            }
            String str10 = this.f184732h;
            if (str10 != null) {
                i2 += C52418a.m58683j(5, str10);
            }
            int e = i2 + C52418a.m58678e(6, this.f184733i);
            C64488kb1 kb13 = this.f184734j;
            return kb13 != null ? e + C52418a.m58682i(7, kb13.computeSize()) : e;
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
            C64619p13 p132 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    p132.f184728d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    p132.f184729e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    p132.f184730f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    p132.f184731g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    p132.f184732h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    p132.f184733i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C64488kb1 kb14 = new C64488kb1();
                        if (bArr != null && bArr.length > 0) {
                            kb14.parseFrom(bArr);
                        }
                        p132.f184734j = kb14;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
