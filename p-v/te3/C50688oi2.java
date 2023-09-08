package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.oi2 */
public class C50688oi2 extends C101820nt3 {

    /* renamed from: d */
    public int f139199d;

    /* renamed from: e */
    public LinkedList<C49762hw2> f139200e = new LinkedList<>();

    /* renamed from: f */
    public C51163rv3 f139201f;

    /* renamed from: g */
    public int f139202g;

    /* renamed from: h */
    public String f139203h;

    /* renamed from: i */
    public C50260lg2 f139204i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50688oi2)) {
            return false;
        }
        C50688oi2 oi22 = (C50688oi2) aVar;
        return C46238a.m51546a(this.BaseRequest, oi22.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f139199d), Integer.valueOf(oi22.f139199d)) && C46238a.m51546a(this.f139200e, oi22.f139200e) && C46238a.m51546a(this.f139201f, oi22.f139201f) && C46238a.m51546a(Integer.valueOf(this.f139202g), Integer.valueOf(oi22.f139202g)) && C46238a.m51546a(this.f139203h, oi22.f139203h) && C46238a.m51546a(this.f139204i, oi22.f139204i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f139201f != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                aVar.mo74318e(2, this.f139199d);
                aVar.mo74320g(3, 8, this.f139200e);
                C51163rv3 rv32 = this.f139201f;
                if (rv32 != null) {
                    aVar.mo74322i(4, rv32.computeSize());
                    this.f139201f.writeFields(aVar);
                }
                aVar.mo74318e(5, this.f139202g);
                String str = this.f139203h;
                if (str != null) {
                    aVar.mo74323j(6, str);
                }
                C50260lg2 lg22 = this.f139204i;
                if (lg22 != null) {
                    aVar.mo74322i(7, lg22.computeSize());
                    this.f139204i.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: ChatRoomName");
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f139199d) + C52418a.m58680g(3, 8, this.f139200e);
            C51163rv3 rv33 = this.f139201f;
            if (rv33 != null) {
                e += C52418a.m58682i(4, rv33.computeSize());
            }
            int e2 = e + C52418a.m58678e(5, this.f139202g);
            String str2 = this.f139203h;
            if (str2 != null) {
                e2 += C52418a.m58683j(6, str2);
            }
            C50260lg2 lg23 = this.f139204i;
            return lg23 != null ? e2 + C52418a.m58682i(7, lg23.computeSize()) : e2;
        } else if (i == 2) {
            this.f139200e.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f139201f != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: ChatRoomName");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C50688oi2 oi22 = objArr[1];
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
                        oi22.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    oi22.f139199d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C49762hw2 hw22 = new C49762hw2();
                        if (bArr2 != null && bArr2.length > 0) {
                            hw22.parseFrom(bArr2);
                        }
                        oi22.f139200e.add(hw22);
                    }
                    return 0;
                case 4:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C51163rv3 rv34 = new C51163rv3();
                        if (bArr3 != null && bArr3.length > 0) {
                            rv34.mo73356d(bArr3);
                        }
                        oi22.f139201f = rv34;
                    }
                    return 0;
                case 5:
                    oi22.f139202g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    oi22.f139203h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C50260lg2 lg24 = new C50260lg2();
                        if (bArr4 != null && bArr4.length > 0) {
                            lg24.parseFrom(bArr4);
                        }
                        oi22.f139204i = lg24;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
