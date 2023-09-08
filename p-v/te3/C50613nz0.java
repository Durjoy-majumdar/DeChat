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

/* renamed from: te3.nz0 */
public class C50613nz0 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f138847d;

    /* renamed from: e */
    public String f138848e;

    /* renamed from: f */
    public long f138849f;

    /* renamed from: g */
    public long f138850g;

    /* renamed from: h */
    public C89349b f138851h;

    /* renamed from: i */
    public String f138852i;

    /* renamed from: j */
    public int f138853j;

    /* renamed from: n */
    public String f138854n;

    /* renamed from: o */
    public boolean f138855o;

    /* renamed from: b */
    public C89132b<C50756oz0> mo73345b() {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 10635;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderlivegetconcertticket";
        bVar.f127066a = this;
        bVar.f127067b = new C50756oz0();
        C47350c a = bVar.mo72403a();
        C89132b<C50756oz0> ui = ((C8802s1) C86312j.m106911c(C8802s1.class)).mo9632ui();
        ui.mo123453j(a);
        return ui;
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50613nz0)) {
            return false;
        }
        C50613nz0 nz02 = (C50613nz0) aVar;
        return C46238a.m51546a(this.BaseRequest, nz02.BaseRequest) && C46238a.m51546a(this.f138847d, nz02.f138847d) && C46238a.m51546a(this.f138848e, nz02.f138848e) && C46238a.m51546a(Long.valueOf(this.f138849f), Long.valueOf(nz02.f138849f)) && C46238a.m51546a(Long.valueOf(this.f138850g), Long.valueOf(nz02.f138850g)) && C46238a.m51546a(this.f138851h, nz02.f138851h) && C46238a.m51546a(this.f138852i, nz02.f138852i) && C46238a.m51546a(Integer.valueOf(this.f138853j), Integer.valueOf(nz02.f138853j)) && C46238a.m51546a(this.f138854n, nz02.f138854n) && C46238a.m51546a(Boolean.valueOf(this.f138855o), Boolean.valueOf(nz02.f138855o));
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
            C49842ig0 ig02 = this.f138847d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f138847d.writeFields(aVar);
            }
            String str = this.f138848e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74321h(4, this.f138849f);
            aVar.mo74321h(5, this.f138850g);
            C89349b bVar = this.f138851h;
            if (bVar != null) {
                aVar.mo74315b(6, bVar);
            }
            String str2 = this.f138852i;
            if (str2 != null) {
                aVar.mo74323j(7, str2);
            }
            aVar.mo74318e(8, this.f138853j);
            String str3 = this.f138854n;
            if (str3 != null) {
                aVar.mo74323j(9, str3);
            }
            aVar.mo74314a(10, this.f138855o);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f138847d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            String str4 = this.f138848e;
            if (str4 != null) {
                i2 += C52418a.m58683j(3, str4);
            }
            int h = i2 + C52418a.m58681h(4, this.f138849f) + C52418a.m58681h(5, this.f138850g);
            C89349b bVar2 = this.f138851h;
            if (bVar2 != null) {
                h += C52418a.m58675b(6, bVar2);
            }
            String str5 = this.f138852i;
            if (str5 != null) {
                h += C52418a.m58683j(7, str5);
            }
            int e = h + C52418a.m58678e(8, this.f138853j);
            String str6 = this.f138854n;
            if (str6 != null) {
                e += C52418a.m58683j(9, str6);
            }
            return e + C52418a.m58674a(10, this.f138855o);
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
            C50613nz0 nz02 = objArr[1];
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
                        nz02.BaseRequest = iaVar3;
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
                        nz02.f138847d = ig04;
                    }
                    return 0;
                case 3:
                    nz02.f138848e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    nz02.f138849f = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    nz02.f138850g = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    nz02.f138851h = aVar3.mo141626d(intValue);
                    return 0;
                case 7:
                    nz02.f138852i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    nz02.f138853j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    nz02.f138854n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    nz02.f138855o = aVar3.mo141625c(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
