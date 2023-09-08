package com.tencent.p014mm.p136ui.chatting.component;

import android.content.Intent;
import android.os.Bundle;
import android.view.ViewStub;
import ck3.C67391b;
import com.tencent.p014mm.p136ui.MMFragment;
import com.tencent.p014mm.p136ui.chatting.C74343y0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.vfs.C86013q1;
import eb0.C31543z5;
import eb0.C45628s0;
import eb0.C75592q0;
import eb0.C75604z3;
import eb0.C97625j3;
import f40.C86709a0;
import lc3.C10485b;
import zj3.C79348e;

/* renamed from: com.tencent.mm.ui.chatting.component.l0 */
public class C73521l0 {
    /* renamed from: a */
    public static void m86924a(C67391b bVar, C72963f4 f4Var, Intent intent) {
        if (bVar != null && f4Var != null && intent != null) {
            String r = bVar.mo91577r();
            String username = bVar.mo91574o().getUsername();
            boolean q1 = ((C79348e) bVar.f193278b.mo102812a(C79348e.class)).mo70071q1();
            if (bVar.mo91582w() || q1) {
                if (bVar.mo91582w()) {
                    String s = C75604z3.m90847s(f4Var.getContent());
                    if (!(username == null || s == null || s.length() <= 0)) {
                        username = s;
                    }
                } else {
                    username = f4Var.mo108760m2();
                }
            }
            Bundle bundle = new Bundle();
            if (bVar.mo91582w()) {
                bundle.putInt("stat_scene", 2);
            } else {
                bundle.putInt("stat_scene", C45628s0.m50738C(r) ? 7 : 1);
            }
            bundle.putString("stat_msg_id", "msg_" + Long.toString(f4Var.mo108774y2()));
            bundle.putString("stat_chat_talker_username", r);
            bundle.putString("stat_send_msg_user", username);
            intent.putExtra("_stat_obj", bundle);
        }
    }

    /* renamed from: b */
    public static boolean m86925b(C72963f4 f4Var, String str) {
        long a = C31543z5.m39451a();
        long createTime = f4Var.getCreateTime();
        if (a - createTime <= m86926c(f4Var) || (!Util.isNullOrNil(str) && C86013q1.m106450k(str))) {
            return false;
        }
        Log.m105925i("MicroMsg.ChattingUI.ChattingLogic", "cur time: %s, msg time: %s, path: %s.", Long.valueOf(a), Long.valueOf(createTime), str);
        return true;
    }

    /* renamed from: c */
    public static long m86926c(C72963f4 f4Var) {
        int b;
        Class cls = C10485b.class;
        if (f4Var == null) {
            Log.m105920e("MicroMsg.ChattingUI.ChattingLogic", "getImgVideoExpireIntervalTime, msg is null.");
            b = ((C10485b) C86709a0.m107533q(cls)).vh0().mo107404b("MsgCommonMediaExpiredInterval", 432000);
        } else if (f4Var.mo100979R3()) {
            Log.m105924i("MicroMsg.ChattingUI.ChattingLogic", "getImgVideoExpireIntervalTime, isImage");
            b = ((C10485b) C86709a0.m107533q(cls)).vh0().mo107404b("MsgCommonImgExpiredInterval", 432000);
        } else if (f4Var.mo100994f4() || f4Var.mo100989b4()) {
            Log.m105924i("MicroMsg.ChattingUI.ChattingLogic", "getImgVideoExpireIntervalTime, isVideo");
            b = ((C10485b) C86709a0.m107533q(cls)).vh0().mo107404b("MsgCommonVideoExpiredInterval", 432000);
        } else if (C74343y0.m88782z(f4Var)) {
            Log.m105924i("MicroMsg.ChattingUI.ChattingLogic", "getImgVideoExpireIntervalTime, isFileMsg");
            b = ((C10485b) C86709a0.m107533q(cls)).vh0().mo107404b("MsgFileExpiredInterval", 432000);
        } else {
            Log.m105921e("MicroMsg.ChattingUI.ChattingLogic", "getImgVideoExpireIntervalTime, is nothing type = %s, stack = %s.", Integer.valueOf(f4Var.getType()), Util.getStack());
            b = ((C10485b) C86709a0.m107533q(cls)).vh0().mo107404b("MsgCommonMediaExpiredInterval", 432000);
        }
        return ((long) b) * 1000;
    }

    /* renamed from: d */
    public static ViewStub m86927d(MMFragment mMFragment, int i) {
        ViewStub viewStub = (ViewStub) mMFragment.findViewById(i);
        if (viewStub != null) {
            viewStub.inflate();
        }
        return viewStub;
    }

    /* renamed from: e */
    public static boolean m86928e(String str) {
        int i;
        if (!C45628s0.m50740E(str)) {
            if ((C72996z1.m85809L5(str) || C72996z1.m85843n5(str)) && !C75592q0.m90764L(str)) {
                C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(str);
                int i2 = -1;
                if (z1Var != null) {
                    int type = z1Var.getType();
                    C72996z1 z1Var2 = C97625j3.m125812b().mo105907v().get(z1Var.mo73978v2());
                    if (z1Var2 != null) {
                        i = z1Var2.getType();
                        i2 = type;
                        Log.m105925i("MicroMsg.ChattingUI.ChattingLogic", "isStranger:%s type:%d etype:%d", str, Integer.valueOf(i2), Integer.valueOf(i));
                        return true;
                    }
                    i2 = type;
                }
                i = -1;
                Log.m105925i("MicroMsg.ChattingUI.ChattingLogic", "isStranger:%s type:%d etype:%d", str, Integer.valueOf(i2), Integer.valueOf(i));
                return true;
            }
        }
        return false;
    }
}
