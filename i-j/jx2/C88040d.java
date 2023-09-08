package jx2;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53930o0;
import a14.C53934p0;
import android.graphics.Bitmap;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.appbrand.appcache.C81291m0;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import f14.C58901s;
import fy3.C32227p;
import gy3.C8477a0;
import gy3.C8480h;
import gy3.C87412m;
import java.nio.ByteBuffer;
import js0.C88016e;
import js0.C9514m;
import k70.C88119c;
import kotlin.ResultKt;
import org.json.JSONArray;
import org.json.JSONObject;
import org.libpag.PAGComposition;
import org.libpag.PAGFile;
import org.libpag.PAGFont;
import org.libpag.PAGLayer;
import org.libpag.PAGText;
import org.libpag.PAGTextLayer;
import org.libpag.PAGView;
import org.libpag.SimplePAGViewUpdateListener;
import ox2.C89299a;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import yx3.C91590f;
import yx3.C91594j;
import z04.C112550d0;
import z04.C112551y;

/* renamed from: jx2.d */
public final class C88040d {

    /* renamed from: a */
    public static final C88041a f254660a = new C88041a((C8480h) null);

    /* renamed from: jx2.d$a */
    public static final class C88041a {

        /* renamed from: jx2.d$a$a */
        public static final class C88042a extends SimplePAGViewUpdateListener {

            /* renamed from: d */
            public final /* synthetic */ PAGView f254661d;

            public C88042a(PAGView pAGView) {
                this.f254661d = pAGView;
            }

            public void onAnimationCancel(PAGView pAGView) {
            }

            public void onAnimationEnd(PAGView pAGView) {
                Log.m105924i("MicroMsg.MBPlayPagManager", "stop here");
                this.f254661d.stop();
                this.f254661d.freeCache();
                this.f254661d.removeListener(this);
                this.f254661d.setVisibility(4);
            }

            public void onAnimationRepeat(PAGView pAGView) {
            }

            public void onAnimationStart(PAGView pAGView) {
            }
        }

        @C91590f(mo125468c = "com.tencent.mm.plugin.surface.magiclivecard.jsapi.coverview.MBPlayPagManager$Companion$playPag$4", mo125469f = "MBPlayPagManager.kt", mo125470l = {170}, mo125471m = "invokeSuspend")
        /* renamed from: jx2.d$a$b */
        public static final class C88043b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public Object f254662d;

            /* renamed from: e */
            public Object f254663e;

            /* renamed from: f */
            public Object f254664f;

            /* renamed from: g */
            public Object f254665g;

            /* renamed from: h */
            public Object f254666h;

            /* renamed from: i */
            public Object f254667i;

            /* renamed from: j */
            public int f254668j;

            /* renamed from: n */
            public int f254669n;

            /* renamed from: o */
            public int f254670o;

            /* renamed from: p */
            public final /* synthetic */ PAGView f254671p;

            /* renamed from: q */
            public final /* synthetic */ JSONObject f254672q;

            /* renamed from: r */
            public final /* synthetic */ JSONArray f254673r;

            /* renamed from: s */
            public final /* synthetic */ C89299a f254674s;

            /* renamed from: t */
            public final /* synthetic */ C8477a0 f254675t;

            @C91590f(mo125468c = "com.tencent.mm.plugin.surface.magiclivecard.jsapi.coverview.MBPlayPagManager$Companion$playPag$4$1$bitmap$1", mo125469f = "MBPlayPagManager.kt", mo125470l = {}, mo125471m = "invokeSuspend")
            /* renamed from: jx2.d$a$b$a */
            public static final class C88044a extends C91594j implements C32227p<C0000n0, C15601d<? super Bitmap>, Object> {

                /* renamed from: d */
                public final /* synthetic */ JSONObject f254676d;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C88044a(JSONObject jSONObject, C15601d<? super C88044a> dVar) {
                    super(2, dVar);
                    this.f254676d = jSONObject;
                }

                public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                    return new C88044a(this.f254676d, dVar);
                }

                public Object invoke(Object obj, Object obj2) {
                    return ((C88044a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
                }

                public final Object invokeSuspend(Object obj) {
                    ResultKt.throwOnFailure(obj);
                    return BackwardSupportUtil.BitmapFactory.getBitmapFromURL(this.f254676d.optString("imageUrl"));
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C88043b(PAGView pAGView, JSONObject jSONObject, JSONArray jSONArray, C89299a aVar, C8477a0 a0Var, C15601d<? super C88043b> dVar) {
                super(2, dVar);
                this.f254671p = pAGView;
                this.f254672q = jSONObject;
                this.f254673r = jSONArray;
                this.f254674s = aVar;
                this.f254675t = a0Var;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C88043b(this.f254671p, this.f254672q, this.f254673r, this.f254674s, this.f254675t, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C88043b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            /* JADX WARNING: Removed duplicated region for block: B:10:0x005a  */
            /* JADX WARNING: Removed duplicated region for block: B:23:0x00c1  */
            /* JADX WARNING: Removed duplicated region for block: B:36:0x0144  */
            /* JADX WARNING: Removed duplicated region for block: B:38:0x014d  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r18) {
                /*
                    r17 = this;
                    r0 = r17
                    xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
                    int r2 = r0.f254670o
                    java.lang.String r3 = "MicroMsg.MBPlayPagManager"
                    r4 = 0
                    r5 = 1
                    if (r2 == 0) goto L_0x003f
                    if (r2 != r5) goto L_0x0037
                    int r2 = r0.f254669n
                    int r6 = r0.f254668j
                    java.lang.Object r7 = r0.f254667i
                    org.json.JSONObject r7 = (org.json.JSONObject) r7
                    java.lang.Object r8 = r0.f254666h
                    org.libpag.PAGView r8 = (org.libpag.PAGView) r8
                    java.lang.Object r9 = r0.f254665g
                    gy3.a0 r9 = (gy3.C8477a0) r9
                    java.lang.Object r10 = r0.f254664f
                    ox2.a r10 = (ox2.C89299a) r10
                    java.lang.Object r11 = r0.f254663e
                    org.json.JSONArray r11 = (org.json.JSONArray) r11
                    java.lang.Object r12 = r0.f254662d
                    org.libpag.PAGView r12 = (org.libpag.PAGView) r12
                    kotlin.ResultKt.throwOnFailure(r18)
                    r4 = r18
                    r13 = r12
                    r12 = r11
                    r11 = r10
                    r10 = r9
                    r9 = r8
                    r8 = r0
                    goto L_0x009d
                L_0x0037:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r2)
                    throw r1
                L_0x003f:
                    kotlin.ResultKt.throwOnFailure(r18)
                    org.libpag.PAGView r2 = r0.f254671p
                    org.json.JSONArray r6 = r0.f254673r
                    ox2.a r7 = r0.f254674s
                    gy3.a0 r8 = r0.f254675t
                    if (r6 == 0) goto L_0x0137
                    int r9 = r6.length()
                    r12 = r2
                    r11 = r6
                    r10 = r7
                    r6 = 0
                    r7 = r0
                    r2 = r9
                    r9 = r8
                    r8 = r12
                L_0x0058:
                    if (r6 >= r2) goto L_0x0139
                    org.json.JSONObject r13 = r11.optJSONObject(r6)
                    java.lang.String r14 = "imageMode"
                    int r14 = r13.optInt(r14)
                    if (r14 == 0) goto L_0x00d8
                    if (r14 == r5) goto L_0x0072
                    java.lang.String r1 = "error imageMode"
                    com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r1)
                    r9.f27482d = r4
                    rx3.b0 r1 = rx3.C13598b0.f38549a
                    return r1
                L_0x0072:
                    a14.h0 r14 = a14.C53872d1.f151119c
                    jx2.d$a$b$a r15 = new jx2.d$a$b$a
                    r4 = 0
                    r15.<init>(r13, r4)
                    r7.f254662d = r12
                    r7.f254663e = r11
                    r7.f254664f = r10
                    r7.f254665g = r9
                    r7.f254666h = r8
                    r7.f254667i = r13
                    r7.f254668j = r6
                    r7.f254669n = r2
                    r7.f254670o = r5
                    java.lang.Object r4 = a14.C53895h.m60469g(r14, r15, r7)
                    if (r4 != r1) goto L_0x0093
                    return r1
                L_0x0093:
                    r16 = r8
                    r8 = r7
                    r7 = r13
                    r13 = r12
                    r12 = r11
                    r11 = r10
                    r10 = r9
                    r9 = r16
                L_0x009d:
                    android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
                    if (r4 != 0) goto L_0x00c1
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "download bitmap error,bitmap is null.url:"
                    r1.append(r2)
                    java.lang.String r2 = "imageUrl"
                    java.lang.String r2 = r7.optString(r2)
                    r1.append(r2)
                    java.lang.String r1 = r1.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r1)
                    r1 = 0
                    r10.f27482d = r1
                    rx3.b0 r1 = rx3.C13598b0.f38549a
                    return r1
                L_0x00c1:
                    org.libpag.PAGImage r4 = org.libpag.PAGImage.FromBitmap(r4)
                    java.lang.String r14 = "FromBitmap(bitmap)"
                    gy3.C87412m.m108593f(r4, r14)
                    r4.setScaleMode(r5)
                    r16 = r13
                    r13 = r7
                    r7 = r8
                    r8 = r9
                    r9 = r10
                    r10 = r11
                    r11 = r12
                    r12 = r16
                    goto L_0x011a
                L_0x00d8:
                    js0.m r4 = new js0.m
                    r4.<init>()
                    com.tencent.mm.plugin.appbrand.appstorage.b0 r14 = com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0.ERR_OP_FAIL
                    java.lang.String r15 = "imagePath"
                    java.lang.String r5 = r13.optString(r15)
                    java.lang.String r0 = "imageJsonObject.optStrin…                        )"
                    gy3.C87412m.m108593f(r5, r0)
                    k70.c$d r5 = r10.mo122513d(r5)
                    if (r5 == 0) goto L_0x00fd
                    com.tencent.mm.plugin.appbrand.appcache.l0 r5 = r5.f254881c
                    java.lang.String r14 = r13.optString(r15)
                    gy3.C87412m.m108593f(r14, r0)
                    com.tencent.mm.plugin.appbrand.appstorage.b0 r14 = com.tencent.p014mm.plugin.appbrand.appcache.C81291m0.m99668d(r5, r14, r4)
                L_0x00fd:
                    com.tencent.mm.plugin.appbrand.appstorage.b0 r0 = com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0.OK
                    if (r14 == r0) goto L_0x0109
                    java.lang.String r0 = "fileSystem readImageFile function fail"
                    com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
                    rx3.b0 r0 = rx3.C13598b0.f38549a
                    return r0
                L_0x0109:
                    T r0 = r4.f29691a
                    java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
                    byte[] r0 = js0.C88016e.m109544a(r0)
                    org.libpag.PAGImage r4 = org.libpag.PAGImage.FromBytes(r0)
                    java.lang.String r0 = "FromBytes(AppBrandIOUtil…yteBuffer(pointer.value))"
                    gy3.C87412m.m108593f(r4, r0)
                L_0x011a:
                    org.libpag.PAGComposition r0 = r8.getComposition()
                    java.lang.String r5 = "null cannot be cast to non-null type org.libpag.PAGFile"
                    gy3.C87412m.m108592e(r0, r5)
                    org.libpag.PAGFile r0 = (org.libpag.PAGFile) r0
                    java.lang.String r5 = "index"
                    int r5 = r13.optInt(r5)
                    r0.replaceImage(r5, r4)
                    r0 = 1
                    int r6 = r6 + r0
                    r0 = r17
                    r4 = 0
                    r5 = 1
                    goto L_0x0058
                L_0x0137:
                    r7 = r17
                L_0x0139:
                    org.json.JSONObject r0 = r7.f254672q
                    java.lang.String r1 = "hide"
                    r2 = 0
                    boolean r0 = r0.optBoolean(r1, r2)
                    if (r0 == 0) goto L_0x014d
                    org.libpag.PAGView r0 = r7.f254671p
                    r1 = 4
                    r0.setVisibility(r1)
                    rx3.b0 r0 = rx3.C13598b0.f38549a
                    return r0
                L_0x014d:
                    org.libpag.PAGView r0 = r7.f254671p
                    r0.setVisibility(r2)
                    org.libpag.PAGView r0 = r7.f254671p
                    r1 = 0
                    r0.setProgress(r1)
                    org.libpag.PAGView r0 = r7.f254671p
                    r0.flush()
                    org.libpag.PAGView r0 = r7.f254671p
                    r0.play()
                    rx3.b0 r0 = rx3.C13598b0.f38549a
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: jx2.C88040d.C88041a.C88043b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public C88041a(C8480h hVar) {
        }

        /* renamed from: a */
        public final boolean mo122485a(C89299a aVar, JSONObject jSONObject, PAGView pAGView) {
            int i;
            C81410b0 b0Var;
            C89299a aVar2 = aVar;
            JSONObject jSONObject2 = jSONObject;
            PAGView pAGView2 = pAGView;
            C81410b0 b0Var2 = C81410b0.OK;
            C81410b0 b0Var3 = C81410b0.ERR_OP_FAIL;
            C87412m.m108594g(aVar2, "packageManager");
            C87412m.m108594g(jSONObject2, "data");
            C87412m.m108594g(pAGView2, "pagView");
            pAGView.stop();
            JSONObject optJSONObject = jSONObject2.optJSONObject("pagPara");
            JSONArray jSONArray = null;
            String optString = optJSONObject != null ? optJSONObject.optString("pagFilePath") : null;
            if (optString == null) {
                optString = "";
            }
            int i2 = 0;
            if (!Util.isNullOrNil(optString)) {
                C9514m mVar = new C9514m();
                C88119c.C88122d d = aVar2.mo122513d(optString);
                if ((d != null ? C81291m0.m99668d(d.f254881c, optString, mVar) : b0Var3) != b0Var2) {
                    Log.m105920e("MicroMsg.MBPlayPagManager", "fileSystem readPAGFile function fail");
                    return false;
                }
                PAGFile Load = PAGFile.Load(C88016e.m109544a((ByteBuffer) mVar.f29691a));
                if (Load == null) {
                    Log.m105920e("MicroMsg.MBPlayPagManager", "pagFile null");
                    return false;
                }
                pAGView2.setComposition(Load);
            }
            Integer valueOf = optJSONObject != null ? Integer.valueOf(optJSONObject.optInt("count", 1)) : null;
            JSONArray optJSONArray = optJSONObject != null ? optJSONObject.optJSONArray("textArray") : null;
            JSONArray optJSONArray2 = optJSONObject != null ? optJSONObject.optJSONArray("imageArray") : null;
            if (optJSONObject != null) {
                jSONArray = optJSONObject.optJSONArray("fontArray");
            }
            pAGView2.setRepeatCount(valueOf != null ? valueOf.intValue() : 1);
            pAGView2.addListener(new C88042a(pAGView2));
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                int i3 = 0;
                while (i3 < length) {
                    JSONObject optJSONObject2 = optJSONArray.optJSONObject(i3);
                    PAGComposition composition = pAGView.getComposition();
                    C87412m.m108592e(composition, "null cannot be cast to non-null type org.libpag.PAGFile");
                    PAGFile pAGFile = (PAGFile) composition;
                    PAGText textData = pAGFile.getTextData(optJSONObject2.optInt(FirebaseAnalytics.C113379b.INDEX, i2));
                    textData.text = optJSONObject2.optString(MimeTypes.BASE_TYPE_TEXT, "");
                    pAGFile.replaceText(optJSONObject2.optInt(FirebaseAnalytics.C113379b.INDEX, 0), textData);
                    i3++;
                    PAGView pAGView3 = pAGView;
                    i2 = 0;
                }
            }
            if (jSONArray != null) {
                int length2 = jSONArray.length();
                int i4 = 0;
                while (i4 < length2) {
                    Log.m105924i("MicroMsg.MBPlayPagManager", "use font,fontArray:" + jSONArray);
                    String optString2 = jSONArray.optString(i4);
                    PAGComposition composition2 = pAGView.getComposition();
                    int numChildren = composition2.numChildren();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= numChildren) {
                            i = length2;
                            b0Var = b0Var3;
                            break;
                        }
                        PAGLayer layerAt = composition2.getLayerAt(i5);
                        if (!(layerAt instanceof PAGTextLayer)) {
                            i = length2;
                            b0Var = b0Var3;
                        } else {
                            PAGTextLayer pAGTextLayer = (PAGTextLayer) layerAt;
                            i = length2;
                            String str = pAGTextLayer.font().fontFamily;
                            C87412m.m108593f(str, "pagLayer.font().fontFamily");
                            b0Var = b0Var3;
                            String n = C112551y.m153814n(str, " ", "", false);
                            C87412m.m108593f(optString2, "fontPath");
                            String substring = optString2.substring(C112550d0.m153772H(optString2, "/", 0, false, 6, (Object) null) + 1, optString2.length());
                            C87412m.m108593f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                            if (n.contentEquals(C112550d0.m153797g0(substring, ".", substring))) {
                                C9514m mVar2 = new C9514m();
                                C88119c.C88122d d2 = aVar2.mo122513d(optString2);
                                if ((d2 != null ? C81291m0.m99668d(d2.f254881c, optString2, mVar2) : b0Var) != b0Var2) {
                                    Log.m105920e("MicroMsg.MBPlayPagManager", "fileSystem readFontFile function fail");
                                    return false;
                                }
                                byte[] a = C88016e.m109544a((ByteBuffer) mVar2.f29691a);
                                C87412m.m108593f(a, "arrayOfByteBuffer(pointer.value)");
                                PAGFont RegisterFontBytes = PAGFont.RegisterFontBytes(a, a.length, 0);
                                if (RegisterFontBytes == null) {
                                    Log.m105920e("MicroMsg.MBPlayPagManager", "fontFile in font path'" + optString2 + "' is null");
                                    return false;
                                }
                                pAGTextLayer.setFont(RegisterFontBytes);
                                composition2.setLayerIndex(layerAt, i5);
                            }
                        }
                        i5++;
                        JSONObject jSONObject3 = jSONObject;
                        length2 = i;
                        b0Var3 = b0Var;
                    }
                    i4++;
                    JSONObject jSONObject4 = jSONObject;
                    length2 = i;
                    b0Var3 = b0Var;
                }
            }
            C8477a0 a0Var = new C8477a0();
            a0Var.f27482d = true;
            C53896h0 h0Var = C53872d1.f151117a;
            C53895h.m60466d(C53930o0.m60554a(C58901s.f168555a), (C66212f) null, (C53934p0) null, new C88043b(pAGView, jSONObject, optJSONArray2, aVar, a0Var, (C15601d<? super C88043b>) null), 3, (Object) null);
            return a0Var.f27482d;
        }
    }
}
