package com.tencent.p014mm.chatroom.p015ui;

import android.database.Cursor;
import android.view.View;
import com.tencent.p014mm.chatroom.p015ui.SelectServiceNotifySenderUI;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C30757l4;
import com.tencent.p014mm.storage.C72996z1;
import d62.C75339i;
import di3.C86312j;
import eb0.C75592q0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kr0.C76629w0;
import sf0.C77691f;
import u90.C78140c;

/* renamed from: com.tencent.mm.chatroom.ui.f2 */
public class C67956f2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SelectServiceNotifySenderUI.C67939d f195076d;

    /* renamed from: com.tencent.mm.chatroom.ui.f2$a */
    public class C67957a implements Runnable {
        public C67957a() {
        }

        public void run() {
            C67956f2.this.f195076d.f195029i = false;
            View view = SelectServiceNotifySenderUI.this.f195012f;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/chatroom/ui/SelectServiceNotifySenderUI$ServiceNotifyAdapter$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/chatroom/ui/SelectServiceNotifySenderUI$ServiceNotifyAdapter$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C67956f2.this.f195076d.notifyDataSetChanged();
        }
    }

    public C67956f2(SelectServiceNotifySenderUI.C67939d dVar) {
        this.f195076d = dVar;
    }

    public void run() {
        List<SelectServiceNotifySenderUI.C67941e> list;
        this.f195076d.f195029i = true;
        long currentTimeMillis = System.currentTimeMillis();
        SelectServiceNotifySenderUI.C67939d dVar = this.f195076d;
        SelectServiceNotifySenderUI selectServiceNotifySenderUI = SelectServiceNotifySenderUI.this;
        ((ArrayList) selectServiceNotifySenderUI.f195018o).clear();
        Cursor qq = ((C30757l4) ((C78140c) C86312j.m106911c(C78140c.class)).ab0()).mo57665qq((String) null);
        if (qq == null) {
            list = selectServiceNotifySenderUI.f195018o;
        } else {
            try {
                qq.moveToFirst();
                while (!qq.isAfterLast()) {
                    SelectServiceNotifySenderUI.C67941e eVar = new SelectServiceNotifySenderUI.C67941e();
                    eVar.f195035c = qq.getString(0);
                    eVar.f195034b = qq.getString(1);
                    eVar.f195036d = qq.getInt(2);
                    if (Util.isNullOrNil(eVar.f195035c)) {
                        if (eVar.f195034b.endsWith("@app")) {
                            WxaAttributes N2 = ((C76629w0) C86312j.m106911c(C76629w0.class)).mo106879N2(eVar.f195034b);
                            if (N2 != null) {
                                eVar.f195035c = N2.field_nickname;
                            }
                        } else {
                            eVar.f195035c = ((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(eVar.f195034b);
                        }
                    }
                    C72996z1 z1Var = new C72996z1(eVar.f195034b);
                    z1Var.mo62878U2(eVar.f195035c);
                    eVar.f195033a = z1Var;
                    ((ArrayList) selectServiceNotifySenderUI.f195018o).add(eVar);
                    qq.moveToNext();
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.SelectServiceNotifySenderUI", e, "", new Object[0]);
            } catch (Throwable th) {
                qq.close();
                throw th;
            }
            qq.close();
            list = selectServiceNotifySenderUI.f195018o;
        }
        if (list == null) {
            dVar.getClass();
        } else {
            dVar.f195028h.clear();
            for (int i = 0; i < list.size(); i++) {
                SelectServiceNotifySenderUI.C67941e eVar2 = list.get(i);
                C72996z1 z1Var2 = eVar2.f195033a;
                SelectServiceNotifySenderUI.this.getClass();
                if (!C75592q0.m90764L(z1Var2.getUsername()) && (!z1Var2.getUsername().equals((Object) null) || SelectServiceNotifySenderUI.this.f195016j)) {
                    SelectServiceNotifySenderUI.this.getClass();
                    if (!new HashSet().contains(z1Var2.getUsername())) {
                        dVar.f195028h.add(eVar2);
                    }
                }
            }
            Collections.sort(dVar.f195028h, new C67964h2(dVar));
            dVar.f195027g = dVar.f195028h;
        }
        SelectServiceNotifySenderUI.C67939d dVar2 = this.f195076d;
        List<SelectServiceNotifySenderUI.C67941e> list2 = dVar2.f195028h;
        if (list2 != null) {
            String str = null;
            int i2 = 0;
            for (SelectServiceNotifySenderUI.C67941e eVar3 : list2) {
                C72996z1 z1Var3 = eVar3.f195033a;
                if (z1Var3 != null) {
                    String a = C77691f.m93686a(z1Var3.mo62909j3());
                    String substring = Util.isNullOrNil(a) ? "" : a.startsWith(dVar2.f195024d) ? "#" : a.toUpperCase().substring(0, 1);
                    if (i2 == 0) {
                        dVar2.f195030j.put(substring, Integer.valueOf(i2));
                    } else if (str != null && !substring.equals(str)) {
                        dVar2.f195030j.put(substring, Integer.valueOf(i2));
                    }
                    str = substring;
                } else {
                    str = null;
                }
                i2++;
            }
        }
        Log.m105925i("MicroMsg.ServiceNotifyAdapter", "[load data] cost:%sms", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        MMHandlerThread.postToMainThread(new C67957a());
    }
}
