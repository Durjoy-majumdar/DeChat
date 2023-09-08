package te3;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class sh4 extends C47465a {

    /* renamed from: d */
    public int f64605d;

    /* renamed from: e */
    public String f64606e;

    /* renamed from: f */
    public int f64607f;

    /* renamed from: g */
    public int f64608g;

    /* renamed from: h */
    public int f64609h;

    /* renamed from: i */
    public LinkedList<xh4> f64610i = new LinkedList<>();

    /* renamed from: j */
    public boolean f64611j;

    /* renamed from: n */
    public boolean f64612n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof sh4)) {
            return false;
        }
        sh4 sh4 = (sh4) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f64605d), Integer.valueOf(sh4.f64605d)) && C46238a.m51546a(this.f64606e, sh4.f64606e) && C46238a.m51546a(Integer.valueOf(this.f64607f), Integer.valueOf(sh4.f64607f)) && C46238a.m51546a(Integer.valueOf(this.f64608g), Integer.valueOf(sh4.f64608g)) && C46238a.m51546a(Integer.valueOf(this.f64609h), Integer.valueOf(sh4.f64609h)) && C46238a.m51546a(this.f64610i, sh4.f64610i) && C46238a.m51546a(Boolean.valueOf(this.f64611j), Boolean.valueOf(sh4.f64611j)) && C46238a.m51546a(Boolean.valueOf(this.f64612n), Boolean.valueOf(sh4.f64612n));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f64605d);
            String str = this.f64606e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f64607f);
            aVar.mo74318e(4, this.f64608g);
            aVar.mo74318e(5, this.f64609h);
            aVar.mo74320g(6, 8, this.f64610i);
            aVar.mo74314a(7, this.f64611j);
            aVar.mo74314a(8, this.f64612n);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f64605d) + 0;
            String str2 = this.f64606e;
            if (str2 != null) {
                e += C52418a.m58683j(2, str2);
            }
            return e + C52418a.m58678e(3, this.f64607f) + C52418a.m58678e(4, this.f64608g) + C52418a.m58678e(5, this.f64609h) + C52418a.m58680g(6, 8, this.f64610i) + C52418a.m58674a(7, this.f64611j) + C52418a.m58674a(8, this.f64612n);
        } else if (i == 2) {
            this.f64610i.clear();
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
            sh4 sh4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    sh4.f64605d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    sh4.f64606e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    sh4.f64607f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    sh4.f64608g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    sh4.f64609h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        xh4 xh4 = new xh4();
                        if (bArr != null && bArr.length > 0) {
                            xh4.parseFrom(bArr);
                        }
                        sh4.f64610i.add(xh4);
                    }
                    return 0;
                case 7:
                    sh4.f64611j = aVar3.mo141625c(intValue);
                    return 0;
                case 8:
                    sh4.f64612n = aVar3.mo141625c(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            Integer valueOf = Integer.valueOf(this.f64605d);
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "videoSecondType", valueOf, false);
            aVar.mo71655d(jSONObject, "originVideoId", this.f64606e, false);
            aVar.mo71655d(jSONObject, "insertPos", Integer.valueOf(this.f64607f), false);
            aVar.mo71655d(jSONObject, "requestDuration", Integer.valueOf(this.f64608g), false);
            aVar.mo71655d(jSONObject, "requestPercent", Integer.valueOf(this.f64609h), false);
            aVar.mo71655d(jSONObject, "secondVideoInfoList", this.f64610i, false);
            aVar.mo71655d(jSONObject, "isRequest", Boolean.valueOf(this.f64611j), false);
            aVar.mo71655d(jSONObject, "isShow", Boolean.valueOf(this.f64612n), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
