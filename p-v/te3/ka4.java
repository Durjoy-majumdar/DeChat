package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class ka4 extends C101820nt3 {

    /* renamed from: d */
    public C89349b f354069d;

    /* renamed from: e */
    public String f354070e;

    /* renamed from: f */
    public String f354071f;

    /* renamed from: g */
    public String f354072g;

    /* renamed from: h */
    public int f354073h;

    /* renamed from: i */
    public int f354074i;

    /* renamed from: j */
    public int f354075j;

    /* renamed from: n */
    public int f354076n;

    /* renamed from: o */
    public ha4 f354077o;

    /* renamed from: p */
    public ha4 f354078p;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ka4)) {
            return false;
        }
        ka4 ka4 = (ka4) aVar;
        return C46238a.m51546a(this.BaseRequest, ka4.BaseRequest) && C46238a.m51546a(this.f354069d, ka4.f354069d) && C46238a.m51546a(this.f354070e, ka4.f354070e) && C46238a.m51546a(this.f354071f, ka4.f354071f) && C46238a.m51546a(this.f354072g, ka4.f354072g) && C46238a.m51546a(Integer.valueOf(this.f354073h), Integer.valueOf(ka4.f354073h)) && C46238a.m51546a(Integer.valueOf(this.f354074i), Integer.valueOf(ka4.f354074i)) && C46238a.m51546a(Integer.valueOf(this.f354075j), Integer.valueOf(ka4.f354075j)) && C46238a.m51546a(Integer.valueOf(this.f354076n), Integer.valueOf(ka4.f354076n)) && C46238a.m51546a(this.f354077o, ka4.f354077o) && C46238a.m51546a(this.f354078p, ka4.f354078p);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            if (this.f354069d == null) {
                throw new C52419b("Not all required fields were included: ctx");
            } else if (this.f354070e == null) {
                throw new C52419b("Not all required fields were included: network_type");
            } else if (this.f354071f == null) {
                throw new C52419b("Not all required fields were included: network_info");
            } else if (this.f354072g != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                C89349b bVar = this.f354069d;
                if (bVar != null) {
                    aVar.mo74315b(2, bVar);
                }
                String str = this.f354070e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                String str2 = this.f354071f;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                String str3 = this.f354072g;
                if (str3 != null) {
                    aVar.mo74323j(5, str3);
                }
                aVar.mo74318e(6, this.f354073h);
                aVar.mo74318e(7, this.f354074i);
                aVar.mo74318e(8, this.f354075j);
                aVar.mo74318e(9, this.f354076n);
                ha4 ha4 = this.f354077o;
                if (ha4 != null) {
                    aVar.mo74322i(10, ha4.computeSize());
                    this.f354077o.writeFields(aVar);
                }
                ha4 ha42 = this.f354078p;
                if (ha42 != null) {
                    aVar.mo74322i(11, ha42.computeSize());
                    this.f354078p.writeFields(aVar);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: device_info");
            }
        } else if (i2 == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i3 = C52418a.m58682i(1, iaVar2.computeSize()) + 0;
            }
            C89349b bVar2 = this.f354069d;
            if (bVar2 != null) {
                i3 += C52418a.m58675b(2, bVar2);
            }
            String str4 = this.f354070e;
            if (str4 != null) {
                i3 += C52418a.m58683j(3, str4);
            }
            String str5 = this.f354071f;
            if (str5 != null) {
                i3 += C52418a.m58683j(4, str5);
            }
            String str6 = this.f354072g;
            if (str6 != null) {
                i3 += C52418a.m58683j(5, str6);
            }
            int e = i3 + C52418a.m58678e(6, this.f354073h) + C52418a.m58678e(7, this.f354074i) + C52418a.m58678e(8, this.f354075j) + C52418a.m58678e(9, this.f354076n);
            ha4 ha43 = this.f354077o;
            if (ha43 != null) {
                e += C52418a.m58682i(10, ha43.computeSize());
            }
            ha4 ha44 = this.f354078p;
            return ha44 != null ? e + C52418a.m58682i(11, ha44.computeSize()) : e;
        } else if (i2 == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f354069d == null) {
                throw new C52419b("Not all required fields were included: ctx");
            } else if (this.f354070e == null) {
                throw new C52419b("Not all required fields were included: network_type");
            } else if (this.f354071f == null) {
                throw new C52419b("Not all required fields were included: network_info");
            } else if (this.f354072g != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: device_info");
            }
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            ka4 ka4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C90417ia iaVar3 = new C90417ia();
                        if (bArr != null && bArr.length > 0) {
                            iaVar3.parseFrom(bArr);
                        }
                        ka4.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    ka4.f354069d = aVar3.mo141626d(intValue);
                    return 0;
                case 3:
                    ka4.f354070e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    ka4.f354071f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    ka4.f354072g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    ka4.f354073h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    ka4.f354074i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    ka4.f354075j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    ka4.f354076n = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        ha4 ha45 = new ha4();
                        if (bArr2 != null && bArr2.length > 0) {
                            ha45.parseFrom(bArr2);
                        }
                        ka4.f354077o = ha45;
                    }
                    return 0;
                case 11:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        ha4 ha46 = new ha4();
                        if (bArr3 != null && bArr3.length > 0) {
                            ha46.parseFrom(bArr3);
                        }
                        ka4.f354078p = ha46;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
