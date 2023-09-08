package com.tencent.p014mm.p136ui.chatting;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.p136ui.MMFragment;
import com.tencent.p014mm.p136ui.transmit.SelectConversationUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.util.WXWebReporter;
import eb0.C75592q0;
import ke3.C88144b;

/* renamed from: com.tencent.mm.ui.chatting.m0 */
public class C73750m0 {

    /* renamed from: com.tencent.mm.ui.chatting.m0$a */
    public static final class C73751a implements C73753c {
        /* renamed from: a */
        public boolean mo102811a(String str, Context context, MMFragment mMFragment, String str2) {
            if (str.startsWith("weixin://openNativeUrl/weixinHB/startsendnormalhbrequest")) {
                Intent intent = new Intent();
                intent.putExtra("key_type", 0);
                C88144b.m109791i(context, "luckymoney", ".ui.LuckyMoneyPrepareUI", intent, (Bundle) null);
                return true;
            } else if (str.startsWith("weixin://openNativeUrl/weixinHB/startsendrandomhbrequest")) {
                Intent intent2 = new Intent();
                intent2.putExtra("key_type", 1);
                C88144b.m109791i(context, "luckymoney", ".ui.LuckyMoneyPrepareUI", intent2, (Bundle) null);
                return true;
            } else if (str.startsWith("weixin://openNativeUrl/weixinHB/startsendhblistrequest")) {
                Intent intent3 = new Intent();
                intent3.putExtra("key_type", 1);
                C88144b.m109791i(context, "luckymoney", ".ui.LuckyMoneyMyRecordUI", intent3, (Bundle) null);
                return true;
            } else if (str.startsWith("weixin://openNativeUrl/weixinHB/startreceivehblistrequest")) {
                Intent intent4 = new Intent();
                intent4.putExtra("key_type", 2);
                C88144b.m109791i(context, "luckymoney", ".ui.LuckyMoneyMyRecordUI", intent4, (Bundle) null);
                return true;
            } else if (str.startsWith("weixin://openNativeUrl/weixinHB/openDetail")) {
                Intent intent5 = new Intent();
                intent5.putExtra("key_native_url", str);
                C88144b.m109791i(context, "luckymoney", ".ui.LuckyMoneyBeforeDetailUI", intent5, (Bundle) null);
                return true;
            } else if (!str.startsWith("weixin://openNativeUrl/weixinHB/startreceivebizhbrequest")) {
                return false;
            } else {
                Intent intent6 = new Intent();
                intent6.putExtra("key_way", 5);
                intent6.putExtra("key_native_url", str);
                intent6.putExtra("key_static_from_scene", 1);
                C88144b.m109791i(context, "luckymoney", ".ui.LuckyMoneyBusiReceiveUI", intent6, (Bundle) null);
                return true;
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.m0$b */
    public static final class C73752b implements C73753c {
        /* renamed from: a */
        public boolean mo102811a(String str, Context context, MMFragment mMFragment, String str2) {
            if (Util.isNullOrNil(str)) {
                return false;
            }
            if (str.startsWith("weixin://openNativeUrl/myDeviceList")) {
                Intent intent = new Intent();
                intent.putExtra("device_brand_name", str2);
                C88144b.m109791i(context, "exdevice", ".ui.ExdeviceManageDeviceUI", intent, (Bundle) null);
                return true;
            }
            str.startsWith("weixin://openNativeUrl/bindMyDevice");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.m0$c */
    public interface C73753c {
        /* renamed from: a */
        boolean mo102811a(String str, Context context, MMFragment mMFragment, String str2);
    }

    /* renamed from: com.tencent.mm.ui.chatting.m0$d */
    public static final class C73754d implements C73753c {
        /* renamed from: a */
        public boolean mo102811a(String str, Context context, MMFragment mMFragment, String str2) {
            if (Util.isNullOrNil(str)) {
                Log.m105918d("MicroMsg.BizNativeUrlDispatcher", "nativeUrl is null.");
                return false;
            } else if (str.startsWith("weixin://wesport/recommend") && mMFragment != null) {
                Intent intent = new Intent(context, SelectConversationUI.class);
                intent.putExtra("Select_Talker_Name", str2);
                intent.putExtra("Select_block_List", str2);
                intent.putExtra("Select_Conv_Type", 3);
                intent.putExtra("Select_Send_Card", true);
                mMFragment.startActivityForResult(intent, WXWebReporter.WXWEB_IDKEY_DEBUG_LINK_ALL);
                return true;
            } else if (str.startsWith("weixin://openNativeUrl/rankMyHomepage")) {
                String s = C75592q0.m90789s();
                if (Util.isNullOrNil(s)) {
                    Log.m105920e("MicroMsg.BizNativeUrlDispatcher", "Get username from UserInfo return null or nil.");
                    return false;
                }
                Intent intent2 = new Intent();
                intent2.putExtra("username", s);
                C88144b.m109791i(context, "exdevice", ".ui.ExdeviceProfileUI", intent2, (Bundle) null);
                Log.m105924i("MicroMsg.BizNativeUrlDispatcher", "Jump to ExdeviceProfileUI.");
                return true;
            } else if (!str.startsWith("weixin://openNativeUrl/rankSetting")) {
                return false;
            } else {
                C88144b.m109789g(context, "exdevice", ".ui.ExdeviceSettingUI");
                return true;
            }
        }
    }

    /* renamed from: a */
    public static boolean m87347a(String str, Context context, MMFragment mMFragment, String str2) {
        if (Util.isNullOrNil(str)) {
            return false;
        }
        C73753c cVar = null;
        if (str.startsWith("weixin://openNativeUrl/weixinHB")) {
            cVar = new C73751a();
        } else {
            if (str.startsWith("weixin://openNativeUrl/myDeviceList") || str.startsWith("weixin://openNativeUrl/bindMyDevice")) {
                cVar = new C73752b();
            } else {
                if (str.startsWith("weixin://wesport/recommend") || str.startsWith("weixin://openNativeUrl/rankMyHomepage") || str.startsWith("weixin://openNativeUrl/rankSetting")) {
                    cVar = new C73754d();
                }
            }
        }
        return cVar != null && cVar.mo102811a(str, context, mMFragment, str2);
    }
}
