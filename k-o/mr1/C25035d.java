package mr1;

import cm1.C55015f1;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import mr1.C25026b;
import p1081gi.C98121d;
import rx3.C13598b0;

/* renamed from: mr1.d */
public final class C25035d extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C25026b.C25027a f71438d;

    /* renamed from: e */
    public final /* synthetic */ C25026b.C25033c f71439e;

    /* renamed from: f */
    public final /* synthetic */ String f71440f;

    /* renamed from: g */
    public final /* synthetic */ C25026b f71441g;

    /* renamed from: h */
    public final /* synthetic */ boolean f71442h;

    /* renamed from: i */
    public final /* synthetic */ C25026b.C25029d f71443i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25035d(C25026b.C25027a aVar, C25026b.C25033c cVar, String str, C25026b bVar, boolean z, C25026b.C25029d dVar) {
        super(0);
        this.f71438d = aVar;
        this.f71439e = cVar;
        this.f71440f = str;
        this.f71441g = bVar;
        this.f71442h = z;
        this.f71443i = dVar;
    }

    public Object invoke() {
        C25026b.C25027a aVar = this.f71438d;
        aVar.f71370C = true;
        long j = aVar.f71397j;
        C25026b.C25033c cVar = this.f71439e;
        C98121d dVar = cVar.f71434d;
        if (dVar != null) {
            C25026b.C25027a.f71367U.mo52140e(aVar, dVar);
            C25026b.C25027a aVar2 = this.f71438d;
            if (aVar2.f71386S != null) {
                C25026b.C25033c cVar2 = this.f71439e;
                C55015f1 f1Var = cVar2.f71433c;
                aVar2.f71374G = f1Var != null ? f1Var.field_cacheSize : 0;
                C98121d dVar2 = cVar2.f71434d;
                C87412m.m108591d(dVar2);
                long j2 = dVar2.field_recvedBytes;
                C25026b.C25027a aVar3 = this.f71438d;
                long j3 = aVar3.f71374G - aVar3.f71373F;
                long j4 = j2 - j3;
                if (j3 < 0 || j4 < 0) {
                    C25026b.C25027a aVar4 = aVar3.f71386S;
                    C87412m.m108591d(aVar4);
                    aVar4.f71397j = 0;
                    C25026b.C25027a aVar5 = this.f71438d;
                    aVar5.f71397j = j2;
                    aVar5.f71381N = true;
                    Log.m105924i("FinderNetworkFlowReport", "PLAY_handleOnPlayItemClose#closeitem segment invalid trp:" + j2 + '-' + j4 + '-' + j3 + "  " + this.f71438d.f71384Q + ' ' + this.f71440f);
                } else {
                    aVar3.f71381N = true;
                    C25026b.C25027a aVar6 = aVar3.f71386S;
                    C87412m.m108591d(aVar6);
                    aVar6.f71397j = j4;
                    this.f71438d.f71397j = j3;
                    Log.m105928w("FinderNetworkFlowReport", "PLAY_handleOnPlayItemClose#closeitem segment valid trp:" + j2 + '-' + j4 + '-' + j3 + "  " + this.f71438d.f71384Q + ' ' + this.f71440f);
                }
            } else {
                Log.m105924i("FinderNetworkFlowReport", "PLAY_handleOnPlayItemClose#closeitem " + this.f71438d.f71384Q + ' ' + this.f71440f);
            }
            C25026b bVar = this.f71441g;
            C98121d dVar3 = this.f71439e.f71434d;
            C87412m.m108591d(dVar3);
            bVar.mo52126c(dVar3.field_recvedBytes);
        } else {
            C55015f1 f1Var2 = cVar.f71433c;
            if (f1Var2 != null) {
                C25026b.C25027a.f71367U.mo52139d(aVar, f1Var2);
                Log.m105924i("FinderNetworkFlowReport", "PLAY_handleOnPlayItemClose#closeitem " + this.f71438d.f71384Q + ' ' + this.f71440f + " updateFromMediaCacheOnStop from " + this.f71438d.f71397j);
            } else {
                Log.m105924i("FinderNetworkFlowReport", "PLAY_handleOnPlayItemClose#closeitem " + this.f71438d.f71384Q + ' ' + this.f71440f + " invalid state.");
            }
        }
        if (j > 0) {
            this.f71438d.f71397j += j;
            Log.m105924i("FinderNetworkFlowReport", "PLAY_handleOnPlayItemClose#onDownloaderStop " + this.f71442h + ' ' + this.f71438d.f71384Q + ' ' + this.f71440f + " beforeItemSize:" + j + ' ' + this.f71438d);
        } else {
            Log.m105924i("FinderNetworkFlowReport", "PLAY_handleOnPlayItemClose#onDownloaderStop " + this.f71442h + ' ' + this.f71438d.f71384Q + ' ' + this.f71440f + ' ' + this.f71438d);
        }
        if (this.f71442h) {
            C25026b.m31704a(this.f71441g, this.f71438d.f71409v, this.f71443i, "handleOnPlayItemClose#" + this.f71440f);
        }
        return C13598b0.f38549a;
    }
}
