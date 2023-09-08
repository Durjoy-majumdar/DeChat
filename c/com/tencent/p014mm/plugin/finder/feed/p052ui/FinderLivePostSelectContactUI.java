package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.p136ui.contact.C74498h1;
import com.tencent.p014mm.p136ui.contact.C74526m1;
import com.tencent.p014mm.p136ui.contact.C74560s1;
import com.tencent.p014mm.p136ui.contact.MMBaseSelectContactUI;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32226l;
import gl3.C75922b;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import qk1.C47865d2;
import qk1.C77358f2;
import sx3.C110818d0;
import sx3.C64175a0;
import sx3.C64186f0;
import te3.C49922iz3;
import te3.C50332lz3;
import te3.C51946xa1;
import vf1.C37731n3;
import vf1.C52870l3;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLivePostSelectContactUI;", "Lcom/tencent/mm/ui/contact/MMBaseSelectContactUI;", "<init>", "()V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLivePostSelectContactUI */
public final class FinderLivePostSelectContactUI extends MMBaseSelectContactUI {

    /* renamed from: J */
    public static final /* synthetic */ int f111537J = 0;

    /* renamed from: C */
    public ArrayList<String> f111538C = new ArrayList<>();

    /* renamed from: D */
    public ArrayList<String> f111539D = new ArrayList<>();

    /* renamed from: E */
    public ArrayList<C49922iz3> f111540E = new ArrayList<>();

    /* renamed from: F */
    public ArrayList<String> f111541F = new ArrayList<>();

    /* renamed from: G */
    public ArrayList<C50332lz3> f111542G = new ArrayList<>();

    /* renamed from: H */
    public int f111543H;

    /* renamed from: I */
    public ArrayList<String> f111544I = new ArrayList<>();

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLivePostSelectContactUI$b */
    public static final class C29952b extends C87413o implements C32226l<String, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ String f81107d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29952b(String str) {
            super(1);
            this.f81107d = str;
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            C87412m.m108594g(str, LocaleUtil.ITALIAN);
            return Boolean.valueOf(Util.isEqual(this.f81107d, str));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLivePostSelectContactUI$c */
    public static final class C29953c extends C87413o implements C32226l<String, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ String f81108d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29953c(String str) {
            super(1);
            this.f81108d = str;
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            C87412m.m108594g(str, LocaleUtil.ITALIAN);
            return Boolean.valueOf(Util.isEqual(this.f81108d, str));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLivePostSelectContactUI$d */
    public static final class C29954d extends C87413o implements C32226l<String, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ String f81109d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29954d(String str) {
            super(1);
            this.f81109d = str;
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            C87412m.m108594g(str, LocaleUtil.ITALIAN);
            return Boolean.valueOf(Util.isEqual(this.f81109d, str));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLivePostSelectContactUI$a */
    public static final class C41422a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ View f111545d;

        /* renamed from: e */
        public final /* synthetic */ FinderLivePostSelectContactUI f111546e;

        /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLivePostSelectContactUI$a$a */
        public static final class C41423a implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ FinderLivePostSelectContactUI f111547d;

            public C41423a(FinderLivePostSelectContactUI finderLivePostSelectContactUI) {
                this.f111547d = finderLivePostSelectContactUI;
            }

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderLivePostSelectContactUI$initView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                FinderLivePostSelectContactUI finderLivePostSelectContactUI = this.f111547d;
                int i = FinderLivePostSelectContactUI.f111537J;
                finderLivePostSelectContactUI.getClass();
                Intent intent = new Intent();
                intent.setClassName(finderLivePostSelectContactUI, "com.tencent.mm.ui.contact.SelectContactUI");
                intent.putExtra("list_type", 1);
                intent.putExtra("titile", finderLivePostSelectContactUI.getString(C0966R.string.ece));
                intent.putExtra("without_openim", true);
                C74560s1.m89276e();
                intent.putExtra("list_attr", C74560s1.m89278g(C74560s1.f219162c & -16777217, 131072));
                intent.putExtra("already_select_contact", Util.listToString(finderLivePostSelectContactUI.f111541F, ","));
                int i2 = finderLivePostSelectContactUI.f111543H;
                if (i2 <= 0) {
                    i2 = 500;
                }
                intent.putExtra("max_limit_num", i2);
                intent.putExtra("Forbid_SelectChatRoom", true);
                finderLivePostSelectContactUI.startActivityForResult(intent, 2);
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderLivePostSelectContactUI$initView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        public C41422a(View view, FinderLivePostSelectContactUI finderLivePostSelectContactUI) {
            this.f111545d = view;
            this.f111546e = finderLivePostSelectContactUI;
        }

        public final void run() {
            View view = this.f111545d;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderLivePostSelectContactUI$initView$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/feed/ui/FinderLivePostSelectContactUI$initView$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f111545d.setOnClickListener(new C41423a(this.f111546e));
            StringBuilder sb = new StringBuilder();
            sb.append("before init view holderView height:");
            FinderLivePostSelectContactUI finderLivePostSelectContactUI = this.f111546e;
            int i = FinderLivePostSelectContactUI.f111537J;
            sb.append(finderLivePostSelectContactUI.f218615q.getLayoutParams().height);
            Log.m105924i("FinderLivePostSelectContactUI", sb.toString());
            this.f111546e.f218615q.getLayoutParams().height += this.f111545d.getMeasuredHeight() > 0 ? this.f111545d.getMeasuredHeight() : MMApplicationContext.getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3758d_);
            Log.m105924i("FinderLivePostSelectContactUI", "after init view holderView height:" + this.f111546e.f218615q.getLayoutParams().height);
            this.f111546e.f218615q.requestLayout();
        }
    }

    /* renamed from: D6 */
    public boolean mo7830D6(C75922b bVar) {
        return bVar != null && this.f111544I.contains(bVar.f222621r);
    }

    /* renamed from: L7 */
    public C74526m1 mo64513L7() {
        return new C47865d2(this, (List<String>) null, true, false);
    }

    /* renamed from: M7 */
    public C74498h1 mo64514M7() {
        return new C77358f2(this, (List<String>) null, true);
    }

    /* renamed from: P7 */
    public int[] mo64515P7() {
        return new int[]{131075};
    }

    /* renamed from: Q7 */
    public String mo64516Q7() {
        String string = getString(C0966R.string.ear);
        C87412m.m108593f(string, "getString(R.string.finde…white_list_multi_contact)");
        return string;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0033, code lost:
        r7 = (gl3.C75921a) r5;
     */
    /* renamed from: R7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo64517R7(android.widget.AdapterView<?> r5, android.view.View r6, int r7, long r8) {
        /*
            r4 = this;
            android.widget.ListView r5 = r4.f218605d
            int r5 = r5.getHeaderViewsCount()
            int r5 = r7 - r5
            r6 = 0
            java.lang.String r8 = "FinderLivePostSelectContactUI"
            r9 = 1
            if (r5 >= 0) goto L_0x0023
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0[r6] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)
            r0[r9] = r5
            java.lang.String r5 = "offsetPosition is Smaller than 0, offsetPosition=%d | position=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r5, r0)
            return
        L_0x0023:
            com.tencent.mm.ui.contact.i1 r7 = r4.mo103379N7()
            gl3.b r5 = r7.getItem(r5)
            if (r5 != 0) goto L_0x002e
            return
        L_0x002e:
            boolean r7 = r5 instanceof gl3.C75921a
            if (r7 != 0) goto L_0x0033
            return
        L_0x0033:
            r7 = r5
            gl3.a r7 = (gl3.C75921a) r7
            com.tencent.mm.storage.z1 r0 = r7.f222600A
            if (r0 != 0) goto L_0x003b
            return
        L_0x003b:
            int r0 = r0.mo73975s2()
            if (r0 != r9) goto L_0x0042
            return
        L_0x0042:
            boolean r5 = r4.mo7830D6(r5)
            if (r5 == 0) goto L_0x0056
            r5 = 2131828949(0x7f1120d5, float:1.9290853E38)
            java.lang.String r5 = r4.getString(r5)
            r6 = 2131756021(0x7f1003f5, float:1.9142938E38)
            nj3.C76912y0.m92769h(r4, r5, r6)
            return
        L_0x0056:
            com.tencent.mm.storage.z1 r5 = r7.f222600A
            java.lang.String r7 = "contact"
            gy3.C87412m.m108593f(r5, r7)
            java.lang.String r7 = r5.getUsername()
            if (r7 != 0) goto L_0x0065
            java.lang.String r7 = ""
        L_0x0065:
            r5.getNickname()
            r4.mo103378K7()
            com.tencent.mm.pluginsdk.ui.MultiSelectContactView r0 = r4.f218609h
            r0.mo100244d(r7)
            java.util.ArrayList<java.lang.String> r0 = r4.f111539D
            boolean r0 = r0.contains(r7)
            r1 = 44
            if (r0 == 0) goto L_0x00a8
            java.util.ArrayList<java.lang.String> r6 = r4.f111539D
            r6.remove(r7)
            java.util.ArrayList<te3.iz3> r6 = r4.f111540E
            vf1.m3 r9 = new vf1.m3
            r9.<init>(r7)
            o40.C61926c.m72673R(r6, r9)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r9 = "remove room:"
            r6.append(r9)
            java.lang.CharSequence r5 = r5.f214114V1
            r6.append(r5)
            r6.append(r1)
            java.util.ArrayList<java.lang.String> r5 = r4.f111539D
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r5)
            goto L_0x00f8
        L_0x00a8:
            java.util.ArrayList<java.lang.String> r0 = r4.f111539D
            r0.add(r7)
            java.util.ArrayList<te3.iz3> r0 = r4.f111540E
            te3.iz3 r2 = new te3.iz3
            r2.<init>()
            r2.f135773d = r7
            java.lang.String r3 = r5.getUsername()
            if (r3 == 0) goto L_0x00c2
            int r3 = r3.length()
            if (r3 != 0) goto L_0x00c3
        L_0x00c2:
            r6 = 1
        L_0x00c3:
            if (r6 != 0) goto L_0x00d7
            java.lang.Class<d62.i> r6 = d62.C75339i.class
            di3.d r6 = di3.C86312j.m106911c(r6)
            d62.i r6 = (d62.C75339i) r6
            java.lang.String r9 = r5.getUsername()
            java.lang.String r6 = r6.pv0(r5, r9)
            r2.f135774e = r6
        L_0x00d7:
            r0.add(r2)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r9 = "add room:"
            r6.append(r9)
            java.lang.CharSequence r5 = r5.f214114V1
            r6.append(r5)
            r6.append(r1)
            java.util.ArrayList<java.lang.String> r5 = r4.f111539D
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r5)
        L_0x00f8:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "before select room,selectAllContact:"
            r5.append(r6)
            java.util.ArrayList<java.lang.String> r6 = r4.f111538C
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r5)
            java.util.ArrayList<java.lang.String> r5 = r4.f111538C
            boolean r5 = r5.contains(r7)
            if (r5 == 0) goto L_0x011c
            java.util.ArrayList<java.lang.String> r5 = r4.f111538C
            r5.remove(r7)
            goto L_0x0121
        L_0x011c:
            java.util.ArrayList<java.lang.String> r5 = r4.f111538C
            r5.add(r7)
        L_0x0121:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "after select room,selectAllContact:"
            r5.append(r6)
            java.util.ArrayList<java.lang.String> r6 = r4.f111538C
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "select_contact_step2-1,onSelectRoom selectRoom:"
            r5.append(r6)
            java.util.ArrayList<java.lang.String> r6 = r4.f111539D
            r5.append(r6)
            java.lang.String r6 = ", selectUser:"
            r5.append(r6)
            java.util.ArrayList<java.lang.String> r6 = r4.f111541F
            r5.append(r6)
            java.lang.String r6 = ", selectAllContact:"
            r5.append(r6)
            java.util.ArrayList<java.lang.String> r6 = r4.f111538C
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r5)
            r4.mo64522g8()
            com.tencent.mm.ui.contact.m1 r5 = r4.f218607f
            r5.notifyDataSetChanged()
            r4.mo64522g8()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLivePostSelectContactUI.mo64517R7(android.widget.AdapterView, android.view.View, int, long):void");
    }

    /* renamed from: T7 */
    public void mo64518T7() {
        super.mo64518T7();
        this.f111543H = getIntent().getIntExtra("KEY_PARAMS_MAX_USER_COUNT", 0);
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("KEY_PARAMS_WHITE_LIST");
        if (byteArrayExtra != null) {
            C51946xa1 xa12 = new C51946xa1();
            xa12.parseFrom(byteArrayExtra);
            this.f111538C.addAll(xa12.f144559f);
            this.f111539D.addAll(xa12.f144557d);
            this.f111541F.addAll(xa12.f144558e);
        }
        this.f111544I.clear();
        ArrayList<String> arrayList = this.f111544I;
        Collection stringArrayListExtra = getIntent().getStringArrayListExtra("KEY_PARAMS_LUCKY_MONEY_LIST");
        if (stringArrayListExtra == null) {
            stringArrayListExtra = C64186f0.f181907d;
        }
        arrayList.addAll(stringArrayListExtra);
        Log.m105924i("FinderLivePostSelectContactUI", "select_contact_step1,init selectRoom:" + this.f111539D + ", selectUser:" + this.f111541F + ", selectAllContact:" + this.f111538C + ", luckyMoneyAlwaysSelectList:" + C110818d0.m150921S(this.f111544I, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null));
    }

    /* renamed from: V7 */
    public boolean mo64519V7() {
        return false;
    }

    /* renamed from: W7 */
    public boolean mo64520W7() {
        return false;
    }

    /* renamed from: e6 */
    public void mo64521e6(int i, String str) {
        if (i == 1) {
            C64175a0.m75512t(this.f111541F, new C29952b(str));
            C64175a0.m75512t(this.f111539D, new C29953c(str));
            C64175a0.m75512t(this.f111538C, new C29954d(str));
            mo103379N7().notifyDataSetChanged();
            mo64522g8();
            Log.m105924i("FinderLivePostSelectContactUI", "select_contact_step2-2,onSelectChange selectRoom:" + this.f111539D + ", selectUser:" + this.f111541F + ", selectAllContact:" + this.f111538C);
        }
    }

    /* renamed from: g8 */
    public final void mo64522g8() {
        int size = this.f111538C.size();
        if (size > 0) {
            updateOptionMenuText(1, getString(C0966R.string.e_0, new Object[]{Integer.valueOf(size)}));
            return;
        }
        updateOptionMenuText(1, getString(C0966R.string.e9z));
    }

    public int getLayoutId() {
        return C0966R.C0971layout.aih;
    }

    public void initView() {
        super.initView();
        View findViewById = findViewById(C0966R.C0970id.f359151ja0);
        if (findViewById != null) {
            findViewById.post(new C41422a(findViewById, this));
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 2) {
            List<String> stringToList = Util.stringToList(intent != null ? intent.getStringExtra("Select_Contact") : null, ",");
            if (stringToList != null) {
                LinkedList linkedList = new LinkedList(stringToList);
                Log.m105924i("FinderLivePostSelectContactUI", "select user:" + linkedList);
                Log.m105924i("FinderLivePostSelectContactUI", "before select user, userList:" + linkedList);
                Log.m105924i("FinderLivePostSelectContactUI", "before select user,selectAllContact:" + this.f111538C);
                C64175a0.m75512t(this.f111538C, new C37731n3(this));
                this.f111538C.addAll(linkedList);
                Log.m105924i("FinderLivePostSelectContactUI", "after select user,selectAllContact:" + this.f111538C);
                this.f111541F.clear();
                this.f111541F.addAll(linkedList);
                this.f218609h.mo100245e(this.f111538C);
                Log.m105924i("FinderLivePostSelectContactUI", "select_contact_step3,onSelectChange selectRoom:" + this.f111539D + ", selectUser:" + this.f111541F + ", selectAllContact:" + this.f111538C);
                mo64522g8();
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        addTextOptionMenu(1, getString(C0966R.string.e9z), new C52870l3(this), (View.OnLongClickListener) null, MMActivityController.C73075r.FINDER_LIVE);
        enableOptionMenu(1, true);
        this.f218609h.mo100245e(this.f111538C);
    }

    /* renamed from: x7 */
    public boolean mo7834x7(C75922b bVar) {
        C87412m.m108594g(bVar, "item");
        if (!bVar.mo106184e() || bVar.f222621r == null) {
            return false;
        }
        ArrayList<String> arrayList = this.f111538C;
        ArrayList arrayList2 = new ArrayList();
        for (T next : arrayList) {
            if (Util.isEqual((String) next, bVar.f222621r)) {
                arrayList2.add(next);
            }
        }
        return !arrayList2.isEmpty();
    }
}
