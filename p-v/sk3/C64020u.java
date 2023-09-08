package sk3;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53934p0;
import bp3.C54526i;
import c14.C54624g;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C57593a4;
import d14.C45253g;
import d14.C58017a1;
import d14.C58085t0;
import d14.C58100z0;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.ResultKt;
import p157gk.C59479c;
import p157gk.C59481e;
import p157gk.C59491j;
import qk3.C63281a;
import qk3.C63283c;
import qk3.C63284d;
import rx3.C13598b0;
import rx3.C13600d;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.ui.chatting.search.multi.uic.FTSMultiItemAllResultUIC$getImageDataFromFlow$1", mo125469f = "FTSMultiItemAllResultUIC.kt", mo125470l = {680}, mo125471m = "invokeSuspend")
/* renamed from: sk3.u */
public final class C64020u extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f181498d;

    /* renamed from: e */
    public /* synthetic */ Object f181499e;

    /* renamed from: f */
    public final /* synthetic */ C64024v f181500f;

    /* renamed from: g */
    public final /* synthetic */ String f181501g;

    /* renamed from: sk3.u$a */
    public static final class C64021a implements C45253g<C63281a> {

        /* renamed from: d */
        public final /* synthetic */ C64024v f181502d;

        /* renamed from: e */
        public final /* synthetic */ C0000n0 f181503e;

        public C64021a(C64024v vVar, C0000n0 n0Var) {
            this.f181502d = vVar;
            this.f181503e = n0Var;
        }

        /* JADX WARNING: Removed duplicated region for block: B:84:0x03f7  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object emit(java.lang.Object r21, wx3.C15601d r22) {
            /*
                r20 = this;
                r0 = r20
                r1 = r21
                qk3.a r1 = (qk3.C63281a) r1
                java.lang.Class<sk3.m> r2 = sk3.C63995m.class
                java.lang.Class<sk3.r0> r3 = sk3.C64009r0.class
                java.util.ArrayList<com.tencent.mm.api.QueryImageData> r4 = r1.f179603f
                int r4 = r4.size()
                java.util.ArrayList<com.tencent.mm.api.QueryImageData> r5 = r1.f179602e
                int r5 = r5.size()
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = "getDataFromFlowCollect >>  "
                r6.append(r7)
                java.lang.Thread r7 = java.lang.Thread.currentThread()
                r6.append(r7)
                java.lang.String r7 = ", "
                r6.append(r7)
                boolean r8 = r1.f179599b
                r6.append(r8)
                r6.append(r7)
                long r8 = r1.f179601d
                r6.append(r8)
                r6.append(r7)
                long r8 = r1.f179600c
                r6.append(r8)
                r6.append(r7)
                r6.append(r5)
                r6.append(r7)
                r6.append(r4)
                r6.append(r7)
                java.lang.String r8 = r1.f179598a
                r6.append(r8)
                r6.append(r7)
                sk3.v r8 = r0.f181502d
                java.lang.String r8 = r8.f181516f
                r6.append(r8)
                r6.append(r7)
                sk3.v r8 = r0.f181502d
                boolean r8 = r8.f181532y
                r6.append(r8)
                r6.append(r7)
                a14.n0 r8 = r0.f181503e
                boolean r8 = a14.C53930o0.m60560g(r8)
                r6.append(r8)
                java.lang.String r6 = r6.toString()
                java.lang.String r8 = "MicroMsg.FTSMultiItemAllResultUIC"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r6)
                a14.n0 r6 = r0.f181503e
                boolean r6 = a14.C53930o0.m60560g(r6)
                if (r6 != 0) goto L_0x008f
                java.lang.String r1 = "is no active"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r1)
                rx3.b0 r1 = rx3.C13598b0.f38549a
                goto L_0x0452
            L_0x008f:
                java.lang.String r6 = r1.f179598a
                sk3.v r9 = r0.f181502d
                java.lang.String r9 = r9.f181516f
                boolean r6 = android.text.TextUtils.equals(r6, r9)
                if (r6 != 0) goto L_0x00a4
                java.lang.String r1 = "flow data query is no currentQuery"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r1)
                rx3.b0 r1 = rx3.C13598b0.f38549a
                goto L_0x0452
            L_0x00a4:
                sk3.v r6 = r0.f181502d
                boolean r6 = r6.f181532y
                r9 = 1
                if (r6 != 0) goto L_0x00ce
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "when data from flow return but normal result is no return "
                r2.append(r3)
                boolean r3 = r1.f179599b
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r2)
                boolean r1 = r1.f179599b
                if (r1 == 0) goto L_0x00ca
                sk3.v r1 = r0.f181502d
                r1.f181510D = r9
            L_0x00ca:
                rx3.b0 r1 = rx3.C13598b0.f38549a
                goto L_0x0452
            L_0x00ce:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r10 = "isPageNoEnoughToShowed >> "
                r6.append(r10)
                sk3.v r10 = r0.f181502d
                boolean r10 = r10.f181507A
                r6.append(r10)
                java.lang.String r10 = ", isPageTouchToShowed >> "
                r6.append(r10)
                sk3.v r10 = r0.f181502d
                boolean r10 = r10.f181533z
                r6.append(r10)
                java.lang.String r6 = r6.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r6)
                sk3.v r6 = r0.f181502d
                boolean r10 = r6.f181507A
                r11 = 65292(0xff0c, float:9.1494E-41)
                if (r10 != 0) goto L_0x019e
                long r12 = r1.f179601d
                boolean r10 = r1.f179599b
                java.util.ArrayList<ok3.g> r14 = r6.f181521n
                boolean r14 = r14.isEmpty()
                if (r14 == 0) goto L_0x010c
                r22 = r10
                r9 = 0
                goto L_0x0118
            L_0x010c:
                java.util.ArrayList<ok3.g> r14 = r6.f181521n
                java.lang.Object r14 = sx3.C110818d0.m150923U(r14)
                ok3.g r14 = (ok3.C62072g) r14
                r22 = r10
                long r9 = r14.f176478l
            L_0x0118:
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                java.lang.String r15 = "getNormalToShowData >> "
                r14.append(r15)
                r14.append(r12)
                r14.append(r7)
                r14.append(r9)
                r14.append(r11)
                r11 = r22
                r14.append(r11)
                r22 = r2
                java.lang.String r2 = "， "
                r14.append(r2)
                java.util.ArrayList<ok3.g> r2 = r6.f181520j
                int r2 = r2.size()
                r14.append(r2)
                java.lang.String r2 = r14.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r2)
                java.util.ArrayList r2 = new java.util.ArrayList
                java.util.ArrayList<ok3.g> r6 = r6.f181520j
                r2.<init>(r6)
                java.util.ArrayList r6 = new java.util.ArrayList
                r6.<init>()
                java.util.Iterator r2 = r2.iterator()
            L_0x015b:
                boolean r14 = r2.hasNext()
                if (r14 == 0) goto L_0x0185
                java.lang.Object r14 = r2.next()
                ok3.g r14 = (ok3.C62072g) r14
                r18 = r2
                r17 = r3
                long r2 = r14.f176478l
                int r19 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
                if (r19 >= 0) goto L_0x0173
                if (r11 == 0) goto L_0x0187
            L_0x0173:
                int r19 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
                r2 = 0
                if (r19 < 0) goto L_0x017d
                int r16 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
                if (r16 != 0) goto L_0x0180
            L_0x017d:
                r6.add(r14)
            L_0x0180:
                r3 = r17
                r2 = r18
                goto L_0x015b
            L_0x0185:
                r17 = r3
            L_0x0187:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r15)
                int r3 = r6.size()
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r2)
                goto L_0x01ab
            L_0x019e:
                r22 = r2
                r17 = r3
                java.util.ArrayList r6 = new java.util.ArrayList
                sk3.v r2 = r0.f181502d
                java.util.ArrayList<ok3.g> r2 = r2.f181521n
                r6.<init>(r2)
            L_0x01ab:
                int r2 = r6.size()
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r9 = "normalList >> "
                r3.append(r9)
                r3.append(r2)
                java.lang.String r3 = r3.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r3)
                if (r5 == 0) goto L_0x01d4
                sk3.v r3 = r0.f181502d
                java.util.ArrayList<com.tencent.mm.api.QueryImageData> r5 = r1.f179602e
                java.util.ArrayList<com.tencent.mm.api.QueryImageData> r9 = r3.f181525r
                java.util.ArrayList r5 = sk3.C64024v.m75347c3(r3, r5, r9)
                nk3.a r9 = nk3.C61795a.IMAGE_PIC
                r3.mo88782g3(r5, r9, r6)
            L_0x01d4:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r5 = "after inset pic "
                r3.append(r5)
                int r5 = r6.size()
                r3.append(r5)
                java.lang.String r3 = r3.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r3)
                if (r4 == 0) goto L_0x01fd
                sk3.v r3 = r0.f181502d
                java.util.ArrayList<com.tencent.mm.api.QueryImageData> r4 = r1.f179603f
                java.util.ArrayList<com.tencent.mm.api.QueryImageData> r5 = r3.f181526s
                java.util.ArrayList r4 = sk3.C64024v.m75347c3(r3, r4, r5)
                nk3.a r5 = nk3.C61795a.IMAGE_OCR
                r3.mo88782g3(r4, r5, r6)
            L_0x01fd:
                sk3.v r3 = r0.f181502d
                java.util.ArrayList<ok3.g> r3 = r3.f181521n
                int r3 = r3.size()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "after inset ocr "
                r4.append(r5)
                int r5 = r6.size()
                r4.append(r5)
                r4.append(r7)
                r4.append(r3)
                java.lang.String r4 = r4.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r4)
                sk3.v r4 = r0.f181502d
                boolean r4 = r4.f181507A
                if (r4 != 0) goto L_0x0232
                if (r4 == 0) goto L_0x022c
                goto L_0x0232
            L_0x022c:
                int r4 = r6.size()
                int r4 = r4 + r3
                goto L_0x0236
            L_0x0232:
                int r4 = r6.size()
            L_0x0236:
                bl3.r r5 = bl3.C39818r.f106831a
                sk3.v r9 = r0.f181502d
                androidx.appcompat.app.AppCompatActivity r9 = r9.getActivity()
                bl3.r$a r9 = r5.mo62444c(r9)
                r10 = r17
                androidx.lifecycle.i0 r9 = r9.mo75002a(r10)
                sk3.r0 r9 = (sk3.C64009r0) r9
                int r9 = r9.f181466p
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                java.lang.String r12 = "currentTab >> "
                r11.append(r12)
                r11.append(r9)
                java.lang.String r9 = r11.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r9)
                r9 = 10
                r11 = 0
                java.lang.String r12 = "<set-?>"
                if (r4 < r9) goto L_0x0302
                sk3.v r1 = r0.f181502d
                boolean r2 = r1.f181507A
                if (r2 != 0) goto L_0x02f4
                boolean r1 = r1.f181533z
                r2 = 1
                r1 = r1 ^ r2
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r9 = "showedSize >> "
                r2.append(r9)
                r2.append(r3)
                r2.append(r7)
                r2.append(r4)
                r2.append(r7)
                r2.append(r1)
                java.lang.String r2 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r2)
                sk3.v r2 = r0.f181502d
                java.util.ArrayList<ok3.g> r2 = r2.f181521n
                r2.addAll(r6)
                sk3.v r2 = r0.f181502d
                r4 = 1
                r2.f181533z = r4
                if (r1 != 0) goto L_0x02ec
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r4 = "isToNotify >> "
                r2.append(r4)
                r2.append(r3)
                r2.append(r7)
                int r4 = r6.size()
                r2.append(r4)
                r4 = 65292(0xff0c, float:9.1494E-41)
                r2.append(r4)
                sk3.v r4 = r0.f181502d
                nk3.d r4 = r4.f181524q
                if (r4 == 0) goto L_0x02c5
                r9 = 1
                goto L_0x02c6
            L_0x02c5:
                r9 = 0
            L_0x02c6:
                r2.append(r9)
                java.lang.String r2 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r2)
                sk3.v r2 = r0.f181502d
                nk3.d r4 = r2.f181524q
                if (r4 != 0) goto L_0x02d7
                goto L_0x02de
            L_0x02d7:
                java.util.ArrayList<ok3.g> r2 = r2.f181521n
                gy3.C87412m.m108594g(r2, r12)
                r4.f175706f = r2
            L_0x02de:
                sk3.v r2 = r0.f181502d
                nk3.d r2 = r2.f181524q
                if (r2 == 0) goto L_0x02f1
                int r4 = r6.size()
                r2.notifyItemRangeInserted(r3, r4)
                goto L_0x02f1
            L_0x02ec:
                rk3.a r2 = rk3.C63462a.f180011a
                r2.mo88334i()
            L_0x02f1:
                r9 = r1
                goto L_0x03f5
            L_0x02f4:
                java.lang.String r1 = "go to directly and > per_show_num"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r1)
                sk3.v r1 = r0.f181502d
                r1.f181521n = r6
                r2 = 1
                r1.f181508B = r2
                goto L_0x03f4
            L_0x0302:
                sk3.v r4 = r0.f181502d
                boolean r9 = r4.f181533z
                if (r9 == 0) goto L_0x034a
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "load more >> "
                r1.append(r2)
                r1.append(r3)
                r1.append(r7)
                int r2 = r6.size()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r1)
                sk3.v r1 = r0.f181502d
                java.util.ArrayList<ok3.g> r1 = r1.f181521n
                r1.addAll(r6)
                sk3.v r1 = r0.f181502d
                nk3.d r2 = r1.f181524q
                if (r2 != 0) goto L_0x0334
                goto L_0x033b
            L_0x0334:
                java.util.ArrayList<ok3.g> r1 = r1.f181521n
                gy3.C87412m.m108594g(r1, r12)
                r2.f175706f = r1
            L_0x033b:
                sk3.v r1 = r0.f181502d
                nk3.d r1 = r1.f181524q
                if (r1 == 0) goto L_0x03f4
                int r2 = r6.size()
                r1.notifyItemRangeInserted(r3, r2)
                goto L_0x03f4
            L_0x034a:
                boolean r9 = r4.f181507A
                if (r9 != 0) goto L_0x03ef
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r9 = "is no enough per num >> "
                r4.append(r9)
                sk3.v r9 = r0.f181502d
                gk.c r9 = r9.f181529v
                r4.append(r9)
                r4.append(r7)
                boolean r9 = r1.f179599b
                r4.append(r9)
                r9 = 32
                r4.append(r9)
                r4.append(r3)
                r4.append(r9)
                r4.append(r2)
                java.lang.String r4 = r4.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r4)
                sk3.v r4 = r0.f181502d
                gk.c r9 = r4.f181529v
                gk.c r12 = p157gk.C59479c.STOP
                if (r9 != r12) goto L_0x03a0
                boolean r1 = r1.f179599b
                if (r1 == 0) goto L_0x039a
                r1 = 1
                r4.f181507A = r1
                java.util.ArrayList<ok3.g> r2 = r4.f181521n
                r2.addAll(r6)
                rk3.a r2 = rk3.C63462a.f180011a
                r2.mo88334i()
                sk3.v r2 = r0.f181502d
                r2.f181527t = r1
                goto L_0x03ed
            L_0x039a:
                java.util.ArrayList<ok3.g> r1 = r4.f181521n
                r1.addAll(r6)
                goto L_0x03f4
            L_0x03a0:
                r1 = 1
                r4.f181507A = r1
                java.util.ArrayList<ok3.g> r1 = r4.f181520j
                int r4 = r1.size()
                java.util.List r1 = r1.subList(r2, r4)
                java.lang.String r2 = "allResultItemList.subLis…, allResultItemList.size)"
                gy3.C87412m.m108593f(r1, r2)
                sk3.v r2 = r0.f181502d
                java.util.ArrayList<ok3.g> r2 = r2.f181521n
                r2.addAll(r6)
                sk3.v r2 = r0.f181502d
                java.util.ArrayList<ok3.g> r2 = r2.f181521n
                r2.addAll(r1)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r4 = "go to show directly "
                r2.append(r4)
                r2.append(r3)
                r2.append(r7)
                int r3 = r6.size()
                r2.append(r3)
                r2.append(r7)
                int r1 = r1.size()
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r1)
                rk3.a r1 = rk3.C63462a.f180011a
                r1.mo88334i()
            L_0x03ed:
                r9 = 1
                goto L_0x03f5
            L_0x03ef:
                r4.f181521n = r6
                r1 = 1
                r4.f181508B = r1
            L_0x03f4:
                r9 = 0
            L_0x03f5:
                if (r9 == 0) goto L_0x0450
                java.lang.String r1 = "post value"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r1)
                sk3.v r1 = r0.f181502d
                androidx.lifecycle.z<ok3.i> r1 = r1.f181517g
                ok3.i r2 = ok3.C62074i.FINISH
                r1.setValue(r2)
                sk3.v r1 = r0.f181502d
                androidx.appcompat.app.AppCompatActivity r1 = r1.getActivity()
                bl3.r$a r1 = r5.mo62444c(r1)
                androidx.lifecycle.i0 r1 = r1.mo75002a(r10)
                sk3.r0 r1 = (sk3.C64009r0) r1
                int r1 = r1.f181466p
                if (r1 != 0) goto L_0x0450
                rk3.a r1 = rk3.C63462a.f180011a
                sk3.v r2 = r0.f181502d
                java.util.ArrayList<ok3.g> r2 = r2.f181521n
                int r2 = r2.size()
                sk3.v r3 = r0.f181502d
                androidx.appcompat.app.AppCompatActivity r3 = r3.getActivity()
                bl3.r$a r3 = r5.mo62444c(r3)
                r4 = r22
                androidx.lifecycle.i0 r3 = r3.mo75002a(r4)
                sk3.m r3 = (sk3.C63995m) r3
                int r3 = r3.mo88764f3()
                sk3.v r6 = r0.f181502d
                androidx.appcompat.app.AppCompatActivity r6 = r6.getActivity()
                bl3.r$a r5 = r5.mo62444c(r6)
                androidx.lifecycle.i0 r4 = r5.mo75002a(r4)
                sk3.m r4 = (sk3.C63995m) r4
                int r4 = r4.mo88762d3()
                r1.mo88331f(r2, r3, r4)
            L_0x0450:
                rx3.b0 r1 = rx3.C13598b0.f38549a
            L_0x0452:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: sk3.C64020u.C64021a.emit(java.lang.Object, wx3.d):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C64020u(C64024v vVar, String str, C15601d<? super C64020u> dVar) {
        super(2, dVar);
        this.f181500f = vVar;
        this.f181501g = str;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C64020u uVar = new C64020u(this.f181500f, this.f181501g, dVar);
        uVar.f181499e = obj;
        return uVar;
    }

    public Object invoke(Object obj, Object obj2) {
        ((C64020u) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        return C15911a.COROUTINE_SUSPENDED;
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f181498d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C0000n0 n0Var = (C0000n0) this.f181499e;
            C54526i iVar = C54526i.f152882a;
            if (!iVar.mo75389a() || !iVar.mo75390b()) {
                Log.m105924i("MicroMsg.ImageQueryDataModel", "checkInitDB >> entrance is close");
            } else if (C59491j.f169998c == null) {
                C59491j.f169998c = new C59481e();
                C57593a4.f164912a.mo81936a();
            }
            C64024v vVar = this.f181500f;
            C63284d dVar = vVar.f181530w;
            String str = this.f181501g;
            String str2 = vVar.f181514d;
            C59479c cVar = vVar.f181529v;
            dVar.getClass();
            C87412m.m108594g(str, "queryText");
            C87412m.m108594g(str2, "currentRoomId");
            C87412m.m108594g(cVar, "queryType");
            Log.m105924i("MicroMsg.LoadMoreImageDataModel", "getLoadMoreDataFlow >> " + str + ", " + str2 + ", " + cVar);
            dVar.f179617a = C58017a1.m67173b(0, 0, (C54624g) null, 7, (Object) null);
            dVar.f179619c = C53895h.m60466d(dVar.f179618b, C53872d1.f151119c, (C53934p0) null, new C63283c(str, dVar, str2, cVar, (C15601d<? super C63283c>) null), 2, (Object) null);
            C58085t0<C63281a> t0Var = dVar.f179617a;
            C87412m.m108591d(t0Var);
            C64021a aVar2 = new C64021a(this.f181500f, n0Var);
            this.f181498d = 1;
            if (C58100z0.m67238l((C58100z0) t0Var, aVar2, this) == aVar) {
                return aVar;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        throw new C13600d();
    }
}
