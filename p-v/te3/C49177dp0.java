package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.dp0 */
public class C49177dp0 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f132464d;

    /* renamed from: e */
    public long f132465e;

    /* renamed from: f */
    public long f132466f;

    /* renamed from: g */
    public C50353m43 f132467g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49177dp0)) {
            return false;
        }
        C49177dp0 dp02 = (C49177dp0) aVar;
        return C46238a.m51546a(this.BaseRequest, dp02.BaseRequest) && C46238a.m51546a(this.f132464d, dp02.f132464d) && C46238a.m51546a(Long.valueOf(this.f132465e), Long.valueOf(dp02.f132465e)) && C46238a.m51546a(Long.valueOf(this.f132466f), Long.valueOf(dp02.f132466f)) && C46238a.m51546a(this.f132467g, dp02.f132467g);
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
            C49842ig0 ig02 = this.f132464d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f132464d.writeFields(aVar);
            }
            aVar.mo74321h(3, this.f132465e);
            aVar.mo74321h(4, this.f132466f);
            C50353m43 m432 = this.f132467g;
            if (m432 != null) {
                aVar.mo74322i(5, m432.computeSize());
                this.f132467g.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f132464d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            int h = i2 + C52418a.m58681h(3, this.f132465e) + C52418a.m58681h(4, this.f132466f);
            C50353m43 m433 = this.f132467g;
            return m433 != null ? h + C52418a.m58682i(5, m433.computeSize()) : h;
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
            C49177dp0 dp02 = objArr[1];
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
                    dp02.BaseRequest = iaVar3;
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
                    dp02.f132464d = ig04;
                }
                return 0;
            } else if (intValue == 3) {
                dp02.f132465e = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 4) {
                dp02.f132466f = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C50353m43 m434 = new C50353m43();
                    if (bArr3 != null && bArr3.length > 0) {
                        m434.parseFrom(bArr3);
                    }
                    dp02.f132467g = m434;
                }
                return 0;
            }
        }
    }
}
