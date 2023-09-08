package com.tencent.p014mm.plugin.luckymoney.appbrand.p071ui;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.luckymoney.appbrand.p071ui.detail.WxaLuckyMoneyDetailUI;
import com.tencent.p014mm.plugin.luckymoney.appbrand.p071ui.prepare.WxaLuckyMoneyCompleteUI;
import com.tencent.p014mm.plugin.luckymoney.appbrand.p071ui.prepare.WxaLuckyMoneyPrepareUI;
import com.tencent.p014mm.plugin.luckymoney.appbrand.p071ui.receive.WxaLuckyMoneyReceiveUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import k20.C9556a;
import l32.C76667b;
import l32.C76668c;
import m32.C76741b;
import n32.C76817b;
import n32.C76818c;
import o32.C47327b;

/* renamed from: com.tencent.mm.plugin.luckymoney.appbrand.ui.WxaLuckyMoneyBaseUI */
public abstract class WxaLuckyMoneyBaseUI extends MMActivity {

    /* renamed from: d */
    public C76667b f198770d = null;

    /* renamed from: e */
    public int f198771e = 4095;

    /* renamed from: f */
    public final SparseArray<C76668c> f198772f = new SparseArray<>();

    /* renamed from: g */
    public final Class[][] f198773g = {new Class[]{C47327b.class, WxaLuckyMoneyReceiveUI.class}, new Class[]{C76818c.class, WxaLuckyMoneyPrepareUI.class}, new Class[]{C76741b.class, WxaLuckyMoneyDetailUI.class}, new Class[]{C76817b.class, WxaLuckyMoneyCompleteUI.class}};

    /* renamed from: com.tencent.mm.plugin.luckymoney.appbrand.ui.WxaLuckyMoneyBaseUI$a */
    public class C69126a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Class f198774d;

        /* renamed from: e */
        public final /* synthetic */ Intent f198775e;

        /* renamed from: f */
        public final /* synthetic */ C76668c f198776f;

        public C69126a(Class cls, Intent intent, C76668c cVar) {
            this.f198774d = cls;
            this.f198775e = intent;
            this.f198776f = cVar;
        }

        public void run() {
            WxaLuckyMoneyBaseUI.this.mo95235Z4(this.f198774d, this.f198775e, this.f198776f);
        }
    }

    /* renamed from: T1 */
    public void mo95234T1(int i, Intent intent) {
        setResult(i, intent);
        finish();
    }

    /* renamed from: Z4 */
    public void mo95235Z4(Class cls, Intent intent, C76668c cVar) {
        if (getMainLooper().getThread() != Thread.currentThread()) {
            runOnUiThread(new C69126a(cls, intent, cVar));
            return;
        }
        if (intent == null) {
            intent = new Intent();
        }
        Class cls2 = null;
        for (Class[] clsArr : this.f198773g) {
            if (clsArr[0] == cls) {
                cls2 = clsArr[1];
            }
        }
        if (cls2 != null) {
            intent.setClass(getContext(), cls2);
            if (cVar == null) {
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/appbrand/ui/WxaLuckyMoneyBaseUI", "proceed", "(Ljava/lang/Class;Landroid/content/Intent;Lcom/tencent/mm/plugin/luckymoney/appbrand/ui/WxaLuckyMoneyUIRouter$OnBackListener;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(this, "com/tencent/mm/plugin/luckymoney/appbrand/ui/WxaLuckyMoneyBaseUI", "proceed", "(Ljava/lang/Class;Landroid/content/Intent;Lcom/tencent/mm/plugin/luckymoney/appbrand/ui/WxaLuckyMoneyUIRouter$OnBackListener;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return;
            }
            int i = this.f198771e;
            this.f198771e = i + 1;
            startActivityForResult(intent, i);
            this.f198772f.put(i, cVar);
            return;
        }
        throw new IllegalStateException("proceed to ui = [" + cls.getName() + "], but Target is null");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        C76668c cVar = this.f198772f.get(i);
        if (cVar != null) {
            Log.m105925i("MicroMsg.HjLuckyMoneyBaseUI", "damon warns you, requestCode == [%d], I used it, and skip. check your code if needed!!!!", Integer.valueOf(i));
            cVar.mo106933a(i2, intent);
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C76667b bVar = new C76667b(this);
        this.f198770d = bVar;
        Resources resources = bVar.f200909a.getResources();
        ColorDrawable colorDrawable = new ColorDrawable(resources.getColor(C0966R.color.a2o));
        int color = resources.getColor(C0966R.color.a2p);
        int color2 = resources.getColor(C0966R.color.a2w);
        int color3 = resources.getColor(C0966R.color.a2w);
        int color4 = resources.getColor(C0966R.color.f356951a33);
        if (bVar.f200909a.getSupportActionBar() != null) {
            bVar.f200909a.getSupportActionBar().mo91112w(colorDrawable);
            View j = bVar.f200909a.getSupportActionBar().mo91099j();
            if (j != null) {
                View findViewById = j.findViewById(C0966R.C0970id.c7p);
                if (!(findViewById == null || color == 0)) {
                    findViewById.setBackgroundColor(color);
                }
                TextView textView = (TextView) j.findViewById(16908308);
                if (!(textView == null || color2 == 0)) {
                    textView.setTextColor(color2);
                }
                TextView textView2 = (TextView) j.findViewById(16908309);
                if (!(textView2 == null || color3 == 0)) {
                    textView2.setTextColor(color3);
                }
                ImageView imageView = (ImageView) j.findViewById(C0966R.C0970id.f5471g1);
                if (imageView != null) {
                    imageView.setImageResource(C0966R.C0969drawable.adj);
                }
            }
            if (color4 != 0) {
                Window window = bVar.f200909a.getWindow();
                window.addFlags(Integer.MIN_VALUE);
                window.setStatusBarColor(color4);
            }
        }
    }

    public void onDestroy() {
        this.f198770d = null;
        this.f198772f.clear();
        super.onDestroy();
    }
}
