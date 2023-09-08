package com.tencent.p014mm.p136ui.chatting.component;

import android.content.Intent;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.LbsSayHiEvent;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageButton;
import com.tencent.p014mm.pluginsdk.model.C44590b1;
import com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooter;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72956b4;
import eb0.C75592q0;
import eb0.C97625j3;
import fd0.C75743h;
import java.util.Arrays;
import p011cm.C39989b;
import p270xi.C91212b;
import wd3.C78553c1;
import zj3.C79343c0;
import zj3.C79349e0;
import zj3.C79387w;

@C91212b(exportInterface = C79349e0.class)
/* renamed from: com.tencent.mm.ui.chatting.component.LbsComponent */
public class LbsComponent extends C73412a implements C79349e0 {

    /* renamed from: e */
    public boolean f215634e = false;

    /* renamed from: f */
    public String f215635f = null;

    /* renamed from: g */
    public boolean f215636g = false;

    /* renamed from: h */
    public String f215637h = null;

    /* renamed from: i */
    public Runnable f215638i = new C73379a();

    /* renamed from: j */
    public Runnable f215639j = new C73380b();

    /* renamed from: n */
    public IListener f215640n = new IListener<LbsSayHiEvent>(C40008f.f107254d) {
        {
            this.__eventId = -772738789;
        }

        public boolean callback(IEvent iEvent) {
            String str;
            LbsSayHiEvent lbsSayHiEvent = (LbsSayHiEvent) iEvent;
            if (lbsSayHiEvent instanceof LbsSayHiEvent) {
                LbsComponent lbsComponent = LbsComponent.this;
                if (lbsComponent.f215634e && ((str = lbsSayHiEvent.f193718d.f193719a) == null || str.equals(lbsComponent.f215637h))) {
                    int i = lbsSayHiEvent.f193718d.f193720b;
                    if (i == 1) {
                        MMHandlerThread.postToMainThread(LbsComponent.this.f215638i);
                    } else if (i == 2) {
                        LbsComponent lbsComponent2 = LbsComponent.this;
                        lbsComponent2.f215634e = false;
                        MMHandlerThread.postToMainThread(lbsComponent2.f215639j);
                    }
                }
            }
            return false;
        }
    };

    /* renamed from: com.tencent.mm.ui.chatting.component.LbsComponent$a */
    public class C73379a implements Runnable {
        public C73379a() {
        }

        public void run() {
            C67391b bVar = LbsComponent.this.f215752d;
            if (bVar != null) {
                ((C79343c0) bVar.f193278b.mo102812a(C79343c0.class)).mo102602F5();
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.LbsComponent$b */
    public class C73380b implements Runnable {
        public C73380b() {
        }

        public void run() {
            C67391b bVar = LbsComponent.this.f215752d;
            if (bVar != null) {
                C79387w wVar = (C79387w) bVar.f193278b.mo102812a(C79387w.class);
                wVar.mo102193k1().setLbsMode(false);
                wVar.mo102193k1().f211859d1 = false;
                wVar.mo102193k1().mo100434m0();
                ChatFooter k1 = wVar.mo102193k1();
                k1.f211869f1 = false;
                ImageButton imageButton = k1.f211946v;
                if (imageButton != null) {
                    imageButton.setVisibility(0);
                }
                k1.mo100363M0(true);
                WeImageButton weImageButton = wVar.mo102193k1().f211921q;
                if (weImageButton != null) {
                    weImageButton.setVisibility(0);
                }
            }
        }
    }

    /* renamed from: A5 */
    public String mo102236A5(String str) {
        if (!this.f215634e) {
            return str;
        }
        Log.m105924i("MicroMsg.ChattingUI.LbsComponent", "[oneliang]encrypt:" + this.f215637h + ",raw:" + this.f215752d.mo91577r());
        return Util.isNullOrNil(this.f215637h) ? this.f215752d.mo91577r() : this.f215637h;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* renamed from: D3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public f62.C75705n0 mo102237D3() {
        /*
            r8 = this;
            boolean r0 = r8.f215634e
            r1 = 0
            if (r0 == 0) goto L_0x008f
            java.lang.String r0 = r8.f215635f
            com.tencent.mm.storage.c4 r2 = fd0.C75743h.xx0()
            java.lang.String r3 = r8.f215637h
            r2.getClass()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "SELECT * FROM "
            r4.append(r5)
            java.lang.String r5 = r2.getTableName()
            r4.append(r5)
            java.lang.String r5 = " where sayhiencryptuser=? and isSend="
            r4.append(r5)
            r5 = 0
            r4.append(r5)
            java.lang.String r6 = " and flag="
            r4.append(r6)
            r4.append(r5)
            java.lang.String r6 = " ORDER BY createtime desc LIMIT 1"
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r2 = r2.f212645d
            r6 = 1
            java.lang.String[] r7 = new java.lang.String[r6]
            r7[r5] = r3
            r3 = 2
            android.database.Cursor r2 = r2.rawQuery(r4, r7, r3)
            if (r2 != 0) goto L_0x004b
        L_0x0049:
            r3 = r1
            goto L_0x0060
        L_0x004b:
            boolean r3 = r2.moveToFirst()
            if (r3 != 0) goto L_0x0055
            r2.close()
            goto L_0x0049
        L_0x0055:
            com.tencent.mm.storage.b4 r3 = new com.tencent.mm.storage.b4
            r3.<init>()
            r3.convertFrom(r2)
            r2.close()
        L_0x0060:
            if (r3 == 0) goto L_0x006c
            java.lang.String r2 = r3.field_ticket
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x006c
            java.lang.String r0 = r3.field_ticket
        L_0x006c:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r2 == 0) goto L_0x0088
            com.tencent.mm.storage.c4 r2 = fd0.C75743h.xx0()
            java.lang.String r3 = r8.f215637h
            com.tencent.mm.storage.b4 r2 = r2.mo100938qq(r3, r6)
            if (r2 == 0) goto L_0x0088
            java.lang.String r3 = r2.field_ticket
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x0088
            java.lang.String r0 = r2.field_ticket
        L_0x0088:
            if (r0 == 0) goto L_0x008f
            fw0.n r1 = new fw0.n
            r1.<init>(r0)
        L_0x008f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.component.LbsComponent.mo102237D3():f62.n0");
    }

    /* renamed from: F4 */
    public void mo26186F4() {
    }

    /* renamed from: G4 */
    public void mo26160G4() {
        MMHandlerThread.removeRunnable(this.f215638i);
        MMHandlerThread.removeRunnable(this.f215639j);
    }

    /* renamed from: O4 */
    public void mo26162O4() {
        if (this.f215634e) {
            C79387w wVar = (C79387w) this.f215752d.f193278b.mo102812a(C79387w.class);
            wVar.mo102193k1().setLbsMode(true);
            ChatFooter k1 = wVar.mo102193k1();
            ImageButton imageButton = k1.f211946v;
            if (imageButton != null) {
                imageButton.setVisibility(8);
            }
            k1.mo100363M0(false);
            WeImageButton weImageButton = wVar.mo102193k1().f211921q;
            if (weImageButton != null) {
                weImageButton.setVisibility(8);
            }
        }
    }

    /* renamed from: U3 */
    public void mo102238U3(Intent intent) {
        intent.putExtra("Contact_IsLBSFriend", true);
        intent.putExtra("Contact_IsLbsChattingProfile", true);
        intent.putExtra("Contact_Scene", 18);
    }

    /* renamed from: Y1 */
    public void mo102239Y1(int i) {
        if (this.f215635f != null) {
            String format = String.format(this.f215752d.mo91572m().getString(C0966R.string.ain), new Object[]{Util.nullAsNil(C75592q0.m90783m())});
            C78553c1 c1Var = new C78553c1(this.f215752d.mo91565f(), (C39989b.C39992e) null);
            c1Var.f230112q = format;
            c1Var.mo108533i(Arrays.asList(new String[]{this.f215637h}), Arrays.asList(new Integer[]{18}));
            this.f215636g = true;
        } else {
            C72956b4 qq = C75743h.xx0().mo100938qq(this.f215637h, 1);
            C97625j3.m125815e().mo123460f(new C44590b1(3, this.f215637h, qq.field_ticket, i));
            qq.field_flag = 2;
            C75743h.xx0().update(qq, new String[0]);
        }
        ((C79343c0) this.f215752d.f193278b.mo102812a(C79343c0.class)).mo102602F5();
    }

    /* renamed from: a0 */
    public void mo102240a0(Button button, LinearLayout linearLayout, LinearLayout linearLayout2) {
        if (this.f215635f == null) {
            C72956b4 qq = C75743h.xx0().mo100938qq(this.f215637h, 1);
            if (qq != null) {
                ((TextView) linearLayout.findViewById(C0966R.C0970id.f5588j6)).setText(qq.field_sayhicontent);
                ((Button) linearLayout.findViewById(C0966R.C0970id.b1j)).setText(C0966R.string.b9q);
                return;
            }
            linearLayout2.setVisibility(8);
        } else if (this.f215636g) {
            ((TextView) linearLayout.findViewById(C0966R.C0970id.f5588j6)).setText(C0966R.string.b9s);
            button.setVisibility(8);
        } else {
            ((TextView) linearLayout.findViewById(C0966R.C0970id.f5588j6)).setText(C0966R.string.b9t);
            ((Button) linearLayout.findViewById(C0966R.C0970id.b1j)).setText(C0966R.string.b9r);
        }
    }

    /* renamed from: e */
    public void mo70065e() {
        this.f215634e = this.f215752d.f193286j.getBooleanExtra("lbs_mode", false).booleanValue();
        this.f215637h = Util.isNullOrNil(this.f215752d.mo91574o().mo73978v2()) ? this.f215752d.mo91577r() : this.f215752d.mo91574o().mo73978v2();
        this.f215635f = this.f215752d.f193286j.getStringExtra("lbs_ticket");
    }

    /* renamed from: g5 */
    public void mo70046g5() {
        this.f215640n.alive();
    }

    /* renamed from: i1 */
    public boolean mo102241i1() {
        return this.f215634e;
    }

    /* renamed from: l2 */
    public void mo70047l2() {
        super.mo70047l2();
        this.f215640n.dead();
    }

    /* renamed from: o */
    public boolean mo102242o() {
        if (!this.f215634e) {
            return false;
        }
        C72956b4 qq = C75743h.xx0().mo100938qq(this.f215637h, 1);
        if (!(this.f215635f == null && qq == null)) {
            ((C79343c0) this.f215752d.f193278b.mo102812a(C79343c0.class)).mo102602F5();
        }
        return true;
    }

    /* renamed from: u5 */
    public void mo26170u5() {
        this.f215640n.dead();
    }
}
