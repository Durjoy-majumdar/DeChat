package com.tencent.p014mm.plugin.location.p069ui.impl;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import bh3.C113177k;
import cc0.C92411b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.DoFavoriteEvent;
import com.tencent.p014mm.autogen.events.NotifyWNNoteOperationEvent;
import com.tencent.p014mm.p136ui.C85864g1;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.location.model.LocationInfo;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C6684b2;
import com.tencent.p014mm.remoteservice.C96905d;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sendtowework.LocationData;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.wxmm.v2helper;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import fy3.C32226l;
import ht1.C98522w3;
import j20.C117292a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kg3.C76577a;
import nj3.C34861g1;
import nj3.C76874e0;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p154fy.C32222e;
import p154fy.C32223f;
import p159gw.C8464j;
import p702ts.C78085c;
import p910lj.C76701a;
import pb1.C100695a0;
import pb1.C100714h1;
import pb1.C100718j1;
import pb1.C100734q;
import pb1.C100755z;
import pb1.C62251b1;
import qo3.C12925w;
import qo3.C77398g;
import qo3.C77407n;
import rx3.C13598b0;
import t22.C101715i;
import te3.C101811md0;
import te3.C101834rc0;
import te3.C101835rd0;
import te3.C101841sc0;
import te3.C77911cd0;
import wc3.C15133e0;
import wc3.C78538u;
import x22.C102551u;
import x22.C38446c;
import x22.C91134d;
import xb1.C102614d;

/* renamed from: com.tencent.mm.plugin.location.ui.impl.b1 */
public abstract class C94163b1 extends C94161a implements C11385n, C113177k.C113180d {

    /* renamed from: A */
    public C96905d f271978A = new C96905d(this.f271948d);

    /* renamed from: B */
    public C102551u f271979B;

    /* renamed from: C */
    public C77407n f271980C;

    /* renamed from: D */
    public boolean f271981D = false;

    /* renamed from: E */
    public Serializable f271982E;

    /* renamed from: F */
    public boolean f271983F = false;

    /* renamed from: G */
    public C15133e0 f271984G = ((C15133e0) C86312j.m106911c(C15133e0.class)).Ct0();

    /* renamed from: H */
    public C77398g f271985H;

    /* renamed from: I */
    public C92411b.C92412a f271986I = new b1$$j(this);

    /* renamed from: J */
    public boolean f271987J = false;

    /* renamed from: K */
    public ProgressDialog f271988K = null;

    /* renamed from: L */
    public MMHandler f271989L = new MMHandler(Looper.getMainLooper());

    /* renamed from: M */
    public Runnable f271990M = new b1$$k(this);

    /* renamed from: N */
    public boolean f271991N = false;

    /* renamed from: P */
    public float f271992P = 0.0f;

    /* renamed from: Q */
    public float f271993Q = 0.0f;

    /* renamed from: y */
    public long f271994y = -1;

    /* renamed from: z */
    public String f271995z = "";

    public C94163b1(Activity activity) {
        super(activity);
        C86709a0.m107524d().mo123455a(v2helper.EMethodSetSpkEnhance, this);
    }

    /* renamed from: t */
    public static void m119026t(C94163b1 b1Var, MenuItem menuItem, int i) {
        ViewGroup.LayoutParams layoutParams;
        C94163b1 b1Var2 = b1Var;
        b1Var.getClass();
        Class cls = C62251b1.class;
        Class cls2 = C98522w3.class;
        HashMap hashMap = new HashMap();
        switch (menuItem.getItemId()) {
            case 0:
                b1Var.mo129386x();
                return;
            case 1:
                int i2 = b1Var2.f271950f;
                if (i2 == 2 || i2 == 12 || i2 == 13) {
                    C100695a0.m131729d(b1Var.mo129361n().getLongExtra("kFavInfoLocalId", -1), 1, 0, -1);
                }
                Intent intent = new Intent();
                intent.putExtra("Retr_Msg_content", C101715i.m133625b(b1Var2.f271951g));
                intent.putExtra("Retr_Msg_Type", 9);
                LocationInfo locationInfo = b1Var2.f271951g;
                if (locationInfo != null) {
                    LocationData locationData = new LocationData(locationInfo.f271935j, locationInfo.f271933h, Double.valueOf(locationInfo.f271931f), Double.valueOf(b1Var2.f271951g.f271930e), Double.valueOf((double) b1Var2.f271951g.f271932g));
                    intent.putExtra("content_type_forward_to_wework", 6);
                    intent.putExtra("Select_Data_Send_To_WeWork", locationData);
                }
                C88144b.m109801s(b1Var2.f271948d, ".ui.transmit.MsgRetransmitUI", intent, (Bundle) null);
                ((C62251b1) C86312j.m106911c(cls)).mo87305En(b1Var.mo129361n(), b1Var2.f271963v, b1Var2.f271962u, 3);
                ((C98522w3) C86312j.m106911c(cls2)).mo3990Ai((View) null, true, false, "forward_button_in_menu_in_poi_page", hashMap);
                return;
            case 2:
                b1Var.mo129369B();
                return;
            case 3:
                Log.m105919d("MicroMsg.ViewMapUI", "directlyFavorite lat %s, long %s, scale", Double.valueOf(b1Var2.f271951g.f271930e), Double.valueOf(b1Var2.f271951g.f271931f));
                b1Var2.f271948d.setResult(-1, b1Var.mo129384v());
                b1Var2.f271948d.finish();
                ((C98522w3) C86312j.m106911c(cls2)).mo3990Ai((View) null, true, false, "fav_button_in_menu_in_poi_page", hashMap);
                return;
            case 4:
                Activity activity = b1Var2.f271948d;
                C76879j.m92750u(activity, activity.getString(C0966R.string.f7946x3), "", new C94165c1(b1Var2), (DialogInterface.OnClickListener) null);
                ((C62251b1) C86312j.m106911c(cls)).mo87305En(b1Var.mo129361n(), b1Var2.f271963v, b1Var2.f271962u, 6);
                return;
            case 5:
                long longExtra = b1Var.mo129361n().getLongExtra("kFavInfoLocalId", -1);
                Intent intent2 = new Intent();
                intent2.putExtra("key_fav_item_id", longExtra);
                intent2.putExtra("key_fav_scene", 2);
                C100734q.m131875t0(b1Var2.f271948d, ".ui.FavTagEditUI", intent2, (Bundle) null);
                ((C62251b1) C86312j.m106911c(cls)).mo87305En(b1Var.mo129361n(), b1Var2.f271963v, b1Var2.f271962u, 7);
                return;
            case 6:
                Intent intent3 = new Intent();
                intent3.putExtra("Retr_Msg_content", C101715i.m133625b(b1Var2.f271951g));
                intent3.putExtra("Retr_Msg_Id", b1Var2.f271994y);
                C88144b.m109801s(b1Var2.f271948d, ".ui.chatting.ChattingSendDataToDeviceUI", intent3, (Bundle) null);
                return;
            case 7:
                ((C62251b1) C86312j.m106911c(cls)).mo87305En(b1Var.mo129361n(), b1Var2.f271963v, b1Var2.f271962u, 5);
                try {
                    C100755z Yt = ((C102614d) ((C100718j1) C86312j.m106911c(C100718j1.class)).mo128199Jq()).mo142266Yt(b1Var.mo129361n().getLongExtra("kFavInfoLocalId", -1));
                    C115669n.INSTANCE.mo160131h(15378, Integer.valueOf(Yt.field_id), Integer.valueOf(Yt.field_type));
                    Log.m105919d("MicroMsg.ViewMapUI", "report 15378, id:%s, type:%s", Integer.valueOf(Yt.field_id), Integer.valueOf(Yt.field_type));
                    b1Var2.mo129385w(Yt);
                    b1Var2.mo129387y(b1Var2.f271948d, Yt, true, new C101811md0());
                    b1Var2.f271948d.finish();
                    return;
                } catch (Throwable unused) {
                    C76701a.makeText((Context) b1Var2.f271948d, (int) C0966R.string.f360434cr2, 0).show();
                    return;
                }
            case 8:
                Intent v = b1Var.mo129384v();
                DoFavoriteEvent doFavoriteEvent = new DoFavoriteEvent();
                ((C100714h1) C86312j.m106911c(C100714h1.class)).Ae0(doFavoriteEvent, v);
                DoFavoriteEvent.C92474a aVar = doFavoriteEvent.f264674d;
                aVar.f264684i = b1Var2.f271948d;
                aVar.f264688m = 42;
                doFavoriteEvent.publish();
                return;
            case 9:
                b1Var.mo129359l();
                return;
            case 10:
                ClipboardHelper.setText(Util.nullAsNil(b1Var2.f271951g.f271935j) + " " + Util.nullAsNil(b1Var2.f271951g.f271933h));
                C76701a.makeText((Context) b1Var2.f271948d, (int) C0966R.string.f7938wv, 0).show();
                return;
            case 11:
                C12925w wVar = new C12925w(b1Var2.f271948d);
                View inflate = LayoutInflater.from(b1Var2.f271948d).inflate(C0966R.C0971layout.d_h, (ViewGroup) null);
                ((C98522w3) C86312j.m106911c(cls2)).mo3990Ai(inflate, false, true, "poi_info_from_qqmap_guide", (Map<String, Object>) null);
                View findViewById = inflate.findViewById(C0966R.C0970id.nde);
                View findViewById2 = inflate.findViewById(C0966R.C0970id.be4);
                View findViewById3 = inflate.findViewById(C0966R.C0970id.f15);
                TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.knx);
                findViewById2.setOnClickListener(new b1$$g(wVar));
                findViewById.setOnClickListener(new b1$$h(wVar));
                float p = C76577a.m92165p(b1Var2.f271948d);
                if (!(p == 1.0f || (layoutParams = findViewById3.getLayoutParams()) == null)) {
                    int dimension = (int) (b1Var2.f271948d.getResources().getDimension(C0966R.dimen.f3755d6) * p);
                    layoutParams.width = dimension;
                    layoutParams.height = dimension;
                    findViewById3.setLayoutParams(layoutParams);
                }
                C85875k4.m106189j0(textView.getPaint(), 0.8f);
                wVar.mo12471k(inflate);
                wVar.mo5086o();
                ((C98522w3) C86312j.m106911c(cls2)).mo3990Ai((View) null, true, false, "click_report_addr_in_menu_in_poi_page", hashMap);
                return;
            default:
                return;
        }
    }

    /* renamed from: A */
    public final void mo129368A() {
        boolean q = mo129364q();
        boolean z = true;
        if (q) {
            C77407n nVar = new C77407n((Context) this.f271948d, 0, false);
            this.f271980C = nVar;
            int i = this.f271950f;
            if (i == 2 || i == 12 || i == 13) {
                nVar.f225773j = new b1$$a(this);
            } else {
                nVar.f225773j = new b1$$b(this);
            }
            nVar.f225787r = new b1$$c(this);
            nVar.f225782p = new b1$$c(this);
            if (!this.f271983F) {
                String str = this.f271951g.f271938p;
                if (str == null || !str.startsWith("UgcPoiEx_")) {
                    z = false;
                }
                if (!z) {
                    this.f271984G.Q60(this.f271948d, this.f271980C, 1, (C32226l<? super Boolean, C13598b0>) null, new b1$$d(this));
                }
            }
        } else {
            C77407n nVar2 = new C77407n((Context) this.f271948d, 1, false);
            this.f271980C = nVar2;
            nVar2.f225782p = new b1$$c(this);
        }
        this.f271980C.f225771i = new b1$$e(this, q);
    }

    /* renamed from: B */
    public void mo129369B() {
        Log.m105919d("MicroMsg.ViewMapUI", "locationLine, locationInfo.slat=%f, locationInfo.slong=%f, myLocation.slat=%f, myLocation.slong=%f", Double.valueOf(this.f271951g.f271930e), Double.valueOf(this.f271951g.f271931f), Double.valueOf(this.f271952h.f271930e), Double.valueOf(this.f271952h.f271931f));
        if (this.f271952h.mo129348a()) {
            mo129375H();
            return;
        }
        C115669n.INSTANCE.mo160131h(12809, 3, "");
        this.f271987J = true;
        MMHandler mMHandler = this.f271989L;
        if (mMHandler != null) {
            Runnable runnable = this.f271990M;
            if (runnable != null) {
                mMHandler.removeCallbacks(runnable);
            }
            this.f271989L.postDelayed(this.f271990M, 10000);
            Activity activity = this.f271948d;
            this.f271988K = C76879j.m92723Q(activity, activity.getString(C0966R.string.a3h), this.f271948d.getString(C0966R.string.feo), true, true, new b1$$l(this));
        }
    }

    /* renamed from: C */
    public abstract void mo129370C();

    /* renamed from: D */
    public final void mo129371D(C76874e0 e0Var) {
        if (mo129361n().getBooleanExtra("kFavCanRemark", true)) {
            e0Var.mo107144g(9, this.f271948d.getString(C0966R.string.nbs), C0966R.raw.icons_outlined_pencil);
        }
        if (mo129361n().getBooleanExtra("kFavCanDel", true)) {
            e0Var.mo107151k(7, this.f271948d.getString(C0966R.string.f360432cr0), C0966R.raw.icons_outlined_pencil, this.f271983F);
            e0Var.mo107144g(5, this.f271948d.getString(C0966R.string.cns), C0966R.raw.fav_tags_icon);
            e0Var.mo107144g(4, this.f271948d.getString(C0966R.string.f7944x1), C0966R.raw.icons_outlined_delete);
        }
    }

    /* renamed from: E */
    public void mo129372E() {
    }

    /* renamed from: F */
    public abstract void mo129373F();

    /* renamed from: G */
    public void mo129374G(double d, double d2, int i, double d3) {
    }

    /* renamed from: H */
    public void mo129375H() {
    }

    /* renamed from: b */
    public boolean mo129376b(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f271992P = motionEvent.getX();
            this.f271993Q = motionEvent.getY();
            System.currentTimeMillis();
            this.f271991N = false;
            mo129372E();
        } else if (action == 1) {
            if (!this.f271991N) {
                System.currentTimeMillis();
            }
            mo129373F();
        } else if (action == 2 && (Math.abs(motionEvent.getX() - this.f271992P) > 10.0f || Math.abs(motionEvent.getY() - this.f271993Q) > 10.0f)) {
            this.f271991N = true;
            mo129370C();
        }
        return false;
    }

    /* renamed from: c */
    public void mo129377c(int i, int i2, Intent intent) {
        int i3 = i;
        int i4 = i2;
        Intent intent2 = intent;
        if (-1 == i4) {
            if (4096 == i3) {
                if (this.f271953i.f271975i != null) {
                    CharSequence charSequenceExtra = intent2.getCharSequenceExtra("key_result");
                    this.f271956o = charSequenceExtra == null ? "" : charSequenceExtra.toString();
                    mo129365r();
                }
            } else if (4100 == i3 && this.f271953i.f271976j != null) {
                this.f271958q = intent2.getStringArrayListExtra("key_fav_result_list");
                mo129365r();
            }
        }
        if (i3 == 4098 || i3 == 4099) {
            C91134d dVar = this.f271949e;
            dVar.getClass();
            if (i3 != 4098) {
                if (i3 == 4099 && -1 == i4 && intent2 != null) {
                    String stringExtra = intent2.getStringExtra("selectpkg");
                    Intent intent3 = new Intent((Intent) intent2.getBundleExtra("transferback").getParcelable("targetintent"));
                    intent3.setPackage(stringExtra);
                    intent3.addFlags(524288);
                    Context context = dVar.f261352a;
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(intent3);
                    Context context2 = context;
                    C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/location/ui/MapHelper", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(context2, "com/tencent/mm/plugin/location/ui/MapHelper", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
            } else if (-1 == i4 && intent2 != null) {
                String stringExtra2 = intent2.getStringExtra("selectpkg");
                Bundle bundleExtra = intent2.getBundleExtra("transferback");
                boolean booleanExtra = intent2.getBooleanExtra("isalways", false);
                ArrayList parcelableArrayList = bundleExtra.getParcelableArrayList("locations");
                dVar.mo125198e((LocationInfo) parcelableArrayList.get(0), (LocationInfo) parcelableArrayList.get(1), stringExtra2, booleanExtra);
            } else if (4097 == i4) {
                if (intent2.getBooleanExtra("isalways", false)) {
                    C115669n.INSTANCE.mo160131h(11091, 6, 2);
                } else {
                    C115669n.INSTANCE.mo160131h(11091, 6, 1);
                }
                ArrayList parcelableArrayList2 = intent2.getBundleExtra("transferback").getParcelableArrayList("locations");
                LocationInfo locationInfo = (LocationInfo) parcelableArrayList2.get(0);
                LocationInfo locationInfo2 = (LocationInfo) parcelableArrayList2.get(1);
                String str = Util.isNullOrNil(locationInfo.f271934i) ? "zh-cn" : locationInfo.f271934i;
                Intent intent4 = new Intent("android.intent.action.VIEW", Uri.parse(String.format("http://maps.google.com/maps?f=d&saddr=%f,%f&daddr=%f,%f&hl=" + str, new Object[]{Double.valueOf(locationInfo2.f271930e), Double.valueOf(locationInfo2.f271931f), Double.valueOf(locationInfo.f271930e), Double.valueOf(locationInfo.f271931f)})));
                Bundle bundle = new Bundle();
                bundle.putParcelable("targetintent", intent4);
                Intent intent5 = new Intent();
                intent5.setClassName(dVar.f261352a, "com.tencent.mm.pluginsdk.ui.tools.AppChooserUI");
                intent5.putExtra("type", 1);
                intent5.putExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE, dVar.f261352a.getResources().getString(C0966R.string.gb4));
                intent5.putExtra("targetintent", intent4);
                intent5.putExtra("transferback", bundle);
                intent5.putExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 6);
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(4099);
                aVar2.mo10233c(intent5);
                C117292a.m165364j((Activity) dVar.f261352a, aVar2.mo10232b(), "com/tencent/mm/plugin/location/ui/MapHelper", "webMap", "(Lcom/tencent/mm/plugin/location/model/LocationInfo;Lcom/tencent/mm/plugin/location/model/LocationInfo;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
            }
        }
    }

    /* renamed from: e */
    public void mo129378e(Bundle bundle) {
        this.f271964w = ((C78085c) C86312j.m106911c(C78085c.class)).mo108056ms();
        LocationInfo locationInfo = this.f271952h;
        LocationInfo locationInfo2 = this.f271951g;
        String currentLanguage = LocaleUtil.getCurrentLanguage(this.f271948d);
        locationInfo2.f271934i = currentLanguage;
        locationInfo.f271934i = currentLanguage;
        C78538u.m94870f(this.f271948d);
        this.f271948d.requestWindowFeature(1);
        this.f271948d.setContentView(mo129362o());
        C85864g1.m106128c(this.f271948d);
        FrameLayout frameLayout = (FrameLayout) mo129360m(C0966R.C0970id.goe);
        this.f271961t = C115562l.vx0(this.f271948d);
        if ((this instanceof C94167s0) || ((C113177k) C86312j.m106911c(C113177k.class)).w00(C113177k.C113179b.LOCAION, (C113177k.C113178a) null)) {
            frameLayout.addView(this.f271961t);
        }
        if (C85875k4.m106211z()) {
            this.f271961t.enableDarkMode();
        } else {
            this.f271961t.disableDarkMode();
        }
        this.f271949e = new C91134d(this.f271948d);
        this.f271953i = new a$$c(this);
        this.f271956o = mo129361n().getStringExtra("kRemark");
        this.f271958q = mo129361n().getStringArrayListExtra("kTags");
        this.f271950f = mo129361n().getIntExtra("map_view_type", 0);
        this.f271962u = System.currentTimeMillis();
        this.f271963v = ((C62251b1) C86312j.m106911c(C62251b1.class)).mo87307uj();
        this.f271982E = mo129361n().getSerializableExtra("key_from_type");
        double doubleExtra = mo129361n().getDoubleExtra("kwebmap_slat", 0.0d);
        double doubleExtra2 = mo129361n().getDoubleExtra("kwebmap_lng", 0.0d);
        Log.m105924i("MicroMsg.ViewMapUI", "start dslat " + doubleExtra + " " + doubleExtra2);
        int intExtra = mo129361n().getIntExtra("kwebmap_scale", 15);
        this.f271959r = intExtra;
        if (intExtra <= 0) {
            this.f271959r = 15;
        }
        this.f271957p = mo129361n().getStringExtra("kPoiName");
        String stringExtra = mo129361n().getStringExtra("Kwebmap_locaion");
        Log.m105918d("MicroMsg.ViewMapUI", "view " + doubleExtra + " " + doubleExtra2);
        LocationInfo locationInfo3 = this.f271951g;
        locationInfo3.f271930e = doubleExtra;
        locationInfo3.f271931f = doubleExtra2;
        locationInfo3.f271933h = stringExtra;
        locationInfo3.f271932g = this.f271959r;
        locationInfo3.f271935j = this.f271957p;
        locationInfo3.f271939q = mo129361n().getBooleanExtra("KIsFromPoiList", false);
        this.f271951g.f271940r = mo129361n().getStringExtra("KPoiCategoryTips");
        this.f271951g.f271941s = mo129361n().getStringExtra("kPoiBusinessHour");
        this.f271951g.f271942t = mo129361n().getStringExtra("KPoiPhone");
        this.f271951g.f271943u = mo129361n().getFloatExtra("KPoiPriceTips", 0.0f);
        this.f271951g.f271938p = mo129361n().getStringExtra("kPoiid");
        this.f271951g.f271944v = mo129361n().getStringExtra("kBuildingID");
        this.f271951g.f271944v = mo129361n().getStringExtra("kFloorName");
        this.f271994y = mo129361n().getLongExtra("kMsgId", -1);
        this.f271960s = mo129361n().getStringExtra("map_talker_name");
        Log.m105918d("MicroMsg.BaseMapUI", "initView");
        this.f271953i.f271974h = (LinearLayout) mo129360m(C0966R.C0970id.eug);
        a$$c a__c = this.f271953i;
        a__c.f271972f = this.f271961t;
        a__c.f271967a = (RelativeLayout) mo129360m(C0966R.C0970id.kmz);
        this.f271953i.f271968b = (ImageView) mo129360m(C0966R.C0970id.kob);
        this.f271953i.f271969c = (ImageButton) mo129360m(C0966R.C0970id.kod);
        this.f271953i.f271970d = mo129360m(C0966R.C0970id.koe);
        this.f271953i.f271971e = (TextView) mo129360m(C0966R.C0970id.f5424er);
        this.f271953i.f271973g = (TextView) mo129360m(C0966R.C0970id.gub);
        this.f271953i.f271972f.getIController().setZoom(C38446c.m41877a(false));
        int i = this.f271950f;
        if (!(i == 0 || i == 3)) {
            this.f271953i.f271969c.setVisibility(0);
            View view = this.f271953i.f271970d;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/location/ui/impl/BaseMapUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/location/ui/impl/BaseMapUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f271953i.f271969c.setEnabled(false);
            this.f271953i.f271969c.setImageResource(C0966R.raw.icons_outlined_more);
        }
        this.f271953i.f271972f.setBuiltInZoomControls(false);
        this.f271953i.f271968b.setOnClickListener(new C94164c(this));
        this.f271953i.f271971e.setOnClickListener(new C4822d(this));
        mo129388z();
        mo129366s(MMApplicationContext.getResources().getColor(C0966R.color.ahf));
        this.f271953i.f271972f.setMapAnchor(0.5f, 0.5f);
    }

    /* renamed from: f */
    public void mo129379f() {
        this.f271978A.mo135260d();
        this.f271989L.removeCallbacks(this.f271990M);
        this.f271989L = null;
        C86709a0.m107524d().mo123470p(v2helper.EMethodSetSpkEnhance, this);
        C77398g gVar = this.f271985H;
        if (gVar != null && gVar.isShowing()) {
            this.f271985H.dismiss();
            this.f271985H = null;
        }
        ProgressDialog progressDialog = this.f271988K;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f271988K = null;
        }
        this.f271955n.mo108055b(this.f271965x);
        this.f271954j.clear();
        Log.m105918d("MicroMsg.BaseMapUI", "destroy");
        this.f271953i.f271972f.destroy();
        System.gc();
    }

    /* renamed from: g */
    public boolean mo129380g(int i, KeyEvent keyEvent) {
        C77407n nVar = this.f271980C;
        if (nVar == null || !nVar.mo107563h()) {
            mo129368A();
            this.f271980C.mo107573q();
            return true;
        }
        this.f271980C.mo107572p();
        return true;
    }

    /* renamed from: h */
    public void mo129381h() {
        Log.m105918d("MicroMsg.ViewMapUI", "onbaseGeoResume");
        C92411b bVar = this.f271964w;
        if (bVar != null) {
            bVar.mo126408b(this.f271986I);
        }
        C34861g1.m40517a(false, new Intent().putExtra("classname", getClass().getName()));
    }

    /* renamed from: i */
    public void mo129382i() {
        C34861g1.m40517a(true, new Intent().putExtra("classname", getClass().getName()));
        Log.m105918d("MicroMsg.ViewMapUI", "onbaseGeoResume");
        C92411b bVar = this.f271964w;
        if (bVar != null) {
            bVar.mo126412f(this.f271986I, true);
        }
    }

    /* renamed from: j */
    public void mo129357j() {
        Intent intent = new Intent();
        this.f271949e.getClass();
        intent.putExtra("kopenGmapNums", 0);
        this.f271949e.getClass();
        intent.putExtra("kopenOthersNums", 0);
        this.f271949e.getClass();
        intent.putExtra("kopenreportType", -1);
        intent.putExtra("kRemark", Util.nullAs(this.f271956o, ""));
        intent.putExtra("soso_street_view_url", this.f271995z);
        this.f271948d.setResult(-1, intent);
    }

    /* renamed from: k */
    public void mo129358k() {
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105919d("MicroMsg.ViewMapUI", "onScene end %d %d %d", Integer.valueOf(yVar.getType()), Integer.valueOf(i), Integer.valueOf(i2));
        if (yVar.getType() != 424) {
            Log.m105921e("MicroMsg.ViewMapUI", "msg failed.errtype:%d, errcode:%d", Integer.valueOf(i), Integer.valueOf(i2));
        } else if (i2 == 0 && i == 0) {
            C32223f fVar = (C32223f) C86312j.m106911c(C32223f.class);
            ((C32222e) yVar).mo58537h();
            throw null;
        }
    }

    /* renamed from: u */
    public boolean mo129383u(LocationInfo locationInfo) {
        if (this.f271953i.f271972f.getIController() == null || !C101715i.m133627d(locationInfo.f271930e, locationInfo.f271931f)) {
            return false;
        }
        this.f271953i.f271972f.getIController().animateTo(locationInfo.f271930e, locationInfo.f271931f);
        return true;
    }

    /* renamed from: v */
    public final Intent mo129384v() {
        Intent intent = new Intent();
        intent.putExtra("kfavorite", true);
        this.f271949e.getClass();
        intent.putExtra("kopenGmapNums", 0);
        this.f271949e.getClass();
        intent.putExtra("kopenOthersNums", 0);
        this.f271949e.getClass();
        intent.putExtra("kopenreportType", -1);
        intent.putExtra("kRemark", Util.nullAs(this.f271956o, ""));
        intent.putExtra("kwebmap_slat", this.f271951g.f271930e);
        intent.putExtra("kwebmap_lng", this.f271951g.f271931f);
        intent.putExtra("Kwebmap_locaion", this.f271951g.f271933h);
        intent.putExtra("kPoiName", this.f271957p);
        intent.putExtra("kPoiid", this.f271951g.f271938p);
        intent.putExtra("KIsFromPoiList", this.f271951g.f271939q);
        intent.putExtra("KPoiCategoryTips", this.f271951g.f271940r);
        intent.putExtra("kPoiBusinessHour", this.f271951g.f271941s);
        intent.putExtra("KPoiPhone", this.f271951g.f271942t);
        intent.putExtra("KPoiPriceTips", this.f271951g.f271943u);
        intent.putExtra("kBuildingID", this.f271951g.f271944v);
        intent.putExtra("kFloorName", this.f271951g.f271945w);
        return intent;
    }

    /* renamed from: w */
    public final void mo129385w(C100755z zVar) {
        zVar.field_flag = 0;
        zVar.field_updateTime = System.currentTimeMillis();
        zVar.field_localId = -1;
        zVar.field_sourceType = 6;
        C101835rd0 rd02 = zVar.field_favProto.f298616d;
        if (rd02 != null) {
            rd02.mo141278n("");
            zVar.field_favProto.f298616d.mo141277m(6);
            zVar.field_favProto.f298616d.mo141275k(C75592q0.m90789s());
        }
        zVar.field_fromUser = C75592q0.m90789s();
        LinkedList linkedList = new LinkedList();
        C101834rc0 rc02 = new C101834rc0();
        C101841sc0 sc02 = new C101841sc0();
        sc02.f299406e = zVar.field_favProto.f298620h;
        rc02.f299296c1 = sc02;
        rc02.mo141228A("WeNote_0");
        rc02.mo141260p(6);
        linkedList.add(0, rc02);
        zVar.field_favProto.mo141211f(linkedList);
        zVar.field_type = 18;
        zVar.field_xml = C100755z.m131907w2(zVar);
    }

    /* renamed from: x */
    public void mo129386x() {
        if (this.f271981D) {
            C6684b2.m6985a(((C8464j) C86312j.m106911c(C8464j.class)).do0());
            Intent intent = new Intent();
            intent.putExtra("show_bottom", false);
            intent.putExtra("jsapi_args_appid", "wx751a1acca5688ba3");
            intent.putExtra("rawUrl", this.f271995z);
            intent.putExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE, C0966R.string.ibz);
            intent.putExtra("webview_bg_color_rsID", C0966R.color.f3131gg);
            C88144b.m109791i(this.f271948d, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, (Bundle) null);
        }
    }

    /* renamed from: y */
    public final void mo129387y(Context context, C100755z zVar, boolean z, C101811md0 md02) {
        NotifyWNNoteOperationEvent notifyWNNoteOperationEvent = new NotifyWNNoteOperationEvent();
        NotifyWNNoteOperationEvent.C92535a aVar = notifyWNNoteOperationEvent.f264942d;
        aVar.field_localId = zVar.field_localId;
        aVar.f264954k = 5;
        aVar.f264945b = zVar.field_xml;
        aVar.f264947d = context;
        Bundle bundle = new Bundle();
        C77911cd0 cd02 = zVar.field_favProto.f298608G;
        if (cd02 != null) {
            bundle.putString("noteauthor", cd02.f227115d);
            bundle.putString("noteeditor", cd02.f227116e);
        }
        bundle.putLong("edittime", zVar.field_updateTime);
        NotifyWNNoteOperationEvent.C92535a aVar2 = notifyWNNoteOperationEvent.f264942d;
        aVar2.f264951h = bundle;
        aVar2.field_favProto = zVar.field_favProto;
        aVar2.f264944a = 2;
        aVar2.f264955l = z;
        aVar2.f264956m = md02;
        notifyWNNoteOperationEvent.publish();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001d, code lost:
        r0 = r13.f271982E;
     */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo129388z() {
        /*
            r13 = this;
            com.tencent.mm.plugin.location.ui.impl.a$$c r0 = r13.f271953i
            android.widget.TextView r0 = r0.f271971e
            r1 = 1
            r0.setEnabled(r1)
            boolean r0 = r13.mo129364q()
            r2 = 0
            r3 = -1
            if (r0 == 0) goto L_0x0029
            android.content.Intent r0 = r13.mo129361n()
            java.lang.String r4 = "intent_map_key"
            int r0 = r0.getIntExtra(r4, r3)
            r4 = 4
            if (r0 != r4) goto L_0x0029
            java.io.Serializable r0 = r13.f271982E
            ht1.w3$a r4 = ht1.C98522w3.C8810a.FINDER_POI_FROM_TYPE_FINDER
            if (r0 == r4) goto L_0x0027
            ht1.w3$a r4 = ht1.C98522w3.C8810a.FINDER_POI_FROM_TYPE_SNS
            if (r0 != r4) goto L_0x0029
        L_0x0027:
            r0 = 1
            goto L_0x002a
        L_0x0029:
            r0 = 0
        L_0x002a:
            r13.f271983F = r0
            if (r0 != 0) goto L_0x0033
            com.tencent.mm.plugin.location.model.LocationInfo r0 = r13.f271951g
            r13.mo129383u(r0)
        L_0x0033:
            com.tencent.mm.plugin.location.ui.impl.a$$c r0 = r13.f271953i
            y22.e r0 = r0.f271972f
            y22.c r0 = r0.getIController()
            int r4 = r13.f271959r
            r0.setZoom(r4)
            com.tencent.mm.plugin.location.ui.impl.a$$c r0 = r13.f271953i
            android.widget.ImageButton r0 = r0.f271969c
            r0.setEnabled(r1)
            android.content.Intent r0 = r13.mo129361n()
            java.lang.String r4 = "kShowshare"
            boolean r0 = r0.getBooleanExtra(r4, r1)
            r4 = 8
            if (r0 == 0) goto L_0x005e
            com.tencent.mm.plugin.location.ui.impl.a$$c r0 = r13.f271953i
            android.widget.ImageButton r0 = r0.f271969c
            r0.setVisibility(r2)
            goto L_0x0065
        L_0x005e:
            com.tencent.mm.plugin.location.ui.impl.a$$c r0 = r13.f271953i
            android.widget.ImageButton r0 = r0.f271969c
            r0.setVisibility(r4)
        L_0x0065:
            android.content.Intent r0 = r13.mo129361n()
            java.lang.String r5 = "soso_street_view_url"
            java.lang.String r0 = r0.getStringExtra(r5)
            r13.f271995z = r0
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0087
            boolean r0 = com.tencent.p014mm.sdk.platformtools.LocaleUtil.isTraditionalChineseAppLang()
            if (r0 != 0) goto L_0x0084
            boolean r0 = com.tencent.p014mm.sdk.platformtools.LocaleUtil.isSimplifiedChineseAppLang()
            if (r0 == 0) goto L_0x0087
        L_0x0084:
            r13.f271981D = r1
            goto L_0x0095
        L_0x0087:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.LocaleUtil.isTraditionalChineseAppLang()
            if (r0 != 0) goto L_0x0093
            boolean r0 = com.tencent.p014mm.sdk.platformtools.LocaleUtil.isSimplifiedChineseAppLang()
            if (r0 == 0) goto L_0x0095
        L_0x0093:
            r13.f271981D = r2
        L_0x0095:
            com.tencent.mm.plugin.location.ui.impl.a$$c r0 = r13.f271953i
            android.widget.ImageButton r0 = r0.f271969c
            com.tencent.mm.plugin.location.ui.impl.b1$$i r5 = new com.tencent.mm.plugin.location.ui.impl.b1$$i
            r5.<init>(r13)
            r0.setOnClickListener(r5)
            x22.u r0 = new x22.u
            com.tencent.mm.plugin.location.ui.impl.a$$c r5 = r13.f271953i
            y22.e r5 = r5.f271972f
            android.app.Activity r6 = r13.f271948d
            r0.<init>(r5, r6, r2)
            r13.f271979B = r0
            com.tencent.mm.plugin.location_soso.ViewManager r7 = r0.f301961p
            r5 = 0
            if (r7 == 0) goto L_0x00c5
            android.widget.ImageView r8 = r0.f301957i
            r9 = 0
            r11 = 0
            r7.addView(r8, r9, r11)
            com.tencent.mm.plugin.location_soso.ViewManager r6 = r0.f301961p
            android.widget.ImageView r0 = r0.f301957i
            java.lang.String r7 = "info_window_tag"
            r6.setMarkerTag(r0, r7)
        L_0x00c5:
            boolean r0 = r13.f271983F
            java.lang.String r6 = "MicroMsg.ViewMapUI"
            r7 = 2
            if (r0 != 0) goto L_0x010c
            x22.u r0 = r13.f271979B
            com.tencent.mm.plugin.location.model.LocationInfo r8 = r13.f271951g
            r0.getClass()
            double r9 = r8.f271930e
            r0.f301953e = r9
            double r8 = r8.f271931f
            r0.f301954f = r8
            com.tencent.mm.plugin.location.model.LocationInfo r0 = r13.f271951g
            double r8 = r0.f271930e
            double r10 = r0.f271931f
            boolean r0 = t22.C101715i.m133627d(r8, r10)
            if (r0 != 0) goto L_0x010c
            java.lang.Object[] r0 = new java.lang.Object[r7]
            com.tencent.mm.plugin.location.model.LocationInfo r8 = r13.f271951g
            double r8 = r8.f271930e
            java.lang.Double r8 = java.lang.Double.valueOf(r8)
            r0[r2] = r8
            com.tencent.mm.plugin.location.model.LocationInfo r8 = r13.f271951g
            double r8 = r8.f271931f
            java.lang.Double r8 = java.lang.Double.valueOf(r8)
            r0[r1] = r8
            java.lang.String r8 = "isValidLatLng %f %f"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r8, r0)
            x22.u r0 = r13.f271979B
            r0.f301952d = r2
            android.widget.FrameLayout r0 = r0.f301958j
            r0.setVisibility(r4)
        L_0x010c:
            int r0 = r13.f271950f
            if (r7 != r0) goto L_0x0194
            java.lang.Object[] r0 = new java.lang.Object[r1]
            com.tencent.mm.plugin.location.model.LocationInfo r4 = r13.f271951g
            java.lang.String r4 = r4.f271929d
            r0[r2] = r4
            java.lang.String r4 = "location id %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r4, r0)
            android.content.Intent r0 = r13.mo129361n()
            java.lang.String r4 = "kFavCanRemark"
            boolean r0 = r0.getBooleanExtra(r4, r1)
            if (r0 == 0) goto L_0x0183
            boolean r0 = r13.mo129364q()
            if (r0 != 0) goto L_0x0183
            com.tencent.mm.plugin.location.ui.impl.a$$c r0 = r13.f271953i
            android.widget.RelativeLayout r0 = r0.f271967a
            r0.removeAllViews()
            android.app.Activity r0 = r13.f271948d
            r4 = 2131496307(0x7f0c0d73, float:1.8616175E38)
            android.view.View r0 = android.view.View.inflate(r0, r4, r5)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r5 = -2
            r4.<init>(r3, r5)
            com.tencent.mm.plugin.location.ui.impl.a$$c r3 = r13.f271953i
            android.widget.RelativeLayout r3 = r3.f271967a
            r3.addView(r0, r4)
            com.tencent.mm.plugin.location.ui.impl.a$$c r3 = r13.f271953i
            r4 = 2131308090(0x7f092e3a, float:1.8234426E38)
            android.view.View r4 = r0.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r3.f271975i = r4
            com.tencent.mm.plugin.location.ui.impl.a$$c r3 = r13.f271953i
            android.widget.TextView r3 = r3.f271975i
            com.tencent.mm.plugin.location.ui.impl.a$$a r4 = new com.tencent.mm.plugin.location.ui.impl.a$$a
            r4.<init>(r13)
            r3.setOnClickListener(r4)
            com.tencent.mm.plugin.location.ui.impl.a$$c r3 = r13.f271953i
            r4 = 2131308095(0x7f092e3f, float:1.8234436E38)
            android.view.View r0 = r0.findViewById(r4)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.f271976j = r0
            com.tencent.mm.plugin.location.ui.impl.a$$c r0 = r13.f271953i
            android.widget.TextView r0 = r0.f271976j
            com.tencent.mm.plugin.location.ui.impl.b r3 = new com.tencent.mm.plugin.location.ui.impl.b
            r3.<init>(r13)
            r0.setOnClickListener(r3)
            r13.mo129365r()
        L_0x0183:
            com.tencent.mm.plugin.location.model.LocationInfo r0 = r13.f271951g
            java.lang.String r0 = r0.f271933h
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0194
            com.tencent.mm.plugin.location.ui.impl.a$$c r0 = r13.f271953i
            android.widget.RelativeLayout r0 = r0.f271967a
            r0.setVisibility(r2)
        L_0x0194:
            java.util.HashMap<java.lang.String, x22.b> r0 = r13.f271954j
            com.tencent.mm.plugin.location.model.LocationInfo r3 = r13.f271951g
            java.lang.String r3 = r3.f271929d
            x22.u r4 = r13.f271979B
            r0.put(r3, r4)
            com.tencent.mm.plugin.location.model.LocationInfo r0 = r13.f271951g
            java.lang.String r3 = r0.f271933h
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 == 0) goto L_0x01b2
            java.lang.String r0 = r0.f271935j
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x01b2
            r1 = 0
        L_0x01b2:
            if (r1 == 0) goto L_0x01e4
            java.lang.String r0 = r13.f271957p
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x01c6
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01c6
            x22.u r0 = r13.f271979B
            java.lang.String r2 = r13.f271957p
            r0.f301960o = r2
        L_0x01c6:
            x22.u r0 = r13.f271979B
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            x22.u r3 = r13.f271979B
            r3.getClass()
            r2.append(r1)
            com.tencent.mm.plugin.location.model.LocationInfo r1 = r13.f271951g
            java.lang.String r1 = r1.f271933h
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.setText(r1)
            goto L_0x0206
        L_0x01e4:
            com.tencent.mm.plugin.location.model.LocationInfo r0 = r13.f271951g
            double r1 = r0.f271930e
            double r3 = r0.f271931f
            boolean r0 = t22.C101715i.m133627d(r1, r3)
            if (r0 == 0) goto L_0x0206
            ts.d r0 = new ts.d
            com.tencent.mm.plugin.location.model.LocationInfo r1 = r13.f271951g
            double r2 = r1.f271930e
            double r4 = r1.f271931f
            r0.<init>(r2, r4)
            java.lang.String r1 = r1.f271929d
            r0.f354674f = r1
            ts.b r1 = r13.f271955n
            ts.b$a r2 = r13.f271965x
            r1.mo108054a(r0, r2)
        L_0x0206:
            x22.u r0 = r13.f271979B
            r0.getClass()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.location.p069ui.impl.C94163b1.mo129388z():void");
    }
}
