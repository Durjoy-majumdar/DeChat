package pv0;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: pv0.t */
public class C100967t extends C47465a {

    /* renamed from: d */
    public String f295662d;

    /* renamed from: e */
    public String f295663e;

    /* renamed from: f */
    public String f295664f;

    /* renamed from: g */
    public String f295665g;

    /* renamed from: h */
    public long f295666h;

    /* renamed from: i */
    public long f295667i;

    /* renamed from: j */
    public String f295668j;

    /* renamed from: n */
    public String f295669n;

    /* renamed from: o */
    public String f295670o;

    /* renamed from: p */
    public C89349b f295671p;

    /* renamed from: q */
    public C89349b f295672q;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C100967t)) {
            return false;
        }
        C100967t tVar = (C100967t) aVar;
        return C46238a.m51546a(this.f295662d, tVar.f295662d) && C46238a.m51546a(this.f295663e, tVar.f295663e) && C46238a.m51546a(this.f295664f, tVar.f295664f) && C46238a.m51546a(this.f295665g, tVar.f295665g) && C46238a.m51546a(Long.valueOf(this.f295666h), Long.valueOf(tVar.f295666h)) && C46238a.m51546a(Long.valueOf(this.f295667i), Long.valueOf(tVar.f295667i)) && C46238a.m51546a(this.f295668j, tVar.f295668j) && C46238a.m51546a(this.f295669n, tVar.f295669n) && C46238a.m51546a(this.f295670o, tVar.f295670o) && C46238a.m51546a(this.f295671p, tVar.f295671p) && C46238a.m51546a(this.f295672q, tVar.f295672q);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f295662d;
            if (str == null) {
                throw new C52419b("Not all required fields were included: WeChatVersion");
            } else if (this.f295663e == null) {
                throw new C52419b("Not all required fields were included: WeChatUserID");
            } else if (this.f295664f == null) {
                throw new C52419b("Not all required fields were included: WeChatNickName");
            } else if (this.f295665g == null) {
                throw new C52419b("Not all required fields were included: WeChatInstallDir");
            } else if (this.f295668j == null) {
                throw new C52419b("Not all required fields were included: Manufacturer");
            } else if (this.f295669n == null) {
                throw new C52419b("Not all required fields were included: Model");
            } else if (this.f295670o != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                String str2 = this.f295663e;
                if (str2 != null) {
                    aVar.mo74323j(2, str2);
                }
                String str3 = this.f295664f;
                if (str3 != null) {
                    aVar.mo74323j(3, str3);
                }
                String str4 = this.f295665g;
                if (str4 != null) {
                    aVar.mo74323j(4, str4);
                }
                aVar.mo74321h(5, this.f295666h);
                aVar.mo74321h(6, this.f295667i);
                String str5 = this.f295668j;
                if (str5 != null) {
                    aVar.mo74323j(7, str5);
                }
                String str6 = this.f295669n;
                if (str6 != null) {
                    aVar.mo74323j(8, str6);
                }
                String str7 = this.f295670o;
                if (str7 != null) {
                    aVar.mo74323j(9, str7);
                }
                C89349b bVar = this.f295671p;
                if (bVar != null) {
                    aVar.mo74315b(10, bVar);
                }
                C89349b bVar2 = this.f295672q;
                if (bVar2 != null) {
                    aVar.mo74315b(11, bVar2);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: Version");
            }
        } else if (i2 == 1) {
            String str8 = this.f295662d;
            if (str8 != null) {
                i3 = C52418a.m58683j(1, str8) + 0;
            }
            String str9 = this.f295663e;
            if (str9 != null) {
                i3 += C52418a.m58683j(2, str9);
            }
            String str10 = this.f295664f;
            if (str10 != null) {
                i3 += C52418a.m58683j(3, str10);
            }
            String str11 = this.f295665g;
            if (str11 != null) {
                i3 += C52418a.m58683j(4, str11);
            }
            int h = i3 + C52418a.m58681h(5, this.f295666h) + C52418a.m58681h(6, this.f295667i);
            String str12 = this.f295668j;
            if (str12 != null) {
                h += C52418a.m58683j(7, str12);
            }
            String str13 = this.f295669n;
            if (str13 != null) {
                h += C52418a.m58683j(8, str13);
            }
            String str14 = this.f295670o;
            if (str14 != null) {
                h += C52418a.m58683j(9, str14);
            }
            C89349b bVar3 = this.f295671p;
            if (bVar3 != null) {
                h += C52418a.m58675b(10, bVar3);
            }
            C89349b bVar4 = this.f295672q;
            return bVar4 != null ? h + C52418a.m58675b(11, bVar4) : h;
        } else if (i2 == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f295662d == null) {
                throw new C52419b("Not all required fields were included: WeChatVersion");
            } else if (this.f295663e == null) {
                throw new C52419b("Not all required fields were included: WeChatUserID");
            } else if (this.f295664f == null) {
                throw new C52419b("Not all required fields were included: WeChatNickName");
            } else if (this.f295665g == null) {
                throw new C52419b("Not all required fields were included: WeChatInstallDir");
            } else if (this.f295668j == null) {
                throw new C52419b("Not all required fields were included: Manufacturer");
            } else if (this.f295669n == null) {
                throw new C52419b("Not all required fields were included: Model");
            } else if (this.f295670o != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: Version");
            }
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C100967t tVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    tVar.f295662d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    tVar.f295663e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    tVar.f295664f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    tVar.f295665g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    tVar.f295666h = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    tVar.f295667i = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    tVar.f295668j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    tVar.f295669n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    tVar.f295670o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    tVar.f295671p = aVar3.mo141626d(intValue);
                    return 0;
                case 11:
                    tVar.f295672q = aVar3.mo141626d(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
