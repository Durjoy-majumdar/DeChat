package pf1;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.xwalk.plugin.XWalkPlugin;
import gy3.C87412m;
import java.net.URLEncoder;
import jq3.C60905o;
import o40.C61926c;
import pe1.C35464c;
import rs1.C13442s8;
import rx3.C36570n;
import up1.C37521f;
import z04.C112550d0;

/* renamed from: pf1.k */
public class C11908k extends C11896f {

    /* renamed from: h */
    public Context f34793h;

    /* renamed from: i */
    public C11906j f34794i;

    /* renamed from: j */
    public String f34795j = "";

    /* renamed from: k */
    public boolean f34796k;

    /* renamed from: l */
    public final Runnable f34797l = new C11909a(this);

    /* renamed from: pf1.k$a */
    public static final class C11909a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C11908k f34798d;

        public C11909a(C11908k kVar) {
            this.f34798d = kVar;
        }

        public final void run() {
            this.f34798d.mo11780u();
        }
    }

    /* renamed from: b */
    public void mo11768b(C60905o oVar, View view, C11920q qVar) {
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(view, "jumpView");
        C87412m.m108594g(qVar, "infoEx");
        super.mo11768b(oVar, view, qVar);
        this.f34765b = this.f34765b;
        this.f34764a = oVar;
        C37521f.f99374d.getClass();
        if (C37521f.f99155D8.mo60266n().intValue() == 1) {
            mo11794s();
        }
    }

    /* renamed from: e */
    public void mo11786e(boolean z, C60905o oVar, View view, C11920q qVar) {
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(view, "jumpView");
        C87412m.m108594g(qVar, "infoEx");
        super.mo11786e(z, oVar, view, qVar);
        String str = qVar.f34833g;
        this.f34795j = str;
        if (z) {
            this.f34793h = oVar.f173499A;
            C11918p pVar = qVar.f34832f;
            C11906j jVar = pVar instanceof C11906j ? (C11906j) pVar : null;
            this.f34794i = jVar;
            if (jVar != null) {
                mo11782y(oVar, view, qVar, jVar, str);
            } else {
                view.removeCallbacks(this.f34797l);
            }
        }
    }

    /* renamed from: f */
    public void mo11770f(C60905o oVar, View view, C11920q qVar) {
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(view, "jumpView");
        C87412m.m108594g(qVar, "infoEx");
        C37521f.f99374d.getClass();
        boolean z = true;
        if (C37521f.f99155D8.mo60266n().intValue() == 1) {
            if (!((Boolean) ((C36570n) this.f34768e).getValue()).booleanValue()) {
                z = false;
            }
            if (z) {
                ((Handler) ((C36570n) this.f34769f).getValue()).removeCallbacks((Runnable) ((C36570n) this.f34767d).getValue());
                Log.m105924i("BaseJumperEventHandler", "remove preloadRunnable");
            }
        }
    }

    /* renamed from: i */
    public void mo11787i(C11920q qVar) {
        C87412m.m108594g(qVar, "infoEx");
        super.mo11787i(qVar);
        if (this.f34796k) {
            mo11790n();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: pf1.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: pf1.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: pf1.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: pf1.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: pf1.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: pf1.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: pf1.j} */
    /* JADX WARNING: type inference failed for: r0v5, types: [pf1.p] */
    /* JADX WARNING: type inference failed for: r8v5, types: [java.lang.Integer] */
    /* JADX WARNING: type inference failed for: r8v7, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0115 A[Catch:{ JSONException -> 0x0172 }] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo11790n() {
        /*
            r19 = this;
            r1 = r19
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "doPreload jumpInfoEx is null="
            r0.append(r2)
            pf1.q r2 = r1.f34765b
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L_0x0014
            r2 = 1
            goto L_0x0015
        L_0x0014:
            r2 = 0
        L_0x0015:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "FinderAdBaseJumperEventHandler"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            pf1.q r5 = r1.f34765b
            if (r5 == 0) goto L_0x021f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "doPreload jumpInfo="
            r0.append(r6)
            er1.w3 r6 = er1.C58784w3.f168295a
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r7 = r5.f34827a
            java.lang.String r6 = r6.mo83918b1(r7)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r0 = r5.f34827a
            int r6 = r0.jumpinfo_type
            java.lang.String r7 = "Finder.JumperUtils"
            r8 = 0
            if (r6 == 0) goto L_0x01a5
            if (r6 == r4) goto L_0x019e
            r9 = 2
            if (r6 == r9) goto L_0x01a5
            r10 = 3
            if (r6 == r10) goto L_0x006c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "[doPreload] not support jumpinfo_type: "
            r0.append(r3)
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r3 = r5.f34827a
            int r3 = r3.jumpinfo_type
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            goto L_0x021f
        L_0x006c:
            com.tencent.mm.protocal.protobuf.NativeInfo r0 = r0.native_info
            if (r0 == 0) goto L_0x0077
            int r0 = r0.native_type
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0078
        L_0x0077:
            r0 = r8
        L_0x0078:
            r6 = 17
            if (r0 != 0) goto L_0x007e
            goto L_0x017c
        L_0x007e:
            int r0 = r0.intValue()
            if (r0 != r6) goto L_0x017c
            boolean r0 = r5.f34834h
            if (r0 == 0) goto L_0x008a
            goto L_0x021f
        L_0x008a:
            r5.f34834h = r4
            pf1.d0 r0 = pf1.C62262d0.f176978a
            r0.getClass()
            java.lang.String r2 = "safeGetString"
            up1.f r0 = up1.C37521f.f99374d
            r0.getClass()
            pe1.c<java.lang.Integer> r0 = up1.C37521f.f99468n7
            java.lang.Object r0 = r0.mo60266n()
            java.lang.Number r0 = (java.lang.Number) r0
            int r6 = r0.intValue()
            r0 = r6 & 3
            java.lang.String r10 = "[preloadAdNative] config="
            if (r0 != 0) goto L_0x00c4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r10)
            r0.append(r6)
            java.lang.String r2 = ", not preload"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            goto L_0x021f
        L_0x00c4:
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r0 = r5.f34827a
            com.tencent.mm.protocal.protobuf.NativeInfo r0 = r0.native_info
            java.lang.String r11 = ""
            if (r0 == 0) goto L_0x00d0
            java.lang.String r0 = r0.necessary_params
            if (r0 != 0) goto L_0x00d1
        L_0x00d0:
            r0 = r11
        L_0x00d1:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r10)
            r12.append(r6)
            java.lang.String r10 = ", necessaryParams="
            r12.append(r10)
            r12.append(r0)
            java.lang.String r10 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r10)
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0172 }
            r10.<init>(r0)     // Catch:{ JSONException -> 0x0172 }
            java.lang.String r0 = "canvas_id"
            boolean r12 = r10.has(r0)     // Catch:{ Exception -> 0x0102 }
            if (r12 != r4) goto L_0x00fa
            r12 = 1
            goto L_0x00fb
        L_0x00fa:
            r12 = 0
        L_0x00fb:
            if (r12 == 0) goto L_0x010a
            java.lang.String r0 = r10.getString(r0)     // Catch:{ Exception -> 0x0102 }
            goto L_0x010b
        L_0x0102:
            r0 = move-exception
            java.lang.Object[] r12 = new java.lang.Object[r4]     // Catch:{ JSONException -> 0x0172 }
            r12[r3] = r0     // Catch:{ JSONException -> 0x0172 }
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r2, r11, r12)     // Catch:{ JSONException -> 0x0172 }
        L_0x010a:
            r0 = r8
        L_0x010b:
            long r13 = o40.C61926c.m72671P(r0)     // Catch:{ JSONException -> 0x0172 }
            r15 = 0
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x021f
            r0 = r6 & 1
            if (r0 != r4) goto L_0x011c
            r17 = 1
            goto L_0x011e
        L_0x011c:
            r17 = 0
        L_0x011e:
            r0 = r6 & 2
            if (r0 != r9) goto L_0x0125
            r18 = 1
            goto L_0x0127
        L_0x0125:
            r18 = 0
        L_0x0127:
            r5.f34834h = r4     // Catch:{ JSONException -> 0x0172 }
            java.lang.String r0 = "uxinfo"
            boolean r5 = r10.has(r0)     // Catch:{ Exception -> 0x013f }
            if (r5 != r4) goto L_0x0134
            r5 = 1
            goto L_0x0135
        L_0x0134:
            r5 = 0
        L_0x0135:
            if (r5 == 0) goto L_0x013c
            java.lang.String r0 = r10.getString(r0)     // Catch:{ Exception -> 0x013f }
            goto L_0x013d
        L_0x013c:
            r0 = r8
        L_0x013d:
            r15 = r0
            goto L_0x0148
        L_0x013f:
            r0 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ JSONException -> 0x0172 }
            r5[r3] = r0     // Catch:{ JSONException -> 0x0172 }
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r2, r11, r5)     // Catch:{ JSONException -> 0x0172 }
            r15 = r8
        L_0x0148:
            java.lang.String r0 = "canvas_dynamic_info"
            boolean r5 = r10.has(r0)     // Catch:{ Exception -> 0x015a }
            if (r5 != r4) goto L_0x0152
            r5 = 1
            goto L_0x0153
        L_0x0152:
            r5 = 0
        L_0x0153:
            if (r5 == 0) goto L_0x0162
            java.lang.String r8 = r10.getString(r0)     // Catch:{ Exception -> 0x015a }
            goto L_0x0162
        L_0x015a:
            r0 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ JSONException -> 0x0172 }
            r4[r3] = r0     // Catch:{ JSONException -> 0x0172 }
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r2, r11, r4)     // Catch:{ JSONException -> 0x0172 }
        L_0x0162:
            r16 = r8
            java.lang.Class<jr2.k> r0 = jr2.C9510k.class
            di3.d r0 = di3.C86312j.m106911c(r0)     // Catch:{ JSONException -> 0x0172 }
            r12 = r0
            jr2.k r12 = (jr2.C9510k) r12     // Catch:{ JSONException -> 0x0172 }
            r12.mo10202HC(r13, r15, r16, r17, r18)     // Catch:{ JSONException -> 0x0172 }
            goto L_0x021f
        L_0x0172:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r0)
            goto L_0x021f
        L_0x017c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "[doPreload] not support native_type: "
            r0.append(r3)
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r3 = r5.f34827a
            com.tencent.mm.protocal.protobuf.NativeInfo r3 = r3.native_info
            if (r3 == 0) goto L_0x0192
            int r3 = r3.native_type
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
        L_0x0192:
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            goto L_0x021f
        L_0x019e:
            pf1.d0 r0 = pf1.C62262d0.f176978a
            r0.mo87329v(r5)
            goto L_0x021f
        L_0x01a5:
            pf1.p r0 = r5.f34832f
            boolean r2 = r0 instanceof pf1.C11906j
            if (r2 == 0) goto L_0x01ae
            r8 = r0
            pf1.j r8 = (pf1.C11906j) r8
        L_0x01ae:
            if (r8 == 0) goto L_0x021f
            jq3.o r0 = r1.f34764a
            if (r0 == 0) goto L_0x021f
            android.content.Context r0 = r0.f173499A
            if (r0 == 0) goto L_0x021f
            java.lang.String r2 = r8.f34784g
            java.lang.String r6 = r8.f34785h
            java.lang.String r5 = r5.f34833g
            java.lang.String r0 = r1.mo11798v(r0, r2, r6, r5)
            pf1.d0 r2 = pf1.C62262d0.f176978a
            r2.getClass()
            if (r0 == 0) goto L_0x01cf
            int r2 = r0.length()
            if (r2 != 0) goto L_0x01d0
        L_0x01cf:
            r3 = 1
        L_0x01d0:
            if (r3 == 0) goto L_0x01eb
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "[preloadAdH5] fail, stack:"
            r0.append(r2)
            com.tencent.mm.sdk.platformtools.MMStack r2 = com.tencent.p014mm.sdk.platformtools.Util.getStack()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            goto L_0x021d
        L_0x01eb:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "[preloadAdH5] url:"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r2)
            ex0.h$b r2 = new ex0.h$b
            r2.<init>()
            r2.f123504a = r0
            r0 = 212(0xd4, float:2.97E-43)
            r2.f123506c = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r2)
            java.lang.Class<ex0.h> r2 = ex0.C45700h.class
            k40.a r2 = f40.C86709a0.m107533q(r2)
            ex0.h r2 = (ex0.C45700h) r2
            r2.mo71031UP(r0)
        L_0x021d:
            r1.f34796k = r4
        L_0x021f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pf1.C11908k.mo11790n():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo11775r(jq3.C60905o r19, android.view.View r20, pf1.C11920q r21) {
        /*
            r18 = this;
            r7 = r19
            r8 = r21
            java.lang.String r0 = "holder"
            gy3.C87412m.m108594g(r7, r0)
            java.lang.String r0 = "jumpView"
            r9 = r20
            gy3.C87412m.m108594g(r9, r0)
            java.lang.String r0 = "infoEx"
            gy3.C87412m.m108594g(r8, r0)
            super.mo11775r(r19, r20, r21)
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r0 = r8.f34827a
            int r0 = r0.jumpinfo_type
            java.lang.String r1 = "holder.context"
            r10 = 0
            if (r0 == 0) goto L_0x00d6
            r2 = 2
            if (r0 == r2) goto L_0x00d6
            r2 = 7
            if (r0 == r2) goto L_0x004d
            pf1.p r0 = r8.f34832f
            boolean r2 = r0 instanceof pf1.C11906j
            if (r2 == 0) goto L_0x0030
            pf1.j r0 = (pf1.C11906j) r0
            goto L_0x0031
        L_0x0030:
            r0 = r10
        L_0x0031:
            if (r0 == 0) goto L_0x0036
            java.lang.String r0 = r0.f34785h
            goto L_0x0037
        L_0x0036:
            r0 = r10
        L_0x0037:
            r8.f34836j = r0
            pf1.d0 r0 = pf1.C62262d0.f176978a
            android.content.Context r2 = r7.f173499A
            gy3.C87412m.m108593f(r2, r1)
            r3 = 0
            r5 = 4
            r6 = 0
            r1 = r2
            r2 = r21
            r4 = r19
            pf1.C62262d0.m73168c(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x00d3
        L_0x004d:
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r0 = r8.f34830d
            if (r0 == 0) goto L_0x00d3
            fe1.d$b r2 = fe1.C58961d.f168673a
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r0.mo3513o()
            java.lang.String r12 = r3.field_username
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r0.mo3513o()
            te3.cg r3 = r3.getBizInfo()
            if (r3 == 0) goto L_0x0067
            java.lang.String r3 = r3.f182468d
            r13 = r3
            goto L_0x0068
        L_0x0067:
            r13 = r10
        L_0x0068:
            r14 = 0
            r15 = 0
            r16 = 12
            r17 = 0
            r11 = r2
            boolean r3 = fe1.C58961d.C58963b.m68836h(r11, r12, r13, r14, r15, r16, r17)
            if (r3 != 0) goto L_0x00ae
            bl3.r r3 = bl3.C39818r.f106831a
            android.content.Context r4 = r7.f173499A
            gy3.C87412m.m108593f(r4, r1)
            bl3.r$a r3 = r3.mo62443b(r4)
            java.lang.Class<rs1.s8> r4 = rs1.C13442s8.class
            androidx.lifecycle.i0 r3 = r3.mo75002a(r4)
            rs1.s8 r3 = (rs1.C13442s8) r3
            te3.hj1 r13 = r3.mo12861q3()
            cm1.m0 r11 = cm1.C0751m0.f1769a
            android.content.Context r12 = r7.f173499A
            gy3.C87412m.m108593f(r12, r1)
            r15 = 1
            r16 = 1
            r17 = 22
            r14 = r0
            r11.mo706a(r12, r13, r14, r15, r16, r17)
            fe1.q r0 = r0.mo3507l()
            if (r0 == 0) goto L_0x00a7
            java.lang.String r0 = r0.getUsername()
            goto L_0x00a9
        L_0x00a7:
            java.lang.String r0 = ""
        L_0x00a9:
            int r3 = fe1.C58969q.f168707c2
            r2.mo84161i(r0, r3)
        L_0x00ae:
            int r0 = r19.mo17363j()
            if (r0 != 0) goto L_0x00d3
            bl3.r r0 = bl3.C39818r.f106831a
            android.content.Context r2 = r7.f173499A
            gy3.C87412m.m108593f(r2, r1)
            bl3.r$a r0 = r0.mo62443b(r2)
            java.lang.Class<iq1.d> r1 = iq1.C60593d.class
            androidx.lifecycle.i0 r0 = r0.mo75002a(r1)
            iq1.d r0 = (iq1.C60593d) r0
            iq1.c r0 = r0.f172693f
            if (r0 == 0) goto L_0x00d3
            r0.mo85549a()
            java.lang.String r1 = "follow"
            r0.mo85550b(r1)
        L_0x00d3:
            r11 = r18
            goto L_0x0106
        L_0x00d6:
            if (r0 != 0) goto L_0x00df
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.f34852z = r0
        L_0x00df:
            pf1.p r0 = r8.f34832f
            boolean r2 = r0 instanceof pf1.C11906j
            if (r2 == 0) goto L_0x00e8
            pf1.j r0 = (pf1.C11906j) r0
            goto L_0x00e9
        L_0x00e8:
            r0 = r10
        L_0x00e9:
            if (r0 == 0) goto L_0x00d3
            android.content.Context r2 = r7.f173499A
            gy3.C87412m.m108593f(r2, r1)
            java.lang.String r3 = r0.f34784g
            java.lang.String r0 = r0.f34785h
            java.lang.String r4 = r8.f34833g
            r11 = r18
            java.lang.String r0 = r11.mo11798v(r2, r3, r0, r4)
            pf1.d0 r2 = pf1.C62262d0.f176978a
            android.content.Context r3 = r7.f173499A
            gy3.C87412m.m108593f(r3, r1)
            r2.mo87321l(r3, r8, r0, r7)
        L_0x0106:
            pf1.p r0 = r8.f34832f
            boolean r1 = r0 instanceof pf1.C11906j
            if (r1 == 0) goto L_0x0110
            pf1.j r0 = (pf1.C11906j) r0
            r4 = r0
            goto L_0x0111
        L_0x0110:
            r4 = r10
        L_0x0111:
            if (r4 == 0) goto L_0x0125
            int r5 = com.tencent.p014mm.view.TouchableLayout.f24959d
            int r6 = com.tencent.p014mm.view.TouchableLayout.f24960e
            java.lang.String r10 = r8.f34833g
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r7 = r10
            r0.mo11781x(r1, r2, r3, r4, r5, r6, r7)
        L_0x0125:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pf1.C11908k.mo11775r(jq3.o, android.view.View, pf1.q):void");
    }

    /* renamed from: t */
    public boolean mo11795t() {
        return true;
    }

    /* renamed from: u */
    public void mo11780u() {
    }

    /* renamed from: v */
    public final String mo11798v(Context context, String str, String str2, String str3) {
        CharSequence charSequence;
        CharSequence charSequence2;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str2, "uxInfo");
        String encode = URLEncoder.encode(str2, "UTF-8");
        int E = str != null ? C112550d0.m153769E(str, "#", 0, false, 6, (Object) null) : -1;
        C37521f fVar = C37521f.f99374d;
        fVar.getClass();
        C35464c<Integer> cVar = C37521f.f99182G8;
        CharSequence charSequence3 = "";
        int i = 1;
        boolean z = false;
        if (cVar.mo60266n().intValue() != 1 || E <= 0) {
            charSequence = str;
        } else if (str == null || (charSequence = str.subSequence(0, E)) == null) {
            charSequence = charSequence3;
        }
        fVar.getClass();
        if (cVar.mo60266n().intValue() != 1 || E <= 0 || str == null || (charSequence2 = str.subSequence(E, str.length())) == null) {
            charSequence2 = charSequence3;
        }
        String str4 = null;
        if (!(charSequence == null || charSequence.length() == 0)) {
            if (!C112550d0.m153803w(charSequence, "?", false, 2, (Object) null)) {
                StringBuilder sb = new StringBuilder();
                sb.append(charSequence);
                sb.append('?');
                charSequence3 = sb.toString();
            } else if (C112550d0.m153805y(charSequence, "?", false, 2, (Object) null) || C112550d0.m153805y(charSequence, "&", false, 2, (Object) null)) {
                charSequence3 = charSequence;
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(charSequence);
                sb4.append('&');
                charSequence3 = sb4.toString();
            }
        }
        String str5 = charSequence3 + "uxinfo=" + encode;
        C13442s8 f = C13442s8.f38060Q0.mo12873f(context);
        if (f != null) {
            str4 = f.mo12861q3().f134671e;
        }
        if (str4 == null || str4.length() == 0) {
            z = true;
        }
        if (!z) {
            str5 = str5 + "&context_id=" + str4;
        }
        if (C87412m.m108589b(FFmpegMetadataRetriever.METADATA_KEY_COMMENT, str3)) {
            i = 2;
        } else if (C87412m.m108589b("TWO_FLOW", str3)) {
            i = 4;
        }
        String str6 = (str5 + "&pos=" + i) + charSequence2;
        Log.m105924i("FinderAdBaseJumperEventHandler", "loadUrl: " + str6);
        return str6;
    }

    /* renamed from: w */
    public final void mo11799w(String str, long j, C11906j jVar) {
        C87412m.m108594g(str, "action");
        C87412m.m108594g(jVar, XWalkPlugin.PRIVATE_CACHE_DIR_NAME);
        Log.m105924i("FinderAdBaseJumperEventHandler", str + " feedId:" + C61926c.m72691p(j) + ", title:" + jVar.f34818a + ", desc:" + jVar.f34819b + ", iconUrl:" + jVar.f34820c + ", aid:" + jVar.f34786i + ", posId:" + jVar.f34787j + ", canvasId:" + jVar.f34788k + ", uxinfo:" + jVar.f34785h);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0024, code lost:
        r4 = r4.mo3513o();
     */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo11781x(jq3.C60905o r20, android.view.View r21, pf1.C11920q r22, pf1.C11906j r23, int r24, int r25, java.lang.String r26) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r22
            r3 = r23
            java.lang.String r4 = "holder"
            gy3.C87412m.m108594g(r1, r4)
            java.lang.String r4 = "jumpView"
            r5 = r21
            gy3.C87412m.m108594g(r5, r4)
            java.lang.String r4 = "infoEx"
            gy3.C87412m.m108594g(r2, r4)
            java.lang.String r4 = "cache"
            gy3.C87412m.m108594g(r3, r4)
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r4 = r2.f34830d
            r6 = 0
            if (r4 == 0) goto L_0x0030
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r4.mo3513o()
            if (r4 == 0) goto L_0x0030
            long r8 = r4.getId()
            r11 = r8
            goto L_0x0031
        L_0x0030:
            r11 = r6
        L_0x0031:
            java.lang.String r4 = "reportClick"
            r0.mo11799w(r4, r11, r3)
            r4 = 2131302685(0x7f09191d, float:1.8223463E38)
            android.view.View r1 = r1.mo85812D(r4)
            com.tencent.mm.plugin.finder.video.FinderVideoLayout r1 = (com.tencent.p014mm.plugin.finder.video.FinderVideoLayout) r1
            if (r1 == 0) goto L_0x0045
            long r6 = r1.getCurrentPosMs()
        L_0x0045:
            r4 = 1000(0x3e8, float:1.401E-42)
            long r8 = (long) r4
            long r6 = r6 / r8
            int r4 = (int) r6
            r6 = 0
            if (r1 == 0) goto L_0x0054
            int r1 = r1.getVideoDurationSec()
            r16 = r1
            goto L_0x0056
        L_0x0054:
            r16 = 0
        L_0x0056:
            boolean r1 = r0.f34770g
            if (r1 == 0) goto L_0x005d
            r15 = r16
            goto L_0x005e
        L_0x005d:
            r15 = r4
        L_0x005e:
            java.lang.Class<dp1.y0> r1 = dp1.C58417y0.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            r10 = r1
            dp1.y0 r10 = (dp1.C58417y0) r10
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r1 = r2.f34827a
            int r2 = r1.ext_type
            r4 = 2
            r7 = 1
            if (r2 == r7) goto L_0x007d
            if (r2 == r4) goto L_0x0073
            r13 = 0
            goto L_0x007e
        L_0x0073:
            int r1 = r1.jumpinfo_type
            r2 = 7
            if (r1 != r2) goto L_0x007b
            r1 = 3
            r13 = 3
            goto L_0x007e
        L_0x007b:
            r13 = 2
            goto L_0x007e
        L_0x007d:
            r13 = 1
        L_0x007e:
            r14 = 2
            c30.g r1 = new c30.g
            r1.<init>()
            java.lang.String r2 = r3.f34785h
            java.lang.String r3 = "uxinfo"
            r1.put(r3, r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "getUxInfo(cache).toString()"
            gy3.C87412m.m108593f(r1, r2)
            rs1.s8$a r2 = rs1.C13442s8.f38060Q0
            android.content.Context r3 = r21.getContext()
            java.lang.String r4 = "jumpView.context"
            gy3.C87412m.m108593f(r3, r4)
            rs1.s8 r2 = r2.mo12873f(r3)
            if (r2 == 0) goto L_0x00ab
            te3.hj1 r2 = r2.mo12861q3()
            goto L_0x00ac
        L_0x00ab:
            r2 = 0
        L_0x00ac:
            r18 = r2
            r17 = r1
            r10.Gy0(r11, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pf1.C11908k.mo11781x(jq3.o, android.view.View, pf1.q, pf1.j, int, int, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x001f, code lost:
        r3 = r3.mo3513o();
     */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo11782y(jq3.C60905o r15, android.view.View r16, pf1.C11920q r17, pf1.C11906j r18, java.lang.String r19) {
        /*
            r14 = this;
            r0 = r15
            r1 = r17
            r2 = r18
            java.lang.String r3 = "holder"
            gy3.C87412m.m108594g(r15, r3)
            java.lang.String r3 = "jumpView"
            r4 = r16
            gy3.C87412m.m108594g(r4, r3)
            java.lang.String r3 = "infoEx"
            gy3.C87412m.m108594g(r1, r3)
            java.lang.String r3 = "cache"
            gy3.C87412m.m108594g(r2, r3)
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = r1.f34830d
            if (r3 == 0) goto L_0x002a
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r3.mo3513o()
            if (r3 == 0) goto L_0x002a
            long r3 = r3.getId()
            goto L_0x002c
        L_0x002a:
            r3 = 0
        L_0x002c:
            r6 = r3
            java.lang.String r3 = "reportExpose"
            r4 = r14
            r14.mo11799w(r3, r6, r2)
            java.lang.Class<dp1.y0> r3 = dp1.C58417y0.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            r5 = r3
            dp1.y0 r5 = (dp1.C58417y0) r5
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r1 = r1.f34827a
            int r3 = r1.ext_type
            r8 = 2
            r9 = 1
            if (r3 == r9) goto L_0x0051
            if (r3 == r8) goto L_0x0049
            r1 = 0
            r8 = 0
            goto L_0x0052
        L_0x0049:
            int r1 = r1.jumpinfo_type
            r3 = 7
            if (r1 != r3) goto L_0x0052
            r1 = 3
            r8 = 3
            goto L_0x0052
        L_0x0051:
            r8 = 1
        L_0x0052:
            r9 = 1
            r10 = 0
            r11 = 0
            c30.g r1 = new c30.g
            r1.<init>()
            java.lang.String r2 = r2.f34785h
            java.lang.String r3 = "uxinfo"
            r1.put(r3, r2)
            java.lang.String r12 = r1.toString()
            java.lang.String r1 = "getUxInfo(cache).toString()"
            gy3.C87412m.m108593f(r12, r1)
            rs1.s8$a r1 = rs1.C13442s8.f38060Q0
            android.content.Context r0 = r0.f173499A
            java.lang.String r2 = "holder.context"
            gy3.C87412m.m108593f(r0, r2)
            rs1.s8 r0 = r1.mo12873f(r0)
            if (r0 == 0) goto L_0x007f
            te3.hj1 r0 = r0.mo12861q3()
            goto L_0x0080
        L_0x007f:
            r0 = 0
        L_0x0080:
            r13 = r0
            r5.Gy0(r6, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pf1.C11908k.mo11782y(jq3.o, android.view.View, pf1.q, pf1.j, java.lang.String):void");
    }
}
