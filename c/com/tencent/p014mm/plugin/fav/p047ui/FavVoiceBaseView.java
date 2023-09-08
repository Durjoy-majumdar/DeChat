package com.tencent.p014mm.plugin.fav.p047ui;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMEntryLock;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import kg3.C76577a;
import nj3.C76912y0;
import ob0.C76996p;
import p182kk.C61104a;
import p206nj.C88955f;
import p272xq.C102714j;
import p371ph.C21967a;
import p910lj.C76701a;
import pb1.C100715i0;
import pb1.C100734q;
import wq3.C111847h;

/* renamed from: com.tencent.mm.plugin.fav.ui.FavVoiceBaseView */
public class FavVoiceBaseView extends LinearLayout implements C102714j, C111847h {

    /* renamed from: n */
    public static final /* synthetic */ int f269858n = 0;

    /* renamed from: d */
    public ViewGroup f269859d;

    /* renamed from: e */
    public TextView f269860e;

    /* renamed from: f */
    public ImageButton f269861f;

    /* renamed from: g */
    public TextView f269862g;

    /* renamed from: h */
    public String f269863h = "";

    /* renamed from: i */
    public C100715i0 f269864i;

    /* renamed from: j */
    public C93461c f269865j;

    /* renamed from: com.tencent.mm.plugin.fav.ui.FavVoiceBaseView$a */
    public class C93459a implements Runnable {
        public C93459a() {
        }

        public void run() {
            FavVoiceBaseView.this.f269865j.mo128326b();
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.FavVoiceBaseView$b */
    public class C93460b implements View.OnClickListener {
        public C93460b() {
        }

        public void onClick(View view) {
            boolean z;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/fav/ui/FavVoiceBaseView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (C61104a.m71669y(view.getContext()) || C61104a.m71665u(view.getContext()) || C61104a.m71649e(view.getContext())) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/fav/ui/FavVoiceBaseView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            } else if (C88955f.m111058b() || Util.isNullOrNil(FavVoiceBaseView.this.f269863h)) {
                if (!Util.nullAs(FavVoiceBaseView.this.f269863h, "").equals(FavVoiceBaseView.this.f269864i.f295079e)) {
                    FavVoiceBaseView.m118071b(FavVoiceBaseView.this);
                } else if (FavVoiceBaseView.this.f269864i.mo140148c()) {
                    FavVoiceBaseView.this.mo128320c();
                } else {
                    FavVoiceBaseView favVoiceBaseView = FavVoiceBaseView.this;
                    favVoiceBaseView.getClass();
                    Log.m105924i("MicroMsg.FavVoiceBaseView", "resume play");
                    C100715i0 i0Var = favVoiceBaseView.f269864i;
                    i0Var.getClass();
                    Log.m105924i("MicroMsg.FavVoiceLogic", "resume play");
                    MMEntryLock.lock("keep_app_silent");
                    C76996p pVar = i0Var.f295078d;
                    if (pVar == null) {
                        Log.m105928w("MicroMsg.FavVoiceLogic", "resum play error, player is null");
                        z = false;
                    } else {
                        z = ((C21967a) pVar).mo35060d();
                    }
                    C93461c cVar = favVoiceBaseView.f269865j;
                    cVar.f269868a = false;
                    cVar.sendEmptyMessage(4096);
                    FavVoiceBaseView.this.f269861f.setImageResource(C0966R.raw.voicepost_pauseicon);
                    FavVoiceBaseView favVoiceBaseView2 = FavVoiceBaseView.this;
                    favVoiceBaseView2.f269861f.setContentDescription(favVoiceBaseView2.getContext().getResources().getString(C0966R.string.a1a));
                    favVoiceBaseView.f269860e.setKeepScreenOn(true);
                    if (!z) {
                        FavVoiceBaseView.m118071b(FavVoiceBaseView.this);
                    }
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/fav/ui/FavVoiceBaseView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            } else {
                C76912y0.m92771j(view.getContext(), (View) null);
                C117292a.m165361g(this, "com/tencent/mm/plugin/fav/ui/FavVoiceBaseView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.FavVoiceBaseView$c */
    public class C93461c extends MMHandler {

        /* renamed from: a */
        public boolean f269868a;

        /* renamed from: b */
        public float f269869b;

        /* renamed from: c */
        public float f269870c;

        /* renamed from: d */
        public int f269871d;

        /* renamed from: e */
        public int f269872e;

        public C93461c(C93459a aVar) {
        }

        /* renamed from: a */
        public void mo128325a() {
            mo128327c();
            this.f269868a = false;
            FavVoiceBaseView.this.f269861f.setImageResource(C0966R.raw.voicepost_pauseicon);
            FavVoiceBaseView favVoiceBaseView = FavVoiceBaseView.this;
            favVoiceBaseView.f269861f.setContentDescription(favVoiceBaseView.getContext().getResources().getString(C0966R.string.a1a));
            sendEmptyMessage(4096);
        }

        /* renamed from: b */
        public void mo128326b() {
            float f = 1.0f - (this.f269870c / this.f269869b);
            int width = FavVoiceBaseView.this.f269859d.getWidth();
            int i = this.f269872e;
            this.f269871d = ((int) (f * ((float) (width - i)))) + i;
            FavVoiceBaseView favVoiceBaseView = FavVoiceBaseView.this;
            favVoiceBaseView.f269862g.setText(C68924p1.m81172a(favVoiceBaseView.getContext(), Math.min((int) Math.ceil((double) this.f269870c), (int) this.f269869b)));
            FavVoiceBaseView.this.f269860e.setWidth(this.f269871d);
        }

        /* renamed from: c */
        public void mo128327c() {
            this.f269868a = false;
            removeMessages(4096);
            FavVoiceBaseView favVoiceBaseView = FavVoiceBaseView.this;
            int i = FavVoiceBaseView.f269858n;
            favVoiceBaseView.getClass();
            this.f269868a = false;
            HashMap<Long, ArrayList<String>> hashMap = C100734q.f295126a;
            float f = ((float) ((long) 0)) / 1000.0f;
            if (f < 1.0f) {
                f = 1.0f;
            }
            if (f > 60.0f) {
                f = 60.0f;
            }
            float round = (float) Math.round(f);
            this.f269869b = round;
            this.f269870c = round;
            this.f269872e = C76577a.m92151b(FavVoiceBaseView.this.getContext(), 3);
            FavVoiceBaseView favVoiceBaseView2 = FavVoiceBaseView.this;
            favVoiceBaseView2.f269862g.setText(C68924p1.m81172a(favVoiceBaseView2.getContext(), (int) this.f269869b));
            FavVoiceBaseView.this.f269861f.setImageResource(C0966R.raw.voicepost_beginicon);
            FavVoiceBaseView favVoiceBaseView3 = FavVoiceBaseView.this;
            favVoiceBaseView3.f269861f.setContentDescription(favVoiceBaseView3.getContext().getResources().getString(C0966R.string.a1s));
            FavVoiceBaseView.this.f269860e.setWidth(this.f269872e);
        }

        public void handleMessage(Message message) {
            this.f269870c = Math.max(0.0f, this.f269870c - 0.256f);
            mo128326b();
            if (this.f269870c > 0.1f) {
                sendEmptyMessageDelayed(4096, 256);
            }
        }
    }

    public FavVoiceBaseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: b */
    public static void m118071b(FavVoiceBaseView favVoiceBaseView) {
        Log.m105919d("MicroMsg.FavVoiceBaseView", "start play, path[%s] voiceType[%d]", favVoiceBaseView.f269863h, 0);
        if (favVoiceBaseView.f269864i.mo140151f(favVoiceBaseView.f269863h, 0)) {
            favVoiceBaseView.f269860e.setKeepScreenOn(true);
            favVoiceBaseView.f269865j.mo128325a();
            return;
        }
        C76701a.makeText(favVoiceBaseView.getContext(), (int) C0966R.string.csa, 1).show();
    }

    /* renamed from: a */
    public void mo128239a(String str, int i) {
        Log.m105919d("MicroMsg.FavVoiceBaseView", "on play, my path %s, my duration %d, play path %s", this.f269863h, 0, str);
        if (!Util.nullAs(str, "").equals(this.f269863h)) {
            this.f269865j.mo128327c();
            this.f269860e.setKeepScreenOn(false);
            return;
        }
        this.f269860e.setKeepScreenOn(true);
        this.f269865j.mo128325a();
    }

    /* renamed from: c */
    public boolean mo128320c() {
        Log.m105924i("MicroMsg.FavVoiceBaseView", "pause play");
        boolean e = this.f269864i.mo140150e();
        C93461c cVar = this.f269865j;
        cVar.f269868a = true;
        cVar.removeMessages(4096);
        FavVoiceBaseView.this.f269861f.setImageResource(C0966R.raw.voicepost_beginicon);
        FavVoiceBaseView favVoiceBaseView = FavVoiceBaseView.this;
        favVoiceBaseView.f269861f.setContentDescription(favVoiceBaseView.getContext().getResources().getString(C0966R.string.a1s));
        this.f269860e.setKeepScreenOn(false);
        return e;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Log.m105925i("MicroMsg.FavVoiceBaseView", "on configuration changed, is paused ? %B", Boolean.valueOf(this.f269865j.f269868a));
        C93461c cVar = this.f269865j;
        if (cVar.f269868a) {
            cVar.postDelayed(new C93459a(), 128);
        }
    }

    public void onFinish() {
        Log.m105918d("MicroMsg.FavVoiceBaseView", "stop play");
        this.f269864i.mo140152g();
        this.f269865j.mo128327c();
        this.f269860e.setKeepScreenOn(false);
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f269859d = (ViewGroup) findViewById(C0966R.C0970id.lav);
        this.f269862g = (TextView) findViewById(C0966R.C0970id.lat);
        this.f269860e = (TextView) findViewById(C0966R.C0970id.lau);
        this.f269861f = (ImageButton) findViewById(C0966R.C0970id.las);
        this.f269865j = new C93461c((C93459a) null);
        this.f269861f.setOnClickListener(new C93460b());
    }

    public void onPause() {
        mo128320c();
    }

    public void setVoiceHelper(C100715i0 i0Var) {
        this.f269864i = i0Var;
        i0Var.mo140147b(this);
    }
}
