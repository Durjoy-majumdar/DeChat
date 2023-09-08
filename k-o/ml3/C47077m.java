package ml3;

import android.content.Intent;
import android.graphics.Point;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.View;
import android.widget.AdapterView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.bizchat.BizChatConversationUI;
import com.tencent.p014mm.p136ui.conversation.BaseConversationUI;
import com.tencent.p014mm.p136ui.conversation.C44947a1;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72976h2;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C97625j3;
import j20.C117292a;
import k20.C9556a;
import ke3.C88144b;
import nj3.C11184p0;
import ob0.C11385n;
import p227rn.C48053v;
import p248ug.C52558c;
import p629ny.C76979h;
import qo3.C89779i0;
import rb0.C47969h;
import rb0.C47984k;
import rb0.C48009v0;
import uo3.C78253a;

/* renamed from: ml3.m */
public class C47077m implements C47079n, C11385n {

    /* renamed from: d */
    public BaseConversationUI f126511d;

    /* renamed from: e */
    public String f126512e;

    /* renamed from: f */
    public C89779i0 f126513f;

    /* renamed from: g */
    public boolean f126514g = false;

    /* renamed from: h */
    public final C47078a f126515h = new C47078a();

    /* renamed from: ml3.m$a */
    public class C47078a implements View.OnCreateContextMenuListener {

        /* renamed from: d */
        public C78253a f126516d;

        /* renamed from: e */
        public C11184p0 f126517e;

        /* renamed from: f */
        public String f126518f = "";

        public C47078a() {
        }

        public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(this.f126518f);
            if (z1Var == null) {
                Log.m105920e("EnterpriseConversationPresenter", "onCreateContextMenu, contact is null, talker = " + this.f126518f);
                return;
            }
            String f = z1Var.mo62898f();
            if (f.toLowerCase().endsWith("@chatroom") && Util.isNullOrNil(z1Var.getNickname())) {
                f = C47077m.this.f126511d.getString(C0966R.string.bba);
            }
            AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (AdapterView.AdapterContextMenuInfo) contextMenuInfo;
            contextMenu.setHeaderTitle(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(C47077m.this.f126511d, f));
            if (z1Var.mo62940x3()) {
                contextMenu.add(adapterContextMenuInfo.position, 3, 0, C0966R.string.f361011gm3);
            } else {
                contextMenu.add(adapterContextMenuInfo.position, 3, 0, C0966R.string.cbd);
            }
            contextMenu.add(adapterContextMenuInfo.position, 2, 1, C0966R.string.cb7);
            contextMenu.add(adapterContextMenuInfo.position, 1, 2, C0966R.string.gm7);
        }
    }

    public C47077m(BaseConversationUI baseConversationUI, String str) {
        this.f126511d = baseConversationUI;
        this.f126512e = str;
    }

    /* renamed from: a */
    public boolean mo72211a(View view, Point point, int i, long j, C44947a1.C44951d dVar) {
        Point point2 = point;
        C47078a aVar = this.f126515h;
        aVar.f126516d = new C78253a(C47077m.this.f126511d);
        aVar.f126517e = new C47076l(aVar);
        C47078a aVar2 = this.f126515h;
        int i2 = point2.x;
        int i3 = point2.y;
        C72976h2 h2Var = dVar.f121942c;
        aVar2.getClass();
        if (h2Var == null) {
            return true;
        }
        aVar2.f126518f = h2Var.getUsername();
        aVar2.f126516d.mo108272g(view, i, j, aVar2, aVar2.f126517e, i2, i3);
        return true;
    }

    /* renamed from: b */
    public void mo72212b(C44947a1.C44951d dVar) {
        C72976h2 h2Var = dVar.f121942c;
        if (h2Var != null) {
            if (((C48053v) C86312j.m106911c(C48053v.class)).mo72614OE(h2Var.getUsername())) {
                Intent intent = new Intent(this.f126511d, BizChatConversationUI.class);
                intent.putExtra("Contact_User", h2Var.getUsername());
                intent.putExtra("biz_chat_from_scene", 7);
                intent.addFlags(67108864);
                BaseConversationUI baseConversationUI = this.f126511d;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                BaseConversationUI baseConversationUI2 = baseConversationUI;
                C117292a.m165358d(baseConversationUI2, aVar.mo10232b(), "com/tencent/mm/ui/conversation/presenter/EnterpriseConversationPresenter", "onItemClick", "(Lcom/tencent/mm/ui/conversation/MergeBizChatConversationAdapter$BizChatConversationHolder;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                baseConversationUI.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(baseConversationUI2, "com/tencent/mm/ui/conversation/presenter/EnterpriseConversationPresenter", "onItemClick", "(Lcom/tencent/mm/ui/conversation/MergeBizChatConversationAdapter$BizChatConversationHolder;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else if (C47984k.m53339m(h2Var.getUsername())) {
                C52558c b = C47984k.m53328b(h2Var.getUsername());
                String B = b == null ? null : b.mo72807B();
                if (B == null) {
                    B = "";
                }
                Intent intent2 = new Intent();
                intent2.putExtra("rawUrl", B);
                intent2.putExtra("useJs", true);
                intent2.putExtra("srcUsername", h2Var.getUsername());
                intent2.putExtra("bizofstartfrom", "enterpriseHomeSubBrand");
                intent2.putExtra("geta8key_scene", 51);
                intent2.addFlags(67108864);
                C88144b.m109791i(this.f126511d, "webview", ".ui.tools.WebViewUI", intent2, (Bundle) null);
                mo72225c(b, 2, h2Var.mo108786G2());
            } else {
                Bundle bundle = new Bundle();
                bundle.putBoolean("key_is_biz_chat", false);
                this.f126511d.startChatting(h2Var.getUsername(), bundle, true);
                mo72225c(C47984k.m53328b(h2Var.getUsername()), 1, h2Var.mo108786G2());
            }
        }
    }

    /* renamed from: c */
    public final void mo72225c(C52558c cVar, int i, int i2) {
        C47969h jo = C48009v0.Ex0().mo72749jo(this.f126512e);
        long j = 0;
        long j2 = jo != null ? jo.field_wwCorpId : 0;
        long j3 = jo != null ? jo.field_wwUserVid : 0;
        int i3 = i2 > 0 ? 1 : 2;
        if (cVar != null) {
            j = cVar.mo73497o2();
        }
        C115669n.INSTANCE.mo160131h(14507, Long.valueOf(j2), Long.valueOf(j), Long.valueOf(j3), 1, Integer.valueOf(i3), Integer.valueOf(i));
        Log.m105919d("EnterpriseConversationPresenter", "enter biz enterprise sub barnd report: %s,%s,%s,%s,%s,%s", Long.valueOf(j2), Long.valueOf(j), Long.valueOf(j3), 1, Integer.valueOf(i3), Integer.valueOf(i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
        r5 = r3.f127055a.f127080a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSceneEnd(int r3, int r4, java.lang.String r5, ob0.C117747y r6) {
        /*
            r2 = this;
            qo3.i0 r5 = r2.f126513f
            if (r5 == 0) goto L_0x000f
            boolean r5 = r5.isShowing()
            if (r5 == 0) goto L_0x000f
            qo3.i0 r5 = r2.f126513f
            r5.dismiss()
        L_0x000f:
            if (r3 != 0) goto L_0x00f7
            if (r4 == 0) goto L_0x0015
            goto L_0x00f7
        L_0x0015:
            int r3 = r6.getType()
            r4 = 1394(0x572, float:1.953E-42)
            if (r3 != r4) goto L_0x00f7
            r3 = r6
            ef2.d r3 = (ef2.C45654d) r3
            ob0.c r3 = r3.f123452e
            r4 = 0
            if (r3 == 0) goto L_0x002e
            ob0.c$c r5 = r3.f127055a
            pe3.a r5 = r5.f127080a
            if (r5 == 0) goto L_0x002e
            te3.td4 r5 = (te3.td4) r5
            goto L_0x002f
        L_0x002e:
            r5 = r4
        L_0x002f:
            if (r3 == 0) goto L_0x003a
            ob0.c$d r3 = r3.f127056b
            pe3.a r3 = r3.f127083a
            if (r3 == 0) goto L_0x003a
            r4 = r3
            te3.ud4 r4 = (te3.ud4) r4
        L_0x003a:
            r3 = 0
            r0 = 1
            if (r4 == 0) goto L_0x00c1
            te3.am3 r1 = r4.f142790d
            if (r1 == 0) goto L_0x00c1
            int r1 = r1.f130638d
            if (r1 == 0) goto L_0x0048
            goto L_0x00c1
        L_0x0048:
            boolean r4 = r5.f142140e
            if (r4 != 0) goto L_0x004d
            return
        L_0x004d:
            java.lang.String r4 = r5.f142139d
            ug.c r4 = rb0.C47984k.m53328b(r4)
            int r6 = r4.field_brandFlag
            r6 = r6 | r0
            r4.field_brandFlag = r6
            te3.by2 r6 = new te3.by2
            r6.<init>()
            int r0 = r4.field_brandFlag
            r6.f131388d = r0
            java.lang.String r5 = r5.f142139d
            r6.f131389e = r5
            eb0.c r5 = eb0.C97625j3.m125812b()
            g62.m r5 = r5.mo105876B()
            g62.n r0 = new g62.n
            r1 = 47
            r0.<init>(r1, r6)
            tc0.p r5 = (tc0.C77885p) r5
            r5.mo107993q(r0)
            rb0.j r5 = rb0.C48009v0.Fx0()
            java.lang.String[] r3 = new java.lang.String[r3]
            r5.update(r4, (java.lang.String[]) r3)
            eb0.c r3 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v3 r3 = r3.mo105908w()
            java.lang.String r5 = r4.field_username
            com.tencent.mm.storage.i2 r3 = (com.tencent.p014mm.storage.C44660i2) r3
            r3.mo69763f(r5)
            eb0.c r3 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v3 r3 = r3.mo105908w()
            java.lang.String r5 = r4.field_enterpriseFather
            com.tencent.mm.storage.i2 r3 = (com.tencent.p014mm.storage.C44660i2) r3
            int r3 = r3.mo69740K(r5)
            if (r3 > 0) goto L_0x00b3
            eb0.c r3 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v3 r3 = r3.mo105908w()
            java.lang.String r4 = r4.field_enterpriseFather
            com.tencent.mm.storage.i2 r3 = (com.tencent.p014mm.storage.C44660i2) r3
            r3.mo69763f(r4)
            goto L_0x00f7
        L_0x00b3:
            eb0.c r3 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.b0 r3 = r3.mo105898m()
            java.lang.String r4 = r4.field_enterpriseFather
            r3.mo69633b(r4)
            goto L_0x00f7
        L_0x00c1:
            java.lang.String r5 = "EnterpriseConversationPresenter"
            if (r4 == 0) goto L_0x00e6
            te3.am3 r1 = r4.f142790d
            if (r1 == 0) goto L_0x00e6
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            int r6 = r6.getType()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r1[r3] = r6
            te3.am3 r3 = r4.f142790d
            int r3 = r3.f130638d
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r0] = r3
            java.lang.String r3 = "chuangchen onSceneEnd type:%s, err:code:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r5, r3, r1)
            goto L_0x00f7
        L_0x00e6:
            java.lang.Object[] r4 = new java.lang.Object[r0]
            int r6 = r6.getType()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4[r3] = r6
            java.lang.String r3 = "chuangchen onSceneEnd type:%s, err:resp == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r5, r3, r4)
        L_0x00f7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ml3.C47077m.onSceneEnd(int, int, java.lang.String, ob0.y):void");
    }
}
