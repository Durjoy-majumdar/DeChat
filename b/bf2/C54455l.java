package bf2;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: bf2.l */
public class C54455l extends C47465a {

    /* renamed from: d */
    public String f152711d;

    /* renamed from: e */
    public int f152712e;

    /* renamed from: f */
    public String f152713f;

    /* renamed from: g */
    public LinkedList<C54453e> f152714g = new LinkedList<>();

    /* renamed from: h */
    public int f152715h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C54455l)) {
            return false;
        }
        C54455l lVar = (C54455l) aVar;
        return C46238a.m51546a(this.f152711d, lVar.f152711d) && C46238a.m51546a(Integer.valueOf(this.f152712e), Integer.valueOf(lVar.f152712e)) && C46238a.m51546a(this.f152713f, lVar.f152713f) && C46238a.m51546a(this.f152714g, lVar.f152714g) && C46238a.m51546a(Integer.valueOf(this.f152715h), Integer.valueOf(lVar.f152715h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f152711d;
            if (str != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                aVar.mo74318e(2, this.f152712e);
                String str2 = this.f152713f;
                if (str2 != null) {
                    aVar.mo74323j(3, str2);
                }
                aVar.mo74320g(4, 8, this.f152714g);
                aVar.mo74318e(5, this.f152715h);
                return 0;
            }
            throw new C52419b("Not all required fields were included: id_info");
        } else if (i == 1) {
            String str3 = this.f152711d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            int e = i2 + C52418a.m58678e(2, this.f152712e);
            String str4 = this.f152713f;
            if (str4 != null) {
                e += C52418a.m58683j(3, str4);
            }
            return e + C52418a.m58680g(4, 8, this.f152714g) + C52418a.m58678e(5, this.f152715h);
        } else if (i == 2) {
            this.f152714g.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f152711d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: id_info");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C54455l lVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                lVar.f152711d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                lVar.f152712e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                lVar.f152713f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C54453e eVar = new C54453e();
                    if (bArr != null && bArr.length > 0) {
                        eVar.parseFrom(bArr);
                    }
                    lVar.f152714g.add(eVar);
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                lVar.f152715h = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
