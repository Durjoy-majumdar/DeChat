package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.m70 */
public class C50363m70 extends C47465a {

    /* renamed from: d */
    public C101754a80 f137887d;

    /* renamed from: e */
    public int f137888e;

    /* renamed from: f */
    public LinkedList<C101800k70> f137889f = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50363m70)) {
            return false;
        }
        C50363m70 m702 = (C50363m70) aVar;
        return C46238a.m51546a(this.f137887d, m702.f137887d) && C46238a.m51546a(Integer.valueOf(this.f137888e), Integer.valueOf(m702.f137888e)) && C46238a.m51546a(this.f137889f, m702.f137889f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C101754a80 a802 = this.f137887d;
            if (a802 != null) {
                aVar.mo74322i(1, a802.computeSize());
                this.f137887d.writeFields(aVar);
            }
            aVar.mo74318e(2, this.f137888e);
            aVar.mo74320g(3, 8, this.f137889f);
            return 0;
        } else if (i == 1) {
            C101754a80 a803 = this.f137887d;
            if (a803 != null) {
                i2 = 0 + C52418a.m58682i(1, a803.computeSize());
            }
            return i2 + C52418a.m58678e(2, this.f137888e) + C52418a.m58680g(3, 8, this.f137889f);
        } else if (i == 2) {
            this.f137889f.clear();
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
            C50363m70 m702 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C101754a80 a804 = new C101754a80();
                    if (bArr != null && bArr.length > 0) {
                        a804.parseFrom(bArr);
                    }
                    m702.f137887d = a804;
                }
                return 0;
            } else if (intValue == 2) {
                m702.f137888e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C101800k70 k702 = new C101800k70();
                    if (bArr2 != null && bArr2.length > 0) {
                        k702.parseFrom(bArr2);
                    }
                    m702.f137889f.add(k702);
                }
                return 0;
            }
        }
    }
}
