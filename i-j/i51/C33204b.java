package i51;

import android.database.Cursor;
import com.tencent.p014mm.plugin.downloader.api.C29841c;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import e51.C31421i;
import f40.C86709a0;
import f40.C86718e;
import java.util.LinkedList;

/* renamed from: i51.b */
public class C33204b {
    /* renamed from: a */
    public static LinkedList<C33203a> m39980a() {
        LinkedList<C33203a> linkedList = null;
        if (m39981b() == null) {
            return null;
        }
        C33205c b = m39981b();
        b.getClass();
        Cursor rawQuery = b.rawQuery(String.format("select * from %s order by %s desc", new Object[]{"DownloadTaskItem", "modifyTime"}), new String[0]);
        if (rawQuery != null) {
            linkedList = new LinkedList<>();
            while (rawQuery.moveToNext()) {
                C33203a aVar = new C33203a();
                aVar.convertFrom(rawQuery);
                linkedList.add(aVar);
            }
            rawQuery.close();
        }
        return linkedList;
    }

    /* renamed from: b */
    public static C33205c m39981b() {
        if (C86709a0.m107523b().mo121114l()) {
            C86709a0.m107523b();
            if (!C86718e.m107551r()) {
                if (C86312j.m106911c(C29841c.class) != null) {
                    return ((C31421i) C86312j.m106911c(C31421i.class)).mo57972nJ();
                }
                Log.m105920e("MicroMsg.DownloadTaskItemDbHelp", "service not ready");
                return null;
            }
        }
        Log.m105920e("MicroMsg.DownloadTaskItemDbHelp", "no user login");
        return null;
    }

    /* renamed from: c */
    public static boolean m39982c(String str, int i) {
        if (m39981b() == null) {
            return false;
        }
        C33203a aVar = new C33203a();
        aVar.field_appId = str;
        aVar.field_status = i;
        aVar.field_modifyTime = System.currentTimeMillis();
        return m39981b().update(aVar, new String[0]);
    }
}
