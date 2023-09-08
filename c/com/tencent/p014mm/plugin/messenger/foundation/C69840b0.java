package com.tencent.p014mm.plugin.messenger.foundation;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.p014mm.storage.RegionCodeDecoder;
import eb0.C75590o4;
import eb0.C7624i3;
import f40.C86709a0;
import f62.C75694f1;
import f62.C75699i1;
import f62.C75700k0;
import f62.C75701k1;
import sf0.C48374j0;
import te3.C50886px;
import te3.C77982pz2;

/* renamed from: com.tencent.mm.plugin.messenger.foundation.b0 */
public class C69840b0 implements C75694f1 {
    /* renamed from: a */
    public void mo66659a(Object obj, C50886px pxVar, int i, byte[] bArr, boolean z, C75699i1 i1Var) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        if (pxVar.f140037d == 1) {
            C77982pz2 pz22 = (C77982pz2) new C77982pz2().parseFrom(bArr);
            Class cls = C75700k0.class;
            int i2 = pz22.f228077d;
            C86709a0.m107535s().mo121142i().mo119683d(2);
            C85801v1 i3 = C86709a0.m107535s().mo121142i();
            Log.m105925i("MicroMsg.UserInfoSyncExtension", "processModUserInfo bitFlag:%d status:%d PluginFlag:%d PluginSwitch:%d", Integer.valueOf(pz22.f228077d), Integer.valueOf(pz22.f228083j), Integer.valueOf(pz22.f228092v), Integer.valueOf(pz22.f228063E));
            String g = C48374j0.m53718g(pz22.f228078e);
            String g2 = C48374j0.m53718g(pz22.f228079f);
            String g3 = C48374j0.m53718g(pz22.f228081h);
            String g4 = C48374j0.m53718g(pz22.f228082i);
            int i4 = pz22.f228080g;
            C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(g);
            if (z1Var == null || z1Var.getUsername() == null || !z1Var.getUsername().equals(g)) {
                z1Var = new C72996z1(g);
            }
            z1Var.mo62857I2(pz22.f228065G);
            z1Var.mo62878U2(g2);
            z1Var.mo62893c4(RegionCodeDecoder.m124564q(pz22.f228076S, pz22.f228087q, pz22.f228088r));
            z1Var.mo62900f4(pz22.f228086p);
            z1Var.mo62902g4(pz22.f228089s);
            z1Var.mo62896e3(pz22.f228067I);
            z1Var.mo62928s4(pz22.f228062D);
            z1Var.mo62899f3(pz22.f228066H);
            z1Var.mo62921o4(i4);
            ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69668Q3(z1Var);
            i3.mo119676J(2, g);
            i3.mo119676J(4, g2);
            i3.mo119676J(5, g3);
            i3.mo119676J(6, g4);
            i3.mo119676J(9, Integer.valueOf(i4));
            StringBuilder sb = new StringBuilder();
            sb.append("doCmd : status ");
            int i5 = pz22.f228083j;
            String str15 = "code=" + Integer.toHexString(i5) + ", status = " + i5;
            if ((i5 & 1) != 0) {
                str15 = str15 + ", open";
            }
            if ((i5 & 2) != 0) {
                str15 = str15 + ", email-verified";
            }
            if ((i5 & 4) != 0) {
                str15 = str15 + ", mobile-verified";
            }
            if ((i5 & 8) != 0) {
                str15 = str15 + ", hide-qq-search";
            }
            if ((i5 & 16) != 0) {
                str15 = str15 + ", hide-qq-promote";
            }
            if ((i5 & 32) != 0) {
                str15 = str15 + ", need-verify";
            }
            if ((i5 & 64) != 0) {
                str15 = str15 + ", has-qq-msg";
            }
            if ((i5 & 128) != 0) {
                str15 = str15 + ", no-qq-promote";
            }
            if ((i5 & 256) != 0) {
                str15 = str15 + ", no-mobile-promote";
            }
            if ((i5 & 512) != 0) {
                str15 = str15 + ", hide-mobile_search";
            }
            if ((i5 & 4096) != 0) {
                str15 = str15 + ", open-float-bottle";
            }
            if ((i5 & 131072) != 0) {
                str15 = str15 + ", bind but not upload";
            }
            sb.append(str15);
            Log.m105918d("MicroMsg.UserInfoSyncExtension", sb.toString());
            i3.mo119676J(7, Integer.valueOf(pz22.f228083j));
            if (pz22.f228090t != 0) {
                C75590o4 o4Var = new C75590o4();
                o4Var.f222064a = 1;
                o4Var.f222065b = pz22.f228086p;
                o4Var.f222068e = pz22.f228089s;
                o4Var.f222070g = pz22.f228076S;
                o4Var.f222072i = pz22.f228087q;
                o4Var.f222071h = pz22.f228088r;
                o4Var.f222069f = pz22.f228062D;
                Log.m105918d("MicroMsg.UserInfoSyncExtension", " getPersonalCard weibo url : " + o4Var.f222069f + " nickName :" + pz22.f228066H);
                C75590o4.m90742e(o4Var);
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append("userinfo Plugstate: ");
            int i6 = pz22.f228092v;
            String str16 = "code=" + Integer.toHexString(i6) + ", pluginFlag = " + i6;
            if ((i6 & 1) != 0) {
                str = str16 + ", QQMAIL_UNINSTALL";
            } else {
                str = str16 + ", QQMAIL_INSTALL";
            }
            if ((i6 & 2) != 0) {
                str2 = str + ", PM_UNINSTALL";
            } else {
                str2 = str + ", PM_INSTALL";
            }
            if ((i6 & 4) != 0) {
                str3 = str2 + ", FM_UNINSTALL";
            } else {
                str3 = str2 + ", FM_INSTALL";
            }
            if ((i6 & 8) != 0) {
                str4 = str3 + ", WEIBO_UNINSTALL";
            } else {
                str4 = str3 + ", WEIBO_INSTALL";
            }
            if ((i6 & 16) != 0) {
                str5 = str4 + ", MEDIANOTE_UNINSTALL";
            } else {
                str5 = str4 + ", MEDIANOTE_INSTALL";
            }
            if ((i6 & 32) != 0) {
                str6 = str5 + ", QMSG_UNINSTALL";
            } else {
                str6 = str5 + ", QMSG_INSTALL";
            }
            if ((i6 & 64) != 0) {
                str7 = str6 + ", BOTTLE_UNINSTALL";
            } else {
                str7 = str6 + ", BOTTLE_INSTALL";
            }
            if ((i6 & 128) != 0) {
                str8 = str7 + ", QSYNC_UNISTALL";
            } else {
                str8 = str7 + ", QSYNC_INSTALL";
            }
            if ((i6 & 256) != 0) {
                str9 = str8 + ", SHAKE_UNISTALL";
            } else {
                str9 = str8 + ", SHAKE_INSTALL";
            }
            if ((i6 & 512) != 0) {
                str10 = str9 + ", LBS_UNISTALL";
            } else {
                str10 = str9 + ", LBS_INSTALL";
            }
            if ((i6 & 1024) != 0) {
                str11 = str10 + ", BOTTLE_CHART_INSTALL";
            } else {
                str11 = str10 + ", BOTTLE_CHART_INSTALL";
            }
            if ((i6 & 4096) != 0) {
                str12 = str11 + ",CHECKQQF_UNINSTALL";
            } else {
                str12 = str11 + ",CHECKQQF_INSTALL";
            }
            if ((i6 & 32768) != 0) {
                str13 = str12 + ",MM_FEEDSAPP_UNINSTALL";
            } else {
                str13 = str12 + ",MM_FEEDSAPP_INSTALL";
            }
            sb4.append(str13);
            Log.m105924i("MicroMsg.UserInfoSyncExtension", sb4.toString());
            i3.mo119676J(34, Integer.valueOf(pz22.f228092v));
            i3.mo119676J(8200, Boolean.valueOf(Util.nullAs(Boolean.valueOf(1 == pz22.f228091u.f134445d), false)));
            i3.mo119676J(8201, Integer.valueOf(Util.nullAs(Integer.valueOf(pz22.f228091u.f134446e.f135107d), 22)));
            i3.mo119676J(8208, Integer.valueOf(Util.nullAs(Integer.valueOf(pz22.f228091u.f134446e.f135108e), 8)));
            i3.mo119676J(66049, Integer.valueOf(pz22.f228093w));
            i3.mo119676J(66050, pz22.f228094x);
            i3.mo119676J(40, Integer.valueOf(pz22.f228063E));
            C7624i3.f25910c.mo8756d("last_login_use_voice", pz22.f228063E + "");
            i3.mo119676J(41, Integer.valueOf(pz22.f228067I));
            i3.mo119676J(43, pz22.f228066H);
            Log.m105918d("MicroMsg.UserInfoSyncExtension", "doCmd PluginSwitch:" + pz22.f228063E + " WeiboFlag:" + pz22.f228067I);
            i3.mo119676J(868518889, Integer.valueOf(pz22.f228074Q));
            StringBuilder sb5 = new StringBuilder();
            sb5.append("doCmd USERINFO_TXNEWSCATEGORY:");
            sb5.append(pz22.f228074Q);
            Log.m105918d("MicroMsg.UserInfoSyncExtension", sb5.toString());
            i3.mo119676J(42, pz22.f228065G);
            Log.m105918d("MicroMsg.UserInfoSyncExtension", "userid:" + pz22.f228069K + " username:" + pz22.f228070L);
            StringBuilder sb6 = new StringBuilder();
            sb6.append("");
            sb6.append(pz22.f228069K);
            i3.mo119676J(65825, sb6.toString());
            i3.mo119676J(65826, "" + pz22.f228070L);
            Log.m105918d("MicroMsg.UserInfoSyncExtension", "getiAlbumFlag " + pz22.f228072N);
            Log.m105918d("MicroMsg.UserInfoSyncExtension", "getiAlbumStyle " + pz22.f228071M);
            Log.m105918d("MicroMsg.UserInfoSyncExtension", "getPcAlbumBGImgID " + pz22.f228073P);
            String nullAsNil = Util.nullAsNil((String) C86709a0.m107535s().mo121142i().mo119684e(65830, (Object) null));
            if ((nullAsNil == null || nullAsNil.length() == 0) && (str14 = pz22.f228075R) != null && str14.length() > 0) {
                C86709a0.m107535s().mo121142i().mo119676J(65830, str14);
            }
            C75701k1.m90962b(1, pz22);
        }
    }
}
