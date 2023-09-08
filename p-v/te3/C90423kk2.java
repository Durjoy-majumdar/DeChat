package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.kk2 */
public class C90423kk2 extends C101820nt3 {

    /* renamed from: d */
    public String f259643d;

    /* renamed from: e */
    public C89349b f259644e;

    /* renamed from: f */
    public String f259645f;

    /* renamed from: g */
    public int f259646g;

    /* renamed from: h */
    public int f259647h;

    /* renamed from: i */
    public w55 f259648i;

    /* renamed from: j */
    public int f259649j;

    /* renamed from: n */
    public String f259650n;

    /* renamed from: o */
    public int f259651o;

    /* renamed from: p */
    public boolean f259652p;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C90423kk2)) {
            return false;
        }
        C90423kk2 kk22 = (C90423kk2) aVar;
        return C46238a.m51546a(this.BaseRequest, kk22.BaseRequest) && C46238a.m51546a(this.f259643d, kk22.f259643d) && C46238a.m51546a(this.f259644e, kk22.f259644e) && C46238a.m51546a(this.f259645f, kk22.f259645f) && C46238a.m51546a(Integer.valueOf(this.f259646g), Integer.valueOf(kk22.f259646g)) && C46238a.m51546a(Integer.valueOf(this.f259647h), Integer.valueOf(kk22.f259647h)) && C46238a.m51546a(this.f259648i, kk22.f259648i) && C46238a.m51546a(Integer.valueOf(this.f259649j), Integer.valueOf(kk22.f259649j)) && C46238a.m51546a(this.f259650n, kk22.f259650n) && C46238a.m51546a(Integer.valueOf(this.f259651o), Integer.valueOf(kk22.f259651o)) && C46238a.m51546a(Boolean.valueOf(this.f259652p), Boolean.valueOf(kk22.f259652p));
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
            String str = this.f259643d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            C89349b bVar = this.f259644e;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            String str2 = this.f259645f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            aVar.mo74318e(5, this.f259646g);
            aVar.mo74318e(6, this.f259647h);
            w55 w55 = this.f259648i;
            if (w55 != null) {
                aVar.mo74322i(7, w55.computeSize());
                this.f259648i.writeFields(aVar);
            }
            aVar.mo74318e(8, this.f259649j);
            String str3 = this.f259650n;
            if (str3 != null) {
                aVar.mo74323j(9, str3);
            }
            aVar.mo74318e(10, this.f259651o);
            aVar.mo74314a(11, this.f259652p);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str4 = this.f259643d;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            C89349b bVar2 = this.f259644e;
            if (bVar2 != null) {
                i2 += C52418a.m58675b(3, bVar2);
            }
            String str5 = this.f259645f;
            if (str5 != null) {
                i2 += C52418a.m58683j(4, str5);
            }
            int e = i2 + C52418a.m58678e(5, this.f259646g) + C52418a.m58678e(6, this.f259647h);
            w55 w552 = this.f259648i;
            if (w552 != null) {
                e += C52418a.m58682i(7, w552.computeSize());
            }
            int e2 = e + C52418a.m58678e(8, this.f259649j);
            String str6 = this.f259650n;
            if (str6 != null) {
                e2 += C52418a.m58683j(9, str6);
            }
            return e2 + C52418a.m58678e(10, this.f259651o) + C52418a.m58674a(11, this.f259652p);
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
            C90423kk2 kk22 = objArr[1];
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
                        kk22.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    kk22.f259643d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    kk22.f259644e = aVar3.mo141626d(intValue);
                    return 0;
                case 4:
                    kk22.f259645f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    kk22.f259646g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    kk22.f259647h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        w55 w553 = new w55();
                        if (bArr2 != null && bArr2.length > 0) {
                            w553.parseFrom(bArr2);
                        }
                        kk22.f259648i = w553;
                    }
                    return 0;
                case 8:
                    kk22.f259649j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    kk22.f259650n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    kk22.f259651o = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    kk22.f259652p = aVar3.mo141625c(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
