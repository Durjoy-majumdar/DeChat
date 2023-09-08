package com.tencent.p014mm.p136ui.chatting.component;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import ck3.C67391b;
import com.tencent.p014mm.p136ui.chatting.C6785i1;
import com.tencent.p014mm.p136ui.chatting.C6786j1;
import com.tencent.p014mm.p136ui.chatting.C73717h1;
import com.tencent.p014mm.p136ui.chatting.C73726k1;
import com.tencent.p014mm.p136ui.chatting.C73738l1;
import com.tencent.p014mm.p136ui.chatting.C74343y0;
import com.tencent.p014mm.pluginsdk.model.app.C72688j0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72996z1;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import nj3.C76874e0;
import nj3.C76875f0;
import qo3.C77407n;
import rb0.C47984k;
import rb0.C48009v0;
import zj3.C79368l;

/* renamed from: com.tencent.mm.ui.chatting.component.o0 */
public class C73559o0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C73655y0 f216059d;

    public C73559o0(C73655y0 y0Var) {
        this.f216059d = y0Var;
    }

    public void onClick(View view) {
        String str;
        C6785i1 i1Var;
        LinkedList linkedList;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/component/ChattingMoreComponent$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (((C79368l) this.f216059d.f215752d.f193278b.mo102812a(C79368l.class)).mo108181M5() == 0) {
            Log.m105928w("MicroMsg.ChattingMoreBtnBarHelper", "ignore click del btn, selected items count is 0");
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/component/ChattingMoreComponent$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C73655y0 y0Var = this.f216059d;
        C67391b bVar = y0Var.f215752d;
        List<C72963f4> n0 = y0Var.mo102683n0();
        C73655y0 y0Var2 = this.f216059d;
        boolean z = y0Var2.f216264i;
        C72996z1 z1Var = y0Var2.f216263h;
        if (bVar == null) {
            Log.m105928w("MicroMsg.ChattingEditModeSendToBrand", "do send to brand fail, fragment is null");
        } else if (n0.isEmpty()) {
            Log.m105928w("MicroMsg.ChattingEditModeSendToBrand", "do send to brand fail, select item empty");
        } else {
            C73738l1.C73741c cVar = new C73738l1.C73741c((C73717h1) null);
            C73738l1.f216484b = cVar;
            cVar.f216488a = new LinkedList(n0);
            C73738l1.C73741c cVar2 = C73738l1.f216484b;
            cVar2.f216489b = z;
            cVar2.f216490c = z1Var.getUsername();
            int i = 1;
            C73738l1.f216484b.f216493f = true;
            Activity f = bVar.mo91565f();
            if (f != null) {
                LayoutInflater.from(f);
                C77407n nVar = new C77407n((Context) f, 1, false);
                ArrayList arrayList2 = new ArrayList();
                new ArrayList();
                C6785i1 i1Var2 = new C6785i1(f);
                if (C72688j0.m85020f(f, "com.tencent.wework")) {
                    List<String> bO = C48009v0.Fx0().mo72763bO(25);
                    LinkedList linkedList2 = new LinkedList();
                    for (String next : bO) {
                        if (!C47984k.m53338l(next)) {
                            linkedList2.add(next);
                        }
                        i = 1;
                    }
                    Object[] objArr = new Object[i];
                    objArr[0] = Integer.valueOf(linkedList2.size());
                    i1Var = i1Var2;
                    Log.m105919d("MicroMsg.ChattingEditModeLogic", "get selected accept list without enterprise, size %d", objArr);
                    linkedList = linkedList2;
                } else {
                    i1Var = i1Var2;
                    linkedList = C74343y0.m88762f();
                }
                C6786j1 j1Var = new C6786j1(linkedList);
                str = "(Landroid/view/View;)V";
                C6785i1 i1Var3 = i1Var;
                C73726k1 k1Var = new C73726k1(n0, f, bVar, z1Var, y0Var2);
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    C76875f0 f0Var = (C76875f0) ((MenuItem) it.next());
                    f0Var.f224728w = null;
                    f0Var.f224729x = null;
                }
                arrayList2.clear();
                C76874e0 e0Var = new C76874e0(f);
                j1Var.onCreateMMMenu(e0Var);
                if (e0Var.mo107176v()) {
                    Log.m105928w("MicroMsg.MMSubMenuHelper", "show, menu empty");
                } else {
                    nVar.f225771i = j1Var;
                    nVar.f225782p = k1Var;
                    nVar.f225761d = null;
                    nVar.f225725D = i1Var3;
                    nVar.mo107573q();
                }
                C117292a.m165361g(this, "com/tencent/mm/ui/chatting/component/ChattingMoreComponent$3", "android/view/View$OnClickListener", "onClick", str);
            }
        }
        str = "(Landroid/view/View;)V";
        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/component/ChattingMoreComponent$3", "android/view/View$OnClickListener", "onClick", str);
    }
}
