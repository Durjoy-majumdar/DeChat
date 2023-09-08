package te3;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class qh4 extends C47465a {

    /* renamed from: d */
    public int f64500d;

    /* renamed from: e */
    public int f64501e;

    /* renamed from: f */
    public int f64502f;

    /* renamed from: g */
    public int f64503g;

    /* renamed from: h */
    public String f64504h;

    /* renamed from: i */
    public String f64505i;

    /* renamed from: j */
    public String f64506j;

    /* renamed from: n */
    public ph4 f64507n;

    /* renamed from: o */
    public boolean f64508o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof qh4)) {
            return false;
        }
        qh4 qh4 = (qh4) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f64500d), Integer.valueOf(qh4.f64500d)) && C46238a.m51546a(Integer.valueOf(this.f64501e), Integer.valueOf(qh4.f64501e)) && C46238a.m51546a(Integer.valueOf(this.f64502f), Integer.valueOf(qh4.f64502f)) && C46238a.m51546a(Integer.valueOf(this.f64503g), Integer.valueOf(qh4.f64503g)) && C46238a.m51546a(this.f64504h, qh4.f64504h) && C46238a.m51546a(this.f64505i, qh4.f64505i) && C46238a.m51546a(this.f64506j, qh4.f64506j) && C46238a.m51546a(this.f64507n, qh4.f64507n) && C46238a.m51546a(Boolean.valueOf(this.f64508o), Boolean.valueOf(qh4.f64508o));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f64500d);
            aVar.mo74318e(2, this.f64501e);
            aVar.mo74318e(3, this.f64502f);
            aVar.mo74318e(4, this.f64503g);
            String str = this.f64504h;
            if (str != null) {
                aVar.mo74323j(5, str);
            }
            String str2 = this.f64505i;
            if (str2 != null) {
                aVar.mo74323j(6, str2);
            }
            String str3 = this.f64506j;
            if (str3 != null) {
                aVar.mo74323j(7, str3);
            }
            ph4 ph4 = this.f64507n;
            if (ph4 != null) {
                aVar.mo74322i(8, ph4.computeSize());
                this.f64507n.writeFields(aVar);
            }
            aVar.mo74314a(9, this.f64508o);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f64500d) + 0 + C52418a.m58678e(2, this.f64501e) + C52418a.m58678e(3, this.f64502f) + C52418a.m58678e(4, this.f64503g);
            String str4 = this.f64504h;
            if (str4 != null) {
                e += C52418a.m58683j(5, str4);
            }
            String str5 = this.f64505i;
            if (str5 != null) {
                e += C52418a.m58683j(6, str5);
            }
            String str6 = this.f64506j;
            if (str6 != null) {
                e += C52418a.m58683j(7, str6);
            }
            ph4 ph42 = this.f64507n;
            if (ph42 != null) {
                e += C52418a.m58682i(8, ph42.computeSize());
            }
            return e + C52418a.m58674a(9, this.f64508o);
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
            qh4 qh4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    qh4.f64500d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    qh4.f64501e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    qh4.f64502f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    qh4.f64503g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    qh4.f64504h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    qh4.f64505i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    qh4.f64506j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        ph4 ph43 = new ph4();
                        if (bArr != null && bArr.length > 0) {
                            ph43.parseFrom(bArr);
                        }
                        qh4.f64507n = ph43;
                    }
                    return 0;
                case 9:
                    qh4.f64508o = aVar3.mo141625c(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            Integer valueOf = Integer.valueOf(this.f64500d);
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "beginTime", valueOf, false);
            aVar.mo71655d(jSONObject, "endTime", Integer.valueOf(this.f64501e), false);
            aVar.mo71655d(jSONObject, "minShowTime", Integer.valueOf(this.f64502f), false);
            aVar.mo71655d(jSONObject, "type", Integer.valueOf(this.f64503g), false);
            aVar.mo71655d(jSONObject, "id", this.f64504h, false);
            aVar.mo71655d(jSONObject, "subId", this.f64505i, false);
            aVar.mo71655d(jSONObject, "bizUin", this.f64506j, false);
            aVar.mo71655d(jSONObject, "videoDotInfo", this.f64507n, false);
            aVar.mo71655d(jSONObject, "isShow", Boolean.valueOf(this.f64508o), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
