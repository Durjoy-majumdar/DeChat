package com.tencent.p014mm.plugin.multitask;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Bundle;
import ba2.C39749d;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.MulitTaskEvent;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo;
import com.tencent.p014mm.plugin.multitask.p079ui.MultiTaskFloatBallView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.PlaySound;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import d92.C107028a;
import d92.C45292b;
import di3.C86301e;
import di3.C86312j;
import eb0.C31543z5;
import ei3.C86522b;
import g92.C107789c;
import g92.C59398d;
import gy3.C87412m;
import h81.C32735h;
import h92.C108177a;
import i92.C108425a;
import j92.C108669a;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.regex.Pattern;
import k92.C108975c;
import k92.C108976d;
import l92.C109293a;
import l92.C109294b;
import l92.C109299f;
import n92.C117617a;
import o40.C61926c;
import o92.C110003f;
import p640ox.C77049b;
import p92.C110204d;
import p92.C110208i;
import r92.C110559c;
import te3.C101828pe0;
import te3.C110964i13;
import te3.C64336e13;
import te3.C64459j13;
import te3.i25;

@C86522b
/* renamed from: com.tencent.mm.plugin.multitask.u */
public final class C105925u extends C86301e implements C105919k {

    /* renamed from: d */
    public final String f315132d = "MicroMsg.MultiTask.PluginMultiTaskService";

    /* renamed from: com.tencent.mm.plugin.multitask.u$a */
    public static final class C30313a<T> implements C1256g {

        /* renamed from: d */
        public final /* synthetic */ C105925u f81837d;

        public C30313a(C105925u uVar) {
            this.f81837d = uVar;
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            Bundle bundle = (Bundle) obj;
            String str = this.f81837d.f315132d;
            StringBuilder sb = new StringBuilder();
            sb.append("reportMultiTaskInfo invoker callback result:");
            sb.append(bundle != null ? bundle.getBoolean("result") : false);
            Log.m105924i(str, sb.toString());
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitask.u$b */
    public static final class C30314b<T> implements C1256g {

        /* renamed from: d */
        public final /* synthetic */ C105925u f81838d;

        public C30314b(C105925u uVar) {
            this.f81838d = uVar;
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            Bundle bundle = (Bundle) obj;
            String str = this.f81838d.f315132d;
            StringBuilder sb = new StringBuilder();
            sb.append("hideMultiTaskUIC invoker callback result:");
            sb.append(bundle != null ? bundle.getBoolean("result") : false);
            Log.m105924i(str, sb.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001a, code lost:
        r3 = r3.f141210d;
     */
    /* renamed from: AF */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap mo151029AF(te3.C51173ry r3) {
        /*
            r2 = this;
            boolean r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMainProcess()
            r1 = 0
            if (r0 == 0) goto L_0x0016
            com.tencent.mm.plugin.multitask.q r3 = com.tencent.p014mm.plugin.multitask.C56888q.f162957a
            java.lang.String r0 = "Home"
            java.lang.String r3 = r3.mo80311b(r0)
            ba2.b r0 = ba2.C39748b.f106642a
            android.graphics.Bitmap r3 = r0.mo62384a(r3, r1)
            goto L_0x0026
        L_0x0016:
            ba2.b r0 = ba2.C39748b.f106642a
            if (r3 == 0) goto L_0x0021
            te3.d13 r3 = r3.f141210d
            if (r3 == 0) goto L_0x0021
            java.lang.String r3 = r3.f331948g
            goto L_0x0022
        L_0x0021:
            r3 = r1
        L_0x0022:
            android.graphics.Bitmap r3 = r0.mo62384a(r3, r1)
        L_0x0026:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.multitask.C105925u.mo151029AF(te3.ry):android.graphics.Bitmap");
    }

    /* renamed from: Bv */
    public long mo151030Bv() {
        return C31543z5.m39453c();
    }

    public C45292b Cj0(Activity activity) {
        return new C110559c(activity);
    }

    /* renamed from: D3 */
    public void mo151032D3(String str, int i, C64459j13 j132, Bitmap bitmap, byte[] bArr) {
        C87412m.m108594g(str, "id");
        C87412m.m108594g(j132, "showData");
        ((C105918j) C86312j.m106911c(C105918j.class)).mo151016D3(str, i, j132, bitmap, bArr);
    }

    /* renamed from: H3 */
    public void mo151033H3(C109294b bVar) {
        ((C105918j) C86312j.m106911c(C105918j.class)).mo151017H3(bVar);
    }

    /* renamed from: IA */
    public void mo151034IA(Bundle bundle, i25 i25) {
        C87412m.m108594g(bundle, "bundle");
        C87412m.m108594g(i25, "webMultiTaskData");
        C39749d.m42537d(bundle, i25);
    }

    /* renamed from: LY */
    public String mo151035LY() {
        return ((C32735h) C86312j.m106911c(C32735h.class)).Y60(C32735h.C32737c.clicfg_multitask_disable_snapshot_mode, "");
    }

    /* renamed from: P */
    public String mo151036P(String str, int i, int i2) {
        C87412m.m108594g(str, "id");
        return ((C105918j) C86312j.m106911c(C105918j.class)).mo151018P(str, i, i2);
    }

    /* renamed from: PA */
    public C108177a mo151037PA() {
        return new C108425a();
    }

    /* renamed from: Ph */
    public void mo151038Ph(C107028a aVar, C109293a aVar2) {
        C87412m.m108594g(aVar2, "tipsCallback");
        Activity activity = aVar != null ? aVar.getActivity() : null;
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("multitask_tips_config");
        boolean z = mmkv.getBoolean("multitask_tips_show", false);
        Log.m105924i("MicroMsg.MultiTaskTipsHelper", "showTips, flag: " + z);
        if (!z) {
            mmkv.putBoolean("multitask_tips_show", true);
            C110003f fVar = new C110003f(activity, aVar2);
            Pattern pattern = C61926c.f176038a;
            MMHandlerThread.postToMainThreadDelayed(fVar, 0);
            return;
        }
        aVar2.mo160107b();
    }

    /* renamed from: S5 */
    public boolean mo151039S5(MultiTaskInfo multiTaskInfo) {
        C87412m.m108594g(multiTaskInfo, "multiTaskInfo");
        return ((C105918j) C86312j.m106911c(C105918j.class)).mo151019S5(multiTaskInfo);
    }

    public C108177a W10() {
        return new C108669a();
    }

    /* renamed from: Y1 */
    public void mo151041Y1() {
        PlaySound.play(MMApplicationContext.getContext(), C0966R.string.lgu);
    }

    /* renamed from: ZS */
    public void mo151042ZS(Intent intent, C101828pe0 pe02) {
        C87412m.m108594g(intent, "intent");
        C87412m.m108594g(pe02, "fileMultiTaskData");
        C39749d.m42534a(intent, pe02);
    }

    /* renamed from: b4 */
    public Point mo151043b4() {
        return ((C105918j) C86312j.m106911c(C105918j.class)).mo151021b4();
    }

    /* renamed from: bP */
    public C59398d mo151044bP(C107028a aVar, C109299f fVar) {
        C87412m.m108594g(aVar, "pageAdapter");
        return new C107789c(aVar, fVar);
    }

    /* renamed from: de */
    public void mo151045de(Intent intent, i25 i25) {
        C87412m.m108594g(intent, "intent");
        C87412m.m108594g(i25, "webMultiTaskData");
        C39749d.m42535b(intent, i25);
    }

    /* renamed from: eZ */
    public String mo151046eZ(MultiTaskInfo multiTaskInfo) {
        C87412m.m108594g(multiTaskInfo, "multiTaskInfo");
        return C56888q.f162957a.mo80310a(multiTaskInfo);
    }

    /* renamed from: kV */
    public void mo151047kV(int i, C110964i13 i132) {
        String str = this.f315132d;
        Object[] objArr = new Object[3];
        byte[] bArr = null;
        objArr[0] = i132 != null ? i132.f332059f : null;
        objArr[1] = i132 != null ? Integer.valueOf(i132.f332060g) : null;
        objArr[2] = Integer.valueOf(i);
        Log.m105919d(str, "reportMultiTaskInfo, itemid: %s, itemtype: %d, reporttype: %d", objArr);
        if (!MMApplicationContext.isMainProcess()) {
            Bundle bundle = new Bundle();
            bundle.putInt("reporttype", i);
            if (i132 != null) {
                bArr = i132.toByteArray();
            }
            bundle.putByteArray("reportdata", bArr);
            C80907o.m98781d(WeChatProcess.PROCESS_MAIN, bundle, C105926w.class, new C30313a(this));
        } else if (i132 == null) {
        } else {
            if (i == 2) {
                C117617a aVar = C117617a.f351848a;
                aVar.mo182344f(i132);
                aVar.mo182345g(i132.f332060g, i132.f332065o);
            } else if (i == 3) {
                C117617a.f351848a.mo182343e(i132);
            }
        }
    }

    /* renamed from: l0 */
    public void mo151048l0(String str, int i, C64459j13 j132, Bitmap bitmap, byte[] bArr, C110964i13 i132) {
        C87412m.m108594g(str, "id");
        C87412m.m108594g(j132, "showData");
        ((C105918j) C86312j.m106911c(C105918j.class)).mo151023l0(str, i, j132, bitmap, bArr, i132);
    }

    public void nb0(C107028a aVar, C110964i13 i132, MultiTaskInfo multiTaskInfo) {
        Activity activity;
        C110964i13 i133;
        if (aVar != null && (activity = aVar.getActivity()) != null && (i133 = (C110964i13) ((C77049b) C86312j.m106911c(C77049b.class)).mo72356fq(activity, 1, 5, C110964i13.class)) != null) {
            C64336e13 e132 = null;
            if (i132 != null) {
                i132.f332060g = (multiTaskInfo != null ? Integer.valueOf(multiTaskInfo.field_type) : null).intValue();
            }
            if (i132 != null) {
                i132.f332059f = multiTaskInfo != null ? multiTaskInfo.field_id : null;
            }
            if (i132 != null) {
                i132.f332057d = i133.f332057d;
            }
            if (i132 != null) {
                e132 = i132.f332062i;
            }
            if (e132 != null) {
                e132.f182918d = C31543z5.m39453c();
            }
            Log.m105925i(this.f315132d, "SecData multitask scene enter contextId: %s", i133.f332057d);
        }
    }

    /* renamed from: r5 */
    public void mo151050r5(int i, String str, int i2) {
        C87412m.m108594g(str, "id");
        if (MMApplicationContext.isMainProcess()) {
            MulitTaskEvent mulitTaskEvent = new MulitTaskEvent();
            MulitTaskEvent.C67733a aVar = mulitTaskEvent.f193741d;
            aVar.f193744c = i;
            aVar.f193743b = i2;
            aVar.f193742a = str;
            mulitTaskEvent.publish();
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("id", str);
        bundle.putInt("type", i2);
        bundle.putInt("event_type", i);
        C80907o.m98781d(WeChatProcess.PROCESS_MAIN, bundle, C4896n.class, new C30314b(this));
    }

    public C108975c tt0(C107028a aVar, C108976d dVar) {
        MultiTaskFloatBallView multiTaskFloatBallView;
        C87412m.m108594g(dVar, "pageMultiTaskHelper");
        C110208i iVar = new C110208i();
        iVar.f329696e = aVar;
        C110204d dVar2 = iVar.f329695d;
        if (!(!(dVar2 != null) || dVar2 == null || (multiTaskFloatBallView = dVar2.f329685a) == null)) {
            ((CopyOnWriteArraySet) multiTaskFloatBallView.f315142g).add(dVar);
        }
        return iVar;
    }

    public int us0(String str) {
        C87412m.m108594g(str, "id");
        int indexOf = ((C105923s) C86312j.m106911c(C105923s.class)).f315127g.indexOf(str);
        if (indexOf == -1) {
            return 0;
        }
        return indexOf;
    }

    /* renamed from: y5 */
    public void mo151053y5(String str, int i, C64459j13 j132, byte[] bArr) {
        C87412m.m108594g(str, "id");
        C87412m.m108594g(j132, "showData");
        ((C105918j) C86312j.m106911c(C105918j.class)).mo151028y5(str, i, j132, bArr);
    }
}
