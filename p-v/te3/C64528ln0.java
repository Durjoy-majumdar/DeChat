package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ln0 */
public class C64528ln0 extends C49335eu3 {

    /* renamed from: d */
    public LinkedList<C64499kq0> f184121d = new LinkedList<>();

    /* renamed from: e */
    public C89349b f184122e;

    /* renamed from: f */
    public int f184123f;

    /* renamed from: g */
    public int f184124g;

    /* renamed from: h */
    public int f184125h;

    /* renamed from: i */
    public int f184126i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64528ln0)) {
            return false;
        }
        C64528ln0 ln02 = (C64528ln0) aVar;
        return C46238a.m51546a(this.BaseResponse, ln02.BaseResponse) && C46238a.m51546a(this.f184121d, ln02.f184121d) && C46238a.m51546a(this.f184122e, ln02.f184122e) && C46238a.m51546a(Integer.valueOf(this.f184123f), Integer.valueOf(ln02.f184123f)) && C46238a.m51546a(Integer.valueOf(this.f184124g), Integer.valueOf(ln02.f184124g)) && C46238a.m51546a(Integer.valueOf(this.f184125h), Integer.valueOf(ln02.f184125h)) && C46238a.m51546a(Integer.valueOf(this.f184126i), Integer.valueOf(ln02.f184126i));
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
            aVar.mo74320g(2, 8, this.f184121d);
            C89349b bVar = this.f184122e;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            aVar.mo74318e(4, this.f184123f);
            aVar.mo74318e(5, this.f184124g);
            aVar.mo74318e(6, this.f184125h);
            aVar.mo74318e(7, this.f184126i);
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f184121d);
            C89349b bVar2 = this.f184122e;
            if (bVar2 != null) {
                g += C52418a.m58675b(3, bVar2);
            }
            return g + C52418a.m58678e(4, this.f184123f) + C52418a.m58678e(5, this.f184124g) + C52418a.m58678e(6, this.f184125h) + C52418a.m58678e(7, this.f184126i);
        } else if (i == 2) {
            this.f184121d.clear();
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
            C64528ln0 ln02 = objArr[1];
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
                        ln02.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C64499kq0 kq02 = new C64499kq0();
                        if (bArr2 != null && bArr2.length > 0) {
                            kq02.parseFrom(bArr2);
                        }
                        ln02.f184121d.add(kq02);
                    }
                    return 0;
                case 3:
                    ln02.f184122e = aVar3.mo141626d(intValue);
                    return 0;
                case 4:
                    ln02.f184123f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    ln02.f184124g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    ln02.f184125h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    ln02.f184126i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
