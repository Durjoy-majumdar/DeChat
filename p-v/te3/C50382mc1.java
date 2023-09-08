package te3;

import com.tencent.p014mm.protocal.protobuf.FinderObject;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.mc1 */
public class C50382mc1 extends C47465a {

    /* renamed from: d */
    public int f137948d;

    /* renamed from: e */
    public C50521nc1 f137949e;

    /* renamed from: f */
    public C49980je1 f137950f;

    /* renamed from: g */
    public FinderObject f137951g;

    /* renamed from: h */
    public C51692vg1 f137952h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50382mc1)) {
            return false;
        }
        C50382mc1 mc12 = (C50382mc1) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f137948d), Integer.valueOf(mc12.f137948d)) && C46238a.m51546a(this.f137949e, mc12.f137949e) && C46238a.m51546a(this.f137950f, mc12.f137950f) && C46238a.m51546a(this.f137951g, mc12.f137951g) && C46238a.m51546a(this.f137952h, mc12.f137952h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f137948d);
            C50521nc1 nc12 = this.f137949e;
            if (nc12 != null) {
                aVar.mo74322i(2, nc12.computeSize());
                this.f137949e.writeFields(aVar);
            }
            C49980je1 je12 = this.f137950f;
            if (je12 != null) {
                aVar.mo74322i(3, je12.computeSize());
                this.f137950f.writeFields(aVar);
            }
            FinderObject finderObject = this.f137951g;
            if (finderObject != null) {
                aVar.mo74322i(4, finderObject.computeSize());
                this.f137951g.writeFields(aVar);
            }
            C51692vg1 vg12 = this.f137952h;
            if (vg12 != null) {
                aVar.mo74322i(5, vg12.computeSize());
                this.f137952h.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f137948d) + 0;
            C50521nc1 nc13 = this.f137949e;
            if (nc13 != null) {
                e += C52418a.m58682i(2, nc13.computeSize());
            }
            C49980je1 je13 = this.f137950f;
            if (je13 != null) {
                e += C52418a.m58682i(3, je13.computeSize());
            }
            FinderObject finderObject2 = this.f137951g;
            if (finderObject2 != null) {
                e += C52418a.m58682i(4, finderObject2.computeSize());
            }
            C51692vg1 vg13 = this.f137952h;
            return vg13 != null ? e + C52418a.m58682i(5, vg13.computeSize()) : e;
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
            C50382mc1 mc12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                mc12.f137948d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C50521nc1 nc14 = new C50521nc1();
                    if (bArr != null && bArr.length > 0) {
                        nc14.parseFrom(bArr);
                    }
                    mc12.f137949e = nc14;
                }
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    byte[] bArr2 = j2.get(i3);
                    C49980je1 je14 = new C49980je1();
                    if (bArr2 != null && bArr2.length > 0) {
                        je14.parseFrom(bArr2);
                    }
                    mc12.f137950f = je14;
                }
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    byte[] bArr3 = j3.get(i4);
                    FinderObject finderObject3 = new FinderObject();
                    if (bArr3 != null && bArr3.length > 0) {
                        finderObject3.parseFrom(bArr3);
                    }
                    mc12.f137951g = finderObject3;
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                int size4 = j4.size();
                for (int i5 = 0; i5 < size4; i5++) {
                    byte[] bArr4 = j4.get(i5);
                    C51692vg1 vg14 = new C51692vg1();
                    if (bArr4 != null && bArr4.length > 0) {
                        vg14.parseFrom(bArr4);
                    }
                    mc12.f137952h = vg14;
                }
                return 0;
            }
        }
    }
}
