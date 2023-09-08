package pc0;

import com.tencent.p014mm.autogen.events.QMessageOperationEvent;
import com.tencent.p014mm.autogen.events.RollbackTencentNewsEvent;
import com.tencent.p014mm.autogen.events.SilenceNotifyEvent;
import com.tencent.p014mm.autogen.events.TMessageOperationEvent;
import com.tencent.p014mm.autogen.events.UpdateGestureProtectInfoEvent;
import com.tencent.p014mm.modelavatar.AvatarStorage;
import com.tencent.p014mm.modelavatar.C68081f;
import com.tencent.p014mm.modelavatar.C68082g;
import com.tencent.p014mm.modelavatar.C68092j;
import com.tencent.p014mm.modelavatar.C68097n;
import com.tencent.p014mm.modelavatar.C68098o;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44665r4;
import com.tencent.p014mm.storage.C44667s4;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.p014mm.storage.RegionCodeDecoder;
import cw0.C116542c;
import dg0.C75398e;
import di3.C86312j;
import eb0.C116734h6;
import eb0.C45628s0;
import eb0.C75592q0;
import eb0.C97625j3;
import f40.C86709a0;
import f62.C75694f1;
import f62.C75699i1;
import f62.C75700k0;
import g62.C8235p;
import hg0.C46069x;
import ht1.C60200t1;
import java.util.LinkedList;
import jr2.C76438m;
import jr2.C99019x;
import junit.framework.Assert;
import ky2.C10432i;
import lg3.C76695c;
import os2.C100399d0;
import os2.C100423z;
import p196ln.C76706g;
import p196ln.C76708i;
import p248ug.C52558c;
import p773yy.C79168k;
import p823sg.C90196p;
import rb0.C47984k;
import rb0.C48009v0;
import sf0.C48374j0;
import te3.C49075d04;
import te3.C49938j33;
import te3.C50758oz2;
import te3.C50886px;
import te3.C51018qv3;
import te3.C51043r10;
import te3.C51113ri2;
import te3.C52039xy2;
import te3.C64266br1;
import te3.C64576nb3;
import te3.C64729tj3;
import te3.C77904ay2;
import te3.C77916dy2;
import te3.a94;
import te3.h85;
import te3.le4;
import te3.sp4;
import te3.tp4;
import te3.xo4;
import ud2.C14180f;
import wc3.C102426c0;
import xv2.C102775d;

/* renamed from: pc0.b */
public class C77063b implements C75694f1 {
    /* renamed from: b */
    public static void m92988b(byte[] bArr) {
        try {
            int b = C90196p.m112885b(bArr, 0);
            Log.m105919d("MicroMsg.BigBallOfMudSyncExtension", "local test synccmd, sleep %d", Integer.valueOf(b));
            if (b > 0) {
                Thread.sleep((long) b);
            }
        } catch (InterruptedException e) {
            Log.printErrStackTrace("MicroMsg.BigBallOfMudSyncExtension", e, "", new Object[0]);
        }
    }

    /* renamed from: a */
    public void mo66659a(Object obj, C50886px pxVar, int i, byte[] bArr, boolean z, C75699i1 i1Var) {
        String str;
        boolean z2;
        C51018qv3 qv32;
        int i2;
        int i3;
        C50886px pxVar2 = pxVar;
        byte[] bArr2 = bArr;
        Class cls = C75700k0.class;
        Class cls2 = C76706g.class;
        int i4 = pxVar2.f140037d;
        int i5 = 2;
        boolean z3 = false;
        if (i4 == 13) {
            C52039xy2 xy22 = (C52039xy2) new C52039xy2().parseFrom(bArr2);
            if (1 == xy22.f145023e) {
                C8235p C = C97625j3.m125812b().mo105877C();
                String g = C48374j0.m53718g(xy22.f145022d);
                boolean z4 = xy22.f145025g == 1;
                boolean z5 = xy22.f145024f == 1;
                C44667s4 s4Var = (C44667s4) C;
                s4Var.getClass();
                if (Util.isNullOrNil(g)) {
                    Log.m105920e("MicroMsg.RoleStorage", "insert role info failed: empty user");
                    return;
                }
                C44665r4 Lo = s4Var.mo69816Lo(g);
                if (Lo == null) {
                    s4Var.mo69818Yt(new C44665r4(g, z4, true, 2));
                    Log.m105918d("MicroMsg.RoleStorage", "insert new role, user=" + g);
                    return;
                }
                Lo.mo69815d(z4);
                if (z5) {
                    int i6 = Lo.f121097d;
                    if (!z5) {
                        i5 = 0;
                    }
                    Lo.f121097d = i6 | i5;
                } else {
                    Lo.f121097d &= -3;
                }
                Lo.f121094a = 4;
                s4Var.mo69819bD(Lo);
                return;
            }
            Log.m105920e("MicroMsg.BigBallOfMudSyncExtension", "unknown micro blog type:" + xy22.f145023e);
        } else if (i4 == 15) {
            C77916dy2 dy22 = (C77916dy2) new C77916dy2().parseFrom(bArr2);
            if (dy22 != null) {
                Log.m105918d("MicroMsg.BigBallOfMudSyncExtension", "processModChatRoomMember username:" + dy22.f227170d + " nickname:" + dy22.f227171e);
                String g2 = C48374j0.m53718g(dy22.f227170d);
                C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(g2);
                z1Var.setUsername(g2);
                z1Var.mo62878U2(C48374j0.m53718g(dy22.f227171e));
                z1Var.mo62882W2(C48374j0.m53718g(dy22.f227172f));
                z1Var.mo62884X2(C48374j0.m53718g(dy22.f227173g));
                z1Var.mo62900f4(dy22.f227174h);
                z1Var.mo62860K2(C48374j0.m53718g(dy22.f227177n));
                z1Var.mo62862L2(C48374j0.m53718g(dy22.f227179p));
                z1Var.mo62864M2(C48374j0.m53718g(dy22.f227178o));
                z1Var.mo62866N3(dy22.f227180q);
                C68097n nVar = new C68097n();
                nVar.f195736i = -1;
                nVar.f195728a = z1Var.getUsername();
                nVar.f195731d = dy22.f227167I;
                nVar.f195732e = dy22.f227166H;
                Log.m105919d("MicroMsg.BigBallOfMudSyncExtension", "dkhurl chatmember %s b[%s] s[%s]", nVar.mo93598g(), nVar.mo93594c(), nVar.mo93597f());
                nVar.f195733f = 1;
                int i7 = dy22.f227176j;
                if (i7 == 3 || i7 == 4) {
                    z1Var.mo62879U3(i7);
                    nVar.f195729b = dy22.f227176j;
                } else if (i7 == 2) {
                    z1Var.mo62879U3(3);
                    nVar.f195729b = 3;
                    z1Var.mo62879U3(3);
                    if (!C75592q0.m90789s().equals(z1Var.getUsername())) {
                        ((C68082g) ((C76706g) C86312j.m106911c(cls2)).mo106847uz()).mo93583j(z1Var.getUsername(), nVar);
                    }
                }
                ((C68098o) ((C76706g) C86312j.m106911c(cls2)).mo106832eg()).mo93608Yt(nVar);
                C97625j3.m125812b().mo105907v().mo69668Q3(z1Var);
                C52558c SE = C48009v0.Fx0().mo72757SE(z1Var.getUsername());
                SE.field_username = z1Var.getUsername();
                SE.field_brandList = dy22.f227168J;
                C51043r10 r102 = dy22.f227169K;
                if (r102 != null) {
                    SE.field_brandFlag = r102.f140656d;
                    SE.field_brandInfo = r102.f140658f;
                    SE.field_brandIconURL = r102.f140659g;
                    String str2 = r102.f140657e;
                    SE.field_extInfo = str2;
                    SE.field_attrSyncVersion = null;
                    Log.m105925i("MicroMsg.BigBallOfMudSyncExtension", "update extInfo=%s", str2);
                }
                if (!C48009v0.Fx0().replace(SE)) {
                    C48009v0.Fx0().insert(SE);
                }
            }
        } else if (i4 != 33) {
            if (i4 == 35) {
                C50758oz2 oz22 = (C50758oz2) new C50758oz2().parseFrom(bArr2);
                Assert.assertTrue(oz22 != null);
                String s = C75592q0.m90789s();
                int i8 = oz22.f139463d;
                int i9 = 12553;
                if (i8 == 2) {
                    s = C72996z1.m85829Z5(s);
                    str = (String) C97625j3.m125812b().mo105906u().mo119683d(12553);
                } else {
                    str = (String) C97625j3.m125812b().mo105906u().mo119683d(12297);
                }
                if (str == null || !str.equals(oz22.f139466g)) {
                    ((AvatarStorage) ((C76706g) C86312j.m106911c(cls2)).mo106826RE()).mo93566o(s, true);
                    C85801v1 u = C97625j3.m125812b().mo105906u();
                    if (i8 != 2) {
                        i9 = 12297;
                    }
                    u.mo119676J(i9, oz22.f139466g);
                    z2 = true;
                } else {
                    z2 = false;
                }
                Log.m105919d("MicroMsg.BigBallOfMudSyncExtension", "ModUserImg beRemove:%b imgtype:%d md5:%s big:%s sm:%s", Boolean.valueOf(z2), Integer.valueOf(i8), oz22.f139466g, oz22.f139467h, oz22.f139468i);
                C68097n nVar2 = new C68097n();
                nVar2.mo93606o(s);
                nVar2.mo93599h(oz22.f139467h);
                nVar2.mo93605n(oz22.f139468i);
                if (!Util.isNullOrNil(nVar2.mo93597f())) {
                    if (i8 == 1) {
                        C97625j3.m125812b().mo105906u().mo119676J(59, Boolean.TRUE);
                    } else {
                        C97625j3.m125812b().mo105906u().mo119676J(60, Boolean.TRUE);
                    }
                }
                nVar2.mo93601j(false);
                nVar2.mo93600i(56);
                if (!Util.isNullOrNil(oz22.f139466g)) {
                    nVar2.mo93601j(true);
                }
                ((C68098o) ((C76706g) C86312j.m106911c(cls2)).mo106832eg()).mo93608Yt(nVar2);
                if (z2) {
                    new C68092j().mo86279b(s, new C77061a(this));
                    return;
                }
            } else if (i4 == 44) {
                xo4 xo4 = (xo4) new xo4().parseFrom(bArr2);
                C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_COMMON_SAY_HI_STRING_SYNC;
                Log.m105925i("MicroMsg.BigBallOfMudSyncExtension", "snsExtFlag:%s, snsExtFlagEx:%s, snsPrivacyRecent:%s IMESetting:%s", Integer.valueOf(xo4.f228498d.f130392d), Integer.valueOf(xo4.f228498d.f130395g), Integer.valueOf(xo4.f228498d.f130396h), Integer.valueOf(xo4.f228482R0));
                Log.m105925i("MicroMsg.BigBallOfMudSyncExtension", "processModUserInfoExt snsExtFlag:%s, snsExtFlagEx:%s, snsPrivacyRecent:%s, textStatus:%s", Integer.valueOf(xo4.f228498d.f130392d), Integer.valueOf(xo4.f228498d.f130395g), Integer.valueOf(xo4.f228498d.f130396h), xo4.f228479Q);
                String str3 = (String) C97625j3.m125812b().mo105906u().mo119684e(2, (Object) null);
                if (str3 != null && str3.length() > 0) {
                    if (C99019x.m128971c() != null) {
                        ((C100399d0) C99019x.m128971c()).mo139792uP(str3, xo4.f228498d);
                    }
                    if (C102426c0.m135142a() != null) {
                        C76438m a = C102426c0.m135142a();
                        a94 a94 = xo4.f228498d;
                        C100423z zVar = (C100423z) a;
                        zVar.getClass();
                        SnsMethodCalculate.markStartTimeMs("updateBg", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
                        if (a94 == null) {
                            SnsMethodCalculate.markEndTimeMs("updateBg", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
                        } else {
                            zVar.f294200f.mo136642e3(a94.f130394f);
                            SnsMethodCalculate.markEndTimeMs("updateBg", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
                        }
                    }
                    Log.m105925i("MicroMsg.BigBallOfMudSyncExtension", "storyExtFlag:%s", Integer.valueOf(xo4.f228476M.f184996d));
                    ((C102775d) C86312j.m106911c(C102775d.class)).mo134164Po(str3, xo4.f228476M);
                    Log.m105925i("MicroMsg.BigBallOfMudSyncExtension", "finderSetting:%s", Long.valueOf(xo4.f228480Q0));
                    ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76885uf().mo8928g(xo4.f228480Q0);
                    C52558c b = C47984k.m53328b(C75592q0.m90789s());
                    if (b == null) {
                        b = new C52558c();
                    }
                    b.field_username = str3;
                    b.field_brandList = xo4.f228499e;
                    if (b.mo73502t2() && b.mo73500r2(false) != null && b.mo73500r2(false).mo73511d() != null && !Util.isNullOrNil(b.mo73498p2())) {
                        String p2 = b.mo73498p2();
                        b.field_enterpriseFather = p2;
                        Log.m105919d("MicroMsg.BigBallOfMudSyncExtension", "processModUserInfoExt, %s set enterpriseFather %s", str3, p2);
                    }
                    if (!C48009v0.Fx0().replace(b)) {
                        C48009v0.Fx0().insert(b);
                    }
                    int i15 = xo4.f228502h;
                    int i16 = xo4.f228503i;
                    int i17 = xo4.f228504j;
                    Log.m105918d("MicroMsg.BigBallOfMudSyncExtension", "roomSize :" + i15 + " rommquota: " + i16 + " invite: " + i17);
                    C97625j3.m125812b().mo105906u().mo119676J(135175, Integer.valueOf(i15));
                    C97625j3.m125812b().mo105906u().mo119676J(135176, Integer.valueOf(i16));
                    C97625j3.m125812b().mo105906u().mo119676J(135177, Integer.valueOf(i17));
                    C97625j3.m125812b().mo105906u().mo119676J(144385, Integer.valueOf(xo4.f228513u));
                    C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_WALLET_REGION_TYPE_INT_SYNC, Integer.valueOf(xo4.f228472I));
                    C116734h6.m164657m(xo4.f228472I);
                    C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_SMCRYPTO_FLAG_TYPE_INT_SYNC, Integer.valueOf(xo4.f228486T0));
                    Log.m105925i("MicroMsg.BigBallOfMudSyncExtension", "sync do cmd smcrypto flag:%d", Integer.valueOf(xo4.f228486T0));
                    C116542c.m164369f();
                    C97625j3.m125812b().mo105906u().mo119676J(339975, Integer.valueOf(xo4.f228470G));
                    Log.m105925i("MicroMsg.BigBallOfMudSyncExtension", "hy: sync do cmd pay wallet type: %d %d", Integer.valueOf(xo4.f228470G), Integer.valueOf(xo4.f228472I));
                    C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_PROFILE_WEIDIANINFO_STRING, Util.nullAs(xo4.f228471H, ""));
                    Log.m105919d("MicroMsg.BigBallOfMudSyncExtension", "weidianinfo:%s", xo4.f228471H);
                    C97625j3.m125812b().mo105906u().mo119676J(147457, Long.valueOf(xo4.f228473J));
                    Log.m105925i("MicroMsg.BigBallOfMudSyncExtension", "userinfoExt.ExtStatus:%s", Long.valueOf(xo4.f228473J));
                    C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_EXT_STATUS2_LONG_SYNC, Long.valueOf(xo4.f228494X0));
                    Log.m105925i("MicroMsg.BigBallOfMudSyncExtension", "userinfoExt.ExtStatus2:%s", Long.valueOf(xo4.f228494X0));
                    C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_EXT_USER_STATUS_INT_SYNC, Integer.valueOf(xo4.f228475L));
                    Log.m105925i("MicroMsg.BigBallOfMudSyncExtension", "userinfoExt.UserStatus:%s", Integer.valueOf(xo4.f228475L));
                    C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_EXT_BIND_XMAIL_STRING_SYNC, xo4.f228481R);
                    Log.m105925i("MicroMsg.BigBallOfMudSyncExtension", "userinfoExt.BindXMail:%s", xo4.f228481R);
                    C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_EXT_PAY_SETTING_LONG_SYNC, Long.valueOf(xo4.f228477N));
                    Log.m105925i("MicroMsg.BigBallOfMudSyncExtension", "userinfoExt.PaySetting:%s", Long.toBinaryString(xo4.f228477N));
                    C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_F2F_RING_TONE_STRING, xo4.f228474K);
                    C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_MOBILE_REMITTANCE_BIND_MOBILE_TRANSFER_INT_SYNC, Integer.valueOf(xo4.f228478P));
                    Log.m105925i("MicroMsg.BigBallOfMudSyncExtension", "userinfoExt.PayBindMobileTransfer:%s", Integer.valueOf(xo4.f228478P));
                    C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_PAT_SUFFIX_STRING_SYNC, xo4.f228483S);
                    Log.m105925i("MicroMsg.BigBallOfMudSyncExtension", "userinfoExt.PatSuffix:%s", xo4.f228483S);
                    C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_PAT_SUFFIX_VERSION_INT_SYNC, Integer.valueOf(xo4.f228485T));
                    Log.m105925i("MicroMsg.BigBallOfMudSyncExtension", "userinfoExt.PatSuffixVersion:%d", Integer.valueOf(xo4.f228485T));
                    C86709a0.m107535s().mo121142i().mo119676J(274436, xo4.f228518y);
                    Log.m105925i("MicroMsg.BigBallOfMudSyncExtension", "userinfoExt.RegCountry:%s", xo4.f228518y);
                    C14180f.m13513c(str3, xo4.f228485T);
                    C97625j3.m125812b().mo105906u().mo119676J(147458, Long.valueOf(xo4.f228492W0));
                    Log.m105925i("MicroMsg.BigBallOfMudSyncExtension", "userinfoExt.DiscoveryPageCtrlFlag:%s", Long.valueOf(xo4.f228492W0));
                    ((C79168k) C86312j.m106911c(C79168k.class)).Ru0(xo4.f228497Z, xo4.f228508p0, Boolean.FALSE);
                    C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_SETTING_TEEN_MODE_STATE_BOOLEAN_SYNC, Boolean.valueOf((xo4.f228473J & 1099511627776L) != 0));
                    C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_SETTING_TEEN_MODE_FINDER_RANGE_INT_SYNC, Integer.valueOf(xo4.f228487U));
                    C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_SETTING_TEEN_MODE_BIZ_ACCT_RANGE_INT_SYNC, Integer.valueOf(xo4.f228489V));
                    C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_SETTING_TEEN_MODE_MINI_PROGRAM_RANGE_INT_SYNC, Integer.valueOf(xo4.f228491W));
                    ((C10432i) C86312j.m106911c(C10432i.class)).I40();
                    boolean z6 = (xo4.f228473J & 18014398509481984L) != 0;
                    Log.m105925i("MicroMsg.BigBallOfMudSyncExtension", "isCareMode:%s, local:%s, value:%s, ExtStatus:%s", Boolean.valueOf(z6), Boolean.valueOf(C76695c.m92341b()), Long.valueOf(xo4.f228473J & 18014398509481984L), Long.valueOf(xo4.f228473J));
                    C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_SETTING_CARE_MODE_STATE_BOOLEAN_SYNC, Boolean.valueOf(z6));
                    C76695c.m92346g(true);
                    boolean z7 = (xo4.f228494X0 & 16) != 0;
                    Log.m105925i("MicroMsg.BigBallOfMudSyncExtension", "isTTSOpen:%s, local:%s, ExtStatus2:%s", Boolean.valueOf(z7), Boolean.valueOf(C76695c.m92343d()), Long.valueOf(xo4.f228494X0));
                    C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_SETTING_CARE_MODE_LISTEN_BOOLEAN, Boolean.valueOf(z7));
                    C76695c.m92347h();
                    tp4 tp4 = xo4.f228496Y0;
                    if (tp4 == null || (i3 = tp4.f142323d) <= 0) {
                        Log.m105925i("MicroMsg.BigBallOfMudSyncExtension", "verifyContentList is null", Integer.valueOf(tp4.f142323d));
                        C86709a0.m107535s().mo121142i().mo119677K(aVar, "");
                    } else {
                        Log.m105925i("MicroMsg.BigBallOfMudSyncExtension", "verifyContentList Count:%s", Integer.valueOf(i3));
                        LinkedList<sp4> linkedList = tp4.f142324e;
                        if (linkedList != null && linkedList.size() > 0) {
                            sp4 sp4 = tp4.f142324e.get(0);
                            Log.m105925i("MicroMsg.BigBallOfMudSyncExtension", "verifyContentList VerifyContent:%s", sp4.f141666d);
                            C86709a0.m107535s().mo121142i().mo119677K(aVar, sp4.f141666d);
                        }
                    }
                    long j = xo4.f228494X0;
                    boolean z8 = (4096 & j) != 0;
                    boolean z9 = (j & 32768) != 0;
                    Log.m105925i("MicroMsg.BigBallOfMudSyncExtension", "isTXNewsMute:%s, isTXNewsMuteInit:%s, ExtStatus2:%s", Boolean.valueOf(z8), Boolean.valueOf(z9), Long.valueOf(xo4.f228494X0));
                    if (z9) {
                        C72996z1 z1Var2 = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get("newsapp");
                        if (C45628s0.m50746K(z1Var2) != z8) {
                            Log.m105925i("MicroMsg.BigBallOfMudSyncExtension", "isTXNewsMute changed, current:%s", Boolean.valueOf(z8));
                            C45628s0.m50779i0(z1Var2, false);
                        } else {
                            C45628s0.m50797r0(z1Var2, false);
                        }
                    }
                    long j2 = xo4.f228494X0;
                    boolean z15 = (8192 & j2) != 0;
                    boolean z16 = (j2 & 65536) != 0;
                    Log.m105925i("MicroMsg.BigBallOfMudSyncExtension", "isTXNewsTop:%s, isTXNewsTopInit:%s, ExtStatus2:%s", Boolean.valueOf(z15), Boolean.valueOf(z16), Long.valueOf(xo4.f228494X0));
                    if (z16 && ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get("newsapp").mo62940x3() != z15) {
                        Log.m105925i("MicroMsg.BigBallOfMudSyncExtension", "isTXNewsTop changed, current:%s", Boolean.valueOf(z15));
                        if (z15) {
                            C45628s0.m50787m0("newsapp", true, false);
                        } else {
                            C45628s0.m50805v0("newsapp", true, true);
                        }
                    }
                    boolean z17 = (xo4.f228494X0 & 131072) != 0;
                    Log.m105925i("MicroMsg.BigBallOfMudSyncExtension", "isQQMailMute:%s, ExtStatus2:%s", Boolean.valueOf(z17), Long.valueOf(xo4.f228494X0));
                    C72996z1 z1Var3 = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get("qqmail");
                    if (C45628s0.m50746K(z1Var3) != z17) {
                        Log.m105925i("MicroMsg.BigBallOfMudSyncExtension", "isQQMailMute changed, current:%s", Boolean.valueOf(z17));
                        if (z17) {
                            C45628s0.m50779i0(z1Var3, false);
                        } else {
                            C45628s0.m50797r0(z1Var3, false);
                        }
                    }
                    boolean z18 = (xo4.f228494X0 & 262144) != 0;
                    Log.m105925i("MicroMsg.BigBallOfMudSyncExtension", "isQQMailTop:%s, ExtStatus2:%s", Boolean.valueOf(z18), Long.valueOf(xo4.f228494X0));
                    if (z1Var3.mo62940x3() != z18) {
                        Log.m105925i("MicroMsg.BigBallOfMudSyncExtension", "isQQMailTop changed, current:%s", Boolean.valueOf(z18));
                        if (z18) {
                            C45628s0.m50787m0("qqmail", true, false);
                        } else {
                            C45628s0.m50805v0("qqmail", true, true);
                        }
                    }
                    boolean z19 = (xo4.f228473J & 67108864) != 0;
                    if (z19) {
                        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_SETTING_VOIP_CLOSE_SOUND_BOOLEAN_SYNC, Boolean.valueOf(z19));
                    }
                    C68097n nVar3 = new C68097n();
                    nVar3.f195736i = -1;
                    nVar3.f195728a = str3;
                    nVar3.f195732e = xo4.f228506o;
                    nVar3.f195731d = xo4.f228507p;
                    nVar3.f195733f = 1;
                    nVar3.f195729b = 3;
                    Log.m105919d("MicroMsg.BigBallOfMudSyncExtension", "dkavatar user:[%s] big:[%s] sm:[%s]", nVar3.mo93598g(), nVar3.mo93594c(), nVar3.mo93597f());
                    ((C68098o) ((C76706g) C86312j.m106911c(cls2)).mo106832eg()).mo93608Yt(nVar3);
                    String str4 = xo4.f228515w;
                    C97625j3.m125812b().mo105906u().mo119676J(274433, xo4.f228516x);
                    C97625j3.m125812b().mo105906u().mo119676J(274434, str4);
                    if (xo4.f228466C != null) {
                        C97625j3.m125812b().mo105906u().mo119676J(286721, xo4.f228466C.f130697e);
                        C97625j3.m125812b().mo105906u().mo119676J(286722, xo4.f228466C.f130696d);
                        C97625j3.m125812b().mo105906u().mo119676J(286723, xo4.f228466C.f130698f);
                    }
                    C64576nb3 nb32 = xo4.f228468E;
                    if (!(nb32 == null || (qv32 = nb32.f184453e) == null || (i2 = qv32.f140572d) <= 0)) {
                        Log.m105925i("MicroMsg.BigBallOfMudSyncExtension", "tomgest PatternLockInfo %d", Integer.valueOf(i2));
                        UpdateGestureProtectInfoEvent updateGestureProtectInfoEvent = new UpdateGestureProtectInfoEvent();
                        updateGestureProtectInfoEvent.f193985d.f193986a = xo4.f228468E;
                        updateGestureProtectInfoEvent.publish();
                    }
                    Log.m105924i("MicroMsg.BigBallOfMudSyncExtension", "handling xagreement configs");
                    h85 h85 = xo4.f228493X;
                    if (h85 != null) {
                        C116734h6.m164656l(h85.f134509d, h85.f134510e);
                    }
                }
            } else if (i4 == 53) {
                C49938j33 j332 = (C49938j33) new C49938j33().parseFrom(bArr2);
                Log.m105919d("MicroMsg.BigBallOfMudSyncExtension", "rollback, msgtype is %d, msgid is %d", Integer.valueOf(j332.f135848g), Long.valueOf(j332.f135849h));
                if (C72996z1.m85853x5(j332.f135845d)) {
                    RollbackTencentNewsEvent rollbackTencentNewsEvent = new RollbackTencentNewsEvent();
                    rollbackTencentNewsEvent.f193921d.f193922a = j332.f135849h;
                    rollbackTencentNewsEvent.publish();
                }
            } else if (i4 == 204) {
                SilenceNotifyEvent silenceNotifyEvent = new SilenceNotifyEvent();
                silenceNotifyEvent.f193936d.f193937a = bArr2;
                silenceNotifyEvent.publish();
            } else if (i4 == 219) {
                C49075d04 d042 = (C49075d04) new C49075d04().parseFrom(bArr2);
                if (d042 != null) {
                    ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69676X2(d042.f132054d, d042.f132055e);
                }
            } else if (i4 != 999999) {
                switch (i4) {
                    case 22:
                        C51113ri2 ri22 = (C51113ri2) new C51113ri2().parseFrom(bArr2);
                        C46069x xVar = new C46069x();
                        xVar.f124212a = ri22.f140932d;
                        xVar.f124213b = ri22.f140933e;
                        xVar.f124214c = (int) Util.nowSecond();
                        C75398e.zx0().mo71489jo(xVar);
                        break;
                    case 23:
                        C64266br1 br12 = (C64266br1) new C64266br1().parseFrom(bArr2);
                        int i18 = br12.f182324d;
                        if (i18 != 1) {
                            if (i18 != 4) {
                                Log.m105920e("MicroMsg.BigBallOfMudSyncExtension", "unknown function switch id:" + br12.f182324d);
                                break;
                            }
                        } else {
                            C97625j3.m125812b().mo105906u().mo119676J(17, Integer.valueOf(br12.f182325e));
                            break;
                        }
                        break;
                    case 24:
                        C64729tj3 tj32 = (C64729tj3) new C64729tj3().parseFrom(bArr2);
                        Assert.assertTrue(tj32 != null);
                        if (Util.nullAsNil(tj32.f185599d).length() > 0) {
                            z3 = true;
                        }
                        Assert.assertTrue(z3);
                        if (C72996z1.m85848s5(tj32.f185599d)) {
                            C72996z1 z1Var4 = C97625j3.m125812b().mo105907v().get(tj32.f185599d);
                            if (z1Var4 == null || z1Var4.mo62907i3() == 0) {
                                C72996z1 z1Var5 = new C72996z1(tj32.f185599d);
                                z1Var5.mo62855G3();
                                z1Var5.mo62878U2(tj32.f185600e);
                                z1Var5.mo62860K2(tj32.f185600e);
                                z1Var5.mo62866N3(4);
                                if (C97625j3.m125812b().mo105907v().mo69707j3(z1Var5) == -1) {
                                    Log.m105920e("MicroMsg.BigBallOfMudSyncExtension", "processModQContact: insert contact failed");
                                    break;
                                } else {
                                    ((C76708i) C86312j.m106911c(C76708i.class)).mo106827TR(z1Var5.getUsername());
                                }
                            } else if (!Util.nullAsNil(tj32.f185600e).equals(Util.nullAsNil(z1Var4.getUsername()))) {
                                z1Var4.mo62878U2(tj32.f185600e);
                                z1Var4.mo62860K2(tj32.f185600e);
                                if (C97625j3.m125812b().mo105907v().mo69719p3(z1Var4.getUsername(), z1Var4) == -1) {
                                    Log.m105920e("MicroMsg.BigBallOfMudSyncExtension", "processModQContact: update contact failed");
                                }
                            }
                            QMessageOperationEvent qMessageOperationEvent = new QMessageOperationEvent();
                            QMessageOperationEvent.C67762a aVar2 = qMessageOperationEvent.f193849d;
                            aVar2.f193851a = 1;
                            aVar2.f193854d = tj32.f185599d;
                            aVar2.f193855e = tj32.f185601f;
                            aVar2.f193856f = tj32.f185602g;
                            qMessageOperationEvent.publish();
                            break;
                        } else {
                            Log.m105928w("MicroMsg.BigBallOfMudSyncExtension", "processModQContact: qcontact should ends with @t.qq.com");
                            break;
                        }
                    case 25:
                        le4 le4 = (le4) new le4().parseFrom(bArr2);
                        Assert.assertTrue(le4 != null);
                        if (Util.nullAsNil(le4.f184085d).length() > 0) {
                            z3 = true;
                        }
                        Assert.assertTrue(z3);
                        if (C72996z1.m85798E5(le4.f184085d)) {
                            C72996z1 z1Var6 = C97625j3.m125812b().mo105907v().get(le4.f184085d);
                            if (z1Var6 == null || z1Var6.mo62907i3() == 0) {
                                C72996z1 z1Var7 = new C72996z1(le4.f184085d);
                                z1Var7.mo62860K2(le4.f184086e);
                                z1Var7.mo62866N3(1);
                                z1Var7.mo62855G3();
                                if (C97625j3.m125812b().mo105907v().mo69707j3(z1Var7) == -1) {
                                    Log.m105920e("MicroMsg.BigBallOfMudSyncExtension", "processModTContact: insert contact failed");
                                    break;
                                } else {
                                    C68081f.m80472g(z1Var7.getUsername());
                                }
                            } else if (!Util.nullAsNil(le4.f184086e).equals(Util.nullAsNil(z1Var6.getUsername()))) {
                                z1Var6.mo62860K2(le4.f184086e);
                                if (C97625j3.m125812b().mo105907v().mo69719p3(z1Var6.getUsername(), z1Var6) == -1) {
                                    Log.m105920e("MicroMsg.BigBallOfMudSyncExtension", "processModTContact: update contact failed");
                                }
                            }
                            TMessageOperationEvent tMessageOperationEvent = new TMessageOperationEvent();
                            TMessageOperationEvent.C67795a aVar3 = tMessageOperationEvent.f193948d;
                            aVar3.f193950a = 1;
                            aVar3.f193951b = le4.f184085d;
                            aVar3.f193952c = le4.f184087f;
                            aVar3.f193953d = le4.f184088g;
                            tMessageOperationEvent.publish();
                            break;
                        } else {
                            Log.m105928w("MicroMsg.BigBallOfMudSyncExtension", "processModTContact: tcontact should ends with @t.qq.com");
                            break;
                        }
                        break;
                    default:
                        Log.m105920e("MicroMsg.BigBallOfMudSyncExtension", "doCmd: no processing method, cmd id=" + pxVar2.f140037d);
                        break;
                }
            } else {
                m92988b(bArr);
            }
        } else {
            C77904ay2 ay22 = (C77904ay2) new C77904ay2().parseFrom(bArr2);
            Assert.assertTrue(ay22 != null);
            Assert.assertTrue(Util.nullAsNil(ay22.f226969d).length() > 0);
            C72996z1 z1Var8 = new C72996z1();
            z1Var8.setUsername(ay22.f226969d);
            z1Var8.setType(ay22.f226970e);
            z1Var8.mo62900f4(ay22.f226971f);
            z1Var8.mo62893c4(RegionCodeDecoder.m124564q(ay22.f226977o, ay22.f226973h, ay22.f226972g));
            z1Var8.mo62902g4(ay22.f226974i);
            C68097n nVar4 = new C68097n();
            nVar4.mo93600i(-1);
            nVar4.mo93606o(ay22.f226969d);
            nVar4.mo93605n(ay22.f226979q);
            nVar4.mo93599h(ay22.f226978p);
            Log.m105919d("MicroMsg.BigBallOfMudSyncExtension", "dkhurl bottle %s b[%s] s[%s]", nVar4.mo93598g(), nVar4.mo93594c(), nVar4.mo93597f());
            Log.m105918d("MicroMsg.BigBallOfMudSyncExtension", "bottlecontact imgflag:" + ay22.f226975j + " hd:" + ay22.f226976n);
            if (ay22.f226976n != 0) {
                z3 = true;
            }
            nVar4.mo93601j(z3);
            int i19 = ay22.f226975j;
            if (i19 == 3 || i19 == 4) {
                z1Var8.mo62879U3(i19);
                nVar4.mo93602k(ay22.f226975j);
            } else if (i19 == 2) {
                z1Var8.mo62879U3(3);
                nVar4.mo93602k(3);
                ((C68082g) ((C76706g) C86312j.m106911c(cls2)).mo106847uz()).mo93583j(ay22.f226969d, nVar4);
            } else {
                z1Var8.mo62879U3(3);
                nVar4.mo93602k(3);
            }
            ((C68098o) ((C76706g) C86312j.m106911c(cls2)).mo106832eg()).mo93608Yt(nVar4);
            C97625j3.m125812b().mo105907v().mo69704i3(z1Var8);
        }
    }
}
