package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.sdk.platformtools.Log;
import g34.C116918i;
import if3.C98670a;
import java.util.LinkedList;
import java.util.List;
import nj3.C76912y0;
import ot2.C100436g;
import te3.C101802kr2;

/* renamed from: com.tencent.mm.plugin.sns.ui.NewSightWidget$$j */
public class NewSightWidget$$j implements C100436g {

    /* renamed from: a */
    public final /* synthetic */ int f277084a;

    /* renamed from: b */
    public final /* synthetic */ int f277085b;

    /* renamed from: c */
    public final /* synthetic */ C116918i f277086c;

    /* renamed from: d */
    public final /* synthetic */ String f277087d;

    /* renamed from: e */
    public final /* synthetic */ List f277088e;

    /* renamed from: f */
    public final /* synthetic */ C101802kr2 f277089f;

    /* renamed from: g */
    public final /* synthetic */ LinkedList f277090g;

    /* renamed from: h */
    public final /* synthetic */ int f277091h;

    /* renamed from: i */
    public final /* synthetic */ boolean f277092i;

    /* renamed from: j */
    public final /* synthetic */ List f277093j;

    /* renamed from: k */
    public final /* synthetic */ PInt f277094k;

    /* renamed from: l */
    public final /* synthetic */ String f277095l;

    /* renamed from: m */
    public final /* synthetic */ int f277096m;

    /* renamed from: n */
    public final /* synthetic */ int f277097n;

    /* renamed from: o */
    public final /* synthetic */ NewSightWidget f277098o;

    public NewSightWidget$$j(NewSightWidget newSightWidget, int i, int i2, C116918i iVar, String str, List list, C101802kr2 kr22, LinkedList linkedList, int i3, boolean z, List list2, PInt pInt, String str2, int i4, int i5) {
        this.f277098o = newSightWidget;
        this.f277084a = i;
        this.f277085b = i2;
        this.f277086c = iVar;
        this.f277087d = str;
        this.f277088e = list;
        this.f277089f = kr22;
        this.f277090g = linkedList;
        this.f277091h = i3;
        this.f277092i = z;
        this.f277093j = list2;
        this.f277094k = pInt;
        this.f277095l = str2;
        this.f277096m = i4;
        this.f277097n = i5;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0089  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo132270a(boolean r11, int r12) {
        /*
            r10 = this;
            java.lang.String r0 = "uploadFinish"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.NewSightWidget$4"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r11)
            r4 = 0
            r2[r4] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r12)
            r5 = 1
            r2[r5] = r3
            java.lang.String r3 = "MicroMsg.SightWidget"
            java.lang.String r6 = "commit >> %b, %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r6, r2)
            if (r11 == 0) goto L_0x00c5
            long r2 = (long) r12
            java.lang.String r11 = "sns_table_"
            java.lang.String r11 = os2.C100417r0.m131421j(r11, r2)
            yn2.s0 r2 = yn2.C102882s0.f303681a
            com.tencent.mm.plugin.sns.ui.NewSightWidget r3 = r10.f277098o
            java.lang.String r6 = "access$1300"
            java.lang.String r7 = "com.tencent.mm.plugin.sns.ui.NewSightWidget"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r7)
            te3.kr2 r3 = r3.f277042d0
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r7)
            com.tencent.mm.plugin.sns.ui.NewSightWidget r6 = r10.f277098o
            com.tencent.mm.ui.MMActivity r6 = com.tencent.p014mm.plugin.sns.p106ui.NewSightWidget.m121576m(r6)
            android.content.Intent r6 = r6.getIntent()
            com.tencent.mm.plugin.sns.ui.NewSightWidget r8 = r10.f277098o
            java.lang.String r9 = "access$1400"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r7)
            boolean r8 = r8.f277066r
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r7)
            if (r8 == 0) goto L_0x0069
            com.tencent.mm.plugin.sns.ui.NewSightWidget r8 = r10.f277098o
            java.lang.String r9 = "access$1500"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r7)
            java.lang.String r8 = r8.f277061n
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r7)
            java.lang.String r9 = "wxa5e0de08d96cc09d"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x0069
            r8 = 1
            goto L_0x006a
        L_0x0069:
            r8 = 0
        L_0x006a:
            r2.mo142600l(r11, r3, r6, r8)
            com.tencent.mm.autogen.events.SightSendResultEvent r11 = new com.tencent.mm.autogen.events.SightSendResultEvent
            r11.<init>()
            com.tencent.mm.autogen.events.SightSendResultEvent$a r2 = r11.f265103d
            r2.f265105a = r4
            r2.f265106b = r5
            r11.publish()
            com.tencent.mm.plugin.sns.ui.NewSightWidget r11 = r10.f277098o
            java.lang.String r2 = "access$1600"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r7)
            ad0.s r11 = r11.f277057l
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r7)
            if (r11 == 0) goto L_0x00a5
            com.tencent.mm.plugin.sns.ui.NewSightWidget r11 = r10.f277098o
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r7)
            ad0.s r11 = r11.f277057l
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r7)
            r11.mo125840a(r12)
            com.tencent.mm.plugin.sns.statistics.a0 r11 = com.tencent.p014mm.plugin.sns.statistics.C95006y.f275639b
            com.tencent.mm.plugin.sns.ui.NewSightWidget r12 = r10.f277098o
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r7)
            ad0.s r12 = r12.f277057l
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r7)
            r11.mo131398c(r12)
        L_0x00a5:
            com.tencent.mm.plugin.sns.ui.g2 r11 = com.tencent.p014mm.plugin.sns.model.C94866e1.Kx0()
            r11.mo133238a()
            android.content.Intent r11 = new android.content.Intent
            r11.<init>()
            com.tencent.mm.plugin.sns.ui.NewSightWidget r12 = r10.f277098o
            com.tencent.mm.ui.MMActivity r12 = com.tencent.p014mm.plugin.sns.p106ui.NewSightWidget.m121576m(r12)
            r2 = -1
            r12.setResult(r2, r11)
            com.tencent.mm.plugin.sns.ui.NewSightWidget r11 = r10.f277098o
            com.tencent.mm.ui.MMActivity r11 = com.tencent.p014mm.plugin.sns.p106ui.NewSightWidget.m121576m(r11)
            r11.finish()
            goto L_0x00da
        L_0x00c5:
            java.lang.String r11 = "fake video commit is error"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r11)
            com.tencent.mm.plugin.sns.ui.NewSightWidget r11 = r10.f277098o
            com.tencent.mm.ui.MMActivity r11 = com.tencent.p014mm.plugin.sns.p106ui.NewSightWidget.m121576m(r11)
            r12 = 2131835640(0x7f113af8, float:1.9304424E38)
            android.widget.Toast r11 = nj3.C76912y0.makeText((android.content.Context) r11, (int) r12, (int) r4)
            r11.show()
        L_0x00da:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.NewSightWidget$$j.mo132270a(boolean, int):void");
    }

    /* renamed from: b */
    public void mo132271b(int i, C98670a aVar, String str) {
        String str2;
        String str3;
        int i2 = i;
        String str4 = str;
        SnsMethodCalculate.markStartTimeMs("workFinish", "com.tencent.mm.plugin.sns.ui.NewSightWidget$4");
        NewSightWidget newSightWidget = this.f277098o;
        SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        String str5 = newSightWidget.f277025O;
        SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        if (TextUtils.equals(str4, str5) && !TextUtils.isEmpty(str)) {
            if (aVar == null) {
                NewSightWidget.m121574k(this.f277098o, false);
                C76912y0.makeText((Context) NewSightWidget.m121576m(this.f277098o), (int) C0966R.string.ilv, 0).show();
                NewSightWidget newSightWidget2 = this.f277098o;
                SnsMethodCalculate.markStartTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
                newSightWidget2.mo132265y();
                SnsMethodCalculate.markEndTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
                Log.m105921e("MicroMsg.SightWidget", "commit >> handleBackgroundVideo getRemuxVideoWork >> isError: %s", str4);
            } else {
                if (i2 == 1) {
                    Log.m105925i("MicroMsg.SightWidget", "commit >> handleBackgroundVideo getRemuxVideoWork >> isSuccess workTagId: %s", str4);
                    NewSightWidget newSightWidget3 = this.f277098o;
                    newSightWidget3.f277032V = null;
                    NewSightWidget.m121574k(newSightWidget3, false);
                    NewSightWidget newSightWidget4 = this.f277098o;
                    SnsMethodCalculate.markStartTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
                    newSightWidget4.mo132258r();
                    SnsMethodCalculate.markEndTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
                    str3 = "workFinish";
                    str2 = "com.tencent.mm.plugin.sns.ui.NewSightWidget$4";
                    this.f277098o.mo132127e(this.f277084a, this.f277085b, this.f277086c, this.f277087d, this.f277088e, this.f277089f, this.f277090g, this.f277091h, this.f277092i, this.f277093j, this.f277094k, this.f277095l, this.f277096m, this.f277097n);
                } else {
                    str3 = "workFinish";
                    str2 = "com.tencent.mm.plugin.sns.ui.NewSightWidget$4";
                    if (i2 == 3) {
                        Log.m105925i("MicroMsg.SightWidget", "commit >> handleBackgroundVideo getRemuxVideoWork >> isFailed workTagId: %s", str4);
                        NewSightWidget.m121574k(this.f277098o, false);
                        C76912y0.makeText((Context) NewSightWidget.m121576m(this.f277098o), (int) C0966R.string.ilv, 0).show();
                        NewSightWidget newSightWidget5 = this.f277098o;
                        SnsMethodCalculate.markStartTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
                        newSightWidget5.mo132265y();
                        SnsMethodCalculate.markEndTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
                    }
                }
                SnsMethodCalculate.markEndTimeMs(str3, str2);
            }
        }
        str3 = "workFinish";
        str2 = "com.tencent.mm.plugin.sns.ui.NewSightWidget$4";
        SnsMethodCalculate.markEndTimeMs(str3, str2);
    }
}
