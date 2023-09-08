package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.mq1 */
public class C50436mq1 extends C47465a {

    /* renamed from: d */
    public long f138151d;

    /* renamed from: e */
    public int f138152e;

    /* renamed from: f */
    public double f138153f;

    /* renamed from: g */
    public String f138154g;

    /* renamed from: h */
    public String f138155h;

    /* renamed from: i */
    public String f138156i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50436mq1)) {
            return false;
        }
        C50436mq1 mq12 = (C50436mq1) aVar;
        return C46238a.m51546a(Long.valueOf(this.f138151d), Long.valueOf(mq12.f138151d)) && C46238a.m51546a(Integer.valueOf(this.f138152e), Integer.valueOf(mq12.f138152e)) && C46238a.m51546a(Double.valueOf(this.f138153f), Double.valueOf(mq12.f138153f)) && C46238a.m51546a(this.f138154g, mq12.f138154g) && C46238a.m51546a(this.f138155h, mq12.f138155h) && C46238a.m51546a(this.f138156i, mq12.f138156i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f138151d);
            aVar.mo74318e(2, this.f138152e);
            aVar.mo74316c(3, this.f138153f);
            String str = this.f138154g;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            String str2 = this.f138155h;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            String str3 = this.f138156i;
            if (str3 != null) {
                aVar.mo74323j(6, str3);
            }
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f138151d) + 0 + C52418a.m58678e(2, this.f138152e) + C52418a.m58676c(3, this.f138153f);
            String str4 = this.f138154g;
            if (str4 != null) {
                h += C52418a.m58683j(4, str4);
            }
            String str5 = this.f138155h;
            if (str5 != null) {
                h += C52418a.m58683j(5, str5);
            }
            String str6 = this.f138156i;
            return str6 != null ? h + C52418a.m58683j(6, str6) : h;
        } else if (i == 2) {
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
            C50436mq1 mq12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    mq12.f138151d = aVar3.mo141631i(intValue);
                    return 0;
                case 2:
                    mq12.f138152e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    mq12.f138153f = aVar3.mo141627e(intValue);
                    return 0;
                case 4:
                    mq12.f138154g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    mq12.f138155h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    mq12.f138156i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
