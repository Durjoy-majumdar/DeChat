package com.tencent.p014mm.plugin.fts.logic;

import android.database.Cursor;
import android.database.CursorWrapper;
import com.tencent.p014mm.plugin.fts.C93824b;
import com.tencent.p014mm.plugin.fts.C93834f;
import com.tencent.p014mm.plugin.fts.C93836i;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import java.util.ArrayList;
import kv1.C76636p;
import kv1.C99248b;
import kv1.C99260q;
import lv1.C10656l;
import lv1.C76728k;
import lv1.C99664b;
import lv1.C99678j;
import lv1.C99682o;
import rv1.C101471e;

/* renamed from: com.tencent.mm.plugin.fts.logic.e */
public class C93918e extends C99248b {

    /* renamed from: e */
    public C101471e f271041e;

    /* renamed from: f */
    public C76636p f271042f;

    /* renamed from: com.tencent.mm.plugin.fts.logic.e$a */
    public class C93919a extends C99664b {

        /* renamed from: j */
        public String f271043j;

        /* renamed from: n */
        public long f271044n;

        /* renamed from: o */
        public String f271045o;

        public C93919a() {
        }

        /* renamed from: b */
        public boolean mo57099b() {
            C101471e eVar = C93918e.this.f271041e;
            String str = this.f271043j;
            long j = this.f271044n;
            String str2 = this.f271045o;
            eVar.f297177f.bindString(1, str);
            eVar.f297177f.bindLong(2, j);
            eVar.f297177f.bindString(3, str2);
            eVar.f297177f.execute();
            return true;
        }

        public String getName() {
            return "AddSOSHistoryTask";
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.logic.e$b */
    public class C93920b extends C99664b {
        public C93920b() {
        }

        /* renamed from: b */
        public boolean mo57099b() {
            C101471e eVar = C93918e.this.f271041e;
            C93834f fVar = (C93834f) eVar.f297178g;
            fVar.mo128792i(String.format("DELETE FROM %s ;", new Object[]{"FTS5MetaSOSHistory"}));
            C93834f fVar2 = (C93834f) eVar.f297178g;
            fVar2.mo128792i(String.format("DELETE FROM %s ;", new Object[]{"FTS5IndexSOSHistory"}));
            return true;
        }

        public String getName() {
            return "DeleteSOSHistoryTask";
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.logic.e$c */
    public class C93921c extends C99664b {

        /* renamed from: j */
        public String f271048j;

        public C93921c() {
        }

        /* renamed from: b */
        public boolean mo57099b() {
            C101471e eVar = C93918e.this.f271041e;
            String str = this.f271048j;
            eVar.getClass();
            String[] strArr = {str};
            ((C93834f) eVar.f297178g).mo128793j(String.format("DELETE FROM %s WHERE key = ?", new Object[]{"FTS5MetaSOSHistory"}), strArr);
            return true;
        }

        public String getName() {
            return "DeleteSOSHistoryTask";
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.logic.e$d */
    public class C93922d extends C99678j {
        public C93922d(C76728k kVar) {
            super(kVar);
        }

        public String getName() {
            return "SearchSOSHistoryTask";
        }

        /* renamed from: i */
        public void mo128820i(C10656l lVar) {
            super.mo128820i(lVar);
            lVar.f32076e = new ArrayList();
            C101471e eVar = C93918e.this.f271041e;
            int i = this.f292133j.f224474i;
            eVar.getClass();
            Cursor o = ((C93834f) eVar.f297178g).mo128798o(String.format("SELECT content, timestamp FROM %s ORDER BY timestamp desc LIMIT " + i, new Object[]{"FTS5MetaSOSHistory"}), (String[]) null);
            while (true) {
                CursorWrapper cursorWrapper = (CursorWrapper) o;
                if (cursorWrapper.moveToNext()) {
                    String string = cursorWrapper.getString(0);
                    C99682o oVar = new C99682o();
                    oVar.f292154h = string;
                    lVar.f32076e.add(oVar);
                } else {
                    ((C93824b) o).close();
                    lVar.f32074c = 0;
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public boolean mo128809a() {
        Class cls = C99260q.class;
        if (!((C99260q) C86312j.m106911c(cls)).mo128758wd()) {
            Log.m105924i("MicroMsg.FTS.FTS5SearchSOSHistoryLogic", "Create Fail!");
            return false;
        }
        Log.m105924i("MicroMsg.FTS.FTS5SearchSOSHistoryLogic", "Create Success!");
        this.f271041e = (C101471e) ((C99260q) C86312j.m106911c(cls)).db0(1024);
        this.f271042f = ((C99260q) C86312j.m106911c(cls)).mo128743Jd();
        return true;
    }

    /* renamed from: b */
    public boolean mo128810b() {
        this.f271041e = null;
        this.f271042f = null;
        return true;
    }

    public String getName() {
        return "FTS5SearchSOSHistoryLogic";
    }

    /* renamed from: j4 */
    public void mo128838j4(String str, String str2) {
        C93919a aVar = new C93919a();
        aVar.f271043j = str;
        aVar.f271045o = str2;
        aVar.f271044n = System.currentTimeMillis();
        C76636p pVar = this.f271042f;
        if (pVar != null) {
            ((C93836i) pVar).mo128803c(132072, aVar);
        }
    }

    /* renamed from: l4 */
    public C99664b mo128819l4(C76728k kVar) {
        C93922d dVar = new C93922d(kVar);
        ((C93836i) this.f271042f).mo128803c(-65536, dVar);
        return dVar;
    }

    /* renamed from: x2 */
    public void mo128839x2(String str) {
        C93921c cVar = new C93921c();
        cVar.f271048j = str;
        C76636p pVar = this.f271042f;
        if (pVar != null) {
            ((C93836i) pVar).mo128803c(132072, cVar);
        }
    }

    /* renamed from: x3 */
    public void mo128840x3() {
        C93920b bVar = new C93920b();
        C76636p pVar = this.f271042f;
        if (pVar != null) {
            ((C93836i) pVar).mo128803c(132072, bVar);
        }
    }
}
