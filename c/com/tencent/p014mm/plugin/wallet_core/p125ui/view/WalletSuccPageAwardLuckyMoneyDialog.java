package com.tencent.p014mm.plugin.wallet_core.p125ui.view;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import g63.C45896l;
import j20.C117292a;
import java.io.IOException;
import java.util.ArrayList;
import nj3.C88989a;
import p206nj.C11171e;
import t14.C77823f;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.wallet_core.ui.view.WalletSuccPageAwardLuckyMoneyDialog */
public class WalletSuccPageAwardLuckyMoneyDialog extends MMActivity {

    /* renamed from: d */
    public ViewGroup f117372d;

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.view.WalletSuccPageAwardLuckyMoneyDialog$a */
    public class C43414a implements View.OnClickListener {
        public C43414a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet_core/ui/view/WalletSuccPageAwardLuckyMoneyDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            WalletSuccPageAwardLuckyMoneyDialog.this.finish();
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/ui/view/WalletSuccPageAwardLuckyMoneyDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.view.WalletSuccPageAwardLuckyMoneyDialog$b */
    public class C43415b implements Animation.AnimationListener {
        public C43415b(WalletSuccPageAwardLuckyMoneyDialog walletSuccPageAwardLuckyMoneyDialog) {
        }

        public void onAnimationEnd(Animation animation) {
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cgi;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getSupportActionBar() != null) {
            getSupportActionBar().mo91104o();
        }
        if (C11171e.m11046c(19)) {
            getWindow().setFlags(67108864, 67108864);
        }
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("key_layer_info");
        if (byteArrayExtra == null) {
            Log.m105920e("MicroMsg.WalletSuccPageAwardLuckyMoneyDialog", "WalletSuccPageAwardLuckyMoneyDialog onCreate error! cannot get layerInfoBytes!");
            finish();
        }
        try {
            new C77823f().parseFrom(byteArrayExtra);
        } catch (IOException e) {
            IOException iOException = e;
            Log.printErrStackTrace("MicroMsg.WalletSuccPageAwardLuckyMoneyDialog", iOException, "parse layer info byte error! %s", iOException.getMessage());
            finish();
        }
        this.f117372d = (ViewGroup) findViewById(C0966R.C0970id.brz);
        ((ImageView) findViewById(C0966R.C0970id.bec)).setOnClickListener(new C43414a());
        ViewGroup viewGroup = this.f117372d;
        C43415b bVar = new C43415b(this);
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 0.96f, 0.0f, 0.96f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(300);
        scaleAnimation.setInterpolator(new OvershootInterpolator());
        scaleAnimation.setFillAfter(true);
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(0.96f, 1.0f, 0.96f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation2.setDuration(100);
        scaleAnimation2.setFillAfter(true);
        scaleAnimation.setAnimationListener(new C45896l(this, viewGroup, scaleAnimation2));
        scaleAnimation2.setAnimationListener(bVar);
        if (viewGroup != null) {
            viewGroup.startAnimation(scaleAnimation);
        }
    }
}
