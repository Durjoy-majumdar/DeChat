package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.lz */
public class C64540lz extends C47465a {

    /* renamed from: d */
    public LinkedList<String> f184181d = new LinkedList<>();

    /* renamed from: e */
    public int f184182e;

    /* renamed from: f */
    public boolean f184183f;

    /* renamed from: g */
    public int f184184g;

    /* renamed from: h */
    public String f184185h;

    /* renamed from: i */
    public String f184186i;

    /* renamed from: j */
    public long f184187j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64540lz)) {
            return false;
        }
        C64540lz lzVar = (C64540lz) aVar;
        return C46238a.m51546a(this.f184181d, lzVar.f184181d) && C46238a.m51546a(Integer.valueOf(this.f184182e), Integer.valueOf(lzVar.f184182e)) && C46238a.m51546a(Boolean.valueOf(this.f184183f), Boolean.valueOf(lzVar.f184183f)) && C46238a.m51546a(Integer.valueOf(this.f184184g), Integer.valueOf(lzVar.f184184g)) && C46238a.m51546a(this.f184185h, lzVar.f184185h) && C46238a.m51546a(this.f184186i, lzVar.f184186i) && C46238a.m51546a(Long.valueOf(this.f184187j), Long.valueOf(lzVar.f184187j));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 1, this.f184181d);
            aVar.mo74318e(2, this.f184182e);
            aVar.mo74314a(3, this.f184183f);
            aVar.mo74318e(4, this.f184184g);
            String str = this.f184185h;
            if (str != null) {
                aVar.mo74323j(5, str);
            }
            String str2 = this.f184186i;
            if (str2 != null) {
                aVar.mo74323j(6, str2);
            }
            aVar.mo74321h(7, this.f184187j);
            return 0;
        } else if (i == 1) {
            int g = C52418a.m58680g(1, 1, this.f184181d) + 0 + C52418a.m58678e(2, this.f184182e) + C52418a.m58674a(3, this.f184183f) + C52418a.m58678e(4, this.f184184g);
            String str3 = this.f184185h;
            if (str3 != null) {
                g += C52418a.m58683j(5, str3);
            }
            String str4 = this.f184186i;
            if (str4 != null) {
                g += C52418a.m58683j(6, str4);
            }
            return g + C52418a.m58681h(7, this.f184187j);
        } else if (i == 2) {
            this.f184181d.clear();
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
            C64540lz lzVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    lzVar.f184181d.add(aVar3.mo141633k(intValue));
                    return 0;
                case 2:
                    lzVar.f184182e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    lzVar.f184183f = aVar3.mo141625c(intValue);
                    return 0;
                case 4:
                    lzVar.f184184g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    lzVar.f184185h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    lzVar.f184186i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    lzVar.f184187j = aVar3.mo141631i(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
