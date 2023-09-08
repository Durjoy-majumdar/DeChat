package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.q3 */
public class C50908q3 extends C47465a {

    /* renamed from: d */
    public String f140112d;

    /* renamed from: e */
    public String f140113e;

    /* renamed from: f */
    public long f140114f;

    /* renamed from: g */
    public C89349b f140115g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50908q3)) {
            return false;
        }
        C50908q3 q3Var = (C50908q3) aVar;
        return C46238a.m51546a(this.f140112d, q3Var.f140112d) && C46238a.m51546a(this.f140113e, q3Var.f140113e) && C46238a.m51546a(Long.valueOf(this.f140114f), Long.valueOf(q3Var.f140114f)) && C46238a.m51546a(this.f140115g, q3Var.f140115g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f140112d;
            if (str == null) {
                throw new C52419b("Not all required fields were included: tp_username");
            } else if (this.f140113e != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                String str2 = this.f140113e;
                if (str2 != null) {
                    aVar.mo74323j(2, str2);
                }
                aVar.mo74321h(3, this.f140114f);
                C89349b bVar = this.f140115g;
                if (bVar != null) {
                    aVar.mo74315b(4, bVar);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: antispam_ticket");
            }
        } else if (i == 1) {
            String str3 = this.f140112d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f140113e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            int h = i2 + C52418a.m58681h(3, this.f140114f);
            C89349b bVar2 = this.f140115g;
            return bVar2 != null ? h + C52418a.m58675b(4, bVar2) : h;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f140112d == null) {
                throw new C52419b("Not all required fields were included: tp_username");
            } else if (this.f140113e != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: antispam_ticket");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C50908q3 q3Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                q3Var.f140112d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                q3Var.f140113e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                q3Var.f140114f = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                q3Var.f140115g = aVar3.mo141626d(intValue);
                return 0;
            }
        }
    }
}
