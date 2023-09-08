package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class vk4 extends C47465a {

    /* renamed from: d */
    public String f185913d;

    /* renamed from: e */
    public String f185914e;

    /* renamed from: f */
    public C64861yn2 f185915f;

    /* renamed from: g */
    public C64861yn2 f185916g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof vk4)) {
            return false;
        }
        vk4 vk4 = (vk4) aVar;
        return C46238a.m51546a(this.f185913d, vk4.f185913d) && C46238a.m51546a(this.f185914e, vk4.f185914e) && C46238a.m51546a(this.f185915f, vk4.f185915f) && C46238a.m51546a(this.f185916g, vk4.f185916g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f185913d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f185914e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            C64861yn2 yn22 = this.f185915f;
            if (yn22 != null) {
                aVar.mo74322i(3, yn22.computeSize());
                this.f185915f.writeFields(aVar);
            }
            C64861yn2 yn23 = this.f185916g;
            if (yn23 != null) {
                aVar.mo74322i(4, yn23.computeSize());
                this.f185916g.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            String str3 = this.f185913d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f185914e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            C64861yn2 yn24 = this.f185915f;
            if (yn24 != null) {
                i2 += C52418a.m58682i(3, yn24.computeSize());
            }
            C64861yn2 yn25 = this.f185916g;
            return yn25 != null ? i2 + C52418a.m58682i(4, yn25.computeSize()) : i2;
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
            vk4 vk4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                vk4.f185913d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                vk4.f185914e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C64861yn2 yn26 = new C64861yn2();
                    if (bArr != null && bArr.length > 0) {
                        yn26.parseFrom(bArr);
                    }
                    vk4.f185915f = yn26;
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C64861yn2 yn27 = new C64861yn2();
                    if (bArr2 != null && bArr2.length > 0) {
                        yn27.parseFrom(bArr2);
                    }
                    vk4.f185916g = yn27;
                }
                return 0;
            }
        }
    }
}
