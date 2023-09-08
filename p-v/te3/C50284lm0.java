package te3;

import com.tencent.p014mm.protocal.protobuf.FinderCommentInfo;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.lm0 */
public class C50284lm0 extends C49335eu3 {

    /* renamed from: d */
    public LinkedList<FinderCommentInfo> f137512d = new LinkedList<>();

    /* renamed from: e */
    public C52104ye1 f137513e;

    /* renamed from: f */
    public C89349b f137514f;

    /* renamed from: g */
    public int f137515g;

    /* renamed from: h */
    public int f137516h;

    /* renamed from: i */
    public FinderCommentInfo f137517i;

    /* renamed from: j */
    public C50953qf1 f137518j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50284lm0)) {
            return false;
        }
        C50284lm0 lm02 = (C50284lm0) aVar;
        return C46238a.m51546a(this.BaseResponse, lm02.BaseResponse) && C46238a.m51546a(this.f137512d, lm02.f137512d) && C46238a.m51546a(this.f137513e, lm02.f137513e) && C46238a.m51546a(this.f137514f, lm02.f137514f) && C46238a.m51546a(Integer.valueOf(this.f137515g), Integer.valueOf(lm02.f137515g)) && C46238a.m51546a(Integer.valueOf(this.f137516h), Integer.valueOf(lm02.f137516h)) && C46238a.m51546a(this.f137517i, lm02.f137517i) && C46238a.m51546a(this.f137518j, lm02.f137518j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                aVar.mo74322i(1, jaVar.computeSize());
                this.BaseResponse.writeFields(aVar);
            }
            aVar.mo74320g(2, 8, this.f137512d);
            C52104ye1 ye12 = this.f137513e;
            if (ye12 != null) {
                aVar.mo74322i(3, ye12.computeSize());
                this.f137513e.writeFields(aVar);
            }
            C89349b bVar = this.f137514f;
            if (bVar != null) {
                aVar.mo74315b(4, bVar);
            }
            aVar.mo74318e(5, this.f137515g);
            aVar.mo74318e(6, this.f137516h);
            FinderCommentInfo finderCommentInfo = this.f137517i;
            if (finderCommentInfo != null) {
                aVar.mo74322i(7, finderCommentInfo.computeSize());
                this.f137517i.writeFields(aVar);
            }
            C50953qf1 qf12 = this.f137518j;
            if (qf12 != null) {
                aVar.mo74322i(8, qf12.computeSize());
                this.f137518j.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f137512d);
            C52104ye1 ye13 = this.f137513e;
            if (ye13 != null) {
                g += C52418a.m58682i(3, ye13.computeSize());
            }
            C89349b bVar2 = this.f137514f;
            if (bVar2 != null) {
                g += C52418a.m58675b(4, bVar2);
            }
            int e = g + C52418a.m58678e(5, this.f137515g) + C52418a.m58678e(6, this.f137516h);
            FinderCommentInfo finderCommentInfo2 = this.f137517i;
            if (finderCommentInfo2 != null) {
                e += C52418a.m58682i(7, finderCommentInfo2.computeSize());
            }
            C50953qf1 qf13 = this.f137518j;
            return qf13 != null ? e + C52418a.m58682i(8, qf13.computeSize()) : e;
        } else if (i == 2) {
            this.f137512d.clear();
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
            C50284lm0 lm02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C49966ja jaVar3 = new C49966ja();
                        if (bArr != null && bArr.length > 0) {
                            jaVar3.parseFrom(bArr);
                        }
                        lm02.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        FinderCommentInfo finderCommentInfo3 = new FinderCommentInfo();
                        if (bArr2 != null && bArr2.length > 0) {
                            finderCommentInfo3.parseFrom(bArr2);
                        }
                        lm02.f137512d.add(finderCommentInfo3);
                    }
                    return 0;
                case 3:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C52104ye1 ye14 = new C52104ye1();
                        if (bArr3 != null && bArr3.length > 0) {
                            ye14.parseFrom(bArr3);
                        }
                        lm02.f137513e = ye14;
                    }
                    return 0;
                case 4:
                    lm02.f137514f = aVar3.mo141626d(intValue);
                    return 0;
                case 5:
                    lm02.f137515g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    lm02.f137516h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        FinderCommentInfo finderCommentInfo4 = new FinderCommentInfo();
                        if (bArr4 != null && bArr4.length > 0) {
                            finderCommentInfo4.parseFrom(bArr4);
                        }
                        lm02.f137517i = finderCommentInfo4;
                    }
                    return 0;
                case 8:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i7 = 0; i7 < size5; i7++) {
                        byte[] bArr5 = j5.get(i7);
                        C50953qf1 qf14 = new C50953qf1();
                        if (bArr5 != null && bArr5.length > 0) {
                            qf14.parseFrom(bArr5);
                        }
                        lm02.f137518j = qf14;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
