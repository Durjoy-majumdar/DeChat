package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.fh3 */
public class C49424fh3 extends C101820nt3 {

    /* renamed from: d */
    public String f133500d;

    /* renamed from: e */
    public String f133501e;

    /* renamed from: f */
    public int f133502f;

    /* renamed from: g */
    public long f133503g;

    /* renamed from: h */
    public int f133504h;

    /* renamed from: i */
    public long f133505i;

    /* renamed from: j */
    public C51526uc2 f133506j;

    /* renamed from: n */
    public int f133507n;

    /* renamed from: o */
    public String f133508o;

    /* renamed from: p */
    public String f133509p;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49424fh3)) {
            return false;
        }
        C49424fh3 fh32 = (C49424fh3) aVar;
        return C46238a.m51546a(this.BaseRequest, fh32.BaseRequest) && C46238a.m51546a(this.f133500d, fh32.f133500d) && C46238a.m51546a(this.f133501e, fh32.f133501e) && C46238a.m51546a(Integer.valueOf(this.f133502f), Integer.valueOf(fh32.f133502f)) && C46238a.m51546a(Long.valueOf(this.f133503g), Long.valueOf(fh32.f133503g)) && C46238a.m51546a(Integer.valueOf(this.f133504h), Integer.valueOf(fh32.f133504h)) && C46238a.m51546a(Long.valueOf(this.f133505i), Long.valueOf(fh32.f133505i)) && C46238a.m51546a(this.f133506j, fh32.f133506j) && C46238a.m51546a(Integer.valueOf(this.f133507n), Integer.valueOf(fh32.f133507n)) && C46238a.m51546a(this.f133508o, fh32.f133508o) && C46238a.m51546a(this.f133509p, fh32.f133509p);
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
            String str = this.f133500d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f133501e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74318e(4, this.f133502f);
            aVar.mo74321h(5, this.f133503g);
            aVar.mo74318e(10, this.f133504h);
            aVar.mo74321h(11, this.f133505i);
            C51526uc2 uc22 = this.f133506j;
            if (uc22 != null) {
                aVar.mo74322i(12, uc22.computeSize());
                this.f133506j.writeFields(aVar);
            }
            aVar.mo74318e(100, this.f133507n);
            String str3 = this.f133508o;
            if (str3 != null) {
                aVar.mo74323j(101, str3);
            }
            String str4 = this.f133509p;
            if (str4 != null) {
                aVar.mo74323j(102, str4);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str5 = this.f133500d;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            String str6 = this.f133501e;
            if (str6 != null) {
                i2 += C52418a.m58683j(3, str6);
            }
            int e = i2 + C52418a.m58678e(4, this.f133502f) + C52418a.m58681h(5, this.f133503g) + C52418a.m58678e(10, this.f133504h) + C52418a.m58681h(11, this.f133505i);
            C51526uc2 uc23 = this.f133506j;
            if (uc23 != null) {
                e += C52418a.m58682i(12, uc23.computeSize());
            }
            int e2 = e + C52418a.m58678e(100, this.f133507n);
            String str7 = this.f133508o;
            if (str7 != null) {
                e2 += C52418a.m58683j(101, str7);
            }
            String str8 = this.f133509p;
            return str8 != null ? e2 + C52418a.m58683j(102, str8) : e2;
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
            C49424fh3 fh32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C90417ia iaVar3 = new C90417ia();
                    if (bArr != null && bArr.length > 0) {
                        iaVar3.parseFrom(bArr);
                    }
                    fh32.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                fh32.f133500d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                fh32.f133501e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                fh32.f133502f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                switch (intValue) {
                    case 10:
                        fh32.f133504h = aVar3.mo141629g(intValue);
                        return 0;
                    case 11:
                        fh32.f133505i = aVar3.mo141631i(intValue);
                        return 0;
                    case 12:
                        LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                        int size2 = j2.size();
                        for (int i4 = 0; i4 < size2; i4++) {
                            byte[] bArr2 = j2.get(i4);
                            C51526uc2 uc24 = new C51526uc2();
                            if (bArr2 != null && bArr2.length > 0) {
                                uc24.parseFrom(bArr2);
                            }
                            fh32.f133506j = uc24;
                        }
                        return 0;
                    default:
                        switch (intValue) {
                            case 100:
                                fh32.f133507n = aVar3.mo141629g(intValue);
                                return 0;
                            case 101:
                                fh32.f133508o = aVar3.mo141633k(intValue);
                                return 0;
                            case 102:
                                fh32.f133509p = aVar3.mo141633k(intValue);
                                return 0;
                            default:
                                return -1;
                        }
                }
            } else {
                fh32.f133503g = aVar3.mo141631i(intValue);
                return 0;
            }
        }
    }
}
