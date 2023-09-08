package fm1;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import o40.C61926c;
import rx3.C13598b0;
import vc1.C37715b;

/* renamed from: fm1.h */
public final class C8157h extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C8139f f27030d;

    /* renamed from: e */
    public final /* synthetic */ String f27031e;

    /* renamed from: f */
    public final /* synthetic */ String f27032f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8157h(C8139f fVar, String str, String str2) {
        super(0);
        this.f27030d = fVar;
        this.f27031e = str;
        this.f27032f = str2;
    }

    public Object invoke() {
        C8139f fVar = this.f27030d;
        String str = this.f27031e;
        fVar.getClass();
        C87412m.m108594g(str, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        Log.m105924i("NearbyActionBarUIC", "setNearbyVideoTabTitle title:" + str);
        View findViewById = fVar.getActivity().findViewById(C0966R.C0970id.kcw);
        if (findViewById != null) {
            findViewById.post(new C8163n(str, fVar, findViewById));
        }
        if (C37715b.f99914a.mo61298a()) {
            C8139f fVar2 = this.f27030d;
            String str2 = this.f27032f;
            fVar2.getClass();
            Log.m105924i("NearbyActionBarUIC", "setNearbyLiveTabTitle title:" + str2);
            C61926c.m72668M(new C8162m(str2, fVar2));
        }
        return C13598b0.f38549a;
    }
}
