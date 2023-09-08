package cz1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.game.report.C40306c;
import com.tencent.p014mm.plugin.game.p061ui.chat_tab.C42293e;
import com.tencent.p014mm.plugin.game.p061ui.chat_tab.GameHotMsgView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import ke3.C88144b;
import p196ln.C76705f;
import rx3.C13598b0;
import wy1.C53224d;
import xy1.C15913g;
import xy1.C53472h;
import xy1.C79011i;
import zt3.C119157j;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: cz1.g */
public final class C45228g extends C86301e implements C53472h {

    /* renamed from: cz1.g$a */
    public static final class C45229a extends C87413o implements C32227p<Boolean, List<? extends C7143c>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C53472h.C53473a f122568d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45229a(C53472h.C53473a aVar) {
            super(2);
            this.f122568d = aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Boolean) obj).booleanValue();
            List<C7143c> list = (List) obj2;
            C87412m.m108594g(list, "result");
            C53472h.C53473a aVar = this.f122568d;
            if (aVar != null) {
                GameHotMsgView.C42253b bVar = (GameHotMsgView.C42253b) aVar;
                LinkedList linkedList = new LinkedList();
                if (!Util.isNullOrNil((List) list)) {
                    for (C7143c cVar : list) {
                        GameHotMsgView.C42256d dVar = new GameHotMsgView.C42256d(GameHotMsgView.this, (GameHotMsgView.C42252a) null);
                        dVar.f114239d = cVar.field_updateTime / 1000;
                        dVar.f114240e = cVar;
                        linkedList.add(dVar);
                    }
                }
                int size = linkedList.size();
                Collections.sort(linkedList);
                ((C119157j) C119157j.f356862d).mo183895z(new C42293e(bVar, size, linkedList));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: G */
    public boolean mo70721G(String str, String str2) {
        Class cls = C53224d.class;
        C45230i zx02 = ((C53224d) C86312j.m106911c(cls)).zx0();
        C87412m.m108591d(str);
        C7143c jo = zx02.mo70735jo(str);
        if (str2 == null) {
            str2 = "";
        }
        jo.field_editingMsg = str2;
        return ((C53224d) C86312j.m106911c(cls)).zx0().updateNotify(jo, false, new String[0]);
    }

    /* renamed from: Ip */
    public void mo70722Ip(int i, int i2, C53472h.C53473a aVar) {
        C45229a aVar2 = new C45229a(aVar);
        List<C7143c> Xs = ((C53224d) C86312j.m106911c(C53224d.class)).zx0().mo70734Xs(i, i2);
        for (C7143c cVar : Xs) {
            ((C76705f) C86312j.m106911c(C76705f.class)).mo106829VT().loadBitmap(cVar.field_selfUserName);
        }
        C7144e.f25118a.mo8337b(Xs, new C7148f(aVar2));
    }

    /* renamed from: K */
    public void mo70723K(String str) {
        boolean z = false;
        if (str != null) {
            if (C72996z1.m85832c5(str)) {
                z = true;
            } else {
                Log.m105924i("GameLife.PluginGameLife", "check sessionId failed");
            }
        }
        if (z) {
            C45230i zx02 = ((C53224d) C86312j.m106911c(C53224d.class)).zx0();
            C87412m.m108591d(str);
            zx02.mo70733K(str);
        }
    }

    public void K10(Context context, C7143c cVar) {
        Class cls = C15913g.class;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(cVar, "conversation");
        ((C79011i) C86312j.m106911c(C79011i.class)).mo71417oN();
        Intent intent = new Intent();
        intent.putExtra("Chat_Self", cVar.field_selfUserName);
        intent.putExtra("Chat_User", cVar.field_sessionId);
        intent.putExtra("finish_direct", true);
        C40306c.f108374a.mo62987d((String) null);
        C88144b.m109801s(context, ".ui.chatting.ChattingUI", intent, (Bundle) null);
        ((C15913g) C86312j.m106911c(cls)).mo438Tx(cVar.field_talker);
        ((C15913g) C86312j.m106911c(cls)).mo438Tx(cVar.field_selfUserName);
    }

    /* renamed from: U */
    public String mo70725U(String str) {
        boolean z = false;
        if (str != null) {
            if (C72996z1.m85832c5(str)) {
                z = true;
            } else {
                Log.m105924i("GameLife.PluginGameLife", "check sessionId failed");
            }
        }
        if (!z) {
            return "";
        }
        C45230i zx02 = ((C53224d) C86312j.m106911c(C53224d.class)).zx0();
        C87412m.m108591d(str);
        String str2 = zx02.mo70735jo(str).field_editingMsg;
        return str2 == null ? "" : str2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0087, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0088, code lost:
        cy3.C58003b.m67160a(r0, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008b, code lost:
        throw r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0017  */
    /* renamed from: V */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo70726V(java.lang.String r7) {
        /*
            r6 = this;
            r0 = 1
            java.lang.String r1 = "check sessionId failed"
            java.lang.String r2 = "GameLife.PluginGameLife"
            r3 = 0
            if (r7 == 0) goto L_0x0013
            boolean r4 = com.tencent.p014mm.storage.C72996z1.m85832c5(r7)
            if (r4 == 0) goto L_0x0010
            r4 = 1
            goto L_0x0014
        L_0x0010:
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
        L_0x0013:
            r4 = 0
        L_0x0014:
            if (r4 != 0) goto L_0x0017
            return r3
        L_0x0017:
            java.lang.Class<wy1.d> r4 = wy1.C53224d.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            wy1.d r4 = (wy1.C53224d) r4
            cz1.i r4 = r4.zx0()
            gy3.C87412m.m108591d(r7)
            boolean r5 = com.tencent.p014mm.storage.C72996z1.m85832c5(r7)
            if (r5 == 0) goto L_0x002d
            goto L_0x0031
        L_0x002d:
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            r0 = 0
        L_0x0031:
            if (r0 != 0) goto L_0x0034
            goto L_0x0084
        L_0x0034:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "SELECT sessionId from GameLifeConversation WHERE sessionId='"
            r0.append(r1)
            r0.append(r7)
            r1 = 39
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r1 = r4.f122570d
            r2 = 0
            android.database.Cursor r0 = r1.rawQuery(r0, r2)
            boolean r1 = r0.moveToFirst()     // Catch:{ all -> 0x0085 }
            if (r1 == 0) goto L_0x0061
            boolean r1 = r0.isAfterLast()     // Catch:{ all -> 0x0085 }
            if (r1 != 0) goto L_0x0061
            int r3 = r0.getInt(r3)     // Catch:{ all -> 0x0085 }
        L_0x0061:
            rx3.b0 r1 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0085 }
            cy3.C58003b.m67160a(r0, r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[getUnreadCount] "
            r0.append(r1)
            r0.append(r7)
            r7 = 32
            r0.append(r7)
            r0.append(r3)
            java.lang.String r7 = r0.toString()
            java.lang.String r0 = "GameLife.ConversationStorage"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r7)
        L_0x0084:
            return r3
        L_0x0085:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x0087 }
        L_0x0087:
            r1 = move-exception
            cy3.C58003b.m67160a(r0, r7)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: cz1.C45228g.mo70726V(java.lang.String):int");
    }

    public boolean d50(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        C45230i zx02 = ((C53224d) C86312j.m106911c(C53224d.class)).zx0();
        C7143c jo = zx02.mo70735jo(str);
        boolean deleteNotify = zx02.deleteNotify(jo.systemRowid, false);
        zx02.doNotify(MStorageEventData.EventType.SINGLE, 3, jo);
        return deleteNotify;
    }

    /* renamed from: g */
    public void mo70728g(MStorage.IOnStorageChange iOnStorageChange) {
        C87412m.m108594g(iOnStorageChange, "storageChange");
        ((C53224d) C86312j.m106911c(C53224d.class)).zx0().remove(iOnStorageChange);
    }

    /* renamed from: i */
    public void mo70729i(MStorage.IOnStorageChange iOnStorageChange) {
        C87412m.m108594g(iOnStorageChange, "storageChange");
        ((C53224d) C86312j.m106911c(C53224d.class)).zx0().add(iOnStorageChange);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0044, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0045, code lost:
        cy3.C58003b.m67160a(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0048, code lost:
        throw r2;
     */
    /* renamed from: kd */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo70730kd() {
        /*
            r4 = this;
            java.lang.Class<wy1.d> r0 = wy1.C53224d.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            wy1.d r0 = (wy1.C53224d) r0
            cz1.i r0 = r0.zx0()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r0.f122570d
            r1 = 0
            java.lang.String r2 = "SELECT SUM(unReadCount) FROM GameLifeConversation WHERE sessionId<>'@gamelifehistory'"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)
            boolean r2 = r0.moveToFirst()     // Catch:{ all -> 0x0042 }
            r3 = 0
            if (r2 == 0) goto L_0x0026
            boolean r2 = r0.isAfterLast()     // Catch:{ all -> 0x0042 }
            if (r2 != 0) goto L_0x0026
            int r3 = r0.getInt(r3)     // Catch:{ all -> 0x0042 }
        L_0x0026:
            rx3.b0 r2 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0042 }
            cy3.C58003b.m67160a(r0, r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[getTotalUnreadCount] "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "GameLife.ConversationStorage"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            return r3
        L_0x0042:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0044 }
        L_0x0044:
            r2 = move-exception
            cy3.C58003b.m67160a(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: cz1.C45228g.mo70730kd():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0097, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0098, code lost:
        cy3.C58003b.m67160a(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009b, code lost:
        throw r2;
     */
    /* renamed from: vY */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public cz1.C45227d mo70731vY() {
        /*
            r15 = this;
            java.lang.Class<wy1.d> r0 = wy1.C53224d.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            wy1.d r0 = (wy1.C53224d) r0
            cz1.i r0 = r0.zx0()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r0.f122570d
            java.lang.String r1 = "SELECT *, rowid FROM GameLifeConversation WHERE unReadCount>0 ORDER BY updateTime DESC LIMIT 1"
            r2 = 0
            android.database.Cursor r0 = r0.rawQuery(r1, r2)
            boolean r1 = r0.moveToFirst()     // Catch:{ all -> 0x0095 }
            if (r1 == 0) goto L_0x002d
            boolean r1 = r0.isAfterLast()     // Catch:{ all -> 0x0095 }
            if (r1 != 0) goto L_0x002d
            cz1.c r1 = new cz1.c     // Catch:{ all -> 0x0095 }
            r1.<init>()     // Catch:{ all -> 0x0095 }
            r1.convertFrom(r0)     // Catch:{ all -> 0x0095 }
            cy3.C58003b.m67160a(r0, r2)
            goto L_0x0033
        L_0x002d:
            rx3.b0 r1 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0095 }
            cy3.C58003b.m67160a(r0, r2)
            r1 = r2
        L_0x0033:
            r3 = 0
            if (r1 == 0) goto L_0x003b
            long r5 = r1.field_lastMsgID
            r9 = r5
            goto L_0x003c
        L_0x003b:
            r9 = r3
        L_0x003c:
            r0 = 0
            if (r1 == 0) goto L_0x0054
            java.lang.String r2 = r1.field_talker
            if (r2 == 0) goto L_0x004c
            int r2 = r2.length()
            if (r2 != 0) goto L_0x004a
            goto L_0x004c
        L_0x004a:
            r2 = 0
            goto L_0x004d
        L_0x004c:
            r2 = 1
        L_0x004d:
            if (r2 == 0) goto L_0x0052
            java.lang.String r2 = "@gamelifehistory"
            goto L_0x0054
        L_0x0052:
            java.lang.String r2 = r1.field_talker
        L_0x0054:
            r8 = r2
            f40.o r2 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r2 = r2.mo121142i()
            com.tencent.mm.storage.y1$a r5 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_GAME_LIFE_LAST_SAVED_MSG_TYPE_INT
            int r12 = r2.mo119689j(r5, r0)
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r2 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_GAME_LIFE_LAST_SAVED_EXTERN_INFO_STRING
            java.lang.String r5 = ""
            java.lang.String r11 = r0.mo119675I(r2, r5)
            if (r1 == 0) goto L_0x0077
            long r3 = r1.field_updateTime
        L_0x0077:
            r13 = r3
            cz1.d r0 = new cz1.d
            r7 = r0
            r7.<init>(r8, r9, r11, r12, r13)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "getLatestConversationInfo: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "GameLife.ConversationService"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            return r0
        L_0x0095:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0097 }
        L_0x0097:
            r2 = move-exception
            cy3.C58003b.m67160a(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: cz1.C45228g.mo70731vY():cz1.d");
    }

    /* renamed from: y2 */
    public C45230i mo70732y2() {
        return ((C53224d) C86312j.m106911c(C53224d.class)).zx0();
    }
}
