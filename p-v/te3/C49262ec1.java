package te3;

import com.tencent.p014mm.protocal.protobuf.FinderContact;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ec1 */
public class C49262ec1 extends C47465a {

    /* renamed from: d */
    public FinderContact f132859d;

    /* renamed from: e */
    public boolean f132860e;

    /* renamed from: f */
    public long f132861f;

    /* renamed from: g */
    public int f132862g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49262ec1)) {
            return false;
        }
        C49262ec1 ec12 = (C49262ec1) aVar;
        return C46238a.m51546a(this.f132859d, ec12.f132859d) && C46238a.m51546a(Boolean.valueOf(this.f132860e), Boolean.valueOf(ec12.f132860e)) && C46238a.m51546a(Long.valueOf(this.f132861f), Long.valueOf(ec12.f132861f)) && C46238a.m51546a(Integer.valueOf(this.f132862g), Integer.valueOf(ec12.f132862g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            FinderContact finderContact = this.f132859d;
            if (finderContact != null) {
                aVar.mo74322i(1, finderContact.computeSize());
                this.f132859d.writeFields(aVar);
            }
            aVar.mo74314a(2, this.f132860e);
            aVar.mo74321h(3, this.f132861f);
            aVar.mo74318e(4, this.f132862g);
            return 0;
        } else if (i == 1) {
            FinderContact finderContact2 = this.f132859d;
            if (finderContact2 != null) {
                i2 = 0 + C52418a.m58682i(1, finderContact2.computeSize());
            }
            return i2 + C52418a.m58674a(2, this.f132860e) + C52418a.m58681h(3, this.f132861f) + C52418a.m58678e(4, this.f132862g);
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
            C49262ec1 ec12 = objArr[1];
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
                    ec12.f132859d = finderContact3;
                }
                return 0;
            } else if (intValue == 2) {
                ec12.f132860e = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue == 3) {
                ec12.f132861f = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                ec12.f132862g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
