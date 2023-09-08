package te3;

import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.vj0 */
public class C51700vj0 extends C47465a {

    /* renamed from: d */
    public String f143496d;

    /* renamed from: e */
    public C50019jp1 f143497e;

    /* renamed from: f */
    public String f143498f;

    /* renamed from: g */
    public FinderJumpInfo f143499g;

    /* renamed from: h */
    public int f143500h;

    /* renamed from: i */
    public int f143501i;

    /* renamed from: j */
    public String f143502j;

    /* renamed from: n */
    public String f143503n;

    /* renamed from: o */
    public String f143504o;

    /* renamed from: p */
    public String f143505p;

    /* renamed from: q */
    public String f143506q;

    /* renamed from: r */
    public long f143507r;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51700vj0)) {
            return false;
        }
        C51700vj0 vj02 = (C51700vj0) aVar;
        return C46238a.m51546a(this.f143496d, vj02.f143496d) && C46238a.m51546a(this.f143497e, vj02.f143497e) && C46238a.m51546a(this.f143498f, vj02.f143498f) && C46238a.m51546a(this.f143499g, vj02.f143499g) && C46238a.m51546a(Integer.valueOf(this.f143500h), Integer.valueOf(vj02.f143500h)) && C46238a.m51546a(Integer.valueOf(this.f143501i), Integer.valueOf(vj02.f143501i)) && C46238a.m51546a(this.f143502j, vj02.f143502j) && C46238a.m51546a(this.f143503n, vj02.f143503n) && C46238a.m51546a(this.f143504o, vj02.f143504o) && C46238a.m51546a(this.f143505p, vj02.f143505p) && C46238a.m51546a(this.f143506q, vj02.f143506q) && C46238a.m51546a(Long.valueOf(this.f143507r), Long.valueOf(vj02.f143507r));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f143496d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            C50019jp1 jp12 = this.f143497e;
            if (jp12 != null) {
                aVar.mo74322i(2, jp12.computeSize());
                this.f143497e.writeFields(aVar);
            }
            String str2 = this.f143498f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            FinderJumpInfo finderJumpInfo = this.f143499g;
            if (finderJumpInfo != null) {
                aVar.mo74322i(4, finderJumpInfo.computeSize());
                this.f143499g.writeFields(aVar);
            }
            aVar.mo74318e(5, this.f143500h);
            aVar.mo74318e(6, this.f143501i);
            String str3 = this.f143502j;
            if (str3 != null) {
                aVar.mo74323j(7, str3);
            }
            String str4 = this.f143503n;
            if (str4 != null) {
                aVar.mo74323j(8, str4);
            }
            String str5 = this.f143504o;
            if (str5 != null) {
                aVar.mo74323j(9, str5);
            }
            String str6 = this.f143505p;
            if (str6 != null) {
                aVar.mo74323j(10, str6);
            }
            String str7 = this.f143506q;
            if (str7 != null) {
                aVar.mo74323j(11, str7);
            }
            aVar.mo74321h(12, this.f143507r);
            return 0;
        } else if (i == 1) {
            String str8 = this.f143496d;
            if (str8 != null) {
                i2 = 0 + C52418a.m58683j(1, str8);
            }
            C50019jp1 jp13 = this.f143497e;
            if (jp13 != null) {
                i2 += C52418a.m58682i(2, jp13.computeSize());
            }
            String str9 = this.f143498f;
            if (str9 != null) {
                i2 += C52418a.m58683j(3, str9);
            }
            FinderJumpInfo finderJumpInfo2 = this.f143499g;
            if (finderJumpInfo2 != null) {
                i2 += C52418a.m58682i(4, finderJumpInfo2.computeSize());
            }
            int e = i2 + C52418a.m58678e(5, this.f143500h) + C52418a.m58678e(6, this.f143501i);
            String str10 = this.f143502j;
            if (str10 != null) {
                e += C52418a.m58683j(7, str10);
            }
            String str11 = this.f143503n;
            if (str11 != null) {
                e += C52418a.m58683j(8, str11);
            }
            String str12 = this.f143504o;
            if (str12 != null) {
                e += C52418a.m58683j(9, str12);
            }
            String str13 = this.f143505p;
            if (str13 != null) {
                e += C52418a.m58683j(10, str13);
            }
            String str14 = this.f143506q;
            if (str14 != null) {
                e += C52418a.m58683j(11, str14);
            }
            return e + C52418a.m58681h(12, this.f143507r);
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
            C51700vj0 vj02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    vj02.f143496d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C50019jp1 jp14 = new C50019jp1();
                        if (bArr != null && bArr.length > 0) {
                            jp14.parseFrom(bArr);
                        }
                        vj02.f143497e = jp14;
                    }
                    return 0;
                case 3:
                    vj02.f143498f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        FinderJumpInfo finderJumpInfo3 = new FinderJumpInfo();
                        if (bArr2 != null && bArr2.length > 0) {
                            finderJumpInfo3.parseFrom(bArr2);
                        }
                        vj02.f143499g = finderJumpInfo3;
                    }
                    return 0;
                case 5:
                    vj02.f143500h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    vj02.f143501i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    vj02.f143502j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    vj02.f143503n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    vj02.f143504o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    vj02.f143505p = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    vj02.f143506q = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    vj02.f143507r = aVar3.mo141631i(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
