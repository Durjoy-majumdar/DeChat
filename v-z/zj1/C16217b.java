package zj1;

import ak1.C0073g0;
import ak1.C54067f0;
import ak1.C54108o;
import ak1.C54116w;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.C0120a0;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C54219z;
import com.tencent.p014mm.plugin.finder.extension.reddot.C2458a;
import com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C7335d;
import di3.C86312j;
import eb0.C31543z5;
import fy3.C32226l;
import gy3.C87412m;
import ht1.C60152b4;
import ht1.C60200t1;
import ht1.C8777j5;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import o40.C61926c;
import ok1.C62042e;
import org.json.JSONObject;
import p50.C62197e;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C64197v;
import te3.C51978xi1;
import te3.C64586nn1;
import te3.C64867yw;

/* renamed from: zj1.b */
public final class C16217b {

    /* renamed from: a */
    public static final C16217b f43438a = new C16217b();

    /* renamed from: b */
    public static final Map<String, C54219z<C2458a>> f43439b = new LinkedHashMap();

    /* renamed from: c */
    public static final List<String> f43440c = C64197v.m75537f("startlive.more", "startlive.more.silent", "startlive.more.fansgroup", "startlive.more.giftwish", "startlive.more.heatup", "startlive.more.grow", "startlive.more.commentmanage", "startlive.more.commentmanage.comment", "startlive.more.commentmanage.sensitivity", "startlive.more.commentmanage.assistant", "startlive.more.commentmanage.quickreply", "startlive.more.morefunction", "startlive.more.morefunction.mictalking", "startlive.more.morefunction.connectmic", "startlive.more.morefunction.gift", "startlive.more.morefunction.like", "startlive.more.morefunction.hidenick", "startlive.more.recommend", "startlive.more.help", "startlive.bottom.videosetting", "startlive.bottom.videosetting.beauty", "startlive.bottom.videosetting.makeup", "startlive.bottom.videosetting.filter", "startlive.bottom.videosetting.gesture", "startlive.bottom.videosetting.mirror", "startlive.bottom.videosetting.switchcam", "startlive.bottom.audiosetting", "startlive.bottom.audiosetting.background", "startlive.bottom.music", "startlive.bottom.music.bgmusic", "startlive.bottom.music.song", "startlive.bottom.link", "startlive.bottom.shopping", "startlive.bottom.lottery", "anchorlive.more", "anchorlive.more.sharefriend", "anchorlive.more.sharemoments", "anchorlive.more.shareqrcode", "anchorlive.more.silent", "anchorlive.more.fansgroup", "anchorlive.more.giftwish", "anchorlive.more.heatup", "anchorlive.more.grow", "anchorlive.more.commentmanage", "anchorlive.more.commentmanage.comment", "anchorlive.more.commentmanage.sensitivity", "anchorlive.more.commentmanage.assistant", "anchorlive.more.commentmanage.quickreply", "anchorlive.more.morefunction", "anchorlive.more.morefunction.mictalking", "anchorlive.more.morefunction.connectmic", "anchorlive.more.morefunction.gift", "anchorlive.more.morefunction.like", "anchorlive.more.morefunction.hidenick", "anchorlive.more.morefunction.recommend", "anchorlive.more.help", "anchorlive.more.handoff", "anchorlive.more.minimize", "anchorlive.more.pauselive", "anchorlive.more.edittitle", "anchorlive.more.extendtrylivetime", "anchorlive.bottom.videosetting", "anchorlive.bottom.videosetting.beauty", "anchorlive.bottom.videosetting.makeup", "anchorlive.bottom.videosetting.filter", "anchorlive.bottom.videosetting.gesture", "anchorlive.bottom.videosetting.mirror", "anchorlive.bottom.videosetting.switchcam", "anchorlive.bottom.audiosetting", "anchorlive.bottom.audiosetting.background", "anchorlive.bottom.music", "anchorlive.bottom.music.bgmusic", "anchorlive.bottom.music.song", "anchorlive.bottom.tools", "anchorlive.bottom.tools.screenshare", "anchorlive.bottom.tools.vote", "anchorlive.bottom.tools.link", "anchorlive.bottom.shopping", "anchorlive.bottom.game", "anchorlive.bottom.multiangle", "anchorlive.bottom.connectmic", "anchorlive.bottom.lottery", "anchorlive.bottom.lottery.lottery", "anchorlive.bottom.lottery.redpacket", "assistant.more", "assistant.more.commentmanage", "assistant.more.commentmanage.comment", "assistant.more.commentmanage.sensitivity", "assistant.more.commentmanage.quickreply", "assistant.more.commentmanage.quickreply.edittitle", "assistant.more.morefunction", "assistant.more.morefunction.gift", "assistant.more.morefunction.like", "assistant.more.morefunction.hidenick", "assistant.more.morefunction.edittitle", "audience.more.morefunction", "audience.more.morefunction.minimize", "audience.more.morefunction.gifteffect", "audience.more.morefunction.rewardlimit", "audience.more.morefunction.rewardlimitamount");

    /* renamed from: zj1.b$a */
    public static final class C16218a<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ C32226l<C2458a, C13598b0> f43441d;

        public C16218a(C32226l<? super C2458a, C13598b0> lVar) {
            this.f43441d = lVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0026, code lost:
            r1 = r1.field_ctrInfo;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onChanged(java.lang.Object r3) {
            /*
                r2 = this;
                com.tencent.mm.plugin.finder.extension.reddot.a r3 = (com.tencent.p014mm.plugin.finder.extension.reddot.C2458a) r3
                zj1.b r0 = zj1.C16217b.f43438a
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "receive notification path "
                r0.append(r1)
                java.lang.String r1 = r3.f12912e
                r0.append(r1)
                java.lang.String r1 = ", show = "
                r0.append(r1)
                boolean r1 = r3.f12908a
                r0.append(r1)
                java.lang.String r1 = ", group id = "
                r0.append(r1)
                com.tencent.mm.plugin.finder.extension.reddot.s0 r1 = r3.f12910c
                if (r1 == 0) goto L_0x002d
                te3.xi1 r1 = r1.field_ctrInfo
                if (r1 == 0) goto L_0x002d
                java.lang.String r1 = r1.f144683u
                goto L_0x002e
            L_0x002d:
                r1 = 0
            L_0x002e:
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "FinderLiveRedDotNotifier"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
                fy3.l<com.tencent.mm.plugin.finder.extension.reddot.a, rx3.b0> r0 = r2.f43441d
                r0.invoke(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: zj1.C16217b.C16218a.onChanged(java.lang.Object):void");
        }
    }

    /* renamed from: i */
    public static void m15108i(C16217b bVar, C0125s sVar, String str, View view, View view2, TextView textView, int i, Object obj) {
        if ((i & 8) != 0) {
            view2 = null;
        }
        if ((i & 16) != 0) {
            textView = null;
        }
        bVar.getClass();
        C87412m.m108594g(str, "path");
        if (view != null) {
            bVar.mo14754k(sVar, str, false);
            bVar.mo14752h(sVar, str, new C16216a(view2, textView, view));
        }
    }

    /* renamed from: a */
    public final boolean mo14744a(String str) {
        C87412m.m108594g(str, "path");
        C64586nn1 R5 = ((C60200t1) C86312j.m106911c(C60200t1.class)).Nt0().mo77246R5(str);
        if (R5 == null) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("reddot ");
        sb.append(str);
        sb.append(" expose time = ");
        C64867yw ywVar = R5.f184512q;
        sb.append(ywVar != null ? Integer.valueOf(ywVar.f186604d) : null);
        sb.append(" limit = ");
        sb.append(R5.f184515t);
        Log.m105924i("FinderLiveRedDotNotifier", sb.toString());
        int i = R5.f184515t;
        if (i <= 0) {
            return false;
        }
        C64867yw ywVar2 = R5.f184512q;
        return i <= (ywVar2 != null ? ywVar2.f186604d : 0);
    }

    /* renamed from: b */
    public final void mo14745b(String str, boolean z) {
        C87412m.m108594g(str, "path");
        C60152b4 Nt0 = ((C60200t1) C86312j.m106911c(C60200t1.class)).Nt0();
        C51978xi1 d = mo14747d(str);
        String str2 = d != null ? d.f144683u : null;
        Log.m105924i("FinderLiveRedDotNotifier", "dispose " + str + " with group id " + str2 + ", fromExpose = " + z);
        if (!z) {
            mo14753j(str, 2);
        }
        if (str2 == null || str2.length() == 0) {
            Nt0.mo77239M5(str);
        } else {
            Nt0.mo77244P5(str2);
        }
    }

    /* renamed from: c */
    public final void mo14746c(String str) {
        C87412m.m108594g(str, "path");
        if (mo14744a(str)) {
            mo14745b(str, true);
        }
    }

    /* renamed from: d */
    public final C51978xi1 mo14747d(String str) {
        Object obj;
        Iterator it = C60152b4.C8759a.m8564d(((C60200t1) C86312j.m106911c(C60200t1.class)).Nt0(), str, (C32226l) null, (String) null, 6, (Object) null).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            boolean z = false;
            LinkedList<C64586nn1> linkedList = ((C55718s0) obj).field_ctrInfo.f144672g;
            C87412m.m108593f(linkedList, "localInfo.field_ctrInfo.show_infos");
            for (C64586nn1 nn12 : linkedList) {
                if (C87412m.m108589b(nn12.f184508j, str)) {
                    z = true;
                }
            }
            if (!z) {
                break;
            }
        }
        C55718s0 s0Var = (C55718s0) obj;
        if (s0Var != null) {
            return s0Var.field_ctrInfo;
        }
        return null;
    }

    /* renamed from: e */
    public final C54219z<C2458a> mo14748e(String str) {
        C87412m.m108594g(str, "path");
        LinkedHashMap linkedHashMap = (LinkedHashMap) f43439b;
        Object obj = linkedHashMap.get(str);
        if (obj == null) {
            obj = new C54219z();
            linkedHashMap.put(str, obj);
        }
        return (C54219z) obj;
    }

    /* renamed from: f */
    public final boolean mo14750f(String str) {
        C87412m.m108594g(str, "path");
        C2458a value = mo14748e(str).getValue();
        if (value == null || !value.f12908a) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public final void mo14751g(String str) {
        Class cls = C60200t1.class;
        C87412m.m108594g(str, "path");
        if (!(str.length() == 0)) {
            mo14753j(str, 1);
            mo14746c(str);
            C64586nn1 R5 = ((C60200t1) C86312j.m106911c(cls)).Nt0().mo77246R5(str);
            if (R5 != null && R5.f184515t > 0) {
                int e6 = ((C60200t1) C86312j.m106911c(cls)).Nt0().mo77264e6(str);
                Log.m105924i("FinderLiveRedDotNotifier", "reddot path " + R5.f184507i + " exposed, exposeCount = " + e6);
            }
        }
    }

    /* renamed from: h */
    public final void mo14752h(C0125s sVar, String str, C32226l<? super C2458a, C13598b0> lVar) {
        C87412m.m108594g(str, "path");
        C87412m.m108594g(lVar, "callback");
        if (sVar != null) {
            Log.m105924i("FinderLiveRedDotNotifier", "register reddot " + str);
            C61926c.m72695t(mo14748e(str), sVar, new C16218a(lVar));
        }
    }

    /* renamed from: j */
    public final void mo14753j(String str, int i) {
        String str2;
        String str3 = str;
        Class cls = C54108o.class;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", i);
        jSONObject.put("task_red", str3);
        C51978xi1 d = f43438a.mo14747d(str3);
        if (!(d == null || (str2 = d.f144673h) == null)) {
            jSONObject.put("task_id", str2);
        }
        String jSONObject2 = jSONObject.toString();
        C87412m.m108593f(jSONObject2, "JSONObject().apply {\n   …   }\n        }.toString()");
        C62042e eVar = C62042e.f176370a;
        if (eVar.mo87027N0()) {
            C7335d c = C86312j.m106911c(cls);
            C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
            C8777j5.C8778a.m8605f((C8777j5) c, C0073g0.LIVE_RED_DOT, jSONObject2, (String) null, 4, (Object) null);
            return;
        }
        eVar.getClass();
        if (C62197e.f176819i1 != null) {
            C7335d c2 = C86312j.m106911c(C54116w.class);
            C87412m.m108593f(c2, "getService(HellLiveVisitorReoprter::class.java)");
            C54116w.Ex0((C54116w) c2, C54067f0.C54076o0.LIVE_RED_DOT, jSONObject2, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
            return;
        }
        C7335d c3 = C86312j.m106911c(cls);
        C87412m.m108593f(c3, "getService(HellLiveReport::class.java)");
        C8777j5.C8778a.m8600a((C8777j5) c3, 38, jSONObject2, (String) null, 4, (Object) null);
    }

    /* renamed from: k */
    public final void mo14754k(C0125s sVar, String str, boolean z) {
        C87412m.m108594g(str, "path");
        if (sVar != null) {
            if (z) {
                Log.m105924i("FinderLiveRedDotNotifier", "unregister reddot " + str);
            }
            f43438a.mo14748e(str).removeObservers(sVar);
        }
    }

    /* renamed from: f */
    public final void mo14749f(int i, List<? extends C64586nn1> list, String str) {
        C87412m.m108594g(list, "showInfos");
        C51978xi1 xi12 = new C51978xi1();
        xi12.f144673h = String.valueOf(C31543z5.m39453c());
        xi12.f144670e = i;
        xi12.f144683u = str;
        for (C64586nn1 add : list) {
            xi12.f144672g.add(add);
        }
        C60152b4 Nt0 = ((C60200t1) C86312j.m106911c(C60200t1.class)).Nt0();
        C60152b4.C8759a.m8561a(Nt0, xi12, "insert reddot, type = " + i, (HashSet) null, true, (C13604l) null, (C32226l) null, 0, false, 244, (Object) null);
    }
}
