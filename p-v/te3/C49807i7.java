package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.i7 */
public class C49807i7 extends C47465a {

    /* renamed from: d */
    public String f135139d;

    /* renamed from: e */
    public String f135140e;

    /* renamed from: f */
    public String f135141f;

    /* renamed from: g */
    public LinkedList<String> f135142g = new LinkedList<>();

    /* renamed from: h */
    public long f135143h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49807i7)) {
            return false;
        }
        C49807i7 i7Var = (C49807i7) aVar;
        return C46238a.m51546a(this.f135139d, i7Var.f135139d) && C46238a.m51546a(this.f135140e, i7Var.f135140e) && C46238a.m51546a(this.f135141f, i7Var.f135141f) && C46238a.m51546a(this.f135142g, i7Var.f135142g) && C46238a.m51546a(Long.valueOf(this.f135143h), Long.valueOf(i7Var.f135143h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f135139d;
            if (str != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                String str2 = this.f135140e;
                if (str2 != null) {
                    aVar.mo74323j(2, str2);
                }
                String str3 = this.f135141f;
                if (str3 != null) {
                    aVar.mo74323j(3, str3);
                }
                aVar.mo74320g(4, 1, this.f135142g);
                aVar.mo74321h(5, this.f135143h);
                return 0;
            }
            throw new C52419b("Not all required fields were included: roomname");
        } else if (i == 1) {
            String str4 = this.f135139d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            String str5 = this.f135140e;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            String str6 = this.f135141f;
            if (str6 != null) {
                i2 += C52418a.m58683j(3, str6);
            }
            return i2 + C52418a.m58680g(4, 1, this.f135142g) + C52418a.m58681h(5, this.f135143h);
        } else if (i == 2) {
            this.f135142g.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f135139d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: roomname");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C49807i7 i7Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                i7Var.f135139d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                i7Var.f135140e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                i7Var.f135141f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                i7Var.f135142g.add(aVar3.mo141633k(intValue));
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                i7Var.f135143h = aVar3.mo141631i(intValue);
                return 0;
            }
        }
    }
}
