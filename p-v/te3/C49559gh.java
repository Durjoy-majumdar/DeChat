package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.gh */
public class C49559gh extends C47465a {

    /* renamed from: d */
    public long f134043d;

    /* renamed from: e */
    public LinkedList<C48851bg> f134044e = new LinkedList<>();

    /* renamed from: f */
    public int f134045f;

    /* renamed from: g */
    public String f134046g;

    /* renamed from: h */
    public String f134047h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49559gh)) {
            return false;
        }
        C49559gh ghVar = (C49559gh) aVar;
        return C46238a.m51546a(Long.valueOf(this.f134043d), Long.valueOf(ghVar.f134043d)) && C46238a.m51546a(this.f134044e, ghVar.f134044e) && C46238a.m51546a(Integer.valueOf(this.f134045f), Integer.valueOf(ghVar.f134045f)) && C46238a.m51546a(this.f134046g, ghVar.f134046g) && C46238a.m51546a(this.f134047h, ghVar.f134047h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f134043d);
            aVar.mo74320g(2, 8, this.f134044e);
            aVar.mo74318e(3, this.f134045f);
            String str = this.f134046g;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            String str2 = this.f134047h;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f134043d) + 0 + C52418a.m58680g(2, 8, this.f134044e) + C52418a.m58678e(3, this.f134045f);
            String str3 = this.f134046g;
            if (str3 != null) {
                h += C52418a.m58683j(4, str3);
            }
            String str4 = this.f134047h;
            return str4 != null ? h + C52418a.m58683j(5, str4) : h;
        } else if (i == 2) {
            this.f134044e.clear();
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
            C49559gh ghVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                ghVar.f134043d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C48851bg bgVar = new C48851bg();
                    if (bArr != null && bArr.length > 0) {
                        bgVar.parseFrom(bArr);
                    }
                    ghVar.f134044e.add(bgVar);
                }
                return 0;
            } else if (intValue == 3) {
                ghVar.f134045f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                ghVar.f134046g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                ghVar.f134047h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
