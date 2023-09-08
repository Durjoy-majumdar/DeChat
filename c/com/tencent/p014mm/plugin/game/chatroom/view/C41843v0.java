package com.tencent.p014mm.plugin.game.chatroom.view;

import android.app.Activity;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.game.autogen.chatroom.Color;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ContentBlock;
import com.tencent.p014mm.plugin.game.autogen.chatroom.GetFirstEnterInfoResponse;
import com.tencent.p014mm.plugin.game.autogen.chatroom.JumpInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Iterator;
import java.util.List;
import ob0.C117747y;
import ob0.C47350c;
import ob0.l0$$e;
import qo3.C101218e0;
import yw1.C53601h;

/* renamed from: com.tencent.mm.plugin.game.chatroom.view.v0 */
public class C41843v0 implements l0$$e {

    /* renamed from: d */
    public final /* synthetic */ MyChatRoomListView f112786d;

    public C41843v0(MyChatRoomListView myChatRoomListView) {
        this.f112786d = myChatRoomListView;
    }

    /* renamed from: a */
    public int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
        GetFirstEnterInfoResponse getFirstEnterInfoResponse;
        Log.m105925i("MicroMsg.ChatRoomListView", "showFirstGuidance, errType = %d, errCode = %d", Integer.valueOf(i), Integer.valueOf(i2));
        if (!((Activity) this.f112786d.f112592C1).isFinishing() && !((Activity) this.f112786d.f112592C1).isDestroyed() && i == 0 && i2 == 0 && (getFirstEnterInfoResponse = (GetFirstEnterInfoResponse) cVar.f127056b.f127083a) != null) {
            JumpInfo jumpInfo = getFirstEnterInfoResponse.enter_jump_info;
            if (jumpInfo != null) {
                C53601h.m60129h(this.f112786d.f112592C1, jumpInfo);
                this.f112786d.mo65564C1(2);
            } else if (!Util.isNullOrNil((List) getFirstEnterInfoResponse.content_list)) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                Iterator<ContentBlock> it = getFirstEnterInfoResponse.content_list.iterator();
                int i3 = 0;
                while (true) {
                    String str2 = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    ContentBlock next = it.next();
                    if (!Util.isNullOrNil(next.content)) {
                        Color color = next.color;
                        if (color != null) {
                            str2 = C85875k4.m106211z() ? color.dark_color : color.light_color;
                        }
                        Integer m = C53601h.m60134m(Util.nullAsNil(str2));
                        if (m == null) {
                            m = Integer.valueOf(this.f112786d.f112592C1.getResources().getColor(C0966R.color.FG_2));
                        }
                        spannableStringBuilder.append(next.content);
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(m.intValue()), i3, next.content.length() + i3, 33);
                        i3 = spannableStringBuilder.length();
                    }
                }
                if (spannableStringBuilder.length() == 0) {
                    return 0;
                }
                MyChatRoomListView myChatRoomListView = this.f112786d;
                C101218e0 e0Var = new C101218e0(myChatRoomListView.getContext(), 2, 0, true);
                e0Var.mo140677w(myChatRoomListView.getResources().getString(C0966R.string.f7u));
                e0Var.mo140676v(1);
                e0Var.f296375F = new C41849w0(myChatRoomListView, e0Var);
                View inflate = LayoutInflater.from(myChatRoomListView.getContext()).inflate(C0966R.C0971layout.avd, (ViewGroup) null);
                TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.b0d);
                ImageView imageView = (ImageView) inflate.findViewById(C0966R.C0970id.b0e);
                if (C85875k4.m106211z()) {
                    imageView.setImageResource(C0966R.C0969drawable.bg8);
                } else {
                    imageView.setImageResource(C0966R.C0969drawable.bg_);
                }
                textView.setText(spannableStringBuilder);
                e0Var.mo140663j(inflate);
                e0Var.mo140655A();
                myChatRoomListView.mo65564C1(1);
            }
        }
        return 0;
    }
}
