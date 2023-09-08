package com.tencent.p014mm.p136ui.transmit;

import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.SendMsgEvent;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.message.C80995a;
import com.tencent.p014mm.p136ui.chatting.C97182r4;
import com.tencent.p014mm.p136ui.contact.C44885y3;
import com.tencent.p014mm.p136ui.transmit.MsgRetransmitUI;
import com.tencent.p014mm.pluginsdk.model.app.C72683d;
import com.tencent.p014mm.pluginsdk.model.app.C72695v;
import com.tencent.p014mm.pluginsdk.model.app.C72709y1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sendtowework.WeWorkBufferMessage;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.wework.api.IWWAPI;
import com.tencent.wework.api.WWAPIFactory;
import com.tencent.wework.api.model.WWMediaBufferMessage;
import d62.C97425j;
import di3.C86301e;
import di3.C86312j;
import eb0.C116756s5;
import eb0.C45628s0;
import eb0.C75592q0;
import eb0.C97625j3;
import ei3.C86522b;
import f40.C86709a0;
import gu3.C107916a;
import gu3.C107917d;
import java.util.ArrayList;
import java.util.List;
import je0.C9292j;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p763ym.C79140q;
import p910lj.C76701a;
import pc0.C100760a0;
import pc0.C100765f;
import te3.C48681a90;
import te3.C50297lq1;
import te3.C50954qg;
import te3.C52230z80;
import te3.tc4;
import zt3.C119157j;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: com.tencent.mm.ui.transmit.l */
public class C97264l extends C86301e implements C97425j {

    /* renamed from: com.tencent.mm.ui.transmit.l$a */
    public class C97265a implements C107916a<Context, Object> {
        public C97265a(C97264l lVar) {
        }

        /* renamed from: a */
        public Object mo63988a(Object obj) {
            C76701a.makeText((Context) obj, (int) C0966R.string.gxi, 1).show();
            return null;
        }
    }

    /* renamed from: com.tencent.mm.ui.transmit.l$b */
    public class C97266b implements C107916a<Context, Dialog> {

        /* renamed from: a */
        public final /* synthetic */ MsgRetransmitUI.C97251g f285474a;

        public C97266b(C97264l lVar, MsgRetransmitUI.C97251g gVar) {
            this.f285474a = gVar;
        }

        /* renamed from: a */
        public Object mo63988a(Object obj) {
            Context context = (Context) obj;
            return C76879j.m92723Q(context, context.getResources().getString(C0966R.string.a3h), context.getResources().getString(C0966R.string.a2w), true, true, new C97272m(this));
        }
    }

    /* renamed from: com.tencent.mm.ui.transmit.l$c */
    public class C97267c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Context f285475d;

        public C97267c(C97264l lVar, Context context) {
            this.f285475d = context;
        }

        public void run() {
            C76701a.makeText(this.f285475d, (int) C0966R.string.gxi, 1).show();
        }
    }

    /* renamed from: com.tencent.mm.ui.transmit.l$d */
    public class C97268d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Context f285476d;

        public C97268d(C97264l lVar, Context context) {
            this.f285476d = context;
        }

        public void run() {
            C76701a.makeText(this.f285476d, (int) C0966R.string.gxi, 1).show();
        }
    }

    /* renamed from: com.tencent.mm.ui.transmit.l$e */
    public class C97269e implements C11385n {

        /* renamed from: d */
        public final /* synthetic */ Context f285477d;

        /* renamed from: e */
        public final /* synthetic */ C97425j.C58242a f285478e;

        public C97269e(C97264l lVar, Context context, C97425j.C58242a aVar) {
            this.f285477d = context;
            this.f285478e = aVar;
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            C52230z80 z802;
            C97625j3.m125815e().mo123470p(yVar.getType(), this);
            if (i != 0 || i2 != 0) {
                this.f285478e.mo9025a(i, i2, (List<C48681a90>) null);
            } else if ((yVar instanceof C9292j) && (z802 = ((C9292j) yVar).f29057g) != null) {
                Context context = this.f285477d;
                WeWorkBufferMessage weWorkBufferMessage = new WeWorkBufferMessage(z802.f145753e.f257327a);
                WWMediaBufferMessage wWMediaBufferMessage = new WWMediaBufferMessage();
                wWMediaBufferMessage.f285802f = weWorkBufferMessage.f283925d;
                WWAPIFactory.m125312a(context).mo136603a(wWMediaBufferMessage, IWWAPI.WWAppType.WwAppTypeWxwork);
                this.f285478e.mo9025a(i, i2, z802.f145752d);
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.transmit.l$f */
    public class C97270f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Context f285479d;

        /* renamed from: e */
        public final /* synthetic */ C97425j.C58243b f285480e;

        /* renamed from: com.tencent.mm.ui.transmit.l$f$a */
        public class C97271a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ boolean f285481d;

            /* renamed from: e */
            public final /* synthetic */ boolean f285482e;

            public C97271a(boolean z, boolean z2) {
                this.f285481d = z;
                this.f285482e = z2;
            }

            public void run() {
                C97270f.this.f285480e.mo8896a(this.f285481d && this.f285482e);
            }
        }

        public C97270f(C97264l lVar, Context context, C97425j.C58243b bVar) {
            this.f285479d = context;
            this.f285480e = bVar;
        }

        public void run() {
            boolean d = C97182r4.m125141d(this.f285479d);
            Log.m105925i("MicroMsg.SendToWeWorkHelper", "isSupportForwardToWeWork: isSupportMultiMsgForward:%s", Boolean.valueOf(d));
            Context context = this.f285479d;
            long currentTimeMillis = System.currentTimeMillis();
            boolean c = WWAPIFactory.m125312a(context).mo136605c();
            Log.m105925i("MicroMsg.SendToWeWorkHelper", "isSupportBufferMsgForward:%s costTime:%s", Boolean.valueOf(c), Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            Log.m105925i("MicroMsg.SendMsgMgr", "isSupportForwardToWeWork: isSupportForwardToWeWork:%s isSupportBufferMsgForward:%s", Boolean.valueOf(d), Boolean.valueOf(c));
            ((C119157j) C119157j.f356862d).mo183895z(new C97271a(c, d));
        }
    }

    /* renamed from: Ar */
    public void mo136252Ar(String str, String str2) {
        ((C79140q) C86312j.m106911c(C79140q.class)).Vf0();
        ArrayList<String> stringsToList = Util.stringsToList(Util.nullAs(str2, "").split(","));
        if (!TextUtils.isEmpty(str)) {
            for (String next : stringsToList) {
                SendMsgEvent sendMsgEvent = new SendMsgEvent();
                SendMsgEvent.C1132a aVar = sendMsgEvent.f9496d;
                aVar.f9497a = next;
                aVar.f9498b = str;
                aVar.f9499c = C45628s0.m50810y(next);
                sendMsgEvent.f9496d.f9500d = 0;
                sendMsgEvent.publish();
            }
        }
    }

    /* renamed from: Fd */
    public void mo136253Fd(Context context, String str, String str2, int i, String str3, String str4, String str5, C100765f fVar) {
        if (str == null || str2 == null) {
            Log.m105929w("MicroMsg.SendMsgMgr", "sendImg: args error, toUser[%s], fileName[%s]", str, str2);
        } else if (!C97625j3.m125812b().mo105883I()) {
            Log.m105928w("MicroMsg.SendMsgMgr", "sdcard not ready, send video fail");
            MMHandlerThread.postToMainThread(new C97267c(this, context));
        } else {
            String s = C75592q0.m90789s();
            ((C79140q) C86312j.m106911c(C79140q.class)).Vf0();
            C100760a0.C100764f b = C100760a0.m131932b(C100760a0.C100763e.IMAGE);
            b.f295195i = 4;
            b.f295188b = s;
            b.f295187a = str;
            b.f295196j = str2;
            b.f295197k = i;
            b.f295198l = null;
            b.f295200n = 0;
            b.f295204r = str4;
            b.f295205s = str5;
            b.f295202p = true;
            b.f295201o = C0966R.C0969drawable.by8;
            if (fVar == null) {
                fVar = new C100765f();
            }
            b.f295206t = fVar;
            b.f295185A = str3;
            b.f295194h = 19;
            b.mo140195a().mo123694a();
            C116756s5.m164691d().mo180727a(C116756s5.f350054c, (Object[]) null);
        }
    }

    public void Ml0(Context context, String str, String str2, String str3, int i, int i2, boolean z, boolean z2, String str4, String str5) {
        wx0(context, str, str2, str3, i, i2, (tc4) null, z, z2, str4, str5, (C97425j.C86198c) null);
    }

    /* renamed from: QA */
    public void mo136255QA(String str, String str2, int i, int i2, long j) {
        if (str == null || str2 == null) {
            Log.m105929w("MicroMsg.SendMsgMgr", "send msg args error, toUser[%s] content[%s]", str, str2);
            return;
        }
        ((C79140q) C86312j.m106911c(C79140q.class)).Vf0();
        C100760a0.C100764f a = C100760a0.m131931a(str);
        a.f295187a = str;
        a.f295189c = str2;
        a.f295190d = i;
        a.f295191e = i2;
        a.f295194h = 4;
        C100765f fVar = new C100765f();
        fVar.f295214b = j;
        a.f295206t = fVar;
        C100760a0.C89338b a2 = a.mo140195a();
        a2.mo123694a();
        MsgRetransmitUI.m125192X7(a2, str, -1L);
    }

    /* renamed from: TG */
    public void mo136256TG(Context context, String str, String str2, int i, String str3, String str4, C100765f fVar) {
        if (str == null || str2 == null) {
            Log.m105929w("MicroMsg.SendMsgMgr", "sendImg: args error, toUser[%s], fileName[%s]", str, str2);
        } else if (!C97625j3.m125812b().mo105883I()) {
            Log.m105928w("MicroMsg.SendMsgMgr", "sdcard not ready, send video fail");
            MMHandlerThread.postToMainThread(new C97268d(this, context));
        } else {
            String s = C75592q0.m90789s();
            ((C79140q) C86312j.m106911c(C79140q.class)).Vf0();
            C100760a0.C100764f b = C100760a0.m131932b(C100760a0.C100763e.IMAGE);
            b.f295195i = 4;
            b.f295188b = s;
            b.f295187a = str;
            b.f295196j = str2;
            b.f295197k = i;
            b.f295198l = null;
            b.f295200n = 0;
            b.f295204r = str3;
            b.f295205s = str4;
            b.f295202p = true;
            b.f295201o = C0966R.C0969drawable.by8;
            if (fVar == null) {
                fVar = new C100765f();
            }
            b.f295206t = fVar;
            b.f295194h = 13;
            C100760a0.C89338b a = b.mo140195a();
            MsgRetransmitUI.m125192X7(a, str, -1L);
            a.mo123694a();
            C116756s5.m164691d().mo180727a(C116756s5.f350054c, (Object[]) null);
        }
    }

    /* renamed from: Tm */
    public void mo136257Tm(String str, String str2, int i, int i2) {
        mo136255QA(str, str2, i, i2, 0);
    }

    /* renamed from: Vg */
    public void mo136258Vg(Context context, C97425j.C58243b bVar) {
        ((C119157j) C119157j.f356862d).mo183875f(new C97270f(this, context, bVar));
    }

    public void Y50(String str, String str2, boolean z) {
        nw0(str, str2, z, (C50954qg) null);
    }

    public void Ys0(String str, String str2, String str3, boolean z) {
        ((C79140q) C86312j.m106911c(C79140q.class)).Vf0();
        int i = 66;
        if (z) {
            String nullAs = Util.nullAs(str2, "");
            C100760a0.C100764f a = C100760a0.m131931a(nullAs);
            a.f295187a = nullAs;
            a.f295189c = str3;
            if (!C72996z1.m85843n5(str)) {
                i = 42;
            }
            a.f295190d = i;
            a.f295191e = 0;
            a.f295194h = 4;
            a.mo140195a().mo123694a();
            return;
        }
        ArrayList<String> stringsToList = Util.stringsToList(Util.nullAs(str2, "").split(","));
        for (int i2 = 0; i2 < stringsToList.size(); i2++) {
            String str4 = stringsToList.get(i2);
            C100760a0.C100764f a2 = C100760a0.m131931a(str4);
            a2.f295187a = str4;
            a2.f295189c = str3;
            a2.f295190d = C72996z1.m85843n5(str) ? 66 : 42;
            a2.f295191e = 0;
            a2.f295194h = 4;
            a2.mo140195a().mo123694a();
        }
    }

    public void Zv0(Context context, String str, String str2, String str3, int i, int i2, boolean z, boolean z2, String str4, String str5, long j) {
        vx0(context, str, str2, str3, i, i2, (tc4) null, z, z2, str4, str5, j, (C97425j.C86198c) null);
    }

    /* renamed from: bz */
    public void mo136262bz(Context context, String str, String str2, String str3, int i, int i2, tc4 tc4, boolean z, boolean z2, String str4, String str5, long j) {
        vx0(context, str, str2, str3, i, i2, tc4, z, z2, str4, str5, j, (C97425j.C86198c) null);
    }

    public void nw0(String str, String str2, boolean z, C50954qg qgVar) {
        ((C79140q) C86312j.m106911c(C79140q.class)).Vf0();
        int i = 66;
        if (z) {
            String nullAs = Util.nullAs(str2, "");
            String a = C44885y3.m49774a(str, qgVar);
            C100760a0.C100764f a2 = C100760a0.m131931a(nullAs);
            a2.f295187a = nullAs;
            a2.f295189c = a;
            if (!C72996z1.m85843n5(str)) {
                i = 42;
            }
            a2.f295190d = i;
            a2.f295191e = 0;
            a2.f295194h = 4;
            a2.mo140195a().mo123694a();
            return;
        }
        ArrayList<String> stringsToList = Util.stringsToList(Util.nullAs(str2, "").split(","));
        String a3 = C44885y3.m49774a(str, qgVar);
        for (int i2 = 0; i2 < stringsToList.size(); i2++) {
            String str3 = stringsToList.get(i2);
            C100760a0.C100764f a4 = C100760a0.m131931a(str3);
            a4.f295187a = str3;
            a4.f295189c = a3;
            a4.f295190d = C72996z1.m85843n5(str) ? 66 : 42;
            a4.f295191e = 0;
            a4.f295194h = 4;
            a4.mo140195a().mo123694a();
        }
    }

    public void pd0(String str, byte[] bArr, String str2, String str3) {
        mo136265uM(str, bArr, str2, str3, (String) null, 0);
    }

    /* renamed from: uM */
    public void mo136265uM(String str, byte[] bArr, String str2, String str3, String str4, long j) {
        String str5;
        String str6 = str;
        if (str6 == null) {
            Log.m105928w("MicroMsg.SendMsgMgr", "sendAppMsg: args error, toUser is null");
            return;
        }
        Log.m105927v("MicroMsg.SendMsgMgr", "for track bug sendAppMsg %s", str2);
        C72683d dVar = null;
        C68070l.C68072b u = C68070l.C68072b.m80422u(Util.processXml(str2), (String) null);
        if (u == null) {
            Log.m105928w("MicroMsg.SendMsgMgr", "send: parse app msg content return null");
            return;
        }
        ((C79140q) C86312j.m106911c(C79140q.class)).Vf0();
        C72683d dVar2 = new C72683d();
        Log.m105925i("MicroMsg.SendMsgMgr", "content.attachid %s", u.f195606o);
        if (!Util.isNullOrNil(u.f195606o)) {
            long j2 = Util.getLong(u.f195606o, -1);
            if (j2 != -1) {
                C72709y1.vx0().get(j2, dVar2);
                if (dVar2.systemRowid != j2) {
                    C72683d qq = C72709y1.vx0().mo100154qq(u.f195606o);
                    if (qq != null && qq.field_mediaSvrId.equals(u.f195606o)) {
                        dVar = qq;
                    }
                    if (dVar == null) {
                        Log.m105925i("MicroMsg.SendMsgMgr", "appAttachInfo1  %s", u.f195606o);
                    } else {
                        Log.m105925i("MicroMsg.SendMsgMgr", "appAttachInfo2  %s : %s : %s", u.f195606o, Long.valueOf(dVar.systemRowid), dVar.field_fileFullPath);
                    }
                }
            } else {
                C72683d qq4 = C72709y1.vx0().mo100154qq(u.f195606o);
                if (qq4 != null && qq4.field_mediaSvrId.equals(u.f195606o)) {
                    dVar = qq4;
                }
                if (dVar == null) {
                    Log.m105925i("MicroMsg.SendMsgMgr", "appAttachInfo3  %s", u.f195606o);
                } else {
                    Log.m105925i("MicroMsg.SendMsgMgr", "appAttachInfo4  %s : %s : %s", u.f195606o, Long.valueOf(dVar.systemRowid), dVar.field_fileFullPath);
                }
            }
            dVar2 = dVar;
        }
        String str7 = "";
        if (!(dVar2 == null || (str5 = dVar2.field_fileFullPath) == null || str5.equals(str7))) {
            str7 = C72695v.m85063e(C97625j3.m125812b().mo105889d(), u.f195570f, u.f195602n);
            C86013q1.m106442c(dVar2.field_fileFullPath, str7);
            String str8 = dVar2.field_fileFullPath;
            Log.m105925i("MicroMsg.SendMsgMgr", "copy from src %s to dest %s size: %s", str8, str7, Long.valueOf(C86013q1.m106451l(str8)));
        }
        C68070l.C68072b i = C68070l.C68072b.m80418i(u);
        i.f195618r = 3;
        C80995a aVar = (C80995a) i.mo93555w(C80995a.class);
        if (aVar != null) {
            aVar.f237892I = false;
        }
        MsgRetransmitUI.m125191W7((Long) C72695v.m85054G(i, u.f195562d, u.f195484F, str, str7, bArr, str3, "", str4, j).second, str6, -1L);
    }

    public final void vx0(Context context, String str, String str2, String str3, int i, int i2, tc4 tc4, boolean z, boolean z2, String str4, String str5, long j, C97425j.C86198c cVar) {
        Context context2 = context;
        String str6 = str;
        String str7 = str2;
        int i3 = i;
        if (context2 == null) {
            Log.m105928w("MicroMsg.SendMsgMgr", "send vedio context is null");
            return;
        }
        int i4 = 1;
        if (str6 == null || str7 == null) {
            Log.m105929w("MicroMsg.SendMsgMgr", "send vedio args error, toUser[%s] fileName[%s]", str6, str7);
        } else if (!C97625j3.m125812b().mo105883I()) {
            Log.m105928w("MicroMsg.SendMsgMgr", "sdcard not ready, send video fail");
            C107917d dVar = new C107917d(context);
            dVar.f323124b = C107917d.f323121j;
            dVar.mo158345f(new C97265a(this));
        } else {
            ((C79140q) C86312j.m106911c(C79140q.class)).Vf0();
            MsgRetransmitUI.C97251g gVar = new MsgRetransmitUI.C97251g();
            C107917d dVar2 = new C107917d(context);
            dVar2.f323124b = C107917d.f323121j;
            gVar.f285415b = context2;
            gVar.f285420g = str7;
            gVar.f285421h = str3;
            gVar.f285414a = (Dialog) dVar2.mo158345f(new C97266b(this, gVar)).mo158346g();
            gVar.f285422i = str6;
            gVar.f285423j = str4;
            gVar.f285427n = z;
            if (62 == i3) {
                gVar.f285419f = 11;
            }
            if (i3 <= 0) {
                i4 = 0;
            }
            gVar.f285417d = i4;
            gVar.f285418e = i2;
            gVar.f285424k = z2;
            gVar.f285428o = tc4;
            gVar.f285432s = str5;
            gVar.f285435v = cVar;
            gVar.f285431r = j;
            gVar.execute(new Object[0]);
        }
    }

    public void wi0(Context context, List<C50297lq1> list, C97425j.C58242a aVar) {
        C9292j jVar = new C9292j(list);
        C86709a0.m107524d().mo123455a(9146, new C97269e(this, context, aVar));
        C86709a0.m107524d().mo123460f(jVar);
    }

    public final void wx0(Context context, String str, String str2, String str3, int i, int i2, tc4 tc4, boolean z, boolean z2, String str4, String str5, C97425j.C86198c cVar) {
        vx0(context, str, str2, str3, i, i2, tc4, z, z2, str4, str5, 0, cVar);
    }

    public void ze0(Context context, String str, String str2, String str3, int i, int i2, boolean z, boolean z2, String str4, String str5, C97425j.C86198c cVar) {
        wx0(context, str, str2, str3, i, i2, (tc4) null, z, z2, str4, str5, cVar);
    }
}
