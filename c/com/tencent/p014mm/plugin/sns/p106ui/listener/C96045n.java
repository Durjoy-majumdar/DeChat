package com.tencent.p014mm.plugin.sns.p106ui.listener;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.autogen.events.GameCenterOperationEvent;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.C96318y1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import p214om.C11502f;
import ps2.C100894u;
import te3.C101779g1;
import te3.C101799k1;
import wc3.C102431y;

/* renamed from: com.tencent.mm.plugin.sns.ui.listener.n */
public class C96045n implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ TimelineClickListener f280456d;

    public C96045n(TimelineClickListener timelineClickListener) {
        this.f280456d = timelineClickListener;
    }

    public void onClick(View view) {
        Class cls = C11502f.class;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$21", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$21");
        String str = (String) view.getTag();
        Log.m105918d("MicroMsg.TimelineClickListener", "onItemDelClick:" + str);
        TimeLineObject timeLine = C94866e1.Yx0().mo139798DN(str).getTimeLine();
        C101799k1 k1Var = timeLine.actionInfo;
        if (k1Var.f298580j == null) {
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$21");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$21", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        String CP = ((C11502f) C86312j.m106911c(cls)).mo11461Sr().mo93137CP(k1Var.f298580j.f298271d, false);
        int i = timeLine.ContentObj.f298424e;
        int i2 = i == 1 ? 2 : i == 3 ? 5 : i == 15 ? 38 : 0;
        if (C100894u.m132244x(timeLine, TimelineClickListener.m122988j(this.f280456d), 11, false)) {
            C102431y Sr = ((C11502f) C86312j.m106911c(cls)).mo11461Sr();
            Activity j = TimelineClickListener.m122988j(this.f280456d);
            C101779g1 g1Var = k1Var.f298580j;
            Sr.mo93162s5(j, g1Var.f298271d, CP, timeLine.UserName, i2, 11, 9, g1Var.f298272e, 0, timeLine.f283893Id);
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$21");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$21", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        int i3 = k1Var.f298574d;
        if (i3 == 4) {
            Intent intent = new Intent();
            intent.putExtra("rawUrl", k1Var.f298575e);
            ((C67654r1) ((C11502f) C86312j.m106911c(cls)).mo11462yM()).mo93190w(intent, TimelineClickListener.m122988j(this.f280456d));
            C102431y Sr2 = ((C11502f) C86312j.m106911c(cls)).mo11461Sr();
            Activity j2 = TimelineClickListener.m122988j(this.f280456d);
            C101779g1 g1Var2 = k1Var.f298580j;
            Sr2.mo93162s5(j2, g1Var2.f298271d, CP, timeLine.UserName, i2, 11, 1, g1Var2.f298272e, 0, timeLine.f283893Id);
        } else if (i3 != 5) {
            if (i3 == 6) {
                int b = C96318y1.m123548b(TimelineClickListener.m122988j(this.f280456d), k1Var);
                if (b == 1) {
                    GameCenterOperationEvent gameCenterOperationEvent = new GameCenterOperationEvent();
                    gameCenterOperationEvent.f107543d.f107545b = TimelineClickListener.m122988j(this.f280456d);
                    GameCenterOperationEvent.C40104a aVar = gameCenterOperationEvent.f107543d;
                    aVar.f107544a = 2;
                    C101779g1 g1Var3 = k1Var.f298580j;
                    aVar.f107546c = g1Var3.f298271d;
                    aVar.f107547d = g1Var3.f298274g;
                    aVar.f107548e = g1Var3.f298273f;
                    aVar.f107549f = 3;
                    gameCenterOperationEvent.publish();
                    C102431y Sr3 = ((C11502f) C86312j.m106911c(cls)).mo11461Sr();
                    Activity j3 = TimelineClickListener.m122988j(this.f280456d);
                    C101779g1 g1Var4 = k1Var.f298580j;
                    Sr3.mo93162s5(j3, g1Var4.f298271d, CP, timeLine.UserName, i2, 11, 6, g1Var4.f298272e, 0, timeLine.f283893Id);
                } else if (b == 2) {
                    GameCenterOperationEvent gameCenterOperationEvent2 = new GameCenterOperationEvent();
                    gameCenterOperationEvent2.f107543d.f107545b = TimelineClickListener.m122988j(this.f280456d);
                    GameCenterOperationEvent.C40104a aVar2 = gameCenterOperationEvent2.f107543d;
                    aVar2.f107544a = 1;
                    C101779g1 g1Var5 = k1Var.f298580j;
                    aVar2.f107546c = g1Var5.f298271d;
                    aVar2.f107547d = g1Var5.f298274g;
                    aVar2.f107548e = g1Var5.f298273f;
                    aVar2.f107549f = 3;
                    gameCenterOperationEvent2.publish();
                    C102431y Sr4 = ((C11502f) C86312j.m106911c(cls)).mo11461Sr();
                    Activity j4 = TimelineClickListener.m122988j(this.f280456d);
                    C101779g1 g1Var6 = k1Var.f298580j;
                    Sr4.mo93162s5(j4, g1Var6.f298271d, CP, timeLine.UserName, i2, 11, 3, g1Var6.f298272e, 0, timeLine.f283893Id);
                }
            }
        } else if (k1Var.f298576f == 1) {
            GameCenterOperationEvent gameCenterOperationEvent3 = new GameCenterOperationEvent();
            GameCenterOperationEvent.C40104a aVar3 = gameCenterOperationEvent3.f107543d;
            aVar3.f107544a = 2;
            aVar3.f107549f = 3;
            aVar3.f107546c = k1Var.f298580j.f298271d;
            aVar3.f107545b = TimelineClickListener.m122988j(this.f280456d);
            gameCenterOperationEvent3.publish();
            C102431y Sr5 = ((C11502f) C86312j.m106911c(cls)).mo11461Sr();
            Activity j5 = TimelineClickListener.m122988j(this.f280456d);
            C101779g1 g1Var7 = k1Var.f298580j;
            Sr5.mo93162s5(j5, g1Var7.f298271d, CP, timeLine.UserName, i2, 11, 6, g1Var7.f298272e, 0, timeLine.f283893Id);
        }
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$21");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$21", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
