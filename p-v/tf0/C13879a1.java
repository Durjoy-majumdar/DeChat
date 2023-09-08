package tf0;

import android.content.Context;
import android.content.DialogInterface;
import android.text.Spannable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.C0120a0;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C54219z;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.plugin.appbrand.widget.C84943i;
import com.tencent.p014mm.plugin.finder.conv.FinderConvChooseTipsView;
import com.tencent.p014mm.plugin.finder.extension.reddot.C2458a;
import com.tencent.p014mm.plugin.finder.extension.reddot.C2479n0;
import com.tencent.p014mm.plugin.finder.extension.reddot.C2492u0;
import com.tencent.p014mm.plugin.finder.extension.reddot.DiscoveryFinderRedDotManager;
import com.tencent.p014mm.plugin.finder.extension.reddot.render.C18747a;
import com.tencent.p014mm.plugin.finder.extension.reddot.render.C2488e;
import com.tencent.p014mm.plugin.finder.extension.reddot.render.C41412c;
import com.tencent.p014mm.plugin.finder.p056ui.FinderSelfUI;
import com.tencent.p014mm.plugin.finder.profile.FlowLayoutManager;
import com.tencent.p014mm.plugin.finder.view.C4207x4;
import com.tencent.p014mm.plugin.finder.view.FinderBottomCustomDialogHelper;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.protocal.protobuf.FinderAuthInfo;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import di3.C86301e;
import ei3.C86522b;
import er1.C58739j4;
import er1.C58784w3;
import fy3.C32226l;
import gy3.C24560g0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C20999i5;
import ht1.C60162e2;
import ht1.C76243a5;
import ht1.C76244c4;
import ht1.C8797q5;
import if1.C60276a;
import java.util.List;
import java.util.Map;
import kg3.C76577a;
import oo1.C11614d0;
import rx3.C13598b0;
import sr1.C64161b;
import sx3.C110818d0;
import te3.C49712hj1;
import te3.C64258bf0;
import te3.C64284cg;
import te3.C64350ew2;
import te3.C64689rq2;
import up1.C14342g0;
import up1.C14348h0;
import up1.C14364t0;
import wp1.C66167g;
import yn1.C16055a;

@C86522b
/* renamed from: tf0.a1 */
public final class C13879a1 extends C86301e implements C76243a5 {

    /* renamed from: tf0.a1$a */
    public static final class C13880a extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ Context f39043d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13880a(Context context) {
            super(1);
            this.f39043d = context;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.Integer} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r10) {
            /*
                r9 = this;
                android.view.View r10 = (android.view.View) r10
                java.lang.String r0 = "it"
                gy3.C87412m.m108594g(r10, r0)
                r0 = 2131302530(0x7f091882, float:1.8223149E38)
                java.lang.Object r0 = r10.getTag(r0)
                boolean r1 = r0 instanceof java.lang.String
                r2 = 0
                if (r1 == 0) goto L_0x0016
                java.lang.String r0 = (java.lang.String) r0
                goto L_0x0017
            L_0x0016:
                r0 = r2
            L_0x0017:
                java.lang.String r1 = ""
                if (r0 != 0) goto L_0x001c
                r0 = r1
            L_0x001c:
                r3 = 2131302517(0x7f091875, float:1.8223122E38)
                java.lang.Object r3 = r10.getTag(r3)
                boolean r4 = r3 instanceof java.lang.String
                if (r4 == 0) goto L_0x002a
                java.lang.String r3 = (java.lang.String) r3
                goto L_0x002b
            L_0x002a:
                r3 = r2
            L_0x002b:
                if (r3 != 0) goto L_0x002e
                r3 = r1
            L_0x002e:
                r4 = 2131302529(0x7f091881, float:1.8223147E38)
                java.lang.Object r4 = r10.getTag(r4)
                boolean r5 = r4 instanceof java.lang.Boolean
                if (r5 == 0) goto L_0x003c
                java.lang.Boolean r4 = (java.lang.Boolean) r4
                goto L_0x003d
            L_0x003c:
                r4 = r2
            L_0x003d:
                r5 = 0
                if (r4 == 0) goto L_0x0045
                boolean r4 = r4.booleanValue()
                goto L_0x0046
            L_0x0045:
                r4 = 0
            L_0x0046:
                r6 = 2131302528(0x7f091880, float:1.8223145E38)
                java.lang.Object r6 = r10.getTag(r6)
                boolean r7 = r6 instanceof java.lang.Boolean
                if (r7 == 0) goto L_0x0054
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                goto L_0x0055
            L_0x0054:
                r6 = r2
            L_0x0055:
                if (r6 == 0) goto L_0x005c
                boolean r6 = r6.booleanValue()
                goto L_0x005d
            L_0x005c:
                r6 = 0
            L_0x005d:
                r7 = 2131302569(0x7f0918a9, float:1.8223228E38)
                java.lang.Object r10 = r10.getTag(r7)
                boolean r7 = r10 instanceof java.lang.Integer
                if (r7 == 0) goto L_0x006b
                r2 = r10
                java.lang.Integer r2 = (java.lang.Integer) r2
            L_0x006b:
                if (r2 == 0) goto L_0x0072
                int r10 = r2.intValue()
                goto L_0x0073
            L_0x0072:
                r10 = 0
            L_0x0073:
                r2 = 4
                r7 = 2
                if (r10 == r7) goto L_0x0092
                if (r10 == r2) goto L_0x0088
                r8 = 9
                if (r10 == r8) goto L_0x007e
                goto L_0x009b
            L_0x007e:
                android.content.Context r10 = r9.f39043d
                r1 = 2131829110(0x7f112176, float:1.929118E38)
                java.lang.String r1 = r10.getString(r1)
                goto L_0x009b
            L_0x0088:
                android.content.Context r10 = r9.f39043d
                r1 = 2131829111(0x7f112177, float:1.9291182E38)
                java.lang.String r1 = r10.getString(r1)
                goto L_0x009b
            L_0x0092:
                android.content.Context r10 = r9.f39043d
                r1 = 2131829108(0x7f112174, float:1.9291176E38)
                java.lang.String r1 = r10.getString(r1)
            L_0x009b:
                java.lang.String r10 = "when(mediaType) {\n      …e -> \"\"\n                }"
                gy3.C87412m.m108593f(r1, r10)
                if (r4 == 0) goto L_0x00bb
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                android.content.Context r4 = r9.f39043d
                r8 = 2131830034(0x7f112512, float:1.9293054E38)
                java.lang.String r4 = r4.getString(r8)
                r10.append(r4)
                r10.append(r1)
                java.lang.String r1 = r10.toString()
            L_0x00bb:
                android.content.Context r10 = r9.f39043d
                if (r6 == 0) goto L_0x00c3
                r4 = 2131826046(0x7f11157e, float:1.9284965E38)
                goto L_0x00c6
            L_0x00c3:
                r4 = 2131826045(0x7f11157d, float:1.9284963E38)
            L_0x00c6:
                java.lang.String r10 = r10.getString(r4)
                java.lang.String r4 = "if (isSelf) context.getS…tring.finder_action_like)"
                gy3.C87412m.m108593f(r10, r4)
                android.content.Context r4 = r9.f39043d
                r6 = 2131829642(0x7f11238a, float:1.9292259E38)
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r2[r5] = r1
                r1 = 1
                r2[r1] = r10
                r2[r7] = r0
                r10 = 3
                r2[r10] = r3
                java.lang.String r10 = r4.getString(r6, r2)
                java.lang.String r0 = "context.getString(com.te…n, likeCountStr, descStr)"
                gy3.C87412m.m108593f(r10, r0)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: tf0.C13879a1.C13880a.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: tf0.a1$b */
    public static final class C13881b extends C2492u0 {

        /* renamed from: e */
        public final /* synthetic */ C32226l<C2458a, C13598b0> f39044e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13881b(C32226l<? super C2458a, C13598b0> lVar) {
            super(false, 1, (C8480h) null);
            this.f39044e = lVar;
        }

        /* renamed from: a */
        public void mo2472a(C2479n0.C2480a aVar) {
            this.f39044e.invoke(aVar);
        }
    }

    public String C90() {
        return "FinderMsgContactStorage";
    }

    /* renamed from: Gc */
    public void mo13207Gc(C0125s sVar, C0120a0<C2458a> a0Var) {
        C87412m.m108594g(sVar, "owner");
        C87412m.m108594g(a0Var, "observer");
        C2479n0 n0Var = C2479n0.f12955a;
        C2479n0.f12962h.observe(sVar, a0Var);
    }

    public C18747a Hc0(Context context) {
        C87412m.m108594g(context, "context");
        return new C41412c(context, new C2488e(context));
    }

    /* renamed from: Hv */
    public C14364t0 mo13209Hv() {
        return new C14342g0();
    }

    /* renamed from: IJ */
    public String mo13210IJ() {
        return "findermessage006";
    }

    /* renamed from: J */
    public int mo13211J() {
        return C58739j4.f168176a.mo83673A();
    }

    public void Js0() {
        C2479n0 n0Var = C2479n0.f12955a;
        C54219z<C2479n0.C2480a> zVar = C2479n0.f12947D;
        zVar.postValue(zVar.getValue());
    }

    /* renamed from: Jy */
    public boolean mo13213Jy() {
        return C16055a.f43185a.mo14671a();
    }

    /* renamed from: Lv */
    public void mo13214Lv(C0125s sVar, C0120a0<C2458a> a0Var) {
        C87412m.m108594g(sVar, "owner");
        C87412m.m108594g(a0Var, "observer");
        C2479n0 n0Var = C2479n0.f12955a;
        C2479n0.f12957c.observe(sVar, a0Var);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0034 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void M10(java.lang.String r25) {
        /*
            r24 = this;
            r0 = r25
            java.lang.String r1 = "source"
            gy3.C87412m.m108594g(r0, r1)
            java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r1 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "removeNearbyEntryLiveShowInfo "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            java.lang.String r4 = "Finder.RedDotManager"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r2)
            di3.d r2 = di3.C86312j.m106911c(r1)
            com.tencent.mm.plugin.FinderCommonFeatureService r2 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r2
            com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager r2 = r2.Nt0()
            java.util.Set r2 = r2.mo77277q()
            java.util.HashSet r2 = (java.util.HashSet) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x0034:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0115
            java.lang.Object r5 = r2.next()
            com.tencent.mm.plugin.finder.extension.reddot.s0 r5 = (com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0) r5
            te3.xi1 r6 = r5.field_ctrInfo
            int r7 = r6.f144670e
            r8 = 1014(0x3f6, float:1.421E-42)
            java.lang.String r9 = "NearbyEntrance"
            r10 = 0
            r11 = 1
            if (r7 == r8) goto L_0x0077
            r8 = 1013(0x3f5, float:1.42E-42)
            if (r7 == r8) goto L_0x0077
            java.util.LinkedList<te3.nn1> r6 = r6.f144672g
            if (r6 == 0) goto L_0x0072
            java.util.Iterator r6 = r6.iterator()
        L_0x0058:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x006e
            java.lang.Object r7 = r6.next()
            r8 = r7
            te3.nn1 r8 = (te3.C64586nn1) r8
            java.lang.String r8 = r8.f184507i
            boolean r8 = gy3.C87412m.m108589b(r8, r9)
            if (r8 == 0) goto L_0x0058
            goto L_0x006f
        L_0x006e:
            r7 = r10
        L_0x006f:
            te3.nn1 r7 = (te3.C64586nn1) r7
            goto L_0x0073
        L_0x0072:
            r7 = r10
        L_0x0073:
            if (r7 == 0) goto L_0x0077
            r6 = 1
            goto L_0x0078
        L_0x0077:
            r6 = 0
        L_0x0078:
            if (r6 == 0) goto L_0x007b
            goto L_0x007c
        L_0x007b:
            r5 = r10
        L_0x007c:
            if (r5 == 0) goto L_0x0034
            te3.xi1 r6 = r5.field_ctrInfo
            java.util.LinkedList<te3.nn1> r6 = r6.f144672g
            if (r6 == 0) goto L_0x008e
            if1.c r7 = if1.C8886c.f28153d
            boolean r6 = o40.C61926c.m72675T(r6, r7)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r6)
        L_0x008e:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r3)
            r6.append(r0)
            java.lang.String r7 = "  result:"
            r6.append(r7)
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r6)
            te3.xi1 r6 = r5.field_ctrInfo
            java.util.LinkedList<te3.nn1> r6 = r6.f144672g
            if (r6 == 0) goto L_0x00e7
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r6 = r6.iterator()
        L_0x00b7:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x00d0
            java.lang.Object r8 = r6.next()
            r10 = r8
            te3.nn1 r10 = (te3.C64586nn1) r10
            java.lang.String r10 = r10.f184508j
            boolean r10 = gy3.C87412m.m108589b(r10, r9)
            if (r10 == 0) goto L_0x00b7
            r7.add(r8)
            goto L_0x00b7
        L_0x00d0:
            java.util.Iterator r6 = r7.iterator()
        L_0x00d4:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x00e7
            java.lang.Object r7 = r6.next()
            te3.nn1 r7 = (te3.C64586nn1) r7
            r7.f184506h = r11
            java.lang.String r8 = ""
            r7.f184508j = r8
            goto L_0x00d4
        L_0x00e7:
            te3.xi1 r13 = new te3.xi1
            r13.<init>()
            te3.xi1 r5 = r5.field_ctrInfo
            byte[] r5 = r5.toByteArray()
            r13.parseFrom(r5)
            di3.d r5 = di3.C86312j.m106911c(r1)
            com.tencent.mm.plugin.FinderCommonFeatureService r5 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r5
            com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager r12 = r5.Nt0()
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r22 = 252(0xfc, float:3.53E-43)
            r23 = 0
            java.lang.String r14 = "removeNearByEntranceShowInfo"
            ht1.C60152b4.C8759a.m8561a(r12, r13, r14, r15, r16, r17, r18, r19, r21, r22, r23)
            goto L_0x0034
        L_0x0115:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tf0.C13879a1.M10(java.lang.String):void");
    }

    /* renamed from: Na */
    public C8797q5 mo13216Na(String str, Context context, boolean z, C49712hj1 hj12, int i) {
        C87412m.m108594g(str, "anchorFinderUsername");
        C87412m.m108594g(context, "context");
        C87412m.m108594g(hj12, "contextObj");
        return new C11614d0(str, context, z, hj12, 0, 16, (C8480h) null);
    }

    /* renamed from: RA */
    public void mo13217RA(C0120a0<C2458a> a0Var) {
        C87412m.m108594g(a0Var, "observer");
        C2479n0 n0Var = C2479n0.f12955a;
        C2479n0.f12957c.removeObserver(a0Var);
    }

    /* renamed from: RK */
    public void mo13218RK(C0120a0<C2458a> a0Var) {
        C87412m.m108594g(a0Var, "observer");
        C2479n0 n0Var = C2479n0.f12955a;
        C2479n0.f12962h.removeObserver(a0Var);
    }

    /* renamed from: S3 */
    public void mo13219S3(TextView textView, Spannable spannable) {
        C87412m.m108594g(textView, "tv");
        C87412m.m108594g(spannable, MimeTypes.BASE_TYPE_TEXT);
        C58784w3.f168295a.mo83876I1(textView, spannable);
    }

    /* renamed from: SB */
    public void mo13220SB(C0125s sVar, C0120a0<C2458a> a0Var) {
        C87412m.m108594g(sVar, "owner");
        C87412m.m108594g(a0Var, "observer");
        C2479n0 n0Var = C2479n0.f12955a;
        C2479n0.f12951H.observe(sVar, a0Var);
    }

    public void Sb0(Context context, String str, String str2, DialogInterface.OnClickListener onClickListener) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        C87412m.m108594g(str2, "content");
        FinderBottomCustomDialogHelper.Companion.showOverSeaAgreeConfirmDiaglog(context, str, str2, onClickListener);
    }

    public float Sl0(List<? extends C64350ew2> list) {
        C87412m.m108594g(list, "list");
        C58784w3.f168295a.getClass();
        C64350ew2 ew22 = (C64350ew2) C110818d0.m150916N(list);
        if (ew22 == null) {
            return 0.75f;
        }
        for (C64350ew2 ew23 : list) {
            if ((ew22.f183042g * 1.0f) / ew22.f183041f < (ew23.f183042g * 1.0f) / ew23.f183041f) {
                ew22 = ew23;
            }
        }
        float f = (ew22.f183042g * 1.0f) / ew22.f183041f;
        if (Float.isNaN(f)) {
            return 1.1666666f;
        }
        return f;
    }

    /* renamed from: Tq */
    public String mo13223Tq(long j, Boolean bool, boolean z) {
        return C58739j4.f168176a.mo83723t(j, bool, z);
    }

    public String Tq0() {
        String h = C24560g0.m30725a(FinderSelfUI.class).mo51264h();
        return h == null ? "" : h;
    }

    public boolean U80() {
        return C66167g.f190173a.mo90233a();
    }

    public boolean Vh0() {
        return C58739j4.f168176a.mo83682K();
    }

    public String Vo0(C64258bf0 bf02) {
        C87412m.m108594g(bf02, "event");
        C58784w3 w3Var = C58784w3.f168295a;
        w3Var.getClass();
        if (TextUtils.isEmpty(bf02.f182282f) || !w3Var.mo83908W0(bf02.f182284h)) {
            return bf02.f182281e;
        }
        return MMApplicationContext.getContext().getString(C0966R.string.czo, new Object[]{bf02.f182282f, bf02.f182281e});
    }

    /* renamed from: X */
    public void mo13228X(ImageView imageView, FinderAuthInfo finderAuthInfo, int i, C64284cg cgVar) {
        C87412m.m108594g(imageView, "view");
        C58784w3.f168295a.mo83864D1(imageView, finderAuthInfo, i, cgVar);
    }

    /* renamed from: Xd */
    public void mo13229Xd(Exception exc, String str) {
        C87412m.m108594g(exc, "e");
        C87412m.m108594g(str, "extraMsg");
        C58739j4.f168176a.mo83712h0(exc, str);
    }

    public Map<String, Object> Yo0() {
        return C58784w3.f168295a.mo83877J();
    }

    /* renamed from: Zj */
    public void mo13231Zj(C0125s sVar, C0120a0<C2458a> a0Var) {
        C87412m.m108594g(sVar, "owner");
        C87412m.m108594g(a0Var, "observer");
        C2479n0 n0Var = C2479n0.f12955a;
        C54219z<C2479n0.C2480a> zVar = C2479n0.f12946C;
        zVar.observe(sVar, a0Var);
        C2479n0.C2480a value = zVar.getValue();
        if (value != null) {
            a0Var.onChanged(value);
        }
    }

    public void b80(String str, String str2) {
        C87412m.m108594g(str, "path");
        C87412m.m108594g(str2, "username");
        C2479n0.f12955a.mo2447b(str, str2);
    }

    public void br0(Context context, MMBaseAccessibilityConfig mMBaseAccessibilityConfig) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(mMBaseAccessibilityConfig, "config");
        mMBaseAccessibilityConfig.root(C0966R.C0970id.i5j).view(C0966R.C0970id.i5j).desc((C32226l<? super View, String>) new C13880a(context));
    }

    /* renamed from: cB */
    public String mo13234cB(int i) {
        return C58739j4.f168176a.mo83699a0(i);
    }

    /* renamed from: dN */
    public void mo13235dN(String str) {
        C87412m.m108594g(str, FirebaseAnalytics.C113379b.SOURCE);
        C60276a.f171840a.mo85253b(str);
    }

    public View da0(Context context) {
        C87412m.m108594g(context, "context");
        return new FinderConvChooseTipsView(context);
    }

    /* renamed from: eU */
    public void mo13237eU(C0125s sVar, C0120a0<C2458a> a0Var) {
        C87412m.m108594g(sVar, "owner");
        C87412m.m108594g(a0Var, "observer");
        C2479n0 n0Var = C2479n0.f12955a;
        C54219z<C2479n0.C2480a> zVar = C2479n0.f12947D;
        zVar.observe(sVar, a0Var);
        C2479n0.C2480a value = zVar.getValue();
        if (value != null) {
            a0Var.onChanged(value);
        }
    }

    /* renamed from: gc */
    public C60162e2.C60163a<C60162e2.C60164b> mo13238gc(List<? extends C64689rq2> list, boolean z) {
        C87412m.m108594g(list, "mediaList");
        return new C64161b(list, z);
    }

    /* renamed from: iX */
    public C76244c4 mo13239iX() {
        return new DiscoveryFinderRedDotManager();
    }

    /* renamed from: jb */
    public C0120a0<C2458a> mo13240jb(C32226l<? super C2458a, C13598b0> lVar) {
        C87412m.m108594g(lVar, "onChange");
        return new C13881b(lVar);
    }

    /* renamed from: je */
    public void mo13241je() {
        C2479n0 n0Var = C2479n0.f12955a;
        C54219z<C2479n0.C2480a> zVar = C2479n0.f12946C;
        zVar.postValue(zVar.getValue());
    }

    /* renamed from: lh */
    public boolean mo13242lh() {
        return C58784w3.f168295a.mo83983z0();
    }

    /* renamed from: oc */
    public void mo13243oc(C0120a0<C2458a> a0Var) {
        C87412m.m108594g(a0Var, "observer");
        C2479n0 n0Var = C2479n0.f12955a;
        C2479n0.C2480a value = C2479n0.f12957c.getValue();
        if (value != null) {
            a0Var.onChanged(value);
        }
    }

    public void tc0(C0120a0<C2458a> a0Var) {
        C87412m.m108594g(a0Var, "observer");
        C2479n0 n0Var = C2479n0.f12955a;
        C2479n0.C2480a value = C2479n0.f12951H.getValue();
        if (value != null) {
            a0Var.onChanged(value);
        }
    }

    public Class<? extends C84943i> uj0() {
        return C4207x4.class;
    }

    public C20999i5 v00() {
        return new FlowLayoutManager();
    }

    /* renamed from: y9 */
    public void mo13247y9(TextView textView, boolean z) {
        C87412m.m108594g(textView, "tv");
        C58739j4.f168176a.mo83703c0(textView, z);
    }

    /* renamed from: yq */
    public C14364t0 mo13248yq() {
        return new C14348h0();
    }

    /* renamed from: zm */
    public int mo13249zm(Context context, int i) {
        float f;
        float f2;
        C87412m.m108594g(context, "context");
        C58784w3.f168295a.getClass();
        if (Float.compare(C76577a.m92165p(context), C76577a.m92174y(context)) > 0) {
            if (i < 10) {
                f2 = context.getResources().getDimension(C0966R.dimen.f3738cr);
            } else {
                f = context.getResources().getDimension(C0966R.dimen.auz);
                return ((int) f) * 2;
            }
        } else if (i < 10) {
            f2 = context.getResources().getDimension(C0966R.dimen.a6l);
        } else {
            f = context.getResources().getDimension(C0966R.dimen.f4305jx);
            return ((int) f) * 2;
        }
        return (int) f2;
    }
}
