package gf1;

import android.database.Cursor;
import android.os.SystemClock;
import android.util.LongSparseArray;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import cy3.C58003b;
import di3.C86312j;
import fy3.C32224a;
import gy3.C8477a0;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import o40.C61926c;
import p749xh.C66261f3;
import pe3.C89349b;
import rx3.C13598b0;
import sx3.C110818d0;
import sx3.C36907w;
import te3.C49863il0;
import te3.C50140kk0;
import te3.C50145kl1;
import te3.C50401mh0;
import te3.ba4;
import up1.C14358p;
import vp1.C14933j;
import vp1.C14937o;
import vp1.C65834e;
import wp1.C15585f;

/* renamed from: gf1.l */
public final class C8273l extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C50401mh0 f27219d;

    /* renamed from: e */
    public final /* synthetic */ C45907m f27220e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8273l(C50401mh0 mh02, C45907m mVar) {
        super(0);
        this.f27219d = mh02;
        this.f27220e = mVar;
    }

    public Object invoke() {
        Throwable th;
        C49863il0 il02;
        LinkedList<C50140kk0> linkedList;
        C49863il0 il03;
        C50145kl1 kl12 = new C50145kl1();
        C89349b bVar = this.f27219d.f138029e;
        if (bVar != null) {
            C45907m mVar = this.f27220e;
            kl12.parseFrom(bVar.mo123703f());
            LinkedList<ba4> linkedList2 = kl12.f136879d;
            C87412m.m108593f(linkedList2, "spamObj.`object`");
            if (!linkedList2.isEmpty()) {
                mVar.getClass();
                Log.m105925i("Finder.SyncHandler", "sync spam obj %s", Integer.valueOf(kl12.f136879d.size()));
                C15585f.C15586a aVar = C15585f.f42211a;
                LinkedList<ba4> linkedList3 = kl12.f136879d;
                C87412m.m108593f(linkedList3, "spamObj.`object`");
                ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList3, 10));
                for (ba4 ba4 : linkedList3) {
                    arrayList.add(Long.valueOf(ba4.f131027d));
                }
                long currentTimeMillis = System.currentTimeMillis();
                C14358p Dx0 = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Dx0();
                long uptimeMillis = SystemClock.uptimeMillis();
                C14937o.C14938a aVar2 = C14937o.f40972a;
                C110818d0.m150951w0(arrayList);
                Integer[] numArr = C14937o.f40974c;
                int i = 0;
                while (true) {
                    LinkedList<C50140kk0> linkedList4 = null;
                    if (i >= 13) {
                        break;
                    }
                    int intValue = numArr[i].intValue();
                    C14937o.C14938a aVar3 = C14937o.f40972a;
                    aVar3.mo13990l(intValue);
                    LinkedList<C49863il0> linkedList5 = C14937o.f40976e.mo13997a(intValue).f40955c.f144718d;
                    if (!(linkedList5 == null || (il02 = (C49863il0) C110818d0.m150917O(linkedList5, 0)) == null || (linkedList = il02.f135460d) == null)) {
                        C8477a0 a0Var = new C8477a0();
                        C61926c.m72675T(linkedList, new C14933j(arrayList, a0Var));
                        if (a0Var.f27482d) {
                            if (BuildInfo.DEBUG) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("[deletePageData] ");
                                LinkedList<C49863il0> linkedList6 = C14937o.f40976e.mo13997a(intValue).f40955c.f144718d;
                                if (!(linkedList6 == null || (il03 = (C49863il0) C110818d0.m150917O(linkedList6, 0)) == null)) {
                                    linkedList4 = il03.f135460d;
                                }
                                sb.append(linkedList4);
                                Log.m105924i("Finder.FinderPage", sb.toString());
                            }
                            aVar3.mo13981b(C14937o.f40976e.mo13997a(intValue));
                        }
                    }
                    i++;
                }
                LongSparseArray longSparseArray = new LongSparseArray();
                Cursor rawQuery = Dx0.f39913g.rawQuery("SELECT id, createTime from FinderFeedItem ORDER BY createTime DESC LIMIT 100", (String[]) null, 2);
                try {
                    if (rawQuery.moveToFirst()) {
                        while (!rawQuery.isAfterLast()) {
                            long j = rawQuery.getLong(0);
                            if (j != 0) {
                                longSparseArray.put(j, Long.valueOf(j));
                            }
                            rawQuery.moveToNext();
                        }
                    }
                    C13598b0 b0Var = C13598b0.f38549a;
                    C58003b.m67160a(rawQuery, (Throwable) null);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        long longValue = ((Number) it.next()).longValue();
                        C65834e.f189316a.mo89875i(longValue);
                        if (longSparseArray.indexOfKey(longValue) >= 0) {
                            ISQLiteDatabase iSQLiteDatabase = Dx0.f39913g;
                            iSQLiteDatabase.delete(C66261f3.TABLE_NAME, "id=?", new String[]{"" + longValue});
                        }
                    }
                    if (BuildInfo.DEBUG) {
                        Log.m105918d("Finder.FinderFeedStorage", "[deleteByGroupId] objectIds=" + arrayList);
                    }
                    Log.m105924i("Finder.FinderFeedStorage", "[deleteByGroupId] size=" + arrayList.size() + " COST=" + (SystemClock.uptimeMillis() - uptimeMillis) + LocaleUtil.MALAY);
                    C15585f.C15586a aVar4 = C15585f.f42211a;
                    Log.m105924i("Finder.FinderFeedLogic", "delete feed size=$" + arrayList.size() + " cost=" + (System.currentTimeMillis() - currentTimeMillis) + LocaleUtil.MALAY);
                } catch (Throwable th4) {
                    Throwable th5 = th4;
                    C58003b.m67160a(rawQuery, th);
                    throw th5;
                }
            }
        }
        return C13598b0.f38549a;
    }
}
