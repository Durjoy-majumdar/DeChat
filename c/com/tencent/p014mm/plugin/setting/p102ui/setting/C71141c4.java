package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.database.Cursor;
import android.text.TextUtils;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.platformtools.SpellMap;
import com.tencent.p014mm.plugin.setting.p102ui.setting.UnfamiliarContactDetailUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import f40.C86709a0;
import f62.C75700k0;
import j20.C117292a;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.c4 */
public class C71141c4 implements UnfamiliarContactDetailUI.C42981o {

    /* renamed from: a */
    public long f205932a = System.currentTimeMillis();

    /* renamed from: b */
    public final /* synthetic */ UnfamiliarContactDetailUI f205933b;

    public C71141c4(UnfamiliarContactDetailUI unfamiliarContactDetailUI) {
        this.f205933b = unfamiliarContactDetailUI;
    }

    /* renamed from: a */
    public void mo97829a(UnfamiliarContactDetailUI.C42980l lVar) {
        Log.m105925i("MicroMsg.UnfamiliarContactUI", "[onLoading] type:%s", lVar.name());
        View findViewById = this.f205933b.findViewById(C0966R.C0970id.kml);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view = findViewById;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$8", "onLoading", "(Lcom/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$LoadingType;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$8", "onLoading", "(Lcom/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$LoadingType;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View findViewById2 = this.f205933b.findViewById(C0966R.C0970id.i7m);
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(0);
        View view2 = findViewById2;
        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$8", "onLoading", "(Lcom/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$LoadingType;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$8", "onLoading", "(Lcom/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$LoadingType;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (lVar == UnfamiliarContactDetailUI.C42980l.NORMAL) {
            UnfamiliarContactDetailUI unfamiliarContactDetailUI = this.f205933b;
            unfamiliarContactDetailUI.f205870p.setText(unfamiliarContactDetailUI.getString(C0966R.string.gas));
        } else if (lVar == UnfamiliarContactDetailUI.C42980l.OVER_ONE_MIN) {
            UnfamiliarContactDetailUI unfamiliarContactDetailUI2 = this.f205933b;
            unfamiliarContactDetailUI2.f205870p.setText(unfamiliarContactDetailUI2.getString(C0966R.string.k6r));
        }
    }

    /* renamed from: b */
    public void mo97830b(HashSet hashSet) {
        String str;
        String str2;
        Object[] objArr = new Object[1];
        objArr[0] = Integer.valueOf(hashSet == null ? 0 : hashSet.size());
        Log.m105925i("MicroMsg.UnfamiliarContactUI", "[onResult] size:%s", objArr);
        if (hashSet != null) {
            UnfamiliarContactDetailUI unfamiliarContactDetailUI = this.f205933b;
            unfamiliarContactDetailUI.f205874t.clear();
            LinkedList linkedList = new LinkedList();
            Iterator it = hashSet.iterator();
            int i = 0;
            while (it.hasNext()) {
                linkedList.add((String) it.next());
                i++;
                if (i % 200 == 0 || i == hashSet.size()) {
                    Cursor E3 = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69652E3(linkedList);
                    if (E3 != null) {
                        E3.moveToFirst();
                        while (!E3.isAfterLast()) {
                            C72996z1 z1Var = new C72996z1();
                            z1Var.convertFrom(E3);
                            if (!z1Var.mo62927s3()) {
                                Log.m105919d("MicroMsg.UnfamiliarContactUI", "contact:%s username:%s", z1Var.getNickname(), z1Var.getUsername());
                                E3.moveToNext();
                            } else {
                                UnfamiliarContactDetailUI.C71125i iVar = new UnfamiliarContactDetailUI.C71125i(unfamiliarContactDetailUI, z1Var);
                                C72996z1 z1Var2 = iVar.f205895c;
                                if (z1Var2 == null) {
                                    str = null;
                                } else {
                                    String nickname = z1Var2.getNickname();
                                    str = !Util.isNullOrNil(z1Var2.mo73969n2()) ? z1Var2.mo73969n2() : Util.isNullOrNil(nickname) ? z1Var2.mo62909j3() : nickname;
                                }
                                if (TextUtils.isEmpty(str)) {
                                    Log.m105929w("MicroMsg.UnfamiliarContactUI", "[%s:%s]", z1Var.getUsername(), z1Var.getNickname());
                                    str2 = "";
                                } else {
                                    str2 = SpellMap.m80581a(str.charAt(0));
                                }
                                iVar.f205893a = Util.isNullOrNil(str2) ? UnfamiliarContactDetailUI.f205859B : !str2.matches("[a-zA-Z]+$") ? UnfamiliarContactDetailUI.f205859B : str2.toLowerCase().substring(0, 1);
                                iVar.f205894b = str;
                                unfamiliarContactDetailUI.f205874t.add(iVar);
                                E3.moveToNext();
                            }
                        }
                        E3.close();
                    }
                    linkedList.clear();
                }
            }
            Collections.sort(unfamiliarContactDetailUI.f205874t, new C71135a4(unfamiliarContactDetailUI));
            unfamiliarContactDetailUI.mo97807I7(unfamiliarContactDetailUI.f205874t);
        }
    }
}
