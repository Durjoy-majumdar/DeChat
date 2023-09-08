package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.td0 */
public class C51379td0 extends C47465a implements r54 {

    /* renamed from: d */
    public int f142128d;

    /* renamed from: e */
    public C51024qx f142129e;

    /* renamed from: f */
    public C51018qv3 f142130f;

    /* renamed from: g */
    public int f142131g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51379td0)) {
            return false;
        }
        C51379td0 td02 = (C51379td0) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f142128d), Integer.valueOf(td02.f142128d)) && C46238a.m51546a(this.f142129e, td02.f142129e) && C46238a.m51546a(this.f142130f, td02.f142130f) && C46238a.m51546a(Integer.valueOf(this.f142131g), Integer.valueOf(td02.f142131g));
    }

    public final int getRet() {
        return this.f142128d;
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f142129e == null) {
                throw new C52419b("Not all required fields were included: CmdList");
            } else if (this.f142130f != null) {
                aVar.mo74318e(1, this.f142128d);
                C51024qx qxVar = this.f142129e;
                if (qxVar != null) {
                    aVar.mo74322i(2, qxVar.computeSize());
                    this.f142129e.writeFields(aVar);
                }
                C51018qv3 qv32 = this.f142130f;
                if (qv32 != null) {
                    aVar.mo74322i(3, qv32.computeSize());
                    this.f142130f.writeFields(aVar);
                }
                aVar.mo74318e(4, this.f142131g);
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: KeyBuf");
            }
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f142128d) + 0;
            C51024qx qxVar2 = this.f142129e;
            if (qxVar2 != null) {
                e += C52418a.m58682i(2, qxVar2.computeSize());
            }
            C51018qv3 qv33 = this.f142130f;
            if (qv33 != null) {
                e += C52418a.m58682i(3, qv33.computeSize());
            }
            return e + C52418a.m58678e(4, this.f142131g);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f142129e == null) {
                throw new C52419b("Not all required fields were included: CmdList");
            } else if (this.f142130f != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: KeyBuf");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C51379td0 td02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                td02.f142128d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C51024qx qxVar3 = new C51024qx();
                    if (bArr != null && bArr.length > 0) {
                        qxVar3.parseFrom(bArr);
                    }
                    td02.f142129e = qxVar3;
                }
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    byte[] bArr2 = j2.get(i3);
                    C51018qv3 qv34 = new C51018qv3();
                    if (bArr2 != null && bArr2.length > 0) {
                        qv34.mo73348f(bArr2);
                    }
                    td02.f142130f = qv34;
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                td02.f142131g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
