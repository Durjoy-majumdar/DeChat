package com.tencent.p014mm.plugin.sns.model;

import ad0.C54020j;
import ad0.C91999u;
import android.content.Context;
import androidx.lifecycle.C0123n0;
import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C54209k0;
import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.p014mm.autogen.mmdata.rpt.SnsUploadReportStruct;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.statistics.C95003w;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.SnsObject;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.observer.StorageEventId;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import f40.C86709a0;
import hi2.C98464o;
import i40.C60247c;
import iu2.C60631e;
import iu2.C98802d;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;
import ms2.C47100l;
import os2.C100406i0;
import os2.C100417r0;
import p206nj.C76861g;
import p640ox.C77049b;
import p823sg.C90193h;
import te3.C101779g1;
import te3.C101783gu2;
import te3.C101799k1;
import te3.C101802kr2;
import te3.C101804kv2;
import te3.C101808lv2;
import te3.C101817mv2;
import te3.C101821nv2;
import te3.C101833r5;
import te3.C51018qv3;
import te3.C51163rv3;
import te3.C64241ar2;
import te3.C64252b5;
import te3.C64486k83;
import te3.C64721t5;
import te3.c84;
import te3.f94;
import te3.i74;
import te3.sc4;
import te3.w25;
import te3.w64;
import vr2.C102270y;

/* renamed from: com.tencent.mm.plugin.sns.model.s2 */
public class C94945s2 {

    /* renamed from: q */
    public static final Pattern f275193q = Pattern.compile("(\n){3,}");

    /* renamed from: a */
    public List<C102270y> f275194a;

    /* renamed from: b */
    public int f275195b;

    /* renamed from: c */
    public int f275196c;

    /* renamed from: d */
    public LinkedList<f94> f275197d;

    /* renamed from: e */
    public LinkedList<Long> f275198e;

    /* renamed from: f */
    public TimeLineObject f275199f = C91999u.m115563i();

    /* renamed from: g */
    public C101808lv2 f275200g = new C101808lv2();

    /* renamed from: h */
    public SnsInfo f275201h = new SnsInfo();

    /* renamed from: i */
    public SnsObject f275202i = null;

    /* renamed from: j */
    public C101799k1 f275203j;

    /* renamed from: k */
    public C101783gu2 f275204k;

    /* renamed from: l */
    public w25 f275205l;

    /* renamed from: m */
    public String f275206m;

    /* renamed from: n */
    public int f275207n;

    /* renamed from: o */
    public String f275208o;

    /* renamed from: p */
    public WeakReference<Context> f275209p;

    public C94945s2(int i, Context context) {
        SnsMethodCalculate.markStartTimeMs("createAction", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        C101799k1 k1Var = new C101799k1();
        k1Var.f298580j = new C101779g1();
        k1Var.f298582o = new C64252b5();
        k1Var.f298583p = new C64721t5();
        SnsMethodCalculate.markEndTimeMs("createAction", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        this.f275203j = k1Var;
        new sc4();
        this.f275204k = new C101783gu2();
        this.f275205l = null;
        this.f275206m = "";
        this.f275207n = 1;
        this.f275208o = "";
        this.f275206m = C94866e1.Mx0();
        this.f275195b = i;
        this.f275199f.ContentObj.f298424e = i;
        if (context != null) {
            this.f275209p = new WeakReference<>(context);
        }
        Log.m105918d("MicroMsg.UploadPackHelper", "contentType " + i);
        TimeLineObject timeLineObject = this.f275199f;
        timeLineObject.Privated = 0;
        timeLineObject.UserName = this.f275206m;
        C101808lv2 lv22 = this.f275200g;
        lv22.f298746g = C90193h.m112878f((C94866e1.Mx0() + "" + Util.currentTicks() + System.currentTimeMillis()).getBytes());
        C101808lv2 lv23 = this.f275200g;
        lv23.f298743d = 0;
        lv23.f298744e = 0;
        lv23.f298745f = 0;
        lv23.f298749j = 0;
        lv23.f298750n = 0;
        lv23.f298752p = 0;
        lv23.f298754r = 0;
        SnsMethodCalculate.markStartTimeMs("initSnsObj", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        SnsObject snsObject = new SnsObject();
        snsObject.f283891Id = 0;
        snsObject.CreateTime = 0;
        snsObject.LikeFlag = 0;
        snsObject.Username = C94866e1.Mx0();
        snsObject.LikeUserList = new LinkedList<>();
        snsObject.LikeCount = 0;
        snsObject.LikeUserListCount = 0;
        snsObject.WithUserList = new LinkedList<>();
        snsObject.WithUserCount = 0;
        snsObject.WithUserListCount = 0;
        snsObject.CommentUserList = new LinkedList<>();
        snsObject.CommentCount = 0;
        snsObject.CommentUserListCount = 0;
        snsObject.ExtFlag = 1;
        snsObject.LikeFlag = 0;
        snsObject.NoChange = 0;
        C51018qv3 qv32 = new C51018qv3();
        qv32.mo73350k(new byte[0]);
        snsObject.ObjectDesc = qv32;
        SnsMethodCalculate.markEndTimeMs("initSnsObj", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        this.f275202i = snsObject;
        this.f275201h.setPostWaiting();
        this.f275201h.setCreateTime((int) (System.currentTimeMillis() / 1000));
        this.f275201h.setTypeFlag(i);
        this.f275201h.setUserName(this.f275206m);
        this.f275201h.setPravited(0);
        this.f275201h.setStringSeq("0000099999999999999999999");
        this.f275201h.addSourceFlag(2);
        this.f275201h.setExtFlag();
        if (i == 1 || i == 2) {
            this.f275201h.addSourceFlag(4);
        }
        if (i == 7) {
            this.f275201h.removeSourceFlag(2);
        }
        LinkedList<Long> linkedList = new LinkedList<>();
        this.f275198e = linkedList;
        this.f275200g.f298753q = linkedList;
        Iterator<Long> it = linkedList.iterator();
        while (it.hasNext()) {
            long longValue = it.next().longValue();
            i74 i74 = new i74();
            i74.f135157d = longValue;
            this.f275202i.GroupList.add(i74);
        }
        this.f275202i.GroupCount = this.f275198e.size();
    }

    /* renamed from: A */
    public void mo131227A(int i) {
        SnsMethodCalculate.markStartTimeMs("setPostFrom", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        Log.m105918d("MicroMsg.UploadPackHelper", "set post form " + i);
        this.f275200g.f298752p = i;
        SnsMethodCalculate.markEndTimeMs("setPostFrom", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
    }

    /* renamed from: B */
    public C94945s2 mo131228B(int i) {
        SnsMethodCalculate.markStartTimeMs("setPrivated", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        this.f275196c = i;
        this.f275200g.f298745f = i;
        this.f275199f.Privated = i;
        if (i > 0) {
            this.f275201h.setPravited(i);
            this.f275201h.setLocalPrivate();
            this.f275201h.removeSourceFlag(2);
            this.f275201h.unSetExtFlag();
        }
        SnsMethodCalculate.markEndTimeMs("setPrivated", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        return this;
    }

    /* renamed from: C */
    public void mo131229C(String str) {
        SnsMethodCalculate.markStartTimeMs("setPublisherId", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        this.f275200g.f298761y = str;
        SnsMethodCalculate.markEndTimeMs("setPublisherId", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
    }

    /* renamed from: D */
    public C94945s2 mo131230D(String str) {
        SnsMethodCalculate.markStartTimeMs("setSdkAppName", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        C101833r5 r5Var = this.f275199f.AppInfo;
        if (r5Var == null) {
            r5Var = new C101833r5();
        }
        r5Var.f299238f = str;
        this.f275199f.AppInfo = r5Var;
        SnsMethodCalculate.markEndTimeMs("setSdkAppName", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        return this;
    }

    /* renamed from: E */
    public C94945s2 mo131231E(String str) {
        SnsMethodCalculate.markStartTimeMs("setSdkId", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        C101833r5 r5Var = this.f275199f.AppInfo;
        if (r5Var == null) {
            r5Var = new C101833r5();
        }
        r5Var.f299236d = str;
        this.f275199f.AppInfo = r5Var;
        SnsMethodCalculate.markEndTimeMs("setSdkId", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        return this;
    }

    /* renamed from: F */
    public void mo131232F(String str) {
        SnsMethodCalculate.markStartTimeMs("setSessionId", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        this.f275200g.f298727A = str;
        SnsMethodCalculate.markEndTimeMs("setSessionId", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
    }

    /* renamed from: G */
    public void mo131233G(C54020j jVar) {
        SnsMethodCalculate.markStartTimeMs("setShareFinderLive", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        if (jVar != null) {
            this.f275199f.ContentObj.f298435s = jVar.mo74686c();
        }
        SnsMethodCalculate.markEndTimeMs("setShareFinderLive", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
    }

    /* renamed from: H */
    public C94945s2 mo131234H(int i) {
        SnsMethodCalculate.markStartTimeMs("setShareSources", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        this.f275200g.f298754r = i;
        SnsMethodCalculate.markEndTimeMs("setShareSources", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        return this;
    }

    /* renamed from: I */
    public void mo131235I(String str, String str2, String str3, int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("setSnsPostOperation", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        c84 c84 = new c84();
        c84.f298001d = str;
        c84.f298002e = str2;
        c84.f298003f = str3;
        c84.f298004g = i;
        c84.f298005h = i2;
        this.f275200g.f298760x = c84;
        SnsMethodCalculate.markEndTimeMs("setSnsPostOperation", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
    }

    /* renamed from: J */
    public C94945s2 mo131236J(String str) {
        SnsMethodCalculate.markStartTimeMs("setSourceNickName", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        this.f275199f.sourceNickName = Util.nullAsNil(str);
        SnsMethodCalculate.markEndTimeMs("setSourceNickName", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        return this;
    }

    /* renamed from: K */
    public C94945s2 mo131237K(String str) {
        SnsMethodCalculate.markStartTimeMs("setSourceUserName", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        this.f275199f.sourceUserName = Util.nullAsNil(str);
        SnsMethodCalculate.markEndTimeMs("setSourceUserName", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        return this;
    }

    /* renamed from: L */
    public C94945s2 mo131238L(String str) {
        SnsMethodCalculate.markStartTimeMs("setStaticData", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        this.f275199f.statisticsData = str;
        this.f275203j.f298580j.f298272e = str;
        SnsMethodCalculate.markEndTimeMs("setStaticData", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        return this;
    }

    /* renamed from: M */
    public C94945s2 mo131239M(int i) {
        SnsMethodCalculate.markStartTimeMs("setSyncFlag", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        this.f275200g.f298744e = i;
        SnsMethodCalculate.markEndTimeMs("setSyncFlag", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        return this;
    }

    /* renamed from: N */
    public C94945s2 mo131240N(String str, String str2, String str3) {
        SnsMethodCalculate.markStartTimeMs("setThirdAppMsg", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        C101779g1 g1Var = this.f275203j.f298580j;
        if (Util.isNullOrNil(str)) {
            str = "";
        }
        g1Var.f298271d = str;
        C101779g1 g1Var2 = this.f275203j.f298580j;
        if (Util.isNullOrNil(str2)) {
            str2 = "";
        }
        g1Var2.f298273f = str2;
        C101779g1 g1Var3 = this.f275203j.f298580j;
        if (Util.isNullOrNil(str3)) {
            str3 = "";
        }
        g1Var3.f298274g = str3;
        SnsMethodCalculate.markEndTimeMs("setThirdAppMsg", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        return this;
    }

    /* renamed from: O */
    public C94945s2 mo131241O(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("setTwitterInfo", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        C101808lv2 lv22 = this.f275200g;
        lv22.f298756t = str;
        lv22.f298757u = str2;
        SnsMethodCalculate.markEndTimeMs("setTwitterInfo", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        return this;
    }

    /* renamed from: P */
    public void mo131242P(List<C102270y> list) {
        int i;
        int i2;
        SnsMethodCalculate.markStartTimeMs("setUploadList", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        Log.m105925i("MicroMsg.UploadPackHelper", "setUploadList: elements size=%d", Integer.valueOf(list.size()));
        this.f275194a = list;
        List<C102270y> nP = C94866e1.ay0().mo139872nP(this.f275194a);
        LinkedList<C64241ar2> linkedList = new LinkedList<>();
        if (nP == null) {
            Log.m105920e("MicroMsg.UploadPackHelper", "setUploadList: elements list null");
            SnsMethodCalculate.markEndTimeMs("setUploadList", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
            return;
        }
        for (C102270y next : nP) {
            C64241ar2 ar22 = new C64241ar2();
            ar22.f182140d = next.f301219f;
            linkedList.add(ar22);
            C94942r1.f275179a.mo131222a(String.valueOf(ar22.f182140d), next.f301228o);
        }
        this.f275200g.f298747h = linkedList;
        for (C102270y next2 : nP) {
            C101817mv2 mv22 = new C101817mv2();
            mv22.f298876e = 0.0f;
            mv22.f298875d = 0.0f;
            mv22.f298877f = 0.0f;
            int i3 = next2.f301221h;
            if (i3 > 0 && (i = next2.f301220g) > 0 && (i2 = next2.f301222i) > 0) {
                mv22.f298876e = (float) i3;
                mv22.f298875d = (float) i;
                mv22.f298877f = (float) i2;
            }
            this.f275199f.ContentObj.f298427h.add(C91999u.m115561g("Locall_path" + next2.f301219f, next2.f301218e, "", "", 0, 0, this.f275196c, "", mv22));
        }
        Log.m105925i("MicroMsg.UploadPackHelper", "setUploadList: MediaObjList size=%d, postinfo LocalMediaId size=%d", Integer.valueOf(this.f275199f.ContentObj.f298427h.size()), Integer.valueOf(this.f275200g.f298747h.size()));
        SnsMethodCalculate.markEndTimeMs("setUploadList", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
    }

    /* renamed from: Q */
    public C94945s2 mo131243Q(LinkedList<f94> linkedList) {
        SnsMethodCalculate.markStartTimeMs("setWithList", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        this.f275197d = linkedList;
        this.f275200g.f298748i = linkedList;
        Iterator<f94> it = linkedList.iterator();
        while (it.hasNext()) {
            w64 w64 = new w64();
            w64.f299703d = it.next().f298255d;
            this.f275202i.WithUserList.add(w64);
            if (C94847c1.m120213a()) {
                C51163rv3 rv32 = new C51163rv3();
                rv32.mo73357f(w64.f299703d);
                this.f275202i.WithTaList.add(rv32);
                this.f275202i.NewWithTaList.add(w64);
            }
        }
        if (C94847c1.m120213a() && this.f275202i.NewWithTaListCount != this.f275197d.size()) {
            this.f275202i.NewWithTaListCount = this.f275197d.size();
        }
        this.f275202i.WithUserCount = this.f275197d.size();
        this.f275202i.WithUserListCount = this.f275197d.size();
        SnsMethodCalculate.markEndTimeMs("setWithList", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        return this;
    }

    /* renamed from: a */
    public boolean mo131244a(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("addImageMediaObjByPath", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        String str3 = C94866e1.m120263iU() + C90193h.m112878f(str.getBytes());
        mo131251h(str3);
        C86013q1.m106442c(str, str3);
        C101804kv2 m = mo131256m("", 2, str3);
        if (m == null) {
            Log.m105920e("MicroMsg.UploadPackHelper", "share img o.imagePath is null!");
            SnsMethodCalculate.markEndTimeMs("addImageMediaObjByPath", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
            return false;
        }
        m.f298691f = str2;
        if (Util.isNullOrNil(m.f298697o)) {
            m.f298697o = str2;
        }
        this.f275199f.ContentObj.f298427h.add(m);
        C64241ar2 ar22 = new C64241ar2();
        ar22.f182140d = m.f298701s;
        this.f275200g.f298747h.add(ar22);
        SnsMethodCalculate.markEndTimeMs("addImageMediaObjByPath", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        return true;
    }

    @Deprecated
    /* renamed from: b */
    public boolean mo131245b(String str, String str2, String str3, int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("addImageMediaObjByUrl", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        SnsMethodCalculate.markStartTimeMs("addImageMediaObjByUrl", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        C101804kv2 n = mo131257n("", 2, str, str);
        n.f298691f = str2;
        if (i > 0 && i2 > 0) {
            C101817mv2 mv22 = new C101817mv2();
            mv22.f298876e = (float) i2;
            mv22.f298875d = (float) i;
            n.f298698p = mv22;
        }
        if (!Util.isNullOrNil(str3)) {
            n.f298697o = str3;
        }
        if (!Util.isNullOrNil(str2)) {
            n.f298691f = str2;
        }
        this.f275199f.ContentObj.f298427h.add(n);
        SnsMethodCalculate.markEndTimeMs("addImageMediaObjByUrl", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        SnsMethodCalculate.markEndTimeMs("addImageMediaObjByUrl", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        return true;
    }

    @Deprecated
    /* renamed from: c */
    public boolean mo131246c(String str, String str2, String str3, int i, String str4) {
        SnsMethodCalculate.markStartTimeMs("addImageMediaObjByUrl", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        C101804kv2 n = mo131257n("", 2, str, str2);
        n.f298691f = str3;
        if (i > 0) {
            n.f298704v = i;
        }
        if (!Util.isNullOrNil(str4)) {
            n.f298703u = str4;
        }
        this.f275199f.ContentObj.f298427h.add(n);
        SnsMethodCalculate.markEndTimeMs("addImageMediaObjByUrl", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        return true;
    }

    /* renamed from: d */
    public boolean mo131247d(byte[] bArr, String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("addImageMediaObjByUrl", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        boolean e = mo131248e(bArr, str, str2, -1, "");
        SnsMethodCalculate.markEndTimeMs("addImageMediaObjByUrl", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        return e;
    }

    /* renamed from: e */
    public boolean mo131248e(byte[] bArr, String str, String str2, int i, String str3) {
        SnsMethodCalculate.markStartTimeMs("addImageMediaObjByUrl", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        C101804kv2 l = mo131255l("", 2, bArr);
        if (l == null) {
            Log.m105920e("MicroMsg.UploadPackHelper", "share img o.data is null!");
            SnsMethodCalculate.markEndTimeMs("addImageMediaObjByUrl", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
            return false;
        }
        l.f298691f = str;
        if (i > 0) {
            l.f298704v = i;
        }
        if (!Util.isNullOrNil(str3)) {
            l.f298703u = str3;
        }
        if (!Util.isNullOrNil(str2)) {
            l.f298697o = str2;
        }
        if (!Util.isNullOrNil(str)) {
            l.f298691f = str;
        }
        this.f275199f.ContentObj.f298427h.add(l);
        C64241ar2 ar22 = new C64241ar2();
        ar22.f182140d = l.f298701s;
        this.f275200g.f298747h.add(ar22);
        SnsMethodCalculate.markEndTimeMs("addImageMediaObjByUrl", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        return true;
    }

    /* renamed from: f */
    public boolean mo131249f(byte[] bArr, String str, String str2, String str3, int i, String str4, String str5, String str6, String str7, String str8) {
        SnsMethodCalculate.markStartTimeMs("addMVMediaObj", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        C101804kv2 l = mo131255l("", 2, bArr);
        if (l == null || (Util.isNullOrNil(str2) && Util.isNullOrNil(str3))) {
            Log.m105920e("MicroMsg.UploadPackHelper", "share music/video  appmsg.thumbData is null!");
            SnsMethodCalculate.markEndTimeMs("addMVMediaObj", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
            return false;
        }
        if (!Util.isNullOrNil(str)) {
            this.f275199f.ContentObj.f298426g = str;
        }
        if (!Util.isNullOrNil(str3)) {
            l.f298692g = str3;
            l.f298693h = 0;
        } else if (!Util.isNullOrNil(str2)) {
            l.f298692g = str2;
            l.f298693h = 0;
        }
        if (!Util.isNullOrNil(str2)) {
            l.f298699q = str2;
            l.f298700r = 0;
        }
        l.f298690e = i;
        l.f298697o = Util.nullAs(str4, "");
        l.f298691f = Util.nullAs(str5, "");
        l.f298682P = str6;
        l.f298683Q = str7;
        this.f275199f.ContentObj.f298427h.add(l);
        C64241ar2 ar22 = new C64241ar2();
        ar22.f182140d = l.f298701s;
        this.f275200g.f298747h.add(ar22);
        SnsMethodCalculate.markEndTimeMs("addMVMediaObj", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        return true;
    }

    /* renamed from: g */
    public boolean mo131250g(String str, String str2, String str3, String str4) {
        float f;
        String str5 = str;
        String str6 = str3;
        SnsMethodCalculate.markStartTimeMs("addSightObjectByPath", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        C98464o.C98465a a = C98464o.f288797a.mo137832a(str5);
        if (a != null) {
            Log.m105924i("MicroMsg.UploadPackHelper", "addSightObjectByPath commit video_info:" + a);
            f = ((float) a.f288800c) / 1000.0f;
        } else {
            f = 0.0f;
        }
        String str7 = C94866e1.m120263iU() + C90193h.m112878f(str.getBytes());
        mo131251h(str7);
        C86013q1.m106442c(str5, str7);
        String str8 = C94866e1.m120263iU() + C90193h.m112878f(str2.getBytes());
        C86013q1.m106442c(str2, str8);
        SnsMethodCalculate.markStartTimeMs("produceSightByPath", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        C101804kv2 o = mo131258o("", 6, str7, str8, str4, "", "");
        SnsMethodCalculate.markEndTimeMs("produceSightByPath", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        if (o == null) {
            Log.m105920e("MicroMsg.UploadPackHelper", "share img o.imagePath is null!");
            SnsMethodCalculate.markEndTimeMs("addSightObjectByPath", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
            return false;
        }
        o.f298691f = str6;
        if (Util.isNullOrNil(o.f298697o)) {
            o.f298697o = str6;
        }
        o.f298684R = f;
        this.f275199f.ContentObj.f298427h.add(o);
        C64241ar2 ar22 = new C64241ar2();
        ar22.f182140d = o.f298701s;
        this.f275200g.f298747h.add(ar22);
        C94942r1 r1Var = C94942r1.f275179a;
        r1Var.mo131222a(String.valueOf(o.f298701s), r1Var.mo131223b(str5));
        SnsMethodCalculate.markEndTimeMs("addSightObjectByPath", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        return true;
    }

    /* renamed from: h */
    public final void mo131251h(String str) {
        SnsMethodCalculate.markStartTimeMs("checkToCreateDir", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        C86013q1.m106461v(C86013q1.m106458s(str));
        SnsMethodCalculate.markEndTimeMs("checkToCreateDir", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
    }

    /* renamed from: i */
    public int mo131252i() {
        int i;
        C101779g1 g1Var;
        C39622i0 a;
        SnsMethodCalculate.markStartTimeMs("commit", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<C101804kv2> linkedList = this.f275199f.ContentObj.f298427h;
        if (linkedList != null) {
            i = linkedList.size();
            Log.m105919d("MicroMsg.UploadPackHelper", "timelineObj MeidaCount %d ", Integer.valueOf(i));
            for (int i2 = 0; i2 < i; i2++) {
                C101804kv2 kv22 = this.f275199f.ContentObj.f298427h.get(i2);
                if (kv22 != null) {
                    Log.m105919d("MicroMsg.UploadPackHelper", "timelineObj media %d %s", Integer.valueOf(kv22.f298701s), Util.nullAs(kv22.f298692g, ""));
                }
            }
        } else {
            i = 0;
        }
        int Jt0 = C94866e1.Yx0().Jt0(mo131254k());
        if (this.f275195b != 7) {
            Class cls = C60631e.class;
            synchronized (C60247c.f171776h) {
                C86709a0.m107523b().mo121108c();
                if (C60247c.class.isAssignableFrom(cls)) {
                    a = new C54209k0((C0123n0) C86709a0.m107523b().f251755f, (C54209k0.C54210b) new C60247c.C60248a.C60249a()).mo75002a(cls);
                } else {
                    throw new IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                }
            }
            ((C98802d) ((C60631e) a).mo85233d3(C98802d.class)).mo138177g3((long) Jt0, StorageEventId.Companion.getINSERT());
        }
        int i3 = this.f275199f.ContentObj.f298424e;
        C95003w.C95004a aVar = C95003w.f275626a;
        SnsMethodCalculate.markStartTimeMs("addSendQueue", "com.tencent.mm.plugin.sns.statistics.SnsUploadReportManager");
        long currentTimeMillis2 = System.currentTimeMillis();
        C95003w.C95004a aVar2 = C95003w.f275626a;
        SnsUploadReportStruct snsUploadReportStruct = aVar2.f275627a;
        long j = (long) Jt0;
        snsUploadReportStruct.f266189d = j;
        snsUploadReportStruct.f266193h = (long) i;
        snsUploadReportStruct.f266192g = (long) i3;
        aVar2.f275629c = currentTimeMillis2;
        long j2 = currentTimeMillis2 - aVar2.f275628b;
        snsUploadReportStruct.f266201p = j2;
        snsUploadReportStruct.mo86046c("AddSendQueueTimeMs", j2);
        C95003w.C95004a aVar3 = C95003w.f275626a;
        aVar3.f275627a.f266194i = 2;
        C95003w.m120754b(aVar3);
        SnsMethodCalculate.markEndTimeMs("addSendQueue", "com.tencent.mm.plugin.sns.statistics.SnsUploadReportManager");
        int i4 = Jt0;
        C94866e1.Wx0().mo60185Lo(i4);
        String str = null;
        Iterator<C64241ar2> it = this.f275200g.f298747h.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            C64241ar2 next = it.next();
            C100406i0 LL = C94866e1.ay0().mo139867LL((long) next.f182140d);
            try {
                C101821nv2 nv22 = (C101821nv2) new C101821nv2().parseFrom(LL.mo139854h());
                C101833r5 r5Var = this.f275199f.AppInfo;
                if (r5Var != null) {
                    nv22.f298930x = r5Var.f299236d;
                }
                C101799k1 k1Var = this.f275203j;
                if (!(k1Var == null || (g1Var = k1Var.f298580j) == null || Util.isNullOrNil(g1Var.f298271d))) {
                    nv22.f298930x = this.f275203j.f298580j.f298271d;
                }
                C101783gu2 gu22 = this.f275204k;
                if (gu22 != null) {
                    gu22.f298310f = 0;
                }
                nv22.f298911B = gu22;
                int i6 = this.f275199f.ContentObj.f298424e;
                nv22.f298931y = i6;
                if (i6 == 1 || i6 == 15) {
                    if (!Util.isNullOrNil(nv22.f298930x)) {
                        nv22.f298912C = 5;
                    } else {
                        C101783gu2 gu23 = nv22.f298911B;
                        if (gu23 == null || nv22.f298931y != 15) {
                            nv22.f298912C = this.f275194a.get(i5).f301227n ? 1 : 2;
                        } else {
                            nv22.f298912C = gu23.f298309e ? 1 : 2;
                        }
                    }
                }
                LL.mo139858l(nv22.toByteArray());
                C94866e1.ay0().r50(next.f182140d, LL);
                str = nv22.f298929w;
                i5++;
            } catch (Exception unused) {
                Log.m105920e("MicroMsg.UploadPackHelper", "parseFrom MediaUploadInfo error in NetSceneSnsUpload");
            }
        }
        Log.m105925i("MicroMsg.UploadPackHelper", "commit sns info ret %d, typeFlag %d sightMd5 %s", Integer.valueOf(i4), Integer.valueOf(this.f275201h.getTypeFlag()), str);
        if (i4 > 0 && this.f275201h.getTypeFlag() == 15) {
            C94867e2.m120302u(C100417r0.m131421j("sns_table_", j), str);
        }
        Log.m105918d("MicroMsg.UploadPackHelper", "pack commit result " + i4 + " cost " + (System.currentTimeMillis() - currentTimeMillis));
        SnsMethodCalculate.markStartTimeMs("handleCommitRet", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        if (i4 <= 0) {
            SnsMethodCalculate.markEndTimeMs("handleCommitRet", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        } else {
            WeakReference<Context> weakReference = this.f275209p;
            if (weakReference == null || weakReference.get() == null) {
                SnsMethodCalculate.markEndTimeMs("handleCommitRet", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
            } else {
                C47100l lVar = (C47100l) ((C77049b) C86312j.m106911c(C77049b.class)).mo72351Ok(this.f275209p.get(), 2, C47100l.class);
                if (lVar == null) {
                    SnsMethodCalculate.markEndTimeMs("handleCommitRet", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
                } else {
                    lVar.f126571e = i4;
                    SnsMethodCalculate.markEndTimeMs("handleCommitRet", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
                }
            }
        }
        Log.m105919d("MicroMsg.UploadPackHelper", "commit snsObject extflag:%d", Integer.valueOf(this.f275202i.ExtFlag));
        SnsMethodCalculate.markEndTimeMs("commit", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        return i4;
    }

    /* renamed from: j */
    public int mo131253j() {
        SnsMethodCalculate.markStartTimeMs("getContentType", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        int i = this.f275195b;
        SnsMethodCalculate.markEndTimeMs("getContentType", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        return i;
    }

    /* renamed from: k */
    public SnsInfo mo131254k() {
        SnsMethodCalculate.markStartTimeMs("getSnsInfo", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        try {
            this.f275200g.f298751o = System.currentTimeMillis();
            this.f275200g.f298750n = 0;
            C64486k83 k832 = new C64486k83();
            k832.f183896d = this.f275207n;
            k832.f183897e = this.f275208o;
            this.f275200g.f298735I = k832;
            this.f275201h.setAttrBuf(this.f275202i.toByteArray());
            this.f275201h.setPostBuf(this.f275200g.toByteArray());
            Log.m105918d("MicroMsg.UploadPackHelper", "snsObj " + this.f275202i.toString());
            Log.m105918d("MicroMsg.UploadPackHelper", "postinfo " + this.f275200g.toString());
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.UploadPackHelper", e, "", new Object[0]);
        }
        Log.m105918d("MicroMsg.UploadPackHelper", "timelineObj " + this.f275199f.toString());
        C101799k1 k1Var = this.f275203j;
        if (k1Var != null) {
            this.f275199f.actionInfo = k1Var;
        }
        w25 w25 = this.f275205l;
        if (w25 != null) {
            this.f275199f.webSearchInfo = w25;
        }
        this.f275201h.setTimeLine(this.f275199f);
        SnsInfo snsInfo = this.f275201h;
        SnsMethodCalculate.markEndTimeMs("getSnsInfo", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        return snsInfo;
    }

    /* renamed from: l */
    public final C101804kv2 mo131255l(String str, int i, byte[] bArr) {
        SnsMethodCalculate.markStartTimeMs("produceMediaObjByByte", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        if (Util.isNullOrNil(bArr)) {
            Log.m105920e("MicroMsg.UploadPackHelper", C76861g.m92660c() + " attachBuf is null");
            SnsMethodCalculate.markEndTimeMs("produceMediaObjByByte", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(C94866e1.m120263iU());
        sb.append(C90193h.m112878f((" " + System.currentTimeMillis()).getBytes()));
        String sb4 = sb.toString();
        C86013q1.m106461v(C94866e1.m120263iU());
        Log.m105918d("MicroMsg.UploadPackHelper", C76861g.m92660c() + " buildUploadAttachInfo file:" + sb4);
        if (C86013q1.m106438T(sb4, bArr, 0, bArr.length) < 0) {
            Log.m105920e("MicroMsg.UploadPackHelper", C76861g.m92660c() + " writeFile error file:" + sb4);
            SnsMethodCalculate.markEndTimeMs("produceMediaObjByByte", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
            return null;
        }
        C101804kv2 m = mo131256m(str, i, sb4);
        SnsMethodCalculate.markEndTimeMs("produceMediaObjByByte", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        return m;
    }

    /* renamed from: m */
    public final C101804kv2 mo131256m(String str, int i, String str2) {
        SnsMethodCalculate.markStartTimeMs("produceMediaObjByPath", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        C101804kv2 f = C91999u.m115560f();
        f.f298689d = str;
        Log.m105918d("MicroMsg.UploadPackHelper", "mediaOBj type " + i);
        f.f298690e = i;
        C101817mv2 mv22 = null;
        if (C86013q1.m106451l(str2) <= 0) {
            SnsMethodCalculate.markEndTimeMs("produceMediaObjByPath", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(C94866e1.m120263iU());
        sb.append(C90193h.m112878f((str2 + System.currentTimeMillis()).getBytes()));
        String sb4 = sb.toString();
        C86013q1.m106442c(str2, sb4);
        C102270y yVar = new C102270y(sb4, 2);
        LinkedList linkedList = new LinkedList();
        linkedList.add(yVar);
        List<C102270y> nP = C94866e1.ay0().mo139872nP(linkedList);
        if (nP != null) {
            LinkedList linkedList2 = (LinkedList) nP;
            if (linkedList2.size() != 0) {
                C102270y yVar2 = (C102270y) linkedList2.get(0);
                if (yVar2.f301221h > 0 && yVar2.f301220g > 0 && yVar2.f301222i > 0) {
                    mv22 = new C101817mv2();
                    mv22.f298876e = (float) yVar2.f301221h;
                    mv22.f298875d = (float) yVar2.f301220g;
                    mv22.f298877f = (float) yVar2.f301222i;
                }
                f.f298689d = "Locall_path" + yVar2.f301219f;
                f.f298698p = mv22;
                f.f298701s = yVar2.f301219f;
                SnsMethodCalculate.markEndTimeMs("produceMediaObjByPath", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
                return f;
            }
        }
        SnsMethodCalculate.markEndTimeMs("produceMediaObjByPath", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        return null;
    }

    /* renamed from: n */
    public final C101804kv2 mo131257n(String str, int i, String str2, String str3) {
        SnsMethodCalculate.markStartTimeMs("produceMediaObjByUrl", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        C101804kv2 f = C91999u.m115560f();
        f.f298689d = str;
        Log.m105918d("MicroMsg.UploadPackHelper", "mediaOBj type " + i);
        f.f298690e = i;
        f.f298692g = str2;
        f.f298693h = 0;
        f.f298694i = str3;
        f.f298695j = 0;
        f.f298702t = 1;
        SnsMethodCalculate.markEndTimeMs("produceMediaObjByUrl", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        return f;
    }

    /* renamed from: o */
    public final C101804kv2 mo131258o(String str, int i, String str2, String str3, String str4, String str5, String str6) {
        String str7 = str4;
        SnsMethodCalculate.markStartTimeMs("produceSightByPath", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        C101804kv2 f = C91999u.m115560f();
        f.f298689d = str;
        Log.m105925i("MicroMsg.UploadPackHelper", "mediaType %d  videopath %s sightmd5 %s,cdnUrl %s,cdnThumbUrl %s", Integer.valueOf(i), str2, str7, str5, str6);
        f.f298690e = i;
        C101817mv2 mv22 = null;
        if (C86013q1.m106451l(str2) <= 0) {
            SnsMethodCalculate.markEndTimeMs("produceSightByPath", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
            return null;
        }
        C102270y yVar = new C102270y(str2, 6);
        yVar.f301226m = str7;
        C94866e1.ay0().mo139874uP(yVar, str2, str3, str5, str6);
        if (yVar.f301221h > 0 && yVar.f301220g > 0 && yVar.f301222i > 0) {
            mv22 = new C101817mv2();
            mv22.f298876e = (float) yVar.f301221h;
            mv22.f298875d = (float) yVar.f301220g;
            mv22.f298877f = (float) yVar.f301222i;
        }
        f.f298689d = "Locall_path" + yVar.f301219f;
        f.f298698p = mv22;
        f.f298701s = yVar.f301219f;
        SnsMethodCalculate.markEndTimeMs("produceSightByPath", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        return f;
    }

    /* renamed from: p */
    public C94945s2 mo131259p(String str) {
        SnsMethodCalculate.markStartTimeMs("setCanvasInfo", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        this.f275199f.canvasInfo = str;
        SnsMethodCalculate.markEndTimeMs("setCanvasInfo", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        return this;
    }

    /* renamed from: q */
    public C94945s2 mo131260q(String str) {
        SnsMethodCalculate.markStartTimeMs("setContentDes", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        SnsMethodCalculate.markStartTimeMs("filterDesc", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        if (str == null) {
            str = "";
        }
        try {
            str = f275193q.matcher(str.trim().replace(APLogFileUtil.SEPARATOR_LINE, "\n")).replaceAll("\n\n");
            SnsMethodCalculate.markEndTimeMs("filterDesc", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        } catch (Exception unused) {
            Log.m105920e("MicroMsg.UploadPackHelper", "filter desc error ");
            SnsMethodCalculate.markEndTimeMs("filterDesc", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        }
        this.f275199f.ContentDesc = str;
        SnsMethodCalculate.markEndTimeMs("setContentDes", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        return this;
    }

    /* renamed from: r */
    public C94945s2 mo131261r(int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("setContentTypeScene", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        TimeLineObject timeLineObject = this.f275199f;
        timeLineObject.contentDescShowType = i;
        timeLineObject.contentDescScene = i2;
        SnsMethodCalculate.markEndTimeMs("setContentTypeScene", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        return this;
    }

    /* renamed from: s */
    public C94945s2 mo131262s(LinkedList<Long> linkedList) {
        SnsMethodCalculate.markStartTimeMs("setGroupIds", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        SnsMethodCalculate.markEndTimeMs("setGroupIds", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        return this;
    }

    /* renamed from: t */
    public C94945s2 mo131263t(List<String> list) {
        SnsMethodCalculate.markStartTimeMs("setGroupUser", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        if (list == null || list.size() == 0) {
            this.f275202i.ExtFlag = 1;
            SnsMethodCalculate.markEndTimeMs("setGroupUser", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
            return this;
        }
        LinkedList<C51163rv3> linkedList = new LinkedList<>();
        for (String f : list) {
            C51163rv3 rv32 = new C51163rv3();
            rv32.mo73357f(f);
            linkedList.add(rv32);
        }
        this.f275200g.f298759w = linkedList;
        SnsObject snsObject = this.f275202i;
        int i = snsObject.ExtFlag;
        if ((i & 2) > 0) {
            snsObject.BlackList = linkedList;
            snsObject.BlackListCount = linkedList.size();
        } else if ((i & 4) > 0) {
            snsObject.GroupUser = linkedList;
            snsObject.GroupUserCount = linkedList.size();
        }
        SnsMethodCalculate.markEndTimeMs("setGroupUser", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        return this;
    }

    /* renamed from: u */
    public C94945s2 mo131264u(int i) {
        SnsMethodCalculate.markStartTimeMs("setIsBlackGroup", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        if (i == 1) {
            this.f275202i.ExtFlag = 3;
        } else if (i == 0) {
            this.f275202i.ExtFlag = 5;
        }
        this.f275200g.f298758v = i;
        SnsMethodCalculate.markEndTimeMs("setIsBlackGroup", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        return this;
    }

    /* renamed from: v */
    public C94945s2 mo131265v(C101802kr2 kr22) {
        SnsMethodCalculate.markStartTimeMs("setLocation", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        if (kr22 == null) {
            SnsMethodCalculate.markEndTimeMs("setLocation", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
            return this;
        }
        this.f275199f.Location = kr22;
        SnsMethodCalculate.markEndTimeMs("setLocation", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        return this;
    }

    /* renamed from: w */
    public C94945s2 mo131266w(String str) {
        SnsMethodCalculate.markStartTimeMs("setObjDesc", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        this.f275199f.ContentObj.f298423d = str;
        SnsMethodCalculate.markEndTimeMs("setObjDesc", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        return this;
    }

    /* renamed from: x */
    public C94945s2 mo131267x(String str) {
        SnsMethodCalculate.markStartTimeMs("setObjTitle", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        this.f275199f.ContentObj.f298425f = str;
        SnsMethodCalculate.markEndTimeMs("setObjTitle", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        return this;
    }

    /* renamed from: y */
    public C94945s2 mo131268y(String str) {
        SnsMethodCalculate.markStartTimeMs("setObjUrl", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        this.f275199f.ContentObj.f298426g = str;
        SnsMethodCalculate.markEndTimeMs("setObjUrl", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        return this;
    }

    /* renamed from: z */
    public C94945s2 mo131269z(int i, String str) {
        SnsMethodCalculate.markStartTimeMs("setOpenSdkInfo", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        this.f275207n = i;
        this.f275208o = str;
        SnsMethodCalculate.markEndTimeMs("setOpenSdkInfo", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        return this;
    }
}
