package com.tencent.p014mm.plugin.record.p094ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.DoFavoriteEvent;
import com.tencent.p014mm.autogen.events.RevokeHistoryInjoinRoomMsgEvent;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.modelcdntran.C92795s;
import com.tencent.p014mm.pluginsdk.model.C96787m0;
import com.tencent.p014mm.pluginsdk.model.app.C72709y1;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import di3.C86312j;
import eb0.C97625j3;
import f40.C86709a0;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import l31.C61212e;
import nj3.C76879j;
import o31.C11345b;
import og2.C100336e;
import p663qo.C63287k;
import qg2.C101136b0;
import qg2.C101147j0;
import qg2.C62618v0;
import qg2.C77335p;
import qo3.C89779i0;
import te3.C101834rc0;
import te3.C101846tc0;
import te3.C77915dp3;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.record.ui.RecordMsgDetailUI */
public class RecordMsgDetailUI extends RecordMsgBaseUI {

    /* renamed from: G */
    public static final /* synthetic */ int f272546G = 0;

    /* renamed from: A */
    public String f272547A = "";

    /* renamed from: B */
    public C89779i0 f272548B = null;

    /* renamed from: C */
    public TranslateHelper f272549C;

    /* renamed from: D */
    public boolean f272550D;

    /* renamed from: E */
    public IListener<RevokeHistoryInjoinRoomMsgEvent> f272551E = new IListener<RevokeHistoryInjoinRoomMsgEvent>(C40008f.f107254d) {
        {
            this.__eventId = 477570721;
        }

        public boolean callback(IEvent iEvent) {
            RevokeHistoryInjoinRoomMsgEvent revokeHistoryInjoinRoomMsgEvent = (RevokeHistoryInjoinRoomMsgEvent) iEvent;
            if ((revokeHistoryInjoinRoomMsgEvent instanceof RevokeHistoryInjoinRoomMsgEvent) && Util.isEqual(revokeHistoryInjoinRoomMsgEvent.f78941d.f78942a, RecordMsgDetailUI.this.f272555u)) {
                Log.m105925i("MicroMsg.RecordMsgDetailUI", "msg(%s) history revoked", Long.valueOf(RecordMsgDetailUI.this.f272555u));
                ((C119157j) C119157j.f356862d).mo183895z(new C94364j(this));
            }
            return true;
        }
    };

    /* renamed from: F */
    public C92795s f272552F = new RecordMsgDetailUI$$a(this);

    /* renamed from: s */
    public C77915dp3 f272553s = null;

    /* renamed from: t */
    public C72963f4 f272554t;

    /* renamed from: u */
    public long f272555u = -1;

    /* renamed from: v */
    public String f272556v = null;

    /* renamed from: w */
    public boolean f272557w = true;

    /* renamed from: x */
    public boolean f272558x = false;

    /* renamed from: y */
    public String f272559y = "";

    /* renamed from: z */
    public String f272560z = "";

    /* renamed from: L7 */
    public C94356i mo129657L7() {
        C94353f fVar = new C94353f(this, new C94355h());
        fVar.f272707y = getIntent().getIntExtra("from_scene", 0);
        fVar.f272725v = getIntent().getStringExtra("msgUsername");
        fVar.f272710d = getIntent().getIntExtra("chatTypeForAppbrand", -1);
        fVar.f272711e = getIntent().getStringExtra("preChatName");
        String stringExtra = getIntent().getStringExtra("serverMsgID");
        if (Util.isNullOrNil(stringExtra)) {
            String stringExtra2 = getIntent().getStringExtra("prePublishId");
            if (!Util.isNullOrNil(stringExtra2)) {
                stringExtra = stringExtra2.replace("msg_", "");
            }
        }
        fVar.f272726w = stringExtra;
        return fVar;
    }

    /* renamed from: M7 */
    public String mo129658M7() {
        return this.f272547A;
    }

    /* renamed from: N7 */
    public String mo129659N7() {
        return this.f272560z;
    }

    /* renamed from: O7 */
    public String mo129660O7() {
        return this.f272559y;
    }

    /* renamed from: P7 */
    public void mo129661P7() {
        this.f272555u = getIntent().getLongExtra("message_id", -1);
        this.f272556v = getIntent().getStringExtra("record_xml");
        this.f272557w = getIntent().getBooleanExtra("record_show_share", true);
        this.f272558x = getIntent().getBooleanExtra("big_appmsg", false);
        this.f272550D = getIntent().getBooleanExtra("record_nest", false);
        if (Util.isNullOrNil(getIntent().getStringExtra("pre_username"))) {
            getIntent().getStringExtra("msgUsername");
        }
        getIntent().getStringExtra("serverMsgID");
        this.f272553s = C101147j0.m132643x(this.f272556v);
        C72963f4 b002 = ((C72972g4) C97625j3.m125812b().mo105911z()).b00(this.f272555u);
        this.f272554t = b002;
        C68070l.C68072b u = C68070l.C68072b.m80422u(b002.getContent(), this.f272554t.mo108775z2());
        if (u != null && this.f272553s == null) {
            this.f272553s = C101147j0.m132643x(u.f195571f0);
        }
        C77915dp3 dp32 = this.f272553s;
        if (dp32 != null) {
            if (mo129675T7(dp32) != null) {
                this.f272559y = mo129675T7(this.f272553s);
            } else {
                this.f272559y = this.f272553s.f227153d;
            }
            if (!Util.isNullOrNil((List) this.f272553s.f227155f)) {
                this.f272560z = this.f272553s.f227155f.getFirst().f299302f1;
                this.f272547A = this.f272553s.f227155f.getLast().f299302f1;
            }
        } else if (!(this.f272554t == null || u == null)) {
            this.f272559y = u.f195570f;
            this.f272548B = C89779i0.m112248e(this, getString(C0966R.string.gas), true, 0, (DialogInterface.OnCancelListener) null);
            Log.m105924i("MicroMsg.RecordMsgDetailUI", "loading");
        }
        if (this.f272553s == null) {
            mo129670R7();
            setBackBtn(new RecordMsgDetailUI$$b(this));
            if (this.f272558x && C72709y1.vx0().mo100150Yt(this.f272555u) != null) {
                C97625j3.m125815e().mo123460f(new C77335p(this.f272555u, ((C72972g4) C97625j3.m125812b().mo105911z()).b00(this.f272555u).mo108774y2(), u != null ? u.f195582i : 0, new RecordMsgDetailUI$$c(this), true));
                return;
            }
            return;
        }
        mo129676U7();
    }

    /* renamed from: Q7 */
    public void mo129662Q7(int i, int i2, Intent intent) {
        int i3 = i;
        Intent intent2 = intent;
        if (-1 != i2) {
            Log.m105921e("MicroMsg.RecordMsgDetailUI", "processResult %d", Integer.valueOf(i2));
        } else if (1001 == i3) {
            String str = null;
            String stringExtra = intent2 == null ? null : intent2.getStringExtra("Select_Conv_User");
            if (intent2 != null) {
                str = intent2.getStringExtra("custom_send_text");
            }
            String str2 = str;
            if (Util.isNullOrNil(stringExtra)) {
                Log.m105928w("MicroMsg.RecordMsgDetailUI", "want to send record msg, but toUser is null");
                return;
            }
            C72963f4 b002 = ((C72972g4) C97625j3.m125812b().mo105911z()).b00(this.f272555u);
            if (b002.getMsgId() != this.f272555u) {
                Log.m105928w("MicroMsg.RecordMsgDetailUI", "want to send record msg, but message info is null");
            } else {
                C86709a0.m107525e().postToWorker(new RecordMsgDetailUI$$e(this, stringExtra, str2, b002, C76879j.m92723Q(getContext(), "", getString(C0966R.string.col), true, false, (DialogInterface.OnCancelListener) null)));
            }
        } else if (1002 == i3 && intent2.getBooleanExtra("kfavorite", false)) {
            DoFavoriteEvent doFavoriteEvent = new DoFavoriteEvent();
            C96787m0.m124257k(doFavoriteEvent, intent2);
            DoFavoriteEvent.C92474a aVar = doFavoriteEvent.f264674d;
            aVar.f264684i = this;
            aVar.f264688m = 8;
            doFavoriteEvent.publish();
        }
    }

    /* renamed from: S7 */
    public void mo129663S7() {
        if (this.f272557w) {
            addIconOptionMenu(0, C0966R.raw.icons_outlined_more, new RecordMsgDetailUI$$d(this));
        }
    }

    /* renamed from: T7 */
    public final String mo129675T7(C77915dp3 dp32) {
        String str = null;
        if (dp32 == null) {
            return null;
        }
        Iterator<C101834rc0> it = dp32.f227155f.iterator();
        String str2 = null;
        String str3 = null;
        boolean z = false;
        while (it.hasNext()) {
            C101834rc0 next = it.next();
            C101846tc0 tc02 = next.f299296c1.f299405d;
            if (tc02.f299525o != null) {
                str3 = getContext().getString(C0966R.string.htm);
                z = true;
            } else if (tc02.f299519f != null) {
                if (str == null) {
                    str = next.f299298d1;
                } else {
                    String str4 = next.f299298d1;
                    if (str != str4) {
                        str2 = str4;
                    }
                }
            }
        }
        if (str != null && str2 == null && !z) {
            return getContext().getString(C0966R.string.cq9, new Object[]{str});
        } else if (str == null || str2 == null || str.equals(str2) || z) {
            return str3;
        } else {
            return getContext().getString(C0966R.string.cq8, new Object[]{str, str2});
        }
    }

    /* renamed from: U7 */
    public final void mo129676U7() {
        C94354g gVar = new C94354g();
        C77915dp3 dp32 = this.f272553s;
        if (dp32 != null) {
            gVar.f272698a = dp32.f227155f;
        }
        gVar.f272708c = this.f272555u;
        gVar.f272709d = this.f272556v;
        gVar.f272699b = new C62618v0();
        C72963f4 f4Var = this.f272554t;
        if (!(f4Var == null || this.f272550D || f4Var.mo108727G2() == null)) {
            try {
                gVar.f272699b.parseFrom(this.f272554t.mo108727G2().getBytes(Charset.forName("UTF-8")));
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.RecordMsgDetailUI", e, "", new Object[0]);
            }
        }
        super.mo129661P7();
        this.f272537n.mo129741h(gVar);
        TranslateHelper translateHelper = new TranslateHelper(this, this.f272537n, gVar);
        this.f272549C = translateHelper;
        this.f272537n.f272723t = translateHelper;
        ((C101136b0) ((C100336e) C86312j.m106911c(C100336e.class)).mo139410hi()).mo140583jo((C94353f) this.f272537n);
        ((C63287k) C86312j.m106911c(C63287k.class)).mo88185wy(this.f272552F);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f272551E.alive();
        ((C61212e) C86312j.m106911c(C61212e.class)).mo86178qr(this, C11345b.RecordMsgDetailUI);
    }

    public void onDestroy() {
        C72963f4 f4Var;
        Class cls = C63287k.class;
        super.onDestroy();
        this.f272551E.dead();
        ((C101136b0) ((C100336e) C86312j.m106911c(C100336e.class)).mo139410hi()).mo140582bD((C94353f) this.f272537n);
        ((C63287k) C86312j.m106911c(cls)).mo88181kj(this.f272552F);
        ((C63287k) C86312j.m106911c(cls)).mo88186yO();
        TranslateHelper translateHelper = this.f272549C;
        if (translateHelper != null) {
            byte[] b = translateHelper.mo129733b();
            if (!this.f272550D && (f4Var = this.f272554t) != null && b != null && b.length > 0) {
                f4Var.mo108758i3(new String(b, Charset.forName("UTF-8")));
                ((C72972g4) C97625j3.m125812b().mo105911z()).xy0(this.f272555u, this.f272554t);
            }
        }
    }

    public void onPause() {
        super.onPause();
        TranslateHelper translateHelper = this.f272549C;
        if (translateHelper != null) {
            translateHelper.f272693d = false;
        }
    }
}
