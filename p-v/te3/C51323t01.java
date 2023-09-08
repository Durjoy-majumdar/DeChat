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

/* renamed from: te3.t01 */
public class C51323t01 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f141871d;

    /* renamed from: e */
    public C89349b f141872e;

    /* renamed from: f */
    public long f141873f;

    /* renamed from: g */
    public long f141874g;

    /* renamed from: h */
    public int f141875h;

    /* renamed from: i */
    public String f141876i;

    /* renamed from: j */
    public String f141877j;

    /* renamed from: n */
    public String f141878n;

    /* renamed from: b */
    public C89132b<C51474u01> mo73359b() {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 10017;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderlivegetposterinfo";
        bVar.f127066a = this;
        bVar.f127067b = new C51474u01();
        C47350c a = bVar.mo72403a();
        C89132b<C51474u01> ui = ((C8802s1) C86312j.m106911c(C8802s1.class)).mo9632ui();
        ui.mo123453j(a);
        return ui;
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51323t01)) {
            return false;
        }
        C51323t01 t012 = (C51323t01) aVar;
        return C46238a.m51546a(this.BaseRequest, t012.BaseRequest) && C46238a.m51546a(this.f141871d, t012.f141871d) && C46238a.m51546a(this.f141872e, t012.f141872e) && C46238a.m51546a(Long.valueOf(this.f141873f), Long.valueOf(t012.f141873f)) && C46238a.m51546a(Long.valueOf(this.f141874g), Long.valueOf(t012.f141874g)) && C46238a.m51546a(Integer.valueOf(this.f141875h), Integer.valueOf(t012.f141875h)) && C46238a.m51546a(this.f141876i, t012.f141876i) && C46238a.m51546a(this.f141877j, t012.f141877j) && C46238a.m51546a(this.f141878n, t012.f141878n);
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
            C49842ig0 ig02 = this.f141871d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f141871d.writeFields(aVar);
            }
            C89349b bVar = this.f141872e;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            aVar.mo74321h(4, this.f141873f);
            aVar.mo74321h(5, this.f141874g);
            aVar.mo74318e(6, this.f141875h);
            String str = this.f141876i;
            if (str != null) {
                aVar.mo74323j(7, str);
            }
            String str2 = this.f141877j;
            if (str2 != null) {
                aVar.mo74323j(8, str2);
            }
            String str3 = this.f141878n;
            if (str3 != null) {
                aVar.mo74323j(9, str3);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f141871d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            C89349b bVar2 = this.f141872e;
            if (bVar2 != null) {
                i2 += C52418a.m58675b(3, bVar2);
            }
            int h = i2 + C52418a.m58681h(4, this.f141873f) + C52418a.m58681h(5, this.f141874g) + C52418a.m58678e(6, this.f141875h);
            String str4 = this.f141876i;
            if (str4 != null) {
                h += C52418a.m58683j(7, str4);
            }
            String str5 = this.f141877j;
            if (str5 != null) {
                h += C52418a.m58683j(8, str5);
            }
            String str6 = this.f141878n;
            return str6 != null ? h + C52418a.m58683j(9, str6) : h;
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
            C51323t01 t012 = objArr[1];
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
                        t012.BaseRequest = iaVar3;
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
                        t012.f141871d = ig04;
                    }
                    return 0;
                case 3:
                    t012.f141872e = aVar3.mo141626d(intValue);
                    return 0;
                case 4:
                    t012.f141873f = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    t012.f141874g = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    t012.f141875h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    t012.f141876i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    t012.f141877j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    t012.f141878n = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
