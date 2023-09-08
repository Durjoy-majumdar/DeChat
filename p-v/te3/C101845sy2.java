package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.sy2 */
public class C101845sy2 extends C101820nt3 {

    /* renamed from: d */
    public int f299472d;

    /* renamed from: e */
    public int f299473e;

    /* renamed from: f */
    public LinkedList<C101836ry2> f299474f = new LinkedList<>();

    /* renamed from: g */
    public int f299475g;

    /* renamed from: h */
    public LinkedList<C101854uy2> f299476h = new LinkedList<>();

    /* renamed from: i */
    public String f299477i;

    /* renamed from: j */
    public int f299478j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101845sy2)) {
            return false;
        }
        C101845sy2 sy22 = (C101845sy2) aVar;
        return C46238a.m51546a(this.BaseRequest, sy22.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f299472d), Integer.valueOf(sy22.f299472d)) && C46238a.m51546a(Integer.valueOf(this.f299473e), Integer.valueOf(sy22.f299473e)) && C46238a.m51546a(this.f299474f, sy22.f299474f) && C46238a.m51546a(Integer.valueOf(this.f299475g), Integer.valueOf(sy22.f299475g)) && C46238a.m51546a(this.f299476h, sy22.f299476h) && C46238a.m51546a(this.f299477i, sy22.f299477i) && C46238a.m51546a(Integer.valueOf(this.f299478j), Integer.valueOf(sy22.f299478j));
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
            aVar.mo74318e(2, this.f299472d);
            aVar.mo74318e(3, this.f299473e);
            aVar.mo74320g(4, 8, this.f299474f);
            aVar.mo74318e(5, this.f299475g);
            aVar.mo74320g(6, 8, this.f299476h);
            String str = this.f299477i;
            if (str != null) {
                aVar.mo74323j(7, str);
            }
            aVar.mo74318e(8, this.f299478j);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f299472d) + C52418a.m58678e(3, this.f299473e) + C52418a.m58680g(4, 8, this.f299474f) + C52418a.m58678e(5, this.f299475g) + C52418a.m58680g(6, 8, this.f299476h);
            String str2 = this.f299477i;
            if (str2 != null) {
                e += C52418a.m58683j(7, str2);
            }
            return e + C52418a.m58678e(8, this.f299478j);
        } else if (i == 2) {
            this.f299474f.clear();
            this.f299476h.clear();
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
            C101845sy2 sy22 = objArr[1];
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
                        sy22.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    sy22.f299472d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    sy22.f299473e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C101836ry2 ry22 = new C101836ry2();
                        if (bArr2 != null && bArr2.length > 0) {
                            ry22.parseFrom(bArr2);
                        }
                        sy22.f299474f.add(ry22);
                    }
                    return 0;
                case 5:
                    sy22.f299475g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C101854uy2 uy22 = new C101854uy2();
                        if (bArr3 != null && bArr3.length > 0) {
                            uy22.parseFrom(bArr3);
                        }
                        sy22.f299476h.add(uy22);
                    }
                    return 0;
                case 7:
                    sy22.f299477i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    sy22.f299478j = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
