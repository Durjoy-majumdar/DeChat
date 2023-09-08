package com.tencent.p014mm.plugin.sns.p106ui.jsapi;

import a22.C67001a;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import b22.C28250a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.listview.AnimatedExpandableListView;
import com.tencent.p014mm.plugin.sns.p106ui.jsapi.JsapiSnsLabelUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import f40.C86709a0;
import f62.C75700k0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;

/* renamed from: com.tencent.mm.plugin.sns.ui.jsapi.a */
public class C95987a extends AnimatedExpandableListView.C97285b {

    /* renamed from: w */
    public static final /* synthetic */ int f280282w = 0;

    /* renamed from: d */
    public int f280283d = 4;

    /* renamed from: e */
    public int f280284e = 0;

    /* renamed from: f */
    public int f280285f = 1;

    /* renamed from: g */
    public int f280286g = 2;

    /* renamed from: h */
    public int f280287h = 3;

    /* renamed from: i */
    public int[] f280288i = {C0966R.string.jdw, C0966R.string.jdu, C0966R.string.jdq, C0966R.string.jdh};

    /* renamed from: j */
    public int[] f280289j = {C0966R.string.jdx, C0966R.string.jdv, C0966R.string.jdr, C0966R.string.jdi};

    /* renamed from: k */
    public List<String> f280290k;

    /* renamed from: l */
    public ArrayList<String> f280291l;

    /* renamed from: m */
    public Context f280292m;

    /* renamed from: n */
    public LayoutInflater f280293n;

    /* renamed from: o */
    public int f280294o;

    /* renamed from: p */
    public int f280295p = 0;

    /* renamed from: q */
    public boolean f280296q = false;

    /* renamed from: r */
    public ArrayList<String> f280297r = new ArrayList<>();

    /* renamed from: s */
    public ArrayList<String> f280298s = new ArrayList<>();

    /* renamed from: t */
    public ArrayList<String> f280299t = new ArrayList<>();

    /* renamed from: u */
    public ArrayList<String> f280300u = new ArrayList<>();

    /* renamed from: v */
    public C95990c f280301v = null;

    /* renamed from: com.tencent.mm.plugin.sns.ui.jsapi.a$a */
    public class C95988a implements View.OnClickListener {
        public C95988a() {
        }

        public void onClick(View view) {
            Object child;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/jsapi/JsapiSnsLabelUIAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter$1");
            C95991d dVar = (view.getTag() == null || !(view.getTag() instanceof C95991d)) ? null : (C95991d) view.getTag();
            if (dVar == null) {
                Log.m105928w("MicroMsg.Sns.AnimatedExpandableListAdapter", "dividerIv tag is null.");
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter$1");
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/jsapi/JsapiSnsLabelUIAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            C95987a aVar = C95987a.this;
            int i = C95987a.f280282w;
            SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
            C95990c cVar = aVar.f280301v;
            SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
            if (cVar != null) {
                C95987a aVar2 = C95987a.this;
                SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
                C95990c cVar2 = aVar2.f280301v;
                SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
                JsapiSnsLabelUI.C95978d dVar2 = (JsapiSnsLabelUI.C95978d) cVar2;
                dVar2.getClass();
                SnsMethodCalculate.markStartTimeMs("onInnerViewClick", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI$1");
                int i2 = dVar.f280309a;
                int i3 = dVar.f280310b;
                JsapiSnsLabelUI jsapiSnsLabelUI = JsapiSnsLabelUI.this;
                int i4 = JsapiSnsLabelUI.f280245D;
                SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
                jsapiSnsLabelUI.getClass();
                SnsMethodCalculate.markStartTimeMs("gotoEditTag", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
                C95987a aVar3 = jsapiSnsLabelUI.f280258p;
                if (!(aVar3 == null || (child = aVar3.getChild(i2, i3)) == null || !(child instanceof String))) {
                    String str = (String) child;
                    String f = ((C67001a) C28250a.m38138a()).mo90968f(str);
                    Intent intent = new Intent();
                    intent.putExtra("label_id", f);
                    intent.putExtra("label_name", str);
                    intent.putExtra("is_show_delete", false);
                    C88144b.m109795m(jsapiSnsLabelUI.getContext(), "label", ".ui.ContactLabelEditUI", intent, 4002);
                }
                SnsMethodCalculate.markEndTimeMs("gotoEditTag", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
                SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
                SnsMethodCalculate.markEndTimeMs("onInnerViewClick", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI$1");
            }
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter$1");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/jsapi/JsapiSnsLabelUIAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.jsapi.a$b */
    public class C95989b {

        /* renamed from: a */
        public TextView f280303a;

        /* renamed from: b */
        public TextView f280304b;

        /* renamed from: c */
        public TextView f280305c;

        /* renamed from: d */
        public TextView f280306d;

        /* renamed from: e */
        public ImageView f280307e;

        /* renamed from: f */
        public ImageView f280308f;

        public C95989b(C95987a aVar, C95988a aVar2) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.jsapi.a$c */
    public interface C95990c {
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.jsapi.a$d */
    public class C95991d {

        /* renamed from: a */
        public int f280309a;

        /* renamed from: b */
        public int f280310b;

        public C95991d(C95987a aVar) {
        }
    }

    public C95987a(Context context) {
        this.f280292m = context;
        this.f280293n = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: com.tencent.mm.plugin.sns.ui.jsapi.a$b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo133513b(int r11, int r12, boolean r13, android.view.View r14, android.view.ViewGroup r15) {
        /*
            r10 = this;
            java.lang.Class<ny.h> r13 = p629ny.C76979h.class
            java.lang.String r15 = "getRealChildView"
            java.lang.String r0 = "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r15, r0)
            r1 = 1
            if (r14 != 0) goto L_0x0077
            int r14 = r10.f280294o
            r2 = 0
            if (r14 != r1) goto L_0x001b
            android.view.LayoutInflater r14 = r10.f280293n
            r3 = 2131497678(0x7f0c12ce, float:1.8618956E38)
            android.view.View r14 = r14.inflate(r3, r2)
            goto L_0x0024
        L_0x001b:
            android.view.LayoutInflater r14 = r10.f280293n
            r3 = 2131497677(0x7f0c12cd, float:1.8618954E38)
            android.view.View r14 = r14.inflate(r3, r2)
        L_0x0024:
            com.tencent.mm.plugin.sns.ui.jsapi.a$b r3 = new com.tencent.mm.plugin.sns.ui.jsapi.a$b
            r3.<init>(r10, r2)
            r2 = 2131314025(0x7f094569, float:1.8246463E38)
            android.view.View r2 = r14.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r3.f280303a = r2
            r2 = 2131314024(0x7f094568, float:1.8246461E38)
            android.view.View r2 = r14.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r3.f280304b = r2
            r2 = 2131314023(0x7f094567, float:1.824646E38)
            android.view.View r2 = r14.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r3.f280305c = r2
            r2 = 2131314022(0x7f094566, float:1.8246457E38)
            android.view.View r2 = r14.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r3.f280306d = r2
            r2 = 2131314016(0x7f094560, float:1.8246445E38)
            android.view.View r2 = r14.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r3.f280307e = r2
            r2 = 2131314021(0x7f094565, float:1.8246455E38)
            android.view.View r2 = r14.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r3.f280308f = r2
            com.tencent.mm.plugin.sns.ui.jsapi.a$a r4 = new com.tencent.mm.plugin.sns.ui.jsapi.a$a
            r4.<init>()
            r2.setOnClickListener(r4)
            r14.setTag(r3)
            goto L_0x007e
        L_0x0077:
            java.lang.Object r2 = r14.getTag()
            r3 = r2
            com.tencent.mm.plugin.sns.ui.jsapi.a$b r3 = (com.tencent.p014mm.plugin.sns.p106ui.jsapi.C95987a.C95989b) r3
        L_0x007e:
            android.widget.ImageView r2 = r3.f280308f
            java.lang.String r4 = "initMoreBtnIndicator"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r0)
            java.lang.Object r5 = r2.getTag()
            if (r5 == 0) goto L_0x009b
            boolean r5 = r5 instanceof com.tencent.p014mm.plugin.sns.p106ui.jsapi.C95987a.C95991d
            if (r5 != 0) goto L_0x0090
            goto L_0x009b
        L_0x0090:
            java.lang.Object r2 = r2.getTag()
            com.tencent.mm.plugin.sns.ui.jsapi.a$d r2 = (com.tencent.p014mm.plugin.sns.p106ui.jsapi.C95987a.C95991d) r2
            r2.f280309a = r11
            r2.f280310b = r12
            goto L_0x00a7
        L_0x009b:
            com.tencent.mm.plugin.sns.ui.jsapi.a$d r5 = new com.tencent.mm.plugin.sns.ui.jsapi.a$d
            r5.<init>(r10)
            r5.f280309a = r11
            r5.f280310b = r12
            r2.setTag(r5)
        L_0x00a7:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r0)
            java.util.ArrayList<java.lang.String> r2 = r10.f280291l
            int r2 = r2.size()
            java.lang.String r4 = ","
            java.lang.String r5 = ""
            r6 = 0
            r7 = 8
            if (r12 != r2) goto L_0x0178
            android.widget.TextView r12 = r3.f280303a
            r12.setVisibility(r7)
            android.widget.TextView r12 = r3.f280304b
            r12.setVisibility(r7)
            android.widget.ImageView r12 = r3.f280307e
            r12.setVisibility(r7)
            android.widget.ImageView r12 = r3.f280308f
            r12.setVisibility(r7)
            android.widget.TextView r12 = r3.f280305c
            r12.setVisibility(r6)
            android.widget.TextView r12 = r3.f280306d
            r12.setVisibility(r6)
            int r12 = r10.f280287h
            java.lang.String r13 = "√"
            if (r11 != r12) goto L_0x0129
            java.util.ArrayList<java.lang.String> r11 = r10.f280300u
            int r11 = r11.size()
            if (r11 <= 0) goto L_0x011d
            java.util.ArrayList<java.lang.String> r11 = r10.f280300u
            java.util.List r11 = r10.mo133527i(r11)
            java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.Util.listToString(r11, r4)
            android.widget.TextView r12 = r3.f280306d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r13)
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            r12.setText(r11)
            android.widget.TextView r11 = r3.f280306d
            r11.setVisibility(r6)
            android.widget.TextView r11 = r3.f280306d
            android.content.Context r12 = r10.f280292m
            android.content.res.Resources r12 = r12.getResources()
            r13 = 2131101536(0x7f060760, float:1.7815484E38)
            int r12 = r12.getColor(r13)
            r11.setTextColor(r12)
            goto L_0x02a0
        L_0x011d:
            android.widget.TextView r11 = r3.f280306d
            r11.setText(r5)
            android.widget.TextView r11 = r3.f280306d
            r11.setVisibility(r7)
            goto L_0x02a0
        L_0x0129:
            int r12 = r10.f280286g
            if (r11 != r12) goto L_0x02a0
            java.util.ArrayList<java.lang.String> r11 = r10.f280299t
            int r11 = r11.size()
            if (r11 <= 0) goto L_0x016c
            java.util.ArrayList<java.lang.String> r11 = r10.f280299t
            java.util.List r11 = r10.mo133527i(r11)
            java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.Util.listToString(r11, r4)
            android.widget.TextView r12 = r3.f280306d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r13)
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            r12.setText(r11)
            android.widget.TextView r11 = r3.f280306d
            r11.setVisibility(r6)
            android.widget.TextView r11 = r3.f280306d
            android.content.Context r12 = r10.f280292m
            android.content.res.Resources r12 = r12.getResources()
            r13 = 2131101535(0x7f06075f, float:1.7815482E38)
            int r12 = r12.getColor(r13)
            r11.setTextColor(r12)
            goto L_0x02a0
        L_0x016c:
            android.widget.TextView r11 = r3.f280306d
            r11.setText(r5)
            android.widget.TextView r11 = r3.f280306d
            r11.setVisibility(r7)
            goto L_0x02a0
        L_0x0178:
            android.widget.TextView r2 = r3.f280303a
            r2.setVisibility(r6)
            android.widget.TextView r2 = r3.f280304b
            r2.setVisibility(r6)
            android.widget.ImageView r2 = r3.f280307e
            r2.setVisibility(r6)
            android.widget.ImageView r2 = r3.f280308f
            r6 = 4
            r2.setVisibility(r6)
            android.widget.TextView r2 = r3.f280305c
            r2.setVisibility(r7)
            android.widget.TextView r2 = r3.f280306d
            r2.setVisibility(r7)
            java.util.ArrayList<java.lang.String> r2 = r10.f280291l
            java.lang.Object r12 = r2.get(r12)
            java.lang.String r12 = (java.lang.String) r12
            android.widget.TextView r2 = r3.f280303a
            di3.d r6 = di3.C86312j.m106911c(r13)
            ny.h r6 = (p629ny.C76979h) r6
            android.content.Context r7 = r10.f280292m
            android.text.SpannableString r6 = r6.mo107057T1(r7, r12)
            r2.setText(r6)
            android.widget.TextView r2 = r3.f280304b
            java.lang.String r6 = "getDisplayNamesByLabel"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r0)
            b22.b r7 = b22.C28250a.m38138a()
            a22.a r7 = (a22.C67001a) r7
            java.lang.String r7 = r7.mo90968f(r12)
            b22.b r8 = b22.C28250a.m38138a()
            a22.a r8 = (a22.C67001a) r8
            java.util.List r7 = r8.mo90973k(r7)
            if (r7 == 0) goto L_0x0211
            int r8 = r7.size()
            if (r8 != 0) goto L_0x01d4
            goto L_0x0211
        L_0x01d4:
            java.util.ArrayList r5 = new java.util.ArrayList
            int r8 = r7.size()
            r5.<init>(r8)
            java.util.Iterator r7 = r7.iterator()
        L_0x01e1:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x01fd
            java.lang.Class<d62.i> r8 = d62.C75339i.class
            di3.d r8 = di3.C86312j.m106911c(r8)
            d62.i r8 = (d62.C75339i) r8
            java.lang.Object r9 = r7.next()
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r8 = r8.getDisplayName(r9)
            r5.add(r8)
            goto L_0x01e1
        L_0x01fd:
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.listToString(r5, r4)
            di3.d r13 = di3.C86312j.m106911c(r13)
            ny.h r13 = (p629ny.C76979h) r13
            android.content.Context r5 = r10.f280292m
            android.text.SpannableString r5 = r13.mo107057T1(r5, r4)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r0)
            goto L_0x0214
        L_0x0211:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r0)
        L_0x0214:
            r2.setText(r5)
            android.widget.ImageView r13 = r3.f280308f
            r2 = 2131756986(0x7f1007ba, float:1.9144895E38)
            r13.setImageResource(r2)
            int r13 = r10.f280294o
            r2 = 2
            if (r13 != r1) goto L_0x026c
            int r13 = r10.f280286g
            if (r11 != r13) goto L_0x0241
            boolean r11 = r10.mo133517f(r1, r12)
            if (r11 == 0) goto L_0x0238
            android.widget.ImageView r11 = r3.f280307e
            r12 = 2131756968(0x7f1007a8, float:1.9144858E38)
            r11.setImageResource(r12)
            goto L_0x02a0
        L_0x0238:
            android.widget.ImageView r11 = r3.f280307e
            r12 = 2131756970(0x7f1007aa, float:1.9144863E38)
            r11.setImageResource(r12)
            goto L_0x02a0
        L_0x0241:
            int r13 = r10.f280287h
            if (r11 != r13) goto L_0x02a0
            int r13 = r10.f280295p
            r1 = 2131756971(0x7f1007ab, float:1.9144865E38)
            r4 = 2131756969(0x7f1007a9, float:1.914486E38)
            if (r13 == r11) goto L_0x0255
            android.widget.ImageView r11 = r3.f280307e
            r11.setImageResource(r1)
            goto L_0x025a
        L_0x0255:
            android.widget.ImageView r11 = r3.f280307e
            r11.setImageResource(r4)
        L_0x025a:
            boolean r11 = r10.mo133517f(r2, r12)
            if (r11 == 0) goto L_0x0266
            android.widget.ImageView r11 = r3.f280307e
            r11.setImageResource(r4)
            goto L_0x02a0
        L_0x0266:
            android.widget.ImageView r11 = r3.f280307e
            r11.setImageResource(r1)
            goto L_0x02a0
        L_0x026c:
            int r13 = r10.f280286g
            r4 = 2131231750(0x7f080406, float:1.807959E38)
            if (r11 != r13) goto L_0x0288
            boolean r11 = r10.mo133517f(r1, r12)
            if (r11 == 0) goto L_0x0282
            android.widget.ImageView r11 = r3.f280307e
            r12 = 2131755390(0x7f10017e, float:1.9141658E38)
            r11.setImageResource(r12)
            goto L_0x02a0
        L_0x0282:
            android.widget.ImageView r11 = r3.f280307e
            r11.setImageResource(r4)
            goto L_0x02a0
        L_0x0288:
            int r13 = r10.f280287h
            if (r11 != r13) goto L_0x02a0
            boolean r11 = r10.mo133517f(r2, r12)
            if (r11 == 0) goto L_0x029b
            android.widget.ImageView r11 = r3.f280307e
            r12 = 2131755404(0x7f10018c, float:1.9141686E38)
            r11.setImageResource(r12)
            goto L_0x02a0
        L_0x029b:
            android.widget.ImageView r11 = r3.f280307e
            r11.setImageResource(r4)
        L_0x02a0:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r0)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.jsapi.C95987a.mo133513b(int, int, boolean, android.view.View, android.view.ViewGroup):android.view.View");
    }

    /* renamed from: c */
    public int mo133514c(int i) {
        ArrayList<String> arrayList;
        SnsMethodCalculate.markStartTimeMs("getRealChildrenCount", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        if (("visible".equals(this.f280290k.get(i)) || "invisible".equals(this.f280290k.get(i))) && (arrayList = this.f280291l) != null) {
            int size = arrayList.size() + 1;
            SnsMethodCalculate.markEndTimeMs("getRealChildrenCount", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
            return size;
        }
        SnsMethodCalculate.markEndTimeMs("getRealChildrenCount", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        return 0;
    }

    /* renamed from: d */
    public void mo133515d(String str) {
        SnsMethodCalculate.markStartTimeMs("addNewTopFive", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        Log.m105919d("MicroMsg.Sns.AnimatedExpandableListAdapter", "recordTopFive : %s", str);
        if (mo133516e() != null) {
            ArrayList arrayList = new ArrayList(mo133516e());
            if (!mo133518g(arrayList, str)) {
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
        SnsMethodCalculate.markEndTimeMs("addNewTopFive", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
    }

    /* renamed from: e */
    public final List<String> mo133516e() {
        SnsMethodCalculate.markStartTimeMs("getTopFive", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        C86709a0.m107528h();
        String str = (String) C86709a0.m107535s().mo121142i().mo119684e(335875, (Object) null);
        Log.m105919d("MicroMsg.Sns.AnimatedExpandableListAdapter", "dz:getTopFive : %s", str);
        if (Util.isNullOrNil(str)) {
            SnsMethodCalculate.markEndTimeMs("getTopFive", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
            return null;
        }
        ArrayList<String> stringsToList = Util.stringsToList(str.split(","));
        SnsMethodCalculate.markEndTimeMs("getTopFive", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        return stringsToList;
    }

    /* renamed from: f */
    public final boolean mo133517f(int i, String str) {
        SnsMethodCalculate.markStartTimeMs("isContain", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        if (i == 1) {
            boolean g = mo133518g(this.f280297r, str);
            SnsMethodCalculate.markEndTimeMs("isContain", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
            return g;
        }
        boolean g2 = mo133518g(this.f280298s, str);
        SnsMethodCalculate.markEndTimeMs("isContain", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        return g2;
    }

    /* renamed from: g */
    public final boolean mo133518g(List<String> list, String str) {
        SnsMethodCalculate.markStartTimeMs("isContains", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        for (String equals : list) {
            if (equals.equals(str)) {
                SnsMethodCalculate.markEndTimeMs("isContains", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
                return true;
            }
        }
        SnsMethodCalculate.markEndTimeMs("isContains", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        return false;
    }

    public Object getChild(int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("getChild", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        String str = this.f280291l.get(i2);
        SnsMethodCalculate.markEndTimeMs("getChild", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        return str;
    }

    public long getChildId(int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("getChildId", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        SnsMethodCalculate.markEndTimeMs("getChildId", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        return 0;
    }

    public Object getGroup(int i) {
        SnsMethodCalculate.markStartTimeMs("getGroup", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        SnsMethodCalculate.markEndTimeMs("getGroup", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        return null;
    }

    public int getGroupCount() {
        SnsMethodCalculate.markStartTimeMs("getGroupCount", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        int i = this.f280283d;
        SnsMethodCalculate.markEndTimeMs("getGroupCount", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        return i;
    }

    public long getGroupId(int i) {
        SnsMethodCalculate.markStartTimeMs("getGroupId", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        SnsMethodCalculate.markEndTimeMs("getGroupId", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        return 0;
    }

    public View getGroupView(int i, boolean z, View view, ViewGroup viewGroup) {
        C95989b bVar;
        SnsMethodCalculate.markStartTimeMs("getGroupView", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        if (view == null || !(view.getTag() instanceof C95989b)) {
            view = this.f280294o == 1 ? this.f280293n.inflate(C0966R.C0971layout.c3e, (ViewGroup) null) : this.f280293n.inflate(C0966R.C0971layout.c3d, (ViewGroup) null);
            C95989b bVar2 = new C95989b(this, (C95988a) null);
            bVar2.f280303a = (TextView) view.findViewById(C0966R.C0970id.f359259ju2);
            bVar2.f280307e = (ImageView) view.findViewById(C0966R.C0970id.jtv);
            bVar2.f280304b = (TextView) view.findViewById(C0966R.C0970id.f359258ju1);
            view.setTag(bVar2);
            bVar = bVar2;
        } else {
            bVar = (C95989b) view.getTag();
        }
        SnsMethodCalculate.markStartTimeMs("dealWithGroupView", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        bVar.f280303a.setText(this.f280288i[i]);
        bVar.f280304b.setText(this.f280289j[i]);
        if (i == this.f280285f || i == this.f280284e) {
            if (this.f280295p != i) {
                bVar.f280307e.setImageResource(C0966R.raw.radio_off);
            } else {
                bVar.f280307e.setImageResource(C0966R.raw.radio_on);
                bVar.f280307e.setContentDescription(this.f280292m.getString(C0966R.string.ik7));
            }
        } else if (i == this.f280286g) {
            if (this.f280295p != i) {
                bVar.f280307e.setImageResource(C0966R.raw.radio_off);
            } else {
                bVar.f280307e.setImageResource(C0966R.raw.radio_on);
                bVar.f280307e.setContentDescription(this.f280292m.getString(C0966R.string.ik7));
            }
        } else if (i == this.f280287h) {
            if (this.f280294o == 1) {
                if (this.f280295p != i) {
                    bVar.f280307e.setImageResource(C0966R.raw.radio_off);
                } else {
                    bVar.f280307e.setImageResource(C0966R.raw.round_selector_checked_orange);
                    bVar.f280307e.setContentDescription(this.f280292m.getString(C0966R.string.ik7));
                }
            } else if (this.f280295p != i) {
                bVar.f280307e.setImageResource(C0966R.raw.radio_off);
            } else {
                bVar.f280307e.setImageResource(C0966R.raw.radio_on_red);
                bVar.f280307e.setContentDescription(this.f280292m.getString(C0966R.string.ik7));
            }
        }
        SnsMethodCalculate.markEndTimeMs("dealWithGroupView", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        if (!this.f280296q || i != this.f280285f) {
            SnsMethodCalculate.markEndTimeMs("getGroupView", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
            return view;
        }
        View view2 = new View(this.f280292m);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view3 = view2;
        C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/jsapi/JsapiSnsLabelUIAdapter", "getGroupView", "(IZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/sns/ui/jsapi/JsapiSnsLabelUIAdapter", "getGroupView", "(IZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        SnsMethodCalculate.markEndTimeMs("getGroupView", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        return view2;
    }

    /* renamed from: h */
    public void mo133525h(ArrayList<String> arrayList) {
        SnsMethodCalculate.markStartTimeMs("setmLabelNames", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        List<String> e = mo133516e();
        ArrayList arrayList2 = new ArrayList();
        if (e == null || arrayList == null) {
            this.f280291l = arrayList;
        } else {
            for (String next : e) {
                if (mo133518g(arrayList, next)) {
                    arrayList.remove(next);
                    arrayList2.add(next);
                }
            }
            arrayList.addAll(0, arrayList2);
            String listToString = Util.listToString(arrayList2, ",");
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119676J(335875, listToString);
            this.f280291l = arrayList;
        }
        SnsMethodCalculate.markEndTimeMs("setmLabelNames", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
    }

    public boolean hasStableIds() {
        SnsMethodCalculate.markStartTimeMs("hasStableIds", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        SnsMethodCalculate.markEndTimeMs("hasStableIds", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        return false;
    }

    /* renamed from: i */
    public final List<String> mo133527i(List<String> list) {
        SnsMethodCalculate.markStartTimeMs("usernameToDisplayName", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        LinkedList linkedList = new LinkedList();
        C86709a0.m107528h();
        if (!C86709a0.m107523b().mo121114l()) {
            SnsMethodCalculate.markEndTimeMs("usernameToDisplayName", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
            return linkedList;
        } else if (list == null) {
            SnsMethodCalculate.markEndTimeMs("usernameToDisplayName", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
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
            SnsMethodCalculate.markEndTimeMs("usernameToDisplayName", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
            return linkedList;
        }
    }

    public boolean isChildSelectable(int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("isChildSelectable", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        SnsMethodCalculate.markEndTimeMs("isChildSelectable", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        return true;
    }
}
