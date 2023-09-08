package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.lw */
public class C50316lw extends C47465a {

    /* renamed from: d */
    public C89349b f137671d;

    /* renamed from: e */
    public C89349b f137672e;

    /* renamed from: f */
    public String f137673f;

    /* renamed from: g */
    public int f137674g;

    /* renamed from: h */
    public String f137675h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50316lw)) {
            return false;
        }
        C50316lw lwVar = (C50316lw) aVar;
        return C46238a.m51546a(this.f137671d, lwVar.f137671d) && C46238a.m51546a(this.f137672e, lwVar.f137672e) && C46238a.m51546a(this.f137673f, lwVar.f137673f) && C46238a.m51546a(Integer.valueOf(this.f137674g), Integer.valueOf(lwVar.f137674g)) && C46238a.m51546a(this.f137675h, lwVar.f137675h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C89349b bVar = this.f137671d;
            if (bVar != null) {
                aVar.mo74315b(1, bVar);
            }
            C89349b bVar2 = this.f137672e;
            if (bVar2 != null) {
                aVar.mo74315b(2, bVar2);
            }
            String str = this.f137673f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74318e(4, this.f137674g);
            String str2 = this.f137675h;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            return 0;
        } else if (i == 1) {
            C89349b bVar3 = this.f137671d;
            if (bVar3 != null) {
                i2 = 0 + C52418a.m58675b(1, bVar3);
            }
            C89349b bVar4 = this.f137672e;
            if (bVar4 != null) {
                i2 += C52418a.m58675b(2, bVar4);
            }
            String str3 = this.f137673f;
            if (str3 != null) {
                i2 += C52418a.m58683j(3, str3);
            }
            int e = i2 + C52418a.m58678e(4, this.f137674g);
            String str4 = this.f137675h;
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
            C50316lw lwVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                lwVar.f137671d = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue == 2) {
                lwVar.f137672e = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue == 3) {
                lwVar.f137673f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                lwVar.f137674g = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                lwVar.f137675h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
