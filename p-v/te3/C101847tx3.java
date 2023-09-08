package te3;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.tx3 */
public class C101847tx3 extends C47465a {

    /* renamed from: d */
    public String f299555d;

    /* renamed from: e */
    public String f299556e;

    /* renamed from: f */
    public int f299557f;

    /* renamed from: g */
    public String f299558g;

    /* renamed from: h */
    public String f299559h;

    /* renamed from: i */
    public String f299560i;

    /* renamed from: j */
    public int f299561j;

    /* renamed from: n */
    public LinkedList<C101853ux3> f299562n = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101847tx3)) {
            return false;
        }
        C101847tx3 tx32 = (C101847tx3) aVar;
        return C46238a.m51546a(this.f299555d, tx32.f299555d) && C46238a.m51546a(this.f299556e, tx32.f299556e) && C46238a.m51546a(Integer.valueOf(this.f299557f), Integer.valueOf(tx32.f299557f)) && C46238a.m51546a(this.f299558g, tx32.f299558g) && C46238a.m51546a(this.f299559h, tx32.f299559h) && C46238a.m51546a(this.f299560i, tx32.f299560i) && C46238a.m51546a(Integer.valueOf(this.f299561j), Integer.valueOf(tx32.f299561j)) && C46238a.m51546a(this.f299562n, tx32.f299562n);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f299555d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f299556e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f299557f);
            String str3 = this.f299558g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f299559h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            String str5 = this.f299560i;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            aVar.mo74318e(7, this.f299561j);
            aVar.mo74320g(8, 8, this.f299562n);
            return 0;
        } else if (i == 1) {
            String str6 = this.f299555d;
            if (str6 != null) {
                i2 = 0 + C52418a.m58683j(1, str6);
            }
            String str7 = this.f299556e;
            if (str7 != null) {
                i2 += C52418a.m58683j(2, str7);
            }
            int e = i2 + C52418a.m58678e(3, this.f299557f);
            String str8 = this.f299558g;
            if (str8 != null) {
                e += C52418a.m58683j(4, str8);
            }
            String str9 = this.f299559h;
            if (str9 != null) {
                e += C52418a.m58683j(5, str9);
            }
            String str10 = this.f299560i;
            if (str10 != null) {
                e += C52418a.m58683j(6, str10);
            }
            return e + C52418a.m58678e(7, this.f299561j) + C52418a.m58680g(8, 8, this.f299562n);
        } else if (i == 2) {
            this.f299562n.clear();
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
            C101847tx3 tx32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    tx32.f299555d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    tx32.f299556e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    tx32.f299557f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    tx32.f299558g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    tx32.f299559h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    tx32.f299560i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    tx32.f299561j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C101853ux3 ux32 = new C101853ux3();
                        if (bArr != null && bArr.length > 0) {
                            ux32.parseFrom(bArr);
                        }
                        tx32.f299562n.add(ux32);
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
            String str = this.f299555d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "Title", str, false);
            aVar.mo71655d(jSONObject, "Tid", this.f299556e, false);
            aVar.mo71655d(jSONObject, "FeedType", Integer.valueOf(this.f299557f), false);
            aVar.mo71655d(jSONObject, "NickName", this.f299558g, false);
            aVar.mo71655d(jSONObject, "Avatar", this.f299559h, false);
            aVar.mo71655d(jSONObject, "NonceID", this.f299560i, false);
            aVar.mo71655d(jSONObject, "MediaCount", Integer.valueOf(this.f299561j), false);
            aVar.mo71655d(jSONObject, "MediaList", this.f299562n, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
