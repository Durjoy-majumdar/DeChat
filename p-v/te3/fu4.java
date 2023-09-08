package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class fu4 extends C101820nt3 {

    /* renamed from: d */
    public int f133691d;

    /* renamed from: e */
    public String f133692e;

    /* renamed from: f */
    public int f133693f;

    /* renamed from: g */
    public C89349b f133694g;

    /* renamed from: h */
    public C89349b f133695h;

    /* renamed from: i */
    public long f133696i;

    /* renamed from: j */
    public String f133697j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof fu4)) {
            return false;
        }
        fu4 fu4 = (fu4) aVar;
        return C46238a.m51546a(this.BaseRequest, fu4.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f133691d), Integer.valueOf(fu4.f133691d)) && C46238a.m51546a(this.f133692e, fu4.f133692e) && C46238a.m51546a(Integer.valueOf(this.f133693f), Integer.valueOf(fu4.f133693f)) && C46238a.m51546a(this.f133694g, fu4.f133694g) && C46238a.m51546a(this.f133695h, fu4.f133695h) && C46238a.m51546a(Long.valueOf(this.f133696i), Long.valueOf(fu4.f133696i)) && C46238a.m51546a(this.f133697j, fu4.f133697j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f133692e == null) {
                throw new C52419b("Not all required fields were included: ToBizUserName");
            } else if (this.f133695h != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                aVar.mo74318e(2, this.f133691d);
                String str = this.f133692e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                aVar.mo74318e(4, this.f133693f);
                C89349b bVar = this.f133694g;
                if (bVar != null) {
                    aVar.mo74315b(5, bVar);
                }
                C89349b bVar2 = this.f133695h;
                if (bVar2 != null) {
                    aVar.mo74315b(6, bVar2);
                }
                aVar.mo74321h(7, this.f133696i);
                String str2 = this.f133697j;
                if (str2 != null) {
                    aVar.mo74323j(8, str2);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: CapInfo");
            }
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f133691d);
            String str3 = this.f133692e;
            if (str3 != null) {
                e += C52418a.m58683j(3, str3);
            }
            int e2 = e + C52418a.m58678e(4, this.f133693f);
            C89349b bVar3 = this.f133694g;
            if (bVar3 != null) {
                e2 += C52418a.m58675b(5, bVar3);
            }
            C89349b bVar4 = this.f133695h;
            if (bVar4 != null) {
                e2 += C52418a.m58675b(6, bVar4);
            }
            int h = e2 + C52418a.m58681h(7, this.f133696i);
            String str4 = this.f133697j;
            return str4 != null ? h + C52418a.m58683j(8, str4) : h;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f133692e == null) {
                throw new C52419b("Not all required fields were included: ToBizUserName");
            } else if (this.f133695h != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: CapInfo");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            fu4 fu4 = objArr[1];
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
                        fu4.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    fu4.f133691d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    fu4.f133692e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    fu4.f133693f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    fu4.f133694g = aVar3.mo141626d(intValue);
                    return 0;
                case 6:
                    fu4.f133695h = aVar3.mo141626d(intValue);
                    return 0;
                case 7:
                    fu4.f133696i = aVar3.mo141631i(intValue);
                    return 0;
                case 8:
                    fu4.f133697j = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
