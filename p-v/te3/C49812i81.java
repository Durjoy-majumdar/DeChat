package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.i81 */
public class C49812i81 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f135164d;

    /* renamed from: e */
    public int f135165e;

    /* renamed from: f */
    public LinkedList<String> f135166f = new LinkedList<>();

    /* renamed from: g */
    public String f135167g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49812i81)) {
            return false;
        }
        C49812i81 i812 = (C49812i81) aVar;
        return C46238a.m51546a(this.BaseRequest, i812.BaseRequest) && C46238a.m51546a(this.f135164d, i812.f135164d) && C46238a.m51546a(Integer.valueOf(this.f135165e), Integer.valueOf(i812.f135165e)) && C46238a.m51546a(this.f135166f, i812.f135166f) && C46238a.m51546a(this.f135167g, i812.f135167g);
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
            C49842ig0 ig02 = this.f135164d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f135164d.writeFields(aVar);
            }
            aVar.mo74318e(3, this.f135165e);
            aVar.mo74320g(4, 1, this.f135166f);
            String str = this.f135167g;
            if (str != null) {
                aVar.mo74323j(5, str);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f135164d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            int e = i2 + C52418a.m58678e(3, this.f135165e) + C52418a.m58680g(4, 1, this.f135166f);
            String str2 = this.f135167g;
            return str2 != null ? e + C52418a.m58683j(5, str2) : e;
        } else if (i == 2) {
            this.f135166f.clear();
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
            C49812i81 i812 = objArr[1];
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
                    i812.BaseRequest = iaVar3;
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
                    i812.f135164d = ig04;
                }
                return 0;
            } else if (intValue == 3) {
                i812.f135165e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                i812.f135166f.add(aVar3.mo141633k(intValue));
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                i812.f135167g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
