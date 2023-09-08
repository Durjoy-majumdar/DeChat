package com.tencent.p014mm.plugin.webview.luggage;

import a93.C0019d;
import android.content.Context;
import android.view.MenuItem;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.plugin.webview.luggage.menu.C43634a;
import com.tencent.p014mm.plugin.webview.luggage.menu.C43656s;
import com.tencent.p014mm.plugin.webview.luggage.menu.C43657t;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import j83.C9286a;
import java.util.HashMap;
import java.util.Iterator;
import p196ln.C76708i;
import q20.C89449a;
import qo3.C77407n;

/* renamed from: com.tencent.mm.plugin.webview.luggage.x0 */
public class C43687x0 {

    /* renamed from: a */
    public C43658n f118056a;

    /* renamed from: b */
    public C43656s f118057b;

    /* renamed from: c */
    public C77407n f118058c;

    @C89449a
    /* renamed from: com.tencent.mm.plugin.webview.luggage.x0$a */
    public static class C6018a implements C80883e<IPCString, IPCString> {
        private C6018a() {
        }

        public void invoke(Object obj, C1256g gVar) {
            IPCString iPCString = (IPCString) obj;
            String str = iPCString.f10315d;
            String oX = ((C76708i) C86312j.m106911c(C76708i.class)).mo106845oX(iPCString.f10315d, false);
            if (!C86013q1.m106450k(oX)) {
                C9286a.m8929a(new C6017w0(this, str));
            }
            gVar.mo894a(new IPCString(oX));
        }
    }

    public C43687x0(C43658n nVar, int i, C43656s sVar) {
        this.f118056a = nVar;
        this.f118057b = sVar;
        boolean z = false;
        C77407n nVar2 = new C77407n(nVar.f148196d, i, false);
        this.f118058c = nVar2;
        nVar2.f225771i = new C43670q0(this);
        nVar2.f225773j = new C43672r0(this);
        nVar2.f225782p = new C43674s0(this);
        nVar2.f225787r = new C43676t0(this);
        nVar2.f225805z = new C6010u0(this);
        Iterator<C43657t> it = this.f118057b.f117902a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C43657t next = it.next();
            if (next.f117905b.equals("menuItem:share:appMessage") && !next.f117906c) {
                z = true;
                break;
            }
        }
        if (z) {
            C0019d.m9a(this.f118056a.f148196d, this.f118058c, new C43683v0(this));
        }
        this.f118058c.mo107573q();
    }

    /* renamed from: a */
    public void mo67995a(MenuItem menuItem) {
        C43657t tVar;
        C43656s sVar = this.f118057b;
        C43658n nVar = this.f118056a;
        Context context = nVar.f148196d;
        sVar.getClass();
        if (menuItem != null) {
            int itemId = menuItem.getItemId();
            Iterator<C43657t> it = sVar.f117902a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    tVar = null;
                    break;
                }
                tVar = it.next();
                if (tVar != null && tVar.f117904a == itemId) {
                    break;
                }
            }
            C43634a aVar = (C43634a) ((HashMap) sVar.f117903b).get(Integer.valueOf(tVar.f117904a));
            if (aVar != null) {
                aVar.mo67922b(context, nVar, tVar);
            }
        }
    }
}
