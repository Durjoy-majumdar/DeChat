package yz1;

import android.content.DialogInterface;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.groupsolitaire.p885ui.GroupSolitatireEditUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C31543z5;
import eb0.C75592q0;
import nj3.C76879j;
import p823sg.C101611g;
import wz1.C78747b;
import xz1.C79013a;

/* renamed from: yz1.u */
public class C79201u implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ GroupSolitatireEditUI f232513d;

    /* renamed from: yz1.u$a */
    public class C79202a implements DialogInterface.OnClickListener {
        public C79202a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Log.m105924i("MicroMsg.groupsolitaire.GroupSolitatireEditUI", "group solitatire repeat dialog ok");
            GroupSolitatireEditUI.m81317I7(C79201u.this.f232513d);
        }
    }

    /* renamed from: yz1.u$b */
    public class C79203b implements DialogInterface.OnClickListener {
        public C79203b(C79201u uVar) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Log.m105924i("MicroMsg.groupsolitaire.GroupSolitatireEditUI", "group solitatire repeat dialog cancel");
        }
    }

    public C79201u(GroupSolitatireEditUI groupSolitatireEditUI) {
        this.f232513d = groupSolitatireEditUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        Log.m105925i("MicroMsg.groupsolitaire.GroupSolitatireEditUI", "send group solitaire(sending:%s)", Boolean.valueOf(this.f232513d.f198391N));
        GroupSolitatireEditUI groupSolitatireEditUI = this.f232513d;
        if (groupSolitatireEditUI.f198391N) {
            return true;
        }
        String str = groupSolitatireEditUI.f198381D;
        String s = C75592q0.m90789s();
        C79013a aVar = this.f232513d.f198379B;
        C101611g<Integer, C79013a> gVar = C78747b.f230457a;
        C78747b.m95106f(str, s, aVar, (long) C31543z5.m39455e(), true);
        GroupSolitatireEditUI groupSolitatireEditUI2 = this.f232513d;
        if (groupSolitatireEditUI2.f198379B.f232008P) {
            C76879j.m92707A(groupSolitatireEditUI2.getContext(), this.f232513d.getString(C0966R.string.ffn), "", this.f232513d.getString(C0966R.string.ffm), this.f232513d.getString(C0966R.string.ffl), new C79202a(), new C79203b(this));
        } else {
            GroupSolitatireEditUI.m81317I7(groupSolitatireEditUI2);
        }
        return true;
    }
}
