package te3;

import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class ie4 extends C47465a {

    /* renamed from: d */
    public C101865x33 f354045d;

    /* renamed from: e */
    public boolean f354046e;

    /* renamed from: f */
    public int f354047f;

    /* renamed from: g */
    public int f354048g;

    /* renamed from: h */
    public boolean f354049h;

    /* renamed from: i */
    public int f354050i;

    /* renamed from: j */
    public String f354051j;

    /* renamed from: n */
    public int f354052n;

    /* renamed from: o */
    public int f354053o;

    /* renamed from: p */
    public long f354054p;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ie4)) {
            return false;
        }
        ie4 ie4 = (ie4) aVar;
        return C46238a.m51546a(this.f354045d, ie4.f354045d) && C46238a.m51546a(Boolean.valueOf(this.f354046e), Boolean.valueOf(ie4.f354046e)) && C46238a.m51546a(Integer.valueOf(this.f354047f), Integer.valueOf(ie4.f354047f)) && C46238a.m51546a(Integer.valueOf(this.f354048g), Integer.valueOf(ie4.f354048g)) && C46238a.m51546a(Boolean.valueOf(this.f354049h), Boolean.valueOf(ie4.f354049h)) && C46238a.m51546a(Integer.valueOf(this.f354050i), Integer.valueOf(ie4.f354050i)) && C46238a.m51546a(this.f354051j, ie4.f354051j) && C46238a.m51546a(Integer.valueOf(this.f354052n), Integer.valueOf(ie4.f354052n)) && C46238a.m51546a(Integer.valueOf(this.f354053o), Integer.valueOf(ie4.f354053o)) && C46238a.m51546a(Long.valueOf(this.f354054p), Long.valueOf(ie4.f354054p));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C101865x33 x332 = this.f354045d;
            if (x332 != null) {
                aVar.mo74322i(1, x332.computeSize());
                this.f354045d.writeFields(aVar);
            }
            aVar.mo74314a(2, this.f354046e);
            aVar.mo74318e(3, this.f354047f);
            aVar.mo74318e(4, this.f354048g);
            aVar.mo74314a(5, this.f354049h);
            aVar.mo74318e(6, this.f354050i);
            String str = this.f354051j;
            if (str != null) {
                aVar.mo74323j(7, str);
            }
            aVar.mo74318e(8, this.f354052n);
            aVar.mo74318e(9, this.f354053o);
            aVar.mo74321h(10, this.f354054p);
            return 0;
        } else if (i == 1) {
            C101865x33 x333 = this.f354045d;
            if (x333 != null) {
                i2 = 0 + C52418a.m58682i(1, x333.computeSize());
            }
            int a = i2 + C52418a.m58674a(2, this.f354046e) + C52418a.m58678e(3, this.f354047f) + C52418a.m58678e(4, this.f354048g) + C52418a.m58674a(5, this.f354049h) + C52418a.m58678e(6, this.f354050i);
            String str2 = this.f354051j;
            if (str2 != null) {
                a += C52418a.m58683j(7, str2);
            }
            return a + C52418a.m58678e(8, this.f354052n) + C52418a.m58678e(9, this.f354053o) + C52418a.m58681h(10, this.f354054p);
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
            ie4 ie4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C101865x33 x334 = new C101865x33();
                        if (bArr != null && bArr.length > 0) {
                            x334.parseFrom(bArr);
                        }
                        ie4.f354045d = x334;
                    }
                    return 0;
                case 2:
                    ie4.f354046e = aVar3.mo141625c(intValue);
                    return 0;
                case 3:
                    ie4.f354047f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    ie4.f354048g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    ie4.f354049h = aVar3.mo141625c(intValue);
                    return 0;
                case 6:
                    ie4.f354050i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    ie4.f354051j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    ie4.f354052n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    ie4.f354053o = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    ie4.f354054p = aVar3.mo141631i(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public JSONObject toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            C101865x33 x332 = this.f354045d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "response", x332, false);
            aVar.mo71655d(jSONObject, "shouldMergeKeyBuf", Boolean.valueOf(this.f354046e), false);
            aVar.mo71655d(jSONObject, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, Integer.valueOf(this.f354047f), false);
            aVar.mo71655d(jSONObject, "selector", Integer.valueOf(this.f354048g), false);
            aVar.mo71655d(jSONObject, "isContinue", Boolean.valueOf(this.f354049h), false);
            aVar.mo71655d(jSONObject, "minSyncHashCode", Integer.valueOf(this.f354050i), false);
            aVar.mo71655d(jSONObject, "dataId", this.f354051j, false);
            aVar.mo71655d(jSONObject, "dataType", Integer.valueOf(this.f354052n), false);
            aVar.mo71655d(jSONObject, "pushSyncFlag", Integer.valueOf(this.f354053o), false);
            aVar.mo71655d(jSONObject, "recvTime", Long.valueOf(this.f354054p), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
