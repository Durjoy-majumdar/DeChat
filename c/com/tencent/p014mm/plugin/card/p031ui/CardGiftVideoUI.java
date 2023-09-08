package com.tencent.p014mm.plugin.card.p031ui;

import a70.C112760b;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.booter.C92614a;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.tools.C45059m0;
import com.tencent.p014mm.p136ui.tools.C45082x0;
import com.tencent.p014mm.p136ui.widget.MMPinProgressBtn;
import com.tencent.p014mm.plugin.card.model.CardGiftInfo;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96875r0;
import com.tencent.p014mm.pluginsdk.p133ui.tools.VideoTextureView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.system.AndroidMediaUtil;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import gc0.C20828a;
import hc0.C20937c;
import hz0.C76251l;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C11184p0;
import nj3.C88989a;
import p140cw.C7138g;
import p159gw.C98250h;
import p910lj.C76701a;
import wz0.C78740a;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.card.ui.CardGiftVideoUI */
public class CardGiftVideoUI extends MMActivity implements C96875r0.C96876a, C78740a.C78742b {

    /* renamed from: A */
    public MTimerHandler f267745A = new MTimerHandler(new C92967i(), true);

    /* renamed from: B */
    public int f267746B = 0;

    /* renamed from: d */
    public CardGiftInfo f267747d;

    /* renamed from: e */
    public boolean f267748e;

    /* renamed from: f */
    public String f267749f;

    /* renamed from: g */
    public RelativeLayout f267750g;

    /* renamed from: h */
    public ImageView f267751h;

    /* renamed from: i */
    public C96875r0 f267752i;

    /* renamed from: j */
    public RelativeLayout f267753j;

    /* renamed from: n */
    public ImageView f267754n;

    /* renamed from: o */
    public TextView f267755o;

    /* renamed from: p */
    public ProgressBar f267756p;

    /* renamed from: q */
    public MMPinProgressBtn f267757q;

    /* renamed from: r */
    public MMHandler f267758r = new MMHandler(Looper.getMainLooper());

    /* renamed from: s */
    public Bundle f267759s;

    /* renamed from: t */
    public boolean f267760t = false;

    /* renamed from: u */
    public C45059m0 f267761u;

    /* renamed from: v */
    public int f267762v = 0;

    /* renamed from: w */
    public int f267763w = 0;

    /* renamed from: x */
    public int f267764x = 0;

    /* renamed from: y */
    public int f267765y = 0;

    /* renamed from: z */
    public C45082x0 f267766z;

    /* renamed from: com.tencent.mm.plugin.card.ui.CardGiftVideoUI$b */
    public class C2152b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f12127d;

        public C2152b(String str) {
            this.f12127d = str;
        }

        public void run() {
            CardGiftVideoUI.this.f267754n.setVisibility(8);
            CardGiftVideoUI cardGiftVideoUI = CardGiftVideoUI.this;
            String str = this.f12127d;
            cardGiftVideoUI.f267749f = str;
            cardGiftVideoUI.mo127378H7(str);
            CardGiftVideoUI.this.mo127379I7();
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.CardGiftVideoUI$c */
    public class C2153c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f12129d;

        public C2153c(String str) {
            this.f12129d = str;
        }

        public void run() {
            if (Util.isNullOrNil(CardGiftVideoUI.this.f267749f)) {
                CardGiftVideoUI.this.f267754n.setVisibility(0);
                C20937c.C20939b bVar = new C20937c.C20939b();
                bVar.f59351g = C112760b.m154195C();
                bVar.f59350f = C76251l.m91644m(this.f12129d);
                bVar.f59353i = 1;
                bVar.f59346b = true;
                bVar.f59345a = true;
                C20828a.m22825b().mo32519h(this.f12129d, CardGiftVideoUI.this.f267754n, bVar.mo32666a());
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.CardGiftVideoUI$d */
    public class C2154d implements View.OnCreateContextMenuListener {
        public C2154d() {
        }

        public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            contextMenu.add(0, 0, 0, CardGiftVideoUI.this.getString(C0966R.string.azj));
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.CardGiftVideoUI$e */
    public class C2155e implements C11184p0 {

        /* renamed from: com.tencent.mm.plugin.card.ui.CardGiftVideoUI$e$a */
        public class C2156a implements C98250h.C98251a {
            public C2156a() {
            }

            /* renamed from: a */
            public void mo2055a(String str, String str2) {
                C76701a.makeText((Context) CardGiftVideoUI.this.getContext(), (CharSequence) CardGiftVideoUI.this.getContext().getString(C0966R.string.kah, new Object[]{AndroidMediaUtil.getFriendlySdcardPath(str2)}), 1).show();
                ((C7138g) C86312j.m106911c(C7138g.class)).mo8315Wr(str2, CardGiftVideoUI.this.getContext());
            }

            /* renamed from: b */
            public void mo2056b(String str, String str2) {
                C76701a.makeText((Context) CardGiftVideoUI.this.getContext(), (CharSequence) CardGiftVideoUI.this.getContext().getString(C0966R.string.kag), 1).show();
            }
        }

        public C2155e() {
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            if (menuItem.getItemId() == 0) {
                ((C98250h) C86312j.m106911c(C98250h.class)).mo137342Lm(CardGiftVideoUI.this.getContext(), CardGiftVideoUI.this.f267749f, new C2156a());
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.CardGiftVideoUI$a */
    public class C92962a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f267767d;

        /* renamed from: e */
        public final /* synthetic */ int f267768e;

        public C92962a(int i, int i2) {
            this.f267767d = i;
            this.f267768e = i2;
        }

        public void run() {
            MMPinProgressBtn mMPinProgressBtn = CardGiftVideoUI.this.f267757q;
            if (mMPinProgressBtn == null) {
                return;
            }
            if (this.f267767d == 0) {
                mMPinProgressBtn.setVisibility(8);
                return;
            }
            if (mMPinProgressBtn.getVisibility() != 0) {
                CardGiftVideoUI.this.f267757q.setVisibility(0);
            }
            Log.m105925i("MicroMsg.CardGiftVideoUI", "update progress %d %d", Integer.valueOf(this.f267768e), Integer.valueOf(this.f267767d));
            int max = CardGiftVideoUI.this.f267757q.getMax();
            int i = this.f267767d;
            if (max != i && i > 0) {
                CardGiftVideoUI.this.f267757q.setMax(i);
            }
            CardGiftVideoUI.this.f267757q.setProgress(this.f267768e);
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.CardGiftVideoUI$f */
    public class C92963f implements View.OnTouchListener {
        public C92963f() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/card/ui/CardGiftVideoUI$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            CardGiftVideoUI.this.mo127380J7();
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/card/ui/CardGiftVideoUI$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.CardGiftVideoUI$g */
    public class C92964g implements View.OnClickListener {
        public C92964g() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/card/ui/CardGiftVideoUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            CardGiftVideoUI.this.mo127380J7();
            C117292a.m165361g(this, "com/tencent/mm/plugin/card/ui/CardGiftVideoUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.CardGiftVideoUI$h */
    public class C92965h implements C45059m0.C45068i {

        /* renamed from: com.tencent.mm.plugin.card.ui.CardGiftVideoUI$h$a */
        public class C92966a implements Runnable {
            public C92966a() {
            }

            public void run() {
                CardGiftVideoUI.this.finish();
                CardGiftVideoUI.this.overridePendingTransition(0, 0);
            }
        }

        public C92965h() {
        }

        public void onAnimationEnd() {
            new MMHandler().post(new C92966a());
        }

        public void onAnimationStart() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.CardGiftVideoUI$i */
    public class C92967i implements MTimerHandler.CallBack {
        public C92967i() {
        }

        public boolean onTimerExpired() {
            int i;
            if (!((VideoTextureView) CardGiftVideoUI.this.f267752i).isPlaying()) {
                return true;
            }
            CardGiftVideoUI cardGiftVideoUI = CardGiftVideoUI.this;
            int currentPosition = cardGiftVideoUI.f267752i.getCurrentPosition() / 1000;
            TextView textView = cardGiftVideoUI.f267755o;
            if (textView == null || (i = cardGiftVideoUI.f267746B) <= 0) {
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

    /* renamed from: H7 */
    public final void mo127378H7(String str) {
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.CardGiftVideoUI", "the videoPath is null, fail~!!!");
            setResult(0);
            finish();
        } else if (!C86013q1.m106450k(str)) {
            Log.m105921e("MicroMsg.CardGiftVideoUI", "the videoPath is %s, the file isn't exist~!!!", str);
            setResult(0);
            finish();
        } else {
            this.f267752i.setVideoPath(str);
        }
    }

    /* renamed from: I7 */
    public final void mo127379I7() {
        if (this.f267766z == null) {
            this.f267766z = new C45082x0(getContext());
        }
        if (Util.isNullOrNil(this.f267749f)) {
            Log.m105920e("MicroMsg.CardGiftVideoUI", "videoPath is null");
        } else {
            this.f267766z.mo70438d((VideoTextureView) this.f267752i, new C2154d(), new C2155e());
        }
    }

    /* renamed from: J6 */
    public void mo23387J6(String str) {
    }

    /* renamed from: J7 */
    public void mo127380J7() {
        this.f267761u.mo70410e(this.f267763w, this.f267762v, this.f267764x, this.f267765y);
        this.f267761u.mo70409d(this.f267750g, this.f267751h, new C92965h(), (C45059m0.C45066g) null);
    }

    /* renamed from: M0 */
    public int mo76207M0(int i, int i2) {
        return 0;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 0) {
            return super.dispatchKeyEvent(keyEvent);
        }
        Log.m105918d("MicroMsg.CardGiftVideoUI", "dispatchKeyEvent");
        mo127380J7();
        return true;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6718mn;
    }

    public void initView() {
        this.f267750g = (RelativeLayout) findViewById(C0966R.C0970id.l7w);
        this.f267753j = (RelativeLayout) findViewById(C0966R.C0970id.l7c);
        this.f267754n = (ImageView) findViewById(C0966R.C0970id.l7k);
        this.f267755o = (TextView) findViewById(C0966R.C0970id.l5j);
        this.f267757q = (MMPinProgressBtn) findViewById(C0966R.C0970id.f359492l70);
        this.f267756p = (ProgressBar) findViewById(C0966R.C0970id.l6a);
        TextView textView = (TextView) findViewById(C0966R.C0970id.l7q);
        this.f267752i = new VideoTextureView(this, (AttributeSet) null);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        this.f267752i.setMute(this.f267748e);
        this.f267752i.setVideoCallback(this);
        this.f267753j.addView((View) this.f267752i, layoutParams);
        this.f267751h = (ImageView) findViewById(C0966R.C0970id.ehi);
        this.f267750g.setOnTouchListener(new C92963f());
        ((View) this.f267752i).setOnClickListener(new C92964g());
        this.f267761u = new C45059m0(this);
    }

    /* renamed from: j5 */
    public void mo23388j5(String str, String str2) {
        if (str.equals(this.f267747d.f51583i)) {
            this.f267758r.post(new C2152b(str2));
        } else if (str.equals(this.f267747d.f51584j)) {
            this.f267758r.post(new C2153c(str2));
        } else {
            Log.m105925i("MicroMsg.CardGiftVideoUI", "fieldId:%s is unsuitable", str);
        }
    }

    public void onCompletion() {
        Log.m105925i("MicroMsg.CardGiftVideoUI", "%d on completion", Integer.valueOf(hashCode()));
        ((VideoTextureView) this.f267752i).mo24788d(0.0d);
    }

    public void onCreate(Bundle bundle) {
        if (getIntent().getExtras() != null) {
            getIntent().getExtras().setClassLoader(getClass().getClassLoader());
        }
        super.onCreate(bundle);
        hideTitleView();
        this.f267759s = bundle;
        getWindow().setFlags(1024, 1024);
        if (C92614a.m116679d() != null) {
            C92614a.m116679d().mo126634a();
        }
        this.f267747d = (CardGiftInfo) getIntent().getParcelableExtra("key_gift_into");
        this.f267749f = getIntent().getStringExtra("key_video_path");
        this.f267748e = getIntent().getBooleanExtra("key_is_mute", false);
        Object[] objArr = new Object[1];
        CardGiftInfo cardGiftInfo = this.f267747d;
        objArr[0] = cardGiftInfo == null ? "null" : cardGiftInfo.toString();
        Log.m105919d("MicroMsg.CardGiftVideoUI", "cardGiftInfo %s", objArr);
        Log.m105919d("MicroMsg.CardGiftVideoUI", "videoPath:%s, isMute:%b", this.f267749f, Boolean.valueOf(this.f267748e));
        initView();
        C78740a.m95080b(this);
        mo127379I7();
        CardGiftInfo cardGiftInfo2 = this.f267747d;
        if (cardGiftInfo2 == null) {
            Log.m105920e("MicroMsg.CardGiftVideoUI", "cardGiftInfo is null");
        } else if (!Util.isNullOrNil(cardGiftInfo2.f51583i)) {
            CardGiftInfo cardGiftInfo3 = this.f267747d;
            C78740a.m95079a(cardGiftInfo3.f51584j, cardGiftInfo3.f51587p, cardGiftInfo3.f51599z, 2);
            CardGiftInfo cardGiftInfo4 = this.f267747d;
            C78740a.m95079a(cardGiftInfo4.f51583i, cardGiftInfo4.f51586o, cardGiftInfo4.f51598y, 1);
        } else {
            Log.m105920e("MicroMsg.CardGiftVideoUI", "fromUserContentVideoUrl is null");
        }
    }

    public void onDestroy() {
        ((VideoTextureView) this.f267752i).stop();
        this.f267745A.stopTimer();
        C78740a.m95081c(this);
        super.onDestroy();
    }

    public void onError(int i, int i2) {
        setResult(0);
        ((VideoTextureView) this.f267752i).stop();
        Log.m105921e("MicroMsg.CardGiftVideoUI", "%d on play video error what %d extra %d.", Integer.valueOf(hashCode()), Integer.valueOf(i), Integer.valueOf(i2));
    }

    public void onPause() {
        ((VideoTextureView) this.f267752i).pause();
        super.onPause();
    }

    public void onPrepared() {
        setResult(-1);
        this.f267758r.post(new C2160o(this, true));
        this.f267758r.post(new C92972p(this));
        ((VideoTextureView) this.f267752i).start();
        this.f267746B = this.f267752i.getDuration() / 1000;
        this.f267745A.startTimer(500);
        Log.m105925i("MicroMsg.CardGiftVideoUI", "onPrepared videoView.start duration:%d", Integer.valueOf(this.f267746B));
    }

    public void onResume() {
        if (!Util.isNullOrNil(this.f267749f)) {
            mo127378H7(this.f267749f);
        }
        super.onResume();
    }

    public void onStart() {
        Bundle bundle = this.f267759s;
        if (!this.f267760t) {
            this.f267760t = true;
            this.f267762v = getIntent().getIntExtra("img_top", 0);
            this.f267763w = getIntent().getIntExtra("img_left", 0);
            this.f267764x = getIntent().getIntExtra("img_width", 0);
            int intExtra = getIntent().getIntExtra("img_height", 0);
            this.f267765y = intExtra;
            this.f267761u.mo70410e(this.f267763w, this.f267762v, this.f267764x, intExtra);
            if (bundle == null) {
                this.f267750g.getViewTreeObserver().addOnPreDrawListener(new C92971n(this));
            }
        }
        super.onStart();
    }

    /* renamed from: p3 */
    public void mo76226p3(int i, int i2) {
    }

    /* renamed from: q5 */
    public void mo23389q5(String str, int i, int i2) {
        if (str.equals(this.f267747d.f51583i)) {
            this.f267758r.post(new C92962a(i2, i));
        }
    }
}
