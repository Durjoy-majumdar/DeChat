package com.tencent.p014mm.chatroom.p015ui;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/chatroom/ui/ChatRoomOpenErrorInfoUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "ui-chatroom_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.chatroom.ui.ChatRoomOpenErrorInfoUI */
public final class ChatRoomOpenErrorInfoUI extends MMActivity {

    /* renamed from: d */
    public TextView f10137d;

    /* renamed from: e */
    public TextView f10138e;

    public int getLayoutId() {
        return C0966R.C0971layout.f6817pc;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setActionbarColor(getResources().getColor(C0966R.color.al6));
        String str = "";
        setMMTitle(str);
        setBackBtn(new C1210c(this));
        View findViewById = findViewById(C0966R.C0970id.kwc);
        C87412m.m108593f(findViewById, "findViewById(R.id.tv_error_title)");
        this.f10137d = (TextView) findViewById;
        View findViewById2 = findViewById(C0966R.C0970id.kwb);
        C87412m.m108593f(findViewById2, "findViewById(R.id.tv_error_content)");
        this.f10138e = (TextView) findViewById2;
        findViewById(C0966R.C0970id.f357588am1).setOnClickListener(new C1212d(this));
        String stringExtra = getIntent().getStringExtra("key_error_title");
        if (stringExtra == null) {
            stringExtra = str;
        }
        String stringExtra2 = getIntent().getStringExtra("key_error_content");
        if (stringExtra2 != null) {
            str = stringExtra2;
        }
        TextView textView = this.f10137d;
        if (textView != null) {
            textView.setText(stringExtra);
            TextView textView2 = this.f10138e;
            if (textView2 != null) {
                textView2.setText(str);
            } else {
                C87412m.m108603p("contentTextView");
                throw null;
            }
        } else {
            C87412m.m108603p("titleTextView");
            throw null;
        }
    }
}
