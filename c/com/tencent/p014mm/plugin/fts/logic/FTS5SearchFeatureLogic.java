package com.tencent.p014mm.plugin.fts.logic;

import a70.C112760b;
import android.database.Cursor;
import android.database.CursorWrapper;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.CheckResUpdateCacheFileEvent;
import com.tencent.p014mm.autogen.events.UpdateLanguageEvent;
import com.tencent.p014mm.plugin.fts.C93824b;
import com.tencent.p014mm.plugin.fts.C93834f;
import com.tencent.p014mm.plugin.fts.C93836i;
import com.tencent.p014mm.plugin.fts.PluginFTS;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.sdk.platformtools.WeChatSomeFeatureSwitch;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kv1.C76636p;
import kv1.C99248b;
import kv1.C99249c;
import kv1.C99251g;
import kv1.C99260q;
import lv1.C10656l;
import lv1.C76727e;
import lv1.C76728k;
import lv1.C99664b;
import lv1.C99672i;
import lv1.C99678j;
import lv1.C99681n;
import lv1.C99682o;
import lv1.C99683p;
import rv1.C101468c;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.fts.logic.FTS5SearchFeatureLogic */
public class FTS5SearchFeatureLogic extends C99248b {

    /* renamed from: e */
    public C76636p f270922e;

    /* renamed from: f */
    public C101468c f270923f;

    /* renamed from: g */
    public IListener f270924g;

    /* renamed from: h */
    public IListener<CheckResUpdateCacheFileEvent> f270925h;

    /* renamed from: com.tencent.mm.plugin.fts.logic.FTS5SearchFeatureLogic$a */
    public class C93877a extends C99664b {

        /* renamed from: j */
        public int f270928j;

        /* renamed from: n */
        public int f270929n;

        public C93877a(C938751 r2) {
        }

        /* renamed from: b */
        public boolean mo57099b() {
            List list;
            Class cls = PluginFTS.class;
            Log.m105924i("MicroMsg.FTS.FTS5SearchFeatureLogic", "start to build feature index task");
            C101468c cVar = FTS5SearchFeatureLogic.this.f270923f;
            cVar.getClass();
            ArrayList arrayList = new ArrayList();
            Cursor o = ((C93834f) cVar.f290993f).mo128798o(String.format("SELECT * FROM Feature", new Object[0]), (String[]) null);
            while (((CursorWrapper) o).moveToNext()) {
                C76727e eVar = new C76727e();
                eVar.convertFrom(o);
                arrayList.add(eVar);
            }
            ((C93824b) o).close();
            int size = arrayList.size();
            List<C76727e> list2 = arrayList;
            if (size == 0) {
                try {
                    list = arrayList;
                    List c = FTS5SearchFeatureLogic.m118586c(FTS5SearchFeatureLogic.this, FTS5SearchFeatureLogic.m118587d().mo119971i());
                    FTS5SearchFeatureLogic.this.f270923f.mo140969B(c);
                    list2 = c;
                    list = c;
                } catch (Exception unused) {
                    list2 = list;
                }
            }
            C101468c cVar2 = FTS5SearchFeatureLogic.this.f270923f;
            cVar2.getClass();
            ArrayList arrayList2 = new ArrayList();
            HashSet hashSet = new HashSet();
            Cursor o2 = ((C93834f) cVar2.f290993f).mo128798o(String.format("SELECT entity_id, timestamp FROM %s", new Object[]{cVar2.mo138611l()}), (String[]) null);
            while (true) {
                CursorWrapper cursorWrapper = (CursorWrapper) o2;
                if (!cursorWrapper.moveToNext()) {
                    break;
                }
                int i = cursorWrapper.getInt(0);
                if (hashSet.add(Integer.valueOf(i))) {
                    C101468c.C101469a aVar = new C101468c.C101469a();
                    aVar.f297171a = i;
                    aVar.f297172b = cursorWrapper.getLong(1);
                    arrayList2.add(aVar);
                }
            }
            ((C93824b) o2).close();
            HashMap hashMap = new HashMap();
            for (C76727e eVar2 : list2) {
                hashMap.put(Integer.valueOf(eVar2.field_featureId), eVar2);
            }
            if (((C93834f) FTS5SearchFeatureLogic.this.f270923f.f290993f).mo128796m()) {
                FTS5SearchFeatureLogic.this.f270923f.mo138600c();
            }
            FTS5SearchFeatureLogic.this.f270923f.mo138598a();
            HashSet hashSet2 = new HashSet();
            HashSet hashSet3 = new HashSet();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                C101468c.C101469a aVar2 = (C101468c.C101469a) it.next();
                C76727e eVar3 = (C76727e) hashMap.remove(Integer.valueOf(aVar2.f297171a));
                if (eVar3 == null) {
                    hashSet2.add(Integer.valueOf(aVar2.f297171a));
                } else if (aVar2.f297172b != eVar3.field_timestamp) {
                    hashSet3.add(eVar3);
                    C101468c cVar3 = FTS5SearchFeatureLogic.this.f270923f;
                    int[] iArr = C99249c.f291005c;
                    cVar3.mo138607h(iArr, Long.valueOf((long) eVar3.field_featureId).longValue());
                    C93924g Bx0 = ((PluginFTS) C86312j.m106911c(cls)).Bx0();
                    Bx0.f271053f.mo138622v5(iArr, String.valueOf(eVar3.field_featureId));
                }
            }
            hashSet3.addAll(hashMap.values());
            FTS5SearchFeatureLogic.this.f270923f.mo138600c();
            FTS5SearchFeatureLogic.this.f270923f.mo138598a();
            this.f270928j = hashSet2.size();
            this.f270929n = hashSet3.size();
            Iterator it4 = hashSet3.iterator();
            while (it4.hasNext()) {
                C76727e eVar4 = (C76727e) it4.next();
                FTS5SearchFeatureLogic fTS5SearchFeatureLogic = FTS5SearchFeatureLogic.this;
                C101468c cVar4 = fTS5SearchFeatureLogic.f270923f;
                int i2 = eVar4.field_featureId;
                cVar4.mo138613n(262144, 1, (long) i2, String.valueOf(i2), eVar4.field_timestamp, eVar4.field_title);
                String i3 = C99251g.m129288i(eVar4.field_title, false);
                if (!Util.isNullOrNil(i3)) {
                    C101468c cVar5 = fTS5SearchFeatureLogic.f270923f;
                    int i4 = eVar4.field_featureId;
                    cVar5.mo138613n(262144, 2, (long) i4, String.valueOf(i4), eVar4.field_timestamp, i3);
                }
                String i5 = C99251g.m129288i(eVar4.field_title, true);
                if (!Util.isNullOrNil(i5)) {
                    C101468c cVar6 = fTS5SearchFeatureLogic.f270923f;
                    int i6 = eVar4.field_featureId;
                    cVar6.mo138613n(262144, 3, (long) i6, String.valueOf(i6), eVar4.field_timestamp, i5);
                }
                C101468c cVar7 = fTS5SearchFeatureLogic.f270923f;
                int i7 = eVar4.field_featureId;
                cVar7.mo138613n(262144, 4, (long) i7, String.valueOf(i7), eVar4.field_timestamp, eVar4.field_tag);
                ((PluginFTS) C86312j.m106911c(cls)).Bx0().mo128842c(String.valueOf(eVar4.field_featureId));
            }
            Iterator it5 = hashSet2.iterator();
            while (it5.hasNext()) {
                FTS5SearchFeatureLogic.this.f270923f.mo138607h(C99249c.f291005c, Long.valueOf((long) ((Integer) it5.next()).intValue()).longValue());
            }
            FTS5SearchFeatureLogic.this.f270923f.mo138600c();
            return true;
        }

        /* renamed from: c */
        public String mo94944c() {
            return String.format("{remove: %d add: %d}", new Object[]{Integer.valueOf(this.f270928j), Integer.valueOf(this.f270929n)});
        }

        /* renamed from: e */
        public int mo128768e() {
            return 5;
        }

        public String getName() {
            return "BuildFeatureIndexTask";
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.logic.FTS5SearchFeatureLogic$b */
    public class C93878b extends C99664b {
        public C93878b(C938751 r2) {
        }

        /* JADX WARNING: Removed duplicated region for block: B:29:0x0093  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00a0  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo57099b() {
            /*
                r9 = this;
                com.tencent.mm.plugin.fts.logic.FTS5SearchFeatureLogic r0 = com.tencent.p014mm.plugin.fts.logic.FTS5SearchFeatureLogic.this
                com.tencent.mm.vfs.m1 r1 = com.tencent.p014mm.plugin.fts.logic.FTS5SearchFeatureLogic.m118587d()
                int r0 = r0.mo128827e(r1)
                com.tencent.mm.plugin.fts.logic.FTS5SearchFeatureLogic r1 = com.tencent.p014mm.plugin.fts.logic.FTS5SearchFeatureLogic.this
                r1.getClass()
                nj.i$b r1 = p206nj.C76862i.f224685a
                android.content.res.AssetManager r1 = r1.getAssets()
                r2 = 0
                java.lang.String r3 = "MicroMsg.FTS.FTS5SearchFeatureLogic"
                r4 = -1
                if (r1 == 0) goto L_0x0056
                r5 = 0
                java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0043 }
                java.io.InputStreamReader r7 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0043 }
                java.lang.String r8 = "fts/feature/version.info"
                java.io.InputStream r1 = r1.open(r8)     // Catch:{ Exception -> 0x0043 }
                r7.<init>(r1)     // Catch:{ Exception -> 0x0043 }
                r6.<init>(r7)     // Catch:{ Exception -> 0x0043 }
                java.lang.String r1 = r6.readLine()     // Catch:{ Exception -> 0x003e, all -> 0x003c }
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x003e, all -> 0x003c }
                int r1 = r1.intValue()     // Catch:{ Exception -> 0x003e, all -> 0x003c }
                com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r6)
                goto L_0x0057
            L_0x003c:
                r0 = move-exception
                goto L_0x0052
            L_0x003e:
                r1 = move-exception
                r5 = r6
                goto L_0x0044
            L_0x0041:
                r0 = move-exception
                goto L_0x0051
            L_0x0043:
                r1 = move-exception
            L_0x0044:
                java.lang.String r6 = r1.getMessage()     // Catch:{ all -> 0x0041 }
                java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ all -> 0x0041 }
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r1, r6, r7)     // Catch:{ all -> 0x0041 }
                com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r5)
                goto L_0x0056
            L_0x0051:
                r6 = r5
            L_0x0052:
                com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r6)
                throw r0
            L_0x0056:
                r1 = -1
            L_0x0057:
                r5 = 2
                java.lang.Object[] r5 = new java.lang.Object[r5]
                java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
                r5[r2] = r6
                java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
                r6 = 1
                r5[r6] = r2
                java.lang.String r2 = "start to check feature resource task %d, pkgversion:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r2, r5)
                if (r1 <= r0) goto L_0x0072
                if (r1 <= 0) goto L_0x0072
                r0 = -1
            L_0x0072:
                if (r0 < 0) goto L_0x0076
                goto L_0x00ea
            L_0x0076:
                nj.i$b r0 = p206nj.C76862i.f224685a
                android.content.res.AssetManager r0 = r0.getAssets()
                if (r0 == 0) goto L_0x00ea
                com.tencent.mm.vfs.m1 r1 = new com.tencent.mm.vfs.m1
                android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                java.io.File r2 = r2.getCacheDir()
                java.lang.String r3 = "fts/feature/fts_feature.zip"
                r1.<init>((java.io.File) r2, (java.lang.String) r3)
                boolean r2 = r1.mo119967g()
                if (r2 == 0) goto L_0x0096
                r1.mo119966f()
            L_0x0096:
                com.tencent.mm.vfs.m1 r2 = r1.mo119974l()
                boolean r2 = r2.mo119967g()
                if (r2 != 0) goto L_0x00a7
                com.tencent.mm.vfs.m1 r2 = r1.mo119974l()
                r2.mo119987x()
            L_0x00a7:
                java.io.InputStream r0 = r0.open(r3)     // Catch:{ all -> 0x00ea }
                com.tencent.mm.vfs.s1 r2 = new com.tencent.mm.vfs.s1     // Catch:{ all -> 0x00de }
                r2.<init>((com.tencent.p014mm.vfs.C86009m1) r1)     // Catch:{ all -> 0x00de }
                s24.C90125c.m112775b(r0, r2)     // Catch:{ all -> 0x00d4 }
                r2.close()     // Catch:{ all -> 0x00de }
                com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent r2 = new com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent     // Catch:{ all -> 0x00de }
                r2.<init>()     // Catch:{ all -> 0x00de }
                com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent$a r3 = r2.f78743d     // Catch:{ all -> 0x00de }
                r4 = 35
                r3.f78744a = r4     // Catch:{ all -> 0x00de }
                r3.f78745b = r6     // Catch:{ all -> 0x00de }
                java.lang.String r1 = r1.mo119971i()     // Catch:{ all -> 0x00de }
                r3.f78746c = r1     // Catch:{ all -> 0x00de }
                android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x00de }
                r2.asyncPublish((android.os.Looper) r1)     // Catch:{ all -> 0x00de }
                r0.close()     // Catch:{ all -> 0x00ea }
                goto L_0x00ea
            L_0x00d4:
                r1 = move-exception
                r2.close()     // Catch:{ all -> 0x00d9 }
                goto L_0x00dd
            L_0x00d9:
                r2 = move-exception
                r1.addSuppressed(r2)     // Catch:{ all -> 0x00de }
            L_0x00dd:
                throw r1     // Catch:{ all -> 0x00de }
            L_0x00de:
                r1 = move-exception
                if (r0 == 0) goto L_0x00e9
                r0.close()     // Catch:{ all -> 0x00e5 }
                goto L_0x00e9
            L_0x00e5:
                r0 = move-exception
                r1.addSuppressed(r0)     // Catch:{ all -> 0x00ea }
            L_0x00e9:
                throw r1     // Catch:{ all -> 0x00ea }
            L_0x00ea:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.fts.logic.FTS5SearchFeatureLogic.C93878b.mo57099b():boolean");
        }

        public String getName() {
            return "CheckFeatureResourceTask";
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.logic.FTS5SearchFeatureLogic$c */
    public class C93879c extends C99678j {
        public C93879c(C76728k kVar, C938751 r3) {
            super(kVar);
        }

        /* renamed from: e */
        public int mo128768e() {
            return 12;
        }

        public String getName() {
            return "SearchFeatureTask";
        }

        /* renamed from: i */
        public void mo128820i(C10656l lVar) {
            lVar.f32075d = C99672i.m130094a(this.f292133j.f224468c, true);
            lVar.f32076e = new ArrayList();
            HashSet hashSet = new HashSet();
            Cursor w = FTS5SearchFeatureLogic.this.f270923f.mo138623w(lVar.f32075d, C99249c.f291005c, this.f292133j.f224473h, (String) null, true, true);
            while (((CursorWrapper) w).moveToNext()) {
                C99682o oVar = new C99682o();
                oVar.mo139050c(w);
                if (!hashSet.contains(Long.valueOf(oVar.f292150d)) && !this.f292133j.f224475j.contains(oVar.f292151e)) {
                    oVar.mo139048a();
                    lVar.f32076e.add(oVar);
                    hashSet.add(Long.valueOf(oVar.f292150d));
                }
            }
            ((C93824b) w).close();
            if (!Thread.interrupted()) {
                Comparator<C99681n> comparator = this.f292133j.f224477l;
                if (comparator != null) {
                    Collections.sort(lVar.f32076e, comparator);
                }
                for (C99681n next : lVar.f32076e) {
                    next.f292161o = FTS5SearchFeatureLogic.this.f270923f.mo140968A((int) next.f292150d);
                }
                return;
            }
            throw new InterruptedException();
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.logic.FTS5SearchFeatureLogic$d */
    public class C93880d extends C99664b {

        /* renamed from: j */
        public String f270933j;

        public C93880d(String str) {
            this.f270933j = str;
        }

        /* renamed from: b */
        public boolean mo57099b() {
            List c = FTS5SearchFeatureLogic.m118586c(FTS5SearchFeatureLogic.this, this.f270933j);
            FTS5SearchFeatureLogic.this.f270923f.mo138598a();
            FTS5SearchFeatureLogic.this.f270923f.mo140969B(c);
            FTS5SearchFeatureLogic.this.f270923f.mo138600c();
            C101468c cVar = FTS5SearchFeatureLogic.this.f270923f;
            int[] iArr = C99249c.f291005c;
            cVar.mo138604e(iArr);
            FTS5SearchFeatureLogic fTS5SearchFeatureLogic = FTS5SearchFeatureLogic.this;
            ((C93836i) fTS5SearchFeatureLogic.f270922e).mo128803c(131132, new C93877a((C938751) null));
            ((PluginFTS) C86312j.m106911c(PluginFTS.class)).Bx0().f271053f.mo138616q(iArr, 1);
            return true;
        }

        public String getName() {
            return "UpdateFeatureIndexTask";
        }
    }

    public FTS5SearchFeatureLogic() {
        C40008f fVar = C40008f.f107254d;
        this.f270924g = new IListener<UpdateLanguageEvent>(fVar) {
            {
                this.__eventId = -1874260055;
            }

            public boolean callback(IEvent iEvent) {
                UpdateLanguageEvent updateLanguageEvent = (UpdateLanguageEvent) iEvent;
                FTS5SearchFeatureLogic fTS5SearchFeatureLogic = FTS5SearchFeatureLogic.this;
                ((C93836i) fTS5SearchFeatureLogic.f270922e).mo128803c(65596, new C93880d(FTS5SearchFeatureLogic.m118587d().mo119971i()));
                return true;
            }
        };
        this.f270925h = new IListener<CheckResUpdateCacheFileEvent>(fVar) {
            {
                this.__eventId = 905296653;
            }

            public boolean callback(IEvent iEvent) {
                CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent = (CheckResUpdateCacheFileEvent) iEvent;
                CheckResUpdateCacheFileEvent.C28720a aVar = checkResUpdateCacheFileEvent.f78743d;
                if (aVar.f78744a == 35 && aVar.f78745b == 1) {
                    Log.m105925i("MicroMsg.FTS.FTS5SearchFeatureLogic", "CheckResUpdateCacheFileEvent: %s", aVar.f78746c);
                    ((C119157j) C119157j.f356862d).mo183876g(new C93916c(this, checkResUpdateCacheFileEvent), "FTS.updateFeatureList");
                }
                return true;
            }
        };
    }

    /* renamed from: c */
    public static List m118586c(FTS5SearchFeatureLogic fTS5SearchFeatureLogic, String str) {
        int indexOf;
        fTS5SearchFeatureLogic.getClass();
        Object[] objArr = new Object[2];
        objArr[0] = str;
        String currentLanguage = LocaleUtil.getCurrentLanguage(MMApplicationContext.getContext());
        objArr[1] = currentLanguage.equalsIgnoreCase("zh_CN") ? "zh_CN".toLowerCase() : (currentLanguage.equalsIgnoreCase("zh_TW") || currentLanguage.equalsIgnoreCase("zh_HK")) ? "zh_TW".toLowerCase() : "en".toLowerCase();
        String format = String.format("%s/feature_%s.conf", objArr);
        Log.m105925i("MicroMsg.FTS.FTS5SearchFeatureLogic", "decodeToFeatureList %s", format);
        long m = C86013q1.m106452m(format);
        int l = (int) C86013q1.m106451l(format);
        ArrayList arrayList = new ArrayList();
        if (l != 0) {
            String[] split = new String(C86013q1.m106433O(format, 0, l)).split("\n");
            C76727e eVar = null;
            for (String str2 : split) {
                if (str2 != null) {
                    String trim = str2.trim();
                    if (trim.length() != 0 && (indexOf = trim.indexOf("=")) >= 0) {
                        String substring = trim.substring(0, indexOf);
                        String substring2 = trim.substring(indexOf + 1);
                        if (substring.equals("FeatureID")) {
                            if (eVar != null) {
                                eVar.field_iconPath = str + "/icon/" + eVar.field_featureId + ".png";
                                arrayList.add(eVar);
                            }
                            eVar = new C76727e();
                            eVar.field_featureId = Util.getInt(substring2, 0);
                            eVar.field_timestamp = m;
                        }
                        if (eVar != null) {
                            if (substring.equals("Title")) {
                                eVar.field_title = WeChatBrands.Wordings.translate(substring2);
                            } else if (substring.equals("TitlePY")) {
                                eVar.field_titlePY = substring2;
                            } else if (substring.equals("TitleShortPY")) {
                                eVar.field_titleShortPY = substring2;
                            } else if (substring.equals("Tag")) {
                                eVar.field_tag = WeChatBrands.Wordings.translate(substring2);
                            } else if (substring.equals("ActionType")) {
                                if (substring2.equals("H5")) {
                                    eVar.field_actionType = 2;
                                } else if (substring2.equals("Native")) {
                                    eVar.field_actionType = 1;
                                }
                            } else if (substring.equals("Url")) {
                                eVar.field_url = WeChatBrands.Wordings.translate(substring2);
                            } else if (substring.equals("HelpUrl")) {
                                eVar.field_helpUrl = WeChatBrands.Wordings.translate(substring2);
                            } else if (substring.equals("UpdateUrl")) {
                                if (!WeChatSomeFeatureSwitch.blockFTSUpdate()) {
                                    eVar.field_updateUrl = WeChatBrands.Wordings.translate(substring2);
                                }
                            } else if (substring.equals("AndroidUrl")) {
                                eVar.field_androidUrl = WeChatBrands.Wordings.translate(substring2);
                            }
                        }
                    }
                }
            }
            if (eVar != null) {
                eVar.field_iconPath = str + "/icon/" + eVar.field_featureId + ".png";
                eVar.field_timestamp = m;
                arrayList.add(eVar);
            }
            if (arrayList.size() != 0) {
                return arrayList;
            }
            throw new C99683p("no data error");
        }
        throw new C99683p("data file no exist error");
    }

    /* renamed from: d */
    public static C86009m1 m118587d() {
        C86009m1 m1Var = new C86009m1(new C86009m1(C112760b.m154231g(), "fts"), "feature");
        if (!m1Var.mo119967g()) {
            m1Var.mo119987x();
        }
        C86009m1 m1Var2 = new C86009m1(m1Var, "fts_feature");
        if (!m1Var2.mo119967g()) {
            m1Var2.mo119987x();
        }
        return m1Var2;
    }

    /* renamed from: a */
    public boolean mo128809a() {
        Class cls = C99260q.class;
        if (!((C99260q) C86312j.m106911c(cls)).mo128758wd()) {
            Log.m105924i("MicroMsg.FTS.FTS5SearchFeatureLogic", "Create Fail!");
            return false;
        }
        Log.m105924i("MicroMsg.FTS.FTS5SearchFeatureLogic", "Create Success!");
        this.f270922e = ((C99260q) C86312j.m106911c(cls)).mo128743Jd();
        this.f270923f = (C101468c) ((C99260q) C86312j.m106911c(cls)).db0(17);
        this.f270924g.alive();
        this.f270925h.alive();
        ((C93836i) this.f270922e).mo128803c(131132, new C93878b((C938751) null));
        ((C93836i) this.f270922e).mo128803c(131133, new C93877a((C938751) null));
        return true;
    }

    /* renamed from: b */
    public boolean mo128810b() {
        this.f270924g.dead();
        this.f270925h.dead();
        this.f270923f = null;
        this.f270922e = null;
        return true;
    }

    /* renamed from: e */
    public final int mo128827e(C86009m1 m1Var) {
        C86009m1 m1Var2 = new C86009m1(m1Var, "version.info");
        try {
            if (m1Var2.mo119967g()) {
                return Integer.parseInt(C86013q1.m106432N(m1Var2.mo119971i()), 10);
            }
            Log.m105925i("MicroMsg.FTS.FTS5SearchFeatureLogic", "version file %s not exist", m1Var2.mo119971i());
            return -1;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.FTS.FTS5SearchFeatureLogic", e, "getFeatureVersion", new Object[0]);
            return -1;
        }
    }

    public String getName() {
        return "FTS5SearchFeatureLogic";
    }

    /* renamed from: l4 */
    public C99664b mo128819l4(C76728k kVar) {
        return ((C93836i) this.f270922e).mo128803c(-65536, new C93879c(kVar, (C938751) null));
    }
}
