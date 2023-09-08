package yw1;

import ax1.C39639c;
import ax1.C39641d;
import bx1.C39849d;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomUserData;
import com.tencent.p014mm.plugin.game.autogen.chatroom.GetChatroomMemberInfoResponse;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86301e;
import di3.C86312j;
import eb0.C31543z5;
import ei3.C86522b;
import ex1.C45709b;
import hp3.C87581a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import ob0.C89132b;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: yw1.a */
public class C53587a extends C86301e implements C39639c {

    /* renamed from: d */
    public Map<String, C39641d> f150590d = new ConcurrentHashMap();

    /* renamed from: yw1.a$a */
    public class C53588a implements C39639c.C39640a {

        /* renamed from: a */
        public final /* synthetic */ C39639c.C39640a f150591a;

        public C53588a(C39639c.C39640a aVar) {
            this.f150591a = aVar;
        }

        /* renamed from: a */
        public void mo62195a(Map<String, C39641d> map) {
            if (map == null) {
                map = new HashMap<>();
            }
            C39639c.C39640a aVar = this.f150591a;
            if (aVar != null) {
                aVar.mo62195a(map);
            }
            C53587a aVar2 = C53587a.this;
            Collection<C39641d> values = map.values();
            aVar2.getClass();
            if (values != null && values.size() != 0) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (C39641d next : values) {
                    long c = C31543z5.m39453c() - next.getUpdateTime();
                    Log.m105919d("GameChatRoom.ChatRoomContactService", "syncTime diff:%d,contact.field_updateTime:%d", Long.valueOf(c), Long.valueOf(next.getUpdateTime()));
                    if (c >= 86400000) {
                        linkedHashSet.add(next.getUserName());
                    }
                }
                Log.m105925i("GameChatRoom.ChatRoomContactService", "contact need update, size: %d", Integer.valueOf(linkedHashSet.size()));
                aVar2.vx0(new ArrayList(linkedHashSet), (C39639c.C39640a) null);
            }
        }
    }

    /* renamed from: yw1.a$b */
    public class C53589b implements C39639c.C39640a {

        /* renamed from: a */
        public final /* synthetic */ Map f150593a;

        /* renamed from: b */
        public final /* synthetic */ C39639c.C39640a f150594b;

        public C53589b(C53587a aVar, Map map, C39639c.C39640a aVar2) {
            this.f150593a = map;
            this.f150594b = aVar2;
        }

        /* renamed from: a */
        public void mo62195a(Map<String, C39641d> map) {
            if (map != null) {
                this.f150593a.putAll(map);
            }
            this.f150594b.mo62195a(this.f150593a);
        }
    }

    /* renamed from: yw1.a$c */
    public class C53590c implements C87581a<Void, C89132b.C89134c<GetChatroomMemberInfoResponse>> {

        /* renamed from: a */
        public final /* synthetic */ Map f150595a;

        /* renamed from: b */
        public final /* synthetic */ List f150596b;

        /* renamed from: c */
        public final /* synthetic */ C39639c.C39640a f150597c;

        public C53590c(Map map, List list, C39639c.C39640a aVar) {
            this.f150595a = map;
            this.f150596b = list;
            this.f150597c = aVar;
        }

        public Object call(Object obj) {
            LinkedList<ChatroomUserData> linkedList;
            C39641d jo;
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            Class cls = C53609m.class;
            Log.m105925i("GameChatRoom.ChatRoomContactService", "get contact from server errType:%d, errCode:%d, errMsg:%s", Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256794b), cVar.f256795c);
            if (cVar.f256793a == 0 && cVar.f256794b == 0 && (linkedList = ((GetChatroomMemberInfoResponse) cVar.f256796d).user_data_list) != null) {
                Log.m105925i("GameChatRoom.ChatRoomContactService", "get contact from server success, count %d", Integer.valueOf(linkedList.size()));
                Iterator<ChatroomUserData> it = ((GetChatroomMemberInfoResponse) cVar.f256796d).user_data_list.iterator();
                while (it.hasNext()) {
                    ChatroomUserData next = it.next();
                    ((C53609m) C86312j.m106911c(cls)).vx0().mo71198Lo(C53599f.m60119a(next));
                    if (!Util.isNullOrNil(next.username) && (jo = ((C53609m) C86312j.m106911c(cls)).vx0().mo71199jo(next.username)) != null) {
                        this.f150595a.put(next.username, jo);
                        ((ConcurrentHashMap) C53587a.this.f150590d).put(next.username, jo);
                    }
                }
            }
            for (String str : this.f150596b) {
                if (!this.f150595a.containsKey(str)) {
                    C45709b bVar = new C45709b();
                    bVar.field_userName = str;
                    this.f150595a.put(str, bVar);
                }
            }
            C39639c.C39640a aVar = this.f150597c;
            if (aVar == null) {
                return null;
            }
            aVar.mo62195a(this.f150595a);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00e8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e9, code lost:
        cy3.C58003b.m67160a(r8, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ec, code lost:
        throw r0;
     */
    /* renamed from: Ah */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo62191Ah(java.util.List<java.lang.String> r8, ax1.C39639c.C39640a r9) {
        /*
            r7 = this;
            yw1.a$a r0 = new yw1.a$a
            r0.<init>(r9)
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r8)
            if (r1 == 0) goto L_0x0014
            r0.mo62195a(r9)
            return
        L_0x0014:
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            java.util.Iterator r8 = r8.iterator()
        L_0x001d:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L_0x003d
            java.lang.Object r2 = r8.next()
            java.lang.String r2 = (java.lang.String) r2
            java.util.Map<java.lang.String, ax1.d> r3 = r7.f150590d
            java.util.concurrent.ConcurrentHashMap r3 = (java.util.concurrent.ConcurrentHashMap) r3
            java.lang.Object r3 = r3.get(r2)
            ax1.d r3 = (ax1.C39641d) r3
            if (r3 == 0) goto L_0x0039
            r9.put(r2, r3)
            goto L_0x001d
        L_0x0039:
            r1.add(r2)
            goto L_0x001d
        L_0x003d:
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r1)
            if (r8 == 0) goto L_0x0047
            r0.mo62195a(r9)
            return
        L_0x0047:
            java.lang.Class<yw1.m> r8 = yw1.C53609m.class
            di3.d r8 = di3.C86312j.m106911c(r8)
            yw1.m r8 = (yw1.C53609m) r8
            ex1.c r8 = r8.vx0()
            r8.getClass()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "SELECT * FROM GameChatRoomContact WHERE userName IN "
            r2.append(r3)
            java.lang.String r3 = yw1.C53601h.m60125d(r1)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r8 = r8.f123540d
            r4 = 0
            r5 = 2
            android.database.Cursor r8 = r8.rawQuery(r2, r4, r5)
            boolean r2 = r8.moveToFirst()     // Catch:{ all -> 0x00e6 }
            if (r2 == 0) goto L_0x009a
        L_0x007e:
            boolean r2 = r8.isAfterLast()     // Catch:{ all -> 0x00e6 }
            if (r2 != 0) goto L_0x009a
            ex1.b r2 = new ex1.b     // Catch:{ all -> 0x00e6 }
            r2.<init>()     // Catch:{ all -> 0x00e6 }
            r2.convertFrom(r8)     // Catch:{ all -> 0x00e6 }
            java.lang.String r5 = r2.field_userName     // Catch:{ all -> 0x00e6 }
            java.lang.String r6 = "field_userName"
            gy3.C87412m.m108593f(r5, r6)     // Catch:{ all -> 0x00e6 }
            r3.put(r5, r2)     // Catch:{ all -> 0x00e6 }
            r8.moveToNext()     // Catch:{ all -> 0x00e6 }
            goto L_0x007e
        L_0x009a:
            rx3.b0 r2 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x00e6 }
            cy3.C58003b.m67160a(r8, r4)
            r9.putAll(r3)
            java.util.Set r8 = r3.entrySet()
            java.util.Iterator r8 = r8.iterator()
        L_0x00aa:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L_0x00d3
            java.lang.Object r2 = r8.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            boolean r4 = r1.contains(r3)
            if (r4 == 0) goto L_0x00aa
            r1.remove(r3)
            java.util.Map<java.lang.String, ax1.d> r4 = r7.f150590d
            java.lang.Object r2 = r2.getValue()
            ax1.d r2 = (ax1.C39641d) r2
            java.util.concurrent.ConcurrentHashMap r4 = (java.util.concurrent.ConcurrentHashMap) r4
            r4.put(r3, r2)
            goto L_0x00aa
        L_0x00d3:
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r1)
            if (r8 == 0) goto L_0x00dd
            r0.mo62195a(r9)
            return
        L_0x00dd:
            yw1.a$b r8 = new yw1.a$b
            r8.<init>(r7, r9, r0)
            r7.vx0(r1, r8)
            return
        L_0x00e6:
            r9 = move-exception
            throw r9     // Catch:{ all -> 0x00e8 }
        L_0x00e8:
            r0 = move-exception
            cy3.C58003b.m67160a(r8, r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yw1.C53587a.mo62191Ah(java.util.List, ax1.c$a):void");
    }

    /* renamed from: LM */
    public void mo62192LM(ChatroomUserData chatroomUserData) {
        Class cls = C53609m.class;
        if (((C53609m) C86312j.m106911c(cls)).vx0().mo71198Lo(C53599f.m60119a(chatroomUserData))) {
            ((ConcurrentHashMap) this.f150590d).put(chatroomUserData.username, ((C53609m) C86312j.m106911c(cls)).vx0().mo71199jo(chatroomUserData.username));
        }
    }

    /* renamed from: X3 */
    public C39641d mo62193X3(String str) {
        if (Util.isNullOrNil(str)) {
            return null;
        }
        C39641d dVar = (C39641d) ((ConcurrentHashMap) this.f150590d).get(str);
        if (dVar != null) {
            return dVar;
        }
        C39641d jo = ((C53609m) C86312j.m106911c(C53609m.class)).vx0().mo71199jo(str);
        if (jo != null) {
            ((ConcurrentHashMap) this.f150590d).put(str, jo);
        }
        return jo;
    }

    public void lx0(String str, C39639c.C39640a aVar) {
        mo62191Ah(Arrays.asList(new String[]{str}), aVar);
    }

    public final void vx0(List<String> list, C39639c.C39640a aVar) {
        if (!Util.isNullOrNil((List) list)) {
            new C39849d(new LinkedList(list)).mo9225i().mo123419C(new C53590c(new HashMap(), list, aVar));
        } else if (aVar != null) {
            aVar.mo62195a((Map<String, C39641d>) null);
        }
    }
}
