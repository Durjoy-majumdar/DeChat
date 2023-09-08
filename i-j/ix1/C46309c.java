package ix1;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomMsgPack;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomMsgSheetCard;
import com.tencent.p014mm.plugin.game.autogen.chatroom.MsgContent;
import com.tencent.p014mm.plugin.game.autogen.chatroom.SheetRow;
import dx1.C45486b;
import gy3.C87412m;
import java.util.LinkedList;
import js0.C88024r;
import p192l4.C10462b;
import sx3.C64197v;
import uy1.C52645f;
import yw1.C53601h;

/* renamed from: ix1.c */
public final class C46309c extends C46337n {

    /* renamed from: g1 */
    public C45486b f124772g1;

    /* renamed from: ix1.c$a */
    public static final class C46310a implements C52645f.C52652e {

        /* renamed from: a */
        public final /* synthetic */ C46309c f124773a;

        /* renamed from: ix1.c$a$a */
        public static final class C46311a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C46309c f124774d;

            /* renamed from: e */
            public final /* synthetic */ Bitmap f124775e;

            public C46311a(C46309c cVar, Bitmap bitmap) {
                this.f124774d = cVar;
                this.f124775e = bitmap;
            }

            public final void run() {
                this.f124774d.mo71713Q().f123115b.setBackground(new BitmapDrawable(this.f124775e));
            }
        }

        public C46310a(C46309c cVar) {
            this.f124773a = cVar;
        }

        /* renamed from: a */
        public void mo65432a(View view, Bitmap bitmap) {
            if (bitmap != null) {
                C88024r.m109572b(new C46311a(this.f124773a, bitmap));
            }
        }

        /* renamed from: b */
        public void mo65433b(String str, View view) {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46309c(View view, int i) {
        super(view, i);
        C87412m.m108594g(view, "itemView");
    }

    /* renamed from: B */
    public void mo71705B(ChatroomMsgPack chatroomMsgPack) {
        MsgContent msgContent;
        ChatroomMsgSheetCard chatroomMsgSheetCard;
        if (chatroomMsgPack != null && (msgContent = chatroomMsgPack.msg_content) != null && (chatroomMsgSheetCard = msgContent.chatroom_sheet_card) != null) {
            mo71713Q().f123123j.setText(chatroomMsgSheetCard.title);
            C52645f.C52650d.C52651a aVar = new C52645f.C52650d.C52651a();
            aVar.f147024e = false;
            C52645f.C52650d a = aVar.mo73598a();
            C52645f.m59023a().mo73595e(mo71713Q().f123116c, chatroomMsgSheetCard.pic_url, a, (C52645f.C52652e) null);
            String str = chatroomMsgSheetCard.bg_pic_url;
            if (str != null) {
                C52645f.m59023a().mo73595e((ImageView) null, str, a, new C46310a(this));
            }
            LinkedList<SheetRow> linkedList = chatroomMsgSheetCard.sheet_row_list;
            if (!(linkedList == null || linkedList.isEmpty())) {
                LinkedList<SheetRow> linkedList2 = chatroomMsgSheetCard.sheet_row_list;
                C87412m.m108593f(linkedList2, "sheetCard.sheet_row_list");
                int i = 0;
                for (T next : linkedList2) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        SheetRow sheetRow = (SheetRow) next;
                        if (i == 0) {
                            LinkedList<String> linkedList3 = sheetRow.sheet_col_list;
                            if (linkedList3 != null) {
                                int i3 = 0;
                                for (T next2 : linkedList3) {
                                    int i4 = i3 + 1;
                                    if (i3 >= 0) {
                                        String str2 = (String) next2;
                                        if (i3 == 0) {
                                            mo71713Q().f123120g.setText(str2);
                                        } else if (i3 == 1) {
                                            mo71713Q().f123121h.setText(str2);
                                        } else if (i3 == 2) {
                                            mo71713Q().f123122i.setText(str2);
                                        }
                                        i3 = i4;
                                    } else {
                                        C64197v.m75542k();
                                        throw null;
                                    }
                                }
                                continue;
                            } else {
                                continue;
                            }
                        } else {
                            LinkedList<String> linkedList4 = sheetRow.sheet_col_list;
                            if (linkedList4 != null) {
                                int i5 = 0;
                                for (T next3 : linkedList4) {
                                    int i6 = i5 + 1;
                                    if (i5 >= 0) {
                                        String str3 = (String) next3;
                                        if (i5 == 0) {
                                            mo71713Q().f123117d.setText(str3);
                                        } else if (i5 == 1) {
                                            mo71713Q().f123118e.setText(str3);
                                        } else if (i5 == 2) {
                                            mo71713Q().f123119f.setText(str3);
                                        }
                                        i5 = i6;
                                    } else {
                                        C64197v.m75542k();
                                        throw null;
                                    }
                                }
                                continue;
                            } else {
                                continue;
                            }
                        }
                        i = i2;
                    } else {
                        C64197v.m75542k();
                        throw null;
                    }
                }
            }
        }
    }

    /* renamed from: F */
    public View mo71706F(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(this.f124838D).inflate(C0966R.C0971layout.f359804cr0, (ViewGroup) null, false);
        int i = C0966R.C0970id.m54;
        RelativeLayout relativeLayout = (RelativeLayout) C10462b.m10395a(inflate, C0966R.C0970id.m54);
        if (relativeLayout != null) {
            i = C0966R.C0970id.m55;
            LinearLayout linearLayout = (LinearLayout) C10462b.m10395a(inflate, C0966R.C0970id.m55);
            if (linearLayout != null) {
                i = C0966R.C0970id.m56;
                LinearLayout linearLayout2 = (LinearLayout) C10462b.m10395a(inflate, C0966R.C0970id.m56);
                if (linearLayout2 != null) {
                    i = C0966R.C0970id.m5h;
                    ImageView imageView = (ImageView) C10462b.m10395a(inflate, C0966R.C0970id.m5h);
                    if (imageView != null) {
                        i = C0966R.C0970id.mjz;
                        TextView textView = (TextView) C10462b.m10395a(inflate, C0966R.C0970id.mjz);
                        if (textView != null) {
                            i = C0966R.C0970id.f359431mk0;
                            TextView textView2 = (TextView) C10462b.m10395a(inflate, C0966R.C0970id.f359431mk0);
                            if (textView2 != null) {
                                i = C0966R.C0970id.f359432mk1;
                                TextView textView3 = (TextView) C10462b.m10395a(inflate, C0966R.C0970id.f359432mk1);
                                if (textView3 != null) {
                                    i = C0966R.C0970id.f359433mk2;
                                    TextView textView4 = (TextView) C10462b.m10395a(inflate, C0966R.C0970id.f359433mk2);
                                    if (textView4 != null) {
                                        i = C0966R.C0970id.f359434mk3;
                                        TextView textView5 = (TextView) C10462b.m10395a(inflate, C0966R.C0970id.f359434mk3);
                                        if (textView5 != null) {
                                            i = C0966R.C0970id.mk4;
                                            TextView textView6 = (TextView) C10462b.m10395a(inflate, C0966R.C0970id.mk4);
                                            if (textView6 != null) {
                                                i = C0966R.C0970id.mk5;
                                                TextView textView7 = (TextView) C10462b.m10395a(inflate, C0966R.C0970id.mk5);
                                                if (textView7 != null) {
                                                    this.f124772g1 = new C45486b((FrameLayout) inflate, relativeLayout, linearLayout, linearLayout2, imageView, textView, textView2, textView3, textView4, textView5, textView6, textView7);
                                                    FrameLayout frameLayout = mo71713Q().f123114a;
                                                    C87412m.m108593f(frameLayout, "binding.root");
                                                    return frameLayout;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    /* renamed from: K */
    public void mo71707K(View view) {
        MsgContent msgContent;
        ChatroomMsgSheetCard chatroomMsgSheetCard;
        ChatroomMsgPack chatroomMsgPack = this.f124841G;
        if (chatroomMsgPack != null && (msgContent = chatroomMsgPack.msg_content) != null && (chatroomMsgSheetCard = msgContent.chatroom_sheet_card) != null && !mo71734I()) {
            C53601h.m60129h(this.f124838D, chatroomMsgSheetCard.jump_info);
        }
    }

    /* renamed from: Q */
    public final C45486b mo71713Q() {
        C45486b bVar = this.f124772g1;
        if (bVar != null) {
            return bVar;
        }
        C87412m.m108603p("binding");
        throw null;
    }
}
