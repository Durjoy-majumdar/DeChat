package com.tencent.p014mm.p136ui.chatting.component;

import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import c30.C104289g;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.chatting.BaseChattingUIFragment;
import com.tencent.p014mm.p136ui.chatting.ChattingUIFragment;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import di3.C86312j;
import eb0.C75604z3;
import f62.C75710x0;
import j20.C117292a;
import java.util.ArrayList;
import p1081gi.C98121d;
import p158gt.C8451i;
import p270xi.C91212b;
import p763ym.C79140q;
import zj3.C79363i;

@C91212b(exportInterface = C79363i.class)
/* renamed from: com.tencent.mm.ui.chatting.component.a0 */
public class C73413a0 extends C73412a implements C79363i {

    /* renamed from: e */
    public Boolean f215753e;

    /* renamed from: f */
    public String f215754f;

    /* renamed from: g */
    public String f215755g;

    /* renamed from: h */
    public boolean f215756h = false;

    /* renamed from: i */
    public String f215757i;

    /* renamed from: j */
    public String f215758j = "";

    /* renamed from: n */
    public String f215759n = "";

    /* renamed from: o */
    public String f215760o = "";

    /* renamed from: p */
    public String f215761p = "";

    /* renamed from: q */
    public int f215762q = 0;

    /* renamed from: r */
    public volatile int f215763r = 1;

    /* renamed from: com.tencent.mm.ui.chatting.component.a0$a */
    public class C73414a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ View f215764d;

        public C73414a(View view) {
            this.f215764d = view;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/component/ChattingBizHalfScreenComponent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C73413a0.this.f215763r = 3;
            C67391b bVar = C73413a0.this.f215752d;
            ((BaseChattingUIFragment) bVar.f193287k).mo102031Z().removeHeaderView(this.f215764d);
            ((ChattingUIFragment) C73413a0.this.f215752d.f193286j).f215289B.setIsTopShowAll(false);
            C73413a0.this.f215752d.f193286j.mo102027U(true, 0);
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/component/ChattingBizHalfScreenComponent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: C5 */
    public long mo102348C5() {
        mo102355Y5();
        if (this.f215753e.booleanValue() && this.f215763r != 3) {
            return ((C79140q) C86312j.m106911c(C79140q.class)).mo108878Ql(this.f215755g);
        }
        return 0;
    }

    /* renamed from: F3 */
    public int mo102349F3() {
        mo102355Y5();
        if (!this.f215753e.booleanValue()) {
            return 0;
        }
        try {
            int K2 = this.f215752d.mo91565f().getWindow().getAttributes().height + mo102353K2();
            Log.m105924i("MicroMsg.ChattingUI.ChattingBizHalfScreenComponent", "getVoice2txtWindowHeight :" + K2);
            return K2;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.ChattingUI.ChattingBizHalfScreenComponent", e, "", new Object[0]);
            return 0;
        }
    }

    /* renamed from: F4 */
    public void mo26186F4() {
        mo102355Y5();
        if (this.f215753e.booleanValue()) {
            ((C79140q) C86312j.m106911c(C79140q.class)).I50(this.f215755g, this.f215757i);
        }
    }

    /* renamed from: G0 */
    public boolean mo102350G0() {
        mo102355Y5();
        return this.f215753e.booleanValue() && this.f215763r == 1;
    }

    /* renamed from: H */
    public boolean mo102351H() {
        mo102355Y5();
        return this.f215753e.booleanValue() && this.f215763r == 2;
    }

    /* renamed from: K0 */
    public void mo102352K0() {
        mo102355Y5();
        if (this.f215753e.booleanValue()) {
            ((C79140q) C86312j.m106911c(C79140q.class)).Vf0();
        }
    }

    /* renamed from: K2 */
    public int mo102353K2() {
        mo102355Y5();
        if (!this.f215753e.booleanValue()) {
            return 0;
        }
        return ((C79140q) C86312j.m106911c(C79140q.class)).mo108877K2() + C75044y4.m89995g(this.f215752d.mo91565f(), 0);
    }

    /* renamed from: K3 */
    public void mo102354K3(boolean z) {
        mo102355Y5();
        if (this.f215753e.booleanValue()) {
            Log.m105925i("MicroMsg.ChattingUI.ChattingBizHalfScreenComponent", "showMoreMsgHeader show:%b, moreMsgHeaderState:%d", Boolean.valueOf(z), Integer.valueOf(this.f215763r));
            if (z && this.f215763r == 1) {
                Log.m105924i("MicroMsg.ChattingUI.ChattingBizHalfScreenComponent", "showMoreMsgHeader do add Header");
                View inflate = C85868k2.m106137b(this.f215752d.mo91565f()).inflate(C0966R.C0971layout.aq9, (ViewGroup) null);
                inflate.setOnClickListener(new C73414a(inflate));
                ((BaseChattingUIFragment) this.f215752d.f193287k).mo102031Z().addHeaderView(inflate);
                this.f215763r = 2;
            }
        }
    }

    /* renamed from: R5 */
    public void mo70146R5(Configuration configuration) {
    }

    /* renamed from: Y5 */
    public final void mo102355Y5() {
        if (this.f215753e == null) {
            try {
                this.f215753e = this.f215752d.f193286j.getBooleanExtra("key_biz_half_screen_chat_style", false);
                String stringExtra = this.f215752d.f193286j.getStringExtra("key_biz_half_screen_chat_refer_info");
                this.f215754f = stringExtra;
                if (stringExtra == null) {
                    this.f215754f = "";
                }
                mo102359b6();
                Log.m105925i("MicroMsg.ChattingUI.ChattingBizHalfScreenComponent", "checkAndInitBizHalfScreenChattingStyle mIsBizHalfScreenStyle: %s, mReferInfo:%s", this.f215753e, this.f215754f);
            } catch (Exception e) {
                this.f215753e = Boolean.FALSE;
                Log.printErrStackTrace("MicroMsg.ChattingUI.ChattingBizHalfScreenComponent", e, "checkAndInitBizHalfScreenChattingStyle", new Object[0]);
            }
        }
    }

    /* renamed from: Z5 */
    public final int mo102356Z5(C104289g gVar, String str) {
        int i = 0;
        if (gVar == null || Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.ChattingUI.ChattingBizHalfScreenComponent", "getJsonIntValue param is illegal:" + str);
            return 0;
        }
        try {
            i = Integer.parseInt(gVar.optString(str));
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.ChattingUI.ChattingBizHalfScreenComponent", e, "getJsonIntValue", new Object[0]);
        }
        Log.m105924i("MicroMsg.ChattingUI.ChattingBizHalfScreenComponent", "getJsonIntValue key:" + str + ", value:" + i);
        return i;
    }

    /* renamed from: a */
    public boolean mo102357a() {
        mo102355Y5();
        if (this.f215753e.booleanValue()) {
            this.f215752d.f193286j.setMMTitle((int) C0966R.string.f8040ar);
        }
        return this.f215753e.booleanValue();
    }

    /* renamed from: a6 */
    public final String mo102358a6(C104289g gVar, String str) {
        if (gVar == null || Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.ChattingUI.ChattingBizHalfScreenComponent", "getJsonStringValue param is illegal:" + str);
            return "";
        }
        String optString = gVar.optString(str);
        Log.m105924i("MicroMsg.ChattingUI.ChattingBizHalfScreenComponent", "getJsonStringValue key:" + str + ", value:" + optString);
        return optString;
    }

    /* renamed from: b6 */
    public final void mo102359b6() {
        if (!Util.isNullOrNil(this.f215754f)) {
            try {
                C104289g gVar = new C104289g(this.f215754f);
                String a6 = mo102358a6(gVar, "biz");
                String a64 = mo102358a6(gVar, "mid");
                String a65 = mo102358a6(gVar, "idx");
                this.f215762q = mo102356Z5(gVar, "itemShowType");
                this.f215758j = mo102358a6(gVar, "pageUrl");
                this.f215759n = mo102358a6(gVar, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                this.f215760o = mo102358a6(gVar, "desc");
                this.f215761p = mo102358a6(gVar, "cover");
                this.f215755g = a6 + a64 + a65 + this.f215762q;
                this.f215757i = "<mppageidentity>" + "<bizid>" + a6 + "</bizid>" + "<mid>" + a64 + "</mid>" + "<idx>" + a65 + "</idx>" + "<itemshowtype>" + this.f215762q + "</itemshowtype>" + "</mppageidentity>";
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.ChattingUI.ChattingBizHalfScreenComponent", e, "", new Object[0]);
                this.f215755g = "";
                this.f215757i = "";
            }
        }
    }

    /* renamed from: c5 */
    public int mo102360c5() {
        mo102355Y5();
        if (this.f215753e.booleanValue()) {
            return C0966R.C0969drawable.a_v;
        }
        return 0;
    }

    /* renamed from: e */
    public void mo70065e() {
        mo102355Y5();
        ((C79140q) C86312j.m106911c(C79140q.class)).I50(this.f215755g, this.f215757i);
    }

    /* renamed from: h0 */
    public C72963f4 mo102361h0() {
        mo102355Y5();
        if (Util.isNullOrNil(this.f215754f) || this.f215756h || Util.isNullOrNil(this.f215754f)) {
            return null;
        }
        try {
            if (!((C79140q) C86312j.m106911c(C79140q.class)).mo108875EZ(this.f215755g)) {
                Log.m105925i("MicroMsg.ChattingUI.ChattingBizHalfScreenComponent", "generateReferMsgInfo do not autoGenerate referInfo, mArticleIdentity=%s", this.f215755g);
                return null;
            }
            C72963f4 f4Var = new C72963f4();
            f4Var.f212668G1 = this.f215755g;
            f4Var.f212669H1 = 1;
            f4Var.mo108745Y2(System.nanoTime());
            C68070l.C68072b bVar = new C68070l.C68072b();
            bVar.f195570f = this.f215759n;
            bVar.f195517O1 = this.f215760o;
            bVar.f195586j = this.f215758j;
            bVar.f195646y = this.f215761p;
            bVar.f195545Y = this.f215762q;
            bVar.f195582i = 5;
            f4Var.mo108732L2(C68070l.C68072b.m80420s(bVar, (String) null, (C98121d) null));
            f4Var.mo100991d(1);
            f4Var.mo108749c3(this.f215752d.mo91577r());
            f4Var.mo108733M2(C75604z3.m90843o(this.f215752d.mo91577r()));
            f4Var.mo108740T2(1);
            f4Var.setType(49);
            String B00 = ((C75710x0) C86312j.m106911c(C75710x0.class)).B00(f4Var);
            if (!Util.isNullOrNil(B00)) {
                f4Var.mo101012p4(B00);
            }
            long y2 = f4Var.mo108774y2();
            String str = this.f215761p;
            ((C8451i) C86312j.m106911c(C8451i.class)).bb0(str, false, new C73430b0(this, str, y2));
            Log.m105925i("MicroMsg.ChattingUI.ChattingBizHalfScreenComponent", "generateReferMsgInfo auto Generate referInfo,  referInfoKey=%s  pageUrl=%s, title=%s, desc=%s, cover=%s, msgSource=%s", this.f215755g, this.f215758j, this.f215759n, this.f215760o, this.f215761p, B00);
            this.f215756h = true;
            return f4Var;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.ChattingUI.ChattingBizHalfScreenComponent", e, "generateReferMsgInfo", new Object[0]);
            return null;
        }
    }

    /* renamed from: l2 */
    public void mo70047l2() {
        super.mo70047l2();
        Log.m105924i("MicroMsg.ChattingUI.ChattingBizHalfScreenComponent", "reset");
        this.f215757i = null;
        this.f215755g = null;
        this.f215754f = null;
        ((C79140q) C86312j.m106911c(C79140q.class)).reset();
    }

    /* renamed from: t0 */
    public boolean mo102362t0() {
        mo102355Y5();
        return this.f215753e.booleanValue();
    }

    /* renamed from: u2 */
    public void mo70142u2(C67391b bVar) {
        super.mo70142u2(bVar);
        mo102355Y5();
    }
}
