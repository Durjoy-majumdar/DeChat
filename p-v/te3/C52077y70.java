package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.y70 */
public class C52077y70 extends C47465a {

    /* renamed from: d */
    public C101824o80 f145151d;

    /* renamed from: e */
    public C52226z70 f145152e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52077y70)) {
            return false;
        }
        C52077y70 y702 = (C52077y70) aVar;
        return C46238a.m51546a(this.f145151d, y702.f145151d) && C46238a.m51546a(this.f145152e, y702.f145152e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C101824o80 o802 = this.f145151d;
            if (o802 == null) {
                throw new C52419b("Not all required fields were included: BannerSummary");
            } else if (this.f145152e != null) {
                if (o802 != null) {
                    aVar.mo74322i(1, o802.computeSize());
                    this.f145151d.writeFields(aVar);
                }
                C52226z70 z702 = this.f145152e;
                if (z702 != null) {
                    aVar.mo74322i(2, z702.computeSize());
                    this.f145152e.writeFields(aVar);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: BannerImg");
            }
        } else if (i == 1) {
            C101824o80 o803 = this.f145151d;
            if (o803 != null) {
                i2 = 0 + C52418a.m58682i(1, o803.computeSize());
            }
            C52226z70 z703 = this.f145152e;
            return z703 != null ? i2 + C52418a.m58682i(2, z703.computeSize()) : i2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f145151d == null) {
                throw new C52419b("Not all required fields were included: BannerSummary");
            } else if (this.f145152e != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: BannerImg");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C52077y70 y702 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C101824o80 o804 = new C101824o80();
                    if (bArr != null && bArr.length > 0) {
                        o804.parseFrom(bArr);
                    }
                    y702.f145151d = o804;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C52226z70 z704 = new C52226z70();
                    if (bArr2 != null && bArr2.length > 0) {
                        z704.parseFrom(bArr2);
                    }
                    y702.f145152e = z704;
                }
                return 0;
            }
        }
    }
}
