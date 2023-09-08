package te3;

import com.tencent.p014mm.protocal.protobuf.FinderObject;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.v41 */
public class C64766v41 extends C47465a {

    /* renamed from: d */
    public String f185828d;

    /* renamed from: e */
    public long f185829e;

    /* renamed from: f */
    public String f185830f;

    /* renamed from: g */
    public long f185831g;

    /* renamed from: h */
    public String f185832h;

    /* renamed from: i */
    public String f185833i;

    /* renamed from: j */
    public String f185834j;

    /* renamed from: n */
    public FinderObject f185835n;

    /* renamed from: o */
    public int f185836o;

    /* renamed from: p */
    public LinkedList<FinderObject> f185837p = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64766v41)) {
            return false;
        }
        C64766v41 v412 = (C64766v41) aVar;
        return C46238a.m51546a(this.f185828d, v412.f185828d) && C46238a.m51546a(Long.valueOf(this.f185829e), Long.valueOf(v412.f185829e)) && C46238a.m51546a(this.f185830f, v412.f185830f) && C46238a.m51546a(Long.valueOf(this.f185831g), Long.valueOf(v412.f185831g)) && C46238a.m51546a(this.f185832h, v412.f185832h) && C46238a.m51546a(this.f185833i, v412.f185833i) && C46238a.m51546a(this.f185834j, v412.f185834j) && C46238a.m51546a(this.f185835n, v412.f185835n) && C46238a.m51546a(Integer.valueOf(this.f185836o), Integer.valueOf(v412.f185836o)) && C46238a.m51546a(this.f185837p, v412.f185837p);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f185828d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74321h(2, this.f185829e);
            String str2 = this.f185830f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74321h(4, this.f185831g);
            String str3 = this.f185832h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            String str4 = this.f185833i;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            String str5 = this.f185834j;
            if (str5 != null) {
                aVar.mo74323j(7, str5);
            }
            FinderObject finderObject = this.f185835n;
            if (finderObject != null) {
                aVar.mo74322i(8, finderObject.computeSize());
                this.f185835n.writeFields(aVar);
            }
            aVar.mo74318e(9, this.f185836o);
            aVar.mo74320g(10, 8, this.f185837p);
            return 0;
        } else if (i == 1) {
            String str6 = this.f185828d;
            if (str6 != null) {
                i2 = 0 + C52418a.m58683j(1, str6);
            }
            int h = i2 + C52418a.m58681h(2, this.f185829e);
            String str7 = this.f185830f;
            if (str7 != null) {
                h += C52418a.m58683j(3, str7);
            }
            int h2 = h + C52418a.m58681h(4, this.f185831g);
            String str8 = this.f185832h;
            if (str8 != null) {
                h2 += C52418a.m58683j(5, str8);
            }
            String str9 = this.f185833i;
            if (str9 != null) {
                h2 += C52418a.m58683j(6, str9);
            }
            String str10 = this.f185834j;
            if (str10 != null) {
                h2 += C52418a.m58683j(7, str10);
            }
            FinderObject finderObject2 = this.f185835n;
            if (finderObject2 != null) {
                h2 += C52418a.m58682i(8, finderObject2.computeSize());
            }
            return h2 + C52418a.m58678e(9, this.f185836o) + C52418a.m58680g(10, 8, this.f185837p);
        } else if (i == 2) {
            this.f185837p.clear();
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
            C64766v41 v412 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    v412.f185828d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    v412.f185829e = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    v412.f185830f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    v412.f185831g = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    v412.f185832h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    v412.f185833i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    v412.f185834j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        FinderObject finderObject3 = new FinderObject();
                        if (bArr != null && bArr.length > 0) {
                            finderObject3.parseFrom(bArr);
                        }
                        v412.f185835n = finderObject3;
                    }
                    return 0;
                case 9:
                    v412.f185836o = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        FinderObject finderObject4 = new FinderObject();
                        if (bArr2 != null && bArr2.length > 0) {
                            finderObject4.parseFrom(bArr2);
                        }
                        v412.f185837p.add(finderObject4);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
