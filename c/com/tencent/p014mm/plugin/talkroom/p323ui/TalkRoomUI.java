package com.tencent.p014mm.plugin.talkroom.p323ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.PowerManager;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.PauseAutoGetBigImgEvent;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.MMBaseActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.PlaySound;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatPermissions;
import com.tencent.p014mm.storage.C72996z1;
import d62.C75339i;
import dd0.C116607d;
import di3.C7335d;
import di3.C86312j;
import eb0.C31519v2;
import eb0.C75592q0;
import eb0.C97625j3;
import gy3.C87412m;
import j20.C117292a;
import java.util.LinkedList;
import java.util.List;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import ou0.C110066a;
import ou0.C110071c;
import p331dj.C107043a;
import p629ny.C76979h;
import p740wo.C53193b;
import pu0.C110248b;
import sx2.C118318d;
import sx2.C118322g;
import sx2.C13797p;
import te3.gf4;
import ux2.C118632c;
import ux2.C118633d;
import ux2.C118635f;
import ux2.C78307a;
import ux2.C78310e;
import ux2.C78311g;

/* renamed from: com.tencent.mm.plugin.talkroom.ui.TalkRoomUI */
public class TalkRoomUI extends MMBaseActivity implements C116607d, C11385n {

    /* renamed from: P */
    public static final /* synthetic */ int f347407P = 0;

    /* renamed from: A */
    public final MTimerHandler f347408A = new MTimerHandler(new C115812h(), true);

    /* renamed from: B */
    public AlphaAnimation f347409B;

    /* renamed from: C */
    public AlphaAnimation f347410C;

    /* renamed from: D */
    public AlphaAnimation f347411D;

    /* renamed from: E */
    public AlphaAnimation f347412E;

    /* renamed from: F */
    public float f347413F = -1.0f;

    /* renamed from: G */
    public float f347414G = -1.0f;

    /* renamed from: H */
    public float f347415H = -1.0f;

    /* renamed from: I */
    public boolean f347416I = false;

    /* renamed from: J */
    public long f347417J = 500;

    /* renamed from: K */
    public long f347418K = 0;

    /* renamed from: L */
    public MTimerHandler f347419L = new MTimerHandler(new C115806b(), false);

    /* renamed from: M */
    public MTimerHandler f347420M = new MTimerHandler(new C115810f(), false);

    /* renamed from: N */
    public int f347421N = 0;

    /* renamed from: e */
    public TextView f347422e;

    /* renamed from: f */
    public TextView f347423f;

    /* renamed from: g */
    public Chronometer f347424g;

    /* renamed from: h */
    public ImageButton f347425h;

    /* renamed from: i */
    public Button f347426i;

    /* renamed from: j */
    public ImageView f347427j;

    /* renamed from: n */
    public TextView f347428n;

    /* renamed from: o */
    public TalkRoomVolumeMeter f347429o;

    /* renamed from: p */
    public TalkRoomAvatarsFrame f347430p;

    /* renamed from: q */
    public PowerManager.WakeLock f347431q;

    /* renamed from: r */
    public boolean f347432r = true;

    /* renamed from: s */
    public String f347433s;

    /* renamed from: t */
    public String f347434t;

    /* renamed from: u */
    public List<String> f347435u = new LinkedList();

    /* renamed from: v */
    public int f347436v = 0;

    /* renamed from: w */
    public boolean f347437w = true;

    /* renamed from: x */
    public MTimerHandler f347438x = new MTimerHandler(new C115811g(), false);

    /* renamed from: y */
    public boolean f347439y = true;

    /* renamed from: z */
    public int f347440z = 0;

    /* renamed from: com.tencent.mm.plugin.talkroom.ui.TalkRoomUI$a */
    public class C115805a implements PlaySound.OnPlayCompletionListener {
        public C115805a(TalkRoomUI talkRoomUI) {
        }

        public void onCompletion() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.talkroom.ui.TalkRoomUI$b */
    public class C115806b implements MTimerHandler.CallBack {
        public C115806b() {
        }

        public boolean onTimerExpired() {
            Log.m105924i("MicroMsg.TalkRoomUI", "onSeizeMicSuccess expired to execute");
            TalkRoomUI talkRoomUI = TalkRoomUI.this;
            int i = TalkRoomUI.f347407P;
            talkRoomUI.mo176193L7();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.talkroom.ui.TalkRoomUI$c */
    public class C115807c implements PlaySound.OnPlayCompletionListener {
        public C115807c() {
        }

        public void onCompletion() {
            TalkRoomUI.this.f347438x.stopTimer();
            TalkRoomUI talkRoomUI = TalkRoomUI.this;
            if (talkRoomUI.f347436v == 5) {
                talkRoomUI.f347436v = 3;
                C118318d.yx0().mo183126s();
                talkRoomUI.f347408A.startTimer(100);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.talkroom.ui.TalkRoomUI$d */
    public class C115808d implements DialogInterface.OnClickListener {
        public C115808d() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            TalkRoomUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.talkroom.ui.TalkRoomUI$e */
    public class C115809e implements PlaySound.OnPlayCompletionListener {
        public C115809e(TalkRoomUI talkRoomUI) {
        }

        public void onCompletion() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.talkroom.ui.TalkRoomUI$f */
    public class C115810f implements MTimerHandler.CallBack {
        public C115810f() {
        }

        public boolean onTimerExpired() {
            TalkRoomUI talkRoomUI = TalkRoomUI.this;
            int i = TalkRoomUI.f347407P;
            talkRoomUI.mo176189H7();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.talkroom.ui.TalkRoomUI$g */
    public class C115811g implements MTimerHandler.CallBack {
        public C115811g() {
        }

        public boolean onTimerExpired() {
            Log.m105924i("MicroMsg.TalkRoomUI", "seizeMicTimer reach");
            TalkRoomUI talkRoomUI = TalkRoomUI.this;
            if (talkRoomUI.f347436v != 5) {
                return false;
            }
            talkRoomUI.f347436v = 3;
            C118318d.yx0().mo183126s();
            talkRoomUI.f347408A.startTimer(100);
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.talkroom.ui.TalkRoomUI$h */
    public class C115812h implements MTimerHandler.CallBack {
        public C115812h() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x004b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTimerExpired() {
            /*
                r7 = this;
                com.tencent.mm.plugin.talkroom.ui.TalkRoomUI r0 = com.tencent.p014mm.plugin.talkroom.p323ui.TalkRoomUI.this
                int r1 = r0.f347436v
                java.lang.String r2 = ""
                java.lang.String r3 = "MicroMsg.TalkRoomServer"
                r4 = 0
                r5 = 3
                if (r1 != r5) goto L_0x0023
                sx2.m r0 = sx2.C118318d.yx0()
                com.tencent.mm.plugin.talkroom.component.c r0 = r0.f353659u
                if (r0 != 0) goto L_0x0016
            L_0x0014:
                r0 = 0
                goto L_0x0046
            L_0x0016:
                int r0 = r0.mo176156R5()     // Catch:{ RemoteException -> 0x001c }
            L_0x001a:
                short r0 = (short) r0
                goto L_0x0046
            L_0x001c:
                r0 = move-exception
                java.lang.Object[] r1 = new java.lang.Object[r4]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r0, r2, r1)
                goto L_0x0014
            L_0x0023:
                java.lang.String r0 = r0.f347434t
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                if (r0 == 0) goto L_0x0031
                com.tencent.mm.plugin.talkroom.ui.TalkRoomUI r0 = com.tencent.p014mm.plugin.talkroom.p323ui.TalkRoomUI.this
                r0.mo176188G7()
                return r4
            L_0x0031:
                sx2.m r0 = sx2.C118318d.yx0()
                com.tencent.mm.plugin.talkroom.component.d r0 = r0.f353658t
                if (r0 != 0) goto L_0x003a
                goto L_0x0014
            L_0x003a:
                int r0 = r0.mo176164R5()     // Catch:{ RemoteException -> 0x003f }
                goto L_0x001a
            L_0x003f:
                r0 = move-exception
                java.lang.Object[] r1 = new java.lang.Object[r4]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r0, r2, r1)
                goto L_0x0014
            L_0x0046:
                r1 = 15
                r2 = 1
                if (r0 > r1) goto L_0x0061
                com.tencent.mm.plugin.talkroom.ui.TalkRoomUI r0 = com.tencent.p014mm.plugin.talkroom.p323ui.TalkRoomUI.this
                boolean r3 = r0.f347439y
                if (r3 == 0) goto L_0x0052
                goto L_0x0053
            L_0x0052:
                r1 = 0
            L_0x0053:
                int r5 = r0.f347440z
                int r5 = r5 + r2
                r0.f347440z = r5
                r6 = 5
                if (r5 < r6) goto L_0x0060
                r3 = r3 ^ r2
                r0.f347439y = r3
                r0.f347440z = r4
            L_0x0060:
                r0 = r1
            L_0x0061:
                com.tencent.mm.plugin.talkroom.ui.TalkRoomUI r1 = com.tencent.p014mm.plugin.talkroom.p323ui.TalkRoomUI.this
                r1.mo176188G7()
                com.tencent.mm.plugin.talkroom.ui.TalkRoomUI r1 = com.tencent.p014mm.plugin.talkroom.p323ui.TalkRoomUI.this
                com.tencent.mm.plugin.talkroom.ui.TalkRoomVolumeMeter r1 = r1.f347429o
                r1.setValue(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.talkroom.p323ui.TalkRoomUI.C115812h.onTimerExpired():boolean");
        }
    }

    /* renamed from: com.tencent.mm.plugin.talkroom.ui.TalkRoomUI$i */
    public abstract class C115813i {

        /* renamed from: a */
        public float f347447a;

        /* renamed from: b */
        public float f347448b;

        /* renamed from: c */
        public long f347449c;

        public C115813i(TalkRoomUI talkRoomUI, C115811g gVar) {
        }
    }

    /* renamed from: E7 */
    public static boolean m162871E7(TalkRoomUI talkRoomUI, MotionEvent motionEvent) {
        if (talkRoomUI.f347413F < 0.0f) {
            talkRoomUI.f347413F = (((float) talkRoomUI.f347425h.getWidth()) - (((float) talkRoomUI.f347425h.getPaddingLeft()) * 2.0f)) / 2.0f;
            talkRoomUI.f347414G = (((float) talkRoomUI.f347425h.getWidth()) * 1.0f) / 2.0f;
            talkRoomUI.f347415H = (((float) talkRoomUI.f347425h.getHeight()) * 1.0f) / 2.0f;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        float f = x - talkRoomUI.f347414G;
        float f2 = y - talkRoomUI.f347415H;
        return Math.sqrt((double) ((f * f) + (f2 * f2))) < ((double) talkRoomUI.f347413F);
    }

    /* renamed from: A5 */
    public void mo176184A5(String str, String str2) {
        Class cls = C75339i.class;
        Log.m105925i("MicroMsg.TalkRoomUI", "add %s,  del %s", str, str2);
        mo176195M7();
        if (!this.f347437w) {
            mo176190I7();
            if (!Util.isNullOrNil(str)) {
                mo176191J7(getString(C0966R.string.jt7, new Object[]{((C75339i) C86312j.m106911c(cls)).getDisplayName(str)}), C0966R.color.ag8);
                this.f347420M.startTimer(3000);
            }
            if (!Util.isNullOrNil(str2)) {
                mo176191J7(getString(C0966R.string.jtb, new Object[]{((C75339i) C86312j.m106911c(cls)).getDisplayName(str2)}), C0966R.color.ag8);
                this.f347420M.startTimer(3000);
            }
        }
    }

    /* renamed from: C2 */
    public void mo176185C2() {
        if (!this.f347432r) {
            Log.m105924i("MicroMsg.TalkRoomUI", "alertToFinish has exit, ignore ");
            return;
        }
        this.f347432r = false;
        finish();
    }

    /* renamed from: F5 */
    public void mo176186F5() {
        mo176189H7();
    }

    /* renamed from: F7 */
    public final void mo176187F7(String str) {
        if (!this.f347432r) {
            Log.m105924i("MicroMsg.TalkRoomUI", "alertToFinish has exit, ignore ");
            return;
        }
        this.f347432r = false;
        C118318d.yx0().mo183116i();
        if (Util.isNullOrNil(str)) {
            str = !NetStatusUtil.isConnected((Context) getApplication()) ? getString(C0966R.string.jth) : getString(C0966R.string.jtg);
        }
        if (!isFinishing()) {
            C76879j.m92749t(this, str, "", new C115808d());
        }
    }

    /* renamed from: G7 */
    public final void mo176188G7() {
        int i = this.f347436v;
        if (i == 3 || i == 5) {
            this.f347429o.setShowFlame(true);
        } else if (!Util.isNullOrNil(this.f347434t)) {
            this.f347429o.setShowFlame(true);
        } else {
            this.f347429o.setShowFlame(false);
        }
    }

    /* renamed from: H7 */
    public final void mo176189H7() {
        if (!this.f347437w) {
            if (C118318d.yx0().f353664z) {
                mo176192K7(getString(C0966R.string.jti), C0966R.color.ag9);
                this.f347430p.setCurMemeber((String) null);
                this.f347427j.setImageResource(C0966R.C0969drawable.bm9);
                mo176198O7();
                return;
            }
            int i = this.f347436v;
            if (i != 0) {
                if (i == 1) {
                    mo176192K7(getString(C0966R.string.jt6), C0966R.color.ag8);
                    this.f347427j.setImageResource(C0966R.C0969drawable.bmb);
                } else if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            mo176192K7(getString(C0966R.string.jto), C0966R.color.ag9);
                            this.f347427j.setImageResource(C0966R.C0969drawable.bma);
                            mo176198O7();
                            return;
                        } else if (i != 5) {
                            return;
                        }
                    }
                    mo176192K7(getString(C0966R.string.jtm), C0966R.color.ag8);
                    this.f347430p.setCurMemeber(C75592q0.m90789s());
                    this.f347427j.setImageResource(C0966R.C0969drawable.bm_);
                    mo176196N7(2);
                } else {
                    mo176192K7(getString(C0966R.string.jtl), C0966R.color.ag9);
                    this.f347427j.setImageResource(C0966R.C0969drawable.bma);
                }
            } else if (!Util.isNullOrNil(this.f347434t)) {
                mo176191J7(((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(this.f347434t), C0966R.color.ag8);
                this.f347430p.setCurMemeber(this.f347434t);
                this.f347427j.setImageResource(C0966R.C0969drawable.bm9);
                mo176196N7(1);
            } else {
                mo176192K7(C118318d.yx0().mo183118k().size() == 1 ? getString(C0966R.string.jtr) : "", C0966R.color.ag8);
                this.f347430p.setCurMemeber((String) null);
                this.f347427j.setImageResource(C0966R.C0969drawable.bm9);
                mo176198O7();
            }
        }
    }

    /* renamed from: I7 */
    public final void mo176190I7() {
        int size = C118318d.yx0().mo183118k().size();
        Log.m105925i("MicroMsg.TalkRoomUI", "displayCount %d", Integer.valueOf(size));
        this.f347423f.setText(String.valueOf(size));
    }

    /* renamed from: J7 */
    public final void mo176191J7(String str, int i) {
        mo176192K7(((C76979h) C86312j.m106911c(C76979h.class)).yp0(this, str, this.f347422e.getTextSize()), i);
    }

    /* renamed from: K7 */
    public final void mo176192K7(CharSequence charSequence, int i) {
        if (Util.isNullOrNil(charSequence.toString())) {
            this.f347422e.startAnimation(this.f347412E);
            return;
        }
        this.f347422e.setTextColor(getResources().getColor(i));
        this.f347422e.setText(charSequence);
        this.f347422e.startAnimation(this.f347411D);
    }

    /* renamed from: L7 */
    public final void mo176193L7() {
        if (this.f347436v == 5) {
            this.f347419L.stopTimer();
            mo176189H7();
            mo176188G7();
            PlaySound.play(MMApplicationContext.getContext(), (int) C0966R.string.jv5, (PlaySound.OnPlayCompletionListener) new C115807c());
            this.f347438x.startTimer(1000);
        }
    }

    /* renamed from: M6 */
    public void mo176194M6(int i) {
        Log.m105924i("MicroMsg.TalkRoomUI", "onSeizeMicFailed");
        if (i == 340) {
            if (this.f347436v == 3) {
                this.f347436v = 4;
            } else {
                return;
            }
        } else if (this.f347436v == 1) {
            this.f347436v = 2;
        } else {
            return;
        }
        mo176188G7();
        mo176189H7();
        PlaySound.play(MMApplicationContext.getContext(), C0966R.string.jva, true, new C115805a(this));
    }

    /* renamed from: M7 */
    public final void mo176195M7() {
        List<gf4> k = C118318d.yx0().mo183118k();
        LinkedList linkedList = new LinkedList();
        for (gf4 gf4 : k) {
            linkedList.add(gf4.f134027e);
        }
        this.f347430p.setMembersList(linkedList);
    }

    /* renamed from: N7 */
    public final void mo176196N7(int i) {
        if (i == 0 || this.f347421N != i) {
            this.f347424g.setVisibility(0);
            this.f347424g.startAnimation(this.f347409B);
            this.f347424g.setBase(Util.currentTicks());
            this.f347424g.start();
            this.f347421N = i;
        }
    }

    /* renamed from: O0 */
    public void mo176197O0(int i, int i2, String str) {
        Log.m105923f("MicroMsg.TalkRoomUI", "errType %d, errCode %d, errInfo %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        mo176187F7("");
    }

    /* renamed from: O7 */
    public final void mo176198O7() {
        if (this.f347421N != 0) {
            this.f347424g.stop();
            this.f347421N = 0;
            this.f347424g.startAnimation(this.f347410C);
        }
    }

    /* renamed from: S5 */
    public void mo176199S5() {
        Log.m105924i("MicroMsg.TalkRoomUI", "onSeizeMicSuccess");
        if (this.f347436v == 1) {
            this.f347436v = 5;
            if (Util.ticksToNow(this.f347418K) < this.f347417J) {
                Log.m105924i("MicroMsg.TalkRoomUI", "onSeizeMicSuccess waiting to execute");
                this.f347419L.startTimer(this.f347417J - Util.ticksToNow(this.f347418K));
                return;
            }
            mo176193L7();
        }
    }

    /* renamed from: U0 */
    public void mo176200U0(String str) {
    }

    /* renamed from: d0 */
    public void mo176201d0() {
        this.f347437w = false;
        this.f347425h.setEnabled(true);
        this.f347425h.setImageResource(C0966R.C0969drawable.bmc);
        this.f347426i.setVisibility(0);
        mo176189H7();
        mo176190I7();
        mo176195M7();
    }

    public void finish() {
        super.finish();
    }

    public void onCreate(Bundle bundle) {
        Log.m105918d("MicroMsg.TalkRoomUI", "onCreate");
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("enter_room_username");
        Log.m105925i("MicroMsg.TalkRoomUI", "onCreate talkRoomName : %s", stringExtra);
        Log.m105919d("MicroMsg.TalkRoomUI", "talkRoomName %s ", stringExtra);
        this.f347433s = stringExtra;
        if (Util.isNullOrNil(stringExtra)) {
            mo176187F7("");
        } else {
            if (C72996z1.m85820U5(stringExtra)) {
                List<String> k5 = ((C53193b) C86312j.m106911c(C53193b.class)).mo73727k5(stringExtra);
                if (k5 == null) {
                    C31519v2.m39436a().mo55987c(stringExtra, "");
                } else {
                    this.f347435u = k5;
                }
            } else {
                this.f347435u.clear();
                this.f347435u.add(stringExtra);
                this.f347435u.add(C75592q0.m90789s());
            }
            new MMHandler(Looper.getMainLooper()).post(new C118632c(this, stringExtra));
        }
        Log.m105918d("MicroMsg.TalkRoomUI", "onCreate before initView");
        setContentView(C85868k2.m106137b(MMApplicationContext.getContext()).inflate(C0966R.C0971layout.f360030c83, (ViewGroup) null));
        this.f347431q = ((PowerManager) getSystemService("power")).newWakeLock(26, "TalkRoomUI Lock");
        this.f347428n = (TextView) findViewById(C0966R.C0970id.kpm);
        this.f347422e = (TextView) findViewById(C0966R.C0970id.gtd);
        this.f347423f = (TextView) findViewById(C0966R.C0970id.btz);
        this.f347426i = (Button) findViewById(C0966R.C0970id.f6r);
        this.f347424g = (Chronometer) findViewById(C0966R.C0970id.bcw);
        this.f347427j = (ImageView) findViewById(C0966R.C0970id.fmg);
        new C78307a(this);
        this.f347426i.setOnClickListener(new C118633d(this));
        findViewById(C0966R.C0970id.l0f).setOnClickListener(new C78310e(this));
        ImageButton imageButton = (ImageButton) findViewById(C0966R.C0970id.gtc);
        this.f347425h = imageButton;
        imageButton.setEnabled(false);
        this.f347425h.setImageResource(C0966R.C0969drawable.bme);
        this.f347425h.setOnTouchListener(new C118635f(this));
        this.f347429o = (TalkRoomVolumeMeter) findViewById(C0966R.C0970id.ldx);
        findViewById(C0966R.C0970id.kt5).setOnTouchListener(new C115815c(this, new C115814b(this)));
        this.f347430p = (TalkRoomAvatarsFrame) findViewById(C0966R.C0970id.f357479a22);
        this.f347428n.setOnClickListener(new C78311g(this));
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        this.f347409B = alphaAnimation;
        alphaAnimation.setDuration(300);
        this.f347409B.setFillAfter(true);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        this.f347410C = alphaAnimation2;
        alphaAnimation2.setDuration(300);
        this.f347410C.setFillAfter(true);
        AlphaAnimation alphaAnimation3 = new AlphaAnimation(0.0f, 1.0f);
        this.f347411D = alphaAnimation3;
        alphaAnimation3.setDuration(300);
        this.f347411D.setFillAfter(true);
        AlphaAnimation alphaAnimation4 = new AlphaAnimation(1.0f, 0.0f);
        this.f347412E = alphaAnimation4;
        alphaAnimation4.setDuration(300);
        this.f347412E.setFillAfter(true);
        C97625j3.m125815e().mo123455a(364, this);
        Log.m105918d("MicroMsg.TalkRoomUI", "onCreate before getServer");
        C118318d.yx0().mo183110a(this);
        Log.m105918d("MicroMsg.TalkRoomUI", "onCreate end");
    }

    public void onDestroy() {
        C118318d.yx0().mo183125r(this);
        C97625j3.m125815e().mo123470p(364, this);
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        Class cls = C110248b.class;
        if (i == 25) {
            C7335d c = C86312j.m106911c(cls);
            C87412m.m108593f(c, "getService(SubCoreAudio::class.java)");
            C110066a aVar = ((C110248b) c).f329779e;
            if (aVar == null) {
                aVar = new C110071c();
                C7335d c2 = C86312j.m106911c(cls);
                C87412m.m108593f(c2, "getService(SubCoreAudio::class.java)");
                ((C110248b) c2).f329781g[0] = "music";
            }
            C107043a.m144903a(aVar.f329358h, 3, -1, 5);
            return true;
        } else if (i != 24) {
            return super.onKeyDown(i, keyEvent);
        } else {
            C7335d c3 = C86312j.m106911c(cls);
            C87412m.m108593f(c3, "getService(SubCoreAudio::class.java)");
            C110066a aVar2 = ((C110248b) c3).f329779e;
            if (aVar2 == null) {
                aVar2 = new C110071c();
                C7335d c4 = C86312j.m106911c(cls);
                C87412m.m108593f(c4, "getService(SubCoreAudio::class.java)");
                ((C110248b) c4).f329781g[0] = "music";
            }
            C107043a.m144903a(aVar2.f329358h, 3, 1, 5);
            return true;
        }
    }

    public void onPause() {
        super.onPause();
        sendBroadcast(new Intent("com.tencent.mm.ui.ACTION_DEACTIVE").putExtra("classname", getClass().getName()), WeChatPermissions.PERMISSION_MM_MESSAGE());
        PowerManager.WakeLock wakeLock = this.f347431q;
        PowerManager.WakeLock wakeLock2 = wakeLock;
        C117292a.m165357c(wakeLock2, "com/tencent/mm/plugin/talkroom/ui/TalkRoomUI", "onPause", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
        wakeLock.release();
        C117292a.m165359e(wakeLock2, "com/tencent/mm/plugin/talkroom/ui/TalkRoomUI", "onPause", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
        this.f347408A.stopTimer();
        C118318d.wx0().f353609f = false;
        C118318d.wx0().getClass();
        C118322g wx02 = C118318d.wx0();
        if (wx02.f353608e) {
            wx02.mo183106c(MMApplicationContext.getContext().getString(C0966R.string.jtj));
        } else if (!Util.isNullOrNil(wx02.f353607d)) {
            String string = MMApplicationContext.getContext().getString(C0966R.string.jtp, new Object[]{((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(wx02.f353607d)});
            wx02.mo183105b();
            wx02.mo183106c(string);
        } else {
            wx02.mo183106c(C13797p.m13101a(MMApplicationContext.getContext(), C118318d.yx0().f353649h));
        }
        PauseAutoGetBigImgEvent pauseAutoGetBigImgEvent = new PauseAutoGetBigImgEvent();
        pauseAutoGetBigImgEvent.f264980d.f264981a = false;
        pauseAutoGetBigImgEvent.asyncPublish(getMainLooper());
        Log.m105918d("MicroMsg.TalkRoomUI", "TalkRoom cancel pause auto download logic");
    }

    public void onResume() {
        super.onResume();
        sendBroadcast(new Intent("com.tencent.mm.ui.ACTION_ACTIVE").putExtra("isTalkroom", true).putExtra("classname", getClass().getName()), WeChatPermissions.PERMISSION_MM_MESSAGE());
        PowerManager.WakeLock wakeLock = this.f347431q;
        PowerManager.WakeLock wakeLock2 = wakeLock;
        C117292a.m165357c(wakeLock2, "com/tencent/mm/plugin/talkroom/ui/TalkRoomUI", "onResume", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
        wakeLock.acquire();
        C117292a.m165359e(wakeLock2, "com/tencent/mm/plugin/talkroom/ui/TalkRoomUI", "onResume", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
        this.f347428n.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(this, C13797p.m13101a(this, this.f347433s), this.f347428n.getTextSize()));
        C118318d.wx0().f353609f = true;
        C118318d.wx0().getClass();
        Log.m105926v("MicroMsg.TalkRoomDisplayMgr", "yy dismissStatusBar");
        C118318d.wx0().mo183105b();
        PauseAutoGetBigImgEvent pauseAutoGetBigImgEvent = new PauseAutoGetBigImgEvent();
        pauseAutoGetBigImgEvent.f264980d.f264981a = true;
        pauseAutoGetBigImgEvent.asyncPublish(getMainLooper());
        Log.m105918d("MicroMsg.TalkRoomUI", "TalkRoom req pause auto download logic");
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        yVar.getType();
    }

    /* renamed from: q1 */
    public void mo176203q1(String str, int i, int i2) {
        String str2;
        Log.m105923f("MicroMsg.TalkRoomUI", "onInitFailed %s", str);
        if (i != 4) {
            str2 = "";
        } else if (i2 != -1) {
            this.f347432r = false;
            finish();
            return;
        } else {
            str2 = getString(C0966R.string.jtg);
        }
        mo176187F7(str2);
    }

    /* renamed from: r0 */
    public void mo176204r0() {
        mo176192K7(getString(C0966R.string.jtk), C0966R.color.ag9);
    }

    /* renamed from: v1 */
    public void mo176205v1() {
        mo176189H7();
    }

    /* renamed from: z3 */
    public void mo176206z3(String str) {
        Log.m105919d("MicroMsg.TalkRoomUI", "onCurMember %s", str);
        this.f347434t = str;
        mo176188G7();
        mo176189H7();
        if (!Util.isNullOrNil(str)) {
            PlaySound.play(MMApplicationContext.getContext(), (int) C0966R.string.jv8, (PlaySound.OnPlayCompletionListener) new C115809e(this));
            this.f347408A.startTimer(100);
            return;
        }
        this.f347408A.stopTimer();
    }
}
