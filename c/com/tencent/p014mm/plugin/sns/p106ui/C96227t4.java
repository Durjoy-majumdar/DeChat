package com.tencent.p014mm.plugin.sns.p106ui;

import ad0.C91998s;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.sns.model.C94851d1;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94895m2;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import os2.C100416r;
import te3.C101789j00;
import te3.C101804kv2;
import vr2.C102236a0;

/* renamed from: com.tencent.mm.plugin.sns.ui.t4 */
public class C96227t4 {

    /* renamed from: c */
    public static List<C101804kv2> f281185c = new ArrayList();

    /* renamed from: a */
    public List<C101804kv2> f281186a = new ArrayList();

    /* renamed from: b */
    public Activity f281187b;

    public C96227t4(Activity activity) {
        this.f281187b = activity;
    }

    /* renamed from: a */
    public static boolean m123357a(String str, int i, List<C101804kv2> list) {
        SnsMethodCalculate.markStartTimeMs("initDataMediaList", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
        SnsInfo b = C100416r.m131409b(str);
        if (b == null) {
            Log.m105921e("MicroMsg.SnsImageDialogShowerMgr", "[initDataMediaList] snsinfo is null! localId:%s index:%ss", str, Integer.valueOf(i));
            SnsMethodCalculate.markEndTimeMs("initDataMediaList", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
            return false;
        }
        TimeLineObject timeLine = b.getTimeLine();
        C101789j00 j002 = timeLine.ContentObj;
        if (j002 == null) {
            Log.m105920e("MicroMsg.SnsImageDialogShowerMgr", "[initDataMediaList] timeline.ContentObj is null!");
            SnsMethodCalculate.markEndTimeMs("initDataMediaList", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
            return false;
        } else if (j002.f298427h.size() == 0) {
            Log.m105920e("MicroMsg.SnsImageDialogShowerMgr", "[initDataMediaList] timeline.ContentObj.MediaObjList.size() == 0");
            SnsMethodCalculate.markEndTimeMs("initDataMediaList", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
            return false;
        } else {
            list.clear();
            Iterator<C101804kv2> it = timeLine.ContentObj.f298427h.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                C101804kv2 next = it.next();
                list.add(next);
                if (i != i2 || C94866e1.Fx0().mo131138u(next)) {
                    i2++;
                } else {
                    Log.m105920e("MicroMsg.SnsImageDialogShowerMgr", "[initDataMediaList] is not exists");
                    SnsMethodCalculate.markEndTimeMs("initDataMediaList", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
                    return false;
                }
            }
            SnsMethodCalculate.markEndTimeMs("initDataMediaList", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
            return true;
        }
    }

    /* renamed from: b */
    public static void m123358b(Activity activity, Intent intent, SnsInfo snsInfo, C96235u4 u4Var, int i, int i2, C94851d1 d1Var) {
        Activity activity2 = activity;
        Intent intent2 = intent;
        SnsInfo snsInfo2 = snsInfo;
        C96235u4 u4Var2 = u4Var;
        int i3 = i;
        SnsMethodCalculate.markStartTimeMs("showImg", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
        if (intent2 == null) {
            Log.m105920e("MicroMsg.SnsImageDialogShowerMgr", "[showImg] intent is null!");
            SnsMethodCalculate.markEndTimeMs("showImg", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
        } else if (d1Var == null) {
            Log.m105920e("MicroMsg.SnsImageDialogShowerMgr", "[showImg] snsContext is null!");
            SnsMethodCalculate.markEndTimeMs("showImg", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
        } else if (snsInfo2 == null) {
            Log.m105920e("MicroMsg.SnsImageDialogShowerMgr", "[showImg] info is null!");
            SnsMethodCalculate.markEndTimeMs("showImg", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
        } else {
            C86709a0.m107528h();
            if (!C86709a0.m107535s().mo121147n()) {
                Log.m105920e("MicroMsg.SnsImageDialogShowerMgr", "[showImg] is not SDCardAvailable");
                SnsMethodCalculate.markEndTimeMs("showImg", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
                return;
            }
            String str = u4Var2.f281206a;
            int i4 = u4Var2.f281207b;
            int i5 = u4Var2.f281208c;
            C101789j00 j002 = snsInfo.getTimeLine().ContentObj;
            if (j002 == null || j002.f298427h.size() == 0) {
                Log.m105920e("MicroMsg.SnsImageDialogShowerMgr", "[showImg] is ContentObj null");
                SnsMethodCalculate.markEndTimeMs("showImg", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
                return;
            }
            if (d1Var.mo130970a() != null) {
                d1Var.mo130970a().mo131335v(snsInfo2);
            }
            TimeLineObject timeLine = snsInfo.getTimeLine();
            C101804kv2 kv22 = i4 < timeLine.ContentObj.f298427h.size() ? timeLine.ContentObj.f298427h.get(i4) : new C101804kv2();
            if (!C94866e1.Fx0().mo131138u(kv22)) {
                Log.m105921e("MicroMsg.SnsImageDialogShowerMgr", "[showImg] media[%s] is illegal", Integer.valueOf(kv22.f298701s));
                SnsMethodCalculate.markEndTimeMs("showImg", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
                return;
            }
            if (i3 == 1) {
                C91998s.m115550d(716);
            } else {
                C91998s.m115549c(716);
            }
            C102236a0.m134728W(snsInfo);
            snsInfo.isAd();
            snsInfo.getUxinfo();
            String str2 = kv22.f298689d;
            timeLine.ContentObj.f298427h.size();
            C91998s d = i3 == 1 ? C91998s.m115550d(744) : C91998s.m115549c(744);
            C102236a0.m134728W(snsInfo);
            snsInfo.isAd();
            snsInfo.getUxinfo();
            d.mo125842g(intent2);
            intent2.putExtra("sns_soon_enter_photoedit_ui", true);
            intent2.putExtra("sns_gallery_localId", str);
            intent2.putExtra("sns_gallery_position", i4);
            intent2.putExtra("sns_position", i5);
            intent2.putExtra("sns_gallery_showtype", 1);
            intent2.putExtra("K_ad_scene", i3);
            intent2.putExtra("K_ad_source", i2);
            intent2.putExtra("k_is_from_sns_main_timeline", true);
            intent2.setClass(activity, SnsBrowseUI.class);
            if (i3 == -1) {
                intent2.putExtra("key_from_scene", 3);
            } else if (i3 == 1) {
                intent2.putExtra("key_from_scene", 1);
            } else if (i3 == 2) {
                intent2.putExtra("key_from_scene", 2);
            }
            Bundle bundle = new Bundle();
            bundle.putInt("stat_scene", 3);
            bundle.putString("stat_msg_id", "sns_" + C102236a0.m134765q0(snsInfo2.field_snsId));
            bundle.putString("stat_send_msg_user", snsInfo.getUserName());
            bundle.putInt("pay_qrcode_session_type", 3);
            bundle.putString("pay_qrcode_session_name", snsInfo.getUserName());
            bundle.putString("pay_qrcode_timeline_objid", C102236a0.m134765q0(snsInfo2.field_snsId));
            intent2.putExtra("_stat_obj", bundle);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent2);
            C117292a.m165358d(activity, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsImageDialogShowerMgr", "showImg", "(Landroid/app/Activity;Landroid/content/Intent;Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Lcom/tencent/mm/plugin/sns/ui/SnsImageViewTag;IILcom/tencent/mm/plugin/sns/model/SnsContext;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(activity, "com/tencent/mm/plugin/sns/ui/SnsImageDialogShowerMgr", "showImg", "(Landroid/app/Activity;Landroid/content/Intent;Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Lcom/tencent/mm/plugin/sns/ui/SnsImageViewTag;IILcom/tencent/mm/plugin/sns/model/SnsContext;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.overridePendingTransition(0, 0);
            SnsMethodCalculate.markEndTimeMs("showImg", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
        }
    }

    /* renamed from: c */
    public void mo133892c(View view, int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("showImg", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
        SnsMethodCalculate.markStartTimeMs("showImg", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
        mo133893d(view, i, i2, (C94895m2) null, 0, false, 0);
        SnsMethodCalculate.markEndTimeMs("showImg", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
        SnsMethodCalculate.markEndTimeMs("showImg", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
    }

    /* renamed from: d */
    public void mo133893d(View view, int i, int i2, C94895m2 m2Var, long j, boolean z, int i3) {
        String str;
        String str2;
        String str3;
        String str4;
        int i4;
        View view2 = view;
        int i5 = i;
        SnsMethodCalculate.markStartTimeMs("showImg", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
        Log.printInfoStack("MicroMsg.SnsImageDialogShowerMgr", "showImg", new Object[0]);
        if (view2 == null) {
            Log.m105921e("MicroMsg.SnsImageDialogShowerMgr", "[showImg] view is null! scene:%s", Integer.valueOf(i));
            SnsMethodCalculate.markEndTimeMs("showImg", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
            return;
        }
        Object tag = view.getTag();
        if (tag instanceof C96235u4) {
            C96235u4 u4Var = (C96235u4) tag;
            String str5 = u4Var.f281206a;
            int i6 = u4Var.f281207b;
            int i7 = u4Var.f281208c;
            SnsMethodCalculate.markStartTimeMs("isForbidAccess", "com.tencent.mm.plugin.sns.ui.SnsImageViewTag");
            boolean z2 = u4Var.f281211f == 2;
            SnsMethodCalculate.markEndTimeMs("isForbidAccess", "com.tencent.mm.plugin.sns.ui.SnsImageViewTag");
            if (!m123357a(str5, i6, this.f281186a)) {
                Log.m105921e("MicroMsg.SnsImageDialogShowerMgr", "[showImg] initDataMediaList, localId:%s position:%s", str5, Integer.valueOf(i6));
                SnsMethodCalculate.markEndTimeMs("showImg", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
                return;
            }
            C86709a0.m107528h();
            if (!C86709a0.m107535s().mo121147n()) {
                Log.m105920e("MicroMsg.SnsImageDialogShowerMgr", "[showImg] isSDCardAvailable:false");
                SnsMethodCalculate.markEndTimeMs("showImg", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
                return;
            }
            SnsInfo b = C100416r.m131409b(str5);
            if (!m123357a(str5, i6, this.f281186a)) {
                Log.m105921e("MicroMsg.SnsImageDialogShowerMgr", "[showImg] initDataMediaList, localId:%s position:%s", str5, Integer.valueOf(i6));
                SnsMethodCalculate.markEndTimeMs("showImg", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
                return;
            }
            Intent intent = new Intent();
            if (b != null) {
                if (m2Var != null) {
                    m2Var.mo130970a().mo131335v(b);
                }
                TimeLineObject timeLine = b.getTimeLine();
                C101804kv2 kv22 = u4Var.f281207b < timeLine.ContentObj.f298427h.size() ? timeLine.ContentObj.f298427h.get(u4Var.f281207b) : new C101804kv2();
                if (i5 == 1) {
                    C91998s.m115550d(716);
                } else {
                    C91998s.m115549c(716);
                }
                C102236a0.m134728W(b);
                b.isAd();
                b.getUxinfo();
                String str6 = kv22.f298689d;
                timeLine.ContentObj.f298427h.size();
                C91998s d = i5 == 1 ? C91998s.m115550d(744) : C91998s.m115549c(744);
                C102236a0.m134728W(b);
                b.isAd();
                b.getUxinfo();
                d.mo125842g(intent);
                Bundle bundle = new Bundle();
                bundle.putInt("stat_scene", 3);
                StringBuilder sb = new StringBuilder();
                sb.append("sns_");
                str4 = "showImg";
                str3 = "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr";
                sb.append(C102236a0.m134765q0(b.field_snsId));
                bundle.putString("stat_msg_id", sb.toString());
                bundle.putString("stat_send_msg_user", b.getUserName());
                bundle.putInt("pay_qrcode_session_type", 3);
                bundle.putString("pay_qrcode_session_name", b.getUserName());
                bundle.putString("pay_qrcode_timeline_objid", C102236a0.m134765q0(b.field_snsId));
                intent.putExtra("_stat_obj", bundle);
            } else {
                str4 = "showImg";
                str3 = "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr";
                Log.m105920e("MicroMsg.SnsImageDialogShowerMgr", "[showImg] info is null!");
            }
            int[] iArr = new int[2];
            if (C85875k4.m106208w()) {
                view2.getLocationOnScreen(iArr);
            } else {
                view2.getLocationInWindow(iArr);
            }
            int width = view.getWidth();
            int height = view.getHeight();
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
            intent.putExtra("sns_gallery_localId", str5);
            intent.putExtra("sns_gallery_position", i6);
            intent.putExtra("sns_position", i7);
            intent.putExtra("sns_gallery_showtype", i4);
            intent.putExtra("K_ad_scene", i5);
            intent.putExtra("K_source", i5);
            intent.putExtra("K_ad_source", i2);
            intent.putExtra("k_is_from_sns_main_timeline", u4Var.f281210e);
            int i8 = iArr[0];
            int i9 = iArr[1];
            intent.putExtra("sns_gallery_thumb_location", new Rect(i8, i9, width + i8, height + i9));
            intent.putExtra("sns_ad_exposure_start_time", j);
            intent.putExtra("k_forbid_access", z2);
            intent.putExtra("k_feedid_need_check_forbid_access", u4Var.f281212g);
            intent.setClass(this.f281187b, SnsBrowseUI.class);
            if (z) {
                Activity activity = this.f281187b;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf(i3));
                aVar.mo10233c(intent);
                C117292a.m165364j(activity, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsImageDialogShowerMgr", "showImg", "(Landroid/view/View;IILcom/tencent/mm/plugin/sns/model/TimelineContext;JZI)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
            } else {
                Activity activity2 = this.f281187b;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(intent);
                Activity activity3 = activity2;
                C117292a.m165358d(activity3, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsImageDialogShowerMgr", "showImg", "(Landroid/view/View;IILcom/tencent/mm/plugin/sns/model/TimelineContext;JZI)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                activity2.startActivity((Intent) aVar2.mo10231a(0));
                C117292a.m165359e(activity3, "com/tencent/mm/plugin/sns/ui/SnsImageDialogShowerMgr", "showImg", "(Landroid/view/View;IILcom/tencent/mm/plugin/sns/model/TimelineContext;JZI)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
            this.f281187b.overridePendingTransition(0, 0);
            str = str4;
            str2 = str3;
        } else {
            str = "showImg";
            str2 = "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr";
        }
        SnsMethodCalculate.markEndTimeMs(str, str2);
    }
}
