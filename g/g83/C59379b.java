package g83;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53934p0;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.JavascriptInterface;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C39818r;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.plugin.appbrand.jsapi.finder.C55511i;
import com.tencent.p014mm.plugin.secdata.p843ui.MMSecDataActivity;
import com.tencent.p014mm.plugin.websearch.webview.BaseWebSearchWebView;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.util.WXWebReporter;
import d14.C45252f;
import d14.C45253g;
import d62.C75339i;
import di3.C7335d;
import di3.C86312j;
import eb0.C75592q0;
import f14.C58901s;
import f40.C86709a0;
import f40.C86718e;
import f62.C75700k0;
import fy3.C32224a;
import fy3.C32227p;
import fy3.C32228q;
import fy3.C32229r;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import ht1.C60216z4;
import ht1.C8764e5;
import ke3.C88144b;
import kj2.C117407d;
import kotlin.Result;
import kotlin.ResultKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p565ir.C60606n;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C48884bn2;
import te3.C50397mg0;
import te3.C51593us3;
import u73.C101987v0;
import u73.C52456b0;
import u73.C52459d0;
import u73.C52464j0;
import wb2.C65946a;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;
import z73.C53759a;
import z73.C53760c;
import z73.C53761n;

/* renamed from: g83.b */
public class C59379b<T> extends C53760c {

    /* renamed from: b */
    public static final C13601g<MultiProcessMMKV> f169715b = C36568h.m40985a(C8247a.f27176d);

    /* renamed from: g83.b$a */
    public static final class C8247a extends C87413o implements C32224a<MultiProcessMMKV> {

        /* renamed from: d */
        public static final C8247a f27176d = new C8247a();

        public C8247a() {
            super(0);
        }

        public Object invoke() {
            return MultiProcessMMKV.getMMKV(C86718e.m107549h() + "_WebSearch");
        }
    }

    /* renamed from: g83.b$b */
    public static final class C59380b {
        public C59380b(C8480h hVar) {
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.websearch.webview.BaseWebSearchJSApi$getFinderItemDetail$2$1", mo125469f = "BaseWebSearchJSApi.kt", mo125470l = {267}, mo125471m = "invokeSuspend")
    /* renamed from: g83.b$c */
    public static final class C59381c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f169716d;

        /* renamed from: e */
        public final /* synthetic */ Context f169717e;

        /* renamed from: f */
        public final /* synthetic */ JSONObject f169718f;

        /* renamed from: g */
        public final /* synthetic */ LifecycleScope f169719g;

        /* renamed from: h */
        public final /* synthetic */ C59379b<T> f169720h;

        /* renamed from: g83.b$c$a */
        public static final class C59382a<T> implements C45253g {

            /* renamed from: d */
            public final /* synthetic */ LifecycleScope f169721d;

            /* renamed from: e */
            public final /* synthetic */ C59379b<T> f169722e;

            public C59382a(LifecycleScope lifecycleScope, C59379b<T> bVar) {
                this.f169721d = lifecycleScope;
                this.f169722e = bVar;
            }

            public Object emit(Object obj, C15601d dVar) {
                LifecycleScope lifecycleScope = this.f169721d;
                C53896h0 h0Var = C53872d1.f151117a;
                C53895h.m60466d(lifecycleScope, C58901s.f168555a, (C53934p0) null, new C59385c(this.f169722e, (String) obj, (C15601d<? super C59385c>) null), 2, (Object) null);
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59381c(Context context, JSONObject jSONObject, LifecycleScope lifecycleScope, C59379b<T> bVar, C15601d<? super C59381c> dVar) {
            super(2, dVar);
            this.f169717e = context;
            this.f169718f = jSONObject;
            this.f169719g = lifecycleScope;
            this.f169720h = bVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C59381c(this.f169717e, this.f169718f, this.f169719g, this.f169720h, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C59381c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f169716d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C45252f<String> xj02 = ((C8764e5) C86312j.m106911c(C8764e5.class)).xj0(this.f169717e, this.f169718f);
                C59382a aVar2 = new C59382a(this.f169719g, this.f169720h);
                this.f169716d = 1;
                if (xj02.mo31880a(aVar2, this) == aVar) {
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

    /* renamed from: g83.b$d */
    public static final class C59383d extends C87413o implements C32229r<Integer, Integer, String, C50397mg0, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ String f169723d;

        /* renamed from: e */
        public final /* synthetic */ C59379b<T> f169724e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59383d(String str, C59379b<T> bVar) {
            super(4);
            this.f169723d = str;
            this.f169724e = bVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v2, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v3, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v4, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v7, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: java.lang.String} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0068 A[Catch:{ Exception -> 0x0135 }] */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x00bd A[SYNTHETIC, Splitter:B:50:0x00bd] */
        /* JADX WARNING: Removed duplicated region for block: B:93:0x013a A[Catch:{ Exception -> 0x0217 }] */
        /* renamed from: I */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object mo162I(java.lang.Object r18, java.lang.Object r19, java.lang.Object r20, java.lang.Object r21) {
            /*
                r17 = this;
                r1 = r17
                r0 = r18
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                r2 = r19
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                r3 = r20
                java.lang.String r3 = (java.lang.String) r3
                r4 = r21
                te3.mg0 r4 = (te3.C50397mg0) r4
                java.lang.String r5 = "errMsg"
                gy3.C87412m.m108594g(r3, r5)
                java.lang.String r3 = "Invalid input parameters:"
                java.lang.String r5 = "returnObj.toString()"
                java.lang.String r6 = "onGetFinderLivePreviewMicCover"
                java.lang.String r7 = "requestId"
                java.lang.String r8 = "err_msg"
                java.lang.String r9 = "ret"
                java.lang.String r10 = ""
                if (r0 != 0) goto L_0x01ca
                if (r2 != 0) goto L_0x01ca
                org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x0135 }
                r0.<init>()     // Catch:{ Exception -> 0x0135 }
                org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ Exception -> 0x0135 }
                r2.<init>()     // Catch:{ Exception -> 0x0135 }
                r12 = 0
                if (r4 == 0) goto L_0x0041
                java.util.LinkedList<te3.ue1> r4 = r4.f138011d     // Catch:{ Exception -> 0x0135 }
                goto L_0x0042
            L_0x0041:
                r4 = r12
            L_0x0042:
                if (r4 == 0) goto L_0x0057
                java.lang.Object r13 = sx3.C110818d0.m150916N(r4)     // Catch:{ Exception -> 0x0135 }
                te3.ue1 r13 = (te3.C51533ue1) r13     // Catch:{ Exception -> 0x0135 }
                if (r13 == 0) goto L_0x0057
                te3.c21 r13 = r13.f142798e     // Catch:{ Exception -> 0x0135 }
                if (r13 == 0) goto L_0x0057
                te3.m31 r13 = r13.f182365K     // Catch:{ Exception -> 0x0135 }
                if (r13 == 0) goto L_0x0057
                java.util.LinkedList<te3.l31> r13 = r13.f137806j     // Catch:{ Exception -> 0x0135 }
                goto L_0x0058
            L_0x0057:
                r13 = r12
            L_0x0058:
                r14 = 1
                r15 = 0
                if (r13 == 0) goto L_0x0065
                boolean r13 = r13.isEmpty()     // Catch:{ Exception -> 0x0135 }
                if (r13 == 0) goto L_0x0063
                goto L_0x0065
            L_0x0063:
                r13 = 0
                goto L_0x0066
            L_0x0065:
                r13 = 1
            L_0x0066:
                if (r13 == 0) goto L_0x0095
                if (r4 == 0) goto L_0x007d
                java.lang.Object r13 = sx3.C110818d0.m150916N(r4)     // Catch:{ Exception -> 0x0135 }
                te3.ue1 r13 = (te3.C51533ue1) r13     // Catch:{ Exception -> 0x0135 }
                if (r13 == 0) goto L_0x007d
                te3.c21 r13 = r13.f142798e     // Catch:{ Exception -> 0x0135 }
                if (r13 == 0) goto L_0x007d
                te3.m31 r13 = r13.f182365K     // Catch:{ Exception -> 0x0135 }
                if (r13 == 0) goto L_0x007d
                te3.o31 r13 = r13.f137807n     // Catch:{ Exception -> 0x0135 }
                goto L_0x007e
            L_0x007d:
                r13 = r12
            L_0x007e:
                if (r13 != 0) goto L_0x0095
                java.lang.Integer r2 = java.lang.Integer.valueOf(r15)     // Catch:{ Exception -> 0x0135 }
                r0.putOpt(r9, r2)     // Catch:{ Exception -> 0x0135 }
                java.lang.String r2 = "live mic info is empty!"
                r0.putOpt(r8, r2)     // Catch:{ Exception -> 0x0135 }
                java.lang.String r2 = r1.f169723d     // Catch:{ Exception -> 0x0135 }
                r0.putOpt(r7, r2)     // Catch:{ Exception -> 0x0135 }
                r20 = r3
                goto L_0x01ab
            L_0x0095:
                if (r4 == 0) goto L_0x00a9
                java.lang.Object r13 = sx3.C110818d0.m150916N(r4)     // Catch:{ Exception -> 0x0135 }
                te3.ue1 r13 = (te3.C51533ue1) r13     // Catch:{ Exception -> 0x0135 }
                if (r13 == 0) goto L_0x00a9
                te3.c21 r13 = r13.f142798e     // Catch:{ Exception -> 0x0135 }
                if (r13 == 0) goto L_0x00a9
                te3.m31 r13 = r13.f182365K     // Catch:{ Exception -> 0x0135 }
                if (r13 == 0) goto L_0x00a9
                java.util.LinkedList<te3.l31> r12 = r13.f137806j     // Catch:{ Exception -> 0x0135 }
            L_0x00a9:
                if (r12 == 0) goto L_0x00b3
                boolean r12 = r12.isEmpty()     // Catch:{ Exception -> 0x0135 }
                if (r12 == 0) goto L_0x00b2
                goto L_0x00b3
            L_0x00b2:
                r14 = 0
            L_0x00b3:
                java.lang.String r12 = "mictype"
                java.lang.String r13 = "nickname"
                java.lang.String r11 = "micInfos"
                java.lang.String r15 = "headurl"
                if (r14 == 0) goto L_0x013a
                c30.d r14 = new c30.d     // Catch:{ Exception -> 0x0135 }
                r14.<init>()     // Catch:{ Exception -> 0x0135 }
                if (r4 == 0) goto L_0x00e9
                java.lang.Object r16 = sx3.C110818d0.m150916N(r4)     // Catch:{ Exception -> 0x0135 }
                r20 = r3
                r3 = r16
                te3.ue1 r3 = (te3.C51533ue1) r3     // Catch:{ Exception -> 0x0217 }
                if (r3 == 0) goto L_0x00eb
                te3.c21 r3 = r3.f142798e     // Catch:{ Exception -> 0x0217 }
                if (r3 == 0) goto L_0x00eb
                te3.m31 r3 = r3.f182365K     // Catch:{ Exception -> 0x0217 }
                if (r3 == 0) goto L_0x00eb
                te3.o31 r3 = r3.f137807n     // Catch:{ Exception -> 0x0217 }
                if (r3 == 0) goto L_0x00eb
                te3.hx0 r3 = r3.f138925g     // Catch:{ Exception -> 0x0217 }
                if (r3 == 0) goto L_0x00eb
                com.tencent.mm.protocal.protobuf.FinderContact r3 = r3.f134919d     // Catch:{ Exception -> 0x0217 }
                if (r3 == 0) goto L_0x00eb
                java.lang.String r3 = r3.headUrl     // Catch:{ Exception -> 0x0217 }
                if (r3 != 0) goto L_0x00ec
                goto L_0x00eb
            L_0x00e9:
                r20 = r3
            L_0x00eb:
                r3 = r10
            L_0x00ec:
                r14.mo110094b(r15, r3)     // Catch:{ Exception -> 0x0217 }
                if (r4 == 0) goto L_0x0111
                java.lang.Object r3 = sx3.C110818d0.m150916N(r4)     // Catch:{ Exception -> 0x0217 }
                te3.ue1 r3 = (te3.C51533ue1) r3     // Catch:{ Exception -> 0x0217 }
                if (r3 == 0) goto L_0x0111
                te3.c21 r3 = r3.f142798e     // Catch:{ Exception -> 0x0217 }
                if (r3 == 0) goto L_0x0111
                te3.m31 r3 = r3.f182365K     // Catch:{ Exception -> 0x0217 }
                if (r3 == 0) goto L_0x0111
                te3.o31 r3 = r3.f137807n     // Catch:{ Exception -> 0x0217 }
                if (r3 == 0) goto L_0x0111
                te3.hx0 r3 = r3.f138925g     // Catch:{ Exception -> 0x0217 }
                if (r3 == 0) goto L_0x0111
                com.tencent.mm.protocal.protobuf.FinderContact r3 = r3.f134919d     // Catch:{ Exception -> 0x0217 }
                if (r3 == 0) goto L_0x0111
                java.lang.String r3 = r3.nickname     // Catch:{ Exception -> 0x0217 }
                if (r3 != 0) goto L_0x0112
            L_0x0111:
                r3 = r10
            L_0x0112:
                r14.mo110094b(r13, r3)     // Catch:{ Exception -> 0x0217 }
                r3 = 2
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x0217 }
                r14.mo110094b(r12, r3)     // Catch:{ Exception -> 0x0217 }
                r2.put(r14)     // Catch:{ Exception -> 0x0217 }
                r0.putOpt(r11, r2)     // Catch:{ Exception -> 0x0217 }
                r2 = 0
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x0217 }
                r0.putOpt(r9, r2)     // Catch:{ Exception -> 0x0217 }
                r0.putOpt(r8, r10)     // Catch:{ Exception -> 0x0217 }
                java.lang.String r2 = r1.f169723d     // Catch:{ Exception -> 0x0217 }
                r0.putOpt(r7, r2)     // Catch:{ Exception -> 0x0217 }
                goto L_0x01ab
            L_0x0135:
                r0 = move-exception
                r20 = r3
                goto L_0x01c7
            L_0x013a:
                r20 = r3
                if (r4 == 0) goto L_0x0198
                java.lang.Object r3 = sx3.C110818d0.m150916N(r4)     // Catch:{ Exception -> 0x0217 }
                te3.ue1 r3 = (te3.C51533ue1) r3     // Catch:{ Exception -> 0x0217 }
                if (r3 == 0) goto L_0x0198
                te3.c21 r3 = r3.f142798e     // Catch:{ Exception -> 0x0217 }
                if (r3 == 0) goto L_0x0198
                te3.m31 r3 = r3.f182365K     // Catch:{ Exception -> 0x0217 }
                if (r3 == 0) goto L_0x0198
                java.util.LinkedList<te3.l31> r3 = r3.f137806j     // Catch:{ Exception -> 0x0217 }
                if (r3 == 0) goto L_0x0198
                java.util.Iterator r3 = r3.iterator()     // Catch:{ Exception -> 0x0217 }
            L_0x0156:
                boolean r4 = r3.hasNext()     // Catch:{ Exception -> 0x0217 }
                if (r4 == 0) goto L_0x0198
                java.lang.Object r4 = r3.next()     // Catch:{ Exception -> 0x0217 }
                te3.l31 r4 = (te3.C50209l31) r4     // Catch:{ Exception -> 0x0217 }
                c30.d r14 = new c30.d     // Catch:{ Exception -> 0x0217 }
                r14.<init>()     // Catch:{ Exception -> 0x0217 }
                r21 = r3
                te3.hx0 r3 = r4.f137145d     // Catch:{ Exception -> 0x0217 }
                if (r3 == 0) goto L_0x0175
                com.tencent.mm.protocal.protobuf.FinderContact r3 = r3.f134919d     // Catch:{ Exception -> 0x0217 }
                if (r3 == 0) goto L_0x0175
                java.lang.String r3 = r3.headUrl     // Catch:{ Exception -> 0x0217 }
                if (r3 != 0) goto L_0x0176
            L_0x0175:
                r3 = r10
            L_0x0176:
                r14.mo110094b(r15, r3)     // Catch:{ Exception -> 0x0217 }
                te3.hx0 r3 = r4.f137145d     // Catch:{ Exception -> 0x0217 }
                if (r3 == 0) goto L_0x0185
                com.tencent.mm.protocal.protobuf.FinderContact r3 = r3.f134919d     // Catch:{ Exception -> 0x0217 }
                if (r3 == 0) goto L_0x0185
                java.lang.String r3 = r3.nickname     // Catch:{ Exception -> 0x0217 }
                if (r3 != 0) goto L_0x0186
            L_0x0185:
                r3 = r10
            L_0x0186:
                r14.mo110094b(r13, r3)     // Catch:{ Exception -> 0x0217 }
                int r3 = r4.f137146e     // Catch:{ Exception -> 0x0217 }
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x0217 }
                r14.mo110094b(r12, r3)     // Catch:{ Exception -> 0x0217 }
                r2.put(r14)     // Catch:{ Exception -> 0x0217 }
                r3 = r21
                goto L_0x0156
            L_0x0198:
                r0.putOpt(r11, r2)     // Catch:{ Exception -> 0x0217 }
                r2 = 0
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x0217 }
                r0.putOpt(r9, r2)     // Catch:{ Exception -> 0x0217 }
                r0.putOpt(r8, r10)     // Catch:{ Exception -> 0x0217 }
                java.lang.String r2 = r1.f169723d     // Catch:{ Exception -> 0x0217 }
                r0.putOpt(r7, r2)     // Catch:{ Exception -> 0x0217 }
            L_0x01ab:
                g83.b<T> r2 = r1.f169724e     // Catch:{ Exception -> 0x0217 }
                g83.f r2 = r2.mo84482g()     // Catch:{ Exception -> 0x0217 }
                if (r2 == 0) goto L_0x0273
                com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView r2 = r2.getWebView()     // Catch:{ Exception -> 0x0217 }
                if (r2 == 0) goto L_0x0273
                z73.n r3 = z73.C53761n.f150905a     // Catch:{ Exception -> 0x0217 }
                java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0217 }
                gy3.C87412m.m108593f(r0, r5)     // Catch:{ Exception -> 0x0217 }
                r3.mo74349a(r2, r6, r0)     // Catch:{ Exception -> 0x0217 }
                goto L_0x0273
            L_0x01c7:
                r11 = r20
                goto L_0x0219
            L_0x01ca:
                r20 = r3
                org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x0217 }
                r3.<init>()     // Catch:{ Exception -> 0x0217 }
                r4 = -1
                java.lang.Integer r11 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x0217 }
                r3.putOpt(r9, r11)     // Catch:{ Exception -> 0x0217 }
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0217 }
                r4.<init>()     // Catch:{ Exception -> 0x0217 }
                r11 = r20
                r4.append(r11)     // Catch:{ Exception -> 0x0215 }
                r4.append(r0)     // Catch:{ Exception -> 0x0215 }
                java.lang.String r0 = ", "
                r4.append(r0)     // Catch:{ Exception -> 0x0215 }
                r4.append(r2)     // Catch:{ Exception -> 0x0215 }
                java.lang.String r0 = r4.toString()     // Catch:{ Exception -> 0x0215 }
                r3.putOpt(r8, r0)     // Catch:{ Exception -> 0x0215 }
                java.lang.String r0 = r1.f169723d     // Catch:{ Exception -> 0x0215 }
                r3.putOpt(r7, r0)     // Catch:{ Exception -> 0x0215 }
                g83.b<T> r0 = r1.f169724e     // Catch:{ Exception -> 0x0215 }
                g83.f r0 = r0.mo84482g()     // Catch:{ Exception -> 0x0215 }
                if (r0 == 0) goto L_0x0273
                com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView r0 = r0.getWebView()     // Catch:{ Exception -> 0x0215 }
                if (r0 == 0) goto L_0x0273
                z73.n r2 = z73.C53761n.f150905a     // Catch:{ Exception -> 0x0215 }
                java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0215 }
                gy3.C87412m.m108593f(r3, r5)     // Catch:{ Exception -> 0x0215 }
                r2.mo74349a(r0, r6, r3)     // Catch:{ Exception -> 0x0215 }
                goto L_0x0273
            L_0x0215:
                r0 = move-exception
                goto L_0x0219
            L_0x0217:
                r0 = move-exception
                goto L_0x01c7
            L_0x0219:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "getFinderLivePreviewMicCover ex:"
                r2.append(r3)
                java.lang.String r3 = r0.getMessage()
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                java.lang.String r3 = "MicroMsg.WebSearch.BaseWebSearchJSApi"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r2)
                org.json.JSONObject r2 = new org.json.JSONObject
                r2.<init>()
                r3 = -1
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r2.putOpt(r9, r3)
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r11)
                java.lang.String r0 = r0.getMessage()
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                r2.putOpt(r8, r0)
                r2.putOpt(r7, r10)
                g83.b<T> r0 = r1.f169724e
                g83.f r0 = r0.mo84482g()
                if (r0 == 0) goto L_0x0273
                com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView r0 = r0.getWebView()
                if (r0 == 0) goto L_0x0273
                z73.n r3 = z73.C53761n.f150905a
                java.lang.String r2 = r2.toString()
                gy3.C87412m.m108593f(r2, r5)
                r3.mo74349a(r0, r6, r2)
            L_0x0273:
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: g83.C59379b.C59383d.mo162I(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: g83.b$e */
    public static final class C59384e extends C87413o implements C32228q<String, String, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ String f169725d;

        /* renamed from: e */
        public final /* synthetic */ C59379b<T> f169726e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59384e(String str, C59379b<T> bVar) {
            super(3);
            this.f169725d = str;
            this.f169726e = bVar;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            BaseWebSearchWebView webView;
            String str = (String) obj;
            String str2 = (String) obj2;
            int intValue = ((Number) obj3).intValue();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("ret", Integer.valueOf(intValue));
                jSONObject.putOpt("url", str);
                jSONObject.putOpt("requestId", this.f169725d);
            } catch (JSONException e) {
                Log.m105928w("MicroMsg.WebSearch.BaseWebSearchJSApi", "getFinderLivePreviewUrl " + e.getMessage());
            }
            C59386f<T> g = this.f169726e.mo84482g();
            if (!(g == null || (webView = g.getWebView()) == null)) {
                C53761n nVar = C53761n.f150905a;
                String jSONObject2 = jSONObject.toString();
                C87412m.m108593f(jSONObject2, "returnObj.toString()");
                nVar.mo74349a(webView, "onGetFinderLivePreviewUrl", jSONObject2);
            }
            return C13598b0.f38549a;
        }
    }

    static {
        new C59380b((C8480h) null);
    }

    public C59379b() {
        super((C53759a) null);
    }

    /* renamed from: b */
    public MultiProcessMMKV mo73423b() {
        MultiProcessMMKV multiProcessMMKV = (MultiProcessMMKV) ((C36570n) f169715b).getValue();
        C87412m.m108593f(multiProcessMMKV, "webSearchMMKV");
        return multiProcessMMKV;
    }

    /* renamed from: c */
    public boolean mo73424c() {
        return AppForegroundDelegate.INSTANCE.f343454n;
    }

    /* renamed from: f */
    public boolean mo84481f(String str) {
        if (str == null || str.length() == 0) {
            Log.m105920e("MicroMsg.WebSearch.BaseWebSearchJSApi", "doProfile fail, username is null");
            return false;
        }
        Intent intent = new Intent();
        intent.putExtra("Contact_User", str);
        intent.putExtra("Contact_Scene", WXWebReporter.WXWEB_IDKEY_X5WEBVIEW_ONSHOWCUSTOMVIEW_SPECIAL_NATIVE);
        intent.putExtra("force_get_contact", true);
        intent.putExtra("key_use_new_contact_profile", true);
        C59386f g = mo84482g();
        C88144b.m109791i(g != null ? g.mo24908k0() : null, Scopes.PROFILE, ".ui.ContactInfoUI", intent, (Bundle) null);
        return true;
    }

    /* renamed from: g */
    public final C59386f<T> mo84482g() {
        C53759a aVar = this.f150904a;
        if (aVar instanceof C59386f) {
            return (C59386f) aVar;
        }
        return null;
    }

    @JavascriptInterface
    public String getCurrentLocation(String str) {
        BaseWebSearchWebView webView;
        BaseWebSearchWebView webView2;
        C48884bn2 g = C101987v0.m134273g();
        if (g != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("latitude", Float.valueOf(g.f131220e));
            jSONObject.put("longitude", Float.valueOf(g.f131219d));
            jSONObject.put("precision", g.f131221f);
            jSONObject.put("macAddr", g.f131222g);
            jSONObject.put("cellId", g.f131223h);
            jSONObject.put("gpsSource", g.f131224i);
            jSONObject.put("address", g.f131225j);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("json", jSONObject.toString());
            C59386f g2 = mo84482g();
            if (!(g2 == null || (webView2 = g2.getWebView()) == null)) {
                C53761n nVar = C53761n.f150905a;
                String jSONObject3 = jSONObject2.toString();
                C87412m.m108593f(jSONObject3, "returnObj.toString()");
                nVar.mo74349a(webView2, "onCurrentLocationReady", jSONObject3);
            }
            return mo74341e().toString();
        }
        C59386f g3 = mo84482g();
        if (!(g3 == null || (webView = g3.getWebView()) == null)) {
            C53761n nVar2 = C53761n.f150905a;
            String jSONObject4 = mo74340d().toString();
            C87412m.m108593f(jSONObject4, "returnFail().toString()");
            nVar2.mo74349a(webView, "onCurrentLocationReady", jSONObject4);
        }
        return mo74340d().toString();
    }

    @JavascriptInterface
    public String getCurrentUsername(String str) {
        if (!C86709a0.m107522a()) {
            return mo74340d().put("error", "not login").toString();
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("ret", 0);
        jSONObject.put("username", C75592q0.m90789s());
        return jSONObject.toString();
    }

    @JavascriptInterface
    public String getFinderItemDetail(String str) {
        JSONObject jSONObject;
        Object obj;
        C59386f g = mo84482g();
        AppCompatActivity k0 = g != null ? g.mo24908k0() : null;
        if (str != null) {
            try {
                Result.Companion companion = Result.Companion;
                obj = Result.m168114constructorimpl(new JSONObject(str));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.m168114constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m168120isFailureimpl(obj)) {
                obj = null;
            }
            jSONObject = (JSONObject) obj;
        } else {
            jSONObject = null;
        }
        if (k0 == null || jSONObject == null) {
            return mo74340d().toString();
        }
        if (!(k0 instanceof MMSecDataActivity)) {
            return mo74340d().toString();
        }
        LifecycleScope c3 = ((C65946a) C39818r.f106831a.mo62444c(k0).mo75002a(C65946a.class)).mo89983c3();
        LifecycleScope.launchDefault$default(c3, (C53934p0) null, new C59381c(k0, jSONObject, c3, this, (C15601d<? super C59381c>) null), 1, (Object) null);
        return mo74341e().toString();
    }

    @JavascriptInterface
    public final String getFinderLivePreviewMicCover(String str) {
        BaseWebSearchWebView webView;
        try {
            JSONObject jSONObject = new JSONObject(str);
            Log.m105924i("MicroMsg.WebSearch.BaseWebSearchJSApi", "getFinderLivePreviewMicCover " + jSONObject);
            String optString = jSONObject.optString("encryptedId");
            if (optString == null) {
                optString = "";
            }
            String optString2 = jSONObject.optString("nonceId");
            if (optString2 == null) {
                optString2 = "";
            }
            String optString3 = jSONObject.optString("requestId");
            jSONObject.optInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
            C60606n nVar = (C60606n) C86312j.m106911c(C60606n.class);
            C59386f g = mo84482g();
            nVar.Lm0(optString, optString2, g != null ? g.mo24908k0() : null, new C59383d(optString3, this));
            return mo74341e().toString();
        } catch (Exception e) {
            Log.m105920e("MicroMsg.WebSearch.BaseWebSearchJSApi", "getFinderLivePreviewMicCover ex:" + e.getMessage());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt("ret", -1);
            jSONObject2.putOpt("err_msg", "Invalid input parameters:" + e.getMessage());
            jSONObject2.putOpt("requestId", "");
            C59386f g2 = mo84482g();
            if (!(g2 == null || (webView = g2.getWebView()) == null)) {
                C53761n nVar2 = C53761n.f150905a;
                String jSONObject3 = jSONObject2.toString();
                C87412m.m108593f(jSONObject3, "returnObj.toString()");
                nVar2.mo74349a(webView, "onGetFinderLivePreviewMicCover", jSONObject3);
            }
            return mo74341e().toString();
        }
    }

    @JavascriptInterface
    public String getFinderLivePreviewUrl(String str) {
        BaseWebSearchWebView webView;
        BaseWebSearchWebView webView2;
        try {
            JSONObject jSONObject = new JSONObject(str);
            Log.m105924i("MicroMsg.WebSearch.BaseWebSearchJSApi", "getFinderLivePreviewUrl " + jSONObject);
            String optString = jSONObject.optString("encryptedId");
            String optString2 = jSONObject.optString("nonceId");
            String optString3 = jSONObject.optString("requestId");
            int optInt = jSONObject.optInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
            if (optInt == 0) {
                optInt = 114;
            }
            try {
                ((C60606n) C86312j.m106911c(C60606n.class)).mo85012JC(optString, optString2, optInt, new C59384e(optString3, this));
            } catch (Exception e) {
                Log.m105928w("MicroMsg.WebSearch.BaseWebSearchJSApi", "GetFinderLivePreviewUrl exception:" + e.getMessage());
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putOpt("ret", -1);
                jSONObject2.putOpt("url", "");
                jSONObject2.putOpt("requestId", optString3);
                C59386f g = mo84482g();
                if (!(g == null || (webView2 = g.getWebView()) == null)) {
                    C53761n nVar = C53761n.f150905a;
                    String jSONObject3 = jSONObject2.toString();
                    C87412m.m108593f(jSONObject3, "returnObj.toString()");
                    nVar.mo74349a(webView2, "onGetFinderLivePreviewUrl", jSONObject3);
                }
            }
            return mo74341e().toString();
        } catch (Exception unused) {
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.putOpt("ret", -1);
            jSONObject4.putOpt("url", "");
            jSONObject4.putOpt("requestId", "");
            C59386f g2 = mo84482g();
            if (!(g2 == null || (webView = g2.getWebView()) == null)) {
                C53761n nVar2 = C53761n.f150905a;
                String jSONObject5 = jSONObject4.toString();
                C87412m.m108593f(jSONObject5, "returnObj.toString()");
                nVar2.mo74349a(webView, "onGetFinderLivePreviewUrl", jSONObject5);
            }
            return mo74340d().toString();
        }
    }

    @JavascriptInterface
    public final String getKeyboardHeight(String str) {
        JSONObject e = mo74341e();
        C59386f g = mo84482g();
        e.put("height", g != null ? g.mo24915v5() : 0);
        String jSONObject = e.toString();
        C87412m.m108593f(jSONObject, "returnSuccess().also { i…ight() ?: 0) }.toString()");
        return jSONObject;
    }

    @JavascriptInterface
    public String getNetworkType(String str) {
        Log.m105925i("MicroMsg.WebSearch.BaseWebSearchJSApi", "getNetworkType %s", str);
        try {
            JSONObject e = mo74341e();
            String h = mo84490h();
            e.put("subtype", h);
            if (C87412m.m108589b(h, "wifi")) {
                e.put("err_msg", "network_type:wifi");
            } else if (C87412m.m108589b(h, "fail")) {
                e.put("err_msg", "network_type:fail");
            } else {
                e.put("err_msg", "network_type:wwan");
            }
            return e.toString();
        } catch (Exception unused) {
            return mo74340d().toString();
        }
    }

    @JavascriptInterface
    public String getSearchDisplayNameList(String str) {
        try {
            JSONArray jSONArray = new JSONArray(new JSONObject(str).optString("data"));
            JSONArray jSONArray2 = new JSONArray();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String str2 = "";
                String string = jSONObject.has("id") ? jSONObject.getString("id") : str2;
                if (jSONObject.has("userName")) {
                    str2 = jSONObject.getString("userName");
                }
                String displayName = ((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(str2);
                C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str2);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("id", string);
                jSONObject2.put("userName", str2);
                jSONObject2.put("displayName", displayName);
                jSONObject2.put("displaySex", z1Var.f149500H);
                jSONArray2.put(jSONObject2);
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("ret", 0);
            jSONObject3.put("data", jSONArray2.toString());
            return jSONObject3.toString();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.WebSearch.BaseWebSearchJSApi", e, "getSearchDisplayNameList", new Object[0]);
            return mo74340d().toString();
        }
    }

    /* renamed from: h */
    public String mo84490h() {
        return NetStatusUtil.isWifi(MMApplicationContext.getContext()) ? "wifi" : C101987v0.m134275i() ? "wangka" : NetStatusUtil.is4G(MMApplicationContext.getContext()) ? "4g" : NetStatusUtil.is3G(MMApplicationContext.getContext()) ? "3g" : NetStatusUtil.is2G(MMApplicationContext.getContext()) ? "2g" : !NetStatusUtil.isConnected(MMApplicationContext.getContext()) ? "fail" : "";
    }

    @JavascriptInterface
    public final String hideVKB(String str) {
        C59386f g = mo84482g();
        if (g != null) {
            g.hideVKB();
        }
        String jSONObject = mo74341e().toString();
        C87412m.m108593f(jSONObject, "returnSuccess().toString()");
        return jSONObject;
    }

    /* renamed from: i */
    public int mo25052i() {
        return 1;
    }

    /* renamed from: j */
    public final String mo84492j(int i, String str, String str2, String str3) {
        BaseWebSearchWebView webView;
        C87412m.m108594g(str, "errMsg");
        C87412m.m108594g(str2, "json");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("retCode", i);
            jSONObject.put("errMsg", str);
            jSONObject.put("json", str2);
            if (str3 == null) {
                str3 = "";
            }
            jSONObject.put("requestId", str3);
            C59386f g = mo84482g();
            if (!(g == null || (webView = g.getWebView()) == null)) {
                C53761n nVar = C53761n.f150905a;
                String jSONObject2 = jSONObject.toString();
                C87412m.m108593f(jSONObject2, "requestObj.toString()");
                nVar.mo74349a(webView, "onSearchWebQueryReady", jSONObject2);
            }
            return mo74341e().toString();
        } catch (Exception unused) {
            return mo74340d().toString();
        }
    }

    @JavascriptInterface
    public String log(String str) {
        Log.m105925i("MicroMsg.WebSearch.BaseWebSearchJSApi", "log: %s", str);
        return mo74341e().toString();
    }

    @JavascriptInterface
    public String openFinderFeed(String str) {
        Context context;
        Class cls = C60200t1.class;
        try {
            Log.m105925i("MicroMsg.WebSearch.BaseWebSearchJSApi", "openFinderFeed %s", str);
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("feedId", jSONObject.optString("feedId", ""));
            jSONObject2.put("extInfo", new JSONObject(jSONObject.optString("extInfo", "")));
            Intent intent = new Intent();
            ((C60200t1) C86312j.m106911c(cls)).mo76842e7(7, 2, 25, intent);
            C60200t1 t1Var = (C60200t1) C86312j.m106911c(cls);
            C59386f g = mo84482g();
            if (g == null || (context = g.mo24908k0()) == null) {
                context = MMApplicationContext.getContext();
            }
            C87412m.m108593f(context, "getBaseWebSearchUICompon…ationContext.getContext()");
            String jSONObject3 = jSONObject2.toString();
            C87412m.m108593f(jSONObject3, "jsonObject.toString()");
            t1Var.mo76781MY(context, jSONObject3, intent);
            return mo74341e().toString();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.WebSearch.BaseWebSearchJSApi", e, "openFinderFeed", new Object[0]);
            return mo74340d().toString();
        }
    }

    @JavascriptInterface
    public String openFinderProfile(String str) {
        Context context;
        Class cls = C60200t1.class;
        try {
            Log.m105925i("MicroMsg.WebSearch.BaseWebSearchJSApi", "openFinderProfile %s", str);
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("userName", "");
            int optInt = jSONObject.optInt("commentScene", 0);
            String optString2 = jSONObject.optString("reportExtraInfo", "");
            if (optInt == 0) {
                optInt = 7;
            }
            Intent intent = new Intent();
            intent.putExtra("finder_username", optString);
            intent.putExtra("report_scene", 15);
            intent.putExtra("key_enter_profile_type", 1);
            intent.putExtra("key_extra_info", optString2);
            ((C60200t1) C86312j.m106911c(cls)).mo76842e7(optInt, 2, 32, intent);
            C60200t1 t1Var = (C60200t1) C86312j.m106911c(cls);
            C59386f g = mo84482g();
            if (g == null || (context = g.mo24908k0()) == null) {
                context = MMApplicationContext.getContext();
            }
            C87412m.m108593f(context, "getBaseWebSearchUICompon…ationContext.getContext()");
            t1Var.mo76819V1(context, intent);
            return mo74341e().toString();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.WebSearch.BaseWebSearchJSApi", e, C55511i.NAME, new Object[0]);
            return mo74340d().toString();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: org.json.JSONObject} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v16, resolved type: org.json.JSONObject} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: org.json.JSONObject} */
    /* JADX WARNING: Multi-variable type inference failed */
    @android.webkit.JavascriptInterface
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String openFinderSearchView(java.lang.String r4) {
        /*
            r3 = this;
            g83.f r0 = r3.mo84482g()
            r1 = 0
            if (r0 == 0) goto L_0x000c
            android.content.Context r0 = r0.mo24908k0()
            goto L_0x000d
        L_0x000c:
            r0 = r1
        L_0x000d:
            if (r4 == 0) goto L_0x0030
            kotlin.Result$Companion r2 = kotlin.Result.Companion     // Catch:{ all -> 0x001b }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x001b }
            r2.<init>(r4)     // Catch:{ all -> 0x001b }
            java.lang.Object r4 = kotlin.Result.m168114constructorimpl(r2)     // Catch:{ all -> 0x001b }
            goto L_0x0026
        L_0x001b:
            r4 = move-exception
            kotlin.Result$Companion r2 = kotlin.Result.Companion
            java.lang.Object r4 = kotlin.ResultKt.createFailure(r4)
            java.lang.Object r4 = kotlin.Result.m168114constructorimpl(r4)
        L_0x0026:
            boolean r2 = kotlin.Result.m168120isFailureimpl(r4)
            if (r2 == 0) goto L_0x002d
            goto L_0x002e
        L_0x002d:
            r1 = r4
        L_0x002e:
            org.json.JSONObject r1 = (org.json.JSONObject) r1
        L_0x0030:
            if (r0 == 0) goto L_0x0054
            if (r1 == 0) goto L_0x0054
            java.lang.Class<ht1.e5> r4 = ht1.C8764e5.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            ht1.e5 r4 = (ht1.C8764e5) r4
            boolean r4 = r4.mo244Rt(r0, r1)
            if (r4 == 0) goto L_0x004b
            org.json.JSONObject r4 = r3.mo74341e()
            java.lang.String r4 = r4.toString()
            goto L_0x0053
        L_0x004b:
            org.json.JSONObject r4 = r3.mo74340d()
            java.lang.String r4 = r4.toString()
        L_0x0053:
            return r4
        L_0x0054:
            org.json.JSONObject r4 = r3.mo74340d()
            java.lang.String r4 = r4.toString()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: g83.C59379b.openFinderSearchView(java.lang.String):java.lang.String");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: org.json.JSONObject} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v16, resolved type: org.json.JSONObject} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: org.json.JSONObject} */
    /* JADX WARNING: Multi-variable type inference failed */
    @android.webkit.JavascriptInterface
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String openFinderTimeLineView(java.lang.String r4) {
        /*
            r3 = this;
            g83.f r0 = r3.mo84482g()
            r1 = 0
            if (r0 == 0) goto L_0x000c
            android.content.Context r0 = r0.mo24908k0()
            goto L_0x000d
        L_0x000c:
            r0 = r1
        L_0x000d:
            if (r4 == 0) goto L_0x0030
            kotlin.Result$Companion r2 = kotlin.Result.Companion     // Catch:{ all -> 0x001b }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x001b }
            r2.<init>(r4)     // Catch:{ all -> 0x001b }
            java.lang.Object r4 = kotlin.Result.m168114constructorimpl(r2)     // Catch:{ all -> 0x001b }
            goto L_0x0026
        L_0x001b:
            r4 = move-exception
            kotlin.Result$Companion r2 = kotlin.Result.Companion
            java.lang.Object r4 = kotlin.ResultKt.createFailure(r4)
            java.lang.Object r4 = kotlin.Result.m168114constructorimpl(r4)
        L_0x0026:
            boolean r2 = kotlin.Result.m168120isFailureimpl(r4)
            if (r2 == 0) goto L_0x002d
            goto L_0x002e
        L_0x002d:
            r1 = r4
        L_0x002e:
            org.json.JSONObject r1 = (org.json.JSONObject) r1
        L_0x0030:
            if (r0 == 0) goto L_0x0054
            if (r1 == 0) goto L_0x0054
            java.lang.Class<ht1.e5> r4 = ht1.C8764e5.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            ht1.e5 r4 = (ht1.C8764e5) r4
            boolean r4 = r4.mo243MD(r0, r1)
            if (r4 == 0) goto L_0x004b
            org.json.JSONObject r4 = r3.mo74341e()
            java.lang.String r4 = r4.toString()
            goto L_0x0053
        L_0x004b:
            org.json.JSONObject r4 = r3.mo74340d()
            java.lang.String r4 = r4.toString()
        L_0x0053:
            return r4
        L_0x0054:
            org.json.JSONObject r4 = r3.mo74340d()
            java.lang.String r4 = r4.toString()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: g83.C59379b.openFinderTimeLineView(java.lang.String):java.lang.String");
    }

    @JavascriptInterface
    public String openFinderView(String str) {
        Context context;
        Log.m105924i("MicroMsg.WebSearch.BaseWebSearchJSApi", "openFinderView params=" + str);
        if (str == null) {
            return mo74340d().toString();
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("extInfo", new JSONObject(jSONObject.optString("extInfo", "")));
            C7335d c = C86312j.m106911c(C60200t1.class);
            C87412m.m108593f(c, "getService(IFinderCommon…atureService::class.java)");
            C60200t1 t1Var = (C60200t1) c;
            C59386f g = mo84482g();
            if (g == null || (context = g.mo24908k0()) == null) {
                context = MMApplicationContext.getContext();
            }
            Context context2 = context;
            C87412m.m108593f(context2, "getBaseWebSearchUICompon…ationContext.getContext()");
            C60200t1.C60201a.m70364b(t1Var, context2, jSONObject2.toString(), (C60216z4.C8821a) null, 4, (Object) null);
            return mo74341e().toString();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.WebSearch.BaseWebSearchJSApi", e, "openFinderView", new Object[0]);
            return mo74340d().toString();
        }
    }

    @JavascriptInterface
    public String openMusicPage(String str) {
        try {
            C59390n.f169735a.mo84515b(new JSONObject(str), true);
            return mo74341e().toString();
        } catch (Exception unused) {
            return mo74340d().toString();
        }
    }

    @JavascriptInterface
    public String playMusic(String str) {
        try {
            C59390n.f169735a.mo84515b(new JSONObject(str), false);
            return mo74341e().toString();
        } catch (Exception unused) {
            return mo74340d().toString();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: org.json.JSONObject} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v16, resolved type: org.json.JSONObject} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: org.json.JSONObject} */
    /* JADX WARNING: Multi-variable type inference failed */
    @android.webkit.JavascriptInterface
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String preloadFinderItem(java.lang.String r4) {
        /*
            r3 = this;
            g83.f r0 = r3.mo84482g()
            r1 = 0
            if (r0 == 0) goto L_0x000c
            android.content.Context r0 = r0.mo24908k0()
            goto L_0x000d
        L_0x000c:
            r0 = r1
        L_0x000d:
            if (r4 == 0) goto L_0x0030
            kotlin.Result$Companion r2 = kotlin.Result.Companion     // Catch:{ all -> 0x001b }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x001b }
            r2.<init>(r4)     // Catch:{ all -> 0x001b }
            java.lang.Object r4 = kotlin.Result.m168114constructorimpl(r2)     // Catch:{ all -> 0x001b }
            goto L_0x0026
        L_0x001b:
            r4 = move-exception
            kotlin.Result$Companion r2 = kotlin.Result.Companion
            java.lang.Object r4 = kotlin.ResultKt.createFailure(r4)
            java.lang.Object r4 = kotlin.Result.m168114constructorimpl(r4)
        L_0x0026:
            boolean r2 = kotlin.Result.m168120isFailureimpl(r4)
            if (r2 == 0) goto L_0x002d
            goto L_0x002e
        L_0x002d:
            r1 = r4
        L_0x002e:
            org.json.JSONObject r1 = (org.json.JSONObject) r1
        L_0x0030:
            if (r0 == 0) goto L_0x0054
            if (r1 == 0) goto L_0x0054
            java.lang.Class<ht1.e5> r4 = ht1.C8764e5.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            ht1.e5 r4 = (ht1.C8764e5) r4
            boolean r4 = r4.mo242CR(r0, r1)
            if (r4 == 0) goto L_0x004b
            org.json.JSONObject r4 = r3.mo74341e()
            java.lang.String r4 = r4.toString()
            goto L_0x0053
        L_0x004b:
            org.json.JSONObject r4 = r3.mo74340d()
            java.lang.String r4 = r4.toString()
        L_0x0053:
            return r4
        L_0x0054:
            org.json.JSONObject r4 = r3.mo74340d()
            java.lang.String r4 = r4.toString()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: g83.C59379b.preloadFinderItem(java.lang.String):java.lang.String");
    }

    @JavascriptInterface
    public String profile(String str) {
        try {
            Log.m105925i("MicroMsg.WebSearch.BaseWebSearchJSApi", "profile %s", str);
            return mo84481f(new JSONObject(str).optString("username", "")) ? mo74341e().toString() : mo74340d().toString();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.WebSearch.BaseWebSearchJSApi", e, C55511i.NAME, new Object[0]);
            return mo74340d().toString();
        }
    }

    @JavascriptInterface
    public String querySearchWeb(String str) {
        C45897a c;
        Log.m105924i("MicroMsg.WebSearch.BaseWebSearchJSApi", "querySearchWeb " + str);
        if (str == null) {
            return mo74340d().toString();
        }
        C59386f g = mo84482g();
        if (!(g == null || (c = g.mo9283c()) == null)) {
            JSONObject jSONObject = new JSONObject(str);
            C86709a0.m107524d().mo123460f(new C52456b0(jSONObject.optString("requestId", ""), jSONObject.optString("commReq", ""), c.mo71326a()));
        }
        return mo74341e().toString();
    }

    @JavascriptInterface
    public String reportIDKey(String str) {
        Log.m105925i("MicroMsg.WebSearch.BaseWebSearchJSApi", "reportIDKey %s", str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            C117407d.INSTANCE.idkeyStat((long) jSONObject.optInt("id", 0), (long) jSONObject.optInt("key", 0), (long) jSONObject.optInt("value", 0), false);
            return mo74341e().toString();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.WebSearch.BaseWebSearchJSApi", e, "reportIdKey", new Object[0]);
            return mo74340d().toString();
        }
    }

    @JavascriptInterface
    public final String reportKV(String str) {
        Log.m105925i("MicroMsg.WebSearch.BaseWebSearchJSApi", "reportKV %s", str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            C117407d.INSTANCE.kvStat(jSONObject.optInt("logid"), jSONObject.optString("msg", ""));
            return mo74341e().toString();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.WebSearch.BaseWebSearchJSApi", e, "reportIdKey", new Object[0]);
            return mo74340d().toString();
        }
    }

    @JavascriptInterface
    public final String reportSearchRealTimeStatistics(String str) {
        Log.m105925i("MicroMsg.WebSearch.BaseWebSearchJSApi", "reportSearchRealTimeStatistics %s", str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            C51593us3 us32 = new C51593us3();
            us32.f143104t = jSONObject.optString("logString", "");
            if (mo25052i() == 1) {
                C86709a0.m107524d().mo123460f(new C52464j0(us32));
            } else {
                C86709a0.m107524d().mo123460f(new C52459d0(us32));
            }
            return mo74341e().toString();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.WebSearch.BaseWebSearchJSApi", e, "reportSearchRealTimeStatistics", new Object[0]);
            return mo74340d().toString();
        }
    }

    @JavascriptInterface
    public String reportSearchStatistics(String str) {
        Log.m105925i("MicroMsg.WebSearch.BaseWebSearchJSApi", "reportSearchStatistics %s", str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            C117407d.INSTANCE.kvStat(jSONObject.optInt("logId", 0), jSONObject.optString("logString", ""));
            return mo74341e().toString();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.WebSearch.BaseWebSearchJSApi", e, "reportSearchStatistics", new Object[0]);
            return mo74340d().toString();
        }
    }

    @JavascriptInterface
    public final String showVKB(String str) {
        C59386f g = mo84482g();
        if (g != null) {
            g.showVKB();
        }
        String jSONObject = mo74341e().toString();
        C87412m.m108593f(jSONObject, "returnSuccess().toString()");
        return jSONObject;
    }

    @JavascriptInterface
    public void vibrateShort(String str) {
        C59390n.f169735a.mo84518e(str);
    }

    public C59379b(C59386f<T> fVar) {
        super(fVar);
    }
}
