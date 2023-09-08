package com.tencent.p014mm.p136ui.chatting.component;

import a14.C0000n0;
import fy3.C32227p;
import java.util.ArrayList;
import rx3.C13598b0;
import te3.ea4;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.ui.chatting.component.TextToSpeechComponent$saveAndPlaySpeech$2", mo125469f = "TextToSpeechComponent.kt", mo125470l = {240}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.ui.chatting.component.d5 */
public final class C44819d5 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f121623d;

    /* renamed from: e */
    public int f121624e;

    /* renamed from: f */
    public int f121625f;

    /* renamed from: g */
    public Object f121626g;

    /* renamed from: h */
    public Object f121627h;

    /* renamed from: i */
    public Object f121628i;

    /* renamed from: j */
    public Object f121629j;

    /* renamed from: n */
    public long f121630n;

    /* renamed from: o */
    public int f121631o;

    /* renamed from: p */
    public final /* synthetic */ ArrayList<ea4> f121632p;

    /* renamed from: q */
    public final /* synthetic */ C19717a5 f121633q;

    /* renamed from: r */
    public final /* synthetic */ long f121634r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44819d5(ArrayList<ea4> arrayList, C19717a5 a5Var, long j, C15601d<? super C44819d5> dVar) {
        super(2, dVar);
        this.f121632p = arrayList;
        this.f121633q = a5Var;
        this.f121634r = j;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C44819d5(this.f121632p, this.f121633q, this.f121634r, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C44819d5) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v59, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v14, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v60, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v15, resolved type: te3.ea4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v61, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v18, resolved type: com.tencent.mm.ui.chatting.component.a5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v62, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: java.util.ArrayList<te3.ea4>} */
    /* JADX WARNING: type inference failed for: r16v2 */
    /* JADX WARNING: type inference failed for: r16v11 */
    /* JADX WARNING: type inference failed for: r16v30 */
    /* JADX WARNING: Can't wrap try/catch for region: R(10:62|63|64|65|66|70|(5:81|(1:83)|84|(1:86)(1:87)|88)(2:72|(4:74|(1:76)(1:77)|(1:79)|80))|120|138|139) */
    /* JADX WARNING: Can't wrap try/catch for region: R(20:19|(17:37|38|(3:40|139|(1:140)(0))|41|42|43|44|45|46|47|48|49|50|51|52|(1:54)(11:55|56|57|(0)|69|70|(0)(0)|120|138|139|(0))|54)(10:23|(2:25|(1:27))|28|(1:30)(1:31)|(3:33|(1:35)|36)|38|(14:41|42|43|44|45|46|47|48|49|50|51|52|(0)|54)|40|139|(0)(0))|21|37|38|(0)|41|42|43|44|45|46|47|48|49|50|51|52|(0)(0)|54) */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0224, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0225, code lost:
        r4 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0226, code lost:
        r6 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0229, code lost:
        r4 = r15;
        r6 = r22;
        r2 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x022e, code lost:
        r13 = r2;
        r15 = r3;
        r16 = r4;
        r2 = r6;
        r3 = r10;
        r4 = r14;
        r14 = r1;
        r10 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:?, code lost:
        r16 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0246, code lost:
        r0 = com.tencent.p014mm.p136ui.tools.C19843m.f56474a;
        r16 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0248, code lost:
        if (r0 != null) goto L_0x024a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x024a, code lost:
        r16 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x024e, code lost:
        if (r0.isSpeaking() == false) goto L_0x0250;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0258, code lost:
        r0 = r0.f132829d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x025b, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x025e, code lost:
        r0 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x026a, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x026b, code lost:
        r4 = r15;
        r6 = r22;
        r2 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0270, code lost:
        r13 = r2;
        r15 = r3;
        r16 = r4;
        r2 = r6;
        r3 = r10;
        r4 = r14;
        r14 = r1;
        r10 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02b1, code lost:
        r0 = r0.f132829d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02b4, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02b7, code lost:
        r0 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01bb, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0213, code lost:
        r0 = e;
        r16 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0219, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x021b, code lost:
        r4 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x021d, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x021e, code lost:
        r4 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0220, code lost:
        r4 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0221, code lost:
        r6 = r22;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0246  */
    /* JADX WARNING: Removed duplicated region for block: B:10:? A[ExcHandler: z2 (unused a14.z2), SYNTHETIC, Splitter:B:56:0x01a0] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0258  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x025b  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x02b1  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x02b4  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x02b7  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x02ca  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0194 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01ae A[SYNTHETIC, Splitter:B:59:0x01ae] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01d4 A[Catch:{ d -> 0x0213, z2 -> 0x0237 }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01f3 A[Catch:{ d -> 0x0213, z2 -> 0x0237 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            r26 = this;
            r1 = r26
            xx3.a r2 = xx3.C15911a.COROUTINE_SUSPENDED
            int r0 = r1.f121631o
            java.lang.String r4 = ""
            java.lang.String r5 = "MicroMsg.TextToSpeechComponent"
            r8 = 1
            if (r0 == 0) goto L_0x0058
            if (r0 != r8) goto L_0x0050
            int r9 = r1.f121625f
            int r10 = r1.f121624e
            long r11 = r1.f121630n
            int r13 = r1.f121623d
            java.lang.Object r0 = r1.f121629j
            r14 = r0
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r0 = r1.f121628i
            r15 = r0
            te3.ea4 r15 = (te3.ea4) r15
            java.lang.Object r0 = r1.f121627h
            r16 = r0
            com.tencent.mm.ui.chatting.component.a5 r16 = (com.tencent.p014mm.p136ui.chatting.component.C19717a5) r16
            java.lang.Object r0 = r1.f121626g
            r17 = r0
            java.util.ArrayList r17 = (java.util.ArrayList) r17
            kotlin.ResultKt.throwOnFailure(r27)     // Catch:{ d -> 0x0044, z2 -> 0x003a }
            r0 = r27
            r23 = r4
            r3 = r16
            r4 = r17
            goto L_0x01a0
        L_0x003a:
            r23 = r4
            r3 = r16
            r4 = r17
        L_0x0040:
            r16 = r1
            goto L_0x0237
        L_0x0044:
            r0 = move-exception
            r23 = r4
            r3 = r16
            r4 = r17
        L_0x004b:
            r16 = r1
        L_0x004d:
            r1 = 2
            goto L_0x027b
        L_0x0050:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0058:
            kotlin.ResultKt.throwOnFailure(r27)
            java.util.ArrayList<te3.ea4> r0 = r1.f121632p
            int r0 = r0.size()
            java.util.ArrayList<te3.ea4> r9 = r1.f121632p
            com.tencent.mm.ui.chatting.component.a5 r10 = r1.f121633q
            long r11 = r1.f121634r
            r13 = r0
            r15 = r1
            r14 = r9
            r9 = 0
        L_0x006b:
            if (r9 >= r13) goto L_0x02ca
            java.lang.Object r0 = r14.get(r9)
            java.lang.String r3 = "inputText[i]"
            gy3.C87412m.m108593f(r0, r3)
            r3 = r0
            te3.ea4 r3 = (te3.ea4) r3
            java.lang.String r0 = r3.f132829d
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r10.getClass()
            android.content.Context r16 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            if (r16 == 0) goto L_0x0110
            android.content.Context r16 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.io.File r16 = r16.getCacheDir()
            if (r16 != 0) goto L_0x0095
            goto L_0x0110
        L_0x0095:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            f40.o r7 = f40.C86709a0.m107535s()
            java.lang.String r7 = r7.f251807e
            r6.append(r7)
            java.lang.String r7 = "speech"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            android.net.Uri r7 = com.tencent.p014mm.vfs.C116299g2.m163858n(r6)
            java.lang.String r1 = r7.getPath()
            r23 = r4
            if (r1 == 0) goto L_0x00d3
            r4 = 0
            java.lang.String r1 = com.tencent.p014mm.vfs.C116299g2.m163855k(r1, r4, r4)
            java.lang.String r4 = r7.getPath()
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x00d3
            android.net.Uri$Builder r4 = r7.buildUpon()
            android.net.Uri$Builder r1 = r4.path(r1)
            android.net.Uri r7 = r1.build()
        L_0x00d3:
            com.tencent.mm.vfs.f0 r1 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            r22 = r2
            r4 = 0
            com.tencent.mm.vfs.f0$h r2 = r1.mo177799l(r7, r4)
            boolean r16 = r2.mo177810a()
            if (r16 != 0) goto L_0x00e6
            r24 = r13
            r4 = 0
            goto L_0x00f0
        L_0x00e6:
            com.tencent.mm.vfs.FileSystem$c r4 = r2.f348991a
            r24 = r13
            java.lang.String r13 = r2.f348992b
            boolean r4 = r4.mo119948x(r13)
        L_0x00f0:
            if (r4 != 0) goto L_0x011d
            com.tencent.mm.vfs.f0$h r1 = r1.mo177799l(r7, r2)
            boolean r2 = r1.mo177810a()
            if (r2 != 0) goto L_0x00fd
            goto L_0x0104
        L_0x00fd:
            com.tencent.mm.vfs.FileSystem$c r2 = r1.f348991a
            java.lang.String r1 = r1.f348992b
            r2.mo119937g(r1)
        L_0x0104:
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r1 = 0
            r2[r1] = r6
            java.lang.String r1 = "path is not exists, mkdir path: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r1, r2)
            goto L_0x011d
        L_0x0110:
            r22 = r2
            r23 = r4
            r24 = r13
            java.lang.String r1 = "path is empty, MMApplicationContext.getContext() == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r1)
            r6 = r23
        L_0x011d:
            r8.append(r6)
            r1 = 47
            r8.append(r1)
            r8.append(r11)
            r8.append(r1)
            r8.append(r9)
            java.lang.String r1 = r8.toString()
            boolean r2 = com.tencent.p014mm.vfs.C86013q1.m106450k(r1)
            r4 = 2
            java.lang.Object[] r6 = new java.lang.Object[r4]
            r4 = 0
            r6[r4] = r1
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
            r7 = 1
            r6[r7] = r4
            java.lang.String r4 = "onTextToSpeech , tm pPath:%s, fileExist:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r4, r6)
            if (r2 == 0) goto L_0x0157
            ld0.f r0 = r10.f56071g
            r0.mo33552a(r1)
            r2 = r22
            r13 = r24
            r1 = 1
            r7 = 0
            goto L_0x02c2
        L_0x0157:
            java.lang.String r2 = "subText"
            gy3.C87412m.m108593f(r0, r2)     // Catch:{ d -> 0x026a, z2 -> 0x0229 }
            r15.f121626g = r14     // Catch:{ d -> 0x026a, z2 -> 0x0229 }
            r15.f121627h = r10     // Catch:{ d -> 0x026a, z2 -> 0x0229 }
            r15.f121628i = r3     // Catch:{ d -> 0x026a, z2 -> 0x0229 }
            r15.f121629j = r1     // Catch:{ d -> 0x026a, z2 -> 0x0229 }
            r2 = r24
            r15.f121623d = r2     // Catch:{ d -> 0x0224, z2 -> 0x0220 }
            r15.f121630n = r11     // Catch:{ d -> 0x0224, z2 -> 0x0220 }
            r15.f121624e = r9     // Catch:{ d -> 0x0224, z2 -> 0x0220 }
            r15.f121625f = r9     // Catch:{ d -> 0x0224, z2 -> 0x0220 }
            r4 = 1
            r15.f121631o = r4     // Catch:{ d -> 0x0224, z2 -> 0x0220 }
            te3.ni4 r4 = new te3.ni4     // Catch:{ d -> 0x021d, z2 -> 0x021b }
            r4.<init>()     // Catch:{ d -> 0x021d, z2 -> 0x021b }
            r4.f138619d = r0     // Catch:{ d -> 0x021d, z2 -> 0x021b }
            r6 = 0
            r4.f138622g = r6     // Catch:{ d -> 0x021d, z2 -> 0x021b }
            g13.a r0 = new g13.a     // Catch:{ d -> 0x021d, z2 -> 0x021b }
            r0.<init>(r4)     // Catch:{ d -> 0x021d, z2 -> 0x021b }
            r16 = 5000(0x1388, double:2.4703E-320)
            r18 = 0
            r20 = 2
            r21 = 0
            r4 = r15
            r15 = r0
            r19 = r4
            java.lang.Object r0 = q40.C89456b.m111831a(r15, r16, r18, r19, r20, r21)     // Catch:{ d -> 0x0219, z2 -> 0x0221 }
            r6 = r22
            if (r0 != r6) goto L_0x0195
            return r6
        L_0x0195:
            r13 = r2
            r15 = r3
            r2 = r6
            r3 = r10
            r10 = r9
            r25 = r14
            r14 = r1
            r1 = r4
            r4 = r25
        L_0x01a0:
            te3.oi4 r0 = (te3.oi4) r0     // Catch:{ d -> 0x0216, z2 -> 0x0040 }
            java.lang.String r6 = "getTransText,tmpPath:%s, speechSize:%s, unKnow:%s"
            r7 = 3
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ d -> 0x0216, z2 -> 0x0040 }
            r8 = 0
            r7[r8] = r14     // Catch:{ d -> 0x0216, z2 -> 0x0040 }
            pe3.b r8 = r0.f139205d     // Catch:{ d -> 0x0216, z2 -> 0x0040 }
            if (r8 == 0) goto L_0x01be
            byte[] r8 = r8.f257327a     // Catch:{ d -> 0x01bb, z2 -> 0x0040 }
            if (r8 == 0) goto L_0x01be
            int r8 = r8.length     // Catch:{ d -> 0x0216, z2 -> 0x0040 }
            r16 = r1
            java.lang.Integer r1 = new java.lang.Integer     // Catch:{ d -> 0x0213, z2 -> 0x0237 }
            r1.<init>(r8)     // Catch:{ d -> 0x0213, z2 -> 0x0237 }
            goto L_0x01c1
        L_0x01bb:
            r0 = move-exception
            goto L_0x004b
        L_0x01be:
            r16 = r1
            r1 = 0
        L_0x01c1:
            r8 = 1
            r7[r8] = r1     // Catch:{ d -> 0x0213, z2 -> 0x0237 }
            boolean r1 = r0.f139208g     // Catch:{ d -> 0x0213, z2 -> 0x0237 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ d -> 0x0213, z2 -> 0x0237 }
            r8 = 2
            r7[r8] = r1     // Catch:{ d -> 0x0213, z2 -> 0x0237 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r6, r7)     // Catch:{ d -> 0x0213, z2 -> 0x0237 }
            boolean r1 = r0.f139208g     // Catch:{ d -> 0x0213, z2 -> 0x0237 }
            if (r1 == 0) goto L_0x01f3
            r1 = 1
            r15.f132831f = r1     // Catch:{ d -> 0x0213, z2 -> 0x0237 }
            ld0.f r0 = r3.f56071g     // Catch:{ d -> 0x0213, z2 -> 0x0237 }
            r0.mo33552a(r14)     // Catch:{ d -> 0x0213, z2 -> 0x0237 }
            if (r9 != 0) goto L_0x0263
            java.lang.Object r0 = r4.get(r9)     // Catch:{ d -> 0x0213, z2 -> 0x0237 }
            te3.ea4 r0 = (te3.ea4) r0     // Catch:{ d -> 0x0213, z2 -> 0x0237 }
            if (r0 == 0) goto L_0x01e9
            java.lang.String r0 = r0.f132829d     // Catch:{ d -> 0x0213, z2 -> 0x0237 }
            goto L_0x01ea
        L_0x01e9:
            r0 = 0
        L_0x01ea:
            if (r0 != 0) goto L_0x01ee
            r0 = r23
        L_0x01ee:
            r3.mo26167b6(r9, r11, r0)     // Catch:{ d -> 0x0213, z2 -> 0x0237 }
            goto L_0x0263
        L_0x01f3:
            com.tencent.mm.vfs.m1 r1 = new com.tencent.mm.vfs.m1     // Catch:{ d -> 0x0213, z2 -> 0x0237 }
            r1.<init>((java.lang.String) r14)     // Catch:{ d -> 0x0213, z2 -> 0x0237 }
            com.tencent.mm.vfs.m1 r1 = r1.mo119974l()     // Catch:{ d -> 0x0213, z2 -> 0x0237 }
            if (r1 == 0) goto L_0x0201
            r1.mo119987x()     // Catch:{ d -> 0x0213, z2 -> 0x0237 }
        L_0x0201:
            pe3.b r0 = r0.f139205d     // Catch:{ d -> 0x0213, z2 -> 0x0237 }
            if (r0 == 0) goto L_0x0208
            byte[] r0 = r0.f257327a     // Catch:{ d -> 0x0213, z2 -> 0x0237 }
            goto L_0x0209
        L_0x0208:
            r0 = 0
        L_0x0209:
            com.tencent.p014mm.vfs.C86013q1.m106437S(r14, r0)     // Catch:{ d -> 0x0213, z2 -> 0x0237 }
            ld0.f r0 = r3.f56071g     // Catch:{ d -> 0x0213, z2 -> 0x0237 }
            r0.mo33552a(r14)     // Catch:{ d -> 0x0213, z2 -> 0x0237 }
            goto L_0x0263
        L_0x0213:
            r0 = move-exception
            goto L_0x004d
        L_0x0216:
            r0 = move-exception
            goto L_0x004b
        L_0x0219:
            r0 = move-exception
            goto L_0x0226
        L_0x021b:
            r4 = r15
            goto L_0x0221
        L_0x021d:
            r0 = move-exception
            r4 = r15
            goto L_0x0226
        L_0x0220:
            r4 = r15
        L_0x0221:
            r6 = r22
            goto L_0x022e
        L_0x0224:
            r0 = move-exception
            r4 = r15
        L_0x0226:
            r6 = r22
            goto L_0x0270
        L_0x0229:
            r4 = r15
            r6 = r22
            r2 = r24
        L_0x022e:
            r13 = r2
            r15 = r3
            r16 = r4
            r2 = r6
            r3 = r10
            r4 = r14
            r14 = r1
            r10 = r9
        L_0x0237:
            java.lang.String r0 = "get response timeout!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
            r1 = 1
            r15.f132831f = r1
            ld0.f r0 = r3.f56071g
            r0.mo33552a(r14)
            if (r9 == 0) goto L_0x0250
            android.speech.tts.TextToSpeech r0 = com.tencent.p014mm.p136ui.tools.C19843m.f56474a
            if (r0 == 0) goto L_0x0263
            boolean r0 = r0.isSpeaking()
            if (r0 != 0) goto L_0x0263
        L_0x0250:
            java.lang.Object r0 = r4.get(r9)
            te3.ea4 r0 = (te3.ea4) r0
            if (r0 == 0) goto L_0x025b
            java.lang.String r0 = r0.f132829d
            goto L_0x025c
        L_0x025b:
            r0 = 0
        L_0x025c:
            if (r0 != 0) goto L_0x0260
            r0 = r23
        L_0x0260:
            r3.mo26167b6(r9, r11, r0)
        L_0x0263:
            r14 = r4
            r9 = r10
            r15 = r16
            r1 = 1
            r7 = 0
            goto L_0x02c1
        L_0x026a:
            r0 = move-exception
            r4 = r15
            r6 = r22
            r2 = r24
        L_0x0270:
            r13 = r2
            r15 = r3
            r16 = r4
            r2 = r6
            r3 = r10
            r4 = r14
            r14 = r1
            r10 = r9
            goto L_0x004d
        L_0x027b:
            java.lang.Object[] r6 = new java.lang.Object[r1]
            int r7 = r0.f35057e
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r7)
            r7 = 0
            r6[r7] = r8
            int r0 = r0.f35058f
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r0)
            r1 = 1
            r6[r1] = r8
            java.lang.String r0 = "get response fail. errType:%d, errCode:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r0, r6)
            r15.f132831f = r1
            ld0.f r0 = r3.f56071g
            r0.mo33552a(r14)
            if (r9 == 0) goto L_0x02a9
            android.speech.tts.TextToSpeech r0 = com.tencent.p014mm.p136ui.tools.C19843m.f56474a
            if (r0 == 0) goto L_0x02bc
            boolean r0 = r0.isSpeaking()
            if (r0 != 0) goto L_0x02bc
        L_0x02a9:
            java.lang.Object r0 = r4.get(r9)
            te3.ea4 r0 = (te3.ea4) r0
            if (r0 == 0) goto L_0x02b4
            java.lang.String r0 = r0.f132829d
            goto L_0x02b5
        L_0x02b4:
            r0 = 0
        L_0x02b5:
            if (r0 != 0) goto L_0x02b9
            r0 = r23
        L_0x02b9:
            r3.mo26167b6(r9, r11, r0)
        L_0x02bc:
            r14 = r4
            r9 = r10
            r15 = r16
            r1 = 1
        L_0x02c1:
            r10 = r3
        L_0x02c2:
            int r9 = r9 + r1
            r1 = r26
            r4 = r23
            r8 = 1
            goto L_0x006b
        L_0x02ca:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.component.C44819d5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
