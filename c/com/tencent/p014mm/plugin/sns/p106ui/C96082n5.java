package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.autogen.events.GameCenterOperationEvent;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import p214om.C11502f;
import ps2.C100894u;
import te3.C101779g1;
import te3.C101799k1;
import wc3.C102431y;

/* renamed from: com.tencent.mm.plugin.sns.ui.n5 */
public class C96082n5 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C101799k1 f280569d;

    /* renamed from: e */
    public final /* synthetic */ TimeLineObject f280570e;

    /* renamed from: f */
    public final /* synthetic */ SnsOnlineVideoActivity f280571f;

    public C96082n5(SnsOnlineVideoActivity snsOnlineVideoActivity, C101799k1 k1Var, TimeLineObject timeLineObject) {
        this.f280571f = snsOnlineVideoActivity;
        this.f280569d = k1Var;
        this.f280570e = timeLineObject;
    }

    public void onClick(View view) {
        Class cls = C11502f.class;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$8");
        if (this.f280569d.f298580j == null) {
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$8");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        SnsOnlineVideoActivity snsOnlineVideoActivity = this.f280571f;
        int i = SnsOnlineVideoActivity.f278370y0;
        SnsMethodCalculate.markStartTimeMs("access$2002", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        snsOnlineVideoActivity.f278375E = true;
        SnsMethodCalculate.markEndTimeMs("access$2002", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        String CP = ((C11502f) C86312j.m106911c(cls)).mo11461Sr().mo93137CP(this.f280569d.f298580j.f298271d, false);
        TimeLineObject timeLineObject = this.f280570e;
        int i2 = timeLineObject.ContentObj.f298424e;
        int i3 = i2 == 1 ? 2 : i2 == 3 ? 5 : i2 == 15 ? 38 : 0;
        if (C100894u.m132244x(timeLineObject, this.f280571f, 11, false)) {
            C102431y Sr = ((C11502f) C86312j.m106911c(cls)).mo11461Sr();
            SnsOnlineVideoActivity snsOnlineVideoActivity2 = this.f280571f;
            C101779g1 g1Var = this.f280569d.f298580j;
            String str = g1Var.f298271d;
            TimeLineObject timeLineObject2 = this.f280570e;
            Sr.mo93162s5(snsOnlineVideoActivity2, str, CP, timeLineObject2.UserName, i3, 19, 9, g1Var.f298272e, 0, timeLineObject2.f283893Id);
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$8");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C101799k1 k1Var = this.f280569d;
        int i4 = k1Var.f298574d;
        if (i4 == 4) {
            Intent intent = new Intent();
            intent.putExtra("rawUrl", this.f280569d.f298575e);
            ((C67654r1) ((C11502f) C86312j.m106911c(cls)).mo11462yM()).mo93190w(intent, this.f280571f);
            C102431y Sr2 = ((C11502f) C86312j.m106911c(cls)).mo11461Sr();
            SnsOnlineVideoActivity snsOnlineVideoActivity3 = this.f280571f;
            C101779g1 g1Var2 = this.f280569d.f298580j;
            String str2 = g1Var2.f298271d;
            TimeLineObject timeLineObject3 = this.f280570e;
            Sr2.mo93162s5(snsOnlineVideoActivity3, str2, CP, timeLineObject3.UserName, i3, 19, 1, g1Var2.f298272e, 0, timeLineObject3.f283893Id);
        } else if (i4 != 5) {
            if (i4 == 6) {
                int b = C96318y1.m123548b(this.f280571f, k1Var);
                if (b == 1) {
                    GameCenterOperationEvent gameCenterOperationEvent = new GameCenterOperationEvent();
                    GameCenterOperationEvent.C40104a aVar = gameCenterOperationEvent.f107543d;
                    aVar.f107545b = this.f280571f;
                    aVar.f107544a = 2;
                    C101779g1 g1Var3 = this.f280569d.f298580j;
                    aVar.f107546c = g1Var3.f298271d;
                    aVar.f107547d = g1Var3.f298274g;
                    aVar.f107548e = g1Var3.f298273f;
                    aVar.f107549f = 3;
                    gameCenterOperationEvent.publish();
                    C102431y Sr3 = ((C11502f) C86312j.m106911c(cls)).mo11461Sr();
                    SnsOnlineVideoActivity snsOnlineVideoActivity4 = this.f280571f;
                    C101779g1 g1Var4 = this.f280569d.f298580j;
                    String str3 = g1Var4.f298271d;
                    TimeLineObject timeLineObject4 = this.f280570e;
                    Sr3.mo93162s5(snsOnlineVideoActivity4, str3, CP, timeLineObject4.UserName, i3, 19, 6, g1Var4.f298272e, 0, timeLineObject4.f283893Id);
                } else if (b == 2) {
                    GameCenterOperationEvent gameCenterOperationEvent2 = new GameCenterOperationEvent();
                    GameCenterOperationEvent.C40104a aVar2 = gameCenterOperationEvent2.f107543d;
                    aVar2.f107545b = this.f280571f;
                    aVar2.f107544a = 1;
                    C101779g1 g1Var5 = this.f280569d.f298580j;
                    aVar2.f107546c = g1Var5.f298271d;
                    aVar2.f107547d = g1Var5.f298274g;
                    aVar2.f107548e = g1Var5.f298273f;
                    aVar2.f107549f = 3;
                    gameCenterOperationEvent2.publish();
                    C102431y Sr4 = ((C11502f) C86312j.m106911c(cls)).mo11461Sr();
                    SnsOnlineVideoActivity snsOnlineVideoActivity5 = this.f280571f;
                    C101779g1 g1Var6 = this.f280569d.f298580j;
                    String str4 = g1Var6.f298271d;
                    TimeLineObject timeLineObject5 = this.f280570e;
                    Sr4.mo93162s5(snsOnlineVideoActivity5, str4, CP, timeLineObject5.UserName, i3, 19, 3, g1Var6.f298272e, 0, timeLineObject5.f283893Id);
                }
            }
        } else if (k1Var.f298576f == 1) {
            GameCenterOperationEvent gameCenterOperationEvent3 = new GameCenterOperationEvent();
            GameCenterOperationEvent.C40104a aVar3 = gameCenterOperationEvent3.f107543d;
            aVar3.f107544a = 2;
            aVar3.f107549f = 3;
            aVar3.f107546c = this.f280569d.f298580j.f298271d;
            aVar3.f107545b = this.f280571f;
            gameCenterOperationEvent3.publish();
            C102431y Sr5 = ((C11502f) C86312j.m106911c(cls)).mo11461Sr();
            SnsOnlineVideoActivity snsOnlineVideoActivity6 = this.f280571f;
            C101779g1 g1Var7 = this.f280569d.f298580j;
            String str5 = g1Var7.f298271d;
            TimeLineObject timeLineObject6 = this.f280570e;
            Sr5.mo93162s5(snsOnlineVideoActivity6, str5, CP, timeLineObject6.UserName, i3, 19, 6, g1Var7.f298272e, 0, timeLineObject6.f283893Id);
        }
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$8");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
