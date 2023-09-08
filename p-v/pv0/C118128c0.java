package pv0;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: pv0.c0 */
public class C118128c0 extends C47465a {

    /* renamed from: d */
    public String f353132d;

    /* renamed from: e */
    public long f353133e;

    /* renamed from: f */
    public long f353134f;

    /* renamed from: g */
    public String f353135g;

    /* renamed from: h */
    public String f353136h;

    /* renamed from: i */
    public LinkedList<String> f353137i = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C118128c0)) {
            return false;
        }
        C118128c0 c0Var = (C118128c0) aVar;
        return C46238a.m51546a(this.f353132d, c0Var.f353132d) && C46238a.m51546a(Long.valueOf(this.f353133e), Long.valueOf(c0Var.f353133e)) && C46238a.m51546a(Long.valueOf(this.f353134f), Long.valueOf(c0Var.f353134f)) && C46238a.m51546a(this.f353135g, c0Var.f353135g) && C46238a.m51546a(this.f353136h, c0Var.f353136h) && C46238a.m51546a(this.f353137i, c0Var.f353137i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f353132d;
            if (str == null) {
                throw new C52419b("Not all required fields were included: BakChatName");
            } else if (this.f353135g == null) {
                throw new C52419b("Not all required fields were included: MsgDataID");
            } else if (this.f353136h != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                aVar.mo74321h(2, this.f353133e);
                aVar.mo74321h(3, this.f353134f);
                String str2 = this.f353135g;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                String str3 = this.f353136h;
                if (str3 != null) {
                    aVar.mo74323j(5, str3);
                }
                aVar.mo74320g(6, 1, this.f353137i);
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: NickName");
            }
        } else if (i == 1) {
            String str4 = this.f353132d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            int h = i2 + C52418a.m58681h(2, this.f353133e) + C52418a.m58681h(3, this.f353134f);
            String str5 = this.f353135g;
            if (str5 != null) {
                h += C52418a.m58683j(4, str5);
            }
            String str6 = this.f353136h;
            if (str6 != null) {
                h += C52418a.m58683j(5, str6);
            }
            return h + C52418a.m58680g(6, 1, this.f353137i);
        } else if (i == 2) {
            this.f353137i.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f353132d == null) {
                throw new C52419b("Not all required fields were included: BakChatName");
            } else if (this.f353135g == null) {
                throw new C52419b("Not all required fields were included: MsgDataID");
            } else if (this.f353136h != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: NickName");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C118128c0 c0Var = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    c0Var.f353132d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    c0Var.f353133e = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    c0Var.f353134f = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    c0Var.f353135g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    c0Var.f353136h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    c0Var.f353137i.add(aVar3.mo141633k(intValue));
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
