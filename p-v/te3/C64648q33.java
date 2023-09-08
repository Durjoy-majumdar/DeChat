package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.q33 */
public class C64648q33 extends C101820nt3 {

    /* renamed from: d */
    public int f184951d;

    /* renamed from: e */
    public int f184952e;

    /* renamed from: f */
    public C89349b f184953f;

    /* renamed from: g */
    public int f184954g;

    /* renamed from: h */
    public C89349b f184955h;

    /* renamed from: i */
    public String f184956i;

    /* renamed from: j */
    public String f184957j;

    /* renamed from: n */
    public String f184958n;

    /* renamed from: o */
    public int f184959o;

    /* renamed from: p */
    public int f184960p;

    /* renamed from: q */
    public int f184961q = 2;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64648q33)) {
            return false;
        }
        C64648q33 q332 = (C64648q33) aVar;
        return C46238a.m51546a(this.BaseRequest, q332.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f184951d), Integer.valueOf(q332.f184951d)) && C46238a.m51546a(Integer.valueOf(this.f184952e), Integer.valueOf(q332.f184952e)) && C46238a.m51546a(this.f184953f, q332.f184953f) && C46238a.m51546a(Integer.valueOf(this.f184954g), Integer.valueOf(q332.f184954g)) && C46238a.m51546a(this.f184955h, q332.f184955h) && C46238a.m51546a(this.f184956i, q332.f184956i) && C46238a.m51546a(this.f184957j, q332.f184957j) && C46238a.m51546a(this.f184958n, q332.f184958n) && C46238a.m51546a(Integer.valueOf(this.f184959o), Integer.valueOf(q332.f184959o)) && C46238a.m51546a(Integer.valueOf(this.f184960p), Integer.valueOf(q332.f184960p)) && C46238a.m51546a(Integer.valueOf(this.f184961q), Integer.valueOf(q332.f184961q));
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
            aVar.mo74318e(2, this.f184951d);
            aVar.mo74318e(3, this.f184952e);
            C89349b bVar = this.f184953f;
            if (bVar != null) {
                aVar.mo74315b(4, bVar);
            }
            aVar.mo74318e(5, this.f184954g);
            C89349b bVar2 = this.f184955h;
            if (bVar2 != null) {
                aVar.mo74315b(6, bVar2);
            }
            String str = this.f184956i;
            if (str != null) {
                aVar.mo74323j(7, str);
            }
            String str2 = this.f184957j;
            if (str2 != null) {
                aVar.mo74323j(8, str2);
            }
            String str3 = this.f184958n;
            if (str3 != null) {
                aVar.mo74323j(9, str3);
            }
            aVar.mo74318e(10, this.f184959o);
            aVar.mo74318e(11, this.f184960p);
            aVar.mo74318e(12, this.f184961q);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f184951d) + C52418a.m58678e(3, this.f184952e);
            C89349b bVar3 = this.f184953f;
            if (bVar3 != null) {
                e += C52418a.m58675b(4, bVar3);
            }
            int e2 = e + C52418a.m58678e(5, this.f184954g);
            C89349b bVar4 = this.f184955h;
            if (bVar4 != null) {
                e2 += C52418a.m58675b(6, bVar4);
            }
            String str4 = this.f184956i;
            if (str4 != null) {
                e2 += C52418a.m58683j(7, str4);
            }
            String str5 = this.f184957j;
            if (str5 != null) {
                e2 += C52418a.m58683j(8, str5);
            }
            String str6 = this.f184958n;
            if (str6 != null) {
                e2 += C52418a.m58683j(9, str6);
            }
            return e2 + C52418a.m58678e(10, this.f184959o) + C52418a.m58678e(11, this.f184960p) + C52418a.m58678e(12, this.f184961q);
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
            C64648q33 q332 = objArr[1];
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
                        q332.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    q332.f184951d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    q332.f184952e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    q332.f184953f = aVar3.mo141626d(intValue);
                    return 0;
                case 5:
                    q332.f184954g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    q332.f184955h = aVar3.mo141626d(intValue);
                    return 0;
                case 7:
                    q332.f184956i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    q332.f184957j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    q332.f184958n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    q332.f184959o = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    q332.f184960p = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    q332.f184961q = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
