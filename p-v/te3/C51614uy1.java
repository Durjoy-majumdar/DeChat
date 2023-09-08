package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.uy1 */
public class C51614uy1 extends C47465a {

    /* renamed from: d */
    public int f143187d;

    /* renamed from: e */
    public int f143188e;

    /* renamed from: f */
    public C51018qv3 f143189f;

    /* renamed from: g */
    public int f143190g;

    /* renamed from: h */
    public String f143191h;

    /* renamed from: i */
    public int f143192i;

    /* renamed from: j */
    public long f143193j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51614uy1)) {
            return false;
        }
        C51614uy1 uy12 = (C51614uy1) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f143187d), Integer.valueOf(uy12.f143187d)) && C46238a.m51546a(Integer.valueOf(this.f143188e), Integer.valueOf(uy12.f143188e)) && C46238a.m51546a(this.f143189f, uy12.f143189f) && C46238a.m51546a(Integer.valueOf(this.f143190g), Integer.valueOf(uy12.f143190g)) && C46238a.m51546a(this.f143191h, uy12.f143191h) && C46238a.m51546a(Integer.valueOf(this.f143192i), Integer.valueOf(uy12.f143192i)) && C46238a.m51546a(Long.valueOf(this.f143193j), Long.valueOf(uy12.f143193j));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f143187d);
            aVar.mo74318e(2, this.f143188e);
            C51018qv3 qv32 = this.f143189f;
            if (qv32 != null) {
                aVar.mo74322i(3, qv32.computeSize());
                this.f143189f.writeFields(aVar);
            }
            aVar.mo74318e(4, this.f143190g);
            String str = this.f143191h;
            if (str != null) {
                aVar.mo74323j(5, str);
            }
            aVar.mo74318e(6, this.f143192i);
            aVar.mo74321h(7, this.f143193j);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f143187d) + 0 + C52418a.m58678e(2, this.f143188e);
            C51018qv3 qv33 = this.f143189f;
            if (qv33 != null) {
                e += C52418a.m58682i(3, qv33.computeSize());
            }
            int e2 = e + C52418a.m58678e(4, this.f143190g);
            String str2 = this.f143191h;
            if (str2 != null) {
                e2 += C52418a.m58683j(5, str2);
            }
            return e2 + C52418a.m58678e(6, this.f143192i) + C52418a.m58681h(7, this.f143193j);
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
            C51614uy1 uy12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    uy12.f143187d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    uy12.f143188e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C51018qv3 qv34 = new C51018qv3();
                        if (bArr != null && bArr.length > 0) {
                            qv34.mo73348f(bArr);
                        }
                        uy12.f143189f = qv34;
                    }
                    return 0;
                case 4:
                    uy12.f143190g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    uy12.f143191h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    uy12.f143192i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    uy12.f143193j = aVar3.mo141631i(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
