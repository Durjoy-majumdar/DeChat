package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.dt3 */
public class C49189dt3 extends C101820nt3 {

    /* renamed from: d */
    public int f132524d;

    /* renamed from: e */
    public LinkedList<C51163rv3> f132525e = new LinkedList<>();

    /* renamed from: f */
    public C51163rv3 f132526f;

    /* renamed from: g */
    public C51163rv3 f132527g;

    /* renamed from: h */
    public int f132528h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49189dt3)) {
            return false;
        }
        C49189dt3 dt32 = (C49189dt3) aVar;
        return C46238a.m51546a(this.BaseRequest, dt32.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f132524d), Integer.valueOf(dt32.f132524d)) && C46238a.m51546a(this.f132525e, dt32.f132525e) && C46238a.m51546a(this.f132526f, dt32.f132526f) && C46238a.m51546a(this.f132527g, dt32.f132527g) && C46238a.m51546a(Integer.valueOf(this.f132528h), Integer.valueOf(dt32.f132528h));
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
            aVar.mo74318e(2, this.f132524d);
            aVar.mo74320g(3, 8, this.f132525e);
            C51163rv3 rv32 = this.f132526f;
            if (rv32 != null) {
                aVar.mo74322i(4, rv32.computeSize());
                this.f132526f.writeFields(aVar);
            }
            C51163rv3 rv33 = this.f132527g;
            if (rv33 != null) {
                aVar.mo74322i(5, rv33.computeSize());
                this.f132527g.writeFields(aVar);
            }
            aVar.mo74318e(6, this.f132528h);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f132524d) + C52418a.m58680g(3, 8, this.f132525e);
            C51163rv3 rv34 = this.f132526f;
            if (rv34 != null) {
                e += C52418a.m58682i(4, rv34.computeSize());
            }
            C51163rv3 rv35 = this.f132527g;
            if (rv35 != null) {
                e += C52418a.m58682i(5, rv35.computeSize());
            }
            return e + C52418a.m58678e(6, this.f132528h);
        } else if (i == 2) {
            this.f132525e.clear();
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
            C49189dt3 dt32 = objArr[1];
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
                        dt32.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    dt32.f132524d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C51163rv3 rv36 = new C51163rv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            rv36.mo73356d(bArr2);
                        }
                        dt32.f132525e.add(rv36);
                    }
                    return 0;
                case 4:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C51163rv3 rv37 = new C51163rv3();
                        if (bArr3 != null && bArr3.length > 0) {
                            rv37.mo73356d(bArr3);
                        }
                        dt32.f132526f = rv37;
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C51163rv3 rv38 = new C51163rv3();
                        if (bArr4 != null && bArr4.length > 0) {
                            rv38.mo73356d(bArr4);
                        }
                        dt32.f132527g = rv38;
                    }
                    return 0;
                case 6:
                    dt32.f132528h = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
