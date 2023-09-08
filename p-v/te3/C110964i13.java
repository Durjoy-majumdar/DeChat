package te3;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.i13 */
public class C110964i13 extends C47465a {

    /* renamed from: d */
    public String f332057d;

    /* renamed from: e */
    public long f332058e;

    /* renamed from: f */
    public String f332059f;

    /* renamed from: g */
    public int f332060g;

    /* renamed from: h */
    public String f332061h;

    /* renamed from: i */
    public C64336e13 f332062i;

    /* renamed from: j */
    public C64272c13 f332063j;

    /* renamed from: n */
    public C27675g13 f332064n;

    /* renamed from: o */
    public C49641h13 f332065o;

    /* renamed from: p */
    public boolean f332066p;

    /* renamed from: q */
    public C110961f13 f332067q;

    /* renamed from: r */
    public C110961f13 f332068r;

    /* renamed from: s */
    public C110961f13 f332069s;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C110964i13)) {
            return false;
        }
        C110964i13 i132 = (C110964i13) aVar;
        return C46238a.m51546a(this.f332057d, i132.f332057d) && C46238a.m51546a(Long.valueOf(this.f332058e), Long.valueOf(i132.f332058e)) && C46238a.m51546a(this.f332059f, i132.f332059f) && C46238a.m51546a(Integer.valueOf(this.f332060g), Integer.valueOf(i132.f332060g)) && C46238a.m51546a(this.f332061h, i132.f332061h) && C46238a.m51546a(this.f332062i, i132.f332062i) && C46238a.m51546a(this.f332063j, i132.f332063j) && C46238a.m51546a(this.f332064n, i132.f332064n) && C46238a.m51546a(this.f332065o, i132.f332065o) && C46238a.m51546a(Boolean.valueOf(this.f332066p), Boolean.valueOf(i132.f332066p)) && C46238a.m51546a(this.f332067q, i132.f332067q) && C46238a.m51546a(this.f332068r, i132.f332068r) && C46238a.m51546a(this.f332069s, i132.f332069s);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f332057d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74321h(2, this.f332058e);
            String str2 = this.f332059f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74318e(4, this.f332060g);
            String str3 = this.f332061h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            C64336e13 e132 = this.f332062i;
            if (e132 != null) {
                aVar.mo74322i(6, e132.computeSize());
                this.f332062i.writeFields(aVar);
            }
            C64272c13 c132 = this.f332063j;
            if (c132 != null) {
                aVar.mo74322i(7, c132.computeSize());
                this.f332063j.writeFields(aVar);
            }
            C27675g13 g132 = this.f332064n;
            if (g132 != null) {
                aVar.mo74322i(8, g132.computeSize());
                this.f332064n.writeFields(aVar);
            }
            C49641h13 h132 = this.f332065o;
            if (h132 != null) {
                aVar.mo74322i(9, h132.computeSize());
                this.f332065o.writeFields(aVar);
            }
            aVar.mo74314a(10, this.f332066p);
            C110961f13 f132 = this.f332067q;
            if (f132 != null) {
                aVar.mo74322i(11, f132.computeSize());
                this.f332067q.writeFields(aVar);
            }
            C110961f13 f133 = this.f332068r;
            if (f133 != null) {
                aVar.mo74322i(12, f133.computeSize());
                this.f332068r.writeFields(aVar);
            }
            C110961f13 f134 = this.f332069s;
            if (f134 == null) {
                return 0;
            }
            aVar.mo74322i(13, f134.computeSize());
            this.f332069s.writeFields(aVar);
            return 0;
        } else if (i2 == 1) {
            String str4 = this.f332057d;
            int j = (str4 != null ? 0 + C52418a.m58683j(1, str4) : 0) + C52418a.m58681h(2, this.f332058e);
            String str5 = this.f332059f;
            if (str5 != null) {
                j += C52418a.m58683j(3, str5);
            }
            int e = j + C52418a.m58678e(4, this.f332060g);
            String str6 = this.f332061h;
            if (str6 != null) {
                e += C52418a.m58683j(5, str6);
            }
            C64336e13 e133 = this.f332062i;
            if (e133 != null) {
                e += C52418a.m58682i(6, e133.computeSize());
            }
            C64272c13 c133 = this.f332063j;
            if (c133 != null) {
                e += C52418a.m58682i(7, c133.computeSize());
            }
            C27675g13 g133 = this.f332064n;
            if (g133 != null) {
                e += C52418a.m58682i(8, g133.computeSize());
            }
            C49641h13 h133 = this.f332065o;
            if (h133 != null) {
                e += C52418a.m58682i(9, h133.computeSize());
            }
            int a = e + C52418a.m58674a(10, this.f332066p);
            C110961f13 f135 = this.f332067q;
            if (f135 != null) {
                a += C52418a.m58682i(11, f135.computeSize());
            }
            C110961f13 f136 = this.f332068r;
            if (f136 != null) {
                a += C52418a.m58682i(12, f136.computeSize());
            }
            C110961f13 f137 = this.f332069s;
            return f137 != null ? a + C52418a.m58682i(13, f137.computeSize()) : a;
        } else if (i2 == 2) {
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
            C110964i13 i132 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    i132.f332057d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    i132.f332058e = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    i132.f332059f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    i132.f332060g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    i132.f332061h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size = j2.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j2.get(i3);
                        C64336e13 e134 = new C64336e13();
                        if (bArr != null && bArr.length > 0) {
                            e134.parseFrom(bArr);
                        }
                        i132.f332062i = e134;
                    }
                    return 0;
                case 7:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size2 = j3.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j3.get(i4);
                        C64272c13 c134 = new C64272c13();
                        if (bArr2 != null && bArr2.length > 0) {
                            c134.parseFrom(bArr2);
                        }
                        i132.f332063j = c134;
                    }
                    return 0;
                case 8:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size3 = j4.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j4.get(i5);
                        C27675g13 g134 = new C27675g13();
                        if (bArr3 != null && bArr3.length > 0) {
                            g134.parseFrom(bArr3);
                        }
                        i132.f332064n = g134;
                    }
                    return 0;
                case 9:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size4 = j5.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j5.get(i6);
                        C49641h13 h134 = new C49641h13();
                        if (bArr4 != null && bArr4.length > 0) {
                            h134.parseFrom(bArr4);
                        }
                        i132.f332065o = h134;
                    }
                    return 0;
                case 10:
                    i132.f332066p = aVar3.mo141625c(intValue);
                    return 0;
                case 11:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size5 = j6.size();
                    for (int i7 = 0; i7 < size5; i7++) {
                        byte[] bArr5 = j6.get(i7);
                        C110961f13 f138 = new C110961f13();
                        if (bArr5 != null && bArr5.length > 0) {
                            f138.parseFrom(bArr5);
                        }
                        i132.f332067q = f138;
                    }
                    return 0;
                case 12:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size6 = j7.size();
                    for (int i8 = 0; i8 < size6; i8++) {
                        byte[] bArr6 = j7.get(i8);
                        C110961f13 f139 = new C110961f13();
                        if (bArr6 != null && bArr6.length > 0) {
                            f139.parseFrom(bArr6);
                        }
                        i132.f332068r = f139;
                    }
                    return 0;
                case 13:
                    LinkedList<byte[]> j8 = aVar3.mo141632j(intValue);
                    int size7 = j8.size();
                    for (int i9 = 0; i9 < size7; i9++) {
                        byte[] bArr7 = j8.get(i9);
                        C110961f13 f1310 = new C110961f13();
                        if (bArr7 != null && bArr7.length > 0) {
                            f1310.parseFrom(bArr7);
                        }
                        i132.f332069s = f1310;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f332057d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "contextId", str, false);
            aVar.mo71655d(jSONObject, "enterTimestamp", Long.valueOf(this.f332058e), false);
            aVar.mo71655d(jSONObject, "itemId", this.f332059f, false);
            aVar.mo71655d(jSONObject, "itemType", Integer.valueOf(this.f332060g), false);
            aVar.mo71655d(jSONObject, "itemSubId", this.f332061h, false);
            aVar.mo71655d(jSONObject, "browseReportData", this.f332062i, false);
            aVar.mo71655d(jSONObject, "addReportData", this.f332063j, false);
            aVar.mo71655d(jSONObject, "pageActionData", this.f332064n, false);
            aVar.mo71655d(jSONObject, "performanceData", this.f332065o, false);
            aVar.mo71655d(jSONObject, "isEnterChatting", Boolean.valueOf(this.f332066p), false);
            aVar.mo71655d(jSONObject, "eduAddReportData", this.f332067q, false);
            aVar.mo71655d(jSONObject, "eduEnterReportData", this.f332068r, false);
            aVar.mo71655d(jSONObject, "eduListReportData", this.f332069s, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
