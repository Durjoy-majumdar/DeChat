package com.tencent.p014mm.p136ui.chatting.component.biz;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import f40.C86709a0;
import java.util.LinkedList;
import java.util.List;
import p154fy.C87121j;
import rb0.C48009v0;
import sb0.C48334c;
import sb0.C48340e;
import sb0.C48349h;
import sb0.C48352i;
import sb0.C48353j;
import sb0.C48360o;

/* renamed from: com.tencent.mm.ui.chatting.component.biz.b */
public class C44807b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ boolean f121601d;

    /* renamed from: e */
    public final /* synthetic */ C48334c f121602e;

    /* renamed from: f */
    public final /* synthetic */ C72996z1 f121603f;

    /* renamed from: g */
    public final /* synthetic */ String f121604g;

    /* renamed from: h */
    public final /* synthetic */ boolean f121605h;

    /* renamed from: i */
    public final /* synthetic */ BizComponent f121606i;

    public C44807b(BizComponent bizComponent, boolean z, C48334c cVar, C72996z1 z1Var, String str, boolean z2) {
        this.f121606i = bizComponent;
        this.f121601d = z;
        this.f121602e = cVar;
        this.f121603f = z1Var;
        this.f121604g = str;
        this.f121605h = z2;
    }

    public void run() {
        long currentTimeMillis = System.currentTimeMillis();
        if (!this.f121601d || this.f121602e == null || this.f121603f == null) {
            Log.m105925i("MicroMsg.ChattingUI.BizComponent", "bizChatInfo:%s  talker:%s", this.f121602e, this.f121603f);
        } else {
            this.f121606i.mo70058Y5(true, this.f121604g);
            C48352i zx02 = C48009v0.zx0();
            C48334c cVar = this.f121602e;
            zx02.getClass();
            String format = String.format("%s;%s;%d", new Object[]{cVar.field_brandUserName, cVar.field_bizChatServId, Long.valueOf(System.currentTimeMillis() / 1000)});
            ((C87121j) C86312j.m106911c(C87121j.class)).oc0(cVar.field_brandUserName, 7, "EnterpriseChatStatus", format);
            Log.m105919d("MicroMsg.BizChatStatusNotifyService", "enterChat:arg:%s", format);
            if (this.f121605h) {
                if (this.f121602e.mo73038q2()) {
                    C48349h yx02 = C48009v0.yx0();
                    String str = this.f121602e.field_bizChatServId;
                    String str2 = this.f121604g;
                    yx02.getClass();
                    C86709a0.m107529k().f251779b.mo123460f(new C48360o(str, str2, true));
                } else {
                    C48334c cVar2 = this.f121602e;
                    String str3 = C48340e.f129426a;
                    Log.m105918d("MicroMsg.BizChatInfoStorageLogic", "updateBizChatMember");
                    if (cVar2 == null) {
                        Log.m105928w("MicroMsg.BizChatInfoStorageLogic", "updateBizChatMember: bizChatInfo == null");
                    } else {
                        List<String> o2 = cVar2.mo73036o2();
                        if (o2 == null) {
                            Log.m105928w("MicroMsg.BizChatInfoStorageLogic", "updateBizChatMember: list == null");
                        } else {
                            LinkedList linkedList = new LinkedList();
                            for (String next : o2) {
                                C48353j jVar = C48009v0.Bx0().get(next);
                                if (jVar != null && jVar.mo73074m2()) {
                                    linkedList.add(next);
                                }
                            }
                            if (linkedList.size() > 0) {
                                C48009v0.yx0().mo73055b(linkedList, cVar2.field_brandUserName);
                            } else {
                                Log.m105928w("MicroMsg.BizChatInfoStorageLogic", "updateBizChatMember: no need to update");
                            }
                        }
                    }
                }
            }
            BizComponent bizComponent = this.f121606i;
            C48334c cVar3 = this.f121602e;
            bizComponent.getClass();
            if (cVar3 != null && !Util.isNullOrNil(cVar3.field_brandUserName)) {
                String Pk = C48009v0.Bx0().mo73076Pk(cVar3.field_brandUserName);
                C48353j jVar2 = C48009v0.Bx0().get(Pk);
                Object[] objArr = new Object[3];
                objArr[0] = cVar3.field_brandUserName;
                objArr[1] = Pk;
                objArr[2] = Boolean.valueOf(jVar2 == null);
                Log.m105925i("MicroMsg.ChattingUI.BizComponent", "updateBizChatMyUserInfo: %s:%s,myBizChatUserInfo is null:%s", objArr);
                if (Util.isNullOrNil(Pk) || jVar2 == null || jVar2.mo73074m2() || Util.isNullOrNil(jVar2.field_addMemberUrl)) {
                    C48009v0.yx0().mo73062h(cVar3.field_brandUserName, bizComponent);
                }
            }
        }
        Log.m105919d("MicroMsg.ChattingUI.BizComponent", "willen test  updateBizChatInfo use time:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }
}
