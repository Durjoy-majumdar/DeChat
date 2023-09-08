package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ts1 */
public class C51439ts1 extends C47465a {

    /* renamed from: d */
    public int f142382d;

    /* renamed from: e */
    public C51870ws1 f142383e;

    /* renamed from: f */
    public C50390me2 f142384f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51439ts1)) {
            return false;
        }
        C51439ts1 ts12 = (C51439ts1) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f142382d), Integer.valueOf(ts12.f142382d)) && C46238a.m51546a(this.f142383e, ts12.f142383e) && C46238a.m51546a(this.f142384f, ts12.f142384f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f142382d);
            C51870ws1 ws12 = this.f142383e;
            if (ws12 != null) {
                aVar.mo74322i(2, ws12.computeSize());
                this.f142383e.writeFields(aVar);
            }
            C50390me2 me22 = this.f142384f;
            if (me22 != null) {
                aVar.mo74322i(3, me22.computeSize());
                this.f142384f.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f142382d) + 0;
            C51870ws1 ws13 = this.f142383e;
            if (ws13 != null) {
                e += C52418a.m58682i(2, ws13.computeSize());
            }
            C50390me2 me23 = this.f142384f;
            return me23 != null ? e + C52418a.m58682i(3, me23.computeSize()) : e;
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
            C51439ts1 ts12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                ts12.f142382d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C51870ws1 ws14 = new C51870ws1();
                    if (bArr != null && bArr.length > 0) {
                        ws14.parseFrom(bArr);
                    }
                    ts12.f142383e = ws14;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    byte[] bArr2 = j2.get(i3);
                    C50390me2 me24 = new C50390me2();
                    if (bArr2 != null && bArr2.length > 0) {
                        me24.parseFrom(bArr2);
                    }
                    ts12.f142384f = me24;
                }
                return 0;
            }
        }
    }
}
