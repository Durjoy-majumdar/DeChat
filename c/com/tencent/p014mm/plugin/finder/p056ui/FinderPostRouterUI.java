package com.tencent.p014mm.plugin.finder.p056ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderPostSelectPageActionStruct;
import com.tencent.p014mm.p136ui.MMFragmentActivity$$c;
import com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileTabUIC;
import com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordMediaReportInfo;
import com.tencent.p014mm.plugin.recordvideo.jumper.VideoCaptureReportInfo;
import com.tencent.p014mm.protocal.protobuf.FinderFeedReportObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import dp1.C58354a2;
import dp1.C58408t0;
import dp1.C58412u0;
import dp1.C58417y0;
import eb0.C31543z5;
import er1.C58684b;
import er1.C58741j5;
import f40.C86709a0;
import gy3.C8480h;
import gy3.C87412m;
import hh2.C8532a;
import ht1.C60200t1;
import ht1.C60206u1;
import java.util.ArrayList;
import java.util.List;
import kg3.C76577a;
import kotlin.Metadata;
import nj3.C76879j;
import nj3.C76912y0;
import nj3.C88989a;
import o40.C61926c;
import p447aw.C103918d;
import p707tz.C65000f;
import rs1.C13442s8;
import sx3.C64197v;
import up1.C37521f;
import zc1.C66785b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderPostRouterUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "Lcom/tencent/mm/plugin/recordvideo/jumper/CaptureDataManager$b;", "<init>", "()V", "a", "plugin-finder-publish_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(7)
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderPostRouterUI */
public final class FinderPostRouterUI extends MMFinderUI implements CaptureDataManager.C94403b {

    /* renamed from: B */
    public static final C56349a f161071B = new C56349a((C8480h) null);

    /* renamed from: A */
    public int f161072A = -1;

    /* renamed from: o */
    public int f161073o = -1;

    /* renamed from: p */
    public boolean f161074p;

    /* renamed from: q */
    public boolean f161075q;

    /* renamed from: r */
    public String f161076r = "";

    /* renamed from: s */
    public String f161077s = "";

    /* renamed from: t */
    public String f161078t = "";

    /* renamed from: u */
    public String f161079u;

    /* renamed from: v */
    public String f161080v;

    /* renamed from: w */
    public String f161081w;

    /* renamed from: x */
    public byte[] f161082x;

    /* renamed from: y */
    public String f161083y;

    /* renamed from: z */
    public boolean f161084z;

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderPostRouterUI$a */
    public static final class C56349a {
        public C56349a(C8480h hVar) {
        }

        /* renamed from: a */
        public final boolean mo79097a(Context context, Intent intent, String str, int i, int i2, String str2, boolean z, int i3) {
            String str3;
            String str4;
            Class cls = C58684b.class;
            Class cls2 = C60200t1.class;
            C87412m.m108594g(context, "context");
            float f = ((float) i2) / ((float) i);
            if (f > ((C60200t1) C86312j.m106911c(cls2)).mo76861l7().mo83784c6() || f < ((C60200t1) C86312j.m106911c(cls2)).mo76861l7().mo83759F5()) {
                C76912y0.makeText(context, (int) C0966R.string.moq, 0).show();
                return false;
            } else if (!C86013q1.m106450k(str)) {
                return false;
            } else {
                Intent intent2 = new Intent();
                if (z && (context instanceof Activity)) {
                    intent2.putExtras(((Activity) context).getIntent());
                }
                intent2.putExtra("post_id", str2);
                intent2.putExtra("edit_id", C86709a0.m107523b().mo121111i() + '_' + Util.nowMilliSecond());
                intent2.putExtra("postType", 4);
                intent2.putExtra("postMediaList", C64197v.m75534c(str));
                intent2.putExtra("postTypeList", C64197v.m75534c(4));
                intent2.putExtra("isLongVideoPost", true);
                C58408t0.f167336a.mo83266l(i3, false);
                if (intent != null) {
                    ((C58684b) C86312j.m106911c(cls)).wy0(intent2, intent);
                    int intExtra = intent.getIntExtra("key_finder_post_sns_video_duration_ms", -1);
                    if (intExtra > 0 && ((long) intExtra) < ((long) (C37521f.f99374d.mo61151E() + 1)) * 1000) {
                        intent2.putExtra("isLongVideoPost", false);
                    }
                }
                ((C58684b) C86312j.m106911c(cls)).Vx0(context, intent2);
                C58354a2 a2Var = C58354a2.f167095a;
                FinderFeedReportObject finderFeedReportObject = C58408t0.f167337b;
                String str5 = "";
                if (finderFeedReportObject == null || (str3 = finderFeedReportObject.clickId) == null) {
                    str3 = str5;
                }
                if (!(finderFeedReportObject == null || (str4 = finderFeedReportObject.postId) == null)) {
                    str5 = str4;
                }
                FinderPostSelectPageActionStruct finderPostSelectPageActionStruct = new FinderPostSelectPageActionStruct();
                finderPostSelectPageActionStruct.f155817d = finderPostSelectPageActionStruct.mo86045b("ClickId", str3, true);
                finderPostSelectPageActionStruct.f155818e = finderPostSelectPageActionStruct.mo86045b("PostId", str5, true);
                long j = (long) 2;
                finderPostSelectPageActionStruct.f155819f = j;
                finderPostSelectPageActionStruct.f155820g = C31543z5.m39453c() / 1000;
                finderPostSelectPageActionStruct.f155821h = j;
                finderPostSelectPageActionStruct.mo86054n();
                ((C58417y0) C86312j.m106911c(C58417y0.class)).Ec0(finderPostSelectPageActionStruct);
                return true;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderPostRouterUI$b */
    public static final class C56350b implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderPostRouterUI f161085d;

        public C56350b(FinderPostRouterUI finderPostRouterUI) {
            this.f161085d = finderPostRouterUI;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            this.f161085d.finish();
            ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7(this.f161085d.getContext());
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderPostRouterUI$c */
    public static final class C56351c implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderPostRouterUI f161086d;

        public C56351c(FinderPostRouterUI finderPostRouterUI) {
            this.f161086d = finderPostRouterUI;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            this.f161086d.finish();
        }
    }

    /* renamed from: N7 */
    public final long mo79095N7() {
        Class cls = C60206u1.class;
        return ((long) (((C60206u1) C86312j.m106911c(cls)).mo60953lE() == 1 ? ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76861l7().mo83778Y5() : ((C60206u1) C86312j.m106911c(cls)).Hl0())) * 1000;
    }

    /* renamed from: O7 */
    public final void mo79096O7() {
        Class cls = C65000f.class;
        boolean z = TextUtils.isEmpty(this.f161081w) && TextUtils.isEmpty(this.f161079u) && TextUtils.isEmpty(this.f161080v) && TextUtils.isEmpty(this.f161083y) && this.f161082x == null;
        boolean hasExtra = getIntent().hasExtra("KEY_POST_VIDEO_TEMPLATE");
        Log.m105924i("Finder.FinderPostRouterUI", "takePhoto canUseTemplatePage:" + z + " isTemplateFollow:" + hasExtra + " enableTemplate:" + ((C65000f) C86312j.m106911c(cls)).mo89170Fk());
        boolean z2 = z && (hasExtra || ((C65000f) C86312j.m106911c(cls)).mo89170Fk());
        RecordConfigProvider Ol = ((C65000f) C86312j.m106911c(cls)).mo89173Ol(z2);
        Bundle bundle = new Bundle();
        Ol.f272912M = bundle;
        bundle.putAll(getIntent().getExtras());
        Ol.f272912M.remove("key_view_info");
        Bundle bundle2 = Ol.f272912M;
        C58741j5 j5Var = C58741j5.f168184a;
        bundle2.putString("output_dir", C58741j5.f168195l);
        Ol.f272912M.putString("FINDER_CONTEXT_ID", this.f161077s);
        Ol.f272912M.putString("FINDER_SESSION_ID", this.f161078t);
        Ol.f272912M.putString("key_click_tab_context_id", getIntent().getStringExtra("key_click_tab_context_id"));
        Ol.f272912M.putString("post_id", this.f161076r);
        Ol.f272912M.putString("KEY_ORIGIN_MUSIC_ID", this.f161081w);
        Ol.f272912M.putString("KEY_ORIGIN_MUSIC_PATH", this.f161079u);
        Ol.f272912M.putString("KEY_ORIGIN_MUSIC_NAME", this.f161080v);
        Ol.f272912M.putByteArray("KEY_ORIGIN_MUSIC_INFO", this.f161082x);
        Ol.f272912M.putString("KEY_ORIGIN_BGM_URL", this.f161083y);
        Ol.f272912M.putBoolean("KEY_BGM_IF_ORIGIN", this.f161084z);
        if (hasExtra) {
            Ol.f272912M.putByteArray("KEY_POST_VIDEO_TEMPLATE", getIntent().getByteArrayExtra("KEY_POST_VIDEO_TEMPLATE"));
        }
        boolean z3 = getIntent().getIntExtra("key_activity_camera_position", 1) == 2;
        Log.m105924i("Finder.FinderPostRouterUI", "takePhoto use front camera:" + z3);
        if (z2) {
            ((C65000f) C86312j.m106911c(cls)).mo89189ec(this, String.valueOf(hashCode()), true ^ z3);
        }
        long longExtra = getIntent().getLongExtra("key_ref_feed_id", 0);
        int intExtra = getIntent().getIntExtra("key_ref_comment_scene", 0);
        if (Ol.f272908I == null) {
            Ol.f272908I = new VideoCaptureReportInfo();
        }
        VideoCaptureReportInfo videoCaptureReportInfo = Ol.f272908I;
        if (videoCaptureReportInfo != null) {
            videoCaptureReportInfo.f272944h = longExtra;
        }
        if (videoCaptureReportInfo != null) {
            videoCaptureReportInfo.f272943g = intExtra;
        }
        CaptureDataManager.f272890c.f272891a = this;
        C8532a.f27585a.mo9444c(this, 233, C0966R.C0968anim.f2492eg, C0966R.C0968anim.f2493eh, Ol);
    }

    /* renamed from: U5 */
    public void mo79064U5(boolean z, RecordMediaReportInfo recordMediaReportInfo, Bundle bundle) {
        C87412m.m108594g(recordMediaReportInfo, "reportInfo");
        C87412m.m108594g(bundle, "extData");
        C58408t0.f167336a.mo83257c(recordMediaReportInfo);
    }

    public int getLayoutId() {
        return -1;
    }

    /* renamed from: i2 */
    public void mo4197i2(Context context, CaptureDataManager.CaptureVideoNormalModel captureVideoNormalModel, Bundle bundle) {
        Context context2 = context;
        CaptureDataManager.CaptureVideoNormalModel captureVideoNormalModel2 = captureVideoNormalModel;
        Bundle bundle2 = bundle;
        C87412m.m108594g(context2, "context");
        C87412m.m108594g(captureVideoNormalModel2, "model");
        C87412m.m108594g(bundle2, "extData");
        Log.m105924i("Finder.FinderPostRouterUI", "onMediaGenerated");
        this.f161075q = false;
        Intent intent = getIntent();
        ArrayList arrayList = (ArrayList) captureVideoNormalModel.mo129798a().mo129811b("KEY_IMAGE_QUALITY_INT_ARRAY", new ArrayList());
        byte[] byteArray = bundle2.getByteArray("MEDIA_EXTRA_MUSIC");
        if (byteArray != null) {
            intent.putExtra("MEDIA_EXTRA_MUSIC", byteArray);
        }
        byte[] byteArray2 = bundle2.getByteArray("ORIGIN_MUSIC_INFO");
        if (byteArray2 != null) {
            intent.putExtra("ORIGIN_MUSIC_INFO", byteArray2);
        }
        C61926c.m72684i(intent, bundle2, "ORIGIN_MUSIC_ID");
        C61926c.m72684i(intent, bundle2, "ORIGIN_MUSIC_PATH");
        C61926c.m72684i(intent, bundle2, "ORIGIN_BGM_URL");
        Intent intent2 = intent;
        Bundle bundle3 = bundle;
        C61926c.m72679d(intent2, bundle3, "MEDIA_IS_MUTE", false, 4, (Object) null);
        C61926c.m72679d(intent2, bundle3, "MUSIC_IS_MUTE", false, 4, (Object) null);
        C61926c.m72681f(intent2, bundle3, "SOUND_TRACK_TYPE", 0, 4, (Object) null);
        C61926c.m72684i(intent, bundle2, "MUSIC_FEED_ID");
        if (!intent.hasExtra("key_topic_id")) {
            Intent intent3 = intent;
            Bundle bundle4 = bundle;
            C61926c.m72682g(intent3, bundle4, "key_topic_id", 0, 4, (Object) null);
            C61926c.m72681f(intent3, bundle4, "key_activity_type", 0, 4, (Object) null);
            C61926c.m72684i(intent, bundle2, "key_user_name");
            C61926c.m72684i(intent, bundle2, "key_nick_name");
            C61926c.m72684i(intent, bundle2, "key_avatar_url");
            C61926c.m72684i(intent, bundle2, "key_cover_url");
            C61926c.m72682g(intent, bundle4, "key_activity_display_mask", 0, 4, (Object) null);
            C61926c.m72684i(intent, bundle2, "key_activity_name");
            C61926c.m72684i(intent, bundle2, "key_activity_desc");
            C61926c.m72682g(intent, bundle4, "key_activity_end_time", 0, 4, (Object) null);
        }
        ArrayList parcelableArrayList = bundle2.getParcelableArrayList("KEY_POST_HALF_RECT_LIST");
        if (parcelableArrayList != null) {
            intent.putExtra("KEY_POST_HALF_RECT_LIST", parcelableArrayList);
        }
        byte[] byteArray3 = bundle2.getByteArray("KEY_POST_VIDEO_TEMPLATE");
        if (byteArray3 != null) {
            intent.putExtra("KEY_POST_VIDEO_TEMPLATE", byteArray3);
        }
        List<String> list = captureVideoNormalModel2.f272899j;
        if (!(list == null || list.isEmpty())) {
            intent.putExtra("postType", 2);
            intent.putExtra("postMediaList", new ArrayList(captureVideoNormalModel2.f272899j));
            List<String> list2 = captureVideoNormalModel2.f272899j;
            C87412m.m108593f(list2, "model.multiImagePath");
            ArrayList arrayList2 = new ArrayList();
            for (String str : list2) {
                arrayList2.add(2);
            }
            intent.putExtra("postTypeList", arrayList2);
            if (arrayList != null && arrayList.size() == captureVideoNormalModel2.f272899j.size()) {
                intent.putExtra("key_post_media_quality_list", arrayList);
            }
            C61926c.m72683h(intent, bundle2, "KEY_POST_HALF_IMAGE_LIST");
        } else {
            Boolean bool = captureVideoNormalModel2.f272897h;
            C87412m.m108593f(bool, "model.photo");
            if (bool.booleanValue()) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(captureVideoNormalModel2.f272895f);
                intent.putExtra("postType", 2);
                intent.putExtra("postMediaList", arrayList3);
                if (arrayList != null && arrayList.size() == 1) {
                    intent.putExtra("key_post_media_quality_list", arrayList);
                }
            } else {
                if (bundle2.getByteArray("video_composition") != null) {
                    intent.putExtra("video_composition", bundle2.getByteArray("video_composition"));
                    intent.putExtra("postThumbList", C64197v.m75534c(captureVideoNormalModel2.f272895f));
                } else {
                    ArrayList arrayList4 = new ArrayList();
                    arrayList4.add(captureVideoNormalModel2.f272894e);
                    intent.putExtra("postMediaList", arrayList4);
                }
                intent.putExtra("postType", 4);
            }
        }
        intent.putExtra("KEY_POST_FROM_CAMERA", true);
        intent.putExtra("post_id", this.f161076r);
        intent.putExtra("edit_id", (String) captureVideoNormalModel.mo129798a().mo129811b("KEY_MULTI_MEDIA_EDIT_ID_STRING", ""));
        ((C58684b) C86312j.m106911c(C58684b.class)).Vx0(context2, intent);
        if (getIntent().getBooleanExtra("KEY_FINDER_POST_MUSIC_NEED_FINISH", false)) {
            setResult(-1);
            finish();
        }
        C58408t0 t0Var = C58408t0.f167336a;
        RecordMediaReportInfo a = captureVideoNormalModel.mo129798a();
        C87412m.m108593f(a, "model.reportInfo");
        t0Var.mo83258d(a);
    }

    /* renamed from: l1 */
    public boolean mo4198l1(Context context, Bundle bundle, CaptureDataManager.C94402a aVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(bundle, "extData");
        C87412m.m108594g(aVar, "finishController");
        return false;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        RecordMediaReportInfo recordMediaReportInfo;
        byte[] byteArray;
        byte[] byteArray2;
        Class cls = C58684b.class;
        super.onActivityResult(i, i2, intent);
        Log.m105924i("Finder.FinderPostRouterUI", "onActivityResult requestCode:" + i + " resultCode:" + i2);
        if (i == 233) {
            if (i2 == 0) {
                Log.m105924i("Finder.FinderPostRouterUI", "record cancel");
                if (!(intent == null || (recordMediaReportInfo = (RecordMediaReportInfo) intent.getParcelableExtra("report")) == null)) {
                    C58408t0.f167336a.mo83258d(recordMediaReportInfo);
                }
                FinderFeedReportObject finderFeedReportObject = C58408t0.f167337b;
                if (finderFeedReportObject != null) {
                    finderFeedReportObject.exitPageId = 1;
                    FinderFeedReportObject finderFeedReportObject2 = C58408t0.f167337b;
                    if (finderFeedReportObject2 != null) {
                        C61926c.m72661F("Finder.FinderPostReportLogic", new C58412u0(finderFeedReportObject2, false));
                    }
                }
            }
            finish();
            overridePendingTransition(0, 0);
        } else if (i == 292) {
            if (i2 != -1) {
                finish();
                overridePendingTransition(MMFragmentActivity$$c.f318646c, MMFragmentActivity$$c.f318647d);
                return;
            }
            C87412m.m108591d(intent);
            Parcelable parcelableExtra = intent.getParcelableExtra("KSEGMENTMEDIAINFO");
            C87412m.m108591d(parcelableExtra);
            CaptureDataManager.CaptureVideoNormalModel captureVideoNormalModel = (CaptureDataManager.CaptureVideoNormalModel) parcelableExtra;
            Intent intent2 = new Intent();
            Bundle bundle = CaptureDataManager.f272890c.f272892b;
            if (!(bundle == null || (byteArray2 = bundle.getByteArray("MEDIA_EXTRA_MUSIC")) == null)) {
                intent2.putExtra("MEDIA_EXTRA_MUSIC", byteArray2);
            }
            if (!(bundle == null || (byteArray = bundle.getByteArray("ORIGIN_MUSIC_INFO")) == null)) {
                intent2.putExtra("ORIGIN_MUSIC_INFO", byteArray);
            }
            C61926c.m72684i(intent2, bundle, "ORIGIN_MUSIC_ID");
            C61926c.m72684i(intent2, bundle, "ORIGIN_MUSIC_PATH");
            C61926c.m72684i(intent2, bundle, "ORIGIN_BGM_URL");
            Intent intent3 = intent2;
            Bundle bundle2 = bundle;
            C61926c.m72679d(intent3, bundle2, "MEDIA_IS_MUTE", false, 4, (Object) null);
            C61926c.m72679d(intent3, bundle2, "MUSIC_IS_MUTE", false, 4, (Object) null);
            C61926c.m72681f(intent3, bundle2, "SOUND_TRACK_TYPE", 0, 4, (Object) null);
            C61926c.m72684i(intent2, bundle, "MUSIC_FEED_ID");
            List<String> list = captureVideoNormalModel.f272899j;
            if (list == null || list.size() <= 0) {
                Bundle bundleExtra = intent.getBundleExtra("key_extra_data");
                C87412m.m108591d(bundleExtra);
                byte[] byteArray3 = bundleExtra.getByteArray("video_composition");
                if (byteArray3 != null) {
                    intent2.putExtra("video_composition", byteArray3);
                }
                intent2.putExtra("postType", 4);
                intent2.putExtra("postMediaList", C64197v.m75534c(captureVideoNormalModel.f272894e));
                intent2.putExtra("postTypeList", C64197v.m75534c(4));
                intent2.putExtra("postThumbList", C64197v.m75534c(captureVideoNormalModel.f272895f));
                intent2.putExtra("KEY_POST_HALF_RECT_LIST", intent.getParcelableArrayListExtra("KEY_POST_HALF_RECT_LIST"));
                C58408t0.f167336a.mo83266l(5, false);
            } else {
                ArrayList arrayList = (ArrayList) captureVideoNormalModel.mo129798a().mo129811b("KEY_IMAGE_QUALITY_INT_ARRAY", new ArrayList());
                intent2.putExtra("postType", 2);
                List<String> list2 = captureVideoNormalModel.f272899j;
                C87412m.m108593f(list2, "model.multiImagePath");
                ArrayList arrayList2 = new ArrayList();
                for (String add : list2) {
                    arrayList2.add(add);
                }
                intent2.putExtra("postMediaList", arrayList2);
                List<String> list3 = captureVideoNormalModel.f272899j;
                C87412m.m108593f(list3, "model.multiImagePath");
                ArrayList arrayList3 = new ArrayList();
                for (String str : list3) {
                    arrayList3.add(2);
                }
                intent2.putExtra("postTypeList", arrayList3);
                intent2.putExtra("postThumbList", C64197v.m75534c(captureVideoNormalModel.f272895f));
                if (arrayList != null && arrayList.size() == captureVideoNormalModel.f272899j.size()) {
                    intent2.putExtra("key_post_media_quality_list", arrayList);
                }
                C61926c.m72683h(intent2, CaptureDataManager.f272890c.f272892b, "KEY_POST_HALF_IMAGE_LIST");
            }
            intent2.putExtra("post_id", this.f161076r);
            intent2.putExtra("edit_id", (String) captureVideoNormalModel.mo129798a().mo129811b("KEY_MULTI_MEDIA_EDIT_ID_STRING", ""));
            C61926c.m72684i(intent2, CaptureDataManager.f272890c.f272892b, "KEY_POST_ORIGIN_FILE_PATH");
            ((C58684b) C86312j.m106911c(cls)).wy0(intent2, getIntent());
            intent2.putExtra("key_context_id", getIntent().getStringExtra("key_context_id"));
            intent2.putExtra("saveDesc", getIntent().getStringExtra("saveDesc"));
            intent2.putExtra("KEY_SNS_SERVER_FEED_ID", getIntent().getLongExtra("KEY_SNS_SERVER_FEED_ID", 0));
            intent2.putExtra("KEY_SNS_LOCAL_FEED_ID", getIntent().getLongExtra("KEY_SNS_LOCAL_FEED_ID", 0));
            intent2.putExtra("saveLocation", getIntent().getBooleanExtra("saveLocation", false));
            intent2.putExtra("get_poi_name", getIntent().getStringExtra("get_poi_name"));
            intent2.putExtra("get_city", getIntent().getStringExtra("get_city"));
            intent2.putExtra("get_lat", getIntent().getFloatExtra("get_lat", 0.0f));
            intent2.putExtra("get_lng", getIntent().getFloatExtra("get_lng", 0.0f));
            intent2.putExtra("get_poi_address", getIntent().getStringExtra("get_poi_address"));
            intent2.putExtra("get_poi_classify_id", getIntent().getStringExtra("get_poi_classify_id"));
            ((C58684b) C86312j.m106911c(cls)).Vx0(this, intent2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01c5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r33) {
        /*
            r32 = this;
            r13 = r32
            super.onCreate(r33)
            android.view.Window r0 = r32.getWindow()
            in3.C87773e.m109211d(r0)
            android.content.Intent r0 = r32.getIntent()
            java.lang.String r1 = "key_finder_post_router"
            r2 = -1
            int r0 = r0.getIntExtra(r1, r2)
            r13.f161073o = r0
            android.content.Intent r0 = r32.getIntent()
            java.lang.String r1 = "key_finder_context_id"
            java.lang.String r0 = r0.getStringExtra(r1)
            java.lang.String r2 = ""
            if (r0 != 0) goto L_0x0028
            r0 = r2
        L_0x0028:
            r13.f161077s = r0
            android.content.Intent r0 = r32.getIntent()
            java.lang.String r3 = "key_finder_session_id"
            java.lang.String r0 = r0.getStringExtra(r3)
            if (r0 != 0) goto L_0x0037
            r0 = r2
        L_0x0037:
            r13.f161078t = r0
            android.content.Intent r0 = r32.getIntent()
            java.lang.String r4 = "key_finder_post_id"
            java.lang.String r0 = r0.getStringExtra(r4)
            if (r0 != 0) goto L_0x0065
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            f40.e r5 = f40.C86709a0.m107523b()
            java.lang.String r5 = r5.mo121111i()
            r0.append(r5)
            r5 = 95
            r0.append(r5)
            long r5 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r0.append(r5)
            java.lang.String r0 = r0.toString()
        L_0x0065:
            r13.f161076r = r0
            android.content.Intent r0 = r32.getIntent()
            java.lang.String r5 = "KEY_FINDER_POST_ORIGIN_MUSIC_ID"
            java.lang.String r0 = r0.getStringExtra(r5)
            r13.f161081w = r0
            android.content.Intent r0 = r32.getIntent()
            java.lang.String r6 = "KEY_FINDER_POST_ORIGIN_MUSIC_PATH"
            java.lang.String r0 = r0.getStringExtra(r6)
            r13.f161079u = r0
            android.content.Intent r0 = r32.getIntent()
            java.lang.String r7 = "KEY_FINDER_POST_ORIGIN_MUSIC_NAME"
            java.lang.String r0 = r0.getStringExtra(r7)
            r13.f161080v = r0
            android.content.Intent r0 = r32.getIntent()
            java.lang.String r8 = "KEY_FINDER_POST_ORIGIN_MUSIC_INFO"
            byte[] r0 = r0.getByteArrayExtra(r8)
            r13.f161082x = r0
            android.content.Intent r0 = r32.getIntent()
            java.lang.String r9 = "KEY_FINDER_POST_ORIGIN_BGM_URL"
            java.lang.String r0 = r0.getStringExtra(r9)
            r13.f161083y = r0
            android.content.Intent r0 = r32.getIntent()
            java.lang.String r10 = "KEY_FINDER_POST_BGM_IF_ORIGIN"
            r11 = 0
            boolean r0 = r0.getBooleanExtra(r10, r11)
            r13.f161084z = r0
            dp1.t0 r0 = dp1.C58408t0.f167336a
            java.lang.String r12 = r13.f161076r
            r14 = 0
            r0.mo83265k(r12, r14)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r15 = "router "
            r12.append(r15)
            int r15 = r13.f161073o
            r12.append(r15)
            java.lang.String r12 = r12.toString()
            java.lang.String r15 = "Finder.FinderPostRouterUI"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r12)
            java.lang.Class<tz.f> r12 = p707tz.C65000f.class
            java.lang.Class<er1.b> r16 = er1.C58684b.class
            int r14 = r13.f161073o
            java.lang.String r11 = "context"
            r18 = r0
            java.lang.String r0 = "getService(ActivityRouter::class.java)"
            r19 = r11
            java.lang.String r11 = "getContext()"
            r21 = r12
            r12 = 1
            switch(r14) {
                case 1: goto L_0x067e;
                case 2: goto L_0x0652;
                case 3: goto L_0x05c2;
                case 4: goto L_0x05b3;
                case 5: goto L_0x05ae;
                case 6: goto L_0x02df;
                case 7: goto L_0x02b7;
                case 8: goto L_0x00e6;
                case 9: goto L_0x028b;
                case 10: goto L_0x0236;
                case 11: goto L_0x00e6;
                case 12: goto L_0x00e6;
                case 13: goto L_0x00e6;
                case 14: goto L_0x01d6;
                case 15: goto L_0x00e6;
                case 16: goto L_0x0125;
                case 17: goto L_0x0106;
                default: goto L_0x00e6;
            }
        L_0x00e6:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "invalid router "
            r0.append(r1)
            int r1 = r13.f161073o
            r0.append(r1)
            java.lang.String r1 = ", finish"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r0)
            r32.finish()
            goto L_0x06b7
        L_0x0106:
            r13.f161075q = r12
            fp1.a r0 = fp1.C59266a.f169452a
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject r1 = dp1.C58408t0.f167337b
            if (r1 == 0) goto L_0x0114
            java.lang.String r1 = r1.flowId
            if (r1 != 0) goto L_0x0113
            goto L_0x0114
        L_0x0113:
            r2 = r1
        L_0x0114:
            fp1.c r1 = fp1.C59267b.f169456d
            r0.mo84410b(r2, r1)
            r32.mo79096O7()
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject r0 = dp1.C58408t0.f167337b
            if (r0 == 0) goto L_0x06b7
            r1 = 2
            r0.videoSource = r1
            goto L_0x06b7
        L_0x0125:
            android.content.Intent r0 = r32.getIntent()
            r3 = 0
            java.lang.String r1 = "key_topic_id"
            long r3 = r0.getLongExtra(r1, r3)
            android.content.Intent r0 = r32.getIntent()
            java.lang.String r1 = "KEY_FINDER_POST_MUSIC_INFO"
            byte[] r0 = r0.getByteArrayExtra(r1)
            android.content.Intent r1 = r32.getIntent()
            java.lang.String r5 = "KEY_FINDER_POST_MUSIC_FEEDID"
            java.lang.String r1 = r1.getStringExtra(r5)
            te3.td1 r5 = new te3.td1
            r5.<init>()
            if (r0 != 0) goto L_0x014d
            goto L_0x015d
        L_0x014d:
            r5.parseFrom(r0)     // Catch:{ Exception -> 0x0151 }
            goto L_0x015e
        L_0x0151:
            r0 = move-exception
            r5 = r0
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r6 = 0
            r0[r6] = r5
            java.lang.String r5 = "safeParser"
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r5, r2, r0)
        L_0x015d:
            r5 = 0
        L_0x015e:
            android.content.Intent r0 = r32.getIntent()
            if (r5 == 0) goto L_0x0167
            java.lang.String r6 = r5.f185546s
            goto L_0x0168
        L_0x0167:
            r6 = 0
        L_0x0168:
            if (r6 == 0) goto L_0x0173
            int r6 = r6.length()
            if (r6 != 0) goto L_0x0171
            goto L_0x0173
        L_0x0171:
            r6 = 0
            goto L_0x0174
        L_0x0173:
            r6 = 1
        L_0x0174:
            if (r6 == 0) goto L_0x01a0
            if (r1 == 0) goto L_0x0181
            int r6 = r1.length()
            if (r6 != 0) goto L_0x017f
            goto L_0x0181
        L_0x017f:
            r6 = 0
            goto L_0x0182
        L_0x0181:
            r6 = 1
        L_0x0182:
            if (r6 != 0) goto L_0x0185
            goto L_0x01a0
        L_0x0185:
            java.lang.Class<da0.e> r1 = da0.C58247e.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            da0.e r1 = (da0.C58247e) r1
            com.tencent.mm.plugin.finder.ui.h2 r6 = new com.tencent.mm.plugin.finder.ui.h2
            r6.<init>(r0, r13)
            r2 = r32
            r5 = r0
            r1.mo82986Zk(r2, r3, r5, r6)
            java.lang.String r0 = "start mj flutter page"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r0)
            goto L_0x06b7
        L_0x01a0:
            java.lang.Class<da0.e> r3 = da0.C58247e.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            da0.e r3 = (da0.C58247e) r3
            if (r1 == 0) goto L_0x01bc
            int r4 = r1.length()
            if (r4 <= 0) goto L_0x01b2
            r11 = 1
            goto L_0x01b3
        L_0x01b2:
            r11 = 0
        L_0x01b3:
            if (r11 == 0) goto L_0x01b6
            goto L_0x01b7
        L_0x01b6:
            r1 = 0
        L_0x01b7:
            if (r1 != 0) goto L_0x01ba
            goto L_0x01bc
        L_0x01ba:
            r2 = r1
            goto L_0x01c6
        L_0x01bc:
            if (r5 == 0) goto L_0x01c1
            java.lang.String r14 = r5.f185546s
            goto L_0x01c2
        L_0x01c1:
            r14 = 0
        L_0x01c2:
            if (r14 != 0) goto L_0x01c5
            goto L_0x01c6
        L_0x01c5:
            r2 = r14
        L_0x01c6:
            com.tencent.mm.plugin.finder.ui.g2 r1 = new com.tencent.mm.plugin.finder.ui.g2
            r1.<init>(r0, r13)
            r3.ii0(r13, r2, r0, r1)
            java.lang.String r0 = "start mj flutter music page"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r0)
            goto L_0x06b7
        L_0x01d6:
            android.content.Intent r0 = r32.getIntent()
            java.lang.String r2 = r13.f161077s
            r0.putExtra(r1, r2)
            android.content.Intent r0 = r32.getIntent()
            java.lang.String r1 = r13.f161078t
            r0.putExtra(r3, r1)
            android.content.Intent r0 = r32.getIntent()
            java.lang.String r1 = r13.f161076r
            r0.putExtra(r4, r1)
            android.content.Intent r0 = r32.getIntent()
            java.lang.String r1 = r13.f161081w
            r0.putExtra(r5, r1)
            android.content.Intent r0 = r32.getIntent()
            java.lang.String r1 = r13.f161079u
            r0.putExtra(r6, r1)
            android.content.Intent r0 = r32.getIntent()
            java.lang.String r1 = r13.f161080v
            r0.putExtra(r7, r1)
            android.content.Intent r0 = r32.getIntent()
            byte[] r1 = r13.f161082x
            r0.putExtra(r8, r1)
            android.content.Intent r0 = r32.getIntent()
            java.lang.String r1 = r13.f161083y
            r0.putExtra(r9, r1)
            android.content.Intent r0 = r32.getIntent()
            boolean r1 = r13.f161084z
            r0.putExtra(r10, r1)
            di3.d r0 = di3.C86312j.m106911c(r16)
            er1.b r0 = (er1.C58684b) r0
            android.content.Intent r1 = r32.getIntent()
            r0.sy0(r13, r1)
            goto L_0x06b7
        L_0x0236:
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            java.lang.String r1 = r13.f161076r
            r3.putExtra(r4, r1)
            java.lang.String r1 = r13.f161081w
            r3.putExtra(r5, r1)
            java.lang.String r1 = r13.f161079u
            r3.putExtra(r6, r1)
            java.lang.String r1 = r13.f161080v
            r3.putExtra(r7, r1)
            byte[] r1 = r13.f161082x
            r3.putExtra(r8, r1)
            java.lang.String r1 = r13.f161083y
            r3.putExtra(r9, r1)
            boolean r1 = r13.f161084z
            r3.putExtra(r10, r1)
            java.lang.String r1 = "KEY_FINDER_POST_FORM_FLUTTER"
            r3.putExtra(r1, r12)
            di3.d r1 = di3.C86312j.m106911c(r16)
            er1.b r1 = (er1.C58684b) r1
            android.content.Intent r2 = r32.getIntent()
            r1.wy0(r3, r2)
            di3.d r1 = di3.C86312j.m106911c(r16)
            gy3.C87412m.m108593f(r1, r0)
            er1.b r1 = (er1.C58684b) r1
            r4 = 0
            r5 = 0
            r6 = 12
            r7 = 0
            r2 = r32
            er1.C58684b.Ux0(r1, r2, r3, r4, r5, r6, r7)
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject r0 = dp1.C58408t0.f167337b
            if (r0 == 0) goto L_0x06b7
            r0.videoSource = r12
            goto L_0x06b7
        L_0x028b:
            android.content.Intent r1 = r32.getIntent()
            r2 = 536870912(0x20000000, float:1.0842022E-19)
            r1.addFlags(r2)
            android.content.Intent r1 = r32.getIntent()
            r2 = 67108864(0x4000000, float:1.5046328E-36)
            r1.addFlags(r2)
            di3.d r1 = di3.C86312j.m106911c(r16)
            gy3.C87412m.m108593f(r1, r0)
            er1.b r1 = (er1.C58684b) r1
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            gy3.C87412m.m108593f(r0, r11)
            android.content.Intent r2 = r32.getIntent()
            r3 = 0
            r1.vx0(r0, r2, r3)
            goto L_0x06b7
        L_0x02b7:
            android.content.Intent r0 = r32.getIntent()
            r1 = 536870912(0x20000000, float:1.0842022E-19)
            r0.addFlags(r1)
            android.content.Intent r0 = r32.getIntent()
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            r0.addFlags(r1)
            di3.d r0 = di3.C86312j.m106911c(r16)
            er1.b r0 = (er1.C58684b) r0
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            gy3.C87412m.m108593f(r1, r11)
            android.content.Intent r2 = r32.getIntent()
            r0.F50(r1, r2)
            goto L_0x06b7
        L_0x02df:
            android.content.Intent r0 = r32.getIntent()
            java.lang.String r1 = "key_finder_sns_post_type"
            r2 = 0
            int r0 = r0.getIntExtra(r1, r2)
            if (r0 == r12) goto L_0x054f
            r1 = 4
            java.lang.String r2 = "KEY_PREVIEW_HEIGHT"
            java.lang.String r3 = "KEY_PREVIEW_WIDTH"
            java.lang.String r4 = "baseContext"
            java.lang.String r5 = "media_list"
            java.lang.String r6 = "key_finder_post_sns_video_path"
            r7 = 2
            if (r0 == r7) goto L_0x0407
            r7 = 3
            if (r0 == r7) goto L_0x03c7
            if (r0 == r1) goto L_0x0304
            r32.finish()
            goto L_0x06b7
        L_0x0304:
            java.lang.Class<ht1.u1> r0 = ht1.C60206u1.class
            android.content.Intent r1 = r32.getIntent()
            java.lang.String r6 = "key_finder_post_sns_photo_path_list"
            java.util.ArrayList r1 = r1.getParcelableArrayListExtra(r6)
            di3.d r6 = di3.C86312j.m106911c(r21)
            tz.f r6 = (p707tz.C65000f) r6
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r6 = r6.mo89172Oj()
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>()
            r7.putParcelableArrayList(r5, r1)
            android.graphics.Point r1 = com.tencent.p014mm.p136ui.C85875k4.m106184h(r32)
            er1.j4 r5 = er1.C58739j4.f168176a
            android.content.Context r8 = r32.getBaseContext()
            gy3.C87412m.m108593f(r8, r4)
            int r4 = r1.x
            int r1 = r1.y
            rx3.o r1 = r5.mo83709g(r8, r4, r1)
            android.graphics.Point r4 = new android.graphics.Point
            B r5 = r1.f38558e
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            C r1 = r1.f38559f
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r4.<init>(r5, r1)
            int r1 = r4.x
            r7.putInt(r3, r1)
            int r1 = r4.y
            r7.putInt(r2, r1)
            java.lang.String r1 = er1.C58741j5.f168195l
            java.lang.String r2 = "output_dir"
            r7.putString(r2, r1)
            long r1 = r32.mo79095N7()
            java.lang.String r3 = "video_max_duration"
            r7.putLong(r3, r1)
            long r1 = r32.mo79095N7()
            java.lang.String r3 = "video_track_max_duration"
            r7.putLong(r3, r1)
            di3.d r1 = di3.C86312j.m106911c(r0)
            ht1.u1 r1 = (ht1.C60206u1) r1
            int r1 = r1.mo60950Yw()
            java.lang.String r2 = "image_max_height"
            r7.putInt(r2, r1)
            di3.d r1 = di3.C86312j.m106911c(r0)
            ht1.u1 r1 = (ht1.C60206u1) r1
            int r1 = r1.mo60943Ab()
            java.lang.String r2 = "image_max_width"
            r7.putInt(r2, r1)
            di3.d r0 = di3.C86312j.m106911c(r0)
            ht1.u1 r0 = (ht1.C60206u1) r0
            int r0 = r0.rh0()
            java.lang.String r1 = "image_compress_quality"
            r7.putInt(r1, r0)
            android.content.Intent r0 = r32.getIntent()
            java.lang.String r1 = "KEY_SHOW_FINDER_ACTION_BAR_TITLE"
            r2 = 0
            boolean r0 = r0.getBooleanExtra(r1, r2)
            r7.putBoolean(r1, r0)
            r6.f272912M = r7
            hh2.a r18 = hh2.C8532a.f27585a
            androidx.appcompat.app.AppCompatActivity r19 = r32.getContext()
            r20 = 292(0x124, float:4.09E-43)
            r21 = 2130772182(0x7f0100d6, float:1.7147475E38)
            r22 = 2130772185(0x7f0100d9, float:1.7147481E38)
            r24 = 3
            r25 = 0
            r23 = r6
            r18.mo9446e(r19, r20, r21, r22, r23, r24, r25)
            goto L_0x06b7
        L_0x03c7:
            android.content.Intent r0 = r32.getIntent()
            java.lang.String r0 = r0.getStringExtra(r6)
            di3.d r1 = di3.C86312j.m106911c(r21)
            tz.f r1 = (p707tz.C65000f) r1
            com.tencent.mm.plugin.sight.base.a r1 = r1.tg0(r0)
            com.tencent.mm.plugin.finder.ui.FinderPostRouterUI$a r22 = f161071B
            androidx.appcompat.app.AppCompatActivity r2 = r32.getContext()
            r11 = r19
            gy3.C87412m.m108593f(r2, r11)
            android.content.Intent r24 = r32.getIntent()
            int r3 = r1.f273445c
            int r1 = r1.f273446d
            java.lang.String r4 = r13.f161076r
            r29 = 0
            r30 = 7
            r23 = r2
            r25 = r0
            r26 = r3
            r27 = r1
            r28 = r4
            r22.mo79097a(r23, r24, r25, r26, r27, r28, r29, r30)
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject r0 = dp1.C58408t0.f167337b
            if (r0 == 0) goto L_0x06b7
            r0.videoSource = r12
            goto L_0x06b7
        L_0x0407:
            android.content.Intent r0 = r32.getIntent()
            java.lang.String r25 = r0.getStringExtra(r6)
            r22 = 2
            r23 = 0
            java.lang.String r26 = ""
            java.lang.String r27 = ""
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r0 = com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem.m65488c(r22, r23, r25, r26, r27)
            android.content.Intent r6 = r32.getIntent()
            java.lang.String r7 = "key_finder_post_sns_video_duration_ms"
            r8 = 0
            int r6 = r6.getIntExtra(r7, r8)
            up1.f r7 = up1.C37521f.f99374d
            r7.getClass()
            pe1.c<java.lang.Integer> r8 = up1.C37521f.f99455m3
            java.lang.Object r8 = r8.mo60266n()
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            if (r8 != r12) goto L_0x04b9
            long r8 = (long) r6
            int r6 = r7.mo61151E()
            int r6 = r6 + r12
            long r6 = (long) r6
            r10 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 * r10
            int r14 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r14 < 0) goto L_0x04b9
            java.lang.Class<ht1.t1> r6 = ht1.C60200t1.class
            di3.d r6 = di3.C86312j.m106911c(r6)
            ht1.t1 r6 = (ht1.C60200t1) r6
            ht1.z4 r6 = r6.mo76861l7()
            int r6 = r6.mo83778Y5()
            long r6 = (long) r6
            long r6 = r6 * r10
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 >= 0) goto L_0x04b9
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r3 = r13.f161076r
            java.lang.String r4 = "post_id"
            r2.putExtra(r4, r3)
            java.lang.String r3 = "postType"
            r2.putExtra(r3, r1)
            java.lang.String[] r3 = new java.lang.String[r12]
            java.lang.String r0 = r0.f162747d
            r4 = 0
            r3[r4] = r0
            java.util.ArrayList r0 = sx3.C64197v.m75534c(r3)
            java.lang.String r3 = "postMediaList"
            r2.putExtra(r3, r0)
            java.lang.Integer[] r0 = new java.lang.Integer[r12]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r4] = r1
            java.util.ArrayList r0 = sx3.C64197v.m75534c(r0)
            java.lang.String r1 = "postTypeList"
            r2.putExtra(r1, r0)
            java.lang.String r0 = "isLongVideoPost"
            r2.putExtra(r0, r12)
            java.lang.String r0 = "KEY_POST_DIRECTLY_FROM_SNS"
            r2.putExtra(r0, r12)
            r0 = 5
            r14 = r18
            r14.mo83266l(r0, r4)
            di3.d r0 = di3.C86312j.m106911c(r16)
            er1.b r0 = (er1.C58684b) r0
            android.content.Intent r1 = r32.getIntent()
            r0.wy0(r2, r1)
            di3.d r0 = di3.C86312j.m106911c(r16)
            er1.b r0 = (er1.C58684b) r0
            r0.Vx0(r13, r2)
            goto L_0x053c
        L_0x04b9:
            di3.d r1 = di3.C86312j.m106911c(r21)
            tz.f r1 = (p707tz.C65000f) r1
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r1 = r1.mo89172Oj()
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem[] r7 = new com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem[r12]
            r8 = 0
            r7[r8] = r0
            java.util.ArrayList r0 = sx3.C64197v.m75534c(r7)
            r6.putParcelableArrayList(r5, r0)
            android.graphics.Point r0 = com.tencent.p014mm.p136ui.C85875k4.m106184h(r32)
            er1.j4 r5 = er1.C58739j4.f168176a
            android.content.Context r7 = r32.getBaseContext()
            gy3.C87412m.m108593f(r7, r4)
            int r4 = r0.x
            int r0 = r0.y
            rx3.o r0 = r5.mo83709g(r7, r4, r0)
            android.graphics.Point r4 = new android.graphics.Point
            B r5 = r0.f38558e
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            C r0 = r0.f38559f
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r4.<init>(r5, r0)
            int r0 = r4.x
            r6.putInt(r3, r0)
            int r0 = r4.y
            r6.putInt(r2, r0)
            long r2 = r32.mo79095N7()
            java.lang.String r0 = "video_max_duration"
            r6.putLong(r0, r2)
            long r2 = r32.mo79095N7()
            java.lang.String r0 = "video_track_max_duration"
            r6.putLong(r0, r2)
            java.lang.String r0 = er1.C58741j5.f168195l
            java.lang.String r2 = "output_dir"
            r6.putString(r2, r0)
            r1.f272912M = r6
            hh2.a r21 = hh2.C8532a.f27585a
            androidx.appcompat.app.AppCompatActivity r22 = r32.getContext()
            r23 = 292(0x124, float:4.09E-43)
            r24 = 2130772182(0x7f0100d6, float:1.7147475E38)
            r25 = 2130772185(0x7f0100d9, float:1.7147481E38)
            r27 = 4
            r28 = 0
            r26 = r1
            r21.mo9446e(r22, r23, r24, r25, r26, r27, r28)
        L_0x053c:
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r1 = 20694(0x50d6, float:2.8998E-41)
            java.lang.Object[] r2 = new java.lang.Object[r12]
            r3 = 2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 0
            r2[r4] = r3
            r0.mo160131h(r1, r2)
            goto L_0x06b7
        L_0x054f:
            di3.d r0 = di3.C86312j.m106911c(r16)
            er1.b r0 = (er1.C58684b) r0
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            r2 = 41
            java.lang.String r3 = "key_from_comment_scene"
            r1.putExtra(r3, r2)
            rx3.b0 r2 = rx3.C13598b0.f38549a
            r0.getClass()
            java.lang.Class<com.tencent.mm.plugin.finder.feed.ui.FinderSnsGridFeedUI> r0 = com.tencent.p014mm.plugin.finder.feed.p052ui.FinderSnsGridFeedUI.class
            r1.setClass(r13, r0)
            k20.a r0 = new k20.a
            r0.<init>()
            r0.mo10233c(r1)
            java.lang.Object[] r2 = r0.mo10232b()
            java.lang.String r3 = "com/tencent/mm/plugin/finder/utils/ActivityRouter"
            java.lang.String r4 = "enterFinderSnsGridFeedUI"
            java.lang.String r5 = "(Landroid/content/Context;Landroid/content/Intent;)V"
            java.lang.String r6 = "Undefined"
            java.lang.String r7 = "startActivity"
            java.lang.String r8 = "(Landroid/content/Intent;)V"
            r1 = r32
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            r1 = 0
            java.lang.Object r0 = r0.mo10231a(r1)
            android.content.Intent r0 = (android.content.Intent) r0
            r13.startActivity(r0)
            java.lang.String r2 = "com/tencent/mm/plugin/finder/utils/ActivityRouter"
            java.lang.String r3 = "enterFinderSnsGridFeedUI"
            java.lang.String r4 = "(Landroid/content/Context;Landroid/content/Intent;)V"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "startActivity"
            java.lang.String r7 = "(Landroid/content/Intent;)V"
            r1 = r32
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
            int r0 = com.tencent.p014mm.p136ui.MMFragmentActivity$$c.f318644a
            int r1 = com.tencent.p014mm.p136ui.MMFragmentActivity$$c.f318645b
            r13.overridePendingTransition(r0, r1)
            goto L_0x06b7
        L_0x05ae:
            r32.finish()
            goto L_0x06b7
        L_0x05b3:
            di3.d r0 = di3.C86312j.m106911c(r16)
            er1.b r0 = (er1.C58684b) r0
            android.content.Intent r1 = r32.getIntent()
            r0.Fx0(r13, r1)
            goto L_0x06b7
        L_0x05c2:
            r14 = r18
            r11 = r19
            android.content.Intent r15 = new android.content.Intent
            r15.<init>()
            java.lang.String r2 = r13.f161077s
            r15.putExtra(r1, r2)
            java.lang.String r1 = r13.f161078t
            r15.putExtra(r3, r1)
            java.lang.String r1 = r13.f161076r
            r15.putExtra(r4, r1)
            java.lang.String r1 = r13.f161081w
            r15.putExtra(r5, r1)
            java.lang.String r1 = r13.f161079u
            r15.putExtra(r6, r1)
            java.lang.String r1 = r13.f161080v
            r15.putExtra(r7, r1)
            byte[] r1 = r13.f161082x
            r15.putExtra(r8, r1)
            java.lang.String r1 = r13.f161083y
            r15.putExtra(r9, r1)
            boolean r1 = r13.f161084z
            r15.putExtra(r10, r1)
            android.content.Intent r1 = r32.getIntent()
            java.lang.String r2 = "key_maas_entrance"
            r3 = 0
            int r1 = r1.getIntExtra(r2, r3)
            r15.putExtra(r2, r1)
            di3.d r1 = di3.C86312j.m106911c(r16)
            er1.b r1 = (er1.C58684b) r1
            android.content.Intent r2 = r32.getIntent()
            r1.wy0(r15, r2)
            rs1.s8$a r1 = rs1.C13442s8.f38060Q0
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r17 = 252(0xfc, float:3.53E-43)
            r18 = 0
            r2 = r32
            r3 = r15
            r31 = r11
            r11 = r17
            r13 = 1
            r12 = r18
            rs1.C13442s8.C13443a.m12791e(r1, r2, r3, r4, r6, r7, r8, r9, r10, r11, r12)
            di3.d r1 = di3.C86312j.m106911c(r16)
            gy3.C87412m.m108593f(r1, r0)
            er1.b r1 = (er1.C58684b) r1
            r4 = 0
            r5 = 0
            r6 = 12
            r7 = 0
            er1.C58684b.Ux0(r1, r2, r3, r4, r5, r6, r7)
            r14.mo83260f(r13)
            androidx.appcompat.app.AppCompatActivity r0 = r32.getContext()
            r1 = r31
            gy3.C87412m.m108593f(r0, r1)
            r1 = 64
            r14.mo83263i(r0, r1)
            r13 = r32
            goto L_0x06b7
        L_0x0652:
            r14 = r18
            r1 = r19
            r3 = 1
            r13.f161075q = r3
            fp1.a r0 = fp1.C59266a.f169452a
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject r3 = dp1.C58408t0.f167337b
            if (r3 == 0) goto L_0x0665
            java.lang.String r3 = r3.flowId
            if (r3 != 0) goto L_0x0664
            goto L_0x0665
        L_0x0664:
            r2 = r3
        L_0x0665:
            fp1.c r3 = fp1.C59267b.f169456d
            r0.mo84410b(r2, r3)
            r32.mo79096O7()
            r0 = 2
            r14.mo83260f(r0)
            androidx.appcompat.app.AppCompatActivity r0 = r32.getContext()
            gy3.C87412m.m108593f(r0, r1)
            r1 = 63
            r14.mo83263i(r0, r1)
            goto L_0x06b7
        L_0x067e:
            r3 = 1
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            zc1.b r1 = zc1.C66785b.f191882e
            java.lang.String r1 = r1.mo90662O5()
            java.lang.String r2 = "finder_username"
            r0.putExtra(r2, r1)
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            r0.addFlags(r1)
            java.lang.String r1 = "KEY_FINDER_SELF_FLAG"
            r0.putExtra(r1, r3)
            rs1.s8$a r1 = rs1.C13442s8.f38060Q0
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 252(0xfc, float:3.53E-43)
            r12 = 0
            r2 = r32
            r3 = r0
            rs1.C13442s8.C13443a.m12791e(r1, r2, r3, r4, r6, r7, r8, r9, r10, r11, r12)
            di3.d r1 = di3.C86312j.m106911c(r16)
            er1.b r1 = (er1.C58684b) r1
            r1.mo13272V1(r13, r0)
            r32.finish()
        L_0x06b7:
            java.lang.Class<l31.e> r0 = l31.C61212e.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            l31.e r0 = (l31.C61212e) r0
            o31.b r1 = o31.C11345b.FinderPostRouterUI
            l31.e r0 = r0.mo86178qr(r13, r1)
            o31.a r1 = o31.C76986a.Finder
            r0.mo86179qs(r13, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.p056ui.FinderPostRouterUI.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        CaptureDataManager.f272890c.f272891a = null;
        ((C65000f) C86312j.m106911c(C65000f.class)).hn0(String.valueOf(hashCode()));
        super.onDestroy();
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        int i = -1;
        this.f161073o = intent != null ? intent.getIntExtra("key_finder_post_router", -1) : -1;
        if (intent != null) {
            i = intent.getIntExtra("key_finder_post_from", -1);
        }
        this.f161072A = i;
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C87412m.m108594g(strArr, "permissions");
        C87412m.m108594g(iArr, "grantResults");
        if (iArr.length == 0) {
            Log.m105925i("Finder.FinderPostRouterUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", Integer.valueOf(i), Long.valueOf(Thread.currentThread().getId()));
            return;
        }
        Log.m105925i("Finder.FinderPostRouterUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", Integer.valueOf(i), Integer.valueOf(iArr[0]), Long.valueOf(Thread.currentThread().getId()));
        if (i == 16) {
            if (!(!(iArr.length == 0)) || iArr[0] != 0) {
                C76879j.m92709C(getContext(), C76577a.m92166q(getContext(), C0966R.string.hhq), C76577a.m92166q(getContext(), C0966R.string.hif), C76577a.m92166q(getContext(), C0966R.string.fyd), C76577a.m92166q(getContext(), C0966R.string.hhr), false, new C56350b(this), new C56351c(this));
            } else {
                mo79096O7();
            }
        } else if (i == 80) {
            if ((!(iArr.length == 0)) && iArr[0] == 0) {
                mo79096O7();
            }
        }
    }

    public void onResume() {
        super.onResume();
        Log.m105924i("Finder.FinderPostRouterUI", "onResume");
        getIntent().getBooleanExtra("KEY_FINDER_POST_FROM_ADD_MEDIA", false);
        if (!this.f161074p) {
            return;
        }
        if (this.f161073o == 13) {
            if (this.f161072A == 1) {
                FinderProfileTabUIC.f160643K = 4;
            } else {
                Intent intent = new Intent();
                intent.putExtra("finder_username", C66785b.f191882e.mo90662O5());
                intent.addFlags(67108864);
                intent.putExtra("KEY_FINDER_SELF_FLAG", true);
                intent.putExtra("key_enter_profile_tab", 4);
                C13442s8.C13443a.m12791e(C13442s8.f38060Q0, this, intent, 0, (String) null, 0, 0, false, 0, 252, (Object) null);
                ((C58684b) C86312j.m106911c(C58684b.class)).mo13272V1(this, intent);
            }
            finish();
            return;
        }
        finish();
        if (this.f161075q) {
            overridePendingTransition(0, C0966R.C0968anim.f2493eh);
        }
        if (this.f161073o == 6) {
            overridePendingTransition(MMFragmentActivity$$c.f318646c, MMFragmentActivity$$c.f318647d);
        }
        if (this.f161073o == 16) {
            overridePendingTransition(0, C0966R.C0968anim.f2506eu);
        }
    }

    public void onStop() {
        super.onStop();
        Log.m105924i("Finder.FinderPostRouterUI", "onStop");
        this.f161074p = true;
    }
}
