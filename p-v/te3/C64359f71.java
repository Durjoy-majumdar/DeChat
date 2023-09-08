package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.f71 */
public class C64359f71 extends C47465a {

    /* renamed from: d */
    public LinkedList<C64733to> f183085d = new LinkedList<>();

    /* renamed from: e */
    public int f183086e;

    /* renamed from: f */
    public int f183087f;

    /* renamed from: g */
    public long f183088g;

    /* renamed from: h */
    public String f183089h;

    /* renamed from: i */
    public int f183090i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64359f71)) {
            return false;
        }
        C64359f71 f712 = (C64359f71) aVar;
        return C46238a.m51546a(this.f183085d, f712.f183085d) && C46238a.m51546a(Integer.valueOf(this.f183086e), Integer.valueOf(f712.f183086e)) && C46238a.m51546a(Integer.valueOf(this.f183087f), Integer.valueOf(f712.f183087f)) && C46238a.m51546a(Long.valueOf(this.f183088g), Long.valueOf(f712.f183088g)) && C46238a.m51546a(this.f183089h, f712.f183089h) && C46238a.m51546a(Integer.valueOf(this.f183090i), Integer.valueOf(f712.f183090i));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f183085d);
            aVar.mo74318e(2, this.f183086e);
            aVar.mo74318e(3, this.f183087f);
            aVar.mo74321h(4, this.f183088g);
            String str = this.f183089h;
            if (str != null) {
                aVar.mo74323j(5, str);
            }
            aVar.mo74318e(6, this.f183090i);
            return 0;
        } else if (i == 1) {
            int g = C52418a.m58680g(1, 8, this.f183085d) + 0 + C52418a.m58678e(2, this.f183086e) + C52418a.m58678e(3, this.f183087f) + C52418a.m58681h(4, this.f183088g);
            String str2 = this.f183089h;
            if (str2 != null) {
                g += C52418a.m58683j(5, str2);
            }
            return g + C52418a.m58678e(6, this.f183090i);
        } else if (i == 2) {
            this.f183085d.clear();
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
            C64359f71 f712 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C64733to toVar = new C64733to();
                        if (bArr != null && bArr.length > 0) {
                            toVar.parseFrom(bArr);
                        }
                        f712.f183085d.add(toVar);
                    }
                    return 0;
                case 2:
                    f712.f183086e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    f712.f183087f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    f712.f183088g = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    f712.f183089h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    f712.f183090i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
