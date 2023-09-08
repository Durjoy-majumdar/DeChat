package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import t14.C77820c;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ak */
public class C48725ak extends C49335eu3 {

    /* renamed from: d */
    public int f130572d;

    /* renamed from: e */
    public String f130573e;

    /* renamed from: f */
    public long f130574f;

    /* renamed from: g */
    public C77820c f130575g;

    /* renamed from: h */
    public long f130576h;

    /* renamed from: i */
    public LinkedList<String> f130577i = new LinkedList<>();

    /* renamed from: j */
    public int f130578j;

    /* renamed from: n */
    public int f130579n;

    /* renamed from: o */
    public String f130580o;

    /* renamed from: p */
    public String f130581p;

    /* renamed from: q */
    public String f130582q;

    /* renamed from: r */
    public boolean f130583r;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48725ak)) {
            return false;
        }
        C48725ak akVar = (C48725ak) aVar;
        return C46238a.m51546a(this.BaseResponse, akVar.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f130572d), Integer.valueOf(akVar.f130572d)) && C46238a.m51546a(this.f130573e, akVar.f130573e) && C46238a.m51546a(Long.valueOf(this.f130574f), Long.valueOf(akVar.f130574f)) && C46238a.m51546a(this.f130575g, akVar.f130575g) && C46238a.m51546a(Long.valueOf(this.f130576h), Long.valueOf(akVar.f130576h)) && C46238a.m51546a(this.f130577i, akVar.f130577i) && C46238a.m51546a(Integer.valueOf(this.f130578j), Integer.valueOf(akVar.f130578j)) && C46238a.m51546a(Integer.valueOf(this.f130579n), Integer.valueOf(akVar.f130579n)) && C46238a.m51546a(this.f130580o, akVar.f130580o) && C46238a.m51546a(this.f130581p, akVar.f130581p) && C46238a.m51546a(this.f130582q, akVar.f130582q) && C46238a.m51546a(Boolean.valueOf(this.f130583r), Boolean.valueOf(akVar.f130583r));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                aVar.mo74318e(2, this.f130572d);
                String str = this.f130573e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                aVar.mo74321h(4, this.f130574f);
                C77820c cVar = this.f130575g;
                if (cVar != null) {
                    aVar.mo74322i(5, cVar.computeSize());
                    this.f130575g.writeFields(aVar);
                }
                aVar.mo74321h(6, this.f130576h);
                aVar.mo74320g(7, 1, this.f130577i);
                aVar.mo74318e(8, this.f130578j);
                aVar.mo74318e(9, this.f130579n);
                String str2 = this.f130580o;
                if (str2 != null) {
                    aVar.mo74323j(10, str2);
                }
                String str3 = this.f130581p;
                if (str3 != null) {
                    aVar.mo74323j(11, str3);
                }
                String str4 = this.f130582q;
                if (str4 != null) {
                    aVar.mo74323j(12, str4);
                }
                aVar.mo74314a(13, this.f130583r);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i3 = C52418a.m58682i(1, jaVar2.computeSize()) + 0;
            }
            int e = i3 + C52418a.m58678e(2, this.f130572d);
            String str5 = this.f130573e;
            if (str5 != null) {
                e += C52418a.m58683j(3, str5);
            }
            int h = e + C52418a.m58681h(4, this.f130574f);
            C77820c cVar2 = this.f130575g;
            if (cVar2 != null) {
                h += C52418a.m58682i(5, cVar2.computeSize());
            }
            int h2 = h + C52418a.m58681h(6, this.f130576h) + C52418a.m58680g(7, 1, this.f130577i) + C52418a.m58678e(8, this.f130578j) + C52418a.m58678e(9, this.f130579n);
            String str6 = this.f130580o;
            if (str6 != null) {
                h2 += C52418a.m58683j(10, str6);
            }
            String str7 = this.f130581p;
            if (str7 != null) {
                h2 += C52418a.m58683j(11, str7);
            }
            String str8 = this.f130582q;
            if (str8 != null) {
                h2 += C52418a.m58683j(12, str8);
            }
            return h2 + C52418a.m58674a(13, this.f130583r);
        } else if (i2 == 2) {
            this.f130577i.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C48725ak akVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C49966ja jaVar3 = new C49966ja();
                        if (bArr != null && bArr.length > 0) {
                            jaVar3.parseFrom(bArr);
                        }
                        akVar.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    akVar.f130572d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    akVar.f130573e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    akVar.f130574f = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C77820c cVar3 = new C77820c();
                        if (bArr2 != null && bArr2.length > 0) {
                            cVar3.parseFrom(bArr2);
                        }
                        akVar.f130575g = cVar3;
                    }
                    return 0;
                case 6:
                    akVar.f130576h = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    akVar.f130577i.add(aVar3.mo141633k(intValue));
                    return 0;
                case 8:
                    akVar.f130578j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    akVar.f130579n = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    akVar.f130580o = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    akVar.f130581p = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    akVar.f130582q = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    akVar.f130583r = aVar3.mo141625c(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
