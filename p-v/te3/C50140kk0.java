package te3;

import com.tencent.p014mm.protocal.protobuf.FinderObject;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.kk0 */
public class C50140kk0 extends C47465a {

    /* renamed from: d */
    public int f136837d;

    /* renamed from: e */
    public long f136838e;

    /* renamed from: f */
    public FinderObject f136839f;

    /* renamed from: g */
    public int f136840g;

    /* renamed from: h */
    public C49980je1 f136841h;

    /* renamed from: i */
    public int f136842i;

    /* renamed from: j */
    public C48693ac1 f136843j;

    /* renamed from: n */
    public C51692vg1 f136844n;

    /* renamed from: o */
    public boolean f136845o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50140kk0)) {
            return false;
        }
        C50140kk0 kk02 = (C50140kk0) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f136837d), Integer.valueOf(kk02.f136837d)) && C46238a.m51546a(Long.valueOf(this.f136838e), Long.valueOf(kk02.f136838e)) && C46238a.m51546a(this.f136839f, kk02.f136839f) && C46238a.m51546a(Integer.valueOf(this.f136840g), Integer.valueOf(kk02.f136840g)) && C46238a.m51546a(this.f136841h, kk02.f136841h) && C46238a.m51546a(Integer.valueOf(this.f136842i), Integer.valueOf(kk02.f136842i)) && C46238a.m51546a(this.f136843j, kk02.f136843j) && C46238a.m51546a(this.f136844n, kk02.f136844n) && C46238a.m51546a(Boolean.valueOf(this.f136845o), Boolean.valueOf(kk02.f136845o));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f136837d);
            aVar.mo74321h(2, this.f136838e);
            FinderObject finderObject = this.f136839f;
            if (finderObject != null) {
                aVar.mo74322i(3, finderObject.computeSize());
                this.f136839f.writeFields(aVar);
            }
            aVar.mo74318e(4, this.f136840g);
            C49980je1 je12 = this.f136841h;
            if (je12 != null) {
                aVar.mo74322i(5, je12.computeSize());
                this.f136841h.writeFields(aVar);
            }
            aVar.mo74318e(6, this.f136842i);
            C48693ac1 ac12 = this.f136843j;
            if (ac12 != null) {
                aVar.mo74322i(7, ac12.computeSize());
                this.f136843j.writeFields(aVar);
            }
            C51692vg1 vg12 = this.f136844n;
            if (vg12 != null) {
                aVar.mo74322i(8, vg12.computeSize());
                this.f136844n.writeFields(aVar);
            }
            aVar.mo74314a(9, this.f136845o);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f136837d) + 0 + C52418a.m58681h(2, this.f136838e);
            FinderObject finderObject2 = this.f136839f;
            if (finderObject2 != null) {
                e += C52418a.m58682i(3, finderObject2.computeSize());
            }
            int e2 = e + C52418a.m58678e(4, this.f136840g);
            C49980je1 je13 = this.f136841h;
            if (je13 != null) {
                e2 += C52418a.m58682i(5, je13.computeSize());
            }
            int e3 = e2 + C52418a.m58678e(6, this.f136842i);
            C48693ac1 ac13 = this.f136843j;
            if (ac13 != null) {
                e3 += C52418a.m58682i(7, ac13.computeSize());
            }
            C51692vg1 vg13 = this.f136844n;
            if (vg13 != null) {
                e3 += C52418a.m58682i(8, vg13.computeSize());
            }
            return e3 + C52418a.m58674a(9, this.f136845o);
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
            C50140kk0 kk02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    kk02.f136837d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    kk02.f136838e = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        FinderObject finderObject3 = new FinderObject();
                        if (bArr != null && bArr.length > 0) {
                            finderObject3.parseFrom(bArr);
                        }
                        kk02.f136839f = finderObject3;
                    }
                    return 0;
                case 4:
                    kk02.f136840g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        C49980je1 je14 = new C49980je1();
                        if (bArr2 != null && bArr2.length > 0) {
                            je14.parseFrom(bArr2);
                        }
                        kk02.f136841h = je14;
                    }
                    return 0;
                case 6:
                    kk02.f136842i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        byte[] bArr3 = j3.get(i4);
                        C48693ac1 ac14 = new C48693ac1();
                        if (bArr3 != null && bArr3.length > 0) {
                            ac14.parseFrom(bArr3);
                        }
                        kk02.f136843j = ac14;
                    }
                    return 0;
                case 8:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i5 = 0; i5 < size4; i5++) {
                        byte[] bArr4 = j4.get(i5);
                        C51692vg1 vg14 = new C51692vg1();
                        if (bArr4 != null && bArr4.length > 0) {
                            vg14.parseFrom(bArr4);
                        }
                        kk02.f136844n = vg14;
                    }
                    return 0;
                case 9:
                    kk02.f136845o = aVar3.mo141625c(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
