package xk1;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import a14.C53973z1;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C54219z;
import bl3.C39818r;
import c30.C104289g;
import cj1.C54768h6;
import cl1.C0690t1;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.FinderGamePostEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderGameLiveBaseUI;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderGameLivePostUI;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomControllerStore;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.plugin.finder.live.viewmodel.data.business.LiveAnchorSlice;
import com.tencent.p014mm.plugin.finder.live.widget.FinderLiveTaskBannerView;
import com.tencent.p014mm.plugin.finder.utils.FinderGameEventListener;
import com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager;
import com.tencent.p014mm.protocal.protobuf.FinderMedia;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import d14.C58052j1;
import d14.C58087u0;
import d60.C58124b;
import di3.C86312j;
import dj1.C45379o0;
import eb0.C31543z5;
import er1.C58704c5;
import er1.C58713e5;
import er1.C58728f5;
import er1.C58739j4;
import er1.C58777u0;
import er1.C58782w0;
import er1.C7777a0;
import er1.C7813i5;
import f40.C86709a0;
import fe1.C58961d;
import fe1.C58969q;
import fj1.C45795b;
import fy3.C32226l;
import fy3.C32227p;
import gg1.C32444a;
import gy3.C8477a0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import i50.C60251a;
import il1.C46264l;
import il1.C60432i;
import il1.C60440j;
import il1.C60444k;
import il1.C60511s4;
import il1.C60523t4;
import j50.C60735a;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CancellationException;
import je1.C60808p;
import kk1.C46728a;
import kotlin.ResultKt;
import nj3.C76879j;
import nj3.C76912y0;
import nr3.C89059e;
import o40.C61926c;
import o40.C61937h;
import ok1.C62042e;
import p1081gi.C98121d;
import p140cw.C7138g;
import p599lr.C61381b;
import p763ym.C79138l;
import pe3.C89349b;
import qg1.C62616r;
import qj1.C62861l1;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C110818d0;
import te3.C48899bs1;
import te3.C49430fj0;
import te3.C49712hj1;
import te3.C50169kr1;
import te3.C50868ps1;
import te3.C51006qs1;
import te3.C51560uk2;
import te3.C51660v81;
import te3.C52312zv0;
import te3.C64472jk0;
import te3.C64640px0;
import te3.C64830xi0;
import te3.cg4;
import tf0.C13883o1;
import tf0.C64916p1;
import u60.C65220d;
import u60.C65231j;
import u60.C65234n;
import up1.C37521f;
import uq1.C65458r;
import wg1.C65954a0;
import wg1.C66089v;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;
import zc1.C66785b;

/* renamed from: xk1.w */
public final class C66355w extends UIComponent {

    /* renamed from: A */
    public boolean f191014A;

    /* renamed from: B */
    public int f191015B;

    /* renamed from: C */
    public String f191016C = "";

    /* renamed from: D */
    public String f191017D = "";

    /* renamed from: E */
    public boolean f191018E;

    /* renamed from: F */
    public MMEditText f191019F;

    /* renamed from: G */
    public boolean f191020G;

    /* renamed from: H */
    public C7813i5 f191021H;

    /* renamed from: I */
    public C60735a f191022I;

    /* renamed from: J */
    public boolean f191023J;

    /* renamed from: K */
    public boolean f191024K;

    /* renamed from: d */
    public final String f191025d = "Finder.FinderGameLivePostUIC";

    /* renamed from: e */
    public View f191026e;

    /* renamed from: f */
    public TextView f191027f;

    /* renamed from: g */
    public FinderLiveTaskBannerView f191028g;

    /* renamed from: h */
    public ImageView f191029h;

    /* renamed from: i */
    public View f191030i;

    /* renamed from: j */
    public View f191031j;

    /* renamed from: n */
    public C60432i f191032n;

    /* renamed from: o */
    public C46264l f191033o;

    /* renamed from: p */
    public C60523t4 f191034p;

    /* renamed from: q */
    public C60511s4 f191035q;

    /* renamed from: r */
    public C60444k f191036r;

    /* renamed from: s */
    public String f191037s = "";

    /* renamed from: t */
    public String f191038t = "";

    /* renamed from: u */
    public String f191039u = "";

    /* renamed from: v */
    public int f191040v;

    /* renamed from: w */
    public C51006qs1 f191041w;

    /* renamed from: x */
    public C50169kr1 f191042x;

    /* renamed from: y */
    public cg4 f191043y;

    /* renamed from: z */
    public int f191044z;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.viewmodel.FinderGameLivePostUIC$continuePost$2", mo125469f = "FinderGameLivePostUIC.kt", mo125470l = {515}, mo125471m = "invokeSuspend")
    /* renamed from: xk1.w$a */
    public static final class C66356a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f191045d;

        /* renamed from: e */
        public final /* synthetic */ C45795b f191046e;

        /* renamed from: f */
        public final /* synthetic */ C66355w f191047f;

        /* renamed from: g */
        public final /* synthetic */ FinderMedia f191048g;

        /* renamed from: xk1.w$a$a */
        public static final class C66357a extends C87413o implements C32226l<byte[], C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C45795b f191049d;

            /* renamed from: e */
            public final /* synthetic */ C66355w f191050e;

            /* renamed from: f */
            public final /* synthetic */ FinderMedia f191051f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C66357a(C45795b bVar, C66355w wVar, FinderMedia finderMedia) {
                super(1);
                this.f191049d = bVar;
                this.f191050e = wVar;
                this.f191051f = finderMedia;
            }

            public Object invoke(Object obj) {
                byte[] bArr = (byte[]) obj;
                Class cls = C0690t1.class;
                Class cls2 = C54991o.class;
                int i = ((C0690t1) this.f191049d.mo71262a(cls)).mo653f3() ? 0 : ((C0690t1) this.f191049d.mo71262a(cls)).f1629i;
                LinkedList linkedList = new LinkedList();
                if (C61926c.m72696u(((C0690t1) this.f191049d.mo71262a(cls)).f1629i, 1)) {
                    linkedList.addAll(C62042e.f176370a.mo87059Z(((C0690t1) this.f191049d.mo71262a(cls)).f1628h));
                }
                LinkedList linkedList2 = new LinkedList();
                if (C61926c.m72696u(i, 4)) {
                    linkedList2.addAll(((C0690t1) this.f191049d.mo71262a(cls)).f1632o);
                }
                LinkedList linkedList3 = new LinkedList();
                if (C61926c.m72696u(i, 2)) {
                    linkedList3.addAll(((C0690t1) this.f191049d.mo71262a(cls)).f1631n);
                }
                ((C54991o) this.f191049d.mo71262a(cls2)).f154354q &= -257;
                C66355w wVar = this.f191050e;
                C45795b bVar = this.f191049d;
                wVar.getClass();
                String str = ((C54991o) bVar.mo71262a(cls2)).f154225L3;
                Log.m105924i(wVar.f191025d, "fromChatRoomId:" + str + ", visibilityRoomList:" + C110818d0.m150921S(linkedList3, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null));
                int i2 = ((str == null || str.length() == 0) || !linkedList3.contains(str)) ? 0 : 1;
                FinderMedia finderMedia = this.f191051f;
                MMEditText mMEditText = this.f191050e.f191019F;
                if (mMEditText != null) {
                    String obj2 = mMEditText.getText().toString();
                    C66355w wVar2 = this.f191050e;
                    String str2 = wVar2.f191038t;
                    String str3 = wVar2.f191039u;
                    int i3 = wVar2.f191040v;
                    C50169kr1 kr12 = wVar2.f191042x;
                    int i4 = kr12 != null ? kr12.f137013s : 0;
                    FinderLiveService.f159376d.getClass();
                    C45795b bVar2 = FinderLiveService.f159348A;
                    if (bVar2 == null) {
                        bVar2 = new C45795b((String) null, 1, (C8480h) null);
                    }
                    List<C51660v81> list = ((C54991o) bVar2.mo71262a(cls2)).f154390y2;
                    C60808p pVar = r5;
                    C60808p pVar2 = new C60808p(finderMedia, obj2, str2, str3, i3, i4, (C50868ps1) null, list != null ? (C51660v81) C110818d0.m150916N(list) : null, ((C54991o) this.f191049d.mo71262a(cls2)).f154376v2.f513a, Integer.valueOf(((C54991o) this.f191049d.mo71262a(cls2)).f154354q), linkedList2, linkedList3, Integer.valueOf(i), linkedList, Integer.valueOf(((C54991o) this.f191049d.mo71262a(cls2)).f154251S), ((C54991o) this.f191049d.mo71262a(cls2)).f154209H3, (byte[]) ((C13604l) ((C58052j1) ((C54991o) this.f191049d.mo71262a(cls2)).f154213I3).getValue()).f38556e, i2, ((C0690t1) this.f191049d.mo71262a(cls)).f1630j);
                    C66355w wVar3 = this.f191050e;
                    C64830xi0 xi02 = pVar.f173195t;
                    cg4 cg4 = wVar3.f191043y;
                    xi02.f186303B = cg4 != null ? cg4.f182478f : 0;
                    xi02.f186304C = cg4 != null ? cg4.f182479g : null;
                    pVar.mo85582k(wVar3.getActivity(), this.f191050e.getResources().getString(C0966R.string.ett), 500);
                    C89059e i5 = pVar.mo9225i();
                    AppCompatActivity activity = this.f191050e.getActivity();
                    C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.ui.FinderGameLivePostUI");
                    i5.mo11397F((FinderGameLivePostUI) activity);
                    i5.mo123420E(new C53371v(this.f191050e, this.f191049d));
                    return C13598b0.f38549a;
                }
                C87412m.m108603p("descTv");
                throw null;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66356a(C45795b bVar, C66355w wVar, FinderMedia finderMedia, C15601d<? super C66356a> dVar) {
            super(2, dVar);
            this.f191046e = bVar;
            this.f191047f = wVar;
            this.f191048g = finderMedia;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C66356a(this.f191046e, this.f191047f, this.f191048g, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C66356a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f191045d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C62042e eVar = C62042e.f176370a;
                C45795b bVar = this.f191046e;
                C66357a aVar2 = new C66357a(bVar, this.f191047f, this.f191048g);
                this.f191045d = 1;
                if (eVar.mo87107p1(bVar, aVar2, this) == aVar) {
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

    /* renamed from: xk1.w$b */
    public static final class C66358b extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C66355w f191052d;

        /* renamed from: e */
        public final /* synthetic */ C49430fj0 f191053e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66358b(C66355w wVar, C49430fj0 fj02) {
            super(1);
            this.f191052d = wVar;
            this.f191053e = fj02;
        }

        public Object invoke(Object obj) {
            if (((Boolean) obj).booleanValue()) {
                C45795b bVar = ((C66331m) C39818r.f106831a.mo62444c(this.f191052d.getActivity()).mo75002a(C66331m.class)).f190942e;
                if (this.f191053e.f133530d == 1) {
                    ((C54991o) bVar.mo71262a(C54991o.class)).f154209H3 = true;
                }
                this.f191052d.mo90455G3();
            } else {
                View view = ((C66297d2) C39818r.f106831a.mo62443b(this.f191052d.getContext()).mo75002a(C66297d2.class)).f190861t;
                if (view != null) {
                    view.setEnabled(true);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: xk1.w$c */
    public static final class C66359c implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C66355w f191054d;

        /* renamed from: e */
        public final /* synthetic */ C8477a0 f191055e;

        /* renamed from: f */
        public final /* synthetic */ C50169kr1 f191056f;

        public C66359c(C66355w wVar, C8477a0 a0Var, C50169kr1 kr12) {
            this.f191054d = wVar;
            this.f191055e = a0Var;
            this.f191056f = kr12;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            String str = this.f191054d.f191025d;
            Log.m105924i(str, "dialog ok isInstall:" + this.f191055e.f27482d);
            C58782w0 w0Var = C58782w0.f168290a;
            Activity context = this.f191054d.getContext();
            String str2 = this.f191056f.f137004g;
            if (str2 == null) {
                str2 = "";
            }
            w0Var.mo83844c(context, str2);
            C58777u0 u0Var = C58777u0.f168283a;
            if (C58777u0.f168284b == 18) {
                u0Var.mo83833b(8);
            }
        }
    }

    /* renamed from: xk1.w$d */
    public static final class C66360d implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C66355w f191057d;

        public C66360d(C66355w wVar) {
            this.f191057d = wVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            Log.m105924i(this.f191057d.f191025d, "dialog cancel");
            dialogInterface.dismiss();
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.viewmodel.FinderGameLivePostUIC$startPost$3", mo125469f = "FinderGameLivePostUIC.kt", mo125470l = {445, 446}, mo125471m = "invokeSuspend")
    /* renamed from: xk1.w$e */
    public static final class C66361e extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f191058d;

        /* renamed from: e */
        public /* synthetic */ Object f191059e;

        /* renamed from: f */
        public final /* synthetic */ C66355w f191060f;

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.viewmodel.FinderGameLivePostUIC$startPost$3$avatarByteArrayResult$1", mo125469f = "FinderGameLivePostUIC.kt", mo125470l = {446}, mo125471m = "invokeSuspend")
        /* renamed from: xk1.w$e$a */
        public static final class C66362a extends C91594j implements C32227p<C0000n0, C15601d<? super byte[]>, Object> {

            /* renamed from: d */
            public int f191061d;

            public C66362a(C15601d<? super C66362a> dVar) {
                super(2, dVar);
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C66362a(dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                C0000n0 n0Var = (C0000n0) obj;
                return new C66362a((C15601d) obj2).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f191061d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    C62042e eVar = C62042e.f176370a;
                    C58969q b = C58961d.f168673a.mo84155b(C66785b.f191882e.mo90662O5());
                    String str = b != null ? b.field_avatarUrl : null;
                    if (str == null) {
                        str = "";
                    }
                    this.f191061d = 1;
                    obj = eVar.mo87014J(str, (String) null, this);
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

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.viewmodel.FinderGameLivePostUIC$startPost$3$coverByteArrayResult$1", mo125469f = "FinderGameLivePostUIC.kt", mo125470l = {445}, mo125471m = "invokeSuspend")
        /* renamed from: xk1.w$e$b */
        public static final class C66363b extends C91594j implements C32227p<C0000n0, C15601d<? super byte[]>, Object> {

            /* renamed from: d */
            public int f191062d;

            /* renamed from: e */
            public final /* synthetic */ C66355w f191063e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C66363b(C66355w wVar, C15601d<? super C66363b> dVar) {
                super(2, dVar);
                this.f191063e = wVar;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C66363b(this.f191063e, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C66363b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f191062d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    C62042e eVar = C62042e.f176370a;
                    String str = this.f191063e.mo90460i3().f172313j;
                    String str2 = this.f191063e.mo90460i3().f172312i;
                    this.f191062d = 1;
                    obj = eVar.mo87014J(str, str2, this);
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

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66361e(C66355w wVar, C15601d<? super C66361e> dVar) {
            super(2, dVar);
            this.f191060f = wVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C66361e eVar = new C66361e(this.f191060f, dVar);
            eVar.f191059e = obj;
            return eVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C66361e) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v11, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: a14.n0} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0081  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0097  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x00ae  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x00b3  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                int r1 = r11.f191058d
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L_0x0025
                if (r1 == r4) goto L_0x001d
                if (r1 != r3) goto L_0x0015
                java.lang.Object r0 = r11.f191059e
                byte[] r0 = (byte[]) r0
                kotlin.ResultKt.throwOnFailure(r12)
                goto L_0x0069
            L_0x0015:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L_0x001d:
                java.lang.Object r1 = r11.f191059e
                a14.n0 r1 = (a14.C0000n0) r1
                kotlin.ResultKt.throwOnFailure(r12)
                goto L_0x004a
            L_0x0025:
                kotlin.ResultKt.throwOnFailure(r12)
                java.lang.Object r12 = r11.f191059e
                r1 = r12
                a14.n0 r1 = (a14.C0000n0) r1
                r6 = 0
                r7 = 0
                xk1.w$e$b r8 = new xk1.w$e$b
                xk1.w r12 = r11.f191060f
                r8.<init>(r12, r2)
                r9 = 3
                r10 = 0
                r5 = r1
                a14.u0 r12 = a14.C53895h.m60464b(r5, r6, r7, r8, r9, r10)
                r11.f191059e = r1
                r11.f191058d = r4
                a14.v0 r12 = (a14.C53957v0) r12
                java.lang.Object r12 = r12.mo74549z(r11)
                if (r12 != r0) goto L_0x004a
                return r0
            L_0x004a:
                r5 = r1
                byte[] r12 = (byte[]) r12
                r6 = 0
                r7 = 0
                xk1.w$e$a r8 = new xk1.w$e$a
                r8.<init>(r2)
                r9 = 3
                r10 = 0
                a14.u0 r1 = a14.C53895h.m60464b(r5, r6, r7, r8, r9, r10)
                r11.f191059e = r12
                r11.f191058d = r3
                a14.v0 r1 = (a14.C53957v0) r1
                java.lang.Object r1 = r1.mo74549z(r11)
                if (r1 != r0) goto L_0x0067
                return r0
            L_0x0067:
                r0 = r12
                r12 = r1
            L_0x0069:
                byte[] r12 = (byte[]) r12
                te3.xs2 r1 = new te3.xs2
                r1.<init>()
                java.util.LinkedList r5 = new java.util.LinkedList
                r5.<init>()
                r1.f186383d = r5
                te3.qd3 r6 = new te3.qd3
                r6.<init>()
                r6.f184998d = r4
                r4 = 0
                if (r0 == 0) goto L_0x0089
                pe3.b r7 = new pe3.b
                int r8 = r0.length
                r7.<init>(r0, r4, r8)
                r6.f184999e = r7
            L_0x0089:
                r5.add(r6)
                java.util.LinkedList<te3.qd3> r0 = r1.f186383d
                te3.qd3 r5 = new te3.qd3
                r5.<init>()
                r5.f184998d = r3
                if (r12 == 0) goto L_0x009f
                pe3.b r3 = new pe3.b
                int r6 = r12.length
                r3.<init>(r12, r4, r6)
                r5.f184999e = r3
            L_0x009f:
                r0.add(r5)
                com.tencent.mm.plugin.finder.live.model.FinderLiveService r12 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
                java.lang.Class<cl1.o> r0 = cl1.C54991o.class
                androidx.lifecycle.i0 r12 = r12.mo77630e(r0)
                cl1.o r12 = (cl1.C54991o) r12
                if (r12 == 0) goto L_0x00b0
                d14.u0<rx3.l<java.lang.Boolean, byte[]>> r2 = r12.f154213I3
            L_0x00b0:
                if (r2 != 0) goto L_0x00b3
                goto L_0x00c3
            L_0x00b3:
                rx3.l r12 = new rx3.l
                java.lang.Boolean r0 = java.lang.Boolean.TRUE
                byte[] r1 = r1.toByteArray()
                r12.<init>(r0, r1)
                d14.j1 r2 = (d14.C58052j1) r2
                r2.setValue(r12)
            L_0x00c3:
                rx3.b0 r12 = rx3.C13598b0.f38549a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: xk1.C66355w.C66361e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: xk1.w$f */
    public static final class C66364f implements C65231j<C65220d> {

        /* renamed from: a */
        public final /* synthetic */ C66355w f191064a;

        public C66364f(C66355w wVar) {
            this.f191064a = wVar;
        }

        /* renamed from: a */
        public void mo539a(C65220d dVar, C65234n nVar) {
            Point point;
            String str;
            C87412m.m108594g(dVar, "task");
            C87412m.m108594g(nVar, "status");
            C65458r rVar = (C65458r) dVar;
            if (nVar == C65234n.OK && !Util.isNullOrNil(rVar.f188352h)) {
                FinderMedia finderMedia = new FinderMedia();
                finderMedia.url = rVar.f188352h;
                finderMedia.mediaType = 9;
                finderMedia.thumbUrl = rVar.f188353i;
                finderMedia.videoDuration = 0;
                if (!Util.isNullOrNil(this.f191064a.mo90460i3().f172312i)) {
                    point = C58739j4.f168176a.mo83725x(this.f191064a.mo90460i3().f172312i);
                } else {
                    this.f191064a.mo90460i3();
                    point = new Point(300, 400);
                }
                finderMedia.width = (float) point.x;
                finderMedia.height = (float) point.y;
                C98121d dVar2 = rVar.f188354j;
                if (dVar2 == null || (str = dVar2.field_filemd5) == null) {
                    str = "";
                }
                finderMedia.md5sum = str;
                finderMedia.coverUrl = rVar.f188352h;
                this.f191064a.mo90459g3(finderMedia);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66355w(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: F3 */
    public final void mo90454F3(LiveAnchorSlice liveAnchorSlice) {
        int intExtra = getIntent().getIntExtra("KEY_PARAMS_ANCHOR_LIVE_PATH_ENTRANCE_TYPE", 0);
        if (liveAnchorSlice != null) {
            liveAnchorSlice.f160032h = intExtra;
        }
        long longExtra = getIntent().getLongExtra("KEY_PARAMS_ANCHOR_LIVE_PATH_ENTRANCE_ID", 0);
        if (liveAnchorSlice != null) {
            liveAnchorSlice.f160033i = longExtra;
        }
    }

    /* renamed from: G3 */
    public final void mo90455G3() {
        C50169kr1 kr12;
        Class cls = C66331m.class;
        Log.m105924i(this.f191025d, "startPost");
        if (C58739j4.f168176a.mo83683L()) {
            Log.m105924i(this.f191025d, "startPost: click too fast!");
            return;
        }
        boolean z = false;
        if (!(mo90461j3().f172506d == 1)) {
            Log.m105924i(this.f191025d, "startPost: license not ready!");
            C60511s4 s4Var = this.f191035q;
            if (s4Var != null) {
                s4Var.f172475b.setVisibility(0);
                s4Var.f172477d.mo78804d();
                return;
            }
            C87412m.m108603p("licensePanelWidget");
            throw null;
        }
        if (!mo90464m3() && (kr12 = this.f191042x) != null) {
            String str = kr12.f137005h;
            if (!(str == null || str.length() == 0) && this.f191040v == 0) {
                C8477a0 a0Var = new C8477a0();
                C58782w0 w0Var = C58782w0.f168290a;
                Activity context = getContext();
                String str2 = kr12.f137005h;
                if (str2 == null) {
                    str2 = "";
                }
                a0Var.f27482d = w0Var.mo83843b(context, str2);
                C37521f.f99374d.getClass();
                if (C37521f.f99358b1.mo60266n().intValue() == 3) {
                    a0Var.f27482d = false;
                }
                String str3 = this.f191025d;
                Log.m105924i(str3, "game installed: " + a0Var.f27482d + ", packagename:" + kr12.f137005h);
                if (!a0Var.f27482d) {
                    C58777u0 u0Var = C58777u0.f168283a;
                    if (C58777u0.f168284b == 18) {
                        u0Var.mo83833b(7);
                    }
                    C76879j.m92707A(getContext(), getContext().getString(C0966R.string.eni, new Object[]{kr12.f137002e}), "", getContext().getString(C0966R.string.a18), getContext().getString(C0966R.string.f7926wf), new C66359c(this, a0Var, kr12), new C66360d(this));
                    return;
                }
            }
        }
        C39818r rVar = C39818r.f106831a;
        ((C66331m) rVar.mo62444c(getActivity()).mo75002a(cls)).getClass();
        mo90466o3();
        C53895h.m60464b(((C66331m) rVar.mo62443b(getContext()).mo75002a(cls)).mo90443d3().checkActiveAndGet(), C53872d1.f151119c, (C53934p0) null, new C66361e(this, (C15601d<? super C66361e>) null), 2, (Object) null);
        C60432i i3 = mo90460i3();
        if (!Util.isNullOrNil(i3.f172312i) && C86013q1.m106450k(i3.f172312i)) {
            z = true;
        }
        if (z) {
            String str4 = this.f191025d;
            Log.m105924i(str4, "choose live cover:" + mo90460i3().f172312i);
            ((C61381b) C86312j.m106911c(C61381b.class)).mo78545UQ().mo12411d(mo90460i3().f172312i, C66785b.f191882e.mo90662O5(), new C66364f(this));
            return;
        }
        String str5 = this.f191025d;
        Log.m105924i(str5, "choose default cover:" + mo90460i3().f172313j);
        mo90459g3(mo90460i3().f172314n);
    }

    /* renamed from: d3 */
    public final void mo90456d3(FinderMedia finderMedia, boolean z) {
        Class cls = C66331m.class;
        Class cls2 = C54991o.class;
        if (mo90464m3()) {
            FinderLiveService finderLiveService = FinderLiveService.f159376d;
            finderLiveService.getClass();
            C45795b bVar = FinderLiveService.f159348A;
            if (bVar == null) {
                bVar = ((C66331m) C39818r.f106831a.mo62444c(getActivity()).mo75002a(cls)).f190942e;
            }
            C45795b bVar2 = bVar;
            mo90454F3((LiveAnchorSlice) bVar2.mo71262a(LiveAnchorSlice.class));
            if (z) {
                FinderObjectDesc finderObjectDesc = new FinderObjectDesc();
                String stringExtra = getIntent().getStringExtra("DESC");
                if (stringExtra == null) {
                    stringExtra = "";
                }
                finderObjectDesc.description = stringExtra;
                finderObjectDesc.mediaType = 9;
                finderObjectDesc.extReading = new C64472jk0();
                C64640px0 px02 = new C64640px0();
                StringBuilder sb = new StringBuilder();
                String str = null;
                sb.append(Util.nullAsNil(finderMedia != null ? finderMedia.coverUrl : null));
                if (finderMedia != null) {
                    str = finderMedia.cover_url_token;
                }
                sb.append(Util.nullAsNil(str));
                px02.f184911d = sb.toString();
                finderObjectDesc.liveDesc = px02;
                finderObjectDesc.media.add(finderMedia);
                ((C54991o) bVar2.mo71262a(cls2)).f154301c3 = true;
                ((C54991o) bVar2.mo71262a(cls2)).f154309e3 = this.f191039u;
                ((C54991o) bVar2.mo71262a(cls2)).f154314f3 = this.f191044z;
                ((C54991o) bVar2.mo71262a(cls2)).f154319g3 = this.f191015B;
                String str2 = this.f191016C;
                C87412m.m108594g(str2, "<set-?>");
                ((C54991o) bVar2.mo71262a(cls2)).f154323h3 = str2;
                String str3 = this.f191017D;
                C87412m.m108594g(str3, "<set-?>");
                ((C54991o) bVar2.mo71262a(cls2)).f154327i3 = str3;
                ((C54991o) bVar2.mo71262a(cls2)).f154252S0 = finderObjectDesc.description;
                ((C55001u) bVar2.mo71262a(C55001u.class)).f154422s = finderObjectDesc;
            }
            finderLiveService.getClass();
            LiveRoomControllerStore liveRoomControllerStore = FinderLiveService.f159349B;
            if (liveRoomControllerStore == null) {
                liveRoomControllerStore = ((C66331m) C39818r.f106831a.mo62444c(getActivity()).mo75002a(cls)).f190943f;
            }
            FinderLiveService.m63770d(finderLiveService, bVar2, liveRoomControllerStore, (C56032b) null, 1, (C49712hj1) null, 20, (Object) null);
        } else if (this.f191022I == null) {
            FinderLiveService finderLiveService2 = FinderLiveService.f159376d;
            finderLiveService2.getClass();
            C45795b bVar3 = FinderLiveService.f159348A;
            if (bVar3 == null) {
                bVar3 = ((C66331m) C39818r.f106831a.mo62444c(getActivity()).mo75002a(cls)).f190942e;
            }
            C45795b bVar4 = bVar3;
            finderLiveService2.getClass();
            LiveRoomControllerStore liveRoomControllerStore2 = FinderLiveService.f159349B;
            if (liveRoomControllerStore2 == null) {
                liveRoomControllerStore2 = ((C66331m) C39818r.f106831a.mo62444c(getActivity()).mo75002a(cls)).f190943f;
            }
            LiveRoomControllerStore liveRoomControllerStore3 = liveRoomControllerStore2;
            finderLiveService2.getClass();
            C56032b bVar5 = FinderLiveService.f159379g;
            if (bVar5 == null) {
                bVar5 = ((C66331m) C39818r.f106831a.mo62444c(getActivity()).mo75002a(cls)).mo90443d3();
            }
            FinderLiveService.m63770d(finderLiveService2, bVar4, liveRoomControllerStore3, bVar5, 0, (C49712hj1) null, 16, (Object) null);
        }
    }

    /* renamed from: e3 */
    public final void mo90457e3() {
        C54219z<String> zVar;
        LinkedList<C51560uk2> linkedList;
        T t;
        C50169kr1 kr12 = this.f191042x;
        String str = null;
        C48899bs1 bs12 = kr12 != null ? kr12.f137012r : null;
        C54991o oVar = (C54991o) FinderLiveService.f159376d.mo77630e(C54991o.class);
        if (oVar != null && (zVar = oVar.f154302c4) != null) {
            if (!(bs12 == null || (linkedList = bs12.f131284d) == null)) {
                Iterator<T> it = linkedList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    int i = ((C51560uk2) t).f142914e;
                    C50169kr1 kr13 = this.f191042x;
                    boolean z = false;
                    if (i == (kr13 != null ? kr13.f137013s : 0)) {
                        z = true;
                        continue;
                    }
                    if (z) {
                        break;
                    }
                }
                C51560uk2 uk22 = (C51560uk2) t;
                if (uk22 != null) {
                    str = uk22.f142913d;
                }
            }
            zVar.postValue(str);
        }
    }

    /* renamed from: f3 */
    public final void mo90458f3() {
        String str = null;
        if (Util.isNullOrNil(this.f191037s)) {
            C50169kr1 kr12 = this.f191042x;
            String str2 = kr12 != null ? kr12.f137010p : null;
            if (str2 == null) {
                str2 = "";
            }
            this.f191037s = str2;
            String str3 = this.f191025d;
            Log.m105924i(str3, "configCoverUrlAndAppInfo, coverUrl is empty, default:" + this.f191037s);
        }
        C79138l lVar = (C79138l) C86312j.m106911c(C79138l.class);
        String str4 = this.f191039u;
        C50169kr1 kr13 = this.f191042x;
        lVar.mo74004WW(str4, kr13 != null ? kr13.f137005h : null, (C79138l.C53540a) null);
        String str5 = this.f191025d;
        StringBuilder sb = new StringBuilder();
        sb.append("configCoverUrlAndAppInfo game:");
        sb.append(this.f191039u);
        sb.append(", ");
        C50169kr1 kr14 = this.f191042x;
        if (kr14 != null) {
            str = kr14.f137002e;
        }
        sb.append(str);
        sb.append(", ");
        sb.append(this.f191040v);
        sb.append(", ");
        sb.append(this.f191038t);
        Log.m105924i(str5, sb.toString());
    }

    /* renamed from: g3 */
    public final void mo90459g3(FinderMedia finderMedia) {
        FinderMedia finderMedia2 = finderMedia;
        Class cls = C54991o.class;
        Class cls2 = C66331m.class;
        boolean z = false;
        mo90462k3().setEnabled(false);
        C58777u0 u0Var = C58777u0.f168283a;
        if (C58777u0.f168284b == 18) {
            C104289g gVar = new C104289g();
            gVar.mo145953n("type", 4);
            String gVar2 = gVar.toString();
            C87412m.m108593f(gVar2, "JSONObject().apply {\n   …\n            }.toString()");
            u0Var.mo83836e(gVar2);
        }
        if (finderMedia2 == null) {
            C76912y0.makeText((Context) getContext(), (int) C0966R.string.dnn, 0).show();
            Log.m105924i(this.f191025d, "continuePost: media is null!");
            mo90462k3().setEnabled(true);
            return;
        }
        C60523t4 j3 = mo90461j3();
        C32444a.f86121a.mo58623d(j3.f172506d);
        if (j3.f172510h) {
            if (j3.f172506d == 1) {
                z = true;
            }
            if (z) {
                C60523t4.f172502j.add(j3.f172511i);
            }
        }
        C39818r rVar = C39818r.f106831a;
        C45795b bVar = ((C66331m) rVar.mo62444c(getActivity()).mo75002a(cls2)).f190942e;
        ((C54991o) bVar.mo71262a(cls)).mo75982R4((long) ((C54991o) bVar.mo71262a(cls)).f154354q);
        if (mo90464m3()) {
            String str = this.f191025d;
            Log.m105924i(str, "startMiniGameLive: appid = " + this.f191039u + ", version_type = " + this.f191044z);
            if (this.f191021H == null) {
                this.f191021H = C7813i5.C7814a.m7953a(C7813i5.f26336f, getActivity(), getActivity().getResources().getString(C0966R.string.ett), 0, new C53359i0(this), 4, (Object) null);
            }
            C7813i5 i5Var = this.f191021H;
            if (i5Var != null) {
                i5Var.begin();
            }
            C58704c5 c5Var = C58704c5.f168044a;
            C58704c5.m68184a(c5Var, C58713e5.f168091s.f168101b, (C89349b) null, true, false, 10, (Object) null);
            C58704c5.m68184a(c5Var, C58713e5.f168092t.f168101b, (C89349b) null, false, false, 14, (Object) null);
            C58728f5 f5Var = C58728f5.f168144a;
            C58728f5.f168145b = C31543z5.m39451a();
            mo90456d3(finderMedia2, true);
            AppCompatActivity activity = getActivity();
            FinderGameLiveBaseUI finderGameLiveBaseUI = activity instanceof FinderGameLiveBaseUI ? (FinderGameLiveBaseUI) activity : null;
            if (finderGameLiveBaseUI != null) {
                FinderGameEventListener finderGameEventListener = finderGameLiveBaseUI.f14407o;
                if (finderGameEventListener != null) {
                    finderGameEventListener.dead();
                } else {
                    C87412m.m108603p("gameEventListener");
                    throw null;
                }
            }
            FinderGamePostEvent finderGamePostEvent = new FinderGamePostEvent();
            FinderGamePostEvent.C55125a aVar = finderGamePostEvent.f154773d;
            aVar.f154774a = true;
            aVar.f154775b = true;
            finderGamePostEvent.publish();
            AppCompatActivity activity2 = getActivity();
            FinderGameLiveBaseUI finderGameLiveBaseUI2 = activity2 instanceof FinderGameLiveBaseUI ? (FinderGameLiveBaseUI) activity2 : null;
            if (finderGameLiveBaseUI2 != null) {
                FinderGameEventListener finderGameEventListener2 = finderGameLiveBaseUI2.f14407o;
                if (finderGameEventListener2 != null) {
                    finderGameEventListener2.alive();
                } else {
                    C87412m.m108603p("gameEventListener");
                    throw null;
                }
            }
            FinderLiveService finderLiveService = FinderLiveService.f159376d;
            finderLiveService.getClass();
            C45795b bVar2 = FinderLiveService.f159348A;
            if (bVar2 != null) {
                finderLiveService.mo77623Z(bVar2, true, C58124b.C58125b.LIVE_STATUS_CREATE_LIVE, (Bundle) null, ((C55001u) bVar2.mo71262a(C55001u.class)).f154420q.f182392d);
            }
            C53895h.m60466d(((C66331m) rVar.mo62443b(getContext()).mo75002a(cls2)).mo90443d3().checkActiveAndGet(), (C66212f) null, (C53934p0) null, new C53360j0(this, (C15601d<? super C53360j0>) null), 3, (Object) null);
            return;
        }
        C53895h.m60466d(((C66331m) rVar.mo62443b(getContext()).mo75002a(cls2)).mo90443d3().checkActiveAndGet(), (C66212f) null, (C53934p0) null, new C66356a(bVar, this, finderMedia2, (C15601d<? super C66356a>) null), 3, (Object) null);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.acn;
    }

    /* renamed from: i3 */
    public final C60432i mo90460i3() {
        C60432i iVar = this.f191032n;
        if (iVar != null) {
            return iVar;
        }
        C87412m.m108603p("coverWidget");
        throw null;
    }

    /* renamed from: j3 */
    public final C60523t4 mo90461j3() {
        C60523t4 t4Var = this.f191034p;
        if (t4Var != null) {
            return t4Var;
        }
        C87412m.m108603p("licenseWidget");
        throw null;
    }

    /* renamed from: k3 */
    public final View mo90462k3() {
        View view = this.f191031j;
        if (view != null) {
            return view;
        }
        C87412m.m108603p("postBtn");
        throw null;
    }

    /* renamed from: l3 */
    public final void mo90463l3(C49430fj0 fj02) {
        String str = this.f191025d;
        Log.m105924i(str, "warn_page = " + C61937h.m72709h(fj02));
        ((C15718c2) C39818r.f106831a.mo62443b(getContext()).mo75002a(C15718c2.class)).mo14443c3(fj02, new C66358b(this, fj02));
    }

    /* renamed from: m3 */
    public final boolean mo90464m3() {
        C50169kr1 kr12 = this.f191042x;
        return kr12 != null && kr12.f137014t == 1;
    }

    /* renamed from: n3 */
    public final void mo90465n3(boolean z, int i, String str) {
        Intent intent = new Intent();
        intent.putExtra("SUCC", z);
        intent.putExtra("TITLE", getResources().getString(i));
        intent.putExtra("DESC", str);
        intent.putExtra("IS_MINI_GAME", mo90464m3());
        ((C13883o1) C86312j.m106911c(C13883o1.class)).ww0(getContext(), intent);
    }

    /* renamed from: o3 */
    public final void mo90466o3() {
        Class cls = C66331m.class;
        Class cls2 = C54991o.class;
        C39818r rVar = C39818r.f106831a;
        C45795b bVar = ((C66331m) rVar.mo62444c(getActivity()).mo75002a(cls)).f190942e;
        C53973z1 z1Var = ((C54991o) bVar.mo71262a(cls2)).f154217J3;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
        C58087u0<Boolean> u0Var = ((C54991o) bVar.mo71262a(cls2)).f154221K3;
        Boolean bool = Boolean.FALSE;
        ((C58052j1) u0Var).setValue(bool);
        Log.printInfoStack(this.f191025d, "isReadyPluginCountDownOk resetData", new Object[0]);
        ((C58052j1) ((C54991o) bVar.mo71262a(cls2)).f154213I3).setValue(new C13604l(bool, null));
        C53930o0.m60558e(((C66331m) rVar.mo62443b(getContext()).mo75002a(cls)).mo90443d3().getSecurityDataScope(), (CancellationException) null, 1, (Object) null);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        String str = this.f191025d;
        StringBuilder sb = new StringBuilder();
        sb.append("onActivityResult,requestCode:");
        sb.append(i);
        sb.append(",resultCode:");
        sb.append(i2);
        sb.append(",face verify result:");
        String str2 = null;
        boolean z = false;
        sb.append(intent != null ? Integer.valueOf(intent.getIntExtra("FACE_VERIFY_RESULT", 0)) : null);
        Log.m105924i(str, sb.toString());
        super.onActivityResult(i, i2, intent);
        if (i != 10000) {
            C60432i i3 = mo90460i3();
            if (i == i3.f172315o) {
                if (intent != null) {
                    Uri data = intent.getData();
                    String path = data != null ? data.getPath() : null;
                    Uri data2 = intent.getData();
                    if (data2 != null) {
                        str2 = data2.getPath();
                    }
                    if (Util.isNullOrNil(str2)) {
                        path = ((C7138g) C86312j.m106911c(C7138g.class)).mo8319g6(i3.f172307d, intent, ((C64916p1) C86312j.m106911c(C64916p1.class)).mo76713pw());
                    }
                    String str3 = path;
                    String str4 = i3.f172311h;
                    Log.m105924i(str4, "filePath[" + str3 + "] " + intent);
                    if (str3 != null) {
                        i3.f172316p.mo8889a(str3, C7777a0.f26271h.mo8891a(), 0.5625f, i3.f172307d.getResources().getColor(C0966R.color.a_j), true);
                        if (intent.getData() == null) {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else if (i == 100112 && i2 == -1) {
                CaptureDataManager.CaptureVideoNormalModel captureVideoNormalModel = intent != null ? (CaptureDataManager.CaptureVideoNormalModel) intent.getParcelableExtra("KSEGMENTMEDIAINFO") : null;
                String str5 = i3.f172311h;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("REQUEST_CODE_CROP_FIX_IMAGE model: ");
                sb4.append(captureVideoNormalModel != null ? captureVideoNormalModel.f272895f : null);
                Log.m105924i(str5, sb4.toString());
                if (captureVideoNormalModel != null) {
                    String str6 = captureVideoNormalModel.f272895f;
                    Boolean bool = captureVideoNormalModel.f272897h;
                    C87412m.m108593f(bool, "photo");
                    if (!bool.booleanValue() || Util.isNullOrNil(captureVideoNormalModel.f272895f)) {
                        C76912y0.makeText((Context) i3.f172307d, (int) C0966R.string.cyc, 0).show();
                    } else {
                        C62042e eVar = C62042e.f176370a;
                        ImageView imageView = i3.f172308e;
                        C87412m.m108593f(str6, AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
                        eVar.mo86999E(imageView, str6, Math.min(i3.f172308e.getWidth(), 500), Math.min(i3.f172308e.getHeight(), 500));
                        i3.f172312i = str6;
                        i3.f172313j = "";
                        i3.f172314n = null;
                    }
                }
                i3.f172310g.onChange();
            }
            i3.f172316p.mo8890b(i2);
        } else if (i2 == -1) {
            if (intent != null && intent.getIntExtra("FACE_VERIFY_RESULT", 0) == 1) {
                z = true;
            }
            if (z) {
                mo90455G3();
            }
        }
    }

    public boolean onBackPressed() {
        boolean z;
        C60511s4 s4Var = this.f191035q;
        if (s4Var != null) {
            boolean z2 = false;
            if (s4Var.f172475b.getVisibility() == 0) {
                s4Var.f172477d.mo78802a();
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
            C62861l1 l1Var = (C62861l1) ((C66331m) C39818r.f106831a.mo62443b(getContext()).mo75002a(C66331m.class)).mo90443d3().getPlugin(C62861l1.class);
            if (l1Var != null && l1Var.mo3207l0()) {
                z2 = true;
            }
            if (z2) {
                return true;
            }
            return super.onBackPressed();
        }
        C87412m.m108603p("licensePanelWidget");
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:112:0x03af  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008a A[SYNTHETIC, Splitter:B:22:0x008a] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x021f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r13) {
        /*
            r12 = this;
            super.onCreate(r13)
            android.content.Intent r13 = r12.getIntent()
            java.lang.String r0 = "COVER_URL"
            java.lang.String r13 = r13.getStringExtra(r0)
            java.lang.String r0 = ""
            if (r13 != 0) goto L_0x0012
            r13 = r0
        L_0x0012:
            r12.f191037s = r13
            android.content.Intent r13 = r12.getIntent()
            java.lang.String r1 = "TICKET"
            java.lang.String r13 = r13.getStringExtra(r1)
            if (r13 != 0) goto L_0x0021
            r13 = r0
        L_0x0021:
            r12.f191038t = r13
            android.content.Intent r13 = r12.getIntent()
            java.lang.String r1 = "APPID"
            java.lang.String r13 = r13.getStringExtra(r1)
            if (r13 != 0) goto L_0x0030
            r13 = r0
        L_0x0030:
            r12.f191039u = r13
            android.content.Intent r13 = r12.getIntent()
            java.lang.String r1 = "POST_FROM_SCENE"
            r2 = 0
            int r13 = r13.getIntExtra(r1, r2)
            r12.f191040v = r13
            android.content.Intent r13 = r12.getIntent()
            java.lang.String r1 = "IS_FROM_WEAPP"
            boolean r13 = r13.getBooleanExtra(r1, r2)
            r12.f191014A = r13
            te3.qs1 r13 = new te3.qs1
            r13.<init>()
            android.content.Intent r1 = r12.getIntent()
            java.lang.String r3 = "GameUserInfo"
            byte[] r1 = r1.getByteArrayExtra(r3)
            java.lang.String r3 = "safeParser"
            r4 = 1
            r5 = 0
            if (r1 != 0) goto L_0x0061
            goto L_0x006d
        L_0x0061:
            r13.parseFrom(r1)     // Catch:{ Exception -> 0x0065 }
            goto L_0x006e
        L_0x0065:
            r13 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r2] = r13
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r3, r0, r1)
        L_0x006d:
            r13 = r5
        L_0x006e:
            r12.f191041w = r13
            if (r13 == 0) goto L_0x0075
            te3.kr1 r13 = r13.f140523e
            goto L_0x0076
        L_0x0075:
            r13 = r5
        L_0x0076:
            r12.f191042x = r13
            te3.cg4 r13 = new te3.cg4
            r13.<init>()
            android.content.Intent r1 = r12.getIntent()
            java.lang.String r6 = "KEY_FROM_THIRD_PARTY_SHARE"
            byte[] r1 = r1.getByteArrayExtra(r6)
            if (r1 != 0) goto L_0x008a
            goto L_0x0096
        L_0x008a:
            r13.parseFrom(r1)     // Catch:{ Exception -> 0x008e }
            goto L_0x0097
        L_0x008e:
            r13 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r2] = r13
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r3, r0, r1)
        L_0x0096:
            r13 = r5
        L_0x0097:
            r12.f191043y = r13
            java.lang.String r13 = r12.f191025d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "initData thirdAppInfo "
            r1.append(r3)
            te3.cg4 r3 = r12.f191043y
            if (r3 == 0) goto L_0x00ac
            java.lang.String r3 = r3.f182476d
            goto L_0x00ad
        L_0x00ac:
            r3 = r5
        L_0x00ad:
            r1.append(r3)
            java.lang.String r3 = ", "
            r1.append(r3)
            te3.cg4 r6 = r12.f191043y
            if (r6 == 0) goto L_0x00c0
            int r6 = r6.f182478f
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            goto L_0x00c1
        L_0x00c0:
            r6 = r5
        L_0x00c1:
            r1.append(r6)
            r1.append(r3)
            te3.cg4 r6 = r12.f191043y
            if (r6 == 0) goto L_0x00ce
            java.lang.String r6 = r6.f182479g
            goto L_0x00cf
        L_0x00ce:
            r6 = r5
        L_0x00cf:
            r1.append(r6)
            r1.append(r3)
            java.lang.String r6 = r12.f191038t
            r1.append(r6)
            r1.append(r3)
            te3.cg4 r3 = r12.f191043y
            if (r3 == 0) goto L_0x00e4
            java.lang.String r3 = r3.f182480h
            goto L_0x00e5
        L_0x00e4:
            r3 = r5
        L_0x00e5:
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r1)
            android.content.Intent r13 = r12.getIntent()
            java.lang.String r1 = "VERSION_TYPE"
            boolean r13 = r13.hasExtra(r1)
            if (r13 == 0) goto L_0x0104
            android.content.Intent r13 = r12.getIntent()
            int r13 = r13.getIntExtra(r1, r2)
            goto L_0x0110
        L_0x0104:
            te3.kr1 r13 = r12.f191042x
            if (r13 == 0) goto L_0x010f
            te3.c05 r13 = r13.f137015u
            if (r13 == 0) goto L_0x010f
            int r13 = r13.f131436e
            goto L_0x0110
        L_0x010f:
            r13 = 0
        L_0x0110:
            r12.f191044z = r13
            android.content.Intent r13 = r12.getIntent()
            java.lang.String r1 = "MINI_GAME_SCENE"
            int r13 = r13.getIntExtra(r1, r2)
            r12.f191015B = r13
            android.content.Intent r13 = r12.getIntent()
            java.lang.String r1 = "WXA_DEVELOPER_CUSTOM_PARAM"
            java.lang.String r13 = r13.getStringExtra(r1)
            if (r13 != 0) goto L_0x012b
            r13 = r0
        L_0x012b:
            r12.f191016C = r13
            android.content.Intent r13 = r12.getIntent()
            java.lang.String r1 = "REPORT_INFO"
            java.lang.String r13 = r13.getStringExtra(r1)
            if (r13 != 0) goto L_0x013a
            r13 = r0
        L_0x013a:
            r12.f191017D = r13
            te3.kr1 r13 = r12.f191042x
            if (r13 != 0) goto L_0x017c
            qg1.r r13 = new qg1.r
            java.lang.String r7 = r12.f191039u
            int r8 = r12.f191040v
            r9 = 0
            r10 = 4
            r11 = 0
            r6 = r13
            r6.<init>(r7, r8, r9, r10, r11)
            android.app.Activity r1 = r12.getContext()
            android.content.res.Resources r3 = r12.getResources()
            r6 = 2131830090(0x7f11254a, float:1.9293168E38)
            java.lang.String r3 = r3.getString(r6)
            r6 = 500(0x1f4, double:2.47E-321)
            r13.mo85582k(r1, r3, r6)
            nr3.e r13 = r13.mo9225i()
            androidx.appcompat.app.AppCompatActivity r1 = r12.getActivity()
            java.lang.String r3 = "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity"
            gy3.C87412m.m108592e(r1, r3)
            com.tencent.mm.ui.MMFragmentActivity r1 = (com.tencent.p014mm.p136ui.MMFragmentActivity) r1
            r13.mo11397F(r1)
            xk1.z r1 = new xk1.z
            r1.<init>(r12)
            r13.mo123420E(r1)
            goto L_0x017f
        L_0x017c:
            r12.mo90458f3()
        L_0x017f:
            androidx.appcompat.app.AppCompatActivity r13 = r12.getActivity()
            r1 = 2131305554(0x7f092452, float:1.8229282E38)
            android.view.View r13 = r13.findViewById(r1)
            java.lang.String r1 = "activity.findViewById(R.id.game_post_root)"
            gy3.C87412m.m108593f(r13, r1)
            r12.f191026e = r13
            androidx.appcompat.app.AppCompatActivity r13 = r12.getActivity()
            r1 = 2131305555(0x7f092453, float:1.8229284E38)
            android.view.View r13 = r13.findViewById(r1)
            java.lang.String r1 = "activity.findViewById(R.id.game_post_title_tv)"
            gy3.C87412m.m108593f(r13, r1)
            android.widget.TextView r13 = (android.widget.TextView) r13
            r12.f191027f = r13
            androidx.appcompat.app.AppCompatActivity r13 = r12.getActivity()
            r1 = 2131304128(0x7f091ec0, float:1.822639E38)
            android.view.View r13 = r13.findViewById(r1)
            java.lang.String r1 = "activity.findViewById(R.…nder_live_post_task_view)"
            gy3.C87412m.m108593f(r13, r1)
            com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerView r13 = (com.tencent.p014mm.plugin.finder.live.widget.FinderLiveTaskBannerView) r13
            r12.f191028g = r13
            androidx.appcompat.app.AppCompatActivity r13 = r12.getActivity()
            r1 = 2131305551(0x7f09244f, float:1.8229276E38)
            android.view.View r13 = r13.findViewById(r1)
            java.lang.String r1 = "activity.findViewById(R.id.game_post_iv)"
            gy3.C87412m.m108593f(r13, r1)
            android.widget.ImageView r13 = (android.widget.ImageView) r13
            r12.f191029h = r13
            androidx.appcompat.app.AppCompatActivity r13 = r12.getActivity()
            r1 = 2131305567(0x7f09245f, float:1.8229308E38)
            android.view.View r13 = r13.findViewById(r1)
            java.lang.String r1 = "activity.findViewById(R.….game_replace_cover_view)"
            gy3.C87412m.m108593f(r13, r1)
            r12.f191030i = r13
            androidx.appcompat.app.AppCompatActivity r13 = r12.getActivity()
            r1 = 2131311124(0x7f093a14, float:1.824058E38)
            android.view.View r13 = r13.findViewById(r1)
            java.lang.String r1 = "activity.findViewById(R.id.post_btn)"
            gy3.C87412m.m108593f(r13, r1)
            r12.f191031j = r13
            androidx.appcompat.app.AppCompatActivity r13 = r12.getActivity()
            r1 = 2131307700(0x7f092cb4, float:1.8233635E38)
            android.view.View r13 = r13.findViewById(r1)
            java.lang.String r1 = "activity.findViewById(R.id.live_post_desc_et)"
            gy3.C87412m.m108593f(r13, r1)
            com.tencent.mm.ui.widget.MMEditText r13 = (com.tencent.p014mm.p136ui.widget.MMEditText) r13
            r12.f191019F = r13
            er1.j4 r1 = er1.C58739j4.f168176a
            java.lang.String r1 = r1.mo83720p()
            r13.setHint(r1)
            android.view.View r13 = r12.mo90462k3()
            r13.setEnabled(r2)
            il1.i r13 = new il1.i
            androidx.appcompat.app.AppCompatActivity r1 = r12.getActivity()
            android.widget.ImageView r3 = r12.f191029h
            if (r3 == 0) goto L_0x03af
            android.view.View r6 = r12.f191030i
            if (r6 == 0) goto L_0x03a9
            xk1.a0 r7 = new xk1.a0
            r7.<init>(r12)
            r13.<init>(r1, r3, r6, r7)
            r12.f191032n = r13
            il1.i r13 = r12.mo90460i3()
            java.lang.String r1 = r12.f191037s
            r13.mo85404a(r1)
            il1.l r13 = new il1.l
            androidx.appcompat.app.AppCompatActivity r1 = r12.getActivity()
            com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerView r3 = r12.f191028g
            if (r3 == 0) goto L_0x03a2
            r13.<init>(r1, r3)
            r12.f191033o = r13
            te3.qs1 r1 = r12.f191041w
            if (r1 == 0) goto L_0x024c
            r13.mo71673a(r1)
        L_0x024c:
            il1.t4 r13 = new il1.t4
            androidx.appcompat.app.AppCompatActivity r1 = r12.getActivity()
            java.lang.String r3 = "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity"
            gy3.C87412m.m108592e(r1, r3)
            com.tencent.mm.ui.MMActivity r1 = (com.tencent.p014mm.p136ui.MMActivity) r1
            androidx.appcompat.app.AppCompatActivity r6 = r12.getActivity()
            r7 = 2131305552(0x7f092450, float:1.8229278E38)
            android.view.View r6 = r6.findViewById(r7)
            java.lang.String r7 = "activity.findViewById(R.…e_post_license_container)"
            gy3.C87412m.m108593f(r6, r7)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            int r7 = r12.f191040v
            if (r7 != r4) goto L_0x0271
            r7 = 1
            goto L_0x0272
        L_0x0271:
            r7 = 0
        L_0x0272:
            xk1.b0 r8 = new xk1.b0
            r8.<init>()
            r13.<init>(r1, r6, r7, r8)
            r12.f191034p = r13
            il1.t4 r13 = r12.mo90461j3()
            java.lang.String r1 = r12.f191039u
            boolean r6 = r12.mo90464m3()
            java.lang.String r7 = "appId"
            gy3.C87412m.m108594g(r1, r7)
            r13.f172511i = r1
            boolean r1 = r13.f172510h
            if (r1 == r6) goto L_0x02aa
            r13.f172510h = r6
            android.widget.TextView r1 = r13.f172509g
            er1.w0 r7 = er1.C58782w0.f168290a
            com.tencent.mm.ui.MMActivity r13 = r13.f172503a
            r8 = 2131827470(0x7f111b0e, float:1.9287854E38)
            android.text.SpannableString r13 = r7.mo83848g(r13, r8, r6)
            android.text.method.MovementMethod r6 = android.text.method.LinkMovementMethod.getInstance()
            r1.setMovementMethod(r6)
            r1.setText(r13)
        L_0x02aa:
            il1.s4 r13 = new il1.s4
            androidx.appcompat.app.AppCompatActivity r1 = r12.getActivity()
            gy3.C87412m.m108592e(r1, r3)
            com.tencent.mm.ui.MMActivity r1 = (com.tencent.p014mm.p136ui.MMActivity) r1
            androidx.appcompat.app.AppCompatActivity r6 = r12.getActivity()
            r7 = 2131303497(0x7f091c49, float:1.822511E38)
            android.view.View r6 = r6.findViewById(r7)
            java.lang.String r7 = "activity.findViewById(R.…st_license_panel_ui_root)"
            gy3.C87412m.m108593f(r6, r7)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            xk1.c0 r7 = new xk1.c0
            r7.<init>(r12)
            r13.<init>(r1, r6, r7)
            r12.f191035q = r13
            boolean r1 = r12.mo90464m3()
            boolean r6 = r13.f172481h
            if (r6 == r1) goto L_0x02e6
            r13.f172481h = r1
            android.widget.TextView r1 = r13.f172478e
            java.lang.String r6 = "tipTv"
            gy3.C87412m.m108593f(r1, r6)
            r13.mo85481a(r1)
        L_0x02e6:
            il1.t4 r13 = r12.mo90461j3()
            r13.mo85489a()
            r12.mo90457e3()
            il1.k r13 = new il1.k
            androidx.appcompat.app.AppCompatActivity r1 = r12.getActivity()
            gy3.C87412m.m108592e(r1, r3)
            r7 = r1
            com.tencent.mm.ui.MMActivity r7 = (com.tencent.p014mm.p136ui.MMActivity) r7
            androidx.appcompat.app.AppCompatActivity r1 = r12.getActivity()
            r3 = 2131305585(0x7f092471, float:1.8229345E38)
            android.view.View r1 = r1.findViewById(r3)
            java.lang.String r3 = "activity.findViewById(R.id.game_sticker_layout)"
            gy3.C87412m.m108593f(r1, r3)
            r8 = r1
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            java.lang.String r9 = r12.f191039u
            int r10 = r12.f191040v
            xk1.d0 r11 = new xk1.d0
            r11.<init>(r12)
            r6 = r13
            r6.<init>(r7, r8, r9, r10, r11)
            r12.f191036r = r13
            te3.kr1 r1 = r12.f191042x
            if (r1 == 0) goto L_0x0325
            java.lang.String r3 = r1.f137018x
            goto L_0x0326
        L_0x0325:
            r3 = r5
        L_0x0326:
            if (r1 == 0) goto L_0x032e
            boolean r1 = r1.f137017w
            if (r1 != r4) goto L_0x032e
            r1 = 1
            goto L_0x032f
        L_0x032e:
            r1 = 0
        L_0x032f:
            r13.mo85411a(r3, r1)
            nk1.b r13 = nk1.C11193b.f33003a
            zc1.b r1 = zc1.C66785b.f191882e
            java.lang.String r1 = r1.mo90662O5()
            android.view.View r3 = r12.f191026e
            if (r3 == 0) goto L_0x039c
            r13.mo11281b(r1, r0, r3, r5)
            r13 = 2131305556(0x7f092454, float:1.8229286E38)
            android.view.View r13 = r12.findViewById(r13)
            xk1.e0 r1 = new xk1.e0
            r1.<init>(r13)
            r13.post(r1)
            xk1.f0 r1 = new xk1.f0
            r1.<init>(r12)
            r13.setOnClickListener(r1)
            android.widget.TextView r13 = r12.f191027f
            if (r13 == 0) goto L_0x0395
            te3.kr1 r1 = r12.f191042x
            if (r1 == 0) goto L_0x0366
            java.lang.String r1 = r1.f137002e
            if (r1 != 0) goto L_0x0365
            goto L_0x0366
        L_0x0365:
            r0 = r1
        L_0x0366:
            r13.setText(r0)
            android.view.View r13 = r12.mo90462k3()
            xk1.g0 r0 = new xk1.g0
            r0.<init>(r12)
            r13.setOnClickListener(r0)
            er1.u0 r13 = er1.C58777u0.f168283a
            long r0 = er1.C58777u0.f168284b
            r5 = 19
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x0382
            r13.mo83833b(r4)
        L_0x0382:
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r13 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r13.getClass()
            j50.a r13 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159378f
            r12.f191022I = r13
            il1.i r13 = r12.mo90460i3()
            com.tencent.mm.protocal.protobuf.FinderMedia r13 = r13.f172314n
            r12.mo90456d3(r13, r2)
            return
        L_0x0395:
            java.lang.String r13 = "titleTv"
            gy3.C87412m.m108603p(r13)
            throw r5
        L_0x039c:
            java.lang.String r13 = "root"
            gy3.C87412m.m108603p(r13)
            throw r5
        L_0x03a2:
            java.lang.String r13 = "taskBannerView"
            gy3.C87412m.m108603p(r13)
            throw r5
        L_0x03a9:
            java.lang.String r13 = "replaceCoverIv"
            gy3.C87412m.m108603p(r13)
            throw r5
        L_0x03af:
            java.lang.String r13 = "coverIv"
            gy3.C87412m.m108603p(r13)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: xk1.C66355w.onCreate(android.os.Bundle):void");
    }

    public void onCreateAfter(Bundle bundle) {
        super.onCreateAfter(bundle);
        Class cls = C15728e1.class;
        Object f = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_FINDER_LIVE_GAME_PROTOCOL_SHOW_GUIDE_BOOLEAN_SYNC, Boolean.FALSE);
        C87412m.m108592e(f, "null cannot be cast to non-null type kotlin.Boolean");
        if (!((Boolean) f).booleanValue()) {
            C39818r rVar = C39818r.f106831a;
            ((C15728e1) rVar.mo62443b(getContext()).mo75002a(cls)).mo14457d3();
            ((C15728e1) rVar.mo62443b(getContext()).mo75002a(cls)).f42441o = new C66346s(this);
        }
    }

    public void onDestroy() {
        C66089v vVar;
        if (!this.f191023J) {
            C66338o oVar = (C66338o) C39818r.f106831a.mo62444c(getActivity()).mo75002a(C66338o.class);
            if (!(oVar == null || (vVar = oVar.f190964d) == null)) {
                vVar.mo90008x0();
            }
            if (this.f191022I == null || this.f191020G) {
                FinderLiveService.m63767I(FinderLiveService.f159376d, "game", false, false, (Boolean) null, false, 30, (Object) null);
            } else {
                FinderLiveService finderLiveService = FinderLiveService.f159376d;
                finderLiveService.getClass();
                if (FinderLiveService.f159378f instanceof C60251a) {
                    Log.m105924i("MicroMsg.LiveCoreSecondaryDevice", "releaseInstance");
                    C60251a aVar = C60251a.f171781k1;
                    if (aVar != null) {
                        aVar.mo75581i0();
                    }
                    C60251a.f171781k1 = null;
                }
                C60735a aVar2 = this.f191022I;
                finderLiveService.getClass();
                FinderLiveService.f159378f = aVar2;
            }
        }
        if (this.f191024K) {
            FinderLiveService finderLiveService2 = FinderLiveService.f159376d;
            finderLiveService2.mo77613P((C45795b) null);
            C45795b.f123697j.mo58474a((C45795b) null);
            finderLiveService2.mo77612O((LiveRoomControllerStore) null);
        }
        mo90466o3();
    }

    public void onPause() {
        super.onPause();
        C46264l lVar = this.f191033o;
        if (lVar != null) {
            FinderLiveTaskBannerView finderLiveTaskBannerView = lVar.f124711b;
            finderLiveTaskBannerView.f160097p = false;
            finderLiveTaskBannerView.f160099r.removeMessages(finderLiveTaskBannerView.f160094j);
            return;
        }
        C87412m.m108603p("taskWidget");
        throw null;
    }

    public void onResume() {
        C66089v vVar;
        C66089v vVar2;
        boolean z;
        String str;
        Class cls = C66338o.class;
        Class cls2 = C54991o.class;
        super.onResume();
        C46264l lVar = this.f191033o;
        C54768h6 h6Var = null;
        if (lVar != null) {
            FinderLiveTaskBannerView finderLiveTaskBannerView = lVar.f124711b;
            finderLiveTaskBannerView.f160097p = true;
            finderLiveTaskBannerView.mo78259d();
            if (this.f191020G) {
                FinderGamePostEvent finderGamePostEvent = new FinderGamePostEvent();
                finderGamePostEvent.f154773d.f154774a = true;
                finderGamePostEvent.publish();
            }
            C60444k kVar = this.f191036r;
            if (kVar != null) {
                if (kVar.f172340h) {
                    C62616r rVar = new C62616r(kVar.f172335c, kVar.f172336d, false, 4, (C8480h) null);
                    MMActivity mMActivity = kVar.f172333a;
                    rVar.mo85582k(mMActivity, mMActivity.getResources().getString(C0966R.string.ett), 500);
                    C89059e i = rVar.mo9225i();
                    MMActivity mMActivity2 = kVar.f172333a;
                    C87412m.m108592e(mMActivity2, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
                    i.mo11397F(mMActivity2);
                    i.mo123420E(new C60440j(kVar));
                }
                kVar.f172340h = false;
            }
            View findViewById = getActivity().findViewById(C0966R.C0970id.ent);
            if (findViewById != null && findViewById.getVisibility() == 0) {
                C58777u0 u0Var = C58777u0.f168283a;
                StringBuilder sb = new StringBuilder();
                sb.append("{\"gameappid\":\"");
                C60444k kVar2 = this.f191036r;
                if (kVar2 == null || (str = kVar2.f172335c) == null) {
                    str = "";
                }
                sb.append(str);
                sb.append("\"}");
                u0Var.mo83835d(9, sb.toString());
            }
            C45795b bVar = ((C66331m) C39818r.f106831a.mo62444c(getActivity()).mo75002a(C66331m.class)).f190942e;
            if (bVar != null) {
                Iterator<C54768h6> it = ((C54991o) bVar.mo71262a(cls2)).f154232N2.f153469f.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C54768h6 next = it.next();
                    if (next.f153499b == 2) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        h6Var = next;
                        break;
                    }
                }
                C54768h6 h6Var2 = h6Var;
                if (h6Var2 != null) {
                    C39818r rVar2 = C39818r.f106831a;
                    C66338o oVar = (C66338o) rVar2.mo62444c(getActivity()).mo75002a(cls);
                    if (!(oVar == null || (vVar2 = oVar.f190964d) == null)) {
                        ((C65954a0) vVar2).mo89993N(h6Var2, ((C54991o) bVar.mo71262a(cls2)).f154232N2.f153467d);
                    }
                    C66338o oVar2 = (C66338o) rVar2.mo62444c(getActivity()).mo75002a(cls);
                    if (oVar2 != null && (vVar = oVar2.f190964d) != null) {
                        ((C65954a0) vVar).mo89996Y();
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        C87412m.m108603p("taskWidget");
        throw null;
    }

    public void onStop() {
        T t;
        C66338o oVar;
        C66089v vVar;
        boolean z;
        C66089v vVar2;
        Class cls = C66338o.class;
        Class cls2 = C55001u.class;
        Class cls3 = C54991o.class;
        C39818r rVar = C39818r.f106831a;
        C45795b bVar = ((C66331m) rVar.mo62444c(getActivity()).mo75002a(C66331m.class)).f190942e;
        if (bVar != null) {
            if (!((C54991o) bVar.mo71262a(cls3)).f154185B3) {
                if (C62042e.f176370a.mo86991B(bVar)) {
                    long j = ((C55001u) bVar.mo71262a(cls2)).f154420q.f182392d;
                    byte[] bArr = ((C55001u) bVar.mo71262a(cls2)).f154417n;
                    String O5 = C66785b.f191882e.mo90662O5();
                    long j2 = ((C55001u) bVar.mo71262a(cls2)).f154416j;
                    long j3 = j;
                    byte[] bArr2 = bArr;
                    String str = O5;
                    long j4 = j2;
                    long j5 = j;
                    C52312zv0 e = ((C54991o) bVar.mo71262a(cls3)).f154232N2.mo75648e();
                    new C45379o0(j5, bArr2, str, j2, e, 0, new C46728a(j3, bArr2, str, j2, e)).mo9225i();
                }
                ((C54991o) bVar.mo71262a(cls3)).f154185B3 = true;
            }
            if (!this.f191023J) {
                C66338o oVar2 = (C66338o) rVar.mo62444c(getActivity()).mo75002a(cls);
                if (!(oVar2 == null || (vVar2 = oVar2.f190964d) == null)) {
                    vVar2.hide();
                }
                Iterator<T> it = ((C54991o) bVar.mo71262a(cls3)).f154232N2.f153469f.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (((C54768h6) t).f153499b == 1) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        break;
                    }
                }
                C54768h6 h6Var = (C54768h6) t;
                if (h6Var != null && (oVar = (C66338o) C39818r.f106831a.mo62444c(getActivity()).mo75002a(cls)) != null && (vVar = oVar.f190964d) != null) {
                    vVar.mo89990E0(h6Var, ((C54991o) bVar.mo71262a(cls3)).f154232N2.f153467d);
                    return;
                }
                return;
            }
            return;
        }
    }
}
