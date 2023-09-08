package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.BrandTmplExposeReportStruct;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C72963f4;
import di3.C86312j;
import gw0.C76073b;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Map;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import nj3.C76875f0;
import p196ln.C76705f;
import p629ny.C76979h;
import qo3.C77407n;
import rb0.C47984k;
import rd0.C22222c;
import zj3.C79357g;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.u5 */
public class C74265u5 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C74307x8 f218132d;

    /* renamed from: e */
    public final /* synthetic */ ChattingItemDyeingTemplate f218133e;

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.u5$a */
    public class C74266a implements C11182m0 {

        /* renamed from: d */
        public final /* synthetic */ C72963f4 f218134d;

        /* renamed from: e */
        public final /* synthetic */ Map f218135e;

        /* renamed from: f */
        public final /* synthetic */ boolean f218136f;

        /* renamed from: g */
        public final /* synthetic */ View f218137g;

        public C74266a(C72963f4 f4Var, Map map, boolean z, View view) {
            this.f218134d = f4Var;
            this.f218135e = map;
            this.f218136f = z;
            this.f218137g = view;
        }

        public void onCreateMMMenu(C76874e0 e0Var) {
            e0Var.clear();
            ChattingItemDyeingTemplate chattingItemDyeingTemplate = C74265u5.this.f218133e;
            C72963f4 f4Var = this.f218134d;
            Map map = this.f218135e;
            C77407n nVar = chattingItemDyeingTemplate.f216863X;
            C22222c.C22225c cVar = chattingItemDyeingTemplate.f216848H;
            if ("notifymessage".equals(f4Var.mo108768t())) {
                String nullAsNil = Util.nullAsNil((String) map.get(".msg.fromusername"));
                boolean h0 = ((C76073b) C86312j.m106911c(C76073b.class)).mo94598h0(nullAsNil);
                boolean n = C47984k.m53340n(nullAsNil);
                if (h0 || n) {
                    boolean Q0 = chattingItemDyeingTemplate.mo102964Q0(chattingItemDyeingTemplate.mo102962O0(map));
                    boolean z = cVar.f62963a;
                    boolean z2 = cVar.f62964b;
                    if (Q0) {
                        if (h0) {
                            chattingItemDyeingTemplate.mo102949B0(nVar, e0Var, nullAsNil, z, z2, true);
                        } else {
                            MenuItem f = (!z || !z2) ? e0Var.mo107142f(1, String.format(chattingItemDyeingTemplate.f216867v.mo91572m().getString(C0966R.string.hde), new Object[]{chattingItemDyeingTemplate.f216854N})) : e0Var.mo107140d(0, chattingItemDyeingTemplate.f216867v.mo91572m().getColor(C0966R.color.a_3), String.format(chattingItemDyeingTemplate.f216867v.mo91572m().getString(C0966R.string.hcm), new Object[]{chattingItemDyeingTemplate.f216854N}));
                            if (f instanceof C76875f0) {
                                ((C76875f0) f).f224711E = new C73951d5(chattingItemDyeingTemplate);
                            }
                            View inflate = C85868k2.m106137b(chattingItemDyeingTemplate.f216867v.mo91565f()).inflate(C0966R.C0971layout.f6984u4, (ViewGroup) null);
                            TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.k_5);
                            C85875k4.m106191k0(textView.getPaint());
                            textView.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(chattingItemDyeingTemplate.f216867v.mo91565f(), ((C79357g) chattingItemDyeingTemplate.f216867v.f193278b.mo102812a(C79357g.class)).getDisplayName(nullAsNil), textView.getTextSize()));
                            ((C76705f) C86312j.m106911c(C76705f.class)).D20((ImageView) inflate.findViewById(C0966R.C0970id.k_4), nullAsNil, 0.1f);
                            nVar.mo107569n(inflate, false);
                        }
                    } else if (h0) {
                        chattingItemDyeingTemplate.mo102949B0(nVar, e0Var, nullAsNil, z, z2, false);
                    }
                    if (cVar.f62965c) {
                        if (!cVar.f62963a) {
                            e0Var.add(0, 3, 0, (CharSequence) chattingItemDyeingTemplate.f216867v.mo91565f().getResources().getString(C0966R.string.hd6));
                        } else if (cVar.f62966d) {
                            e0Var.add(0, 4, 0, (CharSequence) chattingItemDyeingTemplate.f216867v.mo91565f().getResources().getString(C0966R.string.hcv));
                        } else {
                            e0Var.add(0, 3, 0, (CharSequence) chattingItemDyeingTemplate.f216867v.mo91565f().getResources().getString(C0966R.string.hd5));
                        }
                    }
                }
            }
            e0Var.add(0, 2, 0, (CharSequence) this.f218136f ? this.f218137g.getResources().getString(C0966R.string.f361105hd0) : this.f218137g.getResources().getString(C0966R.string.hcy));
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.u5$b */
    public class C74267b implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ C72963f4 f218139d;

        /* renamed from: e */
        public final /* synthetic */ View f218140e;

        /* renamed from: f */
        public final /* synthetic */ Map f218141f;

        /* renamed from: g */
        public final /* synthetic */ String f218142g;

        /* renamed from: h */
        public final /* synthetic */ boolean f218143h;

        public C74267b(C72963f4 f4Var, View view, Map map, String str, boolean z) {
            this.f218139d = f4Var;
            this.f218140e = view;
            this.f218141f = map;
            this.f218142g = str;
            this.f218143h = z;
        }

        /* JADX WARNING: Removed duplicated region for block: B:31:0x015c  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x015f  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onMMMenuItemSelected(android.view.MenuItem r22, int r23) {
            /*
                r21 = this;
                r0 = r21
                int r1 = r22.getItemId()
                r2 = 4
                java.lang.Object[] r3 = new java.lang.Object[r2]
                java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
                r5 = 0
                r3[r5] = r4
                java.lang.Integer r4 = java.lang.Integer.valueOf(r23)
                r6 = 1
                r3[r6] = r4
                com.tencent.mm.storage.f4 r4 = r0.f218139d
                long r7 = r4.getMsgId()
                java.lang.Long r4 = java.lang.Long.valueOf(r7)
                r7 = 2
                r3[r7] = r4
                android.view.View r4 = r0.f218140e
                r8 = 3
                r3[r8] = r4
                java.lang.String r4 = "MicroMsg.ChattingItemDyeingTemplate"
                java.lang.String r9 = "on menu(id : %d, index : %d) item selected. msgId: %s, v: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r9, r3)
                int r3 = r22.getItemId()
                r9 = 9
                java.lang.String r10 = "checkNetwork no network"
                if (r3 == 0) goto L_0x0168
                if (r3 == r6) goto L_0x00f0
                if (r3 == r7) goto L_0x00dd
                if (r3 == r8) goto L_0x0044
                if (r3 == r2) goto L_0x0044
                goto L_0x0245
            L_0x0044:
                com.tencent.mm.ui.chatting.viewitems.u5 r2 = com.tencent.p014mm.p136ui.chatting.viewitems.C74265u5.this
                com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate r2 = r2.f218133e
                java.util.Map r3 = r0.f218141f
                java.lang.String r4 = com.tencent.p014mm.p136ui.chatting.viewitems.ChattingItemDyeingTemplate.f216840y0
                int r3 = r2.mo102962O0(r3)
                boolean r2 = r2.mo102964Q0(r3)
                if (r2 == 0) goto L_0x0245
                com.tencent.mm.ui.chatting.viewitems.u5 r2 = com.tencent.p014mm.p136ui.chatting.viewitems.C74265u5.this
                com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate r3 = r2.f218133e
                rd0.c$c r4 = r3.f216848H
                boolean r10 = r4.f62964b
                if (r10 != 0) goto L_0x0069
                java.lang.String r4 = r0.f218142g
                com.tencent.mm.ui.chatting.viewitems.x8 r2 = r2.f218132d
                com.tencent.p014mm.p136ui.chatting.viewitems.ChattingItemDyeingTemplate.m87583v0(r3, r6, r4, r2)
                goto L_0x0245
            L_0x0069:
                boolean r2 = r4.f62966d
                java.lang.String r10 = r0.f218142g
                java.util.Map r11 = r0.f218141f
                qo3.n r12 = new qo3.n
                ck3.b r13 = r3.f216867v
                android.app.Activity r13 = r13.mo91565f()
                r12.<init>((android.content.Context) r13, (int) r6, (boolean) r6)
                ck3.b r13 = r3.f216867v
                android.app.Activity r13 = r13.mo91565f()
                android.content.res.Resources r13 = r13.getResources()
                boolean r14 = r4.f62963a
                r15 = 17
                if (r14 != 0) goto L_0x009f
                r14 = 2131833766(0x7f1133a6, float:1.9300623E38)
                java.lang.String r13 = r13.getString(r14)
                java.lang.Object[] r14 = new java.lang.Object[r6]
                java.lang.String r8 = r3.f216854N
                r14[r5] = r8
                java.lang.String r8 = java.lang.String.format(r13, r14)
                r12.mo107568m(r8, r15, r5)
                goto L_0x00ca
            L_0x009f:
                if (r2 == 0) goto L_0x00b6
                r8 = 2131833755(0x7f11339b, float:1.9300601E38)
                java.lang.String r8 = r13.getString(r8)
                java.lang.Object[] r13 = new java.lang.Object[r6]
                java.lang.String r14 = r3.f216854N
                r13[r5] = r14
                java.lang.String r8 = java.lang.String.format(r8, r13)
                r12.mo107568m(r8, r15, r5)
                goto L_0x00ca
            L_0x00b6:
                r8 = 2131833767(0x7f1133a7, float:1.9300625E38)
                java.lang.String r8 = r13.getString(r8)
                java.lang.Object[] r13 = new java.lang.Object[r6]
                java.lang.String r14 = r3.f216854N
                r13[r5] = r14
                java.lang.String r8 = java.lang.String.format(r8, r13)
                r12.mo107568m(r8, r15, r5)
            L_0x00ca:
                com.tencent.mm.ui.chatting.viewitems.q4 r8 = new com.tencent.mm.ui.chatting.viewitems.q4
                r8.<init>(r3, r4, r2)
                r12.f225771i = r8
                com.tencent.mm.ui.chatting.viewitems.r4 r2 = new com.tencent.mm.ui.chatting.viewitems.r4
                r2.<init>(r3, r11, r4, r10)
                r12.f225782p = r2
                r12.mo107573q()
                goto L_0x0245
            L_0x00dd:
                com.tencent.mm.ui.chatting.viewitems.u5 r2 = com.tencent.p014mm.p136ui.chatting.viewitems.C74265u5.this
                com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate r10 = r2.f218133e
                com.tencent.mm.ui.chatting.viewitems.x8 r11 = r2.f218132d
                android.view.View r12 = r0.f218140e
                com.tencent.mm.storage.f4 r13 = r0.f218139d
                java.util.Map r14 = r0.f218141f
                java.lang.String r15 = r0.f218142g
                com.tencent.p014mm.p136ui.chatting.viewitems.ChattingItemDyeingTemplate.m87580s0(r10, r11, r12, r13, r14, r15)
                goto L_0x0245
            L_0x00f0:
                com.tencent.mm.ui.chatting.viewitems.u5 r2 = com.tencent.p014mm.p136ui.chatting.viewitems.C74265u5.this
                com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate r2 = r2.f218133e
                boolean r2 = com.tencent.p014mm.p136ui.chatting.viewitems.ChattingItemDyeingTemplate.m87581t0(r2)
                if (r2 != 0) goto L_0x00ff
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r10)
                goto L_0x0245
            L_0x00ff:
                com.tencent.mm.ui.chatting.viewitems.u5 r2 = com.tencent.p014mm.p136ui.chatting.viewitems.C74265u5.this
                com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate r2 = r2.f218133e
                java.util.Map r3 = r0.f218141f
                int r3 = r2.mo102962O0(r3)
                boolean r2 = r2.mo102964Q0(r3)
                com.tencent.mm.ui.chatting.viewitems.u5 r3 = com.tencent.p014mm.p136ui.chatting.viewitems.C74265u5.this
                com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate r10 = r3.f218133e
                rd0.c$c r4 = r10.f216848H
                boolean r4 = r4.f62964b
                if (r2 == 0) goto L_0x0134
                if (r4 != 0) goto L_0x0123
                boolean r2 = r0.f218143h
                java.lang.String r4 = r0.f218142g
                com.tencent.mm.ui.chatting.viewitems.x8 r3 = r3.f218132d
                com.tencent.p014mm.p136ui.chatting.viewitems.ChattingItemDyeingTemplate.m87583v0(r10, r2, r4, r3)
                goto L_0x013b
            L_0x0123:
                java.util.Map r11 = r0.f218141f
                r12 = 0
                r13 = 1
                com.tencent.mm.ui.chatting.viewitems.x8 r14 = r3.f218132d
                java.lang.String r15 = r0.f218142g
                boolean r2 = r0.f218143h
                r16 = r2
                com.tencent.p014mm.p136ui.chatting.viewitems.ChattingItemDyeingTemplate.m87582u0(r10, r11, r12, r13, r14, r15, r16)
                r13 = 1
                goto L_0x013c
            L_0x0134:
                java.lang.String r2 = r0.f218142g
                com.tencent.mm.ui.chatting.viewitems.x8 r3 = r3.f218132d
                com.tencent.p014mm.p136ui.chatting.viewitems.ChattingItemDyeingTemplate.m87583v0(r10, r6, r2, r3)
            L_0x013b:
                r13 = 2
            L_0x013c:
                com.tencent.mm.ui.chatting.viewitems.u5 r2 = com.tencent.p014mm.p136ui.chatting.viewitems.C74265u5.this
                com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate r2 = r2.f218133e
                com.tencent.mm.storage.f4 r3 = r0.f218139d
                java.lang.String r3 = r3.mo108768t()
                java.lang.String r4 = r0.f218142g
                r2.mo102969W0(r9, r3, r4)
                wd0.a r11 = wd0.C22894a.f65798a
                java.lang.String r12 = r0.f218142g
                com.tencent.mm.ui.chatting.viewitems.u5 r2 = com.tencent.p014mm.p136ui.chatting.viewitems.C74265u5.this
                com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate r2 = r2.f218133e
                java.lang.String r14 = r2.f216849I
                r15 = 0
                java.lang.String r2 = r2.f216854N
                boolean r3 = r0.f218143h
                if (r3 == 0) goto L_0x015f
                r17 = 1
                goto L_0x0161
            L_0x015f:
                r17 = 2
            L_0x0161:
                r16 = r2
                r11.mo36070b(r12, r13, r14, r15, r16, r17)
                goto L_0x0245
            L_0x0168:
                com.tencent.mm.ui.chatting.viewitems.u5 r2 = com.tencent.p014mm.p136ui.chatting.viewitems.C74265u5.this
                com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate r2 = r2.f218133e
                boolean r2 = com.tencent.p014mm.p136ui.chatting.viewitems.ChattingItemDyeingTemplate.m87581t0(r2)
                if (r2 != 0) goto L_0x0177
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r10)
                goto L_0x0245
            L_0x0177:
                com.tencent.mm.ui.chatting.viewitems.u5 r2 = com.tencent.p014mm.p136ui.chatting.viewitems.C74265u5.this
                com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate r2 = r2.f218133e
                java.util.Map r3 = r0.f218141f
                int r3 = r2.mo102962O0(r3)
                boolean r2 = r2.mo102964Q0(r3)
                com.tencent.mm.ui.chatting.viewitems.u5 r3 = com.tencent.p014mm.p136ui.chatting.viewitems.C74265u5.this
                com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate r3 = r3.f218133e
                rd0.c$c r4 = r3.f216848H
                boolean r13 = r4.f62964b
                r4 = 8
                com.tencent.mm.storage.f4 r8 = r0.f218139d
                java.lang.String r8 = r8.mo108768t()
                java.lang.String r10 = r0.f218142g
                r3.mo102969W0(r4, r8, r10)
                wd0.a r14 = wd0.C22894a.f65798a
                java.lang.String r15 = r0.f218142g
                r16 = 1
                com.tencent.mm.ui.chatting.viewitems.u5 r3 = com.tencent.p014mm.p136ui.chatting.viewitems.C74265u5.this
                com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate r3 = r3.f218133e
                java.lang.String r4 = r3.f216849I
                r18 = 1
                java.lang.String r3 = r3.f216854N
                boolean r8 = r0.f218143h
                if (r8 == 0) goto L_0x01b1
                r20 = 1
                goto L_0x01b3
            L_0x01b1:
                r20 = 2
            L_0x01b3:
                r17 = r4
                r19 = r3
                r14.mo36070b(r15, r16, r17, r18, r19, r20)
                if (r2 == 0) goto L_0x01d0
                com.tencent.mm.ui.chatting.viewitems.u5 r2 = com.tencent.p014mm.p136ui.chatting.viewitems.C74265u5.this
                com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate r10 = r2.f218133e
                java.util.Map r11 = r0.f218141f
                r12 = 1
                com.tencent.mm.ui.chatting.viewitems.x8 r14 = r2.f218132d
                java.lang.String r15 = r0.f218142g
                boolean r2 = r0.f218143h
                r16 = r2
                com.tencent.p014mm.p136ui.chatting.viewitems.ChattingItemDyeingTemplate.m87582u0(r10, r11, r12, r13, r14, r15, r16)
                goto L_0x0245
            L_0x01d0:
                com.tencent.mm.ui.chatting.viewitems.u5 r2 = com.tencent.p014mm.p136ui.chatting.viewitems.C74265u5.this
                com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate r3 = r2.f218133e
                com.tencent.mm.ui.chatting.viewitems.x8 r13 = r2.f218132d
                java.lang.String r15 = r0.f218142g
                com.tencent.mm.storage.f4 r12 = r0.f218139d
                r3.mo102970X0(r13, r5)
                com.tencent.mm.autogen.events.UpdateWxaOptionsEvent r2 = new com.tencent.mm.autogen.events.UpdateWxaOptionsEvent
                r2.<init>()
                com.tencent.mm.autogen.events.UpdateWxaOptionsEvent$a r4 = r2.f193994d
                r4.f193996a = r15
                r4.f193997b = r6
                r4.f193998c = r6
                r2.publish()
                java.util.LinkedList r2 = new java.util.LinkedList
                r2.<init>()
                te3.ce4 r4 = new te3.ce4
                r4.<init>()
                r4.f131684f = r15
                r4.f131683e = r5
                r4.f131682d = r6
                r2.add(r4)
                java.lang.String r4 = r3.f216850J
                java.lang.String r8 = r3.f216849I
                r3.mo102950C0(r7, r4, r8)
                ck3.b r4 = r3.f216867v
                android.content.res.Resources r4 = r4.mo91572m()
                r8 = 2131833788(0x7f1133bc, float:1.9300668E38)
                java.lang.String r4 = r4.getString(r8)
                ck3.b r8 = r3.f216867v
                android.app.Activity r8 = r8.mo91565f()
                nj3.C76912y0.m92773l(r8, r4)
                ob0.b0 r4 = eb0.C97625j3.m125815e()
                r8 = 1176(0x498, float:1.648E-42)
                com.tencent.mm.ui.chatting.viewitems.n5 r14 = new com.tencent.mm.ui.chatting.viewitems.n5
                r16 = 1
                r10 = r14
                r11 = r3
                r5 = r14
                r14 = r16
                r10.<init>(r11, r12, r13, r14, r15)
                r4.mo123455a(r8, r5)
                kb0.l r4 = new kb0.l
                r4.<init>(r2)
                ob0.b0 r2 = eb0.C97625j3.m125815e()
                r2.mo123460f(r4)
                ck3.b r2 = r3.f216867v
                if (r2 == 0) goto L_0x0245
                r2.mo91540A()
            L_0x0245:
                com.tencent.mm.ui.chatting.viewitems.u5 r2 = com.tencent.p014mm.p136ui.chatting.viewitems.C74265u5.this
                com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate r2 = r2.f218133e
                boolean r3 = r2.f216864Y
                if (r3 == 0) goto L_0x025f
                if (r1 != r7) goto L_0x0250
                goto L_0x0259
            L_0x0250:
                if (r1 != r6) goto L_0x0254
                r6 = 2
                goto L_0x0259
            L_0x0254:
                if (r1 != 0) goto L_0x0258
                r6 = 3
                goto L_0x0259
            L_0x0258:
                r6 = 0
            L_0x0259:
                java.lang.String r1 = r0.f218142g
                r3 = 0
                com.tencent.p014mm.p136ui.chatting.viewitems.ChattingItemDyeingTemplate.m87576o0(r2, r9, r1, r3, r6)
            L_0x025f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.viewitems.C74265u5.C74267b.onMMMenuItemSelected(android.view.MenuItem, int):void");
        }
    }

    public C74265u5(ChattingItemDyeingTemplate chattingItemDyeingTemplate, C74307x8 x8Var) {
        this.f218133e = chattingItemDyeingTemplate;
        this.f218132d = x8Var;
    }

    public void onClick(View view) {
        View view2 = view;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view2);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C72963f4 f4Var = (C72963f4) view2.getTag(C0966R.C0970id.hcu);
        if (f4Var == null) {
            Log.m105928w("MicroMsg.ChattingItemDyeingTemplate", "on more view click, but msg is null.");
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        Map<String, String> parseXml = XmlParser.parseXml(f4Var.getContent(), "msg", (String) null);
        if (parseXml == null || parseXml.size() == 0) {
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        String nullAsNil = Util.nullAsNil(parseXml.get(".msg.fromusername"));
        boolean h0 = ((C76073b) C86312j.m106911c(C76073b.class)).mo94598h0(nullAsNil);
        BrandTmplExposeReportStruct brandTmplExposeReportStruct = new BrandTmplExposeReportStruct();
        brandTmplExposeReportStruct.f194144d = 1;
        brandTmplExposeReportStruct.f194145e = System.currentTimeMillis();
        brandTmplExposeReportStruct.mo93193u(nullAsNil);
        brandTmplExposeReportStruct.f194147g = brandTmplExposeReportStruct.mo86045b("templateId", this.f218133e.f216849I, true);
        brandTmplExposeReportStruct.f194148h = brandTmplExposeReportStruct.mo86045b("templateTitle", this.f218133e.f216854N, true);
        brandTmplExposeReportStruct.f194149i = brandTmplExposeReportStruct.mo86045b("templateContent", this.f218133e.f216862W.f65823f, true);
        brandTmplExposeReportStruct.mo86054n();
        this.f218133e.f216863X = new C77407n(view.getContext(), 1, false);
        C72963f4 f4Var2 = f4Var;
        C74266a aVar = r0;
        C77407n nVar = this.f218133e.f216863X;
        C74266a aVar2 = new C74266a(f4Var2, parseXml, h0, view);
        nVar.f225771i = aVar;
        C74267b bVar = r0;
        C74267b bVar2 = new C74267b(f4Var2, view, parseXml, nullAsNil, h0);
        nVar.f225782p = bVar;
        nVar.mo107573q();
        this.f218133e.mo102969W0(4, f4Var.mo108768t(), nullAsNil);
        ChattingItemDyeingTemplate.m87574A0(this.f218133e, 5, f4Var);
        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
