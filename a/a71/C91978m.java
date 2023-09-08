package a71;

import ac3.C27843a1;
import ac3.C27862u0;
import ac3.C39538h0;
import ac3.C91990c1;
import ac3.C91992q0;
import ac3.C91995s0;
import ac3.C91996t0;
import al3.C0086a;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.mmdata.rpt.WeVisionModelResStruct;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.cmd.C30650a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import f40.C86709a0;
import fy3.C32226l;
import gy3.C87412m;
import h81.C32735h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import o40.C61926c;
import p008bq.C92282j0;
import p156gj.C87200o;
import p182kk.C61104a;
import p490dl.C97491p;
import p523fp.C32147e;
import qo3.C77389a;
import qo3.C77398g;
import qr3.C110470e;
import sx3.C110818d0;
import sx3.C36907w;
import te3.a05;
import v61.C37680b;
import v61.C37682c;
import zb0.C39332f;

@C86522b(onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS})
/* renamed from: a71.m */
public final class C91978m extends C86301e implements C37680b {

    /* renamed from: d */
    public final String f263326d = "MicroMsg.PluginEmojiCapture";

    /* renamed from: P4 */
    public void mo61284P4(Context context, String str, C92282j0.C92283a aVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "lensIdWithUrl");
        C87412m.m108594g(aVar, "onResult");
        new C91965b(context, str, aVar);
    }

    public void jn0(Context context, int i, C37680b.C37681a aVar) {
        boolean z;
        boolean z2;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(aVar, "onResult");
        C39332f.m42087b().getClass();
        ((C32147e) C86312j.m106911c(C32147e.class)).Yi0(57);
        if (C61104a.m71651g(context) || C61104a.m71669y(context) || C61104a.m71665u(context) || C61104a.m71647c(context, true)) {
            Log.m105924i(this.f263326d, "camera check false");
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C97491p pVar = C97491p.f286143a;
            pVar.mo136773a(false);
            if (pVar.mo136774c().getBoolean("capture_full", false)) {
                C77389a aVar2 = new C77389a();
                aVar2.f225644a = C0086a.m38a(context).getString(C0966R.string.bzq);
                aVar2.f225660q = C0086a.m38a(context).getString(C0966R.string.bzp);
                aVar2.f225663t = C0086a.m38a(context).getString(C0966R.string.bzo);
                aVar2.f225620C = new C0015l(context);
                aVar2.f225664u = C0086a.m38a(context).getString(C0966R.string.bzn);
                C77398g gVar = new C77398g(context, C0966R.style.a66);
                gVar.mo107525e(aVar2);
                gVar.show();
                Log.m105924i(this.f263326d, "over size check false");
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z2) {
                return;
            }
            if (i != 2) {
                ((C37682c.C37683a) aVar).mo61289a(true);
                return;
            }
            C85801v1 i2 = C86709a0.m107535s().mo121142i();
            C72994y1.C72995a aVar3 = C72994y1.C72995a.USERINFO_EMOJI_CAPTURE_OPENED_BOOLEAN;
            Object f = i2.mo119685f(aVar3, (Object) null);
            if (f == null || !(f instanceof Boolean) || !((Boolean) f).booleanValue()) {
                if (!C39332f.m42087b().f105734b) {
                    C115669n.INSTANCE.mo175912v(933, 2);
                }
                Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), C0966R.C0969drawable.emoji_capture_first_open_notice);
                C77389a aVar4 = new C77389a();
                aVar4.f225644a = C0086a.m38a(context).getString(C0966R.string.bzm);
                aVar4.f225658o = decodeResource;
                aVar4.f225619B = false;
                aVar4.f225635R = 0;
                aVar4.f225660q = C0086a.m38a(context).getString(C0966R.string.bzl);
                aVar4.f225663t = C0086a.m38a(context).getString(C0966R.string.bzj);
                aVar4.f225623F = new C27812k(aVar);
                C77398g gVar2 = new C77398g(context, C0966R.style.a66);
                gVar2.mo107525e(aVar4);
                gVar2.show();
                C86709a0.m107535s().mo121142i().mo119677K(aVar3, Boolean.TRUE);
                Log.m105924i(this.f263326d, "first open check false");
                return;
            }
            ((C37682c.C37683a) aVar).mo61289a(true);
        }
    }

    /* renamed from: m0 */
    public void mo61286m0(Context context, String str, C92282j0.C92283a aVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "url");
        C87412m.m108594g(aVar, "onResult");
        new C91973g(context, str, aVar);
    }

    public void onAccountInitialized(Context context) {
        C87412m.m108594g(context, "context");
        Log.m105924i(this.f263326d, "onAccountInitialized: ");
        C30650a.m39147b(new C91976h(), "//emojicapture");
        C91990c1 c1Var = C91990c1.f263329a;
        Log.m105924i("MicroMsg.WeVisModelResMgr", "init: ");
        c1Var.mo125826a();
        C91996t0 t0Var = C91992q0.f263342l;
        t0Var.getClass();
        WeVisionModelResStruct weVisionModelResStruct = new WeVisionModelResStruct();
        if (C110470e.f330363a == 0) {
            C110470e.f330363a = 2011400;
        }
        weVisionModelResStruct.f79225d = C110470e.f330363a;
        weVisionModelResStruct.f79226e = t0Var.f263354b;
        weVisionModelResStruct.f79227f = t0Var.f263355c;
        LinkedList<C91995s0> linkedList = t0Var.f263356d;
        ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
        for (C91995s0 s0Var : linkedList) {
            arrayList.add(Integer.valueOf(s0Var.f263348c));
        }
        weVisionModelResStruct.f79228g = weVisionModelResStruct.mo86045b("ModelList", C110818d0.m150921S(arrayList, ";", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null), true);
        LinkedList<C91995s0> linkedList2 = t0Var.f263356d;
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = linkedList2.iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            C91995s0 s0Var2 = (C91995s0) next;
            if (s0Var2.f263349d == s0Var2.f263352g) {
                z = true;
            }
            if (!z) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList(C36907w.m41090l(arrayList2, 10));
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            arrayList3.add(Integer.valueOf(((C91995s0) it4.next()).f263348c));
        }
        weVisionModelResStruct.f79229h = weVisionModelResStruct.mo86045b("InvalidModelList", C110818d0.m150921S(arrayList3, ";", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null), true);
        weVisionModelResStruct.f79230i = ((C32147e) C86312j.m106911c(C32147e.class)).mo58514sC(99, 0);
        Log.m105924i("MicroMsg.WeVisModelConfig", "reportModelRes: " + weVisionModelResStruct.mo1006q());
        weVisionModelResStruct.mo86054n();
        C27862u0 u0Var = C27862u0.f77002a;
        Log.m105924i("MicroMsg.WeVisModelMgr", "init: ");
        int decodeInt = u0Var.mo55647b().decodeInt("sdk_version");
        if (C110470e.f330363a == 0) {
            C110470e.f330363a = 2011400;
        }
        if (decodeInt == C110470e.f330363a) {
            a05 a05 = C27862u0.f77005d;
            byte[] decodeBytes = u0Var.mo55647b().decodeBytes("local_info");
            if (decodeBytes != null) {
                try {
                    a05.parseFrom(decodeBytes);
                } catch (Exception e) {
                    Log.printDebugStack("safeParser", "", e);
                }
            }
            a05 a052 = C27862u0.f77006e;
            byte[] decodeBytes2 = u0Var.mo55647b().decodeBytes("target_info");
            if (decodeBytes2 != null) {
                try {
                    a052.parseFrom(decodeBytes2);
                } catch (Exception e2) {
                    Log.printDebugStack("safeParser", "", e2);
                }
            }
        } else {
            u0Var.mo55647b().clearAll();
        }
        u0Var.mo55652g();
        u0Var.mo55651f();
        C61926c.m72666K(10000, C27843a1.f76966d);
        C39538h0.f106157d.getClass();
        String str = C39538h0.f106158e;
        Log.m105924i(str, "init: deviceModel:" + C87200o.f252870c);
    }

    public void onAccountReleased(Context context) {
        C87412m.m108594g(context, "context");
        Log.m105924i(this.f263326d, "onAccountRelease: ");
        C30650a.m39148c("//emojicapture");
    }

    /* renamed from: ru */
    public int mo61287ru() {
        return ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_emoji_sticker_recommend_count, 9);
    }

    /* renamed from: tI */
    public boolean mo61288tI() {
        int j = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_EMOJI_STICKER_ENABLE_INT, 0);
        return j == 1 || j != 2;
    }
}
