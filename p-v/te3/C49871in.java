package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.in */
public class C49871in extends C47465a {

    /* renamed from: d */
    public String f135509d;

    /* renamed from: e */
    public String f135510e;

    /* renamed from: f */
    public String f135511f;

    /* renamed from: g */
    public int f135512g;

    /* renamed from: h */
    public C51997xn f135513h;

    /* renamed from: i */
    public int f135514i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49871in)) {
            return false;
        }
        C49871in inVar = (C49871in) aVar;
        return C46238a.m51546a(this.f135509d, inVar.f135509d) && C46238a.m51546a(this.f135510e, inVar.f135510e) && C46238a.m51546a(this.f135511f, inVar.f135511f) && C46238a.m51546a(Integer.valueOf(this.f135512g), Integer.valueOf(inVar.f135512g)) && C46238a.m51546a(this.f135513h, inVar.f135513h) && C46238a.m51546a(Integer.valueOf(this.f135514i), Integer.valueOf(inVar.f135514i));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f135509d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f135510e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f135511f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            aVar.mo74318e(4, this.f135512g);
            C51997xn xnVar = this.f135513h;
            if (xnVar != null) {
                aVar.mo74322i(5, xnVar.computeSize());
                this.f135513h.writeFields(aVar);
            }
            aVar.mo74318e(6, this.f135514i);
            return 0;
        } else if (i == 1) {
            String str4 = this.f135509d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            String str5 = this.f135510e;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            String str6 = this.f135511f;
            if (str6 != null) {
                i2 += C52418a.m58683j(3, str6);
            }
            int e = i2 + C52418a.m58678e(4, this.f135512g);
            C51997xn xnVar2 = this.f135513h;
            if (xnVar2 != null) {
                e += C52418a.m58682i(5, xnVar2.computeSize());
            }
            return e + C52418a.m58678e(6, this.f135514i);
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
            C49871in inVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    inVar.f135509d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    inVar.f135510e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    inVar.f135511f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    inVar.f135512g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C51997xn xnVar3 = new C51997xn();
                        if (bArr != null && bArr.length > 0) {
                            xnVar3.parseFrom(bArr);
                        }
                        inVar.f135513h = xnVar3;
                    }
                    return 0;
                case 6:
                    inVar.f135514i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
