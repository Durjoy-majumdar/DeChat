package p160gy;

import ad0.C91998s;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Vibrator;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94901o;
import com.tencent.p014mm.plugin.sns.model.C94938q1;
import com.tencent.p014mm.plugin.sns.p106ui.C96085n8;
import com.tencent.p014mm.plugin.sns.p106ui.C96227t4;
import com.tencent.p014mm.plugin.sns.p106ui.SnsBrowseUI;
import com.tencent.p014mm.plugin.sns.p106ui.SnsOnlineVideoActivity;
import com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.video.C96254a;
import com.tencent.p014mm.plugin.sns.p106ui.video.SnsTimelineVideoView;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import f40.C86709a0;
import ht1.C60188n4;
import ht1.C60200t1;
import j20.C117292a;
import java.math.BigInteger;
import java.util.LinkedList;
import java.util.List;
import k20.C9556a;
import o40.C61926c;
import os2.C100416r;
import os2.C100417r0;
import p1081gi.C98121d;
import p166hy.C8830s0;
import p213oh.C11412b;
import pt2.C62497i;
import te3.C101779g1;
import te3.C101789j00;
import te3.C101804kv2;
import te3.C64378fw2;
import te3.C64682rk1;
import vr2.C102236a0;

@C86522b
/* renamed from: gy.e1 */
public class C98282e1 extends C86301e implements C8830s0 {
    public String C60(String str) {
        SnsMethodCalculate.markStartTimeMs("getLocalid", "com.tencent.mm.feature.sns.SnsUtilService");
        SnsInfo a = C100416r.m131408a(C100417r0.m131421j("sns_table_", new BigInteger(str).longValue()));
        if (a == null) {
            Object[] objArr = {str};
            int i = C11412b.f33577a;
            Log.m105921e("MicroMsg.SnsUtilService", "getLocalid, snsid = %s", objArr);
            SnsMethodCalculate.markEndTimeMs("getLocalid", "com.tencent.mm.feature.sns.SnsUtilService");
            return null;
        }
        String localid = a.getLocalid();
        SnsMethodCalculate.markEndTimeMs("getLocalid", "com.tencent.mm.feature.sns.SnsUtilService");
        return localid;
    }

    public String N00() {
        SnsMethodCalculate.markStartTimeMs("getMediaEditPublishIds", "com.tencent.mm.feature.sns.SnsUtilService");
        Vibrator vibrator = C102236a0.f301037a;
        SnsMethodCalculate.markStartTimeMs("getMediaEditPublishIds", "com.tencent.mm.plugin.sns.data.SnsUtil");
        String str = C102236a0.f301040d;
        C102236a0.f301040d = "";
        SnsMethodCalculate.markEndTimeMs("getMediaEditPublishIds", "com.tencent.mm.plugin.sns.data.SnsUtil");
        SnsMethodCalculate.markEndTimeMs("getMediaEditPublishIds", "com.tencent.mm.feature.sns.SnsUtilService");
        return str;
    }

    public Bitmap U90(String str) {
        SnsMethodCalculate.markStartTimeMs("decodeFileToBitmapByJavaHeap", "com.tencent.mm.feature.sns.SnsUtilService");
        Bitmap o = C102236a0.m134760o(str);
        SnsMethodCalculate.markEndTimeMs("decodeFileToBitmapByJavaHeap", "com.tencent.mm.feature.sns.SnsUtilService");
        return o;
    }

    /* renamed from: Xm */
    public void mo9665Xm(Context context, TimeLineObject timeLineObject) {
        C64378fw2 fw22;
        C64682rk1 rk12;
        C64682rk1 rk13;
        TimeLineObject timeLineObject2 = timeLineObject;
        Class cls = C60200t1.class;
        SnsMethodCalculate.markStartTimeMs("gotoFinderShareFeedPage", "com.tencent.mm.feature.sns.SnsUtilService");
        if (!WeChatBrands.Business.Entries.MomentChannels.checkAvailable(context)) {
            SnsMethodCalculate.markEndTimeMs("gotoFinderShareFeedPage", "com.tencent.mm.feature.sns.SnsUtilService");
            return;
        }
        C101789j00 j002 = timeLineObject2.ContentObj;
        String str = "gotoFinderShareFeedPage";
        String str2 = "com.tencent.mm.feature.sns.SnsUtilService";
        if (j002 == null || (rk13 = j002.f298431o) == null) {
            String str3 = "key_finder_teen_mode_user_id";
            String str4 = "key_finder_teen_mode_check";
            String str5 = "key_finder_teen_mode_scene";
            String str6 = "key_finder_teen_mode_user_name";
            Context context2 = context;
            if (!(j002 == null || (fw22 = j002.f298436t) == null)) {
                String str7 = str6;
                long B0 = C102236a0.m134706B0(fw22.f183241d);
                if (B0 != 0) {
                    Intent intent = new Intent();
                    intent.putExtra("report_scene", 3);
                    intent.putExtra("from_user", timeLineObject2.UserName);
                    intent.putExtra("feed_object_id", B0);
                    intent.putExtra("feed_object_nonceId", timeLineObject2.ContentObj.f298436t.f183248n);
                    intent.putExtra("business_type", 1);
                    intent.putExtra("key_from_user_name", timeLineObject2.UserName);
                    intent.putExtra("key_ec_source", timeLineObject2.ContentObj.f298431o.f185182E);
                    intent.putExtra("tab_type", 5);
                    intent.putExtra(str4, ((C60200t1) C86312j.m106911c(cls)).mo76861l7().mo83771R5());
                    intent.putExtra(str5, 3);
                    intent.putExtra(str7, timeLineObject2.ContentObj.f298436t.f183243f);
                    intent.putExtra(str3, timeLineObject2.ContentObj.f298436t.f183242e);
                    C60188n4 n4Var = (C60188n4) C86312j.m106911c(C60188n4.class);
                    if (!n4Var.mo75337Fv() || !n4Var.k90() || (rk12 = timeLineObject2.ContentObj.f298431o) == null) {
                        ((C60200t1) C86312j.m106911c(cls)).mo76842e7(4, 2, 53, intent);
                        ((C60200t1) C86312j.m106911c(cls)).mo76864nr(context, intent);
                    } else {
                        intent.putExtra("KEY_OBJECT_ID", C61926c.m72671P(rk12.f185183d));
                        intent.putExtra("KEY_OBJECT_NONCE_ID", timeLineObject2.ContentObj.f298431o.f185191o);
                        intent.putExtra("FROM_SCENE_KEY", 6);
                        intent.putExtra("KEY_FINDER_POST_FINISH_JUMP_HOT_TAB", true);
                        ((C60200t1) C86312j.m106911c(cls)).mo76842e7(4, 2, 20, intent);
                        ((C60200t1) C86312j.m106911c(cls)).Hm0(context, intent);
                    }
                }
            }
        } else {
            String str8 = "key_finder_teen_mode_user_id";
            long B02 = C102236a0.m134706B0(rk13.f185183d);
            String str9 = "key_finder_teen_mode_user_name";
            String str10 = "key_finder_teen_mode_scene";
            long j = timeLineObject2.ContentObj.f298431o.f185192p;
            int i = (B02 > 0 ? 1 : (B02 == 0 ? 0 : -1));
            if (!(i == 0 && j == 0)) {
                int i2 = i;
                Intent intent2 = new Intent();
                intent2.putExtra("report_scene", 3);
                intent2.putExtra("from_user", timeLineObject2.UserName);
                intent2.putExtra("feed_object_id", B02);
                intent2.putExtra("feed_object_nonceId", timeLineObject2.ContentObj.f298431o.f185191o);
                intent2.putExtra("business_type", 0);
                intent2.putExtra("finder_user_name", timeLineObject2.ContentObj.f298431o.f185184e);
                intent2.putExtra("key_from_user_name", timeLineObject2.UserName);
                intent2.putExtra("key_ec_source", timeLineObject2.ContentObj.f298431o.f185182E);
                intent2.putExtra("tab_type", 5);
                intent2.putExtra("feed_local_id", j);
                intent2.putExtra("KEY_AUTHORIZATION_CONTENT", C68070l.C68072b.m80420s(C96085n8.m123113u(timeLineObject2.ContentObj.f298431o), (String) null, (C98121d) null));
                intent2.putExtra("KEY_FINDER_FORWARD_SOURCE", timeLineObject2.ContentObj.f298431o.f185180C);
                intent2.putExtra("key_finder_teen_mode_check", ((C60200t1) C86312j.m106911c(cls)).mo76861l7().mo83771R5());
                intent2.putExtra(str10, 3);
                intent2.putExtra(str9, C102236a0.m134703A(timeLineObject2.ContentObj.f298431o));
                intent2.putExtra(str8, timeLineObject2.ContentObj.f298431o.f185184e);
                if (i2 == 0 && j != 0) {
                    intent2.putExtra("key_posting_scene", true);
                }
                C60188n4 n4Var2 = (C60188n4) C86312j.m106911c(C60188n4.class);
                if (!n4Var2.mo75337Fv() || !n4Var2.k90()) {
                    ((C60200t1) C86312j.m106911c(cls)).mo76842e7(4, 2, 38, intent2);
                    ((C60200t1) C86312j.m106911c(cls)).mo76864nr(context, intent2);
                } else {
                    intent2.putExtra("KEY_OBJECT_ID", C61926c.m72671P(timeLineObject2.ContentObj.f298431o.f185183d));
                    intent2.putExtra("KEY_OBJECT_NONCE_ID", timeLineObject2.ContentObj.f298431o.f185191o);
                    intent2.putExtra("FROM_SCENE_KEY", 6);
                    intent2.putExtra("KEY_FINDER_POST_FINISH_JUMP_HOT_TAB", true);
                    ((C60200t1) C86312j.m106911c(cls)).mo76842e7(4, 2, 20, intent2);
                    ((C60200t1) C86312j.m106911c(cls)).Hm0(context, intent2);
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs(str, str2);
    }

    /* renamed from: Zn */
    public void mo9666Zn(Context context, TimeLineObject timeLineObject, int i) {
        String str;
        Context context2 = context;
        TimeLineObject timeLineObject2 = timeLineObject;
        int i2 = i;
        SnsMethodCalculate.markStartTimeMs("exportVideoPlay", "com.tencent.mm.feature.sns.SnsUtilService");
        SnsMethodCalculate.markStartTimeMs("exportVideoPlay", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        String C60 = ((C8830s0) C86312j.m106911c(C8830s0.class)).C60(timeLineObject2.f283893Id);
        SnsInfo DN = C94866e1.Yx0().mo139798DN(C60);
        if (DN == null) {
            Log.m105925i("MicroMsg.TimelineClickListener", "onsight click but info is null localid %s", C60);
            SnsMethodCalculate.markEndTimeMs("exportVideoPlay", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        } else {
            LinkedList<C101804kv2> linkedList = timeLineObject2.ContentObj.f298427h;
            if (linkedList == null || linkedList.size() == 0) {
                Log.m105920e("MicroMsg.TimelineClickListener", "the obj.ContentObj.MediaObjList is null");
                SnsMethodCalculate.markEndTimeMs("exportVideoPlay", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
            } else {
                C101804kv2 kv22 = timeLineObject2.ContentObj.f298427h.get(0);
                if (i2 == 0) {
                    C91998s.m115550d(717);
                } else {
                    C91998s.m115549c(717);
                }
                C102236a0.m134728W(DN);
                DN.isAd();
                DN.getUxinfo();
                String str2 = kv22.f298689d;
                C91998s d = i2 == 0 ? C91998s.m115550d(745) : C91998s.m115549c(745);
                C102236a0.m134728W(DN);
                DN.isAd();
                String e = C94938q1.m120518e(C94866e1.m120262YO(), kv22.f298689d);
                String T = C102236a0.m134725T(kv22);
                String str3 = "";
                if (C86013q1.m106450k(e + T)) {
                    String str4 = e + T;
                    str3 = e + C102236a0.m134729X(kv22);
                    str = str4;
                } else {
                    str = str3;
                }
                if (C86013q1.m106450k(e + C102236a0.m134735b0(kv22))) {
                    str = e + C102236a0.m134735b0(kv22);
                    str3 = e + C102236a0.m134739d0(kv22);
                }
                C115669n.INSTANCE.mo160131h(11444, 3);
                Log.m105924i("MicroMsg.TimelineClickListener", "it not ad video, use online video activity to play.");
                Intent intent = new Intent();
                intent.setClass(context2, SnsOnlineVideoActivity.class);
                intent.addFlags(268435456);
                intent.putExtra("intent_videopath", str);
                intent.putExtra("intent_thumbpath", str3);
                intent.putExtra("intent_localid", C60);
                intent.putExtra("intent_isad", false);
                intent.putExtra("intent_from_scene", i2);
                intent.putExtra("sns_video_scene", 5);
                C62497i iVar = C62497i.f177536a;
                C101779g1 g1Var = timeLineObject2.actionInfo.f298580j;
                intent.putExtra("intent_third_sdk_msg", iVar.mo87530b(g1Var.f298271d, g1Var.f298273f));
                intent.putExtra("intent_publish_id", C102236a0.m134763p0(DN.field_snsId));
                intent.putExtra("intent_bottom_height", C75044y4.m89991c(context));
                SnsTimelineVideoView b = C96254a.m123394d().mo133930b(timeLineObject2.f283893Id);
                if (b != null && b.mo132371x()) {
                    intent.putExtra("intent_fromplayingvideo", true);
                    intent.putExtra("intent_fromplayingvideo_tlobjid", timeLineObject2.f283893Id);
                    intent.putExtra("intent_session_id", b.getSessionId());
                    intent.putExtra("intent_session_timestamp", b.getSessionTimestamp());
                }
                d.mo125842g(intent);
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener", "exportVideoPlay", "(Landroid/content/Context;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context2.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(context, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener", "exportVideoPlay", "(Landroid/content/Context;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                TimelineClickListener.m122978D(context2, DN.getTimeLine());
                SnsMethodCalculate.markEndTimeMs("exportVideoPlay", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
            }
        }
        SnsMethodCalculate.markEndTimeMs("exportVideoPlay", "com.tencent.mm.feature.sns.SnsUtilService");
    }

    /* renamed from: ey */
    public String mo9667ey() {
        SnsMethodCalculate.markStartTimeMs("checkSnsPostSessionId", "com.tencent.mm.feature.sns.SnsUtilService");
        String l = C102236a0.m134754l();
        SnsMethodCalculate.markEndTimeMs("checkSnsPostSessionId", "com.tencent.mm.feature.sns.SnsUtilService");
        return l;
    }

    /* renamed from: fw */
    public String mo9668fw(String str) {
        SnsMethodCalculate.markStartTimeMs("getSnsPublishId", "com.tencent.mm.feature.sns.SnsUtilService");
        SnsInfo DN = C94866e1.Yx0().mo139798DN(str);
        if (DN != null) {
            Vibrator vibrator = C102236a0.f301037a;
            SnsMethodCalculate.markStartTimeMs("makeSnsPublishId", "com.tencent.mm.plugin.sns.data.SnsUtil");
            String str2 = "sns_" + C102236a0.m134765q0(DN.field_snsId);
            SnsMethodCalculate.markEndTimeMs("makeSnsPublishId", "com.tencent.mm.plugin.sns.data.SnsUtil");
            SnsMethodCalculate.markEndTimeMs("getSnsPublishId", "com.tencent.mm.feature.sns.SnsUtilService");
            return str2;
        }
        SnsMethodCalculate.markEndTimeMs("getSnsPublishId", "com.tencent.mm.feature.sns.SnsUtilService");
        return "";
    }

    /* renamed from: sk */
    public boolean mo9669sk(String str, int i, List<C101804kv2> list) {
        SnsMethodCalculate.markStartTimeMs("initDataMediaList", "com.tencent.mm.feature.sns.SnsUtilService");
        boolean a = C96227t4.m123357a(str, i, list);
        SnsMethodCalculate.markEndTimeMs("initDataMediaList", "com.tencent.mm.feature.sns.SnsUtilService");
        return a;
    }

    /* renamed from: xF */
    public String mo9670xF(C101804kv2 kv22) {
        SnsMethodCalculate.markStartTimeMs("getSnsDirectThumbPath", "com.tencent.mm.feature.sns.SnsUtilService");
        String o = C94901o.m120386o(kv22);
        SnsMethodCalculate.markEndTimeMs("getSnsDirectThumbPath", "com.tencent.mm.feature.sns.SnsUtilService");
        return o;
    }

    public String xb0(String str) {
        SnsMethodCalculate.markStartTimeMs("getSnsAuthor", "com.tencent.mm.feature.sns.SnsUtilService");
        SnsInfo DN = C94866e1.Yx0().mo139798DN(str);
        if (DN != null) {
            String str2 = DN.field_userName;
            SnsMethodCalculate.markEndTimeMs("getSnsAuthor", "com.tencent.mm.feature.sns.SnsUtilService");
            return str2;
        }
        SnsMethodCalculate.markEndTimeMs("getSnsAuthor", "com.tencent.mm.feature.sns.SnsUtilService");
        return "";
    }

    public void xe0(Context context, int i, int i2, TimeLineObject timeLineObject, String str, int i3) {
        Intent intent;
        int i4;
        Context context2 = context;
        int i5 = i;
        int i6 = i3;
        SnsMethodCalculate.markStartTimeMs("showSnsImg", "com.tencent.mm.feature.sns.SnsUtilService");
        List<C101804kv2> list = C96227t4.f281185c;
        SnsMethodCalculate.markStartTimeMs("showImg", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
        String C60 = ((C8830s0) C86312j.m106911c(C8830s0.class)).C60(timeLineObject.f283893Id);
        if (!C96227t4.m123357a(C60, i6, C96227t4.f281185c)) {
            Log.m105921e("MicroMsg.SnsImageDialogShowerMgr", "[showImg] initDataMediaList, localId:%s position:%s", C60, Integer.valueOf(i3));
            SnsMethodCalculate.markEndTimeMs("showImg", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
        } else {
            C86709a0.m107528h();
            if (!C86709a0.m107535s().mo121147n()) {
                Log.m105920e("MicroMsg.SnsImageDialogShowerMgr", "[showImg] isSDCardAvailable:false");
                SnsMethodCalculate.markEndTimeMs("showImg", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
            } else {
                SnsInfo b = C100416r.m131409b(C60);
                Intent intent2 = new Intent();
                if (b != null) {
                    TimeLineObject timeLine = b.getTimeLine();
                    C101804kv2 kv22 = i6 < timeLine.ContentObj.f298427h.size() ? timeLine.ContentObj.f298427h.get(i6) : new C101804kv2();
                    if (i5 == 1) {
                        C91998s.m115550d(716);
                    } else {
                        C91998s.m115549c(716);
                    }
                    C102236a0.m134728W(b);
                    b.isAd();
                    b.getUxinfo();
                    String str2 = kv22.f298689d;
                    timeLine.ContentObj.f298427h.size();
                    C91998s d = i5 == 1 ? C91998s.m115550d(744) : C91998s.m115549c(744);
                    C102236a0.m134728W(b);
                    b.isAd();
                    b.getUxinfo();
                    d.mo125842g(intent2);
                    Bundle bundle = new Bundle();
                    bundle.putInt("stat_scene", 3);
                    bundle.putString("stat_msg_id", "sns_" + C102236a0.m134765q0(b.field_snsId));
                    bundle.putString("stat_send_msg_user", b.getUserName());
                    bundle.putInt("pay_qrcode_session_type", 3);
                    bundle.putString("pay_qrcode_session_name", b.getUserName());
                    bundle.putString("pay_qrcode_timeline_objid", C102236a0.m134765q0(b.field_snsId));
                    intent = intent2;
                    intent.putExtra("_stat_obj", bundle);
                } else {
                    intent = intent2;
                    Log.m105920e("MicroMsg.SnsImageDialogShowerMgr", "[showImg] info is null!");
                }
                if (i5 == -1) {
                    i4 = 1;
                    intent.putExtra("k_is_from_sns_msg_ui", true);
                } else {
                    i4 = 1;
                }
                if (i5 == -1) {
                    intent.putExtra("key_from_scene", 3);
                } else if (i5 == i4) {
                    intent.putExtra("key_from_scene", i4);
                } else if (i5 == 2) {
                    intent.putExtra("key_from_scene", 2);
                }
                intent.putExtra("sns_gallery_localId", C60);
                intent.putExtra("sns_gallery_position", i6);
                intent.putExtra("sns_gallery_showtype", i4);
                intent.putExtra("K_ad_scene", i5);
                intent.putExtra("K_source", i5);
                intent.putExtra("K_ad_source", i2);
                intent.putExtra("k_is_from_sns_main_timeline", false);
                intent.putExtra("sns_ad_exposure_start_time", 0);
                intent.setClass(context2, SnsBrowseUI.class);
                intent.addFlags(268435456);
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsImageDialogShowerMgr", "showImg", "(Landroid/content/Context;IILcom/tencent/mm/protocal/protobuf/TimeLineObject;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context2.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(context, "com/tencent/mm/plugin/sns/ui/SnsImageDialogShowerMgr", "showImg", "(Landroid/content/Context;IILcom/tencent/mm/protocal/protobuf/TimeLineObject;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                SnsMethodCalculate.markEndTimeMs("showImg", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
            }
        }
        SnsMethodCalculate.markEndTimeMs("showSnsImg", "com.tencent.mm.feature.sns.SnsUtilService");
    }

    public String ys0(TimeLineObject timeLineObject) {
        C101789j00 j002;
        LinkedList<C101804kv2> linkedList;
        SnsMethodCalculate.markStartTimeMs("getSnsThumbName", "com.tencent.mm.feature.sns.SnsUtilService");
        String str = "";
        if (!(timeLineObject == null || (j002 = timeLineObject.ContentObj) == null || (linkedList = j002.f298427h) == null || linkedList.size() < 1)) {
            String str2 = C94938q1.m120518e(C94866e1.m120262YO(), timeLineObject.ContentObj.f298427h.get(0).f298689d) + C102236a0.m134729X(timeLineObject.ContentObj.f298427h.get(0));
            if (C86013q1.m106450k(str2)) {
                str = str2;
            }
        }
        SnsMethodCalculate.markEndTimeMs("getSnsThumbName", "com.tencent.mm.feature.sns.SnsUtilService");
        return str;
    }
}
