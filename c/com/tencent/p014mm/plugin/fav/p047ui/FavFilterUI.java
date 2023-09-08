package com.tencent.p014mm.plugin.fav.p047ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ListView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelimage.C68129u;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.plugin.fav.p047ui.adapter.FavoriteNormalAdapter;
import com.tencent.p014mm.plugin.fav.p047ui.gallery.C93629k;
import com.tencent.p014mm.plugin.fav.p047ui.gallery.C93637l;
import com.tencent.p014mm.plugin.fav.p047ui.gallery.C93649o;
import com.tencent.p014mm.plugin.fav.p047ui.widget.FavSearchActionView;
import com.tencent.p014mm.plugin.secdata.p843ui.MMSecDataActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import d62.C7250m;
import di3.C86312j;
import dm2.C45418c;
import eb0.C45628s0;
import eb0.C75592q0;
import f40.C86709a0;
import j20.C117292a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import k20.C60958c;
import k20.C9556a;
import lc1.c$$f;
import nj3.C76879j;
import oc1.C100324a;
import p158gt.C76055o;
import p158gt.C98201k;
import p640ox.C77049b;
import pb1.C100699c0;
import pb1.C100703e0;
import pb1.C100718j1;
import pb1.C100734q;
import pb1.C100755z;
import pb1.C11883v0;
import pc1.C100774c;
import qo3.C77426q;
import te3.C101825od0;
import uo3.C78253a;
import xb1.C102614d;

/* renamed from: com.tencent.mm.plugin.fav.ui.FavFilterUI */
public class FavFilterUI extends MMSecDataActivity implements c$$f, C93629k.C93636f {

    /* renamed from: F */
    public static final /* synthetic */ int f269680F = 0;

    /* renamed from: A */
    public C93629k f269681A;

    /* renamed from: B */
    public int[] f269682B = new int[2];

    /* renamed from: C */
    public C100755z f269683C;

    /* renamed from: D */
    public C100774c f269684D;

    /* renamed from: E */
    public AdapterView.OnItemLongClickListener f269685E = new C93421b();

    /* renamed from: d */
    public int f269686d;

    /* renamed from: e */
    public int f269687e = -1;

    /* renamed from: f */
    public String f269688f;

    /* renamed from: g */
    public String f269689g;

    /* renamed from: h */
    public Set<Integer> f269690h;

    /* renamed from: i */
    public C11883v0 f269691i;

    /* renamed from: j */
    public View f269692j;

    /* renamed from: n */
    public FavoriteImageServer f269693n;

    /* renamed from: o */
    public FavoriteNormalAdapter f269694o;

    /* renamed from: p */
    public ListView f269695p;

    /* renamed from: q */
    public Animation f269696q;

    /* renamed from: r */
    public Animation f269697r;

    /* renamed from: s */
    public List<Integer> f269698s = new LinkedList();

    /* renamed from: t */
    public List<String> f269699t = new LinkedList();

    /* renamed from: u */
    public List<String> f269700u = new LinkedList();

    /* renamed from: v */
    public Set<String> f269701v = new HashSet();

    /* renamed from: w */
    public List<Long> f269702w = new ArrayList();

    /* renamed from: x */
    public C100324a f269703x;

    /* renamed from: y */
    public long f269704y;

    /* renamed from: z */
    public String f269705z = "";

    /* renamed from: com.tencent.mm.plugin.fav.ui.FavFilterUI$a */
    public class C93420a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Dialog f269706d;

        public C93420a(FavFilterUI favFilterUI, Dialog dialog) {
            this.f269706d = dialog;
        }

        public void run() {
            this.f269706d.dismiss();
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.FavFilterUI$b */
    public class C93421b implements AdapterView.OnItemLongClickListener {
        public C93421b() {
        }

        public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
            View view2 = view;
            int i2 = i;
            FavFilterUI favFilterUI = FavFilterUI.this;
            if (favFilterUI.f269686d == 2) {
                Log.m105928w("MicroMsg.FavFilterUI", "on edit mode long click, ignore");
                return true;
            } else if (i2 < favFilterUI.f269695p.getHeaderViewsCount()) {
                Log.m105928w("MicroMsg.FavFilterUI", "on header view long click, ignore");
                return true;
            } else {
                FavFilterUI favFilterUI2 = FavFilterUI.this;
                int[] iArr = favFilterUI2.f269682B;
                new C78253a(favFilterUI2.getContext(), view).mo108272g(view, i, j, new C93713w(favFilterUI2, i), new C93724x(favFilterUI2, i, view), iArr[0], iArr[1]);
                return true;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.FavFilterUI$c */
    public class C93422c implements MenuItem.OnMenuItemClickListener {
        public C93422c() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            FavFilterUI favFilterUI = FavFilterUI.this;
            int i = FavFilterUI.f269680F;
            if (favFilterUI.mo128257K7()) {
                return true;
            }
            FavFilterUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.FavFilterUI$d */
    public class C93423d implements Runnable {
        public C93423d() {
        }

        public void run() {
            FavFilterUI.this.f269702w = ((C102614d) ((C100718j1) C86312j.m106911c(C100718j1.class)).mo128199Jq()).mo142270kD();
        }
    }

    /* renamed from: H7 */
    public static void m117998H7(FavFilterUI favFilterUI) {
        C77426q qVar = new C77426q(favFilterUI.getContext());
        qVar.mo107595g(favFilterUI.getContext().getString(C0966R.string.cn7));
        qVar.mo107602n(favFilterUI.getContext().getString(C0966R.string.f360419cn3));
        qVar.mo107600l(new C93488b0(favFilterUI));
        qVar.mo107603o();
    }

    /* renamed from: I7 */
    public static void m117999I7(FavFilterUI favFilterUI, View view, int i, C100755z zVar) {
        C77426q qVar = new C77426q(favFilterUI.getContext());
        qVar.mo107595g(favFilterUI.getContext().getString(C0966R.string.cn6));
        qVar.mo107598j(favFilterUI.getContext().getString(C0966R.string.f360416cn0));
        qVar.mo107602n(favFilterUI.getContext().getString(C0966R.string.coq));
        qVar.mo107591c(new C93493c0(favFilterUI), new C93496d0(favFilterUI, view, i, zVar));
        qVar.mo107603o();
    }

    /* renamed from: D3 */
    public void mo128254D3(int i, int i2) {
        C100324a aVar = this.f269703x;
        aVar.f293912h = i;
        aVar.f293914j = i2;
        mo128258L7(9, 0, 1, 2, i2, true);
    }

    /* renamed from: G5 */
    public void mo128255G5(int i) {
        mo128258L7(8, 0, 1, 2, this.f269703x.f293914j, true);
    }

    /* renamed from: J7 */
    public final void mo128256J7() {
        this.f269694o.mo128371f(false, (C100755z) null);
        this.f269695p.setOnItemLongClickListener(this.f269685E);
        this.f269684D.mo140209b();
        if (mo128260N7()) {
            this.f269681A.mo128552i();
        }
    }

    /* renamed from: K7 */
    public final boolean mo128257K7() {
        if (this.f269694o.f269981q) {
            mo128256J7();
            return true;
        } else if (!mo128260N7() || !this.f269681A.mo128546b()) {
            return false;
        } else {
            this.f269681A.mo128552i();
            return true;
        }
    }

    /* renamed from: L7 */
    public final void mo128258L7(int i, int i2, int i3, int i4, int i5, boolean z) {
        int i6 = this.f269686d;
        int i7 = 2;
        if (i6 == 0) {
            i7 = 1;
        } else if (i6 != 1) {
            i7 = i6 != 2 ? 0 : 3;
        }
        String str = this.f269705z;
        C100324a aVar = this.f269703x;
        String str2 = aVar.f293911g;
        int i8 = aVar.f293912h;
        if (!z) {
            i8 = (int) (aVar.f293916l - aVar.f293915k);
        }
        aVar.f293905a = i;
        aVar.f293907c = i7;
        aVar.f293906b = i4;
        aVar.f293910f = i3;
        aVar.f293908d = ((int) (System.currentTimeMillis() - this.f269704y)) / 1000;
        C100324a aVar2 = this.f269703x;
        aVar2.f293909e = str;
        aVar2.f293911g = str2;
        aVar2.f293912h = i8;
        aVar2.f293913i = String.format("%d", new Object[]{Integer.valueOf(i2)});
        C100324a aVar3 = this.f269703x;
        aVar3.f293914j = i5;
        aVar3.mo139616b();
    }

    /* renamed from: M7 */
    public final void mo128259M7(int i, int i2, boolean z) {
        FavoriteNormalAdapter favoriteNormalAdapter = this.f269694o;
        int i3 = favoriteNormalAdapter != null ? favoriteNormalAdapter.f269971B : 0;
        List<Integer> list = this.f269698s;
        mo128258L7(i, i2, (list == null || ((LinkedList) list).size() <= 0) ? 0 : C100324a.m131160c(((Integer) ((LinkedList) this.f269698s).get(0)).intValue()), i3, this.f269694o.getCount() - 1, z);
    }

    /* renamed from: N7 */
    public final boolean mo128260N7() {
        return this.f269687e == 21;
    }

    /* renamed from: T2 */
    public void mo128261T2(int i, int i2) {
        mo128258L7(6, 0, 1, 2, this.f269703x.f293914j, true);
    }

    /* renamed from: a4 */
    public void mo128262a4(int i) {
        mo128258L7(4, 0, 1, 2, this.f269703x.f293914j, true);
    }

    /* renamed from: g3 */
    public void mo128246g3(long j, boolean z) {
        FavoriteNormalAdapter favoriteNormalAdapter = this.f269694o;
        if (favoriteNormalAdapter.f269981q) {
            this.f269684D.mo140208a(favoriteNormalAdapter.mo128381j() > 0);
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.a6j;
    }

    /* renamed from: j */
    public void mo128263j(int i) {
        mo128258L7(2, 0, 1, 2, this.f269703x.f293914j, true);
    }

    /* renamed from: k2 */
    public void mo128264k2(int i, int i2) {
        mo128258L7(3, i, 1, 2, i2, true);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        int q;
        int i3 = i;
        int i4 = i2;
        Intent intent2 = intent;
        Log.m105925i("MicroMsg.FavFilterUI", "onActivityResult reqCode: %d, retCod: %d", Integer.valueOf(i), Integer.valueOf(i2));
        if (i4 == -1) {
            String stringExtra = intent2.getStringExtra("custom_send_text");
            String stringExtra2 = intent2.getStringExtra("Select_Conv_User");
            if (i3 != 1) {
                if (i3 == 4103) {
                    long longExtra = intent2.getLongExtra("key_fav_result_local_id", -1);
                    String stringExtra3 = intent2.getStringExtra("key_fav_result_fake_local_id");
                    if (-1 != longExtra && -1 != (q = this.f269694o.mo128389q(longExtra, stringExtra3))) {
                        this.f269695p.setSelection(q);
                        return;
                    }
                    return;
                } else if (i3 == 4105) {
                    Log.m105919d("MicroMsg.FavFilterUI", "select %s for sending", stringExtra2);
                    C93745z1.m118445b(getContext(), this.f269694o.mo128379i(false), stringExtra, stringExtra2, "MicroMsg.FavFilterUI");
                } else if (i3 == 4106) {
                    Log.m105919d("MicroMsg.FavFilterUI", "select %s for sending", stringExtra2);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.f269683C);
                    C93745z1.m118445b(getContext(), arrayList, stringExtra, stringExtra2, "MicroMsg.FavFilterUI");
                }
            } else if (i4 == -1) {
                List<C93637l> list = this.f269681A.f270378x;
                if (!Util.isNullOrNil(stringExtra2)) {
                    ArrayList<String> stringsToList = Util.stringsToList(stringExtra2.split(","));
                    Iterator it = ((ArrayList) list).iterator();
                    while (it.hasNext()) {
                        C93637l lVar = (C93637l) it.next();
                        if (lVar == null) {
                            Log.m105919d("MicroMsg.FavFilterUI", "select %s, send item null, continute", stringExtra2);
                        } else if (new C100703e0().mo140132a(lVar.f270387a)) {
                            Log.m105924i("MicroMsg.FavFilterUI", "[FavFilterUI] notDownload cause by FavSendFilter");
                            C76879j.m92726T(getContext(), getString(C0966R.string.f7260k));
                            return;
                        } else {
                            Log.m105919d("MicroMsg.FavFilterUI", "select %s for sending", stringExtra2);
                            if (lVar.mo128560d() || lVar.mo128559c()) {
                                C93420a aVar = new C93420a(this, C76879j.m92723Q(getContext(), "", getString(C0966R.string.col), true, false, (DialogInterface.OnCancelListener) null));
                                for (String k : stringsToList) {
                                    C93594f1.m118183k(this, k, lVar.f270388b, aVar);
                                }
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(C100734q.m131880w(lVar.f270388b));
                                for (String d : stringsToList) {
                                    C76055o ZL = ((C98201k) C86312j.m106911c(C98201k.class)).mo137275ZL();
                                    C68129u uVar = (C68129u) ZL;
                                    uVar.mo93637d(3, C75592q0.m90789s(), d, arrayList2, 0, false, C0966R.C0969drawable.by8);
                                }
                            }
                        }
                    }
                    if (!Util.isNullOrNil(stringExtra)) {
                        for (String next : stringsToList) {
                            C7250m.m7431a().mo136257Tm(next, stringExtra, C45628s0.m50810y(next), 0);
                        }
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
            mo128257K7();
        } else if (i3 == 4105) {
            FavoriteNormalAdapter favoriteNormalAdapter = this.f269694o;
            if (favoriteNormalAdapter != null) {
                C93745z1.m118449f(this, "", favoriteNormalAdapter.mo128379i(false), false);
            }
        } else if (i3 == 4106 && this.f269683C != null) {
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(this.f269683C);
            C93745z1.m118449f(this, "", arrayList3, false);
        }
    }

    public void onCreate(Bundle bundle) {
        Class cls = C101825od0.class;
        Class cls2 = C77049b.class;
        super.onCreate(bundle);
        Transition inflateTransition = TransitionInflater.from(this).inflateTransition(17760258);
        inflateTransition.excludeTarget(getWindow().getDecorView().findViewById(C0966R.C0970id.f5383do), true);
        inflateTransition.excludeTarget(16908335, true);
        getWindow().setEnterTransition(inflateTransition);
        this.f269687e = getIntent().getIntExtra("key_preset_search_type", -1);
        setMMTitle(FavSearchActionView.m81174a(getContext(), this.f269687e));
        setBackBtn(new C93422c());
        setActionbarColor(getContext().getResources().getColor(C0966R.color.a7_));
        this.f269686d = getIntent().getIntExtra("key_search_type", 0);
        this.f269692j = findViewById(C0966R.C0970id.j5k);
        if (1 == this.f269686d) {
            this.f269688f = getIntent().getStringExtra("key_to_user");
            this.f269689g = getIntent().getStringExtra("key_fav_item_id");
        }
        this.f269696q = AnimationUtils.loadAnimation(getContext(), C0966R.C0968anim.f2448da);
        this.f269697r = AnimationUtils.loadAnimation(getContext(), C0966R.C0968anim.f2449db);
        this.f269695p = (ListView) findViewById(C0966R.C0970id.j6w);
        this.f269693n = new FavoriteImageServer(getContext(), 16);
        FavoriteNormalAdapter favoriteNormalAdapter = new FavoriteNormalAdapter(getContext(), this.f269693n, false);
        this.f269694o = favoriteNormalAdapter;
        favoriteNormalAdapter.f269987w = this;
        favoriteNormalAdapter.f269970A = 2;
        favoriteNormalAdapter.f269973D = this.f269695p;
        if (1 == this.f269686d) {
            this.f269690h = new HashSet();
            this.f269691i = new C100703e0();
            if (!Util.isNullOrNil(this.f269689g)) {
                for (String str : this.f269689g.split(",")) {
                    int i = Util.getInt(str, Integer.MAX_VALUE);
                    if (Integer.MAX_VALUE != i) {
                        ((HashSet) this.f269690h).add(Integer.valueOf(i));
                    }
                }
            }
            FavoriteNormalAdapter favoriteNormalAdapter2 = this.f269694o;
            favoriteNormalAdapter2.f269993f = this.f269690h;
            favoriteNormalAdapter2.f269994g = this.f269691i;
        }
        this.f269695p.setAdapter(this.f269694o);
        this.f269695p.setOnItemClickListener(new C93735y(this));
        this.f269695p.setOnItemLongClickListener(this.f269685E);
        this.f269695p.setOnTouchListener(new C41403z(this));
        C100774c cVar = new C100774c();
        this.f269684D = cVar;
        View findViewById = findViewById(C0966R.C0970id.f357984cv1);
        cVar.f295233a = false;
        cVar.f295234b = findViewById;
        this.f269684D.f295241i = new C93479a0(this);
        C93629k kVar = new C93629k(this, findViewById(C0966R.C0970id.cvt), this.f269693n);
        this.f269681A = kVar;
        kVar.f270371q = this;
        C86709a0.m107525e().postToWorkerDelayed(new C93423d(), 1000);
        this.f269703x = new C100324a();
        this.f269704y = System.currentTimeMillis();
        this.f269703x.f293911g = C100324a.m131159a();
        this.f269703x.f293915k = this.f269704y;
        ((LinkedList) this.f269698s).clear();
        ((LinkedList) this.f269698s).add(Integer.valueOf(this.f269687e));
        if (mo128260N7()) {
            this.f269695p.setVisibility(8);
            this.f269681A.mo128551g(0);
            this.f269703x.f293911g = C100324a.m131159a();
            C93629k kVar2 = this.f269681A;
            if (kVar2.f270355a != null) {
                kVar2.f270372r = System.currentTimeMillis();
                kVar2.f270355a.mo128572k(true, kVar2.f270365k);
            }
        } else if (this.f269687e > 0) {
            this.f269694o.mo128370d(this.f269698s, this.f269699t, this.f269700u);
            this.f269694o.notifyDataSetChanged();
            if (8 != this.f269681A.f270369o.getVisibility()) {
                this.f269681A.mo128551g(8);
            }
            if (this.f269694o.isEmpty()) {
                if (this.f269692j.getVisibility() != 0) {
                    View view = this.f269692j;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/fav/ui/FavFilterUI", "refreshResultView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/fav/ui/FavFilterUI", "refreshResultView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    this.f269692j.startAnimation(this.f269696q);
                }
                if (8 != this.f269695p.getVisibility()) {
                    this.f269695p.setVisibility(8);
                    this.f269695p.startAnimation(this.f269697r);
                }
            } else {
                if (8 != this.f269692j.getVisibility()) {
                    View view2 = this.f269692j;
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(8);
                    C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/fav/ui/FavFilterUI", "refreshResultView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/fav/ui/FavFilterUI", "refreshResultView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    this.f269692j.startAnimation(this.f269697r);
                }
                if (this.f269695p.getVisibility() != 0) {
                    this.f269695p.setVisibility(0);
                    this.f269695p.startAnimation(this.f269696q);
                }
            }
            this.f269703x.f293916l = System.currentTimeMillis();
            mo128259M7(9, 0, false);
            hideVKB();
            this.f269681A.mo128551g(8);
            this.f269695p.setVisibility(0);
        }
        ((C77049b) C86312j.m106911c(cls2)).mo72352Rp(this, new C45418c(cls, 17, true));
        this.f269703x.mo139618e((C101825od0) ((C77049b) C86312j.m106911c(cls2)).Wi0(getContext(), 17, cls));
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItem add = menu.add(0, 10, 0, C0966R.string.k3j);
        add.setIcon(C74933u4.m89768e(getContext(), C0966R.raw.actionbar_icon_dark_search, getContext().getResources().getColor(C0966R.color.FG_0)));
        add.setShowAsAction(2);
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        int i = this.f269703x.f293905a;
        if (!((i == 1 || i == 9) ? false : true)) {
            mo128259M7(1, 0, false);
        }
        C93649o oVar = this.f269681A.f270355a;
        if (oVar != null) {
            oVar.onDetach();
        }
        super.onDestroy();
        this.f269693n.mo128332f();
        this.f269693n = null;
        ((C100718j1) C86312j.m106911c(C100718j1.class)).mo128204NU().mo140142h(this.f269701v);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (4 == i && this.f269694o.f269981q) {
            mo128256J7();
            return true;
        } else if (4 != i || !mo128260N7() || !this.f269681A.mo128546b()) {
            return super.onKeyUp(i, keyEvent);
        } else {
            this.f269681A.mo128552i();
            return true;
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 10) {
            return super.onOptionsItemSelected(menuItem);
        }
        Intent intent = new Intent();
        intent.putExtra("key_enter_fav_search_from", 0);
        intent.putExtra("key_preset_search_type", this.f269687e);
        intent.putExtra("key_search_type", this.f269686d);
        try {
            intent.putExtra("ReportKey.CommonReportObjKey", ((C101825od0) ((C77049b) C86312j.m106911c(C77049b.class)).Wi0(this, 17, C101825od0.class)).toByteArray());
        } catch (IOException unused) {
        }
        C93745z1.m118448e(getContext(), this.f269694o.f269981q, intent);
        return true;
    }

    public void onPause() {
        C100699c0.m131741c(getClass().getSimpleName(), "");
        if (mo128260N7()) {
            this.f269681A.mo128547c();
        }
        super.onPause();
    }

    public void onResume() {
        this.f269694o.mo128369b();
        this.f269694o.notifyDataSetChanged();
        C100699c0.m131739a(getClass().getSimpleName());
        if (mo128260N7()) {
            this.f269681A.mo128548d();
        }
        super.onResume();
    }

    /* renamed from: u2 */
    public void mo128265u2(int i) {
        mo128258L7(5, 0, 1, 2, this.f269703x.f293914j, true);
    }
}
