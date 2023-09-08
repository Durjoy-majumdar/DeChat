package qj1;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53934p0;
import a14.C53965x0;
import a14.C53973z1;
import ak1.C54067f0;
import ak1.C54116w;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.camera.core.FocusMeteringAction;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.feed.model.C2816v;
import com.tencent.p014mm.plugin.finder.live.infrastructure.coroutine.C55908a;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.plugin.finder.view.C4077j3;
import com.tencent.p014mm.plugin.finder.view.notice.NoticeCouponMiniInfoView;
import com.tencent.p014mm.plugin.finder.view.notice.NoticeStatusView;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import dh1.C7329b;
import di3.C86312j;
import er1.C58739j4;
import er1.C7776a;
import er1.C7802g1;
import f14.C58901s;
import f40.C86709a0;
import fj1.C45795b;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8479f0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import hq1.C60085d;
import hq1.C60090e;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.CancellationException;
import je1.C33558n2;
import je1.C46553z0;
import k20.C60958c;
import k20.C9556a;
import kotlin.ResultKt;
import l31.C61212e;
import nj3.C76912y0;
import nr3.C89059e;
import ob0.C11385n;
import ok1.C62042e;
import org.json.JSONObject;
import pe3.C89349b;
import qj1.C62966ri;
import qo3.C77407n;
import rx3.C13598b0;
import rx3.C13604l;
import sk1.C13695o;
import sk1.C63956k;
import sx3.C90364q0;
import te3.C49098d51;
import te3.C49359f1;
import te3.C49712hj1;
import te3.C51559uk1;
import te3.C64822x51;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;
import zp3.C23564m;

/* renamed from: qj1.oc */
public final class C12572oc implements C62966ri {

    /* renamed from: d */
    public final Context f36070d;

    /* renamed from: e */
    public final C45795b f36071e;

    /* renamed from: f */
    public final C58124b f36072f;

    /* renamed from: g */
    public C32226l<? super C63956k, C13598b0> f36073g;

    /* renamed from: h */
    public C63956k f36074h;

    /* renamed from: i */
    public final String f36075i = "FinderLiveNoticeBubble";

    /* renamed from: j */
    public ViewGroup f36076j;

    /* renamed from: n */
    public NoticeCouponMiniInfoView f36077n;

    /* renamed from: o */
    public TextView f36078o;

    /* renamed from: p */
    public final long f36079p;

    /* renamed from: q */
    public C53973z1 f36080q;

    /* renamed from: r */
    public C49098d51 f36081r;

    /* renamed from: s */
    public final C12573a f36082s;

    /* renamed from: qj1.oc$a */
    public static final class C12573a implements C11385n {

        /* renamed from: d */
        public final /* synthetic */ C12572oc f36083d;

        public C12573a(C12572oc ocVar) {
            this.f36083d = ocVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:23:0x0042  */
        /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onSceneEnd(int r4, int r5, java.lang.String r6, ob0.C117747y r7) {
            /*
                r3 = this;
                ob0.b0 r6 = f40.C86709a0.m107524d()
                r7 = 6276(0x1884, float:8.795E-42)
                r6.mo123470p(r7, r3)
                if (r4 != 0) goto L_0x0075
                if (r5 != 0) goto L_0x0075
                qj1.oc r4 = r3.f36083d
                te3.d51 r4 = r4.f36081r
                r5 = 1
                r6 = 0
                if (r4 == 0) goto L_0x003f
                boolean r7 = er1.C7802g1.m7950b(r4)
                r0 = 0
                if (r7 == 0) goto L_0x001d
                goto L_0x001e
            L_0x001d:
                r4 = r0
            L_0x001e:
                if (r4 == 0) goto L_0x003f
                qj1.oc r7 = r3.f36083d
                te3.uk1 r1 = er1.C7802g1.m7949a(r4)
                if (r1 == 0) goto L_0x003f
                te3.f1 r2 = r1.f142912z
                if (r2 == 0) goto L_0x0034
                boolean r2 = er1.C7776a.m7931a(r2)
                if (r2 != 0) goto L_0x0034
                r2 = 1
                goto L_0x0035
            L_0x0034:
                r2 = 0
            L_0x0035:
                if (r2 == 0) goto L_0x0038
                r0 = r1
            L_0x0038:
                if (r0 == 0) goto L_0x003f
                qj1.C12572oc.m12099a(r7, r0, r4)
                r4 = 1
                goto L_0x0040
            L_0x003f:
                r4 = 0
            L_0x0040:
                if (r4 != 0) goto L_0x0075
                qj1.oc r4 = r3.f36083d
                te3.d51 r4 = r4.f36081r
                if (r4 == 0) goto L_0x004f
                boolean r4 = er1.C7802g1.m7950b(r4)
                if (r4 != r5) goto L_0x004f
                goto L_0x0050
            L_0x004f:
                r5 = 0
            L_0x0050:
                if (r5 == 0) goto L_0x0075
                qj1.oc r4 = r3.f36083d
                android.view.ViewGroup r4 = r4.f36076j
                android.content.Context r4 = r4.getContext()
                qj1.oc r5 = r3.f36083d
                android.view.ViewGroup r5 = r5.f36076j
                android.content.Context r5 = r5.getContext()
                r7 = 2131828242(0x7f111e12, float:1.928942E38)
                java.lang.String r5 = r5.getString(r7)
                android.widget.Toast r4 = nj3.C76912y0.makeText((android.content.Context) r4, (java.lang.CharSequence) r5, (int) r6)
                r5 = 17
                r4.setGravity(r5, r6, r6)
                r4.show()
            L_0x0075:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: qj1.C12572oc.C12573a.onSceneEnd(int, int, java.lang.String, ob0.y):void");
        }
    }

    /* renamed from: qj1.oc$b */
    public static final class C12574b extends C87413o implements C32224a<C49098d51> {

        /* renamed from: d */
        public final /* synthetic */ C13695o f36084d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12574b(C13695o oVar) {
            super(0);
            this.f36084d = oVar;
        }

        public Object invoke() {
            return this.f36084d.f38752s;
        }
    }

    /* renamed from: qj1.oc$c */
    public static final class C12575c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C12572oc f36085d;

        /* renamed from: e */
        public final /* synthetic */ NoticeStatusView f36086e;

        public C12575c(C12572oc ocVar, NoticeStatusView noticeStatusView) {
            this.f36085d = ocVar;
            this.f36086e = noticeStatusView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveNoticeBubble$refreshView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C12572oc ocVar = this.f36085d;
            NoticeStatusView noticeStatusView = this.f36086e;
            C87412m.m108593f(noticeStatusView, "noticeStatusView");
            C12572oc.m12100b(ocVar, noticeStatusView);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveNoticeBubble$refreshView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qj1.oc$d */
    public static final class C12576d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C12572oc f36087d;

        /* renamed from: e */
        public final /* synthetic */ C13695o f36088e;

        public C12576d(C12572oc ocVar, C13695o oVar) {
            this.f36087d = ocVar;
            this.f36088e = oVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveNoticeBubble$refreshView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            String str = this.f36087d.f36075i;
            Log.m105924i(str, "close promote, id:" + this.f36088e.f38752s.f132122h);
            C7329b bVar = C7329b.f25441a;
            C45795b bVar2 = this.f36087d.f36071e;
            C49098d51 d512 = this.f36088e.f38752s;
            String str2 = d512.f132122h;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = str2;
            C51559uk1 a = C7802g1.m7949a(d512);
            C7329b.m7474c(bVar, bVar2, 2, 1, str3, 0, a != null ? a.f142894e : null, 0, 80, (Object) null);
            FinderLiveService.f159376d.getClass();
            C56032b bVar3 = FinderLiveService.f159379g;
            if (bVar3 != null) {
                C58124b.C58125b bVar4 = C58124b.C58125b.FINDER_LIVE_PROMTE_DEL;
                Bundle bundle = new Bundle();
                C13695o oVar = this.f36088e;
                C64822x51 x512 = new C64822x51();
                x512.f186258h = oVar.f181291d;
                x512.f186254d = 1;
                x512.f186256f = new C89349b(oVar.f38752s.toByteArray());
                C13598b0 b0Var = C13598b0.f38549a;
                bundle.putByteArray("PARAM_FINDER_LIVE_PROMOTE_DATA", x512.toByteArray());
                bVar3.statusChange(bVar4, bundle);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveNoticeBubble$refreshView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.plugin.FinderLiveNoticeBubble$refreshView$4", mo125469f = "FinderLiveNoticeBubble.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: qj1.oc$e */
    public static final class C12577e extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public /* synthetic */ Object f36089d;

        /* renamed from: e */
        public final /* synthetic */ C12572oc f36090e;

        /* renamed from: f */
        public final /* synthetic */ C13695o f36091f;

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.plugin.FinderLiveNoticeBubble$refreshView$4$1", mo125469f = "FinderLiveNoticeBubble.kt", mo125470l = {194}, mo125471m = "invokeSuspend")
        /* renamed from: qj1.oc$e$a */
        public static final class C12578a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public int f36092d;

            /* renamed from: e */
            public final /* synthetic */ C12572oc f36093e;

            /* renamed from: f */
            public final /* synthetic */ C13695o f36094f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C12578a(C12572oc ocVar, C13695o oVar, C15601d<? super C12578a> dVar) {
                super(2, dVar);
                this.f36093e = ocVar;
                this.f36094f = oVar;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C12578a(this.f36093e, this.f36094f, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C12578a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f36092d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    long j = this.f36093e.f36079p;
                    this.f36092d = 1;
                    if (C53965x0.m60607b(j, this) == aVar) {
                        return aVar;
                    }
                } else if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                FinderLiveService.f159376d.getClass();
                C56032b bVar = FinderLiveService.f159379g;
                if (bVar != null) {
                    C58124b.C58125b bVar2 = C58124b.C58125b.FINDER_LIVE_PROMTE_DEL;
                    Bundle bundle = new Bundle();
                    C13695o oVar = this.f36094f;
                    C64822x51 x512 = new C64822x51();
                    x512.f186254d = 1;
                    x512.f186256f = new C89349b(oVar.f38752s.toByteArray());
                    x512.f186258h = oVar.f181291d;
                    C13598b0 b0Var = C13598b0.f38549a;
                    bundle.putByteArray("PARAM_FINDER_LIVE_PROMOTE_DATA", x512.toByteArray());
                    bVar.statusChange(bVar2, bundle);
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12577e(C12572oc ocVar, C13695o oVar, C15601d<? super C12577e> dVar) {
            super(2, dVar);
            this.f36090e = ocVar;
            this.f36091f = oVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C12577e eVar = new C12577e(this.f36090e, this.f36091f, dVar);
            eVar.f36089d = obj;
            return eVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C12577e) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            C0000n0 n0Var = (C0000n0) this.f36089d;
            C53973z1 z1Var = this.f36090e.f36080q;
            if (z1Var != null) {
                C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
            }
            C12572oc ocVar = this.f36090e;
            ocVar.f36080q = C53895h.m60466d(n0Var, (C66212f) null, (C53934p0) null, new C12578a(ocVar, this.f36091f, (C15601d<? super C12578a>) null), 3, (Object) null);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: qj1.oc$f */
    public static final class C12579f extends C87413o implements C32227p<Integer, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C12572oc f36095d;

        /* renamed from: e */
        public final /* synthetic */ C13695o f36096e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12579f(C12572oc ocVar, C13695o oVar) {
            super(2);
            this.f36095d = ocVar;
            this.f36096e = oVar;
        }

        /* renamed from: a */
        public static final void m12115a(C12572oc ocVar, C13695o oVar, String str, C49098d51 d512, int i) {
            C12572oc ocVar2 = ocVar;
            String str2 = str;
            C49098d51 d513 = d512;
            String str3 = ocVar2.f36075i;
            Log.m105924i(str3, "reserve notice, id:" + oVar.f38752s.f132122h + ", optype:" + i);
            C2816v vVar = C2816v.f14072a;
            String str4 = d513.f132122h;
            if (str4 == null) {
                str4 = "";
            }
            C49098d51 d = vVar.mo2915d(str2, str4);
            if (d != null) {
                d.f132119e = d513.f132119e;
            } else {
                String str5 = d513.f132122h;
                if (str5 != null) {
                    vVar.mo2912a(str2, str5, d513);
                }
            }
            String str6 = d513.f132122h;
            String str7 = str6 == null ? "" : str6;
            FinderObject finderObject = ((C54991o) ocVar2.f36071e.mo71262a(C54991o.class)).f154341n;
            C33558n2 n2Var = new C33558n2(str, str7, i, (C49712hj1) null, (String) null, 101, Long.valueOf(finderObject != null ? finderObject.f164794id : -1), 16, (C8480h) null);
            C86709a0.m107524d().mo123455a(6276, ocVar2.f36082s);
            C86709a0.m107524d().mo123460f(n2Var);
            d513.f132119e = d513.f132119e;
            ocVar.mo12181c(oVar);
        }

        /* renamed from: b */
        public static final void m12116b(C12572oc ocVar, C49098d51 d512, C13695o oVar, int i, String str) {
            C12572oc ocVar2 = ocVar;
            C49098d51 d513 = d512;
            C13695o oVar2 = oVar;
            C53973z1 z1Var = ocVar2.f36080q;
            String str2 = null;
            if (z1Var != null) {
                C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
            }
            d513.f132119e = 1;
            m12115a(ocVar2, oVar2, str, d513, 2);
            C7329b bVar = C7329b.f25441a;
            C45795b bVar2 = ocVar2.f36071e;
            String str3 = oVar2.f38752s.f132122h;
            if (str3 == null) {
                str3 = "";
            }
            String str4 = str3;
            C51559uk1 a = C7802g1.m7949a(d512);
            if (a != null) {
                str2 = a.f142894e;
            }
            C7329b.m7474c(bVar, bVar2, 3, 1, str4, 0, str2, i == 1 ? 1 : 0, 16, (Object) null);
            C76912y0.m92769h(ocVar2.f36076j.getContext(), ocVar2.f36076j.getContext().getString(C0966R.string.d2w), C0966R.raw.icons_filled_done);
        }

        public Object invoke(Object obj, Object obj2) {
            C60085d dVar;
            C60090e eVar;
            int intValue = ((Number) obj).intValue();
            int intValue2 = ((Number) obj2).intValue();
            Class cls = C54991o.class;
            C32226l<? super C63956k, C13598b0> lVar = this.f36095d.f36073g;
            if (lVar != null) {
                lVar.invoke(this.f36096e);
            }
            String str = null;
            if (((C54991o) this.f36095d.f36071e.mo71262a(cls)).mo75990Y3()) {
                C58124b bVar = this.f36095d.f36072f;
                C56032b bVar2 = bVar instanceof C56032b ? (C56032b) bVar : null;
                if (!(bVar2 == null || (dVar = (C60085d) bVar2.getPlugin(C60085d.class)) == null || (eVar = dVar.f171450r) == null)) {
                    eVar.mo84956b();
                }
            }
            C49098d51 d512 = this.f36096e.f38752s;
            String str2 = ((C54991o) this.f36095d.f36071e.mo71262a(cls)).f154345o;
            boolean z = true;
            if (intValue != -1) {
                d512.f132119e = 0;
                if (intValue == 1) {
                    m12115a(this.f36095d, this.f36096e, str2, d512, 1);
                    C7329b bVar3 = C7329b.f25441a;
                    C45795b bVar4 = this.f36095d.f36071e;
                    String str3 = this.f36096e.f38752s.f132122h;
                    String str4 = str3 == null ? "" : str3;
                    C51559uk1 a = C7802g1.m7949a(d512);
                    if (a != null) {
                        str = a.f142894e;
                    }
                    C7329b.m7474c(bVar3, bVar4, 2, 1, str4, 0, str, intValue2 == 1 ? 1 : 0, 16, (Object) null);
                }
                if (d512.f132127p != 1) {
                    z = false;
                }
                if (z) {
                    C12572oc ocVar = this.f36095d;
                    ocVar.getClass();
                    String str5 = d512.f132126o;
                    String str6 = str5 == null ? "" : str5;
                    String str7 = d512.f132122h;
                    C89059e i = new C46553z0(str6, (String) null, (byte[]) null, 0, 0, str7 == null ? "" : str7, 1, false, 158, (C8480h) null).mo9225i();
                    Context context = ocVar.f36076j.getContext();
                    C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                    i.mo11397F((MMActivity) context);
                    i.mo123420E(new C12555nc(ocVar, str2));
                }
            } else if (intValue2 != 0) {
                m12116b(this.f36095d, d512, this.f36096e, intValue2, str2);
            } else {
                C77407n nVar = new C77407n(this.f36095d.f36076j.getContext(), 1, true);
                C12572oc ocVar2 = this.f36095d;
                nVar.f225771i = new C12601pc(ocVar2);
                nVar.f225782p = new C12623qc(ocVar2, d512, this.f36096e, intValue2, str2);
                nVar.mo107573q();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: qj1.oc$g */
    public static final class C12580g extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C12572oc f36097d;

        /* renamed from: e */
        public final /* synthetic */ C51559uk1 f36098e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12580g(C12572oc ocVar, C51559uk1 uk12) {
            super(0);
            this.f36097d = ocVar;
            this.f36098e = uk12;
        }

        public Object invoke() {
            C12572oc ocVar = this.f36097d;
            C49098d51 d512 = ocVar.f36081r;
            if (d512 != null) {
                C12572oc.m12099a(ocVar, this.f36098e, d512);
            }
            return C13598b0.f38549a;
        }
    }

    public C12572oc(Context context, C45795b bVar, C58124b bVar2, C32226l<? super C63956k, C13598b0> lVar, C63956k kVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(bVar, "buContext");
        C87412m.m108594g(bVar2, "statusMonitor");
        this.f36070d = context;
        this.f36071e = bVar;
        this.f36072f = bVar2;
        this.f36073g = lVar;
        this.f36074h = kVar;
        View inflate = C85868k2.m106137b(context).inflate(C0966R.C0971layout.aij, (ViewGroup) null);
        C87412m.m108592e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) inflate;
        this.f36076j = viewGroup;
        View findViewById = viewGroup.findViewById(C0966R.C0970id.n2a);
        C87412m.m108593f(findViewById, "root.findViewById(R.id.mini_coupon_info)");
        this.f36077n = (NoticeCouponMiniInfoView) findViewById;
        View findViewById2 = this.f36076j.findViewById(C0966R.C0970id.dud);
        C87412m.m108593f(findViewById2, "root.findViewById(R.id.f…_live_notice_bubble_desc)");
        this.f36078o = (TextView) findViewById2;
        this.f36079p = FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION;
        this.f36082s = new C12573a(this);
    }

    /* renamed from: a */
    public static final void m12099a(C12572oc ocVar, C51559uk1 uk12, C49098d51 d512) {
        ocVar.getClass();
        C49359f1 f1Var = uk12.f142912z;
        boolean z = false;
        if (f1Var != null && (!C7776a.m7931a(f1Var))) {
            z = true;
        }
        if (z) {
            C54116w wVar = (C54116w) C86312j.m106911c(C54116w.class);
            String str = d512.f132122h;
            String str2 = uk12.f142894e;
            wVar.getClass();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("commerceAction", 1013);
            if (str == null) {
                str = "";
            }
            jSONObject.put("noticeid", str);
            if (str2 == null) {
                str2 = "";
            }
            jSONObject.put("coupon_id", str2);
            C54116w.Ex0(wVar, C54067f0.C54076o0.Commerce, String.valueOf(jSONObject), 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
        }
        C8479f0 f0Var = new C8479f0();
        f0Var.f27484d = C4077j3.f18208a.mo4972a(ocVar.f36070d, d512.f132121g, ((long) d512.f132118d) * 1000, uk12, new C12720vc(d512, uk12, ocVar, f0Var));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        if ((r2.length() > 0) == true) goto L_0x0028;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m12100b(qj1.C12572oc r28, com.tencent.p014mm.plugin.finder.view.notice.NoticeStatusView r29) {
        /*
            r0 = r28
            r28.getClass()
            fy3.a r1 = r29.getNoticeFuncRef()
            if (r1 == 0) goto L_0x00c5
            java.lang.Object r2 = r1.invoke()
            te3.d51 r2 = (te3.C49098d51) r2
            te3.cz r2 = r2.f132131t
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0027
            java.lang.String r2 = r2.f132034f
            if (r2 == 0) goto L_0x0027
            int r2 = r2.length()
            if (r2 <= 0) goto L_0x0023
            r2 = 1
            goto L_0x0024
        L_0x0023:
            r2 = 0
        L_0x0024:
            if (r2 != r3) goto L_0x0027
            goto L_0x0028
        L_0x0027:
            r3 = 0
        L_0x0028:
            java.lang.String r2 = ""
            if (r3 == 0) goto L_0x0084
            java.lang.Class<e00.x> r3 = e00.C7578x.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            java.lang.String r5 = "getService(IHalfScreenService::class.java)"
            gy3.C87412m.m108593f(r3, r5)
            r6 = r3
            e00.x r6 = (e00.C7578x) r6
            android.content.Context r7 = r0.f36070d
            java.lang.Object r0 = r1.invoke()
            te3.d51 r0 = (te3.C49098d51) r0
            te3.cz r0 = r0.f132131t
            if (r0 == 0) goto L_0x004d
            java.lang.String r0 = r0.f132034f
            if (r0 != 0) goto L_0x004b
            goto L_0x004d
        L_0x004b:
            r8 = r0
            goto L_0x004e
        L_0x004d:
            r8 = r2
        L_0x004e:
            r9 = 0
            com.tencent.mm.plugin.webview.ui.tools.widget.u r0 = new com.tencent.mm.plugin.webview.ui.tools.widget.u
            r10 = r0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 32767(0x7fff, float:4.5916E-41)
            r27 = 0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r0.f120219d = r4
            r1 = -1
            r0.f120220e = r1
            r0.f120228m = r4
            rx3.b0 r1 = rx3.C13598b0.f38549a
            r11 = 4
            com.tencent.mm.plugin.webview.ui.tools.widget.x r0 = e00.C7578x.C7579a.m7714a(r6, r7, r8, r9, r10, r11, r12)
            r0.show()
            goto L_0x00c5
        L_0x0084:
            hs1.e r3 = new hs1.e
            android.content.Context r4 = r0.f36070d
            r3.<init>(r4)
            java.lang.String r4 = r29.getUsername()
            qj1.xc r5 = new qj1.xc
            r6 = r29
            r5.<init>(r0, r1, r3, r6)
            r3.mo9570b(r4, r1, r5)
            dh1.b r6 = dh1.C7329b.f25441a
            fj1.b r7 = r0.f36071e
            r8 = 1
            r9 = 1
            java.lang.Object r0 = r1.invoke()
            te3.d51 r0 = (te3.C49098d51) r0
            java.lang.String r0 = r0.f132122h
            if (r0 != 0) goto L_0x00ab
            r10 = r2
            goto L_0x00ac
        L_0x00ab:
            r10 = r0
        L_0x00ac:
            r11 = 0
            java.lang.Object r0 = r1.invoke()
            te3.d51 r0 = (te3.C49098d51) r0
            te3.uk1 r0 = er1.C7802g1.m7949a(r0)
            if (r0 == 0) goto L_0x00bc
            java.lang.String r0 = r0.f142894e
            goto L_0x00bd
        L_0x00bc:
            r0 = 0
        L_0x00bd:
            r12 = r0
            r13 = 1
            r14 = 16
            r15 = 0
            dh1.C7329b.m7474c(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
        L_0x00c5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C12572oc.m12100b(qj1.oc, com.tencent.mm.plugin.finder.view.notice.NoticeStatusView):void");
    }

    /* renamed from: A */
    public void mo12174A(Bundle bundle, long j) {
    }

    /* renamed from: C */
    public void mo12175C(Object obj) {
        C87412m.m108594g(obj, "data");
        if (obj instanceof C13695o) {
            C13695o oVar = (C13695o) obj;
            mo12181c(oVar);
            View findViewById = this.f36076j.findViewById(C0966R.C0970id.nen);
            C87412m.m108593f(findViewById, "noticeStatusView");
            C49098d51 d512 = oVar.f38752s;
            Class cls = C61212e.class;
            ((C61212e) C86312j.m106911c(cls)).o30(findViewById, "live_reserve_room");
            ((C61212e) C86312j.m106911c(cls)).mo86175pO(findViewById, 8, 25653);
            ((C61212e) C86312j.m106911c(cls)).mo86175pO(findViewById, 32, 25652);
            ((C61212e) C86312j.m106911c(cls)).mo86149PM(findViewById, C90364q0.m113149h(C90364q0.m113147f(new C13604l("comment_scene", "temp_30"), new C13604l("live_notice_id", d512.f132122h)), C62042e.f176370a.mo87011I(this.f36071e)));
            ((C61212e) C86312j.m106911c(cls)).E60(findViewById, new C12662sc(d512));
            C23564m.m28138h(findViewById, new C12674tc(this, d512));
        }
    }

    /* renamed from: F */
    public void mo12176F(C32224a<C13598b0> aVar) {
        C62966ri.C12652b.m12153b(this, aVar);
    }

    /* renamed from: J */
    public C63956k mo12177J() {
        return this.f36074h;
    }

    /* renamed from: Q */
    public void mo12178Q() {
    }

    /* renamed from: V */
    public int mo12179V() {
        return C0966R.C0970id.f358111dh0;
    }

    /* renamed from: a0 */
    public int mo12180a0() {
        return C0966R.C0970id.fad;
    }

    /* renamed from: c */
    public final void mo12181c(C13695o oVar) {
        C13695o oVar2 = oVar;
        this.f36081r = oVar2.f38752s;
        TextView textView = (TextView) this.f36076j.findViewById(C0966R.C0970id.knx);
        C85875k4.m106189j0(textView.getPaint(), 0.8f);
        String str = oVar2.f38752s.f132121g;
        if (str == null || str.length() == 0) {
            textView.setText(this.f36070d.getString(C0966R.string.m6p, new Object[]{C58739j4.m68254u(C58739j4.f168176a, ((long) oVar2.f38752s.f132118d) * 1000, (Boolean) null, false, 2, (Object) null)}));
            this.f36078o.setVisibility(8);
        } else {
            textView.setText(oVar2.f38752s.f132121g);
            this.f36078o.setText(this.f36070d.getString(C0966R.string.m6p, new Object[]{C58739j4.m68254u(C58739j4.f168176a, ((long) oVar2.f38752s.f132118d) * 1000, (Boolean) null, false, 2, (Object) null)}));
            this.f36078o.setVisibility(0);
        }
        mo12182d();
        NoticeStatusView noticeStatusView = (NoticeStatusView) this.f36076j.findViewById(C0966R.C0970id.nen);
        noticeStatusView.mo5009f(((C54991o) this.f36071e.mo71262a(C54991o.class)).f154345o, new C12574b(oVar2));
        this.f36076j.setOnClickListener(new C12575c(this, noticeStatusView));
        View findViewById = this.f36076j.findViewById(C0966R.C0970id.f358111dh0);
        C87412m.m108593f(findViewById, "closeBtn");
        String str2 = oVar2.f38752s.f132122h;
        if (str2 == null) {
            str2 = "";
        }
        Class cls = C61212e.class;
        ((C61212e) C86312j.m106911c(cls)).o30(findViewById, "live_reserve_room");
        ((C61212e) C86312j.m106911c(cls)).mo86175pO(findViewById, 8, 25653);
        Map f = C90364q0.m113147f(new C13604l("comment_scene", "temp_30"), new C13604l("live_notice_id", str2));
        C62042e eVar = C62042e.f176370a;
        ((C61212e) C86312j.m106911c(cls)).mo86149PM(findViewById, C90364q0.m113149h(f, eVar.mo87011I(this.f36071e)));
        ((C61212e) C86312j.m106911c(cls)).E60(findViewById, C12647rc.f36234a);
        if (eVar.mo87032P0(this.f36071e)) {
            noticeStatusView.setVisibility(8);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(4);
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveNoticeBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromoteLiveNoticeItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveNoticeBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromoteLiveNoticeItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        noticeStatusView.setVisibility(0);
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(0);
        View view2 = findViewById;
        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveNoticeBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromoteLiveNoticeItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveNoticeBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromoteLiveNoticeItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setOnClickListener(new C12576d(this, oVar2));
        if (oVar2.f38752s.f132119e == 0) {
            C55908a aVar3 = this.f36071e.f123702i;
            C53896h0 h0Var = C53872d1.f151117a;
            C53895h.m60466d(aVar3, C58901s.f168555a, (C53934p0) null, new C12577e(this, oVar2, (C15601d<? super C12577e>) null), 2, (Object) null);
        }
        noticeStatusView.setProgressDoneAndNextAction(new C12579f(this, oVar2));
    }

    /* renamed from: d */
    public final void mo12182d() {
        C13598b0 b0Var;
        C51559uk1 a;
        C49098d51 d512 = this.f36081r;
        if (d512 == null || (a = C7802g1.m7949a(d512)) == null) {
            b0Var = null;
        } else {
            NoticeCouponMiniInfoView noticeCouponMiniInfoView = this.f36077n;
            C49098d51 d513 = this.f36081r;
            NoticeCouponMiniInfoView.m4339a(noticeCouponMiniInfoView, d513 != null ? C7802g1.m7950b(d513) : true, a, false, false, true, new C12580g(this, a), 12, (Object) null);
            this.f36078o.setVisibility(8);
            b0Var = C13598b0.f38549a;
        }
        if (b0Var == null) {
            this.f36077n.setVisibility(8);
            this.f36078o.setVisibility(0);
        }
    }

    /* renamed from: e */
    public void mo12183e(Bundle bundle, Object obj, long j) {
    }

    /* renamed from: f */
    public Rect mo12184f(View view) {
        return C62966ri.C12652b.m12152a(this, view);
    }

    public View getView() {
        return this.f36076j;
    }

    /* renamed from: k */
    public void mo12186k() {
        C62966ri.C12652b.m12154c(this);
    }

    public void onPause() {
    }

    public void onResume() {
    }

    /* renamed from: t */
    public void mo12189t(Object obj) {
        C87412m.m108594g(obj, "data");
        if (obj instanceof C13695o) {
            mo12181c((C13695o) obj);
        }
    }

    /* renamed from: w */
    public void mo12190w() {
        C86709a0.m107524d().mo123470p(6276, this.f36082s);
    }
}
