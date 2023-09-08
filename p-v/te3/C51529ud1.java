package te3;

import com.tencent.p014mm.protocal.protobuf.FinderContact;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ud1 */
public class C51529ud1 extends C47465a {

    /* renamed from: d */
    public long f142783d;

    /* renamed from: e */
    public C89349b f142784e;

    /* renamed from: f */
    public FinderContact f142785f;

    /* renamed from: g */
    public long f142786g;

    /* renamed from: h */
    public String f142787h;

    /* renamed from: i */
    public String f142788i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51529ud1)) {
            return false;
        }
        C51529ud1 ud12 = (C51529ud1) aVar;
        return C46238a.m51546a(Long.valueOf(this.f142783d), Long.valueOf(ud12.f142783d)) && C46238a.m51546a(this.f142784e, ud12.f142784e) && C46238a.m51546a(this.f142785f, ud12.f142785f) && C46238a.m51546a(Long.valueOf(this.f142786g), Long.valueOf(ud12.f142786g)) && C46238a.m51546a(this.f142787h, ud12.f142787h) && C46238a.m51546a(this.f142788i, ud12.f142788i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f142783d);
            C89349b bVar = this.f142784e;
            if (bVar != null) {
                aVar.mo74315b(2, bVar);
            }
            FinderContact finderContact = this.f142785f;
            if (finderContact != null) {
                aVar.mo74322i(3, finderContact.computeSize());
                this.f142785f.writeFields(aVar);
            }
            aVar.mo74321h(4, this.f142786g);
            String str = this.f142787h;
            if (str != null) {
                aVar.mo74323j(5, str);
            }
            String str2 = this.f142788i;
            if (str2 != null) {
                aVar.mo74323j(6, str2);
            }
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f142783d) + 0;
            C89349b bVar2 = this.f142784e;
            if (bVar2 != null) {
                h += C52418a.m58675b(2, bVar2);
            }
            FinderContact finderContact2 = this.f142785f;
            if (finderContact2 != null) {
                h += C52418a.m58682i(3, finderContact2.computeSize());
            }
            int h2 = h + C52418a.m58681h(4, this.f142786g);
            String str3 = this.f142787h;
            if (str3 != null) {
                h2 += C52418a.m58683j(5, str3);
            }
            String str4 = this.f142788i;
            return str4 != null ? h2 + C52418a.m58683j(6, str4) : h2;
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
            C51529ud1 ud12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    ud12.f142783d = aVar3.mo141631i(intValue);
                    return 0;
                case 2:
                    ud12.f142784e = aVar3.mo141626d(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        FinderContact finderContact3 = new FinderContact();
                        if (bArr != null && bArr.length > 0) {
                            finderContact3.parseFrom(bArr);
                        }
                        ud12.f142785f = finderContact3;
                    }
                    return 0;
                case 4:
                    ud12.f142786g = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    ud12.f142787h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    ud12.f142788i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
