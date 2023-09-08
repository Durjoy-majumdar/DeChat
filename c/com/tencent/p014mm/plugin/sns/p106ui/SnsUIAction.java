package com.tencent.p014mm.plugin.sns.p106ui;

import a14.C53872d1;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import ad0.C91998s;
import ad0.C91999u;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.C54219z;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.autogen.events.PauseAutoGetBigImgEvent;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.base.MMOverScrollView;
import com.tencent.p014mm.p136ui.base.MMPullDownView;
import com.tencent.p014mm.p136ui.tools.C7013o;
import com.tencent.p014mm.plugin.mmsight.SightCaptureResult;
import com.tencent.p014mm.plugin.sns.cover.api.AbsSnsBackPreview;
import com.tencent.p014mm.plugin.sns.cover.preview.SnsCoverContainerLayout;
import com.tencent.p014mm.plugin.sns.data.SnsCmdList;
import com.tencent.p014mm.plugin.sns.model.C43042s0;
import com.tencent.p014mm.plugin.sns.model.C5431p1;
import com.tencent.p014mm.plugin.sns.model.C94853e;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94897n1;
import com.tencent.p014mm.plugin.sns.model.C94928p2;
import com.tencent.p014mm.plugin.sns.model.C94942r1;
import com.tencent.p014mm.plugin.sns.p106ui.SnsHeader;
import com.tencent.p014mm.plugin.sns.p106ui.item.C95933n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.view.SnsStoryHeaderView;
import com.tencent.p014mm.plugin.sns.statistics.C57354l;
import com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.plugin.story.api.AbsStoryHeaderTipView;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96892t1;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.vfs.C86013q1;
import ct2.C97367b;
import cv2.C97381a;
import da0.C58247e;
import di3.C86312j;
import ds2.C31280k;
import ds2.C97535h;
import ds2.C97538i;
import f40.C86709a0;
import ft2.C97979c;
import gv2.C98244q;
import gy3.C87412m;
import h81.C32735h;
import hi2.C46075u;
import hi2.C98453h;
import ht1.C60200t1;
import i21.C60242i;
import ie3.C87716k;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import jq2.C98993j;
import k20.C60958c;
import k20.C9556a;
import k21.C60960c;
import ke3.C88144b;
import lc3.C10485b;
import lu3.C88654b;
import nj3.C76912y0;
import os2.C100398c0;
import os2.C100399d0;
import os2.C100400e0;
import os2.C100408j0;
import os2.C100422y;
import os2.C100423z;
import p166hy.C98569v0;
import p185kq.C76623j;
import p185kq.C76624k;
import p214om.C11502f;
import p823sg.C90193h;
import p914oj.C89231c;
import q91.C101077d;
import qr2.C36069a;
import sf0.C90188n0;
import t91.C64208c;
import te3.q94;
import ur2.C102074a;
import vr2.C102236a0;
import vr2.C102267u;
import wx3.C15601d;
import xb0.C102609h;
import xv2.C102775d;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsUIAction */
public class SnsUIAction extends C98569v0 implements C94853e.C94861h, C94928p2.C94933e {

    /* renamed from: A */
    public int f278826A = 0;

    /* renamed from: B */
    public float f278827B = 1.0f;

    /* renamed from: C */
    public float f278828C = 1.0f;

    /* renamed from: D */
    public float f278829D = 1.0f;

    /* renamed from: E */
    public int f278830E = 0;

    /* renamed from: F */
    public int f278831F = 0;

    /* renamed from: G */
    public int f278832G = 0;

    /* renamed from: H */
    public int f278833H = 0;

    /* renamed from: I */
    public boolean f278834I = true;

    /* renamed from: J */
    public String f278835J;

    /* renamed from: K */
    public String f278836K;

    /* renamed from: L */
    public boolean f278837L = false;

    /* renamed from: M */
    public boolean f278838M = false;

    /* renamed from: N */
    public AbsListView.OnScrollListener f278839N;

    /* renamed from: P */
    public ArrayList<SnsInfo> f278840P = new ArrayList<>();

    /* renamed from: Q */
    public C88654b f278841Q = new C95667j();

    /* renamed from: R */
    public ArrayList<C95933n.C95941e> f278842R = null;

    /* renamed from: S */
    public String f278843S;

    /* renamed from: T */
    public String f278844T;

    /* renamed from: U */
    public String f278845U;

    /* renamed from: V */
    public String f278846V;

    /* renamed from: W */
    public boolean f278847W;

    /* renamed from: X */
    public C91998s f278848X = null;

    /* renamed from: Y */
    public C76624k f278849Y;

    /* renamed from: Z */
    public final C101077d f278850Z = new C95661d();
    private View actionbarView;

    /* renamed from: d */
    public ListView f278851d;

    /* renamed from: e */
    public MMOverScrollView f278852e;

    /* renamed from: f */
    public C98244q f278853f;

    /* renamed from: g */
    public C98244q.C98246b f278854g = new C98244q.C98246b();

    /* renamed from: h */
    public String f278855h;

    /* renamed from: i */
    public View f278856i;

    /* renamed from: j */
    public View f278857j;

    /* renamed from: n */
    public String f278858n;

    /* renamed from: o */
    public LoadingMoreView f278859o;

    /* renamed from: p */
    public SnsHeader f278860p;

    /* renamed from: q */
    public int f278861q = 0;

    /* renamed from: r */
    public boolean f278862r = false;

    /* renamed from: s */
    public boolean f278863s = false;

    /* renamed from: t */
    public boolean f278864t = false;

    /* renamed from: u */
    public boolean f278865u = false;

    /* renamed from: v */
    public int f278866v = 0;

    /* renamed from: w */
    public Activity f278867w;

    /* renamed from: x */
    public C95669n f278868x;

    /* renamed from: y */
    public int f278869y;

    /* renamed from: z */
    public int f278870z;

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsUIAction$b */
    public class C30465b implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ int f82121d;

        /* renamed from: e */
        public final /* synthetic */ int f82122e;

        public C30465b(int i, int i2) {
            this.f82121d = i;
            this.f82122e = i2;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsUIAction$11");
            C86709a0.m107528h();
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119676J(68386, Integer.valueOf(Util.nullAs((Integer) C86709a0.m107535s().mo121142i().mo119684e(68386, (Object) null), 0) + 1));
            SnsUIAction.this.mo133026B(this.f82121d, this.f82122e);
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsUIAction$11");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsUIAction$a */
    public class C57390a implements Runnable {
        public C57390a(SnsUIAction snsUIAction) {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUIAction$10");
            ((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().Rv0();
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUIAction$10");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsUIAction$k */
    public class C57391k implements Runnable {
        public C57391k(SnsUIAction snsUIAction) {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUIAction$7");
            ((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().Rv0();
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUIAction$7");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsUIAction$m */
    public class C57392m implements Runnable {
        public C57392m(SnsUIAction snsUIAction) {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUIAction$9");
            ((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().Rv0();
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUIAction$9");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsUIAction$c */
    public class C95659c implements Runnable {

        /* renamed from: com.tencent.mm.plugin.sns.ui.SnsUIAction$c$a */
        public class C95660a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C102267u f278872d;

            public C95660a(C102267u uVar) {
                this.f278872d = uVar;
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUIAction$12$1");
                SnsUIAction.m122374d(SnsUIAction.this).mo132995k(this.f278872d);
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUIAction$12$1");
            }
        }

        public C95659c() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUIAction$12");
            C100399d0 Xx0 = C94866e1.Xx0();
            String e = SnsUIAction.m122375e(SnsUIAction.this);
            Xx0.getClass();
            SnsMethodCalculate.markStartTimeMs("getSnsUserDateInfo", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
            LinkedList<q94> linkedList = Xx0.mo139782Yt(e).mo139771n2().f145766d;
            SnsMethodCalculate.markEndTimeMs("getSnsUserDateInfo", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
            C102267u uVar = new C102267u();
            if (!Util.isNullOrNil((List) linkedList)) {
                ArrayList arrayList = new ArrayList();
                HashMap hashMap = new HashMap();
                String str = "";
                for (q94 next : linkedList) {
                    String valueOf = String.valueOf(next.f140201d);
                    String valueOf2 = String.valueOf(next.f140202e);
                    Long valueOf3 = Long.valueOf(next.f140203f);
                    if (!Util.isEqual(str, valueOf)) {
                        arrayList = new ArrayList();
                        hashMap = new HashMap();
                        uVar.f301197a.add(valueOf);
                        uVar.f301198b.add(arrayList);
                        ((HashMap) uVar.f301199c).put(valueOf, hashMap);
                        str = valueOf;
                    }
                    arrayList.add(valueOf2);
                    hashMap.put(valueOf2, valueOf3);
                }
            }
            Collections.reverse(uVar.f301197a);
            Collections.reverse(uVar.f301198b);
            Iterator<List<String>> it = uVar.f301198b.iterator();
            while (it.hasNext()) {
                Collections.reverse(it.next());
            }
            C94866e1.ly0().post(new C95660a(uVar));
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUIAction$12");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsUIAction$d */
    public class C95661d implements C101077d {
        public C95661d() {
        }

        /* renamed from: a */
        public void mo102106a(View view, int i, int i2) {
            SnsMethodCalculate.markStartTimeMs("onScroll", "com.tencent.mm.plugin.sns.ui.SnsUIAction$14");
            if (view == null) {
                SnsMethodCalculate.markEndTimeMs("onScroll", "com.tencent.mm.plugin.sns.ui.SnsUIAction$14");
                return;
            }
            SnsUIAction snsUIAction = SnsUIAction.this;
            SnsMethodCalculate.markStartTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
            BaseAdapter k = snsUIAction.mo133033k();
            SnsMethodCalculate.markEndTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
            if (k == null) {
                SnsMethodCalculate.markEndTimeMs("onScroll", "com.tencent.mm.plugin.sns.ui.SnsUIAction$14");
                return;
            }
            SnsUIAction snsUIAction2 = SnsUIAction.this;
            SnsUIAction.m122373c(snsUIAction2, snsUIAction2.getSnsListView(), k, i, i2);
            SnsMethodCalculate.markEndTimeMs("onScroll", "com.tencent.mm.plugin.sns.ui.SnsUIAction$14");
        }

        /* renamed from: b */
        public void mo102107b(View view, int i, int i2, int i3) {
            SnsMethodCalculate.markStartTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.SnsUIAction$14");
            if (view == null) {
                SnsMethodCalculate.markEndTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.SnsUIAction$14");
            } else if (i2 < 0 || i3 <= 0) {
                SnsMethodCalculate.markEndTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.SnsUIAction$14");
            } else {
                SnsUIAction snsUIAction = SnsUIAction.this;
                SnsMethodCalculate.markStartTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
                BaseAdapter k = snsUIAction.mo133033k();
                SnsMethodCalculate.markEndTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
                if (k == null) {
                    SnsMethodCalculate.markEndTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.SnsUIAction$14");
                    return;
                }
                SnsUIAction.m122373c(SnsUIAction.this, view, k, i2, i3);
                SnsMethodCalculate.markEndTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.SnsUIAction$14");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsUIAction$e */
    public class C95662e implements Runnable {
        public C95662e() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUIAction$1");
            DisplayMetrics displayMetrics = new DisplayMetrics();
            SnsUIAction.m122371a(SnsUIAction.this).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            C94866e1.ay0().c40(displayMetrics.widthPixels, displayMetrics.heightPixels);
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUIAction$1");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsUIAction$f */
    public class C95663f implements SnsHeader.C95544h {
        public C95663f() {
        }

        /* renamed from: a */
        public boolean mo133052a(long j, boolean z) {
            boolean z2;
            SnsInfo snsInfo;
            long j2 = j;
            boolean z3 = z;
            SnsMethodCalculate.markStartTimeMs("onLike", "com.tencent.mm.plugin.sns.ui.SnsUIAction$2");
            Log.m105925i("MicroMsg.SnsActivity", "friend like %s, %s, %s", SnsUIAction.m122375e(SnsUIAction.this), Long.valueOf(j), Boolean.valueOf(z));
            if (C72996z1.m85843n5(SnsUIAction.m122375e(SnsUIAction.this))) {
                if (z3) {
                    C100398c0 Yt = C94866e1.Xx0().mo139782Yt(SnsUIAction.m122375e(SnsUIAction.this));
                    C86709a0.m107528h();
                    C86709a0.m107529k().f251779b.mo123460f(new C43042s0(SnsUIAction.m122375e(SnsUIAction.this), Yt));
                    SnsMethodCalculate.markStartTimeMs("setLike", "com.tencent.mm.plugin.sns.storage.SnsExt");
                    Yt.field_local_flag |= 2;
                    SnsMethodCalculate.markEndTimeMs("setLike", "com.tencent.mm.plugin.sns.storage.SnsExt");
                    C94866e1.Xx0().mo139790nP(Yt);
                    SnsUIAction.m122376f(SnsUIAction.this);
                }
                Log.m105925i("MicroMsg.SnsActivity", "openIM friend like %s", SnsUIAction.m122375e(SnsUIAction.this));
            } else {
                if (z3) {
                    SnsInfo snsInfo2 = new SnsInfo();
                    snsInfo2.field_snsId = j2;
                    snsInfo2.field_userName = SnsUIAction.m122375e(SnsUIAction.this);
                    TimeLineObject i = C91999u.m115563i();
                    i.UserName = SnsUIAction.m122375e(SnsUIAction.this);
                    snsInfo2.setTimeLine(i);
                    String e = SnsUIAction.m122375e(SnsUIAction.this);
                    int i2 = C94897n1.f274990d;
                    SnsMethodCalculate.markStartTimeMs("getInfoByName", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
                    C100400e0 Yx0 = C94866e1.Yx0();
                    Yx0.getClass();
                    SnsMethodCalculate.markStartTimeMs("getCursorByUserName", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
                    String str = "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic";
                    Cursor NQ = Yx0.mo139801NQ(true, e, 1, false, "", 0, 0);
                    SnsMethodCalculate.markEndTimeMs("getCursorByUserName", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
                    if (NQ.getCount() == 0) {
                        NQ.close();
                        snsInfo = null;
                        SnsMethodCalculate.markEndTimeMs("getInfoByName", str);
                    } else {
                        String str2 = str;
                        NQ.moveToFirst();
                        snsInfo = new SnsInfo();
                        snsInfo.convertFrom(NQ);
                        if (!NQ.isClosed()) {
                            NQ.close();
                        }
                        SnsMethodCalculate.markEndTimeMs("getInfoByName", str2);
                    }
                    if (snsInfo == null) {
                        C5431p1.C5432a.m5340k(snsInfo2, 1, "", 0);
                    } else if (snsInfo.isExtFlag()) {
                        C5431p1.C5432a.m5340k(snsInfo2, 1, "", 0);
                    } else {
                        C5431p1.C5432a.m5340k(snsInfo2, 5, "", 0);
                    }
                    SnsUIAction.m122376f(SnsUIAction.this);
                }
                C100422y Yt2 = C94866e1.Ux0().mo139909Yt(SnsUIAction.m122375e(SnsUIAction.this));
                if (Yt2.field_snsBgId == j2) {
                    Yt2.field_isLike = z3;
                    z2 = false;
                    C94866e1.Ux0().mo139910bD(Yt2, false);
                    SnsReportHelper.f275506m0.mo131341B().f266220l = 1;
                    SnsMethodCalculate.markEndTimeMs("onLike", "com.tencent.mm.plugin.sns.ui.SnsUIAction$2");
                    return z2;
                }
            }
            z2 = false;
            SnsReportHelper.f275506m0.mo131341B().f266220l = 1;
            SnsMethodCalculate.markEndTimeMs("onLike", "com.tencent.mm.plugin.sns.ui.SnsUIAction$2");
            return z2;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsUIAction$g */
    public class C95664g implements AbsListView.OnScrollListener {
        public C95664g() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:130:0x04c9  */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x0241  */
        /* JADX WARNING: Removed duplicated region for block: B:57:0x0249  */
        /* JADX WARNING: Removed duplicated region for block: B:78:0x0295  */
        /* JADX WARNING: Removed duplicated region for block: B:82:0x02a3  */
        /* JADX WARNING: Removed duplicated region for block: B:90:0x0377  */
        /* JADX WARNING: Removed duplicated region for block: B:91:0x0380  */
        /* JADX WARNING: Removed duplicated region for block: B:96:0x0396  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onScroll(android.widget.AbsListView r31, int r32, int r33, int r34) {
            /*
                r30 = this;
                r6 = r30
                r7 = r31
                r8 = r32
                r9 = r33
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r0.add(r7)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r32)
                r0.add(r1)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r33)
                r0.add(r1)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r34)
                r0.add(r1)
                java.lang.Object[] r5 = r0.toArray()
                r0.clear()
                java.lang.String r0 = "com/tencent/mm/plugin/sns/ui/SnsUIAction$3"
                java.lang.String r1 = "android/widget/AbsListView$OnScrollListener"
                java.lang.String r2 = "onScroll"
                java.lang.String r3 = "(Landroid/widget/AbsListView;III)V"
                r4 = r30
                j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
                java.lang.String r0 = "onScroll"
                java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.SnsUIAction$3"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
                com.tencent.mm.plugin.sns.ui.SnsUIAction r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsUIAction.this
                android.widget.AbsListView$OnScrollListener r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsUIAction.m122377g(r2)
                if (r2 == 0) goto L_0x0056
                com.tencent.mm.plugin.sns.ui.SnsUIAction r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsUIAction.this
                android.widget.AbsListView$OnScrollListener r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsUIAction.m122377g(r2)
                r3 = r34
                r2.onScroll(r7, r8, r9, r3)
                goto L_0x0058
            L_0x0056:
                r3 = r34
            L_0x0058:
                com.tencent.mm.plugin.sns.ui.SnsUIAction r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsUIAction.this
                com.tencent.mm.plugin.sns.ui.SnsHeader r2 = r2.f278860p
                r2.getClass()
                java.lang.String r4 = "onListScroll"
                java.lang.String r5 = "com.tencent.mm.plugin.sns.ui.SnsHeader"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
                com.tencent.mm.plugin.sns.ui.SnsHeader$j r10 = r2.f278099d
                if (r10 == 0) goto L_0x0076
                com.tencent.mm.plugin.story.api.AbsStoryHeaderTipView r10 = r10.f278131f
                if (r10 == 0) goto L_0x0076
                boolean r2 = r2.f278115w
                if (r2 == 0) goto L_0x0076
                r10.mo134177c()
            L_0x0076:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
                com.tencent.mm.plugin.sns.ui.SnsUIAction r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsUIAction.this
                com.tencent.mm.plugin.sns.ui.SnsUIAction$n r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsUIAction.m122374d(r2)
                r2.mo132983a()
                com.tencent.mm.plugin.sns.ui.SnsUIAction r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsUIAction.this
                r2.getClass()
                android.widget.ListView r2 = r2.f278851d
                int r2 = r2.getLastVisiblePosition()
                com.tencent.mm.plugin.sns.ui.SnsUIAction r4 = com.tencent.p014mm.plugin.sns.p106ui.SnsUIAction.this
                android.widget.ListView r4 = r4.f278851d
                int r4 = r4.getCount()
                r5 = 3
                int r4 = r4 - r5
                java.lang.String r10 = "MicroMsg.SnsActivity"
                r11 = 1
                java.lang.String r12 = "com.tencent.mm.plugin.sns.ui.SnsUIAction"
                r13 = 0
                if (r2 != r4) goto L_0x00e2
                com.tencent.mm.plugin.sns.ui.SnsUIAction r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsUIAction.this
                android.widget.ListView r2 = r2.f278851d
                int r2 = r2.getCount()
                com.tencent.mm.plugin.sns.ui.SnsUIAction r4 = com.tencent.p014mm.plugin.sns.p106ui.SnsUIAction.this
                java.lang.String r14 = "access$700"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r14, r12)
                int r4 = r4.f278861q
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r12)
                if (r2 == r4) goto L_0x00e2
                java.lang.Object[] r2 = new java.lang.Object[r11]
                com.tencent.mm.plugin.sns.ui.SnsUIAction r4 = com.tencent.p014mm.plugin.sns.p106ui.SnsUIAction.this
                android.widget.ListView r4 = r4.f278851d
                int r4 = r4.getCount()
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r2[r13] = r4
                java.lang.String r4 = "now refresh count: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r4, r2)
                com.tencent.mm.plugin.sns.ui.SnsUIAction r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsUIAction.this
                android.widget.ListView r4 = r2.f278851d
                int r4 = r4.getCount()
                java.lang.String r14 = "access$702"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r14, r12)
                r2.f278861q = r4
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r12)
                com.tencent.mm.plugin.sns.ui.SnsUIAction r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsUIAction.this
                r2.mo133030h()
            L_0x00e2:
                int r2 = r31.getChildCount()
                java.lang.String r4 = "(Landroid/widget/AbsListView;III)V"
                java.lang.String r14 = "android/widget/AbsListView$OnScrollListener"
                java.lang.String r15 = "com/tencent/mm/plugin/sns/ui/SnsUIAction$3"
                if (r2 != 0) goto L_0x00f5
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                j20.C117292a.m165361g(r6, r15, r14, r0, r4)
                return
            L_0x00f5:
                if (r8 != 0) goto L_0x010a
                com.tencent.mm.plugin.sns.ui.SnsUIAction r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsUIAction.this
                r2.getClass()
                java.lang.String r5 = "onFling"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r12)
                com.tencent.mm.plugin.sns.ui.SnsUIAction$n r2 = r2.f278868x
                r2.mo132992h(r13)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r12)
            L_0x010a:
                com.tencent.mm.plugin.sns.ui.SnsUIAction r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsUIAction.this
                android.app.Activity r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsUIAction.m122371a(r2)
                r5 = 20
                int r2 = kg3.C76577a.m92151b(r2, r5)
                com.tencent.mm.plugin.sns.ui.SnsUIAction r5 = com.tencent.p014mm.plugin.sns.p106ui.SnsUIAction.this
                float r11 = r5.f278829D
                android.app.Activity r5 = com.tencent.p014mm.plugin.sns.p106ui.SnsUIAction.m122371a(r5)
                boolean r5 = r5 instanceof com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI
                if (r5 == 0) goto L_0x012f
                com.tencent.mm.plugin.sns.ui.SnsUIAction r5 = com.tencent.p014mm.plugin.sns.p106ui.SnsUIAction.this
                android.app.Activity r5 = com.tencent.p014mm.plugin.sns.p106ui.SnsUIAction.m122371a(r5)
                r11 = 245(0xf5, float:3.43E-43)
                int r5 = kg3.C76577a.m92151b(r5, r11)
                goto L_0x0147
            L_0x012f:
                com.tencent.mm.plugin.sns.ui.SnsUIAction r5 = com.tencent.p014mm.plugin.sns.p106ui.SnsUIAction.this
                android.app.Activity r5 = com.tencent.p014mm.plugin.sns.p106ui.SnsUIAction.m122371a(r5)
                boolean r5 = r5 instanceof com.tencent.p014mm.plugin.sns.p106ui.SnsUserUI
                if (r5 == 0) goto L_0x0146
                com.tencent.mm.plugin.sns.ui.SnsUIAction r5 = com.tencent.p014mm.plugin.sns.p106ui.SnsUIAction.this
                android.app.Activity r5 = com.tencent.p014mm.plugin.sns.p106ui.SnsUIAction.m122371a(r5)
                r11 = 199(0xc7, float:2.79E-43)
                int r5 = kg3.C76577a.m92151b(r5, r11)
                goto L_0x0147
            L_0x0146:
                r5 = 0
            L_0x0147:
                com.tencent.mm.plugin.sns.ui.SnsUIAction r11 = com.tencent.p014mm.plugin.sns.p106ui.SnsUIAction.this
                android.app.Activity r11 = com.tencent.p014mm.plugin.sns.p106ui.SnsUIAction.m122371a(r11)
                r13 = 30
                int r11 = kg3.C76577a.m92151b(r11, r13)
                int r11 = r5 - r11
                com.tencent.mm.plugin.sns.ui.SnsUIAction r13 = com.tencent.p014mm.plugin.sns.p106ui.SnsUIAction.this
                android.app.Activity r13 = com.tencent.p014mm.plugin.sns.p106ui.SnsUIAction.m122371a(r13)
                r3 = 10
                int r3 = kg3.C76577a.m92151b(r13, r3)
                int r3 = r5 - r3
                r13 = 0
                android.view.View r16 = r7.getChildAt(r13)
                if (r16 != 0) goto L_0x016e
                r17 = r4
                r13 = 0
                goto L_0x0174
            L_0x016e:
                int r13 = r16.getTop()
                r17 = r4
            L_0x0174:
                com.tencent.mm.plugin.sns.ui.SnsUIAction r4 = com.tencent.p014mm.plugin.sns.p106ui.SnsUIAction.this
                r18 = r14
                java.lang.String r14 = "access$800"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r14, r12)
                int r4 = r4.f278869y
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r12)
                r19 = r15
                java.lang.String r15 = "access$900"
                r20 = r0
                r0 = 2
                if (r8 <= r4) goto L_0x01a7
                com.tencent.mm.plugin.sns.ui.SnsUIAction r4 = com.tencent.p014mm.plugin.sns.p106ui.SnsUIAction.this
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r15, r12)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r12)
                r14 = 1
                r4.f278830E = r14
                if (r16 == 0) goto L_0x01a3
                com.tencent.mm.plugin.sns.ui.SnsUIAction r4 = com.tencent.p014mm.plugin.sns.p106ui.SnsUIAction.this
                int r14 = r4.f278833H
                int r15 = r16.getHeight()
                int r14 = r14 + r15
                r4.f278833H = r14
            L_0x01a3:
                r21 = r1
                goto L_0x021b
            L_0x01a7:
                com.tencent.mm.plugin.sns.ui.SnsUIAction r4 = com.tencent.p014mm.plugin.sns.p106ui.SnsUIAction.this
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r14, r12)
                int r4 = r4.f278869y
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r12)
                java.lang.String r14 = "access$1000"
                if (r8 >= r4) goto L_0x01d5
                com.tencent.mm.plugin.sns.ui.SnsUIAction r4 = com.tencent.p014mm.plugin.sns.p106ui.SnsUIAction.this
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r14, r12)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r12)
                r4.f278830E = r0
                com.tencent.mm.plugin.sns.ui.SnsUIAction r4 = com.tencent.p014mm.plugin.sns.p106ui.SnsUIAction.this
                int r4 = r4.f278833H
                int r14 = r16.getHeight()
                if (r4 < r14) goto L_0x01a3
                com.tencent.mm.plugin.sns.ui.SnsUIAction r4 = com.tencent.p014mm.plugin.sns.p106ui.SnsUIAction.this
                int r14 = r4.f278833H
                int r15 = r16.getHeight()
                int r14 = r14 - r15
                r4.f278833H = r14
                goto L_0x01a3
            L_0x01d5:
                com.tencent.mm.plugin.sns.ui.SnsUIAction r4 = com.tencent.p014mm.plugin.sns.p106ui.SnsUIAction.this
                java.lang.String r0 = "access$1100"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r12)
                int r4 = r4.f278870z
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r12)
                int r4 = r13 - r4
                int r4 = java.lang.Math.abs(r4)
                r21 = r1
                r1 = 1
                if (r4 <= r1) goto L_0x021b
                com.tencent.mm.plugin.sns.ui.SnsUIAction r1 = com.tencent.p014mm.plugin.sns.p106ui.SnsUIAction.this
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r12)
                int r1 = r1.f278870z
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r12)
                if (r13 >= r1) goto L_0x0204
                com.tencent.mm.plugin.sns.ui.SnsUIAction r0 = com.tencent.p014mm.plugin.sns.p106ui.SnsUIAction.this
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r15, r12)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r12)
                r1 = 1
                r0.f278830E = r1
                goto L_0x021b
            L_0x0204:
                com.tencent.mm.plugin.sns.ui.SnsUIAction r1 = com.tencent.p014mm.plugin.sns.p106ui.SnsUIAction.this
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r12)
                int r1 = r1.f278870z
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r12)
                if (r13 <= r1) goto L_0x021b
                com.tencent.mm.plugin.sns.ui.SnsUIAction r0 = com.tencent.p014mm.plugin.sns.p106ui.SnsUIAction.this
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r14, r12)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r12)
                r1 = 2
                r0.f278830E = r1
            L_0x021b:
                com.tencent.mm.plugin.sns.ui.SnsUIAction r0 = com.tencent.p014mm.plugin.sns.p106ui.SnsUIAction.this
                int r1 = -r13
                int r4 = r0.f278833H
                int r1 = r1 + r4
                r0.f278832G = r1
                java.lang.String r1 = "access$802"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r12)
                r0.f278869y = r8
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r12)
                com.tencent.mm.plugin.sns.ui.SnsUIAction r0 = com.tencent.p014mm.plugin.sns.p106ui.SnsUIAction.this
                java.lang.String r1 = "access$1102"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r12)
                r0.f278870z = r13
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r12)
                com.tencent.mm.plugin.sns.ui.SnsUIAction r0 = com.tencent.p014mm.plugin.sns.p106ui.SnsUIAction.this
                int r1 = r0.f278831F
                int r4 = r0.f278830E
                if (r1 == r4) goto L_0x0244
                r0.getClass()
            L_0x0244:
                r1 = 0
                r4 = 1065353216(0x3f800000, float:1.0)
                if (r8 != 0) goto L_0x0295
                int r14 = r16.getTop()
                int r14 = -r14
                com.tencent.mm.plugin.sns.ui.SnsUIAction r15 = com.tencent.p014mm.plugin.sns.p106ui.SnsUIAction.this
                r15.f278832G = r14
                if (r14 < 0) goto L_0x025b
                if (r14 > r11) goto L_0x025b
                r3 = 1065353216(0x3f800000, float:1.0)
                r11 = 1065353216(0x3f800000, float:1.0)
                goto L_0x0276
            L_0x025b:
                if (r14 > r3) goto L_0x0267
                int r15 = r14 - r11
                float r15 = (float) r15
                int r3 = r3 - r11
                float r3 = (float) r3
                float r15 = r15 / r3
                float r3 = r4 - r15
                r11 = r3
                goto L_0x0276
            L_0x0267:
                int r3 = r5 + r2
                if (r14 > r3) goto L_0x0273
                int r3 = r14 - r5
                float r3 = (float) r3
                float r3 = r3 * r4
                float r11 = (float) r2
                float r3 = r3 / r11
                goto L_0x0275
            L_0x0273:
                r3 = 1065353216(0x3f800000, float:1.0)
            L_0x0275:
                r11 = 0
            L_0x0276:
                if (r14 < 0) goto L_0x027c
                if (r14 > r5) goto L_0x027c
                r2 = 0
                goto L_0x0292
            L_0x027c:
                int r1 = r5 + r2
                if (r14 > r1) goto L_0x028b
                int r14 = r14 - r5
                int r1 = r14 * 100
                int r1 = r1 / r2
                float r14 = (float) r14
                float r14 = r14 * r4
                float r2 = (float) r2
                float r14 = r14 / r2
                r2 = 1
                goto L_0x029d
            L_0x028b:
                if (r14 <= r1) goto L_0x028f
                r1 = r11
                goto L_0x0297
            L_0x028f:
                r1 = 1065353216(0x3f800000, float:1.0)
                r2 = 1
            L_0x0292:
                r14 = r1
                r1 = 0
                goto L_0x029d
            L_0x0295:
                r3 = 1065353216(0x3f800000, float:1.0)
            L_0x0297:
                r11 = r1
                r1 = 100
                r2 = 1
                r14 = 1065353216(0x3f800000, float:1.0)
            L_0x029d:
                com.tencent.mm.plugin.sns.ui.SnsUIAction r15 = com.tencent.p014mm.plugin.sns.p106ui.SnsUIAction.this
                android.view.View r0 = r15.f278857j
                if (r0 == 0) goto L_0x0367
                r0 = 3
                java.lang.Object[] r4 = new java.lang.Object[r0]
                int r0 = r15.f278832G
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r15 = 0
                r4[r15] = r0
                java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
                r13 = 1
                r4[r13] = r0
                com.tencent.mm.plugin.sns.ui.SnsUIAction r0 = com.tencent.p014mm.plugin.sns.p106ui.SnsUIAction.this
                int r0 = r0.f278833H
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r13 = 2
                r4[r13] = r0
                java.lang.String r0 = "dancy text totalScrollY:%s, top:%s, viewHeight:%s "
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r0, r4)
                com.tencent.mm.plugin.sns.ui.SnsUIAction r0 = com.tencent.p014mm.plugin.sns.p106ui.SnsUIAction.this
                int r4 = r0.f278832G
                if (r4 > r5) goto L_0x031d
                boolean r0 = com.tencent.p014mm.plugin.sns.p106ui.SnsUIAction.m122372b(r0)
                if (r0 == 0) goto L_0x02d3
                goto L_0x031d
            L_0x02d3:
                com.tencent.mm.plugin.sns.ui.SnsUIAction r0 = com.tencent.p014mm.plugin.sns.p106ui.SnsUIAction.this
                android.view.View r0 = r0.f278857j
                k20.a r4 = new k20.a
                r4.<init>()
                java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
                r5 = 0
                java.lang.Integer r13 = java.lang.Integer.valueOf(r5)
                r4.mo10233c(r13)
                java.lang.Object[] r23 = r4.mo10232b()
                java.lang.String r24 = "com/tencent/mm/plugin/sns/ui/SnsUIAction$3"
                java.lang.String r25 = "onScroll"
                java.lang.String r26 = "(Landroid/widget/AbsListView;III)V"
                java.lang.String r27 = "android/view/View_EXEC_"
                java.lang.String r28 = "setVisibility"
                java.lang.String r29 = "(I)V"
                r22 = r0
                j20.C117292a.m165358d(r22, r23, r24, r25, r26, r27, r28, r29)
                r5 = 0
                java.lang.Object r4 = r4.mo10231a(r5)
                java.lang.Integer r4 = (java.lang.Integer) r4
                int r4 = r4.intValue()
                r0.setVisibility(r4)
                java.lang.String r23 = "com/tencent/mm/plugin/sns/ui/SnsUIAction$3"
                java.lang.String r24 = "onScroll"
                java.lang.String r25 = "(Landroid/widget/AbsListView;III)V"
                java.lang.String r26 = "android/view/View_EXEC_"
                java.lang.String r27 = "setVisibility"
                java.lang.String r28 = "(I)V"
                j20.C117292a.m165359e(r22, r23, r24, r25, r26, r27, r28)
                goto L_0x0367
            L_0x031d:
                com.tencent.mm.plugin.sns.ui.SnsUIAction r0 = com.tencent.p014mm.plugin.sns.p106ui.SnsUIAction.this
                android.view.View r0 = r0.f278857j
                r4 = 8
                k20.a r5 = new k20.a
                r5.<init>()
                java.lang.ThreadLocal<k20.a> r13 = k20.C60958c.f173611a
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r5.mo10233c(r4)
                java.lang.Object[] r23 = r5.mo10232b()
                java.lang.String r24 = "com/tencent/mm/plugin/sns/ui/SnsUIAction$3"
                java.lang.String r25 = "onScroll"
                java.lang.String r26 = "(Landroid/widget/AbsListView;III)V"
                java.lang.String r27 = "android/view/View_EXEC_"
                java.lang.String r28 = "setVisibility"
                java.lang.String r29 = "(I)V"
                r22 = r0
                j20.C117292a.m165358d(r22, r23, r24, r25, r26, r27, r28, r29)
                r4 = 0
                java.lang.Object r5 = r5.mo10231a(r4)
                java.lang.Integer r5 = (java.lang.Integer) r5
                int r4 = r5.intValue()
                r0.setVisibility(r4)
                java.lang.String r23 = "com/tencent/mm/plugin/sns/ui/SnsUIAction$3"
                java.lang.String r24 = "onScroll"
                java.lang.String r25 = "(Landroid/widget/AbsListView;III)V"
                java.lang.String r26 = "android/view/View_EXEC_"
                java.lang.String r27 = "setVisibility"
                java.lang.String r28 = "(I)V"
                j20.C117292a.m165359e(r22, r23, r24, r25, r26, r27, r28)
            L_0x0367:
                com.tencent.mm.plugin.sns.ui.SnsUIAction r0 = com.tencent.p014mm.plugin.sns.p106ui.SnsUIAction.this
                int r4 = r0.f278832G
                int r4 = r0.f278830E
                r0.f278831F = r4
                android.app.Activity r0 = com.tencent.p014mm.plugin.sns.p106ui.SnsUIAction.m122371a(r0)
                boolean r0 = r0 instanceof com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI
                if (r0 == 0) goto L_0x0380
                com.tencent.mm.plugin.sns.ui.SnsUIAction r0 = com.tencent.p014mm.plugin.sns.p106ui.SnsUIAction.this
                android.app.Activity r0 = com.tencent.p014mm.plugin.sns.p106ui.SnsUIAction.m122371a(r0)
                com.tencent.mm.plugin.sns.ui.SnsTimeLineUI r0 = (com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI) r0
                goto L_0x0394
            L_0x0380:
                com.tencent.mm.plugin.sns.ui.SnsUIAction r0 = com.tencent.p014mm.plugin.sns.p106ui.SnsUIAction.this
                android.app.Activity r0 = com.tencent.p014mm.plugin.sns.p106ui.SnsUIAction.m122371a(r0)
                boolean r0 = r0 instanceof com.tencent.p014mm.plugin.sns.p106ui.SnsUserUI
                if (r0 == 0) goto L_0x0393
                com.tencent.mm.plugin.sns.ui.SnsUIAction r0 = com.tencent.p014mm.plugin.sns.p106ui.SnsUIAction.this
                android.app.Activity r0 = com.tencent.p014mm.plugin.sns.p106ui.SnsUIAction.m122371a(r0)
                com.tencent.mm.plugin.sns.ui.SnsUserUI r0 = (com.tencent.p014mm.plugin.sns.p106ui.SnsUserUI) r0
                goto L_0x0394
            L_0x0393:
                r0 = 0
            L_0x0394:
                if (r0 == 0) goto L_0x04b0
                com.tencent.mm.plugin.sns.ui.SnsUIAction r4 = com.tencent.p014mm.plugin.sns.p106ui.SnsUIAction.this
                boolean r4 = com.tencent.p014mm.plugin.sns.p106ui.SnsUIAction.m122372b(r4)
                if (r4 == 0) goto L_0x03a5
                r1 = 100
                r3 = 1065353216(0x3f800000, float:1.0)
                r4 = 1065353216(0x3f800000, float:1.0)
                goto L_0x03a6
            L_0x03a5:
                r4 = r14
            L_0x03a6:
                com.tencent.mm.plugin.sns.ui.SnsUIAction r5 = com.tencent.p014mm.plugin.sns.p106ui.SnsUIAction.this
                int r5 = r5.f278826A
                if (r5 == r1) goto L_0x0490
                r5 = 4
                if (r1 > 0) goto L_0x03ee
                java.lang.Object[] r5 = new java.lang.Object[r5]
                java.lang.Integer r13 = java.lang.Integer.valueOf(r32)
                r14 = 0
                r5[r14] = r13
                java.lang.Integer r13 = java.lang.Integer.valueOf(r33)
                r14 = 1
                r5[r14] = r13
                java.lang.Integer r13 = java.lang.Integer.valueOf(r34)
                r14 = 2
                r5[r14] = r13
                com.tencent.mm.plugin.sns.ui.SnsUIAction r13 = com.tencent.p014mm.plugin.sns.p106ui.SnsUIAction.this
                boolean r13 = com.tencent.p014mm.plugin.sns.p106ui.SnsUIAction.m122372b(r13)
                java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
                r14 = 3
                r5[r14] = r13
                java.lang.String r13 = "make actionbar transparent,firstVisibleItem:%d visibleItemCount:%d totalItemCount:%d isPullDownMode:%b"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r13, r5)
                com.tencent.mm.plugin.sns.ui.SnsUIAction r5 = com.tencent.p014mm.plugin.sns.p106ui.SnsUIAction.this
                android.app.Activity r5 = com.tencent.p014mm.plugin.sns.p106ui.SnsUIAction.m122371a(r5)
                android.content.res.Resources r5 = r5.getResources()
                r10 = 2131101688(0x7f0607f8, float:1.7815793E38)
                int r5 = r5.getColor(r10)
                r0.setActionbarColor(r5)
                goto L_0x0437
            L_0x03ee:
                r13 = 5
                java.lang.Object[] r13 = new java.lang.Object[r13]
                java.lang.Integer r14 = java.lang.Integer.valueOf(r32)
                r15 = 0
                r13[r15] = r14
                java.lang.Integer r14 = java.lang.Integer.valueOf(r33)
                r15 = 1
                r13[r15] = r14
                java.lang.Integer r14 = java.lang.Integer.valueOf(r34)
                r15 = 2
                r13[r15] = r14
                java.lang.Integer r14 = java.lang.Integer.valueOf(r1)
                r15 = 3
                r13[r15] = r14
                com.tencent.mm.plugin.sns.ui.SnsUIAction r14 = com.tencent.p014mm.plugin.sns.p106ui.SnsUIAction.this
                boolean r14 = com.tencent.p014mm.plugin.sns.p106ui.SnsUIAction.m122372b(r14)
                java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)
                r13[r5] = r14
                java.lang.String r5 = "make actionbar color,firstVisibleItem:%d visibleItemCount:%d totalItemCount:%d mAlpha:%d isPullDownMode:%b"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r5, r13)
                com.tencent.mm.plugin.sns.ui.SnsUIAction r5 = com.tencent.p014mm.plugin.sns.p106ui.SnsUIAction.this
                android.app.Activity r5 = com.tencent.p014mm.plugin.sns.p106ui.SnsUIAction.m122371a(r5)
                android.content.res.Resources r5 = r5.getResources()
                r10 = 2131101246(0x7f06063e, float:1.7814896E38)
                int r5 = r5.getColor(r10)
                int r5 = com.tencent.p014mm.p136ui.C74933u4.m89764a(r5, r1)
                r0.setActionbarColor(r5)
            L_0x0437:
                com.tencent.mm.plugin.sns.ui.SnsUIAction r5 = com.tencent.p014mm.plugin.sns.p106ui.SnsUIAction.this
                android.app.Activity r5 = com.tencent.p014mm.plugin.sns.p106ui.SnsUIAction.m122371a(r5)
                boolean r5 = r5 instanceof com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI
                if (r5 == 0) goto L_0x0452
                if (r2 == 0) goto L_0x044b
                r5 = 2131756240(0x7f1004d0, float:1.9143382E38)
                r10 = 0
                r0.updateOptionMenuIcon(r10, r5)
                goto L_0x0452
            L_0x044b:
                r10 = 0
                r5 = 2131755971(0x7f1003c3, float:1.9142836E38)
                r0.updateOptionMenuIcon(r10, r5)
            L_0x0452:
                com.tencent.mm.plugin.sns.ui.SnsUIAction r5 = com.tencent.p014mm.plugin.sns.p106ui.SnsUIAction.this
                android.app.Activity r5 = com.tencent.p014mm.plugin.sns.p106ui.SnsUIAction.m122371a(r5)
                boolean r5 = r5 instanceof com.tencent.p014mm.plugin.sns.p106ui.SnsUserUI
                if (r5 == 0) goto L_0x047b
                com.tencent.mm.plugin.sns.ui.SnsUIAction r5 = com.tencent.p014mm.plugin.sns.p106ui.SnsUIAction.this
                java.lang.String r10 = "access$100"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r12)
                boolean r5 = r5.f278847W
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r12)
                if (r5 == 0) goto L_0x047b
                if (r2 == 0) goto L_0x0474
                r2 = 2131756269(0x7f1004ed, float:1.914344E38)
                r5 = 0
                r0.updateOptionMenuIcon(r5, r2)
                goto L_0x047b
            L_0x0474:
                r5 = 0
                r2 = 2131755994(0x7f1003da, float:1.9142883E38)
                r0.updateOptionMenuIcon(r5, r2)
            L_0x047b:
                com.tencent.mm.plugin.sns.ui.SnsUIAction r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsUIAction.this
                android.app.Activity r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsUIAction.m122371a(r2)
                boolean r2 = r2 instanceof com.tencent.p014mm.plugin.sns.p106ui.SnsUserUI
                if (r2 == 0) goto L_0x0490
                com.tencent.mm.plugin.sns.ui.SnsUIAction r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsUIAction.this
                android.app.Activity r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsUIAction.m122371a(r2)
                com.tencent.mm.plugin.sns.ui.SnsUserUI r2 = (com.tencent.p014mm.plugin.sns.p106ui.SnsUserUI) r2
                r2.mo133107U7()
            L_0x0490:
                com.tencent.mm.plugin.sns.ui.SnsUIAction r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsUIAction.this
                com.tencent.mm.plugin.sns.ui.SnsUIAction$n r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsUIAction.m122374d(r2)
                r2.mo132985c(r8, r1)
                com.tencent.mm.plugin.sns.ui.SnsUIAction r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsUIAction.this
                float r2 = r2.f278828C
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 == 0) goto L_0x04a4
                r0.setTitleAlpha(r4)
            L_0x04a4:
                com.tencent.mm.plugin.sns.ui.SnsUIAction r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsUIAction.this
                float r2 = r2.f278827B
                int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                if (r2 == 0) goto L_0x04af
                r0.setIconAlpha(r3)
            L_0x04af:
                r14 = r4
            L_0x04b0:
                com.tencent.mm.plugin.sns.ui.SnsUIAction r0 = com.tencent.p014mm.plugin.sns.p106ui.SnsUIAction.this
                r0.f278826A = r1
                r0.f278827B = r3
                r0.f278828C = r14
                r0.f278829D = r11
                java.lang.String r1 = "access$1300"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r12)
                java.lang.String r2 = "reportOnScroll"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r12)
                kq.k r0 = r0.f278849Y
                if (r0 == 0) goto L_0x04cc
                r0.mo106875a(r7, r8, r9)
            L_0x04cc:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r12)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r12)
                r0 = r20
                r1 = r21
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                r1 = r17
                r2 = r18
                r3 = r19
                j20.C117292a.m165361g(r6, r3, r2, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.SnsUIAction.C95664g.onScroll(android.widget.AbsListView, int, int, int):void");
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            SnsStoryHeaderView snsStoryHeaderView;
            AbsStoryHeaderTipView absStoryHeaderTipView;
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsUIAction$3", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.SnsUIAction$3");
            if (SnsUIAction.m122377g(SnsUIAction.this) != null) {
                SnsUIAction.m122377g(SnsUIAction.this).onScrollStateChanged(absListView, i);
            }
            SnsUIAction.m122374d(SnsUIAction.this).mo132989g(absListView, i);
            if (i == 0) {
                if ((SnsUIAction.m122371a(SnsUIAction.this) instanceof SnsTimeLineUI) && ((SnsTimeLineUI) SnsUIAction.m122371a(SnsUIAction.this)).f278640M != null) {
                    ((SnsTimeLineUI) SnsUIAction.m122371a(SnsUIAction.this)).f278640M.mo138301h(true);
                }
                SnsHeader snsHeader = SnsUIAction.this.f278860p;
                if (snsHeader != null) {
                    SnsMethodCalculate.markStartTimeMs("onScrollIdle", "com.tencent.mm.plugin.sns.ui.SnsHeader");
                    SnsHeader.C95546j jVar = snsHeader.f278099d;
                    if (!(jVar == null || (absStoryHeaderTipView = jVar.f278131f) == null || !snsHeader.f278115w)) {
                        absStoryHeaderTipView.mo134180f();
                    }
                    SnsHeader.C95546j jVar2 = snsHeader.f278099d;
                    if (!(jVar2 == null || (snsStoryHeaderView = jVar2.f278132g) == null || snsHeader.f278115w)) {
                        SnsMethodCalculate.markStartTimeMs("onScrollIdle", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
                        snsStoryHeaderView.mo133942b();
                        SnsMethodCalculate.markEndTimeMs("onScrollIdle", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
                    }
                    SnsMethodCalculate.markEndTimeMs("onScrollIdle", "com.tencent.mm.plugin.sns.ui.SnsHeader");
                }
                if (SnsUIAction.m122371a(SnsUIAction.this) instanceof SnsTimeLineUI) {
                    SnsUIAction snsUIAction = SnsUIAction.this;
                    snsUIAction.mo133031i(snsUIAction.f278851d);
                }
                SnsUIAction.this.mo133025A();
                if (SnsUIAction.this.f278851d.getLastVisiblePosition() == SnsUIAction.this.f278851d.getCount() - 1) {
                    SnsUIAction.this.mo133030h();
                }
            }
            Log.m105918d("MicroMsg.SnsActivity", "leex print scrollState:" + i);
            if (i == 2) {
                SnsUIAction snsUIAction2 = SnsUIAction.this;
                snsUIAction2.getClass();
                SnsMethodCalculate.markStartTimeMs("onFling", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
                snsUIAction2.f278868x.mo132992h(true);
                SnsMethodCalculate.markEndTimeMs("onFling", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
            } else {
                SnsUIAction snsUIAction3 = SnsUIAction.this;
                snsUIAction3.getClass();
                SnsMethodCalculate.markStartTimeMs("onFling", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
                snsUIAction3.f278868x.mo132992h(false);
                SnsMethodCalculate.markEndTimeMs("onFling", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
            }
            SnsUIAction snsUIAction4 = SnsUIAction.this;
            SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
            snsUIAction4.getClass();
            SnsMethodCalculate.markStartTimeMs("reportOnScrollStateChanged", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
            C76624k kVar = snsUIAction4.f278849Y;
            if (kVar != null) {
                kVar.mo106876b(absListView, i);
            }
            SnsMethodCalculate.markEndTimeMs("reportOnScrollStateChanged", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
            SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
            SnsMethodCalculate.markEndTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.SnsUIAction$3");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsUIAction$3", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsUIAction$h */
    public class C95665h implements MMPullDownView.C73177d {
        public C95665h() {
        }

        /* renamed from: q0 */
        public boolean mo64384q0() {
            SnsMethodCalculate.markStartTimeMs("isAtBottom", "com.tencent.mm.plugin.sns.ui.SnsUIAction$4");
            boolean l = SnsUIAction.this.mo133034l();
            SnsMethodCalculate.markEndTimeMs("isAtBottom", "com.tencent.mm.plugin.sns.ui.SnsUIAction$4");
            return l;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsUIAction$i */
    public class C95666i implements MMPullDownView.C73178e {
        public C95666i() {
        }

        /* renamed from: b0 */
        public boolean mo64386b0() {
            SnsMethodCalculate.markStartTimeMs("isAtTop", "com.tencent.mm.plugin.sns.ui.SnsUIAction$5");
            boolean m = SnsUIAction.this.mo133035m();
            SnsMethodCalculate.markEndTimeMs("isAtTop", "com.tencent.mm.plugin.sns.ui.SnsUIAction$5");
            return m;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsUIAction$j */
    public class C95667j extends C88654b {
        public C95667j() {
        }

        public String getKey() {
            SnsMethodCalculate.markStartTimeMs("getKey", "com.tencent.mm.plugin.sns.ui.SnsUIAction$6");
            SnsMethodCalculate.markEndTimeMs("getKey", "com.tencent.mm.plugin.sns.ui.SnsUIAction$6");
            return "SnsUIAction#preloadRunnable";
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUIAction$6");
            C94866e1.hy0().mo131030p();
            SnsUIAction snsUIAction = SnsUIAction.this;
            SnsMethodCalculate.markStartTimeMs("access$1400", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
            ArrayList<SnsInfo> arrayList = snsUIAction.f278840P;
            SnsMethodCalculate.markEndTimeMs("access$1400", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
            Iterator it = new ArrayList(arrayList).iterator();
            while (it.hasNext()) {
                C94866e1.hy0().mo131027m((SnsInfo) it.next(), true);
            }
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUIAction$6");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsUIAction$l */
    public class C95668l implements C7013o.C7017c {
        public C95668l() {
        }

        /* renamed from: a */
        public String mo8052a(String str) {
            SnsMethodCalculate.markStartTimeMs("genOutputPath", "com.tencent.mm.plugin.sns.ui.SnsUIAction$8");
            String str2 = C94866e1.m120263iU() + C90193h.m112878f((SnsUIAction.this.f278858n + System.currentTimeMillis()).getBytes());
            SnsMethodCalculate.markEndTimeMs("genOutputPath", "com.tencent.mm.plugin.sns.ui.SnsUIAction$8");
            return str2;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsUIAction$n */
    public interface C95669n {
        /* renamed from: a */
        void mo132983a();

        /* renamed from: b */
        View mo132984b();

        /* renamed from: c */
        void mo132985c(int i, int i2);

        /* renamed from: d */
        void mo132986d(boolean z, int i, List<Integer> list, List<Integer> list2);

        /* renamed from: e */
        void mo132987e();

        /* renamed from: f */
        View mo132988f();

        /* renamed from: g */
        void mo132989g(AbsListView absListView, int i);

        View getMaskView();

        int getType();

        /* renamed from: h */
        void mo132992h(boolean z);

        /* renamed from: i */
        void mo132993i();

        /* renamed from: j */
        ListView mo132994j();

        /* renamed from: k */
        void mo132995k(C102267u uVar);

        /* renamed from: l */
        MMOverScrollView mo132996l();

        void onPostEnd(int i, boolean z);
    }

    public SnsUIAction(Activity activity) {
        this.f278867w = activity;
    }

    /* renamed from: a */
    public static /* synthetic */ Activity m122371a(SnsUIAction snsUIAction) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        Activity activity = snsUIAction.f278867w;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        return activity;
    }

    /* renamed from: b */
    public static /* synthetic */ boolean m122372b(SnsUIAction snsUIAction) {
        SnsMethodCalculate.markStartTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        boolean z = snsUIAction.f278837L;
        SnsMethodCalculate.markEndTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        return z;
    }

    /* renamed from: c */
    public static void m122373c(SnsUIAction snsUIAction, View view, BaseAdapter baseAdapter, int i, int i2) {
        boolean z;
        SnsUIAction snsUIAction2 = snsUIAction;
        SnsMethodCalculate.markStartTimeMs("access$1600", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        snsUIAction.getClass();
        SnsMethodCalculate.markStartTimeMs("doReportOnScroll", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        boolean j = snsUIAction2.f278860p.mo132746j(snsUIAction2.actionbarView);
        if (!j) {
            int i3 = i;
        } else if (i >= 1) {
            z = false;
            String valueOf = String.valueOf(61);
            ((C60200t1) C86312j.m106911c(C60200t1.class)).ui0(view, baseAdapter, z ^ true ? 1 : 0, i, i2, 1, valueOf, 1, z);
            SnsMethodCalculate.markEndTimeMs("doReportOnScroll", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
            SnsMethodCalculate.markEndTimeMs("access$1600", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        }
        z = j;
        String valueOf2 = String.valueOf(61);
        ((C60200t1) C86312j.m106911c(C60200t1.class)).ui0(view, baseAdapter, z ^ true ? 1 : 0, i, i2, 1, valueOf2, 1, z);
        SnsMethodCalculate.markEndTimeMs("doReportOnScroll", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        SnsMethodCalculate.markEndTimeMs("access$1600", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
    }

    /* renamed from: d */
    public static /* synthetic */ C95669n m122374d(SnsUIAction snsUIAction) {
        SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        C95669n nVar = snsUIAction.f278868x;
        SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        return nVar;
    }

    /* renamed from: e */
    public static /* synthetic */ String m122375e(SnsUIAction snsUIAction) {
        SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        String str = snsUIAction.f278844T;
        SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        return str;
    }

    /* renamed from: f */
    public static void m122376f(SnsUIAction snsUIAction) {
        SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        snsUIAction.getClass();
        SnsMethodCalculate.markStartTimeMs("toastHeart", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        View inflate = LayoutInflater.from(snsUIAction.f278867w).inflate(C0966R.C0971layout.c3t, (ViewGroup) snsUIAction.f278867w.findViewById(C0966R.C0970id.f359264jv2));
        C76912y0 y0Var = new C76912y0(snsUIAction.f278867w);
        y0Var.setGravity(48, 0, BackwardSupportUtil.BitmapFactory.fromDPToPix(snsUIAction.f278867w, 200.0f));
        y0Var.f224773c = (long) 1000;
        y0Var.setView(inflate);
        y0Var.cancel();
        y0Var.f224777g.stopTimer();
        y0Var.f224772b = ((int) (y0Var.f224773c / 70)) + 1;
        y0Var.f224777g.startTimer(70);
        SnsMethodCalculate.markEndTimeMs("toastHeart", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
    }

    /* renamed from: g */
    public static /* synthetic */ AbsListView.OnScrollListener m122377g(SnsUIAction snsUIAction) {
        SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        AbsListView.OnScrollListener onScrollListener = snsUIAction.f278839N;
        SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        return onScrollListener;
    }

    /* renamed from: A */
    public void mo133025A() {
        SnsMethodCalculate.markStartTimeMs("preloadVideo", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        this.f278841Q.mo97819a();
        this.f278840P.clear();
        int lastVisiblePosition = this.f278851d.getLastVisiblePosition();
        Log.m105925i("MicroMsg.SnsVideoService", "currentPosition :%d count:%d", Integer.valueOf(lastVisiblePosition), Integer.valueOf(this.f278851d.getCount()));
        int count = this.f278851d.getCount();
        if (count - lastVisiblePosition > 15) {
            count = lastVisiblePosition + 15;
        }
        while (lastVisiblePosition < count) {
            Object itemAtPosition = this.f278851d.getItemAtPosition(lastVisiblePosition);
            if (itemAtPosition instanceof SnsInfo) {
                SnsInfo snsInfo = (SnsInfo) itemAtPosition;
                if (snsInfo.getTypeFlag() == 15 && (!snsInfo.isAd() || C98993j.m128899a(snsInfo))) {
                    this.f278840P.add(snsInfo);
                }
            }
            lastVisiblePosition++;
        }
        ((C119157j) C119157j.f356862d).mo183875f(this.f278841Q);
        SnsMethodCalculate.markEndTimeMs("preloadVideo", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
    }

    /* renamed from: B */
    public boolean mo133026B(int i, int i2) {
        int i3;
        int i4 = i;
        int i5 = i2;
        Class cls = C32735h.class;
        SnsMethodCalculate.markStartTimeMs("selectPhoto", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        C86709a0.m107528h();
        boolean z = false;
        if (!C86709a0.m107535s().mo121147n()) {
            C76912y0.m92771j(this.f278867w, (View) null);
            SnsMethodCalculate.markEndTimeMs("selectPhoto", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
            return false;
        }
        Log.m105918d("MicroMsg.SnsActivity", "selectPhoto " + i4);
        if (i4 == 2) {
            Intent intent = new Intent();
            intent.putExtra("username", this.f278843S);
            intent.setClass(this.f278867w, SettingSnsBackgroundUI.class);
            Activity activity = this.f278867w;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(7);
            aVar.mo10233c(intent);
            C117292a.m165364j(activity, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsUIAction", "selectPhoto", "(II)Z", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
            SnsMethodCalculate.markEndTimeMs("selectPhoto", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
            return true;
        }
        if (i4 == 1) {
            C86709a0.m107528h();
            int nullAs = Util.nullAs((Integer) C86709a0.m107535s().mo121142i().mo119684e(68385, (Object) null), 0);
            C86709a0.m107528h();
            int nullAs2 = Util.nullAs((Integer) C86709a0.m107535s().mo121142i().mo119684e(68386, (Object) null), 0);
            if (!this.f278862r && nullAs < 3 && nullAs2 == 0) {
                this.f278862r = true;
                C43098a8.m46711a(this.f278867w, new C30465b(i4, i5));
                SnsMethodCalculate.markEndTimeMs("selectPhoto", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
                return true;
            } else if (this.f278867w.getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0).getString("gallery", "1").equalsIgnoreCase("0")) {
                C96892t1.m124464d(this.f278867w, 2, 1, 0, (Intent) null, true);
            } else {
                int b = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("SnsCanPickVideoFromAlbum", 1);
                Log.m105925i("MicroMsg.SnsActivity", "takeVideo %d", Integer.valueOf(b));
                boolean z2 = C90188n0.f258933a;
                int i6 = (b != 1 && b == 0) ? 1 : 3;
                Intent intent2 = new Intent();
                boolean wf = ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_sns_enable_vlog, false);
                boolean a = ((C58247e) C86312j.m106911c(C58247e.class)).ni0().mo72159a();
                Log.m105925i("MicroMsg.SnsActivity", "enableSnsTemplate:%b", Boolean.valueOf(a));
                if (a) {
                    int Qe = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_sns_publish_template_media_num, 20);
                    Log.m105924i("MicroMsg.SnsTemplateExptConfig", "getPublishTemplateMediaNum: " + Qe);
                    i3 = Qe;
                } else {
                    i3 = 9;
                }
                if (C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_TOP_STORY_VLOG_ENABLE_INT, 0) == 1 || wf || a) {
                    z = true;
                }
                intent2.putExtra("key_can_select_video_and_pic", !z);
                intent2.putExtra("key_edit_video_max_time_length", C102609h.Fx0().Gx0().f267170h);
                intent2.putExtra("key_sns_publish_template", a);
                intent2.putExtra("key_filter_hdr_video", a);
                if (this.f278867w instanceof SnsUserUI) {
                    intent2.putExtra("gallery_report_tag", 17);
                } else {
                    intent2.putExtra("gallery_report_tag", 4);
                }
                intent2.putExtra("key_check_third_party_video", true);
                intent2.putExtra("KSnsFrom", i5);
                intent2.putExtra("record_video_is_sight_capture", true);
                C96892t1.m124463c(this.f278867w, 14, i3, 4, i6, SnsTimeLineUI.m122313w8(), intent2);
                if (SnsTimeLineUI.m122313w8()) {
                    this.f278867w.overridePendingTransition(C0966R.C0968anim.f2471dv, C0966R.C0968anim.f2333y);
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("selectPhoto", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        return true;
    }

    /* renamed from: C */
    public void mo133027C(View view) {
        SnsMethodCalculate.markStartTimeMs("setActionbarView", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        this.actionbarView = view;
        SnsMethodCalculate.markEndTimeMs("setActionbarView", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
    }

    /* renamed from: D */
    public void mo133028D(boolean z) {
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        SnsMethodCalculate.markStartTimeMs("switchPullDownMode", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        Log.m105925i("MicroMsg.SnsActivity", "switchPullDownMode %b", Boolean.valueOf(z));
        this.f278837L = z;
        if (z) {
            MMOverScrollView mMOverScrollView = this.f278852e;
            if (mMOverScrollView != null) {
                mMOverScrollView.setEnableGesture(false);
            }
            SnsHeader snsHeader = this.f278860p;
            snsHeader.getClass();
            SnsMethodCalculate.markStartTimeMs("switchPullDownMode", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            SnsHeader.C95546j jVar = snsHeader.f278099d;
            if (!(jVar == null || (linearLayout2 = jVar.f278134i) == null || jVar.f278133h == null)) {
                linearLayout2.setVisibility(0);
                snsHeader.f278099d.f278133h.setVisibility(8);
            }
            SnsMethodCalculate.markEndTimeMs("switchPullDownMode", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        } else {
            MMOverScrollView mMOverScrollView2 = this.f278852e;
            if (mMOverScrollView2 != null) {
                mMOverScrollView2.setEnableGesture(true);
            }
            SnsHeader snsHeader2 = this.f278860p;
            snsHeader2.getClass();
            SnsMethodCalculate.markStartTimeMs("switchHeaderMode", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            SnsHeader.C95546j jVar2 = snsHeader2.f278099d;
            if (!(jVar2 == null || (linearLayout = jVar2.f278134i) == null || jVar2.f278133h == null)) {
                linearLayout.setVisibility(4);
                snsHeader2.f278099d.f278133h.setVisibility(0);
            }
            SnsMethodCalculate.markEndTimeMs("switchHeaderMode", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        }
        SnsMethodCalculate.markEndTimeMs("switchPullDownMode", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
    }

    public ListView getSnsListView() {
        SnsMethodCalculate.markStartTimeMs("getSnsListView", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        ListView j = this.f278868x.mo132994j();
        SnsMethodCalculate.markEndTimeMs("getSnsListView", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        return j;
    }

    /* renamed from: h */
    public boolean mo133030h() {
        SnsMethodCalculate.markStartTimeMs("bottomLoadData", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        Log.m105921e("MicroMsg.SnsActivity", "bottomLoad  isAll: %s, isLoading:%s", Boolean.valueOf(this.f278863s), Boolean.valueOf(this.f278864t));
        if (!this.f278863s && this.f278864t) {
            Log.m105925i("MicroMsg.SnsActivity", "bottomLoadData: stack=%s", Util.getStack());
            this.f278838M = true;
        }
        if (!this.f278863s && !this.f278864t) {
            this.f278864t = true;
            this.f278838M = false;
            SnsMethodCalculate.markStartTimeMs("loadingMore", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
            Log.m105924i("MicroMsg.SnsActivity", "loadingMore: ");
            this.f278868x.mo132987e();
            SnsMethodCalculate.markEndTimeMs("loadingMore", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        }
        SnsMethodCalculate.markEndTimeMs("bottomLoadData", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        return true;
    }

    /* renamed from: i */
    public void mo133031i(ListView listView) {
        int i;
        SnsMethodCalculate.markStartTimeMs("checkSphereImageCompActiveItem", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        try {
            long currentTimeMillis = System.currentTimeMillis();
            ArrayList<C95933n.C95941e> arrayList = this.f278842R;
            if (arrayList != null) {
                arrayList.clear();
            }
            int height = listView.getHeight();
            Rect rect = new Rect();
            View view = this.actionbarView;
            if (view != null) {
                view.getGlobalVisibleRect(rect);
                i = rect.bottom;
            } else {
                i = 0;
            }
            int childCount = listView.getChildCount();
            int i2 = -1;
            int i3 = -1;
            for (int i4 = 0; i4 < childCount; i4++) {
                Object tag = listView.getChildAt(i4).getTag();
                if (tag instanceof C95933n.C95941e) {
                    C95933n.C95941e eVar = (C95933n.C95941e) tag;
                    if (eVar.f279965k0 instanceof C95933n) {
                        if (this.f278842R == null) {
                            this.f278842R = new ArrayList<>();
                        }
                        this.f278842R.add(eVar);
                        eVar.f280128I0.getGlobalVisibleRect(rect);
                        if (rect.top < i) {
                            rect.top = i;
                        }
                        if (rect.top > height) {
                            rect.top = height;
                        }
                        if (rect.bottom < i) {
                            rect.bottom = i;
                        }
                        if (rect.bottom > height) {
                            rect.bottom = height;
                        }
                        int abs = Math.abs(rect.bottom - rect.top);
                        if (abs >= i3) {
                            i2 = this.f278842R.size() - 1;
                            i3 = abs;
                        }
                    }
                }
            }
            ArrayList<C95933n.C95941e> arrayList2 = this.f278842R;
            if (arrayList2 != null && arrayList2.size() > 0 && i2 >= 0) {
                for (int i5 = 0; i5 < this.f278842R.size(); i5++) {
                    C95933n.C95941e eVar2 = this.f278842R.get(i5);
                    C95933n nVar = (C95933n) eVar2.f279965k0;
                    if (i5 == i2) {
                        nVar.mo133462C(eVar2.f280128I0, false);
                    } else {
                        nVar.mo133462C(eVar2.f280128I0, true);
                    }
                }
                int i6 = 0;
                long currentTimeMillis2 = System.currentTimeMillis();
                StringBuilder sb = new StringBuilder();
                sb.append("checkSphereImageCompItem cost=");
                sb.append(currentTimeMillis2 - currentTimeMillis);
                sb.append(", maxVisiableItemIdx=");
                sb.append(i2);
                sb.append(", size=");
                ArrayList<C95933n.C95941e> arrayList3 = this.f278842R;
                if (arrayList3 != null) {
                    i6 = arrayList3.size();
                }
                sb.append(i6);
                Log.m105918d("MicroMsg.SnsActivitySphereImageView", sb.toString());
            }
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.SnsActivitySphereImageView", "checkSphereImageCompItem exp=" + th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("checkSphereImageCompActiveItem", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
    }

    /* renamed from: j */
    public final void mo133032j(Intent intent) {
        SnsMethodCalculate.markStartTimeMs("doSightCapture", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        SightCaptureResult sightCaptureResult = (SightCaptureResult) intent.getParcelableExtra("key_req_result");
        if (sightCaptureResult == null) {
            SnsMethodCalculate.markEndTimeMs("doSightCapture", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
            return;
        }
        if (sightCaptureResult.f201515e) {
            String str = sightCaptureResult.f201523p;
            this.f278858n = str;
            if (!Util.isNullOrNil(str)) {
                this.f278865u = true;
                mo133037o(intent);
            }
        } else {
            if (this.f278867w instanceof SnsTimeLineUI) {
                C57354l.f164333a.mo80968e(true);
            }
            Log.m105925i("MicroMsg.SnsActivity", "video path %s thumb path ", sightCaptureResult.f201517g, sightCaptureResult.f201518h);
            Intent intent2 = new Intent();
            intent2.putExtra("KSightPath", sightCaptureResult.f201517g);
            intent2.putExtra("KSightThumbPath", sightCaptureResult.f201518h);
            intent2.putExtra("key_extra_data", intent.getBundleExtra("key_extra_data"));
            if (!Util.isNullOrNil(sightCaptureResult.f201520j)) {
                intent2.putExtra("sight_md5", sightCaptureResult.f201520j);
            } else {
                intent2.putExtra("sight_md5", C86013q1.m106456q(sightCaptureResult.f201517g));
            }
            intent2.putExtra("KSnsPostManu", true);
            intent2.putExtra("KSnsFrom", 17);
            intent2.putExtra("KTouchCameraTime", Util.nowSecond());
            intent2.putExtra("Ksnsupload_type", 14);
            intent2.putExtra("Kis_take_photo", false);
            intent2.putExtra("KSessionID", intent.getStringExtra("KSessionID"));
            C94942r1.f275179a.mo131224c(sightCaptureResult.f201517g, intent.getBundleExtra("key_extra_data"), "key_edit_safe_strategy_emotion_info_list");
            try {
                byte[] byteArray = sightCaptureResult.f201522o.toByteArray();
                if (byteArray != null) {
                    intent2.putExtra("KMMSightExtInfo", byteArray);
                }
            } catch (Exception e) {
                Log.m105925i("MicroMsg.SnsActivity", "put sight extinfo to snsuploadui error: %s", e.getMessage());
            }
            C88144b.m109791i(this.f278867w, "sns", ".ui.SnsUploadUI", intent2, (Bundle) null);
        }
        SnsMethodCalculate.markEndTimeMs("doSightCapture", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
    }

    /* renamed from: k */
    public final BaseAdapter mo133033k() {
        SnsMethodCalculate.markStartTimeMs("getAdapter", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        Activity activity = this.f278867w;
        if (activity == null || this.f278860p == null || this.actionbarView == null) {
            SnsMethodCalculate.markEndTimeMs("getAdapter", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
            return null;
        } else if (!(activity instanceof SnsTimeLineUI)) {
            SnsMethodCalculate.markEndTimeMs("getAdapter", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
            return null;
        } else {
            SnsTimeLineUI snsTimeLineUI = (SnsTimeLineUI) activity;
            snsTimeLineUI.getClass();
            SnsMethodCalculate.markStartTimeMs("getAdapter", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
            C97979c cVar = snsTimeLineUI.f278699y;
            SnsMethodCalculate.markEndTimeMs("getAdapter", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
            SnsMethodCalculate.markEndTimeMs("getAdapter", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
            return cVar;
        }
    }

    /* renamed from: l */
    public boolean mo133034l() {
        SnsMethodCalculate.markStartTimeMs("isAtBottom", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        ListView listView = this.f278851d;
        View childAt = listView.getChildAt(listView.getChildCount() - 1);
        if (childAt == null || childAt.getBottom() > this.f278851d.getHeight() || this.f278851d.getLastVisiblePosition() != this.f278851d.getAdapter().getCount() - 1) {
            SnsMethodCalculate.markEndTimeMs("isAtBottom", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
            return false;
        }
        SnsMethodCalculate.markEndTimeMs("isAtBottom", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        return true;
    }

    /* renamed from: m */
    public boolean mo133035m() {
        SnsMethodCalculate.markStartTimeMs("isAtTop", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        View childAt = this.f278851d.getChildAt(0);
        if (childAt != null && childAt.getTop() == 0 && this.f278851d.getFirstVisiblePosition() == 0) {
            SnsMethodCalculate.markEndTimeMs("isAtTop", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
            return true;
        }
        SnsMethodCalculate.markEndTimeMs("isAtTop", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        return false;
    }

    /* renamed from: n */
    public boolean mo133036n() {
        SnsMethodCalculate.markStartTimeMs("isPullDownMode", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        boolean z = this.f278837L;
        SnsMethodCalculate.markEndTimeMs("isPullDownMode", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        return z;
    }

    /* renamed from: o */
    public final void mo133037o(Intent intent) {
        SnsMethodCalculate.markStartTimeMs("jumpToUploadUI", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        new MMHandler(Looper.getMainLooper()).post(new C57390a(this));
        Log.m105918d("MicroMsg.SnsActivity", "onActivityResult CONTEXT_CHOSE_IMAGE_CONFIRM");
        Log.m105918d("MicroMsg.SnsActivity", "CONTEXT_CHOSE_IMAGE_CONFIRM filePath " + this.f278858n);
        String str = this.f278858n;
        if (str == null) {
            SnsMethodCalculate.markEndTimeMs("jumpToUploadUI", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
            return;
        }
        C98453h hVar = C98453h.f288774a;
        hVar.mo137820r(str);
        StringBuilder sb = new StringBuilder();
        sb.append("pre_temp_sns_pic");
        sb.append(C90193h.m112878f((this.f278858n + System.currentTimeMillis()).getBytes()));
        String sb4 = sb.toString();
        C100408j0.m131382Ow(C94866e1.m120263iU(), this.f278858n, sb4);
        hVar.mo137811i(this.f278858n);
        this.f278858n = C94866e1.m120263iU() + sb4;
        Log.m105918d("MicroMsg.SnsActivity", "newPath " + this.f278858n);
        int intExtra = intent != null ? intent.getIntExtra("CropImage_filterId", 0) : 0;
        Intent intent2 = new Intent(this.f278867w, SnsUploadUI.class);
        intent2.putExtra("KSnsPostManu", true);
        intent2.putExtra("KTouchCameraTime", Util.nowSecond());
        C91998s sVar = this.f278848X;
        if (sVar != null) {
            sVar.mo125842g(intent2);
            this.f278848X = null;
        }
        intent2.putExtra("sns_kemdia_path", this.f278858n);
        intent2.putExtra("KFilterId", intExtra);
        if (this.f278865u) {
            intent2.putExtra("Kis_take_photo", true);
            intent2.putExtra("KSnsFrom", 17);
        }
        if (this.f278847W) {
            intent2.putExtra("Ksnsupload_source", 11);
        }
        intent2.putExtra("KSessionID", intent.getStringExtra("KSessionID"));
        intent2.putExtra("key_extra_data", intent.getBundleExtra("key_extra_data"));
        Activity activity = this.f278867w;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(6);
        aVar.mo10233c(intent2);
        C117292a.m165364j(activity, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsUIAction", "jumpToUploadUI", "(Landroid/content/Intent;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        this.f278865u = false;
        SnsMethodCalculate.markEndTimeMs("jumpToUploadUI", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
    }

    public void onImageFinish(String str, boolean z) {
        SnsMethodCalculate.markStartTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        if (this.f278868x.getType() == 1) {
            Log.m105925i("MicroMsg.SnsActivity", "[%s][media:%s]SnsUIAction ext notifyDataSetChanged", "[image-flow]", str);
            ListView listView = this.f278851d;
            if (!(listView == null || listView.getAdapter() == null || !(this.f278851d.getAdapter() instanceof C97979c))) {
                ((C97979c) this.f278851d.getAdapter()).notifyDataSetChanged();
            }
        }
        SnsMethodCalculate.markEndTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
    }

    public void onPostEnd(int i, boolean z) {
        SnsMethodCalculate.markStartTimeMs("onPostEnd", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        this.f278868x.onPostEnd(i, z);
        SnsMethodCalculate.markEndTimeMs("onPostEnd", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
    }

    public void onSetbg() {
        SnsMethodCalculate.markStartTimeMs("onSetbg", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        SnsMethodCalculate.markEndTimeMs("onSetbg", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
    }

    public void onSightFinish(String str, boolean z) {
        SnsMethodCalculate.markStartTimeMs("onSightFinish", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        SnsMethodCalculate.markEndTimeMs("onSightFinish", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
    }

    public void onThumbFinish(String str) {
        SnsMethodCalculate.markStartTimeMs("onThumbFinish", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        C97535h hVar = C97535h.f286229a;
        SnsMethodCalculate.markStartTimeMs("setMediaIdToPredictAfterLoadThumb", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
        C87412m.m108594g(str, "mediaId");
        C31280k kVar = C31280k.f83760a;
        if (kVar.mo58046a()) {
            boolean z = true;
            if (kVar.mo58048c() == 1) {
                Log.m105924i("MicroMsg.SnsKaraOptionConfig", "setMediaIdToPredictAfterLoadThumb " + str);
                HashSet<String> hashSet = C97535h.f286233e;
                if (hashSet.contains(str)) {
                    Log.m105924i("MicroMsg.SnsKaraOptionConfig", "media is predicted");
                    SnsMethodCalculate.markEndTimeMs("setMediaIdToPredictAfterLoadThumb", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
                } else {
                    hashSet.add(str);
                    String str2 = C97535h.f286232d.get(str);
                    if (!(str2 == null || str2.length() == 0)) {
                        z = false;
                    }
                    if (z) {
                        Log.m105920e("MicroMsg.SnsKaraOptionConfig", "mediaIdToSnsId no have sns " + str);
                        SnsMethodCalculate.markEndTimeMs("setMediaIdToPredictAfterLoadThumb", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
                    } else {
                        C53895h.m60466d(C53930o0.m60555b(), C53872d1.f151119c, (C53934p0) null, new C97538i(str2, (C15601d<? super C97538i>) null), 2, (Object) null);
                        SnsMethodCalculate.markEndTimeMs("setMediaIdToPredictAfterLoadThumb", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
                    }
                }
                SnsMethodCalculate.markEndTimeMs("onThumbFinish", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
            }
        }
        Log.m105924i("MicroMsg.SnsKaraOptionConfig", "setMediaIdToPredictAfterLoadThumb >> is no to predict");
        SnsMethodCalculate.markEndTimeMs("setMediaIdToPredictAfterLoadThumb", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
        SnsMethodCalculate.markEndTimeMs("onThumbFinish", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
    }

    /* renamed from: p */
    public void mo133038p() {
        SnsMethodCalculate.markStartTimeMs("loadSnsUserDateInfo", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        C95669n nVar = this.f278868x;
        if (nVar != null && nVar.getType() == 2) {
            C94866e1.my0().post(new C95659c());
        }
        SnsMethodCalculate.markEndTimeMs("loadSnsUserDateInfo", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
    }

    /* renamed from: q */
    public void mo133039q(int i, int i2, Intent intent) {
        int i3;
        int i4 = i;
        int i5 = i2;
        Intent intent2 = intent;
        SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        Log.m105924i("MicroMsg.SnsActivity", "onAcvityResult requestCode:" + i4);
        if (i4 == 17 || i4 == 14) {
            C57354l.C57355a aVar = C57354l.f164333a;
            aVar.mo80965b(i4);
            if (i5 != -1) {
                C60960c.f173618a.mo85927k("SnsPublishProcess", "opresult_", 4, C60242i.DEFAULT);
                aVar.mo80976m(0, i4 == 17, i4 == 14, false, false, false, false, false, false);
                aVar.mo80966c((String) null);
            }
        }
        if (i5 != -1) {
            if (i4 == 5 || i4 == 2 || i4 == 4) {
                new MMHandler(Looper.getMainLooper()).post(new C57391k(this));
                C102236a0.m134756m();
            }
            SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
            return;
        }
        switch (i4) {
            case 2:
                if (intent2 != null) {
                    C86709a0.m107528h();
                    int nullAs = Util.nullAs((Integer) C86709a0.m107535s().mo121142i().mo119684e(68393, (Object) null), 0);
                    C86709a0.m107528h();
                    C86709a0.m107535s().mo121142i().mo119676J(68393, Integer.valueOf(nullAs + 1));
                    Intent intent3 = new Intent();
                    intent3.putExtra("CropImageMode", 4);
                    intent3.putExtra("CropImage_Filter", true);
                    intent3.putExtra("CropImage_DirectlyIntoFilter", true);
                    ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93179l(this.f278867w, intent, intent3, C94866e1.m120263iU(), 4, new C95668l());
                    break;
                } else {
                    SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
                    return;
                }
            case 4:
                if (intent2 != null) {
                    this.f278858n = intent2.getStringExtra("CropImage_OutputPath");
                    mo133037o(intent2);
                    break;
                } else {
                    SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
                    return;
                }
            case 5:
                this.f278858n = C96892t1.m124462b(this.f278867w.getApplicationContext(), intent2, C94866e1.m120263iU());
                Log.m105918d("MicroMsg.SnsActivity", "onActivityResult CONTEXT_TAKE_PHOTO  filePath" + this.f278858n);
                if (this.f278858n != null) {
                    C86709a0.m107528h();
                    int nullAs2 = Util.nullAs((Integer) C86709a0.m107535s().mo121142i().mo119684e(68392, (Object) null), 0);
                    C86709a0.m107528h();
                    C86709a0.m107535s().mo121142i().mo119676J(68392, Integer.valueOf(nullAs2 + 1));
                    this.f278865u = true;
                    mo133037o(intent2);
                    break;
                } else {
                    SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
                    return;
                }
            case 6:
                Log.m105918d("MicroMsg.SnsActivity", "onActivityResult CONTEXT_UPLOAD_MEDIA");
                if (intent2 != null) {
                    this.f278868x.mo132986d(false, intent2.getIntExtra("sns_local_id", -1), (List<Integer>) null, (List<Integer>) null);
                    C94866e1.gy0().mo131192c();
                    break;
                } else {
                    SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
                    return;
                }
            case 7:
                Log.m105918d("MicroMsg.SnsActivity", "onActivityResult CONTEXT_CHANGE_BG");
                C94866e1.gy0().mo131192c();
                break;
            case 8:
                if (intent2 != null) {
                    Log.m105918d("MicroMsg.SnsActivity", "onActivityResult CONTEXT_GALLERY_OP");
                    SnsCmdList snsCmdList = (SnsCmdList) intent2.getParcelableExtra("sns_cmd_list");
                    if (snsCmdList != null) {
                        C95669n nVar = this.f278868x;
                        SnsMethodCalculate.markStartTimeMs("getRemoves", "com.tencent.mm.plugin.sns.data.SnsCmdList");
                        List<Integer> list = snsCmdList.f274672f;
                        SnsMethodCalculate.markEndTimeMs("getRemoves", "com.tencent.mm.plugin.sns.data.SnsCmdList");
                        SnsMethodCalculate.markStartTimeMs("getChanges", "com.tencent.mm.plugin.sns.data.SnsCmdList");
                        List<Integer> list2 = snsCmdList.f274673g;
                        SnsMethodCalculate.markEndTimeMs("getChanges", "com.tencent.mm.plugin.sns.data.SnsCmdList");
                        nVar.mo132986d(false, -1, list, list2);
                        break;
                    }
                } else {
                    SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
                    return;
                }
                break;
            case 9:
                C94866e1.gy0().mo131192c();
                ListView listView = this.f278851d;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(listView);
                Object obj = new Object();
                C117292a.m165358d(obj, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsUIAction", "onActivityResult", "(IILandroid/content/Intent;)V", "com/tencent/mm/sdk/platformtools/BackwardSupportUtil$SmoothScrollFactory_EXEC_", "scrollToTop", "(Landroid/widget/ListView;)V");
                BackwardSupportUtil.SmoothScrollFactory.scrollToTop((ListView) aVar2.mo10231a(0));
                C117292a.m165359e(obj, "com/tencent/mm/plugin/sns/ui/SnsUIAction", "onActivityResult", "(IILandroid/content/Intent;)V", "com/tencent/mm/sdk/platformtools/BackwardSupportUtil$SmoothScrollFactory_EXEC_", "scrollToTop", "(Landroid/widget/ListView;)V");
                break;
            case 10:
                if (intent2 != null) {
                    if (i5 == -1) {
                        Cursor managedQuery = this.f278867w.managedQuery(intent.getData(), (String[]) null, (String) null, (String[]) null, (String) null);
                        if (managedQuery.moveToFirst()) {
                            Intent intent4 = new Intent("android.intent.action.EDIT", Uri.parse("content://com.android.contacts/contacts/" + managedQuery.getString(managedQuery.getColumnIndexOrThrow("_id"))));
                            Activity activity = this.f278867w;
                            C9556a aVar3 = new C9556a();
                            aVar3.mo10233c(intent4);
                            Activity activity2 = activity;
                            C117292a.m165358d(activity2, aVar3.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsUIAction", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            activity.startActivity((Intent) aVar3.mo10231a(0));
                            C117292a.m165359e(activity2, "com/tencent/mm/plugin/sns/ui/SnsUIAction", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            break;
                        }
                    }
                } else {
                    SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
                    return;
                }
                break;
            case 12:
                int intExtra = intent2.getIntExtra("sns_gallery_op_id", -1);
                if (intExtra > 0) {
                    Log.m105918d("MicroMsg.SnsActivity", "notify cause by del item");
                    SnsCmdList snsCmdList2 = new SnsCmdList();
                    snsCmdList2.mo130689a(intExtra);
                    C95669n nVar2 = this.f278868x;
                    SnsMethodCalculate.markStartTimeMs("getRemoves", "com.tencent.mm.plugin.sns.data.SnsCmdList");
                    List<Integer> list3 = snsCmdList2.f274672f;
                    SnsMethodCalculate.markEndTimeMs("getRemoves", "com.tencent.mm.plugin.sns.data.SnsCmdList");
                    SnsMethodCalculate.markStartTimeMs("getChanges", "com.tencent.mm.plugin.sns.data.SnsCmdList");
                    List<Integer> list4 = snsCmdList2.f274673g;
                    SnsMethodCalculate.markEndTimeMs("getChanges", "com.tencent.mm.plugin.sns.data.SnsCmdList");
                    nVar2.mo132986d(false, -1, list3, list4);
                    break;
                }
                break;
            case 13:
                C94866e1.Tx0().mo139894bF();
                break;
            case 14:
                C57354l.C57355a aVar4 = C57354l.f164333a;
                aVar4.mo80969f(this.f278867w);
                Intent intent5 = new Intent(this.f278867w, SnsUploadUI.class);
                intent5.putExtra("KSnsFrom", 14);
                if (!intent2.getBooleanExtra("isSightCapture", false)) {
                    new MMHandler(Looper.getMainLooper()).post(new C57392m(this));
                    ArrayList<String> stringArrayListExtra = intent2.getStringArrayListExtra("key_select_video_list");
                    C102236a0.m134781y0(intent2.getStringExtra("KSEGMENTMEDIAEDITID"));
                    if ((stringArrayListExtra != null && stringArrayListExtra.size() > 0) || !Util.isNullOrNil(intent2.getStringExtra("K_SEGMENTVIDEOPATH"))) {
                        String stringExtra = (stringArrayListExtra == null || stringArrayListExtra.size() <= 0) ? intent2.getStringExtra("K_SEGMENTVIDEOPATH") : stringArrayListExtra.get(0);
                        String stringExtra2 = intent2.getStringExtra("KSEGMENTVIDEOTHUMBPATH");
                        if (Util.isNullOrNil(stringExtra2) || !C86013q1.m106450k(stringExtra2)) {
                            String str = C94866e1.m120263iU() + C86013q1.m106456q(stringExtra);
                            C89231c cVar = new C89231c();
                            try {
                                cVar.setDataSource(stringExtra);
                                Bitmap frameAtTime = cVar.getFrameAtTime(0);
                                if (frameAtTime == null) {
                                    Log.m105920e("MicroMsg.SnsActivity", "get bitmap error");
                                    try {
                                        cVar.release();
                                    } catch (Exception unused) {
                                    }
                                    SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
                                    return;
                                }
                                Log.m105925i("MicroMsg.SnsActivity", "getBitmap1 %d %d", Integer.valueOf(frameAtTime.getWidth()), Integer.valueOf(frameAtTime.getHeight()));
                                BitmapUtil.saveBitmapToImage(frameAtTime, 80, Bitmap.CompressFormat.JPEG, str, true);
                                BitmapFactory.Options imageOptions = BitmapUtil.getImageOptions(str);
                                Log.m105925i("MicroMsg.SnsActivity", "getBitmap2 %d %d", Integer.valueOf(imageOptions.outWidth), Integer.valueOf(imageOptions.outHeight));
                                try {
                                    cVar.release();
                                } catch (Exception unused2) {
                                }
                                stringExtra2 = str;
                            } catch (Exception e) {
                                Log.m105921e("MicroMsg.SnsActivity", "savebitmap error %s", e.getMessage());
                            } catch (Throwable th) {
                                try {
                                    cVar.release();
                                } catch (Exception unused3) {
                                }
                                SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
                                throw th;
                            }
                        }
                        Log.m105925i("MicroMsg.SnsActivity", "video path %s thumb path %s and %s %s ", stringExtra, stringExtra2, Long.valueOf(C86013q1.m106451l(stringExtra)), Long.valueOf(C86013q1.m106451l(stringExtra2)));
                        Intent intent6 = intent;
                        intent5.putExtra("key_extra_data", intent6.getBundleExtra("key_extra_data"));
                        intent5.putExtra("KSightPath", stringExtra);
                        intent5.putExtra("KSightThumbPath", stringExtra2);
                        intent5.putExtra("sight_md5", C86013q1.m106456q(stringExtra));
                        intent5.putExtra("KSnsPostManu", true);
                        intent5.putExtra("KTouchCameraTime", Util.nowSecond());
                        intent5.putExtra("Ksnsupload_type", 14);
                        intent5.putExtra("KSnsVideoTempalteInfo", intent6.getByteArrayExtra("key_video_template_info"));
                        if (intent6.hasExtra("key_extra_data")) {
                            Bundle bundleExtra = intent6.getBundleExtra("key_extra_data");
                            if (bundleExtra != null && bundleExtra.containsKey("key_composition_info")) {
                                intent5.putExtra("key_composition_info", bundleExtra.getByteArray("key_composition_info"));
                            }
                            C94942r1.f275179a.mo131224c(stringExtra, bundleExtra, "key_edit_safe_strategy_emotion_info_list");
                        }
                        intent5.putExtra("Kis_take_photo", false);
                        C46075u.f124225a.mo71513a(intent5, intent6);
                        Activity activity3 = this.f278867w;
                        C9556a aVar5 = new C9556a();
                        aVar5.mo10233c(intent5);
                        Activity activity4 = activity3;
                        C117292a.m165358d(activity4, aVar5.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsUIAction", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        activity3.startActivity((Intent) aVar5.mo10231a(0));
                        C117292a.m165359e(activity4, "com/tencent/mm/plugin/sns/ui/SnsUIAction", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        break;
                    } else {
                        ArrayList<String> stringArrayListExtra2 = intent2.getStringArrayListExtra("CropImage_OutputPath_List");
                        if (stringArrayListExtra2 != null && stringArrayListExtra2.size() != 0) {
                            aVar4.mo80967d(stringArrayListExtra2);
                            ArrayList arrayList = new ArrayList();
                            Iterator<String> it = stringArrayListExtra2.iterator();
                            while (it.hasNext()) {
                                String next = it.next();
                            }
                            this.f278865u = intent2.getBooleanExtra("isTakePhoto", false);
                            intent5.putExtra("KSnsPostManu", true);
                            intent5.putExtra("KTouchCameraTime", Util.nowSecond());
                            C91998s sVar = this.f278848X;
                            if (sVar != null) {
                                sVar.mo125842g(intent5);
                                this.f278848X = null;
                            }
                            if (this.f278847W) {
                                intent5.putExtra("Ksnsupload_source", 11);
                            }
                            int intExtra2 = intent2.getIntExtra("CropImage_filterId", 0);
                            intent5.putExtra("sns_kemdia_path_list", stringArrayListExtra2);
                            intent5.putExtra("KFilterId", intExtra2);
                            if (this.f278865u) {
                                i3 = 1;
                                intent5.putExtra("Kis_take_photo", true);
                            } else {
                                i3 = 1;
                            }
                            intent5.putStringArrayListExtra("sns_media_latlong_list", arrayList);
                            Object[] objArr = new Object[i3];
                            objArr[0] = Integer.valueOf(intent5.getIntExtra("Ksnsupload_type", -1));
                            Log.m105919d("MicroMsg.SnsActivity", "shared type %d", objArr);
                            Activity activity5 = this.f278867w;
                            C9556a aVar6 = new C9556a();
                            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                            aVar6.mo10233c(6);
                            aVar6.mo10233c(intent5);
                            C117292a.m165364j(activity5, aVar6.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsUIAction", "onActivityResult", "(IILandroid/content/Intent;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
                            break;
                        } else {
                            Log.m105924i("MicroMsg.SnsActivity", "no image selected");
                            SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
                            return;
                        }
                    }
                } else {
                    mo133032j(intent2);
                    break;
                }
                break;
            case 15:
                break;
            case 17:
                mo133032j(intent2);
                break;
            default:
                Log.m105920e("MicroMsg.SnsActivity", "onActivityResult: not found this requestCode");
                SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
                return;
        }
        SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
    }

    /* renamed from: r */
    public boolean mo133040r() {
        SnsMethodCalculate.markStartTimeMs("onBackPressed", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        SnsHeader snsHeader = this.f278860p;
        boolean z = false;
        if (snsHeader != null) {
            snsHeader.getClass();
            SnsMethodCalculate.markStartTimeMs("onBackPressed", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            SnsCoverContainerLayout snsCoverContainerLayout = snsHeader.f278099d.f278137l;
            if (snsCoverContainerLayout == null || snsCoverContainerLayout.getStatus().f295360a) {
                SnsMethodCalculate.markEndTimeMs("onBackPressed", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            } else {
                snsHeader.f278116x.mo137545h();
                z = true;
                SnsMethodCalculate.markEndTimeMs("onBackPressed", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            }
            SnsMethodCalculate.markEndTimeMs("onBackPressed", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
            return z;
        }
        SnsMethodCalculate.markEndTimeMs("onBackPressed", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        return false;
    }

    /* renamed from: s */
    public void mo133041s(boolean z) {
        SnsHeader.C95546j jVar;
        TextView textView;
        SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        this.f278866v = this.f278867w.getWindowManager().getDefaultDisplay().getHeight();
        C94866e1.Fx0().mo131118g0();
        View view = this.actionbarView;
        if (view != null) {
            Toolbar.LayoutParams layoutParams = (Toolbar.LayoutParams) view.getLayoutParams();
        }
        this.f278849Y = ((C76623j) C86312j.m106911c(C76623j.class)).kv0(this.f278850Z, "SnsTimelineUI", C76624k.C76625a.STRATEGY_SAMPLING);
        ListView j = this.f278868x.mo132994j();
        this.f278851d = j;
        j.post(new C95662e());
        StringBuilder sb = new StringBuilder();
        sb.append("list is null ? ");
        sb.append(this.f278851d != null);
        Log.m105924i("MicroMsg.SnsActivity", sb.toString());
        this.f278851d.setScrollingCacheEnabled(false);
        C96217s4 s4Var = new C96217s4(this.f278867w);
        this.f278860p = s4Var;
        s4Var.setSessionId(this.f278835J);
        this.f278860p.setEnterObjectId(this.f278836K);
        this.f278860p.setIsCoverPreview(!z);
        this.f278860p.setBackClickListener(new C95663f());
        this.f278856i = this.f278868x.mo132988f();
        this.f278857j = this.f278868x.getMaskView();
        this.f278859o = new LoadingMoreView(this.f278867w);
        this.f278851d.addHeaderView(this.f278860p);
        this.f278851d.addFooterView(this.f278859o);
        this.f278851d.setOnScrollListener(new C95664g());
        MMOverScrollView l = this.f278868x.mo132996l();
        this.f278852e = l;
        C98244q qVar = new C98244q(l.getViewProvider());
        this.f278853f = qVar;
        boolean z2 = this.f278834I && C36069a.f96150a.mo60517b();
        SnsMethodCalculate.markStartTimeMs("setPullDownOpen", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
        qVar.f288039d = z2;
        SnsMethodCalculate.markEndTimeMs("setPullDownOpen", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
        C98244q qVar2 = this.f278853f;
        C98244q.C98246b bVar = this.f278854g;
        qVar2.getClass();
        SnsMethodCalculate.markStartTimeMs("setOnScrollCallback", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
        qVar2.f288041f = bVar;
        SnsMethodCalculate.markEndTimeMs("setOnScrollCallback", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
        this.f278852e.setScrollConsumer(this.f278853f);
        StringBuilder sb4 = new StringBuilder();
        sb4.append("pullDownView is null ? ");
        sb4.append(this.f278852e != null);
        Log.m105924i("MicroMsg.SnsActivity", sb4.toString());
        this.f278852e.setAtBottomCallBack(new C95665h());
        this.f278852e.setAtTopCallBack(new C95666i());
        SnsMethodCalculate.markStartTimeMs("initData", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        this.f278855h = this.f278867w.getIntent().getStringExtra("sns_title");
        this.f278860p.mo132749m(Util.isNullOrNil(this.f278844T) ? this.f278843S : this.f278844T, this.f278843S, this.f278845U, this.f278846V);
        SnsHeader snsHeader = this.f278860p;
        int type = this.f278868x.getType();
        snsHeader.getClass();
        SnsMethodCalculate.markStartTimeMs("setType", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        snsHeader.f278116x = this.f278853f;
        snsHeader.f278117y = this.f278851d;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ((ViewGroup) this.f278852e.getParent()).getLayoutParams();
        if (marginLayoutParams != null) {
            snsHeader.f278099d.f278137l.setExternalMargin(marginLayoutParams.topMargin);
        }
        this.f278854g.mo137550f(new C96197r4(snsHeader));
        SnsCoverContainerLayout snsCoverContainerLayout = snsHeader.f278099d.f278137l;
        C98244q qVar3 = snsHeader.f278116x;
        qVar3.getClass();
        SnsMethodCalculate.markStartTimeMs("getPullDownOpen", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
        boolean z3 = qVar3.f288039d;
        SnsMethodCalculate.markEndTimeMs("getPullDownOpen", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
        boolean z4 = !z3;
        snsCoverContainerLayout.getClass();
        SnsMethodCalculate.markStartTimeMs("showTopMask", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
        if (!z4) {
            snsCoverContainerLayout.removeView(snsCoverContainerLayout.f274638g);
        }
        SnsMethodCalculate.markEndTimeMs("showTopMask", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
        snsHeader.f278105j = type;
        if (type == 1 && (textView = snsHeader.f278099d.f278127b) != null) {
            textView.setVisibility(8);
        }
        SnsHeader.C95546j jVar2 = snsHeader.f278099d;
        if (jVar2 != null) {
            AbsStoryHeaderTipView absStoryHeaderTipView = jVar2.f278131f;
            if (absStoryHeaderTipView != null && snsHeader.f278115w) {
                absStoryHeaderTipView.setSnsType(type);
            }
            SnsStoryHeaderView snsStoryHeaderView = snsHeader.f278099d.f278132g;
            if (snsStoryHeaderView != null && !snsHeader.f278115w) {
                snsStoryHeaderView.setSnsType(type);
            }
        }
        if (type != 1) {
            AbsStoryHeaderTipView absStoryHeaderTipView2 = snsHeader.f278099d.f278131f;
            if (!(absStoryHeaderTipView2 == null || absStoryHeaderTipView2.getParent() == null || !(snsHeader.f278099d.f278131f.getParent() instanceof ViewGroup))) {
                ((ViewGroup) snsHeader.f278099d.f278131f.getParent()).removeView(snsHeader.f278099d.f278131f);
            }
            SnsStoryHeaderView snsStoryHeaderView2 = snsHeader.f278099d.f278132g;
            if (!(snsStoryHeaderView2 == null || snsStoryHeaderView2.getParent() == null || !(snsHeader.f278099d.f278132g.getParent() instanceof ViewGroup))) {
                ((ViewGroup) snsHeader.f278099d.f278132g.getParent()).removeView(snsHeader.f278099d.f278132g);
            }
        }
        if (type == 1) {
            snsHeader.f278099d.f278134i.setPadding(0, (C75044y4.m89989a(snsHeader.f278104i) + C75044y4.m89991c(snsHeader.f278104i)) - snsHeader.getResources().getDimensionPixelSize(C0966R.dimen.aop), 0, C74942w4.m89784a(snsHeader.f278104i, 10));
        } else if (type == 2) {
            snsHeader.f278099d.f278134i.setPadding(0, C75044y4.m89989a(snsHeader.f278104i) + C75044y4.m89991c(snsHeader.f278104i) + C74942w4.m89784a(snsHeader.getContext(), 90) + C74942w4.m89784a(snsHeader.getContext(), 48), 0, 0);
        }
        if (!(type != 1 || (jVar = snsHeader.f278099d) == null || jVar.f278136k == null)) {
            SnsMethodCalculate.markStartTimeMs("checkLiveListEnable", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            SnsMethodCalculate.markEndTimeMs("checkLiveListEnable", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            snsHeader.f278099d.f278136k.setPadding(0, (int) snsHeader.f278104i.getResources().getDimension(C0966R.dimen.f3749d0), 0, 0);
            SnsStoryHeaderView snsStoryHeaderView3 = snsHeader.f278099d.f278132g;
            if (snsStoryHeaderView3 != null) {
                snsStoryHeaderView3.setTopLineVisibility(0);
            }
            Log.m105924i("MicroMsg.SnsHeader", "disable finderSnsHeader");
        }
        SnsMethodCalculate.markEndTimeMs("setType", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        this.f278860p.setActionBarView(this.f278868x.mo132984b());
        updateBackView(C94866e1.Ux0().mo139909Yt(Util.isNullOrNil(this.f278844T) ? this.f278843S : this.f278844T));
        mo133038p();
        SnsMethodCalculate.markEndTimeMs("initData", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        SnsMethodCalculate.markStartTimeMs("initDragDropEvent", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        new C71231a7(this).run();
        SnsMethodCalculate.markEndTimeMs("initDragDropEvent", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        C94866e1.gy0().mo131190a(this);
        C94866e1.Vx0().mo130978c(this);
        SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
    }

    /* renamed from: t */
    public void mo133042t() {
        SnsCoverContainerLayout snsCoverContainerLayout;
        SnsStoryHeaderView snsStoryHeaderView;
        AbsStoryHeaderTipView absStoryHeaderTipView;
        SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        SnsMethodCalculate.markStartTimeMs("reportOnDestroy", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        Activity activity = this.f278867w;
        if (activity == null || !(activity instanceof SnsTimeLineUI)) {
            SnsMethodCalculate.markEndTimeMs("reportOnDestroy", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        } else {
            ((C60200t1) C86312j.m106911c(C60200t1.class)).ui0((View) null, (Object) null, 4, -1, -1, 1, String.valueOf(61), 8, C64208c.f181961k);
            SnsMethodCalculate.markEndTimeMs("reportOnDestroy", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        }
        SnsHeader snsHeader = this.f278860p;
        if (snsHeader != null) {
            SnsMethodCalculate.markStartTimeMs("onRelease", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            SnsHeader.C95546j jVar = snsHeader.f278099d;
            if (!(jVar == null || (absStoryHeaderTipView = jVar.f278131f) == null || !snsHeader.f278115w)) {
                absStoryHeaderTipView.mo134176b();
            }
            SnsHeader.C95546j jVar2 = snsHeader.f278099d;
            if (!(jVar2 == null || (snsStoryHeaderView = jVar2.f278132g) == null || snsHeader.f278115w)) {
                SnsMethodCalculate.markStartTimeMs("destroy", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
                Log.m105924i("MicroMsg.SnsStoryHeaderView", "destroy: ");
                snsStoryHeaderView.f281297v = true;
                ((C102775d) C86312j.m106911c(C102775d.class)).e10().mo134196a(snsStoryHeaderView);
                SnsMethodCalculate.markEndTimeMs("destroy", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
            }
            SnsHeader.C95546j jVar3 = snsHeader.f278099d;
            if (!(jVar3 == null || (snsCoverContainerLayout = jVar3.f278137l) == null)) {
                SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
                Log.m105924i("MicroMsg.SnsCoverContainerLayout", '[' + snsCoverContainerLayout.hashCode() + "] onDestroy");
                AbsSnsBackPreview absSnsBackPreview = snsCoverContainerLayout.f274636e;
                if (absSnsBackPreview != null) {
                    absSnsBackPreview.onDestroy();
                }
                C100423z Ux0 = C94866e1.Ux0();
                Ux0.getClass();
                SnsMethodCalculate.markStartTimeMs("getViewModel", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
                C97367b bVar = Ux0.f294200f;
                SnsMethodCalculate.markEndTimeMs("getViewModel", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
                bVar.getClass();
                SnsMethodCalculate.markStartTimeMs("getUserCover", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel");
                C54219z<C100422y> zVar = bVar.f285849e;
                SnsMethodCalculate.markEndTimeMs("getUserCover", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel");
                zVar.removeObserver(snsCoverContainerLayout);
                C102074a aVar = snsCoverContainerLayout.f274649u;
                C100422y yVar = snsCoverContainerLayout.f274647s;
                aVar.mo141569i(yVar != null ? Boolean.valueOf(yVar.field_isLike) : null);
                snsCoverContainerLayout.f274649u.mo141571k(!snsCoverContainerLayout.f274639h.f295361b);
                SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
            }
            SnsMethodCalculate.markEndTimeMs("onRelease", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        }
        C86709a0.m107528h();
        if (C86709a0.m107523b().mo121114l()) {
            C94866e1.Fx0().mo131089I(this.f278867w);
            C94866e1.Vx0().mo130997v(this);
        }
        C86709a0.m107528h();
        if (C86709a0.m107523b().mo121114l()) {
            C94866e1.gy0().mo131202m(this);
        }
        this.f278859o.setVisibility(8);
        C71253l1.m83680a();
        C86709a0.m107528h();
        if (C86709a0.m107523b().mo121114l()) {
            C94866e1.Fx0().mo131118g0();
        }
        this.f278851d.setAdapter((ListAdapter) null);
        C102236a0.m134781y0("");
        SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
    }

    /* renamed from: u */
    public void mo133043u(String str) {
        SnsMethodCalculate.markStartTimeMs("onIsDownAll", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        Log.m105918d("MicroMsg.SnsActivity", "snsactivty onIsDownAll ");
        this.f278859o.mo132182b(0, str);
        SnsMethodCalculate.markEndTimeMs("onIsDownAll", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
    }

    public void updateBackView(C100422y yVar) {
        SnsMethodCalculate.markStartTimeMs("updateBackView", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        SnsHeader snsHeader = this.f278860p;
        if (snsHeader != null) {
            SnsMethodCalculate.markStartTimeMs("updateBackView", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            snsHeader.f278116x.mo137545h();
            snsHeader.f278102g = yVar;
            snsHeader.f278103h = yVar.field_snsBgId;
            SnsMethodCalculate.markStartTimeMs("isCoverInvalid", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            C100422y yVar2 = snsHeader.f278102g;
            boolean z = true;
            if (yVar2 == null) {
                SnsMethodCalculate.markEndTimeMs("isCoverInvalid", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            } else if (snsHeader.f278108p) {
                if (!Util.isNullOrNil(yVar2.f294195P) && !Util.isEqual(snsHeader.f278102g.f294195P, "0")) {
                    z = false;
                }
                SnsMethodCalculate.markEndTimeMs("isCoverInvalid", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            } else {
                if (yVar2.field_snsBgId != 0) {
                    z = false;
                }
                SnsMethodCalculate.markEndTimeMs("isCoverInvalid", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            }
            snsHeader.f278109q = z;
            if (z) {
                C98244q qVar = snsHeader.f278116x;
                qVar.getClass();
                SnsMethodCalculate.markStartTimeMs("setPullDownOpen", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
                qVar.f288039d = false;
                SnsMethodCalculate.markEndTimeMs("setPullDownOpen", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
            }
            snsHeader.mo132750n();
            snsHeader.f278099d.f278137l.mo130663a();
            snsHeader.f278099d.f278137l.mo130666d(yVar);
            SnsMethodCalculate.markEndTimeMs("updateBackView", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        }
        SnsMethodCalculate.markEndTimeMs("updateBackView", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
    }

    /* renamed from: v */
    public void mo133044v() {
        SnsMethodCalculate.markStartTimeMs("onIsLoading", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        Log.m105919d("MicroMsg.SnsActivity", "onIsLoading: %s", Util.getStack());
        LoadingMoreView loadingMoreView = this.f278859o;
        loadingMoreView.getClass();
        SnsMethodCalculate.markStartTimeMs("onLoading", "com.tencent.mm.plugin.sns.ui.LoadingMoreView");
        loadingMoreView.f276864f.setVisibility(0);
        loadingMoreView.f276865g.setVisibility(8);
        loadingMoreView.f276866h.setVisibility(8);
        SnsMethodCalculate.markEndTimeMs("onLoading", "com.tencent.mm.plugin.sns.ui.LoadingMoreView");
        SnsMethodCalculate.markEndTimeMs("onIsLoading", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
    }

    /* renamed from: w */
    public void mo133045w(int i, String str) {
        SnsMethodCalculate.markStartTimeMs("onIsRecent", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        Log.m105918d("MicroMsg.SnsActivity", "snsactivty onIsRecent ");
        this.f278859o.mo132182b(i, str);
        SnsMethodCalculate.markEndTimeMs("onIsRecent", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
    }

    /* renamed from: x */
    public void mo133046x() {
        SnsMethodCalculate.markStartTimeMs("onLoadingEnd", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        this.f278864t = false;
        SnsMethodCalculate.markEndTimeMs("onLoadingEnd", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
    }

    /* renamed from: y */
    public void mo133047y() {
        SnsCoverContainerLayout snsCoverContainerLayout;
        SnsStoryHeaderView snsStoryHeaderView;
        AbsStoryHeaderTipView absStoryHeaderTipView;
        SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        PauseAutoGetBigImgEvent pauseAutoGetBigImgEvent = new PauseAutoGetBigImgEvent();
        pauseAutoGetBigImgEvent.f264980d.f264981a = false;
        pauseAutoGetBigImgEvent.asyncPublish(Looper.getMainLooper());
        Log.m105918d("MicroMsg.SnsActivity", "AppAttachDownloadUI cancel pause auto download logic");
        SnsHeader snsHeader = this.f278860p;
        if (snsHeader != null) {
            snsHeader.getClass();
            SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            SnsHeader.C95546j jVar = snsHeader.f278099d;
            if (!(jVar == null || (absStoryHeaderTipView = jVar.f278131f) == null || !snsHeader.f278115w)) {
                absStoryHeaderTipView.mo134178d();
            }
            SnsHeader.C95546j jVar2 = snsHeader.f278099d;
            if (!(jVar2 == null || (snsStoryHeaderView = jVar2.f278132g) == null || snsHeader.f278115w)) {
                SnsMethodCalculate.markStartTimeMs("pause", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
                snsStoryHeaderView.f281287i = false;
                snsStoryHeaderView.f281286h = true;
                SnsMethodCalculate.markEndTimeMs("pause", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
            }
            SnsHeader.C95546j jVar3 = snsHeader.f278099d;
            if (!(jVar3 == null || (snsCoverContainerLayout = jVar3.f278137l) == null)) {
                SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
                Log.m105924i("MicroMsg.SnsCoverContainerLayout", '[' + snsCoverContainerLayout.hashCode() + "] onPause");
                AbsSnsBackPreview absSnsBackPreview = snsCoverContainerLayout.f274636e;
                if (absSnsBackPreview != null) {
                    absSnsBackPreview.onPause();
                }
                SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
            }
            SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            SnsMethodCalculate.markStartTimeMs("reportOnPause", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
            BaseAdapter k = mo133033k();
            if (k == null) {
                SnsMethodCalculate.markEndTimeMs("reportOnPause", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
            } else {
                C64208c.f181961k = this.f278860p.mo132746j(this.actionbarView);
                ((C60200t1) C86312j.m106911c(C60200t1.class)).ui0(this.f278851d, k, 3, -1, -1, 1, String.valueOf(61), 3, C64208c.f181961k);
                SnsMethodCalculate.markEndTimeMs("reportOnPause", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
            }
        }
        SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
    }

    /* renamed from: z */
    public void mo133048z() {
        SnsCoverContainerLayout snsCoverContainerLayout;
        SnsStoryHeaderView snsStoryHeaderView;
        AbsStoryHeaderTipView absStoryHeaderTipView;
        SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        C94866e1.Vx0().mo131001z(2, false);
        C87716k.f253994a = 7;
        PauseAutoGetBigImgEvent pauseAutoGetBigImgEvent = new PauseAutoGetBigImgEvent();
        pauseAutoGetBigImgEvent.f264980d.f264981a = true;
        pauseAutoGetBigImgEvent.asyncPublish(Looper.getMainLooper());
        Log.m105918d("MicroMsg.SnsActivity", "SnsActivity req pause auto download logic");
        SnsHeader snsHeader = this.f278860p;
        if (snsHeader != null) {
            SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            SnsHeader.C95546j jVar = snsHeader.f278099d;
            if (!(jVar == null || (absStoryHeaderTipView = jVar.f278131f) == null || !snsHeader.f278115w)) {
                absStoryHeaderTipView.mo134179e();
            }
            SnsHeader.C95546j jVar2 = snsHeader.f278099d;
            if (!(jVar2 == null || (snsStoryHeaderView = jVar2.f278132g) == null || snsHeader.f278115w)) {
                SnsMethodCalculate.markStartTimeMs("resume", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
                Log.m105924i("MicroMsg.SnsStoryHeaderView", "resume: ");
                snsStoryHeaderView.f281286h = false;
                ((C102775d) C86312j.m106911c(C102775d.class)).e10().mo134201f();
                snsStoryHeaderView.post(new C97381a(snsStoryHeaderView));
                SnsMethodCalculate.markEndTimeMs("resume", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
            }
            SnsHeader.C95546j jVar3 = snsHeader.f278099d;
            if (!(jVar3 == null || (snsCoverContainerLayout = jVar3.f278137l) == null)) {
                SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
                Log.m105924i("MicroMsg.SnsCoverContainerLayout", '[' + snsCoverContainerLayout.hashCode() + "] onResume");
                AbsSnsBackPreview absSnsBackPreview = snsCoverContainerLayout.f274636e;
                if (absSnsBackPreview != null) {
                    absSnsBackPreview.onResume();
                }
                SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
            }
            if (snsHeader.f278105j == 1) {
                SnsHeader.C95546j jVar4 = snsHeader.f278099d;
            }
            SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            SnsMethodCalculate.markStartTimeMs("reportOnResume", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
            BaseAdapter k = mo133033k();
            if (k == null) {
                SnsMethodCalculate.markEndTimeMs("reportOnResume", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
            } else {
                boolean j = this.f278860p.mo132746j(this.actionbarView);
                if (!j) {
                    j = C64208c.f181961k;
                }
                ((C60200t1) C86312j.m106911c(C60200t1.class)).ui0(this.f278851d, k, 2, -1, -1, 1, String.valueOf(61), 2, j);
                SnsMethodCalculate.markEndTimeMs("reportOnResume", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
            }
        }
        SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
    }
}
