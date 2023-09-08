package com.tencent.p014mm.plugin.multitalk.model;

import android.util.Base64;
import as3.C103860b1;
import as3.C103878h1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C75592q0;
import f40.C86709a0;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import nw3.C109779e;
import ob0.C35136m;
import p978i9.C108421e;
import sf0.C48374j0;
import te3.C77949j3;

/* renamed from: com.tencent.mm.plugin.multitalk.model.a0 */
public class C105780a0 {

    /* renamed from: a */
    public Map<String, Long> f314569a = new ConcurrentHashMap();

    /* renamed from: a */
    public final void mo150717a(String str, C35136m.C35137a aVar) {
        boolean z;
        boolean z2;
        C35136m.C35137a aVar2 = aVar;
        String g = C48374j0.m53718g(aVar2.f94242a.f227631h);
        byte[] decode = Base64.decode(str.getBytes(), 0);
        Log.m105924i("MicroMsg.SubCoreMultiTalk.MultiTalkMsgRecevie", "receive banner msg:" + g + " buffer len " + decode.length);
        try {
            C103878h1 h1Var = new C103878h1();
            C108421e.m146905c(h1Var, decode);
            if (((ConcurrentHashMap) this.f314569a).get(h1Var.f307013b) != null) {
                if (((Long) ((ConcurrentHashMap) this.f314569a).get(h1Var.f307013b)).longValue() >= h1Var.f307022k) {
                    Log.m105924i("MicroMsg.SubCoreMultiTalk.MultiTalkMsgRecevie", "msg for this groupId : " + h1Var.f307013b + " is early than last msg, so we do not process,now return.");
                    return;
                }
            }
            ((ConcurrentHashMap) this.f314569a).put(h1Var.f307013b, Long.valueOf(h1Var.f307022k));
            C77949j3 j3Var = aVar2.f94242a;
            String g2 = C48374j0.m53718g(j3Var.f227628e);
            String g3 = C48374j0.m53718g(j3Var.f227629f);
            String str2 = (String) C86709a0.m107535s().mo121142i().mo119684e(2, (Object) null);
            if (str2 == null) {
                Log.m105920e("MicroMsg.SubCoreMultiTalk.MultiTalkMsgRecevie", "userName is null");
                return;
            }
            if (str2.equals(g2)) {
                g2 = g3;
            }
            String str3 = h1Var.f307020i;
            C105851w0.zx0().mo150639P(g2, 1);
            int i = h1Var.f307017f;
            String str4 = "";
            if (i == 1) {
                Log.m105924i("MicroMsg.SubCoreMultiTalk.MultiTalkMsgRecevie", "get WxVoiceBannerBegin,show bar!");
                String[] strArr = h1Var.f307021j;
                C103860b1[] b1VarArr = h1Var.f307019h;
                int length = b1VarArr.length;
                String str5 = str4;
                int i2 = 0;
                boolean z3 = false;
                while (i2 < length) {
                    int i3 = length;
                    C103860b1 b1Var = b1VarArr[i2];
                    C103860b1[] b1VarArr2 = b1VarArr;
                    str5 = str5 + b1Var.f306906s + ",";
                    String str6 = b1Var.f306906s;
                    if (str6 != null && str6.equals(str2)) {
                        Log.m105924i("MicroMsg.SubCoreMultiTalk.MultiTalkMsgRecevie", "in voiceGroupMem!");
                        z3 = true;
                    }
                    i2++;
                    length = i3;
                    b1VarArr = b1VarArr2;
                }
                Log.m105924i("MicroMsg.SubCoreMultiTalk.MultiTalkMsgRecevie", "memberUserNames :" + str5);
                int length2 = strArr.length;
                int i4 = 0;
                while (true) {
                    if (i4 < length2) {
                        String str7 = strArr[i4];
                        if (str7 != null && str7.equals(str2)) {
                            Log.m105924i("MicroMsg.SubCoreMultiTalk.MultiTalkMsgRecevie", "isInvitedNotFriend true! In invitelist and with talk creator is not friend!");
                            z2 = true;
                            break;
                        }
                        i4++;
                    } else {
                        z2 = false;
                        break;
                    }
                }
                if (!z3) {
                    C105851w0.Bx0().yx0(g2);
                    C105851w0.Bx0().xx0().remove(g2);
                } else if (!C105851w0.Bx0().xx0().contains(g2) && z2) {
                    C105851w0.Bx0().xx0().add(g2);
                }
                if (str2.equals(str3)) {
                    C105851w0.zx0().mo150669l(g2, str3, false, false);
                } else if (z3 && !z2) {
                    C105851w0.zx0().mo150669l(g2, str3, false, false);
                } else if (!z3 || !z2) {
                    C105851w0.zx0().mo150669l(g2, str3, true, false);
                } else {
                    C105851w0.zx0().mo150669l(g2, str3, true, true);
                }
                C105851w0.Bx0().Cx0(g2, h1Var);
                ((C109779e) C105851w0.xx0().f314798d).mo161040k(Util.nullAsNil((Integer) C86709a0.m107535s().f251803a.mo119660a(1)), C75592q0.m90789s());
            } else if (i == 2) {
                Log.m105924i("MicroMsg.SubCoreMultiTalk.MultiTalkMsgRecevie", "WxVoiceBannerMemChange!2,member size : " + h1Var.f307019h.length);
                String[] strArr2 = h1Var.f307021j;
                C103860b1[] b1VarArr3 = h1Var.f307019h;
                int length3 = b1VarArr3.length;
                boolean z4 = false;
                int i5 = 0;
                while (i5 < length3) {
                    C103860b1 b1Var2 = b1VarArr3[i5];
                    C103860b1[] b1VarArr4 = b1VarArr3;
                    str4 = str4 + b1Var2.f306906s + ",";
                    String str8 = b1Var2.f306906s;
                    if (str8 != null && str8.equals(str2)) {
                        Log.m105924i("MicroMsg.SubCoreMultiTalk.MultiTalkMsgRecevie", "in voiceGroupMem!");
                        z4 = true;
                    }
                    i5++;
                    b1VarArr3 = b1VarArr4;
                }
                Log.m105924i("MicroMsg.SubCoreMultiTalk.MultiTalkMsgRecevie", "memberUserNames :" + str4);
                int length4 = strArr2.length;
                int i6 = 0;
                while (true) {
                    if (i6 < length4) {
                        String str9 = strArr2[i6];
                        if (str9 != null && str9.equals(str2)) {
                            Log.m105924i("MicroMsg.SubCoreMultiTalk.MultiTalkMsgRecevie", "isInvitedNotFriend true! In invitelist and with talk creator is not friend!");
                            z = true;
                            break;
                        }
                        i6++;
                    } else {
                        z = false;
                        break;
                    }
                }
                if (!z4) {
                    LinkedList<String> linkedList = C105851w0.Bx0().f314601g;
                    if (!(linkedList == null ? false : linkedList.contains(g2)) && C105851w0.Bx0().xx0().contains(g2) && C105851w0.Bx0().Bu0(g2, str2)) {
                        C105851w0.zx0().mo150666i(g2);
                    }
                    C105851w0.Bx0().yx0(g2);
                    C105851w0.Bx0().xx0().remove(g2);
                } else if (!C105851w0.Bx0().xx0().contains(g2) && z) {
                    C105851w0.Bx0().xx0().add(g2);
                }
                ((C109779e) C105851w0.xx0().f314798d).mo161040k(Util.nullAsNil((Integer) C86709a0.m107535s().f251803a.mo119660a(1)), C75592q0.m90789s());
                Log.m105924i("MicroMsg.SubCoreMultiTalk.MultiTalkMsgRecevie", "WxVoiceBannerMemChange setWxUinAndUsrName:");
                C105851w0.Bx0().Ex0(g2, h1Var);
            } else if (i == 0) {
                Log.m105924i("MicroMsg.SubCoreMultiTalk.MultiTalkMsgRecevie", "get WxVoiceBannerEnd,dismiss bar!");
                LinkedList<String> linkedList2 = C105851w0.Bx0().f314601g;
                if (!(linkedList2 == null ? false : linkedList2.contains(g2)) && C105851w0.Bx0().xx0().contains(g2) && C105851w0.Bx0().Bu0(g2, str2)) {
                    C105851w0.zx0().mo150666i(g2);
                }
                C105851w0.zx0().mo150668k(g2);
                C105851w0.zx0().mo150637N(g2);
                C105851w0.Bx0().mo96147oW(g2);
                C105851w0.Bx0().yx0(g2);
                C105851w0.Bx0().xx0().remove(g2);
            } else if (i == 3) {
                for (C103860b1 b1Var3 : h1Var.f307019h) {
                    String str10 = b1Var3.f306906s;
                    if (str10 != null && str10.equals(str2)) {
                        Log.m105924i("MicroMsg.SubCoreMultiTalk.MultiTalkMsgRecevie", "wxVoiceBannerWaitTimeOut in voiceGroupMem!");
                    }
                }
            } else {
                Log.m105920e("MicroMsg.SubCoreMultiTalk.MultiTalkMsgRecevie", "get bannerinfo voicestatus is invalidate!: voicestatus:" + h1Var.f307017f);
            }
        } catch (Exception e) {
            Log.m105921e("MicroMsg.SubCoreMultiTalk.MultiTalkMsgRecevie", "parse  bannerinfo  failure! xml:" + g, e.getMessage());
        }
    }
}
