package os2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: os2.n */
public final class C62173n {

    /* renamed from: a */
    public static final C62173n f176771a = new C62173n();

    /* renamed from: b */
    public static final C13601g f176772b = C36568h.m40985a(C62174a.f176773d);

    /* renamed from: os2.n$a */
    public static final class C62174a extends C87413o implements C32224a<MMHandler> {

        /* renamed from: d */
        public static final C62174a f176773d = new C62174a();

        public C62174a() {
            super(0);
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.FinderSnsLiveStatusSyncSaver$handler$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.FinderSnsLiveStatusSyncSaver$handler$2");
            C62173n nVar = C62173n.f176771a;
            SnsMethodCalculate.markStartTimeMs("access$getTAG$p", "com.tencent.mm.plugin.sns.storage.FinderSnsLiveStatusSyncSaver");
            SnsMethodCalculate.markEndTimeMs("access$getTAG$p", "com.tencent.mm.plugin.sns.storage.FinderSnsLiveStatusSyncSaver");
            MMHandler mMHandler = new MMHandler("FinderSnsLiveStatusSyncSaver", (MMHandler.Callback) C62172m.f176770d);
            mMHandler.setLogging(false);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.FinderSnsLiveStatusSyncSaver$handler$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.FinderSnsLiveStatusSyncSaver$handler$2");
            return mMHandler;
        }
    }

    /* renamed from: a */
    public final MMHandler mo87230a() {
        SnsMethodCalculate.markStartTimeMs("getHandler", "com.tencent.mm.plugin.sns.storage.FinderSnsLiveStatusSyncSaver");
        MMHandler mMHandler = (MMHandler) ((C36570n) f176772b).getValue();
        SnsMethodCalculate.markEndTimeMs("getHandler", "com.tencent.mm.plugin.sns.storage.FinderSnsLiveStatusSyncSaver");
        return mMHandler;
    }
}
