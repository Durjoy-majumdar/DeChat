package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.hl1 */
public class C49721hl1 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f134716d;

    /* renamed from: e */
    public C89349b f134717e;

    /* renamed from: f */
    public LinkedList<db4> f134718f = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49721hl1)) {
            return false;
        }
        C49721hl1 hl12 = (C49721hl1) aVar;
        return C46238a.m51546a(this.BaseRequest, hl12.BaseRequest) && C46238a.m51546a(this.f134716d, hl12.f134716d) && C46238a.m51546a(this.f134717e, hl12.f134717e) && C46238a.m51546a(this.f134718f, hl12.f134718f);
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
            C49842ig0 ig02 = this.f134716d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f134716d.writeFields(aVar);
            }
            C89349b bVar = this.f134717e;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            aVar.mo74320g(4, 8, this.f134718f);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f134716d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            C89349b bVar2 = this.f134717e;
            if (bVar2 != null) {
                i2 += C52418a.m58675b(3, bVar2);
            }
            return i2 + C52418a.m58680g(4, 8, this.f134718f);
        } else if (i == 2) {
            this.f134718f.clear();
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
            C49721hl1 hl12 = objArr[1];
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
                    hl12.BaseRequest = iaVar3;
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
                    hl12.f134716d = ig04;
                }
                return 0;
            } else if (intValue == 3) {
                hl12.f134717e = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    db4 db4 = new db4();
                    if (bArr3 != null && bArr3.length > 0) {
                        db4.parseFrom(bArr3);
                    }
                    hl12.f134718f.add(db4);
                }
                return 0;
            }
        }
    }
}
