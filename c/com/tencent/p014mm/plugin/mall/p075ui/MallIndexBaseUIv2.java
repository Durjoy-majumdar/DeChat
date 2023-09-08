package com.tencent.p014mm.plugin.mall.p075ui;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import b63.C67195n;
import c63.C67345b;
import c63.C67346c;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.RequestEnterWalletEvent;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.appbrand.jsapi.bio.face.C1643f;
import com.tencent.p014mm.plugin.mall.p075ui.C69778d;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet_core.model.mall.MallFunction;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.wallet_core.model.C75136r0;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import com.tencent.p014mm.wallet_core.p137ui.WcPayBannerView;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import ie3.C87716k;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kg3.C76577a;
import kr0.C88262c1;
import kr0.C88273g1;
import kr0.C88274h0;
import ob0.C117747y;
import p281yz.C79173v;
import p755xs.C102720b;
import s52.C36626n;
import s52.C48230g;
import s52.C48231h;
import te3.C48753ar1;
import te3.C50594nu1;
import te3.C64891zq1;
import te3.bz4;
import te3.oy4;
import te3.sy4;
import v52.C14408a;
import vt1.C78473a;

/* renamed from: com.tencent.mm.plugin.mall.ui.MallIndexBaseUIv2 */
public abstract class MallIndexBaseUIv2 extends WalletBaseUI implements C102720b.C78973a, C67195n {

    /* renamed from: v */
    public static final /* synthetic */ int f201182v = 0;

    /* renamed from: d */
    public ListView f201183d = null;

    /* renamed from: e */
    public C69778d f201184e = null;

    /* renamed from: f */
    public TextView f201185f = null;

    /* renamed from: g */
    public TextView f201186g;

    /* renamed from: h */
    public WcPayBannerView f201187h;

    /* renamed from: i */
    public String f201188i;

    /* renamed from: j */
    public ArrayList<MallFunction> f201189j = null;

    /* renamed from: n */
    public ArrayList<C64891zq1> f201190n = null;

    /* renamed from: o */
    public String f201191o = null;

    /* renamed from: p */
    public String f201192p = null;

    /* renamed from: q */
    public int f201193q;

    /* renamed from: r */
    public View f201194r;

    /* renamed from: s */
    public View f201195s;

    /* renamed from: t */
    public RelativeLayout f201196t;

    /* renamed from: u */
    public boolean f201197u = false;

    /* JADX WARNING: Removed duplicated region for block: B:13:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0062  */
    /* renamed from: I7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m82089I7(com.tencent.p014mm.plugin.mall.p075ui.MallIndexBaseUIv2 r18, te3.C64891zq1 r19, int r20) {
        /*
            r0 = r18
            r1 = r19
            r18.getClass()
            te3.oy4 r2 = r1.f186831f
            java.lang.String r3 = "MicorMsg.MallIndexBaseUIv2"
            if (r2 != 0) goto L_0x0014
            java.lang.String r0 = "functionItem.Entrance == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            goto L_0x02c4
        L_0x0014:
            java.lang.String r2 = ""
            r5 = 0
            r6 = 2
            if (r20 < 0) goto L_0x0114
            te3.my4 r8 = r1.f186830e
            r9 = 4294967295(0xffffffff, double:2.1219957905E-314)
            if (r8 == 0) goto L_0x0047
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            te3.my4 r11 = r1.f186830e
            int r11 = r11.f184407d
            r8.append(r11)
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r8 != 0) goto L_0x0047
            te3.my4 r8 = r1.f186830e
            int r8 = r8.f184407d
            long r11 = (long) r8
            long r11 = r11 & r9
            java.lang.String r8 = java.lang.Long.toString(r11)
            goto L_0x0048
        L_0x0047:
            r8 = r2
        L_0x0048:
            java.util.ArrayList<te3.zq1> r11 = r0.f201190n
            if (r11 != 0) goto L_0x004e
            r11 = 0
            goto L_0x0052
        L_0x004e:
            int r11 = r11.size()
        L_0x0052:
            boolean r12 = com.tencent.p014mm.plugin.mall.p075ui.C69778d.m82214b(r19)
            int r13 = r0.f201193q
            android.util.SparseArray r13 = c63.C67345b.m79689c(r13)
            int r14 = r13.size()
            if (r14 == 0) goto L_0x0114
            int r14 = r1.f186836n
            long r9 = (long) r14
            java.lang.Object r13 = r13.get(r14)
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            if (r13 == 0) goto L_0x0114
            int r14 = r13.size()
            r15 = 0
        L_0x0072:
            int r4 = r13.size()
            if (r15 >= r4) goto L_0x0094
            java.lang.Object r4 = r13.get(r15)
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 != 0) goto L_0x0081
            goto L_0x0091
        L_0x0081:
            te3.py4 r7 = r1.f186829d
            int r7 = r7.f184923d
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            int r4 = r4.compareTo(r7)
            if (r4 != 0) goto L_0x0091
            r4 = r15
            goto L_0x0095
        L_0x0091:
            int r15 = r15 + 1
            goto L_0x0072
        L_0x0094:
            r4 = 0
        L_0x0095:
            java.lang.Object[] r7 = new java.lang.Object[r6]
            r7[r5] = r8
            te3.py4 r13 = r1.f186829d
            int r13 = r13.f184923d
            long r5 = (long) r13
            r15 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r15
            java.lang.String r5 = java.lang.Long.toString(r5)
            r6 = 1
            r7[r6] = r5
            java.lang.String r5 = "click report activityId:%s,FunctionID：%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r5, r7)
            com.tencent.mm.plugin.report.service.n r5 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r7 = 10
            java.lang.Object[] r7 = new java.lang.Object[r7]
            te3.py4 r13 = r1.f186829d
            int r13 = r13.f184923d
            r17 = r7
            long r6 = (long) r13
            r15 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r15
            java.lang.String r6 = java.lang.Long.toString(r6)
            r7 = 0
            r17[r7] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r11)
            r11 = 1
            r17[r11] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            r7 = 2
            r17[r7] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r20)
            r7 = 3
            r17[r7] = r6
            r6 = 4
            r17[r6] = r8
            r6 = 5
            if (r12 == 0) goto L_0x00e7
            r7 = 2
            goto L_0x00e8
        L_0x00e7:
            r7 = 1
        L_0x00e8:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r17[r6] = r7
            r6 = 6
            r7 = 2
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r17[r6] = r8
            r6 = 7
            java.lang.Long r7 = java.lang.Long.valueOf(r9)
            r17[r6] = r7
            r6 = 8
            java.lang.Integer r7 = java.lang.Integer.valueOf(r14)
            r17[r6] = r7
            r6 = 9
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r17[r6] = r4
            r6 = r17
            r4 = 10881(0x2a81, float:1.5248E-41)
            r5.mo160131h(r4, r6)
        L_0x0114:
            c63.c r4 = c63.C67346c.m79699b()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            te3.py4 r6 = r1.f186829d
            int r6 = r6.f184923d
            r5.append(r6)
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            r4.mo91481f(r5)
            c63.d r4 = c63.C67347d.m79705b()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            te3.py4 r6 = r1.f186829d
            int r6 = r6.f184923d
            r5.append(r6)
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            r4.mo91485d(r5)
            te3.my4 r4 = r1.f186830e
            if (r4 == 0) goto L_0x018f
            com.tencent.mm.plugin.wallet_core.model.mall.MallFunction r4 = new com.tencent.mm.plugin.wallet_core.model.mall.MallFunction
            r4.<init>()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            te3.py4 r6 = r1.f186829d
            int r6 = r6.f184923d
            r5.append(r6)
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            r4.f209731d = r5
            te3.py4 r6 = r1.f186829d
            java.lang.String r6 = r6.f184924e
            r4.f209732e = r6
            com.tencent.mm.plugin.wallet_core.model.mall.MallNews r6 = new com.tencent.mm.plugin.wallet_core.model.mall.MallNews
            r6.<init>((java.lang.String) r5)
            r4.f209739o = r6
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            te3.my4 r7 = r1.f186830e
            int r7 = r7.f184407d
            r5.append(r7)
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            r6.f209746g = r5
            c63.c r5 = c63.C67346c.m79699b()
            r5.mo91480d(r4)
        L_0x018f:
            r4 = 3
            java.lang.Object[] r5 = new java.lang.Object[r4]
            te3.py4 r4 = r1.f186829d
            int r4 = r4.f184923d
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6 = 0
            r5[r6] = r4
            te3.py4 r4 = r1.f186829d
            java.lang.String r4 = r4.f184924e
            r6 = 1
            r5[r6] = r4
            te3.oy4 r4 = r1.f186831f
            int r4 = r4.f184722g
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r7 = 2
            r5[r7] = r4
            java.lang.String r4 = "handleFunctionNew id：%s，name：%s，type：%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r5)
            te3.oy4 r4 = r1.f186831f
            int r5 = r4.f184722g
            if (r5 == 0) goto L_0x027c
            if (r5 == r6) goto L_0x01f3
            if (r5 == r7) goto L_0x01c6
            java.lang.String r0 = "unknown entrance type"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            goto L_0x02c4
        L_0x01c6:
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            te3.bz4 r2 = r4.f184721f
            java.lang.String r4 = r2.f182349d
            r5 = 0
            r0[r5] = r4
            java.lang.String r4 = r2.f182350e
            r0[r6] = r4
            int r2 = r2.f182351f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4 = 2
            r0[r4] = r2
            java.lang.String r2 = "handleFunctionNew functionItem.Entrance.URLWeApp.username：%s,functionItem.Entrance.URLWeApp.pagepath:%s,functionItem.Entrance.URLWeApp.version:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r2, r0)
            te3.oy4 r0 = r1.f186831f
            te3.bz4 r0 = r0.f184721f
            java.lang.String r1 = r0.f182349d
            java.lang.String r2 = r0.f182350e
            int r0 = r0.f182351f
            r3 = 1019(0x3fb, float:1.428E-42)
            com.tencent.p014mm.wallet_core.p137ui.C75228t.m90224Q(r1, r2, r0, r3)
            goto L_0x02c4
        L_0x01f3:
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.String r4 = r4.f184720e
            r5 = 0
            r6[r5] = r4
            java.lang.String r4 = "handleFunctionNew functionItem.Entrance.URLHtml：%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r6)
            f40.C86709a0.m107528h()
            f40.o r3 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r3 = r3.mo121142i()
            com.tencent.mm.storage.y1$a r4 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WALLET_REGION_TYPE_INT_SYNC
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object r3 = r3.mo119685f(r4, r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.f201193q = r3
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            te3.oy4 r4 = r1.f186831f
            java.lang.String r4 = r4.f184720e
            java.lang.String r5 = "rawUrl"
            r3.putExtra(r5, r4)
            java.lang.String r4 = eb0.C75592q0.m90789s()
            java.lang.String r5 = "geta8key_username"
            r3.putExtra(r5, r4)
            java.lang.String r4 = "pay_channel"
            r5 = 1
            r3.putExtra(r4, r5)
            java.lang.String r4 = "KPublisherId"
            java.lang.String r5 = "pay_wallet"
            r3.putExtra(r4, r5)
            boolean r4 = r1.f186833h
            java.lang.String r5 = "key_download_restrict"
            r3.putExtra(r5, r4)
            int r4 = r0.f201193q
            java.lang.String r5 = "key_wallet_region"
            r3.putExtra(r5, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            te3.py4 r1 = r1.f186829d
            int r1 = r1.f184923d
            r4.append(r1)
            r4.append(r2)
            java.lang.String r1 = r4.toString()
            java.lang.String r2 = "key_function_id"
            r3.putExtra(r2, r1)
            java.lang.String r1 = com.tencent.p014mm.p136ui.C74928u.C45093i.f122326r
            r2 = 1
            r3.putExtra(r1, r2)
            r1 = 46
            java.lang.String r2 = "geta8key_scene"
            r3.putExtra(r2, r1)
            androidx.appcompat.app.AppCompatActivity r0 = r18.getContext()
            com.tencent.p014mm.wallet_core.p137ui.C75228t.m90217J(r0, r3)
            goto L_0x02c4
        L_0x027c:
            java.lang.String r3 = r4.f184719d
            java.lang.String r4 = "wxpay://bizmall/mobile_recharge"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x02c4
            com.tencent.mm.plugin.wallet_core.model.mall.MallFunction r3 = new com.tencent.mm.plugin.wallet_core.model.mall.MallFunction
            r3.<init>()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            te3.py4 r5 = r1.f186829d
            int r5 = r5.f184923d
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r3.f209731d = r2
            te3.py4 r1 = r1.f186829d
            java.lang.String r1 = r1.f184924e
            r3.f209732e = r1
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r2 = "key_func_info"
            r1.putExtra(r2, r3)
            java.lang.String r2 = "key_need_show_remind_dialog"
            r3 = 0
            r1.putExtra(r2, r3)
            r2 = 0
            java.lang.String r4 = "recharge"
            java.lang.String r5 = ".ui.PhoneRechargeUI"
            ke3.C88144b.m109791i(r0, r4, r5, r1, r2)
            r0 = 15
            com.tencent.p014mm.wallet_core.model.C75136r0.m90122d(r0, r3)
        L_0x02c4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.mall.p075ui.MallIndexBaseUIv2.m82089I7(com.tencent.mm.plugin.mall.ui.MallIndexBaseUIv2, te3.zq1, int):void");
    }

    /* renamed from: N7 */
    private MallFunction m82090N7(List<MallFunction> list) {
        if (!(list == null || list.size() == 0 || TextUtils.isEmpty(this.f201191o))) {
            for (int i = 0; i < list.size(); i++) {
                MallFunction mallFunction = list.get(i);
                if (mallFunction != null && this.f201191o.equals(mallFunction.f209731d)) {
                    return mallFunction;
                }
            }
        }
        return null;
    }

    /* renamed from: O7 */
    private MallFunction m82091O7(List<MallFunction> list) {
        if (!(list == null || list.size() == 0 || TextUtils.isEmpty(this.f201192p))) {
            for (int i = 0; i < list.size(); i++) {
                MallFunction mallFunction = list.get(i);
                if (mallFunction != null && this.f201192p.equals(mallFunction.f209736i)) {
                    return mallFunction;
                }
            }
        }
        return null;
    }

    /* renamed from: H7 */
    public final void mo95953H7() {
        sy4 sy4;
        StringBuilder sb = new StringBuilder();
        StringBuilder sb4 = new StringBuilder();
        int lastVisiblePosition = this.f201183d.getLastVisiblePosition();
        if (lastVisiblePosition > this.f201183d.getHeaderViewsCount()) {
            int headerViewsCount = lastVisiblePosition <= this.f201183d.getHeaderViewsCount() + this.f201184e.getCount() ? lastVisiblePosition - this.f201183d.getHeaderViewsCount() : this.f201184e.getCount();
            List<ArrayList<C69778d.C69782d>> list = this.f201184e.f201364d;
            for (int i = 0; i < headerViewsCount; i++) {
                Iterator it = ((ArrayList) ((ArrayList) list).get(i)).iterator();
                while (it.hasNext()) {
                    C69778d.C69782d dVar = (C69778d.C69782d) it.next();
                    if (dVar != null) {
                        sb.append(Long.toString(((long) dVar.f201386a.f186829d.f184923d) & Util.MAX_32BIT_VALUE));
                        sb.append(";");
                    }
                }
            }
            int i2 = headerViewsCount - 1;
            if (i2 >= 0) {
                int intValue = C67345b.m79691e(this.f201193q).get(((C69778d.C69782d) ((ArrayList) ((ArrayList) list).get(i2)).get(0)).f201386a.f186836n).intValue();
                int i3 = this.f201193q;
                ArrayList arrayList = new ArrayList();
                C50594nu1 d = C67345b.m79690d(i3);
                if (d.f138778d != null) {
                    for (int i4 = 0; i4 < d.f138778d.size(); i4++) {
                        C48753ar1 ar12 = d.f138778d.get(i4);
                        if (!(ar12 == null || (sy4 = ar12.f130741d) == null)) {
                            arrayList.add(Integer.valueOf(sy4.f141840d));
                        }
                    }
                }
                for (int i5 = 0; i5 < intValue; i5++) {
                    sb4.append(arrayList.get(i5));
                    sb4.append(";");
                }
                Log.m105925i("MicorMsg.MallIndexBaseUIv2", "exposure report productID：%s、groupId：%s", sb, sb4);
                C115669n.INSTANCE.mo160131h(20548, sb, sb4);
            }
        }
    }

    /* renamed from: J7 */
    public abstract void mo95954J7();

    /* renamed from: K7 */
    public abstract void mo95955K7();

    /* renamed from: L7 */
    public abstract void mo95956L7();

    /* renamed from: M7 */
    public abstract int mo95957M7();

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00bf  */
    /* renamed from: P7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo95958P7(com.tencent.p014mm.plugin.wallet_core.model.mall.MallFunction r14, int r15) {
        /*
            r13 = this;
            r0 = 3
            r1 = 2
            java.lang.String r2 = "MicorMsg.MallIndexBaseUIv2"
            r3 = 1
            r4 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            if (r14 == 0) goto L_0x00db
            if (r15 < 0) goto L_0x00db
            com.tencent.mm.plugin.wallet_core.model.mall.MallNews r6 = r14.f209739o
            if (r6 == 0) goto L_0x001f
            java.lang.String r6 = r6.f209746g
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 != 0) goto L_0x001f
            com.tencent.mm.plugin.wallet_core.model.mall.MallNews r6 = r14.f209739o
            java.lang.String r6 = r6.f209746g
            goto L_0x0021
        L_0x001f:
            java.lang.String r6 = ""
        L_0x0021:
            java.util.ArrayList<com.tencent.mm.plugin.wallet_core.model.mall.MallFunction> r7 = r13.f201189j
            if (r7 != 0) goto L_0x0027
            r7 = 0
            goto L_0x002b
        L_0x0027:
            int r7 = r7.size()
        L_0x002b:
            com.tencent.mm.plugin.wallet_core.model.mall.MallNews r8 = r14.f209739o
            if (r8 == 0) goto L_0x009c
            java.lang.String r8 = r8.f209748i
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r8 != 0) goto L_0x009c
            c63.d r8 = c63.C67347d.m79705b()
            java.lang.String r9 = r14.f209731d
            com.tencent.mm.plugin.wallet_core.model.mall.MallNews r8 = r8.mo91484c(r9)
            if (r8 == 0) goto L_0x0071
            java.lang.String r9 = r8.f209746g
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r9 != 0) goto L_0x0071
            java.lang.String r9 = r8.f209746g
            com.tencent.mm.plugin.wallet_core.model.mall.MallNews r10 = r14.f209739o
            java.lang.String r10 = r10.f209746g
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x0058
            goto L_0x0071
        L_0x0058:
            java.lang.String r8 = r8.f209743d
            java.lang.String r9 = "0"
            boolean r8 = r9.equals(r8)
            if (r8 != 0) goto L_0x006a
            java.lang.String r8 = "still old news or clicked, then should not show"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r8)
            r8 = 0
            goto L_0x008c
        L_0x006a:
            java.lang.String r8 = "still old news and should show"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r8)
            goto L_0x008b
        L_0x0071:
            java.lang.Object[] r8 = new java.lang.Object[r1]
            com.tencent.mm.plugin.wallet_core.model.mall.MallNews r9 = r14.f209739o
            java.lang.String r9 = r9.f209746g
            r8[r4] = r9
            java.lang.String r9 = r14.f209732e
            r8[r3] = r9
            java.lang.String r9 = "old news null or should be replaced %s %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r9, r8)
            c63.d r8 = c63.C67347d.m79705b()
            com.tencent.mm.plugin.wallet_core.model.mall.MallNews r9 = r14.f209739o
            r8.mo91483a(r9)
        L_0x008b:
            r8 = 1
        L_0x008c:
            if (r8 == 0) goto L_0x009c
            c63.d r8 = c63.C67347d.m79705b()
            java.lang.String r9 = r14.f209731d
            com.tencent.mm.plugin.wallet_core.model.mall.MallNews r8 = r8.mo91484c(r9)
            if (r8 == 0) goto L_0x009c
            r8 = 1
            goto L_0x009d
        L_0x009c:
            r8 = 0
        L_0x009d:
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r10 = 10881(0x2a81, float:1.5248E-41)
            r11 = 10
            java.lang.Object[] r11 = new java.lang.Object[r11]
            java.lang.String r12 = r14.f209731d
            r11[r4] = r12
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r11[r3] = r7
            r11[r1] = r5
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r11[r0] = r15
            r15 = 4
            r11[r15] = r6
            r15 = 5
            if (r8 == 0) goto L_0x00bf
            r6 = 2
            goto L_0x00c0
        L_0x00bf:
            r6 = 1
        L_0x00c0:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r11[r15] = r6
            r15 = 6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            r11[r15] = r6
            r15 = 7
            r11[r15] = r5
            r15 = 8
            r11[r15] = r5
            r15 = 9
            r11[r15] = r5
            r9.mo160131h(r10, r11)
        L_0x00db:
            r15 = 0
            if (r14 == 0) goto L_0x011f
            java.lang.String r6 = r14.f209736i
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 != 0) goto L_0x011f
            java.lang.Class<kr0.y0> r6 = kr0.C76632y0.class
            di3.d r6 = di3.C86312j.m106911c(r6)
            kr0.y0 r6 = (kr0.C76632y0) r6
            java.lang.String r7 = r14.f209736i
            boolean r6 = r6.mo106904s8(r7, r15)
            if (r6 == 0) goto L_0x011f
            java.lang.Object[] r15 = new java.lang.Object[r3]
            java.lang.String r0 = r14.f209736i
            r15[r4] = r0
            java.lang.String r0 = "handleFunction, intercept by AppBrandNativeLink, nativeUrl = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r0, r15)
            c63.c r15 = c63.C67346c.m79699b()
            java.lang.String r0 = r14.f209731d
            r15.mo91481f(r0)
            c63.d r15 = c63.C67347d.m79705b()
            java.lang.String r0 = r14.f209731d
            r15.mo91485d(r0)
            com.tencent.mm.plugin.wallet_core.model.mall.MallNews r15 = r14.f209739o
            if (r15 == 0) goto L_0x011e
            c63.c r15 = c63.C67346c.m79699b()
            r15.mo91480d(r14)
        L_0x011e:
            return
        L_0x011f:
            int r6 = com.tencent.p014mm.plugin.mall.p075ui.C69797s.m82221a(r14)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "functionType : "
            r7.append(r8)
            r7.append(r6)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r7)
            if (r6 == 0) goto L_0x01bb
            if (r6 == r3) goto L_0x0158
            if (r6 == r1) goto L_0x0151
            if (r6 == r0) goto L_0x0141
            goto L_0x01dc
        L_0x0141:
            java.lang.String r14 = "doSelectFunction do nothing"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r14)
            java.lang.String r14 = "fuction list error"
            android.widget.Toast r14 = nj3.C76912y0.makeText((android.content.Context) r13, (java.lang.CharSequence) r14, (int) r3)
            r14.show()
            goto L_0x01dc
        L_0x0151:
            java.lang.String r14 = "doSelectFunction no jump"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r14)
            goto L_0x01dc
        L_0x0158:
            f40.C86709a0.m107528h()
            f40.o r15 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r15 = r15.mo121142i()
            com.tencent.mm.storage.y1$a r0 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WALLET_REGION_TYPE_INT_SYNC
            java.lang.Object r15 = r15.mo119685f(r0, r5)
            java.lang.Integer r15 = (java.lang.Integer) r15
            int r15 = r15.intValue()
            r13.f201193q = r15
            android.content.Intent r15 = new android.content.Intent
            r15.<init>()
            java.lang.String r0 = r14.f209737j
            java.lang.String r1 = "rawUrl"
            r15.putExtra(r1, r0)
            java.lang.String r0 = eb0.C75592q0.m90789s()
            java.lang.String r1 = "geta8key_username"
            r15.putExtra(r1, r0)
            java.lang.String r0 = "pay_channel"
            r15.putExtra(r0, r3)
            java.lang.String r0 = "KPublisherId"
            java.lang.String r1 = "pay_wallet"
            r15.putExtra(r0, r1)
            int r0 = r14.f209742r
            java.lang.String r1 = "key_download_restrict"
            r15.putExtra(r1, r0)
            int r0 = r13.f201193q
            java.lang.String r1 = "key_wallet_region"
            r15.putExtra(r1, r0)
            java.lang.String r14 = r14.f209731d
            java.lang.String r0 = "key_function_id"
            r15.putExtra(r0, r14)
            java.lang.String r14 = com.tencent.p014mm.p136ui.C74928u.C45093i.f122326r
            r15.putExtra(r14, r3)
            r14 = 46
            java.lang.String r0 = "geta8key_scene"
            r15.putExtra(r0, r14)
            androidx.appcompat.app.AppCompatActivity r14 = r13.getContext()
            com.tencent.p014mm.wallet_core.p137ui.C75228t.m90217J(r14, r15)
            goto L_0x01dc
        L_0x01bb:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            boolean r1 = r13.isTransparent()
            if (r1 == 0) goto L_0x01cb
            java.lang.String r1 = "key_is_hide_progress"
            r0.putExtra(r1, r3)
        L_0x01cb:
            java.lang.String r1 = "key_func_info"
            r0.putExtra(r1, r14)
            java.lang.String r14 = "recharge"
            java.lang.String r1 = ".ui.PhoneRechargeUI"
            ke3.C88144b.m109791i(r13, r14, r1, r0, r15)
            r14 = 15
            com.tencent.p014mm.wallet_core.model.C75136r0.m90122d(r14, r4)
        L_0x01dc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.mall.p075ui.MallIndexBaseUIv2.mo95958P7(com.tencent.mm.plugin.wallet_core.model.mall.MallFunction, int):void");
    }

    /* renamed from: Q7 */
    public abstract void mo95959Q7();

    /* renamed from: R7 */
    public abstract boolean mo95960R7();

    /* renamed from: S7 */
    public abstract void mo95961S7(View view);

    /* renamed from: T7 */
    public abstract void mo95962T7();

    /* renamed from: U7 */
    public abstract void mo95963U7();

    /* renamed from: V7 */
    public abstract void mo95964V7();

    /* renamed from: W7 */
    public abstract void mo95965W7();

    /* renamed from: X7 */
    public abstract void mo95966X7();

    /* renamed from: Y7 */
    public abstract void mo95967Y7();

    /* renamed from: Z7 */
    public void mo95968Z7() {
        sy4 sy4;
        int i;
        showOptionMenu(true);
        C69778d dVar = this.f201184e;
        if (dVar != null) {
            ArrayList<C64891zq1> arrayList = this.f201190n;
            ((ArrayList) dVar.f201364d).clear();
            if (arrayList != null) {
                int i2 = 0;
                while (i2 < arrayList.size()) {
                    ArrayList arrayList2 = new ArrayList();
                    int i3 = 0;
                    while (i3 < 4 && (i = i2 + i3) < arrayList.size() && (i3 <= 0 || i - 1 < 0 || arrayList.get(r7).f186836n == arrayList.get(i).f186836n)) {
                        C69778d.C69782d dVar2 = new C69778d.C69782d(dVar);
                        dVar2.f201387b = i;
                        dVar2.f201386a = arrayList.get(i);
                        arrayList2.add(dVar2);
                        i3++;
                    }
                    if (arrayList2.size() > 0) {
                        ((ArrayList) dVar.f201364d).add(arrayList2);
                    }
                    i2 += i3;
                }
            }
            int i4 = dVar.f201369i;
            SparseArray<String> sparseArray = new SparseArray<>();
            LinkedList<C48753ar1> linkedList = C67345b.m79690d(i4).f138778d;
            if (linkedList != null) {
                Iterator<C48753ar1> it = linkedList.iterator();
                while (it.hasNext()) {
                    C48753ar1 next = it.next();
                    if (!(next == null || (sy4 = next.f130741d) == null)) {
                        sparseArray.put(sy4.f141840d, sy4.f141841e);
                    }
                }
            }
            dVar.f201365e = sparseArray;
            dVar.notifyDataSetChanged();
        }
        mo95954J7();
        mo95955K7();
        mo95966X7();
    }

    public boolean checkProcLife() {
        return false;
    }

    public void finish() {
        super.finish();
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bab;
    }

    public void initView() {
        Log.m105918d("MicorMsg.MallIndexBaseUIv2", "index initView");
        setBackBtn(new MallIndexBaseUIv2$$c(this));
        this.f201196t = (RelativeLayout) findViewById(C0966R.C0970id.iwk);
        this.f201183d = (ListView) findViewById(C0966R.C0970id.gls);
        mo95962T7();
        mo95959Q7();
        C69778d dVar = new C69778d(this, this.f201193q);
        this.f201184e = dVar;
        this.f201183d.setAdapter(dVar);
        this.f201184e.f201366f = new MallIndexBaseUIv2$$d(this);
        mo95961S7(this.f201194r);
        this.f201186g = (TextView) findViewById(C0966R.C0970id.a7l);
        WcPayBannerView wcPayBannerView = (WcPayBannerView) findViewById(C0966R.C0970id.lkt);
        this.f201187h = wcPayBannerView;
        wcPayBannerView.mo105020a();
        mo95965W7();
    }

    public boolean isTransparent() {
        return !Util.isNullOrNil(this.f201191o) || !Util.isNullOrNil(this.f201192p);
    }

    /* renamed from: j3 */
    public void mo24656j3(String str, Bitmap bitmap) {
    }

    /* renamed from: k7 */
    public void mo91296k7(int i, Map<String, String> map, Object[] objArr) {
        if (i == 12 && this.f201185f != null) {
            mo95967Y7();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1) {
            C86709a0.m107528h();
            this.f201193q = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 0)).intValue();
            if (i2 != -1) {
                return;
            }
            if (C75592q0.m90753A()) {
                finish();
                return;
            }
            finish();
            RequestEnterWalletEvent requestEnterWalletEvent = new RequestEnterWalletEvent();
            requestEnterWalletEvent.f9428d.f9429a = getContext();
            requestEnterWalletEvent.publish();
        }
    }

    public void onCreate(Bundle bundle) {
        Log.m105924i("MicorMsg.MallIndexBaseUIv2", "onCreate");
        super.onCreate(bundle);
        if (!C86709a0.m107522a()) {
            Log.m105926v("MicorMsg.MallIndexBaseUIv2", "MMCore is not ready");
            finish();
        }
        C86709a0.m107528h();
        int intValue = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 0)).intValue();
        this.f201193q = getIntent().getIntExtra("key_wallet_region", intValue);
        String stringExtra = getIntent().getStringExtra("key_uuid");
        this.f201188i = stringExtra;
        if (Util.isNullOrNil(stringExtra)) {
            this.f201188i = UUID.randomUUID().toString();
        }
        addSceneEndListener(C1643f.CTRL_INDEX);
        addSceneEndListener(4362);
        ((C79173v) C86312j.m106911c(C79173v.class)).Bx0().mo91291a(this);
        this.f201191o = getIntent().getStringExtra("key_func_id");
        Log.m105924i("MicorMsg.MallIndexBaseUIv2", "mFuncId:" + this.f201191o + " wallet_region: " + this.f201193q + " walletType: " + C75592q0.m90784n() + " default_region: " + intValue);
        this.f201192p = getIntent().getStringExtra("key_native_url");
        StringBuilder sb = new StringBuilder();
        sb.append("mNativeUrl:");
        sb.append(this.f201192p);
        Log.m105924i("MicorMsg.MallIndexBaseUIv2", sb.toString());
        if (isTransparent()) {
            Log.m105924i("MicorMsg.MallIndexBaseUIv2", "Oncreate：isTransparent()");
            return;
        }
        mo95956L7();
        setContentViewVisibility(0);
        mo95964V7();
        initView();
        C67346c.m79698a();
        mo95963U7();
        if (C75592q0.m90763K()) {
            Log.m105920e("MicorMsg.MallIndexBaseUIv2", "it is payu account ,not initFingerPrint");
        } else {
            C78473a aVar = (C78473a) C86709a0.m107533q(C78473a.class);
            if (aVar != null) {
                Log.m105924i("MicorMsg.MallIndexBaseUIv2", "IFingerPrintMgr is not null, do showFingerPrintEntrance()");
                aVar.Th0(this);
            } else {
                Log.m105920e("MicorMsg.MallIndexBaseUIv2", "IFingerPrintMgr is not null");
            }
        }
        C75136r0.m90122d(1, 0);
        C115669n.INSTANCE.mo160131h(11850, 1, 0);
        Looper.myQueue().addIdleHandler(new MallIndexBaseUIv2$$a());
    }

    public void onDestroy() {
        removeSceneEndListener(C1643f.CTRL_INDEX);
        removeSceneEndListener(4362);
        ((C79173v) C86312j.m106911c(C79173v.class)).Bx0().mo91292b(this);
        super.onDestroy();
    }

    public boolean onProgressFinish() {
        if (isTransparent()) {
            return true;
        }
        mo95968Z7();
        return true;
    }

    public void onResume() {
        RelativeLayout relativeLayout;
        super.onResume();
        boolean z = true;
        C87716k.f253994a = 1;
        Log.m105924i("MicorMsg.MallIndexBaseUIv2", "onResume");
        if (!C86709a0.m107522a()) {
            Log.m105926v("MicorMsg.MallIndexBaseUIv2", "MMCore is not ready");
            finish();
        }
        if (!isTransparent() && (relativeLayout = this.f201196t) != null) {
            relativeLayout.post(new MallIndexBaseUIv2$$b(this));
        }
        if (isTransparent()) {
            ArrayList<MallFunction> wx02 = C36626n.vx0().wx0(this.f201193q);
            this.f201189j = wx02;
            if (wx02 == null || wx02.size() <= 0) {
                Log.m105924i("MicorMsg.MallIndexBaseUIv2", "mFunctionList == null");
                try {
                    if (getIntent().getIntExtra("key_scene", 0) != 1) {
                        if (Util.isNullOrNil(this.f201192p)) {
                            String stringExtra = getIntent().getStringExtra("key_url");
                            doSceneForceProgress(new C48230g(this.f201193q, C67345b.m79687a(), getIntent().getStringExtra("key_app_id"), this.f201191o, stringExtra == null ? "" : stringExtra, 0));
                            return;
                        }
                    }
                    doSceneForceProgress(new C48230g(this.f201193q, C67345b.m79687a(), 0));
                } catch (UnsupportedEncodingException e) {
                    Log.printErrStackTrace("MicorMsg.MallIndexBaseUIv2", e, "", new Object[0]);
                    setResult(0);
                    finish();
                }
            } else {
                MallFunction N7 = m82090N7(this.f201189j);
                if (N7 == null) {
                    N7 = m82091O7(this.f201189j);
                }
                mo95958P7(N7, -1);
                finish();
            }
        } else {
            mo95960R7();
            Log.m105918d("MicorMsg.MallIndexBaseUIv2", "initFunctionList");
            if (C67345b.m79688b(this.f201193q).size() == 0) {
                Log.m105920e("MicorMsg.MallIndexBaseUIv2", "funcitonlist invalid");
                doSceneProgress(new C48231h(this.f201193q), true);
                z = false;
            } else {
                Log.m105924i("MicorMsg.MallIndexBaseUIv2", "funcitonlist has cache");
                doSceneProgress(new C48231h(this.f201193q), false);
                this.f201190n = C67345b.m79688b(this.f201193q);
            }
            if (z) {
                Log.m105924i("MicorMsg.MallIndexBaseUIv2", "has data");
                mo95968Z7();
                mo95953H7();
            }
        }
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        bz4 bz4;
        C64891zq1 zq12;
        Log.m105919d("MicorMsg.MallIndexBaseUIv2", "onSceneEnd :%s", Integer.valueOf(yVar.getType()));
        if (yVar.getType() == 4362) {
            C48231h hVar = (C48231h) yVar;
            int i3 = hVar.f129225g;
            int i4 = this.f201193q;
            if (i3 != i4) {
                Log.m105925i("MicorMsg.MallIndexBaseUIv2", "pass wallet local: %d cgi: %d", Integer.valueOf(i4), Integer.valueOf(hVar.f129225g));
            }
            if (i == 0 && i2 == 0) {
                this.f201190n = C67345b.m79688b(this.f201193q);
                Log.m105924i("MicorMsg.MallIndexBaseUIv2", "get from server now! " + this.f201193q + " " + this.f201190n.size());
                C67346c b = C67346c.m79699b();
                ArrayList<C64891zq1> arrayList = this.f201190n;
                b.getClass();
                if (arrayList != null) {
                    HashSet hashSet = new HashSet(((HashMap) b.f193199a).keySet());
                    Iterator<C64891zq1> it = arrayList.iterator();
                    while (it.hasNext()) {
                        hashSet.remove(it.next().f186829d.f184923d + "");
                    }
                    Iterator it4 = hashSet.iterator();
                    while (it4.hasNext()) {
                        ((HashMap) b.f193199a).remove((String) it4.next());
                    }
                    b.mo91482g();
                }
            }
            mo95968Z7();
            boolean booleanExtra = getIntent().getBooleanExtra("key_wallet_has_red", false);
            if (this.f201183d.getChildCount() != 0) {
                int firstVisiblePosition = this.f201183d.getFirstVisiblePosition();
                int top = this.f201183d.getChildAt(0).getTop();
                Log.m105925i("MicorMsg.MallIndexBaseUIv2", "initCheckNew %s fpos %s top %s", Boolean.valueOf(booleanExtra), Integer.valueOf(firstVisiblePosition), Integer.valueOf(top));
                if (firstVisiblePosition == 0 && top == 0 && booleanExtra && !this.f201197u && this.f201190n != null) {
                    this.f201197u = true;
                    int headerViewsCount = this.f201183d.getHeaderViewsCount() + this.f201184e.getCount();
                    Log.m105925i("MicorMsg.MallIndexBaseUIv2", "mFunctionsGv.getHeaderViewsCount()： %s mFunctionAdapter.getCount(): %s", Integer.valueOf(this.f201183d.getHeaderViewsCount()), Integer.valueOf(this.f201184e.getCount()));
                    List<ArrayList<C69778d.C69782d>> list = this.f201184e.f201364d;
                    if (list != null) {
                        ArrayList arrayList2 = (ArrayList) list;
                        int size = arrayList2.size() - 1;
                        while (true) {
                            if (size <= 0) {
                                break;
                            }
                            Iterator it5 = ((ArrayList) arrayList2.get(size)).iterator();
                            while (it5.hasNext()) {
                                C69778d.C69782d dVar = (C69778d.C69782d) it5.next();
                                if (dVar != null && (zq12 = dVar.f201386a) != null && C69778d.m82214b(zq12)) {
                                    int firstVisiblePosition2 = this.f201183d.getFirstVisiblePosition();
                                    int lastVisiblePosition = this.f201183d.getLastVisiblePosition();
                                    Log.m105925i("MicorMsg.MallIndexBaseUIv2", "get listview show top %s bottom %s redPos: %d", Integer.valueOf(firstVisiblePosition2), Integer.valueOf(lastVisiblePosition), Integer.valueOf(headerViewsCount));
                                    if (headerViewsCount < firstVisiblePosition2 || headerViewsCount > lastVisiblePosition) {
                                        int M7 = mo95957M7() + (C69770b.f201323d * (headerViewsCount + 1)) + ((C76577a.m92151b(getContext(), 48) + C76577a.m92151b(getContext(), 8)) * C67345b.m79691e(this.f201193q).get(dVar.f201386a.f186836n).intValue());
                                        int i5 = C85875k4.m106184h(this).y;
                                        if (C85875k4.m106190k(this)) {
                                            i5 -= C85875k4.m106188j(this);
                                        }
                                        if (getSupportActionBar() != null) {
                                            i5 -= getSupportActionBar().mo91101l();
                                        }
                                        this.f201183d.smoothScrollBy(((M7 - i5) - this.f201183d.getScrollY()) + (C69770b.f201323d / 3), 1000);
                                        C64891zq1 zq13 = dVar.f201386a;
                                        Log.m105925i("MicorMsg.MallIndexBaseUIv2", "offset function is %s, groupName is %s", zq13.f186829d.f184924e, Integer.valueOf(zq13.f186836n));
                                    } else {
                                        Log.m105924i("MicorMsg.MallIndexBaseUIv2", "the last redDot item is visible");
                                    }
                                }
                            }
                            headerViewsCount--;
                            size--;
                        }
                    }
                }
            }
            mo95959Q7();
            mo95953H7();
            ArrayList<C64891zq1> arrayList3 = this.f201190n;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                LinkedList linkedList = new LinkedList();
                Iterator<C64891zq1> it6 = arrayList3.iterator();
                while (it6.hasNext()) {
                    C64891zq1 next = it6.next();
                    oy4 oy4 = next.f186831f;
                    if (oy4 != null && oy4.f184722g == 2 && (bz4 = oy4.f184721f) != null && !TextUtils.isEmpty(bz4.f182349d)) {
                        linkedList.add(next.f186831f.f184721f.f182349d);
                    }
                }
                if (!linkedList.isEmpty()) {
                    ((C88262c1) C86312j.m106911c(C88262c1.class)).mo113588rf(linkedList);
                }
            }
            ArrayList<C64891zq1> arrayList4 = this.f201190n;
            if (arrayList4 != null && arrayList4.size() > 0) {
                Iterator<C64891zq1> it7 = this.f201190n.iterator();
                while (true) {
                    if (it7.hasNext()) {
                        oy4 oy42 = it7.next().f186831f;
                        if (oy42 != null && oy42.f184722g == 2) {
                            ((C88274h0) C86312j.m106911c(C88274h0.class)).mo113299AC(C88273g1.WALLET);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            return true;
        } else if (yVar.getType() != 495) {
            return false;
        } else {
            C48230g gVar = (C48230g) yVar;
            int i6 = gVar.f129221g;
            int i7 = this.f201193q;
            if (i6 != i7) {
                Log.m105925i("MicorMsg.MallIndexBaseUIv2", "pass wallet local: %d cgi: %d", Integer.valueOf(i7), Integer.valueOf(gVar.f129221g));
            }
            if (isTransparent()) {
                Log.m105919d("MicorMsg.MallIndexBaseUIv2", "errorType:%d | errCode:%d", Integer.valueOf(i), Integer.valueOf(i2));
                if (i == 0 && i2 == 0 && gVar.f129218d != null) {
                    if (getIntent().getIntExtra("key_scene", 0) == 1) {
                        MallFunction N7 = m82090N7(gVar.f129218d);
                        if (N7 != null) {
                            mo95958P7(N7, -1);
                        }
                    } else if (!Util.isNullOrNil(this.f201192p)) {
                        Log.m105919d("MicorMsg.MallIndexBaseUIv2", "NativeUrl: %s", this.f201192p);
                        MallFunction O7 = m82091O7(gVar.f129218d);
                        if (O7 != null) {
                            mo95958P7(O7, -1);
                        } else {
                            setResult(0);
                            finish();
                            return true;
                        }
                    } else {
                        ArrayList<MallFunction> arrayList5 = gVar.f129218d;
                        if (arrayList5 != null && arrayList5.size() > 0) {
                            Log.m105924i("MicorMsg.MallIndexBaseUIv2", "functionScene.mFunctionList != null");
                            mo95958P7(m82090N7(gVar.f129218d), -1);
                        } else if (C36626n.vx0().wx0(this.f201193q) == null || C36626n.vx0().wx0(this.f201193q).size() <= 0) {
                            Log.m105920e("MicorMsg.MallIndexBaseUIv2", "SubCoreMall.getCore().getFunctionList() == null");
                        } else {
                            Log.m105924i("MicorMsg.MallIndexBaseUIv2", "SubCoreMall.getCore().getFunctionList() != null");
                            mo95958P7(m82090N7(C36626n.vx0().wx0(this.f201193q)), -1);
                        }
                    }
                    setResult(-1);
                    finish();
                } else {
                    setResult(0);
                    finish();
                }
            }
            return true;
        }
    }

    public void onStop() {
        super.onStop();
    }

    public void setStatusColor() {
    }

    public void shouldFixStatusBar() {
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C14408a.class);
    }
}
