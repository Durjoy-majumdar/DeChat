package com.tencent.p014mm.plugin.eggspring.p882ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.app.C114668z;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.gif.MMAnimateView;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;
import qo3.C89779i0;
import t51.C77862a;
import t51.C77863b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/eggspring/ui/SpringCardActivity;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-eggspring_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.eggspring.ui.SpringCardActivity */
public final class SpringCardActivity extends MMActivity {

    /* renamed from: d */
    public MMAnimateView f197833d;

    /* renamed from: e */
    public MMAnimateView f197834e;

    /* renamed from: f */
    public C114668z f197835f;

    /* renamed from: g */
    public boolean f197836g;

    /* renamed from: h */
    public C89779i0 f197837h;

    /* renamed from: i */
    public final Runnable f197838i = new C68856a(this);

    /* renamed from: com.tencent.mm.plugin.eggspring.ui.SpringCardActivity$a */
    public static final class C68856a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ SpringCardActivity f197839d;

        public C68856a(SpringCardActivity springCardActivity) {
            this.f197839d = springCardActivity;
        }

        public final void run() {
            C89779i0 i0Var = this.f197839d.f197837h;
            if (i0Var != null) {
                i0Var.dismiss();
            }
            SpringCardActivity springCardActivity = this.f197839d;
            springCardActivity.f197837h = C89779i0.m112248e(springCardActivity, springCardActivity.getString(C0966R.string.f360359c40), true, 0, (DialogInterface.OnCancelListener) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.eggspring.ui.SpringCardActivity$b */
    public static final class C68857b implements C114668z {
        public void onAppBackground(String str) {
            Log.m105918d("MicroMsg.SpringCardActivity", "onAppBackground");
        }

        public void onAppForeground(String str) {
            Log.m105918d("MicroMsg.SpringCardActivity", "onAppForeground");
        }
    }

    public void finish() {
        C89779i0 i0Var = this.f197837h;
        if (i0Var != null) {
            i0Var.dismiss();
        }
        super.finish();
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.c5l;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1001) {
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().addFlags(2097280);
        new Handler(getMainLooper());
        setMMTitle("");
        setBackBtn(new C77863b(this), C0966R.raw.icons_outlined_close);
        int color = getContext().getResources().getColor(C0966R.color.ae8);
        setActionbarColor(color);
        if (C74933u4.m89770g(color)) {
            updateBackBtn(C74933u4.m89768e(this, C0966R.raw.icons_outlined_close, -1));
        } else {
            updateBackBtn(C74933u4.m89768e(this, C0966R.raw.icons_outlined_close, -16777216));
        }
        hideActionbarLine();
        getWindow().getDecorView().setSystemUiVisibility(2050);
        supportLightStatusBar();
        View findViewById = findViewById(C0966R.C0970id.iwk);
        C87412m.m108593f(findViewById, "findViewById(R.id.root_layout)");
        ViewGroup viewGroup = (ViewGroup) findViewById;
        View findViewById2 = findViewById(C0966R.C0970id.gbn);
        C87412m.m108593f(findViewById2, "findViewById(R.id.lucky_bag_loading_img)");
        this.f197833d = (MMAnimateView) findViewById2;
        View findViewById3 = findViewById(C0966R.C0970id.gbo);
        C87412m.m108593f(findViewById3, "findViewById(R.id.lucky_bag_loading_loop)");
        this.f197834e = (MMAnimateView) findViewById3;
        C77862a aVar = new C77862a(this);
        MMAnimateView mMAnimateView = this.f197833d;
        if (mMAnimateView != null) {
            mMAnimateView.setOnClickListener(aVar);
            MMAnimateView mMAnimateView2 = this.f197834e;
            if (mMAnimateView2 != null) {
                mMAnimateView2.setOnClickListener(aVar);
                C68857b bVar = new C68857b();
                this.f197835f = bVar;
                AppForegroundDelegate.INSTANCE.mo174208a(bVar);
                return;
            }
            C87412m.m108603p("luckyBagLoop");
            throw null;
        }
        C87412m.m108603p("luckyBagLoadingImg");
        throw null;
    }

    public void onDestroy() {
        super.onDestroy();
        Log.m105924i("MicroMsg.SpringCardActivity", "onDestroy: ");
        AppForegroundDelegate appForegroundDelegate = AppForegroundDelegate.INSTANCE;
        C114668z zVar = this.f197835f;
        if (zVar != null) {
            appForegroundDelegate.mo174215k(zVar);
        } else {
            C87412m.m108603p("appForegroundLis");
            throw null;
        }
    }

    public void onResume() {
        super.onResume();
        Log.m105924i("MicroMsg.SpringCardActivity", "onResume: ");
    }

    public void onStop() {
        super.onStop();
        Log.m105924i("MicroMsg.SpringCardActivity", "onStop: " + this.f197836g);
        if (this.f197836g) {
            finish();
        }
    }
}
