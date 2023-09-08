package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import cm1.C55033u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.FinderCommentReportEvent;
import com.tencent.p014mm.plugin.finder.service.C3603n1;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C7335d;
import di3.C86312j;
import dp1.C58417y0;
import fy3.C32226l;
import gy3.C87412m;
import ht1.C8794p5;
import java.util.Arrays;
import ke3.C88144b;
import kg3.C76577a;
import nj3.C11184p0;
import nj3.C76912y0;
import o40.C61926c;
import p910lj.C76701a;
import qo3.C77407n;
import rx3.C13598b0;
import sf1.C13671a;
import te3.C50542nh0;
import te3.C64707sc1;
import te3.C64772vh0;
import up1.C65426w0;

/* renamed from: com.tencent.mm.plugin.finder.view.s */
public final class C56648s implements C11184p0 {

    /* renamed from: d */
    public final Context f162382d;

    /* renamed from: e */
    public C55033u f162383e;

    /* renamed from: f */
    public int f162384f;

    /* renamed from: g */
    public C32226l<? super C55033u, C13598b0> f162385g;

    /* renamed from: com.tencent.mm.plugin.finder.view.s$a */
    public static final class C56649a implements C8794p5<C64707sc1> {

        /* renamed from: d */
        public final /* synthetic */ C56648s f162386d;

        public C56649a(C56648s sVar) {
            this.f162386d = sVar;
        }

        /* renamed from: c5 */
        public void mo705c5(Object obj, C50542nh0 nh02) {
            C87412m.m108594g((C64707sc1) obj, "req");
            C87412m.m108594g(nh02, "ret");
            Context context = MMApplicationContext.getContext();
            if (nh02.f138603e == 0) {
                this.f162386d.f162383e.f154492d.mo89532o2().blacklist_flag = 0;
                Log.m105924i("Finder.MenuItemCreateListener", "comment black list succ");
                C76912y0.makeText(context, (CharSequence) context.getResources().getString(C0966R.string.loc), 0).show();
                return;
            }
            this.f162386d.f162383e.f154492d.mo89532o2().blacklist_flag = 1;
            Log.m105924i("Finder.MenuItemCreateListener", "comment black list failed:" + nh02.f138603e);
            C76912y0.makeText(context, (CharSequence) context.getResources().getString(C0966R.string.lod), 0).show();
        }
    }

    public C56648s(Context context, C55033u uVar, int i, C32226l<? super C55033u, C13598b0> lVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(uVar, "commentItem");
        this.f162382d = context;
        this.f162383e = uVar;
        this.f162384f = i;
        this.f162385g = lVar;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        C65426w0 w0Var;
        Class cls = C58417y0.class;
        if (menuItem != null) {
            int itemId = menuItem.getItemId();
            if (itemId == 0) {
                if (!Util.isNullOrNil(this.f162383e.f154492d.getContent())) {
                    ClipboardHelper.setText(this.f162383e.f154492d.getContent());
                    C76701a.makeText(MMApplicationContext.getContext(), (int) C0966R.string.f7938wv, 0).show();
                    long n2 = this.f162383e.f154492d.mo89531n2();
                    FinderCommentReportEvent finderCommentReportEvent = new FinderCommentReportEvent();
                    FinderCommentReportEvent.C55121a aVar = finderCommentReportEvent.f154760d;
                    aVar.f154761a = 5;
                    aVar.f154762b = n2;
                    finderCommentReportEvent.publish();
                }
            } else if (itemId == 1) {
                C32226l<? super C55033u, C13598b0> lVar = this.f162385g;
                if (lVar != null) {
                    lVar.invoke(this.f162383e);
                }
                long n25 = this.f162383e.f154492d.mo89531n2();
                FinderCommentReportEvent finderCommentReportEvent2 = new FinderCommentReportEvent();
                FinderCommentReportEvent.C55121a aVar2 = finderCommentReportEvent2.f154760d;
                aVar2.f154761a = 4;
                aVar2.f154762b = n25;
                finderCommentReportEvent2.publish();
            } else {
                String str = null;
                if (itemId == 2) {
                    if (!this.f162383e.f154492d.mo89544z2()) {
                        C13671a aVar3 = C13671a.f38718a;
                        Context context = this.f162382d;
                        C65426w0 w0Var2 = this.f162383e.f154492d;
                        aVar3.mo13058a(context, w0Var2.field_feedId, w0Var2.mo89531n2(), this.f162384f);
                    } else {
                        Context context2 = this.f162382d;
                        C64772vh0 vh02 = this.f162383e.f154492d.mo89532o2().advertisement_info;
                        long j = vh02 != null ? vh02.f185887e : 0;
                        C87412m.m108594g(context2, "context");
                        String format = String.format("https://mp.weixin.qq.com/promotion/res/htmledition/mobile/html/feedback.html?aid=%s&source=1022", Arrays.copyOf(new Object[]{C61926c.m72691p(j)}, 1));
                        C87412m.m108593f(format, "format(format, *args)");
                        Intent intent = new Intent();
                        intent.putExtra("rawUrl", format);
                        C88144b.m109791i(context2, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
                    }
                    long n26 = this.f162383e.f154492d.mo89531n2();
                    FinderCommentReportEvent finderCommentReportEvent3 = new FinderCommentReportEvent();
                    FinderCommentReportEvent.C55121a aVar4 = finderCommentReportEvent3.f154760d;
                    aVar4.f154761a = 6;
                    aVar4.f154762b = n26;
                    finderCommentReportEvent3.publish();
                } else if (itemId == 3) {
                    C7335d c = C86312j.m106911c(cls);
                    C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
                    Context context3 = MMApplicationContext.getContext();
                    C87412m.m108593f(context3, "getContext()");
                    C58417y0.fy0((C58417y0) c, context3, 11, 4, false, 0, 0, (String) null, 120, (Object) null);
                    Context context4 = this.f162382d;
                    C77407n nVar = new C77407n(context4, 1, true);
                    nVar.mo107568m(context4.getString(C0966R.string.d0b), 17, C76577a.m92151b(context4, 14));
                    nVar.f225771i = new C4175t(context4);
                    nVar.f225782p = new C56657u(this);
                    nVar.mo107573q();
                } else if (itemId == 4) {
                    C7335d c2 = C86312j.m106911c(cls);
                    C87412m.m108593f(c2, "getService(FinderReportLogic::class.java)");
                    Context context5 = MMApplicationContext.getContext();
                    C87412m.m108593f(context5, "getContext()");
                    C58417y0.fy0((C58417y0) c2, context5, 11, 111, false, 0, 0, (String) null, 120, (Object) null);
                    C3603n1 n1Var = (C3603n1) C86312j.m106911c(C3603n1.class);
                    long itemId2 = this.f162383e.getItemId();
                    C65426w0 w0Var3 = this.f162383e.f154492d;
                    long j2 = w0Var3.field_feedId;
                    String str2 = w0Var3.field_objectNonceId;
                    if (str2 == null) {
                        str2 = "";
                    }
                    n1Var.vv0(itemId2, j2, str2, false, new C56649a(this));
                } else if (itemId == 999) {
                    C55033u uVar = this.f162383e;
                    if (!(uVar == null || (w0Var = uVar.f154492d) == null)) {
                        str = w0Var.toString();
                    }
                    ClipboardHelper.setText(str);
                }
            }
        }
    }
}
