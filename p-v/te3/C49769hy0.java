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

/* renamed from: te3.hy0 */
public class C49769hy0 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f134954d;

    /* renamed from: e */
    public String f134955e;

    /* renamed from: b */
    public C89132b<C49914iy0> mo73340b() {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 11250;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderlivefanclubgetcustomgiftlist";
        bVar.f127066a = this;
        bVar.f127067b = new C49914iy0();
        C47350c a = bVar.mo72403a();
        C89132b<C49914iy0> ui = ((C8802s1) C86312j.m106911c(C8802s1.class)).mo9632ui();
        ui.mo123453j(a);
        return ui;
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49769hy0)) {
            return false;
        }
        C49769hy0 hy02 = (C49769hy0) aVar;
        return C46238a.m51546a(this.BaseRequest, hy02.BaseRequest) && C46238a.m51546a(this.f134954d, hy02.f134954d) && C46238a.m51546a(this.f134955e, hy02.f134955e);
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
            C49842ig0 ig02 = this.f134954d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f134954d.writeFields(aVar);
            }
            String str = this.f134955e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f134954d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            String str2 = this.f134955e;
            return str2 != null ? i2 + C52418a.m58683j(3, str2) : i2;
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
            C49769hy0 hy02 = objArr[1];
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
                    hy02.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C49842ig0 ig04 = new C49842ig0();
                    if (bArr2 != null && bArr2.length > 0) {
                        ig04.parseFrom(bArr2);
                    }
                    hy02.f134954d = ig04;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                hy02.f134955e = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
