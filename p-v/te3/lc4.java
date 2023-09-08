package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class lc4 extends C47465a {

    /* renamed from: d */
    public long f184072d;

    /* renamed from: e */
    public int f184073e;

    /* renamed from: f */
    public mc4 f184074f;

    /* renamed from: g */
    public mc4 f184075g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof lc4)) {
            return false;
        }
        lc4 lc4 = (lc4) aVar;
        return C46238a.m51546a(Long.valueOf(this.f184072d), Long.valueOf(lc4.f184072d)) && C46238a.m51546a(Integer.valueOf(this.f184073e), Integer.valueOf(lc4.f184073e)) && C46238a.m51546a(this.f184074f, lc4.f184074f) && C46238a.m51546a(this.f184075g, lc4.f184075g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f184074f != null) {
                aVar.mo74321h(1, this.f184072d);
                aVar.mo74318e(2, this.f184073e);
                mc4 mc4 = this.f184074f;
                if (mc4 != null) {
                    aVar.mo74322i(3, mc4.computeSize());
                    this.f184074f.writeFields(aVar);
                }
                mc4 mc42 = this.f184075g;
                if (mc42 != null) {
                    aVar.mo74322i(4, mc42.computeSize());
                    this.f184075g.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: SyncMsgDetail");
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f184072d) + 0 + C52418a.m58678e(2, this.f184073e);
            mc4 mc43 = this.f184074f;
            if (mc43 != null) {
                h += C52418a.m58682i(3, mc43.computeSize());
            }
            mc4 mc44 = this.f184075g;
            return mc44 != null ? h + C52418a.m58682i(4, mc44.computeSize()) : h;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f184074f != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: SyncMsgDetail");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            lc4 lc4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                lc4.f184072d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 2) {
                lc4.f184073e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    mc4 mc45 = new mc4();
                    if (bArr != null && bArr.length > 0) {
                        mc45.parseFrom(bArr);
                    }
                    lc4.f184074f = mc45;
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    byte[] bArr2 = j2.get(i3);
                    mc4 mc46 = new mc4();
                    if (bArr2 != null && bArr2.length > 0) {
                        mc46.parseFrom(bArr2);
                    }
                    lc4.f184075g = mc46;
                }
                return 0;
            }
        }
    }
}
