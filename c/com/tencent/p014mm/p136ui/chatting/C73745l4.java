package com.tencent.p014mm.p136ui.chatting;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelimage.C92836k;
import com.tencent.p014mm.modelimage.C92839m;
import com.tencent.p014mm.p136ui.chatting.gallery.ImageGalleryUI;
import com.tencent.p014mm.p136ui.transmit.MsgRetransmitUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44668u3;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72989o2;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import eb0.C116756s5;
import eb0.C45628s0;
import eb0.C75592q0;
import eb0.C97625j3;
import hd0.C98408n0;
import i61.C98602h;
import j20.C117292a;
import java.util.LinkedList;
import java.util.List;
import k20.C9556a;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C47268j0;
import nj3.C76874e0;
import nj3.C76879j;
import nj3.C76912y0;
import p158gt.C76053l;
import p158gt.C98201k;
import p629ny.C76979h;
import p682rz.C101491u;
import pc0.C100760a0;
import qo3.C77407n;
import qo3.C89779i0;
import rb0.C47984k;
import rb0.C48009v0;
import z51.C39315g;

/* renamed from: com.tencent.mm.ui.chatting.l4 */
public class C73745l4 {

    /* renamed from: com.tencent.mm.ui.chatting.l4$a */
    public class C6787a implements C47268j0 {

        /* renamed from: a */
        public final /* synthetic */ Context f24334a;

        public C6787a(Context context) {
            this.f24334a = context;
        }

        /* renamed from: a */
        public void mo7130a(TextView textView, MenuItem menuItem) {
            if (textView != null) {
                C44668u3 v = C97625j3.m125812b().mo105907v();
                C72996z1 z1Var = v.get(menuItem.getTitle() + "");
                if (z1Var == null || ((int) z1Var.f108320R1) <= 0) {
                    textView.setText(menuItem.getTitle() + "");
                    return;
                }
                textView.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(this.f24334a, z1Var.mo62909j3(), textView.getTextSize()));
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.l4$b */
    public class C6788b implements C11182m0 {

        /* renamed from: d */
        public final /* synthetic */ List f24335d;

        public C6788b(List list) {
            this.f24335d = list;
        }

        public void onCreateMMMenu(C76874e0 e0Var) {
            for (String add : this.f24335d) {
                e0Var.add((CharSequence) add);
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.l4$c */
    public class C44852c implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ String f121693d;

        /* renamed from: e */
        public final /* synthetic */ Context f121694e;

        public C44852c(String str, Context context) {
            this.f121693d = str;
            this.f121694e = context;
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            String str = menuItem.getTitle() + "";
            Log.m105925i("MicroMsg.LongClickBrandServiceHelper", "connector click[text]: to[%s] text[%s]", str, this.f121693d);
            C100760a0.C100764f a = C100760a0.m131931a(str);
            a.f295187a = str;
            a.f295189c = this.f121693d;
            a.f295190d = C45628s0.m50810y(str);
            a.f295191e = 0;
            a.f295194h = 4;
            a.mo140195a().mo123694a();
            C115669n.INSTANCE.mo160131h(10424, 1, 1, str);
            Context context = this.f121694e;
            C76879j.m92726T(context, context.getString(C0966R.string.a2o));
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.l4$f */
    public class C44853f implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ C72963f4 f121695d;

        /* renamed from: e */
        public final /* synthetic */ Context f121696e;

        public C44853f(C72963f4 f4Var, Context context) {
            this.f121695d = f4Var;
            this.f121696e = context;
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            String str = menuItem.getTitle() + "";
            String str2 = new C72989o2(this.f121695d.getContent()).f212821d;
            if (str2 == null || str2.endsWith("-1")) {
                str2 = this.f121695d.mo108765s2();
            }
            if (str2 == null) {
                Log.m105928w("MicroMsg.LongClickBrandServiceHelper", "showAcceptEmojiConnector: filePath is null");
                return;
            }
            Log.m105925i("MicroMsg.LongClickBrandServiceHelper", "connector click[emoji]: to[%s] filePath[%s]", str, str2);
            if (((C98602h) ((C39315g) C86312j.m106911c(C39315g.class)).mo58035cm()).mo138010Q(this.f121696e, str, str2)) {
                C115669n.INSTANCE.mo160131h(10424, 47, 64, str);
                C76879j.m92726T(this.f121696e, "");
            }
            C115669n.INSTANCE.mo160131h(10424, 47, 64, str);
            Context context = this.f121696e;
            C76879j.m92726T(context, context.getString(C0966R.string.a2o));
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.l4$d */
    public class C73746d implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ C72963f4 f216500d;

        /* renamed from: e */
        public final /* synthetic */ Context f216501e;

        /* renamed from: f */
        public final /* synthetic */ boolean f216502f;

        /* renamed from: g */
        public final /* synthetic */ String f216503g;

        public C73746d(C72963f4 f4Var, Context context, boolean z, String str) {
            this.f216500d = f4Var;
            this.f216501e = context;
            this.f216502f = z;
            this.f216503g = str;
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            Class cls = C76053l.class;
            Class cls2 = C98201k.class;
            String str = menuItem.getTitle() + "";
            C92836k vP = this.f216500d.getMsgId() > 0 ? ((C92839m) ((C98201k) C86312j.m106911c(cls2)).mo137277xi()).mo127200vP(this.f216500d.mo108768t(), this.f216500d.getMsgId()) : null;
            if ((vP == null || vP.f267374a <= 0) && this.f216500d.mo108774y2() > 0) {
                vP = ((C92839m) ((C98201k) C86312j.m106911c(cls2)).mo137277xi()).mo127168NQ(this.f216500d.mo108768t(), this.f216500d.mo108774y2());
            }
            if (vP == null) {
                Log.m105928w("MicroMsg.LongClickBrandServiceHelper", "showAcceptImgConnector: try get imgInfo fail");
                return;
            }
            int i2 = vP.f267376c;
            int i3 = vP.f267377d;
            int i4 = 1;
            if (i2 < i3 || i3 == 0) {
                Log.m105924i("MicroMsg.LongClickBrandServiceHelper", "[ImageGalleryUI] enter");
                Intent intent = new Intent(this.f216501e, ImageGalleryUI.class);
                intent.putExtra("img_gallery_msg_id", this.f216500d.getMsgId());
                intent.putExtra("img_gallery_msg_svr_id", this.f216500d.mo108774y2());
                intent.putExtra("img_gallery_talker", this.f216500d.mo108768t());
                intent.putExtra("img_gallery_chatroom_name", this.f216500d.mo108768t());
                intent.putExtra("img_gallery_is_restransmit_after_download", true);
                intent.putExtra("img_gallery_directly_send_name", str);
                intent.putExtra("start_chatting_ui", false);
                String t = this.f216500d.mo108768t();
                Bundle bundle = new Bundle();
                if (this.f216502f) {
                    bundle.putInt("stat_scene", 2);
                } else {
                    if (C45628s0.m50738C(t)) {
                        i4 = 7;
                    }
                    bundle.putInt("stat_scene", i4);
                }
                bundle.putString("stat_msg_id", "msg_" + Long.toString(this.f216500d.mo108774y2()));
                bundle.putString("stat_chat_talker_username", t);
                bundle.putString("stat_send_msg_user", this.f216503g);
                intent.putExtra("_stat_obj", bundle);
                Context context = this.f216501e;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/ui/chatting/SendToBrandServiceHelper$3", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(context, "com/tencent/mm/ui/chatting/SendToBrandServiceHelper$3", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return;
            }
            boolean p = this.f216500d.mo108769t2() == 1 ? vP.mo127145p() : vP.mo127145p() && C86013q1.m106450k(((C76053l) C86312j.m106911c(cls)).mo106261jD(vP).f267378e);
            String s = C75592q0.m90789s();
            String TY = ((C92839m) ((C98201k) C86312j.m106911c(cls2)).mo137277xi()).mo127174TY(((C76053l) C86312j.m106911c(cls)).mo106262y8(vP), "", "", true);
            if (!Util.isNullOrNil(TY)) {
                Log.m105925i("MicroMsg.LongClickBrandServiceHelper", "connector click[img]: to[%s] fileName[%s]", str, TY);
                C100760a0.C100764f b = C100760a0.m131932b(C100760a0.C100763e.IMAGE);
                b.f295195i = 4;
                b.f295188b = s;
                b.f295187a = str;
                b.f295196j = TY;
                b.f295197k = p ? 1 : 0;
                b.f295198l = null;
                b.f295200n = 0;
                b.f295204r = "";
                b.f295205s = "";
                b.f295202p = true;
                b.f295201o = C0966R.C0969drawable.by8;
                b.f295194h = 11;
                b.mo140195a().mo123694a();
                C116756s5.m164691d().mo180727a(C116756s5.f350054c, (Object[]) null);
            }
            C115669n.INSTANCE.mo160131h(10424, 3, 4, str);
            Context context2 = this.f216501e;
            C76879j.m92726T(context2, context2.getString(C0966R.string.a2o));
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.l4$g */
    public class C73747g implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ C72963f4 f216504d;

        /* renamed from: e */
        public final /* synthetic */ String f216505e;

        /* renamed from: f */
        public final /* synthetic */ int f216506f;

        /* renamed from: g */
        public final /* synthetic */ Context f216507g;

        public C73747g(C72963f4 f4Var, String str, int i, Context context) {
            this.f216504d = f4Var;
            this.f216505e = str;
            this.f216506f = i;
            this.f216507g = context;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a9, code lost:
            if (r0.field_mediaSvrId.equals(r1.f195606o) == false) goto L_0x00c4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x00c0, code lost:
            if (r0.field_mediaSvrId.equals(r1.f195606o) != false) goto L_0x00c3;
         */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x007c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onMMMenuItemSelected(android.view.MenuItem r14, int r15) {
            /*
                r13 = this;
                java.lang.StringBuilder r15 = new java.lang.StringBuilder
                r15.<init>()
                java.lang.CharSequence r14 = r14.getTitle()
                r15.append(r14)
                java.lang.String r14 = ""
                r15.append(r14)
                java.lang.String r15 = r15.toString()
                com.tencent.mm.storage.f4 r0 = r13.f216504d
                java.lang.String r1 = r13.f216505e
                java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.processXml(r1)
                r2 = 0
                com.tencent.mm.message.l$b r1 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r1, r2)
                java.lang.String r3 = "MicroMsg.LongClickBrandServiceHelper"
                r7 = 2
                r8 = 3
                r9 = 0
                r10 = 1
                if (r1 != 0) goto L_0x0031
                java.lang.String r14 = "send: parse app msg content return null"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r14)
                goto L_0x00f6
            L_0x0031:
                java.lang.String r4 = r0.mo108765s2()
                if (r4 == 0) goto L_0x006e
                java.lang.String r4 = r0.mo108765s2()
                boolean r4 = r4.equals(r14)
                if (r4 != 0) goto L_0x006e
                java.lang.Class<gt.k> r4 = p158gt.C98201k.class
                di3.d r4 = di3.C86312j.m106911c(r4)
                gt.k r4 = (p158gt.C98201k) r4
                gt.m r4 = r4.mo137277xi()
                java.lang.String r0 = r0.mo108765s2()
                com.tencent.mm.modelimage.m r4 = (com.tencent.p014mm.modelimage.C92839m) r4
                java.lang.String r0 = r4.v10(r0, r10)
                r4 = -1
                byte[] r0 = com.tencent.p014mm.vfs.C86013q1.m106433O(r0, r9, r4)     // Catch:{ Exception -> 0x005e }
                r5 = r0
                goto L_0x006f
            L_0x005e:
                r0 = move-exception
                java.lang.Object[] r4 = new java.lang.Object[r7]
                r4[r9] = r15
                java.lang.String r0 = r0.getLocalizedMessage()
                r4[r10] = r0
                java.lang.String r0 = "send appmsg to %s, error:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r0, r4)
            L_0x006e:
                r5 = r2
            L_0x006f:
                com.tencent.mm.pluginsdk.model.app.d r0 = new com.tencent.mm.pluginsdk.model.app.d
                r0.<init>()
                java.lang.String r3 = r1.f195606o
                boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
                if (r3 != 0) goto L_0x00c3
                java.lang.String r3 = r1.f195606o
                r11 = -1
                long r3 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r3, r11)
                int r6 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
                if (r6 == 0) goto L_0x00ac
                com.tencent.mm.pluginsdk.model.app.e r6 = com.tencent.p014mm.pluginsdk.model.app.C72709y1.vx0()
                r6.get((long) r3, r0)
                long r11 = r0.systemRowid
                int r6 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
                if (r6 == 0) goto L_0x00c3
                com.tencent.mm.pluginsdk.model.app.e r0 = com.tencent.p014mm.pluginsdk.model.app.C72709y1.vx0()
                java.lang.String r3 = r1.f195606o
                com.tencent.mm.pluginsdk.model.app.d r0 = r0.mo100154qq(r3)
                if (r0 == 0) goto L_0x00c4
                java.lang.String r3 = r0.field_mediaSvrId
                java.lang.String r4 = r1.f195606o
                boolean r3 = r3.equals(r4)
                if (r3 != 0) goto L_0x00c3
                goto L_0x00c4
            L_0x00ac:
                com.tencent.mm.pluginsdk.model.app.e r0 = com.tencent.p014mm.pluginsdk.model.app.C72709y1.vx0()
                java.lang.String r3 = r1.f195606o
                com.tencent.mm.pluginsdk.model.app.d r0 = r0.mo100154qq(r3)
                if (r0 == 0) goto L_0x00c4
                java.lang.String r3 = r0.field_mediaSvrId
                java.lang.String r4 = r1.f195606o
                boolean r3 = r3.equals(r4)
                if (r3 != 0) goto L_0x00c3
                goto L_0x00c4
            L_0x00c3:
                r2 = r0
            L_0x00c4:
                if (r2 == 0) goto L_0x00e5
                java.lang.String r0 = r2.field_fileFullPath
                if (r0 == 0) goto L_0x00e5
                boolean r0 = r0.equals(r14)
                if (r0 != 0) goto L_0x00e5
                eb0.c r14 = eb0.C97625j3.m125812b()
                java.lang.String r14 = r14.mo105889d()
                java.lang.String r0 = r1.f195570f
                java.lang.String r3 = r1.f195602n
                java.lang.String r14 = com.tencent.p014mm.pluginsdk.model.app.C72695v.m85063e(r14, r0, r3)
                java.lang.String r0 = r2.field_fileFullPath
                com.tencent.p014mm.vfs.C86013q1.m106442c(r0, r14)
            L_0x00e5:
                r4 = r14
                com.tencent.mm.message.l$b r0 = com.tencent.p014mm.message.C68070l.C68072b.m80418i(r1)
                r0.f195618r = r8
                java.lang.String r14 = r1.f195562d
                java.lang.String r2 = r1.f195484F
                r6 = 0
                r1 = r14
                r3 = r15
                com.tencent.p014mm.pluginsdk.model.app.C72695v.m85053F(r0, r1, r2, r3, r4, r5, r6)
            L_0x00f6:
                int r14 = r13.f216506f
                r0 = 128(0x80, float:1.794E-43)
                r1 = 49
                r2 = 10424(0x28b8, float:1.4607E-41)
                if (r14 == r0) goto L_0x0135
                r0 = 256(0x100, float:3.59E-43)
                if (r14 == r0) goto L_0x011f
                r0 = 512(0x200, float:7.175E-43)
                if (r14 == r0) goto L_0x0109
                goto L_0x014a
            L_0x0109:
                com.tencent.mm.plugin.report.service.n r14 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                java.lang.Object[] r3 = new java.lang.Object[r8]
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r3[r9] = r1
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r3[r10] = r0
                r3[r7] = r15
                r14.mo160131h(r2, r3)
                goto L_0x014a
            L_0x011f:
                com.tencent.mm.plugin.report.service.n r14 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                java.lang.Object[] r3 = new java.lang.Object[r8]
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r3[r9] = r1
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r3[r10] = r0
                r3[r7] = r15
                r14.mo160131h(r2, r3)
                goto L_0x014a
            L_0x0135:
                com.tencent.mm.plugin.report.service.n r14 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                java.lang.Object[] r3 = new java.lang.Object[r8]
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r3[r9] = r1
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r3[r10] = r0
                r3[r7] = r15
                r14.mo160131h(r2, r3)
            L_0x014a:
                android.content.Context r14 = r13.f216507g
                r15 = 2131821673(0x7f110469, float:1.9276096E38)
                java.lang.String r15 = r14.getString(r15)
                nj3.C76879j.m92726T(r14, r15)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.C73745l4.C73747g.onMMMenuItemSelected(android.view.MenuItem, int):void");
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.l4$e */
    public class C73748e implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ C72963f4 f216508d;

        /* renamed from: e */
        public final /* synthetic */ Context f216509e;

        /* renamed from: com.tencent.mm.ui.chatting.l4$e$a */
        public class C73749a implements DialogInterface.OnCancelListener {

            /* renamed from: d */
            public final /* synthetic */ MsgRetransmitUI.C97251g f216510d;

            public C73749a(C73748e eVar, MsgRetransmitUI.C97251g gVar) {
                this.f216510d = gVar;
            }

            public void onCancel(DialogInterface dialogInterface) {
                this.f216510d.f285416c = true;
            }
        }

        public C73748e(C72963f4 f4Var, Context context) {
            this.f216508d = f4Var;
            this.f216509e = context;
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            String str = menuItem.getTitle() + "";
            C98408n0 Zd = ((C101491u) C86312j.m106911c(C101491u.class)).mo140806Zd(this.f216508d.mo108765s2());
            Log.m105925i("MicroMsg.LongClickBrandServiceHelper", "connector click[video]: to[%s] imgPath[%s]", str, this.f216508d.mo108765s2());
            MsgRetransmitUI.C97251g gVar = new MsgRetransmitUI.C97251g();
            Context context = this.f216509e;
            C89779i0 Q = C76879j.m92723Q(context, context.getResources().getString(C0966R.string.a3h), this.f216509e.getResources().getString(C0966R.string.a2w), true, true, new C73749a(this, gVar));
            gVar.f285415b = this.f216509e;
            gVar.f285420g = this.f216508d.mo108765s2();
            gVar.f285414a = Q;
            gVar.f285422i = str;
            gVar.f285417d = Zd.f288572s;
            gVar.f285418e = Zd.f288566m;
            gVar.execute(new Object[0]);
            C116756s5.m164691d().mo180727a(C116756s5.f350055d, (Object[]) null);
            Context context2 = this.f216509e;
            C76879j.m92726T(context2, context2.getString(C0966R.string.a2o));
        }
    }

    /* renamed from: a */
    public static List<String> m87340a(List<String> list) {
        LinkedList linkedList = new LinkedList();
        for (String next : list) {
            if (!C47984k.m53338l(next)) {
                linkedList.add(next);
            }
        }
        Log.m105919d("MicroMsg.LongClickBrandServiceHelper", "get selected accept list, size %d", Integer.valueOf(linkedList.size()));
        return linkedList;
    }

    /* renamed from: b */
    public static void m87341b(C72963f4 f4Var, String str, Context context, int i) {
        if (context == null) {
            Log.m105928w("MicroMsg.LongClickBrandServiceHelper", "showAcceptMusicConnector: context is null");
        } else if (f4Var == null) {
            Log.m105928w("MicroMsg.LongClickBrandServiceHelper", "showAcceptMusicConnector: msg is null");
        } else {
            List<String> list = null;
            if (i == 128) {
                list = m87340a(C48009v0.Fx0().mo72763bO(128));
            } else if (i == 256) {
                list = m87340a(C48009v0.Fx0().mo72763bO(256));
            } else if (i == 512) {
                list = m87340a(C48009v0.Fx0().mo72763bO(512));
            }
            m87346g(list, context, new C73747g(f4Var, str, i, context));
        }
    }

    /* renamed from: c */
    public static void m87342c(C72963f4 f4Var, Context context) {
        if (context == null) {
            Log.m105928w("MicroMsg.LongClickBrandServiceHelper", "showAcceptEmojiConnector: context is null");
        } else if (f4Var == null) {
            Log.m105928w("MicroMsg.LongClickBrandServiceHelper", "showAcceptEmojiConnector: msg is null");
        } else if (!C97625j3.m125812b().mo105883I()) {
            C76912y0.m92772k(context);
            Log.m105928w("MicroMsg.LongClickBrandServiceHelper", "showAcceptEmojiConnector: sd card is not available");
        } else {
            m87346g(m87340a(C48009v0.Fx0().mo72763bO(64)), context, new C44853f(f4Var, context));
        }
    }

    /* renamed from: d */
    public static void m87343d(C72963f4 f4Var, Context context, String str, boolean z) {
        if (context == null) {
            Log.m105928w("MicroMsg.LongClickBrandServiceHelper", "showAcceptImgConnector: context is null");
        } else if (f4Var == null) {
            Log.m105928w("MicroMsg.LongClickBrandServiceHelper", "showAcceptImgConnector: msg is null");
        } else if (!C97625j3.m125812b().mo105883I()) {
            C76912y0.m92772k(context);
            Log.m105928w("MicroMsg.LongClickBrandServiceHelper", "showAcceptImgConnector: sd card is not available");
        } else {
            m87346g(m87340a(C48009v0.Fx0().mo72763bO(4)), context, new C73746d(f4Var, context, z, str));
        }
    }

    /* renamed from: e */
    public static void m87344e(String str, Context context) {
        if (context == null) {
            Log.m105928w("MicroMsg.LongClickBrandServiceHelper", "showAcceptTextConnector: context is null");
        } else if (Util.isNullOrNil(str)) {
            Log.m105928w("MicroMsg.LongClickBrandServiceHelper", "showAcceptTextConnector: content is null");
        } else {
            m87346g(m87340a(C48009v0.Fx0().mo72763bO(1)), context, new C44852c(str, context));
        }
    }

    /* renamed from: f */
    public static void m87345f(C72963f4 f4Var, Context context) {
        if (context == null) {
            Log.m105928w("MicroMsg.LongClickBrandServiceHelper", "showAcceptVideoConnector: context is null");
        } else if (f4Var == null) {
            Log.m105928w("MicroMsg.LongClickBrandServiceHelper", "showAcceptVideoConnector: msg is null");
        } else if (!C97625j3.m125812b().mo105883I()) {
            C76912y0.m92772k(context);
            Log.m105928w("MicroMsg.LongClickBrandServiceHelper", "showAcceptVideoConnector: sd card is not available");
        } else {
            m87346g(m87340a(C48009v0.Fx0().mo72763bO(8)), context, new C73748e(f4Var, context));
        }
    }

    /* renamed from: g */
    public static void m87346g(List<String> list, Context context, C11184p0 p0Var) {
        if (list == null || list.isEmpty()) {
            Log.m105928w("MicroMsg.LongClickBrandServiceHelper", "tryShowConnectorDialog: careList is null or empty");
            return;
        }
        LayoutInflater.from(context);
        C77407n nVar = new C77407n(context, 1, false);
        C76874e0 e0Var = new C76874e0(context);
        new C76874e0(context);
        C6787a aVar = new C6787a(context);
        C6788b bVar = new C6788b(list);
        e0Var.clear();
        C76874e0 e0Var2 = new C76874e0(context);
        bVar.onCreateMMMenu(e0Var2);
        if (e0Var2.mo107176v()) {
            Log.m105928w("MicroMsg.MMSubMenuHelper", "show, menu empty");
            return;
        }
        nVar.f225771i = bVar;
        nVar.f225782p = p0Var;
        nVar.f225761d = null;
        nVar.f225725D = aVar;
        nVar.mo107573q();
    }
}
