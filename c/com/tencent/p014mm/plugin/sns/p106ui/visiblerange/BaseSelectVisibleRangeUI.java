package com.tencent.p014mm.plugin.sns.p106ui.visiblerange;

import a22.C67001a;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
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
import com.tencent.p014mm.autogen.events.GetSnsObjectDetailEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.TimelineGroupUserBehaviorStruct;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.p136ui.contact.C74560s1;
import com.tencent.p014mm.p136ui.widget.listview.AnimatedExpandableListView;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.C82086j;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.model.C94877g0;
import com.tencent.p014mm.plugin.sns.p106ui.C96270w1;
import com.tencent.p014mm.plugin.sns.p106ui.C96313x4;
import com.tencent.p014mm.plugin.sns.p106ui.NewSnsLabelUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.x4$$j;
import com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper;
import com.tencent.p014mm.protocal.protobuf.SnsObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import dv2.C58442c;
import dv2.C97555a;
import dv2.C97557d;
import f40.C86709a0;
import h81.C32735h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import ke3.C88144b;
import kg3.C76577a;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import qo3.C89779i0;
import sf0.C48374j0;
import te3.t74;

/* renamed from: com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI */
public abstract class BaseSelectVisibleRangeUI extends MMActivity {

    /* renamed from: B */
    public static final /* synthetic */ int f281300B = 0;

    /* renamed from: A */
    public int f281301A;

    /* renamed from: d */
    public AnimatedExpandableListView f281302d;

    /* renamed from: e */
    public ArrayList<String> f281303e;

    /* renamed from: f */
    public String f281304f = "";

    /* renamed from: g */
    public String f281305g = "";

    /* renamed from: h */
    public ArrayList<String> f281306h = new ArrayList<>();

    /* renamed from: i */
    public String f281307i = "";

    /* renamed from: j */
    public String f281308j = "";

    /* renamed from: n */
    public C96313x4 f281309n;

    /* renamed from: o */
    public C58442c f281310o;

    /* renamed from: p */
    public int f281311p;

    /* renamed from: q */
    public boolean f281312q;

    /* renamed from: r */
    public boolean f281313r;

    /* renamed from: s */
    public boolean f281314s;

    /* renamed from: t */
    public int f281315t;

    /* renamed from: u */
    public C89779i0 f281316u;

    /* renamed from: v */
    public String f281317v;

    /* renamed from: w */
    public ArrayList<String> f281318w;

    /* renamed from: x */
    public C97557d f281319x;

    /* renamed from: y */
    public C96268j f281320y;

    /* renamed from: z */
    public ArrayList<String> f281321z;

    /* renamed from: com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI$a */
    public class C96258a implements Runnable {
        public C96258a() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI$10");
            ((C67001a) C28250a.m38138a()).mo90965c();
            BaseSelectVisibleRangeUI.m123413K7(BaseSelectVisibleRangeUI.this, (ArrayList) ((C67001a) C28250a.m38138a()).mo90967e());
            BaseSelectVisibleRangeUI baseSelectVisibleRangeUI = BaseSelectVisibleRangeUI.this;
            baseSelectVisibleRangeUI.f281309n.mo134147l(BaseSelectVisibleRangeUI.m123412J7(baseSelectVisibleRangeUI));
            BaseSelectVisibleRangeUI.this.f281309n.notifyDataSetChanged();
            BaseSelectVisibleRangeUI baseSelectVisibleRangeUI2 = BaseSelectVisibleRangeUI.this;
            SnsMethodCalculate.markStartTimeMs("access$1502", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
            baseSelectVisibleRangeUI2.f281317v = null;
            SnsMethodCalculate.markEndTimeMs("access$1502", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI$10");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI$b */
    public class C96259b implements x4$$j {
        public C96259b() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI$c */
    public class C96260c implements ExpandableListView.OnGroupClickListener {

        /* renamed from: com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI$c$a */
        public class C96261a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ int f281325d;

            public C96261a(int i) {
                this.f281325d = i;
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI$2$1");
                BaseSelectVisibleRangeUI.m123410H7(BaseSelectVisibleRangeUI.this).mo136339e(this.f281325d);
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI$2$1");
            }
        }

        public C96260c() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:52:0x021c, code lost:
            if (r2 != false) goto L_0x021e;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onGroupClick(android.widget.ExpandableListView r9, android.view.View r10, int r11, long r12) {
            /*
                r8 = this;
                java.lang.String r9 = "onGroupClick"
                java.lang.String r10 = "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI$2"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r10)
                boolean r12 = com.tencent.p014mm.plugin.sns.model.C94847c1.m120213a()
                r13 = 1
                r0 = 0
                if (r12 == 0) goto L_0x0048
                com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI r12 = com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.this
                android.content.Intent r12 = r12.getIntent()
                java.lang.String r1 = "Kis_with_together"
                boolean r12 = r12.getBooleanExtra(r1, r0)
                if (r12 == 0) goto L_0x0048
                com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI r12 = com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.this
                dv2.c r12 = r12.f281310o
                boolean r12 = r12.mo83396b(r11, r13)
                if (r12 == 0) goto L_0x0048
                qo3.q r11 = new qo3.q
                com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI r12 = com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.this
                r11.<init>(r12)
                com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI r12 = com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.this
                r13 = 2131837279(0x7f11415f, float:1.9307749E38)
                java.lang.String r12 = r12.getString(r13)
                r11.mo107595g(r12)
                r12 = 2131821556(0x7f1103f4, float:1.9275859E38)
                r11.mo107601m(r12)
                r11.mo107603o()
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r10)
                return r0
            L_0x0048:
                com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI r12 = com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.this
                dv2.c r1 = r12.f281310o
                com.tencent.mm.plugin.sns.ui.x4 r12 = r12.f281309n
                int r12 = r12.f281650i
                int r12 = r1.mo83402h(r12)
                com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI r1 = com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.this
                dv2.c r1 = r1.f281310o
                int r1 = r1.mo83404j(r11)
                com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI r2 = com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.this
                dv2.c r3 = r2.f281310o
                com.tencent.mm.plugin.sns.ui.x4 r2 = r2.f281309n
                int r2 = r2.f281650i
                r3.getClass()
                java.lang.String r2 = "preCheckOnSelectVisibleState"
                java.lang.String r3 = "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
                com.tencent.mm.plugin.sns.statistics.SnsReportHelper r2 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
                r2.mo131365Z(r1)
                r2 = 2
                java.lang.Object[] r3 = new java.lang.Object[r2]
                java.lang.Integer r4 = java.lang.Integer.valueOf(r12)
                r3[r0] = r4
                java.lang.Integer r4 = java.lang.Integer.valueOf(r11)
                r3[r13] = r4
                java.lang.String r4 = "MicroMsg.BaseSelectVisibleRangeUI"
                java.lang.String r5 = "user click [previousGroup: %d    onGroupClick:%d]"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r5, r3)
                com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI r3 = com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.this
                dv2.c r3 = r3.f281310o
                boolean r3 = r3.mo83396b(r11, r2)
                r5 = 3
                if (r3 != 0) goto L_0x00d0
                com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI r3 = com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.this
                dv2.c r3 = r3.f281310o
                boolean r3 = r3.mo83396b(r11, r5)
                if (r3 == 0) goto L_0x00a4
                goto L_0x00d0
            L_0x00a4:
                com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI r11 = com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.this
                r11.enableOptionMenu(r13)
                com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI r11 = com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.this
                dv2.c r11 = r11.f281310o
                boolean r11 = r11.mo83396b(r12, r2)
                if (r11 != 0) goto L_0x00bd
                com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI r11 = com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.this
                dv2.c r11 = r11.f281310o
                boolean r11 = r11.mo83396b(r12, r5)
                if (r11 == 0) goto L_0x00c6
            L_0x00bd:
                com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI r11 = com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.this
                com.tencent.mm.ui.widget.listview.AnimatedExpandableListView r11 = com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.m123410H7(r11)
                r11.mo136338c(r12)
            L_0x00c6:
                com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI r11 = com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.this
                com.tencent.mm.plugin.sns.ui.x4 r11 = r11.f281309n
                r11.f281650i = r1
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r10)
                return r0
            L_0x00d0:
                com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI r3 = com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.this
                java.util.ArrayList r3 = com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.m123414L7(r3)
                java.lang.String r6 = "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI"
                if (r3 == 0) goto L_0x0129
                com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI r3 = com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.this
                java.util.ArrayList r3 = com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.m123414L7(r3)
                int r3 = r3.size()
                if (r3 == 0) goto L_0x0129
                com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI r3 = com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.this
                java.lang.String r7 = "access$300"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r6)
                int r3 = r3.mo133951R7()
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r6)
                if (r3 != 0) goto L_0x0129
                com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI r11 = com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.this
                com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.m123417O7(r11, r1)
                com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI r11 = com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.this
                r11.getClass()
                java.lang.String r12 = "showTransformDialog"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r6)
                r0 = 2131837009(0x7f114051, float:1.93072E38)
                java.lang.String r0 = r11.getString(r0)
                r1 = 2131837008(0x7f114050, float:1.9307199E38)
                java.lang.String r1 = r11.getString(r1)
                dv2.b r2 = new dv2.b
                r2.<init>(r11)
                r3 = 0
                nj3.C76879j.m92754y(r11, r0, r3, r1, r2)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r6)
                java.lang.String r11 = "dz[previousGroup: need transform]"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r11)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r10)
                return r13
            L_0x0129:
                com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI r3 = com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.this
                java.lang.String r4 = "access$500"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r6)
                r3.getClass()
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r6)
                if (r12 != r11) goto L_0x015a
                com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI r12 = com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.this
                com.tencent.mm.ui.widget.listview.AnimatedExpandableListView r12 = com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.m123410H7(r12)
                boolean r12 = r12.isGroupExpanded(r11)
                if (r12 == 0) goto L_0x014f
                com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI r12 = com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.this
                com.tencent.mm.ui.widget.listview.AnimatedExpandableListView r12 = com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.m123410H7(r12)
                r12.mo136338c(r11)
                goto L_0x0230
            L_0x014f:
                com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI r12 = com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.this
                com.tencent.mm.ui.widget.listview.AnimatedExpandableListView r12 = com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.m123410H7(r12)
                r12.mo136339e(r11)
                goto L_0x0230
            L_0x015a:
                com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI r3 = com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.this
                dv2.c r3 = r3.f281310o
                boolean r3 = r3.mo83396b(r12, r2)
                java.lang.String r4 = ","
                java.lang.String r7 = "access$800"
                if (r3 == 0) goto L_0x01a0
                com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI r12 = com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.this
                com.tencent.mm.ui.widget.listview.AnimatedExpandableListView r12 = com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.m123410H7(r12)
                com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI r0 = com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.this
                dv2.c r0 = r0.f281310o
                int r0 = r0.mo83402h(r2)
                r12.collapseGroup(r0)
                com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI r12 = com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.this
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r6)
                boolean r0 = r12.mo133954W7()
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r6)
                r12.enableOptionMenu(r0)
                com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI r12 = com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.this
                java.lang.String r12 = r12.f281307i
                boolean r12 = android.text.TextUtils.isEmpty(r12)
                if (r12 == 0) goto L_0x0222
                com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI r12 = com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.this
                com.tencent.mm.plugin.sns.ui.x4 r0 = r12.f281309n
                java.util.ArrayList<java.lang.String> r0 = r0.f281655n
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.listToString(r0, r4)
                r12.f281307i = r0
                goto L_0x0222
            L_0x01a0:
                com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI r2 = com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.this
                dv2.c r2 = r2.f281310o
                boolean r2 = r2.mo83396b(r12, r5)
                java.lang.String r3 = "access$900"
                if (r2 == 0) goto L_0x01e3
                com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI r12 = com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.this
                com.tencent.mm.ui.widget.listview.AnimatedExpandableListView r12 = com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.m123410H7(r12)
                com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI r0 = com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.this
                dv2.c r0 = r0.f281310o
                int r0 = r0.mo83402h(r5)
                r12.collapseGroup(r0)
                com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI r12 = com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.this
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r6)
                boolean r0 = r12.mo133955X7()
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r6)
                r12.enableOptionMenu(r0)
                com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI r12 = com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.this
                java.lang.String r12 = r12.f281307i
                boolean r12 = android.text.TextUtils.isEmpty(r12)
                if (r12 == 0) goto L_0x0222
                com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI r12 = com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.this
                com.tencent.mm.plugin.sns.ui.x4 r0 = r12.f281309n
                java.util.ArrayList<java.lang.String> r0 = r0.f281656o
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.listToString(r0, r4)
                r12.f281307i = r0
                goto L_0x0222
            L_0x01e3:
                com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI r2 = com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.this
                dv2.c r2 = r2.f281310o
                boolean r2 = r2.mo83396b(r12, r13)
                if (r2 != 0) goto L_0x0202
                com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI r2 = com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.this
                dv2.c r2 = r2.f281310o
                boolean r2 = r2.mo83396b(r12, r0)
                if (r2 != 0) goto L_0x0202
                com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI r2 = com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.this
                dv2.c r2 = r2.f281310o
                r4 = 4
                boolean r12 = r2.mo83396b(r12, r4)
                if (r12 == 0) goto L_0x0222
            L_0x0202:
                com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI r12 = com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.this
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r6)
                boolean r2 = r12.mo133954W7()
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r6)
                if (r2 != 0) goto L_0x021e
                com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI r2 = com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.this
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r6)
                boolean r2 = r2.mo133955X7()
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r6)
                if (r2 == 0) goto L_0x021f
            L_0x021e:
                r0 = 1
            L_0x021f:
                r12.enableOptionMenu(r0)
            L_0x0222:
                com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI r12 = com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.this
                com.tencent.mm.ui.widget.listview.AnimatedExpandableListView r12 = com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.m123410H7(r12)
                com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI$c$a r0 = new com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI$c$a
                r0.<init>(r11)
                r12.post(r0)
            L_0x0230:
                com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI r11 = com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.this
                com.tencent.mm.plugin.sns.ui.x4 r11 = r11.f281309n
                r11.f281650i = r1
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r10)
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.C96260c.onGroupClick(android.widget.ExpandableListView, android.view.View, int, long):boolean");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI$d */
    public class C96262d implements ExpandableListView.OnChildClickListener {
        public C96262d() {
        }

        public boolean onChildClick(ExpandableListView expandableListView, View view, int i, int i2, long j) {
            SnsMethodCalculate.markStartTimeMs("onChildClick", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI$3");
            int j2 = BaseSelectVisibleRangeUI.this.f281310o.mo83404j(i);
            Log.m105925i("MicroMsg.BaseSelectVisibleRangeUI", "ExpandableListView click groupPosition:%d, childPosition:%d, visibleState:%d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(j2));
            if (BaseSelectVisibleRangeUI.this.f281310o.mo83395a(j2, i2, C96313x4.f281640v)) {
                BaseSelectVisibleRangeUI.m123417O7(BaseSelectVisibleRangeUI.this, j2);
                BaseSelectVisibleRangeUI.this.mo132277U7();
                SnsReportHelper snsReportHelper = SnsReportHelper.f275506m0;
                snsReportHelper.getClass();
                SnsMethodCalculate.markStartTimeMs("increaseFromContactClick", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
                TimelineGroupUserBehaviorStruct timelineGroupUserBehaviorStruct = snsReportHelper.f275557n;
                if (timelineGroupUserBehaviorStruct != null) {
                    int i3 = timelineGroupUserBehaviorStruct.f266390s;
                    if (i3 <= 0) {
                        timelineGroupUserBehaviorStruct.f266390s = 1;
                    } else {
                        timelineGroupUserBehaviorStruct.f266390s = i3 + 1;
                    }
                }
                SnsMethodCalculate.markEndTimeMs("increaseFromContactClick", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            } else if (BaseSelectVisibleRangeUI.this.f281310o.mo83395a(j2, i2, C96313x4.f281639u)) {
                BaseSelectVisibleRangeUI.m123417O7(BaseSelectVisibleRangeUI.this, j2);
                BaseSelectVisibleRangeUI.this.mo132278V7();
                SnsReportHelper snsReportHelper2 = SnsReportHelper.f275506m0;
                snsReportHelper2.getClass();
                SnsMethodCalculate.markStartTimeMs("increaseFromChatroomClick", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
                TimelineGroupUserBehaviorStruct timelineGroupUserBehaviorStruct2 = snsReportHelper2.f275557n;
                if (timelineGroupUserBehaviorStruct2 != null) {
                    int i4 = timelineGroupUserBehaviorStruct2.f266386o;
                    if (i4 <= 0) {
                        timelineGroupUserBehaviorStruct2.f266386o = 1;
                    } else {
                        timelineGroupUserBehaviorStruct2.f266386o = i4 + 1;
                    }
                }
                SnsMethodCalculate.markEndTimeMs("increaseFromChatroomClick", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            } else {
                String str = (String) BaseSelectVisibleRangeUI.this.f281309n.getChild(i, i2 - C96313x4.f281641w);
                BaseSelectVisibleRangeUI.this.f281309n.mo134132d(str);
                if (BaseSelectVisibleRangeUI.this.f281310o.mo83396b(i, 2)) {
                    BaseSelectVisibleRangeUI baseSelectVisibleRangeUI = BaseSelectVisibleRangeUI.this;
                    BaseSelectVisibleRangeUI.m123411I7(baseSelectVisibleRangeUI, 1, baseSelectVisibleRangeUI.f281309n.f281653l, str, view);
                } else if (BaseSelectVisibleRangeUI.this.f281310o.mo83396b(i, 3)) {
                    BaseSelectVisibleRangeUI baseSelectVisibleRangeUI2 = BaseSelectVisibleRangeUI.this;
                    BaseSelectVisibleRangeUI.m123411I7(baseSelectVisibleRangeUI2, 2, baseSelectVisibleRangeUI2.f281309n.f281654m, str, view);
                }
            }
            SnsMethodCalculate.markEndTimeMs("onChildClick", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI$3");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI$e */
    public class C96263e implements MenuItem.OnMenuItemClickListener {
        public C96263e() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI$4");
            BaseSelectVisibleRangeUI baseSelectVisibleRangeUI = BaseSelectVisibleRangeUI.this;
            int i = BaseSelectVisibleRangeUI.f281300B;
            SnsMethodCalculate.markStartTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
            baseSelectVisibleRangeUI.mo133952S7();
            SnsMethodCalculate.markEndTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
            SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI$4");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI$f */
    public class C96264f implements MenuItem.OnMenuItemClickListener {
        public C96264f() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI$5");
            BaseSelectVisibleRangeUI baseSelectVisibleRangeUI = BaseSelectVisibleRangeUI.this;
            baseSelectVisibleRangeUI.getClass();
            SnsMethodCalculate.markStartTimeMs("setLabelFinish", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
            String listToString = Util.listToString(baseSelectVisibleRangeUI.f281309n.f281653l, ",");
            String listToString2 = Util.listToString(baseSelectVisibleRangeUI.f281309n.f281655n, ",");
            String listToString3 = Util.listToString(baseSelectVisibleRangeUI.f281309n.f281657p, ",");
            String listToString4 = Util.listToString(baseSelectVisibleRangeUI.f281309n.f281654m, ",");
            String listToString5 = Util.listToString(baseSelectVisibleRangeUI.f281309n.f281656o, ",");
            String listToString6 = Util.listToString(baseSelectVisibleRangeUI.f281309n.f281658q, ",");
            if ((baseSelectVisibleRangeUI.f281310o.mo83405k(baseSelectVisibleRangeUI.f281309n.f281650i, 2) && baseSelectVisibleRangeUI.f281309n.f281653l.size() == 0 && baseSelectVisibleRangeUI.f281309n.f281655n.size() == 0 && baseSelectVisibleRangeUI.f281309n.f281657p.size() == 0) || (baseSelectVisibleRangeUI.f281310o.mo83405k(baseSelectVisibleRangeUI.f281309n.f281650i, 3) && baseSelectVisibleRangeUI.f281309n.f281654m.size() == 0 && baseSelectVisibleRangeUI.f281309n.f281656o.size() == 0 && baseSelectVisibleRangeUI.f281309n.f281658q.size() == 0)) {
                C76879j.m92754y(baseSelectVisibleRangeUI, baseSelectVisibleRangeUI.getString(C0966R.string.jdt), "", baseSelectVisibleRangeUI.getString(C0966R.string.je5), (DialogInterface.OnClickListener) null);
                SnsMethodCalculate.markEndTimeMs("setLabelFinish", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
            } else if ((!baseSelectVisibleRangeUI.f281310o.mo83405k(baseSelectVisibleRangeUI.f281309n.f281650i, 2) || !Util.isNullOrNil(listToString) || !Util.isNullOrNil(listToString2) || !Util.isNullOrNil(listToString3)) && (!baseSelectVisibleRangeUI.f281310o.mo83405k(baseSelectVisibleRangeUI.f281309n.f281650i, 3) || !Util.isNullOrNil(listToString4) || !Util.isNullOrNil(listToString5) || !Util.isNullOrNil(listToString6))) {
                baseSelectVisibleRangeUI.mo133956Y7();
                SnsMethodCalculate.markEndTimeMs("setLabelFinish", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
            } else {
                C76879j.m92754y(baseSelectVisibleRangeUI, baseSelectVisibleRangeUI.getString(C0966R.string.jdt), "", baseSelectVisibleRangeUI.getString(C0966R.string.je5), (DialogInterface.OnClickListener) null);
                SnsMethodCalculate.markEndTimeMs("setLabelFinish", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
            }
            SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI$5");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI$g */
    public class C96265g implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f281330d;

        public C96265g(String str) {
            this.f281330d = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0165, code lost:
            if (r4 != 4) goto L_0x017b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r12 = this;
                java.lang.String r0 = "run"
                java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI$7"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
                com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI r2 = com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.this
                b22.b r3 = b22.C28250a.m38138a()
                a22.a r3 = (a22.C67001a) r3
                java.util.List r3 = r3.mo90967e()
                java.util.ArrayList r3 = (java.util.ArrayList) r3
                com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.m123413K7(r2, r3)
                com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI r2 = com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.this
                java.util.ArrayList r2 = com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.m123412J7(r2)
                if (r2 != 0) goto L_0x002b
                com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI r2 = com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.this
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.m123413K7(r2, r3)
            L_0x002b:
                java.lang.String r2 = r12.f281330d
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
                r3 = -1
                if (r2 != 0) goto L_0x005a
                com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI r2 = com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.this
                java.util.ArrayList r2 = com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.m123412J7(r2)
                java.lang.String r4 = r12.f281330d
                boolean r2 = r2.contains(r4)
                if (r2 != 0) goto L_0x004d
                com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI r2 = com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.this
                java.util.ArrayList r2 = com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.m123412J7(r2)
                java.lang.String r4 = r12.f281330d
                r2.add(r4)
            L_0x004d:
                com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI r2 = com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.this
                java.util.ArrayList r2 = com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.m123412J7(r2)
                java.lang.String r4 = r12.f281330d
                int r2 = r2.indexOf(r4)
                goto L_0x005b
            L_0x005a:
                r2 = -1
            L_0x005b:
                com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI r4 = com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.this
                com.tencent.mm.plugin.sns.ui.x4 r5 = r4.f281309n
                java.util.ArrayList r4 = com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.m123412J7(r4)
                r5.mo134147l(r4)
                com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI r4 = com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.this
                com.tencent.mm.plugin.sns.ui.x4 r5 = r4.f281309n
                int r4 = com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.m123416N7(r4)
                r5.f281650i = r4
                b22.b r4 = b22.C28250a.m38138a()
                java.lang.String r5 = r12.f281330d
                a22.a r4 = (a22.C67001a) r4
                java.lang.String r4 = r4.mo90968f(r5)
                com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI r5 = com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.this
                java.lang.String r6 = "access$1400"
                java.lang.String r7 = "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r7)
                java.util.ArrayList<java.lang.String> r5 = r5.f281318w
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r7)
                java.lang.String r8 = "saveInfoAboutNewCreateLabel"
                java.lang.String r9 = "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r9)
                com.tencent.p014mm.plugin.sns.p106ui.C96313x4.f281643y = r4
                com.tencent.p014mm.plugin.sns.p106ui.C96313x4.f281644z = r5
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r9)
                r5 = 2
                java.lang.Object[] r8 = new java.lang.Object[r5]
                r9 = 0
                r8[r9] = r4
                java.lang.Integer r9 = java.lang.Integer.valueOf(r2)
                r10 = 1
                r8[r10] = r9
                java.lang.String r9 = "MicroMsg.BaseSelectVisibleRangeUI"
                java.lang.String r11 = "onActivityResult refresh after new label,db NewAddLabelId:%s, addedLabelIndex:%d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r11, r8)
                boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
                r9 = 3
                if (r8 != 0) goto L_0x0120
                if (r2 == r3) goto L_0x0120
                com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI r2 = com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.this
                dv2.c r3 = r2.f281310o
                int r2 = com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.m123416N7(r2)
                boolean r2 = r3.mo83405k(r2, r5)
                if (r2 == 0) goto L_0x00ec
                com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI r2 = com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.this
                com.tencent.mm.plugin.sns.ui.x4 r2 = r2.f281309n
                java.util.ArrayList<java.lang.String> r2 = r2.f281653l
                r2.add(r4)
                com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI r2 = com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.this
                com.tencent.mm.plugin.sns.ui.x4 r2 = r2.f281309n
                java.util.ArrayList r3 = new java.util.ArrayList
                com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI r4 = com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.this
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r7)
                java.util.ArrayList<java.lang.String> r4 = r4.f281318w
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r7)
                r3.<init>(r4)
                r2.getClass()
                com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI r2 = com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.this
                com.tencent.mm.plugin.sns.ui.x4 r2 = r2.f281309n
                r2.mo134134f()
                goto L_0x0120
            L_0x00ec:
                com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI r2 = com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.this
                dv2.c r3 = r2.f281310o
                int r2 = com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.m123416N7(r2)
                boolean r2 = r3.mo83405k(r2, r9)
                if (r2 == 0) goto L_0x0120
                com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI r2 = com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.this
                com.tencent.mm.plugin.sns.ui.x4 r2 = r2.f281309n
                java.util.ArrayList<java.lang.String> r2 = r2.f281654m
                r2.add(r4)
                com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI r2 = com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.this
                com.tencent.mm.plugin.sns.ui.x4 r2 = r2.f281309n
                java.util.ArrayList r3 = new java.util.ArrayList
                com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI r4 = com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.this
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r7)
                java.util.ArrayList<java.lang.String> r4 = r4.f281318w
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r7)
                r3.<init>(r4)
                r2.getClass()
                com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI r2 = com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.this
                com.tencent.mm.plugin.sns.ui.x4 r2 = r2.f281309n
                r2.mo134133e()
            L_0x0120:
                com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI r2 = com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.this
                com.tencent.mm.plugin.sns.ui.x4 r2 = r2.f281309n
                r2.notifyDataSetChanged()
                com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI r2 = com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.this
                com.tencent.mm.ui.widget.listview.AnimatedExpandableListView r2 = com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.m123410H7(r2)
                com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI r3 = com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.this
                dv2.c r4 = r3.f281310o
                int r3 = com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.m123416N7(r3)
                int r3 = r4.mo83402h(r3)
                r2.expandGroup(r3)
                com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI r2 = com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.this
                r3 = 0
                java.lang.String r4 = "access$1502"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r7)
                r2.f281317v = r3
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r7)
                com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI r2 = com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.this
                r2.getClass()
                java.lang.String r3 = "refreshSaveButtonStateByCurrentSelectData"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r7)
                dv2.c r4 = r2.f281310o
                int r6 = r2.f281315t
                int r4 = r4.mo83404j(r6)
                if (r4 == 0) goto L_0x0178
                if (r4 == r10) goto L_0x0178
                if (r4 == r5) goto L_0x0170
                if (r4 == r9) goto L_0x0168
                r5 = 4
                if (r4 == r5) goto L_0x0178
                goto L_0x017b
            L_0x0168:
                boolean r4 = r2.mo133954W7()
                r2.enableOptionMenu(r4)
                goto L_0x017b
            L_0x0170:
                boolean r4 = r2.mo133955X7()
                r2.enableOptionMenu(r4)
                goto L_0x017b
            L_0x0178:
                r2.enableOptionMenu(r10)
            L_0x017b:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r7)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI.C96265g.run():void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI$h */
    public class C96266h implements DialogInterface.OnClickListener {
        public C96266h() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI$8");
            BaseSelectVisibleRangeUI baseSelectVisibleRangeUI = BaseSelectVisibleRangeUI.this;
            int i2 = BaseSelectVisibleRangeUI.f281300B;
            SnsMethodCalculate.markStartTimeMs("access$1600", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
            baseSelectVisibleRangeUI.mo133956Y7();
            SnsMethodCalculate.markEndTimeMs("access$1600", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI$8");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI$i */
    public class C96267i implements DialogInterface.OnClickListener {
        public C96267i() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI$9");
            BaseSelectVisibleRangeUI baseSelectVisibleRangeUI = BaseSelectVisibleRangeUI.this;
            int i2 = BaseSelectVisibleRangeUI.f281300B;
            SnsMethodCalculate.markStartTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
            baseSelectVisibleRangeUI.mo133953T7();
            SnsMethodCalculate.markEndTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI$9");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI$j */
    public static class C96268j implements C11385n {

        /* renamed from: d */
        public WeakReference<MMActivity> f281334d;

        public C96268j(WeakReference<MMActivity> weakReference) {
            this.f281334d = weakReference;
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            SnsMethodCalculate.markStartTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI$BaseSelectVisibleRangeNetCallback");
            Log.m105925i("MicroMsg.BaseSelectVisibleRangeUI", "dz:[onSceneEnd]errType:%d errCode:%d errMsg:%s", Integer.valueOf(i), Integer.valueOf(i2), str);
            WeakReference<MMActivity> weakReference = this.f281334d;
            if (weakReference == null) {
                Log.m105924i("MicroMsg.BaseSelectVisibleRangeUI", "[onSceneEnd] WeakRef null");
                SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI$BaseSelectVisibleRangeNetCallback");
                return;
            }
            BaseSelectVisibleRangeUI baseSelectVisibleRangeUI = (BaseSelectVisibleRangeUI) weakReference.get();
            if (baseSelectVisibleRangeUI == null) {
                Log.m105924i("MicroMsg.BaseSelectVisibleRangeUI", "[onSceneEnd] activity null");
                SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI$BaseSelectVisibleRangeNetCallback");
                return;
            }
            int i3 = BaseSelectVisibleRangeUI.f281300B;
            SnsMethodCalculate.markStartTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
            boolean z = baseSelectVisibleRangeUI.f281314s;
            SnsMethodCalculate.markEndTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
            if (!z) {
                SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI$BaseSelectVisibleRangeNetCallback");
                return;
            }
            int type = yVar.getType();
            if (type != 290) {
                if (type != 635) {
                    if (type == 638) {
                        if (i == 0 && i2 == 0) {
                            SnsMethodCalculate.markStartTimeMs("access$2100", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
                            SnsMethodCalculate.markEndTimeMs("access$2100", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
                            throw null;
                        }
                        BaseSelectVisibleRangeUI.m123415M7(baseSelectVisibleRangeUI);
                        Log.m105924i("MicroMsg.BaseSelectVisibleRangeUI", "dz: error at modify label list!");
                    }
                } else if (i == 0 && i2 == 0) {
                    SnsMethodCalculate.markStartTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
                    SnsMethodCalculate.markEndTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
                    SnsMethodCalculate.markStartTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
                    SnsMethodCalculate.markStartTimeMs("addContactToLabels", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
                    ArrayList<String> arrayList = baseSelectVisibleRangeUI.f281321z;
                    if (arrayList == null || arrayList.size() == 0) {
                        SnsMethodCalculate.markEndTimeMs("addContactToLabels", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
                        SnsMethodCalculate.markEndTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
                    } else {
                        baseSelectVisibleRangeUI.f281321z.iterator();
                        throw null;
                    }
                } else {
                    BaseSelectVisibleRangeUI.m123415M7(baseSelectVisibleRangeUI);
                    Log.m105924i("MicroMsg.BaseSelectVisibleRangeUI", "dz: error at add contact label!");
                }
            } else if (i == 0 && i2 == 0) {
                Log.m105924i("MicroMsg.BaseSelectVisibleRangeUI", "[onSceneEnd] delete tag list success");
            } else {
                Log.m105924i("MicroMsg.BaseSelectVisibleRangeUI", "dz: error at delete tag list!");
            }
            SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI$BaseSelectVisibleRangeNetCallback");
        }
    }

    public BaseSelectVisibleRangeUI() {
        SnsMethodCalculate.markStartTimeMs("getDefaultVisibleState", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        SnsMethodCalculate.markEndTimeMs("getDefaultVisibleState", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        this.f281311p = 0;
        this.f281312q = false;
        this.f281313r = false;
        this.f281314s = false;
    }

    /* renamed from: H7 */
    public static /* synthetic */ AnimatedExpandableListView m123410H7(BaseSelectVisibleRangeUI baseSelectVisibleRangeUI) {
        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        AnimatedExpandableListView animatedExpandableListView = baseSelectVisibleRangeUI.f281302d;
        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        return animatedExpandableListView;
    }

    /* renamed from: I7 */
    public static void m123411I7(BaseSelectVisibleRangeUI baseSelectVisibleRangeUI, int i, ArrayList arrayList, String str, View view) {
        SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        baseSelectVisibleRangeUI.getClass();
        SnsMethodCalculate.markStartTimeMs("insertOrRemove", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        C96313x4 x4Var = baseSelectVisibleRangeUI.f281309n;
        if (x4Var == null || x4Var.f281649h != 1) {
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
        SnsMethodCalculate.markEndTimeMs("insertOrRemove", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
    }

    /* renamed from: J7 */
    public static /* synthetic */ ArrayList m123412J7(BaseSelectVisibleRangeUI baseSelectVisibleRangeUI) {
        SnsMethodCalculate.markStartTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        ArrayList<String> arrayList = baseSelectVisibleRangeUI.f281303e;
        SnsMethodCalculate.markEndTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        return arrayList;
    }

    /* renamed from: K7 */
    public static /* synthetic */ ArrayList m123413K7(BaseSelectVisibleRangeUI baseSelectVisibleRangeUI, ArrayList arrayList) {
        SnsMethodCalculate.markStartTimeMs("access$1302", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        baseSelectVisibleRangeUI.f281303e = arrayList;
        SnsMethodCalculate.markEndTimeMs("access$1302", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        return arrayList;
    }

    /* renamed from: L7 */
    public static /* synthetic */ ArrayList m123414L7(BaseSelectVisibleRangeUI baseSelectVisibleRangeUI) {
        SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        ArrayList<String> arrayList = baseSelectVisibleRangeUI.f281321z;
        SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        return arrayList;
    }

    /* renamed from: M7 */
    public static void m123415M7(BaseSelectVisibleRangeUI baseSelectVisibleRangeUI) {
        SnsMethodCalculate.markStartTimeMs("access$2000", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        baseSelectVisibleRangeUI.getClass();
        SnsMethodCalculate.markStartTimeMs("handleTransformError", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        C115669n.INSTANCE.mo160131h(11455, "", "", 0, 0);
        SnsMethodCalculate.markStartTimeMs("RecordTagToLabelFailed", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        C86709a0.m107528h();
        C86709a0.m107528h();
        C86709a0.m107535s().mo121142i().mo119676J(335874, Integer.valueOf(((Integer) C86709a0.m107535s().mo121142i().mo119684e(335874, 0)).intValue() + 1));
        SnsMethodCalculate.markEndTimeMs("RecordTagToLabelFailed", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        baseSelectVisibleRangeUI.f281321z = null;
        baseSelectVisibleRangeUI.f281314s = false;
        C89779i0 i0Var = baseSelectVisibleRangeUI.f281316u;
        if (i0Var != null && i0Var.isShowing()) {
            baseSelectVisibleRangeUI.f281316u.dismiss();
        }
        if (baseSelectVisibleRangeUI.f281313r) {
            baseSelectVisibleRangeUI.f281313r = false;
            SnsMethodCalculate.markEndTimeMs("handleTransformError", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        } else {
            int i = C0966R.string.je4;
            if (baseSelectVisibleRangeUI.mo133951R7() > 1) {
                i = C0966R.string.f361380je3;
            }
            C76879j.m92742m(baseSelectVisibleRangeUI, i, C0966R.string.a18, new C97555a(baseSelectVisibleRangeUI));
            SnsMethodCalculate.markEndTimeMs("handleTransformError", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        }
        SnsMethodCalculate.markEndTimeMs("access$2000", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
    }

    /* renamed from: N7 */
    public static /* synthetic */ int m123416N7(BaseSelectVisibleRangeUI baseSelectVisibleRangeUI) {
        SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        int i = baseSelectVisibleRangeUI.f281315t;
        SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        return i;
    }

    /* renamed from: O7 */
    public static /* synthetic */ int m123417O7(BaseSelectVisibleRangeUI baseSelectVisibleRangeUI, int i) {
        SnsMethodCalculate.markStartTimeMs("access$402", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        baseSelectVisibleRangeUI.f281315t = i;
        SnsMethodCalculate.markEndTimeMs("access$402", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        return i;
    }

    /* renamed from: P7 */
    public static void m123418P7(ArrayList<String> arrayList) {
        SnsMethodCalculate.markStartTimeMs("checkLabelListValid", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        if (arrayList == null || arrayList.isEmpty()) {
            SnsMethodCalculate.markEndTimeMs("checkLabelListValid", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
            return;
        }
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            List k = ((C67001a) C28250a.m38138a()).mo90973k(next);
            if (k == null || k.isEmpty()) {
                Log.m105921e("MicroMsg.BaseSelectVisibleRangeUI", "remove invalid lable:%s", next);
                it.remove();
            }
        }
        SnsMethodCalculate.markEndTimeMs("checkLabelListValid", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
    }

    /* renamed from: Q7 */
    public abstract C58442c mo132276Q7();

    /* renamed from: R7 */
    public final int mo133951R7() {
        SnsMethodCalculate.markStartTimeMs("getTagToLabelFailedTime", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        C86709a0.m107528h();
        int intValue = ((Integer) C86709a0.m107535s().mo121142i().mo119684e(335874, 0)).intValue();
        SnsMethodCalculate.markEndTimeMs("getTagToLabelFailedTime", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        return intValue;
    }

    /* renamed from: S7 */
    public final void mo133952S7() {
        SnsMethodCalculate.markStartTimeMs("goBack", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        SnsMethodCalculate.markStartTimeMs("isSelectChange", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        int h = this.f281310o.mo83402h(this.f281309n.f281650i);
        boolean z = false;
        if (this.f281309n.f281650i == this.f281311p ? !((!this.f281310o.mo83396b(h, 2) || (Util.listToString(this.f281309n.f281653l, ",").equals(this.f281305g) && Util.listToString(this.f281309n.f281655n, ",").equals(this.f281307i) && Util.listToString(this.f281309n.f281657p, ",").equals(this.f281308j))) && (!this.f281310o.mo83396b(h, 3) || (Util.listToString(this.f281309n.f281654m, ",").equals(this.f281305g) && Util.listToString(this.f281309n.f281656o, ",").equals(this.f281307i) && Util.listToString(this.f281309n.f281658q, ",").equals(this.f281308j)))) : !((!this.f281310o.mo83396b(h, 2) || (this.f281309n.f281653l.size() == 0 && this.f281309n.f281655n.size() == 0)) && ((!this.f281310o.mo83396b(h, 3) || (this.f281309n.f281654m.size() == 0 && this.f281309n.f281656o.size() == 0)) && !this.f281310o.mo83396b(h, 1) && !this.f281310o.mo83396b(h, 0) && !this.f281310o.mo83396b(h, 4)))) {
            z = true;
        }
        SnsMethodCalculate.markEndTimeMs("isSelectChange", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        if (z) {
            C76879j.m92717K(this, true, getString(C0966R.string.jdn), "", getString(C0966R.string.jdm), getString(C0966R.string.jdl), new C96266h(), new C96267i());
        } else {
            mo133953T7();
        }
        SnsMethodCalculate.markEndTimeMs("goBack", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
    }

    /* renamed from: T7 */
    public final void mo133953T7() {
        SnsMethodCalculate.markStartTimeMs("goBackWithStates", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        Intent intent = new Intent();
        intent.putExtra("Ktag_range_index", this.f281311p);
        if (this.f281310o.mo83405k(this.f281311p, 2) || this.f281310o.mo83405k(this.f281311p, 3)) {
            intent.putExtra("Klabel_name_list", this.f281304f);
            intent.putExtra("Kother_user_name_list", this.f281307i);
            intent.putExtra("Kchat_room_name_list", this.f281308j);
        }
        if (this.f281310o.mo83405k(this.f281311p, 2)) {
            intent.putExtra("label_id", this.f281306h);
        } else if (this.f281310o.mo83405k(this.f281311p, 3)) {
            intent.putExtra("label_id", this.f281306h);
        }
        setResult(-1, intent);
        finish();
        SnsMethodCalculate.markEndTimeMs("goBackWithStates", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
    }

    /* renamed from: U7 */
    public void mo132277U7() {
        SnsMethodCalculate.markStartTimeMs("gotoSelectContact", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        Log.m105924i("MicroMsg.BaseSelectVisibleRangeUI", "gotoSelectContact: ");
        Intent intent = new Intent();
        intent.putExtra("titile", getString(C0966R.string.myy));
        intent.putExtra("snsPostWhoCanSee", true);
        C74560s1.m89276e();
        intent.putExtra("list_attr", C74560s1.m89278g(C74560s1.f219169j));
        if (this.f281310o.mo83405k(this.f281315t, 2)) {
            if (this.f281309n.f281655n.size() > 0) {
                intent.putExtra("already_select_contact", Util.listToString(this.f281309n.f281655n, ","));
            }
        } else if (this.f281310o.mo83405k(this.f281315t, 3) && this.f281309n.f281656o.size() > 0) {
            intent.putExtra("already_select_contact", Util.listToString(this.f281309n.f281656o, ","));
        }
        intent.putExtra("KBlockOpenImFav", true);
        intent.putExtra("without_openim", true);
        intent.putExtra("CONTACT_INFO_UI_SOURCE", this.f281301A);
        intent.putExtra("max_limit_num", Integer.MAX_VALUE);
        intent.putExtra("menu_label", C76577a.m92166q(getContext(), C0966R.string.f7929wj));
        C88144b.m109802t(this, ".ui.contact.SelectContactUI", intent, WearableStatusCodes.DATA_ITEM_TOO_LARGE);
        SnsMethodCalculate.markEndTimeMs("gotoSelectContact", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
    }

    /* renamed from: V7 */
    public void mo132278V7() {
        SnsMethodCalculate.markStartTimeMs("gotoSelectLabel", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        Log.m105924i("MicroMsg.BaseSelectVisibleRangeUI", "goto select group");
        Intent intent = new Intent();
        if (this.f281310o.mo83405k(this.f281315t, 2)) {
            intent.putStringArrayListExtra("label_id", this.f281309n.f281653l);
        } else if (this.f281310o.mo83405k(this.f281315t, 3)) {
            intent.putStringArrayListExtra("label_id", this.f281309n.f281654m);
        }
        intent.setClassName(this, "com.tencent.mm.plugin.label.ui.ContactLabelSelectUI");
        startActivityForResult(intent, (int) WearableStatusCodes.ASSET_UNAVAILABLE);
        SnsMethodCalculate.markEndTimeMs("gotoSelectLabel", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
    }

    /* renamed from: W7 */
    public final boolean mo133954W7() {
        SnsMethodCalculate.markStartTimeMs("hasSelectExcludeData", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        boolean z = !this.f281309n.f281654m.isEmpty() || !this.f281309n.f281656o.isEmpty();
        SnsMethodCalculate.markEndTimeMs("hasSelectExcludeData", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        return z;
    }

    /* renamed from: X7 */
    public final boolean mo133955X7() {
        SnsMethodCalculate.markStartTimeMs("hasSelectIncludeData", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        boolean z = !this.f281309n.f281653l.isEmpty() || !this.f281309n.f281655n.isEmpty();
        SnsMethodCalculate.markEndTimeMs("hasSelectIncludeData", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        return z;
    }

    /* renamed from: Y7 */
    public final void mo133956Y7() {
        int i;
        String str;
        int i2;
        Iterator<String> it;
        String str2;
        SnsMethodCalculate.markStartTimeMs("saveAndExit", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        C97557d dVar = this.f281319x;
        int i3 = 0;
        if (dVar != null) {
            SnsMethodCalculate.markStartTimeMs("isNeedDynamicChangeVisibleRange", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
            boolean z = ((NewSnsLabelUI) dVar).f277104C;
            SnsMethodCalculate.markEndTimeMs("isNeedDynamicChangeVisibleRange", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
            if (z) {
                NewSnsLabelUI newSnsLabelUI = (NewSnsLabelUI) this.f281319x;
                newSnsLabelUI.getClass();
                SnsMethodCalculate.markStartTimeMs("dynamicChangeVisibleRange", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
                Log.m105924i("MicroMsg.NewSnsLabelUI", "dynamicChangeVisibleRange start");
                SnsMethodCalculate.markStartTimeMs("showProgressDialog", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
                String str3 = "MicroMsg.NewSnsLabelUI";
                newSnsLabelUI.f281316u = C76879j.m92723Q(newSnsLabelUI, (String) null, "", false, false, (DialogInterface.OnCancelListener) null);
                SnsMethodCalculate.markEndTimeMs("showProgressDialog", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
                t74 t74 = new t74();
                if (newSnsLabelUI.f281310o.mo83405k(newSnsLabelUI.f281309n.f281650i, 2)) {
                    t74.f299487o = 3;
                    t74.f299483h = newSnsLabelUI.f281309n.f281655n.size();
                    Iterator<String> it4 = newSnsLabelUI.f281309n.f281655n.iterator();
                    while (it4.hasNext()) {
                        t74.f299484i.add(C48374j0.m53720i(it4.next()));
                    }
                    t74.f299485j = newSnsLabelUI.f281309n.f281653l.size();
                    Iterator<String> it5 = newSnsLabelUI.f281309n.f281653l.iterator();
                    i = 0;
                    while (it5.hasNext()) {
                        String next = it5.next();
                        try {
                            t74.f299486n.add(Integer.valueOf(Integer.parseInt(next)));
                            str2 = str3;
                        } catch (Exception e) {
                            Object[] objArr = new Object[i3];
                            str2 = str3;
                            Log.printErrStackTrace(str2, e, "SnsObjectOpChangeVisibility parse error", objArr);
                        }
                        SnsReportHelper snsReportHelper = SnsReportHelper.f275506m0;
                        int i4 = newSnsLabelUI.f281309n.f281650i;
                        snsReportHelper.getClass();
                        SnsMethodCalculate.markStartTimeMs("checkSearchLabelOfDynaLabel", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
                        Set<String> z2 = snsReportHelper.mo131393z(i4);
                        boolean z3 = z2 != null && z2.contains(next);
                        SnsMethodCalculate.markEndTimeMs("checkSearchLabelOfDynaLabel", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
                        if (z3) {
                            i++;
                        }
                        str3 = str2;
                        i3 = 0;
                    }
                    str = str3;
                    SnsReportHelper.f275506m0.mo131344E().f266373M = i;
                } else {
                    str = str3;
                    if (newSnsLabelUI.f281310o.mo83405k(newSnsLabelUI.f281309n.f281650i, 3)) {
                        t74.f299487o = 4;
                        t74.f299479d = newSnsLabelUI.f281309n.f281656o.size();
                        Iterator<String> it6 = newSnsLabelUI.f281309n.f281656o.iterator();
                        while (it6.hasNext()) {
                            t74.f299480e.add(C48374j0.m53720i(it6.next()));
                        }
                        t74.f299481f = newSnsLabelUI.f281309n.f281654m.size();
                        Iterator<String> it7 = newSnsLabelUI.f281309n.f281654m.iterator();
                        i = 0;
                        while (it7.hasNext()) {
                            String next2 = it7.next();
                            try {
                                t74.f299482g.add(Integer.valueOf(Integer.parseInt(next2)));
                                it = it7;
                            } catch (Exception e2) {
                                it = it7;
                                Log.printErrStackTrace(str, e2, "SnsObjectOpChangeVisibility parse error", new Object[0]);
                            }
                            SnsReportHelper snsReportHelper2 = SnsReportHelper.f275506m0;
                            int i5 = newSnsLabelUI.f281309n.f281650i;
                            snsReportHelper2.getClass();
                            SnsMethodCalculate.markStartTimeMs("checkSearchLabelOfDynaLabel", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
                            Set<String> z4 = snsReportHelper2.mo131393z(i5);
                            boolean z5 = z4 != null && z4.contains(next2);
                            SnsMethodCalculate.markEndTimeMs("checkSearchLabelOfDynaLabel", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
                            if (z5) {
                                i++;
                            }
                            it7 = it;
                        }
                        SnsReportHelper.f275506m0.mo131344E().f266373M = i;
                    } else {
                        if (newSnsLabelUI.f281310o.mo83405k(newSnsLabelUI.f281309n.f281650i, 0)) {
                            t74.f299487o = 1;
                            i2 = 2;
                        } else {
                            i2 = 2;
                            if (newSnsLabelUI.f281310o.mo83405k(newSnsLabelUI.f281309n.f281650i, 1)) {
                                t74.f299487o = 2;
                            }
                        }
                        i = 0;
                        Object[] objArr2 = new Object[i2];
                        objArr2[0] = Integer.valueOf(newSnsLabelUI.f281309n.f281650i);
                        objArr2[1] = Integer.valueOf(i);
                        Log.m105925i(str, "dynamicChangeVisibleRange: selectVisibleState:%d， matchLabelCountFromSearch:%d", objArr2);
                        Log.m105925i(str, "dynamicChangeVisibleRange opChangeVisibility:%s", " OpType:" + t74.f299487o + " GroupUserCount:" + t74.f299483h + " BlackListCount:" + t74.f299479d + " BlackContactTagIdListCount:" + t74.f299481f + " GroupContactTagIdListCount:" + t74.f299485j);
                        SnsMethodCalculate.markStartTimeMs("updateInTransform", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
                        newSnsLabelUI.f281314s = true;
                        SnsMethodCalculate.markEndTimeMs("updateInTransform", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
                        C94877g0 g0Var = new C94877g0(newSnsLabelUI.f277106E.longValue(), t74);
                        C86709a0.m107528h();
                        C86709a0.m107529k().f251779b.mo123460f(g0Var);
                        SnsMethodCalculate.markEndTimeMs("dynamicChangeVisibleRange", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
                        Log.m105925i("MicroMsg.BaseSelectVisibleRangeUI", "[saveAndExit] dynamicChangeVisibleRange result=%b", Boolean.TRUE);
                        SnsMethodCalculate.markEndTimeMs("saveAndExit", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
                    }
                }
                i2 = 2;
                Object[] objArr22 = new Object[i2];
                objArr22[0] = Integer.valueOf(newSnsLabelUI.f281309n.f281650i);
                objArr22[1] = Integer.valueOf(i);
                Log.m105925i(str, "dynamicChangeVisibleRange: selectVisibleState:%d， matchLabelCountFromSearch:%d", objArr22);
                Log.m105925i(str, "dynamicChangeVisibleRange opChangeVisibility:%s", " OpType:" + t74.f299487o + " GroupUserCount:" + t74.f299483h + " BlackListCount:" + t74.f299479d + " BlackContactTagIdListCount:" + t74.f299481f + " GroupContactTagIdListCount:" + t74.f299485j);
                SnsMethodCalculate.markStartTimeMs("updateInTransform", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
                newSnsLabelUI.f281314s = true;
                SnsMethodCalculate.markEndTimeMs("updateInTransform", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
                C94877g0 g0Var2 = new C94877g0(newSnsLabelUI.f277106E.longValue(), t74);
                C86709a0.m107528h();
                C86709a0.m107529k().f251779b.mo123460f(g0Var2);
                SnsMethodCalculate.markEndTimeMs("dynamicChangeVisibleRange", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
                Log.m105925i("MicroMsg.BaseSelectVisibleRangeUI", "[saveAndExit] dynamicChangeVisibleRange result=%b", Boolean.TRUE);
                SnsMethodCalculate.markEndTimeMs("saveAndExit", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
            }
        }
        Intent intent = new Intent();
        if (this.f281310o.mo83405k(this.f281309n.f281650i, 2)) {
            this.f281307i = Util.listToString(this.f281309n.f281655n, ",");
            this.f281308j = Util.listToString(this.f281309n.f281657p, ",");
            m123418P7(this.f281309n.f281653l);
            intent.putStringArrayListExtra("label_id", this.f281309n.f281653l);
            intent.putExtra("Klabel_name_list", ((SpannableStringBuilder) C96313x4.m123522k(this.f281309n.f281653l, false, -1)).toString());
            intent.putExtra("Kother_user_name_list", this.f281307i);
            intent.putExtra("Kchat_room_name_list", this.f281308j);
        } else if (this.f281310o.mo83405k(this.f281309n.f281650i, 3)) {
            this.f281307i = Util.listToString(this.f281309n.f281656o, ",");
            this.f281308j = Util.listToString(this.f281309n.f281658q, ",");
            m123418P7(this.f281309n.f281654m);
            intent.putStringArrayListExtra("label_id", this.f281309n.f281654m);
            intent.putExtra("Klabel_name_list", ((SpannableStringBuilder) C96313x4.m123522k(this.f281309n.f281654m, false, -1)).toString());
            intent.putExtra("Kother_user_name_list", this.f281307i);
            intent.putExtra("Kchat_room_name_list", this.f281308j);
        }
        intent.putExtra("Ktag_range_index", this.f281309n.f281650i);
        setResult(-1, intent);
        finish();
        SnsMethodCalculate.markEndTimeMs("saveAndExit", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        SnsMethodCalculate.markStartTimeMs("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 0) {
            mo133952S7();
            SnsMethodCalculate.markEndTimeMs("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
            return true;
        }
        boolean dispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
        SnsMethodCalculate.markEndTimeMs("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        return dispatchKeyEvent;
    }

    public int getLayoutId() {
        SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        return C0966R.C0971layout.c3a;
    }

    public void initView() {
        SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        boolean booleanExtra = getIntent().getBooleanExtra("KLabel_is_filter_private", false);
        this.f281302d = (AnimatedExpandableListView) findViewById(C0966R.C0970id.jtw);
        ArrayList<String> arrayList = (ArrayList) ((C67001a) C28250a.m38138a()).mo90967e();
        this.f281303e = arrayList;
        C96313x4 x4Var = this.f281309n;
        x4Var.f281652k = booleanExtra;
        x4Var.mo134147l(arrayList);
        AbsListView.LayoutParams layoutParams = new AbsListView.LayoutParams(-1, -2);
        layoutParams.height = getResources().getDimensionPixelSize(C0966R.dimen.f3898i9);
        View view = new View(this);
        view.setLayoutParams(layoutParams);
        this.f281302d.addHeaderView(view);
        this.f281302d.setAdapter(this.f281309n);
        if (this.f281310o.mo83405k(this.f281309n.f281650i, 2)) {
            this.f281302d.expandGroup(this.f281310o.mo83402h(2));
        } else if (this.f281310o.mo83405k(this.f281309n.f281650i, 3)) {
            this.f281302d.expandGroup(this.f281310o.mo83402h(3));
        }
        this.f281302d.setOnGroupClickListener(new C96260c());
        this.f281302d.setOnChildClickListener(new C96262d());
        setBackBtn(new C96263e());
        addTextOptionMenu(0, getString(C0966R.string.jdj), new C96264f(), (View.OnLongClickListener) null, MMActivityController.C73075r.GREEN);
        SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        String str;
        String str2;
        boolean z;
        ArrayList<String> stringArrayListExtra;
        int i3 = i;
        int i4 = i2;
        Intent intent2 = intent;
        C32735h.C32737c cVar = C32735h.C32737c.clicfg_enable_new_contact_label_ui;
        Class cls = C32735h.class;
        SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        super.onActivityResult(i, i2, intent);
        Log.m105925i("MicroMsg.BaseSelectVisibleRangeUI", "requestCode:%d resultCode:%d", Integer.valueOf(i), Integer.valueOf(i2));
        if (i4 == -1 && i3 == 4005) {
            ArrayList<String> stringArrayListExtra2 = intent2.getStringArrayListExtra("label_id");
            m123418P7(stringArrayListExtra2);
            Log.m105925i("MicroMsg.BaseSelectVisibleRangeUI", "onActivityResult select label back, mTempSelectGroup:%d, labels:%s", Integer.valueOf(this.f281315t), Util.listToString(stringArrayListExtra2, ","));
            if (stringArrayListExtra2 != null) {
                if (this.f281310o.mo83405k(this.f281315t, 2)) {
                    this.f281309n.f281653l.clear();
                    this.f281309n.f281653l.addAll(stringArrayListExtra2);
                    enableOptionMenu(mo133955X7());
                } else if (this.f281310o.mo83405k(this.f281315t, 3)) {
                    this.f281309n.f281654m.clear();
                    this.f281309n.f281654m.addAll(stringArrayListExtra2);
                    enableOptionMenu(mo133954W7());
                } else {
                    z = false;
                    this.f281309n.notifyDataSetChanged();
                }
                z = true;
                this.f281309n.notifyDataSetChanged();
            } else {
                z = false;
            }
            if (z && (stringArrayListExtra = intent2.getStringArrayListExtra("contact_select_label_id_list_from_search")) != null) {
                SnsReportHelper snsReportHelper = SnsReportHelper.f275506m0;
                int i5 = this.f281315t;
                snsReportHelper.getClass();
                SnsMethodCalculate.markStartTimeMs("addSearchLabelOfDynaLabel", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
                Set<String> z2 = snsReportHelper.mo131393z(i5);
                if (z2 != null) {
                    z2.addAll(stringArrayListExtra);
                }
                SnsMethodCalculate.markEndTimeMs("addSearchLabelOfDynaLabel", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            }
        }
        String str3 = ",";
        String str4 = "dz[onActivityResult] %s";
        String str5 = "";
        if (i4 == -1 && i3 == 4003) {
            Log.m105924i("MicroMsg.BaseSelectVisibleRangeUI", "the Activity completed");
            String stringExtra = intent2.getStringExtra("Select_Contacts_To_Create_New_Label");
            if (!Util.isNullOrNil(stringExtra)) {
                Intent intent3 = new Intent();
                intent3.putExtra("Select_Contact", stringExtra);
                if (((C32735h) C86312j.m106911c(cls)).mo58779Qe(cVar, 1) == 1) {
                    Log.m105924i("MicroMsg.BaseSelectVisibleRangeUI", "startActivity ContactEditLabel ");
                    C88144b.m109795m(getContext(), "label", ".ui.ContactEditLabel", intent3, 4002);
                } else {
                    Log.m105924i("MicroMsg.BaseSelectVisibleRangeUI", "startActivity ContactLabelEditUI ");
                    C88144b.m109795m(getContext(), "label", ".ui.ContactLabelEditUI", intent3, 4002);
                }
                SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
                return;
            }
            String stringExtra2 = intent2.getStringExtra("Select_Contact");
            Log.m105925i("MicroMsg.BaseSelectVisibleRangeUI", str4, stringExtra2 + str5);
            if (this.f281310o.mo83405k(this.f281315t, 2)) {
                this.f281309n.mo134134f();
                if (!Util.isNullOrNil(stringExtra2)) {
                    this.f281309n.f281655n.addAll(Util.stringsToList(stringExtra2.split(str3)));
                    this.f281309n.f281650i = this.f281315t;
                }
                enableOptionMenu(mo133955X7());
            } else {
                String str6 = str3;
                if (this.f281310o.mo83405k(this.f281315t, 3)) {
                    this.f281309n.mo134133e();
                    if (!Util.isNullOrNil(stringExtra2)) {
                        this.f281309n.f281656o.addAll(Util.stringsToList(stringExtra2.split(str6)));
                        this.f281309n.f281650i = this.f281315t;
                    }
                    enableOptionMenu(mo133954W7());
                }
            }
            this.f281309n.notifyDataSetChanged();
            this.f281302d.expandGroup(this.f281310o.mo83402h(this.f281315t));
            str = "onActivityResult";
            str2 = "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI";
        } else {
            String str7 = str5;
            String str8 = "the Activity completed";
            String str9 = str3;
            String str10 = "onActivityResult";
            String str11 = str4;
            String str12 = "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI";
            String str13 = "Select_Contact";
            String str14 = str9;
            if (i4 == -1 && i3 == 4001) {
                String stringExtra3 = intent2.getStringExtra(str13);
                Log.m105925i("MicroMsg.BaseSelectVisibleRangeUI", str11, stringExtra3 + str7);
                if (!Util.isNullOrNil(stringExtra3)) {
                    Intent intent4 = new Intent();
                    intent4.putExtra(str13, stringExtra3);
                    if (((C32735h) C86312j.m106911c(cls)).mo58779Qe(cVar, 1) == 1) {
                        Log.m105924i("MicroMsg.BaseSelectVisibleRangeUI", "startActivity ContactEditLabel ");
                        C88144b.m109795m(getContext(), "label", ".ui.ContactEditLabel", intent4, 4002);
                    } else {
                        Log.m105924i("MicroMsg.BaseSelectVisibleRangeUI", "startActivity ContactLabelEditUI ");
                        C88144b.m109795m(getContext(), "label", ".ui.ContactLabelEditUI", intent4, 4002);
                    }
                }
            } else if (i4 == 0 && i3 == 4002 && intent2 != null) {
                String stringExtra4 = intent2.getStringExtra("k_sns_label_add_label");
                this.f281317v = intent2.getStringExtra("k_sns_label_add_label");
                ArrayList<String> stringArrayListExtra3 = intent2.getStringArrayListExtra("k_sns_label_add_label_usernames");
                this.f281318w = stringArrayListExtra3;
                Object[] objArr = new Object[3];
                objArr[0] = stringExtra4 == null ? str7 : stringExtra4;
                String str15 = this.f281317v;
                if (str15 != null) {
                    str7 = str15;
                }
                objArr[1] = str7;
                objArr[2] = Util.listToString(stringArrayListExtra3, str14);
                Log.m105925i("MicroMsg.BaseSelectVisibleRangeUI", "onActivityResult add label edit name,addedLabel:%s, addLabel:%s, addLabelUserNames:%s", objArr);
                this.f281302d.postDelayed(new C96265g(stringExtra4), 600);
            } else {
                String str16 = str14;
                if (i4 == -1 && i3 == 4004) {
                    Log.m105924i("MicroMsg.BaseSelectVisibleRangeUI", str8);
                    String stringExtra5 = intent2.getStringExtra("select_chatrooms");
                    Log.m105925i("MicroMsg.BaseSelectVisibleRangeUI", str11, stringExtra5 + str7);
                    if (this.f281310o.mo83405k(this.f281315t, 2)) {
                        this.f281309n.f281657p.clear();
                        if (!Util.isNullOrNil(stringExtra5)) {
                            this.f281309n.f281657p.addAll(Util.stringsToList(stringExtra5.split(str16)));
                            this.f281309n.f281650i = this.f281315t;
                        }
                    } else if (this.f281310o.mo83405k(this.f281315t, 3)) {
                        this.f281309n.f281658q.clear();
                        if (!Util.isNullOrNil(stringExtra5)) {
                            this.f281309n.f281658q.addAll(Util.stringsToList(stringExtra5.split(str16)));
                            this.f281309n.f281650i = this.f281315t;
                        }
                    }
                    this.f281309n.notifyDataSetChanged();
                    this.f281302d.expandGroup(this.f281310o.mo83402h(this.f281315t));
                }
            }
            str = str10;
            str2 = str12;
        }
        SnsMethodCalculate.markEndTimeMs(str, str2);
    }

    public void onCreate(Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        Log.m105925i("MicroMsg.BaseSelectVisibleRangeUI", "[%d]onCreate", Integer.valueOf(hashCode()));
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.jil);
        this.f281320y = new C96268j(new WeakReference(this));
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(C28613b.CTRL_INDEX, this.f281320y);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(638, this.f281320y);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(C82086j.CTRL_INDEX, this.f281320y);
        this.f281310o = mo132276Q7();
        C96270w1 w1Var = new C96270w1(this, this.f281310o);
        this.f281309n = w1Var;
        C96259b bVar = new C96259b();
        SnsMethodCalculate.markStartTimeMs("setInnerClickListener", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        w1Var.f281659r = bVar;
        SnsMethodCalculate.markEndTimeMs("setInnerClickListener", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        Intent intent = getIntent();
        if (intent == null) {
            SnsMethodCalculate.markStartTimeMs("getDefaultVisibleState", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
            SnsMethodCalculate.markEndTimeMs("getDefaultVisibleState", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
            this.f281311p = 0;
            this.f281309n.f281649h = 0;
            this.f281304f = null;
            this.f281307i = null;
            this.f281308j = null;
        } else {
            this.f281301A = getIntent().getIntExtra("CONTACT_INFO_UI_SOURCE", 10);
            C97557d dVar = this.f281319x;
            if (dVar != null) {
                SnsMethodCalculate.markStartTimeMs("isNeedDynamicChangeVisibleRange", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
                boolean z = ((NewSnsLabelUI) dVar).f277104C;
                SnsMethodCalculate.markEndTimeMs("isNeedDynamicChangeVisibleRange", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
                if (z) {
                    NewSnsLabelUI newSnsLabelUI = (NewSnsLabelUI) this.f281319x;
                    newSnsLabelUI.getClass();
                    SnsMethodCalculate.markStartTimeMs("initFromFeedInfo", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
                    C86709a0.m107528h();
                    C86709a0.m107529k().f251779b.mo123455a(218, newSnsLabelUI.f277107F);
                    GetSnsObjectDetailEvent getSnsObjectDetailEvent = new GetSnsObjectDetailEvent();
                    getSnsObjectDetailEvent.f9304d.f9306a = newSnsLabelUI.f277105D;
                    getSnsObjectDetailEvent.publish();
                    SnsObject snsObject = getSnsObjectDetailEvent.f9305e.f9307a;
                    if (snsObject == null) {
                        Log.m105924i("MicroMsg.NewSnsLabelUI", "[initFromFeedInfo] get snsObject null,try request objectdetail, show loading");
                        SnsMethodCalculate.markStartTimeMs("showProgressDialog", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
                        newSnsLabelUI.f281316u = C76879j.m92723Q(newSnsLabelUI, (String) null, "", false, false, (DialogInterface.OnCancelListener) null);
                        SnsMethodCalculate.markEndTimeMs("showProgressDialog", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
                    }
                    boolean a8 = newSnsLabelUI.mo132279a8(snsObject);
                    SnsMethodCalculate.markEndTimeMs("initFromFeedInfo", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
                    Log.m105925i("MicroMsg.BaseSelectVisibleRangeUI", "FromPostedFeed init result=%b", Boolean.valueOf(a8));
                }
            }
            this.f281312q = intent.getBooleanExtra("Kis_from_text_status", false);
            SnsMethodCalculate.markStartTimeMs("getDefaultVisibleState", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
            SnsMethodCalculate.markEndTimeMs("getDefaultVisibleState", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
            this.f281311p = intent.getIntExtra("KLabel_range_index", 0);
            this.f281304f = intent.getStringExtra("Klabel_name_list");
            this.f281307i = intent.getStringExtra("Kother_user_name_list");
            this.f281308j = intent.getStringExtra("Kchat_room_name_list");
            ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("label_id");
            if (Util.isNullOrNil((List) stringArrayListExtra)) {
                stringArrayListExtra = new ArrayList<>();
            }
            m123418P7(stringArrayListExtra);
            if (this.f281310o.mo83405k(this.f281311p, 2)) {
                if (intent.hasExtra("label_id")) {
                    this.f281306h.addAll(stringArrayListExtra);
                    this.f281309n.f281653l.clear();
                    this.f281309n.f281653l.addAll(stringArrayListExtra);
                    this.f281305g = Util.listToString(this.f281309n.f281653l, ",");
                }
                if (!TextUtils.isEmpty(this.f281307i)) {
                    this.f281309n.f281655n = Util.stringsToList(this.f281307i.split(","));
                }
                String str = this.f281308j;
                if (str != null && !str.isEmpty()) {
                    this.f281309n.f281657p = Util.stringsToList(this.f281308j.split(","));
                }
            } else if (this.f281310o.mo83405k(this.f281311p, 3)) {
                if (intent.hasExtra("label_id")) {
                    this.f281306h.addAll(stringArrayListExtra);
                    this.f281309n.f281654m.clear();
                    this.f281309n.f281654m.addAll(stringArrayListExtra);
                    this.f281305g = Util.listToString(this.f281309n.f281654m, ",");
                }
                if (!TextUtils.isEmpty(this.f281307i)) {
                    this.f281309n.f281656o = Util.stringsToList(this.f281307i.split(","));
                }
                String str2 = this.f281308j;
                if (str2 != null && !str2.isEmpty()) {
                    this.f281309n.f281658q = Util.stringsToList(this.f281308j.split(","));
                }
            }
        }
        if (!TextUtils.isEmpty(intent.getStringExtra("k_sns_label_ui_title"))) {
            setMMTitle(intent.getStringExtra("k_sns_label_ui_title"));
        }
        this.f281309n.f281649h = intent.getIntExtra("k_sns_label_ui_style", 0);
        C96313x4 x4Var = this.f281309n;
        x4Var.f281650i = this.f281311p;
        x4Var.f281651j = this.f281312q;
        if (x4Var.f281649h == 1) {
            findViewById(C0966R.C0970id.jtx).setBackgroundResource(C0966R.color.f3131gg);
        }
        initView();
        SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
    }

    public void onDestroy() {
        SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(C28613b.CTRL_INDEX, this.f281320y);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(638, this.f281320y);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(C82086j.CTRL_INDEX, this.f281320y);
        super.onDestroy();
        SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
    }

    public void onResume() {
        AnimatedExpandableListView animatedExpandableListView;
        SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        Log.m105924i("MicroMsg.BaseSelectVisibleRangeUI", "onResume");
        if (!(this.f281309n == null || this.f281317v != null || (animatedExpandableListView = this.f281302d) == null)) {
            animatedExpandableListView.postDelayed(new C96258a(), 600);
        }
        super.onResume();
        SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
    }
}
