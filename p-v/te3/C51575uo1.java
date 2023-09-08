package te3;

import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.uo1 */
public class C51575uo1 extends C47465a {

    /* renamed from: d */
    public String f142978d;

    /* renamed from: e */
    public int f142979e;

    /* renamed from: f */
    public String f142980f;

    /* renamed from: g */
    public String f142981g;

    /* renamed from: h */
    public int f142982h;

    /* renamed from: i */
    public FinderJumpInfo f142983i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51575uo1)) {
            return false;
        }
        C51575uo1 uo12 = (C51575uo1) aVar;
        return C46238a.m51546a(this.f142978d, uo12.f142978d) && C46238a.m51546a(Integer.valueOf(this.f142979e), Integer.valueOf(uo12.f142979e)) && C46238a.m51546a(this.f142980f, uo12.f142980f) && C46238a.m51546a(this.f142981g, uo12.f142981g) && C46238a.m51546a(Integer.valueOf(this.f142982h), Integer.valueOf(uo12.f142982h)) && C46238a.m51546a(this.f142983i, uo12.f142983i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f142978d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f142979e);
            String str2 = this.f142980f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f142981g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            aVar.mo74318e(5, this.f142982h);
            FinderJumpInfo finderJumpInfo = this.f142983i;
            if (finderJumpInfo != null) {
                aVar.mo74322i(6, finderJumpInfo.computeSize());
                this.f142983i.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            String str4 = this.f142978d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            int e = i2 + C52418a.m58678e(2, this.f142979e);
            String str5 = this.f142980f;
            if (str5 != null) {
                e += C52418a.m58683j(3, str5);
            }
            String str6 = this.f142981g;
            if (str6 != null) {
                e += C52418a.m58683j(4, str6);
            }
            int e2 = e + C52418a.m58678e(5, this.f142982h);
            FinderJumpInfo finderJumpInfo2 = this.f142983i;
            return finderJumpInfo2 != null ? e2 + C52418a.m58682i(6, finderJumpInfo2.computeSize()) : e2;
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
            C51575uo1 uo12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    uo12.f142978d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    uo12.f142979e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    uo12.f142980f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    uo12.f142981g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    uo12.f142982h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        FinderJumpInfo finderJumpInfo3 = new FinderJumpInfo();
                        if (bArr != null && bArr.length > 0) {
                            finderJumpInfo3.parseFrom(bArr);
                        }
                        uo12.f142983i = finderJumpInfo3;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
