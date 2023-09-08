package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.p136ui.contact.C74498h1;
import com.tencent.p014mm.p136ui.contact.C74526m1;
import com.tencent.p014mm.p136ui.contact.MMBaseSelectContactUI;
import com.tencent.p014mm.pluginsdk.p133ui.MultiSelectContactView;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32226l;
import gl3.C75922b;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import qk1.C47865d2;
import qk1.C77358f2;
import sx3.C64175a0;
import vf1.C52873s3;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLiveSelectRoomUI;", "Lcom/tencent/mm/ui/contact/MMBaseSelectContactUI;", "<init>", "()V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveSelectRoomUI */
public final class FinderLiveSelectRoomUI extends MMBaseSelectContactUI {

    /* renamed from: D */
    public static final /* synthetic */ int f111552D = 0;

    /* renamed from: C */
    public final HashSet<String> f111553C = new HashSet<>();

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveSelectRoomUI$a */
    public static final class C29955a extends C87413o implements C32226l<String, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ String f81110d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29955a(String str) {
            super(1);
            this.f81110d = str;
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            C87412m.m108594g(str, LocaleUtil.ITALIAN);
            return Boolean.valueOf(Util.isEqual(this.f81110d, str));
        }
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
        String string = getContext().getString(C0966R.string.jdp);
        C87412m.m108593f(string, "context.getString(com.te…ng.sns_label_group_title)");
        return string;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0033, code lost:
        r1 = (gl3.C75921a) r1;
     */
    /* renamed from: R7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo64517R7(android.widget.AdapterView<?> r1, android.view.View r2, int r3, long r4) {
        /*
            r0 = this;
            android.widget.ListView r1 = r0.f218605d
            int r1 = r1.getHeaderViewsCount()
            int r1 = r3 - r1
            r2 = 1
            if (r1 >= 0) goto L_0x0023
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4[r5] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r4[r2] = r1
            java.lang.String r1 = "MicroMsg.FinderLiveMultiSelectChatRoomUI"
            java.lang.String r2 = "offsetPosition is Smaller than 0, offsetPosition=%d | position=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r4)
            return
        L_0x0023:
            com.tencent.mm.ui.contact.i1 r3 = r0.mo103379N7()
            gl3.b r1 = r3.getItem(r1)
            if (r1 != 0) goto L_0x002e
            return
        L_0x002e:
            boolean r3 = r1 instanceof gl3.C75921a
            if (r3 != 0) goto L_0x0033
            return
        L_0x0033:
            gl3.a r1 = (gl3.C75921a) r1
            com.tencent.mm.storage.z1 r3 = r1.f222600A
            if (r3 != 0) goto L_0x003a
            return
        L_0x003a:
            int r3 = r3.mo73975s2()
            if (r3 != r2) goto L_0x0041
            return
        L_0x0041:
            com.tencent.mm.storage.z1 r1 = r1.f222600A
            java.lang.String r2 = "contact"
            gy3.C87412m.m108593f(r1, r2)
            java.lang.String r1 = r1.getUsername()
            if (r1 != 0) goto L_0x0050
            java.lang.String r1 = ""
        L_0x0050:
            r0.mo103378K7()
            com.tencent.mm.pluginsdk.ui.MultiSelectContactView r2 = r0.f218609h
            r2.mo100244d(r1)
            java.util.HashSet<java.lang.String> r2 = r0.f111553C
            boolean r2 = r2.contains(r1)
            if (r2 == 0) goto L_0x0066
            java.util.HashSet<java.lang.String> r2 = r0.f111553C
            r2.remove(r1)
            goto L_0x006b
        L_0x0066:
            java.util.HashSet<java.lang.String> r2 = r0.f111553C
            r2.add(r1)
        L_0x006b:
            com.tencent.mm.ui.contact.m1 r1 = r0.f218607f
            r1.notifyDataSetChanged()
            r0.mo64527g8()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveSelectRoomUI.mo64517R7(android.widget.AdapterView, android.view.View, int, long):void");
    }

    /* renamed from: T7 */
    public void mo64518T7() {
        super.mo64518T7();
        ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("KEY_PARAMS_CHOOSE_WHITE_LIST_ROOM");
        if (!(stringArrayListExtra == null || stringArrayListExtra.isEmpty())) {
            this.f111553C.addAll(stringArrayListExtra);
        }
    }

    /* renamed from: V7 */
    public boolean mo64519V7() {
        return false;
    }

    /* renamed from: W7 */
    public boolean mo64520W7() {
        return false;
    }

    /* renamed from: b8 */
    public void mo64526b8(ListView listView, int i) {
    }

    /* renamed from: e6 */
    public void mo64521e6(int i, String str) {
        if (i == 1) {
            C64175a0.m75511s(this.f111553C, new C29955a(str));
            mo103379N7().notifyDataSetChanged();
            mo64527g8();
        }
    }

    /* renamed from: g8 */
    public final void mo64527g8() {
        int size = this.f111553C.size();
        if (size > 0) {
            enableOptionMenu(1, true);
            updateOptionMenuText(1, getString(C0966R.string.e_0, new Object[]{Integer.valueOf(size)}));
            return;
        }
        enableOptionMenu(1, false);
        updateOptionMenuText(1, getString(C0966R.string.e9z));
    }

    public int getLayoutId() {
        return C0966R.C0971layout.aih;
    }

    public void onCreate(Bundle bundle) {
        View view;
        super.onCreate(bundle);
        setTheme(C0966R.style.f8234a2);
        setActionbarColor(getResources().getColor(C0966R.color.f2947a4));
        setNavigationbarColor(getResources().getColor(C0966R.color.f2947a4));
        mo103385d8();
        MultiSelectContactView multiSelectContactView = this.f218609h;
        if (!(multiSelectContactView == null || (view = multiSelectContactView.f211608i) == null)) {
            view.setBackgroundColor(multiSelectContactView.getResources().getColor(C0966R.color.f2949a6));
        }
        addTextOptionMenu(1, getString(C0966R.string.e9z), new C52873s3(this), (View.OnLongClickListener) null, MMActivityController.C73075r.FINDER_LIVE);
        mo64527g8();
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.f111553C.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        this.f218609h.mo100245e(arrayList);
    }

    /* renamed from: x7 */
    public boolean mo7834x7(C75922b bVar) {
        C87412m.m108594g(bVar, "item");
        if (!bVar.mo106184e() || bVar.f222621r == null) {
            return false;
        }
        HashSet<String> hashSet = this.f111553C;
        ArrayList arrayList = new ArrayList();
        for (T next : hashSet) {
            if (Util.isEqual((String) next, bVar.f222621r)) {
                arrayList.add(next);
            }
        }
        return !arrayList.isEmpty();
    }
}
