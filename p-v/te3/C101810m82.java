package te3;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.m82 */
public class C101810m82 extends C49335eu3 {

    /* renamed from: d */
    public C101818my3 f298791d;

    /* renamed from: e */
    public C49767hx3 f298792e;

    /* renamed from: f */
    public C101784gx3 f298793f;

    /* renamed from: g */
    public C101837ry3 f298794g;

    /* renamed from: h */
    public C51315sy3 f298795h;

    /* renamed from: i */
    public C101844sx3 f298796i;

    /* renamed from: j */
    public C101847tx3 f298797j;

    /* renamed from: n */
    public C77981px3 f298798n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101810m82)) {
            return false;
        }
        C101810m82 m822 = (C101810m82) aVar;
        return C46238a.m51546a(this.BaseResponse, m822.BaseResponse) && C46238a.m51546a(this.f298791d, m822.f298791d) && C46238a.m51546a(this.f298792e, m822.f298792e) && C46238a.m51546a(this.f298793f, m822.f298793f) && C46238a.m51546a(this.f298794g, m822.f298794g) && C46238a.m51546a(this.f298795h, m822.f298795h) && C46238a.m51546a(this.f298796i, m822.f298796i) && C46238a.m51546a(this.f298797j, m822.f298797j) && C46238a.m51546a(this.f298798n, m822.f298798n);
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
            C101818my3 my32 = this.f298791d;
            if (my32 != null) {
                aVar.mo74322i(2, my32.computeSize());
                this.f298791d.writeFields(aVar);
            }
            C49767hx3 hx32 = this.f298792e;
            if (hx32 != null) {
                aVar.mo74322i(3, hx32.computeSize());
                this.f298792e.writeFields(aVar);
            }
            C101784gx3 gx32 = this.f298793f;
            if (gx32 != null) {
                aVar.mo74322i(4, gx32.computeSize());
                this.f298793f.writeFields(aVar);
            }
            C101837ry3 ry32 = this.f298794g;
            if (ry32 != null) {
                aVar.mo74322i(5, ry32.computeSize());
                this.f298794g.writeFields(aVar);
            }
            C51315sy3 sy32 = this.f298795h;
            if (sy32 != null) {
                aVar.mo74322i(6, sy32.computeSize());
                this.f298795h.writeFields(aVar);
            }
            C101844sx3 sx32 = this.f298796i;
            if (sx32 != null) {
                aVar.mo74322i(7, sx32.computeSize());
                this.f298796i.writeFields(aVar);
            }
            C101847tx3 tx32 = this.f298797j;
            if (tx32 != null) {
                aVar.mo74322i(8, tx32.computeSize());
                this.f298797j.writeFields(aVar);
            }
            C77981px3 px32 = this.f298798n;
            if (px32 != null) {
                aVar.mo74322i(9, px32.computeSize());
                this.f298798n.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            C101818my3 my33 = this.f298791d;
            if (my33 != null) {
                i2 += C52418a.m58682i(2, my33.computeSize());
            }
            C49767hx3 hx33 = this.f298792e;
            if (hx33 != null) {
                i2 += C52418a.m58682i(3, hx33.computeSize());
            }
            C101784gx3 gx33 = this.f298793f;
            if (gx33 != null) {
                i2 += C52418a.m58682i(4, gx33.computeSize());
            }
            C101837ry3 ry33 = this.f298794g;
            if (ry33 != null) {
                i2 += C52418a.m58682i(5, ry33.computeSize());
            }
            C51315sy3 sy33 = this.f298795h;
            if (sy33 != null) {
                i2 += C52418a.m58682i(6, sy33.computeSize());
            }
            C101844sx3 sx33 = this.f298796i;
            if (sx33 != null) {
                i2 += C52418a.m58682i(7, sx33.computeSize());
            }
            C101847tx3 tx33 = this.f298797j;
            if (tx33 != null) {
                i2 += C52418a.m58682i(8, tx33.computeSize());
            }
            C77981px3 px33 = this.f298798n;
            return px33 != null ? i2 + C52418a.m58682i(9, px33.computeSize()) : i2;
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
            C101810m82 m822 = objArr[1];
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
                        m822.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C101818my3 my34 = new C101818my3();
                        if (bArr2 != null && bArr2.length > 0) {
                            my34.parseFrom(bArr2);
                        }
                        m822.f298791d = my34;
                    }
                    return 0;
                case 3:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C49767hx3 hx34 = new C49767hx3();
                        if (bArr3 != null && bArr3.length > 0) {
                            hx34.parseFrom(bArr3);
                        }
                        m822.f298792e = hx34;
                    }
                    return 0;
                case 4:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C101784gx3 gx34 = new C101784gx3();
                        if (bArr4 != null && bArr4.length > 0) {
                            gx34.parseFrom(bArr4);
                        }
                        m822.f298793f = gx34;
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i7 = 0; i7 < size5; i7++) {
                        byte[] bArr5 = j5.get(i7);
                        C101837ry3 ry34 = new C101837ry3();
                        if (bArr5 != null && bArr5.length > 0) {
                            ry34.parseFrom(bArr5);
                        }
                        m822.f298794g = ry34;
                    }
                    return 0;
                case 6:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i8 = 0; i8 < size6; i8++) {
                        byte[] bArr6 = j6.get(i8);
                        C51315sy3 sy34 = new C51315sy3();
                        if (bArr6 != null && bArr6.length > 0) {
                            sy34.parseFrom(bArr6);
                        }
                        m822.f298795h = sy34;
                    }
                    return 0;
                case 7:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i9 = 0; i9 < size7; i9++) {
                        byte[] bArr7 = j7.get(i9);
                        C101844sx3 sx34 = new C101844sx3();
                        if (bArr7 != null && bArr7.length > 0) {
                            sx34.parseFrom(bArr7);
                        }
                        m822.f298796i = sx34;
                    }
                    return 0;
                case 8:
                    LinkedList<byte[]> j8 = aVar3.mo141632j(intValue);
                    int size8 = j8.size();
                    for (int i15 = 0; i15 < size8; i15++) {
                        byte[] bArr8 = j8.get(i15);
                        C101847tx3 tx34 = new C101847tx3();
                        if (bArr8 != null && bArr8.length > 0) {
                            tx34.parseFrom(bArr8);
                        }
                        m822.f298797j = tx34;
                    }
                    return 0;
                case 9:
                    LinkedList<byte[]> j9 = aVar3.mo141632j(intValue);
                    int size9 = j9.size();
                    for (int i16 = 0; i16 < size9; i16++) {
                        byte[] bArr9 = j9.get(i16);
                        C77981px3 px34 = new C77981px3();
                        if (bArr9 != null && bArr9.length > 0) {
                            px34.parseFrom(bArr9);
                        }
                        m822.f298798n = px34;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public JSONObject toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            C49966ja jaVar = this.BaseResponse;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "BaseResponse", jaVar, false);
            aVar.mo71655d(jSONObject, "Context", this.f298791d, false);
            aVar.mo71655d(jSONObject, "BrandFeed", this.f298792e, false);
            aVar.mo71655d(jSONObject, "BrandProfile", this.f298793f, false);
            aVar.mo71655d(jSONObject, "WeappFeed", this.f298794g, false);
            aVar.mo71655d(jSONObject, "WeappProfile", this.f298795h, false);
            aVar.mo71655d(jSONObject, "FinderProfile", this.f298796i, false);
            aVar.mo71655d(jSONObject, "FinderFeed", this.f298797j, false);
            aVar.mo71655d(jSONObject, "Emoticon", this.f298798n, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
