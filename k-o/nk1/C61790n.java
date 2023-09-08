package nk1;

import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import java.util.ArrayList;

/* renamed from: nk1.n */
public final class C61790n {

    /* renamed from: a */
    public static final C61790n f175670a = new C61790n();

    /* renamed from: b */
    public static C61793q f175671b;

    /* renamed from: c */
    public static C61777d f175672c;

    /* renamed from: a */
    public final void mo86718a(int i, C61792p pVar) {
        if (pVar != null) {
            pVar.f175675b.f175626b = i;
            if (pVar.f175674a) {
                C34862a aVar = pVar.f175676c;
                if (aVar != null) {
                    int i2 = aVar.f93650c;
                    if (i2 < Integer.MAX_VALUE) {
                        long j = aVar.f93649b;
                        long j2 = (long) i;
                        if (j + j2 < MAlarmHandler.NEXT_FIRE_INTERVAL) {
                            int i3 = i2 + 1;
                            aVar.f93650c = i3;
                            long j3 = j + j2;
                            aVar.f93649b = j3;
                            aVar.f93651d = j3 / ((long) i3);
                        }
                    }
                    pVar.f175674a = false;
                }
                ArrayList<C61778e> arrayList = pVar.f175677d;
                if (arrayList != null) {
                    for (C61778e eVar : arrayList) {
                        if (i < eVar.f175626b) {
                            int i4 = eVar.f175627c;
                            if (i4 < Integer.MAX_VALUE) {
                                eVar.f175627c = i4 + 1;
                                return;
                            } else {
                                pVar.f175674a = false;
                                return;
                            }
                        }
                    }
                }
            }
        }
    }
}
