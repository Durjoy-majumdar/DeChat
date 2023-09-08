package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.o91 */
public class C64605o91 extends C47465a {

    /* renamed from: d */
    public long f184634d;

    /* renamed from: e */
    public C89349b f184635e;

    /* renamed from: f */
    public C89349b f184636f;

    /* renamed from: g */
    public boolean f184637g;

    /* renamed from: h */
    public String f184638h;

    /* renamed from: i */
    public C89349b f184639i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64605o91)) {
            return false;
        }
        C64605o91 o912 = (C64605o91) aVar;
        return C46238a.m51546a(Long.valueOf(this.f184634d), Long.valueOf(o912.f184634d)) && C46238a.m51546a(this.f184635e, o912.f184635e) && C46238a.m51546a(this.f184636f, o912.f184636f) && C46238a.m51546a(Boolean.valueOf(this.f184637g), Boolean.valueOf(o912.f184637g)) && C46238a.m51546a(this.f184638h, o912.f184638h) && C46238a.m51546a(this.f184639i, o912.f184639i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f184634d);
            C89349b bVar = this.f184635e;
            if (bVar != null) {
                aVar.mo74315b(2, bVar);
            }
            C89349b bVar2 = this.f184636f;
            if (bVar2 != null) {
                aVar.mo74315b(3, bVar2);
            }
            aVar.mo74314a(4, this.f184637g);
            String str = this.f184638h;
            if (str != null) {
                aVar.mo74323j(5, str);
            }
            C89349b bVar3 = this.f184639i;
            if (bVar3 != null) {
                aVar.mo74315b(6, bVar3);
            }
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f184634d) + 0;
            C89349b bVar4 = this.f184635e;
            if (bVar4 != null) {
                h += C52418a.m58675b(2, bVar4);
            }
            C89349b bVar5 = this.f184636f;
            if (bVar5 != null) {
                h += C52418a.m58675b(3, bVar5);
            }
            int a = h + C52418a.m58674a(4, this.f184637g);
            String str2 = this.f184638h;
            if (str2 != null) {
                a += C52418a.m58683j(5, str2);
            }
            C89349b bVar6 = this.f184639i;
            return bVar6 != null ? a + C52418a.m58675b(6, bVar6) : a;
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
            C64605o91 o912 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    o912.f184634d = aVar3.mo141631i(intValue);
                    return 0;
                case 2:
                    o912.f184635e = aVar3.mo141626d(intValue);
                    return 0;
                case 3:
                    o912.f184636f = aVar3.mo141626d(intValue);
                    return 0;
                case 4:
                    o912.f184637g = aVar3.mo141625c(intValue);
                    return 0;
                case 5:
                    o912.f184638h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    o912.f184639i = aVar3.mo141626d(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
