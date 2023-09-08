package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.message.C80995a;
import com.tencent.p014mm.modelimage.C92839m;
import com.tencent.p014mm.p136ui.chatting.C73684f2;
import com.tencent.p014mm.p136ui.chatting.C73774p2;
import com.tencent.p014mm.p136ui.chatting.C74343y0;
import com.tencent.p014mm.p136ui.chatting.manager.C6789c;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74244u;
import com.tencent.p014mm.plugin.appbrand.xweb_ext.video.AppBrandWeishiVideoOperation;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.pluginsdk.model.app.C72695v;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import di3.C86312j;
import eb0.C45628s0;
import eb0.C75604z3;
import i21.C98591h;
import ke3.C88144b;
import kr0.C76630x0;
import kr0.C88262c1;
import ln0.C88593a;
import ln0.C88600e;
import nj3.C76874e0;
import p158gt.C98201k;
import p763ym.C79138l;
import p763ym.C79139p;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.n3 */
public class C74134n3 {

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.n3$a */
    public static class C74135a extends C74023i {

        /* renamed from: v */
        public C67391b f217628v;

        /* renamed from: w */
        public C74137d f217629w;

        /* renamed from: E */
        public View mo26231E(LayoutInflater layoutInflater, View view) {
            if (view != null && view.getTag() != null) {
                return view;
            }
            C6807n4 n4Var = new C6807n4(layoutInflater, C0966R.C0971layout.f6919s8);
            C74138e eVar = new C74138e();
            eVar.mo103195a(n4Var);
            n4Var.setTag(eVar);
            return n4Var;
        }

        /* renamed from: R */
        public boolean mo26232R() {
            return false;
        }

        /* renamed from: S */
        public boolean mo82213S() {
            return false;
        }

        /* renamed from: X */
        public boolean mo26233X(MenuItem menuItem, C67391b bVar, C72963f4 f4Var) {
            if (menuItem.getItemId() != 111) {
                return false;
            }
            C6789c.m7088a(f4Var, bVar.mo91565f(), new n3$a$$a(this, bVar, f4Var));
            return false;
        }

        /* renamed from: Z */
        public boolean mo26235Z(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo, C72963f4 f4Var) {
            C74134n3.m88264a(this.f217628v, e0Var, view, f4Var);
            return true;
        }

        /* renamed from: a0 */
        public boolean mo26236a0(View view, C67391b bVar, C72963f4 f4Var) {
            return true;
        }

        /* renamed from: f */
        public void mo26237f(C74023i.C74026c cVar, C67391b bVar, C72963f4 f4Var, String str) {
            this.f217628v = bVar;
            C74138e eVar = (C74138e) cVar;
            if (this.f217629w == null) {
                this.f217629w = new C74137d(this.f217628v, this);
            }
            eVar.mo103196b(this, eVar, cVar, bVar, f4Var, false, this.f217629w, mo103098p(bVar));
            ((C88262c1) C86312j.m106911c(C88262c1.class)).mo113587fX();
        }

        /* renamed from: k0 */
        public boolean mo26238k0(int i, boolean z) {
            return !z && i == 687865905;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.n3$b */
    public static class C74136b extends C74023i implements C73774p2 {

        /* renamed from: v */
        public C67391b f217630v;

        /* renamed from: w */
        public C74137d f217631w;

        /* renamed from: E */
        public View mo26231E(LayoutInflater layoutInflater, View view) {
            if (view != null && view.getTag() != null) {
                return view;
            }
            C6807n4 n4Var = new C6807n4(layoutInflater, C0966R.C0971layout.f6968tn);
            C74138e eVar = new C74138e();
            eVar.mo103195a(n4Var);
            n4Var.setTag(eVar);
            return n4Var;
        }

        /* renamed from: R */
        public boolean mo26232R() {
            return true;
        }

        /* renamed from: S */
        public boolean mo82213S() {
            return false;
        }

        /* renamed from: X */
        public boolean mo26233X(MenuItem menuItem, C67391b bVar, C72963f4 f4Var) {
            if (menuItem.getItemId() == 111) {
                C68070l.C68072b u = C68070l.C68072b.m80422u(C75604z3.m90840l(bVar.mo91583x(), f4Var.getContent(), f4Var.mo108769t2()), (String) null);
                if (u != null) {
                    C115669n.INSTANCE.mo160131h(16979, u.f195577g2, u.f195569e2, 0, 2);
                }
                C74244u.C74247d.m88515e(bVar, f4Var, mo103068y(bVar, f4Var), -1, (C88144b.C76564c) null);
            }
            return false;
        }

        /* renamed from: Z */
        public boolean mo26235Z(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo, C72963f4 f4Var) {
            C74134n3.m88264a(this.f217630v, e0Var, view, f4Var);
            return true;
        }

        /* renamed from: a */
        public void mo70162a(View view, C67391b bVar, C72963f4 f4Var) {
            if (f4Var.mo101020w3()) {
                C72695v.m85081w(f4Var);
                C75604z3.m90834f(f4Var.getMsgId());
                bVar.mo91541B(true);
            }
        }

        /* renamed from: a0 */
        public boolean mo26236a0(View view, C67391b bVar, C72963f4 f4Var) {
            return true;
        }

        /* renamed from: f */
        public void mo26237f(C74023i.C74026c cVar, C67391b bVar, C72963f4 f4Var, String str) {
            this.f217630v = bVar;
            C74138e eVar = (C74138e) cVar;
            if (this.f217631w == null) {
                this.f217631w = new C74137d(this.f217630v, this);
            }
            eVar.mo103196b(this, eVar, cVar, bVar, f4Var, true, this.f217631w, mo103098p(bVar));
            mo103087e0(eVar, f4Var, bVar.mo91573n(), bVar.mo91583x(), bVar, this);
            ((C88262c1) C86312j.m106911c(C88262c1.class)).mo113587fX();
        }

        /* renamed from: k0 */
        public boolean mo26238k0(int i, boolean z) {
            return z && i == 687865905;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.n3$d */
    public static class C74137d extends C73684f2 {

        /* renamed from: f */
        public C74023i f217632f;

        public C74137d(C67391b bVar, C74023i iVar) {
            super(bVar);
            this.f217632f = iVar;
        }

        /* renamed from: a */
        public void mo57756a(View view, C67391b bVar, C72963f4 f4Var) {
            String str;
            ((C98591h) C86312j.m106911c(C98591h.class)).Gr0(f4Var.mo108768t());
            String str2 = null;
            C68070l.C68072b u = C68070l.C68072b.m80422u(C75604z3.m90840l(bVar.mo91583x(), f4Var.getContent(), f4Var.mo108769t2()), (String) null);
            if (u == null) {
                Log.m105928w("MicroMsg.WeishiVideoClickListener", "weishi chatItemClick, content is null");
            } else if (!Util.isNullOrNil(u.f195577g2) || !Util.isNullOrNil(u.f195573f2)) {
                String r = bVar.mo91577r();
                String y = this.f217632f.mo103068y(bVar, f4Var);
                Bundle bundle = new Bundle();
                if (bVar.mo91583x()) {
                    bundle.putInt("stat_scene", 2);
                } else {
                    bundle.putInt("stat_scene", C45628s0.m50738C(r) ? 7 : 1);
                }
                bundle.putString("stat_msg_id", "msg_" + Long.toString(f4Var.mo108774y2()));
                bundle.putString("stat_chat_talker_username", r);
                bundle.putString("stat_send_msg_user", y);
                C44561j UV = ((C79138l) C86312j.m106911c(C79138l.class)).mo74003UV(u.f195562d, u.f195480E);
                bundle.putString("stat_weishi_app_name", (UV == null || (str = UV.field_appName) == null || str.trim().length() <= 0) ? u.f195484F : UV.field_appName);
                bundle.putString("stat_weishi_app_id", u.f195562d);
                bundle.putString("stat_weishi_source_username", u.f195634v);
                C80995a aVar = (C80995a) u.mo93555w(C80995a.class);
                bundle.putBoolean("stat_weishi_from_opensdk", aVar != null && aVar.f237885B == 1);
                bundle.putString("stat_weishi_msg_img_path", f4Var.mo108765s2());
                bundle.putString("stat_weishi_thumb_path", ((C92839m) ((C98201k) C86312j.m106911c(C98201k.class)).mo137277xi()).h30(f4Var.mo108765s2()));
                if (aVar != null) {
                    str2 = aVar.f237884A;
                }
                bundle.putString("stat_weishi_thumb_url", str2);
                C115669n nVar = C115669n.INSTANCE;
                nVar.mo160131h(16979, u.f195577g2, u.f195569e2, 0, 1);
                nVar.idkeyStat(1129, 0, 1, false);
                ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106886EF(bVar.mo91565f(), r, y, bVar.mo91583x(), u, bundle);
            } else {
                Intent intent = new Intent();
                intent.putExtra("rawUrl", ((C79139p) C86312j.m106911c(C79139p.class)).mo108862K3(u.f195586j, bVar.mo91583x() ? "groupmessage" : "singlemessage"));
                intent.putExtra("webpageTitle", u.f195570f);
                intent.putExtra("shortUrl", u.f195586j);
                C88144b.m109791i(bVar.mo91565f(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.n3$e */
    public static class C74138e extends C74023i.C74026c {

        /* renamed from: b */
        public ImageView f217633b;

        /* renamed from: c */
        public ImageView f217634c;

        /* renamed from: d */
        public ImageView f217635d;

        /* renamed from: e */
        public TextView f217636e;

        /* renamed from: f */
        public ProgressBar f217637f;

        /* renamed from: a */
        public C74023i.C74026c mo103195a(View view) {
            super.create(view);
            this.f217633b = (ImageView) view.findViewById(C0966R.C0970id.b4c);
            this.f217634c = (ImageView) view.findViewById(C0966R.C0970id.b4e);
            this.clickArea = view.findViewById(C0966R.C0970id.b47);
            this.f217635d = (ImageView) view.findViewById(C0966R.C0970id.b8w);
            this.userTV = (TextView) view.findViewById(C0966R.C0970id.b9_);
            this.f217636e = (TextView) view.findViewById(C0966R.C0970id.b3g);
            this.f217637f = (ProgressBar) view.findViewById(C0966R.C0970id.b97);
            this.stateIV = (ImageView) view.findViewById(C0966R.C0970id.b8v);
            this.checkBox = (CheckBox) view.findViewById(C0966R.C0970id.b46);
            this.maskView = view.findViewById(C0966R.C0970id.b7h);
            return this;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x003b, code lost:
            r10 = r9.field_appName;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo103196b(com.tencent.p014mm.p136ui.chatting.viewitems.C74023i r17, com.tencent.p014mm.p136ui.chatting.viewitems.C74134n3.C74138e r18, uj3.C78208e r19, ck3.C67391b r20, com.tencent.p014mm.storage.C72963f4 r21, boolean r22, com.tencent.p014mm.p136ui.chatting.viewitems.C74134n3.C74137d r23, com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.C74027e r24) {
            /*
                r16 = this;
                r0 = r17
                r1 = r18
                r2 = r20
                java.lang.Class<kr0.o0> r3 = kr0.C34006o0.class
                java.lang.Class<gt.k> r4 = p158gt.C98201k.class
                java.lang.Class<ym.l> r5 = p763ym.C79138l.class
                boolean r6 = r20.mo91583x()
                java.lang.String r7 = r21.getContent()
                int r8 = r21.mo108769t2()
                java.lang.String r6 = eb0.C75604z3.m90840l(r6, r7, r8)
                r7 = 0
                com.tencent.mm.message.l$b r6 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r6, r7)
                java.lang.String r8 = "MicroMsg.WeishiVideoItemViewHolder"
                if (r6 != 0) goto L_0x002b
                java.lang.String r0 = "parseMsgInfo, content is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r0)
                return
            L_0x002b:
                di3.d r9 = di3.C86312j.m106911c(r5)
                ym.l r9 = (p763ym.C79138l) r9
                java.lang.String r10 = r6.f195562d
                int r11 = r6.f195480E
                com.tencent.mm.pluginsdk.model.app.j r9 = r9.mo74003UV(r10, r11)
                if (r9 == 0) goto L_0x004d
                java.lang.String r10 = r9.field_appName
                if (r10 == 0) goto L_0x004d
                java.lang.String r10 = r10.trim()
                int r10 = r10.length()
                if (r10 > 0) goto L_0x004a
                goto L_0x004d
            L_0x004a:
                java.lang.String r10 = r9.field_appName
                goto L_0x004f
            L_0x004d:
                java.lang.String r10 = r6.f195484F
            L_0x004f:
                java.lang.String r11 = r6.f195562d
                r12 = 8
                r13 = 0
                if (r11 == 0) goto L_0x0082
                int r11 = r11.length()
                if (r11 <= 0) goto L_0x0082
                boolean r11 = r0.mo103084W(r10)
                if (r11 == 0) goto L_0x0082
                android.widget.TextView r11 = r1.f217636e
                di3.d r5 = di3.C86312j.m106911c(r5)
                ym.l r5 = (p763ym.C79138l) r5
                android.app.Activity r14 = r20.mo91565f()
                java.lang.String r5 = r5.mo74019xG(r14, r9, r10)
                r11.setText(r5)
                android.widget.TextView r5 = r1.f217636e
                r5.setVisibility(r13)
                android.widget.TextView r5 = r1.f217636e
                java.lang.String r9 = r6.f195562d
                r0.mo103079M(r2, r5, r9)
                goto L_0x0087
            L_0x0082:
                android.widget.TextView r0 = r1.f217636e
                r0.setVisibility(r12)
            L_0x0087:
                android.widget.ImageView r0 = r1.f217635d
                android.app.Activity r5 = r20.mo91565f()
                r9 = 2131756957(0x7f10079d, float:1.9144836E38)
                android.graphics.drawable.Drawable r5 = kg3.C76577a.m92158i(r5, r9)
                r0.setImageDrawable(r5)
                android.widget.ProgressBar r0 = r1.f217637f
                if (r0 == 0) goto L_0x009e
                r0.setVisibility(r12)
            L_0x009e:
                di3.d r0 = di3.C86312j.m106911c(r4)
                gt.k r0 = (p158gt.C98201k) r0
                gt.m r0 = r0.mo137277xi()
                java.lang.String r5 = r21.mo108765s2()
                com.tencent.mm.modelimage.m r0 = (com.tencent.p014mm.modelimage.C92839m) r0
                java.lang.String r0 = r0.h30(r5)
                r5 = 2
                java.lang.Object[] r9 = new java.lang.Object[r5]
                java.lang.String r10 = r21.mo108765s2()
                r9[r13] = r10
                r10 = 1
                r9[r10] = r0
                java.lang.String r11 = "parseMsgInfo, msgImgPath:%s, thumbFullPath:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r11, r9)
                r9 = 2131231570(0x7f080352, float:1.8079225E38)
                di3.d r4 = di3.C86312j.m106911c(r4)
                gt.k r4 = (p158gt.C98201k) r4
                gt.m r4 = r4.mo137277xi()
                android.app.Activity r11 = r20.mo91565f()
                float r11 = kg3.C76577a.m92156g(r11)
                android.app.Activity r14 = r20.mo91565f()
                com.tencent.mm.modelimage.m r4 = (com.tencent.p014mm.modelimage.C92839m) r4
                android.graphics.Bitmap r4 = r4.fq0(r0, r11, r14, r9)
                if (r4 == 0) goto L_0x0114
                boolean r11 = r4.isRecycled()
                if (r11 != 0) goto L_0x0114
                android.widget.ImageView r9 = r1.f217633b
                r9.setImageBitmap(r4)
                android.widget.FrameLayout$LayoutParams r9 = new android.widget.FrameLayout$LayoutParams
                int r11 = r4.getWidth()
                int r14 = r4.getHeight()
                r9.<init>(r11, r14)
                android.widget.ImageView r11 = r1.f217633b
                r11.setLayoutParams(r9)
                android.widget.FrameLayout$LayoutParams r9 = new android.widget.FrameLayout$LayoutParams
                int r11 = r4.getWidth()
                int r4 = r4.getHeight()
                r9.<init>(r11, r4)
                android.widget.ImageView r4 = r1.f217634c
                r4.setLayoutParams(r9)
                goto L_0x0168
            L_0x0114:
                java.lang.String r4 = "parseMsgInfo, has no video thumb"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r4)
                android.widget.ImageView r4 = r1.f217634c
                android.widget.FrameLayout$LayoutParams r11 = new android.widget.FrameLayout$LayoutParams
                r11.<init>(r13, r13)
                r4.setLayoutParams(r11)
                android.app.Activity r4 = r20.mo91565f()
                r11 = 85
                int r4 = kg3.C76577a.m92151b(r4, r11)
                android.app.Activity r11 = r20.mo91565f()
                r14 = 2131165216(0x7f070020, float:1.7944643E38)
                int r11 = kg3.C76577a.m92157h(r11, r14)
                android.app.Activity r14 = r20.mo91565f()
                android.content.res.Resources r14 = r14.getResources()
                r15 = 2131100893(0x7f0604dd, float:1.781418E38)
                int r14 = r14.getColor(r15)
                android.graphics.Bitmap r14 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.createColorBitmap(r14, r4, r11)
                android.graphics.Bitmap r9 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.createMaskImage(r14, r9, r4, r11)
                android.widget.ImageView r14 = r1.f217633b
                r14.setImageBitmap(r9)
                android.widget.FrameLayout$LayoutParams r9 = new android.widget.FrameLayout$LayoutParams
                r9.<init>(r4, r11)
                android.widget.ImageView r14 = r1.f217633b
                r14.setLayoutParams(r9)
                android.widget.FrameLayout$LayoutParams r9 = new android.widget.FrameLayout$LayoutParams
                r9.<init>(r4, r11)
                android.widget.ImageView r4 = r1.f217634c
                r4.setLayoutParams(r9)
            L_0x0168:
                if (r22 == 0) goto L_0x0187
                int r4 = r21.getStatus()
                r9 = 5
                if (r4 == r9) goto L_0x0180
                int r4 = r21.getStatus()
                if (r4 != r5) goto L_0x0178
                goto L_0x0180
            L_0x0178:
                android.widget.ProgressBar r4 = r1.f217637f
                if (r4 == 0) goto L_0x0187
                r4.setVisibility(r13)
                goto L_0x0187
            L_0x0180:
                android.widget.ProgressBar r4 = r1.f217637f
                if (r4 == 0) goto L_0x0187
                r4.setVisibility(r12)
            L_0x0187:
                android.view.View r4 = r1.clickArea
                com.tencent.mm.ui.chatting.viewitems.t8 r9 = new com.tencent.mm.ui.chatting.viewitems.t8
                boolean r11 = r20.mo91583x()
                java.lang.String r12 = r21.mo108768t()
                r14 = r21
                r9.<init>(r14, r11, r1, r12)
                r4.setTag(r9)
                android.view.View r4 = r1.clickArea
                r9 = r23
                r4.setOnClickListener(r9)
                android.view.View r4 = r1.clickArea
                r9 = r24
                r4.setOnLongClickListener(r9)
                android.view.View r1 = r1.clickArea
                java.lang.Class<zj3.l> r4 = zj3.C79368l.class
                com.tencent.mm.ui.chatting.manager.a r2 = r2.f193278b
                xi.d r2 = r2.mo102812a(r4)
                zj3.l r2 = (zj3.C79368l) r2
                com.tencent.mm.ui.chatting.h2 r2 = r2.mo108189Z4()
                r1.setOnTouchListener(r2)
                com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r2 = 16979(0x4253, float:2.3793E-41)
                r4 = 4
                java.lang.Object[] r4 = new java.lang.Object[r4]
                java.lang.String r9 = r6.f195577g2
                r4[r13] = r9
                java.lang.String r9 = r6.f195569e2
                r4[r10] = r9
                java.lang.Integer r9 = java.lang.Integer.valueOf(r13)
                r4[r5] = r9
                r5 = 3
                java.lang.Integer r9 = java.lang.Integer.valueOf(r13)
                r4[r5] = r9
                r1.mo160131h(r2, r4)
                java.lang.String r1 = lb0.C88394b.f255384g
                lb0.b r1 = lb0.C88394b.C88418q.f255427a
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r4 = "file://"
                r2.append(r4)
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                r1.mo122794m(r0)
                java.lang.Class<com.tencent.mm.message.a> r0 = com.tencent.p014mm.message.C80995a.class
                com.tencent.mm.message.g r0 = r6.mo93555w(r0)
                com.tencent.mm.message.a r0 = (com.tencent.p014mm.message.C80995a) r0
                if (r0 == 0) goto L_0x020a
                java.lang.String r2 = r0.f237884A
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
                if (r2 != 0) goto L_0x020a
                java.lang.String r2 = r0.f237884A
                r1.mo122794m(r2)
            L_0x020a:
                java.lang.Class<kr0.h0> r1 = kr0.C88274h0.class
                di3.d r2 = di3.C86312j.m106911c(r1)
                if (r2 == 0) goto L_0x021d
                di3.d r1 = di3.C86312j.m106911c(r1)
                kr0.h0 r1 = (kr0.C88274h0) r1
                kr0.g1 r2 = kr0.C88273g1.CHATTING_WEISHI
                r1.mo113305TH(r2)
            L_0x021d:
                android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                boolean r1 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.isWifi((android.content.Context) r1)
                if (r1 == 0) goto L_0x0272
                if (r0 == 0) goto L_0x0272
                java.lang.String r1 = r0.f237917z
                boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
                if (r1 != 0) goto L_0x0272
                java.lang.String r0 = r0.f237917z
                di3.d r1 = di3.C86312j.m106911c(r3)
                if (r1 == 0) goto L_0x0272
                di3.d r1 = di3.C86312j.m106911c(r3)
                kr0.o0 r1 = (kr0.C34006o0) r1
                boolean r2 = r1.mo59398IB()
                if (r2 == 0) goto L_0x026d
                java.lang.String r2 = "[weishi] parseMsgInfo, invoke video cache task"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r2)
                int r1 = r1.mo59399IO()
                r2 = -1
                if (r1 == r2) goto L_0x0255
                int r1 = r1 * 1024
                int r1 = r1 * 1024
            L_0x0255:
                java.lang.String r2 = com.tencent.p014mm.ipcinvoker.wx_extension.service.Appbrand0IPCService.f237787e
                com.tencent.mm.plugin.appbrand.xweb_ext.video.AppBrandWeishiVideoOperation r3 = new com.tencent.mm.plugin.appbrand.xweb_ext.video.AppBrandWeishiVideoOperation
                r4 = 0
                long r8 = (long) r1
                r17 = r3
                r18 = r0
                r19 = r4
                r21 = r8
                r17.<init>(r18, r19, r21)
                java.lang.Class<com.tencent.mm.ui.chatting.viewitems.n3$c> r0 = com.tencent.p014mm.p136ui.chatting.viewitems.C74134n3.C74139c.class
                com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker.m98748a(r2, r3, r0, r7)
                goto L_0x0272
            L_0x026d:
                java.lang.String r0 = "parseMsgInfo, weishi video preload disabled"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            L_0x0272:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.viewitems.C74134n3.C74138e.mo103196b(com.tencent.mm.ui.chatting.viewitems.i, com.tencent.mm.ui.chatting.viewitems.n3$e, uj3.e, ck3.b, com.tencent.mm.storage.f4, boolean, com.tencent.mm.ui.chatting.viewitems.n3$d, com.tencent.mm.ui.chatting.viewitems.i$e):void");
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.n3$c */
    public static final class C74139c implements C80883e<AppBrandWeishiVideoOperation, IPCVoid> {
        private C74139c() {
        }

        public void invoke(Object obj, C1256g gVar) {
            AppBrandWeishiVideoOperation appBrandWeishiVideoOperation = (AppBrandWeishiVideoOperation) obj;
            if (appBrandWeishiVideoOperation != null) {
                Log.m105924i("MicroMsg.ChattingItemAppMsgWeishiVideo", "[weishi] invoke, cache video");
                C88593a aVar = C88593a.f255857e;
                ((C88600e) aVar.f255858d).mo123042d(appBrandWeishiVideoOperation.f247813d, appBrandWeishiVideoOperation.f247814e, appBrandWeishiVideoOperation.f247815f);
            }
        }
    }

    /* renamed from: a */
    public static boolean m88264a(C67391b bVar, C76874e0 e0Var, View view, C72963f4 f4Var) {
        Class cls = C79138l.class;
        int b = ((C74243t8) view.getTag()).mo103252b();
        C68070l.C68072b u = C68070l.C68072b.m80422u(C75604z3.m90840l(bVar.mo91583x(), f4Var.getContent(), f4Var.mo108769t2()), (String) null);
        if (u == null) {
            Log.m105928w("MicroMsg.ChattingItemAppMsgWeishiVideo", "createContextMenu, content is null");
            return true;
        }
        if (!((C79138l) C86312j.m106911c(cls)).E10(((C79138l) C86312j.m106911c(cls)).mo73990GW(u.f195562d, false)) || C74343y0.m88768l(f4Var)) {
            Log.m105924i("MicroMsg.ChattingItemAppMsgWeishiVideo", "createContextMenu, do not show transmit menu");
            return true;
        }
        Log.m105924i("MicroMsg.ChattingItemAppMsgWeishiVideo", "createContextMenu, show transmit menu");
        e0Var.mo107136c(b, 111, 0, view.getContext().getString(C0966R.string.i48), C0966R.raw.icons_filled_share);
        return true;
    }
}
