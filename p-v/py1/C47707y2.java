package py1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.y2 */
public class C47707y2 extends C47465a {

    /* renamed from: d */
    public String f128161d;

    /* renamed from: e */
    public String f128162e;

    /* renamed from: f */
    public String f128163f;

    /* renamed from: g */
    public String f128164g;

    /* renamed from: h */
    public C47635n3 f128165h;

    /* renamed from: i */
    public String f128166i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47707y2)) {
            return false;
        }
        C47707y2 y2Var = (C47707y2) aVar;
        return C46238a.m51546a(this.f128161d, y2Var.f128161d) && C46238a.m51546a(this.f128162e, y2Var.f128162e) && C46238a.m51546a(this.f128163f, y2Var.f128163f) && C46238a.m51546a(this.f128164g, y2Var.f128164g) && C46238a.m51546a(this.f128165h, y2Var.f128165h) && C46238a.m51546a(this.f128166i, y2Var.f128166i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f128161d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f128162e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f128163f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f128164g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            C47635n3 n3Var = this.f128165h;
            if (n3Var != null) {
                aVar.mo74322i(5, n3Var.computeSize());
                this.f128165h.writeFields(aVar);
            }
            String str5 = this.f128166i;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            return 0;
        } else if (i == 1) {
            String str6 = this.f128161d;
            if (str6 != null) {
                i2 = 0 + C52418a.m58683j(1, str6);
            }
            String str7 = this.f128162e;
            if (str7 != null) {
                i2 += C52418a.m58683j(2, str7);
            }
            String str8 = this.f128163f;
            if (str8 != null) {
                i2 += C52418a.m58683j(3, str8);
            }
            String str9 = this.f128164g;
            if (str9 != null) {
                i2 += C52418a.m58683j(4, str9);
            }
            C47635n3 n3Var2 = this.f128165h;
            if (n3Var2 != null) {
                i2 += C52418a.m58682i(5, n3Var2.computeSize());
            }
            String str10 = this.f128166i;
            return str10 != null ? i2 + C52418a.m58683j(6, str10) : i2;
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
            C47707y2 y2Var = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    y2Var.f128161d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    y2Var.f128162e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    y2Var.f128163f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    y2Var.f128164g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C47635n3 n3Var3 = new C47635n3();
                        if (bArr != null && bArr.length > 0) {
                            n3Var3.parseFrom(bArr);
                        }
                        y2Var.f128165h = n3Var3;
                    }
                    return 0;
                case 6:
                    y2Var.f128166i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
