package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.view.MenuItem;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import java.util.LinkedList;
import nj3.C11184p0;
import ob0.C47350c;
import ob0.C89144l0;
import te3.C49654h34;
import te3.C49795i34;
import te3.s65;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.l */
public class C74089l implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ String f217427d;

    /* renamed from: e */
    public final /* synthetic */ int f217428e;

    /* renamed from: f */
    public final /* synthetic */ String f217429f;

    /* renamed from: g */
    public final /* synthetic */ String f217430g;

    /* renamed from: h */
    public final /* synthetic */ String f217431h;

    /* renamed from: i */
    public final /* synthetic */ C74103m f217432i;

    public C74089l(C74103m mVar, String str, int i, String str2, String str3, String str4) {
        this.f217432i = mVar;
        this.f217427d = str;
        this.f217428e = i;
        this.f217429f = str2;
        this.f217430g = str3;
        this.f217431h = str4;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        if (menuItem.getItemId() == 0) {
            C74103m mVar = this.f217432i;
            String str = this.f217427d;
            mVar.getClass();
            LinkedList<s65> linkedList = new LinkedList<>();
            s65 s65 = new s65();
            s65.f141352d = str;
            s65.f141353e = 1;
            linkedList.add(s65);
            C49654h34 h342 = new C49654h34();
            h342.f134432d = linkedList;
            h342.f134433e = 3;
            C47350c.C47352b bVar = new C47350c.C47352b();
            bVar.f127067b = new C49795i34();
            bVar.f127068c = "/cgi-bin/mmbiz-bin/wxaapp/setwxamsgconfig";
            bVar.f127069d = 3872;
            bVar.f127070e = 0;
            bVar.f127071f = 0;
            bVar.f127066a = h342;
            C89144l0.m111429e(bVar.mo72403a(), new C74171q(mVar, linkedList), true);
            MMHandlerThread.postToMainThread(new C74144o(mVar));
            this.f217432i.mo103172p0(2, this.f217427d, this.f217429f, this.f217430g, this.f217431h, C74103m.m88158o0(this.f217432i, this.f217428e));
        }
    }
}
