package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ta0 */
public class C51366ta0 extends C47465a {

    /* renamed from: d */
    public String f142067d;

    /* renamed from: e */
    public String f142068e;

    /* renamed from: f */
    public LinkedList<String> f142069f = new LinkedList<>();

    /* renamed from: g */
    public boolean f142070g;

    /* renamed from: h */
    public int f142071h;

    /* renamed from: i */
    public C49305em2 f142072i;

    /* renamed from: j */
    public boolean f142073j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51366ta0)) {
            return false;
        }
        C51366ta0 ta02 = (C51366ta0) aVar;
        return C46238a.m51546a(this.f142067d, ta02.f142067d) && C46238a.m51546a(this.f142068e, ta02.f142068e) && C46238a.m51546a(this.f142069f, ta02.f142069f) && C46238a.m51546a(Boolean.valueOf(this.f142070g), Boolean.valueOf(ta02.f142070g)) && C46238a.m51546a(Integer.valueOf(this.f142071h), Integer.valueOf(ta02.f142071h)) && C46238a.m51546a(this.f142072i, ta02.f142072i) && C46238a.m51546a(Boolean.valueOf(this.f142073j), Boolean.valueOf(ta02.f142073j));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f142067d;
            if (str != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                String str2 = this.f142068e;
                if (str2 != null) {
                    aVar.mo74323j(2, str2);
                }
                aVar.mo74320g(3, 1, this.f142069f);
                aVar.mo74314a(4, this.f142070g);
                aVar.mo74318e(5, this.f142071h);
                C49305em2 em22 = this.f142072i;
                if (em22 != null) {
                    aVar.mo74322i(6, em22.computeSize());
                    this.f142072i.writeFields(aVar);
                }
                aVar.mo74314a(7, this.f142073j);
                return 0;
            }
            throw new C52419b("Not all required fields were included: LoginUrl");
        } else if (i == 1) {
            String str3 = this.f142067d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f142068e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            int g = i2 + C52418a.m58680g(3, 1, this.f142069f) + C52418a.m58674a(4, this.f142070g) + C52418a.m58678e(5, this.f142071h);
            C49305em2 em23 = this.f142072i;
            if (em23 != null) {
                g += C52418a.m58682i(6, em23.computeSize());
            }
            return g + C52418a.m58674a(7, this.f142073j);
        } else if (i == 2) {
            this.f142069f.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f142067d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: LoginUrl");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C51366ta0 ta02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    ta02.f142067d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    ta02.f142068e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    ta02.f142069f.add(aVar3.mo141633k(intValue));
                    return 0;
                case 4:
                    ta02.f142070g = aVar3.mo141625c(intValue);
                    return 0;
                case 5:
                    ta02.f142071h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C49305em2 em24 = new C49305em2();
                        if (bArr != null && bArr.length > 0) {
                            em24.parseFrom(bArr);
                        }
                        ta02.f142072i = em24;
                    }
                    return 0;
                case 7:
                    ta02.f142073j = aVar3.mo141625c(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
