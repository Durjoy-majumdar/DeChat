package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.x9 */
public class C51940x9 extends C47465a {

    /* renamed from: d */
    public String f144524d;

    /* renamed from: e */
    public C50456mv3 f144525e;

    /* renamed from: f */
    public String f144526f;

    /* renamed from: g */
    public C51975xh2 f144527g;

    /* renamed from: h */
    public String f144528h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51940x9)) {
            return false;
        }
        C51940x9 x9Var = (C51940x9) aVar;
        return C46238a.m51546a(this.f144524d, x9Var.f144524d) && C46238a.m51546a(this.f144525e, x9Var.f144525e) && C46238a.m51546a(this.f144526f, x9Var.f144526f) && C46238a.m51546a(this.f144527g, x9Var.f144527g) && C46238a.m51546a(this.f144528h, x9Var.f144528h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f144524d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            C50456mv3 mv32 = this.f144525e;
            if (mv32 != null) {
                aVar.mo74322i(2, mv32.computeSize());
                this.f144525e.writeFields(aVar);
            }
            String str2 = this.f144526f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            C51975xh2 xh22 = this.f144527g;
            if (xh22 != null) {
                aVar.mo74322i(4, xh22.computeSize());
                this.f144527g.writeFields(aVar);
            }
            String str3 = this.f144528h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            return 0;
        } else if (i == 1) {
            String str4 = this.f144524d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            C50456mv3 mv33 = this.f144525e;
            if (mv33 != null) {
                i2 += C52418a.m58682i(2, mv33.computeSize());
            }
            String str5 = this.f144526f;
            if (str5 != null) {
                i2 += C52418a.m58683j(3, str5);
            }
            C51975xh2 xh23 = this.f144527g;
            if (xh23 != null) {
                i2 += C52418a.m58682i(4, xh23.computeSize());
            }
            String str6 = this.f144528h;
            return str6 != null ? i2 + C52418a.m58683j(5, str6) : i2;
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
            C51940x9 x9Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                x9Var.f144524d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C50456mv3 mv34 = new C50456mv3();
                    if (bArr != null && bArr.length > 0) {
                        mv34.parseFrom(bArr);
                    }
                    x9Var.f144525e = mv34;
                }
                return 0;
            } else if (intValue == 3) {
                x9Var.f144526f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C51975xh2 xh24 = new C51975xh2();
                    if (bArr2 != null && bArr2.length > 0) {
                        xh24.parseFrom(bArr2);
                    }
                    x9Var.f144527g = xh24;
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                x9Var.f144528h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
