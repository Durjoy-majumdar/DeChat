package com.tencent.p014mm.plugin.sns.p106ui;

import a22.C67001a;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import b22.C28250a;
import cm0.C28613b;
import com.google.android.gms.wearable.WearableStatusCodes;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.TimelineGroupUserBehaviorStruct;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.p136ui.contact.C74560s1;
import com.tencent.p014mm.p136ui.widget.listview.AnimatedExpandableListView;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.C82086j;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiSetAudioState;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.model.C43039l0;
import com.tencent.p014mm.plugin.sns.model.C94847c1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import ev2.C97753a;
import ev2.a$$c;
import f40.C86709a0;
import h81.C32735h;
import i21.C60242i;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import k21.C60960c;
import ke3.C88144b;
import nj3.C76879j;
import ob0.C11385n;
import qo3.C77426q;
import qo3.C89779i0;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsLabelUI */
public class SnsLabelUI extends MMActivity implements C11385n {

    /* renamed from: C */
    public static final /* synthetic */ int f278212C = 0;

    /* renamed from: A */
    public ArrayList<Long> f278213A;

    /* renamed from: B */
    public ArrayList<String[]> f278214B;

    /* renamed from: d */
    public AnimatedExpandableListView f278215d;

    /* renamed from: e */
    public ArrayList<String> f278216e;

    /* renamed from: f */
    public String f278217f;

    /* renamed from: g */
    public String f278218g;

    /* renamed from: h */
    public String f278219h;

    /* renamed from: i */
    public String f278220i;

    /* renamed from: j */
    public C97753a f278221j;

    /* renamed from: n */
    public int f278222n = 0;

    /* renamed from: o */
    public boolean f278223o = false;

    /* renamed from: p */
    public boolean f278224p = false;

    /* renamed from: q */
    public boolean f278225q = false;

    /* renamed from: r */
    public boolean f278226r = false;

    /* renamed from: s */
    public int f278227s;

    /* renamed from: t */
    public C89779i0 f278228t;

    /* renamed from: u */
    public String f278229u;

    /* renamed from: v */
    public ArrayList<String> f278230v;

    /* renamed from: w */
    public int f278231w;

    /* renamed from: x */
    public int f278232x;

    /* renamed from: y */
    public ArrayList<String> f278233y;

    /* renamed from: z */
    public ArrayList<String> f278234z;

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsLabelUI$a */
    public class C95560a implements Runnable {
        public C95560a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x00a3, code lost:
            if (r2.length() == 0) goto L_0x00a5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0070, code lost:
            if (r2.length() == 0) goto L_0x0072;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r6 = this;
                java.lang.String r0 = "run"
                java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.SnsLabelUI$10"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
                b22.b r2 = b22.C28250a.m38138a()
                a22.a r2 = (a22.C67001a) r2
                r2.mo90965c()
                com.tencent.mm.plugin.sns.ui.SnsLabelUI r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsLabelUI.this
                b22.b r3 = b22.C28250a.m38138a()
                a22.a r3 = (a22.C67001a) r3
                java.util.List r3 = r3.mo90967e()
                java.util.ArrayList r3 = (java.util.ArrayList) r3
                com.tencent.p014mm.plugin.sns.p106ui.SnsLabelUI.m122142K7(r2, r3)
                com.tencent.mm.plugin.sns.ui.SnsLabelUI r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsLabelUI.this
                ev2.a r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsLabelUI.m122139H7(r2)
                com.tencent.mm.plugin.sns.ui.SnsLabelUI r3 = com.tencent.p014mm.plugin.sns.p106ui.SnsLabelUI.this
                java.util.ArrayList r3 = com.tencent.p014mm.plugin.sns.p106ui.SnsLabelUI.m122141J7(r3)
                r2.mo137077h(r3)
                com.tencent.mm.plugin.sns.ui.SnsLabelUI r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsLabelUI.this
                java.lang.String r3 = "access$1600"
                java.lang.String r4 = "com.tencent.mm.plugin.sns.ui.SnsLabelUI"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
                r2.mo132808P7()
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
                com.tencent.mm.plugin.sns.ui.SnsLabelUI r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsLabelUI.this
                java.util.ArrayList r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsLabelUI.m122141J7(r2)
                if (r2 == 0) goto L_0x0054
                com.tencent.mm.plugin.sns.ui.SnsLabelUI r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsLabelUI.this
                java.util.ArrayList r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsLabelUI.m122141J7(r2)
                int r2 = r2.size()
                if (r2 != 0) goto L_0x00e6
            L_0x0054:
                com.tencent.mm.plugin.sns.ui.SnsLabelUI r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsLabelUI.this
                java.lang.String r3 = "access$2100"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
                java.lang.String r2 = r2.f278218g
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
                if (r2 == 0) goto L_0x0072
                com.tencent.mm.plugin.sns.ui.SnsLabelUI r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsLabelUI.this
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
                java.lang.String r2 = r2.f278218g
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
                int r2 = r2.length()
                if (r2 != 0) goto L_0x00e6
            L_0x0072:
                com.tencent.mm.plugin.sns.ui.SnsLabelUI r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsLabelUI.this
                ev2.a r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsLabelUI.m122139H7(r2)
                int r2 = r2.f286761h
                if (r2 == 0) goto L_0x00e6
                com.tencent.mm.plugin.sns.ui.SnsLabelUI r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsLabelUI.this
                ev2.a r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsLabelUI.m122139H7(r2)
                int r2 = r2.f286761h
                r3 = 1
                if (r2 == r3) goto L_0x00e6
                com.tencent.mm.plugin.sns.ui.SnsLabelUI r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsLabelUI.this
                java.lang.String r3 = "access$2200"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
                java.lang.String r2 = r2.f278219h
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
                if (r2 == 0) goto L_0x00a5
                com.tencent.mm.plugin.sns.ui.SnsLabelUI r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsLabelUI.this
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
                java.lang.String r2 = r2.f278219h
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
                int r2 = r2.length()
                if (r2 != 0) goto L_0x00e6
            L_0x00a5:
                com.tencent.mm.plugin.sns.ui.SnsLabelUI r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsLabelUI.this
                ev2.a r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsLabelUI.m122139H7(r2)
                java.util.ArrayList<java.lang.String> r2 = r2.f286768o
                boolean r2 = r2.isEmpty()
                if (r2 == 0) goto L_0x00e6
                com.tencent.mm.plugin.sns.ui.SnsLabelUI r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsLabelUI.this
                ev2.a r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsLabelUI.m122139H7(r2)
                java.util.ArrayList<java.lang.String> r2 = r2.f286769p
                boolean r2 = r2.isEmpty()
                if (r2 == 0) goto L_0x00e6
                com.tencent.mm.plugin.sns.ui.SnsLabelUI r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsLabelUI.this
                ev2.a r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsLabelUI.m122139H7(r2)
                java.util.ArrayList<java.lang.String> r2 = r2.f286766m
                boolean r2 = r2.isEmpty()
                if (r2 == 0) goto L_0x00e6
                com.tencent.mm.plugin.sns.ui.SnsLabelUI r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsLabelUI.this
                ev2.a r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsLabelUI.m122139H7(r2)
                java.util.ArrayList<java.lang.String> r2 = r2.f286767n
                boolean r2 = r2.isEmpty()
                if (r2 == 0) goto L_0x00e6
                com.tencent.mm.plugin.sns.ui.SnsLabelUI r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsLabelUI.this
                ev2.a r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsLabelUI.m122139H7(r2)
                r3 = 0
                r2.f286761h = r3
            L_0x00e6:
                com.tencent.mm.plugin.sns.ui.SnsLabelUI r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsLabelUI.this
                ev2.a r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsLabelUI.m122139H7(r2)
                r2.notifyDataSetChanged()
                com.tencent.mm.plugin.sns.ui.SnsLabelUI r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsLabelUI.this
                r3 = 0
                java.lang.String r5 = "access$1802"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r4)
                r2.f278229u = r3
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r4)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.SnsLabelUI.C95560a.run():void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsLabelUI$b */
    public class C95561b implements Runnable {
        public C95561b() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsLabelUI$11");
            SnsLabelUI.m122139H7(SnsLabelUI.this).f286761h = SnsLabelUI.m122144M7(SnsLabelUI.this);
            if (SnsLabelUI.m122143L7(SnsLabelUI.this) != null) {
                if (SnsLabelUI.m122141J7(SnsLabelUI.this) == null) {
                    SnsLabelUI snsLabelUI = SnsLabelUI.this;
                    SnsLabelUI.m122142K7(snsLabelUI, SnsLabelUI.m122143L7(snsLabelUI));
                } else {
                    SnsLabelUI.m122141J7(SnsLabelUI.this).addAll(SnsLabelUI.m122143L7(SnsLabelUI.this));
                }
                Iterator it = SnsLabelUI.m122143L7(SnsLabelUI.this).iterator();
                while (it.hasNext()) {
                    SnsLabelUI.m122139H7(SnsLabelUI.this).mo137067d((String) it.next());
                }
                HashSet hashSet = new HashSet(SnsLabelUI.m122141J7(SnsLabelUI.this));
                SnsLabelUI.m122141J7(SnsLabelUI.this).clear();
                SnsLabelUI.m122141J7(SnsLabelUI.this).addAll(hashSet);
                SnsLabelUI.m122143L7(SnsLabelUI.this).clear();
                SnsLabelUI snsLabelUI2 = SnsLabelUI.this;
                SnsMethodCalculate.markStartTimeMs("access$202", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
                snsLabelUI2.f278234z = null;
                SnsMethodCalculate.markEndTimeMs("access$202", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
                hashSet.clear();
            }
            SnsLabelUI.m122139H7(SnsLabelUI.this).mo137077h(SnsLabelUI.m122141J7(SnsLabelUI.this));
            SnsLabelUI snsLabelUI3 = SnsLabelUI.this;
            SnsMethodCalculate.markStartTimeMs("access$1600", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
            snsLabelUI3.mo132808P7();
            SnsMethodCalculate.markEndTimeMs("access$1600", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
            SnsLabelUI.m122139H7(SnsLabelUI.this).notifyDataSetChanged();
            SnsLabelUI.m122146O7(SnsLabelUI.this).mo136339e(SnsLabelUI.m122139H7(SnsLabelUI.this).f286761h);
            SnsLabelUI snsLabelUI4 = SnsLabelUI.this;
            SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
            C89779i0 i0Var = snsLabelUI4.f278228t;
            SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
            if (i0Var != null) {
                SnsLabelUI snsLabelUI5 = SnsLabelUI.this;
                SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
                C89779i0 i0Var2 = snsLabelUI5.f278228t;
                SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
                if (i0Var2.isShowing()) {
                    SnsLabelUI snsLabelUI6 = SnsLabelUI.this;
                    SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
                    C89779i0 i0Var3 = snsLabelUI6.f278228t;
                    SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
                    i0Var3.dismiss();
                }
            }
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsLabelUI$11");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsLabelUI$c */
    public class C95562c implements DialogInterface.OnClickListener {
        public C95562c(SnsLabelUI snsLabelUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsLabelUI$12");
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsLabelUI$12");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsLabelUI$d */
    public class C95563d implements a$$c {
        public C95563d() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsLabelUI$e */
    public class C95564e implements ExpandableListView.OnGroupClickListener {

        /* renamed from: com.tencent.mm.plugin.sns.ui.SnsLabelUI$e$a */
        public class C95565a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ int f278239d;

            public C95565a(int i) {
                this.f278239d = i;
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsLabelUI$2$1");
                SnsLabelUI.m122146O7(SnsLabelUI.this).mo136339e(this.f278239d);
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsLabelUI$2$1");
            }
        }

        public C95564e() {
        }

        public boolean onGroupClick(ExpandableListView expandableListView, View view, int i, long j) {
            SnsMethodCalculate.markStartTimeMs("onGroupClick", "com.tencent.mm.plugin.sns.ui.SnsLabelUI$2");
            if (!C94847c1.m120213a() || !SnsLabelUI.this.getIntent().getBooleanExtra("Kis_with_together", false) || i != 1) {
                int i2 = SnsLabelUI.m122139H7(SnsLabelUI.this).f286761h;
                SnsReportHelper.f275506m0.mo131365Z(i);
                Log.m105925i("MicroMsg.SnsLabelUI", "user click [previousGroup: %d    onGroupClick:%d]", Integer.valueOf(i2), Integer.valueOf(i));
                if (i > 1) {
                    if (!(SnsLabelUI.m122143L7(SnsLabelUI.this) == null || SnsLabelUI.m122143L7(SnsLabelUI.this).size() == 0)) {
                        SnsLabelUI snsLabelUI = SnsLabelUI.this;
                        SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
                        int R7 = snsLabelUI.mo132810R7();
                        SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
                        if (R7 == 0) {
                            SnsLabelUI.m122145N7(SnsLabelUI.this, i);
                            SnsLabelUI snsLabelUI2 = SnsLabelUI.this;
                            SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
                            snsLabelUI2.getClass();
                            SnsMethodCalculate.markStartTimeMs("showTransformDialog", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
                            C76879j.m92754y(snsLabelUI2, snsLabelUI2.getString(C0966R.string.je6), (String) null, snsLabelUI2.getString(C0966R.string.je5), new C96273w4(snsLabelUI2));
                            SnsMethodCalculate.markEndTimeMs("showTransformDialog", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
                            SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
                            Log.m105924i("MicroMsg.SnsLabelUI", "dz[previousGroup: need transform]");
                            SnsMethodCalculate.markEndTimeMs("onGroupClick", "com.tencent.mm.plugin.sns.ui.SnsLabelUI$2");
                            return true;
                        }
                    }
                    SnsLabelUI snsLabelUI3 = SnsLabelUI.this;
                    SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
                    boolean z = snsLabelUI3.f278226r;
                    SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
                    if (z) {
                        SnsLabelUI snsLabelUI4 = SnsLabelUI.this;
                        SnsMethodCalculate.markStartTimeMs("access$702", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
                        snsLabelUI4.f278224p = true;
                        SnsMethodCalculate.markEndTimeMs("access$702", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
                        SnsLabelUI.m122145N7(SnsLabelUI.this, i);
                        SnsLabelUI snsLabelUI5 = SnsLabelUI.this;
                        C89779i0 Q = C76879j.m92723Q(snsLabelUI5, (String) null, snsLabelUI5.getString(C0966R.string.jds), false, false, (DialogInterface.OnCancelListener) null);
                        SnsMethodCalculate.markStartTimeMs("access$802", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
                        snsLabelUI5.f278228t = Q;
                        SnsMethodCalculate.markEndTimeMs("access$802", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
                        Log.m105924i("MicroMsg.SnsLabelUI", "dz[previousGroup: isGettingTagInfo]");
                        SnsMethodCalculate.markEndTimeMs("onGroupClick", "com.tencent.mm.plugin.sns.ui.SnsLabelUI$2");
                        return true;
                    }
                    if (i2 != i) {
                        if (i2 == 2) {
                            SnsLabelUI.m122146O7(SnsLabelUI.this).collapseGroup(2);
                            SnsLabelUI.m122139H7(SnsLabelUI.this).f286764k.clear();
                            SnsLabelUI.m122139H7(SnsLabelUI.this).f286766m.clear();
                        } else if (i2 == 3) {
                            SnsLabelUI.m122146O7(SnsLabelUI.this).collapseGroup(3);
                            SnsLabelUI.m122139H7(SnsLabelUI.this).f286765l.clear();
                            SnsLabelUI.m122139H7(SnsLabelUI.this).f286767n.clear();
                        }
                        SnsLabelUI.m122146O7(SnsLabelUI.this).post(new C95565a(i));
                    } else if (SnsLabelUI.m122146O7(SnsLabelUI.this).isGroupExpanded(i)) {
                        SnsLabelUI.m122146O7(SnsLabelUI.this).mo136338c(i);
                    } else {
                        SnsLabelUI.m122146O7(SnsLabelUI.this).mo136339e(i);
                    }
                    SnsLabelUI.m122139H7(SnsLabelUI.this).f286761h = i;
                    SnsMethodCalculate.markEndTimeMs("onGroupClick", "com.tencent.mm.plugin.sns.ui.SnsLabelUI$2");
                    return true;
                }
                if (i2 > 1) {
                    SnsLabelUI.m122146O7(SnsLabelUI.this).mo136338c(i2);
                }
                SnsLabelUI.m122139H7(SnsLabelUI.this).f286761h = i;
                SnsMethodCalculate.markEndTimeMs("onGroupClick", "com.tencent.mm.plugin.sns.ui.SnsLabelUI$2");
                return false;
            }
            C77426q qVar = new C77426q(SnsLabelUI.this);
            qVar.mo107595g(SnsLabelUI.this.getString(C0966R.string.jkg));
            qVar.mo107601m(C0966R.string.f8028zq);
            qVar.mo107603o();
            SnsMethodCalculate.markEndTimeMs("onGroupClick", "com.tencent.mm.plugin.sns.ui.SnsLabelUI$2");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsLabelUI$f */
    public class C95566f implements ExpandableListView.OnChildClickListener {
        public C95566f() {
        }

        public boolean onChildClick(ExpandableListView expandableListView, View view, int i, int i2, long j) {
            View view2 = view;
            int i3 = i;
            int i4 = i2;
            SnsMethodCalculate.markStartTimeMs("onChildClick", "com.tencent.mm.plugin.sns.ui.SnsLabelUI$3");
            Log.m105925i("MicroMsg.SnsLabelUI", "ExpandableListView click groupPosition:%d ,childPosition:%d", Integer.valueOf(i), Integer.valueOf(i2));
            if (i4 == C97753a.f286752u) {
                SnsLabelUI.m122145N7(SnsLabelUI.this, i3);
                SnsLabelUI snsLabelUI = SnsLabelUI.this;
                SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
                snsLabelUI.getClass();
                SnsMethodCalculate.markStartTimeMs("gotoSelectContact", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
                Intent intent = new Intent();
                intent.putExtra("titile", snsLabelUI.getString(C0966R.string.f7496hv));
                intent.putExtra("snsPostWhoCanSee", true);
                C74560s1.m89276e();
                intent.putExtra("list_attr", C74560s1.m89278g(C74560s1.f219161b));
                int i5 = snsLabelUI.f278227s;
                if (i5 == 2) {
                    if (snsLabelUI.f278221j.f286766m.size() > 0) {
                        intent.putExtra("already_select_contact", Util.listToString(snsLabelUI.f278221j.f286766m, ","));
                    }
                } else if (i5 == 3 && snsLabelUI.f278221j.f286767n.size() > 0) {
                    intent.putExtra("already_select_contact", Util.listToString(snsLabelUI.f278221j.f286767n, ","));
                }
                intent.putExtra("KBlockOpenImFav", true);
                intent.putExtra("without_openim", true);
                intent.putExtra("CONTACT_INFO_UI_SOURCE", snsLabelUI.f278232x);
                C88144b.m109802t(snsLabelUI, ".ui.contact.SelectContactUI", intent, WearableStatusCodes.DATA_ITEM_TOO_LARGE);
                SnsMethodCalculate.markEndTimeMs("gotoSelectContact", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
                SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
            } else if (i4 == C97753a.f286751t) {
                SnsLabelUI.m122145N7(SnsLabelUI.this, i3);
                SnsLabelUI snsLabelUI2 = SnsLabelUI.this;
                SnsMethodCalculate.markStartTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
                snsLabelUI2.getClass();
                SnsMethodCalculate.markStartTimeMs("gotoSelectGroup", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
                Log.m105924i("MicroMsg.SnsLabelUI", "goto select group");
                Intent intent2 = new Intent(snsLabelUI2, SnsSelectChatRoomUI.class);
                intent2.putExtra("titile", snsLabelUI2.getString(C0966R.string.jdp));
                intent2.putExtra("CONTACT_INFO_UI_SOURCE", snsLabelUI2.f278232x);
                int i6 = snsLabelUI2.f278227s;
                if (i6 == 2) {
                    if (snsLabelUI2.f278221j.f286768o.size() > 0) {
                        intent2.putExtra("already_select_contact", Util.listToString(snsLabelUI2.f278221j.f286768o, ","));
                    }
                } else if (i6 == 3 && snsLabelUI2.f278221j.f286769p.size() > 0) {
                    intent2.putExtra("already_select_contact", Util.listToString(snsLabelUI2.f278221j.f286769p, ","));
                }
                intent2.putExtra("KBlockOpenImFav", true);
                snsLabelUI2.startActivityForResult(intent2, (int) WearableStatusCodes.INVALID_TARGET_NODE);
                SnsMethodCalculate.markEndTimeMs("gotoSelectGroup", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
                SnsMethodCalculate.markEndTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
            } else {
                String str = (String) SnsLabelUI.m122139H7(SnsLabelUI.this).getChild(i3, i4 - C97753a.f286753v);
                SnsLabelUI.m122139H7(SnsLabelUI.this).mo137067d(str);
                if (i3 == 2) {
                    SnsLabelUI snsLabelUI3 = SnsLabelUI.this;
                    SnsLabelUI.m122140I7(snsLabelUI3, 1, SnsLabelUI.m122139H7(snsLabelUI3).f286764k, str, view2);
                } else if (i3 == 3) {
                    SnsLabelUI snsLabelUI4 = SnsLabelUI.this;
                    SnsLabelUI.m122140I7(snsLabelUI4, 2, SnsLabelUI.m122139H7(snsLabelUI4).f286765l, str, view2);
                }
            }
            if (i4 == C97753a.f286752u) {
                SnsReportHelper snsReportHelper = SnsReportHelper.f275506m0;
                snsReportHelper.getClass();
                SnsMethodCalculate.markStartTimeMs("increaseFromContactClick", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
                TimelineGroupUserBehaviorStruct timelineGroupUserBehaviorStruct = snsReportHelper.f275557n;
                if (timelineGroupUserBehaviorStruct != null) {
                    int i7 = timelineGroupUserBehaviorStruct.f266390s;
                    if (i7 <= 0) {
                        timelineGroupUserBehaviorStruct.f266390s = 1;
                    } else {
                        timelineGroupUserBehaviorStruct.f266390s = i7 + 1;
                    }
                }
                SnsMethodCalculate.markEndTimeMs("increaseFromContactClick", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            } else if (i4 == C97753a.f286751t) {
                SnsReportHelper snsReportHelper2 = SnsReportHelper.f275506m0;
                snsReportHelper2.getClass();
                SnsMethodCalculate.markStartTimeMs("increaseFromChatroomClick", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
                TimelineGroupUserBehaviorStruct timelineGroupUserBehaviorStruct2 = snsReportHelper2.f275557n;
                if (timelineGroupUserBehaviorStruct2 != null) {
                    int i8 = timelineGroupUserBehaviorStruct2.f266386o;
                    if (i8 <= 0) {
                        timelineGroupUserBehaviorStruct2.f266386o = 1;
                    } else {
                        timelineGroupUserBehaviorStruct2.f266386o = i8 + 1;
                    }
                }
                SnsMethodCalculate.markEndTimeMs("increaseFromChatroomClick", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            }
            SnsMethodCalculate.markEndTimeMs("onChildClick", "com.tencent.mm.plugin.sns.ui.SnsLabelUI$3");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsLabelUI$g */
    public class C95567g implements MenuItem.OnMenuItemClickListener {
        public C95567g() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsLabelUI$4");
            SnsLabelUI snsLabelUI = SnsLabelUI.this;
            int i = SnsLabelUI.f278212C;
            SnsMethodCalculate.markStartTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
            snsLabelUI.mo132811S7();
            SnsMethodCalculate.markEndTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
            SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsLabelUI$4");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsLabelUI$h */
    public class C95568h implements MenuItem.OnMenuItemClickListener {
        public C95568h() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsLabelUI$5");
            SnsLabelUI snsLabelUI = SnsLabelUI.this;
            snsLabelUI.getClass();
            SnsMethodCalculate.markStartTimeMs("setLabelFinish", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
            String listToString = Util.listToString(snsLabelUI.f278221j.f286764k, ",");
            String listToString2 = Util.listToString(snsLabelUI.f278221j.f286766m, ",");
            String listToString3 = Util.listToString(snsLabelUI.f278221j.f286768o, ",");
            String listToString4 = Util.listToString(snsLabelUI.f278221j.f286765l, ",");
            String listToString5 = Util.listToString(snsLabelUI.f278221j.f286767n, ",");
            String listToString6 = Util.listToString(snsLabelUI.f278221j.f286769p, ",");
            C97753a aVar = snsLabelUI.f278221j;
            if (!(aVar.f286761h == 2 && aVar.f286764k.size() == 0 && snsLabelUI.f278221j.f286766m.size() == 0 && snsLabelUI.f278221j.f286768o.size() == 0)) {
                C97753a aVar2 = snsLabelUI.f278221j;
                if (!(aVar2.f286761h == 3 && aVar2.f286765l.size() == 0 && snsLabelUI.f278221j.f286767n.size() == 0 && snsLabelUI.f278221j.f286769p.size() == 0)) {
                    if ((snsLabelUI.f278221j.f286761h != 2 || !Util.isNullOrNil(listToString) || !Util.isNullOrNil(listToString2) || !Util.isNullOrNil(listToString3)) && (snsLabelUI.f278221j.f286761h != 3 || !Util.isNullOrNil(listToString4) || !Util.isNullOrNil(listToString5) || !Util.isNullOrNil(listToString6))) {
                        snsLabelUI.mo132814V7();
                        SnsMethodCalculate.markEndTimeMs("setLabelFinish", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
                        SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsLabelUI$5");
                        return true;
                    }
                    C76879j.m92754y(snsLabelUI, snsLabelUI.getString(C0966R.string.jdt), "", snsLabelUI.getString(C0966R.string.je5), (DialogInterface.OnClickListener) null);
                    SnsMethodCalculate.markEndTimeMs("setLabelFinish", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
                    SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsLabelUI$5");
                    return true;
                }
            }
            C76879j.m92754y(snsLabelUI, snsLabelUI.getString(C0966R.string.jdt), "", snsLabelUI.getString(C0966R.string.je5), (DialogInterface.OnClickListener) null);
            SnsMethodCalculate.markEndTimeMs("setLabelFinish", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
            SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsLabelUI$5");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsLabelUI$i */
    public class C95569i implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f278244d;

        public C95569i(String str) {
            this.f278244d = str;
        }

        public void run() {
            int i;
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsLabelUI$7");
            SnsLabelUI.m122142K7(SnsLabelUI.this, (ArrayList) ((C67001a) C28250a.m38138a()).mo90967e());
            if (SnsLabelUI.m122141J7(SnsLabelUI.this) == null) {
                SnsLabelUI.m122142K7(SnsLabelUI.this, new ArrayList());
            }
            if (!Util.isNullOrNil(this.f278244d)) {
                if (!SnsLabelUI.m122141J7(SnsLabelUI.this).contains(this.f278244d)) {
                    SnsLabelUI.m122141J7(SnsLabelUI.this).add(this.f278244d);
                }
                i = SnsLabelUI.m122141J7(SnsLabelUI.this).indexOf(this.f278244d);
            } else {
                i = -1;
            }
            SnsLabelUI.m122139H7(SnsLabelUI.this).mo137077h(SnsLabelUI.m122141J7(SnsLabelUI.this));
            SnsLabelUI snsLabelUI = SnsLabelUI.this;
            SnsMethodCalculate.markStartTimeMs("access$1600", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
            snsLabelUI.mo132808P7();
            SnsMethodCalculate.markEndTimeMs("access$1600", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
            SnsLabelUI.m122139H7(SnsLabelUI.this).f286761h = SnsLabelUI.m122144M7(SnsLabelUI.this);
            if (!Util.isNullOrNil(this.f278244d) && i != -1) {
                if (SnsLabelUI.m122144M7(SnsLabelUI.this) == 2) {
                    SnsLabelUI.m122139H7(SnsLabelUI.this).f286764k.add(this.f278244d);
                    C97753a H7 = SnsLabelUI.m122139H7(SnsLabelUI.this);
                    SnsLabelUI snsLabelUI2 = SnsLabelUI.this;
                    SnsMethodCalculate.markStartTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
                    ArrayList<String> arrayList = snsLabelUI2.f278230v;
                    SnsMethodCalculate.markEndTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
                    H7.f286770q = new ArrayList<>(arrayList);
                    SnsLabelUI.m122139H7(SnsLabelUI.this).f286766m.clear();
                } else if (SnsLabelUI.m122144M7(SnsLabelUI.this) == 3) {
                    SnsLabelUI.m122139H7(SnsLabelUI.this).f286765l.add(this.f278244d);
                    C97753a H72 = SnsLabelUI.m122139H7(SnsLabelUI.this);
                    SnsLabelUI snsLabelUI3 = SnsLabelUI.this;
                    SnsMethodCalculate.markStartTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
                    ArrayList<String> arrayList2 = snsLabelUI3.f278230v;
                    SnsMethodCalculate.markEndTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
                    H72.f286771r = new ArrayList<>(arrayList2);
                    SnsLabelUI.m122139H7(SnsLabelUI.this).f286767n.clear();
                }
            }
            SnsLabelUI.m122139H7(SnsLabelUI.this).notifyDataSetChanged();
            SnsLabelUI.m122146O7(SnsLabelUI.this).expandGroup(SnsLabelUI.m122144M7(SnsLabelUI.this));
            SnsLabelUI snsLabelUI4 = SnsLabelUI.this;
            SnsMethodCalculate.markStartTimeMs("access$1802", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
            snsLabelUI4.f278229u = null;
            SnsMethodCalculate.markEndTimeMs("access$1802", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsLabelUI$7");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsLabelUI$j */
    public class C95570j implements DialogInterface.OnClickListener {
        public C95570j() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsLabelUI$8");
            SnsLabelUI snsLabelUI = SnsLabelUI.this;
            int i2 = SnsLabelUI.f278212C;
            SnsMethodCalculate.markStartTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
            snsLabelUI.mo132814V7();
            SnsMethodCalculate.markEndTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsLabelUI$8");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsLabelUI$k */
    public class C95571k implements DialogInterface.OnClickListener {
        public C95571k() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsLabelUI$9");
            SnsLabelUI snsLabelUI = SnsLabelUI.this;
            int i2 = SnsLabelUI.f278212C;
            SnsMethodCalculate.markStartTimeMs("access$2000", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
            snsLabelUI.mo132812T7();
            SnsMethodCalculate.markEndTimeMs("access$2000", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsLabelUI$9");
        }
    }

    /* renamed from: H7 */
    public static /* synthetic */ C97753a m122139H7(SnsLabelUI snsLabelUI) {
        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        C97753a aVar = snsLabelUI.f278221j;
        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        return aVar;
    }

    /* renamed from: I7 */
    public static void m122140I7(SnsLabelUI snsLabelUI, int i, ArrayList arrayList, String str, View view) {
        SnsMethodCalculate.markStartTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        snsLabelUI.getClass();
        SnsMethodCalculate.markStartTimeMs("insertOrRemove", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        C97753a aVar = snsLabelUI.f278221j;
        if (aVar == null || aVar.f286760g != 1) {
            if (arrayList.contains(str)) {
                arrayList.remove(str);
                ((ImageView) view.findViewById(C0966R.C0970id.jtv)).setImageResource(C0966R.C0969drawable.f4823ny);
            } else {
                arrayList.add(str);
                if (i == 1) {
                    ((ImageView) view.findViewById(C0966R.C0970id.jtv)).setImageResource(C0966R.raw.checkbox_selected);
                } else {
                    ((ImageView) view.findViewById(C0966R.C0970id.jtv)).setImageResource(C0966R.raw.checkbox_selected_red);
                }
            }
        } else if (arrayList.contains(str)) {
            arrayList.remove(str);
            if (i == 1) {
                ((ImageView) view.findViewById(C0966R.C0970id.jtv)).setImageResource(C0966R.raw.sight_list_checkbox_unselected);
            } else {
                ((ImageView) view.findViewById(C0966R.C0970id.jtv)).setImageResource(C0966R.raw.sight_list_checkbox_unselected_red);
            }
        } else {
            arrayList.add(str);
            if (i == 1) {
                ((ImageView) view.findViewById(C0966R.C0970id.jtv)).setImageResource(C0966R.raw.sight_list_checkbox_selected);
            } else {
                ((ImageView) view.findViewById(C0966R.C0970id.jtv)).setImageResource(C0966R.raw.sight_list_checkbox_selected_red);
            }
        }
        SnsMethodCalculate.markEndTimeMs("insertOrRemove", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        SnsMethodCalculate.markEndTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
    }

    /* renamed from: J7 */
    public static /* synthetic */ ArrayList m122141J7(SnsLabelUI snsLabelUI) {
        SnsMethodCalculate.markStartTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        ArrayList<String> arrayList = snsLabelUI.f278216e;
        SnsMethodCalculate.markEndTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        return arrayList;
    }

    /* renamed from: K7 */
    public static /* synthetic */ ArrayList m122142K7(SnsLabelUI snsLabelUI, ArrayList arrayList) {
        SnsMethodCalculate.markStartTimeMs("access$1502", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        snsLabelUI.f278216e = arrayList;
        SnsMethodCalculate.markEndTimeMs("access$1502", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        return arrayList;
    }

    /* renamed from: L7 */
    public static /* synthetic */ ArrayList m122143L7(SnsLabelUI snsLabelUI) {
        SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        ArrayList<String> arrayList = snsLabelUI.f278234z;
        SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        return arrayList;
    }

    /* renamed from: M7 */
    public static /* synthetic */ int m122144M7(SnsLabelUI snsLabelUI) {
        SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        int i = snsLabelUI.f278227s;
        SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        return i;
    }

    /* renamed from: N7 */
    public static /* synthetic */ int m122145N7(SnsLabelUI snsLabelUI, int i) {
        SnsMethodCalculate.markStartTimeMs("access$402", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        snsLabelUI.f278227s = i;
        SnsMethodCalculate.markEndTimeMs("access$402", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        return i;
    }

    /* renamed from: O7 */
    public static /* synthetic */ AnimatedExpandableListView m122146O7(SnsLabelUI snsLabelUI) {
        SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        AnimatedExpandableListView animatedExpandableListView = snsLabelUI.f278215d;
        SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        return animatedExpandableListView;
    }

    /* renamed from: P7 */
    public final void mo132808P7() {
        ArrayList<String> arrayList;
        SnsMethodCalculate.markStartTimeMs("checkInnerSelectedLabelNames", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        ArrayList<String> arrayList2 = this.f278216e;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            ArrayList<String> arrayList3 = this.f278221j.f286764k;
            if (arrayList3 != null) {
                arrayList3.clear();
            }
            ArrayList<String> arrayList4 = this.f278221j.f286765l;
            if (arrayList4 != null) {
                arrayList4.clear();
            }
            SnsMethodCalculate.markEndTimeMs("checkInnerSelectedLabelNames", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
            return;
        }
        ArrayList arrayList5 = new ArrayList();
        int i = this.f278222n;
        if (i == 2 && (arrayList = this.f278221j.f286764k) != null) {
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (!this.f278216e.contains(next)) {
                    arrayList5.add(next);
                }
            }
            this.f278221j.f286764k.removeAll(arrayList5);
        } else if (i == 3) {
            Iterator<String> it4 = this.f278221j.f286765l.iterator();
            while (it4.hasNext()) {
                String next2 = it4.next();
                if (!this.f278216e.contains(next2)) {
                    arrayList5.add(next2);
                }
            }
            this.f278221j.f286765l.removeAll(arrayList5);
        }
        SnsMethodCalculate.markEndTimeMs("checkInnerSelectedLabelNames", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
    }

    /* renamed from: Q7 */
    public final void mo132809Q7() {
        ArrayList<String> stringsToList;
        SnsMethodCalculate.markStartTimeMs("checkOuterSelectedLabelNames", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        ArrayList<String> arrayList = this.f278216e;
        if (arrayList == null || arrayList.isEmpty()) {
            this.f278217f = "";
            SnsMethodCalculate.markEndTimeMs("checkOuterSelectedLabelNames", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String str = this.f278217f;
        if (!(str == null || (stringsToList = Util.stringsToList(str.split(","))) == null)) {
            for (String next : stringsToList) {
                if (!this.f278216e.contains(next)) {
                    arrayList2.add(next);
                }
            }
            stringsToList.removeAll(arrayList2);
            this.f278217f = Util.listToString(stringsToList, ",");
        }
        SnsMethodCalculate.markEndTimeMs("checkOuterSelectedLabelNames", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
    }

    /* renamed from: R7 */
    public final int mo132810R7() {
        SnsMethodCalculate.markStartTimeMs("getTagToLabelFailedTime", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        C86709a0.m107528h();
        int intValue = ((Integer) C86709a0.m107535s().mo121142i().mo119684e(335874, 0)).intValue();
        SnsMethodCalculate.markEndTimeMs("getTagToLabelFailedTime", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        return intValue;
    }

    /* renamed from: S7 */
    public final void mo132811S7() {
        SnsMethodCalculate.markStartTimeMs("goBack", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        SnsMethodCalculate.markStartTimeMs("isSelectChange", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        C97753a aVar = this.f278221j;
        int i = aVar.f286761h;
        boolean z = true;
        if (i == this.f278222n ? (i != 2 || (Util.listToString(aVar.f286764k, ",").equals(this.f278217f) && Util.listToString(this.f278221j.f286766m, ",").equals(this.f278218g) && Util.listToString(this.f278221j.f286768o, ",").equals(this.f278219h))) && (i != 3 || (Util.listToString(this.f278221j.f286765l, ",").equals(this.f278217f) && Util.listToString(this.f278221j.f286767n, ",").equals(this.f278218g) && Util.listToString(this.f278221j.f286769p, ",").equals(this.f278219h))) : (i != 2 || (aVar.f286764k.size() == 0 && this.f278221j.f286766m.size() == 0)) && !((i == 3 && (this.f278221j.f286765l.size() != 0 || this.f278221j.f286767n.size() != 0)) || i == 1 || i == 0)) {
            z = false;
        }
        SnsMethodCalculate.markEndTimeMs("isSelectChange", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        if (z) {
            C76879j.m92717K(this, true, getString(C0966R.string.jdn), "", getString(C0966R.string.jdm), getString(C0966R.string.jdl), new C95570j(), new C95571k());
        } else {
            mo132812T7();
        }
        SnsMethodCalculate.markEndTimeMs("goBack", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
    }

    /* renamed from: T7 */
    public final void mo132812T7() {
        SnsMethodCalculate.markStartTimeMs("goBackWithStates", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        Intent intent = new Intent();
        intent.putExtra("Ktag_range_index", this.f278222n);
        int i = this.f278222n;
        if (i == 2 || i == 3) {
            mo132809Q7();
            intent.putExtra("Klabel_name_list", this.f278217f);
            intent.putExtra("Kother_user_name_list", this.f278218g);
            intent.putExtra("Kchat_room_name_list", this.f278219h);
        }
        setResult(-1, intent);
        finish();
        SnsMethodCalculate.markEndTimeMs("goBackWithStates", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
    }

    /* renamed from: U7 */
    public final void mo132813U7() {
        SnsMethodCalculate.markStartTimeMs("handleTransformError", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        C115669n.INSTANCE.mo160131h(11455, "", "", Integer.valueOf(this.f278231w), 0);
        SnsMethodCalculate.markStartTimeMs("RecordTagToLabelFailed", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        C86709a0.m107528h();
        C86709a0.m107528h();
        C86709a0.m107535s().mo121142i().mo119676J(335874, Integer.valueOf(((Integer) C86709a0.m107535s().mo121142i().mo119684e(335874, 0)).intValue() + 1));
        SnsMethodCalculate.markEndTimeMs("RecordTagToLabelFailed", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        this.f278234z = null;
        this.f278226r = false;
        this.f278225q = false;
        C89779i0 i0Var = this.f278228t;
        if (i0Var != null && i0Var.isShowing()) {
            this.f278228t.dismiss();
        }
        if (this.f278224p) {
            this.f278224p = false;
            SnsMethodCalculate.markEndTimeMs("handleTransformError", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
            return;
        }
        int i = C0966R.string.je4;
        if (mo132810R7() > 1) {
            i = C0966R.string.f361380je3;
        }
        C76879j.m92742m(this, i, C0966R.string.a18, new C95562c(this));
        SnsMethodCalculate.markEndTimeMs("handleTransformError", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
    }

    /* renamed from: V7 */
    public final void mo132814V7() {
        SnsMethodCalculate.markStartTimeMs("saveAndExit", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        Intent intent = new Intent();
        C97753a aVar = this.f278221j;
        int i = aVar.f286761h;
        if (i == 2) {
            this.f278217f = Util.listToString(aVar.f286764k, ",");
            this.f278218g = Util.listToString(this.f278221j.f286766m, ",");
            this.f278219h = Util.listToString(this.f278221j.f286768o, ",");
            this.f278220i = Util.listToString(this.f278221j.f286770q, ",");
            mo132809Q7();
            intent.putExtra("Klabel_name_list", this.f278217f);
            intent.putExtra("Kother_user_name_list", this.f278218g);
            intent.putExtra("Kchat_room_name_list", this.f278219h);
            intent.putExtra("KNew_label_name_list", this.f278220i);
        } else if (i == 3) {
            this.f278217f = Util.listToString(aVar.f286765l, ",");
            this.f278218g = Util.listToString(this.f278221j.f286767n, ",");
            this.f278219h = Util.listToString(this.f278221j.f286769p, ",");
            this.f278220i = Util.listToString(this.f278221j.f286771r, ",");
            mo132809Q7();
            intent.putExtra("Klabel_name_list", this.f278217f);
            intent.putExtra("Kother_user_name_list", this.f278218g);
            intent.putExtra("Kchat_room_name_list", this.f278219h);
            intent.putExtra("KNew_label_name_list", this.f278220i);
        }
        intent.putExtra("Ktag_range_index", this.f278221j.f286761h);
        setResult(-1, intent);
        finish();
        SnsMethodCalculate.markEndTimeMs("saveAndExit", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        SnsMethodCalculate.markStartTimeMs("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 0) {
            mo132811S7();
            SnsMethodCalculate.markEndTimeMs("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
            return true;
        }
        boolean dispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
        SnsMethodCalculate.markEndTimeMs("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        return dispatchKeyEvent;
    }

    public int getLayoutId() {
        SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        return C0966R.C0971layout.c3a;
    }

    public void initView() {
        SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        boolean booleanExtra = getIntent().getBooleanExtra("KLabel_is_filter_private", false);
        this.f278215d = (AnimatedExpandableListView) findViewById(C0966R.C0970id.jtw);
        ArrayList<String> arrayList = (ArrayList) ((C67001a) C28250a.m38138a()).mo90967e();
        this.f278216e = arrayList;
        C97753a aVar = this.f278221j;
        aVar.f286763j = booleanExtra;
        aVar.mo137077h(arrayList);
        mo132808P7();
        AbsListView.LayoutParams layoutParams = new AbsListView.LayoutParams(-1, -2);
        layoutParams.height = getResources().getDimensionPixelSize(C0966R.dimen.f3898i9);
        View view = new View(this);
        view.setLayoutParams(layoutParams);
        this.f278215d.addHeaderView(view);
        this.f278215d.setAdapter(this.f278221j);
        int i = this.f278221j.f286761h;
        if (i == 2) {
            this.f278215d.expandGroup(2);
        } else if (i == 3) {
            this.f278215d.expandGroup(3);
        }
        this.f278215d.setOnGroupClickListener(new C95564e());
        this.f278215d.setOnChildClickListener(new C95566f());
        setBackBtn(new C95567g());
        addTextOptionMenu(0, getString(C0966R.string.jdj), new C95568h(), (View.OnLongClickListener) null, MMActivityController.C73075r.GREEN);
        SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        String str;
        String str2;
        int i3 = i;
        int i4 = i2;
        Intent intent2 = intent;
        C32735h.C32737c cVar = C32735h.C32737c.clicfg_enable_new_contact_label_ui;
        Class cls = C32735h.class;
        SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        super.onActivityResult(i, i2, intent);
        Log.m105925i("MicroMsg.SnsLabelUI", "requestCode:%d resultCode:%d", Integer.valueOf(i), Integer.valueOf(i2));
        String str3 = ",";
        String str4 = "dz[onActivityResult] %s";
        String str5 = "";
        if (i4 == -1 && i3 == 4003) {
            Log.m105924i("MicroMsg.SnsLabelUI", "the Activity completed");
            String stringExtra = intent2.getStringExtra("Select_Contacts_To_Create_New_Label");
            if (!Util.isNullOrNil(stringExtra)) {
                Intent intent3 = new Intent();
                intent3.putExtra("Select_Contact", stringExtra);
                if (((C32735h) C86312j.m106911c(cls)).mo58779Qe(cVar, 1) == 1) {
                    Log.m105924i("MicroMsg.SnsLabelUI", "startActivity ContactEditLabel ");
                    C88144b.m109795m(getContext(), "label", ".ui.ContactEditLabel", intent3, 4002);
                } else {
                    Log.m105924i("MicroMsg.SnsLabelUI", "startActivity ContactLabelEditUI ");
                    C88144b.m109795m(getContext(), "label", ".ui.ContactLabelEditUI", intent3, 4002);
                }
                SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
                return;
            }
            String stringExtra2 = intent2.getStringExtra("Select_Contact");
            Log.m105925i("MicroMsg.SnsLabelUI", str4, stringExtra2 + str5);
            int i5 = this.f278227s;
            if (i5 == 2) {
                this.f278221j.f286766m.clear();
                if (!Util.isNullOrNil(stringExtra2)) {
                    this.f278221j.f286766m.addAll(Util.stringsToList(stringExtra2.split(str3)));
                    this.f278221j.f286761h = this.f278227s;
                }
            } else {
                String str6 = str3;
                if (i5 == 3) {
                    this.f278221j.f286767n.clear();
                    if (!Util.isNullOrNil(stringExtra2)) {
                        this.f278221j.f286767n.addAll(Util.stringsToList(stringExtra2.split(str6)));
                        this.f278221j.f286761h = this.f278227s;
                    }
                }
            }
            this.f278221j.notifyDataSetChanged();
            this.f278215d.expandGroup(this.f278227s);
            str2 = "com.tencent.mm.plugin.sns.ui.SnsLabelUI";
            str = "onActivityResult";
        } else {
            String str7 = "onActivityResult";
            String str8 = str3;
            String str9 = str5;
            String str10 = "com.tencent.mm.plugin.sns.ui.SnsLabelUI";
            String str11 = str4;
            String str12 = "the Activity completed";
            if (i4 == -1 && i3 == 4001) {
                String stringExtra3 = intent2.getStringExtra("Select_Contact");
                Log.m105925i("MicroMsg.SnsLabelUI", str11, stringExtra3 + str9);
                if (!Util.isNullOrNil(stringExtra3)) {
                    Intent intent4 = new Intent();
                    intent4.putExtra("Select_Contact", stringExtra3);
                    if (((C32735h) C86312j.m106911c(cls)).mo58779Qe(cVar, 1) == 1) {
                        Log.m105924i("MicroMsg.SnsLabelUI", "startActivity ContactEditLabel ");
                        C88144b.m109795m(getContext(), "label", ".ui.ContactEditLabel", intent4, 4002);
                    } else {
                        Log.m105924i("MicroMsg.SnsLabelUI", "startActivity ContactLabelEditUI ");
                        C88144b.m109795m(getContext(), "label", ".ui.ContactLabelEditUI", intent4, 4002);
                    }
                }
            } else if (i4 == 0 && i3 == 4002 && intent2 != null) {
                String stringExtra4 = intent2.getStringExtra("k_sns_label_add_label");
                this.f278229u = intent2.getStringExtra("k_sns_label_add_label");
                this.f278230v = intent2.getStringArrayListExtra("k_sns_label_add_label_usernames");
                this.f278215d.postDelayed(new C95569i(stringExtra4), 600);
            } else if (i4 == -1 && i3 == 4004) {
                Log.m105924i("MicroMsg.SnsLabelUI", str12);
                String stringExtra5 = intent2.getStringExtra("select_chatrooms");
                Log.m105925i("MicroMsg.SnsLabelUI", str11, stringExtra5 + str9);
                int i6 = this.f278227s;
                if (i6 == 2) {
                    this.f278221j.f286768o.clear();
                    if (!Util.isNullOrNil(stringExtra5)) {
                        this.f278221j.f286768o.addAll(Util.stringsToList(stringExtra5.split(str8)));
                        this.f278221j.f286761h = this.f278227s;
                    }
                } else {
                    String str13 = str8;
                    if (i6 == 3) {
                        this.f278221j.f286769p.clear();
                        if (!Util.isNullOrNil(stringExtra5)) {
                            this.f278221j.f286769p.addAll(Util.stringsToList(stringExtra5.split(str13)));
                            this.f278221j.f286761h = this.f278227s;
                        }
                    }
                }
                this.f278221j.notifyDataSetChanged();
                this.f278215d.expandGroup(this.f278227s);
            }
            str = str7;
            str2 = str10;
        }
        SnsMethodCalculate.markEndTimeMs(str, str2);
    }

    public void onCreate(Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        Log.m105924i("MicroMsg.SnsLabelUI", "onCreate");
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.jil);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(JsApiSetAudioState.CTRL_INDEX, this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(C28613b.CTRL_INDEX, this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(638, this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(C82086j.CTRL_INDEX, this);
        C97753a aVar = new C97753a(this);
        this.f278221j = aVar;
        C95563d dVar = new C95563d();
        SnsMethodCalculate.markStartTimeMs("setInnerClickListener", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        aVar.f286772s = dVar;
        SnsMethodCalculate.markEndTimeMs("setInnerClickListener", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        Intent intent = getIntent();
        if (intent == null) {
            this.f278222n = 0;
            this.f278221j.f286760g = 0;
            this.f278217f = null;
            this.f278218g = null;
            this.f278219h = null;
        } else {
            this.f278223o = intent.getBooleanExtra("Kis_from_text_status", false);
            this.f278222n = intent.getIntExtra("KLabel_range_index", 0);
            this.f278221j.f286760g = intent.getIntExtra("k_sns_label_ui_style", 0);
            this.f278217f = intent.getStringExtra("Klabel_name_list");
            this.f278218g = intent.getStringExtra("Kother_user_name_list");
            this.f278219h = intent.getStringExtra("Kchat_room_name_list");
            this.f278232x = getIntent().getIntExtra("CONTACT_INFO_UI_SOURCE", 10);
            if (!TextUtils.isEmpty(intent.getStringExtra("k_sns_label_ui_title"))) {
                setMMTitle(intent.getStringExtra("k_sns_label_ui_title"));
            }
        }
        C97753a aVar2 = this.f278221j;
        aVar2.f286761h = this.f278222n;
        aVar2.f286762i = this.f278223o;
        if (aVar2.f286760g == 1) {
            findViewById(C0966R.C0970id.jtx).setBackgroundResource(C0966R.color.f3131gg);
        }
        int i = this.f278222n;
        if (i == 2) {
            if (!TextUtils.isEmpty(this.f278217f)) {
                this.f278221j.f286764k = Util.stringsToList(this.f278217f.split(","));
            }
            if (!TextUtils.isEmpty(this.f278218g)) {
                this.f278221j.f286766m = Util.stringsToList(this.f278218g.split(","));
            }
            String str = this.f278219h;
            if (str != null && !str.isEmpty()) {
                this.f278221j.f286768o = Util.stringsToList(this.f278219h.split(","));
            }
        } else if (i == 3) {
            if (!TextUtils.isEmpty(this.f278217f)) {
                this.f278221j.f286765l = Util.stringsToList(this.f278217f.split(","));
            }
            if (!TextUtils.isEmpty(this.f278218g)) {
                this.f278221j.f286767n = Util.stringsToList(this.f278218g.split(","));
            }
            String str2 = this.f278219h;
            if (str2 != null && !str2.isEmpty()) {
                this.f278221j.f286769p = Util.stringsToList(this.f278219h.split(","));
            }
        }
        SnsMethodCalculate.markStartTimeMs("getTagNames", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        C86709a0.m107528h();
        if (((Boolean) C86709a0.m107535s().mo121142i().mo119684e(335873, Boolean.TRUE)).booleanValue()) {
            this.f278225q = true;
            this.f278226r = true;
            if (mo132810R7() >= 1) {
                this.f278224p = true;
            }
            C86709a0.m107528h();
            C86709a0.m107529k().f251779b.mo123460f(new C43039l0(1));
        }
        SnsMethodCalculate.markEndTimeMs("getTagNames", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        initView();
        SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
    }

    public void onDestroy() {
        SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(JsApiSetAudioState.CTRL_INDEX, this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(C28613b.CTRL_INDEX, this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(638, this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(C82086j.CTRL_INDEX, this);
        super.onDestroy();
        C60960c.f173618a.mo85927k("SnsPublishProcess", "privacyPageStaytime_", Long.valueOf(getActivityBrowseTimeMs()), C60242i.APPEND);
        SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
    }

    public void onResume() {
        AnimatedExpandableListView animatedExpandableListView;
        SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        Log.m105924i("MicroMsg.SnsLabelUI", "onResume");
        if (!(this.f278221j == null || this.f278229u != null || (animatedExpandableListView = this.f278215d) == null)) {
            animatedExpandableListView.postDelayed(new C95560a(), 600);
        }
        super.onResume();
        SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x024c, code lost:
        if (r4 != false) goto L_0x027a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSceneEnd(int r18, int r19, java.lang.String r20, ob0.C117747y r21) {
        /*
            r17 = this;
            r0 = r17
            java.lang.String r1 = "onSceneEnd"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ui.SnsLabelUI"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            r3 = 3
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r18)
            r6 = 0
            r4[r6] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r19)
            r7 = 1
            r4[r7] = r5
            r5 = 2
            r4[r5] = r20
            java.lang.String r8 = "MicroMsg.SnsLabelUI"
            java.lang.String r9 = "dz:[onSceneEnd]errType:%d errCode:%d errMsg:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r9, r4)
            boolean r4 = r0.f278225q
            if (r4 != 0) goto L_0x002d
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return
        L_0x002d:
            int r4 = r21.getType()
            r9 = 290(0x122, float:4.06E-43)
            if (r4 == r9) goto L_0x029d
            r9 = 292(0x124, float:4.09E-43)
            r10 = 335873(0x52001, float:4.70658E-40)
            java.lang.String r11 = ","
            if (r4 == r9) goto L_0x0189
            r9 = 635(0x27b, float:8.9E-43)
            if (r4 == r9) goto L_0x0109
            r9 = 638(0x27e, float:8.94E-43)
            if (r4 == r9) goto L_0x0048
            goto L_0x02a7
        L_0x0048:
            if (r18 != 0) goto L_0x00ff
            if (r19 != 0) goto L_0x00ff
            java.util.ArrayList<java.lang.String> r4 = r0.f278233y
            java.util.Iterator r4 = r4.iterator()
            java.util.ArrayList<java.lang.Long> r8 = r0.f278213A
            java.util.Iterator r8 = r8.iterator()
        L_0x0058:
            boolean r9 = r4.hasNext()
            if (r9 == 0) goto L_0x008f
            java.lang.Object r9 = r8.next()
            java.lang.Long r9 = (java.lang.Long) r9
            long r11 = r9.longValue()
            java.lang.Object r9 = r4.next()
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r13 = "deleteTag"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r2)
            r14 = 0
            int r16 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r16 != 0) goto L_0x007a
            goto L_0x008b
        L_0x007a:
            f40.C86709a0.m107528h()
            f40.g r14 = f40.C86709a0.m107529k()
            ob0.b0 r14 = r14.f251779b
            com.tencent.mm.plugin.sns.model.n0 r15 = new com.tencent.mm.plugin.sns.model.n0
            r15.<init>(r3, r11, r9)
            r14.mo123460f(r15)
        L_0x008b:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r2)
            goto L_0x0058
        L_0x008f:
            java.lang.String r4 = "cleanFailedRecord"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r2)
            f40.C86709a0.m107528h()
            f40.o r8 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r8 = r8.mo121142i()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)
            r11 = 335874(0x52002, float:4.7066E-40)
            r8.mo119676J(r11, r9)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r2)
            b22.b r4 = b22.C28250a.m38138a()
            a22.a r4 = (a22.C67001a) r4
            java.util.List r4 = r4.mo90967e()
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            r0.f278216e = r4
            com.tencent.mm.plugin.report.service.n r4 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r8 = 11455(0x2cbf, float:1.6052E-41)
            r9 = 4
            java.lang.Object[] r9 = new java.lang.Object[r9]
            java.lang.String r11 = ""
            r9[r6] = r11
            r9[r7] = r11
            int r7 = r0.f278231w
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r9[r5] = r7
            java.util.ArrayList<java.lang.String> r5 = r0.f278234z
            if (r5 != 0) goto L_0x00d4
            goto L_0x00d8
        L_0x00d4:
            int r6 = r5.size()
        L_0x00d8:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            r9[r3] = r5
            r4.mo160131h(r8, r9)
            com.tencent.mm.ui.widget.listview.AnimatedExpandableListView r3 = r0.f278215d
            com.tencent.mm.plugin.sns.ui.SnsLabelUI$b r4 = new com.tencent.mm.plugin.sns.ui.SnsLabelUI$b
            r4.<init>()
            r5 = 600(0x258, double:2.964E-321)
            r3.postDelayed(r4, r5)
            f40.C86709a0.m107528h()
            f40.o r3 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r3 = r3.mo121142i()
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r3.mo119676J(r10, r4)
            goto L_0x02a7
        L_0x00ff:
            r17.mo132813U7()
            java.lang.String r3 = "dz: error at modify label list!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r3)
            goto L_0x02a7
        L_0x0109:
            if (r18 != 0) goto L_0x017f
            if (r19 != 0) goto L_0x017f
            java.util.ArrayList<java.lang.String[]> r3 = r0.f278214B
            java.lang.String r4 = "addContactToLabels"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r2)
            java.util.ArrayList<java.lang.String> r5 = r0.f278234z
            if (r5 == 0) goto L_0x017a
            int r5 = r5.size()
            if (r5 != 0) goto L_0x011f
            goto L_0x017a
        L_0x011f:
            java.util.ArrayList<java.lang.String> r5 = r0.f278234z
            java.util.Iterator r5 = r5.iterator()
            java.util.Iterator r3 = r3.iterator()
            java.util.ArrayList r6 = new java.util.ArrayList
            java.util.ArrayList<java.lang.String> r8 = r0.f278234z
            int r8 = r8.size()
            r6.<init>(r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            java.util.ArrayList<java.lang.String> r9 = r0.f278234z
            int r9 = r9.size()
            r8.<init>(r9)
        L_0x013f:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L_0x016c
            b22.b r9 = b22.C28250a.m38138a()
            java.lang.Object r10 = r5.next()
            java.lang.String r10 = (java.lang.String) r10
            a22.a r9 = (a22.C67001a) r9
            java.lang.String r9 = r9.mo90968f(r10)
            r6.add(r9)
            java.lang.Object r9 = r3.next()
            java.lang.String[] r9 = (java.lang.String[]) r9
            java.util.List r9 = java.util.Arrays.asList(r9)
            java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.Util.listToString(r9, r11)
            r8.add(r9)
            r0.f278225q = r7
            goto L_0x013f
        L_0x016c:
            b22.b r3 = b22.C28250a.m38138a()
            a22.a r3 = (a22.C67001a) r3
            r3.mo90964b(r6, r8)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r2)
            goto L_0x02a7
        L_0x017a:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r2)
            goto L_0x02a7
        L_0x017f:
            r17.mo132813U7()
            java.lang.String r3 = "dz: error at add contact label!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r3)
            goto L_0x02a7
        L_0x0189:
            if (r18 != 0) goto L_0x0292
            if (r19 != 0) goto L_0x0292
            os2.m0 r3 = com.tencent.p014mm.plugin.sns.model.C94866e1.ey0()
            android.database.Cursor r3 = r3.mo11653Yt()
            int r4 = r3.getCount()
            r0.f278231w = r4
            if (r4 <= 0) goto L_0x024f
            java.lang.String r4 = "transformTags"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r2)
            r3.moveToFirst()
            os2.l0 r5 = new os2.l0
            r5.<init>()
            int r9 = r3.getCount()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>(r9)
            r0.f278234z = r12
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>(r9)
            r0.f278233y = r12
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>(r9)
            r0.f278214B = r12
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>(r9)
            r0.f278213A = r12
        L_0x01cb:
            boolean r9 = r3.isAfterLast()
            if (r9 != 0) goto L_0x0238
            r5.convertFrom(r3)
            java.lang.String r9 = r5.field_memberList
            if (r9 == 0) goto L_0x022f
            int r9 = r9.length()
            if (r9 == 0) goto L_0x022f
            java.util.ArrayList<java.lang.String[]> r9 = r0.f278214B
            java.lang.String r12 = r5.field_memberList
            java.lang.String[] r12 = r12.split(r11)
            r9.add(r12)
            java.lang.String r9 = r5.field_tagName
            java.util.ArrayList<java.lang.String> r12 = r0.f278234z
            java.lang.String r13 = "genLabelName"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r2)
            b22.b r14 = b22.C28250a.m38138a()
            a22.a r14 = (a22.C67001a) r14
            java.util.List r14 = r14.mo90966d()
            if (r14 != 0) goto L_0x01ff
            goto L_0x0207
        L_0x01ff:
            java.util.ArrayList r14 = (java.util.ArrayList) r14
            boolean r14 = r14.contains(r9)
            if (r14 != 0) goto L_0x0209
        L_0x0207:
            r14 = r9
            goto L_0x0218
        L_0x0209:
            r14 = 2131836978(0x7f114032, float:1.9307138E38)
            java.lang.String r14 = r0.getString(r14)
            java.lang.Object[] r15 = new java.lang.Object[r7]
            r15[r6] = r9
            java.lang.String r14 = java.lang.String.format(r14, r15)
        L_0x0218:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r2)
            r12.add(r14)
            java.util.ArrayList<java.lang.String> r12 = r0.f278233y
            r12.add(r9)
            java.util.ArrayList<java.lang.Long> r9 = r0.f278213A
            long r12 = r5.field_tagId
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            r9.add(r12)
            goto L_0x0234
        L_0x022f:
            java.lang.String r9 = "dz:snstaginfo memberlist is null."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r9)
        L_0x0234:
            r3.moveToNext()
            goto L_0x01cb
        L_0x0238:
            r3.close()
            java.util.ArrayList<java.lang.String> r5 = r0.f278233y
            int r5 = r5.size()
            if (r5 != 0) goto L_0x0248
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r2)
            r4 = 0
            goto L_0x024c
        L_0x0248:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r2)
            r4 = 1
        L_0x024c:
            if (r4 == 0) goto L_0x024f
            goto L_0x027a
        L_0x024f:
            boolean r4 = r0.f278226r
            if (r4 == 0) goto L_0x027a
            ev2.a r4 = r0.f278221j
            int r5 = r0.f278227s
            r4.f286761h = r5
            com.tencent.mm.ui.widget.listview.AnimatedExpandableListView r4 = r0.f278215d
            if (r4 == 0) goto L_0x026a
            int r4 = r4.getChildCount()
            if (r4 <= 0) goto L_0x026a
            com.tencent.mm.ui.widget.listview.AnimatedExpandableListView r4 = r0.f278215d
            int r5 = r0.f278227s
            r4.mo136339e(r5)
        L_0x026a:
            f40.C86709a0.m107528h()
            f40.o r4 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r4 = r4.mo121142i()
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r4.mo119676J(r10, r5)
        L_0x027a:
            r3.close()
            boolean r3 = r0.f278224p
            if (r3 == 0) goto L_0x028f
            r0.f278225q = r7
            b22.b r3 = b22.C28250a.m38138a()
            java.util.ArrayList<java.lang.String> r4 = r0.f278234z
            a22.a r3 = (a22.C67001a) r3
            r3.mo90963a(r4)
            goto L_0x029a
        L_0x028f:
            r0.f278225q = r6
            goto L_0x029a
        L_0x0292:
            r17.mo132813U7()
            java.lang.String r3 = "dz: error at get sns tag list!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r3)
        L_0x029a:
            r0.f278226r = r6
            goto L_0x02a7
        L_0x029d:
            if (r18 != 0) goto L_0x02a2
            if (r19 != 0) goto L_0x02a2
            goto L_0x02a7
        L_0x02a2:
            java.lang.String r3 = "dz: error at delete tag list!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r3)
        L_0x02a7:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.SnsLabelUI.onSceneEnd(int, int, java.lang.String, ob0.y):void");
    }
}
