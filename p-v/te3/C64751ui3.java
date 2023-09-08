package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ui3 */
public class C64751ui3 extends C101820nt3 {

    /* renamed from: d */
    public String f185742d;

    /* renamed from: e */
    public String f185743e;

    /* renamed from: f */
    public int f185744f;

    /* renamed from: g */
    public long f185745g;

    /* renamed from: h */
    public int f185746h;

    /* renamed from: i */
    public String f185747i;

    /* renamed from: j */
    public int f185748j;

    /* renamed from: n */
    public int f185749n;

    /* renamed from: o */
    public int f185750o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64751ui3)) {
            return false;
        }
        C64751ui3 ui32 = (C64751ui3) aVar;
        return C46238a.m51546a(this.BaseRequest, ui32.BaseRequest) && C46238a.m51546a(this.f185742d, ui32.f185742d) && C46238a.m51546a(this.f185743e, ui32.f185743e) && C46238a.m51546a(Integer.valueOf(this.f185744f), Integer.valueOf(ui32.f185744f)) && C46238a.m51546a(Long.valueOf(this.f185745g), Long.valueOf(ui32.f185745g)) && C46238a.m51546a(Integer.valueOf(this.f185746h), Integer.valueOf(ui32.f185746h)) && C46238a.m51546a(this.f185747i, ui32.f185747i) && C46238a.m51546a(Integer.valueOf(this.f185748j), Integer.valueOf(ui32.f185748j)) && C46238a.m51546a(Integer.valueOf(this.f185749n), Integer.valueOf(ui32.f185749n)) && C46238a.m51546a(Integer.valueOf(this.f185750o), Integer.valueOf(ui32.f185750o));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C90417ia iaVar = this.BaseRequest;
            if (iaVar != null) {
                aVar.mo74322i(1, iaVar.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            String str = this.f185742d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f185743e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74318e(4, this.f185744f);
            aVar.mo74321h(5, this.f185745g);
            aVar.mo74318e(6, this.f185746h);
            String str3 = this.f185747i;
            if (str3 != null) {
                aVar.mo74323j(7, str3);
            }
            aVar.mo74318e(8, this.f185748j);
            aVar.mo74318e(9, this.f185749n);
            aVar.mo74318e(10, this.f185750o);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str4 = this.f185742d;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            String str5 = this.f185743e;
            if (str5 != null) {
                i2 += C52418a.m58683j(3, str5);
            }
            int e = i2 + C52418a.m58678e(4, this.f185744f) + C52418a.m58681h(5, this.f185745g) + C52418a.m58678e(6, this.f185746h);
            String str6 = this.f185747i;
            if (str6 != null) {
                e += C52418a.m58683j(7, str6);
            }
            return e + C52418a.m58678e(8, this.f185748j) + C52418a.m58678e(9, this.f185749n) + C52418a.m58678e(10, this.f185750o);
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
            C64751ui3 ui32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C90417ia iaVar3 = new C90417ia();
                        if (bArr != null && bArr.length > 0) {
                            iaVar3.parseFrom(bArr);
                        }
                        ui32.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    ui32.f185742d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    ui32.f185743e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    ui32.f185744f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    ui32.f185745g = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    ui32.f185746h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    ui32.f185747i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    ui32.f185748j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    ui32.f185749n = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    ui32.f185750o = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
