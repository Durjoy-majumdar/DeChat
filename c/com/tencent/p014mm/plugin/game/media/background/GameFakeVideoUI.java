package com.tencent.p014mm.plugin.game.media.background;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import aw0.C103928o;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.booter.C92614a;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.tools.C45059m0;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96875r0;
import com.tencent.p014mm.pluginsdk.p133ui.tools.VideoPlayerTextureView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import my1.C100026b;
import nj3.C88989a;
import p232rw.C101476o;
import p232rw.C48089i;
import p749xh.C102652h9;
import te3.C101773e70;
import wh2.C102445a;
import zg2.C53790e;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.game.media.background.GameFakeVideoUI */
public class GameFakeVideoUI extends MMActivity implements C96875r0.C96876a {

    /* renamed from: d */
    public RelativeLayout f271801d;

    /* renamed from: e */
    public C96875r0 f271802e;

    /* renamed from: f */
    public ImageView f271803f;

    /* renamed from: g */
    public RelativeLayout f271804g;

    /* renamed from: h */
    public TextView f271805h;

    /* renamed from: i */
    public String f271806i;

    /* renamed from: j */
    public C45059m0 f271807j;

    /* renamed from: n */
    public C102445a f271808n;

    /* renamed from: o */
    public long f271809o;

    /* renamed from: p */
    public long f271810p;

    /* renamed from: q */
    public MTimerHandler f271811q = new MTimerHandler(new C94115b(), true);

    /* renamed from: r */
    public int f271812r = 0;

    /* renamed from: com.tencent.mm.plugin.game.media.background.GameFakeVideoUI$a */
    public class C94114a implements View.OnTouchListener {
        public C94114a() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/game/media/background/GameFakeVideoUI$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            GameFakeVideoUI gameFakeVideoUI = GameFakeVideoUI.this;
            gameFakeVideoUI.f271807j.mo70409d(gameFakeVideoUI.f271801d, gameFakeVideoUI.f271803f, new C100026b(gameFakeVideoUI), (C45059m0.C45066g) null);
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/game/media/background/GameFakeVideoUI$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.media.background.GameFakeVideoUI$b */
    public class C94115b implements MTimerHandler.CallBack {
        public C94115b() {
        }

        public boolean onTimerExpired() {
            int i;
            if (!((VideoPlayerTextureView) GameFakeVideoUI.this.f271802e).isPlaying()) {
                return true;
            }
            GameFakeVideoUI gameFakeVideoUI = GameFakeVideoUI.this;
            int currentPosition = ((int) (((long) gameFakeVideoUI.f271802e.getCurrentPosition()) - GameFakeVideoUI.this.f271809o)) / 1000;
            TextView textView = gameFakeVideoUI.f271805h;
            if (textView == null || (i = gameFakeVideoUI.f271812r) <= 0) {
                return true;
            }
            int i2 = i - currentPosition;
            if (i2 < 0) {
                i2 = 0;
            }
            textView.setText(i2 + FastJsonResponse.QUOTE);
            return true;
        }
    }

    /* renamed from: M0 */
    public int mo76207M0(int i, int i2) {
        if (((VideoPlayerTextureView) this.f271802e).isPlaying()) {
            long j = this.f271810p;
            if (((long) this.f271802e.getCurrentPosition()) >= j && j < ((long) this.f271802e.getDuration())) {
                Log.m105925i("MicroMsg.Haowan.GameFakeVideoUI", "currentPosition:%d reach endTime:%d, seekTo startTime:%d", Integer.valueOf(this.f271802e.getCurrentPosition()), Long.valueOf(this.f271810p), Long.valueOf(this.f271809o));
                ((VideoPlayerTextureView) this.f271802e).mo24787a((double) this.f271809o, true);
            }
        }
        return 0;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.avy;
    }

    public void onCompletion() {
        Log.m105925i("MicroMsg.Haowan.GameFakeVideoUI", "on completion, startTime:%d", Long.valueOf(this.f271809o));
        ((VideoPlayerTextureView) this.f271802e).mo24787a((double) this.f271809o, true);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        hideTitleView();
        getWindow().setFlags(1024, 1024);
        if (C92614a.m116679d() != null) {
            C92614a.m116679d().mo126634a();
        }
        this.f271801d = (RelativeLayout) findViewById(C0966R.C0970id.l7w);
        this.f271803f = (ImageView) findViewById(C0966R.C0970id.ehi);
        this.f271804g = (RelativeLayout) findViewById(C0966R.C0970id.l7c);
        this.f271805h = (TextView) findViewById(C0966R.C0970id.l5j);
        GameFakeVideoView gameFakeVideoView = new GameFakeVideoView(this);
        this.f271802e = gameFakeVideoView;
        gameFakeVideoView.setVideoCallback(this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        this.f271804g.addView((View) this.f271802e, layoutParams);
        String stringExtra = getIntent().getStringExtra("game_bg_mix_fake_local_id");
        if (stringExtra == null || !stringExtra.startsWith("weixin://bgmixid/")) {
            setResult(101);
            finish();
            return;
        }
        String replace = stringExtra.replace("weixin://bgmixid/", "");
        Log.m105925i("MicroMsg.Haowan.GameFakeVideoUI", "bgMixTaskId:%s", replace);
        C53790e Ie = ((C101476o) C86312j.m106911c(C101476o.class)).mo140776Ie(replace);
        if (Ie == null || Ie.mo74365p0() == null) {
            setResult(102);
            finish();
            return;
        }
        String str = Ie.mo74365p0().f298298n;
        this.f271806i = str;
        Log.m105925i("MicroMsg.Haowan.GameFakeVideoUI", "videoPath:%s", str);
        C101773e70 X = Ie.mo74362X();
        this.f271809o = X.f298159e;
        this.f271810p = X.f298160f;
        C102445a n7 = ((C48089i) C86312j.m106911c(C48089i.class)).mo72634n7(this);
        this.f271808n = n7;
        this.f271804g.addView((View) n7, new ViewGroup.LayoutParams(-1, -1));
        this.f271808n.setFakeVideoInfo((C102652h9) Ie);
        this.f271802e.setMute(this.f271808n.mo129893d());
        this.f271804g.setOnTouchListener(new C94114a());
        this.f271807j = new C45059m0(this);
    }

    public void onDestroy() {
        ((VideoPlayerTextureView) this.f271802e).stop();
        this.f271808n.mo129891b();
        this.f271811q.stopTimer();
        super.onDestroy();
    }

    public void onError(int i, int i2) {
        setResult(0);
        ((VideoPlayerTextureView) this.f271802e).stop();
        Log.m105921e("MicroMsg.Haowan.GameFakeVideoUI", "play video error what %d extra %d.", Integer.valueOf(i), Integer.valueOf(i2));
    }

    public void onPause() {
        ((VideoPlayerTextureView) this.f271802e).pause();
        this.f271808n.mo129892c();
        super.onPause();
        C96875r0 r0Var = this.f271802e;
        if (r0Var instanceof GameFakeVideoView) {
            ((GameFakeVideoView) r0Var).setKeepScreenOn(false);
        }
        C103928o.m138642b();
    }

    public void onPrepared() {
        setResult(-1);
        ((VideoPlayerTextureView) this.f271802e).start();
        this.f271812r = ((int) (this.f271810p - this.f271809o)) / 1000;
        this.f271811q.startTimer(500);
        ((VideoPlayerTextureView) this.f271802e).mo24787a((double) this.f271809o, true);
        Log.m105925i("MicroMsg.Haowan.GameFakeVideoUI", "onPrepared videoView.start duration:%d", Integer.valueOf(this.f271812r));
    }

    public void onResume() {
        if (!Util.isNullOrNil(this.f271806i)) {
            String str = this.f271806i;
            if (Util.isNullOrNil(str)) {
                Log.m105920e("MicroMsg.Haowan.GameFakeVideoUI", "the videoPath is null, fail~!!!");
                setResult(0);
                finish();
            } else if (!C86013q1.m106450k(str)) {
                Log.m105921e("MicroMsg.Haowan.GameFakeVideoUI", "the videoPath is %s, the file isn't exist~!!!", str);
                setResult(0);
                finish();
            } else {
                this.f271802e.setVideoPath(str);
                this.f271808n.mo129890a(false);
            }
        }
        super.onResume();
        C96875r0 r0Var = this.f271802e;
        if (r0Var instanceof GameFakeVideoView) {
            ((GameFakeVideoView) r0Var).setKeepScreenOn(true);
        }
        C103928o.m138641a(true, true, true);
    }

    /* renamed from: p3 */
    public void mo76226p3(int i, int i2) {
    }
}
