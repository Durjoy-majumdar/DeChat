package ha0;

import android.content.Context;
import com.tencent.maas.camerafun.MJAudioDeviceType;
import com.tencent.maas.camerafun.MJAuditCaptureSettings;
import com.tencent.maas.instamovie.MJRecordingSettings;
import com.tencent.maas.instamovie.base.MJError;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import es3.C107290a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import ha0.C108210m;
import rx3.C13598b0;

/* renamed from: ha0.o */
public final class C108214o extends C87413o implements C32226l<C32226l<? super MJError, ? extends C13598b0>, MJError> {

    /* renamed from: d */
    public final /* synthetic */ C108210m f324017d;

    /* renamed from: e */
    public final /* synthetic */ String f324018e;

    /* renamed from: f */
    public final /* synthetic */ MJRecordingSettings f324019f;

    /* renamed from: g */
    public final /* synthetic */ MJAuditCaptureSettings f324020g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C108214o(C108210m mVar, String str, MJRecordingSettings mJRecordingSettings, MJAuditCaptureSettings mJAuditCaptureSettings) {
        super(1);
        this.f324017d = mVar;
        this.f324018e = str;
        this.f324019f = mJRecordingSettings;
        this.f324020g = mJAuditCaptureSettings;
    }

    public Object invoke(Object obj) {
        C32226l lVar = (C32226l) obj;
        C87412m.m108594g(lVar, LocaleUtil.ITALIAN);
        C107290a aVar = C107290a.f321014a;
        Context context = MMApplicationContext.getContext();
        C87412m.m108593f(context, "getContext()");
        MJAudioDeviceType a = aVar.mo157794a(context);
        Log.m105924i("MicroMsg.CamFunSessionManager", "startRecording audiotype:" + a);
        this.f324017d.f324011a.setAudioDeviceType(a);
        return this.f324017d.f324011a.startRecording(this.f324018e, this.f324019f, this.f324020g, new C108210m.C108211a(lVar));
    }
}
