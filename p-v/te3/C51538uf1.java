package te3;

import com.tencent.p014mm.protocal.protobuf.FinderContact;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.uf1 */
public class C51538uf1 extends C47465a {

    /* renamed from: d */
    public long f142828d;

    /* renamed from: e */
    public long f142829e;

    /* renamed from: f */
    public FinderContact f142830f;

    /* renamed from: g */
    public String f142831g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51538uf1)) {
            return false;
        }
        C51538uf1 uf12 = (C51538uf1) aVar;
        return C46238a.m51546a(Long.valueOf(this.f142828d), Long.valueOf(uf12.f142828d)) && C46238a.m51546a(Long.valueOf(this.f142829e), Long.valueOf(uf12.f142829e)) && C46238a.m51546a(this.f142830f, uf12.f142830f) && C46238a.m51546a(this.f142831g, uf12.f142831g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(20, this.f142828d);
            aVar.mo74321h(21, this.f142829e);
            FinderContact finderContact = this.f142830f;
            if (finderContact != null) {
                aVar.mo74322i(22, finderContact.computeSize());
                this.f142830f.writeFields(aVar);
            }
            String str = this.f142831g;
            if (str != null) {
                aVar.mo74323j(23, str);
            }
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(20, this.f142828d) + 0 + C52418a.m58681h(21, this.f142829e);
            FinderContact finderContact2 = this.f142830f;
            if (finderContact2 != null) {
                h += C52418a.m58682i(22, finderContact2.computeSize());
            }
            String str2 = this.f142831g;
            return str2 != null ? h + C52418a.m58683j(23, str2) : h;
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
            C51538uf1 uf12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 20:
                    uf12.f142828d = aVar3.mo141631i(intValue);
                    return 0;
                case 21:
                    uf12.f142829e = aVar3.mo141631i(intValue);
                    return 0;
                case 22:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        FinderContact finderContact3 = new FinderContact();
                        if (bArr != null && bArr.length > 0) {
                            finderContact3.parseFrom(bArr);
                        }
                        uf12.f142830f = finderContact3;
                    }
                    return 0;
                case 23:
                    uf12.f142831g = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
