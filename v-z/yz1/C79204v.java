package yz1;

import android.graphics.Bitmap;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.groupsolitaire.p885ui.GroupSolitatireEditUI;
import di3.C86312j;
import p196ln.C76708i;

/* renamed from: yz1.v */
public class C79204v implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ GroupSolitatireEditUI f232515d;

    public C79204v(GroupSolitatireEditUI groupSolitatireEditUI) {
        this.f232515d = groupSolitatireEditUI;
    }

    public void run() {
        Bitmap N50 = ((C76708i) C86312j.m106911c(C76708i.class)).N50(this.f232515d.f198379B.field_creator);
        if (N50 == null) {
            this.f232515d.f198399f.setImageResource(C0966R.C0969drawable.bfa);
        } else {
            this.f232515d.f198399f.setImageBitmap(N50);
        }
    }
}
