package oh0;

import a14.C0000n0;
import a14.C53934p0;
import com.tencent.p014mm.modelcdntran.C92798v;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C7335d;
import di3.C86312j;
import fy3.C32227p;
import gy3.C87412m;
import i40.C76285g;
import i40.C98597b;
import i40.C98598e;
import java.lang.ref.WeakReference;
import kotlin.ResultKt;
import mh0.C99864d;
import o60.C100284b;
import p1081gi.C98124g;
import p1086ro.C101415b;
import p434ig.C98672d;
import p663qo.C77384i;
import ph0.C100792a;
import rx3.C13598b0;
import t60.C101725g;
import w60.C102349a;
import w60.C102350b;
import wx3.C15601d;
import x60.C102564a;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: oh0.c */
public final class C100351c extends C100284b<C100353d> {

    @C91590f(mo125468c = "com.tencent.mm.plugin.album.loader.AlbumImageDownloader$loadDataImp$1$1", mo125469f = "AlbumImageDownloader.kt", mo125470l = {37}, mo125471m = "invokeSuspend")
    /* renamed from: oh0.c$a */
    public static final class C100352a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f293925d;

        /* renamed from: e */
        public Object f293926e;

        /* renamed from: f */
        public long f293927f;

        /* renamed from: g */
        public int f293928g;

        /* renamed from: h */
        public /* synthetic */ Object f293929h;

        /* renamed from: i */
        public final /* synthetic */ C102564a<C100353d> f293930i;

        /* renamed from: j */
        public final /* synthetic */ C98124g f293931j;

        /* renamed from: n */
        public final /* synthetic */ C100284b.C100285a f293932n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C100352a(C102564a<C100353d> aVar, C98124g gVar, C100284b.C100285a aVar2, C15601d<? super C100352a> dVar) {
            super(2, dVar);
            this.f293930i = aVar;
            this.f293931j = gVar;
            this.f293932n = aVar2;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C100352a aVar = new C100352a(this.f293930i, this.f293931j, this.f293932n, dVar);
            aVar.f293929h = obj;
            return aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C100352a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            long j;
            C98672d dVar;
            String str;
            Object obj2;
            String str2;
            C13598b0 b0Var;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f293928g;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C98672d dVar2 = ((C100353d) this.f293930i.f301995a).f293935f;
                j = System.currentTimeMillis();
                Log.m105924i("MicroMsg.AlbumImageDownloader", "download from cdn, dataId: " + dVar2.mo55264K() + ", dataType: " + dVar2.mo55274P() + ", msgId: " + ((C100353d) this.f293930i.f301995a).f293933d);
                String i2 = C100792a.f295260a.mo140237i(this.f293931j.field_mediaId);
                this.f293931j.field_fullpath = i2;
                C7335d c = C86312j.m106911c(C77384i.class);
                C87412m.m108593f(c, "getService(ICdnFeatureService::class.java)");
                C98124g gVar = this.f293931j;
                this.f293929h = (C0000n0) this.f293929h;
                this.f293925d = dVar2;
                this.f293926e = i2;
                this.f293927f = j;
                this.f293928g = 1;
                obj2 = C77384i.C77385a.m93301a((C77384i) c, gVar, 0, (WeakReference) null, this, 6, (Object) null);
                if (obj2 == aVar) {
                    return aVar;
                }
                dVar = dVar2;
                str = i2;
            } else if (i == 1) {
                long j2 = this.f293927f;
                str = (String) this.f293926e;
                dVar = (C98672d) this.f293925d;
                C0000n0 n0Var = (C0000n0) this.f293929h;
                ResultKt.throwOnFailure(obj);
                j = j2;
                obj2 = obj;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C92798v vVar = (C92798v) obj2;
            if (vVar != null) {
                C102564a<C100353d> aVar2 = this.f293930i;
                C100284b.C100285a aVar3 = this.f293932n;
                int ordinal = vVar.f267130a.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1 || ordinal == 2) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("download success: event:%s, msgId: ");
                        str2 = "MicroMsg.AlbumImageDownloader";
                        sb.append(((C100353d) aVar2.f301995a).f293933d);
                        sb.append(", dataId: ");
                        sb.append(dVar.mo55264K());
                        sb.append(", download cost: %s");
                        Log.m105925i(str2, sb.toString(), vVar.f267130a.name(), String.valueOf(System.currentTimeMillis() - j));
                        aVar3.mo129425b(new C102350b(str, "", new C102349a(str)));
                        b0Var = C13598b0.f38549a;
                    } else {
                        if (ordinal != 3) {
                            if (ordinal != 7) {
                                switch (ordinal) {
                                    case 9:
                                    case 11:
                                    case 12:
                                        break;
                                    case 10:
                                        break;
                                    default:
                                        aVar3.mo129424a();
                                        Log.m105924i("MicroMsg.AlbumImageDownloader", "cdn error, action: " + vVar.f267130a + ", dataId: " + dVar.mo55264K());
                                        break;
                                }
                            }
                        }
                        str2 = "MicroMsg.AlbumImageDownloader";
                        b0Var = C13598b0.f38549a;
                    }
                }
                str2 = "MicroMsg.AlbumImageDownloader";
                Log.m105925i(str2, "download fail: event:%s, msgId: " + ((C100353d) aVar2.f301995a).f293933d + ", dataItem: " + ((C100353d) aVar2.f301995a).f293935f.mo141111s(), vVar.f267130a.name());
                aVar3.mo129424a();
                b0Var = C13598b0.f38549a;
            } else {
                str2 = "MicroMsg.AlbumImageDownloader";
                b0Var = null;
            }
            if (b0Var == null) {
                this.f293932n.mo129424a();
                Log.m105924i(str2, "cdn error, timeout, dataId: " + dVar.mo55264K());
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public void mo95802a(C102564a<C100353d> aVar, C101725g gVar, C100284b.C100285a aVar2) {
        C87412m.m108594g(aVar, "url");
        C87412m.m108594g(gVar, "fileNameCreator");
        C87412m.m108594g(aVar2, "callback");
        C98124g gVar2 = ((C100353d) aVar.f301995a).f293938i;
        if (gVar2 != null) {
            gVar2.f287658P = 4;
            C98597b.C60245a aVar3 = C98597b.f289091e;
            C7335d c = C86312j.m106911c(C99864d.class);
            C87412m.m108593f(c, "getService(AlbumFeatureService::class.java)");
            C98598e eVar = ((C101415b) aVar3.mo85231a((C98598e) c, C101415b.class)).f289092d;
            eVar.requireAccountInitialized();
            C76285g gVar3 = eVar.f289095f;
            LifecycleScope lifecycleScope = gVar3 != null ? gVar3.f223480f : null;
            if (lifecycleScope == null || LifecycleScope.launchDefault$default(lifecycleScope, (C53934p0) null, new C100352a(aVar, gVar2, aVar2, (C15601d<? super C100352a>) null), 1, (Object) null) == null) {
                aVar2.mo129424a();
                Log.m105924i("MicroMsg.AlbumImageDownloader", "launchDefault error");
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }
    }
}
