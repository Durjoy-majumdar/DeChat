package te3;

import com.tencent.p014mm.protocal.protobuf.FinderObject;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.z81 */
public class C52231z81 extends C47465a {

    /* renamed from: d */
    public long f145754d;

    /* renamed from: e */
    public int f145755e;

    /* renamed from: f */
    public FinderObject f145756f;

    /* renamed from: g */
    public String f145757g;

    /* renamed from: h */
    public C49114d91 f145758h;

    /* renamed from: i */
    public LinkedList<FinderObject> f145759i = new LinkedList<>();

    /* renamed from: j */
    public C48972c91 f145760j;

    /* renamed from: n */
    public C49420fg0 f145761n;

    /* renamed from: o */
    public String f145762o;

    /* renamed from: p */
    public C48817b71 f145763p;

    /* renamed from: q */
    public C49416ff0 f145764q;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52231z81)) {
            return false;
        }
        C52231z81 z812 = (C52231z81) aVar;
        return C46238a.m51546a(Long.valueOf(this.f145754d), Long.valueOf(z812.f145754d)) && C46238a.m51546a(Integer.valueOf(this.f145755e), Integer.valueOf(z812.f145755e)) && C46238a.m51546a(this.f145756f, z812.f145756f) && C46238a.m51546a(this.f145757g, z812.f145757g) && C46238a.m51546a(this.f145758h, z812.f145758h) && C46238a.m51546a(this.f145759i, z812.f145759i) && C46238a.m51546a(this.f145760j, z812.f145760j) && C46238a.m51546a(this.f145761n, z812.f145761n) && C46238a.m51546a(this.f145762o, z812.f145762o) && C46238a.m51546a(this.f145763p, z812.f145763p) && C46238a.m51546a(this.f145764q, z812.f145764q);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f145754d);
            aVar.mo74318e(2, this.f145755e);
            FinderObject finderObject = this.f145756f;
            if (finderObject != null) {
                aVar.mo74322i(3, finderObject.computeSize());
                this.f145756f.writeFields(aVar);
            }
            String str = this.f145757g;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            C49114d91 d912 = this.f145758h;
            if (d912 != null) {
                aVar.mo74322i(5, d912.computeSize());
                this.f145758h.writeFields(aVar);
            }
            aVar.mo74320g(6, 8, this.f145759i);
            C48972c91 c912 = this.f145760j;
            if (c912 != null) {
                aVar.mo74322i(7, c912.computeSize());
                this.f145760j.writeFields(aVar);
            }
            C49420fg0 fg02 = this.f145761n;
            if (fg02 != null) {
                aVar.mo74322i(8, fg02.computeSize());
                this.f145761n.writeFields(aVar);
            }
            String str2 = this.f145762o;
            if (str2 != null) {
                aVar.mo74323j(9, str2);
            }
            C48817b71 b712 = this.f145763p;
            if (b712 != null) {
                aVar.mo74322i(10, b712.computeSize());
                this.f145763p.writeFields(aVar);
            }
            C49416ff0 ff02 = this.f145764q;
            if (ff02 != null) {
                aVar.mo74322i(11, ff02.computeSize());
                this.f145764q.writeFields(aVar);
            }
            return 0;
        } else if (i2 == 1) {
            int h = C52418a.m58681h(1, this.f145754d) + 0 + C52418a.m58678e(2, this.f145755e);
            FinderObject finderObject2 = this.f145756f;
            if (finderObject2 != null) {
                h += C52418a.m58682i(3, finderObject2.computeSize());
            }
            String str3 = this.f145757g;
            if (str3 != null) {
                h += C52418a.m58683j(4, str3);
            }
            C49114d91 d913 = this.f145758h;
            if (d913 != null) {
                h += C52418a.m58682i(5, d913.computeSize());
            }
            int g = h + C52418a.m58680g(6, 8, this.f145759i);
            C48972c91 c913 = this.f145760j;
            if (c913 != null) {
                g += C52418a.m58682i(7, c913.computeSize());
            }
            C49420fg0 fg03 = this.f145761n;
            if (fg03 != null) {
                g += C52418a.m58682i(8, fg03.computeSize());
            }
            String str4 = this.f145762o;
            if (str4 != null) {
                g += C52418a.m58683j(9, str4);
            }
            C48817b71 b713 = this.f145763p;
            if (b713 != null) {
                g += C52418a.m58682i(10, b713.computeSize());
            }
            C49416ff0 ff03 = this.f145764q;
            return ff03 != null ? g + C52418a.m58682i(11, ff03.computeSize()) : g;
        } else if (i2 == 2) {
            this.f145759i.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C52231z81 z812 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    z812.f145754d = aVar3.mo141631i(intValue);
                    return 0;
                case 2:
                    z812.f145755e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        FinderObject finderObject3 = new FinderObject();
                        if (bArr != null && bArr.length > 0) {
                            finderObject3.parseFrom(bArr);
                        }
                        z812.f145756f = finderObject3;
                    }
                    return 0;
                case 4:
                    z812.f145757g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C49114d91 d914 = new C49114d91();
                        if (bArr2 != null && bArr2.length > 0) {
                            d914.parseFrom(bArr2);
                        }
                        z812.f145758h = d914;
                    }
                    return 0;
                case 6:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        FinderObject finderObject4 = new FinderObject();
                        if (bArr3 != null && bArr3.length > 0) {
                            finderObject4.parseFrom(bArr3);
                        }
                        z812.f145759i.add(finderObject4);
                    }
                    return 0;
                case 7:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C48972c91 c914 = new C48972c91();
                        if (bArr4 != null && bArr4.length > 0) {
                            c914.parseFrom(bArr4);
                        }
                        z812.f145760j = c914;
                    }
                    return 0;
                case 8:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i7 = 0; i7 < size5; i7++) {
                        byte[] bArr5 = j5.get(i7);
                        C49420fg0 fg04 = new C49420fg0();
                        if (bArr5 != null && bArr5.length > 0) {
                            fg04.parseFrom(bArr5);
                        }
                        z812.f145761n = fg04;
                    }
                    return 0;
                case 9:
                    z812.f145762o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i8 = 0; i8 < size6; i8++) {
                        byte[] bArr6 = j6.get(i8);
                        C48817b71 b714 = new C48817b71();
                        if (bArr6 != null && bArr6.length > 0) {
                            b714.parseFrom(bArr6);
                        }
                        z812.f145763p = b714;
                    }
                    return 0;
                case 11:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i9 = 0; i9 < size7; i9++) {
                        byte[] bArr7 = j7.get(i9);
                        C49416ff0 ff04 = new C49416ff0();
                        if (bArr7 != null && bArr7.length > 0) {
                            ff04.parseFrom(bArr7);
                        }
                        z812.f145764q = ff04;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
