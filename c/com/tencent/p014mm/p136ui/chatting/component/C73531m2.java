package com.tencent.p014mm.p136ui.chatting.component;

import android.app.Activity;
import android.util.Pair;
import android.view.MenuItem;
import com.tencent.p014mm.p136ui.chatting.component.GroupTodoComponent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import java.util.ArrayList;
import java.util.Iterator;
import nj3.C11184p0;
import p203mi.C24982c0;
import p203mi.C76758b0;
import p644pi.C77089d;
import p684si.C77711c;

/* renamed from: com.tencent.mm.ui.chatting.component.m2 */
public class C73531m2 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C77711c f215985d;

    /* renamed from: e */
    public final /* synthetic */ int f215986e;

    /* renamed from: f */
    public final /* synthetic */ GroupTodoComponent.C73354d f215987f;

    /* renamed from: com.tencent.mm.ui.chatting.component.m2$a */
    public class C73532a implements C76758b0.C76762d {
        public C73532a() {
        }

        /* renamed from: a */
        public void mo102497a() {
            Log.m105924i("MicroMsg.roomTodo.GroupTodoComponent", "handleTodoLongClickImp addtodo");
        }

        /* renamed from: b */
        public void mo102498b() {
            Pair pair;
            C77711c cVar = C73531m2.this.f215985d;
            Class cls = C75700k0.class;
            Class cls2 = C77089d.class;
            C77711c Lo = ((C77089d) C86312j.m106911c(cls2)).wx0().mo107864Lo(cVar.field_roomname, cVar.field_todoid);
            if (Lo == null) {
                Log.m105920e("MicroMsg.roomTodo.RoomTodoHelp", "recallTodoByTodoBarMenu stoTodo no exist");
                pair = new Pair(Boolean.FALSE, cVar.field_todoid);
            } else {
                Iterator it = ((ArrayList) Lo.f226492S).iterator();
                while (it.hasNext()) {
                    C72963f4 h302 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).h30(cVar.field_roomname, ((Long) it.next()).longValue());
                    h302.mo108737Q2("");
                    ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).xy0(h302.getMsgId(), h302);
                }
                ((C77089d) C86312j.m106911c(cls2)).zx0().mo86267a(cVar.field_roomname, 1, C76758b0.m92497b(Lo));
                boolean i = C76758b0.m92504i(Lo);
                Log.m105925i("MicroMsg.roomTodo.RoomTodoHelp", "recallTodoByTodoBarMenu todoId:%s result:%s", cVar.field_todoid, Boolean.valueOf(i));
                pair = new Pair(Boolean.valueOf(i), cVar.field_todoid);
            }
            if (((Boolean) pair.first).booleanValue()) {
                C73531m2 m2Var = C73531m2.this;
                GroupTodoComponent.this.mo102216Z5(m2Var.f215985d);
                C73531m2 m2Var2 = C73531m2.this;
                GroupTodoComponent.this.f215552j.notifyItemRemoved(m2Var2.f215986e);
                GroupTodoComponent.this.mo102219c6();
            }
            Log.m105925i("MicroMsg.roomTodo.GroupTodoComponent", "handleTodoLongClickImp recall result:%s", pair);
        }
    }

    public C73531m2(GroupTodoComponent.C73354d dVar, C77711c cVar, int i) {
        this.f215987f = dVar;
        this.f215985d = cVar;
        this.f215986e = i;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        int itemId = menuItem.getItemId();
        if (itemId == 1) {
            Activity f = GroupTodoComponent.this.f215752d.mo91565f();
            String r = GroupTodoComponent.this.f215752d.mo91577r();
            C77711c cVar = this.f215985d;
            String str = cVar.field_todoid;
            String str2 = cVar.field_username;
            boolean n2 = cVar.mo107863n2();
            C76758b0.m92503h(f, r, str, str2, false, 1, n2 ? 1 : 0, 0, new C73532a());
        } else if (itemId == 2) {
            boolean i2 = C76758b0.m92504i(this.f215985d);
            Log.m105925i("MicroMsg.roomTodo.GroupTodoComponent", "handleTodoLongClickImp delete(%s) result:%s", this.f215985d.field_todoid, Boolean.valueOf(i2));
            if (i2) {
                GroupTodoComponent.this.mo102216Z5(this.f215985d);
                GroupTodoComponent.this.f215552j.notifyItemRemoved(this.f215986e);
                GroupTodoComponent.this.mo102219c6();
            }
            String r2 = GroupTodoComponent.this.f215752d.mo91577r();
            boolean n25 = this.f215985d.mo107863n2();
            C77711c cVar2 = this.f215985d;
            C24982c0.m31598b(r2, n25 ? 1 : 0, 2, 2, cVar2.field_todoid, cVar2.field_username);
        }
    }
}
