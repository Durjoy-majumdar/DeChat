package com.tencent.p014mm.plugin.finder.nearby.live.square;

import ak1.C54067f0;
import ak1.C54108o;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import bd1.C54446b;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.nearby.NearbyHomeUIC;
import com.tencent.p014mm.plugin.finder.nearby.base.AbsNearByFragment;
import com.tencent.p014mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C7335d;
import di3.C86312j;
import eb0.C31543z5;
import er1.C58739j4;
import gy3.C87412m;
import ht1.C8777j5;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import ln1.C10585g;
import mk1.C10899a;
import mk1.C10901c;
import mk1.C10902d;
import mk1.C10903e;
import mk1.C10904f;
import mk1.C10905g;
import mk1.C10906h;
import ph1.C62293i;
import qo3.C77426q;
import rm1.C13087a;
import rs1.C13442s8;
import sx3.C110826x0;
import tf0.C64916p1;
import um1.C14248a;
import vc1.C37715b;
import wm1.C15530g;
import zc1.C66783a;
import zc1.C66785b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/nearby/live/square/NearbyLiveSquareFragment;", "Lcom/tencent/mm/plugin/finder/nearby/base/AbsNearByFragment;", "<init>", "()V", "plugin-finder-nearby_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareFragment */
public class NearbyLiveSquareFragment extends AbsNearByFragment {
    public NearbyLiveSquareFragment() {
        super(C0966R.string.f361089h70, 1001);
    }

    /* renamed from: L */
    public Set<Class<? extends UIComponent>> mo2201L() {
        return C110826x0.m151017e(C13442s8.class, C14248a.class, C15530g.class, NearbyLiveSquareUIC.class);
    }

    /* renamed from: O */
    public void mo2202O() {
        NearbyLiveSquareTabFragment d3;
        super.mo2202O();
        if (getActivity() != null && (d3 = ((NearbyLiveSquareUIC) mo82247K(NearbyLiveSquareUIC.class)).mo3605d3()) != null) {
            d3.mo2202O();
        }
    }

    /* renamed from: P */
    public void mo3550P() {
        super.mo3550P();
        NearbyLiveSquareTabFragment d3 = ((NearbyLiveSquareUIC) mo82247K(NearbyLiveSquareUIC.class)).mo3605d3();
        if (d3 != null) {
            d3.mo3550P();
        }
    }

    /* renamed from: R */
    public int mo2203R() {
        return 94;
    }

    /* renamed from: U */
    public String mo3553U() {
        return "1001";
    }

    /* renamed from: V */
    public String mo3554V() {
        return "";
    }

    /* renamed from: X */
    public int mo3555X() {
        return 3;
    }

    /* renamed from: a0 */
    public void mo3558a0() {
        NearbyLiveSquareTabFragment d3 = ((NearbyLiveSquareUIC) mo82247K(NearbyLiveSquareUIC.class)).mo3605d3();
        if (d3 != null) {
            d3.mo3558a0();
        }
    }

    /* renamed from: d0 */
    public void mo3559d0() {
        boolean z;
        boolean z2;
        Class cls = C54108o.class;
        C10905g gVar = ((NearbyLiveSquareUIC) mo82247K(NearbyLiveSquareUIC.class)).f15658g;
        if (gVar != null) {
            Class cls2 = C8777j5.class;
            Class cls3 = C64916p1.class;
            Log.m105924i("Finder.FinderLivePostForNearby", "prepare()");
            C7335d c = C86312j.m106911c(cls2);
            C87412m.m108593f(c, "getService(IHellLiveReport::class.java)");
            C10906h hVar = gVar.f32532f;
            C8777j5.C8778a.m8601b((C8777j5) c, 2, hVar.f32535b, hVar.f32536c, (Map) null, 8, (Object) null);
            C66785b bVar = C66785b.f191882e;
            String O5 = bVar.mo90662O5();
            boolean z3 = false;
            if (!NetStatusUtil.isConnected((Context) gVar.f32530d)) {
                C77426q qVar = new C77426q(gVar.f32530d);
                qVar.mo107595g(gVar.f32530d.getResources().getString(C0966R.string.dpr));
                qVar.mo107602n(gVar.f32530d.getResources().getString(C0966R.string.f8028zq));
                qVar.mo107600l(C10899a.f32523a);
                qVar.mo107603o();
                Log.m105920e("Finder.FinderLivePostForNearby", "checkNetworkAvailable() network problem");
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                Log.m105920e("Finder.FinderLivePostForNearby", "prepare() checkNetworkAvailable failed");
            } else {
                Log.m105924i("Finder.FinderLivePostForNearby", "checkAccountValid()");
                if (Util.isNullOrNil(O5)) {
                    Log.m105924i("Finder.FinderLivePostForNearby", "checkAccountValid() need create finder contact.");
                    ((C54108o) C86312j.m106911c(cls)).getClass();
                    C54067f0 f0Var = C54108o.f151869h;
                    C54067f0.C0056f0 f0Var2 = C54067f0.C0056f0.CREATE_FINDER;
                    f0Var.getClass();
                    f0Var.f151458g0 = f0Var2;
                    C7335d c2 = C86312j.m106911c(cls3);
                    C87412m.m108593f(c2, "getService(IFinderCommon…atureService::class.java)");
                    ((C64916p1) c2).mo76712p8(gVar.f32530d, 3, (Intent) null);
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (!z2) {
                    Log.m105920e("Finder.FinderLivePostForNearby", "prepare() checkAccountValid failed");
                } else {
                    C54446b c3 = C66783a.C66784a.m78800c(bVar, false, 1, (Object) null);
                    if (c3 != null && c3.mo75252n2()) {
                        z3 = true;
                    }
                    if (z3) {
                        C58739j4.f168176a.mo83706e0();
                    } else {
                        ((C54108o) C86312j.m106911c(cls)).getClass();
                        C54067f0 f0Var3 = C54108o.f151869h;
                        C54067f0.C0056f0 f0Var4 = C54067f0.C0056f0.START_LIVE_BY_FINDER_IDENTITY;
                        f0Var3.getClass();
                        f0Var3.f151458g0 = f0Var4;
                        if (C37715b.f99914a.mo61298a()) {
                            C7335d c4 = C86312j.m106911c(cls3);
                            C87412m.m108593f(c4, "getService(IFinderCommon…atureService::class.java)");
                            C64916p1.C64917a.m76445l((C64916p1) c4, gVar.f32530d, O5, new C10901c(gVar), C10902d.f32527d, (DialogInterface.OnDismissListener) null, false, 48, (Object) null);
                        } else {
                            C7335d c5 = C86312j.m106911c(cls3);
                            C87412m.m108593f(c5, "getService(IFinderCommon…atureService::class.java)");
                            C64916p1.C64917a.m76445l((C64916p1) c5, gVar.f32530d, O5, new C10903e(gVar), C10904f.f32529d, (DialogInterface.OnDismissListener) null, false, 48, (Object) null);
                        }
                        C7335d c6 = C86312j.m106911c(cls2);
                        C87412m.m108593f(c6, "getService(IHellLiveReport::class.java)");
                        C10906h hVar2 = gVar.f32532f;
                        C8777j5.C8778a.m8601b((C8777j5) c6, 3, hVar2.f32535b, hVar2.f32536c, (Map) null, 8, (Object) null);
                    }
                }
            }
            ((C54108o) C86312j.m106911c(cls)).mo9609ap(C54067f0.C0054e0.ENTER_PAGE_EXPLORE);
            return;
        }
        C87412m.m108603p("livePostHelper");
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:159:0x0371  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0392  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x03bf  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x03cd  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x03d1  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x03d5  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x03ee  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x03f2  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01d7  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0206  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x020c  */
    /* renamed from: e0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3604e0(android.app.Activity r40) {
        /*
            r39 = this;
            r0 = r39
            r10 = r40
            java.lang.Class<ht1.x4> r11 = ht1.C8815x4.class
            java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r1 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
            java.lang.String r2 = "activity"
            gy3.C87412m.m108594g(r10, r2)
            vc1.b r2 = vc1.C37715b.f99914a
            boolean r2 = r2.mo61298a()
            java.lang.String r3 = "nearby_live_target_cover_url_params_key"
            java.lang.String r4 = "nearby_live_target_nick_name_params_key"
            java.lang.String r5 = "nearby_live_target_user_name_params_key"
            java.lang.String r6 = "nearby_live_target_nonce_id_params_key"
            java.lang.String r7 = "nearby_live_target_tab_id_params_key"
            java.lang.String r8 = "nearby_live_target_object_id_params_key"
            java.lang.String r12 = " activity:"
            java.lang.String r13 = " targetObjectId:"
            java.lang.String r14 = " enterLiveAction:"
            java.lang.String r9 = ""
            java.lang.String r15 = "nearby_live_target_square_page_params_key"
            r16 = r12
            java.lang.String r12 = " commentScene="
            r17 = r9
            java.lang.String r9 = "NearbyLiveTab"
            r18 = r13
            java.lang.String r13 = "NearbyLiveSquareFragment"
            r19 = r14
            r20 = 0
            r22 = 0
            if (r2 == 0) goto L_0x0246
            java.lang.String r2 = "FinderLiveEntrance"
            pe1.c<java.lang.Integer> r25 = gg1.C32444a.f86187q1
            java.lang.Object r25 = r25.mo60266n()
            java.lang.Number r25 = (java.lang.Number) r25
            int r14 = r25.intValue()
            r25 = r15
            r15 = 1
            if (r14 != r15) goto L_0x0052
            r14 = 1
            goto L_0x0053
        L_0x0052:
            r14 = 0
        L_0x0053:
            if (r14 == 0) goto L_0x0096
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            android.content.Intent r2 = r40.getIntent()
            java.lang.String r3 = "key_request_scene"
            r15 = 0
            if (r2 == 0) goto L_0x0068
            int r14 = r2.getIntExtra(r3, r15)
            goto L_0x0069
        L_0x0068:
            r14 = 0
        L_0x0069:
            r1.putInt(r3, r14)
            android.os.Bundle r2 = r39.getArguments()
            if (r2 != 0) goto L_0x0076
            r0.setArguments(r1)
            goto L_0x007f
        L_0x0076:
            android.os.Bundle r2 = r39.getArguments()
            if (r2 == 0) goto L_0x007f
            r2.putAll(r1)
        L_0x007f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "prepareNearbySquare newSquareEnable:true scene:"
            r1.append(r2)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r1)
            r2 = r0
            goto L_0x0243
        L_0x0096:
            r15 = 0
            di3.d r1 = di3.C86312j.m106911c(r1)
            com.tencent.mm.plugin.FinderCommonFeatureService r1 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r1
            com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager r1 = r1.Nt0()
            android.os.Bundle r14 = new android.os.Bundle
            r14.<init>()
            com.tencent.mm.plugin.finder.extension.reddot.s0 r15 = r1.mo77227G5(r2)
            if (r15 == 0) goto L_0x0189
            te3.nn1 r2 = r15.mo77308o2(r2)
            if (r2 == 0) goto L_0x0189
            te3.xi1 r2 = r15.field_ctrInfo
            int r2 = r2.f144670e
            r0 = 16
            if (r2 != r0) goto L_0x0189
            r1.mo77242O(r15)
            te3.yi1 r0 = r1.mo77279s(r9)
            if (r0 == 0) goto L_0x00c6
            int r0 = r0.f186558s
            goto L_0x00c7
        L_0x00c6:
            r0 = 0
        L_0x00c7:
            te3.yi1 r2 = r1.mo77279s(r9)
            if (r2 == 0) goto L_0x00d1
            int r2 = r2.f186559t
            r15 = r2
            goto L_0x00d2
        L_0x00d1:
            r15 = 0
        L_0x00d2:
            te3.yi1 r2 = r1.mo77279s(r9)
            r27 = r12
            r26 = r13
            if (r2 == 0) goto L_0x00df
            long r12 = r2.f186549g
            goto L_0x00e1
        L_0x00df:
            r12 = r20
        L_0x00e1:
            te3.yi1 r2 = r1.mo77279s(r9)
            if (r2 == 0) goto L_0x00ee
            java.lang.String r2 = r2.f186554o
            if (r2 == 0) goto L_0x00ee
            r36 = r11
            goto L_0x00f2
        L_0x00ee:
            r36 = r11
            r2 = r17
        L_0x00f2:
            te3.yi1 r11 = r1.mo77279s(r9)
            if (r11 == 0) goto L_0x00fd
            java.lang.String r11 = r11.f186560u
            if (r11 == 0) goto L_0x00fd
            goto L_0x00ff
        L_0x00fd:
            r11 = r17
        L_0x00ff:
            te3.yi1 r10 = r1.mo77279s(r9)
            if (r10 == 0) goto L_0x010a
            java.lang.String r10 = r10.f186561v
            if (r10 == 0) goto L_0x010a
            goto L_0x010c
        L_0x010a:
            r10 = r17
        L_0x010c:
            te3.yi1 r1 = r1.mo77279s(r9)
            if (r1 == 0) goto L_0x0118
            java.lang.String r1 = r1.f186562w
            if (r1 == 0) goto L_0x0118
            r9 = r1
            goto L_0x011a
        L_0x0118:
            r9 = r17
        L_0x011a:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
            r1.intValue()
            r17 = r1
            r1 = 1
            if (r15 != r1) goto L_0x0128
            r1 = 1
            goto L_0x0129
        L_0x0128:
            r1 = 0
        L_0x0129:
            if (r1 == 0) goto L_0x012e
            r1 = r17
            goto L_0x0130
        L_0x012e:
            r1 = r22
        L_0x0130:
            if (r1 == 0) goto L_0x0185
            r1.intValue()
            int r1 = (r12 > r20 ? 1 : (r12 == r20 ? 0 : -1))
            if (r1 == 0) goto L_0x017c
            r14.putLong(r8, r12)
            r14.putInt(r7, r0)
            r14.putString(r6, r2)
            r14.putString(r5, r11)
            r14.putString(r4, r10)
            r14.putString(r3, r9)
            mm1.b r1 = mm1.C10935b.f32585a
            r8 = r40
            boolean r3 = r8 instanceof com.tencent.p014mm.p136ui.MMActivity
            if (r3 == 0) goto L_0x0159
            r3 = r8
            com.tencent.mm.ui.MMActivity r3 = (com.tencent.p014mm.p136ui.MMActivity) r3
            r29 = r3
            goto L_0x015b
        L_0x0159:
            r29 = r22
        L_0x015b:
            r33 = 0
            int r34 = r39.mo2203R()
            r35 = 0
            r28 = r1
            r30 = r12
            r32 = r2
            r28.mo11135a(r29, r30, r32, r33, r34, r35)
            r17 = r2
            r2 = r40
            r3 = r0
            r4 = r12
            r6 = r17
            r7 = r11
            r11 = r8
            r8 = r10
            r1.mo11136d(r2, r3, r4, r6, r7, r8, r9)
            r1 = 0
            goto L_0x017f
        L_0x017c:
            r11 = r40
            r1 = 1
        L_0x017f:
            r37 = r15
            r15 = r1
            r1 = r37
            goto L_0x0195
        L_0x0185:
            r11 = r40
            r1 = r15
            goto L_0x0194
        L_0x0189:
            r36 = r11
            r27 = r12
            r26 = r13
            r11 = r10
            r12 = r20
            r0 = 0
            r1 = 0
        L_0x0194:
            r15 = 1
        L_0x0195:
            if (r15 == 0) goto L_0x01a8
            bl3.r r2 = bl3.C39818r.f106831a
            bl3.r$a r2 = r2.mo62443b(r11)
            r10 = r36
            bl3.c r2 = r2.mo62447c(r10)
            ht1.x4 r2 = (ht1.C8815x4) r2
            r2.mo9641e1()
        L_0x01a8:
            if (r0 != 0) goto L_0x01d7
            fm1.o r0 = fm1.C8164o.f27042a
            int r2 = r39.mo2203R()
            int r0 = r0.mo9219c(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "prepareNewSquare use last cache targetTabId="
            r2.append(r3)
            r2.append(r0)
            r15 = r27
            r2.append(r15)
            int r3 = r39.mo2203R()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = r26
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            goto L_0x01d9
        L_0x01d7:
            r3 = r26
        L_0x01d9:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r2.intValue()
            if (r0 == 0) goto L_0x01e5
            r24 = 1
            goto L_0x01e7
        L_0x01e5:
            r24 = 0
        L_0x01e7:
            if (r24 == 0) goto L_0x01eb
            r22 = r2
        L_0x01eb:
            if (r22 == 0) goto L_0x0200
            r22.intValue()
            te3.x91 r2 = new te3.x91
            r2.<init>()
            r2.f144531d = r0
            byte[] r2 = r2.toByteArray()
            r4 = r25
            r14.putByteArray(r4, r2)
        L_0x0200:
            android.os.Bundle r2 = r39.getArguments()
            if (r2 != 0) goto L_0x020c
            r2 = r39
            r2.setArguments(r14)
            goto L_0x0217
        L_0x020c:
            r2 = r39
            android.os.Bundle r4 = r39.getArguments()
            if (r4 == 0) goto L_0x0217
            r4.putAll(r14)
        L_0x0217:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "prepareNearbySquare newSquareEnable:false, targetTabId="
            r4.append(r5)
            r4.append(r0)
            r0 = r19
            r4.append(r0)
            r4.append(r1)
            r14 = r18
            r4.append(r14)
            r4.append(r12)
            r12 = r16
            r4.append(r12)
            r4.append(r11)
            java.lang.String r0 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
        L_0x0243:
            r0 = r2
            goto L_0x0427
        L_0x0246:
            r14 = r18
            r0 = r19
            r37 = r11
            r11 = r10
            r10 = r37
            r38 = r15
            r15 = r12
            r12 = r13
            r13 = r38
            java.lang.String r2 = "NearbyEntrance"
            di3.d r1 = di3.C86312j.m106911c(r1)
            com.tencent.mm.plugin.FinderCommonFeatureService r1 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r1
            com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager r1 = r1.Nt0()
            r18 = r14
            android.os.Bundle r14 = new android.os.Bundle
            r14.<init>()
            r19 = r0
            com.tencent.mm.plugin.finder.extension.reddot.s0 r0 = r1.mo77227G5(r2)
            if (r0 == 0) goto L_0x035c
            te3.nn1 r2 = r0.mo77308o2(r2)
            if (r2 == 0) goto L_0x035c
            te3.xi1 r2 = r0.field_ctrInfo
            int r2 = r2.f144670e
            r25 = r13
            r13 = 16
            if (r2 != r13) goto L_0x0355
            r1.mo77242O(r0)
            te3.yi1 r0 = r1.mo77279s(r9)
            if (r0 == 0) goto L_0x028c
            int r0 = r0.f186558s
            goto L_0x028d
        L_0x028c:
            r0 = 0
        L_0x028d:
            te3.yi1 r2 = r1.mo77279s(r9)
            if (r2 == 0) goto L_0x0297
            int r2 = r2.f186559t
            r13 = r2
            goto L_0x0298
        L_0x0297:
            r13 = 0
        L_0x0298:
            te3.yi1 r2 = r1.mo77279s(r9)
            r36 = r10
            if (r2 == 0) goto L_0x02a3
            long r10 = r2.f186549g
            goto L_0x02a5
        L_0x02a3:
            r10 = r20
        L_0x02a5:
            te3.yi1 r2 = r1.mo77279s(r9)
            if (r2 == 0) goto L_0x02b3
            java.lang.String r2 = r2.f186554o
            if (r2 != 0) goto L_0x02b0
            goto L_0x02b3
        L_0x02b0:
            r23 = r12
            goto L_0x02b7
        L_0x02b3:
            r23 = r12
            r2 = r17
        L_0x02b7:
            te3.yi1 r12 = r1.mo77279s(r9)
            if (r12 == 0) goto L_0x02c5
            java.lang.String r12 = r12.f186560u
            if (r12 != 0) goto L_0x02c2
            goto L_0x02c5
        L_0x02c2:
            r34 = r15
            goto L_0x02c9
        L_0x02c5:
            r34 = r15
            r12 = r17
        L_0x02c9:
            te3.yi1 r15 = r1.mo77279s(r9)
            if (r15 == 0) goto L_0x02d3
            java.lang.String r15 = r15.f186561v
            if (r15 != 0) goto L_0x02d5
        L_0x02d3:
            r15 = r17
        L_0x02d5:
            te3.yi1 r1 = r1.mo77279s(r9)
            if (r1 == 0) goto L_0x02e2
            java.lang.String r1 = r1.f186562w
            if (r1 != 0) goto L_0x02e0
            goto L_0x02e2
        L_0x02e0:
            r9 = r1
            goto L_0x02e4
        L_0x02e2:
            r9 = r17
        L_0x02e4:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r1.intValue()
            r17 = r1
            r1 = 1
            if (r13 != r1) goto L_0x02f3
            r24 = 1
            goto L_0x02f5
        L_0x02f3:
            r24 = 0
        L_0x02f5:
            if (r24 == 0) goto L_0x02f8
            goto L_0x02fa
        L_0x02f8:
            r17 = r22
        L_0x02fa:
            if (r17 == 0) goto L_0x034b
            r17.intValue()
            int r17 = (r10 > r20 ? 1 : (r10 == r20 ? 0 : -1))
            if (r17 == 0) goto L_0x034b
            r14.putLong(r8, r10)
            r14.putInt(r7, r0)
            r14.putString(r6, r2)
            r14.putString(r5, r12)
            r14.putString(r4, r15)
            r14.putString(r3, r9)
            mm1.b r3 = mm1.C10935b.f32585a
            r8 = r40
            boolean r4 = r8 instanceof com.tencent.p014mm.p136ui.MMActivity
            if (r4 == 0) goto L_0x0323
            r4 = r8
            com.tencent.mm.ui.MMActivity r4 = (com.tencent.p014mm.p136ui.MMActivity) r4
            r27 = r4
            goto L_0x0325
        L_0x0323:
            r27 = r22
        L_0x0325:
            r31 = 0
            int r32 = r39.mo2203R()
            r33 = 0
            r26 = r3
            r28 = r10
            r30 = r2
            r26.mo11135a(r27, r28, r30, r31, r32, r33)
            r17 = 1
            r1 = r3
            r7 = r39
            r6 = r2
            r2 = r40
            r3 = r0
            r4 = r10
            r24 = r0
            r0 = r7
            r7 = r12
            r12 = r8
            r8 = r15
            r1.mo11136d(r2, r3, r4, r6, r7, r8, r9)
            r15 = 0
            goto L_0x036f
        L_0x034b:
            r12 = r40
            r24 = r0
            r17 = 1
            r0 = r39
            r15 = 1
            goto L_0x036f
        L_0x0355:
            r0 = r39
            r36 = r10
            r23 = r12
            goto L_0x0364
        L_0x035c:
            r0 = r39
            r36 = r10
            r23 = r12
            r25 = r13
        L_0x0364:
            r34 = r15
            r17 = 1
            r12 = r11
            r10 = r20
            r13 = 0
            r15 = 1
            r24 = 0
        L_0x036f:
            if (r15 == 0) goto L_0x0382
            bl3.r r1 = bl3.C39818r.f106831a
            bl3.r$a r1 = r1.mo62443b(r12)
            r2 = r36
            bl3.c r1 = r1.mo62447c(r2)
            ht1.x4 r1 = (ht1.C8815x4) r1
            r1.mo9641e1()
        L_0x0382:
            if (r24 != 0) goto L_0x03bf
            pe1.c<java.lang.Integer> r1 = gg1.C32444a.f86187q1
            java.lang.Object r1 = r1.mo60266n()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            if (r1 != 0) goto L_0x03bf
            fm1.o r1 = fm1.C8164o.f27042a
            int r2 = r39.mo2203R()
            int r1 = r1.mo9219c(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "prepareNearbyLive use last cache targetTabId="
            r2.append(r3)
            r2.append(r1)
            r3 = r34
            r2.append(r3)
            int r3 = r39.mo2203R()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = r23
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            goto L_0x03c3
        L_0x03bf:
            r3 = r23
            r1 = r24
        L_0x03c3:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r2.intValue()
            if (r1 == 0) goto L_0x03cd
            goto L_0x03cf
        L_0x03cd:
            r17 = 0
        L_0x03cf:
            if (r17 == 0) goto L_0x03d3
            r22 = r2
        L_0x03d3:
            if (r22 == 0) goto L_0x03e8
            r22.intValue()
            te3.x91 r2 = new te3.x91
            r2.<init>()
            r2.f144531d = r1
            byte[] r2 = r2.toByteArray()
            r4 = r25
            r14.putByteArray(r4, r2)
        L_0x03e8:
            android.os.Bundle r2 = r39.getArguments()
            if (r2 != 0) goto L_0x03f2
            r0.setArguments(r14)
            goto L_0x03fb
        L_0x03f2:
            android.os.Bundle r2 = r39.getArguments()
            if (r2 == 0) goto L_0x03fb
            r2.putAll(r14)
        L_0x03fb:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "prepareNearbyLive targetTabId="
            r2.append(r4)
            r2.append(r1)
            r1 = r19
            r2.append(r1)
            r2.append(r13)
            r1 = r18
            r2.append(r1)
            r2.append(r10)
            r1 = r16
            r2.append(r1)
            r2.append(r12)
            java.lang.String r1 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
        L_0x0427:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.nearby.live.square.NearbyLiveSquareFragment.mo3604e0(android.app.Activity):void");
    }

    public void onDestroy() {
        super.onDestroy();
        C62293i.f177081a.mo87361f();
    }

    public void onPause() {
        super.onPause();
        Log.m105924i("NearbyLiveSquareFragment", "onPause()");
        FragmentActivity activity = getActivity();
        if (activity != null && (((NearbyHomeUIC) C39818r.f106831a.mo62443b(activity).mo75002a(NearbyHomeUIC.class)).mo3542c3() instanceof NearbyLiveSquareFragment)) {
            C10585g.f31933a.mo10848f(((NearbyLiveSquareUIC) mo82247K(NearbyLiveSquareUIC.class)).mo3605d3());
        }
        C13087a.f37263j = true;
    }

    public void onResume() {
        super.onResume();
        Log.m105924i("NearbyLiveSquareFragment", "onResume()");
        C10585g gVar = C10585g.f31933a;
        C10585g.f31936d = C31543z5.m39453c();
        C13087a.f37263j = false;
    }
}
