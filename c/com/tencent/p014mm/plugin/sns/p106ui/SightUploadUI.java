package com.tencent.p014mm.plugin.sns.p106ui;

import a22.C67001a;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import b22.C28250a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.SightSendResultEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel;
import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import g34.C116918i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import nj3.C76879j;
import p645pj.C77092c;
import qn3.C77382c;
import te3.C101802kr2;
import wc3.C78538u;

/* renamed from: com.tencent.mm.plugin.sns.ui.SightUploadUI */
public class SightUploadUI extends MMActivity {

    /* renamed from: v */
    public static final /* synthetic */ int f277386v = 0;

    /* renamed from: d */
    public SnsEditText f277387d;

    /* renamed from: e */
    public C95778f1 f277388e = null;

    /* renamed from: f */
    public LinearLayout f277389f;

    /* renamed from: g */
    public String f277390g = "";

    /* renamed from: h */
    public SnsSightUploadSayFooter f277391h;

    /* renamed from: i */
    public String f277392i = "";

    /* renamed from: j */
    public String f277393j = "";

    /* renamed from: n */
    public int f277394n = 0;

    /* renamed from: o */
    public int f277395o = 0;

    /* renamed from: p */
    public ArrayList<String> f277396p;

    /* renamed from: q */
    public boolean f277397q = false;

    /* renamed from: r */
    public int f277398r = 0;

    /* renamed from: s */
    public boolean f277399s = false;

    /* renamed from: t */
    public long f277400t = 0;

    /* renamed from: u */
    public DisplayMetrics f277401u;

    /* renamed from: com.tencent.mm.plugin.sns.ui.SightUploadUI$a */
    public class C95404a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f277402d;

        public C95404a(int i) {
            this.f277402d = i;
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SightUploadUI$1");
            SightUploadUI.m121748H7(SightUploadUI.this).setWidth((int) (((double) this.f277402d) * 0.7d));
            SightUploadUI sightUploadUI = SightUploadUI.this;
            SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
            LinearLayout linearLayout = sightUploadUI.f277389f;
            SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
            SightUploadUI sightUploadUI2 = SightUploadUI.this;
            SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
            LinearLayout linearLayout2 = sightUploadUI2.f277389f;
            SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams((int) (((double) this.f277402d) * 0.3d), linearLayout2.getHeight()));
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SightUploadUI$1");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SightUploadUI$b */
    public class C95405b implements MMEditText.C74949b {
        public C95405b() {
        }

        /* renamed from: a */
        public void mo65425a() {
            SnsMethodCalculate.markStartTimeMs("onBack", "com.tencent.mm.plugin.sns.ui.SightUploadUI$2");
            SightUploadUI.this.hideVKB();
            SightSendResultEvent sightSendResultEvent = new SightSendResultEvent();
            SightSendResultEvent.C92563a aVar = sightSendResultEvent.f265103d;
            aVar.f265105a = 0;
            aVar.f265106b = false;
            sightSendResultEvent.publish();
            SightUploadUI.this.finish();
            SnsMethodCalculate.markEndTimeMs("onBack", "com.tencent.mm.plugin.sns.ui.SightUploadUI$2");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SightUploadUI$c */
    public class C95406c implements MenuItem.OnMenuItemClickListener {
        public C95406c() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SightUploadUI$3");
            SightSendResultEvent sightSendResultEvent = new SightSendResultEvent();
            SightSendResultEvent.C92563a aVar = sightSendResultEvent.f265103d;
            aVar.f265105a = 0;
            aVar.f265106b = false;
            sightSendResultEvent.publish();
            SightUploadUI.this.hideVKB();
            SightUploadUI.this.finish();
            SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SightUploadUI$3");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SightUploadUI$d */
    public class C95407d implements MenuItem.OnMenuItemClickListener {

        /* renamed from: com.tencent.mm.plugin.sns.ui.SightUploadUI$d$a */
        public class C95408a implements C76879j.C11180n {
            public C95408a() {
            }

            /* renamed from: j */
            public void mo782j(int i) {
                SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SightUploadUI$4$1");
                if (i == 0) {
                    SightSendResultEvent sightSendResultEvent = new SightSendResultEvent();
                    SightSendResultEvent.C92563a aVar = sightSendResultEvent.f265103d;
                    aVar.f265105a = 0;
                    aVar.f265107c = true;
                    aVar.f265106b = true;
                    sightSendResultEvent.publish();
                    SightUploadUI.this.hideVKB();
                    SightUploadUI.this.finish();
                }
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SightUploadUI$4$1");
            }
        }

        public C95407d() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SightUploadUI$4");
            C76879j.m92736g(SightUploadUI.this.getContext(), (String) null, new String[]{SightUploadUI.this.getString(C0966R.string.j8g)}, (String) null, new C95408a());
            SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SightUploadUI$4");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SightUploadUI$e */
    public class C95409e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: com.tencent.mm.plugin.sns.ui.SightUploadUI$e$a */
        public class C95410a implements C77382c.C77383a {

            /* renamed from: d */
            public final /* synthetic */ int f277409d;

            public C95410a(int i) {
                this.f277409d = i;
            }

            /* renamed from: L0 */
            public void mo4083L0(String str) {
                SnsMethodCalculate.markStartTimeMs("doWhenMore", "com.tencent.mm.plugin.sns.ui.SightUploadUI$5$1");
                C76879j.m92738i(SightUploadUI.this, C0966R.string.jjy, C0966R.string.jjz);
                SnsMethodCalculate.markEndTimeMs("doWhenMore", "com.tencent.mm.plugin.sns.ui.SightUploadUI$5$1");
            }

            /* renamed from: L3 */
            public void mo4084L3(String str) {
                SnsMethodCalculate.markStartTimeMs("doWhenLess", "com.tencent.mm.plugin.sns.ui.SightUploadUI$5$1");
                SnsMethodCalculate.markEndTimeMs("doWhenLess", "com.tencent.mm.plugin.sns.ui.SightUploadUI$5$1");
            }

            /* renamed from: P4 */
            public void mo4086P4(String str) {
                SnsMethodCalculate.markStartTimeMs("doWhenOK", "com.tencent.mm.plugin.sns.ui.SightUploadUI$5$1");
                PInt pInt = new PInt();
                SightUploadUI sightUploadUI = SightUploadUI.this;
                int i = SightUploadUI.f277386v;
                SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
                C95778f1 f1Var = sightUploadUI.f277388e;
                SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
                SightUploadUI sightUploadUI2 = SightUploadUI.this;
                SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
                int i2 = sightUploadUI2.f277398r;
                SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
                SightUploadUI sightUploadUI3 = SightUploadUI.this;
                SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
                String str2 = sightUploadUI3.f277390g;
                SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
                SightUploadUI sightUploadUI4 = SightUploadUI.this;
                SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
                SnsSightUploadSayFooter snsSightUploadSayFooter = sightUploadUI4.f277391h;
                SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
                C101802kr2 location = snsSightUploadSayFooter.getLocation();
                int i3 = this.f277409d;
                SightUploadUI sightUploadUI5 = SightUploadUI.this;
                SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
                boolean z = sightUploadUI5.f277397q;
                SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
                SightUploadUI sightUploadUI6 = SightUploadUI.this;
                SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
                ArrayList<String> arrayList = sightUploadUI6.f277396p;
                SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
                SightUploadUI sightUploadUI7 = SightUploadUI.this;
                SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
                int i4 = sightUploadUI7.f277394n;
                SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
                SightUploadUI sightUploadUI8 = SightUploadUI.this;
                SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
                int i5 = sightUploadUI8.f277395o;
                SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
                PInt pInt2 = pInt;
                ((SightWidget) f1Var).mo132127e(i2, 0, (C116918i) null, str2, (List<String>) null, location, (LinkedList<Long>) null, i3, z, arrayList, pInt, "", i4, i5);
                C115669n nVar = C115669n.INSTANCE;
                SightUploadUI sightUploadUI9 = SightUploadUI.this;
                String str3 = "com.tencent.mm.plugin.sns.ui.SightUploadUI";
                SnsMethodCalculate.markStartTimeMs("access$1000", str3);
                long j = sightUploadUI9.f277400t;
                SnsMethodCalculate.markEndTimeMs("access$1000", str3);
                SightUploadUI sightUploadUI10 = SightUploadUI.this;
                SnsMethodCalculate.markStartTimeMs("access$1100", str3);
                boolean z2 = sightUploadUI10.f277399s;
                SnsMethodCalculate.markEndTimeMs("access$1100", str3);
                PInt pInt3 = pInt2;
                nVar.mo160131h(13303, Long.valueOf(j), Long.valueOf(Util.nowSecond()), Integer.valueOf(z2 ^ true ? 1 : 0), Integer.valueOf(pInt3.value), "");
                SightUploadUI sightUploadUI11 = SightUploadUI.this;
                SnsMethodCalculate.markStartTimeMs("access$1000", str3);
                long j2 = sightUploadUI11.f277400t;
                SnsMethodCalculate.markEndTimeMs("access$1000", str3);
                SightUploadUI sightUploadUI12 = SightUploadUI.this;
                SnsMethodCalculate.markStartTimeMs("access$1100", str3);
                boolean z3 = sightUploadUI12.f277399s;
                SnsMethodCalculate.markEndTimeMs("access$1100", str3);
                Log.m105919d("MicroMsg.SightUploadUI", "reprot timelinePostAction(13303), %d, %d, %d, %d", Long.valueOf(j2), Long.valueOf(Util.nowSecond()), Integer.valueOf(z3 ^ true ? 1 : 0), Integer.valueOf(pInt3.value));
                SnsMethodCalculate.markEndTimeMs("doWhenOK", "com.tencent.mm.plugin.sns.ui.SightUploadUI$5$1");
            }
        }

        public C95409e() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SightUploadUI$5");
            if (SightUploadUI.this.isFinishing()) {
                SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SightUploadUI$5");
                return false;
            }
            SightUploadUI sightUploadUI = SightUploadUI.this;
            String obj = SightUploadUI.m121748H7(sightUploadUI).getText().toString();
            SnsMethodCalculate.markStartTimeMs("access$202", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
            sightUploadUI.f277390g = obj;
            SnsMethodCalculate.markEndTimeMs("access$202", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
            int pasterLen = SightUploadUI.m121748H7(SightUploadUI.this).getPasterLen();
            C77382c b = C77382c.m93286b(SightUploadUI.m121748H7(SightUploadUI.this));
            int l = C77092c.m93050l();
            b.f225611e = 0;
            b.f225610d = l;
            b.f225607a = true;
            b.mo107499d(new C95410a(pasterLen));
            SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SightUploadUI$5");
            return false;
        }
    }

    /* renamed from: H7 */
    public static /* synthetic */ SnsEditText m121748H7(SightUploadUI sightUploadUI) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
        SnsEditText snsEditText = sightUploadUI.f277387d;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
        return snsEditText;
    }

    public int getLayoutId() {
        SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
        SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
        return C0966R.C0971layout.c4_;
    }

    public void initView() {
        SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
        SnsEditText snsEditText = (SnsEditText) findViewById(C0966R.C0970id.jsy);
        this.f277387d = snsEditText;
        snsEditText.getInputExtras(true).putInt("wechat_scene", 3);
        this.f277387d.getInputExtras(true).putBoolean("if_support_wx_emoji", true);
        this.f277387d.postDelayed(new C95404a(this.f277401u.widthPixels - (this.f277387d.getPaddingLeft() + this.f277389f.getPaddingRight())), 100);
        if (!Util.isNullOrNil(getIntent().getStringExtra("Kdescription"))) {
            this.f277387d.setText(getIntent().getStringExtra("Kdescription"));
        }
        this.f277387d.setBackListener(new C95405b());
        SnsSightUploadSayFooter snsSightUploadSayFooter = (SnsSightUploadSayFooter) findViewById(C0966R.C0970id.j0v);
        this.f277391h = snsSightUploadSayFooter;
        snsSightUploadSayFooter.setMMEditText(this.f277387d);
        this.f277391h.setVisibility(0);
        setBackBtn(new C95406c());
        if (getIntent().getBooleanExtra("KSightDraftEntrance", true)) {
            addIconOptionMenu(1, C0966R.raw.sight_draft_menu, new C95407d());
        }
        addTextOptionMenu(0, getString(C0966R.string.a2s), new C95409e(), (View.OnLongClickListener) null, MMActivityController.C73075r.BLACK);
        enableOptionMenu(true);
        SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
        super.onActivityResult(i, i2, intent);
        if (i2 != -1) {
            SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
            return;
        }
        List<String> list = null;
        if (i == 6 || i == 5 || i == 10) {
            SnsSightUploadSayFooter snsSightUploadSayFooter = this.f277391h;
            snsSightUploadSayFooter.getClass();
            SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
            if (intent == null) {
                SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
            } else {
                if (i == 10) {
                    snsSightUploadSayFooter.f206154s.mo132185d(i, i2, intent);
                } else if (i == 5) {
                    snsSightUploadSayFooter.f206153r.mo132078b(i, i2, intent, (AtContactWidget) null);
                }
                SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
            }
        }
        if (i == 5) {
            if (intent == null) {
                SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
                return;
            }
            int intExtra = intent.getIntExtra("Ktag_range_index", 0);
            if (intExtra >= 2) {
                this.f277392i = intent.getStringExtra("Klabel_name_list");
                this.f277393j = intent.getStringExtra("Kother_user_name_list");
                List<String> asList = Arrays.asList(this.f277392i.split(","));
                if (!Util.isNullOrNil(this.f277393j)) {
                    list = Arrays.asList(this.f277393j.split(","));
                }
                SnsMethodCalculate.markStartTimeMs("getContactNamesFromLabelsAndOtherUserName", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
                this.f277396p = new ArrayList<>();
                if (asList != null && asList.size() > 0) {
                    Iterator it = asList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        List<String> k = ((C67001a) C28250a.m38138a()).mo90973k(((C67001a) C28250a.m38138a()).mo90968f((String) it.next()));
                        if (k == null || k.size() == 0) {
                            Log.m105920e("MicroMsg.SightUploadUI", "dz: getContactNamesFromLabels,namelist get bu label is null");
                        } else {
                            for (String str : k) {
                                if (!this.f277396p.contains(str)) {
                                    this.f277396p.add(str);
                                    Log.m105919d("MicroMsg.SightUploadUI", "dz:name : %s", str);
                                }
                            }
                        }
                    }
                }
                if (asList != null) {
                    int i3 = 0;
                    for (String isNullOrNil : asList) {
                        if (!Util.isNullOrNil(isNullOrNil)) {
                            i3++;
                        }
                    }
                    this.f277394n = i3;
                }
                this.f277395o = 0;
                if (list != null && list.size() > 0) {
                    for (String str2 : list) {
                        if (!this.f277396p.contains(str2)) {
                            this.f277396p.add(str2);
                            this.f277395o++;
                        }
                    }
                }
                SnsMethodCalculate.markEndTimeMs("getContactNamesFromLabelsAndOtherUserName", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
                if (intExtra == 2) {
                    this.f277397q = false;
                } else {
                    this.f277397q = true;
                }
            }
            if (1 == intExtra) {
                this.f277398r = 1;
            } else {
                this.f277398r = 0;
            }
        }
        SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
    }

    public void onCreate(Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
        supportRequestWindowFeature(109);
        super.onCreate(bundle);
        this.f277401u = getResources().getDisplayMetrics();
        SightWidget sightWidget = new SightWidget(this);
        this.f277388e = sightWidget;
        sightWidget.mo132126d(bundle);
        LinearLayout linearLayout = (LinearLayout) findViewById(C0966R.C0970id.f359590lq1);
        this.f277389f = linearLayout;
        linearLayout.addView(this.f277388e.mo132124a());
        setMMTitle((int) C0966R.string.jj4);
        getSupportActionBar().mo91112w(getResources().getDrawable(C0966R.color.f3131gg));
        this.f277399s = getIntent().getBooleanExtra("KSnsPostManu", false);
        this.f277400t = getIntent().getLongExtra("KTouchCameraTime", 0);
        initView();
        C78538u.m94868d(this);
        SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
    }

    public void onDestroy() {
        SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
        super.onDestroy();
        ((SightWidget) this.f277388e).mo132129g();
        SnsSightUploadSayFooter snsSightUploadSayFooter = this.f277391h;
        snsSightUploadSayFooter.getClass();
        SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
        snsSightUploadSayFooter.f206154s.mo132186e();
        SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
        SnsSightUploadSayFooter snsSightUploadSayFooter2 = this.f277391h;
        snsSightUploadSayFooter2.getClass();
        SnsMethodCalculate.markStartTimeMs("release", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
        ChatFooterPanel chatFooterPanel = snsSightUploadSayFooter2.f206150o;
        if (chatFooterPanel != null) {
            chatFooterPanel.mo100200l();
            snsSightUploadSayFooter2.f206150o.mo100189b();
        }
        SnsMethodCalculate.markEndTimeMs("release", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
        SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
    }

    public void onPause() {
        SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
        super.onPause();
        hideVKB();
        SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
    }

    public void onResume() {
        SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
        super.onResume();
        Log.m105918d("MicroMsg.SightUploadUI", "onResume");
        SnsSightUploadSayFooter snsSightUploadSayFooter = this.f277391h;
        snsSightUploadSayFooter.getClass();
        SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
        if (snsSightUploadSayFooter.f206150o.getVisibility() == 8) {
            snsSightUploadSayFooter.f206149n.showVKB();
        }
        SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
        SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
    }
}
