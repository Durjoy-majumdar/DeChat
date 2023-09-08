package tf0;

import a14.C53872d1;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import android.content.Context;
import android.content.Intent;
import bp3.C104160f;
import bp3.C54526i;
import bp3.C79758p;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.mmdata.rpt.ImageQueryTecLogStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C57593a4;
import com.tencent.p014mm.storage.C57605x3;
import com.tencent.p014mm.storage.C57607y3;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.view.activity.ImageQueryMainUI;
import di3.C86301e;
import di3.C86312j;
import eb0.C75592q0;
import ei3.C86522b;
import f40.C86709a0;
import f62.C75700k0;
import g62.C32330n;
import gy3.C87412m;
import h81.C32735h;
import ig3.C60280b;
import ig3.C60282d;
import ig3.C60283e;
import j20.C117292a;
import k20.C9556a;
import p157gk.C59481e;
import p157gk.C59490i;
import p157gk.C59491j;
import p157gk.C59492k;
import p157gk.C59503r;
import p248ug.C102029k0;
import p248ug.C65347o0;
import tc0.C77885p;
import te3.C64266br1;
import wx3.C15601d;
import wx3.C66212f;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: tf0.t1 */
public final class C64920t1 extends C86301e implements C65347o0 {
    public void A40() {
        Log.m105924i("MicroMsg.ImageQueryPlugin", "stopPreIdentify");
        C59481e eVar = C59491j.f169998c;
        if (eVar != null) {
            Log.m105924i("MicroMsg.ImageDataManager", "stopIdentify");
            C53895h.m60466d(C53930o0.m60555b(), (C66212f) null, (C53934p0) null, new C59490i(eVar, (C15601d<? super C59490i>) null), 3, (Object) null);
        }
    }

    /* renamed from: HR */
    public void mo89071HR(String str, long j) {
        boolean z;
        C87412m.m108594g(str, "roomId");
        Log.m105924i("MicroMsg.ImageQueryPlugin", "deleteImageStorage >> rooId: " + str + ", msgId: " + j);
        C54526i iVar = C54526i.f152882a;
        if (!iVar.mo75389a() || !iVar.mo75390b()) {
            Log.m105924i("MicroMsg.ImageQueryDataModel", "checkInitDB >> entrance is close");
            z = false;
        } else {
            if (C59491j.f169998c == null) {
                C59491j.f169998c = new C59481e();
                C57593a4.f164912a.mo81936a();
            }
            z = true;
        }
        if (z) {
            Log.m105924i("MicroMsg.ImageQueryStorage", "deleteImage >> msgId: " + j + ", talker: " + str);
            C53895h.m60466d(C53930o0.m60555b(), C53872d1.f151119c, (C53934p0) null, new C57605x3(j, str, (C15601d<? super C57605x3>) null), 2, (Object) null);
        }
    }

    public boolean Iq0() {
        boolean z = (C75592q0.m90780j() & 1) != 0;
        Log.m105924i("MicroMsg.ImageQueryEntranceConfig", "getC2CImageQuerySettingState: " + z);
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00b4, code lost:
        if (r8 == null) goto L_0x00b6;
     */
    /* renamed from: Kc */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList<android.util.Pair<java.lang.String, java.util.ArrayList<java.lang.String>>> mo89073Kc() {
        /*
            r14 = this;
            gk.b0 r0 = new gk.b0
            r0.<init>()
            java.lang.String r0 = p157gk.C59491j.f169997b
            java.lang.String r1 = "MicroMsg.SugListDataManager"
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r4 = 0
            c30.e r5 = new c30.e     // Catch:{ f -> 0x0046 }
            java.lang.String r6 = "[[12, 15], [14, 115], [13], [17], [2, 18], [4,27,28], [5], [6,80], [32, 223], [33], [7], [8, 89, 373, 446], [93, 403], [94, 414]]"
            r5.<init>((java.lang.String) r6)     // Catch:{ f -> 0x0046 }
            int r6 = r5.length()     // Catch:{ f -> 0x0046 }
            r7 = 0
        L_0x0020:
            if (r7 >= r6) goto L_0x004b
            c30.e r8 = r5.mo53807h(r7)     // Catch:{ f -> 0x0046 }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ f -> 0x0046 }
            r9.<init>()     // Catch:{ f -> 0x0046 }
            int r10 = r8.length()     // Catch:{ f -> 0x0046 }
            r11 = 0
        L_0x0030:
            if (r11 >= r10) goto L_0x0040
            int r12 = r8.getInt(r11)     // Catch:{ f -> 0x0046 }
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ f -> 0x0046 }
            r9.add(r12)     // Catch:{ f -> 0x0046 }
            int r11 = r11 + 1
            goto L_0x0030
        L_0x0040:
            r3.add(r9)     // Catch:{ f -> 0x0046 }
            int r7 = r7 + 1
            goto L_0x0020
        L_0x0046:
            java.lang.String r5 = "parse json error"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r5)
        L_0x004b:
            java.util.Iterator r3 = r3.iterator()
        L_0x004f:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x00d2
            java.lang.Object r5 = r3.next()
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            gk.r r6 = p157gk.C59503r.f170040a
            java.lang.Object r7 = r5.get(r4)
            java.lang.String r8 = "item[0]"
            gy3.C87412m.m108593f(r7, r8)
            java.lang.String r7 = (java.lang.String) r7
            int r7 = java.lang.Integer.parseInt(r7)
            r6.getClass()
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.LocaleUtil.getApplicationLanguage()
            ja3.a r8 = p157gk.C59503r.f170042c
            if (r8 == 0) goto L_0x00b9
            java.lang.String r9 = "lan"
            gy3.C87412m.m108593f(r6, r9)
            long r8 = r8.f173133a
            java.lang.String r10 = "MicroMsg.WeChatClsManager"
            r11 = 0
            int r13 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r13 != 0) goto L_0x008c
            java.lang.String r6 = "getLabelNameByLabelId >> weChatClsHandle no init"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r6)
            goto L_0x00b6
        L_0x008c:
            java.lang.String r8 = com.tencent.p014mm.xeffect.WeChatCls.nGetLabelnameByLabelid(r8, r7, r6)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "labelId: "
            r9.append(r11)
            r9.append(r7)
            java.lang.String r7 = " labelName: "
            r9.append(r7)
            r9.append(r8)
            java.lang.String r7 = ", lan: "
            r9.append(r7)
            r9.append(r6)
            java.lang.String r6 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r6)
            if (r8 != 0) goto L_0x00ba
        L_0x00b6:
            java.lang.String r8 = ""
            goto L_0x00ba
        L_0x00b9:
            r8 = 0
        L_0x00ba:
            if (r8 != 0) goto L_0x00bd
            goto L_0x00d2
        L_0x00bd:
            int r6 = r8.length()
            if (r6 <= 0) goto L_0x00c5
            r6 = 1
            goto L_0x00c6
        L_0x00c5:
            r6 = 0
        L_0x00c6:
            if (r6 == 0) goto L_0x004f
            android.util.Pair r6 = new android.util.Pair
            r6.<init>(r8, r5)
            r2.add(r6)
            goto L_0x004f
        L_0x00d2:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "result: "
            r3.append(r5)
            int r5 = r2.size()
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r3)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L_0x00f7
            goto L_0x01db
        L_0x00f7:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r5 = 0
        L_0x00fd:
            java.lang.String r6 = "labelList"
            r7 = 6
            if (r5 >= r7) goto L_0x0135
            java.lang.Object r7 = r2.get(r5)
            android.util.Pair r7 = (android.util.Pair) r7
            java.lang.Object r7 = r7.second
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            gy3.C87412m.m108593f(r7, r6)
            java.util.Iterator r6 = r7.iterator()
        L_0x0113:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0132
            java.lang.Object r7 = r6.next()
            java.lang.String r7 = (java.lang.String) r7
            com.tencent.mm.storage.a4 r8 = com.tencent.p014mm.storage.C57593a4.f164912a
            java.util.List r7 = r8.mo81940e(r7, r0)
            int r7 = r7.size()
            if (r7 <= 0) goto L_0x0113
            java.lang.Object r6 = r2.get(r5)
            r3.add(r6)
        L_0x0132:
            int r5 = r5 + 1
            goto L_0x00fd
        L_0x0135:
            r1.addAll(r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.TreeMap r5 = new java.util.TreeMap
            gk.a0<T> r8 = p157gk.C8326a0.f27285d
            r5.<init>(r8)
            int r8 = r2.size()
        L_0x0148:
            if (r7 >= r8) goto L_0x01aa
            java.lang.Object r9 = r2.get(r7)
            android.util.Pair r9 = (android.util.Pair) r9
            java.lang.Object r9 = r9.second
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            gy3.C87412m.m108593f(r9, r6)
            java.util.Iterator r9 = r9.iterator()
            r10 = 0
        L_0x015c:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x0174
            java.lang.Object r11 = r9.next()
            java.lang.String r11 = (java.lang.String) r11
            com.tencent.mm.storage.a4 r12 = com.tencent.p014mm.storage.C57593a4.f164912a
            java.util.List r11 = r12.mo81940e(r11, r0)
            int r11 = r11.size()
            int r10 = r10 + r11
            goto L_0x015c
        L_0x0174:
            if (r10 == 0) goto L_0x01a7
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)
            boolean r9 = r5.containsKey(r9)
            if (r9 == 0) goto L_0x0194
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)
            java.lang.Object r9 = r5.get(r9)
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            if (r9 == 0) goto L_0x01a7
            java.lang.Object r10 = r2.get(r7)
            r9.add(r10)
            goto L_0x01a7
        L_0x0194:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.lang.Object r11 = r2.get(r7)
            r10.add(r11)
            r5.put(r9, r10)
        L_0x01a7:
            int r7 = r7 + 1
            goto L_0x0148
        L_0x01aa:
            java.util.Set r0 = r5.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x01b2:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x01d8
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r2 = r2.getValue()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x01c8:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x01b2
            java.lang.Object r4 = r2.next()
            android.util.Pair r4 = (android.util.Pair) r4
            r3.add(r4)
            goto L_0x01c8
        L_0x01d8:
            r1.addAll(r3)
        L_0x01db:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tf0.C64920t1.mo89073Kc():java.util.ArrayList");
    }

    /* renamed from: NX */
    public void mo89074NX(int i) {
        C60282d dVar = C60282d.f171857a;
        int i2 = 1;
        boolean z = (C75592q0.m90780j() & 1) != 0;
        Log.m105924i("MicroMsg.ImageQueryEntranceConfig", "getC2CImageQuerySettingState: " + z);
        if (!(!z)) {
            i2 = 2;
        }
        C60282d.f171874r = i2;
        dVar.mo85265b(i);
    }

    /* renamed from: PH */
    public void mo89075PH() {
        Log.m105924i("MicroMsg.ImageQueryTecReporter", "restTecReporter");
        C60283e.f171900w = String.valueOf(System.currentTimeMillis());
        C60283e.f171879b = 0;
        C60283e.f171880c = "";
        C60283e.f171881d = "";
        C60283e.f171882e = 0;
        C60283e.f171883f = 0;
        C60283e.f171884g = 0;
        C60283e.f171885h = 0;
        C60283e.f171886i = 0;
        C60283e.f171887j = 0;
        C60283e.f171888k = 0;
        C60283e.f171889l = "";
        C60283e.f171890m = 0;
        C60283e.f171891n = 0;
        C60283e.f171892o = "";
        C60283e.f171893p = "";
        C60283e.f171894q = 0;
        C60283e.f171895r = "";
        C60283e.f171896s = 0;
        C60283e.f171897t = 0;
        C60283e.f171898u = 0;
        C60283e.f171899v = 0;
        C60283e.f171901x = "";
        Log.m105924i("MicroMsg.ImageQueryReporter", "resetReporter");
        C60282d.f171859c = "";
        C60282d.f171858b = "";
        C60282d.f171860d = 0;
        C60282d.f171862f = "";
        C60282d.f171863g = "";
        C60282d.f171864h = 0;
        C60282d.f171865i = 0;
        C60282d.f171866j = "";
        C60282d.f171867k = 0;
        C60282d.f171868l = 0;
        C60282d.f171869m = 0;
        C60282d.f171870n = 0;
        C60282d.f171871o = 2;
        C60282d.f171875s = 0;
        C60282d.f171876t = false;
        C60282d.f171877u = false;
        C60282d.f171872p = 0;
        C60282d.f171873q = 0;
        C60282d.f171874r = 0;
        Log.m105924i("MicroMsg.ImageQueryConsumeTimeReporter", "reset");
        C60280b.f171845b = 0;
        C60280b.f171846c = 0;
        C60280b.f171847d = 0;
        C60280b.f171848e = 0;
        C60280b.f171849f = 0;
        C60280b.f171850g = 0;
        C60280b.f171851h = 0;
        C60280b.f171852i = 0;
        C60280b.f171854k = 0;
        C60280b.f171853j = 0;
        C60280b.f171855l = false;
        C60282d.f171859c = String.valueOf(System.currentTimeMillis());
    }

    /* renamed from: QZ */
    public void mo89076QZ(boolean z) {
        long j = C75592q0.m90780j();
        Log.m105924i("MicroMsg.ImageQueryEntranceConfig", "switch image query change : open = " + z);
        long j2 = z ? j | 1 : j & -2;
        int i = z ? 1 : 2;
        C64266br1 br12 = new C64266br1();
        br12.f182324d = 75;
        br12.f182325e = i;
        ((C77885p) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96100XW()).mo107993q(new C32330n(23, br12));
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_EXT_STATUS2_LONG_SYNC, Long.valueOf(j2));
    }

    /* renamed from: gs */
    public void mo89077gs(String str) {
        C87412m.m108594g(str, "roomId");
        Log.m105924i("MicroMsg.ImageQueryPlugin", "checkPluginEnv");
        C59491j.f169997b = str;
        C54526i iVar = C54526i.f152882a;
        if (!iVar.mo75389a() || !iVar.mo75390b()) {
            Log.m105924i("MicroMsg.ImageQueryDataModel", "checkInitDB >> entrance is close");
        } else if (C59491j.f169998c == null) {
            C59491j.f169998c = new C59481e();
            C57593a4.f164912a.mo81936a();
        }
        C59503r.f170040a.mo84583d();
    }

    /* renamed from: iG */
    public void mo89078iG(String str) {
        boolean z;
        C87412m.m108594g(str, "chatRoomId");
        Log.m105924i("MicroMsg.ImageQueryPlugin", "deleteImageStorageByChatRoomId>>  roomId: " + str);
        C54526i iVar = C54526i.f152882a;
        if (!iVar.mo75389a() || !iVar.mo75390b()) {
            Log.m105924i("MicroMsg.ImageQueryDataModel", "checkInitDB >> entrance is close");
            z = false;
        } else {
            if (C59491j.f169998c == null) {
                C59491j.f169998c = new C59481e();
                C57593a4.f164912a.mo81936a();
            }
            z = true;
        }
        if (z) {
            Log.m105924i("MicroMsg.ImageQueryStorage", "deleteMsgRoom >> roomId: " + str);
            C53895h.m60466d(C53930o0.m60555b(), C53872d1.f151119c, (C53934p0) null, new C57607y3(str, (C15601d<? super C57607y3>) null), 2, (Object) null);
        }
    }

    /* renamed from: oA */
    public void mo89079oA(Context context, C102029k0 k0Var) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(k0Var, "platformOp");
        C59492k.f169999a = k0Var;
        String f = k0Var.mo137218f();
        C87412m.m108593f(f, "platformOp.currentRoomId");
        C59491j.f169997b = f;
        Intent intent = new Intent(context, ImageQueryMainUI.class);
        intent.putExtra("KEY_SUG_QUERY_TEXT", k0Var.mo137217e());
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/ImageQueryPlugin", "startImageQueryMainActivity", "(Landroid/content/Context;Lcom/tencent/mm/api/IImageQueryComposeOp;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/ImageQueryPlugin", "startImageQueryMainActivity", "(Landroid/content/Context;Lcom/tencent/mm/api/IImageQueryComposeOp;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: pf */
    public void mo89080pf(Context context, C102029k0 k0Var) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(k0Var, "platformOp");
        Log.m105924i("MicroMsg.ImageQueryPlugin", APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
        C59492k.f169999a = k0Var;
        String f = k0Var.mo137218f();
        C87412m.m108593f(f, "platformOp.currentRoomId");
        C59491j.f169997b = f;
        Intent intent = new Intent(context, ImageQueryMainUI.class);
        intent.putExtra("KEY_IS_INIT", true);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/ImageQueryPlugin", APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "(Landroid/content/Context;Lcom/tencent/mm/api/IImageQueryComposeOp;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/ImageQueryPlugin", APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "(Landroid/content/Context;Lcom/tencent/mm/api/IImageQueryComposeOp;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: ps */
    public void mo89081ps(String str, int i, String str2, int i2) {
        C87412m.m108594g(str, "userName");
        C87412m.m108594g(str2, "sugTextList");
        C60282d.f171858b = str;
        C60282d.f171860d = i;
        C60282d.f171861e = str2;
        C60282d.f171864h = i2;
    }

    public boolean xr0() {
        C54526i iVar = C54526i.f152882a;
        return iVar.mo75389a() && iVar.mo75390b();
    }

    /* renamed from: yd */
    public void mo89083yd(int i) {
        C54526i iVar = C54526i.f152882a;
        long j = 1;
        boolean z = false;
        boolean z2 = (C75592q0.m90780j() & 1) != 0;
        Log.m105924i("MicroMsg.ImageQueryEntranceConfig", "getC2CImageQuerySettingState: " + z2);
        Log.m105924i("MicroMsg.ImageQueryPlugin", "doImageQueryTecReport >> action: " + i + ", switch: " + z2);
        C60283e.f171897t = z2 ? 1 : 2;
        if (i == 9) {
            boolean z3 = C79758p.f233760a.mo109882e(C104160f.RepairerConfig_Global_ShowImageQuery_Int, 0) == 1;
            boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_image_query_entrance, false);
            Log.m105924i("MicroMsg.ImageQueryEntranceConfig", "getImageQueryEntranceConfig >> result: " + wf + ", repairConfig: " + z3);
            if (wf || z3) {
                z = true;
            }
            C60283e.f171898u = z ? 1 : 2;
            if (!iVar.mo75390b()) {
                j = 2;
            }
            C60283e.f171899v = j;
        }
        Log.m105924i("MicroMsg.ImageQueryTecReporter", "report: >> action: " + i + ", " + C60283e.f171900w);
        ImageQueryTecLogStruct imageQueryTecLogStruct = new ImageQueryTecLogStruct();
        imageQueryTecLogStruct.f156290d = (long) i;
        imageQueryTecLogStruct.f156288G = imageQueryTecLogStruct.mo86045b("SessionId", C60283e.f171900w, true);
        imageQueryTecLogStruct.f156283B = C60283e.f171898u;
        imageQueryTecLogStruct.f156284C = C60283e.f171899v;
        imageQueryTecLogStruct.f156291e = C60283e.f171897t;
        imageQueryTecLogStruct.mo86054n();
    }
}
