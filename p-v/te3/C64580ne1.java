package te3;

import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ne1 */
public class C64580ne1 extends C47465a {

    /* renamed from: d */
    public String f184466d;

    /* renamed from: e */
    public String f184467e;

    /* renamed from: f */
    public int f184468f;

    /* renamed from: g */
    public String f184469g;

    /* renamed from: h */
    public String f184470h;

    /* renamed from: i */
    public C89349b f184471i;

    /* renamed from: j */
    public String f184472j;

    /* renamed from: n */
    public FinderJumpInfo f184473n;

    /* renamed from: o */
    public int f184474o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64580ne1)) {
            return false;
        }
        C64580ne1 ne12 = (C64580ne1) aVar;
        return C46238a.m51546a(this.f184466d, ne12.f184466d) && C46238a.m51546a(this.f184467e, ne12.f184467e) && C46238a.m51546a(Integer.valueOf(this.f184468f), Integer.valueOf(ne12.f184468f)) && C46238a.m51546a(this.f184469g, ne12.f184469g) && C46238a.m51546a(this.f184470h, ne12.f184470h) && C46238a.m51546a(this.f184471i, ne12.f184471i) && C46238a.m51546a(this.f184472j, ne12.f184472j) && C46238a.m51546a(this.f184473n, ne12.f184473n) && C46238a.m51546a(Integer.valueOf(this.f184474o), Integer.valueOf(ne12.f184474o));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f184466d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f184467e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f184468f);
            String str3 = this.f184469g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f184470h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            C89349b bVar = this.f184471i;
            if (bVar != null) {
                aVar.mo74315b(6, bVar);
            }
            String str5 = this.f184472j;
            if (str5 != null) {
                aVar.mo74323j(7, str5);
            }
            FinderJumpInfo finderJumpInfo = this.f184473n;
            if (finderJumpInfo != null) {
                aVar.mo74322i(8, finderJumpInfo.computeSize());
                this.f184473n.writeFields(aVar);
            }
            aVar.mo74318e(9, this.f184474o);
            return 0;
        } else if (i == 1) {
            String str6 = this.f184466d;
            if (str6 != null) {
                i2 = 0 + C52418a.m58683j(1, str6);
            }
            String str7 = this.f184467e;
            if (str7 != null) {
                i2 += C52418a.m58683j(2, str7);
            }
            int e = i2 + C52418a.m58678e(3, this.f184468f);
            String str8 = this.f184469g;
            if (str8 != null) {
                e += C52418a.m58683j(4, str8);
            }
            String str9 = this.f184470h;
            if (str9 != null) {
                e += C52418a.m58683j(5, str9);
            }
            C89349b bVar2 = this.f184471i;
            if (bVar2 != null) {
                e += C52418a.m58675b(6, bVar2);
            }
            String str10 = this.f184472j;
            if (str10 != null) {
                e += C52418a.m58683j(7, str10);
            }
            FinderJumpInfo finderJumpInfo2 = this.f184473n;
            if (finderJumpInfo2 != null) {
                e += C52418a.m58682i(8, finderJumpInfo2.computeSize());
            }
            return e + C52418a.m58678e(9, this.f184474o);
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
            C64580ne1 ne12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    ne12.f184466d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    ne12.f184467e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    ne12.f184468f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    ne12.f184469g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    ne12.f184470h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    ne12.f184471i = aVar3.mo141626d(intValue);
                    return 0;
                case 7:
                    ne12.f184472j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        FinderJumpInfo finderJumpInfo3 = new FinderJumpInfo();
                        if (bArr != null && bArr.length > 0) {
                            finderJumpInfo3.parseFrom(bArr);
                        }
                        ne12.f184473n = finderJumpInfo3;
                    }
                    return 0;
                case 9:
                    ne12.f184474o = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
