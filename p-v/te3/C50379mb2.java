package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.mb2 */
public class C50379mb2 extends C101820nt3 {

    /* renamed from: d */
    public C51163rv3 f137938d;

    /* renamed from: e */
    public C51163rv3 f137939e;

    /* renamed from: f */
    public C51163rv3 f137940f;

    /* renamed from: g */
    public C51018qv3 f137941g;

    /* renamed from: h */
    public C51018qv3 f137942h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50379mb2)) {
            return false;
        }
        C50379mb2 mb22 = (C50379mb2) aVar;
        return C46238a.m51546a(this.BaseRequest, mb22.BaseRequest) && C46238a.m51546a(this.f137938d, mb22.f137938d) && C46238a.m51546a(this.f137939e, mb22.f137939e) && C46238a.m51546a(this.f137940f, mb22.f137940f) && C46238a.m51546a(this.f137941g, mb22.f137941g) && C46238a.m51546a(this.f137942h, mb22.f137942h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f137938d == null) {
                throw new C52419b("Not all required fields were included: UserName");
            } else if (this.f137939e != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                C51163rv3 rv32 = this.f137938d;
                if (rv32 != null) {
                    aVar.mo74322i(2, rv32.computeSize());
                    this.f137938d.writeFields(aVar);
                }
                C51163rv3 rv33 = this.f137939e;
                if (rv33 != null) {
                    aVar.mo74322i(3, rv33.computeSize());
                    this.f137939e.writeFields(aVar);
                }
                C51163rv3 rv34 = this.f137940f;
                if (rv34 != null) {
                    aVar.mo74322i(4, rv34.computeSize());
                    this.f137940f.writeFields(aVar);
                }
                C51018qv3 qv32 = this.f137941g;
                if (qv32 != null) {
                    aVar.mo74322i(5, qv32.computeSize());
                    this.f137941g.writeFields(aVar);
                }
                C51018qv3 qv33 = this.f137942h;
                if (qv33 != null) {
                    aVar.mo74322i(6, qv33.computeSize());
                    this.f137942h.writeFields(aVar);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: Pwd");
            }
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C51163rv3 rv35 = this.f137938d;
            if (rv35 != null) {
                i2 += C52418a.m58682i(2, rv35.computeSize());
            }
            C51163rv3 rv36 = this.f137939e;
            if (rv36 != null) {
                i2 += C52418a.m58682i(3, rv36.computeSize());
            }
            C51163rv3 rv37 = this.f137940f;
            if (rv37 != null) {
                i2 += C52418a.m58682i(4, rv37.computeSize());
            }
            C51018qv3 qv34 = this.f137941g;
            if (qv34 != null) {
                i2 += C52418a.m58682i(5, qv34.computeSize());
            }
            C51018qv3 qv35 = this.f137942h;
            return qv35 != null ? i2 + C52418a.m58682i(6, qv35.computeSize()) : i2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f137938d == null) {
                throw new C52419b("Not all required fields were included: UserName");
            } else if (this.f137939e != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: Pwd");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C50379mb2 mb22 = objArr[1];
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
                        mb22.BaseRequest = iaVar3;
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
                        mb22.f137938d = rv38;
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
                        mb22.f137939e = rv39;
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
                        mb22.f137940f = rv310;
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i7 = 0; i7 < size5; i7++) {
                        byte[] bArr5 = j5.get(i7);
                        C51018qv3 qv36 = new C51018qv3();
                        if (bArr5 != null && bArr5.length > 0) {
                            qv36.mo73348f(bArr5);
                        }
                        mb22.f137941g = qv36;
                    }
                    return 0;
                case 6:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i8 = 0; i8 < size6; i8++) {
                        byte[] bArr6 = j6.get(i8);
                        C51018qv3 qv37 = new C51018qv3();
                        if (bArr6 != null && bArr6.length > 0) {
                            qv37.mo73348f(bArr6);
                        }
                        mb22.f137942h = qv37;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
