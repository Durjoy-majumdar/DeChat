package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.AbsListView;
import android.widget.ListView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.sns.model.C94853e;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94901o;
import com.tencent.p014mm.plugin.sns.p106ui.C95960j;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import di3.C86312j;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47349a0;
import p214om.C11502f;
import qo3.C89779i0;
import te3.C64545m7;

/* renamed from: com.tencent.mm.plugin.sns.ui.ArtistUI */
public class ArtistUI extends MMActivity implements C11385n {

    /* renamed from: r */
    public static final /* synthetic */ int f276647r = 0;

    /* renamed from: d */
    public C95960j f276648d;

    /* renamed from: e */
    public ListView f276649e;

    /* renamed from: f */
    public ArtistHeader f276650f;

    /* renamed from: g */
    public String f276651g = "";

    /* renamed from: h */
    public C89779i0 f276652h = null;

    /* renamed from: i */
    public SharedPreferences f276653i;

    /* renamed from: j */
    public MMHandler f276654j = C94866e1.ly0();

    /* renamed from: n */
    public C94901o f276655n = C94866e1.Fx0();

    /* renamed from: o */
    public C94853e f276656o = C94866e1.Vx0();

    /* renamed from: p */
    public Runnable f276657p = new C95314a();

    /* renamed from: q */
    public Runnable f276658q = new C95315b();

    /* renamed from: com.tencent.mm.plugin.sns.ui.ArtistUI$a */
    public class C95314a implements Runnable {
        public C95314a() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.ArtistUI$1");
            if (ArtistUI.m121411H7(ArtistUI.this) == null) {
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.ArtistUI$1");
                return;
            }
            Log.m105918d("MicroMsg.ArtistUI", "will pause ImageLoader");
            C94866e1.Fx0().mo131082B();
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.ArtistUI$1");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.ArtistUI$b */
    public class C95315b implements Runnable {
        public C95315b() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.ArtistUI$2");
            if (ArtistUI.m121411H7(ArtistUI.this) == null) {
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.ArtistUI$2");
                return;
            }
            Log.m105918d("MicroMsg.ArtistUI", "will start ImageLoader");
            C94866e1.Fx0().mo131118g0();
            ArtistUI.m121411H7(ArtistUI.this).notifyDataSetChanged();
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.ArtistUI$2");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.ArtistUI$c */
    public class C95316c implements DialogInterface.OnCancelListener {
        public C95316c(ArtistUI artistUI) {
        }

        public void onCancel(DialogInterface dialogInterface) {
            SnsMethodCalculate.markStartTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.ArtistUI$3");
            SnsMethodCalculate.markEndTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.ArtistUI$3");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.ArtistUI$d */
    public class C95317d extends C95960j.C95963c {
        public C95317d() {
        }

        /* renamed from: a */
        public void mo132042a(String str, int i) {
            SnsMethodCalculate.markStartTimeMs("onPhotoClick", "com.tencent.mm.plugin.sns.ui.ArtistUI$4");
            Intent intent = new Intent();
            intent.putExtra("sns_gallery_is_artist", true);
            intent.putExtra("sns_gallery_position", i);
            ArtistUI artistUI = ArtistUI.this;
            int i2 = ArtistUI.f276647r;
            SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.ArtistUI");
            String str2 = artistUI.f276651g;
            SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.ArtistUI");
            intent.putExtra("sns_gallery_artist_lan", str2);
            intent.putExtra("sns_gallery_showtype", 2);
            intent.putExtra("key_from_scene", 6);
            intent.setClass(ArtistUI.this, ArtistBrowseUI.class);
            ArtistUI artistUI2 = ArtistUI.this;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            ArtistUI artistUI3 = artistUI2;
            C117292a.m165358d(artistUI3, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/ArtistUI$4", "onPhotoClick", "(Ljava/lang/String;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            artistUI2.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(artistUI3, "com/tencent/mm/plugin/sns/ui/ArtistUI$4", "onPhotoClick", "(Ljava/lang/String;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            SnsMethodCalculate.markEndTimeMs("onPhotoClick", "com.tencent.mm.plugin.sns.ui.ArtistUI$4");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.ArtistUI$e */
    public class C95318e implements C95960j.C95962b {
        public C95318e() {
        }

        /* renamed from: a */
        public void mo132043a(C64545m7 m7Var) {
            SnsMethodCalculate.markStartTimeMs("onGetAuthor", "com.tencent.mm.plugin.sns.ui.ArtistUI$5");
            if (ArtistUI.m121412I7(ArtistUI.this) != null) {
                ArtistUI.m121412I7(ArtistUI.this).setVisibility(0);
                ArtistUI.m121412I7(ArtistUI.this).setUserName(m7Var);
                String str = m7Var.f184209d;
                if (str != null && !str.equals("")) {
                    ArtistUI artistUI = ArtistUI.this;
                    SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.ArtistUI");
                    SharedPreferences sharedPreferences = artistUI.f276653i;
                    SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.ArtistUI");
                    sharedPreferences.edit().putString("artist_name", str).commit();
                }
                if (ArtistUI.m121411H7(ArtistUI.this) != null) {
                    ArtistUI.m121411H7(ArtistUI.this).notifyDataSetChanged();
                }
            }
            ArtistUI artistUI2 = ArtistUI.this;
            SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.ArtistUI");
            C89779i0 i0Var = artistUI2.f276652h;
            SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.ArtistUI");
            i0Var.dismiss();
            SnsMethodCalculate.markEndTimeMs("onGetAuthor", "com.tencent.mm.plugin.sns.ui.ArtistUI$5");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.ArtistUI$f */
    public class C95319f implements AbsListView.OnScrollListener {
        public C95319f() {
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            arrayList.add(Integer.valueOf(i3));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/ArtistUI$6", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onScroll", "com.tencent.mm.plugin.sns.ui.ArtistUI$6");
            SnsMethodCalculate.markEndTimeMs("onScroll", "com.tencent.mm.plugin.sns.ui.ArtistUI$6");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/ArtistUI$6", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/ArtistUI$6", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.ArtistUI$6");
            if (i == 2) {
                if (ArtistUI.this.f276655n.mo131142y() || ArtistUI.this.f276656o.mo130993r()) {
                    ArtistUI artistUI = ArtistUI.this;
                    MMHandler mMHandler = artistUI.f276654j;
                    SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.ArtistUI");
                    Runnable runnable = artistUI.f276657p;
                    SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.ArtistUI");
                    mMHandler.removeCallbacks(runnable);
                    ArtistUI artistUI2 = ArtistUI.this;
                    MMHandler mMHandler2 = artistUI2.f276654j;
                    SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.ArtistUI");
                    Runnable runnable2 = artistUI2.f276658q;
                    SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.ArtistUI");
                    mMHandler2.removeCallbacks(runnable2);
                    ArtistUI artistUI3 = ArtistUI.this;
                    MMHandler mMHandler3 = artistUI3.f276654j;
                    SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.ArtistUI");
                    Runnable runnable3 = artistUI3.f276657p;
                    SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.ArtistUI");
                    mMHandler3.postDelayed(runnable3, 0);
                }
            } else if (!ArtistUI.this.f276655n.mo131142y() || !ArtistUI.this.f276656o.mo130993r()) {
                ArtistUI artistUI4 = ArtistUI.this;
                MMHandler mMHandler4 = artistUI4.f276654j;
                SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.ArtistUI");
                Runnable runnable4 = artistUI4.f276657p;
                SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.ArtistUI");
                mMHandler4.removeCallbacks(runnable4);
                ArtistUI artistUI5 = ArtistUI.this;
                MMHandler mMHandler5 = artistUI5.f276654j;
                SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.ArtistUI");
                Runnable runnable5 = artistUI5.f276658q;
                SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.ArtistUI");
                mMHandler5.removeCallbacks(runnable5);
                ArtistUI artistUI6 = ArtistUI.this;
                MMHandler mMHandler6 = artistUI6.f276654j;
                SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.ArtistUI");
                Runnable runnable6 = artistUI6.f276658q;
                SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.ArtistUI");
                mMHandler6.postDelayed(runnable6, 0);
            } else {
                SnsMethodCalculate.markEndTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.ArtistUI$6");
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/ArtistUI$6", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
                return;
            }
            SnsMethodCalculate.markEndTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.ArtistUI$6");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/ArtistUI$6", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.ArtistUI$g */
    public class C95320g implements MenuItem.OnMenuItemClickListener {
        public C95320g() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.ArtistUI$7");
            ArtistUI.this.finish();
            SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.ArtistUI$7");
            return true;
        }
    }

    /* renamed from: H7 */
    public static /* synthetic */ C95960j m121411H7(ArtistUI artistUI) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.ArtistUI");
        C95960j jVar = artistUI.f276648d;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.ArtistUI");
        return jVar;
    }

    /* renamed from: I7 */
    public static /* synthetic */ ArtistHeader m121412I7(ArtistUI artistUI) {
        SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.ArtistUI");
        ArtistHeader artistHeader = artistUI.f276650f;
        SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.ArtistUI");
        return artistHeader;
    }

    public int getLayoutId() {
        SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.ArtistUI");
        SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.ArtistUI");
        return C0966R.C0971layout.c2_;
    }

    public void initView() {
        SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.ArtistUI");
        setMMTitle((int) C0966R.string.iz5);
        setActionbarColor(getResources().getColor(C0966R.color.acu));
        setNavigationbarColor(getResources().getColor(C0966R.color.acu));
        this.f276652h = C76879j.m92723Q(this, getString(C0966R.string.a3h), getString(C0966R.string.a05), true, true, new C95316c(this));
        this.f276649e = (ListView) findViewById(C0966R.C0970id.jrn);
        ((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().xs0(4, false);
        this.f276648d = new C95960j(this, this.f276651g, new C95317d(), new C95318e());
        this.f276649e.setOnScrollListener(new C95319f());
        ArtistHeader artistHeader = new ArtistHeader(this);
        this.f276650f = artistHeader;
        this.f276649e.addHeaderView(artistHeader);
        this.f276649e.setAdapter(this.f276648d);
        this.f276648d.notifyDataSetChanged();
        this.f276650f.setVisibility(8);
        setBackBtn(new C95320g());
        SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.ArtistUI");
    }

    public void onCreate(Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.ArtistUI");
        super.onCreate(bundle);
        SnsMethodCalculate.markStartTimeMs("filterLan", "com.tencent.mm.plugin.sns.ui.ArtistUI");
        String loadApplicationLanguage = LocaleUtil.loadApplicationLanguage(getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0), this);
        Log.m105918d("MicroMsg.ArtistUI", "filterLan temp " + loadApplicationLanguage);
        if (loadApplicationLanguage.equals("zh_CN") || loadApplicationLanguage.equals("en") || loadApplicationLanguage.equals("zh_TW")) {
            SnsMethodCalculate.markEndTimeMs("filterLan", "com.tencent.mm.plugin.sns.ui.ArtistUI");
        } else {
            loadApplicationLanguage = loadApplicationLanguage.equals("zh_HK") ? "zh_TW" : "en";
            SnsMethodCalculate.markEndTimeMs("filterLan", "com.tencent.mm.plugin.sns.ui.ArtistUI");
        }
        this.f276651g = loadApplicationLanguage;
        Log.m105918d("MicroMsg.ArtistUI", "lan " + this.f276651g);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(159, this);
        this.f276653i = getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0);
        initView();
        ArtistHeader artistHeader = this.f276650f;
        artistHeader.getClass();
        SnsMethodCalculate.markStartTimeMs("onAttach", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
        C94866e1.Vx0().mo130978c(artistHeader);
        SnsMethodCalculate.markEndTimeMs("onAttach", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
        SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.ArtistUI");
    }

    public void onDestroy() {
        SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.ArtistUI");
        super.onDestroy();
        if (this.f276652h != null) {
            this.f276652h = null;
        }
        ArtistHeader artistHeader = this.f276650f;
        if (artistHeader != null) {
            artistHeader.getClass();
            SnsMethodCalculate.markStartTimeMs("onDetch", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
            C94866e1.Vx0().mo130997v(artistHeader);
            SnsMethodCalculate.markEndTimeMs("onDetch", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
        }
        C94866e1.Fx0().mo131089I(this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(159, this);
        SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.ArtistUI");
    }

    public void onPause() {
        SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.ArtistUI");
        super.onPause();
        SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.ArtistUI");
    }

    public void onResume() {
        SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.ArtistUI");
        super.onResume();
        SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.ArtistUI");
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C89779i0 i0Var;
        C95960j jVar;
        SnsMethodCalculate.markStartTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.ArtistUI");
        if (!(yVar instanceof C47349a0) || ((C47349a0) yVar).mo72393j() != 4) {
            Log.m105918d("MicroMsg.ArtistUI", "another scene");
            SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.ArtistUI");
            return;
        }
        Log.m105924i("MicroMsg.ArtistUI", "onSceneEnd: errType = " + i + " errCode = " + i2 + " errMsg = " + str + " type = " + yVar.getType() + " @" + hashCode());
        if (i == 0 && i2 == 0) {
            if (yVar.getType() == 159 && (jVar = this.f276648d) != null) {
                jVar.mo133480a();
            }
            SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.ArtistUI");
            return;
        }
        if (yVar.getType() == 159 && (i0Var = this.f276652h) != null) {
            i0Var.dismiss();
        }
        SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.ArtistUI");
    }
}
