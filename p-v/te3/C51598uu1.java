package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.uu1 */
public class C51598uu1 extends C101820nt3 {

    /* renamed from: d */
    public int f143139d;

    /* renamed from: e */
    public LinkedList<C51163rv3> f143140e = new LinkedList<>();

    /* renamed from: f */
    public int f143141f;

    /* renamed from: g */
    public LinkedList<C51163rv3> f143142g = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51598uu1)) {
            return false;
        }
        C51598uu1 uu12 = (C51598uu1) aVar;
        return C46238a.m51546a(this.BaseRequest, uu12.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f143139d), Integer.valueOf(uu12.f143139d)) && C46238a.m51546a(this.f143140e, uu12.f143140e) && C46238a.m51546a(Integer.valueOf(this.f143141f), Integer.valueOf(uu12.f143141f)) && C46238a.m51546a(this.f143142g, uu12.f143142g);
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
            aVar.mo74318e(2, this.f143139d);
            aVar.mo74320g(3, 8, this.f143140e);
            aVar.mo74318e(4, this.f143141f);
            aVar.mo74320g(5, 8, this.f143142g);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            return i2 + C52418a.m58678e(2, this.f143139d) + C52418a.m58680g(3, 8, this.f143140e) + C52418a.m58678e(4, this.f143141f) + C52418a.m58680g(5, 8, this.f143142g);
        } else if (i == 2) {
            this.f143140e.clear();
            this.f143142g.clear();
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
            C51598uu1 uu12 = objArr[1];
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
                    uu12.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                uu12.f143139d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C51163rv3 rv32 = new C51163rv3();
                    if (bArr2 != null && bArr2.length > 0) {
                        rv32.mo73356d(bArr2);
                    }
                    uu12.f143140e.add(rv32);
                }
                return 0;
            } else if (intValue == 4) {
                uu12.f143141f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C51163rv3 rv33 = new C51163rv3();
                    if (bArr3 != null && bArr3.length > 0) {
                        rv33.mo73356d(bArr3);
                    }
                    uu12.f143142g.add(rv33);
                }
                return 0;
            }
        }
    }
}
