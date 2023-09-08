package qc1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import c02.C92331c;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.autogen.events.NotifyWNNoteOperationEvent;
import com.tencent.p014mm.plugin.fav.p047ui.C55660h0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import di3.C86312j;
import h81.C32735h;
import java.util.Iterator;
import java.util.LinkedList;
import ke3.C88144b;
import lc1.C99408u;
import nj3.C88990b;
import p262wm.C22921c;
import p272xq.C102712e;
import p444at.C92087b;
import pb1.C100699c0;
import pb1.C100705f0;
import pb1.C100710h0;
import pb1.C100734q;
import pb1.C100755z;
import qo3.C77398g;
import te3.C101755ad0;
import te3.C101756ae0;
import te3.C101801kd0;
import te3.C101811md0;
import te3.C101834rc0;
import te3.C101835rd0;
import te3.C101841sc0;
import te3.C101849uc0;
import te3.C101871zc0;
import te3.C64682rk1;
import te3.C77911cd0;
import wd3.C78575u;

/* renamed from: qc1.e */
public class C101110e {

    /* renamed from: qc1.e$a */
    public class C101111a implements C77398g.C77402i.C77404b {

        /* renamed from: a */
        public final /* synthetic */ Context f295986a;

        /* renamed from: b */
        public final /* synthetic */ C100755z f295987b;

        public C101111a(Context context, C100755z zVar) {
            this.f295986a = context;
            this.f295987b = zVar;
        }

        /* renamed from: a */
        public void mo25a() {
            C101110e.m132505h(this.f295986a, this.f295987b, false, new C101811md0());
        }
    }

    /* renamed from: qc1.e$b */
    public class C101112b implements C77398g.C77402i.C77404b {

        /* renamed from: a */
        public final /* synthetic */ C100755z f295988a;

        /* renamed from: b */
        public final /* synthetic */ Context f295989b;

        public C101112b(C100755z zVar, Context context) {
            this.f295988a = zVar;
            this.f295989b = context;
        }

        /* renamed from: a */
        public void mo25a() {
            C64682rk1 rk12 = this.f295988a.field_favProto.f298614M;
            if (rk12 != null) {
                C55660h0.f158397a.mo77166a(this.f295989b, rk12);
            }
        }
    }

    /* renamed from: qc1.e$c */
    public class C101113c implements C77398g.C77402i.C77404b {

        /* renamed from: a */
        public final /* synthetic */ C100755z f295990a;

        /* renamed from: b */
        public final /* synthetic */ Context f295991b;

        public C101113c(C100755z zVar, Context context) {
            this.f295990a = zVar;
            this.f295991b = context;
        }

        /* renamed from: a */
        public void mo25a() {
            Intent intent = new Intent();
            intent.putExtra("Retr_Msg_content", this.f295990a.field_favProto.f298628s);
            C88144b.m109801s(this.f295991b, ".ui.transmit.RetransmitPreviewUI", intent, (Bundle) null);
            C88990b.m111199h(this.f295991b);
        }
    }

    /* renamed from: qc1.e$d */
    public class C101114d implements C77398g.C77402i.C77404b {

        /* renamed from: a */
        public final /* synthetic */ Context f295992a;

        /* renamed from: b */
        public final /* synthetic */ C100755z f295993b;

        public C101114d(Context context, C100755z zVar) {
            this.f295992a = context;
            this.f295993b = zVar;
        }

        /* renamed from: a */
        public void mo25a() {
            C101110e.m132500c(this.f295992a, this.f295993b, false, new C101811md0());
        }
    }

    /* renamed from: qc1.e$e */
    public class C101115e implements C77398g.C77402i.C77404b {

        /* renamed from: a */
        public final /* synthetic */ C100755z f295994a;

        /* renamed from: b */
        public final /* synthetic */ Context f295995b;

        public C101115e(C100755z zVar, Context context) {
            this.f295994a = zVar;
            this.f295995b = context;
        }

        /* renamed from: a */
        public void mo25a() {
            Intent intent = new Intent();
            intent.putExtra("Retr_Msg_content", this.f295994a.field_favProto.f298628s);
            C88144b.m109801s(this.f295995b, ".ui.transmit.RetransmitPreviewUI", intent, (Bundle) null);
            C88990b.m111199h(this.f295995b);
        }
    }

    /* renamed from: qc1.e$f */
    public class C101116f implements C77398g.C77402i.C77404b {

        /* renamed from: a */
        public final /* synthetic */ C101871zc0 f295996a;

        /* renamed from: b */
        public final /* synthetic */ Context f295997b;

        public C101116f(C101871zc0 zc02, Context context) {
            this.f295996a = zc02;
            this.f295997b = context;
        }

        /* renamed from: a */
        public void mo25a() {
            Intent intent = new Intent();
            intent.putExtra("map_view_type", 1);
            intent.putExtra("map_indoor_support", 1);
            C101871zc0 zc02 = this.f295996a;
            if (zc02 != null) {
                intent.putExtra("kwebmap_slat", zc02.f299952f);
                intent.putExtra("kwebmap_lng", this.f295996a.f299950d);
                intent.putExtra("Kwebmap_locaion", this.f295996a.f299956j);
            }
            intent.putExtra("kShowshare", false);
            C88144b.m109791i(this.f295997b, FirebaseAnalytics.C113379b.LOCATION, ".ui.RedirectUI", intent, (Bundle) null);
        }
    }

    /* renamed from: qc1.e$g */
    public class C101117g implements C77398g.C77402i.C77404b {

        /* renamed from: a */
        public final /* synthetic */ Context f295998a;

        /* renamed from: b */
        public final /* synthetic */ C100755z f295999b;

        public C101117g(Context context, C100755z zVar) {
            this.f295998a = context;
            this.f295999b = zVar;
        }

        /* renamed from: a */
        public void mo25a() {
            C101110e.m132506i(this.f295998a, this.f295999b, false, new C101811md0());
        }
    }

    /* renamed from: qc1.e$h */
    public class C101118h implements C77398g.C77402i.C77404b {

        /* renamed from: a */
        public final /* synthetic */ Context f296000a;

        /* renamed from: b */
        public final /* synthetic */ C100755z f296001b;

        public C101118h(Context context, C100755z zVar) {
            this.f296000a = context;
            this.f296001b = zVar;
        }

        /* renamed from: a */
        public void mo25a() {
            C101110e.m132502e(this.f296000a, this.f296001b, false, new C101811md0());
        }
    }

    /* renamed from: qc1.e$i */
    public class C101119i implements C77398g.C77402i.C77404b {

        /* renamed from: a */
        public final /* synthetic */ C100755z f296002a;

        /* renamed from: b */
        public final /* synthetic */ C101834rc0 f296003b;

        /* renamed from: c */
        public final /* synthetic */ Context f296004c;

        public C101119i(C100755z zVar, C101834rc0 rc02, Context context) {
            this.f296002a = zVar;
            this.f296003b = rc02;
            this.f296004c = context;
        }

        /* renamed from: a */
        public void mo25a() {
            Intent intent = new Intent();
            intent.putExtra("key_detail_info_id", this.f296002a.field_localId);
            intent.putExtra("key_detail_data_id", this.f296003b.f299280T);
            intent.putExtra("show_share", false);
            ((C102712e) C86312j.m106911c(C102712e.class)).F20(this.f296004c, ".ui.FavImgGalleryUI", intent);
        }
    }

    /* renamed from: qc1.e$j */
    public class C101120j implements C77398g.C77402i.C77404b {

        /* renamed from: a */
        public final /* synthetic */ C100755z f296005a;

        /* renamed from: b */
        public final /* synthetic */ Context f296006b;

        public C101120j(C100755z zVar, Context context) {
            this.f296005a = zVar;
            this.f296006b = context;
        }

        /* renamed from: a */
        public void mo25a() {
            C101755ad0 ad02;
            Class cls = C102712e.class;
            C101834rc0 D = C100734q.m131813D(this.f296005a);
            if (D == null) {
                Log.m105920e("MicroMsg.FavItemLogic", "goPlayView, but dataitem is null , exit");
                return;
            }
            Context context = this.f296006b;
            C101841sc0 sc02 = D.f299296c1;
            boolean z = true;
            if (sc02 == null || (ad02 = sc02.f299422x) == null) {
                Log.m105928w("MicroMsg.FavItemLogic", "handleMpVideoItem favMpMsgItem is null");
                z = false;
            } else {
                C99408u.m129726h(context, ad02, D, true);
            }
            if (!z) {
                C101849uc0 uc02 = D.f299306h1;
                if (uc02 == null || (Util.isNullOrNil(uc02.f299610d) && Util.isNullOrNil(D.f299306h1.f299613g))) {
                    Intent intent = new Intent();
                    intent.putExtra("key_detail_info_id", this.f296005a.field_localId);
                    intent.putExtra("key_detail_fav_path", ((C102712e) C86312j.m106911c(cls)).mo142091L2(D));
                    intent.putExtra("key_detail_fav_thumb_path", C100734q.m131826Q(D));
                    intent.putExtra("key_detail_fav_video_duration", D.f299338y);
                    intent.putExtra("key_detail_statExtStr", D.f299311k1);
                    intent.putExtra("key_detail_msg_uuid", D.f299259I1);
                    intent.putExtra("show_share", false);
                    ((C102712e) C86312j.m106911c(cls)).F20(this.f296006b, ".ui.detail.FavoriteVideoPlayUI", intent);
                    return;
                }
                Log.m105924i("MicroMsg.FavItemLogic", "it is ad sight.use sight play");
                Intent intent2 = new Intent();
                intent2.putExtra("key_detail_info_id", this.f296005a.field_localId);
                intent2.putExtra("key_detail_data_id", D.f299280T);
                intent2.putExtra("key_detail_can_delete", false);
                ((C102712e) C86312j.m106911c(cls)).F20(this.f296006b, ".ui.detail.FavoriteFileDetailUI", intent2);
            }
        }
    }

    /* renamed from: a */
    public static void m132498a(C101835rd0 rd02, Intent intent) {
        intent.putExtra("geta8key_scene", 14);
        if (rd02 != null) {
            intent.putExtra("geta8key_username", C100705f0.m131751b(rd02));
            intent.putExtra("msgUsername", rd02.f299348f);
            intent.putExtra("serverMsgID", rd02.f299358s);
        }
    }

    /* renamed from: b */
    public static String m132499b(C100755z zVar) {
        C101801kd0 kd02 = zVar.field_favProto;
        if (kd02 == null) {
            return null;
        }
        C101756ae0 ae02 = kd02.f298622j;
        if (ae02 != null && !Util.isNullOrNil(ae02.f297869j)) {
            return zVar.field_favProto.f298622j.f297869j;
        }
        LinkedList<C101834rc0> linkedList = zVar.field_favProto.f298618f;
        if (linkedList == null || linkedList.size() != 1) {
            return null;
        }
        return linkedList.get(0).f299305h;
    }

    /* renamed from: c */
    public static void m132500c(Context context, C100755z zVar, boolean z, C101811md0 md02) {
        Context context2 = context;
        C100755z zVar2 = zVar;
        boolean z2 = z;
        C101811md0 md03 = md02;
        Class cls = C22921c.class;
        Class cls2 = C102712e.class;
        C101834rc0 D = C100734q.m131813D(zVar);
        if (md03 != null && md03.f298819j == 1) {
            Intent intent = new Intent();
            intent.putExtra("key_detail_info_id", zVar2.field_localId);
            intent.putExtra("show_share", z2);
            if (!Util.isNullOrNil(zVar2.f295175T0)) {
                intent.putExtra("key_detail_data_id", zVar2.f295175T0);
                intent.putExtra("key_detail_open_way", 2);
            } else {
                intent.putExtra("key_detail_open_way", 1);
            }
            m132510m(md03, intent);
            C100699c0.m131740b("FavoriteFileDetailUI", md03.f298816g);
            ((C102712e) C86312j.m106911c(cls2)).F20(context2, ".ui.detail.FavoriteFileDetailUI", intent);
        } else if (md03 == null || md03.f298819j != 2) {
            if (C100734q.m131834Y(D)) {
                if (C100734q.m131835Z(D)) {
                    m132501d(context2, zVar2, md03);
                    return;
                }
                ((C92331c) C86312j.m106911c(C92331c.class)).mo58375rt(((C92087b) C86312j.m106911c(C92087b.class)).mo126070NN(D, zVar2 != null ? String.valueOf(zVar2.field_id) : null, (C72963f4) null, ((C102712e) C86312j.m106911c(cls2)).mo142091L2(D)));
                if (!((C22921c) C86312j.m106911c(cls)).mo35894rw(((C102712e) C86312j.m106911c(cls2)).mo142091L2(D), D.f299262K, D.f299297d, 2)) {
                    return;
                }
            }
            Intent intent2 = new Intent();
            intent2.putExtra("key_detail_info_id", zVar2.field_localId);
            intent2.putExtra("key_detail_data_id", D.f299280T);
            intent2.putExtra("show_share", z2);
            m132510m(md03, intent2);
            C100699c0.m131740b("FavoriteFileDetailUI", md03.f298816g);
            ((C102712e) C86312j.m106911c(cls2)).F20(context, ".ui.detail.FavoriteFileDetailUI", intent2);
        } else {
            ((C22921c) C86312j.m106911c(cls)).Om0((Activity) context2, ((C102712e) C86312j.m106911c(cls2)).mo142091L2(D), D.f299262K, 2);
        }
    }

    /* renamed from: d */
    public static void m132501d(Context context, C100755z zVar, C101811md0 md02) {
        Intent intent = new Intent();
        m132509l(zVar, md02, intent);
        C100699c0.m131740b("FavoriteImgDetailUI", md02.f298816g);
        ((C102712e) C86312j.m106911c(C102712e.class)).F20(context, ".ui.detail.FavoriteImgDetailUI", intent);
    }

    /* renamed from: e */
    public static void m132502e(Context context, C100755z zVar, boolean z, C101811md0 md02) {
        Intent intent = new Intent();
        intent.putExtra("key_detail_info_id", zVar.field_localId);
        intent.putExtra("show_share", z);
        intent.putExtra("prePublishId", "msgrecord_detail");
        intent.putExtra("preChatTYPE", 15);
        m132510m(md02, intent);
        C100699c0.m131740b("FavRecordDetailUI", md02.f298816g);
        C88144b.m109791i(context, "record", ".ui.FavRecordDetailUI", intent, (Bundle) null);
    }

    /* renamed from: f */
    public static void m132503f(Context context, C100755z zVar, C101811md0 md02) {
        C100710h0.m131765b(C100710h0.C100711a.PlayIcon, zVar);
        Intent intent = new Intent();
        intent.putExtra("key_detail_info_id", zVar.field_localId);
        m132510m(md02, intent);
        ((C102712e) C86312j.m106911c(C102712e.class)).F20(context, ".ui.detail.FavoriteSightDetailUI", intent);
    }

    /* renamed from: g */
    public static void m132504g(Context context, C100755z zVar, C101811md0 md02) {
        boolean z;
        boolean z2;
        C101755ad0 ad02;
        C101834rc0 D = C100734q.m131813D(zVar);
        C101849uc0 uc02 = D.f299306h1;
        if (uc02 == null || Util.isNullOrNil(uc02.f299610d)) {
            z = false;
        } else {
            C100710h0.m131765b(C100710h0.C100711a.EnterCompleteVideo, zVar);
            String Q = C100734q.m131826Q(D);
            Intent intent = new Intent();
            intent.putExtra("KFromTimeLine", false);
            intent.putExtra("KStremVideoUrl", uc02.f299610d);
            intent.putExtra("StreamWording", uc02.f299612f);
            intent.putExtra("StremWebUrl", uc02.f299613g);
            intent.putExtra("KThumUrl", uc02.f299615i);
            intent.putExtra("KSta_StremVideoAduxInfo", uc02.f299616j);
            intent.putExtra("KSta_StremVideoPublishId", uc02.f299617n);
            intent.putExtra("KSta_SourceType", 2);
            intent.putExtra("KSta_Scene", 5);
            intent.putExtra("KSta_FromUserName", zVar.field_fromUser);
            intent.putExtra("KSta_FavID", zVar.field_id);
            intent.putExtra("KSta_SnsStatExtStr", D.f299311k1);
            intent.putExtra("KBlockFav", true);
            intent.putExtra("KMediaId", "fakeid_" + zVar.field_id);
            intent.putExtra("KThumbPath", Q);
            intent.putExtra("KMediaVideoTime", uc02.f299611e);
            intent.putExtra("KMediaTitle", uc02.f299614h);
            if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_ad_landing_page_new_stream_video, 1) > 0) {
                C88144b.m109791i(context, "sns", ".ui.SnsAdStreamVideoPlayUI", intent, (Bundle) null);
                Log.m105924i("MicroMsg.FavItemLogic", "use new stream video play UI");
            } else {
                C88144b.m109791i(context, "sns", ".ui.VideoAdPlayerUI", intent, (Bundle) null);
            }
            z = true;
        }
        if (!z) {
            C101841sc0 sc02 = D.f299296c1;
            if (sc02 == null || (ad02 = sc02.f299422x) == null) {
                Log.m105928w("MicroMsg.FavItemLogic", "handleMpVideoItem favMpMsgItem is null");
                z2 = false;
            } else {
                C99408u.m129726h(context, ad02, D, false);
                z2 = true;
            }
            if (!z2) {
                if (Util.isNullOrNil(D.f299266M) || D.f299276R <= 0) {
                    Log.m105929w("MicroMsg.FavItemLogic", "full md5[%s], fullsize[%d], start use url", D.f299266M, Long.valueOf(D.f299276R));
                    String str = C100734q.m131813D(zVar).f299242A;
                    if (Util.isNullOrNil(str)) {
                        str = C100734q.m131813D(zVar).f299250E;
                    }
                    if (Util.isNullOrNil(str)) {
                        Log.m105928w("MicroMsg.FavItemLogic", "onClick video url null, return");
                        m132503f(context, zVar, md02);
                        return;
                    }
                    Intent intent2 = new Intent();
                    Bundle bundle = new Bundle();
                    bundle.putString("key_snsad_statextstr", D.f299311k1);
                    bundle.putLong("favlocalid", zVar.field_localId);
                    intent2.putExtra("jsapiargs", bundle);
                    intent2.putExtra("rawUrl", str);
                    intent2.putExtra("is_favorite_item", true);
                    intent2.putExtra("fav_local_id", zVar.field_localId);
                    m132498a(zVar.field_favProto.f298616d, intent2);
                    intent2.putExtra("key_enable_teen_mode_check", true);
                    Log.m105919d("MicroMsg.FavItemLogic", "start video webview, fav id %d, fav local id %d", Integer.valueOf(zVar.field_id), Long.valueOf(zVar.field_localId));
                    C88144b.m109791i(context, "webview", ".ui.tools.WebViewUI", intent2, (Bundle) null);
                    return;
                }
                Intent intent3 = new Intent();
                m132509l(zVar, md02, intent3);
                C100699c0.m131740b("FavoriteSightDetailUI", md02.f298816g);
                ((C102712e) C86312j.m106911c(C102712e.class)).F20(context, ".ui.detail.FavoriteSightDetailUI", intent3);
            }
        }
    }

    /* renamed from: h */
    public static void m132505h(Context context, C100755z zVar, boolean z, C101811md0 md02) {
        C101801kd0 kd02;
        LinkedList<C101834rc0> linkedList;
        boolean z2;
        Log.m105924i("MicroMsg.FavItemLogic", "click WNNoteItem, handleWNNoteItem");
        NotifyWNNoteOperationEvent notifyWNNoteOperationEvent = new NotifyWNNoteOperationEvent();
        notifyWNNoteOperationEvent.f264942d.field_localId = zVar.field_localId;
        if (!Util.isNullOrNil(zVar.f295175T0) && (kd02 = zVar.field_favProto) != null && (linkedList = kd02.f298618f) != null && linkedList.size() > 0) {
            Iterator<C101834rc0> it = zVar.field_favProto.f298618f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z2 = false;
                    break;
                } else if (Util.isEqual(it.next().f299280T, zVar.f295175T0)) {
                    z2 = true;
                    break;
                } else {
                    notifyWNNoteOperationEvent.f264942d.f264946c++;
                }
            }
            Log.m105919d("MicroMsg.FavItemLogic", "handleWNNoteItem include:%s position:%s", Boolean.valueOf(z2), Integer.valueOf(notifyWNNoteOperationEvent.f264942d.f264946c));
            if (!z2) {
                notifyWNNoteOperationEvent.f264942d.f264946c = 0;
            } else if (zVar.field_type == 18) {
                notifyWNNoteOperationEvent.f264942d.f264946c--;
            }
        }
        if (zVar.field_localId == -1) {
            notifyWNNoteOperationEvent.f264942d.f264954k = 4;
        } else {
            notifyWNNoteOperationEvent.f264942d.f264945b = zVar.field_xml;
        }
        notifyWNNoteOperationEvent.f264942d.f264947d = context;
        Bundle bundle = new Bundle();
        C77911cd0 cd02 = zVar.field_favProto.f298608G;
        if (cd02 != null) {
            bundle.putString("noteauthor", cd02.f227115d);
            bundle.putString("noteeditor", cd02.f227116e);
        }
        bundle.putLong("edittime", zVar.field_updateTime);
        NotifyWNNoteOperationEvent.C92535a aVar = notifyWNNoteOperationEvent.f264942d;
        aVar.f264951h = bundle;
        aVar.field_favProto = zVar.field_favProto;
        aVar.f264944a = 2;
        aVar.f264955l = z;
        aVar.f264956m = md02;
        notifyWNNoteOperationEvent.publish();
        C100699c0.m131740b("NoteEditorUI", md02.f298816g);
    }

    /* JADX WARNING: Removed duplicated region for block: B:130:0x055d  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x05de  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x05e5  */
    /* JADX WARNING: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0265  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0272  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m132506i(android.content.Context r22, pb1.C100755z r23, boolean r24, te3.C101811md0 r25) {
        /*
            r8 = r22
            r0 = r23
            r1 = r25
            java.lang.Class<ex0.d> r2 = ex0.C45696d.class
            java.lang.Class<yb1.b> r3 = yb1.C38987b.class
            java.lang.String r4 = "MicroMsg.FavItemLogic"
            r9 = 0
            r10 = 1
            if (r0 == 0) goto L_0x05ec
            te3.kd0 r5 = r0.field_favProto
            if (r5 != 0) goto L_0x0016
            goto L_0x05ec
        L_0x0016:
            r11 = 0
            if (r5 != 0) goto L_0x001b
        L_0x0019:
            r5 = r11
            goto L_0x0042
        L_0x001b:
            te3.ae0 r5 = r5.f298622j
            if (r5 == 0) goto L_0x002e
            java.lang.String r5 = r5.f297875s
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 != 0) goto L_0x002e
            te3.kd0 r5 = r0.field_favProto
            te3.ae0 r5 = r5.f298622j
            java.lang.String r5 = r5.f297875s
            goto L_0x0042
        L_0x002e:
            te3.kd0 r5 = r0.field_favProto
            java.util.LinkedList<te3.rc0> r5 = r5.f298618f
            if (r5 == 0) goto L_0x0019
            int r6 = r5.size()
            if (r6 != r10) goto L_0x0019
            java.lang.Object r5 = r5.get(r9)
            te3.rc0 r5 = (te3.C101834rc0) r5
            java.lang.String r5 = r5.f299313m1
        L_0x0042:
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            r7 = 268435456(0x10000000, float:2.5243549E-29)
            java.lang.String r12 = "_"
            if (r6 != 0) goto L_0x0092
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r2 = "sns_landing_pages_xml"
            r1.putExtra(r2, r5)
            r2 = 7
            java.lang.String r3 = "sns_landig_pages_from_source"
            r1.putExtra(r3, r2)
            java.lang.String r2 = m132499b(r23)
            java.lang.String r3 = "sns_landing_pages_share_thumb_url"
            r1.putExtra(r3, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = eb0.C75592q0.m90789s()
            r2.append(r3)
            r2.append(r12)
            int r0 = r0.field_id
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = "sns_landing_favid"
            r1.putExtra(r2, r0)
            r1.addFlags(r7)
            java.lang.String r0 = "sns"
            java.lang.String r2 = ".ui.SnsAdNativeLandingPagesPreviewUI"
            ke3.C88144b.m109791i(r8, r0, r2, r1, r11)
            return
        L_0x0092:
            te3.kd0 r5 = r0.field_favProto
            te3.ae0 r5 = r5.f298622j
            if (r5 == 0) goto L_0x01a0
            boolean r6 = r5.f297878v
            if (r6 == 0) goto L_0x01a0
            java.lang.String r6 = r5.f297877u
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 != 0) goto L_0x01a0
            java.lang.String r0 = r5.f297877u
            java.lang.String r1 = "websearch"
            java.util.Map r0 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r0, r1, r11)
            if (r0 != 0) goto L_0x00b5
            java.lang.String r0 = "XmlParser.parseXml fail, values is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
            return
        L_0x00b5:
            te3.w25 r1 = new te3.w25
            r1.<init>()
            java.lang.String r2 = ".websearch.relevant_vid"
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            r1.f259899d = r2
            java.lang.String r2 = ".websearch.relevant_expand"
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            r1.f259900e = r2
            java.lang.String r2 = ".websearch.relevant_pre_searchid"
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            r1.f259901f = r2
            java.lang.String r2 = ".websearch.relevant_shared_openid"
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            r1.f259902g = r2
            java.lang.String r2 = ".websearch.rec_category"
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            r3 = -1
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r3)
            long r2 = (long) r2
            r1.f259903h = r2
            java.lang.String r2 = ".websearch.shareUrl"
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            r1.f259905j = r2
            java.lang.String r2 = ".websearch.shareTitle"
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            r1.f259906n = r2
            java.lang.String r2 = ".websearch.shareDesc"
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            r1.f259907o = r2
            java.lang.String r2 = ".websearch.shareImgUrl"
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            r1.f259908p = r2
            java.lang.String r2 = ".websearch.shareString"
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            r1.f259909q = r2
            java.lang.String r2 = ".websearch.shareStringUrl"
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            r1.f259910r = r2
            java.lang.String r2 = ".websearch.source"
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            r1.f259911s = r2
            java.lang.String r2 = ".websearch.sourceUrl"
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            r1.f259912t = r2
            java.lang.String r2 = ".websearch.strPlayCount"
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            r1.f259904i = r2
            java.lang.String r2 = ".websearch.titleUrl"
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            r1.f259913u = r2
            java.lang.String r2 = ".websearch.extReqParams"
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            r1.f259914v = r2
            java.lang.String r2 = ".websearch.tagList"
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            r1.f259915w = r2
            java.lang.String r2 = ".websearch.channelId"
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            r3 = -1
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r2, r3)
            r1.f259916x = r2
            java.lang.String r2 = ".websearch.thumbUrl"
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            r1.f259917y = r2
            java.lang.String r2 = ".websearch.shareTag"
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            r1.f259918z = r0
            r0 = 326(0x146, float:4.57E-43)
            r2 = 2131838128(0x7f1144b0, float:1.930947E38)
            java.lang.String r2 = r8.getString(r2)
            te3.uh4 r0 = p03.C21914h.m25167o(r1, r0, r2)
            u73.C101987v0.m134280n(r8, r0)
            goto L_0x05eb
        L_0x01a0:
            java.lang.String r6 = ""
            if (r5 == 0) goto L_0x01ab
            java.lang.String r13 = r5.f297867h
            java.lang.String r14 = r5.f297863d
            java.lang.String r15 = r5.f297865f
            goto L_0x01ae
        L_0x01ab:
            r13 = r6
            r14 = r13
            r15 = r14
        L_0x01ae:
            te3.kd0 r7 = r0.field_favProto
            te3.rd0 r7 = r7.f298616d
            if (r7 == 0) goto L_0x01bc
            boolean r16 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r16 == 0) goto L_0x01bc
            java.lang.String r13 = r7.f299364y
        L_0x01bc:
            boolean r16 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r16 == 0) goto L_0x01da
            te3.kd0 r13 = r0.field_favProto
            java.util.LinkedList<te3.rc0> r13 = r13.f298618f
            int r13 = r13.size()
            if (r13 <= 0) goto L_0x01d9
            te3.kd0 r13 = r0.field_favProto
            java.util.LinkedList<te3.rc0> r13 = r13.f298618f
            java.lang.Object r13 = r13.get(r9)
            te3.rc0 r13 = (te3.C101834rc0) r13
            java.lang.String r13 = r13.f299242A
            goto L_0x01da
        L_0x01d9:
            r13 = r11
        L_0x01da:
            boolean r16 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r16 == 0) goto L_0x01ec
            java.lang.Object[] r1 = new java.lang.Object[r10]
            java.lang.String r0 = r0.f295175T0
            r1[r9] = r0
            java.lang.String r0 = "go to web page error, url null, dataid[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r4, r0, r1)
            return
        L_0x01ec:
            di3.d r16 = di3.C86312j.m106911c(r3)
            yb1.b r16 = (yb1.C38987b) r16
            r17 = r12
            long r11 = r0.field_localId
            r16.getClass()
            boolean r18 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r18 == 0) goto L_0x0203
        L_0x01ff:
            r16 = r2
        L_0x0201:
            r2 = 0
            goto L_0x0263
        L_0x0203:
            cc1.b r9 = r16.wx0()
            cc1.a r9 = r9.mo126415Lo(r13)
            java.lang.String r8 = "MicroMsg.offline.PluginFavOffline"
            if (r9 != 0) goto L_0x021c
            java.lang.Object[] r9 = new java.lang.Object[r10]
            r19 = 0
            r9[r19] = r13
            java.lang.String r11 = "useOffline url(%s) favOffline is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r11, r9)
            goto L_0x01ff
        L_0x021c:
            r19 = 0
            bc1.c r10 = r16.vx0()
            boolean r10 = r10.f264008d
            r16 = r2
            if (r10 != 0) goto L_0x0201
            r10 = 2
            java.lang.Object[] r2 = new java.lang.Object[r10]
            java.lang.String r10 = r9.field_url
            r2[r19] = r10
            int r10 = r9.field_status
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r20 = 1
            r2[r20] = r10
            java.lang.String r10 = "useOffline url:%s status:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r10, r2)
            int r2 = r9.field_status
            if (r2 == 0) goto L_0x0201
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r8 = r9.field_url
            java.lang.String r9 = "key_path"
            r2.putExtra(r9, r8)
            java.lang.String r8 = "key_detail_info_id"
            r2.putExtra(r8, r11)
            android.content.Context r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r9 = "fav.offline"
            java.lang.String r10 = ".ui.FavOfflineWebViewUI"
            r11 = 0
            ke3.C88144b.m109791i(r8, r9, r10, r2, r11)
            r2 = 1
        L_0x0263:
            if (r2 == 0) goto L_0x0272
            r2 = 1
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r1 = 0
            r0[r1] = r13
            java.lang.String r1 = "url(%s) use offline read!"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r1, r0)
            return
        L_0x0272:
            di3.d r2 = di3.C86312j.m106911c(r3)
            yb1.b r2 = (yb1.C38987b) r2
            bc1.c r2 = r2.vx0()
            r2.getClass()
            di3.d r8 = di3.C86312j.m106911c(r3)
            yb1.b r8 = (yb1.C38987b) r8
            cc1.b r8 = r8.wx0()
            cc1.a r8 = r8.mo126415Lo(r13)
            java.lang.String r9 = "MicroMsg.offline.FavOfflineService"
            if (r8 == 0) goto L_0x02ed
            r10 = 1
            java.lang.Object[] r11 = new java.lang.Object[r10]
            r10 = 0
            r11[r10] = r13
            java.lang.String r10 = "addUpdateTask url:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r10, r11)
            boolean r9 = r2.f264008d
            if (r9 == 0) goto L_0x02e9
            java.lang.String r9 = r8.field_path
            long r9 = bc1.C92240b.m115967f(r9)
            java.lang.String r11 = r8.field_path
            boolean r11 = com.tencent.p014mm.vfs.C86013q1.m106447h(r11)
            r12 = r5
            r21 = r6
            r5 = 0
            if (r11 == 0) goto L_0x02b6
            bc1.C92240b.m115962a(r9, r5)
        L_0x02b6:
            r9 = 1
            java.lang.Object[] r10 = new java.lang.Object[r9]
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r11)
            r11 = 0
            r10[r11] = r9
            java.lang.String r9 = "MicroMsg.offline.FavOfflineHelp"
            java.lang.String r11 = "deleteFavOfflineContent deleteHtml:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r11, r10)
            r8.field_size = r5
            r5 = 0
            r8.field_status = r5
            di3.d r3 = di3.C86312j.m106911c(r3)
            yb1.b r3 = (yb1.C38987b) r3
            cc1.b r3 = r3.wx0()
            r3.mo126416Yt(r8)
            r8.f264462F = r5
            java.util.concurrent.ConcurrentLinkedDeque<java.lang.String> r3 = r2.f264005a
            r3.addFirst(r13)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, cc1.a> r3 = r2.f264006b
            r3.put(r13, r8)
            r2.mo126240j()
            goto L_0x02fe
        L_0x02e9:
            r12 = r5
            r21 = r6
            goto L_0x02fe
        L_0x02ed:
            r12 = r5
            r21 = r6
            r3 = 1
            r5 = 0
            java.lang.Object[] r6 = new java.lang.Object[r3]
            r6[r5] = r13
            java.lang.String r3 = "addUpdateTask FavOffline is null!!(url:%s)"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r9, r3, r6)
            r2.mo126237f(r13)
        L_0x02fe:
            te3.rc0 r2 = pb1.C100734q.m131813D(r23)
            if (r2 == 0) goto L_0x0314
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
            if (r3 == 0) goto L_0x030c
            java.lang.String r14 = r2.f299297d
        L_0x030c:
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r15)
            if (r3 == 0) goto L_0x0314
            java.lang.String r15 = r2.f299301f
        L_0x0314:
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            int r5 = r0.field_id
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6 = 0
            r3[r6] = r5
            long r5 = r0.field_localId
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r6 = 1
            r3[r6] = r5
            java.lang.String r5 = "start web view, fav id %d, fav local id %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r5, r3)
            android.content.Intent r8 = new android.content.Intent
            r8.<init>()
            java.lang.String r3 = "rawUrl"
            r8.putExtra(r3, r13)
            java.lang.String r5 = "showShare"
            r9 = r24
            r8.putExtra(r5, r9)
            java.lang.String r5 = "is_favorite_item"
            r8.putExtra(r5, r6)
            long r5 = r0.field_localId
            java.lang.String r9 = "fav_local_id"
            r8.putExtra(r9, r5)
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            boolean r6 = r23.mo140184m2()
            java.lang.String r9 = "key_ctrl_flag_open_chat"
            r5.putBoolean(r9, r6)
            boolean r6 = r23.mo140185n2()
            java.lang.String r9 = "key_ctrl_flag_open_sns"
            r5.putBoolean(r9, r6)
            te3.kd0 r6 = r0.field_favProto
            int r6 = r6.f298632w
            r9 = 4
            r6 = r6 & r9
            if (r6 == 0) goto L_0x0372
            r6 = 1
            goto L_0x0373
        L_0x0372:
            r6 = 0
        L_0x0373:
            java.lang.String r10 = "key_ctrl_flag_open_weibo"
            r5.putBoolean(r10, r6)
            te3.kd0 r6 = r0.field_favProto
            int r6 = r6.f298632w
            r6 = r6 & 8
            if (r6 == 0) goto L_0x0383
            r6 = 1
            goto L_0x0384
        L_0x0383:
            r6 = 0
        L_0x0384:
            java.lang.String r10 = "key_ctrl_flag_open_cplink"
            r5.putBoolean(r10, r6)
            te3.kd0 r6 = r0.field_favProto
            int r6 = r6.f298632w
            r10 = 16
            r6 = r6 & r10
            if (r6 == 0) goto L_0x0395
            r6 = 1
            goto L_0x0396
        L_0x0395:
            r6 = 0
        L_0x0396:
            java.lang.String r11 = "key_ctrl_flag_open_browser"
            r5.putBoolean(r11, r6)
            te3.kd0 r6 = r0.field_favProto
            int r6 = r6.f298632w
            r6 = r6 & 32
            if (r6 == 0) goto L_0x03a6
            r6 = 1
            goto L_0x03a7
        L_0x03a6:
            r6 = 0
        L_0x03a7:
            java.lang.String r11 = "key_ctrl_flag_open_weiyun"
            r5.putBoolean(r11, r6)
            te3.kd0 r6 = r0.field_favProto
            int r6 = r6.f298632w
            r6 = r6 & 64
            if (r6 == 0) goto L_0x03b7
            r6 = 1
            goto L_0x03b8
        L_0x03b7:
            r6 = 0
        L_0x03b8:
            java.lang.String r11 = "key_ctrl_flag_open_facebook"
            r5.putBoolean(r11, r6)
            r6 = 1
            java.lang.Object[] r11 = new java.lang.Object[r6]
            java.lang.String r6 = r5.toString()
            r18 = 0
            r11[r18] = r6
            java.lang.String r6 = "MicroMsg.FavItemInfo"
            java.lang.String r10 = "get ctrl args=[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r10, r11)
            java.lang.String r6 = "favorite_control_argument"
            r8.putExtra(r6, r5)
            java.lang.String r5 = r0.field_fromUser
            java.lang.String r6 = "sentUsername"
            r8.putExtra(r6, r5)
            java.lang.String r5 = "webpageTitle"
            r8.putExtra(r5, r14)
            if (r7 == 0) goto L_0x0401
            java.lang.String r5 = r7.f299344B
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 != 0) goto L_0x0401
            java.lang.Class<d62.i> r5 = d62.C75339i.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            d62.i r5 = (d62.C75339i) r5
            java.lang.String r6 = r7.f299344B
            java.lang.String r5 = r5.getDisplayName(r6)
            java.lang.String r6 = "srcDisplayname"
            r8.putExtra(r6, r5)
        L_0x0401:
            java.lang.String r5 = "mode"
            r6 = 1
            r8.putExtra(r5, r6)
            m132498a(r7, r8)
            java.lang.String r5 = r2.f299286W
            java.lang.String r6 = "thumbPath"
            r8.putExtra(r6, r5)
            java.lang.String r5 = "thumbUrl"
            if (r12 == 0) goto L_0x0427
            r6 = r12
            java.lang.String r7 = r6.f297869j
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r7 != 0) goto L_0x0427
            java.lang.String r2 = r6.f297869j
            r8.putExtra(r5, r2)
            goto L_0x043e
        L_0x0427:
            java.lang.String r6 = r2.f299254G
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 != 0) goto L_0x043e
            java.lang.String r6 = r2.f299254G
            java.lang.String r7 = "http"
            boolean r6 = r6.startsWith(r7)
            if (r6 == 0) goto L_0x043e
            java.lang.String r2 = r2.f299254G
            r8.putExtra(r5, r2)
        L_0x043e:
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            te3.rc0 r5 = pb1.C100734q.m131813D(r23)
            java.lang.String r5 = r5.f299311k1
            java.lang.String r6 = "key_snsad_statextstr"
            r2.putString(r6, r5)
            long r5 = r0.field_localId
            java.lang.String r7 = "favlocalid"
            r2.putLong(r7, r5)
            java.lang.String r5 = "jsapiargs"
            r8.putExtra(r5, r2)
            java.lang.String r2 = "from_scence"
            r8.putExtra(r2, r9)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "fav_"
            r2.append(r5)
            java.lang.String r5 = eb0.C75592q0.m90789s()
            r2.append(r5)
            r5 = r17
            r2.append(r5)
            int r5 = r0.field_id
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            java.lang.String r5 = "KPublisherId"
            r8.putExtra(r5, r2)
            java.lang.String r5 = r0.field_fromUser
            java.lang.String r6 = "pre_username"
            r8.putExtra(r6, r5)
            java.lang.String r5 = "prePublishId"
            r8.putExtra(r5, r2)
            r2 = 14
            java.lang.String r5 = "preChatTYPE"
            r8.putExtra(r5, r2)
            java.lang.String r2 = "share_report_pre_msg_url"
            r8.putExtra(r2, r13)
            java.lang.String r2 = "share_report_pre_msg_title"
            r8.putExtra(r2, r14)
            java.lang.String r2 = "share_report_pre_msg_desc"
            r8.putExtra(r2, r15)
            java.lang.String r2 = m132499b(r23)
            java.lang.String r5 = "share_report_pre_msg_icon_url"
            r8.putExtra(r5, r2)
            java.lang.String r2 = "share_report_pre_msg_appid"
            r5 = r21
            r8.putExtra(r2, r5)
            java.lang.String r2 = "share_report_from_scene"
            r8.putExtra(r2, r9)
            java.lang.Class<com.tencent.mm.pluginsdk.model.l0> r2 = com.tencent.p014mm.pluginsdk.model.C96786l0.class
            java.lang.String r2 = r2.getName()
            android.os.Bundle r2 = cd0.C28532c.m38234a(r2)
            int r5 = r0.field_id
            java.lang.String r6 = "mm_rpt_fav_id"
            r2.putInt(r6, r5)
            int r5 = r1.f298813d
            java.lang.String r6 = "key_detail_fav_scene"
            r2.putInt(r6, r5)
            int r5 = r1.f298814e
            java.lang.String r6 = "key_detail_fav_sub_scene"
            r2.putInt(r6, r5)
            int r5 = r1.f298815f
            java.lang.String r6 = "key_detail_fav_index"
            r2.putInt(r6, r5)
            java.lang.String r5 = r1.f298817h
            java.lang.String r6 = "key_detail_fav_query"
            r2.putString(r6, r5)
            java.lang.String r5 = r1.f298816g
            java.lang.String r6 = "key_detail_fav_sessionid"
            r2.putString(r6, r5)
            java.lang.String r5 = r1.f298818i
            java.lang.String r6 = "key_detail_fav_tags"
            r2.putString(r6, r5)
            java.lang.String r1 = r1.f298816g
            java.lang.String r5 = "WebViewUI"
            pb1.C100699c0.m131740b(r5, r1)
            java.lang.String r1 = "mm_report_bundle"
            r8.putExtra(r1, r2)
            java.lang.String r1 = "key_enable_teen_mode_check"
            r2 = 1
            r8.putExtra(r1, r2)
            te3.kd0 r1 = r0.field_favProto
            te3.ad0 r1 = r1.f298612K
            if (r1 == 0) goto L_0x053b
            int r1 = r1.f297848d
            r2 = 16
            if (r1 != r2) goto L_0x053b
            java.lang.String r1 = "immersiveVideoStyle"
            r2 = 1
            r8.putExtra(r1, r2)
            java.lang.String r1 = "immersivePageBgIsDark"
            r8.putExtra(r1, r2)
            r1 = 17170444(0x106000c, float:2.4611947E-38)
            java.lang.String r2 = "webview_bg_color_rsID"
            r8.putExtra(r2, r1)
        L_0x053b:
            te3.kd0 r1 = r0.field_favProto
            te3.ad0 r1 = r1.f298612K
            java.lang.String r9 = ".ui.tools.WebViewUI"
            java.lang.String r10 = "webview"
            if (r1 == 0) goto L_0x05e5
            int r1 = r1.f297849e
            r2 = 1
            if (r1 != r2) goto L_0x05e5
            k40.a r1 = f40.C86709a0.m107533q(r16)
            ex0.d r1 = (ex0.C45696d) r1
            te3.kd0 r2 = r0.field_favProto
            te3.ad0 r2 = r2.f298612K
            int r2 = r2.f297848d
            boolean r1 = r1.mo70998iD(r2)
            if (r1 == 0) goto L_0x05e5
            te3.kd0 r0 = r0.field_favProto
            te3.ad0 r0 = r0.f298612K
            java.lang.String r1 = r8.getStringExtra(r3)
            java.lang.String r2 = "jump to native video"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r2)
            te3.bd0 r2 = r0.f297858q
            if (r2 == 0) goto L_0x0594
            int r2 = r2.f297981f
            java.lang.String r3 = "img_gallery_width"
            android.content.Intent r2 = r8.putExtra(r3, r2)
            te3.bd0 r3 = r0.f297858q
            int r3 = r3.f297982g
            java.lang.String r4 = "img_gallery_height"
            android.content.Intent r2 = r2.putExtra(r4, r3)
            te3.bd0 r3 = r0.f297858q
            int r3 = r3.f297979d
            java.lang.String r4 = "img_gallery_left"
            android.content.Intent r2 = r2.putExtra(r4, r3)
            te3.bd0 r3 = r0.f297858q
            int r3 = r3.f297980e
            java.lang.String r4 = "img_gallery_top"
            r2.putExtra(r4, r3)
        L_0x0594:
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            r8.addFlags(r2)
            long r2 = java.lang.System.currentTimeMillis()
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r4
            int r3 = (int) r2
            r2 = 24
            r4 = 10000(0x2710, float:1.4013E-41)
            k40.a r5 = f40.C86709a0.m107533q(r16)
            ex0.d r5 = (ex0.C45696d) r5
            java.lang.String r3 = r5.mo70959F2(r1, r2, r4, r3)
            k40.a r1 = f40.C86709a0.m107533q(r16)
            ex0.d r1 = (ex0.C45696d) r1
            boolean r1 = r1.mo70957E5(r2)
            if (r1 == 0) goto L_0x05da
            k40.a r1 = f40.C86709a0.m107533q(r16)
            ex0.d r1 = (ex0.C45696d) r1
            int r4 = r0.f297848d
            r5 = 1
            r6 = 24
            r7 = 10000(0x2710, float:1.4013E-41)
            r0 = r1
            r1 = r22
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            boolean r0 = r0.Ms0(r1, r2, r3, r4, r5, r6, r7)
            if (r0 == 0) goto L_0x05da
            r19 = 1
            goto L_0x05dc
        L_0x05da:
            r19 = 0
        L_0x05dc:
            if (r19 != 0) goto L_0x05eb
            r1 = 0
            r0 = r22
            ke3.C88144b.m109791i(r0, r10, r9, r8, r1)
            goto L_0x05eb
        L_0x05e5:
            r1 = 0
            r0 = r22
            ke3.C88144b.m109791i(r0, r10, r9, r8, r1)
        L_0x05eb:
            return
        L_0x05ec:
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            if (r0 != 0) goto L_0x05f3
            r10 = 1
            goto L_0x05f4
        L_0x05f3:
            r10 = 0
        L_0x05f4:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            r1 = 0
            r2[r1] = r0
            java.lang.String r0 = "handleWebPageItem, null == favItemInfo(%b) || null == favItemInfo.field_favProto"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qc1.C101110e.m132506i(android.content.Context, pb1.z, boolean, te3.md0):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0219, code lost:
        if (r7.mo119967g() == false) goto L_0x0221;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x021b, code lost:
        r4 = r7.mo119971i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0221, code lost:
        r4 = pb1.C100734q.m131850h(r5.f299254G);
        r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r4);
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x022b, code lost:
        if (r7 == false) goto L_0x028e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x022d, code lost:
        r4 = r5.f299258I;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x022f, code lost:
        if (r4 == 2) goto L_0x023f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0231, code lost:
        if (r4 == 7) goto L_0x023a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0233, code lost:
        if (r4 == 29) goto L_0x023a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0235, code lost:
        r4 = java.lang.Integer.valueOf(com.tencent.p014mm.C0966R.raw.app_attach_file_icon_video);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x023a, code lost:
        r4 = java.lang.Integer.valueOf(com.tencent.p014mm.C0966R.raw.app_attach_file_icon_music);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x023f, code lost:
        r4 = java.lang.Integer.valueOf(com.tencent.p014mm.C0966R.C0969drawable.btu);
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m132507j(wd3.C78575u.C78583h r24, android.content.Context r25, pb1.C100755z r26) {
        /*
            r0 = r24
            r1 = r25
            r2 = r26
            if (r2 == 0) goto L_0x04a5
            if (r1 != 0) goto L_0x000c
            goto L_0x04a5
        L_0x000c:
            te3.rc0 r3 = pb1.C100734q.m131813D(r26)
            te3.rc0 r4 = pb1.C100734q.m131813D(r26)
            int r5 = r2.field_type
            r6 = 2131755119(0x7f10006f, float:1.9141108E38)
            r7 = 5
            r8 = 14
            r9 = 3
            r10 = 4
            r11 = 1
            r12 = 16
            r13 = 2
            if (r7 != r5) goto L_0x005b
            java.lang.String r5 = pb1.C100734q.m131826Q(r4)
            com.tencent.mm.vfs.m1 r7 = new com.tencent.mm.vfs.m1
            r7.<init>((java.lang.String) r5)
            boolean r5 = r7.mo119967g()
            if (r5 == 0) goto L_0x0039
            java.lang.String r4 = r7.mo119971i()
            goto L_0x028e
        L_0x0039:
            te3.kd0 r5 = r2.field_favProto
            te3.ae0 r5 = r5.f298622j
            if (r5 != 0) goto L_0x0041
            r5 = 0
            goto L_0x0043
        L_0x0041:
            java.lang.String r5 = r5.f297869j
        L_0x0043:
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r7 == 0) goto L_0x004b
            java.lang.String r5 = r4.f299254G
        L_0x004b:
            java.lang.String r4 = pb1.C100734q.m131850h(r5)
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r5 == 0) goto L_0x028e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            goto L_0x028e
        L_0x005b:
            r15 = 10
            r14 = 11
            r17 = 2131755112(0x7f100068, float:1.9141094E38)
            if (r14 == r5) goto L_0x0066
            if (r15 != r5) goto L_0x007e
        L_0x0066:
            te3.kd0 r14 = r2.field_favProto
            te3.jd0 r14 = r14.f298634y
            if (r14 == 0) goto L_0x007e
            java.lang.String r4 = r14.f298515h
            java.lang.String r4 = pb1.C100734q.m131850h(r4)
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r5 == 0) goto L_0x028e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r17)
            goto L_0x028e
        L_0x007e:
            r14 = 15
            r15 = 12
            if (r14 == r5) goto L_0x0086
            if (r15 != r5) goto L_0x009e
        L_0x0086:
            te3.kd0 r15 = r2.field_favProto
            te3.ud0 r15 = r15.f298604C
            if (r15 == 0) goto L_0x009e
            java.lang.String r4 = r15.f299622h
            java.lang.String r4 = pb1.C100734q.m131850h(r4)
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r5 == 0) goto L_0x028e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r17)
            goto L_0x028e
        L_0x009e:
            r15 = 7
            r19 = 2131755116(0x7f10006c, float:1.9141102E38)
            r20 = 2131230947(0x7f0800e3, float:1.8077961E38)
            r6 = 21
            r22 = 2131755090(0x7f100052, float:1.914105E38)
            if (r13 == r5) goto L_0x0244
            if (r15 == r5) goto L_0x0244
            if (r6 == r5) goto L_0x0244
            if (r12 == r5) goto L_0x0244
            if (r10 != r5) goto L_0x00b6
            goto L_0x0244
        L_0x00b6:
            if (r9 != r5) goto L_0x00bb
        L_0x00b8:
            r4 = 0
            goto L_0x028e
        L_0x00bb:
            r6 = 6
            if (r6 != r5) goto L_0x00bf
            goto L_0x00b8
        L_0x00bf:
            r12 = 8
            if (r12 != r5) goto L_0x00cf
            java.lang.String r4 = r4.f299262K
            int r4 = wc3.C102430l.m135146a(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x028e
        L_0x00cf:
            r7 = 17
            r23 = 2131231871(0x7f08047f, float:1.8079835E38)
            if (r7 != r5) goto L_0x0100
            eb0.c r5 = eb0.C97625j3.m125812b()
            g62.l r5 = r5.mo105911z()
            java.lang.String r4 = r4.f299301f
            com.tencent.mm.storage.g4 r5 = (com.tencent.p014mm.storage.C72972g4) r5
            com.tencent.mm.storage.f4$b r4 = r5.Rv0(r4)
            java.lang.String r5 = r4.f212675a
            if (r5 == 0) goto L_0x00fa
            int r5 = r5.length()
            if (r5 == 0) goto L_0x00fa
            android.text.SpannableString r5 = new android.text.SpannableString
            java.lang.String r4 = r4.f212675a
            r5.<init>(r4)
        L_0x00f7:
            r4 = r5
            goto L_0x028e
        L_0x00fa:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r23)
            goto L_0x028e
        L_0x0100:
            if (r8 != r5) goto L_0x00b8
            te3.kd0 r4 = r2.field_favProto
            java.util.LinkedList<te3.rc0> r4 = r4.f298618f
            if (r4 == 0) goto L_0x00b8
            java.util.Iterator r4 = r4.iterator()
        L_0x010c:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00b8
            java.lang.Object r5 = r4.next()
            te3.rc0 r5 = (te3.C101834rc0) r5
            int r7 = r5.f299258I
            if (r7 != r11) goto L_0x011d
            goto L_0x010c
        L_0x011d:
            if (r7 != r9) goto L_0x0128
            r4 = 2131755118(0x7f10006e, float:1.9141106E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x028e
        L_0x0128:
            if (r7 != r6) goto L_0x0133
            r4 = 2131755088(0x7f100050, float:1.9141045E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x028e
        L_0x0133:
            if (r7 != r12) goto L_0x0141
            java.lang.String r4 = r5.f299262K
            int r4 = wc3.C102430l.m135146a(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x028e
        L_0x0141:
            r6 = 29
            if (r7 == r13) goto L_0x020c
            if (r7 == r15) goto L_0x020c
            if (r7 == r6) goto L_0x020c
            if (r7 == r14) goto L_0x020c
            if (r7 != r10) goto L_0x014f
            goto L_0x020c
        L_0x014f:
            r12 = 5
            if (r7 != r12) goto L_0x018c
            java.lang.String r4 = pb1.C100734q.m131826Q(r5)
            com.tencent.mm.vfs.m1 r6 = new com.tencent.mm.vfs.m1
            r6.<init>((java.lang.String) r4)
            boolean r4 = r6.mo119967g()
            if (r4 == 0) goto L_0x0167
            java.lang.String r4 = r6.mo119971i()
            goto L_0x028e
        L_0x0167:
            te3.sc0 r4 = r5.f299296c1
            te3.ae0 r4 = r4.f299407f
            if (r4 != 0) goto L_0x016f
            r4 = 0
            goto L_0x0171
        L_0x016f:
            java.lang.String r4 = r4.f297869j
        L_0x0171:
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r6 == 0) goto L_0x0179
            java.lang.String r4 = r5.f299254G
        L_0x0179:
            java.lang.String r4 = pb1.C100734q.m131850h(r4)
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r5 == 0) goto L_0x028e
            r21 = 2131755119(0x7f10006f, float:1.9141108E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r21)
            goto L_0x028e
        L_0x018c:
            r21 = 2131755119(0x7f10006f, float:1.9141108E38)
            r6 = 22
            if (r7 != r6) goto L_0x019c
            r4 = 2131756310(0x7f100516, float:1.9143524E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x028e
        L_0x019c:
            r6 = 10
            r12 = 11
            if (r7 == r6) goto L_0x01a4
            if (r7 != r12) goto L_0x01bc
        L_0x01a4:
            te3.sc0 r6 = r5.f299296c1
            te3.jd0 r6 = r6.f299408g
            if (r6 == 0) goto L_0x01bc
            java.lang.String r4 = r6.f298515h
            java.lang.String r4 = pb1.C100734q.m131850h(r4)
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r5 == 0) goto L_0x028e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r17)
            goto L_0x028e
        L_0x01bc:
            r6 = 12
            if (r7 == r6) goto L_0x01c2
            if (r7 != r8) goto L_0x01da
        L_0x01c2:
            te3.sc0 r6 = r5.f299296c1
            te3.ud0 r6 = r6.f299409h
            if (r6 == 0) goto L_0x01da
            java.lang.String r4 = r6.f299622h
            java.lang.String r4 = pb1.C100734q.m131850h(r4)
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r5 == 0) goto L_0x028e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r17)
            goto L_0x028e
        L_0x01da:
            r6 = 16
            if (r7 != r6) goto L_0x0207
            eb0.c r4 = eb0.C97625j3.m125812b()
            g62.l r4 = r4.mo105911z()
            java.lang.String r5 = r5.f299301f
            com.tencent.mm.storage.g4 r4 = (com.tencent.p014mm.storage.C72972g4) r4
            com.tencent.mm.storage.f4$b r4 = r4.Rv0(r5)
            java.lang.String r5 = r4.f212675a
            if (r5 == 0) goto L_0x0201
            int r5 = r5.length()
            if (r5 == 0) goto L_0x0201
            android.text.SpannableString r5 = new android.text.SpannableString
            java.lang.String r4 = r4.f212675a
            r5.<init>(r4)
            goto L_0x00f7
        L_0x0201:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r23)
            goto L_0x028e
        L_0x0207:
            r6 = 6
            r12 = 8
            goto L_0x010c
        L_0x020c:
            java.lang.String r4 = pb1.C100734q.m131826Q(r5)
            com.tencent.mm.vfs.m1 r7 = new com.tencent.mm.vfs.m1
            r7.<init>((java.lang.String) r4)
            boolean r4 = r7.mo119967g()
            if (r4 == 0) goto L_0x0221
            java.lang.String r4 = r7.mo119971i()
            goto L_0x028e
        L_0x0221:
            java.lang.String r4 = r5.f299254G
            java.lang.String r4 = pb1.C100734q.m131850h(r4)
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r7 == 0) goto L_0x028e
            int r4 = r5.f299258I
            if (r4 == r13) goto L_0x023f
            if (r4 == r15) goto L_0x023a
            if (r4 == r6) goto L_0x023a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r19)
            goto L_0x028e
        L_0x023a:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r22)
            goto L_0x028e
        L_0x023f:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r20)
            goto L_0x028e
        L_0x0244:
            java.lang.String r5 = pb1.C100734q.m131826Q(r4)
            com.tencent.mm.vfs.m1 r7 = new com.tencent.mm.vfs.m1
            r7.<init>((java.lang.String) r5)
            boolean r5 = r7.mo119967g()
            if (r5 == 0) goto L_0x0258
            java.lang.String r4 = r7.mo119971i()
            goto L_0x028e
        L_0x0258:
            java.lang.String r5 = r4.f299254G
            java.lang.String r5 = pb1.C100734q.m131850h(r5)
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r7 == 0) goto L_0x026c
            pb1.C100734q.m131857k0(r2, r4, r11)
            java.lang.String r4 = pb1.C100734q.m131826Q(r4)
            goto L_0x026d
        L_0x026c:
            r4 = r5
        L_0x026d:
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r5 == 0) goto L_0x028e
            int r4 = r2.field_type
            if (r4 == r13) goto L_0x028a
            if (r4 == r15) goto L_0x0285
            if (r4 == r6) goto L_0x0280
            java.lang.Integer r4 = java.lang.Integer.valueOf(r19)
            goto L_0x028e
        L_0x0280:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r22)
            goto L_0x028e
        L_0x0285:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r22)
            goto L_0x028e
        L_0x028a:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r20)
        L_0x028e:
            boolean r5 = r4 instanceof java.lang.String
            if (r5 == 0) goto L_0x0295
            java.lang.String r4 = (java.lang.String) r4
            goto L_0x029f
        L_0x0295:
            boolean r5 = r4 instanceof java.lang.Integer
            if (r5 == 0) goto L_0x029e
            java.lang.Integer r4 = (java.lang.Integer) r4
            r4.intValue()
        L_0x029e:
            r4 = 0
        L_0x029f:
            te3.kd0 r5 = r2.field_favProto
            te3.ae0 r6 = r5.f298622j
            int r7 = r2.field_type
            if (r7 == r11) goto L_0x0494
            if (r7 == r13) goto L_0x048c
            if (r7 == r8) goto L_0x046b
            r8 = 16
            if (r7 == r8) goto L_0x0463
            r8 = 23
            if (r7 == r8) goto L_0x0426
            switch(r7) {
                case 4: goto L_0x041d;
                case 5: goto L_0x03dc;
                case 6: goto L_0x03bb;
                case 7: goto L_0x0389;
                case 8: goto L_0x0363;
                default: goto L_0x02b6;
            }
        L_0x02b6:
            switch(r7) {
                case 18: goto L_0x0339;
                case 19: goto L_0x0311;
                case 20: goto L_0x02eb;
                case 21: goto L_0x0389;
                default: goto L_0x02b9;
            }
        L_0x02b9:
            if (r6 == 0) goto L_0x02c6
            java.lang.String r2 = r6.f297863d
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x02c6
            java.lang.String r14 = r6.f297863d
            goto L_0x02c7
        L_0x02c6:
            r14 = 0
        L_0x02c7:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
            if (r2 == 0) goto L_0x02cf
            java.lang.String r14 = r3.f299297d
        L_0x02cf:
            android.content.res.Resources r1 = r25.getResources()
            r2 = 2131820945(0x7f110191, float:1.927462E38)
            java.lang.String r1 = r1.getString(r2)
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>(r1)
            r2.append(r14)
            java.lang.String r1 = r2.toString()
            r0.mo108571i(r1)
            goto L_0x04a4
        L_0x02eb:
            te3.rk1 r2 = r5.f298614M
            r3 = 2131821532(0x7f1103dc, float:1.927581E38)
            if (r2 == 0) goto L_0x0308
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r1 = r1.getString(r3)
            r4.append(r1)
            java.lang.String r1 = r2.f185187h
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            goto L_0x030c
        L_0x0308:
            java.lang.String r1 = r1.getString(r3)
        L_0x030c:
            r0.mo108571i(r1)
            goto L_0x04a4
        L_0x0311:
            te3.pc0 r3 = r5.f298610I
            r4 = 2131821053(0x7f1101fd, float:1.9274838E38)
            if (r3 == 0) goto L_0x0330
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r1 = r1.getString(r4)
            r3.append(r1)
            te3.kd0 r1 = r2.field_favProto
            java.lang.String r1 = r1.f298626q
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            goto L_0x0334
        L_0x0330:
            java.lang.String r1 = r1.getString(r4)
        L_0x0334:
            r0.mo108571i(r1)
            goto L_0x04a4
        L_0x0339:
            android.content.res.Resources r3 = r25.getResources()
            r4 = 2131821616(0x7f110430, float:1.927598E38)
            java.lang.String r3 = r3.getString(r4)
            com.tencent.mm.plugin.fav.ui.f1$e r1 = com.tencent.p014mm.plugin.fav.p047ui.C93594f1.C93599e.m118184a(r25, r26)
            java.lang.String r1 = r1.f270289b
            java.lang.String r2 = "\n"
            java.lang.String r4 = " "
            java.lang.String r1 = r1.replaceAll(r2, r4)
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.mo108571i(r1)
            goto L_0x04a4
        L_0x0363:
            java.lang.String r2 = r5.f298626q
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r4 == 0) goto L_0x036d
            java.lang.String r2 = r3.f299297d
        L_0x036d:
            android.content.res.Resources r1 = r25.getResources()
            r3 = 2131821530(0x7f1103da, float:1.9275806E38)
            java.lang.String r1 = r1.getString(r3)
            java.lang.StringBuffer r3 = new java.lang.StringBuffer
            r3.<init>(r1)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            r0.mo108571i(r1)
            goto L_0x04a4
        L_0x0389:
            if (r6 == 0) goto L_0x0396
            java.lang.String r2 = r6.f297863d
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x0396
            java.lang.String r14 = r6.f297863d
            goto L_0x0397
        L_0x0396:
            r14 = 0
        L_0x0397:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
            if (r2 == 0) goto L_0x039f
            java.lang.String r14 = r3.f299297d
        L_0x039f:
            android.content.res.Resources r1 = r25.getResources()
            r2 = 2131821602(0x7f110422, float:1.9275952E38)
            java.lang.String r1 = r1.getString(r2)
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>(r1)
            r2.append(r14)
            java.lang.String r1 = r2.toString()
            r0.mo108571i(r1)
            goto L_0x04a4
        L_0x03bb:
            te3.zc0 r2 = r5.f298620h
            r3 = 2131821573(0x7f110405, float:1.9275893E38)
            java.lang.String r1 = r1.getString(r3)
            if (r2 == 0) goto L_0x03d7
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r1 = r2.f299956j
            r3.append(r1)
            java.lang.String r1 = r3.toString()
        L_0x03d7:
            r0.mo108571i(r1)
            goto L_0x04a4
        L_0x03dc:
            if (r6 == 0) goto L_0x03ed
            java.lang.String r2 = r6.f297863d
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x03ed
            java.lang.String r14 = r6.f297863d
            java.lang.String r2 = r6.f297865f
            r16 = r2
            goto L_0x03f0
        L_0x03ed:
            r14 = 0
            r16 = 0
        L_0x03f0:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
            if (r2 == 0) goto L_0x03f8
            java.lang.String r14 = r3.f299297d
        L_0x03f8:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r16)
            if (r2 == 0) goto L_0x0401
            r3.getClass()
        L_0x0401:
            android.content.res.Resources r1 = r25.getResources()
            r2 = 2131821721(0x7f110499, float:1.9276193E38)
            java.lang.String r1 = r1.getString(r2)
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>(r1)
            r2.append(r14)
            java.lang.String r1 = r2.toString()
            r0.mo108571i(r1)
            goto L_0x04a4
        L_0x041d:
            android.graphics.Bitmap r1 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getBitmapNative((java.lang.String) r4)
            r0.mo108566d(r1, r13)
            goto L_0x04a4
        L_0x0426:
            java.lang.Class<hg.d> r1 = p548hg.C98450d.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            hg.d r1 = (p548hg.C98450d) r1
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            te3.kd0 r2 = r2.field_favProto
            java.util.LinkedList<te3.rc0> r2 = r2.f298618f
            java.lang.String r4 = "favItemInfo.favProto.dataList"
            gy3.C87412m.m108593f(r2, r4)
            java.util.Iterator r2 = r2.iterator()
        L_0x0440:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x045b
            java.lang.Object r4 = r2.next()
            te3.rc0 r4 = (te3.C101834rc0) r4
            int r4 = r4.f299258I
            if (r4 != r13) goto L_0x0453
            hg.d$a r4 = p548hg.C98450d.C59881a.TYPE_IMG
            goto L_0x0457
        L_0x0453:
            if (r4 != r10) goto L_0x0440
            hg.d$a r4 = p548hg.C98450d.C59881a.TYPE_VIDEO
        L_0x0457:
            r3.add(r4)
            goto L_0x0440
        L_0x045b:
            java.lang.String r1 = r1.km0(r3)
            r0.mo108571i(r1)
            goto L_0x04a4
        L_0x0463:
            android.graphics.Bitmap r1 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getBitmapNative((java.lang.String) r4)
            r0.mo108566d(r1, r13)
            goto L_0x04a4
        L_0x046b:
            com.tencent.mm.plugin.fav.ui.f1$e r2 = com.tencent.p014mm.plugin.fav.p047ui.C93594f1.C93599e.m118184a(r25, r26)
            java.lang.String r2 = r2.f270288a
            android.content.res.Resources r1 = r25.getResources()
            r3 = 2131821659(0x7f11045b, float:1.9276067E38)
            java.lang.String r1 = r1.getString(r3)
            java.lang.StringBuffer r3 = new java.lang.StringBuffer
            r3.<init>(r1)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            r0.mo108571i(r1)
            goto L_0x04a4
        L_0x048c:
            android.graphics.Bitmap r1 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getBitmapNative((java.lang.String) r4)
            r0.mo108566d(r1, r9)
            goto L_0x04a4
        L_0x0494:
            java.lang.String r3 = r5.f298628s
            r0.mo108571i(r3)
            r0.mo108572j(r13)
            qc1.e$c r3 = new qc1.e$c
            r3.<init>(r2, r1)
            r0.mo108564b(r3)
        L_0x04a4:
            return
        L_0x04a5:
            java.lang.String r0 = "MicroMsg.FavItemLogic"
            java.lang.String r1 = "getDisplayInfo favItemInfo is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qc1.C101110e.m132507j(wd3.u$h, android.content.Context, pb1.z):void");
    }

    /* renamed from: k */
    public static void m132508k(C78575u.C78583h hVar, Context context, C100755z zVar) {
        if (zVar == null || context == null) {
            Log.m105928w("MicroMsg.FavItemLogic", "getDisplayInfo favItemInfo is null");
            return;
        }
        C101834rc0 D = C100734q.m131813D(zVar);
        int i = zVar.field_type;
        if (i == 1) {
            hVar.mo108564b(new C101115e(zVar, context));
        } else if (i != 2) {
            if (i != 4) {
                if (i == 5) {
                    hVar.mo108564b(new C101117g(context, zVar));
                    return;
                } else if (i == 6) {
                    hVar.mo108564b(new C101116f(zVar.field_favProto.f298620h, context));
                    return;
                } else if (i == 8) {
                    hVar.mo108564b(new C101114d(context, zVar));
                    return;
                } else if (i == 14) {
                    hVar.mo108564b(new C101118h(context, zVar));
                    return;
                } else if (i != 16) {
                    if (i == 18) {
                        hVar.mo108564b(new C101111a(context, zVar));
                        return;
                    } else if (i == 20) {
                        hVar.mo108564b(new C101112b(zVar, context));
                        return;
                    } else {
                        return;
                    }
                }
            }
            hVar.mo108564b(new C101120j(zVar, context));
        } else {
            hVar.mo108564b(new C101119i(zVar, D, context));
        }
    }

    /* renamed from: l */
    public static void m132509l(C100755z zVar, C101811md0 md02, Intent intent) {
        m132510m(md02, intent);
        intent.putExtra("key_detail_info_id", zVar.field_localId);
        intent.putExtra("key_detail_data_id", zVar.f295175T0);
    }

    /* renamed from: m */
    public static void m132510m(C101811md0 md02, Intent intent) {
        intent.putExtra("key_detail_fav_scene", md02.f298813d);
        intent.putExtra("key_detail_fav_sub_scene", md02.f298814e);
        intent.putExtra("key_detail_fav_index", md02.f298815f);
        intent.putExtra("key_detail_fav_query", md02.f298817h);
        intent.putExtra("key_detail_fav_sessionid", md02.f298816g);
        intent.putExtra("key_detail_fav_tags", md02.f298818i);
    }
}
