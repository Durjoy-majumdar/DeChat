package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class mp4 extends C47465a {

    /* renamed from: d */
    public cs4 f138147d;

    /* renamed from: e */
    public int f138148e;

    /* renamed from: f */
    public int f138149f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof mp4)) {
            return false;
        }
        mp4 mp4 = (mp4) aVar;
        return C46238a.m51546a(this.f138147d, mp4.f138147d) && C46238a.m51546a(Integer.valueOf(this.f138148e), Integer.valueOf(mp4.f138148e)) && C46238a.m51546a(Integer.valueOf(this.f138149f), Integer.valueOf(mp4.f138149f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            cs4 cs4 = this.f138147d;
            if (cs4 != null) {
                if (cs4 != null) {
                    aVar.mo74322i(1, cs4.computeSize());
                    this.f138147d.writeFields(aVar);
                }
                aVar.mo74318e(2, this.f138148e);
                aVar.mo74318e(3, this.f138149f);
                return 0;
            }
            throw new C52419b("Not all required fields were included: materialResp");
        } else if (i == 1) {
            cs4 cs42 = this.f138147d;
            if (cs42 != null) {
                i2 = 0 + C52418a.m58682i(1, cs42.computeSize());
            }
            return i2 + C52418a.m58678e(2, this.f138148e) + C52418a.m58678e(3, this.f138149f);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f138147d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: materialResp");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            mp4 mp4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    cs4 cs43 = new cs4();
                    if (bArr != null && bArr.length > 0) {
                        cs43.parseFrom(bArr);
                    }
                    mp4.f138147d = cs43;
                }
                return 0;
            } else if (intValue == 2) {
                mp4.f138148e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                mp4.f138149f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
