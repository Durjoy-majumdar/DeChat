package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ag */
public class C48706ag extends C47465a {

    /* renamed from: d */
    public int f130486d;

    /* renamed from: e */
    public int f130487e;

    /* renamed from: f */
    public long f130488f;

    /* renamed from: g */
    public String f130489g;

    /* renamed from: h */
    public String f130490h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48706ag)) {
            return false;
        }
        C48706ag agVar = (C48706ag) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f130486d), Integer.valueOf(agVar.f130486d)) && C46238a.m51546a(Integer.valueOf(this.f130487e), Integer.valueOf(agVar.f130487e)) && C46238a.m51546a(Long.valueOf(this.f130488f), Long.valueOf(agVar.f130488f)) && C46238a.m51546a(this.f130489g, agVar.f130489g) && C46238a.m51546a(this.f130490h, agVar.f130490h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f130486d);
            aVar.mo74318e(2, this.f130487e);
            aVar.mo74321h(3, this.f130488f);
            String str = this.f130489g;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            String str2 = this.f130490h;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f130486d) + 0 + C52418a.m58678e(2, this.f130487e) + C52418a.m58681h(3, this.f130488f);
            String str3 = this.f130489g;
            if (str3 != null) {
                e += C52418a.m58683j(4, str3);
            }
            String str4 = this.f130490h;
            return str4 != null ? e + C52418a.m58683j(5, str4) : e;
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
            C48706ag agVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                agVar.f130486d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                agVar.f130487e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                agVar.f130488f = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 4) {
                agVar.f130489g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                agVar.f130490h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
