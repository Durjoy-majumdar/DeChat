package er1;

import a14.C0000n0;
import android.content.Intent;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.protocal.protobuf.FinderAuthInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import dp1.C58417y0;
import eb0.C75592q0;
import er1.C7888v2;
import fe1.C58969q;
import fy3.C32227p;
import gy3.C87412m;
import h81.C59774i;
import ht1.C60161e;
import java.util.ArrayList;
import ke3.C88144b;
import kj2.C117407d;
import kotlin.ResultKt;
import p1081gi.C98121d;
import p565ir.C60613r;
import rs1.C13442s8;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.utils.FinderShareUtil$Companion$shareFinderContactToConversation$1", mo125469f = "FinderShareUtil.kt", mo125470l = {1066}, mo125471m = "invokeSuspend")
/* renamed from: er1.x2 */
public final class C58789x2 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f168318d;

    /* renamed from: e */
    public final /* synthetic */ C58969q f168319e;

    /* renamed from: f */
    public final /* synthetic */ MMActivity f168320f;

    /* renamed from: er1.x2$a */
    public static final class C7922a implements MMActivity.C6739d {

        /* renamed from: d */
        public final /* synthetic */ C58969q f26604d;

        /* renamed from: e */
        public final /* synthetic */ int f26605e;

        public C7922a(C58969q qVar, int i) {
            this.f26604d = qVar;
            this.f26605e = i;
        }

        public final void mmOnActivityResult(int i, int i2, Intent intent) {
            if (i2 == -1) {
                ArrayList<String> stringArrayListExtra = intent != null ? intent.getStringArrayListExtra("SendMsgUsernames") : null;
                if (stringArrayListExtra == null) {
                    stringArrayListExtra = new ArrayList<>(0);
                }
                C7888v2.C7889a aVar = C7888v2.C7889a.f26514a;
                aVar.getClass();
                Log.m105924i(C7888v2.C7889a.f26515b, "share namecard " + this.f26604d.getNickname() + '(' + this.f26604d.getUsername() + ") to " + stringArrayListExtra);
                if (!stringArrayListExtra.isEmpty()) {
                    C58417y0 y0Var = (C58417y0) C86312j.m106911c(C58417y0.class);
                    String username = this.f26604d.getUsername();
                    String listToString = Util.listToString(stringArrayListExtra, ",");
                    C87412m.m108593f(listToString, "listToString(toUsers, \",\")");
                    FinderAuthInfo finderAuthInfo = this.f26604d.field_authInfo;
                    int i3 = finderAuthInfo != null ? finderAuthInfo.authIconType : 0;
                    int i4 = this.f26605e;
                    y0Var.getClass();
                    String str = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb() + ',' + username + ',' + listToString + ',' + 0 + ',' + i3 + ',' + i4;
                    Log.m105924i(y0Var.f167350d, "18949 " + str);
                    C117407d.INSTANCE.kvStat(18949, str);
                }
                aVar.mo9003E(stringArrayListExtra);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58789x2(C58969q qVar, MMActivity mMActivity, C15601d<? super C58789x2> dVar) {
        super(2, dVar);
        this.f168319e = qVar;
        this.f168320f = mMActivity;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C58789x2(this.f168319e, this.f168320f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C58789x2) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f168318d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String s = C75592q0.m90789s();
            C87412m.m108593f(s, "getUsernameFromUserInfo()");
            String username = this.f168319e.getUsername();
            this.f168318d = 1;
            obj = ((C60613r) C86312j.m106911c(C60613r.class)).N10(s, 4, username, 0, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        String str = (String) obj;
        int i2 = ((C13442s8) C39818r.f106831a.mo62444c(this.f168320f).mo75002a(C13442s8.class)).f38096i;
        C68070l.C68072b bVar = new C68070l.C68072b();
        C60161e eVar = new C60161e();
        eVar.mo85136j(this.f168319e.getUsername());
        String nullAsNil = Util.nullAsNil(this.f168319e.mo84196w1());
        C87412m.m108593f(nullAsNil, "nullAsNil(contact.getRawNickname())");
        eVar.mo85135i(nullAsNil);
        String nullAsNil2 = Util.nullAsNil(this.f168319e.mo84172g0());
        C87412m.m108593f(nullAsNil2, "nullAsNil(contact.getRawAvatarUrl())");
        eVar.mo85134h(nullAsNil2);
        FinderAuthInfo finderAuthInfo = this.f168319e.field_authInfo;
        int i3 = finderAuthInfo != null ? finderAuthInfo.authIconType : 0;
        eVar.f171701b.f185049h = i3;
        eVar.f171706g = i3;
        String str2 = finderAuthInfo != null ? finderAuthInfo.authProfession : null;
        String str3 = "";
        if (str2 == null) {
            str2 = str3;
        }
        eVar.mo85133g(str2);
        FinderAuthInfo finderAuthInfo2 = this.f168319e.field_authInfo;
        String str4 = finderAuthInfo2 != null ? finderAuthInfo2.authIconUrl : null;
        if (str4 != null) {
            str3 = str4;
        }
        eVar.f171707h = str3;
        C87412m.m108594g(str, "<set-?>");
        eVar.f171708i = str;
        bVar.mo93545f(eVar);
        bVar.f195582i = 50;
        bVar.f195570f = MMApplicationContext.getContext().getString(C0966R.string.ge7);
        bVar.f195586j = MMApplicationContext.getContext().getString(C0966R.string.ge8);
        Intent intent = new Intent();
        intent.putExtra("Retr_Msg_Type", 20);
        intent.putExtra("Multi_Retr", true);
        intent.putExtra("Retr_Msg_content", C68070l.C68072b.m80420s(bVar, (String) null, (C98121d) null));
        intent.putExtra("Retr_go_to_chattingUI", false);
        intent.putExtra("Retr_show_success_tips", true);
        C88144b.m109803u(this.f168320f, ".ui.transmit.MsgRetransmitUI", intent, 1003, new C7922a(this.f168319e, i2));
        return C13598b0.f38549a;
    }
}
