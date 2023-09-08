package te3;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.wi */
public class C51836wi extends C47465a {

    /* renamed from: d */
    public long f144058d;

    /* renamed from: e */
    public int f144059e;

    /* renamed from: f */
    public String f144060f;

    /* renamed from: g */
    public String f144061g;

    /* renamed from: h */
    public String f144062h;

    /* renamed from: i */
    public int f144063i;

    /* renamed from: j */
    public int f144064j;

    /* renamed from: n */
    public int f144065n;

    /* renamed from: o */
    public C49765hx0 f144066o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51836wi)) {
            return false;
        }
        C51836wi wiVar = (C51836wi) aVar;
        return C46238a.m51546a(Long.valueOf(this.f144058d), Long.valueOf(wiVar.f144058d)) && C46238a.m51546a(Integer.valueOf(this.f144059e), Integer.valueOf(wiVar.f144059e)) && C46238a.m51546a(this.f144060f, wiVar.f144060f) && C46238a.m51546a(this.f144061g, wiVar.f144061g) && C46238a.m51546a(this.f144062h, wiVar.f144062h) && C46238a.m51546a(Integer.valueOf(this.f144063i), Integer.valueOf(wiVar.f144063i)) && C46238a.m51546a(Integer.valueOf(this.f144064j), Integer.valueOf(wiVar.f144064j)) && C46238a.m51546a(Integer.valueOf(this.f144065n), Integer.valueOf(wiVar.f144065n)) && C46238a.m51546a(this.f144066o, wiVar.f144066o);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f144058d);
            aVar.mo74318e(2, this.f144059e);
            String str = this.f144060f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f144061g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f144062h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            aVar.mo74318e(6, this.f144063i);
            aVar.mo74318e(7, this.f144064j);
            aVar.mo74318e(8, this.f144065n);
            C49765hx0 hx02 = this.f144066o;
            if (hx02 != null) {
                aVar.mo74322i(9, hx02.computeSize());
                this.f144066o.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f144058d) + 0 + C52418a.m58678e(2, this.f144059e);
            String str4 = this.f144060f;
            if (str4 != null) {
                h += C52418a.m58683j(3, str4);
            }
            String str5 = this.f144061g;
            if (str5 != null) {
                h += C52418a.m58683j(4, str5);
            }
            String str6 = this.f144062h;
            if (str6 != null) {
                h += C52418a.m58683j(5, str6);
            }
            int e = h + C52418a.m58678e(6, this.f144063i) + C52418a.m58678e(7, this.f144064j) + C52418a.m58678e(8, this.f144065n);
            C49765hx0 hx03 = this.f144066o;
            return hx03 != null ? e + C52418a.m58682i(9, hx03.computeSize()) : e;
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
            C51836wi wiVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    wiVar.f144058d = aVar3.mo141631i(intValue);
                    return 0;
                case 2:
                    wiVar.f144059e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    wiVar.f144060f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    wiVar.f144061g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    wiVar.f144062h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    wiVar.f144063i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    wiVar.f144064j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    wiVar.f144065n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C49765hx0 hx04 = new C49765hx0();
                        if (bArr != null && bArr.length > 0) {
                            hx04.parseFrom(bArr);
                        }
                        wiVar.f144066o = hx04;
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
            Long valueOf = Long.valueOf(this.f144058d);
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "id", valueOf, false);
            aVar.mo71655d(jSONObject, "type", Integer.valueOf(this.f144059e), false);
            aVar.mo71655d(jSONObject, "username", this.f144060f, false);
            aVar.mo71655d(jSONObject, "nickname", this.f144061g, false);
            aVar.mo71655d(jSONObject, "msg", this.f144062h, false);
            aVar.mo71655d(jSONObject, "create_time", Integer.valueOf(this.f144063i), false);
            aVar.mo71655d(jSONObject, "relation", Integer.valueOf(this.f144064j), false);
            aVar.mo71655d(jSONObject, "del_flag", Integer.valueOf(this.f144065n), false);
            aVar.mo71655d(jSONObject, "to_user_contact", this.f144066o, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
