package aw1;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.plugin.fts.p059ui.C18842a;
import com.tencent.p014mm.plugin.fts.p059ui.C18843b0;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import di3.C86312j;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kv1.C99260q;
import lv1.C10656l;
import lv1.C21461d;
import lv1.C76728k;
import lv1.C99664b;
import lv1.C99681n;
import ov1.C21891f;
import pv1.C22019b;
import xv1.C102758m;

/* renamed from: aw1.k */
public class C16727k extends C18842a {

    /* renamed from: o */
    public boolean f45208o = false;

    public C16727k(Context context, C21891f.C21893b bVar, int i) {
        super(context, bVar, i);
    }

    /* renamed from: b */
    public boolean mo17718b(View view, C22019b bVar, boolean z) {
        if (bVar instanceof C102758m) {
            int t = mo17717t();
            boolean z2 = this.f45208o;
            int i = C18843b0.f52842a;
            if (bVar.f62334l == 65536) {
                int i2 = bVar.f62328f;
                if (!(i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4)) {
                    if (i2 == 5) {
                        if (t == 1) {
                            i2 = 6;
                        } else if (t == 2) {
                            i2 = 5;
                        }
                    }
                }
                String format = String.format("%s,%s,%s", new Object[]{Integer.valueOf(bVar.mo35134f()), Integer.valueOf(i2), Integer.valueOf(z2 ? 1 : 0)});
                Log.m105927v("MicroMsg.FTS.FTSReportLogic", "reportFTSGlobalMsgResultClick: %d, %s", 14756, format);
                C115669n.INSTANCE.kvStat(14756, format);
            }
        }
        return false;
    }

    public int getType() {
        return 112;
    }

    /* renamed from: k */
    public C21461d mo17714k(int i, long j, C21891f.C21892a aVar) {
        if (i >= aVar.f61909f.size() || i < 0) {
            return null;
        }
        C99681n nVar = aVar.f61909f.get(i);
        C21461d dVar = new C21461d();
        dVar.f60765g = String.valueOf(nVar.hashCode());
        if (nVar.f292151e.equals("create_talker_message​")) {
            dVar.f60761c = 22;
            return dVar;
        }
        dVar.f60761c = 11;
        return dVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: xv1.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: xv1.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: xv1.m} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: xv1.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: xv1.i} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public pv1.C22019b mo17711o(int r7, ov1.C21891f.C21892a r8) {
        /*
            r6 = this;
            int r0 = r8.f61904a
            int r0 = r7 - r0
            boolean r1 = r8.f61905b
            if (r1 == 0) goto L_0x000a
            int r0 = r0 + -1
        L_0x000a:
            r1 = 0
            java.util.List<lv1.n> r2 = r8.f61909f
            int r2 = r2.size()
            r3 = 0
            r4 = 1
            if (r0 >= r2) goto L_0x004d
            if (r0 < 0) goto L_0x004d
            java.util.List<lv1.n> r1 = r8.f61909f
            java.lang.Object r1 = r1.get(r0)
            lv1.n r1 = (lv1.C99681n) r1
            java.lang.String r2 = r1.f292151e
            java.lang.String r5 = "create_talker_message​"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x003e
            xv1.i r1 = new xv1.i
            r1.<init>(r7)
            java.util.List<lv1.n> r7 = r8.f61909f
            int r7 = r7.size()
            if (r7 != r4) goto L_0x0038
            r7 = 1
            goto L_0x0039
        L_0x0038:
            r7 = 0
        L_0x0039:
            r1.f66424p = r7
            r6.f45208o = r4
            goto L_0x004d
        L_0x003e:
            xv1.m r2 = new xv1.m
            r2.<init>(r7)
            r2.f303426p = r1
            int r7 = r1.f292148b
            int r1 = r1.f292149c
            r2.mo35140k(r7, r1)
            r1 = r2
        L_0x004d:
            if (r1 == 0) goto L_0x0062
            int r7 = r0 + 1
            r1.f62332j = r7
            lv1.i r7 = r8.f61910g
            r1.f62327e = r7
            java.util.List<lv1.n> r7 = r8.f61909f
            int r7 = r7.size()
            int r7 = r7 - r4
            if (r0 != r7) goto L_0x0062
            r1.f62326d = r3
        L_0x0062:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: aw1.C16727k.mo17711o(int, ov1.f$a):pv1.b");
    }

    /* renamed from: q */
    public C99664b mo17712q(MMHandler mMHandler, HashSet<String> hashSet) {
        this.f45208o = false;
        C76728k kVar = new C76728k();
        kVar.f224468c = this.f52838h;
        kVar.f224475j = hashSet;
        kVar.f224478m = this;
        kVar.f224479n = mMHandler;
        kVar.f224467b = 1;
        kVar.f224474i = 3;
        return ((C99260q) C86312j.m106911c(C99260q.class)).Xn0(3, kVar);
    }

    /* renamed from: s */
    public void mo17713s(C10656l lVar, HashSet<String> hashSet) {
        if (mo34916j(lVar.f32076e)) {
            C21891f.C21892a aVar = new C21891f.C21892a();
            aVar.f61908e = -2;
            aVar.f61910g = lVar.f32075d;
            List<C99681n> list = lVar.f32076e;
            aVar.f61909f = list;
            if (list.size() > 3) {
                if (lVar.f32076e.get(3).f292151e.equals("create_talker_message​")) {
                    aVar.f61907d = false;
                    aVar.f61909f = new ArrayList(aVar.f61909f.subList(0, 4));
                } else {
                    aVar.f61907d = true;
                    aVar.f61909f = new ArrayList(aVar.f61909f.subList(0, 3));
                }
            } else if (lVar.f32076e.size() == 1 && lVar.f32076e.get(0).f292151e.equals("create_talker_message​")) {
                aVar.f61905b = false;
            }
            this.f52840j.add(aVar);
        }
    }

    /* renamed from: t */
    public int mo17717t() {
        return 0;
    }
}
