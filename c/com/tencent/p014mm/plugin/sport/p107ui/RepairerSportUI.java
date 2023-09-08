package com.tencent.p014mm.plugin.sport.p107ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.ExtStepCountEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C85796t4;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Calendar;
import ke3.C88144b;
import kotlin.Metadata;
import p910lj.C76701a;
import tv2.C52366c;
import z04.C66731x;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/sport/ui/RepairerSportUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-sport_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sport.ui.RepairerSportUI */
public final class RepairerSportUI extends MMActivity {

    /* renamed from: d */
    public final String f116781d = "MicroMsg.Repairer.RepairerSportUI";

    /* renamed from: com.tencent.mm.plugin.sport.ui.RepairerSportUI$a */
    public static final class C43166a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerSportUI f116782d;

        public C43166a(RepairerSportUI repairerSportUI) {
            this.f116782d = repairerSportUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f116782d.finish();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sport.ui.RepairerSportUI$b */
    public static final class C43167b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerSportUI f116783d;

        public C43167b(RepairerSportUI repairerSportUI) {
            this.f116783d = repairerSportUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sport/ui/RepairerSportUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Integer e = C66731x.m78731e(((MMEditText) this.f116783d.findViewById(C0966R.C0970id.l3f)).getText().toString());
            int intValue = e != null ? e.intValue() : 1;
            Calendar instance = Calendar.getInstance();
            instance.set(11, 0);
            instance.set(12, 0);
            instance.set(13, 0);
            long j = (long) 1000;
            ((C52366c) C86312j.m106911c(C52366c.class)).b50("", "gh_43f2581f6fd6", (int) (instance.getTimeInMillis() / j), (int) (System.currentTimeMillis() / j), intValue, C85796t4.m105983jo(), 1);
            C76701a.makeText((Context) this.f116783d, (int) C0966R.string.a0g, 0).show();
            C117292a.m165361g(this, "com/tencent/mm/plugin/sport/ui/RepairerSportUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sport.ui.RepairerSportUI$c */
    public static final class C43168c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerSportUI f116784d;

        public C43168c(RepairerSportUI repairerSportUI) {
            this.f116784d = repairerSportUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sport/ui/RepairerSportUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent();
            intent.putExtra("rawUrl", "https://fm.m.tencent.com/an:mhr/sports/");
            C88144b.m109791i(this.f116784d, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/sport/ui/RepairerSportUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sport.ui.RepairerSportUI$d */
    public static final class C43169d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerSportUI f116785d;

        public C43169d(RepairerSportUI repairerSportUI) {
            this.f116785d = repairerSportUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sport/ui/RepairerSportUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ExtStepCountEvent extStepCountEvent = new ExtStepCountEvent();
            extStepCountEvent.f107516d.f107518a = 3;
            extStepCountEvent.publish();
            String str = this.f116785d.f116781d;
            Log.m105924i(str, "getconfig:  " + extStepCountEvent.f107517e.f107524c + ' ' + extStepCountEvent.f107517e.f107522a);
            C117292a.m165361g(this, "com/tencent/mm/plugin/sport/ui/RepairerSportUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sport.ui.RepairerSportUI$e */
    public static final class C43170e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerSportUI f116786d;

        public C43170e(RepairerSportUI repairerSportUI) {
            this.f116786d = repairerSportUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sport/ui/RepairerSportUI$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ExtStepCountEvent extStepCountEvent = new ExtStepCountEvent();
            extStepCountEvent.f107516d.f107518a = 2;
            extStepCountEvent.publish();
            String str = this.f116786d.f116781d;
            Log.m105924i(str, "getconfig:  " + extStepCountEvent.f107517e.f107524c + ' ' + extStepCountEvent.f107517e.f107522a);
            C117292a.m165361g(this, "com/tencent/mm/plugin/sport/ui/RepairerSportUI$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.c5k;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.cgc);
        setBackBtn(new C43166a(this));
        findViewById(C0966R.C0970id.hll).setOnClickListener(new C43167b(this));
        findViewById(C0966R.C0970id.hma).setOnClickListener(new C43168c(this));
        findViewById(C0966R.C0970id.epa).setOnClickListener(new C43169d(this));
        findViewById(C0966R.C0970id.epa).setOnClickListener(new C43170e(this));
    }
}
