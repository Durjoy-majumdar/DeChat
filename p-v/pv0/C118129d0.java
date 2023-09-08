package pv0;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: pv0.d0 */
public class C118129d0 extends C47465a {

    /* renamed from: d */
    public String f353138d;

    /* renamed from: e */
    public long f353139e;

    /* renamed from: f */
    public long f353140f;

    /* renamed from: g */
    public String f353141g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C118129d0)) {
            return false;
        }
        C118129d0 d0Var = (C118129d0) aVar;
        return C46238a.m51546a(this.f353138d, d0Var.f353138d) && C46238a.m51546a(Long.valueOf(this.f353139e), Long.valueOf(d0Var.f353139e)) && C46238a.m51546a(Long.valueOf(this.f353140f), Long.valueOf(d0Var.f353140f)) && C46238a.m51546a(this.f353141g, d0Var.f353141g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f353138d;
            if (str == null) {
                throw new C52419b("Not all required fields were included: BakChatName");
            } else if (this.f353141g != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                aVar.mo74321h(2, this.f353139e);
                aVar.mo74321h(3, this.f353140f);
                String str2 = this.f353141g;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: MsgDataID");
            }
        } else if (i == 1) {
            String str3 = this.f353138d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            int h = i2 + C52418a.m58681h(2, this.f353139e) + C52418a.m58681h(3, this.f353140f);
            String str4 = this.f353141g;
            return str4 != null ? h + C52418a.m58683j(4, str4) : h;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f353138d == null) {
                throw new C52419b("Not all required fields were included: BakChatName");
            } else if (this.f353141g != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: MsgDataID");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C118129d0 d0Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                d0Var.f353138d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                d0Var.f353139e = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 3) {
                d0Var.f353140f = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                d0Var.f353141g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
