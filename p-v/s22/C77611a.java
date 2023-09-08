package s22;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: s22.a */
public class C77611a extends C47465a {

    /* renamed from: d */
    public String f226267d;

    /* renamed from: e */
    public LinkedList<String> f226268e = new LinkedList<>();

    /* renamed from: f */
    public double f226269f;

    /* renamed from: g */
    public double f226270g;

    /* renamed from: h */
    public String f226271h;

    /* renamed from: i */
    public long f226272i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77611a)) {
            return false;
        }
        C77611a aVar2 = (C77611a) aVar;
        return C46238a.m51546a(this.f226267d, aVar2.f226267d) && C46238a.m51546a(this.f226268e, aVar2.f226268e) && C46238a.m51546a(Double.valueOf(this.f226269f), Double.valueOf(aVar2.f226269f)) && C46238a.m51546a(Double.valueOf(this.f226270g), Double.valueOf(aVar2.f226270g)) && C46238a.m51546a(this.f226271h, aVar2.f226271h) && C46238a.m51546a(Long.valueOf(this.f226272i), Long.valueOf(aVar2.f226272i));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f226267d;
            if (str != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                aVar.mo74320g(2, 1, this.f226268e);
                aVar.mo74316c(3, this.f226269f);
                aVar.mo74316c(4, this.f226270g);
                String str2 = this.f226271h;
                if (str2 != null) {
                    aVar.mo74323j(5, str2);
                }
                aVar.mo74321h(6, this.f226272i);
                return 0;
            }
            throw new C52419b("Not all required fields were included: username");
        } else if (i == 1) {
            String str3 = this.f226267d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            int g = i2 + C52418a.m58680g(2, 1, this.f226268e) + C52418a.m58676c(3, this.f226269f) + C52418a.m58676c(4, this.f226270g);
            String str4 = this.f226271h;
            if (str4 != null) {
                g += C52418a.m58683j(5, str4);
            }
            return g + C52418a.m58681h(6, this.f226272i);
        } else if (i == 2) {
            this.f226268e.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f226267d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: username");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C77611a aVar4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    aVar4.f226267d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    aVar4.f226268e.add(aVar3.mo141633k(intValue));
                    return 0;
                case 3:
                    aVar4.f226269f = aVar3.mo141627e(intValue);
                    return 0;
                case 4:
                    aVar4.f226270g = aVar3.mo141627e(intValue);
                    return 0;
                case 5:
                    aVar4.f226271h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    aVar4.f226272i = aVar3.mo141631i(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
