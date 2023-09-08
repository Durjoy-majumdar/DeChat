package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import t14.C77818a;
import t14.C77826i;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ca0 */
public class C48975ca0 extends C49335eu3 {

    /* renamed from: d */
    public int f131586d;

    /* renamed from: e */
    public String f131587e;

    /* renamed from: f */
    public LinkedList<C77826i> f131588f = new LinkedList<>();

    /* renamed from: g */
    public int f131589g;

    /* renamed from: h */
    public C77818a f131590h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48975ca0)) {
            return false;
        }
        C48975ca0 ca02 = (C48975ca0) aVar;
        return C46238a.m51546a(this.BaseResponse, ca02.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f131586d), Integer.valueOf(ca02.f131586d)) && C46238a.m51546a(this.f131587e, ca02.f131587e) && C46238a.m51546a(this.f131588f, ca02.f131588f) && C46238a.m51546a(Integer.valueOf(this.f131589g), Integer.valueOf(ca02.f131589g)) && C46238a.m51546a(this.f131590h, ca02.f131590h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                aVar.mo74322i(1, jaVar.computeSize());
                this.BaseResponse.writeFields(aVar);
            }
            aVar.mo74318e(2, this.f131586d);
            String str = this.f131587e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74320g(4, 8, this.f131588f);
            aVar.mo74318e(5, this.f131589g);
            C77818a aVar2 = this.f131590h;
            if (aVar2 != null) {
                aVar.mo74322i(6, aVar2.computeSize());
                this.f131590h.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f131586d);
            String str2 = this.f131587e;
            if (str2 != null) {
                e += C52418a.m58683j(3, str2);
            }
            int g = e + C52418a.m58680g(4, 8, this.f131588f) + C52418a.m58678e(5, this.f131589g);
            C77818a aVar3 = this.f131590h;
            return aVar3 != null ? g + C52418a.m58682i(6, aVar3.computeSize()) : g;
        } else if (i == 2) {
            this.f131588f.clear();
            C102122a aVar4 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar4); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar4)) {
                if (!super.populateBuilderWithField(aVar4, this, nextFieldNumber)) {
                    aVar4.mo141624b();
                }
            }
            return 0;
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar5 = objArr[0];
            C48975ca0 ca02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar5.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C49966ja jaVar3 = new C49966ja();
                        if (bArr != null && bArr.length > 0) {
                            jaVar3.parseFrom(bArr);
                        }
                        ca02.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    ca02.f131586d = aVar5.mo141629g(intValue);
                    return 0;
                case 3:
                    ca02.f131587e = aVar5.mo141633k(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j2 = aVar5.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C77826i iVar = new C77826i();
                        if (bArr2 != null && bArr2.length > 0) {
                            iVar.parseFrom(bArr2);
                        }
                        ca02.f131588f.add(iVar);
                    }
                    return 0;
                case 5:
                    ca02.f131589g = aVar5.mo141629g(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j3 = aVar5.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C77818a aVar6 = new C77818a();
                        if (bArr3 != null && bArr3.length > 0) {
                            aVar6.parseFrom(bArr3);
                        }
                        ca02.f131590h = aVar6;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
