package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import x14.C102536a;
import z14.C53733a;

/* renamed from: te3.x20 */
public class C51912x20 extends C47465a {

    /* renamed from: d */
    public C51163rv3 f144409d;

    /* renamed from: e */
    public int f144410e;

    /* renamed from: f */
    public LinkedList<Integer> f144411f = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51912x20)) {
            return false;
        }
        C51912x20 x202 = (C51912x20) aVar;
        return C46238a.m51546a(this.f144409d, x202.f144409d) && C46238a.m51546a(Integer.valueOf(this.f144410e), Integer.valueOf(x202.f144410e)) && C46238a.m51546a(this.f144411f, x202.f144411f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C51163rv3 rv32 = this.f144409d;
            if (rv32 != null) {
                if (rv32 != null) {
                    aVar.mo74322i(1, rv32.computeSize());
                    this.f144409d.writeFields(aVar);
                }
                aVar.mo74318e(2, this.f144410e);
                aVar.mo74324k(3, 2, this.f144411f);
                return 0;
            }
            throw new C52419b("Not all required fields were included: UserName");
        } else if (i == 1) {
            C51163rv3 rv33 = this.f144409d;
            if (rv33 != null) {
                i2 = 0 + C52418a.m58682i(1, rv33.computeSize());
            }
            return i2 + C52418a.m58678e(2, this.f144410e) + C52418a.m58684k(3, 2, this.f144411f);
        } else if (i == 2) {
            this.f144411f.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f144409d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: UserName");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C51912x20 x202 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C51163rv3 rv34 = new C51163rv3();
                    if (bArr != null && bArr.length > 0) {
                        rv34.mo73356d(bArr);
                    }
                    x202.f144409d = rv34;
                }
                return 0;
            } else if (intValue == 2) {
                x202.f144410e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                byte[] bArr2 = aVar3.mo141626d(intValue).f257327a;
                C102536a aVar4 = new C102536a(bArr2, 0, bArr2.length);
                LinkedList<Integer> linkedList = new LinkedList<>();
                while (aVar4.f301908c < aVar4.f301907b) {
                    linkedList.add(Integer.valueOf(aVar4.mo142153f()));
                }
                x202.f144411f = linkedList;
                return 0;
            }
        }
    }
}
