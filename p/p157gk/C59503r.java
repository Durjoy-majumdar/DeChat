package p157gk;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53930o0;
import a14.C53934p0;
import a14.C53973z1;
import android.graphics.Bitmap;
import android.util.Pair;
import au3.C54328a;
import au3.C54331d;
import bp3.C54526i;
import c30.C104289g;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.api.QueryImageData;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C30744h4;
import com.tencent.p014mm.storage.C57593a4;
import com.tencent.p014mm.xeffect.WeChatCls;
import com.tencent.p014mm.xeffect.WeFaceCluster;
import com.tencent.p014mm.xeffect.WeOcr;
import com.tencent.xweb.WCWebUpdater;
import di3.C86312j;
import f14.C58901s;
import f40.C86709a0;
import fy3.C32227p;
import gy3.C87412m;
import ig3.C60280b;
import ig3.C60283e;
import iy3.C60641c;
import ja3.C60786a;
import java.io.IOException;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import q00.C12025f;
import q00.C62571i;
import rx3.C13598b0;
import sx3.C110818d0;
import sx3.C64197v;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: gk.r */
public final class C59503r {

    /* renamed from: a */
    public static final C59503r f170040a = new C59503r();

    /* renamed from: b */
    public static final List<String> f170041b = C64197v.m75537f(WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL, "27", "28", "152", "153", "156", "157", "159", "160");

    /* renamed from: c */
    public static C60786a f170042c;

    /* renamed from: d */
    public static C0000n0 f170043d;

    /* renamed from: e */
    public static final HashMap<String, QueryImageData> f170044e = new HashMap<>();

    /* renamed from: f */
    public static final HashMap<String, QueryImageData> f170045f = new HashMap<>();

    /* renamed from: g */
    public static boolean f170046g = true;

    /* renamed from: h */
    public static boolean f170047h;

    /* renamed from: i */
    public static final ArrayList<QueryImageData> f170048i = new ArrayList<>();

    /* renamed from: j */
    public static final HashSet<String> f170049j = new HashSet<>();

    /* renamed from: k */
    public static String f170050k;

    /* renamed from: l */
    public static String f170051l = "";

    /* renamed from: m */
    public static long f170052m;

    /* renamed from: n */
    public static C59479c f170053n = C59479c.INIT;

    /* renamed from: o */
    public static int f170054o;

    /* renamed from: p */
    public static final HashSet<String> f170055p = new HashSet<>();

    /* renamed from: q */
    public static C53973z1 f170056q;

    @C91590f(mo125468c = "com.tencent.mm.data.ImageQuerySDKCore$dealClusterCropCenterImage$2", mo125469f = "ImageQuerySDKCore.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: gk.r$a */
    public static final class C59504a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ String f170057d;

        /* renamed from: e */
        public final /* synthetic */ String f170058e;

        /* renamed from: f */
        public final /* synthetic */ double f170059f;

        /* renamed from: g */
        public final /* synthetic */ double f170060g;

        /* renamed from: h */
        public final /* synthetic */ double f170061h;

        /* renamed from: i */
        public final /* synthetic */ double f170062i;

        /* renamed from: j */
        public final /* synthetic */ long f170063j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59504a(String str, String str2, double d, double d2, double d3, double d4, long j, C15601d<? super C59504a> dVar) {
            super(2, dVar);
            this.f170057d = str;
            this.f170058e = str2;
            this.f170059f = d;
            this.f170060g = d2;
            this.f170061h = d3;
            this.f170062i = d4;
            this.f170063j = j;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C59504a(this.f170057d, this.f170058e, this.f170059f, this.f170060g, this.f170061h, this.f170062i, this.f170063j, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C59504a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            Log.m105924i("MicroMsg.ImageQuerySDKCore", "dealClusterCropCenterImage >> cropImagePath: " + this.f170057d + ", imagePath: " + this.f170058e);
            Bitmap decodeFileWithSample = BitmapUtil.decodeFileWithSample(this.f170058e, 960, 960, true);
            if (decodeFileWithSample == null) {
                return C13598b0.f38549a;
            }
            Bitmap cropBitmap = BitmapUtil.cropBitmap(decodeFileWithSample, C60641c.m70920a(this.f170059f), C60641c.m70920a(this.f170060g), C60641c.m70920a(this.f170061h), C60641c.m70920a(this.f170062i), true);
            if (cropBitmap == null) {
                return C13598b0.f38549a;
            }
            try {
                BitmapUtil.saveBitmapToImage(cropBitmap, 100, Bitmap.CompressFormat.PNG, this.f170057d, true);
                C57593a4 a4Var = C57593a4.f164912a;
                String str = C59491j.f169997b;
                String valueOf = String.valueOf(this.f170063j);
                String str2 = this.f170057d;
                String str3 = this.f170058e;
                C87412m.m108593f(str3, "imagePath");
                a4Var.mo81944i(str, valueOf, str2, str3);
            } catch (IOException unused) {
                Log.m105920e("MicroMsg.ImageQuerySDKCore", "saveBitmapToImage error >> cropImagePath: " + this.f170057d);
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.data.ImageQuerySDKCore", mo125469f = "ImageQuerySDKCore.kt", mo125470l = {445}, mo125471m = "dealClusterImage")
    /* renamed from: gk.r$b */
    public static final class C59505b extends C66704d {

        /* renamed from: d */
        public /* synthetic */ Object f170064d;

        /* renamed from: e */
        public final /* synthetic */ C59503r f170065e;

        /* renamed from: f */
        public int f170066f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59505b(C59503r rVar, C15601d<? super C59505b> dVar) {
            super(dVar);
            this.f170065e = rVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f170064d = obj;
            this.f170066f |= Integer.MIN_VALUE;
            C59503r rVar = this.f170065e;
            C59503r rVar2 = C59503r.f170040a;
            return rVar.mo84585f((String) null, (String) null, false, this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.data.ImageQuerySDKCore$startIdentify$1", mo125469f = "ImageQuerySDKCore.kt", mo125470l = {105, 129}, mo125471m = "invokeSuspend")
    /* renamed from: gk.r$c */
    public static final class C59506c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f170067d;

        /* renamed from: e */
        public Object f170068e;

        /* renamed from: f */
        public int f170069f;

        /* renamed from: g */
        public /* synthetic */ Object f170070g;

        /* renamed from: h */
        public final /* synthetic */ ArrayList<QueryImageData> f170071h;

        @C91590f(mo125468c = "com.tencent.mm.data.ImageQuerySDKCore$startIdentify$1$1$1", mo125469f = "ImageQuerySDKCore.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: gk.r$c$a */
        public static final class C59507a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public /* synthetic */ Object f170072d;

            /* renamed from: e */
            public final /* synthetic */ QueryImageData f170073e;

            /* renamed from: f */
            public final /* synthetic */ Buffer f170074f;

            /* renamed from: g */
            public final /* synthetic */ Bitmap f170075g;

            @C91590f(mo125468c = "com.tencent.mm.data.ImageQuerySDKCore$startIdentify$1$1$1$1", mo125469f = "ImageQuerySDKCore.kt", mo125470l = {}, mo125471m = "invokeSuspend")
            /* renamed from: gk.r$c$a$a */
            public static final class C59508a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {
                public C59508a(C15601d<? super C59508a> dVar) {
                    super(2, dVar);
                }

                public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                    return new C59508a(dVar);
                }

                public Object invoke(Object obj, Object obj2) {
                    C0000n0 n0Var = (C0000n0) obj;
                    return new C59508a((C15601d) obj2).invokeSuspend(C13598b0.f38549a);
                }

                public final Object invokeSuspend(Object obj) {
                    ResultKt.throwOnFailure(obj);
                    Log.m105924i("MicroMsg.ImageQuerySDKCore", Thread.currentThread().getName() + ", per Image to set startTimeStamp");
                    long currentTimeMillis = System.currentTimeMillis();
                    Log.m105924i("MicroMsg.ImageQueryConsumeTimeReporter", "setClsStartPerTimeStamp >> timeStamp: " + currentTimeMillis);
                    C60280b.f171846c = currentTimeMillis;
                    Log.m105924i("MicroMsg.ImageQueryConsumeTimeReporter", "setOCRStartPerTimeStamp >> timeStamp: " + currentTimeMillis);
                    C60280b.f171849f = currentTimeMillis;
                    return C13598b0.f38549a;
                }
            }

            @C91590f(mo125468c = "com.tencent.mm.data.ImageQuerySDKCore$startIdentify$1$1$1$2", mo125469f = "ImageQuerySDKCore.kt", mo125470l = {121}, mo125471m = "invokeSuspend")
            /* renamed from: gk.r$c$a$b */
            public static final class C59509b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

                /* renamed from: d */
                public int f170076d;

                /* renamed from: e */
                public final /* synthetic */ QueryImageData f170077e;

                /* renamed from: f */
                public final /* synthetic */ Buffer f170078f;

                /* renamed from: g */
                public final /* synthetic */ Bitmap f170079g;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C59509b(QueryImageData queryImageData, Buffer buffer, Bitmap bitmap, C15601d<? super C59509b> dVar) {
                    super(2, dVar);
                    this.f170077e = queryImageData;
                    this.f170078f = buffer;
                    this.f170079g = bitmap;
                }

                public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                    return new C59509b(this.f170077e, this.f170078f, this.f170079g, dVar);
                }

                public Object invoke(Object obj, Object obj2) {
                    return ((C59509b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
                }

                public final Object invokeSuspend(Object obj) {
                    C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                    int i = this.f170076d;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        Log.m105924i("MicroMsg.ImageQuerySDKCore", Thread.currentThread().getName() + ", per Image to applyLabelReq");
                        C59503r rVar = C59503r.f170040a;
                        QueryImageData queryImageData = this.f170077e;
                        Buffer buffer = this.f170078f;
                        int width = this.f170079g.getWidth();
                        int height = this.f170079g.getHeight();
                        this.f170076d = 1;
                        rVar.getClass();
                        Object g = C53895h.m60469g(C54328a.f152462f, new C59495m(buffer, width, height, queryImageData, (C15601d<? super C59495m>) null), this);
                        if (g != aVar) {
                            g = C13598b0.f38549a;
                        }
                        if (g == aVar) {
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

            @C91590f(mo125468c = "com.tencent.mm.data.ImageQuerySDKCore$startIdentify$1$1$1$3", mo125469f = "ImageQuerySDKCore.kt", mo125470l = {125}, mo125471m = "invokeSuspend")
            /* renamed from: gk.r$c$a$c */
            public static final class C59510c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

                /* renamed from: d */
                public int f170080d;

                /* renamed from: e */
                public final /* synthetic */ QueryImageData f170081e;

                /* renamed from: f */
                public final /* synthetic */ Buffer f170082f;

                /* renamed from: g */
                public final /* synthetic */ Bitmap f170083g;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C59510c(QueryImageData queryImageData, Buffer buffer, Bitmap bitmap, C15601d<? super C59510c> dVar) {
                    super(2, dVar);
                    this.f170081e = queryImageData;
                    this.f170082f = buffer;
                    this.f170083g = bitmap;
                }

                public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                    return new C59510c(this.f170081e, this.f170082f, this.f170083g, dVar);
                }

                public Object invoke(Object obj, Object obj2) {
                    return ((C59510c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
                }

                public final Object invokeSuspend(Object obj) {
                    C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                    int i = this.f170080d;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        Log.m105924i("MicroMsg.ImageQuerySDKCore", Thread.currentThread().getName() + ", per Image to applyOcrReq");
                        C59503r rVar = C59503r.f170040a;
                        QueryImageData queryImageData = this.f170081e;
                        Buffer buffer = this.f170082f;
                        int width = this.f170083g.getWidth();
                        int height = this.f170083g.getHeight();
                        this.f170080d = 1;
                        rVar.getClass();
                        Object g = C53895h.m60469g(C54328a.f152462f, new C59499o(buffer, width, height, queryImageData, (C15601d<? super C59499o>) null), this);
                        if (g != aVar) {
                            g = C13598b0.f38549a;
                        }
                        if (g == aVar) {
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
            public C59507a(QueryImageData queryImageData, Buffer buffer, Bitmap bitmap, C15601d<? super C59507a> dVar) {
                super(2, dVar);
                this.f170073e = queryImageData;
                this.f170074f = buffer;
                this.f170075g = bitmap;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                C59507a aVar = new C59507a(this.f170073e, this.f170074f, this.f170075g, dVar);
                aVar.f170072d = obj;
                return aVar;
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C59507a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                C0000n0 n0Var = (C0000n0) this.f170072d;
                C53896h0 h0Var = C53872d1.f151117a;
                C53895h.m60466d(n0Var, C58901s.f168555a, (C53934p0) null, new C59508a((C15601d<? super C59508a>) null), 2, (Object) null);
                C53895h.m60466d(n0Var, (C66212f) null, (C53934p0) null, new C59509b(this.f170073e, this.f170074f, this.f170075g, (C15601d<? super C59509b>) null), 3, (Object) null);
                C53895h.m60466d(n0Var, (C66212f) null, (C53934p0) null, new C59510c(this.f170073e, this.f170074f, this.f170075g, (C15601d<? super C59510c>) null), 3, (Object) null);
                return C13598b0.f38549a;
            }
        }

        @C91590f(mo125468c = "com.tencent.mm.data.ImageQuerySDKCore$startIdentify$1$2", mo125469f = "ImageQuerySDKCore.kt", mo125470l = {139}, mo125471m = "invokeSuspend")
        /* renamed from: gk.r$c$b */
        public static final class C59511b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public int f170084d;

            public C59511b(C15601d<? super C59511b> dVar) {
                super(2, dVar);
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C59511b(dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                C0000n0 n0Var = (C0000n0) obj;
                return new C59511b((C15601d) obj2).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f170084d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    StringBuilder sb = new StringBuilder();
                    sb.append(Thread.currentThread().getName());
                    sb.append(", if need do last cluster, ");
                    ArrayList<QueryImageData> arrayList = C59503r.f170048i;
                    sb.append(arrayList.size());
                    Log.m105924i("MicroMsg.ImageQuerySDKCore", sb.toString());
                    if (arrayList.size() <= 0 || C59503r.f170047h) {
                        C59479c cVar = C59479c.STOP;
                        C59503r.f170053n = cVar;
                        C59481e eVar = C59491j.f169998c;
                        if (eVar != null) {
                            Log.m105924i("MicroMsg.ImageDataManager", "postFinishType");
                            eVar.f169967g.postValue(cVar);
                        }
                        long currentTimeMillis = System.currentTimeMillis();
                        Log.m105924i("MicroMsg.ImageQuerySDKCore", "all image identify is finish >> timeStamp: " + currentTimeMillis);
                        C60283e.f171878a.mo85270a(4, C59503r.f170054o, currentTimeMillis);
                        C60280b.f171844a.mo85256a(4);
                    } else {
                        Log.m105924i("MicroMsg.ImageQuerySDKCore", "need to do last cluster");
                        C59503r.f170047h = true;
                        C59503r.f170053n = C59479c.LAST_CLUSTER;
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.addAll(arrayList);
                        arrayList.clear();
                        long currentTimeMillis2 = System.currentTimeMillis();
                        Log.m105924i("MicroMsg.ImageQueryConsumeTimeReporter", "setClusterPerStartTimeStamp >> timeStamp: " + currentTimeMillis2);
                        C60280b.f171852i = currentTimeMillis2;
                        C59503r rVar = C59503r.f170040a;
                        this.f170084d = 1;
                        rVar.getClass();
                        Object g = C53895h.m60469g(C54328a.f152462f, new C59493l(arrayList2, (C15601d<? super C59493l>) null), this);
                        if (g != aVar) {
                            g = C13598b0.f38549a;
                        }
                        if (g == aVar) {
                            return aVar;
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

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59506c(ArrayList<QueryImageData> arrayList, C15601d<? super C59506c> dVar) {
            super(2, dVar);
            this.f170071h = arrayList;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C59506c cVar = new C59506c(this.f170071h, dVar);
            cVar.f170070g = obj;
            return cVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C59506c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x0056  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                int r1 = r13.f170069f
                r2 = 2
                r3 = 0
                r4 = 1
                java.lang.String r5 = "it.scanImagePath"
                java.lang.String r6 = "MicroMsg.ImageQuerySDKCore"
                if (r1 == 0) goto L_0x0035
                if (r1 == r4) goto L_0x001e
                if (r1 != r2) goto L_0x0016
                kotlin.ResultKt.throwOnFailure(r14)
                goto L_0x00da
            L_0x0016:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L_0x001e:
                java.lang.Object r1 = r13.f170068e
                com.tencent.mm.api.QueryImageData r1 = (com.tencent.p014mm.api.QueryImageData) r1
                java.lang.Object r7 = r13.f170067d
                java.util.Iterator r7 = (java.util.Iterator) r7
                java.lang.Object r8 = r13.f170070g
                a14.n0 r8 = (a14.C0000n0) r8
                kotlin.ResultKt.throwOnFailure(r14)
                r9 = r8
                r8 = r7
                r7 = r6
                r6 = r5
                r5 = r1
                r1 = r0
                r0 = r13
                goto L_0x0093
            L_0x0035:
                kotlin.ResultKt.throwOnFailure(r14)
                java.lang.Object r14 = r13.f170070g
                a14.n0 r14 = (a14.C0000n0) r14
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                java.lang.String r1 = r1.getName()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)
                java.util.ArrayList<com.tencent.mm.api.QueryImageData> r1 = r13.f170071h
                java.util.Iterator r1 = r1.iterator()
                r8 = r14
                r7 = r1
                r14 = r13
            L_0x0050:
                boolean r1 = r7.hasNext()
                if (r1 == 0) goto L_0x00c2
                java.lang.Object r1 = r7.next()
                com.tencent.mm.api.QueryImageData r1 = (com.tencent.p014mm.api.QueryImageData) r1
                boolean r9 = a14.C53930o0.m60560g(r8)
                if (r9 != 0) goto L_0x006a
                java.lang.String r14 = "job is cancel"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r14)
                rx3.b0 r14 = rx3.C13598b0.f38549a
                return r14
            L_0x006a:
                gk.r r9 = p157gk.C59503r.f170040a
                java.lang.String r10 = r1.f154726g
                gy3.C87412m.m108593f(r10, r5)
                r14.f170070g = r8
                r14.f170067d = r7
                r14.f170068e = r1
                r14.f170069f = r4
                r9.getClass()
                au3.a r9 = au3.C54328a.f152462f
                gk.s r11 = new gk.s
                r11.<init>(r10, r4, r3)
                java.lang.Object r9 = a14.C53895h.m60469g(r9, r11, r14)
                if (r9 != r0) goto L_0x008a
                return r0
            L_0x008a:
                r12 = r0
                r0 = r14
                r14 = r9
                r9 = r8
                r8 = r7
                r7 = r6
                r6 = r5
                r5 = r1
                r1 = r12
            L_0x0093:
                android.util.Pair r14 = (android.util.Pair) r14
                java.lang.Object r10 = r14.first
                java.nio.Buffer r10 = (java.nio.Buffer) r10
                java.lang.Object r14 = r14.second
                android.graphics.Bitmap r14 = (android.graphics.Bitmap) r14
                if (r14 == 0) goto L_0x00ab
                if (r10 != 0) goto L_0x00a2
                goto L_0x00ab
            L_0x00a2:
                gk.r$c$a r11 = new gk.r$c$a
                r11.<init>(r5, r10, r14, r3)
                a14.C53895h.m60468f(r3, r11, r4, r3)
                goto L_0x00bb
            L_0x00ab:
                java.lang.String r14 = "startIdentify >> decode error"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r14)
                com.tencent.mm.storage.a4 r14 = com.tencent.p014mm.storage.C57593a4.f164912a
                java.lang.String r5 = r5.f154726g
                gy3.C87412m.m108593f(r5, r6)
                r14.mo81937b(r5)
            L_0x00bb:
                r14 = r0
                r0 = r1
                r5 = r6
                r6 = r7
                r7 = r8
                r8 = r9
                goto L_0x0050
            L_0x00c2:
                a14.h0 r1 = a14.C53872d1.f151117a
                a14.k2 r1 = f14.C58901s.f168555a
                gk.r$c$b r4 = new gk.r$c$b
                r4.<init>(r3)
                r14.f170070g = r3
                r14.f170067d = r3
                r14.f170068e = r3
                r14.f170069f = r2
                java.lang.Object r14 = a14.C53895h.m60469g(r1, r4, r14)
                if (r14 != r0) goto L_0x00da
                return r0
            L_0x00da:
                rx3.b0 r14 = rx3.C13598b0.f38549a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: p157gk.C59503r.C59506c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.data.ImageQuerySDKCore", mo125469f = "ImageQuerySDKCore.kt", mo125470l = {509}, mo125471m = "stopCurrentRoomQuery")
    /* renamed from: gk.r$d */
    public static final class C59512d extends C66704d {

        /* renamed from: d */
        public Object f170085d;

        /* renamed from: e */
        public /* synthetic */ Object f170086e;

        /* renamed from: f */
        public final /* synthetic */ C59503r f170087f;

        /* renamed from: g */
        public int f170088g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59512d(C59503r rVar, C15601d<? super C59512d> dVar) {
            super(dVar);
            this.f170087f = rVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f170086e = obj;
            this.f170088g |= Integer.MIN_VALUE;
            return this.f170087f.mo84589j(this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.data.ImageQuerySDKCore", mo125469f = "ImageQuerySDKCore.kt", mo125470l = {396, 413}, mo125471m = "writeClusterDataToStorage")
    /* renamed from: gk.r$e */
    public static final class C59513e extends C66704d {

        /* renamed from: d */
        public Object f170089d;

        /* renamed from: e */
        public Object f170090e;

        /* renamed from: f */
        public Object f170091f;

        /* renamed from: g */
        public /* synthetic */ Object f170092g;

        /* renamed from: h */
        public final /* synthetic */ C59503r f170093h;

        /* renamed from: i */
        public int f170094i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59513e(C59503r rVar, C15601d<? super C59513e> dVar) {
            super(dVar);
            this.f170093h = rVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f170092g = obj;
            this.f170094i |= Integer.MIN_VALUE;
            C59503r rVar = this.f170093h;
            C59503r rVar2 = C59503r.f170040a;
            return rVar.mo84590k(this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.data.ImageQuerySDKCore$writeClusterDataToStorage$2$1$1", mo125469f = "ImageQuerySDKCore.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: gk.r$f */
    public static final class C59514f extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ QueryImageData f170095d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59514f(QueryImageData queryImageData, C15601d<? super C59514f> dVar) {
            super(2, dVar);
            this.f170095d = queryImageData;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C59514f(this.f170095d, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C59514f) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            C57593a4 a4Var = C57593a4.f164912a;
            QueryImageData queryImageData = this.f170095d;
            C87412m.m108593f(queryImageData, "image");
            a4Var.mo81945j(queryImageData, C59491j.f169997b);
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.data.ImageQuerySDKCore$writeClusterDataToStorage$3$1$1", mo125469f = "ImageQuerySDKCore.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: gk.r$g */
    public static final class C59515g extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ QueryImageData f170096d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59515g(QueryImageData queryImageData, C15601d<? super C59515g> dVar) {
            super(2, dVar);
            this.f170096d = queryImageData;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C59515g(this.f170096d, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C59515g) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            C57593a4 a4Var = C57593a4.f164912a;
            QueryImageData queryImageData = this.f170096d;
            C87412m.m108593f(queryImageData, "image");
            a4Var.mo81945j(queryImageData, C59491j.f169997b);
            return C13598b0.f38549a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: android.util.Pair} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01a9 A[Catch:{ f -> 0x01c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01ab A[Catch:{ f -> 0x01c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01db  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0202  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0261  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m69405a(p157gk.C59503r r18, java.util.ArrayList r19, wx3.C15601d r20) {
        /*
            r0 = r20
            r18.getClass()
            boolean r1 = r0 instanceof p157gk.C59501p
            if (r1 == 0) goto L_0x001a
            r1 = r0
            gk.p r1 = (p157gk.C59501p) r1
            int r2 = r1.f170038p
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x001a
            int r2 = r2 - r3
            r1.f170038p = r2
            r2 = r18
            goto L_0x0021
        L_0x001a:
            gk.p r1 = new gk.p
            r2 = r18
            r1.<init>(r2, r0)
        L_0x0021:
            java.lang.Object r0 = r1.f170036n
            xx3.a r3 = xx3.C15911a.COROUTINE_SUSPENDED
            int r4 = r1.f170038p
            java.lang.String r5 = "MicroMsg.ImageQuerySDKCore"
            r7 = 3
            r8 = 2
            r9 = 0
            r10 = 1
            if (r4 == 0) goto L_0x0091
            if (r4 == r10) goto L_0x0069
            if (r4 == r8) goto L_0x0050
            if (r4 != r7) goto L_0x0048
            java.lang.Object r2 = r1.f170031f
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r4 = r1.f170030e
            java.util.Iterator r4 = (java.util.Iterator) r4
            java.lang.Object r6 = r1.f170029d
            gk.r r6 = (p157gk.C59503r) r6
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r4
            r4 = 3
            goto L_0x0236
        L_0x0048:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0050:
            int r2 = r1.f170034i
            java.lang.Object r4 = r1.f170031f
            java.util.Iterator r4 = (java.util.Iterator) r4
            java.lang.Object r11 = r1.f170030e
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            java.lang.Object r12 = r1.f170029d
            gk.r r12 = (p157gk.C59503r) r12
            kotlin.ResultKt.throwOnFailure(r0)     // Catch:{ f -> 0x008e }
            r13 = r4
        L_0x0062:
            r6 = r5
            r0 = r11
            r5 = r3
            r3 = r2
            r2 = r12
            goto L_0x0131
        L_0x0069:
            int r2 = r1.f170035j
            int r4 = r1.f170034i
            java.lang.Object r11 = r1.f170033h
            c30.g r11 = (c30.C104289g) r11
            java.lang.Object r12 = r1.f170032g
            android.util.Pair r12 = (android.util.Pair) r12
            java.lang.Object r13 = r1.f170031f
            java.util.Iterator r13 = (java.util.Iterator) r13
            java.lang.Object r14 = r1.f170030e
            java.util.ArrayList r14 = (java.util.ArrayList) r14
            java.lang.Object r15 = r1.f170029d
            gk.r r15 = (p157gk.C59503r) r15
            kotlin.ResultKt.throwOnFailure(r0)     // Catch:{ f -> 0x008a }
            r6 = r5
            r0 = r14
            r5 = r3
            r3 = r4
            goto L_0x018d
        L_0x008a:
            r2 = r4
            r4 = r13
            r11 = r14
            r12 = r15
        L_0x008e:
            r13 = r4
            goto L_0x01d0
        L_0x0091:
            kotlin.ResultKt.throwOnFailure(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "clusterDataBack : "
            r0.append(r4)
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            java.lang.String r4 = r4.getName()
            r0.append(r4)
            java.lang.String r4 = "  result size "
            r0.append(r4)
            if (r19 == 0) goto L_0x00ba
            int r4 = r19.size()
            java.lang.Integer r11 = new java.lang.Integer
            r11.<init>(r4)
            goto L_0x00bb
        L_0x00ba:
            r11 = r9
        L_0x00bb:
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            java.util.HashSet<java.lang.String> r0 = f170055p
            int r0 = r0.size()
            long r11 = (long) r0
            long r13 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "stopPerCluster >> startTimeStamp: "
            r0.append(r4)
            long r6 = ig3.C60280b.f171852i
            r0.append(r6)
            java.lang.String r6 = ", stopTimeStamp: "
            r0.append(r6)
            r0.append(r13)
            java.lang.String r6 = ", perNum: "
            r0.append(r6)
            r0.append(r11)
            java.lang.String r6 = ", before totalNum: "
            r0.append(r6)
            long r6 = ig3.C60280b.f171854k
            r0.append(r6)
            java.lang.String r6 = ", before totalTime: "
            r0.append(r6)
            long r6 = ig3.C60280b.f171853j
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r6 = "MicroMsg.ImageQueryConsumeTimeReporter"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            long r15 = ig3.C60280b.f171852i
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 >= 0) goto L_0x011a
            java.lang.String r0 = "stopPerCluster >> time error"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)
            goto L_0x0125
        L_0x011a:
            long r6 = ig3.C60280b.f171854k
            long r6 = r6 + r11
            ig3.C60280b.f171854k = r6
            long r6 = ig3.C60280b.f171853j
            long r13 = r13 - r15
            long r6 = r6 + r13
            ig3.C60280b.f171853j = r6
        L_0x0125:
            if (r19 == 0) goto L_0x01de
            java.util.Iterator r0 = r19.iterator()
            r13 = r0
            r6 = r5
            r0 = r19
            r5 = r3
            r3 = 0
        L_0x0131:
            boolean r7 = r13.hasNext()
            if (r7 == 0) goto L_0x01db
            java.lang.Object r7 = r13.next()
            int r11 = r3 + 1
            if (r3 < 0) goto L_0x01d7
            r12 = r7
            android.util.Pair r12 = (android.util.Pair) r12
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r14 = "clusterDataBack >> "
            r7.append(r14)
            java.lang.Object r14 = r12.first
            java.lang.String r14 = (java.lang.String) r14
            r7.append(r14)
            java.lang.String r14 = "***"
            r7.append(r14)
            java.lang.Object r14 = r12.second
            java.lang.String r14 = (java.lang.String) r14
            r7.append(r14)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r7)
            c30.g r7 = new c30.g     // Catch:{ f -> 0x01cb }
            java.lang.Object r14 = r12.first     // Catch:{ f -> 0x01cb }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ f -> 0x01cb }
            r7.<init>((java.lang.String) r14)     // Catch:{ f -> 0x01cb }
            gk.r r14 = f170040a     // Catch:{ f -> 0x01cb }
            r1.f170029d = r2     // Catch:{ f -> 0x01cb }
            r1.f170030e = r0     // Catch:{ f -> 0x01cb }
            r1.f170031f = r13     // Catch:{ f -> 0x01cb }
            r1.f170032g = r12     // Catch:{ f -> 0x01cb }
            r1.f170033h = r7     // Catch:{ f -> 0x01cb }
            r1.f170034i = r11     // Catch:{ f -> 0x01cb }
            r1.f170035j = r3     // Catch:{ f -> 0x01cb }
            r1.f170038p = r10     // Catch:{ f -> 0x01cb }
            java.lang.Object r14 = r14.mo84584e(r7, r1)     // Catch:{ f -> 0x01cb }
            if (r14 != r5) goto L_0x0189
            goto L_0x029c
        L_0x0189:
            r15 = r2
            r2 = r3
            r3 = r11
            r11 = r7
        L_0x018d:
            gk.r r7 = f170040a     // Catch:{ f -> 0x01c5 }
            java.lang.String r14 = "label"
            long r16 = r11.optLong(r14)     // Catch:{ f -> 0x01c5 }
            java.lang.String r11 = java.lang.String.valueOf(r16)     // Catch:{ f -> 0x01c5 }
            java.lang.Object r12 = r12.second     // Catch:{ f -> 0x01c5 }
            java.lang.String r14 = "pair.second"
            gy3.C87412m.m108593f(r12, r14)     // Catch:{ f -> 0x01c5 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ f -> 0x01c5 }
            int r14 = r0.size()     // Catch:{ f -> 0x01c5 }
            int r14 = r14 - r10
            if (r2 != r14) goto L_0x01ab
            r2 = 1
            goto L_0x01ac
        L_0x01ab:
            r2 = 0
        L_0x01ac:
            r1.f170029d = r15     // Catch:{ f -> 0x01c5 }
            r1.f170030e = r0     // Catch:{ f -> 0x01c5 }
            r1.f170031f = r13     // Catch:{ f -> 0x01c5 }
            r1.f170032g = r9     // Catch:{ f -> 0x01c5 }
            r1.f170033h = r9     // Catch:{ f -> 0x01c5 }
            r1.f170034i = r3     // Catch:{ f -> 0x01c5 }
            r1.f170038p = r8     // Catch:{ f -> 0x01c5 }
            java.lang.Object r2 = r7.mo84585f(r11, r12, r2, r1)     // Catch:{ f -> 0x01c5 }
            if (r2 != r5) goto L_0x01c2
            goto L_0x029c
        L_0x01c2:
            r2 = r15
            goto L_0x0131
        L_0x01c5:
            r11 = r0
            r2 = r3
            r3 = r5
            r5 = r6
            r12 = r15
            goto L_0x01d0
        L_0x01cb:
            r12 = r2
            r3 = r5
            r5 = r6
            r2 = r11
            r11 = r0
        L_0x01d0:
            java.lang.String r0 = "cluster data back parse crop json is error"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
            goto L_0x0062
        L_0x01d7:
            sx3.C64197v.m75542k()
            throw r9
        L_0x01db:
            r3 = r5
            r5 = r6
            goto L_0x01e0
        L_0x01de:
            r0 = r19
        L_0x01e0:
            if (r0 == 0) goto L_0x01e8
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x029a
        L_0x01e8:
            java.lang.String r0 = "cluster result is empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            java.util.HashSet r0 = new java.util.HashSet
            java.util.HashSet<java.lang.String> r6 = f170055p
            r0.<init>(r6)
            r6.clear()
            java.util.Iterator r0 = r0.iterator()
            r6 = r2
        L_0x01fc:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x025b
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            java.util.HashMap<java.lang.String, com.tencent.mm.api.QueryImageData> r7 = f170045f
            java.lang.Object r7 = r7.get(r2)
            com.tencent.mm.api.QueryImageData r7 = (com.tencent.p014mm.api.QueryImageData) r7
            if (r7 == 0) goto L_0x0240
            java.lang.String r8 = ""
            r7.f154727h = r8
            r7.f154728i = r8
            r7.f154729j = r8
            au3.d r8 = au3.C54331d.f152465f
            gk.q r10 = new gk.q
            r10.<init>(r7, r9)
            r1.f170029d = r6
            r1.f170030e = r0
            r1.f170031f = r2
            r1.f170032g = r9
            r1.f170033h = r9
            r4 = 3
            r1.f170038p = r4
            java.lang.Object r7 = a14.C53895h.m60469g(r8, r10, r1)
            if (r7 != r3) goto L_0x0236
            r5 = r3
            goto L_0x029c
        L_0x0236:
            int r7 = f170054o
            int r8 = r7 + 1
            f170054o = r8
            yx3.C66703b.m78687a(r7)
            goto L_0x0255
        L_0x0240:
            r4 = 3
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "result is null, clusterPerTimeToIdentify, personImageMap no contain "
            r7.append(r8)
            r7.append(r2)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r7)
        L_0x0255:
            java.util.HashMap<java.lang.String, com.tencent.mm.api.QueryImageData> r7 = f170045f
            r7.remove(r2)
            goto L_0x01fc
        L_0x025b:
            gk.c r0 = f170053n
            gk.c r1 = p157gk.C59479c.LAST_CLUSTER
            if (r0 != r1) goto L_0x029a
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "IdentifyType.LAST_CLUSTER to update to stop, and the lastImage is political all image identify is finish >> timeStamp: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r2)
            gk.c r2 = p157gk.C59479c.STOP
            f170053n = r2
            gk.e r3 = p157gk.C59491j.f169998c
            if (r3 == 0) goto L_0x028d
            java.lang.String r4 = "MicroMsg.ImageDataManager"
            java.lang.String r5 = "postFinishType"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            androidx.lifecycle.z<gk.c> r3 = r3.f169967g
            r3.postValue(r2)
        L_0x028d:
            ig3.e r2 = ig3.C60283e.f171878a
            int r3 = f170054o
            r4 = 4
            r2.mo85270a(r4, r3, r0)
            ig3.b r0 = ig3.C60280b.f171844a
            r0.mo85256a(r4)
        L_0x029a:
            rx3.b0 r5 = rx3.C13598b0.f38549a
        L_0x029c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p157gk.C59503r.m69405a(gk.r, java.util.ArrayList, wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m69406b(p157gk.C59503r r17, com.tencent.p014mm.api.QueryImageData r18, java.lang.String r19, wx3.C15601d r20) {
        /*
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r17.getClass()
            boolean r4 = r3 instanceof p157gk.C59517t
            if (r4 == 0) goto L_0x001e
            r4 = r3
            gk.t r4 = (p157gk.C59517t) r4
            int r5 = r4.f170103h
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001e
            int r5 = r5 - r6
            r4.f170103h = r5
            goto L_0x0023
        L_0x001e:
            gk.t r4 = new gk.t
            r4.<init>(r0, r3)
        L_0x0023:
            java.lang.Object r3 = r4.f170101f
            xx3.a r5 = xx3.C15911a.COROUTINE_SUSPENDED
            int r6 = r4.f170103h
            r7 = 1
            if (r6 == 0) goto L_0x003f
            if (r6 != r7) goto L_0x0037
            java.lang.Object r0 = r4.f170100e
            com.tencent.mm.api.QueryImageData r0 = (com.tencent.p014mm.api.QueryImageData) r0
            kotlin.ResultKt.throwOnFailure(r3)
            goto L_0x011b
        L_0x0037:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003f:
            kotlin.ResultKt.throwOnFailure(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            java.lang.String r6 = r6.getName()
            r3.append(r6)
            java.lang.String r6 = ", label data back， labelId: "
            r3.append(r6)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            java.lang.String r6 = "MicroMsg.ImageQuerySDKCore"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r3)
            long r8 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r10 = "stopPerCls >> startTimeStamp: "
            r3.append(r10)
            long r10 = ig3.C60280b.f171846c
            r3.append(r10)
            java.lang.String r10 = ", stopTimeStamp: "
            r3.append(r10)
            r3.append(r8)
            java.lang.String r10 = ", before totalNum: "
            r3.append(r10)
            long r10 = ig3.C60280b.f171848e
            r3.append(r10)
            java.lang.String r10 = ", before totalTime: "
            r3.append(r10)
            long r10 = ig3.C60280b.f171847d
            r3.append(r10)
            java.lang.String r3 = r3.toString()
            java.lang.String r10 = "MicroMsg.ImageQueryConsumeTimeReporter"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r3)
            long r11 = ig3.C60280b.f171846c
            int r3 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r3 >= 0) goto L_0x00a9
            java.lang.String r3 = "stopPerCls >> time error"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r3)
            goto L_0x00b6
        L_0x00a9:
            long r13 = ig3.C60280b.f171848e
            r15 = 1
            long r13 = r13 + r15
            ig3.C60280b.f171848e = r13
            long r13 = ig3.C60280b.f171847d
            long r8 = r8 - r11
            long r13 = r13 + r8
            ig3.C60280b.f171847d = r13
        L_0x00b6:
            java.util.HashMap<java.lang.String, com.tencent.mm.api.QueryImageData> r3 = f170044e
            java.lang.String r8 = r1.f154726g
            boolean r8 = r3.containsKey(r8)
            if (r8 == 0) goto L_0x0128
            java.lang.String r8 = r1.f154726g
            java.lang.Object r8 = r3.get(r8)
            com.tencent.mm.api.QueryImageData r8 = (com.tencent.p014mm.api.QueryImageData) r8
            if (r8 != 0) goto L_0x00cb
            goto L_0x00cd
        L_0x00cb:
            r8.f154727h = r2
        L_0x00cd:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r8 = "labelDataBack: "
            r2.append(r8)
            java.lang.String r8 = r1.f154726g
            java.lang.Object r8 = r3.get(r8)
            com.tencent.mm.api.QueryImageData r8 = (com.tencent.p014mm.api.QueryImageData) r8
            r9 = 0
            if (r8 == 0) goto L_0x00e5
            java.lang.String r8 = r8.f154727h
            goto L_0x00e6
        L_0x00e5:
            r8 = r9
        L_0x00e6:
            r2.append(r8)
            java.lang.String r8 = "***"
            r2.append(r8)
            java.lang.String r8 = r1.f154726g
            java.lang.Object r3 = r3.get(r8)
            com.tencent.mm.api.QueryImageData r3 = (com.tencent.p014mm.api.QueryImageData) r3
            if (r3 == 0) goto L_0x00fb
            java.lang.String r3 = r3.f154729j
            goto L_0x00fc
        L_0x00fb:
            r3 = r9
        L_0x00fc:
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r2)
            au3.d r2 = au3.C54331d.f152465f
            gk.u r3 = new gk.u
            r3.<init>(r1, r9)
            r4.f170099d = r0
            r4.f170100e = r1
            r4.f170103h = r7
            java.lang.Object r0 = a14.C53895h.m60469g(r2, r3, r4)
            if (r0 != r5) goto L_0x011a
            goto L_0x0154
        L_0x011a:
            r0 = r1
        L_0x011b:
            int r1 = f170054o
            int r1 = r1 + r7
            f170054o = r1
            java.util.HashMap<java.lang.String, com.tencent.mm.api.QueryImageData> r1 = f170044e
            java.lang.String r0 = r0.f154726g
            r1.remove(r0)
            goto L_0x0152
        L_0x0128:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "labelDataBack, no add, "
            r0.append(r4)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            java.util.HashMap<java.lang.String, com.tencent.mm.api.QueryImageData> r0 = f170045f
            java.lang.String r4 = r1.f154726g
            boolean r0 = r0.containsKey(r4)
            if (r0 != 0) goto L_0x0152
            java.lang.String r0 = r1.f154726g
            java.lang.String r4 = "imageData.scanImagePath"
            gy3.C87412m.m108593f(r0, r4)
            r1.f154727h = r2
            r3.put(r0, r1)
        L_0x0152:
            rx3.b0 r5 = rx3.C13598b0.f38549a
        L_0x0154:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p157gk.C59503r.m69406b(gk.r, com.tencent.mm.api.QueryImageData, java.lang.String, wx3.d):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: com.tencent.mm.api.QueryImageData} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m69407c(p157gk.C59503r r6, com.tencent.p014mm.api.QueryImageData r7, java.lang.String r8, wx3.C15601d r9) {
        /*
            r6.getClass()
            boolean r0 = r9 instanceof p157gk.C59519v
            if (r0 == 0) goto L_0x0016
            r0 = r9
            gk.v r0 = (p157gk.C59519v) r0
            int r1 = r0.f170109h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.f170109h = r1
            goto L_0x001b
        L_0x0016:
            gk.v r0 = new gk.v
            r0.<init>(r6, r9)
        L_0x001b:
            java.lang.Object r9 = r0.f170107f
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f170109h
            r3 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            java.lang.Object r6 = r0.f170106e
            r7 = r6
            com.tencent.mm.api.QueryImageData r7 = (com.tencent.p014mm.api.QueryImageData) r7
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x00cf
        L_0x0030:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0038:
            kotlin.ResultKt.throwOnFailure(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r2 = r2.getName()
            r9.append(r2)
            java.lang.String r2 = ", ocr data back， ocrResult："
            r9.append(r2)
            r9.append(r8)
            java.lang.String r9 = r9.toString()
            java.lang.String r2 = "MicroMsg.ImageQuerySDKCore"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r9)
            java.util.HashMap<java.lang.String, com.tencent.mm.api.QueryImageData> r9 = f170044e
            java.lang.String r4 = r7.f154726g
            boolean r4 = r9.containsKey(r4)
            r5 = 0
            if (r4 == 0) goto L_0x00dc
            int r4 = r8.length()
            if (r4 <= 0) goto L_0x006e
            r5 = 1
        L_0x006e:
            if (r5 == 0) goto L_0x0075
            ig3.b r4 = ig3.C60280b.f171844a
            r4.mo85257b()
        L_0x0075:
            java.lang.String r4 = r7.f154726g
            java.lang.Object r4 = r9.get(r4)
            com.tencent.mm.api.QueryImageData r4 = (com.tencent.p014mm.api.QueryImageData) r4
            if (r4 != 0) goto L_0x0080
            goto L_0x0082
        L_0x0080:
            r4.f154729j = r8
        L_0x0082:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r4 = "ocrDataBack: "
            r8.append(r4)
            java.lang.String r4 = r7.f154726g
            java.lang.Object r4 = r9.get(r4)
            com.tencent.mm.api.QueryImageData r4 = (com.tencent.p014mm.api.QueryImageData) r4
            r5 = 0
            if (r4 == 0) goto L_0x009a
            java.lang.String r4 = r4.f154727h
            goto L_0x009b
        L_0x009a:
            r4 = r5
        L_0x009b:
            r8.append(r4)
            java.lang.String r4 = "***"
            r8.append(r4)
            java.lang.String r4 = r7.f154726g
            java.lang.Object r9 = r9.get(r4)
            com.tencent.mm.api.QueryImageData r9 = (com.tencent.p014mm.api.QueryImageData) r9
            if (r9 == 0) goto L_0x00b0
            java.lang.String r9 = r9.f154729j
            goto L_0x00b1
        L_0x00b0:
            r9 = r5
        L_0x00b1:
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r8)
            au3.d r8 = au3.C54331d.f152465f
            gk.w r9 = new gk.w
            r9.<init>(r7, r5)
            r0.f170105d = r6
            r0.f170106e = r7
            r0.f170109h = r3
            java.lang.Object r6 = a14.C53895h.m60469g(r8, r9, r0)
            if (r6 != r1) goto L_0x00cf
            goto L_0x0117
        L_0x00cf:
            int r6 = f170054o
            int r6 = r6 + r3
            f170054o = r6
            java.util.HashMap<java.lang.String, com.tencent.mm.api.QueryImageData> r6 = f170044e
            java.lang.String r7 = r7.f154726g
            r6.remove(r7)
            goto L_0x0115
        L_0x00dc:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "ocr data back no add，ocrResult："
            r6.append(r0)
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r6)
            java.util.HashMap<java.lang.String, com.tencent.mm.api.QueryImageData> r6 = f170045f
            java.lang.String r0 = r7.f154726g
            boolean r6 = r6.containsKey(r0)
            if (r6 != 0) goto L_0x0115
            int r6 = r8.length()
            if (r6 <= 0) goto L_0x0101
            goto L_0x0102
        L_0x0101:
            r3 = 0
        L_0x0102:
            if (r3 == 0) goto L_0x0109
            ig3.b r6 = ig3.C60280b.f171844a
            r6.mo85257b()
        L_0x0109:
            java.lang.String r6 = r7.f154726g
            java.lang.String r0 = "imageData.scanImagePath"
            gy3.C87412m.m108593f(r6, r0)
            r7.f154729j = r8
            r9.put(r6, r7)
        L_0x0115:
            rx3.b0 r1 = rx3.C13598b0.f38549a
        L_0x0117:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p157gk.C59503r.m69407c(gk.r, com.tencent.mm.api.QueryImageData, java.lang.String, wx3.d):java.lang.Object");
    }

    /* renamed from: d */
    public final void mo84583d() {
        long j;
        C54526i iVar = C54526i.f152882a;
        if (!iVar.mo75389a() || !iVar.mo75390b()) {
            Log.m105924i("MicroMsg.ImageQuerySDKCore", "checkInit >> entrance is close");
        } else if (f170042c == null) {
            long currentTimeMillis = System.currentTimeMillis();
            Log.m105924i("MicroMsg.ImageQuerySDKCore", "checkInit, " + currentTimeMillis);
            C60786a aVar = new C60786a();
            f170042c = aVar;
            Log.m105924i("MicroMsg.WeChatClsManager", APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
            C12025f IR = ((C62571i) C86312j.m106911c(C62571i.class)).mo87567IR();
            String a = IR.mo11889a("MODEL_CHAT_CLS_MODEL");
            String a2 = IR.mo11889a("MODEL_CHAT_CLS_MAP");
            String a3 = IR.mo11889a("MODEL_FACE_DETECT");
            String a4 = IR.mo11889a("MODEL_FACE_ALIGNMENT");
            String a5 = IR.mo11889a("MODEL_FACE_FEATURE");
            String a6 = IR.mo11889a("MODEL_FACE3D_XBIN");
            String a7 = IR.mo11889a("MODEL_MOBILE_POLICY_DB");
            String a8 = IR.mo11889a("MODEL_OCR_DET");
            String a9 = IR.mo11889a("MODEL_OCR_REC_MODEL");
            String a15 = IR.mo11889a("MODEL_OCR_REC_MAP");
            long nInit = WeChatCls.nInit(a, a2, 2);
            aVar.f173133a = nInit;
            long j2 = currentTimeMillis;
            if (nInit == 0) {
                Log.m105920e("MicroMsg.WeChatClsManager", "init weChatCls error");
            } else {
                Log.m105924i("MicroMsg.WeChatClsManager", "init weChatCls success " + aVar.f173133a);
            }
            long[] nInit2 = WeFaceCluster.nInit(new String[]{a3, a4, a5, a6, a7}, 2);
            if (nInit2 == null || nInit2.length != 2) {
                Log.m105920e("MicroMsg.WeChatClsManager", "init weCluster error");
                j = 0;
                aVar.f173134b = 0;
                aVar.f173135c = 0;
            } else {
                aVar.f173134b = nInit2[0];
                aVar.f173135c = nInit2[1];
                Log.m105924i("MicroMsg.WeChatClsManager", "init weCluster success faceTrackerHandle: " + aVar.f173134b + ", weClusterHandle: " + aVar.f173135c);
                j = 0;
            }
            long nInit3 = WeOcr.nInit(a8, a9, a15);
            aVar.f173136d = nInit3;
            if (nInit3 == j) {
                Log.m105920e("MicroMsg.WeChatClsManager", "init weOcr error");
            } else {
                Log.m105924i("MicroMsg.WeChatClsManager", "init weChatCls success " + aVar.f173136d);
            }
            Log.m105924i("MicroMsg.ImageQuerySDKCore", "checkInit finish, " + (System.currentTimeMillis() - j2));
        }
    }

    /* renamed from: e */
    public final Object mo84584e(C104289g gVar, C15601d<? super C13598b0> dVar) {
        C104289g gVar2 = gVar;
        String optString = gVar2.optString("imagePath");
        double optDouble = gVar2.optDouble("cropX");
        double optDouble2 = gVar2.optDouble("cropY");
        double optDouble3 = gVar2.optDouble("cropWidth");
        double optDouble4 = gVar2.optDouble("cropHeight");
        long optLong = gVar2.optLong("label");
        StringBuilder sb = new StringBuilder();
        sb.append(C86709a0.m107535s().f251807e + "mediaOpt/imageQuery/crop/");
        sb.append(System.currentTimeMillis());
        sb.append(optLong);
        sb.append(".png");
        String sb4 = sb.toString();
        C87412m.m108593f(optString, "imagePath");
        if (optString.length() == 0) {
            Log.m105924i("MicroMsg.ImageQuerySDKCore", "when crop label: " + optLong + " path is empty, is not to update");
            return C13598b0.f38549a;
        }
        Object g = C53895h.m60469g(C54331d.f152465f, new C59504a(sb4, optString, optDouble, optDouble2, optDouble3, optDouble4, optLong, (C15601d<? super C59504a>) null), dVar);
        return g == C15911a.COROUTINE_SUSPENDED ? g : C13598b0.f38549a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo84585f(java.lang.String r10, java.lang.String r11, boolean r12, wx3.C15601d<? super rx3.C13598b0> r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof p157gk.C59503r.C59505b
            if (r0 == 0) goto L_0x0013
            r0 = r13
            gk.r$b r0 = (p157gk.C59503r.C59505b) r0
            int r1 = r0.f170066f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f170066f = r1
            goto L_0x0018
        L_0x0013:
            gk.r$b r0 = new gk.r$b
            r0.<init>(r9, r13)
        L_0x0018:
            java.lang.Object r13 = r0.f170064d
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f170066f
            java.lang.String r3 = "MicroMsg.ImageQuerySDKCore"
            r4 = 1
            if (r2 == 0) goto L_0x0032
            if (r2 != r4) goto L_0x002a
            kotlin.ResultKt.throwOnFailure(r13)     // Catch:{ f -> 0x00c3 }
            goto L_0x00c8
        L_0x002a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0032:
            kotlin.ResultKt.throwOnFailure(r13)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ f -> 0x00c3 }
            r13.<init>()     // Catch:{ f -> 0x00c3 }
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch:{ f -> 0x00c3 }
            java.lang.String r2 = r2.getName()     // Catch:{ f -> 0x00c3 }
            r13.append(r2)     // Catch:{ f -> 0x00c3 }
            java.lang.String r2 = ", dealClusterImage"
            r13.append(r2)     // Catch:{ f -> 0x00c3 }
            java.lang.String r13 = r13.toString()     // Catch:{ f -> 0x00c3 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r13)     // Catch:{ f -> 0x00c3 }
            c30.g r13 = new c30.g     // Catch:{ f -> 0x00c3 }
            r13.<init>((java.lang.String) r11)     // Catch:{ f -> 0x00c3 }
            java.lang.String r11 = "data"
            c30.e r11 = r13.mo110108i(r11)     // Catch:{ f -> 0x00c3 }
            r13 = 0
            int r2 = r11.length()     // Catch:{ f -> 0x00c3 }
        L_0x0061:
            if (r13 >= r2) goto L_0x00b8
            java.lang.String r5 = r11.getString(r13)     // Catch:{ f -> 0x00c3 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ f -> 0x00c3 }
            r6.<init>()     // Catch:{ f -> 0x00c3 }
            java.lang.String r7 = "dealClusterImage >> index: "
            r6.append(r7)     // Catch:{ f -> 0x00c3 }
            r6.append(r13)     // Catch:{ f -> 0x00c3 }
            java.lang.String r7 = ", imagePath: "
            r6.append(r7)     // Catch:{ f -> 0x00c3 }
            r6.append(r5)     // Catch:{ f -> 0x00c3 }
            java.lang.String r6 = r6.toString()     // Catch:{ f -> 0x00c3 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r6)     // Catch:{ f -> 0x00c3 }
            java.util.HashMap<java.lang.String, com.tencent.mm.api.QueryImageData> r6 = f170045f     // Catch:{ f -> 0x00c3 }
            java.lang.String r7 = r11.getString(r13)     // Catch:{ f -> 0x00c3 }
            java.lang.Object r6 = r6.get(r7)     // Catch:{ f -> 0x00c3 }
            com.tencent.mm.api.QueryImageData r6 = (com.tencent.p014mm.api.QueryImageData) r6     // Catch:{ f -> 0x00c3 }
            if (r6 == 0) goto L_0x00b0
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ f -> 0x00c3 }
            r7.<init>()     // Catch:{ f -> 0x00c3 }
            java.lang.String r8 = r6.f154728i     // Catch:{ f -> 0x00c3 }
            r7.append(r8)     // Catch:{ f -> 0x00c3 }
            r7.append(r10)     // Catch:{ f -> 0x00c3 }
            r8 = 35
            r7.append(r8)     // Catch:{ f -> 0x00c3 }
            java.lang.String r7 = r7.toString()     // Catch:{ f -> 0x00c3 }
            r6.f154728i = r7     // Catch:{ f -> 0x00c3 }
            java.util.HashSet<java.lang.String> r7 = f170049j     // Catch:{ f -> 0x00c3 }
            java.lang.String r6 = r6.f154726g     // Catch:{ f -> 0x00c3 }
            r7.add(r6)     // Catch:{ f -> 0x00c3 }
        L_0x00b0:
            java.util.HashSet<java.lang.String> r6 = f170055p     // Catch:{ f -> 0x00c3 }
            r6.remove(r5)     // Catch:{ f -> 0x00c3 }
            int r13 = r13 + 1
            goto L_0x0061
        L_0x00b8:
            if (r12 == 0) goto L_0x00c8
            r0.f170066f = r4     // Catch:{ f -> 0x00c3 }
            java.lang.Object r10 = r9.mo84590k(r0)     // Catch:{ f -> 0x00c3 }
            if (r10 != r1) goto L_0x00c8
            return r1
        L_0x00c3:
            java.lang.String r10 = "cluster data back parse cluster image json is error"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r10)
        L_0x00c8:
            rx3.b0 r10 = rx3.C13598b0.f38549a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p157gk.C59503r.mo84585f(java.lang.String, java.lang.String, boolean, wx3.d):java.lang.Object");
    }

    /* renamed from: g */
    public final ArrayList<Pair<String, ArrayList<Integer>>> mo84586g(String str, boolean z) {
        C87412m.m108594g(str, "labelName");
        String applicationLanguage = LocaleUtil.getApplicationLanguage();
        C60786a aVar = f170042c;
        Integer num = null;
        if (aVar == null) {
            return null;
        }
        C87412m.m108593f(applicationLanguage, "lan");
        long j = aVar.f173133a;
        if (j == 0) {
            Log.m105920e("MicroMsg.WeChatClsManager", "getLabelIdsByLabelName >> weChatClsHandle no init");
            return new ArrayList<>();
        }
        ArrayList<Pair<String, ArrayList<Integer>>> nGetLabelidsByLabelname = WeChatCls.nGetLabelidsByLabelname(j, str, applicationLanguage, z);
        StringBuilder sb = new StringBuilder();
        sb.append("getLabelIdsByLabelName >> ");
        sb.append(str);
        sb.append("  result size:  ");
        if (nGetLabelidsByLabelname != null) {
            num = Integer.valueOf(nGetLabelidsByLabelname.size());
        }
        sb.append(num);
        sb.append(", lan: ");
        sb.append(applicationLanguage);
        Log.m105924i("MicroMsg.WeChatClsManager", sb.toString());
        return nGetLabelidsByLabelname;
    }

    /* renamed from: h */
    public final ArrayList<Pair<String, ArrayList<Integer>>> mo84587h(String str, boolean z) {
        C87412m.m108594g(str, "labelName");
        String applicationLanguage = LocaleUtil.getApplicationLanguage();
        C60786a aVar = f170042c;
        Integer num = null;
        if (aVar == null) {
            return null;
        }
        C87412m.m108593f(applicationLanguage, "lan");
        long j = aVar.f173133a;
        if (j == 0) {
            Log.m105920e("MicroMsg.WeChatClsManager", "getSynonymWordsByLabelName >> weChatClsHandle no init");
            return new ArrayList<>();
        }
        ArrayList<Pair<String, ArrayList<Integer>>> nGetSynonymWordsByLabelname = WeChatCls.nGetSynonymWordsByLabelname(j, str, applicationLanguage, z);
        StringBuilder sb = new StringBuilder();
        sb.append("getSynonymWordsByLabelName >> ");
        sb.append(str);
        sb.append("  result size:  ");
        if (nGetSynonymWordsByLabelname != null) {
            num = Integer.valueOf(nGetSynonymWordsByLabelname.size());
        }
        sb.append(num);
        sb.append(", lan: ");
        sb.append(applicationLanguage);
        Log.m105924i("MicroMsg.WeChatClsManager", sb.toString());
        return nGetSynonymWordsByLabelname;
    }

    /* renamed from: i */
    public final void mo84588i(ArrayList<QueryImageData> arrayList) {
        C87412m.m108594g(arrayList, "imageDataList");
        Log.m105924i("MicroMsg.ImageQuerySDKCore", "start identify >> size: " + arrayList.size() + ", timeStamp: " + System.currentTimeMillis());
        C53973z1 z1Var = f170056q;
        C53973z1 z1Var2 = null;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
        f170043d = C53930o0.m60555b();
        C30744h4 h = C57593a4.f164912a.mo81943h(C59491j.f169997b);
        f170050k = h != null ? h.field_cluster_history_data : null;
        String str = ((QueryImageData) C110818d0.m150914L(arrayList)).f154726g;
        C87412m.m108593f(str, "imageDataList.first().scanImagePath");
        f170051l = str;
        f170052m = ((QueryImageData) C110818d0.m150914L(arrayList)).f154724e;
        f170053n = C59479c.RUNNING;
        Log.m105924i("MicroMsg.ImageQuerySDKCore", "history json：" + f170050k + ", lastImagePath: " + f170051l);
        Log.m105924i("MicroMsg.ImageQuerySDKCore", Thread.currentThread().getName());
        C0000n0 n0Var = f170043d;
        if (n0Var != null) {
            z1Var2 = C53895h.m60466d(n0Var, C54328a.f152462f, (C53934p0) null, new C59506c(arrayList, (C15601d<? super C59506c>) null), 2, (Object) null);
        }
        f170056q = z1Var2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x016e, code lost:
        if (r7 == null) goto L_0x0170;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x037e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo84589j(wx3.C15601d<? super rx3.C13598b0> r24) {
        /*
            r23 = this;
            r1 = r23
            r0 = r24
            boolean r2 = r0 instanceof p157gk.C59503r.C59512d
            if (r2 == 0) goto L_0x0017
            r2 = r0
            gk.r$d r2 = (p157gk.C59503r.C59512d) r2
            int r3 = r2.f170088g
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f170088g = r3
            goto L_0x001c
        L_0x0017:
            gk.r$d r2 = new gk.r$d
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r0 = r2.f170086e
            xx3.a r3 = xx3.C15911a.COROUTINE_SUSPENDED
            int r4 = r2.f170088g
            r5 = 1
            if (r4 == 0) goto L_0x0037
            if (r4 != r5) goto L_0x002f
            java.lang.Object r2 = r2.f170085d
            gk.r r2 = (p157gk.C59503r) r2
            kotlin.ResultKt.throwOnFailure(r0)
            goto L_0x0074
        L_0x002f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0037:
            kotlin.ResultKt.throwOnFailure(r0)
            java.lang.String r0 = "MicroMsg.ImageQuerySDKCore"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "stopCurrentRoomQuery: "
            r4.append(r6)
            java.lang.String r6 = p157gk.C59491j.f169997b
            r4.append(r6)
            java.lang.String r6 = ", identifyType: "
            r4.append(r6)
            gk.c r6 = f170053n
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r4)
            java.lang.String r0 = "MicroMsg.ImageQuerySDKCore"
            java.lang.String r4 = "cancel job"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r4)
            a14.z1 r0 = f170056q
            if (r0 == 0) goto L_0x0073
            r2.f170085d = r1
            r2.f170088g = r5
            java.lang.Object r0 = a14.C53873d2.m60391c(r0, r2)
            if (r0 != r3) goto L_0x0073
            return r3
        L_0x0073:
            r2 = r1
        L_0x0074:
            gk.c r0 = f170053n
            gk.c r3 = p157gk.C59479c.RUNNING
            if (r0 == r3) goto L_0x007e
            gk.c r3 = p157gk.C59479c.LAST_CLUSTER
            if (r0 != r3) goto L_0x00b0
        L_0x007e:
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = "MicroMsg.ImageQuerySDKCore"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "when stop CurrentRoomQuery, identify is no finish, identify type: "
            r6.append(r7)
            gk.c r7 = f170053n
            r6.append(r7)
            java.lang.String r7 = ", timeStamp: "
            r6.append(r7)
            r6.append(r3)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r6)
            ig3.e r0 = ig3.C60283e.f171878a
            int r6 = f170054o
            r7 = 5
            r0.mo85270a(r7, r6, r3)
            ig3.b r0 = ig3.C60280b.f171844a
            r0.mo85256a(r7)
        L_0x00b0:
            java.lang.String r0 = "MicroMsg.ImageQuerySDKCore"
            java.lang.String r3 = "stopCurrentRoomQuery >> job is join"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)
            java.util.HashMap<java.lang.String, com.tencent.mm.api.QueryImageData> r0 = f170044e
            r0.clear()
            java.util.HashMap<java.lang.String, com.tencent.mm.api.QueryImageData> r0 = f170045f
            r0.clear()
            java.util.HashSet<java.lang.String> r0 = f170049j
            r0.clear()
            java.util.HashSet<java.lang.String> r0 = f170055p
            r0.clear()
            java.util.ArrayList<com.tencent.mm.api.QueryImageData> r0 = f170048i
            r0.clear()
            r0 = 0
            f170050k = r0
            r2.getClass()
            java.lang.Class<com.tencent.mm.storage.h4> r2 = com.tencent.p014mm.storage.C30744h4.class
            java.lang.Class<com.tencent.mm.storage.i4> r3 = com.tencent.p014mm.storage.C57596i4.class
            java.lang.Class<i40.c> r4 = i40.C60247c.class
            java.lang.Class<com.tencent.mm.storage.w3> r6 = com.tencent.p014mm.storage.C57604w3.class
            java.lang.String r7 = f170051l
            int r7 = r7.length()
            r8 = 0
            if (r7 != 0) goto L_0x00ea
            r7 = 1
            goto L_0x00eb
        L_0x00ea:
            r7 = 0
        L_0x00eb:
            r9 = 0
            if (r7 == 0) goto L_0x0114
            java.lang.String r2 = "MicroMsg.ImageQuerySDKCore"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "stopClusterReq >> this time no need to apply req, so no need to update history，lastImagePath: "
            r3.append(r4)
            java.lang.String r4 = f170051l
            r3.append(r4)
            java.lang.String r4 = ", isFirstCluster: "
            r3.append(r4)
            boolean r4 = f170046g
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            goto L_0x0365
        L_0x0114:
            ja3.a r7 = f170042c
            if (r7 != 0) goto L_0x0122
            java.lang.String r2 = "MicroMsg.ImageQuerySDKCore"
            java.lang.String r3 = "stopClusterReq >> manager is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            goto L_0x0365
        L_0x0122:
            java.lang.String r7 = "MicroMsg.ImageQuerySDKCore"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "stopClusterReq >> isFirstCluster: "
            r11.append(r12)
            boolean r12 = f170046g
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r11)
            boolean r7 = f170046g
            if (r7 != 0) goto L_0x027b
            ja3.a r7 = f170042c
            if (r7 == 0) goto L_0x0170
            long r11 = r7.f173135c
            java.lang.String r7 = "MicroMsg.WeChatClsManager"
            int r13 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r13 != 0) goto L_0x0154
            java.lang.String r11 = "stopCurrentClusterReq >> weClusterHandle no init"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r11)
            java.lang.String r7 = ""
            goto L_0x016e
        L_0x0154:
            java.lang.String r11 = com.tencent.p014mm.xeffect.WeFaceCluster.nStop()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "stopCurrentClusterReq: "
            r12.append(r13)
            r12.append(r11)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r12)
            r7 = r11
        L_0x016e:
            if (r7 != 0) goto L_0x0172
        L_0x0170:
            java.lang.String r7 = ""
        L_0x0172:
            java.lang.String r11 = "MicroMsg.ImageQuerySDKCore"
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "do face "
            r12.append(r13)
            java.lang.Thread r13 = java.lang.Thread.currentThread()
            java.lang.String r13 = r13.getName()
            r12.append(r13)
            java.lang.String r13 = ", stopClusterReq: "
            r12.append(r13)
            java.lang.String r13 = f170051l
            r12.append(r13)
            java.lang.String r13 = ", result: "
            r12.append(r13)
            r12.append(r7)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r12)
            java.lang.String r11 = p157gk.C59491j.f169997b
            java.lang.String r12 = f170051l
            long r13 = f170052m
            java.lang.String r15 = "lastImagePath"
            gy3.C87412m.m108594g(r12, r15)
            java.lang.String r15 = "MicroMsg.ImageQueryStorage"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r9 = "updateQueryHistory, "
            r0.append(r9)
            r0.append(r11)
            java.lang.String r9 = ", "
            r0.append(r9)
            r0.append(r12)
            java.lang.String r9 = " >> json: "
            r0.append(r9)
            r0.append(r7)
            java.lang.String r9 = ", timeStamp: "
            r0.append(r9)
            r0.append(r13)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r0)
            byte[] r9 = i40.C60247c.f171776h
            monitor-enter(r9)
            f40.e r0 = f40.C86709a0.m107523b()     // Catch:{ all -> 0x0278 }
            r0.mo121108c()     // Catch:{ all -> 0x0278 }
            boolean r0 = r4.isAssignableFrom(r6)     // Catch:{ all -> 0x0278 }
            if (r0 == 0) goto L_0x0270
            androidx.lifecycle.k0 r0 = new androidx.lifecycle.k0     // Catch:{ all -> 0x0278 }
            f40.e r4 = f40.C86709a0.m107523b()     // Catch:{ all -> 0x0278 }
            f40.a r4 = r4.f251755f     // Catch:{ all -> 0x0278 }
            i40.c$a$a r10 = new i40.c$a$a     // Catch:{ all -> 0x0278 }
            r10.<init>()     // Catch:{ all -> 0x0278 }
            r0.<init>((androidx.lifecycle.C0123n0) r4, (androidx.lifecycle.C54209k0.C54210b) r10)     // Catch:{ all -> 0x0278 }
            androidx.lifecycle.i0 r0 = r0.mo75002a(r6)     // Catch:{ all -> 0x0278 }
            monitor-exit(r9)
            com.tencent.mm.storage.w3 r0 = (com.tencent.p014mm.storage.C57604w3) r0
            com.tencent.mm.sdk.storage.mvvm.MvvmStorage r0 = r0.mo85233d3(r3)
            com.tencent.mm.storage.i4 r0 = (com.tencent.p014mm.storage.C57596i4) r0
            android.content.ContentValues r3 = new android.content.ContentValues
            r3.<init>()
            java.lang.String r4 = "chat_room_id"
            r3.put(r4, r11)
            ny3.d r2 = gy3.C24560g0.m30725a(r2)
            com.tencent.mm.sdk.storage.IAutoDBItem r2 = r0.get(r3, r2)
            com.tencent.mm.storage.h4 r2 = (com.tencent.p014mm.storage.C30744h4) r2
            java.lang.String r3 = "MicroMsg.MsgQueryHistoryInfoStorage"
            if (r2 == 0) goto L_0x024b
            java.lang.String r4 = "update new history"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            long r9 = r2.field_timestamp
            int r4 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r4 >= 0) goto L_0x0234
            java.lang.String r0 = "image is no last, so no to update"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            goto L_0x0365
        L_0x0234:
            r2.field_last_image_path = r12
            r2.field_cluster_history_data = r7
            r2.field_timestamp = r13
            r18 = 0
            r19 = 0
            r20 = 6
            r21 = 0
            r16 = r0
            r17 = r2
            com.tencent.p014mm.sdk.storage.mvvm.MvvmStorage.update$default(r16, r17, r18, r19, r20, r21)
            goto L_0x0365
        L_0x024b:
            com.tencent.mm.storage.h4 r2 = new com.tencent.mm.storage.h4
            r2.<init>()
            java.lang.String r4 = "add new history"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            r2.field_chat_room_id = r11
            r2.field_cluster_history_data = r7
            r2.field_last_image_path = r12
            r2.field_timestamp = r13
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 14
            r22 = 0
            r16 = r0
            r17 = r2
            com.tencent.p014mm.sdk.storage.mvvm.MvvmStorage.insert$default(r16, r17, r18, r19, r20, r21, r22)
            goto L_0x0365
        L_0x0270:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0278 }
            java.lang.String r2 = "getLiveDB modelClass must extends BaseMvvmDB"
            r0.<init>(r2)     // Catch:{ all -> 0x0278 }
            throw r0     // Catch:{ all -> 0x0278 }
        L_0x0278:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        L_0x027b:
            java.lang.String r0 = "MicroMsg.ImageQuerySDKCore"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r9 = "no do face "
            r7.append(r9)
            java.lang.Thread r9 = java.lang.Thread.currentThread()
            java.lang.String r9 = r9.getName()
            r7.append(r9)
            java.lang.String r9 = ", stopClusterReq: "
            r7.append(r9)
            java.lang.String r9 = f170051l
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r7)
            java.lang.String r0 = p157gk.C59491j.f169997b
            java.lang.String r7 = f170051l
            long r9 = f170052m
            java.lang.String r11 = "lastImagePath"
            gy3.C87412m.m108594g(r7, r11)
            java.lang.String r11 = "MicroMsg.ImageQueryStorage"
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "updateQueryHistory, "
            r12.append(r13)
            r12.append(r7)
            java.lang.String r13 = ", "
            r12.append(r13)
            r12.append(r0)
            java.lang.String r13 = ", timeStamp: "
            r12.append(r13)
            r12.append(r9)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r12)
            byte[] r11 = i40.C60247c.f171776h
            monitor-enter(r11)
            f40.e r12 = f40.C86709a0.m107523b()     // Catch:{ all -> 0x038e }
            r12.mo121108c()     // Catch:{ all -> 0x038e }
            boolean r4 = r4.isAssignableFrom(r6)     // Catch:{ all -> 0x038e }
            if (r4 == 0) goto L_0x0386
            androidx.lifecycle.k0 r4 = new androidx.lifecycle.k0     // Catch:{ all -> 0x038e }
            f40.e r12 = f40.C86709a0.m107523b()     // Catch:{ all -> 0x038e }
            f40.a r12 = r12.f251755f     // Catch:{ all -> 0x038e }
            i40.c$a$a r13 = new i40.c$a$a     // Catch:{ all -> 0x038e }
            r13.<init>()     // Catch:{ all -> 0x038e }
            r4.<init>((androidx.lifecycle.C0123n0) r12, (androidx.lifecycle.C54209k0.C54210b) r13)     // Catch:{ all -> 0x038e }
            androidx.lifecycle.i0 r4 = r4.mo75002a(r6)     // Catch:{ all -> 0x038e }
            monitor-exit(r11)
            com.tencent.mm.storage.w3 r4 = (com.tencent.p014mm.storage.C57604w3) r4
            com.tencent.mm.sdk.storage.mvvm.MvvmStorage r3 = r4.mo85233d3(r3)
            com.tencent.mm.storage.i4 r3 = (com.tencent.p014mm.storage.C57596i4) r3
            android.content.ContentValues r4 = new android.content.ContentValues
            r4.<init>()
            java.lang.String r6 = "chat_room_id"
            r4.put(r6, r0)
            ny3.d r2 = gy3.C24560g0.m30725a(r2)
            com.tencent.mm.sdk.storage.IAutoDBItem r2 = r3.get(r4, r2)
            com.tencent.mm.storage.h4 r2 = (com.tencent.p014mm.storage.C30744h4) r2
            java.lang.String r4 = "MicroMsg.MsgQueryHistoryInfoStorage"
            if (r2 == 0) goto L_0x0340
            java.lang.String r0 = "update new history"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            long r11 = r2.field_timestamp
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x032c
            java.lang.String r0 = "image is no last, so no to update"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            goto L_0x0365
        L_0x032c:
            r2.field_last_image_path = r7
            r2.field_timestamp = r9
            r18 = 0
            r19 = 0
            r20 = 6
            r21 = 0
            r16 = r3
            r17 = r2
            com.tencent.p014mm.sdk.storage.mvvm.MvvmStorage.update$default(r16, r17, r18, r19, r20, r21)
            goto L_0x0365
        L_0x0340:
            com.tencent.mm.storage.h4 r2 = new com.tencent.mm.storage.h4
            r2.<init>()
            java.lang.String r6 = "add new history"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r6)
            r2.field_chat_room_id = r0
            java.lang.String r0 = ""
            r2.field_cluster_history_data = r0
            r2.field_last_image_path = r7
            r2.field_timestamp = r9
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 14
            r22 = 0
            r16 = r3
            r17 = r2
            com.tencent.p014mm.sdk.storage.mvvm.MvvmStorage.insert$default(r16, r17, r18, r19, r20, r21, r22)
        L_0x0365:
            f170046g = r5
            f170047h = r8
            java.lang.String r0 = ""
            f170051l = r0
            r2 = 0
            f170052m = r2
            gk.c r0 = p157gk.C59479c.INIT
            f170053n = r0
            f170054o = r8
            r0 = 0
            f170056q = r0
            ja3.a r2 = f170042c
            if (r2 == 0) goto L_0x0381
            r2.mo85720c()
        L_0x0381:
            f170042c = r0
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        L_0x0386:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x038e }
            java.lang.String r2 = "getLiveDB modelClass must extends BaseMvvmDB"
            r0.<init>(r2)     // Catch:{ all -> 0x038e }
            throw r0     // Catch:{ all -> 0x038e }
        L_0x038e:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p157gk.C59503r.mo84589j(wx3.d):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v32, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo84590k(wx3.C15601d<? super rx3.C13598b0> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof p157gk.C59503r.C59513e
            if (r0 == 0) goto L_0x0013
            r0 = r12
            gk.r$e r0 = (p157gk.C59503r.C59513e) r0
            int r1 = r0.f170094i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f170094i = r1
            goto L_0x0018
        L_0x0013:
            gk.r$e r0 = new gk.r$e
            r0.<init>(r11, r12)
        L_0x0018:
            java.lang.Object r12 = r0.f170092g
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f170094i
            java.lang.String r3 = "MicroMsg.ImageQuerySDKCore"
            r4 = 0
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0052
            if (r2 == r6) goto L_0x0042
            if (r2 != r5) goto L_0x003a
            java.lang.Object r2 = r0.f170091f
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r7 = r0.f170090e
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r8 = r0.f170089d
            gk.r r8 = (p157gk.C59503r) r8
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x0144
        L_0x003a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x0042:
            java.lang.Object r2 = r0.f170091f
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r7 = r0.f170090e
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r8 = r0.f170089d
            gk.r r8 = (p157gk.C59503r) r8
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x00af
        L_0x0052:
            kotlin.ResultKt.throwOnFailure(r12)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r2 = "writeClusterDataToStorage >> "
            r12.append(r2)
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r2 = r2.getName()
            r12.append(r2)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r12)
            java.util.HashSet r12 = new java.util.HashSet
            java.util.HashSet<java.lang.String> r2 = f170049j
            r12.<init>(r2)
            r2.clear()
            java.util.Iterator r12 = r12.iterator()
            r8 = r11
            r7 = r12
        L_0x0082:
            boolean r12 = r7.hasNext()
            if (r12 == 0) goto L_0x00d3
            java.lang.Object r12 = r7.next()
            r2 = r12
            java.lang.String r2 = (java.lang.String) r2
            java.util.HashMap<java.lang.String, com.tencent.mm.api.QueryImageData> r12 = f170045f
            java.lang.Object r12 = r12.get(r2)
            com.tencent.mm.api.QueryImageData r12 = (com.tencent.p014mm.api.QueryImageData) r12
            if (r12 == 0) goto L_0x00b9
            au3.d r9 = au3.C54331d.f152465f
            gk.r$f r10 = new gk.r$f
            r10.<init>(r12, r4)
            r0.f170089d = r8
            r0.f170090e = r7
            r0.f170091f = r2
            r0.f170094i = r6
            java.lang.Object r12 = a14.C53895h.m60469g(r9, r10, r0)
            if (r12 != r1) goto L_0x00af
            return r1
        L_0x00af:
            int r12 = f170054o
            int r9 = r12 + 1
            f170054o = r9
            yx3.C66703b.m78687a(r12)
            goto L_0x00cd
        L_0x00b9:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r9 = "clusterPerTimePaths, personImageMap no contain "
            r12.append(r9)
            r12.append(r2)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r12)
        L_0x00cd:
            java.util.HashMap<java.lang.String, com.tencent.mm.api.QueryImageData> r12 = f170045f
            r12.remove(r2)
            goto L_0x0082
        L_0x00d3:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r2 = "when cluster finish, cluster identify data size: "
            r12.append(r2)
            java.util.HashSet<java.lang.String> r2 = f170055p
            int r7 = r2.size()
            r12.append(r7)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r12)
            java.util.HashSet r12 = new java.util.HashSet
            r12.<init>(r2)
            r2.clear()
            java.util.Iterator r12 = r12.iterator()
            r7 = r12
        L_0x00fb:
            boolean r12 = r7.hasNext()
            if (r12 == 0) goto L_0x0169
            java.lang.Object r12 = r7.next()
            r2 = r12
            java.lang.String r2 = (java.lang.String) r2
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r9 = "clusterPerTimeToIdentify >> "
            r12.append(r9)
            r12.append(r2)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r12)
            java.util.HashMap<java.lang.String, com.tencent.mm.api.QueryImageData> r12 = f170045f
            java.lang.Object r12 = r12.get(r2)
            com.tencent.mm.api.QueryImageData r12 = (com.tencent.p014mm.api.QueryImageData) r12
            if (r12 == 0) goto L_0x0147
            java.lang.String r9 = ""
            r12.f154727h = r9
            r12.f154728i = r9
            r12.f154729j = r9
            au3.d r9 = au3.C54331d.f152465f
            gk.r$g r10 = new gk.r$g
            r10.<init>(r12, r4)
            r0.f170089d = r8
            r0.f170090e = r7
            r0.f170091f = r2
            r0.f170094i = r5
            java.lang.Object r12 = a14.C53895h.m60469g(r9, r10, r0)
            if (r12 != r1) goto L_0x0144
            return r1
        L_0x0144:
            rx3.b0 r12 = rx3.C13598b0.f38549a
            goto L_0x0148
        L_0x0147:
            r12 = r4
        L_0x0148:
            if (r12 != 0) goto L_0x015e
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r9 = "clusterPerTimeToIdentify, personImageMap no contain "
            r12.append(r9)
            r12.append(r2)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r12)
        L_0x015e:
            int r12 = f170054o
            int r12 = r12 + r6
            f170054o = r12
            java.util.HashMap<java.lang.String, com.tencent.mm.api.QueryImageData> r12 = f170045f
            r12.remove(r2)
            goto L_0x00fb
        L_0x0169:
            gk.c r12 = f170053n
            gk.c r0 = p157gk.C59479c.LAST_CLUSTER
            if (r12 != r0) goto L_0x01a8
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r2 = "IdentifyType.LAST_CLUSTER to update to stop, all image identify is finish >> timeStamp: "
            r12.append(r2)
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r12)
            gk.c r12 = p157gk.C59479c.STOP
            f170053n = r12
            gk.e r2 = p157gk.C59491j.f169998c
            if (r2 == 0) goto L_0x019b
            java.lang.String r3 = "MicroMsg.ImageDataManager"
            java.lang.String r4 = "postFinishType"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            androidx.lifecycle.z<gk.c> r2 = r2.f169967g
            r2.postValue(r12)
        L_0x019b:
            ig3.e r12 = ig3.C60283e.f171878a
            int r2 = f170054o
            r3 = 4
            r12.mo85270a(r3, r2, r0)
            ig3.b r12 = ig3.C60280b.f171844a
            r12.mo85256a(r3)
        L_0x01a8:
            rx3.b0 r12 = rx3.C13598b0.f38549a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p157gk.C59503r.mo84590k(wx3.d):java.lang.Object");
    }
}
