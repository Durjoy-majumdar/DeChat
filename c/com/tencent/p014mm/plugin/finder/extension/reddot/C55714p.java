package com.tencent.p014mm.plugin.finder.extension.reddot;

import com.tencent.p014mm.plugin.newtips.model.C57149g;
import com.tencent.p014mm.protocal.protobuf.FinderTipsShowEntranceExtInfo;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C75592q0;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import java.util.Map;
import p749xh.C118877o6;
import pe3.C89349b;
import qe3.C89625d;
import sx3.C110818d0;
import te3.C49170dn1;
import te3.C49448fn1;
import te3.C51978xi1;
import te3.C64586nn1;

/* renamed from: com.tencent.mm.plugin.finder.extension.reddot.p */
public final class C55714p implements C57149g {

    /* renamed from: a */
    public final FinderRedDotManager f158578a;

    /* renamed from: com.tencent.mm.plugin.finder.extension.reddot.p$a */
    public static final class C55715a extends C87413o implements C32226l<C55718s0, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ String f158579d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55715a(String str) {
            super(1);
            this.f158579d = str;
        }

        public Object invoke(Object obj) {
            C55718s0 s0Var = (C55718s0) obj;
            C87412m.m108594g(s0Var, LocaleUtil.ITALIAN);
            return Boolean.valueOf(C87412m.m108589b(s0Var.field_tipsId, this.f158579d));
        }
    }

    public C55714p(FinderRedDotManager finderRedDotManager) {
        C87412m.m108594g(finderRedDotManager, "redDotManager");
        this.f158578a = finderRedDotManager;
    }

    /* renamed from: a */
    public boolean mo77296a(long j, String str, List<? extends C118877o6> list, Map<String, String> map) {
        C87412m.m108594g(list, "tipsList");
        C87412m.m108594g(map, "values");
        int i = 0;
        if (mo77299d(map, j) == null) {
            return false;
        }
        if (!mo77298c(j, map)) {
            return true;
        }
        C118877o6 o6Var = (C118877o6) C110818d0.m150916N(list);
        if (o6Var != null) {
            i = o6Var.field_priority;
        }
        C51978xi1 xi12 = new C51978xi1();
        for (C118877o6 o6Var2 : list) {
            C64586nn1 nn12 = new C64586nn1();
            if (o6Var2.field_showType != 10000) {
                xi12.f144672g.add(nn12);
                int i2 = o6Var2.field_showType;
                if (i2 == 2) {
                    nn12.f184504f = o6Var2.field_title;
                    nn12.f184502d = 3;
                } else if (i2 == 5) {
                    nn12.f184503e = 1;
                    nn12.f184502d = 2;
                } else if (i2 == 3) {
                    nn12.f184505g = o6Var2.field_icon_url;
                    nn12.f184502d = 4;
                } else if (i2 == 0) {
                    nn12.f184502d = 1;
                } else if (i2 == 1) {
                    nn12.f184502d = 100;
                }
                int i3 = o6Var2.field_path;
                nn12.f184507i = i3 != 2 ? i3 != 24 ? i3 != 28 ? i3 != 29 ? "" : "finder_tl_nearby_tab" : "finder_tl_hot_tab" : "FinderEntrance" : "Discovery";
                nn12.f184506h = 1;
                if (j == 40001002) {
                    FinderTipsShowEntranceExtInfo finderTipsShowEntranceExtInfo = new FinderTipsShowEntranceExtInfo();
                    finderTipsShowEntranceExtInfo.tab_type = 2;
                    nn12.f184509n = 1;
                    nn12.f184510o = new C89349b(finderTipsShowEntranceExtInfo.toByteArray());
                    xi12.f144670e = 1003;
                } else if (j == 40001001) {
                    FinderTipsShowEntranceExtInfo finderTipsShowEntranceExtInfo2 = new FinderTipsShowEntranceExtInfo();
                    finderTipsShowEntranceExtInfo2.tab_type = 4;
                    nn12.f184509n = 1;
                    nn12.f184510o = new C89349b(finderTipsShowEntranceExtInfo2.toByteArray());
                    xi12.f144670e = 1004;
                }
            }
        }
        xi12.f144673h = str;
        xi12.f144669d = i;
        C49170dn1 dn12 = new C49170dn1();
        C49448fn1 fn12 = new C49448fn1();
        dn12.f132433d.add(fn12);
        fn12.f133597d = xi12;
        this.f158578a.mo77250V5(dn12, "FinderNewTipsTransform");
        return true;
    }

    /* renamed from: b */
    public boolean mo77297b(long j, String str, List<? extends C118877o6> list, Map<String, String> map) {
        C87412m.m108594g(list, "tipsList");
        C87412m.m108594g(map, "values");
        Log.m105928w("Finder.NewTipsTransform", "[handleCancel] tipsId=" + j + " uniqueId=" + str);
        if (mo77299d(map, j) == null) {
            return false;
        }
        if (!mo77298c(j, map)) {
            return true;
        }
        int i = j == 40001002 ? 1003 : j == 40001001 ? 1004 : -1;
        if (i != -1) {
            FinderRedDotManager finderRedDotManager = this.f158578a;
            C55715a aVar = new C55715a(str);
            String h = C75592q0.m90778h();
            C87412m.m108593f(h, "getDefaultFinderUsername()");
            if (finderRedDotManager.mo77259c(i, h, aVar)) {
                Log.m105924i("Finder.NewTipsTransform", "[handleCancel] successfully! tipsId=" + j + " uniqueId=" + str);
            }
        }
        return true;
    }

    /* renamed from: c */
    public final boolean mo77298c(long j, Map<String, String> map) {
        int i = map.containsKey(".sysmsg.newtips.control.android_min_clientversion") ? Util.getInt(map.get(".sysmsg.newtips.control.android_min_clientversion"), 0) : 0;
        int i2 = map.containsKey(".sysmsg.newtips.control.android_max_clientversion") ? Util.getInt(map.get(".sysmsg.newtips.control.android_max_clientversion"), Integer.MAX_VALUE) : 0;
        int i3 = C89625d.f257841g;
        if (i3 >= i && i3 <= i2) {
            return true;
        }
        Log.m105929w("Finder.NewTipsTransform", "tipsId=%s, checkValidClientVersion client not match(%s, %s) %s", Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(C89625d.f257841g));
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0028, code lost:
        if ((!r5.isEmpty()) != false) goto L_0x002c;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.String, java.lang.String> mo77299d(java.util.Map<java.lang.String, java.lang.String> r5, long r6) {
        /*
            r4 = this;
            java.lang.String r0 = ".sysmsg.newtips.ext_info"
            java.lang.Object r5 = r5.get(r0)
            java.lang.String r5 = (java.lang.String) r5
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L_0x002b
            int r2 = r5.length()
            if (r2 <= 0) goto L_0x0014
            r2 = 1
            goto L_0x0015
        L_0x0014:
            r2 = 0
        L_0x0015:
            if (r2 == 0) goto L_0x0018
            goto L_0x0019
        L_0x0018:
            r5 = r1
        L_0x0019:
            if (r5 == 0) goto L_0x002b
            java.lang.String r2 = "finder"
            java.util.Map r5 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r5, r2, r1)
            if (r5 == 0) goto L_0x002b
            boolean r2 = r5.isEmpty()
            r2 = r2 ^ r0
            if (r2 == 0) goto L_0x002b
            goto L_0x002c
        L_0x002b:
            r5 = r1
        L_0x002c:
            if (r5 == 0) goto L_0x0056
            java.lang.String r2 = ".finder.reddot_type"
            java.lang.Object r2 = r5.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x003d
            java.lang.Integer r2 = z04.C66731x.m78731e(r2)
            goto L_0x003e
        L_0x003d:
            r2 = r1
        L_0x003e:
            if (r2 != 0) goto L_0x0041
            goto L_0x0056
        L_0x0041:
            int r2 = r2.intValue()
            if (r2 != r0) goto L_0x0056
            r2 = 40001001(0x2625de9, double:1.97631204E-316)
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0055
            r2 = 40001002(0x2625dea, double:1.9763121E-316)
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0056
        L_0x0055:
            return r5
        L_0x0056:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.extension.reddot.C55714p.mo77299d(java.util.Map, long):java.util.Map");
    }
}
