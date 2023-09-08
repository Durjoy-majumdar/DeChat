package fw0;

import a11.C39479c;
import a22.C27740g;
import a22.C67001a;
import b22.C28250a;
import b22.C28251b;
import cm0.C28613b;
import com.tencent.p014mm.autogen.events.ChatroomMemberInviteerUpdatedEvent;
import com.tencent.p014mm.contact.C1233a;
import com.tencent.p014mm.modelavatar.AvatarStorage;
import com.tencent.p014mm.modelavatar.C68081f;
import com.tencent.p014mm.modelavatar.C68098o;
import com.tencent.p014mm.plugin.profile.C70142g;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44651a5;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C44673z4;
import com.tencent.p014mm.storage.C72955b2;
import com.tencent.p014mm.storage.C72976h2;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C72996z1;
import d22.C75319a;
import de3.C75369r;
import dg0.C75398e;
import di3.C86312j;
import eb0.C31519v2;
import eb0.C45612m0;
import eb0.C45628s0;
import eb0.C75592q0;
import eb0.C75597w2;
import eb0.C97625j3;
import f40.C86709a0;
import f62.C27050c0;
import f62.C75700k0;
import g62.C32330n;
import g62.C75880o;
import h81.C32735h;
import hg0.C76166a;
import hg0.C76168b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import jr2.C99019x;
import ob0.C11385n;
import ob0.C117747y;
import org.json.JSONException;
import org.json.JSONObject;
import os2.C100399d0;
import p196ln.C76706g;
import p227rn.C48053v;
import p248ug.C52558c;
import p788aj.C39608b;
import rb0.C47984k;
import rb0.C48009v0;
import sf0.C48374j0;
import sf0.C77691f;
import tc0.C48623d;
import tc0.C77885p;
import te3.C49324es;
import te3.C49628gy2;
import te3.C49630gz2;
import te3.C50052jy2;
import te3.C50467my2;
import te3.C50482n20;
import te3.C50527nd3;
import te3.C50665od3;
import te3.C51043r10;
import te3.C51866wq2;
import te3.a94;
import zt3.C119157j;

/* renamed from: fw0.d */
public class C75804d implements C27050c0, C11385n {

    /* renamed from: d */
    public static int f222422d = -1;

    /* renamed from: fw0.d$a */
    public class C45812a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C117747y f123715d;

        public C45812a(C75804d dVar, C117747y yVar) {
            this.f123715d = yVar;
        }

        public void run() {
            List<C75880o> list = ((C48623d) this.f123715d).f130155f;
            HashSet hashSet = new HashSet();
            try {
                Iterator it = ((ArrayList) list).iterator();
                while (it.hasNext()) {
                    C75880o oVar = (C75880o) it.next();
                    if (oVar.mo58568b() == 2) {
                        hashSet.add(C48374j0.m53718g(((C50052jy2) new C50052jy2().parseFrom(oVar.mo106149a())).f136424d));
                    } else if (oVar.mo58568b() == 54) {
                        hashSet.add(((C50467my2) new C50467my2().parseFrom(oVar.mo106149a())).f138287d);
                    } else if (oVar.mo58568b() == 60) {
                        hashSet.add(((C49630gz2) new C49630gz2().parseFrom(oVar.mo106149a())).f134369d);
                    } else if (oVar.mo58568b() == 74) {
                        hashSet.add(((C49628gy2) new C49628gy2().parseFrom(oVar.mo106149a())).f134349d.f141175d);
                    }
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.BigBallContactAssemblerImpl", e, "BaseProtoBuf parseFrom error!", new Object[0]);
            }
            Iterator it4 = hashSet.iterator();
            while (it4.hasNext()) {
                String str = (String) it4.next();
                if (!Util.isNullOrNil(str)) {
                    C31519v2.m39436a().mo55988e(str, (String) null, (C75597w2.C31525a) null);
                }
            }
        }
    }

    /* renamed from: a */
    public static boolean m91047a(C72996z1 z1Var, C50052jy2 jy22, boolean z) {
        C76166a a;
        Class cls = C76706g.class;
        if (z1Var == null || Util.isNullOrNil(z1Var.getUsername())) {
            Log.m105920e("MicroMsg.BigBallContactAssemblerImpl", "dkinit dealModContactExtInfo failed invalid contact");
            return false;
        }
        String username = z1Var.getUsername();
        String v2 = z1Var.mo73978v2();
        if (z1Var.mo62932t3()) {
            ((AvatarStorage) ((C76706g) C86312j.m106911c(cls)).mo106826RE()).mo93566o(username, true);
            Log.m105924i("MicroMsg.BigBallContactAssemblerImpl", "isDeleteContact, so delete avatar file.");
        } else {
            ((C68098o) ((C76706g) C86312j.m106911c(cls)).mo106832eg()).mo93608Yt(C68081f.m80470e(username, jy22, z1Var));
        }
        a94 a94 = jy22.f136403R;
        if (!z1Var.getUsername().endsWith("@chatroom") && a94 != null) {
            Log.m105924i("MicroMsg.BigBallContactAssemblerImpl", "SnsFlag modcontact " + a94.f130392d + " " + jy22.f136424d);
            StringBuilder sb = new StringBuilder();
            sb.append("SnsBg modcontact ");
            sb.append(a94.f130393e);
            Log.m105924i("MicroMsg.BigBallContactAssemblerImpl", sb.toString());
            Log.m105924i("MicroMsg.BigBallContactAssemblerImpl", "SnsBgId modcontact " + a94.f130394f);
            Log.m105924i("MicroMsg.BigBallContactAssemblerImpl", "SnsBgId modcontact " + a94.f130395g);
            Log.m105924i("MicroMsg.BigBallContactAssemblerImpl", "SnsBgId modcontact " + a94.f130396h);
            if (C99019x.m128971c() != null) {
                ((C100399d0) C99019x.m128971c()).mo139792uP(z1Var.getUsername(), a94);
            }
        }
        if (z1Var.mo62927s3()) {
            C70142g.m82635g(username, v2);
        }
        if (z1Var.mo62927s3() && ((z1Var.getSource() == 10 || z1Var.getSource() == 13) && (a = C75398e.vx0().mo106401a(z1Var.mo73978v2())) != null && !Util.isNullOrNil(a.f223133u))) {
            a.f223120h = z1Var.getUsername();
            int d = C75398e.vx0().mo106403d(a.f223133u, a);
            Log.m105918d("MicroMsg.BigBallContactAssemblerImpl", "account sync: update addr " + d);
        }
        m91050d(jy22, username, z1Var, z);
        return true;
    }

    /* renamed from: b */
    public static void m91048b(C72996z1 z1Var) {
        if (z1Var != null && C47984k.m53335i(z1Var.getUsername()) && !((C48053v) C86312j.m106911c(C48053v.class)).mo72614OE(z1Var.getUsername())) {
            C72976h2 j = ((C44660i2) C97625j3.m125812b().mo105908w()).mo69771j(z1Var.getUsername());
            C52558c SE = C48009v0.Fx0().mo72757SE(z1Var.getUsername());
            if (C47984k.m53336j(SE.field_username) && j == null) {
                C72976h2 h2Var = new C72976h2(SE.field_username);
                Log.m105925i("MicroMsg.BigBallContactAssemblerImpl", "Enterprise belong %s, userName: %s", SE.mo73498p2(), SE.field_username);
                h2Var.mo108807c3(Util.nullAsNil(SE.mo73498p2()));
                h2Var.mo101162m3();
                ((C44660i2) C97625j3.m125812b().mo105908w()).mo69751W(h2Var);
            }
        }
    }

    /* renamed from: c */
    public static boolean m91049c(String str) {
        if (Util.isNullOrNil(str)) {
            return false;
        }
        Matcher matcher = C75369r.f221598n.matcher(str);
        return matcher.find() && Util.isEqual(str, matcher.group(0));
    }

    /* renamed from: d */
    public static void m91050d(C50052jy2 jy22, String str, C72996z1 z1Var, boolean z) {
        JSONObject jSONObject;
        String s = C75592q0.m90789s();
        if (s != null && !s.equals(str)) {
            C52558c SE = C48009v0.Fx0().mo72757SE(str);
            SE.field_username = str;
            SE.field_brandList = jy22.f136411V;
            C51043r10 r102 = jy22.f136413W;
            if (r102 != null) {
                SE.field_brandFlag = r102.f140656d;
                SE.field_brandInfo = r102.f140658f;
                SE.field_brandIconURL = r102.f140659g;
                if (z) {
                    if ("gh_f0a92aa7146c".equals(str) && !Util.isNullOrNil(r102.f140657e)) {
                        Log.m105924i("MicroMsg.BigBallContactAssemblerImpl", "is WXPAY_COLLECTION，use wxpay menu data");
                        String str2 = r102.f140657e;
                        C86709a0.m107528h();
                        String str3 = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WX_PAY_REVEIVE_PLUGIN_MENU_STRING_SYNC, (Object) null);
                        if (!Util.isNullOrNil(str3) && !Util.isNullOrNil(str2)) {
                            try {
                                jSONObject = new JSONObject(str2);
                            } catch (Exception e) {
                                Log.m105921e("MicroMsg.BigBallContactAssemblerImpl", "create Json object from extInfo error. %s.", e);
                                jSONObject = new JSONObject();
                            }
                            try {
                                jSONObject.put("MMBizMenu", str3);
                            } catch (JSONException e2) {
                                Log.m105921e("MicroMsg.BigBallContactAssemblerImpl", "updateExtInfoAttrs MMBizMenu failed：value(%s), exception : %s.", str3, e2);
                            }
                            str2 = jSONObject.toString();
                        }
                        r102.f140657e = str2;
                    }
                    String str4 = r102.f140657e;
                    SE.field_extInfo = str4;
                    Log.m105925i("MicroMsg.BigBallContactAssemblerImpl", "update extInfo=%s", str4);
                    SE.field_attrSyncVersion = null;
                    SE.field_incrementUpdateTime = 0;
                    Log.m105925i("MicroMsg.BigBallContactAssemblerImpl", "Reset biz(%s) Attribute syncVersion and incUpdateTime.", str);
                }
                if (!Util.isNullOrNil(SE.field_extInfo)) {
                    SE.mo73500r2(true);
                }
            }
            if (SE.mo73500r2(false) != null && SE.mo73500r2(false).mo73517j() == 3 && SE.mo73500r2(false).mo73511d() != null && !Util.isNullOrNil(SE.mo73498p2())) {
                String p2 = SE.mo73498p2();
                SE.field_enterpriseFather = p2;
                Log.m105919d("MicroMsg.BigBallContactAssemblerImpl", "saveBizInfo, %s set enterpriseFather %s", str, p2);
            }
            if (!C48009v0.Fx0().replace(SE)) {
                C48009v0.Fx0().insert(SE);
            }
            z1Var.mo62852D3(SE.field_type);
        }
    }

    /* renamed from: e */
    public static boolean m91051e(C72996z1 z1Var, C44673z4 z4Var) {
        if (!Util.isNullOrNil(z4Var.field_conDescription)) {
            z1Var.mo62895d4(z4Var.field_conDescription);
        }
        if (C72996z1.m85796D5(z1Var.getUsername()) || !z1Var.mo62927s3()) {
            return false;
        }
        if (Util.isNullOrNil(z4Var.field_conDescription)) {
            return true;
        }
        C50467my2 my22 = new C50467my2();
        my22.f138287d = z1Var.getUsername();
        my22.f138288e = z4Var.field_conDescription;
        ((C77885p) C97625j3.m125812b().mo105876B()).mo107993q(new C32330n(54, my22));
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: com.tencent.mm.storage.b4[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: com.tencent.mm.storage.b4[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: com.tencent.mm.storage.u4[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: xh.g8[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: com.tencent.mm.storage.u4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: com.tencent.mm.storage.b4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: com.tencent.mm.storage.m3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v29, resolved type: com.tencent.mm.storage.u4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v35, resolved type: com.tencent.mm.storage.b4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v6, resolved type: com.tencent.mm.storage.m3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: xh.g8[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: com.tencent.mm.storage.m3[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v0, resolved type: xh.g8[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: xh.g8[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: com.tencent.mm.storage.b4[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: com.tencent.mm.storage.b4[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v26, resolved type: xh.g8[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: com.tencent.mm.storage.u4[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v12, resolved type: java.lang.Object[]} */
    /* JADX WARNING: type inference failed for: r1v1, types: [boolean] */
    /* JADX WARNING: type inference failed for: r1v31 */
    /* JADX WARNING: type inference failed for: r15v4 */
    /* JADX WARNING: type inference failed for: r1v32 */
    /* JADX WARNING: type inference failed for: r1v33 */
    /* JADX WARNING: type inference failed for: r1v34 */
    /* JADX WARNING: type inference failed for: r15v8 */
    /* JADX WARNING: type inference failed for: r15v9, types: [boolean] */
    /* JADX WARNING: type inference failed for: r15v10 */
    /* JADX WARNING: type inference failed for: r15v15 */
    /* JADX WARNING: type inference failed for: r15v16 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x03ee A[SYNTHETIC, Splitter:B:132:0x03ee] */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0436  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x04f9  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0530  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0532  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0539  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0584  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x05ca  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x05dc  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x05f8  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x0696  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x06bd  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x06e5  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x08e0  */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x08e6  */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x098c  */
    /* JADX WARNING: Removed duplicated region for block: B:347:0x0b88  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01f3  */
    /* renamed from: W4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo54198W4(com.tencent.p014mm.storage.C72996z1 r29, com.tencent.p014mm.storage.C72996z1 r30, te3.C50052jy2 r31, byte[] r32, boolean r33) {
        /*
            r28 = this;
            r1 = r29
            r2 = r30
            r3 = r31
            java.lang.Class<kr0.q0> r0 = kr0.C34010q0.class
            java.lang.Class<rn.v> r4 = p227rn.C48053v.class
            java.lang.Class<f62.k0> r5 = f62.C75700k0.class
            java.lang.String r15 = r29.getUsername()
            java.lang.String r14 = r29.mo73978v2()
            r13 = 3
            java.lang.Object[] r6 = new java.lang.Object[r13]
            java.lang.String r7 = r30.mo73978v2()
            r11 = 0
            r6[r11] = r7
            java.lang.String r7 = r29.mo73978v2()
            r12 = 1
            r6[r12] = r7
            java.lang.String r7 = r3.f136419Z
            r9 = 2
            r6[r9] = r7
            java.lang.String r10 = "MicroMsg.BigBallContactAssemblerImpl"
            java.lang.String r7 = "oldEncryptUser:%s, newEncryptUser:%s, cmd:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r7, r6)
            boolean r6 = com.tencent.p014mm.storage.C72996z1.m85820U5(r15)
            r16 = 8
            if (r6 == 0) goto L_0x0427
            te3.es r6 = r3.f136414W0
            if (r6 == 0) goto L_0x020e
            java.util.LinkedList<te3.fs> r6 = r6.f133094e
            ed0.b r7 = ed0.C75610d.m90860b()
            if (r7 != 0) goto L_0x004e
        L_0x0045:
            r13 = r10
            r32 = r14
            r17 = r15
            r14 = 0
            r15 = 1
            goto L_0x0134
        L_0x004e:
            ed0.b r7 = ed0.C75610d.m90860b()
            t22.y r7 = (t22.C118355y) r7
            java.lang.String r7 = r7.f353752u
            boolean r17 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r17 != 0) goto L_0x012c
            boolean r7 = r7.equals(r15)
            if (r7 == 0) goto L_0x012c
            boolean r7 = com.tencent.p014mm.storage.C72996z1.m85820U5(r15)
            if (r7 != 0) goto L_0x006a
            goto L_0x012c
        L_0x006a:
            if (r6 == 0) goto L_0x0092
            java.util.Iterator r6 = r6.iterator()
        L_0x0070:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0092
            java.lang.Object r7 = r6.next()
            te3.fs r7 = (te3.C49464fs) r7
            java.lang.String r8 = r7.f133650d
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r8 == 0) goto L_0x0085
            goto L_0x0070
        L_0x0085:
            java.lang.String r7 = r7.f133650d
            java.lang.String r8 = eb0.C75592q0.m90789s()
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x0070
            goto L_0x0045
        L_0x0092:
            ed0.a r6 = ed0.C75610d.m90859a()
            if (r6 == 0) goto L_0x00df
            ed0.a r6 = ed0.C75610d.m90859a()
            java.lang.String r7 = eb0.C75592q0.m90789s()
            t22.z r6 = (t22.C77833z) r6
            boolean r6 = r6.mo107955h(r15, r7)
            if (r6 == 0) goto L_0x00b9
            java.lang.String r6 = "kicked self shareing"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r6)
            com.tencent.mm.autogen.events.TrackRemoveTipEvent r6 = new com.tencent.mm.autogen.events.TrackRemoveTipEvent
            r6.<init>()
            com.tencent.mm.autogen.events.TrackRemoveTipEvent$a r7 = r6.f193959d
            r7.f193960a = r15
            r6.publish()
        L_0x00b9:
            ed0.a r6 = ed0.C75610d.m90859a()
            r8 = 0
            r17 = 0
            r19 = 0
            t22.z r6 = (t22.C77833z) r6
            java.lang.String r21 = ""
            java.lang.String r22 = ""
            java.lang.String r23 = ""
            r7 = r15
            r24 = r10
            r9 = r17
            r11 = r19
            r13 = r21
            r32 = r14
            r14 = r22
            r17 = r15
            r15 = r23
            r6.mo107956i(r7, r8, r9, r11, r13, r14, r15)
            goto L_0x00e5
        L_0x00df:
            r24 = r10
            r32 = r14
            r17 = r15
        L_0x00e5:
            ed0.b r6 = ed0.C75610d.m90860b()
            if (r6 == 0) goto L_0x0126
            ed0.a r6 = ed0.C75610d.m90859a()
            t22.z r6 = (t22.C77833z) r6
            java.lang.String r6 = r6.mo107949b()
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 != 0) goto L_0x0126
            r15 = 1
            java.lang.Object[] r6 = new java.lang.Object[r15]
            ed0.b r7 = ed0.C75610d.m90860b()
            t22.y r7 = (t22.C118355y) r7
            java.lang.String r7 = r7.f353752u
            r14 = 0
            r6[r14] = r7
            java.lang.String r7 = "sync remove chatroom end track %s"
            r13 = r24
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r7, r6)
            com.tencent.mm.autogen.events.ExitTrackRoomEvent r6 = new com.tencent.mm.autogen.events.ExitTrackRoomEvent
            r6.<init>()
            com.tencent.mm.autogen.events.ExitTrackRoomEvent$a r7 = r6.f193553d
            ed0.b r8 = ed0.C75610d.m90860b()
            t22.y r8 = (t22.C118355y) r8
            java.lang.String r8 = r8.f353752u
            r7.f193554a = r8
            r6.publish()
            goto L_0x012a
        L_0x0126:
            r13 = r24
            r14 = 0
            r15 = 1
        L_0x012a:
            r11 = 1
            goto L_0x0134
        L_0x012c:
            r13 = r10
            r32 = r14
            r17 = r15
            r14 = 0
            r15 = 1
            r11 = 0
        L_0x0134:
            if (r11 != 0) goto L_0x01c0
            te3.es r6 = r3.f136414W0
            java.util.LinkedList<te3.fs> r6 = r6.f133094e
            com.tencent.mm.autogen.events.TalkRoomServerEvent r7 = new com.tencent.mm.autogen.events.TalkRoomServerEvent
            r7.<init>()
            com.tencent.mm.autogen.events.TalkRoomServerEvent$a r8 = r7.f154883d
            r8.f154885a = r15
            r7.publish()
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r17)
            if (r8 != 0) goto L_0x01c0
            boolean r8 = com.tencent.p014mm.storage.C72996z1.m85820U5(r17)
            if (r8 == 0) goto L_0x01c0
            com.tencent.mm.autogen.events.TalkRoomServerEvent$b r8 = r7.f154884e
            java.lang.String r8 = r8.f154887a
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r8 != 0) goto L_0x01c0
            com.tencent.mm.autogen.events.TalkRoomServerEvent$b r7 = r7.f154884e
            java.lang.String r7 = r7.f154887a
            r12 = r17
            boolean r7 = r12.equals(r7)
            if (r7 != 0) goto L_0x0169
            goto L_0x01c2
        L_0x0169:
            if (r6 == 0) goto L_0x0191
            java.util.Iterator r6 = r6.iterator()
        L_0x016f:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0191
            java.lang.Object r7 = r6.next()
            te3.fs r7 = (te3.C49464fs) r7
            java.lang.String r8 = r7.f133650d
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r8 == 0) goto L_0x0184
            goto L_0x016f
        L_0x0184:
            java.lang.String r7 = r7.f133650d
            java.lang.String r8 = eb0.C75592q0.m90789s()
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x016f
            goto L_0x01c2
        L_0x0191:
            dd0.b r6 = dd0.C75350g.m90357a()
            if (r6 == 0) goto L_0x01a7
            dd0.b r6 = dd0.C75350g.m90357a()
            r8 = 0
            r11 = 0
            sx2.j r6 = (sx2.C48497j) r6
            java.lang.String r9 = ""
            java.lang.String r10 = ""
            r7 = r12
            r6.mo73133g(r7, r8, r9, r10, r11)
        L_0x01a7:
            com.tencent.mm.autogen.events.TalkRoomServerEvent r6 = new com.tencent.mm.autogen.events.TalkRoomServerEvent
            r6.<init>()
            com.tencent.mm.autogen.events.TalkRoomServerEvent$a r7 = r6.f154883d
            r7.f154886b = r15
            r6.publish()
            com.tencent.mm.autogen.events.TalkRoomReportMgrEvent r6 = new com.tencent.mm.autogen.events.TalkRoomReportMgrEvent
            r6.<init>()
            com.tencent.mm.autogen.events.TalkRoomReportMgrEvent$a r7 = r6.f79030d
            r7.f79031a = r15
            r6.publish()
            goto L_0x01c2
        L_0x01c0:
            r12 = r17
        L_0x01c2:
            te3.es r6 = r3.f136414W0
            java.util.LinkedList<te3.fs> r6 = r6.f133094e
            if (r6 == 0) goto L_0x01f0
            java.util.Iterator r6 = r6.iterator()
        L_0x01cc:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x01ee
            java.lang.Object r7 = r6.next()
            te3.fs r7 = (te3.C49464fs) r7
            java.lang.String r8 = r7.f133650d
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r8 == 0) goto L_0x01e1
            goto L_0x01cc
        L_0x01e1:
            java.lang.String r7 = r7.f133650d
            java.lang.String r8 = eb0.C75592q0.m90789s()
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x01cc
            goto L_0x01f0
        L_0x01ee:
            r11 = 1
            goto L_0x01f1
        L_0x01f0:
            r11 = 0
        L_0x01f1:
            if (r11 == 0) goto L_0x0214
            java.lang.Class<com.tencent.mm.plugin.multitalk.model.h> r6 = com.tencent.p014mm.plugin.multitalk.model.C69856h.class
            di3.d r6 = di3.C86312j.m106911c(r6)
            com.tencent.mm.plugin.multitalk.model.h r6 = (com.tencent.p014mm.plugin.multitalk.model.C69856h) r6
            r6.mo96137T5(r12)
            java.lang.Class<wt.c> r6 = p744wt.C66190c.class
            di3.d r6 = di3.C86312j.m106911c(r6)
            wt.c r6 = (p744wt.C66190c) r6
            android.content.Context r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r6.ud0(r7)
            goto L_0x0214
        L_0x020e:
            r13 = r10
            r32 = r14
            r12 = r15
            r14 = 0
            r15 = 1
        L_0x0214:
            r6 = 10
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r14] = r12
            te3.es r7 = r3.f136414W0
            if (r7 != 0) goto L_0x0220
            r11 = 0
            goto L_0x0222
        L_0x0220:
            int r11 = r7.f133093d
        L_0x0222:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r11)
            r6[r15] = r7
            java.lang.String r7 = r3.f136415X
            r11 = 2
            r6[r11] = r7
            java.lang.String r7 = r3.f136396K
            r10 = 3
            r6[r10] = r7
            r7 = 4
            int r8 = r3.f136412V0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r6[r7] = r8
            r7 = 5
            int r8 = r3.f136410U0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r6[r7] = r8
            java.lang.String r7 = r3.f136408T0
            r9 = 6
            r6[r9] = r7
            r7 = 7
            int r8 = r3.f136406S0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r6[r7] = r8
            int r7 = r3.f136425d1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6[r16] = r7
            r7 = 9
            te3.es r8 = r3.f136414W0
            if (r8 != 0) goto L_0x0262
            r8 = -1
            goto L_0x0264
        L_0x0262:
            int r8 = r8.f133095f
        L_0x0264:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r6[r7] = r8
            java.lang.String r7 = "processModContact chatroom:%s count:%d ChatRoomData:%s owner:%s type:%d max:%d upgrader:%s chatroomVersion:%d chatroomInfoVersion:%s infomask:%d "
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r7, r6)
            te3.wq2 r6 = eb0.C45612m0.f123381a
            java.lang.Class<a11.c> r6 = a11.C39479c.class
            k40.a r6 = f40.C86709a0.m107533q(r6)
            a11.c r6 = (a11.C39479c) r6
            eb0.m2 r6 = r6.mo62084mr()
            com.tencent.mm.storage.n1 r6 = (com.tencent.p014mm.storage.C44662n1) r6
            com.tencent.mm.storage.m1 r6 = r6.mo69799Lo(r12)
            if (r6 == 0) goto L_0x02c9
            int r7 = r6.field_chatroomStatus
            int r8 = r3.f136429f1
            if (r7 == r8) goto L_0x02c9
            te3.rv3 r7 = r3.f136424d
            java.lang.String r7 = sf0.C48374j0.m53718g(r7)
            boolean r7 = r12.equals(r7)
            if (r7 == 0) goto L_0x02c9
            int r7 = r3.f136429f1
            long r7 = (long) r7
            r17 = 2
            long r7 = r7 & r17
            int r19 = (r7 > r17 ? 1 : (r7 == r17 ? 0 : -1))
            if (r19 != 0) goto L_0x02c9
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "updateChatroomStatus, cmdMC.ChatroomStatus = "
            r7.append(r8)
            int r8 = r3.f136429f1
            r7.append(r8)
            java.lang.String r8 = ", member.getChatroomStatus() = "
            r7.append(r8)
            int r6 = r6.field_chatroomStatus
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "MicroMsg.ChatroomMembersLogic"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r6)
            r17 = 1
            goto L_0x02cb
        L_0x02c9:
            r17 = 0
        L_0x02cb:
            te3.es r6 = r3.f136414W0
            java.lang.String r8 = "processModContact chatroom:%s, exception:%s %s"
            if (r6 == 0) goto L_0x03e7
            aj.a r7 = new aj.a
            r7.<init>()
            int r6 = r3.f136412V0
            r7.f106337f = r6
            int r6 = r3.f136410U0
            r7.f106339h = r6
            java.lang.String r6 = r3.f136408T0
            r7.f106340i = r6
            int r6 = r3.f136406S0
            r7.f106342n = r6
            te3.es r9 = r3.f136414W0
            int r9 = r9.f133095f
            if (r9 != 0) goto L_0x02ef
            r7.f106341j = r6
        L_0x02ef:
            com.tencent.mm.autogen.events.NetSceneGetChatroomMemberDetailEvent r9 = new com.tencent.mm.autogen.events.NetSceneGetChatroomMemberDetailEvent
            r9.<init>()
            com.tencent.mm.autogen.events.NetSceneGetChatroomMemberDetailEvent$a r6 = r9.f107649d
            r6.f107650a = r12
            int r10 = r7.f106341j
            r6.f107651b = r10
            java.lang.String r10 = r3.f136396K
            te3.es r6 = r3.f136414W0
            int r11 = r3.f136429f1
            r18 = -1
            int r14 = r3.f136425d1
            java.lang.String r19 = eb0.C75592q0.m90789s()
            r20 = r6
            r6 = r12
            r21 = r7
            r7 = r10
            r10 = r8
            r8 = r20
            r20 = r9
            r9 = r11
            r11 = r10
            r10 = r18
            r25 = r11
            r11 = r14
            r14 = r12
            r12 = r19
            r26 = r13
            r13 = r21
            r15 = r14
            r1 = 0
            r14 = r20
            eb0.C45612m0.m50682I(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.Class<wo.b> r6 = p740wo.C53193b.class
            di3.d r6 = di3.C86312j.m106911c(r6)     // Catch:{ Exception -> 0x03c7 }
            wo.b r6 = (p740wo.C53193b) r6     // Catch:{ Exception -> 0x03c7 }
            boolean r6 = r6.mo73723Hd(r15)     // Catch:{ Exception -> 0x03c7 }
            if (r6 == 0) goto L_0x0355
            k40.a r6 = f40.C86709a0.m107533q(r5)     // Catch:{ Exception -> 0x03c7 }
            f62.k0 r6 = (f62.C75700k0) r6     // Catch:{ Exception -> 0x03c7 }
            com.tencent.mm.storage.v3 r6 = r6.mo96094Ku()     // Catch:{ Exception -> 0x03c7 }
            com.tencent.mm.storage.i2 r6 = (com.tencent.p014mm.storage.C44660i2) r6     // Catch:{ Exception -> 0x03c7 }
            com.tencent.mm.storage.h2 r6 = r6.mo69771j(r15)     // Catch:{ Exception -> 0x03c7 }
            if (r6 == 0) goto L_0x0376
            di3.d r0 = di3.C86312j.m106911c(r0)     // Catch:{ Exception -> 0x03c7 }
            kr0.q0 r0 = (kr0.C34010q0) r0     // Catch:{ Exception -> 0x03c7 }
            r7 = 1
            r0.X10(r6, r1, r7)     // Catch:{ Exception -> 0x03c7 }
            goto L_0x0376
        L_0x0355:
            boolean r6 = r30.mo62938w3()     // Catch:{ Exception -> 0x03c7 }
            if (r6 == 0) goto L_0x0376
            k40.a r6 = f40.C86709a0.m107533q(r5)     // Catch:{ Exception -> 0x03c7 }
            f62.k0 r6 = (f62.C75700k0) r6     // Catch:{ Exception -> 0x03c7 }
            com.tencent.mm.storage.v3 r6 = r6.mo96094Ku()     // Catch:{ Exception -> 0x03c7 }
            com.tencent.mm.storage.i2 r6 = (com.tencent.p014mm.storage.C44660i2) r6     // Catch:{ Exception -> 0x03c7 }
            com.tencent.mm.storage.h2 r6 = r6.mo69771j(r15)     // Catch:{ Exception -> 0x03c7 }
            if (r6 == 0) goto L_0x0376
            di3.d r0 = di3.C86312j.m106911c(r0)     // Catch:{ Exception -> 0x03c7 }
            kr0.q0 r0 = (kr0.C34010q0) r0     // Catch:{ Exception -> 0x03c7 }
            r0.mo59402a7(r6)     // Catch:{ Exception -> 0x03c7 }
        L_0x0376:
            k40.a r0 = f40.C86709a0.m107533q(r5)     // Catch:{ Exception -> 0x03c7 }
            f62.k0 r0 = (f62.C75700k0) r0     // Catch:{ Exception -> 0x03c7 }
            com.tencent.mm.storage.v3 r0 = r0.mo96094Ku()     // Catch:{ Exception -> 0x03c7 }
            com.tencent.mm.storage.i2 r0 = (com.tencent.p014mm.storage.C44660i2) r0     // Catch:{ Exception -> 0x03c7 }
            boolean r0 = r0.mo69752X(r15)     // Catch:{ Exception -> 0x03c7 }
            boolean r6 = eb0.C45612m0.m50708y(r15)     // Catch:{ Exception -> 0x03c7 }
            java.lang.String r7 = "processModContact chatroom:%s isExistConversation:%s isNeedUpdateChatRoomInfo:%s"
            r8 = 3
            java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x03c3 }
            r9[r1] = r15     // Catch:{ Exception -> 0x03c3 }
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x03c3 }
            r11 = 1
            r9[r11] = r10     // Catch:{ Exception -> 0x03c3 }
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r6)     // Catch:{ Exception -> 0x03c3 }
            r11 = 2
            r9[r11] = r10     // Catch:{ Exception -> 0x03bf }
            r10 = r26
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r7, r9)     // Catch:{ Exception -> 0x03bd }
            if (r0 == 0) goto L_0x03ba
            if (r6 == 0) goto L_0x03ba
            com.tencent.mm.autogen.events.GetChatRoomInfoDetailEvent r0 = new com.tencent.mm.autogen.events.GetChatRoomInfoDetailEvent     // Catch:{ Exception -> 0x03bd }
            r0.<init>()     // Catch:{ Exception -> 0x03bd }
            com.tencent.mm.autogen.events.GetChatRoomInfoDetailEvent$a r6 = r0.f78814d     // Catch:{ Exception -> 0x03bd }
            r6.f78815a = r15     // Catch:{ Exception -> 0x03bd }
            r0.publish()     // Catch:{ Exception -> 0x03bd }
            int r0 = r3.f136412V0     // Catch:{ Exception -> 0x03bd }
            eb0.C45612m0.m50681H(r15, r0)     // Catch:{ Exception -> 0x03bd }
        L_0x03ba:
            r7 = r25
            goto L_0x03ec
        L_0x03bd:
            r0 = move-exception
            goto L_0x03cc
        L_0x03bf:
            r0 = move-exception
            r10 = r26
            goto L_0x03cc
        L_0x03c3:
            r0 = move-exception
            r10 = r26
            goto L_0x03cb
        L_0x03c7:
            r0 = move-exception
            r10 = r26
            r8 = 3
        L_0x03cb:
            r11 = 2
        L_0x03cc:
            java.lang.Object[] r6 = new java.lang.Object[r8]
            r6[r1] = r15
            java.lang.Class r7 = r0.getClass()
            java.lang.String r7 = r7.getSimpleName()
            r9 = 1
            r6[r9] = r7
            java.lang.String r0 = r0.getMessage()
            r6[r11] = r0
            r7 = r25
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r10, r7, r6)
            goto L_0x03ec
        L_0x03e7:
            r7 = r8
            r15 = r12
            r10 = r13
            r1 = 0
            r8 = 3
        L_0x03ec:
            if (r17 == 0) goto L_0x042c
            k40.a r0 = f40.C86709a0.m107533q(r5)     // Catch:{ Exception -> 0x040d }
            f62.k0 r0 = (f62.C75700k0) r0     // Catch:{ Exception -> 0x040d }
            com.tencent.mm.storage.v3 r0 = r0.mo96094Ku()     // Catch:{ Exception -> 0x040d }
            com.tencent.mm.storage.i2 r0 = (com.tencent.p014mm.storage.C44660i2) r0     // Catch:{ Exception -> 0x040d }
            boolean r0 = r0.mo69752X(r15)     // Catch:{ Exception -> 0x040d }
            if (r0 == 0) goto L_0x042c
            com.tencent.mm.autogen.events.NotifyChatRoomStatusChangeEvent r0 = new com.tencent.mm.autogen.events.NotifyChatRoomStatusChangeEvent     // Catch:{ Exception -> 0x040d }
            r0.<init>()     // Catch:{ Exception -> 0x040d }
            com.tencent.mm.autogen.events.NotifyChatRoomStatusChangeEvent$a r5 = r0.f193752d     // Catch:{ Exception -> 0x040d }
            r5.f193753a = r15     // Catch:{ Exception -> 0x040d }
            r0.publish()     // Catch:{ Exception -> 0x040d }
            goto L_0x042c
        L_0x040d:
            r0 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r8]
            r5[r1] = r15
            java.lang.Class r6 = r0.getClass()
            java.lang.String r6 = r6.getSimpleName()
            r9 = 1
            r5[r9] = r6
            java.lang.String r0 = r0.getMessage()
            r5[r11] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r10, r7, r5)
            goto L_0x042c
        L_0x0427:
            r32 = r14
            r1 = 0
            r8 = 3
            r11 = 2
        L_0x042c:
            int r0 = r29.getType()
            r0 = r0 & 2048(0x800, float:2.87E-42)
            java.lang.String r5 = "officialaccounts"
            if (r0 == 0) goto L_0x04f9
            int r0 = r30.getType()
            r0 = r0 & 2048(0x800, float:2.87E-42)
            int r6 = r29.getType()
            r6 = r6 & 2048(0x800, float:2.87E-42)
            if (r0 == r6) goto L_0x0524
            java.lang.String r0 = r29.getUsername()
            boolean r0 = rb0.C47984k.m53335i(r0)
            if (r0 == 0) goto L_0x0463
            di3.d r0 = di3.C86312j.m106911c(r4)
            rn.v r0 = (p227rn.C48053v) r0
            java.lang.String r6 = r29.getUsername()
            boolean r0 = r0.mo72614OE(r6)
            if (r0 != 0) goto L_0x0463
            m91048b(r29)
            goto L_0x0524
        L_0x0463:
            boolean r0 = r29.mo62916m3()
            if (r0 == 0) goto L_0x0524
            java.lang.String r0 = r29.getUsername()
            boolean r0 = rb0.C47984k.m53341o(r0)
            if (r0 == 0) goto L_0x0524
            boolean r0 = r29.mo62916m3()
            if (r0 == 0) goto L_0x0524
            java.lang.String r0 = r29.getUsername()
            boolean r0 = rb0.C47984k.m53341o(r0)
            if (r0 == 0) goto L_0x0524
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "dealPlaceSubscribeBizToTop uct : "
            r0.append(r6)
            java.lang.String r6 = r29.getUsername()
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v3 r0 = r0.mo105908w()
            java.lang.String r6 = r29.getUsername()
            com.tencent.mm.storage.i2 r0 = (com.tencent.p014mm.storage.C44660i2) r0
            com.tencent.mm.storage.h2 r0 = r0.mo69771j(r6)
            rb0.j r6 = rb0.C48009v0.Fx0()
            java.lang.String r7 = r29.getUsername()
            r6.mo72757SE(r7)
            if (r0 != 0) goto L_0x0524
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v3 r0 = r0.mo105908w()
            com.tencent.mm.storage.i2 r0 = (com.tencent.p014mm.storage.C44660i2) r0
            com.tencent.mm.storage.h2 r0 = r0.mo69771j(r5)
            if (r0 != 0) goto L_0x04df
            com.tencent.mm.storage.h2 r0 = new com.tencent.mm.storage.h2
            r0.<init>(r5)
            r0.mo101162m3()
            eb0.c r6 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v3 r6 = r6.mo105908w()
            com.tencent.mm.storage.i2 r6 = (com.tencent.p014mm.storage.C44660i2) r6
            r6.mo69751W(r0)
        L_0x04df:
            com.tencent.mm.storage.h2 r0 = new com.tencent.mm.storage.h2
            java.lang.String r6 = r29.getUsername()
            r0.<init>(r6)
            r0.mo108807c3(r5)
            eb0.c r6 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v3 r6 = r6.mo105908w()
            com.tencent.mm.storage.i2 r6 = (com.tencent.p014mm.storage.C44660i2) r6
            r6.mo69751W(r0)
            goto L_0x0524
        L_0x04f9:
            int r0 = r30.getType()
            r0 = r0 & 2048(0x800, float:2.87E-42)
            int r6 = r29.getType()
            r6 = r6 & 2048(0x800, float:2.87E-42)
            if (r0 == r6) goto L_0x0524
            java.lang.String r0 = r29.getUsername()
            boolean r0 = rb0.C47984k.m53335i(r0)
            if (r0 == 0) goto L_0x0524
            di3.d r0 = di3.C86312j.m106911c(r4)
            rn.v r0 = (p227rn.C48053v) r0
            java.lang.String r6 = r29.getUsername()
            boolean r0 = r0.mo72614OE(r6)
            if (r0 != 0) goto L_0x0524
            m91048b(r29)
        L_0x0524:
            boolean r0 = r30.mo62927s3()
            if (r0 != 0) goto L_0x0532
            boolean r0 = r29.mo62927s3()
            if (r0 == 0) goto L_0x0532
            r0 = 1
            goto L_0x0533
        L_0x0532:
            r0 = 0
        L_0x0533:
            boolean r6 = r29.mo62927s3()
            if (r6 == 0) goto L_0x0584
            eb0.c r6 = eb0.C97625j3.m125812b()
            g62.s r6 = r6.mo105880F()
            com.tencent.mm.storage.a5 r6 = (com.tencent.p014mm.storage.C44651a5) r6
            com.tencent.mm.storage.z4 r6 = r6.mo69630Lo(r15)
            if (r6 == 0) goto L_0x0551
            java.lang.String r7 = r6.field_encryptUsername
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r7 == 0) goto L_0x0568
        L_0x0551:
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r32)
            if (r7 != 0) goto L_0x0568
            eb0.c r6 = eb0.C97625j3.m125812b()
            g62.s r6 = r6.mo105880F()
            com.tencent.mm.storage.a5 r6 = (com.tencent.p014mm.storage.C44651a5) r6
            r7 = r32
            com.tencent.mm.storage.z4 r6 = r6.mo69630Lo(r7)
            goto L_0x056a
        L_0x0568:
            r7 = r32
        L_0x056a:
            if (r6 == 0) goto L_0x0586
            java.lang.String r9 = r6.field_encryptUsername
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r9 != 0) goto L_0x0586
            eb0.c r9 = eb0.C97625j3.m125812b()
            g62.s r9 = r9.mo105880F()
            java.lang.String r6 = r6.field_encryptUsername
            com.tencent.mm.storage.a5 r9 = (com.tencent.p014mm.storage.C44651a5) r9
            r9.mo69631jo(r6)
            goto L_0x0586
        L_0x0584:
            r7 = r32
        L_0x0586:
            boolean r6 = r29.mo62927s3()
            if (r6 == 0) goto L_0x05ed
            java.lang.String r6 = r3.f136438k1
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 != 0) goto L_0x05ed
            eb0.c r6 = eb0.C97625j3.m125812b()
            g62.i r6 = r6.mo105910y()
            te3.rv3 r9 = r3.f136424d
            java.lang.String r9 = r9.f141175d
            com.tencent.mm.storage.q3 r6 = (com.tencent.p014mm.storage.C30771q3) r6
            com.tencent.mm.storage.p3 r6 = r6.mo57694jo(r9)
            if (r6 == 0) goto L_0x05ed
            java.lang.String r9 = r6.field_encryptUsername
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r9 != 0) goto L_0x05ed
            java.lang.String r9 = r3.f136438k1
            r6.field_username = r9
            long r12 = java.lang.System.currentTimeMillis()
            r6.field_modifyTime = r12
            eb0.c r9 = eb0.C97625j3.m125812b()
            g62.i r9 = r9.mo105910y()
            com.tencent.mm.storage.q3 r9 = (com.tencent.p014mm.storage.C30771q3) r9
            boolean r9 = r9.replace(r6)
            if (r9 != 0) goto L_0x05dc
            java.lang.Object[] r9 = new java.lang.Object[r11]
            java.lang.String r6 = r6.field_encryptUsername
            r9[r1] = r6
            java.lang.String r6 = r3.f136438k1
            r12 = 1
            r9[r12] = r6
            java.lang.String r6 = "update stranger fail, encryptUsername:%s, friendUsernname:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r10, r6, r9)
            goto L_0x05ed
        L_0x05dc:
            r12 = 1
            java.lang.Object[] r9 = new java.lang.Object[r11]
            java.lang.String r6 = r6.field_encryptUsername
            r9[r1] = r6
            java.lang.String r6 = r3.f136438k1
            r9[r12] = r6
            java.lang.String r6 = "update stranger ok, encryptUsername:%s, friendUsernname:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r6, r9)
        L_0x05ed:
            java.lang.String r6 = r29.getUsername()
            boolean r6 = rb0.C47984k.m53338l(r6)
            r9 = 0
            if (r6 == 0) goto L_0x068e
            rb0.i r6 = rb0.C48009v0.Ex0()
            java.lang.String r12 = r29.getUsername()
            r6.mo72745SE(r12, r9)
            if (r0 == 0) goto L_0x068e
            java.lang.String r6 = r29.getUsername()
            boolean r6 = rb0.C47984k.m53335i(r6)
            if (r6 == 0) goto L_0x068e
            di3.d r4 = di3.C86312j.m106911c(r4)
            rn.v r4 = (p227rn.C48053v) r4
            java.lang.String r6 = r29.getUsername()
            boolean r4 = r4.mo72614OE(r6)
            if (r4 == 0) goto L_0x062b
            sb0.h r4 = rb0.C48009v0.yx0()
            java.lang.String r6 = r29.getUsername()
            r4.mo73062h(r6, r9)
            goto L_0x068e
        L_0x062b:
            java.lang.String r4 = r29.getUsername()
            boolean r4 = rb0.C47984k.m53336j(r4)
            if (r4 == 0) goto L_0x068e
            eb0.c r4 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v3 r4 = r4.mo105908w()
            java.lang.String r6 = r29.getUsername()
            com.tencent.mm.storage.i2 r4 = (com.tencent.p014mm.storage.C44660i2) r4
            com.tencent.mm.storage.h2 r4 = r4.mo69771j(r6)
            if (r4 == 0) goto L_0x064a
            goto L_0x068e
        L_0x064a:
            rb0.j r4 = rb0.C48009v0.Fx0()
            java.lang.String r6 = r29.getUsername()
            ug.c r4 = r4.mo72757SE(r6)
            com.tencent.mm.storage.h2 r6 = new com.tencent.mm.storage.h2
            java.lang.String r12 = r29.getUsername()
            r6.<init>(r12)
            java.lang.Object[] r12 = new java.lang.Object[r11]
            java.lang.String r13 = r4.mo73498p2()
            r12[r1] = r13
            java.lang.String r13 = r29.getUsername()
            r14 = 1
            r12[r14] = r13
            java.lang.String r13 = "Enterprise belong %s, userName: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r13, r12)
            java.lang.String r4 = r4.mo73498p2()
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r4)
            r6.mo108807c3(r4)
            r6.mo101162m3()
            eb0.c r4 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v3 r4 = r4.mo105908w()
            com.tencent.mm.storage.i2 r4 = (com.tencent.p014mm.storage.C44660i2) r4
            r4.mo69751W(r6)
        L_0x068e:
            int r4 = r29.getType()
            r4 = r4 & 8
            if (r4 == 0) goto L_0x06bd
            int r4 = r30.getType()
            r4 = r4 & 8
            int r6 = r29.getType()
            r6 = r6 & 8
            if (r4 == r6) goto L_0x06e3
            eb0.c r4 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v3 r4 = r4.mo105908w()
            r6 = 1
            java.lang.String[] r12 = new java.lang.String[r6]
            java.lang.String r6 = r29.getUsername()
            r12[r1] = r6
            com.tencent.mm.storage.i2 r4 = (com.tencent.p014mm.storage.C44660i2) r4
            java.lang.String r6 = "@blacklist"
            r4.mo69762e0(r12, r6)
            goto L_0x06e3
        L_0x06bd:
            int r4 = r30.getType()
            r4 = r4 & 8
            int r6 = r29.getType()
            r6 = r6 & 8
            if (r4 == r6) goto L_0x06e3
            eb0.c r4 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v3 r4 = r4.mo105908w()
            r6 = 1
            java.lang.String[] r12 = new java.lang.String[r6]
            java.lang.String r6 = r29.getUsername()
            r12[r1] = r6
            com.tencent.mm.storage.i2 r4 = (com.tencent.p014mm.storage.C44660i2) r4
            java.lang.String r6 = ""
            r4.mo69762e0(r12, r6)
        L_0x06e3:
            if (r33 != 0) goto L_0x08e0
            boolean r4 = r29.mo62916m3()
            if (r4 == 0) goto L_0x0748
            boolean r4 = r29.mo62927s3()
            if (r4 == 0) goto L_0x0748
            long r12 = java.lang.System.currentTimeMillis()
            eb0.c r4 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v3 r4 = r4.mo105908w()
            java.lang.String r6 = r29.getUsername()
            com.tencent.mm.storage.i2 r4 = (com.tencent.p014mm.storage.C44660i2) r4
            com.tencent.mm.storage.h2 r4 = r4.mo69771j(r6)
            if (r4 != 0) goto L_0x070a
            goto L_0x0748
        L_0x070a:
            r6 = 4194304(0x400000, float:5.877472E-39)
            boolean r14 = r4.mo108372k3(r6)
            if (r14 == 0) goto L_0x0748
            eb0.c r14 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v3 r14 = r14.mo105908w()
            java.lang.String r9 = r29.getUsername()
            int r4 = r4.mo108819m2()
            com.tencent.mm.storage.i2 r14 = (com.tencent.p014mm.storage.C44660i2) r14
            boolean r4 = r14.mo69776n0(r9, r6, r1, r4)
            java.lang.Object[] r6 = new java.lang.Object[r8]
            java.lang.String r9 = r29.getUsername()
            r6[r1] = r9
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r9 = 1
            r6[r9] = r4
            long r16 = java.lang.System.currentTimeMillis()
            long r16 = r16 - r12
            java.lang.Long r4 = java.lang.Long.valueOf(r16)
            r6[r11] = r4
            java.lang.String r4 = "Reset temp session attr flag.(talker %s, updateSucc %s, cost %s)"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r4, r6)
        L_0x0748:
            long r12 = r2.f108320R1
            int r4 = (int) r12
            if (r4 <= 0) goto L_0x08db
            int r4 = r2.f149509Q0
            if (r4 == 0) goto L_0x08db
            int r2 = r2.f149511R0
            if (r2 != 0) goto L_0x08db
            r1 = r29
            r2 = 0
            int r4 = r1.f149511R0
            r6 = 1
            if (r4 != r6) goto L_0x08de
            java.lang.Object[] r4 = new java.lang.Object[r6]
            java.lang.String r6 = r29.getUsername()
            r4[r2] = r6
            java.lang.String r6 = "hakon removeParentRefAndUnread user = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r6, r4)
            eb0.c r4 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v3 r4 = r4.mo105908w()
            java.lang.String r6 = r29.getUsername()
            com.tencent.mm.storage.i2 r4 = (com.tencent.p014mm.storage.C44660i2) r4
            r4.getClass()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r12 = "Update "
            r9.append(r12)
            java.lang.String r12 = "rconversation"
            r9.append(r12)
            java.lang.String r13 = " set "
            r9.append(r13)
            java.lang.String r13 = "parentRef"
            r9.append(r13)
            java.lang.String r13 = " = '', "
            r9.append(r13)
            java.lang.String r13 = "unReadCount = 0"
            r9.append(r13)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = " where username = \""
            r13.append(r14)
            java.lang.String r14 = com.tencent.p014mm.sdk.platformtools.Util.escapeSqlValue(r6)
            r13.append(r14)
            java.lang.String r14 = "\""
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            r9.append(r13)
            java.lang.String r9 = r9.toString()
            r13 = 1
            java.lang.Object[] r14 = new java.lang.Object[r13]
            r14[r2] = r9
            java.lang.String r13 = "MicroMsg.ConversationStorage"
            java.lang.String r11 = "removeParentRefAndUnread sql: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r13, r11, r14)
            com.tencent.mm.sdk.storage.ISQLiteDatabase r11 = r4.f121077c
            boolean r9 = r11.execSQL(r12, r9)
            if (r9 == 0) goto L_0x07da
            r4.doNotify(r8, r4, r6)
        L_0x07da:
            eb0.c r4 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v3 r4 = r4.mo105908w()
            com.tencent.mm.storage.i2 r4 = (com.tencent.p014mm.storage.C44660i2) r4
            com.tencent.mm.storage.h2 r4 = r4.mo69771j(r5)
            if (r4 == 0) goto L_0x08de
            eb0.c r6 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v3 r6 = r6.mo105908w()
            com.tencent.mm.storage.i2 r6 = (com.tencent.p014mm.storage.C44660i2) r6
            r6.getClass()
            r9 = 1
            java.lang.Object[] r11 = new java.lang.Object[r9]
            java.lang.String r9 = "SELECT SUM(rconversation.unReadCount) FROM rconversation WHERE parentRef = 'officialaccounts'"
            r11[r2] = r9
            java.lang.String r12 = "getTotalUnreadBizCount sql %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r13, r12, r11)
            com.tencent.mm.sdk.storage.ISQLiteDatabase r6 = r6.f121077c
            r11 = 0
            r12 = 2
            android.database.Cursor r6 = r6.rawQuery(r9, r11, r12)
            if (r6 == 0) goto L_0x081d
            boolean r9 = r6.moveToFirst()
            if (r9 == 0) goto L_0x0818
            int r9 = r6.getInt(r2)
            goto L_0x0819
        L_0x0818:
            r9 = 0
        L_0x0819:
            r6.close()
            goto L_0x081e
        L_0x081d:
            r9 = 0
        L_0x081e:
            r4.mo108812g3(r9)
            r6 = 1
            java.lang.Object[] r9 = new java.lang.Object[r6]
            int r6 = r4.mo108786G2()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r9[r2] = r6
            java.lang.String r6 = "unread count is %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r6, r9)
            eb0.c r6 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v3 r6 = r6.mo105908w()
            com.tencent.mm.storage.i2 r6 = (com.tencent.p014mm.storage.C44660i2) r6
            java.lang.String r6 = r6.mo69743N(r5)
            eb0.c r9 = eb0.C97625j3.m125812b()
            g62.l r9 = r9.mo105911z()
            com.tencent.mm.storage.g4 r9 = (com.tencent.p014mm.storage.C72972g4) r9
            com.tencent.mm.storage.f4 r6 = r9.Ex0(r6)
            if (r6 == 0) goto L_0x08c6
            long r12 = r6.getMsgId()
            r16 = 0
            int r9 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r9 <= 0) goto L_0x08c6
            r4.mo101164o3(r6)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r12 = r6.mo108768t()
            r9.append(r12)
            java.lang.String r12 = ":"
            r9.append(r12)
            java.lang.String r12 = r6.getContent()
            r9.append(r12)
            java.lang.String r9 = r9.toString()
            r4.mo108792M2(r9)
            int r9 = r6.getType()
            java.lang.String r9 = java.lang.Integer.toString(r9)
            r4.mo108806b3(r9)
            eb0.c r9 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v3 r9 = r9.mo105908w()
            com.tencent.mm.storage.i2 r9 = (com.tencent.p014mm.storage.C44660i2) r9
            com.tencent.mm.storage.v3$b r9 = r9.mo69741L()
            if (r9 == 0) goto L_0x08c9
            com.tencent.mm.pointers.PString r9 = new com.tencent.mm.pointers.PString
            r9.<init>()
            com.tencent.mm.pointers.PString r12 = new com.tencent.mm.pointers.PString
            r12.<init>()
            com.tencent.mm.pointers.PInt r13 = new com.tencent.mm.pointers.PInt
            r13.<init>()
            r6.mo108749c3(r5)
            java.lang.String r5 = r4.getContent()
            r6.mo108732L2(r5)
            r5 = 1
            p875ci.C67379u.m79740d(r6, r9, r12, r13, r5)
            java.lang.String r5 = r9.value
            r4.mo108794O2(r5)
            java.lang.String r5 = r12.value
            r4.mo108795P2(r5)
            int r5 = r13.value
            r4.mo108801W2(r5)
            goto L_0x08c9
        L_0x08c6:
            r4.mo101162m3()
        L_0x08c9:
            eb0.c r5 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v3 r5 = r5.mo105908w()
            java.lang.String r6 = r4.getUsername()
            com.tencent.mm.storage.i2 r5 = (com.tencent.p014mm.storage.C44660i2) r5
            r5.mo69773k0(r4, r6)
            goto L_0x08e4
        L_0x08db:
            r1 = r29
            r2 = 0
        L_0x08de:
            r11 = 0
            goto L_0x08e4
        L_0x08e0:
            r1 = r29
            r11 = r9
            r2 = 0
        L_0x08e4:
            if (r0 == 0) goto L_0x0962
            com.tencent.mm.autogen.events.ModNewContactEvent r4 = new com.tencent.mm.autogen.events.ModNewContactEvent
            r4.<init>()
            com.tencent.mm.autogen.events.ModNewContactEvent$a r5 = r4.f193738d
            java.lang.String r6 = r29.getUsername()
            r5.f193739a = r6
            com.tencent.mm.autogen.events.ModNewContactEvent$a r5 = r4.f193738d
            java.lang.String r6 = r1.f149505M
            r5.f193740b = r6
            r4.publish()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r5 = 0
        L_0x0902:
            if (r5 >= r8) goto L_0x0918
            xc0.g r6 = xc0.C78795g.m95196e()
            java.lang.String r6 = r6.mo108706c(r15, r5)
            boolean r9 = com.tencent.p014mm.vfs.C86013q1.m106450k(r6)
            if (r9 == 0) goto L_0x0915
            r4.add(r6)
        L_0x0915:
            int r5 = r5 + 1
            goto L_0x0902
        L_0x0918:
            int r5 = r4.size()
            if (r5 != 0) goto L_0x0935
            r5 = 0
        L_0x091f:
            if (r5 >= r8) goto L_0x0935
            xc0.g r6 = xc0.C78795g.m95196e()
            java.lang.String r6 = r6.mo108706c(r7, r5)
            boolean r9 = com.tencent.p014mm.vfs.C86013q1.m106450k(r6)
            if (r9 == 0) goto L_0x0932
            r4.add(r6)
        L_0x0932:
            int r5 = r5 + 1
            goto L_0x091f
        L_0x0935:
            com.tencent.mm.autogen.events.GetNewContactEvent r5 = new com.tencent.mm.autogen.events.GetNewContactEvent
            r5.<init>()
            com.tencent.mm.autogen.events.GetNewContactEvent$a r6 = r5.f193654d
            java.lang.String r7 = r29.getUsername()
            r6.f193655a = r7
            com.tencent.mm.autogen.events.GetNewContactEvent$a r6 = r5.f193654d
            java.lang.String r7 = com.tencent.p014mm.contact.C1234b.m1358a(r4)
            r6.f193656b = r7
            r5.publish()
            r5 = 2
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.String r5 = r29.getUsername()
            r6[r2] = r5
            java.lang.String r4 = com.tencent.p014mm.contact.C1234b.m1358a(r4)
            r5 = 1
            r6[r5] = r4
            java.lang.String r4 = "GetNewContactEvent, userName:%s,remarkImagePath:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r4, r6)
        L_0x0962:
            r4 = 18
            if (r0 == 0) goto L_0x098a
            int r5 = r3.f136392G
            if (r5 != r4) goto L_0x098a
            com.tencent.mm.autogen.events.LbsSayHiEvent r5 = new com.tencent.mm.autogen.events.LbsSayHiEvent
            r5.<init>()
            com.tencent.mm.autogen.events.LbsSayHiEvent$a r6 = r5.f193718d
            java.lang.String r7 = r29.mo73978v2()
            r6.f193719a = r7
            com.tencent.mm.autogen.events.LbsSayHiEvent$a r6 = r5.f193718d
            r7 = 2
            r6.f193720b = r7
            com.tencent.mm.storage.c4 r6 = fd0.C75743h.xx0()
            com.tencent.mm.autogen.events.LbsSayHiEvent$a r7 = r5.f193718d
            java.lang.String r7 = r7.f193719a
            r6.mo100931Lo(r7)
            r5.publish()
        L_0x098a:
            if (r0 == 0) goto L_0x0b49
            int r3 = r3.f136392G
            java.lang.String r5 = r29.getUsername()
            r6 = 26
            if (r3 == r6) goto L_0x09ed
            r6 = 27
            if (r3 == r6) goto L_0x09ed
            r6 = 28
            if (r3 == r6) goto L_0x09ed
            r6 = 29
            if (r3 != r6) goto L_0x09a3
            goto L_0x09ed
        L_0x09a3:
            if (r3 != r4) goto L_0x09be
            java.lang.String r3 = "initAddContent, scene is lbs"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r10, r3)
            com.tencent.mm.storage.c4 r3 = fd0.C75743h.xx0()
            com.tencent.mm.storage.b4[] r3 = r3.mo100934Yt(r5, r8)
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            ae3.b[] r4 = ae3.C67030b.m79193h(r4, r3)
            r9 = r11
            r11 = r3
            r3 = r9
            goto L_0x0a04
        L_0x09be:
            java.lang.String r3 = r29.mo73978v2()
            com.tencent.mm.storage.n3 r4 = fd0.C75743h.wx0()
            com.tencent.mm.storage.m3[] r4 = r4.mo101189Yt(r5, r3, r8)
            if (r4 == 0) goto L_0x09de
            r6 = 2
            java.lang.Object[] r7 = new java.lang.Object[r6]
            r7[r2] = r3
            int r3 = r4.length
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6 = 1
            r7[r6] = r3
            java.lang.String r3 = "filterSendRequestFileterMessage , encryptUsername = %s, fmsgList.length = %s."
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r3, r7)
        L_0x09de:
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            ae3.b[] r3 = ae3.C67030b.m79191f(r3, r4)
            r9 = r11
            r27 = r4
            r4 = r3
            r3 = r27
            goto L_0x0a04
        L_0x09ed:
            java.lang.String r3 = "initAddContent, scene is shake"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r10, r3)
            com.tencent.mm.storage.v4 r3 = fd0.C75743h.yx0()
            com.tencent.mm.storage.u4[] r3 = r3.mo101223Yt(r5, r8)
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            ae3.b[] r4 = ae3.C67030b.m79192g(r4, r3)
            r9 = r3
            r3 = r11
        L_0x0a04:
            if (r4 != 0) goto L_0x0a08
            goto L_0x0b49
        L_0x0a08:
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]
            int r6 = r4.length
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7[r2] = r6
            java.lang.String r6 = "providerList.size = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r6, r7)
            int r6 = r4.length
            r7 = 0
            r12 = 0
        L_0x0a1b:
            if (r7 >= r6) goto L_0x0ae5
            r15 = r4[r7]
            com.tencent.mm.storage.f4 r13 = new com.tencent.mm.storage.f4
            r13.<init>()
            java.lang.String r14 = r15.f192525b
            r13.mo108732L2(r14)
            java.lang.Object[] r14 = new java.lang.Object[r8]
            java.lang.String r8 = r15.f192525b
            r14[r2] = r8
            java.lang.String r8 = r15.f192524a
            r2 = 1
            r14[r2] = r8
            r8 = 2
            r14[r8] = r5
            java.lang.String r8 = "provider.digest = %s, provider.username = %s, username = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r8, r14)
            java.lang.String r8 = r15.f192524a
            int r8 = eb0.C45628s0.m50810y(r8)
            if (r3 == 0) goto L_0x0a62
            int r14 = r3.length
            int r14 = r14 - r12
            int r14 = r14 - r2
            r14 = r3[r14]
            r32 = r0
            long r0 = r14.field_createTime
            java.lang.Object[] r14 = new java.lang.Object[r2]
            java.lang.Long r16 = java.lang.Long.valueOf(r0)
            r17 = 0
            r14[r17] = r16
            java.lang.String r2 = "provider.time = %s "
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r2, r14)
            r13.mo108733M2(r0)
            goto L_0x0a87
        L_0x0a62:
            r32 = r0
            if (r11 == 0) goto L_0x0a76
            int r0 = r11.length
            int r0 = r0 - r12
            r1 = 1
            int r0 = r0 - r1
            r0 = r11[r0]
            long r1 = r0.field_createtime
            r16 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 * r16
            r13.mo108733M2(r1)
            goto L_0x0a87
        L_0x0a76:
            r16 = 1000(0x3e8, double:4.94E-321)
            if (r9 == 0) goto L_0x0a87
            int r0 = r9.length
            int r0 = r0 - r12
            r1 = 1
            int r0 = r0 - r1
            r0 = r9[r0]
            long r0 = r0.field_createtime
            long r0 = r0 * r16
            r13.mo108733M2(r0)
        L_0x0a87:
            int r12 = r12 + 1
            if (r3 == 0) goto L_0x0a8f
            r13.mo108749c3(r5)
            goto L_0x0a94
        L_0x0a8f:
            java.lang.String r0 = r15.f192524a
            r13.mo108749c3(r0)
        L_0x0a94:
            r13.setType(r8)
            boolean r0 = r15.f192529f
            if (r0 == 0) goto L_0x0aa5
            r1 = 2
            r13.mo100991d(r1)
            r1 = 1
            r13.mo108740T2(r1)
            r1 = 6
            goto L_0x0aad
        L_0x0aa5:
            r1 = 6
            r13.mo100991d(r1)
            r2 = 0
            r13.mo108740T2(r2)
        L_0x0aad:
            eb0.c r0 = eb0.C97625j3.m125812b()
            g62.l r0 = r0.mo105911z()
            com.tencent.mm.storage.g4 r0 = (com.tencent.p014mm.storage.C72972g4) r0
            long r13 = r0.my0(r13)
            r15 = -1
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x0ac3
            r0 = 1
            goto L_0x0ac4
        L_0x0ac3:
            r0 = 0
        L_0x0ac4:
            junit.framework.Assert.assertTrue(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "new msg inserted to db , local id = "
            r0.append(r2)
            r0.append(r13)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            int r7 = r7 + 1
            r1 = r29
            r0 = r32
            r2 = 0
            r8 = 3
            goto L_0x0a1b
        L_0x0ae5:
            r32 = r0
            r1 = 6
            com.tencent.mm.storage.f4 r0 = new com.tencent.mm.storage.f4
            r0.<init>()
            r6 = 1
            if (r3 == 0) goto L_0x0afb
            r2 = 0
            r3 = r3[r2]
            long r3 = r3.field_createTime
            long r3 = r3 + r6
            r0.mo108733M2(r3)
            goto L_0x0b19
        L_0x0afb:
            r2 = 0
            if (r11 == 0) goto L_0x0b0b
            r3 = r11[r2]
            long r3 = r3.field_createtime
            r11 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r11
            long r3 = r3 + r6
            r0.mo108733M2(r3)
            goto L_0x0b19
        L_0x0b0b:
            r11 = 1000(0x3e8, double:4.94E-321)
            if (r9 == 0) goto L_0x0b19
            r3 = r9[r2]
            long r2 = r3.field_createtime
            long r2 = r2 * r11
            long r2 = r2 + r6
            r0.mo108733M2(r2)
        L_0x0b19:
            java.lang.String r2 = "add say hi text happen frist"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r2)
            r0.mo108749c3(r5)
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r3 = 2131838145(0x7f1144c1, float:1.9309505E38)
            java.lang.String r2 = r2.getString(r3)
            r0.mo108732L2(r2)
            r2 = 10000(0x2710, float:1.4013E-41)
            r0.setType(r2)
            r0.mo100991d(r1)
            r1 = 0
            r0.mo108740T2(r1)
            eb0.c r1 = eb0.C97625j3.m125812b()
            g62.l r1 = r1.mo105911z()
            com.tencent.mm.storage.g4 r1 = (com.tencent.p014mm.storage.C72972g4) r1
            r1.my0(r0)
            goto L_0x0b4b
        L_0x0b49:
            r32 = r0
        L_0x0b4b:
            r1 = 3
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r32)
            r2 = 0
            r0[r2] = r1
            boolean r1 = r29.mo62946z3()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r33)
            r2 = 2
            r0[r2] = r1
            java.lang.String r1 = "isNewContact:%b, isSnsNoInteresting:%b, isInit:%b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r1, r0)
            if (r33 != 0) goto L_0x0ba7
            if (r32 == 0) goto L_0x0ba7
            boolean r0 = r29.mo62946z3()
            if (r0 == 0) goto L_0x0ba7
            java.lang.String r0 = r29.getUsername()
            jr2.t r1 = jr2.C99019x.m128974f()
            os2.m0 r1 = (os2.C11766m0) r1
            r2 = 5
            boolean r0 = r1.mo11654bD(r0, r2)
            if (r0 != 0) goto L_0x0ba7
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            java.lang.String r1 = r29.getUsername()
            r0.add(r1)
            com.tencent.mm.autogen.events.PostSnsTagMemberOptionEvent r1 = new com.tencent.mm.autogen.events.PostSnsTagMemberOptionEvent
            r1.<init>()
            com.tencent.mm.autogen.events.PostSnsTagMemberOptionEvent$a r4 = r1.f107691d
            r4.f107696e = r0
            r5 = 1
            r4.f107692a = r5
            r4.f107693b = r2
            r4.f107695d = r5
            r1.publish()
        L_0x0ba7:
            b22.b r0 = wc3.C78535a0.m94862a()
            a22.a r0 = (a22.C67001a) r0
            r0.mo90965c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fw0.C75804d.mo54198W4(com.tencent.mm.storage.z1, com.tencent.mm.storage.z1, te3.jy2, byte[], boolean):void");
    }

    /* renamed from: Z1 */
    public void mo54199Z1(C72996z1 z1Var, C72996z1 z1Var2, C50052jy2 jy22, byte[] bArr, boolean z) {
        String str;
        boolean z2;
        C76166a aVar;
        C49324es esVar;
        LinkedList<C50527nd3> linkedList;
        String str2;
        String[] strArr;
        C76166a a;
        String[] strArr2;
        C44673z4 Lo;
        LinkedList<C50527nd3> linkedList2;
        C72996z1 z1Var3 = z1Var;
        C72996z1 z1Var4 = z1Var2;
        C50052jy2 jy23 = jy22;
        String username = z1Var.getUsername();
        String v2 = z1Var.mo73978v2();
        if (z1Var4 != null && !Util.nullAsNil(z1Var4.f149515T0).equals(Util.nullAsNil(jy23.f136420Z0))) {
            Log.m105918d("MicroMsg.BigBallContactAssemblerImpl", "removeRemarkImageFile!!");
        }
        if (Util.isNullOrNil(bArr)) {
            m91047a(z1Var3, jy23, true);
        } else if (C72996z1.m85810M4(z1Var.mo73953E2())) {
            m91050d(jy23, username, z1Var3, true);
        }
        int i = 0;
        boolean z3 = z1Var4 != null && !z1Var2.mo62927s3() && z1Var.mo62927s3();
        if (z3 && C72996z1.m85796D5(username)) {
            C115669n.INSTANCE.mo175911u(931, 22);
        }
        Object[] objArr = new Object[3];
        objArr[0] = z1Var.getUsername();
        C50665od3 od32 = jy23.f136422b1;
        objArr[1] = od32 == null ? "" : Integer.valueOf(Util.nullAsNil(Integer.valueOf(od32.f139099e.size())));
        objArr[2] = Integer.valueOf(f222422d);
        Log.m105925i("MicroMsg.BigBallContactAssemblerImpl", "username:%s PhoneNumList size:%s mergePhoneSw:%s", objArr);
        if (f222422d == -1) {
            f222422d = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_android_mod_contact_merge_switch, 0);
        }
        if (f222422d == 1) {
            StringBuffer stringBuffer = new StringBuffer();
            C50665od3 od33 = jy23.f136422b1;
            if (!(od33 == null || (linkedList2 = od33.f139099e) == null)) {
                Iterator<C50527nd3> it = linkedList2.iterator();
                while (it.hasNext()) {
                    String str3 = it.next().f138544d;
                    if (str3 != null) {
                        stringBuffer.append(str3);
                        stringBuffer.append("，");
                    }
                }
            }
            Log.m105925i("MicroMsg.BigBallContactAssemblerImpl", "username:%s, phoneList %s", z1Var.getUsername(), stringBuffer.toString());
            if (z1Var4 != null) {
                str2 = z1Var4.f149525Y0;
                strArr = C1233a.m1357d(z1Var4, str2);
            } else {
                strArr = null;
                str2 = null;
            }
            if (!((str2 != null && !str2.equals("")) || (Lo = ((C44651a5) C97625j3.m125812b().mo105880F()).mo69630Lo(v2)) == null || (str2 = Lo.field_conPhone) == null)) {
                strArr = str2.split(",");
            }
            Log.m105925i("MicroMsg.BigBallContactAssemblerImpl", "username:%s, oldPhoneList %s", z1Var.getUsername(), Util.nullAsNil(str2));
            if (strArr != null && strArr.length > 0) {
                String stringBuffer2 = stringBuffer.toString();
                String[] split = stringBuffer2 != null ? stringBuffer2.split("，") : null;
                int length = strArr.length;
                int i2 = 0;
                boolean z4 = false;
                boolean z5 = false;
                while (i2 < length) {
                    String str4 = strArr[i2];
                    if (split == null || split.length <= 0) {
                        strArr2 = strArr;
                    } else {
                        int length2 = split.length;
                        while (true) {
                            strArr2 = strArr;
                            if (i < length2) {
                                if (Util.isEqual(str4, split[i])) {
                                    z5 = false;
                                    break;
                                }
                                i++;
                                strArr = strArr2;
                                z5 = true;
                            } else {
                                break;
                            }
                        }
                        if (z5 && m91049c(str4)) {
                            stringBuffer.append(str4);
                            stringBuffer.append("，");
                            z4 = true;
                        }
                    }
                    i2++;
                    strArr = strArr2;
                    i = 0;
                }
                if (z4) {
                    C49630gz2 gz22 = new C49630gz2();
                    gz22.f134369d = z1Var.getUsername();
                    C50665od3 od34 = new C50665od3();
                    String stringBuffer3 = stringBuffer.toString();
                    String[] split2 = stringBuffer3 != null ? stringBuffer3.split("，") : null;
                    if (split2 != null && split2.length > 0) {
                        od34.f139098d = split2.length;
                        od34.f139099e = new LinkedList<>();
                        for (String str5 : split2) {
                            C50527nd3 nd32 = new C50527nd3();
                            nd32.f138544d = str5;
                            od34.f139099e.add(nd32);
                        }
                        gz22.f134370e = od34;
                        ((C77885p) C97625j3.m125812b().mo105876B()).mo107993q(new C32330n(60, gz22));
                    }
                }
                if (z3 && 15 == jy23.f136392G && !Util.isNullOrNil(z1Var.getUsername()) && (a = C75398e.vx0().mo106401a(z1Var.getUsername())) != null) {
                    String stringBuffer4 = stringBuffer.toString();
                    String[] split3 = stringBuffer4 != null ? stringBuffer4.split("，") : null;
                    C115669n nVar = C115669n.INSTANCE;
                    Object[] objArr2 = new Object[4];
                    objArr2[0] = z1Var.getUsername();
                    objArr2[1] = 3;
                    objArr2[2] = Integer.valueOf(Util.isNullOrNil(a.mo106385e()) ^ true ? 1 : 0);
                    int i3 = 5;
                    if (split3 == null) {
                        i3 = 0;
                    } else if (split3.length < 5) {
                        i3 = split3.length;
                    }
                    objArr2[3] = Integer.valueOf(i3);
                    nVar.mo160131h(12040, objArr2);
                }
            }
            Log.m105925i("MicroMsg.BigBallContactAssemblerImpl", "username:%s, phoneList %s", z1Var.getUsername(), stringBuffer.toString());
            str = stringBuffer.toString();
        } else {
            StringBuffer stringBuffer5 = new StringBuffer();
            C50665od3 od35 = jy23.f136422b1;
            if (!(od35 == null || (linkedList = od35.f139099e) == null)) {
                Iterator<C50527nd3> it4 = linkedList.iterator();
                while (it4.hasNext()) {
                    String str6 = it4.next().f138544d;
                    if (str6 != null) {
                        stringBuffer5.append(str6);
                        stringBuffer5.append("，");
                    }
                }
            }
            Log.m105925i("MicroMsg.BigBallContactAssemblerImpl", "username:%s, phoneList %s", z1Var.getUsername(), stringBuffer5.toString());
            str = stringBuffer5.toString();
        }
        String nullAs = Util.nullAs(str, "");
        Log.m105924i("MicroMsg.BigBallContactAssemblerImpl", nullAs);
        z1Var3.mo62891a4(nullAs);
        if (!C72996z1.m85820U5(username) && (esVar = jy23.f136414W0) != null) {
            C51866wq2 wq22 = C45612m0.f123381a;
            if (Util.isNullOrNil(username)) {
                Log.m105920e("MicroMsg.ChatroomMembersLogic", "[updateChatroomInviteer] username is null!");
            } else if (C72996z1.m85820U5(username)) {
                Log.m105921e("MicroMsg.ChatroomMembersLogic", "[updateChatroomInviteer] username is not personal! :%s", username);
            } else {
                String g = C48374j0.m53718g(esVar.f133096g);
                if (!Util.isNullOrNil(g)) {
                    Log.m105925i("MicroMsg.ChatroomMembersLogic", "[updateChatroomInviteer] chatroomId:%s size:%s", g, Integer.valueOf(esVar.f133094e.size()));
                    C44661m1 Lo2 = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69799Lo(g);
                    if (Lo2 != null && esVar.f133094e.size() > 0 && Lo2.mo69790r2().contains(esVar.f133094e.get(0).f133650d)) {
                        String str7 = esVar.f133094e.get(0).f133650d;
                        C39608b n2 = Lo2.mo69786n2(str7);
                        if (n2 != null) {
                            Log.m105925i("MicroMsg.ChatroomMembersLogic", "oldMember contains:%s displayName:%s", str7, n2.f106344e);
                            n2.f106346g = esVar.f133094e.get(0).f133656j;
                            C45612m0.m50680G(Lo2);
                        } else {
                            Log.m105921e("MicroMsg.ChatroomMembersLogic", "talker:%s oldMemberData is null!", str7);
                        }
                    } else if (Lo2 == null || esVar.f133094e.size() <= 0) {
                        if (esVar.f133094e.size() <= 0) {
                            Log.m105920e("MicroMsg.ChatroomMembersLogic", "[updateChatroomInviteer] memberData.ChatRoomMember.size() <= 0");
                        }
                        if (Lo2 != null) {
                            Log.m105920e("MicroMsg.ChatroomMembersLogic", "[updateChatroomInviteer] oldMember is null!");
                        }
                    } else {
                        ChatroomMemberInviteerUpdatedEvent chatroomMemberInviteerUpdatedEvent = new ChatroomMemberInviteerUpdatedEvent();
                        chatroomMemberInviteerUpdatedEvent.f193513d.f193514a = esVar.f133094e.get(0).f133650d;
                        chatroomMemberInviteerUpdatedEvent.f193513d.f193515b = esVar.f133094e.get(0).f133656j;
                        C45612m0.f123382b.put(g + "#" + chatroomMemberInviteerUpdatedEvent.f193513d.f193514a, chatroomMemberInviteerUpdatedEvent.f193513d.f193515b);
                        chatroomMemberInviteerUpdatedEvent.publish();
                    }
                }
            }
        }
        C44673z4 Lo3 = ((C44651a5) C97625j3.m125812b().mo105880F()).mo69630Lo(z1Var.getUsername());
        if (!Util.isNullOrNil(z1Var.mo73969n2())) {
            Log.m105924i("MicroMsg.BigBallContactAssemblerImpl", "remark is set");
            if (Lo3 != null && !Util.isNullOrNil(z1Var3.f149513S0) && !z1Var3.f149513S0.equals(Lo3.field_conDescription)) {
                m91051e(z1Var3, Lo3);
            }
            z2 = false;
        } else {
            if (Lo3 == null || Util.isNullOrNil(Lo3.field_encryptUsername)) {
                Log.m105924i("MicroMsg.BigBallContactAssemblerImpl", "try get stranger again");
                if (!Util.isNullOrNil(v2)) {
                    Lo3 = ((C44651a5) C97625j3.m125812b().mo105880F()).mo69630Lo(v2);
                }
            }
            if (Lo3 == null || Util.isNullOrNil(Lo3.field_encryptUsername)) {
                z2 = false;
            } else {
                Log.m105924i("MicroMsg.BigBallContactAssemblerImpl", "mod stranger remark : " + Lo3.field_encryptUsername);
                z1Var3.mo62860K2(Lo3.field_conRemark);
                z1Var3.mo62862L2(C77691f.m93686a(Lo3.field_conRemark));
                z1Var3.mo62864M2(C77691f.m93687b(Lo3.field_conRemark));
                z2 = m91051e(z1Var3, Lo3);
            }
            int source = z1Var.getSource();
            if (source == 10 || source == 11 || source == 13) {
                if (!Util.isNullOrNil(jy23.f136465y0)) {
                    Log.m105925i("MicroMsg.BigBallContactAssemblerImpl", "MobileHash[%s],MobileFullHash[%s]", jy23.f136465y0, jy23.f136402Q0);
                    C76168b vx02 = C75398e.vx0();
                    String str8 = jy23.f136465y0;
                    String str9 = jy23.f136402Q0;
                    aVar = vx02.mo106402b(str8);
                    if (aVar == null) {
                        aVar = vx02.mo106402b(str9);
                    }
                } else {
                    aVar = !Util.isNullOrNil(v2) ? C75398e.vx0().mo106401a(v2) : null;
                }
                if (aVar == null) {
                    Log.m105924i("MicroMsg.BigBallContactAssemblerImpl", "dealWithRemark-> addr == null");
                } else {
                    Object[] objArr3 = new Object[3];
                    objArr3[0] = Util.nullAsNil(aVar.mo106388h());
                    objArr3[1] = Util.nullAsNil(aVar.mo106389i());
                    objArr3[2] = Boolean.valueOf((aVar.f223129q & 1) == 0);
                    Log.m105925i("MicroMsg.BigBallContactAssemblerImpl", "remarkName RealName[%s], User[%s], needSetRemark[%s]", objArr3);
                }
                if (aVar != null && !Util.isNullOrNil(aVar.mo106388h())) {
                    if ((aVar.f223129q & 1) == 0) {
                        Log.m105925i("MicroMsg.BigBallContactAssemblerImpl", "remarkName RealName[%s], User[%s], remarkChange[%s]", aVar.mo106388h(), aVar.mo106389i(), Boolean.valueOf(z2));
                        aVar.f223120h = z1Var.getUsername();
                        aVar.f223127o = 2;
                        aVar.f223129q |= 1;
                        if (!z2) {
                            z1Var3.mo62860K2(aVar.mo106388h());
                            z1Var3.mo62862L2(C77691f.m93686a(aVar.mo106388h()));
                            z1Var3.mo62864M2(C77691f.m93687b(aVar.mo106388h()));
                            z2 = true;
                        }
                        if (z1Var.mo62927s3()) {
                            Log.m105925i("MicroMsg.BigBallContactAssemblerImpl", "updateAddrUp RealName[%s], User[%s], remarkChange[%s]", aVar.mo106388h(), aVar.mo106389i(), Boolean.valueOf(z2));
                            C75398e.vx0().mo106403d(aVar.mo106385e(), aVar);
                        }
                    }
                }
            }
        }
        Log.m105925i("MicroMsg.BigBallContactAssemblerImpl", "username:%s needModContact %s encryptUser:%s", z1Var.getUsername(), Boolean.valueOf(z2), v2);
        if (z2) {
            Set<String> set = C45628s0.f123410p;
            ((C77885p) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96100XW()).mo107993q(new C32330n(2, C45628s0.m50786m(z1Var)));
        }
        C44673z4 Lo4 = ((C44651a5) C97625j3.m125812b().mo105880F()).mo69630Lo(z1Var.mo73978v2());
        String str10 = Lo4 != null ? Lo4.field_contactLabels : null;
        if (Util.isNullOrNil(str10) && (Lo4 = ((C44651a5) C97625j3.m125812b().mo105880F()).mo69630Lo(z1Var.getUsername())) != null) {
            str10 = Lo4.field_contactLabels;
        }
        if (!Util.isNullOrNil(str10)) {
            C28251b a2 = C28250a.m38138a();
            String username2 = z1Var.getUsername();
            C67001a aVar2 = (C67001a) a2;
            synchronized (aVar2) {
                Log.m105925i("MicroMsg.Label.ContactLabelManagerImpl", "cpan[saveStrangerLabel] user:%s labels:%s", username2 + "", str10 + "");
                if (Util.isNullOrNil(str10)) {
                    Log.m105928w("MicroMsg.Label.ContactLabelManagerImpl", "cpan[saveStrangerLabel] labels is null.");
                } else {
                    ArrayList<String> arrayList = (ArrayList) aVar2.mo90969g(str10);
                    if (arrayList != null) {
                        if (!arrayList.isEmpty()) {
                            aVar2.f192475a = username2;
                            aVar2.f192476b = arrayList;
                            int size = arrayList.size();
                            aVar2.f192477c = new ArrayList<>();
                            for (int i4 = 0; i4 < size; i4++) {
                                C72955b2 mI = C27740g.vx0().mo100954mI(arrayList.get(i4));
                                if (mI != null && mI.field_isTemporary) {
                                    aVar2.f192477c.add(arrayList.get(i4));
                                }
                            }
                            C97625j3.m125815e().mo123455a(C28613b.CTRL_INDEX, aVar2.f192478d);
                            C97625j3.m125815e().mo123455a(638, aVar2.f192478d);
                            ArrayList<String> arrayList2 = aVar2.f192477c;
                            if (arrayList2 != null) {
                                if (!arrayList2.isEmpty()) {
                                    Log.m105925i("MicroMsg.Label.ContactLabelManagerImpl", "cpan[saveStrangerLabel]addList:%s", aVar2.f192477c.toString());
                                    C97625j3.m125815e().mo123460f(new C75319a((List<String>) aVar2.f192477c));
                                }
                            }
                            aVar2.mo90975m(username2, arrayList);
                            aVar2.mo90974l();
                        }
                    }
                    Log.m105928w("MicroMsg.Label.ContactLabelManagerImpl", "cpan[saveStrangerLabel] labelList is null.");
                }
            }
            Lo4.field_contactLabels = "";
            ((C44651a5) C97625j3.m125812b().mo105880F()).replace(Lo4);
        }
    }

    /* renamed from: b1 */
    public void mo54200b1(C72996z1 z1Var, C50482n20 n202) {
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105925i("MicroMsg.BigBallContactAssemblerImpl", "onsceneEnd errType:%d,errCode:%d,errMsg:%s", Integer.valueOf(i), Integer.valueOf(i2), str);
        if (yVar.getType() != 681 || i != 0 || i2 != 0) {
            return;
        }
        if (!C86709a0.m107523b().f251765p) {
            Log.m105928w("MicroMsg.BigBallContactAssemblerImpl", "initialize notify is not done.");
            return;
        }
        ((C119157j) C119157j.f356862d).mo183884o(new C45812a(this, yVar));
    }
}
