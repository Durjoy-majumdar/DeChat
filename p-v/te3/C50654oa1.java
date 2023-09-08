package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.oa1 */
public class C50654oa1 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f139056d;

    /* renamed from: e */
    public String f139057e;

    /* renamed from: f */
    public LinkedList<C49922iz3> f139058f = new LinkedList<>();

    /* renamed from: g */
    public LinkedList<C50332lz3> f139059g = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50654oa1)) {
            return false;
        }
        C50654oa1 oa12 = (C50654oa1) aVar;
        return C46238a.m51546a(this.BaseRequest, oa12.BaseRequest) && C46238a.m51546a(this.f139056d, oa12.f139056d) && C46238a.m51546a(this.f139057e, oa12.f139057e) && C46238a.m51546a(this.f139058f, oa12.f139058f) && C46238a.m51546a(this.f139059g, oa12.f139059g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C90417ia iaVar = this.BaseRequest;
            if (iaVar != null) {
                aVar.mo74322i(1, iaVar.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            C49842ig0 ig02 = this.f139056d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f139056d.writeFields(aVar);
            }
            String str = this.f139057e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74320g(4, 8, this.f139058f);
            aVar.mo74320g(5, 8, this.f139059g);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f139056d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            String str2 = this.f139057e;
            if (str2 != null) {
                i2 += C52418a.m58683j(3, str2);
            }
            return i2 + C52418a.m58680g(4, 8, this.f139058f) + C52418a.m58680g(5, 8, this.f139059g);
        } else if (i == 2) {
            this.f139058f.clear();
            this.f139059g.clear();
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
            C50654oa1 oa12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C90417ia iaVar3 = new C90417ia();
                    if (bArr != null && bArr.length > 0) {
                        iaVar3.parseFrom(bArr);
                    }
                    oa12.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C49842ig0 ig04 = new C49842ig0();
                    if (bArr2 != null && bArr2.length > 0) {
                        ig04.parseFrom(bArr2);
                    }
                    oa12.f139056d = ig04;
                }
                return 0;
            } else if (intValue == 3) {
                oa12.f139057e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C49922iz3 iz32 = new C49922iz3();
                    if (bArr3 != null && bArr3.length > 0) {
                        iz32.parseFrom(bArr3);
                    }
                    oa12.f139058f.add(iz32);
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                int size4 = j4.size();
                for (int i6 = 0; i6 < size4; i6++) {
                    byte[] bArr4 = j4.get(i6);
                    C50332lz3 lz32 = new C50332lz3();
                    if (bArr4 != null && bArr4.length > 0) {
                        lz32.parseFrom(bArr4);
                    }
                    oa12.f139059g.add(lz32);
                }
                return 0;
            }
        }
    }
}
