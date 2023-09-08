package lh2;

import a22.C67001a;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import b22.C28250a;
import com.google.android.material.bottomsheet.C104428a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C45628s0;
import gh2.C98116a;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kg3.C76577a;
import lh2.C109344g0;
import p740wo.C53193b;
import qh2.C101198e;
import sx3.C110818d0;
import sx3.C64186f0;
import yh2.C79120l;
import z04.C66723k;

/* renamed from: lh2.q */
public final class C76700q implements View.OnClickListener, C109344g0 {

    /* renamed from: d */
    public ViewGroup f224401d;

    /* renamed from: e */
    public final String f224402e = "MicroMsg.EditMenuPlugin";

    /* renamed from: f */
    public final ImageView f224403f;

    /* renamed from: g */
    public final LinearLayout f224404g;

    /* renamed from: h */
    public C104428a f224405h;

    /* renamed from: i */
    public int f224406i;

    /* renamed from: j */
    public boolean f224407j;

    /* renamed from: n */
    public int f224408n;

    /* renamed from: o */
    public String f224409o;

    /* renamed from: p */
    public String f224410p;

    /* renamed from: q */
    public String f224411q;

    /* renamed from: r */
    public ArrayList<String> f224412r;

    public C76700q(ViewGroup viewGroup, C101198e eVar) {
        C87412m.m108594g(viewGroup, "parent");
        C87412m.m108594g(eVar, "status");
        this.f224401d = viewGroup;
        View findViewById = viewGroup.findViewById(C0966R.C0970id.ihi);
        C87412m.m108593f(findViewById, "parent.findViewById(R.id.record_editor_more_menu)");
        ImageView imageView = (ImageView) findViewById;
        this.f224403f = imageView;
        View findViewById2 = this.f224401d.findViewById(C0966R.C0970id.ihj);
        C87412m.m108593f(findViewById2, "parent.findViewById(R.id…r_more_menu_status_group)");
        this.f224404g = (LinearLayout) findViewById2;
        this.f224407j = true;
        this.f224412r = new ArrayList<>();
        imageView.setVisibility(8);
        imageView.setOnClickListener(this);
    }

    /* renamed from: a */
    public final String mo106974a() {
        List<String> list;
        List<String> list2;
        List<T> list3;
        boolean z;
        List<T> list4;
        boolean z2;
        List<T> list5;
        boolean z3;
        this.f224412r.clear();
        List<String> list6 = null;
        if (!Util.isNullOrNil(this.f224410p)) {
            String str = this.f224410p;
            C87412m.m108591d(str);
            List<String> e = new C66723k(",").mo90760e(str, 0);
            if (!e.isEmpty()) {
                ListIterator<String> listIterator = e.listIterator(e.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        break;
                    }
                    if (listIterator.previous().length() == 0) {
                        z3 = true;
                        continue;
                    } else {
                        z3 = false;
                        continue;
                    }
                    if (!z3) {
                        list5 = C110818d0.m150947s0(e, listIterator.nextIndex() + 1);
                        break;
                    }
                }
                Object[] array = list5.toArray(new String[0]);
                C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                String[] strArr = (String[]) array;
                list = Arrays.asList(Arrays.copyOf(strArr, strArr.length));
            }
            list5 = C64186f0.f181907d;
            Object[] array2 = list5.toArray(new String[0]);
            C87412m.m108592e(array2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            String[] strArr2 = (String[]) array2;
            list = Arrays.asList(Arrays.copyOf(strArr2, strArr2.length));
        } else {
            list = null;
        }
        if (!Util.isNullOrNil(this.f224409o)) {
            String str2 = this.f224409o;
            C87412m.m108591d(str2);
            List<String> e2 = new C66723k(",").mo90760e(str2, 0);
            if (!e2.isEmpty()) {
                ListIterator<String> listIterator2 = e2.listIterator(e2.size());
                while (true) {
                    if (!listIterator2.hasPrevious()) {
                        break;
                    }
                    if (listIterator2.previous().length() == 0) {
                        z2 = true;
                        continue;
                    } else {
                        z2 = false;
                        continue;
                    }
                    if (!z2) {
                        list4 = C110818d0.m150947s0(e2, listIterator2.nextIndex() + 1);
                        break;
                    }
                }
                Object[] array3 = list4.toArray(new String[0]);
                C87412m.m108592e(array3, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                String[] strArr3 = (String[]) array3;
                list2 = Arrays.asList(Arrays.copyOf(strArr3, strArr3.length));
            }
            list4 = C64186f0.f181907d;
            Object[] array32 = list4.toArray(new String[0]);
            C87412m.m108592e(array32, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            String[] strArr32 = (String[]) array32;
            list2 = Arrays.asList(Arrays.copyOf(strArr32, strArr32.length));
        } else {
            list2 = null;
        }
        if (!Util.isNullOrNil(this.f224411q)) {
            String str3 = this.f224411q;
            C87412m.m108591d(str3);
            List<String> e3 = new C66723k(",").mo90760e(str3, 0);
            if (!e3.isEmpty()) {
                ListIterator<String> listIterator3 = e3.listIterator(e3.size());
                while (true) {
                    if (!listIterator3.hasPrevious()) {
                        break;
                    }
                    if (listIterator3.previous().length() == 0) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (!z) {
                        list3 = C110818d0.m150947s0(e3, listIterator3.nextIndex() + 1);
                        break;
                    }
                }
            }
            list3 = C64186f0.f181907d;
            Object[] array4 = list3.toArray(new String[0]);
            C87412m.m108592e(array4, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            String[] strArr4 = (String[]) array4;
            list6 = Arrays.asList(Arrays.copyOf(strArr4, strArr4.length));
        }
        if (list != null && list.size() > 0) {
            Iterator it = list.iterator();
            HashSet hashSet = new HashSet();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                List<String> k = ((C67001a) C28250a.m38138a()).mo90973k(((C67001a) C28250a.m38138a()).mo90968f((String) it.next()));
                if (k == null || k.size() == 0) {
                    Log.m105920e(this.f224402e, "dz: getContactNamesFromLabelsAndOtherUserName,namelist get bu label is null");
                } else {
                    for (String str4 : k) {
                        hashSet.add(str4);
                        Log.m105919d(this.f224402e, "dz:name : %s", str4);
                    }
                }
            }
            Log.m105920e(this.f224402e, "dz: getContactNamesFromLabelsAndOtherUserName,namelist get bu label is null");
            this.f224412r = new ArrayList<>(hashSet);
        }
        if (list != null) {
            for (String isNullOrNil : list) {
                Util.isNullOrNil(isNullOrNil);
            }
        }
        if (list2 != null && list2.size() > 0) {
            for (String str5 : list2) {
                if (!this.f224412r.contains(str5)) {
                    this.f224412r.add(str5);
                }
            }
        }
        if (list6 != null && !list6.isEmpty()) {
            for (String str6 : list6) {
                ArrayList arrayList = new ArrayList();
                List<String> mX = ((C53193b) C86312j.m106911c(C53193b.class)).mo73728mX(str6);
                if (mX != null) {
                    Log.m105919d(this.f224402e, "getContactNamesFromChatroom chatromm:%s membersCount:%s", str6, Integer.valueOf(mX.size()));
                    for (String next : mX) {
                        if (!this.f224412r.contains(next) && C45628s0.m50740E(next)) {
                            Log.m105925i(this.f224402e, "getContactNamesFromChatroom memberName:%s", next);
                            this.f224412r.add(next);
                        }
                        if (C45628s0.m50740E(next)) {
                            arrayList.add(next);
                        }
                    }
                    Log.m105919d(this.f224402e, "%s , %s", str6, Integer.valueOf(arrayList.size()));
                }
            }
        }
        Log.m105924i(this.f224402e, "mergeSelectedRangeUser count:" + this.f224412r.size());
        String listToString = Util.listToString(this.f224412r, ",");
        C87412m.m108593f(listToString, "listToString(mergedUserList, \",\")");
        return listToString;
    }

    /* renamed from: b */
    public final void mo106975b(int i) {
        String str = this.f224402e;
        Log.m105924i(str, "setScene " + i);
        this.f224406i = i;
        if (i == 3) {
            this.f224403f.setImageDrawable(C74933u4.m89768e(this.f224401d.getContext(), C0966R.raw.icons_filled_more, -1));
            if (!((C98116a.C98117a) C98116a.f287596b.mo138761d()).f287601e) {
                this.f224403f.setVisibility(8);
            } else {
                this.f224403f.setVisibility(0);
            }
        }
    }

    /* renamed from: c */
    public final void mo106976c() {
        this.f224404g.removeAllViews();
        if (!this.f224407j) {
            ImageView imageView = new ImageView(this.f224401d.getContext());
            imageView.setImageDrawable(C74933u4.m89768e(this.f224401d.getContext(), C0966R.raw.icons_filled_moment_off, -1));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C76577a.m92155f(this.f224401d.getContext(), C0966R.dimen.al8), C76577a.m92155f(this.f224401d.getContext(), C0966R.dimen.al8));
            layoutParams.topMargin = C76577a.m92155f(this.f224401d.getContext(), C0966R.dimen.f3895i6);
            this.f224404g.addView(imageView, layoutParams);
        }
        String str = this.f224409o;
        boolean z = true;
        if (str == null || str.length() == 0) {
            String str2 = this.f224410p;
            if (str2 == null || str2.length() == 0) {
                String str3 = this.f224411q;
                if (str3 == null || str3.length() == 0) {
                    z = false;
                }
            }
        }
        if (z) {
            ImageView imageView2 = new ImageView(this.f224401d.getContext());
            imageView2.setImageDrawable(C74933u4.m89768e(this.f224401d.getContext(), C0966R.raw.icons_filled_me_hl, -1));
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(C76577a.m92155f(this.f224401d.getContext(), C0966R.dimen.al8), C76577a.m92155f(this.f224401d.getContext(), C0966R.dimen.al8));
            layoutParams2.topMargin = C76577a.m92155f(this.f224401d.getContext(), C0966R.dimen.f3895i6);
            this.f224404g.addView(imageView2, layoutParams2);
        }
    }

    /* renamed from: e */
    public boolean mo78564e() {
        return false;
    }

    public String name() {
        return C76700q.class.getName();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        String str = this.f224402e;
        Log.m105924i(str, "onActivityResult requestCode:" + i + " resultCode:" + i2);
        if (i == 3 && i2 == -1 && intent != null) {
            this.f224408n = intent.getIntExtra("Ktag_range_index", 0);
            this.f224410p = intent.getStringExtra("Klabel_name_list");
            this.f224409o = intent.getStringExtra("Kother_user_name_list");
            this.f224411q = intent.getStringExtra("Kchat_room_name_list");
            mo106976c();
        }
    }

    public void onAttach() {
    }

    public void onClick(View view) {
        C79120l lVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/recordvideo/plugin/EditMenuPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C104428a aVar = this.f224405h;
        if (aVar != null) {
            aVar.dismiss();
        }
        if (this.f224406i == 3) {
            Context context = this.f224401d.getContext();
            C87412m.m108593f(context, "parent.context");
            lVar = new C79120l(context);
            lVar.f232346t = this.f224407j;
            lVar.f232345s = new C76699p(this);
        } else {
            lVar = null;
        }
        this.f224405h = lVar;
        if (lVar != null) {
            lVar.show();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/recordvideo/plugin/EditMenuPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onDetach() {
    }

    public void onPause() {
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C109344g0.C61280a.m71860a(this, i, strArr, iArr);
    }

    public void onResume() {
    }

    public void release() {
        this.f224404g.removeAllViews();
        this.f224407j = true;
        this.f224408n = 0;
        this.f224409o = null;
        this.f224410p = null;
        this.f224411q = null;
    }

    public void reset() {
        this.f224404g.removeAllViews();
        this.f224407j = true;
        this.f224408n = 0;
        this.f224409o = null;
        this.f224410p = null;
        this.f224411q = null;
    }

    public void setVisibility(int i) {
        this.f224403f.setVisibility(i);
    }

    /* renamed from: v */
    public void mo78575v(RecordConfigProvider recordConfigProvider) {
        C87412m.m108594g(recordConfigProvider, "configProvider");
    }
}
