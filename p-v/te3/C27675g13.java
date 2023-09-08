package te3;

import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.g13 */
public class C27675g13 extends C47465a {

    /* renamed from: d */
    public long f76611d;

    /* renamed from: e */
    public long f76612e;

    /* renamed from: f */
    public long f76613f;

    /* renamed from: g */
    public long f76614g;

    /* renamed from: h */
    public long f76615h;

    /* renamed from: i */
    public long f76616i;

    /* renamed from: j */
    public long f76617j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C27675g13)) {
            return false;
        }
        C27675g13 g132 = (C27675g13) aVar;
        return C46238a.m51546a(Long.valueOf(this.f76611d), Long.valueOf(g132.f76611d)) && C46238a.m51546a(Long.valueOf(this.f76612e), Long.valueOf(g132.f76612e)) && C46238a.m51546a(Long.valueOf(this.f76613f), Long.valueOf(g132.f76613f)) && C46238a.m51546a(Long.valueOf(this.f76614g), Long.valueOf(g132.f76614g)) && C46238a.m51546a(Long.valueOf(this.f76615h), Long.valueOf(g132.f76615h)) && C46238a.m51546a(Long.valueOf(this.f76616i), Long.valueOf(g132.f76616i)) && C46238a.m51546a(Long.valueOf(this.f76617j), Long.valueOf(g132.f76617j));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f76611d);
            aVar.mo74321h(2, this.f76612e);
            aVar.mo74321h(3, this.f76613f);
            aVar.mo74321h(4, this.f76614g);
            aVar.mo74321h(5, this.f76615h);
            aVar.mo74321h(6, this.f76616i);
            aVar.mo74321h(7, this.f76617j);
            return 0;
        } else if (i == 1) {
            return C52418a.m58681h(1, this.f76611d) + 0 + C52418a.m58681h(2, this.f76612e) + C52418a.m58681h(3, this.f76613f) + C52418a.m58681h(4, this.f76614g) + C52418a.m58681h(5, this.f76615h) + C52418a.m58681h(6, this.f76616i) + C52418a.m58681h(7, this.f76617j);
        } else {
            if (i == 2) {
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
                C27675g13 g132 = objArr[1];
                int intValue = objArr[2].intValue();
                switch (intValue) {
                    case 1:
                        g132.f76611d = aVar3.mo141631i(intValue);
                        return 0;
                    case 2:
                        g132.f76612e = aVar3.mo141631i(intValue);
                        return 0;
                    case 3:
                        g132.f76613f = aVar3.mo141631i(intValue);
                        return 0;
                    case 4:
                        g132.f76614g = aVar3.mo141631i(intValue);
                        return 0;
                    case 5:
                        g132.f76615h = aVar3.mo141631i(intValue);
                        return 0;
                    case 6:
                        g132.f76616i = aVar3.mo141631i(intValue);
                        return 0;
                    case 7:
                        g132.f76617j = aVar3.mo141631i(intValue);
                        return 0;
                    default:
                        return -1;
                }
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            Long valueOf = Long.valueOf(this.f76611d);
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "action", valueOf, false);
            aVar.mo71655d(jSONObject, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, Long.valueOf(this.f76612e), false);
            aVar.mo71655d(jSONObject, "useraction", Long.valueOf(this.f76613f), false);
            aVar.mo71655d(jSONObject, "fullscreen", Long.valueOf(this.f76614g), false);
            aVar.mo71655d(jSONObject, "taskcount", Long.valueOf(this.f76615h), false);
            aVar.mo71655d(jSONObject, "duration", Long.valueOf(this.f76616i), false);
            aVar.mo71655d(jSONObject, "enterChatting", Long.valueOf(this.f76617j), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
