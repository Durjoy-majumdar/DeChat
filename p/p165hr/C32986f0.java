package p165hr;

import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import ig1.C33320g;
import ik1.C33344j;
import p565ir.C60611o;
import p749xh.C38616n3;

@C86522b
/* renamed from: hr.f0 */
public final class C32986f0 extends C86301e implements C60611o {
    /* renamed from: T6 */
    public C38616n3 mo58912T6(long j) {
        return ((C60106t) C86312j.m106911c(C60106t.class)).Bx0().mo59081jo(j);
    }

    public boolean Y10() {
        C33344j Bx0 = ((C60106t) C86312j.m106911c(C60106t.class)).Bx0();
        Bx0.getClass();
        Log.m105924i("MicroMsg.FinderLiveNotifyExposureInfoStorage", "[delAll]");
        Bx0.f90385e.rawQuery("delete from FinderLiveNotifyExposureInfo", (String[]) null);
        return false;
    }

    /* renamed from: iw */
    public void mo58914iw(long j) {
        C33344j Bx0 = ((C60106t) C86312j.m106911c(C60106t.class)).Bx0();
        if (j == -1) {
            Bx0.getClass();
            return;
        }
        C33320g jo = Bx0.mo59081jo(j);
        Log.m105924i("MicroMsg.FinderLiveNotifyExposureInfoStorage", "onFinderNotifyExpose ,msgId = " + j + ",tipsId = " + jo.field_tipsId + ", rowId = " + jo.systemRowid);
        if (jo.systemRowid != -1) {
            jo.field_exposureStatus = 1;
            Bx0.updateNotify(jo, false, new String[0]);
        }
    }

    public boolean od0(long j) {
        return ((C60106t) C86312j.m106911c(C60106t.class)).Bx0().od0(j);
    }
}
