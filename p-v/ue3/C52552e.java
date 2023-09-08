package ue3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import te3.C101820nt3;
import te3.C90417ia;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: ue3.e */
public class C52552e extends C101820nt3 {

    /* renamed from: d */
    public LinkedList<String> f146772d = new LinkedList<>();

    /* renamed from: e */
    public int f146773e;

    /* renamed from: f */
    public C65338g f146774f;

    /* renamed from: g */
    public int f146775g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52552e)) {
            return false;
        }
        C52552e eVar = (C52552e) aVar;
        return C46238a.m51546a(this.BaseRequest, eVar.BaseRequest) && C46238a.m51546a(this.f146772d, eVar.f146772d) && C46238a.m51546a(Integer.valueOf(this.f146773e), Integer.valueOf(eVar.f146773e)) && C46238a.m51546a(this.f146774f, eVar.f146774f) && C46238a.m51546a(Integer.valueOf(this.f146775g), Integer.valueOf(eVar.f146775g));
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
            aVar.mo74320g(2, 1, this.f146772d);
            aVar.mo74318e(3, this.f146773e);
            C65338g gVar = this.f146774f;
            if (gVar != null) {
                aVar.mo74322i(4, gVar.computeSize());
                this.f146774f.writeFields(aVar);
            }
            aVar.mo74318e(5, this.f146775g);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int g = i2 + C52418a.m58680g(2, 1, this.f146772d) + C52418a.m58678e(3, this.f146773e);
            C65338g gVar2 = this.f146774f;
            if (gVar2 != null) {
                g += C52418a.m58682i(4, gVar2.computeSize());
            }
            return g + C52418a.m58678e(5, this.f146775g);
        } else if (i == 2) {
            this.f146772d.clear();
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
            C52552e eVar = objArr[1];
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
                    eVar.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                eVar.f146772d.add(aVar3.mo141633k(intValue));
                return 0;
            } else if (intValue == 3) {
                eVar.f146773e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C65338g gVar3 = new C65338g();
                    if (bArr2 != null && bArr2.length > 0) {
                        gVar3.parseFrom(bArr2);
                    }
                    eVar.f146774f = gVar3;
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                eVar.f146775g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
