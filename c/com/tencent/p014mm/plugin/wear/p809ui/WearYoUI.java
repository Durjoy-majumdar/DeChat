package com.tencent.p014mm.plugin.wear.p809ui;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.LogoutEvent;
import com.tencent.p014mm.autogen.events.WearYoEvent;
import com.tencent.p014mm.hellhoundlib.activities.HellActivity;
import com.tencent.p014mm.plugin.wear.model.C43457b;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import d62.C75339i;
import di3.C86312j;
import eb0.C97625j3;
import j20.C117292a;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import ke3.C88144b;
import m73.C46950b;
import p196ln.C76705f;
import p73.C110188a;

/* renamed from: com.tencent.mm.plugin.wear.ui.WearYoUI */
public class WearYoUI extends HellActivity {

    /* renamed from: d */
    public ImageView f318410d;

    /* renamed from: e */
    public TextView f318411e;

    /* renamed from: f */
    public String f318412f;

    /* renamed from: g */
    public ImageView f318413g;

    /* renamed from: h */
    public ImageView f318414h;

    /* renamed from: i */
    public ImageView f318415i;

    /* renamed from: j */
    public Vibrator f318416j;

    /* renamed from: n */
    public ObjectAnimator[][] f318417n = ((ObjectAnimator[][]) Array.newInstance(ObjectAnimator.class, new int[]{3, 3}));

    /* renamed from: o */
    public IListener f318418o;

    /* renamed from: p */
    public boolean f318419p;

    /* renamed from: q */
    public AtomicInteger f318420q;

    /* renamed from: r */
    public Runnable f318421r;

    /* renamed from: s */
    public BroadcastReceiver f318422s;

    /* renamed from: t */
    public IListener f318423t;

    /* renamed from: com.tencent.mm.plugin.wear.ui.WearYoUI$a */
    public class C43470a implements View.OnClickListener {
        public C43470a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wear/ui/WearYoUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C110188a Bx0 = C43457b.Bx0();
            String str = WearYoUI.this.f318412f;
            Bx0.getClass();
            Log.m105925i("MicroMsg.wear.WearYoLogic", "click avatarIV %s", str);
            Intent intent = new Intent();
            intent.putExtra("Main_User", str);
            intent.putExtra("From_fail_notify", true);
            intent.addFlags(536870912);
            intent.addFlags(67108864);
            C88144b.m109801s(MMApplicationContext.getContext(), "com.tencent.mm.ui.LauncherUI", intent, (Bundle) null);
            WearYoUI.this.finish();
            C117292a.m165361g(this, "com/tencent/mm/plugin/wear/ui/WearYoUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wear.ui.WearYoUI$b */
    public class C106572b implements Runnable {
        public C106572b() {
        }

        public void run() {
            WearYoUI.this.f318416j.vibrate(200);
            WearYoUI.this.f318410d.animate().scaleX(1.2f);
            WearYoUI.this.f318410d.animate().scaleY(1.2f);
            WearYoUI.this.f318410d.animate().setDuration(200);
            WearYoUI.this.f318410d.animate().start();
            WearYoUI.this.f318410d.animate().setListener(new C106574d(1));
        }
    }

    /* renamed from: com.tencent.mm.plugin.wear.ui.WearYoUI$c */
    public class C106573c extends BroadcastReceiver {
        public C106573c() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent.getAction() == "android.intent.action.CLOSE_SYSTEM_DIALOGS") {
                WearYoUI.this.finish();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wear.ui.WearYoUI$d */
    public class C106574d implements Animator.AnimatorListener {

        /* renamed from: d */
        public int f318428d;

        public C106574d(int i) {
            this.f318428d = i;
        }

        public void onAnimationCancel(Animator animator) {
            WearYoUI.this.f318419p = false;
        }

        public void onAnimationEnd(Animator animator) {
            int i = this.f318428d;
            if (i == 2) {
                Log.m105927v("MicroMsg.Wear.WearYoUI", "onAnimationEnd count: %d", Integer.valueOf(WearYoUI.this.f318420q.get()));
                if (WearYoUI.this.f318420q.get() > 0) {
                    WearYoUI.this.f318420q.decrementAndGet();
                    MMHandlerThread.postToMainThreadDelayed(WearYoUI.this.f318421r, 1000);
                    return;
                }
                WearYoUI.this.f318410d.animate().setListener((Animator.AnimatorListener) null);
                WearYoUI.this.f318419p = false;
            } else if (i == 1) {
                WearYoUI.this.f318410d.animate().scaleX(1.0f);
                WearYoUI.this.f318410d.animate().scaleY(1.0f);
                WearYoUI.this.f318410d.animate().setDuration(100);
                WearYoUI.this.f318410d.animate().start();
                WearYoUI.this.f318410d.animate().setListener(new C106574d(2));
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    public WearYoUI() {
        C40008f fVar = C40008f.f107254d;
        this.f318418o = new IListener<WearYoEvent>(fVar) {
            {
                this.__eventId = -674619275;
            }

            public boolean callback(IEvent iEvent) {
                WearYoEvent wearYoEvent = (WearYoEvent) iEvent;
                if (wearYoEvent instanceof WearYoEvent) {
                    WearYoEvent.C104600a aVar = wearYoEvent.f310022d;
                    int i = aVar.f310024a;
                    if (i != 1) {
                        if (i == 2 && WearYoUI.this.f318412f.equals(aVar.f310025b)) {
                            WearYoUI wearYoUI = WearYoUI.this;
                            if (wearYoUI.f318419p) {
                                wearYoUI.f318420q.addAndGet(1);
                                Log.m105927v("MicroMsg.Wear.WearYoUI", "startAnimation count: %d", Integer.valueOf(wearYoUI.f318420q.get()));
                            } else {
                                wearYoUI.f318419p = true;
                                MMHandlerThread.postToMainThread(wearYoUI.f318421r);
                            }
                        }
                    } else if (WearYoUI.this.f318412f.equals(aVar.f310025b)) {
                        wearYoEvent.f310023e.f310026a = 1;
                    } else {
                        wearYoEvent.f310023e.f310026a = 2;
                    }
                }
                return false;
            }
        };
        this.f318420q = new AtomicInteger();
        this.f318421r = new C106572b();
        this.f318422s = new C106573c();
        this.f318423t = new IListener<LogoutEvent>(fVar) {
            {
                this.__eventId = 276997888;
            }

            public boolean callback(IEvent iEvent) {
                if (!(((LogoutEvent) iEvent) instanceof LogoutEvent)) {
                    return false;
                }
                WearYoUI.this.finish();
                return false;
            }
        };
    }

    /* renamed from: E7 */
    public void mo153277E7(int i, ImageView imageView, long j) {
        this.f318417n[i][0] = ObjectAnimator.ofFloat(imageView, "scaleX", new float[]{1.0f, 2.5f});
        this.f318417n[i][0].setRepeatCount(-1);
        this.f318417n[i][0].setStartDelay(j);
        this.f318417n[i][0].setDuration(3900);
        this.f318417n[i][0].start();
        this.f318417n[i][1] = ObjectAnimator.ofFloat(imageView, "scaleY", new float[]{1.0f, 2.5f});
        this.f318417n[i][1].setRepeatCount(-1);
        this.f318417n[i][1].setStartDelay(j);
        this.f318417n[i][1].setDuration(3900);
        this.f318417n[i][1].start();
        this.f318417n[i][2] = ObjectAnimator.ofFloat(imageView, "alpha", new float[]{1.0f, 0.0f});
        this.f318417n[i][2].setRepeatCount(-1);
        this.f318417n[i][2].setInterpolator(new AccelerateInterpolator());
        this.f318417n[i][2].setStartDelay(j);
        this.f318417n[i][2].setDuration(3900);
        this.f318417n[i][2].start();
    }

    public Resources getResources() {
        return (getAssets() == null || MMApplicationContext.getResources() == null) ? super.getResources() : MMApplicationContext.getResources();
    }

    public void onClickCheck(View view) {
        Log.m105925i("MicroMsg.Wear.WearYoUI", "onClickCheck %s", this.f318412f);
        C97625j3.m125815e().mo123460f(new C46950b(this.f318412f, 1));
        finish();
    }

    public void onClickNoCheck(View view) {
        Log.m105925i("MicroMsg.Wear.WearYoUI", "onClickNoCheck %s", this.f318412f);
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().addFlags(4718592);
        setContentView(C0966R.C0971layout.chl);
        this.f318416j = (Vibrator) getSystemService("vibrator");
        this.f318412f = getIntent().getStringExtra("key_talker");
        this.f318410d = (ImageView) findViewById(C0966R.C0970id.a27);
        this.f318411e = (TextView) findViewById(C0966R.C0970id.hg4);
        this.f318413g = (ImageView) findViewById(C0966R.C0970id.a2l);
        this.f318414h = (ImageView) findViewById(C0966R.C0970id.a2m);
        this.f318415i = (ImageView) findViewById(C0966R.C0970id.a2n);
        ((C76705f) C86312j.m106911c(C76705f.class)).mo106822J5(this.f318410d, this.f318412f);
        this.f318411e.setText(((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(this.f318412f));
        this.f318410d.setOnClickListener(new C43470a());
        this.f318418o.alive();
        this.f318423t.alive();
        mo153277E7(0, this.f318413g, 0);
        mo153277E7(1, this.f318414h, 1300);
        mo153277E7(2, this.f318415i, 2600);
        this.f318416j.vibrate(200);
        registerReceiver(this.f318422s, new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
        overridePendingTransition(C0966R.C0968anim.f2366b3, C0966R.C0968anim.f2367b4);
    }

    public void onDestroy() {
        for (ObjectAnimator[] objectAnimatorArr : this.f318417n) {
            int i = 0;
            while (true) {
                if (i >= objectAnimatorArr.length) {
                    break;
                }
                objectAnimatorArr[i].cancel();
                i++;
            }
        }
        unregisterReceiver(this.f318422s);
        this.f318423t.dead();
        this.f318418o.dead();
        C43457b.Bx0().mo161588a();
        super.onDestroy();
    }
}
