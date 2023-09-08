package nw3;

import android.os.Message;
import android.text.TextUtils;
import as3.C103860b1;
import as3.C103863c1;
import as3.C103896q0;
import as3.C103900s0;
import as3.C103914z0;
import bs3.C104161b;
import bs3.C104166f;
import bs3.C28416g;
import c92.C104328f;
import com.tencent.p014mm.plugin.multi.talk;
import com.tencent.p014mm.plugin.multitalk.model.C105799g0;
import com.tencent.p014mm.plugin.multitalk.model.C105805i;
import com.tencent.p014mm.plugin.multitalk.model.C105806i0;
import com.tencent.p014mm.plugin.multitalk.model.C105853x;
import com.tencent.p014mm.plugin.multitalk.model.MultiTalkManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p1102pb.common.system.ConnectReceiver;
import com.tencent.p1102pb.talkroom.sdk.MultiTalkGroup;
import com.tencent.wecall.talkroom.model.TalkRoom;
import cs3.C106962a;
import ds3.C107061a;
import ds3.C107064d;
import ds3.C107065e;
import ds3.C107066f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import nw3.C109782f;
import nw3.C109804j;
import ow3.C110089m;
import ow3.C110090n;
import v82.C111452h1;
import w33.C111720c0;
import zr3.C112675e;
import zr3.C112683i;

/* renamed from: nw3.e */
public class C109779e implements C107064d {

    /* renamed from: d */
    public static C109779e f328545d;

    /* renamed from: a */
    public C107061a f328546a = null;

    /* renamed from: b */
    public ConnectReceiver f328547b = new ConnectReceiver();

    /* renamed from: c */
    public C109804j.C109807c f328548c = new C109780a();

    /* renamed from: nw3.e$a */
    public class C109780a implements C109804j.C109807c {
        public C109780a() {
        }

        /* renamed from: a */
        public void mo161043a(int i) {
            C104161b.m138993b("TalkRoomSdkApi", "onNotifyLargeVideoSubscribersChange largeVideoSubscribersCnt: ", Integer.valueOf(i));
            C107061a aVar = C109779e.this.f328546a;
            if (aVar != null) {
                MultiTalkManager multiTalkManager = (MultiTalkManager) aVar;
                multiTalkManager.getClass();
                Log.m105924i("MicroMsg.MT.MultiTalkManager", "onNotifyLargeVideoSubscribersChange largeVideoSubscribersCnt: " + i);
                if (i > 0) {
                    multiTalkManager.f314465G = true;
                } else {
                    multiTalkManager.f314465G = false;
                }
            }
        }

        /* renamed from: b */
        public void mo161044b() {
            C104161b.m138997f("TalkRoomSdkApi", "onSendMsgSucc");
            C107061a aVar = C109779e.this.f328546a;
            if (aVar != null) {
                aVar.getClass();
            }
        }

        /* renamed from: c */
        public void mo161045c(int i) {
            C104161b.m138993b("TalkRoomSdkApi", "onSwitchMultiTalkVideoSuss bitRate: ", Integer.valueOf(i));
            C107061a aVar = C109779e.this.f328546a;
            if (aVar != null) {
                Log.m105925i("MicroMsg.MT.MultiTalkManager", "onSwitchMultiTalkVideoSuss currentVideoAction %d", Integer.valueOf(((MultiTalkManager) aVar).f314496h));
            }
        }

        /* renamed from: d */
        public void mo161046d(String str, boolean z) {
            C104161b.m138993b("TalkRoomSdkApi", "onExitRoom", str, C109770a.m149092a().f328593p, Boolean.valueOf(z));
        }

        /* renamed from: d0 */
        public void mo161047d0() {
            C104161b.m138997f("TalkRoomSdkApi", "onInitSeccess");
            if (C109779e.this.f328546a != null) {
                Log.m105924i("MicroMsg.MT.MultiTalkManager", "onMultiTalkReady");
            }
        }

        /* renamed from: e */
        public void mo161048e() {
            C104161b.m138993b("TalkRoomSdkApi", "onSubscribeLargeVideoSuss");
            C107061a aVar = C109779e.this.f328546a;
            if (aVar != null) {
                ((MultiTalkManager) aVar).getClass();
                Log.m105924i("MicroMsg.MT.MultiTalkManager", "onSubscribeLargeVideoSuss ");
            }
        }

        /* renamed from: f */
        public void mo161049f(int i) {
            C104161b.m138993b("TalkRoomSdkApi", "onSwitchVideoScreenSharingRsp switch_ret: ", Integer.valueOf(i));
            C107061a aVar = C109779e.this.f328546a;
            if (aVar != null) {
                MultiTalkManager multiTalkManager = (MultiTalkManager) aVar;
                if (multiTalkManager.f314470L == null) {
                    multiTalkManager.f314470L = new C105799g0();
                }
                if (multiTalkManager.f314470L != null) {
                    Log.m105924i("MicroMsg.MultiTalkScreenCastManager", String.valueOf(i));
                }
            }
        }

        /* renamed from: g */
        public void mo161050g(int i, Object obj) {
            C104161b.m138997f("TalkRoomSdkApi", "onErr errCode: ", Integer.valueOf(i), " data: ", obj);
            C107061a aVar = C109779e.this.f328546a;
            if (aVar != null) {
                ((MultiTalkManager) aVar).mo150631H(i, obj);
            }
        }

        /* renamed from: h */
        public void mo161051h(MultiTalkGroup multiTalkGroup, long j) {
            C104161b.m138997f("TalkRoomSdkApi", "onEnterRoom", multiTalkGroup);
            C107061a aVar = C109779e.this.f328546a;
            if (aVar != null) {
                C104328f fVar = C104328f.f308805a;
                C104328f.f308807c = j;
                C111720c0 c0Var = C111720c0.f334432a;
                C111720c0.f334433b = C104328f.f308806b;
                C111720c0.f334434c = j;
                ((MultiTalkManager) aVar).mo150630G(multiTalkGroup);
            }
        }

        /* renamed from: i */
        public void mo161052i(String str, int i) {
            C104161b.m138993b("TalkRoomSdkApi", "onModifyGroupInfo", str, Integer.valueOf(i));
        }

        /* renamed from: j */
        public void mo161053j(int i, MultiTalkGroup multiTalkGroup) {
            C104161b.m138997f("TalkRoomSdkApi", "onMisscMultiTalk", multiTalkGroup, " time: ", Integer.valueOf(i));
            C107061a aVar = C109779e.this.f328546a;
            if (aVar != null) {
                C105853x.m142235f(2, C105806i0.m142152e(multiTalkGroup));
                ((MultiTalkManager) aVar).mo150667j(multiTalkGroup, C111452h1.Inviting, false, true, true, false);
            }
        }

        /* renamed from: k */
        public void mo161054k(int i) {
            C104161b.m138993b("TalkRoomSdkApi", "onStateChanged", Integer.valueOf(i));
        }

        /* renamed from: l */
        public void mo161055l(boolean z) {
            C104161b.m138995d("TalkRoomSdkApi", "onMuteStateChange", Boolean.valueOf(z));
            C107061a aVar = C109779e.this.f328546a;
            if (aVar != null) {
                MultiTalkManager multiTalkManager = (MultiTalkManager) aVar;
                multiTalkManager.f314493e = z;
                C105805i iVar = multiTalkManager.f314462D;
                if (iVar != null) {
                    iVar.mo150762l(z);
                }
            }
        }

        /* renamed from: m */
        public void mo161056m() {
            C104161b.m138993b("TalkRoomSdkApi", "onSubscribeScreenSharingVideoSuss");
            C107061a aVar = C109779e.this.f328546a;
            if (aVar != null) {
                ((MultiTalkManager) aVar).getClass();
                Log.m105924i("MicroMsg.MT.MultiTalkManager", "onSubscribeScreenSharingVideoSuss ");
            }
        }

        /* renamed from: n */
        public void mo161057n() {
            C104161b.m138993b("TalkRoomSdkApi", "onSelfHoldOnEnd");
        }

        /* JADX WARNING: Removed duplicated region for block: B:23:0x0086  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0093  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x00c0  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00c5  */
        /* renamed from: o */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo161058o(com.tencent.p1102pb.talkroom.sdk.MultiTalkGroup r15) {
            /*
                r14 = this;
                nw3.f r0 = nw3.C109770a.m149092a()
                java.lang.String r0 = r0.f328593p
                if (r15 == 0) goto L_0x000b
                java.lang.String r1 = r15.f320042d
                goto L_0x000c
            L_0x000b:
                r1 = 0
            L_0x000c:
                r3 = r1
                r1 = 5
                java.lang.Object[] r2 = new java.lang.Object[r1]
                r4 = 0
                java.lang.String r5 = "onMemberChange mGroupId: "
                r2[r4] = r5
                r5 = 1
                r2[r5] = r0
                r6 = 2
                java.lang.String r7 = " groupId: "
                r2[r6] = r7
                r7 = 3
                r2[r7] = r3
                r8 = 4
                r2[r8] = r15
                java.lang.String r9 = "TalkRoomSdkApi"
                bs3.C104161b.m138995d(r9, r2)
                boolean r2 = bs3.C104166f.m139003c(r3, r0)
                if (r2 == 0) goto L_0x011d
                nw3.c r2 = nw3.C109774c.m149103b()
                r2.getClass()
                nw3.c r2 = nw3.C109774c.m149103b()
                com.tencent.wecall.talkroom.model.TalkRoom r2 = r2.mo161020h(r0)
                java.lang.String r10 = "TalkRoomManager"
                if (r2 != 0) goto L_0x004b
                java.lang.Object[] r2 = new java.lang.Object[r5]
                java.lang.String r11 = "isMySelfExit talkRoom is null"
                r2[r4] = r11
                bs3.C104161b.m138997f(r10, r2)
                goto L_0x0068
            L_0x004b:
                java.util.Map<java.lang.String, nw3.d> r2 = r2.f320125n
                java.lang.String r11 = cs3.C106962a.f320180a
                java.util.concurrent.ConcurrentHashMap r2 = (java.util.concurrent.ConcurrentHashMap) r2
                java.lang.Object r2 = r2.get(r11)
                nw3.d r2 = (nw3.C109777d) r2
                if (r2 == 0) goto L_0x0068
                r11 = 20
                as3.b1 r2 = r2.f328542a
                if (r2 != 0) goto L_0x0061
                r2 = 0
                goto L_0x0063
            L_0x0061:
                int r2 = r2.f306891d
            L_0x0063:
                if (r11 != r2) goto L_0x0066
                goto L_0x0068
            L_0x0066:
                r2 = 0
                goto L_0x0069
            L_0x0068:
                r2 = 1
            L_0x0069:
                if (r2 == 0) goto L_0x011d
                nw3.f r2 = nw3.C109770a.m149092a()
                int r2 = r2.f328587g
                if (r2 == r7) goto L_0x011d
                nw3.c r2 = nw3.C109774c.m149103b()
                r2.getClass()
                nw3.c r2 = nw3.C109774c.m149103b()
                com.tencent.wecall.talkroom.model.TalkRoom r2 = r2.mo161020h(r0)
                java.lang.String r11 = " reason: "
                if (r2 != 0) goto L_0x0093
                java.lang.Object[] r2 = new java.lang.Object[r6]
                java.lang.String r12 = "getMySelfReason talkRoom is null groupId: "
                r2[r4] = r12
                r2[r5] = r0
                bs3.C104161b.m138997f(r10, r2)
                r2 = 0
                goto L_0x00bc
            L_0x0093:
                java.util.Map<java.lang.String, nw3.d> r2 = r2.f320125n
                java.lang.String r12 = cs3.C106962a.f320180a
                java.util.concurrent.ConcurrentHashMap r2 = (java.util.concurrent.ConcurrentHashMap) r2
                java.lang.Object r2 = r2.get(r12)
                nw3.d r2 = (nw3.C109777d) r2
                if (r2 == 0) goto L_0x00a8
                as3.b1 r2 = r2.f328542a
                if (r2 == 0) goto L_0x00a8
                int r2 = r2.f306892e
                goto L_0x00a9
            L_0x00a8:
                r2 = 0
            L_0x00a9:
                java.lang.Object[] r12 = new java.lang.Object[r8]
                java.lang.String r13 = "getMySelfReason groupId: "
                r12[r4] = r13
                r12[r5] = r0
                r12[r6] = r11
                java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
                r12[r7] = r0
                bs3.C104161b.m138997f(r10, r12)
            L_0x00bc:
                r0 = 104(0x68, float:1.46E-43)
                if (r2 != r0) goto L_0x00c5
                r0 = -1602(0xfffffffffffff9be, float:NaN)
                r10 = 325(0x145, float:4.55E-43)
                goto L_0x00d0
            L_0x00c5:
                if (r2 != r6) goto L_0x00cc
                r0 = -1603(0xfffffffffffff9bd, float:NaN)
                r10 = 326(0x146, float:4.57E-43)
                goto L_0x00d0
            L_0x00cc:
                r0 = -1604(0xfffffffffffff9bc, float:NaN)
                r10 = 328(0x148, float:4.6E-43)
            L_0x00d0:
                r12 = 7
                java.lang.Object[] r12 = new java.lang.Object[r12]
                java.lang.String r13 = "onMemberChange isMySelfExit finish "
                r12[r4] = r13
                java.lang.String r4 = "stopstatus"
                r12[r5] = r4
                java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
                r12[r6] = r4
                java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
                r12[r7] = r4
                r12[r8] = r3
                r12[r1] = r11
                r1 = 6
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r12[r1] = r2
                bs3.C104161b.m138997f(r9, r12)
                nw3.C109799g0.m149206g(r0)
                nw3.f r0 = nw3.C109770a.m149092a()
                nw3.g0 r0 = r0.f328563J
                r0.mo161128j(r10)
                nw3.f r2 = nw3.C109770a.m149092a()
                nw3.f r0 = nw3.C109770a.m149092a()
                int r4 = r0.f328597s
                nw3.f r0 = nw3.C109770a.m149092a()
                long r5 = r0.f328598t
                r7 = 0
                nw3.f r0 = nw3.C109770a.m149092a()
                boolean r8 = r0.f328588h
                r9 = 0
                r10 = 0
                r2.mo161099j(r3, r4, r5, r7, r8, r9, r10)
            L_0x011d:
                nw3.e r0 = nw3.C109779e.this
                ds3.a r0 = r0.f328546a
                if (r0 == 0) goto L_0x0128
                com.tencent.mm.plugin.multitalk.model.MultiTalkManager r0 = (com.tencent.p014mm.plugin.multitalk.model.MultiTalkManager) r0
                r0.mo150633J(r15)
            L_0x0128:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: nw3.C109779e.C109780a.mo161058o(com.tencent.pb.talkroom.sdk.MultiTalkGroup):void");
        }

        /* renamed from: p */
        public void mo161059p(List<MultiTalkGroup> list) {
            C104161b.m138995d("TalkRoomSdkApi", "onActiveMultiTalkList ", list);
            C107061a aVar = C109779e.this.f328546a;
            if (aVar != null) {
                aVar.getClass();
            }
        }

        /* renamed from: q */
        public void mo161060q(String str, byte[] bArr) {
            Object[] objArr = new Object[4];
            int i = 0;
            objArr[0] = "onRcvMultiTalkMsg groupId: ";
            objArr[1] = str;
            objArr[2] = " datas size: ";
            if (bArr != null) {
                i = bArr.length;
            }
            objArr[3] = Integer.valueOf(i);
            C104161b.m138997f("TalkRoomSdkApi", objArr);
            C107061a aVar = C109779e.this.f328546a;
            if (aVar != null) {
                aVar.getClass();
            }
        }

        /* renamed from: r */
        public void mo161061r() {
            C104161b.m138993b("TalkRoomSdkApi", "onSelfHoldOnBegin");
        }

        /* renamed from: s */
        public void mo161062s(List<C103900s0> list) {
            C104161b.m138993b("TalkRoomSdkApi", "onVideoGroupMemberChange videoUserNames: ", list);
            C107061a aVar = C109779e.this.f328546a;
            if (aVar != null) {
                ((MultiTalkManager) aVar).mo150635L(list);
            }
        }

        /* renamed from: t */
        public void mo161063t(int i) {
            C104161b.m138993b("TalkRoomSdkApi", "onOpeningChannel", Integer.valueOf(i));
        }

        /* renamed from: u */
        public void mo161064u(String str, int i, int i2) {
            C104161b.m138993b("TalkRoomSdkApi", "onDoScreenSharingSecurityCheck ret: ", Integer.valueOf(i), " checkRet: ", Integer.valueOf(i2));
            C107061a aVar = C109779e.this.f328546a;
            if (aVar != null) {
                ((MultiTalkManager) aVar).mo150629F(str, i, i2);
            }
        }

        /* renamed from: v */
        public void mo161065v() {
            C104161b.m138993b("TalkRoomSdkApi", "onSubscribeGeneralVideoSuss");
            C107061a aVar = C109779e.this.f328546a;
            if (aVar != null) {
                ((MultiTalkManager) aVar).getClass();
                Log.m105924i("MicroMsg.MT.MultiTalkManager", "onSubscribeGeneralVideoSuss ");
            }
        }

        /* renamed from: w */
        public void mo161066w(MultiTalkGroup multiTalkGroup) {
            C104161b.m138997f("TalkRoomSdkApi", "onInviteMultiTalk", multiTalkGroup);
            C107061a aVar = C109779e.this.f328546a;
            if (aVar != null) {
                ((MultiTalkManager) aVar).mo150632I(multiTalkGroup);
            }
        }

        /* renamed from: x */
        public void mo161067x(MultiTalkGroup multiTalkGroup, long j) {
            C104161b.m138997f("TalkRoomSdkApi", "onCreateRoom", multiTalkGroup);
            C107061a aVar = C109779e.this.f328546a;
            if (aVar != null) {
                C104328f fVar = C104328f.f308805a;
                C104328f.f308807c = j;
                C111720c0 c0Var = C111720c0.f334432a;
                C111720c0.f334433b = C104328f.f308806b;
                C111720c0.f334434c = j;
                ((MultiTalkManager) aVar).mo150628E(multiTalkGroup);
            }
        }
    }

    /* renamed from: a */
    public boolean mo161030a(String str, String str2, List<String> list, String str3) {
        char c;
        char c2;
        char c3;
        String str4;
        String str5 = str;
        String str6 = str2;
        C109782f a = C109770a.m149092a();
        a.f328554A = str3;
        String[] X = C109782f.m149153X(list);
        if (X.length <= 0) {
            str4 = str6;
            str5 = null;
            c3 = 2;
            c2 = 0;
            c = 1;
        } else if (TextUtils.isEmpty((CharSequence) null)) {
            int hashCode = (C106962a.f320180a.hashCode() & 65535) | (new Random().nextInt() << 16);
            C104161b.m138997f("TalkRoomService", "createTalkRoom cliendId: ", str5, " voiceSingle2MultiInfo: ", null, " memeberUuids size: ", Integer.valueOf(X.length), "routeId", Integer.valueOf(hashCode), " context: ", null, " type: ", 0, " playId: ", 0L, " sdkKey: ", null);
            if (!(!C104166f.m139002b(C106962a.f320180a))) {
                C104161b.m138997f("TalkRoomService", "createTalkRoom isAuthed: ", Boolean.valueOf(!C104166f.m139002b(C106962a.f320180a)), " isBindMobile: ", Boolean.TRUE);
                c2 = 0;
                c = 1;
                C109799g0.m149210l("", str, 0, 0, "create", "req", String.valueOf(false), "noAuth");
                str4 = str6;
                str5 = null;
                c3 = 2;
            } else {
                if (!C112683i.m154066a()) {
                    C104161b.m138997f("TalkRoomService", "createTalkRoom isNetworkConnected is false");
                    C109799g0.m149208i(-4003);
                    c2 = 0;
                    c = 1;
                    C109799g0.m149210l("", str, 0, 0, "create", "req", String.valueOf(false), "noNetwork");
                } else if (a.mo161080L()) {
                    if (a.mo161080L()) {
                        C109799g0.m149208i(-4002);
                    }
                    c2 = 0;
                    c = 1;
                    C109799g0.m149210l("", str, 0, 0, "create", "req", String.valueOf(false), "isBusy");
                } else if (TextUtils.isEmpty(str)) {
                    C104161b.m138997f("TalkRoomService", "createTalkRoom cliendId is null");
                    c2 = 0;
                    c = 1;
                    C109799g0.m149210l("", str, 0, 0, "create", "req", String.valueOf(false), "cliendIdnull");
                } else if (!C109801h0.m149216a(str)) {
                    C104161b.m138997f("TalkRoomService", "createTalkRoom groupId is not cliend id: ", str5);
                    c2 = 0;
                    c = 1;
                    C109799g0.m149210l("", str, 0, 0, "create", "req", String.valueOf(false), "isnotcliendId");
                } else {
                    if (C109774c.m149103b().mo161020h(str5) == null) {
                        C109774c b = C109774c.m149103b();
                        b.getClass();
                        C104161b.m138993b("TalkRoomManager", "newTmpGroup groupId: ", str5);
                        if (!C109801h0.m149216a(str)) {
                            C104161b.m138997f("TalkRoomManager", "newTmpGroup invalid clientGroupId");
                        } else if (X.length == 0) {
                            C104161b.m138997f("TalkRoomManager", "newTmpGroup empty uuid array");
                        } else {
                            try {
                                C103914z0 z0Var = new C103914z0();
                                z0Var.f307241d = 0;
                                z0Var.f307250m = str6;
                                z0Var.f307249l = C106962a.f320180a;
                                TalkRoom talkRoom = new TalkRoom(str5, (Integer) null, z0Var);
                                int length = X.length;
                                int i = 0;
                                while (i != length) {
                                    String str7 = X[i];
                                    C103860b1 b1Var = new C103860b1();
                                    b1Var.f306906s = str7;
                                    b1Var.f306907t = C106962a.f320180a;
                                    b1Var.f306891d = 20;
                                    b1Var.f306893f = -1;
                                    b1Var.f306894g = (int) (System.currentTimeMillis() / 1000);
                                    C109777d dVar = new C109777d(b1Var, new C103863c1());
                                    ((ConcurrentHashMap) talkRoom.f320125n).put(dVar.mo161024a(), dVar);
                                    i++;
                                    String str8 = str2;
                                }
                                ((HashMap) b.f328538a).put(str5, talkRoom);
                                C104161b.m138993b("TalkRoomManager", "asyncWriteBackCache");
                            } catch (Exception e) {
                                C104161b.m138997f("TalkRoomManager", "newTmpGroup err: ", e);
                            }
                        }
                    }
                    a.mo161074F();
                    a.mo161092Y(false);
                    a.mo161077I();
                    if (!a.mo161076H()) {
                        C104161b.m138997f("TalkRoomService", "createTalkRoom initEngine fail");
                        c2 = 0;
                        c = 1;
                        c3 = 2;
                        C109799g0.m149210l("", str, 0, 0, "create", "req", String.valueOf(false), "initEnginefail");
                        a.mo161092Y(false);
                        str4 = str2;
                        str5 = null;
                    } else {
                        c3 = 2;
                        c2 = 0;
                        c = 1;
                        C109799g0 g0Var = a.f328563J;
                        g0Var.getClass();
                        long currentTimeMillis = System.currentTimeMillis();
                        g0Var.f328674F = currentTimeMillis;
                        C104161b.m138993b(C109799g0.f328668J, "beginCreateOrEnter", Long.valueOf(currentTimeMillis));
                        a.f328593p = str5;
                        a.f328577U = str5;
                        a.f328596r = hashCode;
                        a.f328595q = str5;
                        a.mo161085Q(1);
                        a.f328588h = true;
                        C109782f.C109792h hVar = new C109782f.C109792h(a);
                        hVar.f328637a = a.f328593p;
                        hVar.f328638b = X;
                        hVar.f328639c = null;
                        hVar.f328640d = hashCode;
                        hVar.f328641e = 0;
                        hVar.f328642f = 0;
                        hVar.f328643g = null;
                        hVar.f328644h = false;
                        str4 = str2;
                        hVar.f328645i = str4;
                        Message obtain = Message.obtain();
                        obtain.what = 2;
                        obtain.obj = hVar;
                        a.f328585e.removeMessages(2);
                        TalkRoom h = C109774c.m149103b().mo161020h(a.f328593p);
                        if (h == null) {
                            C104161b.m138997f("TalkRoomManager", "isOnlyMySelfInGroup talkroom is null");
                        } else {
                            ArrayList arrayList = (ArrayList) h.mo157172a();
                            if (arrayList.size() != 1) {
                                C104161b.m138997f("TalkRoomManager", "isOnlyMySelfInGroup TalkRoomMember list is not match");
                            } else {
                                C109777d dVar2 = (C109777d) arrayList.get(0);
                                if (dVar2 == null) {
                                    C104161b.m138997f("TalkRoomManager", "isOnlyMySelfInGroup talkRoomMember is null");
                                } else {
                                    C104161b.m138997f("TalkRoomManager", "isOnlyMySelfInGroup ret: ", Boolean.valueOf(C104166f.m139001a(C106962a.f320180a, dVar2.mo161024a())));
                                }
                            }
                        }
                        a.f328585e.sendMessage(obtain);
                    }
                }
                c3 = 2;
                str4 = str2;
                str5 = null;
            }
        } else {
            throw null;
        }
        Object[] objArr = new Object[8];
        objArr[c2] = "createTalkRoom clientId is: ";
        objArr[c] = str5;
        objArr[c3] = "wXgroupId: ";
        objArr[3] = str4;
        objArr[4] = " creatorUsrName: ";
        objArr[5] = C106962a.f320180a;
        objArr[6] = " usrnameList: ";
        objArr[7] = list;
        C104161b.m138997f("TalkRoomSdkApi", objArr);
        return str5 != null;
    }

    /* renamed from: b */
    public boolean mo161031b(String str) {
        boolean z = true;
        if (!C104166f.m139003c(str, C109770a.m149092a().f328593p)) {
            C104161b.m138997f("TalkRoomSdkApi", "exitMultiTalk groupid is not same; multiTalkGroupid: ", str, C109770a.m149092a().f328593p);
            if (((C109782f.C109796l) ((HashMap) C109770a.m149092a().f328584d).get(str)) == null) {
                z = false;
            }
            if (z) {
                C109782f.C109796l lVar = (C109782f.C109796l) ((HashMap) C109770a.m149092a().f328584d).get(str);
                C109770a.m149092a().mo161081M(str, lVar == null ? 0 : lVar.f328660a, lVar == null ? 0 : lVar.f328661b, 1);
            }
            return false;
        }
        int i = C109770a.m149092a().f328597s;
        long j = C109770a.m149092a().f328598t;
        boolean o = C109770a.m149092a().mo161104o(str, 1, 100);
        C104161b.m138997f("TalkRoomSdkApi", "exitMultiTalk groupId: ", str, " roomId: ", Integer.valueOf(i), " roomKey: ", Long.valueOf(j));
        return o;
    }

    /* renamed from: c */
    public String mo161032c() {
        String str = "client_" + C106962a.f320180a + "_" + System.currentTimeMillis();
        C104161b.m138997f("TalkRoomSdkApi", "genMultiTalkClientId clientId: ", str);
        return str;
    }

    /* renamed from: d */
    public boolean mo161033d(boolean z) {
        C104161b.m138997f("TalkRoomSdkApi", "holadMultiTalk isHold", Boolean.valueOf(z));
        if (z) {
            C109782f a = C109770a.m149092a();
            a.getClass();
            C104161b.m138993b("TalkRoomService", "syscall", "startHoldOn");
            a.f328572R0 = true;
            a.mo161084P(false);
            C109804j jVar = a.f328573S;
            jVar.getClass();
            C28416g.m38191a(new C109818u(jVar));
        } else {
            C109782f a2 = C109770a.m149092a();
            a2.getClass();
            C104161b.m138993b("TalkRoomService", "syscall", "endHoldOn");
            a2.f328572R0 = false;
            a2.mo161089U();
            if (a2.mo161080L() && a2.f328591n) {
                a2.mo161084P(true);
                C109804j jVar2 = a2.f328573S;
                jVar2.getClass();
                C28416g.m38191a(new C109819v(jVar2));
            }
        }
        return true;
    }

    /* renamed from: e */
    public C107066f mo161034e(byte[] bArr, int[] iArr, int i) {
        C109782f a = C109770a.m149092a();
        a.getClass();
        C107066f fVar = new C107066f();
        int i2 = 0;
        if (a.f328591n && a.f328564K != null) {
            try {
                C104161b.m138993b("TalkRoomService", "receiveScreen");
                fVar = a.f328564K.mo161009g(bArr, iArr, i);
            } catch (Exception e) {
                C104161b.m138997f("TalkRoomService", "receiveScreen error: ", e);
            }
            C104161b.m138993b("TalkRoomService", "receiveScreen finished, ", Boolean.valueOf(a.f328591n), " decInfo: ", fVar, " engine: ", a.f328564K);
        }
        Object[] objArr = new Object[4];
        objArr[0] = "receiveScreen imgBuffer size: ";
        if (bArr != null) {
            i2 = bArr.length;
        }
        objArr[1] = Integer.valueOf(i2);
        objArr[2] = " MultiTalkVideoDecodeInfo: ";
        objArr[3] = fVar;
        C104161b.m138993b("TalkRoomSdkApi", objArr);
        return fVar;
    }

    /* renamed from: f */
    public C107066f mo161035f(int[] iArr) {
        C109782f a = C109770a.m149092a();
        a.getClass();
        C107066f fVar = new C107066f();
        int i = 0;
        if (a.f328591n && a.f328564K != null) {
            try {
                C104161b.m138993b("TalkRoomService", "receiveVideo");
                fVar = a.f328564K.mo161010h(iArr);
            } catch (Exception e) {
                C104161b.m138997f("TalkRoomService", "receiveVideo error: ", e);
            }
            C104161b.m138993b("TalkRoomService", "receiveVideo finished, ", Boolean.valueOf(a.f328591n), " decInfo: ", fVar, " engine: ", a.f328564K);
        }
        Object[] objArr = new Object[4];
        objArr[0] = "receiveVideo imgBuffer size: ";
        if (iArr != null) {
            i = iArr.length;
        }
        objArr[1] = Integer.valueOf(i);
        objArr[2] = " MultiTalkVideoDecodeInfo: ";
        objArr[3] = fVar;
        C104161b.m138993b("TalkRoomSdkApi", objArr);
        return fVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00fd  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo161036g(byte[] r28, int r29, int r30, int r31, int r32) {
        /*
            r27 = this;
            r7 = r28
            r8 = 10
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r9 = 0
            java.lang.String r10 = "sendScreen buffer size: "
            r0[r9] = r10
            if (r7 != 0) goto L_0x000f
            r1 = 0
            goto L_0x0010
        L_0x000f:
            int r1 = r7.length
        L_0x0010:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r11 = 1
            r0[r11] = r1
            r12 = 2
            java.lang.String r13 = " len: "
            r0[r12] = r13
            java.lang.Integer r1 = java.lang.Integer.valueOf(r29)
            r14 = 3
            r0[r14] = r1
            r15 = 4
            java.lang.String r16 = " w: "
            r0[r15] = r16
            java.lang.Integer r1 = java.lang.Integer.valueOf(r30)
            r17 = 5
            r0[r17] = r1
            r6 = 6
            java.lang.String r18 = " h: "
            r0[r6] = r18
            java.lang.Integer r1 = java.lang.Integer.valueOf(r31)
            r19 = 7
            r0[r19] = r1
            r20 = 8
            java.lang.String r21 = " format: "
            r0[r20] = r21
            java.lang.Integer r1 = java.lang.Integer.valueOf(r32)
            r22 = 9
            r0[r22] = r1
            java.lang.String r5 = "TalkRoomSdkApi"
            bs3.C104161b.m138995d(r5, r0)
            nw3.f r4 = nw3.C109770a.m149092a()
            java.lang.String r3 = "TalkRoomService"
            boolean r0 = r4.f328591n
            r23 = -1
            java.lang.String r24 = " ret: "
            if (r0 == 0) goto L_0x00f1
            nw3.b r0 = r4.f328564K
            if (r0 == 0) goto L_0x00f1
            java.lang.Object[] r0 = new java.lang.Object[r14]     // Catch:{ Exception -> 0x00bb }
            java.lang.String r1 = "sendScreen "
            r0[r9] = r1     // Catch:{ Exception -> 0x00bb }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r30)     // Catch:{ Exception -> 0x00bb }
            r0[r11] = r1     // Catch:{ Exception -> 0x00bb }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r31)     // Catch:{ Exception -> 0x00bb }
            r0[r12] = r1     // Catch:{ Exception -> 0x00bb }
            bs3.C104161b.m138993b(r3, r0)     // Catch:{ Exception -> 0x00bb }
            nw3.b r0 = r4.f328564K     // Catch:{ Exception -> 0x00bb }
            if (r7 == 0) goto L_0x009b
            com.tencent.mm.plugin.multi.talk r1 = r0.f328532a     // Catch:{ Exception -> 0x00bb }
            if (r1 != 0) goto L_0x0085
            r8 = r3
            r25 = r4
            r26 = r5
            goto L_0x00a3
        L_0x0085:
            r2 = r28
            r8 = r3
            r3 = r29
            r25 = r4
            r4 = r30
            r26 = r5
            r5 = r31
            r6 = r32
            int r0 = r1.SendScreen(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x00b9 }
            r23 = r0
            goto L_0x00cc
        L_0x009b:
            r8 = r3
            r25 = r4
            r26 = r5
            r0.getClass()     // Catch:{ Exception -> 0x00b9 }
        L_0x00a3:
            java.lang.Object[] r1 = new java.lang.Object[r15]     // Catch:{ Exception -> 0x00b9 }
            java.lang.String r2 = "steve:sendScreen null, buffer:"
            r1[r9] = r2     // Catch:{ Exception -> 0x00b9 }
            r1[r11] = r7     // Catch:{ Exception -> 0x00b9 }
            java.lang.String r2 = ", engine:"
            r1[r12] = r2     // Catch:{ Exception -> 0x00b9 }
            com.tencent.mm.plugin.multi.talk r0 = r0.f328532a     // Catch:{ Exception -> 0x00b9 }
            r1[r14] = r0     // Catch:{ Exception -> 0x00b9 }
            java.lang.String r0 = "simon:TalkRoomContext"
            bs3.C104161b.m138997f(r0, r1)     // Catch:{ Exception -> 0x00b9 }
            goto L_0x00cc
        L_0x00b9:
            r0 = move-exception
            goto L_0x00c1
        L_0x00bb:
            r0 = move-exception
            r8 = r3
            r25 = r4
            r26 = r5
        L_0x00c1:
            java.lang.Object[] r1 = new java.lang.Object[r12]
            java.lang.String r2 = "sendScreen error: "
            r1[r9] = r2
            r1[r11] = r0
            bs3.C104161b.m138997f(r8, r1)
        L_0x00cc:
            r1 = 6
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r2 = "sendScreen finished, "
            r0[r9] = r2
            r2 = r25
            boolean r3 = r2.f328591n
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r0[r11] = r3
            r0[r12] = r24
            java.lang.Integer r3 = java.lang.Integer.valueOf(r23)
            r0[r14] = r3
            java.lang.String r3 = " engine: "
            r0[r15] = r3
            nw3.b r2 = r2.f328564K
            r0[r17] = r2
            bs3.C104161b.m138993b(r8, r0)
            goto L_0x00f4
        L_0x00f1:
            r26 = r5
            r1 = 6
        L_0x00f4:
            r0 = 12
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r9] = r10
            if (r7 != 0) goto L_0x00fd
            goto L_0x00fe
        L_0x00fd:
            int r9 = r7.length
        L_0x00fe:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
            r0[r11] = r2
            r0[r12] = r13
            java.lang.Integer r2 = java.lang.Integer.valueOf(r29)
            r0[r14] = r2
            r0[r15] = r16
            java.lang.Integer r2 = java.lang.Integer.valueOf(r30)
            r0[r17] = r2
            r0[r1] = r18
            java.lang.Integer r1 = java.lang.Integer.valueOf(r31)
            r0[r19] = r1
            r0[r20] = r21
            java.lang.Integer r1 = java.lang.Integer.valueOf(r32)
            r0[r22] = r1
            r1 = 10
            r0[r1] = r24
            r1 = 11
            java.lang.Integer r2 = java.lang.Integer.valueOf(r23)
            r0[r1] = r2
            r1 = r26
            bs3.C104161b.m138995d(r1, r0)
            return r23
        */
        throw new UnsupportedOperationException("Method not decompiled: nw3.C109779e.mo161036g(byte[], int, int, int, int):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00ae  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo161037h(byte[] r19, int r20, int r21, int r22, int r23, int r24) {
        /*
            r18 = this;
            r8 = r19
            nw3.f r9 = nw3.C109770a.m149092a()
            java.lang.String r10 = "TalkRoomService"
            boolean r0 = r9.f328591n
            r12 = 5
            r13 = 6
            r14 = 2
            r15 = 1
            r7 = 3
            r6 = 4
            r16 = 0
            if (r0 == 0) goto L_0x009f
            nw3.b r0 = r9.f328564K
            if (r0 == 0) goto L_0x009f
            java.lang.Object[] r0 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x006b }
            java.lang.String r1 = "sendVideo "
            r0[r16] = r1     // Catch:{ Exception -> 0x006b }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r21)     // Catch:{ Exception -> 0x006b }
            r0[r15] = r1     // Catch:{ Exception -> 0x006b }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r22)     // Catch:{ Exception -> 0x006b }
            r0[r14] = r1     // Catch:{ Exception -> 0x006b }
            bs3.C104161b.m138993b(r10, r0)     // Catch:{ Exception -> 0x006b }
            nw3.b r0 = r9.f328564K     // Catch:{ Exception -> 0x006b }
            if (r8 == 0) goto L_0x004d
            com.tencent.mm.plugin.multi.talk r1 = r0.f328532a     // Catch:{ Exception -> 0x006b }
            if (r1 != 0) goto L_0x0039
            r11 = 4
            r17 = 3
            goto L_0x0053
        L_0x0039:
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r22
            r11 = 4
            r6 = r23
            r17 = 3
            r7 = r24
            int r0 = r1.SendVideo(r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x0069 }
            goto L_0x007b
        L_0x004d:
            r11 = 4
            r17 = 3
            r0.getClass()     // Catch:{ Exception -> 0x0069 }
        L_0x0053:
            java.lang.Object[] r1 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x0069 }
            java.lang.String r2 = "steve:sendVideo null, buffer:"
            r1[r16] = r2     // Catch:{ Exception -> 0x0069 }
            r1[r15] = r8     // Catch:{ Exception -> 0x0069 }
            java.lang.String r2 = ", engine:"
            r1[r14] = r2     // Catch:{ Exception -> 0x0069 }
            com.tencent.mm.plugin.multi.talk r0 = r0.f328532a     // Catch:{ Exception -> 0x0069 }
            r1[r17] = r0     // Catch:{ Exception -> 0x0069 }
            java.lang.String r0 = "simon:TalkRoomContext"
            bs3.C104161b.m138997f(r0, r1)     // Catch:{ Exception -> 0x0069 }
            goto L_0x007a
        L_0x0069:
            r0 = move-exception
            goto L_0x006f
        L_0x006b:
            r0 = move-exception
            r11 = 4
            r17 = 3
        L_0x006f:
            java.lang.Object[] r1 = new java.lang.Object[r14]
            java.lang.String r2 = "sendVideo error: "
            r1[r16] = r2
            r1[r15] = r0
            bs3.C104161b.m138997f(r10, r1)
        L_0x007a:
            r0 = -1
        L_0x007b:
            java.lang.Object[] r1 = new java.lang.Object[r13]
            java.lang.String r2 = "sendVideo finished, "
            r1[r16] = r2
            boolean r2 = r9.f328591n
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r1[r15] = r2
            java.lang.String r2 = " ret: "
            r1[r14] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r1[r17] = r2
            java.lang.String r2 = " engine: "
            r1[r11] = r2
            nw3.b r2 = r9.f328564K
            r1[r12] = r2
            bs3.C104161b.m138993b(r10, r1)
            goto L_0x00a3
        L_0x009f:
            r11 = 4
            r17 = 3
            r0 = -1
        L_0x00a3:
            r1 = 12
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "sendVideo buffer size: "
            r1[r16] = r2
            if (r8 != 0) goto L_0x00ae
            goto L_0x00b1
        L_0x00ae:
            int r2 = r8.length
            r16 = r2
        L_0x00b1:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r16)
            r1[r15] = r2
            java.lang.String r2 = " len: "
            r1[r14] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r20)
            r1[r17] = r2
            java.lang.String r2 = " w: "
            r1[r11] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r21)
            r1[r12] = r2
            java.lang.String r2 = " h: "
            r1[r13] = r2
            r2 = 7
            java.lang.Integer r3 = java.lang.Integer.valueOf(r22)
            r1[r2] = r3
            r2 = 8
            java.lang.String r3 = " format: "
            r1[r2] = r3
            r2 = 9
            java.lang.Integer r3 = java.lang.Integer.valueOf(r23)
            r1[r2] = r3
            r2 = 10
            java.lang.String r3 = " mode: "
            r1[r2] = r3
            r2 = 11
            java.lang.Integer r3 = java.lang.Integer.valueOf(r24)
            r1[r2] = r3
            java.lang.String r2 = "TalkRoomSdkApi"
            bs3.C104161b.m138993b(r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: nw3.C109779e.mo161037h(byte[], int, int, int, int, int):int");
    }

    /* renamed from: i */
    public int mo161038i(int i, byte[] bArr, int i2) {
        talk talk;
        C109772b bVar = C109770a.m149092a().f328564K;
        int i3 = -1;
        if (bVar == null) {
            C104161b.m138997f("TalkRoomService", "setAppCmd type: ", Integer.valueOf(i), " engine is null");
        } else if (bArr == null || (talk = bVar.f328532a) == null) {
            C104161b.m138997f("simon:TalkRoomContext", "steve:setAppCmd null, params:", bArr, ", engine:", bVar.f328532a);
        } else {
            i3 = talk.setAppCmd(i, bArr, i2);
        }
        C104161b.m138993b("TalkRoomSdkApi", "setAppCmd type: ", Integer.valueOf(i), " paramLen: ", Integer.valueOf(i2), " ret: ", Integer.valueOf(i3));
        return i3;
    }

    /* renamed from: j */
    public final void mo161039j(C107061a aVar, C107065e eVar) {
        this.f328546a = aVar;
        C109782f.f328551V0 = eVar;
        C109782f a = C109770a.m149092a();
        C109804j.C109807c cVar = this.f328548c;
        C109804j jVar = a.f328573S;
        jVar.getClass();
        synchronized (cVar) {
            if (!((LinkedList) jVar.f328705a).contains(cVar)) {
                ((LinkedList) jVar.f328705a).add(cVar);
            }
        }
    }

    /* renamed from: k */
    public void mo161040k(int i, String str) {
        C106962a.f320180a = str == null ? "" : str;
        C104161b.m138997f("TalkRoomSdkApi", "setWxUinAndUsrName uin: ", Integer.valueOf(i), " usrname: ", str);
    }

    /* renamed from: l */
    public boolean mo161041l(List<C103896q0> list) {
        if (!C109770a.m149092a().mo161080L()) {
            C104161b.m138997f("TalkRoomSdkApi", "subscribeScreenSharingVideoForUserList isWorking is false");
            return false;
        }
        C104161b.m138993b("TalkRoomSdkApi", "subscribeScreenSharingVideoForUserList memberListInfo: ", list);
        C109782f a = C109770a.m149092a();
        if (TextUtils.isEmpty(a.f328593p)) {
            C104161b.m138997f("TalkRoomService", "subscribeScreenSharingVideo mGroupId null ");
            return false;
        }
        boolean c = C112675e.m154053e().mo164407c(new C110089m(a.f328593p, a.f328597s, a.f328598t, list));
        C104161b.m138993b("TalkRoomService", "subscribeScreenSharingVideo ret: ", Boolean.valueOf(c));
        return c;
    }

    /* renamed from: m */
    public boolean mo161042m(int i) {
        if (!C109770a.m149092a().mo161080L()) {
            C104161b.m138997f("TalkRoomSdkApi", "switchMultiTalkVideo isWorking is false");
            return false;
        }
        C104161b.m138993b("TalkRoomSdkApi", "switchMultiTalkVideo action: ", Integer.valueOf(i));
        C109782f a = C109770a.m149092a();
        if (TextUtils.isEmpty(a.f328593p)) {
            C104161b.m138997f("TalkRoomService", "switchMultiTalkVideo mGroupId is null");
            return false;
        }
        a.f328555B = i;
        C110090n nVar = r6;
        C110090n nVar2 = new C110090n(a.f328593p, a.f328597s, a.f328598t, i, a.f328592o, 0, (String) null, (String) null);
        boolean c = C112675e.m154053e().mo164407c(nVar);
        C104161b.m138993b("TalkRoomService", "switchMultiTalkVideo ret: ", Boolean.valueOf(c));
        return c;
    }
}
