package com.tencent.p014mm.plugin.fts.p059ui;

import android.os.Bundle;
import androidx.lifecycle.C0125s;
import bl3.C39818r;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import di3.C86312j;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.HashSet;
import kotlin.Metadata;
import ky2.C10432i;
import l31.C61212e;
import o31.C11345b;
import o31.C76986a;
import org.json.JSONObject;
import rx3.C13598b0;
import sv1.C64170b;
import uv1.C65479a;
import vv1.C22798i;
import vv1.C22801j;
import vv1.C65887b;
import vv1.C65894d;
import vv1.C65896f;
import vv1.C78488e;
import vv1.C78490l;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/fts/ui/FTSMainUI;", "Lcom/tencent/mm/plugin/fts/ui/FTSBaseMainUI;", "<init>", "()V", "ui-fts_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.fts.ui.FTSMainUI */
public final class FTSMainUI extends FTSBaseMainUI {

    /* renamed from: com.tencent.mm.plugin.fts.ui.FTSMainUI$a */
    public static final class C18837a extends C87413o implements C32226l<C65479a, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FTSMainUI f52816d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18837a(FTSMainUI fTSMainUI) {
            super(1);
            this.f52816d = fTSMainUI;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v11, resolved type: lv1.d} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r31) {
            /*
                r30 = this;
                r1 = r30
                r2 = r31
                uv1.a r2 = (uv1.C65479a) r2
                java.lang.String r0 = "state"
                gy3.C87412m.m108594g(r2, r0)
                com.tencent.mm.plugin.fts.ui.FTSMainUI r0 = r1.f52816d
                com.tencent.mm.sdk.statecenter.IStateAction r3 = r2.getAction()
                java.lang.String r4 = "SOSRelevant:"
                r5 = 0
                r6 = 1
                if (r3 == 0) goto L_0x008a
                boolean r7 = r3 instanceof w00.C22839i
                if (r7 == 0) goto L_0x008a
                w00.i r3 = (w00.C22839i) r3
                com.tencent.mm.plugin.fts.ui.z r7 = r0.f52735s
                zv1.b r7 = r7.f52958o
                java.util.LinkedList<te3.pd4> r8 = r3.f65665a
                int r8 = r8.size()
                r7.f67725v = r8
                com.tencent.mm.plugin.fts.ui.z r0 = r0.f52735s
                zv1.b r0 = r0.f52958o
                java.util.LinkedList<te3.pd4> r3 = r3.f65665a
                int r7 = r0.f67726w
                r8 = 0
            L_0x0033:
                int r9 = r3.size()
                if (r8 >= r9) goto L_0x008a
                lv1.d r9 = new lv1.d
                r9.<init>()
                r9.f60759a = r8
                r9.f60760b = r7
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                r10.append(r4)
                java.lang.Object r11 = r3.get(r8)
                te3.pd4 r11 = (te3.pd4) r11
                java.lang.String r11 = r11.f139711e
                r10.append(r11)
                java.lang.String r10 = r10.toString()
                r9.f60765g = r10
                long r10 = eb0.C31543z5.m39453c()
                long r12 = r0.f67705b
                long r10 = r10 - r12
                r9.f60764f = r10
                r10 = 23
                r9.f60761c = r10
                r9.f60762d = r6
                r9.f60770l = r5
                java.lang.Object r10 = r3.get(r8)
                te3.pd4 r10 = (te3.pd4) r10
                java.lang.String r10 = r10.f139711e
                r9.f60767i = r10
                java.util.List<lv1.d> r10 = r0.f67703J
                java.util.ArrayList r10 = (java.util.ArrayList) r10
                boolean r10 = r10.contains(r9)
                if (r10 != 0) goto L_0x0087
                java.util.List<lv1.d> r10 = r0.f67703J
                java.util.ArrayList r10 = (java.util.ArrayList) r10
                r10.add(r9)
            L_0x0087:
                int r8 = r8 + 1
                goto L_0x0033
            L_0x008a:
                com.tencent.mm.plugin.fts.ui.FTSMainUI r0 = r1.f52816d
                com.tencent.mm.sdk.statecenter.IStateAction r3 = r2.getAction()
                r9 = 3
                if (r3 == 0) goto L_0x0179
                boolean r10 = r3 instanceof w00.C22834d
                if (r10 == 0) goto L_0x0179
                w00.d r3 = (w00.C22834d) r3
                java.util.LinkedList<te3.pd4> r10 = r3.f65655b
                int r10 = r10.size()
                if (r10 <= r9) goto L_0x00a2
                r10 = 3
            L_0x00a2:
                com.tencent.mm.plugin.fts.ui.z r0 = r0.f52735s
                zv1.b r0 = r0.f52958o
                r0.f67724u = r10
                java.lang.String r10 = r3.f65654a
                java.util.LinkedList<te3.pd4> r3 = r3.f65655b
                long r14 = eb0.C31543z5.m39453c()
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                java.lang.String r13 = "SOSItemRelevant:"
                r11.append(r13)
                r11.append(r10)
                java.lang.String r11 = r11.toString()
                java.util.List<lv1.d> r12 = r0.f67703J
                java.util.ArrayList r12 = (java.util.ArrayList) r12
                java.util.Iterator r12 = r12.iterator()
            L_0x00c9:
                boolean r16 = r12.hasNext()
                if (r16 == 0) goto L_0x00e0
                java.lang.Object r16 = r12.next()
                r7 = r16
                lv1.d r7 = (lv1.C21461d) r7
                java.lang.String r8 = r7.f60765g
                boolean r8 = r8.equals(r11)
                if (r8 == 0) goto L_0x00c9
                goto L_0x00e1
            L_0x00e0:
                r7 = 0
            L_0x00e1:
                if (r7 == 0) goto L_0x0179
                r8 = 32
                r7.f60761c = r8
                int r11 = r7.f60760b
                if (r11 == 0) goto L_0x00ee
                r19 = 3
                goto L_0x00f0
            L_0x00ee:
                r19 = 2
            L_0x00f0:
                r12 = 0
            L_0x00f1:
                int r11 = r3.size()
                if (r12 >= r11) goto L_0x0179
                if (r12 >= r9) goto L_0x0179
                lv1.d r11 = new lv1.d
                r11.<init>()
                r11.f60759a = r12
                int r9 = r7.f60760b
                r11.f60760b = r9
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                r9.append(r13)
                java.lang.Object r16 = r3.get(r12)
                r6 = r16
                te3.pd4 r6 = (te3.pd4) r6
                java.lang.String r6 = r6.f139711e
                r9.append(r6)
                java.lang.String r6 = r9.toString()
                r11.f60765g = r6
                long r5 = r0.f67705b
                long r5 = r14 - r5
                r11.f60764f = r5
                r11.f60763e = r5
                r11.f60769k = r14
                r11.f60761c = r8
                r5 = 0
                r11.f60770l = r5
                r5 = 1
                r11.f60762d = r5
                java.util.List<lv1.d> r5 = r0.f67703J
                java.util.ArrayList r5 = (java.util.ArrayList) r5
                boolean r5 = r5.contains(r11)
                if (r5 != 0) goto L_0x0168
                java.util.List<lv1.d> r5 = r0.f67703J
                java.util.ArrayList r5 = (java.util.ArrayList) r5
                r5.add(r11)
                r5 = 0
                java.lang.Object r6 = r3.get(r12)
                te3.pd4 r6 = (te3.pd4) r6
                java.lang.String r6 = r6.f139711e
                java.lang.String r16 = ""
                java.lang.String r17 = ""
                java.lang.String r18 = ""
                r11 = r10
                r20 = r12
                r12 = r0
                r21 = r13
                r13 = r5
                r22 = r14
                r14 = r16
                r15 = r17
                r16 = r18
                r17 = r6
                r18 = r19
                com.tencent.p014mm.plugin.fts.p059ui.widget.C18882g.m19813a(r11, r12, r13, r14, r15, r16, r17, r18)
                goto L_0x016e
            L_0x0168:
                r20 = r12
                r21 = r13
                r22 = r14
            L_0x016e:
                int r12 = r20 + 1
                r13 = r21
                r14 = r22
                r5 = 0
                r6 = 1
                r9 = 3
                goto L_0x00f1
            L_0x0179:
                com.tencent.mm.plugin.fts.ui.FTSMainUI r0 = r1.f52816d
                com.tencent.mm.sdk.statecenter.IStateAction r3 = r2.getAction()
                if (r3 == 0) goto L_0x01f5
                boolean r5 = r3 instanceof w00.C22838h
                if (r5 == 0) goto L_0x01f5
                w00.h r3 = (w00.C22838h) r3
                java.util.LinkedList<te3.zb0> r5 = r3.f65664b
                java.util.Iterator r5 = r5.iterator()
            L_0x018d:
                boolean r6 = r5.hasNext()
                if (r6 == 0) goto L_0x01f5
                java.lang.Object r6 = r5.next()
                te3.zb0 r6 = (te3.C52241zb0) r6
                com.tencent.mm.plugin.fts.ui.z r7 = r0.f52735s
                zv1.b r11 = r7.f52958o
                te3.pd4 r6 = r6.f145785d
                long r7 = r3.f65663a
                r11.getClass()
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                r10.append(r4)
                java.lang.String r6 = r6.f139711e
                r10.append(r6)
                java.lang.String r6 = r10.toString()
                java.util.List<lv1.d> r10 = r11.f67703J
                java.util.ArrayList r10 = (java.util.ArrayList) r10
                java.util.Iterator r10 = r10.iterator()
            L_0x01bd:
                boolean r12 = r10.hasNext()
                if (r12 == 0) goto L_0x018d
                java.lang.Object r12 = r10.next()
                lv1.d r12 = (lv1.C21461d) r12
                java.lang.String r13 = r12.f60765g
                boolean r13 = r6.equals(r13)
                if (r13 == 0) goto L_0x01bd
                long r13 = r12.f60763e
                r15 = 0
                int r17 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                if (r17 != 0) goto L_0x01bd
                long r13 = r11.f67705b
                long r13 = r7 - r13
                r12.f60763e = r13
                r12.f60769k = r7
                java.lang.String r10 = r11.f67704a
                r6 = 0
                java.lang.String r7 = r12.f60765g
                r17 = 1
                java.lang.String r13 = ""
                java.lang.String r14 = ""
                java.lang.String r15 = ""
                r12 = r6
                r16 = r7
                com.tencent.p014mm.plugin.fts.p059ui.widget.C18882g.m19813a(r10, r11, r12, r13, r14, r15, r16, r17)
                goto L_0x018d
            L_0x01f5:
                com.tencent.mm.plugin.fts.ui.FTSMainUI r3 = r1.f52816d
                com.tencent.mm.sdk.statecenter.IStateAction r0 = r2.getAction()
                if (r0 == 0) goto L_0x0344
                boolean r4 = r0 instanceof w00.C22835e
                if (r4 == 0) goto L_0x0344
                r4 = r0
                w00.e r4 = (w00.C22835e) r4
                int r0 = r4.f65657b
                r5 = -1
                if (r0 != r5) goto L_0x0210
                com.tencent.mm.plugin.fts.ui.z r0 = r3.f52735s
                int r0 = r0.f52963t
                r5 = r0
                r7 = 1
                goto L_0x0217
            L_0x0210:
                if (r0 != 0) goto L_0x0215
                r5 = 1
                r7 = 2
                goto L_0x0217
            L_0x0215:
                r5 = r0
                r7 = 3
            L_0x0217:
                java.lang.String r0 = r4.f65656a
                int r6 = r4.f65659d
                int r21 = r5 + r6
                r22 = 1
                r23 = 3
                com.tencent.mm.plugin.fts.ui.z r8 = r3.f52735s
                zv1.b r8 = r8.f52958o
                int r10 = r4.f65660e
                te3.zb0 r11 = r4.f65658c
                te3.pd4 r11 = r11.f145785d
                java.lang.String r12 = ""
                if (r11 == 0) goto L_0x0237
                java.lang.String r13 = r11.f139710d
                if (r13 != 0) goto L_0x0234
                goto L_0x0237
            L_0x0234:
                r26 = r13
                goto L_0x0239
            L_0x0237:
                r26 = r12
            L_0x0239:
                if (r11 == 0) goto L_0x0243
                java.lang.String r11 = r11.f139711e
                if (r11 != 0) goto L_0x0240
                goto L_0x0243
            L_0x0240:
                r27 = r11
                goto L_0x0245
            L_0x0243:
                r27 = r12
            L_0x0245:
                r11 = 1
                int r29 = r6 + 1
                java.lang.String r28 = ""
                r20 = r0
                r24 = r8
                r25 = r10
                com.tencent.p014mm.plugin.fts.p059ui.C18843b0.m19724k(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
                java.lang.String r0 = r4.f65656a
                te3.zb0 r6 = r4.f65658c
                te3.pd4 r6 = r6.f145785d
                if (r6 == 0) goto L_0x0264
                pe3.b r6 = r6.f139715i
                if (r6 == 0) goto L_0x0264
                java.lang.String r6 = r6.mo123705h()
                goto L_0x0265
            L_0x0264:
                r6 = 0
            L_0x0265:
                if (r6 != 0) goto L_0x0268
                r6 = r12
            L_0x0268:
                int r8 = r4.f65659d
                int r5 = r5 + r8
                te3.zb0 r8 = r4.f65658c
                te3.pd4 r8 = r8.f145785d
                if (r8 == 0) goto L_0x0274
                java.lang.String r8 = r8.f139711e
                goto L_0x0275
            L_0x0274:
                r8 = 0
            L_0x0275:
                com.tencent.mm.plugin.fts.ui.z r10 = r3.f52735s
                zv1.b r10 = r10.f52958o
                java.lang.String r11 = "MicroMsg.FTS.PardusSearchLogic"
                java.lang.String r13 = "utf8"
                java.lang.StringBuffer r14 = new java.lang.StringBuffer     // Catch:{ Exception -> 0x0332 }
                r14.<init>()     // Catch:{ Exception -> 0x0332 }
                java.lang.String r15 = "pardussearch=click&searchid="
                r14.append(r15)     // Catch:{ Exception -> 0x0332 }
                java.lang.String r15 = r10.f67698E     // Catch:{ Exception -> 0x0332 }
                r14.append(r15)     // Catch:{ Exception -> 0x0332 }
                java.lang.String r15 = "&query="
                r14.append(r15)     // Catch:{ Exception -> 0x0332 }
                java.lang.String r0 = p206nj.C117627q.m165909b(r0, r13)     // Catch:{ Exception -> 0x0332 }
                r14.append(r0)     // Catch:{ Exception -> 0x0332 }
                java.lang.String r0 = "&type="
                r14.append(r0)     // Catch:{ Exception -> 0x0332 }
                r9 = 0
                r14.append(r9)     // Catch:{ Exception -> 0x0332 }
                java.lang.String r0 = "&docid="
                r14.append(r0)     // Catch:{ Exception -> 0x0332 }
                r14.append(r12)     // Catch:{ Exception -> 0x0332 }
                java.lang.String r0 = "&title="
                r14.append(r0)     // Catch:{ Exception -> 0x0332 }
                java.lang.String r0 = p206nj.C117627q.m165909b(r12, r13)     // Catch:{ Exception -> 0x0332 }
                r14.append(r0)     // Catch:{ Exception -> 0x0332 }
                java.lang.String r0 = "&clienttimestamp="
                r14.append(r0)     // Catch:{ Exception -> 0x0332 }
                r0 = r10
                long r9 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0332 }
                r14.append(r9)     // Catch:{ Exception -> 0x0332 }
                java.lang.String r9 = "&jumpurl="
                r14.append(r9)     // Catch:{ Exception -> 0x0332 }
                java.lang.String r6 = p206nj.C117627q.m165909b(r6, r13)     // Catch:{ Exception -> 0x0332 }
                r14.append(r6)     // Catch:{ Exception -> 0x0332 }
                java.lang.String r6 = "&sug="
                r14.append(r6)     // Catch:{ Exception -> 0x0332 }
                java.lang.String r6 = p206nj.C117627q.m165909b(r12, r13)     // Catch:{ Exception -> 0x0332 }
                r14.append(r6)     // Catch:{ Exception -> 0x0332 }
                java.lang.String r6 = "&sugpos="
                r14.append(r6)     // Catch:{ Exception -> 0x0332 }
                r14.append(r5)     // Catch:{ Exception -> 0x0332 }
                java.lang.String r5 = "&relatedsug="
                r14.append(r5)     // Catch:{ Exception -> 0x0332 }
                java.lang.String r5 = p206nj.C117627q.m165909b(r8, r13)     // Catch:{ Exception -> 0x0332 }
                r14.append(r5)     // Catch:{ Exception -> 0x0332 }
                java.lang.String r5 = "&sugtype="
                r14.append(r5)     // Catch:{ Exception -> 0x0332 }
                r14.append(r7)     // Catch:{ Exception -> 0x0332 }
                java.lang.String r5 = "&requestid="
                r14.append(r5)     // Catch:{ Exception -> 0x0332 }
                long r5 = r0.f67729z     // Catch:{ Exception -> 0x0332 }
                r14.append(r5)     // Catch:{ Exception -> 0x0332 }
                java.lang.String r0 = "&sessionid="
                r14.append(r0)     // Catch:{ Exception -> 0x0332 }
                long r5 = kv1.C99252h.f291030c     // Catch:{ Exception -> 0x0332 }
                r14.append(r5)     // Catch:{ Exception -> 0x0332 }
                java.lang.String r0 = "realtimeSearchClickReport %s"
                r5 = 1
                java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0332 }
                java.lang.String r6 = r14.toString()     // Catch:{ Exception -> 0x0332 }
                r7 = 0
                r5[r7] = r6     // Catch:{ Exception -> 0x0332 }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r0, r5)     // Catch:{ Exception -> 0x0332 }
                te3.us3 r0 = new te3.us3     // Catch:{ Exception -> 0x0332 }
                r0.<init>()     // Catch:{ Exception -> 0x0332 }
                java.lang.String r5 = r14.toString()     // Catch:{ Exception -> 0x0332 }
                r0.f143104t = r5     // Catch:{ Exception -> 0x0332 }
                u73.j0 r5 = new u73.j0     // Catch:{ Exception -> 0x0332 }
                r5.<init>(r0)     // Catch:{ Exception -> 0x0332 }
                ob0.b0 r0 = f40.C86709a0.m107524d()     // Catch:{ Exception -> 0x0332 }
                r0.mo123460f(r5)     // Catch:{ Exception -> 0x0332 }
                goto L_0x033b
            L_0x0332:
                r0 = move-exception
                r5 = 0
                java.lang.Object[] r5 = new java.lang.Object[r5]
                java.lang.String r6 = "realtimeSearchClickReport"
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r11, r0, r6, r5)
            L_0x033b:
                com.tencent.mm.plugin.fts.ui.z r0 = r3.f52735s
                zv1.b r0 = r0.f52958o
                int r3 = r4.f65660e
                r0.mo37067a(r3)
            L_0x0344:
                com.tencent.mm.plugin.fts.ui.FTSMainUI r0 = r1.f52816d
                com.tencent.mm.sdk.statecenter.IStateAction r3 = r2.getAction()
                if (r3 == 0) goto L_0x035a
                boolean r4 = r3 instanceof w00.C22833c
                if (r4 == 0) goto L_0x035a
                w00.c r3 = (w00.C22833c) r3
                com.tencent.mm.plugin.fts.ui.z r0 = r0.f52735s
                zv1.b r0 = r0.f52958o
                java.lang.String r3 = r3.f65648c
                r0.f67698E = r3
            L_0x035a:
                com.tencent.mm.plugin.fts.ui.FTSMainUI r0 = r1.f52816d
                com.tencent.mm.sdk.statecenter.IStateAction r3 = r2.getAction()
                if (r3 == 0) goto L_0x037c
                boolean r4 = r3 instanceof w00.C22837g
                if (r4 == 0) goto L_0x037c
                w00.g r3 = (w00.C22837g) r3
                r4 = 0
                r5 = 1
                r6 = 2
                r7 = 3
                com.tencent.mm.plugin.fts.ui.z r0 = r0.f52735s
                zv1.b r8 = r0.f52958o
                r9 = 32
                r13 = 1
                java.lang.String r10 = ""
                java.lang.String r11 = ""
                java.lang.String r12 = ""
                com.tencent.p014mm.plugin.fts.p059ui.C18843b0.m19724k(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            L_0x037c:
                com.tencent.mm.plugin.fts.ui.FTSMainUI r0 = r1.f52816d
                com.tencent.mm.sdk.statecenter.IStateAction r2 = r2.getAction()
                if (r2 == 0) goto L_0x0392
                boolean r3 = r2 instanceof w00.C22840j
                if (r3 == 0) goto L_0x0392
                w00.j r2 = (w00.C22840j) r2
                com.tencent.mm.plugin.fts.ui.z r0 = r0.f52735s
                zv1.b r0 = r0.f52958o
                boolean r2 = r2.f65668c
                r0.f67699F = r2
            L_0x0392:
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.fts.p059ui.FTSMainUI.C18837a.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: H5 */
    public void mo1321H5() {
        C78490l lVar = (C78490l) C39818r.f106831a.mo62444c(this).mo62449e(C78490l.class);
        if (lVar != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("exittype", 5);
            String jSONObject2 = jSONObject.toString();
            C87412m.m108593f(jSONObject2, "extinfoJson.toString()");
            lVar.f229927e = jSONObject2;
            String g = this.f52761d.mo153855g();
            C87412m.m108593f(g, "searchViewHelper.searchContent");
            lVar.f229926d = g;
        }
        super.mo1321H5();
    }

    public void onBackPressed() {
        C78490l lVar = (C78490l) C39818r.f106831a.mo62444c(this).mo62449e(C78490l.class);
        if (lVar != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("exittype", 4);
            String jSONObject2 = jSONObject.toString();
            C87412m.m108593f(jSONObject2, "extinfoJson.toString()");
            lVar.f229927e = jSONObject2;
            String g = this.f52761d.mo153855g();
            C87412m.m108593f(g, "searchViewHelper.searchContent");
            lVar.f229926d = g;
        }
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((C61212e) C86312j.m106911c(C61212e.class)).mo86178qr(this, C11345b.FTSMainUI).mo86179qs(this, C76986a.Search);
        UIStateCenter stateCenter = getStateCenter();
        if (stateCenter != null) {
            stateCenter.observe((C0125s) this, new C18837a(this));
        }
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        C87412m.m108594g(hashSet, "set");
        super.superImportUIComponents(hashSet);
        hashSet.add(C65887b.class);
        hashSet.add(C65894d.class);
        hashSet.add(C78488e.class);
        hashSet.add(C65896f.class);
        hashSet.add(C64170b.class);
        hashSet.add(C78490l.class);
        if (!((C10432i) C86312j.m106911c(C10432i.class)).mo10750e()) {
            hashSet.add(C22801j.class);
            hashSet.add(C22798i.class);
        }
    }
}
