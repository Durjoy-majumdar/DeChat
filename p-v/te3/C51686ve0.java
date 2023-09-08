package te3;

import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ve0 */
public class C51686ve0 extends C47465a {

    /* renamed from: d */
    public FinderContact f143450d;

    /* renamed from: e */
    public LinkedList<FinderObject> f143451e = new LinkedList<>();

    /* renamed from: f */
    public String f143452f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51686ve0)) {
            return false;
        }
        C51686ve0 ve02 = (C51686ve0) aVar;
        return C46238a.m51546a(this.f143450d, ve02.f143450d) && C46238a.m51546a(this.f143451e, ve02.f143451e) && C46238a.m51546a(this.f143452f, ve02.f143452f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            FinderContact finderContact = this.f143450d;
            if (finderContact != null) {
                aVar.mo74322i(1, finderContact.computeSize());
                this.f143450d.writeFields(aVar);
            }
            aVar.mo74320g(2, 8, this.f143451e);
            String str = this.f143452f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            return 0;
        } else if (i == 1) {
            FinderContact finderContact2 = this.f143450d;
            if (finderContact2 != null) {
                i2 = 0 + C52418a.m58682i(1, finderContact2.computeSize());
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f143451e);
            String str2 = this.f143452f;
            return str2 != null ? g + C52418a.m58683j(3, str2) : g;
        } else if (i == 2) {
            this.f143451e.clear();
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
            C51686ve0 ve02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    FinderContact finderContact3 = new FinderContact();
                    if (bArr != null && bArr.length > 0) {
                        finderContact3.parseFrom(bArr);
                    }
                    ve02.f143450d = finderContact3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    FinderObject finderObject = new FinderObject();
                    if (bArr2 != null && bArr2.length > 0) {
                        finderObject.parseFrom(bArr2);
                    }
                    ve02.f143451e.add(finderObject);
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                ve02.f143452f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
