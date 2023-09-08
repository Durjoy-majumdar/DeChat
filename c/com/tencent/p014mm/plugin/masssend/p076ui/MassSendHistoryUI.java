package com.tencent.p014mm.plugin.masssend.p076ui;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.p136ui.C6975i1;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.p136ui.base.MMPullDownView;
import com.tencent.p014mm.p136ui.tools.C45082x0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.SensorController;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72976h2;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import eb0.C97625j3;
import f12.C7970a;
import hd0.C98398h0;
import j20.C117292a;
import java.util.ArrayList;
import junit.framework.Assert;
import k20.C60958c;
import k20.C9556a;
import kd0.C76552z;
import nj3.C11184p0;
import nj3.C76912y0;
import ob0.C76996p;
import p214om.C11502f;
import p371ph.C21967a;
import p910lj.C76701a;
import pu0.C110248b;
import w52.C38023l;
import w52.C78517d;
import w52.C78518e;
import zh3.C91753f;

/* renamed from: com.tencent.mm.plugin.masssend.ui.MassSendHistoryUI */
public class MassSendHistoryUI extends MMActivity implements SensorController.SensorEventCallBack, C76996p.C77000a, C76996p.C77001b {

    /* renamed from: p */
    public static SensorController f201413p;

    /* renamed from: d */
    public ListView f201414d;

    /* renamed from: e */
    public C69829a f201415e;

    /* renamed from: f */
    public MMPullDownView f201416f;

    /* renamed from: g */
    public C21967a f201417g;

    /* renamed from: h */
    public boolean f201418h = true;

    /* renamed from: i */
    public View f201419i;

    /* renamed from: j */
    public boolean f201420j = false;

    /* renamed from: n */
    public LinearLayout f201421n;

    /* renamed from: o */
    public C11184p0 f201422o = new C69804c();

    /* renamed from: com.tencent.mm.plugin.masssend.ui.MassSendHistoryUI$a */
    public class C42561a implements MenuItem.OnMenuItemClickListener {
        public C42561a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            MassSendHistoryUI massSendHistoryUI = MassSendHistoryUI.this;
            if (massSendHistoryUI.f201420j) {
                massSendHistoryUI.finish();
                return true;
            }
            Intent intent = new Intent();
            intent.addFlags(67108864);
            ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93183p(intent, MassSendHistoryUI.this);
            MassSendHistoryUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.masssend.ui.MassSendHistoryUI$b */
    public class C42562b implements MenuItem.OnMenuItemClickListener {
        public C42562b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            Intent intent = new Intent();
            intent.putExtra("Contact_User", "masssendapp");
            ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93174g(intent, MassSendHistoryUI.this);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.masssend.ui.MassSendHistoryUI$e */
    public class C42563e implements MMPullDownView.C73177d {
        public C42563e() {
        }

        /* renamed from: q0 */
        public boolean mo64384q0() {
            ListView listView = MassSendHistoryUI.this.f201414d;
            return listView.getChildAt(listView.getChildCount() - 1).getBottom() <= MassSendHistoryUI.this.f201414d.getHeight() && MassSendHistoryUI.this.f201414d.getLastVisiblePosition() == MassSendHistoryUI.this.f201414d.getAdapter().getCount() - 1;
        }
    }

    /* renamed from: com.tencent.mm.plugin.masssend.ui.MassSendHistoryUI$f */
    public class C42564f implements MMPullDownView.C73178e {
        public C42564f() {
        }

        /* renamed from: b0 */
        public boolean mo64386b0() {
            ListView listView = MassSendHistoryUI.this.f201414d;
            View childAt = listView.getChildAt(listView.getFirstVisiblePosition());
            return childAt != null && childAt.getTop() == 0;
        }
    }

    /* renamed from: com.tencent.mm.plugin.masssend.ui.MassSendHistoryUI$h */
    public class C42565h implements AdapterView.OnItemClickListener {
        public C42565h(MassSendHistoryUI massSendHistoryUI) {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/masssend/ui/MassSendHistoryUI$6", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            Log.m105926v("MicroMsg.MassSendHistoryUI", "onItemClick");
            C117292a.m165361g(this, "com/tencent/mm/plugin/masssend/ui/MassSendHistoryUI$6", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.masssend.ui.MassSendHistoryUI$i */
    public class C42566i implements View.OnTouchListener {
        public C42566i(MassSendHistoryUI massSendHistoryUI) {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/masssend/ui/MassSendHistoryUI$7", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            Log.m105926v("MicroMsg.MassSendHistoryUI", "onTouch");
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/masssend/ui/MassSendHistoryUI$7", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.masssend.ui.MassSendHistoryUI$j */
    public class C42567j implements View.OnClickListener {
        public C42567j() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/masssend/ui/MassSendHistoryUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent(MassSendHistoryUI.this, MassSendSelectContactUI.class);
            MassSendHistoryUI massSendHistoryUI = MassSendHistoryUI.this;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            MassSendHistoryUI massSendHistoryUI2 = massSendHistoryUI;
            C117292a.m165358d(massSendHistoryUI2, aVar.mo10232b(), "com/tencent/mm/plugin/masssend/ui/MassSendHistoryUI$8", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            massSendHistoryUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(massSendHistoryUI2, "com/tencent/mm/plugin/masssend/ui/MassSendHistoryUI$8", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C117292a.m165361g(this, "com/tencent/mm/plugin/masssend/ui/MassSendHistoryUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.masssend.ui.MassSendHistoryUI$k */
    public class C42568k implements View.OnClickListener {
        public C42568k() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/masssend/ui/MassSendHistoryUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent(MassSendHistoryUI.this, MassSendSelectContactUI.class);
            MassSendHistoryUI massSendHistoryUI = MassSendHistoryUI.this;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            MassSendHistoryUI massSendHistoryUI2 = massSendHistoryUI;
            C117292a.m165358d(massSendHistoryUI2, aVar.mo10232b(), "com/tencent/mm/plugin/masssend/ui/MassSendHistoryUI$9", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            massSendHistoryUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(massSendHistoryUI2, "com/tencent/mm/plugin/masssend/ui/MassSendHistoryUI$9", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C117292a.m165361g(this, "com/tencent/mm/plugin/masssend/ui/MassSendHistoryUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.masssend.ui.MassSendHistoryUI$c */
    public class C69804c implements C11184p0 {
        public C69804c() {
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            C78517d dVar;
            if (menuItem.getItemId() == 1 && (dVar = (C78517d) MassSendHistoryUI.this.f201415e.getItem(menuItem.getGroupId())) != null) {
                if (dVar.mo108463b().equals(MassSendHistoryUI.this.f201415e.f201473q)) {
                    MassSendHistoryUI.this.mo96015I7();
                }
                C78518e wx02 = C38023l.wx0();
                String b = dVar.mo108463b();
                Cursor rawQuery = wx02.f229995d.rawQuery("select * from massendinfo ORDER BY createtime DESC  limit 2", (String[]) null);
                if (rawQuery != null) {
                    if (rawQuery.getCount() == 0) {
                        rawQuery.close();
                    } else if (rawQuery.getCount() == 1) {
                        rawQuery.moveToFirst();
                        C78517d dVar2 = new C78517d();
                        dVar2.mo108462a(rawQuery);
                        rawQuery.close();
                        C72976h2 h2Var = new C72976h2();
                        h2Var.setUsername("masssendapp");
                        h2Var.mo108792M2(MMApplicationContext.getContext().getResources().getString(C0966R.string.bnz));
                        h2Var.mo108793N2(dVar2.f229977c);
                        h2Var.mo108803Y2(0);
                        h2Var.mo108812g3(0);
                        ((C44660i2) C97625j3.m125812b().mo105908w()).mo69773k0(h2Var, "masssendapp");
                    } else {
                        rawQuery.moveToPosition(1);
                        C78517d dVar3 = new C78517d();
                        dVar3.mo108462a(rawQuery);
                        rawQuery.close();
                        C72976h2 h2Var2 = new C72976h2();
                        h2Var2.setUsername("masssendapp");
                        h2Var2.mo108792M2(wx02.mo108478qq(dVar3));
                        h2Var2.mo108793N2(dVar3.f229977c);
                        h2Var2.mo108803Y2(0);
                        h2Var2.mo108812g3(0);
                        ((C44660i2) C97625j3.m125812b().mo105908w()).mo69773k0(h2Var2, "masssendapp");
                    }
                }
                C91753f fVar = wx02.f229995d;
                if (fVar.delete("massendinfo", "clientid= ?", new String[]{"" + b}) > 0) {
                    wx02.doNotify();
                }
                MassSendHistoryUI.this.getClass();
                String c = dVar.mo108464c();
                int i2 = dVar.f229983i;
                if (i2 == 3) {
                    StringBuilder sb = new StringBuilder();
                    C97625j3.m125812b().getClass();
                    sb.append(C7970a.m8127a());
                    sb.append(c);
                    String sb4 = sb.toString();
                    if (sb4.equals("") || !C86013q1.m106450k(sb4)) {
                        Log.m105920e("MicroMsg.MassSendHistoryUI", "deleteImg : imgPath is null");
                    } else {
                        C86013q1.m106447h(sb4);
                    }
                } else if (i2 == 34) {
                    String m = C76552z.m92075m(c);
                    if (!C86013q1.m106450k(m)) {
                        Log.m105921e("MicroMsg.MassSendHistoryUI", "delete, file %s not exist!, fullPath: %s", c, m);
                    }
                    C86013q1.m106447h(m);
                } else if (i2 == 43) {
                    String q = C98398h0.Bx0().mo137728q(dVar.mo108464c());
                    if (!C86013q1.m106450k(q)) {
                        Log.m105929w("MicroMsg.MassSendHistoryUI", "delete, file %s not exist!, fullPath: %s", dVar.mo108464c(), q);
                    }
                    C86013q1.m106447h(q);
                    String r = C98398h0.Bx0().mo137729r(dVar.mo108464c());
                    if (!C86013q1.m106450k(r)) {
                        Log.m105929w("MicroMsg.MassSendHistoryUI", "delete, file %s not exist!, fullPath: %s", dVar.mo108464c(), r);
                    }
                    C86013q1.m106447h(r);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.masssend.ui.MassSendHistoryUI$d */
    public class C69805d implements MMPullDownView.C73180h {
        public C69805d() {
        }

        /* renamed from: a */
        public boolean mo96020a() {
            MassSendHistoryUI massSendHistoryUI = MassSendHistoryUI.this;
            C69829a aVar = massSendHistoryUI.f201415e;
            int i = aVar.f201474r;
            int i2 = aVar.f201475s;
            int i3 = 0;
            if (i >= i2) {
                massSendHistoryUI.f201414d.setSelectionFromTop(0, massSendHistoryUI.f201416f.getTopHeight());
                return true;
            }
            if (!(i >= i2)) {
                int i4 = i + 10;
                aVar.f201474r = i4;
                if (i4 <= i2) {
                    i3 = 10;
                } else {
                    aVar.f201474r = i2;
                    i3 = i2 % 10;
                }
            }
            Log.m105926v("MicroMsg.MassSendHistoryUI", "onLoadData add count:" + i3);
            MassSendHistoryUI.this.f201415e.mo7991f();
            MassSendHistoryUI massSendHistoryUI2 = MassSendHistoryUI.this;
            massSendHistoryUI2.f201414d.setSelectionFromTop(i3, massSendHistoryUI2.f201416f.getTopHeight());
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.masssend.ui.MassSendHistoryUI$g */
    public class C69806g implements C6975i1.C6977b {
        public C69806g() {
        }

        /* renamed from: a */
        public void mo1327a(Object obj) {
            MassSendHistoryUI massSendHistoryUI = MassSendHistoryUI.this;
            MMPullDownView mMPullDownView = massSendHistoryUI.f201416f;
            C69829a aVar = massSendHistoryUI.f201415e;
            mMPullDownView.setIsTopShowAll(aVar.f201474r >= aVar.f201475s);
            if (MassSendHistoryUI.this.f201415e.getCount() == 0) {
                MassSendHistoryUI.this.f201416f.setVisibility(8);
                View view = MassSendHistoryUI.this.f201419i;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/masssend/ui/MassSendHistoryUI$5", "onPostReset", "(Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/masssend/ui/MassSendHistoryUI$5", "onPostReset", "(Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                MassSendHistoryUI.this.f201421n.setVisibility(8);
                return;
            }
            MassSendHistoryUI.this.f201416f.setVisibility(0);
            View view3 = MassSendHistoryUI.this.f201419i;
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar3.mo10233c(8);
            View view4 = view3;
            C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/masssend/ui/MassSendHistoryUI$5", "onPostReset", "(Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/masssend/ui/MassSendHistoryUI$5", "onPostReset", "(Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            MassSendHistoryUI.this.f201421n.setVisibility(0);
        }

        /* renamed from: b */
        public void mo1328b(Object obj) {
        }
    }

    /* renamed from: H7 */
    public final boolean mo96014H7(String str) {
        Assert.assertTrue(str != null);
        f201413p.setSensorCallBack(this);
        C78517d Lo = C38023l.wx0().mo108476Lo(str);
        if (C97625j3.m125812b().mo105883I() || Util.isNullOrNil(Lo.mo108464c())) {
            if (this.f201417g == null) {
                this.f201417g = new C21967a(this);
            }
            this.f201417g.mo35069m();
            if (this.f201417g.mo35067k(Lo.mo108464c(), this.f201418h)) {
                C110248b.wx0("music").mo107365b0(this.f201418h);
                this.f201417g.mo35062f(this);
                this.f201417g.mo35063g(this);
                return true;
            }
            C76701a.makeText((Context) this, (CharSequence) getString(C0966R.string.bam), 0).show();
            return false;
        }
        C76912y0.m92771j(this, (View) null);
        return false;
    }

    /* renamed from: I7 */
    public final void mo96015I7() {
        f201413p.removeSensorCallBack();
        this.f201417g.mo35070n(false);
        C69829a aVar = this.f201415e;
        aVar.f201473q = "";
        aVar.notifyDataSetChanged();
        this.f201414d.setKeepScreenOn(false);
    }

    /* renamed from: a */
    public void mo96016a() {
        mo96015I7();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f359878bb3;
    }

    public void initView() {
        this.f201420j = getIntent().getBooleanExtra("finish_direct", false);
        Log.m105918d("MicroMsg.MassSendHistoryUI", "isFromSearch  " + this.f201420j);
        this.f201421n = (LinearLayout) findViewById(C0966R.C0970id.gph);
        ListView listView = (ListView) findViewById(C0966R.C0970id.f358724gp1);
        this.f201414d = listView;
        listView.setTranscriptMode(0);
        MMPullDownView mMPullDownView = (MMPullDownView) findViewById(C0966R.C0970id.f358725gp2);
        this.f201416f = mMPullDownView;
        mMPullDownView.setOnTopLoadDataListener(new C69805d());
        this.f201416f.setTopViewVisible(true);
        this.f201416f.setAtBottomCallBack(new C42563e());
        this.f201416f.setAtTopCallBack(new C42564f());
        this.f201416f.setIsBottomShowAll(true);
        C69829a aVar = new C69829a(this);
        this.f201415e = aVar;
        aVar.f24699h = new C69806g();
        this.f201419i = findViewById(C0966R.C0970id.f358723gp0);
        this.f201414d.setAdapter(this.f201415e);
        this.f201414d.setOnItemClickListener(new C42565h(this));
        this.f201414d.setOnTouchListener(new C42566i(this));
        ((Button) findViewById(C0966R.C0970id.gpg)).setOnClickListener(new C42567j());
        ((Button) findViewById(C0966R.C0970id.gpi)).setOnClickListener(new C42568k());
        setBackBtn(new C42561a());
        addIconOptionMenu(0, (int) C0966R.string.a2z, (int) C0966R.raw.actionbar_setting_icon, (MenuItem.OnMenuItemClickListener) new C42562b());
        new C45082x0(this).mo70438d(this.f201414d, this, this.f201422o);
    }

    public void onCompletion() {
        mo96015I7();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.gph);
        if (f201413p == null) {
            f201413p = new SensorController(getApplicationContext());
        }
        initView();
        C21967a aVar = new C21967a(this, 0);
        this.f201417g = aVar;
        aVar.f62212m = this;
        aVar.f62211l = this;
        this.f201415e.f201477u = new C69834b(this);
        MMActivityController mMActivityController = this.mController;
        if (mMActivityController != null) {
            mMActivityController.f348089b0 = 3;
            mMActivityController.f348091c0 = false;
        }
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        Log.m105926v("MicroMsg.MassSendHistoryUI", "onCreateContextMenu");
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (AdapterView.AdapterContextMenuInfo) contextMenuInfo;
        String[] split = ((C78517d) this.f201415e.getItem(adapterContextMenuInfo.position)).mo108467f().split(";");
        StringBuilder sb = new StringBuilder();
        for (String str : split) {
            C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(str);
            if (z1Var != null) {
                sb.append(z1Var.mo62898f() + ";");
            }
        }
        contextMenu.setHeaderTitle(sb.toString());
        contextMenu.add(adapterContextMenuInfo.position, 1, 0, getString(C0966R.string.b_1));
    }

    public void onDestroy() {
        mo96015I7();
        this.f201415e.mo5580b();
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        if (this.f201420j) {
            finish();
            return true;
        }
        Intent intent = new Intent();
        intent.addFlags(67108864);
        ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93183p(intent, this);
        finish();
        return true;
    }

    public void onPause() {
        super.onPause();
        C38023l.wx0().remove(this.f201415e);
        f201413p.removeSensorCallBack();
    }

    public void onResume() {
        super.onResume();
        C38023l.wx0().add(this.f201415e);
        this.f201415e.mo7991f();
        this.f201414d.setSelection(this.f201415e.getCount() - 1);
    }

    public void onSensorEvent(boolean z) {
        C21967a aVar = this.f201417g;
        if (aVar != null) {
            if (!aVar.mo35058b()) {
                this.f201417g.mo35066j(true);
                C110248b.wx0("music").mo107365b0(true);
                this.f201418h = true;
                return;
            }
            this.f201417g.mo35066j(z);
            C110248b.wx0("music").mo107365b0(z);
            this.f201418h = z;
            if (z) {
                return;
            }
            if (mo96014H7(this.f201415e.f201473q)) {
                C69829a aVar2 = this.f201415e;
                aVar2.f201473q = aVar2.f201473q;
                aVar2.notifyDataSetChanged();
                return;
            }
            C69829a aVar3 = this.f201415e;
            aVar3.f201473q = "";
            aVar3.notifyDataSetChanged();
        }
    }
}
