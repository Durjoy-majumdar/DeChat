package com.tencent.p014mm.p136ui.conversation;

import android.app.Activity;
import android.os.MessageQueue;
import com.tencent.p014mm.p136ui.HomeUI;
import com.tencent.p014mm.p136ui.LauncherUI;
import com.tencent.p014mm.sdk.event.IListener;
import dd0.C45322a;
import dd0.C75350g;
import qo3.C77398g;
import sx2.C48497j;

/* renamed from: com.tencent.mm.ui.conversation.q2 */
public class C74739q2 implements C45322a {

    /* renamed from: d */
    public Activity f219773d;

    /* renamed from: e */
    public C74720p f219774e;

    /* renamed from: f */
    public ConversationListView f219775f;

    /* renamed from: g */
    public IListener f219776g = null;

    /* renamed from: h */
    public IListener f219777h = null;

    /* renamed from: i */
    public IListener f219778i = null;

    /* renamed from: j */
    public MessageQueue.IdleHandler f219779j;

    /* renamed from: n */
    public Runnable f219780n = new C74740a();

    /* renamed from: com.tencent.mm.ui.conversation.q2$a */
    public class C74740a implements Runnable {
        public C74740a() {
        }

        public void run() {
            C74739q2 q2Var = C74739q2.this;
            LauncherUI launcherUI = (LauncherUI) q2Var.f219773d;
            if (launcherUI == null || launcherUI.mo101375O7().f214435e == 0) {
                q2Var.f219775f.mo103727m();
            }
        }
    }

    /* renamed from: a */
    public void mo103906a() {
        if (C75350g.m90357a() != null) {
            ((C48497j) C75350g.m90357a()).mo73132f(this);
        }
        C77398g gVar = C6964i2.f24671a;
        if (gVar != null) {
            gVar.dismiss();
            C6964i2.f24671a = null;
        }
        LauncherUI launcherUI = (LauncherUI) this.f219773d;
        if (launcherUI != null) {
            HomeUI homeUI = launcherUI.getHomeUI();
            homeUI.f214270P.remove(this.f219780n);
        }
    }

    /* renamed from: y1 */
    public void mo69890y1(String str, String str2, String str3) {
        C74720p pVar = this.f219774e;
        if (pVar != null) {
            pVar.notifyDataSetChanged();
        }
    }
}
