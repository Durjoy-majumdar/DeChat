package com.tencent.p014mm.plugin.sns.p106ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import cc0.C92411b;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.compatible.util.Exif;
import com.tencent.p014mm.modelgeo.Addr;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.appbrand.jsapi.lbs.C82607s;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.report.service.C5139t;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.sdk.platformtools.WeChatLocaleUtil;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import lc3.C10485b;
import nc0.C76850a;
import p156gj.C87203t;
import p286zl.C16292g;
import p447aw.C103918d;
import p680ru.C101464l;
import p702ts.C78083b;
import p702ts.C78085c;
import pe3.C89349b;
import te3.C101802kr2;
import te3.C51163rv3;
import te3.C64885zm2;

/* renamed from: com.tencent.mm.plugin.sns.ui.LocationWidget */
public class LocationWidget extends LinearLayout {

    /* renamed from: L */
    public static final /* synthetic */ int f276869L = 0;

    /* renamed from: A */
    public float f276870A = 0.0f;

    /* renamed from: B */
    public float f276871B = 0.0f;

    /* renamed from: C */
    public float f276872C = 0.0f;

    /* renamed from: D */
    public int f276873D = -1;

    /* renamed from: E */
    public C92411b f276874E = ((C78085c) C86312j.m106911c(C78085c.class)).mo108056ms();

    /* renamed from: F */
    public C95344e f276875F = null;

    /* renamed from: G */
    public C78083b f276876G;

    /* renamed from: H */
    public String f276877H;

    /* renamed from: I */
    public C78083b.C78084a f276878I = new C71199c();

    /* renamed from: J */
    public C92411b.C92412a f276879J = new C71200d();

    /* renamed from: K */
    public C95345f f276880K = null;

    /* renamed from: d */
    public Activity f276881d;

    /* renamed from: e */
    public View f276882e;

    /* renamed from: f */
    public View f276883f;

    /* renamed from: g */
    public int[] f276884g = {C0966R.C0970id.j2o, C0966R.C0970id.j2p, C0966R.C0970id.j2q, C0966R.C0970id.j2r, C0966R.C0970id.j2s};

    /* renamed from: h */
    public ImageView[] f276885h = new ImageView[5];

    /* renamed from: i */
    public int f276886i;

    /* renamed from: j */
    public int f276887j;

    /* renamed from: n */
    public TextView f276888n;

    /* renamed from: o */
    public TextView f276889o;

    /* renamed from: p */
    public WeImageView f276890p;

    /* renamed from: q */
    public float f276891q = -1000.0f;

    /* renamed from: r */
    public float f276892r = -1000.0f;

    /* renamed from: s */
    public byte[] f276893s;

    /* renamed from: t */
    public String f276894t;

    /* renamed from: u */
    public String f276895u;

    /* renamed from: v */
    public String f276896v;

    /* renamed from: w */
    public String f276897w;

    /* renamed from: x */
    public int f276898x = 0;

    /* renamed from: y */
    public C64885zm2 f276899y = null;

    /* renamed from: z */
    public int f276900z = 0;

    /* renamed from: com.tencent.mm.plugin.sns.ui.LocationWidget$a */
    public class C71197a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ int f206075d;

        public C71197a(int i) {
            this.f206075d = i;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/LocationWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.LocationWidget$1");
            LocationWidget locationWidget = LocationWidget.this;
            int i = LocationWidget.f276869L;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.LocationWidget");
            int i2 = locationWidget.f276886i;
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.LocationWidget");
            int i3 = this.f206075d;
            if (i2 == i3 + 1) {
                LocationWidget locationWidget2 = LocationWidget.this;
                SnsMethodCalculate.markStartTimeMs("access$010", "com.tencent.mm.plugin.sns.ui.LocationWidget");
                locationWidget2.f276886i--;
                SnsMethodCalculate.markEndTimeMs("access$010", "com.tencent.mm.plugin.sns.ui.LocationWidget");
            } else {
                LocationWidget locationWidget3 = LocationWidget.this;
                SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.LocationWidget");
                locationWidget3.f276886i = i3 + 1;
                SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.LocationWidget");
            }
            LocationWidget locationWidget4 = LocationWidget.this;
            SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.LocationWidget");
            locationWidget4.mo132188g();
            SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.LocationWidget");
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.LocationWidget$1");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/LocationWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.LocationWidget$b */
    public class C71198b implements View.OnClickListener {
        public C71198b() {
        }

        public void onClick(View view) {
            Class cls = C103918d.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/LocationWidget$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.LocationWidget$2");
            if (!WeChatBrands.Business.Entries.SessionLocation.checkAvailable(view.getContext())) {
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.LocationWidget$2");
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/LocationWidget$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            if (C76850a.m92639k((String) C86709a0.m107535s().mo121142i().mo119684e(274436, (Object) null))) {
                if (!(((C103918d) C86312j.m106911c(cls)).Lb0(LocationWidget.m121515a(LocationWidget.this), "android.permission.ACCESS_FINE_LOCATION") && ((C103918d) C86312j.m106911c(cls)).Lb0(LocationWidget.m121515a(LocationWidget.this), "android.permission.ACCESS_COARSE_LOCATION"))) {
                    if (!((Boolean) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_GDPR_LOCATION_PERMISSION_DESCRIBE_CONFIRM_BOOLEAN_SYNC, Boolean.FALSE)).booleanValue()) {
                        ((C16292g) C86312j.m106911c(C16292g.class)).nr0(LocationWidget.m121515a(LocationWidget.this), LocationWidget.this.getResources().getString(C0966R.string.gbq, new Object[]{LocaleUtil.getApplicationLanguage()}), 30764, true);
                    } else {
                        ((C103918d) C86312j.m106911c(cls)).b40(LocationWidget.m121515a(LocationWidget.this), new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}, 64);
                    }
                    SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.LocationWidget$2");
                    C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/LocationWidget$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
            } else {
                boolean Uu0 = ((C103918d) C86312j.m106911c(cls)).Uu0(LocationWidget.m121515a(LocationWidget.this), new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}, 64, (String) null, (String) null);
                Log.m105925i("MicroMsg.LocationWidget", "summerper checkPermission checkLocation[%b]", Boolean.valueOf(Uu0));
                if (!Uu0) {
                    SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.LocationWidget$2");
                    C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/LocationWidget$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
            }
            LocationWidget.this.mo132183b();
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.LocationWidget$2");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/LocationWidget$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.LocationWidget$c */
    public class C71199c implements C78083b.C78084a {
        public C71199c() {
        }

        public void onLocationAddr(Addr addr) {
            SnsMethodCalculate.markStartTimeMs("onLocationAddr", "com.tencent.mm.plugin.sns.ui.LocationWidget$3");
            Log.m105925i("MicroMsg.LocationWidget", "get info %s", addr.toString());
            LocationWidget locationWidget = LocationWidget.this;
            int i = LocationWidget.f276869L;
            SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.LocationWidget");
            locationWidget.getClass();
            SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.LocationWidget");
            SnsMethodCalculate.markEndTimeMs("onLocationAddr", "com.tencent.mm.plugin.sns.ui.LocationWidget$3");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.LocationWidget$d */
    public class C71200d implements C92411b.C92412a {
        public C71200d() {
        }

        public boolean onGetLocation(boolean z, float f, float f2, int i, double d, double d2, double d3) {
            SnsMethodCalculate.markStartTimeMs("onGetLocation", "com.tencent.mm.plugin.sns.ui.LocationWidget$4");
            if (!z) {
                SnsMethodCalculate.markEndTimeMs("onGetLocation", "com.tencent.mm.plugin.sns.ui.LocationWidget$4");
                return true;
            }
            Log.m105919d("MicroMsg.LocationWidget", "get location %f %f", Float.valueOf(f2), Float.valueOf(f));
            ((C101464l) C86312j.m106911c(C101464l.class)).mo140963f9(2003, f, f2, 0);
            LocationWidget locationWidget = LocationWidget.this;
            int i2 = LocationWidget.f276869L;
            SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.LocationWidget");
            locationWidget.getClass();
            SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.LocationWidget");
            SnsMethodCalculate.markEndTimeMs("onGetLocation", "com.tencent.mm.plugin.sns.ui.LocationWidget$4");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.LocationWidget$e */
    public interface C95344e {
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.LocationWidget$f */
    public class C95345f {

        /* renamed from: a */
        public int f276901a;

        /* renamed from: b */
        public long f276902b = -1;

        /* renamed from: c */
        public long f276903c = -1;

        /* renamed from: d */
        public long f276904d = -1;

        /* renamed from: e */
        public int f276905e = 0;

        /* renamed from: f */
        public int f276906f = 0;

        /* renamed from: g */
        public String f276907g = "";

        public C95345f(LocationWidget locationWidget) {
        }
    }

    public LocationWidget(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo132184c((MMActivity) context);
    }

    /* renamed from: a */
    public static /* synthetic */ Activity m121515a(LocationWidget locationWidget) {
        SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.LocationWidget");
        Activity activity = locationWidget.f276881d;
        SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.LocationWidget");
        return activity;
    }

    /* renamed from: b */
    public void mo132183b() {
        SnsMethodCalculate.markStartTimeMs("doClickAfterPermission", "com.tencent.mm.plugin.sns.ui.LocationWidget");
        Intent intent = new Intent();
        intent.putExtra("near_life_scene", 1);
        try {
            C64885zm2 zm22 = this.f276899y;
            if (zm22 != null) {
                intent.putExtra("get_poi_item_buf", zm22.toByteArray());
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.LocationWidget", e, "", new Object[0]);
        }
        if (!Util.isNullOrNil(this.f276897w)) {
            intent.putExtra("get_poi_classify_id", this.f276897w);
        } else if (!Util.isNullOrNil(this.f276896v)) {
            intent.putExtra("get_city", this.f276896v);
        }
        intent.putExtra("get_lat", this.f276891q);
        intent.putExtra("get_lng", this.f276892r);
        intent.putExtra("request_id", this.f276877H);
        C95344e eVar = this.f276875F;
        if (eVar != null) {
            SnsUploadUI snsUploadUI = (SnsUploadUI) eVar;
            snsUploadUI.getClass();
            SnsMethodCalculate.markStartTimeMs("reqPicLatLongList", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
            C95778f1 f1Var = snsUploadUI.f278944u;
            if (f1Var instanceof C95754d2) {
                C95754d2 d2Var = (C95754d2) f1Var;
                d2Var.getClass();
                SnsMethodCalculate.markStartTimeMs("getPicLatLongList", "com.tencent.mm.plugin.sns.ui.PicWidget");
                ArrayList<String> d = d2Var.f279310c.mo133209d();
                ArrayList arrayList = new ArrayList();
                Iterator<String> it = d.iterator();
                while (it.hasNext()) {
                    Exif.C80833a aVar = (Exif.C80833a) ((HashMap) d2Var.f279314g).get(it.next());
                    if (aVar != null) {
                        arrayList.add(aVar);
                    }
                }
                SnsMethodCalculate.markEndTimeMs("getPicLatLongList", "com.tencent.mm.plugin.sns.ui.PicWidget");
                SnsMethodCalculate.markEndTimeMs("reqPicLatLongList", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
            } else {
                SnsMethodCalculate.markEndTimeMs("reqPicLatLongList", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
            }
        }
        C88144b.m109795m(getContext(), "nearlife", "com.tencent.mm.plugin.nearlife.ui.CheckInLifeUI", intent, 10);
        C5139t.m5183e(12, 10);
        SnsMethodCalculate.markEndTimeMs("doClickAfterPermission", "com.tencent.mm.plugin.sns.ui.LocationWidget");
    }

    /* renamed from: c */
    public final void mo132184c(MMActivity mMActivity) {
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.LocationWidget");
        this.f276881d = mMActivity;
        View inflate = View.inflate(mMActivity, getLayoutResource(), this);
        View findViewById = inflate.findViewById(C0966R.C0970id.g45);
        this.f276882e = findViewById;
        this.f276888n = (TextView) findViewById.findViewById(C0966R.C0970id.g4v);
        this.f276889o = (TextView) this.f276882e.findViewById(C0966R.C0970id.g4k);
        this.f276890p = (WeImageView) this.f276882e.findViewById(C0966R.C0970id.g4c);
        this.f276883f = inflate.findViewById(C0966R.C0970id.j2m);
        for (int i = 0; i < 5; i++) {
            this.f276885h[i] = (ImageView) this.f276883f.findViewById(this.f276884g[i]);
            this.f276885h[i].setOnClickListener(new C71197a(i));
        }
        this.f276876G = ((C78085c) C86312j.m106911c(C78085c.class)).oe0();
        inflate.setOnClickListener(new C71198b());
        String stringExtra = mMActivity.getIntent().getStringExtra("kpoi_id");
        this.f276897w = stringExtra;
        if (!Util.isNullOrNil(stringExtra)) {
            this.f276891q = mMActivity.getIntent().getFloatExtra("k_lat", -1000.0f);
            this.f276892r = mMActivity.getIntent().getFloatExtra("k_lng", -1000.0f);
            this.f276895u = mMActivity.getIntent().getStringExtra("kpoi_name");
            this.f276894t = mMActivity.getIntent().getStringExtra("Kpoi_address");
            mo132187f();
        }
        if (C86709a0.m107523b().mo121114l()) {
            this.f276887j = Util.getInt(((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("SnsPostPOICommentSwitch"), 0);
        } else {
            this.f276887j = 0;
        }
        mo132188g();
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.LocationWidget");
    }

    /* renamed from: d */
    public boolean mo132185d(int i, int i2, Intent intent) {
        SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.LocationWidget");
        if (intent == null) {
            SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.LocationWidget");
            return true;
        }
        this.f276898x = intent.getIntExtra("get_poi_classify_type", 0);
        this.f276900z = intent.getIntExtra("get_poi_showflag", 0);
        Log.m105919d("MicroMsg.LocationWidget", "onactivity result ok poiClassifyType %d", Integer.valueOf(this.f276898x));
        this.f276895u = Util.nullAs(intent.getStringExtra("get_poi_name"), "");
        this.f276896v = Util.nullAs(intent.getStringExtra("get_city"), "");
        this.f276891q = intent.getFloatExtra("get_lat", -1000.0f);
        this.f276892r = intent.getFloatExtra("get_lng", -1000.0f);
        Log.m105924i("MicroMsg.LocationWidget", "check cur lat " + this.f276870A + " " + this.f276871B);
        this.f276870A = intent.getFloatExtra("get_cur_lat", 0.0f);
        this.f276871B = intent.getFloatExtra("get_cur_lng", 0.0f);
        this.f276873D = intent.getIntExtra("get_loctype", -1);
        this.f276872C = intent.getFloatExtra("get_accuracy", 0.0f);
        intent.getBooleanExtra("get_is_mars", true);
        this.f276877H = intent.getStringExtra("request_id");
        this.f276893s = intent.getByteArrayExtra("location_ctx");
        if (!Util.isNullOrNil(this.f276895u)) {
            this.f276894t = Util.nullAs(intent.getStringExtra("get_poi_address"), "");
            this.f276897w = Util.nullAs(intent.getStringExtra("get_poi_classify_id"), "");
            C64885zm2 zm22 = new C64885zm2();
            this.f276899y = zm22;
            try {
                this.f276899y = (C64885zm2) zm22.parseFrom(intent.getByteArrayExtra("get_poi_item_buf"));
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.LocationWidget", e, "", new Object[0]);
                this.f276899y = null;
            }
            if (!Util.isNullOrNil(this.f276897w)) {
                C64885zm2 zm23 = new C64885zm2();
                this.f276899y = zm23;
                zm23.f186729d = this.f276897w;
                zm23.f186738p = this.f276898x;
                zm23.f186730e = this.f276895u;
                LinkedList<C51163rv3> linkedList = zm23.f186735j;
                C51163rv3 rv32 = new C51163rv3();
                rv32.f141175d = this.f276894t;
                rv32.f141176e = true;
                linkedList.add(rv32);
            }
        } else if (!Util.isNullOrNil(this.f276896v)) {
            this.f276895u = "";
            this.f276894t = "";
            this.f276897w = "";
            this.f276899y = null;
        } else {
            this.f276891q = -1000.0f;
            this.f276892r = -1000.0f;
            this.f276895u = "";
            this.f276894t = "";
            this.f276896v = "";
            this.f276897w = "";
            this.f276899y = null;
        }
        Log.m105919d("MicroMsg.LocationWidget", "label %s poiname %s", this.f276894t, this.f276895u);
        mo132187f();
        mo132188g();
        C95345f fVar = new C95345f(this);
        this.f276880K = fVar;
        SnsMethodCalculate.markStartTimeMs("feed", "com.tencent.mm.plugin.sns.ui.LocationWidget$ReportInfo");
        fVar.f276901a = intent.getIntExtra("report_index", -1);
        fVar.f276902b = intent.getLongExtra("first_start_time", 0);
        fVar.f276903c = intent.getLongExtra("lastSuccStamp", 0);
        fVar.f276904d = intent.getLongExtra("firstSuccStamp", 0);
        fVar.f276905e = intent.getIntExtra("reqLoadCnt", 0);
        fVar.f276906f = intent.getIntExtra("entry_time", 0);
        fVar.f276907g = intent.getStringExtra("search_id");
        SnsMethodCalculate.markEndTimeMs("feed", "com.tencent.mm.plugin.sns.ui.LocationWidget$ReportInfo");
        SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.LocationWidget");
        return true;
    }

    /* renamed from: e */
    public void mo132186e() {
        SnsMethodCalculate.markStartTimeMs("stop", "com.tencent.mm.plugin.sns.ui.LocationWidget");
        C92411b bVar = this.f276874E;
        if (bVar != null) {
            bVar.mo126408b(this.f276879J);
        }
        C78083b bVar2 = this.f276876G;
        if (bVar2 != null) {
            bVar2.mo108055b(this.f276878I);
        }
        SnsMethodCalculate.markEndTimeMs("stop", "com.tencent.mm.plugin.sns.ui.LocationWidget");
    }

    /* renamed from: f */
    public final void mo132187f() {
        SnsMethodCalculate.markStartTimeMs("updatePoiName", "com.tencent.mm.plugin.sns.ui.LocationWidget");
        if (!(this.f276888n == null || this.f276889o == null)) {
            if (!Util.isNullOrNil(this.f276895u)) {
                this.f276888n.setText(this.f276895u);
                this.f276888n.setTextColor(getResources().getColor(C0966R.color.f3536x0));
                this.f276889o.setVisibility(8);
            } else if (!Util.isNullOrNil(this.f276896v)) {
                this.f276888n.setText(this.f276896v);
                this.f276888n.setTextColor(getResources().getColor(C0966R.color.f3536x0));
                this.f276889o.setVisibility(8);
            } else {
                this.f276888n.setText(C0966R.string.jed);
                this.f276888n.setTextColor(getResources().getColor(C0966R.color.a7f));
                this.f276889o.setVisibility(8);
            }
        }
        if (!Util.isNullOrNil(this.f276895u) || !Util.isNullOrNil(this.f276896v)) {
            this.f276890p.mo104518r(C0966R.raw.album_location_icon_pressed, C0966R.color.akw);
        } else {
            this.f276890p.mo104518r(C0966R.raw.album_location_icon_normal, C0966R.color.f3598yz);
        }
        SnsMethodCalculate.markEndTimeMs("updatePoiName", "com.tencent.mm.plugin.sns.ui.LocationWidget");
    }

    /* renamed from: g */
    public final void mo132188g() {
        int i;
        SnsMethodCalculate.markStartTimeMs("updateScoreItem", "com.tencent.mm.plugin.sns.ui.LocationWidget");
        int i2 = 0;
        Log.m105925i("MicroMsg.LocationWidget", "updateScoreItem scoreSwtich:%d, classifyId:%s, poiClassifyType:%d, showFlag:%d, isOverSea:%b", Integer.valueOf(this.f276887j), this.f276897w, Integer.valueOf(this.f276898x), Integer.valueOf(this.f276900z), Boolean.valueOf(WeChatLocaleUtil.isOverseasUserByWechatLanguage()));
        if (WeChatLocaleUtil.isOverseasUserByWechatLanguage() || this.f276887j == 0 || Util.isNullOrNil(this.f276897w) || this.f276898x == 1 || (this.f276900z & 1) == 0) {
            View view = this.f276883f;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/LocationWidget", "updateScoreItem", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ui/LocationWidget", "updateScoreItem", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            SnsMethodCalculate.markEndTimeMs("updateScoreItem", "com.tencent.mm.plugin.sns.ui.LocationWidget");
            return;
        }
        View view2 = this.f276883f;
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(0);
        View view3 = view2;
        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/LocationWidget", "updateScoreItem", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/sns/ui/LocationWidget", "updateScoreItem", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        while (true) {
            i = this.f276886i;
            if (i2 >= i) {
                break;
            }
            this.f276885h[i2].setImageResource(getSelectedStarImageResource());
            i2++;
        }
        while (i < 5) {
            this.f276885h[i].setImageResource(getNormalStarImageResource());
            i++;
        }
        SnsMethodCalculate.markEndTimeMs("updateScoreItem", "com.tencent.mm.plugin.sns.ui.LocationWidget");
    }

    public C101802kr2 getCurLocation() {
        SnsMethodCalculate.markStartTimeMs("getCurLocation", "com.tencent.mm.plugin.sns.ui.LocationWidget");
        C101802kr2 kr22 = new C101802kr2();
        kr22.f298648e = this.f276870A;
        kr22.f298647d = this.f276871B;
        kr22.f298658r = this.f276872C;
        kr22.f298657q = this.f276873D;
        SnsMethodCalculate.markEndTimeMs("getCurLocation", "com.tencent.mm.plugin.sns.ui.LocationWidget");
        return kr22;
    }

    public int getLayoutResource() {
        SnsMethodCalculate.markStartTimeMs("getLayoutResource", "com.tencent.mm.plugin.sns.ui.LocationWidget");
        SnsMethodCalculate.markEndTimeMs("getLayoutResource", "com.tencent.mm.plugin.sns.ui.LocationWidget");
        return C0966R.C0971layout.b88;
    }

    public C101802kr2 getLocation() {
        SnsMethodCalculate.markStartTimeMs(C82607s.NAME, "com.tencent.mm.plugin.sns.ui.LocationWidget");
        C101802kr2 kr22 = new C101802kr2();
        kr22.f298648e = this.f276891q;
        kr22.f298647d = this.f276892r;
        kr22.f298656p = 0;
        kr22.f298660t = this.f276886i;
        byte[] bArr = this.f276893s;
        if (bArr != null) {
            kr22.f298659s = new C89349b(bArr);
        }
        if (!Util.isNullOrNil(this.f276895u)) {
            kr22.f298651h = this.f276894t;
            kr22.f298650g = this.f276895u;
            kr22.f298652i = this.f276897w;
            kr22.f298649f = this.f276896v;
            int i = this.f276898x;
            if (i == 0) {
                kr22.f298653j = 1;
            } else if (i == 1) {
                kr22.f298653j = 2;
            } else {
                kr22.f298653j = 1;
            }
            Log.m105919d("MicroMsg.LocationWidget", "getlocation type %d", Integer.valueOf(kr22.f298653j));
        } else if (!Util.isNullOrNil(this.f276896v)) {
            kr22.f298649f = this.f276896v;
        }
        SnsMethodCalculate.markStartTimeMs("reportDirectly", "com.tencent.mm.plugin.sns.ui.LocationWidget");
        if (this.f276880K == null) {
            SnsMethodCalculate.markEndTimeMs("reportDirectly", "com.tencent.mm.plugin.sns.ui.LocationWidget");
        } else {
            String format = String.format("%f/%f", new Object[]{Float.valueOf(kr22.f298648e), Float.valueOf(kr22.f298647d)});
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("index " + this.f276880K.f276901a);
            stringBuffer.append("firstStartStamp " + this.f276880K.f276902b);
            stringBuffer.append("lastSuccStamp " + this.f276880K.f276904d);
            stringBuffer.append("firstSuccStamp " + this.f276880K.f276903c);
            stringBuffer.append("reqLoadCnt " + this.f276880K.f276905e);
            stringBuffer.append("classifyId " + this.f276897w);
            stringBuffer.append("entryTime " + this.f276880K.f276906f);
            stringBuffer.append("searchId" + this.f276880K.f276907g);
            Log.m105919d("MicroMsg.LocationWidget", "report %s", stringBuffer.toString());
            C115669n.INSTANCE.mo160131h(11135, 5, Integer.valueOf(this.f276880K.f276901a + 1), Long.valueOf(this.f276880K.f276902b), Long.valueOf(this.f276880K.f276904d), Long.valueOf(System.currentTimeMillis()), Long.valueOf(this.f276880K.f276903c), Integer.valueOf(this.f276880K.f276905e), format, this.f276897w, Integer.valueOf(this.f276880K.f276906f), this.f276880K.f276907g, C87203t.m108270f(true));
            SnsMethodCalculate.markEndTimeMs("reportDirectly", "com.tencent.mm.plugin.sns.ui.LocationWidget");
        }
        SnsMethodCalculate.markEndTimeMs(C82607s.NAME, "com.tencent.mm.plugin.sns.ui.LocationWidget");
        return kr22;
    }

    public int getNormalStarImageResource() {
        SnsMethodCalculate.markStartTimeMs("getNormalStarImageResource", "com.tencent.mm.plugin.sns.ui.LocationWidget");
        SnsMethodCalculate.markEndTimeMs("getNormalStarImageResource", "com.tencent.mm.plugin.sns.ui.LocationWidget");
        return C0966R.raw.sns_shoot_star_normal;
    }

    public int getNormalStateImageResource() {
        SnsMethodCalculate.markStartTimeMs("getNormalStateImageResource", "com.tencent.mm.plugin.sns.ui.LocationWidget");
        SnsMethodCalculate.markEndTimeMs("getNormalStateImageResource", "com.tencent.mm.plugin.sns.ui.LocationWidget");
        return C0966R.raw.album_location_icon_normal;
    }

    public int getSelectedStarImageResource() {
        SnsMethodCalculate.markStartTimeMs("getSelectedStarImageResource", "com.tencent.mm.plugin.sns.ui.LocationWidget");
        SnsMethodCalculate.markEndTimeMs("getSelectedStarImageResource", "com.tencent.mm.plugin.sns.ui.LocationWidget");
        return C0966R.raw.sns_shoot_star_selected;
    }

    public int getSelectedStateImageResource() {
        SnsMethodCalculate.markStartTimeMs("getSelectedStateImageResource", "com.tencent.mm.plugin.sns.ui.LocationWidget");
        SnsMethodCalculate.markEndTimeMs("getSelectedStateImageResource", "com.tencent.mm.plugin.sns.ui.LocationWidget");
        return C0966R.raw.album_location_icon_pressed;
    }

    public int getShowFlag() {
        SnsMethodCalculate.markStartTimeMs("getShowFlag", "com.tencent.mm.plugin.sns.ui.LocationWidget");
        int i = this.f276900z;
        SnsMethodCalculate.markEndTimeMs("getShowFlag", "com.tencent.mm.plugin.sns.ui.LocationWidget");
        return i;
    }

    public void setLocationWidgetListener(C95344e eVar) {
        SnsMethodCalculate.markStartTimeMs("setLocationWidgetListener", "com.tencent.mm.plugin.sns.ui.LocationWidget");
        this.f276875F = eVar;
        SnsMethodCalculate.markEndTimeMs("setLocationWidgetListener", "com.tencent.mm.plugin.sns.ui.LocationWidget");
    }

    public LocationWidget(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo132184c((MMActivity) context);
    }
}
