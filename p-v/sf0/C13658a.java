package sf0;

import android.database.Cursor;
import android.os.Looper;
import android.os.Message;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.TimeLogger;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72985m3;
import com.tencent.p014mm.storage.C72987n3;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import hg0.C59893x0;
import hg0.C76166a;
import hg0.C76168b;
import hg0.C76186t;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import lu3.C88656g;
import mg0.C76754b;
import mg0.C76755c;
import p206nj.C76861g;
import p823sg.C90193h;
import wc3.C15131b;
import zh3.C91753f;
import zt3.C119157j;

/* renamed from: sf0.a */
public class C13658a {

    /* renamed from: a */
    public static final HashSet<C76755c> f38695a = new HashSet<>();

    /* renamed from: b */
    public static final C76755c f38696b = new C13659a();

    /* renamed from: sf0.a$a */
    public class C13659a implements C76755c {
        /* renamed from: a */
        public void mo1320a(boolean z) {
            Log.m105925i("MicroMsg.AddrBookSyncHelper", "syncAddrBookAndUpload onSyncEnd suc:%b", Boolean.valueOf(z));
            if (z) {
                System.currentTimeMillis();
                C86709a0.m107524d().mo123460f(new C59893x0(C76186t.m91538f(), C76186t.m91536d()));
            }
        }
    }

    /* renamed from: sf0.a$b */
    public class C13660b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ long f38697d;

        /* renamed from: e */
        public final /* synthetic */ C76755c f38698e;

        public C13660b(long j, C76755c cVar) {
            this.f38697d = j;
            this.f38698e = cVar;
        }

        public void run() {
            HashSet<C76755c> hashSet = C13658a.f38695a;
            HashSet<C76755c> hashSet2 = C13658a.f38695a;
            Log.m105925i("MicroMsg.AddrBookSyncHelper", "syncAddrBook running:%b setSize:%d call:%d callback:%s", false, Integer.valueOf(hashSet2.size()), Long.valueOf(this.f38697d), this.f38698e);
            hashSet2.add(this.f38698e);
            C76186t.m91542j(true);
            ((C119157j) C119157j.f356862d).mo183884o(new C13661c((C13659a) null));
        }
    }

    /* renamed from: sf0.a$c */
    public static class C13661c implements C88656g {

        /* renamed from: i */
        public static byte[] f38699i = new byte[0];

        /* renamed from: j */
        public static final MMHandler f38700j = new C13662a(Looper.getMainLooper());

        /* renamed from: d */
        public List<String[]> f38701d;

        /* renamed from: e */
        public List<String[]> f38702e;

        /* renamed from: f */
        public List<C76166a> f38703f;

        /* renamed from: g */
        public List<C76166a> f38704g;

        /* renamed from: h */
        public TimeLogger f38705h;

        /* renamed from: sf0.a$c$a */
        public class C13662a extends MMHandler {
            public C13662a(Looper looper) {
                super(looper);
            }

            public void handleMessage(Message message) {
                if (C86709a0.m107522a()) {
                    C76861g.C47263a aVar = new C76861g.C47263a();
                    HashSet<C76755c> hashSet = C13658a.f38695a;
                    int size = hashSet.size();
                    boolean parseBoolean = Boolean.parseBoolean(message.obj.toString());
                    Iterator<C76755c> it = hashSet.iterator();
                    while (it.hasNext()) {
                        it.next().mo1320a(parseBoolean);
                    }
                    C13658a.f38695a.clear();
                    Log.m105925i("MicroMsg.AddrBookSyncHelper", "callBackHandler setSize:%d time:%d", Integer.valueOf(size), Long.valueOf(aVar.mo72288a()));
                }
            }
        }

        public C13661c(C13659a aVar) {
        }

        /* renamed from: a */
        public final List<C76166a> mo13048a(int i, List<String[]> list) {
            if (list == null) {
                Log.m105920e("MicroMsg.AddrBookSyncHelper", "sync address book failed, null info list");
                return new LinkedList();
            }
            ArrayList arrayList = new ArrayList();
            for (String[] next : list) {
                if (next != null) {
                    String str = next[0];
                    String str2 = next[1];
                    String str3 = next[2];
                    String str4 = next[3];
                    long safeParseLong = Util.safeParseLong(next[4]);
                    if (str3 != null) {
                        String str5 = "";
                        if (!str3.equals(str5)) {
                            if (i == 1) {
                                str5 = C90193h.m112878f(str3.getBytes());
                            }
                            if (i == 0) {
                                String a = C15131b.m14237a(str3);
                                if (Util.isNullOrNil(a)) {
                                    Log.m105918d("MicroMsg.AddrBookSyncHelper", "formatted mobile null, continue");
                                } else {
                                    str5 = C90193h.m112878f(a.getBytes());
                                }
                            }
                            C76166a aVar = new C76166a();
                            aVar.f223117e = str2;
                            aVar.f223118f = C77691f.m93687b(str2);
                            aVar.f223119g = C77691f.m93686a(str2);
                            aVar.f223115c = str;
                            aVar.f223128p = str4;
                            aVar.f223114b = str5;
                            aVar.f223113a = C76166a.m91467d(str5);
                            aVar.f223111N = safeParseLong;
                            aVar.f223132t = aVar.mo106382a();
                            if (i == 1) {
                                aVar.f223126n = str3;
                            }
                            if (i == 0) {
                                aVar.f223125m = str3;
                            }
                            aVar.f223124l = i;
                            aVar.f223112O = 1095798;
                            arrayList.add(aVar);
                        }
                    }
                }
            }
            return arrayList;
        }

        /* renamed from: b */
        public final void mo13049b() {
            int i;
            Class cls = C76754b.class;
            TimeLogger timeLogger = new TimeLogger("MicroMsg.AddrBookSyncHelper", "delete");
            ArrayList arrayList = new ArrayList();
            LinkedList linkedList = new LinkedList();
            for (String[] strArr : this.f38702e) {
                linkedList.add(strArr[2]);
            }
            Cursor rawQuery = ((C76168b) ((C76754b) C86312j.m106911c(cls)).R50()).f223157c.rawQuery("select addr_upload2.moblie , addr_upload2.md5 from addr_upload2 where addr_upload2.type = 0", (String[]) null, 2);
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                i = 1;
                if (!rawQuery.moveToNext()) {
                    break;
                }
                arrayList2.add(new String[]{rawQuery.getString(0), rawQuery.getString(1)});
            }
            rawQuery.close();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                String[] strArr2 = (String[]) it.next();
                String nullAsNil = Util.nullAsNil(strArr2[0]);
                String nullAsNil2 = Util.nullAsNil(strArr2[1]);
                if (!nullAsNil.equals("") && !linkedList.contains(nullAsNil)) {
                    arrayList.add(nullAsNil2);
                }
            }
            if (arrayList.size() > 0) {
                C76168b bVar = (C76168b) ((C76754b) C86312j.m106911c(cls)).R50();
                bVar.getClass();
                if (arrayList.size() > 0) {
                    TimeLogger timeLogger2 = new TimeLogger("MicroMsg.AddrUploadStorage", "delete transaction");
                    timeLogger2.addSplit("begin");
                    long beginTransaction = bVar.f223157c.beginTransaction(Thread.currentThread().getId());
                    try {
                        Iterator it4 = arrayList.iterator();
                        while (it4.hasNext()) {
                            String str = (String) it4.next();
                            if (str != null) {
                                if (str.length() > 0) {
                                    C91753f fVar = bVar.f223157c;
                                    Iterator it5 = it4;
                                    String[] strArr3 = new String[i];
                                    strArr3[0] = "" + C76166a.m91467d(str);
                                    int delete = fVar.delete("addr_upload2", "id =?", strArr3);
                                    Log.m105918d("MicroMsg.AddrUploadStorage", "delete addr_upload2 md5 :" + str + ", res:" + delete);
                                    if (delete > 0) {
                                        bVar.doNotify(5, bVar, str);
                                    }
                                    it4 = it5;
                                    i = 1;
                                }
                            }
                        }
                    } catch (Exception e) {
                        Log.printErrStackTrace("MicroMsg.AddrUploadStorage", e, "", new Object[0]);
                    }
                    bVar.f223157c.endTransaction(beginTransaction);
                    timeLogger2.addSplit("end");
                    timeLogger2.dumpToLog();
                }
                Class cls2 = C75700k0.class;
                if (arrayList.size() != 0) {
                    HashSet hashSet = new HashSet();
                    Iterator it6 = ((ArrayList) ((C72987n3) ((C75700k0) C86709a0.m107533q(cls2)).mo96104vj()).mo101186Lo(0)).iterator();
                    while (it6.hasNext()) {
                        C72985m3 m3Var = (C72985m3) it6.next();
                        C72963f4.C72964b Rv0 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls2)).mo96095LE()).Rv0(m3Var.field_msgContent);
                        String str2 = Rv0.f212683i;
                        String str3 = Rv0.f212682h;
                        int i2 = Rv0.f212681g;
                        if ((i2 == 10 || i2 == 11) && (arrayList.contains(str2) || arrayList.contains(str3))) {
                            hashSet.add(m3Var.field_talker);
                        }
                    }
                    Log.m105918d("MicroMsg.FriendLogic", "deleteMobileFMessage(md5List), delete fmsg and fconv, talker size = " + hashSet.size());
                    Iterator it7 = hashSet.iterator();
                    while (it7.hasNext()) {
                        C76186t.m91535c(0, (String) it7.next());
                    }
                }
            }
            timeLogger.addSplit("end");
            timeLogger.dumpToLog();
        }

        /* renamed from: c */
        public final List<C76166a> mo13050c(List<C76166a> list, int i, int i2) {
            LinkedList linkedList = new LinkedList();
            while (i < i2) {
                linkedList.add(list.get(i));
                i++;
            }
            return linkedList;
        }

        public String getKey() {
            return "AddrBookSyncHelper_addrBookRead";
        }

        public void run() {
            List<C76166a> list;
            List<C76166a> list2;
            synchronized (f38699i) {
                HashSet<C76755c> hashSet = C13658a.f38695a;
                MultiProcessMMKV.getDefault().putInt("ADDRBOOK_HAD_UPDATE_KEY", 1).apply();
                TimeLogger timeLogger = new TimeLogger("MicroMsg.AddrBookSyncHelper", "sync addrBook");
                this.f38705h = timeLogger;
                timeLogger.addSplit("sync begin");
                Log.m105918d("MicroMsg.AddrBookSyncHelper", "reading email info");
                MMApplicationContext.getContext();
                this.f38701d = new LinkedList();
                Log.m105924i("MicroMsg.AddrBookSyncHelper", "sync address book email size: " + this.f38701d.size());
                this.f38704g = mo13048a(1, this.f38701d);
                Log.m105918d("MicroMsg.AddrBookSyncHelper", "reading mobile info");
                this.f38702e = C15131b.m14240d(MMApplicationContext.getContext());
                Log.m105924i("MicroMsg.AddrBookSyncHelper", "sync address book mobile size: " + this.f38702e.size());
                this.f38703f = mo13048a(0, this.f38702e);
                Log.m105918d("MicroMsg.AddrBookSyncHelper", "reading done, begin sync to addr_upload");
                if (this.f38701d != null && this.f38704g.size() > 0) {
                    int i = 0;
                    while (i < this.f38704g.size()) {
                        Log.m105924i("MicroMsg.AddrBookSyncHelper", "sync email index: " + i);
                        int i2 = i + 100;
                        if (i2 < this.f38704g.size()) {
                            list2 = mo13050c(this.f38704g, i, i2);
                        } else {
                            List<C76166a> list3 = this.f38704g;
                            list2 = mo13050c(list3, i, list3.size());
                        }
                        Log.m105924i("MicroMsg.AddrBookSyncHelper", "sync email listToSync size: " + list2.size());
                        C76186t.m91544l(1, list2);
                        i = i2;
                    }
                }
                List<C76166a> list4 = this.f38703f;
                if (list4 != null) {
                    if (list4.size() != 0) {
                        int i3 = 0;
                        while (i3 < this.f38703f.size()) {
                            Log.m105924i("MicroMsg.AddrBookSyncHelper", "sync mobile index: " + i3);
                            if (!C86709a0.m107522a()) {
                                Log.m105924i("MicroMsg.AddrBookSyncHelper", "account not ready, stop sync");
                                MMHandler mMHandler = f38700j;
                                Message obtainMessage = mMHandler.obtainMessage();
                                obtainMessage.obj = Boolean.FALSE;
                                mMHandler.sendMessage(obtainMessage);
                                return;
                            }
                            int i4 = i3 + 100;
                            if (i4 < this.f38703f.size()) {
                                list = mo13050c(this.f38703f, i3, i4);
                            } else {
                                List<C76166a> list5 = this.f38703f;
                                list = mo13050c(list5, i3, list5.size());
                            }
                            Log.m105924i("MicroMsg.AddrBookSyncHelper", "sync mobile listToSync size: " + list.size());
                            C76186t.m91544l(0, list);
                            i3 = i4;
                        }
                        Log.m105924i("MicroMsg.AddrBookSyncHelper", "sync ok");
                        if (!C86709a0.m107522a()) {
                            Log.m105924i("MicroMsg.AddrBookSyncHelper", "account not ready, exit");
                            MMHandler mMHandler2 = f38700j;
                            Message obtainMessage2 = mMHandler2.obtainMessage();
                            obtainMessage2.obj = Boolean.FALSE;
                            mMHandler2.sendMessage(obtainMessage2);
                            return;
                        }
                        mo13049b();
                        System.currentTimeMillis();
                        this.f38705h.addSplit("sync ok");
                        this.f38705h.dumpToLog();
                        MMHandler mMHandler3 = f38700j;
                        Message obtainMessage3 = mMHandler3.obtainMessage();
                        obtainMessage3.obj = Boolean.TRUE;
                        mMHandler3.sendMessage(obtainMessage3);
                        return;
                    }
                }
                Log.m105924i("MicroMsg.AddrBookSyncHelper", "mobile list null stop service");
                MMHandler mMHandler4 = f38700j;
                Message obtainMessage4 = mMHandler4.obtainMessage();
                obtainMessage4.obj = Boolean.FALSE;
                mMHandler4.sendMessage(obtainMessage4);
            }
        }
    }

    /* renamed from: a */
    public static boolean m12959a(C76755c cVar) {
        long id = Thread.currentThread().getId();
        boolean a = C76186t.m91533a();
        if (!a) {
            Log.m105921e("MicroMsg.AddrBookSyncHelper", "canSync:%b, skip", Boolean.valueOf(a));
            return false;
        }
        MMHandlerThread.postToMainThread(new C13660b(id, cVar));
        return true;
    }
}
