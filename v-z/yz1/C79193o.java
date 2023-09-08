package yz1;

import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.plugin.groupsolitaire.p885ui.GroupSolitatireEditUI;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: yz1.o */
public class C79193o implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f232502d;

    /* renamed from: e */
    public final /* synthetic */ GroupSolitatireEditUI f232503e;

    public C79193o(GroupSolitatireEditUI groupSolitatireEditUI, int i) {
        this.f232503e = groupSolitatireEditUI;
        this.f232502d = i;
    }

    public void run() {
        if (this.f232502d > 0) {
            Log.m105918d("MicroMsg.groupsolitaire.GroupSolitatireEditUI", "Scroll");
            GroupSolitatireEditUI groupSolitatireEditUI = this.f232503e;
            groupSolitatireEditUI.f198398e.smoothScrollBy(0, this.f232502d + ((MMEditText) groupSolitatireEditUI.f198412v).getLineHeight());
        }
    }
}
