package te3;

import di3.C86312j;
import ht1.C8802s1;
import if0.C46238a;
import java.util.LinkedList;
import ob0.C47350c;
import ob0.C89132b;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.f11 */
public class C49361f11 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f133229d;

    /* renamed from: e */
    public long f133230e;

    /* renamed from: f */
    public long f133231f;

    /* renamed from: g */
    public String f133232g;

    /* renamed from: h */
    public long f133233h;

    /* renamed from: i */
    public String f133234i;

    /* renamed from: j */
    public C89349b f133235j;

    /* renamed from: n */
    public String f133236n;

    /* renamed from: o */
    public C89349b f133237o;

    /* renamed from: p */
    public int f133238p;

    /* renamed from: q */
    public int f133239q;

    /* renamed from: b */
    public C89132b<C49498g11> mo73339b() {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 6211;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderlivegetshopproductdetail";
        bVar.f127066a = this;
        bVar.f127067b = new C49498g11();
        C47350c a = bVar.mo72403a();
        C89132b<C49498g11> ui = ((C8802s1) C86312j.m106911c(C8802s1.class)).mo9632ui();
        ui.mo123453j(a);
        return ui;
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49361f11)) {
            return false;
        }
        C49361f11 f112 = (C49361f11) aVar;
        return C46238a.m51546a(this.BaseRequest, f112.BaseRequest) && C46238a.m51546a(this.f133229d, f112.f133229d) && C46238a.m51546a(Long.valueOf(this.f133230e), Long.valueOf(f112.f133230e)) && C46238a.m51546a(Long.valueOf(this.f133231f), Long.valueOf(f112.f133231f)) && C46238a.m51546a(this.f133232g, f112.f133232g) && C46238a.m51546a(Long.valueOf(this.f133233h), Long.valueOf(f112.f133233h)) && C46238a.m51546a(this.f133234i, f112.f133234i) && C46238a.m51546a(this.f133235j, f112.f133235j) && C46238a.m51546a(this.f133236n, f112.f133236n) && C46238a.m51546a(this.f133237o, f112.f133237o) && C46238a.m51546a(Integer.valueOf(this.f133238p), Integer.valueOf(f112.f133238p)) && C46238a.m51546a(Integer.valueOf(this.f133239q), Integer.valueOf(f112.f133239q));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C90417ia iaVar = this.BaseRequest;
            if (iaVar != null) {
                aVar.mo74322i(1, iaVar.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            C49842ig0 ig02 = this.f133229d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f133229d.writeFields(aVar);
            }
            aVar.mo74321h(3, this.f133230e);
            aVar.mo74321h(4, this.f133231f);
            String str = this.f133232g;
            if (str != null) {
                aVar.mo74323j(5, str);
            }
            aVar.mo74321h(6, this.f133233h);
            String str2 = this.f133234i;
            if (str2 != null) {
                aVar.mo74323j(7, str2);
            }
            C89349b bVar = this.f133235j;
            if (bVar != null) {
                aVar.mo74315b(8, bVar);
            }
            String str3 = this.f133236n;
            if (str3 != null) {
                aVar.mo74323j(9, str3);
            }
            C89349b bVar2 = this.f133237o;
            if (bVar2 != null) {
                aVar.mo74315b(10, bVar2);
            }
            aVar.mo74318e(11, this.f133238p);
            aVar.mo74318e(12, this.f133239q);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f133229d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            int h = i2 + C52418a.m58681h(3, this.f133230e) + C52418a.m58681h(4, this.f133231f);
            String str4 = this.f133232g;
            if (str4 != null) {
                h += C52418a.m58683j(5, str4);
            }
            int h2 = h + C52418a.m58681h(6, this.f133233h);
            String str5 = this.f133234i;
            if (str5 != null) {
                h2 += C52418a.m58683j(7, str5);
            }
            C89349b bVar3 = this.f133235j;
            if (bVar3 != null) {
                h2 += C52418a.m58675b(8, bVar3);
            }
            String str6 = this.f133236n;
            if (str6 != null) {
                h2 += C52418a.m58683j(9, str6);
            }
            C89349b bVar4 = this.f133237o;
            if (bVar4 != null) {
                h2 += C52418a.m58675b(10, bVar4);
            }
            return h2 + C52418a.m58678e(11, this.f133238p) + C52418a.m58678e(12, this.f133239q);
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
            C49361f11 f112 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C90417ia iaVar3 = new C90417ia();
                        if (bArr != null && bArr.length > 0) {
                            iaVar3.parseFrom(bArr);
                        }
                        f112.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C49842ig0 ig04 = new C49842ig0();
                        if (bArr2 != null && bArr2.length > 0) {
                            ig04.parseFrom(bArr2);
                        }
                        f112.f133229d = ig04;
                    }
                    return 0;
                case 3:
                    f112.f133230e = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    f112.f133231f = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    f112.f133232g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    f112.f133233h = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    f112.f133234i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    f112.f133235j = aVar3.mo141626d(intValue);
                    return 0;
                case 9:
                    f112.f133236n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    f112.f133237o = aVar3.mo141626d(intValue);
                    return 0;
                case 11:
                    f112.f133238p = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    f112.f133239q = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
