package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.p136ui.contact.C74498h1;
import com.tencent.p014mm.p136ui.contact.C74526m1;
import com.tencent.p014mm.p136ui.contact.MMBaseSelectContactUI;
import com.tencent.p014mm.pluginsdk.p133ui.MultiSelectContactView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gl3.C75922b;
import gy3.C24564k0;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import qk1.C47867k2;
import qk1.C77359l2;
import vf1.C52871q3;
import vf1.C52872r3;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLiveSelectRoomForLuckMoneyUI;", "Lcom/tencent/mm/ui/contact/MMBaseSelectContactUI;", "<init>", "()V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveSelectRoomForLuckMoneyUI */
public final class FinderLiveSelectRoomForLuckMoneyUI extends MMBaseSelectContactUI {

    /* renamed from: F */
    public static final /* synthetic */ int f111548F = 0;

    /* renamed from: C */
    public MultiSelectContactView f111549C;

    /* renamed from: D */
    public final HashSet<String> f111550D = new HashSet<>();

    /* renamed from: E */
    public int f111551E;

    /* renamed from: L7 */
    public C74526m1 mo64513L7() {
        C47867k2 k2Var = new C47867k2(this, (List<String>) null, true, false);
        k2Var.f219057f = true;
        return k2Var;
    }

    /* renamed from: M7 */
    public C74498h1 mo64514M7() {
        return new C77359l2(this, (List<String>) null, true);
    }

    /* renamed from: P7 */
    public int[] mo64515P7() {
        return new int[]{131075};
    }

    /* renamed from: Q7 */
    public String mo64516Q7() {
        String string = getContext().getString(C0966R.string.e6v);
        C87412m.m108593f(string, "context.getString(R.stri…t_room_lucky_money_title)");
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
            java.lang.String r1 = "Finder.FinderLiveSelectRoomForLuckMoneyUI"
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
            java.util.HashSet<java.lang.String> r2 = r0.f111550D
            boolean r2 = r2.contains(r1)
            if (r2 == 0) goto L_0x0066
            java.util.HashSet<java.lang.String> r2 = r0.f111550D
            r2.remove(r1)
            com.tencent.mm.pluginsdk.ui.MultiSelectContactView r2 = r0.f218609h
            r2.mo100244d(r1)
            goto L_0x007a
        L_0x0066:
            java.util.HashSet<java.lang.String> r2 = r0.f111550D
            int r2 = r2.size()
            int r3 = r0.f111551E
            if (r2 >= r3) goto L_0x007a
            java.util.HashSet<java.lang.String> r2 = r0.f111550D
            r2.add(r1)
            com.tencent.mm.pluginsdk.ui.MultiSelectContactView r2 = r0.f218609h
            r2.mo100244d(r1)
        L_0x007a:
            r0.mo103378K7()
            com.tencent.mm.ui.contact.m1 r1 = r0.f218607f
            r1.notifyDataSetChanged()
            r0.mo64525g8()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveSelectRoomForLuckMoneyUI.mo64517R7(android.widget.AdapterView, android.view.View, int, long):void");
    }

    /* renamed from: T7 */
    public void mo64518T7() {
        super.mo64518T7();
        this.f111551E = getIntent().getIntExtra("KEY_LUCKY_MONEY_CHAT_ROOM_MAX_COUNT", 0);
        ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("KEY_LUCKY_MONEY_CHAT_ROOM_USERNAME");
        this.f111550D.clear();
        if (stringArrayListExtra != null) {
            for (String str : stringArrayListExtra) {
                if (!(str == null || str.length() == 0)) {
                    this.f111550D.add(str);
                }
            }
        }
        Log.m105924i("Finder.FinderLiveSelectRoomForLuckMoneyUI", "initData maxRoomCount:" + this.f111551E + ",selectUserSet size:" + this.f111550D.size());
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
            C24564k0.m30737a(this.f111550D).remove(str);
            mo103379N7().notifyDataSetChanged();
            mo64525g8();
        }
    }

    /* renamed from: g8 */
    public final void mo64525g8() {
        HashSet<String> hashSet = this.f111550D;
        if (!(hashSet == null || hashSet.isEmpty())) {
            updateOptionMenuText(1, getContext().getResources().getString(C0966R.string.e_0, new Object[]{Integer.valueOf(this.f111550D.size())}));
        } else {
            updateOptionMenuText(1, getString(C0966R.string.e9z));
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.ajs;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        addTextOptionMenu(1, getString(C0966R.string.e9z), new C52871q3(this), (View.OnLongClickListener) null, MMActivityController.C73075r.FINDER_LIVE);
        mo64525g8();
        this.f111549C = (MultiSelectContactView) findViewById(C0966R.C0970id.bpe);
        this.f218609h.mo100245e(new ArrayList(this.f111550D));
        if (getMMSubTitle() != null) {
            setMMSubTitle(getString(C0966R.string.e6u));
        }
        MultiSelectContactView multiSelectContactView = this.f111549C;
        if (multiSelectContactView != null) {
            multiSelectContactView.post(new C52872r3(this));
        }
    }

    /* renamed from: x7 */
    public boolean mo7834x7(C75922b bVar) {
        if (bVar == null || !bVar.mo106184e() || bVar.f222621r == null) {
            return false;
        }
        HashSet<String> hashSet = this.f111550D;
        ArrayList arrayList = new ArrayList();
        for (T next : hashSet) {
            if (Util.isEqual((String) next, bVar.f222621r)) {
                arrayList.add(next);
            }
        }
        return !arrayList.isEmpty();
    }
}
