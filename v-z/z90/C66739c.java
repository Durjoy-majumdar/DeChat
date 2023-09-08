package z90;

import a14.C0000n0;
import a14.C53884f2;
import a14.C53895h;
import a14.C53934p0;
import a14.C53973z1;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0120a0;
import androidx.lifecycle.C0125s;
import bl3.C39818r;
import bp3.C104160f;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.mj_template.album_template.multi_template.MMMusicManager;
import com.tencent.p014mm.mj_template.api.MaasAlbumMultiTemplateRequestParams;
import com.tencent.p014mm.mj_template.api.MaasAlbumTemplateSnsFeedInfo;
import com.tencent.p014mm.mj_template.sns.compose.widget.C55319n1;
import com.tencent.p014mm.mj_template.sns.compose.widget.C55366y1;
import com.tencent.p014mm.mm_compose.MMComposeView;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem;
import com.tencent.p014mm.plugin.recordvideo.activity.MMRecordUI;
import com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import d14.C45253g;
import di3.C86312j;
import f40.C86709a0;
import f40.C86718e;
import fy3.C32224a;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C8477a0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import h81.C59774i;
import ha0.C108221t;
import ha0.C59807w0;
import iy3.C60641c;
import j20.C117292a;
import ja0.C60781a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import kotlin.ResultKt;
import l31.C61212e;
import la0.C61242a;
import na0.C61630a;
import nj3.C76912y0;
import p175j0.C108494d2;
import p175j0.C108497e2;
import p175j0.C108500f2;
import p175j0.C108504h;
import p175j0.C60690y0;
import p415q0.C110261c;
import p823sg.C77710q;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13602i;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import sx3.C26236u;
import sx3.C36907w;
import sx3.C64186f0;
import sx3.C90364q0;
import te3.C64726td1;
import va0.C111510j;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import y90.C66559c;
import y90.C66581h;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: z90.c */
public final class C66739c extends C66559c {

    /* renamed from: A */
    public final C60690y0 f191777A;

    /* renamed from: o */
    public CaptureDataManager.C94403b f191778o;

    /* renamed from: p */
    public boolean f191779p;

    /* renamed from: q */
    public final Intent f191780q = new Intent();

    /* renamed from: r */
    public final String f191781r;

    /* renamed from: s */
    public final C13601g f191782s;

    /* renamed from: t */
    public final C13601g f191783t;

    /* renamed from: u */
    public final C13601g f191784u;

    /* renamed from: v */
    public final C60690y0 f191785v;

    /* renamed from: w */
    public final C13601g f191786w;

    /* renamed from: x */
    public final C66746g f191787x;

    /* renamed from: y */
    public final C55366y1 f191788y;

    /* renamed from: z */
    public final C13601g f191789z;

    /* renamed from: z90.c$k */
    public static final class C39325k extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C39325k f105720d = new C39325k();

        public C39325k() {
            super(0);
        }

        public Object invoke() {
            boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_finder_maas_spring_offline, false);
            Log.m105924i("FinderMaasXConfigImpl", "offlineStrategy: " + wf);
            return Boolean.valueOf(wf);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.album_template.multi_template.MaasAlbumMultiTemplateOverlayUIC", mo125469f = "MaasAlbumMultiTemplateOverlayUIC.kt", mo125470l = {166}, mo125471m = "beforeInitMovieSession")
    /* renamed from: z90.c$a */
    public static final class C66740a extends C66704d {

        /* renamed from: d */
        public Object f191790d;

        /* renamed from: e */
        public /* synthetic */ Object f191791e;

        /* renamed from: f */
        public final /* synthetic */ C66739c f191792f;

        /* renamed from: g */
        public int f191793g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66740a(C66739c cVar, C15601d<? super C66740a> dVar) {
            super(dVar);
            this.f191792f = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f191791e = obj;
            this.f191793g |= Integer.MIN_VALUE;
            return this.f191792f.mo75243f0(this);
        }
    }

    /* renamed from: z90.c$b */
    public /* synthetic */ class C66741b implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ C55366y1 f191794d;

        public C66741b(C55366y1 y1Var) {
            this.f191794d = y1Var;
        }

        public void onChanged(Object obj) {
            List list = (List) obj;
            C87412m.m108594g(list, "p0");
            this.f191794d.mo76621d(list);
        }
    }

    /* renamed from: z90.c$c */
    public static final class C66742c<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ C66739c f191795d;

        public C66742c(C66739c cVar) {
            this.f191795d = cVar;
        }

        public void onChanged(Object obj) {
            C59807w0 w0Var = (C59807w0) obj;
            Log.m105924i("MaasMultiTemplate.MaasAlbumMultiTemplateOverlayUIC", "initView: recommend " + w0Var);
            if (w0Var.f170712c) {
                boolean z = false;
                int dl02 = ((C32735h) C86312j.m106911c(C32735h.class)).dl0(C32735h.C32737c.clicfg_finder_maas_recomend_fallback_type, C104160f.RepairerConfig_Maas_FinderFallBack_Int, 0);
                Log.m105924i("FinderMaasXConfigImpl", "finder fallback " + dl02);
                if (dl02 == 1) {
                    z = true;
                }
                if (z) {
                    C66739c cVar = this.f191795d;
                    C53895h.m60466d(cVar.getLifecycleScope(), (C66212f) null, (C53934p0) null, new C66757g(cVar, (C15601d<? super C66757g>) null), 3, (Object) null);
                }
            }
        }
    }

    /* renamed from: z90.c$d */
    public static final class C66743d extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C66739c f191796d;

        /* renamed from: e */
        public final /* synthetic */ int f191797e;

        /* renamed from: f */
        public final /* synthetic */ C61242a f191798f;

        /* renamed from: g */
        public final /* synthetic */ List<String> f191799g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66743d(C66739c cVar, int i, C61242a aVar, List<String> list) {
            super(2);
            this.f191796d = cVar;
            this.f191797e = i;
            this.f191798f = aVar;
            this.f191799g = list;
        }

        public Object invoke(Object obj, Object obj2) {
            C108504h hVar = (C108504h) obj;
            if ((((Number) obj2).intValue() & 11) != 2 || !hVar.mo51575a()) {
                C111510j.m152007a(C110261c.m149878b(hVar, -1465541417, true, new C66756f(this.f191796d, this.f191797e, this.f191798f, this.f191799g)), hVar, 6);
            } else {
                hVar.mo51581d();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: z90.c$e */
    public static final class C66744e extends C87413o implements C32224a<MaasAlbumMultiTemplateRequestParams> {

        /* renamed from: d */
        public final /* synthetic */ C66739c f191800d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66744e(C66739c cVar) {
            super(0);
            this.f191800d = cVar;
        }

        public Object invoke() {
            MaasAlbumMultiTemplateRequestParams maasAlbumMultiTemplateRequestParams = (MaasAlbumMultiTemplateRequestParams) this.f191800d.getIntent().getParcelableExtra("request_params");
            return maasAlbumMultiTemplateRequestParams == null ? new MaasAlbumMultiTemplateRequestParams(C64186f0.f181907d, false, false, false, (MaasAlbumTemplateSnsFeedInfo) null, 30, (C8480h) null) : maasAlbumMultiTemplateRequestParams;
        }
    }

    /* renamed from: z90.c$f */
    public static final class C66745f extends C87413o implements C32224a<MMMusicManager> {

        /* renamed from: d */
        public final /* synthetic */ C66739c f191801d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66745f(C66739c cVar) {
            super(0);
            this.f191801d = cVar;
        }

        public Object invoke() {
            C0000n0 lifecycleScope = this.f191801d.getLifecycleScope();
            List<GalleryItem$MediaItem> list = this.f191801d.mo90775o3().f157469d;
            ArrayList arrayList = new ArrayList();
            for (T next : list) {
                boolean z = true;
                if (((GalleryItem$MediaItem) next).getType() != 1) {
                    z = false;
                }
                if (z) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(C36907w.m41090l(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((GalleryItem$MediaItem) it.next()).f162747d);
            }
            return new MMMusicManager(lifecycleScope, arrayList2);
        }
    }

    /* renamed from: z90.c$g */
    public static final class C66746g implements C66759i {

        /* renamed from: a */
        public final /* synthetic */ C66739c f191802a;

        /* renamed from: b */
        public final /* synthetic */ AppCompatActivity f191803b;

        public C66746g(C66739c cVar, AppCompatActivity appCompatActivity) {
            this.f191802a = cVar;
            this.f191803b = appCompatActivity;
        }

        /* renamed from: a */
        public void mo90776a() {
            if (this.f191802a.mo90775o3().f157471f) {
                AppCompatActivity appCompatActivity = this.f191803b;
                Map f = C90364q0.m113147f(new C13604l("view_id", "edit_page_music_button"), new C13604l("post_scene", 1), new C13604l("editid", this.f191802a.f191781r), new C13604l("comment_scene", 132), new C13604l("behaviour_session_id", ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb()));
                List b = C26236u.m33719b(25496);
                C87412m.m108594g(appCompatActivity, "<this>");
                ((C61212e) C86312j.m106911c(C61212e.class)).mo86167i6("view_clk", appCompatActivity, f, b, false, true);
            }
        }
    }

    /* renamed from: z90.c$h */
    public static final class C66747h extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C66739c f191804d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66747h(C66739c cVar) {
            super(0);
            this.f191804d = cVar;
        }

        public Object invoke() {
            return this.f191804d.getIntent().getStringExtra("KEY_FINDER_POST_MUSIC_FEEDID");
        }
    }

    /* renamed from: z90.c$i */
    public static final class C66748i extends C87413o implements C32224a<C64726td1> {

        /* renamed from: d */
        public final /* synthetic */ C66739c f191805d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66748i(C66739c cVar) {
            super(0);
            this.f191805d = cVar;
        }

        public Object invoke() {
            byte[] byteArrayExtra = this.f191805d.getIntent().getByteArrayExtra("KEY_FINDER_POST_MUSIC_INFO");
            C64726td1 td12 = new C64726td1();
            if (byteArrayExtra != null) {
                try {
                    td12.parseFrom(byteArrayExtra);
                    return td12;
                } catch (Exception e) {
                    Log.printDebugStack("safeParser", "", e);
                }
            }
            return null;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.album_template.multi_template.MaasAlbumMultiTemplateOverlayUIC$onPreview$1", mo125469f = "MaasAlbumMultiTemplateOverlayUIC.kt", mo125470l = {206}, mo125471m = "invokeSuspend")
    /* renamed from: z90.c$j */
    public static final class C66749j extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f191806d;

        /* renamed from: e */
        public final /* synthetic */ C66739c f191807e;

        /* renamed from: z90.c$j$a */
        public static final class C66750a<T> implements C0120a0 {

            /* renamed from: d */
            public final /* synthetic */ C66739c f191808d;

            /* renamed from: e */
            public final /* synthetic */ C8477a0 f191809e;

            public C66750a(C66739c cVar, C8477a0 a0Var) {
                this.f191808d = cVar;
                this.f191809e = a0Var;
            }

            public void onChanged(Object obj) {
                List list = (List) obj;
                Log.m105924i("MaasMultiTemplate.MaasAlbumMultiTemplateOverlayUIC", "onPreview: recommend end");
                C55366y1 y1Var = this.f191808d.f191788y;
                C87412m.m108593f(list, LocaleUtil.ITALIAN);
                y1Var.mo76621d(list);
                if (this.f191809e.f27482d) {
                    C66739c.m78740m3(this.f191808d);
                    this.f191809e.f27482d = false;
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66749j(C66739c cVar, C15601d<? super C66749j> dVar) {
            super(2, dVar);
            this.f191807e = cVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C66749j(this.f191807e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C66749j) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Class cls = C61242a.class;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f191806d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MMMusicManager F3 = this.f191807e.mo90769F3();
                this.f191806d = 1;
                F3.mo76580c();
                C53973z1 z1Var = F3.f157438p;
                if (z1Var != null) {
                    obj2 = ((C53884f2) z1Var).mo74521O(this);
                    if (obj2 != aVar) {
                        obj2 = C13598b0.f38549a;
                    }
                } else {
                    obj2 = C13598b0.f38549a;
                }
                if (obj2 == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            MaasAlbumTemplateSnsFeedInfo maasAlbumTemplateSnsFeedInfo = this.f191807e.mo90775o3().f157473h;
            if (maasAlbumTemplateSnsFeedInfo != null && maasAlbumTemplateSnsFeedInfo.f157481i) {
                C66739c.super.mo86238d0();
                this.f191807e.f191788y.mo76622e("@@no_template@@");
                this.f191807e.mo90772J3(false, false);
            } else if (this.f191807e.f191788y.f157676l) {
                Log.m105924i("MaasMultiTemplate.MaasAlbumMultiTemplateOverlayUIC", "onPreview: show directly");
                C66739c.m78740m3(this.f191807e);
            } else {
                C8477a0 a0Var = new C8477a0();
                a0Var.f27482d = true;
                C39818r rVar = C39818r.f106831a;
                ((C61242a) rVar.mo62443b(this.f191807e.getContext()).mo62447c(cls)).mo86216U2().removeObservers(this.f191807e.getActivity());
                ((C61242a) rVar.mo62443b(this.f191807e.getContext()).mo62447c(cls)).mo86216U2().observe(this.f191807e.getActivity(), new C66750a(this.f191807e, a0Var));
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.album_template.multi_template.MaasAlbumMultiTemplateOverlayUIC$tListState$1$1", mo125469f = "MaasAlbumMultiTemplateOverlayUIC.kt", mo125470l = {130, 133, 142}, mo125471m = "invokeSuspend")
    /* renamed from: z90.c$l */
    public static final class C66751l extends C91594j implements C32227p<String, C15601d<? super Boolean>, Object> {

        /* renamed from: d */
        public int f191810d;

        /* renamed from: e */
        public /* synthetic */ Object f191811e;

        /* renamed from: f */
        public final /* synthetic */ C66739c f191812f;

        @C91590f(mo125468c = "com.tencent.mm.mj_template.album_template.multi_template.MaasAlbumMultiTemplateOverlayUIC$tListState$1$1$2", mo125469f = "MaasAlbumMultiTemplateOverlayUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: z90.c$l$a */
        public static final class C66752a extends C91594j implements C32228q<C45253g<? super Float>, Throwable, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public /* synthetic */ Object f191813d;

            /* renamed from: e */
            public final /* synthetic */ C66739c f191814e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C66752a(C66739c cVar, C15601d<? super C66752a> dVar) {
                super(3, dVar);
                this.f191814e = cVar;
            }

            public Object invoke(Object obj, Object obj2, Object obj3) {
                C45253g gVar = (C45253g) obj;
                C66752a aVar = new C66752a(this.f191814e, (C15601d) obj3);
                aVar.f191813d = (Throwable) obj2;
                return aVar.invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                Log.printErrStackTrace("MaasMultiTemplate.MaasAlbumMultiTemplateOverlayUIC", (Throwable) this.f191813d, "maas error", new Object[0]);
                this.f191814e.mo90625e3().dismiss();
                C76912y0.m92767f(this.f191814e.getContext(), this.f191814e.getString(C0966R.string.aui));
                return C13598b0.f38549a;
            }
        }

        @C91590f(mo125468c = "com.tencent.mm.mj_template.album_template.multi_template.MaasAlbumMultiTemplateOverlayUIC$tListState$1$1$3", mo125469f = "MaasAlbumMultiTemplateOverlayUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: z90.c$l$b */
        public static final class C66753b extends C91594j implements C32228q<C45253g<? super Float>, Throwable, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public /* synthetic */ Object f191815d;

            /* renamed from: e */
            public final /* synthetic */ C8477a0 f191816e;

            /* renamed from: f */
            public final /* synthetic */ C66739c f191817f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C66753b(C8477a0 a0Var, C66739c cVar, C15601d<? super C66753b> dVar) {
                super(3, dVar);
                this.f191816e = a0Var;
                this.f191817f = cVar;
            }

            public Object invoke(Object obj, Object obj2, Object obj3) {
                C45253g gVar = (C45253g) obj;
                C66753b bVar = new C66753b(this.f191816e, this.f191817f, (C15601d) obj3);
                bVar.f191815d = (Throwable) obj2;
                return bVar.invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                Throwable th = (Throwable) this.f191815d;
                Log.m105924i("MaasMultiTemplate.MaasAlbumMultiTemplateOverlayUIC", "change on completion");
                this.f191816e.f27482d = th == null;
                this.f191817f.mo90625e3().dismiss();
                return C13598b0.f38549a;
            }
        }

        /* renamed from: z90.c$l$c */
        public static final class C66754c implements C45253g<Float> {

            /* renamed from: d */
            public final /* synthetic */ C66739c f191818d;

            public C66754c(C66739c cVar) {
                this.f191818d = cVar;
            }

            public Object emit(Object obj, C15601d dVar) {
                float floatValue = ((Number) obj).floatValue();
                C66581h e3 = this.f191818d.mo90625e3();
                String string = this.f191818d.getResources().getString(C0966R.string.gsy, new Object[]{new Integer(C60641c.m70921b(floatValue * ((float) 100)))});
                C87412m.m108593f(string, "resources.getString(\n   …                        )");
                e3.mo90633a(string);
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66751l(C66739c cVar, C15601d<? super C66751l> dVar) {
            super(2, dVar);
            this.f191812f = cVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C66751l lVar = new C66751l(this.f191812f, dVar);
            lVar.f191811e = obj;
            return lVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C66751l) create((String) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:28:0x00ce  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00fd  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Class<la0.a> r0 = la0.C61242a.class
                xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
                int r2 = r9.f191810d
                r3 = 1
                r4 = 3
                r5 = 2
                r6 = 0
                if (r2 == 0) goto L_0x0034
                if (r2 == r3) goto L_0x002c
                if (r2 == r5) goto L_0x0023
                if (r2 != r4) goto L_0x001b
                java.lang.Object r0 = r9.f191811e
                gy3.a0 r0 = (gy3.C8477a0) r0
                kotlin.ResultKt.throwOnFailure(r10)
                goto L_0x00f8
            L_0x001b:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L_0x0023:
                java.lang.Object r0 = r9.f191811e
                gy3.a0 r0 = (gy3.C8477a0) r0
                kotlin.ResultKt.throwOnFailure(r10)
                goto L_0x00ca
            L_0x002c:
                java.lang.Object r0 = r9.f191811e
                gy3.a0 r0 = (gy3.C8477a0) r0
                kotlin.ResultKt.throwOnFailure(r10)
                goto L_0x00a9
            L_0x0034:
                kotlin.ResultKt.throwOnFailure(r10)
                java.lang.Object r10 = r9.f191811e
                java.lang.String r10 = (java.lang.String) r10
                z90.c r2 = r9.f191812f
                y90.h r2 = r2.mo90625e3()
                z90.c r7 = r9.f191812f
                r8 = 2131832926(0x7f11305e, float:1.929892E38)
                java.lang.String r7 = r7.getString(r8)
                r2.mo90633a(r7)
                r2.show()
                gy3.a0 r2 = new gy3.a0
                r2.<init>()
                z90.c r7 = r9.f191812f
                com.tencent.mm.mj_template.api.MaasAlbumMultiTemplateRequestParams r7 = r7.mo90775o3()
                boolean r7 = r7.f157471f
                r8 = 0
                if (r7 == 0) goto L_0x007c
                com.tencent.mm.mj_template.sns.compose.widget.n1$a r7 = com.tencent.p014mm.mj_template.sns.compose.widget.C55319n1.C55320a.f157558e
                java.lang.String r7 = r7.f157555a
                boolean r7 = gy3.C87412m.m108589b(r10, r7)
                if (r7 == 0) goto L_0x007c
                z90.c r10 = r9.f191812f
                r10.mo90772J3(r8, r3)
                r2.f27482d = r3
                z90.c r10 = r9.f191812f
                y90.h r10 = r10.mo90625e3()
                r10.dismiss()
                goto L_0x011c
            L_0x007c:
                z90.c r7 = r9.f191812f
                r7.mo90772J3(r3, r3)
                com.tencent.mm.mj_template.sns.compose.widget.n1$a r7 = com.tencent.p014mm.mj_template.sns.compose.widget.C55319n1.C55320a.f157558e
                java.lang.String r7 = r7.f157555a
                boolean r7 = gy3.C87412m.m108589b(r10, r7)
                if (r7 == 0) goto L_0x00ac
                bl3.r r10 = bl3.C39818r.f106831a
                z90.c r5 = r9.f191812f
                android.app.Activity r5 = r5.getContext()
                bl3.r$a r10 = r10.mo62443b(r5)
                bl3.c r10 = r10.mo62447c(r0)
                la0.a r10 = (la0.C61242a) r10
                r9.f191811e = r2
                r9.f191810d = r3
                java.lang.Object r10 = r10.mo86225p0(r9)
                if (r10 != r1) goto L_0x00a8
                return r1
            L_0x00a8:
                r0 = r2
            L_0x00a9:
                d14.f r10 = (d14.C45252f) r10
                goto L_0x00cc
            L_0x00ac:
                bl3.r r3 = bl3.C39818r.f106831a
                z90.c r7 = r9.f191812f
                android.app.Activity r7 = r7.getContext()
                bl3.r$a r3 = r3.mo62443b(r7)
                bl3.c r0 = r3.mo62447c(r0)
                la0.a r0 = (la0.C61242a) r0
                r9.f191811e = r2
                r9.f191810d = r5
                java.lang.Object r10 = r0.mo86202A1(r10, r9)
                if (r10 != r1) goto L_0x00c9
                return r1
            L_0x00c9:
                r0 = r2
            L_0x00ca:
                d14.f r10 = (d14.C45252f) r10
            L_0x00cc:
                if (r10 == 0) goto L_0x00fa
                z90.c$l$a r2 = new z90.c$l$a
                z90.c r3 = r9.f191812f
                r2.<init>(r3, r6)
                d14.t r3 = new d14.t
                r3.<init>(r10, r2)
                z90.c$l$b r10 = new z90.c$l$b
                z90.c r2 = r9.f191812f
                r10.<init>(r0, r2, r6)
                d14.q r2 = new d14.q
                r2.<init>(r3, r10)
                z90.c$l$c r10 = new z90.c$l$c
                z90.c r3 = r9.f191812f
                r10.<init>(r3)
                r9.f191811e = r0
                r9.f191810d = r4
                java.lang.Object r10 = r2.mo31880a(r10, r9)
                if (r10 != r1) goto L_0x00f8
                return r1
            L_0x00f8:
                rx3.b0 r6 = rx3.C13598b0.f38549a
            L_0x00fa:
                r2 = r0
                if (r6 != 0) goto L_0x011c
                z90.c r10 = r9.f191812f
                java.lang.String r0 = "MaasMultiTemplate.MaasAlbumMultiTemplateOverlayUIC"
                java.lang.String r1 = "unexpected null"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
                y90.h r0 = r10.mo90625e3()
                r0.dismiss()
                android.app.Activity r0 = r10.getContext()
                r1 = 2131822946(0x7f110962, float:1.9278678E38)
                java.lang.String r10 = r10.getString(r1)
                nj3.C76912y0.m92767f(r0, r10)
            L_0x011c:
                boolean r10 = r2.f27482d
                java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: z90.C66739c.C66751l.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66739c(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        StringBuilder sb = new StringBuilder();
        C86718e b = C86709a0.m107523b();
        sb.append(C77710q.m93738a(b != null ? b.mo121110g() : 0));
        sb.append('_');
        sb.append(System.currentTimeMillis());
        this.f191781r = sb.toString();
        this.f191782s = C36568h.m40985a(C39325k.f105720d);
        C13602i iVar = C13602i.NONE;
        this.f191783t = C36568h.m40986b(iVar, new C66744e(this));
        this.f191784u = C36568h.m40986b(iVar, new C66748i(this));
        this.f191785v = C108500f2.m146996c(Boolean.TRUE, (C108497e2) null, 2, (Object) null);
        this.f191786w = C36568h.m40986b(iVar, new C66745f(this));
        this.f191787x = new C66746g(this, appCompatActivity);
        C55366y1 y1Var = new C55366y1(getMainScope(), C64186f0.f181907d, C26236u.m33719b(C55319n1.C55320a.f157558e), false);
        y1Var.f157671g = new C66751l(this, (C15601d<? super C66751l>) null);
        this.f191788y = y1Var;
        this.f191789z = C36568h.m40985a(new C66747h(this));
        this.f191777A = C108500f2.m146996c(0, (C108497e2) null, 2, (Object) null);
    }

    /* renamed from: m3 */
    public static final void m78740m3(C66739c cVar) {
        C55319n1 n1Var = (C55319n1) C110818d0.m150917O(cVar.f191788y.mo76619b(), 1);
        if (n1Var != null) {
            cVar.f191788y.mo76622e(n1Var.f157555a);
            cVar.mo90772J3(true, false);
        }
        super.mo86238d0();
    }

    /* renamed from: F3 */
    public final MMMusicManager mo90769F3() {
        return (MMMusicManager) this.f191786w.getValue();
    }

    /* renamed from: G3 */
    public final void mo90770G3() {
        Log.m105924i("MaasMultiTemplate.MaasAlbumMultiTemplateOverlayUIC", "launchMMEditorUI");
        this.f191779p = true;
        CaptureDataManager.f272890c.f272891a = this.f191778o;
        int i = MMRecordUI.f272841o;
        Intent intent = new Intent(getContext(), MMRecordUI.class);
        intent.putExtras(getContext().getIntent());
        Activity context = getContext();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(1);
        aVar.mo10233c(intent);
        C117292a.m165364j(context, aVar.mo10232b(), "com/tencent/mm/mj_template/album_template/multi_template/MaasAlbumMultiTemplateOverlayUIC", "launchMMEditorUI", "()V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a2  */
    /* renamed from: I3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo90771I3(boolean r29, java.lang.String r30) {
        /*
            r28 = this;
            r1 = r28
            r0 = r29
            java.lang.Class<lr.b> r2 = p599lr.C61381b.class
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "performSnsPost() called with: isVideo = "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "MaasMultiTemplate.MaasAlbumMultiTemplateOverlayUIC"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            com.tencent.mm.mj_template.api.MaasAlbumMultiTemplateRequestParams r3 = r28.mo90775o3()
            com.tencent.mm.mj_template.api.MaasAlbumTemplateSnsFeedInfo r3 = r3.f157473h
            if (r3 != 0) goto L_0x0033
            com.tencent.mm.mj_template.api.MaasAlbumTemplateSnsFeedInfo r3 = new com.tencent.mm.mj_template.api.MaasAlbumTemplateSnsFeedInfo
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r13 = 1
            java.lang.String r6 = ""
            r5 = r3
            r5.<init>(r6, r7, r8, r9, r11, r13)
        L_0x0033:
            java.lang.String r5 = ""
            java.lang.String r6 = "safeParser"
            r7 = 0
            r8 = 0
            r9 = 1
            if (r0 == 0) goto L_0x00c0
            di3.d r0 = di3.C86312j.m106911c(r2)
            r10 = r0
            lr.b r10 = (p599lr.C61381b) r10
            android.app.Activity r11 = r28.getContext()
            java.lang.String r13 = r3.f157476d
            int r14 = r3.f157477e
            te3.db1 r0 = new te3.db1
            r0.<init>()
            byte[] r2 = r3.f157478f
            if (r2 != 0) goto L_0x0056
        L_0x0054:
            r15 = r7
            goto L_0x0065
        L_0x0056:
            r0.parseFrom(r2)     // Catch:{ Exception -> 0x005b }
            r15 = r0
            goto L_0x0065
        L_0x005b:
            r0 = move-exception
            r2 = r0
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r8] = r2
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r6, r5, r0)
            goto L_0x0054
        L_0x0065:
            long r5 = r3.f157479g
            long r2 = r3.f157480h
            te3.ap1 r0 = new te3.ap1
            r0.<init>()
            rx3.l r7 = r28.mo75242d3()
            A r12 = r7.f38555d
            java.lang.String r12 = (java.lang.String) r12
            r0.f182115d = r12
            r0.f182116e = r9
            r12 = 1011000(0xf6d38, float:1.416713E-39)
            r0.f182117f = r12
            android.content.Intent r12 = r28.getIntent()
            java.lang.String r9 = "key_maas_entrance"
            int r9 = r12.getIntExtra(r9, r8)
            r0.f182119h = r9
            ca0.f0 r9 = r1.f191426h
            if (r9 == 0) goto L_0x00a0
            j0.k2<java.lang.Boolean> r9 = r9.f153252d
            if (r9 == 0) goto L_0x00a0
            java.lang.Object r9 = r9.getValue()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L_0x00a0
            r8 = 1
        L_0x00a0:
            if (r8 == 0) goto L_0x00ad
            java.lang.String r8 = "performSnsPost has music id"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r8)
            B r4 = r7.f38556e
            java.lang.String r4 = (java.lang.String) r4
            r0.f182121j = r4
        L_0x00ad:
            rx3.b0 r4 = rx3.C13598b0.f38549a
            android.content.Intent r4 = r1.f191780q
            r12 = r30
            r16 = r5
            r18 = r2
            r20 = r0
            r21 = r4
            r10.mo78554lj(r11, r12, r13, r14, r15, r16, r18, r20, r21)
            goto L_0x01ad
        L_0x00c0:
            di3.d r0 = di3.C86312j.m106911c(r2)
            r17 = r0
            lr.b r17 = (p599lr.C61381b) r17
            android.app.Activity r18 = r28.getContext()
            com.tencent.mm.mj_template.api.MaasAlbumMultiTemplateRequestParams r0 = r28.mo90775o3()
            java.util.List<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r0 = r0.f157469d
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x00db:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x00f8
            java.lang.Object r4 = r0.next()
            r9 = r4
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r9 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem) r9
            int r9 = r9.getType()
            r10 = 1
            if (r9 != r10) goto L_0x00f1
            r10 = 1
            goto L_0x00f2
        L_0x00f1:
            r10 = 0
        L_0x00f2:
            if (r10 == 0) goto L_0x00db
            r2.add(r4)
            goto L_0x00db
        L_0x00f8:
            java.util.ArrayList r4 = new java.util.ArrayList
            r0 = 10
            int r0 = sx3.C36907w.m41090l(r2, r0)
            r4.<init>(r0)
            java.util.Iterator r0 = r2.iterator()
        L_0x0107:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0119
            java.lang.Object r2 = r0.next()
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r2 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem) r2
            java.lang.String r2 = r2.f162747d
            r4.add(r2)
            goto L_0x0107
        L_0x0119:
            com.tencent.mm.mj_template.album_template.multi_template.MMMusicManager r0 = r28.mo90769F3()
            ca0.f0 r0 = r0.f157440r
            j0.k2<java.lang.Boolean> r0 = r0.f153252d
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0179
            com.tencent.mm.mj_template.album_template.multi_template.MMMusicManager r0 = r28.mo90769F3()
            j0.y0<com.tencent.maas.model.MJMusicInfo> r2 = r0.f157432g
            j0.d2 r2 = (p175j0.C108494d2) r2
            java.lang.Object r2 = r2.getValue()
            com.tencent.maas.model.MJMusicInfo r2 = (com.tencent.maas.model.MJMusicInfo) r2
            java.lang.String r2 = r2.getMusicID()
            java.lang.String r9 = "currentMusicState.value.musicID"
            gy3.C87412m.m108593f(r2, r9)
            java.lang.Integer r2 = z04.C66731x.m78731e(r2)
            if (r2 == 0) goto L_0x014f
            int r2 = r2.intValue()
            goto L_0x0150
        L_0x014f:
            r2 = -1
        L_0x0150:
            java.util.List<te3.xt2> r0 = r0.f157435j
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x0158:
            boolean r9 = r0.hasNext()
            if (r9 == 0) goto L_0x016f
            java.lang.Object r9 = r0.next()
            r10 = r9
            te3.xt2 r10 = (te3.C64839xt2) r10
            int r10 = r10.f186384d
            if (r10 != r2) goto L_0x016b
            r10 = 1
            goto L_0x016c
        L_0x016b:
            r10 = 0
        L_0x016c:
            if (r10 == 0) goto L_0x0158
            goto L_0x0170
        L_0x016f:
            r9 = r7
        L_0x0170:
            te3.xt2 r9 = (te3.C64839xt2) r9
            byte[] r0 = o40.C61926c.m72699x(r9)
            r20 = r0
            goto L_0x017b
        L_0x0179:
            r20 = r7
        L_0x017b:
            java.lang.String r2 = r3.f157476d
            int r9 = r3.f157477e
            te3.db1 r0 = new te3.db1
            r0.<init>()
            byte[] r10 = r3.f157478f
            if (r10 != 0) goto L_0x018b
        L_0x0188:
            r23 = r7
            goto L_0x019c
        L_0x018b:
            r0.parseFrom(r10)     // Catch:{ Exception -> 0x0191 }
            r23 = r0
            goto L_0x019c
        L_0x0191:
            r0 = move-exception
            r10 = r0
            r11 = 1
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r0[r8] = r10
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r6, r5, r0)
            goto L_0x0188
        L_0x019c:
            long r5 = r3.f157479g
            long r7 = r3.f157480h
            r19 = r4
            r21 = r2
            r22 = r9
            r24 = r5
            r26 = r7
            r17.qg0(r18, r19, r20, r21, r22, r23, r24, r26)
        L_0x01ad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z90.C66739c.mo90771I3(boolean, java.lang.String):void");
    }

    /* renamed from: J3 */
    public final void mo90772J3(boolean z, boolean z2) {
        Log.m105924i("MaasMultiTemplate.MaasAlbumMultiTemplateOverlayUIC", "switchMaasPreview() called with: maasPreview = " + z);
        ((C108494d2) this.f191785v).setValue(Boolean.valueOf(z));
        ((C61242a) C39818r.f106831a.mo62443b(getContext()).mo62447c(C61242a.class)).mo86207H1(z, z2);
        if (!mo90775o3().f157471f) {
            return;
        }
        if (z) {
            getActivity().getLifecycle().removeObserver(mo90769F3());
            MMMusicManager F3 = mo90769F3();
            F3.getClass();
            Log.m105924i("MicroMsg.MMMusicManager", "pausePlay: ");
            C61630a aVar = F3.f157436n;
            if (aVar != null) {
                aVar.mo86578a();
                return;
            }
            return;
        }
        getActivity().getLifecycle().addObserver(mo90769F3());
        mo90769F3().mo76579b();
    }

    /* renamed from: K3 */
    public final boolean mo90773K3(C55366y1 y1Var) {
        return (y1Var.mo76618a().length() > 0) && !C87412m.m108589b(y1Var.mo76618a(), "@@no_template@@");
    }

    /* renamed from: c3 */
    public Intent mo90624c3() {
        return mo90775o3().f157471f ? this.f191780q : getIntent();
    }

    /* renamed from: d0 */
    public void mo86238d0() {
        if (mo90775o3().f157471f) {
            C53895h.m60466d(getMainScope(), (C66212f) null, (C53934p0) null, new C66749j(this, (C15601d<? super C66749j>) null), 3, (Object) null);
        } else {
            super.mo86238d0();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        r2 = (r2 = r2.f153250b).getValue();
     */
    /* renamed from: d3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public rx3.C13604l<java.lang.String, java.lang.String> mo75242d3() {
        /*
            r3 = this;
            rx3.l r0 = new rx3.l
            com.tencent.mm.mj_template.sns.compose.widget.y1 r1 = r3.f191788y
            java.lang.String r1 = r1.mo76618a()
            ca0.f0 r2 = r3.f191426h
            if (r2 == 0) goto L_0x001d
            j0.k2<com.tencent.maas.model.MJMusicInfo> r2 = r2.f153250b
            if (r2 == 0) goto L_0x001d
            java.lang.Object r2 = r2.getValue()
            com.tencent.maas.model.MJMusicInfo r2 = (com.tencent.maas.model.MJMusicInfo) r2
            if (r2 == 0) goto L_0x001d
            java.lang.String r2 = r2.getMusicID()
            goto L_0x001e
        L_0x001d:
            r2 = 0
        L_0x001e:
            if (r2 != 0) goto L_0x0022
            java.lang.String r2 = ""
        L_0x0022:
            r0.<init>(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z90.C66739c.mo75242d3():rx3.l");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: f0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo75243f0(wx3.C15601d<? super rx3.C13598b0> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof z90.C66739c.C66740a
            if (r0 == 0) goto L_0x0013
            r0 = r5
            z90.c$a r0 = (z90.C66739c.C66740a) r0
            int r1 = r0.f191793g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f191793g = r1
            goto L_0x0018
        L_0x0013:
            z90.c$a r0 = new z90.c$a
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f191791e
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f191793g
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r0 = r0.f191790d
            z90.c r0 = (z90.C66739c) r0
            kotlin.ResultKt.throwOnFailure(r5)
            goto L_0x0040
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0033:
            kotlin.ResultKt.throwOnFailure(r5)
            r0.f191790d = r4
            r0.f191793g = r3
            rx3.b0 r5 = rx3.C13598b0.f38549a
            if (r5 != r1) goto L_0x003f
            return r1
        L_0x003f:
            r0 = r4
        L_0x0040:
            com.tencent.mm.mj_template.api.MaasAlbumMultiTemplateRequestParams r5 = r0.mo90775o3()
            boolean r5 = r5.f157470e
            if (r5 == 0) goto L_0x0055
            java.lang.String r5 = "MaasMultiTemplate.MaasAlbumMultiTemplateOverlayUIC"
            java.lang.String r0 = "manage sdk, init"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            ha0.t r5 = ha0.C108221t.f324032a
            r0 = 0
            r5.mo158631k(r0)
        L_0x0055:
            rx3.b0 r5 = rx3.C13598b0.f38549a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: z90.C66739c.mo75243f0(wx3.d):java.lang.Object");
    }

    /* renamed from: g3 */
    public void mo75244g3() {
        Class cls = C61242a.class;
        Activity context = getContext();
        C0125s sVar = context instanceof C0125s ? (C0125s) context : null;
        if (sVar != null) {
            if (mo90774n3()) {
                ((C61242a) C39818r.f106831a.mo62443b(getContext()).mo62447c(cls)).mo86221d2(false);
            } else {
                int dl02 = ((C32735h) C86312j.m106911c(C32735h.class)).dl0(C32735h.C32737c.clicfg_finder_maas_recomend_fallback_type, C104160f.RepairerConfig_Maas_FinderFallBack_Int, 0);
                Log.m105924i("FinderMaasXConfigImpl", "finder fallback " + dl02);
                if (dl02 == 2) {
                    ((C61242a) C39818r.f106831a.mo62443b(getContext()).mo62447c(cls)).mo86221d2(false);
                    C53895h.m60466d(getLifecycleScope(), (C66212f) null, (C53934p0) null, new C66757g(this, (C15601d<? super C66757g>) null), 3, (Object) null);
                } else {
                    C39818r rVar = C39818r.f106831a;
                    ((C61242a) rVar.mo62443b(getContext()).mo62447c(cls)).mo86216U2().observe(sVar, new C66741b(this.f191788y));
                    ((C61242a) rVar.mo62443b(getContext()).mo62447c(cls)).mo86211M().observe(sVar, new C66742c(this));
                }
            }
        }
        List<GalleryItem$MediaItem> list = mo90775o3().f157469d;
        ArrayList arrayList = new ArrayList();
        for (T next : list) {
            if (((GalleryItem$MediaItem) next).getType() == 1) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C36907w.m41090l(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((GalleryItem$MediaItem) it.next()).f162747d);
        }
        MMComposeView mMComposeView = (MMComposeView) ((C36570n) this.f191422d).getValue();
        int f = C75044y4.m89994f(mMComposeView.getContext());
        C39818r rVar2 = C39818r.f106831a;
        Context context2 = mMComposeView.getContext();
        C87412m.m108593f(context2, "context");
        mMComposeView.setContent(C110261c.m149879c(-1637040323, true, new C66743d(this, f, (C61242a) rVar2.mo62443b(context2).mo62447c(cls), arrayList2)));
    }

    /* renamed from: j3 */
    public void mo90628j3(String str) {
        C87412m.m108594g(str, "path");
        if (mo90775o3().f157471f) {
            mo90771I3(true, str);
        } else {
            super.mo90628j3(str);
        }
    }

    /* renamed from: n3 */
    public final boolean mo90774n3() {
        String str = (String) ((C36570n) this.f191789z).getValue();
        if (!(str == null || str.length() == 0)) {
            return true;
        }
        C64726td1 td12 = (C64726td1) this.f191784u.getValue();
        String str2 = td12 != null ? td12.f185546s : null;
        return !(str2 == null || str2.length() == 0);
    }

    /* renamed from: o3 */
    public final MaasAlbumMultiTemplateRequestParams mo90775o3() {
        return (MaasAlbumMultiTemplateRequestParams) this.f191783t.getValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0054, code lost:
        if (r14 == null) goto L_0x0056;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreateBefore(android.os.Bundle r14) {
        /*
            r13 = this;
            java.lang.Class<la0.a> r0 = la0.C61242a.class
            com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager r1 = com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager.f272890c
            com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$b r1 = r1.f272891a
            r13.f191778o = r1
            super.onCreateBefore(r14)
            bl3.r r14 = bl3.C39818r.f106831a
            android.app.Activity r1 = r13.getContext()
            bl3.r$a r14 = r14.mo62443b(r1)
            bl3.c r14 = r14.mo62447c(r0)
            la0.a r14 = (la0.C61242a) r14
            com.tencent.mm.mj_template.api.MaasAlbumMultiTemplateRequestParams r1 = r13.mo90775o3()
            java.util.List<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r1 = r1.f157469d
            r14.setMediaList(r1)
            com.tencent.mm.mj_template.api.MaasAlbumMultiTemplateRequestParams r1 = r13.mo90775o3()
            boolean r1 = r1.f157471f
            r2 = 1
            r1 = r1 ^ r2
            r14.mo86226s0(r1)
            boolean r14 = r13.mo90774n3()
            if (r14 != 0) goto L_0x0037
            goto L_0x012f
        L_0x0037:
            rx3.g r14 = r13.f191789z
            rx3.n r14 = (rx3.C36570n) r14
            java.lang.Object r14 = r14.getValue()
            java.lang.String r14 = (java.lang.String) r14
            java.lang.String r1 = ""
            r3 = 0
            r4 = 0
            if (r14 == 0) goto L_0x0056
            int r5 = r14.length()
            if (r5 <= 0) goto L_0x004f
            r5 = 1
            goto L_0x0050
        L_0x004f:
            r5 = 0
        L_0x0050:
            if (r5 == 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r14 = r3
        L_0x0054:
            if (r14 != 0) goto L_0x0067
        L_0x0056:
            rx3.g r14 = r13.f191784u
            java.lang.Object r14 = r14.getValue()
            te3.td1 r14 = (te3.C64726td1) r14
            if (r14 == 0) goto L_0x0063
            java.lang.String r14 = r14.f185546s
            goto L_0x0064
        L_0x0063:
            r14 = r3
        L_0x0064:
            if (r14 != 0) goto L_0x0067
            r14 = r1
        L_0x0067:
            android.content.Intent r5 = r13.getIntent()
            java.lang.String r6 = "key_template_square_rsp_pb"
            byte[] r5 = r5.getByteArrayExtra(r6)
            if (r5 != 0) goto L_0x0075
            byte[] r5 = new byte[r4]
        L_0x0075:
            te3.y92 r6 = new te3.y92
            r6.<init>()
            r6.parseFrom(r5)     // Catch:{ Exception -> 0x007e }
            goto L_0x0089
        L_0x007e:
            r5 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r2]
            r6[r4] = r5
            java.lang.String r5 = "safeParser"
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r5, r1, r6)
            r6 = r3
        L_0x0089:
            if (r6 == 0) goto L_0x008d
            java.util.LinkedList<te3.pr4> r3 = r6.f145188d
        L_0x008d:
            java.lang.String r5 = "MaasMultiTemplate.MaasAlbumMultiTemplateOverlayUIC"
            if (r3 != 0) goto L_0x009e
            java.lang.String r14 = "checkMusicTopicPost: template list parse error"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r14)
            java.lang.String r14 = "template list parse error"
            r13.mo75247p(r14)
            goto L_0x012f
        L_0x009e:
            boolean r6 = r3.isEmpty()
            if (r6 == 0) goto L_0x00b1
            java.lang.String r14 = "checkMusicTopicPost: template list is empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r14)
            java.lang.String r14 = "template list is empty"
            r13.mo75247p(r14)
            goto L_0x012f
        L_0x00b1:
            android.content.Intent r5 = r13.getIntent()
            r6 = -1
            java.lang.String r7 = "key_template_square_chosen_pos"
            int r5 = r5.getIntExtra(r7, r6)
            aa0.b r7 = r13.f191429n
            r7.getClass()
            com.tencent.mm.mj_template.sns.compose.widget.y1 r7 = r13.f191788y
            java.util.ArrayList r8 = new java.util.ArrayList
            r9 = 10
            int r9 = sx3.C36907w.m41090l(r3, r9)
            r8.<init>(r9)
            java.util.Iterator r9 = r3.iterator()
        L_0x00d2:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x00ed
            java.lang.Object r10 = r9.next()
            te3.pr4 r10 = (te3.pr4) r10
            com.tencent.mm.mj_template.sns.compose.widget.n1$d$a r11 = com.tencent.p014mm.mj_template.sns.compose.widget.C55319n1.C55323d.f157561i
            java.lang.String r12 = "it"
            gy3.C87412m.m108593f(r10, r12)
            com.tencent.mm.mj_template.sns.compose.widget.n1$d r10 = r11.mo76616a(r10)
            r8.add(r10)
            goto L_0x00d2
        L_0x00ed:
            r7.mo76620c(r8)
            java.lang.String r7 = "tmplList[chosenPos].id"
            if (r5 <= r6) goto L_0x0105
            com.tencent.mm.mj_template.sns.compose.widget.y1 r8 = r13.f191788y
            java.lang.Object r9 = r3.get(r5)
            te3.pr4 r9 = (te3.pr4) r9
            java.lang.String r9 = r9.f139919d
            gy3.C87412m.m108593f(r9, r7)
            r8.mo76622e(r9)
        L_0x0105:
            bl3.r r8 = bl3.C39818r.f106831a
            android.app.Activity r9 = r13.getContext()
            bl3.r$a r8 = r8.mo62443b(r9)
            bl3.c r0 = r8.mo62447c(r0)
            la0.a r0 = (la0.C61242a) r0
            r0.mo86228y2(r2)
            if (r5 <= r6) goto L_0x012c
            r0.mo86221d2(r4)
            java.lang.Object r1 = r3.get(r5)
            te3.pr4 r1 = (te3.pr4) r1
            java.lang.String r1 = r1.f139919d
            gy3.C87412m.m108593f(r1, r7)
            r0.mo86220d1(r1, r14)
            goto L_0x012f
        L_0x012c:
            r0.mo86220d1(r1, r14)
        L_0x012f:
            com.tencent.mm.mj_template.api.MaasAlbumMultiTemplateRequestParams r14 = r13.mo90775o3()
            boolean r14 = r14.f157471f
            r14 = r14 ^ r2
            j0.y0 r0 = r13.f191785v
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)
            j0.d2 r0 = (p175j0.C108494d2) r0
            r0.setValue(r14)
            com.tencent.mm.mj_template.api.MaasAlbumMultiTemplateRequestParams r14 = r13.mo90775o3()
            boolean r14 = r14.f157471f
            if (r14 == 0) goto L_0x0150
            com.tencent.mm.mj_template.album_template.multi_template.MMMusicManager r14 = r13.mo90769F3()
            r14.mo76580c()
        L_0x0150:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z90.C66739c.onCreateBefore(android.os.Bundle):void");
    }

    public void onDestroy() {
        super.onDestroy();
        C55319n1.C55323d.C55324a aVar = C55319n1.C55323d.f157561i;
        C55319n1.C55323d.f157562j.clear();
        if (mo90775o3().f157470e) {
            Log.m105924i("MaasMultiTemplate.MaasAlbumMultiTemplateOverlayUIC", "manage sdk, release");
            C108221t.f324032a.mo158632l();
        }
    }

    public void onPreDestroyed() {
        super.onPreDestroyed();
        if (!this.f191428j && this.f191779p) {
            mo90629k3(2);
        }
    }

    public void onResume() {
        if (this.f191779p) {
            Log.m105924i("MicroMsg.MaasMovieSessionManager", "setReportScene: " + 2 + ", field: " + C60781a.f173119b);
            C60781a.f173119b = 2;
        }
        super.onResume();
    }

    public void onViewCreated(View view) {
        C87412m.m108594g(view, "contentView");
        super.onViewCreated(view);
        if (mo90775o3().f157471f) {
            view.setBackgroundColor(getColor(C0966R.color.f3496v_));
        }
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            int c = C75044y4.m89991c(getActivity());
            ((C108494d2) this.f191777A).setValue(Integer.valueOf(c));
        }
    }

    /* renamed from: p */
    public void mo75247p(String str) {
        C87412m.m108594g(str, "msg");
        Log.m105920e("MaasMultiTemplate.MaasAlbumMultiTemplateOverlayUIC", "onSdkError " + str);
        mo90770G3();
        getContext().finish();
    }
}
