package p776zm;

import android.content.Context;
import android.database.Cursor;
import com.tencent.p014mm.pluginsdk.model.app.C44547a2;
import com.tencent.p014mm.pluginsdk.model.app.C44549d1;
import com.tencent.p014mm.pluginsdk.model.app.C44560i1;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.pluginsdk.model.app.C44565l;
import com.tencent.p014mm.pluginsdk.model.app.C44579p;
import com.tencent.p014mm.pluginsdk.model.app.C44587y0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import md2.C47000b;
import te3.C50651o92;

/* renamed from: zm.k */
public class C53797k implements C44587y0 {
    /* renamed from: c3 */
    public void mo69381c3(int i, int i2, String str, C44549d1 d1Var) {
        boolean z;
        C44547a2 c = C44547a2.m48943c();
        c.getClass();
        if (C86709a0.m107522a()) {
            c.f120801a = false;
            Log.m105919d("MicroMsg.SuggestionAppListLogic", "Suggestion onSceneEnd errType=%s errCode=%s", Integer.valueOf(i), Integer.valueOf(i2));
            if (d1Var == null) {
                Log.m105920e("MicroMsg.SuggestionAppListLogic", "scene == null");
            } else if (i == 0 && i2 == 0 && d1Var.mo69338b() == 4) {
                C44560i1 i1Var = (C44560i1) d1Var;
                Log.m105919d("MicroMsg.SuggestionAppListLogic", "get suggestion appList, AppCount = %s", Integer.valueOf(((C50651o92) i1Var.f120809d.f127056b.f127083a).f139046d));
                LinkedList<C44561j> linkedList = i1Var.f120840e;
                if (linkedList == null || linkedList.size() <= 0) {
                    Log.m105928w("MicroMsg.SuggestionAppListLogic", "empty suggestAppList");
                } else if (MMApplicationContext.getContext() == null || C47000b.C34548a.m40384a() == null) {
                    Log.m105920e("MicroMsg.SuggestionAppListLogic", "wrong environment");
                } else {
                    LinkedList linkedList2 = new LinkedList();
                    Iterator<C44561j> it = linkedList.iterator();
                    while (it.hasNext()) {
                        C44561j next = it.next();
                        Object[] objArr = new Object[5];
                        objArr[0] = next.field_appName;
                        objArr[1] = next.field_packageName;
                        objArr[2] = next.field_signature;
                        objArr[3] = next.f149250R;
                        objArr[4] = Boolean.valueOf(next.f149248Q != null);
                        Log.m105919d("MicroMsg.SuggestionAppListLogic", "suggestion appName=%s, packageName=%s, signature [%s], introUrl [%s], has iconUrl [%s]", objArr);
                        linkedList2.add(next.field_appId);
                    }
                    C47000b.C34548a.m40384a().E30(linkedList2);
                    Context context = MMApplicationContext.getContext();
                    ArrayList arrayList = new ArrayList();
                    if (C47000b.C34548a.m40384a() == null) {
                        Log.m105920e("MicroMsg.AppInfoLogic", "getISubCorePluginBase() == null");
                    } else {
                        Cursor Nt = C47000b.C34548a.m40384a().mo72196Nt(5);
                        if (Nt != null) {
                            while (Nt.moveToNext()) {
                                C44561j jVar = new C44561j();
                                jVar.convertFrom(Nt);
                                if (jVar.field_status == 1) {
                                    if (!C44565l.m48996p(context, jVar.field_appId)) {
                                        jVar.field_status = 4;
                                        C47000b.C34548a.m40384a().mo72197Nz(jVar);
                                    } else if (!Util.isNullOrNil(jVar.field_signature)) {
                                        arrayList.add(jVar);
                                    }
                                } else if (jVar.field_signature != null) {
                                    arrayList.add(jVar);
                                }
                            }
                            Nt.close();
                        }
                    }
                    if (arrayList.size() > 0) {
                        C44579p pVar = (C44579p) C47000b.C34548a.m40384a().mo72195FM();
                        Iterator it4 = arrayList.iterator();
                        while (it4.hasNext()) {
                            C44561j jVar2 = (C44561j) it4.next();
                            if (jVar2.field_appId != null) {
                                Iterator<C44561j> it5 = linkedList.iterator();
                                while (true) {
                                    if (!it5.hasNext()) {
                                        z = false;
                                        break;
                                    }
                                    String str2 = it5.next().field_appId;
                                    if (str2 != null && jVar2.field_appId.equals(str2)) {
                                        z = true;
                                        break;
                                    }
                                }
                                if (!z) {
                                    if (C44565l.m48995o(MMApplicationContext.getContext(), jVar2)) {
                                        jVar2.field_status = 1;
                                    } else {
                                        jVar2.field_status = 4;
                                    }
                                    pVar.update(jVar2, new String[0]);
                                }
                            }
                        }
                    }
                    C86709a0.m107528h();
                    C86709a0.m107535s().mo121142i().mo119680N(352275, System.currentTimeMillis());
                    c.f120805e = System.currentTimeMillis();
                }
            }
        }
    }
}
