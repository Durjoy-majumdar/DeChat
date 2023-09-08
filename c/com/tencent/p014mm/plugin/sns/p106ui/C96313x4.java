package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.listview.AnimatedExpandableListView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.smiley.C96963p0;
import com.tencent.p014mm.storage.C72996z1;
import d62.C75339i;
import di3.C86312j;
import dv2.C58442c;
import dv2.C58446g;
import f40.C86709a0;
import f62.C75700k0;
import h81.C32735h;
import java.util.ArrayList;
import java.util.List;
import p1035sf.C90183c;

/* renamed from: com.tencent.mm.plugin.sns.ui.x4 */
public class C96313x4 extends AnimatedExpandableListView.C97285b {

    /* renamed from: u */
    public static int f281639u = 0;

    /* renamed from: v */
    public static int f281640v = 1;

    /* renamed from: w */
    public static int f281641w = (1 + 1);

    /* renamed from: x */
    public static final String f281642x = MMApplicationContext.getString(C0966R.string.myx);

    /* renamed from: y */
    public static String f281643y = "";

    /* renamed from: z */
    public static List<String> f281644z = new ArrayList();

    /* renamed from: d */
    public C58442c f281645d;

    /* renamed from: e */
    public ArrayList<String> f281646e;

    /* renamed from: f */
    public Context f281647f;

    /* renamed from: g */
    public LayoutInflater f281648g;

    /* renamed from: h */
    public int f281649h;

    /* renamed from: i */
    public int f281650i = 0;

    /* renamed from: j */
    public boolean f281651j = false;

    /* renamed from: k */
    public boolean f281652k = false;

    /* renamed from: l */
    public ArrayList<String> f281653l = new ArrayList<>();

    /* renamed from: m */
    public ArrayList<String> f281654m = new ArrayList<>();

    /* renamed from: n */
    public ArrayList<String> f281655n = new ArrayList<>();

    /* renamed from: o */
    public ArrayList<String> f281656o = new ArrayList<>();

    /* renamed from: p */
    public ArrayList<String> f281657p = new ArrayList<>();

    /* renamed from: q */
    public ArrayList<String> f281658q = new ArrayList<>();

    /* renamed from: r */
    public x4$$j f281659r;

    /* renamed from: s */
    public CharSequence f281660s;

    /* renamed from: t */
    public CharSequence f281661t;

    public C96313x4(Context context, C58442c cVar) {
        new ArrayList();
        new ArrayList();
        this.f281659r = null;
        this.f281660s = "";
        this.f281661t = "";
        this.f281647f = context;
        this.f281648g = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f281645d = cVar == null ? new C58446g() : cVar;
        SnsMethodCalculate.markStartTimeMs("initWithConfig", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_sns_from_chatroom_enable, 1) == 1) {
            f281639u = 0;
            f281640v = 1;
        } else {
            f281639u = -1;
            f281640v = 0;
        }
        f281641w = f281640v + 1;
        Log.m105925i("MicroMsg.Sns.AnimatedExpandableListAdapter", "initWithConfig %s %s %s", Integer.valueOf(f281639u), Integer.valueOf(f281640v), Integer.valueOf(f281641w));
        SnsMethodCalculate.markEndTimeMs("initWithConfig", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x004a, code lost:
        if (r14 != false) goto L_0x004c;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.CharSequence m123522k(java.util.ArrayList<java.lang.String> r16, boolean r17, int r18) {
        /*
            java.lang.String r0 = "packageLabelInfo"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            android.text.SpannableStringBuilder r2 = new android.text.SpannableStringBuilder
            r2.<init>()
            r3 = 0
            r4 = 0
        L_0x000f:
            int r5 = r16.size()
            if (r4 >= r5) goto L_0x00d8
            int r5 = r2.length()
            r6 = r16
            java.lang.Object r7 = r6.get(r4)
            java.lang.String r7 = (java.lang.String) r7
            b22.b r8 = b22.C28250a.m38138a()
            a22.a r8 = (a22.C67001a) r8
            java.lang.String r8 = r8.mo90970h(r7)
            boolean r9 = android.text.TextUtils.isEmpty(r8)
            if (r9 == 0) goto L_0x0035
        L_0x0031:
            r10 = r18
            goto L_0x00d4
        L_0x0035:
            b22.b r9 = b22.C28250a.m38138a()
            a22.a r9 = (a22.C67001a) r9
            java.util.List r9 = r9.mo90973k(r7)
            r10 = 2
            r11 = 3
            java.lang.String r12 = "MicroMsg.Sns.AnimatedExpandableListAdapter"
            r13 = 1
            if (r9 == 0) goto L_0x004c
            boolean r14 = r9.isEmpty()
            if (r14 == 0) goto L_0x0076
        L_0x004c:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.lang.String r14 = f281643y
            boolean r14 = r7.equals(r14)
            if (r14 == 0) goto L_0x005e
            java.util.List<java.lang.String> r14 = f281644z
            r9.addAll(r14)
        L_0x005e:
            java.lang.Object[] r14 = new java.lang.Object[r11]
            java.lang.String r15 = f281643y
            boolean r15 = r7.equals(r15)
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r15)
            r14[r3] = r15
            r14[r13] = r8
            r14[r10] = r7
            java.lang.String r15 = "packageLabelInfo nameList empty,new create:%b, label name:%s id:%s "
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r15, r14)
        L_0x0076:
            java.lang.Object[] r11 = new java.lang.Object[r11]
            r11[r3] = r8
            r11[r13] = r7
            int r7 = r9.size()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r11[r10] = r7
            java.lang.String r7 = "packageLabelInfo label name:%s id:%s size:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r7, r11)
            int r7 = r16.size()
            int r7 = r7 - r13
            if (r4 == r7) goto L_0x00a5
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r8)
            java.lang.String r9 = f281642x
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            goto L_0x00a6
        L_0x00a5:
            r7 = r8
        L_0x00a6:
            java.lang.Class<ny.h> r9 = p629ny.C76979h.class
            di3.d r9 = di3.C86312j.m106911c(r9)
            ny.h r9 = (p629ny.C76979h) r9
            android.content.Context r10 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.text.SpannableString r7 = r9.mo107057T1(r10, r7)
            r2.append(r7)
            if (r17 == 0) goto L_0x0031
            android.text.style.ForegroundColorSpan r7 = new android.text.style.ForegroundColorSpan
            android.content.Context r9 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r10 = r18
            int r9 = kg3.C76577a.m92153d(r9, r10)
            r7.<init>(r9)
            int r8 = r8.length()
            int r8 = r8 + r5
            r9 = 17
            r2.setSpan(r7, r5, r8, r9)
        L_0x00d4:
            int r4 = r4 + 1
            goto L_0x000f
        L_0x00d8:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.C96313x4.m123522k(java.util.ArrayList, boolean, int):java.lang.CharSequence");
    }

    /* renamed from: c */
    public int mo133514c(int i) {
        SnsMethodCalculate.markStartTimeMs("getRealChildrenCount", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        int j = this.f281645d.mo83404j(i);
        if (this.f281645d.mo83405k(j, 2) || (this.f281645d.mo83405k(j, 3) && this.f281646e != null)) {
            SnsMethodCalculate.markStartTimeMs("isEnableUseNewGroup", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUIAdapter");
            SnsMethodCalculate.markEndTimeMs("isEnableUseNewGroup", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUIAdapter");
            int i2 = f281641w;
            SnsMethodCalculate.markEndTimeMs("getRealChildrenCount", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
            return i2;
        }
        SnsMethodCalculate.markEndTimeMs("getRealChildrenCount", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        return 0;
    }

    /* renamed from: d */
    public void mo134132d(String str) {
        SnsMethodCalculate.markStartTimeMs("addNewTopFive", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        Log.m105919d("MicroMsg.Sns.AnimatedExpandableListAdapter", "recordTopFive : %s", str);
        if (mo134135g() != null) {
            ArrayList arrayList = new ArrayList(mo134135g());
            if (!mo134144i(arrayList, str)) {
                if (arrayList.size() == 5) {
                    arrayList.remove(4);
                    arrayList.add(0, str);
                } else {
                    arrayList.add(0, str);
                }
                String listToString = Util.listToString(arrayList, ",");
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119676J(335875, listToString);
            }
        } else {
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119676J(335875, str);
        }
        SnsMethodCalculate.markEndTimeMs("addNewTopFive", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
    }

    /* renamed from: e */
    public void mo134133e() {
        SnsMethodCalculate.markStartTimeMs("clearExcludeSelectedOtherUsers", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        this.f281656o.clear();
        this.f281661t = "";
        SnsMethodCalculate.markEndTimeMs("clearExcludeSelectedOtherUsers", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
    }

    /* renamed from: f */
    public void mo134134f() {
        SnsMethodCalculate.markStartTimeMs("clearIncludeSelectedOtherUsers", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        this.f281655n.clear();
        this.f281660s = "";
        SnsMethodCalculate.markEndTimeMs("clearIncludeSelectedOtherUsers", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
    }

    /* renamed from: g */
    public final List<String> mo134135g() {
        SnsMethodCalculate.markStartTimeMs("getTopFive", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        C86709a0.m107528h();
        String str = (String) C86709a0.m107535s().mo121142i().mo119684e(335875, (Object) null);
        Log.m105919d("MicroMsg.Sns.AnimatedExpandableListAdapter", "dz:getTopFive : %s", str);
        if (Util.isNullOrNil(str)) {
            SnsMethodCalculate.markEndTimeMs("getTopFive", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
            return null;
        }
        ArrayList<String> stringsToList = Util.stringsToList(str.split(","));
        SnsMethodCalculate.markEndTimeMs("getTopFive", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        return stringsToList;
    }

    public Object getChild(int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("getChild", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        String str = this.f281646e.get(i2);
        SnsMethodCalculate.markEndTimeMs("getChild", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        return str;
    }

    public long getChildId(int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("getChildId", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        SnsMethodCalculate.markEndTimeMs("getChildId", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        return 0;
    }

    public Object getGroup(int i) {
        SnsMethodCalculate.markStartTimeMs("getGroup", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        SnsMethodCalculate.markEndTimeMs("getGroup", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        return null;
    }

    public int getGroupCount() {
        SnsMethodCalculate.markStartTimeMs("getGroupCount", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        SnsMethodCalculate.markEndTimeMs("getGroupCount", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        return 4;
    }

    public long getGroupId(int i) {
        SnsMethodCalculate.markStartTimeMs("getGroupId", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        SnsMethodCalculate.markEndTimeMs("getGroupId", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0117, code lost:
        if (r11 != 4) goto L_0x0171;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x018a, code lost:
        if (r1 != 4) goto L_0x01b4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0212  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getGroupView(int r20, boolean r21, android.view.View r22, android.view.ViewGroup r23) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            java.lang.String r2 = "getGroupView"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            r4 = 1
            if (r22 == 0) goto L_0x0021
            java.lang.Object r5 = r22.getTag()
            boolean r5 = r5 instanceof com.tencent.p014mm.plugin.sns.p106ui.x4$$i
            if (r5 != 0) goto L_0x0017
            goto L_0x0021
        L_0x0017:
            java.lang.Object r5 = r22.getTag()
            com.tencent.mm.plugin.sns.ui.x4$$i r5 = (com.tencent.p014mm.plugin.sns.p106ui.x4$$i) r5
            r6 = r5
            r5 = r22
            goto L_0x0062
        L_0x0021:
            int r5 = r0.f281649h
            r6 = 0
            if (r5 != r4) goto L_0x0030
            android.view.LayoutInflater r5 = r0.f281648g
            r7 = 2131497681(0x7f0c12d1, float:1.8618962E38)
            android.view.View r5 = r5.inflate(r7, r6)
            goto L_0x0039
        L_0x0030:
            android.view.LayoutInflater r5 = r0.f281648g
            r7 = 2131497680(0x7f0c12d0, float:1.861896E38)
            android.view.View r5 = r5.inflate(r7, r6)
        L_0x0039:
            com.tencent.mm.plugin.sns.ui.x4$$i r6 = new com.tencent.mm.plugin.sns.ui.x4$$i
            r6.<init>(r0)
            r7 = 2131314025(0x7f094569, float:1.8246463E38)
            android.view.View r7 = r5.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r6.f281681a = r7
            r7 = 2131314016(0x7f094560, float:1.8246445E38)
            android.view.View r7 = r5.findViewById(r7)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r6.f281685e = r7
            r7 = 2131314024(0x7f094568, float:1.8246461E38)
            android.view.View r7 = r5.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r6.f281682b = r7
            r5.setTag(r6)
        L_0x0062:
            dv2.c r7 = r0.f281645d
            int r7 = r7.mo83404j(r1)
            r8 = r0
            com.tencent.mm.plugin.sns.ui.w1 r8 = (com.tencent.p014mm.plugin.sns.p106ui.C96270w1) r8
            java.lang.String r9 = "dealWithGroupView"
            java.lang.String r10 = "com.tencent.mm.plugin.sns.ui.NewSnsLabelUIAdapter"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r10)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r3)
            dv2.c r11 = r8.f281645d
            int r11 = r11.mo83404j(r1)
            dv2.c r12 = r8.f281645d
            int r13 = r8.f281650i
            int r12 = r12.mo83402h(r13)
            r13 = 3
            java.lang.Object[] r14 = new java.lang.Object[r13]
            java.lang.Integer r15 = java.lang.Integer.valueOf(r20)
            r13 = 0
            r14[r13] = r15
            java.lang.Integer r15 = java.lang.Integer.valueOf(r12)
            r14[r4] = r15
            java.lang.Integer r15 = java.lang.Integer.valueOf(r11)
            r13 = 2
            r14[r13] = r15
            java.lang.String r15 = "MicroMsg.Sns.AnimatedExpandableListAdapter"
            java.lang.String r13 = "dealWithGroupView: pos:%d, groupSelectPosition:%d, state:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r15, r13, r14)
            android.widget.TextView r13 = r6.f281681a
            dv2.c r14 = r8.f281645d
            r14.getClass()
            java.lang.String r15 = "findHeaderTitleResId"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r15, r4)
            dv2.f r14 = r14.mo83401g(r11)
            r17 = r5
            java.lang.String r5 = "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupHeaderConfigItem"
            if (r14 != 0) goto L_0x00c0
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r4)
            r18 = r2
            r14 = 0
            goto L_0x00cf
        L_0x00c0:
            r18 = r2
            java.lang.String r2 = "getTitleResId"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r5)
            int r14 = r14.f167426b
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r5)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r4)
        L_0x00cf:
            r13.setText(r14)
            android.widget.TextView r2 = r6.f281682b
            dv2.c r13 = r8.f281645d
            r13.getClass()
            java.lang.String r14 = "findHeaderSubTitleResId"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r14, r4)
            dv2.f r13 = r13.mo83401g(r11)
            if (r13 != 0) goto L_0x00e9
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r4)
            r13 = 0
            goto L_0x00f6
        L_0x00e9:
            java.lang.String r15 = "getSubTitleResId"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r15, r5)
            int r13 = r13.f167427c
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r5)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r4)
        L_0x00f6:
            r2.setText(r13)
            android.widget.TextView r2 = r6.f281682b
            r4 = 2131099804(0x7f06009c, float:1.7811972E38)
            int r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getColor(r4)
            r2.setTextColor(r4)
            r2 = 2131756874(0x7f10074a, float:1.9144668E38)
            r4 = 2131835572(0x7f113ab4, float:1.9304286E38)
            r5 = 4
            if (r11 == 0) goto L_0x0156
            r13 = 1
            if (r11 == r13) goto L_0x0156
            r14 = 2
            if (r11 == r14) goto L_0x0156
            r14 = 3
            if (r11 == r14) goto L_0x011a
            if (r11 == r5) goto L_0x0156
            goto L_0x0171
        L_0x011a:
            int r11 = r8.f281649h
            if (r11 != r13) goto L_0x013a
            if (r12 == r1) goto L_0x0126
            android.widget.ImageView r4 = r6.f281685e
            r4.setImageResource(r2)
            goto L_0x0171
        L_0x0126:
            android.widget.ImageView r2 = r6.f281685e
            r11 = 2131756910(0x7f10076e, float:1.914474E38)
            r2.setImageResource(r11)
            android.widget.ImageView r2 = r6.f281685e
            android.content.Context r11 = r8.f281647f
            java.lang.String r4 = r11.getString(r4)
            r2.setContentDescription(r4)
            goto L_0x0171
        L_0x013a:
            if (r12 == r1) goto L_0x0142
            android.widget.ImageView r4 = r6.f281685e
            r4.setImageResource(r2)
            goto L_0x0171
        L_0x0142:
            android.widget.ImageView r2 = r6.f281685e
            r11 = 2131756878(0x7f10074e, float:1.9144676E38)
            r2.setImageResource(r11)
            android.widget.ImageView r2 = r6.f281685e
            android.content.Context r11 = r8.f281647f
            java.lang.String r4 = r11.getString(r4)
            r2.setContentDescription(r4)
            goto L_0x0171
        L_0x0156:
            if (r12 == r1) goto L_0x015e
            android.widget.ImageView r4 = r6.f281685e
            r4.setImageResource(r2)
            goto L_0x0171
        L_0x015e:
            android.widget.ImageView r2 = r6.f281685e
            r11 = 2131756876(0x7f10074c, float:1.9144672E38)
            r2.setImageResource(r11)
            android.widget.ImageView r2 = r6.f281685e
            android.content.Context r11 = r8.f281647f
            java.lang.String r4 = r11.getString(r4)
            r2.setContentDescription(r4)
        L_0x0171:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r3)
            dv2.c r2 = r8.f281645d
            int r1 = r2.mo83404j(r1)
            r2 = 15
            r4 = -1
            r8 = 8
            if (r1 == 0) goto L_0x019e
            r11 = 1
            if (r1 == r11) goto L_0x019e
            r11 = 2
            if (r1 == r11) goto L_0x018d
            r11 = 3
            if (r1 == r11) goto L_0x018d
            if (r1 == r5) goto L_0x019e
            goto L_0x01b4
        L_0x018d:
            android.widget.TextView r1 = r6.f281682b
            r1.setVisibility(r8)
            android.widget.TextView r1 = r6.f281681a
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r1 = (android.widget.RelativeLayout.LayoutParams) r1
            r1.addRule(r2, r4)
            goto L_0x01b4
        L_0x019e:
            android.widget.TextView r1 = r6.f281682b
            r5 = 0
            r1.setVisibility(r5)
            android.widget.TextView r1 = r6.f281681a
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r1 = (android.widget.RelativeLayout.LayoutParams) r1
            r5 = 10
            r1.addRule(r5, r4)
            r1.removeRule(r2)
        L_0x01b4:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r10)
            boolean r1 = r0.f281652k
            if (r1 == 0) goto L_0x0212
            dv2.c r1 = r0.f281645d
            r2 = 1
            boolean r1 = r1.mo83405k(r7, r2)
            if (r1 == 0) goto L_0x0212
            android.view.View r1 = new android.view.View
            android.content.Context r2 = r0.f281647f
            r1.<init>(r2)
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            r2.mo10233c(r4)
            java.lang.Object[] r10 = r2.mo10232b()
            java.lang.String r11 = "com/tencent/mm/plugin/sns/ui/SnsLabelUIAdapter"
            java.lang.String r12 = "getGroupView"
            java.lang.String r13 = "(IZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            r9 = r1
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            r4 = 0
            java.lang.Object r2 = r2.mo10231a(r4)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r10 = "com/tencent/mm/plugin/sns/ui/SnsLabelUIAdapter"
            java.lang.String r11 = "getGroupView"
            java.lang.String r12 = "(IZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
            r2 = r18
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return r1
        L_0x0212:
            r2 = r18
            boolean r1 = r0.f281651j
            if (r1 == 0) goto L_0x0276
            dv2.c r1 = r0.f281645d
            r4 = 1
            boolean r1 = r1.mo83405k(r7, r4)
            if (r1 != 0) goto L_0x022a
            dv2.c r1 = r0.f281645d
            r4 = 2
            boolean r1 = r1.mo83405k(r7, r4)
            if (r1 == 0) goto L_0x0276
        L_0x022a:
            android.view.View r1 = new android.view.View
            android.content.Context r4 = r0.f281647f
            r1.<init>(r4)
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            r4.mo10233c(r5)
            java.lang.Object[] r10 = r4.mo10232b()
            java.lang.String r11 = "com/tencent/mm/plugin/sns/ui/SnsLabelUIAdapter"
            java.lang.String r12 = "getGroupView"
            java.lang.String r13 = "(IZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            r9 = r1
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            r5 = 0
            java.lang.Object r4 = r4.mo10231a(r5)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r1.setVisibility(r4)
            java.lang.String r10 = "com/tencent/mm/plugin/sns/ui/SnsLabelUIAdapter"
            java.lang.String r11 = "getGroupView"
            java.lang.String r12 = "(IZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return r1
        L_0x0276:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.C96313x4.getGroupView(int, boolean, android.view.View, android.view.ViewGroup):android.view.View");
    }

    /* renamed from: h */
    public final boolean mo134142h(int i, String str) {
        SnsMethodCalculate.markStartTimeMs("isContain", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        if (i == 1) {
            boolean i2 = mo134144i(this.f281653l, str);
            SnsMethodCalculate.markEndTimeMs("isContain", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
            return i2;
        }
        boolean i3 = mo134144i(this.f281654m, str);
        SnsMethodCalculate.markEndTimeMs("isContain", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        return i3;
    }

    public boolean hasStableIds() {
        SnsMethodCalculate.markStartTimeMs("hasStableIds", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        SnsMethodCalculate.markEndTimeMs("hasStableIds", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        return false;
    }

    /* renamed from: i */
    public final boolean mo134144i(List<String> list, String str) {
        SnsMethodCalculate.markStartTimeMs("isContains", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        for (String equals : list) {
            if (equals.equals(str)) {
                SnsMethodCalculate.markEndTimeMs("isContains", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
                return true;
            }
        }
        SnsMethodCalculate.markEndTimeMs("isContains", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        return false;
    }

    public boolean isChildSelectable(int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("isChildSelectable", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        SnsMethodCalculate.markEndTimeMs("isChildSelectable", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        return true;
    }

    /* renamed from: j */
    public CharSequence mo134146j(ArrayList<String> arrayList, int i) {
        SnsMethodCalculate.markStartTimeMs("packageContactName", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String string = MMApplicationContext.getString(C0966R.string.myx);
        int i2 = 0;
        while (i2 < arrayList.size()) {
            int length = spannableStringBuilder.length();
            String str = arrayList.get(i2);
            String Si = ((C75339i) C86312j.m106911c(C75339i.class)).mo62515Si(str);
            if (C90183c.m112859g(Si)) {
                C86709a0.m107528h();
                C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str);
                if (z1Var != null && !TextUtils.isEmpty(z1Var.mo62909j3())) {
                    Si = z1Var.mo62898f();
                }
                i2++;
            }
            String str2 = Si + (i2 != arrayList.size() - 1 ? string : "");
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(i);
            spannableStringBuilder.append(str2);
            spannableStringBuilder.setSpan(foregroundColorSpan, length, Si.length() + length, 17);
            Log.m105919d("MicroMsg.Sns.AnimatedExpandableListAdapter", "packageContactName do color current:%s;start:%d;end:%d;content:%s;", spannableStringBuilder, Integer.valueOf(length), Integer.valueOf(Si.length() + length), spannableStringBuilder.subSequence(length, Si.length() + length));
            i2++;
        }
        SpannableString M = C96963p0.wx0().mo83004M(MMApplicationContext.getContext(), spannableStringBuilder);
        SnsMethodCalculate.markEndTimeMs("packageContactName", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        return M;
    }

    /* renamed from: l */
    public void mo134147l(ArrayList<String> arrayList) {
        SnsMethodCalculate.markStartTimeMs("setmLabelNames", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        List<String> g = mo134135g();
        ArrayList arrayList2 = new ArrayList();
        if (g == null || arrayList == null) {
            this.f281646e = arrayList;
        } else {
            for (String next : g) {
                if (mo134144i(arrayList, next)) {
                    arrayList.remove(next);
                    arrayList2.add(next);
                }
            }
            arrayList.addAll(0, arrayList2);
            String listToString = Util.listToString(arrayList2, ",");
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119676J(335875, listToString);
            this.f281646e = arrayList;
        }
        SnsMethodCalculate.markEndTimeMs("setmLabelNames", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
    }

    public void notifyDataSetChanged() {
        SnsMethodCalculate.markStartTimeMs("notifyDataSetChanged", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        super.notifyDataSetChanged();
        Log.m105918d("MicroMsg.Sns.AnimatedExpandableListAdapter", "notifyDataSetChanged: ");
        SnsMethodCalculate.markEndTimeMs("notifyDataSetChanged", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
    }
}
