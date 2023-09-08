package te3;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.hy3 */
public class C49772hy3 extends C47465a {

    /* renamed from: d */
    public C51163rv3 f134960d;

    /* renamed from: e */
    public C51163rv3 f134961e;

    /* renamed from: f */
    public int f134962f;

    /* renamed from: g */
    public String f134963g;

    /* renamed from: h */
    public String f134964h;

    /* renamed from: i */
    public String f134965i;

    /* renamed from: j */
    public int f134966j;

    /* renamed from: n */
    public int f134967n;

    /* renamed from: o */
    public String f134968o;

    /* renamed from: p */
    public String f134969p;

    /* renamed from: q */
    public String f134970q;

    /* renamed from: r */
    public String f134971r;

    /* renamed from: s */
    public int f134972s;

    /* renamed from: t */
    public String f134973t;

    /* renamed from: u */
    public C51187s10 f134974u;

    /* renamed from: v */
    public String f134975v;

    /* renamed from: w */
    public String f134976w;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49772hy3)) {
            return false;
        }
        C49772hy3 hy32 = (C49772hy3) aVar;
        return C46238a.m51546a(this.f134960d, hy32.f134960d) && C46238a.m51546a(this.f134961e, hy32.f134961e) && C46238a.m51546a(Integer.valueOf(this.f134962f), Integer.valueOf(hy32.f134962f)) && C46238a.m51546a(this.f134963g, hy32.f134963g) && C46238a.m51546a(this.f134964h, hy32.f134964h) && C46238a.m51546a(this.f134965i, hy32.f134965i) && C46238a.m51546a(Integer.valueOf(this.f134966j), Integer.valueOf(hy32.f134966j)) && C46238a.m51546a(Integer.valueOf(this.f134967n), Integer.valueOf(hy32.f134967n)) && C46238a.m51546a(this.f134968o, hy32.f134968o) && C46238a.m51546a(this.f134969p, hy32.f134969p) && C46238a.m51546a(this.f134970q, hy32.f134970q) && C46238a.m51546a(this.f134971r, hy32.f134971r) && C46238a.m51546a(Integer.valueOf(this.f134972s), Integer.valueOf(hy32.f134972s)) && C46238a.m51546a(this.f134973t, hy32.f134973t) && C46238a.m51546a(this.f134974u, hy32.f134974u) && C46238a.m51546a(this.f134975v, hy32.f134975v) && C46238a.m51546a(this.f134976w, hy32.f134976w);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C51163rv3 rv32 = this.f134960d;
            if (rv32 == null) {
                throw new C52419b("Not all required fields were included: UserName");
            } else if (this.f134961e != null) {
                if (rv32 != null) {
                    aVar.mo74322i(1, rv32.computeSize());
                    this.f134960d.writeFields(aVar);
                }
                C51163rv3 rv33 = this.f134961e;
                if (rv33 != null) {
                    aVar.mo74322i(2, rv33.computeSize());
                    this.f134961e.writeFields(aVar);
                }
                aVar.mo74318e(3, this.f134962f);
                String str = this.f134963g;
                if (str != null) {
                    aVar.mo74323j(4, str);
                }
                String str2 = this.f134964h;
                if (str2 != null) {
                    aVar.mo74323j(5, str2);
                }
                String str3 = this.f134965i;
                if (str3 != null) {
                    aVar.mo74323j(6, str3);
                }
                aVar.mo74318e(7, this.f134966j);
                aVar.mo74318e(8, this.f134967n);
                String str4 = this.f134968o;
                if (str4 != null) {
                    aVar.mo74323j(9, str4);
                }
                String str5 = this.f134969p;
                if (str5 != null) {
                    aVar.mo74323j(10, str5);
                }
                String str6 = this.f134970q;
                if (str6 != null) {
                    aVar.mo74323j(11, str6);
                }
                String str7 = this.f134971r;
                if (str7 != null) {
                    aVar.mo74323j(12, str7);
                }
                aVar.mo74318e(13, this.f134972s);
                String str8 = this.f134973t;
                if (str8 != null) {
                    aVar.mo74323j(14, str8);
                }
                C51187s10 s102 = this.f134974u;
                if (s102 != null) {
                    aVar.mo74322i(15, s102.computeSize());
                    this.f134974u.writeFields(aVar);
                }
                String str9 = this.f134975v;
                if (str9 != null) {
                    aVar.mo74323j(16, str9);
                }
                String str10 = this.f134976w;
                if (str10 != null) {
                    aVar.mo74323j(17, str10);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: NickName");
            }
        } else if (i2 == 1) {
            C51163rv3 rv34 = this.f134960d;
            if (rv34 != null) {
                i3 = C52418a.m58682i(1, rv34.computeSize()) + 0;
            }
            C51163rv3 rv35 = this.f134961e;
            if (rv35 != null) {
                i3 += C52418a.m58682i(2, rv35.computeSize());
            }
            int e = i3 + C52418a.m58678e(3, this.f134962f);
            String str11 = this.f134963g;
            if (str11 != null) {
                e += C52418a.m58683j(4, str11);
            }
            String str12 = this.f134964h;
            if (str12 != null) {
                e += C52418a.m58683j(5, str12);
            }
            String str13 = this.f134965i;
            if (str13 != null) {
                e += C52418a.m58683j(6, str13);
            }
            int e2 = e + C52418a.m58678e(7, this.f134966j) + C52418a.m58678e(8, this.f134967n);
            String str14 = this.f134968o;
            if (str14 != null) {
                e2 += C52418a.m58683j(9, str14);
            }
            String str15 = this.f134969p;
            if (str15 != null) {
                e2 += C52418a.m58683j(10, str15);
            }
            String str16 = this.f134970q;
            if (str16 != null) {
                e2 += C52418a.m58683j(11, str16);
            }
            String str17 = this.f134971r;
            if (str17 != null) {
                e2 += C52418a.m58683j(12, str17);
            }
            int e3 = e2 + C52418a.m58678e(13, this.f134972s);
            String str18 = this.f134973t;
            if (str18 != null) {
                e3 += C52418a.m58683j(14, str18);
            }
            C51187s10 s103 = this.f134974u;
            if (s103 != null) {
                e3 += C52418a.m58682i(15, s103.computeSize());
            }
            String str19 = this.f134975v;
            if (str19 != null) {
                e3 += C52418a.m58683j(16, str19);
            }
            String str20 = this.f134976w;
            return str20 != null ? e3 + C52418a.m58683j(17, str20) : e3;
        } else if (i2 == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f134960d == null) {
                throw new C52419b("Not all required fields were included: UserName");
            } else if (this.f134961e != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: NickName");
            }
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C49772hy3 hy32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C51163rv3 rv36 = new C51163rv3();
                        if (bArr != null && bArr.length > 0) {
                            rv36.mo73356d(bArr);
                        }
                        hy32.f134960d = rv36;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C51163rv3 rv37 = new C51163rv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            rv37.mo73356d(bArr2);
                        }
                        hy32.f134961e = rv37;
                    }
                    return 0;
                case 3:
                    hy32.f134962f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    hy32.f134963g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    hy32.f134964h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    hy32.f134965i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    hy32.f134966j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    hy32.f134967n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    hy32.f134968o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    hy32.f134969p = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    hy32.f134970q = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    hy32.f134971r = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    hy32.f134972s = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    hy32.f134973t = aVar3.mo141633k(intValue);
                    return 0;
                case 15:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C51187s10 s104 = new C51187s10();
                        if (bArr3 != null && bArr3.length > 0) {
                            s104.parseFrom(bArr3);
                        }
                        hy32.f134974u = s104;
                    }
                    return 0;
                case 16:
                    hy32.f134975v = aVar3.mo141633k(intValue);
                    return 0;
                case 17:
                    hy32.f134976w = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            C51163rv3 rv32 = this.f134960d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "UserName", rv32, false);
            aVar.mo71655d(jSONObject, "NickName", this.f134961e, false);
            aVar.mo71655d(jSONObject, "Sex", Integer.valueOf(this.f134962f), false);
            aVar.mo71655d(jSONObject, "Province", this.f134963g, false);
            aVar.mo71655d(jSONObject, "City", this.f134964h, false);
            aVar.mo71655d(jSONObject, "Signature", this.f134965i, false);
            aVar.mo71655d(jSONObject, "PersonalCard", Integer.valueOf(this.f134966j), false);
            aVar.mo71655d(jSONObject, "VerifyFlag", Integer.valueOf(this.f134967n), false);
            aVar.mo71655d(jSONObject, "VerifyInfo", this.f134968o, false);
            aVar.mo71655d(jSONObject, "Weibo", this.f134969p, false);
            aVar.mo71655d(jSONObject, "Alias", this.f134970q, false);
            aVar.mo71655d(jSONObject, "WeiboNickname", this.f134971r, false);
            aVar.mo71655d(jSONObject, "WeiboFlag", Integer.valueOf(this.f134972s), false);
            aVar.mo71655d(jSONObject, "Country", this.f134973t, false);
            aVar.mo71655d(jSONObject, "CustomizedInfo", this.f134974u, false);
            aVar.mo71655d(jSONObject, "BigHeadImgUrl", this.f134975v, false);
            aVar.mo71655d(jSONObject, "SmallHeadImgUrl", this.f134976w, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
