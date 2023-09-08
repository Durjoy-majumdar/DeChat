package com.tencent.p014mm.plugin.fav.p047ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelimage.C68129u;
import com.tencent.p014mm.plugin.fav.p047ui.adapter.C68901b;
import com.tencent.p014mm.plugin.fav.p047ui.adapter.FavoriteNormalAdapter;
import com.tencent.p014mm.plugin.fav.p047ui.gallery.C93629k;
import com.tencent.p014mm.plugin.fav.p047ui.gallery.C93637l;
import com.tencent.p014mm.plugin.fav.p047ui.gallery.C93649o;
import com.tencent.p014mm.plugin.fav.p047ui.widget.FavCapacityPanel;
import com.tencent.p014mm.plugin.fav.p047ui.widget.FavSearchActionView;
import com.tencent.p014mm.plugin.fav.p047ui.widget.FavTagPanel;
import com.tencent.p014mm.plugin.secdata.p843ui.MMSecDataActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import d62.C7250m;
import di3.C86312j;
import dm2.C45418c;
import eb0.C45628s0;
import eb0.C75592q0;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import k20.C60958c;
import k20.C9556a;
import lc1.c$$f;
import nj3.C76879j;
import nj3.C88989a;
import oc1.C100324a;
import p158gt.C76055o;
import p158gt.C98201k;
import p640ox.C77049b;
import p849e3.C107197h;
import p849e3.C97597g;
import pb1.C100699c0;
import pb1.C100703e0;
import pb1.C100718j1;
import pb1.C100734q;
import pb1.C100755z;
import pb1.C11883v0;
import pc1.C100774c;
import qo3.C47883u;
import qo3.C77426q;
import te3.C101811md0;
import te3.C101825od0;
import uo3.C78253a;
import xb1.C102614d;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.fav.ui.FavSearchUI */
public class FavSearchUI extends MMSecDataActivity implements c$$f, C93629k.C93636f {

    /* renamed from: N */
    public static final /* synthetic */ int f269788N = 0;

    /* renamed from: A */
    public View f269789A;

    /* renamed from: B */
    public ImageButton f269790B;

    /* renamed from: C */
    public MenuItem f269791C;

    /* renamed from: D */
    public MMHandler f269792D;

    /* renamed from: E */
    public List<Long> f269793E = new ArrayList();

    /* renamed from: F */
    public C100324a f269794F;

    /* renamed from: G */
    public long f269795G;

    /* renamed from: H */
    public String f269796H = "";

    /* renamed from: I */
    public C93629k f269797I;

    /* renamed from: J */
    public int[] f269798J = new int[2];

    /* renamed from: K */
    public C100755z f269799K;

    /* renamed from: L */
    public C100774c f269800L;

    /* renamed from: M */
    public AdapterView.OnItemLongClickListener f269801M;

    /* renamed from: d */
    public int f269802d;

    /* renamed from: e */
    public int f269803e = -1;

    /* renamed from: f */
    public String f269804f;

    /* renamed from: g */
    public String f269805g;

    /* renamed from: h */
    public Set<Integer> f269806h;

    /* renamed from: i */
    public C11883v0 f269807i;

    /* renamed from: j */
    public FavoriteImageServer f269808j;

    /* renamed from: n */
    public FavoriteNormalAdapter f269809n;

    /* renamed from: o */
    public C68901b f269810o;

    /* renamed from: p */
    public FavSearchActionView f269811p;

    /* renamed from: q */
    public ListView f269812q;

    /* renamed from: r */
    public ListView f269813r;

    /* renamed from: s */
    public View f269814s;

    /* renamed from: t */
    public FavCapacityPanel f269815t;

    /* renamed from: u */
    public Animation f269816u;

    /* renamed from: v */
    public Animation f269817v;

    /* renamed from: w */
    public List<Integer> f269818w;

    /* renamed from: x */
    public List<String> f269819x;

    /* renamed from: y */
    public List<String> f269820y;

    /* renamed from: z */
    public Set<String> f269821z = new HashSet();

    /* renamed from: com.tencent.mm.plugin.fav.ui.FavSearchUI$e */
    public class C68894e implements Runnable {
        public C68894e() {
        }

        public void run() {
            FavTagPanel favTagPanel = FavSearchUI.this.f269811p.f198055e;
            if (favTagPanel != null) {
                favTagPanel.mo101813p();
            }
            FavSearchUI.this.showVKB();
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.FavSearchUI$h */
    public class C68895h implements View.OnClickListener {
        public C68895h() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/fav/ui/FavSearchUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FavSearchUI favSearchUI = FavSearchUI.this;
            int i = FavSearchUI.f269788N;
            if (favSearchUI.mo128298N7()) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/fav/ui/FavSearchUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            FavSearchUI.this.finish();
            C117292a.m165361g(this, "com/tencent/mm/plugin/fav/ui/FavSearchUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.FavSearchUI$a */
    public class C93442a implements C47883u {
        /* renamed from: a */
        public void mo353a(boolean z, String str) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.FavSearchUI$b */
    public class C93443b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Dialog f269822d;

        public C93443b(FavSearchUI favSearchUI, Dialog dialog) {
            this.f269822d = dialog;
        }

        public void run() {
            this.f269822d.dismiss();
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.FavSearchUI$c */
    public class C93444c implements AdapterView.OnItemLongClickListener {
        public C93444c() {
        }

        public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
            View view2 = view;
            int i2 = i;
            FavSearchUI favSearchUI = FavSearchUI.this;
            if (favSearchUI.f269802d == 2) {
                Log.m105928w("MicroMsg.FavSearchUI", "on edit mode long click, ignore");
                return true;
            } else if (i2 < favSearchUI.f269812q.getHeaderViewsCount()) {
                Log.m105928w("MicroMsg.FavSearchUI", "on header view long click, ignore");
                return true;
            } else {
                FavSearchUI favSearchUI2 = FavSearchUI.this;
                int[] iArr = favSearchUI2.f269798J;
                new C78253a(favSearchUI2.getContext(), view).mo108272g(view, i, j, new C93484a1(favSearchUI2, i), new C93489b1(favSearchUI2, i, view), iArr[0], iArr[1]);
                return true;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.FavSearchUI$d */
    public class C93445d implements Runnable {
        public C93445d() {
        }

        public void run() {
            FavSearchUI.this.f269793E = ((C102614d) ((C100718j1) C86312j.m106911c(C100718j1.class)).mo128199Jq()).mo142270kD();
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.FavSearchUI$f */
    public class C93446f implements C107197h.C97599a {
        public C93446f() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.FavSearchUI$g */
    public class C93447g implements Runnable {
        public C93447g() {
        }

        public void run() {
            MenuItem menuItem = FavSearchUI.this.f269791C;
            if (menuItem != null) {
                menuItem.expandActionView();
                Toolbar.LayoutParams layoutParams = (Toolbar.LayoutParams) FavSearchUI.this.f269811p.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = -1;
                    layoutParams.width = -1;
                }
                FavSearchUI.this.f269811p.setLayoutParams(layoutParams);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.FavSearchUI$i */
    public class C93448i implements FavSearchActionView.C68930c {
        public C93448i() {
        }

        /* renamed from: a */
        public void mo128307a(List<Integer> list, List<String> list2, List<String> list3, boolean z) {
            if (list2.isEmpty() && list3.isEmpty()) {
                FavSearchUI favSearchUI = FavSearchUI.this;
                int i = FavSearchUI.f269788N;
                if (favSearchUI.mo128301Q7()) {
                    FavSearchUI.m118040H7(FavSearchUI.this, true);
                    FavSearchUI.m118041I7(FavSearchUI.this, list2, list3);
                    return;
                }
            }
            Log.m105919d("MicroMsg.FavSearchUI", "on search, types %s keys %s tags %s", list, list2, list3);
            FavSearchUI favSearchUI2 = FavSearchUI.this;
            favSearchUI2.f269819x = list2;
            favSearchUI2.f269820y = list3;
            favSearchUI2.f269818w = list;
            C68901b bVar = favSearchUI2.f269810o;
            ((HashSet) bVar.f198003g).clear();
            if (list3 != null) {
                bVar.f198003g.addAll(list3);
            }
            if (z) {
                FavSearchUI.m118044L7(FavSearchUI.this);
                FavSearchUI.m118041I7(FavSearchUI.this, list2, list3);
                return;
            }
            FavSearchUI.this.f269809n.mo128370d(list, list2, list3);
            FavSearchUI.m118042J7(FavSearchUI.this, true);
            FavSearchUI.m118041I7(FavSearchUI.this, list2, list3);
        }
    }

    public FavSearchUI() {
        new C101811md0();
        this.f269801M = new C93444c();
    }

    /* renamed from: H7 */
    public static void m118040H7(FavSearchUI favSearchUI, boolean z) {
        if (8 != favSearchUI.f269813r.getVisibility()) {
            favSearchUI.f269813r.setVisibility(8);
            favSearchUI.f269813r.startAnimation(favSearchUI.f269817v);
        }
        if (8 != favSearchUI.f269812q.getVisibility()) {
            favSearchUI.f269812q.setVisibility(8);
            favSearchUI.f269812q.startAnimation(favSearchUI.f269817v);
        }
        if (favSearchUI.f269797I.f270369o.getVisibility() != 0) {
            favSearchUI.f269797I.mo128551g(0);
            favSearchUI.f269797I.f270369o.startAnimation(favSearchUI.f269816u);
        }
        if (z) {
            favSearchUI.hideVKB();
        }
    }

    /* renamed from: I7 */
    public static void m118041I7(FavSearchUI favSearchUI, List list, List list2) {
        favSearchUI.getClass();
        if ((list == null || list.isEmpty()) && (list2 == null || list2.isEmpty())) {
            favSearchUI.f269790B.setVisibility(8);
        } else {
            favSearchUI.f269790B.setVisibility(0);
        }
    }

    /* renamed from: J7 */
    public static void m118042J7(FavSearchUI favSearchUI, boolean z) {
        List<String> list;
        List<Integer> list2;
        List<String> list3;
        favSearchUI.f269809n.notifyDataSetChanged();
        if (8 != favSearchUI.f269797I.f270369o.getVisibility()) {
            favSearchUI.f269797I.mo128551g(8);
        }
        if (8 != favSearchUI.f269813r.getVisibility()) {
            favSearchUI.f269813r.setVisibility(8);
            favSearchUI.f269813r.startAnimation(favSearchUI.f269817v);
        }
        if (favSearchUI.f269809n.isEmpty()) {
            if (favSearchUI.f269814s.getVisibility() != 0) {
                View view = favSearchUI.f269814s;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/fav/ui/FavSearchUI", "refreshResultView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/fav/ui/FavSearchUI", "refreshResultView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                favSearchUI.f269814s.startAnimation(favSearchUI.f269816u);
            }
            if (8 != favSearchUI.f269812q.getVisibility()) {
                favSearchUI.f269812q.setVisibility(8);
                favSearchUI.f269812q.startAnimation(favSearchUI.f269817v);
            }
        } else {
            if (8 != favSearchUI.f269814s.getVisibility()) {
                View view2 = favSearchUI.f269814s;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view3 = view2;
                C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/fav/ui/FavSearchUI", "refreshResultView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/fav/ui/FavSearchUI", "refreshResultView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                favSearchUI.f269814s.startAnimation(favSearchUI.f269817v);
            }
            if (favSearchUI.f269812q.getVisibility() != 0) {
                favSearchUI.f269812q.setVisibility(0);
                favSearchUI.f269812q.startAnimation(favSearchUI.f269816u);
            }
        }
        favSearchUI.f269794F.f293916l = System.currentTimeMillis();
        if (favSearchUI.f269809n.isEmpty() && (((list = favSearchUI.f269819x) == null || list.isEmpty()) && (((list2 = favSearchUI.f269818w) == null || list2.isEmpty()) && (list3 = favSearchUI.f269820y) != null && list3.size() == 1))) {
            String str = favSearchUI.f269820y.get(0);
            Log.m105929w("MicroMsg.FavSearchUI", "need del tag %s", str);
            ((HashSet) favSearchUI.f269821z).add(str);
        }
        if (z) {
            favSearchUI.hideVKB();
        }
    }

    /* renamed from: K7 */
    public static void m118043K7(FavSearchUI favSearchUI, View view, int i, C100755z zVar) {
        C77426q qVar = new C77426q(favSearchUI.getContext());
        qVar.mo107595g(favSearchUI.getContext().getString(C0966R.string.cn6));
        qVar.mo107598j(favSearchUI.getContext().getString(C0966R.string.f360416cn0));
        qVar.mo107602n(favSearchUI.getContext().getString(C0966R.string.coq));
        qVar.mo107591c(new C93740y0(favSearchUI), new C93744z0(favSearchUI, view, i, zVar));
        qVar.mo107603o();
    }

    /* renamed from: L7 */
    public static void m118044L7(FavSearchUI favSearchUI) {
        favSearchUI.f269810o.notifyDataSetChanged();
        if (8 != favSearchUI.f269797I.f270369o.getVisibility()) {
            favSearchUI.f269797I.mo128551g(8);
        }
        if (favSearchUI.f269813r.getVisibility() != 0) {
            favSearchUI.f269813r.setVisibility(0);
            favSearchUI.f269813r.startAnimation(favSearchUI.f269816u);
        }
        if (8 != favSearchUI.f269812q.getVisibility()) {
            favSearchUI.f269812q.setVisibility(8);
            favSearchUI.f269812q.startAnimation(favSearchUI.f269817v);
        }
        if (8 != favSearchUI.f269814s.getVisibility()) {
            View view = favSearchUI.f269814s;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/fav/ui/FavSearchUI", "refreshTagView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/fav/ui/FavSearchUI", "refreshTagView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            favSearchUI.f269814s.startAnimation(favSearchUI.f269817v);
        }
    }

    /* renamed from: R7 */
    public static void m118045R7(Activity activity) {
        C77426q qVar = new C77426q(activity);
        qVar.mo107595g(activity.getString(C0966R.string.cn7));
        qVar.mo107602n(activity.getString(C0966R.string.f360419cn3));
        qVar.mo107600l(new C93442a());
        qVar.mo107603o();
    }

    /* renamed from: D3 */
    public void mo128254D3(int i, int i2) {
        C100324a aVar = this.f269794F;
        aVar.f293912h = i;
        aVar.f293914j = i2;
        mo128300P7(9, 0, 1, 2, i2, true);
    }

    /* renamed from: G5 */
    public void mo128255G5(int i) {
        mo128300P7(8, 0, 1, 2, this.f269794F.f293914j, true);
    }

    /* renamed from: M7 */
    public final void mo128297M7() {
        this.f269809n.mo128371f(false, (C100755z) null);
        this.f269812q.setOnItemLongClickListener(this.f269801M);
        this.f269800L.mo140209b();
        if (mo128301Q7()) {
            this.f269797I.mo128552i();
        }
    }

    /* renamed from: N7 */
    public final boolean mo128298N7() {
        if (this.f269809n.f269981q) {
            mo128297M7();
            return true;
        } else if (!mo128301Q7() || !this.f269797I.mo128546b()) {
            return false;
        } else {
            this.f269797I.mo128552i();
            return true;
        }
    }

    /* renamed from: O7 */
    public final void mo128299O7(int i, int i2) {
        C100324a aVar = this.f269794F;
        aVar.f293905a = i;
        FavoriteNormalAdapter favoriteNormalAdapter = this.f269809n;
        if (favoriteNormalAdapter != null) {
            aVar.f293906b = favoriteNormalAdapter.f269971B;
        }
        int i3 = this.f269802d;
        if (i3 == 0) {
            aVar.f293907c = 1;
        } else if (i3 == 1) {
            aVar.f293907c = 2;
        } else if (i3 != 2) {
            aVar.f293907c = 0;
        } else {
            aVar.f293907c = 3;
        }
        aVar.f293908d = ((int) (System.currentTimeMillis() - this.f269795G)) / 1000;
        this.f269794F.f293909e = this.f269796H;
        List<Integer> list = this.f269818w;
        if (list != null) {
            if (list.size() > 0) {
                int intValue = this.f269818w.get(0).intValue();
                this.f269794F.f293910f = C100324a.m131160c(intValue);
            } else {
                this.f269794F.f293910f = 0;
            }
        }
        C100324a aVar2 = this.f269794F;
        aVar2.f293912h = (int) (aVar2.f293916l - aVar2.f293915k);
        aVar2.f293913i = String.format("%d", new Object[]{Integer.valueOf(i2)});
        this.f269794F.f293914j = this.f269809n.getCount() - 1;
        this.f269794F.mo139616b();
    }

    /* renamed from: P7 */
    public final void mo128300P7(int i, int i2, int i3, int i4, int i5, boolean z) {
        int i6 = this.f269802d;
        int i7 = 2;
        if (i6 == 0) {
            i7 = 1;
        } else if (i6 != 1) {
            i7 = i6 != 2 ? 0 : 3;
        }
        String str = this.f269796H;
        C100324a aVar = this.f269794F;
        String str2 = aVar.f293911g;
        int i8 = aVar.f293912h;
        if (!z) {
            i8 = (int) (aVar.f293916l - aVar.f293915k);
        }
        aVar.f293905a = i;
        aVar.f293907c = i7;
        aVar.f293906b = i4;
        aVar.f293910f = i3;
        aVar.f293908d = ((int) (System.currentTimeMillis() - this.f269795G)) / 1000;
        C100324a aVar2 = this.f269794F;
        aVar2.f293909e = str;
        aVar2.f293911g = str2;
        aVar2.f293912h = i8;
        aVar2.f293913i = String.format("%d", new Object[]{Integer.valueOf(i2)});
        C100324a aVar3 = this.f269794F;
        aVar3.f293914j = i5;
        aVar3.mo139616b();
    }

    /* renamed from: Q7 */
    public final boolean mo128301Q7() {
        return this.f269803e == 21;
    }

    /* renamed from: S7 */
    public final void mo128302S7() {
        if (this.f269811p == null) {
            FavSearchActionView favSearchActionView = (FavSearchActionView) View.inflate(getContext(), C0966R.C0971layout.a78, (ViewGroup) null);
            this.f269811p = favSearchActionView;
            View findViewById = favSearchActionView.findViewById(C0966R.C0970id.apy);
            this.f269789A = findViewById;
            findViewById.setOnClickListener(new C68895h());
            ImageButton imageButton = (ImageButton) this.f269811p.findViewById(C0966R.C0970id.f359133j51);
            this.f269790B = imageButton;
            imageButton.setVisibility(8);
            this.f269811p.setOnSearchChangedListener(new C93448i());
        }
    }

    /* renamed from: T2 */
    public void mo128261T2(int i, int i2) {
        mo128300P7(6, 0, 1, 2, this.f269794F.f293914j, true);
    }

    /* renamed from: a4 */
    public void mo128262a4(int i) {
        mo128300P7(4, 0, 1, 2, this.f269794F.f293914j, true);
    }

    /* renamed from: g3 */
    public void mo128246g3(long j, boolean z) {
        FavoriteNormalAdapter favoriteNormalAdapter = this.f269809n;
        if (favoriteNormalAdapter.f269981q) {
            this.f269800L.mo140208a(favoriteNormalAdapter.mo128381j() > 0);
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.a79;
    }

    /* renamed from: j */
    public void mo128263j(int i) {
        mo128300P7(2, 0, 1, 2, this.f269794F.f293914j, true);
    }

    /* renamed from: k2 */
    public void mo128264k2(int i, int i2) {
        mo128300P7(3, i, 1, 2, i2, true);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        int i3 = i;
        int i4 = i2;
        Intent intent2 = intent;
        Log.m105925i("MicroMsg.FavSearchUI", "onActivityResult reqCode: %d, retCod: %d", Integer.valueOf(i), Integer.valueOf(i2));
        if (i4 == -1) {
            String stringExtra = intent2.getStringExtra("custom_send_text");
            String stringExtra2 = intent2.getStringExtra("Select_Conv_User");
            if (i3 != 1) {
                if (i3 == 4105) {
                    Log.m105919d("MicroMsg.FavSearchUI", "select %s for sending", stringExtra2);
                    C93745z1.m118445b(getContext(), this.f269809n.mo128379i(false), stringExtra, stringExtra2, "MicroMsg.FavSearchUI");
                } else if (i3 == 4106) {
                    Log.m105919d("MicroMsg.FavSearchUI", "select %s for sending", stringExtra2);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.f269799K);
                    C93745z1.m118445b(getContext(), arrayList, stringExtra, stringExtra2, "MicroMsg.FavSearchUI");
                }
            } else if (i4 == -1) {
                List<C93637l> list = this.f269797I.f270378x;
                if (!Util.isNullOrNil(stringExtra2)) {
                    ArrayList<String> stringsToList = Util.stringsToList(stringExtra2.split(","));
                    Iterator it = ((ArrayList) list).iterator();
                    while (it.hasNext()) {
                        C93637l lVar = (C93637l) it.next();
                        if (lVar == null) {
                            Log.m105919d("MicroMsg.FavSearchUI", "select %s, send item null, continute", stringExtra2);
                        } else if (new C100703e0().mo140132a(lVar.f270387a)) {
                            C76879j.m92726T(getContext(), getString(C0966R.string.f7260k));
                            return;
                        } else {
                            Log.m105919d("MicroMsg.FavSearchUI", "select %s for sending", stringExtra2);
                            if (lVar.mo128560d() || lVar.mo128559c()) {
                                C93443b bVar = new C93443b(this, C76879j.m92723Q(getContext(), "", getString(C0966R.string.col), true, false, (DialogInterface.OnCancelListener) null));
                                for (String k : stringsToList) {
                                    C93594f1.m118183k(this, k, lVar.f270388b, bVar);
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
            mo128298N7();
        } else if (i3 == 4105) {
            FavoriteNormalAdapter favoriteNormalAdapter = this.f269809n;
            if (favoriteNormalAdapter != null) {
                C93745z1.m118449f(this, "", favoriteNormalAdapter.mo128379i(false), false);
            }
        } else if (i3 == 4106 && this.f269799K != null) {
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(this.f269799K);
            C93745z1.m118449f(this, "", arrayList3, false);
        }
    }

    public void onCreate(Bundle bundle) {
        Class cls = C100718j1.class;
        super.onCreate(bundle);
        Transition inflateTransition = TransitionInflater.from(this).inflateTransition(17760258);
        inflateTransition.excludeTarget(getWindow().getDecorView().findViewById(C0966R.C0970id.f5383do), true);
        inflateTransition.excludeTarget(16908335, true);
        getWindow().setEnterTransition(inflateTransition);
        this.f269792D = new MMHandler();
        setMMTitle("");
        setActionbarColor(getContext().getResources().getColor(C0966R.color.a7_));
        int intExtra = getIntent().getIntExtra("key_search_type", 0);
        this.f269802d = intExtra;
        if (1 == intExtra) {
            this.f269804f = getIntent().getStringExtra("key_to_user");
            this.f269805g = getIntent().getStringExtra("key_fav_item_id");
        }
        this.f269803e = getIntent().getIntExtra("key_preset_search_type", -1);
        this.f269813r = (ListView) findViewById(C0966R.C0970id.kej);
        this.f269812q = (ListView) findViewById(C0966R.C0970id.j6w);
        this.f269814s = findViewById(C0966R.C0970id.j5k);
        this.f269816u = AnimationUtils.loadAnimation(getContext(), C0966R.C0968anim.f2448da);
        this.f269817v = AnimationUtils.loadAnimation(getContext(), C0966R.C0968anim.f2449db);
        mo128302S7();
        FavCapacityPanel favCapacityPanel = (FavCapacityPanel) View.inflate(getContext(), C0966R.C0971layout.a6c, (ViewGroup) null);
        this.f269815t = favCapacityPanel;
        favCapacityPanel.f198049g = getIntent().getIntExtra("key_enter_fav_search_from", 0);
        this.f269810o = new C68903d1(this, getContext());
        if (((C100718j1) C86312j.m106911c(cls)).mo128204NU().mo140139e() > 0) {
            this.f269813r.addHeaderView((TextView) View.inflate(getContext(), C0966R.C0971layout.a7b, (ViewGroup) null));
        }
        this.f269813r.addFooterView(this.f269815t);
        this.f269813r.setAdapter(this.f269810o);
        this.f269813r.setOnTouchListener(new C2294e1(this));
        this.f269808j = new FavoriteImageServer(getContext(), 16);
        FavoriteNormalAdapter favoriteNormalAdapter = new FavoriteNormalAdapter(getContext(), this.f269808j, false);
        this.f269809n = favoriteNormalAdapter;
        favoriteNormalAdapter.f269987w = this;
        favoriteNormalAdapter.f269970A = 2;
        favoriteNormalAdapter.f269973D = this.f269812q;
        if (1 == this.f269802d) {
            this.f269806h = new HashSet();
            this.f269807i = new C100703e0();
            if (!Util.isNullOrNil(this.f269805g)) {
                for (String str : this.f269805g.split(",")) {
                    int i = Util.getInt(str, Integer.MAX_VALUE);
                    if (Integer.MAX_VALUE != i) {
                        ((HashSet) this.f269806h).add(Integer.valueOf(i));
                    }
                }
            }
            FavoriteNormalAdapter favoriteNormalAdapter2 = this.f269809n;
            favoriteNormalAdapter2.f269993f = this.f269806h;
            favoriteNormalAdapter2.f269994g = this.f269807i;
        }
        this.f269812q.setAdapter(this.f269809n);
        this.f269812q.setOnItemClickListener(new C93706v0(this));
        this.f269812q.setOnItemLongClickListener(this.f269801M);
        this.f269812q.setOnTouchListener(new C2297w0(this));
        C100774c cVar = new C100774c();
        this.f269800L = cVar;
        View findViewById = findViewById(C0966R.C0970id.f357984cv1);
        cVar.f295233a = false;
        cVar.f295234b = findViewById;
        this.f269800L.f295241i = new C93729x0(this);
        C93629k kVar = new C93629k(this, findViewById(C0966R.C0970id.cvt), this.f269808j);
        this.f269797I = kVar;
        kVar.f270371q = this;
        ((C100718j1) C86312j.m106911c(cls)).mo128204NU().mo140135a(this.f269810o);
        C86709a0.m107525e().postToWorkerDelayed(new C93445d(), 1000);
        this.f269794F = new C100324a();
        this.f269795G = System.currentTimeMillis();
        this.f269794F.f293911g = C100324a.m131159a();
        this.f269794F.f293915k = this.f269795G;
        if (mo128301Q7()) {
            this.f269811p.mo94834d(this.f269803e, false);
            this.f269812q.setVisibility(8);
            this.f269813r.setVisibility(8);
            this.f269797I.mo128551g(0);
            C93629k kVar2 = this.f269797I;
            if (kVar2.f270355a != null) {
                kVar2.f270372r = System.currentTimeMillis();
                kVar2.f270355a.mo128572k(true, kVar2.f270365k);
            }
            ArrayList arrayList = new ArrayList();
            this.f269818w = arrayList;
            arrayList.add(Integer.valueOf(this.f269803e));
        } else {
            int i2 = this.f269803e;
            if (i2 > 0) {
                this.f269811p.mo94834d(i2, true);
                this.f269797I.mo128551g(8);
                this.f269812q.setVisibility(0);
            }
        }
        ((C77049b) C86312j.m106911c(C77049b.class)).mo72352Rp(this, new C45418c(C101825od0.class, 17, true));
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        Log.m105918d("MicroMsg.FavSearchUI", "on create options menu");
        mo128302S7();
        MenuItem add = menu.add(0, C0966R.C0970id.gsl, 0, C0966R.string.f7961xj);
        this.f269791C = add;
        add.setActionView(this.f269811p);
        this.f269791C.setShowAsAction(9);
        this.f269811p.post(new C68894e());
        this.f269791C.setOnActionExpandListener(new C97597g(new C93446f()));
        this.f269792D.post(new C93447g());
        return true;
    }

    public void onDestroy() {
        Class cls = C100718j1.class;
        int i = this.f269794F.f293905a;
        if (!((i == 1 || i == 9) ? false : true)) {
            mo128299O7(1, 0);
        }
        C93649o oVar = this.f269797I.f270355a;
        if (oVar != null) {
            oVar.onDetach();
        }
        super.onDestroy();
        this.f269808j.mo128332f();
        this.f269808j = null;
        ((C100718j1) C86312j.m106911c(cls)).mo128204NU().mo140135a(this.f269810o);
        ((C100718j1) C86312j.m106911c(cls)).mo128204NU().mo140142h(this.f269821z);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (4 == i && this.f269809n.f269981q) {
            mo128297M7();
            return true;
        } else if (4 != i || !mo128301Q7() || !this.f269797I.mo128546b()) {
            return super.onKeyUp(i, keyEvent);
        } else {
            this.f269797I.mo128552i();
            return true;
        }
    }

    public void onPause() {
        C100699c0.m131741c(getClass().getSimpleName(), "");
        if (mo128301Q7()) {
            this.f269797I.mo128547c();
        }
        super.onPause();
    }

    public void onResume() {
        this.f269809n.mo128369b();
        this.f269809n.notifyDataSetChanged();
        FavCapacityPanel favCapacityPanel = this.f269815t;
        if (favCapacityPanel.f198047e != C100734q.m131814E() / 1048576) {
            favCapacityPanel.f198047e = C100734q.m131814E() / 1048576;
            TextView textView = favCapacityPanel.f198048f;
            Context context = textView.getContext();
            Object[] objArr = new Object[2];
            long j = favCapacityPanel.f198050h - favCapacityPanel.f198047e;
            if (j <= 0) {
                j = 0;
            }
            objArr[0] = Long.valueOf(j);
            objArr[1] = Long.valueOf(favCapacityPanel.f198047e);
            textView.setText(context.getString(C0966R.string.cm9, objArr));
        }
        C100699c0.m131739a(getClass().getSimpleName());
        if (mo128301Q7()) {
            this.f269797I.mo128548d();
        }
        super.onResume();
    }

    /* renamed from: u2 */
    public void mo128265u2(int i) {
        mo128300P7(5, 0, 1, 2, this.f269794F.f293914j, true);
    }
}
