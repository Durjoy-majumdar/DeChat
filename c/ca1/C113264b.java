package ca1;

import android.text.TextUtils;
import android.util.Pair;
import androidx.fragment.app.Fragment;
import ba1.C113156i;
import ba1.C16777c;
import com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.C115411b;
import com.tencent.p014mm.sdk.platformtools.Log;
import e91.C116711b;
import f91.C116850b;
import fa1.C20696a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import op3.C117877b;
import op3.C117882j;
import t91.C22466j;
import te3.C118423dg2;
import te3.C118427eg2;
import te3.C22505ka3;

/* renamed from: ca1.b */
public final class C113264b {
    /* renamed from: a */
    public static void m155055a(String str, int i, long j) {
        if (!TextUtils.isEmpty(str)) {
            String h = C116711b.m164583h(str);
            C118427eg2 eg22 = new C118427eg2();
            eg22.f353969d = h;
            eg22.f353977o = i;
            eg22.f353970e = j;
            C22505ka3 e = C16777c.m16413e();
            if (e == null) {
                Log.m105925i("HABBYGE-MALI.HellPageFlowManager", "addPageflow(addPage2Flow), Unknown Page: %s", h);
                eg22.f353972g = null;
                C113156i.m154837e();
            } else {
                String m = C115411b.m162230m(e);
                eg22.f353972g = m;
                Log.m105925i("HABBYGE-MALI.HellPageFlowManager", "addPageflow(addPage2Flow), session: %s, %s", h, m);
                C113156i.m154835c(eg22);
            }
            C118423dg2 a = C113263a.m155052a();
            a.f353948d.addLast(eg22);
            C113263a.m155053b(a);
        }
    }

    /* renamed from: b */
    public static void m155056b(C22505ka3 ka32, String str, int i, long j) {
        if (!TextUtils.isEmpty(str)) {
            if (ka32 == null || !C20696a.m22649a(ka32.f64087d)) {
                m155057c(ka32, str, i, j);
            } else {
                Log.m105924i("HABBYGE-MALI.HellPageFlowManager", "addpageFlow scan-session, need filter !!");
            }
        }
    }

    /* renamed from: c */
    public static void m155057c(C22505ka3 ka32, String str, int i, long j) {
        C118427eg2 eg22;
        String h = C116711b.m164583h(str);
        C118423dg2 a = C113263a.m155052a();
        if (ka32 == null) {
            if ("LauncherUI".equals(h) || "FinderHomeUI".equals(h) || "FinderHomeAffinityUI".equals(h) || "FinderConversationUI".equals(h)) {
                Log.m105924i("HABBYGE-MALI.HellPageFlowManager", "Invalidate Page: LauncherUI/FinderHomeUI");
                return;
            }
        } else if ("LauncherUI".equals(h)) {
            Log.m105924i("HABBYGE-MALI.HellPageFlowManager", "Invalidate Page: LauncherUI");
            return;
        } else if ("FinderHomeUI".equals(h) || "FinderHomeAffinityUI".equals(h) || "FinderConversationUI".equals(h)) {
            Fragment a2 = C22466j.m26184a();
            h = a2 != null ? a2.getClass().getSimpleName() : "FinderFollowTabFragment";
            Log.m105925i("HABBYGE-MALI.HellPageFlowManager", "maybe invalidate Page: FinderHomeUI in %s, %s", ka32.f64087d, h);
        }
        C118427eg2 peekLast = a.f353948d.peekLast();
        if (peekLast != null) {
            if (peekLast.f353969d.equals(h)) {
                if (ka32 != null && !ka32.f64087d.equals(peekLast.f353972g)) {
                    String str2 = peekLast.f353972g;
                    peekLast.f353972g = ka32.f64087d;
                    LinkedList<C118427eg2> linkedList = a.f353948d;
                    linkedList.set(linkedList.size() - 1, peekLast);
                    m155064j(a, str2, ka32.f64087d, false);
                    C113263a.m155053b(a);
                }
                if (peekLast.f353977o <= 0 && i > 0) {
                    peekLast.f353977o = i;
                    C113263a.m155053b(a);
                }
                Log.m105925i("HABBYGE-MALI.HellPageFlowManager", "repeated page, no need to add this page: %s, %d, %s, %d", peekLast.f353969d, Integer.valueOf(peekLast.f353977o), h, Integer.valueOf(i));
                return;
            }
            if (ka32 != null && !peekLast.f353972g.equals(ka32.f64087d)) {
                m155064j(a, peekLast.f353972g, ka32.f64087d, true);
            }
            int size = a.f353948d.size();
            if (size > 2 && (eg22 = a.f353948d.get(size - 2)) != null) {
                if ("MsgRetransmitUI".equals(eg22.f353969d) && "SelectConversationUI".equals(peekLast.f353969d) && "MsgRetransmitUI".equals(h)) {
                    return;
                }
                if ("SelectConversationUI".equals(eg22.f353969d) && "MsgRetransmitUI".equals(peekLast.f353969d) && "SelectConversationUI".equals(h)) {
                    return;
                }
            }
        }
        C118427eg2 eg23 = new C118427eg2();
        eg23.f353969d = h;
        eg23.f353977o = i;
        eg23.f353970e = j;
        if (ka32 == null) {
            Log.m105925i("HABBYGE-MALI.HellPageFlowManager", "addPageFlow, Unknown Page: %s, %d", h, Integer.valueOf(i));
            eg23.f353972g = null;
            C113156i.m154837e();
        } else {
            eg23.f353972g = C115411b.m162230m(ka32);
            Log.m105925i("HABBYGE-MALI.HellPageFlowManager", "addPageFlow, session: %s, %d, %s", h, Integer.valueOf(i), eg23.f353972g);
            C113156i.m154835c(eg23);
        }
        a.f353948d.addLast(eg23);
        C113263a.m155053b(a);
    }

    /* renamed from: d */
    public static Pair<C118427eg2, Integer> m155058d() {
        C118423dg2 a = C113263a.m155052a();
        if (a.f353948d.isEmpty()) {
            return null;
        }
        return Pair.create(a.f353948d.getLast(), Integer.valueOf(a.f353948d.size() - 1));
    }

    /* renamed from: e */
    public static C117877b<C118427eg2, Integer> m155059e(String str, String str2) {
        String h;
        if (!(str == null || str2 == null || str2.isEmpty())) {
            String h2 = C116711b.m164583h(str2);
            Log.m105925i("HABBYGE-MALI.HellPageFlowManager", "getPageFlowItemOfCurSession: %s, %s", h2, str);
            C118423dg2 a = C113263a.m155052a();
            for (int size = a.f353948d.size() - 1; size >= 0; size--) {
                C118427eg2 eg22 = a.f353948d.get(size);
                if (eg22.f353972g.equals(str) && (h = C116711b.m164583h(eg22.f353969d)) != null && h.equals(h2)) {
                    return C117882j.m166284c(eg22, Integer.valueOf(size));
                }
            }
        }
        return null;
    }

    /* renamed from: f */
    public static List<C118427eg2> m155060f(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        C118423dg2 a = C113263a.m155052a();
        int size = a.f353948d.size();
        for (int i = 0; i < size; i++) {
            C118427eg2 eg22 = a.f353948d.get(i);
            if (eg22.f353972g.equals(str)) {
                arrayList.add(eg22);
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    public static void m155061g() {
        synchronized (C113263a.class) {
            long currentTimeMillis = System.currentTimeMillis();
            C116850b.m164834d("mmkv_key_hell_PFLOW", new byte[0]);
            Log.m105925i("HABBYGE-MALI.HellPageFlowDao", "HellPageFlowDao-reset-time: %s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        }
    }

    /* renamed from: h */
    public static void m155062h(String str, long j) {
        C118427eg2 last;
        C118423dg2 a = C113263a.m155052a();
        if (a.f353948d.isEmpty()) {
            Log.m105920e("HABBYGE-MALI.HellPageFlowManager", "setEndTimeOfPageWhenEvent8, pageFlow.items == NULL");
            return;
        }
        String h = C116711b.m164583h(str);
        if (h != null && !h.isEmpty() && (last = a.f353948d.getLast()) != null) {
            long j2 = j - last.f353970e;
            if (j2 <= 0) {
                j2 = 0;
            }
            last.f353971f = j2;
            C113263a.m155053b(a);
        }
    }

    /* renamed from: i */
    public static void m155063i(C118427eg2 eg22, int i) {
        if (eg22 != null) {
            C118423dg2 a = C113263a.m155052a();
            try {
                a.f353948d.set(i, eg22);
                C113263a.m155053b(a);
            } catch (Exception e) {
                Log.printErrStackTrace("HABBYGE-MALI.HellPageFlowManager", e, "updatePageFlow crash: %s", e.getMessage());
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m155064j(te3.C118423dg2 r5, java.lang.String r6, java.lang.String r7, boolean r8) {
        /*
            java.util.LinkedList<te3.eg2> r0 = r5.f353948d
            int r0 = r0.size()
            if (r8 != 0) goto L_0x000a
            int r0 = r0 + -1
        L_0x000a:
            r8 = 1
            int r0 = r0 - r8
        L_0x000c:
            if (r0 < 0) goto L_0x004c
            java.util.LinkedList<te3.eg2> r1 = r5.f353948d
            java.lang.Object r1 = r1.get(r0)
            te3.eg2 r1 = (te3.C118427eg2) r1
            if (r1 != 0) goto L_0x0019
            goto L_0x0049
        L_0x0019:
            java.lang.String r2 = r1.f353972g
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L_0x004c
            com.tencent.mm.plugin.expt.hellhound.ext.session.config.b$a r2 = com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.C115411b.f345922a
            op3.b r3 = r2.mo175253j(r6)
            r4 = 0
            if (r3 == 0) goto L_0x0031
            java.lang.Object r3 = r3.mo182596a(r8)
            java.lang.String r3 = (java.lang.String) r3
            goto L_0x0032
        L_0x0031:
            r3 = r4
        L_0x0032:
            op3.b r2 = r2.mo175253j(r7)
            if (r2 == 0) goto L_0x003f
            java.lang.Object r2 = r2.mo182596a(r8)
            r4 = r2
            java.lang.String r4 = (java.lang.String) r4
        L_0x003f:
            if (r3 == 0) goto L_0x0049
            boolean r2 = r3.equals(r4)
            if (r2 == 0) goto L_0x0049
            r1.f353972g = r7
        L_0x0049:
            int r0 = r0 + -1
            goto L_0x000c
        L_0x004c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ca1.C113264b.m155064j(te3.dg2, java.lang.String, java.lang.String, boolean):void");
    }
}
