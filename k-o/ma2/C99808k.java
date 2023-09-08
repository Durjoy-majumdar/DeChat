package ma2;

import android.os.Bundle;
import com.tencent.p014mm.autogen.events.MusicPlayerEvent;
import com.tencent.p014mm.autogen.events.VoipEvent;
import com.tencent.p014mm.plugin.ball.model.BallInfo;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.PhoneStatusWatcher;
import di3.C86312j;
import f40.C86709a0;
import gy3.C87412m;
import ma2.C99803i;
import ma2.C99815p;
import p385u2.C111105a;
import p646pn.C100824i;
import qc0.C101093a;
import qc0.C101106m;
import qc0.C62602o;
import te3.C64719t23;
import xv0.C38857m;
import zt3.C119157j;

/* renamed from: ma2.k */
public final class C99808k {

    /* renamed from: a */
    public static final C99808k f292491a = new C99808k();

    /* renamed from: b */
    public static boolean f292492b = false;

    /* renamed from: c */
    public static String f292493c = "";

    /* renamed from: d */
    public static C62602o f292494d = null;

    /* renamed from: e */
    public static boolean f292495e = true;

    /* renamed from: f */
    public static String f292496f = "";

    /* renamed from: g */
    public static C62602o f292497g;

    /* renamed from: h */
    public static boolean f292498h;

    /* renamed from: ma2.k$b */
    public static final class C34508b implements PhoneStatusWatcher.StaticPhoneCallListener {

        /* renamed from: ma2.k$b$a */
        public static final class C34509a implements Runnable {

            /* renamed from: d */
            public static final C34509a f92866d = new C34509a();

            public final void run() {
                C99808k.f292491a.mo139165b(true);
            }
        }

        public void onPhoneCall(int i) {
            if (C86709a0.m107522a()) {
                if (C111105a.m151499a(MMApplicationContext.getContext(), "android.permission.READ_PHONE_STATE") != 0) {
                    Log.m105920e("MicroMsg.GlobalMusicFloatBallManager", "initPhoneStatusWatcher not have read_phone_state perm");
                } else if (i == 1 || i == 2) {
                    Log.m105925i("MicroMsg.GlobalMusicFloatBallManager", "onPhoneCall, removeCurrentBall, state:%s", Integer.valueOf(i));
                    ((C119157j) C119157j.f356862d).mo183895z(C34509a.f92866d);
                }
            }
        }
    }

    /* renamed from: ma2.k$d */
    public static final class C34510d extends IStaticListener<VoipEvent> {
        public boolean callback(IEvent iEvent) {
            VoipEvent voipEvent = (VoipEvent) iEvent;
            C87412m.m108594g(voipEvent, "event");
            if (C86709a0.m107522a()) {
                Log.m105925i("MicroMsg.GlobalMusicFloatBallManager", "receive VoipEvent:[%s, %s]", Integer.valueOf(voipEvent.f194019d.f194026f), Integer.valueOf(voipEvent.f194019d.f194022b));
                int i = voipEvent.f194019d.f194022b;
                if (i == 7 || i == 3) {
                    C99808k.f292491a.mo139165b(true);
                }
            }
            return false;
        }
    }

    /* renamed from: ma2.k$a */
    public static final class C99809a extends C38857m {

        /* renamed from: ma2.k$a$a */
        public static final class C34507a implements Runnable {

            /* renamed from: d */
            public static final C34507a f92865d = new C34507a();

            public final void run() {
                C99808k.f292491a.mo139165b(true);
            }
        }

        /* renamed from: D2 */
        public void mo61807D2(BallInfo ballInfo) {
            if (ballInfo == null || ballInfo.f311686d != 23) {
                return;
            }
            if (!ballInfo.f311693n.f311706d) {
                C101093a.m132485g();
            } else if (C99808k.f292498h) {
                C101106m b = C101093a.m132480b();
                if (b != null) {
                    C101093a.m132488j(b);
                }
            } else {
                C101093a.m132486h();
            }
        }

        /* renamed from: G1 */
        public void mo58338G1(BallInfo ballInfo) {
            if (ballInfo != null) {
                int i = ballInfo.f311686d;
                if (i == 6) {
                    C99803i iVar = C99803i.C99805b.f292488a;
                    if (iVar != null) {
                        Log.m105927v(iVar.f292485n, "onFloatBallInfoClicked, type: %d, key: %s", Integer.valueOf(i), ballInfo.f311688f);
                    }
                } else if (i == 23) {
                    Log.m105927v(C99815p.C99817b.f292514b.f292485n, "onFloatBallInfoClicked, type: %d, key: %s", Integer.valueOf(i), ballInfo.f311688f);
                }
            }
        }

        /* renamed from: H */
        public void mo58339H(BallInfo ballInfo) {
            if (ballInfo != null) {
                int i = ballInfo.f311686d;
                if (i == 6) {
                    C99803i iVar = C99803i.C99805b.f292488a;
                    if (iVar != null) {
                        Log.m105927v(iVar.f292485n, "onFloatBallInfoExposed, type: %d, key: %s", Integer.valueOf(i), ballInfo.f311688f);
                    }
                } else if (i == 23) {
                    Log.m105927v(C99815p.C99817b.f292514b.f292485n, "onFloatBallInfoExposed, type: %d, key: %s", Integer.valueOf(i), ballInfo.f311688f);
                }
            }
        }

        /* renamed from: X4 */
        public void mo61808X4(BallInfo ballInfo, BallInfo ballInfo2) {
            if (ballInfo != null) {
                Log.m105925i("MicroMsg.GlobalMusicFloatBallManager", "onFloatBalInfoReplaced type: %s", Integer.valueOf(ballInfo.f311686d));
                if (ballInfo.f311686d == 23) {
                    C99815p.C99817b.f292513a.getClass();
                    C99815p.C99817b.f292514b.mo68418k();
                }
            }
        }

        /* renamed from: c2 */
        public void mo58340c2(BallInfo ballInfo) {
            if (ballInfo != null) {
                int i = ballInfo.f311686d;
                if (i == 6) {
                    C99803i iVar = C99803i.C99805b.f292488a;
                    String y0 = iVar != null ? iVar.mo139162y0(ballInfo, C99808k.f292495e) : null;
                    if (C99808k.f292495e) {
                        C99808k.m130279a(C99808k.f292491a, y0);
                    }
                    C99808k.f292495e = true;
                } else if (i == 23) {
                    C99815p.C99817b bVar = C99815p.C99817b.f292513a;
                    String y05 = C99815p.C99817b.f292514b.mo139162y0(ballInfo, C99808k.f292495e);
                    if (C99808k.f292495e) {
                        C99808k.m130279a(C99808k.f292491a, y05);
                    }
                    C99808k.f292495e = true;
                }
            }
        }

        /* renamed from: f5 */
        public void mo61809f5(BallInfo ballInfo) {
            if (ballInfo != null && ballInfo.f311686d == 23) {
                C99815p.C99817b.f292513a.getClass();
                C99815p.C99817b.f292514b.mo68418k();
            }
        }

        /* renamed from: t5 */
        public void mo61810t5(BallInfo ballInfo) {
            if (ballInfo != null) {
                if (C87412m.m108589b(ballInfo, C99815p.C99817b.f292514b.f311726d)) {
                    Log.m105924i("MicroMsg.GlobalMusicFloatBallManager", "onFloatBallInfoAdded remove normal music ball");
                    C99803i iVar = C99803i.C99805b.f292488a;
                    if (iVar != null) {
                        iVar.mo68418k();
                    }
                } else {
                    C99803i iVar2 = C99803i.C99805b.f292488a;
                    if (C87412m.m108589b(ballInfo, iVar2 != null ? iVar2.f311726d : null)) {
                        Log.m105924i("MicroMsg.GlobalMusicFloatBallManager", "onFloatBallInfoAdded remove music player ball");
                        C99815p.C99817b.f292514b.mo68418k();
                    } else {
                        int i = ballInfo.f311686d;
                        if (18 == i || 17 == i || ((C100824i) C86312j.m106911c(C100824i.class)).mo139643js(ballInfo)) {
                            Log.m105925i("MicroMsg.GlobalMusicFloatBallManager", "onFloatBallInfoAdded pause music because of ball: %s", Integer.valueOf(ballInfo.f311686d));
                            if (C101093a.m132480b() != null && C101093a.m132481c()) {
                                C101093a.m132485g();
                            }
                            MMHandlerThread.postToMainThread(C34507a.f92865d);
                        }
                    }
                }
                int i2 = ballInfo.f311686d;
                if (i2 == 6) {
                    C99803i iVar3 = C99803i.C99805b.f292488a;
                    if (iVar3 != null) {
                        Log.m105927v(iVar3.f292485n, "onFloatBallInfoAdded, type: %d, key: %s", Integer.valueOf(i2), ballInfo.f311688f);
                    }
                } else if (i2 == 23) {
                    Log.m105927v(C99815p.C99817b.f292514b.f292485n, "onFloatBallInfoAdded, type: %d, key: %s", Integer.valueOf(i2), ballInfo.f311688f);
                }
            }
        }
    }

    /* renamed from: ma2.k$c */
    public static final class C99810c extends IStaticListener<MusicPlayerEvent> {
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0060, code lost:
            if (r3 != 7) goto L_0x00ae;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean callback(com.tencent.p014mm.sdk.event.IEvent r10) {
            /*
                r9 = this;
                com.tencent.mm.autogen.events.MusicPlayerEvent r10 = (com.tencent.p014mm.autogen.events.MusicPlayerEvent) r10
                java.lang.String r0 = "event"
                gy3.C87412m.m108594g(r10, r0)
                boolean r0 = f40.C86709a0.m107522a()
                r1 = 0
                if (r0 != 0) goto L_0x0010
                goto L_0x00cb
            L_0x0010:
                r0 = 1
                java.lang.Object[] r2 = new java.lang.Object[r0]
                com.tencent.mm.autogen.events.MusicPlayerEvent$a r3 = r10.f9336d
                int r3 = r3.f9337a
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r2[r1] = r3
                java.lang.String r3 = "MicroMsg.GlobalMusicFloatBallManager"
                java.lang.String r4 = "alvinluo dispatchMusicPlayerEvent action: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105927v(r3, r4, r2)
                com.tencent.mm.autogen.events.MusicPlayerEvent$a r2 = r10.f9336d
                int r2 = r2.f9337a
                r4 = 2
                if (r2 == 0) goto L_0x002d
                if (r2 != r0) goto L_0x0051
            L_0x002d:
                qc0.m r2 = qc0.C101093a.m132480b()
                if (r2 == 0) goto L_0x0039
                boolean r5 = r2.f295953N
                if (r5 != 0) goto L_0x0039
                r5 = 1
                goto L_0x003a
            L_0x0039:
                r5 = 0
            L_0x003a:
                if (r5 == 0) goto L_0x0051
                java.lang.Object[] r10 = new java.lang.Object[r4]
                java.lang.String r4 = r2.f295962g
                r10[r1] = r4
                boolean r2 = r2.f295958T
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                r10[r0] = r2
                java.lang.String r0 = "alvinluo onMusicAction not need show music float ball, music: %s, isFromNewMusicWrapper: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r0, r10)
                goto L_0x00cb
            L_0x0051:
                com.tencent.mm.autogen.events.MusicPlayerEvent$a r2 = r10.f9336d
                int r3 = r2.f9337a
                java.lang.String r5 = ""
                r6 = 7
                r7 = 0
                if (r3 == r0) goto L_0x0091
                if (r3 == r4) goto L_0x007b
                r8 = 3
                if (r3 == r8) goto L_0x0063
                if (r3 == r6) goto L_0x007b
                goto L_0x00ae
            L_0x0063:
                qc0.m r2 = r2.f9338b
                if (r2 == 0) goto L_0x006d
                java.lang.String r2 = r2.f295960e
                if (r2 != 0) goto L_0x006c
                goto L_0x006d
            L_0x006c:
                r5 = r2
            L_0x006d:
                ma2.C99808k.f292496f = r5
                qc0.o r2 = ma2.C99808k.f292494d
                ma2.C99808k.f292497g = r2
                ma2.p$b r2 = ma2.C99815p.C99817b.f292513a
                ma2.p r2 = ma2.C99815p.C99817b.f292514b
                r2.mo139174L0(r7)
                goto L_0x00ae
            L_0x007b:
                ma2.C99808k.f292492b = r1
                ma2.C99808k.f292493c = r7
                ma2.p$b r2 = ma2.C99815p.C99817b.f292513a
                ma2.p r2 = ma2.C99815p.C99817b.f292514b
                r2.mo139174L0(r7)
                com.tencent.mm.autogen.events.MusicPlayerEvent$a r2 = r10.f9336d
                int r2 = r2.f9337a
                if (r2 != r4) goto L_0x00ae
                ma2.p r2 = ma2.C99815p.C99817b.f292514b
                r2.f292509u = r1
                goto L_0x00ae
            L_0x0091:
                qc0.m r2 = r2.f9338b
                if (r2 == 0) goto L_0x0098
                java.lang.String r3 = r2.f295960e
                goto L_0x0099
            L_0x0098:
                r3 = r7
            L_0x0099:
                if (r3 != 0) goto L_0x009c
                goto L_0x009d
            L_0x009c:
                r5 = r3
            L_0x009d:
                java.lang.String r3 = ma2.C99808k.f292496f
                boolean r3 = gy3.C87412m.m108589b(r5, r3)
                if (r3 == 0) goto L_0x00aa
                qc0.o r3 = ma2.C99808k.f292497g
                ma2.C99808k.m130282f(r2, r3)
            L_0x00aa:
                ma2.C99808k.f292496f = r7
                ma2.C99808k.f292497g = r7
            L_0x00ae:
                com.tencent.mm.autogen.events.MusicPlayerEvent$a r2 = r10.f9336d
                int r2 = r2.f9337a
                if (r2 == r4) goto L_0x00b8
                if (r2 != r6) goto L_0x00b7
                goto L_0x00b8
            L_0x00b7:
                r0 = 0
            L_0x00b8:
                ma2.C99808k.f292498h = r0
                if (r2 != r6) goto L_0x00bf
                qc0.C101093a.m132480b()
            L_0x00bf:
                ma2.i r0 = ma2.C99803i.C99805b.f292488a
                if (r0 == 0) goto L_0x00c6
                r0.mo139151B0(r10)
            L_0x00c6:
                ma2.p r0 = ma2.C99815p.C99817b.f292514b
                r0.mo139151B0(r10)
            L_0x00cb:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: ma2.C99808k.C99810c.callback(com.tencent.mm.sdk.event.IEvent):boolean");
        }
    }

    /* renamed from: a */
    public static final void m130279a(C99808k kVar, String str) {
        kVar.getClass();
        Log.m105925i("MicroMsg.GlobalMusicFloatBallManager", "alvinluo onMusicBallRemoved current: %s, removed: %s", f292493c, str);
        if (C87412m.m108589b(f292493c, str)) {
            kVar.mo139166d();
        }
    }

    /* renamed from: c */
    public static final void m130280c(boolean z) {
        Log.m105925i("MicroMsg.GlobalMusicFloatBallManager", "alvinluo removeMusicFloatBall needStopMusic: %s", Boolean.valueOf(z));
        f292495e = z;
        f292491a.mo139165b(z);
    }

    /* renamed from: e */
    public static final void m130281e(C101106m mVar) {
        Object[] objArr = new Object[3];
        Boolean bool = null;
        objArr[0] = mVar != null ? Boolean.valueOf(mVar.f295958T) : null;
        objArr[1] = Boolean.valueOf(f292492b);
        if (mVar != null) {
            bool = Boolean.valueOf(mVar.f295953N);
        }
        objArr[2] = bool;
        Log.m105925i("MicroMsg.GlobalMusicFloatBallManager", "alvinluo resumeMusicFloatBallIfNeed isFromNewMusicPlayer: %s, isMusicMvMode: %s, showMusicFloatBall: %s", objArr);
        if (!(mVar != null && mVar.f295953N)) {
            m130280c(false);
        } else if (mVar.f295958T || f292492b) {
            mVar.f295958T = true;
            C99815p.C99817b bVar = C99815p.C99817b.f292513a;
            C99815p.C99817b.f292514b.mo139155F0(mVar);
        } else {
            C99803i iVar = C99803i.C99805b.f292488a;
            if (iVar != null) {
                iVar.mo139155F0(mVar);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00ae A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00c9  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m130282f(qc0.C101106m r8, qc0.C62602o r9) {
        /*
            java.lang.String r0 = ""
            r1 = 0
            if (r8 == 0) goto L_0x0009
            java.lang.String r2 = r8.f295960e
            if (r2 != 0) goto L_0x0012
        L_0x0009:
            if (r9 == 0) goto L_0x000e
            java.lang.String r2 = r9.f177793a
            goto L_0x000f
        L_0x000e:
            r2 = r1
        L_0x000f:
            if (r2 != 0) goto L_0x0012
            r2 = r0
        L_0x0012:
            f292493c = r2
            f292494d = r9
            r2 = 0
            r3 = 1
            if (r8 == 0) goto L_0x0020
            boolean r4 = r8.f295958T
            if (r4 != r3) goto L_0x0020
            r4 = 1
            goto L_0x0021
        L_0x0020:
            r4 = 0
        L_0x0021:
            if (r4 != 0) goto L_0x0030
            if (r9 == 0) goto L_0x002e
            te3.t23 r4 = r9.f177794b
            boolean r4 = ht1.C60212v5.m70422a(r4)
            if (r4 != 0) goto L_0x002e
            goto L_0x0030
        L_0x002e:
            r4 = 0
            goto L_0x0031
        L_0x0030:
            r4 = 1
        L_0x0031:
            r5 = 6
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = f292493c
            r5[r2] = r6
            if (r8 == 0) goto L_0x0041
            boolean r6 = r8.f295958T
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            goto L_0x0042
        L_0x0041:
            r6 = r1
        L_0x0042:
            r5[r3] = r6
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
            r7 = 2
            r5[r7] = r6
            r6 = 3
            if (r9 == 0) goto L_0x0055
            te3.t23 r7 = r9.f177794b
            if (r7 == 0) goto L_0x0055
            java.lang.String r7 = r7.f185473u
            goto L_0x0056
        L_0x0055:
            r7 = r1
        L_0x0056:
            r5[r6] = r7
            r6 = 4
            if (r9 == 0) goto L_0x0062
            te3.t23 r7 = r9.f177794b
            if (r7 == 0) goto L_0x0062
            java.lang.String r7 = r7.f185463h
            goto L_0x0063
        L_0x0062:
            r7 = r1
        L_0x0063:
            r5[r6] = r7
            r6 = 5
            if (r8 == 0) goto L_0x006f
            boolean r7 = r8.f295953N
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            goto L_0x0070
        L_0x006f:
            r7 = r1
        L_0x0070:
            r5[r6] = r7
            java.lang.String r6 = "MicroMsg.GlobalMusicFloatBallManager"
            java.lang.String r7 = "alvinluo updateMusicInfo musicId: %s, isFromNewMusicPlayer: %s, isValid: %s, song: %s, %s, showMusicBall: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r7, r5)
            if (r4 == 0) goto L_0x00cf
            f292492b = r3
            if (r9 == 0) goto L_0x0082
            java.lang.String r4 = r9.f177795c
            goto L_0x0083
        L_0x0082:
            r4 = r1
        L_0x0083:
            if (r4 == 0) goto L_0x008e
            int r4 = r4.length()
            if (r4 != 0) goto L_0x008c
            goto L_0x008e
        L_0x008c:
            r4 = 0
            goto L_0x008f
        L_0x008e:
            r4 = 1
        L_0x008f:
            if (r4 != 0) goto L_0x0096
            if (r9 == 0) goto L_0x009f
            java.lang.String r4 = r9.f177795c
            goto L_0x00a0
        L_0x0096:
            if (r9 == 0) goto L_0x009f
            te3.t23 r4 = r9.f177794b
            if (r4 == 0) goto L_0x009f
            java.lang.String r4 = r4.f185472t
            goto L_0x00a0
        L_0x009f:
            r4 = r1
        L_0x00a0:
            if (r4 == 0) goto L_0x00ab
            int r5 = r4.length()
            if (r5 != 0) goto L_0x00a9
            goto L_0x00ab
        L_0x00a9:
            r5 = 0
            goto L_0x00ac
        L_0x00ab:
            r5 = 1
        L_0x00ac:
            if (r5 == 0) goto L_0x00b7
            if (r8 == 0) goto L_0x00b6
            java.lang.String r4 = r8.f295965j
            if (r4 != 0) goto L_0x00b5
            goto L_0x00b6
        L_0x00b5:
            r0 = r4
        L_0x00b6:
            r4 = r0
        L_0x00b7:
            ma2.p$b r0 = ma2.C99815p.C99817b.f292513a
            ma2.p r0 = ma2.C99815p.C99817b.f292514b
            if (r8 == 0) goto L_0x00c2
            boolean r8 = r8.f295953N
            if (r8 != r3) goto L_0x00c2
            r2 = 1
        L_0x00c2:
            r0.mo139173K0(r4, r2)
            ma2.p r8 = ma2.C99815p.C99817b.f292514b
            if (r9 == 0) goto L_0x00cb
            te3.t23 r1 = r9.f177794b
        L_0x00cb:
            r8.mo139175M0(r1)
            goto L_0x00dd
        L_0x00cf:
            f292492b = r2
            ma2.p$b r8 = ma2.C99815p.C99817b.f292513a
            ma2.p r8 = ma2.C99815p.C99817b.f292514b
            r8.mo139173K0(r1, r3)
            ma2.p r8 = ma2.C99815p.C99817b.f292514b
            r8.mo139175M0(r1)
        L_0x00dd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ma2.C99808k.m130282f(qc0.m, qc0.o):void");
    }

    /* renamed from: b */
    public final void mo139165b(boolean z) {
        Log.m105924i("MicroMsg.GlobalMusicFloatBallManager", "alvinluo removeMusicBall reset: " + z);
        C99803i.C99805b.f292488a.mo68418k();
        C99815p.C99817b bVar = C99815p.C99817b.f292513a;
        C99815p.C99817b.f292514b.mo68418k();
        if (z) {
            mo139166d();
        }
    }

    /* renamed from: d */
    public final void mo139166d() {
        Log.m105924i("MicroMsg.GlobalMusicFloatBallManager", "alvinluo resetMusicMvInfo");
        f292492b = false;
        f292494d = null;
        C99815p.C99817b.f292513a.getClass();
        C99815p.C99817b.f292514b.mo139175M0((C64719t23) null);
        C99815p.C99817b.f292513a.getClass();
        C99815p.C99817b.f292514b.mo139174L0((Bundle) null);
    }
}
