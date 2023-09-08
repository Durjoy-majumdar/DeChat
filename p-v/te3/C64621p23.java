package te3;

import com.tencent.p014mm.protocal.protobuf.FinderObject;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.p23 */
public class C64621p23 extends C47465a {

    /* renamed from: d */
    public FinderObject f184739d;

    /* renamed from: e */
    public LinkedList<FinderObject> f184740e = new LinkedList<>();

    /* renamed from: f */
    public String f184741f;

    /* renamed from: g */
    public int f184742g;

    /* renamed from: h */
    public long f184743h;

    /* renamed from: i */
    public C64417hb1 f184744i;

    /* renamed from: j */
    public int f184745j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64621p23)) {
            return false;
        }
        C64621p23 p232 = (C64621p23) aVar;
        return C46238a.m51546a(this.f184739d, p232.f184739d) && C46238a.m51546a(this.f184740e, p232.f184740e) && C46238a.m51546a(this.f184741f, p232.f184741f) && C46238a.m51546a(Integer.valueOf(this.f184742g), Integer.valueOf(p232.f184742g)) && C46238a.m51546a(Long.valueOf(this.f184743h), Long.valueOf(p232.f184743h)) && C46238a.m51546a(this.f184744i, p232.f184744i) && C46238a.m51546a(Integer.valueOf(this.f184745j), Integer.valueOf(p232.f184745j));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            FinderObject finderObject = this.f184739d;
            if (finderObject != null) {
                aVar.mo74322i(1, finderObject.computeSize());
                this.f184739d.writeFields(aVar);
            }
            aVar.mo74320g(2, 8, this.f184740e);
            String str = this.f184741f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74318e(4, this.f184742g);
            aVar.mo74321h(5, this.f184743h);
            C64417hb1 hb12 = this.f184744i;
            if (hb12 != null) {
                aVar.mo74322i(6, hb12.computeSize());
                this.f184744i.writeFields(aVar);
            }
            aVar.mo74318e(7, this.f184745j);
            return 0;
        } else if (i == 1) {
            FinderObject finderObject2 = this.f184739d;
            if (finderObject2 != null) {
                i2 = 0 + C52418a.m58682i(1, finderObject2.computeSize());
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f184740e);
            String str2 = this.f184741f;
            if (str2 != null) {
                g += C52418a.m58683j(3, str2);
            }
            int e = g + C52418a.m58678e(4, this.f184742g) + C52418a.m58681h(5, this.f184743h);
            C64417hb1 hb13 = this.f184744i;
            if (hb13 != null) {
                e += C52418a.m58682i(6, hb13.computeSize());
            }
            return e + C52418a.m58678e(7, this.f184745j);
        } else if (i == 2) {
            this.f184740e.clear();
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
            C64621p23 p232 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        FinderObject finderObject3 = new FinderObject();
                        if (bArr != null && bArr.length > 0) {
                            finderObject3.parseFrom(bArr);
                        }
                        p232.f184739d = finderObject3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        FinderObject finderObject4 = new FinderObject();
                        if (bArr2 != null && bArr2.length > 0) {
                            finderObject4.parseFrom(bArr2);
                        }
                        p232.f184740e.add(finderObject4);
                    }
                    return 0;
                case 3:
                    p232.f184741f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    p232.f184742g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    p232.f184743h = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C64417hb1 hb14 = new C64417hb1();
                        if (bArr3 != null && bArr3.length > 0) {
                            hb14.parseFrom(bArr3);
                        }
                        p232.f184744i = hb14;
                    }
                    return 0;
                case 7:
                    p232.f184745j = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
