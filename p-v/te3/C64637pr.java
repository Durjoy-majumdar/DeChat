package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.pr */
public class C64637pr extends C49335eu3 {

    /* renamed from: d */
    public int f184886d;

    /* renamed from: e */
    public String f184887e;

    /* renamed from: f */
    public dl4 f184888f;

    /* renamed from: g */
    public String f184889g;

    /* renamed from: h */
    public C49995ji2 f184890h;

    /* renamed from: i */
    public C49995ji2 f184891i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64637pr)) {
            return false;
        }
        C64637pr prVar = (C64637pr) aVar;
        return C46238a.m51546a(this.BaseResponse, prVar.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f184886d), Integer.valueOf(prVar.f184886d)) && C46238a.m51546a(this.f184887e, prVar.f184887e) && C46238a.m51546a(this.f184888f, prVar.f184888f) && C46238a.m51546a(this.f184889g, prVar.f184889g) && C46238a.m51546a(this.f184890h, prVar.f184890h) && C46238a.m51546a(this.f184891i, prVar.f184891i);
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
            aVar.mo74318e(2, this.f184886d);
            String str = this.f184887e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            dl4 dl4 = this.f184888f;
            if (dl4 != null) {
                aVar.mo74322i(4, dl4.computeSize());
                this.f184888f.writeFields(aVar);
            }
            String str2 = this.f184889g;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            C49995ji2 ji22 = this.f184890h;
            if (ji22 != null) {
                aVar.mo74322i(6, ji22.computeSize());
                this.f184890h.writeFields(aVar);
            }
            C49995ji2 ji23 = this.f184891i;
            if (ji23 != null) {
                aVar.mo74322i(7, ji23.computeSize());
                this.f184891i.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f184886d);
            String str3 = this.f184887e;
            if (str3 != null) {
                e += C52418a.m58683j(3, str3);
            }
            dl4 dl42 = this.f184888f;
            if (dl42 != null) {
                e += C52418a.m58682i(4, dl42.computeSize());
            }
            String str4 = this.f184889g;
            if (str4 != null) {
                e += C52418a.m58683j(5, str4);
            }
            C49995ji2 ji24 = this.f184890h;
            if (ji24 != null) {
                e += C52418a.m58682i(6, ji24.computeSize());
            }
            C49995ji2 ji25 = this.f184891i;
            return ji25 != null ? e + C52418a.m58682i(7, ji25.computeSize()) : e;
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
            C64637pr prVar = objArr[1];
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
                        prVar.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    prVar.f184886d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    prVar.f184887e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        dl4 dl43 = new dl4();
                        if (bArr2 != null && bArr2.length > 0) {
                            dl43.parseFrom(bArr2);
                        }
                        prVar.f184888f = dl43;
                    }
                    return 0;
                case 5:
                    prVar.f184889g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C49995ji2 ji26 = new C49995ji2();
                        if (bArr3 != null && bArr3.length > 0) {
                            ji26.parseFrom(bArr3);
                        }
                        prVar.f184890h = ji26;
                    }
                    return 0;
                case 7:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C49995ji2 ji27 = new C49995ji2();
                        if (bArr4 != null && bArr4.length > 0) {
                            ji27.parseFrom(bArr4);
                        }
                        prVar.f184891i = ji27;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
