package cj1;

import a14.C0000n0;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fj1.C45795b;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.ResultKt;
import nj3.C76912y0;
import rl1.C13022d0;
import rx3.C13598b0;
import te3.C52204z21;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: cj1.s */
public final class C0590s {

    /* renamed from: a */
    public static final C0590s f1400a = new C0590s();

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.model.FinderLiveAppMsgManager$updateTemplateInfo$1$1$5", mo125469f = "FinderLiveAppMsgManager.kt", mo125470l = {161}, mo125471m = "invokeSuspend")
    /* renamed from: cj1.s$a */
    public static final class C0591a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f1401d;

        /* renamed from: e */
        public final /* synthetic */ C45795b f1402e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0591a(C45795b bVar, C15601d<? super C0591a> dVar) {
            super(2, dVar);
            this.f1402e = bVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C0591a(this.f1402e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C0591a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f1401d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f1401d = 1;
                if (((C13022d0) this.f1402e.mo71262a(C13022d0.class)).mo12540f3(false, this) == aVar) {
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

    /* renamed from: cj1.s$b */
    public static final class C0592b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C0592b f1403d = new C0592b();

        public C0592b() {
            super(0);
        }

        public Object invoke() {
            C76912y0.makeText(MMApplicationContext.getContext(), (CharSequence) "receive notify gift info now", 0).show();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: cj1.s$c */
    public static final class C0593c extends C87413o implements C32226l<C52204z21, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C52204z21 f1404d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0593c(C52204z21 z212) {
            super(1);
            this.f1404d = z212;
        }

        public Object invoke(Object obj) {
            C52204z21 z212 = (C52204z21) obj;
            C87412m.m108594g(z212, "item");
            return Boolean.valueOf(C87412m.m108589b(z212.f145640d, this.f1404d.f145640d));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0143, code lost:
        if (r6 != false) goto L_0x0145;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x015d, code lost:
        if (r6 == false) goto L_0x015f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x015f, code lost:
        r6 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0274  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x02b5  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x02b8  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x02cb  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x02d2  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x033a  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x033d  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x034c  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x034f  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x035c  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x03b6  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x03b9  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x03bc  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x03cb  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x03d2  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x03dd  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x03e4  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x03ef  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x03f6  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0405  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x040e  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0419  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x0420  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x042d  */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x054c  */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x0553  */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x0565  */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x0568  */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x056c  */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x05b1  */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x05d3  */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x0611  */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x0614  */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x061f  */
    /* JADX WARNING: Removed duplicated region for block: B:311:0x0626  */
    /* JADX WARNING: Removed duplicated region for block: B:314:0x0633  */
    /* JADX WARNING: Removed duplicated region for block: B:335:0x06c8  */
    /* JADX WARNING: Removed duplicated region for block: B:336:0x06cb  */
    /* JADX WARNING: Removed duplicated region for block: B:339:0x06d4  */
    /* JADX WARNING: Removed duplicated region for block: B:340:0x06d7  */
    /* JADX WARNING: Removed duplicated region for block: B:343:0x06e4  */
    /* JADX WARNING: Removed duplicated region for block: B:356:0x0730  */
    /* JADX WARNING: Removed duplicated region for block: B:357:0x0733  */
    /* JADX WARNING: Removed duplicated region for block: B:360:0x073c  */
    /* JADX WARNING: Removed duplicated region for block: B:361:0x0743  */
    /* JADX WARNING: Removed duplicated region for block: B:364:0x074c  */
    /* JADX WARNING: Removed duplicated region for block: B:365:0x0753  */
    /* JADX WARNING: Removed duplicated region for block: B:368:0x075c  */
    /* JADX WARNING: Removed duplicated region for block: B:369:0x0763  */
    /* JADX WARNING: Removed duplicated region for block: B:372:0x076c  */
    /* JADX WARNING: Removed duplicated region for block: B:373:0x0773  */
    /* JADX WARNING: Removed duplicated region for block: B:378:0x0780  */
    /* JADX WARNING: Removed duplicated region for block: B:379:0x0789  */
    /* JADX WARNING: Removed duplicated region for block: B:382:0x079b  */
    /* JADX WARNING: Removed duplicated region for block: B:405:0x0816  */
    /* JADX WARNING: Removed duplicated region for block: B:406:0x0838  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0204  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0221  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo602a(fj1.C45795b r32, java.util.LinkedList<te3.C52235z91> r33, boolean r34) {
        /*
            r31 = this;
            r1 = r32
            r2 = r34
            java.lang.Class<cl1.d0> r3 = cl1.C54963d0.class
            java.lang.Class<cl1.b0> r4 = cl1.C54946b0.class
            java.lang.Class<cl1.x0> r5 = cl1.C55006x0.class
            java.lang.Class<rl1.d0> r6 = rl1.C13022d0.class
            java.lang.Class<cl1.o> r7 = cl1.C54991o.class
            java.lang.String r0 = "roomData"
            gy3.C87412m.m108594g(r1, r0)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r9 = "updateTemplateInfo(fromJoinLive:"
            r0.append(r9)
            r0.append(r2)
            java.lang.String r9 = "):"
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            java.util.LinkedList r9 = new java.util.LinkedList
            r9.<init>()
            java.util.LinkedList r10 = new java.util.LinkedList
            r10.<init>()
            java.util.LinkedList r11 = new java.util.LinkedList
            r11.<init>()
            java.lang.String r12 = "FinderLiveAppMsgManager"
            if (r33 == 0) goto L_0x09ae
            java.util.Iterator r13 = r33.iterator()
            r0 = 0
        L_0x0048:
            boolean r15 = r13.hasNext()
            if (r15 == 0) goto L_0x09a7
            java.lang.Object r15 = r13.next()
            int r16 = r0 + 1
            if (r0 < 0) goto L_0x09a2
            te3.z91 r15 = (te3.C52235z91) r15
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r17 = r13
            r13 = 40
            r14.append(r13)
            r14.append(r0)
            java.lang.String r0 = ")[msgType:"
            r14.append(r0)
            int r0 = r15.f145771d
            r14.append(r0)
            java.lang.String r0 = ",payload is empty:"
            r14.append(r0)
            pe3.b r0 = r15.f145772e
            if (r0 != 0) goto L_0x007c
            r0 = 1
            goto L_0x007d
        L_0x007c:
            r0 = 0
        L_0x007d:
            r14.append(r0)
            java.lang.String r0 = ",versionWording:"
            r14.append(r0)
            java.lang.String r0 = r15.f145773f
            r14.append(r0)
            java.lang.String r0 = ",seq:"
            r14.append(r0)
            int r0 = r15.f145774g
            r14.append(r0)
            java.lang.String r0 = "}] "
            r14.append(r0)
            java.lang.String r0 = r14.toString()
            r8.append(r0)
            int r0 = r15.f145771d
            java.lang.String r14 = ", "
            java.lang.String r13 = "safeParser"
            r22 = r8
            java.lang.String r8 = ""
            switch(r0) {
                case 30001: goto L_0x0842;
                case 30002: goto L_0x07ec;
                case 30003: goto L_0x06fc;
                case 30004: goto L_0x0694;
                case 30005: goto L_0x00af;
                case 30006: goto L_0x05dd;
                case 30007: goto L_0x0587;
                case 30008: goto L_0x00af;
                case 30009: goto L_0x0519;
                case 30010: goto L_0x0383;
                case 30011: goto L_0x02fc;
                case 30012: goto L_0x0281;
                case 30013: goto L_0x022a;
                case 30014: goto L_0x01da;
                case 30015: goto L_0x00b9;
                default: goto L_0x00af;
            }
        L_0x00af:
            r19 = r3
            r20 = r4
            r13 = r6
            r4 = r9
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0992
        L_0x00b9:
            te3.q31 r0 = new te3.q31
            r0.<init>()
            pe3.b r14 = r15.f145772e
            if (r14 == 0) goto L_0x00c7
            byte[] r14 = r14.mo123703f()
            goto L_0x00c8
        L_0x00c7:
            r14 = 0
        L_0x00c8:
            if (r14 != 0) goto L_0x00cc
        L_0x00ca:
            r0 = 0
            goto L_0x00dc
        L_0x00cc:
            r0.parseFrom(r14)     // Catch:{ Exception -> 0x00d0 }
            goto L_0x00dc
        L_0x00d0:
            r0 = move-exception
            r14 = r0
            r15 = 1
            java.lang.Object[] r0 = new java.lang.Object[r15]
            r15 = 0
            r0[r15] = r14
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r13, r8, r0)
            goto L_0x00ca
        L_0x00dc:
            androidx.lifecycle.i0 r8 = r1.mo71262a(r5)
            cl1.x0 r8 = (cl1.C55006x0) r8
            d14.u0<te3.q31> r13 = r8.f154452g
            d14.j1 r13 = (d14.C58052j1) r13
            java.lang.Object r13 = r13.getValue()
            te3.q31 r13 = (te3.C64646q31) r13
            if (r13 == 0) goto L_0x0191
            if (r0 != 0) goto L_0x00f2
            goto L_0x0191
        L_0x00f2:
            java.util.LinkedList<te3.lx2> r14 = r13.f184942d
            java.lang.String r15 = "prev.infos"
            gy3.C87412m.m108593f(r14, r15)
            java.util.Iterator r14 = r14.iterator()
        L_0x00fd:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L_0x018c
            java.lang.Object r15 = r14.next()
            te3.lx2 r15 = (te3.C64538lx2) r15
            r19 = r14
            java.util.LinkedList<te3.lx2> r14 = r0.f184942d
            r23 = r9
            java.lang.String r9 = "current.infos"
            gy3.C87412m.m108593f(r14, r9)
            java.util.Iterator r9 = r14.iterator()
        L_0x0118:
            boolean r14 = r9.hasNext()
            if (r14 == 0) goto L_0x016a
            java.lang.Object r14 = r9.next()
            r20 = r9
            r9 = r14
            te3.lx2 r9 = (te3.C64538lx2) r9
            r21 = r14
            java.lang.String r14 = r9.f184170h
            r24 = r6
            java.lang.String r6 = r15.f184170h
            boolean r6 = gy3.C87412m.m108589b(r14, r6)
            if (r6 == 0) goto L_0x0145
            java.lang.String r6 = r15.f184170h
            if (r6 == 0) goto L_0x0142
            int r6 = r6.length()
            if (r6 != 0) goto L_0x0140
            goto L_0x0142
        L_0x0140:
            r6 = 0
            goto L_0x0143
        L_0x0142:
            r6 = 1
        L_0x0143:
            if (r6 == 0) goto L_0x015f
        L_0x0145:
            java.lang.String r6 = r9.f184172j
            java.lang.String r9 = r15.f184172j
            boolean r6 = gy3.C87412m.m108589b(r6, r9)
            if (r6 == 0) goto L_0x0161
            java.lang.String r6 = r15.f184172j
            if (r6 == 0) goto L_0x015c
            int r6 = r6.length()
            if (r6 != 0) goto L_0x015a
            goto L_0x015c
        L_0x015a:
            r6 = 0
            goto L_0x015d
        L_0x015c:
            r6 = 1
        L_0x015d:
            if (r6 != 0) goto L_0x0161
        L_0x015f:
            r6 = 1
            goto L_0x0162
        L_0x0161:
            r6 = 0
        L_0x0162:
            if (r6 == 0) goto L_0x0165
            goto L_0x016e
        L_0x0165:
            r9 = r20
            r6 = r24
            goto L_0x0118
        L_0x016a:
            r24 = r6
            r21 = 0
        L_0x016e:
            r6 = r21
            te3.lx2 r6 = (te3.C64538lx2) r6
            int r9 = r15.f184171i
            if (r9 <= 0) goto L_0x017b
            if (r6 != 0) goto L_0x0179
            goto L_0x017b
        L_0x0179:
            r6.f184171i = r9
        L_0x017b:
            int r9 = r15.f184173n
            if (r9 <= 0) goto L_0x0184
            if (r6 != 0) goto L_0x0182
            goto L_0x0184
        L_0x0182:
            r6.f184173n = r9
        L_0x0184:
            r14 = r19
            r9 = r23
            r6 = r24
            goto L_0x00fd
        L_0x018c:
            r24 = r6
            r23 = r9
            goto L_0x01bd
        L_0x0191:
            r24 = r6
            r23 = r9
            java.lang.String r6 = r8.f154451f
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r14 = "diffMetaInfo prev is null:"
            r9.append(r14)
            if (r13 != 0) goto L_0x01a5
            r14 = 1
            goto L_0x01a6
        L_0x01a5:
            r14 = 0
        L_0x01a6:
            r9.append(r14)
            java.lang.String r14 = ", current is null:"
            r9.append(r14)
            if (r0 != 0) goto L_0x01b2
            r14 = 1
            goto L_0x01b3
        L_0x01b2:
            r14 = 0
        L_0x01b3:
            r9.append(r14)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r9)
        L_0x01bd:
            if (r13 == 0) goto L_0x01c6
            java.lang.String r6 = r8.f154451f
            java.lang.String r9 = "refreshMetaInfo prev,"
            r8.mo76055g3(r13, r6, r9)
        L_0x01c6:
            if (r0 == 0) goto L_0x01cf
            java.lang.String r6 = r8.f154451f
            java.lang.String r9 = "refreshMetaInfo cur,"
            r8.mo76055g3(r0, r6, r9)
        L_0x01cf:
            d14.u0<te3.q31> r6 = r8.f154452g
            d14.j1 r6 = (d14.C58052j1) r6
            r6.setValue(r0)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0379
        L_0x01da:
            r24 = r6
            r23 = r9
            te3.p31 r0 = new te3.p31
            r0.<init>()
            pe3.b r6 = r15.f145772e
            if (r6 == 0) goto L_0x01ec
            byte[] r6 = r6.mo123703f()
            goto L_0x01ed
        L_0x01ec:
            r6 = 0
        L_0x01ed:
            if (r6 != 0) goto L_0x01f1
        L_0x01ef:
            r14 = 0
            goto L_0x0202
        L_0x01f1:
            r0.parseFrom(r6)     // Catch:{ Exception -> 0x01f6 }
            r14 = r0
            goto L_0x0202
        L_0x01f6:
            r0 = move-exception
            r6 = r0
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r9 = 0
            r0[r9] = r6
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r13, r8, r0)
            goto L_0x01ef
        L_0x0202:
            if (r14 == 0) goto L_0x0221
            androidx.lifecycle.i0 r0 = r1.mo71262a(r5)
            cl1.x0 r0 = (cl1.C55006x0) r0
            java.lang.String r6 = "getlivemsg"
            r0.mo76051c3(r14, r6)
            if (r2 == 0) goto L_0x0219
            d14.u0<te3.p31> r0 = r0.f154456n
            d14.j1 r0 = (d14.C58052j1) r0
            r0.setValue(r14)
            goto L_0x0226
        L_0x0219:
            d14.u0<te3.p31> r0 = r0.f154454i
            d14.j1 r0 = (d14.C58052j1) r0
            r0.setValue(r14)
            goto L_0x0226
        L_0x0221:
            java.lang.String r0 = "lotteryInfo null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)
        L_0x0226:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0379
        L_0x022a:
            r24 = r6
            r23 = r9
            te3.b61 r0 = new te3.b61
            r0.<init>()
            pe3.b r6 = r15.f145772e
            if (r6 == 0) goto L_0x023c
            byte[] r6 = r6.mo123703f()
            goto L_0x023d
        L_0x023c:
            r6 = 0
        L_0x023d:
            if (r6 != 0) goto L_0x0241
        L_0x023f:
            r14 = 0
            goto L_0x0252
        L_0x0241:
            r0.parseFrom(r6)     // Catch:{ Exception -> 0x0246 }
            r14 = r0
            goto L_0x0252
        L_0x0246:
            r0 = move-exception
            r6 = r0
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r9 = 0
            r0[r9] = r6
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r13, r8, r0)
            goto L_0x023f
        L_0x0252:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "update visitorPromotion:"
            r0.append(r6)
            r0.append(r14)
            r6 = 125(0x7d, float:1.75E-43)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)
            ok1.e r0 = ok1.C62042e.f176370a
            boolean r0 = r0.mo87027N0()
            if (r0 != 0) goto L_0x027d
            androidx.lifecycle.i0 r0 = r1.mo71262a(r7)
            cl1.o r0 = (cl1.C54991o) r0
            r0.mo75959F4(r14)
        L_0x027d:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0379
        L_0x0281:
            r24 = r6
            r23 = r9
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r0 = new com.tencent.mm.protocal.protobuf.FinderJumpInfo
            r0.<init>()
            pe3.b r6 = r15.f145772e
            if (r6 == 0) goto L_0x0293
            byte[] r6 = r6.mo123703f()
            goto L_0x0294
        L_0x0293:
            r6 = 0
        L_0x0294:
            if (r6 != 0) goto L_0x0298
        L_0x0296:
            r0 = 0
            goto L_0x02a8
        L_0x0298:
            r0.parseFrom(r6)     // Catch:{ Exception -> 0x029c }
            goto L_0x02a8
        L_0x029c:
            r0 = move-exception
            r6 = r0
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r9 = 0
            r0[r9] = r6
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r13, r8, r0)
            goto L_0x0296
        L_0x02a8:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "update banner notify, wording: "
            r6.append(r8)
            if (r0 == 0) goto L_0x02b8
            java.lang.String r14 = r0.wording
            goto L_0x02b9
        L_0x02b8:
            r14 = 0
        L_0x02b9:
            r6.append(r14)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r6)
            er1.j4 r6 = er1.C58739j4.f168176a
            boolean r6 = r6.mo83692U()
            if (r6 == 0) goto L_0x02d0
            cj1.s$b r6 = cj1.C0590s.C0592b.f1403d
            o40.C61926c.m72668M(r6)
        L_0x02d0:
            if (r0 == 0) goto L_0x02f8
            gg1.a r6 = gg1.C32444a.f86121a
            pe1.c<java.lang.Integer> r6 = gg1.C32444a.f86067I2
            java.lang.Object r6 = r6.mo60266n()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            if (r6 != 0) goto L_0x02f0
            java.lang.Class<cl1.a0> r6 = cl1.C0653a0.class
            androidx.lifecycle.i0 r6 = r1.mo71262a(r6)
            cl1.a0 r6 = (cl1.C0653a0) r6
            com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData<com.tencent.mm.protocal.protobuf.FinderJumpInfo> r6 = r6.f1542f
            r6.postValue(r0)
            goto L_0x02f8
        L_0x02f0:
            androidx.lifecycle.i0 r6 = r1.mo71262a(r7)
            cl1.o r6 = (cl1.C54991o) r6
            r6.f154215J1 = r0
        L_0x02f8:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0379
        L_0x02fc:
            r24 = r6
            r23 = r9
            androidx.lifecycle.i0 r0 = r1.mo71262a(r7)
            cl1.o r0 = (cl1.C54991o) r0
            boolean r0 = r0.f154223L1
            if (r0 == 0) goto L_0x0377
            te3.cw0 r0 = new te3.cw0
            r0.<init>()
            pe3.b r6 = r15.f145772e
            if (r6 == 0) goto L_0x0318
            byte[] r6 = r6.mo123703f()
            goto L_0x0319
        L_0x0318:
            r6 = 0
        L_0x0319:
            if (r6 != 0) goto L_0x031d
        L_0x031b:
            r0 = 0
            goto L_0x032d
        L_0x031d:
            r0.parseFrom(r6)     // Catch:{ Exception -> 0x0321 }
            goto L_0x032d
        L_0x0321:
            r0 = move-exception
            r6 = r0
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r9 = 0
            r0[r9] = r6
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r13, r8, r0)
            goto L_0x031b
        L_0x032d:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "update subTitle, id: "
            r6.append(r8)
            if (r0 == 0) goto L_0x033d
            java.lang.String r8 = r0.f131991d
            goto L_0x033e
        L_0x033d:
            r8 = 0
        L_0x033e:
            r6.append(r8)
            java.lang.String r8 = ", title: "
            r6.append(r8)
            if (r0 == 0) goto L_0x034f
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r8 = r0.f131993f
            if (r8 == 0) goto L_0x034f
            java.lang.String r14 = r8.wording
            goto L_0x0350
        L_0x034f:
            r14 = 0
        L_0x0350:
            r6.append(r14)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r6)
            if (r0 == 0) goto L_0x0377
            java.util.LinkedList<te3.v9> r6 = r0.f131992e
            if (r6 == 0) goto L_0x0365
            int r6 = r6.size()
            goto L_0x0366
        L_0x0365:
            r6 = 0
        L_0x0366:
            if (r6 > 0) goto L_0x036c
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r6 = r0.f131993f
            if (r6 == 0) goto L_0x0377
        L_0x036c:
            androidx.lifecycle.i0 r6 = r1.mo71262a(r7)
            cl1.o r6 = (cl1.C54991o) r6
            java.util.concurrent.ConcurrentLinkedQueue<te3.cw0> r6 = r6.f154219K1
            r6.add(r0)
        L_0x0377:
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0379:
            r19 = r3
            r20 = r4
            r4 = r23
            r13 = r24
            goto L_0x0992
        L_0x0383:
            r24 = r6
            r23 = r9
            te3.sa1 r0 = new te3.sa1
            r0.<init>()
            pe3.b r6 = r15.f145772e
            if (r6 == 0) goto L_0x0395
            byte[] r6 = r6.mo123703f()
            goto L_0x0396
        L_0x0395:
            r6 = 0
        L_0x0396:
            if (r6 != 0) goto L_0x039a
        L_0x0398:
            r0 = 0
            goto L_0x03aa
        L_0x039a:
            r0.parseFrom(r6)     // Catch:{ Exception -> 0x039e }
            goto L_0x03aa
        L_0x039e:
            r0 = move-exception
            r6 = r0
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r9 = 0
            r0[r9] = r6
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r13, r8, r0)
            goto L_0x0398
        L_0x03aa:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "from msg votingId: "
            r6.append(r8)
            if (r0 == 0) goto L_0x03b9
            java.lang.String r8 = r0.f141393i
            goto L_0x03ba
        L_0x03b9:
            r8 = 0
        L_0x03ba:
            if (r8 != 0) goto L_0x03c1
            r8 = -1
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
        L_0x03c1:
            r6.append(r8)
            java.lang.String r8 = " , status: "
            r6.append(r8)
            if (r0 == 0) goto L_0x03d2
            int r8 = r0.f141392h
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            goto L_0x03d3
        L_0x03d2:
            r8 = 0
        L_0x03d3:
            r6.append(r8)
            java.lang.String r8 = ", show_remain_time: "
            r6.append(r8)
            if (r0 == 0) goto L_0x03e4
            int r8 = r0.f141397p
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            goto L_0x03e5
        L_0x03e4:
            r8 = 0
        L_0x03e5:
            r6.append(r8)
            java.lang.String r8 = ", remain_time: "
            r6.append(r8)
            if (r0 == 0) goto L_0x03f6
            int r8 = r0.f141391g
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            goto L_0x03f7
        L_0x03f6:
            r8 = 0
        L_0x03f7:
            r6.append(r8)
            java.lang.String r8 = ", qSize: "
            r6.append(r8)
            if (r0 == 0) goto L_0x040e
            java.util.LinkedList<te3.yv> r8 = r0.f141390f
            if (r8 == 0) goto L_0x040e
            int r8 = r8.size()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            goto L_0x040f
        L_0x040e:
            r8 = 0
        L_0x040f:
            r6.append(r8)
            java.lang.String r8 = ", disableResult: "
            r6.append(r8)
            if (r0 == 0) goto L_0x0420
            int r8 = r0.f141399r
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            goto L_0x0421
        L_0x0420:
            r8 = 0
        L_0x0421:
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r6)
            if (r0 == 0) goto L_0x0379
            androidx.lifecycle.i0 r6 = r1.mo71262a(r7)
            cl1.o r6 = (cl1.C54991o) r6
            r8 = 1
            r6.f154285Y3 = r8
            androidx.lifecycle.i0 r6 = r1.mo71262a(r7)
            cl1.o r6 = (cl1.C54991o) r6
            r6.f154280X3 = r8
            androidx.lifecycle.i0 r6 = r1.mo71262a(r7)
            cl1.o r6 = (cl1.C54991o) r6
            te3.sa1 r6 = r6.f154275W3
            if (r6 != 0) goto L_0x0452
            androidx.lifecycle.i0 r6 = r1.mo71262a(r7)
            cl1.o r6 = (cl1.C54991o) r6
            r6.f154275W3 = r0
            goto L_0x0515
        L_0x0452:
            androidx.lifecycle.i0 r6 = r1.mo71262a(r7)
            cl1.o r6 = (cl1.C54991o) r6
            te3.sa1 r6 = r6.f154275W3
            if (r6 == 0) goto L_0x045f
            java.lang.String r6 = r6.f141393i
            goto L_0x0460
        L_0x045f:
            r6 = 0
        L_0x0460:
            java.lang.String r8 = r0.f141393i
            boolean r6 = gy3.C87412m.m108589b(r6, r8)
            if (r6 != 0) goto L_0x0472
            androidx.lifecycle.i0 r6 = r1.mo71262a(r7)
            cl1.o r6 = (cl1.C54991o) r6
            r6.f154275W3 = r0
            goto L_0x0515
        L_0x0472:
            androidx.lifecycle.i0 r6 = r1.mo71262a(r7)
            cl1.o r6 = (cl1.C54991o) r6
            te3.sa1 r6 = r6.f154275W3
            if (r6 == 0) goto L_0x047f
            long r13 = r6.f141396o
            goto L_0x0481
        L_0x047f:
            r13 = -1
        L_0x0481:
            long r8 = r0.f141396o
            int r6 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r6 > 0) goto L_0x0500
            androidx.lifecycle.i0 r6 = r1.mo71262a(r7)
            cl1.o r6 = (cl1.C54991o) r6
            te3.sa1 r6 = r6.f154275W3
            if (r6 == 0) goto L_0x04d8
            java.util.LinkedList<te3.yv> r6 = r6.f141390f
            if (r6 == 0) goto L_0x04d8
            java.util.Iterator r6 = r6.iterator()
            r8 = 0
            r18 = 1
        L_0x049c:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L_0x04d3
            java.lang.Object r9 = r6.next()
            int r13 = r8 + 1
            if (r8 < 0) goto L_0x04ce
            te3.yv r9 = (te3.C52172yv) r9
            java.util.LinkedList<te3.yv> r14 = r0.f141390f
            java.lang.String r15 = "it.choice_list"
            gy3.C87412m.m108593f(r14, r15)
            java.lang.Object r8 = sx3.C110818d0.m150917O(r14, r8)
            te3.yv r8 = (te3.C52172yv) r8
            if (r8 == 0) goto L_0x04ca
            int r14 = r8.f145529f
            int r15 = r9.f145529f
            if (r14 != r15) goto L_0x04ca
            int r8 = r8.f145527d
            int r9 = r9.f145527d
            if (r8 == r9) goto L_0x04c8
            goto L_0x04ca
        L_0x04c8:
            r8 = r13
            goto L_0x049c
        L_0x04ca:
            r8 = r13
            r18 = 0
            goto L_0x049c
        L_0x04ce:
            sx3.C64197v.m75542k()
            r1 = 0
            throw r1
        L_0x04d3:
            rx3.b0 r6 = rx3.C13598b0.f38549a
            r13 = r18
            goto L_0x04d9
        L_0x04d8:
            r13 = 1
        L_0x04d9:
            if (r13 == 0) goto L_0x04ea
            java.lang.String r6 = "update votingInfo can believe"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r6)
            androidx.lifecycle.i0 r6 = r1.mo71262a(r7)
            cl1.o r6 = (cl1.C54991o) r6
            r6.f154275W3 = r0
            goto L_0x0515
        L_0x04ea:
            java.lang.String r6 = "update votingInfo cant believe"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r6)
            androidx.lifecycle.i0 r6 = r1.mo71262a(r7)
            cl1.o r6 = (cl1.C54991o) r6
            te3.sa1 r6 = r6.f154275W3
            if (r6 != 0) goto L_0x04fb
            goto L_0x0515
        L_0x04fb:
            int r0 = r0.f141391g
            r6.f141391g = r0
            goto L_0x0515
        L_0x0500:
            java.lang.String r6 = "update votingInfo time"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r6)
            androidx.lifecycle.i0 r6 = r1.mo71262a(r7)
            cl1.o r6 = (cl1.C54991o) r6
            te3.sa1 r6 = r6.f154275W3
            if (r6 != 0) goto L_0x0511
            goto L_0x0515
        L_0x0511:
            int r0 = r0.f141391g
            r6.f141391g = r0
        L_0x0515:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0379
        L_0x0519:
            r24 = r6
            r23 = r9
            te3.b31 r0 = new te3.b31
            r0.<init>()
            pe3.b r6 = r15.f145772e
            if (r6 == 0) goto L_0x052b
            byte[] r6 = r6.mo123703f()
            goto L_0x052c
        L_0x052b:
            r6 = 0
        L_0x052c:
            if (r6 != 0) goto L_0x0530
        L_0x052e:
            r0 = 0
            goto L_0x0540
        L_0x0530:
            r0.parseFrom(r6)     // Catch:{ Exception -> 0x0534 }
            goto L_0x0540
        L_0x0534:
            r0 = move-exception
            r6 = r0
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r9 = 0
            r0[r9] = r6
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r13, r8, r0)
            goto L_0x052e
        L_0x0540:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "lottery panel need update:"
            r6.append(r8)
            if (r0 == 0) goto L_0x0553
            int r8 = r0.f130922d
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            goto L_0x0554
        L_0x0553:
            r8 = 0
        L_0x0554:
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r6)
            if (r0 == 0) goto L_0x0568
            int r0 = r0.f130922d
            r6 = 1
            if (r0 != r6) goto L_0x0568
            r18 = 1
            goto L_0x056a
        L_0x0568:
            r18 = 0
        L_0x056a:
            if (r18 == 0) goto L_0x0583
            com.tencent.mm.plugin.finder.live.infrastructure.coroutine.a r0 = r1.f123702i
            a14.h0 r26 = a14.C53872d1.f151119c
            r27 = 0
            cj1.s$a r6 = new cj1.s$a
            r8 = 0
            r6.<init>(r1, r8)
            r29 = 2
            r30 = 0
            r25 = r0
            r28 = r6
            a14.C53895h.m60466d(r25, r26, r27, r28, r29, r30)
        L_0x0583:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0379
        L_0x0587:
            r24 = r6
            r23 = r9
            te3.v81 r0 = new te3.v81
            r0.<init>()
            pe3.b r6 = r15.f145772e
            if (r6 == 0) goto L_0x0599
            byte[] r6 = r6.mo123703f()
            goto L_0x059a
        L_0x0599:
            r6 = 0
        L_0x059a:
            if (r6 != 0) goto L_0x059e
        L_0x059c:
            r14 = 0
            goto L_0x05af
        L_0x059e:
            r0.parseFrom(r6)     // Catch:{ Exception -> 0x05a3 }
            r14 = r0
            goto L_0x05af
        L_0x05a3:
            r0 = move-exception
            r6 = r0
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r9 = 0
            r0[r9] = r6
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r13, r8, r0)
            goto L_0x059c
        L_0x05af:
            if (r14 == 0) goto L_0x05d3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "updateTemplateInfo fastCommentInfo:"
            r0.append(r6)
            org.json.JSONObject r6 = o40.C61937h.m72709h(r14)
            r0.append(r6)
            r6 = 33
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)
            r11.add(r14)
            goto L_0x05d9
        L_0x05d3:
            java.lang.String r0 = "updateTemplateInfo fastCommentInfo is null!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)
        L_0x05d9:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0379
        L_0x05dd:
            r24 = r6
            r23 = r9
            te3.u11 r0 = new te3.u11
            r0.<init>()
            pe3.b r6 = r15.f145772e
            if (r6 == 0) goto L_0x05ef
            byte[] r6 = r6.mo123703f()
            goto L_0x05f0
        L_0x05ef:
            r6 = 0
        L_0x05f0:
            if (r6 != 0) goto L_0x05f4
        L_0x05f2:
            r0 = 0
            goto L_0x0604
        L_0x05f4:
            r0.parseFrom(r6)     // Catch:{ Exception -> 0x05f8 }
            goto L_0x0604
        L_0x05f8:
            r0 = move-exception
            r6 = r0
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r9 = 0
            r0[r9] = r6
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r13, r8, r0)
            goto L_0x05f2
        L_0x0604:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r9 = "updateTemplateInfo giftInfo: package_id="
            r6.append(r9)
            if (r0 == 0) goto L_0x0614
            java.lang.String r9 = r0.f142543d
            goto L_0x0615
        L_0x0614:
            r9 = 0
        L_0x0615:
            r6.append(r9)
            java.lang.String r9 = ", remain_time="
            r6.append(r9)
            if (r0 == 0) goto L_0x0626
            int r9 = r0.f142544e
            java.lang.Integer r14 = java.lang.Integer.valueOf(r9)
            goto L_0x0627
        L_0x0626:
            r14 = 0
        L_0x0627:
            r6.append(r14)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r6)
            if (r0 == 0) goto L_0x0379
            java.lang.Class<cl1.a> r6 = cl1.C0651a.class
            androidx.lifecycle.i0 r6 = r1.mo71262a(r6)
            cl1.a r6 = (cl1.C0651a) r6
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r13 = "#updateAllowanceInfo package_id="
            r9.append(r13)
            java.lang.String r13 = r0.f142543d
            r9.append(r13)
            java.lang.String r13 = " remain_time="
            r9.append(r13)
            int r13 = r0.f142544e
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r9.append(r13)
            java.lang.String r9 = r9.toString()
            java.lang.String r13 = "AllowanceGiftSlice"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r9)
            java.lang.String r9 = r6.f1538f
            java.lang.String r13 = r0.f142543d
            boolean r9 = gy3.C87412m.m108589b(r9, r13)
            if (r9 == 0) goto L_0x066c
            goto L_0x0688
        L_0x066c:
            java.lang.String r9 = r0.f142543d
            if (r9 != 0) goto L_0x0671
            r9 = r8
        L_0x0671:
            r6.f1539g = r9
            int r0 = r0.f142544e
            int r0 = r0 * 1000
            long r13 = (long) r0
            long r25 = java.lang.System.currentTimeMillis()
            long r13 = r13 + r25
            java.lang.Long r0 = java.lang.Long.valueOf(r13)
            long r13 = r0.longValue()
            r6.f1540h = r13
        L_0x0688:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            if (r0 != 0) goto L_0x0379
            r6.f1539g = r8
            r8 = -1
            r6.f1540h = r8
            goto L_0x0379
        L_0x0694:
            r24 = r6
            r23 = r9
            te3.tr0 r0 = new te3.tr0
            r0.<init>()
            pe3.b r6 = r15.f145772e
            if (r6 == 0) goto L_0x06a6
            byte[] r6 = r6.mo123703f()
            goto L_0x06a7
        L_0x06a6:
            r6 = 0
        L_0x06a7:
            if (r6 != 0) goto L_0x06ab
        L_0x06a9:
            r0 = 0
            goto L_0x06bb
        L_0x06ab:
            r0.parseFrom(r6)     // Catch:{ Exception -> 0x06af }
            goto L_0x06bb
        L_0x06af:
            r0 = move-exception
            r6 = r0
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r9 = 0
            r0[r9] = r6
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r13, r8, r0)
            goto L_0x06a9
        L_0x06bb:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "updateTemplateInfo pageInfo: "
            r6.append(r8)
            if (r0 == 0) goto L_0x06cb
            java.lang.String r8 = r0.f142364d
            goto L_0x06cc
        L_0x06cb:
            r8 = 0
        L_0x06cc:
            r6.append(r8)
            r6.append(r14)
            if (r0 == 0) goto L_0x06d7
            java.lang.String r14 = r0.f142365e
            goto L_0x06d8
        L_0x06d7:
            r14 = 0
        L_0x06d8:
            r6.append(r14)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r6)
            if (r0 == 0) goto L_0x0379
            androidx.lifecycle.i0 r6 = r1.mo71262a(r4)
            cl1.b0 r6 = (cl1.C54946b0) r6
            java.lang.String r8 = r0.f142364d
            r6.f153985i = r8
            androidx.lifecycle.i0 r6 = r1.mo71262a(r4)
            cl1.b0 r6 = (cl1.C54946b0) r6
            java.lang.String r0 = r0.f142365e
            r6.f153986j = r0
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0379
        L_0x06fc:
            r24 = r6
            r23 = r9
            te3.iw0 r0 = new te3.iw0
            r0.<init>()
            pe3.b r6 = r15.f145772e
            if (r6 == 0) goto L_0x070e
            byte[] r6 = r6.mo123703f()
            goto L_0x070f
        L_0x070e:
            r6 = 0
        L_0x070f:
            if (r6 != 0) goto L_0x0713
        L_0x0711:
            r0 = 0
            goto L_0x0723
        L_0x0713:
            r0.parseFrom(r6)     // Catch:{ Exception -> 0x0717 }
            goto L_0x0723
        L_0x0717:
            r0 = move-exception
            r6 = r0
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r9 = 0
            r0[r9] = r6
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r13, r8, r0)
            goto L_0x0711
        L_0x0723:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "updateTemplateInfo battleInfo:["
            r6.append(r8)
            if (r0 == 0) goto L_0x0733
            java.lang.String r8 = r0.f135698d
            goto L_0x0734
        L_0x0733:
            r8 = 0
        L_0x0734:
            r6.append(r8)
            r6.append(r14)
            if (r0 == 0) goto L_0x0743
            long r8 = r0.f135699e
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            goto L_0x0744
        L_0x0743:
            r8 = 0
        L_0x0744:
            r6.append(r8)
            r6.append(r14)
            if (r0 == 0) goto L_0x0753
            int r8 = r0.f135700f
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            goto L_0x0754
        L_0x0753:
            r8 = 0
        L_0x0754:
            r6.append(r8)
            r6.append(r14)
            if (r0 == 0) goto L_0x0763
            int r8 = r0.f135701g
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            goto L_0x0764
        L_0x0763:
            r8 = 0
        L_0x0764:
            r6.append(r8)
            r6.append(r14)
            if (r0 == 0) goto L_0x0773
            int r8 = r0.f135703i
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            goto L_0x0774
        L_0x0773:
            r8 = 0
        L_0x0774:
            r6.append(r8)
            r6.append(r14)
            if (r0 == 0) goto L_0x0789
            java.util.LinkedList<te3.ae3> r8 = r0.f135702h
            if (r8 == 0) goto L_0x0789
            int r8 = r8.size()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r8)
            goto L_0x078a
        L_0x0789:
            r14 = 0
        L_0x078a:
            r6.append(r14)
            r8 = 93
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r6)
            if (r0 == 0) goto L_0x0379
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "updateTemplateInfo curBattleInfo:"
            r6.append(r8)
            androidx.lifecycle.i0 r8 = r1.mo71262a(r3)
            cl1.d0 r8 = (cl1.C54963d0) r8
            cj1.a1 r8 = r8.f154051E
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r6)
            androidx.lifecycle.i0 r6 = r1.mo71262a(r3)
            cl1.d0 r6 = (cl1.C54963d0) r6
            cj1.a1 r6 = r6.f154051E
            if (r6 == 0) goto L_0x0379
            int r8 = r6.f153392e
            r9 = 3
            if (r8 == r9) goto L_0x07e8
            java.lang.String r8 = r6.f153388a
            java.lang.String r13 = r0.f135698d
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r8, (java.lang.String) r13)
            if (r8 == 0) goto L_0x07e8
            int r8 = r6.f153390c
            int r13 = r0.f135701g
            int r8 = r8 - r13
            if (r8 < r9) goto L_0x07da
            r6.f153390c = r13
        L_0x07da:
            int r8 = r0.f135703i
            r6.f153391d = r8
            java.util.LinkedList<te3.ae3> r0 = r0.f135702h
            java.lang.String r8 = "battleInfo.player_info"
            gy3.C87412m.m108593f(r0, r8)
            r6.mo75625d(r0)
        L_0x07e8:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0379
        L_0x07ec:
            r24 = r6
            r23 = r9
            te3.w61 r0 = new te3.w61
            r0.<init>()
            pe3.b r6 = r15.f145772e
            if (r6 == 0) goto L_0x07fe
            byte[] r6 = r6.mo123703f()
            goto L_0x07ff
        L_0x07fe:
            r6 = 0
        L_0x07ff:
            if (r6 != 0) goto L_0x0803
        L_0x0801:
            r14 = 0
            goto L_0x0814
        L_0x0803:
            r0.parseFrom(r6)     // Catch:{ Exception -> 0x0808 }
            r14 = r0
            goto L_0x0814
        L_0x0808:
            r0 = move-exception
            r6 = r0
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r9 = 0
            r0[r9] = r6
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r13, r8, r0)
            goto L_0x0801
        L_0x0814:
            if (r14 == 0) goto L_0x0838
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "updateTemplateInfo redPackInfo:"
            r0.append(r6)
            org.json.JSONObject r6 = o40.C61937h.m72709h(r14)
            r0.append(r6)
            r6 = 33
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)
            r10.add(r14)
            goto L_0x083e
        L_0x0838:
            java.lang.String r0 = "updateTemplateInfo redPackInfo is null!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)
        L_0x083e:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0379
        L_0x0842:
            r24 = r6
            r23 = r9
            te3.z21 r0 = new te3.z21
            r0.<init>()
            pe3.b r6 = r15.f145772e
            if (r6 == 0) goto L_0x0854
            byte[] r6 = r6.mo123703f()
            goto L_0x0855
        L_0x0854:
            r6 = 0
        L_0x0855:
            if (r6 != 0) goto L_0x085b
            r0 = 0
        L_0x0858:
            r9 = 0
            r15 = 1
            goto L_0x086b
        L_0x085b:
            r0.parseFrom(r6)     // Catch:{ Exception -> 0x085f }
            goto L_0x0858
        L_0x085f:
            r0 = move-exception
            r6 = r0
            r15 = 1
            java.lang.Object[] r0 = new java.lang.Object[r15]
            r9 = 0
            r0[r9] = r6
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r13, r8, r0)
            r0 = 0
        L_0x086b:
            if (r0 == 0) goto L_0x0870
            java.lang.String r6 = r0.f145640d
            goto L_0x0871
        L_0x0870:
            r6 = 0
        L_0x0871:
            if (r6 == 0) goto L_0x095e
            r13 = r24
            androidx.lifecycle.i0 r14 = r1.mo71262a(r13)
            rl1.d0 r14 = (rl1.C13022d0) r14
            java.util.concurrent.ConcurrentLinkedDeque<rx3.l<java.lang.Long, java.lang.String>> r9 = r14.f37099o
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L_0x0889
            java.util.concurrent.ConcurrentLinkedDeque r9 = r14.mo12539e3()
            r14.f37099o = r9
        L_0x0889:
            java.util.concurrent.ConcurrentLinkedDeque<rx3.l<java.lang.Long, java.lang.String>> r9 = r14.f37099o
            java.util.Iterator r9 = r9.iterator()
            java.lang.String r15 = "localSaveLotteryIdList.iterator()"
            gy3.C87412m.m108593f(r9, r15)
        L_0x0894:
            boolean r15 = r9.hasNext()
            if (r15 == 0) goto L_0x08d3
            java.lang.Object r15 = r9.next()
            rx3.l r15 = (rx3.C13604l) r15
            r19 = r3
            java.lang.Class<cl1.u> r3 = cl1.C55001u.class
            androidx.lifecycle.i0 r3 = r14.business(r3)
            cl1.u r3 = (cl1.C55001u) r3
            te3.c21 r3 = r3.f154420q
            r20 = r4
            if (r3 == 0) goto L_0x08c0
            A r4 = r15.f38555d
            java.lang.Number r4 = (java.lang.Number) r4
            long r24 = r4.longValue()
            long r3 = r3.f182392d
            int r26 = (r24 > r3 ? 1 : (r24 == r3 ? 0 : -1))
            if (r26 != 0) goto L_0x08c0
            r3 = 1
            goto L_0x08c1
        L_0x08c0:
            r3 = 0
        L_0x08c1:
            if (r3 == 0) goto L_0x08ce
            B r3 = r15.f38556e
            boolean r3 = gy3.C87412m.m108589b(r3, r6)
            if (r3 == 0) goto L_0x08ce
            r18 = 1
            goto L_0x08d9
        L_0x08ce:
            r3 = r19
            r4 = r20
            goto L_0x0894
        L_0x08d3:
            r19 = r3
            r20 = r4
            r18 = 0
        L_0x08d9:
            if (r18 != 0) goto L_0x095b
            androidx.lifecycle.i0 r3 = r1.mo71262a(r13)
            rl1.d0 r3 = (rl1.C13022d0) r3
            al1.q r3 = r3.f37098n
            if (r3 == 0) goto L_0x08ec
            te3.z21 r3 = r3.f509d
            if (r3 == 0) goto L_0x08ec
            int r3 = r3.f145643g
            goto L_0x08ef
        L_0x08ec:
            r3 = 2147483647(0x7fffffff, float:NaN)
        L_0x08ef:
            androidx.lifecycle.i0 r4 = r1.mo71262a(r13)
            rl1.d0 r4 = (rl1.C13022d0) r4
            al1.q r4 = r4.f37098n
            if (r4 == 0) goto L_0x0900
            te3.z21 r4 = r4.f509d
            if (r4 == 0) goto L_0x0900
            java.lang.String r14 = r4.f145640d
            goto L_0x0901
        L_0x0900:
            r14 = 0
        L_0x0901:
            java.lang.String r4 = r0.f145640d
            boolean r4 = gy3.C87412m.m108589b(r4, r14)
            if (r4 == 0) goto L_0x092e
            int r4 = r0.f145643g
            if (r4 <= r3) goto L_0x092e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "updateTemplateInfo drop the old time lottteryInfo:"
            r3.append(r4)
            org.json.JSONObject r0 = o40.C61937h.m72709h(r0)
            r3.append(r0)
            r4 = 33
            r3.append(r4)
            java.lang.String r0 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)
            r4 = r23
            goto L_0x0990
        L_0x092e:
            cj1.s$c r3 = new cj1.s$c
            r3.<init>(r0)
            r4 = r23
            boolean r3 = o40.C61926c.m72675T(r4, r3)
            if (r3 == 0) goto L_0x0957
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "updateTemplateInfo remove the last same item id:"
            r3.append(r6)
            java.lang.String r6 = r0.f145640d
            r3.append(r6)
            r6 = 33
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r3)
        L_0x0957:
            r4.add(r0)
            goto L_0x0990
        L_0x095b:
            r4 = r23
            goto L_0x0966
        L_0x095e:
            r19 = r3
            r20 = r4
            r4 = r23
            r13 = r24
        L_0x0966:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r9 = "updateTemplateInfo "
            r3.append(r9)
            if (r0 != 0) goto L_0x0974
            goto L_0x0975
        L_0x0974:
            r8 = r0
        L_0x0975:
            org.json.JSONObject r0 = o40.C61937h.m72709h(r8)
            r3.append(r0)
            java.lang.String r0 = " fail,"
            r3.append(r0)
            r3.append(r6)
            java.lang.String r0 = " have show!"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)
        L_0x0990:
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0992:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            r9 = r4
            r6 = r13
            r0 = r16
            r13 = r17
            r3 = r19
            r4 = r20
            r8 = r22
            goto L_0x0048
        L_0x09a2:
            sx3.C64197v.m75542k()
            r1 = 0
            throw r1
        L_0x09a7:
            r13 = r6
            r22 = r8
            r4 = r9
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x09b2
        L_0x09ae:
            r13 = r6
            r22 = r8
            r4 = r9
        L_0x09b2:
            java.lang.String r0 = r22.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)
            int r0 = r4.size()
            if (r0 <= 0) goto L_0x09c8
            androidx.lifecycle.i0 r0 = r1.mo71262a(r13)
            rl1.d0 r0 = (rl1.C13022d0) r0
            r0.mo12532F3(r4, r2)
        L_0x09c8:
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L_0x09dc
            androidx.lifecycle.i0 r0 = r1.mo71262a(r7)
            cl1.o r0 = (cl1.C54991o) r0
            cl1.q r3 = new cl1.q
            r3.<init>(r0, r10, r2)
            o40.C61926c.m72668M(r3)
        L_0x09dc:
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x09f0
            androidx.lifecycle.i0 r0 = r1.mo71262a(r7)
            cl1.o r0 = (cl1.C54991o) r0
            cl1.p r1 = new cl1.p
            r1.<init>(r0, r11)
            o40.C61926c.m72668M(r1)
        L_0x09f0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cj1.C0590s.mo602a(fj1.b, java.util.LinkedList, boolean):void");
    }
}
