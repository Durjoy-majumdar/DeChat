package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ez0 */
public class C49353ez0 extends C49335eu3 {

    /* renamed from: d */
    public boolean f133202d;

    /* renamed from: e */
    public LinkedList<C50721or3> f133203e = new LinkedList<>();

    /* renamed from: f */
    public C89349b f133204f;

    /* renamed from: g */
    public String f133205g;

    /* renamed from: h */
    public int f133206h;

    /* renamed from: i */
    public LinkedList<C51445tt3> f133207i = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49353ez0)) {
            return false;
        }
        C49353ez0 ez02 = (C49353ez0) aVar;
        return C46238a.m51546a(this.BaseResponse, ez02.BaseResponse) && C46238a.m51546a(Boolean.valueOf(this.f133202d), Boolean.valueOf(ez02.f133202d)) && C46238a.m51546a(this.f133203e, ez02.f133203e) && C46238a.m51546a(this.f133204f, ez02.f133204f) && C46238a.m51546a(this.f133205g, ez02.f133205g) && C46238a.m51546a(Integer.valueOf(this.f133206h), Integer.valueOf(ez02.f133206h)) && C46238a.m51546a(this.f133207i, ez02.f133207i);
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
            aVar.mo74314a(2, this.f133202d);
            aVar.mo74320g(3, 8, this.f133203e);
            C89349b bVar = this.f133204f;
            if (bVar != null) {
                aVar.mo74315b(4, bVar);
            }
            String str = this.f133205g;
            if (str != null) {
                aVar.mo74323j(5, str);
            }
            aVar.mo74318e(6, this.f133206h);
            aVar.mo74320g(7, 8, this.f133207i);
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int a = i2 + C52418a.m58674a(2, this.f133202d) + C52418a.m58680g(3, 8, this.f133203e);
            C89349b bVar2 = this.f133204f;
            if (bVar2 != null) {
                a += C52418a.m58675b(4, bVar2);
            }
            String str2 = this.f133205g;
            if (str2 != null) {
                a += C52418a.m58683j(5, str2);
            }
            return a + C52418a.m58678e(6, this.f133206h) + C52418a.m58680g(7, 8, this.f133207i);
        } else if (i == 2) {
            this.f133203e.clear();
            this.f133207i.clear();
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
            C49353ez0 ez02 = objArr[1];
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
                        ez02.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    ez02.f133202d = aVar3.mo141625c(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C50721or3 or32 = new C50721or3();
                        if (bArr2 != null && bArr2.length > 0) {
                            or32.parseFrom(bArr2);
                        }
                        ez02.f133203e.add(or32);
                    }
                    return 0;
                case 4:
                    ez02.f133204f = aVar3.mo141626d(intValue);
                    return 0;
                case 5:
                    ez02.f133205g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    ez02.f133206h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C51445tt3 tt32 = new C51445tt3();
                        if (bArr3 != null && bArr3.length > 0) {
                            tt32.parseFrom(bArr3);
                        }
                        ez02.f133207i.add(tt32);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
