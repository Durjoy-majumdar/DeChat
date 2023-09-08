package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.zo0 */
public class C52289zo0 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f146150d;

    /* renamed from: e */
    public LinkedList<C50946qd1> f146151e = new LinkedList<>();

    /* renamed from: f */
    public boolean f146152f;

    /* renamed from: g */
    public String f146153g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52289zo0)) {
            return false;
        }
        C52289zo0 zo02 = (C52289zo0) aVar;
        return C46238a.m51546a(this.BaseRequest, zo02.BaseRequest) && C46238a.m51546a(this.f146150d, zo02.f146150d) && C46238a.m51546a(this.f146151e, zo02.f146151e) && C46238a.m51546a(Boolean.valueOf(this.f146152f), Boolean.valueOf(zo02.f146152f)) && C46238a.m51546a(this.f146153g, zo02.f146153g);
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
            C49842ig0 ig02 = this.f146150d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f146150d.writeFields(aVar);
            }
            aVar.mo74320g(3, 8, this.f146151e);
            aVar.mo74314a(4, this.f146152f);
            String str = this.f146153g;
            if (str != null) {
                aVar.mo74323j(5, str);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f146150d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            int g = i2 + C52418a.m58680g(3, 8, this.f146151e) + C52418a.m58674a(4, this.f146152f);
            String str2 = this.f146153g;
            return str2 != null ? g + C52418a.m58683j(5, str2) : g;
        } else if (i == 2) {
            this.f146151e.clear();
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
            C52289zo0 zo02 = objArr[1];
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
                    zo02.BaseRequest = iaVar3;
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
                    zo02.f146150d = ig04;
                }
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C50946qd1 qd12 = new C50946qd1();
                    if (bArr3 != null && bArr3.length > 0) {
                        qd12.parseFrom(bArr3);
                    }
                    zo02.f146151e.add(qd12);
                }
                return 0;
            } else if (intValue == 4) {
                zo02.f146152f = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                zo02.f146153g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
