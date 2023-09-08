package ix1;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.tencent.p014mm.game.report.C40308d;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomMsgPack;
import com.tencent.p014mm.plugin.game.autogen.chatroom.JumpInfo;
import com.tencent.p014mm.plugin.game.luggage.C41985r;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import sn0.C90259e;
import yw1.C53601h;

/* renamed from: ix1.y */
public class C46351y extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: d */
    public final /* synthetic */ JumpInfo f124917d;

    /* renamed from: e */
    public final /* synthetic */ C46337n f124918e;

    public C46351y(C46337n nVar, JumpInfo jumpInfo) {
        this.f124918e = nVar;
        this.f124917d = jumpInfo;
    }

    public boolean onContextClick(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/chatroom/piece/GameChatItemVH$3", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onContextClick = super.onContextClick(motionEvent);
        C117292a.m165362h(onContextClick, this, "com/tencent/mm/plugin/game/chatroom/piece/GameChatItemVH$3", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
        return onContextClick;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onDoubleTap(android.view.MotionEvent r13) {
        /*
            r12 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r13)
            java.lang.Object[] r6 = r0.toArray()
            r0.clear()
            java.lang.String r1 = "com/tencent/mm/plugin/game/chatroom/piece/GameChatItemVH$3"
            java.lang.String r2 = "android/view/GestureDetector$SimpleOnGestureListener"
            java.lang.String r3 = "onDoubleTap"
            java.lang.String r4 = "(Landroid/view/MotionEvent;)Z"
            r5 = r12
            j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
            ix1.n r0 = r12.f124918e
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack r1 = r0.f124841G
            java.lang.String r1 = r1.from_username
            if (r1 == 0) goto L_0x010e
            java.lang.String r2 = r0.f124869Z0
            if (r2 != 0) goto L_0x0029
            goto L_0x010e
        L_0x0029:
            java.util.HashMap<rx3.l<java.lang.String, java.lang.String>, java.lang.Long> r3 = ix1.C46326i0.f124817a
            rx3.l r3 = new rx3.l
            r3.<init>(r2, r1)
            long r1 = java.lang.System.currentTimeMillis()
            java.util.HashMap<rx3.l<java.lang.String, java.lang.String>, java.lang.Long> r4 = ix1.C46326i0.f124817a
            java.lang.Object r3 = r4.get(r3)
            java.lang.Long r3 = (java.lang.Long) r3
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x006c
            long r6 = r3.longValue()
            long r1 = r1 - r6
            py1.u r3 = com.tencent.p014mm.plugin.game.commlib.C41853c.m45368b()
            if (r3 == 0) goto L_0x005e
            py1.c5 r3 = r3.f128046g
            if (r3 == 0) goto L_0x0056
            int r3 = r3.f127627d
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0057
        L_0x0056:
            r3 = 0
        L_0x0057:
            if (r3 == 0) goto L_0x005e
            int r3 = r3.intValue()
            goto L_0x0060
        L_0x005e:
            r3 = 60
        L_0x0060:
            long r6 = (long) r3
            r8 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 * r8
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 <= 0) goto L_0x006a
            goto L_0x006c
        L_0x006a:
            r1 = 0
            goto L_0x006d
        L_0x006c:
            r1 = 1
        L_0x006d:
            if (r1 == 0) goto L_0x00b2
            java.lang.String r1 = r0.f124869Z0
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack r2 = r0.f124841G
            java.lang.String r2 = r2.from_username
            boolean r1 = ix1.C46326i0.m51633b(r1, r2)
            r0.mo71731E(r1)
            java.lang.String r1 = r0.f124869Z0
            if (r1 == 0) goto L_0x010e
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack r0 = r0.f124841G
            java.lang.String r0 = r0.from_username
            if (r0 == 0) goto L_0x010e
            com.tencent.mm.plugin.game.autogen.chatroom.TickleSomeoneRequest r2 = new com.tencent.mm.plugin.game.autogen.chatroom.TickleSomeoneRequest
            r2.<init>()
            r2.chatroom_name = r1
            r2.to_username = r0
            ob0.c$b r3 = new ob0.c$b
            r3.<init>()
            r3.f127066a = r2
            com.tencent.mm.plugin.game.autogen.chatroom.TickleSomeoneResponse r2 = new com.tencent.mm.plugin.game.autogen.chatroom.TickleSomeoneResponse
            r2.<init>()
            r3.f127067b = r2
            java.lang.String r2 = "/cgi-bin/mmgame-bin/gamegamelifeappsvr/ticklesomeone"
            r3.f127068c = r2
            r2 = 4856(0x12f8, float:6.805E-42)
            r3.f127069d = r2
            ob0.c r2 = r3.mo72403a()
            ix1.h0 r3 = new ix1.h0
            r3.<init>(r1, r0)
            ob0.C89144l0.m111429e(r2, r3, r5)
            goto L_0x010e
        L_0x00b2:
            java.lang.String r1 = r0.f124869Z0
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack r2 = r0.f124841G
            java.lang.String r2 = r2.from_username
            long r1 = ix1.C46326i0.m51632a(r1, r2)
            r6 = -1
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 == 0) goto L_0x010b
            java.lang.String r1 = r0.f124869Z0
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack r2 = r0.f124841G
            java.lang.String r2 = r2.from_username
            long r1 = ix1.C46326i0.m51632a(r1, r2)
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack r3 = r0.f124841G
            java.lang.String r3 = r3.from_username
            qo3.n r5 = new qo3.n
            android.content.Context r6 = r0.f124838D
            r5.<init>((android.content.Context) r6, (int) r4, (boolean) r4)
            android.content.Context r6 = r0.f124838D
            r7 = 2131834859(0x7f1137eb, float:1.930284E38)
            java.lang.String r6 = r6.getString(r7)
            android.content.Context r7 = r0.f124838D
            r8 = 14
            int r7 = kg3.C76577a.m92151b(r7, r8)
            r5.mo107568m(r6, r4, r7)
            ix1.n$$a r4 = new ix1.n$$a
            r4.<init>(r0)
            r5.f225771i = r4
            ix1.n$$b r4 = new ix1.n$$b
            r4.<init>()
            r5.f225773j = r4
            ix1.n$$c r4 = new ix1.n$$c
            r4.<init>(r0, r1, r3)
            r5.f225782p = r4
            ix1.n$$d r0 = new ix1.n$$d
            r0.<init>()
            r5.f225787r = r0
            r5.mo107573q()
            goto L_0x010e
        L_0x010b:
            r0.mo71731E(r5)
        L_0x010e:
            boolean r13 = super.onDoubleTap(r13)
            java.lang.String r8 = "com/tencent/mm/plugin/game/chatroom/piece/GameChatItemVH$3"
            java.lang.String r9 = "android/view/GestureDetector$SimpleOnGestureListener"
            java.lang.String r10 = "onDoubleTap"
            java.lang.String r11 = "(Landroid/view/MotionEvent;)Z"
            r6 = r13
            r7 = r12
            j20.C117292a.m165362h(r6, r7, r8, r9, r10, r11)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: ix1.C46351y.onDoubleTap(android.view.MotionEvent):boolean");
    }

    public void onLongPress(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/chatroom/piece/GameChatItemVH$3", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
        super.onLongPress(motionEvent);
        C117292a.m165361g(this, "com/tencent/mm/plugin/game/chatroom/piece/GameChatItemVH$3", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        C46337n nVar = this.f124918e;
        JumpInfo jumpInfo = this.f124917d;
        if (nVar.f124859U0 != null && !nVar.mo71734I()) {
            if (nVar.f124859U0.mo62199a() == null || nVar.f124859U0.mo62199a().jump_type != 1 || jumpInfo == null || Util.isNullOrNil(jumpInfo.jump_url) || !Util.nullAsNil(jumpInfo.preload_id).equals(nVar.f124859U0.mo62199a().preload_id)) {
                C53601h.m60129h(nVar.f124838D, nVar.f124859U0.mo62199a());
                if (nVar.f124859U0.mo62199a() != null) {
                    Log.m105925i("GameChatRoom.GameChatItemVH", "user userdata url: %s", nVar.f124859U0.mo62199a().jump_url);
                }
            } else {
                C41985r.m45633a(jumpInfo.jump_url, new C46349w(nVar, jumpInfo));
            }
            C40308d.C40309a aVar = C40308d.f108375a;
            long j = nVar.f124840F;
            long j2 = nVar.f124839E;
            ChatroomMsgPack chatroomMsgPack = nVar.f124841G;
            aVar.mo62997g(4, 2, j, j2, chatroomMsgPack.seq, chatroomMsgPack.from_username, 0, nVar.f124874e1);
        }
        return super.onSingleTapConfirmed(motionEvent);
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/chatroom/piece/GameChatItemVH$3", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onSingleTapUp = super.onSingleTapUp(motionEvent);
        C117292a.m165362h(onSingleTapUp, this, "com/tencent/mm/plugin/game/chatroom/piece/GameChatItemVH$3", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return onSingleTapUp;
    }
}
