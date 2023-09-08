package lq1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.service.C3603n1;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import df1.C7322a;
import di3.C86312j;
import dp1.C58417y0;
import fy3.C32226l;
import gy3.C87412m;
import ht1.C60172g4;
import ht1.C8794p5;
import ke3.C88144b;
import nj3.C11184p0;
import nj3.C76912y0;
import p910lj.C76701a;
import rs1.C13442s8;
import rx3.C13598b0;
import sq1.C64147b;
import sq1.C64151e;
import te3.C50542nh0;
import te3.C64707sc1;

/* renamed from: lq1.f0 */
public final class C61354f0 implements C11184p0 {

    /* renamed from: d */
    public C64151e f174522d;

    /* renamed from: e */
    public C32226l<? super C64151e, C13598b0> f174523e;

    /* renamed from: lq1.f0$a */
    public static final class C10638a implements C8794p5<C64707sc1> {
        /* renamed from: c5 */
        public void mo705c5(Object obj, C50542nh0 nh02) {
            C87412m.m108594g((C64707sc1) obj, "req");
            C87412m.m108594g(nh02, "ret");
            Context context = MMApplicationContext.getContext();
            if (nh02.f138603e == 0) {
                Log.m105924i("Finder.MenuItemCreateListener", "comment black list succ");
                C76912y0.makeText(context, (CharSequence) context.getResources().getString(C0966R.string.e3x), 0).show();
                return;
            }
            Log.m105924i("Finder.MenuItemCreateListener", "comment black list failed:" + nh02.f138603e);
            C76912y0.makeText(context, (CharSequence) context.getResources().getString(C0966R.string.e3y), 0).show();
        }
    }

    public C61354f0(C64151e eVar, int i, C32226l<? super C64151e, C13598b0> lVar) {
        C87412m.m108594g(eVar, "commentItem");
        this.f174522d = eVar;
        this.f174523e = lVar;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        C64147b bVar;
        C7322a b;
        if (menuItem != null) {
            int itemId = menuItem.getItemId();
            if (itemId == 0) {
                if (!Util.isNullOrNil(this.f174522d.f181868d.getContent())) {
                    ClipboardHelper.setText(this.f174522d.f181868d.getContent());
                    C76701a.makeText(MMApplicationContext.getContext(), (int) C0966R.string.f7938wv, 0).show();
                }
            } else if (itemId == 1) {
                C32226l<? super C64151e, C13598b0> lVar = this.f174523e;
                if (lVar != null) {
                    lVar.invoke(this.f174522d);
                }
            } else {
                String str = null;
                if (itemId == 2) {
                    Context context = MMApplicationContext.getContext();
                    C87412m.m108593f(context, "getContext()");
                    C64147b bVar2 = this.f174522d.f181868d;
                    long j = bVar2.field_feedId;
                    String str2 = "https://weixin110.qq.com/security/readtemplate?t=weixin_report/w_type&scene=79&comment_ID=" + bVar2.mo88875m2() + "&Content_ID=" + j;
                    Intent intent = new Intent();
                    intent.putExtra("rawUrl", str2);
                    C88144b.m109791i(context, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
                    ((C58417y0) C86312j.m106911c(C58417y0.class)).Ex0(j);
                    C13442s8 f = C13442s8.f38060Q0.mo12873f(context);
                    if (f != null && (b = C60172g4.C60173a.m70190b(f, 0, 1, (Object) null)) != null) {
                        b.mo8766a(new C7322a.C7323a(17, j));
                    }
                } else if (itemId == 3) {
                    C3603n1 n1Var = (C3603n1) C86312j.m106911c(C3603n1.class);
                    long itemId2 = this.f174522d.getItemId();
                    C64147b bVar3 = this.f174522d.f181868d;
                    long j2 = bVar3.field_feedId;
                    String str3 = bVar3.field_objectNonceId;
                    if (str3 == null) {
                        str3 = "";
                    }
                    n1Var.vv0(itemId2, j2, str3, true, new C10638a());
                } else if (itemId == 999) {
                    C64151e eVar = this.f174522d;
                    if (!(eVar == null || (bVar = eVar.f181868d) == null)) {
                        str = bVar.toString();
                    }
                    ClipboardHelper.setText(str);
                }
            }
        }
    }
}
