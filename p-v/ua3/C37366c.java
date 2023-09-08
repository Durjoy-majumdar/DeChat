package ua3;

import com.tencent.p014mm.plugin.ball.model.BallInfo;
import di3.C86312j;
import java.util.List;
import p646pn.C110234e;
import xv0.C112187l;

/* renamed from: ua3.c */
public class C37366c implements C112187l {

    /* renamed from: a */
    public final /* synthetic */ long f98790a;

    public C37366c(C37367d dVar, long j) {
        this.f98790a = j;
    }

    /* renamed from: a */
    public void mo61051a(List<BallInfo> list) {
        String str;
        if (list != null && list.size() > 0) {
            for (BallInfo next : list) {
                if (next.f311686d == 3 && next.f311678C.getInt("eventType") == 1 && (str = next.f311688f) != null) {
                    if (str.startsWith("" + this.f98790a)) {
                        ((C110234e) C86312j.m106911c(C110234e.class)).mo161399pY().mo149108Z(next);
                        return;
                    }
                }
            }
        }
    }
}
