package hn2;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference;
import com.tencent.p014mm.plugin.setting.p102ui.setting.SettingsManageFindOtherServiceUI;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import nj3.C76912y0;
import p274xx.C15907f;
import p629ny.C76979h;
import qo3.C101218e0;
import te3.C52238za0;
import xm2.C23105a;
import xm2.C23106b;
import xm2.C23108c;
import xm2.C23109g;
import xm2.C53381j;

/* renamed from: hn2.j */
public class C20974j {

    /* renamed from: hn2.j$a */
    public class C20975a implements SettingsManageFindOtherServiceUI.C19175c {

        /* renamed from: a */
        public final /* synthetic */ C15907f.C15908a f59405a;

        public C20975a(C15907f.C15908a aVar) {
            this.f59405a = aVar;
        }

        /* renamed from: a */
        public void mo24593a(boolean z) {
            if (z) {
                this.f59405a.onSuccess();
            } else {
                this.f59405a.mo9404a();
            }
        }
    }

    /* renamed from: hn2.j$b */
    public class C20976b implements SettingsManageFindOtherServiceUI.C19175c {

        /* renamed from: a */
        public final /* synthetic */ Context f59406a;

        /* renamed from: b */
        public final /* synthetic */ int f59407b;

        /* renamed from: c */
        public final /* synthetic */ long f59408c;

        /* renamed from: d */
        public final /* synthetic */ C20986j f59409d;

        /* renamed from: e */
        public final /* synthetic */ C15907f.C15909b f59410e;

        /* renamed from: f */
        public final /* synthetic */ boolean f59411f;

        /* renamed from: hn2.j$b$a */
        public class C20977a implements C23109g {
            public C20977a() {
            }

            /* renamed from: a */
            public void mo24594a(Context context, boolean z, C52238za0 za02) {
                if (za02 == null || !z) {
                    C20974j.m23157k(C20976b.this.f59406a);
                    C20986j jVar = C20976b.this.f59409d;
                    jVar.mo24606b(jVar.mo24605a());
                    return;
                }
                C20974j.m23158l(C20976b.this.f59406a);
                C20976b.this.f59410e.onSuccess();
            }
        }

        public C20976b(Context context, int i, long j, C20986j jVar, C15907f.C15909b bVar, boolean z) {
            this.f59406a = context;
            this.f59407b = i;
            this.f59408c = j;
            this.f59409d = jVar;
            this.f59410e = bVar;
            this.f59411f = z;
        }

        /* renamed from: a */
        public void mo24593a(boolean z) {
            if (z) {
                C20974j.m23148b(this.f59406a, this.f59407b, 1, this.f59408c, 0, new C20977a(), this.f59411f);
            } else {
                this.f59410e.mo6380a();
            }
        }
    }

    /* renamed from: hn2.j$c */
    public class C20978c implements SettingsManageFindOtherServiceUI.C19175c {

        /* renamed from: a */
        public final /* synthetic */ Context f59413a;

        /* renamed from: b */
        public final /* synthetic */ long f59414b;

        /* renamed from: c */
        public final /* synthetic */ long f59415c;

        /* renamed from: d */
        public final /* synthetic */ C15907f.C15909b f59416d;

        /* renamed from: hn2.j$c$a */
        public class C20979a implements C23109g {
            public C20979a() {
            }

            /* renamed from: a */
            public void mo24594a(Context context, boolean z, C52238za0 za02) {
                if (za02 == null || !z) {
                    C20974j.m23157k(C20978c.this.f59413a);
                    C20978c.this.f59416d.mo6380a();
                    return;
                }
                C20974j.m23158l(C20978c.this.f59413a);
                C20978c.this.f59416d.onSuccess();
            }
        }

        public C20978c(Context context, long j, long j2, C15907f.C15909b bVar) {
            this.f59413a = context;
            this.f59414b = j;
            this.f59415c = j2;
            this.f59416d = bVar;
        }

        /* renamed from: a */
        public void mo24593a(boolean z) {
            if (z) {
                C20974j.m23148b(this.f59413a, 3, 1, this.f59414b, this.f59415c, new C20979a(), true);
            } else {
                this.f59416d.mo6380a();
            }
        }
    }

    /* renamed from: hn2.j$d */
    public class C20980d implements C23109g {

        /* renamed from: a */
        public final /* synthetic */ C15907f.C15909b f59418a;

        public C20980d(C15907f.C15909b bVar) {
            this.f59418a = bVar;
        }

        /* renamed from: a */
        public void mo24594a(Context context, boolean z, C52238za0 za02) {
            if (za02 == null || !z) {
                Log.m105924i("MicroMsg.SafeSwitchTipDialog", "doSave. response = success");
                this.f59418a.mo6380a();
                return;
            }
            Log.m105924i("MicroMsg.SafeSwitchTipDialog", "doSave. response = fail");
            this.f59418a.onSuccess();
        }
    }

    /* renamed from: hn2.j$e */
    public class C20981e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C98492e f59419d;

        public C20981e(C98492e eVar) {
            this.f59419d = eVar;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/setting/ui/utils/SafeSwitchTipDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C98492e eVar = this.f59419d;
            eVar.f288869S = true;
            eVar.mo140680z();
            C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/utils/SafeSwitchTipDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: hn2.j$f */
    public class C20982f implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C98492e f59420d;

        public C20982f(C98492e eVar) {
            this.f59420d = eVar;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/setting/ui/utils/SafeSwitchTipDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f59420d.mo140680z();
            C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/utils/SafeSwitchTipDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: hn2.j$g */
    public class C20983g implements C101218e0.C77394n {

        /* renamed from: a */
        public final /* synthetic */ SettingsManageFindOtherServiceUI.C19175c f59421a;

        /* renamed from: b */
        public final /* synthetic */ C98492e f59422b;

        public C20983g(SettingsManageFindOtherServiceUI.C19175c cVar, C98492e eVar) {
            this.f59421a = cVar;
            this.f59422b = eVar;
        }

        public void dismiss() {
            SettingsManageFindOtherServiceUI.C19175c cVar = this.f59421a;
            if (cVar != null) {
                cVar.mo24593a(this.f59422b.f288869S);
            }
        }
    }

    /* renamed from: hn2.j$h */
    public class C20984h implements C101218e0.C101230o {

        /* renamed from: a */
        public final /* synthetic */ C98492e f59423a;

        public C20984h(C98492e eVar) {
            this.f59423a = eVar;
        }

        /* renamed from: a */
        public void mo32720a(Dialog dialog, int i) {
            C98492e eVar = this.f59423a;
            boolean z = true;
            if (i != 1) {
                z = false;
            }
            eVar.f288869S = z;
            if (dialog != null) {
                dialog.dismiss();
            }
        }
    }

    /* renamed from: hn2.j$i */
    public class C20985i implements C20986j {

        /* renamed from: a */
        public final /* synthetic */ CheckBoxPreference f59424a;

        public C20985i(CheckBoxPreference checkBoxPreference) {
            this.f59424a = checkBoxPreference;
        }

        /* renamed from: a */
        public boolean mo24605a() {
            CheckBoxPreference checkBoxPreference = this.f59424a;
            if (checkBoxPreference != null) {
                return checkBoxPreference.mo6804J();
            }
            return false;
        }

        /* renamed from: b */
        public void mo24606b(boolean z) {
            CheckBoxPreference checkBoxPreference = this.f59424a;
            if (checkBoxPreference != null) {
                checkBoxPreference.mo6808N(z);
            }
        }
    }

    /* renamed from: hn2.j$j */
    public interface C20986j {
        /* renamed from: a */
        boolean mo24605a();

        /* renamed from: b */
        void mo24606b(boolean z);
    }

    /* renamed from: a */
    public static void m23147a(Context context, int i, int i2, long j, long j2, C23109g gVar) {
        m23148b(context, i, i2, j, j2, gVar, false);
    }

    /* renamed from: b */
    public static void m23148b(Context context, int i, int i2, long j, long j2, C23109g gVar, boolean z) {
        C23108c cVar = z ? new C23108c(context, i, i2, j, j2, gVar, true) : new C23108c(context, i, i2, j, j2, gVar);
        cVar.f66395g = true;
        if (cVar.f66393e instanceof Activity) {
            C23106b bVar = new C23106b(cVar);
            cVar.f66398j = bVar;
            MMHandlerThread.postToMainThreadDelayed(bVar, 200);
        }
        C23105a aVar = new C23105a(cVar);
        cVar.f66397i = aVar;
        MMHandlerThread.postToMainThreadDelayed(aVar, 60000);
        C86709a0.m107529k().f251779b.mo123455a(4071, cVar);
        C86709a0.m107529k().f251779b.mo123460f(cVar.f66405t ? new C53381j(cVar.f66396h, cVar.f66400o, cVar.f66404s, cVar.f66403r, true) : new C53381j(cVar.f66396h, cVar.f66400o, cVar.f66402q, cVar.f66401p, false));
    }

    /* renamed from: c */
    public static void m23149c(Context context, long j, boolean z, C15907f.C15909b bVar) {
        if (z) {
            m23156j(context, context.getString(m23152f(j)), new C20978c(context, j | 0, j, bVar), true);
            return;
        }
        long j2 = j | 0;
        Log.m105924i("MicroMsg.SafeSwitchTipDialog", "doSave. switchValue = " + 0 + ", WhichExtFunctionSwitch= " + j2);
        m23148b(context, 3, 2, j2, 0, new C20980d(bVar), true);
    }

    /* renamed from: d */
    public static List<String> m23150d(Context context) {
        ArrayList arrayList = new ArrayList();
        if ("zh_CN".equals(LocaleUtil.getCurrentLanguage(context))) {
            arrayList.add(context.getResources().getString(C0966R.string.ip7));
            arrayList.add(context.getResources().getString(C0966R.string.ip4));
            arrayList.add(context.getResources().getString(C0966R.string.n5d));
            arrayList.add(context.getResources().getString(C0966R.string.n5b));
        } else {
            arrayList.add(context.getResources().getString(C0966R.string.ip6));
            arrayList.add(context.getResources().getString(C0966R.string.f361288ip3));
            arrayList.add(context.getResources().getString(C0966R.string.n5c));
            arrayList.add(context.getResources().getString(C0966R.string.n5a));
        }
        return arrayList;
    }

    /* renamed from: e */
    public static List<String> m23151e(Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(context.getString(C0966R.string.ip5));
        arrayList.add(context.getString(C0966R.string.f361287ip2));
        arrayList.add(context.getString(C0966R.string.n55));
        arrayList.add(context.getString(C0966R.string.n54));
        return arrayList;
    }

    /* renamed from: f */
    public static int m23152f(long j) {
        return j == 34359738368L ? C0966R.string.f361267n51 : j == 67108864 ? C0966R.string.f361266n50 : j == 2097152 ? C0966R.string.f361268n52 : j == 16777216 ? C0966R.string.n4y : j == 8 ? C0966R.string.f361269n53 : j == 256 ? C0966R.string.n4z : C0966R.string.f361270in0;
    }

    /* renamed from: g */
    public static void m23153g(Context context, String str, String str2, String str3, C15907f.C15908a aVar) {
        C20975a aVar2 = new C20975a(aVar);
        C98492e eVar = new C98492e(context);
        TextView textView = eVar.f288863L;
        if (textView != null) {
            textView.setText(str);
        }
        TextView textView2 = eVar.f288864M;
        if (textView2 != null) {
            textView2.setText(str2);
        }
        C46084m mVar = new C46084m(eVar);
        Button button = eVar.f288865N;
        if (button != null) {
            button.setOnClickListener(mVar);
        }
        ((C76979h) C86312j.m106911c(C76979h.class)).mo107047GG(context, m23150d(context), str2, m23151e(context), eVar.f288864M);
        C46085n nVar = new C46085n(eVar);
        Button button2 = eVar.f288866P;
        if (button2 != null) {
            button2.setOnClickListener(nVar);
        }
        if (Util.isNullOrNil(str3)) {
            String string = context.getResources().getString(C0966R.string.mdh);
            Button button3 = eVar.f288865N;
            if (button3 != null) {
                button3.setText(string);
            }
        } else {
            Button button4 = eVar.f288865N;
            if (button4 != null) {
                button4.setText(str3);
            }
        }
        eVar.mo140665l(new C20990o(aVar2, eVar));
        Button button5 = eVar.f288866P;
        if (button5 != null) {
            button5.setTextColor(button5.getResources().getColor(C0966R.color.FG_0));
        }
        Button button6 = eVar.f288865N;
        if (button6 != null) {
            button6.setBackground(button6.getResources().getDrawable(C0966R.C0969drawable.f4663je));
        }
        Button button7 = eVar.f288865N;
        if (button7 != null) {
            button7.setTextColor(button7.getResources().getColor(C0966R.color.f3185i9));
        }
        TextView textView3 = eVar.f288864M;
        if (textView3 != null) {
            textView3.setTextSize(1, 14.0f);
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C0966R.dimen.f3760da);
        LinearLayout linearLayout = eVar.f288870T;
        if (linearLayout != null && (linearLayout.getLayoutParams() instanceof LinearLayout.LayoutParams)) {
            ((LinearLayout.LayoutParams) eVar.f288870T.getLayoutParams()).bottomMargin = dimensionPixelSize;
        }
        C98493p pVar = new C98493p(eVar);
        eVar.f296380K = pVar;
        C101218e0.C101229l lVar = eVar.f296382e;
        if (lVar != null) {
            lVar.f296416b.f296368i = pVar;
        }
        View view = eVar.f288871U;
        if (view != null) {
            eVar.mo140663j(view);
        }
        eVar.mo140655A();
    }

    /* renamed from: h */
    public static void m23154h(Context context, long j, CheckBoxPreference checkBoxPreference, C15907f.C15909b bVar, int i) {
        m23155i(context, j, new C20985i(checkBoxPreference), bVar, i, false);
    }

    /* renamed from: i */
    public static void m23155i(Context context, long j, C20986j jVar, C15907f.C15909b bVar, int i, boolean z) {
        Context context2 = context;
        m23156j(context, context.getString(m23152f(j)), new C20976b(context, i, j | 0, jVar, bVar, z), i == 3);
    }

    /* renamed from: j */
    public static void m23156j(Context context, String str, SettingsManageFindOtherServiceUI.C19175c cVar, boolean z) {
        String string = context.getString(C0966R.string.n56);
        C98492e eVar = new C98492e(context);
        TextView textView = eVar.f288863L;
        if (textView != null) {
            textView.setText(str);
        }
        TextView textView2 = eVar.f288864M;
        if (textView2 != null) {
            textView2.setText(string);
        }
        C20981e eVar2 = new C20981e(eVar);
        Button button = eVar.f288865N;
        if (button != null) {
            button.setOnClickListener(eVar2);
        }
        TextView textView3 = eVar.f288867Q;
        if (textView3 != null) {
            textView3.setVisibility(8);
        }
        ((C76979h) C86312j.m106911c(C76979h.class)).mo107047GG(context, m23150d(context), string, m23151e(context), eVar.f288864M);
        C20982f fVar = new C20982f(eVar);
        Button button2 = eVar.f288866P;
        if (button2 != null) {
            button2.setOnClickListener(fVar);
        }
        String string2 = context.getResources().getString(C0966R.string.imw);
        Button button3 = eVar.f288865N;
        if (button3 != null) {
            button3.setText(string2);
        }
        eVar.mo140665l(new C20983g(cVar, eVar));
        C20984h hVar = new C20984h(eVar);
        eVar.f296380K = hVar;
        C101218e0.C101229l lVar = eVar.f296382e;
        if (lVar != null) {
            lVar.f296416b.f296368i = hVar;
        }
        View view = eVar.f288871U;
        if (view != null) {
            eVar.mo140663j(view);
        }
        eVar.mo140655A();
    }

    /* renamed from: k */
    public static void m23157k(Context context) {
        C76912y0.m92769h(context, context.getResources().getString(C0966R.string.imx), C0966R.raw.icons_filled_error);
    }

    /* renamed from: l */
    public static void m23158l(Context context) {
        C76912y0.m92769h(context, context.getResources().getString(C0966R.string.imy), C0966R.raw.icons_filled_done);
    }
}
