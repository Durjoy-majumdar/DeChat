package te3;

import di3.C86312j;
import ht1.C8802s1;
import if0.C46238a;
import java.util.LinkedList;
import ob0.C47350c;
import ob0.C89132b;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.mi1 */
public class C50406mi1 extends C101820nt3 {

    /* renamed from: d */
    public int f138043d;

    /* renamed from: e */
    public String f138044e;

    /* renamed from: f */
    public String f138045f;

    /* renamed from: b */
    public C89132b<C50548ni1> mo73344b() {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 9950;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderrealnameverify";
        bVar.f127066a = this;
        bVar.f127067b = new C50548ni1();
        C47350c a = bVar.mo72403a();
        C89132b<C50548ni1> ui = ((C8802s1) C86312j.m106911c(C8802s1.class)).mo9632ui();
        ui.mo123453j(a);
        return ui;
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50406mi1)) {
            return false;
        }
        C50406mi1 mi12 = (C50406mi1) aVar;
        return C46238a.m51546a(this.BaseRequest, mi12.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f138043d), Integer.valueOf(mi12.f138043d)) && C46238a.m51546a(this.f138044e, mi12.f138044e) && C46238a.m51546a(this.f138045f, mi12.f138045f);
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
            aVar.mo74318e(2, this.f138043d);
            String str = this.f138044e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f138045f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f138043d);
            String str3 = this.f138044e;
            if (str3 != null) {
                e += C52418a.m58683j(3, str3);
            }
            String str4 = this.f138045f;
            return str4 != null ? e + C52418a.m58683j(4, str4) : e;
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
            C50406mi1 mi12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C90417ia iaVar3 = new C90417ia();
                    if (bArr != null && bArr.length > 0) {
                        iaVar3.parseFrom(bArr);
                    }
                    mi12.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                mi12.f138043d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                mi12.f138044e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                mi12.f138045f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
