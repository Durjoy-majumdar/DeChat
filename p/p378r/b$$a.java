package p378r;

import androidx.camera.camera2.interop.CaptureRequestOptions;
import androidx.camera.core.impl.Config;

/* renamed from: r.b$$a */
public final /* synthetic */ class b$$a implements Config.OptionMatcher {

    /* renamed from: a */
    public final /* synthetic */ CaptureRequestOptions.Builder f62802a;

    /* renamed from: b */
    public final /* synthetic */ Config f62803b;

    public /* synthetic */ b$$a(CaptureRequestOptions.Builder builder, Config config) {
        this.f62802a = builder;
        this.f62803b = config;
    }

    public final boolean onOptionMatched(Config.Option option) {
        return this.f62802a.getMutableConfig().insertOption(option, this.f62803b.getOptionPriority(option), this.f62803b.retrieveOption(option));
    }
}
