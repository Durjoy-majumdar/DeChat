package xv1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.OpenIMChatRoomLogStruct;
import com.tencent.p014mm.plugin.fts.p059ui.C93938f0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C45628s0;
import f40.C86709a0;
import f62.C75700k0;
import he0.C76158j;
import i21.C98591h;
import java.util.List;
import ke3.C88144b;
import kg3.C76577a;
import kv1.C99251g;
import lv1.C99671h;
import lv1.C99681n;
import p196ln.C76705f;
import pv1.C22019b;

/* renamed from: xv1.u */
public class C78997u extends C22019b {

    /* renamed from: p */
    public C99681n f231975p;

    /* renamed from: q */
    public C72996z1 f231976q;

    /* renamed from: r */
    public String f231977r;

    /* renamed from: s */
    public CharSequence f231978s;

    /* renamed from: t */
    public CharSequence f231979t;

    /* renamed from: u */
    public CharSequence f231980u;

    /* renamed from: v */
    public C78999b f231981v = new C78999b();

    /* renamed from: w */
    public C78998a f231982w = new C78998a(this);

    /* renamed from: xv1.u$a */
    public class C78998a extends C22019b.C22020a {

        /* renamed from: a */
        public View f231983a;

        /* renamed from: b */
        public ImageView f231984b;

        /* renamed from: c */
        public TextView f231985c;

        /* renamed from: d */
        public TextView f231986d;

        public C78998a(C78997u uVar) {
            super(uVar);
        }
    }

    /* renamed from: xv1.u$b */
    public class C78999b extends C22019b.C22021b {
        public C78999b() {
            super();
        }

        /* renamed from: b */
        public void mo35142b(Context context, C22019b.C22020a aVar, C22019b bVar, Object... objArr) {
            C78998a aVar2 = (C78998a) aVar;
            C78997u uVar = (C78997u) bVar;
            C93938f0.m118699g(aVar2.f231983a, C78997u.this.f62326d);
            String str = uVar.f231977r;
            if (str == null || str.length() <= 0) {
                aVar2.f231984b.setImageResource(C0966R.C0969drawable.bfa);
            } else {
                ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(aVar2.f231984b, uVar.f231977r);
            }
            if (C45628s0.m50748M(uVar.f231977r)) {
                C93938f0.m118693a(((C76158j) C86312j.m106911c(C76158j.class)).bm0(context, uVar.f231978s), aVar2.f231985c);
            } else {
                C93938f0.m118693a(uVar.f231978s, aVar2.f231985c);
            }
            aVar2.f231985c.setMaxWidth(C76577a.m92151b(context, 200));
            C93938f0.m118693a(uVar.f231980u, aVar2.f231986d);
        }

        /* renamed from: c */
        public View mo35143c(Context context, ViewGroup viewGroup, View view) {
            View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.cqs, viewGroup, false);
            C78998a aVar = C78997u.this.f231982w;
            aVar.f231984b = (ImageView) inflate.findViewById(C0966R.C0970id.a27);
            aVar.f231985c = (TextView) inflate.findViewById(C0966R.C0970id.kpm);
            aVar.f231986d = (TextView) inflate.findViewById(C0966R.C0970id.c2h);
            aVar.f231983a = inflate.findViewById(C0966R.C0970id.c7p);
            inflate.setTag(aVar);
            return inflate;
        }

        /* renamed from: d */
        public boolean mo35144d(Context context, View view, C22019b bVar, Object... objArr) {
            C78997u uVar = (C78997u) bVar;
            mo35141a(C78997u.this.mo35139k(), uVar.f231975p);
            Intent putExtra = new Intent().putExtra("Chat_User", uVar.f231977r).putExtra("finish_direct", true);
            putExtra.putExtra("chat_from_scene", 5);
            if ((C72996z1.m85843n5(uVar.f231977r) || C72996z1.m85844o5(uVar.f231977r)) && !WeChatBrands.Business.Entries.ContactWeCom.checkAvailable(view.getContext())) {
                return true;
            }
            if (C72996z1.m85847r5(uVar.f231977r)) {
                OpenIMChatRoomLogStruct openIMChatRoomLogStruct = new OpenIMChatRoomLogStruct();
                openIMChatRoomLogStruct.mo93194s(uVar.f231977r);
                openIMChatRoomLogStruct.f194303e = 3;
                openIMChatRoomLogStruct.mo86054n();
            }
            C88144b.m109801s(context, ".ui.chatting.ChattingUI", putExtra, (Bundle) null);
            ((C98591h) C86312j.m106911c(C98591h.class)).rt0(uVar.f231977r, 2);
            return true;
        }
    }

    public C78997u(int i) {
        super(2, i);
    }

    /* renamed from: a */
    public void mo35129a(Context context, C22019b.C22020a aVar, Object... objArr) {
        this.f231977r = this.f231975p.f292151e;
        this.f231976q = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(this.f231977r);
        try {
            mo108962l(context);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.FTS.FTSWXChatroomDataItem", e, "format text exception", new Object[0]);
            if (this.f231978s == null) {
                this.f231978s = C99251g.m129283d(this.f231976q.getUsername());
            }
        }
    }

    /* renamed from: e */
    public int mo35133e() {
        List<C99671h> list;
        C99681n nVar = this.f231975p;
        if (nVar.f292149c != 38 || (list = nVar.f292160n) == null || list.size() <= 0) {
            return 0;
        }
        return list.get(0).f292110b;
    }

    /* renamed from: g */
    public int mo35135g() {
        return this.f231975p.f292164r;
    }

    /* renamed from: h */
    public C22019b.C22021b mo35136h() {
        return this.f231981v;
    }

    /* renamed from: j */
    public boolean mo35138j() {
        return this.f231975p.f292165s;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005c, code lost:
        r2 = r0.getString(0);
     */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0154  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo108962l(android.content.Context r15) {
        /*
            r14 = this;
            java.lang.Class<ny.h> r0 = p629ny.C76979h.class
            android.content.res.Resources r1 = r15.getResources()
            di3.d r2 = di3.C86312j.m106911c(r0)
            ny.h r2 = (p629ny.C76979h) r2
            com.tencent.mm.storage.z1 r3 = r14.f231976q
            java.lang.String r3 = r3.getUsername()
            java.lang.String r3 = kv1.C99251g.m129283d(r3)
            int r4 = com.tencent.p014mm.plugin.fts.p059ui.C56782d.f162738b
            float r4 = (float) r4
            android.text.SpannableString r2 = r2.Te0(r15, r3, r4)
            r14.f231978s = r2
            lv1.n r2 = r14.f231975p
            int r2 = r2.f292149c
            r3 = 2131835411(0x7f113a13, float:1.930396E38)
            r4 = 0
            r5 = 2
            r6 = 0
            r7 = 1
            if (r2 == r7) goto L_0x0123
            if (r2 == r5) goto L_0x0120
            r8 = 3
            if (r2 == r8) goto L_0x011e
            r8 = 5
            if (r2 == r8) goto L_0x00db
            r8 = 6
            if (r2 == r8) goto L_0x00d8
            r8 = 7
            if (r2 == r8) goto L_0x00d6
            r0 = 38
            if (r2 == r0) goto L_0x0040
            goto L_0x00d2
        L_0x0040:
            f40.o r0 = f40.C86709a0.m107535s()
            zh3.f r0 = r0.f251811i
            java.lang.String[] r2 = new java.lang.String[r7]
            com.tencent.mm.storage.z1 r3 = r14.f231976q
            java.lang.String r3 = r3.getUsername()
            r2[r6] = r3
            java.lang.String r3 = "SELECT memberlist FROM chatroom WHERE chatroomname=?;"
            android.database.Cursor r0 = r0.rawQuery(r3, r2, r5)
            boolean r2 = r0.moveToFirst()
            if (r2 == 0) goto L_0x006a
            java.lang.String r2 = r0.getString(r6)
            if (r2 != 0) goto L_0x0063
            goto L_0x006a
        L_0x0063:
            java.util.regex.Pattern r3 = kv1.C99249c.C99250a.f291019a
            java.lang.String[] r2 = r3.split(r2)
            goto L_0x006b
        L_0x006a:
            r2 = r4
        L_0x006b:
            r0.close()
            if (r2 == 0) goto L_0x008c
            int r0 = r2.length
            if (r0 <= 0) goto L_0x008c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "("
            r0.append(r3)
            int r3 = r2.length
            r0.append(r3)
            java.lang.String r3 = ")"
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r14.f231979t = r0
        L_0x008c:
            if (r2 == 0) goto L_0x00d2
            lv1.n r0 = r14.f231975p
            java.util.List<lv1.h> r0 = r0.f292160n
            if (r0 != 0) goto L_0x0095
            goto L_0x00d2
        L_0x0095:
            lv1.i r3 = r14.f62327e
            android.text.TextPaint r4 = com.tencent.p014mm.plugin.fts.p059ui.C56782d.f162741e
            java.lang.CharSequence r15 = com.tencent.p014mm.plugin.fts.p059ui.C93938f0.m118695c(r15, r0, r2, r3, r4)
            r0 = 2131835405(0x7f113a0d, float:1.9303948E38)
            java.lang.String r0 = r1.getString(r0)
            java.lang.CharSequence[] r1 = new java.lang.CharSequence[r5]
            r1[r6] = r0
            r1[r7] = r15
            java.lang.CharSequence r4 = android.text.TextUtils.concat(r1)
            java.lang.CharSequence r15 = r14.f231978s
            java.lang.CharSequence r0 = r14.f231979t
            int r1 = com.tencent.p014mm.plugin.fts.p059ui.C56781b.f162736a
            float r1 = (float) r1
            android.text.TextPaint r2 = com.tencent.p014mm.plugin.fts.p059ui.C56782d.f162739c
            android.text.TextUtils$TruncateAt r3 = android.text.TextUtils.TruncateAt.END
            java.lang.String r8 = r0.toString()
            float r8 = r2.measureText(r8)
            float r1 = r1 - r8
            java.lang.CharSequence[] r5 = new java.lang.CharSequence[r5]
            java.lang.CharSequence r15 = android.text.TextUtils.ellipsize(r15, r2, r1, r3)
            r5[r6] = r15
            r5[r7] = r0
            java.lang.CharSequence r15 = android.text.TextUtils.concat(r5)
            r14.f231978s = r15
        L_0x00d2:
            r9 = 0
            r10 = 0
            goto L_0x0152
        L_0x00d6:
            r1 = 1
            goto L_0x00d9
        L_0x00d8:
            r1 = 0
        L_0x00d9:
            r2 = 1
            goto L_0x00dd
        L_0x00db:
            r1 = 0
            r2 = 0
        L_0x00dd:
            com.tencent.mm.storage.z1 r8 = r14.f231976q
            java.lang.String r8 = r8.mo73969n2()
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r8 == 0) goto L_0x00ea
            goto L_0x014f
        L_0x00ea:
            java.lang.String r3 = r15.getString(r3)
            di3.d r0 = di3.C86312j.m106911c(r0)
            ny.h r0 = (p629ny.C76979h) r0
            com.tencent.mm.storage.z1 r4 = r14.f231976q
            java.lang.String r4 = r4.mo62909j3()
            android.text.SpannableString r15 = r0.mo107057T1(r15, r4)
            java.lang.CharSequence[] r0 = new java.lang.CharSequence[r5]
            r0[r6] = r3
            r0[r7] = r15
            java.lang.CharSequence r8 = android.text.TextUtils.concat(r0)
            lv1.i r9 = r14.f62327e
            int r15 = com.tencent.p014mm.plugin.fts.p059ui.C56781b.f162736a
            float r12 = (float) r15
            android.text.TextPaint r13 = com.tencent.p014mm.plugin.fts.p059ui.C56782d.f162739c
            r10 = r2
            r11 = r1
            lv1.f r15 = lv1.C99667f.m130092e(r8, r9, r10, r11, r12, r13)
            lv1.g r15 = kv1.C99254i.m129308e(r15)
            java.lang.CharSequence r4 = r15.f292107a
            r10 = r1
            r9 = r2
            goto L_0x0152
        L_0x011e:
            r1 = 1
            goto L_0x0121
        L_0x0120:
            r1 = 0
        L_0x0121:
            r2 = 1
            goto L_0x0125
        L_0x0123:
            r1 = 0
            r2 = 0
        L_0x0125:
            com.tencent.mm.storage.z1 r8 = r14.f231976q
            java.lang.String r8 = r8.getNickname()
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r8 != 0) goto L_0x014f
            java.lang.String r3 = r15.getString(r3)
            di3.d r0 = di3.C86312j.m106911c(r0)
            ny.h r0 = (p629ny.C76979h) r0
            com.tencent.mm.storage.z1 r4 = r14.f231976q
            java.lang.String r4 = r4.mo62909j3()
            android.text.SpannableString r15 = r0.mo107057T1(r15, r4)
            java.lang.CharSequence[] r0 = new java.lang.CharSequence[r5]
            r0[r6] = r3
            r0[r7] = r15
            java.lang.CharSequence r4 = android.text.TextUtils.concat(r0)
        L_0x014f:
            r10 = r1
            r9 = r2
            r6 = 1
        L_0x0152:
            if (r6 == 0) goto L_0x0169
            java.lang.CharSequence r7 = r14.f231978s
            lv1.i r8 = r14.f62327e
            int r15 = com.tencent.p014mm.plugin.fts.p059ui.C56781b.f162736a
            float r11 = (float) r15
            android.text.TextPaint r12 = com.tencent.p014mm.plugin.fts.p059ui.C56782d.f162739c
            lv1.f r15 = lv1.C99667f.m130092e(r7, r8, r9, r10, r11, r12)
            lv1.g r15 = kv1.C99254i.m129308e(r15)
            java.lang.CharSequence r15 = r15.f292107a
            r14.f231978s = r15
        L_0x0169:
            r14.f231980u = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xv1.C78997u.mo108962l(android.content.Context):void");
    }
}
