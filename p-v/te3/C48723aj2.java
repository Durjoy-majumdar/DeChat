package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.aj2 */
public class C48723aj2 extends C47465a {

    /* renamed from: d */
    public zf4 f130564d;

    /* renamed from: e */
    public LinkedList<zf4> f130565e = new LinkedList<>();

    /* renamed from: f */
    public String f130566f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48723aj2)) {
            return false;
        }
        C48723aj2 aj22 = (C48723aj2) aVar;
        return C46238a.m51546a(this.f130564d, aj22.f130564d) && C46238a.m51546a(this.f130565e, aj22.f130565e) && C46238a.m51546a(this.f130566f, aj22.f130566f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            zf4 zf4 = this.f130564d;
            if (zf4 != null) {
                aVar.mo74322i(1, zf4.computeSize());
                this.f130564d.writeFields(aVar);
            }
            aVar.mo74320g(2, 8, this.f130565e);
            String str = this.f130566f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            return 0;
        } else if (i == 1) {
            zf4 zf42 = this.f130564d;
            if (zf42 != null) {
                i2 = 0 + C52418a.m58682i(1, zf42.computeSize());
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f130565e);
            String str2 = this.f130566f;
            return str2 != null ? g + C52418a.m58683j(3, str2) : g;
        } else if (i == 2) {
            this.f130565e.clear();
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
            C48723aj2 aj22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    zf4 zf43 = new zf4();
                    if (bArr != null && bArr.length > 0) {
                        zf43.parseFrom(bArr);
                    }
                    aj22.f130564d = zf43;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    zf4 zf44 = new zf4();
                    if (bArr2 != null && bArr2.length > 0) {
                        zf44.parseFrom(bArr2);
                    }
                    aj22.f130565e.add(zf44);
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                aj22.f130566f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
