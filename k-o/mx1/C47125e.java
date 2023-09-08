package mx1;

import a14.C0000n0;
import ax1.C39646i;
import com.tencent.p014mm.plugin.game.autogen.chatroom.AdminInfo;
import ex1.C45711d;
import fy3.C32227p;
import java.util.List;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.game.chatroom.viewmodel.ChatroomMemberPreloadManager$preload$1", mo125469f = "ChatroomMemberPreloadManager.kt", mo125470l = {127, 132}, mo125471m = "invokeSuspend")
/* renamed from: mx1.e */
public final class C47125e extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f126622d;

    /* renamed from: e */
    public final /* synthetic */ String f126623e;

    /* renamed from: f */
    public final /* synthetic */ AdminInfo f126624f;

    @C91590f(mo125468c = "com.tencent.mm.plugin.game.chatroom.viewmodel.ChatroomMemberPreloadManager$preload$1$1", mo125469f = "ChatroomMemberPreloadManager.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: mx1.e$a */
    public static final class C47126a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ String f126625d;

        /* renamed from: e */
        public final /* synthetic */ List<C45711d> f126626e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47126a(String str, List<? extends C45711d> list, C15601d<? super C47126a> dVar) {
            super(2, dVar);
            this.f126625d = str;
            this.f126626e = list;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C47126a(this.f126625d, this.f126626e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C47126a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            C39646i iVar = C47119a.f126606d.mo72232c().get(this.f126625d);
            if (iVar == null) {
                return null;
            }
            iVar.mo62216b(this.f126626e);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47125e(String str, AdminInfo adminInfo, C15601d<? super C47125e> dVar) {
        super(2, dVar);
        this.f126623e = str;
        this.f126624f = adminInfo;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C47125e(this.f126623e, this.f126624f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C47125e) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x017f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f126622d
            r3 = 1
            r5 = 2
            java.lang.String r6 = "GameChatRoom.ChatroomMemberPreloadManager"
            if (r2 == 0) goto L_0x0024
            if (r2 == r3) goto L_0x001d
            if (r2 != r5) goto L_0x0015
            kotlin.ResultKt.throwOnFailure(r17)
            goto L_0x0184
        L_0x0015:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x001d:
            kotlin.ResultKt.throwOnFailure(r17)
            r2 = r17
            goto L_0x011f
        L_0x0024:
            kotlin.ResultKt.throwOnFailure(r17)
            mx1.a r2 = mx1.C47119a.f126606d
            java.lang.String r7 = r0.f126623e
            java.lang.Class<sw1.r> r8 = sw1.C48485r.class
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r7)
            java.lang.String r10 = "updateTime"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            di3.d r10 = di3.C86312j.m106911c(r8)
            sw1.r r10 = (sw1.C48485r) r10
            byte[] r9 = r10.os0(r9)
            if (r9 == 0) goto L_0x00db
            long r11 = java.lang.System.currentTimeMillis()
            r13 = 0
            r15 = 0
        L_0x0051:
            int r10 = r9.length
            if (r15 >= r10) goto L_0x0061
            byte r10 = r9[r15]
            r10 = r10 & 255(0xff, float:3.57E-43)
            long r4 = (long) r10
            int r10 = r15 * 8
            long r4 = r4 << r10
            long r13 = r13 | r4
            int r15 = r15 + 1
            r5 = 2
            goto L_0x0051
        L_0x0061:
            long r11 = r11 - r13
            r4 = 1000(0x3e8, float:1.401E-42)
            long r4 = (long) r4
            long r11 = r11 / r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "preload  chatroomName = "
            r4.append(r5)
            r4.append(r7)
            java.lang.String r9 = " earliestUserUpdateTime = "
            r4.append(r9)
            r4.append(r13)
            java.lang.String r9 = "   diffTime = "
            r4.append(r9)
            r4.append(r11)
            java.lang.String r9 = " 秒"
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            com.tencent.stubs.logger.Log.m106505i(r6, r4)
            r9 = 86400(0x15180, double:4.26873E-319)
            long r11 = r11 / r9
            r9 = 1
            int r4 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r4 < 0) goto L_0x009a
            goto L_0x00db
        L_0x009a:
            di3.d r4 = di3.C86312j.m106911c(r8)
            sw1.r r4 = (sw1.C48485r) r4
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r7)
            java.lang.String r9 = "memberVersion"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            byte[] r4 = r4.os0(r8)
            if (r4 == 0) goto L_0x00bf
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = z04.C119027c.f356488a
            r8.<init>(r4, r9)
            goto L_0x00c0
        L_0x00bf:
            r8 = 0
        L_0x00c0:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r5)
            r4.append(r7)
            java.lang.String r5 = " lastVersion = "
            r4.append(r5)
            r4.append(r8)
            java.lang.String r4 = r4.toString()
            com.tencent.stubs.logger.Log.m106505i(r6, r4)
            goto L_0x00dc
        L_0x00db:
            r8 = 0
        L_0x00dc:
            if (r8 != 0) goto L_0x00eb
            rx3.g r4 = mx1.C47119a.f126611i
            java.lang.Object r4 = r4.getValue()
            ex1.e r4 = (ex1.C45712e) r4
            java.lang.String r5 = r0.f126623e
            r4.mo71201Dw(r5)
        L_0x00eb:
            ob0.b0 r4 = f40.C86709a0.m107524d()
            bx1.t r5 = new bx1.t
            java.lang.String r7 = r0.f126623e
            r5.<init>(r7, r8)
            r4.mo123460f(r5)
            com.tencent.mm.plugin.game.autogen.chatroom.AdminInfo r4 = r0.f126624f
            java.util.LinkedList<java.lang.String> r4 = r4.admin_username_list
            if (r4 == 0) goto L_0x0108
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x0106
            goto L_0x0108
        L_0x0106:
            r10 = 0
            goto L_0x0109
        L_0x0108:
            r10 = 1
        L_0x0109:
            if (r10 != 0) goto L_0x017f
            com.tencent.mm.plugin.game.autogen.chatroom.AdminInfo r4 = r0.f126624f
            java.util.LinkedList<java.lang.String> r4 = r4.admin_username_list
            java.lang.String r5 = "adminInfo.admin_username_list"
            gy3.C87412m.m108593f(r4, r5)
            java.lang.String r5 = r0.f126623e
            r0.f126622d = r3
            java.lang.Object r2 = mx1.C47119a.m52417a(r2, r4, r5, r0)
            if (r2 != r1) goto L_0x011f
            return r1
        L_0x011f:
            java.util.List r2 = (java.util.List) r2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "onAdminLoaded  rawUserSize = "
            r3.append(r4)
            com.tencent.mm.plugin.game.autogen.chatroom.AdminInfo r4 = r0.f126624f
            java.util.LinkedList<java.lang.String> r4 = r4.admin_username_list
            int r4 = r4.size()
            r3.append(r4)
            java.lang.String r4 = " resultSimpleUsers = "
            r3.append(r4)
            int r4 = r2.size()
            r3.append(r4)
            java.lang.String r4 = "  threadId = "
            r3.append(r4)
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            long r4 = r4.getId()
            r3.append(r4)
            java.lang.String r4 = "   threadName =  "
            r3.append(r4)
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            java.lang.String r4 = r4.getName()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.stubs.logger.Log.m106505i(r6, r3)
            a14.h0 r3 = a14.C53872d1.f151117a
            a14.k2 r3 = f14.C58901s.f168555a
            mx1.e$a r4 = new mx1.e$a
            java.lang.String r5 = r0.f126623e
            r6 = 0
            r4.<init>(r5, r2, r6)
            r2 = 2
            r0.f126622d = r2
            java.lang.Object r2 = a14.C53895h.m60469g(r3, r4, r0)
            if (r2 != r1) goto L_0x0184
            return r1
        L_0x017f:
            java.lang.String r1 = "adminInfo.admin_username_list is empty"
            com.tencent.stubs.logger.Log.m106493d(r6, r1)
        L_0x0184:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: mx1.C47125e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
