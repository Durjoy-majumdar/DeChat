package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.wf1 */
public class C64800wf1 extends C47465a {

    /* renamed from: d */
    public long f186081d;

    /* renamed from: e */
    public String f186082e;

    /* renamed from: f */
    public int f186083f;

    /* renamed from: g */
    public C89349b f186084g;

    /* renamed from: h */
    public String f186085h;

    /* renamed from: i */
    public long f186086i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64800wf1)) {
            return false;
        }
        C64800wf1 wf12 = (C64800wf1) aVar;
        return C46238a.m51546a(Long.valueOf(this.f186081d), Long.valueOf(wf12.f186081d)) && C46238a.m51546a(this.f186082e, wf12.f186082e) && C46238a.m51546a(Integer.valueOf(this.f186083f), Integer.valueOf(wf12.f186083f)) && C46238a.m51546a(this.f186084g, wf12.f186084g) && C46238a.m51546a(this.f186085h, wf12.f186085h) && C46238a.m51546a(Long.valueOf(this.f186086i), Long.valueOf(wf12.f186086i));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f186081d);
            String str = this.f186082e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f186083f);
            C89349b bVar = this.f186084g;
            if (bVar != null) {
                aVar.mo74315b(4, bVar);
            }
            String str2 = this.f186085h;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            aVar.mo74321h(6, this.f186086i);
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f186081d) + 0;
            String str3 = this.f186082e;
            if (str3 != null) {
                h += C52418a.m58683j(2, str3);
            }
            int e = h + C52418a.m58678e(3, this.f186083f);
            C89349b bVar2 = this.f186084g;
            if (bVar2 != null) {
                e += C52418a.m58675b(4, bVar2);
            }
            String str4 = this.f186085h;
            if (str4 != null) {
                e += C52418a.m58683j(5, str4);
            }
            return e + C52418a.m58681h(6, this.f186086i);
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
            C64800wf1 wf12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    wf12.f186081d = aVar3.mo141631i(intValue);
                    return 0;
                case 2:
                    wf12.f186082e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    wf12.f186083f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    wf12.f186084g = aVar3.mo141626d(intValue);
                    return 0;
                case 5:
                    wf12.f186085h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    wf12.f186086i = aVar3.mo141631i(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
