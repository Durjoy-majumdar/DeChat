package te3;

import com.tencent.p014mm.protocal.protobuf.FinderObject;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.qk0 */
public class C50972qk0 extends C47465a {

    /* renamed from: d */
    public String f140360d;

    /* renamed from: e */
    public int f140361e;

    /* renamed from: f */
    public int f140362f;

    /* renamed from: g */
    public LinkedList<FinderObject> f140363g = new LinkedList<>();

    /* renamed from: h */
    public C89349b f140364h;

    /* renamed from: i */
    public int f140365i;

    /* renamed from: j */
    public String f140366j;

    /* renamed from: n */
    public LinkedList<C48868bk1> f140367n = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50972qk0)) {
            return false;
        }
        C50972qk0 qk02 = (C50972qk0) aVar;
        return C46238a.m51546a(this.f140360d, qk02.f140360d) && C46238a.m51546a(Integer.valueOf(this.f140361e), Integer.valueOf(qk02.f140361e)) && C46238a.m51546a(Integer.valueOf(this.f140362f), Integer.valueOf(qk02.f140362f)) && C46238a.m51546a(this.f140363g, qk02.f140363g) && C46238a.m51546a(this.f140364h, qk02.f140364h) && C46238a.m51546a(Integer.valueOf(this.f140365i), Integer.valueOf(qk02.f140365i)) && C46238a.m51546a(this.f140366j, qk02.f140366j) && C46238a.m51546a(this.f140367n, qk02.f140367n);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f140360d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f140361e);
            aVar.mo74318e(3, this.f140362f);
            aVar.mo74320g(4, 8, this.f140363g);
            C89349b bVar = this.f140364h;
            if (bVar != null) {
                aVar.mo74315b(5, bVar);
            }
            aVar.mo74318e(6, this.f140365i);
            String str2 = this.f140366j;
            if (str2 != null) {
                aVar.mo74323j(7, str2);
            }
            aVar.mo74320g(8, 8, this.f140367n);
            return 0;
        } else if (i == 1) {
            String str3 = this.f140360d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            int e = i2 + C52418a.m58678e(2, this.f140361e) + C52418a.m58678e(3, this.f140362f) + C52418a.m58680g(4, 8, this.f140363g);
            C89349b bVar2 = this.f140364h;
            if (bVar2 != null) {
                e += C52418a.m58675b(5, bVar2);
            }
            int e2 = e + C52418a.m58678e(6, this.f140365i);
            String str4 = this.f140366j;
            if (str4 != null) {
                e2 += C52418a.m58683j(7, str4);
            }
            return e2 + C52418a.m58680g(8, 8, this.f140367n);
        } else if (i == 2) {
            this.f140363g.clear();
            this.f140367n.clear();
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
            C50972qk0 qk02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    qk02.f140360d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    qk02.f140361e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    qk02.f140362f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        FinderObject finderObject = new FinderObject();
                        if (bArr != null && bArr.length > 0) {
                            finderObject.parseFrom(bArr);
                        }
                        qk02.f140363g.add(finderObject);
                    }
                    return 0;
                case 5:
                    qk02.f140364h = aVar3.mo141626d(intValue);
                    return 0;
                case 6:
                    qk02.f140365i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    qk02.f140366j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C48868bk1 bk12 = new C48868bk1();
                        if (bArr2 != null && bArr2.length > 0) {
                            bk12.parseFrom(bArr2);
                        }
                        qk02.f140367n.add(bk12);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
