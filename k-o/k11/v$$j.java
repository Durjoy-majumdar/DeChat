package k11;

import com.tencent.p014mm.p136ui.widget.dialog.MMFilterDialog;
import com.tencent.p014mm.plugin.clean.p036ui.fileindexui.CleanChattingUI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import qo3.C12925w;
import qo3.w$$d;

public final /* synthetic */ class v$$j implements w$$d {

    /* renamed from: a */
    public final /* synthetic */ CleanChattingUI f290507a;

    /* renamed from: b */
    public final /* synthetic */ C12925w f290508b;

    public /* synthetic */ v$$j(CleanChattingUI cleanChattingUI, C12925w wVar) {
        this.f290507a = cleanChattingUI;
        this.f290508b = wVar;
    }

    public final void onDismiss() {
        CleanChattingUI cleanChattingUI = this.f290507a;
        C12925w wVar = this.f290508b;
        Iterator it = ((ArrayList) cleanChattingUI.f267906r).iterator();
        while (it.hasNext()) {
            ((MMFilterDialog.C74986g.C74987a) it.next()).f220589c = false;
        }
        MMFilterDialog.C74986g.C74987a aVar = (MMFilterDialog.C74986g.C74987a) ((ArrayList) cleanChattingUI.f267906r).get(cleanChattingUI.f267907s);
        aVar.f220589c = true;
        MMFilterDialog mMFilterDialog = cleanChattingUI.f267905q;
        String str = aVar.f220587a;
        List<MMFilterDialog.C74986g.C74987a> list = cleanChattingUI.f267906r;
        mMFilterDialog.f220574x = str;
        ((ArrayList) mMFilterDialog.f220551B).clear();
        ((ArrayList) mMFilterDialog.f220551B).addAll(list);
        cleanChattingUI.f267905q.mo104489e();
        wVar.mo5085n();
    }
}
