package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.zr3 */
public class C64893zr3 extends C101820nt3 {

    /* renamed from: d */
    public long f186843d;

    /* renamed from: e */
    public long f186844e;

    /* renamed from: f */
    public LinkedList<C64389ga0> f186845f = new LinkedList<>();

    /* renamed from: g */
    public C64673r40 f186846g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64893zr3)) {
            return false;
        }
        C64893zr3 zr32 = (C64893zr3) aVar;
        return C46238a.m51546a(this.BaseRequest, zr32.BaseRequest) && C46238a.m51546a(Long.valueOf(this.f186843d), Long.valueOf(zr32.f186843d)) && C46238a.m51546a(Long.valueOf(this.f186844e), Long.valueOf(zr32.f186844e)) && C46238a.m51546a(this.f186845f, zr32.f186845f) && C46238a.m51546a(this.f186846g, zr32.f186846g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f186846g != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                aVar.mo74321h(2, this.f186843d);
                aVar.mo74321h(3, this.f186844e);
                aVar.mo74320g(4, 8, this.f186845f);
                C64673r40 r402 = this.f186846g;
                if (r402 != null) {
                    aVar.mo74322i(5, r402.computeSize());
                    this.f186846g.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: DeviceType");
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int h = i2 + C52418a.m58681h(2, this.f186843d) + C52418a.m58681h(3, this.f186844e) + C52418a.m58680g(4, 8, this.f186845f);
            C64673r40 r403 = this.f186846g;
            return r403 != null ? h + C52418a.m58682i(5, r403.computeSize()) : h;
        } else if (i == 2) {
            this.f186845f.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f186846g != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: DeviceType");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C64893zr3 zr32 = objArr[1];
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
                    zr32.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                zr32.f186843d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 3) {
                zr32.f186844e = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C64389ga0 ga02 = new C64389ga0();
                    if (bArr2 != null && bArr2.length > 0) {
                        ga02.parseFrom(bArr2);
                    }
                    zr32.f186845f.add(ga02);
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C64673r40 r404 = new C64673r40();
                    if (bArr3 != null && bArr3.length > 0) {
                        r404.parseFrom(bArr3);
                    }
                    zr32.f186846g = r404;
                }
                return 0;
            }
        }
    }
}
