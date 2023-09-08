package te3;

import com.tencent.p014mm.protocal.protobuf.FinderObject;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.zv2 */
public class C64897zv2 extends C47465a {

    /* renamed from: d */
    public String f186882d;

    /* renamed from: e */
    public LinkedList<C48693ac1> f186883e = new LinkedList<>();

    /* renamed from: f */
    public int f186884f;

    /* renamed from: g */
    public int f186885g;

    /* renamed from: h */
    public C89349b f186886h;

    /* renamed from: i */
    public int f186887i;

    /* renamed from: j */
    public LinkedList<FinderObject> f186888j = new LinkedList<>();

    /* renamed from: n */
    public long f186889n;

    /* renamed from: o */
    public long f186890o;

    /* renamed from: p */
    public long f186891p;

    /* renamed from: q */
    public String f186892q;

    /* renamed from: r */
    public FinderObject f186893r;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64897zv2)) {
            return false;
        }
        C64897zv2 zv22 = (C64897zv2) aVar;
        return C46238a.m51546a(this.f186882d, zv22.f186882d) && C46238a.m51546a(this.f186883e, zv22.f186883e) && C46238a.m51546a(Integer.valueOf(this.f186884f), Integer.valueOf(zv22.f186884f)) && C46238a.m51546a(Integer.valueOf(this.f186885g), Integer.valueOf(zv22.f186885g)) && C46238a.m51546a(this.f186886h, zv22.f186886h) && C46238a.m51546a(Integer.valueOf(this.f186887i), Integer.valueOf(zv22.f186887i)) && C46238a.m51546a(this.f186888j, zv22.f186888j) && C46238a.m51546a(Long.valueOf(this.f186889n), Long.valueOf(zv22.f186889n)) && C46238a.m51546a(Long.valueOf(this.f186890o), Long.valueOf(zv22.f186890o)) && C46238a.m51546a(Long.valueOf(this.f186891p), Long.valueOf(zv22.f186891p)) && C46238a.m51546a(this.f186892q, zv22.f186892q) && C46238a.m51546a(this.f186893r, zv22.f186893r);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f186882d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74320g(2, 8, this.f186883e);
            aVar.mo74318e(3, this.f186884f);
            aVar.mo74318e(4, this.f186885g);
            C89349b bVar = this.f186886h;
            if (bVar != null) {
                aVar.mo74315b(5, bVar);
            }
            aVar.mo74318e(6, this.f186887i);
            aVar.mo74320g(7, 8, this.f186888j);
            aVar.mo74321h(8, this.f186889n);
            aVar.mo74321h(9, this.f186890o);
            aVar.mo74321h(10, this.f186891p);
            String str2 = this.f186892q;
            if (str2 != null) {
                aVar.mo74323j(11, str2);
            }
            FinderObject finderObject = this.f186893r;
            if (finderObject != null) {
                aVar.mo74322i(12, finderObject.computeSize());
                this.f186893r.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            String str3 = this.f186882d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f186883e) + C52418a.m58678e(3, this.f186884f) + C52418a.m58678e(4, this.f186885g);
            C89349b bVar2 = this.f186886h;
            if (bVar2 != null) {
                g += C52418a.m58675b(5, bVar2);
            }
            int e = g + C52418a.m58678e(6, this.f186887i) + C52418a.m58680g(7, 8, this.f186888j) + C52418a.m58681h(8, this.f186889n) + C52418a.m58681h(9, this.f186890o) + C52418a.m58681h(10, this.f186891p);
            String str4 = this.f186892q;
            if (str4 != null) {
                e += C52418a.m58683j(11, str4);
            }
            FinderObject finderObject2 = this.f186893r;
            return finderObject2 != null ? e + C52418a.m58682i(12, finderObject2.computeSize()) : e;
        } else if (i == 2) {
            this.f186883e.clear();
            this.f186888j.clear();
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
            C64897zv2 zv22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    zv22.f186882d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C48693ac1 ac12 = new C48693ac1();
                        if (bArr != null && bArr.length > 0) {
                            ac12.parseFrom(bArr);
                        }
                        zv22.f186883e.add(ac12);
                    }
                    return 0;
                case 3:
                    zv22.f186884f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    zv22.f186885g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    zv22.f186886h = aVar3.mo141626d(intValue);
                    return 0;
                case 6:
                    zv22.f186887i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        FinderObject finderObject3 = new FinderObject();
                        if (bArr2 != null && bArr2.length > 0) {
                            finderObject3.parseFrom(bArr2);
                        }
                        zv22.f186888j.add(finderObject3);
                    }
                    return 0;
                case 8:
                    zv22.f186889n = aVar3.mo141631i(intValue);
                    return 0;
                case 9:
                    zv22.f186890o = aVar3.mo141631i(intValue);
                    return 0;
                case 10:
                    zv22.f186891p = aVar3.mo141631i(intValue);
                    return 0;
                case 11:
                    zv22.f186892q = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        FinderObject finderObject4 = new FinderObject();
                        if (bArr3 != null && bArr3.length > 0) {
                            finderObject4.parseFrom(bArr3);
                        }
                        zv22.f186893r = finderObject4;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
