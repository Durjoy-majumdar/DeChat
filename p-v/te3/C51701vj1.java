package te3;

import com.tencent.p014mm.protocal.protobuf.FinderObject;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.vj1 */
public class C51701vj1 extends C47465a {

    /* renamed from: d */
    public String f143508d;

    /* renamed from: e */
    public int f143509e;

    /* renamed from: f */
    public LinkedList<FinderObject> f143510f = new LinkedList<>();

    /* renamed from: g */
    public int f143511g;

    /* renamed from: h */
    public C89349b f143512h;

    /* renamed from: i */
    public int f143513i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51701vj1)) {
            return false;
        }
        C51701vj1 vj12 = (C51701vj1) aVar;
        return C46238a.m51546a(this.f143508d, vj12.f143508d) && C46238a.m51546a(Integer.valueOf(this.f143509e), Integer.valueOf(vj12.f143509e)) && C46238a.m51546a(this.f143510f, vj12.f143510f) && C46238a.m51546a(Integer.valueOf(this.f143511g), Integer.valueOf(vj12.f143511g)) && C46238a.m51546a(this.f143512h, vj12.f143512h) && C46238a.m51546a(Integer.valueOf(this.f143513i), Integer.valueOf(vj12.f143513i));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f143508d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f143509e);
            aVar.mo74320g(3, 8, this.f143510f);
            aVar.mo74318e(4, this.f143511g);
            C89349b bVar = this.f143512h;
            if (bVar != null) {
                aVar.mo74315b(5, bVar);
            }
            aVar.mo74318e(6, this.f143513i);
            return 0;
        } else if (i == 1) {
            String str2 = this.f143508d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            int e = i2 + C52418a.m58678e(2, this.f143509e) + C52418a.m58680g(3, 8, this.f143510f) + C52418a.m58678e(4, this.f143511g);
            C89349b bVar2 = this.f143512h;
            if (bVar2 != null) {
                e += C52418a.m58675b(5, bVar2);
            }
            return e + C52418a.m58678e(6, this.f143513i);
        } else if (i == 2) {
            this.f143510f.clear();
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
            C51701vj1 vj12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    vj12.f143508d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    vj12.f143509e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        FinderObject finderObject = new FinderObject();
                        if (bArr != null && bArr.length > 0) {
                            finderObject.parseFrom(bArr);
                        }
                        vj12.f143510f.add(finderObject);
                    }
                    return 0;
                case 4:
                    vj12.f143511g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    vj12.f143512h = aVar3.mo141626d(intValue);
                    return 0;
                case 6:
                    vj12.f143513i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
