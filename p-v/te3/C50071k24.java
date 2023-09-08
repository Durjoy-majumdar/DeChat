package te3;

import if0.C46238a;
import java.util.LinkedList;
import ob0.C47350c;
import ob0.C89132b;
import ol0.C117820l0;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.k24 */
public class C50071k24 extends C101820nt3 {

    /* renamed from: d */
    public String f136519d;

    /* renamed from: e */
    public String f136520e;

    /* renamed from: f */
    public int f136521f;

    /* renamed from: g */
    public String f136522g;

    /* renamed from: h */
    public int f136523h;

    /* renamed from: i */
    public LinkedList<C50283lm> f136524i = new LinkedList<>();

    /* renamed from: j */
    public int f136525j;

    /* renamed from: b */
    public C89132b<C50206l24> mo73343b() {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = C117820l0.CTRL_INDEX;
        bVar.f127068c = "/cgi-bin/micromsg-bin/setchatroomannouncement";
        bVar.f127066a = this;
        bVar.f127067b = new C50206l24();
        C47350c a = bVar.mo72403a();
        C89132b<C50206l24> bVar2 = new C89132b<>();
        bVar2.mo123453j(a);
        return bVar2;
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50071k24)) {
            return false;
        }
        C50071k24 k242 = (C50071k24) aVar;
        return C46238a.m51546a(this.BaseRequest, k242.BaseRequest) && C46238a.m51546a(this.f136519d, k242.f136519d) && C46238a.m51546a(this.f136520e, k242.f136520e) && C46238a.m51546a(Integer.valueOf(this.f136521f), Integer.valueOf(k242.f136521f)) && C46238a.m51546a(this.f136522g, k242.f136522g) && C46238a.m51546a(Integer.valueOf(this.f136523h), Integer.valueOf(k242.f136523h)) && C46238a.m51546a(this.f136524i, k242.f136524i) && C46238a.m51546a(Integer.valueOf(this.f136525j), Integer.valueOf(k242.f136525j));
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
            String str = this.f136519d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f136520e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74318e(4, this.f136521f);
            String str3 = this.f136522g;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            aVar.mo74318e(6, this.f136523h);
            aVar.mo74320g(7, 8, this.f136524i);
            aVar.mo74318e(8, this.f136525j);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str4 = this.f136519d;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            String str5 = this.f136520e;
            if (str5 != null) {
                i2 += C52418a.m58683j(3, str5);
            }
            int e = i2 + C52418a.m58678e(4, this.f136521f);
            String str6 = this.f136522g;
            if (str6 != null) {
                e += C52418a.m58683j(5, str6);
            }
            return e + C52418a.m58678e(6, this.f136523h) + C52418a.m58680g(7, 8, this.f136524i) + C52418a.m58678e(8, this.f136525j);
        } else if (i == 2) {
            this.f136524i.clear();
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
            C50071k24 k242 = objArr[1];
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
                        k242.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    k242.f136519d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    k242.f136520e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    k242.f136521f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    k242.f136522g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    k242.f136523h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C50283lm lmVar = new C50283lm();
                        if (bArr2 != null && bArr2.length > 0) {
                            lmVar.parseFrom(bArr2);
                        }
                        k242.f136524i.add(lmVar);
                    }
                    return 0;
                case 8:
                    k242.f136525j = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
