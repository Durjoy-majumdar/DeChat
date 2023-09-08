package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.j12 */
public class C101790j12 extends C101820nt3 {

    /* renamed from: d */
    public String f298443d;

    /* renamed from: e */
    public int f298444e;

    /* renamed from: f */
    public int f298445f;

    /* renamed from: g */
    public String f298446g;

    /* renamed from: h */
    public int f298447h;

    /* renamed from: i */
    public int f298448i;

    /* renamed from: j */
    public int f298449j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101790j12)) {
            return false;
        }
        C101790j12 j122 = (C101790j12) aVar;
        return C46238a.m51546a(this.BaseRequest, j122.BaseRequest) && C46238a.m51546a(this.f298443d, j122.f298443d) && C46238a.m51546a(Integer.valueOf(this.f298444e), Integer.valueOf(j122.f298444e)) && C46238a.m51546a(Integer.valueOf(this.f298445f), Integer.valueOf(j122.f298445f)) && C46238a.m51546a(this.f298446g, j122.f298446g) && C46238a.m51546a(Integer.valueOf(this.f298447h), Integer.valueOf(j122.f298447h)) && C46238a.m51546a(Integer.valueOf(this.f298448i), Integer.valueOf(j122.f298448i)) && C46238a.m51546a(Integer.valueOf(this.f298449j), Integer.valueOf(j122.f298449j));
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
            String str = this.f298443d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f298444e);
            aVar.mo74318e(4, this.f298445f);
            String str2 = this.f298446g;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            aVar.mo74318e(6, this.f298447h);
            aVar.mo74318e(7, this.f298448i);
            aVar.mo74318e(8, this.f298449j);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str3 = this.f298443d;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            int e = i2 + C52418a.m58678e(3, this.f298444e) + C52418a.m58678e(4, this.f298445f);
            String str4 = this.f298446g;
            if (str4 != null) {
                e += C52418a.m58683j(5, str4);
            }
            return e + C52418a.m58678e(6, this.f298447h) + C52418a.m58678e(7, this.f298448i) + C52418a.m58678e(8, this.f298449j);
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
            C101790j12 j122 = objArr[1];
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
                        j122.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    j122.f298443d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    j122.f298444e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    j122.f298445f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    j122.f298446g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    j122.f298447h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    j122.f298448i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    j122.f298449j = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
