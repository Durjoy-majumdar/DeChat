package fu2;

import android.content.Context;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.listener.C96049p0;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import gu2.C98214b;
import gy3.C87412m;
import ke3.C88144b;

/* renamed from: fu2.l */
public final class C98016l extends C96049p0 {

    /* renamed from: d */
    public final /* synthetic */ C98017m f287429d;

    /* renamed from: e */
    public final /* synthetic */ Context f287430e;

    public C98016l(C98017m mVar, Context context) {
        this.f287429d = mVar;
        this.f287430e = context;
    }

    /* renamed from: a */
    public void mo133570a(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        SnsMethodCalculate.markStartTimeMs("onMMCreateContextMenu", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveFinderMediaClick$finderMediaMenuListener$2$1");
        C87412m.m108594g(contextMenu, "menu");
        C87412m.m108594g(view, "v");
        C88144b.m109788f("favorite");
        contextMenu.add(0, 25, 0, this.f287430e.getString(C0966R.string.f361137hk2));
        SnsMethodCalculate.markEndTimeMs("onMMCreateContextMenu", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveFinderMediaClick$finderMediaMenuListener$2$1");
    }

    /* renamed from: b */
    public boolean mo133571b(View view) {
        SnsMethodCalculate.markStartTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveFinderMediaClick$finderMediaMenuListener$2$1");
        C87412m.m108594g(view, "view");
        C98214b c = this.f287429d.mo137310c();
        if (c == null) {
            SnsMethodCalculate.markEndTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveFinderMediaClick$finderMediaMenuListener$2$1");
            return false;
        }
        TimeLineObject G2 = c.mo137509G2();
        Log.m105925i("MicroMsg.TimelineOnCreateContextMenuListener", "finderMediaMenuListener onbindOnSelectedView : %s", G2.f283893Id);
        if (TextUtils.isEmpty(G2.f283893Id)) {
            SnsMethodCalculate.markEndTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveFinderMediaClick$finderMediaMenuListener$2$1");
            return false;
        }
        this.f287429d.mo137312e().mo133554b(view, c.mo137503A2(), G2);
        SnsMethodCalculate.markEndTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveFinderMediaClick$finderMediaMenuListener$2$1");
        return true;
    }
}
