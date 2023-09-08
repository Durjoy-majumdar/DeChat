package fu2;

import android.content.DialogInterface;
import android.view.MenuItem;
import android.view.View;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.model.C94877g0;
import com.tencent.p014mm.plugin.sns.p106ui.improve.component.ImproveMainUIC;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.file.XVFSFile;
import f40.C86709a0;
import gu2.C98214b;
import jm2.C46562a;
import ju2.C99043c;
import nj3.C11184p0;
import nj3.C76879j;
import te3.w64;

/* renamed from: fu2.e */
public final class C98002e implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ String f287407d;

    /* renamed from: e */
    public final /* synthetic */ C98005g f287408e;

    /* renamed from: f */
    public final /* synthetic */ C98214b f287409f;

    /* renamed from: g */
    public final /* synthetic */ w64 f287410g;

    /* renamed from: h */
    public final /* synthetic */ View f287411h;

    /* renamed from: fu2.e$a */
    public static final class C98003a implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C94877g0 f287412d;

        public C98003a(C94877g0 g0Var) {
            this.f287412d = g0Var;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            SnsMethodCalculate.markStartTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveCommentClick$clickSelfComment$menuItemSelectedListener$1$1");
            C86709a0.m107529k().f251779b.mo123458d(this.f287412d);
            SnsMethodCalculate.markEndTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveCommentClick$clickSelfComment$menuItemSelectedListener$1$1");
        }
    }

    public C98002e(String str, C98005g gVar, C98214b bVar, w64 w64, View view) {
        this.f287407d = str;
        this.f287408e = gVar;
        this.f287409f = bVar;
        this.f287410g = w64;
        this.f287411h = view;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        SnsMethodCalculate.markStartTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveCommentClick$clickSelfComment$menuItemSelectedListener$1");
        int itemId = menuItem.getItemId();
        int i2 = 4;
        if (itemId != 0) {
            if (itemId == 1) {
                long p2 = this.f287409f.mo142401p2();
                if (this.f287409f.isAd()) {
                    i2 = 6;
                }
                C94877g0 g0Var = new C94877g0(p2, i2, this.f287410g);
                C86709a0.m107529k().f251779b.mo123460f(g0Var);
                ImproveMainUIC improveMainUIC = (ImproveMainUIC) C39818r.f106831a.mo62443b(this.f287408e.mo137309b()).mo75002a(ImproveMainUIC.class);
                String string = this.f287408e.mo137309b().getString(C0966R.string.a3h);
                String string2 = this.f287408e.mo137309b().getString(C0966R.string.jbm);
                C98003a aVar = new C98003a(g0Var);
                improveMainUIC.getClass();
                SnsMethodCalculate.markStartTimeMs("showOpDialog", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
                Log.m105924i("MicroMsg.Improve.MainUIC", "showOpDialog: ");
                improveMainUIC.f279684r = C76879j.m92723Q(improveMainUIC.getContext(), string, string2, true, true, aVar);
                SnsMethodCalculate.markEndTimeMs("showOpDialog", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
                w64 w64 = this.f287410g;
                int i3 = w64.f299709j;
                String str = w64.f299703d;
                C99043c cVar = C99043c.f290342a;
                View view = this.f287411h;
                SnsMethodCalculate.markStartTimeMs("relocateFeed$default", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveFeedRelocateUtil");
                cVar.mo138385a(view, 0);
                SnsMethodCalculate.markEndTimeMs("relocateFeed$default", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveFeedRelocateUtil");
                SnsReportHelper.f275506m0.mo131353N(this.f287409f.mo137505C2(), i3, str, 1);
            }
        } else if (ClipboardHelper.setTextSwallowException(this.f287407d)) {
            C76879j.m92726T(this.f287408e.mo137309b(), this.f287408e.mo137309b().getString(C0966R.string.f7938wv));
            C46562a aVar2 = C46562a.INSTANCE;
            aVar2.F80(4, this.f287409f.mo137504B2() + XVFSFile.PATH_SEPARATOR_CHAR + this.f287410g.f299709j, Util.getUTF8ByteLength(this.f287407d));
        } else {
            C76879j.m92726T(this.f287408e.mo137309b(), this.f287408e.mo137309b().getString(C0966R.string.f7937wu));
        }
        SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveCommentClick$clickSelfComment$menuItemSelectedListener$1");
    }
}
