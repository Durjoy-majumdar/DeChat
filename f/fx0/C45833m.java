package fx0;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C31519v2;
import f40.C86709a0;
import h81.C32735h;
import hp3.C87581a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p248ug.C52558c;
import te3.C49566gj;

/* renamed from: fx0.m */
public class C45833m implements C87581a<Void, Void> {

    /* renamed from: a */
    public final /* synthetic */ List f123748a;

    /* renamed from: b */
    public final /* synthetic */ List f123749b;

    /* renamed from: c */
    public final /* synthetic */ C32209n f123750c;

    public C45833m(C32209n nVar, List list, List list2) {
        this.f123750c = nVar;
        this.f123748a = list;
        this.f123749b = list2;
    }

    public Object call(Object obj) {
        Void voidR = (Void) obj;
        C32209n nVar = this.f123750c;
        List list = this.f123748a;
        List list2 = this.f123749b;
        nVar.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        int i = C72996z1.f214113Y1;
        Log.m105919d("MicroMsg.BrandService.BrandServiceMgr", "sql %s", "select bizinfo.brandIconURL, bizinfo.type, bizinfo.status, rcontact.username, rcontact.conRemark, rcontact.nickname, rcontact.alias, rcontact.conRemarkPYFull, rcontact.conRemarkPYShort, rcontact.showHead, rcontact.pyInitial, rcontact.quanPin from rcontact, bizinfo where bizinfo.username = rcontact.username and (rcontact.verifyFlag & 8) != 0  and (rcontact.type & 1) != 0  order by showHead asc,  case when length(conRemarkPYFull) > 0 then upper(conRemarkPYFull)  else upper(quanPin) end asc,  case when length(conRemark) > 0 then upper(conRemark)  else upper(quanPin) end asc,  upper(quanPin) asc,  upper(nickname) asc");
        C86709a0.m107528h();
        Cursor rawQuery = C86709a0.m107535s().f251811i.rawQuery("select bizinfo.brandIconURL, bizinfo.type, bizinfo.status, rcontact.username, rcontact.conRemark, rcontact.nickname, rcontact.alias, rcontact.conRemarkPYFull, rcontact.conRemarkPYShort, rcontact.showHead, rcontact.pyInitial, rcontact.quanPin from rcontact, bizinfo where bizinfo.username = rcontact.username and (rcontact.verifyFlag & 8) != 0  and (rcontact.type & 1) != 0  order by showHead asc,  case when length(conRemarkPYFull) > 0 then upper(conRemarkPYFull)  else upper(quanPin) end asc,  case when length(conRemark) > 0 then upper(conRemark)  else upper(quanPin) end asc,  upper(quanPin) asc,  upper(nickname) asc", (String[]) null, 2);
        HashMap hashMap = new HashMap();
        if (rawQuery != null) {
            int i2 = 0;
            while (rawQuery.moveToNext()) {
                i2++;
                C72996z1 z1Var = new C72996z1();
                z1Var.convertFrom(rawQuery);
                C52558c cVar = new C52558c();
                cVar.convertFrom(rawQuery);
                if (!z1Var.getUsername().equals("gh_43f2581f6fd6") && !C72996z1.m85826X5(z1Var.getUsername()) && (1 != ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_minishop_plugin_enabled, 1) || !z1Var.getUsername().equals("gh_579db1f2cf89"))) {
                    C49566gj gjVar = new C49566gj();
                    String username = z1Var.getUsername();
                    gjVar.f134062d = username;
                    gjVar.f134063e = z1Var;
                    gjVar.f134064f = cVar;
                    if (!C72996z1.m85793A5(username)) {
                        hashMap.put(gjVar.f134062d, gjVar);
                        int i3 = gjVar.f134064f.field_type;
                        if (i3 != 3) {
                            if (i3 == 2) {
                                list.add(gjVar);
                            } else if (i3 == 1 || i3 == 0) {
                                list2.add(gjVar);
                            }
                        }
                    }
                }
            }
            Log.m105919d("MicroMsg.BrandService.BrandServiceMgr", "biz contact count %d", Integer.valueOf(i2));
            rawQuery.close();
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        int i4 = C72996z1.f214113Y1;
        Log.m105919d("MicroMsg.BrandService.BrandServiceMgr", "sql check %s", "select username from rcontact where (verifyFlag & 8) != 0  and (type & 1) != 0 ");
        C86709a0.m107528h();
        Cursor rawQuery2 = C86709a0.m107535s().f251811i.rawQuery("select username from rcontact where (verifyFlag & 8) != 0  and (type & 1) != 0 ", (String[]) null, 0);
        if (rawQuery2 != null) {
            ArrayList arrayList = new ArrayList();
            while (rawQuery2.moveToNext()) {
                String string = rawQuery2.getString(0);
                if (!hashMap.containsKey(string)) {
                    arrayList.add(string);
                }
            }
            rawQuery2.close();
            Log.m105925i("MicroMsg.BrandService.BrandServiceMgr", "need update list size is %d, {%s}", Integer.valueOf(arrayList.size()), arrayList);
            if (!arrayList.isEmpty()) {
                C86709a0.m107528h();
                long beginTransaction = C86709a0.m107535s().f251811i.beginTransaction(Thread.currentThread().getId());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C31519v2.m39436a().mo55987c((String) it.next(), "");
                }
                C86709a0.m107528h();
                C86709a0.m107535s().f251811i.endTransaction(beginTransaction);
            }
        }
        Log.m105919d("MicroMsg.BrandService.BrandServiceMgr", "check use %d ms", Long.valueOf(System.currentTimeMillis() - currentTimeMillis2));
        Log.m105919d("MicroMsg.BrandService.BrandServiceMgr", "service add subscribe count:%d, enterpriseFather count:%d", Integer.valueOf(list2.size()), Integer.valueOf(list.size()));
        Log.m105919d("MicroMsg.BrandService.BrandServiceMgr", "init time: %d", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        return null;
    }
}
