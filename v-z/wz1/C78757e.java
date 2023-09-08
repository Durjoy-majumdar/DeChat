package wz1;

import android.util.Base64;
import android.util.Pair;
import com.tencent.p014mm.autogen.mmdata.rpt.SoliotaireJoinStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.SolitaireActiveStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.SolitaireClickReportStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.SolitaireDropReportStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.SolitaireFormatInputEnterReportStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.SolitaireTipsShowReportStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import sz1.C77815b;
import xz1.C79013a;
import xz1.C79014b;
import zt3.C119157j;

/* renamed from: wz1.e */
public class C78757e {

    /* renamed from: a */
    public ConcurrentHashMap<Long, Pair<String, String>> f230477a = new ConcurrentHashMap<>();

    /* renamed from: b */
    public ConcurrentHashMap<Long, Boolean> f230478b = new ConcurrentHashMap<>();

    /* renamed from: c */
    public ConcurrentHashMap<Long, C78759b> f230479c = new ConcurrentHashMap<>();

    /* renamed from: d */
    public ConcurrentHashMap<Long, C78760c> f230480d = new ConcurrentHashMap<>();

    /* renamed from: wz1.e$a */
    public class C78758a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C79013a f230481d;

        /* renamed from: e */
        public final /* synthetic */ C79013a f230482e;

        /* renamed from: f */
        public final /* synthetic */ int f230483f;

        public C78758a(C78757e eVar, C79013a aVar, C79013a aVar2, int i) {
            this.f230481d = aVar;
            this.f230482e = aVar2;
            this.f230483f = i;
        }

        public void run() {
            String str;
            int i;
            int i2;
            if (this.f230481d == null) {
                int size = this.f230482e.f232007N.size();
                str = this.f230482e.f232004K;
                i = size;
                i2 = 0;
            } else {
                HashSet hashSet = new HashSet();
                HashMap hashMap = new HashMap();
                for (int i3 = 1; i3 <= this.f230481d.f232007N.size(); i3++) {
                    C79014b bVar = this.f230481d.f232007N.get(Integer.valueOf(i3));
                    if (bVar != null && Util.isEqual(bVar.f232010a, C75592q0.m90789s())) {
                        hashSet.add(bVar);
                        hashMap.put(bVar.f232014e, bVar);
                    }
                }
                str = "";
                i = 0;
                int i4 = 0;
                for (int i5 = 1; i5 <= this.f230482e.f232007N.size(); i5++) {
                    C79014b bVar2 = this.f230482e.f232007N.get(Integer.valueOf(i5));
                    if (Util.isEqual(bVar2.f232010a, C75592q0.m90789s())) {
                        if (hashSet.contains(bVar2)) {
                            i4++;
                        } else {
                            i++;
                            if (Util.isNullOrNil(str)) {
                                str = bVar2.f232012c;
                            }
                        }
                    }
                }
                i2 = hashSet.size() - i4;
            }
            if (Util.isNullOrNil(str)) {
                str = this.f230482e.f232004K;
            }
            SoliotaireJoinStruct soliotaireJoinStruct = new SoliotaireJoinStruct();
            soliotaireJoinStruct.f194427j = soliotaireJoinStruct.mo86045b("Identifier", this.f230482e.field_key, true);
            soliotaireJoinStruct.f194421d = soliotaireJoinStruct.mo86045b("ChatName", this.f230482e.field_username, true);
            soliotaireJoinStruct.f194422e = soliotaireJoinStruct.mo86045b("LaunchUserName", this.f230482e.field_creator, true);
            soliotaireJoinStruct.f194423f = this.f230482e.field_msgSvrId;
            soliotaireJoinStruct.f194424g = (long) i2;
            soliotaireJoinStruct.f194425h = (long) i;
            soliotaireJoinStruct.f194426i = (long) this.f230483f;
            soliotaireJoinStruct.f194428k = soliotaireJoinStruct.mo86045b("Punctuation", Base64.encodeToString(str.getBytes(), 0), true);
            Log.m105919d("MicroMsg.groupsolitaire.GroupSolitatireReportManager", "separator:%s base64:%s", str, Base64.encodeToString(str.getBytes(), 0));
            soliotaireJoinStruct.mo86054n();
        }
    }

    /* renamed from: wz1.e$b */
    public class C78759b {

        /* renamed from: a */
        public String f230484a = "";

        /* renamed from: b */
        public long f230485b = 0;

        /* renamed from: c */
        public long f230486c = 0;

        /* renamed from: d */
        public String f230487d = "";

        public C78759b(C78757e eVar) {
        }
    }

    /* renamed from: wz1.e$c */
    public class C78760c {

        /* renamed from: a */
        public C79013a f230488a;

        /* renamed from: b */
        public C79013a f230489b;

        /* renamed from: c */
        public int f230490c;

        public C78760c(C78757e eVar, C79013a aVar, C79013a aVar2, int i) {
            this.f230488a = aVar;
            this.f230489b = aVar2;
            this.f230490c = i;
        }
    }

    /* renamed from: a */
    public void mo108680a(long j, C79013a aVar, C79013a aVar2, boolean z, int i) {
        if (j >= 0 && aVar != null) {
            this.f230477a.put(Long.valueOf(j), new Pair(aVar.field_username, aVar.field_key));
            this.f230478b.put(Long.valueOf(j), Boolean.valueOf(z));
            this.f230480d.put(Long.valueOf(j), new C78760c(this, aVar, aVar2, i));
        }
    }

    /* renamed from: b */
    public void mo108681b(C79013a aVar, String str) {
        if (aVar == null) {
            Log.m105920e("MicroMsg.groupsolitaire.GroupSolitatireReportManager", "reportSolitaireActive() groupSolitatire == null");
            return;
        }
        C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(aVar.field_firstMsgId);
        if (aVar.field_msgSvrId == 0) {
            aVar.field_msgSvrId = b002.mo108774y2();
            ((C77815b) C86312j.m106911c(C77815b.class)).xx0().mo108984kD(aVar, true);
        }
        mo108682c(aVar, true, str, aVar.field_msgSvrId);
    }

    /* renamed from: c */
    public final void mo108682c(C79013a aVar, boolean z, String str, long j) {
        if (j == 0) {
            Log.m105921e("MicroMsg.groupsolitaire.GroupSolitatireReportManager", "reportSolitaireActive() MsgSvrId==0 key:%s", aVar.field_key);
            return;
        }
        Log.m105925i("MicroMsg.groupsolitaire.GroupSolitatireReportManager", "reportSolitaireActive() MsgSvrId==%s key:%s", Long.valueOf(j), aVar.field_key);
        SolitaireActiveStruct solitaireActiveStruct = new SolitaireActiveStruct();
        solitaireActiveStruct.f194437l = solitaireActiveStruct.mo86045b("Identifier", aVar.field_key, true);
        solitaireActiveStruct.f194429d = solitaireActiveStruct.mo86045b("ChatName", aVar.field_username, true);
        solitaireActiveStruct.f194430e = solitaireActiveStruct.mo86045b("LaunchUserName", aVar.field_creator, true);
        if (z) {
            solitaireActiveStruct.f194431f = solitaireActiveStruct.mo86045b("MsgUserName", str, true);
        } else {
            solitaireActiveStruct.f194431f = solitaireActiveStruct.mo86045b("MsgUserName", aVar.field_creator, true);
        }
        solitaireActiveStruct.f194432g = j;
        if (aVar.f232005L == 1) {
            solitaireActiveStruct.f194433h = (long) aVar.f232001H.length();
        }
        solitaireActiveStruct.f194434i = (long) aVar.f232003J.length();
        solitaireActiveStruct.f194435j = (long) aVar.f232002I.length();
        if (z) {
            solitaireActiveStruct.f194436k = 1;
        } else {
            solitaireActiveStruct.f194436k = 2;
        }
        solitaireActiveStruct.mo86054n();
    }

    /* renamed from: d */
    public void mo108683d(C79013a aVar, int i, int i2) {
        SolitaireClickReportStruct solitaireClickReportStruct = new SolitaireClickReportStruct();
        solitaireClickReportStruct.f194442h = solitaireClickReportStruct.mo86045b("Identifier", aVar.field_key, true);
        solitaireClickReportStruct.f194438d = solitaireClickReportStruct.mo86045b("ChatName", aVar.field_username, true);
        solitaireClickReportStruct.f194439e = aVar.field_msgSvrId;
        solitaireClickReportStruct.f194440f = (long) i;
        solitaireClickReportStruct.f194441g = (long) i2;
        solitaireClickReportStruct.mo86054n();
    }

    /* renamed from: e */
    public void mo108684e(List<C79013a> list, int i) {
        if (list != null || list.size() != 0) {
            for (C79013a f : list) {
                mo108685f(f, i);
            }
        }
    }

    /* renamed from: f */
    public void mo108685f(C79013a aVar, int i) {
        if (aVar != null) {
            SolitaireDropReportStruct solitaireDropReportStruct = new SolitaireDropReportStruct();
            solitaireDropReportStruct.f194447h = solitaireDropReportStruct.mo86045b("Identifier", aVar.field_key, true);
            solitaireDropReportStruct.f194443d = solitaireDropReportStruct.mo86045b("ChatName", aVar.field_username, true);
            solitaireDropReportStruct.f194444e = solitaireDropReportStruct.mo86045b("LaunchUserName", aVar.field_creator, true);
            solitaireDropReportStruct.f194445f = aVar.field_msgSvrId;
            solitaireDropReportStruct.f194446g = (long) i;
            solitaireDropReportStruct.mo86054n();
        }
    }

    /* renamed from: g */
    public void mo108686g(C79013a aVar, int i, int i2, boolean z) {
        SolitaireFormatInputEnterReportStruct solitaireFormatInputEnterReportStruct = new SolitaireFormatInputEnterReportStruct();
        solitaireFormatInputEnterReportStruct.f194453i = solitaireFormatInputEnterReportStruct.mo86045b("Identifier", aVar.field_key, true);
        solitaireFormatInputEnterReportStruct.f194448d = solitaireFormatInputEnterReportStruct.mo86045b("ChatName", aVar.field_username, true);
        solitaireFormatInputEnterReportStruct.f194449e = aVar.field_msgSvrId;
        solitaireFormatInputEnterReportStruct.f194450f = (long) i;
        solitaireFormatInputEnterReportStruct.f194451g = (long) i2;
        if (z) {
            solitaireFormatInputEnterReportStruct.f194452h = 2;
        } else {
            solitaireFormatInputEnterReportStruct.f194452h = 1;
        }
        solitaireFormatInputEnterReportStruct.mo86054n();
    }

    /* renamed from: h */
    public void mo108687h(String str, int i) {
        SolitaireTipsShowReportStruct solitaireTipsShowReportStruct = new SolitaireTipsShowReportStruct();
        solitaireTipsShowReportStruct.f156858d = solitaireTipsShowReportStruct.mo86045b("ChatName", str, true);
        solitaireTipsShowReportStruct.f156859e = (long) i;
        solitaireTipsShowReportStruct.mo86054n();
    }

    /* renamed from: i */
    public void mo108688i(C79013a aVar, C79013a aVar2, int i) {
        if (aVar != null) {
            ((C119157j) C119157j.f356862d).mo183875f(new C78758a(this, aVar2, aVar, i));
        }
    }
}
