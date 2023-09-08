package rl1;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53934p0;
import a14.C53973z1;
import al1.C0082q;
import android.content.Context;
import androidx.lifecycle.C54219z;
import androidx.lifecycle.LiveData;
import bi1.C0283d;
import cl1.C39970c;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.xweb.file.XVFSFile;
import di1.C7333c;
import di3.C86312j;
import dj1.C45381p0;
import er1.C58739j4;
import f40.C86709a0;
import fj1.C45795b;
import fy3.C32224a;
import fy3.C32227p;
import gg1.C32444a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import hp3.C87581a;
import ht1.C8802s1;
import it1.C60625c;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentLinkedDeque;
import je1.C46523h2;
import kotlin.Result;
import nr3.C89059e;
import o40.C61926c;
import o40.C61937h;
import ob0.C47350c;
import ob0.C89132b;
import ok1.C62042e;
import pe3.C89349b;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C110818d0;
import sx3.C64197v;
import te3.C48659a31;
import te3.C48987cd1;
import te3.C49225e31;
import te3.C49882ip2;
import te3.C50199l01;
import te3.C50334m01;
import te3.C50401mh0;
import te3.C50542nh0;
import te3.C50617o01;
import te3.C51773w21;
import te3.C51778w31;
import te3.C52204z21;
import te3.C64273c21;
import wx3.C15601d;
import wx3.C66218h;
import xx3.C66447b;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;
import z04.C112550d0;

/* renamed from: rl1.d0 */
public final class C13022d0 extends C39970c<C45795b> {

    /* renamed from: f */
    public int f37093f = C32444a.f86168l2.mo60266n().intValue();

    /* renamed from: g */
    public final C7333c<C50334m01> f37094g;

    /* renamed from: h */
    public final LiveData<C50334m01> f37095h;

    /* renamed from: i */
    public C53973z1 f37096i;

    /* renamed from: j */
    public LinkedList<C0082q> f37097j;

    /* renamed from: n */
    public C0082q f37098n;

    /* renamed from: o */
    public ConcurrentLinkedDeque<C13604l<Long, String>> f37099o;

    /* renamed from: p */
    public C50617o01 f37100p;

    /* renamed from: q */
    public C54219z<Boolean> f37101q;

    /* renamed from: r */
    public boolean f37102r;

    /* renamed from: s */
    public C49882ip2 f37103s;

    /* renamed from: t */
    public C0082q f37104t;

    /* renamed from: u */
    public final int f37105u;

    /* renamed from: v */
    public final int f37106v;

    /* renamed from: rl1.d0$a */
    public static final class C13023a extends C87413o implements C32227p<C50334m01, C50334m01, Boolean> {
        public C13023a(C7333c<C50334m01> cVar) {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            C50334m01 m012 = (C50334m01) obj;
            C50334m01 m013 = (C50334m01) obj2;
            boolean z = true;
            if (m012 != null && m013 != null) {
                LinkedList<C48659a31> linkedList = m012.f137739d;
                LinkedList<C48659a31> linkedList2 = m013.f137739d;
                if (m012.f137740e == m013.f137740e && linkedList.size() == linkedList2.size()) {
                    Iterator<T> it = linkedList.iterator();
                    int i = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        T next = it.next();
                        int i2 = i + 1;
                        if (i >= 0) {
                            C48659a31 a312 = (C48659a31) next;
                            C48659a31 a313 = linkedList2.get(i);
                            if (a313 != null) {
                                if (!(a313.f130267d == a312.f130267d)) {
                                    break;
                                }
                                i = i2;
                            } else {
                                break;
                            }
                        } else {
                            C64197v.m75542k();
                            throw null;
                        }
                    }
                    return Boolean.valueOf(z);
                }
            }
            z = false;
            return Boolean.valueOf(z);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.lottery.LiveLotterySlice$anchorFirstLotteryOp$1", mo125469f = "LiveLotterySlice.kt", mo125470l = {483, 486, 496}, mo125471m = "invokeSuspend")
    /* renamed from: rl1.d0$b */
    public static final class C13024b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f37107d;

        /* renamed from: e */
        public int f37108e;

        /* renamed from: f */
        public final /* synthetic */ C13022d0 f37109f;

        /* renamed from: g */
        public final /* synthetic */ boolean f37110g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13024b(C13022d0 d0Var, boolean z, C15601d<? super C13024b> dVar) {
            super(2, dVar);
            this.f37109f = d0Var;
            this.f37110g = z;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C13024b(this.f37109f, this.f37110g, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C13024b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:26:0x0091  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00d7  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x00da  */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x00e8  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Class<rl1.c0> r0 = rl1.C13020c0.class
                java.lang.Class<ht1.t1> r1 = ht1.C60200t1.class
                xx3.a r2 = xx3.C15911a.COROUTINE_SUSPENDED
                int r3 = r11.f37108e
                java.lang.String r4 = "anchorFirstLotteryOp lastTry:"
                r5 = 0
                r6 = 3
                r7 = 2
                java.lang.String r8 = "MMFinder.LiveLotterySlice"
                r9 = 1
                if (r3 == 0) goto L_0x0031
                if (r3 == r9) goto L_0x0029
                if (r3 == r7) goto L_0x0025
                if (r3 != r6) goto L_0x001d
                kotlin.ResultKt.throwOnFailure(r12)
                goto L_0x00f5
            L_0x001d:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L_0x0025:
                kotlin.ResultKt.throwOnFailure(r12)
                goto L_0x0074
            L_0x0029:
                java.lang.Object r3 = r11.f37107d
                java.util.LinkedList r3 = (java.util.LinkedList) r3
                kotlin.ResultKt.throwOnFailure(r12)
                goto L_0x0058
            L_0x0031:
                kotlin.ResultKt.throwOnFailure(r12)
                bl3.r r12 = bl3.C39818r.f106831a
                bl3.r$a r12 = r12.mo62446e(r1)
                androidx.lifecycle.i0 r12 = r12.mo75002a(r0)
                rl1.c0 r12 = (rl1.C13020c0) r12
                java.util.LinkedList<te3.a31> r3 = r12.f37083e
                boolean r12 = r3.isEmpty()
                r12 = r12 ^ r9
                if (r12 == 0) goto L_0x00b2
                rl1.d0 r12 = r11.f37109f
                boolean r10 = r11.f37110g
                r11.f37107d = r3
                r11.f37108e = r9
                java.lang.Object r12 = rl1.C13022d0.m12475c3(r12, r3, r10, r11)
                if (r12 != r2) goto L_0x0058
                return r2
            L_0x0058:
                java.lang.Boolean r12 = (java.lang.Boolean) r12
                boolean r12 = r12.booleanValue()
                if (r12 != 0) goto L_0x007a
                java.lang.String r12 = "anchorFirstLotteryOp create prepareList fail, retry it!"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r12)
                rl1.d0 r12 = r11.f37109f
                boolean r10 = r11.f37110g
                r11.f37107d = r5
                r11.f37108e = r7
                java.lang.Object r12 = rl1.C13022d0.m12475c3(r12, r3, r10, r11)
                if (r12 != r2) goto L_0x0074
                return r2
            L_0x0074:
                java.lang.Boolean r12 = (java.lang.Boolean) r12
                boolean r12 = r12.booleanValue()
            L_0x007a:
                if (r12 != 0) goto L_0x0080
                boolean r3 = r11.f37110g
                if (r3 == 0) goto L_0x0095
            L_0x0080:
                bl3.r r3 = bl3.C39818r.f106831a
                bl3.r$a r1 = r3.mo62446e(r1)
                androidx.lifecycle.i0 r0 = r1.mo75002a(r0)
                rl1.c0 r0 = (rl1.C13020c0) r0
                boolean r1 = r11.f37110g
                if (r1 == 0) goto L_0x0091
                goto L_0x0092
            L_0x0091:
                r7 = 3
            L_0x0092:
                r0.mo12527c3(r7)
            L_0x0095:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r4)
                boolean r1 = r11.f37110g
                r0.append(r1)
                java.lang.String r1 = ", createSuc:"
                r0.append(r1)
                r0.append(r12)
                java.lang.String r12 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r12)
                goto L_0x00cb
            L_0x00b2:
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                r12.append(r4)
                boolean r0 = r11.f37110g
                r12.append(r0)
                java.lang.String r0 = " but prepareList is empty!"
                r12.append(r0)
                java.lang.String r12 = r12.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r12)
            L_0x00cb:
                rl1.d0 r12 = r11.f37109f
                androidx.lifecycle.LiveData<te3.m01> r12 = r12.f37095h
                java.lang.Object r12 = r12.getValue()
                te3.m01 r12 = (te3.C50334m01) r12
                if (r12 == 0) goto L_0x00da
                java.util.LinkedList<te3.a31> r12 = r12.f137739d
                goto L_0x00db
            L_0x00da:
                r12 = r5
            L_0x00db:
                r0 = 0
                if (r12 == 0) goto L_0x00e6
                boolean r12 = r12.isEmpty()
                if (r12 == 0) goto L_0x00e5
                goto L_0x00e6
            L_0x00e5:
                r9 = 0
            L_0x00e6:
                if (r9 == 0) goto L_0x010f
                rl1.d0 r12 = r11.f37109f
                r11.f37107d = r5
                r11.f37108e = r6
                java.lang.Object r12 = r12.mo12540f3(r0, r11)
                if (r12 != r2) goto L_0x00f5
                return r2
            L_0x00f5:
                java.lang.Boolean r12 = (java.lang.Boolean) r12
                boolean r12 = r12.booleanValue()
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "anchorFirstLotteryOp, getPanelInfoSuc:"
                r0.append(r1)
                r0.append(r12)
                java.lang.String r12 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r12)
            L_0x010f:
                rx3.b0 r12 = rx3.C13598b0.f38549a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: rl1.C13022d0.C13024b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: rl1.d0$c */
    public static final class C13025c<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C13022d0 f37111a;

        /* renamed from: b */
        public final /* synthetic */ C15601d<Boolean> f37112b;

        public C13025c(C13022d0 d0Var, C15601d<? super Boolean> dVar) {
            this.f37111a = d0Var;
            this.f37112b = dVar;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            if (C0283d.m246d(cVar)) {
                int i = ((C50334m01) cVar.f256796d).f137741f;
                C50334m01 value = this.f37111a.f37094g.getValue();
                if (i >= (value != null ? value.f137741f : 0)) {
                    this.f37111a.f37094g.postValue(cVar.f256796d);
                    StringBuilder sb = new StringBuilder();
                    sb.append("getLotteryPanelInfo resp,");
                    C13064o0 o0Var = C13064o0.f37206a;
                    T t = cVar.f256796d;
                    C87412m.m108593f(t, "it.resp");
                    sb.append(o0Var.mo12567f((C50334m01) t));
                    Log.m105924i("MMFinder.LiveLotterySlice", sb.toString());
                    C15601d<Boolean> dVar = this.f37112b;
                    Result.Companion companion = Result.Companion;
                    dVar.resumeWith(Result.m168114constructorimpl(Boolean.TRUE));
                    return C13598b0.f38549a;
                }
            }
            Log.m105920e("MMFinder.LiveLotterySlice", "getLotteryPanelInfo fail:" + cVar.f256794b + ',' + cVar.f256793a + ',' + cVar.f256795c + ",data_version:" + ((C50334m01) cVar.f256796d).f137741f);
            C15601d<Boolean> dVar2 = this.f37112b;
            Result.Companion companion2 = Result.Companion;
            dVar2.resumeWith(Result.m168114constructorimpl(Boolean.FALSE));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: rl1.d0$d */
    public static final class C13026d<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C15601d<Boolean> f37113a;

        public C13026d(C15601d<? super Boolean> dVar) {
            this.f37113a = dVar;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            if (C0283d.m246d(cVar)) {
                LinkedList<C50542nh0> linkedList = ((C51778w31) cVar.f256796d).f143843d;
                C87412m.m108593f(linkedList, "resp.resp.ret_list");
                C50542nh0 nh02 = (C50542nh0) C110818d0.m150916N(linkedList);
                boolean z = false;
                if (nh02 != null && nh02.f138603e == 0) {
                    z = true;
                }
                if (z) {
                    C15601d<Boolean> dVar = this.f37113a;
                    Result.Companion companion = Result.Companion;
                    dVar.resumeWith(Result.m168114constructorimpl(Boolean.TRUE));
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("lotteryPanelOpImpl ret:");
                    Object obj2 = nh02;
                    if (nh02 == null) {
                        obj2 = "";
                    }
                    sb.append(C61937h.m72709h(obj2));
                    Log.m105920e("MMFinder.LiveLotterySlice", sb.toString());
                    C15601d<Boolean> dVar2 = this.f37113a;
                    Result.Companion companion2 = Result.Companion;
                    dVar2.resumeWith(Result.m168114constructorimpl(Boolean.FALSE));
                }
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("lotteryPanelOpImpl errType ");
                String str = null;
                sb4.append(cVar != null ? Integer.valueOf(cVar.f256793a) : null);
                sb4.append(",errCode:");
                sb4.append(cVar != null ? Integer.valueOf(cVar.f256794b) : null);
                sb4.append(",errMsg:");
                if (cVar != null) {
                    str = cVar.f256795c;
                }
                sb4.append(str);
                Log.m105920e("MMFinder.LiveLotterySlice", sb4.toString());
                C15601d<Boolean> dVar3 = this.f37113a;
                Result.Companion companion3 = Result.Companion;
                dVar3.resumeWith(Result.m168114constructorimpl(Boolean.FALSE));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: rl1.d0$e */
    public static final class C13027e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C50617o01 f37114d;

        /* renamed from: e */
        public final /* synthetic */ C13022d0 f37115e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13027e(C50617o01 o012, C13022d0 d0Var) {
            super(0);
            this.f37114d = o012;
            this.f37115e = d0Var;
        }

        public Object invoke() {
            LinkedList<C51773w21> linkedList;
            LinkedList<C51773w21> linkedList2;
            Integer num;
            LinkedList<C51773w21> linkedList3;
            C52204z21 z212;
            C50617o01 o012 = this.f37114d;
            if (o012 != null) {
                C13022d0 d0Var = this.f37115e;
                C52204z21 z213 = o012.f138872d;
                String str = z213 != null ? z213.f145640d : null;
                C50617o01 o013 = d0Var.f37100p;
                String str2 = (o013 == null || (z212 = o013.f138872d) == null) ? null : z212.f145640d;
                Log.m105924i("MMFinder.LiveLotterySlice", "mergeLotteryRecord localRecordLotteryId:" + str2 + ",remoteRecordId:" + str);
                boolean z = true;
                if (!(str == null || str.length() == 0)) {
                    if (!(str2 == null || str2.length() == 0)) {
                        z = false;
                    }
                    if (z || !C87412m.m108589b(str2, str)) {
                        d0Var.mo12535J3(o012);
                    } else {
                        C50617o01 o014 = d0Var.f37100p;
                        if (o014 != null) {
                            o014.f138872d = o012.f138872d;
                            o014.f138873e = o012.f138873e;
                            o014.f138874f = o012.f138874f;
                            o014.f138880o = o012.f138880o;
                            LinkedList linkedList4 = new LinkedList();
                            C49225e31 e312 = o012.f138875g;
                            if (!(e312 == null || (linkedList2 = e312.f132658d) == null)) {
                                for (C51773w21 w212 : linkedList2) {
                                    C49225e31 e313 = o014.f138875g;
                                    if (e313 == null || (linkedList3 = e313.f132658d) == null) {
                                        num = null;
                                    } else {
                                        Iterator<C51773w21> it = linkedList3.iterator();
                                        int i = 0;
                                        while (true) {
                                            if (!it.hasNext()) {
                                                i = -1;
                                                break;
                                            } else if (C87412m.m108589b(it.next().f143824d, w212.f143824d)) {
                                                break;
                                            } else {
                                                i++;
                                            }
                                        }
                                        num = Integer.valueOf(i);
                                    }
                                    if (num != null && num.intValue() == -1) {
                                        linkedList4.add(w212);
                                    }
                                }
                            }
                            C49225e31 e314 = o014.f138875g;
                            if (!(e314 == null || (linkedList = e314.f132658d) == null)) {
                                linkedList.addAll(linkedList4);
                            }
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append("after mergeLotteryRecord lotteryRecord:");
                        Object obj = d0Var.f37100p;
                        if (obj == null) {
                            obj = "";
                        }
                        sb.append(C61937h.m72709h(obj));
                        Log.m105924i("MMFinder.LiveLotterySlice", sb.toString());
                    }
                }
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.lottery.LiveLotterySlice", mo125469f = "LiveLotterySlice.kt", mo125470l = {465}, mo125471m = "prepareLotteryHistory")
    /* renamed from: rl1.d0$f */
    public static final class C13028f extends C66704d {

        /* renamed from: d */
        public Object f37116d;

        /* renamed from: e */
        public int f37117e;

        /* renamed from: f */
        public /* synthetic */ Object f37118f;

        /* renamed from: g */
        public final /* synthetic */ C13022d0 f37119g;

        /* renamed from: h */
        public int f37120h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13028f(C13022d0 d0Var, C15601d<? super C13028f> dVar) {
            super(dVar);
            this.f37119g = d0Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f37118f = obj;
            this.f37120h |= Integer.MIN_VALUE;
            return this.f37119g.mo12546m3(0, this);
        }
    }

    /* renamed from: rl1.d0$g */
    public static final class C13029g extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C13022d0 f37121d;

        /* renamed from: e */
        public final /* synthetic */ LinkedList<C52204z21> f37122e;

        /* renamed from: f */
        public final /* synthetic */ boolean f37123f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13029g(C13022d0 d0Var, LinkedList<C52204z21> linkedList, boolean z) {
            super(0);
            this.f37121d = d0Var;
            this.f37122e = linkedList;
            this.f37123f = z;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: te3.z21} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: te3.z21} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: te3.z21} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: te3.z21} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: te3.z21} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: te3.z21} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:110:0x0138 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r19 = this;
                r0 = r19
                java.lang.Class<cl1.o> r1 = cl1.C54991o.class
                fj1.b r2 = fj1.C45795b.f123698n
                java.lang.String r3 = "MMFinder.LiveLotterySlice"
                if (r2 == 0) goto L_0x0185
                rl1.d0 r2 = r0.f37121d
                androidx.lifecycle.i0 r2 = r2.business(r1)
                cl1.o r2 = (cl1.C54991o) r2
                boolean r2 = r2.mo75999e4()
                if (r2 != 0) goto L_0x001a
                goto L_0x0185
            L_0x001a:
                rl1.d0 r1 = r0.f37121d
                java.util.LinkedList<te3.z21> r2 = r0.f37122e
                r1.getClass()
                java.lang.String r4 = "lotteryInfoList"
                gy3.C87412m.m108594g(r2, r4)
                java.util.LinkedList r4 = new java.util.LinkedList
                r4.<init>()
                java.util.Iterator r2 = r2.iterator()
            L_0x002f:
                boolean r5 = r2.hasNext()
                r6 = 0
                if (r5 == 0) goto L_0x0074
                java.lang.Object r5 = r2.next()
                te3.z21 r5 = (te3.C52204z21) r5
                java.util.LinkedList<al1.q> r7 = r1.f37097j
                java.util.Iterator r7 = r7.iterator()
            L_0x0042:
                boolean r8 = r7.hasNext()
                if (r8 == 0) goto L_0x0060
                java.lang.Object r8 = r7.next()
                r9 = r8
                al1.q r9 = (al1.C0082q) r9
                te3.z21 r9 = r9.f509d
                if (r9 == 0) goto L_0x0056
                java.lang.String r9 = r9.f145640d
                goto L_0x0057
            L_0x0056:
                r9 = r6
            L_0x0057:
                java.lang.String r10 = r5.f145640d
                boolean r9 = gy3.C87412m.m108589b(r9, r10)
                if (r9 == 0) goto L_0x0042
                goto L_0x0061
            L_0x0060:
                r8 = r6
            L_0x0061:
                al1.q r8 = (al1.C0082q) r8
                if (r8 == 0) goto L_0x0067
                te3.z21 r6 = r8.f509d
            L_0x0067:
                if (r6 == 0) goto L_0x0070
                boolean r7 = r1.mo12542i3(r5, r6)
                if (r7 != 0) goto L_0x0070
                r5 = r6
            L_0x0070:
                r4.add(r5)
                goto L_0x002f
            L_0x0074:
                rl1.d0 r1 = r0.f37121d
                al1.q r1 = r1.f37098n
                if (r1 == 0) goto L_0x0081
                te3.z21 r2 = r1.f509d
                if (r2 == 0) goto L_0x0081
                java.lang.String r2 = r2.f145640d
                goto L_0x0082
            L_0x0081:
                r2 = r6
            L_0x0082:
                if (r1 == 0) goto L_0x008b
                boolean r1 = r1.f511f
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                goto L_0x008c
            L_0x008b:
                r1 = r6
            L_0x008c:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r7 = "resetLotteryInfoToList lottery:"
                r5.append(r7)
                r5.append(r2)
                java.lang.String r7 = ",cardShowing:"
                r5.append(r7)
                r5.append(r1)
                java.lang.String r5 = r5.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r5)
                rl1.d0 r3 = r0.f37121d
                java.util.LinkedList<al1.q> r3 = r3.f37097j
                java.util.Iterator r3 = r3.iterator()
            L_0x00b0:
                boolean r5 = r3.hasNext()
                r7 = 0
                r8 = 1
                if (r5 == 0) goto L_0x00e9
                java.lang.Object r5 = r3.next()
                r9 = r5
                al1.q r9 = (al1.C0082q) r9
                te3.z21 r9 = r9.f509d
                if (r9 == 0) goto L_0x00c6
                java.lang.String r9 = r9.f145640d
                goto L_0x00c7
            L_0x00c6:
                r9 = r6
            L_0x00c7:
                if (r9 == 0) goto L_0x00d2
                int r10 = r9.length()
                if (r10 != 0) goto L_0x00d0
                goto L_0x00d2
            L_0x00d0:
                r10 = 0
                goto L_0x00d3
            L_0x00d2:
                r10 = 1
            L_0x00d3:
                if (r10 != 0) goto L_0x00e5
                boolean r9 = gy3.C87412m.m108589b(r9, r2)
                if (r9 == 0) goto L_0x00e5
                java.lang.Boolean r9 = java.lang.Boolean.TRUE
                boolean r9 = gy3.C87412m.m108589b(r1, r9)
                if (r9 == 0) goto L_0x00e5
                r9 = 1
                goto L_0x00e6
            L_0x00e5:
                r9 = 0
            L_0x00e6:
                if (r9 == 0) goto L_0x00b0
                goto L_0x00ea
            L_0x00e9:
                r5 = r6
            L_0x00ea:
                al1.q r5 = (al1.C0082q) r5
                rl1.d0 r1 = r0.f37121d
                java.util.LinkedList<al1.q> r1 = r1.f37097j
                r1.clear()
                if (r5 == 0) goto L_0x0100
                boolean r1 = r0.f37123f
                if (r1 != 0) goto L_0x0100
                rl1.d0 r1 = r0.f37121d
                java.util.LinkedList<al1.q> r1 = r1.f37097j
                r1.add(r5)
            L_0x0100:
                java.util.Iterator r1 = r4.iterator()
            L_0x0104:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L_0x0139
                java.lang.Object r2 = r1.next()
                r3 = r2
                te3.z21 r3 = (te3.C52204z21) r3
                java.lang.String r9 = r3.f145640d
                if (r9 == 0) goto L_0x011e
                int r9 = r9.length()
                if (r9 != 0) goto L_0x011c
                goto L_0x011e
            L_0x011c:
                r9 = 0
                goto L_0x011f
            L_0x011e:
                r9 = 1
            L_0x011f:
                if (r9 != 0) goto L_0x0135
                java.lang.String r3 = r3.f145640d
                if (r5 == 0) goto L_0x012c
                te3.z21 r9 = r5.f509d
                if (r9 == 0) goto L_0x012c
                java.lang.String r9 = r9.f145640d
                goto L_0x012d
            L_0x012c:
                r9 = r6
            L_0x012d:
                boolean r3 = gy3.C87412m.m108589b(r3, r9)
                if (r3 == 0) goto L_0x0135
                r3 = 1
                goto L_0x0136
            L_0x0135:
                r3 = 0
            L_0x0136:
                if (r3 == 0) goto L_0x0104
                r6 = r2
            L_0x0139:
                te3.z21 r6 = (te3.C52204z21) r6
                if (r6 == 0) goto L_0x0144
                rl1.d0 r1 = r0.f37121d
                java.util.LinkedList<al1.q> r1 = r1.f37097j
                r1.clear()
            L_0x0144:
                rl1.d0 r1 = r0.f37121d
                boolean r2 = r0.f37123f
                java.util.Iterator r3 = r4.iterator()
            L_0x014c:
                boolean r4 = r3.hasNext()
                if (r4 == 0) goto L_0x017b
                java.lang.Object r4 = r3.next()
                r13 = r4
                te3.z21 r13 = (te3.C52204z21) r13
                java.util.LinkedList<al1.q> r4 = r1.f37097j
                if (r2 == 0) goto L_0x0164
                int r5 = r13.f145648o
                r6 = 3
                if (r5 != r6) goto L_0x0164
                r14 = 1
                goto L_0x0165
            L_0x0164:
                r14 = 0
            L_0x0165:
                al1.q r5 = new al1.q
                int r10 = r13.f145648o
                int r11 = r13.f145643g
                r12 = 0
                r15 = 0
                r16 = 0
                r17 = 96
                r18 = 0
                r9 = r5
                r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)
                r4.add(r5)
                goto L_0x014c
            L_0x017b:
                rl1.d0 r1 = r0.f37121d
                boolean r2 = r0.f37123f
                java.lang.String r3 = "reset"
                r1.mo12547n3(r3, r2)
                goto L_0x01a3
            L_0x0185:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r4 = "resetLotteryInfoToList liveState:"
                r2.append(r4)
                rl1.d0 r4 = r0.f37121d
                androidx.lifecycle.i0 r1 = r4.business(r1)
                cl1.o r1 = (cl1.C54991o) r1
                int r1 = r1.f154295b1
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r1)
            L_0x01a3:
                rx3.b0 r1 = rx3.C13598b0.f38549a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: rl1.C13022d0.C13029g.invoke():java.lang.Object");
        }
    }

    /* renamed from: rl1.d0$h */
    public static final class C13030h extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C52204z21 f37124d;

        /* renamed from: e */
        public final /* synthetic */ C13022d0 f37125e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13030h(C52204z21 z212, C13022d0 d0Var) {
            super(0);
            this.f37124d = z212;
            this.f37125e = d0Var;
        }

        public Object invoke() {
            String str;
            T t;
            C52204z21 z212;
            C52204z21 z213 = this.f37124d;
            if (!(z213 == null || (str = z213.f145640d) == null)) {
                C13022d0 d0Var = this.f37125e;
                Iterator<T> it = d0Var.f37097j.iterator();
                while (true) {
                    t = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    C52204z21 z214 = ((C0082q) next).f509d;
                    if (z214 != null) {
                        t = z214.f145640d;
                    }
                    if (C87412m.m108589b(t, str)) {
                        t = next;
                        break;
                    }
                }
                C0082q qVar = (C0082q) t;
                if (qVar != null && ((z212 = qVar.f509d) == null || d0Var.mo12542i3(z213, z212))) {
                    qVar.f509d = z213;
                }
            }
            this.f37125e.mo12547n3("update", false);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13022d0(C45795b bVar) {
        super(bVar);
        C87412m.m108594g(bVar, "liveContext");
        C7333c<C50334m01> cVar = new C7333c<>((C32227p) null, 1, (C8480h) null);
        cVar.f25448d = new C13023a(cVar);
        this.f37094g = cVar;
        this.f37095h = cVar;
        this.f37097j = new LinkedList<>();
        this.f37099o = new ConcurrentLinkedDeque<>();
        this.f37101q = new C54219z<>(Boolean.FALSE);
        this.f37103s = new C49882ip2();
        int intValue = C32444a.f86065I0.mo60266n().intValue();
        this.f37105u = intValue;
        this.f37106v = intValue / 2;
    }

    /* renamed from: c3 */
    public static final Object m12475c3(C13022d0 d0Var, LinkedList linkedList, boolean z, C15601d dVar) {
        d0Var.getClass();
        C62042e eVar = C62042e.f176370a;
        eVar.mo86998D1("MMFinder.LiveLotterySlice", "createLotteryList showLoading:" + z + " for prepare: " + C13064o0.f37206a.mo12566e(linkedList));
        C48987cd1 cd12 = new C48987cd1();
        cd12.f131666d = 0;
        cd12.f131667e = linkedList;
        return d0Var.mo12544k3(cd12, z, dVar);
    }

    /* renamed from: F3 */
    public final void mo12532F3(LinkedList<C52204z21> linkedList, boolean z) {
        C87412m.m108594g(linkedList, "liveMsgLotteryInfoList");
        C61926c.m72668M(new C13029g(this, linkedList, z));
    }

    /* renamed from: G3 */
    public final void mo12533G3(String str) {
        boolean z;
        boolean z2;
        Class cls = C55001u.class;
        C64273c21 c212 = ((C55001u) business(cls)).f154420q;
        if (str != null) {
            if (this.f37099o.isEmpty()) {
                this.f37099o = mo12539e3();
            }
            Iterator<C13604l<Long, String>> it = this.f37099o.iterator();
            C87412m.m108593f(it, "localSaveLotteryIdList.iterator()");
            while (true) {
                z = false;
                if (!it.hasNext()) {
                    break;
                }
                C13604l next = it.next();
                C64273c21 c213 = ((C55001u) business(cls)).f154420q;
                if (c213 == null || ((Number) next.f38555d).longValue() != c213.f182392d) {
                    z2 = false;
                    continue;
                } else {
                    z2 = true;
                    continue;
                }
                if (z2) {
                    it.remove();
                    break;
                }
            }
            if (this.f37099o.size() > this.f37105u) {
                int i = this.f37106v;
                for (int i2 = 0; i2 < i; i2++) {
                    this.f37099o.removeLast();
                }
            }
            this.f37099o.add(new C13604l(Long.valueOf(c212.f182392d), str));
            ConcurrentLinkedDeque<C13604l<Long, String>> concurrentLinkedDeque = this.f37099o;
            StringBuilder sb = new StringBuilder();
            Iterator<C13604l<Long, String>> it4 = concurrentLinkedDeque.iterator();
            C87412m.m108593f(it4, "lotteryList.iterator()");
            while (it4.hasNext()) {
                C13604l next2 = it4.next();
                sb.append(((Number) next2.f38555d).longValue() + XVFSFile.PATH_SEPARATOR_CHAR + ((String) next2.f38556e));
                sb.append("|");
            }
            if (sb.length() == 0) {
                z = true;
            }
            if (!z) {
                sb.deleteCharAt(sb.length() - 1);
            }
            String sb4 = sb.toString();
            C87412m.m108593f(sb4, "result.toString()");
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_LIVE_LAST_LOTTERYID_STRING_SYNC, sb4);
            Log.m105924i("MMFinder.LiveLotterySlice", "saveLastWinLotteryId MAX_LOTTERY_ID_LIST:" + this.f37105u + ",DROP_LIST_SIZE:" + this.f37106v + ",liveId:" + c212.f182392d + ",lotteryId:" + str + ",lotteryList:" + this.f37099o + ",cacheListStr:" + sb4);
        }
    }

    /* renamed from: I3 */
    public final void mo12534I3(boolean z) {
        boolean u = C61926c.m72696u(((C54991o) business(C54991o.class)).f154388y0, 262144);
        Log.m105924i("MMFinder.LiveLotterySlice", "isSecurityDisable = " + u);
        if (u) {
            this.f37102r = false;
        } else {
            this.f37102r = z;
        }
    }

    /* renamed from: J3 */
    public final void mo12535J3(C50617o01 o012) {
        StringBuilder sb = new StringBuilder();
        sb.append("set lotteryRecord:");
        Object obj = this.f37100p;
        if (obj == null) {
            obj = "";
        }
        sb.append(C61937h.m72709h(obj));
        Log.m105924i("MMFinder.LiveLotterySlice", sb.toString());
        this.f37100p = o012;
    }

    /* renamed from: K3 */
    public final void mo12536K3() {
        C32444a aVar = C32444a.f86121a;
        boolean z = false;
        if ((C32444a.f86049E0.mo60266n().intValue() == 1) || C58739j4.f168176a.mo83692U()) {
            z = true;
        }
        mo12534I3(z);
    }

    /* renamed from: L3 */
    public final void mo12537L3(C52204z21 z212) {
        C61926c.m72668M(new C13030h(z212, this));
    }

    /* renamed from: d3 */
    public final void mo12538d3(boolean z) {
        C53973z1 z1Var = this.f37096i;
        boolean z2 = true;
        if (z1Var == null || !z1Var.mo74466a()) {
            z2 = false;
        }
        if (z2) {
            Log.m105924i("MMFinder.LiveLotterySlice", "anchorFirstLotteryOp lastTry:" + z + " but job is activate!");
        }
        this.f37096i = C53895h.m60466d(this.f107146d.f123702i, C53872d1.f151119c, (C53934p0) null, new C13024b(this, z, (C15601d<? super C13024b>) null), 2, (Object) null);
    }

    /* renamed from: e3 */
    public final ConcurrentLinkedDeque<C13604l<Long, String>> mo12539e3() {
        Object f = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_FINDER_LIVE_LAST_LOTTERYID_STRING_SYNC, "");
        C87412m.m108592e(f, "null cannot be cast to non-null type kotlin.String");
        String str = (String) f;
        ConcurrentLinkedDeque<C13604l<Long, String>> concurrentLinkedDeque = new ConcurrentLinkedDeque<>();
        if (str.length() == 0) {
            Log.m105924i("MMFinder.LiveLotterySlice", "getLotteryIdList lotteryList is empty!");
        } else {
            List U = C112550d0.m153785U(str, new String[]{"|"}, false, 0, 6, (Object) null);
            int size = U.size();
            for (int i = 0; i < size; i++) {
                String str2 = (String) U.get(i);
                List U2 = C112550d0.m153785U(str2, new String[]{XVFSFile.PATH_SEPARATOR}, false, 0, 6, (Object) null);
                if (U2.size() == 2) {
                    long safeParseLong = Util.safeParseLong((String) U2.get(0));
                    String str3 = (String) U2.get(1);
                    if (safeParseLong != 0) {
                        if (!(str3 == null || str3.length() == 0)) {
                            concurrentLinkedDeque.add(new C13604l(Long.valueOf(safeParseLong), str3));
                        }
                    }
                    if (C58739j4.f168176a.mo83692U()) {
                        Log.m105924i("MMFinder.LiveLotterySlice", "getLotteryIdList invalid liveId lotteryInfo:" + str2);
                    }
                } else if (C58739j4.f168176a.mo83692U()) {
                    Log.m105924i("MMFinder.LiveLotterySlice", "getLotteryIdList invalid lotteryInfo:" + str2);
                }
            }
            Log.m105924i("MMFinder.LiveLotterySlice", "getLotteryIdList lotteryList:" + concurrentLinkedDeque);
        }
        return concurrentLinkedDeque;
    }

    /* renamed from: f3 */
    public final Object mo12540f3(boolean z, C15601d<? super Boolean> dVar) {
        C89059e i;
        Class cls = C55001u.class;
        C66218h hVar = new C66218h(C66447b.m78392b(dVar));
        C50199l01 l012 = new C50199l01();
        l012.f137118d = C46523h2.f125330a.mo71859a(8605);
        l012.f137119e = ((C55001u) business(cls)).f154416j;
        l012.f137120f = C89349b.m111674a(((C55001u) business(cls)).f154417n);
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 8605;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderlivegetlotterypanel";
        bVar.f127066a = l012;
        bVar.f127067b = new C50334m01();
        C47350c a = bVar.mo72403a();
        C89132b ui = ((C8802s1) C86312j.m106911c(C8802s1.class)).mo9632ui();
        ui.mo123453j(a);
        C60625c cVar = ui instanceof C60625c ? (C60625c) ui : null;
        if (z && cVar != null) {
            Context context = MMApplicationContext.getContext();
            C87412m.m108593f(context, "getContext()");
            C60625c.m70894l(cVar, context, (String) null, 0, 6, (Object) null);
        }
        if (!(cVar == null || (i = cVar.mo9225i()) == null)) {
            i.mo123420E(new C13025c(this, hVar));
            i.mo11397F(this);
        }
        return hVar.mo90314b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.f509d;
     */
    /* renamed from: g3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo12541g3() {
        /*
            r3 = this;
            al1.q r0 = r3.f37098n
            if (r0 == 0) goto L_0x000b
            te3.z21 r0 = r0.f509d
            if (r0 == 0) goto L_0x000b
            int r0 = r0.f145649p
            goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            r1 = 1
            boolean r0 = o40.C61926c.m72696u(r0, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "haveParticipated :"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "MMFinder.LiveLotterySlice"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rl1.C13022d0.mo12541g3():boolean");
    }

    /* renamed from: i3 */
    public final boolean mo12542i3(C52204z21 z212, C52204z21 z213) {
        if (!C87412m.m108589b(z212.f145640d, z213.f145640d)) {
            Log.m105924i("MMFinder.LiveLotterySlice", "isRemoteItemValid invalid id:" + z212.f145640d + ',' + z213.f145640d);
            return false;
        }
        int i = z213.f145648o;
        int i2 = z212.f145648o;
        int i3 = z213.f145643g;
        int i4 = z212.f145643g;
        if (i4 >= i3) {
            if (i3 < i4) {
                Log.m105924i("MMFinder.LiveLotterySlice", "printLotteryInfoList RemoteItem:" + C61937h.m72709h(Integer.valueOf(i2)) + " invalid");
                return false;
            } else if ((i2 == 1 && i != 1) || (i2 == 2 && i == 3)) {
                Log.m105924i("MMFinder.LiveLotterySlice", "printLotteryInfoList RemoteItem:" + C61937h.m72709h(Integer.valueOf(i2)) + " invalid");
                return false;
            }
        }
        return true;
    }

    /* renamed from: j3 */
    public final boolean mo12543j3() {
        C0082q qVar = this.f37098n;
        return qVar != null && qVar.f506a == 1;
    }

    /* renamed from: k3 */
    public final Object mo12544k3(C48987cd1 cd12, boolean z, C15601d<? super Boolean> dVar) {
        Class cls = C55001u.class;
        C66218h hVar = new C66218h(C66447b.m78392b(dVar));
        long j = BuildInfo.DEBUG ? 5 : 500;
        long j2 = ((C55001u) business(cls)).f154420q.f182392d;
        long j3 = ((C55001u) business(cls)).f154416j;
        C50401mh0 mh02 = new C50401mh0();
        mh02.f138028d = 9;
        mh02.f138029e = C89349b.m111674a(cd12.toByteArray());
        C13598b0 b0Var = C13598b0.f38549a;
        C45381p0 p0Var = new C45381p0(j2, j3, 1, mh02);
        if (z) {
            Context context = MMApplicationContext.getContext();
            C87412m.m108593f(context, "getContext()");
            p0Var.mo85582k(context, MMApplicationContext.getContext().getResources().getString(C0966R.string.ett), j);
        }
        C89059e i = p0Var.mo9225i();
        i.mo123420E(new C13026d(hVar));
        i.mo11397F(this);
        return hVar.mo90314b();
    }

    /* renamed from: l3 */
    public final void mo12545l3(C50617o01 o012) {
        C61926c.m72668M(new C13027e(o012, this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0076, code lost:
        r4 = r4.f133948d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007a A[Catch:{ all -> 0x00cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007f A[Catch:{ all -> 0x00cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0082 A[Catch:{ all -> 0x00cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0084 A[Catch:{ all -> 0x00cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0089 A[Catch:{ all -> 0x00cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x008b A[Catch:{ all -> 0x00cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ad A[Catch:{ all -> 0x00cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b7 A[Catch:{ all -> 0x00cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c4 A[Catch:{ all -> 0x00cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c5 A[Catch:{ all -> 0x00cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* renamed from: m3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo12546m3(int r25, wx3.C15601d<? super java.lang.Boolean> r26) {
        /*
            r24 = this;
            r1 = r24
            r0 = r26
            boolean r2 = r0 instanceof rl1.C13022d0.C13028f
            if (r2 == 0) goto L_0x0017
            r2 = r0
            rl1.d0$f r2 = (rl1.C13022d0.C13028f) r2
            int r3 = r2.f37120h
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f37120h = r3
            goto L_0x001c
        L_0x0017:
            rl1.d0$f r2 = new rl1.d0$f
            r2.<init>(r1, r0)
        L_0x001c:
            r7 = r2
            java.lang.Object r0 = r7.f37118f
            xx3.a r2 = xx3.C15911a.COROUTINE_SUSPENDED
            int r3 = r7.f37120h
            java.lang.String r10 = "MMFinder.LiveLotterySlice"
            r11 = 0
            r12 = 1
            if (r3 == 0) goto L_0x0043
            if (r3 != r12) goto L_0x003b
            int r2 = r7.f37117e
            java.lang.Object r3 = r7.f37116d
            rl1.d0 r3 = (rl1.C13022d0) r3
            kotlin.ResultKt.throwOnFailure(r0)     // Catch:{ all -> 0x00cb }
            r23 = r3
            r3 = r0
            r0 = r2
            r2 = r23
            goto L_0x0070
        L_0x003b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0043:
            kotlin.ResultKt.throwOnFailure(r0)
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch:{ all -> 0x00cb }
            dj1.n0 r3 = new dj1.n0     // Catch:{ all -> 0x00cb }
            r14 = 1
            r15 = 0
            r17 = 0
            java.lang.String r19 = ""
            r20 = 0
            r21 = 16
            r22 = 0
            r13 = r3
            r13.<init>(r14, r15, r17, r19, r20, r21, r22)     // Catch:{ all -> 0x00cb }
            r4 = 0
            r6 = 0
            r8 = 3
            r9 = 0
            r7.f37116d = r1     // Catch:{ all -> 0x00cb }
            r0 = r25
            r7.f37117e = r0     // Catch:{ all -> 0x00cb }
            r7.f37120h = r12     // Catch:{ all -> 0x00cb }
            java.lang.Object r3 = q40.C89456b.m111831a(r3, r4, r6, r7, r8, r9)     // Catch:{ all -> 0x00cb }
            if (r3 != r2) goto L_0x006f
            return r2
        L_0x006f:
            r2 = r1
        L_0x0070:
            te3.k01 r3 = (te3.C50060k01) r3     // Catch:{ all -> 0x00cb }
            te3.gb1 r4 = r3.f136491d     // Catch:{ all -> 0x00cb }
            if (r4 == 0) goto L_0x007f
            java.util.LinkedList<te3.d31> r4 = r4.f133948d     // Catch:{ all -> 0x00cb }
            if (r4 == 0) goto L_0x007f
            int r4 = r4.size()     // Catch:{ all -> 0x00cb }
            goto L_0x0080
        L_0x007f:
            r4 = 0
        L_0x0080:
            if (r4 <= 0) goto L_0x0084
            r4 = 1
            goto L_0x0085
        L_0x0084:
            r4 = 0
        L_0x0085:
            androidx.lifecycle.z<java.lang.Boolean> r2 = r2.f37101q     // Catch:{ all -> 0x00cb }
            if (r4 == 0) goto L_0x008b
            r5 = 1
            goto L_0x008c
        L_0x008b:
            r5 = 0
        L_0x008c:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ all -> 0x00cb }
            r2.postValue(r5)     // Catch:{ all -> 0x00cb }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00cb }
            r2.<init>()     // Catch:{ all -> 0x00cb }
            java.lang.String r5 = "prepareLotteryHistory source:"
            r2.append(r5)     // Catch:{ all -> 0x00cb }
            r2.append(r0)     // Catch:{ all -> 0x00cb }
            java.lang.String r0 = ",resp size:"
            r2.append(r0)     // Catch:{ all -> 0x00cb }
            te3.gb1 r0 = r3.f136491d     // Catch:{ all -> 0x00cb }
            if (r0 == 0) goto L_0x00b7
            java.util.LinkedList<te3.d31> r0 = r0.f133948d     // Catch:{ all -> 0x00cb }
            if (r0 == 0) goto L_0x00b7
            int r0 = r0.size()     // Catch:{ all -> 0x00cb }
            java.lang.Integer r3 = new java.lang.Integer     // Catch:{ all -> 0x00cb }
            r3.<init>(r0)     // Catch:{ all -> 0x00cb }
            goto L_0x00b8
        L_0x00b7:
            r3 = 0
        L_0x00b8:
            r2.append(r3)     // Catch:{ all -> 0x00cb }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x00cb }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)     // Catch:{ all -> 0x00cb }
            if (r4 == 0) goto L_0x00c5
            goto L_0x00c6
        L_0x00c5:
            r12 = 0
        L_0x00c6:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r12)     // Catch:{ all -> 0x00cb }
            return r0
        L_0x00cb:
            r0 = move-exception
            kotlin.Result$Companion r2 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m168114constructorimpl(r0)
            java.lang.Throwable r0 = kotlin.Result.m168117exceptionOrNullimpl(r0)
            if (r0 == 0) goto L_0x00e3
            java.lang.Object[] r2 = new java.lang.Object[r11]
            java.lang.String r3 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r10, r0, r3, r2)
        L_0x00e3:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rl1.C13022d0.mo12546m3(int, wx3.d):java.lang.Object");
    }

    /* renamed from: n3 */
    public final void mo12547n3(String str, boolean z) {
        C87412m.m108594g(str, "prefix");
        StringBuilder sb = new StringBuilder("printLotteryInfoList(" + str + ",fromJoinLive:" + z + ")：");
        int i = 0;
        for (T next : this.f37097j) {
            int i2 = i + 1;
            if (i >= 0) {
                sb.append("index:" + i + ',' + ((C0082q) next) + "};");
                i = i2;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        Log.m105924i("MMFinder.LiveLotterySlice", sb.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0014, code lost:
        r1 = r1.f509d;
     */
    /* renamed from: o3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12548o3(te3.C51633v21 r4) {
        /*
            r3 = this;
            java.lang.String r0 = "new"
            gy3.C87412m.m108594g(r4, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "replaceClaimMethod from "
            r0.append(r1)
            al1.q r1 = r3.f37098n
            r2 = 0
            if (r1 == 0) goto L_0x001b
            te3.z21 r1 = r1.f509d
            if (r1 == 0) goto L_0x001b
            te3.v21 r1 = r1.f145653t
            goto L_0x001c
        L_0x001b:
            r1 = r2
        L_0x001c:
            if (r1 != 0) goto L_0x0020
            java.lang.String r1 = ""
        L_0x0020:
            org.json.JSONObject r1 = o40.C61937h.m72709h(r1)
            r0.append(r1)
            java.lang.String r1 = " to "
            r0.append(r1)
            org.json.JSONObject r1 = o40.C61937h.m72709h(r4)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MMFinder.LiveLotterySlice"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            al1.q r0 = r3.f37098n
            if (r0 == 0) goto L_0x0042
            te3.z21 r2 = r0.f509d
        L_0x0042:
            if (r2 != 0) goto L_0x0045
            goto L_0x0047
        L_0x0045:
            r2.f145653t = r4
        L_0x0047:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rl1.C13022d0.mo12548o3(te3.v21):void");
    }

    public void onCleared() {
        C61926c.m72668M(new C13048k0(this));
        C61926c.m72668M(new C13036f0(this));
        this.f37099o = new ConcurrentLinkedDeque<>();
        this.f37104t = null;
        mo12534I3(false);
        mo12535J3((C50617o01) null);
        this.f37103s = new C49882ip2();
        C53973z1 z1Var = this.f37096i;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
    }
}
