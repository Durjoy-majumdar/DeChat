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

/* renamed from: te3.rj1 */
public class C51116rj1 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f140937d;

    /* renamed from: e */
    public C89349b f140938e;

    /* renamed from: f */
    public String f140939f;

    /* renamed from: g */
    public String f140940g;

    /* renamed from: h */
    public String f140941h;

    /* renamed from: i */
    public String f140942i;

    /* renamed from: b */
    public C89132b<C51253sj1> mo73354b() {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 6241;
        bVar.f127068c = "/cgi-bin/micromsg-bin/findersearchevent";
        bVar.f127066a = this;
        bVar.f127067b = new C51253sj1();
        C47350c a = bVar.mo72403a();
        C89132b<C51253sj1> ui = ((C8802s1) C86312j.m106911c(C8802s1.class)).mo9632ui();
        ui.mo123453j(a);
        return ui;
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51116rj1)) {
            return false;
        }
        C51116rj1 rj12 = (C51116rj1) aVar;
        return C46238a.m51546a(this.BaseRequest, rj12.BaseRequest) && C46238a.m51546a(this.f140937d, rj12.f140937d) && C46238a.m51546a(this.f140938e, rj12.f140938e) && C46238a.m51546a(this.f140939f, rj12.f140939f) && C46238a.m51546a(this.f140940g, rj12.f140940g) && C46238a.m51546a(this.f140941h, rj12.f140941h) && C46238a.m51546a(this.f140942i, rj12.f140942i);
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
            C49842ig0 ig02 = this.f140937d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f140937d.writeFields(aVar);
            }
            C89349b bVar = this.f140938e;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            String str = this.f140939f;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            String str2 = this.f140940g;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            String str3 = this.f140941h;
            if (str3 != null) {
                aVar.mo74323j(6, str3);
            }
            String str4 = this.f140942i;
            if (str4 != null) {
                aVar.mo74323j(7, str4);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f140937d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            C89349b bVar2 = this.f140938e;
            if (bVar2 != null) {
                i2 += C52418a.m58675b(3, bVar2);
            }
            String str5 = this.f140939f;
            if (str5 != null) {
                i2 += C52418a.m58683j(4, str5);
            }
            String str6 = this.f140940g;
            if (str6 != null) {
                i2 += C52418a.m58683j(5, str6);
            }
            String str7 = this.f140941h;
            if (str7 != null) {
                i2 += C52418a.m58683j(6, str7);
            }
            String str8 = this.f140942i;
            return str8 != null ? i2 + C52418a.m58683j(7, str8) : i2;
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
            C51116rj1 rj12 = objArr[1];
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
                        rj12.BaseRequest = iaVar3;
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
                        rj12.f140937d = ig04;
                    }
                    return 0;
                case 3:
                    rj12.f140938e = aVar3.mo141626d(intValue);
                    return 0;
                case 4:
                    rj12.f140939f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    rj12.f140940g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    rj12.f140941h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    rj12.f140942i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
