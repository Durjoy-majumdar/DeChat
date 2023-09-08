package com.tencent.p014mm.app.plugin;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.app.plugin.C40028c;
import com.tencent.p014mm.app.plugin.URISpanHandlerSet;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.LruCache;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import de3.C31174f;
import de3.C45335p;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import wd3.C53155r0;

/* renamed from: com.tencent.mm.app.plugin.i */
public class C40034i implements C31174f {

    /* renamed from: n */
    public static C40034i f107343n;

    /* renamed from: d */
    public LruCache f107344d = new LruCache(128);

    /* renamed from: e */
    public C40028c f107345e;

    /* renamed from: f */
    public URISpanHandlerSet f107346f;

    /* renamed from: g */
    public Context f107347g = null;

    /* renamed from: h */
    public ArrayList<URISpanHandlerSet.BaseUriSpanHandler> f107348h = new ArrayList<>();

    /* renamed from: i */
    public ArrayList<URISpanHandlerSet.BaseUriSpanHandler> f107349i = new ArrayList<>();

    /* renamed from: j */
    public ArrayList<URISpanHandlerSet.BaseUriSpanHandler> f107350j = new ArrayList<>();

    /* renamed from: com.tencent.mm.app.plugin.i$a */
    public class C40035a implements C40028c.C40029a {

        /* renamed from: a */
        public final /* synthetic */ C53155r0 f107351a;

        /* renamed from: b */
        public final /* synthetic */ URISpanHandlerSet.BaseUriSpanHandler f107352b;

        /* renamed from: c */
        public final /* synthetic */ View f107353c;

        /* renamed from: d */
        public final /* synthetic */ C45335p f107354d;

        public C40035a(C53155r0 r0Var, URISpanHandlerSet.BaseUriSpanHandler baseUriSpanHandler, View view, C45335p pVar) {
            this.f107351a = r0Var;
            this.f107352b = baseUriSpanHandler;
            this.f107353c = view;
            this.f107354d = pVar;
        }
    }

    public C40034i() {
        Class<URISpanHandlerSet.BaseUriSpanHandler> cls = URISpanHandlerSet.BaseUriSpanHandler.class;
        Class<URISpanHandlerSet> cls2 = URISpanHandlerSet.class;
        long nowMilliSecond = Util.nowMilliSecond();
        Log.m105918d("MicroMsg.URISpanHandler", "init URISpanHandler");
        Context context = MMApplicationContext.getContext();
        this.f107347g = context;
        this.f107346f = new URISpanHandlerSet(context);
        Class[] declaredClasses = cls2.getDeclaredClasses();
        int length = declaredClasses.length;
        int i = 0;
        int i2 = 0;
        while (i2 < length) {
            Class cls3 = declaredClasses[i2];
            if (cls3 != null && cls3.getSuperclass() != null && cls3.isAnnotationPresent(URISpanHandlerSet.C40024a.class) && cls3.getSuperclass().getName().equals(cls.getName())) {
                try {
                    URISpanHandlerSet.C40024a aVar = (URISpanHandlerSet.C40024a) cls3.getAnnotation(URISpanHandlerSet.C40024a.class);
                    Class[] clsArr = new Class[1];
                    clsArr[i] = cls2;
                    Constructor declaredConstructor = cls3.getDeclaredConstructor(clsArr);
                    if (declaredConstructor != null) {
                        try {
                            URISpanHandlerSet.BaseUriSpanHandler cast = cls.cast(declaredConstructor.newInstance(new Object[]{this.f107346f}));
                            URISpanHandlerSet.PRIORITY priority = aVar.priority();
                            if (priority == URISpanHandlerSet.PRIORITY.LOW) {
                                this.f107350j.add(cast);
                            } else if (priority == URISpanHandlerSet.PRIORITY.NORMAL) {
                                this.f107349i.add(cast);
                            } else if (priority == URISpanHandlerSet.PRIORITY.HIGH) {
                                this.f107348h.add(cast);
                            }
                            Log.m105919d("MicroMsg.URISpanHandler", "successfully add: %s", cls3.getName());
                        } catch (Exception e) {
                            e = e;
                            i = 0;
                            Log.printErrStackTrace("MicroMsg.URISpanHandler", e, "", new Object[i]);
                            Object[] objArr = new Object[3];
                            objArr[i] = cls3.getName();
                            objArr[1] = e.getMessage();
                            objArr[2] = e.getClass().getName();
                            Log.m105919d("MicroMsg.URISpanHandler", "add %s error: %s, errorType:%s", objArr);
                            i2++;
                            i = 0;
                        } catch (Error e2) {
                            e = e2;
                            i = 0;
                            Log.printErrStackTrace("MicroMsg.URISpanHandler", e, "", new Object[i]);
                            Object[] objArr2 = new Object[3];
                            objArr2[i] = cls3.getName();
                            objArr2[1] = e.getMessage();
                            objArr2[2] = e.getClass().getName();
                            Log.m105919d("MicroMsg.URISpanHandler", "add %s error: %s, errorType:%s", objArr2);
                            i2++;
                            i = 0;
                        }
                    } else {
                        Log.m105919d("MicroMsg.URISpanHandler", "failed to add %s, constructor is null!!", cls3.getName());
                    }
                } catch (Exception e3) {
                    e = e3;
                    Log.printErrStackTrace("MicroMsg.URISpanHandler", e, "", new Object[i]);
                    Object[] objArr3 = new Object[3];
                    objArr3[i] = cls3.getName();
                    objArr3[1] = e.getMessage();
                    objArr3[2] = e.getClass().getName();
                    Log.m105919d("MicroMsg.URISpanHandler", "add %s error: %s, errorType:%s", objArr3);
                    i2++;
                    i = 0;
                } catch (Error e4) {
                    e = e4;
                    Log.printErrStackTrace("MicroMsg.URISpanHandler", e, "", new Object[i]);
                    Object[] objArr22 = new Object[3];
                    objArr22[i] = cls3.getName();
                    objArr22[1] = e.getMessage();
                    objArr22[2] = e.getClass().getName();
                    Log.m105919d("MicroMsg.URISpanHandler", "add %s error: %s, errorType:%s", objArr22);
                    i2++;
                    i = 0;
                }
            }
            i2++;
            i = 0;
        }
        Log.m105919d("MicroMsg.URISpanHandler", "init URISpanHandler used :%d ms", Long.valueOf(Util.nowMilliSecond() - nowMilliSecond));
    }

    /* renamed from: B */
    public static C40034i m43126B() {
        if (f107343n == null) {
            f107343n = new C40034i();
        }
        return f107343n;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: android.content.Context} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: android.content.Context} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: android.content.Context} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: te3.oy3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v21, resolved type: te3.oy3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v23, resolved type: te3.oy3} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0193  */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo62724D(android.content.Context r19, android.view.View r20, wd3.C53155r0 r21, de3.C45335p r22) {
        /*
            r18 = this;
            r6 = r18
            r0 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = 0
            java.lang.String r11 = "MicroMsg.URISpanHandler"
            if (r8 != 0) goto L_0x0015
            java.lang.String r0 = "handleSpanClick, hrefInfo is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r11, r0)
            return r10
        L_0x0015:
            r12 = 5
            java.lang.Object[] r1 = new java.lang.Object[r12]
            int r2 = r8.f148313d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1[r10] = r2
            r13 = 1
            if (r9 != 0) goto L_0x0025
            r2 = 1
            goto L_0x0026
        L_0x0025:
            r2 = 0
        L_0x0026:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r1[r13] = r2
            java.util.ArrayList<com.tencent.mm.app.plugin.URISpanHandlerSet$BaseUriSpanHandler> r2 = r6.f107348h
            int r2 = r2.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r14 = 2
            r1[r14] = r2
            r2 = 3
            java.util.ArrayList<com.tencent.mm.app.plugin.URISpanHandlerSet$BaseUriSpanHandler> r3 = r6.f107349i
            int r3 = r3.size()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            java.util.ArrayList<com.tencent.mm.app.plugin.URISpanHandlerSet$BaseUriSpanHandler> r2 = r6.f107350j
            int r2 = r2.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r15 = 4
            r1[r15] = r2
            java.lang.String r2 = "handleSpanClick, hrefInfo.getType:%d, callback==null:%b, mHighPriorityHandlerList.size:%d, mNormalPriorityHandlerList.size:%d, mLowPriorityHandlerList.size:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r11, r2, r1)
            r5 = 0
            if (r0 != 0) goto L_0x0065
            java.lang.String r0 = "handleSpanClick, context is null!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r0)
            com.tencent.mm.app.plugin.URISpanHandlerSet r0 = r6.f107346f
            r0.f107260a = r5
            return r10
        L_0x0065:
            r6.f107347g = r0
            com.tencent.mm.app.plugin.URISpanHandlerSet r1 = r6.f107346f
            r1.f107260a = r0
            java.util.ArrayList<com.tencent.mm.app.plugin.URISpanHandlerSet$BaseUriSpanHandler> r0 = r6.f107348h
            java.util.Iterator r0 = r0.iterator()
        L_0x0071:
            boolean r1 = r0.hasNext()
            java.lang.String r4 = "handleSpanClick, %s handle"
            if (r1 == 0) goto L_0x00a7
            java.lang.Object r1 = r0.next()
            com.tencent.mm.app.plugin.URISpanHandlerSet$BaseUriSpanHandler r1 = (com.tencent.p014mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler) r1
            int[] r2 = r1.mo62700a()
            int r3 = r8.f148313d
            boolean r2 = r6.mo62725d(r2, r3)
            if (r2 == 0) goto L_0x0071
            boolean r2 = r1.mo62702c(r7, r8, r9)
            if (r2 == 0) goto L_0x0071
            java.lang.Object[] r0 = new java.lang.Object[r13]
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0[r10] = r1
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r11, r4, r0)
            r6.f107347g = r5
            com.tencent.mm.app.plugin.URISpanHandlerSet r0 = r6.f107346f
            r0.f107260a = r5
            return r13
        L_0x00a7:
            java.util.ArrayList<com.tencent.mm.app.plugin.URISpanHandlerSet$BaseUriSpanHandler> r0 = r6.f107349i
            java.util.Iterator r16 = r0.iterator()
        L_0x00ad:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x01e4
            java.lang.Object r0 = r16.next()
            r3 = r0
            com.tencent.mm.app.plugin.URISpanHandlerSet$BaseUriSpanHandler r3 = (com.tencent.p014mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler) r3
            boolean r0 = r3 instanceof com.tencent.p014mm.app.plugin.URISpanHandlerSet.TopicSpanHandler
            if (r0 == 0) goto L_0x01a9
            int[] r0 = r3.mo62700a()
            int r1 = r8.f148313d
            boolean r0 = r6.mo62725d(r0, r1)
            if (r0 == 0) goto L_0x01a9
            com.tencent.mm.sdk.platformtools.LruCache r0 = r6.f107344d
            java.lang.String r1 = r8.f148312c
            java.lang.Object r0 = r0.get(r1)
            boolean r0 = r0 instanceof te3.C50755oy3
            if (r0 == 0) goto L_0x00e2
            com.tencent.mm.sdk.platformtools.LruCache r0 = r6.f107344d
            java.lang.String r1 = r8.f148312c
            java.lang.Object r0 = r0.get(r1)
            te3.oy3 r0 = (te3.C50755oy3) r0
            r1 = r0
            goto L_0x00e3
        L_0x00e2:
            r1 = r5
        L_0x00e3:
            int r0 = r8.f148323n
            if (r0 == r13) goto L_0x010f
            if (r0 == r15) goto L_0x010f
            r2 = 6
            if (r0 != r2) goto L_0x00ed
            goto L_0x010f
        L_0x00ed:
            if (r0 != r14) goto L_0x00f4
            r2 = 79
            r5 = 79
            goto L_0x0111
        L_0x00f4:
            if (r0 != r12) goto L_0x00fb
            r2 = 80
            r5 = 80
            goto L_0x0111
        L_0x00fb:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "error scene fromScene = "
            r2.append(r5)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r0)
        L_0x010f:
            r5 = 73
        L_0x0111:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "scene1 = "
            r0.append(r2)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)
            if (r1 != 0) goto L_0x0193
            com.tencent.mm.app.plugin.c r0 = r6.f107345e
            if (r0 != 0) goto L_0x0185
            com.tencent.mm.app.plugin.c r2 = new com.tencent.mm.app.plugin.c
            android.content.Context r1 = r6.f107347g
            java.lang.String r0 = r8.f148312c
            com.tencent.mm.app.plugin.i$a r12 = new com.tencent.mm.app.plugin.i$a
            r14 = r0
            r0 = r12
            r15 = r1
            r1 = r18
            r10 = r2
            r2 = r21
            r17 = r4
            r4 = r20
            r13 = r5
            r5 = r22
            r0.<init>(r2, r3, r4, r5)
            r10.<init>(r15, r13, r14, r12)
            r6.f107345e = r10
            r0 = 1
            r10.f107326g = r0
            com.tencent.mm.app.plugin.b r0 = new com.tencent.mm.app.plugin.b
            r0.<init>(r10)
            r10.f107330n = r0
            r1 = 1000(0x3e8, double:4.94E-321)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThreadDelayed(r0, r1)
            com.tencent.mm.app.plugin.a r0 = new com.tencent.mm.app.plugin.a
            r0.<init>(r10)
            r10.f107329j = r0
            r1 = 10000(0x2710, double:4.9407E-320)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThreadDelayed(r0, r1)
            f40.g r0 = f40.C86709a0.m107529k()
            ob0.b0 r0 = r0.f251779b
            r1 = 4790(0x12b6, float:6.712E-42)
            r0.mo123455a(r1, r10)
            xg.a r0 = new xg.a
            android.content.Context r1 = r10.f107324e
            java.lang.String r2 = r10.f107328i
            int r3 = r10.f107327h
            r0.<init>(r1, r2, r3)
            f40.g r1 = f40.C86709a0.m107529k()
            ob0.b0 r1 = r1.f251779b
            r1.mo123460f(r0)
            goto L_0x01d8
        L_0x0185:
            r17 = r4
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r1 = 0
            r2[r1] = r0
            java.lang.String r0 = "checkMPURL:%s."
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r0, r2)
            goto L_0x01d8
        L_0x0193:
            r17 = r4
            java.lang.String r0 = "checkMPURL has cache."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)
            r2 = r3
            com.tencent.mm.app.plugin.URISpanHandlerSet$TopicSpanHandler r2 = (com.tencent.p014mm.app.plugin.URISpanHandlerSet.TopicSpanHandler) r2
            r0 = r18
            r3 = r20
            r4 = r21
            r5 = r22
            r0.mo62726q(r1, r2, r3, r4, r5)
            goto L_0x01d8
        L_0x01a9:
            r17 = r4
            int[] r0 = r3.mo62700a()
            int r1 = r8.f148313d
            boolean r0 = r6.mo62725d(r0, r1)
            if (r0 == 0) goto L_0x01d8
            boolean r0 = r3.mo62702c(r7, r8, r9)
            if (r0 == 0) goto L_0x01d8
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Class r2 = r3.getClass()
            java.lang.String r2 = r2.getName()
            r3 = 0
            r1[r3] = r2
            r2 = r17
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r11, r2, r1)
            r1 = 0
            r6.f107347g = r1
            com.tencent.mm.app.plugin.URISpanHandlerSet r2 = r6.f107346f
            r2.f107260a = r1
            return r0
        L_0x01d8:
            r2 = r17
            r1 = 0
            r5 = r1
            r4 = r2
            r10 = 0
            r12 = 5
            r13 = 1
            r14 = 2
            r15 = 4
            goto L_0x00ad
        L_0x01e4:
            r2 = r4
            r1 = r5
            java.util.ArrayList<com.tencent.mm.app.plugin.URISpanHandlerSet$BaseUriSpanHandler> r0 = r6.f107350j
            java.util.Iterator r0 = r0.iterator()
        L_0x01ec:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0224
            java.lang.Object r3 = r0.next()
            com.tencent.mm.app.plugin.URISpanHandlerSet$BaseUriSpanHandler r3 = (com.tencent.p014mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler) r3
            int[] r4 = r3.mo62700a()
            int r5 = r8.f148313d
            boolean r4 = r6.mo62725d(r4, r5)
            if (r4 == 0) goto L_0x0222
            boolean r4 = r3.mo62702c(r7, r8, r9)
            if (r4 == 0) goto L_0x0222
            r4 = 1
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            r5 = 0
            r0[r5] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r11, r2, r0)
            r6.f107347g = r1
            com.tencent.mm.app.plugin.URISpanHandlerSet r0 = r6.f107346f
            r0.f107260a = r1
            return r4
        L_0x0222:
            r4 = 1
            goto L_0x01ec
        L_0x0224:
            r6.f107347g = r1
            com.tencent.mm.app.plugin.URISpanHandlerSet r0 = r6.f107346f
            r0.f107260a = r1
            java.lang.String r0 = "handleSpanClick, nothing handle"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r11, r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.app.plugin.C40034i.mo62724D(android.content.Context, android.view.View, wd3.r0, de3.p):boolean");
    }

    /* renamed from: d */
    public final boolean mo62725d(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:128:0x0424  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0427  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x042b  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x042d  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0095  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo62726q(te3.C50755oy3 r37, com.tencent.p014mm.app.plugin.URISpanHandlerSet.TopicSpanHandler r38, android.view.View r39, wd3.C53155r0 r40, de3.C45335p r41) {
        /*
            r36 = this;
            r0 = r36
            r1 = r37
            r4 = r40
            java.lang.Class<ht1.t1> r8 = ht1.C60200t1.class
            r9 = 1
            java.lang.Object[] r2 = new java.lang.Object[r9]
            int r3 = r1.f139450d
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5 = 0
            r2[r5] = r3
            java.lang.String r3 = "MicroMsg.URISpanHandler"
            java.lang.String r6 = "handleSpanClick, response.JumpType: %s."
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r6, r2)
            int r10 = r4.f148323n
            r11 = 2
            r12 = 4
            r13 = 6
            r14 = 5
            if (r10 == r9) goto L_0x0046
            if (r10 == r12) goto L_0x0046
            if (r10 != r13) goto L_0x0028
            goto L_0x0046
        L_0x0028:
            if (r10 != r11) goto L_0x002d
            r2 = 79
            goto L_0x0048
        L_0x002d:
            if (r10 != r14) goto L_0x0032
            r2 = 80
            goto L_0x0048
        L_0x0032:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = "error scene fromScene = "
            r2.append(r6)
            r2.append(r10)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r2)
        L_0x0046:
            r2 = 73
        L_0x0048:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "scene1 = "
            r6.append(r7)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r6)
            java.lang.Class<vr.e> r6 = p255vr.C65873e.class
            di3.d r6 = di3.C86312j.m106911c(r6)
            vr.e r6 = (p255vr.C65873e) r6
            java.lang.String r6 = r6.ep0(r2)
            int r2 = r1.f139450d
            r15 = 0
            if (r2 != r9) goto L_0x0095
            int[] r1 = r38.mo62700a()
            int r2 = r4.f148313d
            boolean r1 = r0.mo62725d(r1, r2)
            if (r1 == 0) goto L_0x0440
            r38.mo62702c(r39, r40, r41)
            java.lang.Object[] r1 = new java.lang.Object[r9]
            java.lang.Class r2 = r38.getClass()
            java.lang.String r2 = r2.getName()
            r1[r5] = r2
            java.lang.String r2 = "handleSpanClick, %s handle"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r2, r1)
            r0.f107347g = r15
            com.tencent.mm.app.plugin.URISpanHandlerSet r1 = r0.f107346f
            r1.f107260a = r15
            goto L_0x0440
        L_0x0095:
            if (r2 != r11) goto L_0x00c1
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r1 = r1.f139456j
            java.lang.String r3 = "rawUrl"
            r2.putExtra(r3, r1)
            android.content.Context r1 = r0.f107347g
            java.lang.String r3 = "webview"
            java.lang.String r5 = ".ui.tools.WebViewUI"
            ke3.C88144b.m109791i(r1, r3, r5, r2, r15)
            r0.f107347g = r15
            com.tencent.mm.app.plugin.URISpanHandlerSet r1 = r0.f107346f
            r1.f107260a = r15
            r5 = 1
            r7 = 0
            r1 = r38
            r2 = r39
            r3 = r40
            r4 = r6
            r6 = r7
            r1.mo62712f(r2, r3, r4, r5, r6)
            goto L_0x0440
        L_0x00c1:
            if (r2 != r12) goto L_0x010a
            r7 = 2
            r8 = 2
            r2 = r38
            r3 = r39
            r4 = r40
            r5 = r6
            r6 = r7
            r7 = r8
            r2.mo62712f(r3, r4, r5, r6, r7)
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r1 = r1.f139451e
            java.lang.String r3 = "Contact_User"
            r2.putExtra(r3, r1)
            java.lang.String r1 = "Contact_Scene"
            if (r10 == r11) goto L_0x00f0
            if (r10 != r14) goto L_0x00e4
            goto L_0x00f0
        L_0x00e4:
            if (r10 == r9) goto L_0x00ea
            if (r10 == r12) goto L_0x00ea
            if (r10 != r13) goto L_0x00f5
        L_0x00ea:
            r3 = 245(0xf5, float:3.43E-43)
            r2.putExtra(r1, r3)
            goto L_0x00f5
        L_0x00f0:
            r3 = 244(0xf4, float:3.42E-43)
            r2.putExtra(r1, r3)
        L_0x00f5:
            java.lang.String r1 = "force_get_contact"
            r2.putExtra(r1, r9)
            java.lang.String r1 = "key_use_new_contact_profile"
            r2.putExtra(r1, r9)
            android.content.Context r1 = r0.f107347g
            java.lang.String r3 = "profile"
            java.lang.String r4 = ".ui.ContactInfoUI"
            ke3.C88144b.m109791i(r1, r3, r4, r2, r15)
            goto L_0x0440
        L_0x010a:
            r7 = 3
            if (r2 != r14) goto L_0x018a
            r15 = 2
            r16 = 1
            r2 = r38
            r3 = r39
            r4 = r40
            r5 = r6
            r6 = r15
            r15 = 3
            r7 = r16
            r2.mo62712f(r3, r4, r5, r6, r7)
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r3 = "report_scene"
            r2.putExtra(r3, r15)
            r3 = 8
            java.lang.String r4 = "key_enter_profile_type"
            r2.putExtra(r4, r3)
            java.lang.String r3 = r1.f139451e
            java.lang.String r4 = "finder_username"
            r2.putExtra(r4, r3)
            java.lang.String r1 = r1.f139451e
            java.lang.String r3 = "key_finder_teen_mode_user_id"
            r2.putExtra(r3, r1)
            r1 = 27
            java.lang.String r3 = "key_card_type"
            java.lang.String r4 = "key_enter_scene"
            r5 = 96
            java.lang.String r6 = "key_from_comment_scene"
            if (r10 == r11) goto L_0x015c
            if (r10 != r14) goto L_0x014c
            goto L_0x015c
        L_0x014c:
            if (r10 == r9) goto L_0x0152
            if (r10 == r12) goto L_0x0152
            if (r10 != r13) goto L_0x0165
        L_0x0152:
            r2.putExtra(r6, r5)
            r2.putExtra(r4, r11)
            r2.putExtra(r3, r1)
            goto L_0x0165
        L_0x015c:
            r2.putExtra(r6, r5)
            r2.putExtra(r4, r12)
            r2.putExtra(r3, r1)
        L_0x0165:
            di3.d r1 = di3.C86312j.m106911c(r8)
            ht1.t1 r1 = (ht1.C60200t1) r1
            ht1.z4 r1 = r1.mo76861l7()
            boolean r1 = r1.mo83771R5()
            java.lang.String r3 = "key_finder_teen_mode_check"
            r2.putExtra(r3, r1)
            java.lang.String r1 = "key_finder_teen_mode_scene"
            r2.putExtra(r1, r15)
            di3.d r1 = di3.C86312j.m106911c(r8)
            ht1.t1 r1 = (ht1.C60200t1) r1
            android.content.Context r3 = r0.f107347g
            r1.mo76819V1(r3, r2)
            goto L_0x0440
        L_0x018a:
            if (r2 != r7) goto L_0x0440
            java.lang.String r2 = "[WxaShortLinkUriSpanHandler] handleSpanClick "
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            java.lang.Object r2 = r4.f148314e
            boolean r8 = r2 instanceof android.os.Bundle
            if (r8 == 0) goto L_0x0415
            android.os.Bundle r2 = (android.os.Bundle) r2
            java.lang.String r8 = "key_wxa_short_link_launch_scene"
            java.lang.String r10 = ""
            java.lang.String r8 = r2.getString(r8, r10)
            java.lang.String r15 = "key_wxa_short_link_launch_chat_type"
            r13 = -1
            int r2 = r2.getInt(r15, r13)
            boolean r15 = r8.isEmpty()
            if (r15 != 0) goto L_0x0415
            de3.f0$b r15 = de3.C45331f0.C45333b.valueOf(r8)
            java.lang.Object[] r13 = new java.lang.Object[r7]
            r13[r5] = r8
            int r8 = r15.f122801d
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r13[r9] = r8
            int r8 = r15.f122802e
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r13[r11] = r8
            java.lang.String r8 = "[WxaShortLinkUriSpanHandler] sceneName=%s  scene=%d  preScene=%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r8, r13)
            com.tencent.mm.plugin.appbrand.shortlink.cgi.WxaShortLinkInfo r3 = new com.tencent.mm.plugin.appbrand.shortlink.cgi.WxaShortLinkInfo
            java.lang.String r8 = r1.f139454h
            if (r8 != 0) goto L_0x01d4
            r18 = r10
            goto L_0x01d6
        L_0x01d4:
            r18 = r8
        L_0x01d6:
            java.lang.String r8 = r1.f139452f
            if (r8 != 0) goto L_0x01dd
            r20 = r10
            goto L_0x01df
        L_0x01dd:
            r20 = r8
        L_0x01df:
            int r8 = r1.f139458o
            int r13 = r1.f139453g
            java.lang.String r5 = r1.f139455i
            if (r5 != 0) goto L_0x01ea
            r23 = r10
            goto L_0x01ec
        L_0x01ea:
            r23 = r5
        L_0x01ec:
            java.lang.String r5 = r1.f139451e
            if (r5 != 0) goto L_0x01f3
            r24 = r10
            goto L_0x01f5
        L_0x01f3:
            r24 = r5
        L_0x01f5:
            java.lang.String r19 = ""
            r17 = r3
            r21 = r8
            r22 = r13
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r2)
            r8.append(r10)
            java.lang.String r2 = r8.toString()
            java.lang.String r8 = "chatType"
            r5.put(r8, r2)
            java.lang.String r2 = "requestId"
            r5.put(r2, r6)
            java.lang.String r13 = r4.f148312c
            java.lang.String r12 = "message"
            r5.put(r12, r13)
            int r13 = r4.f148323n
            java.lang.String r7 = "prescene_for_report"
            java.lang.String r14 = "talkerUsername"
            java.lang.String r11 = "0"
            java.lang.String r9 = "4"
            r22 = r10
            java.lang.String r10 = "1"
            r23 = r6
            java.lang.String r6 = "2"
            java.lang.String r1 = "5"
            r24 = r8
            java.lang.String r8 = "3"
            r25 = r12
            r12 = 1
            if (r13 != r12) goto L_0x02d6
            java.lang.String r12 = r4.f148318i
            boolean r12 = com.tencent.p014mm.storage.C72996z1.m85820U5(r12)
            if (r12 != 0) goto L_0x027f
            java.lang.String r12 = r4.f148318i
            boolean r12 = com.tencent.p014mm.storage.C72996z1.m85843n5(r12)
            if (r12 == 0) goto L_0x0266
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = r4.f148315f
            r12.append(r13)
            java.lang.String r13 = "_2"
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            goto L_0x0279
        L_0x0266:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = r4.f148315f
            r12.append(r13)
            java.lang.String r13 = "_1"
            r12.append(r13)
            java.lang.String r12 = r12.toString()
        L_0x0279:
            r5.put(r7, r10)
            r26 = r2
            goto L_0x02c8
        L_0x027f:
            java.lang.String r12 = r4.f148318i
            boolean r12 = eb0.C45628s0.m50735A(r12)
            java.lang.String r13 = "_"
            if (r12 == 0) goto L_0x02a7
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r26 = r2
            java.lang.String r2 = r4.f148318i
            r12.append(r2)
            r12.append(r13)
            java.lang.String r2 = r4.f148315f
            r12.append(r2)
            java.lang.String r2 = "_4"
            r12.append(r2)
            java.lang.String r2 = r12.toString()
            goto L_0x02c4
        L_0x02a7:
            r26 = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r12 = r4.f148318i
            r2.append(r12)
            r2.append(r13)
            java.lang.String r12 = r4.f148315f
            r2.append(r12)
            java.lang.String r12 = "_3"
            r2.append(r12)
            java.lang.String r2 = r2.toString()
        L_0x02c4:
            r12 = r2
            r5.put(r7, r6)
        L_0x02c8:
            java.lang.String r2 = r4.f148318i
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x02fa
            java.lang.String r2 = r4.f148318i
            r5.put(r14, r2)
            goto L_0x02fa
        L_0x02d6:
            r26 = r2
            r2 = 2
            if (r13 == r2) goto L_0x02f5
            r2 = 5
            if (r13 != r2) goto L_0x02df
            goto L_0x02f5
        L_0x02df:
            r2 = 3
            if (r13 != r2) goto L_0x02e6
            r5.put(r7, r1)
            goto L_0x02f8
        L_0x02e6:
            r2 = 4
            if (r13 == r2) goto L_0x02f1
            r2 = 6
            if (r13 != r2) goto L_0x02ed
            goto L_0x02f1
        L_0x02ed:
            r5.put(r7, r11)
            goto L_0x02f8
        L_0x02f1:
            r5.put(r7, r9)
            goto L_0x02f8
        L_0x02f5:
            r5.put(r7, r8)
        L_0x02f8:
            r12 = r22
        L_0x02fa:
            int r2 = r4.f148323n
            java.lang.String r13 = "scene_for_report"
            r27 = r14
            r14 = 1
            if (r2 != r14) goto L_0x0315
            java.lang.String r1 = r4.f148318i
            boolean r1 = com.tencent.p014mm.storage.C72996z1.m85820U5(r1)
            if (r1 != 0) goto L_0x030f
            r5.put(r13, r6)
            goto L_0x0312
        L_0x030f:
            r5.put(r13, r8)
        L_0x0312:
            r6 = 2
            r8 = 3
            goto L_0x0336
        L_0x0315:
            r6 = 2
            if (r2 == r6) goto L_0x0332
            r8 = 5
            if (r2 != r8) goto L_0x031c
            goto L_0x0332
        L_0x031c:
            r8 = 3
            if (r2 != r8) goto L_0x0323
            r5.put(r13, r1)
            goto L_0x0336
        L_0x0323:
            r1 = 4
            if (r2 == r1) goto L_0x032e
            r1 = 6
            if (r2 != r1) goto L_0x032a
            goto L_0x032e
        L_0x032a:
            r5.put(r13, r11)
            goto L_0x0336
        L_0x032e:
            r5.put(r13, r9)
            goto L_0x0336
        L_0x0332:
            r8 = 3
            r5.put(r13, r10)
        L_0x0336:
            java.lang.String r1 = "presceneNote_for_report"
            r5.put(r1, r12)
            android.content.Context r2 = r0.f107347g
            java.lang.String r9 = r4.f148312c
            java.lang.String r10 = r4.f148316g
            if (r10 == 0) goto L_0x0344
            goto L_0x034b
        L_0x0344:
            java.lang.String r10 = r4.f148315f
            if (r10 == 0) goto L_0x0349
            goto L_0x034b
        L_0x0349:
            r10 = r22
        L_0x034b:
            int r11 = com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandCheckWxaShortLinkUI.f108873g
            java.lang.String r11 = "context"
            gy3.C87412m.m108594g(r2, r11)
            java.lang.String r11 = "url"
            gy3.C87412m.m108594g(r9, r11)
            boolean r12 = z04.C112551y.m153811k(r9)
            if (r12 == 0) goto L_0x0360
            r3 = 0
            goto L_0x041a
        L_0x0360:
            java.lang.String r12 = "MicroMsg.AppBrandCheckWxaShortLinkUI"
            java.lang.String r14 = "startCheckLink noneedcheck"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r14)
            android.content.Intent r12 = new android.content.Intent
            java.lang.Class<com.tencent.mm.plugin.appbrand.ui.AppBrandCheckWxaShortLinkUI> r14 = com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandCheckWxaShortLinkUI.class
            r12.<init>(r2, r14)
            r14 = 536870912(0x20000000, float:1.0842022E-19)
            r12.addFlags(r14)
            r12.putExtra(r11, r9)
            java.lang.String r9 = "senderUsername"
            r12.putExtra(r9, r10)
            java.lang.String r9 = r15.name()
            java.lang.String r10 = "scene"
            r12.putExtra(r10, r9)
            java.lang.String r9 = "need_check"
            r10 = 0
            r12.putExtra(r9, r10)
            java.lang.String r9 = "shortLinkInfo"
            r12.putExtra(r9, r3)
            r3 = r26
            java.lang.Object r9 = r5.get(r3)
            java.lang.String r9 = (java.lang.String) r9
            r12.putExtra(r3, r9)
            r3 = r25
            java.lang.Object r9 = r5.get(r3)
            java.lang.String r9 = (java.lang.String) r9
            r12.putExtra(r3, r9)
            java.lang.Object r3 = r5.get(r7)
            java.lang.String r3 = (java.lang.String) r3
            r12.putExtra(r7, r3)
            java.lang.Object r3 = r5.get(r13)
            java.lang.String r3 = (java.lang.String) r3
            r12.putExtra(r13, r3)
            java.lang.Object r3 = r5.get(r1)
            java.lang.String r3 = (java.lang.String) r3
            r12.putExtra(r1, r3)
            r1 = r24
            java.lang.Object r3 = r5.get(r1)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L_0x03cf
            int r13 = java.lang.Integer.parseInt(r3)
            goto L_0x03d0
        L_0x03cf:
            r13 = -1
        L_0x03d0:
            r12.putExtra(r1, r13)
            r1 = r27
            java.lang.Object r3 = r5.get(r1)
            java.lang.String r3 = (java.lang.String) r3
            r12.putExtra(r1, r3)
            k20.a r1 = new k20.a
            r1.<init>()
            r1.mo10233c(r12)
            java.lang.Object[] r29 = r1.mo10232b()
            java.lang.String r30 = "com/tencent/mm/plugin/appbrand/ui/AppBrandCheckWxaShortLinkUI$Companion"
            java.lang.String r31 = "startCheckLink"
            java.lang.String r32 = "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/mm/pluginsdk/ui/span/WxaShortLinkScene$SCENE;ZLcom/tencent/mm/plugin/appbrand/shortlink/cgi/WxaShortLinkInfo;Ljava/util/HashMap;)V"
            java.lang.String r33 = "Undefined"
            java.lang.String r34 = "startActivity"
            java.lang.String r35 = "(Landroid/content/Intent;)V"
            r28 = r2
            j20.C117292a.m165358d(r28, r29, r30, r31, r32, r33, r34, r35)
            r3 = 0
            java.lang.Object r1 = r1.mo10231a(r3)
            android.content.Intent r1 = (android.content.Intent) r1
            r2.startActivity(r1)
            java.lang.String r29 = "com/tencent/mm/plugin/appbrand/ui/AppBrandCheckWxaShortLinkUI$Companion"
            java.lang.String r30 = "startCheckLink"
            java.lang.String r31 = "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/mm/pluginsdk/ui/span/WxaShortLinkScene$SCENE;ZLcom/tencent/mm/plugin/appbrand/shortlink/cgi/WxaShortLinkInfo;Ljava/util/HashMap;)V"
            java.lang.String r32 = "Undefined"
            java.lang.String r33 = "startActivity"
            java.lang.String r34 = "(Landroid/content/Intent;)V"
            j20.C117292a.m165359e(r28, r29, r30, r31, r32, r33, r34)
            goto L_0x041a
        L_0x0415:
            r23 = r6
            r3 = 0
            r6 = 2
            r8 = 3
        L_0x041a:
            r1 = r37
            java.lang.String r1 = r1.f139451e
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0427
            r1 = 1
            r5 = 1
            goto L_0x0429
        L_0x0427:
            r1 = 1
            r5 = 2
        L_0x0429:
            if (r5 != r1) goto L_0x042d
            r6 = 0
            goto L_0x042e
        L_0x042d:
            r6 = 3
        L_0x042e:
            r1 = r38
            r2 = r39
            r3 = r40
            r4 = r23
            r1.mo62712f(r2, r3, r4, r5, r6)
            r1 = 0
            r0.f107347g = r1
            com.tencent.mm.app.plugin.URISpanHandlerSet r2 = r0.f107346f
            r2.f107260a = r1
        L_0x0440:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.app.plugin.C40034i.mo62726q(te3.oy3, com.tencent.mm.app.plugin.URISpanHandlerSet$TopicSpanHandler, android.view.View, wd3.r0, de3.p):void");
    }
}
