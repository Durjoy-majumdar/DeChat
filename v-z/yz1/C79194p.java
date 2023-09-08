package yz1;

import android.view.View;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.plugin.groupsolitaire.p885ui.GroupSolitatireEditUI;

/* renamed from: yz1.p */
public class C79194p implements View.OnFocusChangeListener {

    /* renamed from: d */
    public final /* synthetic */ MMEditText f232504d;

    /* renamed from: e */
    public final /* synthetic */ GroupSolitatireEditUI f232505e;

    /* renamed from: yz1.p$a */
    public class C79195a implements Runnable {
        public C79195a() {
        }

        public void run() {
            GroupSolitatireEditUI groupSolitatireEditUI = C79194p.this.f232505e;
            int i = GroupSolitatireEditUI.f198377U;
            groupSolitatireEditUI.mo95047Q7();
        }
    }

    /* renamed from: yz1.p$b */
    public class C79196b implements Runnable {
        public C79196b() {
        }

        public void run() {
            GroupSolitatireEditUI groupSolitatireEditUI = C79194p.this.f232505e;
            GroupSolitatireEditUI.m81318J7(groupSolitatireEditUI, groupSolitatireEditUI.f198384G);
        }
    }

    public C79194p(GroupSolitatireEditUI groupSolitatireEditUI, MMEditText mMEditText) {
        this.f232505e = groupSolitatireEditUI;
        this.f232504d = mMEditText;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r3 = r2.f232505e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onFocusChange(android.view.View r3, boolean r4) {
        /*
            r2 = this;
            if (r4 == 0) goto L_0x0023
            com.tencent.mm.plugin.groupsolitaire.ui.GroupSolitatireEditUI r3 = r2.f232505e
            android.view.View r4 = r3.f198412v
            if (r4 == 0) goto L_0x0023
            boolean r3 = r3.f198384G
            if (r3 == 0) goto L_0x0023
            yz1.p$a r3 = new yz1.p$a
            r3.<init>()
            r0 = 200(0xc8, double:9.9E-322)
            r4.postDelayed(r3, r0)
            com.tencent.mm.plugin.groupsolitaire.ui.GroupSolitatireEditUI r3 = r2.f232505e
            android.view.View r3 = r3.f198412v
            yz1.p$b r4 = new yz1.p$b
            r4.<init>()
            r3.postDelayed(r4, r0)
            goto L_0x0029
        L_0x0023:
            com.tencent.mm.ui.widget.MMEditText r3 = r2.f232504d
            r4 = 0
            r3.setSelection(r4)
        L_0x0029:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yz1.C79194p.onFocusChange(android.view.View, boolean):void");
    }
}
