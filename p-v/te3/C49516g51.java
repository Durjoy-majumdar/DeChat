package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.g51 */
public class C49516g51 extends C49335eu3 {

    /* renamed from: d */
    public C49098d51 f133857d;

    /* renamed from: e */
    public C89349b f133858e;

    /* renamed from: f */
    public String f133859f;

    /* renamed from: g */
    public String f133860g;

    /* renamed from: h */
    public int f133861h;

    /* renamed from: i */
    public LinkedList<C48729ak3> f133862i = new LinkedList<>();

    /* renamed from: j */
    public C49521g61 f133863j;

    /* renamed from: n */
    public int f133864n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49516g51)) {
            return false;
        }
        C49516g51 g512 = (C49516g51) aVar;
        return C46238a.m51546a(this.BaseResponse, g512.BaseResponse) && C46238a.m51546a(this.f133857d, g512.f133857d) && C46238a.m51546a(this.f133858e, g512.f133858e) && C46238a.m51546a(this.f133859f, g512.f133859f) && C46238a.m51546a(this.f133860g, g512.f133860g) && C46238a.m51546a(Integer.valueOf(this.f133861h), Integer.valueOf(g512.f133861h)) && C46238a.m51546a(this.f133862i, g512.f133862i) && C46238a.m51546a(this.f133863j, g512.f133863j) && C46238a.m51546a(Integer.valueOf(this.f133864n), Integer.valueOf(g512.f133864n));
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
            C49098d51 d512 = this.f133857d;
            if (d512 != null) {
                aVar.mo74322i(2, d512.computeSize());
                this.f133857d.writeFields(aVar);
            }
            C89349b bVar = this.f133858e;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            String str = this.f133859f;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            String str2 = this.f133860g;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            aVar.mo74318e(6, this.f133861h);
            aVar.mo74320g(7, 8, this.f133862i);
            C49521g61 g612 = this.f133863j;
            if (g612 != null) {
                aVar.mo74322i(8, g612.computeSize());
                this.f133863j.writeFields(aVar);
            }
            aVar.mo74318e(9, this.f133864n);
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            C49098d51 d513 = this.f133857d;
            if (d513 != null) {
                i2 += C52418a.m58682i(2, d513.computeSize());
            }
            C89349b bVar2 = this.f133858e;
            if (bVar2 != null) {
                i2 += C52418a.m58675b(3, bVar2);
            }
            String str3 = this.f133859f;
            if (str3 != null) {
                i2 += C52418a.m58683j(4, str3);
            }
            String str4 = this.f133860g;
            if (str4 != null) {
                i2 += C52418a.m58683j(5, str4);
            }
            int e = i2 + C52418a.m58678e(6, this.f133861h) + C52418a.m58680g(7, 8, this.f133862i);
            C49521g61 g613 = this.f133863j;
            if (g613 != null) {
                e += C52418a.m58682i(8, g613.computeSize());
            }
            return e + C52418a.m58678e(9, this.f133864n);
        } else if (i == 2) {
            this.f133862i.clear();
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
            C49516g51 g512 = objArr[1];
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
                        g512.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C49098d51 d514 = new C49098d51();
                        if (bArr2 != null && bArr2.length > 0) {
                            d514.parseFrom(bArr2);
                        }
                        g512.f133857d = d514;
                    }
                    return 0;
                case 3:
                    g512.f133858e = aVar3.mo141626d(intValue);
                    return 0;
                case 4:
                    g512.f133859f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    g512.f133860g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    g512.f133861h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C48729ak3 ak32 = new C48729ak3();
                        if (bArr3 != null && bArr3.length > 0) {
                            ak32.parseFrom(bArr3);
                        }
                        g512.f133862i.add(ak32);
                    }
                    return 0;
                case 8:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C49521g61 g614 = new C49521g61();
                        if (bArr4 != null && bArr4.length > 0) {
                            g614.parseFrom(bArr4);
                        }
                        g512.f133863j = g614;
                    }
                    return 0;
                case 9:
                    g512.f133864n = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
