package g10;

import a14.C0000n0;
import a14.C53916l;
import a14.C53921m;
import android.graphics.Bitmap;
import bl3.C39818r;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import fy3.C32227p;
import gy3.C87412m;
import ht1.C60200t1;
import k60.C99102f;
import kotlin.Result;
import kotlin.ResultKt;
import l60.C99344b;
import pl1.C100810g0;
import pl1.C11990s0;
import pl1.C62368t0;
import r60.C101339a;
import r60.C101350i;
import rx3.C13598b0;
import t60.C64205a;
import t60.C64206c;
import te3.C64689rq2;
import up1.C27696y;
import w60.C102353e;
import wx3.C15601d;
import x60.C102564a;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.flutter.plugin.data_sources.finder.FinderDataSource$getImageFile$2", mo125469f = "FinderDataSource.kt", mo125470l = {121}, mo125471m = "invokeSuspend")
/* renamed from: g10.d */
public final class C59341d extends C91594j implements C32227p<C0000n0, C15601d<? super String>, Object> {

    /* renamed from: d */
    public Object f169633d;

    /* renamed from: e */
    public int f169634e;

    /* renamed from: f */
    public final /* synthetic */ String f169635f;

    /* renamed from: g */
    public final /* synthetic */ String f169636g;

    /* renamed from: h */
    public final /* synthetic */ String f169637h;

    /* renamed from: i */
    public final /* synthetic */ String f169638i;

    /* renamed from: g10.d$a */
    public static final class C59342a implements C64206c<C100810g0> {

        /* renamed from: a */
        public final /* synthetic */ C53916l<String> f169639a;

        public C59342a(C53916l<? super String> lVar) {
            this.f169639a = lVar;
        }

        /* renamed from: a */
        public void mo84453a(C102564a<C100810g0> aVar, C101350i<?> iVar) {
            Log.m105928w("MicroMsg.FinderDataSource", "onImageLoadStart: " + aVar);
        }

        /* renamed from: b */
        public void mo84454b(C102564a<C100810g0> aVar, C101350i<?> iVar, C102353e<?> eVar) {
            C87412m.m108594g(aVar, "url");
            String i = C86013q1.m106448i(((C100810g0) aVar.f301995a).getPath(), false);
            Log.m105924i("MicroMsg.FinderDataSource", "onImageLoadFinish: url=" + aVar + ", path=" + i);
            this.f169639a.resumeWith(Result.m168114constructorimpl(i));
        }
    }

    /* renamed from: g10.d$b */
    public static final class C59343b implements C64205a {

        /* renamed from: a */
        public final /* synthetic */ C53916l<String> f169640a;

        public C59343b(C53916l<? super String> lVar) {
            this.f169640a = lVar;
        }

        /* renamed from: a */
        public final void mo729a(boolean z, Object[] objArr) {
            Log.m105928w("MicroMsg.FinderDataSource", "onImageDownload: success=" + z);
            if (!z) {
                this.f169640a.resumeWith(Result.m168114constructorimpl((Object) null));
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59341d(String str, String str2, String str3, String str4, C15601d<? super C59341d> dVar) {
        super(2, dVar);
        this.f169635f = str;
        this.f169636g = str2;
        this.f169637h = str3;
        this.f169638i = str4;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C59341d(this.f169635f, this.f169636g, this.f169637h, this.f169638i, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C59341d) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f169634e;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Log.m105924i("MicroMsg.FinderDataSource", "getImageFile(" + this.f169635f + ", " + this.f169636g + ", " + this.f169637h + ", " + this.f169638i);
            C64689rq2 rq22 = new C64689rq2();
            rq22.f185275p = MD5Util.getMD5String(this.f169636g);
            String str2 = this.f169636g;
            rq22.f185266d = str2;
            String str3 = this.f169637h;
            rq22.f185286y = str3;
            rq22.f185284x = this.f169638i;
            rq22.f185267e = str2;
            rq22.f185288z = str3;
            if (str2 == null || (str = MD5Util.getMD5String(str2)) == null) {
                str = "";
            }
            rq22.f185285x0 = str;
            C100810g0 ti = ((C62368t0) C86312j.m106911c(C62368t0.class)).mo87414ti(rq22, C27696y.RAW_IMAGE, this.f169635f);
            this.f169633d = ti;
            this.f169634e = 1;
            C53921m mVar = new C53921m(C66447b.m78392b(this), 1);
            mVar.mo74609p();
            C99344b<C100810g0, Bitmap> a = ((C11990s0) C39818r.f106831a.mo62446e(C60200t1.class).mo62447c(C11990s0.class)).mo11871f2().mo85955a(ti);
            C59342a aVar2 = new C59342a(mVar);
            a.getClass();
            a.f291322f = aVar2;
            a.f291324h = new C59343b(mVar);
            a.f291326j = new C101339a();
            C99102f fVar = new C99102f(a, a.f291318b);
            fVar.f290591t = fVar.f290572a.f291317a;
            fVar.mo138482b();
            obj = mVar.mo74608o();
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
