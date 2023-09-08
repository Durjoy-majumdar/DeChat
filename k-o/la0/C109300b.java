package la0;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import android.content.Intent;
import android.os.Bundle;
import android.view.Surface;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C54219z;
import androidx.lifecycle.LiveData;
import bp3.C104160f;
import bp3.C79758p;
import com.tencent.maas.analytics.MJAnalyticsS12;
import com.tencent.maas.instamovie.MJMovieSession;
import com.tencent.maas.instamovie.MJMovieSessionState;
import com.tencent.maas.instamovie.MJRecommendOptions;
import com.tencent.maas.model.MJChannelEventConfig;
import com.tencent.maas.model.MJLyricInfo;
import com.tencent.maas.model.MJMusicInfo;
import com.tencent.maas.model.MJMusicOptions;
import com.tencent.maas.model.MJTemplateCategory;
import com.tencent.maas.model.MJTemplateInfo;
import com.tencent.maas.model.time.MJTime;
import com.tencent.maas.model.time.MJTimeRange;
import com.tencent.p014mm.autogen.mmdata.rpt.MaasRecommendReportStruct;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import d14.C45253g;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C87412m;
import ha0.C108183c0;
import ha0.C108221t;
import ha0.C108236x0;
import ha0.C59807w0;
import iy3.C60641c;
import ja0.C24789f;
import ja0.C60781a;
import ja0.C60784e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import la0.C61242a;
import qa0.C62586b;
import rx3.C13598b0;
import sx3.C36907w;
import sx3.C64186f0;
import te3.pr4;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;
import zt3.C119157j;

/* renamed from: la0.b */
public final class C109300b extends UIComponent implements C61242a {

    /* renamed from: d */
    public C108183c0 f327191d;

    /* renamed from: e */
    public C61242a.C61245c f327192e;

    /* renamed from: f */
    public C61242a.C61246d f327193f;

    /* renamed from: g */
    public final C54219z<C59807w0> f327194g = new C54219z<>();

    /* renamed from: h */
    public final C54219z<List<MJTemplateInfo>> f327195h;

    /* renamed from: i */
    public final C54219z<List<MJTemplateCategory>> f327196i;

    /* renamed from: j */
    public final C61247a f327197j;

    /* renamed from: n */
    public String f327198n;

    /* renamed from: o */
    public boolean f327199o;

    /* renamed from: p */
    public boolean f327200p;

    /* renamed from: q */
    public String f327201q;

    /* renamed from: r */
    public List<? extends GalleryItem$MediaItem> f327202r;

    /* renamed from: s */
    public C61242a.C61244a f327203s;

    /* renamed from: t */
    public MJTime f327204t;

    /* renamed from: u */
    public boolean f327205u;

    /* renamed from: v */
    public final MJMovieSession.OnMediaTimeChange f327206v;

    /* renamed from: w */
    public volatile C32226l<? super C15601d<? super C13598b0>, ? extends Object> f327207w;

    /* renamed from: x */
    public volatile boolean f327208x;

    /* renamed from: y */
    public boolean f327209y;

    /* renamed from: la0.b$a */
    public static final class C61247a implements C61242a.C61243b {

        /* renamed from: a */
        public final C54219z<List<MJMusicInfo>> f174324a;

        /* renamed from: b */
        public final C54219z<MJMusicInfo> f174325b;

        /* renamed from: c */
        public final LiveData<List<MJMusicInfo>> f174326c;

        /* renamed from: d */
        public final LiveData<MJMusicInfo> f174327d;

        /* renamed from: e */
        public final C54219z<Boolean> f174328e;

        /* renamed from: f */
        public final C54219z<Boolean> f174329f;

        /* renamed from: la0.b$a$a */
        public static final class C61248a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C61247a f174330d;

            /* renamed from: e */
            public final /* synthetic */ MJMusicInfo f174331e;

            public C61248a(C61247a aVar, MJMusicInfo mJMusicInfo) {
                this.f174330d = aVar;
                this.f174331e = mJMusicInfo;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: com.tencent.maas.model.MJMusicInfo} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: com.tencent.maas.model.MJMusicInfo} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: com.tencent.maas.model.MJMusicInfo} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: com.tencent.maas.model.MJMusicInfo} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: com.tencent.maas.model.MJMusicInfo} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r6 = this;
                    la0.b$a r0 = r6.f174330d
                    androidx.lifecycle.LiveData<java.util.List<com.tencent.maas.model.MJMusicInfo>> r0 = r0.f174326c
                    java.lang.Object r0 = r0.getValue()
                    java.util.List r0 = (java.util.List) r0
                    r1 = 0
                    if (r0 == 0) goto L_0x0031
                    com.tencent.maas.model.MJMusicInfo r2 = r6.f174331e
                    java.util.Iterator r0 = r0.iterator()
                L_0x0013:
                    boolean r3 = r0.hasNext()
                    if (r3 == 0) goto L_0x002f
                    java.lang.Object r3 = r0.next()
                    r4 = r3
                    com.tencent.maas.model.MJMusicInfo r4 = (com.tencent.maas.model.MJMusicInfo) r4
                    java.lang.String r4 = r4.getMusicID()
                    java.lang.String r5 = r2.getMusicID()
                    boolean r4 = gy3.C87412m.m108589b(r4, r5)
                    if (r4 == 0) goto L_0x0013
                    r1 = r3
                L_0x002f:
                    com.tencent.maas.model.MJMusicInfo r1 = (com.tencent.maas.model.MJMusicInfo) r1
                L_0x0031:
                    if (r1 != 0) goto L_0x0084
                    java.lang.String r0 = "MaasMultiTemplate.MaasSdkUIC"
                    java.lang.String r1 = "updateMusicInfo: insert other music"
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
                    java.util.ArrayList r0 = new java.util.ArrayList
                    r0.<init>()
                    com.tencent.maas.model.MJMusicInfo r1 = r6.f174331e
                    la0.b$a r2 = r6.f174330d
                    r0.add(r1)
                    androidx.lifecycle.LiveData<java.util.List<com.tencent.maas.model.MJMusicInfo>> r1 = r2.f174326c
                    java.lang.Object r1 = r1.getValue()
                    java.util.List r1 = (java.util.List) r1
                    if (r1 == 0) goto L_0x0054
                    r0.addAll(r1)
                L_0x0054:
                    la0.b$a r1 = r6.f174330d
                    androidx.lifecycle.z<java.util.List<com.tencent.maas.model.MJMusicInfo>> r1 = r1.f174324a
                    java.util.HashSet r2 = new java.util.HashSet
                    r2.<init>()
                    java.util.ArrayList r3 = new java.util.ArrayList
                    r3.<init>()
                    java.util.Iterator r0 = r0.iterator()
                L_0x0066:
                    boolean r4 = r0.hasNext()
                    if (r4 == 0) goto L_0x0081
                    java.lang.Object r4 = r0.next()
                    r5 = r4
                    com.tencent.maas.model.MJMusicInfo r5 = (com.tencent.maas.model.MJMusicInfo) r5
                    java.lang.String r5 = r5.getMusicID()
                    boolean r5 = r2.add(r5)
                    if (r5 == 0) goto L_0x0066
                    r3.add(r4)
                    goto L_0x0066
                L_0x0081:
                    r1.postValue(r3)
                L_0x0084:
                    la0.b$a r0 = r6.f174330d
                    androidx.lifecycle.z<com.tencent.maas.model.MJMusicInfo> r0 = r0.f174325b
                    com.tencent.maas.model.MJMusicInfo r1 = r6.f174331e
                    r0.setValue(r1)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: la0.C109300b.C61247a.C61248a.run():void");
            }
        }

        public C61247a() {
            C54219z<List<MJMusicInfo>> zVar = new C54219z<>(C64186f0.f181907d);
            this.f174324a = zVar;
            C54219z<MJMusicInfo> zVar2 = new C54219z<>();
            this.f174325b = zVar2;
            this.f174326c = zVar;
            this.f174327d = zVar2;
            Boolean bool = Boolean.FALSE;
            this.f174328e = new C54219z<>(bool);
            this.f174329f = new C54219z<>(bool);
        }

        /* renamed from: a */
        public LiveData<Boolean> mo86229a() {
            return this.f174328e;
        }

        /* renamed from: b */
        public LiveData<MJMusicInfo> mo86230b() {
            return this.f174327d;
        }

        /* renamed from: c */
        public LiveData<List<MJMusicInfo>> mo86231c() {
            return this.f174326c;
        }

        /* renamed from: d */
        public LiveData<Boolean> mo86232d() {
            return this.f174329f;
        }

        /* renamed from: e */
        public final void mo86240e(MJMusicInfo mJMusicInfo) {
            C87412m.m108594g(mJMusicInfo, "musicInfo");
            Log.m105924i("MaasMultiTemplate.MaasSdkUIC", "updateMusicInfo: ");
            ((C119157j) C119157j.f356862d).mo183895z(new C61248a(this, mJMusicInfo));
        }

        /* renamed from: f */
        public final void mo86241f(List<? extends MJMusicInfo> list) {
            C87412m.m108594g(list, "musicInfoList");
            Log.m105924i("MaasMultiTemplate.MaasSdkUIC", "updateMusicInfoList: ");
            C54219z<List<MJMusicInfo>> zVar = this.f174324a;
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            for (T next : list) {
                if (hashSet.add(((MJMusicInfo) next).getMusicID())) {
                    arrayList.add(next);
                }
            }
            zVar.postValue(arrayList);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.maas.uic.MaasSdkUIC$setMaasPreview$1", mo125469f = "MaasSdkUIC.kt", mo125470l = {224}, mo125471m = "invokeSuspend")
    /* renamed from: la0.b$b0 */
    public static final class C61249b0 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f174332d;

        /* renamed from: e */
        public final /* synthetic */ boolean f174333e;

        /* renamed from: f */
        public final /* synthetic */ C109300b f174334f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61249b0(boolean z, C109300b bVar, C15601d<? super C61249b0> dVar) {
            super(2, dVar);
            this.f174333e = z;
            this.f174334f = bVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C61249b0(this.f174333e, this.f174334f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C61249b0) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C108183c0 c0Var;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f174332d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (!this.f174333e && (c0Var = this.f174334f.f327191d) != null) {
                    this.f174332d = 1;
                    obj = c0Var.mo158621k(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return C13598b0.f38549a;
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Boolean bool = (Boolean) obj;
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.maas.uic.MaasSdkUIC$export$2$1", mo125469f = "MaasSdkUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: la0.b$c */
    public static final class C61250c extends C91594j implements C32228q<C45253g<? super Float>, Throwable, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public /* synthetic */ Object f174335d;

        /* renamed from: e */
        public final /* synthetic */ C109300b f174336e;

        /* renamed from: f */
        public final /* synthetic */ String f174337f;

        /* renamed from: g */
        public final /* synthetic */ String f174338g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61250c(C109300b bVar, String str, String str2, C15601d<? super C61250c> dVar) {
            super(3, dVar);
            this.f174336e = bVar;
            this.f174337f = str;
            this.f174338g = str2;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            C45253g gVar = (C45253g) obj;
            C61250c cVar = new C61250c(this.f174336e, this.f174337f, this.f174338g, (C15601d) obj3);
            cVar.f174335d = (Throwable) obj2;
            return cVar.invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            MJAnalyticsS12.MJAnalyticsMovieSession d;
            ResultKt.throwOnFailure(obj);
            if (((Throwable) this.f174335d) == null) {
                Log.m105924i("MaasMultiTemplate.MaasSdkUIC", "release after export");
                C108183c0 c0Var = this.f174336e.f327191d;
                if (!(c0Var == null || (d = c0Var.mo158615d()) == null)) {
                    C24789f.f70694a.mo51771c(d);
                }
                C108183c0 c0Var2 = this.f174336e.f327191d;
                if (c0Var2 != null) {
                    c0Var2.mo158617f();
                }
                C24789f fVar = C24789f.f70694a;
                String str = this.f174337f;
                String str2 = this.f174338g;
                C87412m.m108594g(str, "templateId");
                C87412m.m108594g(str2, "musicId");
                MaasRecommendReportStruct maasRecommendReportStruct = C24789f.f70695b;
                maasRecommendReportStruct.f69534o = maasRecommendReportStruct.mo86045b("savetid", str, true);
                maasRecommendReportStruct.f69535p = maasRecommendReportStruct.mo86045b("savesid", str2, true);
                fVar.mo51770b(1);
                this.f174336e.f327191d = null;
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.maas.uic.MaasSdkUIC$setRenderSurface$1", mo125469f = "MaasSdkUIC.kt", mo125470l = {400}, mo125471m = "invokeSuspend")
    /* renamed from: la0.b$c0 */
    public static final class C61251c0 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f174339d;

        /* renamed from: e */
        public final /* synthetic */ C109300b f174340e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61251c0(C109300b bVar, C15601d<? super C61251c0> dVar) {
            super(2, dVar);
            this.f174340e = bVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C61251c0(this.f174340e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C61251c0) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f174339d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C32226l<? super C15601d<? super C13598b0>, ? extends Object> lVar = this.f174340e.f327207w;
                if (lVar != null) {
                    this.f174339d = 1;
                    if (lVar.invoke(this) == aVar) {
                        return aVar;
                    }
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f174340e.f327207w = null;
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.maas.uic.MaasSdkUIC$onPause$1", mo125469f = "MaasSdkUIC.kt", mo125470l = {146}, mo125471m = "invokeSuspend")
    /* renamed from: la0.b$f */
    public static final class C61252f extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f174341d;

        /* renamed from: e */
        public final /* synthetic */ C109300b f174342e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61252f(C109300b bVar, C15601d<? super C61252f> dVar) {
            super(2, dVar);
            this.f174342e = bVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C61252f(this.f174342e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C61252f) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f174341d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C108183c0 c0Var = this.f174342e.f327191d;
                if (c0Var != null) {
                    this.f174341d = 1;
                    obj = c0Var.mo158621k(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return C13598b0.f38549a;
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Boolean bool = (Boolean) obj;
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.maas.uic.MaasSdkUIC$onResume$1", mo125469f = "MaasSdkUIC.kt", mo125470l = {127}, mo125471m = "invokeSuspend")
    /* renamed from: la0.b$h */
    public static final class C61253h extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f174343d;

        /* renamed from: e */
        public final /* synthetic */ C109300b f174344e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61253h(C109300b bVar, C15601d<? super C61253h> dVar) {
            super(2, dVar);
            this.f174344e = bVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C61253h(this.f174344e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C61253h) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f174343d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C109300b bVar = this.f174344e;
                C108183c0 c0Var = bVar.f327191d;
                if (c0Var != null) {
                    MJTime mJTime = bVar.f327204t;
                    C87412m.m108593f(mJTime, "curPlayTime");
                    this.f174343d = 1;
                    obj = c0Var.mo158620i(mJTime, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return C13598b0.f38549a;
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Boolean bool = (Boolean) obj;
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.maas.uic.MaasSdkUIC$onResume$2", mo125469f = "MaasSdkUIC.kt", mo125470l = {133}, mo125471m = "invokeSuspend")
    /* renamed from: la0.b$i */
    public static final class C61254i extends C91594j implements C32226l<C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f174345d;

        /* renamed from: e */
        public final /* synthetic */ C109300b f174346e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61254i(C109300b bVar, C15601d<? super C61254i> dVar) {
            super(1, dVar);
            this.f174346e = bVar;
        }

        public final C15601d<C13598b0> create(C15601d<?> dVar) {
            return new C61254i(this.f174346e, dVar);
        }

        public Object invoke(Object obj) {
            return ((C61254i) create((C15601d) obj)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f174345d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Log.m105924i("MaasMultiTemplate.MaasSdkUIC", "onResume: delay execute");
                C109300b bVar = this.f174346e;
                C108183c0 c0Var = bVar.f327191d;
                if (c0Var != null) {
                    MJTime mJTime = bVar.f327204t;
                    C87412m.m108593f(mJTime, "curPlayTime");
                    this.f174345d = 1;
                    obj = c0Var.mo158620i(mJTime, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return C13598b0.f38549a;
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Boolean bool = (Boolean) obj;
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.maas.uic.MaasSdkUIC$recreateWithMusicID$2$1", mo125469f = "MaasSdkUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: la0.b$t */
    public static final class C61255t extends C91594j implements C32227p<C45253g<? super Float>, C15601d<? super C13598b0>, Object> {
        public C61255t(C15601d<? super C61255t> dVar) {
            super(2, dVar);
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C61255t(dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            C45253g gVar = (C45253g) obj;
            new C61255t((C15601d) obj2);
            C13598b0 b0Var = C13598b0.f38549a;
            ResultKt.throwOnFailure(b0Var);
            return b0Var;
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.maas.uic.MaasSdkUIC$recreateWithTemplateID$2$4", mo125469f = "MaasSdkUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: la0.b$a0 */
    public static final class C109301a0 extends C91594j implements C32228q<C45253g<? super Float>, Throwable, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public /* synthetic */ Object f327210d;

        /* renamed from: e */
        public final /* synthetic */ C109300b f327211e;

        /* renamed from: f */
        public final /* synthetic */ C108183c0 f327212f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109301a0(C109300b bVar, C108183c0 c0Var, C15601d<? super C109301a0> dVar) {
            super(3, dVar);
            this.f327211e = bVar;
            this.f327212f = c0Var;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            C45253g gVar = (C45253g) obj;
            C109301a0 a0Var = new C109301a0(this.f327211e, this.f327212f, (C15601d) obj3);
            a0Var.f327210d = (Throwable) obj2;
            return a0Var.invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            if (((Throwable) this.f327210d) == null) {
                this.f327211e.mo160520j3();
                C61247a aVar = this.f327211e.f327197j;
                List<MJMusicInfo> currentTemplateMusicInfos = this.f327212f.f323934a.getCurrentTemplateMusicInfos();
                C87412m.m108593f(currentTemplateMusicInfos, "mgr.movieSession.currentTemplateMusicInfos");
                aVar.mo86241f(currentTemplateMusicInfos);
                C61247a aVar2 = this.f327211e.f327197j;
                MJMusicInfo currentMusicInfo = this.f327212f.f323934a.getCurrentMusicInfo();
                if (currentMusicInfo == null) {
                    currentMusicInfo = new MJMusicInfo("", "", "", MJTime.InvalidTime, new Object[0]);
                }
                aVar2.mo86240e(currentMusicInfo);
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.maas.uic.MaasSdkUIC", mo125469f = "MaasSdkUIC.kt", mo125470l = {335}, mo125471m = "export")
    /* renamed from: la0.b$b */
    public static final class C109302b extends C66704d {

        /* renamed from: d */
        public Object f327213d;

        /* renamed from: e */
        public Object f327214e;

        /* renamed from: f */
        public Object f327215f;

        /* renamed from: g */
        public Object f327216g;

        /* renamed from: h */
        public Object f327217h;

        /* renamed from: i */
        public /* synthetic */ Object f327218i;

        /* renamed from: j */
        public final /* synthetic */ C109300b f327219j;

        /* renamed from: n */
        public int f327220n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109302b(C109300b bVar, C15601d<? super C109302b> dVar) {
            super(dVar);
            this.f327219j = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f327218i = obj;
            this.f327220n |= Integer.MIN_VALUE;
            return this.f327219j.mo86212N2((String) null, this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.maas.uic.MaasSdkUIC", mo125469f = "MaasSdkUIC.kt", mo125470l = {561}, mo125471m = "mediaPreCheck")
    /* renamed from: la0.b$d */
    public static final class C109303d extends C66704d {

        /* renamed from: d */
        public Object f327221d;

        /* renamed from: e */
        public Object f327222e;

        /* renamed from: f */
        public Object f327223f;

        /* renamed from: g */
        public Object f327224g;

        /* renamed from: h */
        public Object f327225h;

        /* renamed from: i */
        public /* synthetic */ Object f327226i;

        /* renamed from: j */
        public final /* synthetic */ C109300b f327227j;

        /* renamed from: n */
        public int f327228n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109303d(C109300b bVar, C15601d<? super C109303d> dVar) {
            super(dVar);
            this.f327227j = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f327226i = obj;
            this.f327228n |= Integer.MIN_VALUE;
            return this.f327227j.mo160518f3(this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.maas.uic.MaasSdkUIC", mo125469f = "MaasSdkUIC.kt", mo125470l = {234}, mo125471m = "switchMovieOption")
    /* renamed from: la0.b$d0 */
    public static final class C109304d0 extends C66704d {

        /* renamed from: d */
        public Object f327229d;

        /* renamed from: e */
        public /* synthetic */ Object f327230e;

        /* renamed from: f */
        public final /* synthetic */ C109300b f327231f;

        /* renamed from: g */
        public int f327232g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109304d0(C109300b bVar, C15601d<? super C109304d0> dVar) {
            super(dVar);
            this.f327231f = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f327230e = obj;
            this.f327232g |= Integer.MIN_VALUE;
            return this.f327231f.mo86214Q2(false, false, this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.maas.uic.MaasSdkUIC$onCreate$1", mo125469f = "MaasSdkUIC.kt", mo125470l = {109, 111}, mo125471m = "invokeSuspend")
    /* renamed from: la0.b$e */
    public static final class C109305e extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f327233d;

        /* renamed from: e */
        public final /* synthetic */ C109300b f327234e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109305e(C109300b bVar, C15601d<? super C109305e> dVar) {
            super(2, dVar);
            this.f327234e = bVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C109305e(this.f327234e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C109305e) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f327233d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C61242a.C61246d dVar = this.f327234e.f327193f;
                if (dVar != null) {
                    this.f327233d = 1;
                    if (dVar.mo75243f0(this) == aVar) {
                        return aVar;
                    }
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else if (i == 2) {
                ResultKt.throwOnFailure(obj);
                return C13598b0.f38549a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C108221t.f324032a.getClass();
            if (!C108221t.f324046o) {
                C109300b bVar = this.f327234e;
                this.f327233d = 2;
                if (C109300b.m148411d3(bVar, this) == aVar) {
                    return aVar;
                }
            } else {
                C61242a.C61246d dVar2 = this.f327234e.f327193f;
                if (dVar2 != null) {
                    dVar2.mo75247p("maas core released");
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: la0.b$g */
    public static final class C109306g implements MJMovieSession.OnMediaTimeChange {

        /* renamed from: a */
        public final /* synthetic */ C109300b f327235a;

        public C109306g(C109300b bVar) {
            this.f327235a = bVar;
        }

        public final void onMediaTimeChange(MJTime mJTime, MJTimeRange mJTimeRange, long j) {
            this.f327235a.f327204t = mJTime;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.maas.uic.MaasSdkUIC", mo125469f = "MaasSdkUIC.kt", mo125470l = {475, 495}, mo125471m = "performCreation")
    /* renamed from: la0.b$j */
    public static final class C109307j extends C66704d {

        /* renamed from: d */
        public Object f327236d;

        /* renamed from: e */
        public Object f327237e;

        /* renamed from: f */
        public Object f327238f;

        /* renamed from: g */
        public /* synthetic */ Object f327239g;

        /* renamed from: h */
        public final /* synthetic */ C109300b f327240h;

        /* renamed from: i */
        public int f327241i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109307j(C109300b bVar, C15601d<? super C109307j> dVar) {
            super(dVar);
            this.f327240h = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f327239g = obj;
            this.f327241i |= Integer.MIN_VALUE;
            return this.f327240h.mo160519g3(this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.maas.uic.MaasSdkUIC$performCreation$2$1", mo125469f = "MaasSdkUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: la0.b$k */
    public static final class C109308k extends C91594j implements C32228q<C45253g<? super Float>, Throwable, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public /* synthetic */ Object f327242d;

        /* renamed from: e */
        public final /* synthetic */ C109300b f327243e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109308k(C109300b bVar, C15601d<? super C109308k> dVar) {
            super(3, dVar);
            this.f327243e = bVar;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            C45253g gVar = (C45253g) obj;
            C109308k kVar = new C109308k(this.f327243e, (C15601d) obj3);
            kVar.f327242d = (Throwable) obj2;
            return kVar.invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            Log.printErrStackTrace("MaasMultiTemplate.MaasSdkUIC", (Throwable) this.f327242d, "creation error", new Object[0]);
            C61242a.C61246d dVar = this.f327243e.f327193f;
            if (dVar != null) {
                dVar.mo75247p("creation error");
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.maas.uic.MaasSdkUIC$performCreation$2$2", mo125469f = "MaasSdkUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: la0.b$l */
    public static final class C109309l extends C91594j implements C32228q<C45253g<? super Float>, Throwable, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C109300b f327244d;

        /* renamed from: e */
        public final /* synthetic */ C108183c0 f327245e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109309l(C109300b bVar, C108183c0 c0Var, C15601d<? super C109309l> dVar) {
            super(3, dVar);
            this.f327244d = bVar;
            this.f327245e = c0Var;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            C45253g gVar = (C45253g) obj;
            Throwable th = (Throwable) obj2;
            return new C109309l(this.f327244d, this.f327245e, (C15601d) obj3).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            C61247a aVar = this.f327244d.f327197j;
            List currentTemplateMusicInfos = this.f327245e.f323934a.getCurrentTemplateMusicInfos();
            if (currentTemplateMusicInfos == null) {
                currentTemplateMusicInfos = C64186f0.f181907d;
            }
            aVar.mo86241f(currentTemplateMusicInfos);
            C61247a aVar2 = this.f327244d.f327197j;
            MJMusicInfo currentMusicInfo = this.f327245e.f323934a.getCurrentMusicInfo();
            if (currentMusicInfo == null) {
                currentMusicInfo = new MJMusicInfo("", "", "", MJTime.InvalidTime, new Object[0]);
            }
            aVar2.mo86240e(currentMusicInfo);
            Log.m105924i("MaasMultiTemplate.MaasSdkUIC", "startMovieCreationAutoRecommendTemplate onCompletion");
            this.f327245e.f323934a.setOnPlaybackMediaTimeDidChange(this.f327244d.f327206v);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: la0.b$m */
    public static final class C109310m implements C45253g<Float> {

        /* renamed from: d */
        public final /* synthetic */ C109300b f327246d;

        public C109310m(C109300b bVar) {
            this.f327246d = bVar;
        }

        public Object emit(Object obj, C15601d dVar) {
            float floatValue = ((Number) obj).floatValue();
            C61242a.C61246d dVar2 = this.f327246d.f327193f;
            if (dVar2 != null) {
                Float f = new Float(floatValue);
                if (!(!Float.isNaN(f.floatValue()))) {
                    f = null;
                }
                dVar2.mo86239w(f != null ? f.floatValue() : 0.0f);
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.maas.uic.MaasSdkUIC$performCreation$2$4", mo125469f = "MaasSdkUIC.kt", mo125470l = {498}, mo125471m = "invokeSuspend")
    /* renamed from: la0.b$n */
    public static final class C109311n extends C91594j implements C32226l<C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f327247d;

        /* renamed from: e */
        public final /* synthetic */ C109300b f327248e;

        /* renamed from: f */
        public final /* synthetic */ C108183c0 f327249f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109311n(C109300b bVar, C108183c0 c0Var, C15601d<? super C109311n> dVar) {
            super(1, dVar);
            this.f327248e = bVar;
            this.f327249f = c0Var;
        }

        public final C15601d<C13598b0> create(C15601d<?> dVar) {
            return new C109311n(this.f327248e, this.f327249f, dVar);
        }

        public Object invoke(Object obj) {
            return ((C109311n) create((C15601d) obj)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f327247d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C109300b bVar = this.f327248e;
                C108183c0 c0Var = this.f327249f;
                this.f327247d = 1;
                if (C109300b.m148413i3(bVar, c0Var, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.maas.uic.MaasSdkUIC", mo125469f = "MaasSdkUIC.kt", mo125470l = {486}, mo125471m = "performCreation$lambda-10$startPlay")
    /* renamed from: la0.b$o */
    public static final class C109312o extends C66704d {

        /* renamed from: d */
        public Object f327250d;

        /* renamed from: e */
        public /* synthetic */ Object f327251e;

        /* renamed from: f */
        public int f327252f;

        public C109312o(C15601d<? super C109312o> dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f327251e = obj;
            this.f327252f |= Integer.MIN_VALUE;
            return C109300b.m148413i3((C109300b) null, (C108183c0) null, this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.maas.uic.MaasSdkUIC", mo125469f = "MaasSdkUIC.kt", mo125470l = {295}, mo125471m = "recreateWithBlankTemplate")
    /* renamed from: la0.b$p */
    public static final class C109313p extends C66704d {

        /* renamed from: d */
        public Object f327253d;

        /* renamed from: e */
        public Object f327254e;

        /* renamed from: f */
        public /* synthetic */ Object f327255f;

        /* renamed from: g */
        public final /* synthetic */ C109300b f327256g;

        /* renamed from: h */
        public int f327257h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109313p(C109300b bVar, C15601d<? super C109313p> dVar) {
            super(dVar);
            this.f327256g = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f327255f = obj;
            this.f327257h |= Integer.MIN_VALUE;
            return this.f327256g.mo86225p0(this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.maas.uic.MaasSdkUIC$recreateWithBlankTemplate$2$1", mo125469f = "MaasSdkUIC.kt", mo125470l = {297}, mo125471m = "invokeSuspend")
    /* renamed from: la0.b$q */
    public static final class C109314q extends C91594j implements C32228q<C45253g<? super Float>, Throwable, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f327258d;

        /* renamed from: e */
        public final /* synthetic */ C109300b f327259e;

        /* renamed from: f */
        public final /* synthetic */ C108183c0 f327260f;

        @C91590f(mo125468c = "com.tencent.mm.mj_template.maas.uic.MaasSdkUIC$recreateWithBlankTemplate$2$1$1", mo125469f = "MaasSdkUIC.kt", mo125470l = {298}, mo125471m = "invokeSuspend")
        /* renamed from: la0.b$q$a */
        public static final class C109315a extends C91594j implements C32226l<C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public int f327261d;

            /* renamed from: e */
            public final /* synthetic */ C108183c0 f327262e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C109315a(C108183c0 c0Var, C15601d<? super C109315a> dVar) {
                super(1, dVar);
                this.f327262e = c0Var;
            }

            public final C15601d<C13598b0> create(C15601d<?> dVar) {
                return new C109315a(this.f327262e, dVar);
            }

            public Object invoke(Object obj) {
                return ((C109315a) create((C15601d) obj)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f327261d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    C108183c0 c0Var = this.f327262e;
                    this.f327261d = 1;
                    if (C108183c0.m146537j(c0Var, (MJTime) null, this, 1, (Object) null) == aVar) {
                        return aVar;
                    }
                } else if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109314q(C109300b bVar, C108183c0 c0Var, C15601d<? super C109314q> dVar) {
            super(3, dVar);
            this.f327259e = bVar;
            this.f327260f = c0Var;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            C45253g gVar = (C45253g) obj;
            Throwable th = (Throwable) obj2;
            return new C109314q(this.f327259e, this.f327260f, (C15601d) obj3).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f327258d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C109300b bVar = this.f327259e;
                C109315a aVar2 = new C109315a(this.f327260f, (C15601d<? super C109315a>) null);
                this.f327258d = 1;
                if (C109300b.m148410c3(bVar, aVar2, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.maas.uic.MaasSdkUIC$recreateWithBlankTemplate$2$2", mo125469f = "MaasSdkUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: la0.b$r */
    public static final class C109316r extends C91594j implements C32228q<C45253g<? super Float>, Throwable, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public /* synthetic */ Object f327263d;

        /* renamed from: e */
        public final /* synthetic */ C109300b f327264e;

        /* renamed from: f */
        public final /* synthetic */ C108183c0 f327265f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109316r(C109300b bVar, C108183c0 c0Var, C15601d<? super C109316r> dVar) {
            super(3, dVar);
            this.f327264e = bVar;
            this.f327265f = c0Var;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            C45253g gVar = (C45253g) obj;
            C109316r rVar = new C109316r(this.f327264e, this.f327265f, (C15601d) obj3);
            rVar.f327263d = (Throwable) obj2;
            return rVar.invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            if (((Throwable) this.f327263d) == null) {
                C109300b bVar = this.f327264e;
                if (bVar.f327209y) {
                    C61247a aVar = bVar.f327197j;
                    List currentTemplateMusicInfos = this.f327265f.f323934a.getCurrentTemplateMusicInfos();
                    if (currentTemplateMusicInfos == null) {
                        currentTemplateMusicInfos = C64186f0.f181907d;
                    }
                    aVar.mo86241f(currentTemplateMusicInfos);
                    C61247a aVar2 = this.f327264e.f327197j;
                    MJMusicInfo currentMusicInfo = this.f327265f.f323934a.getCurrentMusicInfo();
                    if (currentMusicInfo == null) {
                        currentMusicInfo = new MJMusicInfo("", "", "", MJTime.InvalidTime, new Object[0]);
                    }
                    aVar2.mo86240e(currentMusicInfo);
                } else {
                    bVar.f327197j.mo86241f(C64186f0.f181907d);
                    this.f327264e.f327197j.mo86240e(new MJMusicInfo("", "", "", MJTime.InvalidTime, new Object[0]));
                }
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.maas.uic.MaasSdkUIC", mo125469f = "MaasSdkUIC.kt", mo125470l = {245}, mo125471m = "recreateWithMusicID")
    /* renamed from: la0.b$s */
    public static final class C109317s extends C66704d {

        /* renamed from: d */
        public Object f327266d;

        /* renamed from: e */
        public Object f327267e;

        /* renamed from: f */
        public Object f327268f;

        /* renamed from: g */
        public /* synthetic */ Object f327269g;

        /* renamed from: h */
        public final /* synthetic */ C109300b f327270h;

        /* renamed from: i */
        public int f327271i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109317s(C109300b bVar, C15601d<? super C109317s> dVar) {
            super(dVar);
            this.f327270h = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f327269g = obj;
            this.f327271i |= Integer.MIN_VALUE;
            return this.f327270h.mo86206G2((String) null, this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.maas.uic.MaasSdkUIC$recreateWithMusicID$2$2", mo125469f = "MaasSdkUIC.kt", mo125470l = {247}, mo125471m = "invokeSuspend")
    /* renamed from: la0.b$u */
    public static final class C109318u extends C91594j implements C32228q<C45253g<? super Float>, Throwable, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f327272d;

        /* renamed from: e */
        public final /* synthetic */ C109300b f327273e;

        /* renamed from: f */
        public final /* synthetic */ C108183c0 f327274f;

        @C91590f(mo125468c = "com.tencent.mm.mj_template.maas.uic.MaasSdkUIC$recreateWithMusicID$2$2$1", mo125469f = "MaasSdkUIC.kt", mo125470l = {248}, mo125471m = "invokeSuspend")
        /* renamed from: la0.b$u$a */
        public static final class C109319a extends C91594j implements C32226l<C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public int f327275d;

            /* renamed from: e */
            public final /* synthetic */ C108183c0 f327276e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C109319a(C108183c0 c0Var, C15601d<? super C109319a> dVar) {
                super(1, dVar);
                this.f327276e = c0Var;
            }

            public final C15601d<C13598b0> create(C15601d<?> dVar) {
                return new C109319a(this.f327276e, dVar);
            }

            public Object invoke(Object obj) {
                return ((C109319a) create((C15601d) obj)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f327275d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    C108183c0 c0Var = this.f327276e;
                    this.f327275d = 1;
                    if (C108183c0.m146537j(c0Var, (MJTime) null, this, 1, (Object) null) == aVar) {
                        return aVar;
                    }
                } else if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109318u(C109300b bVar, C108183c0 c0Var, C15601d<? super C109318u> dVar) {
            super(3, dVar);
            this.f327273e = bVar;
            this.f327274f = c0Var;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            C45253g gVar = (C45253g) obj;
            Throwable th = (Throwable) obj2;
            return new C109318u(this.f327273e, this.f327274f, (C15601d) obj3).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f327272d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C109300b bVar = this.f327273e;
                C109319a aVar2 = new C109319a(this.f327274f, (C15601d<? super C109319a>) null);
                this.f327272d = 1;
                if (C109300b.m148410c3(bVar, aVar2, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.maas.uic.MaasSdkUIC$recreateWithMusicID$2$3", mo125469f = "MaasSdkUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: la0.b$v */
    public static final class C109320v extends C91594j implements C32228q<C45253g<? super Float>, Throwable, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public /* synthetic */ Object f327277d;

        /* renamed from: e */
        public final /* synthetic */ C109300b f327278e;

        /* renamed from: f */
        public final /* synthetic */ C108183c0 f327279f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109320v(C109300b bVar, C108183c0 c0Var, C15601d<? super C109320v> dVar) {
            super(3, dVar);
            this.f327278e = bVar;
            this.f327279f = c0Var;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            C45253g gVar = (C45253g) obj;
            C109320v vVar = new C109320v(this.f327278e, this.f327279f, (C15601d) obj3);
            vVar.f327277d = (Throwable) obj2;
            return vVar.invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            if (((Throwable) this.f327277d) == null) {
                this.f327278e.mo160520j3();
                C61247a aVar = this.f327278e.f327197j;
                MJMusicInfo currentMusicInfo = this.f327279f.f323934a.getCurrentMusicInfo();
                C87412m.m108593f(currentMusicInfo, "mgr.movieSession.currentMusicInfo");
                aVar.mo86240e(currentMusicInfo);
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.maas.uic.MaasSdkUIC", mo125469f = "MaasSdkUIC.kt", mo125470l = {272}, mo125471m = "recreateWithTemplateID")
    /* renamed from: la0.b$w */
    public static final class C109321w extends C66704d {

        /* renamed from: d */
        public Object f327280d;

        /* renamed from: e */
        public Object f327281e;

        /* renamed from: f */
        public Object f327282f;

        /* renamed from: g */
        public /* synthetic */ Object f327283g;

        /* renamed from: h */
        public final /* synthetic */ C109300b f327284h;

        /* renamed from: i */
        public int f327285i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109321w(C109300b bVar, C15601d<? super C109321w> dVar) {
            super(dVar);
            this.f327284h = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f327283g = obj;
            this.f327285i |= Integer.MIN_VALUE;
            return this.f327284h.mo86202A1((String) null, this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.maas.uic.MaasSdkUIC$recreateWithTemplateID$2$1", mo125469f = "MaasSdkUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: la0.b$x */
    public static final class C109322x extends C91594j implements C32227p<C45253g<? super Float>, C15601d<? super C13598b0>, Object> {
        public C109322x(C15601d<? super C109322x> dVar) {
            super(2, dVar);
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C109322x(dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            C45253g gVar = (C45253g) obj;
            new C109322x((C15601d) obj2);
            C13598b0 b0Var = C13598b0.f38549a;
            ResultKt.throwOnFailure(b0Var);
            return b0Var;
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.maas.uic.MaasSdkUIC$recreateWithTemplateID$2$2", mo125469f = "MaasSdkUIC.kt", mo125470l = {266}, mo125471m = "invokeSuspend")
    /* renamed from: la0.b$y */
    public static final class C109323y extends C91594j implements C32228q<C45253g<? super Float>, Throwable, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f327286d;

        /* renamed from: e */
        public final /* synthetic */ C108183c0 f327287e;

        /* renamed from: f */
        public final /* synthetic */ C109300b f327288f;

        @C91590f(mo125468c = "com.tencent.mm.mj_template.maas.uic.MaasSdkUIC$recreateWithTemplateID$2$2$1", mo125469f = "MaasSdkUIC.kt", mo125470l = {267}, mo125471m = "invokeSuspend")
        /* renamed from: la0.b$y$a */
        public static final class C109324a extends C91594j implements C32226l<C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public int f327289d;

            /* renamed from: e */
            public final /* synthetic */ C108183c0 f327290e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C109324a(C108183c0 c0Var, C15601d<? super C109324a> dVar) {
                super(1, dVar);
                this.f327290e = c0Var;
            }

            public final C15601d<C13598b0> create(C15601d<?> dVar) {
                return new C109324a(this.f327290e, dVar);
            }

            public Object invoke(Object obj) {
                return ((C109324a) create((C15601d) obj)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f327289d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    C108183c0 c0Var = this.f327290e;
                    this.f327289d = 1;
                    if (C108183c0.m146537j(c0Var, (MJTime) null, this, 1, (Object) null) == aVar) {
                        return aVar;
                    }
                } else if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109323y(C108183c0 c0Var, C109300b bVar, C15601d<? super C109323y> dVar) {
            super(3, dVar);
            this.f327287e = c0Var;
            this.f327288f = bVar;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            C45253g gVar = (C45253g) obj;
            Throwable th = (Throwable) obj2;
            return new C109323y(this.f327287e, this.f327288f, (C15601d) obj3).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f327286d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.f327287e.mo158616e()) {
                    if (!(this.f327287e.f323934a.getCurrentState() == MJMovieSessionState.Playing)) {
                        Log.m105924i("MaasMultiTemplate.MaasSdkUIC", "recreateWithTemplateID: start play");
                        C109300b bVar = this.f327288f;
                        C109324a aVar2 = new C109324a(this.f327287e, (C15601d<? super C109324a>) null);
                        this.f327286d = 1;
                        if (C109300b.m148410c3(bVar, aVar2, this) == aVar) {
                            return aVar;
                        }
                    }
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.maas.uic.MaasSdkUIC$recreateWithTemplateID$2$3", mo125469f = "MaasSdkUIC.kt", mo125470l = {274}, mo125471m = "invokeSuspend")
    /* renamed from: la0.b$z */
    public static final class C109325z extends C91594j implements C32228q<C45253g<? super Float>, Throwable, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f327291d;

        /* renamed from: e */
        public final /* synthetic */ C109300b f327292e;

        /* renamed from: f */
        public final /* synthetic */ C108183c0 f327293f;

        @C91590f(mo125468c = "com.tencent.mm.mj_template.maas.uic.MaasSdkUIC$recreateWithTemplateID$2$3$1", mo125469f = "MaasSdkUIC.kt", mo125470l = {275}, mo125471m = "invokeSuspend")
        /* renamed from: la0.b$z$a */
        public static final class C109326a extends C91594j implements C32226l<C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public int f327294d;

            /* renamed from: e */
            public final /* synthetic */ C108183c0 f327295e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C109326a(C108183c0 c0Var, C15601d<? super C109326a> dVar) {
                super(1, dVar);
                this.f327295e = c0Var;
            }

            public final C15601d<C13598b0> create(C15601d<?> dVar) {
                return new C109326a(this.f327295e, dVar);
            }

            public Object invoke(Object obj) {
                return ((C109326a) create((C15601d) obj)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f327294d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    C108183c0 c0Var = this.f327295e;
                    this.f327294d = 1;
                    if (C108183c0.m146537j(c0Var, (MJTime) null, this, 1, (Object) null) == aVar) {
                        return aVar;
                    }
                } else if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109325z(C109300b bVar, C108183c0 c0Var, C15601d<? super C109325z> dVar) {
            super(3, dVar);
            this.f327292e = bVar;
            this.f327293f = c0Var;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            C45253g gVar = (C45253g) obj;
            Throwable th = (Throwable) obj2;
            return new C109325z(this.f327292e, this.f327293f, (C15601d) obj3).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f327291d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C109300b bVar = this.f327292e;
                C109326a aVar2 = new C109326a(this.f327293f, (C15601d<? super C109326a>) null);
                this.f327291d = 1;
                if (C109300b.m148410c3(bVar, aVar2, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109300b(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C64186f0 f0Var = C64186f0.f181907d;
        this.f327192e = new C61242a.C61245c(MJRecommendOptions.SCENE_FINDER, false, true, -1, false, f0Var, 0, false, (List<String>) null, false);
        this.f327195h = new C54219z<>(f0Var);
        this.f327196i = new C54219z<>(f0Var);
        this.f327197j = new C61247a();
        this.f327198n = "";
        this.f327199o = true;
        this.f327200p = true;
        this.f327201q = "";
        this.f327202r = f0Var;
        this.f327204t = MJTime.ZeroTime;
        this.f327205u = true;
        this.f327206v = new C109306g(this);
    }

    /* renamed from: c3 */
    public static final Object m148410c3(C109300b bVar, C32226l lVar, C15601d dVar) {
        if (bVar.f327208x) {
            Log.m105924i("MaasMultiTemplate.MaasSdkUIC", "execute now");
            Object invoke = lVar.invoke(dVar);
            return invoke == C15911a.COROUTINE_SUSPENDED ? invoke : C13598b0.f38549a;
        }
        Log.m105924i("MaasMultiTemplate.MaasSdkUIC", "execute delay");
        bVar.f327207w = lVar;
        return C13598b0.f38549a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: d3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m148411d3(la0.C109300b r6, wx3.C15601d r7) {
        /*
            r6.getClass()
            boolean r0 = r7 instanceof la0.C109327c
            if (r0 == 0) goto L_0x0016
            r0 = r7
            la0.c r0 = (la0.C109327c) r0
            int r1 = r0.f327299g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.f327299g = r1
            goto L_0x001b
        L_0x0016:
            la0.c r0 = new la0.c
            r0.<init>(r6, r7)
        L_0x001b:
            java.lang.Object r7 = r0.f327297e
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f327299g
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0048
            if (r2 == r5) goto L_0x0040
            if (r2 == r4) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x0090
        L_0x0030:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0038:
            java.lang.Object r6 = r0.f327296d
            la0.b r6 = (la0.C109300b) r6
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x0084
        L_0x0040:
            java.lang.Object r6 = r0.f327296d
            la0.b r6 = (la0.C109300b) r6
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x005a
        L_0x0048:
            kotlin.ResultKt.throwOnFailure(r7)
            ha0.t r7 = ha0.C108221t.f324032a
            la0.a$c r2 = r6.f327192e
            r0.f327296d = r6
            r0.f327299g = r5
            java.lang.Object r7 = r7.mo158627g(r2, r0)
            if (r7 != r1) goto L_0x005a
            goto L_0x0092
        L_0x005a:
            ha0.c0 r7 = (ha0.C108183c0) r7
            if (r7 != 0) goto L_0x006a
            la0.a$d r6 = r6.f327193f
            if (r6 == 0) goto L_0x0067
            java.lang.String r7 = "create movieSessionManager error"
            r6.mo75247p(r7)
        L_0x0067:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x0092
        L_0x006a:
            r6.f327191d = r7
            la0.a$d r7 = r6.f327193f
            if (r7 == 0) goto L_0x0073
            r7.mo86237W1()
        L_0x0073:
            int r7 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r7 >= r2) goto L_0x0084
            r0.f327296d = r6
            r0.f327299g = r4
            java.lang.Object r7 = r6.mo160518f3(r0)
            if (r7 != r1) goto L_0x0084
            goto L_0x0092
        L_0x0084:
            r7 = 0
            r0.f327296d = r7
            r0.f327299g = r3
            java.lang.Object r6 = r6.mo160519g3(r0)
            if (r6 != r1) goto L_0x0090
            goto L_0x0092
        L_0x0090:
            rx3.b0 r1 = rx3.C13598b0.f38549a
        L_0x0092:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: la0.C109300b.m148411d3(la0.b, wx3.d):java.lang.Object");
    }

    /* renamed from: e3 */
    public static final void m148412e3(C109300b bVar, C108183c0 c0Var, C108236x0 x0Var) {
        bVar.f327194g.postValue(new C59807w0(x0Var != null ? x0Var.f324092d : null));
        if (x0Var != null) {
            Log.m105920e("MaasMultiTemplate.MaasSdkUIC", "recommend error " + x0Var.getMessage());
            return;
        }
        ArrayList<MJTemplateInfo> recommendedTemplateInfos = c0Var.f323934a.getRecommendedTemplateInfos();
        C87412m.m108593f(recommendedTemplateInfos, "manager.movieSession.recommendedTemplateInfos");
        ArrayList arrayList = new ArrayList();
        for (T next : recommendedTemplateInfos) {
            if (((MJTemplateInfo) next).getTemplateDescVersion() != 0) {
                arrayList.add(next);
            }
        }
        ArrayList<MJTemplateCategory> recommendedTemplateCategories = c0Var.f323934a.getRecommendedTemplateCategories();
        Log.m105924i("MaasMultiTemplate.MaasSdkUIC", "recommendResult: template.size:" + arrayList.size() + ",categories.size:" + recommendedTemplateCategories.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            MJTemplateInfo mJTemplateInfo = (MJTemplateInfo) it.next();
            C62586b bVar2 = C62586b.f177739a;
            C87412m.m108593f(mJTemplateInfo, LocaleUtil.ITALIAN);
            bVar2.getClass();
            Log.m105924i("MicroMsg.Maas.CreationSameInfoHolder", "cacheMJTemplate:" + mJTemplateInfo.getTemplateID() + ", " + mJTemplateInfo.getTemplateDescVersion() + ", " + mJTemplateInfo.getTemplateDescURL() + ", " + mJTemplateInfo.getThumbnailURL());
            C62586b.f177748j.put(mJTemplateInfo.getTemplateID(), mJTemplateInfo);
        }
        bVar.f327195h.postValue(arrayList);
        bVar.f327196i.postValue(recommendedTemplateCategories);
        C53895h.m60466d(bVar.getLifecycleScope(), (C66212f) null, (C53934p0) null, new C61256d(bVar, arrayList, (C15601d<? super C61256d>) null), 3, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: i3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m148413i3(la0.C109300b r4, ha0.C108183c0 r5, wx3.C15601d<? super rx3.C13598b0> r6) {
        /*
            boolean r0 = r6 instanceof la0.C109300b.C109312o
            if (r0 == 0) goto L_0x0013
            r0 = r6
            la0.b$o r0 = (la0.C109300b.C109312o) r0
            int r1 = r0.f327252f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f327252f = r1
            goto L_0x0018
        L_0x0013:
            la0.b$o r0 = new la0.b$o
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.f327251e
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f327252f
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r4 = r0.f327250d
            la0.b r4 = (la0.C109300b) r4
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x0062
        L_0x002b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0033:
            kotlin.ResultKt.throwOnFailure(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r2 = "performCreation delay task executed maasPreview "
            r6.append(r2)
            boolean r2 = r4.f327205u
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            java.lang.String r2 = "MaasMultiTemplate.MaasSdkUIC"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r6)
            boolean r6 = r4.f327205u
            if (r6 != 0) goto L_0x0056
            r4.mo160520j3()
            goto L_0x0077
        L_0x0056:
            r0.f327250d = r4
            r0.f327252f = r3
            r6 = 0
            java.lang.Object r6 = ha0.C108183c0.m146537j(r5, r6, r0, r3, r6)
            if (r6 != r1) goto L_0x0062
            return r1
        L_0x0062:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r5 = r6.booleanValue()
            if (r5 == 0) goto L_0x006e
            r4.mo160520j3()
            goto L_0x0077
        L_0x006e:
            la0.a$d r4 = r4.f327193f
            if (r4 == 0) goto L_0x0077
            java.lang.String r5 = "start play error"
            r4.mo75247p(r5)
        L_0x0077:
            rx3.b0 r4 = rx3.C13598b0.f38549a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: la0.C109300b.m148413i3(la0.b, ha0.c0, wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: A1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo86202A1(java.lang.String r6, wx3.C15601d<? super d14.C45252f<java.lang.Float>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof la0.C109300b.C109321w
            if (r0 == 0) goto L_0x0013
            r0 = r7
            la0.b$w r0 = (la0.C109300b.C109321w) r0
            int r1 = r0.f327285i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f327285i = r1
            goto L_0x0018
        L_0x0013:
            la0.b$w r0 = new la0.b$w
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f327283g
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f327285i
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            java.lang.Object r6 = r0.f327282f
            ha0.c0 r6 = (ha0.C108183c0) r6
            java.lang.Object r1 = r0.f327281e
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.f327280d
            la0.b r0 = (la0.C109300b) r0
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x009b
        L_0x0034:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003c:
            kotlin.ResultKt.throwOnFailure(r7)
            ha0.c0 r7 = r5.f327191d
            if (r7 == 0) goto L_0x00db
            com.tencent.maas.instamovie.MJMovieSession r2 = r7.f323934a
            com.tencent.maas.model.MJTemplateInfo r2 = r2.getCurrentTemplateInfo()
            if (r2 == 0) goto L_0x0050
            java.lang.String r2 = r2.getTemplateID()
            goto L_0x0051
        L_0x0050:
            r2 = r4
        L_0x0051:
            boolean r2 = gy3.C87412m.m108589b(r6, r2)
            if (r2 == 0) goto L_0x0082
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "no need to recreateWithTemplateID "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r0 = "MaasMultiTemplate.MaasSdkUIC"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r6)
            la0.b$x r6 = new la0.b$x
            r6.<init>(r4)
            d14.x0 r0 = new d14.x0
            r0.<init>(r6)
            la0.b$y r6 = new la0.b$y
            r6.<init>(r7, r5, r4)
            d14.q r7 = new d14.q
            r7.<init>(r0, r6)
            return r7
        L_0x0082:
            boolean r2 = r7.mo158616e()
            if (r2 != 0) goto L_0x00a6
            r0.f327280d = r5
            r0.f327281e = r6
            r0.f327282f = r7
            r0.f327285i = r3
            java.lang.Object r0 = r7.mo158621k(r0)
            if (r0 != r1) goto L_0x0097
            return r1
        L_0x0097:
            r1 = r6
            r6 = r7
            r7 = r0
            r0 = r5
        L_0x009b:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L_0x00db
            r7 = r6
            r6 = r1
            goto L_0x00a7
        L_0x00a6:
            r0 = r5
        L_0x00a7:
            boolean r1 = r0.f327209y
            if (r1 == 0) goto L_0x00ae
            java.lang.String r1 = r0.f327201q
            goto L_0x00af
        L_0x00ae:
            r1 = r4
        L_0x00af:
            r7.getClass()
            java.lang.String r2 = "templateId"
            gy3.C87412m.m108594g(r6, r2)
            ha0.o0 r2 = new ha0.o0
            r2.<init>(r6, r7, r1)
            ha0.q0 r6 = new ha0.q0
            r6.<init>(r7)
            java.lang.String r1 = "221"
            d14.f r6 = ha0.C108238y0.m146562a(r1, r2, r6)
            la0.b$z r1 = new la0.b$z
            r1.<init>(r0, r7, r4)
            d14.q r2 = new d14.q
            r2.<init>(r6, r1)
            la0.b$a0 r6 = new la0.b$a0
            r6.<init>(r0, r7, r4)
            d14.q r4 = new d14.q
            r4.<init>(r2, r6)
        L_0x00db:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: la0.C109300b.mo86202A1(java.lang.String, wx3.d):java.lang.Object");
    }

    /* renamed from: B2 */
    public List<String> mo86203B2() {
        MJMovieSession mJMovieSession;
        List<MJLyricInfo> currentLyricInfos;
        C108183c0 c0Var = this.f327191d;
        if (c0Var == null || (mJMovieSession = c0Var.f323934a) == null || (currentLyricInfos = mJMovieSession.getCurrentLyricInfos()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(C36907w.m41090l(currentLyricInfos, 10));
        for (MJLyricInfo content : currentLyricInfos) {
            arrayList.add(content.getContent());
        }
        return arrayList;
    }

    /* renamed from: E2 */
    public void mo86204E2(C61242a.C61244a aVar) {
        C87412m.m108594g(aVar, "provider");
        this.f327203s = aVar;
    }

    /* renamed from: G1 */
    public Object mo86205G1(List<? extends pr4> list, C15601d<? super List<? extends pr4>> dVar) {
        return C108221t.f324032a.mo158629i(list, dVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: G2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo86206G2(java.lang.String r7, wx3.C15601d<? super d14.C45252f<java.lang.Float>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof la0.C109300b.C109317s
            if (r0 == 0) goto L_0x0013
            r0 = r8
            la0.b$s r0 = (la0.C109300b.C109317s) r0
            int r1 = r0.f327271i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f327271i = r1
            goto L_0x0018
        L_0x0013:
            la0.b$s r0 = new la0.b$s
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f327269g
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f327271i
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0041
            if (r2 != r3) goto L_0x0039
            java.lang.Object r7 = r0.f327268f
            ha0.c0 r7 = (ha0.C108183c0) r7
            java.lang.Object r1 = r0.f327267e
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.f327266d
            la0.b r0 = (la0.C109300b) r0
            kotlin.ResultKt.throwOnFailure(r8)
            r5 = r8
            r8 = r7
            r7 = r1
            r1 = r0
            r0 = r5
            goto L_0x0093
        L_0x0039:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0041:
            kotlin.ResultKt.throwOnFailure(r8)
            ha0.c0 r8 = r6.f327191d
            if (r8 == 0) goto L_0x00ca
            com.tencent.maas.instamovie.MJMovieSession r2 = r8.f323934a
            com.tencent.maas.model.MJMusicInfo r2 = r2.getCurrentMusicInfo()
            if (r2 == 0) goto L_0x0055
            java.lang.String r2 = r2.getMusicID()
            goto L_0x0056
        L_0x0055:
            r2 = r4
        L_0x0056:
            boolean r2 = gy3.C87412m.m108589b(r7, r2)
            if (r2 == 0) goto L_0x007d
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "no need to recreateWithMusicID "
            r8.append(r0)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            java.lang.String r8 = "MaasMultiTemplate.MaasSdkUIC"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r7)
            la0.b$t r7 = new la0.b$t
            r7.<init>(r4)
            d14.x0 r8 = new d14.x0
            r8.<init>(r7)
            return r8
        L_0x007d:
            boolean r2 = r8.mo158616e()
            if (r2 != 0) goto L_0x009c
            r0.f327266d = r6
            r0.f327267e = r7
            r0.f327268f = r8
            r0.f327271i = r3
            java.lang.Object r0 = r8.mo158621k(r0)
            if (r0 != r1) goto L_0x0092
            return r1
        L_0x0092:
            r1 = r6
        L_0x0093:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00ca
            goto L_0x009d
        L_0x009c:
            r1 = r6
        L_0x009d:
            r8.getClass()
            java.lang.String r0 = "musicId"
            gy3.C87412m.m108594g(r7, r0)
            ha0.l0 r0 = new ha0.l0
            r0.<init>(r7, r8)
            ha0.n0 r7 = new ha0.n0
            r7.<init>(r8)
            java.lang.String r2 = "220"
            d14.f r7 = ha0.C108238y0.m146562a(r2, r0, r7)
            la0.b$u r0 = new la0.b$u
            r0.<init>(r1, r8, r4)
            d14.q r2 = new d14.q
            r2.<init>(r7, r0)
            la0.b$v r7 = new la0.b$v
            r7.<init>(r1, r8, r4)
            d14.q r8 = new d14.q
            r8.<init>(r2, r7)
            r4 = r8
        L_0x00ca:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: la0.C109300b.mo86206G2(java.lang.String, wx3.d):java.lang.Object");
    }

    /* renamed from: H1 */
    public void mo86207H1(boolean z, boolean z2) {
        Log.m105924i("MaasMultiTemplate.MaasSdkUIC", "setMaasPreview() called with: maasPreview = " + z);
        this.f327205u = z;
        C53895h.m60466d(getMainScope(), (C66212f) null, (C53934p0) null, new C61249b0(z, this, (C15601d<? super C61249b0>) null), 3, (Object) null);
    }

    /* renamed from: I2 */
    public void mo86208I2() {
        this.f327193f = null;
    }

    /* renamed from: J0 */
    public void mo86209J0(boolean z, boolean z2) {
        Log.m105924i("MaasMultiTemplate.MaasSdkUIC", "setMovieOption() called with: musicMuted = " + z + ", originMuted = " + z2);
        C108183c0 c0Var = this.f327191d;
        if (c0Var != null) {
            Log.m105924i("MicroMsg.MaasMovieSessionManager", "setMovieOption() called with: musicMuted = " + z + ", originMuted = " + z2);
            c0Var.f323936c = c0Var.mo158613b(z, z2);
        }
    }

    /* renamed from: L0 */
    public void mo86210L0(C61242a.C61245c cVar) {
        C87412m.m108594g(cVar, "params");
        this.f327192e = cVar;
        if (C79758p.f233760a.mo109882e(C104160f.RepairerConfig_Maas_ShowAllTemplate_Int, -1) == 1) {
            boolean z = cVar.f174315b;
            boolean z2 = cVar.f174316c;
            int i = cVar.f174317d;
            boolean z3 = cVar.f174318e;
            List<String> list = cVar.f174319f;
            int i2 = cVar.f174320g;
            boolean z4 = cVar.f174321h;
            List<String> list2 = cVar.f174322i;
            boolean z5 = cVar.f174323j;
            C87412m.m108594g(list, "defaultTemplateIDs");
            this.f327192e = new C61242a.C61245c("alltemplaterecommend", z, z2, i, z3, list, i2, z4, list2, z5);
        }
    }

    /* renamed from: M */
    public LiveData mo86211M() {
        return this.f327194g;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0056, code lost:
        r9 = (r9 = r2.f323934a).getCurrentTemplateInfo();
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: N2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo86212N2(java.lang.String r8, wx3.C15601d<? super d14.C45252f<java.lang.Float>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof la0.C109300b.C109302b
            if (r0 == 0) goto L_0x0013
            r0 = r9
            la0.b$b r0 = (la0.C109300b.C109302b) r0
            int r1 = r0.f327220n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f327220n = r1
            goto L_0x0018
        L_0x0013:
            la0.b$b r0 = new la0.b$b
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f327218i
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f327220n
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0049
            if (r2 != r3) goto L_0x0041
            java.lang.Object r8 = r0.f327217h
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r1 = r0.f327216g
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r0.f327215f
            ha0.c0 r2 = (ha0.C108183c0) r2
            java.lang.Object r3 = r0.f327214e
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r0 = r0.f327213d
            la0.b r0 = (la0.C109300b) r0
            kotlin.ResultKt.throwOnFailure(r9)
            r5 = r1
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r3
            goto L_0x0099
        L_0x0041:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0049:
            kotlin.ResultKt.throwOnFailure(r9)
            ha0.c0 r2 = r7.f327191d
            if (r2 == 0) goto L_0x00d4
            if (r2 == 0) goto L_0x0061
            com.tencent.maas.instamovie.MJMovieSession r9 = r2.f323934a
            if (r9 == 0) goto L_0x0061
            com.tencent.maas.model.MJTemplateInfo r9 = r9.getCurrentTemplateInfo()
            if (r9 == 0) goto L_0x0061
            java.lang.String r9 = r9.getTemplateID()
            goto L_0x0062
        L_0x0061:
            r9 = r4
        L_0x0062:
            java.lang.String r5 = ""
            if (r9 != 0) goto L_0x0067
            r9 = r5
        L_0x0067:
            ha0.c0 r6 = r7.f327191d
            if (r6 == 0) goto L_0x007a
            com.tencent.maas.instamovie.MJMovieSession r6 = r6.f323934a
            if (r6 == 0) goto L_0x007a
            com.tencent.maas.model.MJMusicInfo r6 = r6.getCurrentMusicInfo()
            if (r6 == 0) goto L_0x007a
            java.lang.String r6 = r6.getMusicID()
            goto L_0x007b
        L_0x007a:
            r6 = r4
        L_0x007b:
            if (r6 != 0) goto L_0x007e
            goto L_0x007f
        L_0x007e:
            r5 = r6
        L_0x007f:
            boolean r6 = r2.mo158616e()
            if (r6 != 0) goto L_0x00a2
            r0.f327213d = r7
            r0.f327214e = r8
            r0.f327215f = r2
            r0.f327216g = r5
            r0.f327217h = r9
            r0.f327220n = r3
            java.lang.Object r0 = r2.mo158621k(r0)
            if (r0 != r1) goto L_0x0098
            return r1
        L_0x0098:
            r1 = r7
        L_0x0099:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00d4
            goto L_0x00a3
        L_0x00a2:
            r1 = r7
        L_0x00a3:
            la0.a$a r0 = r1.f327203s
            if (r0 == 0) goto L_0x00ce
            com.tencent.maas.instamovie.MJExportSettings r0 = r0.mo86233a()
            r2.getClass()
            java.lang.String r3 = "outPath"
            gy3.C87412m.m108594g(r8, r3)
            java.lang.String r3 = "settings"
            gy3.C87412m.m108594g(r0, r3)
            ha0.d0 r3 = new ha0.d0
            r3.<init>(r2, r8, r0, r4)
            d14.x0 r8 = new d14.x0
            r8.<init>(r3)
            la0.b$c r0 = new la0.b$c
            r0.<init>(r1, r9, r5, r4)
            d14.q r9 = new d14.q
            r9.<init>(r8, r0)
            r4 = r9
            goto L_0x00d4
        L_0x00ce:
            java.lang.String r8 = "movieSessionConfigProvider"
            gy3.C87412m.m108603p(r8)
            throw r4
        L_0x00d4:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: la0.C109300b.mo86212N2(java.lang.String, wx3.d):java.lang.Object");
    }

    /* renamed from: O1 */
    public void mo86213O1(Surface surface) {
        Log.m105924i("MaasMultiTemplate.MaasSdkUIC", "setRenderSurface: ");
        C108183c0 c0Var = this.f327191d;
        if (c0Var != null) {
            c0Var.f323934a.setSurface(surface);
        }
        this.f327208x = surface != null;
        if (surface != null) {
            C53895h.m60466d(getMainScope(), (C66212f) null, (C53934p0) null, new C61251c0(this, (C15601d<? super C61251c0>) null), 3, (Object) null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: Q2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo86214Q2(boolean r6, boolean r7, wx3.C15601d<? super rx3.C13598b0> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof la0.C109300b.C109304d0
            if (r0 == 0) goto L_0x0013
            r0 = r8
            la0.b$d0 r0 = (la0.C109300b.C109304d0) r0
            int r1 = r0.f327232g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f327232g = r1
            goto L_0x0018
        L_0x0013:
            la0.b$d0 r0 = new la0.b$d0
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f327230e
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f327232g
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0034
            if (r2 != r4) goto L_0x002c
            java.lang.Object r6 = r0.f327229d
            la0.b r6 = (la0.C109300b) r6
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x0065
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0034:
            kotlin.ResultKt.throwOnFailure(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r2 = "switchMovieOption() called with: musicMuted = "
            r8.append(r2)
            r8.append(r6)
            java.lang.String r2 = ", originMuted = "
            r8.append(r2)
            r8.append(r7)
            java.lang.String r8 = r8.toString()
            java.lang.String r2 = "MaasMultiTemplate.MaasSdkUIC"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r8)
            ha0.c0 r8 = r5.f327191d
            if (r8 == 0) goto L_0x006f
            r0.f327229d = r5
            r0.f327232g = r4
            java.lang.Object r8 = r8.mo158622l(r6, r7, r0)
            if (r8 != r1) goto L_0x0064
            return r1
        L_0x0064:
            r6 = r5
        L_0x0065:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r7 = r8.booleanValue()
            if (r7 != r4) goto L_0x0070
            r3 = 1
            goto L_0x0070
        L_0x006f:
            r6 = r5
        L_0x0070:
            if (r3 == 0) goto L_0x0075
            r6.mo160520j3()
        L_0x0075:
            rx3.b0 r6 = rx3.C13598b0.f38549a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: la0.C109300b.mo86214Q2(boolean, boolean, wx3.d):java.lang.Object");
    }

    /* renamed from: U0 */
    public MJMusicOptions mo86215U0() {
        C108183c0 c0Var = this.f327191d;
        if (c0Var != null) {
            return c0Var.f323934a.getCurrentMusicOptions();
        }
        return null;
    }

    /* renamed from: U2 */
    public LiveData<List<MJTemplateInfo>> mo86216U2() {
        return this.f327195h;
    }

    /* renamed from: Z0 */
    public C61242a.C61243b mo86217Z0() {
        return this.f327197j;
    }

    /* renamed from: b1 */
    public void mo86218b1(C61242a.C61246d dVar) {
        C87412m.m108594g(dVar, "callback");
        this.f327193f = dVar;
    }

    /* renamed from: c0 */
    public long mo86219c0() {
        MJMovieSession mJMovieSession;
        MJTime playbackDuration;
        C108183c0 c0Var = this.f327191d;
        if (!(c0Var == null || (mJMovieSession = c0Var.f323934a) == null || (playbackDuration = mJMovieSession.getPlaybackDuration()) == null)) {
            Double valueOf = Double.valueOf(playbackDuration.toMilliseconds());
            if (!(!Double.isNaN(valueOf.doubleValue()))) {
                valueOf = null;
            }
            if (valueOf != null) {
                return C60641c.m70922c(valueOf.doubleValue());
            }
        }
        return 0;
    }

    /* renamed from: d1 */
    public void mo86220d1(String str, String str2) {
        C87412m.m108594g(str, "templateId");
        Log.m105924i("MaasMultiTemplate.MaasSdkUIC", "set templateId: " + str + ", musicId: " + str2);
        this.f327198n = str;
        if (str2 == null) {
            str2 = "";
        }
        this.f327201q = str2;
    }

    /* renamed from: d2 */
    public void mo86221d2(boolean z) {
        this.f327199o = z;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x007f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* renamed from: f3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo160518f3(wx3.C15601d<? super rx3.C13598b0> r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            boolean r2 = r1 instanceof la0.C109300b.C109303d
            if (r2 == 0) goto L_0x0017
            r2 = r1
            la0.b$d r2 = (la0.C109300b.C109303d) r2
            int r3 = r2.f327228n
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f327228n = r3
            goto L_0x001c
        L_0x0017:
            la0.b$d r2 = new la0.b$d
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.f327226i
            xx3.a r3 = xx3.C15911a.COROUTINE_SUSPENDED
            int r4 = r2.f327228n
            r5 = 10
            r6 = 0
            r7 = 0
            r8 = 1
            if (r4 == 0) goto L_0x004c
            if (r4 != r8) goto L_0x0044
            java.lang.Object r4 = r2.f327225h
            java.util.Collection r4 = (java.util.Collection) r4
            java.lang.Object r9 = r2.f327224g
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r9 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem) r9
            java.lang.Object r10 = r2.f327223f
            java.util.Iterator r10 = (java.util.Iterator) r10
            java.lang.Object r11 = r2.f327222e
            java.util.Collection r11 = (java.util.Collection) r11
            java.lang.Object r12 = r2.f327221d
            la0.b r12 = (la0.C109300b) r12
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x00f2
        L_0x0044:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x004c:
            kotlin.ResultKt.throwOnFailure(r1)
            java.util.List<? extends com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r1 = r0.f327202r
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x005a:
            boolean r9 = r1.hasNext()
            if (r9 == 0) goto L_0x0076
            java.lang.Object r9 = r1.next()
            r10 = r9
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r10 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem) r10
            int r10 = r10.getType()
            if (r10 != r8) goto L_0x006f
            r10 = 1
            goto L_0x0070
        L_0x006f:
            r10 = 0
        L_0x0070:
            if (r10 == 0) goto L_0x005a
            r4.add(r9)
            goto L_0x005a
        L_0x0076:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x007f:
            boolean r9 = r4.hasNext()
            if (r9 == 0) goto L_0x00b2
            java.lang.Object r9 = r4.next()
            r10 = r9
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r10 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem) r10
            java.lang.String r11 = r10.f162755o
            java.lang.String r12 = "it.mimeType"
            gy3.C87412m.m108593f(r11, r12)
            java.lang.String r13 = "heic"
            boolean r11 = z04.C112550d0.m153801u(r11, r13, r7)
            if (r11 != 0) goto L_0x00ab
            java.lang.String r10 = r10.f162755o
            gy3.C87412m.m108593f(r10, r12)
            java.lang.String r11 = "heif"
            boolean r10 = z04.C112550d0.m153801u(r10, r11, r7)
            if (r10 == 0) goto L_0x00a9
            goto L_0x00ab
        L_0x00a9:
            r10 = 0
            goto L_0x00ac
        L_0x00ab:
            r10 = 1
        L_0x00ac:
            if (r10 == 0) goto L_0x007f
            r1.add(r9)
            goto L_0x007f
        L_0x00b2:
            java.util.ArrayList r4 = new java.util.ArrayList
            int r9 = sx3.C36907w.m41090l(r1, r5)
            r4.<init>(r9)
            java.util.Iterator r1 = r1.iterator()
            r12 = r0
            r10 = r1
        L_0x00c1:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x010f
            java.lang.Object r1 = r10.next()
            r9 = r1
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r9 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem) r9
            java.lang.String r1 = ha0.C8499c.f27523a
            java.lang.String r1 = r9.f162747d
            java.lang.String r11 = "item.originalPath"
            gy3.C87412m.m108593f(r1, r11)
            r2.f327221d = r12
            r2.f327222e = r4
            r2.f327223f = r10
            r2.f327224g = r9
            r2.f327225h = r4
            r2.f327228n = r8
            a14.h0 r11 = a14.C53872d1.f151119c
            ha0.b r13 = new ha0.b
            r13.<init>(r1, r6)
            java.lang.Object r1 = a14.C53895h.m60469g(r11, r13, r2)
            if (r1 != r3) goto L_0x00f1
            return r3
        L_0x00f1:
            r11 = r4
        L_0x00f2:
            r16 = r1
            java.lang.String r16 = (java.lang.String) r16
            if (r16 == 0) goto L_0x0109
            com.tencent.mm.plugin.gallery.model.GalleryItem$ImageMediaItem r1 = new com.tencent.mm.plugin.gallery.model.GalleryItem$ImageMediaItem
            long r14 = r9.f162751h
            java.lang.String r17 = r9.mo80159e()
            java.lang.String r9 = r9.f162755o
            r13 = r1
            r18 = r9
            r13.<init>(r14, r16, r17, r18)
            goto L_0x010a
        L_0x0109:
            r1 = r6
        L_0x010a:
            r4.add(r1)
            r4 = r11
            goto L_0x00c1
        L_0x010f:
            java.util.List r4 = (java.util.List) r4
            java.util.List r1 = sx3.C110818d0.m150912J(r4)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "transcoded size: "
            r2.append(r3)
            r3 = r1
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r3 = r3.size()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "MaasMultiTemplate.MaasSdkUIC"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            boolean r2 = r1.isEmpty()
            r2 = r2 ^ r8
            if (r2 == 0) goto L_0x017f
            java.util.List<? extends com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r2 = r12.f327202r
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = sx3.C36907w.m41090l(r2, r5)
            r3.<init>(r4)
            java.util.Iterator r2 = r2.iterator()
        L_0x0148:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x017d
            java.lang.Object r4 = r2.next()
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r4 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem) r4
            java.util.Iterator r5 = r1.iterator()
        L_0x0158:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L_0x0173
            java.lang.Object r9 = r5.next()
            r10 = r9
            com.tencent.mm.plugin.gallery.model.GalleryItem$ImageMediaItem r10 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$ImageMediaItem) r10
            long r10 = r10.f162751h
            long r13 = r4.f162751h
            int r15 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r15 != 0) goto L_0x016f
            r10 = 1
            goto L_0x0170
        L_0x016f:
            r10 = 0
        L_0x0170:
            if (r10 == 0) goto L_0x0158
            goto L_0x0174
        L_0x0173:
            r9 = r6
        L_0x0174:
            com.tencent.mm.plugin.gallery.model.GalleryItem$ImageMediaItem r9 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$ImageMediaItem) r9
            if (r9 == 0) goto L_0x0179
            r4 = r9
        L_0x0179:
            r3.add(r4)
            goto L_0x0148
        L_0x017d:
            r12.f327202r = r3
        L_0x017f:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: la0.C109300b.mo160518f3(wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: g3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo160519g3(wx3.C15601d<? super rx3.C13598b0> r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof la0.C109300b.C109307j
            if (r0 == 0) goto L_0x0013
            r0 = r14
            la0.b$j r0 = (la0.C109300b.C109307j) r0
            int r1 = r0.f327241i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f327241i = r1
            goto L_0x0018
        L_0x0013:
            la0.b$j r0 = new la0.b$j
            r0.<init>(r13, r14)
        L_0x0018:
            java.lang.Object r14 = r0.f327239g
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f327241i
            java.lang.String r3 = "MaasMultiTemplate.MaasSdkUIC"
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x004b
            if (r2 == r5) goto L_0x003a
            if (r2 != r4) goto L_0x0032
            java.lang.Object r0 = r0.f327236d
            ha0.c0 r0 = (ha0.C108183c0) r0
            kotlin.ResultKt.throwOnFailure(r14)
            goto L_0x0130
        L_0x0032:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x003a:
            java.lang.Object r2 = r0.f327238f
            ha0.c0 r2 = (ha0.C108183c0) r2
            java.lang.Object r5 = r0.f327237e
            ha0.c0 r5 = (ha0.C108183c0) r5
            java.lang.Object r7 = r0.f327236d
            la0.b r7 = (la0.C109300b) r7
            kotlin.ResultKt.throwOnFailure(r14)
            goto L_0x010a
        L_0x004b:
            kotlin.ResultKt.throwOnFailure(r14)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r2 = "performCreation: tmplId "
            r14.append(r2)
            java.lang.String r2 = r13.f327198n
            r14.append(r2)
            java.lang.String r2 = ", musicId: "
            r14.append(r2)
            java.lang.String r2 = r13.f327201q
            r14.append(r2)
            java.lang.String r2 = ", autoRecommend: "
            r14.append(r2)
            boolean r2 = r13.f327199o
            r14.append(r2)
            java.lang.String r14 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r14)
            ha0.c0 r2 = r13.f327191d
            if (r2 == 0) goto L_0x0130
            java.lang.String r14 = r13.f327198n
            int r14 = r14.length()
            r7 = 0
            if (r14 != 0) goto L_0x0087
            r14 = 1
            goto L_0x0088
        L_0x0087:
            r14 = 0
        L_0x0088:
            if (r14 == 0) goto L_0x00ce
            boolean r14 = r13.f327200p
            if (r14 == 0) goto L_0x00ab
            java.lang.String r14 = r13.f327201q
            int r14 = r14.length()
            if (r14 != 0) goto L_0x0097
            r7 = 1
        L_0x0097:
            if (r7 == 0) goto L_0x009b
            r14 = r6
            goto L_0x009d
        L_0x009b:
            java.lang.String r14 = r13.f327201q
        L_0x009d:
            java.util.List<? extends com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r7 = r13.f327202r
            boolean r8 = r13.f327199o
            la0.e r9 = new la0.e
            r9.<init>(r13, r2)
            d14.f r14 = r2.mo158619h(r7, r14, r8, r9)
            goto L_0x00e0
        L_0x00ab:
            java.util.List<? extends com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r14 = r13.f327202r
            java.lang.String r7 = "mediaInfo"
            gy3.C87412m.m108594g(r14, r7)
            ha0.s0 r7 = new ha0.s0
            r7.<init>(r14, r2)
            ha0.u0 r14 = new ha0.u0
            r14.<init>(r2)
            java.lang.String r8 = "201"
            d14.f r14 = ha0.C108238y0.m146562a(r8, r7, r14)
            la0.f r7 = new la0.f
            r7.<init>(r13, r2, r6)
            d14.q r8 = new d14.q
            r8.<init>(r14, r7)
            r14 = r8
            goto L_0x00e0
        L_0x00ce:
            java.lang.String r8 = r13.f327198n
            java.lang.String r9 = r13.f327201q
            java.util.List<? extends com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r10 = r13.f327202r
            boolean r11 = r13.f327199o
            la0.g r12 = new la0.g
            r12.<init>(r13, r2)
            r7 = r2
            d14.f r14 = r7.mo158618g(r8, r9, r10, r11, r12)
        L_0x00e0:
            la0.b$k r7 = new la0.b$k
            r7.<init>(r13, r6)
            d14.t r8 = new d14.t
            r8.<init>(r14, r7)
            la0.b$l r14 = new la0.b$l
            r14.<init>(r13, r2, r6)
            d14.q r7 = new d14.q
            r7.<init>(r8, r14)
            la0.b$m r14 = new la0.b$m
            r14.<init>(r13)
            r0.f327236d = r13
            r0.f327237e = r2
            r0.f327238f = r2
            r0.f327241i = r5
            java.lang.Object r14 = r7.mo31880a(r14, r0)
            if (r14 != r1) goto L_0x0108
            return r1
        L_0x0108:
            r7 = r13
            r5 = r2
        L_0x010a:
            java.lang.String r14 = "performCreation delay"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r14)
            la0.a$d r14 = r7.f327193f
            if (r14 == 0) goto L_0x0116
            r14.mo86238d0()
        L_0x0116:
            boolean r14 = r7.f327208x
            if (r14 == 0) goto L_0x0129
            r0.f327236d = r5
            r0.f327237e = r6
            r0.f327238f = r6
            r0.f327241i = r4
            java.lang.Object r14 = m148413i3(r7, r2, r0)
            if (r14 != r1) goto L_0x0130
            return r1
        L_0x0129:
            la0.b$n r14 = new la0.b$n
            r14.<init>(r7, r2, r6)
            r7.f327207w = r14
        L_0x0130:
            rx3.b0 r14 = rx3.C13598b0.f38549a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: la0.C109300b.mo160519g3(wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.f323934a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public double getVideoRatio() {
        /*
            r2 = this;
            ha0.c0 r0 = r2.f327191d
            if (r0 == 0) goto L_0x000d
            com.tencent.maas.instamovie.MJMovieSession r0 = r0.f323934a
            if (r0 == 0) goto L_0x000d
            java.lang.Double r0 = r0.getVideoAspectRatio()
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            if (r0 != 0) goto L_0x0013
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            goto L_0x0017
        L_0x0013:
            double r0 = r0.doubleValue()
        L_0x0017:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: la0.C109300b.getVideoRatio():double");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.f323934a;
     */
    /* renamed from: j3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo160520j3() {
        /*
            r3 = this;
            ha0.c0 r0 = r3.f327191d
            if (r0 == 0) goto L_0x000d
            com.tencent.maas.instamovie.MJMovieSession r0 = r0.f323934a
            if (r0 == 0) goto L_0x000d
            com.tencent.maas.instamovie.MJMovieOptions r0 = r0.getCurrentMovieOptions()
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            if (r0 != 0) goto L_0x0018
            java.lang.String r0 = "MaasMultiTemplate.MaasSdkUIC"
            java.lang.String r1 = "updateMovieOption: current movieOption is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r1)
            return
        L_0x0018:
            ha0.c0 r1 = r3.f327191d
            if (r1 == 0) goto L_0x003e
            com.tencent.maas.instamovie.MJMovieSession r1 = r1.f323934a
            if (r1 == 0) goto L_0x003e
            la0.b$a r1 = r3.f327197j
            androidx.lifecycle.z<java.lang.Boolean> r1 = r1.f174328e
            boolean r2 = r0.isBGMMuted()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r1.postValue(r2)
            la0.b$a r1 = r3.f327197j
            androidx.lifecycle.z<java.lang.Boolean> r1 = r1.f174329f
            boolean r0 = r0.isOSTMuted()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.postValue(r0)
        L_0x003e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: la0.C109300b.mo160520j3():void");
    }

    /* renamed from: l1 */
    public MJChannelEventConfig mo86223l1() {
        MJMovieSession mJMovieSession;
        MJTemplateInfo currentTemplateInfo;
        C108183c0 c0Var = this.f327191d;
        if (c0Var == null || (mJMovieSession = c0Var.f323934a) == null || (currentTemplateInfo = mJMovieSession.getCurrentTemplateInfo()) == null) {
            return null;
        }
        return currentTemplateInfo.getChannelEventConfig();
    }

    public void notifySurfaceChanged(int i, int i2, int i3) {
        C108183c0 c0Var;
        Log.m105924i("MaasMultiTemplate.MaasSdkUIC", "notifySurfaceChanged() called with: format = " + i + ", width = " + i2 + ", height = " + i3);
        if (this.f327208x && (c0Var = this.f327191d) != null) {
            c0Var.f323934a.notifySurfaceChanged(i, i2, i3);
        }
    }

    public void onBeforeFinish(Intent intent) {
        MJAnalyticsS12.MJAnalyticsMovieSession d;
        super.onBeforeFinish(intent);
        Log.m105924i("MaasMultiTemplate.MaasSdkUIC", "release onBeforeFinish");
        C108183c0 c0Var = this.f327191d;
        if (!(c0Var == null || (d = c0Var.mo158615d()) == null)) {
            C24789f.f70694a.mo51771c(d);
        }
        C108183c0 c0Var2 = this.f327191d;
        if (c0Var2 != null) {
            c0Var2.mo158617f();
        }
        this.f327191d = null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int intExtra = getIntent().getIntExtra("key_maas_entrance", 0);
        int i = 101;
        int i2 = 2;
        if (intExtra == 1 || intExtra == 2) {
            i = 1;
        } else if (intExtra == 3) {
            i = 3;
        } else if (intExtra == 4 || intExtra == 5) {
            i = 4;
        } else if (intExtra == 7) {
            i = 5;
        } else if (intExtra == 100) {
            i = 100;
        } else if (intExtra != 101) {
            i = 200;
        }
        Log.m105924i("MicroMsg.MaasMovieSessionManager", "setReportScene: " + i + ", field: " + C60781a.f173119b);
        C60781a.f173119b = i;
        C24789f fVar = C24789f.f70694a;
        if (C60781a.f173119b >= 100) {
            i2 = 1;
        }
        Log.m105924i("MicroMsg.Maas.MaasReport25621", "start " + i2);
        C24789f.f70696c = true;
        ((ArrayList) C24789f.f70697d).clear();
        ((ArrayList) C24789f.f70699f).clear();
        C24789f.f70698e = C64186f0.f181907d;
        MaasRecommendReportStruct maasRecommendReportStruct = new MaasRecommendReportStruct();
        maasRecommendReportStruct.f69523d = System.currentTimeMillis();
        maasRecommendReportStruct.f69525f = i2;
        C24789f.f70695b = maasRecommendReportStruct;
        C60784e eVar = C60784e.f173126a;
        C60784e.f173128c.f156490q = getIntent().getIntExtra("key_maas_entrance", 0);
        C53895h.m60466d(getMainScope(), (C66212f) null, (C53934p0) null, new C109305e(this, (C15601d<? super C109305e>) null), 3, (Object) null);
    }

    public void onDestroy() {
        MJAnalyticsS12.MJAnalyticsMovieSession d;
        MJMovieSession mJMovieSession;
        super.onDestroy();
        C108183c0 c0Var = this.f327191d;
        if (!(c0Var == null || (mJMovieSession = c0Var.f323934a) == null)) {
            mJMovieSession.setOnPlaybackMediaTimeDidChange((MJMovieSession.OnMediaTimeChange) null);
        }
        C108183c0 c0Var2 = this.f327191d;
        if (!(c0Var2 == null || (d = c0Var2.mo158615d()) == null)) {
            C24789f.f70694a.mo51771c(d);
        }
        C108183c0 c0Var3 = this.f327191d;
        if (c0Var3 != null) {
            c0Var3.mo158617f();
        }
        this.f327191d = null;
        Log.m105924i("MicroMsg.MaasMovieSessionManager", "setReportScene: " + 0 + ", field: " + C60781a.f173119b);
        C60781a.f173119b = 0;
    }

    public void onPause() {
        super.onPause();
        Log.m105924i("MaasMultiTemplate.MaasSdkUIC", "onPause: ");
        if (!this.f327205u) {
            Log.m105924i("MaasMultiTemplate.MaasSdkUIC", "onPause: cancel pause, maasPreview is " + this.f327205u);
            return;
        }
        C53895h.m60466d(getMainScope(), (C66212f) null, (C53934p0) null, new C61252f(this, (C15601d<? super C61252f>) null), 3, (Object) null);
    }

    public void onResume() {
        super.onResume();
        Log.m105924i("MaasMultiTemplate.MaasSdkUIC", "onResume: hasRenderSurface " + this.f327208x);
        if (!this.f327205u) {
            Log.m105924i("MaasMultiTemplate.MaasSdkUIC", "onResume: cancel resume, maasPreview is " + this.f327205u);
        } else if (this.f327208x) {
            C53895h.m60466d(getMainScope(), (C66212f) null, (C53934p0) null, new C61253h(this, (C15601d<? super C61253h>) null), 3, (Object) null);
        } else {
            Log.m105924i("MaasMultiTemplate.MaasSdkUIC", "onResume: delay");
            this.f327207w = new C61254i(this, (C15601d<? super C61254i>) null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: p0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo86225p0(wx3.C15601d<? super d14.C45252f<java.lang.Float>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof la0.C109300b.C109313p
            if (r0 == 0) goto L_0x0013
            r0 = r6
            la0.b$p r0 = (la0.C109300b.C109313p) r0
            int r1 = r0.f327257h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f327257h = r1
            goto L_0x0018
        L_0x0013:
            la0.b$p r0 = new la0.b$p
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f327255f
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f327257h
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            java.lang.Object r1 = r0.f327254e
            ha0.c0 r1 = (ha0.C108183c0) r1
            java.lang.Object r0 = r0.f327253d
            la0.b r0 = (la0.C109300b) r0
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x0055
        L_0x0030:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0038:
            kotlin.ResultKt.throwOnFailure(r6)
            ha0.c0 r6 = r5.f327191d
            if (r6 == 0) goto L_0x008f
            boolean r2 = r6.mo158616e()
            if (r2 != 0) goto L_0x005f
            r0.f327253d = r5
            r0.f327254e = r6
            r0.f327257h = r3
            java.lang.Object r0 = r6.mo158621k(r0)
            if (r0 != r1) goto L_0x0052
            return r1
        L_0x0052:
            r1 = r6
            r6 = r0
            r0 = r5
        L_0x0055:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x008f
            r6 = r1
            goto L_0x0060
        L_0x005f:
            r0 = r5
        L_0x0060:
            boolean r1 = r0.f327209y
            if (r1 == 0) goto L_0x0067
            java.lang.String r1 = r0.f327201q
            goto L_0x0068
        L_0x0067:
            r1 = r4
        L_0x0068:
            r6.getClass()
            ha0.i0 r2 = new ha0.i0
            r2.<init>(r6, r1)
            ha0.k0 r1 = new ha0.k0
            r1.<init>(r6)
            java.lang.String r3 = "222"
            d14.f r1 = ha0.C108238y0.m146562a(r3, r2, r1)
            la0.b$q r2 = new la0.b$q
            r2.<init>(r0, r6, r4)
            d14.q r3 = new d14.q
            r3.<init>(r1, r2)
            la0.b$r r1 = new la0.b$r
            r1.<init>(r0, r6, r4)
            d14.q r4 = new d14.q
            r4.<init>(r3, r1)
        L_0x008f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: la0.C109300b.mo86225p0(wx3.d):java.lang.Object");
    }

    /* renamed from: s0 */
    public void mo86226s0(boolean z) {
        this.f327200p = z;
    }

    public void setMediaList(List<? extends GalleryItem$MediaItem> list) {
        C87412m.m108594g(list, "mediaList");
        this.f327202r = list;
    }

    /* renamed from: y2 */
    public void mo86228y2(boolean z) {
        Log.m105924i("MaasMultiTemplate.MaasSdkUIC", "setSingleMusicMode: " + z);
        this.f327209y = z;
    }
}
