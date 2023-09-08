package te3;

import com.tencent.p014mm.protocal.protobuf.FinderCommentInfo;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.jm0 */
public class C50008jm0 extends C49335eu3 {

    /* renamed from: d */
    public LinkedList<FinderCommentInfo> f136183d = new LinkedList<>();

    /* renamed from: e */
    public FinderObject f136184e;

    /* renamed from: f */
    public C89349b f136185f;

    /* renamed from: g */
    public int f136186g;

    /* renamed from: h */
    public int f136187h;

    /* renamed from: i */
    public int f136188i;

    /* renamed from: j */
    public int f136189j;

    /* renamed from: n */
    public int f136190n;

    /* renamed from: o */
    public LinkedList<FinderCommentInfo> f136191o = new LinkedList<>();

    /* renamed from: p */
    public LinkedList<FinderObject> f136192p = new LinkedList<>();

    /* renamed from: q */
    public C51974xh1 f136193q;

    /* renamed from: r */
    public String f136194r;

    /* renamed from: s */
    public LinkedList<FinderCommentInfo> f136195s = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50008jm0)) {
            return false;
        }
        C50008jm0 jm02 = (C50008jm0) aVar;
        return C46238a.m51546a(this.BaseResponse, jm02.BaseResponse) && C46238a.m51546a(this.f136183d, jm02.f136183d) && C46238a.m51546a(this.f136184e, jm02.f136184e) && C46238a.m51546a(this.f136185f, jm02.f136185f) && C46238a.m51546a(Integer.valueOf(this.f136186g), Integer.valueOf(jm02.f136186g)) && C46238a.m51546a(Integer.valueOf(this.f136187h), Integer.valueOf(jm02.f136187h)) && C46238a.m51546a(Integer.valueOf(this.f136188i), Integer.valueOf(jm02.f136188i)) && C46238a.m51546a(Integer.valueOf(this.f136189j), Integer.valueOf(jm02.f136189j)) && C46238a.m51546a(Integer.valueOf(this.f136190n), Integer.valueOf(jm02.f136190n)) && C46238a.m51546a(this.f136191o, jm02.f136191o) && C46238a.m51546a(this.f136192p, jm02.f136192p) && C46238a.m51546a(this.f136193q, jm02.f136193q) && C46238a.m51546a(this.f136194r, jm02.f136194r) && C46238a.m51546a(this.f136195s, jm02.f136195s);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                aVar.mo74322i(1, jaVar.computeSize());
                this.BaseResponse.writeFields(aVar);
            }
            aVar.mo74320g(2, 8, this.f136183d);
            FinderObject finderObject = this.f136184e;
            if (finderObject != null) {
                aVar.mo74322i(3, finderObject.computeSize());
                this.f136184e.writeFields(aVar);
            }
            C89349b bVar = this.f136185f;
            if (bVar != null) {
                aVar.mo74315b(4, bVar);
            }
            aVar.mo74318e(5, this.f136186g);
            aVar.mo74318e(6, this.f136187h);
            aVar.mo74318e(7, this.f136188i);
            aVar.mo74318e(8, this.f136189j);
            aVar.mo74318e(9, this.f136190n);
            aVar.mo74320g(10, 8, this.f136191o);
            aVar.mo74320g(11, 8, this.f136192p);
            C51974xh1 xh12 = this.f136193q;
            if (xh12 != null) {
                aVar.mo74322i(12, xh12.computeSize());
                this.f136193q.writeFields(aVar);
            }
            String str = this.f136194r;
            if (str != null) {
                aVar.mo74323j(13, str);
            }
            aVar.mo74320g(20, 8, this.f136195s);
            return 0;
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i3 = C52418a.m58682i(1, jaVar2.computeSize()) + 0;
            }
            int g = i3 + C52418a.m58680g(2, 8, this.f136183d);
            FinderObject finderObject2 = this.f136184e;
            if (finderObject2 != null) {
                g += C52418a.m58682i(3, finderObject2.computeSize());
            }
            C89349b bVar2 = this.f136185f;
            if (bVar2 != null) {
                g += C52418a.m58675b(4, bVar2);
            }
            int e = g + C52418a.m58678e(5, this.f136186g) + C52418a.m58678e(6, this.f136187h) + C52418a.m58678e(7, this.f136188i) + C52418a.m58678e(8, this.f136189j) + C52418a.m58678e(9, this.f136190n) + C52418a.m58680g(10, 8, this.f136191o) + C52418a.m58680g(11, 8, this.f136192p);
            C51974xh1 xh13 = this.f136193q;
            if (xh13 != null) {
                e += C52418a.m58682i(12, xh13.computeSize());
            }
            String str2 = this.f136194r;
            if (str2 != null) {
                e += C52418a.m58683j(13, str2);
            }
            return e + C52418a.m58680g(20, 8, this.f136195s);
        } else if (i2 == 2) {
            this.f136183d.clear();
            this.f136191o.clear();
            this.f136192p.clear();
            this.f136195s.clear();
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
            C50008jm0 jm02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue != 20) {
                switch (intValue) {
                    case 1:
                        LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                        int size = j.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            byte[] bArr = j.get(i4);
                            C49966ja jaVar3 = new C49966ja();
                            if (bArr != null && bArr.length > 0) {
                                jaVar3.parseFrom(bArr);
                            }
                            jm02.BaseResponse = jaVar3;
                        }
                        return 0;
                    case 2:
                        LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                        int size2 = j2.size();
                        for (int i5 = 0; i5 < size2; i5++) {
                            byte[] bArr2 = j2.get(i5);
                            FinderCommentInfo finderCommentInfo = new FinderCommentInfo();
                            if (bArr2 != null && bArr2.length > 0) {
                                finderCommentInfo.parseFrom(bArr2);
                            }
                            jm02.f136183d.add(finderCommentInfo);
                        }
                        return 0;
                    case 3:
                        LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                        int size3 = j3.size();
                        for (int i6 = 0; i6 < size3; i6++) {
                            byte[] bArr3 = j3.get(i6);
                            FinderObject finderObject3 = new FinderObject();
                            if (bArr3 != null && bArr3.length > 0) {
                                finderObject3.parseFrom(bArr3);
                            }
                            jm02.f136184e = finderObject3;
                        }
                        return 0;
                    case 4:
                        jm02.f136185f = aVar3.mo141626d(intValue);
                        return 0;
                    case 5:
                        jm02.f136186g = aVar3.mo141629g(intValue);
                        return 0;
                    case 6:
                        jm02.f136187h = aVar3.mo141629g(intValue);
                        return 0;
                    case 7:
                        jm02.f136188i = aVar3.mo141629g(intValue);
                        return 0;
                    case 8:
                        jm02.f136189j = aVar3.mo141629g(intValue);
                        return 0;
                    case 9:
                        jm02.f136190n = aVar3.mo141629g(intValue);
                        return 0;
                    case 10:
                        LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                        int size4 = j4.size();
                        for (int i7 = 0; i7 < size4; i7++) {
                            byte[] bArr4 = j4.get(i7);
                            FinderCommentInfo finderCommentInfo2 = new FinderCommentInfo();
                            if (bArr4 != null && bArr4.length > 0) {
                                finderCommentInfo2.parseFrom(bArr4);
                            }
                            jm02.f136191o.add(finderCommentInfo2);
                        }
                        return 0;
                    case 11:
                        LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                        int size5 = j5.size();
                        for (int i8 = 0; i8 < size5; i8++) {
                            byte[] bArr5 = j5.get(i8);
                            FinderObject finderObject4 = new FinderObject();
                            if (bArr5 != null && bArr5.length > 0) {
                                finderObject4.parseFrom(bArr5);
                            }
                            jm02.f136192p.add(finderObject4);
                        }
                        return 0;
                    case 12:
                        LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                        int size6 = j6.size();
                        for (int i9 = 0; i9 < size6; i9++) {
                            byte[] bArr6 = j6.get(i9);
                            C51974xh1 xh14 = new C51974xh1();
                            if (bArr6 != null && bArr6.length > 0) {
                                xh14.parseFrom(bArr6);
                            }
                            jm02.f136193q = xh14;
                        }
                        return 0;
                    case 13:
                        jm02.f136194r = aVar3.mo141633k(intValue);
                        return 0;
                    default:
                        return -1;
                }
            } else {
                LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                int size7 = j7.size();
                for (int i15 = 0; i15 < size7; i15++) {
                    byte[] bArr7 = j7.get(i15);
                    FinderCommentInfo finderCommentInfo3 = new FinderCommentInfo();
                    if (bArr7 != null && bArr7.length > 0) {
                        finderCommentInfo3.parseFrom(bArr7);
                    }
                    jm02.f136195s.add(finderCommentInfo3);
                }
                return 0;
            }
        }
    }
}
