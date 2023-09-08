package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.at2 */
public class C48759at2 extends C47465a {

    /* renamed from: d */
    public int f130757d;

    /* renamed from: e */
    public String f130758e;

    /* renamed from: f */
    public String f130759f;

    /* renamed from: g */
    public String f130760g;

    /* renamed from: h */
    public LinkedList<Integer> f130761h = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48759at2)) {
            return false;
        }
        C48759at2 at22 = (C48759at2) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f130757d), Integer.valueOf(at22.f130757d)) && C46238a.m51546a(this.f130758e, at22.f130758e) && C46238a.m51546a(this.f130759f, at22.f130759f) && C46238a.m51546a(this.f130760g, at22.f130760g) && C46238a.m51546a(this.f130761h, at22.f130761h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f130757d);
            String str = this.f130758e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f130759f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f130760g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            aVar.mo74320g(5, 2, this.f130761h);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f130757d) + 0;
            String str4 = this.f130758e;
            if (str4 != null) {
                e += C52418a.m58683j(2, str4);
            }
            String str5 = this.f130759f;
            if (str5 != null) {
                e += C52418a.m58683j(3, str5);
            }
            String str6 = this.f130760g;
            if (str6 != null) {
                e += C52418a.m58683j(4, str6);
            }
            return e + C52418a.m58680g(5, 2, this.f130761h);
        } else if (i == 2) {
            this.f130761h.clear();
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
            C48759at2 at22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                at22.f130757d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                at22.f130758e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                at22.f130759f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                at22.f130760g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                at22.f130761h.add(Integer.valueOf(aVar3.mo141629g(intValue)));
                return 0;
            }
        }
    }
}
