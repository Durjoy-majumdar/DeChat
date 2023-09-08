package fu2;

import android.content.Context;
import android.view.ContextMenu;
import android.view.View;
import c00.C0405n;
import c00.C92330r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.abtest.NotInteresetABTestManager;
import com.tencent.p014mm.plugin.sns.p106ui.listener.C96049p0;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import gu2.C98214b;
import gy3.C87412m;
import ke3.C88144b;
import p255vr.C65873e;
import rx3.C36570n;

/* renamed from: fu2.i */
public final class C98011i extends C97987a {

    /* renamed from: h */
    public final C98012a f287423h;

    /* renamed from: fu2.i$a */
    public static final class C98012a extends C96049p0 {

        /* renamed from: d */
        public final /* synthetic */ C98011i f287424d;

        /* renamed from: e */
        public final /* synthetic */ Context f287425e;

        public C98012a(C98011i iVar, Context context) {
            this.f287424d = iVar;
            this.f287425e = context;
        }

        /* renamed from: a */
        public void mo133570a(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            ContextMenu contextMenu2 = contextMenu;
            SnsMethodCalculate.markStartTimeMs("onMMCreateContextMenu", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveContentTranslateClick$descMenuListener$1");
            C87412m.m108594g(contextMenu2, "menu");
            C87412m.m108594g(view, "v");
            C98214b c = this.f287424d.mo137310c();
            if (c == null) {
                SnsMethodCalculate.markEndTimeMs("onMMCreateContextMenu", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveContentTranslateClick$descMenuListener$1");
                return;
            }
            SnsMethodCalculate.markStartTimeMs("isNoCopy", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
            boolean booleanValue = ((Boolean) ((C36570n) c.f287983n1).getValue()).booleanValue();
            SnsMethodCalculate.markEndTimeMs("isNoCopy", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
            if (!booleanValue) {
                contextMenu2.add(0, 0, 0, this.f287425e.getString(C0966R.string.f7936wt));
            }
            C88144b.m109788f("favorite");
            contextMenu2.add(0, 1, 0, this.f287425e.getString(C0966R.string.f361137hk2));
            NotInteresetABTestManager.m119627b(contextMenu2, c.mo137505C2());
            if (!((C0405n) C86312j.m106911c(C0405n.class)).mo279e()) {
                contextMenu2.add(0, 27, 0, this.f287425e.getString(C0966R.string.cwg));
                ((C92330r) C86312j.m106911c(C92330r.class)).Hh0(1, ((C65873e) C86312j.m106911c(C65873e.class)).ep0(77), 77, 0, "", "", c.mo137504B2(), "", 3, "", 0, (long) Util.nullAs(c.mo137509G2().ContentDesc, "").length(), 5, "", "", -1);
            }
            SnsMethodCalculate.markEndTimeMs("onMMCreateContextMenu", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveContentTranslateClick$descMenuListener$1");
        }

        /* renamed from: b */
        public boolean mo133571b(View view) {
            SnsMethodCalculate.markStartTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveContentTranslateClick$descMenuListener$1");
            C87412m.m108594g(view, "view");
            C98214b c = this.f287424d.mo137310c();
            if (c == null) {
                SnsMethodCalculate.markEndTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveContentTranslateClick$descMenuListener$1");
                return false;
            }
            this.f287424d.mo137312e().mo133554b(view, c.mo137503A2(), c.mo137509G2());
            SnsMethodCalculate.markEndTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveContentTranslateClick$descMenuListener$1");
            return true;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C98011i(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        this.f287423h = new C98012a(this, context);
    }

    /* renamed from: d */
    public View.OnCreateContextMenuListener mo137311d() {
        SnsMethodCalculate.markStartTimeMs("getMenuListener", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveContentTranslateClick");
        C98012a aVar = this.f287423h;
        SnsMethodCalculate.markEndTimeMs("getMenuListener", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveContentTranslateClick");
        return aVar;
    }

    /* renamed from: k */
    public void mo137317k(View view, boolean z, boolean z2, boolean z3) {
        SnsMethodCalculate.markStartTimeMs("register", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveContentTranslateClick");
        super.mo137317k(view, z, z2, z3);
        SnsMethodCalculate.markEndTimeMs("register", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveContentTranslateClick");
    }
}
