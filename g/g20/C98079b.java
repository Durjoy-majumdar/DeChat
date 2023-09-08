package g20;

import com.tencent.p014mm.graphics.p314ui.WxBaseImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import e20.C86418c;
import e20.C97585a;
import e20.C97586b;
import e20.C97588f;
import f20.C20644a;
import java.util.HashMap;

/* renamed from: g20.b */
public class C98079b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ WxBaseImageView f287547d;

    public C98079b(WxBaseImageView wxBaseImageView) {
        this.f287547d = wxBaseImageView;
    }

    public void run() {
        C86418c cVar;
        C97586b bVar;
        synchronized (this) {
            Log.m105925i("MicroMsg.WxBaseImageView", "alvinluo reportPerformanceInfo threadId: %d", Long.valueOf(Thread.currentThread().getId()));
            C97588f fVar = C97588f.INSTANCE;
            synchronized (fVar.f286318h) {
                HashMap<Integer, C97586b> hashMap = fVar.f286315e;
                if (hashMap == null || (bVar = hashMap.get(2)) == null || !(bVar instanceof C86418c)) {
                    cVar = null;
                } else {
                    bVar.mo120828b();
                    cVar = (C86418c) bVar;
                }
            }
            C20644a.INSTANCE.mo32326b((C97585a) null, cVar);
            WxBaseImageView wxBaseImageView = this.f287547d;
            wxBaseImageView.f48901w = true;
            wxBaseImageView.getClass();
            try {
                MMHandler mMHandler = wxBaseImageView.f48903y;
                if (mMHandler != null) {
                    mMHandler.quit();
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.WxBaseImageView", e, "alvinluo quitReportThread exception", new Object[0]);
            }
        }
    }
}
