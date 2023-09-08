package gf3;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.Size;
import b62.C92177a;
import b62.C92178b;
import b62.C92179c;
import b62.C92180d;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.plugin.mediabasic.data.MediaErrorInfo;
import com.tencent.p014mm.plugin.mediabasic.data.MediaSingleInfo;
import com.tencent.p014mm.plugin.sight.base.C94554a;
import com.tencent.p014mm.plugin.sight.base.C94555d;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tav.core.AssetExportSession;
import di3.C86312j;
import ff3.C107537a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8477a0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import java.util.ArrayList;
import kotlin.Result;
import kotlin.ResultKt;
import rx3.C13598b0;
import sp3.C110801c;
import sp3.C110807k;
import tp3.C111047a;
import w80.C111750i;
import wx3.C15601d;
import wx3.C66218h;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: gf3.d */
public final class C98110d extends C98108b {

    @C91590f(mo125468c = "com.tencent.mm.remux.chain.VideoCompositionRemuxChain$remuxImpl$2", mo125469f = "VideoCompositionRemuxChain.kt", mo125470l = {34}, mo125471m = "invokeSuspend")
    /* renamed from: gf3.d$a */
    public static final class C98111a extends C91594j implements C32227p<C0000n0, C15601d<? super MediaErrorInfo>, Object> {

        /* renamed from: d */
        public Object f287586d;

        /* renamed from: e */
        public Object f287587e;

        /* renamed from: f */
        public int f287588f;

        /* renamed from: g */
        public final /* synthetic */ C92178b f287589g;

        /* renamed from: h */
        public final /* synthetic */ C92179c f287590h;

        /* renamed from: gf3.d$a$a */
        public static final class C98112a extends C87413o implements C32227p<Boolean, Integer, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ long f287591d;

            /* renamed from: e */
            public final /* synthetic */ C8477a0 f287592e;

            /* renamed from: f */
            public final /* synthetic */ C110807k f287593f;

            /* renamed from: g */
            public final /* synthetic */ C15601d<MediaErrorInfo> f287594g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C98112a(long j, C8477a0 a0Var, C110807k kVar, C15601d<? super MediaErrorInfo> dVar) {
                super(2);
                this.f287591d = j;
                this.f287592e = a0Var;
                this.f287593f = kVar;
                this.f287594g = dVar;
            }

            public Object invoke(Object obj, Object obj2) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                int intValue = ((Number) obj2).intValue();
                long ticksToNow = Util.ticksToNow(this.f287591d);
                Log.m105924i("MicroMsg.VideoCompositionRemuxChain", "export finished, success:" + booleanValue + ", errCode:" + intValue + ", cost:" + ticksToNow + ", isCallbackInvoked:" + this.f287592e.f27482d);
                if (!this.f287592e.f27482d) {
                    if (!booleanValue) {
                        C110807k kVar = this.f287593f;
                        kVar.f331515p = true;
                        AssetExportSession assetExportSession = kVar.f331518s;
                        if (assetExportSession != null) {
                            assetExportSession.cancelExport();
                        }
                    }
                    int i = (!booleanValue || intValue != 0) ? intValue == 0 ? -1 : intValue : 0;
                    C15601d<MediaErrorInfo> dVar = this.f287594g;
                    Result.Companion companion = Result.Companion;
                    dVar.resumeWith(Result.m168114constructorimpl(new MediaErrorInfo(i == 0 ? C92180d.MediaRemuxSuccess : C92180d.MediaRemuxError, i, (String) null, (Bundle) null, 8, (C8480h) null)));
                }
                return C13598b0.f38549a;
            }
        }

        /* renamed from: gf3.d$a$b */
        public /* synthetic */ class C98113b {

            /* renamed from: a */
            public static final /* synthetic */ int[] f287595a;

            static {
                int[] iArr = new int[C92177a.values().length];
                iArr[0] = 1;
                f287595a = iArr;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98111a(C92178b bVar, C92179c cVar, C15601d<? super C98111a> dVar) {
            super(2, dVar);
            this.f287589g = bVar;
            this.f287590h = cVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C98111a(this.f287589g, this.f287590h, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C98111a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C111750i.C102362a a;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f287588f;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C92178b bVar = this.f287589g;
                C92179c cVar = this.f287590h;
                this.f287586d = bVar;
                this.f287587e = cVar;
                this.f287588f = 1;
                C66218h hVar = new C66218h(C66447b.m78392b(this));
                ArrayList arrayList = new ArrayList();
                for (MediaSingleInfo mediaSingleInfo : bVar.f263829a) {
                    if (C98113b.f287595a[mediaSingleInfo.f272123d.ordinal()] == 1) {
                        C110801c cVar2 = new C110801c(mediaSingleInfo.f272124e, 2);
                        cVar2.mo162369g(1.0f);
                        cVar2.mo162368f(mediaSingleInfo.f272125f.f272114d);
                        cVar2.mo162367e(Math.min(mediaSingleInfo.f272125f.f272115e, cVar2.f331470h));
                        cVar2.mo162366d(0);
                        cVar2.mo162365c(cVar2.f331467e - cVar2.f331466d);
                        arrayList.add(cVar2);
                    }
                }
                C110807k kVar = new C110807k(arrayList);
                VideoTransPara videoTransPara = cVar.f263831a;
                kVar.f331510k = new C111047a(new C107537a(videoTransPara.f267174o, videoTransPara.f267175p));
                C94554a c = C94555d.m119567c(((C110801c) arrayList.get(0)).f331482t, true);
                if (c == null) {
                    Result.Companion companion = Result.Companion;
                    hVar.resumeWith(Result.m168114constructorimpl(new MediaErrorInfo(C92180d.MediaRemuxError, -1, "remux error", (Bundle) null, 8, (C8480h) null)));
                } else {
                    int i2 = c.f273456n;
                    int i3 = (i2 == 0 || i2 == 180) ? c.f273445c : c.f273446d;
                    int i4 = (i2 == 0 || i2 == 180) ? c.f273446d : c.f273445c;
                    kVar.mo162391n(i3, i4);
                    kVar.mo162392o(new Rect(0, 0, i3, i4));
                    kVar.mo162382d(true);
                    VideoTransPara videoTransPara2 = cVar.f263831a;
                    int i5 = videoTransPara2.f267166d;
                    int i6 = videoTransPara2.f267167e;
                    boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_mediacodec_level_limit, true);
                    Size size = new Size(i5, i6);
                    VideoTransPara videoTransPara3 = cVar.f263831a;
                    C110807k.C101693a aVar2 = new C110807k.C101693a(size, videoTransPara3.f267169g, videoTransPara3.f267168f, videoTransPara3.f267172j, videoTransPara3.f267173n, videoTransPara3.f267174o, videoTransPara3.f267175p, true, wf, false, false, 0, (Size) null, 6144, (C8480h) null);
                    String str = ((C110801c) arrayList.get(0)).f331482t;
                    C87412m.m108594g(str, "src");
                    if (Build.VERSION.SDK_INT >= 24 && (a = C111750i.f334661a.mo163488a(str)) != null) {
                        aVar2.f297717a = a.f301461a;
                        aVar2.f297718b = a.f301462b;
                        aVar2.f297719c = a.f301463c;
                    }
                    C98112a aVar3 = new C98112a(Util.currentTicks(), new C8477a0(), kVar, hVar);
                    String b = cVar.mo126140b();
                    C87412m.m108591d(b);
                    C110807k.m150875e(kVar, b, aVar2, true, aVar3, (C32226l) null, 16, (Object) null);
                }
                Object b2 = hVar.mo90314b();
                return b2 == aVar ? aVar : b2;
            } else if (i == 1) {
                C92179c cVar3 = (C92179c) this.f287587e;
                C92178b bVar2 = (C92178b) this.f287586d;
                ResultKt.throwOnFailure(obj);
                return obj;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* renamed from: c */
    public Object mo126328c(C92178b bVar, C92179c cVar, C15601d<? super MediaErrorInfo> dVar) {
        return C53895h.m60469g(C53872d1.f151119c, new C98111a(bVar, cVar, (C15601d<? super C98111a>) null), dVar);
    }
}
