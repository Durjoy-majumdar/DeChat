package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.h70 */
public class C64413h70 extends C101820nt3 {

    /* renamed from: d */
    public C51018qv3 f183415d;

    /* renamed from: e */
    public int f183416e;

    /* renamed from: f */
    public String f183417f;

    /* renamed from: g */
    public String f183418g;

    /* renamed from: h */
    public String f183419h;

    /* renamed from: i */
    public String f183420i;

    /* renamed from: j */
    public String f183421j;

    /* renamed from: n */
    public String f183422n;

    /* renamed from: o */
    public int f183423o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64413h70)) {
            return false;
        }
        C64413h70 h702 = (C64413h70) aVar;
        return C46238a.m51546a(this.BaseRequest, h702.BaseRequest) && C46238a.m51546a(this.f183415d, h702.f183415d) && C46238a.m51546a(Integer.valueOf(this.f183416e), Integer.valueOf(h702.f183416e)) && C46238a.m51546a(this.f183417f, h702.f183417f) && C46238a.m51546a(this.f183418g, h702.f183418g) && C46238a.m51546a(this.f183419h, h702.f183419h) && C46238a.m51546a(this.f183420i, h702.f183420i) && C46238a.m51546a(this.f183421j, h702.f183421j) && C46238a.m51546a(this.f183422n, h702.f183422n) && C46238a.m51546a(Integer.valueOf(this.f183423o), Integer.valueOf(h702.f183423o));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f183415d != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                C51018qv3 qv32 = this.f183415d;
                if (qv32 != null) {
                    aVar.mo74322i(2, qv32.computeSize());
                    this.f183415d.writeFields(aVar);
                }
                aVar.mo74318e(3, this.f183416e);
                String str = this.f183417f;
                if (str != null) {
                    aVar.mo74323j(4, str);
                }
                String str2 = this.f183418g;
                if (str2 != null) {
                    aVar.mo74323j(5, str2);
                }
                String str3 = this.f183419h;
                if (str3 != null) {
                    aVar.mo74323j(6, str3);
                }
                String str4 = this.f183420i;
                if (str4 != null) {
                    aVar.mo74323j(7, str4);
                }
                String str5 = this.f183421j;
                if (str5 != null) {
                    aVar.mo74323j(8, str5);
                }
                String str6 = this.f183422n;
                if (str6 != null) {
                    aVar.mo74323j(9, str6);
                }
                aVar.mo74318e(10, this.f183423o);
                return 0;
            }
            throw new C52419b("Not all required fields were included: RandomEncryKey");
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C51018qv3 qv33 = this.f183415d;
            if (qv33 != null) {
                i2 += C52418a.m58682i(2, qv33.computeSize());
            }
            int e = i2 + C52418a.m58678e(3, this.f183416e);
            String str7 = this.f183417f;
            if (str7 != null) {
                e += C52418a.m58683j(4, str7);
            }
            String str8 = this.f183418g;
            if (str8 != null) {
                e += C52418a.m58683j(5, str8);
            }
            String str9 = this.f183419h;
            if (str9 != null) {
                e += C52418a.m58683j(6, str9);
            }
            String str10 = this.f183420i;
            if (str10 != null) {
                e += C52418a.m58683j(7, str10);
            }
            String str11 = this.f183421j;
            if (str11 != null) {
                e += C52418a.m58683j(8, str11);
            }
            String str12 = this.f183422n;
            if (str12 != null) {
                e += C52418a.m58683j(9, str12);
            }
            return e + C52418a.m58678e(10, this.f183423o);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f183415d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: RandomEncryKey");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C64413h70 h702 = objArr[1];
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
                        h702.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C51018qv3 qv34 = new C51018qv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            qv34.mo73348f(bArr2);
                        }
                        h702.f183415d = qv34;
                    }
                    return 0;
                case 3:
                    h702.f183416e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    h702.f183417f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    h702.f183418g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    h702.f183419h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    h702.f183420i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    h702.f183421j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    h702.f183422n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    h702.f183423o = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
