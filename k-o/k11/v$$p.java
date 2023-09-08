package k11;

import com.tencent.p014mm.plugin.clean.p036ui.fileindexui.CleanChattingUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.wcdb.support.CancellationSignal;
import di3.C86312j;
import eb0.C75604z3;
import h81.C32735h;
import j11.C98896e;
import java.util.List;
import p248ug.C65347o0;

public final /* synthetic */ class v$$p implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ CleanChattingUI f290515d;

    /* renamed from: e */
    public final /* synthetic */ CancellationSignal f290516e;

    /* renamed from: f */
    public final /* synthetic */ int f290517f;

    /* renamed from: g */
    public final /* synthetic */ CleanChattingUI.C93016a f290518g;

    /* renamed from: h */
    public final /* synthetic */ List f290519h;

    /* renamed from: i */
    public final /* synthetic */ long[] f290520i;

    public /* synthetic */ v$$p(CleanChattingUI cleanChattingUI, CancellationSignal cancellationSignal, int i, CleanChattingUI.C93016a aVar, List list, long[] jArr) {
        this.f290515d = cleanChattingUI;
        this.f290516e = cancellationSignal;
        this.f290517f = i;
        this.f290518g = aVar;
        this.f290519h = list;
        this.f290520i = jArr;
    }

    public final void run() {
        CleanChattingUI cleanChattingUI = this.f290515d;
        CancellationSignal cancellationSignal = this.f290516e;
        int i = this.f290517f;
        CleanChattingUI.C93016a aVar = this.f290518g;
        List list = this.f290519h;
        long[] jArr = this.f290520i;
        long[] jArr2 = CleanChattingUI.f267888D;
        cleanChattingUI.getClass();
        C98896e.wx0().xx0(3, cancellationSignal);
        if (i != 0) {
            aVar.mo105959d(cancellationSignal.isCanceled(), 0);
            return;
        }
        if (WeChatEnvironment.hasDebugger() || ((C32735h) C86312j.m106911c(C32735h.class)).mo58776F5("clicfg_clean_sync_delete_message", "0").equals("1")) {
            C75604z3.m90838j(list, aVar, jArr[0], jArr[1], cancellationSignal);
        } else {
            C75604z3.m90837i(list, aVar, jArr[1]);
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            Log.m105925i("MicroMsg.CleanChattingUI", "deleteImageQueryHistory >> path: %s", list.get(i2));
            ((C65347o0) C86312j.m106911c(C65347o0.class)).mo89078iG((String) list.get(i2));
        }
    }
}
