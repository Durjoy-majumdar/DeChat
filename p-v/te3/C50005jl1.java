package te3;

import com.tencent.p014mm.protocal.protobuf.FinderContact;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.jl1 */
public class C50005jl1 extends C47465a {

    /* renamed from: d */
    public int f136174d;

    /* renamed from: e */
    public int f136175e;

    /* renamed from: f */
    public int f136176f;

    /* renamed from: g */
    public LinkedList<FinderContact> f136177g = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50005jl1)) {
            return false;
        }
        C50005jl1 jl12 = (C50005jl1) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f136174d), Integer.valueOf(jl12.f136174d)) && C46238a.m51546a(Integer.valueOf(this.f136175e), Integer.valueOf(jl12.f136175e)) && C46238a.m51546a(Integer.valueOf(this.f136176f), Integer.valueOf(jl12.f136176f)) && C46238a.m51546a(this.f136177g, jl12.f136177g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f136174d);
            aVar.mo74318e(2, this.f136175e);
            aVar.mo74318e(3, this.f136176f);
            aVar.mo74320g(4, 8, this.f136177g);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f136174d) + 0 + C52418a.m58678e(2, this.f136175e) + C52418a.m58678e(3, this.f136176f) + C52418a.m58680g(4, 8, this.f136177g);
        } else {
            if (i == 2) {
                this.f136177g.clear();
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
                C50005jl1 jl12 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    jl12.f136174d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 2) {
                    jl12.f136175e = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 3) {
                    jl12.f136176f = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 4) {
                    return -1;
                } else {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        FinderContact finderContact = new FinderContact();
                        if (bArr != null && bArr.length > 0) {
                            finderContact.parseFrom(bArr);
                        }
                        jl12.f136177g.add(finderContact);
                    }
                    return 0;
                }
            }
        }
    }
}
