package lc1;

import android.widget.CompoundButton;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.util.TreeMap;
import pb1.C100718j1;
import pb1.C100755z;
import xb1.C102614d;

public class c$$b implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C99373c f291380a;

    public c$$b(C99373c cVar) {
        this.f291380a = cVar;
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (compoundButton.getTag() != null) {
            C100755z zVar = (C100755z) compoundButton.getTag();
            if (z) {
                C100755z Yt = ((C102614d) ((C100718j1) C86312j.m106911c(C100718j1.class)).mo128199Jq()).mo142266Yt(zVar.field_localId);
                if (zVar.f295172Q0) {
                    zVar.f295173R0 = Yt;
                    ((TreeMap) this.f291380a.f291379b.f291384d).put(zVar.f295174S0, zVar);
                } else {
                    ((TreeMap) this.f291380a.f291379b.f291384d).put(Util.notNullToString(Long.valueOf(zVar.field_localId)), Yt);
                }
            } else if (zVar.f295172Q0) {
                ((TreeMap) this.f291380a.f291379b.f291384d).remove(zVar.f295174S0);
            } else {
                ((TreeMap) this.f291380a.f291379b.f291384d).remove(Util.notNullToString(Long.valueOf(zVar.field_localId)));
            }
            c$$f c__f = this.f291380a.f291379b.f291385e;
            if (c__f != null) {
                c__f.mo128246g3(zVar.field_localId, z);
            }
        }
    }
}
