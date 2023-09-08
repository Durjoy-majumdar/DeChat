package com.tencent.p014mm.chatroom.p015ui;

import android.view.View;
import com.tencent.p014mm.chatroom.p015ui.SelectMemberUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import j20.C117292a;
import java.util.Collections;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import sf0.C77691f;

/* renamed from: com.tencent.mm.chatroom.ui.c2 */
public class C40256c2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SelectMemberUI.C40250g f108267d;

    /* renamed from: com.tencent.mm.chatroom.ui.c2$a */
    public class C40257a implements Runnable {
        public C40257a() {
        }

        public void run() {
            C40256c2.this.f108267d.f108246j = false;
            View view = SelectMemberUI.this.f108218g;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/chatroom/ui/SelectMemberUI$SelectMemberAdapter$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/chatroom/ui/SelectMemberUI$SelectMemberAdapter$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C40256c2.this.f108267d.notifyDataSetChanged();
        }
    }

    public C40256c2(SelectMemberUI.C40250g gVar) {
        this.f108267d = gVar;
    }

    public void run() {
        boolean equals;
        this.f108267d.f108246j = true;
        long currentTimeMillis = System.currentTimeMillis();
        SelectMemberUI.C40250g gVar = this.f108267d;
        List<String> M7 = SelectMemberUI.this.mo62785M7();
        if (M7 == null) {
            gVar.getClass();
        } else {
            gVar.f108245i.clear();
            for (int i = 0; i < M7.size(); i++) {
                C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(M7.get(i));
                SelectMemberUI selectMemberUI = SelectMemberUI.this;
                selectMemberUI.getClass();
                if (((selectMemberUI instanceof SeeMemberRecordUI) || !C75592q0.m90764L(z1Var.getUsername())) && ((!(equals = z1Var.getUsername().equals(gVar.f108243g)) || SelectMemberUI.this.f108226r) && !SelectMemberUI.this.mo62778I7().contains(z1Var.getUsername()))) {
                    if (equals) {
                        SelectMemberUI selectMemberUI2 = SelectMemberUI.this;
                        if (selectMemberUI2.f108226r) {
                            gVar.f108245i.add(0, new SelectMemberUI.C40249f(selectMemberUI2, 1, z1Var));
                        }
                    }
                    gVar.f108245i.add(new SelectMemberUI.C40249f(SelectMemberUI.this, 1, z1Var));
                }
            }
            Collections.sort(gVar.f108245i, new C40260e2(gVar));
            gVar.f108244h = gVar.f108245i;
        }
        SelectMemberUI.C40250g gVar2 = this.f108267d;
        List<SelectMemberUI.C40249f> list = gVar2.f108245i;
        if (list != null) {
            String str = null;
            int i2 = 0;
            for (SelectMemberUI.C40249f fVar : list) {
                C72996z1 z1Var2 = fVar.f108239b;
                if (z1Var2 != null) {
                    String a = C77691f.m93686a(gVar2.mo62796a(z1Var2));
                    String substring = Util.isNullOrNil(a) ? "" : a.startsWith(gVar2.f108240d) ? "#" : a.toUpperCase().substring(0, 1);
                    if (i2 == 0) {
                        gVar2.f108247n.put(substring, Integer.valueOf(i2));
                    } else if (str != null && !substring.equals(str)) {
                        gVar2.f108247n.put(substring, Integer.valueOf(i2));
                    }
                    str = substring;
                } else {
                    str = null;
                }
                i2++;
            }
        }
        Log.m105925i("MicroMsg.SelectMemberAdapter", "[load data] cost:%sms", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        MMHandlerThread.postToMainThread(new C40257a());
    }
}
