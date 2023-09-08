package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.z5 */
public class C52218z5 extends C101820nt3 {

    /* renamed from: d */
    public String f145697d;

    /* renamed from: e */
    public int f145698e;

    /* renamed from: f */
    public int f145699f;

    /* renamed from: g */
    public int f145700g;

    /* renamed from: h */
    public int f145701h;

    /* renamed from: i */
    public int f145702i;

    /* renamed from: j */
    public int f145703j;

    /* renamed from: n */
    public String f145704n;

    /* renamed from: o */
    public long f145705o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52218z5)) {
            return false;
        }
        C52218z5 z5Var = (C52218z5) aVar;
        return C46238a.m51546a(this.BaseRequest, z5Var.BaseRequest) && C46238a.m51546a(this.f145697d, z5Var.f145697d) && C46238a.m51546a(Integer.valueOf(this.f145698e), Integer.valueOf(z5Var.f145698e)) && C46238a.m51546a(Integer.valueOf(this.f145699f), Integer.valueOf(z5Var.f145699f)) && C46238a.m51546a(Integer.valueOf(this.f145700g), Integer.valueOf(z5Var.f145700g)) && C46238a.m51546a(Integer.valueOf(this.f145701h), Integer.valueOf(z5Var.f145701h)) && C46238a.m51546a(Integer.valueOf(this.f145702i), Integer.valueOf(z5Var.f145702i)) && C46238a.m51546a(Integer.valueOf(this.f145703j), Integer.valueOf(z5Var.f145703j)) && C46238a.m51546a(this.f145704n, z5Var.f145704n) && C46238a.m51546a(Long.valueOf(this.f145705o), Long.valueOf(z5Var.f145705o));
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
            String str = this.f145697d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(4, this.f145698e);
            aVar.mo74318e(6, this.f145699f);
            aVar.mo74318e(7, this.f145700g);
            aVar.mo74318e(8, this.f145701h);
            aVar.mo74318e(9, this.f145702i);
            aVar.mo74318e(10, this.f145703j);
            String str2 = this.f145704n;
            if (str2 != null) {
                aVar.mo74323j(11, str2);
            }
            aVar.mo74321h(12, this.f145705o);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str3 = this.f145697d;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            int e = i2 + C52418a.m58678e(4, this.f145698e) + C52418a.m58678e(6, this.f145699f) + C52418a.m58678e(7, this.f145700g) + C52418a.m58678e(8, this.f145701h) + C52418a.m58678e(9, this.f145702i) + C52418a.m58678e(10, this.f145703j);
            String str4 = this.f145704n;
            if (str4 != null) {
                e += C52418a.m58683j(11, str4);
            }
            return e + C52418a.m58681h(12, this.f145705o);
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
            C52218z5 z5Var = objArr[1];
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
                        z5Var.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    z5Var.f145697d = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    z5Var.f145698e = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    z5Var.f145699f = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    z5Var.f145700g = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    z5Var.f145701h = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    z5Var.f145702i = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    z5Var.f145703j = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    z5Var.f145704n = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    z5Var.f145705o = aVar3.mo141631i(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
