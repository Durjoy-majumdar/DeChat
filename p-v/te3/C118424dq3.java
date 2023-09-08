package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.dq3 */
public class C118424dq3 extends C101820nt3 {

    /* renamed from: d */
    public String f353949d;

    /* renamed from: e */
    public int f353950e;

    /* renamed from: f */
    public ep4 f353951f;

    /* renamed from: g */
    public int f353952g;

    /* renamed from: h */
    public ii4 f353953h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C118424dq3)) {
            return false;
        }
        C118424dq3 dq32 = (C118424dq3) aVar;
        return C46238a.m51546a(this.BaseRequest, dq32.BaseRequest) && C46238a.m51546a(this.f353949d, dq32.f353949d) && C46238a.m51546a(Integer.valueOf(this.f353950e), Integer.valueOf(dq32.f353950e)) && C46238a.m51546a(this.f353951f, dq32.f353951f) && C46238a.m51546a(Integer.valueOf(this.f353952g), Integer.valueOf(dq32.f353952g)) && C46238a.m51546a(this.f353953h, dq32.f353953h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f353951f != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                String str = this.f353949d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                aVar.mo74318e(3, this.f353950e);
                ep4 ep4 = this.f353951f;
                if (ep4 != null) {
                    aVar.mo74322i(4, ep4.computeSize());
                    this.f353951f.writeFields(aVar);
                }
                aVar.mo74318e(5, this.f353952g);
                ii4 ii4 = this.f353953h;
                if (ii4 != null) {
                    aVar.mo74322i(6, ii4.computeSize());
                    this.f353953h.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: UserPosition");
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str2 = this.f353949d;
            if (str2 != null) {
                i2 += C52418a.m58683j(2, str2);
            }
            int e = i2 + C52418a.m58678e(3, this.f353950e);
            ep4 ep42 = this.f353951f;
            if (ep42 != null) {
                e += C52418a.m58682i(4, ep42.computeSize());
            }
            int e2 = e + C52418a.m58678e(5, this.f353952g);
            ii4 ii42 = this.f353953h;
            return ii42 != null ? e2 + C52418a.m58682i(6, ii42.computeSize()) : e2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f353951f != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: UserPosition");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C118424dq3 dq32 = objArr[1];
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
                        dq32.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    dq32.f353949d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    dq32.f353950e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        ep4 ep43 = new ep4();
                        if (bArr2 != null && bArr2.length > 0) {
                            ep43.parseFrom(bArr2);
                        }
                        dq32.f353951f = ep43;
                    }
                    return 0;
                case 5:
                    dq32.f353952g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        ii4 ii43 = new ii4();
                        if (bArr3 != null && bArr3.length > 0) {
                            ii43.parseFrom(bArr3);
                        }
                        dq32.f353953h = ii43;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
