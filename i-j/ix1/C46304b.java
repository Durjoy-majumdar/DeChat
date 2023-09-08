package ix1;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import bp3.C67301m;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomMsgEmoji;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomMsgPack;
import com.tencent.p014mm.plugin.game.autogen.chatroom.MsgContent;
import com.tencent.p014mm.plugin.game.chatroom.view.GameChatEmojiView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72989o2;
import di3.C86312j;
import gy3.C87412m;
import ke3.C88144b;
import ky2.C10432i;
import p008bq.C0363p0;
import yw1.C53603j;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: ix1.b */
public final class C46304b extends C46337n {

    /* renamed from: g1 */
    public View f124759g1;

    /* renamed from: h1 */
    public GameChatEmojiView f124760h1;

    /* renamed from: i1 */
    public String f124761i1;

    /* renamed from: j1 */
    public IEmojiInfo f124762j1;

    /* renamed from: k1 */
    public C46304b f124763k1 = this;

    /* renamed from: ix1.b$a */
    public static final class C46305a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C46304b f124764d;

        /* renamed from: e */
        public final /* synthetic */ IEmojiInfo f124765e;

        /* renamed from: f */
        public final /* synthetic */ ChatroomMsgPack f124766f;

        public C46305a(C46304b bVar, IEmojiInfo iEmojiInfo, ChatroomMsgPack chatroomMsgPack) {
            this.f124764d = bVar;
            this.f124765e = iEmojiInfo;
            this.f124766f = chatroomMsgPack;
        }

        public final void run() {
            GameChatEmojiView gameChatEmojiView = this.f124764d.f124760h1;
            if (gameChatEmojiView != null) {
                IEmojiInfo iEmojiInfo = this.f124765e;
                gameChatEmojiView.mo135109b(iEmojiInfo, this.f124766f.seq, iEmojiInfo.mo62678k() && C67301m.m79638c(this.f124766f.seq), new C72989o2(""));
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46304b(View view, int i) {
        super(view, i);
        C87412m.m108594g(view, "itemView");
    }

    /* renamed from: B */
    public void mo71705B(ChatroomMsgPack chatroomMsgPack) {
        MsgContent msgContent;
        ChatroomMsgEmoji chatroomMsgEmoji;
        Class cls = C0363p0.class;
        if (chatroomMsgPack != null && (msgContent = chatroomMsgPack.msg_content) != null && (chatroomMsgEmoji = msgContent.chatroom_emoji) != null) {
            String str = chatroomMsgEmoji.md5;
            C87412m.m108593f(str, "it.md5");
            if (str.length() > 0) {
                this.f124761i1 = chatroomMsgEmoji.md5;
                IEmojiInfo r2 = ((C0363p0) C86312j.m106911c(cls)).mo403r2(chatroomMsgEmoji.md5);
                if (r2 == null) {
                    r2 = ((C0363p0) C86312j.m106911c(cls)).mo404zE();
                    r2.mo62687p1(84);
                    r2.mo62655c0(r2.getExtFlag() | 1);
                    C53603j.C53606c.f150641a.getClass();
                    if (Util.isNullOrNil(chatroomMsgEmoji.md5) || Util.isNullOrNil(r2.mo62676i0()) || chatroomMsgEmoji.md5.equals(r2.mo62676i0())) {
                        r2.setMd5(C53603j.m60139a(chatroomMsgEmoji.md5, r2.mo62676i0()));
                        r2.mo62653a1(C53603j.m60139a(chatroomMsgEmoji.cdnurl, r2.mo62686o1()));
                        r2.mo62636I(C53603j.m60139a(chatroomMsgEmoji.thumburl, r2.getThumbUrl()));
                        r2.mo62691s(C53603j.m60139a(chatroomMsgEmoji.designerid, r2.mo62685o0()));
                        r2.mo62658e1(C53603j.m60139a(chatroomMsgEmoji.encrypturl, r2.mo62660g2()));
                        r2.setAesKey(C53603j.m60139a(chatroomMsgEmoji.aeskey, r2.getAesKey()));
                        r2.mo62634E(C53603j.m60139a(chatroomMsgEmoji.productid, r2.getGroupId()));
                        r2.mo62638I1(C53603j.m60139a(chatroomMsgEmoji.externurl, r2.mo62631C()));
                        r2.mo62689q1(C53603j.m60139a(chatroomMsgEmoji.externmd5, r2.mo62644P1()));
                        r2.mo62643P0(C53603j.m60139a(chatroomMsgEmoji.activityid, r2.mo62684n()));
                        r2.mo62697x0(C53603j.m60139a(chatroomMsgEmoji.attachedtext, r2.mo62646T()));
                        r2.mo62630A(C53603j.m60139a(chatroomMsgEmoji.attachedtextcolor, r2.mo62683m1()));
                        r2.mo62677j2(C53603j.m60139a(chatroomMsgEmoji.lensid, r2.mo62635F0()));
                        r2.mo62693s1(Util.nullAs(Integer.valueOf(chatroomMsgEmoji.width), r2.getWidth()));
                        r2.mo62632C0(Util.nullAs(Integer.valueOf(chatroomMsgEmoji.height), r2.getHeight()));
                    }
                }
                this.f124762j1 = r2;
                Object[] objArr = new Object[3];
                objArr[0] = chatroomMsgEmoji.md5;
                objArr[1] = Integer.valueOf(this.f124763k1.hashCode());
                GameChatEmojiView gameChatEmojiView = this.f124760h1;
                Object obj = null;
                objArr[2] = gameChatEmojiView != null ? Integer.valueOf(gameChatEmojiView.hashCode()) : null;
                Log.m105919d("GameChatRoom.GameChatItemEmojiVH", "set emoji info to view，md5:%s, hashcode:%d, view_hashcode:%d", objArr);
                GameChatEmojiView gameChatEmojiView2 = this.f124760h1;
                if ((gameChatEmojiView2 != null ? gameChatEmojiView2.getTag() : null) instanceof String) {
                    GameChatEmojiView gameChatEmojiView3 = this.f124760h1;
                    if (gameChatEmojiView3 != null) {
                        obj = gameChatEmojiView3.getTag();
                    }
                    C87412m.m108592e(obj, "null cannot be cast to non-null type kotlin.String");
                    if (C87412m.m108589b((String) obj, chatroomMsgEmoji.md5)) {
                        Log.m105918d("GameChatRoom.GameChatItemEmojiVH", "same emoji info");
                        return;
                    }
                }
                C119179t tVar = C119157j.f356862d;
                C46305a aVar = new C46305a(this, r2, chatroomMsgPack);
                C119157j jVar = (C119157j) tVar;
                jVar.getClass();
                jVar.mo183892w(aVar, 50, false);
                GameChatEmojiView gameChatEmojiView4 = this.f124760h1;
                if (gameChatEmojiView4 != null) {
                    gameChatEmojiView4.setTag(chatroomMsgEmoji.md5);
                }
            }
        }
    }

    /* renamed from: F */
    public View mo71706F(ViewGroup viewGroup) {
        if (this.f124759g1 == null) {
            View inflate = LayoutInflater.from(this.f124838D).inflate(C0966R.C0971layout.f359802av2, (ViewGroup) null);
            C87412m.m108593f(inflate, "from(mContext).inflate(R…ame_chat_msg_emoji, null)");
            this.f124759g1 = inflate;
            this.f124760h1 = (GameChatEmojiView) inflate.findViewById(C0966R.C0970id.eib);
        }
        View view = this.f124759g1;
        if (view != null) {
            return view;
        }
        C87412m.m108603p("bodyView");
        throw null;
    }

    /* renamed from: K */
    public void mo71707K(View view) {
        IEmojiInfo iEmojiInfo;
        Class cls = C10432i.class;
        String str = this.f124761i1;
        boolean z = false;
        if (!(str == null || str.length() == 0) && (iEmojiInfo = this.f124762j1) != null) {
            if (iEmojiInfo != null && iEmojiInfo.mo62678k()) {
                z = true;
            }
            if (!z) {
                if (((C10432i) C86312j.m106911c(cls)).mo10750e()) {
                    ((C10432i) C86312j.m106911c(cls)).mo10755m4(this.f124838D);
                    return;
                }
                Intent intent = new Intent();
                intent.putExtra("custom_smiley_preview_md5", this.f124761i1);
                intent.putExtra("emoji_info", this.f124762j1);
                IEmojiInfo iEmojiInfo2 = this.f124762j1;
                if (!(iEmojiInfo2 == null || iEmojiInfo2.getGroup() == 81 || iEmojiInfo2.getGroup() == 18 || iEmojiInfo2.getGroup() == 17)) {
                    intent.putExtra("custom_smiley_preview_productid", iEmojiInfo2.getGroupId());
                }
                C88144b.m109795m(this.f124838D, "emoji", ".ui.CustomSmileyPreviewUI", intent, 1111);
            }
        }
    }
}
