package com.tencent.p014mm.plugin.announcement;

import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.component.editor.C93078l;
import com.tencent.p014mm.plugin.component.editor.C93088r;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f62.C75708t0;
import java.util.regex.Pattern;
import nj3.C76879j;
import p823sg.C101611g;
import qo3.C47883u;
import u21.C101941c;

/* renamed from: com.tencent.mm.plugin.announcement.b */
public class C68567b implements C47883u {

    /* renamed from: a */
    public final /* synthetic */ int f196993a;

    /* renamed from: b */
    public final /* synthetic */ ChatroomNoticeUI f196994b;

    /* renamed from: com.tencent.mm.plugin.announcement.b$a */
    public class C68568a implements DialogInterface.OnCancelListener {
        public C68568a() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            C68567b.this.f196994b.mo127476H7();
        }
    }

    public C68567b(ChatroomNoticeUI chatroomNoticeUI, int i) {
        this.f196994b = chatroomNoticeUI;
        this.f196993a = i;
    }

    /* renamed from: a */
    public void mo353a(boolean z, String str) {
        ChatroomNoticeUI chatroomNoticeUI = this.f196994b;
        if (chatroomNoticeUI.f196948Y) {
            chatroomNoticeUI.f196945V = C76879j.m92723Q(chatroomNoticeUI.getContext(), this.f196994b.getString(C0966R.string.a3h), this.f196994b.getString(C0966R.string.i8y), true, true, new C68568a());
            ChatroomNoticeUI chatroomNoticeUI2 = this.f196994b;
            chatroomNoticeUI2.f268045g.mo142159d(chatroomNoticeUI2);
            String o = C101941c.m134173q().mo141459o();
            C101611g<String, Integer> gVar = C93088r.f268179a;
            String k = C93088r.m117441k(Pattern.compile("<object[^>]*>", 2).matcher(o).replaceAll("#WNNoteNode#<ThisisNoteNodeObj>#WNNoteNode#"));
            if (!Util.isNullOrNil(k) && k.length() != 0) {
                k = Pattern.compile("\\s*|\t|\r|\n").matcher(k).replaceAll("");
            }
            if (!Util.isNullOrNil(k)) {
                chatroomNoticeUI2.f268037E = new C93078l(chatroomNoticeUI2);
                if (chatroomNoticeUI2.f268033A.size() <= 0) {
                    chatroomNoticeUI2.f268037E.run();
                    chatroomNoticeUI2.f268037E = null;
                }
            } else {
                chatroomNoticeUI2.mo94184P7("", "", true);
            }
            ((C75708t0) C86312j.m106911c(C75708t0.class)).di0(this.f196994b.f196935K, 1, this.f196993a, 2);
            ChatroomNoticeUI chatroomNoticeUI3 = this.f196994b;
            int i = 6;
            if (this.f196993a != 6) {
                i = 8;
            }
            chatroomNoticeUI3.mo94190g8(i);
        }
    }
}
