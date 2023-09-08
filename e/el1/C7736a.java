package el1;

import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C54492n;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity$$d;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLivePostSelectContactUI;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveVisitorWhiteListUI;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveWhiteListUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import j20.C117292a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import ok1.C62042e;
import sk1.C63947a;
import sx3.C36907w;
import sx3.C64186f0;
import te3.C51745vv0;
import te3.C51946xa1;

/* renamed from: el1.a */
public abstract class C7736a extends UIComponent {

    /* renamed from: d */
    public ViewGroup f26189d;

    /* renamed from: e */
    public View f26190e;

    /* renamed from: f */
    public TextView f26191f;

    /* renamed from: g */
    public View f26192g;

    /* renamed from: h */
    public View f26193h;

    /* renamed from: i */
    public View f26194i;

    /* renamed from: j */
    public TextView f26195j;

    /* renamed from: n */
    public TextView f26196n;

    /* renamed from: o */
    public LinkedList<C51745vv0> f26197o = new LinkedList<>();

    /* renamed from: p */
    public LinkedList<C51745vv0> f26198p = new LinkedList<>();

    /* renamed from: q */
    public LinkedList<String> f26199q = new LinkedList<>();

    /* renamed from: r */
    public LinkedList<String> f26200r = new LinkedList<>();

    /* renamed from: s */
    public C51946xa1 f26201s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7736a(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C51946xa1 xa12 = new C51946xa1();
        xa12.f144557d = this.f26199q;
        xa12.f144558e = this.f26200r;
        this.f26201s = xa12;
    }

    /* renamed from: c3 */
    public final void mo8846c3(C51946xa1 xa12) {
        Iterable<String> stringArrayListExtra = getIntent().getStringArrayListExtra("KEY_PARAMS_LUCKY_MONEY_LIST");
        if (stringArrayListExtra == null) {
            stringArrayListExtra = C64186f0.f181907d;
        }
        for (String str : stringArrayListExtra) {
            if (!xa12.f144557d.contains(str)) {
                xa12.f144557d.add(str);
                Log.m105924i(C54492n.TAG, "append lucky money chatRoom to chatroom_id_list:" + str);
            }
            if (!xa12.f144559f.contains(str)) {
                xa12.f144559f.add(str);
                Log.m105924i(C54492n.TAG, "append lucky money chatRoom to contact_list:" + str);
            }
        }
    }

    /* renamed from: d3 */
    public final void mo8847d3() {
        this.f26198p.clear();
        this.f26200r.clear();
        this.f26199q.clear();
        C51946xa1 xa12 = this.f26201s;
        xa12.f144557d.clear();
        xa12.f144558e.clear();
        xa12.f144559f.clear();
        xa12.f144560g.clear();
        mo8854l3();
        mo8855m3();
    }

    /* renamed from: e3 */
    public final MMFragmentActivity$$d mo8848e3() {
        ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("KEY_PARAMS_LUCKY_MONEY_LIST");
        Intent intent = new Intent(getActivity(), FinderLivePostSelectContactUI.class);
        boolean z = false;
        intent.putExtra("KEY_PARAMS_MAX_USER_COUNT", getIntent().getIntExtra("KEY_PARAMS_MAX_USER_COUNT", 0));
        intent.putExtra("KEY_PARAMS_WHITE_LIST", this.f26201s.toByteArray());
        if (stringArrayListExtra == null || stringArrayListExtra.isEmpty()) {
            z = true;
        }
        if (!z) {
            intent.putStringArrayListExtra("KEY_PARAMS_LUCKY_MONEY_LIST", stringArrayListExtra);
        }
        AppCompatActivity activity = getActivity();
        C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
        MMFragmentActivity$$d startActivityForResult = ((MMFragmentActivity) activity).startActivityForResult(intent);
        C87412m.m108593f(startActivityForResult, "activity as MMFragmentAc…rtActivityForResult(this)");
        return startActivityForResult;
    }

    /* renamed from: f3 */
    public final MMFragmentActivity$$d mo8849f3() {
        Intent intent = new Intent(getActivity(), FinderLiveWhiteListUI.class);
        LinkedList<C51745vv0> linkedList = this.f26197o;
        ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
        for (C51745vv0 byteArray : linkedList) {
            arrayList.add(byteArray.toByteArray());
        }
        intent.putExtra("KEY_PARAMS_WHITE_LIST", arrayList);
        LinkedList<C51745vv0> linkedList2 = this.f26198p;
        ArrayList arrayList2 = new ArrayList(C36907w.m41090l(linkedList2, 10));
        for (C51745vv0 byteArray2 : linkedList2) {
            arrayList2.add(byteArray2.toByteArray());
        }
        intent.putExtra("KEY_PARAMS_CHOOSE_WHITE_LIST", arrayList2);
        AppCompatActivity activity = getActivity();
        C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
        MMFragmentActivity$$d startActivityForResult = ((MMFragmentActivity) activity).startActivityForResult(intent);
        C87412m.m108593f(startActivityForResult, "activity as MMFragmentAc…rtActivityForResult(this)");
        return startActivityForResult;
    }

    /* renamed from: g3 */
    public final void mo8850g3() {
        Integer num = null;
        if (mo8856n3()) {
            Serializable serializableExtra = getIntent().getSerializableExtra("KEY_PARAMS_CHOOSE_WHITE_LIST");
            List list = serializableExtra instanceof List ? (List) serializableExtra : null;
            boolean z = true;
            if (list != null) {
                C62042e.f176370a.mo87126w1(list, this.f26198p);
                LinkedList<C51745vv0> linkedList = this.f26198p;
                if (!(linkedList == null || linkedList.isEmpty())) {
                    AppCompatActivity activity = getActivity();
                    FinderLiveVisitorWhiteListUI finderLiveVisitorWhiteListUI = activity instanceof FinderLiveVisitorWhiteListUI ? (FinderLiveVisitorWhiteListUI) activity : null;
                    if (finderLiveVisitorWhiteListUI != null) {
                        finderLiveVisitorWhiteListUI.mo3039N7(1);
                    }
                }
            }
            ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("KEY_PARAMS_CHOOSE_WHITE_LIST_ROOM");
            if (stringArrayListExtra != null) {
                this.f26199q.clear();
                this.f26199q.addAll(stringArrayListExtra);
                LinkedList<String> linkedList2 = this.f26199q;
                if (!(linkedList2 == null || linkedList2.isEmpty())) {
                    AppCompatActivity activity2 = getActivity();
                    FinderLiveVisitorWhiteListUI finderLiveVisitorWhiteListUI2 = activity2 instanceof FinderLiveVisitorWhiteListUI ? (FinderLiveVisitorWhiteListUI) activity2 : null;
                    if (finderLiveVisitorWhiteListUI2 != null) {
                        finderLiveVisitorWhiteListUI2.mo3039N7(2);
                    }
                }
            }
            ArrayList<String> stringArrayListExtra2 = getIntent().getStringArrayListExtra("KEY_PARAMS_CHOOSE_WHITE_LIST_USER");
            if (stringArrayListExtra2 != null) {
                this.f26200r.clear();
                this.f26200r.addAll(stringArrayListExtra2);
                LinkedList<String> linkedList3 = this.f26200r;
                if (linkedList3 != null && !linkedList3.isEmpty()) {
                    z = false;
                }
                if (!z) {
                    AppCompatActivity activity3 = getActivity();
                    FinderLiveVisitorWhiteListUI finderLiveVisitorWhiteListUI3 = activity3 instanceof FinderLiveVisitorWhiteListUI ? (FinderLiveVisitorWhiteListUI) activity3 : null;
                    if (finderLiveVisitorWhiteListUI3 != null) {
                        finderLiveVisitorWhiteListUI3.mo3039N7(4);
                    }
                }
            }
            byte[] byteArrayExtra = getIntent().getByteArrayExtra("KEY_PARAMS_LIVE_PART_WHITE_LIST");
            if (byteArrayExtra != null) {
                C51946xa1 xa12 = new C51946xa1();
                xa12.parseFrom(byteArrayExtra);
                this.f26201s.f144559f = xa12.f144559f;
            }
        }
        Serializable serializableExtra2 = getIntent().getSerializableExtra("KEY_PARAMS_WHITE_LIST");
        List list2 = serializableExtra2 instanceof List ? (List) serializableExtra2 : null;
        if (list2 != null) {
            C62042e.f176370a.mo87126w1(list2, this.f26197o);
        }
        getIntent().getIntExtra("KEY_PARAMS_MAX_USER_COUNT", 0);
        StringBuilder sb = new StringBuilder();
        sb.append("initLogic chooseMode:");
        AppCompatActivity activity4 = getActivity();
        FinderLiveVisitorWhiteListUI finderLiveVisitorWhiteListUI4 = activity4 instanceof FinderLiveVisitorWhiteListUI ? (FinderLiveVisitorWhiteListUI) activity4 : null;
        if (finderLiveVisitorWhiteListUI4 != null) {
            num = Integer.valueOf(finderLiveVisitorWhiteListUI4.f14588s);
        }
        sb.append(num);
        sb.append(", visitorWhiteList size:");
        sb.append(this.f26197o.size());
        sb.append(",chooseWhiteList size:");
        sb.append(this.f26198p.size());
        sb.append(",whiteList:");
        sb.append(C63947a.f181274a.mo88730p(this.f26201s));
        Log.m105924i(C54492n.TAG, sb.toString());
    }

    /* JADX WARNING: type inference failed for: r6v5, types: [androidx.appcompat.app.AppCompatActivity] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: i3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8851i3(te3.C51946xa1 r6) {
        /*
            r5 = this;
            java.lang.String r0 = "tmpChargeInfo"
            gy3.C87412m.m108594g(r6, r0)
            r5.f26201s = r6
            r5.mo8846c3(r6)
            java.util.LinkedList<java.lang.String> r0 = r6.f144557d
            java.lang.String r1 = "tmpChargeInfo.chatroom_id_list"
            gy3.C87412m.m108593f(r0, r1)
            java.util.LinkedList<java.lang.String> r1 = r5.f26199q
            r1.clear()
            java.util.LinkedList<java.lang.String> r1 = r5.f26199q
            r1.addAll(r0)
            java.util.LinkedList<java.lang.String> r0 = r5.f26199q
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x002c
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x002a
            goto L_0x002c
        L_0x002a:
            r0 = 0
            goto L_0x002d
        L_0x002c:
            r0 = 1
        L_0x002d:
            r3 = 0
            if (r0 != 0) goto L_0x0042
            androidx.appcompat.app.AppCompatActivity r0 = r5.getActivity()
            boolean r4 = r0 instanceof com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveVisitorWhiteListUI
            if (r4 == 0) goto L_0x003b
            com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorWhiteListUI r0 = (com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveVisitorWhiteListUI) r0
            goto L_0x003c
        L_0x003b:
            r0 = r3
        L_0x003c:
            if (r0 == 0) goto L_0x0042
            r4 = 2
            r0.mo3039N7(r4)
        L_0x0042:
            java.util.LinkedList<java.lang.String> r6 = r6.f144558e
            java.lang.String r0 = "tmpChargeInfo.username_list"
            gy3.C87412m.m108593f(r6, r0)
            java.util.LinkedList<java.lang.String> r0 = r5.f26200r
            r0.clear()
            java.util.LinkedList<java.lang.String> r0 = r5.f26200r
            r0.addAll(r6)
            java.util.LinkedList<java.lang.String> r6 = r5.f26200r
            if (r6 == 0) goto L_0x005e
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x005f
        L_0x005e:
            r1 = 1
        L_0x005f:
            if (r1 != 0) goto L_0x0072
            androidx.appcompat.app.AppCompatActivity r6 = r5.getActivity()
            boolean r0 = r6 instanceof com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveVisitorWhiteListUI
            if (r0 == 0) goto L_0x006c
            r3 = r6
            com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorWhiteListUI r3 = (com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveVisitorWhiteListUI) r3
        L_0x006c:
            if (r3 == 0) goto L_0x0072
            r6 = 4
            r3.mo3039N7(r6)
        L_0x0072:
            r5.mo8854l3()
            r5.mo8855m3()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "onSelectContactActivityResult white list:"
            r6.append(r0)
            sk1.a r0 = sk1.C63947a.f181274a
            te3.xa1 r1 = r5.f26201s
            java.lang.String r0 = r0.mo88730p(r1)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            java.lang.String r0 = "SimpleUIComponent"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: el1.C7736a.mo8851i3(te3.xa1):void");
    }

    /* JADX WARNING: type inference failed for: r4v12, types: [androidx.appcompat.app.AppCompatActivity] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: j3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8852j3(android.content.Intent r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L_0x000a
            java.lang.String r1 = "KEY_PARAMS_CHOOSE_WHITE_LIST"
            java.io.Serializable r4 = r4.getSerializableExtra(r1)
            goto L_0x000b
        L_0x000a:
            r4 = r0
        L_0x000b:
            boolean r1 = r4 instanceof java.util.List
            if (r1 == 0) goto L_0x0012
            java.util.List r4 = (java.util.List) r4
            goto L_0x0013
        L_0x0012:
            r4 = r0
        L_0x0013:
            if (r4 == 0) goto L_0x005c
            ok1.e r1 = ok1.C62042e.f176370a
            java.util.LinkedList<te3.vv0> r2 = r3.f26198p
            r1.mo87126w1(r4, r2)
            java.util.LinkedList<te3.vv0> r4 = r3.f26198p
            boolean r4 = r4.isEmpty()
            r1 = 1
            r4 = r4 ^ r1
            if (r4 == 0) goto L_0x0037
            androidx.appcompat.app.AppCompatActivity r4 = r3.getActivity()
            boolean r2 = r4 instanceof com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveVisitorWhiteListUI
            if (r2 == 0) goto L_0x0031
            com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorWhiteListUI r4 = (com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveVisitorWhiteListUI) r4
            goto L_0x0032
        L_0x0031:
            r4 = r0
        L_0x0032:
            if (r4 == 0) goto L_0x0037
            r4.mo3039N7(r1)
        L_0x0037:
            te3.xa1 r4 = r3.f26201s
            r3.mo8846c3(r4)
            java.util.LinkedList<java.lang.String> r4 = r3.f26199q
            boolean r4 = r4.isEmpty()
            r4 = r4 ^ r1
            if (r4 == 0) goto L_0x0056
            androidx.appcompat.app.AppCompatActivity r4 = r3.getActivity()
            boolean r1 = r4 instanceof com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveVisitorWhiteListUI
            if (r1 == 0) goto L_0x0050
            r0 = r4
            com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorWhiteListUI r0 = (com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveVisitorWhiteListUI) r0
        L_0x0050:
            if (r0 == 0) goto L_0x0056
            r4 = 2
            r0.mo3039N7(r4)
        L_0x0056:
            r3.mo8854l3()
            r3.mo8855m3()
        L_0x005c:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "onSelectWebListActivityResult chooseWhiteList.size:"
            r4.append(r0)
            java.util.LinkedList<te3.vv0> r0 = r3.f26198p
            int r0 = r0.size()
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            java.lang.String r0 = "SimpleUIComponent"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: el1.C7736a.mo8852j3(android.content.Intent):void");
    }

    /* renamed from: k3 */
    public final void mo8853k3() {
        if (!this.f26198p.isEmpty()) {
            AppCompatActivity activity = getActivity();
            C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorWhiteListUI");
            ((FinderLiveVisitorWhiteListUI) activity).mo3039N7(1);
        }
        if (!this.f26199q.isEmpty()) {
            AppCompatActivity activity2 = getActivity();
            C87412m.m108592e(activity2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorWhiteListUI");
            ((FinderLiveVisitorWhiteListUI) activity2).mo3039N7(2);
        }
        if (!this.f26200r.isEmpty()) {
            AppCompatActivity activity3 = getActivity();
            C87412m.m108592e(activity3, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorWhiteListUI");
            ((FinderLiveVisitorWhiteListUI) activity3).mo3039N7(4);
        }
    }

    /* renamed from: l3 */
    public final void mo8854l3() {
        FinderLiveVisitorWhiteListUI.C2981a aVar = FinderLiveVisitorWhiteListUI.f14583v;
        LinkedList<String> linkedList = this.f26201s.f144559f;
        C87412m.m108593f(linkedList, "whiteList.contact_list");
        String b = aVar.mo3050b(linkedList);
        if (b.length() == 0) {
            TextView textView = this.f26191f;
            if (textView != null) {
                textView.setText(getContext().getResources().getString(C0966R.string.n9i));
            }
            TextView textView2 = this.f26191f;
            if (textView2 != null) {
                textView2.setTextColor(getContext().getResources().getColor(C0966R.color.BW_0_Alpha_0_3));
                return;
            }
            return;
        }
        TextView textView3 = this.f26191f;
        if (textView3 != null) {
            textView3.setText(b);
        }
        TextView textView4 = this.f26191f;
        if (textView4 != null) {
            textView4.setTextColor(getContext().getResources().getColor(C0966R.color.BW_0_Alpha_0_9));
        }
    }

    /* renamed from: m3 */
    public final void mo8855m3() {
        boolean z = false;
        if (this.f26197o.size() > 0) {
            TextView textView = this.f26195j;
            if (textView != null) {
                textView.setVisibility(0);
            }
            View view = this.f26194i;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/viewmodel/state/FinderLiveBaseWhiteListUIC", "updateWhiteList", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/viewmodel/state/FinderLiveBaseWhiteListUIC", "updateWhiteList", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            TextView textView2 = this.f26196n;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
        } else {
            TextView textView3 = this.f26195j;
            if (textView3 != null) {
                textView3.setVisibility(4);
            }
            View view2 = this.f26194i;
            if (view2 != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(4);
                View view3 = view2;
                C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/viewmodel/state/FinderLiveBaseWhiteListUIC", "updateWhiteList", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/live/viewmodel/state/FinderLiveBaseWhiteListUIC", "updateWhiteList", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            TextView textView4 = this.f26196n;
            if (textView4 != null) {
                textView4.setVisibility(0);
            }
        }
        String a = FinderLiveVisitorWhiteListUI.f14583v.mo3049a(this.f26198p);
        if (a.length() == 0) {
            z = true;
        }
        if (z) {
            TextView textView5 = this.f26195j;
            if (textView5 != null) {
                textView5.setText(getContext().getResources().getString(C0966R.string.n_5));
            }
            TextView textView6 = this.f26195j;
            if (textView6 != null) {
                textView6.setTextColor(getContext().getResources().getColor(C0966R.color.BW_0_Alpha_0_3));
                return;
            }
            return;
        }
        TextView textView7 = this.f26195j;
        if (textView7 != null) {
            textView7.setText(a);
        }
        TextView textView8 = this.f26195j;
        if (textView8 != null) {
            textView8.setTextColor(getContext().getResources().getColor(C0966R.color.BW_0_Alpha_0_9));
        }
    }

    /* renamed from: n3 */
    public abstract boolean mo8856n3();
}
