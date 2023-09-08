package fu2;

import android.content.Context;
import android.view.ContextMenu;
import android.view.View;
import c00.C0405n;
import c00.C92330r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.abtest.NotInteresetABTestManager;
import com.tencent.p014mm.plugin.sns.model.C94965w1;
import com.tencent.p014mm.plugin.sns.p106ui.listener.C96049p0;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import gu2.C98214b;
import gy3.C87412m;
import ke3.C88144b;
import p255vr.C65873e;
import rx3.C36570n;

/* renamed from: fu2.h */
public final class C98009h extends C97987a {

    /* renamed from: h */
    public final C98010a f287420h;

    /* renamed from: fu2.h$a */
    public static final class C98010a extends C96049p0 {

        /* renamed from: d */
        public final /* synthetic */ C98009h f287421d;

        /* renamed from: e */
        public final /* synthetic */ Context f287422e;

        public C98010a(C98009h hVar, Context context) {
            this.f287421d = hVar;
            this.f287422e = context;
        }

        /* renamed from: a */
        public void mo133570a(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            ContextMenu contextMenu2 = contextMenu;
            SnsMethodCalculate.markStartTimeMs("onMMCreateContextMenu", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveContentClick$descMenuListener$1");
            C87412m.m108594g(contextMenu2, "menu");
            C87412m.m108594g(view, "v");
            C98214b c = this.f287421d.mo137310c();
            if (c == null) {
                SnsMethodCalculate.markEndTimeMs("onMMCreateContextMenu", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveContentClick$descMenuListener$1");
                return;
            }
            SnsMethodCalculate.markStartTimeMs("isNoCopy", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
            boolean booleanValue = ((Boolean) ((C36570n) c.f287983n1).getValue()).booleanValue();
            SnsMethodCalculate.markEndTimeMs("isNoCopy", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
            if (!booleanValue) {
                contextMenu2.add(0, 0, 0, this.f287422e.getString(C0966R.string.f7936wt));
            }
            C88144b.m109788f("favorite");
            contextMenu2.add(0, 1, 0, this.f287422e.getString(C0966R.string.f361137hk2));
            C98009h hVar = this.f287421d;
            hVar.getClass();
            SnsMethodCalculate.markStartTimeMs("isTranslatedPost", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveContentClick");
            C98214b c2 = hVar.mo137310c();
            C94965w1.C94967b e = C94965w1.m120624e(c2 != null ? c2.mo137507E2() : null);
            boolean z = e != null && e.f275306d && !e.f275307e && (e.f275308f & 2) != 0;
            SnsMethodCalculate.markEndTimeMs("isTranslatedPost", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveContentClick");
            if (!z) {
                C94965w1.m120621b(contextMenu2, true);
            } else {
                C94965w1.m120622c(contextMenu2, true);
            }
            NotInteresetABTestManager.m119627b(contextMenu2, c.mo137505C2());
            if (!((C0405n) C86312j.m106911c(C0405n.class)).mo279e()) {
                contextMenu2.add(0, 27, 0, this.f287422e.getString(C0966R.string.cwg));
                ((C92330r) C86312j.m106911c(C92330r.class)).Hh0(1, ((C65873e) C86312j.m106911c(C65873e.class)).ep0(77), 77, 0, "", "", c.mo137504B2(), "", 3, "", 0, (long) Util.nullAs(c.mo137509G2().ContentDesc, "").length(), 5, "", "", -1);
            }
            SnsMethodCalculate.markEndTimeMs("onMMCreateContextMenu", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveContentClick$descMenuListener$1");
        }

        /* renamed from: b */
        public boolean mo133571b(View view) {
            SnsMethodCalculate.markStartTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveContentClick$descMenuListener$1");
            C87412m.m108594g(view, "view");
            C98214b c = this.f287421d.mo137310c();
            if (c == null) {
                SnsMethodCalculate.markEndTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveContentClick$descMenuListener$1");
                return false;
            }
            this.f287421d.mo137312e().mo133554b(view, c.mo137503A2(), c.mo137509G2());
            SnsMethodCalculate.markEndTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveContentClick$descMenuListener$1");
            return true;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C98009h(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        this.f287420h = new C98010a(this, context);
    }

    /* renamed from: d */
    public View.OnCreateContextMenuListener mo137311d() {
        SnsMethodCalculate.markStartTimeMs("getMenuListener", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveContentClick");
        C98010a aVar = this.f287420h;
        SnsMethodCalculate.markEndTimeMs("getMenuListener", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveContentClick");
        return aVar;
    }
}
