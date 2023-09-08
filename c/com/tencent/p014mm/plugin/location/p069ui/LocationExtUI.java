package com.tencent.p014mm.plugin.location.p069ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import pb1.C100734q;

/* renamed from: com.tencent.mm.plugin.location.ui.LocationExtUI */
public class LocationExtUI extends MMActivity {

    /* renamed from: d */
    public TextView f115034d;

    /* renamed from: e */
    public TextView f115035e;

    /* renamed from: f */
    public String f115036f;

    /* renamed from: g */
    public ArrayList<String> f115037g = new ArrayList<>();

    /* renamed from: com.tencent.mm.plugin.location.ui.LocationExtUI$a */
    public class C42499a implements View.OnClickListener {
        public C42499a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/location/ui/LocationExtUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent();
            intent.putExtra("key_fav_result_list", LocationExtUI.this.f115037g);
            C100734q.m131877u0(LocationExtUI.this.getContext(), ".ui.FavTagEditUI", intent, 4098, (Bundle) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/location/ui/LocationExtUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.location.ui.LocationExtUI$b */
    public class C42500b implements View.OnClickListener {
        public C42500b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/location/ui/LocationExtUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent(LocationExtUI.this.getContext(), RemarkUI.class);
            intent.putExtra("key_nullable", true);
            intent.putExtra("key_value", LocationExtUI.this.getIntent().getStringExtra("key_value"));
            intent.putExtra("key_hint", LocationExtUI.this.getString(C0966R.string.gbc));
            intent.putExtra("Kwebmap_locaion", LocationExtUI.this.getIntent().getStringExtra("Kwebmap_locaion"));
            intent.putExtra("MMActivity.OverrideExitAnimation", C0966R.C0968anim.f2469dt);
            intent.putExtra("MMActivity.OverrideEnterAnimation", C0966R.C0968anim.f2393bw);
            intent.putExtra("kFavInfoLocalId", LocationExtUI.this.getIntent().getLongExtra("kFavInfoLocalId", -1));
            intent.putExtra("kRemark", LocationExtUI.this.getIntent().getStringExtra("kRemark"));
            LocationExtUI.this.startActivityForResult(intent, 4097);
            C117292a.m165361g(this, "com/tencent/mm/plugin/location/ui/LocationExtUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.location.ui.LocationExtUI$c */
    public class C42501c implements MenuItem.OnMenuItemClickListener {
        public C42501c() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            Intent intent = new Intent();
            intent.putExtra("key_remark_result", LocationExtUI.this.f115036f);
            intent.putExtra("key_tags_result", LocationExtUI.this.f115037g);
            LocationExtUI.this.setResult(-1, intent);
            LocationExtUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.location.ui.LocationExtUI$d */
    public class C42502d implements MenuItem.OnMenuItemClickListener {
        public C42502d() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            LocationExtUI.this.finish();
            return true;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f359863b82;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (4097 == i) {
            if (-1 == i2 && intent != null) {
                CharSequence charSequenceExtra = intent.getCharSequenceExtra("key_result");
                String charSequence = charSequenceExtra == null ? "" : charSequenceExtra.toString();
                this.f115036f = charSequence;
                this.f115035e.setText(charSequence);
            }
        } else if (4098 != i) {
            super.onActivityResult(i, i2, intent);
        } else if (-1 == i2 && intent != null) {
            this.f115037g.clear();
            String[] stringArrayExtra = intent.getStringArrayExtra("key_fav_result_array");
            if (stringArrayExtra != null && stringArrayExtra.length > 0) {
                String str = stringArrayExtra[0];
                this.f115037g.add(str);
                String string = getResources().getString(C0966R.string.cry);
                for (int i3 = 1; i3 < stringArrayExtra.length; i3++) {
                    this.f115037g.add(stringArrayExtra[i3]);
                    str = str + string + stringArrayExtra[i3];
                }
                this.f115034d.setText(str);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("Kwebmap_locaion");
        if (Util.isNullOrNil(stringExtra)) {
            View findViewById = findViewById(C0966R.C0970id.g4a);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/location/ui/LocationExtUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(findViewById, "com/tencent/mm/plugin/location/ui/LocationExtUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            ((TextView) findViewById(C0966R.C0970id.g4u)).setText(stringExtra);
        }
        this.f115034d = (TextView) findViewById(C0966R.C0970id.keq);
        this.f115035e = (TextView) findViewById(C0966R.C0970id.iky);
        this.f115034d.setOnClickListener(new C42499a());
        this.f115035e.setOnClickListener(new C42500b());
        addTextOptionMenu(0, getString(C0966R.string.f8014z_), new C42501c(), (View.OnLongClickListener) null, MMActivityController.C73075r.GREEN);
        setBackBtn(new C42502d());
    }
}
