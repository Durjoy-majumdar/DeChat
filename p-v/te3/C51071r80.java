package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.r80 */
public class C51071r80 extends C101820nt3 {

    /* renamed from: d */
    public C89349b f140754d;

    /* renamed from: e */
    public C89349b f140755e;

    /* renamed from: f */
    public String f140756f;

    /* renamed from: g */
    public String f140757g;

    /* renamed from: h */
    public int f140758h;

    /* renamed from: i */
    public String f140759i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51071r80)) {
            return false;
        }
        C51071r80 r802 = (C51071r80) aVar;
        return C46238a.m51546a(this.BaseRequest, r802.BaseRequest) && C46238a.m51546a(this.f140754d, r802.f140754d) && C46238a.m51546a(this.f140755e, r802.f140755e) && C46238a.m51546a(this.f140756f, r802.f140756f) && C46238a.m51546a(this.f140757g, r802.f140757g) && C46238a.m51546a(Integer.valueOf(this.f140758h), Integer.valueOf(r802.f140758h)) && C46238a.m51546a(this.f140759i, r802.f140759i);
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
            C89349b bVar = this.f140754d;
            if (bVar != null) {
                aVar.mo74315b(2, bVar);
            }
            C89349b bVar2 = this.f140755e;
            if (bVar2 != null) {
                aVar.mo74315b(3, bVar2);
            }
            String str = this.f140756f;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            String str2 = this.f140757g;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            aVar.mo74318e(6, this.f140758h);
            String str3 = this.f140759i;
            if (str3 != null) {
                aVar.mo74323j(101, str3);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C89349b bVar3 = this.f140754d;
            if (bVar3 != null) {
                i2 += C52418a.m58675b(2, bVar3);
            }
            C89349b bVar4 = this.f140755e;
            if (bVar4 != null) {
                i2 += C52418a.m58675b(3, bVar4);
            }
            String str4 = this.f140756f;
            if (str4 != null) {
                i2 += C52418a.m58683j(4, str4);
            }
            String str5 = this.f140757g;
            if (str5 != null) {
                i2 += C52418a.m58683j(5, str5);
            }
            int e = i2 + C52418a.m58678e(6, this.f140758h);
            String str6 = this.f140759i;
            return str6 != null ? e + C52418a.m58683j(101, str6) : e;
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
            C51071r80 r802 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue != 101) {
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
                            r802.BaseRequest = iaVar3;
                        }
                        return 0;
                    case 2:
                        r802.f140754d = aVar3.mo141626d(intValue);
                        return 0;
                    case 3:
                        r802.f140755e = aVar3.mo141626d(intValue);
                        return 0;
                    case 4:
                        r802.f140756f = aVar3.mo141633k(intValue);
                        return 0;
                    case 5:
                        r802.f140757g = aVar3.mo141633k(intValue);
                        return 0;
                    case 6:
                        r802.f140758h = aVar3.mo141629g(intValue);
                        return 0;
                    default:
                        return -1;
                }
            } else {
                r802.f140759i = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
