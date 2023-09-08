package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.jm2 */
public class C50010jm2 extends C47465a {

    /* renamed from: d */
    public String f136197d;

    /* renamed from: e */
    public String f136198e;

    /* renamed from: f */
    public LinkedList<String> f136199f = new LinkedList<>();

    /* renamed from: g */
    public boolean f136200g;

    /* renamed from: h */
    public int f136201h;

    /* renamed from: i */
    public C49305em2 f136202i;

    /* renamed from: j */
    public boolean f136203j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50010jm2)) {
            return false;
        }
        C50010jm2 jm22 = (C50010jm2) aVar;
        return C46238a.m51546a(this.f136197d, jm22.f136197d) && C46238a.m51546a(this.f136198e, jm22.f136198e) && C46238a.m51546a(this.f136199f, jm22.f136199f) && C46238a.m51546a(Boolean.valueOf(this.f136200g), Boolean.valueOf(jm22.f136200g)) && C46238a.m51546a(Integer.valueOf(this.f136201h), Integer.valueOf(jm22.f136201h)) && C46238a.m51546a(this.f136202i, jm22.f136202i) && C46238a.m51546a(Boolean.valueOf(this.f136203j), Boolean.valueOf(jm22.f136203j));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f136197d;
            if (str != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                String str2 = this.f136198e;
                if (str2 != null) {
                    aVar.mo74323j(2, str2);
                }
                aVar.mo74320g(3, 1, this.f136199f);
                aVar.mo74314a(4, this.f136200g);
                aVar.mo74318e(5, this.f136201h);
                C49305em2 em22 = this.f136202i;
                if (em22 != null) {
                    aVar.mo74322i(6, em22.computeSize());
                    this.f136202i.writeFields(aVar);
                }
                aVar.mo74314a(7, this.f136203j);
                return 0;
            }
            throw new C52419b("Not all required fields were included: LoginUrl");
        } else if (i == 1) {
            String str3 = this.f136197d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f136198e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            int g = i2 + C52418a.m58680g(3, 1, this.f136199f) + C52418a.m58674a(4, this.f136200g) + C52418a.m58678e(5, this.f136201h);
            C49305em2 em23 = this.f136202i;
            if (em23 != null) {
                g += C52418a.m58682i(6, em23.computeSize());
            }
            return g + C52418a.m58674a(7, this.f136203j);
        } else if (i == 2) {
            this.f136199f.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f136197d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: LoginUrl");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C50010jm2 jm22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    jm22.f136197d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    jm22.f136198e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    jm22.f136199f.add(aVar3.mo141633k(intValue));
                    return 0;
                case 4:
                    jm22.f136200g = aVar3.mo141625c(intValue);
                    return 0;
                case 5:
                    jm22.f136201h = aVar3.mo141629g(intValue);
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
                        jm22.f136202i = em24;
                    }
                    return 0;
                case 7:
                    jm22.f136203j = aVar3.mo141625c(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
