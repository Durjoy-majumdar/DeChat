package com.tencent.p014mm.plugin.appbrand.jsapi.file;

import android.content.Context;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.OpenFileRequest;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import com.tencent.p014mm.sdk.system.AndroidMediaUtil;
import com.tencent.xweb.util.WXWebReporter;
import di3.C86312j;
import nj3.C11184p0;
import p159gw.C98250h;
import p262wm.C22921c;
import p910lj.C76701a;
import s00.C110692d;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.file.h1 */
public class C17891h1 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ OpenFileRequest.C17886b.C17889c f49345d;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.file.h1$a */
    public class C17892a implements C98250h.C98251a {
        public C17892a() {
        }

        /* renamed from: a */
        public void mo2055a(String str, String str2) {
            OpenFileRequest.C17886b bVar = OpenFileRequest.C17886b.this;
            int i = OpenFileRequest.C17886b.f49333o;
            C76701a.makeText((Context) bVar.getActivityContext(), (CharSequence) OpenFileRequest.C17886b.this.getActivityContext().getString(C0966R.string.k3c, new Object[]{AndroidMediaUtil.getFriendlySdcardPath(str2)}), 1).show();
        }

        /* renamed from: b */
        public void mo2056b(String str, String str2) {
            OpenFileRequest.C17886b bVar = OpenFileRequest.C17886b.this;
            int i = OpenFileRequest.C17886b.f49333o;
            C76701a.makeText((Context) bVar.getActivityContext(), (CharSequence) OpenFileRequest.C17886b.this.getActivityContext().getString(C0966R.string.k3b), 1).show();
        }
    }

    public C17891h1(OpenFileRequest.C17886b.C17889c cVar) {
        this.f49345d = cVar;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            WXWebReporter.onPluginMenuSendClick(OpenFileRequest.C17886b.this.f49337g);
            MMActivity activityContext = OpenFileRequest.C17886b.this.getActivityContext();
            OpenFileRequest.C17886b bVar = OpenFileRequest.C17886b.this;
            ((C110692d) C86312j.m106911c(C110692d.class)).mo35328tq(activityContext, bVar.f49335e, bVar.f49336f, bVar.f49337g);
        } else if (itemId == 1) {
            WXWebReporter.onPluginMenuOpenByOtherClick(OpenFileRequest.C17886b.this.f49337g);
            MMActivity activityContext2 = OpenFileRequest.C17886b.this.getActivityContext();
            OpenFileRequest.C17886b bVar2 = OpenFileRequest.C17886b.this;
            ((C22921c) C86312j.m106911c(C22921c.class)).M30(activityContext2, bVar2.f49335e, bVar2.f49337g, 8);
        } else if (itemId != 2) {
            if (itemId != 3) {
                if (itemId == 4) {
                    OpenFileRequest.C17886b bVar3 = OpenFileRequest.C17886b.this;
                    int i2 = OpenFileRequest.C17886b.f49333o;
                    bVar3.getClass();
                    C80907o.m98781d(WeChatProcess.PROCESS_MAIN, new IPCString(bVar3.f49335e), OpenFileRequest.C17886b.C1683d.class, new C82429f1(bVar3));
                } else if (itemId == 5) {
                    OpenFileRequest.C17886b bVar4 = OpenFileRequest.C17886b.this;
                    int i3 = OpenFileRequest.C17886b.f49333o;
                    ((C98250h) C86312j.m106911c(C98250h.class)).pk0(bVar4.getActivityContext(), OpenFileRequest.C17886b.this.f49335e, new C17892a());
                }
            } else if (OpenFileRequest.C17886b.this.getAppBrandTaskProxyUI() != null && OpenFileRequest.C17886b.this.getAppBrandTaskProxyUI().f49247p != null) {
                OpenFileRequest.C17886b.this.getAppBrandTaskProxyUI().f49247p.mo124068H(true, 1);
            }
        } else if (OpenFileRequest.C17886b.this.getAppBrandTaskProxyUI() != null && OpenFileRequest.C17886b.this.getAppBrandTaskProxyUI().f49247p != null) {
            OpenFileRequest.C17886b.this.getAppBrandTaskProxyUI().f49247p.mo124068H(false, 1);
        }
    }
}
