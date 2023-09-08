package te3;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.gd */
public class C77934gd extends C49335eu3 {

    /* renamed from: A */
    public String f227436A;

    /* renamed from: B */
    public int f227437B;

    /* renamed from: C */
    public C64305d33 f227438C;

    /* renamed from: D */
    public String f227439D;

    /* renamed from: E */
    public int f227440E;

    /* renamed from: d */
    public String f227441d;

    /* renamed from: e */
    public String f227442e;

    /* renamed from: f */
    public int f227443f;

    /* renamed from: g */
    public String f227444g;

    /* renamed from: h */
    public String f227445h;

    /* renamed from: i */
    public C52114yg2 f227446i;

    /* renamed from: j */
    public C50270lj f227447j;

    /* renamed from: n */
    public C49227e33 f227448n;

    /* renamed from: o */
    public String f227449o;

    /* renamed from: p */
    public int f227450p;

    /* renamed from: q */
    public String f227451q;

    /* renamed from: r */
    public int f227452r;

    /* renamed from: s */
    public C51604uv3 f227453s;

    /* renamed from: t */
    public String f227454t;

    /* renamed from: u */
    public String f227455u;

    /* renamed from: v */
    public d54 f227456v;

    /* renamed from: w */
    public int f227457w;

    /* renamed from: x */
    public String f227458x;

    /* renamed from: y */
    public String f227459y;

    /* renamed from: z */
    public int f227460z;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77934gd)) {
            return false;
        }
        C77934gd gdVar = (C77934gd) aVar;
        return C46238a.m51546a(this.BaseResponse, gdVar.BaseResponse) && C46238a.m51546a(this.f227441d, gdVar.f227441d) && C46238a.m51546a(this.f227442e, gdVar.f227442e) && C46238a.m51546a(Integer.valueOf(this.f227443f), Integer.valueOf(gdVar.f227443f)) && C46238a.m51546a(this.f227444g, gdVar.f227444g) && C46238a.m51546a(this.f227445h, gdVar.f227445h) && C46238a.m51546a(this.f227446i, gdVar.f227446i) && C46238a.m51546a(this.f227447j, gdVar.f227447j) && C46238a.m51546a(this.f227448n, gdVar.f227448n) && C46238a.m51546a(this.f227449o, gdVar.f227449o) && C46238a.m51546a(Integer.valueOf(this.f227450p), Integer.valueOf(gdVar.f227450p)) && C46238a.m51546a(this.f227451q, gdVar.f227451q) && C46238a.m51546a(Integer.valueOf(this.f227452r), Integer.valueOf(gdVar.f227452r)) && C46238a.m51546a(this.f227453s, gdVar.f227453s) && C46238a.m51546a(this.f227454t, gdVar.f227454t) && C46238a.m51546a(this.f227455u, gdVar.f227455u) && C46238a.m51546a(this.f227456v, gdVar.f227456v) && C46238a.m51546a(Integer.valueOf(this.f227457w), Integer.valueOf(gdVar.f227457w)) && C46238a.m51546a(this.f227458x, gdVar.f227458x) && C46238a.m51546a(this.f227459y, gdVar.f227459y) && C46238a.m51546a(Integer.valueOf(this.f227460z), Integer.valueOf(gdVar.f227460z)) && C46238a.m51546a(this.f227436A, gdVar.f227436A) && C46238a.m51546a(Integer.valueOf(this.f227437B), Integer.valueOf(gdVar.f227437B)) && C46238a.m51546a(this.f227438C, gdVar.f227438C) && C46238a.m51546a(this.f227439D, gdVar.f227439D) && C46238a.m51546a(Integer.valueOf(this.f227440E), Integer.valueOf(gdVar.f227440E));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                String str = this.f227441d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                String str2 = this.f227442e;
                if (str2 != null) {
                    aVar.mo74323j(3, str2);
                }
                aVar.mo74318e(4, this.f227443f);
                String str3 = this.f227444g;
                if (str3 != null) {
                    aVar.mo74323j(5, str3);
                }
                String str4 = this.f227445h;
                if (str4 != null) {
                    aVar.mo74323j(6, str4);
                }
                C52114yg2 yg22 = this.f227446i;
                if (yg22 != null) {
                    aVar.mo74322i(7, yg22.computeSize());
                    this.f227446i.writeFields(aVar);
                }
                C50270lj ljVar = this.f227447j;
                if (ljVar != null) {
                    aVar.mo74322i(8, ljVar.computeSize());
                    this.f227447j.writeFields(aVar);
                }
                C49227e33 e332 = this.f227448n;
                if (e332 != null) {
                    aVar.mo74322i(9, e332.computeSize());
                    this.f227448n.writeFields(aVar);
                }
                String str5 = this.f227449o;
                if (str5 != null) {
                    aVar.mo74323j(10, str5);
                }
                aVar.mo74318e(11, this.f227450p);
                String str6 = this.f227451q;
                if (str6 != null) {
                    aVar.mo74323j(12, str6);
                }
                aVar.mo74318e(13, this.f227452r);
                C51604uv3 uv32 = this.f227453s;
                if (uv32 != null) {
                    aVar.mo74322i(14, uv32.computeSize());
                    this.f227453s.writeFields(aVar);
                }
                String str7 = this.f227454t;
                if (str7 != null) {
                    aVar.mo74323j(15, str7);
                }
                String str8 = this.f227455u;
                if (str8 != null) {
                    aVar.mo74323j(16, str8);
                }
                d54 d54 = this.f227456v;
                if (d54 != null) {
                    aVar.mo74322i(17, d54.computeSize());
                    this.f227456v.writeFields(aVar);
                }
                aVar.mo74318e(18, this.f227457w);
                String str9 = this.f227458x;
                if (str9 != null) {
                    aVar.mo74323j(19, str9);
                }
                String str10 = this.f227459y;
                if (str10 != null) {
                    aVar.mo74323j(20, str10);
                }
                aVar.mo74318e(21, this.f227460z);
                String str11 = this.f227436A;
                if (str11 != null) {
                    aVar.mo74323j(22, str11);
                }
                aVar.mo74318e(23, this.f227437B);
                C64305d33 d332 = this.f227438C;
                if (d332 != null) {
                    aVar.mo74322i(24, d332.computeSize());
                    this.f227438C.writeFields(aVar);
                }
                String str12 = this.f227439D;
                if (str12 != null) {
                    aVar.mo74323j(26, str12);
                }
                aVar.mo74318e(27, this.f227440E);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i3 = C52418a.m58682i(1, jaVar2.computeSize()) + 0;
            }
            String str13 = this.f227441d;
            if (str13 != null) {
                i3 += C52418a.m58683j(2, str13);
            }
            String str14 = this.f227442e;
            if (str14 != null) {
                i3 += C52418a.m58683j(3, str14);
            }
            int e = i3 + C52418a.m58678e(4, this.f227443f);
            String str15 = this.f227444g;
            if (str15 != null) {
                e += C52418a.m58683j(5, str15);
            }
            String str16 = this.f227445h;
            if (str16 != null) {
                e += C52418a.m58683j(6, str16);
            }
            C52114yg2 yg23 = this.f227446i;
            if (yg23 != null) {
                e += C52418a.m58682i(7, yg23.computeSize());
            }
            C50270lj ljVar2 = this.f227447j;
            if (ljVar2 != null) {
                e += C52418a.m58682i(8, ljVar2.computeSize());
            }
            C49227e33 e333 = this.f227448n;
            if (e333 != null) {
                e += C52418a.m58682i(9, e333.computeSize());
            }
            String str17 = this.f227449o;
            if (str17 != null) {
                e += C52418a.m58683j(10, str17);
            }
            int e2 = e + C52418a.m58678e(11, this.f227450p);
            String str18 = this.f227451q;
            if (str18 != null) {
                e2 += C52418a.m58683j(12, str18);
            }
            int e3 = e2 + C52418a.m58678e(13, this.f227452r);
            C51604uv3 uv33 = this.f227453s;
            if (uv33 != null) {
                e3 += C52418a.m58682i(14, uv33.computeSize());
            }
            String str19 = this.f227454t;
            if (str19 != null) {
                e3 += C52418a.m58683j(15, str19);
            }
            String str20 = this.f227455u;
            if (str20 != null) {
                e3 += C52418a.m58683j(16, str20);
            }
            d54 d542 = this.f227456v;
            if (d542 != null) {
                e3 += C52418a.m58682i(17, d542.computeSize());
            }
            int e4 = e3 + C52418a.m58678e(18, this.f227457w);
            String str21 = this.f227458x;
            if (str21 != null) {
                e4 += C52418a.m58683j(19, str21);
            }
            String str22 = this.f227459y;
            if (str22 != null) {
                e4 += C52418a.m58683j(20, str22);
            }
            int e5 = e4 + C52418a.m58678e(21, this.f227460z);
            String str23 = this.f227436A;
            if (str23 != null) {
                e5 += C52418a.m58683j(22, str23);
            }
            int e6 = e5 + C52418a.m58678e(23, this.f227437B);
            C64305d33 d333 = this.f227438C;
            if (d333 != null) {
                e6 += C52418a.m58682i(24, d333.computeSize());
            }
            String str24 = this.f227439D;
            if (str24 != null) {
                e6 += C52418a.m58683j(26, str24);
            }
            return e6 + C52418a.m58678e(27, this.f227440E);
        } else if (i2 == 2) {
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
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C77934gd gdVar = objArr[1];
            int intValue = objArr[2].intValue();
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
                        gdVar.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    gdVar.f227441d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    gdVar.f227442e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    gdVar.f227443f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    gdVar.f227444g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    gdVar.f227445h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C52114yg2 yg24 = new C52114yg2();
                        if (bArr2 != null && bArr2.length > 0) {
                            yg24.parseFrom(bArr2);
                        }
                        gdVar.f227446i = yg24;
                    }
                    return 0;
                case 8:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C50270lj ljVar3 = new C50270lj();
                        if (bArr3 != null && bArr3.length > 0) {
                            ljVar3.parseFrom(bArr3);
                        }
                        gdVar.f227447j = ljVar3;
                    }
                    return 0;
                case 9:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C49227e33 e334 = new C49227e33();
                        if (bArr4 != null && bArr4.length > 0) {
                            e334.parseFrom(bArr4);
                        }
                        gdVar.f227448n = e334;
                    }
                    return 0;
                case 10:
                    gdVar.f227449o = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    gdVar.f227450p = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    gdVar.f227451q = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    gdVar.f227452r = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        C51604uv3 uv34 = new C51604uv3();
                        if (bArr5 != null && bArr5.length > 0) {
                            uv34.parseFrom(bArr5);
                        }
                        gdVar.f227453s = uv34;
                    }
                    return 0;
                case 15:
                    gdVar.f227454t = aVar3.mo141633k(intValue);
                    return 0;
                case 16:
                    gdVar.f227455u = aVar3.mo141633k(intValue);
                    return 0;
                case 17:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i9 = 0; i9 < size6; i9++) {
                        byte[] bArr6 = j6.get(i9);
                        d54 d543 = new d54();
                        if (bArr6 != null && bArr6.length > 0) {
                            d543.parseFrom(bArr6);
                        }
                        gdVar.f227456v = d543;
                    }
                    return 0;
                case 18:
                    gdVar.f227457w = aVar3.mo141629g(intValue);
                    return 0;
                case 19:
                    gdVar.f227458x = aVar3.mo141633k(intValue);
                    return 0;
                case 20:
                    gdVar.f227459y = aVar3.mo141633k(intValue);
                    return 0;
                case 21:
                    gdVar.f227460z = aVar3.mo141629g(intValue);
                    return 0;
                case 22:
                    gdVar.f227436A = aVar3.mo141633k(intValue);
                    return 0;
                case 23:
                    gdVar.f227437B = aVar3.mo141629g(intValue);
                    return 0;
                case 24:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i15 = 0; i15 < size7; i15++) {
                        byte[] bArr7 = j7.get(i15);
                        C64305d33 d334 = new C64305d33();
                        if (bArr7 != null && bArr7.length > 0) {
                            d334.parseFrom(bArr7);
                        }
                        gdVar.f227438C = d334;
                    }
                    return 0;
                case 26:
                    gdVar.f227439D = aVar3.mo141633k(intValue);
                    return 0;
                case 27:
                    gdVar.f227440E = aVar3.mo141629g(intValue);
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
            aVar.mo71655d(jSONObject, "ticket", this.f227441d, false);
            aVar.mo71655d(jSONObject, "SmsNo", this.f227442e, false);
            aVar.mo71655d(jSONObject, "NeedSetPwd", Integer.valueOf(this.f227443f), false);
            aVar.mo71655d(jSONObject, "Pwd", this.f227444g, false);
            aVar.mo71655d(jSONObject, "Username", this.f227445h, false);
            aVar.mo71655d(jSONObject, "NewHostList", this.f227446i, false);
            aVar.mo71655d(jSONObject, "BuiltinIPList", this.f227447j, false);
            aVar.mo71655d(jSONObject, "NetworkControl", this.f227448n, false);
            aVar.mo71655d(jSONObject, "AuthTicket", this.f227449o, false);
            aVar.mo71655d(jSONObject, "SafeDevice", Integer.valueOf(this.f227450p), false);
            aVar.mo71655d(jSONObject, "CC", this.f227451q, false);
            aVar.mo71655d(jSONObject, "ObsoleteItem1", Integer.valueOf(this.f227452r), false);
            aVar.mo71655d(jSONObject, "SafeDeviceList", this.f227453s, false);
            aVar.mo71655d(jSONObject, "PureMobile", this.f227454t, false);
            aVar.mo71655d(jSONObject, "FormatedMobile", this.f227455u, false);
            aVar.mo71655d(jSONObject, "ShowStyle", this.f227456v, false);
            aVar.mo71655d(jSONObject, "MmtlsControlBitFlag", Integer.valueOf(this.f227457w), false);
            aVar.mo71655d(jSONObject, "SmsUpCode", this.f227458x, false);
            aVar.mo71655d(jSONObject, "SmsUpMobile", this.f227459y, false);
            aVar.mo71655d(jSONObject, "MobileCheckType", Integer.valueOf(this.f227460z), false);
            aVar.mo71655d(jSONObject, "RegSessionId", this.f227436A, false);
            aVar.mo71655d(jSONObject, "Restart", Integer.valueOf(this.f227437B), false);
            aVar.mo71655d(jSONObject, "networkCheckExtInfo", this.f227438C, false);
            aVar.mo71655d(jSONObject, "VerifyTicket", this.f227439D, false);
            aVar.mo71655d(jSONObject, "NeedDoPostCheck", Integer.valueOf(this.f227440E), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
