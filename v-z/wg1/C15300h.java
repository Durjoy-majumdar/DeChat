package wg1;

import a14.C0000n0;
import a14.C53930o0;
import a14.C53973z1;
import android.content.Context;
import android.view.View;
import cj1.C0528d1;
import cj1.C0581o5;
import cj1.C0639y1;
import cl1.C0702z0;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import fj1.C45795b;
import gy3.C87412m;
import ig1.C8916d;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CancellationException;
import nk1.C61788m;
import ok1.C62042e;
import pe3.C89349b;
import te3.C48770aw0;
import te3.C49765hx0;
import te3.C50037ju0;
import te3.C50767p11;
import te3.C51443tt0;
import te3.C52013xs0;
import y50.C53496k;

/* renamed from: wg1.h */
public final class C15300h implements C15253a {

    /* renamed from: d */
    public final View f41596d;

    /* renamed from: e */
    public final Context f41597e;

    /* renamed from: f */
    public final C45795b f41598f;

    /* renamed from: g */
    public final C58124b f41599g;

    /* renamed from: h */
    public C0000n0 f41600h = C53930o0.m60555b();

    /* renamed from: i */
    public C53973z1 f41601i;

    /* renamed from: j */
    public C15256b f41602j;

    /* renamed from: n */
    public final C0000n0 f41603n = C53930o0.m60555b();

    public C15300h(View view, Context context, C45795b bVar, C58124b bVar2, C56032b bVar3) {
        C87412m.m108594g(view, "viewRoot");
        C87412m.m108594g(context, "context");
        C87412m.m108594g(bVar, "liveData");
        C87412m.m108594g(bVar2, "statusMonitor");
        C87412m.m108594g(bVar3, "basePluginLayout");
        this.f41596d = view;
        this.f41597e = context;
        this.f41598f = bVar;
        this.f41599g = bVar2;
    }

    /* renamed from: e */
    public static final void m14312e(C15300h hVar, String str, int i, String str2) {
        String str3;
        C61788m mVar;
        hVar.getClass();
        Class cls = C54991o.class;
        C0639y1 y1Var = C0639y1.f1510a;
        boolean e = y1Var.mo613e(str);
        C8916d d = y1Var.mo612d(str);
        if (d != null) {
            C52013xs0 xs02 = new C52013xs0();
            C50037ju0 ju02 = new C50037ju0();
            ju02.f136329d = d.field_rewardProductId;
            xs02.f144906h = C89349b.m111674a(ju02.toByteArray());
            C49765hx0 hx02 = new C49765hx0();
            FinderLiveService finderLiveService = FinderLiveService.f159376d;
            C54991o oVar = (C54991o) finderLiveService.mo77630e(cls);
            LinkedList<C48770aw0> linkedList = null;
            LinkedList<C48770aw0> linkedList2 = oVar != null ? oVar.f154320h : null;
            if (linkedList2 != null) {
                ArrayList arrayList = new ArrayList();
                for (T next : linkedList2) {
                    if (((C48770aw0) next).f130789d != 4) {
                        arrayList.add(next);
                    }
                }
                linkedList = new LinkedList<>(arrayList);
            }
            hx02.f134930r = linkedList;
            C62042e eVar = C62042e.f176370a;
            hx02.f134919d = eVar.mo87050W(hVar.f41598f);
            hx02.f134926n = eVar.mo87036R();
            xs02.f144914s = hx02;
            xs02.f144903e = 20009;
            C61788m.C11208b bVar = new C61788m.C11208b(xs02);
            bVar.f33044h = str2;
            bVar.f33045i = i;
            bVar.f33041e = i > 1 ? e ? C61788m.C11209c.SELF_PRECIOUS_GIFT_COMBO : C61788m.C11209c.SELF_NORMAL_GIFT_COMBO : e ? C61788m.C11209c.SELF_PRECIOUS_GIFT_SOLO : C61788m.C11209c.SELF_NORMAL_GIFT_SOLO;
            C54991o oVar2 = (C54991o) finderLiveService.mo77630e(cls);
            if (oVar2 == null || (str3 = oVar2.f154345o) == null) {
                str3 = "";
            }
            bVar.f33051r = str3;
            Log.m105924i("FinderLiveAllowanceGiftBubblePresenter", "#addLocalGiftMsg local add GiftShowInfo:" + bVar);
            C54991o oVar3 = (C54991o) finderLiveService.mo77630e(cls);
            if (oVar3 != null && (mVar = oVar3.f154316g) != null) {
                mVar.mo86704b(bVar);
                return;
            }
            return;
        }
        Log.m105924i("FinderLiveAllowanceGiftBubblePresenter", "#addLocalGiftMsg giftInfo is null,giftId:" + str + ",cnt:" + i + ",comboId:" + str2);
    }

    /* renamed from: n */
    public static final void m14313n(C15300h hVar, String str, String str2, int i) {
        String str3;
        C50767p11 p112;
        List<C0581o5> list;
        hVar.getClass();
        Log.m105924i("FinderLiveAllowanceGiftBubblePresenter", "#addSelfGiftToComment giftId:" + str + " comboCount:" + i + ",comboId:" + str2);
        if (!(str == null || str.length() == 0) && i > 0) {
            if (!(str2 == null || str2.length() == 0)) {
                C52013xs0 xs02 = new C52013xs0();
                C49765hx0 hx02 = new C49765hx0();
                C62042e eVar = C62042e.f176370a;
                hx02.f134919d = eVar.mo87050W(hVar.f41598f);
                FinderLiveService finderLiveService = FinderLiveService.f159376d;
                C54991o oVar = (C54991o) finderLiveService.mo77630e(C54991o.class);
                C50767p11 p113 = null;
                hx02.f134930r = oVar != null ? oVar.f154320h : null;
                hx02.f134926n = eVar.mo87036R();
                xs02.f144914s = hx02;
                xs02.f144903e = 20013;
                C0528d1 d1Var = new C0528d1(xs02);
                d1Var.f1294d = true;
                C51443tt0 tt02 = new C51443tt0();
                tt02.f142388d = str;
                tt02.f142392h = str2;
                tt02.f142391g = i;
                C8916d d = C0639y1.f1510a.mo612d(str);
                if (d != null) {
                    p113 = d.mo9725p2();
                }
                tt02.f142389e = p113;
                d1Var.f1293c = tt02;
                C0702z0 z0Var = (C0702z0) finderLiveService.mo77630e(C0702z0.class);
                if (!(z0Var == null || (list = z0Var.f1672f) == null)) {
                    list.add(d1Var);
                }
                Log.m105924i("FinderLiveAllowanceGiftBubblePresenter", "#addSelfGiftToComment comboCount:" + i + ",comboId:" + str2 + ",username:" + d1Var.mo571e());
                C53496k.f150436a.mo74169b();
                Context context = hVar.f41597e;
                Object[] objArr = new Object[3];
                objArr[0] = d1Var.mo573g();
                C51443tt0 tt03 = d1Var.f1293c;
                if (tt03 == null || (p112 = tt03.f142389e) == null || (str3 = p112.f139515o) == null) {
                    str3 = "";
                }
                objArr[1] = str3;
                objArr[2] = String.valueOf(i);
                String string = context.getString(C0966R.string.djj, objArr);
                C87412m.m108593f(string, "context.getString(\n     …\", comboCount.toString())");
                hVar.f41596d.announceForAccessibility(string);
            }
        }
    }

    public void onAttach(Object obj) {
        C15256b bVar = (C15256b) obj;
        C87412m.m108594g(bVar, "callback");
        this.f41602j = bVar;
        bVar.mo14157k(new C15260c(this));
    }

    public void onDetach() {
        C15256b bVar = this.f41602j;
        if (bVar != null) {
            bVar.mo14158s0();
        }
        C53973z1 z1Var = this.f41601i;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0070, code lost:
        if ((gg1.C32444a.f86203u1.mo60266n().intValue() == 1 ? true : r1.f1541i) == true) goto L_0x0074;
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo14163q() {
        /*
            r17 = this;
            r0 = r17
            java.lang.Class<cl1.a> r1 = cl1.C0651a.class
            a14.z1 r2 = r0.f41601i
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x000d
            a14.C53973z1.C53974a.m60623a(r2, r4, r3, r4)
        L_0x000d:
            ok1.e r2 = ok1.C62042e.f176370a
            boolean r2 = r2.mo87027N0()
            java.lang.String r5 = "FinderLiveAllowanceGiftBubblePresenter"
            r6 = 0
            if (r2 == 0) goto L_0x0088
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r7 = "#updateBubbleInfo isAnchorNeedShowGuide="
            r2.append(r7)
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r7 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            androidx.lifecycle.i0 r8 = r7.mo77630e(r1)
            cl1.a r8 = (cl1.C0651a) r8
            if (r8 == 0) goto L_0x0047
            pe1.c<java.lang.Integer> r4 = gg1.C32444a.f86203u1
            java.lang.Object r4 = r4.mo60266n()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            if (r4 != r3) goto L_0x003c
            r4 = 1
            goto L_0x003d
        L_0x003c:
            r4 = 0
        L_0x003d:
            if (r4 == 0) goto L_0x0041
            r4 = 1
            goto L_0x0043
        L_0x0041:
            boolean r4 = r8.f1541i
        L_0x0043:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
        L_0x0047:
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r2)
            androidx.lifecycle.i0 r1 = r7.mo77630e(r1)
            cl1.a r1 = (cl1.C0651a) r1
            if (r1 == 0) goto L_0x0073
            pe1.c<java.lang.Integer> r2 = gg1.C32444a.f86203u1
            java.lang.Object r2 = r2.mo60266n()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            if (r2 != r3) goto L_0x0069
            r2 = 1
            goto L_0x006a
        L_0x0069:
            r2 = 0
        L_0x006a:
            if (r2 == 0) goto L_0x006e
            r1 = 1
            goto L_0x0070
        L_0x006e:
            boolean r1 = r1.f1541i
        L_0x0070:
            if (r1 != r3) goto L_0x0073
            goto L_0x0074
        L_0x0073:
            r3 = 0
        L_0x0074:
            if (r3 == 0) goto L_0x007f
            wg1.b r1 = r0.f41602j
            if (r1 == 0) goto L_0x014e
            r1.mo14156H()
            goto L_0x014e
        L_0x007f:
            wg1.b r1 = r0.f41602j
            if (r1 == 0) goto L_0x014e
            r1.mo14158s0()
            goto L_0x014e
        L_0x0088:
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r2 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            java.lang.Class<cl1.o> r7 = cl1.C54991o.class
            androidx.lifecycle.i0 r7 = r2.mo77630e(r7)
            cl1.o r7 = (cl1.C54991o) r7
            if (r7 == 0) goto L_0x009a
            boolean r7 = r7.f154190D
            if (r7 != r3) goto L_0x009a
            r7 = 1
            goto L_0x009b
        L_0x009a:
            r7 = 0
        L_0x009b:
            if (r7 == 0) goto L_0x00a6
            wg1.b r1 = r0.f41602j
            if (r1 == 0) goto L_0x014e
            r1.mo14158s0()
            goto L_0x014e
        L_0x00a6:
            androidx.lifecycle.i0 r7 = r2.mo77630e(r1)
            cl1.a r7 = (cl1.C0651a) r7
            if (r7 == 0) goto L_0x00ce
            pe1.c<java.lang.Integer> r8 = gg1.C32444a.f86203u1
            java.lang.Object r8 = r8.mo60266n()
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            if (r8 != r3) goto L_0x00be
            r8 = 1
            goto L_0x00bf
        L_0x00be:
            r8 = 0
        L_0x00bf:
            if (r8 == 0) goto L_0x00cb
            long r7 = java.lang.System.currentTimeMillis()
            r9 = 86400000(0x5265c00, float:7.82218E-36)
            long r9 = (long) r9
            long r7 = r7 + r9
            goto L_0x00d0
        L_0x00cb:
            long r7 = r7.f1540h
            goto L_0x00d0
        L_0x00ce:
            r7 = -1
        L_0x00d0:
            long r9 = java.lang.System.currentTimeMillis()
            long r9 = r7 - r9
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "#updateBubbleInfo allowancePackageId="
            r11.append(r12)
            androidx.lifecycle.i0 r12 = r2.mo77630e(r1)
            cl1.a r12 = (cl1.C0651a) r12
            if (r12 == 0) goto L_0x00ed
            java.lang.String r12 = r12.mo622c3()
            goto L_0x00ee
        L_0x00ed:
            r12 = r4
        L_0x00ee:
            r11.append(r12)
            java.lang.String r12 = " cutOffTime="
            r11.append(r12)
            r11.append(r7)
            java.lang.String r7 = " remainingTime="
            r11.append(r7)
            r11.append(r9)
            java.lang.String r7 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r7)
            androidx.lifecycle.i0 r1 = r2.mo77630e(r1)
            cl1.a r1 = (cl1.C0651a) r1
            if (r1 == 0) goto L_0x0147
            java.lang.String r2 = r1.mo622c3()
            int r2 = r2.length()
            if (r2 <= 0) goto L_0x011c
            r2 = 1
            goto L_0x011d
        L_0x011c:
            r2 = 0
        L_0x011d:
            if (r2 == 0) goto L_0x0126
            r7 = 0
            int r2 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r2 <= 0) goto L_0x0126
            goto L_0x0127
        L_0x0126:
            r3 = 0
        L_0x0127:
            if (r3 == 0) goto L_0x012a
            goto L_0x012b
        L_0x012a:
            r1 = r4
        L_0x012b:
            if (r1 == 0) goto L_0x0147
            wg1.b r1 = r0.f41602j
            if (r1 == 0) goto L_0x0134
            r1.mo14156H()
        L_0x0134:
            a14.n0 r11 = r0.f41603n
            r12 = 0
            r13 = 0
            wg1.g r14 = new wg1.g
            r14.<init>(r9, r0, r4)
            r15 = 3
            r16 = 0
            a14.z1 r1 = a14.C53895h.m60466d(r11, r12, r13, r14, r15, r16)
            r0.f41601i = r1
            goto L_0x014e
        L_0x0147:
            wg1.b r1 = r0.f41602j
            if (r1 == 0) goto L_0x014e
            r1.mo14158s0()
        L_0x014e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wg1.C15300h.mo14163q():void");
    }
}
