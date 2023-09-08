package p180jy;

import com.tencent.p014mm.autogen.events.ResendSnsEvent;
import com.tencent.p014mm.plugin.sns.model.C5431p1;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import java.util.Iterator;
import te3.C101789j00;

/* renamed from: jy.p1 */
public class C33757p1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ArrayList f91292d;

    /* renamed from: e */
    public final /* synthetic */ String f91293e;

    public C33757p1(C33761q1 q1Var, ArrayList arrayList, String str) {
        this.f91292d = arrayList;
        this.f91293e = str;
    }

    public void run() {
        SnsInfo LL;
        TimeLineObject timeLine;
        C101789j00 j002;
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.feature.sns.listener.ResendSnsByUpdateXmlListener$1");
        ArrayList arrayList = this.f91292d;
        String str = this.f91293e;
        int i = C5431p1.f21134a;
        SnsMethodCalculate.markStartTimeMs("checkNeedUpdateSnsContentObjXml", "com.tencent.mm.plugin.sns.model.SnsLogic");
        if (arrayList == null || arrayList.size() == 0) {
            SnsMethodCalculate.markEndTimeMs("checkNeedUpdateSnsContentObjXml", "com.tencent.mm.plugin.sns.model.SnsLogic");
        } else {
            Iterator it = new ArrayList(arrayList).iterator();
            while (it.hasNext()) {
                int i2 = Util.getInt((String) it.next(), 0);
                if (!(i2 == 0 || (LL = C94866e1.Yx0().mo139800LL(i2)) == null || (timeLine = LL.getTimeLine()) == null || (j002 = timeLine.ContentObj) == null || j002.f298424e != 26)) {
                    j002.f298429j = str;
                    C94866e1.Yx0().Rv0(i2, LL);
                    ResendSnsEvent resendSnsEvent = new ResendSnsEvent();
                    resendSnsEvent.f78937d.f78938a = i2;
                    resendSnsEvent.publish();
                }
            }
            SnsMethodCalculate.markEndTimeMs("checkNeedUpdateSnsContentObjXml", "com.tencent.mm.plugin.sns.model.SnsLogic");
        }
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.feature.sns.listener.ResendSnsByUpdateXmlListener$1");
    }
}
