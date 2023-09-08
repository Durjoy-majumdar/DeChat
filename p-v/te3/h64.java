package te3;

import com.tencent.p014mm.protocal.protobuf.SnsObject;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class h64 extends C47465a {

    /* renamed from: d */
    public SnsObject f134464d;

    /* renamed from: e */
    public C51163rv3 f134465e;

    /* renamed from: f */
    public C51163rv3 f134466f;

    /* renamed from: g */
    public C51163rv3 f134467g;

    /* renamed from: h */
    public C51163rv3 f134468h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof h64)) {
            return false;
        }
        h64 h64 = (h64) aVar;
        return C46238a.m51546a(this.f134464d, h64.f134464d) && C46238a.m51546a(this.f134465e, h64.f134465e) && C46238a.m51546a(this.f134466f, h64.f134466f) && C46238a.m51546a(this.f134467g, h64.f134467g) && C46238a.m51546a(this.f134468h, h64.f134468h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            SnsObject snsObject = this.f134464d;
            if (snsObject != null) {
                if (snsObject != null) {
                    aVar.mo74322i(1, snsObject.computeSize());
                    this.f134464d.writeFields(aVar);
                }
                C51163rv3 rv32 = this.f134465e;
                if (rv32 != null) {
                    aVar.mo74322i(2, rv32.computeSize());
                    this.f134465e.writeFields(aVar);
                }
                C51163rv3 rv33 = this.f134466f;
                if (rv33 != null) {
                    aVar.mo74322i(3, rv33.computeSize());
                    this.f134466f.writeFields(aVar);
                }
                C51163rv3 rv34 = this.f134467g;
                if (rv34 != null) {
                    aVar.mo74322i(4, rv34.computeSize());
                    this.f134467g.writeFields(aVar);
                }
                C51163rv3 rv35 = this.f134468h;
                if (rv35 != null) {
                    aVar.mo74322i(5, rv35.computeSize());
                    this.f134468h.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: SnsObject");
        } else if (i == 1) {
            SnsObject snsObject2 = this.f134464d;
            if (snsObject2 != null) {
                i2 = 0 + C52418a.m58682i(1, snsObject2.computeSize());
            }
            C51163rv3 rv36 = this.f134465e;
            if (rv36 != null) {
                i2 += C52418a.m58682i(2, rv36.computeSize());
            }
            C51163rv3 rv37 = this.f134466f;
            if (rv37 != null) {
                i2 += C52418a.m58682i(3, rv37.computeSize());
            }
            C51163rv3 rv38 = this.f134467g;
            if (rv38 != null) {
                i2 += C52418a.m58682i(4, rv38.computeSize());
            }
            C51163rv3 rv39 = this.f134468h;
            return rv39 != null ? i2 + C52418a.m58682i(5, rv39.computeSize()) : i2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f134464d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: SnsObject");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            h64 h64 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    SnsObject snsObject3 = new SnsObject();
                    if (bArr != null && bArr.length > 0) {
                        snsObject3.parseFrom(bArr);
                    }
                    h64.f134464d = snsObject3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C51163rv3 rv310 = new C51163rv3();
                    if (bArr2 != null && bArr2.length > 0) {
                        rv310.mo73356d(bArr2);
                    }
                    h64.f134465e = rv310;
                }
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C51163rv3 rv311 = new C51163rv3();
                    if (bArr3 != null && bArr3.length > 0) {
                        rv311.mo73356d(bArr3);
                    }
                    h64.f134466f = rv311;
                }
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                int size4 = j4.size();
                for (int i6 = 0; i6 < size4; i6++) {
                    byte[] bArr4 = j4.get(i6);
                    C51163rv3 rv312 = new C51163rv3();
                    if (bArr4 != null && bArr4.length > 0) {
                        rv312.mo73356d(bArr4);
                    }
                    h64.f134467g = rv312;
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                int size5 = j5.size();
                for (int i7 = 0; i7 < size5; i7++) {
                    byte[] bArr5 = j5.get(i7);
                    C51163rv3 rv313 = new C51163rv3();
                    if (bArr5 != null && bArr5.length > 0) {
                        rv313.mo73356d(bArr5);
                    }
                    h64.f134468h = rv313;
                }
                return 0;
            }
        }
    }
}
