package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewStub;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import ck3.C39969i;
import ck3.C67391b;
import com.tencent.neattextview.textview.layout.NeatLayout;
import com.tencent.neattextview.textview.view.NeatTextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.plugin.C67651f;
import com.tencent.p014mm.autogen.events.DoFavoriteEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.MessageSecurityInterceptStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.ShareMsgClipStruct;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.base.AnimImageView;
import com.tencent.p014mm.p136ui.chatting.C73309a2;
import com.tencent.p014mm.p136ui.chatting.C73673d4;
import com.tencent.p014mm.p136ui.chatting.C73684f2;
import com.tencent.p014mm.p136ui.chatting.C73774p2;
import com.tencent.p014mm.p136ui.chatting.TextPreviewUI;
import com.tencent.p014mm.p136ui.chatting.manager.C6789c;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.p136ui.chatting.viewitems.ChattingItemTranslate;
import com.tencent.p014mm.p136ui.transmit.MsgRetransmitUI;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.p136ui.widget.MMTextView;
import com.tencent.p014mm.plugin.fts.p059ui.C68987c;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.model.C96787m0;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.thumbplayer.api.TPOptionalID;
import de3.C107029o;
import de3.C45331f0;
import de3.C75359b0;
import de3.C75362d0;
import de3.C75370s;
import di3.C86312j;
import eb0.C31543z5;
import eb0.C45628s0;
import eb0.C75569c4;
import eb0.C75592q0;
import eb0.C75604z3;
import eb0.C86493v0;
import eb0.C97625j3;
import f40.C86709a0;
import f62.C75700k0;
import h81.C32735h;
import ht1.C8808v4;
import i21.C98591h;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import jm2.C46562a;
import k20.C60958c;
import k20.C9556a;
import kb0.C76528a;
import ke3.C88144b;
import kg3.C76577a;
import kv1.C99254i;
import lg3.C76695c;
import lg3.C88494d;
import lv1.C99667f;
import mk3.C76773b;
import nj3.C76874e0;
import nj3.C76879j;
import nj3.C88990b;
import p206nj.C76866m;
import p629ny.C76979h;
import p684si.C77712d;
import p910lj.C76701a;
import qe3.C89625d;
import rb0.C47984k;
import t90.C77879c;
import tc0.C48629h;
import tc0.C77885p;
import te3.C101801kd0;
import te3.C101835rd0;
import uk3.C78222a;
import uo3.C78253a;
import wd3.C53155r0;
import wz1.C78747b;
import xo3.C78950d;
import xo3.C78967g;
import yr3.C112481c;
import yr3.C79150a;
import zj3.C79341b1;
import zj3.C79348e;
import zj3.C79350e1;
import zj3.C79368l;
import zj3.C79384u0;
import zj3.C79393z;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.i7 */
public class C74059i7 {

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.i7$a */
    public static class C74060a extends C74023i implements NeatTextView.C75245c {

        /* renamed from: v */
        public C67391b f217302v;

        /* renamed from: w */
        public C74065f f217303w;

        /* renamed from: x */
        public CharSequence f217304x;

        /* renamed from: y */
        public int f217305y = -1;

        /* renamed from: z */
        public int f217306z = -1;

        /* renamed from: E */
        public View mo26231E(LayoutInflater layoutInflater, View view) {
            if (view != null && view.getTag() != null) {
                return view;
            }
            C6807n4 n4Var = new C6807n4(layoutInflater, C0966R.C0971layout.f6879r1);
            C74068g gVar = new C74068g();
            gVar.mo103138a(n4Var, true);
            n4Var.setTag(gVar);
            return n4Var;
        }

        /* renamed from: R */
        public boolean mo26232R() {
            return false;
        }

        @Deprecated
        /* renamed from: X */
        public boolean mo26233X(MenuItem menuItem, C67391b bVar, C72963f4 f4Var) {
            return false;
        }

        /* JADX WARNING: type inference failed for: r1v11, types: [java.lang.CharSequence] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: Y */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo26234Y(android.view.MenuItem r15, ck3.C67391b r16, com.tencent.p014mm.p136ui.chatting.viewitems.C74243t8 r17) {
            /*
                r14 = this;
                r0 = r16
                r1 = r17
                java.lang.Class<zj3.e> r2 = zj3.C79348e.class
                java.lang.Class<zj3.e1> r3 = zj3.C79350e1.class
                r9 = 0
                if (r1 != 0) goto L_0x000c
                return r9
            L_0x000c:
                com.tencent.mm.storage.f4 r4 = r1.f212238a
                int r5 = r15.getItemId()
                r6 = 102(0x66, float:1.43E-43)
                r7 = 2131821443(0x7f110383, float:1.927563E38)
                r8 = 2
                java.lang.String r10 = "MicroMsg.ChattingItemTextFrom"
                r11 = 1
                if (r5 == r6) goto L_0x0188
                r6 = 108(0x6c, float:1.51E-43)
                r12 = 4
                if (r5 == r6) goto L_0x0178
                r6 = 124(0x7c, float:1.74E-43)
                if (r5 == r6) goto L_0x016b
                r6 = 125(0x7d, float:1.75E-43)
                if (r5 == r6) goto L_0x016b
                r6 = 151(0x97, float:2.12E-43)
                if (r5 == r6) goto L_0x0163
                r6 = 152(0x98, float:2.13E-43)
                if (r5 == r6) goto L_0x0157
                r6 = -1
                switch(r5) {
                    case 141: goto L_0x0117;
                    case 142: goto L_0x0093;
                    case 143: goto L_0x0038;
                    default: goto L_0x0036;
                }
            L_0x0036:
                goto L_0x0187
            L_0x0038:
                com.tencent.mm.autogen.events.DoFavoriteEvent r5 = new com.tencent.mm.autogen.events.DoFavoriteEvent
                r5.<init>()
                java.lang.String r12 = r4.mo108727G2()
                boolean r13 = r16.mo91583x()
                if (r13 == 0) goto L_0x0064
                com.tencent.mm.ui.chatting.manager.a r13 = r0.f193278b
                xi.d r2 = r13.mo102812a(r2)
                zj3.e r2 = (zj3.C79348e) r2
                boolean r2 = r2.mo70071q1()
                if (r2 != 0) goto L_0x0064
                int r2 = eb0.C75604z3.m90848t(r12)
                if (r2 == r6) goto L_0x0064
                int r2 = r2 + r11
                java.lang.String r2 = r12.substring(r2)
                java.lang.String r12 = r2.trim()
            L_0x0064:
                com.tencent.p014mm.pluginsdk.model.C96787m0.m124258l(r5, r12, r11)
                com.tencent.mm.autogen.events.DoFavoriteEvent$a r2 = r5.f264674d
                com.tencent.mm.ui.chatting.BaseChattingUIFragment r6 = r0.f193286j
                r2.f264685j = r6
                r6 = 43
                r2.f264688m = r6
                te3.kd0 r2 = r2.f264676a
                if (r2 == 0) goto L_0x008c
                te3.rd0 r2 = r2.f298616d
                if (r2 == 0) goto L_0x0188
                java.lang.String r6 = r4.mo108768t()
                r2.mo141275k(r6)
                java.lang.String r6 = eb0.C75592q0.m90789s()
                r2.mo141279o(r6)
                r5.publish()
                goto L_0x0188
            L_0x008c:
                java.lang.String r2 = "alvinluo transform text fav failed"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r2)
                goto L_0x0188
            L_0x0093:
                android.content.Intent r1 = new android.content.Intent
                android.app.Activity r3 = r16.mo91565f()
                java.lang.Class<com.tencent.mm.ui.transmit.MsgRetransmitUI> r5 = com.tencent.p014mm.p136ui.transmit.MsgRetransmitUI.class
                r1.<init>(r3, r5)
                java.lang.String r3 = r4.mo108727G2()
                boolean r5 = r16.mo91583x()
                if (r5 == 0) goto L_0x00c5
                com.tencent.mm.ui.chatting.manager.a r5 = r0.f193278b
                xi.d r2 = r5.mo102812a(r2)
                zj3.e r2 = (zj3.C79348e) r2
                boolean r2 = r2.mo70071q1()
                if (r2 != 0) goto L_0x00c5
                int r2 = eb0.C75604z3.m90848t(r3)
                if (r2 == r6) goto L_0x00c5
                int r2 = r2 + r11
                java.lang.String r2 = r3.substring(r2)
                java.lang.String r3 = r2.trim()
            L_0x00c5:
                boolean r2 = r4.mo100988a4()
                java.lang.String r4 = "Retr_Msg_Type"
                java.lang.String r5 = "Retr_Msg_content"
                if (r2 == 0) goto L_0x00d7
                r1.putExtra(r5, r3)
                r2 = 6
                r1.putExtra(r4, r2)
                goto L_0x00dd
            L_0x00d7:
                r1.putExtra(r5, r3)
                r1.putExtra(r4, r12)
            L_0x00dd:
                k20.a r10 = new k20.a
                r10.<init>()
                r10.mo10233c(r1)
                java.lang.Object[] r2 = r10.mo10232b()
                java.lang.String r3 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemText$ChattingItemTextFrom"
                java.lang.String r4 = "onContextItemSelected"
                java.lang.String r5 = "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/viewitems/ItemDataTag;)Z"
                java.lang.String r6 = "Undefined"
                java.lang.String r7 = "startActivity"
                java.lang.String r8 = "(Landroid/content/Intent;)V"
                r1 = r16
                j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
                java.lang.Object r1 = r10.mo10231a(r9)
                android.content.Intent r1 = (android.content.Intent) r1
                r0.mo91556Q(r1)
                java.lang.String r2 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemText$ChattingItemTextFrom"
                java.lang.String r3 = "onContextItemSelected"
                java.lang.String r4 = "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/viewitems/ItemDataTag;)Z"
                java.lang.String r5 = "Undefined"
                java.lang.String r6 = "startActivity"
                java.lang.String r7 = "(Landroid/content/Intent;)V"
                r1 = r16
                j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
                return r11
            L_0x0117:
                java.lang.String r1 = r4.mo108727G2()
                boolean r3 = r16.mo91583x()
                if (r3 == 0) goto L_0x013e
                com.tencent.mm.ui.chatting.manager.a r3 = r0.f193278b
                xi.d r2 = r3.mo102812a(r2)
                zj3.e r2 = (zj3.C79348e) r2
                boolean r2 = r2.mo70071q1()
                if (r2 != 0) goto L_0x013e
                int r2 = eb0.C75604z3.m90848t(r1)
                if (r2 == r6) goto L_0x013e
                int r2 = r2 + r11
                java.lang.String r1 = r1.substring(r2)
                java.lang.String r1 = r1.trim()
            L_0x013e:
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
                if (r2 != 0) goto L_0x0147
                com.tencent.p014mm.sdk.platformtools.ClipboardHelper.setText(r1)
            L_0x0147:
                android.app.Activity r1 = r16.mo91565f()
                android.app.Activity r0 = r16.mo91565f()
                java.lang.String r0 = r0.getString(r7)
                nj3.C76879j.m92726T(r1, r0)
                return r11
            L_0x0157:
                com.tencent.mm.ui.chatting.manager.a r0 = r0.f193278b
                xi.d r0 = r0.mo102812a(r3)
                zj3.e1 r0 = (zj3.C79350e1) r0
                r0.mo102311d5(r4)
                goto L_0x0187
            L_0x0163:
                long r1 = r4.getMsgId()
                com.tencent.p014mm.p136ui.chatting.C73309a2.m86449b(r0, r1, r8)
                return r9
            L_0x016b:
                com.tencent.mm.ui.chatting.manager.a r0 = r0.f193278b
                xi.d r0 = r0.mo102812a(r3)
                zj3.e1 r0 = (zj3.C79350e1) r0
                r2 = r15
                r0.mo102305S2(r15, r4)
                goto L_0x0187
            L_0x0178:
                com.tencent.p014mm.p136ui.chatting.viewitems.C74059i7.m88000e(r4, r12, r9)
                com.tencent.mm.ui.chatting.viewitems.i7$a$$a r1 = new com.tencent.mm.ui.chatting.viewitems.i7$a$$a
                r1.<init>(r0, r4)
                android.app.Activity r0 = r16.mo91565f()
                com.tencent.p014mm.p136ui.chatting.manager.C6789c.m7088a(r4, r0, r1)
            L_0x0187:
                return r9
            L_0x0188:
                r2 = r15
                com.tencent.mm.ui.chatting.manager.a r5 = r0.f193278b
                xi.d r3 = r5.mo102812a(r3)
                zj3.e1 r3 = (zj3.C79350e1) r3
                r5 = r1
                com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate$c r5 = (com.tencent.p014mm.p136ui.chatting.viewitems.ChattingItemTranslate.C73916c) r5
                com.tencent.mm.storage.f4 r5 = r5.f212238a
                java.lang.String r3 = r3.mo102315z(r5, r9)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "groupId = "
                r5.append(r6)
                int r2 = r15.getGroupId()
                r5.append(r2)
                java.lang.String r2 = ", content length: "
                r5.append(r2)
                if (r3 != 0) goto L_0x01b4
                r2 = 0
                goto L_0x01b8
            L_0x01b4:
                int r2 = r3.length()
            L_0x01b8:
                r5.append(r2)
                java.lang.String r2 = r5.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r10, r2)
                int r2 = eb0.C75569c4.m90676i(r4)     // Catch:{ Exception -> 0x01e4 }
                if (r2 < r8) goto L_0x01d8
                r2 = r1
                com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate$c r2 = (com.tencent.p014mm.p136ui.chatting.viewitems.ChattingItemTranslate.C73916c) r2     // Catch:{ Exception -> 0x01e4 }
                java.lang.CharSequence r2 = r2.f216965U     // Catch:{ Exception -> 0x01e4 }
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.CharSequence) r2)     // Catch:{ Exception -> 0x01e4 }
                if (r2 != 0) goto L_0x01d8
                com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate$c r1 = (com.tencent.p014mm.p136ui.chatting.viewitems.ChattingItemTranslate.C73916c) r1     // Catch:{ Exception -> 0x01e4 }
                java.lang.CharSequence r1 = r1.f216965U     // Catch:{ Exception -> 0x01e4 }
                r3 = r1
            L_0x01d8:
                com.tencent.p014mm.sdk.platformtools.ClipboardHelper.setText(r3)     // Catch:{ Exception -> 0x01e4 }
                r1 = 3
                int r2 = r3.length()     // Catch:{ Exception -> 0x01e4 }
                com.tencent.p014mm.p136ui.chatting.viewitems.C74059i7.m88000e(r4, r1, r2)     // Catch:{ Exception -> 0x01e4 }
                goto L_0x01e9
            L_0x01e4:
                java.lang.String r1 = "clip.setText error "
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r1)
            L_0x01e9:
                android.app.Activity r1 = r16.mo91565f()
                android.app.Activity r0 = r16.mo91565f()
                java.lang.String r0 = r0.getString(r7)
                nj3.C76879j.m92726T(r1, r0)
                jm2.a r0 = jm2.C46562a.INSTANCE
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                long r5 = r4.mo108774y2()
                r1.append(r5)
                java.lang.String r2 = ""
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = r3.toString()
                int r2 = com.tencent.p014mm.sdk.platformtools.Util.getUTF8ByteLength(r2)
                r0.F80(r11, r1, r2)
                com.tencent.mm.autogen.mmdata.rpt.ShareMsgClipStruct r0 = new com.tencent.mm.autogen.mmdata.rpt.ShareMsgClipStruct     // Catch:{ Exception -> 0x0240 }
                r0.<init>()     // Catch:{ Exception -> 0x0240 }
                long r1 = r4.mo108774y2()     // Catch:{ Exception -> 0x0240 }
                r0.f194382d = r1     // Catch:{ Exception -> 0x0240 }
                int r1 = r3.length()     // Catch:{ Exception -> 0x0240 }
                r0.f194384f = r1     // Catch:{ Exception -> 0x0240 }
                r1 = r14
                java.lang.CharSequence r2 = r1.f217304x     // Catch:{ Exception -> 0x023e }
                int r2 = r2.length()     // Catch:{ Exception -> 0x023e }
                r0.f194383e = r2     // Catch:{ Exception -> 0x023e }
                int r2 = eb0.C75569c4.m90675h(r4)     // Catch:{ Exception -> 0x023e }
                r0.f194385g = r2     // Catch:{ Exception -> 0x023e }
                r0.mo86054n()     // Catch:{ Exception -> 0x023e }
                goto L_0x024f
            L_0x023e:
                r0 = move-exception
                goto L_0x0242
            L_0x0240:
                r0 = move-exception
                r1 = r14
            L_0x0242:
                java.lang.Object[] r2 = new java.lang.Object[r11]
                java.lang.String r0 = r0.getMessage()
                r2[r9] = r0
                java.lang.String r0 = "report occur exception! %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r10, r0, r2)
            L_0x024f:
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.viewitems.C74059i7.C74060a.mo26234Y(android.view.MenuItem, ck3.b, com.tencent.mm.ui.chatting.viewitems.t8):boolean");
        }

        /* renamed from: Z */
        public boolean mo26235Z(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo, C72963f4 f4Var) {
            if (!f4Var.mo100993e4() && !f4Var.mo100988a4() && f4Var.getType() != 1107296305) {
                return true;
            }
            ChattingItemTranslate.C73916c cVar = (ChattingItemTranslate.C73916c) view.getTag();
            int b = cVar.mo103252b();
            int i = cVar.f216964T;
            if (i == 1) {
                if (f4Var.mo100993e4()) {
                    if (C78747b.m95095G(f4Var)) {
                        e0Var.mo107136c(b, 151, 0, this.f217302v.mo91572m().getString(C0966R.string.ffj), C0966R.raw.icons_filled_continued_form);
                    }
                    if (!C75569c4.m90688u(f4Var) && !C75569c4.m90687t(f4Var)) {
                        e0Var.mo107136c(b, 102, 0, view.getContext().getString(C0966R.string.b9x), C0966R.raw.icons_filled_copy);
                    }
                }
                if (!C75569c4.m90688u(f4Var) && !C75569c4.m90687t(f4Var)) {
                    e0Var.mo107136c(b, 108, 0, view.getContext().getString(C0966R.string.i48), C0966R.raw.icons_filled_share);
                }
                C88144b.m109788f("favorite");
                e0Var.mo107136c(b, 116, 0, view.getContext().getString(C0966R.string.f361137hk2), C0966R.raw.icons_filled_favorites);
                if (f4Var.mo100993e4() && C47984k.m53332f()) {
                    this.f217302v.mo91584y();
                }
                if (!this.f217302v.mo91584y()) {
                    e0Var.mo107136c(b, 100, 0, view.getContext().getString(C0966R.string.b_1), C0966R.raw.icons_filled_delete);
                }
                if (C67651f.m79887a() && (!f4Var.mo101015s3() || !f4Var.mo101006n3())) {
                    e0Var.mo107136c(b, 124, 0, view.getContext().getString(C0966R.string.b_m), C0966R.raw.icons_filled_translate);
                }
                if (C75569c4.m90690w(f4Var) || C75569c4.m90676i(f4Var) == 4) {
                    e0Var.clear();
                    if (!this.f217302v.mo91584y()) {
                        e0Var.mo107136c(b, 100, 0, view.getContext().getString(C0966R.string.b_1), C0966R.raw.icons_filled_delete);
                    }
                }
            } else if (i == 2) {
                C76874e0 e0Var2 = e0Var;
                int i2 = b;
                e0Var2.mo107136c(i2, 141, 0, view.getContext().getString(C0966R.string.b9x), C0966R.raw.icons_filled_copy);
                e0Var2.mo107136c(i2, TPOptionalID.OPTION_ID_BEFORE_LONG_SEEK_AV_PTS_ALIGN_MAX_THRESHOLD_MS, 0, view.getContext().getString(C0966R.string.i48), C0966R.raw.icons_filled_share);
                C88144b.m109788f("favorite");
                e0Var.mo107136c(b, TPOptionalID.f349338xc9bdf6cd, 0, view.getContext().getString(C0966R.string.f361137hk2), C0966R.raw.icons_filled_favorites);
                if (!C67651f.m79887a() || !f4Var.mo101015s3() || !f4Var.mo101006n3()) {
                    return false;
                }
                C76874e0 e0Var3 = e0Var;
                int i3 = b;
                e0Var3.mo107136c(i3, 124, 0, view.getContext().getString(C0966R.string.b_k), C0966R.raw.icons_filled_eyes_off);
                e0Var3.mo107136c(i3, 152, 0, view.getContext().getString(C0966R.string.ml5), C0966R.raw.icons_filled_feedback_error);
                return false;
            }
            return true;
        }

        /* renamed from: a0 */
        public boolean mo26236a0(View view, C67391b bVar, C72963f4 f4Var) {
            if (view instanceof MMTextView) {
                C78222a a = C78222a.m94508a();
                CharSequence text = ((MMTextView) view).getText();
                a.getClass();
                C78222a.m94509b(text, f4Var, 1);
            }
            return true;
        }

        /* renamed from: b */
        public boolean mo103047b(View view, MotionEvent motionEvent) {
            String str;
            Class cls = C79341b1.class;
            if (C74038i2.m87963a(view)) {
                Log.m105924i("MicroMsg.ChattingItemTextFrom", "onDoubleTap solitaire fold double click");
                return true;
            }
            Intent intent = new Intent(view.getContext(), TextPreviewUI.class);
            intent.addFlags(67108864);
            if (view.getTag() instanceof ChattingItemTranslate.C73916c) {
                ChattingItemTranslate.C73916c cVar = (ChattingItemTranslate.C73916c) view.getTag();
                Long valueOf = Long.valueOf(cVar.f212238a.getMsgId());
                intent.putExtra("Chat_Msg_Id", valueOf);
                if (((C79341b1) this.f217302v.f193278b.mo102812a(cls)).mo26169i3() == valueOf.longValue() || ((C79341b1) this.f217302v.f193278b.mo102812a(cls)).mo26163T4() == valueOf.longValue()) {
                    Log.m105918d("MicroMsg.ChattingItemTextFrom", "speechPlaying stop!!");
                    ((C79341b1) this.f217302v.f193278b.mo102812a(cls)).mo26161K5(this.f217302v);
                }
                if (((C79393z) this.f217302v.f193278b.mo102812a(C79393z.class)).mo102454a5(cVar.f212238a)) {
                    str = ((MMNeat7extView) view).mo154968a().toString();
                } else {
                    str = ((C79350e1) this.f217302v.f193278b.mo102812a(C79350e1.class)).mo102315z(cVar.f212238a, cVar.f216964T == 2);
                }
                intent.putExtra("key_chat_text", str);
                intent.putExtra("is_group_chat", this.f217302v.mo91583x());
                Context context = view.getContext();
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                Context context2 = context;
                C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemText$ChattingItemTextFrom", "onDoubleTap", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(context2, "com/tencent/mm/ui/chatting/viewitems/ChattingItemText$ChattingItemTextFrom", "onDoubleTap", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                C88990b.m111199h(view.getContext());
                ((C98591h) C86312j.m106911c(C98591h.class)).Gr0(cVar.f212238a.mo108768t());
            }
            return true;
        }

        /* renamed from: d */
        public C72963f4.C72966d mo82118d(C72963f4 f4Var, Context context, C39969i iVar) {
            return new C74062c(f4Var);
        }

        /* renamed from: f */
        public void mo26237f(C74023i.C74026c cVar, C67391b bVar, C72963f4 f4Var, String str) {
            ChattingItemTranslate.C73918e eVar;
            String str2;
            SpannableString spannableString;
            boolean z;
            Bundle bundle;
            Class cls;
            boolean z2;
            boolean z3;
            ChattingItemTranslate.C73918e eVar2;
            int i;
            int i2;
            SpannableString spannableString2;
            SpannableString spannableString3;
            int t;
            C67391b bVar2 = bVar;
            C72963f4 f4Var2 = f4Var;
            ChattingItemTranslate.C73918e eVar3 = ChattingItemTranslate.C73918e.NoTransform;
            Class cls2 = C76979h.class;
            this.f217302v = bVar2;
            C74068g gVar = (C74068g) cVar;
            String b = C74059i7.m87997b(f4Var);
            String r = bVar.mo91577r();
            gVar.f217322b.setTag(C0966R.C0970id.f357682b73, Long.valueOf(f4Var.getMsgId()));
            MMNeat7extView mMNeat7extView = gVar.f217322b;
            Boolean bool = Boolean.TRUE;
            mMNeat7extView.setTag(C0966R.C0970id.f357681b72, bool);
            gVar.f217322b.setTag(new ChattingItemTranslate.C73916c(f4Var2, bVar.mo91583x(), gVar, (String) null));
            if (C76695c.m92341b() && C76695c.m92343d()) {
                C74068g.m88036b(f4Var2, gVar, bVar2, bool);
            }
            if (C67651f.m79887a()) {
                str2 = (!f4Var.mo101015s3() || !f4Var.mo101006n3()) ? null : f4Var.mo108727G2();
                eVar = ((C79350e1) bVar2.f193278b.mo102812a(C79350e1.class)).mo102314n4(f4Var2);
            } else {
                eVar = eVar3;
                str2 = null;
            }
            if (bVar.mo91583x()) {
                if (!((C79348e) bVar2.f193278b.mo102812a(C79348e.class)).mo70071q1() && (t = C75604z3.m90848t(b)) != -1) {
                    String trim = b.substring(0, t).trim();
                    if (trim != null && trim.length() > 0) {
                        r = trim;
                    }
                    int i3 = t + 1;
                    b = b.substring(i3).trim();
                    if (!Util.isNullOrNil(str2)) {
                        str2 = str2.substring(i3).trim();
                    }
                }
            }
            String str3 = str2;
            mo102973h(gVar, bVar2, f4Var2, r);
            mo103089g(gVar, bVar2, r, f4Var2);
            boolean z4 = f4Var2.f230724G != null && (f4Var.mo100964D3() || f4Var.mo100971J3());
            C76773b.f224572a.mo107028a(gVar.f217322b, f4Var2, bVar.mo91583x(), r);
            Bundle a = C45331f0.m50242a(bVar.mo91583x(), C76528a.m92004a(f4Var.mo108768t()));
            Bundle f = C74059i7.m88001f(f4Var2, bVar2, r);
            f.putAll(a);
            boolean z5 = !C75569c4.m90693z(f4Var);
            if (!z4) {
                if (C72996z1.m85843n5(r)) {
                    C75362d0 p = C75370s.m90390p(gVar.f217322b.getContext(), z5, 1, f, mo103132o0(f4Var2));
                    p.f221551e = false;
                    p.f221566t = C75370s.f221609d.mo1519a();
                    spannableString3 = p.mo105696d(b, (int) gVar.f217322b.getTextSize(), true);
                } else {
                    spannableString3 = ((C76979h) C86312j.m106911c(cls2)).mo107061Zz(gVar.f217322b.getContext(), b, (int) gVar.f217322b.getTextSize(), 1, f, mo103132o0(f4Var2), 0, C76979h.f224926w0, z5);
                }
                C79384u0 u0Var = (C79384u0) bVar2.f193278b.mo102812a(C79384u0.class);
                if (u0Var.mo102507U0(f4Var.getMsgId())) {
                    ArrayList<String> N4 = u0Var.mo102505N4();
                    C99667f.C99668a aVar = C99667f.C99668a.Background;
                    int i4 = C68987c.f198232b;
                    C99667f a2 = C99667f.m130088a(spannableString3, Util.listToString(N4, " "), false, false);
                    a2.f292092e = aVar;
                    a2.f292093f = i4;
                    gVar.f217322b.mo104280c(C99254i.m129308e(a2).f292107a, TextView.BufferType.SPANNABLE, (Boolean) null);
                    z = false;
                } else {
                    z = true;
                }
                C75359b0[] b0VarArr = (C75359b0[]) spannableString3.getSpans(0, spannableString3.length(), C75359b0.class);
                int length = b0VarArr.length;
                int i5 = 0;
                while (true) {
                    if (i5 >= length) {
                        break;
                    } else if (b0VarArr[i5].getType() == 44) {
                        C115669n.INSTANCE.mo160131h(12809, 7, "");
                        break;
                    } else {
                        i5++;
                    }
                }
                spannableString = spannableString3;
            } else if (z4) {
                f.putInt("geta8key_scene", 31);
                if (C72996z1.m85843n5(r)) {
                    C75362d0 p2 = C75370s.m90390p(gVar.f217322b.getContext(), z5, 1, f, mo103132o0(f4Var2));
                    p2.f221551e = false;
                    p2.f221566t = C75370s.f221609d.mo1519a();
                    spannableString2 = p2.mo105696d(C74059i7.m87998c(bVar.mo91565f(), b, f4Var2), (int) gVar.f217322b.getTextSize(), true);
                } else {
                    spannableString2 = ((C76979h) C86312j.m106911c(cls2)).mo107061Zz(gVar.f217322b.getContext(), C74059i7.m87998c(bVar.mo91565f(), b, f4Var2), (int) gVar.f217322b.getTextSize(), 1, f, mo103132o0(f4Var2), 0, C76979h.f224926w0, z5);
                }
                spannableString = spannableString2;
                z = true;
            } else {
                z = true;
                spannableString = null;
            }
            if (z) {
                z2 = z5;
                bundle = f;
                cls = cls2;
                z3 = false;
                C74038i2.m87964b(gVar.f217322b.getContext(), bVar, C74059i7.m87997b(f4Var), spannableString, gVar.f217322b, f4Var, 1);
            } else {
                z2 = z5;
                bundle = f;
                cls = cls2;
                z3 = false;
            }
            if (C78747b.m95095G(f4Var)) {
                gVar.f217332l.setText(bVar.mo91572m().getString(C0966R.string.ffo));
                gVar.f217332l.setVisibility(z3 ? 1 : 0);
                gVar.f217332l.setOnClickListener(new i7$a$$b(this, gVar, bVar2));
            } else {
                gVar.f217332l.setVisibility(8);
            }
            C74059i7.m87999d(f4Var2, gVar, bVar2);
            Context context = gVar.f217322b.getContext();
            gVar.f217322b.setTag(C0966R.C0970id.ke5, Boolean.TRUE);
            if (gVar.f217329i == null) {
                C78253a aVar2 = new C78253a(context, gVar.f217322b);
                gVar.f217329i = aVar2;
                aVar2.f229227C = new i7$a$$c(this, bVar2, gVar);
                boolean e = ((C8808v4) C86312j.m106911c(C8808v4.class)).mo9635e();
                C78253a aVar3 = gVar.f217329i;
                aVar3.f229257z = true;
                aVar3.f229230F = z3;
                i7$a$$d i7_a__d = r0;
                C78253a aVar4 = aVar3;
                eVar2 = eVar3;
                i = C0966R.C0970id.ke5;
                i7$a$$d i7_a__d2 = new i7$a$$d(this, context, gVar, e, bVar, f4Var);
                aVar4.f229253v = i7_a__d;
                aVar4.f229251t = new i7$a$$e(this, gVar, context, bVar, f4Var);
            } else {
                eVar2 = eVar3;
                i = C0966R.C0970id.ke5;
            }
            C74059i7.m87996a(bVar2, C75569c4.m90676i(f4Var), spannableString, gVar.f217322b, z2);
            if (C75569c4.m90690w(f4Var) || C75569c4.m90688u(f4Var) || C75569c4.m90687t(f4Var)) {
                gVar.f217322b.setTag(i, Boolean.FALSE);
                gVar.f217322b.setOnTouchListener(gVar.f217331k);
                gVar.f217322b.setOnLongClickListener(mo103098p(bVar2));
                MMNeat7extView mMNeat7extView2 = gVar.f217322b;
                if (this.f217303w == null) {
                    this.f217303w = new C74065f(this.f217302v);
                }
                mMNeat7extView2.setOnClickListener(this.f217303w);
            } else {
                int h = C75569c4.m90675h(f4Var);
                if (h <= 0 || h >= C78967g.m95477j(gVar.f217322b).length()) {
                    h = 0;
                }
                C74023i.C74027e p3 = mo103098p(bVar2);
                C78950d.C78963m v = mo103100v(p3);
                C78950d dVar = gVar.f217330j;
                if (dVar != null) {
                    dVar.mo108918b();
                }
                int[] iArr = new int[2];
                MMNeat7extView mMNeat7extView3 = gVar.f217322b;
                if (mMNeat7extView3 != null) {
                    mMNeat7extView3.getLocationInWindow(iArr);
                    int i6 = iArr[0];
                    if (i6 == 0) {
                        Rect rect = new Rect();
                        gVar.f217322b.getGlobalVisibleRect(rect);
                        i2 = rect.left;
                    } else {
                        i2 = i6;
                    }
                } else {
                    i2 = 0;
                }
                MMNeat7extView mMNeat7extView4 = gVar.f217322b;
                C78253a aVar5 = gVar.f217329i;
                if (this.f217303w == null) {
                    this.f217303w = new C74065f(this.f217302v);
                }
                C78950d.C78958h hVar = new C78950d.C78958h(mMNeat7extView4, aVar5, v, this.f217303w, gVar.f217331k);
                hVar.f231878g = C0966R.color.aak;
                hVar.f231879h = 18;
                hVar.f231877f = C0966R.color.f3274lt;
                if (i2 != 0) {
                    hVar.f231880i = i2 + C74942w4.m89786c(gVar.f217322b.getContext(), C0966R.dimen.f3736cp);
                }
                C78950d dVar2 = new C78950d(hVar);
                gVar.f217330j = dVar2;
                C74064e eVar4 = new C74064e(dVar2);
                dVar2.f231842d = new i7$a$$f(this);
                p3.f217229n = new i7$a$$g(this, gVar);
                dVar2.f231858t = h;
                dVar2.f231837L = eVar4;
            }
            gVar.f217322b.setOnDoubleClickListener(this);
            gVar.f217322b.setTextListener(new i7$a$$h(this, gVar));
            if (!Util.isNullOrNil(str3) || eVar != eVar2) {
                if (gVar.f217326f == null) {
                    ChattingItemTranslate chattingItemTranslate = (ChattingItemTranslate) gVar.f217325e.inflate();
                    gVar.f217326f = chattingItemTranslate;
                    chattingItemTranslate.mo102992b();
                }
                C72963f4 f4Var3 = f4Var;
                gVar.f217326f.mo102993c(((C76979h) C86312j.m106911c(cls)).mo107078or(gVar.f217322b.getContext(), str3, (int) gVar.f217322b.getTextSize(), 1, bundle, mo103132o0(f4Var3)), eVar);
                gVar.f217326f.setBrandWording(Util.isNullOrNil(f4Var.mo108726F2()) ? bVar.mo91572m().getString(C0966R.string.k2b) : f4Var.mo108726F2());
                if (!Util.isNullOrNil(str3)) {
                    ChattingItemTranslate.C73916c cVar2 = new ChattingItemTranslate.C73916c(f4Var3, bVar.mo91583x(), gVar, (String) null);
                    cVar2.f216964T = 2;
                    gVar.f217326f.setTag(cVar2);
                    gVar.f217326f.getContentView().setTag(cVar2);
                    ChattingItemTranslate chattingItemTranslate2 = gVar.f217326f;
                    if (this.f217303w == null) {
                        this.f217303w = new C74065f(this.f217302v);
                    }
                    chattingItemTranslate2.setOnClickListener(this.f217303w);
                    gVar.f217326f.setOnDoubleClickListener(this);
                    gVar.f217326f.setOnTouchListener(((C79368l) bVar2.f193278b.mo102812a(C79368l.class)).mo108189Z4());
                    gVar.f217326f.setOnLongClickListener(mo103098p(bVar2));
                    gVar.f217326f.setVisibility(0);
                    return;
                }
                return;
            }
            ChattingItemTranslate chattingItemTranslate3 = gVar.f217326f;
            if (chattingItemTranslate3 != null) {
                chattingItemTranslate3.setVisibility(8);
            }
        }

        /* renamed from: k0 */
        public boolean mo26238k0(int i, boolean z) {
            if (!z) {
                return i == 1 || i == 11 || i == 21 || i == 31 || i == 36 || i == 301989937 || i == 1107296305;
            }
            return false;
        }

        /* renamed from: m0 */
        public boolean mo26239m0() {
            return false;
        }

        /* renamed from: n0 */
        public boolean mo103045n0(C67391b bVar) {
            return bVar.mo91583x();
        }

        /* renamed from: o0 */
        public final String mo103132o0(C72963f4 f4Var) {
            if (f4Var == null) {
                return null;
            }
            String a = C86493v0.m107223a("" + f4Var.mo108774y2());
            C86493v0.C86495c c = C86493v0.m107224d().mo120947c(a, true);
            c.mo120962i("prePublishId", "msg_" + f4Var.mo108774y2());
            c.mo120962i("preUsername", mo103068y(this.f217302v, f4Var));
            c.mo120962i("preChatName", mo103102x(this.f217302v, f4Var));
            return a;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.i7$b */
    public static class C74061b extends C74023i implements NeatTextView.C75245c, C73774p2 {

        /* renamed from: v */
        public C67391b f217307v;

        /* renamed from: w */
        public C74065f f217308w;

        /* renamed from: x */
        public CharSequence f217309x = "";

        /* renamed from: y */
        public int f217310y = -1;

        /* renamed from: z */
        public int f217311z = -1;

        /* renamed from: E */
        public View mo26231E(LayoutInflater layoutInflater, View view) {
            if (view != null && view.getTag() != null) {
                return view;
            }
            C6807n4 n4Var = new C6807n4(layoutInflater, C0966R.C0971layout.f6930si);
            C74068g gVar = new C74068g();
            gVar.mo103138a(n4Var, false);
            n4Var.setTag(gVar);
            return n4Var;
        }

        /* renamed from: R */
        public boolean mo26232R() {
            return true;
        }

        @Deprecated
        /* renamed from: X */
        public boolean mo26233X(MenuItem menuItem, C67391b bVar, C72963f4 f4Var) {
            return false;
        }

        /* renamed from: Y */
        public boolean mo26234Y(MenuItem menuItem, C67391b bVar, C74243t8 t8Var) {
            CharSequence charSequence;
            C67391b bVar2 = bVar;
            C74243t8 t8Var2 = t8Var;
            Class cls = C79350e1.class;
            if (t8Var2 == null) {
                return false;
            }
            C72963f4 f4Var = t8Var2.f212238a;
            int itemId = menuItem.getItemId();
            if (itemId != 102) {
                if (itemId == 103) {
                    mo103134p0(f4Var);
                } else if (itemId == 108) {
                    C74059i7.m88000e(f4Var, 4, 0);
                    C6789c.m7088a(f4Var, bVar.mo91565f(), new i7$b$$a(bVar2, f4Var));
                } else if (itemId == 124 || itemId == 125) {
                    ((C79350e1) bVar2.f193278b.mo102812a(cls)).mo102305S2(menuItem, f4Var);
                } else if (itemId == 151) {
                    C73309a2.m86449b(bVar2, f4Var.getMsgId(), 2);
                    return false;
                } else if (itemId != 152) {
                    switch (itemId) {
                        case 141:
                            String G2 = f4Var.mo108727G2();
                            if (!Util.isNullOrNil(G2)) {
                                ClipboardHelper.setText(G2);
                            }
                            C76879j.m92726T(bVar.mo91565f(), bVar.mo91565f().getString(C0966R.string.f7938wv));
                            return true;
                        case TPOptionalID.OPTION_ID_BEFORE_LONG_SEEK_AV_PTS_ALIGN_MAX_THRESHOLD_MS /*142*/:
                            Intent intent = new Intent(bVar.mo91565f(), MsgRetransmitUI.class);
                            intent.putExtra("Retr_Msg_Id", f4Var.getMsgId());
                            String G22 = f4Var.mo108727G2();
                            if (f4Var.mo100988a4()) {
                                intent.putExtra("Retr_Msg_content", G22);
                                intent.putExtra("Retr_Msg_Type", 6);
                            } else {
                                intent.putExtra("Retr_Msg_content", G22);
                                intent.putExtra("Retr_Msg_Type", 4);
                            }
                            C9556a aVar = new C9556a();
                            aVar.mo10233c(intent);
                            C67391b bVar3 = bVar;
                            C117292a.m165358d(bVar3, aVar.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemText$ChattingItemTextTo", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/viewitems/ItemDataTag;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            bVar2.mo91556Q((Intent) aVar.mo10231a(0));
                            C117292a.m165359e(bVar3, "com/tencent/mm/ui/chatting/viewitems/ChattingItemText$ChattingItemTextTo", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/viewitems/ItemDataTag;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            return true;
                        case TPOptionalID.f349338xc9bdf6cd /*143*/:
                            DoFavoriteEvent doFavoriteEvent = new DoFavoriteEvent();
                            C96787m0.m124258l(doFavoriteEvent, f4Var.mo108727G2(), 1);
                            DoFavoriteEvent.C92474a aVar2 = doFavoriteEvent.f264674d;
                            aVar2.f264685j = bVar2.f193286j;
                            aVar2.f264688m = 43;
                            C101801kd0 kd02 = aVar2.f264676a;
                            if (kd02 == null) {
                                Log.m105920e("MicroMsg.ChattingItemTextTo", "alvinluo transform text fav failed");
                                break;
                            } else {
                                C101835rd0 rd02 = kd02.f298616d;
                                if (rd02 != null) {
                                    rd02.mo141275k(f4Var.mo108768t());
                                    rd02.mo141279o(C75592q0.m90789s());
                                    doFavoriteEvent.publish();
                                    break;
                                }
                            }
                            break;
                    }
                } else {
                    ((C79350e1) bVar2.f193278b.mo102812a(cls)).mo102311d5(f4Var);
                }
                return false;
            }
            MenuItem menuItem2 = menuItem;
            String z = ((C79350e1) bVar2.f193278b.mo102812a(cls)).mo102315z(((ChattingItemTranslate.C73916c) t8Var2).f212238a, false);
            StringBuilder sb = new StringBuilder();
            sb.append("groupId = ");
            sb.append(menuItem.getGroupId());
            sb.append(", content length: ");
            sb.append(z == null ? 0 : z.length());
            Log.m105918d("MicroMsg.ChattingItemTextTo", sb.toString());
            try {
                CharSequence charSequence2 = z;
                if (C75569c4.m90676i(f4Var) >= 2) {
                    charSequence2 = z;
                    if (!Util.isNullOrNil(((ChattingItemTranslate.C73916c) t8Var2).f216965U)) {
                        charSequence2 = ((ChattingItemTranslate.C73916c) t8Var2).f216965U;
                    }
                }
                ClipboardHelper.setText(charSequence2);
                C46562a aVar3 = C46562a.INSTANCE;
                aVar3.F80(1, f4Var.mo108774y2() + "", Util.getUTF8ByteLength(charSequence2.toString()));
                C74059i7.m88000e(t8Var2.f212238a, 3, charSequence2.length());
                charSequence = charSequence2;
            } catch (Exception unused) {
                Log.m105920e("MicroMsg.ChattingItemTextTo", "clip.setText error ");
                charSequence = z;
            }
            try {
                ShareMsgClipStruct shareMsgClipStruct = new ShareMsgClipStruct();
                shareMsgClipStruct.f194382d = f4Var.mo108774y2();
                shareMsgClipStruct.f194384f = charSequence.length();
                shareMsgClipStruct.f194383e = this.f217309x.length();
                shareMsgClipStruct.f194385g = C75569c4.m90675h(f4Var);
                shareMsgClipStruct.mo86054n();
            } catch (Exception e) {
                Log.m105921e("MicroMsg.ChattingItemTextTo", "report occur exception! %s", e.getMessage());
            }
            C76879j.m92726T(bVar.mo91565f(), bVar.mo91565f().getString(C0966R.string.f7938wv));
            return true;
        }

        /* renamed from: Z */
        public boolean mo26235Z(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo, C72963f4 f4Var) {
            C72963f4 f4Var2 = f4Var;
            String str = f4Var2.f230724G;
            if (str != null) {
                boolean contains = str.contains("announcement@all");
            }
            if (!f4Var.mo100993e4() && !f4Var.mo100988a4() && f4Var.getType() != 1107296305) {
                return true;
            }
            ChattingItemTranslate.C73916c cVar = (ChattingItemTranslate.C73916c) view.getTag();
            int b = cVar.mo103252b();
            int i = cVar.f216964T;
            if (i == 1) {
                if (f4Var.mo100993e4()) {
                    if (C78747b.m95095G(f4Var)) {
                        e0Var.mo107136c(b, 151, 0, this.f217307v.mo91572m().getString(C0966R.string.ffj), C0966R.raw.icons_filled_continued_form);
                    }
                    if (!C75569c4.m90688u(f4Var) && !C75569c4.m90687t(f4Var)) {
                        e0Var.mo107136c(b, 102, 0, view.getContext().getString(C0966R.string.b9x), C0966R.raw.icons_filled_copy);
                    }
                }
                if (!C75569c4.m90688u(f4Var) && !C75569c4.m90687t(f4Var)) {
                    e0Var.mo107136c(b, 108, 0, view.getContext().getString(C0966R.string.i48), C0966R.raw.icons_filled_share);
                }
                if (f4Var.getStatus() == 5) {
                    e0Var.mo107136c(b, 103, 0, view.getContext().getString(C0966R.string.f360269bb2), C0966R.raw.icons_filled_refresh);
                }
                C88144b.m109788f("favorite");
                e0Var.mo107136c(b, 116, 0, view.getContext().getString(C0966R.string.f361137hk2), C0966R.raw.icons_filled_favorites);
                if (!f4Var.mo100967F3() && f4Var.mo100993e4() && ((f4Var.mo101000j3() || f4Var2.f230728K == 1) && mo103083Q(f4Var2, this.f217307v) && mo103081O(f4Var.mo108768t()) && !this.f217307v.mo91580u())) {
                    e0Var.mo107136c(b, 123, 0, view.getContext().getString(C0966R.string.b_d), C0966R.raw.icons_filled_previous);
                }
                if (C67651f.m79887a() && (!f4Var.mo101015s3() || !f4Var.mo101006n3())) {
                    e0Var.mo107136c(b, 124, 0, view.getContext().getString(C0966R.string.b_m), C0966R.raw.icons_filled_translate);
                }
                if (f4Var.mo100993e4() && C47984k.m53332f()) {
                    this.f217307v.mo91584y();
                }
                if (!this.f217307v.mo91584y()) {
                    e0Var.mo107136c(b, 100, 0, view.getContext().getString(C0966R.string.b_1), C0966R.raw.icons_filled_delete);
                }
                if (C75569c4.m90690w(f4Var) || C75569c4.m90676i(f4Var) == 4) {
                    e0Var.clear();
                    if (!this.f217307v.mo91584y()) {
                        e0Var.mo107136c(b, 100, 0, view.getContext().getString(C0966R.string.b_1), C0966R.raw.icons_filled_delete);
                    }
                }
            } else if (i == 2) {
                C76874e0 e0Var2 = e0Var;
                int i2 = b;
                e0Var2.mo107136c(i2, 141, 0, view.getContext().getString(C0966R.string.b9x), C0966R.raw.icons_filled_copy);
                e0Var2.mo107136c(i2, TPOptionalID.OPTION_ID_BEFORE_LONG_SEEK_AV_PTS_ALIGN_MAX_THRESHOLD_MS, 0, view.getContext().getString(C0966R.string.i48), C0966R.raw.icons_filled_share);
                C88144b.m109788f("favorite");
                e0Var.mo107136c(b, TPOptionalID.f349338xc9bdf6cd, 0, view.getContext().getString(C0966R.string.f361137hk2), C0966R.raw.icons_filled_favorites);
                if (!C67651f.m79887a() || !f4Var.mo101015s3() || !f4Var.mo101006n3()) {
                    return false;
                }
                C76874e0 e0Var3 = e0Var;
                int i3 = b;
                e0Var3.mo107136c(i3, 124, 0, view.getContext().getString(C0966R.string.b_k), C0966R.raw.icons_filled_eyes_off);
                e0Var3.mo107136c(i3, 152, 0, view.getContext().getString(C0966R.string.ml5), C0966R.raw.icons_filled_feedback_error);
                return false;
            }
            return true;
        }

        /* renamed from: a */
        public void mo70162a(View view, C67391b bVar, C72963f4 f4Var) {
            f4Var.unsetOmittedFailResend();
            ((C72972g4) C97625j3.m125812b().mo105911z()).xy0(f4Var.getMsgId(), f4Var);
            if (f4Var.mo100993e4() && f4Var.mo108769t2() == 1) {
                mo103134p0(f4Var);
            }
        }

        /* renamed from: a0 */
        public boolean mo26236a0(View view, C67391b bVar, C72963f4 f4Var) {
            return false;
        }

        /* renamed from: b */
        public boolean mo103047b(View view, MotionEvent motionEvent) {
            String str;
            Class cls = C79341b1.class;
            if (C74038i2.m87963a(view)) {
                Log.m105924i("MicroMsg.ChattingItemTextTo", "onDoubleTap solitaire fold double click");
                return true;
            }
            Intent intent = new Intent(view.getContext(), TextPreviewUI.class);
            intent.addFlags(67108864);
            if (view.getTag() instanceof ChattingItemTranslate.C73916c) {
                ChattingItemTranslate.C73916c cVar = (ChattingItemTranslate.C73916c) view.getTag();
                long msgId = cVar.f212238a.getMsgId();
                intent.putExtra("Chat_Msg_Id", msgId);
                if (((C79341b1) this.f217307v.f193278b.mo102812a(cls)).mo26169i3() == msgId || ((C79341b1) this.f217307v.f193278b.mo102812a(cls)).mo26163T4() == msgId) {
                    Log.m105924i("MicroMsg.ChattingItemTextTo", "speechPlaying stop!!");
                    ((C79341b1) this.f217307v.f193278b.mo102812a(cls)).mo26161K5(this.f217307v);
                }
                if (((C79393z) this.f217307v.f193278b.mo102812a(C79393z.class)).mo102454a5(cVar.f212238a)) {
                    str = ((MMNeat7extView) view).mo154968a().toString();
                } else {
                    str = ((C79350e1) this.f217307v.f193278b.mo102812a(C79350e1.class)).mo102315z(cVar.f212238a, cVar.f216964T == 2);
                }
                intent.putExtra("key_chat_text", str);
                intent.putExtra("is_group_chat", this.f217307v.mo91583x());
                ((C98591h) C86312j.m106911c(C98591h.class)).Gr0(cVar.f212238a.mo108768t());
                Context context = view.getContext();
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                Context context2 = context;
                C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemText$ChattingItemTextTo", "onDoubleTap", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(context2, "com/tencent/mm/ui/chatting/viewitems/ChattingItemText$ChattingItemTextTo", "onDoubleTap", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                C88990b.m111199h(view.getContext());
            }
            return true;
        }

        /* renamed from: d */
        public C72963f4.C72966d mo82118d(C72963f4 f4Var, Context context, C39969i iVar) {
            return new C74062c(f4Var);
        }

        /* renamed from: f */
        public void mo26237f(C74023i.C74026c cVar, C67391b bVar, C72963f4 f4Var, String str) {
            SpannableString spannableString;
            C74061b bVar2;
            boolean z;
            Class cls;
            Bundle bundle;
            boolean z2;
            boolean z3;
            Class cls2;
            int i;
            C72963f4 f4Var2;
            ChattingItemTranslate.C73918e eVar;
            String str2;
            int i2;
            C67391b bVar3 = bVar;
            C72963f4 f4Var3 = f4Var;
            String str3 = str;
            Class cls3 = C79368l.class;
            Class cls4 = C76979h.class;
            this.f217307v = bVar3;
            C74068g gVar = (C74068g) cVar;
            gVar.f217322b.setTag(C0966R.C0970id.f357682b73, Long.valueOf(f4Var.getMsgId()));
            gVar.f217322b.setTag(C0966R.C0970id.f357681b72, Boolean.TRUE);
            gVar.f217322b.setMaxLines(Integer.MAX_VALUE);
            gVar.f217322b.setTag(new ChattingItemTranslate.C73916c(f4Var3, bVar.mo91583x(), gVar, (String) null));
            if (C74023i.m87878T()) {
                mo103093i0(gVar, false, true);
                if (f4Var.getStatus() == 1 || f4Var.getStatus() == 5) {
                    ImageView imageView = gVar.f217324d;
                    if (imageView != null) {
                        imageView.setVisibility(8);
                    }
                    gVar.f217322b.setBackgroundResource(C0966R.C0969drawable.f4812nl);
                    f4Var3.f212665D1 = true;
                } else if (gVar.f217324d != null) {
                    if (mo103080N((C79368l) bVar3.f193278b.mo102812a(cls3), f4Var.getMsgId())) {
                        if (f4Var3.f212665D1) {
                            AlphaAnimation alphaAnimation = new AlphaAnimation(0.5f, 1.0f);
                            alphaAnimation.setDuration(300);
                            gVar.f217322b.startAnimation(alphaAnimation);
                            f4Var3.f212665D1 = false;
                        }
                        gVar.f217324d.setVisibility(0);
                    } else {
                        gVar.f217324d.setVisibility(8);
                    }
                }
            } else {
                mo103093i0(gVar, f4Var.getStatus() < 2, true);
            }
            String b = C74059i7.m87997b(f4Var);
            if (C76695c.m92341b() && C76695c.m92343d()) {
                C74068g.m88036b(f4Var3, gVar, bVar3, Boolean.FALSE);
            }
            if (Util.isNullOrNil(b)) {
                Log.m105921e("MicroMsg.ChattingItemTextTo", "[carl] text to, content is null! why?? localid : %s, svrid : %s", Long.valueOf(f4Var.getMsgId()), Long.valueOf(f4Var.mo108774y2()));
            }
            boolean z4 = f4Var3.f230724G != null && (f4Var.mo100964D3() || f4Var.mo100971J3());
            C76773b.f224572a.mo107028a(gVar.f217322b, f4Var3, bVar.mo91583x(), str3);
            Bundle a = C45331f0.m50242a(bVar.mo91583x(), C76528a.m92004a(f4Var.mo108768t()));
            Bundle f = C74059i7.m88001f(f4Var3, bVar3, str3);
            f.putAll(a);
            boolean z5 = !C75569c4.m90693z(f4Var);
            if (!z4) {
                SpannableString Zz = ((C76979h) C86312j.m106911c(cls4)).mo107061Zz(gVar.f217322b.getContext(), b, (int) gVar.f217322b.getTextSize(), 4, f, mo103133o0(f4Var3), 0, C76979h.f224926w0, z5);
                C79384u0 u0Var = (C79384u0) bVar3.f193278b.mo102812a(C79384u0.class);
                if (u0Var.mo102507U0(f4Var.getMsgId())) {
                    ArrayList<String> N4 = u0Var.mo102505N4();
                    C99667f.C99668a aVar = C99667f.C99668a.Background;
                    int i3 = C68987c.f198233c;
                    C99667f a2 = C99667f.m130088a(Zz, Util.listToString(N4, " "), false, false);
                    a2.f292092e = aVar;
                    a2.f292093f = i3;
                    gVar.f217322b.mo104280c(C99254i.m129308e(a2).f292107a, TextView.BufferType.SPANNABLE, (Boolean) null);
                    z = false;
                } else {
                    z = true;
                }
                C75359b0[] b0VarArr = (C75359b0[]) Zz.getSpans(0, Zz.length(), C75359b0.class);
                int length = b0VarArr.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        break;
                    } else if (b0VarArr[i4].getType() == 44) {
                        C115669n.INSTANCE.mo160131h(12809, 6, "");
                        break;
                    } else {
                        i4++;
                    }
                }
                bVar2 = this;
                spannableString = Zz;
            } else if (z4) {
                f.putInt("geta8key_scene", 31);
                bVar2 = this;
                spannableString = ((C76979h) C86312j.m106911c(cls4)).mo107061Zz(gVar.f217322b.getContext(), C74059i7.m87998c(bVar.mo91565f(), b, f4Var3), (int) gVar.f217322b.getTextSize(), 4, f, bVar2.mo103133o0(f4Var3), 0, C76979h.f224926w0, z5);
                z = true;
            } else {
                bVar2 = this;
                z = true;
                spannableString = null;
            }
            if (z) {
                z2 = z5;
                bundle = f;
                cls = cls3;
                z3 = false;
                C74038i2.m87964b(gVar.f217322b.getContext(), bVar, C74059i7.m87997b(f4Var), spannableString, gVar.f217322b, f4Var, 4);
            } else {
                z2 = z5;
                bundle = f;
                cls = cls3;
                z3 = false;
            }
            if (C78747b.m95095G(f4Var)) {
                gVar.f217332l.setText(bVar.mo91572m().getString(C0966R.string.ffo));
                gVar.f217332l.setVisibility(z3 ? 1 : 0);
                gVar.f217332l.setOnClickListener(new i7$b$$b(bVar2, gVar, bVar3));
            } else {
                gVar.f217332l.setVisibility(8);
            }
            C74059i7.m87999d(f4Var3, gVar, bVar3);
            Context context = gVar.f217322b.getContext();
            gVar.f217322b.setTag(C0966R.C0970id.ke5, Boolean.TRUE);
            if (gVar.f217329i == null) {
                C78253a aVar2 = new C78253a(context, gVar.f217322b);
                gVar.f217329i = aVar2;
                aVar2.f229227C = new i7$b$$c(bVar2, bVar3, gVar);
                boolean e = ((C8808v4) C86312j.m106911c(C8808v4.class)).mo9635e();
                C78253a aVar3 = gVar.f217329i;
                aVar3.f229257z = true;
                aVar3.f229230F = z3;
                i7$b$$d i7_b__d = r0;
                cls2 = cls4;
                C78253a aVar4 = aVar3;
                i = C0966R.C0970id.ke5;
                i7$b$$d i7_b__d2 = new i7$b$$d(this, context, gVar, e, bVar, f4Var);
                aVar4.f229253v = i7_b__d;
                aVar4.f229251t = new i7$b$$e(this, gVar, context, bVar, f4Var);
            } else {
                cls2 = cls4;
                i = C0966R.C0970id.ke5;
            }
            C74059i7.m87996a(bVar3, C75569c4.m90676i(f4Var), spannableString, gVar.f217322b, z2);
            if (C75569c4.m90690w(f4Var) || C75569c4.m90688u(f4Var) || C75569c4.m90687t(f4Var)) {
                gVar.f217322b.setTag(i, Boolean.FALSE);
                gVar.f217322b.setOnTouchListener(gVar.f217331k);
                gVar.f217322b.setOnLongClickListener(bVar2.mo103098p(bVar3));
                MMNeat7extView mMNeat7extView = gVar.f217322b;
                if (bVar2.f217308w == null) {
                    bVar2.f217308w = new C74065f(bVar2.f217307v);
                }
                mMNeat7extView.setOnClickListener(bVar2.f217308w);
            } else {
                int h = C75569c4.m90675h(f4Var);
                if (h <= 0 || h >= C78967g.m95477j(gVar.f217322b).length()) {
                    h = 0;
                }
                C78950d dVar = gVar.f217330j;
                if (dVar != null) {
                    dVar.mo108918b();
                }
                C74023i.C74027e p = bVar2.mo103098p(bVar3);
                C78950d.C78963m v = bVar2.mo103100v(bVar2.mo103098p(bVar3));
                int[] iArr = new int[2];
                MMNeat7extView mMNeat7extView2 = gVar.f217322b;
                if (mMNeat7extView2 != null) {
                    mMNeat7extView2.getLocationInWindow(iArr);
                    int i5 = iArr[0];
                    if (i5 == 0) {
                        Rect rect = new Rect();
                        gVar.f217322b.getGlobalVisibleRect(rect);
                        i2 = rect.left;
                    } else {
                        i2 = i5;
                    }
                } else {
                    i2 = 0;
                }
                MMNeat7extView mMNeat7extView3 = gVar.f217322b;
                C78253a aVar5 = gVar.f217329i;
                if (bVar2.f217308w == null) {
                    bVar2.f217308w = new C74065f(bVar2.f217307v);
                }
                C78950d.C78958h hVar = new C78950d.C78958h(mMNeat7extView3, aVar5, v, bVar2.f217308w, gVar.f217331k);
                hVar.f231878g = C0966R.color.f3231k4;
                hVar.f231879h = 18;
                hVar.f231877f = C0966R.color.f3229k2;
                if (i2 != 0) {
                    hVar.f231880i = i2 + C74942w4.m89786c(gVar.f217322b.getContext(), C0966R.dimen.f3723cd);
                }
                C78950d dVar2 = new C78950d(hVar);
                gVar.f217330j = dVar2;
                C74064e eVar2 = new C74064e(dVar2);
                dVar2.f231842d = new i7$b$$f(bVar2);
                i7$b$$g i7_b__g = new i7$b$$g(bVar2, gVar);
                dVar2.f231858t = h;
                p.f217229n = i7_b__g;
                dVar2.f231837L = eVar2;
            }
            gVar.f217322b.setOnDoubleClickListener(bVar2);
            gVar.f217322b.setTextListener(new i7$b$$h(bVar2, gVar));
            ChattingItemTranslate.C73918e eVar3 = ChattingItemTranslate.C73918e.NoTransform;
            if (C67651f.m79887a()) {
                str2 = (!f4Var.mo101015s3() || !f4Var.mo101006n3()) ? null : f4Var.mo108727G2();
                f4Var2 = f4Var;
                eVar = ((C79350e1) bVar3.f193278b.mo102812a(C79350e1.class)).mo102314n4(f4Var2);
            } else {
                f4Var2 = f4Var;
                eVar = eVar3;
                str2 = null;
            }
            if (!Util.isNullOrNil(str2) || eVar != eVar3) {
                if (gVar.f217326f == null) {
                    ChattingItemTranslate chattingItemTranslate = (ChattingItemTranslate) gVar.f217325e.inflate();
                    gVar.f217326f = chattingItemTranslate;
                    chattingItemTranslate.mo102992b();
                }
                gVar.f217326f.mo102993c(((C76979h) C86312j.m106911c(cls2)).mo107078or(gVar.f217322b.getContext(), str2, (int) gVar.f217322b.getTextSize(), 1, bundle, bVar2.mo103133o0(f4Var2)), eVar);
                gVar.f217326f.setBrandWording(Util.isNullOrNil(f4Var.mo108726F2()) ? bVar.mo91572m().getString(C0966R.string.k2b) : f4Var.mo108726F2());
                if (!Util.isNullOrNil(str2)) {
                    ChattingItemTranslate.C73916c cVar2 = new ChattingItemTranslate.C73916c(f4Var2, bVar.mo91583x(), gVar, (String) null);
                    cVar2.f216964T = 2;
                    gVar.f217326f.setTag(cVar2);
                    gVar.f217326f.getContentView().setTag(cVar2);
                    ChattingItemTranslate chattingItemTranslate2 = gVar.f217326f;
                    if (bVar2.f217308w == null) {
                        bVar2.f217308w = new C74065f(bVar2.f217307v);
                    }
                    chattingItemTranslate2.setOnClickListener(bVar2.f217308w);
                    gVar.f217326f.setOnTouchListener(((C79368l) bVar3.f193278b.mo102812a(cls)).mo108189Z4());
                    gVar.f217326f.setOnDoubleClickListener(bVar2);
                    gVar.f217326f.setOnLongClickListener(bVar2.mo103098p(bVar3));
                    gVar.f217326f.setVisibility(0);
                }
            } else {
                ChattingItemTranslate chattingItemTranslate3 = gVar.f217326f;
                if (chattingItemTranslate3 != null) {
                    chattingItemTranslate3.setVisibility(8);
                }
            }
            mo103087e0(gVar, f4Var, bVar.mo91573n(), bVar.mo91583x(), bVar, this);
        }

        /* renamed from: k0 */
        public boolean mo26238k0(int i, boolean z) {
            if (z) {
                return i == 1 || i == 11 || i == 21 || i == 31 || i == 36 || i == 301989937 || i == 1107296305;
            }
            return false;
        }

        /* renamed from: o0 */
        public final String mo103133o0(C72963f4 f4Var) {
            if (f4Var == null) {
                return null;
            }
            String a = C86493v0.m107223a("" + f4Var.mo108774y2());
            C86493v0.C86495c c = C86493v0.m107224d().mo120947c(a, true);
            c.mo120962i("prePublishId", "msg_" + f4Var.mo108774y2());
            c.mo120962i("preUsername", mo103068y(this.f217307v, f4Var));
            c.mo120962i("preChatName", mo103102x(this.f217307v, f4Var));
            return a;
        }

        /* renamed from: p0 */
        public final void mo103134p0(C72963f4 f4Var) {
            if (!this.f217307v.mo91577r().equals("medianote")) {
                ((C77885p) C97625j3.m125812b().mo105876B()).mo107993q(new C48629h(f4Var.mo108768t(), f4Var.mo108774y2()));
            }
            Log.m105925i("MicroMsg.ResendMsgLogic", "resendTextMsg, msgId:%d", Long.valueOf(f4Var.getMsgId()));
            C73673d4.m87252f(f4Var);
            this.f217307v.mo91541B(true);
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.i7$c */
    public static class C74062c implements C72963f4.C72966d<C74062c> {

        /* renamed from: b */
        public Boolean f217312b = null;

        /* renamed from: c */
        public boolean f217313c;

        public C74062c(C72963f4 f4Var) {
            this.f217313c = C78747b.m95095G(f4Var);
        }

        /* renamed from: a */
        public boolean mo82132a(Object obj) {
            C74062c cVar = (C74062c) obj;
            if (this.f217313c != cVar.f217313c) {
                return false;
            }
            Boolean bool = this.f217312b;
            Boolean bool2 = cVar.f217312b;
            return (bool == null && bool2 == null) || (bool != null && bool2 != null && bool.booleanValue() == bool2.booleanValue());
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.i7$d */
    public static final class C74063d implements MMNeat7extView.C74955e {
        public C74063d(C73998g7 g7Var) {
        }

        /* renamed from: a */
        public void mo103135a(Exception exc, String str, String str2) {
            if (!C89625d.f257842h) {
                HashMap hashMap = new HashMap(2);
                hashMap.put("Content", str);
                hashMap.put("Exception", exc.toString());
                hashMap.put("Stack", exc.getStackTrace());
                C115669n.INSTANCE.mo160135k("NeatTextView", str2, hashMap);
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.i7$e */
    public static class C74064e implements C78950d.C78962l {

        /* renamed from: a */
        public C78950d f217314a;

        public C74064e(C78950d dVar) {
            this.f217314a = dVar;
        }

        /* renamed from: a */
        public void mo103130a() {
            Log.m105918d("OnTouchOutside", "touchOutside");
            this.f217314a.mo108922f();
            C78950d dVar = this.f217314a;
            dVar.f231829D = true;
            dVar.mo108919c();
            C78950d dVar2 = this.f217314a;
            dVar2.f231828C = true;
            dVar2.mo108920d();
            C78950d.C78963m mVar = this.f217314a.f231845g;
            if (mVar != null) {
                mVar.mo103116a();
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.i7$f */
    public static class C74065f extends C73684f2 {

        /* renamed from: f */
        public CharacterStyle f217315f = new ForegroundColorSpan(MMApplicationContext.getResources().getColor(C0966R.color.BW_0_Alpha_0_3));

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.i7$f$a */
        public class C74066a implements C79341b1.C79342a {

            /* renamed from: a */
            public final /* synthetic */ View f217316a;

            /* renamed from: b */
            public final /* synthetic */ CharSequence f217317b;

            /* renamed from: com.tencent.mm.ui.chatting.viewitems.i7$f$a$a */
            public class C74067a implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ Long f217319d;

                /* renamed from: e */
                public final /* synthetic */ int f217320e;

                public C74067a(Long l, int i) {
                    this.f217319d = l;
                    this.f217320e = i;
                }

                public void run() {
                    Log.m105919d("MicroMsg.EmojiClickListener", "VId:%s, id:%s", Long.valueOf(((Long) C74066a.this.f217316a.getTag(C0966R.C0970id.f357682b73)).longValue()), this.f217319d);
                    if (((Long) C74066a.this.f217316a.getTag(C0966R.C0970id.f357682b73)).longValue() == this.f217319d.longValue() && this.f217320e < C74066a.this.f217317b.length()) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        CharSequence charSequence = C74066a.this.f217317b;
                        SpannableStringBuilder append = spannableStringBuilder.append(charSequence.subSequence(0, charSequence.length()));
                        C74066a aVar = C74066a.this;
                        append.setSpan(C74065f.this.f217315f, this.f217320e, aVar.f217317b.length(), 33);
                        View view = C74066a.this.f217316a;
                        if (view instanceof MMNeat7extView) {
                            ((MMNeat7extView) view).mo104279b(spannableStringBuilder);
                        }
                    }
                }
            }

            public C74066a(View view, CharSequence charSequence) {
                this.f217316a = view;
                this.f217317b = charSequence;
            }

            /* renamed from: a */
            public void mo103136a(int i, Long l) {
                MMHandlerThread.postToMainThread(new C74067a(l, i));
            }
        }

        public C74065f(C67391b bVar) {
            super(bVar);
        }

        /* renamed from: a */
        public void mo57756a(View view, C67391b bVar, C72963f4 f4Var) {
            Class cls = C79341b1.class;
            C74243t8 t8Var = (C74243t8) view.getTag();
            if (f4Var.mo100988a4()) {
                if (this.f216339d != null) {
                    C115669n.INSTANCE.kvStat(10221, "1");
                    Intent intent = new Intent();
                    intent.addFlags(67108864);
                    intent.putExtra("enter_from_scene", 3);
                    C88144b.m109791i(this.f216339d.mo91565f(), "shake", ".ui.ShakeReportUI", intent, (Bundle) null);
                }
            } else if (f4Var.mo100993e4()) {
                if (C76695c.m92341b() && C76695c.m92343d()) {
                    String text = view instanceof TextView ? ((TextView) view).getText() : view instanceof MMNeat7extView ? ((MMNeat7extView) view).mo154968a() : "";
                    long msgId = f4Var.getMsgId();
                    long i3 = ((C79341b1) bVar.f193278b.mo102812a(cls)).mo26169i3();
                    long T4 = ((C79341b1) bVar.f193278b.mo102812a(cls)).mo26163T4();
                    if (i3 == msgId || T4 == msgId) {
                        Log.m105924i("MicroMsg.EmojiClickListener", "speechPlaying stop!!");
                        ((C79341b1) bVar.f193278b.mo102812a(cls)).mo26161K5(bVar);
                    } else {
                        if (!(i3 == 0 && T4 == 0)) {
                            ((C79341b1) bVar.f193278b.mo102812a(cls)).mo26161K5(bVar);
                        }
                        if (f4Var.mo108769t2() == 1) {
                            this.f217315f = new ForegroundColorSpan(MMApplicationContext.getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_3));
                        } else {
                            this.f217315f = new ForegroundColorSpan(MMApplicationContext.getResources().getColor(C0966R.color.BW_0_Alpha_0_3));
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        spannableStringBuilder.append(text.subSequence(0, text.length())).setSpan(this.f217315f, 0, text.length(), 33);
                        if (view instanceof MMNeat7extView) {
                            ((MMNeat7extView) view).mo104279b(spannableStringBuilder);
                        }
                        ((C79341b1) bVar.f193278b.mo102812a(cls)).mo26171w(bVar, f4Var, text);
                        ((C79341b1) bVar.f193278b.mo102812a(cls)).mo26159G2(new C74066a(view, text));
                    }
                }
                if (view instanceof MMTextView) {
                    C78222a a = C78222a.m94508a();
                    CharSequence text2 = ((MMTextView) view).getText();
                    C72963f4 f4Var2 = t8Var.f212238a;
                    a.getClass();
                    C78222a.m94509b(text2, f4Var2, 1);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.i7$g */
    public static final class C74068g extends C74023i.C74026c {

        /* renamed from: b */
        public MMNeat7extView f217322b;

        /* renamed from: c */
        public View f217323c;

        /* renamed from: d */
        public ImageView f217324d;

        /* renamed from: e */
        public ViewStub f217325e;

        /* renamed from: f */
        public ChattingItemTranslate f217326f;

        /* renamed from: g */
        public AnimImageView f217327g;

        /* renamed from: h */
        public ProgressBar f217328h;

        /* renamed from: i */
        public C78253a f217329i;

        /* renamed from: j */
        public C78950d f217330j;

        /* renamed from: k */
        public C107029o f217331k;

        /* renamed from: l */
        public TextView f217332l;

        /* renamed from: m */
        public LinearLayout f217333m;

        /* renamed from: n */
        public TextView f217334n;

        /* renamed from: b */
        public static void m88036b(C72963f4 f4Var, C74068g gVar, C67391b bVar, Boolean bool) {
            Class cls = C79341b1.class;
            if (gVar != null) {
                if (f4Var.getMsgId() == ((C79341b1) bVar.f193278b.mo102812a(cls)).mo26163T4()) {
                    gVar.f217328h.setVisibility(0);
                    if (bool.booleanValue()) {
                        gVar.f217322b.setBackgroundResource(C0966R.C0969drawable.cbg);
                    } else {
                        gVar.f217322b.setBackgroundResource(C0966R.C0969drawable.bya);
                    }
                } else {
                    gVar.f217328h.setVisibility(8);
                    if (bool.booleanValue()) {
                        gVar.f217322b.setBackgroundResource(C0966R.C0969drawable.f4750ls);
                    } else {
                        gVar.f217322b.setBackgroundResource(C0966R.C0969drawable.f4811nk);
                    }
                }
                if (f4Var.getMsgId() == ((C79341b1) bVar.f193278b.mo102812a(cls)).mo26169i3()) {
                    gVar.f217327g.setVisibility(0);
                    gVar.f217327g.mo101601b();
                    return;
                }
                gVar.f217327g.setVisibility(8);
                gVar.f217327g.mo101602c();
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x011a  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0145  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0148  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.C74026c mo103138a(android.view.View r12, boolean r13) {
            /*
                r11 = this;
                super.create(r12)
                r0 = 2131299425(0x7f090c61, float:1.8216851E38)
                android.view.View r0 = r12.findViewById(r0)
                android.widget.TextView r0 = (android.widget.TextView) r0
                r11.timeTV = r0
                r0 = 2131299436(0x7f090c6c, float:1.8216873E38)
                android.view.View r0 = r12.findViewById(r0)
                android.widget.TextView r0 = (android.widget.TextView) r0
                r11.userTV = r0
                r0 = 2131299187(0x7f090b73, float:1.8216368E38)
                android.view.View r0 = r12.findViewById(r0)
                com.tencent.mm.ui.widget.MMNeat7extView r0 = (com.tencent.p014mm.p136ui.widget.MMNeat7extView) r0
                r11.f217322b = r0
                android.content.Context r1 = r0.getContext()
                r2 = 2131166150(0x7f0703c6, float:1.7946537E38)
                int r1 = kg3.C76577a.m92155f(r1, r2)
                float r1 = (float) r1
                float r2 = lg3.C88494d.f255615g
                float r1 = r1 / r2
                int r1 = (int) r1
                r0.setMaxWidth(r1)
                r0 = 2131299181(0x7f090b6d, float:1.8216356E38)
                android.view.View r0 = r12.findViewById(r0)
                android.widget.CheckBox r0 = (android.widget.CheckBox) r0
                r11.checkBox = r0
                r0 = 2131299360(0x7f090c20, float:1.821672E38)
                android.view.View r0 = r12.findViewById(r0)
                r11.maskView = r0
                r0 = 2131299185(0x7f090b71, float:1.8216364E38)
                android.view.View r0 = r12.findViewById(r0)
                r11.f217323c = r0
                r0 = 2131315618(0x7f094ba2, float:1.8249694E38)
                android.view.View r0 = r12.findViewById(r0)
                android.view.ViewStub r0 = (android.view.ViewStub) r0
                r11.f217325e = r0
                if (r13 != 0) goto L_0x0082
                r0 = 2131299423(0x7f090c5f, float:1.8216847E38)
                android.view.View r0 = r12.findViewById(r0)
                android.widget.ImageView r0 = (android.widget.ImageView) r0
                r11.f217324d = r0
                r0 = 2131299421(0x7f090c5d, float:1.8216843E38)
                android.view.View r0 = r12.findViewById(r0)
                android.widget.ImageView r0 = (android.widget.ImageView) r0
                r11.stateIV = r0
                r0 = 2131315985(0x7f094d11, float:1.8250439E38)
                android.view.View r0 = r12.findViewById(r0)
                android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
                r11.uploadingPB = r0
            L_0x0082:
                de3.o r0 = new de3.o
                com.tencent.mm.ui.widget.MMNeat7extView r1 = r11.f217322b
                de3.a0 r2 = new de3.a0
                com.tencent.mm.ui.widget.MMNeat7extView r3 = r11.f217322b
                android.content.Context r3 = r3.getContext()
                r2.<init>(r3)
                r0.<init>(r1, r2)
                r11.f217331k = r0
                com.tencent.mm.ui.widget.MMNeat7extView r0 = r11.f217322b
                r1 = 3
                r2 = 0
                r3 = 1
                java.lang.Class<lc3.b> r4 = lc3.C10485b.class
                k40.a r4 = f40.C86709a0.m107533q(r4)     // Catch:{ Exception -> 0x00dd }
                lc3.b r4 = (lc3.C10485b) r4     // Catch:{ Exception -> 0x00dd }
                pj.f r4 = r4.vh0()     // Catch:{ Exception -> 0x00dd }
                java.lang.String r5 = "CellTextViewEnable"
                java.lang.String r4 = r4.mo107405c(r5)     // Catch:{ Exception -> 0x00dd }
                int r5 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r3)     // Catch:{ Exception -> 0x00dd }
                f40.o r6 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x00dd }
                com.tencent.mm.storage.v1 r6 = r6.mo121142i()     // Catch:{ Exception -> 0x00dd }
                com.tencent.mm.storage.y1$a r7 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_CELLTEXTVIEW_CONFIG_BOOLEAN_SYNC     // Catch:{ Exception -> 0x00dd }
                boolean r6 = r6.mo119686g(r7, r3)     // Catch:{ Exception -> 0x00dd }
                java.lang.String r7 = "NeatTextView"
                java.lang.String r8 = "[isOpenNeatTextView] value:%s isNeatTextViewOpen:%s local:%s"
                java.lang.Object[] r9 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x00dd }
                r9[r2] = r4     // Catch:{ Exception -> 0x00dd }
                java.lang.Integer r4 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x00dd }
                r9[r3] = r4     // Catch:{ Exception -> 0x00dd }
                r4 = 2
                java.lang.Boolean r10 = java.lang.Boolean.valueOf(r6)     // Catch:{ Exception -> 0x00dd }
                r9[r4] = r10     // Catch:{ Exception -> 0x00dd }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r8, r9)     // Catch:{ Exception -> 0x00dd }
                if (r3 != r5) goto L_0x00dd
                if (r6 == 0) goto L_0x00dd
                r4 = 1
                goto L_0x00de
            L_0x00dd:
                r4 = 0
            L_0x00de:
                r0.setIsOpen(r4)
                com.tencent.mm.ui.widget.MMNeat7extView r0 = r11.f217322b
                com.tencent.mm.ui.chatting.viewitems.i7$d r4 = new com.tencent.mm.ui.chatting.viewitems.i7$d
                r5 = 0
                r4.<init>(r5)
                r0.setTextCrashListener(r4)
                r0 = 2131299154(0x7f090b52, float:1.8216301E38)
                android.view.View r0 = r12.findViewById(r0)
                android.widget.TextView r0 = (android.widget.TextView) r0
                r11.f217332l = r0
                r0 = 2131299160(0x7f090b58, float:1.8216314E38)
                android.view.View r0 = r12.findViewById(r0)
                android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
                r11.f217333m = r0
                r0 = 2131299161(0x7f090b59, float:1.8216316E38)
                android.view.View r0 = r12.findViewById(r0)
                android.widget.TextView r0 = (android.widget.TextView) r0
                r11.f217334n = r0
                r0 = 2131299418(0x7f090c5a, float:1.8216837E38)
                android.view.View r0 = r12.findViewById(r0)
                com.tencent.mm.ui.base.AnimImageView r0 = (com.tencent.p014mm.p136ui.base.AnimImageView) r0
                r11.f217327g = r0
                if (r0 == 0) goto L_0x012a
                r0.setType(r1)
                if (r13 == 0) goto L_0x0125
                com.tencent.mm.ui.base.AnimImageView r13 = r11.f217327g
                r13.setFromVoice(r3)
                goto L_0x012a
            L_0x0125:
                com.tencent.mm.ui.base.AnimImageView r13 = r11.f217327g
                r13.setFromVoice(r2)
            L_0x012a:
                r13 = 2131314229(0x7f094635, float:1.8246877E38)
                android.view.View r12 = r12.findViewById(r13)
                android.widget.ProgressBar r12 = (android.widget.ProgressBar) r12
                r11.f217328h = r12
                java.lang.Class<h81.h> r12 = h81.C32735h.class
                di3.d r12 = di3.C86312j.m106911c(r12)
                h81.h r12 = (h81.C32735h) r12
                h81.h$c r13 = h81.C32735h.C32737c.clicfg_group_todo_disable
                int r12 = r12.mo58779Qe(r13, r2)
                if (r12 != r3) goto L_0x0146
                r2 = 1
            L_0x0146:
                if (r2 == 0) goto L_0x014f
                android.widget.LinearLayout r12 = r11.f217333m
                r13 = 8
                r12.setVisibility(r13)
            L_0x014f:
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.viewitems.C74059i7.C74068g.mo103138a(android.view.View, boolean):com.tencent.mm.ui.chatting.viewitems.i$c");
        }

        public View getMainContainerView() {
            return this.f217322b;
        }
    }

    /* renamed from: a */
    public static void m87996a(C67391b bVar, int i, CharSequence charSequence, MMNeat7extView mMNeat7extView, boolean z) {
        C79150a i2;
        int i3;
        int i4;
        C72963f4 f4Var;
        Map<String, String> parseXml;
        int i5 = i;
        CharSequence charSequence2 = charSequence;
        MMNeat7extView mMNeat7extView2 = mMNeat7extView;
        if (i5 != 0 && charSequence2 != null && charSequence.length() == mMNeat7extView.mo154968a().length() && (i2 = mMNeat7extView2.mo154990i((int) (((((float) C76577a.m92155f(mMNeat7extView.getContext(), C0966R.dimen.f4284yo)) / C88494d.f255615g) - ((float) mMNeat7extView.getPaddingLeft())) - ((float) mMNeat7extView.getPaddingRight())), Integer.MAX_VALUE)) != null && (i3 = ((NeatLayout) i2).f319992L) > 0) {
            if (i3 <= 2) {
                i4 = ((C112481c) i2).mo109131o0(0, (float) ((int) (((float) (C76577a.m92155f(mMNeat7extView.getContext(), C0966R.dimen.f4284yo) / 2)) * C88494d.f255615g)));
            } else {
                i4 = ((C112481c) i2).mo109131o0(2, 0.0f);
            }
            if (i4 >= 1 && i4 < charSequence.length()) {
                String str = charSequence2.subSequence(0, i4 - 1) + "..." + mMNeat7extView.getContext().getString(C0966R.string.a0h);
                SpannableString o802 = ((C76979h) C86312j.m106911c(C76979h.class)).o80(mMNeat7extView.getContext(), str, (int) mMNeat7extView.getTextSize(), 1, (Object) null, (String) null, z);
                C73998g7 g7Var = new C73998g7(1, (C53155r0) null, bVar);
                int i6 = i4 + 2;
                o802.setSpan(g7Var, i6, str.length(), 17);
                mMNeat7extView2.mo104280c(o802, TextView.BufferType.SPANNABLE, (Boolean) null);
                ChattingItemTranslate.C73916c cVar = (ChattingItemTranslate.C73916c) mMNeat7extView.getTag();
                if (cVar != null) {
                    o802.removeSpan(g7Var);
                    cVar.f216965U = o802;
                    if (i5 == 2 && C75569c4.m90675h(cVar.f212238a) == 0 && (f4Var = cVar.f212238a) != null && !Util.isNullOrNil(f4Var.f230724G) && (parseXml = XmlParser.parseXml(f4Var.f230724G, "msgsource", (String) null)) != null) {
                        parseXml.put(".msgsource.sec_msg_node.clip-len", String.valueOf(i6));
                        C75569c4.m90665K(f4Var, C75569c4.m90659E(parseXml), true);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public static String m87997b(C72963f4 f4Var) {
        C68070l.C68072b u;
        if (f4Var.getType() == 1107296305) {
            try {
                String content = f4Var.getContent();
                if (!(content == null || (u = C68070l.C68072b.m80422u(content, f4Var.mo108775z2())) == null)) {
                    return ((C77879c) u.mo93555w(C77879c.class)).f226903b;
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.ChattingItemText", e, (String) null, new Object[0]);
            }
        }
        return f4Var.getContent();
    }

    /* renamed from: c */
    public static String m87998c(Context context, String str, C72963f4 f4Var) {
        String str2;
        String str3;
        if (f4Var.f230724G.contains("notify@all")) {
            str2 = "";
        } else {
            str2 = context.getString(C0966R.string.i7x) + "\n";
        }
        Map<String, String> parseXml = XmlParser.parseXml(f4Var.mo108775z2(), "msg", (String) null);
        if (parseXml == null || Util.getInt(parseXml.get(".msg.appmsg.xmlpuretext"), 1) != 0) {
            str3 = "";
        } else {
            str3 = "" + "\n\n<a href='weixin://chatroomnotify/detail/" + f4Var.getMsgId() + "'>" + context.getString(C0966R.string.f360081a00) + "</a>";
        }
        return "" + str2 + str + str3;
    }

    /* renamed from: d */
    public static void m87999d(C72963f4 f4Var, C74068g gVar, C67391b bVar) {
        if (f4Var.mo100964D3() || f4Var.mo100971J3()) {
            C86709a0.m107528h();
            if (((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(f4Var.mo108768t()).f149538g1 == f4Var.getMsgId()) {
                if (C31543z5.m39453c() - f4Var.getCreateTime() < C77712d.f226493e.longValue() && C45628s0.m50755T(bVar.mo91577r())) {
                    m88002g(gVar.f217333m, 0);
                    boolean isNullOrNil = Util.isNullOrNil(f4Var.f230738V);
                    gVar.f217333m.setTag(f4Var);
                    gVar.f217333m.setOnClickListener(new C74021h7(gVar, bVar));
                    m88004h(isNullOrNil, gVar, bVar);
                    return;
                }
            }
        }
        m88002g(gVar.f217333m, 8);
    }

    /* renamed from: e */
    public static void m88000e(C72963f4 f4Var, int i, int i2) {
        int i3;
        if (f4Var != null && (i3 = C75569c4.m90676i(f4Var)) > 0) {
            MessageSecurityInterceptStruct messageSecurityInterceptStruct = new MessageSecurityInterceptStruct();
            int i4 = 1;
            int i5 = (C72996z1.m85820U5(f4Var.mo108768t()) || C72996z1.m85847r5(f4Var.mo108768t())) ? 2 : 1;
            if (f4Var.mo108769t2() != 1) {
                i4 = 0;
            }
            messageSecurityInterceptStruct.f194273f = f4Var.mo108774y2();
            messageSecurityInterceptStruct.f194271d = (long) i5;
            messageSecurityInterceptStruct.f194272e = (long) i4;
            messageSecurityInterceptStruct.f194276i = (long) i3;
            messageSecurityInterceptStruct.f194274g = (long) i;
            messageSecurityInterceptStruct.f194275h = (long) i2;
            messageSecurityInterceptStruct.mo86054n();
        }
    }

    /* renamed from: f */
    public static Bundle m88001f(C72963f4 f4Var, C67391b bVar, String str) {
        Bundle bundle = new Bundle();
        bundle.putLong("msgSvrId", f4Var.mo108774y2());
        return bundle;
    }

    /* renamed from: g */
    public static void m88002g(View view, int i) {
        boolean z = true;
        if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_group_todo_disable, 0) != 1) {
            z = false;
        }
        if (!z) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemText", "setTodoContainerVisibility", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/ui/chatting/viewitems/ChattingItemText", "setTodoContainerVisibility", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(8);
        C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemText", "setTodoContainerVisibility", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/ui/chatting/viewitems/ChattingItemText", "setTodoContainerVisibility", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: h */
    public static void m88003h(Context context) {
        if (!C76866m.m92676e() || Build.VERSION.SDK_INT <= 32) {
            C76701a.makeText(context, (int) C0966R.string.f7938wv, 0).show();
        }
    }

    /* renamed from: h */
    public static void m88004h(boolean z, C74068g gVar, C67391b bVar) {
        if (gVar != null) {
            if (z) {
                gVar.f217333m.setBackgroundResource(C0966R.C0969drawable.f4760m5);
                gVar.f217334n.setTextColor(bVar.mo91565f().getResources().getColor(C0966R.color.BW_100_Alpha_0_8));
                gVar.f217334n.setText(C0966R.string.f360865fg2);
                return;
            }
            gVar.f217333m.setBackgroundResource(C0966R.C0969drawable.f4761m6);
            gVar.f217334n.setTextColor(bVar.mo91565f().getResources().getColor(C0966R.color.f2939n));
            gVar.f217334n.setText(C0966R.string.fg4);
        }
    }
}
