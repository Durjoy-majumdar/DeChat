package com.tencent.p014mm.plugin.finder.extension.reddot;

import android.content.ContentValues;
import com.tencent.p014mm.protocal.protobuf.FinderTipsShowEntranceExtInfo;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import eb0.C31543z5;
import ft1.C59319a;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;
import kotlin.ResultKt;
import o40.C11348f;
import o40.C61926c;
import p749xh.C66277w3;
import pe3.C89349b;
import rx3.C13598b0;
import sx3.C64175a0;
import te3.C48883bn1;
import te3.C51978xi1;
import te3.C64586nn1;
import te3.C64858yi1;

/* renamed from: com.tencent.mm.plugin.finder.extension.reddot.s0 */
public final class C55718s0 extends C66277w3 {

    /* renamed from: G */
    public static final IAutoDBItem.MAutoDBInfo f158582G = C66277w3.initAutoDBInfo(C55718s0.class);

    /* renamed from: D */
    public final ConcurrentHashMap<String, C64586nn1> f158583D = new ConcurrentHashMap<>();

    /* renamed from: E */
    public final ConcurrentHashMap<String, List<String>> f158584E = new ConcurrentHashMap<>();

    /* renamed from: F */
    public C64858yi1 f158585F = new C64858yi1();

    /* renamed from: com.tencent.mm.plugin.finder.extension.reddot.s0$a */
    public static final class C29944a extends C87413o implements C32226l<String, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ String f81100d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29944a(String str) {
            super(1);
            this.f81100d = str;
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            C87412m.m108594g(str, LocaleUtil.ITALIAN);
            return Boolean.valueOf(C87412m.m108589b(str, this.f81100d));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.extension.reddot.s0$b */
    public static final class C55719b extends C87413o implements C32226l<C64586nn1, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ String f158586d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55719b(String str) {
            super(1);
            this.f158586d = str;
        }

        public Object invoke(Object obj) {
            return Boolean.valueOf(C87412m.m108589b(((C64586nn1) obj).f184507i, this.f158586d));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.extension.reddot.s0$c */
    public static final class C55720c extends C87413o implements C32226l<C64586nn1, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ String f158587d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55720c(String str) {
            super(1);
            this.f158587d = str;
        }

        public Object invoke(Object obj) {
            return Boolean.valueOf(C87412m.m108589b(((C64586nn1) obj).f184507i, this.f158587d));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.extension.reddot.s0$d */
    public static final class C55721d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C32224a<C13598b0> f158588d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55721d(C32224a<C13598b0> aVar) {
            super(0);
            this.f158588d = aVar;
        }

        public Object invoke() {
            this.f158588d.invoke();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.extension.reddot.s0$e */
    public static final class C55722e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C55718s0 f158589d;

        /* renamed from: e */
        public final /* synthetic */ MAutoStorage<C55718s0> f158590e;

        /* renamed from: f */
        public final /* synthetic */ C55718s0 f158591f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55722e(C55718s0 s0Var, MAutoStorage<C55718s0> mAutoStorage, C55718s0 s0Var2) {
            super(0);
            this.f158589d = s0Var;
            this.f158590e = mAutoStorage;
            this.f158591f = s0Var2;
        }

        public Object invoke() {
            long currentTimeMillis = System.currentTimeMillis();
            boolean delete = this.f158589d.mo77310q2() ? this.f158590e.delete(this.f158591f, new String[0]) : this.f158590e.replace(this.f158591f);
            Log.m105924i("Finder.RedDotCtrInfo", "[store] ret=" + delete + " username:" + this.f158589d.field_username + " tipsId=" + this.f158589d.field_tipsId + " cost=" + (System.currentTimeMillis() - currentTimeMillis));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: u2 */
    public static /* synthetic */ LinkedList m63401u2(C55718s0 s0Var, String str, boolean z, int i, String str2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        if ((i2 & 8) != 0) {
            str2 = "";
        }
        return s0Var.mo77312t2(str, z, i, str2);
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f158582G;
    }

    /* renamed from: l2 */
    public final C55718s0 mo77305l2(C51978xi1 xi12, long j) {
        List list;
        C87412m.m108594g(xi12, TPReportKeys.Common.COMMON_PROTO);
        this.field_ctrInfo = xi12;
        this.field_ctrType = xi12.f144670e;
        this.field_expiredTime = (long) xi12.f144674i;
        this.field_tipsId = xi12.f144673h;
        this.field_aiScene = j;
        if (this.field_time <= 0) {
            this.field_time = C31543z5.m39453c();
        }
        String str = xi12.f144679q;
        if (str == null) {
            str = "";
        }
        this.field_username = str;
        FinderTipsShowEntranceExtInfo finderTipsShowEntranceExtInfo = new FinderTipsShowEntranceExtInfo();
        LinkedList<C64586nn1> linkedList = xi12.f144672g;
        C87412m.m108593f(linkedList, "proto.show_infos");
        for (C64586nn1 nn12 : linkedList) {
            if (nn12.f184509n == 1) {
                C89349b bVar = nn12.f184510o;
                finderTipsShowEntranceExtInfo.parseFrom(bVar != null ? bVar.f257327a : null);
            }
        }
        this.field_tipsShowEntranceExtInfo = finderTipsShowEntranceExtInfo;
        try {
            C89349b bVar2 = this.field_ctrInfo.f144671f;
            if (bVar2 != null) {
                this.f158585F.parseFrom(bVar2.f257327a);
            }
            C64858yi1 yi12 = this.f158585F;
            if (yi12.f186555p == 0) {
                FinderTipsShowEntranceExtInfo finderTipsShowEntranceExtInfo2 = this.field_tipsShowEntranceExtInfo;
                yi12.f186553n = finderTipsShowEntranceExtInfo2.tabTipsByPassInfo;
                yi12.f186547e = finderTipsShowEntranceExtInfo2.username;
                int i = finderTipsShowEntranceExtInfo2.tab_type;
                if (i == 0) {
                    i = -1;
                }
                yi12.f186555p = i;
                yi12.f186549g = finderTipsShowEntranceExtInfo2.object_id;
                yi12.f186554o = finderTipsShowEntranceExtInfo2.object_nonce_id;
                StringBuilder sb = new StringBuilder();
                sb.append("[parseRedDotExtInfo] use old logic username=");
                sb.append(this.f158585F.f186547e);
                sb.append(" object_id=");
                sb.append(this.f158585F.f186549g);
                sb.append(" tabTipsByPassInfo=");
                sb.append(this.f158585F.f186553n != null);
                sb.append(" tipsId=");
                sb.append(this.field_tipsId);
                Log.m105924i("Finder.RedDotCtrInfo", sb.toString());
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("[parseRedDotExtInfo] username=");
                sb4.append(this.f158585F.f186547e);
                sb4.append(" object_id=");
                sb4.append(this.f158585F.f186549g);
                sb4.append(" tabTipsByPassInfo=");
                sb4.append(this.f158585F.f186553n != null);
                sb4.append(" tipsId=");
                sb4.append(this.field_tipsId);
                Log.m105924i("Finder.RedDotCtrInfo", sb4.toString());
            }
        } catch (Exception e) {
            Log.printDebugStack("Finder.RedDotCtrInfo", "", e);
        }
        C64858yi1 yi13 = this.f158585F;
        this.field_revokeId = yi13.f186546d;
        xi12.f144686x = yi13.f186549g;
        LinkedList<C64586nn1> linkedList2 = new LinkedList<>();
        LinkedList<C64586nn1> linkedList3 = this.field_ctrInfo.f144672g;
        C87412m.m108593f(linkedList3, "field_ctrInfo.show_infos");
        for (C64586nn1 nn13 : linkedList3) {
            if (Util.isNullOrNil(nn13.f184521z)) {
                nn13.f184521z = this.field_username;
            }
            ConcurrentHashMap<String, C64586nn1> concurrentHashMap = this.f158583D;
            String str2 = nn13.f184507i;
            if (str2 == null) {
                str2 = "";
            }
            concurrentHashMap.put(str2, nn13);
            if (nn13.f184506h == 2) {
                ConcurrentHashMap<String, List<String>> concurrentHashMap2 = this.f158584E;
                String str3 = nn13.f184507i;
                if (str3 == null) {
                    str3 = "";
                }
                List synchronizedList = Collections.synchronizedList(new LinkedList());
                C87412m.m108593f(synchronizedList, "synchronizedList(LinkedList<String>())");
                concurrentHashMap2.put(str3, synchronizedList);
                linkedList2.add(nn13);
            }
        }
        for (C64586nn1 nn14 : linkedList2) {
            LinkedList<C64586nn1> linkedList4 = this.field_ctrInfo.f144672g;
            C87412m.m108593f(linkedList4, "field_ctrInfo.show_infos");
            for (C64586nn1 nn15 : linkedList4) {
                if (C87412m.m108589b(nn15.f184508j, nn14.f184507i) && (list = this.f158584E.get(nn14.f184507i)) != null) {
                    String str4 = nn15.f184507i;
                    if (str4 == null) {
                        str4 = "";
                    }
                    list.add(str4);
                }
            }
        }
        return this;
    }

    /* renamed from: m2 */
    public final boolean mo77306m2(String str) {
        C87412m.m108594g(str, "path");
        return this.f158583D.get(str) != null;
    }

    /* renamed from: n2 */
    public final boolean mo77307n2(MAutoStorage<C55718s0> mAutoStorage, boolean z) {
        C87412m.m108594g(mAutoStorage, "storage");
        this.field_ctrInfo.f144672g.clear();
        this.f158583D.clear();
        this.f158584E.clear();
        return mo77314v2(mAutoStorage, z);
    }

    /* renamed from: o2 */
    public final C64586nn1 mo77308o2(String str) {
        C87412m.m108594g(str, "path");
        return this.f158583D.get(str);
    }

    /* renamed from: p2 */
    public final FinderTipsShowEntranceExtInfo mo77309p2() {
        FinderTipsShowEntranceExtInfo finderTipsShowEntranceExtInfo = this.field_tipsShowEntranceExtInfo;
        return finderTipsShowEntranceExtInfo == null ? new FinderTipsShowEntranceExtInfo() : finderTipsShowEntranceExtInfo;
    }

    /* renamed from: q2 */
    public final boolean mo77310q2() {
        LinkedList<C64586nn1> linkedList = this.field_ctrInfo.f144672g;
        return linkedList == null || linkedList.isEmpty();
    }

    /* renamed from: s2 */
    public final void mo77311s2(String str, String str2) {
        List list;
        C64586nn1 nn12 = this.f158583D.get(str);
        if (nn12 != null && nn12.f184506h == 2 && (list = this.f158584E.get(str)) != null) {
            C61926c.m72700y(list, new C29944a(str2));
        }
    }

    /* renamed from: t2 */
    public final LinkedList<String> mo77312t2(String str, boolean z, int i, String str2) {
        boolean z2;
        List<String> list;
        C87412m.m108594g(str, "path");
        Log.m105924i("Finder.RedDotCtrInfo", "removeShowInfoWithPath path:" + str + " isForceRemove:" + z + " count:" + i + " username:" + str2);
        LinkedList<String> linkedList = new LinkedList<>();
        C64586nn1 nn12 = this.f158583D.get(str);
        String str3 = null;
        if (!Util.isNullOrNil(nn12 != null ? nn12.f184521z : null)) {
            if (!C87412m.m108589b(str2, nn12 != null ? nn12.f184521z : null)) {
                StringBuilder sb = new StringBuilder();
                sb.append("removeShowInfoWithPath error. path:");
                sb.append(str);
                sb.append(" username=");
                sb.append(str2);
                sb.append(" showInfo.username=");
                if (nn12 != null) {
                    str3 = nn12.f184521z;
                }
                sb.append(str3);
                Log.m105920e("Finder.RedDotCtrInfo", sb.toString());
                return linkedList;
            }
        }
        boolean z3 = true;
        if (nn12 != null && nn12.f184506h == 1) {
            Log.m105924i("Finder.RedDotCtrInfo", "removeShowInfoWithPath INDEPENDENT path:" + str + " isForceRemove:" + z + " count:" + i + " parent:" + nn12.f184508j);
            C64586nn1 remove = this.f158583D.remove(str);
            if (remove != null) {
                linkedList.add(str);
                String str4 = remove.f184508j;
                if (!(str4 == null || str4.length() == 0)) {
                    z3 = false;
                }
                if (!z3) {
                    String str5 = remove.f184508j;
                    if (str5 == null) {
                        str5 = "";
                    }
                    String str6 = remove.f184507i;
                    if (str6 == null) {
                        str6 = "";
                    }
                    mo77311s2(str5, str6);
                    if (remove.f184502d == 2 && i == 0) {
                        i = remove.f184503e;
                    }
                    int i2 = i;
                    String str7 = remove.f184508j;
                    if (str7 == null) {
                        str7 = "";
                    }
                    linkedList.addAll(m63401u2(this, str7, false, i2, str2, 2, (Object) null));
                }
                LinkedList<C64586nn1> linkedList2 = this.field_ctrInfo.f144672g;
                C87412m.m108593f(linkedList2, "field_ctrInfo.show_infos");
                C64175a0.m75512t(linkedList2, new C55719b(str));
            }
            return linkedList;
        }
        if (nn12 != null && nn12.f184506h == 2) {
            List<String> list2 = this.f158584E.get(str);
            if (list2 != null) {
                synchronized (list2) {
                    z2 = false;
                    for (String containsKey : list2) {
                        if (this.f158583D.containsKey(containsKey)) {
                            z2 = true;
                        }
                    }
                }
            } else {
                z2 = false;
            }
            Log.m105924i("Finder.RedDotCtrInfo", "removeShowInfoWithPath isDependentExist:" + z2 + " path:" + str + " isForceRemove:" + z + " count:" + i);
            if (!z2 || z) {
                C64586nn1 remove2 = this.f158583D.remove(str);
                if (remove2 != null) {
                    linkedList.add(str);
                    if (z && z2 && (list = this.f158584E.get(str)) != null) {
                        synchronized (list) {
                            for (String str8 : list) {
                                C64586nn1 nn13 = this.f158583D.get(str8);
                                if (nn13 != null) {
                                    nn13.f184508j = "";
                                }
                            }
                        }
                    }
                    String str9 = remove2.f184508j;
                    if (!(str9 == null || str9.length() == 0)) {
                        z3 = false;
                    }
                    if (!z3) {
                        String str10 = remove2.f184508j;
                        if (str10 == null) {
                            str10 = "";
                        }
                        String str11 = remove2.f184507i;
                        if (str11 == null) {
                            str11 = "";
                        }
                        mo77311s2(str10, str11);
                        if (remove2.f184502d == 2 && i == 0) {
                            i = remove2.f184503e;
                        }
                        String str12 = remove2.f184508j;
                        if (str12 == null) {
                            str12 = "";
                        }
                        linkedList.addAll(mo77312t2(str12, z, i, str2));
                    }
                    LinkedList<C64586nn1> linkedList3 = this.field_ctrInfo.f144672g;
                    C87412m.m108593f(linkedList3, "field_ctrInfo.show_infos");
                    C64175a0.m75512t(linkedList3, new C55720c(str));
                }
            } else if (nn12.f184502d == 2 && i != 0) {
                int i3 = nn12.f184503e;
                if (i3 - i >= 0) {
                    nn12.f184503e = i3 - i;
                    Log.m105924i("Finder.RedDotCtrInfo", "removeShowInfoWithPath by count path:" + str + " isForceRemove:" + z + " count:" + i);
                    String str13 = nn12.f184508j;
                    if (str13 == null) {
                        str13 = "";
                    }
                    mo77312t2(str13, z, i, str2);
                }
            }
        }
        return linkedList;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("tipsId=");
        sb.append(this.field_tipsId);
        sb.append(" type=");
        sb.append(this.field_ctrInfo.f144670e);
        sb.append(" priority=");
        sb.append(this.field_ctrInfo.f144669d);
        sb.append(" revokeId=");
        sb.append(this.field_revokeId);
        sb.append(" show_info=");
        sb.append(this.field_ctrInfo.f144672g.size());
        sb.append(" tab_type=");
        sb.append(this.f158585F.f186555p);
        sb.append(" objectId=");
        sb.append(C61926c.m72691p(this.f158585F.f186549g));
        sb.append("ext.showInfo=");
        C48883bn1 bn12 = this.f158585F.f186542D;
        sb.append(C61926c.m72691p(bn12 != null ? bn12.f131217g : 0));
        sb.append(" username:");
        sb.append(this.field_username);
        return sb.toString();
    }

    /* renamed from: v2 */
    public final boolean mo77314v2(MAutoStorage<C55718s0> mAutoStorage, boolean z) {
        Object obj;
        C87412m.m108594g(mAutoStorage, "storage");
        String str = this.field_ctrInfo.f144673h;
        if (!(!(str == null || str.length() == 0))) {
            Log.m105920e("Finder.RedDotCtrInfo", this.field_tipsId + " is inValid");
            return false;
        }
        C55718s0 s0Var = new C55718s0();
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.m168114constructorimpl(convertTo());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.m168114constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m168120isFailureimpl(obj)) {
            obj = null;
        }
        ContentValues contentValues = (ContentValues) obj;
        if (contentValues == null) {
            contentValues = convertTo();
        }
        s0Var.convertFrom(contentValues, true);
        if ((s0Var.field_ctrInfo == null && this.field_ctrInfo != null) || (s0Var.field_tipsShowEntranceExtInfo == null && this.field_tipsShowEntranceExtInfo != null)) {
            Log.m105920e("Finder.RedDotCtrInfo", "[cloneInstance] error! " + this.field_tipsId);
            C11348f.C11349a.m11178b(C59319a.f169618b, "CtrInfoCloneInstance", false, (C11348f.C11352b) null, false, false, new C55717r0(this), 28, (Object) null);
        }
        C55722e eVar = new C55722e(this, mAutoStorage, s0Var);
        if (z) {
            C61926c.m72661F("Finder.RedDotCtrInfo", new C55721d(eVar));
        } else {
            eVar.invoke();
        }
        return true;
    }
}
