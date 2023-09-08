package com.tencent.p014mm.plugin.fts.logic;

import a11.C39479c;
import a22.C27740g;
import a22.C67001a;
import android.database.Cursor;
import android.database.CursorWrapper;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.UpdateLanguageEvent;
import com.tencent.p014mm.autogen.events.UpdateSearchIndexAtOnceEvent;
import com.tencent.p014mm.plugin.fts.C68985g;
import com.tencent.p014mm.plugin.fts.C93824b;
import com.tencent.p014mm.plugin.fts.C93834f;
import com.tencent.p014mm.plugin.fts.C93836i;
import com.tencent.p014mm.plugin.fts.PluginFTS;
import com.tencent.p014mm.plugin.fts.jni.FTSJNIUtils;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.xweb.IXWebBroadcastListener;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import junit.framework.AssertionFailedError;
import kv1.C61172m;
import kv1.C76636p;
import kv1.C99248b;
import kv1.C99249c;
import kv1.C99251g;
import kv1.C99257k;
import kv1.C99260q;
import lv1.C10656l;
import lv1.C76728k;
import lv1.C99664b;
import lv1.C99666c;
import lv1.C99671h;
import lv1.C99672i;
import lv1.C99678j;
import lv1.C99681n;
import lv1.C99682o;
import oc0.C35143a;
import p651pt.C35638b;
import p749xh.C53339k1;
import rv1.C101467b;

/* renamed from: com.tencent.mm.plugin.fts.logic.FTS5SearchContactLogic */
public class FTS5SearchContactLogic extends C99248b {

    /* renamed from: x */
    public static Set<String> f270838x = new HashSet();

    /* renamed from: e */
    public C76636p f270839e;

    /* renamed from: f */
    public C101467b f270840f;

    /* renamed from: g */
    public C61172m f270841g;

    /* renamed from: h */
    public HashSet<String> f270842h;

    /* renamed from: i */
    public HashMap<String, List<Long>> f270843i;

    /* renamed from: j */
    public HashMap<String, String[]> f270844j;

    /* renamed from: n */
    public HashMap<String, List<Long>> f270845n;

    /* renamed from: o */
    public Method f270846o;

    /* renamed from: p */
    public MStorageEx.IOnStorageChange f270847p = new C93842a();

    /* renamed from: q */
    public MStorageEx.IOnStorageChange f270848q = new C93844b();

    /* renamed from: r */
    public MStorage.IOnStorageChange f270849r = new C93846c();

    /* renamed from: s */
    public MStorage.IOnStorageChange f270850s = new C93848d();

    /* renamed from: t */
    public IListener f270851t;

    /* renamed from: u */
    public IListener f270852u;

    /* renamed from: v */
    public MTimerHandler f270853v;

    /* renamed from: w */
    public MTimerHandler f270854w;

    /* renamed from: com.tencent.mm.plugin.fts.logic.FTS5SearchContactLogic$a */
    public class C93842a implements MStorageEx.IOnStorageChange {
        public C93842a() {
        }

        public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
            FTS5SearchContactLogic fTS5SearchContactLogic = FTS5SearchContactLogic.this;
            if (fTS5SearchContactLogic.f291002d) {
                String str = (String) obj;
                if (!fTS5SearchContactLogic.mo128814f(str)) {
                    Log.m105925i("MicroMsg.FTS.FTS5SearchContactLogic", "onConversationChangeListener filterByUsername %s", str);
                    return;
                }
                C72996z1 W2 = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69674W2(str);
                if (W2 == null || (FTS5SearchContactLogic.this.mo128817h(W2) && !W2.mo62916m3())) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 5) {
                                return;
                            }
                        } else if (!FTS5SearchContactLogic.this.f270842h.contains(str) && !FTS5SearchContactLogic.this.f270843i.containsKey(str)) {
                            FTS5SearchContactLogic fTS5SearchContactLogic2 = FTS5SearchContactLogic.this;
                            ((C93836i) fTS5SearchContactLogic2.f270839e).mo128803c(65556, new C93862p(str));
                            return;
                        } else {
                            return;
                        }
                    }
                    if (!FTS5SearchContactLogic.this.f270843i.containsKey(str)) {
                        FTS5SearchContactLogic fTS5SearchContactLogic3 = FTS5SearchContactLogic.this;
                        ((C93836i) fTS5SearchContactLogic3.f270839e).mo128803c(65556, new C93861o(str));
                        return;
                    }
                    return;
                }
                Log.m105925i("MicroMsg.FTS.FTS5SearchContactLogic", "onContactChangedListener hit cache and filter contact %s", str);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.logic.FTS5SearchContactLogic$a0 */
    public class C93843a0 extends C99678j {
        public C93843a0(C76728k kVar) {
            super(kVar);
        }

        /* renamed from: e */
        public int mo128768e() {
            return 26;
        }

        public String getName() {
            return "SearchTopContactInnerRankTask";
        }

        /* renamed from: i */
        public void mo128820i(C10656l lVar) {
            C99672i a = C99672i.m130094a(this.f292133j.f224468c, true);
            lVar.f32075d = a;
            C101467b bVar = FTS5SearchContactLogic.this.f270840f;
            int[] iArr = this.f292133j.f224472g;
            bVar.getClass();
            String d = a.mo139044d();
            long size = (long) ((ArrayList) a.f292124e).size();
            String format = String.format("SELECT %s.docid, type, subtype, entity_id, aux_index, timestamp, content, MMHighlight(%s, %d, type, subtype), MMContactRank(%s, timestamp / 1000 - %d / 1000, subtype, ?, %d) AS Rank FROM %s NOT INDEXED JOIN %s ON (%s.docid = %s.rowid) WHERE %s MATCH '%s' AND type IN " + C99251g.m129291l(iArr) + " ORDER BY Rank ;", new Object[]{bVar.mo138611l(), bVar.mo138609j(), Long.valueOf(size), bVar.mo138609j(), Long.valueOf(System.currentTimeMillis() - 1105032704), Long.valueOf(size), bVar.mo138611l(), bVar.mo138609j(), bVar.mo138611l(), bVar.mo138609j(), bVar.mo138609j(), d});
            C99257k kVar = bVar.f290993f;
            Cursor o = ((C93834f) kVar).mo128798o(format, new String[]{a.f292121b});
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            hashSet.addAll(this.f292133j.f224475j);
            long j = 0;
            while (((CursorWrapper) o).moveToNext()) {
                C99682o oVar = new C99682o();
                oVar.mo139052e(o);
                if (hashSet.add(oVar.f292151e)) {
                    if (j >= oVar.f292163q) {
                        arrayList.add(oVar);
                    } else if (arrayList.size() > this.f292133j.f224474i) {
                        break;
                    } else {
                        j = oVar.f292163q;
                        arrayList.add(oVar);
                    }
                    if (Thread.interrupted()) {
                        ((C93824b) o).close();
                        throw new InterruptedException("Task is Cancel: " + this.f292133j.f224468c);
                    }
                }
            }
            ((C93824b) o).close();
            lVar.f32076e = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C99682o oVar2 = (C99682o) it.next();
                oVar2.mo139048a();
                oVar2.mo139049b(lVar.f32075d);
                lVar.f32076e.add(oVar2);
            }
            Comparator<C99681n> comparator = this.f292133j.f224477l;
            if (comparator != null) {
                Collections.sort(lVar.f32076e, comparator);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.logic.FTS5SearchContactLogic$b */
    public class C93844b implements MStorageEx.IOnStorageChange {
        public C93844b() {
        }

        public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
            FTS5SearchContactLogic fTS5SearchContactLogic = FTS5SearchContactLogic.this;
            if (fTS5SearchContactLogic.f291002d) {
                String str = (String) obj;
                if (!fTS5SearchContactLogic.mo128814f(str)) {
                    Log.m105925i("MicroMsg.FTS.FTS5SearchContactLogic", "onContactChangedListener filterByUsername %s", str);
                    return;
                }
                C72996z1 W2 = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69674W2(str);
                if (W2 != null && !FTS5SearchContactLogic.this.mo128817h(W2)) {
                    Log.m105925i("MicroMsg.FTS.FTS5SearchContactLogic", "onContactChangedListener hit cache and filter contact %s", str);
                } else if (i == 2) {
                    FTS5SearchContactLogic fTS5SearchContactLogic2 = FTS5SearchContactLogic.this;
                    ((C93836i) fTS5SearchContactLogic2.f270839e).mo128803c(65556, new C93858l(str));
                } else if (i == 3 || i == 4) {
                    if (!FTS5SearchContactLogic.this.f270843i.containsKey(str)) {
                        FTS5SearchContactLogic fTS5SearchContactLogic3 = FTS5SearchContactLogic.this;
                        ((C93836i) fTS5SearchContactLogic3.f270839e).mo128803c(65556, new C93861o(str));
                    }
                } else if (i == 5) {
                    FTS5SearchContactLogic fTS5SearchContactLogic4 = FTS5SearchContactLogic.this;
                    ((C93836i) fTS5SearchContactLogic4.f270839e).mo128803c(65556, new C93857k(str));
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.logic.FTS5SearchContactLogic$b0 */
    public class C93845b0 extends C99678j {
        public C93845b0(C76728k kVar) {
            super(kVar);
        }

        /* renamed from: e */
        public int mo128768e() {
            return 22;
        }

        public String getName() {
            return "SearchTopContactTask";
        }

        /* renamed from: i */
        public void mo128820i(C10656l lVar) {
            C99672i a = C99672i.m130094a(this.f292133j.f224468c, true);
            lVar.f32075d = a;
            C101467b bVar = FTS5SearchContactLogic.this.f270840f;
            bVar.getClass();
            int i = 0;
            Cursor o = ((C93834f) bVar.f290993f).mo128798o(String.format("SELECT %s.docid, type, subtype, entity_id, aux_index, timestamp, content, MMHighlight(%s, %d, type, subtype), CASE WHEN timestamp - %d > 0 THEN 1 ELSE 0 END AS time_range FROM %s NOT INDEXED JOIN %s ON (%s.docid = %s.rowid) WHERE %s MATCH '%s' AND type = 131072 ORDER BY time_range desc, subtype ;", new Object[]{bVar.mo138611l(), bVar.mo138609j(), Long.valueOf((long) ((ArrayList) a.f292124e).size()), Long.valueOf(System.currentTimeMillis() - 1105032704), bVar.mo138611l(), bVar.mo138609j(), bVar.mo138611l(), bVar.mo138609j(), bVar.mo138609j(), a.mo139044d()}), (String[]) null);
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            hashSet.addAll(this.f292133j.f224475j);
            while (((CursorWrapper) o).moveToNext()) {
                C99682o oVar = new C99682o();
                oVar.mo139050c(o);
                if (hashSet.add(oVar.f292151e)) {
                    if (i >= oVar.f292149c) {
                        arrayList.add(oVar);
                    } else if (arrayList.size() > this.f292133j.f224474i) {
                        break;
                    } else {
                        int i2 = oVar.f292149c;
                        arrayList.add(oVar);
                        i = i2;
                    }
                    if (Thread.interrupted()) {
                        ((C93824b) o).close();
                        throw new InterruptedException("Task is Cancel: " + this.f292133j.f224468c);
                    }
                }
            }
            ((C93824b) o).close();
            lVar.f32076e = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C99682o oVar2 = (C99682o) it.next();
                oVar2.mo139048a();
                oVar2.mo139049b(lVar.f32075d);
                lVar.f32076e.add(oVar2);
            }
            Comparator<C99681n> comparator = this.f292133j.f224477l;
            if (comparator != null) {
                Collections.sort(lVar.f32076e, comparator);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.logic.FTS5SearchContactLogic$c */
    public class C93846c implements MStorage.IOnStorageChange {
        public C93846c() {
        }

        public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
            if (FTS5SearchContactLogic.this.f291002d && !str.equals("*") && !str.equals("chatroomname") && !FTS5SearchContactLogic.this.f270843i.containsKey(str)) {
                FTS5SearchContactLogic fTS5SearchContactLogic = FTS5SearchContactLogic.this;
                ((C93836i) fTS5SearchContactLogic.f270839e).mo128803c(65556, new C93861o(str));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.logic.FTS5SearchContactLogic$c0 */
    public class C93847c0 extends C99664b {

        /* renamed from: j */
        public int f270862j = 0;

        /* renamed from: n */
        public int f270863n = 0;

        /* renamed from: o */
        public int f270864o = 0;

        public C93847c0(C93842a aVar) {
        }

        /* renamed from: b */
        public boolean mo57099b() {
            mo139040h(IXWebBroadcastListener.STAGE_START);
            Iterator<Map.Entry<String, List<Long>>> it = FTS5SearchContactLogic.this.f270843i.entrySet().iterator();
            int i = 50;
            while (it.hasNext()) {
                if (!Thread.interrupted()) {
                    if (i >= 50) {
                        FTS5SearchContactLogic.this.f270840f.mo138600c();
                        FTS5SearchContactLogic.this.f270840f.mo138598a();
                        i = 0;
                    }
                    Map.Entry next = it.next();
                    for (Long longValue : (List) next.getValue()) {
                        FTS5SearchContactLogic.this.f270840f.mo138605f(longValue.longValue());
                        i++;
                    }
                    String str = (String) next.getKey();
                    C72996z1 a = ((C68985g) FTS5SearchContactLogic.this.f270841g).mo94940a(str);
                    if (a.getUsername().length() > 0 && FTS5SearchContactLogic.this.mo128815g(a)) {
                        i += FTS5SearchContactLogic.this.mo128812d(a);
                    }
                    it.remove();
                    FTS5SearchContactLogic.this.f270842h.remove(str);
                    this.f270862j++;
                } else {
                    FTS5SearchContactLogic.this.f270840f.mo138600c();
                    throw new InterruptedException();
                }
            }
            mo139040h("dirtyContact");
            Iterator<String> it4 = FTS5SearchContactLogic.this.f270842h.iterator();
            while (it4.hasNext()) {
                if (!Thread.interrupted()) {
                    if (i >= 50) {
                        FTS5SearchContactLogic.this.f270840f.mo138600c();
                        FTS5SearchContactLogic.this.f270840f.mo138598a();
                        i = 0;
                    }
                    String next2 = it4.next();
                    long b = ((C68985g) FTS5SearchContactLogic.this.f270841g).mo94941b(next2);
                    C72996z1 a2 = ((C68985g) FTS5SearchContactLogic.this.f270841g).mo94940a(next2);
                    if (a2.getUsername().length() > 0 && FTS5SearchContactLogic.this.mo128815g(a2)) {
                        C101467b bVar = FTS5SearchContactLogic.this.f270840f;
                        bVar.f291000p.bindLong(1, b);
                        bVar.f291000p.bindString(2, next2);
                        bVar.f291000p.execute();
                        i++;
                    }
                    it4.remove();
                    this.f270863n++;
                } else {
                    FTS5SearchContactLogic.this.f270840f.mo138600c();
                    throw new InterruptedException();
                }
            }
            FTS5SearchContactLogic.this.f270840f.mo138600c();
            mo139040h("timestampContact");
            C93924g Bx0 = ((PluginFTS) C86312j.m106911c(PluginFTS.class)).Bx0();
            Bx0.f271054g.clear();
            this.f270864o = Bx0.f271053f.mo140976B();
            mo139040h("topHits");
            return true;
        }

        /* renamed from: c */
        public String mo94944c() {
            return String.format("{Dirty: %d Timestamp: %d tophitsCount: %d}", new Object[]{Integer.valueOf(this.f270862j), Integer.valueOf(this.f270863n), Integer.valueOf(this.f270864o)});
        }

        /* renamed from: e */
        public int mo128768e() {
            return 16;
        }

        public String getName() {
            return "UpdateDirtyAndTimestampContactTask";
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.logic.FTS5SearchContactLogic$d */
    public class C93848d implements MStorage.IOnStorageChange {
        public C93848d() {
        }

        public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
            String[] split = str.split(" ");
            if (split != null && split.length != 0 && split[0].equals("update")) {
                for (int i = 1; i < split.length; i++) {
                    long j = Util.getLong(split[i], 0);
                    FTS5SearchContactLogic fTS5SearchContactLogic = FTS5SearchContactLogic.this;
                    ((C93836i) fTS5SearchContactLogic.f270839e).mo128803c(65554, new C93849d0(j));
                }
                FTS5SearchContactLogic fTS5SearchContactLogic2 = FTS5SearchContactLogic.this;
                ((C93836i) fTS5SearchContactLogic2.f270839e).mo128803c(65556, new C93847c0((C93842a) null));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.logic.FTS5SearchContactLogic$d0 */
    public class C93849d0 extends C99664b {

        /* renamed from: j */
        public long f270867j;

        public C93849d0(long j) {
            this.f270867j = j;
        }

        /* renamed from: b */
        public boolean mo57099b() {
            ArrayList arrayList = new ArrayList(32);
            C101467b bVar = FTS5SearchContactLogic.this.f270840f;
            long j = this.f270867j;
            C99257k kVar = bVar.f290993f;
            Cursor o = ((C93834f) kVar).mo128798o("SELECT user FROM FTS5ContactLabels WHERE label_id=?;", new String[]{Long.toString(j)});
            while (true) {
                CursorWrapper cursorWrapper = (CursorWrapper) o;
                if (!cursorWrapper.moveToNext()) {
                    break;
                }
                arrayList.add(cursorWrapper.getString(0));
            }
            ((C93824b) o).close();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (!FTS5SearchContactLogic.this.f270843i.containsKey(str)) {
                    FTS5SearchContactLogic.this.f270843i.put(str, FTS5SearchContactLogic.this.f270840f.mo138614o(C99249c.f291011i, str, 1));
                }
            }
            return true;
        }

        /* renamed from: c */
        public String mo94944c() {
            return String.format("{mLabelId: %d mContactCount: %d}", new Object[]{Long.valueOf(this.f270867j), 0});
        }

        public String getName() {
            return "UpdateLabelTask";
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.logic.FTS5SearchContactLogic$e */
    public class C93850e implements MTimerHandler.CallBack {

        /* renamed from: d */
        public int f270869d = 0;

        public C93850e() {
        }

        public boolean onTimerExpired() {
            PluginFTS pluginFTS = (PluginFTS) C86312j.m106911c(PluginFTS.class);
            if (!(pluginFTS.f270762h || !pluginFTS.f270763i)) {
                int i = this.f270869d + 1;
                this.f270869d = i;
                if (i < 6) {
                    return true;
                }
            }
            FTS5SearchContactLogic fTS5SearchContactLogic = FTS5SearchContactLogic.this;
            ((C93836i) fTS5SearchContactLogic.f270839e).mo128803c(131093, new C93847c0((C93842a) null));
            this.f270869d = 0;
            return true;
        }

        public String toString() {
            return super.toString() + "|delayIndexTimer";
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.logic.FTS5SearchContactLogic$f */
    public class C93851f implements MTimerHandler.CallBack {
        public C93851f() {
        }

        public boolean onTimerExpired() {
            FTS5SearchContactLogic fTS5SearchContactLogic = FTS5SearchContactLogic.this;
            ((C93836i) fTS5SearchContactLogic.f270839e).mo128803c(131093, new C93847c0((C93842a) null));
            return false;
        }

        public String toString() {
            return super.toString() + "|atOnceIndexTimer";
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.logic.FTS5SearchContactLogic$g */
    public class C93852g implements Comparator<String> {
        public C93852g(FTS5SearchContactLogic fTS5SearchContactLogic) {
        }

        public int compare(Object obj, Object obj2) {
            return FTSJNIUtils.stringCompareUtfBinary((String) obj, (String) obj2);
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.logic.FTS5SearchContactLogic$h */
    public class C93853h extends C99664b {

        /* renamed from: j */
        public int f270872j = 0;

        /* renamed from: n */
        public int f270873n = 0;

        public C93853h(C93842a aVar) {
        }

        /* renamed from: b */
        public boolean mo57099b() {
            Log.m105924i("MicroMsg.FTS.FTS5SearchContactLogic", "Start building chatroom index.");
            HashSet hashSet = new HashSet();
            Cursor o = ((C93834f) FTS5SearchContactLogic.this.f270840f.f290993f).mo128798o("SELECT DISTINCT chatroom FROM FTS5ChatRoomMembers;", (String[]) null);
            while (true) {
                CursorWrapper cursorWrapper = (CursorWrapper) o;
                if (!cursorWrapper.moveToNext()) {
                    break;
                }
                hashSet.add(cursorWrapper.getString(0));
            }
            ((C93824b) o).close();
            Cursor d = ((C68985g) FTS5SearchContactLogic.this.f270841g).mo94943d("SELECT chatroomname, memberlist FROM chatroom;", (String[]) null, 2);
            int i = 5;
            while (d.moveToNext()) {
                if (!Thread.interrupted()) {
                    String string = d.getString(0);
                    String string2 = d.getString(1);
                    if (!Util.isNullOrNil(string2) && !Util.isNullOrNil(string) && Util.nullAs(string2, "").contains(C75592q0.m90789s())) {
                        String[] split = C99249c.C99250a.f291019a.split(string2);
                        FTS5SearchContactLogic.this.f270844j.put(string, split);
                        if (!hashSet.remove(string)) {
                            if (i >= 5) {
                                FTS5SearchContactLogic.this.f270840f.mo138600c();
                                FTS5SearchContactLogic.this.f270840f.mo138598a();
                                i = 0;
                            }
                            FTS5SearchContactLogic.this.f270840f.mo140965A(string, split);
                            i++;
                            this.f270872j++;
                        }
                    }
                } else {
                    d.close();
                    FTS5SearchContactLogic.this.f270840f.mo138600c();
                    throw new InterruptedException();
                }
            }
            d.close();
            FTS5SearchContactLogic.this.f270840f.mo138600c();
            Iterator it = hashSet.iterator();
            int i2 = 5;
            while (it.hasNext()) {
                String str = (String) it.next();
                if (i2 >= 5) {
                    FTS5SearchContactLogic.this.f270840f.mo138600c();
                    FTS5SearchContactLogic.this.f270840f.mo138598a();
                    i2 = 0;
                }
                C101467b bVar = FTS5SearchContactLogic.this.f270840f;
                bVar.f297165t.bindString(1, str);
                bVar.f297165t.execute();
                i2++;
                this.f270873n++;
            }
            FTS5SearchContactLogic.this.f270840f.mo138600c();
            return true;
        }

        /* renamed from: c */
        public String mo94944c() {
            return String.format("{new: %d removed: %d}", new Object[]{Integer.valueOf(this.f270872j), Integer.valueOf(this.f270873n)});
        }

        /* renamed from: e */
        public int mo128768e() {
            return 3;
        }

        public String getName() {
            return "BuildChatroomIndexTask";
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.logic.FTS5SearchContactLogic$i */
    public class C93854i extends C99664b {

        /* renamed from: j */
        public HashMap<String, List<Long>> f270876j = new HashMap<>();

        /* renamed from: n */
        public HashSet<String> f270877n = new HashSet<>();

        /* renamed from: o */
        public HashSet<String> f270878o;

        /* renamed from: p */
        public HashMap<String, C72996z1> f270879p = new HashMap<>();

        /* renamed from: q */
        public long f270880q = -1;

        /* renamed from: r */
        public long f270881r = -1;

        /* renamed from: s */
        public int f270882s = 0;

        /* renamed from: t */
        public int f270883t = 0;

        /* renamed from: u */
        public int f270884u = 0;

        /* renamed from: v */
        public int f270885v = 0;

        /* renamed from: w */
        public int f270886w = 0;

        /* renamed from: x */
        public int f270887x;

        /* renamed from: y */
        public int f270888y;

        /* renamed from: z */
        public int f270889z;

        /* renamed from: com.tencent.mm.plugin.fts.logic.FTS5SearchContactLogic$i$a */
        public class C93855a implements Comparator<String> {
            public C93855a(C93854i iVar) {
            }

            public int compare(Object obj, Object obj2) {
                return FTSJNIUtils.stringCompareUtfBinary((String) obj, (String) obj2);
            }
        }

        public C93854i(C93842a aVar) {
        }

        /* renamed from: b */
        public boolean mo57099b() {
            Log.m105924i("MicroMsg.FTS.FTS5SearchContactLogic", "Start building contact index.");
            mo139040h(IXWebBroadcastListener.STAGE_START);
            if (this.f270878o == null) {
                this.f270878o = new HashSet<>();
                Cursor x = FTS5SearchContactLogic.this.f270840f.mo138624x(C99249c.f291010h, true, false, true, false, true);
                while (x.moveToNext()) {
                    String string = x.getString(1);
                    int i = x.getInt(2);
                    long j = x.getLong(0);
                    if (i == 1) {
                        List list = this.f270876j.get(string);
                        if (list == null) {
                            list = new ArrayList(16);
                            this.f270876j.put(string, list);
                        }
                        list.add(Long.valueOf(j));
                    } else {
                        this.f270878o.add(string);
                        if (i == 2) {
                            this.f270877n.add(string);
                        }
                    }
                }
                x.close();
                this.f270887x = this.f270876j.size();
                this.f270888y = this.f270877n.size();
                int size = this.f270878o.size();
                this.f270889z = size;
                if (size < 5) {
                    this.f292081g = 1 | this.f292081g;
                }
            }
            mo139040h("getBuildContact");
            if (!Thread.interrupted()) {
                if (this.f270876j.size() > 0) {
                    ArrayList arrayList = new ArrayList();
                    for (List<Long> addAll : this.f270876j.values()) {
                        arrayList.addAll(addAll);
                    }
                    this.f270876j.clear();
                    FTS5SearchContactLogic.this.f270840f.mo138606g(arrayList);
                }
                mo139040h("deleteDirtyContact");
                if (!Thread.interrupted()) {
                    if (this.f270877n.size() > 0) {
                        Iterator<String> it = this.f270877n.iterator();
                        while (it.hasNext()) {
                            String next = it.next();
                            long b = ((C68985g) FTS5SearchContactLogic.this.f270841g).mo94941b(next);
                            C101467b bVar = FTS5SearchContactLogic.this.f270840f;
                            bVar.f291000p.bindLong(1, b);
                            bVar.f291000p.bindString(2, next);
                            bVar.f291000p.execute();
                        }
                        this.f270877n.clear();
                    }
                    mo139040h("updateTimestampContact");
                    if (!Thread.interrupted()) {
                        Cursor d = ((C68985g) FTS5SearchContactLogic.this.f270841g).mo94943d("SELECT ROWID, username, alias, conRemark, nickname, verifyFlag, type, lvbuff, contactLabelIds FROM rcontact WHERE ROWID > ? AND deleteFlag=0 ORDER BY ROWID;", new String[]{Long.toString(this.f270880q)}, 2);
                        int i2 = 50;
                        while (d.moveToNext()) {
                            if (!Thread.interrupted()) {
                                long j2 = d.getLong(0);
                                this.f270880q = j2;
                                C72996z1 z1Var = new C72996z1();
                                z1Var.f108320R1 = j2;
                                z1Var.setUsername(d.getString(1));
                                z1Var.mo62857I2(d.getString(2));
                                z1Var.mo62860K2(d.getString(3));
                                z1Var.mo62878U2(d.getString(4));
                                z1Var.mo62894d3(d.getInt(5));
                                z1Var.mo62919n4(d.getInt(6));
                                z1Var.mo62876T2(d.getBlob(7));
                                z1Var.mo62867O2(d.getString(8));
                                z1Var.mo62869P2(0);
                                if (C72996z1.m85820U5(z1Var.getUsername())) {
                                    this.f270879p.put(z1Var.getUsername(), z1Var);
                                } else if (FTS5SearchContactLogic.this.mo128815g(z1Var) && !this.f270878o.remove(z1Var.getUsername())) {
                                    if (i2 >= 50) {
                                        FTS5SearchContactLogic.this.f270840f.mo138600c();
                                        FTS5SearchContactLogic.this.f270840f.mo138598a();
                                        i2 = 0;
                                    }
                                    try {
                                        if (!z1Var.getUsername().endsWith("@chatroom") && (8 & z1Var.mo73953E2()) == 0) {
                                            FTS5SearchContactLogic fTS5SearchContactLogic = FTS5SearchContactLogic.this;
                                            fTS5SearchContactLogic.getClass();
                                            try {
                                                fTS5SearchContactLogic.f270846o.invoke(z1Var, new Object[0]);
                                            } catch (Exception e) {
                                                Log.printErrStackTrace("MicroMsg.FTS.FTS5SearchContactLogic", e, "Failed parsing RContact LVBuffer.", new Object[0]);
                                            }
                                            z1Var.mo101232a6();
                                        }
                                        i2 += FTS5SearchContactLogic.this.mo128813e(z1Var);
                                        this.f270883t++;
                                    } catch (Exception e2) {
                                        Log.printErrStackTrace("MicroMsg.FTS.FTS5SearchContactLogic", e2, "Build contact index failed with exception.\n", new Object[0]);
                                        this.f270885v++;
                                    }
                                }
                            } else {
                                d.close();
                                FTS5SearchContactLogic.this.f270840f.mo138600c();
                                throw new InterruptedException();
                            }
                        }
                        d.close();
                        FTS5SearchContactLogic.this.f270840f.mo138600c();
                        mo139040h("buildWXContact");
                        if (!Thread.interrupted()) {
                            Cursor d2 = ((C68985g) FTS5SearchContactLogic.this.f270841g).mo94943d("SELECT rowid, chatroomname, memberlist, roomdata FROM chatroom WHERE ROWID > ? ORDER BY ROWID;", new String[]{Long.toString(this.f270881r)}, 2);
                            int i3 = 50;
                            while (d2.moveToNext()) {
                                if (!Thread.interrupted()) {
                                    this.f270881r = d2.getLong(0);
                                    String string2 = d2.getString(1);
                                    if (!this.f270878o.remove(string2)) {
                                        C72996z1 z1Var2 = this.f270879p.get(string2);
                                        if (z1Var2 == null) {
                                            this.f270886w++;
                                        } else {
                                            String string3 = d2.getString(2);
                                            if (!Util.nullAs(string3, "").contains(C75592q0.m90789s())) {
                                                this.f270886w++;
                                            } else {
                                                byte[] blob = d2.getBlob(3);
                                                try {
                                                    String[] split = C99249c.C99250a.f291019a.split(string3);
                                                    Arrays.sort(split, new C93855a(this));
                                                    i3 = i3 + FTS5SearchContactLogic.this.mo128818i(string2, split) + FTS5SearchContactLogic.this.mo128811c(string2, z1Var2, split, blob);
                                                    this.f270882s++;
                                                } catch (Exception e3) {
                                                    Log.printErrStackTrace("MicroMsg.FTS.FTS5SearchContactLogic", e3, "Build contact index failed with exception.\n", new Object[0]);
                                                    this.f270886w++;
                                                }
                                                if (i3 >= 50) {
                                                    FTS5SearchContactLogic.this.f270840f.mo138600c();
                                                    FTS5SearchContactLogic.this.f270840f.mo138598a();
                                                    i3 = 0;
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    d2.close();
                                    FTS5SearchContactLogic.this.f270840f.mo138600c();
                                    throw new InterruptedException();
                                }
                            }
                            d2.close();
                            FTS5SearchContactLogic.this.f270840f.mo138600c();
                            mo139040h("buildChatroomContact");
                            if (!Thread.interrupted()) {
                                this.f270884u = this.f270878o.size();
                                Iterator<String> it4 = this.f270878o.iterator();
                                while (it4.hasNext()) {
                                    String next2 = it4.next();
                                    C101467b bVar2 = FTS5SearchContactLogic.this.f270840f;
                                    int[] iArr = C99249c.f291010h;
                                    bVar2.mo138622v5(iArr, next2);
                                    ((PluginFTS) C86312j.m106911c(PluginFTS.class)).Bx0().f271053f.mo138622v5(iArr, next2);
                                }
                                this.f270878o.clear();
                                this.f270879p.clear();
                                mo139040h("deleteUnusedContact");
                                return true;
                            }
                            throw new InterruptedException();
                        }
                        throw new InterruptedException();
                    }
                    throw new InterruptedException();
                }
                throw new InterruptedException();
            }
            throw new InterruptedException();
        }

        /* renamed from: c */
        public String mo94944c() {
            return String.format("{build: %d newContact: %d, newChatroom: %d, remove: %d, dirty: %d, timestamp: %d, failContact: %d, failChatroom}", new Object[]{Integer.valueOf(this.f270889z), Integer.valueOf(this.f270883t), Integer.valueOf(this.f270882s), Integer.valueOf(this.f270884u), Integer.valueOf(this.f270887x), Integer.valueOf(this.f270888y), Integer.valueOf(this.f270885v), Integer.valueOf(this.f270886w)});
        }

        /* renamed from: e */
        public int mo128768e() {
            return 1;
        }

        public String getName() {
            return "BuildContactIndexTask";
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.logic.FTS5SearchContactLogic$j */
    public class C93856j extends C99664b {
        public C93856j(C93842a aVar) {
        }

        /* renamed from: b */
        public boolean mo57099b() {
            FTS5SearchContactLogic.this.f270840f.mo138604e(C99249c.f291009g);
            return true;
        }

        public String getName() {
            return "DeleteAllFriendTask";
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.logic.FTS5SearchContactLogic$k */
    public class C93857k extends C99664b {

        /* renamed from: j */
        public String f270891j;

        /* renamed from: n */
        public int f270892n = 0;

        public C93857k(String str) {
            this.f270891j = str;
        }

        /* renamed from: b */
        public boolean mo57099b() {
            Class cls = PluginFTS.class;
            Log.m105925i("MicroMsg.FTS.FTS5SearchContactLogic", "Delete Contact %s", this.f270891j);
            C101467b bVar = FTS5SearchContactLogic.this.f270840f;
            int[] iArr = C99249c.f291010h;
            bVar.mo138622v5(iArr, this.f270891j);
            ((PluginFTS) C86312j.m106911c(cls)).Bx0().f271053f.mo138622v5(iArr, this.f270891j);
            C101467b bVar2 = FTS5SearchContactLogic.this.f270840f;
            Cursor o = ((C93834f) bVar2.f290993f).mo128798o("SELECT DISTINCT chatroom FROM FTS5ChatRoomMembers WHERE member=?;", new String[]{this.f270891j});
            HashSet hashSet = new HashSet();
            while (true) {
                CursorWrapper cursorWrapper = (CursorWrapper) o;
                if (!cursorWrapper.moveToNext()) {
                    break;
                }
                hashSet.add(cursorWrapper.getString(0));
            }
            ((C93824b) o).close();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (!FTS5SearchContactLogic.this.f270843i.containsKey(str)) {
                    FTS5SearchContactLogic.this.f270843i.put(str, FTS5SearchContactLogic.this.f270840f.mo138614o(C99249c.f291010h, str, 1));
                    ((PluginFTS) C86312j.m106911c(cls)).Bx0().mo128842c(str);
                    this.f270892n++;
                }
            }
            return true;
        }

        /* renamed from: c */
        public String mo94944c() {
            return String.format("{username: %s mDirtyCount: %d}", new Object[]{this.f270891j, Integer.valueOf(this.f270892n)});
        }

        public String getName() {
            return "DeleteContactTask";
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.logic.FTS5SearchContactLogic$l */
    public class C93858l extends C99664b {

        /* renamed from: j */
        public String f270894j;

        /* renamed from: n */
        public boolean f270895n = false;

        public C93858l(String str) {
            this.f270894j = str;
        }

        /* renamed from: b */
        public boolean mo57099b() {
            Log.m105925i("MicroMsg.FTS.FTS5SearchContactLogic", "Insert Contact %s", this.f270894j);
            C72996z1 a = ((C68985g) FTS5SearchContactLogic.this.f270841g).mo94940a(this.f270894j);
            if (a.getUsername().length() <= 0 || !FTS5SearchContactLogic.this.mo128815g(a)) {
                this.f270895n = true;
            } else {
                FTS5SearchContactLogic.this.mo128812d(a);
            }
            FTS5SearchContactLogic.this.f270843i.remove(this.f270894j);
            FTS5SearchContactLogic.this.f270842h.remove(this.f270894j);
            return true;
        }

        /* renamed from: c */
        public String mo94944c() {
            return String.format("{username: %s isSkipped: %b}", new Object[]{this.f270894j, Boolean.valueOf(this.f270895n)});
        }

        public String getName() {
            return "InsertContactTask";
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.logic.FTS5SearchContactLogic$m */
    public class C93859m extends C99664b {

        /* renamed from: j */
        public int f270897j = 0;

        /* renamed from: n */
        public int f270898n = 0;

        public C93859m(C93842a aVar) {
        }

        /* renamed from: b */
        public boolean mo57099b() {
            Cursor o = ((C93834f) FTS5SearchContactLogic.this.f270840f.f290993f).mo128798o("SELECT user, label_id FROM FTS5ContactLabels;", (String[]) null);
            while (true) {
                CursorWrapper cursorWrapper = (CursorWrapper) o;
                if (cursorWrapper.moveToNext()) {
                    String string = cursorWrapper.getString(0);
                    long j = cursorWrapper.getLong(1);
                    List list = FTS5SearchContactLogic.this.f270845n.get(string);
                    if (list == null) {
                        list = new ArrayList(16);
                        FTS5SearchContactLogic.this.f270845n.put(string, list);
                        this.f270897j++;
                    }
                    list.add(Long.valueOf(j));
                    this.f270898n++;
                } else {
                    ((C93824b) o).close();
                    return true;
                }
            }
        }

        /* renamed from: c */
        public String mo94944c() {
            return String.format("{users: %d labels: %d}", new Object[]{Integer.valueOf(this.f270897j), Integer.valueOf(this.f270898n)});
        }

        public String getName() {
            return "LoadLabelCacheTask";
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.logic.FTS5SearchContactLogic$n */
    public class C93860n extends C99664b {

        /* renamed from: j */
        public int[] f270900j;

        /* renamed from: n */
        public int f270901n = 0;

        /* renamed from: o */
        public int f270902o = 0;

        public C93860n(int[] iArr) {
            this.f270900j = iArr;
        }

        /* renamed from: b */
        public boolean mo57099b() {
            ArrayList arrayList = (ArrayList) FTS5SearchContactLogic.this.f270840f.mo138616q(this.f270900j, 1);
            this.f270901n = arrayList.size();
            HashMap hashMap = new HashMap();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C99666c cVar = (C99666c) it.next();
                String str = cVar.f292087b;
                if (!FTS5SearchContactLogic.this.f270843i.containsKey(str)) {
                    List list = (List) hashMap.get(str);
                    if (list == null) {
                        list = new ArrayList(16);
                        hashMap.put(str, list);
                    }
                    list.add(Long.valueOf(cVar.f292086a));
                }
            }
            FTS5SearchContactLogic.this.f270843i.putAll(hashMap);
            this.f270902o = hashMap.size();
            return true;
        }

        /* renamed from: c */
        public String mo94944c() {
            return String.format("{touched: %d users: %d}", new Object[]{Integer.valueOf(this.f270901n), Integer.valueOf(this.f270902o)});
        }

        public String getName() {
            return "MarkAllContactDirtyTask";
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.logic.FTS5SearchContactLogic$o */
    public class C93861o extends C99664b {

        /* renamed from: j */
        public String f270904j;

        /* renamed from: n */
        public boolean f270905n = false;

        /* renamed from: o */
        public boolean f270906o = false;

        public C93861o(String str) {
            this.f270904j = str;
        }

        /* renamed from: b */
        public boolean mo57099b() {
            Log.m105925i("MicroMsg.FTS.FTS5SearchContactLogic", "Dirty Contact %s", this.f270904j);
            if (FTS5SearchContactLogic.this.f270843i.containsKey(this.f270904j)) {
                this.f270905n = true;
                return true;
            }
            FTS5SearchContactLogic.this.f270840f.mo138625y(this.f270904j);
            List<Long> o = FTS5SearchContactLogic.this.f270840f.mo138614o(C99249c.f291010h, this.f270904j, 1);
            FTS5SearchContactLogic.this.f270843i.put(this.f270904j, o);
            if (((ArrayList) o).isEmpty()) {
                this.f270906o = true;
                FTS5SearchContactLogic fTS5SearchContactLogic = FTS5SearchContactLogic.this;
                ((C93836i) fTS5SearchContactLogic.f270839e).mo128803c(65556, new C93858l(this.f270904j));
                return true;
            }
            C101467b bVar = FTS5SearchContactLogic.this.f270840f;
            String str = this.f270904j;
            String[] strArr = {str};
            Cursor o2 = ((C93834f) bVar.f290993f).mo128798o("SELECT DISTINCT chatroom FROM FTS5ChatRoomMembers WHERE member=?;", strArr);
            HashSet hashSet = new HashSet();
            while (true) {
                CursorWrapper cursorWrapper = (CursorWrapper) o2;
                if (!cursorWrapper.moveToNext()) {
                    break;
                }
                hashSet.add(cursorWrapper.getString(0));
            }
            ((C93824b) o2).close();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                FTS5SearchContactLogic.this.f270840f.mo138625y(str2);
                if (!FTS5SearchContactLogic.this.f270843i.containsKey(str2)) {
                    FTS5SearchContactLogic.this.f270843i.put(str2, FTS5SearchContactLogic.this.f270840f.mo138614o(C99249c.f291010h, str2, 1));
                }
            }
            FTS5SearchContactLogic.this.f270842h.remove(this.f270904j);
            ((PluginFTS) C86312j.m106911c(PluginFTS.class)).Bx0().mo128842c(this.f270904j);
            return true;
        }

        /* renamed from: c */
        public String mo94944c() {
            return String.format("{username: %s cached: %b isSkipped: %b}", new Object[]{this.f270904j, Boolean.valueOf(this.f270905n), Boolean.valueOf(this.f270906o)});
        }

        /* renamed from: e */
        public int mo128768e() {
            return 17;
        }

        public String getName() {
            return "MarkContactDirtyTask";
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.logic.FTS5SearchContactLogic$p */
    public class C93862p extends C99664b {

        /* renamed from: j */
        public boolean f270908j;

        /* renamed from: n */
        public String f270909n;

        public C93862p(String str) {
            this.f270909n = str;
        }

        /* renamed from: b */
        public boolean mo57099b() {
            if (FTS5SearchContactLogic.this.f270843i.containsKey(this.f270909n)) {
                this.f270908j = true;
                return true;
            } else if (!FTS5SearchContactLogic.this.f270842h.add(this.f270909n)) {
                this.f270908j = true;
                return true;
            } else {
                if (!FTS5SearchContactLogic.this.mo128815g(((C68985g) FTS5SearchContactLogic.this.f270841g).mo94940a(this.f270909n))) {
                    this.f270908j = true;
                    return true;
                }
                C101467b bVar = FTS5SearchContactLogic.this.f270840f;
                String str = this.f270909n;
                bVar.f290999o.bindLong(1, 2);
                bVar.f290999o.bindString(2, str);
                bVar.f290999o.bindLong(3, 0);
                bVar.f290999o.execute();
                return true;
            }
        }

        /* renamed from: c */
        public String mo94944c() {
            return String.format("{username: %s isSkipped: %b}", new Object[]{this.f270909n, Boolean.valueOf(this.f270908j)});
        }

        public String getName() {
            return "MarkContactTimestampTask";
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.logic.FTS5SearchContactLogic$q */
    public class C93863q extends C99678j {
        public C93863q(C76728k kVar) {
            super(kVar);
        }

        /* renamed from: e */
        public int mo128768e() {
            return 11;
        }

        public String getName() {
            return "SearchContactLogic.SearchTask";
        }

        /* renamed from: i */
        public void mo128820i(C10656l lVar) {
            C99681n nVar;
            C99672i a = C99672i.m130094a(this.f292133j.f224468c, true);
            lVar.f32075d = a;
            C101467b bVar = FTS5SearchContactLogic.this.f270840f;
            C76728k kVar = this.f292133j;
            Cursor w = bVar.mo138623w(a, kVar.f224472g, kVar.f224473h, (String) null, true, true);
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            while (((CursorWrapper) w).moveToNext()) {
                C99682o oVar = new C99682o();
                oVar.mo139050c(w);
                if (!this.f292133j.f224475j.contains(oVar.f292151e)) {
                    int[] iArr = C99249c.f291010h;
                    int i = oVar.f292148b;
                    HashMap<String, String> hashMap3 = C99251g.f291026a;
                    int binarySearch = Arrays.binarySearch(iArr, i);
                    boolean z = false;
                    if (binarySearch >= 0) {
                        C99681n nVar2 = (C99681n) hashMap.get(oVar.f292151e);
                        if (nVar2 == null || C99251g.m129281b(C99249c.f291016n, oVar.f292149c, nVar2.f292149c) < 0) {
                            hashMap.put(oVar.f292151e, oVar);
                        }
                    } else {
                        if (Arrays.binarySearch(C99249c.f291012j, oVar.f292148b) >= 0) {
                            z = true;
                        }
                        if (z && ((nVar = (C99681n) hashMap2.get(Long.valueOf(oVar.f292150d))) == null || C99251g.m129281b(C99249c.f291016n, oVar.f292149c, nVar.f292149c) < 0)) {
                            hashMap2.put(Long.valueOf(oVar.f292150d), oVar);
                        }
                    }
                    if (Thread.interrupted()) {
                        ((C93824b) w).close();
                        throw new InterruptedException();
                    }
                }
            }
            ((C93824b) w).close();
            if (!Thread.interrupted()) {
                lVar.f32076e = new ArrayList(hashMap.size());
                for (C99682o oVar2 : hashMap.values()) {
                    oVar2.mo139048a();
                    oVar2.mo139049b(lVar.f32075d);
                    lVar.f32076e.add(oVar2);
                }
                lVar.f32076e.addAll(hashMap2.values());
                if (!Thread.interrupted()) {
                    Comparator<C99681n> comparator = this.f292133j.f224477l;
                    if (comparator != null) {
                        Collections.sort(lVar.f32076e, comparator);
                        return;
                    }
                    return;
                }
                throw new InterruptedException();
            }
            throw new InterruptedException();
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.logic.FTS5SearchContactLogic$r */
    public class C93864r extends C99678j {
        public C93864r(C76728k kVar) {
            super(kVar);
        }

        public String getName() {
            return "SearchChatroomByMemberTask";
        }

        /* renamed from: i */
        public void mo128820i(C10656l lVar) {
            super.mo128820i(lVar);
            C101467b bVar = FTS5SearchContactLogic.this.f270840f;
            String str = this.f292133j.f224468c;
            String[] strArr = {str};
            Cursor o = ((C93834f) bVar.f290993f).mo128798o(String.format("SELECT aux_index FROM %s NOT INDEXED JOIN FTS5ChatRoomMembers ON (aux_index = chatroom) WHERE member=? AND subtype=38 AND type=131075 ORDER BY timestamp desc", new Object[]{bVar.mo138611l()}), strArr);
            lVar.f32076e = new ArrayList();
            while (true) {
                CursorWrapper cursorWrapper = (CursorWrapper) o;
                if (cursorWrapper.moveToNext()) {
                    C99681n nVar = new C99681n();
                    nVar.f292151e = cursorWrapper.getString(0);
                    lVar.f32076e.add(nVar);
                } else {
                    ((C93824b) o).close();
                    lVar.f32074c = 0;
                    return;
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.logic.FTS5SearchContactLogic$s */
    public class C93865s extends C99678j {
        public C93865s(C76728k kVar) {
            super(kVar);
        }

        public String getName() {
            return "SearchChatroomCountTask";
        }

        /* renamed from: i */
        public void mo128820i(C10656l lVar) {
            super.mo128820i(lVar);
            C101467b bVar = FTS5SearchContactLogic.this.f270840f;
            String str = this.f292133j.f224468c;
            int i = 0;
            String[] strArr = {str};
            Cursor o = ((C93834f) bVar.f290993f).mo128798o(String.format("SELECT count(aux_index) FROM %s NOT INDEXED JOIN FTS5ChatRoomMembers ON (aux_index = chatroom) WHERE member=? AND subtype=38 AND type=131075", new Object[]{bVar.mo138611l()}), strArr);
            CursorWrapper cursorWrapper = (CursorWrapper) o;
            if (cursorWrapper.moveToNext()) {
                i = cursorWrapper.getInt(0);
            }
            ((C93824b) o).close();
            C99681n nVar = new C99681n();
            nVar.f292161o = Integer.valueOf(i);
            ArrayList arrayList = new ArrayList();
            lVar.f32076e = arrayList;
            arrayList.add(nVar);
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.logic.FTS5SearchContactLogic$t */
    public class C93866t extends C99678j {
        public C93866t(C76728k kVar) {
            super(kVar);
        }

        public String getName() {
            return "SearchChatroomInMemberTask";
        }

        /* renamed from: i */
        public void mo128820i(C10656l lVar) {
            super.mo128820i(lVar);
            C101467b bVar = FTS5SearchContactLogic.this.f270840f;
            String str = this.f292133j.f224469d;
            C99672i iVar = lVar.f32075d;
            bVar.getClass();
            Cursor o = ((C93834f) bVar.f290993f).mo128798o(String.format("SELECT aux_index FROM %s NOT INDEXED JOIN (SELECT docid, aux_index, timestamp FROM %s NOT INDEXED JOIN FTS5ChatRoomMembers ON (aux_index = chatroom) WHERE member=?) as temp ON (%s.rowid = temp.docid) WHERE %s MATCH '%s' ORDER BY -timestamp;", new Object[]{bVar.mo138609j(), bVar.mo138611l(), bVar.mo138609j(), bVar.mo138609j(), iVar.mo139044d()}), new String[]{str});
            HashSet hashSet = new HashSet();
            lVar.f32076e = new ArrayList();
            while (true) {
                CursorWrapper cursorWrapper = (CursorWrapper) o;
                if (cursorWrapper.moveToNext()) {
                    C99681n nVar = new C99681n();
                    String string = cursorWrapper.getString(0);
                    nVar.f292151e = string;
                    if (hashSet.add(string)) {
                        lVar.f32076e.add(nVar);
                    }
                } else {
                    ((C93824b) o).close();
                    lVar.f32074c = 0;
                    return;
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.logic.FTS5SearchContactLogic$u */
    public class C93867u extends C99678j {

        /* renamed from: com.tencent.mm.plugin.fts.logic.FTS5SearchContactLogic$u$a */
        public class C93868a implements Comparator<String> {

            /* renamed from: d */
            public final /* synthetic */ C99260q f270916d;

            public C93868a(C93867u uVar, C99260q qVar) {
                this.f270916d = qVar;
            }

            public int compare(Object obj, Object obj2) {
                return this.f270916d.mo128755eu((String) obj, (String) obj2);
            }
        }

        /* renamed from: com.tencent.mm.plugin.fts.logic.FTS5SearchContactLogic$u$b */
        public class C93869b implements Comparator<C99671h> {
            public C93869b(C93867u uVar) {
            }

            public int compare(Object obj, Object obj2) {
                return ((C99671h) obj2).f292116h - ((C99671h) obj).f292116h;
            }
        }

        public C93867u(C76728k kVar) {
            super(kVar);
        }

        public String getName() {
            return "SearchChatroomMemberTask";
        }

        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0181, code lost:
            r6.f292117i = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0183, code lost:
            r6.f292114f = r9.getNickname();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x0191, code lost:
            if (r9.getNickname().equals(r10) != false) goto L_0x01cc;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x0193, code lost:
            r6.f292115g = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext().getString(com.tencent.p014mm.C0966R.string.igx);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x01c8, code lost:
            r6.f292117i = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x01ca, code lost:
            r6.f292114f = r10;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x01d2, code lost:
            if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r6.f292114f) == false) goto L_0x01d6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x01e0, code lost:
            if (r6.f292114f.contains(r14.f32075d.f292120a) == false) goto L_0x01e8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x01e2, code lost:
            r6.f292116h += 10;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x01ec, code lost:
            if (r1.add(r8) == false) goto L_0x00fa;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x01ee, code lost:
            r3.add(r6);
         */
        /* renamed from: i */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo128820i(lv1.C10656l r14) {
            /*
                r13 = this;
                java.lang.Class<f62.k0> r0 = f62.C75700k0.class
                lv1.k r1 = r13.f292133j
                java.lang.String r1 = r1.f224468c
                r2 = 1
                lv1.i r1 = lv1.C99672i.m130094a(r1, r2)
                r14.f32075d = r1
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r14.f32076e = r1
                com.tencent.mm.plugin.fts.logic.FTS5SearchContactLogic r1 = com.tencent.p014mm.plugin.fts.logic.FTS5SearchContactLogic.this
                rv1.b r1 = r1.f270840f
                lv1.k r3 = r13.f292133j
                java.lang.String r3 = r3.f224469d
                lv1.i r4 = r14.f32075d
                r1.getClass()
                java.lang.String r4 = r4.mo139044d()
                r5 = 8
                java.lang.Object[] r5 = new java.lang.Object[r5]
                java.lang.String r6 = r1.mo138611l()
                r7 = 0
                r5[r7] = r6
                java.lang.String r6 = r1.mo138609j()
                r5[r2] = r6
                java.lang.String r6 = r1.mo138609j()
                r8 = 2
                r5[r8] = r6
                java.lang.String r6 = r1.mo138611l()
                r9 = 3
                r5[r9] = r6
                java.lang.String r6 = r1.mo138611l()
                r9 = 4
                r5[r9] = r6
                java.lang.String r6 = r1.mo138609j()
                r9 = 5
                r5[r9] = r6
                java.lang.String r6 = r1.mo138609j()
                r9 = 6
                r5[r9] = r6
                r6 = 7
                r5[r6] = r4
                java.lang.String r4 = "SELECT %s.docid, type, subtype, entity_id, aux_index, timestamp, content, MMChatroomMember(%s) AS Offsets FROM %s NOT INDEXED JOIN %s ON (%s.docid = %s.rowid) WHERE %s MATCH '%s' AND type = 131075 AND subtype = 38 AND aux_index = ? ;"
                java.lang.String r4 = java.lang.String.format(r4, r5)
                kv1.k r1 = r1.f290993f
                java.lang.String[] r5 = new java.lang.String[r2]
                r5[r7] = r3
                com.tencent.mm.plugin.fts.f r1 = (com.tencent.p014mm.plugin.fts.C93834f) r1
                android.database.Cursor r1 = r1.mo128798o(r4, r5)
                r3 = r1
                android.database.CursorWrapper r3 = (android.database.CursorWrapper) r3
                boolean r3 = r3.moveToNext()
                if (r3 == 0) goto L_0x0087
                lv1.o r3 = new lv1.o
                r3.<init>()
                r3.mo139050c(r1)
                r3.mo139048a()
                java.util.List<lv1.n> r4 = r14.f32076e
                r4.add(r3)
            L_0x0087:
                com.tencent.mm.plugin.fts.b r1 = (com.tencent.p014mm.plugin.fts.C93824b) r1
                r1.close()
                f40.o r1 = f40.C86709a0.m107535s()
                zh3.f r1 = r1.f251811i
                java.lang.String[] r3 = new java.lang.String[r2]
                lv1.k r4 = r13.f292133j
                java.lang.String r4 = r4.f224469d
                r3[r7] = r4
                java.lang.String r4 = "SELECT memberlist FROM chatroom WHERE chatroomname=?;"
                android.database.Cursor r1 = r1.rawQuery(r4, r3, r8)
                boolean r3 = r1.moveToFirst()
                r4 = 0
                if (r3 == 0) goto L_0x00b5
                java.lang.String r3 = r1.getString(r7)
                if (r3 != 0) goto L_0x00ae
                goto L_0x00b5
            L_0x00ae:
                java.util.regex.Pattern r4 = kv1.C99249c.C99250a.f291019a
                java.lang.String[] r3 = r4.split(r3)
                r4 = r3
            L_0x00b5:
                r1.close()
                java.util.HashSet r1 = new java.util.HashSet
                lv1.k r3 = r13.f292133j
                java.util.HashSet<java.lang.String> r3 = r3.f224475j
                r1.<init>(r3)
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                java.lang.Class<kv1.q> r5 = kv1.C99260q.class
                di3.d r5 = di3.C86312j.m106911c(r5)
                kv1.q r5 = (kv1.C99260q) r5
                com.tencent.mm.plugin.fts.logic.FTS5SearchContactLogic$u$a r6 = new com.tencent.mm.plugin.fts.logic.FTS5SearchContactLogic$u$a
                r6.<init>(r13, r5)
                java.util.Arrays.sort(r4, r6)
                if (r4 == 0) goto L_0x0205
                java.util.List<lv1.n> r5 = r14.f32076e
                boolean r5 = r5.isEmpty()
                if (r5 != 0) goto L_0x0205
                java.util.List<lv1.n> r5 = r14.f32076e
                java.lang.Object r5 = r5.get(r7)
                lv1.n r5 = (lv1.C99681n) r5
                java.util.List<lv1.h> r5 = r5.f292160n
                if (r5 == 0) goto L_0x0205
                java.util.List<lv1.n> r5 = r14.f32076e
                java.lang.Object r5 = r5.get(r7)
                lv1.n r5 = (lv1.C99681n) r5
                java.util.List<lv1.h> r5 = r5.f292160n
                java.util.Iterator r5 = r5.iterator()
            L_0x00fa:
                boolean r6 = r5.hasNext()
                if (r6 == 0) goto L_0x01f3
                java.lang.Object r6 = r5.next()
                lv1.h r6 = (lv1.C99671h) r6
                int r8 = r6.f292109a
                int r9 = r4.length
                if (r8 < r9) goto L_0x010c
                goto L_0x00fa
            L_0x010c:
                r8 = r4[r8]
                boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
                if (r9 == 0) goto L_0x0115
                goto L_0x00fa
            L_0x0115:
                r6.f292113e = r8
                k40.a r9 = f40.C86709a0.m107533q(r0)
                f62.k0 r9 = (f62.C75700k0) r9
                com.tencent.mm.storage.u3 r9 = r9.mo96097Ni()
                com.tencent.mm.storage.z1 r9 = r9.mo69696f3(r8)
                if (r9 != 0) goto L_0x0135
                k40.a r9 = f40.C86709a0.m107533q(r0)
                f62.k0 r9 = (f62.C75700k0) r9
                com.tencent.mm.storage.u3 r9 = r9.mo96097Ni()
                com.tencent.mm.storage.z1 r9 = r9.mo69656H3(r8)
            L_0x0135:
                if (r9 != 0) goto L_0x0138
                goto L_0x00fa
            L_0x0138:
                lv1.k r10 = r13.f292133j
                java.util.HashSet<java.lang.String> r10 = r10.f224476k
                boolean r10 = r10.isEmpty()
                if (r10 != 0) goto L_0x014d
                lv1.k r10 = r13.f292133j
                java.util.HashSet<java.lang.String> r10 = r10.f224476k
                boolean r10 = r10.contains(r8)
                if (r10 != 0) goto L_0x014d
                goto L_0x00fa
            L_0x014d:
                java.lang.Class<d62.i> r10 = d62.C75339i.class
                di3.d r10 = di3.C86312j.m106911c(r10)
                d62.i r10 = (d62.C75339i) r10
                java.lang.String r11 = r9.getUsername()
                lv1.k r12 = r13.f292133j
                java.lang.String r12 = r12.f224469d
                java.lang.String r10 = r10.mo62519pb(r11, r12)
                int r11 = r6.f292110b
                r12 = 2131835407(0x7f113a0f, float:1.9303952E38)
                switch(r11) {
                    case 29: goto L_0x01ca;
                    case 30: goto L_0x01c8;
                    case 31: goto L_0x01c6;
                    case 32: goto L_0x01b4;
                    case 33: goto L_0x019e;
                    case 34: goto L_0x0183;
                    case 35: goto L_0x0181;
                    case 36: goto L_0x017f;
                    case 37: goto L_0x016a;
                    default: goto L_0x0169;
                }
            L_0x0169:
                goto L_0x01cc
            L_0x016a:
                java.lang.String r9 = r9.mo62913l2()
                java.lang.String r9 = kv1.C99251g.m129285f(r8, r9)
                r6.f292114f = r9
                android.content.Context r9 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                java.lang.String r9 = r9.getString(r12)
                r6.f292115g = r9
                goto L_0x01cc
            L_0x017f:
                r6.f292118j = r2
            L_0x0181:
                r6.f292117i = r2
            L_0x0183:
                java.lang.String r11 = r9.getNickname()
                r6.f292114f = r11
                java.lang.String r9 = r9.getNickname()
                boolean r9 = r9.equals(r10)
                if (r9 != 0) goto L_0x01cc
                android.content.Context r9 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                java.lang.String r9 = r9.getString(r12)
                r6.f292115g = r9
                goto L_0x01cc
            L_0x019e:
                java.lang.String r9 = r6.f292111c
                r6.f292114f = r9
                android.content.Context r9 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                r10 = 2131835400(0x7f113a08, float:1.9303937E38)
                java.lang.String r9 = r9.getString(r10)
                r6.f292115g = r9
                java.lang.String r9 = r6.f292111c
                r6.f292114f = r9
                goto L_0x01cc
            L_0x01b4:
                java.lang.String r9 = r9.f149513S0
                r6.f292114f = r9
                android.content.Context r9 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                r10 = 2131835410(0x7f113a12, float:1.9303958E38)
                java.lang.String r9 = r9.getString(r10)
                r6.f292115g = r9
                goto L_0x01cc
            L_0x01c6:
                r6.f292118j = r2
            L_0x01c8:
                r6.f292117i = r2
            L_0x01ca:
                r6.f292114f = r10
            L_0x01cc:
                java.lang.String r9 = r6.f292114f
                boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
                if (r9 == 0) goto L_0x01d6
                goto L_0x00fa
            L_0x01d6:
                java.lang.String r9 = r6.f292114f
                lv1.i r10 = r14.f32075d
                java.lang.String r10 = r10.f292120a
                boolean r9 = r9.contains(r10)
                if (r9 == 0) goto L_0x01e8
                int r9 = r6.f292116h
                int r9 = r9 + 10
                r6.f292116h = r9
            L_0x01e8:
                boolean r8 = r1.add(r8)
                if (r8 == 0) goto L_0x00fa
                r3.add(r6)
                goto L_0x00fa
            L_0x01f3:
                com.tencent.mm.plugin.fts.logic.FTS5SearchContactLogic$u$b r0 = new com.tencent.mm.plugin.fts.logic.FTS5SearchContactLogic$u$b
                r0.<init>(r13)
                java.util.Collections.sort(r3, r0)
                java.util.List<lv1.n> r14 = r14.f32076e
                java.lang.Object r14 = r14.get(r7)
                lv1.n r14 = (lv1.C99681n) r14
                r14.f292160n = r3
            L_0x0205:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.fts.logic.FTS5SearchContactLogic.C93867u.mo128820i(lv1.l):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.logic.FTS5SearchContactLogic$v */
    public class C93870v extends C99678j {
        public C93870v(C76728k kVar) {
            super(kVar);
        }

        /* renamed from: e */
        public int mo128768e() {
            return 19;
        }

        public String getName() {
            return "SearchChatroomTask";
        }

        /* renamed from: i */
        public void mo128820i(C10656l lVar) {
            C99672i a = C99672i.m130094a(this.f292133j.f224468c, true);
            lVar.f32075d = a;
            Cursor w = FTS5SearchContactLogic.this.f270840f.mo138623w(a, new int[]{131075}, (int[]) null, (String) null, true, true);
            HashMap hashMap = new HashMap();
            while (((CursorWrapper) w).moveToNext()) {
                C99682o oVar = new C99682o();
                oVar.mo139050c(w);
                if (!this.f292133j.f224475j.contains(oVar.f292151e)) {
                    C99681n nVar = (C99681n) hashMap.get(oVar.f292151e);
                    if (nVar == null || C99251g.m129281b(C99249c.f291016n, oVar.f292149c, nVar.f292149c) < 0) {
                        hashMap.put(oVar.f292151e, oVar);
                    }
                    if (Thread.interrupted()) {
                        ((C93824b) w).close();
                        throw new InterruptedException();
                    }
                }
            }
            ((C93824b) w).close();
            ArrayList arrayList = new ArrayList(hashMap.size());
            for (C99682o oVar2 : hashMap.values()) {
                oVar2.mo139048a();
                oVar2.mo139049b(lVar.f32075d);
                arrayList.add(oVar2);
                if (Thread.interrupted()) {
                    throw new InterruptedException();
                }
            }
            Comparator<C99681n> comparator = this.f292133j.f224477l;
            if (comparator != null) {
                Collections.sort(arrayList, comparator);
            }
            lVar.f32076e = new ArrayList(hashMap.size());
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = 0; i < arrayList.size(); i++) {
                C99681n nVar2 = (C99681n) arrayList.get(i);
                stringBuffer.append(nVar2.f292162p);
                stringBuffer.append("|");
                stringBuffer.append(nVar2.f292152f);
                stringBuffer.append(" ");
                lVar.f32076e.add(nVar2);
                if (i >= this.f292133j.f224474i) {
                    break;
                }
            }
            if (((ArrayList) lVar.f32075d.f292124e).size() > 1 && FTS5SearchContactLogic.this.f270840f.mo140966B(lVar.f32075d)) {
                C99681n nVar3 = new C99681n();
                nVar3.f292151e = "create_chatroom​";
                lVar.f32076e.add(0, nVar3);
                stringBuffer.append(" needCreateChatroom");
            }
            Log.m105925i("MicroMsg.FTS.FTS5SearchContactLogic", "rank score: %s", stringBuffer.toString());
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.logic.FTS5SearchContactLogic$w */
    public class C93871w extends C99678j {
        public C93871w(C76728k kVar) {
            super(kVar);
        }

        public String getName() {
            return "SearchCommonChatroomTask";
        }

        /* renamed from: i */
        public void mo128820i(C10656l lVar) {
            ArrayList<String> stringsToList = Util.stringsToList(this.f292133j.f224468c.split(","));
            C101467b bVar = FTS5SearchContactLogic.this.f270840f;
            bVar.getClass();
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("member IN (");
            for (int i = 0; i < stringsToList.size(); i++) {
                stringBuffer.append("'");
                stringBuffer.append(stringsToList.get(i));
                stringBuffer.append("'");
                if (i != stringsToList.size() - 1) {
                    stringBuffer.append(",");
                }
            }
            stringBuffer.append(")");
            Cursor o = ((C93834f) bVar.f290993f).mo128798o(String.format("SELECT member, chatroom, entity_id FROM FTS5ChatRoomMembers, %s WHERE %s AND chatroom = aux_index", new Object[]{bVar.mo138611l(), stringBuffer.toString()}), (String[]) null);
            HashMap hashMap = new HashMap();
            while (true) {
                CursorWrapper cursorWrapper = (CursorWrapper) o;
                if (cursorWrapper.moveToNext()) {
                    String string = cursorWrapper.getString(0);
                    List arrayList = hashMap.containsKey(string) ? (List) hashMap.get(string) : new ArrayList();
                    C99681n nVar = new C99681n();
                    nVar.f292151e = cursorWrapper.getString(1);
                    nVar.f292150d = cursorWrapper.getLong(2);
                    arrayList.add(nVar);
                    hashMap.put(string, arrayList);
                } else {
                    ((C93824b) o).close();
                    lVar.f32076e = new ArrayList();
                    C99681n nVar2 = new C99681n();
                    nVar2.f292161o = hashMap;
                    lVar.f32076e.add(nVar2);
                    return;
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.logic.FTS5SearchContactLogic$x */
    public class C93872x extends C99678j {
        public C93872x(C76728k kVar) {
            super(kVar);
        }

        public String getName() {
            return "SearchContactSmallerTimestampTask";
        }

        /* renamed from: i */
        public void mo128820i(C10656l lVar) {
            long longValue = Long.valueOf(this.f292133j.f224468c).longValue();
            C101467b bVar = FTS5SearchContactLogic.this.f270840f;
            Cursor o = ((C93834f) bVar.f290993f).mo128798o(String.format("SELECT distinct(aux_index) FROM %s WHERE timestamp < %d AND type = %d", new Object[]{bVar.mo138611l(), Long.valueOf(longValue), 131072}), (String[]) null);
            lVar.f32076e = new ArrayList();
            while (true) {
                CursorWrapper cursorWrapper = (CursorWrapper) o;
                if (cursorWrapper.moveToNext()) {
                    C99681n nVar = new C99681n();
                    nVar.f292151e = cursorWrapper.getString(0);
                    lVar.f32076e.add(nVar);
                } else {
                    ((C93824b) o).close();
                    return;
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.logic.FTS5SearchContactLogic$y */
    public class C93873y extends C99678j {
        public C93873y(C76728k kVar) {
            super(kVar);
        }

        /* renamed from: e */
        public int mo128768e() {
            return 20;
        }

        public String getName() {
            return "SearchContactTask";
        }

        /* renamed from: i */
        public void mo128820i(C10656l lVar) {
            String str;
            C99672i a = C99672i.m130094a(this.f292133j.f224468c, true);
            lVar.f32075d = a;
            C101467b bVar = FTS5SearchContactLogic.this.f270840f;
            int[] iArr = this.f292133j.f224472g;
            bVar.getClass();
            String d = a.mo139044d();
            if (iArr == null || iArr.length <= 0) {
                str = "";
            } else {
                str = " AND type IN " + C99251g.m129291l(iArr);
            }
            int i = 0;
            Cursor o = ((C93834f) bVar.f290993f).mo128798o(String.format("SELECT %s.docid, type, subtype, entity_id, aux_index, timestamp, content, MMHighlight(%s, %d, type, subtype) FROM %s NOT INDEXED JOIN %s ON (%s.docid = %s.rowid) WHERE %s MATCH '%s'" + str + " AND status >= 0 ORDER BY subtype;", new Object[]{bVar.mo138611l(), bVar.mo138609j(), Long.valueOf((long) ((ArrayList) a.f292124e).size()), bVar.mo138611l(), bVar.mo138609j(), bVar.mo138611l(), bVar.mo138609j(), bVar.mo138609j(), d}), (String[]) null);
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            hashSet.addAll(this.f292133j.f224475j);
            while (true) {
                CursorWrapper cursorWrapper = (CursorWrapper) o;
                if (!cursorWrapper.moveToNext()) {
                    break;
                } else if (hashSet.add(cursorWrapper.getString(4))) {
                    C99682o oVar = new C99682o();
                    oVar.mo139050c(o);
                    if (i >= oVar.f292149c) {
                        arrayList.add(oVar);
                    } else if (arrayList.size() > this.f292133j.f224474i) {
                        break;
                    } else {
                        int i2 = oVar.f292149c;
                        arrayList.add(oVar);
                        i = i2;
                    }
                    if (Thread.interrupted()) {
                        ((C93824b) o).close();
                        throw new InterruptedException("Task is Cancel: " + this.f292133j.f224468c);
                    }
                }
            }
            ((C93824b) o).close();
            lVar.f32076e = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C99682o oVar2 = (C99682o) it.next();
                oVar2.mo139048a();
                oVar2.mo139049b(lVar.f32075d);
                lVar.f32076e.add(oVar2);
            }
            Comparator<C99681n> comparator = this.f292133j.f224477l;
            if (comparator != null) {
                Collections.sort(lVar.f32076e, comparator);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.logic.FTS5SearchContactLogic$z */
    public class C93874z extends C99678j {
        public C93874z(C76728k kVar) {
            super(kVar);
        }

        /* renamed from: e */
        public int mo128768e() {
            return 25;
        }

        public String getName() {
            return "SearchTopChatroomInnerRankTask";
        }

        /* renamed from: i */
        public void mo128820i(C10656l lVar) {
            mo139040h(IXWebBroadcastListener.STAGE_START);
            C99672i a = C99672i.m130094a(this.f292133j.f224468c, true);
            lVar.f32075d = a;
            C101467b bVar = FTS5SearchContactLogic.this.f270840f;
            bVar.getClass();
            String d = a.mo139044d();
            long size = (long) ((ArrayList) a.f292124e).size();
            String format = String.format("SELECT %s.docid, type, subtype, entity_id, aux_index, timestamp, content, MMHighlight(%s, %d, type, subtype) AS Offsets, MMChatroomRank(%s, timestamp / 1000 - %d / 1000, subtype, ?, entity_id, %d) AS Rank FROM %s NOT INDEXED JOIN %s ON (%s.docid = %s.rowid) WHERE %s MATCH '%s' AND type = 131075 ORDER BY Rank, timestamp desc ;", new Object[]{bVar.mo138611l(), bVar.mo138609j(), Long.valueOf(size), bVar.mo138609j(), Long.valueOf(System.currentTimeMillis() - 1209600000), Long.valueOf(size), bVar.mo138611l(), bVar.mo138609j(), bVar.mo138611l(), bVar.mo138609j(), bVar.mo138609j(), d});
            C99257k kVar = bVar.f290993f;
            Cursor o = ((C93834f) kVar).mo128798o(format, new String[]{a.f292121b});
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            hashSet.addAll(this.f292133j.f224475j);
            while (((CursorWrapper) o).moveToNext()) {
                C99682o oVar = new C99682o();
                oVar.mo139052e(o);
                if (hashSet.add(oVar.f292151e)) {
                    if (arrayList.size() > this.f292133j.f224474i) {
                        break;
                    }
                    arrayList.add(oVar);
                    if (Thread.interrupted()) {
                        ((C93824b) o).close();
                        throw new InterruptedException("Task is Cancel: " + this.f292133j.f224468c);
                    }
                }
            }
            ((C93824b) o).close();
            if (!Thread.interrupted()) {
                mo139040h("orm");
                lVar.f32076e = new ArrayList(arrayList.size());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C99682o oVar2 = (C99682o) it.next();
                    oVar2.mo139048a();
                    oVar2.mo139049b(lVar.f32075d);
                    lVar.f32076e.add(oVar2);
                }
                if (!Thread.interrupted()) {
                    Comparator<C99681n> comparator = this.f292133j.f224477l;
                    if (comparator != null) {
                        Collections.sort(lVar.f32076e, comparator);
                    }
                    mo139040h("calOffsets");
                    if (((ArrayList) lVar.f32075d.f292124e).size() > 1 && FTS5SearchContactLogic.this.f270840f.mo140966B(lVar.f32075d)) {
                        C99681n nVar = new C99681n();
                        nVar.f292151e = "create_chatroom​";
                        if (lVar.f32076e.size() > 3) {
                            lVar.f32076e.add(3, nVar);
                        } else {
                            lVar.f32076e.add(nVar);
                        }
                    }
                    mo139040h("checkChatroom");
                    return;
                }
                throw new InterruptedException();
            }
            throw new InterruptedException();
        }
    }

    static {
        String[] split = MMApplicationContext.getContext().getString(C0966R.string.bvv).split(";");
        if (split != null) {
            for (String add : split) {
                f270838x.add(add);
            }
        }
    }

    public FTS5SearchContactLogic() {
        C40008f fVar = C40008f.f107254d;
        this.f270851t = new IListener<UpdateSearchIndexAtOnceEvent>(fVar) {
            {
                this.__eventId = -981145195;
            }

            public boolean callback(IEvent iEvent) {
                UpdateSearchIndexAtOnceEvent updateSearchIndexAtOnceEvent = (UpdateSearchIndexAtOnceEvent) iEvent;
                if (updateSearchIndexAtOnceEvent.f9570d.f9571a <= 0) {
                    FTS5SearchContactLogic fTS5SearchContactLogic = FTS5SearchContactLogic.this;
                    ((C93836i) fTS5SearchContactLogic.f270839e).mo128803c(131093, new C93847c0((C93842a) null));
                    return false;
                } else if (!FTS5SearchContactLogic.this.f270854w.stopped()) {
                    return false;
                } else {
                    FTS5SearchContactLogic.this.f270854w.startTimer(updateSearchIndexAtOnceEvent.f9570d.f9571a);
                    Log.m105924i("MicroMsg.FTS.FTS5SearchContactLogic", "* Update contact at once triggered.");
                    return false;
                }
            }
        };
        this.f270852u = new IListener<UpdateLanguageEvent>(fVar) {
            {
                this.__eventId = -1874260055;
            }

            public boolean callback(IEvent iEvent) {
                UpdateLanguageEvent updateLanguageEvent = (UpdateLanguageEvent) iEvent;
                FTS5SearchContactLogic fTS5SearchContactLogic = FTS5SearchContactLogic.this;
                ((C93836i) fTS5SearchContactLogic.f270839e).mo128803c(65556, new C93860n(C99249c.f291011i));
                FTS5SearchContactLogic fTS5SearchContactLogic2 = FTS5SearchContactLogic.this;
                ((C93836i) fTS5SearchContactLogic2.f270839e).mo128803c(131093, new C93847c0((C93842a) null));
                return false;
            }
        };
        this.f270853v = new MTimerHandler(C86709a0.m107525e().getLooper(), (MTimerHandler.CallBack) new C93850e(), true);
        this.f270854w = new MTimerHandler(C86709a0.m107525e().getLooper(), (MTimerHandler.CallBack) new C93851f(), false);
    }

    /* renamed from: a */
    public boolean mo128809a() {
        Class cls = C75700k0.class;
        Class cls2 = C99260q.class;
        if (!((C99260q) C86312j.m106911c(cls2)).mo128758wd()) {
            Log.m105924i("MicroMsg.FTS.FTS5SearchContactLogic", "Create Fail!");
            return false;
        }
        Log.m105924i("MicroMsg.FTS.FTS5SearchContactLogic", "Create Success!");
        this.f270840f = (C101467b) ((C99260q) C86312j.m106911c(cls2)).db0(3);
        this.f270839e = ((C99260q) C86312j.m106911c(cls2)).mo128743Jd();
        this.f270841g = ((C99260q) C86312j.m106911c(cls2)).mo128761xc();
        this.f270842h = new HashSet<>();
        this.f270843i = new HashMap<>();
        this.f270844j = new HashMap<>();
        this.f270845n = new HashMap<>();
        try {
            Method declaredMethod = C53339k1.class.getDeclaredMethod("parseBuff", new Class[0]);
            this.f270846o = declaredMethod;
            declaredMethod.setAccessible(true);
            ((C93836i) this.f270839e).mo128803c(131072, new C93859m((C93842a) null));
            ((C93836i) this.f270839e).mo128803c(131082, new C93853h((C93842a) null));
            ((C93836i) this.f270839e).mo128803c(131092, new C93854i((C93842a) null));
            ((C93836i) this.f270839e).mo128803c(Integer.MAX_VALUE, new C93856j((C93842a) null));
            ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr().add(this.f270849r);
            ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().add(this.f270848q);
            ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku().add(this.f270847p);
            C35143a.m40571a(this.f270850s);
            this.f270853v.startTimer(600000);
            this.f270851t.alive();
            this.f270852u.alive();
            return true;
        } catch (NoSuchMethodException e) {
            AssertionFailedError assertionFailedError = new AssertionFailedError("Can't find BaseContact.parseBuff method, class prototype has changed.");
            assertionFailedError.initCause(e);
            throw assertionFailedError;
        }
    }

    /* renamed from: b */
    public boolean mo128810b() {
        Class cls = C75700k0.class;
        this.f270851t.dead();
        this.f270852u.dead();
        this.f270854w.stopTimer();
        this.f270853v.stopTimer();
        ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().remove(this.f270848q);
        ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr().remove(this.f270849r);
        ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku().remove(this.f270847p);
        MStorage.IOnStorageChange iOnStorageChange = this.f270850s;
        ((C67001a) ((C35638b) C86312j.m106911c(C35638b.class)).mo60195Jl()).getClass();
        C27740g.vx0().remove(iOnStorageChange);
        HashMap<String, List<Long>> hashMap = this.f270843i;
        if (hashMap != null) {
            hashMap.clear();
        }
        HashSet<String> hashSet = this.f270842h;
        if (hashSet != null) {
            hashSet.clear();
        }
        this.f270840f = null;
        this.f270839e = null;
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x01d2  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x01df  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01ee  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo128811c(java.lang.String r46, com.tencent.p014mm.storage.C72996z1 r47, java.lang.String[] r48, byte[] r49) {
        /*
            r45 = this;
            r1 = r45
            r2 = r48
            java.lang.String r3 = "MicroMsg.FTS.FTS5SearchContactLogic"
            java.lang.String r12 = r47.getNickname()
            java.lang.String r15 = r47.mo73969n2()
            r4 = 0
            java.lang.String r24 = kv1.C99251g.m129288i(r15, r4)
            r14 = 1
            java.lang.String r33 = kv1.C99251g.m129288i(r15, r14)
            java.lang.String r22 = kv1.C99251g.m129288i(r12, r4)
            java.lang.String r25 = kv1.C99251g.m129288i(r12, r14)
            kv1.m r0 = r1.f270841g
            com.tencent.mm.plugin.fts.g r0 = (com.tencent.p014mm.plugin.fts.C68985g) r0
            r13 = r46
            long r43 = r0.mo94941b(r13)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            if (r2 == 0) goto L_0x0213
            int r0 = r2.length
            if (r0 <= 0) goto L_0x0213
            int r0 = r2.length
            long r5 = (long) r0
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            aj.a r8 = new aj.a
            r8.<init>()
            r0 = r49
            r8.parseFrom(r0)     // Catch:{ Exception -> 0x0046 }
            goto L_0x0050
        L_0x0046:
            r0 = move-exception
            r9 = r0
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r14 = "parse chatroom data"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r9, r14, r0)
        L_0x0050:
            java.util.LinkedList<aj.b> r0 = r8.f106335d
            java.util.Iterator r0 = r0.iterator()
        L_0x0056:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L_0x0072
            java.lang.Object r8 = r0.next()
            aj.b r8 = (p788aj.C39608b) r8
            java.lang.String r9 = r8.f106344e
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r9 != 0) goto L_0x0056
            java.lang.String r9 = r8.f106343d
            java.lang.String r8 = r8.f106344e
            r7.put(r9, r8)
            goto L_0x0056
        L_0x0072:
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r9 = "SELECT rowid, username, alias, conRemark, nickname , lvbuff, type FROM rcontact WHERE username IN "
            r0.append(r9)
            java.util.HashMap<java.lang.String, java.lang.String> r9 = kv1.C99251g.f291026a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r14 = 256(0x100, float:3.59E-43)
            r9.<init>(r14)
            r14 = 40
            r9.append(r14)
            int r14 = r2.length
        L_0x0090:
            if (r4 >= r14) goto L_0x00b3
            r17 = r2[r4]
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r19 = r5
            java.lang.String r5 = android.database.DatabaseUtils.sqlEscapeString(r17)
            r11.append(r5)
            r5 = 44
            r11.append(r5)
            java.lang.String r5 = r11.toString()
            r9.append(r5)
            int r4 = r4 + 1
            r5 = r19
            goto L_0x0090
        L_0x00b3:
            r19 = r5
            int r4 = r9.length()
            int r4 = r4 + -1
            r5 = 41
            r9.setCharAt(r4, r5)
            java.lang.String r4 = r9.toString()
            r0.append(r4)
            java.lang.String r4 = ";"
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            kv1.m r4 = r1.f270841g
            r5 = 0
            com.tencent.mm.plugin.fts.g r4 = (com.tencent.p014mm.plugin.fts.C68985g) r4
            r6 = 2
            android.database.Cursor r4 = r4.mo94943d(r0, r5, r6)
        L_0x00da:
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x020c }
            if (r0 == 0) goto L_0x00f0
            com.tencent.mm.storage.z1 r0 = new com.tencent.mm.storage.z1     // Catch:{ all -> 0x020c }
            r0.<init>()     // Catch:{ all -> 0x020c }
            r0.convertFrom(r4)     // Catch:{ all -> 0x020c }
            java.lang.String r5 = r0.getUsername()     // Catch:{ all -> 0x020c }
            r8.put(r5, r0)     // Catch:{ all -> 0x020c }
            goto L_0x00da
        L_0x00f0:
            r4.close()
            r4 = 0
            r5 = 0
        L_0x00f5:
            int r0 = r2.length
            if (r4 >= r0) goto L_0x0202
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r9 = r2[r4]
            java.lang.Object r0 = r8.get(r9)
            r11 = r0
            com.tencent.mm.storage.z1 r11 = (com.tencent.p014mm.storage.C72996z1) r11
            java.lang.String r14 = "​"
            if (r11 != 0) goto L_0x012b
            r49 = r5
            r5 = 2
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r11 = 0
            r0[r11] = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r4)
            r5 = 1
            r0[r5] = r9
            java.lang.String r9 = "can not get chatroomMemberContact data memberUsername:%s i:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r9, r0)
            r6.append(r14)
            r5 = r49
            r17 = r8
            r21 = r15
            r13 = 1
            goto L_0x01f6
        L_0x012b:
            r49 = r5
            r5 = 0
            java.lang.String r0 = r11.mo73969n2()
            java.lang.String r2 = r11.getNickname()
            r17 = r8
            java.lang.String r8 = kv1.C99251g.m129288i(r0, r5)
            r5 = 1
            java.lang.String r13 = kv1.C99251g.m129288i(r0, r5)
            java.lang.String r5 = " "
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r5)
            r6.append(r0)
            r21 = r15
            java.lang.String r15 = "‌"
            r6.append(r15)
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r8, (java.lang.String) r5)
            r6.append(r0)
            r6.append(r15)
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r13, (java.lang.String) r5)
            r6.append(r0)
            r6.append(r15)
            r8 = 0
            java.lang.String r0 = kv1.C99251g.m129288i(r2, r8)
            r13 = 1
            java.lang.String r8 = kv1.C99251g.m129288i(r2, r13)
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r2, (java.lang.String) r5)
            r6.append(r2)
            r6.append(r15)
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r5)
            r6.append(r0)
            r6.append(r15)
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r8, (java.lang.String) r5)
            r6.append(r0)
            r6.append(r15)
            java.lang.Object r0 = r7.get(r9)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r5)
            r6.append(r0)
            r6.append(r15)
            java.lang.reflect.Method r0 = r1.f270846o     // Catch:{ Exception -> 0x01aa }
            r2 = 0
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x01a8 }
            r0.invoke(r11, r8)     // Catch:{ Exception -> 0x01a8 }
            goto L_0x01b3
        L_0x01a8:
            r0 = move-exception
            goto L_0x01ac
        L_0x01aa:
            r0 = move-exception
            r2 = 0
        L_0x01ac:
            java.lang.Object[] r8 = new java.lang.Object[r2]
            java.lang.String r2 = "Failed parsing RContact LVBuffer."
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r0, r2, r8)
        L_0x01b3:
            java.lang.String r0 = r11.f149513S0
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r5)
            r6.append(r0)
            r6.append(r15)
            boolean r0 = r11.mo62927s3()
            if (r0 == 0) goto L_0x01d2
            java.lang.String r0 = r11.mo62913l2()
            java.lang.String r0 = kv1.C99251g.m129285f(r9, r0)
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r5)
            goto L_0x01d3
        L_0x01d2:
            r0 = r5
        L_0x01d3:
            r6.append(r0)
            r6.append(r15)
            int r0 = r6.indexOf(r14)
            if (r0 < 0) goto L_0x01ee
            java.lang.String r0 = r6.toString()
            java.lang.String r0 = r0.replace(r14, r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r0)
            r5 = 1
            goto L_0x01f0
        L_0x01ee:
            r5 = r49
        L_0x01f0:
            r6.append(r14)
            r10.append(r6)
        L_0x01f6:
            int r4 = r4 + 1
            r13 = r46
            r2 = r48
            r8 = r17
            r15 = r21
            goto L_0x00f5
        L_0x0202:
            r49 = r5
            r21 = r15
            r13 = 1
            r0 = r49
            r2 = r19
            goto L_0x0219
        L_0x020c:
            r0 = move-exception
            if (r4 == 0) goto L_0x0212
            r4.close()
        L_0x0212:
            throw r0
        L_0x0213:
            r21 = r15
            r13 = 1
            r2 = 0
            r0 = 0
        L_0x0219:
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r4 != 0) goto L_0x026a
            rv1.b r4 = r1.f270840f
            r5 = 131075(0x20003, float:1.83675E-40)
            r6 = 5
            r11 = 2
            r7 = r2
            r9 = r46
            r15 = r10
            r14 = 2
            r10 = r43
            r4.mo138613n(r5, r6, r7, r9, r10, r12)
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r22)
            if (r4 != 0) goto L_0x024c
            rv1.b r4 = r1.f270840f
            r35 = 131075(0x20003, float:1.83675E-40)
            r36 = 6
            r34 = r4
            r37 = r2
            r39 = r46
            r40 = r43
            r42 = r22
            r34.mo138613n(r35, r36, r37, r39, r40, r42)
            r4 = 2
            goto L_0x024d
        L_0x024c:
            r4 = 1
        L_0x024d:
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r25)
            if (r5 != 0) goto L_0x026c
            rv1.b r5 = r1.f270840f
            r35 = 131075(0x20003, float:1.83675E-40)
            r36 = 7
            r34 = r5
            r37 = r2
            r39 = r46
            r40 = r43
            r42 = r25
            r34.mo138613n(r35, r36, r37, r39, r40, r42)
            int r4 = r4 + 1
            goto L_0x026c
        L_0x026a:
            r15 = r10
            r4 = 0
        L_0x026c:
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r21)
            if (r5 != 0) goto L_0x02bf
            rv1.b r5 = r1.f270840f
            r14 = 131075(0x20003, float:1.83675E-40)
            r6 = 1
            r7 = 1
            r13 = r5
            r5 = 1
            r8 = r15
            r7 = r21
            r15 = r6
            r16 = r2
            r18 = r46
            r19 = r43
            r13.mo138613n(r14, r15, r16, r18, r19, r21)
            int r4 = r4 + 1
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r22)
            if (r6 != 0) goto L_0x02a4
            rv1.b r6 = r1.f270840f
            r17 = 131075(0x20003, float:1.83675E-40)
            r18 = 2
            r16 = r6
            r19 = r2
            r21 = r46
            r22 = r43
            r16.mo138613n(r17, r18, r19, r21, r22, r24)
            int r4 = r4 + 1
        L_0x02a4:
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r25)
            if (r6 != 0) goto L_0x02c1
            rv1.b r6 = r1.f270840f
            r26 = 131075(0x20003, float:1.83675E-40)
            r27 = 3
            r25 = r6
            r28 = r2
            r30 = r46
            r31 = r43
            r25.mo138613n(r26, r27, r28, r30, r31, r33)
            int r4 = r4 + 1
            goto L_0x02c1
        L_0x02bf:
            r8 = r15
            r5 = 1
        L_0x02c1:
            int r6 = r8.length()
            if (r6 <= 0) goto L_0x02e7
            int r6 = r8.length()
            int r6 = r6 - r5
            r8.setLength(r6)
            rv1.b r5 = r1.f270840f
            r35 = 131075(0x20003, float:1.83675E-40)
            r36 = 38
            java.lang.String r42 = r8.toString()
            r34 = r5
            r37 = r2
            r39 = r46
            r40 = r43
            r34.mo138613n(r35, r36, r37, r39, r40, r42)
            int r4 = r4 + 1
        L_0x02e7:
            if (r0 == 0) goto L_0x02f5
            kj2.d r5 = kj2.C117407d.INSTANCE
            r6 = 146(0x92, double:7.2E-322)
            r8 = 29
            r10 = 1
            r12 = 0
            r5.idkeyStat(r6, r8, r10, r12)
        L_0x02f5:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.fts.logic.FTS5SearchContactLogic.mo128811c(java.lang.String, com.tencent.mm.storage.z1, java.lang.String[], byte[]):int");
    }

    /* renamed from: d */
    public int mo128812d(C72996z1 z1Var) {
        int i;
        byte[] bArr;
        String str;
        if (!C72996z1.m85820U5(z1Var.getUsername())) {
            return mo128813e(z1Var);
        }
        Cursor d = ((C68985g) this.f270841g).mo94943d(String.format("SELECT memberlist, roomdata, chatroomStatus FROM %s WHERE chatroomname = ?", new Object[]{"chatroom"}), new String[]{z1Var.getUsername()}, 2);
        try {
            if (d.moveToNext()) {
                str = d.getString(0);
                bArr = d.getBlob(1);
                i = d.getInt(2);
            } else {
                str = null;
                bArr = null;
                i = 0;
            }
            d.close();
            if (!Util.isNullOrNil(str) && bArr != null && Util.nullAs(str, "").contains(C75592q0.m90789s())) {
                IAutoDBItem.MAutoDBInfo mAutoDBInfo = C44661m1.f121082x1;
                if (!((((long) i) & 2) == 2)) {
                    String[] split = C99249c.C99250a.f291019a.split(str);
                    Arrays.sort(split, new C93852g(this));
                    int i2 = mo128818i(z1Var.getUsername(), split);
                    if (i2 > 0) {
                        Log.m105925i("MicroMsg.FTS.FTS5SearchContactLogic", "updateChatroomMember %s %d", z1Var.getUsername(), Integer.valueOf(i2));
                    }
                    return mo128811c(z1Var.getUsername(), z1Var, split, bArr);
                }
            }
            Log.m105925i("MicroMsg.FTS.FTS5SearchContactLogic", "error chatroom data %s", z1Var.getUsername());
            int i3 = mo128818i(z1Var.getUsername(), (String[]) null);
            if (i3 > 0) {
                Log.m105925i("MicroMsg.FTS.FTS5SearchContactLogic", "updateChatroomMember %s %d", z1Var.getUsername(), Integer.valueOf(i3));
            }
            return 0;
        } catch (Throwable th) {
            if (d != null) {
                d.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x02f8  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0309  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x031c  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0376  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0412  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0439  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x044b  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0456  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0469  */
    /* JADX WARNING: Removed duplicated region for block: B:213:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x025a  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x026e  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x027b  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0288  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x029a  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo128813e(com.tencent.p014mm.storage.C72996z1 r45) {
        /*
            r44 = this;
            r1 = r44
            r2 = r45
            long r12 = r2.f108320R1
            java.lang.String r0 = r45.getUsername()
            java.lang.String r14 = r45.mo62913l2()
            java.lang.String r15 = r45.getNickname()
            r11 = 0
            java.lang.String r16 = kv1.C99251g.m129288i(r15, r11)
            r9 = 1
            java.lang.String r17 = kv1.C99251g.m129288i(r15, r9)
            java.lang.String r10 = r45.mo73969n2()
            java.lang.String r18 = kv1.C99251g.m129288i(r10, r11)
            java.lang.String r19 = kv1.C99251g.m129288i(r10, r9)
            java.lang.String r8 = r2.f149513S0
            java.lang.String r3 = r45.mo73974r2()
            java.lang.String r6 = r2.f149525Y0
            int r4 = r45.mo73953E2()
            long r20 = java.lang.System.currentTimeMillis()
            int r5 = com.tencent.p014mm.storage.C72996z1.f214113Y1
            r4 = r4 & 8
            java.lang.String r24 = ""
            java.lang.String r5 = "​"
            r26 = 0
            if (r4 == 0) goto L_0x0059
            java.lang.Class<ug.z> r3 = p248ug.C52574z.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            ug.z r3 = (p248ug.C52574z) r3
            java.util.ArrayList r3 = r3.mo73533Qp(r0)
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.listToString(r3, r5)
            r4 = 131076(0x20004, float:1.83677E-40)
            goto L_0x0064
        L_0x0059:
            boolean r4 = com.tencent.p014mm.storage.C72996z1.m85843n5(r0)
            if (r4 == 0) goto L_0x0072
            r3 = r24
            r4 = 131081(0x20009, float:1.83684E-40)
        L_0x0064:
            r33 = r5
            r22 = r6
            r23 = r8
            r27 = r10
            r28 = r15
            r15 = 0
            r5 = r4
            goto L_0x0248
        L_0x0072:
            kv1.m r4 = r1.f270841g
            com.tencent.mm.plugin.fts.g r4 = (com.tencent.p014mm.plugin.fts.C68985g) r4
            long r20 = r4.mo94941b(r0)
            if (r3 == 0) goto L_0x0239
            int r4 = r3.length()
            if (r4 <= 0) goto L_0x0239
            java.lang.String r4 = "\u0000"
            boolean r4 = r3.endsWith(r4)
            if (r4 == 0) goto L_0x0093
            int r4 = r3.length()
            int r4 = r4 - r9
            java.lang.String r3 = r3.substring(r11, r4)
        L_0x0093:
            int r4 = r3.length()
            if (r4 != 0) goto L_0x00a2
            r29 = r6
            r31 = r8
            r30 = r10
            r11 = 2
            goto L_0x01fb
        L_0x00a2:
            java.util.regex.Pattern r4 = kv1.C99249c.C99250a.f291025g
            java.lang.String[] r4 = r4.split(r3)
            int r7 = r4.length
            if (r7 == 0) goto L_0x00d8
            java.util.ArrayList r7 = new java.util.ArrayList
            int r11 = r4.length
            r7.<init>(r11)
            int r11 = r4.length
            r9 = 0
        L_0x00b3:
            if (r9 >= r11) goto L_0x00d3
            r29 = r6
            r6 = r4[r9]
            r30 = r10
            r31 = r11
            r10 = 0
            long r10 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r6, r10)
            java.lang.Long r6 = java.lang.Long.valueOf(r10)
            r7.add(r6)
            int r9 = r9 + 1
            r6 = r29
            r10 = r30
            r11 = r31
            goto L_0x00b3
        L_0x00d3:
            r29 = r6
            r30 = r10
            goto L_0x00de
        L_0x00d8:
            r29 = r6
            r30 = r10
            r7 = r26
        L_0x00de:
            java.util.HashMap<java.lang.String, java.util.List<java.lang.Long>> r4 = r1.f270845n
            java.lang.Object r4 = r4.get(r0)
            java.util.List r4 = (java.util.List) r4
            if (r4 != 0) goto L_0x0161
            rv1.b r4 = r1.f270840f
            com.tencent.wcdb.database.SQLiteStatement r6 = r4.f297168w
            r9 = 1
            r6.bindString(r9, r0)
            com.tencent.wcdb.database.SQLiteStatement r4 = r4.f297168w
            r4.execute()
            if (r7 == 0) goto L_0x015b
            boolean r4 = r7.isEmpty()
            if (r4 != 0) goto L_0x015b
            rv1.b r4 = r1.f270840f
            r4.getClass()
            boolean r6 = r7.isEmpty()
            if (r6 == 0) goto L_0x010b
            r31 = r8
            goto L_0x0155
        L_0x010b:
            kv1.k r6 = r4.f290993f
            com.tencent.mm.plugin.fts.f r6 = (com.tencent.p014mm.plugin.fts.C93834f) r6
            boolean r6 = r6.mo128796m()
            if (r6 != 0) goto L_0x011c
            kv1.k r9 = r4.f290993f
            com.tencent.mm.plugin.fts.f r9 = (com.tencent.p014mm.plugin.fts.C93834f) r9
            r9.mo128785a()
        L_0x011c:
            com.tencent.wcdb.database.SQLiteStatement r9 = r4.f297166u
            r10 = 1
            r9.bindString(r10, r0)
            java.util.Iterator r9 = r7.iterator()
        L_0x0126:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x014a
            java.lang.Object r10 = r9.next()
            java.lang.Long r10 = (java.lang.Long) r10
            long r10 = r10.longValue()
            r31 = r8
            com.tencent.wcdb.database.SQLiteStatement r8 = r4.f297166u
            r32 = r9
            r9 = 2
            r8.bindLong(r9, r10)
            com.tencent.wcdb.database.SQLiteStatement r8 = r4.f297166u
            r8.execute()
            r8 = r31
            r9 = r32
            goto L_0x0126
        L_0x014a:
            r31 = r8
            if (r6 != 0) goto L_0x0155
            kv1.k r4 = r4.f290993f
            com.tencent.mm.plugin.fts.f r4 = (com.tencent.p014mm.plugin.fts.C93834f) r4
            r4.mo128788d()
        L_0x0155:
            java.util.HashMap<java.lang.String, java.util.List<java.lang.Long>> r4 = r1.f270845n
            r4.put(r0, r7)
            goto L_0x015d
        L_0x015b:
            r31 = r8
        L_0x015d:
            r9 = 1
            r11 = 2
            goto L_0x01ea
        L_0x0161:
            r31 = r8
            if (r7 == 0) goto L_0x01d7
            boolean r6 = r7.isEmpty()
            if (r6 == 0) goto L_0x016c
            goto L_0x01d7
        L_0x016c:
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>(r4)
            java.util.Iterator r4 = r7.iterator()
        L_0x0175:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L_0x01a7
            java.lang.Object r8 = r4.next()
            java.lang.Long r8 = (java.lang.Long) r8
            long r8 = r8.longValue()
            java.lang.Long r10 = java.lang.Long.valueOf(r8)
            boolean r10 = r6.remove(r10)
            if (r10 != 0) goto L_0x0175
            rv1.b r10 = r1.f270840f
            com.tencent.wcdb.database.SQLiteStatement r11 = r10.f297166u
            r32 = r4
            r4 = 1
            r11.bindString(r4, r0)
            com.tencent.wcdb.database.SQLiteStatement r4 = r10.f297166u
            r11 = 2
            r4.bindLong(r11, r8)
            com.tencent.wcdb.database.SQLiteStatement r4 = r10.f297166u
            r4.execute()
            r4 = r32
            goto L_0x0175
        L_0x01a7:
            java.util.Iterator r4 = r6.iterator()
        L_0x01ab:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x01cf
            java.lang.Object r6 = r4.next()
            java.lang.Long r6 = (java.lang.Long) r6
            long r8 = r6.longValue()
            rv1.b r6 = r1.f270840f
            com.tencent.wcdb.database.SQLiteStatement r10 = r6.f297167v
            r11 = 1
            r10.bindString(r11, r0)
            com.tencent.wcdb.database.SQLiteStatement r10 = r6.f297167v
            r11 = 2
            r10.bindLong(r11, r8)
            com.tencent.wcdb.database.SQLiteStatement r6 = r6.f297167v
            r6.execute()
            goto L_0x01ab
        L_0x01cf:
            r11 = 2
            java.util.HashMap<java.lang.String, java.util.List<java.lang.Long>> r4 = r1.f270845n
            r4.put(r0, r7)
            r9 = 1
            goto L_0x01ea
        L_0x01d7:
            r11 = 2
            rv1.b r4 = r1.f270840f
            com.tencent.wcdb.database.SQLiteStatement r6 = r4.f297168w
            r9 = 1
            r6.bindString(r9, r0)
            com.tencent.wcdb.database.SQLiteStatement r4 = r4.f297168w
            r4.execute()
            java.util.HashMap<java.lang.String, java.util.List<java.lang.Long>> r4 = r1.f270845n
            r4.remove(r0)
        L_0x01ea:
            kv1.m r4 = r1.f270841g
            com.tencent.mm.plugin.fts.g r4 = (com.tencent.p014mm.plugin.fts.C68985g) r4
            java.util.List r3 = r4.mo94942c(r3)
            r4 = r3
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            int r4 = r4.size()
            if (r4 != 0) goto L_0x0208
        L_0x01fb:
            r33 = r5
            r28 = r15
            r22 = r29
            r27 = r30
            r23 = r31
            r11 = 0
            r15 = 0
            goto L_0x022f
        L_0x0208:
            java.lang.String r25 = com.tencent.p014mm.sdk.platformtools.Util.listToString(r3, r5)
            rv1.b r3 = r1.f270840f
            r4 = 131072(0x20000, float:1.83671E-40)
            r6 = 11
            r7 = r5
            r8 = 2
            r10 = 131076(0x20004, float:1.83677E-40)
            r11 = 131072(0x20000, float:1.83671E-40)
            r5 = r6
            r33 = r7
            r22 = r29
            r6 = r12
            r23 = r31
            r8 = r0
            r27 = r30
            r9 = r20
            r28 = r15
            r15 = 0
            r11 = r25
            r3.mo138613n(r4, r5, r6, r8, r9, r11)
            r11 = 1
        L_0x022f:
            int r11 = r11 + r15
            r40 = r20
            r9 = 131072(0x20000, float:1.83671E-40)
            r20 = r11
            r11 = r24
            goto L_0x024e
        L_0x0239:
            r33 = r5
            r22 = r6
            r23 = r8
            r27 = r10
            r28 = r15
            r15 = 0
            r3 = r24
            r5 = 131072(0x20000, float:1.83671E-40)
        L_0x0248:
            r11 = r3
            r9 = r5
            r40 = r20
            r20 = 0
        L_0x024e:
            java.lang.String r14 = kv1.C99251g.m129285f(r0, r14)
            if (r14 == 0) goto L_0x026e
            int r3 = r14.length()
            if (r3 == 0) goto L_0x026e
            rv1.b r3 = r1.f270840f
            r5 = 15
            r4 = r9
            r6 = r12
            r8 = r0
            r21 = r9
            r9 = r40
            r25 = r11
            r11 = r14
            r3.mo138613n(r4, r5, r6, r8, r9, r11)
            int r20 = r20 + 1
            goto L_0x0272
        L_0x026e:
            r21 = r9
            r25 = r11
        L_0x0272:
            if (r27 == 0) goto L_0x0288
            int r3 = r27.length()
            if (r3 != 0) goto L_0x027b
            goto L_0x0288
        L_0x027b:
            r9 = r16
            r10 = r17
            r3 = r18
            r4 = r19
            r11 = r27
            r14 = r28
            goto L_0x0292
        L_0x0288:
            r3 = r16
            r4 = r17
            r9 = r26
            r10 = r9
            r14 = r10
            r11 = r28
        L_0x0292:
            if (r11 == 0) goto L_0x02f8
            int r5 = r11.length()
            if (r5 == 0) goto L_0x02f8
            boolean r5 = r11.equalsIgnoreCase(r3)
            if (r5 == 0) goto L_0x02a3
            r8 = r26
            goto L_0x02a4
        L_0x02a3:
            r8 = r3
        L_0x02a4:
            if (r8 == 0) goto L_0x02b6
            int r3 = r8.length()
            if (r3 == 0) goto L_0x02b6
            boolean r3 = r8.equalsIgnoreCase(r4)
            if (r3 == 0) goto L_0x02b3
            goto L_0x02b6
        L_0x02b3:
            r16 = r4
            goto L_0x02b8
        L_0x02b6:
            r16 = r26
        L_0x02b8:
            rv1.b r3 = r1.f270840f
            r5 = 1
            r4 = r21
            r6 = r12
            r17 = r8
            r8 = r0
            r15 = r9
            r43 = r10
            r9 = r40
            r3.mo138613n(r4, r5, r6, r8, r9, r11)
            if (r17 == 0) goto L_0x02df
            int r3 = r17.length()
            if (r3 == 0) goto L_0x02df
            rv1.b r3 = r1.f270840f
            r5 = 2
            r4 = r21
            r6 = r12
            r8 = r0
            r9 = r40
            r11 = r17
            r3.mo138613n(r4, r5, r6, r8, r9, r11)
        L_0x02df:
            if (r16 == 0) goto L_0x02f5
            int r3 = r16.length()
            if (r3 == 0) goto L_0x02f5
            rv1.b r3 = r1.f270840f
            r5 = 3
            r4 = r21
            r6 = r12
            r8 = r0
            r9 = r40
            r11 = r16
            r3.mo138613n(r4, r5, r6, r8, r9, r11)
        L_0x02f5:
            int r20 = r20 + 3
            goto L_0x02fb
        L_0x02f8:
            r15 = r9
            r43 = r10
        L_0x02fb:
            if (r14 == 0) goto L_0x0358
            int r3 = r14.length()
            if (r3 == 0) goto L_0x0358
            boolean r3 = r14.equalsIgnoreCase(r15)
            if (r3 == 0) goto L_0x030b
            r15 = r26
        L_0x030b:
            if (r15 == 0) goto L_0x031e
            int r3 = r15.length()
            if (r3 == 0) goto L_0x031e
            r3 = r43
            boolean r4 = r15.equalsIgnoreCase(r3)
            if (r4 == 0) goto L_0x031c
            goto L_0x031e
        L_0x031c:
            r26 = r3
        L_0x031e:
            rv1.b r3 = r1.f270840f
            r5 = 5
            r4 = r21
            r6 = r12
            r8 = r0
            r9 = r40
            r11 = r14
            r3.mo138613n(r4, r5, r6, r8, r9, r11)
            if (r15 == 0) goto L_0x0340
            int r3 = r15.length()
            if (r3 == 0) goto L_0x0340
            rv1.b r3 = r1.f270840f
            r5 = 6
            r4 = r21
            r6 = r12
            r8 = r0
            r9 = r40
            r11 = r15
            r3.mo138613n(r4, r5, r6, r8, r9, r11)
        L_0x0340:
            if (r26 == 0) goto L_0x0356
            int r3 = r26.length()
            if (r3 == 0) goto L_0x0356
            rv1.b r3 = r1.f270840f
            r5 = 7
            r4 = r21
            r6 = r12
            r8 = r0
            r9 = r40
            r11 = r26
            r3.mo138613n(r4, r5, r6, r8, r9, r11)
        L_0x0356:
            int r20 = r20 + 3
        L_0x0358:
            if (r23 == 0) goto L_0x0370
            int r3 = r23.length()
            if (r3 <= 0) goto L_0x0370
            rv1.b r3 = r1.f270840f
            r5 = 4
            r4 = r21
            r6 = r12
            r8 = r0
            r9 = r40
            r11 = r23
            r3.mo138613n(r4, r5, r6, r8, r9, r11)
            int r20 = r20 + 1
        L_0x0370:
            r14 = r21
            r3 = 131072(0x20000, float:1.83671E-40)
            if (r14 != r3) goto L_0x0412
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r22)
            if (r3 != 0) goto L_0x0398
            java.lang.String r3 = com.tencent.p014mm.contact.C1233a.m1355b(r45)
            r4 = r22
            r15 = r33
            java.lang.String r11 = r4.replace(r3, r15)
            rv1.b r3 = r1.f270840f
            r5 = 16
            r4 = r14
            r6 = r12
            r8 = r0
            r9 = r40
            r3.mo138613n(r4, r5, r6, r8, r9, r11)
            int r20 = r20 + 1
            r15 = 1
            goto L_0x03d3
        L_0x0398:
            r15 = r33
            kv1.m r3 = r1.f270841g
            r11 = 1
            java.lang.String[] r4 = new java.lang.String[r11]
            r5 = 0
            r4[r5] = r0
            com.tencent.mm.plugin.fts.g r3 = (com.tencent.p014mm.plugin.fts.C68985g) r3
            java.lang.String r6 = "SELECT moblie FROM addr_upload2 WHERE username=?;"
            r7 = 2
            android.database.Cursor r9 = r3.mo94943d(r6, r4, r7)
            boolean r3 = r9.moveToFirst()
            if (r3 == 0) goto L_0x03cb
            java.lang.String r16 = r9.getString(r5)
            rv1.b r3 = r1.f270840f
            r5 = 16
            r4 = r14
            r6 = r12
            r8 = r0
            r17 = r9
            r9 = r40
            r33 = r15
            r15 = 1
            r11 = r16
            r3.mo138613n(r4, r5, r6, r8, r9, r11)
            int r20 = r20 + 1
            goto L_0x03d0
        L_0x03cb:
            r17 = r9
            r33 = r15
            r15 = 1
        L_0x03d0:
            r17.close()
        L_0x03d3:
            java.lang.String r3 = r2.f149518V
            java.util.Set<java.lang.String> r4 = f270838x
            java.util.HashSet r4 = (java.util.HashSet) r4
            boolean r4 = r4.contains(r3)
            if (r4 == 0) goto L_0x03e2
            r11 = r24
            goto L_0x03e3
        L_0x03e2:
            r11 = r3
        L_0x03e3:
            if (r11 == 0) goto L_0x03f9
            int r3 = r11.length()
            if (r3 == 0) goto L_0x03f9
            rv1.b r3 = r1.f270840f
            r5 = 18
            r4 = r14
            r6 = r12
            r8 = r0
            r9 = r40
            r3.mo138613n(r4, r5, r6, r8, r9, r11)
            int r20 = r20 + 1
        L_0x03f9:
            java.lang.String r11 = r2.f149520W
            if (r11 == 0) goto L_0x0413
            int r3 = r11.length()
            if (r3 == 0) goto L_0x0413
            rv1.b r3 = r1.f270840f
            r5 = 17
            r4 = r14
            r6 = r12
            r8 = r0
            r9 = r40
            r3.mo138613n(r4, r5, r6, r8, r9, r11)
            int r20 = r20 + 1
            goto L_0x0413
        L_0x0412:
            r15 = 1
        L_0x0413:
            r3 = 131076(0x20004, float:1.83677E-40)
            if (r14 != r3) goto L_0x0464
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r25)
            if (r3 != 0) goto L_0x0464
            rv1.b r3 = r1.f270840f
            r5 = 19
            r4 = r14
            r6 = r12
            r8 = r0
            r9 = r40
            r11 = r25
            r3.mo138613n(r4, r5, r6, r8, r9, r11)
            int r20 = r20 + 1
            r3 = 0
            java.lang.String r16 = kv1.C99251g.m129288i(r11, r3)
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r16)
            if (r3 != 0) goto L_0x044b
            rv1.b r3 = r1.f270840f
            r5 = 20
            r4 = r14
            r6 = r12
            r8 = r0
            r9 = r40
            r2 = r11
            r11 = r16
            r3.mo138613n(r4, r5, r6, r8, r9, r11)
            int r20 = r20 + 1
            goto L_0x044c
        L_0x044b:
            r2 = r11
        L_0x044c:
            java.lang.String r11 = kv1.C99251g.m129288i(r2, r15)
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r2 != 0) goto L_0x0464
            rv1.b r3 = r1.f270840f
            r5 = 21
            r4 = r14
            r6 = r12
            r8 = r0
            r9 = r40
            r3.mo138613n(r4, r5, r6, r8, r9, r11)
            int r20 = r20 + 1
        L_0x0464:
            r0 = 131081(0x20009, float:1.83684E-40)
            if (r14 != r0) goto L_0x0519
            r2 = r45
            java.lang.String r0 = r2.f149532d1
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r3 != 0) goto L_0x0515
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x04a1 }
            r4.<init>(r0)     // Catch:{ JSONException -> 0x04a1 }
            java.lang.String r0 = "custom_info"
            org.json.JSONArray r0 = r4.optJSONArray(r0)     // Catch:{ JSONException -> 0x04a1 }
            if (r0 != 0) goto L_0x0486
            goto L_0x049f
        L_0x0486:
            r11 = 0
        L_0x0487:
            int r4 = r0.length()     // Catch:{ JSONException -> 0x04a1 }
            if (r11 >= r4) goto L_0x049f
            org.json.JSONObject r4 = r0.getJSONObject(r11)     // Catch:{ JSONException -> 0x04a1 }
            he0.l r5 = new he0.l     // Catch:{ JSONException -> 0x04a1 }
            r5.<init>()     // Catch:{ JSONException -> 0x04a1 }
            r5.mo106375a(r4)     // Catch:{ JSONException -> 0x04a1 }
            r3.add(r5)     // Catch:{ JSONException -> 0x04a1 }
            int r11 = r11 + 1
            goto L_0x0487
        L_0x049f:
            r4 = 0
            goto L_0x04ad
        L_0x04a1:
            r0 = move-exception
            r4 = 0
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.String r6 = "MicroMsg.OpenIMCustomDetail"
            java.lang.String r7 = "parse"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r0, r7, r5)
        L_0x04ad:
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            r11 = 0
        L_0x04b3:
            int r5 = r3.size()
            if (r11 >= r5) goto L_0x04f1
            java.lang.Object r5 = r3.get(r11)
            he0.l r5 = (he0.C76159l) r5
            java.util.List<he0.m> r5 = r5.f223089b
            java.util.Iterator r5 = r5.iterator()
        L_0x04c5:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x04e9
            java.lang.Object r6 = r5.next()
            he0.m r6 = (he0.C76160m) r6
            java.lang.String r7 = r45.mo73980x2()
            java.lang.String r6 = r6.mo106376a(r7)
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r7 != 0) goto L_0x04c5
            r0.append(r6)
            java.lang.String r6 = "‌"
            r0.append(r6)
            goto L_0x04c5
        L_0x04e9:
            r6 = r33
            r0.append(r6)
            int r11 = r11 + 1
            goto L_0x04b3
        L_0x04f1:
            java.lang.String r3 = r0.toString()
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x0516
            rv1.b r3 = r1.f270840f
            r35 = 131081(0x20009, float:1.83684E-40)
            r36 = 51
            long r4 = r2.f108320R1
            java.lang.String r39 = r45.getUsername()
            java.lang.String r42 = r0.toString()
            r34 = r3
            r37 = r4
            r34.mo138613n(r35, r36, r37, r39, r40, r42)
            r11 = 1
            goto L_0x0517
        L_0x0515:
            r4 = 0
        L_0x0516:
            r11 = 0
        L_0x0517:
            int r20 = r20 + r11
        L_0x0519:
            return r20
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.fts.logic.FTS5SearchContactLogic.mo128813e(com.tencent.mm.storage.z1):int");
    }

    /* renamed from: f */
    public boolean mo128814f(String str) {
        return !Util.isNullOrNil(str) && !str.endsWith("@stranger") && !str.endsWith("@qqim") && !str.endsWith("@app") && !C72996z1.m85846q5(str) && !str.endsWith("@gamelifesess") && !str.endsWith("@gamelife") && !str.endsWith("@gamelifehistory");
    }

    /* renamed from: g */
    public boolean mo128815g(C72996z1 z1Var) {
        String username = z1Var.getUsername();
        if (!mo128817h(z1Var) || !mo128814f(username) || C72996z1.m85817T4(username) || C72996z1.m85823W4(username)) {
            return false;
        }
        if (z1Var.mo62927s3()) {
            return true;
        }
        if (z1Var.mo62924q3() || z1Var.mo62916m3()) {
            return false;
        }
        C68985g gVar = (C68985g) this.f270841g;
        gVar.getClass();
        Cursor d = gVar.mo94943d(String.format("SELECT 1 FROM rconversation WHERE username = ?", new Object[0]), new String[]{username}, 2);
        try {
            boolean moveToNext = d.moveToNext();
            d.close();
            return moveToNext;
        } catch (Throwable th) {
            if (d != null) {
                d.close();
            }
            throw th;
        }
    }

    public String getName() {
        return "FTS5SearchContactLogic";
    }

    /* renamed from: h */
    public boolean mo128817h(C72996z1 z1Var) {
        if ((z1Var.mo62936v3() && !"notifymessage".equals(z1Var.getUsername())) || z1Var.mo62920o3() || z1Var.mo73975s2() != 0) {
            return false;
        }
        if (!z1Var.mo62927s3()) {
            return !z1Var.mo62924q3() && !z1Var.mo62916m3();
        }
        return true;
    }

    /* renamed from: i */
    public int mo128818i(String str, String[] strArr) {
        int i;
        String[] strArr2 = this.f270844j.get(str);
        this.f270840f.mo138598a();
        if (strArr2 == null) {
            C101467b bVar = this.f270840f;
            bVar.f297165t.bindString(1, str);
            bVar.f297165t.execute();
            i = ((int) this.f270840f.f297169x.simpleQueryForLong()) + 0;
            if (strArr != null) {
                this.f270840f.mo140965A(str, strArr);
                this.f270844j.put(str, strArr);
                i += strArr.length;
            }
        } else if (strArr == null) {
            C101467b bVar2 = this.f270840f;
            bVar2.f297165t.bindString(1, str);
            bVar2.f297165t.execute();
            i = ((int) this.f270840f.f297169x.simpleQueryForLong()) + 0;
            this.f270844j.remove(str);
        } else {
            HashSet hashSet = new HashSet(Arrays.asList(strArr2));
            int i2 = 0;
            for (String str2 : strArr) {
                if (!hashSet.remove(str2)) {
                    C101467b bVar3 = this.f270840f;
                    bVar3.f297163r.bindString(1, str);
                    bVar3.f297163r.bindString(2, str2);
                    bVar3.f297163r.execute();
                    i2++;
                }
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                C101467b bVar4 = this.f270840f;
                bVar4.f297164s.bindString(1, str);
                bVar4.f297164s.bindString(2, (String) it.next());
                bVar4.f297164s.execute();
                i2++;
            }
            this.f270844j.put(str, strArr);
            i = i2;
        }
        this.f270840f.mo138600c();
        return i;
    }

    /* renamed from: l4 */
    public C99664b mo128819l4(C76728k kVar) {
        C99664b bVar;
        int i = kVar.f224467b;
        if (i == 12) {
            bVar = new C93867u(kVar);
        } else if (i == 16) {
            bVar = new C93873y(kVar);
        } else if (i == 32) {
            bVar = new C93870v(kVar);
        } else if (i == 48) {
            bVar = new C93845b0(kVar);
        } else if (i == 64) {
            bVar = new C93843a0(kVar);
        } else if (i != 96) {
            switch (i) {
                case 5:
                    bVar = new C93865s(kVar);
                    break;
                case 6:
                    bVar = new C93864r(kVar);
                    break;
                case 7:
                    bVar = new C93866t(kVar);
                    break;
                case 8:
                    bVar = new C93871w(kVar);
                    break;
                case 9:
                    bVar = new C93872x(kVar);
                    break;
                default:
                    bVar = new C93863q(kVar);
                    break;
            }
        } else {
            bVar = new C93874z(kVar);
        }
        return ((C93836i) this.f270839e).mo128803c(-65536, bVar);
    }
}
