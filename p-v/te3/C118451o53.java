package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.o53 */
public class C118451o53 extends C101820nt3 {

    /* renamed from: d */
    public int f354186d;

    /* renamed from: e */
    public int f354187e;

    /* renamed from: f */
    public LinkedList<C22525q53> f354188f = new LinkedList<>();

    /* renamed from: g */
    public LinkedList<C22515n53> f354189g = new LinkedList<>();

    /* renamed from: h */
    public int f354190h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C118451o53)) {
            return false;
        }
        C118451o53 o532 = (C118451o53) aVar;
        return C46238a.m51546a(this.BaseRequest, o532.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f354186d), Integer.valueOf(o532.f354186d)) && C46238a.m51546a(Integer.valueOf(this.f354187e), Integer.valueOf(o532.f354187e)) && C46238a.m51546a(this.f354188f, o532.f354188f) && C46238a.m51546a(this.f354189g, o532.f354189g) && C46238a.m51546a(Integer.valueOf(this.f354190h), Integer.valueOf(o532.f354190h));
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
            aVar.mo74318e(2, this.f354186d);
            aVar.mo74318e(3, this.f354187e);
            aVar.mo74320g(4, 8, this.f354188f);
            aVar.mo74320g(5, 8, this.f354189g);
            aVar.mo74318e(6, this.f354190h);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            return i2 + C52418a.m58678e(2, this.f354186d) + C52418a.m58678e(3, this.f354187e) + C52418a.m58680g(4, 8, this.f354188f) + C52418a.m58680g(5, 8, this.f354189g) + C52418a.m58678e(6, this.f354190h);
        } else if (i == 2) {
            this.f354188f.clear();
            this.f354189g.clear();
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
            C118451o53 o532 = objArr[1];
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
                        o532.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    o532.f354186d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    o532.f354187e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C22525q53 q532 = new C22525q53();
                        if (bArr2 != null && bArr2.length > 0) {
                            q532.parseFrom(bArr2);
                        }
                        o532.f354188f.add(q532);
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C22515n53 n532 = new C22515n53();
                        if (bArr3 != null && bArr3.length > 0) {
                            n532.parseFrom(bArr3);
                        }
                        o532.f354189g.add(n532);
                    }
                    return 0;
                case 6:
                    o532.f354190h = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
