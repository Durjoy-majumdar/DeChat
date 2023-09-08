package rw0;

import android.content.Context;
import android.database.Cursor;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.messenger.foundation.C69843t;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86301e;
import di3.C86312j;
import eb0.C45609f2;
import eb0.C45628s0;
import eb0.C75566c;
import eb0.C75569c4;
import eb0.C75592q0;
import eb0.C97625j3;
import ei3.C86522b;
import f40.C86709a0;
import f62.C75700k0;
import h81.C32735h;
import java.util.LinkedList;
import java.util.Set;
import ob0.C89137b0;
import ob0.b0$$h;
import qe3.C89625d;

@C86522b(dependencies = {C69843t.class}, onProcess = {C80625v0.MATCH_MM})
/* renamed from: rw0.q */
public class C48090q extends C86301e {

    /* renamed from: rw0.q$a */
    public class C48091a implements b0$$h {

        /* renamed from: rw0.q$a$a */
        public class C48092a implements Runnable {
            public C48092a(C48091a aVar) {
            }

            public void run() {
            }
        }

        public C48091a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x0037  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo72832a(ob0.C89137b0 r6, boolean r7) {
            /*
                r5 = this;
                if (r7 == 0) goto L_0x00ab
                boolean r6 = r6.f256815j
                if (r6 != 0) goto L_0x00ab
                rw0.q r6 = rw0.C48090q.this
                r6.getClass()
                boolean r6 = qc0.C101093a.m132481c()
                r7 = 0
                r0 = 1
                if (r6 == 0) goto L_0x0014
                goto L_0x002a
            L_0x0014:
                com.tencent.mm.autogen.events.TalkRoomServerEvent r6 = new com.tencent.mm.autogen.events.TalkRoomServerEvent
                r6.<init>()
                com.tencent.mm.autogen.events.TalkRoomServerEvent$a r1 = r6.f154883d
                r1.f154885a = r0
                r6.publish()
                com.tencent.mm.autogen.events.TalkRoomServerEvent$b r6 = r6.f154884e
                java.lang.String r6 = r6.f154887a
                boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
                if (r6 != 0) goto L_0x002c
            L_0x002a:
                r6 = 0
                goto L_0x002d
            L_0x002c:
                r6 = 1
            L_0x002d:
                java.lang.String r1 = "MicroMsg.MMCoreInitTask"
                if (r6 != 0) goto L_0x0037
                java.lang.String r6 = "can't kill the working process"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r6)
                return
            L_0x0037:
                com.tencent.p014mm.p136ui.MMAppMgr.m85992l()
                com.tencent.p014mm.sdk.platformtools.Log.appenderClose()
                com.tencent.mars.Mars.onSingalCrash(r7)
                java.lang.String r6 = "now killing the working process...."
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r6)
                java.util.HashSet<mg0.c> r6 = sf0.C13658a.f38695a
                byte[] r6 = sf0.C13658a.C13661c.f38699i
                android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                android.content.Intent r1 = new android.content.Intent
                java.lang.Class<com.tencent.mm.booter.NotifyReceiver$NotifyService> r2 = com.tencent.p014mm.booter.NotifyReceiver.NotifyService.class
                r1.<init>(r6, r2)
                java.lang.String r6 = "mm"
                android.content.Intent r2 = ke3.C88144b.m109786e(r6)
                com.tencent.p014mm.service.C116024c.m163165e(r1, r6, r0, r2)
                rw0.q$a$a r6 = new rw0.q$a$a
                r6.<init>(r5)
                java.util.List<java.lang.String> r0 = com.tencent.p014mm.modelavatar.C68099t.f195740a
                f40.e r0 = f40.C86709a0.m107523b()
                boolean r0 = r0.mo121114l()
                if (r0 != 0) goto L_0x006f
                goto L_0x00ab
            L_0x006f:
                com.tencent.mm.modelavatar.o r0 = com.tencent.p014mm.modelavatar.C68102u.zx0()
                r0.getClass()
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                zh3.f r0 = r0.f195738d
                r2 = 0
                r3 = 2
                java.lang.String r4 = "select username from img_flag where username not in (select username from rcontact ) and username not like \"%@qqim\" and username not like \"%@bottle\";"
                android.database.Cursor r0 = r0.rawQuery(r4, r2, r3)
            L_0x0086:
                boolean r2 = r0.moveToNext()
                if (r2 == 0) goto L_0x0094
                java.lang.String r2 = r0.getString(r7)
                r1.add(r2)
                goto L_0x0086
            L_0x0094:
                r0.close()
                com.tencent.p014mm.modelavatar.C68099t.f195740a = r1
                int r7 = r1.size()
                if (r7 > 0) goto L_0x00a0
                goto L_0x00ab
            L_0x00a0:
                com.tencent.mm.modelavatar.t$a r7 = com.tencent.p014mm.modelavatar.C68099t.f195742c
                com.tencent.mm.modelavatar.t$b r0 = r7.f195743a
                r0.f195744d = r6
                r0 = 10
                r7.startTimer(r0)
            L_0x00ab:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: rw0.C48090q.C48091a.mo72832a(ob0.b0, boolean):void");
        }

        /* renamed from: k */
        public void mo72833k(C89137b0 b0Var) {
        }
    }

    public void onAccountInitialized(Context context) {
        super.onAccountInitialized(context);
        C97625j3 d = C97625j3.m125814d();
        boolean z = C86709a0.m107523b().f251754e.f222289a;
        Class cls = C75700k0.class;
        Class cls2 = C32735h.class;
        C75566c cVar = d.f286397a;
        if (z) {
            Log.m105924i("MicroMsg.MMCore", "[doAccountPostReset] updated is true");
            cVar.mo105907v().mo69688c("readerapp");
            cVar.mo105906u().mo119676J(256, Boolean.TRUE);
            Log.m105924i("MicroMsg.MMCore", "[doAccountPostReset] begin to updated HardCodeUpdate");
            Set<String> set = C45628s0.f123410p;
            LinkedList<C72996z1> linkedList = new LinkedList<>();
            Cursor N3 = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69665N3();
            if (N3.getCount() == 0) {
                N3.close();
            } else {
                N3.moveToFirst();
                do {
                    C72996z1 z1Var = new C72996z1();
                    z1Var.convertFrom(N3);
                    linkedList.add(z1Var);
                } while (N3.moveToNext());
                N3.close();
                Log.m105918d("MicroMsg.ContactStorageLogic", "getFavourList size:  " + linkedList.size());
            }
            Log.m105925i("MicroMsg.HardCodeUpdateTask", "[updateHelperIndexFor50] size:%s", Integer.valueOf(linkedList.size()));
            for (C72996z1 z1Var2 : linkedList) {
                if (!(z1Var2 == null || ((int) z1Var2.f108320R1) == 0 || z1Var2.mo62845A2() != 32)) {
                    z1Var2.mo62886Y2(z1Var2.mo62901g3());
                    Log.m105918d("MicroMsg.HardCodeUpdateTask", "contact to updatefavour " + z1Var2.getUsername());
                    C97625j3.m125812b().mo105907v().mo69719p3(z1Var2.getUsername(), z1Var2);
                }
            }
            for (String str : C45628s0.f123409o) {
                C72996z1 z1Var3 = cVar.mo105907v().get(str);
                if (z1Var3 != null && (((int) z1Var3.f108320R1) != 0 || z1Var3.mo62927s3())) {
                    z1Var3.mo62877T3();
                    cVar.mo105907v().mo69719p3(str, z1Var3);
                }
            }
            Cursor w3 = cVar.mo105907v().mo69728w3();
            Object[] objArr = new Object[1];
            objArr[0] = Integer.valueOf(w3 == null ? 0 : w3.getCount());
            Log.m105925i("MicroMsg.HardCodeUpdateTask", "[unstarAllBizContactFor50] size:%s", objArr);
            if (w3.moveToFirst()) {
                do {
                    C72996z1 z1Var4 = new C72996z1();
                    z1Var4.convertFrom(w3);
                    z1Var4.mo62937v4();
                    cVar.mo105907v().mo69719p3(z1Var4.getUsername(), z1Var4);
                } while (w3.moveToNext());
            }
            w3.close();
            C75569c4.m90660F("ver" + C89625d.f257841g);
            C45609f2 f2Var = new C45609f2();
            if (z) {
                C45609f2.m50669a(((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get("filehelper"));
                String s = C75592q0.m90789s();
                if (!Util.isNullOrNil(s)) {
                    C72996z1 z1Var5 = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(s);
                    if (((int) z1Var5.f108320R1) == 0) {
                        z1Var5.setUsername(s);
                        z1Var5.mo62868O3();
                        ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69667P3(z1Var5);
                    } else if (!z1Var5.mo62927s3()) {
                        z1Var5.mo62868O3();
                        ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69719p3(s, z1Var5);
                    }
                }
                f2Var.mo71123b(z, "qqmail", false);
                f2Var.mo71123b(z, "floatbottle", false);
                f2Var.mo71123b(z, "shakeapp", false);
                f2Var.mo71123b(z, "lbsapp", false);
                f2Var.mo71123b(z, "medianote", false);
                f2Var.mo71123b(z, "newsapp", true);
                ((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69763f("blogapp");
                ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).mo101089TE("blogapp");
                ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69688c("blogapp");
                f2Var.mo71123b(z, "facebookapp", true);
                f2Var.mo71123b(z, "qqfriend", false);
                f2Var.mo71123b(z, "masssendapp", true);
                f2Var.mo71123b(z, "feedsapp", true);
                ((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69763f("tmessage");
                ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69688c("tmessage");
                C72996z1 z1Var6 = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get("voip");
                C72996z1 z1Var7 = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get("voipapp");
                if (z1Var7 == null) {
                    z1Var7 = new C72996z1();
                }
                if (!(z1Var6 == null || ((int) z1Var6.f108320R1) == 0)) {
                    ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69688c("voip");
                }
                if (((int) z1Var7.f108320R1) == 0) {
                    z1Var7.setUsername("voipapp");
                    z1Var7.mo62868O3();
                    C45609f2.m50670c(z1Var7);
                    z1Var7.mo62879U3(4);
                    z1Var7.mo62877T3();
                    ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69707j3(z1Var7);
                } else if (z) {
                    z1Var7.mo62877T3();
                    ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69719p3("voipapp", z1Var7);
                }
                C72996z1 z1Var8 = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get("officialaccounts");
                if (z1Var8 == null) {
                    z1Var8 = new C72996z1();
                }
                Log.m105925i("MicroMsg.HardCodeHelper", "hardcodeOfficialAccounts:update[%B], contactID[%d]", Boolean.valueOf(z), Integer.valueOf((int) z1Var8.f108320R1));
                if (((int) z1Var8.f108320R1) == 0) {
                    z1Var8.setUsername("officialaccounts");
                    z1Var8.mo62935u4();
                    C45609f2.m50670c(z1Var8);
                    z1Var8.mo62879U3(3);
                    ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69707j3(z1Var8);
                } else if (z) {
                    Log.m105924i("MicroMsg.HardCodeHelper", "do update hardcode official accounts");
                    z1Var8.mo62935u4();
                    ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69719p3("officialaccounts", z1Var8);
                }
                C72996z1 z1Var9 = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get("voipaudio");
                C72996z1 z1Var10 = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get("voicevoipapp");
                if (z1Var10 == null) {
                    z1Var10 = new C72996z1();
                }
                if (!(z1Var9 == null || ((int) z1Var9.f108320R1) == 0)) {
                    ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69688c("voipaudio");
                }
                if (((int) z1Var10.f108320R1) == 0) {
                    z1Var10.setUsername("voicevoipapp");
                    z1Var10.mo62868O3();
                    C45609f2.m50670c(z1Var10);
                    z1Var10.mo62879U3(4);
                    z1Var10.mo62877T3();
                    ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69707j3(z1Var10);
                } else if (z) {
                    z1Var10.mo62877T3();
                    ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69719p3("voicevoipapp", z1Var10);
                }
                f2Var.mo71123b(z, "voiceinputapp", false);
                f2Var.mo71123b(z, "linkedinplugin", false);
                C72996z1 z1Var11 = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get("notifymessage");
                if (z1Var11 == null) {
                    z1Var11 = new C72996z1();
                }
                Log.m105925i("MicroMsg.HardCodeHelper", "hardcodeOfficialAccounts:update[%B], contactID[%d]", Boolean.valueOf(z), Integer.valueOf((int) z1Var11.f108320R1));
                if (((int) z1Var11.f108320R1) == 0) {
                    z1Var11.setUsername("notifymessage");
                    z1Var11.mo62935u4();
                    C45609f2.m50670c(z1Var11);
                    z1Var11.mo62879U3(3);
                    ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69707j3(z1Var11);
                } else if (z) {
                    Log.m105924i("MicroMsg.HardCodeHelper", "do update hardcode official accounts");
                    z1Var11.mo62935u4();
                    ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69719p3("notifymessage", z1Var11);
                }
                C72996z1 z1Var12 = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get("appbrandcustomerservicemsg");
                if (z1Var12 == null) {
                    z1Var12 = new C72996z1();
                }
                Log.m105925i("MicroMsg.HardCodeHelper", "hardcodeAppBrandServiceMessage:update[%B], contactID[%d]", Boolean.valueOf(z), Integer.valueOf((int) z1Var12.f108320R1));
                if (((int) z1Var12.f108320R1) == 0) {
                    z1Var12.setUsername("appbrandcustomerservicemsg");
                    z1Var12.mo62935u4();
                    C45609f2.m50670c(z1Var12);
                    z1Var12.mo62919n4(0);
                    z1Var12.mo62879U3(3);
                    ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69707j3(z1Var12);
                } else if (z) {
                    Log.m105924i("MicroMsg.HardCodeHelper", "do update app brand service message accunt");
                    z1Var12.mo62935u4();
                    ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69719p3("appbrandcustomerservicemsg", z1Var12);
                }
                C72996z1 z1Var13 = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get("appbrand_notify_message");
                if (z1Var13 == null) {
                    z1Var13 = new C72996z1();
                }
                Log.m105925i("MicroMsg.HardCodeHelper", "hardcodeAppBrandNotifyMessage:update[%B], contactID[%d]", Boolean.valueOf(z), Integer.valueOf((int) z1Var13.f108320R1));
                if (((int) z1Var13.f108320R1) == 0) {
                    z1Var13.setUsername("appbrand_notify_message");
                    z1Var13.mo62935u4();
                    C45609f2.m50670c(z1Var13);
                    z1Var13.mo62879U3(3);
                    ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69707j3(z1Var13);
                } else if (z) {
                    Log.m105924i("MicroMsg.HardCodeHelper", "do update app brand service message accunt");
                    z1Var13.mo62935u4();
                    ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69719p3("appbrand_notify_message", z1Var13);
                }
                f2Var.mo71123b(z, "downloaderapp", true);
                C72996z1 z1Var14 = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get("opencustomerservicemsg");
                if (z1Var14 == null) {
                    z1Var14 = new C72996z1();
                }
                Log.m105925i("MicroMsg.HardCodeHelper", "hardcodeOpenImKefuService:update[%B], contactID[%d]", Boolean.valueOf(z), Integer.valueOf((int) z1Var14.f108320R1));
                if (((int) z1Var14.f108320R1) == 0) {
                    z1Var14.setUsername("opencustomerservicemsg");
                    z1Var14.mo62935u4();
                    C45609f2.m50670c(z1Var14);
                    z1Var14.mo62879U3(3);
                    ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69707j3(z1Var14);
                } else if (z) {
                    Log.m105924i("MicroMsg.HardCodeHelper", "do update openImKefuService accunt");
                    z1Var14.mo62935u4();
                    ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69719p3("opencustomerservicemsg", z1Var14);
                }
                if (z) {
                    ((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69763f("Weixin");
                    ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69688c("Weixin");
                }
            }
        }
        int Qe = ((C32735h) C86312j.m106911c(cls2)).mo58779Qe(C32735h.C32737c.clicfg_media_fade_switch, 1);
        float xe = ((C32735h) C86312j.m106911c(cls2)).mo58785xe(C32735h.C32737c.clicfg_media_fade_thumb_scale, 0.75f);
        C32735h.C32737c cVar2 = C32735h.C32737c.clicfg_media_fade_image_preview_scale;
        float xe4 = ((C32735h) C86312j.m106911c(cls2)).mo58785xe(cVar2, 0.4f);
        float xe5 = ((C32735h) C86312j.m106911c(cls2)).mo58785xe(cVar2, 0.4f);
        C75569c4.f222000c = Qe;
        C75569c4.f222001d = xe;
        C75569c4.f222002e = xe4;
        C75569c4.f222003f = xe5;
    }

    public void onCreate(Context context) {
        super.onCreate(context);
        C97625j3.m125814d();
        C86709a0.m107528h().f251731h.add(new C48091a());
    }
}
