package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.wo2 */
public class C64807wo2 extends C47465a {

    /* renamed from: d */
    public String f186145d;

    /* renamed from: e */
    public String f186146e;

    /* renamed from: f */
    public String f186147f;

    /* renamed from: g */
    public String f186148g;

    /* renamed from: h */
    public LinkedList<C64780vo2> f186149h = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64807wo2)) {
            return false;
        }
        C64807wo2 wo22 = (C64807wo2) aVar;
        return C46238a.m51546a(this.f186145d, wo22.f186145d) && C46238a.m51546a(this.f186146e, wo22.f186146e) && C46238a.m51546a(this.f186147f, wo22.f186147f) && C46238a.m51546a(this.f186148g, wo22.f186148g) && C46238a.m51546a(this.f186149h, wo22.f186149h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f186145d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f186146e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f186147f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f186148g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            aVar.mo74320g(5, 8, this.f186149h);
            return 0;
        } else if (i == 1) {
            String str5 = this.f186145d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            String str6 = this.f186146e;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            String str7 = this.f186147f;
            if (str7 != null) {
                i2 += C52418a.m58683j(3, str7);
            }
            String str8 = this.f186148g;
            if (str8 != null) {
                i2 += C52418a.m58683j(4, str8);
            }
            return i2 + C52418a.m58680g(5, 8, this.f186149h);
        } else if (i == 2) {
            this.f186149h.clear();
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
            C64807wo2 wo22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                wo22.f186145d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                wo22.f186146e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                wo22.f186147f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                wo22.f186148g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C64780vo2 vo22 = new C64780vo2();
                    if (bArr != null && bArr.length > 0) {
                        vo22.parseFrom(bArr);
                    }
                    wo22.f186149h.add(vo22);
                }
                return 0;
            }
        }
    }
}
