package v41;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: v41.d */
public class C52745d extends C47465a {

    /* renamed from: d */
    public String f147368d;

    /* renamed from: e */
    public String f147369e;

    /* renamed from: f */
    public String f147370f;

    /* renamed from: g */
    public String f147371g;

    /* renamed from: h */
    public int f147372h;

    /* renamed from: i */
    public int f147373i;

    /* renamed from: j */
    public C52749h f147374j;

    /* renamed from: n */
    public String f147375n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52745d)) {
            return false;
        }
        C52745d dVar = (C52745d) aVar;
        return C46238a.m51546a(this.f147368d, dVar.f147368d) && C46238a.m51546a(this.f147369e, dVar.f147369e) && C46238a.m51546a(this.f147370f, dVar.f147370f) && C46238a.m51546a(this.f147371g, dVar.f147371g) && C46238a.m51546a(Integer.valueOf(this.f147372h), Integer.valueOf(dVar.f147372h)) && C46238a.m51546a(Integer.valueOf(this.f147373i), Integer.valueOf(dVar.f147373i)) && C46238a.m51546a(this.f147374j, dVar.f147374j) && C46238a.m51546a(this.f147375n, dVar.f147375n);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f147368d;
            if (str == null) {
                throw new C52419b("Not all required fields were included: appid");
            } else if (this.f147369e != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                String str2 = this.f147369e;
                if (str2 != null) {
                    aVar.mo74323j(2, str2);
                }
                String str3 = this.f147370f;
                if (str3 != null) {
                    aVar.mo74323j(3, str3);
                }
                String str4 = this.f147371g;
                if (str4 != null) {
                    aVar.mo74323j(4, str4);
                }
                aVar.mo74318e(5, this.f147372h);
                aVar.mo74318e(6, this.f147373i);
                C52749h hVar = this.f147374j;
                if (hVar != null) {
                    aVar.mo74322i(7, hVar.computeSize());
                    this.f147374j.writeFields(aVar);
                }
                String str5 = this.f147375n;
                if (str5 != null) {
                    aVar.mo74323j(8, str5);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: app_name");
            }
        } else if (i == 1) {
            String str6 = this.f147368d;
            if (str6 != null) {
                i2 = 0 + C52418a.m58683j(1, str6);
            }
            String str7 = this.f147369e;
            if (str7 != null) {
                i2 += C52418a.m58683j(2, str7);
            }
            String str8 = this.f147370f;
            if (str8 != null) {
                i2 += C52418a.m58683j(3, str8);
            }
            String str9 = this.f147371g;
            if (str9 != null) {
                i2 += C52418a.m58683j(4, str9);
            }
            int e = i2 + C52418a.m58678e(5, this.f147372h) + C52418a.m58678e(6, this.f147373i);
            C52749h hVar2 = this.f147374j;
            if (hVar2 != null) {
                e += C52418a.m58682i(7, hVar2.computeSize());
            }
            String str10 = this.f147375n;
            return str10 != null ? e + C52418a.m58683j(8, str10) : e;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f147368d == null) {
                throw new C52419b("Not all required fields were included: appid");
            } else if (this.f147369e != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: app_name");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C52745d dVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    dVar.f147368d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    dVar.f147369e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    dVar.f147370f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    dVar.f147371g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    dVar.f147372h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    dVar.f147373i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C52749h hVar3 = new C52749h();
                        if (bArr != null && bArr.length > 0) {
                            hVar3.parseFrom(bArr);
                        }
                        dVar.f147374j = hVar3;
                    }
                    return 0;
                case 8:
                    dVar.f147375n = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
