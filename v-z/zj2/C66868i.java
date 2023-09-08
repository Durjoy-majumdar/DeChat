package zj2;

import android.content.Context;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.thumbplayer.api.ITPPlayer;
import d03.C58010a;
import fy3.C32226l;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import j03.C60695a;
import j03.C60698b;
import j03.C60700d;
import rx3.C13598b0;
import wj2.C66130c;

/* renamed from: zj2.i */
public final class C66868i extends C66857b {

    /* renamed from: c */
    public final C60700d f192096c;

    /* renamed from: zj2.i$a */
    public static final class C39365a extends C87413o implements C32228q<ITPPlayer, Integer, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C32226l<Exception, C13598b0> f105794d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C39365a(C32226l<? super Exception, C13598b0> lVar) {
            super(3);
            this.f105794d = lVar;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            ITPPlayer iTPPlayer = (ITPPlayer) obj;
            int intValue = ((Number) obj2).intValue();
            int intValue2 = ((Number) obj3).intValue();
            Log.m105920e("MicroMsg.RingtonePlayer", "onTPPlayError, errorCode:" + intValue + ", errorType:" + intValue2);
            C32226l<Exception, C13598b0> lVar = this.f105794d;
            lVar.invoke(new IllegalStateException("MMCdnTPPlayer play error! code:" + intValue + ", type:" + intValue2));
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66868i(C58010a aVar, C66130c cVar, boolean z) {
        super(aVar, cVar, z);
        C87412m.m108594g(aVar, "mediaInfo");
        C87412m.m108594g(cVar, "soundInfo");
        Context context = MMApplicationContext.getContext();
        C87412m.m108593f(context, "getContext()");
        this.f192096c = new C60700d(context);
    }

    /* renamed from: a */
    public void mo36971a(float f, float f2) {
        C60700d dVar = this.f192096c;
        String str = dVar.f172871b;
        Log.m105924i(str, "setVolume: " + f);
        C60698b bVar = dVar.f172872c;
        if (bVar != null) {
            bVar.setAudioGainRatio(f);
        }
    }

    /* renamed from: b */
    public long mo36972b() {
        return this.f192096c.getCurrentPositionMs();
    }

    /* renamed from: c */
    public int mo36973c() {
        return this.f192039b.f190069b;
    }

    /* renamed from: d */
    public boolean mo36974d() {
        return this.f192096c.isPlaying();
    }

    /* renamed from: e */
    public void mo36975e() {
        C60695a.C60696a.m70998a(this.f192096c, false, 1, (Object) null);
    }

    /* renamed from: f */
    public void mo36976f() {
        this.f192096c.mo85619m();
    }

    /* renamed from: g */
    public void mo36977g(long j) {
        this.f192096c.setMediaInfo(this.f192038a);
        this.f192096c.setLoop(this.f192038a.f165940l);
        C60700d dVar = this.f192096c;
        dVar.f172880k = true;
        dVar.f172869F = j;
        dVar.f172895z = this.f192039b.f190069b;
    }

    /* renamed from: h */
    public void mo36978h() {
        this.f192096c.recycle();
    }

    /* renamed from: i */
    public void mo36979i(boolean z) {
        this.f192096c.setMute(z);
    }

    /* renamed from: j */
    public void mo36980j(C32226l<? super Exception, C13598b0> lVar) {
        C87412m.m108594g(lVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        C60700d dVar = this.f192096c;
        C39365a aVar = new C39365a(lVar);
        dVar.f172887r = aVar;
        int i = dVar.f172867D.f171744k;
        if (i != 1000) {
            aVar.invoke(dVar.f172872c, Integer.valueOf(i), Integer.valueOf(dVar.f172867D.f171743j));
        }
    }

    /* renamed from: k */
    public void mo36981k() {
        this.f192096c.stopAsync();
    }
}
