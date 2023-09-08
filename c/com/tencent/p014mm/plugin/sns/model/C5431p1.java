package com.tencent.p014mm.plugin.sns.model;

import android.content.Intent;
import android.os.Looper;
import android.os.Vibrator;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.autogen.events.SnsTimelineRefreshEvent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.ADInfo;
import com.tencent.p014mm.plugin.sns.storage.AdSnsInfo;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.SnsObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import d62.C75339i;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import fm0.C8136w;
import gv2.C98242p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import jr2.C76440q;
import jr2.C99016j;
import lc3.C10485b;
import ms2.C47096f;
import ob0.C11385n;
import ob0.C89137b0;
import os2.C100416r;
import os2.C100417r0;
import os2.C100420w;
import p823sg.C90193h;
import sf0.C90188n0;
import te3.C101829pp1;
import te3.C50903q2;
import te3.C52156yq3;
import te3.c74;
import te3.m64;
import te3.n64;
import te3.w64;
import vr2.C102236a0;

/* renamed from: com.tencent.mm.plugin.sns.model.p1 */
public final class C5431p1 {

    /* renamed from: a */
    public static final int f21134a = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("SnsUseWeiShiShootingEntranceDisplayTimes", 0);

    /* renamed from: com.tencent.mm.plugin.sns.model.p1$a */
    public static class C5432a implements C11385n, C76440q {

        /* renamed from: r */
        public static int f21135r = -1;

        /* renamed from: d */
        public Map<String, Long> f21136d = new HashMap();

        /* renamed from: e */
        public Map<String, Integer> f21137e = new HashMap();

        /* renamed from: f */
        public Map<String, Long> f21138f = new HashMap();

        /* renamed from: g */
        public Map<String, Integer> f21139g = new HashMap();

        /* renamed from: h */
        public int f21140h = 0;

        /* renamed from: i */
        public long f21141i = 0;

        /* renamed from: j */
        public long f21142j = 0;

        /* renamed from: n */
        public Map<C76440q.C76441a, String> f21143n = new HashMap();

        /* renamed from: o */
        public LinkedList<String> f21144o = new LinkedList<>();

        /* renamed from: p */
        public Map<String, ArrayList<C101829pp1>> f21145p = new HashMap();

        /* renamed from: q */
        public C94852d2 f21146q;

        /* renamed from: com.tencent.mm.plugin.sns.model.p1$a$a */
        public class C5433a implements Runnable {
            public C5433a() {
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer$1");
                C5432a aVar = C5432a.this;
                SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                aVar.getClass();
                SnsMethodCalculate.markStartTimeMs("delayCleanCache", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                if (!C94866e1.qy0() && ((HashMap) aVar.f21143n).isEmpty()) {
                    C94866e1.Fx0().mo131113e();
                    Log.m105918d("MicroMsg.SnsService", "clean sns cache");
                }
                SnsMethodCalculate.markEndTimeMs("delayCleanCache", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer$1");
            }
        }

        /* renamed from: com.tencent.mm.plugin.sns.model.p1$a$b */
        public class C5434b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f21148d;

            /* renamed from: e */
            public final /* synthetic */ boolean f21149e;

            /* renamed from: f */
            public final /* synthetic */ int f21150f;

            /* renamed from: g */
            public final /* synthetic */ int f21151g;

            public C5434b(C5432a aVar, String str, boolean z, int i, int i2) {
                this.f21148d = str;
                this.f21149e = z;
                this.f21150f = i;
                this.f21151g = i2;
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer$2");
                if (!C94941r0.m120520j1(this.f21148d)) {
                    SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer$2");
                    return;
                }
                C86709a0.m107528h();
                C89137b0 b0Var = C86709a0.m107529k().f251779b;
                String str = this.f21148d;
                boolean z = this.f21149e;
                b0Var.mo123460f(new C94941r0(str, 0, z, this.f21150f, -1, 0, z ? 4 : 8, this.f21151g));
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer$2");
            }
        }

        /* renamed from: com.tencent.mm.plugin.sns.model.p1$a$c */
        public class C5435c implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f21152d;

            /* renamed from: e */
            public final /* synthetic */ boolean f21153e;

            /* renamed from: f */
            public final /* synthetic */ int f21154f;

            /* renamed from: g */
            public final /* synthetic */ int f21155g;

            public C5435c(C5432a aVar, String str, boolean z, int i, int i2) {
                this.f21152d = str;
                this.f21153e = z;
                this.f21154f = i;
                this.f21155g = i2;
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer$3");
                if (!C94948t0.m120584j1(this.f21152d)) {
                    SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer$3");
                    return;
                }
                C86709a0.m107528h();
                C89137b0 b0Var = C86709a0.m107529k().f251779b;
                String str = this.f21152d;
                boolean z = this.f21153e;
                b0Var.mo123460f(new C94948t0(str, 0, z, this.f21154f, -1, 0, z ? 4 : 8, this.f21155g));
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer$3");
            }
        }

        /* renamed from: com.tencent.mm.plugin.sns.model.p1$a$d */
        public class C5436d implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f21156d;

            /* renamed from: e */
            public final /* synthetic */ boolean f21157e;

            /* renamed from: f */
            public final /* synthetic */ int f21158f;

            /* renamed from: g */
            public final /* synthetic */ int f21159g;

            public C5436d(C5432a aVar, String str, boolean z, int i, int i2) {
                this.f21156d = str;
                this.f21157e = z;
                this.f21158f = i;
                this.f21159g = i2;
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer$4");
                if (!C94941r0.m120520j1(this.f21156d)) {
                    SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer$4");
                    return;
                }
                C86709a0.m107528h();
                C86709a0.m107529k().f251779b.mo123460f(new C94941r0(this.f21156d, 0, this.f21157e, this.f21158f, -1, 1, 64, this.f21159g));
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer$4");
            }
        }

        /* renamed from: com.tencent.mm.plugin.sns.model.p1$a$e */
        public class C5437e implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f21160d;

            /* renamed from: e */
            public final /* synthetic */ boolean f21161e;

            /* renamed from: f */
            public final /* synthetic */ int f21162f;

            /* renamed from: g */
            public final /* synthetic */ int f21163g;

            public C5437e(C5432a aVar, String str, boolean z, int i, int i2) {
                this.f21160d = str;
                this.f21161e = z;
                this.f21162f = i;
                this.f21163g = i2;
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer$5");
                if (!C94948t0.m120584j1(this.f21160d)) {
                    SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer$5");
                    return;
                }
                C86709a0.m107528h();
                C86709a0.m107529k().f251779b.mo123460f(new C94948t0(this.f21160d, 0, this.f21161e, this.f21162f, -1, 1, 64, this.f21163g));
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer$5");
            }
        }

        public C5432a() {
            new HashMap();
            this.f21146q = new C94852d2();
        }

        /* renamed from: a */
        public static void m5338a(String str) {
            boolean z;
            SnsMethodCalculate.markStartTimeMs("cancelLiked", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
            C94843b1 Rx0 = C94866e1.Rx0();
            Rx0.getClass();
            SnsMethodCalculate.markStartTimeMs("getSelfName", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
            if (Util.isNullOrNil(Rx0.f274776c)) {
                Rx0.f274776c = C75592q0.m90789s();
            }
            String str2 = Rx0.f274776c;
            SnsMethodCalculate.markEndTimeMs("getSelfName", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
            SnsInfo a = C100416r.m131408a(str);
            try {
                SnsObject snsObject = (SnsObject) new SnsObject().parseFrom(a.field_attrBuf);
                Iterator<w64> it = snsObject.LikeUserList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    w64 next = it.next();
                    if (next.f299703d.equals(str2)) {
                        snsObject.LikeUserList.remove(next);
                        snsObject.LikeCount--;
                        a.field_attrBuf = snsObject.toByteArray();
                        C100416r.m131410c(a);
                        break;
                    }
                }
            } catch (Exception unused) {
            }
            C94843b1 Rx02 = C94866e1.Rx0();
            long n = C100417r0.m131425n(str);
            synchronized (Rx02) {
                SnsMethodCalculate.markStartTimeMs("addLikedCancel", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
                C47096f fVar = new C47096f();
                fVar.f126561d = n;
                fVar.f126562e = (int) Util.nowSecond();
                Rx02.f274774a.f292904i.add(fVar);
                Rx02.mo130956o();
                z = !C94843b1.m120187h(n, Rx02.f274774a.f292899d, "", true);
                SnsMethodCalculate.markEndTimeMs("addLikedCancel", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
            }
            if (z) {
                if (a.isAd()) {
                    ADInfo adInfo = a.getAdInfo();
                    ((C99016j) C86312j.m106911c(C99016j.class)).mo55732rh(11855, a.getAdRecSrc(), 0, adInfo == null ? "" : adInfo.viewId, Integer.valueOf(a.getAdRecSrc()));
                    C86709a0.m107528h();
                    C86709a0.m107529k().f251779b.mo123460f(new C94877g0(C100417r0.m131425n(str), 7));
                } else {
                    C86709a0.m107528h();
                    C86709a0.m107529k().f251779b.mo123460f(new C94877g0(C100417r0.m131425n(str), 5));
                }
            }
            SnsMethodCalculate.markEndTimeMs("cancelLiked", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        }

        /* renamed from: j */
        public static int m5339j() {
            SnsMethodCalculate.markStartTimeMs("getTimelineControlFlag", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
            int i = f21135r;
            if (i != -1) {
                SnsMethodCalculate.markEndTimeMs("getTimelineControlFlag", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                return i;
            }
            Vibrator vibrator = C102236a0.f301037a;
            SnsMethodCalculate.markStartTimeMs("getSnsFlag", "com.tencent.mm.plugin.sns.data.SnsUtil");
            int i2 = MMApplicationContext.getContext().getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0).getInt("sns_control_flag", 0);
            SnsMethodCalculate.markEndTimeMs("getSnsFlag", "com.tencent.mm.plugin.sns.data.SnsUtil");
            f21135r = i2;
            Log.m105925i("MicroMsg.SnsService", "getTimelineControlFlag %d", Integer.valueOf(i2));
            int i3 = f21135r;
            SnsMethodCalculate.markEndTimeMs("getTimelineControlFlag", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
            return i3;
        }

        /* renamed from: k */
        public static w64 m5340k(SnsInfo snsInfo, int i, String str, int i2) {
            SnsMethodCalculate.markStartTimeMs("sendComment", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
            SnsMethodCalculate.markStartTimeMs("sendComment", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
            w64 m = m5342m(snsInfo, i, str, (w64) null, false, 0, i2, "");
            SnsMethodCalculate.markEndTimeMs("sendComment", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
            SnsMethodCalculate.markEndTimeMs("sendComment", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
            return m;
        }

        /* renamed from: l */
        public static w64 m5341l(SnsInfo snsInfo, int i, String str, long j, String str2, boolean z, int i2) {
            String str3;
            SnsInfo snsInfo2 = snsInfo;
            long j2 = j;
            String str4 = str2;
            int i3 = i2;
            Class cls = C99016j.class;
            Class cls2 = C75339i.class;
            SnsMethodCalculate.markStartTimeMs("sendComment", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
            m64 m64 = new m64();
            m64.f298780n = str;
            m64.f298779j = (int) (Util.nowMilliSecond() / 1000);
            m64.f298775f = C75592q0.m90783m();
            m64.f298773d = C75592q0.m90789s();
            m64.f298778i = i3;
            m64.f298776g = ((C75339i) C86312j.m106911c(cls2)).getDisplayName(snsInfo.getUserName());
            m64.f298774e = snsInfo.getUserName();
            m64.f298777h = i;
            if (snsInfo2.isSourceExist(32)) {
                m64.f298784r = j2;
            } else {
                m64.f298781o = (int) j2;
            }
            m64 m642 = new m64();
            m642.f298773d = str4;
            if (!Util.isNullOrNil(str2)) {
                m642.f298775f = ((C75339i) C86312j.m106911c(cls2)).getDisplayName(m642.f298773d);
            }
            n64 n64 = new n64();
            n64.f298897d = snsInfo2.field_snsId;
            n64.f298899f = m64;
            n64.f298900g = m642;
            if (snsInfo.isAd()) {
                ADInfo adInfo = snsInfo.getAdInfo();
                String str5 = adInfo == null ? "" : adInfo.viewId;
                str3 = adInfo == null ? "" : adInfo.uxInfo;
                int i4 = m64.f298777h;
                if (i4 == 7) {
                    ((C99016j) C86312j.m106911c(cls)).mo55732rh(11855, snsInfo.getAdRecSrc(), 1, str5, Integer.valueOf(snsInfo.getAdRecSrc()));
                } else if (i4 == 8) {
                    ((C99016j) C86312j.m106911c(cls)).mo55732rh(11855, snsInfo.getAdRecSrc(), 2, str5, Integer.valueOf(snsInfo.getAdRecSrc()));
                }
            } else {
                str3 = "";
            }
            String f = C90193h.m112878f(("" + Util.currentTicks()).getBytes());
            if (snsInfo2.isSourceExist(32)) {
                f = "_AD_TAG_" + f;
            }
            if (!C94866e1.Rx0().mo130946a(f, n64, str3)) {
                Log.m105920e("MicroMsg.SnsService", "can not add Comment");
            } else if (C94843b1.m120189l(f)) {
                C86709a0.m107528h();
                C86709a0.m107529k().f251779b.mo123460f(new C94970y(n64, f, str3, 0));
            } else {
                C86709a0.m107528h();
                C86709a0.m107529k().f251779b.mo123460f(new C94850d0(n64, f, i3));
            }
            if (!z) {
                SnsMethodCalculate.markEndTimeMs("sendComment", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                return null;
            }
            w64 w64 = new w64();
            w64.f299708i = m64.f298779j;
            w64.f299706g = m64.f298777h;
            w64.f299705f = m64.f298778i;
            w64.f299703d = m64.f298773d;
            w64.f299704e = m64.f298775f;
            w64.f299707h = m64.f298780n;
            w64.f299716t = m64.f298787u;
            if (snsInfo2.isSourceExist(32)) {
                w64.f299713q = j2;
            } else {
                w64.f299710n = (int) j2;
            }
            w64.f299711o = str4;
            SnsMethodCalculate.markEndTimeMs("sendComment", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
            return w64;
        }

        /* renamed from: m */
        public static w64 m5342m(SnsInfo snsInfo, int i, String str, w64 w64, boolean z, int i2, int i3, String str2) {
            long j;
            int i4;
            String str3;
            ADInfo aDInfo;
            SnsInfo snsInfo2 = snsInfo;
            int i5 = i;
            w64 w642 = w64;
            int i6 = i2;
            int i7 = i3;
            Class cls = C99016j.class;
            Class cls2 = C75339i.class;
            SnsMethodCalculate.markStartTimeMs("sendComment", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
            m64 m64 = new m64();
            m64.f298780n = str;
            m64.f298779j = (int) (Util.nowMilliSecond() / 1000);
            m64.f298775f = C75592q0.m90783m();
            m64.f298773d = C75592q0.m90789s();
            m64.f298778i = 0;
            m64.f298776g = ((C75339i) C86312j.m106911c(cls2)).getDisplayName(snsInfo.getUserName());
            m64.f298774e = snsInfo.getUserName();
            m64.f298777h = i5;
            m64.f298787u = i6;
            if (snsInfo2.isSourceExist(32)) {
                m64.f298784r = w642 == null ? 0 : w642.f299714r;
            } else {
                m64.f298781o = w642 == null ? 0 : w642.f299709j;
            }
            if (!Util.isNullOrNil(str2)) {
                c74 c74 = new c74();
                c74.f131560d = str2;
                LinkedList<c74> linkedList = new LinkedList<>();
                m64.f298789w = linkedList;
                linkedList.add(c74);
                m64.f298790x = 1;
            }
            m64 m642 = new m64();
            String str4 = "";
            String str5 = w642 == null ? str4 : w642.f299703d;
            m642.f298773d = str5;
            if (!Util.isNullOrNil(str5)) {
                m642.f298775f = ((C75339i) C86312j.m106911c(cls2)).getDisplayName(m642.f298773d);
            }
            n64 n64 = new n64();
            n64.f298897d = snsInfo2.field_snsId;
            n64.f298899f = m64;
            n64.f298900g = m642;
            if (snsInfo.isAd()) {
                Log.m105924i("MicroMsg.SnsService", "sendComment, sourceScene=" + i7 + ", type=" + i5 + ", flag=" + i6);
                if (i7 == 2) {
                    aDInfo = snsInfo.getAtAdInfo();
                    i4 = 1;
                } else {
                    aDInfo = snsInfo.getAdInfo();
                    i4 = 0;
                }
                String str6 = aDInfo == null ? str4 : aDInfo.viewId;
                String str7 = aDInfo == null ? str4 : aDInfo.uxInfo;
                int i8 = m64.f298777h;
                String str8 = str7;
                if (i8 == 7) {
                    ((C99016j) C86312j.m106911c(cls)).mo55732rh(11855, snsInfo.getAdRecSrc(), 1, str6, Integer.valueOf(snsInfo.getAdRecSrc()));
                } else if (i8 == 8) {
                    ((C99016j) C86312j.m106911c(cls)).mo55732rh(11855, snsInfo.getAdRecSrc(), 2, str6, Integer.valueOf(snsInfo.getAdRecSrc()));
                }
                AdSnsInfo adSnsInfo = snsInfo.getAdSnsInfo();
                if (adSnsInfo != null) {
                    if (adSnsInfo.field_firstControlTime == 0) {
                        adSnsInfo.field_firstControlTime = m64.f298779j;
                        C94866e1.zx0().mo139863bD(adSnsInfo.field_snsId, adSnsInfo);
                    }
                    C50903q2 remindInfoGroup = adSnsInfo.getRemindInfoGroup();
                    if (i7 == 2) {
                        if (remindInfoGroup != null) {
                            m64 m643 = n64.f298899f;
                            C52156yq3 yq32 = remindInfoGroup.f140096e;
                            m643.f298788v = yq32;
                            if (yq32 != null) {
                                Log.m105925i("MicroMsg.SnsService", "atFriend remindInfo aid64 %d, aid %d", Long.valueOf(yq32.f145470i), Integer.valueOf(remindInfoGroup.f140096e.f145465d));
                                C52156yq3 yq33 = remindInfoGroup.f140096e;
                                if (yq33.f145470i == 0 && yq33.f145465d == 0) {
                                    C115669n.INSTANCE.mo175911u(C8136w.CTRL_INDEX, 9);
                                }
                            } else {
                                C115669n.INSTANCE.mo175911u(C8136w.CTRL_INDEX, 7);
                                Log.m105924i("MicroMsg.SnsService", "remindInfo is null!");
                            }
                        } else {
                            Log.m105924i("MicroMsg.SnsService", "remindInfo group is null!");
                            C115669n.INSTANCE.mo175911u(C8136w.CTRL_INDEX, 5);
                        }
                    } else if (C98242p.m126942d(i6, 8)) {
                        Log.m105924i("MicroMsg.SnsService", "sendAtFriend");
                        if (remindInfoGroup != null) {
                            C52156yq3 yq34 = remindInfoGroup.f140095d;
                            if (yq34 != null) {
                                n64.f298899f.f298788v = yq34;
                                Log.m105925i("MicroMsg.SnsService", "timeline remindInfo aid64 %d, aid %d", Long.valueOf(yq34.f145470i), Integer.valueOf(remindInfoGroup.f140095d.f145465d));
                                C52156yq3 yq35 = remindInfoGroup.f140095d;
                                if (yq35.f145470i == 0 && yq35.f145465d == 0) {
                                    C115669n.INSTANCE.mo175911u(C8136w.CTRL_INDEX, 8);
                                }
                            } else {
                                C52156yq3 yq36 = remindInfoGroup.f140096e;
                                if (yq36 != null) {
                                    n64.f298899f.f298788v = yq36;
                                    Log.m105925i("MicroMsg.SnsService", "atFriend remindInfo aid64 %d, aid %d", Long.valueOf(yq36.f145470i), Integer.valueOf(remindInfoGroup.f140096e.f145465d));
                                    C52156yq3 yq37 = remindInfoGroup.f140096e;
                                    j = 0;
                                    if (yq37.f145470i == 0 && yq37.f145465d == 0) {
                                        C115669n.INSTANCE.mo175911u(C8136w.CTRL_INDEX, 8);
                                    }
                                } else {
                                    j = 0;
                                    C115669n.INSTANCE.mo175911u(C8136w.CTRL_INDEX, 6);
                                    Log.m105924i("MicroMsg.SnsService", "remindInfo is null!");
                                }
                            }
                        } else {
                            j = 0;
                            Log.m105924i("MicroMsg.SnsService", "remindInfo group is null!");
                            C115669n.INSTANCE.mo175911u(C8136w.CTRL_INDEX, 5);
                        }
                        str3 = str8;
                    }
                }
                j = 0;
                str3 = str8;
            } else {
                j = 0;
                str3 = str4;
                i4 = 0;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str4);
            String str9 = "MicroMsg.SnsService";
            sb.append(Util.currentTicks());
            String f = C90193h.m112878f(sb.toString().getBytes());
            if (snsInfo2.isSourceExist(32)) {
                f = "_AD_TAG_" + f;
            }
            C94843b1 Rx0 = C94866e1.Rx0();
            Rx0.getClass();
            SnsMethodCalculate.markStartTimeMs("addComment", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
            boolean a = Rx0.mo130946a(f, n64, str4);
            SnsMethodCalculate.markEndTimeMs("addComment", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
            if (!a) {
                Log.m105920e(str9, "can not add Comment");
            } else if (C94843b1.m120189l(f)) {
                C86709a0.m107528h();
                C86709a0.m107529k().f251779b.mo123460f(new C94970y(n64, f, str3, i4));
            } else {
                C86709a0.m107528h();
                C86709a0.m107529k().f251779b.mo123460f(new C94850d0(n64, f, i7));
            }
            if (!z) {
                SnsMethodCalculate.markEndTimeMs("sendComment", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                return null;
            }
            w64 w643 = new w64();
            w643.f299708i = m64.f298779j;
            w643.f299706g = m64.f298777h;
            w643.f299705f = m64.f298778i;
            w643.f299703d = m64.f298773d;
            w643.f299704e = m64.f298775f;
            w643.f299707h = m64.f298780n;
            w643.f299716t = m64.f298787u;
            if (snsInfo2.isSourceExist(32)) {
                w643.f299713q = w642 == null ? j : w642.f299714r;
            } else {
                w643.f299710n = w642 == null ? 0 : w642.f299709j;
            }
            if (w642 != null) {
                str4 = w642.f299703d;
            }
            w643.f299711o = str4;
            SnsMethodCalculate.markEndTimeMs("sendComment", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
            return w643;
        }

        /* renamed from: n */
        public static void m5343n(String str, int i, String str2, SnsInfo snsInfo, int i2) {
            SnsMethodCalculate.markStartTimeMs("sendCommentToStranger", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
            if (i == 3 || i == 5) {
                m64 m64 = new m64();
                m64.f298780n = str2;
                m64.f298779j = (int) (System.currentTimeMillis() / 1000);
                m64.f298775f = C75592q0.m90783m();
                m64.f298773d = C75592q0.m90789s();
                m64.f298778i = i2;
                m64.f298776g = ((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(str);
                m64.f298774e = str;
                m64.f298777h = i;
                n64 n64 = new n64();
                n64.f298897d = snsInfo.field_snsId;
                n64.f298899f = m64;
                n64.f298900g = new m64();
                String f = C90193h.m112878f(("" + Util.currentTicks()).getBytes());
                long j = snsInfo.field_snsId;
                SnsMethodCalculate.markStartTimeMs("insertCommentStg", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                try {
                    Log.m105926v("MicroMsg.SnsService", "comment stg inserted");
                    C100420w wVar = new C100420w();
                    wVar.field_talker = str;
                    wVar.field_snsID = j;
                    wVar.field_createTime = (int) (System.currentTimeMillis() / 1000);
                    wVar.field_curActionBuf = m64.toByteArray();
                    wVar.field_type = i;
                    wVar.field_isSend = true;
                    wVar.field_isRead = 1;
                    C94866e1.Tx0().insert(wVar);
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.SnsService", e, "", new Object[0]);
                }
                SnsMethodCalculate.markEndTimeMs("insertCommentStg", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                C94843b1 Rx0 = C94866e1.Rx0();
                Rx0.getClass();
                SnsMethodCalculate.markStartTimeMs("addComment", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
                Rx0.mo130946a(f, n64, "");
                SnsMethodCalculate.markEndTimeMs("addComment", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
                SnsMethodCalculate.markEndTimeMs("sendCommentToStranger", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                return;
            }
            SnsMethodCalculate.markEndTimeMs("sendCommentToStranger", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        }

        /* renamed from: o */
        public static w64 m5344o(SnsInfo snsInfo, int i, String str, w64 w64, int i2, int i3, String str2) {
            SnsMethodCalculate.markStartTimeMs("sendCommentWithFlag", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
            SnsMethodCalculate.markStartTimeMs("sendCommentWithFlag", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
            w64 m = m5342m(snsInfo, i, str, w64, false, i2, i3, str2);
            SnsMethodCalculate.markEndTimeMs("sendCommentWithFlag", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
            SnsMethodCalculate.markEndTimeMs("sendCommentWithFlag", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
            return m;
        }

        /* renamed from: b */
        public void mo6411b(String str) {
            SnsMethodCalculate.markStartTimeMs("cleanGalleryItem", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
            ((HashMap) this.f21145p).remove(str);
            SnsMethodCalculate.markEndTimeMs("cleanGalleryItem", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        }

        /* renamed from: c */
        public boolean mo6412c(C76440q.C76441a aVar, int i) {
            SnsMethodCalculate.markStartTimeMs("closeServer", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
            Log.m105918d("MicroMsg.SnsService", "closeServer");
            ((HashMap) this.f21143n).remove(aVar);
            if ((i == 2 || i == 10) && this.f21144o.size() > 0) {
                this.f21144o.removeLast();
            }
            if (((HashMap) this.f21143n).isEmpty()) {
                C86709a0.m107528h();
                C86709a0.m107529k().f251779b.mo123470p(211, this);
                C86709a0.m107528h();
                C86709a0.m107529k().f251779b.mo123470p(212, this);
                C86709a0.m107528h();
                C86709a0.m107529k().f251779b.mo123470p(5203, this);
                Map<String, String> map = C94938q1.f275149a;
                synchronized (C94938q1.class) {
                    SnsMethodCalculate.markStartTimeMs("release", "com.tencent.mm.plugin.sns.model.SnsPathHelper");
                    ((HashMap) C94938q1.f275149a).clear();
                    SnsMethodCalculate.markEndTimeMs("release", "com.tencent.mm.plugin.sns.model.SnsPathHelper");
                }
                SnsInfo.release();
                new MMHandler(Looper.getMainLooper()).postDelayed(new C5433a(), FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
                int i2 = C94897n1.f274990d;
                SnsMethodCalculate.markStartTimeMs("cleanCacheObj", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
                Map<String, SnsObject> map2 = C94897n1.f274992f;
                if (map2 != null) {
                    ((ConcurrentHashMap) map2).clear();
                }
                SnsMethodCalculate.markEndTimeMs("cleanCacheObj", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
                Log.m105924i("MicroMsg.SnsService", "close finish");
            }
            SnsMethodCalculate.markEndTimeMs("closeServer", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
            return true;
        }

        /* renamed from: d */
        public void mo6413d(int i, String str, boolean z, boolean z2, int i2) {
            SnsMethodCalculate.markStartTimeMs("doFpList", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
            if (C90188n0.f258938f) {
                SnsMethodCalculate.markEndTimeMs("doFpList", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                return;
            }
            boolean n5 = C72996z1.m85843n5(str);
            Log.m105919d("MicroMsg.SnsService", "doFpList type: %s, objectId: %s", Integer.valueOf(i), str);
            SnsTimelineRefreshEvent snsTimelineRefreshEvent = new SnsTimelineRefreshEvent();
            snsTimelineRefreshEvent.f265197d.f265198a = 1;
            snsTimelineRefreshEvent.publish();
            if (i == 2) {
                if (!n5) {
                    C94866e1.my0().post(new C5434b(this, str, z2, i2, i));
                } else {
                    C94866e1.my0().post(new C5435c(this, str, z2, i2, i));
                }
            } else if (i == 1) {
                if (!C94916o0.m120461j1("@__weixintimtline")) {
                    SnsMethodCalculate.markEndTimeMs("doFpList", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                    return;
                }
                C94866e1.fy0().f275362q = 2;
                C94866e1.fy0().f275370y = C94866e1.Yx0().c40(0, 1, true);
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119676J(68377, "");
                C86709a0.m107528h();
                C86709a0.m107529k().f251779b.mo123460f(new C94916o0(0, 0, 0));
            } else if (i != 3) {
                if (i == 4) {
                    if (!C94846c0.m120211j1("@__classify_timeline")) {
                        SnsMethodCalculate.markEndTimeMs("doFpList", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                        return;
                    } else {
                        C86709a0.m107528h();
                        C86709a0.m107529k().f251779b.mo123460f(new C94846c0(0, ""));
                    }
                } else if (i == 10) {
                    if (!n5) {
                        C94866e1.my0().post(new C5436d(this, str, z2, i2, i));
                    } else {
                        C94866e1.my0().post(new C5437e(this, str, z2, i2, i));
                    }
                }
            }
            SnsMethodCalculate.markEndTimeMs("doFpList", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        }

        /* renamed from: e */
        public void mo6414e(int i, String str, boolean z, boolean z2, int i2) {
            String str2;
            String str3;
            long longValue;
            long longValue2;
            long longValue3;
            long longValue4;
            int i3 = i;
            String str4 = str;
            SnsMethodCalculate.markStartTimeMs("doNpList", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
            if (C90188n0.f258938f) {
                SnsMethodCalculate.markEndTimeMs("doNpList", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                return;
            }
            synchronized (this.f21136d) {
                try {
                    Log.m105919d("MicroMsg.SnsService", "DO NP　NP ~_~ %s type %s timeLastId: %s userLastIds: %s", str4, Integer.valueOf(i), Long.valueOf(this.f21141i), this.f21136d);
                } finally {
                    while (true) {
                        str2 = "doNpList";
                        str3 = "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer";
                        SnsMethodCalculate.markEndTimeMs(str2, str3);
                    }
                }
            }
            boolean n5 = C72996z1.m85843n5(str);
            if (i3 == 2) {
                if (!n5) {
                    if (!C94941r0.m120520j1(str)) {
                        SnsMethodCalculate.markEndTimeMs("doNpList", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                        return;
                    }
                    synchronized (this.f21136d) {
                        try {
                            longValue4 = ((HashMap) this.f21136d).containsKey(str4) ? ((Long) ((HashMap) this.f21136d).get(str4)).longValue() : 0;
                        } catch (Throwable th) {
                            while (true) {
                                throw th;
                            }
                        }
                    }
                    if (longValue4 == 0) {
                        C94941r0.m120521n1(str);
                        SnsMethodCalculate.markEndTimeMs("doNpList", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                        return;
                    }
                    C86709a0.m107528h();
                    C86709a0.m107529k().f251779b.mo123460f(new C94941r0(str, longValue4, z2, i2, -1, 0, z2 ? 4 : 8, i));
                } else if (!C94948t0.m120584j1(str)) {
                    SnsMethodCalculate.markEndTimeMs("doNpList", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                    return;
                } else {
                    synchronized (this.f21136d) {
                        try {
                            longValue3 = ((HashMap) this.f21136d).containsKey(str4) ? ((Long) ((HashMap) this.f21136d).get(str4)).longValue() : 0;
                        } catch (Throwable th4) {
                            while (true) {
                                SnsMethodCalculate.markEndTimeMs("doNpList", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                                throw th4;
                            }
                        }
                    }
                    if (longValue3 == 0) {
                        C94948t0.m120585o1(str);
                        SnsMethodCalculate.markEndTimeMs("doNpList", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                        return;
                    }
                    C86709a0.m107528h();
                    C86709a0.m107529k().f251779b.mo123460f(new C94948t0(str, longValue3, z2, i2, -1, 0, z2 ? 4 : 8, i));
                }
            } else if (i3 == 1) {
                if (!C94916o0.m120461j1("@__weixintimtline")) {
                    Log.m105920e("MicroMsg.Improve.DataFlow", "addTimeLineReq error");
                    SnsMethodCalculate.markEndTimeMs("doNpList", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                    return;
                } else if (this.f21141i == 0) {
                    C94916o0.m120462n1("@__weixintimtline");
                    Log.m105920e("MicroMsg.Improve.DataFlow", "load more but timeLastId = 0");
                    SnsMethodCalculate.markEndTimeMs("doNpList", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                    return;
                } else {
                    C94866e1.fy0().f275362q = 2;
                    C86709a0.m107528h();
                    C86709a0.m107529k().f251779b.mo123460f(new C94916o0(this.f21141i, 0, 0));
                }
            } else if (i3 != 3) {
                if (i3 == 4) {
                    if (!C94846c0.m120211j1("@__classify_timeline")) {
                        SnsMethodCalculate.markEndTimeMs("doNpList", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                        return;
                    } else if (this.f21141i == 0) {
                        C94846c0.m120212k1("@__classify_timeline");
                        SnsMethodCalculate.markEndTimeMs("doNpList", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                        return;
                    } else {
                        C86709a0.m107528h();
                        C86709a0.m107529k().f251779b.mo123460f(new C94846c0(0, ""));
                    }
                } else if (i3 == 10) {
                    if (!n5) {
                        if (!C94941r0.m120520j1(str)) {
                            SnsMethodCalculate.markEndTimeMs("doNpList", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                            return;
                        }
                        synchronized (this.f21138f) {
                            try {
                                longValue2 = ((HashMap) this.f21138f).containsKey(str4) ? ((Long) ((HashMap) this.f21138f).get(str4)).longValue() : 0;
                            } catch (Throwable th5) {
                                while (true) {
                                    SnsMethodCalculate.markEndTimeMs("doNpList", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                                    throw th5;
                                }
                            }
                        }
                        if (longValue2 == 0) {
                            C94941r0.m120521n1(str);
                            SnsMethodCalculate.markEndTimeMs("doNpList", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                            return;
                        }
                        C86709a0.m107528h();
                        C86709a0.m107529k().f251779b.mo123460f(new C94941r0(str, longValue2, z2, i2, -1, 1, 64, i));
                    } else if (!C94948t0.m120584j1(str)) {
                        SnsMethodCalculate.markEndTimeMs("doNpList", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                        return;
                    } else {
                        synchronized (this.f21138f) {
                            try {
                                longValue = ((HashMap) this.f21138f).containsKey(str4) ? ((Long) ((HashMap) this.f21138f).get(str4)).longValue() : 0;
                            } catch (Throwable th6) {
                                while (true) {
                                    SnsMethodCalculate.markEndTimeMs("doNpList", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                                    throw th6;
                                }
                            }
                        }
                        if (longValue == 0) {
                            C94948t0.m120585o1(str);
                            SnsMethodCalculate.markEndTimeMs("doNpList", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                            return;
                        }
                        C86709a0.m107528h();
                        C86709a0.m107529k().f251779b.mo123460f(new C94948t0(str, longValue, z2, i2, -1, 1, 64, i));
                    }
                }
            }
            SnsMethodCalculate.markEndTimeMs("doNpList", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        }

        /* renamed from: f */
        public void mo6415f(int i, String str, int i2, boolean z, long j, int i3) {
            int i4 = i;
            int i5 = i2;
            SnsMethodCalculate.markStartTimeMs("doOtherList", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
            Log.m105925i("MicroMsg.SnsService", "doOtherList fetchType:%s, type:%s", Integer.valueOf(i2), Integer.valueOf(i));
            if (i4 == 2) {
                if (!C94941r0.m120520j1(str)) {
                    SnsMethodCalculate.markEndTimeMs("doOtherList", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                    return;
                } else if (i5 == 0) {
                    this.f21146q.mo130972a(str, z, i3, j, i);
                } else if (i5 == 1) {
                    this.f21146q.mo130973b(str, z, i3, j, i);
                } else if (i5 == 2) {
                    this.f21146q.getClass();
                    SnsMethodCalculate.markStartTimeMs("doDownFetch", "com.tencent.mm.plugin.sns.model.SnsUpDownServerHelper");
                    C86709a0.m107528h();
                    C86709a0.m107529k().f251779b.mo123460f(new C94941r0(str, C94897n1.f274988b, z, i3, 2, 0, z ? 4 : 8, 2));
                    SnsMethodCalculate.markEndTimeMs("doDownFetch", "com.tencent.mm.plugin.sns.model.SnsUpDownServerHelper");
                }
            } else if (i4 == 1) {
                if (!C94916o0.m120461j1("@__weixintimtline")) {
                    SnsMethodCalculate.markEndTimeMs("doOtherList", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                    return;
                }
                C94866e1.fy0().f275362q = i5;
                if (i5 == 0) {
                    this.f21146q.mo130972a(str, z, i3, j, i);
                } else if (i5 == 1) {
                    C94866e1.fy0().f275365t = true;
                    this.f21146q.mo130973b(str, z, i3, this.f21142j, i);
                }
            }
            SnsMethodCalculate.markEndTimeMs("doOtherList", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        }

        /* renamed from: g */
        public Intent mo6416g(Intent intent, String str) {
            SnsMethodCalculate.markStartTimeMs("getIntent", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
            intent.putExtra("sns_userName", str);
            LinkedList<String> linkedList = this.f21144o;
            if (linkedList == null || !linkedList.contains(str)) {
                SnsMethodCalculate.markEndTimeMs("getIntent", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                return intent;
            }
            intent.addFlags(536870912);
            intent.addFlags(67108864);
            SnsMethodCalculate.markEndTimeMs("getIntent", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
            return intent;
        }

        /* renamed from: h */
        public int mo6417h() {
            SnsMethodCalculate.markStartTimeMs("getRespCount", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
            int i = this.f21140h;
            if (i <= 0) {
                i = C102236a0.m134723R();
            }
            SnsMethodCalculate.markEndTimeMs("getRespCount", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
            return i;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs("getRespCount", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0031, code lost:
            return r3;
         */
        /* renamed from: i */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo6418i(java.lang.String r3) {
            /*
                r2 = this;
                java.lang.String r0 = "getRespCount"
                java.lang.String r1 = "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
                java.util.Map<java.lang.String, java.lang.Integer> r0 = r2.f21137e
                monitor-enter(r0)
                java.util.Map<java.lang.String, java.lang.Integer> r1 = r2.f21137e     // Catch:{ all -> 0x003f }
                java.util.HashMap r1 = (java.util.HashMap) r1     // Catch:{ all -> 0x003f }
                boolean r1 = r1.containsKey(r3)     // Catch:{ all -> 0x003f }
                if (r1 == 0) goto L_0x0032
                java.util.Map<java.lang.String, java.lang.Integer> r1 = r2.f21137e     // Catch:{ all -> 0x003f }
                java.util.HashMap r1 = (java.util.HashMap) r1     // Catch:{ all -> 0x003f }
                java.lang.Object r3 = r1.get(r3)     // Catch:{ all -> 0x003f }
                java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x003f }
                int r3 = r3.intValue()     // Catch:{ all -> 0x003f }
                if (r3 <= 0) goto L_0x0025
                goto L_0x0029
            L_0x0025:
                int r3 = vr2.C102236a0.m134723R()     // Catch:{ all -> 0x003f }
            L_0x0029:
                monitor-exit(r0)     // Catch:{ all -> 0x003f }
                java.lang.String r0 = "getRespCount"
                java.lang.String r1 = "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                return r3
            L_0x0032:
                monitor-exit(r0)     // Catch:{ all -> 0x003f }
                int r3 = vr2.C102236a0.m134723R()
                java.lang.String r0 = "getRespCount"
                java.lang.String r1 = "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                return r3
            L_0x003f:
                r3 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x003f }
                java.lang.String r0 = "getRespCount"
                java.lang.String r1 = "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.model.C5431p1.C5432a.mo6418i(java.lang.String):int");
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x006f  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0079  */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x00ef  */
        /* JADX WARNING: Removed duplicated region for block: B:68:0x014d  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onSceneEnd(int r30, int r31, java.lang.String r32, ob0.C117747y r33) {
            /*
                r29 = this;
                r6 = r29
                r7 = r30
                r15 = r31
                r0 = r32
                r1 = r33
                java.lang.String r5 = "onSceneEnd"
                java.lang.String r4 = "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r4)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "onSceneEnd: errType = "
                r2.append(r3)
                r2.append(r7)
                java.lang.String r3 = " errCode = "
                r2.append(r3)
                r2.append(r15)
                java.lang.String r3 = " errMsg = "
                r2.append(r3)
                r2.append(r0)
                java.lang.String r3 = " type = "
                r2.append(r3)
                int r3 = r33.getType()
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                java.lang.String r14 = "MicroMsg.SnsService"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r2)
                java.lang.String r2 = "isPreloadForUnread"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r4)
                boolean r3 = r1 instanceof com.tencent.p014mm.plugin.sns.model.C94916o0
                r13 = 2
                java.lang.String r8 = "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine"
                if (r3 == 0) goto L_0x0069
                r3 = r1
                com.tencent.mm.plugin.sns.model.o0 r3 = (com.tencent.p014mm.plugin.sns.model.C94916o0) r3
                java.lang.String r9 = "isForUnreadPreload"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r8)
                int r3 = r3.f275070u
                if (r3 != r13) goto L_0x0061
                r3 = 1
                goto L_0x0062
            L_0x0061:
                r3 = 0
            L_0x0062:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r8)
                if (r3 == 0) goto L_0x0069
                r3 = 1
                goto L_0x006a
            L_0x0069:
                r3 = 0
            L_0x006a:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r4)
                if (r3 == 0) goto L_0x0079
                java.lang.String r0 = "skip by preload unread feeds"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r0)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r4)
                return
            L_0x0079:
                int r2 = r33.getType()
                r3 = 5203(0x1453, float:7.291E-42)
                r9 = 212(0xd4, float:2.97E-43)
                r10 = 211(0xd3, float:2.96E-43)
                if (r2 == r9) goto L_0x0096
                int r2 = r33.getType()
                if (r2 == r3) goto L_0x0096
                int r2 = r33.getType()
                if (r2 != r10) goto L_0x0092
                goto L_0x0096
            L_0x0092:
                r15 = r4
                r2 = r5
                goto L_0x036a
            L_0x0096:
                r2 = r1
                jr2.h r2 = (jr2.C99014h) r2
                java.util.ArrayList r11 = new java.util.ArrayList
                java.util.Map<jr2.q$a, java.lang.String> r12 = r6.f21143n
                java.util.HashMap r12 = (java.util.HashMap) r12
                java.util.Set r12 = r12.keySet()
                r11.<init>(r12)
                java.lang.String r12 = "isValidRet"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r4)
                r3 = 4
                if (r7 != r3) goto L_0x00b7
                r13 = 207(0xcf, float:2.9E-43)
                if (r15 != r13) goto L_0x00b7
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r4)
                goto L_0x00e7
            L_0x00b7:
                if (r7 != r3) goto L_0x00c1
                r13 = 203(0xcb, float:2.84E-43)
                if (r15 != r13) goto L_0x00c1
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r4)
                goto L_0x00e7
            L_0x00c1:
                r13 = 2001(0x7d1, float:2.804E-42)
                if (r7 != r3) goto L_0x00d3
                if (r15 == r13) goto L_0x00cf
                r9 = 2004(0x7d4, float:2.808E-42)
                if (r15 == r9) goto L_0x00cf
                r9 = 2005(0x7d5, float:2.81E-42)
                if (r15 != r9) goto L_0x00d3
            L_0x00cf:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r4)
                goto L_0x00e7
            L_0x00d3:
                if (r7 != r3) goto L_0x00df
                if (r15 == r13) goto L_0x00db
                r9 = 2003(0x7d3, float:2.807E-42)
                if (r15 != r9) goto L_0x00df
            L_0x00db:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r4)
                goto L_0x00e7
            L_0x00df:
                if (r7 != 0) goto L_0x00e9
                if (r15 == 0) goto L_0x00e4
                goto L_0x00e9
            L_0x00e4:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r4)
            L_0x00e7:
                r9 = 1
                goto L_0x00ed
            L_0x00e9:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r4)
                r9 = 0
            L_0x00ed:
                if (r9 != 0) goto L_0x014d
                java.util.Iterator r18 = r11.iterator()
            L_0x00f3:
                boolean r8 = r18.hasNext()
                if (r8 == 0) goto L_0x0149
                java.lang.Object r8 = r18.next()
                jr2.q$a r8 = (jr2.C76440q.C76441a) r8
                java.util.Map<jr2.q$a, java.lang.String> r9 = r6.f21143n
                java.util.HashMap r9 = (java.util.HashMap) r9
                boolean r9 = r9.containsKey(r8)
                if (r9 != 0) goto L_0x010a
                goto L_0x00f3
            L_0x010a:
                java.util.Map<jr2.q$a, java.lang.String> r9 = r6.f21143n
                java.util.HashMap r9 = (java.util.HashMap) r9
                java.lang.Object r9 = r9.get(r8)
                java.lang.String r9 = (java.lang.String) r9
                java.lang.String r10 = r2.getUserName()
                boolean r9 = r10.equals(r9)
                if (r9 != 0) goto L_0x011f
                goto L_0x00f3
            L_0x011f:
                boolean r9 = r2.mo131173n0()
                if (r9 == 0) goto L_0x0145
                long r9 = com.tencent.p014mm.plugin.sns.model.C94897n1.f274987a
                java.lang.String r9 = vr2.C102236a0.m134763p0(r9)
                long r10 = com.tencent.p014mm.plugin.sns.model.C94897n1.f274988b
                java.lang.String r10 = vr2.C102236a0.m134763p0(r10)
                if (r7 != r3) goto L_0x013b
                boolean r11 = com.tencent.p014mm.storage.C96986x1.m124656a(r31)
                if (r11 == 0) goto L_0x013b
                r11 = 1
                goto L_0x013c
            L_0x013b:
                r11 = 0
            L_0x013c:
                r14 = 0
                r13 = 0
                r12 = r31
                r13 = r2
                r8.mo96529W0(r9, r10, r11, r12, r13, r14)
                goto L_0x00f3
            L_0x0145:
                r8.mo96540j2(r7, r15, r0, r1)
                goto L_0x00f3
            L_0x0149:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r4)
                return
            L_0x014d:
                int r0 = r33.getType()
                r16 = 0
                java.lang.String r9 = "getSameMd5Count"
                if (r0 == r10) goto L_0x01b2
                r10 = 212(0xd4, float:2.97E-43)
                if (r0 == r10) goto L_0x018c
                r8 = 5203(0x1453, float:7.291E-42)
                if (r0 == r8) goto L_0x0167
                r10 = r2
                r13 = r4
                r12 = r5
                r2 = 1
                r9 = 0
                r15 = 4
                goto L_0x0269
            L_0x0167:
                r0 = r1
                com.tencent.mm.plugin.sns.model.t0 r0 = (com.tencent.p014mm.plugin.sns.model.C94948t0) r0
                java.lang.String r1 = r0.getUserName()
                long r12 = r0.mo131166a0()
                java.lang.String r8 = "com.tencent.mm.plugin.sns.model.NetSceneSnsWwUserPage"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r8)
                int r10 = r0.f275236w
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r8)
                int r8 = r0.f275217A
                r0 = r29
                r9 = r2
                r15 = 4
                r2 = r12
                r13 = r4
                r4 = r10
                r12 = r5
                r5 = r8
                r0.mo6422s(r1, r2, r4, r5)
                r10 = r9
                goto L_0x01ae
            L_0x018c:
                r10 = r2
                r13 = r4
                r12 = r5
                r15 = 4
                r0 = r1
                com.tencent.mm.plugin.sns.model.r0 r0 = (com.tencent.p014mm.plugin.sns.model.C94941r0) r0
                java.lang.String r1 = r0.getUserName()
                long r2 = r0.mo131166a0()
                java.lang.String r4 = "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r4)
                int r5 = r0.f275176x
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r4)
                int r8 = r0.f275156B
                r0 = r29
                r4 = r5
                r5 = r8
                r0.mo6422s(r1, r2, r4, r5)
            L_0x01ae:
                r2 = 1
                r9 = 0
                goto L_0x0269
            L_0x01b2:
                r10 = r2
                r13 = r4
                r12 = r5
                r15 = 4
                r0 = r1
                com.tencent.mm.plugin.sns.model.o0 r0 = (com.tencent.p014mm.plugin.sns.model.C94916o0) r0
                boolean r1 = r10.mo131173n0()
                if (r1 == 0) goto L_0x01cd
                java.lang.String r1 = "getMaxLimitID"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r8)
                long r2 = r0.f275059g
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r8)
                r6.mo6420q(r2)
                goto L_0x01dc
            L_0x01cd:
                long r1 = r0.mo131166a0()
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r8)
                int r3 = r0.f275066q
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r8)
                r6.mo6421r(r1, r3)
            L_0x01dc:
                java.lang.String r1 = "getControlFlag"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r8)
                int r0 = r0.f275067r
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r8)
                java.lang.String r1 = "updateTimelineControlFlag"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r13)
                int r2 = f21135r
                if (r2 == r0) goto L_0x0254
                android.os.Vibrator r2 = vr2.C102236a0.f301037a
                java.lang.String r2 = "putSnsFlag"
                java.lang.String r3 = "com.tencent.mm.plugin.sns.data.SnsUtil"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
                android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getDefaultPreferencePath()
                r9 = 0
                android.content.SharedPreferences r4 = r4.getSharedPreferences(r5, r9)
                android.content.SharedPreferences$Editor r4 = r4.edit()
                java.lang.String r5 = "sns_control_flag"
                android.content.SharedPreferences$Editor r4 = r4.putInt(r5, r0)
                r4.commit()
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
                int r2 = f21135r
                java.lang.String r3 = "checkTimelineControlFlag"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r13)
                r2 = r2 & r15
                if (r2 <= 0) goto L_0x0224
                r2 = 1
                goto L_0x0225
            L_0x0224:
                r2 = 0
            L_0x0225:
                r4 = r0 & 4
                if (r4 <= 0) goto L_0x022b
                r4 = 1
                goto L_0x022c
            L_0x022b:
                r4 = 0
            L_0x022c:
                if (r4 == 0) goto L_0x0232
                zr2.C66976a.m79135g()
                goto L_0x0250
            L_0x0232:
                if (r2 == 0) goto L_0x0250
                zr2.a r2 = zr2.C66976a.f192427a
                java.lang.String r2 = "startInner"
                java.lang.String r4 = "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r4)
                zr2.e r24 = zr2.C66984e.f192447d
                r23 = 0
                r27 = 2
                r28 = 0
                r25 = 0
                java.lang.String r22 = "SnsKeywordMatcher_Thread"
                o40.C61926c.m72663H(r22, r23, r24, r25, r27, r28)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r4)
            L_0x0250:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r13)
                goto L_0x0255
            L_0x0254:
                r9 = 0
            L_0x0255:
                r2 = 1
                java.lang.Object[] r3 = new java.lang.Object[r2]
                java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
                r3[r9] = r4
                java.lang.String r4 = "updateTimelineControlFlag %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r4, r3)
                f21135r = r0
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r13)
            L_0x0269:
                java.util.Iterator r0 = r11.iterator()
            L_0x026d:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x0368
                java.lang.Object r1 = r0.next()
                r8 = r1
                jr2.q$a r8 = (jr2.C76440q.C76441a) r8
                java.util.Map<jr2.q$a, java.lang.String> r1 = r6.f21143n
                java.util.HashMap r1 = (java.util.HashMap) r1
                boolean r1 = r1.containsKey(r8)
                if (r1 != 0) goto L_0x0285
                goto L_0x026d
            L_0x0285:
                java.util.Map<jr2.q$a, java.lang.String> r1 = r6.f21143n
                java.util.HashMap r1 = (java.util.HashMap) r1
                java.lang.Object r1 = r1.get(r8)
                java.lang.String r1 = (java.lang.String) r1
                java.lang.String r3 = r10.getUserName()
                boolean r3 = r3.equals(r1)
                if (r3 != 0) goto L_0x029a
                goto L_0x026d
            L_0x029a:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "notify ui "
                r3.append(r4)
                r3.append(r1)
                java.lang.String r1 = r3.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r14, r1)
                long r3 = r10.mo131166a0()
                int r1 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
                if (r1 != 0) goto L_0x02ba
                java.lang.String r1 = ""
                goto L_0x02c2
            L_0x02ba:
                long r3 = r10.mo131166a0()
                java.lang.String r1 = vr2.C102236a0.m134763p0(r3)
            L_0x02c2:
                boolean r3 = r10.mo131165Z0()
                if (r3 == 0) goto L_0x02e4
                if (r7 != r15) goto L_0x02d4
                boolean r3 = com.tencent.p014mm.storage.C96986x1.m124656a(r31)
                if (r3 == 0) goto L_0x02d4
                r4 = r31
                r3 = 1
                goto L_0x02d7
            L_0x02d4:
                r4 = r31
                r3 = 0
            L_0x02d7:
                r5 = 4
                r8.mo96527B0(r1, r3, r4, r10)
                r3 = r10
                r2 = r12
                r15 = r13
                r18 = r14
                r19 = 0
                goto L_0x035e
            L_0x02e4:
                r4 = r31
                r5 = 4
                boolean r3 = r10.mo131173n0()
                if (r3 == 0) goto L_0x0349
                int r1 = r10.mo131164M0()
                if (r1 != 0) goto L_0x02f9
                long r20 = com.tencent.p014mm.plugin.sns.model.C94897n1.f274987a
                com.tencent.p014mm.plugin.sns.model.C94897n1.f274989c = r20
                r1 = 1
                goto L_0x02fa
            L_0x02f9:
                r1 = 0
            L_0x02fa:
                r3 = 3
                java.lang.Object[] r3 = new java.lang.Object[r3]
                int r11 = r10.mo131164M0()
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
                r3[r9] = r11
                com.tencent.mm.plugin.sns.model.d2 r11 = r6.f21146q
                boolean r11 = r11.f274813a
                java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
                r3[r2] = r11
                java.lang.Boolean r11 = java.lang.Boolean.valueOf(r1)
                r15 = 2
                r3[r15] = r11
                java.lang.String r11 = "fetchType:%s, preUpReady:%s, firstPage:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r11, r3)
                long r18 = com.tencent.p014mm.plugin.sns.model.C94897n1.f274987a
                java.lang.String r3 = vr2.C102236a0.m134763p0(r18)
                long r18 = com.tencent.p014mm.plugin.sns.model.C94897n1.f274988b
                java.lang.String r11 = vr2.C102236a0.m134763p0(r18)
                if (r7 != r5) goto L_0x0334
                boolean r18 = com.tencent.p014mm.storage.C96986x1.m124656a(r31)
                if (r18 == 0) goto L_0x0334
                r18 = 1
                goto L_0x0336
            L_0x0334:
                r18 = 0
            L_0x0336:
                r19 = 0
                r9 = r3
                r3 = r10
                r10 = r11
                r11 = r18
                r2 = r12
                r12 = r31
                r15 = r13
                r13 = r3
                r18 = r14
                r14 = r1
                r8.mo96529W0(r9, r10, r11, r12, r13, r14)
                goto L_0x035e
            L_0x0349:
                r3 = r10
                r2 = r12
                r15 = r13
                r18 = r14
                r19 = 0
                if (r7 != r5) goto L_0x035a
                boolean r9 = com.tencent.p014mm.storage.C96986x1.m124656a(r31)
                if (r9 == 0) goto L_0x035a
                r12 = 1
                goto L_0x035b
            L_0x035a:
                r12 = 0
            L_0x035b:
                r8.mo96528R6(r1, r12, r4, r3)
            L_0x035e:
                r12 = r2
                r10 = r3
                r13 = r15
                r14 = r18
                r2 = 1
                r9 = 0
                r15 = 4
                goto L_0x026d
            L_0x0368:
                r2 = r12
                r15 = r13
            L_0x036a:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r15)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.model.C5431p1.C5432a.onSceneEnd(int, int, java.lang.String, ob0.y):void");
        }

        /* renamed from: p */
        public void mo6419p(String str, ArrayList<C101829pp1> arrayList) {
            SnsMethodCalculate.markStartTimeMs("setGalleryItem", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
            ((HashMap) this.f21145p).put(str, arrayList);
            SnsMethodCalculate.markEndTimeMs("setGalleryItem", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        }

        /* renamed from: q */
        public void mo6420q(long j) {
            SnsMethodCalculate.markStartTimeMs("setTimeFirstId", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
            Log.m105919d("MicroMsg.SnsService", "setTimeFirstId %d", Long.valueOf(j));
            if (j == 0) {
                SnsMethodCalculate.markEndTimeMs("setTimeFirstId", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                return;
            }
            this.f21142j = j;
            SnsMethodCalculate.markEndTimeMs("setTimeFirstId", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        }

        /* renamed from: r */
        public void mo6421r(long j, int i) {
            SnsMethodCalculate.markStartTimeMs("setTimeLastId", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
            Log.m105919d("MicroMsg.SnsService", "setTimeLastId %d", Long.valueOf(j));
            if (i > 0) {
                this.f21140h = i;
                Vibrator vibrator = C102236a0.f301037a;
                SnsMethodCalculate.markStartTimeMs("putSnsResponeCount", "com.tencent.mm.plugin.sns.data.SnsUtil");
                MMApplicationContext.getContext().getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0).edit().putInt("sns_respone_count", i).commit();
                SnsMethodCalculate.markEndTimeMs("putSnsResponeCount", "com.tencent.mm.plugin.sns.data.SnsUtil");
            }
            if (j == 0) {
                SnsMethodCalculate.markEndTimeMs("setTimeLastId", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                return;
            }
            this.f21141i = j;
            SnsMethodCalculate.markEndTimeMs("setTimeLastId", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        }

        /* renamed from: s */
        public void mo6422s(String str, long j, int i, int i2) {
            String str2;
            String str3;
            SnsMethodCalculate.markStartTimeMs("setUserLastId", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
            if (i2 == 10) {
                if (i > 0) {
                    synchronized (this.f21139g) {
                        try {
                            ((HashMap) this.f21139g).put(str, Integer.valueOf(i));
                        } catch (Throwable th) {
                            SnsMethodCalculate.markEndTimeMs("setUserLastId", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                            throw th;
                        }
                    }
                }
                if (j == 0) {
                    SnsMethodCalculate.markEndTimeMs("setUserLastId", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                    return;
                }
                synchronized (this.f21138f) {
                    try {
                        ((HashMap) this.f21138f).put(str, Long.valueOf(j));
                    } finally {
                        str2 = "setUserLastId";
                        str3 = "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer";
                        SnsMethodCalculate.markEndTimeMs(str2, str3);
                    }
                }
            } else {
                if (i > 0) {
                    synchronized (this.f21137e) {
                        try {
                            ((HashMap) this.f21137e).put(str, Integer.valueOf(i));
                        } catch (Throwable th4) {
                            SnsMethodCalculate.markEndTimeMs("setUserLastId", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                            throw th4;
                        }
                    }
                }
                if (j == 0) {
                    SnsMethodCalculate.markEndTimeMs("setUserLastId", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                    return;
                }
                synchronized (this.f21136d) {
                    try {
                        ((HashMap) this.f21136d).put(str, Long.valueOf(j));
                    } catch (Throwable th5) {
                        while (true) {
                            SnsMethodCalculate.markEndTimeMs("setUserLastId", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                            throw th5;
                        }
                    }
                }
            }
        }

        /* renamed from: t */
        public void mo6423t(int i, String str, C76440q.C76441a aVar) {
            String str2;
            String str3;
            String str4;
            String str5;
            SnsMethodCalculate.markStartTimeMs("startServer", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
            Log.m105924i("MicroMsg.SnsService", "startServer " + i + " " + aVar);
            boolean n5 = C72996z1.m85843n5(str);
            C94843b1 Rx0 = C94866e1.Rx0();
            String s = C75592q0.m90789s();
            Rx0.getClass();
            SnsMethodCalculate.markStartTimeMs("setSelfName", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
            Rx0.f274776c = s;
            SnsMethodCalculate.markEndTimeMs("setSelfName", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
            C94866e1.Rx0().mo130950e();
            C94866e1.gy0().mo131192c();
            if (((HashMap) this.f21143n).isEmpty()) {
                if (!n5) {
                    C86709a0.m107528h();
                    C86709a0.m107529k().f251779b.mo123455a(211, this);
                    C86709a0.m107528h();
                    C86709a0.m107529k().f251779b.mo123455a(212, this);
                } else {
                    C86709a0.m107528h();
                    C86709a0.m107529k().f251779b.mo123455a(5203, this);
                }
            }
            if (!((HashMap) this.f21143n).containsKey(aVar)) {
                if (i == 1) {
                    ((HashMap) this.f21143n).put(aVar, "@__weixintimtline");
                } else if (i == 2 || i == 3 || i == 10) {
                    LinkedList linkedList = new LinkedList();
                    for (C76440q.C76441a aVar2 : ((HashMap) this.f21143n).keySet()) {
                        if (str.equals((String) ((HashMap) this.f21143n).get(aVar2))) {
                            linkedList.add(aVar2);
                        }
                    }
                    Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        ((HashMap) this.f21143n).remove((C76440q.C76441a) it.next());
                    }
                    ((HashMap) this.f21143n).put(aVar, str);
                } else if (i == 4) {
                    ((HashMap) this.f21143n).put(aVar, "@__classify_timeline");
                } else if (i == 5) {
                    ((HashMap) this.f21143n).put(aVar, "");
                } else {
                    ((HashMap) this.f21143n).put(aVar, "");
                }
            }
            if (i == 1) {
                this.f21141i = 0;
                this.f21140h = mo6417h();
                C94916o0.m120462n1("@__weixintimtline");
            } else if (i == 2) {
                synchronized (this.f21136d) {
                    try {
                        ((HashMap) this.f21136d).put(str, 0L);
                    } finally {
                        while (true) {
                            str2 = "startServer";
                            str3 = "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer";
                            SnsMethodCalculate.markEndTimeMs(str2, str3);
                        }
                    }
                }
                synchronized (this.f21137e) {
                    try {
                        if (!((HashMap) this.f21137e).containsKey(str)) {
                            ((HashMap) this.f21137e).put(str, Integer.valueOf(mo6417h()));
                        }
                    } catch (Throwable th) {
                        while (true) {
                            throw th;
                        }
                    }
                }
                if (!n5) {
                    C94941r0.m120521n1(str);
                } else {
                    C94948t0.m120585o1(str);
                }
                this.f21144o.add(str);
            } else if (i == 10) {
                synchronized (this.f21138f) {
                    try {
                        ((HashMap) this.f21138f).put(str, 0L);
                    } finally {
                        while (true) {
                            str4 = "startServer";
                            str5 = "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer";
                            SnsMethodCalculate.markEndTimeMs(str4, str5);
                        }
                    }
                }
                synchronized (this.f21139g) {
                    try {
                        if (!((HashMap) this.f21139g).containsKey(str)) {
                            ((HashMap) this.f21139g).put(str, Integer.valueOf(mo6417h()));
                        }
                    } catch (Throwable th4) {
                        while (true) {
                            throw th4;
                        }
                    }
                }
                if (!n5) {
                    C94941r0.m120521n1(str);
                } else {
                    C94948t0.m120585o1(str);
                }
                this.f21144o.add(str);
            }
            SnsMethodCalculate.markEndTimeMs("startServer", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        }
    }
}
