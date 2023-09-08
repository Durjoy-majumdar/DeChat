package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.sz1 */
public class C51317sz1 extends C101820nt3 {

    /* renamed from: d */
    public C51018qv3 f141845d;

    /* renamed from: e */
    public int f141846e;

    /* renamed from: f */
    public int f141847f;

    /* renamed from: g */
    public int f141848g;

    /* renamed from: h */
    public C51018qv3 f141849h;

    /* renamed from: i */
    public String f141850i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51317sz1)) {
            return false;
        }
        C51317sz1 sz12 = (C51317sz1) aVar;
        return C46238a.m51546a(this.BaseRequest, sz12.BaseRequest) && C46238a.m51546a(this.f141845d, sz12.f141845d) && C46238a.m51546a(Integer.valueOf(this.f141846e), Integer.valueOf(sz12.f141846e)) && C46238a.m51546a(Integer.valueOf(this.f141847f), Integer.valueOf(sz12.f141847f)) && C46238a.m51546a(Integer.valueOf(this.f141848g), Integer.valueOf(sz12.f141848g)) && C46238a.m51546a(this.f141849h, sz12.f141849h) && C46238a.m51546a(this.f141850i, sz12.f141850i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f141845d != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                C51018qv3 qv32 = this.f141845d;
                if (qv32 != null) {
                    aVar.mo74322i(2, qv32.computeSize());
                    this.f141845d.writeFields(aVar);
                }
                aVar.mo74318e(3, this.f141846e);
                aVar.mo74318e(4, this.f141847f);
                aVar.mo74318e(5, this.f141848g);
                C51018qv3 qv33 = this.f141849h;
                if (qv33 != null) {
                    aVar.mo74322i(6, qv33.computeSize());
                    this.f141849h.writeFields(aVar);
                }
                String str = this.f141850i;
                if (str != null) {
                    aVar.mo74323j(7, str);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: ReqBuf");
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C51018qv3 qv34 = this.f141845d;
            if (qv34 != null) {
                i2 += C52418a.m58682i(2, qv34.computeSize());
            }
            int e = i2 + C52418a.m58678e(3, this.f141846e) + C52418a.m58678e(4, this.f141847f) + C52418a.m58678e(5, this.f141848g);
            C51018qv3 qv35 = this.f141849h;
            if (qv35 != null) {
                e += C52418a.m58682i(6, qv35.computeSize());
            }
            String str2 = this.f141850i;
            return str2 != null ? e + C52418a.m58683j(7, str2) : e;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f141845d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: ReqBuf");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C51317sz1 sz12 = objArr[1];
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
                        sz12.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C51018qv3 qv36 = new C51018qv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            qv36.mo73348f(bArr2);
                        }
                        sz12.f141845d = qv36;
                    }
                    return 0;
                case 3:
                    sz12.f141846e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    sz12.f141847f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    sz12.f141848g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C51018qv3 qv37 = new C51018qv3();
                        if (bArr3 != null && bArr3.length > 0) {
                            qv37.mo73348f(bArr3);
                        }
                        sz12.f141849h = qv37;
                    }
                    return 0;
                case 7:
                    sz12.f141850i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
