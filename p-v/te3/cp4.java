package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class cp4 extends C47465a {

    /* renamed from: d */
    public LinkedList<dp4> f131893d = new LinkedList<>();

    /* renamed from: e */
    public dp4 f131894e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof cp4)) {
            return false;
        }
        cp4 cp4 = (cp4) aVar;
        return C46238a.m51546a(this.f131893d, cp4.f131893d) && C46238a.m51546a(this.f131894e, cp4.f131894e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f131893d);
            dp4 dp4 = this.f131894e;
            if (dp4 != null) {
                aVar.mo74322i(2, dp4.computeSize());
                this.f131894e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int g = C52418a.m58680g(1, 8, this.f131893d) + 0;
            dp4 dp42 = this.f131894e;
            return dp42 != null ? g + C52418a.m58682i(2, dp42.computeSize()) : g;
        } else if (i == 2) {
            this.f131893d.clear();
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
            cp4 cp4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    dp4 dp43 = new dp4();
                    if (bArr != null && bArr.length > 0) {
                        dp43.parseFrom(bArr);
                    }
                    cp4.f131893d.add(dp43);
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    byte[] bArr2 = j2.get(i3);
                    dp4 dp44 = new dp4();
                    if (bArr2 != null && bArr2.length > 0) {
                        dp44.parseFrom(bArr2);
                    }
                    cp4.f131894e = dp44;
                }
                return 0;
            }
        }
    }
}
