package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.vf */
public class C118474vf extends C49335eu3 {

    /* renamed from: d */
    public LinkedList<C118459qf> f354494d = new LinkedList<>();

    /* renamed from: e */
    public C89349b f354495e;

    /* renamed from: f */
    public int f354496f;

    /* renamed from: g */
    public int f354497g;

    /* renamed from: h */
    public int f354498h;

    /* renamed from: i */
    public int f354499i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C118474vf)) {
            return false;
        }
        C118474vf vfVar = (C118474vf) aVar;
        return C46238a.m51546a(this.BaseResponse, vfVar.BaseResponse) && C46238a.m51546a(this.f354494d, vfVar.f354494d) && C46238a.m51546a(this.f354495e, vfVar.f354495e) && C46238a.m51546a(Integer.valueOf(this.f354496f), Integer.valueOf(vfVar.f354496f)) && C46238a.m51546a(Integer.valueOf(this.f354497g), Integer.valueOf(vfVar.f354497g)) && C46238a.m51546a(Integer.valueOf(this.f354498h), Integer.valueOf(vfVar.f354498h)) && C46238a.m51546a(Integer.valueOf(this.f354499i), Integer.valueOf(vfVar.f354499i));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                aVar.mo74320g(2, 8, this.f354494d);
                C89349b bVar = this.f354495e;
                if (bVar != null) {
                    aVar.mo74315b(3, bVar);
                }
                aVar.mo74318e(4, this.f354496f);
                aVar.mo74318e(5, this.f354497g);
                aVar.mo74318e(7, this.f354498h);
                aVar.mo74318e(8, this.f354499i);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f354494d);
            C89349b bVar2 = this.f354495e;
            if (bVar2 != null) {
                g += C52418a.m58675b(3, bVar2);
            }
            return g + C52418a.m58678e(4, this.f354496f) + C52418a.m58678e(5, this.f354497g) + C52418a.m58678e(7, this.f354498h) + C52418a.m58678e(8, this.f354499i);
        } else if (i == 2) {
            this.f354494d.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C118474vf vfVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C49966ja jaVar3 = new C49966ja();
                        if (bArr != null && bArr.length > 0) {
                            jaVar3.parseFrom(bArr);
                        }
                        vfVar.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C118459qf qfVar = new C118459qf();
                        if (bArr2 != null && bArr2.length > 0) {
                            qfVar.parseFrom(bArr2);
                        }
                        vfVar.f354494d.add(qfVar);
                    }
                    return 0;
                case 3:
                    vfVar.f354495e = aVar3.mo141626d(intValue);
                    return 0;
                case 4:
                    vfVar.f354496f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    vfVar.f354497g = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    vfVar.f354498h = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    vfVar.f354499i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
