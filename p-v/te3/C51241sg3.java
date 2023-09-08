package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.sg3 */
public class C51241sg3 extends C49335eu3 {

    /* renamed from: d */
    public int f141496d;

    /* renamed from: e */
    public LinkedList<C49254ea0> f141497e = new LinkedList<>();

    /* renamed from: f */
    public String f141498f;

    /* renamed from: g */
    public int f141499g;

    /* renamed from: h */
    public String f141500h;

    /* renamed from: i */
    public LinkedList<C49638h1> f141501i = new LinkedList<>();

    /* renamed from: j */
    public int f141502j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51241sg3)) {
            return false;
        }
        C51241sg3 sg32 = (C51241sg3) aVar;
        return C46238a.m51546a(this.BaseResponse, sg32.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f141496d), Integer.valueOf(sg32.f141496d)) && C46238a.m51546a(this.f141497e, sg32.f141497e) && C46238a.m51546a(this.f141498f, sg32.f141498f) && C46238a.m51546a(Integer.valueOf(this.f141499g), Integer.valueOf(sg32.f141499g)) && C46238a.m51546a(this.f141500h, sg32.f141500h) && C46238a.m51546a(this.f141501i, sg32.f141501i) && C46238a.m51546a(Integer.valueOf(this.f141502j), Integer.valueOf(sg32.f141502j));
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
            aVar.mo74318e(2, this.f141496d);
            aVar.mo74320g(3, 8, this.f141497e);
            String str = this.f141498f;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            aVar.mo74318e(5, this.f141499g);
            String str2 = this.f141500h;
            if (str2 != null) {
                aVar.mo74323j(6, str2);
            }
            aVar.mo74320g(7, 8, this.f141501i);
            aVar.mo74318e(8, this.f141502j);
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f141496d) + C52418a.m58680g(3, 8, this.f141497e);
            String str3 = this.f141498f;
            if (str3 != null) {
                e += C52418a.m58683j(4, str3);
            }
            int e2 = e + C52418a.m58678e(5, this.f141499g);
            String str4 = this.f141500h;
            if (str4 != null) {
                e2 += C52418a.m58683j(6, str4);
            }
            return e2 + C52418a.m58680g(7, 8, this.f141501i) + C52418a.m58678e(8, this.f141502j);
        } else if (i == 2) {
            this.f141497e.clear();
            this.f141501i.clear();
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
            C51241sg3 sg32 = objArr[1];
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
                        sg32.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    sg32.f141496d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C49254ea0 ea02 = new C49254ea0();
                        if (bArr2 != null && bArr2.length > 0) {
                            ea02.parseFrom(bArr2);
                        }
                        sg32.f141497e.add(ea02);
                    }
                    return 0;
                case 4:
                    sg32.f141498f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    sg32.f141499g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    sg32.f141500h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C49638h1 h1Var = new C49638h1();
                        if (bArr3 != null && bArr3.length > 0) {
                            h1Var.parseFrom(bArr3);
                        }
                        sg32.f141501i.add(h1Var);
                    }
                    return 0;
                case 8:
                    sg32.f141502j = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
