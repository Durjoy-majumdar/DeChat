package uz2;

import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: uz2.f0 */
public class C78315f0 extends C47465a {

    /* renamed from: d */
    public String f229428d;

    /* renamed from: e */
    public String f229429e;

    /* renamed from: f */
    public String f229430f;

    /* renamed from: g */
    public String f229431g;

    /* renamed from: h */
    public int f229432h;

    /* renamed from: i */
    public int f229433i;

    /* renamed from: j */
    public int f229434j;

    /* renamed from: n */
    public int f229435n;

    /* renamed from: o */
    public int f229436o;

    /* renamed from: p */
    public int f229437p;

    /* renamed from: q */
    public String f229438q;

    /* renamed from: r */
    public long f229439r;

    /* renamed from: s */
    public long f229440s;

    /* renamed from: t */
    public long f229441t;

    /* renamed from: u */
    public int f229442u;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C78315f0)) {
            return false;
        }
        C78315f0 f0Var = (C78315f0) aVar;
        return C46238a.m51546a(this.f229428d, f0Var.f229428d) && C46238a.m51546a(this.f229429e, f0Var.f229429e) && C46238a.m51546a(this.f229430f, f0Var.f229430f) && C46238a.m51546a(this.f229431g, f0Var.f229431g) && C46238a.m51546a(Integer.valueOf(this.f229432h), Integer.valueOf(f0Var.f229432h)) && C46238a.m51546a(Integer.valueOf(this.f229433i), Integer.valueOf(f0Var.f229433i)) && C46238a.m51546a(Integer.valueOf(this.f229434j), Integer.valueOf(f0Var.f229434j)) && C46238a.m51546a(Integer.valueOf(this.f229435n), Integer.valueOf(f0Var.f229435n)) && C46238a.m51546a(Integer.valueOf(this.f229436o), Integer.valueOf(f0Var.f229436o)) && C46238a.m51546a(Integer.valueOf(this.f229437p), Integer.valueOf(f0Var.f229437p)) && C46238a.m51546a(this.f229438q, f0Var.f229438q) && C46238a.m51546a(Long.valueOf(this.f229439r), Long.valueOf(f0Var.f229439r)) && C46238a.m51546a(Long.valueOf(this.f229440s), Long.valueOf(f0Var.f229440s)) && C46238a.m51546a(Long.valueOf(this.f229441t), Long.valueOf(f0Var.f229441t)) && C46238a.m51546a(Integer.valueOf(this.f229442u), Integer.valueOf(f0Var.f229442u));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f229428d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f229429e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f229430f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f229431g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            aVar.mo74318e(5, this.f229432h);
            aVar.mo74318e(6, this.f229433i);
            aVar.mo74318e(7, this.f229434j);
            aVar.mo74318e(8, this.f229435n);
            aVar.mo74318e(9, this.f229436o);
            aVar.mo74318e(10, this.f229437p);
            String str5 = this.f229438q;
            if (str5 != null) {
                aVar.mo74323j(11, str5);
            }
            aVar.mo74321h(12, this.f229439r);
            aVar.mo74321h(13, this.f229440s);
            aVar.mo74321h(14, this.f229441t);
            aVar.mo74318e(15, this.f229442u);
            return 0;
        } else if (i2 == 1) {
            String str6 = this.f229428d;
            if (str6 != null) {
                i3 = C52418a.m58683j(1, str6) + 0;
            }
            String str7 = this.f229429e;
            if (str7 != null) {
                i3 += C52418a.m58683j(2, str7);
            }
            String str8 = this.f229430f;
            if (str8 != null) {
                i3 += C52418a.m58683j(3, str8);
            }
            String str9 = this.f229431g;
            if (str9 != null) {
                i3 += C52418a.m58683j(4, str9);
            }
            int e = i3 + C52418a.m58678e(5, this.f229432h) + C52418a.m58678e(6, this.f229433i) + C52418a.m58678e(7, this.f229434j) + C52418a.m58678e(8, this.f229435n) + C52418a.m58678e(9, this.f229436o) + C52418a.m58678e(10, this.f229437p);
            String str10 = this.f229438q;
            if (str10 != null) {
                e += C52418a.m58683j(11, str10);
            }
            return e + C52418a.m58681h(12, this.f229439r) + C52418a.m58681h(13, this.f229440s) + C52418a.m58681h(14, this.f229441t) + C52418a.m58678e(15, this.f229442u);
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
            C78315f0 f0Var = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    f0Var.f229428d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    f0Var.f229429e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    f0Var.f229430f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    f0Var.f229431g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    f0Var.f229432h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    f0Var.f229433i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    f0Var.f229434j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    f0Var.f229435n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    f0Var.f229436o = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    f0Var.f229437p = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    f0Var.f229438q = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    f0Var.f229439r = aVar3.mo141631i(intValue);
                    return 0;
                case 13:
                    f0Var.f229440s = aVar3.mo141631i(intValue);
                    return 0;
                case 14:
                    f0Var.f229441t = aVar3.mo141631i(intValue);
                    return 0;
                case 15:
                    f0Var.f229442u = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f229428d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "sessionId", str, false);
            aVar.mo71655d(jSONObject, "username", this.f229429e, false);
            aVar.mo71655d(jSONObject, "sourceExtraInfo", this.f229430f, false);
            aVar.mo71655d(jSONObject, "currLikeIcon", this.f229431g, false);
            aVar.mo71655d(jSONObject, "currSameFriCnt", Integer.valueOf(this.f229432h), false);
            aVar.mo71655d(jSONObject, "currChattingCnt", Integer.valueOf(this.f229433i), false);
            aVar.mo71655d(jSONObject, "currScene", Integer.valueOf(this.f229434j), false);
            aVar.mo71655d(jSONObject, "newMsgNum", Integer.valueOf(this.f229435n), false);
            aVar.mo71655d(jSONObject, "listPos", Integer.valueOf(this.f229436o), false);
            aVar.mo71655d(jSONObject, "isInPullDownMode", Integer.valueOf(this.f229437p), false);
            aVar.mo71655d(jSONObject, "sourceFeedId", this.f229438q, false);
            aVar.mo71655d(jSONObject, "broadcastDuration", Long.valueOf(this.f229439r), false);
            aVar.mo71655d(jSONObject, "broadcastCycle", Long.valueOf(this.f229440s), false);
            aVar.mo71655d(jSONObject, "sameFriendPageSource", Long.valueOf(this.f229441t), false);
            aVar.mo71655d(jSONObject, "hasExpandFoldButton", Integer.valueOf(this.f229442u), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
