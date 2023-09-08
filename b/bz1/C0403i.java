package bz1;

import android.content.ContentValues;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import di3.C86312j;
import eb0.C31543z5;
import f40.C86709a0;
import f62.C75700k0;
import gy3.C87412m;
import hp3.C87581a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import ob0.C89132b;
import rx3.C13598b0;
import sx3.C36907w;
import wy1.C53224d;
import xy1.C15913g;
import yy1.C53640b;
import yy1.C53649k;

/* renamed from: bz1.i */
public final class C0403i<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ List<String> f1012a;

    /* renamed from: b */
    public final /* synthetic */ C15913g.C15916c f1013b;

    /* renamed from: c */
    public final /* synthetic */ HashMap<String, C0394d> f1014c;

    /* renamed from: d */
    public final /* synthetic */ C0396g f1015d;

    public C0403i(List<String> list, C15913g.C15916c cVar, HashMap<String, C0394d> hashMap, C0396g gVar) {
        this.f1012a = list;
        this.f1013b = cVar;
        this.f1014c = hashMap;
        this.f1015d = gVar;
    }

    public Object call(Object obj) {
        LinkedList<C53640b> linkedList;
        int i;
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        if (cVar.f256793a == 0 && cVar.f256794b == 0 && (linkedList = ((C53649k) cVar.f256796d).f150703d) != null) {
            int i2 = 1;
            Log.m105925i("GameLife.ContactService", "get contact from server success, count %d", Integer.valueOf(linkedList.size()));
            LinkedList<C53640b> linkedList2 = ((C53649k) cVar.f256796d).f150703d;
            C87412m.m108593f(linkedList2, "result.resp.chat_user_info_list");
            ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList2, 10));
            for (C53640b bVar : linkedList2) {
                C87412m.m108593f(bVar, LocaleUtil.ITALIAN);
                C0394d dVar = new C0394d();
                dVar.field_username = bVar.f150681d;
                dVar.field_nickname = bVar.f150682e;
                dVar.field_avatarURL = bVar.f150683f;
                dVar.field_sex = bVar.f150684g;
                dVar.field_tag = bVar.f150685h;
                dVar.field_jumpInfo = bVar.f150686i;
                dVar.field_accountType = bVar.f150687j;
                arrayList.add(dVar);
            }
            C0396g gVar = this.f1015d;
            HashMap<String, C0394d> hashMap = this.f1014c;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C0394d dVar2 = (C0394d) it.next();
                Object[] objArr = new Object[3];
                objArr[0] = dVar2.mo431l2();
                objArr[i2] = dVar2.field_nickname;
                objArr[2] = dVar2.field_avatarURL;
                Log.m105919d("GameLife.ContactService", "gamelife username:%s nickname:%s,avatarUrl:%s", objArr);
                gVar.getClass();
                String username = dVar2.getUsername();
                gVar.f1000d.put(username, dVar2);
                ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69653F1(username);
                C0404k yx02 = ((C53224d) C86312j.m106911c(C53224d.class)).yx0();
                dVar2.field_updateTime = C31543z5.m39453c();
                String str = dVar2.field_username;
                C87412m.m108593f(str, "contact.field_username");
                if (yx02.mo446jo(str) == null) {
                    i = (int) yx02.f1017d.insert("GameLifeContact", "username", dVar2.convertTo());
                    Log.m105924i("GameLife.ContactStorage", "insertContact[" + i + "] " + dVar2.mo431l2());
                } else {
                    ContentValues convertTo = dVar2.convertTo();
                    convertTo.remove("rowid");
                    ISQLiteDatabase iSQLiteDatabase = yx02.f1017d;
                    String[] strArr = new String[i2];
                    strArr[0] = dVar2.field_username;
                    i = iSQLiteDatabase.update("GameLifeContact", convertTo, "username=?", strArr);
                    Log.m105924i("GameLife.ContactStorage", "updateContact[" + i + "] " + dVar2.mo431l2());
                }
                if (i > 0) {
                    yx02.doNotify("GameLifeContact", 3, dVar2.getUsername());
                }
                hashMap.put(dVar2.getUsername(), dVar2);
                i2 = 1;
            }
        } else {
            Log.m105920e("GameLife.ContactService", "get contact from server failed " + cVar.f256793a + ' ' + cVar.f256794b + ' ' + cVar.f256795c);
        }
        List<String> list = this.f1012a;
        HashMap<String, C0394d> hashMap2 = this.f1014c;
        for (String str2 : list) {
            if (!hashMap2.containsKey(str2)) {
                C0394d dVar3 = new C0394d();
                dVar3.field_username = str2;
                dVar3.f999B = false;
                hashMap2.put(str2, dVar3);
            }
        }
        C15913g.C15916c cVar2 = this.f1013b;
        HashMap<String, C0394d> hashMap3 = this.f1014c;
        C87412m.m108592e(hashMap3, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, com.tencent.mm.plugin.gamelife.api.IGameLifeContact>");
        cVar2.mo445a(hashMap3);
        return C13598b0.f38549a;
    }
}
