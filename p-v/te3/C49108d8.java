package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.d8 */
public class C49108d8 extends C47465a {

    /* renamed from: d */
    public C48968c8 f132171d;

    /* renamed from: e */
    public C50733ou1 f132172e;

    /* renamed from: f */
    public String f132173f;

    /* renamed from: g */
    public String f132174g;

    /* renamed from: h */
    public String f132175h;

    /* renamed from: i */
    public C51888ww3 f132176i;

    /* renamed from: j */
    public C50093k8 f132177j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49108d8)) {
            return false;
        }
        C49108d8 d8Var = (C49108d8) aVar;
        return C46238a.m51546a(this.f132171d, d8Var.f132171d) && C46238a.m51546a(this.f132172e, d8Var.f132172e) && C46238a.m51546a(this.f132173f, d8Var.f132173f) && C46238a.m51546a(this.f132174g, d8Var.f132174g) && C46238a.m51546a(this.f132175h, d8Var.f132175h) && C46238a.m51546a(this.f132176i, d8Var.f132176i) && C46238a.m51546a(this.f132177j, d8Var.f132177j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C48968c8 c8Var = this.f132171d;
            if (c8Var != null) {
                aVar.mo74322i(1, c8Var.computeSize());
                this.f132171d.writeFields(aVar);
            }
            C50733ou1 ou12 = this.f132172e;
            if (ou12 != null) {
                aVar.mo74322i(2, ou12.computeSize());
                this.f132172e.writeFields(aVar);
            }
            String str = this.f132173f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f132174g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f132175h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            C51888ww3 ww32 = this.f132176i;
            if (ww32 != null) {
                aVar.mo74322i(6, ww32.computeSize());
                this.f132176i.writeFields(aVar);
            }
            C50093k8 k8Var = this.f132177j;
            if (k8Var != null) {
                aVar.mo74322i(7, k8Var.computeSize());
                this.f132177j.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C48968c8 c8Var2 = this.f132171d;
            if (c8Var2 != null) {
                i2 = 0 + C52418a.m58682i(1, c8Var2.computeSize());
            }
            C50733ou1 ou13 = this.f132172e;
            if (ou13 != null) {
                i2 += C52418a.m58682i(2, ou13.computeSize());
            }
            String str4 = this.f132173f;
            if (str4 != null) {
                i2 += C52418a.m58683j(3, str4);
            }
            String str5 = this.f132174g;
            if (str5 != null) {
                i2 += C52418a.m58683j(4, str5);
            }
            String str6 = this.f132175h;
            if (str6 != null) {
                i2 += C52418a.m58683j(5, str6);
            }
            C51888ww3 ww33 = this.f132176i;
            if (ww33 != null) {
                i2 += C52418a.m58682i(6, ww33.computeSize());
            }
            C50093k8 k8Var2 = this.f132177j;
            return k8Var2 != null ? i2 + C52418a.m58682i(7, k8Var2.computeSize()) : i2;
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
            C49108d8 d8Var = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C48968c8 c8Var3 = new C48968c8();
                        if (bArr != null && bArr.length > 0) {
                            c8Var3.parseFrom(bArr);
                        }
                        d8Var.f132171d = c8Var3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C50733ou1 ou14 = new C50733ou1();
                        if (bArr2 != null && bArr2.length > 0) {
                            ou14.parseFrom(bArr2);
                        }
                        d8Var.f132172e = ou14;
                    }
                    return 0;
                case 3:
                    d8Var.f132173f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    d8Var.f132174g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    d8Var.f132175h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C51888ww3 ww34 = new C51888ww3();
                        if (bArr3 != null && bArr3.length > 0) {
                            ww34.parseFrom(bArr3);
                        }
                        d8Var.f132176i = ww34;
                    }
                    return 0;
                case 7:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C50093k8 k8Var3 = new C50093k8();
                        if (bArr4 != null && bArr4.length > 0) {
                            k8Var3.parseFrom(bArr4);
                        }
                        d8Var.f132177j = k8Var3;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
