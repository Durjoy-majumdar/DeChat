package com.tencent.p014mm.plugin.fts.logic;

import android.database.Cursor;
import android.database.CursorWrapper;
import android.net.Uri;
import com.tencent.p014mm.plugin.fts.C93824b;
import com.tencent.p014mm.plugin.fts.C93834f;
import com.tencent.p014mm.plugin.fts.C93836i;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86001b0;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tinker.loader.shareutil.ShareElfFile;
import com.tencent.wcdb.database.SQLiteDatabaseCorruptException;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import kv1.C76636p;
import kv1.C99248b;
import kv1.C99252h;
import kv1.C99260q;
import lv1.C10656l;
import lv1.C76728k;
import lv1.C99664b;
import ob0.C11385n;
import ob0.C117747y;
import p011cm.C28611c;
import p011cm.C39989b;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.plugin.fts.logic.j */
public class C93933j extends C99248b {

    /* renamed from: e */
    public C76636p f271067e;

    /* renamed from: f */
    public String[] f271068f;

    /* renamed from: g */
    public List<String> f271069g;

    /* renamed from: h */
    public C11385n f271070h = new C30056a(this);

    /* renamed from: com.tencent.mm.plugin.fts.logic.j$a */
    public class C30056a implements C11385n {
        public C30056a(C93933j jVar) {
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            int i3 = i;
            int i4 = i2;
            String str2 = str;
            C117747y yVar2 = yVar;
            if (yVar2 instanceof C28611c) {
                C28611c cVar = (C28611c) yVar2;
                if (cVar.mo56089L("FTSAddContactTestNetScene") == null) {
                    return;
                }
                if (i3 == 0 && i4 == 0) {
                    Log.m105925i("MicroMsg.FTS.FTSSearchTestLogic", "bind contact %s success", cVar.mo56088E().toString());
                    return;
                }
                Log.m105921e("MicroMsg.FTS.FTSSearchTestLogic", "errType %d | errCode %d | errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), str2);
                List<String> E = cVar.mo56088E();
                if (i4 == -44) {
                    LinkedList linkedList = new LinkedList();
                    linkedList.add(1);
                    HashMap hashMap = new HashMap();
                    hashMap.put(E.get(0), 0);
                    String str3 = (String) cVar.mo56089L("verifyTicket");
                    C28611c et = ((C39989b) C86312j.m106911c(C39989b.class)).mo62453et(2, E, linkedList, "你好，我是珍惜", str3, hashMap, str3);
                    et.mo56090P("FTSAddContactTestNetScene", Boolean.TRUE);
                    C86709a0.m107524d().mo123460f((C117747y) et);
                }
                if (i3 == 4 && i4 == -24 && !Util.isNullOrNil(str)) {
                    C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) str2, 1).show();
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.logic.j$d */
    public class C30057d extends C99664b {
        public C30057d(C93933j jVar, C30056a aVar) {
        }

        /* renamed from: b */
        public boolean mo57099b() {
            C86709a0.m107535s().f251811i.execSQL((String) null, "UPDATE rconversation SET unReadCount = 0;");
            return true;
        }

        public String getName() {
            return "FTSClearUnReadCountTask";
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.logic.j$f */
    public class C30058f extends C99664b {

        /* renamed from: j */
        public String f81315j;

        /* renamed from: n */
        public int f81316n;

        public C30058f(int i, String str) {
            this.f81316n = i;
            this.f81315j = str;
        }

        /* renamed from: b */
        public boolean mo57099b() {
            Class cls = C75700k0.class;
            if (C93933j.this.f271068f == null) {
                C93933j.this.f271068f = C86013q1.m106432N("/sdcard/test_insert_msg_words.txt").split(",");
            }
            C93933j jVar = C93933j.this;
            if (jVar.f271069g == null) {
                jVar.f271069g = new ArrayList();
                if (!Util.isNullOrNil(this.f81315j)) {
                    C93933j.this.f271069g.add(this.f81315j);
                } else {
                    Cursor a3 = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69683a3();
                    while (a3.moveToNext()) {
                        C93933j.this.f271069g.add(a3.getString(0));
                    }
                    a3.close();
                }
            }
            if (C93933j.this.f271068f != null) {
                for (int i = 0; i < this.f81316n; i++) {
                    String[] strArr = C93933j.this.f271068f;
                    Random random = new Random();
                    StringBuffer stringBuffer = new StringBuffer();
                    for (int i2 = 0; i2 < 300; i2++) {
                        stringBuffer.append(strArr[random.nextInt(strArr.length - 1)]);
                    }
                    String stringBuffer2 = stringBuffer.toString();
                    C72963f4 f4Var = new C72963f4();
                    f4Var.setType(1);
                    f4Var.mo108740T2(1);
                    f4Var.mo100991d(4);
                    f4Var.mo108732L2(stringBuffer2);
                    List list = C93933j.this.f271069g;
                    f4Var.mo108749c3((String) (list.size() > 1 ? list.get(new Random().nextInt(list.size() - 1)) : list.get(0)));
                    f4Var.mo108733M2(System.currentTimeMillis() - 250327040);
                    ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).my0(f4Var);
                    Log.m105925i("MicroMsg.FTS.FTSSearchTestLogic", "InsertMsgInfoTask %d %d %d %d", Integer.valueOf(this.f81316n), Integer.valueOf(i), Integer.valueOf(stringBuffer2.length()), Long.valueOf(f4Var.getMsgId()));
                }
            }
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.logic.j$g */
    public class C30059g extends C99664b {
        public C30059g(C30056a aVar) {
        }

        /* renamed from: b */
        public boolean mo57099b() {
            Class cls = C75700k0.class;
            if (C93933j.this.f271068f == null) {
                String N = C86013q1.m106432N("/sdcard/test_insert_msg_words.txt");
                C93933j.this.f271068f = N.split(",");
            }
            C93933j jVar = C93933j.this;
            if (jVar.f271069g == null) {
                jVar.f271069g = new ArrayList();
                Cursor a3 = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69683a3();
                while (a3.moveToNext()) {
                    C93933j.this.f271069g.add(a3.getString(0));
                }
                a3.close();
            }
            if (C93933j.this.f271068f != null) {
                int[] iArr = {1000, 2000, 5000, 10000, 20000, 50000, 100000};
                for (int i = 0; i < 7; i++) {
                    for (int i2 = 0; i2 < iArr[i]; i2++) {
                        String[] strArr = C93933j.this.f271068f;
                        Random random = new Random();
                        StringBuffer stringBuffer = new StringBuffer();
                        for (int i3 = 0; i3 < 300; i3++) {
                            stringBuffer.append(strArr[random.nextInt(strArr.length - 1)]);
                        }
                        String stringBuffer2 = stringBuffer.toString();
                        C72963f4 f4Var = new C72963f4();
                        f4Var.setType(1);
                        f4Var.mo108740T2(1);
                        f4Var.mo100991d(4);
                        f4Var.mo108732L2(stringBuffer2);
                        f4Var.mo108749c3(C93933j.this.f271069g.get(i));
                        f4Var.mo108733M2(System.currentTimeMillis());
                        ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).my0(f4Var);
                        Log.m105925i("MicroMsg.FTS.FTSSearchTestLogic", "InsertMsgInfoTask %d %d %d %d", Integer.valueOf(i2), Integer.valueOf(iArr[i]), Integer.valueOf(stringBuffer2.length()), Long.valueOf(f4Var.getMsgId()));
                    }
                }
            }
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.logic.j$b */
    public class C93934b extends C99664b {
        public C93934b(C93933j jVar, C30056a aVar) {
        }

        /* renamed from: b */
        public boolean mo57099b() {
            throw new SQLiteDatabaseCorruptException("For Test");
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.logic.j$c */
    public class C93935c extends C99664b {

        /* renamed from: j */
        public C76728k f271071j;

        /* renamed from: com.tencent.mm.plugin.fts.logic.j$c$a */
        public class C93936a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C10656l f271072d;

            public C93936a(C10656l lVar) {
                this.f271072d = lVar;
            }

            public void run() {
                C93935c.this.f271071j.f224478m.mo293H0(this.f271072d);
            }
        }

        public C93935c(C93933j jVar, C76728k kVar) {
            this.f271071j = kVar;
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: b */
        public boolean mo57099b() {
            Uri.Builder builder;
            C86001b0 q;
            Class cls = C99260q.class;
            C99252h.C99253a aVar = C99252h.f291029b;
            C86709a0.m107528h();
            String str = C86709a0.m107535s().f251807e;
            Uri n = str == null ? null : C116299g2.m163858n(str);
            if (n == null) {
                builder = new Uri.Builder().path("FTS5IndexMicroMsg_encrypt.db");
            } else {
                builder = n.buildUpon();
                builder.appendPath("FTS5IndexMicroMsg_encrypt.db");
            }
            Uri build = builder.build();
            String path = build.getPath();
            if (path != null) {
                String k = C116299g2.m163855k(path, false, false);
                if (!build.getPath().equals(k)) {
                    build = builder.path(k).build();
                }
            }
            C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(build, (C116281f0.C116288h) null);
            long j = 0;
            aVar.f291033a = ((l.mo177810a() && (q = l.f348991a.mo119945q(l.f348992b)) != null) ? q.f250473c : 0) / 1048576;
            Cursor o = ((C93834f) ((C99260q) C86312j.m106911c(cls)).mo128742JS()).mo128798o(String.format("SELECT count(docid) FROM %s WHERE type = %d AND subtype = %d", new Object[]{"FTS5MetaContact", 131072, 1}), (String[]) null);
            try {
                CursorWrapper cursorWrapper = (CursorWrapper) o;
                long j2 = cursorWrapper.moveToNext() ? cursorWrapper.getLong(0) : 0;
                ((C93824b) o).close();
                aVar.f291034b = j2;
                Cursor o2 = ((C93834f) ((C99260q) C86312j.m106911c(cls)).mo128742JS()).mo128798o(String.format("SELECT count(docid) FROM %s WHERE type = %d AND subtype = %d", new Object[]{"FTS5MetaContact", 131075, 38}), (String[]) null);
                try {
                    CursorWrapper cursorWrapper2 = (CursorWrapper) o2;
                    long j3 = cursorWrapper2.moveToNext() ? cursorWrapper2.getLong(0) : 0;
                    ((C93824b) o2).close();
                    aVar.f291035c = j3;
                    Cursor o3 = ((C93834f) ((C99260q) C86312j.m106911c(cls)).mo128742JS()).mo128798o(String.format("SELECT count(docid) FROM %s WHERE subtype = %d", new Object[]{"FTS5MetaFavorite", 9}), (String[]) null);
                    try {
                        CursorWrapper cursorWrapper3 = (CursorWrapper) o3;
                        long j4 = cursorWrapper3.moveToNext() ? cursorWrapper3.getLong(0) : 0;
                        ((C93824b) o3).close();
                        aVar.f291037e = j4;
                        Cursor o4 = ((C93834f) ((C99260q) C86312j.m106911c(cls)).mo128742JS()).mo128798o(String.format("SELECT count(docid) FROM %s", new Object[]{"FTS5MetaMessage"}), (String[]) null);
                        try {
                            CursorWrapper cursorWrapper4 = (CursorWrapper) o4;
                            if (cursorWrapper4.moveToNext()) {
                                j = cursorWrapper4.getLong(0);
                            }
                            ((C93824b) o4).close();
                            aVar.f291036d = j;
                            ((C93834f) ((C99260q) C86312j.m106911c(cls)).mo128742JS()).mo128800q(-301, aVar.f291034b);
                            ((C93834f) ((C99260q) C86312j.m106911c(cls)).mo128742JS()).mo128800q(-302, aVar.f291035c);
                            ((C93834f) ((C99260q) C86312j.m106911c(cls)).mo128742JS()).mo128800q(-303, aVar.f291037e);
                            ((C93834f) ((C99260q) C86312j.m106911c(cls)).mo128742JS()).mo128800q(-304, aVar.f291036d);
                            C10656l lVar = new C10656l(this.f271071j);
                            if (this.f271071j.f224478m != null) {
                                MMHandlerThread.postToMainThread(new C93936a(lVar));
                            }
                            return true;
                        } catch (Throwable th) {
                            ((C93824b) o4).close();
                            throw th;
                        }
                    } catch (Throwable th4) {
                        ((C93824b) o3).close();
                        throw th4;
                    }
                } catch (Throwable th5) {
                    ((C93824b) o2).close();
                    throw th5;
                }
            } catch (Throwable th6) {
                ((C93824b) o).close();
                throw th6;
            }
        }

        public String getName() {
            return "FTS5DBInfoTask";
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.logic.j$e */
    public class C93937e extends C99664b {
        public C93937e(C93933j jVar, C76728k kVar) {
        }

        /* renamed from: b */
        public boolean mo57099b() {
            return true;
        }

        public String getName() {
            return "FTSTestAddChatroomContactTask";
        }
    }

    /* renamed from: a */
    public boolean mo128809a() {
        Class cls = C99260q.class;
        if (!((C99260q) C86312j.m106911c(cls)).mo128758wd()) {
            Log.m105924i("MicroMsg.FTS.FTSSearchTestLogic", "Create Fail!");
            return false;
        }
        Log.m105924i("MicroMsg.FTS.FTSSearchTestLogic", "Create Success!");
        this.f271067e = ((C99260q) C86312j.m106911c(cls)).mo128743Jd();
        return true;
    }

    /* renamed from: b */
    public boolean mo128810b() {
        C86709a0.m107524d().mo123470p(30, this.f271070h);
        return false;
    }

    public String getName() {
        return "SearchTestLogic";
    }

    /* renamed from: l4 */
    public C99664b mo128819l4(C76728k kVar) {
        C99664b bVar;
        switch (kVar.f224467b) {
            case ShareElfFile.SectionHeader.SHN_ABS:
                bVar = new C30058f(kVar.f224474i, kVar.f224471f);
                break;
            case 65523:
                bVar = new C93937e(this, kVar);
                break;
            case 65524:
                bVar = new C30057d(this, (C30056a) null);
                break;
            case 65525:
                bVar = new C30059g((C30056a) null);
                break;
            case 65526:
                bVar = new C93935c(this, kVar);
                break;
            default:
                bVar = new C93934b(this, (C30056a) null);
                break;
        }
        return ((C93836i) this.f271067e).mo128803c(Integer.MAX_VALUE, bVar);
    }
}
