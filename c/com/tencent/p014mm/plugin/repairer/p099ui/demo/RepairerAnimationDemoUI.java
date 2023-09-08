package com.tencent.p014mm.plugin.repairer.p099ui.demo;

import aj3.C103374a;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.plugin.repairer.p099ui.BaseRepairerUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/repairer/ui/demo/RepairerAnimationDemoUI;", "Lcom/tencent/mm/plugin/repairer/ui/BaseRepairerUI;", "<init>", "()V", "ui-repairer_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerAnimationDemoUI */
public final class RepairerAnimationDemoUI extends BaseRepairerUI {

    /* renamed from: d */
    public final String f205448d = "MicroMsg.RepairerAnimationDemoUI";

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerAnimationDemoUI$a */
    public static final class C70984a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerAnimationDemoUI f205449d;

        public C70984a(RepairerAnimationDemoUI repairerAnimationDemoUI) {
            this.f205449d = repairerAnimationDemoUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f205449d.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerAnimationDemoUI$b */
    public static final class C70985b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerAnimationDemoUI f205450d;

        /* renamed from: e */
        public final /* synthetic */ View f205451e;

        /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerAnimationDemoUI$b$a */
        public static final class C70986a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ View f205452d;

            public C70986a(View view) {
                this.f205452d = view;
            }

            public final void run() {
                this.f205452d.setScaleX(1.0f);
                this.f205452d.setScaleY(1.0f);
                this.f205452d.setTranslationX(0.0f);
                this.f205452d.setTranslationY(0.0f);
                this.f205452d.setRotationX(0.0f);
                this.f205452d.setRotationY(0.0f);
            }
        }

        /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerAnimationDemoUI$b$b */
        public static final class C70987b implements C103374a.C67055a {

            /* renamed from: a */
            public static final C70987b f205453a = new C70987b();

            /* renamed from: a */
            public final void mo91065a(float f) {
            }
        }

        public C70985b(RepairerAnimationDemoUI repairerAnimationDemoUI, View view) {
            this.f205450d = repairerAnimationDemoUI;
            this.f205451e = view;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/repairer/ui/demo/RepairerAnimationDemoUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            float f = 1.0f;
            try {
                String obj = ((MMEditText) this.f205450d.findViewById(C0966R.C0970id.j16)).getText().toString();
                if (!Util.isNullOrNil(obj)) {
                    f = Float.parseFloat(obj);
                }
                String obj2 = ((MMEditText) this.f205450d.findViewById(C0966R.C0970id.iwt)).getText().toString();
                float f2 = 0.0f;
                float parseFloat = !Util.isNullOrNil(obj2) ? Float.parseFloat(obj2) : 0.0f;
                String obj3 = ((MMEditText) this.f205450d.findViewById(C0966R.C0970id.ku6)).getText().toString();
                if (!Util.isNullOrNil(obj3)) {
                    f2 = Float.parseFloat(obj3);
                }
                C103374a.m137034a(this.f205451e).mo143290m(new C70986a(this.f205451e)).mo143285h(C70987b.f205453a).mo143282e(1000).mo143280c(f).mo143281d(f).mo143287j(f2).mo143288k(f2).mo143279b(parseFloat).mo143286i();
            } catch (Exception e) {
                String str = this.f205450d.f205448d;
                Log.m105928w(str, "start animation failed " + e);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerAnimationDemoUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerAnimationDemoUI$c */
    public static final class C70988c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ View f205454d;

        public C70988c(View view) {
            this.f205454d = view;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/repairer/ui/demo/RepairerAnimationDemoUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f205454d.setScaleX(1.0f);
            this.f205454d.setScaleY(1.0f);
            this.f205454d.setTranslationX(0.0f);
            this.f205454d.setTranslationY(0.0f);
            this.f205454d.setRotationX(0.0f);
            this.f205454d.setRotationY(0.0f);
            this.f205454d.setRotation(0.0f);
            C117292a.m165361g(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerAnimationDemoUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f359946bs2;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("动画组件Demo");
        setBackBtn(new C70984a(this));
        View findViewById = findViewById(C0966R.C0970id.f5853qc);
        ((Button) findViewById(C0966R.C0970id.hll)).setOnClickListener(new C70985b(this, findViewById));
        ((Button) findViewById(C0966R.C0970id.iqw)).setOnClickListener(new C70988c(findViewById));
    }
}
