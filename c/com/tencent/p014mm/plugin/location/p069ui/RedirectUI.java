package com.tencent.p014mm.plugin.location.p069ui;

import android.content.Intent;
import android.os.Bundle;
import bp3.C79758p;
import com.tencent.p014mm.autogen.events.PublishLocationEvent;
import com.tencent.p014mm.autogen.events.SendMsgEvent;
import com.tencent.p014mm.autogen.events.TalkRoomUitlEvent;
import com.tencent.p014mm.hellhoundlib.activities.HellActivity;
import com.tencent.p014mm.plugin.location_soso.SoSoProxyUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.location.LocationIntent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f12.C7970a;
import f40.C86709a0;
import ht1.C98522w3;
import java.io.Serializable;
import lc3.C10485b;
import nj3.C88989a;
import oa1.C117731d;
import p216op.C11702e;
import p680ru.C101464l;
import p763ym.C79140q;
import s22.C77611a;
import sf0.C90188n0;
import t22.C77832s;
import tf3.C101877q;

@C88989a(23)
/* renamed from: com.tencent.mm.plugin.location.ui.RedirectUI */
public class RedirectUI extends HellActivity {

    /* renamed from: o */
    public static final /* synthetic */ int f198753o = 0;

    /* renamed from: d */
    public int f198754d = 0;

    /* renamed from: e */
    public double f198755e = 0.0d;

    /* renamed from: f */
    public double f198756f = 0.0d;

    /* renamed from: g */
    public String f198757g = "";

    /* renamed from: h */
    public int f198758h = 0;

    /* renamed from: i */
    public String f198759i = "";

    /* renamed from: j */
    public int f198760j;

    /* renamed from: n */
    public final MMHandler f198761n = new MMHandler();

    /* renamed from: com.tencent.mm.plugin.location.ui.RedirectUI$a */
    public class C69120a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Intent f198762d;

        /* renamed from: e */
        public final /* synthetic */ double f198763e;

        /* renamed from: f */
        public final /* synthetic */ double f198764f;

        public C69120a(Intent intent, double d, double d2) {
            this.f198762d = intent;
            this.f198763e = d;
            this.f198764f = d2;
        }

        public void run() {
            RedirectUI redirectUI = RedirectUI.this;
            Intent intent = this.f198762d;
            double d = this.f198763e;
            double d2 = this.f198764f;
            int i = RedirectUI.f198753o;
            redirectUI.mo95228E7(intent, d, d2);
        }
    }

    /* renamed from: E7 */
    public final void mo95228E7(Intent intent, double d, double d2) {
        if (intent != null) {
            intent.putExtra("kShowshare", getIntent().getBooleanExtra("kShowshare", true));
            intent.putExtra("kimg_path", C7970a.m8127a());
            intent.putExtra("kPoi_url", Util.nullAs(getIntent().getStringExtra("kPoi_url"), ""));
            intent.putExtra("map_view_type", getIntent().getIntExtra("map_view_type", 0));
            intent.putExtra("map_indoor_support", getIntent().getIntExtra("map_indoor_support", 0));
            intent.putExtra("kFavInfoLocalId", getIntent().getLongExtra("kFavInfoLocalId", -1));
            intent.putExtra("kFavCanDel", getIntent().getBooleanExtra("kFavCanDel", true));
            intent.putExtra("kFavCanRemark", getIntent().getBooleanExtra("kFavCanRemark", true));
            intent.putExtra("kwebmap_slat", d);
            intent.putExtra("kwebmap_lng", d2);
            intent.putExtra("kPoiid", getIntent().getStringExtra("kPoiid"));
            intent.putExtra("KIsFromPoiList", getIntent().getBooleanExtra("KIsFromPoiList", false));
            intent.putExtra("KPoiCategoryTips", getIntent().getStringExtra("KPoiCategoryTips"));
            intent.putExtra("kPoiBusinessHour", getIntent().getStringExtra("kPoiBusinessHour"));
            intent.putExtra("KPoiPhone", getIntent().getStringExtra("KPoiPhone"));
            intent.putExtra("KPoiPriceTips", getIntent().getFloatExtra("KPoiPriceTips", 0.0f));
            intent.putExtra("kBuildingID", getIntent().getStringExtra("kBuildingID"));
            intent.putExtra("kFloorName", getIntent().getStringExtra("kFloorName"));
            intent.putExtra("kPoiName", getIntent().getStringExtra("kPoiName"));
            intent.putExtra("kisUsername", Util.nullAs(getIntent().getStringExtra("kisUsername"), ""));
            intent.putExtra("map_talker_name", this.f198757g);
            intent.putExtra("KFavLocSigleView", getIntent().getBooleanExtra("KFavLocSigleView", false));
            TalkRoomUitlEvent talkRoomUitlEvent = new TalkRoomUitlEvent();
            talkRoomUitlEvent.f193954d.f193955a = true;
            talkRoomUitlEvent.publish();
            int i = this.f198754d;
            if (i == 6) {
                intent.putExtra("kMsgId", getIntent().getLongExtra("kMsgId", -1));
                intent.putExtra("kRemark", getIntent().getStringExtra("kRemark"));
                int i2 = this.f198758h;
                if (i2 > 0) {
                    intent.putExtra("kwebmap_scale", i2);
                }
                intent.putExtra("Kwebmap_locaion", this.f198759i);
                intent.putExtra("soso_street_view_url", getIntent().getStringExtra("soso_street_view_url"));
                startActivityForResult(intent, 3);
            } else if (i == 1 || i == 2 || i == 12 || i == 13 || i == 11 || i == 7 || i == 9 || i == 10) {
                intent.putExtra("kMsgId", getIntent().getLongExtra("kMsgId", -1));
                intent.putExtra("kRemark", getIntent().getStringExtra("kRemark"));
                intent.putExtra("kTags", getIntent().getStringArrayListExtra("kTags"));
                int i3 = this.f198758h;
                if (i3 > 0) {
                    intent.putExtra("kwebmap_scale", i3);
                }
                intent.putExtra("Kwebmap_locaion", this.f198759i);
                intent.putExtra("soso_street_view_url", getIntent().getStringExtra("soso_street_view_url"));
                intent.putExtra("key_fav_search_report_obj", getIntent().getByteArrayExtra("key_fav_search_report_obj"));
                startActivityForResult(intent, 3);
            } else if (i == 0) {
                startActivityForResult(intent, 2);
            } else if (i == 3) {
                startActivityForResult(intent, 5);
            } else if (i == 8) {
                intent.putExtra("KPickPoiLat", d);
                intent.putExtra("KPickPoiLong", d2);
                startActivityForResult(intent, 6);
            }
        } else {
            finish();
        }
    }

    /* renamed from: F7 */
    public void mo95229F7(double d, double d2) {
        Serializable serializableExtra = getIntent().getSerializableExtra("key_from_type");
        Intent intent = new Intent(this, SoSoProxyUI.class);
        C101877q qVar = new C101877q();
        boolean z = false;
        if (((!(C117731d.m166007c().mo182440a(qVar) == 1 || C79758p.f233760a.mo109883f(qVar) == 1)) || (serializableExtra == null)) || !serializableExtra.equals(C98522w3.C8810a.FINDER_POI_FROM_TYPE_FINDER)) {
            intent.addFlags(67108864);
        }
        intent.putExtra("type_tag", getIntent().getIntExtra("type_tag", 0));
        intent.putExtra("key_geo_coder_four_level", getIntent().getBooleanExtra("key_geo_coder_four_level", false));
        intent.putExtra("type_pick_location_btn", getIntent().getIntExtra("type_pick_location_btn", 1));
        intent.putExtra("key_drawer_allow_no_poiid", getIntent().getBooleanExtra("key_drawer_allow_no_poiid", false));
        intent.putExtra("key_drawer_expend", getIntent().getBooleanExtra("key_drawer_expend", false));
        intent.putExtra("key_from_type", getIntent().getSerializableExtra("key_from_type"));
        intent.putExtra("key_context_id", getIntent().getStringExtra("key_context_id"));
        switch (this.f198754d) {
            case 0:
            case 3:
            case 8:
                StringBuilder sb = new StringBuilder();
                sb.append("view poi isHidePoiOversea : ");
                if (Util.getInt(((C10485b) C86709a0.m107533q(C10485b.class)).g50().mo72508a(1, "ShowConfig", "hidePoiOversea"), 1) == 1) {
                    z = true;
                }
                Log.m105918d("MicroMsg.ConfigListDecoder", "isHidePoiOversea : " + z);
                sb.append(z);
                Log.m105918d("MicroMsg.RedirectUI", sb.toString());
                intent.putExtra("intent_map_key", 2);
                break;
            case 1:
            case 2:
            case 7:
            case 10:
            case 11:
            case 12:
            case 13:
                Log.m105918d("MicroMsg.RedirectUI", "view normal");
                intent.putExtra("intent_map_key", 4);
                break;
            case 6:
                String stringExtra = getIntent().getStringExtra("fromWhereShare");
                Log.m105918d("MicroMsg.RedirectUI", "location resume");
                intent.putExtra("intent_map_key", 5);
                if (!Util.isNullOrNil(stringExtra)) {
                    intent.putExtra("fromWhereShare", stringExtra);
                    break;
                }
                break;
            case 9:
                intent.putExtra("intent_map_key", 4);
                break;
            default:
                Log.m105918d("MicroMsg.RedirectUI", "view type error");
                intent = null;
                break;
        }
        if (this.f198754d == 0) {
            intent.putExtra("location_scene", 1);
        }
        if (C90188n0.f258933a) {
            this.f198761n.postDelayed(new C69120a(intent, d, d2), 2000);
        } else {
            mo95228E7(intent, d, d2);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Intent intent2;
        int i3;
        RedirectUI redirectUI = this;
        int i4 = i;
        int i5 = i2;
        Intent intent3 = intent;
        Log.m105924i("MicroMsg.RedirectUI", "onAcvityResult requestCode:" + i4);
        if (i5 != -1) {
            finish();
        } else if (intent3 == null) {
            finish();
        } else {
            String str = "";
            if (i4 != 2) {
                if (i4 == 5) {
                    LocationIntent locationIntent = (LocationIntent) intent3.getParcelableExtra("KLocationIntent");
                    Log.m105924i("MicroMsg.RedirectUI", "locationintent " + locationIntent.mo100133a());
                    if (locationIntent.f211463n == 3) {
                        C115669n.INSTANCE.mo160131h(10822, 1, locationIntent.f211462j, 1);
                    } else {
                        C115669n.INSTANCE.mo160131h(10822, 1, locationIntent.f211462j, 0);
                    }
                    intent3.putExtra("kwebmap_slat", locationIntent.f211456d);
                    intent3.putExtra("kwebmap_lng", locationIntent.f211457e);
                    intent3.putExtra("kwebmap_scale", locationIntent.f211458f);
                    intent3.putExtra("Kwebmap_locaion", locationIntent.f211459g);
                    intent3.putExtra("kTags", intent3.getStringArrayListExtra("kTags"));
                    if (!locationIntent.f211460h.equals(str)) {
                        str = locationIntent.f211460h;
                    }
                    intent3.putExtra("kPoiName", str);
                    intent3.putExtra("kPoiid", locationIntent.f211465p);
                    intent3.putExtra("kNearByPoiid", locationIntent.f211471v);
                    intent3.putExtra("KIsFromPoiList", locationIntent.f211466q);
                    intent3.putExtra("KPoiCategoryTips", locationIntent.f211467r);
                    intent3.putExtra("kPoiBusinessHour", locationIntent.f211468s);
                    intent3.putExtra("KPoiPhone", locationIntent.f211469t);
                    intent3.putExtra("KPoiPriceTips", locationIntent.f211470u);
                } else if (i4 == 6) {
                    LocationIntent locationIntent2 = (LocationIntent) intent3.getParcelableExtra("KLocationIntent");
                    Log.m105924i("MicroMsg.RedirectUI", "locationintent " + locationIntent2.mo100133a());
                    if (locationIntent2.f211464o != null) {
                        Log.m105918d("MicroMsg.RedirectUI", "addr: " + locationIntent2.f211464o.toString());
                    }
                    intent3.putExtra("key_pick_addr", locationIntent2.f211464o);
                }
                i3 = i5;
                intent2 = intent3;
            } else {
                String str2 = redirectUI.f198757g;
                LocationIntent locationIntent3 = (LocationIntent) intent3.getParcelableExtra("KLocationIntent");
                Log.m105924i("MicroMsg.RedirectUI", "locationintent " + locationIntent3.mo100133a());
                PublishLocationEvent publishLocationEvent = new PublishLocationEvent();
                PublishLocationEvent.C67758a aVar = publishLocationEvent.f193834d;
                aVar.f193836a = redirectUI.f198760j;
                aVar.f193837b = locationIntent3.f211456d;
                aVar.f193838c = locationIntent3.f211457e;
                aVar.f193839d = locationIntent3.f211458f;
                aVar.f193840e = locationIntent3.f211459g;
                aVar.f193841f = locationIntent3.f211460h;
                aVar.f193842g = locationIntent3.f211472w;
                aVar.f193843h = locationIntent3.f211473x;
                publishLocationEvent.publish();
                String str3 = locationIntent3.f211465p;
                if (Util.isNullOrNil(str3) && !Util.isNullOrNil(locationIntent3.f211471v)) {
                    str3 = locationIntent3.f211471v;
                }
                double d = locationIntent3.f211456d;
                double d2 = locationIntent3.f211457e;
                int i6 = locationIntent3.f211458f;
                String str4 = locationIntent3.f211459g;
                String str5 = locationIntent3.f211460h;
                String str6 = locationIntent3.f211461i;
                String str7 = str;
                boolean z = locationIntent3.f211466q;
                String str8 = locationIntent3.f211467r;
                String str9 = locationIntent3.f211468s;
                String str10 = locationIntent3.f211469t;
                String str11 = str2;
                float f = locationIntent3.f211470u;
                String str12 = "MicroMsg.RedirectUI";
                String str13 = locationIntent3.f211472w;
                String str14 = locationIntent3.f211473x;
                if (str5 == null) {
                    str5 = str7;
                }
                if (str8 == null) {
                    str8 = str7;
                }
                if (str9 == null) {
                    str9 = str7;
                }
                if (str10 == null) {
                    str10 = str7;
                }
                String str15 = "<msg><location x=\"" + d + "\" y=\"" + d2 + "\" scale=\"" + i6 + "\" label=\"" + Util.escapeStringForXml(str4) + "\" poiname=\"" + Util.escapeStringForXml(str5) + "\" infourl=\"" + Util.escapeStringForXml(str6) + "\" maptype=\"" + 0 + "\" poiid=\"" + str3 + "\" isFromPoiList=\"" + z + "\" poiCategoryTips=\"" + str8 + "\" poiBusinessHour=\"" + str9 + "\" poiPhone=\"" + str10 + "\" poiPriceTips=\"" + f + "\" buildingId=\"" + str13 + "\" floorName=\"" + str14 + "\" /></msg>";
                Log.m105918d(str12, "xml " + str15);
                SendMsgEvent sendMsgEvent = new SendMsgEvent();
                SendMsgEvent.C1132a aVar2 = sendMsgEvent.f9496d;
                aVar2.f9497a = str11;
                aVar2.f9498b = str15;
                aVar2.f9499c = 48;
                aVar2.f9500d = 0;
                sendMsgEvent.publish();
                LocationIntent locationIntent4 = locationIntent3;
                ((C101464l) C86312j.m106911c(C101464l.class)).mo140963f9(2004, (float) locationIntent4.f211457e, (float) locationIntent4.f211456d, 0);
                ((C79140q) C86312j.m106911c(C79140q.class)).Vf0();
                redirectUI = this;
                i3 = i2;
                intent2 = intent;
            }
            redirectUI.setResult(i3, intent2);
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(0);
        if (Util.secondsToNow(Long.valueOf(Util.nullAsNil((Long) C86709a0.m107535s().mo121142i().mo119684e(81938, (Object) null))).longValue()) * 1000 > 86400000) {
            ((C11702e) C86312j.m106911c(C11702e.class)).mo11316k();
        }
        int intExtra = getIntent().getIntExtra("map_view_type", -1);
        this.f198754d = intExtra;
        if (intExtra == -1) {
            finish();
        }
        this.f198757g = getIntent().getStringExtra("map_talker_name");
        Log.m105919d("MicroMsg.RedirectUI", "tofutest type: %s", Integer.valueOf(this.f198754d));
        switch (this.f198754d) {
            case 0:
            case 3:
            case 8:
                getIntent().getStringExtra("map_sender_name");
                getIntent().getIntExtra("view_type_key", 1);
                this.f198760j = getIntent().getIntExtra("key_get_location_type", 0);
                this.f198755e = getIntent().getDoubleExtra("KPickPoiLat", -85.0d);
                double doubleExtra = getIntent().getDoubleExtra("KPickPoiLong", -85.0d);
                this.f198756f = doubleExtra;
                mo95229F7(this.f198755e, doubleExtra);
                return;
            case 1:
            case 2:
            case 7:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                this.f198755e = getIntent().getDoubleExtra("kwebmap_slat", -85.0d);
                this.f198756f = getIntent().getDoubleExtra("kwebmap_lng", -1000.0d);
                this.f198758h = getIntent().getIntExtra("kwebmap_scale", 0);
                this.f198759i = getIntent().getStringExtra("Kwebmap_locaion");
                mo95229F7(this.f198755e, this.f198756f);
                return;
            case 6:
                C77611a d = C77832s.Bx0().mo107951d(this.f198757g);
                StringBuilder sb = new StringBuilder();
                sb.append("resume try to enter trackRoom ");
                sb.append(d != null);
                Log.m105924i("MicroMsg.RedirectUI", sb.toString());
                if (d != null) {
                    double d2 = d.f226270g;
                    this.f198755e = d2;
                    this.f198756f = d.f226269f;
                    this.f198759i = d.f226271h;
                    Log.m105925i("MicroMsg.RedirectUI", "resume lat %f lng %f %s member size %d", Double.valueOf(d2), Double.valueOf(this.f198756f), this.f198759i, Integer.valueOf(d.f226268e.size()));
                    this.f198758h = 0;
                    mo95229F7(this.f198755e, this.f198756f);
                    return;
                }
                mo95229F7(-1000.0d, -1000.0d);
                return;
            default:
                return;
        }
    }
}
