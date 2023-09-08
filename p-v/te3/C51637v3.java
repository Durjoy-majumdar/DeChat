package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.v3 */
public class C51637v3 extends C101820nt3 {

    /* renamed from: d */
    public long f143271d;

    /* renamed from: e */
    public String f143272e;

    /* renamed from: f */
    public String f143273f;

    /* renamed from: g */
    public String f143274g;

    /* renamed from: h */
    public int f143275h;

    /* renamed from: i */
    public String f143276i;

    /* renamed from: j */
    public int f143277j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51637v3)) {
            return false;
        }
        C51637v3 v3Var = (C51637v3) aVar;
        return C46238a.m51546a(this.BaseRequest, v3Var.BaseRequest) && C46238a.m51546a(Long.valueOf(this.f143271d), Long.valueOf(v3Var.f143271d)) && C46238a.m51546a(this.f143272e, v3Var.f143272e) && C46238a.m51546a(this.f143273f, v3Var.f143273f) && C46238a.m51546a(this.f143274g, v3Var.f143274g) && C46238a.m51546a(Integer.valueOf(this.f143275h), Integer.valueOf(v3Var.f143275h)) && C46238a.m51546a(this.f143276i, v3Var.f143276i) && C46238a.m51546a(Integer.valueOf(this.f143277j), Integer.valueOf(v3Var.f143277j));
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
            aVar.mo74321h(2, this.f143271d);
            String str = this.f143272e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f143273f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f143274g;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            aVar.mo74318e(6, this.f143275h);
            String str4 = this.f143276i;
            if (str4 != null) {
                aVar.mo74323j(7, str4);
            }
            aVar.mo74318e(8, this.f143277j);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int h = i2 + C52418a.m58681h(2, this.f143271d);
            String str5 = this.f143272e;
            if (str5 != null) {
                h += C52418a.m58683j(3, str5);
            }
            String str6 = this.f143273f;
            if (str6 != null) {
                h += C52418a.m58683j(4, str6);
            }
            String str7 = this.f143274g;
            if (str7 != null) {
                h += C52418a.m58683j(5, str7);
            }
            int e = h + C52418a.m58678e(6, this.f143275h);
            String str8 = this.f143276i;
            if (str8 != null) {
                e += C52418a.m58683j(7, str8);
            }
            return e + C52418a.m58678e(8, this.f143277j);
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
            C51637v3 v3Var = objArr[1];
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
                        v3Var.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    v3Var.f143271d = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    v3Var.f143272e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    v3Var.f143273f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    v3Var.f143274g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    v3Var.f143275h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    v3Var.f143276i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    v3Var.f143277j = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
