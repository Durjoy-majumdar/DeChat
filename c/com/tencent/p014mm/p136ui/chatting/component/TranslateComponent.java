package com.tencent.p014mm.p136ui.chatting.component;

import al3.C0086a;
import android.app.Activity;
import android.content.DialogInterface;
import android.view.MenuItem;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.TranslateMessageEvent;
import com.tencent.p014mm.autogen.events.TranslateMessageQueryStatusEvent;
import com.tencent.p014mm.autogen.events.TranslateMessageResultEvent;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.chatting.viewitems.ChattingItemTranslate;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.QueueWorkerThread;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import di3.C86312j;
import eb0.C75604z3;
import eb0.C97625j3;
import hp3.C87581a;
import java.util.HashMap;
import java.util.regex.Pattern;
import nj3.C76912y0;
import ob0.C89132b;
import p270xi.C91212b;
import p680ru.C77569h;
import qo3.C77389a;
import qo3.C77398g;
import te3.xj4;
import te3.yj4;
import zj3.C79350e1;
import zj3.C79368l;

@C91212b(exportInterface = C79350e1.class)
/* renamed from: com.tencent.mm.ui.chatting.component.TranslateComponent */
public class TranslateComponent extends C73412a implements C79350e1 {

    /* renamed from: e */
    public QueueWorkerThread f215691e = new QueueWorkerThread(5, "msg-translate-update-worker");

    /* renamed from: f */
    public HashMap<Long, ChattingItemTranslate.C73918e> f215692f = new HashMap<>();

    /* renamed from: g */
    public int f215693g = -1;

    /* renamed from: h */
    public boolean f215694h = false;

    /* renamed from: i */
    public boolean f215695i;

    /* renamed from: j */
    public int f215696j;

    /* renamed from: n */
    public IListener f215697n = new IListener<TranslateMessageResultEvent>(C40008f.f107254d) {
        {
            this.__eventId = -1739498572;
        }

        public boolean callback(IEvent iEvent) {
            TranslateMessageResultEvent translateMessageResultEvent = (TranslateMessageResultEvent) iEvent;
            if (translateMessageResultEvent instanceof TranslateMessageResultEvent) {
                TranslateMessageResultEvent.C92608a aVar = translateMessageResultEvent.f265243d;
                String str = aVar.f265247d;
                int i = aVar.f265244a;
                new MMHandler().postDelayed(new C73494h5(this, i, str), (long) (i == 5 ? 2000 : 0));
            }
            return false;
        }
    };

    /* renamed from: o */
    public Pattern f215698o = Pattern.compile("[a-zA-z]");

    /* renamed from: p */
    public Pattern f215699p = Pattern.compile("[一-龥]");

    /* renamed from: q */
    public int f215700q = -1;

    /* renamed from: com.tencent.mm.ui.chatting.component.TranslateComponent$a */
    public class C73398a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C72963f4 f215702d;

        /* renamed from: e */
        public final /* synthetic */ MenuItem f215703e;

        /* renamed from: f */
        public final /* synthetic */ int f215704f;

        public C73398a(C72963f4 f4Var, MenuItem menuItem, int i) {
            this.f215702d = f4Var;
            this.f215703e = menuItem;
            this.f215704f = i;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            TranslateComponent translateComponent = TranslateComponent.this;
            boolean z = true;
            translateComponent.f215694h = true;
            translateComponent.f215695i = false;
            translateComponent.f215696j = 0;
            C72963f4 f4Var = this.f215702d;
            int groupId = this.f215703e.getGroupId();
            if (this.f215704f != 125) {
                z = false;
            }
            translateComponent.mo102307Z5(f4Var, groupId, z);
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.TranslateComponent$b */
    public class C73399b implements C87581a<Object, C89132b.C89134c<yj4>> {
        public C73399b(TranslateComponent translateComponent) {
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            Log.m105925i("MicroMsg.ChattingUI.TranslateComponent", "TranslateMsgBadcase cgiBack, errType:%s, errCode:%s", Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256794b));
            return cVar;
        }
    }

    /* renamed from: G4 */
    public void mo26160G4() {
        this.f215695i = true;
        int i = this.f215693g;
        if (i >= 0) {
            mo102312d6(this.f215696j, 1, mo102310c6(i));
        }
    }

    /* renamed from: Q3 */
    public void mo102304Q3() {
        this.f215695i = true;
    }

    /* renamed from: S2 */
    public boolean mo102305S2(MenuItem menuItem, C72963f4 f4Var) {
        int i;
        int itemId = menuItem.getItemId();
        boolean z = false;
        if (itemId != 124 && itemId != 125) {
            return false;
        }
        Log.m105919d("MicroMsg.ChattingUI.TranslateComponent", "longclick transalte type: %d isShowTranslated: %s", Integer.valueOf(f4Var.getType()), Boolean.valueOf(f4Var.mo101006n3()));
        if (itemId != 124 || ((Boolean) C97625j3.m125812b().mo105906u().mo119684e(327712, Boolean.FALSE)).booleanValue()) {
            if (itemId != 125 || ((Boolean) C97625j3.m125812b().mo105906u().mo119684e(327713, Boolean.FALSE)).booleanValue()) {
                i = 0;
            } else if (!WeChatBrands.Business.Entries.ContextTranslate.checkAvailable(this.f215752d.mo91565f())) {
                return true;
            } else {
                i = C0966R.string.f360270bb3;
                C97625j3.m125812b().mo105906u().mo119676J(327713, Boolean.TRUE);
            }
        } else if (!WeChatBrands.Business.Entries.ContextTranslate.checkAvailable(this.f215752d.mo91565f())) {
            return true;
        } else {
            i = C0966R.string.bcf;
            C97625j3.m125812b().mo105906u().mo119676J(327712, Boolean.TRUE);
        }
        if (i != 0) {
            Activity context = this.f215752d.f193286j.getContext();
            C77389a aVar = new C77389a();
            aVar.f225660q = this.f215752d.mo91572m().getString(i);
            aVar.f225644a = this.f215752d.mo91572m().getString(C0966R.string.bcg);
            aVar.f225663t = C0086a.m38a(context).getString(C0966R.string.fmz);
            aVar.f225620C = new C73398a(f4Var, menuItem, itemId);
            C77398g gVar = new C77398g(context, C0966R.style.a66);
            gVar.mo107525e(aVar);
            gVar.show();
        } else {
            this.f215694h = true;
            this.f215695i = false;
            this.f215696j = 0;
            int groupId = menuItem.getGroupId();
            if (itemId == 125) {
                z = true;
            }
            mo102307Z5(f4Var, groupId, z);
        }
        return true;
    }

    /* renamed from: W5 */
    public void mo26189W5(View view, int i, int i2, int i3) {
        if (i < this.f215700q) {
            this.f215694h = false;
        }
        this.f215700q = i;
    }

    /* renamed from: Y5 */
    public void mo102306Y5(long j, ChattingItemTranslate.C73918e eVar) {
        this.f215692f.put(Long.valueOf(j), eVar);
    }

    /* renamed from: Z5 */
    public final void mo102307Z5(C72963f4 f4Var, int i, boolean z) {
        Class cls = C77569h.class;
        if (!f4Var.mo101015s3() || z) {
            ChattingItemTranslate.C73918e n4 = mo102314n4(f4Var);
            ChattingItemTranslate.C73918e eVar = ChattingItemTranslate.C73918e.Transforming;
            if (n4 != eVar) {
                TranslateMessageEvent translateMessageEvent = new TranslateMessageEvent();
                TranslateMessageEvent.C67800a aVar = translateMessageEvent.f193961d;
                aVar.getClass();
                aVar.f193963b = "" + f4Var.getMsgId();
                boolean w3 = f4Var.mo101020w3();
                translateMessageEvent.f193961d.f193962a = mo102308a6(f4Var);
                translateMessageEvent.f193961d.f193966e = f4Var.f230736T;
                if (!this.f215752d.mo91583x() || f4Var.mo108769t2() == 1) {
                    translateMessageEvent.f193961d.f193964c = 0;
                } else if (w3) {
                    translateMessageEvent.f193961d.f193964c = 0;
                } else {
                    translateMessageEvent.f193961d.f193964c = 1;
                }
                translateMessageEvent.f193961d.f193965d = this.f215752d.mo91577r();
                translateMessageEvent.publish();
                mo102306Y5(f4Var.getMsgId(), eVar);
                this.f215693g = i;
            } else {
                return;
            }
        } else {
            if (f4Var.mo101006n3()) {
                if (f4Var.mo101015s3()) {
                    f4Var.mo108743W2(f4Var.f230723F & -17);
                }
                mo102306Y5(f4Var.getMsgId(), ChattingItemTranslate.C73918e.NoTransform);
                ((C77569h) C86312j.m106911c(cls)).qx0(f4Var, false);
            } else {
                if (f4Var.mo101015s3()) {
                    f4Var.mo108743W2(f4Var.f230723F | 16);
                }
                mo102306Y5(f4Var.getMsgId(), ChattingItemTranslate.C73918e.Transformed);
                ((C77569h) C86312j.m106911c(cls)).qx0(f4Var, true);
            }
            ((C72972g4) C97625j3.m125812b().mo105911z()).xy0(f4Var.getMsgId(), f4Var);
            this.f215693g = -1;
        }
        this.f215752d.mo91540A();
    }

    /* renamed from: a6 */
    public final String mo102308a6(C72963f4 f4Var) {
        int indexOf;
        if (!f4Var.mo101020w3()) {
            return f4Var.getContent();
        }
        String content = f4Var.getContent();
        if (this.f215752d.mo91583x() && (indexOf = f4Var.getContent().indexOf(58)) != -1) {
            content = f4Var.getContent().substring(indexOf + 1);
        }
        if (content != null) {
            return C68070l.C68072b.m80422u(content, f4Var.mo108775z2()).f195570f;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001a, code lost:
        r0 = eb0.C75604z3.m90848t(r3);
     */
    /* renamed from: b6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo102309b6(java.lang.String r3) {
        /*
            r2 = this;
            ck3.b r0 = r2.f215752d
            boolean r0 = r0.mo91583x()
            if (r0 == 0) goto L_0x002b
            ck3.b r0 = r2.f215752d
            java.lang.Class<zj3.e> r1 = zj3.C79348e.class
            com.tencent.mm.ui.chatting.manager.a r0 = r0.f193278b
            xi.d r0 = r0.mo102812a(r1)
            zj3.e r0 = (zj3.C79348e) r0
            boolean r0 = r0.mo70071q1()
            if (r0 != 0) goto L_0x002b
            int r0 = eb0.C75604z3.m90848t(r3)
            r1 = -1
            if (r0 == r1) goto L_0x002b
            int r0 = r0 + 1
            java.lang.String r3 = r3.substring(r0)
            java.lang.String r3 = r3.trim()
        L_0x002b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.component.TranslateComponent.mo102309b6(java.lang.String):java.lang.String");
    }

    /* renamed from: c6 */
    public final int mo102310c6(int i) {
        C79368l lVar = (C79368l) this.f215752d.f193278b.mo102812a(C79368l.class);
        int i2 = 0;
        while (i2 <= 20 && mo102313e6(lVar.getItem(i + i2 + 1))) {
            i2++;
        }
        return i2;
    }

    /* renamed from: d5 */
    public boolean mo102311d5(C72963f4 f4Var) {
        if (f4Var == null) {
            return false;
        }
        C76912y0.m92773l(this.f215752d.mo91565f(), this.f215752d.mo91565f().getResources().getString(C0966R.string.ml6));
        xj4 xj4 = new xj4();
        xj4.f144712d = mo102309b6(mo102308a6(f4Var));
        xj4.f144713e = mo102309b6(f4Var.mo108727G2());
        xj4.f144714f = LocaleUtil.getCurrentLanguage(this.f215752d.mo91565f());
        xj4.mo73361b().mo9225i().mo123062e(new C73399b(this));
        return true;
    }

    /* renamed from: d6 */
    public final void mo102312d6(int i, int i2, int i3) {
        C115669n.INSTANCE.mo160131h(19168, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i + i3));
    }

    /* renamed from: e6 */
    public final boolean mo102313e6(C72963f4 f4Var) {
        if (f4Var == null) {
            return false;
        }
        if ((!f4Var.mo100993e4() && !f4Var.mo100987Z3()) || f4Var.mo101015s3() || f4Var.mo108769t2() != 0) {
            return false;
        }
        String content = f4Var.getContent();
        int indexOf = content.indexOf(58);
        if (indexOf != -1) {
            content = content.substring(indexOf + 1);
        }
        return LocaleUtil.isChineseAppLang() ? this.f215698o.matcher(content).find() : this.f215699p.matcher(content).find();
    }

    /* renamed from: g5 */
    public void mo70046g5() {
        this.f215692f.clear();
        this.f215697n.alive();
    }

    /* renamed from: l2 */
    public void mo70047l2() {
        super.mo70047l2();
        this.f215697n.dead();
    }

    /* renamed from: n4 */
    public ChattingItemTranslate.C73918e mo102314n4(C72963f4 f4Var) {
        ChattingItemTranslate.C73918e eVar = ChattingItemTranslate.C73918e.NoTransform;
        ChattingItemTranslate.C73918e eVar2 = this.f215692f.get(Long.valueOf(f4Var.getMsgId()));
        if (eVar2 != null) {
            return eVar2;
        }
        if (f4Var.mo101015s3()) {
            return f4Var.mo101006n3() ? ChattingItemTranslate.C73918e.Transformed : eVar;
        }
        TranslateMessageQueryStatusEvent translateMessageQueryStatusEvent = new TranslateMessageQueryStatusEvent();
        TranslateMessageQueryStatusEvent.C67801a aVar = translateMessageQueryStatusEvent.f193967d;
        aVar.f193969a = "" + f4Var.getMsgId();
        translateMessageQueryStatusEvent.publish();
        if (!translateMessageQueryStatusEvent.f193968e.f193970a) {
            return eVar;
        }
        ChattingItemTranslate.C73918e eVar3 = ChattingItemTranslate.C73918e.Transforming;
        mo102306Y5(f4Var.getMsgId(), eVar3);
        return eVar3;
    }

    /* renamed from: u5 */
    public void mo26170u5() {
        this.f215697n.dead();
    }

    /* renamed from: z */
    public String mo102315z(C72963f4 f4Var, boolean z) {
        if (z) {
            String G2 = f4Var.mo108727G2();
            return (!this.f215752d.mo91582w() || G2 == null || f4Var.mo108769t2() != 0) ? G2 : C75604z3.m90849u(G2);
        }
        String content = f4Var.getContent();
        return (!this.f215752d.mo91582w() || content == null || f4Var.mo108769t2() != 0) ? content : C75604z3.m90849u(content);
    }
}
