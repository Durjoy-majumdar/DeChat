package com.tencent.p014mm.plugin.updater.p116ui;

import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import b12.C79645d;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.secdata.p843ui.MMSecDataActivity;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86013q1;
import fy3.C32224a;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import kotlin.Metadata;
import o40.C61926c;
import p1054vg.C90793a;
import p1054vg.C90795b;
import rx3.C13598b0;
import te3.rg4;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/updater/ui/AutoUpdateDialogSettingUI;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "<init>", "()V", "plugin-updater_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.updater.ui.AutoUpdateDialogSettingUI */
public final class AutoUpdateDialogSettingUI extends MMSecDataActivity {

    /* renamed from: d */
    public static final /* synthetic */ int f21633d = 0;

    /* renamed from: com.tencent.mm.plugin.updater.ui.AutoUpdateDialogSettingUI$a */
    public static final class C5664a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ AutoUpdateDialogSettingUI f21634d;

        public C5664a(AutoUpdateDialogSettingUI autoUpdateDialogSettingUI) {
            this.f21634d = autoUpdateDialogSettingUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f21634d.finish();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.updater.ui.AutoUpdateDialogSettingUI$b */
    public static final class C5665b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ AutoUpdateDialogSettingUI f21635d;

        /* renamed from: com.tencent.mm.plugin.updater.ui.AutoUpdateDialogSettingUI$b$a */
        public static final class C5666a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ AutoUpdateDialogSettingUI f21636d;

            /* renamed from: e */
            public final /* synthetic */ String f21637e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C5666a(AutoUpdateDialogSettingUI autoUpdateDialogSettingUI, String str) {
                super(0);
                this.f21636d = autoUpdateDialogSettingUI;
                this.f21637e = str;
            }

            public Object invoke() {
                String str;
                C90795b bVar;
                C79645d.m96730f(MMApplicationContext.getContext());
                AutoUpdateDialogSettingUI autoUpdateDialogSettingUI = this.f21636d;
                String str2 = this.f21637e;
                int i = AutoUpdateDialogSettingUI.f21633d;
                autoUpdateDialogSettingUI.getClass();
                rg4 rg4 = new rg4();
                rg4.f259796d = "";
                AppCompatActivity context = autoUpdateDialogSettingUI.getContext();
                String str3 = null;
                rg4.f259801i = context != null ? context.getString(C0966R.string.f0j) : null;
                AppCompatActivity context2 = autoUpdateDialogSettingUI.getContext();
                rg4.f259803n = context2 != null ? context2.getString(C0966R.string.frd) : null;
                AppCompatActivity context3 = autoUpdateDialogSettingUI.getContext();
                rg4.f259804o = context3 != null ? context3.getString(C0966R.string.k6v) : null;
                rg4.f259799g = "";
                try {
                    str = autoUpdateDialogSettingUI.getPackageManager().getPackageInfo(autoUpdateDialogSettingUI.getPackageName(), 0).applicationInfo.sourceDir;
                } catch (Exception unused) {
                    str = null;
                }
                if (str != null) {
                    Uri n = C116299g2.m163858n(str);
                    String path = n.getPath();
                    if (path != null) {
                        String k = C116299g2.m163855k(path, false, false);
                        if (!n.getPath().equals(k)) {
                            n = n.buildUpon().path(k).build();
                        }
                    }
                    C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
                    if (!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b)) {
                        if (MMApplicationContext.getContext().getApplicationInfo().targetSdkVersion <= 29) {
                            C90793a b = C90793a.m113861b(str);
                            str3 = (b == null || (bVar = b.f260724b) == null) ? C86013q1.m106456q(str) : bVar.f260727d;
                        } else {
                            str3 = C86013q1.m106456q(str);
                        }
                    }
                }
                rg4.f259800h = str3;
                rg4.f259798f = 0;
                rg4.f259805p = "";
                rg4.f259806q = "";
                rg4.f259807r = 0;
                rg4.f259797e = "";
                try {
                    rg4.f259808s = C79645d.m96741q(str2);
                } catch (Exception unused2) {
                }
                rg4.f259802j = "";
                C79645d.m96744t(rg4);
                C61926c.m72668M(new C5667a(this.f21636d));
                return C13598b0.f38549a;
            }
        }

        public C5665b(AutoUpdateDialogSettingUI autoUpdateDialogSettingUI) {
            this.f21635d = autoUpdateDialogSettingUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/updater/ui/AutoUpdateDialogSettingUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            String obj = ((EditText) this.f21635d.findViewById(C0966R.C0970id.bdu)).getText().toString();
            if (!(obj == null || obj.length() == 0)) {
                C61926c.m72656A((String) null, new C5666a(this.f21635d, obj));
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/updater/ui/AutoUpdateDialogSettingUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6530hd;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.a_o);
        setBackBtn(new C5664a(this));
        findViewById(C0966R.C0970id.hll).setOnClickListener(new C5665b(this));
    }
}
