package ap1;

import ak1.C54116w;
import al1.C54127h;
import android.os.SystemClock;
import androidx.fragment.app.Fragment;
import bl3.C54492n;
import bp1.C54519d;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.replay.shopping.FinderLiveShoppingReplayPluginLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fj1.C45795b;
import gy3.C87412m;
import java.util.Iterator;
import java.util.LinkedList;
import np1.C61866i0;
import org.json.JSONObject;
import pe3.C89349b;
import rx3.C13598b0;
import te3.C64370fp1;
import te3.C64688rq1;
import te3.C64859yk1;
import te3.z44;

/* renamed from: ap1.f */
public final class C54286f extends UIComponent {

    /* renamed from: d */
    public C64859yk1 f152372d;

    /* renamed from: e */
    public FinderLiveShoppingReplayPluginLayout f152373e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54286f(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }

    /* renamed from: c3 */
    public static final void m61015c3(C54127h hVar, String str, C64859yk1 yk12) {
        T t;
        C64688rq1 rq12;
        C89349b bVar;
        boolean z;
        Class cls = C54519d.class;
        C54116w wVar = (C54116w) C86312j.m106911c(C54116w.class);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", 1008);
        jSONObject.put("sessionid", yk12.f186573n);
        jSONObject.put("productid", str);
        C64370fp1 fp12 = yk12.f186570h;
        String str2 = null;
        if (fp12 != null) {
            jSONObject.put("seckill", C61866i0.f175909a.mo86803p(fp12) ? 1 : 0);
            LinkedList<z44> linkedList = fp12.f183165J;
            C87412m.m108593f(linkedList, "this.show_box_items");
            Iterator<T> it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (((z44) t).f186625d == 4) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            z44 z44 = (z44) t;
            if (z44 == null || (bVar = z44.f186626e) == null) {
                rq12 = null;
            } else {
                rq12 = new C64688rq1();
                rq12.parseFrom(bVar.mo123703f());
            }
            if (rq12 != null) {
                jSONObject.put("buyer", rq12.f185233e);
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("entrance", yk12.f186572j);
        C13598b0 b0Var = C13598b0.f38549a;
        C64370fp1 fp13 = yk12.f186570h;
        if (fp13 != null) {
            str2 = fp13.f183193x;
        }
        wVar.Ux0(jSONObject, jSONObject2, str2);
        ((C54519d) hVar.f151978e.mo71262a(cls)).f152847g = SystemClock.elapsedRealtime();
        C54519d.C54521b g3 = ((C54519d) hVar.f151978e.mo71262a(cls)).mo75374g3();
        String str3 = yk12.f186573n;
        String str4 = "";
        if (str3 == null) {
            str3 = str4;
        }
        g3.getClass();
        g3.f152864a = str3;
        String str5 = yk12.f186572j;
        if (str5 != null) {
            str4 = str5;
        }
        g3.f152866c = str4;
        C87412m.m108594g(str, "<set-?>");
        g3.f152865b = str;
        Log.m105924i(C54492n.TAG, "shoppingReport:" + g3);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f359754ak2;
    }

    /* JADX WARNING: type inference failed for: r2v22, types: [java.lang.Long] */
    /* JADX WARNING: type inference failed for: r2v26, types: [java.lang.Integer] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r13) {
        /*
            r12 = this;
            super.onCreate(r13)
            androidx.appcompat.app.AppCompatActivity r13 = r12.getActivity()
            boolean r13 = r13 instanceof com.tencent.p014mm.p136ui.MMActivity
            if (r13 == 0) goto L_0x001b
            androidx.appcompat.app.AppCompatActivity r13 = r12.getActivity()
            java.lang.String r0 = "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity"
            gy3.C87412m.m108592e(r13, r0)
            com.tencent.mm.ui.MMActivity r13 = (com.tencent.p014mm.p136ui.MMActivity) r13
            r0 = 8
            r13.setSelfNavigationBarVisible(r0)
        L_0x001b:
            androidx.appcompat.app.AppCompatActivity r13 = r12.getActivity()
            android.view.Window r13 = r13.getWindow()
            r0 = 2097280(0x200080, float:2.938915E-39)
            r13.addFlags(r0)
            androidx.appcompat.app.AppCompatActivity r13 = r12.getActivity()
            android.view.Window r13 = r13.getWindow()
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            r13.addFlags(r0)
            androidx.appcompat.app.AppCompatActivity r13 = r12.getActivity()
            android.view.Window r13 = r13.getWindow()
            r1 = 1024(0x400, float:1.435E-42)
            r13.clearFlags(r1)
            androidx.appcompat.app.AppCompatActivity r13 = r12.getActivity()
            android.view.Window r13 = r13.getWindow()
            r2 = 512(0x200, float:7.175E-43)
            r13.clearFlags(r2)
            androidx.appcompat.app.AppCompatActivity r13 = r12.getActivity()
            android.view.Window r13 = r13.getWindow()
            r13.clearFlags(r0)
            android.app.Activity r13 = r12.getContext()
            android.content.res.Resources r13 = r13.getResources()
            android.content.res.Configuration r13 = r13.getConfiguration()
            int r13 = r13.orientation
            r0 = 2
            if (r13 != r0) goto L_0x0089
            androidx.appcompat.app.AppCompatActivity r13 = r12.getActivity()
            android.view.Window r13 = r13.getWindow()
            android.view.View r13 = r13.getDecorView()
            r2 = 7942(0x1f06, float:1.1129E-41)
            r13.setSystemUiVisibility(r2)
            androidx.appcompat.app.AppCompatActivity r13 = r12.getActivity()
            android.view.Window r13 = r13.getWindow()
            r13.addFlags(r1)
            goto L_0x009a
        L_0x0089:
            androidx.appcompat.app.AppCompatActivity r13 = r12.getActivity()
            android.view.Window r13 = r13.getWindow()
            android.view.View r13 = r13.getDecorView()
            r1 = 1792(0x700, float:2.511E-42)
            r13.setSystemUiVisibility(r1)
        L_0x009a:
            androidx.appcompat.app.AppCompatActivity r13 = r12.getActivity()
            android.view.Window r13 = r13.getWindow()
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r13.addFlags(r1)
            androidx.appcompat.app.AppCompatActivity r13 = r12.getActivity()
            android.view.Window r13 = r13.getWindow()
            r1 = 0
            r13.setStatusBarColor(r1)
            androidx.appcompat.app.AppCompatActivity r13 = r12.getActivity()
            android.view.Window r13 = r13.getWindow()
            r13.setNavigationBarColor(r1)
            androidx.appcompat.app.AppCompatActivity r13 = r12.getActivity()
            android.view.Window r13 = r13.getWindow()
            r2 = -3
            r13.setFormat(r2)
            androidx.appcompat.app.AppCompatActivity r13 = r12.getActivity()
            android.view.Window r13 = r13.getWindow()
            r2 = 51
            r13.setSoftInputMode(r2)
            android.content.Intent r13 = r12.getIntent()
            java.lang.String r2 = "KEY_PARAMS_KEY_VALUE"
            byte[] r13 = r13.getByteArrayExtra(r2)
            r2 = 0
            if (r13 == 0) goto L_0x00ed
            te3.yk1 r3 = new te3.yk1
            r3.<init>()
            r3.parseFrom(r13)
            goto L_0x00ee
        L_0x00ed:
            r3 = r2
        L_0x00ee:
            r12.f152372d = r3
            r13 = 1
            if (r3 == 0) goto L_0x00f9
            int r4 = r3.f186567e
            if (r4 != r13) goto L_0x00f9
            r4 = 1
            goto L_0x00fa
        L_0x00f9:
            r4 = 0
        L_0x00fa:
            if (r4 != 0) goto L_0x012d
            ok1.e r13 = ok1.C62042e.f176370a
            androidx.appcompat.app.AppCompatActivity r0 = r12.getActivity()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "(Debug)回放状态("
            r1.append(r3)
            te3.yk1 r3 = r12.f152372d
            if (r3 == 0) goto L_0x0116
            int r2 = r3.f186567e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
        L_0x0116:
            r1.append(r2)
            java.lang.String r2 = ")错误！"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r13.mo87041S1(r0, r1)
            androidx.appcompat.app.AppCompatActivity r13 = r12.getActivity()
            r13.finish()
            return
        L_0x012d:
            if (r3 == 0) goto L_0x0132
            java.lang.String r3 = r3.f186568f
            goto L_0x0133
        L_0x0132:
            r3 = r2
        L_0x0133:
            if (r3 == 0) goto L_0x013e
            int r3 = r3.length()
            if (r3 != 0) goto L_0x013c
            goto L_0x013e
        L_0x013c:
            r3 = 0
            goto L_0x013f
        L_0x013e:
            r3 = 1
        L_0x013f:
            if (r3 == 0) goto L_0x0163
            ok1.e r3 = ok1.C62042e.f176370a
            androidx.appcompat.app.AppCompatActivity r4 = r12.getActivity()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "(Debug)回放url: "
            r5.append(r6)
            te3.yk1 r6 = r12.f152372d
            if (r6 == 0) goto L_0x0158
            java.lang.String r6 = r6.f186568f
            goto L_0x0159
        L_0x0158:
            r6 = r2
        L_0x0159:
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r3.mo87041S1(r4, r5)
        L_0x0163:
            com.tencent.mm.plugin.finder.replay.shopping.FinderLiveShoppingReplayPluginLayout r3 = new com.tencent.mm.plugin.finder.replay.shopping.FinderLiveShoppingReplayPluginLayout
            androidx.appcompat.app.AppCompatActivity r4 = r12.getActivity()
            r3.<init>(r4, r2)
            r12.f152373e = r3
            r3 = 2131313513(0x7f094369, float:1.8245425E38)
            android.view.View r3 = r12.findViewById(r3)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            com.tencent.mm.plugin.finder.replay.shopping.FinderLiveShoppingReplayPluginLayout r4 = r12.f152373e
            r3.addView(r4)
            java.lang.Class<cl1.u> r3 = cl1.C55001u.class
            java.lang.Class<cl1.h1> r4 = cl1.C54979h1.class
            java.lang.Class<bp1.d> r5 = bp1.C54519d.class
            te3.yk1 r6 = r12.f152372d
            if (r6 == 0) goto L_0x0325
            com.tencent.mm.protocal.protobuf.FinderObject r7 = r6.f186566d
            if (r7 != 0) goto L_0x018c
            r8 = r2
            goto L_0x0196
        L_0x018c:
            al1.h r8 = new al1.h
            r8.<init>((com.tencent.p014mm.protocal.protobuf.FinderObject) r7)
            sk1.a r9 = sk1.C63947a.f181274a
            r9.mo88734t(r8, r7, r0)
        L_0x0196:
            if (r8 == 0) goto L_0x0325
            fj1.b r0 = r8.f151978e
            androidx.lifecycle.i0 r0 = r0.mo71262a(r5)
            bp1.d r0 = (bp1.C54519d) r0
            com.tencent.mm.protocal.protobuf.FinderObject r7 = r6.f186566d
            if (r7 == 0) goto L_0x01af
            te3.c21 r7 = r7.liveInfo
            if (r7 == 0) goto L_0x01af
            te3.e71 r7 = r7.f182388Z
            if (r7 == 0) goto L_0x01af
            int r7 = r7.f182930f
            goto L_0x01b0
        L_0x01af:
            r7 = 0
        L_0x01b0:
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            r0.mo75363I3(r7, r9)
            gy3.f0 r0 = new gy3.f0
            r0.<init>()
            java.lang.String r7 = ""
            r0.f27484d = r7
            fj1.b r9 = r8.f151978e
            androidx.lifecycle.i0 r10 = r9.mo71262a(r4)
            cl1.h1 r10 = (cl1.C54979h1) r10
            r10.f154138j = r13
            androidx.lifecycle.i0 r13 = r9.mo71262a(r4)
            cl1.h1 r13 = (cl1.C54979h1) r13
            te3.fp1 r4 = r6.f186570h
            if (r4 == 0) goto L_0x02b0
            androidx.lifecycle.i0 r4 = r9.mo71262a(r3)
            cl1.u r4 = (cl1.C55001u) r4
            te3.f11 r9 = new te3.f11
            r9.<init>()
            je1.h2 r10 = je1.C46523h2.f125330a
            r11 = 6211(0x1843, float:8.703E-42)
            te3.ig0 r10 = r10.mo71859a(r11)
            r9.f133229d = r10
            long r10 = r4.f154416j
            r9.f133230e = r10
            te3.c21 r10 = r4.f154420q
            long r10 = r10.f182392d
            r9.f133231f = r10
            java.lang.String r4 = r4.f154423t
            r9.f133232g = r4
            te3.fp1 r4 = r6.f186570h
            if (r4 == 0) goto L_0x01fc
            long r10 = r4.f183176d
            goto L_0x01fe
        L_0x01fc:
            r10 = 0
        L_0x01fe:
            r9.f133233h = r10
            r4 = 1177(0x499, float:1.65E-42)
            r9.f133238p = r4
            ob0.b r4 = r9.mo73339b()
            nr3.e r4 = r4.mo9225i()
            ap1.e r9 = new ap1.e
            r9.<init>(r6, r8, r0)
            r4.mo123420E(r9)
            te3.fp1 r4 = r6.f186570h
            if (r4 == 0) goto L_0x021f
            te3.yh3 r4 = r4.f183160E
            if (r4 == 0) goto L_0x021f
            int r4 = r4.f186534f
            goto L_0x0220
        L_0x021f:
            r4 = 0
        L_0x0220:
            com.tencent.mm.protocal.protobuf.FinderObject r9 = r6.f186566d
            if (r9 == 0) goto L_0x022b
            te3.c21 r9 = r9.liveInfo
            if (r9 == 0) goto L_0x022b
            int r9 = r9.f182396h
            goto L_0x022c
        L_0x022b:
            r9 = 0
        L_0x022c:
            if (r4 <= r9) goto L_0x023b
            fj1.b r10 = r8.f151978e
            androidx.lifecycle.i0 r10 = r10.mo71262a(r5)
            bp1.d r10 = (bp1.C54519d) r10
            int r11 = r4 - r9
            r10.mo75365K3(r11)
        L_0x023b:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "initReplayStartOffset replayBeginTime:"
            r10.append(r11)
            r10.append(r4)
            java.lang.String r4 = ",liveStartTime:"
            r10.append(r4)
            r10.append(r9)
            java.lang.String r4 = ",replayStartOffset"
            r10.append(r4)
            fj1.b r4 = r8.f151978e
            androidx.lifecycle.i0 r4 = r4.mo71262a(r5)
            bp1.d r4 = (bp1.C54519d) r4
            int r4 = r4.f152849i
            r10.append(r4)
            java.lang.String r4 = ",replayId:"
            r10.append(r4)
            long r4 = r6.f186569g
            java.lang.String r4 = o40.C61926c.m72691p(r4)
            r10.append(r4)
            java.lang.String r4 = ",product_id:"
            r10.append(r4)
            te3.fp1 r4 = r6.f186570h
            if (r4 == 0) goto L_0x027f
            long r4 = r4.f183176d
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
        L_0x027f:
            r10.append(r2)
            java.lang.String r2 = r10.toString()
            java.lang.String r4 = "SimpleUIComponent"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r2)
            te3.fp1 r2 = r6.f186570h
            if (r2 == 0) goto L_0x029b
            long r4 = r2.f183176d
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            java.lang.String r2 = r2.toString()
            if (r2 != 0) goto L_0x029c
        L_0x029b:
            r2 = r7
        L_0x029c:
            r0.f27484d = r2
            sk1.x r2 = new sk1.x
            te3.fp1 r4 = r6.f186570h
            gy3.C87412m.m108591d(r4)
            r2.<init>(r4)
            java.lang.String r4 = r6.f186574o
            if (r4 != 0) goto L_0x02ad
            r4 = r7
        L_0x02ad:
            r2.f181293f = r4
            goto L_0x02c5
        L_0x02b0:
            te3.uk1 r4 = r6.f186571i
            if (r4 == 0) goto L_0x02c5
            java.lang.String r2 = r4.f142893d
            if (r2 != 0) goto L_0x02b9
            r2 = r7
        L_0x02b9:
            r0.f27484d = r2
            sk1.v r2 = new sk1.v
            te3.uk1 r4 = r6.f186571i
            gy3.C87412m.m108591d(r4)
            r2.<init>(r4)
        L_0x02c5:
            r13.mo75948o3(r2)
            fj1.b r13 = r8.f151978e
            androidx.lifecycle.i0 r13 = r13.mo71262a(r3)
            cl1.u r13 = (cl1.C55001u) r13
            te3.c21 r13 = r13.f154420q
            java.lang.String r2 = r6.f186568f
            if (r2 != 0) goto L_0x02d7
            goto L_0x02d8
        L_0x02d7:
            r7 = r2
        L_0x02d8:
            r13.f182364J = r7
            com.tencent.mm.plugin.finder.replay.shopping.FinderLiveShoppingReplayPluginLayout r13 = r12.f152373e
            if (r13 == 0) goto L_0x02e1
            r13.bindData(r8)
        L_0x02e1:
            com.tencent.mm.plugin.finder.replay.shopping.FinderLiveShoppingReplayPluginLayout r13 = r12.f152373e
            if (r13 == 0) goto L_0x02ff
            fj1.b r13 = r13.getBuContext()
            if (r13 == 0) goto L_0x02ff
            vo1.a0$b r2 = vo1.C65770a0.f189184r
            vo1.a0 r2 = r2.mo89819a()
            yo1.a r3 = new yo1.a
            r3.<init>()
            r3.f191724a = r1
            r3.f191725b = r1
            rx3.b0 r4 = rx3.C13598b0.f38549a
            r2.mo89814o(r13, r3)
        L_0x02ff:
            com.tencent.mm.plugin.finder.replay.shopping.FinderLiveShoppingReplayPluginLayout r13 = r12.f152373e
            if (r13 == 0) goto L_0x0306
            r13.mo78684l(r1)
        L_0x0306:
            com.tencent.mm.plugin.finder.replay.shopping.FinderLiveShoppingReplayPluginLayout r13 = r12.f152373e
            if (r13 == 0) goto L_0x030d
            r13.mount()
        L_0x030d:
            vo1.a0$b r13 = vo1.C65770a0.f189184r
            vo1.a0 r13 = r13.mo89819a()
            com.tencent.mm.plugin.finder.replay.shopping.FinderLiveShoppingReplayPluginLayout r1 = r12.f152373e
            ks3.l r2 = ks3.C61162l.ShopReplay
            r13.mo89815p(r1, r2)
            te3.fp1 r13 = r6.f186570h
            if (r13 != 0) goto L_0x0325
            T r13 = r0.f27484d
            java.lang.String r13 = (java.lang.String) r13
            m61015c3(r8, r13, r6)
        L_0x0325:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ap1.C54286f.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        C54127h data;
        C45795b bVar;
        C64370fp1 fp12;
        C64370fp1 fp13;
        T t;
        C64688rq1 rq12;
        C89349b bVar2;
        boolean z;
        FinderLiveShoppingReplayPluginLayout finderLiveShoppingReplayPluginLayout = this.f152373e;
        if (!(finderLiveShoppingReplayPluginLayout == null || (data = finderLiveShoppingReplayPluginLayout.getData()) == null || (bVar = data.f151978e) == null)) {
            C54519d dVar = (C54519d) bVar.mo71262a(C54519d.class);
            C54116w wVar = (C54116w) C86312j.m106911c(C54116w.class);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", 1009);
            jSONObject.put("sessionid", dVar.mo75374g3().f152864a);
            jSONObject.put("productid", dVar.mo75374g3().f152865b);
            C64859yk1 yk12 = this.f152372d;
            String str = null;
            if (!(yk12 == null || (fp13 = yk12.f186570h) == null)) {
                jSONObject.put("seckill", C61866i0.f175909a.mo86803p(fp13) ? 1 : 0);
                LinkedList<z44> linkedList = fp13.f183165J;
                C87412m.m108593f(linkedList, "this.show_box_items");
                Iterator<T> it = linkedList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (((z44) t).f186625d == 4) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        break;
                    }
                }
                z44 z44 = (z44) t;
                if (z44 == null || (bVar2 = z44.f186626e) == null) {
                    rq12 = null;
                } else {
                    rq12 = new C64688rq1();
                    rq12.parseFrom(bVar2.mo123703f());
                }
                if (rq12 != null) {
                    jSONObject.put("buyer", rq12.f185233e);
                }
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("during", SystemClock.elapsedRealtime() - dVar.f152847g);
            C13598b0 b0Var = C13598b0.f38549a;
            C64859yk1 yk13 = this.f152372d;
            if (!(yk13 == null || (fp12 = yk13.f186570h) == null)) {
                str = fp12.f183193x;
            }
            wVar.Ux0(jSONObject, jSONObject2, str);
        }
        FinderLiveShoppingReplayPluginLayout finderLiveShoppingReplayPluginLayout2 = this.f152373e;
        if (finderLiveShoppingReplayPluginLayout2 != null) {
            finderLiveShoppingReplayPluginLayout2.mo78685m();
        }
        FinderLiveShoppingReplayPluginLayout finderLiveShoppingReplayPluginLayout3 = this.f152373e;
        if (finderLiveShoppingReplayPluginLayout3 != null) {
            finderLiveShoppingReplayPluginLayout3.unMount();
        }
        super.onDestroy();
    }
}
