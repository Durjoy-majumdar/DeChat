package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.tp2 */
public class C51428tp2 extends C47465a {

    /* renamed from: d */
    public C50767p11 f142318d;

    /* renamed from: e */
    public long f142319e;

    /* renamed from: f */
    public long f142320f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51428tp2)) {
            return false;
        }
        C51428tp2 tp22 = (C51428tp2) aVar;
        return C46238a.m51546a(this.f142318d, tp22.f142318d) && C46238a.m51546a(Long.valueOf(this.f142319e), Long.valueOf(tp22.f142319e)) && C46238a.m51546a(Long.valueOf(this.f142320f), Long.valueOf(tp22.f142320f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C50767p11 p112 = this.f142318d;
            if (p112 != null) {
                aVar.mo74322i(1, p112.computeSize());
                this.f142318d.writeFields(aVar);
            }
            aVar.mo74321h(2, this.f142319e);
            aVar.mo74321h(3, this.f142320f);
            return 0;
        } else if (i == 1) {
            C50767p11 p113 = this.f142318d;
            if (p113 != null) {
                i2 = 0 + C52418a.m58682i(1, p113.computeSize());
            }
            return i2 + C52418a.m58681h(2, this.f142319e) + C52418a.m58681h(3, this.f142320f);
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
            C51428tp2 tp22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C50767p11 p114 = new C50767p11();
                    if (bArr != null && bArr.length > 0) {
                        p114.parseFrom(bArr);
                    }
                    tp22.f142318d = p114;
                }
                return 0;
            } else if (intValue == 2) {
                tp22.f142319e = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                tp22.f142320f = aVar3.mo141631i(intValue);
                return 0;
            }
        }
    }
}
