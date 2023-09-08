package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.e42 */
public class C49232e42 extends C49335eu3 {

    /* renamed from: d */
    public int f132678d;

    /* renamed from: e */
    public String f132679e;

    /* renamed from: f */
    public int f132680f;

    /* renamed from: g */
    public int f132681g;

    /* renamed from: h */
    public C50936qa3 f132682h;

    /* renamed from: i */
    public C51081ra3 f132683i;

    /* renamed from: j */
    public C51081ra3 f132684j;

    /* renamed from: n */
    public C51217sa3 f132685n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49232e42)) {
            return false;
        }
        C49232e42 e422 = (C49232e42) aVar;
        return C46238a.m51546a(this.BaseResponse, e422.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f132678d), Integer.valueOf(e422.f132678d)) && C46238a.m51546a(this.f132679e, e422.f132679e) && C46238a.m51546a(Integer.valueOf(this.f132680f), Integer.valueOf(e422.f132680f)) && C46238a.m51546a(Integer.valueOf(this.f132681g), Integer.valueOf(e422.f132681g)) && C46238a.m51546a(this.f132682h, e422.f132682h) && C46238a.m51546a(this.f132683i, e422.f132683i) && C46238a.m51546a(this.f132684j, e422.f132684j) && C46238a.m51546a(this.f132685n, e422.f132685n);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                aVar.mo74318e(2, this.f132678d);
                String str = this.f132679e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                aVar.mo74318e(4, this.f132680f);
                aVar.mo74318e(5, this.f132681g);
                C50936qa3 qa32 = this.f132682h;
                if (qa32 != null) {
                    aVar.mo74322i(6, qa32.computeSize());
                    this.f132682h.writeFields(aVar);
                }
                C51081ra3 ra32 = this.f132683i;
                if (ra32 != null) {
                    aVar.mo74322i(7, ra32.computeSize());
                    this.f132683i.writeFields(aVar);
                }
                C51081ra3 ra33 = this.f132684j;
                if (ra33 != null) {
                    aVar.mo74322i(8, ra33.computeSize());
                    this.f132684j.writeFields(aVar);
                }
                C51217sa3 sa32 = this.f132685n;
                if (sa32 != null) {
                    aVar.mo74322i(9, sa32.computeSize());
                    this.f132685n.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f132678d);
            String str2 = this.f132679e;
            if (str2 != null) {
                e += C52418a.m58683j(3, str2);
            }
            int e2 = e + C52418a.m58678e(4, this.f132680f) + C52418a.m58678e(5, this.f132681g);
            C50936qa3 qa33 = this.f132682h;
            if (qa33 != null) {
                e2 += C52418a.m58682i(6, qa33.computeSize());
            }
            C51081ra3 ra34 = this.f132683i;
            if (ra34 != null) {
                e2 += C52418a.m58682i(7, ra34.computeSize());
            }
            C51081ra3 ra35 = this.f132684j;
            if (ra35 != null) {
                e2 += C52418a.m58682i(8, ra35.computeSize());
            }
            C51217sa3 sa33 = this.f132685n;
            return sa33 != null ? e2 + C52418a.m58682i(9, sa33.computeSize()) : e2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C49232e42 e422 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C49966ja jaVar3 = new C49966ja();
                        if (bArr != null && bArr.length > 0) {
                            jaVar3.parseFrom(bArr);
                        }
                        e422.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    e422.f132678d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    e422.f132679e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    e422.f132680f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    e422.f132681g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C50936qa3 qa34 = new C50936qa3();
                        if (bArr2 != null && bArr2.length > 0) {
                            qa34.parseFrom(bArr2);
                        }
                        e422.f132682h = qa34;
                    }
                    return 0;
                case 7:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C51081ra3 ra36 = new C51081ra3();
                        if (bArr3 != null && bArr3.length > 0) {
                            ra36.parseFrom(bArr3);
                        }
                        e422.f132683i = ra36;
                    }
                    return 0;
                case 8:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C51081ra3 ra37 = new C51081ra3();
                        if (bArr4 != null && bArr4.length > 0) {
                            ra37.parseFrom(bArr4);
                        }
                        e422.f132684j = ra37;
                    }
                    return 0;
                case 9:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i7 = 0; i7 < size5; i7++) {
                        byte[] bArr5 = j5.get(i7);
                        C51217sa3 sa34 = new C51217sa3();
                        if (bArr5 != null && bArr5.length > 0) {
                            sa34.parseFrom(bArr5);
                        }
                        e422.f132685n = sa34;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
