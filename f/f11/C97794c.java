package f11;

import com.tencent.p014mm.p136ui.gridviewheaders.C74763a;
import com.tencent.p014mm.plugin.choosemsgfile.logic.p881ui.C92977a;
import com.tencent.p014mm.plugin.choosemsgfile.logic.p881ui.C92993j;
import com.tencent.p014mm.sdk.platformtools.LruCache;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import g11.C98068c;
import hc0.C20937c;
import java.util.Date;

/* renamed from: f11.c */
public class C97794c extends C97792a<C97805n> {

    /* renamed from: f */
    public final long f286884f;

    public C97794c(C92993j jVar, long j) {
        super(jVar);
        this.f286884f = j;
    }

    /* renamed from: g */
    public long mo137123g() {
        return this.f286884f;
    }

    /* renamed from: h */
    public int mo137124h() {
        return 0;
    }

    /* renamed from: m */
    public void mo137126j(C97805n nVar, int i, C97792a aVar) {
        if (i != ((C92977a) this.f286877a).getItemCount() - 1) {
            long g = ((C92977a) this.f286877a).mo127392F4(i + 1).mo137123g();
            LruCache<Integer, C20937c> lruCache = C98068c.f287519a;
            if (C74763a.m89510e().mo103933a(new Date(g)) == C74763a.m89510e().mo103933a(new Date(this.f286884f))) {
                nVar.f286902A.setVisibility(0);
                nVar.f286902A.setText(C74763a.m89510e().mo103936d(new Date(this.f286884f), MMApplicationContext.getContext()));
                if (this.f286877a.mo127393x4()) {
                    nVar.f286903B.setVisibility(0);
                    return;
                } else {
                    nVar.f286903B.setVisibility(8);
                    return;
                }
            }
        }
        nVar.f286902A.setVisibility(8);
    }
}
