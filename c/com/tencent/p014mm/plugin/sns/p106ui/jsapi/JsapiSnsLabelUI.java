package com.tencent.p014mm.plugin.sns.p106ui.jsapi;

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
import b22.C28251b;
import cm0.C28613b;
import com.google.android.gms.wearable.WearableStatusCodes;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelavatar.C68097n;
import com.tencent.p014mm.modelavatar.C68098o;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.p136ui.contact.C74560s1;
import com.tencent.p014mm.p136ui.widget.listview.AnimatedExpandableListView;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.C82086j;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiSetAudioState;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.model.C43039l0;
import com.tencent.p014mm.plugin.sns.p106ui.jsapi.C95987a;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import d62.C75339i;
import di3.C86312j;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import ke3.C88144b;
import nj3.C76879j;
import ob0.C11385n;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p196ln.C76706g;
import qo3.C89779i0;
import wu2.C102505a;

/* renamed from: com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI */
public class JsapiSnsLabelUI extends MMActivity implements C11385n {

    /* renamed from: D */
    public static final /* synthetic */ int f280245D = 0;

    /* renamed from: A */
    public ArrayList<String> f280246A;

    /* renamed from: B */
    public ArrayList<Long> f280247B;

    /* renamed from: C */
    public ArrayList<String[]> f280248C;

    /* renamed from: d */
    public int f280249d = 0;

    /* renamed from: e */
    public int f280250e = 1;

    /* renamed from: f */
    public int f280251f = 2;

    /* renamed from: g */
    public int f280252g = 3;

    /* renamed from: h */
    public List<String> f280253h = Arrays.asList("public,private,visible,invisible".split(","));

    /* renamed from: i */
    public AnimatedExpandableListView f280254i;

    /* renamed from: j */
    public ArrayList<String> f280255j;

    /* renamed from: n */
    public String f280256n;

    /* renamed from: o */
    public String f280257o;

    /* renamed from: p */
    public C95987a f280258p;

    /* renamed from: q */
    public int f280259q = this.f280249d;

    /* renamed from: r */
    public boolean f280260r = false;

    /* renamed from: s */
    public boolean f280261s = false;

    /* renamed from: t */
    public boolean f280262t = false;

    /* renamed from: u */
    public int f280263u;

    /* renamed from: v */
    public C89779i0 f280264v;

    /* renamed from: w */
    public String f280265w;

    /* renamed from: x */
    public int f280266x;

    /* renamed from: y */
    public List<String> f280267y = new ArrayList();

    /* renamed from: z */
    public ArrayList<String> f280268z;

    /* renamed from: com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI$a */
    public class C95975a implements Runnable {
        public C95975a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0070, code lost:
            if (r2.length() == 0) goto L_0x0072;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r6 = this;
                java.lang.String r0 = "run"
                java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI$10"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
                b22.b r2 = b22.C28250a.m38138a()
                a22.a r2 = (a22.C67001a) r2
                r2.mo90965c()
                com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI r2 = com.tencent.p014mm.plugin.sns.p106ui.jsapi.JsapiSnsLabelUI.this
                b22.b r3 = b22.C28250a.m38138a()
                a22.a r3 = (a22.C67001a) r3
                java.util.List r3 = r3.mo90967e()
                java.util.ArrayList r3 = (java.util.ArrayList) r3
                com.tencent.p014mm.plugin.sns.p106ui.jsapi.JsapiSnsLabelUI.m122935M7(r2, r3)
                com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI r2 = com.tencent.p014mm.plugin.sns.p106ui.jsapi.JsapiSnsLabelUI.this
                com.tencent.mm.plugin.sns.ui.jsapi.a r2 = com.tencent.p014mm.plugin.sns.p106ui.jsapi.JsapiSnsLabelUI.m122930H7(r2)
                com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI r3 = com.tencent.p014mm.plugin.sns.p106ui.jsapi.JsapiSnsLabelUI.this
                java.util.ArrayList r3 = com.tencent.p014mm.plugin.sns.p106ui.jsapi.JsapiSnsLabelUI.m122934L7(r3)
                r2.mo133525h(r3)
                com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI r2 = com.tencent.p014mm.plugin.sns.p106ui.jsapi.JsapiSnsLabelUI.this
                java.lang.String r3 = "access$1600"
                java.lang.String r4 = "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
                r2.mo133492R7()
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
                com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI r2 = com.tencent.p014mm.plugin.sns.p106ui.jsapi.JsapiSnsLabelUI.this
                java.util.ArrayList r2 = com.tencent.p014mm.plugin.sns.p106ui.jsapi.JsapiSnsLabelUI.m122934L7(r2)
                if (r2 == 0) goto L_0x0054
                com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI r2 = com.tencent.p014mm.plugin.sns.p106ui.jsapi.JsapiSnsLabelUI.this
                java.util.ArrayList r2 = com.tencent.p014mm.plugin.sns.p106ui.jsapi.JsapiSnsLabelUI.m122934L7(r2)
                int r2 = r2.size()
                if (r2 != 0) goto L_0x0096
            L_0x0054:
                com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI r2 = com.tencent.p014mm.plugin.sns.p106ui.jsapi.JsapiSnsLabelUI.this
                java.lang.String r3 = "access$2000"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
                java.lang.String r2 = r2.f280257o
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
                if (r2 == 0) goto L_0x0072
                com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI r2 = com.tencent.p014mm.plugin.sns.p106ui.jsapi.JsapiSnsLabelUI.this
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
                java.lang.String r2 = r2.f280257o
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
                int r2 = r2.length()
                if (r2 != 0) goto L_0x0096
            L_0x0072:
                com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI r2 = com.tencent.p014mm.plugin.sns.p106ui.jsapi.JsapiSnsLabelUI.this
                com.tencent.mm.plugin.sns.ui.jsapi.a r2 = com.tencent.p014mm.plugin.sns.p106ui.jsapi.JsapiSnsLabelUI.m122930H7(r2)
                int r2 = r2.f280295p
                com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI r3 = com.tencent.p014mm.plugin.sns.p106ui.jsapi.JsapiSnsLabelUI.this
                int r5 = r3.f280249d
                if (r2 == r5) goto L_0x0096
                com.tencent.mm.plugin.sns.ui.jsapi.a r2 = com.tencent.p014mm.plugin.sns.p106ui.jsapi.JsapiSnsLabelUI.m122930H7(r3)
                int r2 = r2.f280295p
                com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI r3 = com.tencent.p014mm.plugin.sns.p106ui.jsapi.JsapiSnsLabelUI.this
                int r5 = r3.f280250e
                if (r2 == r5) goto L_0x0096
                com.tencent.mm.plugin.sns.ui.jsapi.a r2 = com.tencent.p014mm.plugin.sns.p106ui.jsapi.JsapiSnsLabelUI.m122930H7(r3)
                com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI r3 = com.tencent.p014mm.plugin.sns.p106ui.jsapi.JsapiSnsLabelUI.this
                int r3 = r3.f280249d
                r2.f280295p = r3
            L_0x0096:
                com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI r2 = com.tencent.p014mm.plugin.sns.p106ui.jsapi.JsapiSnsLabelUI.this
                com.tencent.mm.plugin.sns.ui.jsapi.a r2 = com.tencent.p014mm.plugin.sns.p106ui.jsapi.JsapiSnsLabelUI.m122930H7(r2)
                r2.notifyDataSetChanged()
                com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI r2 = com.tencent.p014mm.plugin.sns.p106ui.jsapi.JsapiSnsLabelUI.this
                r3 = 0
                java.lang.String r5 = "access$1702"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r4)
                r2.f280265w = r3
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r4)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.jsapi.JsapiSnsLabelUI.C95975a.run():void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI$b */
    public class C95976b implements Runnable {
        public C95976b() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI$11");
            JsapiSnsLabelUI.m122930H7(JsapiSnsLabelUI.this).f280295p = JsapiSnsLabelUI.m122938P7(JsapiSnsLabelUI.this);
            if (JsapiSnsLabelUI.m122937O7(JsapiSnsLabelUI.this) != null) {
                if (JsapiSnsLabelUI.m122934L7(JsapiSnsLabelUI.this) == null) {
                    JsapiSnsLabelUI jsapiSnsLabelUI = JsapiSnsLabelUI.this;
                    JsapiSnsLabelUI.m122935M7(jsapiSnsLabelUI, JsapiSnsLabelUI.m122937O7(jsapiSnsLabelUI));
                } else {
                    JsapiSnsLabelUI.m122934L7(JsapiSnsLabelUI.this).addAll(JsapiSnsLabelUI.m122937O7(JsapiSnsLabelUI.this));
                }
                Iterator it = JsapiSnsLabelUI.m122937O7(JsapiSnsLabelUI.this).iterator();
                while (it.hasNext()) {
                    JsapiSnsLabelUI.m122930H7(JsapiSnsLabelUI.this).mo133515d((String) it.next());
                }
                HashSet hashSet = new HashSet(JsapiSnsLabelUI.m122934L7(JsapiSnsLabelUI.this));
                JsapiSnsLabelUI.m122934L7(JsapiSnsLabelUI.this).clear();
                JsapiSnsLabelUI.m122934L7(JsapiSnsLabelUI.this).addAll(hashSet);
                JsapiSnsLabelUI.m122937O7(JsapiSnsLabelUI.this).clear();
                JsapiSnsLabelUI jsapiSnsLabelUI2 = JsapiSnsLabelUI.this;
                SnsMethodCalculate.markStartTimeMs("access$302", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
                jsapiSnsLabelUI2.f280246A = null;
                SnsMethodCalculate.markEndTimeMs("access$302", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
                hashSet.clear();
            }
            JsapiSnsLabelUI.m122930H7(JsapiSnsLabelUI.this).mo133525h(JsapiSnsLabelUI.m122934L7(JsapiSnsLabelUI.this));
            JsapiSnsLabelUI jsapiSnsLabelUI3 = JsapiSnsLabelUI.this;
            SnsMethodCalculate.markStartTimeMs("access$1600", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
            jsapiSnsLabelUI3.mo133492R7();
            SnsMethodCalculate.markEndTimeMs("access$1600", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
            JsapiSnsLabelUI.m122930H7(JsapiSnsLabelUI.this).notifyDataSetChanged();
            JsapiSnsLabelUI.m122932J7(JsapiSnsLabelUI.this).mo136339e(JsapiSnsLabelUI.m122930H7(JsapiSnsLabelUI.this).f280295p);
            JsapiSnsLabelUI jsapiSnsLabelUI4 = JsapiSnsLabelUI.this;
            SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
            C89779i0 i0Var = jsapiSnsLabelUI4.f280264v;
            SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
            if (i0Var != null) {
                JsapiSnsLabelUI jsapiSnsLabelUI5 = JsapiSnsLabelUI.this;
                SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
                C89779i0 i0Var2 = jsapiSnsLabelUI5.f280264v;
                SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
                if (i0Var2.isShowing()) {
                    JsapiSnsLabelUI jsapiSnsLabelUI6 = JsapiSnsLabelUI.this;
                    SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
                    C89779i0 i0Var3 = jsapiSnsLabelUI6.f280264v;
                    SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
                    i0Var3.dismiss();
                }
            }
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI$11");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI$c */
    public class C95977c implements DialogInterface.OnClickListener {
        public C95977c(JsapiSnsLabelUI jsapiSnsLabelUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI$12");
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI$12");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI$d */
    public class C95978d implements C95987a.C95990c {
        public C95978d() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI$e */
    public class C95979e implements ExpandableListView.OnGroupClickListener {

        /* renamed from: com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI$e$a */
        public class C95980a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ int f280273d;

            public C95980a(int i) {
                this.f280273d = i;
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI$2$1");
                JsapiSnsLabelUI.m122932J7(JsapiSnsLabelUI.this).mo136339e(this.f280273d);
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI$2$1");
            }
        }

        public C95979e() {
        }

        public boolean onGroupClick(ExpandableListView expandableListView, View view, int i, long j) {
            SnsMethodCalculate.markStartTimeMs("onGroupClick", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI$2");
            int i2 = JsapiSnsLabelUI.m122930H7(JsapiSnsLabelUI.this).f280295p;
            Log.m105925i("MicroMsg.SnsLabelUI", "dz[previousGroup: %d    onGroupClick:%d]", Integer.valueOf(i2), Integer.valueOf(i));
            if (JsapiSnsLabelUI.m122936N7(JsapiSnsLabelUI.this, i).equals("visible") || JsapiSnsLabelUI.m122936N7(JsapiSnsLabelUI.this, i).equals("invisible")) {
                if (!(JsapiSnsLabelUI.m122937O7(JsapiSnsLabelUI.this) == null || JsapiSnsLabelUI.m122937O7(JsapiSnsLabelUI.this).size() == 0)) {
                    JsapiSnsLabelUI jsapiSnsLabelUI = JsapiSnsLabelUI.this;
                    SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
                    int V7 = jsapiSnsLabelUI.mo133496V7();
                    SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
                    if (V7 == 0) {
                        JsapiSnsLabelUI.m122939Q7(JsapiSnsLabelUI.this, i);
                        JsapiSnsLabelUI jsapiSnsLabelUI2 = JsapiSnsLabelUI.this;
                        SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
                        jsapiSnsLabelUI2.getClass();
                        SnsMethodCalculate.markStartTimeMs("showTransformDialog", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
                        C76879j.m92754y(jsapiSnsLabelUI2, jsapiSnsLabelUI2.getString(C0966R.string.je6), (String) null, jsapiSnsLabelUI2.getString(C0966R.string.je5), new C102505a(jsapiSnsLabelUI2));
                        SnsMethodCalculate.markEndTimeMs("showTransformDialog", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
                        SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
                        Log.m105924i("MicroMsg.SnsLabelUI", "dz[previousGroup: need transform]");
                        SnsMethodCalculate.markEndTimeMs("onGroupClick", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI$2");
                        return true;
                    }
                }
                JsapiSnsLabelUI jsapiSnsLabelUI3 = JsapiSnsLabelUI.this;
                SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
                boolean z = jsapiSnsLabelUI3.f280262t;
                SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
                if (z) {
                    JsapiSnsLabelUI jsapiSnsLabelUI4 = JsapiSnsLabelUI.this;
                    SnsMethodCalculate.markStartTimeMs("access$802", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
                    jsapiSnsLabelUI4.f280260r = true;
                    SnsMethodCalculate.markEndTimeMs("access$802", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
                    JsapiSnsLabelUI.m122939Q7(JsapiSnsLabelUI.this, i);
                    JsapiSnsLabelUI jsapiSnsLabelUI5 = JsapiSnsLabelUI.this;
                    C89779i0 Q = C76879j.m92723Q(jsapiSnsLabelUI5, (String) null, jsapiSnsLabelUI5.getString(C0966R.string.jds), false, false, (DialogInterface.OnCancelListener) null);
                    SnsMethodCalculate.markStartTimeMs("access$902", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
                    jsapiSnsLabelUI5.f280264v = Q;
                    SnsMethodCalculate.markEndTimeMs("access$902", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
                    Log.m105924i("MicroMsg.SnsLabelUI", "dz[previousGroup: isGettingTagInfo]");
                    SnsMethodCalculate.markEndTimeMs("onGroupClick", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI$2");
                    return true;
                }
                C95987a H7 = JsapiSnsLabelUI.m122930H7(JsapiSnsLabelUI.this);
                H7.getClass();
                SnsMethodCalculate.markStartTimeMs("getmLabelNames", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
                ArrayList<String> arrayList = H7.f280291l;
                SnsMethodCalculate.markEndTimeMs("getmLabelNames", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
                if (arrayList != null) {
                    C95987a H72 = JsapiSnsLabelUI.m122930H7(JsapiSnsLabelUI.this);
                    H72.getClass();
                    SnsMethodCalculate.markStartTimeMs("getmLabelNames", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
                    ArrayList<String> arrayList2 = H72.f280291l;
                    SnsMethodCalculate.markEndTimeMs("getmLabelNames", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
                    if (arrayList2.size() != 0) {
                        if (i2 != i) {
                            if (JsapiSnsLabelUI.m122936N7(JsapiSnsLabelUI.this, i2).equals("visible")) {
                                JsapiSnsLabelUI.m122932J7(JsapiSnsLabelUI.this).collapseGroup(i2);
                                JsapiSnsLabelUI.m122930H7(JsapiSnsLabelUI.this).f280297r.clear();
                                JsapiSnsLabelUI.m122930H7(JsapiSnsLabelUI.this).f280299t.clear();
                            } else if (JsapiSnsLabelUI.m122936N7(JsapiSnsLabelUI.this, i2).equals("invisible")) {
                                JsapiSnsLabelUI.m122932J7(JsapiSnsLabelUI.this).collapseGroup(i2);
                                JsapiSnsLabelUI.m122930H7(JsapiSnsLabelUI.this).f280298s.clear();
                                JsapiSnsLabelUI.m122930H7(JsapiSnsLabelUI.this).f280300u.clear();
                            }
                            JsapiSnsLabelUI.m122932J7(JsapiSnsLabelUI.this).post(new C95980a(i));
                        } else if (JsapiSnsLabelUI.m122932J7(JsapiSnsLabelUI.this).isGroupExpanded(i)) {
                            JsapiSnsLabelUI.m122932J7(JsapiSnsLabelUI.this).mo136338c(i);
                        } else {
                            JsapiSnsLabelUI.m122932J7(JsapiSnsLabelUI.this).mo136339e(i);
                        }
                        JsapiSnsLabelUI.m122930H7(JsapiSnsLabelUI.this).f280295p = i;
                        SnsMethodCalculate.markEndTimeMs("onGroupClick", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI$2");
                        return true;
                    }
                }
                JsapiSnsLabelUI.m122939Q7(JsapiSnsLabelUI.this, i);
                JsapiSnsLabelUI.m122931I7(JsapiSnsLabelUI.this);
                Log.m105924i("MicroMsg.SnsLabelUI", "dz[previousGroup: gotoSelectContact]");
                SnsMethodCalculate.markEndTimeMs("onGroupClick", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI$2");
                return true;
            }
            if (i2 >= 0 && (JsapiSnsLabelUI.m122936N7(JsapiSnsLabelUI.this, i2).equals("visible") || JsapiSnsLabelUI.m122936N7(JsapiSnsLabelUI.this, i2).equals("invisible"))) {
                JsapiSnsLabelUI.m122932J7(JsapiSnsLabelUI.this).mo136338c(i2);
            }
            JsapiSnsLabelUI.m122930H7(JsapiSnsLabelUI.this).f280295p = i;
            SnsMethodCalculate.markEndTimeMs("onGroupClick", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI$2");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI$f */
    public class C95981f implements ExpandableListView.OnChildClickListener {
        public C95981f() {
        }

        public boolean onChildClick(ExpandableListView expandableListView, View view, int i, int i2, long j) {
            SnsMethodCalculate.markStartTimeMs("onChildClick", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI$3");
            if (i2 == JsapiSnsLabelUI.m122930H7(JsapiSnsLabelUI.this).getChildrenCount(i) - 1) {
                JsapiSnsLabelUI.m122939Q7(JsapiSnsLabelUI.this, i);
                JsapiSnsLabelUI.m122931I7(JsapiSnsLabelUI.this);
            } else {
                String str = (String) JsapiSnsLabelUI.m122930H7(JsapiSnsLabelUI.this).getChild(i, i2);
                JsapiSnsLabelUI.m122930H7(JsapiSnsLabelUI.this).mo133515d(str);
                JsapiSnsLabelUI jsapiSnsLabelUI = JsapiSnsLabelUI.this;
                if (i == jsapiSnsLabelUI.f280251f) {
                    JsapiSnsLabelUI.m122933K7(jsapiSnsLabelUI, 1, JsapiSnsLabelUI.m122930H7(jsapiSnsLabelUI).f280297r, str, view);
                } else if (i == jsapiSnsLabelUI.f280252g) {
                    JsapiSnsLabelUI.m122933K7(jsapiSnsLabelUI, 2, JsapiSnsLabelUI.m122930H7(jsapiSnsLabelUI).f280298s, str, view);
                }
            }
            SnsMethodCalculate.markEndTimeMs("onChildClick", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI$3");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI$g */
    public class C95982g implements MenuItem.OnMenuItemClickListener {
        public C95982g() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI$4");
            JsapiSnsLabelUI jsapiSnsLabelUI = JsapiSnsLabelUI.this;
            int i = JsapiSnsLabelUI.f280245D;
            SnsMethodCalculate.markStartTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
            jsapiSnsLabelUI.mo133497W7();
            SnsMethodCalculate.markEndTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
            SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI$4");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI$h */
    public class C95983h implements MenuItem.OnMenuItemClickListener {
        public C95983h() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI$5");
            JsapiSnsLabelUI jsapiSnsLabelUI = JsapiSnsLabelUI.this;
            jsapiSnsLabelUI.getClass();
            SnsMethodCalculate.markStartTimeMs("setLabelFinish", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
            String listToString = Util.listToString(jsapiSnsLabelUI.f280258p.f280297r, ",");
            String listToString2 = Util.listToString(jsapiSnsLabelUI.f280258p.f280299t, ",");
            String listToString3 = Util.listToString(jsapiSnsLabelUI.f280258p.f280298s, ",");
            String listToString4 = Util.listToString(jsapiSnsLabelUI.f280258p.f280300u, ",");
            C95987a aVar = jsapiSnsLabelUI.f280258p;
            if (!(aVar.f280295p == jsapiSnsLabelUI.f280251f && aVar.f280297r.size() == 0 && jsapiSnsLabelUI.f280258p.f280299t.size() == 0)) {
                C95987a aVar2 = jsapiSnsLabelUI.f280258p;
                if (!(aVar2.f280295p == jsapiSnsLabelUI.f280252g && aVar2.f280298s.size() == 0 && jsapiSnsLabelUI.f280258p.f280300u.size() == 0)) {
                    if ((jsapiSnsLabelUI.f280258p.f280295p != jsapiSnsLabelUI.f280251f || !Util.isNullOrNil(listToString) || !Util.isNullOrNil(listToString2)) && (jsapiSnsLabelUI.f280258p.f280295p != jsapiSnsLabelUI.f280252g || !Util.isNullOrNil(listToString3) || !Util.isNullOrNil(listToString4))) {
                        jsapiSnsLabelUI.mo133500Z7();
                        SnsMethodCalculate.markEndTimeMs("setLabelFinish", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
                    } else {
                        C76879j.m92754y(jsapiSnsLabelUI, jsapiSnsLabelUI.getString(C0966R.string.jdt), "", jsapiSnsLabelUI.getString(C0966R.string.je5), (DialogInterface.OnClickListener) null);
                        SnsMethodCalculate.markEndTimeMs("setLabelFinish", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
                    }
                    SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI$5");
                    return true;
                }
            }
            C76879j.m92754y(jsapiSnsLabelUI, jsapiSnsLabelUI.getString(C0966R.string.jdt), "", jsapiSnsLabelUI.getString(C0966R.string.je5), (DialogInterface.OnClickListener) null);
            SnsMethodCalculate.markEndTimeMs("setLabelFinish", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
            SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI$5");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI$i */
    public class C95984i implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f280278d;

        public C95984i(String str) {
            this.f280278d = str;
        }

        public void run() {
            int i;
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI$7");
            JsapiSnsLabelUI.m122935M7(JsapiSnsLabelUI.this, (ArrayList) ((C67001a) C28250a.m38138a()).mo90967e());
            if (JsapiSnsLabelUI.m122934L7(JsapiSnsLabelUI.this) == null) {
                JsapiSnsLabelUI.m122935M7(JsapiSnsLabelUI.this, new ArrayList());
            }
            if (!Util.isNullOrNil(this.f280278d)) {
                if (!JsapiSnsLabelUI.m122934L7(JsapiSnsLabelUI.this).contains(this.f280278d)) {
                    JsapiSnsLabelUI.m122934L7(JsapiSnsLabelUI.this).add(this.f280278d);
                }
                i = JsapiSnsLabelUI.m122934L7(JsapiSnsLabelUI.this).indexOf(this.f280278d);
            } else {
                i = -1;
            }
            JsapiSnsLabelUI.m122930H7(JsapiSnsLabelUI.this).mo133525h(JsapiSnsLabelUI.m122934L7(JsapiSnsLabelUI.this));
            JsapiSnsLabelUI jsapiSnsLabelUI = JsapiSnsLabelUI.this;
            SnsMethodCalculate.markStartTimeMs("access$1600", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
            jsapiSnsLabelUI.mo133492R7();
            SnsMethodCalculate.markEndTimeMs("access$1600", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
            JsapiSnsLabelUI.m122930H7(JsapiSnsLabelUI.this).f280295p = JsapiSnsLabelUI.m122938P7(JsapiSnsLabelUI.this);
            if (!Util.isNullOrNil(this.f280278d) && i != -1) {
                int P7 = JsapiSnsLabelUI.m122938P7(JsapiSnsLabelUI.this);
                JsapiSnsLabelUI jsapiSnsLabelUI2 = JsapiSnsLabelUI.this;
                if (P7 == jsapiSnsLabelUI2.f280251f) {
                    JsapiSnsLabelUI.m122930H7(jsapiSnsLabelUI2).f280297r.add(this.f280278d);
                    JsapiSnsLabelUI.m122930H7(JsapiSnsLabelUI.this).f280299t.clear();
                } else {
                    int P72 = JsapiSnsLabelUI.m122938P7(jsapiSnsLabelUI2);
                    JsapiSnsLabelUI jsapiSnsLabelUI3 = JsapiSnsLabelUI.this;
                    if (P72 == jsapiSnsLabelUI3.f280252g) {
                        JsapiSnsLabelUI.m122930H7(jsapiSnsLabelUI3).f280298s.add(this.f280278d);
                        JsapiSnsLabelUI.m122930H7(JsapiSnsLabelUI.this).f280300u.clear();
                    }
                }
            }
            JsapiSnsLabelUI.m122930H7(JsapiSnsLabelUI.this).notifyDataSetChanged();
            JsapiSnsLabelUI.m122932J7(JsapiSnsLabelUI.this).expandGroup(JsapiSnsLabelUI.m122938P7(JsapiSnsLabelUI.this));
            JsapiSnsLabelUI jsapiSnsLabelUI4 = JsapiSnsLabelUI.this;
            SnsMethodCalculate.markStartTimeMs("access$1702", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
            jsapiSnsLabelUI4.f280265w = null;
            SnsMethodCalculate.markEndTimeMs("access$1702", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI$7");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI$j */
    public class C95985j implements DialogInterface.OnClickListener {
        public C95985j() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI$8");
            JsapiSnsLabelUI jsapiSnsLabelUI = JsapiSnsLabelUI.this;
            int i2 = JsapiSnsLabelUI.f280245D;
            SnsMethodCalculate.markStartTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
            jsapiSnsLabelUI.mo133500Z7();
            SnsMethodCalculate.markEndTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI$8");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI$k */
    public class C95986k implements DialogInterface.OnClickListener {
        public C95986k() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI$9");
            JsapiSnsLabelUI jsapiSnsLabelUI = JsapiSnsLabelUI.this;
            int i2 = JsapiSnsLabelUI.f280245D;
            SnsMethodCalculate.markStartTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
            jsapiSnsLabelUI.mo133498X7();
            SnsMethodCalculate.markEndTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI$9");
        }
    }

    /* renamed from: H7 */
    public static /* synthetic */ C95987a m122930H7(JsapiSnsLabelUI jsapiSnsLabelUI) {
        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        C95987a aVar = jsapiSnsLabelUI.f280258p;
        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        return aVar;
    }

    /* renamed from: I7 */
    public static void m122931I7(JsapiSnsLabelUI jsapiSnsLabelUI) {
        SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        jsapiSnsLabelUI.getClass();
        SnsMethodCalculate.markStartTimeMs("gotoSelectContact", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        Intent intent = new Intent();
        intent.putExtra("titile", jsapiSnsLabelUI.getString(C0966R.string.f7496hv));
        intent.putExtra("snsPostWhoCanSee", true);
        C74560s1.m89276e();
        intent.putExtra("list_attr", C74560s1.m89278g(C74560s1.f219161b, 1024));
        int i = jsapiSnsLabelUI.f280263u;
        if (i == jsapiSnsLabelUI.f280251f) {
            if (jsapiSnsLabelUI.f280258p.f280299t.size() > 0) {
                intent.putExtra("already_select_contact", Util.listToString(jsapiSnsLabelUI.f280258p.f280299t, ","));
            }
        } else if (i == jsapiSnsLabelUI.f280252g && jsapiSnsLabelUI.f280258p.f280300u.size() > 0) {
            intent.putExtra("already_select_contact", Util.listToString(jsapiSnsLabelUI.f280258p.f280300u, ","));
        }
        intent.putExtra("KBlockOpenImFav", true);
        C88144b.m109802t(jsapiSnsLabelUI, ".ui.contact.SelectContactUI", intent, WearableStatusCodes.DATA_ITEM_TOO_LARGE);
        SnsMethodCalculate.markEndTimeMs("gotoSelectContact", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
    }

    /* renamed from: J7 */
    public static /* synthetic */ AnimatedExpandableListView m122932J7(JsapiSnsLabelUI jsapiSnsLabelUI) {
        SnsMethodCalculate.markStartTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        AnimatedExpandableListView animatedExpandableListView = jsapiSnsLabelUI.f280254i;
        SnsMethodCalculate.markEndTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        return animatedExpandableListView;
    }

    /* renamed from: K7 */
    public static void m122933K7(JsapiSnsLabelUI jsapiSnsLabelUI, int i, ArrayList arrayList, String str, View view) {
        SnsMethodCalculate.markStartTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        jsapiSnsLabelUI.getClass();
        SnsMethodCalculate.markStartTimeMs("insertOrRemove", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        C95987a aVar = jsapiSnsLabelUI.f280258p;
        if (aVar == null || aVar.f280294o != 1) {
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
        SnsMethodCalculate.markEndTimeMs("insertOrRemove", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        SnsMethodCalculate.markEndTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
    }

    /* renamed from: L7 */
    public static /* synthetic */ ArrayList m122934L7(JsapiSnsLabelUI jsapiSnsLabelUI) {
        SnsMethodCalculate.markStartTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        ArrayList<String> arrayList = jsapiSnsLabelUI.f280255j;
        SnsMethodCalculate.markEndTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        return arrayList;
    }

    /* renamed from: M7 */
    public static /* synthetic */ ArrayList m122935M7(JsapiSnsLabelUI jsapiSnsLabelUI, ArrayList arrayList) {
        SnsMethodCalculate.markStartTimeMs("access$1502", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        jsapiSnsLabelUI.f280255j = arrayList;
        SnsMethodCalculate.markEndTimeMs("access$1502", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        return arrayList;
    }

    /* renamed from: N7 */
    public static /* synthetic */ String m122936N7(JsapiSnsLabelUI jsapiSnsLabelUI, int i) {
        SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        String a8 = jsapiSnsLabelUI.mo133501a8(i);
        SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        return a8;
    }

    /* renamed from: O7 */
    public static /* synthetic */ ArrayList m122937O7(JsapiSnsLabelUI jsapiSnsLabelUI) {
        SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        ArrayList<String> arrayList = jsapiSnsLabelUI.f280246A;
        SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        return arrayList;
    }

    /* renamed from: P7 */
    public static /* synthetic */ int m122938P7(JsapiSnsLabelUI jsapiSnsLabelUI) {
        SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        int i = jsapiSnsLabelUI.f280263u;
        SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        return i;
    }

    /* renamed from: Q7 */
    public static /* synthetic */ int m122939Q7(JsapiSnsLabelUI jsapiSnsLabelUI, int i) {
        SnsMethodCalculate.markStartTimeMs("access$502", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        jsapiSnsLabelUI.f280263u = i;
        SnsMethodCalculate.markEndTimeMs("access$502", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        return i;
    }

    /* renamed from: R7 */
    public final void mo133492R7() {
        ArrayList<String> arrayList;
        SnsMethodCalculate.markStartTimeMs("checkInnerSelectedLabelNames", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        ArrayList<String> arrayList2 = this.f280255j;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            ArrayList<String> arrayList3 = this.f280258p.f280297r;
            if (arrayList3 != null) {
                arrayList3.clear();
            }
            ArrayList<String> arrayList4 = this.f280258p.f280298s;
            if (arrayList4 != null) {
                arrayList4.clear();
            }
            SnsMethodCalculate.markEndTimeMs("checkInnerSelectedLabelNames", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
            return;
        }
        ArrayList arrayList5 = new ArrayList();
        if (((ArrayList) this.f280267y).size() > 0 && "visible".equals(mo133501a8(this.f280259q)) && (arrayList = this.f280258p.f280297r) != null) {
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (!this.f280255j.contains(next)) {
                    arrayList5.add(next);
                }
            }
            this.f280258p.f280297r.removeAll(arrayList5);
        } else if (((ArrayList) this.f280267y).size() > 0 && "invisible".equals(mo133501a8(this.f280259q))) {
            Iterator<String> it4 = this.f280258p.f280298s.iterator();
            while (it4.hasNext()) {
                String next2 = it4.next();
                if (!this.f280255j.contains(next2)) {
                    arrayList5.add(next2);
                }
            }
            this.f280258p.f280298s.removeAll(arrayList5);
        }
        SnsMethodCalculate.markEndTimeMs("checkInnerSelectedLabelNames", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
    }

    /* renamed from: S7 */
    public final int[] mo133493S7(List<Integer> list) {
        SnsMethodCalculate.markStartTimeMs("convert", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        int[] iArr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            iArr[i] = list.get(i).intValue();
        }
        SnsMethodCalculate.markEndTimeMs("convert", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        return iArr;
    }

    /* renamed from: T7 */
    public final void mo133494T7(Intent intent) {
        String str;
        String str2;
        C28251b bVar;
        Iterator<String> it;
        ArrayList<String> stringsToList;
        Intent intent2 = intent;
        Class cls = C75339i.class;
        String str3 = "fillArgs";
        SnsMethodCalculate.markStartTimeMs(str3, "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        SnsMethodCalculate.markStartTimeMs("checkOuterSelectedLabelNames", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        ArrayList<String> arrayList = this.f280255j;
        String str4 = ",";
        if (arrayList == null || arrayList.isEmpty()) {
            this.f280256n = "";
            SnsMethodCalculate.markEndTimeMs("checkOuterSelectedLabelNames", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        } else {
            ArrayList arrayList2 = new ArrayList();
            String str5 = this.f280256n;
            if (!(str5 == null || (stringsToList = Util.stringsToList(str5.split(str4))) == null)) {
                for (String next : stringsToList) {
                    if (!this.f280255j.contains(next)) {
                        arrayList2.add(next);
                    }
                }
                stringsToList.removeAll(arrayList2);
                this.f280256n = Util.listToString(stringsToList, str4);
            }
            SnsMethodCalculate.markEndTimeMs("checkOuterSelectedLabelNames", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        }
        String str6 = this.f280256n;
        SnsMethodCalculate.markStartTimeMs("parseLabelNames", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        List<String> stringToList = Util.stringToList(str6, str4);
        JSONObject jSONObject = new JSONObject();
        C28251b a = C28250a.m38138a();
        Iterator<String> it4 = stringToList.iterator();
        while (true) {
            str = str3;
            str2 = str4;
            if (!it4.hasNext()) {
                break;
            }
            String next2 = it4.next();
            JSONArray jSONArray = new JSONArray();
            try {
                jSONObject.put(next2, jSONArray);
                it = it4;
                try {
                    C67001a aVar = (C67001a) a;
                    List k = aVar.mo90973k(aVar.mo90968f(next2));
                    if (k != null) {
                        Iterator it5 = k.iterator();
                        while (it5.hasNext()) {
                            String str7 = (String) it5.next();
                            Iterator it6 = it5;
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("username", str7);
                            SnsMethodCalculate.markStartTimeMs("getDisplayName", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
                            bVar = a;
                            try {
                                String displayName = ((C75339i) C86312j.m106911c(cls)).getDisplayName(str7);
                                SnsMethodCalculate.markEndTimeMs("getDisplayName", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
                                jSONObject2.put("displayName", displayName);
                                jSONObject2.put("avatar", mo133495U7(str7));
                                jSONArray.put(jSONObject2);
                                it5 = it6;
                                a = bVar;
                            } catch (JSONException e) {
                                e = e;
                                Log.printErrStackTrace("MicroMsg.SnsLabelUI", e, "", new Object[0]);
                                str3 = str;
                                str4 = str2;
                                it4 = it;
                                a = bVar;
                            }
                        }
                    }
                    bVar = a;
                } catch (JSONException e2) {
                    e = e2;
                    bVar = a;
                    Log.printErrStackTrace("MicroMsg.SnsLabelUI", e, "", new Object[0]);
                    str3 = str;
                    str4 = str2;
                    it4 = it;
                    a = bVar;
                }
            } catch (JSONException e3) {
                e = e3;
                bVar = a;
                it = it4;
                Log.printErrStackTrace("MicroMsg.SnsLabelUI", e, "", new Object[0]);
                str3 = str;
                str4 = str2;
                it4 = it;
                a = bVar;
            }
            str3 = str;
            str4 = str2;
            it4 = it;
            a = bVar;
        }
        String jSONObject3 = jSONObject.toString();
        SnsMethodCalculate.markEndTimeMs("parseLabelNames", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        intent2.putExtra("Klabel_name_list", jSONObject3);
        String str8 = this.f280257o;
        SnsMethodCalculate.markStartTimeMs("parseUserNames", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        List<String> stringToList2 = Util.stringToList(str8, str2);
        JSONArray jSONArray2 = new JSONArray();
        if (stringToList2 != null) {
            for (String next3 : stringToList2) {
                JSONObject jSONObject4 = new JSONObject();
                try {
                    jSONObject4.put("username", next3);
                    SnsMethodCalculate.markStartTimeMs("getDisplayName", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
                    String displayName2 = ((C75339i) C86312j.m106911c(cls)).getDisplayName(next3);
                    SnsMethodCalculate.markEndTimeMs("getDisplayName", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
                    jSONObject4.put("displayName", displayName2);
                    jSONObject4.put("avatar", mo133495U7(next3));
                    jSONArray2.put(jSONObject4);
                } catch (JSONException e4) {
                    Log.printErrStackTrace("MicroMsg.SnsLabelUI", e4, "", new Object[0]);
                }
            }
        }
        String jSONArray3 = jSONArray2.toString();
        SnsMethodCalculate.markEndTimeMs("parseUserNames", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        intent2.putExtra("Kother_user_name_list", jSONArray3);
        intent2.putExtra("k_select_group", mo133501a8(this.f280258p.f280295p));
        SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
    }

    /* renamed from: U7 */
    public final String mo133495U7(String str) {
        SnsMethodCalculate.markStartTimeMs("getAvatar", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        C68097n Lo = ((C68098o) ((C76706g) C86312j.m106911c(C76706g.class)).mo106832eg()).mo93607Lo(str);
        String f = Lo != null ? Lo.mo93597f() : "";
        SnsMethodCalculate.markEndTimeMs("getAvatar", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        return f;
    }

    /* renamed from: V7 */
    public final int mo133496V7() {
        SnsMethodCalculate.markStartTimeMs("getTagToLabelFailedTime", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        C86709a0.m107528h();
        int intValue = ((Integer) C86709a0.m107535s().mo121142i().mo119684e(335874, 0)).intValue();
        SnsMethodCalculate.markEndTimeMs("getTagToLabelFailedTime", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        return intValue;
    }

    /* renamed from: W7 */
    public final void mo133497W7() {
        SnsMethodCalculate.markStartTimeMs("goBack", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        SnsMethodCalculate.markStartTimeMs("isSelectChange", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        C95987a aVar = this.f280258p;
        int i = aVar.f280295p;
        boolean z = true;
        if (i == this.f280259q ? (i != this.f280251f || aVar.f280297r.size() == 0 || (Util.listToString(this.f280258p.f280297r, ",").equals(this.f280256n) && Util.listToString(this.f280258p.f280299t, ",").equals(this.f280257o))) && (i != this.f280252g || this.f280258p.f280298s.size() == 0 || (Util.listToString(this.f280258p.f280298s, ",").equals(this.f280256n) && Util.listToString(this.f280258p.f280300u, ",").equals(this.f280257o))) : (i != this.f280251f || (aVar.f280297r.size() == 0 && this.f280258p.f280299t.size() == 0)) && !((i == this.f280252g && (this.f280258p.f280298s.size() != 0 || this.f280258p.f280300u.size() != 0)) || i == this.f280250e || i == this.f280249d)) {
            z = false;
        }
        SnsMethodCalculate.markEndTimeMs("isSelectChange", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        if (z) {
            C76879j.m92717K(this, true, getString(C0966R.string.jdn), "", getString(C0966R.string.jdm), getString(C0966R.string.jdl), new C95985j(), new C95986k());
        } else {
            mo133498X7();
        }
        SnsMethodCalculate.markEndTimeMs("goBack", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
    }

    /* renamed from: X7 */
    public final void mo133498X7() {
        SnsMethodCalculate.markStartTimeMs("goBackWithStates", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        Intent intent = new Intent();
        intent.putExtra("Ktag_range_index", this.f280259q);
        mo133494T7(intent);
        setResult(-1, intent);
        finish();
        SnsMethodCalculate.markEndTimeMs("goBackWithStates", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
    }

    /* renamed from: Y7 */
    public final void mo133499Y7() {
        SnsMethodCalculate.markStartTimeMs("handleTransformError", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        C115669n.INSTANCE.mo160131h(11455, "", "", Integer.valueOf(this.f280266x), 0);
        SnsMethodCalculate.markStartTimeMs("RecordTagToLabelFailed", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        C86709a0.m107528h();
        C86709a0.m107528h();
        C86709a0.m107535s().mo121142i().mo119676J(335874, Integer.valueOf(((Integer) C86709a0.m107535s().mo121142i().mo119684e(335874, 0)).intValue() + 1));
        SnsMethodCalculate.markEndTimeMs("RecordTagToLabelFailed", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        this.f280246A = null;
        this.f280262t = false;
        this.f280261s = false;
        C89779i0 i0Var = this.f280264v;
        if (i0Var != null && i0Var.isShowing()) {
            this.f280264v.dismiss();
        }
        if (this.f280260r) {
            this.f280260r = false;
            SnsMethodCalculate.markEndTimeMs("handleTransformError", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
            return;
        }
        int i = C0966R.string.je4;
        if (mo133496V7() > 1) {
            i = C0966R.string.f361380je3;
        }
        C76879j.m92742m(this, i, C0966R.string.a18, new C95977c(this));
        SnsMethodCalculate.markEndTimeMs("handleTransformError", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
    }

    /* renamed from: Z7 */
    public final void mo133500Z7() {
        SnsMethodCalculate.markStartTimeMs("saveAndExit", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        Intent intent = new Intent();
        C95987a aVar = this.f280258p;
        int i = aVar.f280295p;
        if (i == this.f280251f) {
            this.f280256n = Util.listToString(aVar.f280297r, ",");
            this.f280257o = Util.listToString(this.f280258p.f280299t, ",");
            mo133494T7(intent);
        } else if (i == this.f280252g) {
            this.f280256n = Util.listToString(aVar.f280298s, ",");
            this.f280257o = Util.listToString(this.f280258p.f280300u, ",");
            mo133494T7(intent);
        }
        intent.putExtra("k_select_group", mo133501a8(this.f280258p.f280295p));
        intent.putExtra("k_select_index", this.f280258p.f280295p);
        intent.putExtra("Ktag_range_index", this.f280258p.f280295p);
        setResult(-1, intent);
        finish();
        SnsMethodCalculate.markEndTimeMs("saveAndExit", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
    }

    /* renamed from: a8 */
    public final String mo133501a8(int i) {
        SnsMethodCalculate.markStartTimeMs("saveGetGroupItem", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        if (i >= ((ArrayList) this.f280267y).size() || i < 0) {
            SnsMethodCalculate.markEndTimeMs("saveGetGroupItem", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
            return "";
        }
        String str = (String) ((ArrayList) this.f280267y).get(i);
        SnsMethodCalculate.markEndTimeMs("saveGetGroupItem", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        return str;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        SnsMethodCalculate.markStartTimeMs("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 0) {
            mo133497W7();
            SnsMethodCalculate.markEndTimeMs("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
            return true;
        }
        boolean dispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
        SnsMethodCalculate.markEndTimeMs("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        return dispatchKeyEvent;
    }

    public int getLayoutId() {
        SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        return C0966R.C0971layout.c3a;
    }

    public void initView() {
        SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        boolean booleanExtra = getIntent().getBooleanExtra("KLabel_is_filter_private", false);
        this.f280254i = (AnimatedExpandableListView) findViewById(C0966R.C0970id.jtw);
        ArrayList<String> arrayList = (ArrayList) ((C67001a) C28250a.m38138a()).mo90967e();
        this.f280255j = arrayList;
        C95987a aVar = this.f280258p;
        aVar.f280296q = booleanExtra;
        aVar.mo133525h(arrayList);
        mo133492R7();
        AbsListView.LayoutParams layoutParams = new AbsListView.LayoutParams(-1, -2);
        layoutParams.height = getResources().getDimensionPixelSize(C0966R.dimen.f3898i9);
        View view = new View(this);
        view.setLayoutParams(layoutParams);
        this.f280254i.addHeaderView(view);
        this.f280254i.setAdapter(this.f280258p);
        this.f280254i.setOnGroupClickListener(new C95979e());
        this.f280254i.setOnChildClickListener(new C95981f());
        setBackBtn(new C95982g());
        addTextOptionMenu(0, getString(C0966R.string.jdj), new C95983h(), (View.OnLongClickListener) null, MMActivityController.C73075r.GREEN);
        SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        int i3 = i;
        int i4 = i2;
        Intent intent2 = intent;
        SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        super.onActivityResult(i, i2, intent);
        int i5 = -1;
        if (i4 == -1) {
            if (i3 == 4003) {
                Log.m105924i("MicroMsg.SnsLabelUI", "the Activity completed");
                String stringExtra = intent2.getStringExtra("Select_Contacts_To_Create_New_Label");
                if (!Util.isNullOrNil(stringExtra)) {
                    Intent intent3 = new Intent();
                    intent3.putExtra("Select_Contact", stringExtra);
                    C88144b.m109795m(getContext(), "label", ".ui.ContactLabelEditUI", intent3, 4002);
                    SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
                    return;
                }
                String stringExtra2 = intent2.getStringExtra("Select_Contact");
                this.f280257o = new String(stringExtra2);
                Log.m105925i("MicroMsg.SnsLabelUI", "dz[onActivityResult] %s", stringExtra2 + "");
                int i6 = this.f280263u;
                if (i6 == this.f280251f) {
                    this.f280258p.f280299t.clear();
                    if (!Util.isNullOrNil(stringExtra2)) {
                        this.f280258p.f280299t.addAll(Util.stringsToList(stringExtra2.split(",")));
                        this.f280258p.f280295p = this.f280263u;
                    }
                } else if (i6 == this.f280252g) {
                    this.f280258p.f280300u.clear();
                    if (!Util.isNullOrNil(stringExtra2)) {
                        this.f280258p.f280300u.addAll(Util.stringsToList(stringExtra2.split(",")));
                        this.f280258p.f280295p = this.f280263u;
                    }
                }
                this.f280258p.notifyDataSetChanged();
                this.f280254i.expandGroup(this.f280263u);
                SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
            }
            i5 = -1;
        }
        if (i4 == i5 && i3 == 4001) {
            String stringExtra3 = intent2.getStringExtra("Select_Contact");
            Log.m105925i("MicroMsg.SnsLabelUI", "dz[onActivityResult] %s", stringExtra3 + "");
            if (!Util.isNullOrNil(stringExtra3)) {
                Intent intent4 = new Intent();
                intent4.putExtra("Select_Contact", stringExtra3);
                C88144b.m109795m(this, "label", ".ui.ContactLabelEditUI", intent4, 4002);
            }
            SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        }
        if (i4 == 0 && i3 == 4002 && intent2 != null) {
            String stringExtra4 = intent2.getStringExtra("k_sns_label_add_label");
            this.f280265w = intent2.getStringExtra("k_sns_label_add_label");
            this.f280254i.postDelayed(new C95984i(stringExtra4), 600);
        }
        SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
    }

    public void onCreate(Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
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
        this.f280258p = new C95987a(this);
        SnsMethodCalculate.markStartTimeMs("setShowLabelMoreIcon", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        SnsMethodCalculate.markEndTimeMs("setShowLabelMoreIcon", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        C95987a aVar = this.f280258p;
        C95978d dVar = new C95978d();
        aVar.getClass();
        SnsMethodCalculate.markStartTimeMs("setInnerClickListener", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        aVar.f280301v = dVar;
        SnsMethodCalculate.markEndTimeMs("setInnerClickListener", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        Intent intent = getIntent();
        if (intent == null) {
            this.f280259q = this.f280249d;
            this.f280258p.f280294o = 0;
            this.f280256n = null;
            this.f280257o = null;
        } else {
            if (intent.hasExtra("k_title")) {
                setMMTitle(intent.getStringExtra("k_title"));
            }
            this.f280259q = intent.getIntExtra("KLabel_range_index", this.f280249d);
            this.f280258p.f280294o = intent.getIntExtra("k_sns_label_ui_style", 0);
            this.f280256n = intent.getStringExtra("Klabel_name_list");
            this.f280257o = intent.getStringExtra("Kother_user_name_list");
            if (!TextUtils.isEmpty(intent.getStringExtra("k_sns_label_ui_title"))) {
                setMMTitle(intent.getStringExtra("k_sns_label_ui_title"));
            }
        }
        C95987a aVar2 = this.f280258p;
        aVar2.f280295p = this.f280259q;
        if (aVar2.f280294o == 1) {
            findViewById(C0966R.C0970id.jtx).setBackgroundResource(C0966R.color.f3131gg);
        }
        int i = this.f280259q;
        if (i == this.f280251f) {
            if (!TextUtils.isEmpty(this.f280256n)) {
                this.f280258p.f280297r = Util.stringsToList(this.f280256n.split(","));
            }
            if (!TextUtils.isEmpty(this.f280257o)) {
                this.f280258p.f280299t = Util.stringsToList(this.f280257o.split(","));
            }
        } else if (i == this.f280252g) {
            if (!TextUtils.isEmpty(this.f280256n)) {
                this.f280258p.f280298s = Util.stringsToList(this.f280256n.split(","));
            }
            if (!TextUtils.isEmpty(this.f280257o)) {
                this.f280258p.f280300u = Util.stringsToList(this.f280257o.split(","));
            }
        }
        SnsMethodCalculate.markStartTimeMs("getTagNames", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        C86709a0.m107528h();
        if (((Boolean) C86709a0.m107535s().mo121142i().mo119684e(335873, Boolean.TRUE)).booleanValue()) {
            this.f280261s = true;
            this.f280262t = true;
            if (mo133496V7() >= 1) {
                this.f280260r = true;
            }
            C86709a0.m107528h();
            C86709a0.m107529k().f251779b.mo123460f(new C43039l0(1));
        }
        SnsMethodCalculate.markEndTimeMs("getTagNames", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        initView();
        SnsMethodCalculate.markStartTimeMs("parseArgs", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        Intent intent2 = getIntent();
        if (intent2 != null) {
            String stringExtra = intent2.getStringExtra("k_select_group");
            boolean booleanExtra = intent2.getBooleanExtra("k_show_public", true);
            boolean booleanExtra2 = intent2.getBooleanExtra("k_show_private", true);
            boolean booleanExtra3 = intent2.getBooleanExtra("k_show_include", true);
            boolean booleanExtra4 = intent2.getBooleanExtra("k_show_exclude", true);
            int[] iArr = {C0966R.string.jdw, C0966R.string.jdu, C0966R.string.jdq, C0966R.string.jdh};
            ((ArrayList) this.f280267y).clear();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (booleanExtra) {
                arrayList.add(Integer.valueOf(iArr[0]));
                arrayList2.add(Integer.valueOf(iArr[0]));
                ((ArrayList) this.f280267y).add(this.f280253h.get(0));
            }
            if (booleanExtra2) {
                arrayList.add(Integer.valueOf(iArr[1]));
                arrayList2.add(Integer.valueOf(iArr[1]));
                ((ArrayList) this.f280267y).add(this.f280253h.get(1));
            }
            if (booleanExtra3) {
                arrayList.add(Integer.valueOf(iArr[2]));
                arrayList2.add(Integer.valueOf(iArr[2]));
                ((ArrayList) this.f280267y).add(this.f280253h.get(2));
            }
            if (booleanExtra4) {
                arrayList.add(Integer.valueOf(iArr[3]));
                arrayList2.add(Integer.valueOf(iArr[3]));
                ((ArrayList) this.f280267y).add(this.f280253h.get(3));
            }
            if (((ArrayList) this.f280267y).size() == 0) {
                finish();
                SnsMethodCalculate.markEndTimeMs("parseArgs", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
                SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
            }
            this.f280249d = ((ArrayList) this.f280267y).indexOf("public");
            this.f280250e = ((ArrayList) this.f280267y).indexOf("private");
            this.f280251f = ((ArrayList) this.f280267y).indexOf("visible");
            this.f280252g = ((ArrayList) this.f280267y).indexOf("invisible");
            C95987a aVar3 = this.f280258p;
            if (aVar3 != null) {
                List<String> list = this.f280267y;
                SnsMethodCalculate.markStartTimeMs("setRealHeaders", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
                aVar3.f280290k = list;
                ArrayList arrayList3 = (ArrayList) list;
                aVar3.f280284e = arrayList3.indexOf("public");
                aVar3.f280285f = arrayList3.indexOf("private");
                aVar3.f280286g = arrayList3.indexOf("visible");
                aVar3.f280287h = arrayList3.indexOf("invisible");
                SnsMethodCalculate.markEndTimeMs("setRealHeaders", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
                C95987a aVar4 = this.f280258p;
                int size = arrayList.size();
                aVar4.getClass();
                SnsMethodCalculate.markStartTimeMs("setGROUP_COUNT", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
                aVar4.f280283d = size;
                SnsMethodCalculate.markEndTimeMs("setGROUP_COUNT", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
                C95987a aVar5 = this.f280258p;
                int[] S7 = mo133493S7(arrayList);
                aVar5.getClass();
                SnsMethodCalculate.markStartTimeMs("setHeaderNameIds", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
                aVar5.f280288i = S7;
                SnsMethodCalculate.markEndTimeMs("setHeaderNameIds", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
                C95987a aVar6 = this.f280258p;
                int[] S72 = mo133493S7(arrayList2);
                aVar6.getClass();
                SnsMethodCalculate.markStartTimeMs("setHeaderSubIds", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
                aVar6.f280289j = S72;
                SnsMethodCalculate.markEndTimeMs("setHeaderSubIds", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
                if (!TextUtils.isEmpty(stringExtra)) {
                    this.f280258p.f280295p = ((ArrayList) this.f280267y).indexOf(stringExtra);
                    if (stringExtra.equals("visible")) {
                        if (!TextUtils.isEmpty(this.f280256n)) {
                            this.f280258p.f280297r = Util.stringsToList(this.f280256n.split(","));
                        }
                        if (!TextUtils.isEmpty(this.f280257o)) {
                            this.f280258p.f280299t = Util.stringsToList(this.f280257o.split(","));
                        }
                        this.f280254i.expandGroup(((ArrayList) this.f280267y).indexOf(stringExtra));
                    } else if (stringExtra.equals("invisible")) {
                        if (!TextUtils.isEmpty(this.f280256n)) {
                            this.f280258p.f280298s = Util.stringsToList(this.f280256n.split(","));
                        }
                        if (!TextUtils.isEmpty(this.f280257o)) {
                            this.f280258p.f280300u = Util.stringsToList(this.f280257o.split(","));
                        }
                        this.f280254i.expandGroup(((ArrayList) this.f280267y).indexOf(stringExtra));
                    }
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("parseArgs", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
    }

    public void onDestroy() {
        SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(JsApiSetAudioState.CTRL_INDEX, this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(C28613b.CTRL_INDEX, this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(638, this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(C82086j.CTRL_INDEX, this);
        super.onDestroy();
        SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
    }

    public void onResume() {
        AnimatedExpandableListView animatedExpandableListView;
        SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        if (!(this.f280258p == null || this.f280265w != null || (animatedExpandableListView = this.f280254i) == null)) {
            animatedExpandableListView.postDelayed(new C95975a(), 600);
        }
        super.onResume();
        SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x024c, code lost:
        if (r4 != false) goto L_0x026e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSceneEnd(int r18, int r19, java.lang.String r20, ob0.C117747y r21) {
        /*
            r17 = this;
            r0 = r17
            java.lang.String r1 = "onSceneEnd"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI"
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
            boolean r4 = r0.f280261s
            if (r4 != 0) goto L_0x002d
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return
        L_0x002d:
            int r4 = r21.getType()
            r9 = 290(0x122, float:4.06E-43)
            if (r4 == r9) goto L_0x0291
            r9 = 292(0x124, float:4.09E-43)
            r10 = 335873(0x52001, float:4.70658E-40)
            java.lang.String r11 = ","
            if (r4 == r9) goto L_0x0189
            r9 = 635(0x27b, float:8.9E-43)
            if (r4 == r9) goto L_0x0109
            r9 = 638(0x27e, float:8.94E-43)
            if (r4 == r9) goto L_0x0048
            goto L_0x029b
        L_0x0048:
            if (r18 != 0) goto L_0x00ff
            if (r19 != 0) goto L_0x00ff
            java.util.ArrayList<java.lang.String> r4 = r0.f280268z
            java.util.Iterator r4 = r4.iterator()
            java.util.ArrayList<java.lang.Long> r8 = r0.f280247B
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
            r0.f280255j = r4
            com.tencent.mm.plugin.report.service.n r4 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r8 = 11455(0x2cbf, float:1.6052E-41)
            r9 = 4
            java.lang.Object[] r9 = new java.lang.Object[r9]
            java.lang.String r11 = ""
            r9[r6] = r11
            r9[r7] = r11
            int r7 = r0.f280266x
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r9[r5] = r7
            java.util.ArrayList<java.lang.String> r5 = r0.f280246A
            if (r5 != 0) goto L_0x00d4
            goto L_0x00d8
        L_0x00d4:
            int r6 = r5.size()
        L_0x00d8:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            r9[r3] = r5
            r4.mo160131h(r8, r9)
            com.tencent.mm.ui.widget.listview.AnimatedExpandableListView r3 = r0.f280254i
            com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI$b r4 = new com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI$b
            r4.<init>()
            r5 = 600(0x258, double:2.964E-321)
            r3.postDelayed(r4, r5)
            f40.C86709a0.m107528h()
            f40.o r3 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r3 = r3.mo121142i()
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r3.mo119676J(r10, r4)
            goto L_0x029b
        L_0x00ff:
            r17.mo133499Y7()
            java.lang.String r3 = "dz: error at modify label list!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r3)
            goto L_0x029b
        L_0x0109:
            if (r18 != 0) goto L_0x017f
            if (r19 != 0) goto L_0x017f
            java.util.ArrayList<java.lang.String[]> r3 = r0.f280248C
            java.lang.String r4 = "addContactToLabels"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r2)
            java.util.ArrayList<java.lang.String> r5 = r0.f280246A
            if (r5 == 0) goto L_0x017a
            int r5 = r5.size()
            if (r5 != 0) goto L_0x011f
            goto L_0x017a
        L_0x011f:
            java.util.ArrayList<java.lang.String> r5 = r0.f280246A
            java.util.Iterator r5 = r5.iterator()
            java.util.Iterator r3 = r3.iterator()
            java.util.ArrayList r6 = new java.util.ArrayList
            java.util.ArrayList<java.lang.String> r8 = r0.f280246A
            int r8 = r8.size()
            r6.<init>(r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            java.util.ArrayList<java.lang.String> r9 = r0.f280246A
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
            r0.f280261s = r7
            goto L_0x013f
        L_0x016c:
            b22.b r3 = b22.C28250a.m38138a()
            a22.a r3 = (a22.C67001a) r3
            r3.mo90964b(r6, r8)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r2)
            goto L_0x029b
        L_0x017a:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r2)
            goto L_0x029b
        L_0x017f:
            r17.mo133499Y7()
            java.lang.String r3 = "dz: error at add contact label!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r3)
            goto L_0x029b
        L_0x0189:
            if (r18 != 0) goto L_0x0286
            if (r19 != 0) goto L_0x0286
            os2.m0 r3 = com.tencent.p014mm.plugin.sns.model.C94866e1.ey0()
            android.database.Cursor r3 = r3.mo11653Yt()
            int r4 = r3.getCount()
            r0.f280266x = r4
            if (r4 <= 0) goto L_0x024f
            java.lang.String r4 = "transformTags"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r2)
            r3.moveToFirst()
            os2.l0 r5 = new os2.l0
            r5.<init>()
            int r9 = r3.getCount()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>(r9)
            r0.f280246A = r12
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>(r9)
            r0.f280268z = r12
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>(r9)
            r0.f280248C = r12
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>(r9)
            r0.f280247B = r12
        L_0x01cb:
            boolean r9 = r3.isAfterLast()
            if (r9 != 0) goto L_0x0238
            r5.convertFrom(r3)
            java.lang.String r9 = r5.field_memberList
            if (r9 == 0) goto L_0x022f
            int r9 = r9.length()
            if (r9 == 0) goto L_0x022f
            java.util.ArrayList<java.lang.String[]> r9 = r0.f280248C
            java.lang.String r12 = r5.field_memberList
            java.lang.String[] r12 = r12.split(r11)
            r9.add(r12)
            java.lang.String r9 = r5.field_tagName
            java.util.ArrayList<java.lang.String> r12 = r0.f280246A
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
            java.util.ArrayList<java.lang.String> r12 = r0.f280268z
            r12.add(r9)
            java.util.ArrayList<java.lang.Long> r9 = r0.f280247B
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
            java.util.ArrayList<java.lang.String> r5 = r0.f280268z
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
            goto L_0x026e
        L_0x024f:
            boolean r4 = r0.f280262t
            if (r4 == 0) goto L_0x026e
            com.tencent.mm.plugin.sns.ui.jsapi.a r4 = r0.f280258p
            int r5 = r0.f280263u
            r4.f280295p = r5
            com.tencent.mm.ui.widget.listview.AnimatedExpandableListView r4 = r0.f280254i
            r4.mo136339e(r5)
            f40.C86709a0.m107528h()
            f40.o r4 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r4 = r4.mo121142i()
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r4.mo119676J(r10, r5)
        L_0x026e:
            r3.close()
            boolean r3 = r0.f280260r
            if (r3 == 0) goto L_0x0283
            r0.f280261s = r7
            b22.b r3 = b22.C28250a.m38138a()
            java.util.ArrayList<java.lang.String> r4 = r0.f280246A
            a22.a r3 = (a22.C67001a) r3
            r3.mo90963a(r4)
            goto L_0x028e
        L_0x0283:
            r0.f280261s = r6
            goto L_0x028e
        L_0x0286:
            r17.mo133499Y7()
            java.lang.String r3 = "dz: error at get sns tag list!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r3)
        L_0x028e:
            r0.f280262t = r6
            goto L_0x029b
        L_0x0291:
            if (r18 != 0) goto L_0x0296
            if (r19 != 0) goto L_0x0296
            goto L_0x029b
        L_0x0296:
            java.lang.String r3 = "dz: error at delete tag list!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r3)
        L_0x029b:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.jsapi.JsapiSnsLabelUI.onSceneEnd(int, int, java.lang.String, ob0.y):void");
    }
}
