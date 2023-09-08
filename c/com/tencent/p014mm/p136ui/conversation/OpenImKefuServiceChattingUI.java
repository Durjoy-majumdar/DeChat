package com.tencent.p014mm.p136ui.conversation;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.openim.api.OpenIMKefuStartConversationRequest;
import com.tencent.p014mm.p136ui.chatting.ChattingUI;
import com.tencent.p014mm.p136ui.chatting.ChattingUIFragment;
import com.tencent.p014mm.p136ui.conversation.OpenImKefuServiceConversationUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.Metadata;
import ne0.C47224a;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C51195s3;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/ui/conversation/OpenImKefuServiceChattingUI;", "Lcom/tencent/mm/ui/chatting/ChattingUI;", "<init>", "()V", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.conversation.OpenImKefuServiceChattingUI */
public final class OpenImKefuServiceChattingUI extends ChattingUI {

    /* renamed from: s */
    public final C13601g f219506s = C36568h.m40985a(new C74664b(this));

    /* renamed from: t */
    public final C13601g f219507t = C36568h.m40985a(new C74663a(this));

    /* renamed from: com.tencent.mm.ui.conversation.OpenImKefuServiceChattingUI$a */
    public static final class C74663a extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ OpenImKefuServiceChattingUI f219508d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C74663a(OpenImKefuServiceChattingUI openImKefuServiceChattingUI) {
            super(0);
            this.f219508d = openImKefuServiceChattingUI;
        }

        public Object invoke() {
            Intent intent = this.f219508d.getIntent();
            boolean z = false;
            if (intent != null) {
                z = intent.getBooleanExtra("key_is_confirm_page_shown", false);
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.OpenImKefuServiceChattingUI$b */
    public static final class C74664b extends C87413o implements C32224a<OpenIMKefuStartConversationRequest> {

        /* renamed from: d */
        public final /* synthetic */ OpenImKefuServiceChattingUI f219509d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C74664b(OpenImKefuServiceChattingUI openImKefuServiceChattingUI) {
            super(0);
            this.f219509d = openImKefuServiceChattingUI;
        }

        public Object invoke() {
            Intent intent = this.f219509d.getIntent();
            if (intent != null) {
                return (OpenIMKefuStartConversationRequest) intent.getParcelableExtra("key_start_conversation_request");
            }
            return null;
        }
    }

    /* renamed from: M7 */
    public ChattingUIFragment mo101990M7() {
        return new OpenImKefuServiceConversationUI.OpenImKefuChattingUIFragment(true);
    }

    public void onCreate(Bundle bundle) {
        C51195s3 s3Var;
        super.onCreate(bundle);
        OpenIMKefuStartConversationRequest openIMKefuStartConversationRequest = (OpenIMKefuStartConversationRequest) ((C36570n) this.f219506s).getValue();
        C87412m.m108591d(openIMKefuStartConversationRequest);
        Log.m105925i("MicroMsg.OpenImKefuServiceChattingUI", "alvinluo enterKefuChattingUI getContactScene: %s, isConfirmPageShown: %s", Integer.valueOf(openIMKefuStartConversationRequest.f108517f), Boolean.valueOf(((Boolean) ((C36570n) this.f219507t).getValue()).booleanValue()));
        int i = ((Boolean) ((C36570n) this.f219507t).getValue()).booleanValue() ? 24 : 23;
        OpenIMKefuStartConversationRequest openIMKefuStartConversationRequest2 = (OpenIMKefuStartConversationRequest) ((C36570n) this.f219506s).getValue();
        String str = (openIMKefuStartConversationRequest2 == null || (s3Var = openIMKefuStartConversationRequest2.f108520i) == null) ? null : s3Var.f141289h;
        OpenIMKefuStartConversationRequest openIMKefuStartConversationRequest3 = (OpenIMKefuStartConversationRequest) ((C36570n) this.f219506s).getValue();
        C87412m.m108591d(openIMKefuStartConversationRequest3);
        C47224a.m52531b(str, i, openIMKefuStartConversationRequest3.f108517f);
    }
}
