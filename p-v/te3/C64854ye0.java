package te3;

import com.tencent.p014mm.protocal.protobuf.FinderCommentInfo;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ye0 */
public class C64854ye0 extends C47465a {

    /* renamed from: d */
    public int f186496d;

    /* renamed from: e */
    public FinderCommentInfo f186497e;

    /* renamed from: f */
    public C52155yq2 f186498f;

    /* renamed from: g */
    public C52295zq2 f186499g;

    /* renamed from: h */
    public long f186500h;

    /* renamed from: i */
    public FinderCommentInfo f186501i;

    /* renamed from: j */
    public int f186502j;

    /* renamed from: n */
    public C49712hj1 f186503n;

    /* renamed from: o */
    public int f186504o;

    /* renamed from: p */
    public LinkedList<C64829xh0> f186505p = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64854ye0)) {
            return false;
        }
        C64854ye0 ye02 = (C64854ye0) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f186496d), Integer.valueOf(ye02.f186496d)) && C46238a.m51546a(this.f186497e, ye02.f186497e) && C46238a.m51546a(this.f186498f, ye02.f186498f) && C46238a.m51546a(this.f186499g, ye02.f186499g) && C46238a.m51546a(Long.valueOf(this.f186500h), Long.valueOf(ye02.f186500h)) && C46238a.m51546a(this.f186501i, ye02.f186501i) && C46238a.m51546a(Integer.valueOf(this.f186502j), Integer.valueOf(ye02.f186502j)) && C46238a.m51546a(this.f186503n, ye02.f186503n) && C46238a.m51546a(Integer.valueOf(this.f186504o), Integer.valueOf(ye02.f186504o)) && C46238a.m51546a(this.f186505p, ye02.f186505p);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f186496d);
            FinderCommentInfo finderCommentInfo = this.f186497e;
            if (finderCommentInfo != null) {
                aVar.mo74322i(2, finderCommentInfo.computeSize());
                this.f186497e.writeFields(aVar);
            }
            C52155yq2 yq22 = this.f186498f;
            if (yq22 != null) {
                aVar.mo74322i(3, yq22.computeSize());
                this.f186498f.writeFields(aVar);
            }
            C52295zq2 zq22 = this.f186499g;
            if (zq22 != null) {
                aVar.mo74322i(4, zq22.computeSize());
                this.f186499g.writeFields(aVar);
            }
            aVar.mo74321h(5, this.f186500h);
            FinderCommentInfo finderCommentInfo2 = this.f186501i;
            if (finderCommentInfo2 != null) {
                aVar.mo74322i(6, finderCommentInfo2.computeSize());
                this.f186501i.writeFields(aVar);
            }
            aVar.mo74318e(7, this.f186502j);
            C49712hj1 hj12 = this.f186503n;
            if (hj12 != null) {
                aVar.mo74322i(8, hj12.computeSize());
                this.f186503n.writeFields(aVar);
            }
            aVar.mo74318e(9, this.f186504o);
            aVar.mo74320g(10, 8, this.f186505p);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f186496d) + 0;
            FinderCommentInfo finderCommentInfo3 = this.f186497e;
            if (finderCommentInfo3 != null) {
                e += C52418a.m58682i(2, finderCommentInfo3.computeSize());
            }
            C52155yq2 yq23 = this.f186498f;
            if (yq23 != null) {
                e += C52418a.m58682i(3, yq23.computeSize());
            }
            C52295zq2 zq23 = this.f186499g;
            if (zq23 != null) {
                e += C52418a.m58682i(4, zq23.computeSize());
            }
            int h = e + C52418a.m58681h(5, this.f186500h);
            FinderCommentInfo finderCommentInfo4 = this.f186501i;
            if (finderCommentInfo4 != null) {
                h += C52418a.m58682i(6, finderCommentInfo4.computeSize());
            }
            int e2 = h + C52418a.m58678e(7, this.f186502j);
            C49712hj1 hj13 = this.f186503n;
            if (hj13 != null) {
                e2 += C52418a.m58682i(8, hj13.computeSize());
            }
            return e2 + C52418a.m58678e(9, this.f186504o) + C52418a.m58680g(10, 8, this.f186505p);
        } else if (i == 2) {
            this.f186505p.clear();
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
            C64854ye0 ye02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    ye02.f186496d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        FinderCommentInfo finderCommentInfo5 = new FinderCommentInfo();
                        if (bArr != null && bArr.length > 0) {
                            finderCommentInfo5.parseFrom(bArr);
                        }
                        ye02.f186497e = finderCommentInfo5;
                    }
                    return 0;
                case 3:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        C52155yq2 yq24 = new C52155yq2();
                        if (bArr2 != null && bArr2.length > 0) {
                            yq24.parseFrom(bArr2);
                        }
                        ye02.f186498f = yq24;
                    }
                    return 0;
                case 4:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        byte[] bArr3 = j3.get(i4);
                        C52295zq2 zq24 = new C52295zq2();
                        if (bArr3 != null && bArr3.length > 0) {
                            zq24.parseFrom(bArr3);
                        }
                        ye02.f186499g = zq24;
                    }
                    return 0;
                case 5:
                    ye02.f186500h = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i5 = 0; i5 < size4; i5++) {
                        byte[] bArr4 = j4.get(i5);
                        FinderCommentInfo finderCommentInfo6 = new FinderCommentInfo();
                        if (bArr4 != null && bArr4.length > 0) {
                            finderCommentInfo6.parseFrom(bArr4);
                        }
                        ye02.f186501i = finderCommentInfo6;
                    }
                    return 0;
                case 7:
                    ye02.f186502j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i6 = 0; i6 < size5; i6++) {
                        byte[] bArr5 = j5.get(i6);
                        C49712hj1 hj14 = new C49712hj1();
                        if (bArr5 != null && bArr5.length > 0) {
                            hj14.parseFrom(bArr5);
                        }
                        ye02.f186503n = hj14;
                    }
                    return 0;
                case 9:
                    ye02.f186504o = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i7 = 0; i7 < size6; i7++) {
                        byte[] bArr6 = j6.get(i7);
                        C64829xh0 xh02 = new C64829xh0();
                        if (bArr6 != null && bArr6.length > 0) {
                            xh02.parseFrom(bArr6);
                        }
                        ye02.f186505p.add(xh02);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
