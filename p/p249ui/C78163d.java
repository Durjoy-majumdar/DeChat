package p249ui;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53934p0;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.storage.sql.Column;
import com.tencent.p014mm.sdk.storage.sql.ISqlColumn;
import com.tencent.p014mm.sdk.storage.sql.ISqlOrder;
import com.tencent.p014mm.sdk.storage.sql.SelectSql;
import com.tencent.p014mm.sdk.storage.sql.SingleTable;
import com.tencent.p014mm.storage.C72986n2;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import f14.C58901s;
import f40.C86709a0;
import f62.C75700k0;
import fy3.C32227p;
import gy3.C87412m;
import java.util.LinkedList;
import java.util.List;
import kotlin.ResultKt;
import p749xh.C78811h6;
import rx3.C13598b0;
import wx3.C15601d;
import xm3.C78904i;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: ui.d */
public final class C78163d extends C78904i {

    @C91590f(mo125468c = "com.tencent.mm.chatroom.ui.uic.SelectWxChatRoomAddMemberBottomMenuUIC$updateBottomMenuVisible$1", mo125469f = "SelectWxChatRoomAddMemberBottomMenuUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: ui.d$a */
    public static final class C78164a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C78163d f229013d;

        @C91590f(mo125468c = "com.tencent.mm.chatroom.ui.uic.SelectWxChatRoomAddMemberBottomMenuUIC$updateBottomMenuVisible$1$1", mo125469f = "SelectWxChatRoomAddMemberBottomMenuUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: ui.d$a$a */
        public static final class C78165a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ C78163d f229014d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C78165a(C78163d dVar, C15601d<? super C78165a> dVar2) {
                super(2, dVar2);
                this.f229014d = dVar;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C78165a(this.f229014d, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C78165a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                this.f229014d.mo108901g3().mo109052j().setVisibility(0);
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C78164a(C78163d dVar, C15601d<? super C78164a> dVar2) {
            super(2, dVar2);
            this.f229013d = dVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C78164a(this.f229013d, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C78164a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            LifecycleScope c3;
            ResultKt.throwOnFailure(obj);
            String stringExtra = this.f229013d.getIntent().getStringExtra("chatroomName");
            if (stringExtra == null) {
                stringExtra = "";
            }
            long jo = ((C72986n2) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96093DX()).mo101184jo(stringExtra);
            SingleTable singleTable = C78811h6.f230717y0;
            LinkedList linkedList = new LinkedList();
            LinkedList linkedList2 = new LinkedList();
            LinkedList linkedList3 = new LinkedList();
            linkedList.add(C78811h6.f230684Q0);
            SelectSql build = C78811h6.f230717y0.select((List<? extends ISqlColumn>) linkedList).where(C78811h6.f230688U0.equal(stringExtra).and(C78811h6.f230687T0.largerThan((Number) Long.valueOf(jo)))).orderBy((List<? extends ISqlOrder>) linkedList2).groupBy((List<? extends Column>) linkedList3).build();
            C87412m.m108593f(build, "select().selectMsgId().w…han(createTime))).build()");
            if (build.isExist(C86709a0.m107535s().f251811i) && (c3 = this.f229013d.mo14597c3()) != null) {
                C53896h0 h0Var = C53872d1.f151117a;
                C53895h.m60466d(c3, C58901s.f168555a, (C53934p0) null, new C78165a(this.f229013d, (C15601d<? super C78165a>) null), 2, (Object) null);
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78163d(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: i3 */
    public void mo108153i3(boolean z) {
        super.mo108153i3(z);
        LifecycleScope c3 = mo14597c3();
        if (c3 != null) {
            LifecycleScope.launchDefault$default(c3, (C53934p0) null, new C78164a(this, (C15601d<? super C78164a>) null), 1, (Object) null);
        }
    }
}
