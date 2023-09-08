package ga1;

import android.util.Pair;
import com.tencent.p014mm.plugin.appbrand.jsapi.bio.face.JsApiCheckIsSupportFaceDetect;
import g91.C20813c;
import j20.C21153d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import te3.C22527qp1;

/* renamed from: ga1.a */
public final class C20819a {

    /* renamed from: a */
    public final Map<String, List<Pair<String, String>>> f58824a;

    /* renamed from: b */
    public final C21153d f58825b = new C20821b((C20820a) null);

    /* renamed from: ga1.a$b */
    public static final class C20821b implements C21153d {
        public C20821b(C20820a aVar) {
        }

        /* renamed from: a */
        public void mo32409a(String str, String str2, String str3, Object obj, Object obj2) {
        }

        /* renamed from: b */
        public void mo32410b(String str, String str2, String str3, Object obj, Object[] objArr) {
            if ("com/tencent/mm/plugin/ball/view/FloatMenuView".equals(str)) {
                if ("show".equals(str2) && "(Landroid/animation/AnimatorListenerAdapter;)V".equals(str3)) {
                    C20813c.m22810a().mo32508c(208, Long.valueOf(System.currentTimeMillis()));
                } else if ("hide".equals(str2) && "(Landroid/animation/AnimatorListenerAdapter;)V".equals(str3)) {
                    C20813c.m22810a().mo32508c(211, Long.valueOf(System.currentTimeMillis()));
                }
            } else if ("com/tencent/mm/plugin/ball/view/FloatBallView".equals(str)) {
                if ("onAttachedToWindow".equals(str2) && "()V".equals(str3)) {
                    C22527qp1 qp12 = new C22527qp1();
                    qp12.f64509d = 5;
                    C20813c.m22810a().mo32508c(210, qp12);
                } else if ("onDetachedFromWindow".equals(str2) && "()V".equals(str3)) {
                    C20813c.m22810a().mo32508c(212, Long.valueOf(System.currentTimeMillis()));
                } else if ("show".equals(str2) && "(ZLandroid/animation/AnimatorListenerAdapter;)V".equals(str3)) {
                    C22527qp1 qp13 = new C22527qp1();
                    qp13.f64509d = 3;
                    C20813c.m22810a().mo32508c(210, qp13);
                }
            } else if ("onFloatMenuBackgroundClicked".equals(str2) && "()V".equals(str3)) {
                C20813c.m22810a().mo32507b(213);
            } else if ("onFloatMenuBackPressed".equals(str2) && "()V".equals(str3)) {
                C20813c.m22810a().mo32507b(JsApiCheckIsSupportFaceDetect.CTRL_INDEX);
            } else if ("onFloatMenuItemClicked".equals(str2) && "(Lcom/tencent/mm/plugin/ball/model/BallInfo;)V".equals(str3)) {
                C20813c.m22810a().mo32507b(215);
            } else if ("onFloatMenuItemRemoved".equals(str2) && "(Lcom/tencent/mm/plugin/ball/model/BallInfo;I)V".equals(str3)) {
                C20813c.m22810a().mo32507b(216);
            }
        }
    }

    public C20819a() {
        HashMap hashMap = new HashMap();
        this.f58824a = hashMap;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Pair.create("show", "(Landroid/animation/AnimatorListenerAdapter;)V"));
        arrayList.add(Pair.create("hide", "(Landroid/animation/AnimatorListenerAdapter;)V"));
        hashMap.put("com/tencent/mm/plugin/ball/view/FloatMenuView", arrayList);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(Pair.create("onAttachedToWindow", "()V"));
        arrayList2.add(Pair.create("onDetachedFromWindow", "()V"));
        arrayList2.add(Pair.create("show", "(ZLandroid/animation/AnimatorListenerAdapter;)V"));
        arrayList2.add(Pair.create("hide", "(Landroid/animation/AnimatorListenerAdapter;)V"));
        hashMap.put("com/tencent/mm/plugin/ball/view/FloatBallView", arrayList2);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(Pair.create("onFloatMenuBackgroundClicked", "()V"));
        arrayList3.add(Pair.create("onFloatMenuBackPressed", "()V"));
        arrayList3.add(Pair.create("onFloatMenuItemClicked", "(Lcom/tencent/mm/plugin/ball/model/BallInfo;)V"));
        arrayList3.add(Pair.create("onFloatMenuItemRemoved", "(Lcom/tencent/mm/plugin/ball/model/BallInfo;I)V"));
        hashMap.put("com/tencent/mm/plugin/ball/listener/OnFloatMenuViewListener", arrayList3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x005a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo32510a(te3.C22505ka3 r10, boolean r11, int r12, int r13, long r14) {
        /*
            r9 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            r3 = 3
            java.lang.String r4 = "HABBYGE-MALI.FloatBallSessionHandler"
            if (r10 != 0) goto L_0x000e
            java.lang.String r10 = "_exitFloatSession, 不是合法session !!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r10)
            goto L_0x002c
        L_0x000e:
            java.lang.Object[] r5 = new java.lang.Object[r3]
            java.lang.String r6 = r10.f64087d
            r5[r1] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r12)
            r5[r0] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r13)
            r5[r2] = r6
            java.lang.String r6 = "_exitFloatSession, curSession: %s, %d, %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r6, r5)
            z91.b r5 = z91.C23462b.m28021f()
            r5.mo36930q(r10, r14)
        L_0x002c:
            java.lang.String r10 = "mmkv_sionpairD_table_hell"
            byte[] r10 = f91.C116850b.m164831a(r10)
            r5 = 0
            if (r10 == 0) goto L_0x0057
            int r6 = r10.length
            if (r6 != 0) goto L_0x003a
            r6 = 1
            goto L_0x003b
        L_0x003a:
            r6 = 0
        L_0x003b:
            if (r6 == 0) goto L_0x003e
            goto L_0x0057
        L_0x003e:
            te3.x14 r6 = new te3.x14
            r6.<init>()
            r6.parseFrom(r10)     // Catch:{ IOException -> 0x0047 }
            goto L_0x0058
        L_0x0047:
            r10 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r0]
            java.lang.String r7 = r10.getMessage()
            r6[r1] = r7
            java.lang.String r7 = "HABBYGE-MALI.SessionPairDao"
            java.lang.String r8 = "SessionPair, _read: %s"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r10, r8, r6)
        L_0x0057:
            r6 = r5
        L_0x0058:
            if (r6 != 0) goto L_0x005b
            return
        L_0x005b:
            boolean r10 = r6.f354530h
            if (r10 == 0) goto L_0x00b3
            te3.ka3 r10 = r6.f354526d
            java.lang.String r11 = r10.f64087d
            java.lang.String r11 = com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.C115411b.m162219b(r11)
            if (r11 != 0) goto L_0x006b
            goto L_0x00e8
        L_0x006b:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r11)
            java.lang.String r11 = "_"
            r12.append(r11)
            r12.append(r14)
            java.lang.String r11 = r12.toString()
            te3.ka3 r11 = ba1.C16777c.m16411c(r10, r11, r14)
            java.lang.String r10 = r10.f64087d
            te3.eg2 r10 = e91.C116711b.m164577b(r10)
            if (r10 == 0) goto L_0x009e
            java.lang.Object[] r12 = new java.lang.Object[r0]
            java.lang.String r13 = r10.f353972g
            r12[r1] = r13
            java.lang.String r13 = "restoreLastSesssion, curPage: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r13, r12)
            java.lang.String r12 = r10.f353969d
            int r10 = r10.f353977o
            ca1.C113264b.m155056b(r11, r12, r10, r14)
        L_0x009e:
            java.lang.String r10 = ba1.C16780k.m16423b()
            if (r10 != 0) goto L_0x00a6
            java.lang.String r10 = ""
        L_0x00a6:
            r11.f64102v = r10
            ba1.C16777c.m16409a(r11)
            z91.b r10 = z91.C23462b.m28021f()
            r10.mo36932s(r11)
            goto L_0x00e8
        L_0x00b3:
            java.lang.Object[] r10 = new java.lang.Object[r3]
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r11)
            r10[r1] = r3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            r10[r0] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r10[r2] = r1
            java.lang.String r1 = "_onFloatSessionExit, lastValidateSession[FALSE], finish=%b, floatClickEvent=%s, floatEventType=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r1, r10)
            if (r11 != 0) goto L_0x00e8
            if (r12 != r0) goto L_0x00e8
            if (r13 != r0) goto L_0x00e8
            z91.b r10 = z91.C23462b.m28021f()
            te3.fa3 r11 = r6.f354527e
            java.lang.String r12 = r11.f353996j
            int r11 = r11.f353997n
            r10.mo36934u(r12, r11, r14)
            te3.fa3 r10 = r6.f354527e
            java.lang.String r11 = r10.f353996j
            int r10 = r10.f353997n
            ca1.C113264b.m155056b(r5, r11, r10, r14)
        L_0x00e8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ga1.C20819a.mo32510a(te3.ka3, boolean, int, int, long):void");
    }
}
