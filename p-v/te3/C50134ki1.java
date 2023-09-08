package te3;

import com.tencent.p014mm.protocal.protobuf.FinderContact;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ki1 */
public class C50134ki1 extends C47465a {

    /* renamed from: d */
    public LinkedList<FinderContact> f136804d = new LinkedList<>();

    /* renamed from: e */
    public int f136805e;

    /* renamed from: f */
    public int f136806f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50134ki1)) {
            return false;
        }
        C50134ki1 ki12 = (C50134ki1) aVar;
        return C46238a.m51546a(this.f136804d, ki12.f136804d) && C46238a.m51546a(Integer.valueOf(this.f136805e), Integer.valueOf(ki12.f136805e)) && C46238a.m51546a(Integer.valueOf(this.f136806f), Integer.valueOf(ki12.f136806f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f136804d);
            aVar.mo74318e(2, this.f136805e);
            aVar.mo74318e(3, this.f136806f);
            return 0;
        } else if (i == 1) {
            return C52418a.m58680g(1, 8, this.f136804d) + 0 + C52418a.m58678e(2, this.f136805e) + C52418a.m58678e(3, this.f136806f);
        } else {
            if (i == 2) {
                this.f136804d.clear();
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
                C50134ki1 ki12 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        FinderContact finderContact = new FinderContact();
                        if (bArr != null && bArr.length > 0) {
                            finderContact.parseFrom(bArr);
                        }
                        ki12.f136804d.add(finderContact);
                    }
                    return 0;
                } else if (intValue == 2) {
                    ki12.f136805e = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 3) {
                    return -1;
                } else {
                    ki12.f136806f = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
