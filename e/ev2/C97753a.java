package ev2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.listview.AnimatedExpandableListView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import h81.C32735h;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;

/* renamed from: ev2.a */
public class C97753a extends AnimatedExpandableListView.C97285b {

    /* renamed from: t */
    public static int f286751t = 0;

    /* renamed from: u */
    public static int f286752u = 1;

    /* renamed from: v */
    public static int f286753v = (1 + 1);

    /* renamed from: w */
    public static List<String> f286754w = new ArrayList();

    /* renamed from: x */
    public static int[] f286755x = {C0966R.string.jdw, C0966R.string.jdu, C0966R.string.jdq, C0966R.string.jdh};

    /* renamed from: y */
    public static int[] f286756y = {C0966R.string.jdx, C0966R.string.jdv, C0966R.string.jdr, C0966R.string.jdi};

    /* renamed from: d */
    public ArrayList<String> f286757d;

    /* renamed from: e */
    public Context f286758e;

    /* renamed from: f */
    public LayoutInflater f286759f;

    /* renamed from: g */
    public int f286760g;

    /* renamed from: h */
    public int f286761h = 0;

    /* renamed from: i */
    public boolean f286762i = false;

    /* renamed from: j */
    public boolean f286763j = false;

    /* renamed from: k */
    public ArrayList<String> f286764k = new ArrayList<>();

    /* renamed from: l */
    public ArrayList<String> f286765l = new ArrayList<>();

    /* renamed from: m */
    public ArrayList<String> f286766m = new ArrayList<>();

    /* renamed from: n */
    public ArrayList<String> f286767n = new ArrayList<>();

    /* renamed from: o */
    public ArrayList<String> f286768o = new ArrayList<>();

    /* renamed from: p */
    public ArrayList<String> f286769p = new ArrayList<>();

    /* renamed from: q */
    public ArrayList<String> f286770q = new ArrayList<>();

    /* renamed from: r */
    public ArrayList<String> f286771r = new ArrayList<>();

    /* renamed from: s */
    public a$$c f286772s = null;

    static {
        MMApplicationContext.getString(C0966R.string.myx);
    }

    public C97753a(Context context) {
        this.f286758e = context;
        this.f286759f = (LayoutInflater) context.getSystemService("layout_inflater");
        SnsMethodCalculate.markStartTimeMs("initWithConfig", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_sns_from_chatroom_enable, 1) == 1) {
            f286751t = 0;
            f286752u = 1;
        } else {
            f286751t = -1;
            f286752u = 0;
        }
        f286753v = f286752u + 1;
        Log.m105925i("MicroMsg.Sns.AnimatedExpandableListAdapter", "initWithConfig %s %s %s", Integer.valueOf(f286751t), Integer.valueOf(f286752u), Integer.valueOf(f286753v));
        SnsMethodCalculate.markEndTimeMs("initWithConfig", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: ev2.a$$b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo133513b(int r17, int r18, boolean r19, android.view.View r20, android.view.ViewGroup r21) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            java.lang.Class<ny.h> r3 = p629ny.C76979h.class
            java.lang.String r4 = "getRealChildView"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            r6 = 1
            if (r20 != 0) goto L_0x007d
            int r7 = r0.f286760g
            r8 = 0
            if (r7 != r6) goto L_0x0021
            android.view.LayoutInflater r7 = r0.f286759f
            r9 = 2131497678(0x7f0c12ce, float:1.8618956E38)
            android.view.View r7 = r7.inflate(r9, r8)
            goto L_0x002a
        L_0x0021:
            android.view.LayoutInflater r7 = r0.f286759f
            r9 = 2131497677(0x7f0c12cd, float:1.8618954E38)
            android.view.View r7 = r7.inflate(r9, r8)
        L_0x002a:
            ev2.a$$b r8 = new ev2.a$$b
            r8.<init>(r0)
            r9 = 2131314025(0x7f094569, float:1.8246463E38)
            android.view.View r9 = r7.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r8.f286774a = r9
            r9 = 2131314024(0x7f094568, float:1.8246461E38)
            android.view.View r9 = r7.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r8.f286775b = r9
            r9 = 2131314023(0x7f094567, float:1.824646E38)
            android.view.View r9 = r7.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r8.f286776c = r9
            r9 = 2131314022(0x7f094566, float:1.8246457E38)
            android.view.View r9 = r7.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r8.f286777d = r9
            r9 = 2131314016(0x7f094560, float:1.8246445E38)
            android.view.View r9 = r7.findViewById(r9)
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            r8.f286778e = r9
            r9 = 2131314021(0x7f094565, float:1.8246455E38)
            android.view.View r9 = r7.findViewById(r9)
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            r8.f286779f = r9
            ev2.a$$a r10 = new ev2.a$$a
            r10.<init>(r0)
            r9.setOnClickListener(r10)
            r7.setTag(r8)
            goto L_0x0086
        L_0x007d:
            java.lang.Object r7 = r20.getTag()
            r8 = r7
            ev2.a$$b r8 = (ev2.a$$b) r8
            r7 = r20
        L_0x0086:
            int r9 = f286752u
            java.lang.String r11 = "√"
            r12 = 3
            java.lang.String r13 = ","
            java.lang.String r14 = ""
            r15 = 0
            java.lang.String r6 = "isEnableUseNewGroup"
            r10 = 8
            if (r2 != r9) goto L_0x018d
            android.widget.TextView r2 = r8.f286774a
            r2.setVisibility(r10)
            android.widget.TextView r2 = r8.f286775b
            r2.setVisibility(r10)
            android.widget.ImageView r2 = r8.f286778e
            r2.setVisibility(r10)
            android.widget.ImageView r2 = r8.f286779f
            r2.setVisibility(r10)
            android.widget.TextView r2 = r8.f286776c
            r2.setVisibility(r15)
            android.widget.TextView r2 = r8.f286777d
            r2.setVisibility(r15)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r5)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r5)
            android.widget.TextView r2 = r8.f286776c
            android.content.Context r6 = r0.f286758e
            android.content.res.Resources r6 = r6.getResources()
            r9 = 2131836993(0x7f114041, float:1.9307168E38)
            java.lang.String r6 = r6.getString(r9)
            r2.setText(r6)
            if (r1 != r12) goto L_0x012d
            java.util.ArrayList<java.lang.String> r1 = r0.f286767n
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x0121
            java.util.ArrayList<java.lang.String> r1 = r0.f286767n
            java.util.List r1 = r0.mo137079i(r1)
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.listToString(r1, r13)
            android.widget.TextView r2 = r8.f286777d
            di3.d r3 = di3.C86312j.m106911c(r3)
            ny.h r3 = (p629ny.C76979h) r3
            android.content.Context r6 = r0.f286758e
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r11)
            r9.append(r1)
            java.lang.String r1 = r9.toString()
            android.widget.TextView r9 = r8.f286777d
            float r9 = r9.getTextSize()
            android.text.SpannableString r1 = r3.yp0(r6, r1, r9)
            r2.setText(r1)
            android.widget.TextView r1 = r8.f286777d
            r1.setVisibility(r15)
            android.widget.TextView r1 = r8.f286777d
            android.content.Context r2 = r0.f286758e
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131101536(0x7f060760, float:1.7815484E38)
            int r2 = r2.getColor(r3)
            r1.setTextColor(r2)
            goto L_0x03c4
        L_0x0121:
            android.widget.TextView r1 = r8.f286777d
            r1.setText(r14)
            android.widget.TextView r1 = r8.f286777d
            r1.setVisibility(r10)
            goto L_0x03c4
        L_0x012d:
            r2 = 2
            if (r1 != r2) goto L_0x03c4
            java.util.ArrayList<java.lang.String> r1 = r0.f286766m
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x0181
            java.util.ArrayList<java.lang.String> r1 = r0.f286766m
            java.util.List r1 = r0.mo137079i(r1)
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.listToString(r1, r13)
            android.widget.TextView r2 = r8.f286777d
            di3.d r3 = di3.C86312j.m106911c(r3)
            ny.h r3 = (p629ny.C76979h) r3
            android.content.Context r6 = r0.f286758e
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r11)
            r9.append(r1)
            java.lang.String r1 = r9.toString()
            android.widget.TextView r9 = r8.f286777d
            float r9 = r9.getTextSize()
            android.text.SpannableString r1 = r3.yp0(r6, r1, r9)
            r2.setText(r1)
            android.widget.TextView r1 = r8.f286777d
            r1.setVisibility(r15)
            android.widget.TextView r1 = r8.f286777d
            android.content.Context r2 = r0.f286758e
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131101535(0x7f06075f, float:1.7815482E38)
            int r2 = r2.getColor(r3)
            r1.setTextColor(r2)
            goto L_0x03c4
        L_0x0181:
            android.widget.TextView r1 = r8.f286777d
            r1.setText(r14)
            android.widget.TextView r1 = r8.f286777d
            r1.setVisibility(r10)
            goto L_0x03c4
        L_0x018d:
            int r9 = f286751t
            if (r2 != r9) goto L_0x0262
            android.widget.TextView r2 = r8.f286774a
            r2.setVisibility(r10)
            android.widget.ImageView r2 = r8.f286778e
            r2.setVisibility(r10)
            android.widget.ImageView r2 = r8.f286779f
            r2.setVisibility(r10)
            android.widget.TextView r2 = r8.f286776c
            r2.setVisibility(r15)
            android.widget.TextView r2 = r8.f286775b
            r2.setVisibility(r10)
            android.widget.TextView r2 = r8.f286777d
            r2.setVisibility(r15)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r5)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r5)
            android.widget.TextView r2 = r8.f286776c
            android.content.Context r3 = r0.f286758e
            android.content.res.Resources r3 = r3.getResources()
            r6 = 2131836999(0x7f114047, float:1.930718E38)
            java.lang.String r3 = r3.getString(r6)
            r2.setText(r3)
            if (r1 != r12) goto L_0x0214
            java.util.ArrayList<java.lang.String> r1 = r0.f286769p
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x0208
            java.util.ArrayList<java.lang.String> r1 = r0.f286769p
            java.util.List r1 = r0.mo137079i(r1)
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.listToString(r1, r13)
            android.widget.TextView r2 = r8.f286777d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r11)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.setText(r1)
            android.widget.TextView r1 = r8.f286777d
            r1.setVisibility(r15)
            android.widget.TextView r1 = r8.f286777d
            android.content.Context r2 = r0.f286758e
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131101536(0x7f060760, float:1.7815484E38)
            int r2 = r2.getColor(r3)
            r1.setTextColor(r2)
            goto L_0x03c4
        L_0x0208:
            android.widget.TextView r1 = r8.f286777d
            r1.setText(r14)
            android.widget.TextView r1 = r8.f286777d
            r1.setVisibility(r10)
            goto L_0x03c4
        L_0x0214:
            r2 = 2
            if (r1 != r2) goto L_0x03c4
            java.util.ArrayList<java.lang.String> r1 = r0.f286768o
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x0256
            java.util.ArrayList<java.lang.String> r1 = r0.f286768o
            java.util.List r1 = r0.mo137079i(r1)
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.listToString(r1, r13)
            android.widget.TextView r2 = r8.f286777d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r11)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.setText(r1)
            android.widget.TextView r1 = r8.f286777d
            r1.setVisibility(r15)
            android.widget.TextView r1 = r8.f286777d
            android.content.Context r2 = r0.f286758e
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131101535(0x7f06075f, float:1.7815482E38)
            int r2 = r2.getColor(r3)
            r1.setTextColor(r2)
            goto L_0x03c4
        L_0x0256:
            android.widget.TextView r1 = r8.f286777d
            r1.setText(r14)
            android.widget.TextView r1 = r8.f286777d
            r1.setVisibility(r10)
            goto L_0x03c4
        L_0x0262:
            int r6 = f286753v
            int r2 = r2 - r6
            android.widget.ImageView r6 = r8.f286779f
            java.lang.String r9 = "initMoreBtnIndicator"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r5)
            java.lang.Object r11 = r6.getTag()
            if (r11 == 0) goto L_0x0282
            boolean r11 = r11 instanceof ev2.a$$d
            if (r11 != 0) goto L_0x0277
            goto L_0x0282
        L_0x0277:
            java.lang.Object r6 = r6.getTag()
            ev2.a$$d r6 = (ev2.a$$d) r6
            r6.f286780a = r1
            r6.f286781b = r2
            goto L_0x028e
        L_0x0282:
            ev2.a$$d r11 = new ev2.a$$d
            r11.<init>(r0)
            r11.f286780a = r1
            r11.f286781b = r2
            r6.setTag(r11)
        L_0x028e:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r5)
            android.widget.TextView r6 = r8.f286774a
            r6.setVisibility(r15)
            android.widget.TextView r6 = r8.f286775b
            r6.setVisibility(r15)
            android.widget.ImageView r6 = r8.f286778e
            r6.setVisibility(r15)
            android.widget.ImageView r6 = r8.f286779f
            r6.setVisibility(r15)
            android.widget.TextView r6 = r8.f286776c
            r6.setVisibility(r10)
            android.widget.TextView r6 = r8.f286777d
            r6.setVisibility(r10)
            java.util.ArrayList<java.lang.String> r6 = r0.f286757d
            java.lang.Object r2 = r6.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            android.widget.TextView r6 = r8.f286774a
            di3.d r9 = di3.C86312j.m106911c(r3)
            ny.h r9 = (p629ny.C76979h) r9
            android.content.Context r10 = r0.f286758e
            android.text.SpannableString r9 = r9.mo107057T1(r10, r2)
            r6.setText(r9)
            android.widget.TextView r6 = r8.f286775b
            java.lang.String r9 = "getDisplayNamesByLabel"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r5)
            b22.b r10 = b22.C28250a.m38138a()
            a22.a r10 = (a22.C67001a) r10
            java.lang.String r10 = r10.mo90968f(r2)
            b22.b r11 = b22.C28250a.m38138a()
            a22.a r11 = (a22.C67001a) r11
            java.util.List r10 = r11.mo90973k(r10)
            if (r10 == 0) goto L_0x0329
            int r11 = r10.size()
            if (r11 != 0) goto L_0x02ec
            goto L_0x0329
        L_0x02ec:
            java.util.ArrayList r11 = new java.util.ArrayList
            int r14 = r10.size()
            r11.<init>(r14)
            java.util.Iterator r10 = r10.iterator()
        L_0x02f9:
            boolean r14 = r10.hasNext()
            if (r14 == 0) goto L_0x0315
            java.lang.Class<d62.i> r14 = d62.C75339i.class
            di3.d r14 = di3.C86312j.m106911c(r14)
            d62.i r14 = (d62.C75339i) r14
            java.lang.Object r15 = r10.next()
            java.lang.String r15 = (java.lang.String) r15
            java.lang.String r14 = r14.getDisplayName(r15)
            r11.add(r14)
            goto L_0x02f9
        L_0x0315:
            java.lang.String r10 = com.tencent.p014mm.sdk.platformtools.Util.listToString(r11, r13)
            di3.d r3 = di3.C86312j.m106911c(r3)
            ny.h r3 = (p629ny.C76979h) r3
            android.content.Context r11 = r0.f286758e
            android.text.SpannableString r14 = r3.mo107057T1(r11, r10)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r5)
            goto L_0x032c
        L_0x0329:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r5)
        L_0x032c:
            r6.setText(r14)
            android.widget.ImageView r3 = r8.f286779f
            android.content.Context r6 = r0.f286758e
            r9 = 2131756986(0x7f1007ba, float:1.9144895E38)
            android.content.res.Resources r10 = r6.getResources()
            r11 = 2131099710(0x7f06003e, float:1.781178E38)
            int r10 = r10.getColor(r11)
            android.graphics.drawable.Drawable r6 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r6, r9, r10)
            r3.setImageDrawable(r6)
            int r3 = r0.f286760g
            r6 = 1
            if (r3 != r6) goto L_0x0392
            r3 = 2
            if (r1 != r3) goto L_0x0368
            boolean r1 = r0.mo137069f(r6, r2)
            if (r1 == 0) goto L_0x035f
            android.widget.ImageView r1 = r8.f286778e
            r2 = 2131756968(0x7f1007a8, float:1.9144858E38)
            r1.setImageResource(r2)
            goto L_0x03c4
        L_0x035f:
            android.widget.ImageView r1 = r8.f286778e
            r2 = 2131756970(0x7f1007aa, float:1.9144863E38)
            r1.setImageResource(r2)
            goto L_0x03c4
        L_0x0368:
            if (r1 != r12) goto L_0x03c4
            int r3 = r0.f286761h
            r6 = 2131756971(0x7f1007ab, float:1.9144865E38)
            r9 = 2131756969(0x7f1007a9, float:1.914486E38)
            if (r3 == r1) goto L_0x037a
            android.widget.ImageView r1 = r8.f286778e
            r1.setImageResource(r6)
            goto L_0x037f
        L_0x037a:
            android.widget.ImageView r1 = r8.f286778e
            r1.setImageResource(r9)
        L_0x037f:
            r3 = 2
            boolean r1 = r0.mo137069f(r3, r2)
            if (r1 == 0) goto L_0x038c
            android.widget.ImageView r1 = r8.f286778e
            r1.setImageResource(r9)
            goto L_0x03c4
        L_0x038c:
            android.widget.ImageView r1 = r8.f286778e
            r1.setImageResource(r6)
            goto L_0x03c4
        L_0x0392:
            r3 = 2
            r6 = 2131231750(0x7f080406, float:1.807959E38)
            if (r1 != r3) goto L_0x03ae
            r9 = 1
            boolean r1 = r0.mo137069f(r9, r2)
            if (r1 == 0) goto L_0x03a8
            android.widget.ImageView r1 = r8.f286778e
            r2 = 2131755390(0x7f10017e, float:1.9141658E38)
            r1.setImageResource(r2)
            goto L_0x03c4
        L_0x03a8:
            android.widget.ImageView r1 = r8.f286778e
            r1.setImageResource(r6)
            goto L_0x03c4
        L_0x03ae:
            if (r1 != r12) goto L_0x03c4
            boolean r1 = r0.mo137069f(r3, r2)
            if (r1 == 0) goto L_0x03bf
            android.widget.ImageView r1 = r8.f286778e
            r2 = 2131755404(0x7f10018c, float:1.9141686E38)
            r1.setImageResource(r2)
            goto L_0x03c4
        L_0x03bf:
            android.widget.ImageView r1 = r8.f286778e
            r1.setImageResource(r6)
        L_0x03c4:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ev2.C97753a.mo133513b(int, int, boolean, android.view.View, android.view.ViewGroup):android.view.View");
    }

    /* renamed from: c */
    public int mo133514c(int i) {
        SnsMethodCalculate.markStartTimeMs("getRealChildrenCount", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        if (i <= 1 || this.f286757d == null) {
            SnsMethodCalculate.markEndTimeMs("getRealChildrenCount", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
            return 0;
        }
        SnsMethodCalculate.markStartTimeMs("isEnableUseNewGroup", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        SnsMethodCalculate.markEndTimeMs("isEnableUseNewGroup", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        int size = this.f286757d.size() + f286753v;
        SnsMethodCalculate.markEndTimeMs("getRealChildrenCount", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        return size;
    }

    /* renamed from: d */
    public void mo137067d(String str) {
        SnsMethodCalculate.markStartTimeMs("addNewTopFive", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        Log.m105919d("MicroMsg.Sns.AnimatedExpandableListAdapter", "recordTopFive : %s", str);
        if (mo137068e() != null) {
            ArrayList arrayList = new ArrayList(mo137068e());
            if (!mo137070g(arrayList, str)) {
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
        SnsMethodCalculate.markEndTimeMs("addNewTopFive", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
    }

    /* renamed from: e */
    public final List<String> mo137068e() {
        SnsMethodCalculate.markStartTimeMs("getTopFive", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        C86709a0.m107528h();
        String str = (String) C86709a0.m107535s().mo121142i().mo119684e(335875, (Object) null);
        Log.m105919d("MicroMsg.Sns.AnimatedExpandableListAdapter", "dz:getTopFive : %s", str);
        if (Util.isNullOrNil(str)) {
            SnsMethodCalculate.markEndTimeMs("getTopFive", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
            return null;
        }
        ArrayList<String> stringsToList = Util.stringsToList(str.split(","));
        SnsMethodCalculate.markEndTimeMs("getTopFive", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        return stringsToList;
    }

    /* renamed from: f */
    public final boolean mo137069f(int i, String str) {
        SnsMethodCalculate.markStartTimeMs("isContain", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        if (i == 1) {
            boolean g = mo137070g(this.f286764k, str);
            SnsMethodCalculate.markEndTimeMs("isContain", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
            return g;
        }
        boolean g2 = mo137070g(this.f286765l, str);
        SnsMethodCalculate.markEndTimeMs("isContain", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        return g2;
    }

    /* renamed from: g */
    public final boolean mo137070g(List<String> list, String str) {
        SnsMethodCalculate.markStartTimeMs("isContains", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        for (String equals : list) {
            if (equals.equals(str)) {
                SnsMethodCalculate.markEndTimeMs("isContains", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
                return true;
            }
        }
        SnsMethodCalculate.markEndTimeMs("isContains", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        return false;
    }

    public Object getChild(int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("getChild", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        String str = this.f286757d.get(i2);
        SnsMethodCalculate.markEndTimeMs("getChild", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        return str;
    }

    public long getChildId(int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("getChildId", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        SnsMethodCalculate.markEndTimeMs("getChildId", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        return 0;
    }

    public Object getGroup(int i) {
        SnsMethodCalculate.markStartTimeMs("getGroup", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        SnsMethodCalculate.markEndTimeMs("getGroup", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        return null;
    }

    public int getGroupCount() {
        SnsMethodCalculate.markStartTimeMs("getGroupCount", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        SnsMethodCalculate.markEndTimeMs("getGroupCount", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        return 4;
    }

    public long getGroupId(int i) {
        SnsMethodCalculate.markStartTimeMs("getGroupId", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        SnsMethodCalculate.markEndTimeMs("getGroupId", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        return 0;
    }

    public View getGroupView(int i, boolean z, View view, ViewGroup viewGroup) {
        a$$b a__b;
        View view2;
        int i2 = i;
        SnsMethodCalculate.markStartTimeMs("getGroupView", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        if (view == null || !(view.getTag() instanceof a$$b)) {
            view2 = this.f286760g == 1 ? this.f286759f.inflate(C0966R.C0971layout.c3e, (ViewGroup) null) : this.f286759f.inflate(C0966R.C0971layout.c3d, (ViewGroup) null);
            a__b = new a$$b(this);
            a__b.f286774a = (TextView) view2.findViewById(C0966R.C0970id.f359259ju2);
            a__b.f286778e = (ImageView) view2.findViewById(C0966R.C0970id.jtv);
            a__b.f286775b = (TextView) view2.findViewById(C0966R.C0970id.f359258ju1);
            view2.setTag(a__b);
        } else {
            a__b = (a$$b) view.getTag();
            view2 = view;
        }
        SnsMethodCalculate.markStartTimeMs("dealWithGroupView", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        a__b.f286774a.setText(f286755x[i2]);
        a__b.f286775b.setText(f286756y[i2]);
        a__b.f286775b.setTextColor(MMApplicationContext.getColor(C0966R.color.FG_1));
        Log.m105925i("MicroMsg.Sns.AnimatedExpandableListAdapter", "dealWithGroupView: groupPosition:%d, mGroupSelect:%d", Integer.valueOf(i), Integer.valueOf(this.f286761h));
        if (i2 == 0 || i2 == 1) {
            if (this.f286761h != i2) {
                a__b.f286778e.setImageResource(C0966R.raw.radio_off);
            } else {
                a__b.f286778e.setImageResource(C0966R.raw.radio_on);
                a__b.f286778e.setContentDescription(this.f286758e.getString(C0966R.string.ik7));
            }
        } else if (i2 != 2) {
            if (i2 == 3) {
                if (this.f286760g == 1) {
                    if (this.f286761h != i2) {
                        a__b.f286778e.setImageResource(C0966R.raw.radio_off);
                    } else {
                        a__b.f286778e.setImageResource(C0966R.raw.round_selector_checked_orange);
                        a__b.f286778e.setContentDescription(this.f286758e.getString(C0966R.string.ik7));
                    }
                } else if (this.f286761h != i2) {
                    a__b.f286778e.setImageResource(C0966R.raw.radio_off);
                } else {
                    a__b.f286778e.setImageResource(C0966R.raw.radio_on_red);
                    a__b.f286778e.setContentDescription(this.f286758e.getString(C0966R.string.ik7));
                }
            }
        } else if (this.f286761h != i2) {
            a__b.f286778e.setImageResource(C0966R.raw.radio_off);
        } else {
            a__b.f286778e.setImageResource(C0966R.raw.radio_on);
            a__b.f286778e.setContentDescription(this.f286758e.getString(C0966R.string.ik7));
        }
        SnsMethodCalculate.markEndTimeMs("dealWithGroupView", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        if (this.f286763j && i2 == 1) {
            View view3 = new View(this.f286758e);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view4 = view3;
            C117292a.m165358d(view4, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/visiblerange/oldversion/OldSnsLabelUIAdapter", "getGroupView", "(IZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/sns/ui/visiblerange/oldversion/OldSnsLabelUIAdapter", "getGroupView", "(IZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            SnsMethodCalculate.markEndTimeMs("getGroupView", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
            return view3;
        } else if (!this.f286762i || !(i2 == 1 || i2 == 2)) {
            SnsMethodCalculate.markEndTimeMs("getGroupView", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
            return view2;
        } else {
            View view5 = new View(this.f286758e);
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view6 = view5;
            C117292a.m165358d(view6, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/visiblerange/oldversion/OldSnsLabelUIAdapter", "getGroupView", "(IZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/sns/ui/visiblerange/oldversion/OldSnsLabelUIAdapter", "getGroupView", "(IZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            SnsMethodCalculate.markEndTimeMs("getGroupView", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
            return view5;
        }
    }

    /* renamed from: h */
    public void mo137077h(ArrayList<String> arrayList) {
        SnsMethodCalculate.markStartTimeMs("setmLabelNames", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        List<String> e = mo137068e();
        ArrayList arrayList2 = new ArrayList();
        if (e == null || arrayList == null) {
            this.f286757d = arrayList;
        } else {
            for (String next : e) {
                if (mo137070g(arrayList, next)) {
                    arrayList.remove(next);
                    arrayList2.add(next);
                }
            }
            arrayList.addAll(0, arrayList2);
            String listToString = Util.listToString(arrayList2, ",");
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119676J(335875, listToString);
            this.f286757d = arrayList;
        }
        SnsMethodCalculate.markEndTimeMs("setmLabelNames", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
    }

    public boolean hasStableIds() {
        SnsMethodCalculate.markStartTimeMs("hasStableIds", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        SnsMethodCalculate.markEndTimeMs("hasStableIds", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        return false;
    }

    /* renamed from: i */
    public final List<String> mo137079i(List<String> list) {
        SnsMethodCalculate.markStartTimeMs("usernameToDisplayName", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        LinkedList linkedList = new LinkedList();
        C86709a0.m107528h();
        if (!C86709a0.m107523b().mo121114l()) {
            SnsMethodCalculate.markEndTimeMs("usernameToDisplayName", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
            return linkedList;
        } else if (list == null) {
            SnsMethodCalculate.markEndTimeMs("usernameToDisplayName", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
            return linkedList;
        } else {
            for (String next : list) {
                C86709a0.m107528h();
                C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(next);
                if (!(z1Var == null || ((int) z1Var.f108320R1) == 0)) {
                    next = z1Var.mo62898f();
                }
                linkedList.add(next);
            }
            SnsMethodCalculate.markEndTimeMs("usernameToDisplayName", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
            return linkedList;
        }
    }

    public boolean isChildSelectable(int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("isChildSelectable", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        SnsMethodCalculate.markEndTimeMs("isChildSelectable", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        return true;
    }
}
