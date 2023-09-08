package ba0;

import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.mj_template.api.MJTemplateSession;
import com.tencent.p014mm.mj_template.api.MaasAlbumTemplateRequestParams;
import com.tencent.p014mm.mm_compose.MMComposeView;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import la0.C61242a;
import nj3.C76912y0;
import p175j0.C108504h;
import p415q0.C110261c;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C64186f0;
import te3.pr4;
import va0.C111510j;
import wx3.C15601d;
import y90.C66559c;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: ba0.d */
public final class C54438d extends C66559c {

    /* renamed from: o */
    public final C13601g f152685o = C36568h.m40985a(new C54441c(this));

    @C91590f(mo125468c = "com.tencent.mm.mj_template.album_template.single_template.MaasAlbumTemplateOverlayUIC", mo125469f = "MaasAlbumTemplateOverlayUIC.kt", mo125470l = {39, 40}, mo125471m = "beforeInitMovieSession")
    /* renamed from: ba0.d$a */
    public static final class C54439a extends C66704d {

        /* renamed from: d */
        public Object f152686d;

        /* renamed from: e */
        public /* synthetic */ Object f152687e;

        /* renamed from: f */
        public final /* synthetic */ C54438d f152688f;

        /* renamed from: g */
        public int f152689g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54439a(C54438d dVar, C15601d<? super C54439a> dVar2) {
            super(dVar2);
            this.f152688f = dVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f152687e = obj;
            this.f152689g |= Integer.MIN_VALUE;
            return this.f152688f.mo75243f0(this);
        }
    }

    /* renamed from: ba0.d$b */
    public static final class C54440b extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C54438d f152690d;

        /* renamed from: e */
        public final /* synthetic */ C61242a f152691e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54440b(C54438d dVar, C61242a aVar) {
            super(2);
            this.f152690d = dVar;
            this.f152691e = aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            C108504h hVar = (C108504h) obj;
            if ((((Number) obj2).intValue() & 11) != 2 || !hVar.mo51575a()) {
                C111510j.m152007a(C110261c.m149878b(hVar, -1441591948, true, new C54443g(this.f152690d, this.f152691e)), hVar, 6);
            } else {
                hVar.mo51581d();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ba0.d$c */
    public static final class C54441c extends C87413o implements C32224a<MaasAlbumTemplateRequestParams> {

        /* renamed from: d */
        public final /* synthetic */ C54438d f152692d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54441c(C54438d dVar) {
            super(0);
            this.f152692d = dVar;
        }

        public Object invoke() {
            MaasAlbumTemplateRequestParams maasAlbumTemplateRequestParams = (MaasAlbumTemplateRequestParams) this.f152692d.getIntent().getParcelableExtra("request_params");
            if (maasAlbumTemplateRequestParams != null) {
                return maasAlbumTemplateRequestParams;
            }
            C54438d dVar = this.f152692d;
            Log.m105920e("MaasAlbumTemplateOverlayUIC", "do not get request params");
            dVar.getContext().finish();
            return new MaasAlbumTemplateRequestParams(C64186f0.f181907d, new MJTemplateSession(new byte[1], (String) null, 2, (C8480h) null));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54438d(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001c, code lost:
        r2 = (r2 = r2.f153250b).getValue();
     */
    /* renamed from: d3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public rx3.C13604l<java.lang.String, java.lang.String> mo75242d3() {
        /*
            r3 = this;
            rx3.l r0 = new rx3.l
            com.tencent.mm.mj_template.api.MaasAlbumTemplateRequestParams r1 = r3.mo75245l3()
            com.tencent.mm.mj_template.api.MJTemplateSession r1 = r1.f157475e
            rx3.g r1 = r1.f157467f
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            te3.pr4 r1 = (te3.pr4) r1
            java.lang.String r1 = r1.f139919d
            ca0.f0 r2 = r3.f191426h
            if (r2 == 0) goto L_0x0029
            j0.k2<com.tencent.maas.model.MJMusicInfo> r2 = r2.f153250b
            if (r2 == 0) goto L_0x0029
            java.lang.Object r2 = r2.getValue()
            com.tencent.maas.model.MJMusicInfo r2 = (com.tencent.maas.model.MJMusicInfo) r2
            if (r2 == 0) goto L_0x0029
            java.lang.String r2 = r2.getMusicID()
            goto L_0x002a
        L_0x0029:
            r2 = 0
        L_0x002a:
            if (r2 != 0) goto L_0x002e
            java.lang.String r2 = ""
        L_0x002e:
            r0.<init>(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ba0.C54438d.mo75242d3():rx3.l");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: f0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo75243f0(wx3.C15601d<? super rx3.C13598b0> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ba0.C54438d.C54439a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            ba0.d$a r0 = (ba0.C54438d.C54439a) r0
            int r1 = r0.f152689g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f152689g = r1
            goto L_0x0018
        L_0x0013:
            ba0.d$a r0 = new ba0.d$a
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f152687e
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f152689g
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L_0x003a
            if (r2 == r3) goto L_0x0032
            if (r2 != r4) goto L_0x002a
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x006c
        L_0x002a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0032:
            java.lang.Object r2 = r0.f152686d
            ba0.d r2 = (ba0.C54438d) r2
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x0047
        L_0x003a:
            kotlin.ResultKt.throwOnFailure(r6)
            r0.f152686d = r5
            r0.f152689g = r3
            rx3.b0 r6 = rx3.C13598b0.f38549a
            if (r6 != r1) goto L_0x0046
            return r1
        L_0x0046:
            r2 = r5
        L_0x0047:
            qa0.b r6 = qa0.C62586b.f177739a
            com.tencent.mm.mj_template.api.MaasAlbumTemplateRequestParams r2 = r2.mo75245l3()
            com.tencent.mm.mj_template.api.MJTemplateSession r2 = r2.f157475e
            rx3.g r2 = r2.f157467f
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            te3.pr4 r2 = (te3.pr4) r2
            java.lang.String r2 = r2.f139919d
            java.lang.String r3 = "mRequestParams.mjTemplateSession.templateInfo.id"
            gy3.C87412m.m108593f(r2, r3)
            r3 = 0
            r0.f152686d = r3
            r0.f152689g = r4
            java.lang.Object r6 = r6.mo87644d(r2, r4, r0)
            if (r6 != r1) goto L_0x006c
            return r1
        L_0x006c:
            te3.pr4 r6 = (te3.pr4) r6
            if (r6 == 0) goto L_0x0077
            java.lang.String r6 = "MaasAlbumTemplateOverlayUIC"
            java.lang.String r0 = "get template info error, can not start creation"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)
        L_0x0077:
            rx3.b0 r6 = rx3.C13598b0.f38549a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ba0.C54438d.mo75243f0(wx3.d):java.lang.Object");
    }

    /* renamed from: g3 */
    public void mo75244g3() {
        MMComposeView mMComposeView = (MMComposeView) ((C36570n) this.f191422d).getValue();
        mMComposeView.setPadding(0, C75044y4.m89994f(mMComposeView.getContext()), 0, 0);
        C39818r rVar = C39818r.f106831a;
        Context context = mMComposeView.getContext();
        C87412m.m108593f(context, "context");
        mMComposeView.setContent(C110261c.m149879c(1385594958, true, new C54440b(this, (C61242a) rVar.mo62443b(context).mo62447c(C61242a.class))));
    }

    /* renamed from: l3 */
    public final MaasAlbumTemplateRequestParams mo75245l3() {
        return (MaasAlbumTemplateRequestParams) ((C36570n) this.f152685o).getValue();
    }

    public void onCreateBefore(Bundle bundle) {
        super.onCreateBefore(bundle);
        C61242a aVar = (C61242a) C39818r.f106831a.mo62443b(getContext()).mo62447c(C61242a.class);
        aVar.setMediaList(mo75245l3().f157474d);
        String str = ((pr4) ((C36570n) mo75245l3().f157475e.f157467f).getValue()).f139919d;
        C87412m.m108593f(str, "mRequestParams.mjTemplateSession.templateInfo.id");
        aVar.mo86220d1(str, mo75245l3().f157475e.f157466e);
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            ((MMComposeView) ((C36570n) this.f191422d).getValue()).setPadding(0, C75044y4.m89994f(getContext()), 0, C75044y4.m89991c(getContext()));
        }
    }

    /* renamed from: p */
    public void mo75247p(String str) {
        C87412m.m108594g(str, "msg");
        C76912y0.makeText((Context) getContext(), (CharSequence) getContext().getString(C0966R.string.lqd), 0).show();
        Log.m105920e("MaasAlbumTemplateOverlayUIC", str);
        getContext().finish();
    }
}
