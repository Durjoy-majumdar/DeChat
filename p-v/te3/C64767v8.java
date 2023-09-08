package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.v8 */
public class C64767v8 extends C47465a {

    /* renamed from: d */
    public String f185847d;

    /* renamed from: e */
    public int f185848e;

    /* renamed from: f */
    public C64524lg3 f185849f;

    /* renamed from: g */
    public String f185850g;

    /* renamed from: h */
    public String f185851h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64767v8)) {
            return false;
        }
        C64767v8 v8Var = (C64767v8) aVar;
        return C46238a.m51546a(this.f185847d, v8Var.f185847d) && C46238a.m51546a(Integer.valueOf(this.f185848e), Integer.valueOf(v8Var.f185848e)) && C46238a.m51546a(this.f185849f, v8Var.f185849f) && C46238a.m51546a(this.f185850g, v8Var.f185850g) && C46238a.m51546a(this.f185851h, v8Var.f185851h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f185847d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f185848e);
            C64524lg3 lg32 = this.f185849f;
            if (lg32 != null) {
                aVar.mo74322i(3, lg32.computeSize());
                this.f185849f.writeFields(aVar);
            }
            String str2 = this.f185850g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f185851h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            return 0;
        } else if (i == 1) {
            String str4 = this.f185847d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            int e = i2 + C52418a.m58678e(2, this.f185848e);
            C64524lg3 lg33 = this.f185849f;
            if (lg33 != null) {
                e += C52418a.m58682i(3, lg33.computeSize());
            }
            String str5 = this.f185850g;
            if (str5 != null) {
                e += C52418a.m58683j(4, str5);
            }
            String str6 = this.f185851h;
            return str6 != null ? e + C52418a.m58683j(5, str6) : e;
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
            C64767v8 v8Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                v8Var.f185847d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                v8Var.f185848e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C64524lg3 lg34 = new C64524lg3();
                    if (bArr != null && bArr.length > 0) {
                        lg34.parseFrom(bArr);
                    }
                    v8Var.f185849f = lg34;
                }
                return 0;
            } else if (intValue == 4) {
                v8Var.f185850g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                v8Var.f185851h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
