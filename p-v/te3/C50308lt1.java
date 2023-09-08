package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.lt1 */
public class C50308lt1 extends C47465a {

    /* renamed from: d */
    public long f137636d;

    /* renamed from: e */
    public LinkedList<cs4> f137637e = new LinkedList<>();

    /* renamed from: f */
    public String f137638f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50308lt1)) {
            return false;
        }
        C50308lt1 lt12 = (C50308lt1) aVar;
        return C46238a.m51546a(Long.valueOf(this.f137636d), Long.valueOf(lt12.f137636d)) && C46238a.m51546a(this.f137637e, lt12.f137637e) && C46238a.m51546a(this.f137638f, lt12.f137638f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f137636d);
            aVar.mo74320g(2, 8, this.f137637e);
            String str = this.f137638f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f137636d) + 0 + C52418a.m58680g(2, 8, this.f137637e);
            String str2 = this.f137638f;
            return str2 != null ? h + C52418a.m58683j(3, str2) : h;
        } else if (i == 2) {
            this.f137637e.clear();
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
            C50308lt1 lt12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                lt12.f137636d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    cs4 cs4 = new cs4();
                    if (bArr != null && bArr.length > 0) {
                        cs4.parseFrom(bArr);
                    }
                    lt12.f137637e.add(cs4);
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                lt12.f137638f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
