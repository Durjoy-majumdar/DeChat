package x22;

import android.app.Activity;
import android.os.Looper;
import android.os.Message;
import android.widget.Button;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.TalkRoomServerEvent;
import com.tencent.p014mm.plugin.location.p069ui.TipSayingWidget;
import com.tencent.p014mm.plugin.location.p069ui.VolumeMeter;
import com.tencent.p014mm.plugin.location.p069ui.impl.TrackPoint;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.PlaySound;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import d62.C75339i;
import dd0.C116607d;
import dd0.C75345c;
import di3.C86312j;
import eb0.C31519v2;
import eb0.C75592q0;
import java.util.LinkedList;
import java.util.List;
import ob0.C11385n;
import ob0.C117747y;
import p446av.C67110f;
import p492dn.C45426j;
import p740wo.C53193b;
import sx2.C118325m;
import t22.C77832s;

/* renamed from: x22.l */
public class C118796l implements C116607d, C11385n {

    /* renamed from: d */
    public Activity f355426d;

    /* renamed from: e */
    public Button f355427e;

    /* renamed from: f */
    public VolumeMeter f355428f;

    /* renamed from: g */
    public RelativeLayout f355429g;

    /* renamed from: h */
    public boolean f355430h = true;

    /* renamed from: i */
    public String f355431i;

    /* renamed from: j */
    public String f355432j;

    /* renamed from: n */
    public List<String> f355433n = new LinkedList();

    /* renamed from: o */
    public boolean f355434o = false;

    /* renamed from: p */
    public int f355435p = 0;

    /* renamed from: q */
    public long f355436q = 500;

    /* renamed from: r */
    public long f355437r = 0;

    /* renamed from: s */
    public MTimerHandler f355438s = new MTimerHandler(new C118797a(), false);

    /* renamed from: t */
    public MTimerHandler f355439t = new MTimerHandler(new C118798b(), false);

    /* renamed from: u */
    public MTimerHandler f355440u = new MTimerHandler(new C118799c(), false);

    /* renamed from: v */
    public C75345c f355441v;

    /* renamed from: w */
    public C112037f f355442w;

    /* renamed from: x */
    public final MTimerHandler f355443x = new MTimerHandler(new C118801e(), true);

    /* renamed from: x22.l$f */
    public interface C112037f {
    }

    /* renamed from: x22.l$a */
    public class C118797a implements MTimerHandler.CallBack {
        public C118797a() {
        }

        public boolean onTimerExpired() {
            Log.m105924i("MicroMsg.TalkMgr", "onSeizeMicSuccess expired to execute");
            C118796l.this.mo183507b();
            return false;
        }
    }

    /* renamed from: x22.l$b */
    public class C118798b implements MTimerHandler.CallBack {
        public C118798b() {
        }

        public boolean onTimerExpired() {
            Log.m105924i("MicroMsg.TalkMgr", "seizeMicTimer reach");
            C118796l lVar = C118796l.this;
            if (lVar.f355435p != 5) {
                return false;
            }
            lVar.f355435p = 3;
            ((C118325m) lVar.f355441v).mo183126s();
            lVar.f355443x.startTimer(100);
            return false;
        }
    }

    /* renamed from: x22.l$c */
    public class C118799c implements MTimerHandler.CallBack {
        public C118799c() {
        }

        public boolean onTimerExpired() {
            C118796l.this.mo183506a();
            return false;
        }
    }

    /* renamed from: x22.l$d */
    public class C118800d implements PlaySound.OnPlayCompletionListener {
        public C118800d() {
        }

        public void onCompletion() {
            C118796l.this.f355439t.stopTimer();
            C118796l lVar = C118796l.this;
            if (lVar.f355435p == 5) {
                lVar.f355435p = 3;
                ((C118325m) lVar.f355441v).mo183126s();
                lVar.f355443x.startTimer(100);
            }
        }
    }

    /* renamed from: x22.l$e */
    public class C118801e implements MTimerHandler.CallBack {
        public C118801e() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x004a  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0052  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTimerExpired() {
            /*
                r6 = this;
                x22.l r0 = x22.C118796l.this
                int r1 = r0.f355435p
                java.lang.String r2 = ""
                java.lang.String r3 = "MicroMsg.TalkRoomServer"
                r4 = 0
                r5 = 3
                if (r1 != r5) goto L_0x0022
                dd0.c r0 = r0.f355441v
                sx2.m r0 = (sx2.C118325m) r0
                com.tencent.mm.plugin.talkroom.component.c r0 = r0.f353659u
                if (r0 != 0) goto L_0x0015
                goto L_0x0041
            L_0x0015:
                int r0 = r0.mo176156R5()     // Catch:{ RemoteException -> 0x001b }
            L_0x0019:
                short r4 = (short) r0
                goto L_0x0041
            L_0x001b:
                r0 = move-exception
                java.lang.Object[] r1 = new java.lang.Object[r4]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r0, r2, r1)
                goto L_0x0041
            L_0x0022:
                java.lang.String r0 = r0.f355431i
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                if (r0 == 0) goto L_0x002b
                return r4
            L_0x002b:
                x22.l r0 = x22.C118796l.this
                dd0.c r0 = r0.f355441v
                sx2.m r0 = (sx2.C118325m) r0
                com.tencent.mm.plugin.talkroom.component.d r0 = r0.f353658t
                if (r0 != 0) goto L_0x0036
                goto L_0x0041
            L_0x0036:
                int r0 = r0.mo176164R5()     // Catch:{ RemoteException -> 0x003b }
                goto L_0x0019
            L_0x003b:
                r0 = move-exception
                java.lang.Object[] r1 = new java.lang.Object[r4]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r0, r2, r1)
            L_0x0041:
                x22.l r0 = x22.C118796l.this
                float r1 = (float) r4
                r2 = 1092616192(0x41200000, float:10.0)
                int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                if (r3 >= 0) goto L_0x004c
                r1 = 1092616192(0x41200000, float:10.0)
            L_0x004c:
                r2 = 1120403456(0x42c80000, float:100.0)
                int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                if (r3 <= 0) goto L_0x0054
                r1 = 1120403456(0x42c80000, float:100.0)
            L_0x0054:
                com.tencent.mm.plugin.location.ui.VolumeMeter r3 = r0.f355428f
                float r1 = r1 / r2
                r3.setVolume(r1)
                com.tencent.mm.plugin.location.ui.VolumeMeter r0 = r0.f355428f
                r0.invalidate()
                r0 = 1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: x22.C118796l.C118801e.onTimerExpired():boolean");
        }
    }

    public C118796l(Activity activity, Button button, TipSayingWidget tipSayingWidget) {
        this.f355426d = activity;
        this.f355427e = button;
        RelativeLayout relativeLayout = (RelativeLayout) activity.findViewById(C0966R.C0970id.ldw);
        this.f355429g = relativeLayout;
        relativeLayout.setVisibility(8);
        VolumeMeter volumeMeter = (VolumeMeter) this.f355429g.findViewById(C0966R.C0970id.ldx);
        this.f355428f = volumeMeter;
        volumeMeter.setArchView(this.f355427e);
        VolumeMeter volumeMeter2 = this.f355428f;
        if (volumeMeter2.f346410n == null) {
            volumeMeter2.f346410n = new MMHandler("VolumeMeter_handler");
        }
        C75345c vt = ((C67110f) C86312j.m106911c(C67110f.class)).mo91211vt();
        this.f355441v = vt;
        if (vt == null) {
            Log.m105920e("MicroMsg.TalkMgr", "cannot get talkroom server");
        }
    }

    /* renamed from: A5 */
    public void mo176184A5(String str, String str2) {
        Log.m105925i("MicroMsg.TalkMgr", "add %s,  del %s", str, str2);
    }

    /* renamed from: C2 */
    public void mo176185C2() {
    }

    /* renamed from: F5 */
    public void mo176186F5() {
        mo183506a();
    }

    /* renamed from: M6 */
    public void mo176194M6(int i) {
        Log.m105924i("MicroMsg.TalkMgr", "onSeizeMicFailed");
        if (i == 340) {
            if (this.f355435p == 3) {
                this.f355435p = 4;
            } else {
                return;
            }
        } else if (this.f355435p == 1) {
            this.f355435p = 2;
        } else {
            return;
        }
        mo183506a();
        PlaySound.play(MMApplicationContext.getContext(), C0966R.string.jva, true, (PlaySound.OnPlayCompletionListener) null);
    }

    /* renamed from: O0 */
    public void mo176197O0(int i, int i2, String str) {
    }

    /* renamed from: S5 */
    public void mo176199S5() {
        if (this.f355435p == 1) {
            this.f355435p = 5;
            if (Util.ticksToNow(this.f355437r) < this.f355436q) {
                Log.m105924i("MicroMsg.TalkMgr", "onSeizeMicSuccess waiting to execute");
                this.f355438s.startTimer(this.f355436q - Util.ticksToNow(this.f355437r));
                return;
            }
            mo183507b();
        }
    }

    /* renamed from: U0 */
    public void mo176200U0(String str) {
    }

    /* renamed from: a */
    public final void mo183506a() {
        if (!this.f355430h) {
            if (((C118325m) ((C67110f) C86312j.m106911c(C67110f.class)).mo91211vt()).f353664z) {
                Log.m105918d("MicroMsg.TalkMgr", "talkRoomServer pausing");
                C112037f fVar = this.f355442w;
                if (fVar != null) {
                    ((C112033j) fVar).mo163751a((String) null);
                    ((C112033j) this.f355442w).mo163752b();
                }
            }
            int i = this.f355435p;
            if (i == 0) {
                Log.m105919d("MicroMsg.TalkMgr", "seize, state_idle, curUsername = %s", this.f355431i);
                if (this.f355442w == null) {
                    return;
                }
                if (!Util.isNullOrNil(this.f355431i)) {
                    ((C112033j) this.f355442w).mo163751a(this.f355431i);
                    return;
                }
                ((C112033j) this.f355442w).mo163751a((String) null);
            } else if (i == 1) {
                Log.m105918d("MicroMsg.TalkMgr", "seize, state seizing");
                C112037f fVar2 = this.f355442w;
                if (fVar2 != null) {
                    C112035k kVar = ((C112033j) fVar2).f335375e;
                    kVar.getClass();
                    Log.m105918d("MicroMsg.ShareHeaderMsgMgr", "onPrepareTalking");
                    kVar.f335394m.removeMessages(8);
                    Message obtain = Message.obtain();
                    obtain.what = 8;
                    kVar.f335394m.sendMessageAtFrontOfQueue(obtain);
                }
            } else if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        Log.m105918d("MicroMsg.TalkMgr", "seize time out");
                        return;
                    } else if (i != 5) {
                        return;
                    }
                }
                Log.m105918d("MicroMsg.TalkMgr", "seize, state success or prepare");
                C112037f fVar3 = this.f355442w;
                if (fVar3 != null) {
                    C112033j jVar = (C112033j) fVar3;
                    Log.m105918d("MicroMsg.ShareHeaderMgr", "onMyselfTalking");
                    jVar.f335379i = true;
                    String s = C75592q0.m90789s();
                    jVar.f335374d.mo163742c();
                    jVar.f335374d.mo163740a(s);
                    C112035k kVar2 = jVar.f335375e;
                    kVar2.getClass();
                    Log.m105918d("MicroMsg.ShareHeaderMsgMgr", "onMyselfTalking");
                    kVar2.f335394m.removeMessages(6);
                    kVar2.f335394m.removeMessages(5);
                    Message obtain2 = Message.obtain();
                    obtain2.what = 6;
                    kVar2.f335394m.sendMessageAtFrontOfQueue(obtain2);
                    Object viewByItag = jVar.f335380j.getViewByItag(s);
                    if (viewByItag instanceof TrackPoint) {
                        ((TrackPoint) viewByItag).mo175555c();
                    }
                    jVar.f335377g = s;
                }
            } else {
                Log.m105919d("MicroMsg.TalkMgr", "seize error, curUsername = %s", this.f355431i);
                if (this.f355442w != null && !Util.isNullOrNil(this.f355431i)) {
                    C112037f fVar4 = this.f355442w;
                    String str = this.f355431i;
                    C112035k kVar3 = ((C112033j) fVar4).f335375e;
                    kVar3.getClass();
                    Log.m105919d("MicroMsg.ShareHeaderMsgMgr", "onTalkConflict, username=%s", str);
                    if (!Util.isNullOrNil(str) && !Util.isNullOrNil(((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(str))) {
                        kVar3.f335392k = true;
                        kVar3.f335394m.removeMessages(7);
                        Message obtain3 = Message.obtain();
                        obtain3.what = 7;
                        kVar3.f335394m.sendMessageAtFrontOfQueue(obtain3);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo183507b() {
        if (this.f355435p == 5) {
            this.f355438s.stopTimer();
            mo183506a();
            PlaySound.play(MMApplicationContext.getContext(), (int) C0966R.string.jv5, (PlaySound.OnPlayCompletionListener) new C118800d());
            this.f355439t.startTimer(1000);
        }
    }

    /* renamed from: c */
    public void mo183508c() {
        TalkRoomServerEvent talkRoomServerEvent = new TalkRoomServerEvent();
        talkRoomServerEvent.f154883d.f154886b = true;
        talkRoomServerEvent.publish();
        ((C45426j) C86312j.m106911c(C45426j.class)).n40().mo157511t();
    }

    /* renamed from: d */
    public void mo183509d() {
        this.f355432j = this.f355426d.getIntent().getStringExtra("map_talker_name");
        ((C118325m) this.f355441v).mo183110a(this);
        Log.m105919d("MicroMsg.TalkMgr", "talkRoomName %s ", this.f355432j);
        String str = this.f355432j;
        if (!Util.isNullOrNil(str)) {
            if (C72996z1.m85820U5(str)) {
                List<String> k5 = ((C53193b) C86312j.m106911c(C53193b.class)).mo73727k5(str);
                if (k5 == null) {
                    C31519v2.m39436a().mo55987c(str, "");
                } else {
                    this.f355433n = k5;
                }
            } else {
                this.f355433n.clear();
                this.f355433n.add(str);
                this.f355433n.add(C75592q0.m90789s());
            }
            new MMHandler(Looper.getMainLooper()).post(new C118802m(this, str));
            this.f355427e.setOnTouchListener(new C118803n(this));
        }
    }

    /* renamed from: d0 */
    public void mo176201d0() {
        this.f355430h = false;
        this.f355427e.setEnabled(true);
        mo183506a();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
    }

    /* renamed from: q1 */
    public void mo176203q1(String str, int i, int i2) {
        Log.m105923f("MicroMsg.TalkMgr", "onInitFailed %s", str);
        C77832s.Ax0().mo183158a(3);
        this.f355426d.finish();
    }

    /* renamed from: r0 */
    public void mo176204r0() {
    }

    /* renamed from: v1 */
    public void mo176205v1() {
        mo183506a();
    }

    /* renamed from: z3 */
    public void mo176206z3(String str) {
        Log.m105919d("MicroMsg.TalkMgr", "onCurMember change %s", str);
        this.f355431i = str;
        mo183506a();
        if (!Util.isNullOrNil(str)) {
            PlaySound.play(MMApplicationContext.getContext(), C0966R.string.jv8);
            this.f355443x.startTimer(100);
            return;
        }
        this.f355443x.stopTimer();
    }
}
