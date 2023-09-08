package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.zi3 */
public class C52269zi3 extends C101820nt3 {

    /* renamed from: d */
    public C51163rv3 f145978d;

    /* renamed from: e */
    public C51163rv3 f145979e;

    /* renamed from: f */
    public C51163rv3 f145980f;

    /* renamed from: g */
    public int f145981g;

    /* renamed from: h */
    public long f145982h;

    /* renamed from: i */
    public int f145983i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52269zi3)) {
            return false;
        }
        C52269zi3 zi32 = (C52269zi3) aVar;
        return C46238a.m51546a(this.BaseRequest, zi32.BaseRequest) && C46238a.m51546a(this.f145978d, zi32.f145978d) && C46238a.m51546a(this.f145979e, zi32.f145979e) && C46238a.m51546a(this.f145980f, zi32.f145980f) && C46238a.m51546a(Integer.valueOf(this.f145981g), Integer.valueOf(zi32.f145981g)) && C46238a.m51546a(Long.valueOf(this.f145982h), Long.valueOf(zi32.f145982h)) && C46238a.m51546a(Integer.valueOf(this.f145983i), Integer.valueOf(zi32.f145983i));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f145978d == null) {
                throw new C52419b("Not all required fields were included: ClientReport");
            } else if (this.f145979e == null) {
                throw new C52419b("Not all required fields were included: ChannelReport");
            } else if (this.f145980f != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                C51163rv3 rv32 = this.f145978d;
                if (rv32 != null) {
                    aVar.mo74322i(2, rv32.computeSize());
                    this.f145978d.writeFields(aVar);
                }
                C51163rv3 rv33 = this.f145979e;
                if (rv33 != null) {
                    aVar.mo74322i(3, rv33.computeSize());
                    this.f145979e.writeFields(aVar);
                }
                C51163rv3 rv34 = this.f145980f;
                if (rv34 != null) {
                    aVar.mo74322i(4, rv34.computeSize());
                    this.f145980f.writeFields(aVar);
                }
                aVar.mo74318e(5, this.f145981g);
                aVar.mo74321h(6, this.f145982h);
                aVar.mo74318e(7, this.f145983i);
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: EngineReport");
            }
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C51163rv3 rv35 = this.f145978d;
            if (rv35 != null) {
                i2 += C52418a.m58682i(2, rv35.computeSize());
            }
            C51163rv3 rv36 = this.f145979e;
            if (rv36 != null) {
                i2 += C52418a.m58682i(3, rv36.computeSize());
            }
            C51163rv3 rv37 = this.f145980f;
            if (rv37 != null) {
                i2 += C52418a.m58682i(4, rv37.computeSize());
            }
            return i2 + C52418a.m58678e(5, this.f145981g) + C52418a.m58681h(6, this.f145982h) + C52418a.m58678e(7, this.f145983i);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f145978d == null) {
                throw new C52419b("Not all required fields were included: ClientReport");
            } else if (this.f145979e == null) {
                throw new C52419b("Not all required fields were included: ChannelReport");
            } else if (this.f145980f != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: EngineReport");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C52269zi3 zi32 = objArr[1];
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
                        zi32.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C51163rv3 rv38 = new C51163rv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            rv38.mo73356d(bArr2);
                        }
                        zi32.f145978d = rv38;
                    }
                    return 0;
                case 3:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C51163rv3 rv39 = new C51163rv3();
                        if (bArr3 != null && bArr3.length > 0) {
                            rv39.mo73356d(bArr3);
                        }
                        zi32.f145979e = rv39;
                    }
                    return 0;
                case 4:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C51163rv3 rv310 = new C51163rv3();
                        if (bArr4 != null && bArr4.length > 0) {
                            rv310.mo73356d(bArr4);
                        }
                        zi32.f145980f = rv310;
                    }
                    return 0;
                case 5:
                    zi32.f145981g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    zi32.f145982h = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    zi32.f145983i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
