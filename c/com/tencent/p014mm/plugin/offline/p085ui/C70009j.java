package com.tencent.p014mm.plugin.offline.p085ui;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C30870z1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.wallet_core.p137ui.C7092q;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;

/* renamed from: com.tencent.mm.plugin.offline.ui.j */
public class C70009j implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Runnable f202027d;

    /* renamed from: e */
    public final /* synthetic */ Runnable f202028e;

    /* renamed from: f */
    public final /* synthetic */ View f202029f;

    /* renamed from: g */
    public final /* synthetic */ View f202030g;

    /* renamed from: h */
    public final /* synthetic */ OfflineAlertView f202031h;

    /* renamed from: com.tencent.mm.plugin.offline.ui.j$a */
    public class C70010a extends C30870z1 {
        public C70010a() {
        }

        /* renamed from: a */
        public void mo57772a(View view) {
            C70009j.this.f202027d.run();
        }
    }

    /* renamed from: com.tencent.mm.plugin.offline.ui.j$b */
    public class C70011b implements C7092q.C7093a {
        public C70011b() {
        }

        public void onClick(View view) {
            C70009j.this.f202028e.run();
        }
    }

    public C70009j(OfflineAlertView offlineAlertView, Runnable runnable, Runnable runnable2, View view, View view2) {
        this.f202031h = offlineAlertView;
        this.f202027d = runnable;
        this.f202028e = runnable2;
        this.f202029f = view;
        this.f202030g = view2;
    }

    public void run() {
        TextView textView = (TextView) this.f202031h.f201798e.findViewById(C0966R.C0970id.f358422f12);
        if (textView != null) {
            textView.setOnClickListener(new C70010a());
        }
        TextView textView2 = (TextView) this.f202031h.f201798e.findViewById(C0966R.C0970id.kew);
        if (textView2 != null) {
            C75228t.m90253j0(textView2, MMApplicationContext.getContext().getString(C0966R.string.kzv), 0, textView2.length(), new C7092q((C7092q.C7093a) new C70011b(), true), this.f202031h.f201798e.getContext());
        }
        Log.m105925i("MicroMsg.OfflineAlertView", "qrCodeView.getHeight%s %s", Integer.valueOf(this.f202029f.getHeight()), Integer.valueOf(this.f202029f.getMeasuredHeight()));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f202030g.getLayoutParams();
        if (this.f202030g.getMeasuredHeight() > this.f202029f.getHeight()) {
            layoutParams.height = this.f202030g.getMeasuredHeight();
            this.f202030g.setLayoutParams(layoutParams);
        } else if (this.f202029f.getHeight() > 0) {
            layoutParams.height = this.f202029f.getHeight();
            this.f202030g.setLayoutParams(layoutParams);
        }
        OfflineAlertView offlineAlertView = this.f202031h;
        offlineAlertView.f201800g = false;
        OfflineAlertView$$h offlineAlertView$$h = offlineAlertView.f201801h;
        if (offlineAlertView$$h != null) {
            ((WalletOfflineCoinPurseUI$$g) offlineAlertView$$h).mo96319a();
        }
    }
}
