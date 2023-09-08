package com.tencent.p014mm.storage;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Collection;
import java.util.LinkedList;
import o90.C100308d;
import wh3.C38128a;
import wh3.C38129b;

/* renamed from: com.tencent.mm.storage.q2 */
public final class C30769q2 {

    /* renamed from: a */
    public final String f82740a = "MicroMsg.EmojiDesignerProductList";

    /* renamed from: b */
    public int f82741b;

    /* renamed from: c */
    public final LinkedList<C38128a> f82742c = new LinkedList<>();

    /* renamed from: com.tencent.mm.storage.q2$a */
    public static final class C30770a {

        /* renamed from: a */
        public static final C30770a f82743a = new C30770a();

        /* renamed from: b */
        public static final C100308d<Integer, C30769q2> f82744b = new C100308d<>(500);

        /* renamed from: a */
        public final C30769q2 mo57693a(int i) {
            C38129b bVar;
            Cursor query;
            C30769q2 q2Var = f82744b.get(Integer.valueOf(i));
            if (!MMApplicationContext.isMainProcess()) {
                C30769q2 q2Var2 = new C30769q2();
                q2Var2.f82741b = i;
                return q2Var2;
            } else if (q2Var != null) {
                return q2Var;
            } else {
                C30790w2 h = C30790w2.m39221h();
                synchronized (h.f82769a) {
                    bVar = h.f82784p;
                }
                bVar.getClass();
                C30769q2 q2Var3 = new C30769q2();
                q2Var3.f82741b = i;
                try {
                    query = bVar.f100764d.query("EmojiDesignerProduct", C38128a.f100762r.columns, "designerUin=? ", new String[]{i + ""}, (String) null, (String) null, (String) null);
                    if (query != null) {
                        while (query.moveToNext()) {
                            C38128a aVar = new C38128a();
                            aVar.convertFrom(query);
                            q2Var3.f82742c.add(aVar);
                        }
                    }
                    if (query != null) {
                        query.close();
                    }
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.EmojiDesignerProductStorage", e, "", new Object[0]);
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
                f82744b.put(Integer.valueOf(i), q2Var3);
                return q2Var3;
            }
            throw th;
        }
    }

    /* renamed from: a */
    public final boolean mo57692a() {
        boolean z;
        String str = this.f82740a;
        Log.m105924i(str, "hasNew: " + this.f82741b + ", " + this.f82742c.size());
        int nowSecond = (int) Util.nowSecond();
        LinkedList<C38128a> linkedList = this.f82742c;
        if (!(linkedList instanceof Collection) || !linkedList.isEmpty()) {
            for (C38128a aVar : linkedList) {
                if (((long) aVar.field_syncTime) > ((long) nowSecond) - 2592000) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }
}
