package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C6975i1;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.contact.C74560s1;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.C82086j;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiSetAudioState;
import com.tencent.p014mm.plugin.sns.model.C43041n0;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C75592q0;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import ke3.C88144b;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import os2.C11765l0;
import qo3.C89779i0;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI */
public class SnsTagPartlyUI extends MMActivity implements C11385n {

    /* renamed from: h */
    public static final /* synthetic */ int f21215h = 0;

    /* renamed from: d */
    public ListView f21216d;

    /* renamed from: e */
    public C5466f f21217e;

    /* renamed from: f */
    public C89779i0 f21218f = null;

    /* renamed from: g */
    public View.OnClickListener f21219g = new C5464e();

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI$a */
    public class C5460a implements MenuItem.OnMenuItemClickListener {
        public C5460a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI$1");
            SnsTagPartlyUI.this.finish();
            SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI$1");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI$b */
    public class C5461b implements AdapterView.OnItemClickListener {
        public C5461b() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            int i2 = i;
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsTagPartlyUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI$2");
            if (i2 < SnsTagPartlyUI.m5386H7(SnsTagPartlyUI.this).getCount() - 1) {
                Intent intent = new Intent();
                C11765l0 l0Var = (C11765l0) SnsTagPartlyUI.m5386H7(SnsTagPartlyUI.this).getItem(i2);
                if (l0Var == null) {
                    SnsMethodCalculate.markEndTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI$2");
                    C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsTagPartlyUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                    return;
                }
                intent.putExtra("k_sns_tag_id", l0Var.field_tagId);
                intent.setClass(SnsTagPartlyUI.this, SnsTagDetailUI.class);
                SnsTagPartlyUI snsTagPartlyUI = SnsTagPartlyUI.this;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                SnsTagPartlyUI snsTagPartlyUI2 = snsTagPartlyUI;
                C117292a.m165358d(snsTagPartlyUI2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsTagPartlyUI$2", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                snsTagPartlyUI.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(snsTagPartlyUI2, "com/tencent/mm/plugin/sns/ui/SnsTagPartlyUI$2", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else {
                Intent intent2 = new Intent();
                String s = C75592q0.m90789s();
                intent2.putExtra("titile", SnsTagPartlyUI.this.getString(C0966R.string.f7492hq));
                intent2.putExtra("list_type", 1);
                intent2.putExtra("KBlockOpenImFav", true);
                C74560s1.m89276e();
                intent2.putExtra("list_attr", C74560s1.m89278g(C74560s1.f219162c, 1024, 64, 262144) & -16777217);
                intent2.putExtra("min_limit_num", 1);
                intent2.putExtra("block_contact", s);
                C88144b.m109802t(SnsTagPartlyUI.this, ".ui.contact.SelectContactUI", intent2, 1);
            }
            SnsMethodCalculate.markEndTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI$2");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsTagPartlyUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI$c */
    public class C5462c implements MenuItem.OnMenuItemClickListener {
        public C5462c() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            int i;
            SnsTagPartlyUI snsTagPartlyUI;
            SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI$3");
            SnsTagPartlyUI.m5386H7(SnsTagPartlyUI.this).f21226p = !SnsTagPartlyUI.m5386H7(SnsTagPartlyUI.this).f21226p;
            SnsTagPartlyUI snsTagPartlyUI2 = SnsTagPartlyUI.this;
            if (SnsTagPartlyUI.m5386H7(snsTagPartlyUI2).f21226p) {
                snsTagPartlyUI = SnsTagPartlyUI.this;
                i = C0966R.string.f8014z_;
            } else {
                snsTagPartlyUI = SnsTagPartlyUI.this;
                i = C0966R.string.jia;
            }
            snsTagPartlyUI2.updateOptionMenuText(0, snsTagPartlyUI.getString(i));
            SnsTagPartlyUI.m5386H7(SnsTagPartlyUI.this).notifyDataSetChanged();
            SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI$3");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI$d */
    public class C5463d implements C6975i1.C6977b {
        public C5463d() {
        }

        /* renamed from: a */
        public void mo1327a(Object obj) {
            SnsMethodCalculate.markStartTimeMs("onPostReset", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI$4");
            SnsTagPartlyUI snsTagPartlyUI = SnsTagPartlyUI.this;
            boolean z = true;
            if (SnsTagPartlyUI.m5386H7(snsTagPartlyUI).getCount() <= 1) {
                z = false;
            }
            snsTagPartlyUI.enableOptionMenu(z);
            SnsMethodCalculate.markEndTimeMs("onPostReset", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI$4");
        }

        /* renamed from: b */
        public void mo1328b(Object obj) {
            SnsMethodCalculate.markStartTimeMs("onPreReset", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI$4");
            SnsMethodCalculate.markEndTimeMs("onPreReset", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI$4");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI$e */
    public class C5464e implements View.OnClickListener {

        /* renamed from: com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI$e$a */
        public class C5465a implements DialogInterface.OnCancelListener {
            public C5465a(C5464e eVar) {
            }

            public void onCancel(DialogInterface dialogInterface) {
                SnsMethodCalculate.markStartTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI$5$1");
                SnsMethodCalculate.markEndTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI$5$1");
            }
        }

        public C5464e() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsTagPartlyUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI$5");
            if (SnsTagPartlyUI.m5386H7(SnsTagPartlyUI.this) == null) {
                Log.m105920e("MicroMsg.SnsTagPartlyUI", "The adapter is null..");
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI$5");
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsTagPartlyUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            Object tag = view.getTag();
            if (tag == null) {
                Log.m105920e("MicroMsg.SnsTagPartlyUI", "The tag is null..");
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI$5");
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsTagPartlyUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            } else if (!(tag instanceof Integer)) {
                Log.m105920e("MicroMsg.SnsTagPartlyUI", "The tag is not a instance of Integer.");
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI$5");
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsTagPartlyUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            } else {
                C11765l0 l0Var = (C11765l0) SnsTagPartlyUI.m5386H7(SnsTagPartlyUI.this).getItem(((Integer) tag).intValue());
                SnsTagPartlyUI snsTagPartlyUI = SnsTagPartlyUI.this;
                snsTagPartlyUI.f21218f = C76879j.m92723Q(snsTagPartlyUI, (String) null, (String) null, true, true, new C5465a(this));
                C86709a0.m107528h();
                C86709a0.m107529k().f251779b.mo123460f(new C43041n0(3, l0Var.field_tagId, l0Var.field_tagName));
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI$5");
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsTagPartlyUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI$f */
    public class C5466f extends C6975i1<C11765l0> {

        /* renamed from: o */
        public Context f21225o;

        /* renamed from: p */
        public boolean f21226p = false;

        /* renamed from: com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI$f$a */
        public class C5467a {

            /* renamed from: a */
            public TextView f21228a;

            /* renamed from: b */
            public TextView f21229b;

            /* renamed from: c */
            public Button f21230c;

            public C5467a(C5466f fVar) {
            }
        }

        public C5466f(Context context) {
            super(context, new C11765l0());
            this.f21225o = context;
        }

        /* renamed from: d */
        public Object mo1330d(Object obj, Cursor cursor) {
            SnsMethodCalculate.markStartTimeMs("convertFrom", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI$TagAdapter");
            C11765l0 l0Var = (C11765l0) obj;
            SnsMethodCalculate.markStartTimeMs("convertFrom", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI$TagAdapter");
            if (l0Var == null) {
                l0Var = new C11765l0();
                Log.m105918d("MicroMsg.SnsTagPartlyUI", "new SnsInfo");
            }
            l0Var.convertFrom(cursor);
            SnsMethodCalculate.markEndTimeMs("convertFrom", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI$TagAdapter");
            SnsMethodCalculate.markEndTimeMs("convertFrom", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI$TagAdapter");
            return l0Var;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C5467a aVar;
            View view2;
            SnsMethodCalculate.markStartTimeMs("getView", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI$TagAdapter");
            if (view == null) {
                aVar = new C5467a(this);
                view2 = View.inflate(this.f21225o, C0966R.C0971layout.bm7, (ViewGroup) null);
                aVar.f21228a = (TextView) view2.findViewById(C0966R.C0970id.kee);
                aVar.f21229b = (TextView) view2.findViewById(C0966R.C0970id.jwg);
                aVar.f21230c = (Button) view2.findViewById(C0966R.C0970id.c0a);
                view2.setTag(aVar);
            } else {
                view2 = view;
                aVar = (C5467a) view.getTag();
            }
            int i2 = 8;
            if (!mo7996n(i)) {
                C11765l0 l0Var = (C11765l0) getItem(i);
                TextView textView = aVar.f21228a;
                textView.setText(l0Var.field_tagName + "");
                aVar.f21229b.setVisibility(0);
                TextView textView2 = aVar.f21229b;
                textView2.setText(" (" + l0Var.field_count + ") ");
                Button button = aVar.f21230c;
                if (this.f21226p) {
                    i2 = 0;
                }
                button.setVisibility(i2);
                Button button2 = aVar.f21230c;
                SnsTagPartlyUI snsTagPartlyUI = SnsTagPartlyUI.this;
                int i3 = SnsTagPartlyUI.f21215h;
                SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI");
                View.OnClickListener onClickListener = snsTagPartlyUI.f21219g;
                SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI");
                button2.setOnClickListener(onClickListener);
                aVar.f21230c.setTag(Integer.valueOf(i));
            } else {
                aVar.f21228a.setText(C0966R.string.jsz);
                aVar.f21229b.setVisibility(8);
                aVar.f21230c.setVisibility(8);
            }
            SnsMethodCalculate.markEndTimeMs("getView", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI$TagAdapter");
            return view2;
        }

        /* renamed from: i */
        public int mo6470i() {
            SnsMethodCalculate.markStartTimeMs("getVirtualCount", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI$TagAdapter");
            SnsMethodCalculate.markEndTimeMs("getVirtualCount", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI$TagAdapter");
            return 1;
        }

        /* renamed from: l */
        public void mo1332l() {
            SnsMethodCalculate.markStartTimeMs("initCursor", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI$TagAdapter");
            mo5580b();
            mo1333o();
            SnsMethodCalculate.markEndTimeMs("initCursor", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI$TagAdapter");
        }

        /* renamed from: o */
        public void mo1333o() {
            SnsMethodCalculate.markStartTimeMs("resetCursor", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI$TagAdapter");
            mo7998r(C94866e1.ey0().mo11653Yt());
            notifyDataSetChanged();
            SnsMethodCalculate.markEndTimeMs("resetCursor", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI$TagAdapter");
        }
    }

    /* renamed from: H7 */
    public static /* synthetic */ C5466f m5386H7(SnsTagPartlyUI snsTagPartlyUI) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI");
        C5466f fVar = snsTagPartlyUI.f21217e;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI");
        return fVar;
    }

    public int getLayoutId() {
        SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI");
        SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI");
        return C0966R.C0971layout.c4g;
    }

    public void initView() {
        SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI");
        setMMTitle((int) C0966R.string.ix6);
        setBackBtn(new C5460a());
        ListView listView = (ListView) findViewById(C0966R.C0970id.jwk);
        this.f21216d = listView;
        listView.setOnItemClickListener(new C5461b());
        this.f21217e = new C5466f(this);
        this.f21216d.addFooterView(View.inflate(this, C0966R.C0971layout.c4f, (ViewGroup) null));
        this.f21216d.setAdapter(this.f21217e);
        addTextOptionMenu(0, getString(C0966R.string.jia), new C5462c());
        this.f21217e.f24699h = new C5463d();
        SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI");
        super.onActivityResult(i, i2, intent);
        if (i2 != -1) {
            SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI");
            return;
        }
        if (i == 1) {
            if (intent == null) {
                SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI");
                return;
            }
            String stringExtra = intent.getStringExtra("Select_Contact");
            String stringExtra2 = intent.getStringExtra("Select_room_name");
            if (stringExtra == null) {
                SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI");
                return;
            }
            Intent intent2 = new Intent();
            intent2.putExtra("k_sns_tag_id", 0);
            intent2.putExtra("k_sns_tag_name", Util.nullAs(stringExtra2, ""));
            intent2.putExtra("k_sns_tag_list", stringExtra);
            intent2.setClass(this, SnsTagDetailUI.class);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent2);
            C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsTagPartlyUI", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/sns/ui/SnsTagPartlyUI", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI");
    }

    public void onCreate(Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI");
        super.onCreate(bundle);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(JsApiSetAudioState.CTRL_INDEX, this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(C82086j.CTRL_INDEX, this);
        initView();
        SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI");
    }

    public void onDestroy() {
        SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI");
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(JsApiSetAudioState.CTRL_INDEX, this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(C82086j.CTRL_INDEX, this);
        C5466f fVar = this.f21217e;
        if (fVar != null) {
            fVar.mo5580b();
        }
        super.onDestroy();
        SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI");
    }

    public void onResume() {
        SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI");
        super.onResume();
        C5466f fVar = this.f21217e;
        if (fVar != null) {
            fVar.mo7991f();
        }
        SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI");
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        SnsMethodCalculate.markStartTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI");
        Log.m105924i("MicroMsg.SnsTagPartlyUI", "onSceneEnd: errType = " + i + " errCode = " + i2 + " errMsg = " + str);
        C89779i0 i0Var = this.f21218f;
        if (i0Var != null) {
            i0Var.dismiss();
            this.f21218f = null;
        }
        C5466f fVar = this.f21217e;
        if (fVar != null) {
            fVar.mo7991f();
        }
        SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI");
    }
}
