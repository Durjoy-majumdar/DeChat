package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.zq */
public class C52293zq extends C101820nt3 {

    /* renamed from: d */
    public LinkedList<Integer> f146175d = new LinkedList<>();

    /* renamed from: e */
    public String f146176e;

    /* renamed from: f */
    public boolean f146177f;

    /* renamed from: g */
    public boolean f146178g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52293zq)) {
            return false;
        }
        C52293zq zqVar = (C52293zq) aVar;
        return C46238a.m51546a(this.BaseRequest, zqVar.BaseRequest) && C46238a.m51546a(this.f146175d, zqVar.f146175d) && C46238a.m51546a(this.f146176e, zqVar.f146176e) && C46238a.m51546a(Boolean.valueOf(this.f146177f), Boolean.valueOf(zqVar.f146177f)) && C46238a.m51546a(Boolean.valueOf(this.f146178g), Boolean.valueOf(zqVar.f146178g));
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
            aVar.mo74320g(2, 2, this.f146175d);
            String str = this.f146176e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74314a(4, this.f146177f);
            aVar.mo74314a(5, this.f146178g);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int g = i2 + C52418a.m58680g(2, 2, this.f146175d);
            String str2 = this.f146176e;
            if (str2 != null) {
                g += C52418a.m58683j(3, str2);
            }
            return g + C52418a.m58674a(4, this.f146177f) + C52418a.m58674a(5, this.f146178g);
        } else if (i == 2) {
            this.f146175d.clear();
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
            C52293zq zqVar = objArr[1];
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
                    zqVar.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                zqVar.f146175d.add(Integer.valueOf(aVar3.mo141629g(intValue)));
                return 0;
            } else if (intValue == 3) {
                zqVar.f146176e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                zqVar.f146177f = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                zqVar.f146178g = aVar3.mo141625c(intValue);
                return 0;
            }
        }
    }
}
