package k11;

import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.clean.p036ui.fileindexui.CleanChattingDetailUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.wcdb.support.CancellationSignal;
import i11.C98586h;
import j11.C98895d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import wy0.C102506a;
import yy0.C102970a;
import zt3.C119157j;

public final /* synthetic */ class t$$g implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ CleanChattingDetailUI f290495d;

    public /* synthetic */ t$$g(CleanChattingDetailUI cleanChattingDetailUI) {
        this.f290495d = cleanChattingDetailUI;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        CleanChattingDetailUI cleanChattingDetailUI = this.f290495d;
        int i2 = CleanChattingDetailUI.f267875s;
        cleanChattingDetailUI.getClass();
        C102506a aVar = C102506a.f301832a;
        C102506a.f301840i = false;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(cleanChattingDetailUI.f267876d.f290454d);
        Collections.sort(arrayList);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            C98895d dVar = cleanChattingDetailUI.f267876d.f290456f.get(intValue);
            if (dVar != null) {
                arrayList2.add(dVar);
                cleanChattingDetailUI.f267876d.f290456f.remove(intValue);
                int i3 = dVar.f289895b;
                if (i3 == 1) {
                    cleanChattingDetailUI.f267882j += dVar.f289894a;
                } else if (i3 == 3) {
                    cleanChattingDetailUI.f267883n += dVar.f289894a;
                } else if (i3 != 4) {
                    cleanChattingDetailUI.f267885p += dVar.f289894a;
                } else {
                    cleanChattingDetailUI.f267884o += dVar.f289894a;
                }
            }
        }
        C99085s sVar = cleanChattingDetailUI.f267876d;
        sVar.f290454d.clear();
        sVar.mo138425a();
        cleanChattingDetailUI.f267876d.notifyDataSetChanged();
        cleanChattingDetailUI.f267877e.setEnabled(!cleanChattingDetailUI.f267876d.f290456f.isEmpty());
        C98586h hVar = new C98586h((List<String>) null, arrayList2, C102970a.f303862G, Long.MIN_VALUE, MAlarmHandler.NEXT_FIRE_INTERVAL, true, cleanChattingDetailUI, (CancellationSignal) null);
        cleanChattingDetailUI.f267886q = System.currentTimeMillis();
        ((C119157j) C119157j.f356862d).mo183870a(hVar);
        cleanChattingDetailUI.f267880h.show();
        cleanChattingDetailUI.f267880h.setMessage(cleanChattingDetailUI.getString(C0966R.string.beu, new Object[]{"0%"}));
        C115669n.INSTANCE.idkeyStat(714, 31, 1, false);
    }
}
