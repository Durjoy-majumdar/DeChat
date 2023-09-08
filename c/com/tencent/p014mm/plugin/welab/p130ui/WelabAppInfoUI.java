package com.tencent.p014mm.plugin.welab.p130ui;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.MMSwitchBtn;
import com.tencent.p014mm.plugin.welab.p130ui.widget.WelabRoundCornerImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import f62.C75700k0;
import g62.C32330n;
import gc0.C20828a;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import la3.C117468g;
import la3.C117470l;
import na3.C117620h;
import ra3.C118229a;
import sa3.C118274a;
import sa3.C118275b;
import sa3.C13631c;
import tc0.C77885p;
import te3.C64585nm2;
import te3.C64611om2;

/* renamed from: com.tencent.mm.plugin.welab.ui.WelabAppInfoUI */
public class WelabAppInfoUI extends MMActivity {

    /* renamed from: d */
    public String f347596d;

    /* renamed from: e */
    public C118229a f347597e;

    /* renamed from: f */
    public int f347598f;

    /* renamed from: g */
    public boolean f347599g;

    /* renamed from: h */
    public WelabRoundCornerImageView f347600h;

    /* renamed from: i */
    public TextView f347601i;

    /* renamed from: j */
    public TextView f347602j;

    /* renamed from: n */
    public RecyclerView f347603n;

    /* renamed from: o */
    public View f347604o;

    /* renamed from: p */
    public Button f347605p;

    /* renamed from: q */
    public View f347606q;

    /* renamed from: r */
    public MMSwitchBtn f347607r;

    /* renamed from: s */
    public TextView f347608s;

    /* renamed from: t */
    public View f347609t;

    /* renamed from: u */
    public View f347610u;

    /* renamed from: v */
    public C115856c f347611v;

    /* renamed from: w */
    public View.OnClickListener f347612w = new C6630b();

    /* renamed from: com.tencent.mm.plugin.welab.ui.WelabAppInfoUI$b */
    public class C6630b implements View.OnClickListener {
        public C6630b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/welab/ui/WelabAppInfoUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            String obj = view.getTag().toString();
            Intent intent = new Intent();
            intent.putExtra("nowUrl", obj);
            intent.putExtra("urlList", (String[]) ((C115856c) WelabAppInfoUI.this.f347603n.getAdapter()).f347614d.toArray(new String[0]));
            WelabAppInfoUI welabAppInfoUI = WelabAppInfoUI.this;
            Intent intent2 = new Intent();
            intent2.putExtras(intent.getExtras());
            if (intent.getFlags() != 0) {
                intent2.addFlags(intent.getFlags());
            }
            C88144b.m109791i(welabAppInfoUI, "subapp", ".ui.gallery.GestureGalleryUI", intent2, (Bundle) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/welab/ui/WelabAppInfoUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.welab.ui.WelabAppInfoUI$a */
    public class C115855a implements MenuItem.OnMenuItemClickListener {
        public C115855a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            WelabAppInfoUI.this.hideVKB();
            WelabAppInfoUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.welab.ui.WelabAppInfoUI$c */
    public class C115856c extends RecyclerView.C16613e<C115857d> {

        /* renamed from: d */
        public List<String> f347614d;

        public C115856c() {
        }

        public int getItemCount() {
            return this.f347614d.size();
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            C115857d dVar = (C115857d) zVar;
            dVar.f347616z.setTag(this.f347614d.get(i));
            C20828a.m22825b().mo32519h(this.f347614d.get(i), dVar.f347616z, C117468g.f351552c.f351554b);
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            View inflate = WelabAppInfoUI.this.getLayoutInflater().inflate(C0966R.C0971layout.cie, viewGroup, false);
            C115857d dVar = new C115857d(WelabAppInfoUI.this, inflate);
            ImageView imageView = (ImageView) inflate.findViewById(C0966R.C0970id.f5s);
            dVar.f347616z = imageView;
            imageView.setOnClickListener(WelabAppInfoUI.this.f347612w);
            return dVar;
        }
    }

    /* renamed from: com.tencent.mm.plugin.welab.ui.WelabAppInfoUI$d */
    public class C115857d extends RecyclerView.C16631z {

        /* renamed from: z */
        public ImageView f347616z;

        public C115857d(WelabAppInfoUI welabAppInfoUI, View view) {
            super(view);
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cig;
    }

    public void initView() {
        super.initView();
        if (this.f347597e == null) {
            Log.m105920e("WelabAppInfoUI", "info is null");
            return;
        }
        setMMTitleVisibility(8);
        Window window = getWindow();
        window.clearFlags(201326592);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(getResources().getColor(C0966R.color.al5));
        if (getSupportActionBar() != null) {
            getSupportActionBar().mo91099j().setBackgroundColor(getResources().getColor(C0966R.color.al5));
        }
        setBackBtn(new C115855a());
        this.f347600h = (WelabRoundCornerImageView) findViewById(C0966R.C0970id.f6040vm);
        this.f347601i = (TextView) findViewById(C0966R.C0970id.knx);
        this.f347602j = (TextView) findViewById(C0966R.C0970id.k_z);
        this.f347603n = (RecyclerView) findViewById(C0966R.C0970id.f69);
        this.f347604o = findViewById(C0966R.C0970id.f6068we);
        this.f347605p = (Button) findViewById(C0966R.C0970id.hma);
        this.f347606q = findViewById(C0966R.C0970id.czf);
        this.f347607r = (MMSwitchBtn) findViewById(C0966R.C0970id.bab);
        this.f347608s = (TextView) findViewById(C0966R.C0970id.f359333kb0);
        this.f347609t = findViewById(C0966R.C0970id.k2m);
        this.f347610u = findViewById(C0966R.C0970id.hm4);
        this.f347603n.setLayoutManager(new LinearLayoutManager(this, 0, false));
        this.f347603n.setOverScrollMode(2);
        C115856c cVar = new C115856c();
        this.f347611v = cVar;
        this.f347603n.setAdapter(cVar);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean z = true;
        setIsDarkActionbarBg(true);
        hideActionbarLine();
        Intent intent = getIntent();
        if (intent != null) {
            String stringExtra = intent.getStringExtra("para_appid");
            this.f347596d = stringExtra;
            C118229a b = C117468g.f351552c.mo182173b(stringExtra);
            this.f347597e = b;
            this.f347598f = b.field_Switch;
            if (getIntent().getIntExtra("para_from_with_red_point", 0) != 1) {
                z = false;
            }
            this.f347599g = z;
        }
        initView();
        C117470l.m165698a(this.f347596d, 2, this.f347599g);
    }

    public void onPause() {
        super.onPause();
        if (this.f347598f != this.f347597e.field_Switch) {
            C117468g gVar = C117468g.f351552c;
            int i = 0;
            int i2 = 1;
            Log.m105925i("WelabAppInfoUI", "update welab info [%b] originSwitch[%d] newSwitch[%d]", Boolean.valueOf(gVar.mo182174c().update(this.f347597e, new String[0])), Integer.valueOf(this.f347598f), Integer.valueOf(this.f347597e.field_Switch));
            this.f347598f = this.f347597e.field_Switch;
            C64611om2 om22 = new C64611om2();
            C64585nm2 nm22 = new C64585nm2();
            C118229a aVar = this.f347597e;
            if (!(aVar.field_bItemFromXExpt == 1)) {
                i = Util.safeParseInt(aVar.field_expId);
            }
            nm22.f184497d = i;
            C118229a aVar2 = this.f347597e;
            nm22.f184498e = aVar2.field_LabsAppId;
            if (aVar2.field_Switch != 2) {
                i2 = 2;
            }
            nm22.f184499f = i2;
            om22.f184677d.add(nm22);
            ((C77885p) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96100XW()).mo107993q(new C32330n(207, om22));
            C117470l.m165698a(this.f347596d, this.f347597e.field_Switch == 2 ? 4 : 5, this.f347599g);
            if (this.f347597e.field_Switch == 2) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.f347597e);
                gVar.mo182177f(arrayList);
            }
        }
    }

    public void onResume() {
        String str;
        super.onResume();
        if (!this.f347597e.mo183027p2()) {
            View view = this.f347604o;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/welab/ui/WelabAppInfoUI", "setAppSiwtch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/welab/ui/WelabAppInfoUI", "setAppSiwtch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else if (this.f347597e.field_Type != 1) {
            View view3 = this.f347604o;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/welab/ui/WelabAppInfoUI", "setAppSiwtch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/welab/ui/WelabAppInfoUI", "setAppSiwtch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            View view5 = this.f347604o;
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar3.mo10233c(0);
            View view6 = view5;
            C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/welab/ui/WelabAppInfoUI", "setAppSiwtch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/welab/ui/WelabAppInfoUI", "setAppSiwtch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            TextView textView = this.f347608s;
            textView.setText(getResources().getString(C0966R.string.lkc) + this.f347597e.mo183024m2("field_Title"));
            SharedPreferences sharedPreferences = getSharedPreferences(getPackageName() + "_preferences", 0);
            this.f347607r.setEnabled(true);
            if (this.f347597e.field_Switch == 2) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putBoolean("switch_" + this.f347597e.field_LabsAppId, true).commit();
                this.f347607r.setCheck(true);
            } else {
                SharedPreferences.Editor edit2 = sharedPreferences.edit();
                edit2.putBoolean("switch_" + this.f347597e.field_LabsAppId, false).commit();
                this.f347607r.setCheck(false);
            }
            this.f347607r.setSwitchListener(new C118274a(this));
        }
        if (this.f347597e.mo183027p2()) {
            Button button = this.f347605p;
            button.setText(getResources().getString(C0966R.string.lk8) + this.f347597e.mo183024m2("field_Title"));
            if (this.f347597e.field_Type == 1) {
                this.f347605p.setVisibility(8);
            } else {
                this.f347605p.setVisibility(0);
                this.f347605p.setOnClickListener(new C118275b(this));
            }
        } else {
            this.f347605p.setVisibility(8);
        }
        this.f347601i.setText(C117468g.f351552c.mo182172a(this.f347597e));
        this.f347602j.setText(this.f347597e.mo183024m2("field_Introduce"));
        if (this.f347597e.mo183027p2()) {
            View view7 = this.f347606q;
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(0);
            View view8 = view7;
            C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/plugin/welab/ui/WelabAppInfoUI", "setFeedbackState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view8, "com/tencent/mm/plugin/welab/ui/WelabAppInfoUI", "setFeedbackState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f347606q.setOnClickListener(new C13631c(this));
        } else {
            View view9 = this.f347606q;
            C9556a aVar5 = new C9556a();
            aVar5.mo10233c(8);
            View view10 = view9;
            C117292a.m165358d(view10, aVar5.mo10232b(), "com/tencent/mm/plugin/welab/ui/WelabAppInfoUI", "setFeedbackState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view9.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
            C117292a.m165359e(view10, "com/tencent/mm/plugin/welab/ui/WelabAppInfoUI", "setFeedbackState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (this.f347597e.mo183027p2()) {
            View view11 = this.f347609t;
            C9556a aVar6 = new C9556a();
            aVar6.mo10233c(8);
            View view12 = view11;
            C117292a.m165358d(view12, aVar6.mo10232b(), "com/tencent/mm/plugin/welab/ui/WelabAppInfoUI", "setLabWarningState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view11.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
            C117292a.m165359e(view12, "com/tencent/mm/plugin/welab/ui/WelabAppInfoUI", "setLabWarningState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view13 = this.f347610u;
            C9556a aVar7 = new C9556a();
            aVar7.mo10233c(0);
            View view14 = view13;
            C117292a.m165358d(view14, aVar7.mo10232b(), "com/tencent/mm/plugin/welab/ui/WelabAppInfoUI", "setLabWarningState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view13.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
            C117292a.m165359e(view14, "com/tencent/mm/plugin/welab/ui/WelabAppInfoUI", "setLabWarningState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            View view15 = this.f347609t;
            C9556a aVar8 = new C9556a();
            aVar8.mo10233c(0);
            View view16 = view15;
            C117292a.m165358d(view16, aVar8.mo10232b(), "com/tencent/mm/plugin/welab/ui/WelabAppInfoUI", "setLabWarningState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view15.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
            C117292a.m165359e(view16, "com/tencent/mm/plugin/welab/ui/WelabAppInfoUI", "setLabWarningState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view17 = this.f347610u;
            C9556a aVar9 = new C9556a();
            aVar9.mo10233c(8);
            View view18 = view17;
            C117292a.m165358d(view18, aVar9.mo10232b(), "com/tencent/mm/plugin/welab/ui/WelabAppInfoUI", "setLabWarningState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view17.setVisibility(((Integer) aVar9.mo10231a(0)).intValue());
            C117292a.m165359e(view18, "com/tencent/mm/plugin/welab/ui/WelabAppInfoUI", "setLabWarningState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        String m2 = this.f347597e.mo183024m2("field_ImgUrl_android");
        if (TextUtils.isEmpty(m2)) {
            m2 = this.f347597e.mo183024m2("field_ImgUrl");
        }
        List<String> asList = TextUtils.isEmpty(m2) ? Collections.EMPTY_LIST : Arrays.asList(m2.split(";"));
        Iterator<String> it = asList.iterator();
        while (it.hasNext()) {
            if (TextUtils.isEmpty(it.next())) {
                it.remove();
            }
        }
        if (asList.isEmpty()) {
            this.f347603n.setVisibility(8);
        } else {
            this.f347603n.setVisibility(0);
            C115856c cVar = this.f347611v;
            cVar.f347614d = asList;
            cVar.notifyDataSetChanged();
        }
        this.f347600h.setCornerRadiusPercent(0.5f);
        C20828a b = C20828a.m22825b();
        C117468g gVar = C117468g.f351552c;
        C118229a aVar10 = this.f347597e;
        gVar.getClass();
        C117620h e = gVar.mo182176e(aVar10.field_LabsAppId);
        if (e != null) {
            str = e.nl0(aVar10.field_LabsAppId);
            Log.m105925i("WelabMgr", "get icon url from opener , appid %s, url %s", aVar10.field_LabsAppId, str);
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            str = aVar10.field_Icon;
        }
        b.mo32519h(str, this.f347600h, gVar.f351554b);
    }
}
