package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.tb1 */
public class C51372tb1 extends C49335eu3 {

    /* renamed from: d */
    public int f142090d;

    /* renamed from: e */
    public int f142091e;

    /* renamed from: f */
    public int f142092f;

    /* renamed from: g */
    public int f142093g;

    /* renamed from: h */
    public int f142094h;

    /* renamed from: i */
    public int f142095i;

    /* renamed from: j */
    public int f142096j;

    /* renamed from: n */
    public int f142097n;

    /* renamed from: o */
    public long f142098o;

    /* renamed from: p */
    public int f142099p;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51372tb1)) {
            return false;
        }
        C51372tb1 tb12 = (C51372tb1) aVar;
        return C46238a.m51546a(this.BaseResponse, tb12.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f142090d), Integer.valueOf(tb12.f142090d)) && C46238a.m51546a(Integer.valueOf(this.f142091e), Integer.valueOf(tb12.f142091e)) && C46238a.m51546a(Integer.valueOf(this.f142092f), Integer.valueOf(tb12.f142092f)) && C46238a.m51546a(Integer.valueOf(this.f142093g), Integer.valueOf(tb12.f142093g)) && C46238a.m51546a(Integer.valueOf(this.f142094h), Integer.valueOf(tb12.f142094h)) && C46238a.m51546a(Integer.valueOf(this.f142095i), Integer.valueOf(tb12.f142095i)) && C46238a.m51546a(Integer.valueOf(this.f142096j), Integer.valueOf(tb12.f142096j)) && C46238a.m51546a(Integer.valueOf(this.f142097n), Integer.valueOf(tb12.f142097n)) && C46238a.m51546a(Long.valueOf(this.f142098o), Long.valueOf(tb12.f142098o)) && C46238a.m51546a(Integer.valueOf(this.f142099p), Integer.valueOf(tb12.f142099p));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                aVar.mo74322i(1, jaVar.computeSize());
                this.BaseResponse.writeFields(aVar);
            }
            aVar.mo74318e(2, this.f142090d);
            aVar.mo74318e(3, this.f142091e);
            aVar.mo74318e(4, this.f142092f);
            aVar.mo74318e(5, this.f142093g);
            aVar.mo74318e(6, this.f142094h);
            aVar.mo74318e(7, this.f142095i);
            aVar.mo74318e(8, this.f142096j);
            aVar.mo74318e(9, this.f142097n);
            aVar.mo74321h(10, this.f142098o);
            aVar.mo74318e(11, this.f142099p);
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            return i2 + C52418a.m58678e(2, this.f142090d) + C52418a.m58678e(3, this.f142091e) + C52418a.m58678e(4, this.f142092f) + C52418a.m58678e(5, this.f142093g) + C52418a.m58678e(6, this.f142094h) + C52418a.m58678e(7, this.f142095i) + C52418a.m58678e(8, this.f142096j) + C52418a.m58678e(9, this.f142097n) + C52418a.m58681h(10, this.f142098o) + C52418a.m58678e(11, this.f142099p);
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
            C51372tb1 tb12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C49966ja jaVar3 = new C49966ja();
                        if (bArr != null && bArr.length > 0) {
                            jaVar3.parseFrom(bArr);
                        }
                        tb12.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    tb12.f142090d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    tb12.f142091e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    tb12.f142092f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    tb12.f142093g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    tb12.f142094h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    tb12.f142095i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    tb12.f142096j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    tb12.f142097n = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    tb12.f142098o = aVar3.mo141631i(intValue);
                    return 0;
                case 11:
                    tb12.f142099p = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
