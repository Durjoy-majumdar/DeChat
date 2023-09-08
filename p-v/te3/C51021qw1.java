package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.qw1 */
public class C51021qw1 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f140584d;

    /* renamed from: e */
    public int f140585e;

    /* renamed from: f */
    public C89349b f140586f;

    /* renamed from: g */
    public int f140587g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51021qw1)) {
            return false;
        }
        C51021qw1 qw12 = (C51021qw1) aVar;
        return C46238a.m51546a(this.BaseRequest, qw12.BaseRequest) && C46238a.m51546a(this.f140584d, qw12.f140584d) && C46238a.m51546a(Integer.valueOf(this.f140585e), Integer.valueOf(qw12.f140585e)) && C46238a.m51546a(this.f140586f, qw12.f140586f) && C46238a.m51546a(Integer.valueOf(this.f140587g), Integer.valueOf(qw12.f140587g));
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
            C49842ig0 ig02 = this.f140584d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f140584d.writeFields(aVar);
            }
            aVar.mo74318e(3, this.f140585e);
            C89349b bVar = this.f140586f;
            if (bVar != null) {
                aVar.mo74315b(4, bVar);
            }
            aVar.mo74318e(5, this.f140587g);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f140584d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            int e = i2 + C52418a.m58678e(3, this.f140585e);
            C89349b bVar2 = this.f140586f;
            if (bVar2 != null) {
                e += C52418a.m58675b(4, bVar2);
            }
            return e + C52418a.m58678e(5, this.f140587g);
        } else if (i == 2) {
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
            C51021qw1 qw12 = objArr[1];
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
                    qw12.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C49842ig0 ig04 = new C49842ig0();
                    if (bArr2 != null && bArr2.length > 0) {
                        ig04.parseFrom(bArr2);
                    }
                    qw12.f140584d = ig04;
                }
                return 0;
            } else if (intValue == 3) {
                qw12.f140585e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                qw12.f140586f = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                qw12.f140587g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
