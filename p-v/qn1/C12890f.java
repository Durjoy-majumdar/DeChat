package qn1;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import java.util.LinkedList;
import ob0.C11386s;
import ob0.C35133k;
import sx3.C110818d0;
import te3.C50694ok;
import te3.C51096re1;

/* renamed from: qn1.f */
public final class C12890f implements C11386s {
    /* renamed from: d */
    public void mo12406d(C50694ok okVar) {
        C87412m.m108594g(okVar, "businessInfo");
        C51096re1 re12 = new C51096re1();
        re12.parseFrom(okVar.f139227e.mo123703f());
        C12883c.f36861h.mo12405a().mo12399c(re12, false, 0);
        StringBuilder sb = new StringBuilder();
        sb.append("newNpsSurveyTaskConf taskId = ");
        sb.append(re12.f140853d);
        sb.append(" positions = ");
        LinkedList<Integer> linkedList = re12.f140855f;
        C87412m.m108593f(linkedList, "taskConf.feed_pos");
        sb.append(C110818d0.m150921S(linkedList, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 63, (Object) null));
        sb.append(" conditions = ");
        sb.append(re12.f140854e);
        sb.append(" deliver_scenes = ");
        sb.append(re12.f140856g);
        sb.append(" startTime = ");
        sb.append(re12.f140857h);
        sb.append(" expireTime = ");
        sb.append(re12.f140858i);
        sb.append(" excludeDays = ");
        sb.append(re12.f140859j);
        Log.m105924i("Finder.NpsSurveyFuncMsgExtension", sb.toString());
    }

    /* renamed from: q */
    public void mo12407q(int i, C35133k.C35134b bVar) {
    }
}
