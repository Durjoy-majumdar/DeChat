package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.tk3 */
public class C51409tk3 extends C49335eu3 {

    /* renamed from: d */
    public int f142258d;

    /* renamed from: e */
    public String f142259e;

    /* renamed from: f */
    public C51105rg2 f142260f;

    /* renamed from: g */
    public String f142261g;

    /* renamed from: h */
    public String f142262h;

    /* renamed from: i */
    public C52131yl f142263i;

    /* renamed from: j */
    public C77933g43 f142264j;

    /* renamed from: n */
    public boolean f142265n;

    /* renamed from: o */
    public C50399mg2 f142266o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51409tk3)) {
            return false;
        }
        C51409tk3 tk32 = (C51409tk3) aVar;
        return C46238a.m51546a(this.BaseResponse, tk32.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f142258d), Integer.valueOf(tk32.f142258d)) && C46238a.m51546a(this.f142259e, tk32.f142259e) && C46238a.m51546a(this.f142260f, tk32.f142260f) && C46238a.m51546a(this.f142261g, tk32.f142261g) && C46238a.m51546a(this.f142262h, tk32.f142262h) && C46238a.m51546a(this.f142263i, tk32.f142263i) && C46238a.m51546a(this.f142264j, tk32.f142264j) && C46238a.m51546a(Boolean.valueOf(this.f142265n), Boolean.valueOf(tk32.f142265n)) && C46238a.m51546a(this.f142266o, tk32.f142266o);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                aVar.mo74318e(2, this.f142258d);
                String str = this.f142259e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                C51105rg2 rg22 = this.f142260f;
                if (rg22 != null) {
                    aVar.mo74322i(4, rg22.computeSize());
                    this.f142260f.writeFields(aVar);
                }
                String str2 = this.f142261g;
                if (str2 != null) {
                    aVar.mo74323j(5, str2);
                }
                String str3 = this.f142262h;
                if (str3 != null) {
                    aVar.mo74323j(6, str3);
                }
                C52131yl ylVar = this.f142263i;
                if (ylVar != null) {
                    aVar.mo74322i(7, ylVar.computeSize());
                    this.f142263i.writeFields(aVar);
                }
                C77933g43 g432 = this.f142264j;
                if (g432 != null) {
                    aVar.mo74322i(8, g432.computeSize());
                    this.f142264j.writeFields(aVar);
                }
                aVar.mo74314a(9, this.f142265n);
                C50399mg2 mg22 = this.f142266o;
                if (mg22 != null) {
                    aVar.mo74322i(10, mg22.computeSize());
                    this.f142266o.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f142258d);
            String str4 = this.f142259e;
            if (str4 != null) {
                e += C52418a.m58683j(3, str4);
            }
            C51105rg2 rg23 = this.f142260f;
            if (rg23 != null) {
                e += C52418a.m58682i(4, rg23.computeSize());
            }
            String str5 = this.f142261g;
            if (str5 != null) {
                e += C52418a.m58683j(5, str5);
            }
            String str6 = this.f142262h;
            if (str6 != null) {
                e += C52418a.m58683j(6, str6);
            }
            C52131yl ylVar2 = this.f142263i;
            if (ylVar2 != null) {
                e += C52418a.m58682i(7, ylVar2.computeSize());
            }
            C77933g43 g433 = this.f142264j;
            if (g433 != null) {
                e += C52418a.m58682i(8, g433.computeSize());
            }
            int a = e + C52418a.m58674a(9, this.f142265n);
            C50399mg2 mg23 = this.f142266o;
            return mg23 != null ? a + C52418a.m58682i(10, mg23.computeSize()) : a;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C51409tk3 tk32 = objArr[1];
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
                        tk32.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    tk32.f142258d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    tk32.f142259e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C51105rg2 rg24 = new C51105rg2();
                        if (bArr2 != null && bArr2.length > 0) {
                            rg24.parseFrom(bArr2);
                        }
                        tk32.f142260f = rg24;
                    }
                    return 0;
                case 5:
                    tk32.f142261g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    tk32.f142262h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C52131yl ylVar3 = new C52131yl();
                        if (bArr3 != null && bArr3.length > 0) {
                            ylVar3.parseFrom(bArr3);
                        }
                        tk32.f142263i = ylVar3;
                    }
                    return 0;
                case 8:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C77933g43 g434 = new C77933g43();
                        if (bArr4 != null && bArr4.length > 0) {
                            g434.parseFrom(bArr4);
                        }
                        tk32.f142264j = g434;
                    }
                    return 0;
                case 9:
                    tk32.f142265n = aVar3.mo141625c(intValue);
                    return 0;
                case 10:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i7 = 0; i7 < size5; i7++) {
                        byte[] bArr5 = j5.get(i7);
                        C50399mg2 mg24 = new C50399mg2();
                        if (bArr5 != null && bArr5.length > 0) {
                            mg24.parseFrom(bArr5);
                        }
                        tk32.f142266o = mg24;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
