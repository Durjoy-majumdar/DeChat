package com.tencent.p014mm.chatroom.p015ui;

import android.view.MenuItem;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import f40.C86709a0;
import nj3.C11184p0;
import p203mi.C47044o;
import p203mi.C76763h;
import p203mi.C76764i;
import p203mi.C76766j;

/* renamed from: com.tencent.mm.chatroom.ui.q0 */
public class C67986q0 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ ManageChatroomUI f195124d;

    /* renamed from: com.tencent.mm.chatroom.ui.q0$a */
    public class C67987a implements ManageChatroomUI$$c {
        public C67987a() {
        }
    }

    public C67986q0(ManageChatroomUI manageChatroomUI) {
        this.f195124d = manageChatroomUI;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        if (i != 0) {
            this.f195124d.mo62741I7(2, -1);
            return;
        }
        this.f195124d.mo62741I7(3, -1);
        ManageChatroomUI manageChatroomUI = this.f195124d;
        C67987a aVar = new C67987a();
        String str = manageChatroomUI.f108078o;
        C76766j jVar = new C76766j(manageChatroomUI, new C67994u0(manageChatroomUI, manageChatroomUI, aVar));
        jVar.f224556g = true;
        C76764i iVar = new C76764i(jVar);
        jVar.f224558i = iVar;
        MMHandlerThread.postToMainThreadDelayed(iVar, 200);
        C76763h hVar = new C76763h(jVar);
        jVar.f224557h = hVar;
        MMHandlerThread.postToMainThreadDelayed(hVar, 60000);
        C86709a0.m107529k().f251779b.mo123455a(6217, jVar);
        C86709a0.m107529k().f251779b.mo123460f(new C47044o(str));
    }
}
