package com.tencent.p014mm.p136ui.transmit;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.AsyncTask;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bp3.C104160f;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.AppBrandOuterMenuClickReportEvent;
import com.tencent.p014mm.autogen.events.ForwardUpdateMsgIdEvent;
import com.tencent.p014mm.autogen.events.SendMsgEvent;
import com.tencent.p014mm.autogen.events.SnsForwardFeedToChatRoomForDataReportEvent;
import com.tencent.p014mm.autogen.events.SnsForwardFeedToSingleChatForDataReportEvent;
import com.tencent.p014mm.autogen.events.WxFileIndexDirtyEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.MultiMessageForwardStruct;
import com.tencent.p014mm.graphics.MMBitmapFactory;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.message.C80995a;
import com.tencent.p014mm.modelimage.C92809c0;
import com.tencent.p014mm.modelimage.C92822e;
import com.tencent.p014mm.modelimage.C92836k;
import com.tencent.p014mm.modelimage.C92839m;
import com.tencent.p014mm.network.C114786m0;
import com.tencent.p014mm.opensdk.constants.ConstantsAPI;
import com.tencent.p014mm.opensdk.modelmsg.SendMessageToWX;
import com.tencent.p014mm.opensdk.modelmsg.WXEmojiObject;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.p136ui.MMBaseActivity;
import com.tencent.p014mm.p136ui.chatting.C73304a;
import com.tencent.p014mm.p136ui.chatting.C73687g1;
import com.tencent.p014mm.p136ui.chatting.C74343y0;
import com.tencent.p014mm.p136ui.chatting.ChattingUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.model.C96790t0;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.pluginsdk.model.app.C72695v;
import com.tencent.p014mm.pluginsdk.model.app.C72709y1;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C72915l;
import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.pointers.PString;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.DoNotCheckLeakForActivities;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;
import com.tencent.xweb.file.XVFSFile;
import d62.C97425j;
import di3.C86312j;
import eb0.C116756s5;
import eb0.C45628s0;
import eb0.C75571d6;
import eb0.C75592q0;
import eb0.C75604z3;
import eb0.C97625j3;
import f40.C86709a0;
import f62.C31941o0;
import f62.C31952w0;
import f62.C75700k0;
import h81.C32735h;
import hd0.C98408n0;
import hd0.C98410o0;
import hd0.C98426q0;
import hd0.C98429r0;
import ht1.C60165e4;
import ht1.C60166f;
import i61.C98602h;
import j20.C117292a;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import junit.framework.Assert;
import k20.C9556a;
import ld2.C46848g;
import ld3.C46850c;
import nj3.C76879j;
import nj3.C76912y0;
import nm2.C76933e;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47355o;
import p158gt.C76051j;
import p158gt.C76053l;
import p158gt.C98201k;
import p185kq.C76622f;
import p215oo.C77032h;
import p227rn.C48053v;
import p645pj.C77092c;
import p682rz.C101488s;
import p682rz.C101489t;
import p682rz.C101491u;
import p740wo.C53193b;
import p763ym.C79138l;
import p823sg.C101614i;
import p910lj.C76701a;
import pc0.C100760a0;
import pc0.C100765f;
import pc0.C77065r;
import qo3.C77398g;
import qo3.C89779i0;
import rn3.C101398k;
import rn3.C101399l;
import rn3.C101400m;
import rn3.C101403n;
import rn3.C101407r;
import rn3.C101410u;
import rn3.C101411v;
import rn3.C101412w;
import sb0.C48340e;
import te3.C49712hj1;
import te3.C64682rk1;
import te3.tc4;
import z51.C39315g;
import zt3.C119157j;

/* renamed from: com.tencent.mm.ui.transmit.MsgRetransmitUI */
public class MsgRetransmitUI extends MMBaseActivity implements C11385n {

    /* renamed from: V0 */
    public static final /* synthetic */ int f285342V0 = 0;

    /* renamed from: A */
    public C47355o f285343A = null;

    /* renamed from: B */
    public int f285344B = 0;

    /* renamed from: C */
    public int f285345C = 0;

    /* renamed from: D */
    public boolean f285346D = false;

    /* renamed from: E */
    public boolean f285347E = false;

    /* renamed from: F */
    public boolean f285348F = false;

    /* renamed from: G */
    public String f285349G;

    /* renamed from: H */
    public int f285350H = -1;

    /* renamed from: I */
    public int f285351I;

    /* renamed from: J */
    public float f285352J;

    /* renamed from: K */
    public float f285353K;

    /* renamed from: L */
    public String f285354L;

    /* renamed from: M */
    public String f285355M;

    /* renamed from: N */
    public boolean f285356N;

    /* renamed from: P */
    public boolean f285357P = true;

    /* renamed from: Q */
    public boolean f285358Q = true;

    /* renamed from: Q0 */
    public boolean f285359Q0 = false;

    /* renamed from: R */
    public int f285360R = 0;

    /* renamed from: R0 */
    public boolean f285361R0 = false;

    /* renamed from: S */
    public int f285362S;

    /* renamed from: S0 */
    public String f285363S0;

    /* renamed from: T */
    public long f285364T = 0;

    /* renamed from: T0 */
    public MMHandler f285365T0 = new MMHandler(Looper.getMainLooper());

    /* renamed from: U */
    public String f285366U;

    /* renamed from: U0 */
    public boolean f285367U0 = false;

    /* renamed from: V */
    public String f285368V;

    /* renamed from: W */
    public int f285369W;

    /* renamed from: X */
    public int f285370X;

    /* renamed from: Y */
    public boolean f285371Y = true;

    /* renamed from: Z */
    public boolean f285372Z = false;

    /* renamed from: e */
    public int f285373e;

    /* renamed from: f */
    public long f285374f;

    /* renamed from: g */
    public String f285375g;

    /* renamed from: h */
    public List<String> f285376h;

    /* renamed from: i */
    public String f285377i;

    /* renamed from: j */
    public ArrayList<Long> f285378j;

    /* renamed from: n */
    public int f285379n = 0;

    /* renamed from: o */
    public int f285380o;

    /* renamed from: p */
    public String f285381p = null;

    /* renamed from: p0 */
    public int f285382p0 = 0;

    /* renamed from: q */
    public boolean f285383q = true;

    /* renamed from: r */
    public boolean f285384r = false;

    /* renamed from: s */
    public ProgressDialog f285385s = null;

    /* renamed from: t */
    public C77398g f285386t;

    /* renamed from: u */
    public int f285387u = 0;

    /* renamed from: v */
    public int f285388v = 0;

    /* renamed from: w */
    public int f285389w = 0;

    /* renamed from: x */
    public C92809c0 f285390x = null;

    /* renamed from: x0 */
    public boolean f285391x0 = false;

    /* renamed from: y */
    public boolean f285392y = false;

    /* renamed from: y0 */
    public boolean f285393y0 = true;

    /* renamed from: z */
    public List<String> f285394z = null;

    /* renamed from: com.tencent.mm.ui.transmit.MsgRetransmitUI$a */
    public class C97245a implements DialogInterface.OnClickListener {
        public C97245a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            MsgRetransmitUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.ui.transmit.MsgRetransmitUI$b */
    public class C97246b implements C96790t0.C85608c {
        public C97246b() {
        }

        /* renamed from: a */
        public void mo102714a(List<Integer> list, List<String> list2, List<String> list3, List<Integer> list4) {
            ProgressDialog progressDialog = MsgRetransmitUI.this.f285385s;
            if (progressDialog != null) {
                progressDialog.dismiss();
                MsgRetransmitUI.this.f285385s = null;
            }
            MsgRetransmitUI msgRetransmitUI = MsgRetransmitUI.this;
            if (msgRetransmitUI.f285389w == 1) {
                C76701a.makeText((Context) msgRetransmitUI, (CharSequence) msgRetransmitUI.getString(C0966R.string.f360099a34), 0).show();
            }
            MsgRetransmitUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.ui.transmit.MsgRetransmitUI$c */
    public class C97247c implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C96790t0 f285397d;

        public C97247c(C96790t0 t0Var) {
            this.f285397d = t0Var;
        }

        public void onCancel(DialogInterface dialogInterface) {
            C96790t0 t0Var = this.f285397d;
            t0Var.f283549t = true;
            t0Var.interrupt();
            MsgRetransmitUI msgRetransmitUI = MsgRetransmitUI.this;
            msgRetransmitUI.f285367U0 = true;
            msgRetransmitUI.finish();
        }
    }

    /* renamed from: com.tencent.mm.ui.transmit.MsgRetransmitUI$d */
    public class C97248d implements C76051j.C76052a {

        /* renamed from: d */
        public final /* synthetic */ String f285399d;

        /* renamed from: e */
        public final /* synthetic */ int f285400e;

        /* renamed from: f */
        public final /* synthetic */ String f285401f;

        /* renamed from: g */
        public final /* synthetic */ String f285402g;

        public C97248d(String str, int i, String str2, String str3) {
            this.f285399d = str;
            this.f285400e = i;
            this.f285401f = str2;
            this.f285402g = str3;
        }

        /* renamed from: T2 */
        public void mo102581T2(long j, long j2, int i, int i2, Object obj, int i3, int i4, String str, C117747y yVar) {
            HashMap hashMap;
            Object obj2 = obj;
            boolean z = i3 == 0 && i4 == 0;
            if ((obj2 instanceof HashMap) && (hashMap = (HashMap) obj2) != null) {
                for (Map.Entry entry : hashMap.entrySet()) {
                    Long l = (Long) entry.getKey();
                    MsgRetransmitUI.this.f285375g = ((C92839m) ((C98201k) C86312j.m106911c(C98201k.class)).mo137277xi()).mo127174TY(((C76053l) C86312j.m106911c(C76053l.class)).mo106262y8((C92836k) entry.getValue()), "", "", true);
                    if (z) {
                        ((C72972g4) C97625j3.m125812b().mo105911z()).mo101125kD(l.longValue());
                        MsgRetransmitUI msgRetransmitUI = MsgRetransmitUI.this;
                        msgRetransmitUI.mo136227I7(this.f285399d, this.f285400e, this.f285401f, this.f285402g, msgRetransmitUI.f285343A, j);
                    }
                }
            }
        }

        /* renamed from: f0 */
        public void mo102582f0(long j, long j2, int i, int i2, Object obj, int i3, int i4, C117747y yVar) {
        }

        /* renamed from: x4 */
        public void mo102583x4(long j, long j2, int i, int i2, Object obj) {
        }
    }

    /* renamed from: com.tencent.mm.ui.transmit.MsgRetransmitUI$e */
    public class C97249e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f285404d;

        /* renamed from: e */
        public final /* synthetic */ C68070l.C68072b f285405e;

        /* renamed from: f */
        public final /* synthetic */ byte[] f285406f;

        /* renamed from: g */
        public final /* synthetic */ C72963f4 f285407g;

        public C97249e(String str, C68070l.C68072b bVar, byte[] bArr, C72963f4 f4Var) {
            this.f285404d = str;
            this.f285405e = bVar;
            this.f285406f = bArr;
            this.f285407g = f4Var;
        }

        public void run() {
            MsgRetransmitUI msgRetransmitUI = MsgRetransmitUI.this;
            String str = this.f285404d;
            C68070l.C68072b bVar = this.f285405e;
            byte[] bArr = this.f285406f;
            C72963f4 f4Var = this.f285407g;
            int i = MsgRetransmitUI.f285342V0;
            msgRetransmitUI.mo136237S7(str, bVar, bArr, f4Var);
        }
    }

    /* renamed from: com.tencent.mm.ui.transmit.MsgRetransmitUI$f */
    public class C97250f implements C46850c.C46851a {

        /* renamed from: a */
        public final /* synthetic */ C68070l.C68072b f285409a;

        /* renamed from: b */
        public final /* synthetic */ C68070l.C68072b f285410b;

        /* renamed from: c */
        public final /* synthetic */ String f285411c;

        /* renamed from: d */
        public final /* synthetic */ byte[] f285412d;

        public C97250f(C68070l.C68072b bVar, C68070l.C68072b bVar2, String str, byte[] bArr) {
            this.f285409a = bVar;
            this.f285410b = bVar2;
            this.f285411c = str;
            this.f285412d = bArr;
        }

        /* renamed from: a */
        public void mo72061a(String str, String str2, String str3, String str4, String str5, String str6, long j) {
            Log.m105925i("MicroMsg.MsgRetransmitUI", "summerbig CheckBigFile callback new, errMsg:[%s], md5[%s], aesKey[%s], signature[%s], old aeskey[%s], faesKey[%s], fsignature[%s]", str, str2, Util.secPrint(str3), Util.secPrint(str4), Util.secPrint(this.f285409a.f195524R), Util.secPrint(str5), Util.secPrint(str6));
            if (!Util.isNullOrNil(str4)) {
                C68070l.C68072b bVar = this.f285410b;
                C68070l.C68072b bVar2 = this.f285409a;
                MsgRetransmitUI.m125191W7((Long) C72695v.m85054G(bVar, bVar2.f195562d, bVar2.f195484F, this.f285411c, "", this.f285412d, MsgRetransmitUI.this.f285355M, str4, "", 0).second, this.f285411c, Long.valueOf(MsgRetransmitUI.this.f285374f));
                return;
            }
            MsgRetransmitUI msgRetransmitUI = MsgRetransmitUI.this;
            C76879j.m92748s(msgRetransmitUI, msgRetransmitUI.getString(C0966R.string.buw), "");
            MsgRetransmitUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.ui.transmit.MsgRetransmitUI$g */
    public static final class C97251g extends AsyncTask<Object, Object, String> {

        /* renamed from: a */
        public Dialog f285414a;

        /* renamed from: b */
        public Context f285415b;

        /* renamed from: c */
        public boolean f285416c;

        /* renamed from: d */
        public int f285417d;

        /* renamed from: e */
        public int f285418e;

        /* renamed from: f */
        public int f285419f;

        /* renamed from: g */
        public String f285420g;

        /* renamed from: h */
        public String f285421h;

        /* renamed from: i */
        public String f285422i;

        /* renamed from: j */
        public String f285423j;

        /* renamed from: k */
        public boolean f285424k = true;

        /* renamed from: l */
        public boolean f285425l = false;

        /* renamed from: m */
        public boolean f285426m = false;

        /* renamed from: n */
        public boolean f285427n = true;

        /* renamed from: o */
        public tc4 f285428o = null;

        /* renamed from: p */
        public C97253i f285429p = null;

        /* renamed from: q */
        public String f285430q;

        /* renamed from: r */
        public long f285431r;

        /* renamed from: s */
        public String f285432s;

        /* renamed from: t */
        public String f285433t;

        /* renamed from: u */
        public MMHandler f285434u = new MMHandler(Looper.getMainLooper());

        /* renamed from: v */
        public C97425j.C86198c f285435v = null;

        /* renamed from: w */
        public String f285436w;

        public Object doInBackground(Object[] objArr) {
            Class cls = C101491u.class;
            String str = this.f285422i;
            C101614i<String, ArrayList<C98408n0>> iVar = C98410o0.f288586c;
            String a = C98426q0.m127793a(str);
            C98410o0 o0Var = (C98410o0) ((C101488s) C86312j.m106911c(C101488s.class)).Kj0();
            String r = o0Var.mo137729r(a);
            C98408n0 Zd = ((C101491u) C86312j.m106911c(cls)).mo140806Zd(this.f285420g);
            boolean z = ((C32735h) C86312j.m106911c(C32735h.class)).dl0(C32735h.C32737c.clicfg_c2c_video_retransmit_use_link_enable, C104160f.RepairerConfig_Media_C2CVideoReTransmitUseLink_Int, 0) == 1;
            if (this.f285427n) {
                C86013q1.m106443d(o0Var.mo137728q(this.f285420g), o0Var.mo137728q(a), z);
                C86013q1.m106443d(o0Var.mo137729r(this.f285420g), r, z);
                if (Zd != null) {
                    WxFileIndexDirtyEvent wxFileIndexDirtyEvent = new WxFileIndexDirtyEvent();
                    wxFileIndexDirtyEvent.f79070d.f79071a = Zd.f288567n;
                    wxFileIndexDirtyEvent.publish();
                }
            } else {
                C86013q1.m106442c(this.f285420g, o0Var.mo137728q(a));
                C86013q1.m106442c(this.f285421h, r);
            }
            Log.m105925i("MicroMsg.MsgRetransmitUI", "CopyVideoTask ori[%s] status[%d] new[%s]", this.f285420g, Integer.valueOf(Zd != null ? Zd.f288562i : 0), a);
            if (C98429r0.m127830u() && Zd != null && !Util.isNullOrNil(Zd.f288546N)) {
                C98408n0 Zd2 = ((C101491u) C86312j.m106911c(cls)).mo140806Zd(Zd.f288546N);
                boolean z2 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(Zd.f288567n).mo108769t2() == 1;
                if (Zd2 != null && (Zd2.f288562i == 199 || z2)) {
                    this.f285436w = a + FirebaseAnalytics.C113379b.ORIGIN;
                    C86013q1.m106443d(o0Var.mo137728q(Zd.f288546N), o0Var.mo137728q(this.f285436w), z);
                    WxFileIndexDirtyEvent wxFileIndexDirtyEvent2 = new WxFileIndexDirtyEvent();
                    wxFileIndexDirtyEvent2.f79070d.f79071a = Zd.f288567n;
                    wxFileIndexDirtyEvent2.publish();
                }
            }
            Log.m105919d("MicroMsg.MsgRetransmitUI", "newfileSize:%s, oldFileSzie: %s", Long.valueOf(C86013q1.m106451l(o0Var.mo137728q(a))), Long.valueOf(C86013q1.m106451l(o0Var.mo137728q(this.f285420g))));
            return a;
        }

        /* JADX WARNING: Removed duplicated region for block: B:64:0x0206  */
        /* JADX WARNING: Removed duplicated region for block: B:70:0x021a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onPostExecute(java.lang.Object r35) {
            /*
                r34 = this;
                r0 = r34
                r15 = r35
                java.lang.String r15 = (java.lang.String) r15
                java.lang.Class<rz.u> r16 = p682rz.C101491u.class
                java.lang.Class<rz.s> r1 = p682rz.C101488s.class
                android.app.Dialog r2 = r0.f285414a
                r3 = 0
                if (r2 == 0) goto L_0x0014
                r2.dismiss()
                r0.f285414a = r3
            L_0x0014:
                di3.d r2 = di3.C86312j.m106911c(r1)
                rz.s r2 = (p682rz.C101488s) r2
                rz.t r2 = r2.Kj0()
                hd0.o0 r2 = (hd0.C98410o0) r2
                java.lang.String r17 = r2.mo137728q(r15)
                boolean r2 = com.tencent.p014mm.vfs.C86013q1.m106450k(r17)
                di3.d r4 = di3.C86312j.m106911c(r1)
                rz.s r4 = (p682rz.C101488s) r4
                rz.t r4 = r4.Kj0()
                hd0.o0 r4 = (hd0.C98410o0) r4
                java.lang.String r4 = r4.mo137729r(r15)
                boolean r5 = com.tencent.p014mm.vfs.C86013q1.m106450k(r4)
                long r6 = r0.f285431r
                java.lang.Long r6 = java.lang.Long.valueOf(r6)
                java.lang.String r7 = r0.f285422i
                r14 = 1
                r13 = 3
                com.tencent.p014mm.p136ui.transmit.MsgRetransmitUI.m125190F7(r6, r7, r14, r13)
                boolean r6 = r0.f285416c
                if (r6 == 0) goto L_0x0088
                if (r2 == 0) goto L_0x0052
                com.tencent.p014mm.vfs.C86013q1.m106447h(r17)
            L_0x0052:
                if (r5 == 0) goto L_0x0057
                com.tencent.p014mm.vfs.C86013q1.m106447h(r4)
            L_0x0057:
                java.lang.String r2 = r0.f285436w
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
                if (r2 != 0) goto L_0x0074
                di3.d r1 = di3.C86312j.m106911c(r1)
                rz.s r1 = (p682rz.C101488s) r1
                rz.t r1 = r1.Kj0()
                java.lang.String r2 = r0.f285436w
                hd0.o0 r1 = (hd0.C98410o0) r1
                java.lang.String r1 = r1.mo137728q(r2)
                com.tencent.p014mm.vfs.C86013q1.m106447h(r1)
            L_0x0074:
                android.content.Context r1 = r0.f285415b
                boolean r2 = r1 instanceof android.app.Activity
                if (r2 == 0) goto L_0x007f
                android.app.Activity r1 = (android.app.Activity) r1
                r1.finish()
            L_0x007f:
                d62.j$c r1 = r0.f285435v
                if (r1 == 0) goto L_0x02a3
                r1.mo115247b()
                goto L_0x02a3
            L_0x0088:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "dkvideo videoIsExport :"
                r1.append(r2)
                int r2 = r0.f285417d
                r1.append(r2)
                java.lang.String r2 = ", videoMsgType :"
                r1.append(r2)
                r11 = 43
                r1.append(r11)
                java.lang.String r2 = " videoType : "
                r1.append(r2)
                int r2 = r0.f285419f
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "MicroMsg.MsgRetransmitUI"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r1)
                java.lang.String r1 = r0.f285436w
                boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
                if (r1 != 0) goto L_0x00ed
                java.lang.String r1 = r0.f285436w
                r19 = 0
                int r2 = r0.f285418e
                java.lang.String r4 = r0.f285422i
                r22 = 0
                int r5 = r0.f285417d
                te3.tc4 r6 = r0.f285428o
                java.lang.String r7 = r0.f285423j
                long r8 = r0.f285431r
                java.lang.String r10 = r0.f285432s
                java.lang.String r12 = r0.f285433t
                r32 = 1
                r25 = 43
                java.lang.String r24 = ""
                r18 = r1
                r20 = r2
                r21 = r4
                r23 = r5
                r26 = r6
                r27 = r7
                r28 = r8
                r30 = r10
                r31 = r12
                hd0.C98429r0.m127827r(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r30, r31, r32)
            L_0x00ed:
                di3.d r1 = di3.C86312j.m106911c(r16)
                rz.u r1 = (p682rz.C101491u) r1
                java.lang.String r2 = r0.f285420g
                hd0.n0 r12 = r1.mo140806Zd(r2)
                if (r12 == 0) goto L_0x0101
                java.lang.String r1 = r12.mo137702f()
                r5 = r1
                goto L_0x0102
            L_0x0101:
                r5 = r3
            L_0x0102:
                java.lang.String r2 = r0.f285436w
                int r3 = r0.f285418e
                java.lang.String r4 = r0.f285422i
                int r6 = r0.f285417d
                te3.tc4 r9 = r0.f285428o
                java.lang.String r10 = r0.f285423j
                long r7 = r0.f285431r
                java.lang.String r1 = r0.f285432s
                java.lang.String r14 = r0.f285433t
                r18 = 43
                java.lang.String r19 = ""
                r20 = r1
                r1 = r15
                r21 = r7
                r7 = r19
                r8 = r18
                r33 = r12
                r18 = 43
                r11 = r21
                r13 = r20
                r19 = 1
                hd0.C98429r0.m127826q(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r13, r14)
                di3.d r1 = di3.C86312j.m106911c(r16)
                rz.u r1 = (p682rz.C101491u) r1
                int r1 = r1.mo140800Ic(r15)
                r14 = 0
                if (r1 == 0) goto L_0x013d
                r13 = 1
                goto L_0x013e
            L_0x013d:
                r13 = 0
            L_0x013e:
                r12 = 2
                r1 = r33
                if (r1 == 0) goto L_0x014a
                int r2 = r1.f288540H
                if (r2 != r12) goto L_0x014a
                hd0.C98429r0.m127800F(r15)
            L_0x014a:
                r2 = 3
                r16 = 2
                java.lang.String r4 = r0.f285420g
                boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
                if (r4 != 0) goto L_0x0165
                java.lang.String r4 = r0.f285420g
                java.lang.String r5 = "favorite"
                boolean r4 = r4.contains(r5)
                if (r4 == 0) goto L_0x0165
                r2 = 7
                r3 = 4
                r10 = r3
                goto L_0x0167
            L_0x0165:
                r10 = r2
                r2 = 3
            L_0x0167:
                java.lang.String r3 = r0.f285420g
                boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
                if (r3 != 0) goto L_0x017e
                java.lang.String r3 = r0.f285420g
                java.lang.String r4 = "sns"
                boolean r3 = r3.contains(r4)
                if (r3 == 0) goto L_0x017e
                r2 = 6
                r20 = 6
                goto L_0x0180
            L_0x017e:
                r20 = r2
            L_0x0180:
                r2 = 0
                if (r1 == 0) goto L_0x018e
                java.lang.String r1 = r1.mo137702f()
                long r1 = com.tencent.p014mm.vfs.C86013q1.m106451l(r1)
                r6 = r1
                goto L_0x018f
            L_0x018e:
                r6 = r2
            L_0x018f:
                ig3.n r1 = ig3.C98692n.f289404a
                java.lang.String r2 = r0.f285422i
                int r3 = r0.f285418e
                long r3 = (long) r3
                r8 = 1000(0x3e8, double:4.94E-321)
                long r4 = r3 * r8
                long r8 = com.tencent.p014mm.vfs.C86013q1.m106451l(r17)
                java.lang.String r3 = r0.f285436w
                boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
                r21 = r3 ^ 1
                r3 = r15
                r15 = 2
                r12 = r21
                r1.mo138103d(r2, r3, r4, r6, r8, r10, r12)
                hd0.e0 r4 = hd0.C98394e0.vx0()
                java.lang.String r7 = r0.f285422i
                java.lang.String r8 = r0.f285430q
                java.lang.String r5 = ""
                java.lang.String r9 = ""
                r6 = r17
                r10 = r20
                r11 = r16
                r4.wx0(r5, r6, r7, r8, r9, r10, r11)
                com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r2 = 10424(0x28b8, float:1.4607E-41)
                r3 = 3
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.Integer r4 = java.lang.Integer.valueOf(r18)
                r3[r14] = r4
                r4 = 8
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r3[r19] = r4
                java.lang.String r4 = r0.f285422i
                r3[r15] = r4
                r1.mo160131h(r2, r3)
                com.tencent.mm.ui.transmit.MsgRetransmitUI$i r1 = r0.f285429p
                if (r1 == 0) goto L_0x0220
                java.lang.String r2 = r0.f285422i
                r3 = r13 ^ 1
                java.util.List<java.lang.String> r4 = r1.f285445a
                if (r4 == 0) goto L_0x0203
                boolean r4 = r4.contains(r2)
                if (r4 == 0) goto L_0x0203
                java.util.List<java.lang.String> r4 = r1.f285445a
                r4.remove(r2)
                if (r3 != 0) goto L_0x01f9
                r1.f285446b = r14
            L_0x01f9:
                java.util.List<java.lang.String> r1 = r1.f285445a
                int r1 = r1.size()
                if (r1 != 0) goto L_0x0203
                r1 = 1
                goto L_0x0204
            L_0x0203:
                r1 = 0
            L_0x0204:
                if (r1 != 0) goto L_0x021a
                android.content.Context r1 = r0.f285415b
                boolean r2 = r1 instanceof android.app.Activity
                if (r2 == 0) goto L_0x0211
                android.app.Activity r1 = (android.app.Activity) r1
                r1.finish()
            L_0x0211:
                d62.j$c r1 = r0.f285435v
                if (r1 == 0) goto L_0x02a3
                r1.mo115247b()
                goto L_0x02a3
            L_0x021a:
                com.tencent.mm.ui.transmit.MsgRetransmitUI$i r1 = r0.f285429p
                boolean r1 = r1.f285446b
                r13 = r1 ^ 1
            L_0x0220:
                boolean r1 = r0.f285424k
                if (r1 == 0) goto L_0x0273
                android.content.Intent r1 = new android.content.Intent
                android.content.Context r2 = r0.f285415b
                java.lang.Class<com.tencent.mm.ui.chatting.ChattingUI> r3 = com.tencent.p014mm.p136ui.chatting.ChattingUI.class
                r1.<init>(r2, r3)
                r2 = 67108864(0x4000000, float:1.5046328E-36)
                r1.addFlags(r2)
                java.lang.String r2 = r0.f285422i
                java.lang.String r3 = "Chat_User"
                r1.putExtra(r3, r2)
                android.content.Context r2 = r0.f285415b
                k20.a r3 = new k20.a
                r3.<init>()
                r3.mo10233c(r1)
                java.lang.Object[] r5 = r3.mo10232b()
                java.lang.String r6 = "com/tencent/mm/ui/transmit/MsgRetransmitUI$CopyVideoTask"
                java.lang.String r7 = "onPostExecute"
                java.lang.String r8 = "(Ljava/lang/String;)V"
                java.lang.String r9 = "Undefined"
                java.lang.String r10 = "startActivity"
                java.lang.String r11 = "(Landroid/content/Intent;)V"
                r4 = r2
                j20.C117292a.m165358d(r4, r5, r6, r7, r8, r9, r10, r11)
                java.lang.Object r1 = r3.mo10231a(r14)
                android.content.Intent r1 = (android.content.Intent) r1
                r2.startActivity(r1)
                java.lang.String r5 = "com/tencent/mm/ui/transmit/MsgRetransmitUI$CopyVideoTask"
                java.lang.String r6 = "onPostExecute"
                java.lang.String r7 = "(Ljava/lang/String;)V"
                java.lang.String r8 = "Undefined"
                java.lang.String r9 = "startActivity"
                java.lang.String r10 = "(Landroid/content/Intent;)V"
                j20.C117292a.m165359e(r4, r5, r6, r7, r8, r9, r10)
            L_0x0273:
                boolean r1 = r0.f285426m
                if (r1 == 0) goto L_0x0290
                android.content.Context r1 = r0.f285415b
                boolean r2 = r1 instanceof android.app.Activity
                if (r2 == 0) goto L_0x0290
                r2 = r1
                android.app.Activity r2 = (android.app.Activity) r2
                if (r13 != 0) goto L_0x0286
                r3 = 2131831222(0x7f1129b6, float:1.9295463E38)
                goto L_0x0289
            L_0x0286:
                r3 = 2131835640(0x7f113af8, float:1.9304424E38)
            L_0x0289:
                java.lang.String r1 = r1.getString(r3)
                com.tencent.p014mm.p136ui.widget.snackbar.C75026b.m89951a(r2, r1)
            L_0x0290:
                com.tencent.mm.sdk.platformtools.MMHandler r1 = r0.f285434u
                com.tencent.mm.ui.transmit.e r2 = new com.tencent.mm.ui.transmit.e
                r2.<init>(r0)
                r3 = 1800(0x708, double:8.893E-321)
                r1.postDelayed(r2, r3)
                d62.j$c r1 = r0.f285435v
                if (r1 == 0) goto L_0x02a3
                r1.mo115247b()
            L_0x02a3:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.transmit.MsgRetransmitUI.C97251g.onPostExecute(java.lang.Object):void");
        }
    }

    /* renamed from: com.tencent.mm.ui.transmit.MsgRetransmitUI$h */
    public static class C97252h implements C101489t.C77595a {

        /* renamed from: d */
        public final List<String> f285437d;

        /* renamed from: e */
        public final String f285438e;

        /* renamed from: f */
        public final int f285439f;

        /* renamed from: g */
        public final int f285440g;

        /* renamed from: h */
        public final int f285441h;

        /* renamed from: i */
        public final boolean f285442i;

        /* renamed from: j */
        public final long f285443j;

        /* renamed from: n */
        public final boolean f285444n;

        public C97252h(List<String> list, String str, int i, int i2, int i3, boolean z, long j, boolean z2) {
            this.f285437d = list;
            this.f285438e = str;
            this.f285439f = i;
            this.f285440g = i2;
            this.f285441h = i3;
            this.f285442i = z;
            this.f285443j = j;
            this.f285444n = z2;
        }

        /* renamed from: d5 */
        public void mo102579d5(C101489t.C77595a.C77596a aVar) {
            String str = aVar.f226215a;
            C98408n0 Zd = ((C101491u) C86312j.m106911c(C101491u.class)).mo140806Zd(str);
            if (Zd != null && Zd.f288562i == 199 && str.equals(this.f285438e)) {
                C97253i iVar = new C97253i((C101407r) null);
                LinkedList linkedList = new LinkedList();
                iVar.f285445a = linkedList;
                linkedList.addAll(this.f285437d);
                for (String next : this.f285437d) {
                    int i = 0;
                    Log.m105925i("MicroMsg.MsgRetransmitUI", "copy video after download %s", next);
                    int i2 = this.f285439f;
                    int i3 = this.f285440g;
                    int i4 = this.f285441h;
                    boolean z = this.f285442i;
                    long j = this.f285443j;
                    boolean z2 = this.f285444n;
                    int i5 = MsgRetransmitUI.f285342V0;
                    Log.printInfoStack("MicroMsg.MsgRetransmitUI", "start copy video", new Object[0]);
                    Context context = MMApplicationContext.getContext();
                    C97251g gVar = new C97251g();
                    gVar.f285415b = context;
                    gVar.f285420g = str;
                    gVar.f285417d = i2;
                    gVar.f285418e = i3;
                    gVar.f285419f = i4;
                    gVar.f285424k = false;
                    gVar.f285422i = next;
                    gVar.f285425l = true;
                    gVar.f285426m = z;
                    gVar.f285429p = iVar;
                    C98408n0 i6 = C98429r0.m127818i(str);
                    if (!(i6 == null || i6.f288535C == null)) {
                        Log.m105918d("MicroMsg.MsgRetransmitUI", "msgRetrans streamvideo");
                        gVar.f285428o = i6.f288535C;
                        gVar.f285430q = i6.mo137707k();
                        gVar.f285431r = i6.f288567n;
                    }
                    if (i6 != null) {
                        gVar.f285433t = i6.f288543K;
                    }
                    gVar.execute(new Object[0]);
                    C116756s5.m164691d().mo180727a(C116756s5.f350055d, (Object[]) null);
                    if (j != -1) {
                        C72963f4 b002 = ((C72972g4) C97625j3.m125812b().mo105911z()).b00(j);
                        boolean U5 = C72996z1.m85820U5(next);
                        C73304a.C73306b bVar = U5 ? C73304a.C73306b.Chatroom : C73304a.C73306b.Chat;
                        C73304a.C73307c cVar = z2 ? C73304a.C73307c.Full : C73304a.C73307c.Samll;
                        if (U5) {
                            i = ((C53193b) C86312j.m106911c(C53193b.class)).mo73729p1(next);
                        }
                        C73304a.m86447c(bVar, cVar, b002, i);
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.transmit.MsgRetransmitUI$i */
    public static final class C97253i {

        /* renamed from: a */
        public List<String> f285445a = null;

        /* renamed from: b */
        public boolean f285446b = true;

        public C97253i(C101407r rVar) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x01d1  */
    /* renamed from: E7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m125189E7(com.tencent.p014mm.p136ui.transmit.MsgRetransmitUI r31, p1081gi.C98121d r32, com.tencent.p014mm.storage.C72963f4 r33, int r34, int r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, int r40) {
        /*
            r7 = r31
            r0 = r32
            r5 = r36
            r1 = r38
            r2 = r40
            r31.getClass()
            java.lang.Class<f62.k0> r3 = f62.C75700k0.class
            java.lang.Class<gt.k> r4 = p158gt.C98201k.class
            di3.d r6 = di3.C86312j.m106911c(r4)
            gt.k r6 = (p158gt.C98201k) r6
            gt.m r6 = r6.mo137277xi()
            java.lang.String r8 = r33.mo108765s2()
            com.tencent.mm.modelimage.m r6 = (com.tencent.p014mm.modelimage.C92839m) r6
            java.lang.String r6 = r6.b00(r8)
            com.tencent.mm.pointers.PString r15 = new com.tencent.mm.pointers.PString
            r15.<init>()
            com.tencent.mm.pointers.PInt r19 = new com.tencent.mm.pointers.PInt
            r19.<init>()
            com.tencent.mm.pointers.PInt r20 = new com.tencent.mm.pointers.PInt
            r20.<init>()
            java.lang.String r14 = ""
            r15.value = r14
            com.tencent.mm.storage.f4 r12 = new com.tencent.mm.storage.f4
            r12.<init>()
            int r8 = eb0.C45628s0.m50808x(r36)
            r12.setType(r8)
            r12.mo108749c3(r5)
            r13 = 1
            r12.mo108740T2(r13)
            r12.mo100991d(r13)
            java.lang.String r8 = r12.mo108768t()
            long r8 = eb0.C75604z3.m90843o(r8)
            r12.mo108733M2(r8)
            r12.mo108732L2(r1)
            cj.a r8 = p876cj.C67380a.C67381a.m79751a()
            fw0.w$c r8 = (fw0.C87107w.C75813c) r8
            r8.mo106108c(r12)
            k40.a r8 = f40.C86709a0.m107533q(r3)
            f62.k0 r8 = (f62.C75700k0) r8
            g62.l r8 = r8.mo96095LE()
            com.tencent.mm.storage.g4 r8 = (com.tencent.p014mm.storage.C72972g4) r8
            long r10 = r8.my0(r12)
            r21 = 0
            int r8 = (r10 > r21 ? 1 : (r10 == r21 ? 0 : -1))
            if (r8 < 0) goto L_0x007d
            r8 = 1
            goto L_0x007e
        L_0x007d:
            r8 = 0
        L_0x007e:
            junit.framework.Assert.assertTrue(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "NetSceneUploadMsgImg: local msgId = "
            r8.append(r9)
            r8.append(r10)
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = "MicroMsg.MsgRetransmitUI"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r8)
            if (r2 != r13) goto L_0x00d1
            di3.d r8 = di3.C86312j.m106911c(r4)
            gt.k r8 = (p158gt.C98201k) r8
            gt.m r8 = r8.mo137277xi()
            r16 = 0
            r17 = 0
            r18 = 1
            java.lang.String r23 = r12.getContent()
            com.tencent.mm.modelimage.m r8 = (com.tencent.p014mm.modelimage.C92839m) r8
            r24 = r9
            r9 = r36
            r25 = r10
            r10 = r16
            r11 = r17
            r35 = r12
            r12 = r25
            r27 = r14
            r14 = r18
            r28 = r15
            r15 = r23
            r16 = r28
            r17 = r19
            r18 = r20
            long r8 = r8.yu0(r9, r10, r11, r12, r14, r15, r16, r17, r18)
            r14 = r8
            goto L_0x00dd
        L_0x00d1:
            r24 = r9
            r25 = r10
            r35 = r12
            r27 = r14
            r28 = r15
            r14 = r21
        L_0x00dd:
            di3.d r8 = di3.C86312j.m106911c(r4)
            gt.k r8 = (p158gt.C98201k) r8
            gt.m r8 = r8.mo137277xi()
            r12 = 0
            r11 = 0
            r16 = 0
            java.lang.String r17 = r35.getContent()
            com.tencent.mm.modelimage.m r8 = (com.tencent.p014mm.modelimage.C92839m) r8
            r10 = 0
            r9 = r36
            r12 = r25
            r29 = r14
            r14 = r16
            r15 = r17
            r16 = r28
            r17 = r19
            r18 = r20
            long r8 = r8.yu0(r9, r10, r11, r12, r14, r15, r16, r17, r18)
            java.lang.String r10 = "msg"
            r11 = 0
            java.util.Map r10 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r1, r10, r11)
            java.lang.String r11 = ".msg.img.$length"
            java.lang.Object r11 = r10.get(r11)
            java.lang.String r11 = (java.lang.String) r11
            int r12 = r0.field_thumbimgLength
            int r11 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r11, (int) r12)
            di3.d r12 = di3.C86312j.m106911c(r4)
            gt.k r12 = (p158gt.C98201k) r12
            gt.m r12 = r12.mo137277xi()
            java.lang.Long r13 = java.lang.Long.valueOf(r8)
            com.tencent.mm.modelimage.m r12 = (com.tencent.p014mm.modelimage.C92839m) r12
            com.tencent.mm.modelimage.k r12 = r12.mo127194nP(r13)
            r13 = r25
            int r15 = (int) r13
            long r13 = (long) r15
            r12.mo127124A(r13)
            r12.mo127148s(r1)
            int r1 = (r8 > r21 ? 1 : (r8 == r21 ? 0 : -1))
            if (r1 <= 0) goto L_0x019b
            di3.d r1 = di3.C86312j.m106911c(r4)
            gt.k r1 = (p158gt.C98201k) r1
            gt.m r1 = r1.mo137277xi()
            r13 = r28
            java.lang.String r14 = r13.value
            com.tencent.mm.modelimage.m r1 = (com.tencent.p014mm.modelimage.C92839m) r1
            java.lang.String r15 = "th_"
            r16 = r11
            r11 = r27
            r7 = 0
            java.lang.String r1 = r1.mo127174TY(r14, r15, r11, r7)
            r14 = 1
            java.lang.Object[] r15 = new java.lang.Object[r14]
            r15[r7] = r1
            java.lang.String r7 = "deal send img for cdn [%s]"
            r14 = r24
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r7, r15)
            com.tencent.p014mm.vfs.C86013q1.m106442c(r6, r1)
            java.lang.String r1 = r13.value
            r7 = r35
            r7.mo108739S2(r1)
            int r1 = r33.mo108725D2()
            r7.mo108752f3(r1)
            int r1 = r33.mo108724C2()
            r7.mo108751e3(r1)
            r13 = r29
            int r1 = (r13 > r21 ? 1 : (r13 == r21 ? 0 : -1))
            if (r1 <= 0) goto L_0x01a3
            r1 = 1
            r12.mo127149t(r1)
            int r1 = (int) r13
            r12.mo127151v(r1)
            java.lang.String r1 = ".msg.img.$hdlength"
            java.lang.Object r1 = r10.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            int r10 = r0.field_thumbimgLength
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r1, (int) r10)
            goto L_0x01a5
        L_0x019b:
            r7 = r35
            r16 = r11
            r11 = r27
            r13 = r29
        L_0x01a3:
            r1 = r16
        L_0x01a5:
            di3.d r10 = di3.C86312j.m106911c(r4)
            gt.k r10 = (p158gt.C98201k) r10
            gt.m r10 = r10.mo137277xi()
            java.lang.Long r15 = java.lang.Long.valueOf(r8)
            com.tencent.mm.modelimage.m r10 = (com.tencent.p014mm.modelimage.C92839m) r10
            r10.Dx0(r15, r12)
            r10 = 1
            if (r2 != r10) goto L_0x01d1
            di3.d r10 = di3.C86312j.m106911c(r4)
            gt.k r10 = (p158gt.C98201k) r10
            gt.m r10 = r10.mo137277xi()
            java.lang.Long r12 = java.lang.Long.valueOf(r13)
            com.tencent.mm.modelimage.m r10 = (com.tencent.p014mm.modelimage.C92839m) r10
            com.tencent.mm.modelimage.k r12 = r10.mo127194nP(r12)
            r14 = r13
            goto L_0x01d2
        L_0x01d1:
            r14 = r8
        L_0x01d2:
            k40.a r3 = f40.C86709a0.m107533q(r3)
            f62.k0 r3 = (f62.C75700k0) r3
            g62.l r3 = r3.mo96095LE()
            com.tencent.mm.storage.g4 r3 = (com.tencent.p014mm.storage.C72972g4) r3
            r16 = r8
            r8 = r25
            r3.xy0(r8, r7)
            di3.d r3 = di3.C86312j.m106911c(r4)
            gt.k r3 = (p158gt.C98201k) r3
            gt.m r3 = r3.mo137277xi()
            java.lang.Long r4 = java.lang.Long.valueOf(r14)
            com.tencent.mm.modelimage.m r3 = (com.tencent.p014mm.modelimage.C92839m) r3
            r3.Dx0(r4, r12)
            long r3 = r7.getCreateTime()
            java.lang.String r10 = r7.mo108768t()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r11)
            long r8 = r7.getMsgId()
            r13.append(r8)
            java.lang.String r8 = "_"
            r13.append(r8)
            r13.append(r14)
            r13.append(r8)
            r13.append(r2)
            java.lang.String r8 = r13.toString()
            java.lang.String r9 = "upimg"
            java.lang.String r3 = com.tencent.p014mm.modelcdntran.C1297x.m1387b(r9, r3, r10, r8)
            te3.on4 r4 = new te3.on4
            r4.<init>()
            te3.rv3 r8 = new te3.rv3
            r8.<init>()
            r9 = r37
            r8.mo73357f(r9)
            r4.f299056e = r8
            te3.rv3 r8 = new te3.rv3
            r8.<init>()
            r8.mo73357f(r5)
            r4.f299057f = r8
            int r8 = r7.getType()
            r4.f299062n = r8
            java.lang.String r8 = r7.mo108773x2()
            r4.f299063o = r8
            int r8 = r12.mo127137h()
            r4.f299042H = r8
            te3.rv3 r8 = new te3.rv3
            r8.<init>()
            r8.mo73357f(r3)
            r4.f299055d = r8
            r4.f299064p = r2
            r2 = r39
            r0.field_filemd5 = r2
            long r2 = com.tencent.p014mm.vfs.C86013q1.m106451l(r6)
            int r3 = (int) r2
            r0.field_thumbimgLength = r3
            long r1 = (long) r1
            r0.field_fileLength = r1
            com.tencent.mm.modelimage.c r8 = com.tencent.p014mm.modelimage.C92808c.m116996f()
            r1 = r34
            r8.mo127071k(r1)
            r8.mo127068h(r4)
            r8.mo127067g(r12)
            r8.mo127069i(r0)
            rn3.q r9 = new rn3.q
            r0 = r9
            r1 = r31
            r2 = r36
            r3 = r16
            r10 = r5
            r5 = r25
            r0.<init>(r1, r2, r3, r5)
            r8.mo127070j(r9)
            java.lang.String r0 = r7.mo108768t()
            r8.mo140198e(r0)
            pc0.f r0 = new pc0.f
            r0.<init>()
            long r2 = r1.f285374f
            r0.mo140199a(r2)
            java.lang.String r2 = r1.f285349G
            r0.mo140200b(r2)
            android.content.Intent r2 = r31.getIntent()
            java.lang.String r3 = "msg_forward_sns_obj_id"
            java.lang.String r2 = r2.getStringExtra(r3)
            r0.mo140201c(r2)
            r8.mo140197d(r0)
            pc0.a0$b r0 = r8.mo140195a()
            r0.mo123694a()
            long r1 = r1.f285374f
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            m125192X7(r0, r10, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.transmit.MsgRetransmitUI.m125189E7(com.tencent.mm.ui.transmit.MsgRetransmitUI, gi.d, com.tencent.mm.storage.f4, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void");
    }

    /* renamed from: F7 */
    public static void m125190F7(Long l, String str, boolean z, int i) {
        ((C76622f) C86312j.m106911c(C76622f.class)).mo106873io(l.longValue(), str, z, i);
    }

    /* renamed from: W7 */
    public static void m125191W7(Long l, String str, Long l2) {
        ForwardUpdateMsgIdEvent forwardUpdateMsgIdEvent = new ForwardUpdateMsgIdEvent();
        forwardUpdateMsgIdEvent.f264876d.f264877a = l2.longValue();
        forwardUpdateMsgIdEvent.f264876d.f264878b = l.longValue();
        forwardUpdateMsgIdEvent.f264876d.f264879c = str;
        forwardUpdateMsgIdEvent.publish();
    }

    /* renamed from: X7 */
    public static void m125192X7(C100760a0.C89338b bVar, String str, Long l) {
        T t;
        if (bVar != null && (t = bVar.f257313a) != null) {
            if (522 == t.getType()) {
                T t2 = bVar.f257313a;
                if (t2 instanceof C77065r) {
                    m125191W7(Long.valueOf(((C77065r) t2).f225109f), str, l);
                }
            }
            if (110 == bVar.f257313a.getType()) {
                T t3 = bVar.f257313a;
                if ((t3 instanceof C92809c0) && ((C92809c0) t3).getMsg() != null) {
                    m125191W7(Long.valueOf(((C92809c0) bVar.f257313a).getMsg().getMsgId()), str, l);
                }
            }
        }
    }

    /* renamed from: G7 */
    public final boolean mo136225G7() {
        if (C97625j3.m125812b().mo105883I()) {
            return true;
        }
        Log.m105920e("MicroMsg.MsgRetransmitUI", "sdcard is not available, type = " + this.f285373e);
        C76912y0.m92771j(this, (View) null);
        return false;
    }

    /* renamed from: H7 */
    public final void mo136226H7(C92836k kVar, C72963f4 f4Var, String str, int i, String str2, String str3) {
        Class cls = C98201k.class;
        PString pString = new PString();
        PInt pInt = new PInt();
        PInt pInt2 = new PInt();
        pString.value = this.f285375g;
        int f = kVar.mo127135f();
        long xs02 = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).xs0(f4Var.mo108768t(), this.f285375g, f, i, 0, pString, pInt, pInt2);
        C92836k nP = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127194nP(Long.valueOf(xs02));
        boolean z = true;
        nP.mo127153x(1);
        C72963f4 f4Var2 = new C72963f4();
        f4Var2.setType(C45628s0.m50808x(str2));
        f4Var2.mo108749c3(str2);
        f4Var2.mo108740T2(1);
        f4Var2.mo100991d(1);
        f4Var2.mo108739S2(pString.value);
        f4Var2.mo108752f3(pInt.value);
        f4Var2.mo108751e3(pInt2.value);
        f4Var2.mo108733M2(C75604z3.m90843o(f4Var2.mo108768t()));
        if (((C48053v) C86312j.m106911c(C48053v.class)).mo72614OE(f4Var2.mo108768t())) {
            f4Var.mo101012p4(C48340e.m53669j());
        } else {
            C72963f4 f4Var3 = f4Var;
        }
        long my02 = ((C72972g4) C97625j3.m125812b().mo105911z()).my0(f4Var2);
        if (my02 < 0) {
            z = false;
        }
        Assert.assertTrue(z);
        Log.m105924i("MicroMsg.MsgRetransmitUI", "NetSceneUploadMsgImg: local msgId = " + my02);
        nP.mo127124A((long) ((int) my02));
        ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).Dx0(Long.valueOf(xs02), nP);
        HashMap hashMap = new HashMap();
        hashMap.put(Long.valueOf(my02), kVar);
        C76051j Jp0 = ((C98201k) C86312j.m106911c(cls)).Jp0();
        C92822e eVar = (C92822e) Jp0;
        eVar.mo127101c(kVar.mo127140k(), f4Var.getMsgId(), f, hashMap, C0966R.C0969drawable.by8, new C97248d(str2, i, str3, str));
    }

    /* renamed from: I7 */
    public final void mo136227I7(String str, int i, String str2, String str3, C47355o oVar, long j) {
        String str4 = str;
        int i2 = i;
        String str5 = str2;
        String str6 = str3;
        C47355o oVar2 = oVar;
        C100760a0.C100763e eVar = C100760a0.C100763e.IMAGE;
        boolean z = false;
        if (!Util.isNullOrNil(this.f285375g)) {
            this.f285344B = 1;
            this.f285345C = 1;
            if (mo136232N7(this.f285375g)) {
                if (this.f285387u == 1 && !C75592q0.m90771a(this.f285375g, str4, false)) {
                    this.f285387u = 0;
                }
                long currentTimeMillis = System.currentTimeMillis();
                C115669n.INSTANCE.idkeyStat(106, 96, 1, false);
                String stringExtra = getIntent().getStringExtra("msg_forward_sns_obj_id");
                if (stringExtra == null) {
                    stringExtra = getIntent().getStringExtra("sns_local_id");
                }
                if (!(getIntent().getStringExtra("sns_local_id") == null && getIntent().getStringExtra("geta8key_username") == null && getIntent().getStringExtra("serverMsgID") == null)) {
                    ((C77032h) C86312j.m106911c(C77032h.class)).setScene(6);
                }
                C100760a0.C100764f b = C100760a0.m131932b(eVar);
                b.f295195i = i2;
                b.f295188b = str5;
                b.f295187a = str4;
                b.f295196j = this.f285375g;
                b.f295197k = this.f285387u;
                b.f295198l = oVar2;
                b.f295200n = 0;
                b.f295204r = str6;
                b.f295205s = "";
                b.f295202p = true;
                b.f295201o = C0966R.C0969drawable.by8;
                b.f295208v = true;
                b.f295209w = this.f285351I;
                b.f295211y = this.f285352J;
                b.f295212z = this.f285353K;
                b.f295210x = this.f285354L;
                C100765f fVar = new C100765f();
                fVar.f295213a = j;
                fVar.f295214b = this.f285374f;
                fVar.f295216d = this.f285349G;
                fVar.f295218f = getIntent().getStringExtra("geta8key_username");
                fVar.f295217e = getIntent().getStringExtra("serverMsgID");
                fVar.f295215c = stringExtra;
                b.f295206t = fVar;
                b.f295203q = this.f285389w == 1;
                b.f295185A = this.f285363S0;
                b.f295194h = 19;
                C100760a0.C89338b a = b.mo140195a();
                this.f285390x = (C92809c0) a.f257313a;
                a.mo123694a();
                m125192X7(a, str4, Long.valueOf(this.f285374f));
                this.f285392y = true;
                Log.m105919d("MicroMsg.MsgRetransmitUI", "summersafecdn jacks consumption: %d, compressType:%d", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), Integer.valueOf(this.f285387u));
                C116756s5.m164691d().mo180727a(C116756s5.f350054c, (Object[]) null);
            }
        } else if (this.f285346D) {
            this.f285344B++;
            if (mo136232N7(this.f285394z.get(0))) {
                if (this.f285387u == 1 && !C75592q0.m90771a(this.f285394z.get(0), str4, false)) {
                    this.f285387u = 0;
                }
                Log.m105919d("MicroMsg.MsgRetransmitUI", "summersafecdn multiSendType compressType:%d", Integer.valueOf(this.f285387u));
                C100760a0.C100764f b2 = C100760a0.m131932b(eVar);
                b2.f295195i = i2;
                b2.f295188b = str5;
                b2.f295187a = str4;
                b2.f295196j = this.f285394z.get(0);
                b2.f295197k = this.f285387u;
                b2.f295198l = oVar2;
                b2.f295200n = 0;
                b2.f295204r = str6;
                b2.f295205s = "";
                b2.f295202p = true;
                b2.f295201o = C0966R.C0969drawable.by8;
                if (this.f285389w == 1) {
                    z = true;
                }
                b2.f295203q = z;
                b2.f295194h = 11;
                C100765f fVar2 = new C100765f();
                fVar2.f295214b = this.f285374f;
                fVar2.f295216d = this.f285349G;
                fVar2.f295215c = getIntent().getStringExtra("msg_forward_sns_obj_id");
                b2.f295206t = fVar2;
                C100760a0.C89338b a2 = b2.mo140195a();
                this.f285390x = (C92809c0) a2.f257313a;
                this.f285392y = true;
                a2.mo123694a();
                m125192X7(a2, str4, Long.valueOf(this.f285374f));
                C116756s5.m164691d().mo180727a(C116756s5.f350054c, (Object[]) null);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01be, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r1) != false) goto L_0x01c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01c0, code lost:
        r15.mo136236R7(r2, r1);
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01c7, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01c8, code lost:
        if (r1 == false) goto L_0x01d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01ca, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01d2, code lost:
        r1 = r15.f285373e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01dd, code lost:
        switch(r1) {
            case 0: goto L_0x0682;
            case 1: goto L_0x01e0;
            case 2: goto L_0x0677;
            case 3: goto L_0x01e0;
            case 4: goto L_0x066a;
            case 5: goto L_0x065d;
            case 6: goto L_0x063e;
            case 7: goto L_0x0622;
            case 8: goto L_0x0589;
            case 9: goto L_0x0551;
            case 10: goto L_0x0523;
            case 11: goto L_0x01e0;
            case 12: goto L_0x04b8;
            case 13: goto L_0x04ab;
            case 14: goto L_0x0494;
            case 15: goto L_0x01e0;
            case 16: goto L_0x0677;
            case 17: goto L_0x01e0;
            case 18: goto L_0x0426;
            case 19: goto L_0x0677;
            case 20: goto L_0x03e5;
            case 21: goto L_0x03a7;
            case 22: goto L_0x0368;
            case 23: goto L_0x0329;
            case 24: goto L_0x02ea;
            case 25: goto L_0x03a7;
            case 26: goto L_0x0282;
            case 27: goto L_0x03a7;
            case 28: goto L_0x0240;
            case 29: goto L_0x0329;
            case 30: goto L_0x01f7;
            case 31: goto L_0x0329;
            case 32: goto L_0x03a7;
            case 33: goto L_0x01f7;
            case 34: goto L_0x01e9;
            default: goto L_0x01e0;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01e0, code lost:
        r40 = r5;
        r19 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01e9, code lost:
        ((p548hg.C98450d) di3.C86312j.m106911c(p548hg.C98450d.class)).es0(r15, r2, r15.f285374f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x01fd, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r15.f285377i) != false) goto L_0x0424;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01ff, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, "transfer type %d finder name card to %s", java.lang.Integer.valueOf(r1), r2);
        r29 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r15.f285377i, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0219, code lost:
        if (r29 == null) goto L_0x0424;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x021b, code lost:
        r1 = com.tencent.p014mm.message.C80996q.C1279a.m1369a().mo112828y0(r29, "", "", r2, "", (byte[]) null, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x022f, code lost:
        if (r1 == null) goto L_0x0422;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0231, code lost:
        m125191W7((java.lang.Long) r1.second, r2, java.lang.Long.valueOf(r15.f285374f));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0246, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r15.f285377i) != false) goto L_0x0424;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0248, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, "transfer finder poi to %s", r2);
        r29 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r15.f285377i, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x025b, code lost:
        if (r29 == null) goto L_0x0424;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x025d, code lost:
        r1 = com.tencent.p014mm.message.C80996q.C1279a.m1369a().mo112828y0(r29, "", "", r2, "", (byte[]) null, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0271, code lost:
        if (r1 == null) goto L_0x0422;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0273, code lost:
        m125191W7((java.lang.Long) r1.second, r2, java.lang.Long.valueOf(r15.f285374f));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0288, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r15.f285377i) != false) goto L_0x0424;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x028a, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, "transfer finder feed to %s", r2);
        r1 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r15.f285377i, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x029a, code lost:
        if (r1 == null) goto L_0x0424;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x029c, code lost:
        r3 = com.tencent.p014mm.message.C80996q.C1279a.m1369a().mo112828y0(r1, "", "", r2, "", (byte[]) null, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02b2, code lost:
        if (r3 == null) goto L_0x02c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02b4, code lost:
        m125191W7((java.lang.Long) r3.second, r2, java.lang.Long.valueOf(r15.f285374f));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02c1, code lost:
        r1 = (ht1.C60181l) r1.mo93555w(ht1.C60181l.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02c9, code lost:
        if (r1 == null) goto L_0x0422;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02cb, code lost:
        r2 = new java.util.LinkedList();
        r1 = r1.f171715b;
        r2.add(new android.util.Pair(r1.f183241d, r1.f183248n));
        ((ht1.C60200t1) di3.C86312j.m106911c(r8)).Tr0(r2, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02f1, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r15.f285377i) != false) goto L_0x0424;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02f3, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, "transfer finder name card to %s", r2);
        r29 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r15.f285377i, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0302, code lost:
        if (r29 == null) goto L_0x0424;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0304, code lost:
        r1 = com.tencent.p014mm.message.C80996q.C1279a.m1369a().mo112828y0(r29, "", "", r2, "", (byte[]) null, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0318, code lost:
        if (r1 == null) goto L_0x0422;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x031a, code lost:
        m125191W7((java.lang.Long) r1.second, r2, java.lang.Long.valueOf(r15.f285374f));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x032f, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r15.f285377i) != false) goto L_0x0424;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0331, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, "transfer finder name card to %s", r2);
        r29 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r15.f285377i, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0341, code lost:
        if (r29 == null) goto L_0x0424;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0343, code lost:
        r1 = com.tencent.p014mm.message.C80996q.C1279a.m1369a().mo112828y0(r29, "", "", r2, "", (byte[]) null, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0357, code lost:
        if (r1 == null) goto L_0x0422;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0359, code lost:
        m125191W7((java.lang.Long) r1.second, r2, java.lang.Long.valueOf(r15.f285374f));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x036e, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r15.f285377i) != false) goto L_0x0424;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0370, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, "transfer finder topic to %s", r2);
        r29 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r15.f285377i, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0380, code lost:
        if (r29 == null) goto L_0x0424;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0382, code lost:
        r1 = com.tencent.p014mm.message.C80996q.C1279a.m1369a().mo112828y0(r29, "", "", r2, "", (byte[]) null, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0396, code lost:
        if (r1 == null) goto L_0x0422;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0398, code lost:
        m125191W7((java.lang.Long) r1.second, r2, java.lang.Long.valueOf(r15.f285374f));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x03ad, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r15.f285377i) != false) goto L_0x0424;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x03af, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, "transfer finder topic to %s", r2);
        r29 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r15.f285377i, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x03bf, code lost:
        if (r29 == null) goto L_0x0424;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x03c1, code lost:
        r1 = com.tencent.p014mm.message.C80996q.C1279a.m1369a().mo112828y0(r29, "", "", r2, "", (byte[]) null, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x03d5, code lost:
        if (r1 == null) goto L_0x0422;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x03d7, code lost:
        m125191W7((java.lang.Long) r1.second, r2, java.lang.Long.valueOf(r15.f285374f));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x03eb, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r15.f285377i) != false) goto L_0x0424;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x03ed, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, "transfer finder name card to %s", r2);
        r29 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r15.f285377i, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x03fd, code lost:
        if (r29 == null) goto L_0x0424;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x03ff, code lost:
        r1 = com.tencent.p014mm.message.C80996q.C1279a.m1369a().mo112828y0(r29, "", "", r2, "", (byte[]) null, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0413, code lost:
        if (r1 == null) goto L_0x0422;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0415, code lost:
        m125191W7((java.lang.Long) r1.second, r2, java.lang.Long.valueOf(r15.f285374f));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0422, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0424, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x042c, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r15.f285377i) != false) goto L_0x0424;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x042e, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, "transfer finder feed to %s", r2);
        r1 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r15.f285377i, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x043e, code lost:
        if (r1 == null) goto L_0x0424;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0440, code lost:
        r3 = com.tencent.p014mm.message.C80996q.C1279a.m1369a().mo112828y0(r1, "", "", r2, "", (byte[]) null, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0456, code lost:
        if (r3 == null) goto L_0x0465;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0458, code lost:
        m125191W7((java.lang.Long) r3.second, r2, java.lang.Long.valueOf(r15.f285374f));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0465, code lost:
        r1 = (ht1.C60166f) r1.mo93555w(ht1.C60166f.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x046d, code lost:
        if (r1 == null) goto L_0x0422;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x046f, code lost:
        r2 = new java.util.LinkedList();
        r1 = r1.f171710b;
        r2.add(new android.util.Pair(r1.f185183d, r1.f185191o));
        ((ht1.C60200t1) di3.C86312j.m106911c(r8)).Tr0(r2, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x048d, code lost:
        r19 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0494, code lost:
        r1 = new com.tencent.p014mm.autogen.events.ShareCouponCardEvent();
        r3 = r1.f265099d;
        r28 = r14;
        r3.f265101b = r15.f285374f;
        r3.f265100a = r15.f285377i;
        r3.f265102c = r2;
        r1.publish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x04ab, code lost:
        r28 = r14;
        com.tencent.p014mm.p136ui.chatting.C73313b1.m86460f(r15, r2, r6, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x04b0, code lost:
        r40 = r5;
        r19 = r6;
        r14 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x04b8, code lost:
        r28 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x04c0, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r2) == false) goto L_0x04cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x04c2, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105928w("MicroMsg.ChattingEditModeRetransmitMsg", "do try retransmit fail, username is empty");
        r40 = r5;
        r19 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x04cf, code lost:
        if (r9 == null) goto L_0x0504;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x04d1, code lost:
        r3 = r9.f215425a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x04d3, code lost:
        if (r3 == null) goto L_0x0504;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x04d9, code lost:
        if (r3.isEmpty() == false) goto L_0x04dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x04dc, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105927v("MicroMsg.ChattingEditModeRetransmitMsg", "post to do job, send to %s", r2);
        r40 = r5;
        r19 = r6;
        com.tencent.p014mm.p136ui.chatting.component.C73655y0.f216259q.add(new com.tencent.p014mm.p136ui.chatting.C73325c1(r9, r44, r2, r6, (java.lang.Runnable) null));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0504, code lost:
        r40 = r5;
        r19 = r6;
        com.tencent.p014mm.sdk.platformtools.Log.m105928w("MicroMsg.ChattingEditModeRetransmitMsg", "do try retransmit fail, select items empty");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0510, code lost:
        ((p185kq.C76622f) di3.C86312j.m106911c(p185kq.C76622f.class)).N80(r15.f285376h, r15.f285378j);
        r14 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0523, code lost:
        r4 = r2;
        r40 = r5;
        r19 = r6;
        r28 = r14;
        r1 = new com.tencent.p014mm.autogen.events.RecordOperationEvent();
        r2 = r1.f265027d;
        r2.f265029a = 4;
        r2.f265039k = ((com.tencent.p014mm.storage.C72972g4) eb0.C97625j3.m125812b().mo105911z()).b00(r15.f285374f);
        r1.f265027d.f265033e = r4;
        r1.publish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0551, code lost:
        r4 = r2;
        r19 = r6;
        r28 = r14;
        r1 = pc0.C100760a0.m131931a(r4);
        r1.f295187a = r4;
        r1.f295189c = r15.f285377i;
        r1.f295190d = 48;
        r1.f295191e = 0;
        r1.f295194h = 4;
        r2 = new pc0.C100765f();
        r2.f295214b = r15.f285374f;
        r1.f295206t = r2;
        r1 = r1.mo140195a();
        r1.mo123694a();
        m125192X7(r1, r4, java.lang.Long.valueOf(r15.f285374f));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0589, code lost:
        r4 = r2;
        r40 = r5;
        r19 = r6;
        r28 = r14;
        r1 = f62.C75700k0.class;
        r2 = ((com.tencent.p014mm.storage.C72972g4) ((f62.C75700k0) f40.C86709a0.m107533q(r1)).mo96095LE()).b00(r15.f285374f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x05ad, code lost:
        if (r2.getType() != 42) goto L_0x05d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x05af, code lost:
        r14 = r28;
        com.tencent.p014mm.sdk.platformtools.Log.m105918d(r14, "set forward flag");
        r2.mo101009o4();
        ((com.tencent.p014mm.storage.C72972g4) ((f62.C75700k0) f40.C86709a0.m107533q(r1)).mo96095LE()).xy0(r15.f285374f, r2);
        com.tencent.p014mm.modelsimple.C40359h0.m43532n1(r2, 21, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x05d2, code lost:
        r14 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x05d8, code lost:
        if (r2.mo100981T3() != false) goto L_0x05ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x05e6, code lost:
        if (com.tencent.p014mm.storage.C72996z1.m85843n5(com.tencent.p014mm.storage.C72963f4.C72964b.m85654f(r15.f285377i).f212675a) == false) goto L_0x05eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x05e8, code lost:
        r5 = 66;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x05eb, code lost:
        r5 = 42;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x05ee, code lost:
        r5 = 67;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x05f0, code lost:
        r1 = pc0.C100760a0.m131931a(r4);
        r1.f295187a = r4;
        r1.f295189c = r15.f285377i;
        r1.f295190d = r5;
        r1.f295191e = 1;
        r1.f295194h = 4;
        r2 = new pc0.C100765f();
        r2.f295214b = r15.f285374f;
        r2.f295215c = getIntent().getStringExtra("msg_forward_sns_obj_id");
        r1.f295206t = r2;
        r1.mo140195a().mo123694a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0622, code lost:
        r19 = r6;
        eb0.C97625j3.m125815e().mo123460f(new kd0.C76540g(kd0.C76552z.m92083u(r2, r15.f285375g, r15.f285380o), 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x063e, code lost:
        r4 = r2;
        r19 = r6;
        r1 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(com.tencent.p014mm.sdk.platformtools.Util.processXml(r15.f285377i), (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x064f, code lost:
        if (r1 != null) goto L_0x0659;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x0651, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, "transfer app message error: app content null");
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0659, code lost:
        r15.mo136237S7(r4, r1, (byte[]) null, (com.tencent.p014mm.storage.C72963f4) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x065d, code lost:
        r19 = r6;
        r1 = r15.mo136235Q7(r2, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x066a, code lost:
        r19 = r6;
        r15.mo136236R7(r2, r15.f285377i);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0675, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x0677, code lost:
        r19 = r6;
        r1 = r15.mo136234P7(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x0682, code lost:
        r40 = r5;
        r19 = r6;
        f40.C86709a0.m107525e().setHighPriority();
        ((zt3.C119157j) zt3.C119157j.f356862d).mo183876g(new rn3.C101407r(r15, r2), r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x069d, code lost:
        r1 = r40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x06a1, code lost:
        if (r15.f285347E == false) goto L_0x06bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x06a3, code lost:
        if (r19 == false) goto L_0x06bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x06a5, code lost:
        r2 = com.tencent.p014mm.p136ui.chatting.C73313b1.f215414a;
        r3 = r2.f215427c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x06a9, code lost:
        if (r3 == null) goto L_0x06bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x06af, code lost:
        if (r3.get() == null) goto L_0x06bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x06b1, code lost:
        r2.f215427c.get().mo22502r7(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x06bc, code lost:
        r5 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x06bd, code lost:
        r1 = r36;
        r3 = 4;
        r12 = 1;
        r13 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x06c6, code lost:
        r40 = r5;
        r1 = r15.f285376h.get(0);
        r0 = r15.f285373e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x06d7, code lost:
        switch(r0) {
            case 0: goto L_0x06df;
            case 1: goto L_0x08fd;
            case 2: goto L_0x06df;
            case 3: goto L_0x06da;
            case 4: goto L_0x06df;
            case 5: goto L_0x06df;
            case 6: goto L_0x06df;
            case 7: goto L_0x06df;
            case 8: goto L_0x06df;
            case 9: goto L_0x06df;
            case 10: goto L_0x06df;
            case 11: goto L_0x08fd;
            case 12: goto L_0x06df;
            case 13: goto L_0x06df;
            case 14: goto L_0x06df;
            case 15: goto L_0x06da;
            case 16: goto L_0x06df;
            case 17: goto L_0x06da;
            case 18: goto L_0x06df;
            case 19: goto L_0x06df;
            case 20: goto L_0x06df;
            case 21: goto L_0x06df;
            case 22: goto L_0x06df;
            case 23: goto L_0x06df;
            case 24: goto L_0x06df;
            case 25: goto L_0x06df;
            case 26: goto L_0x06df;
            case 27: goto L_0x06df;
            case 28: goto L_0x06df;
            case 29: goto L_0x06df;
            case 30: goto L_0x06df;
            case 31: goto L_0x06df;
            case 32: goto L_0x06df;
            case 33: goto L_0x06df;
            default: goto L_0x06da;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x06da, code lost:
        finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x06e0, code lost:
        if (r0 == 2) goto L_0x06eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x06e4, code lost:
        if (r0 != 16) goto L_0x06e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x06e7, code lost:
        r5 = r40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x06eb, code lost:
        r3 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(com.tencent.p014mm.sdk.platformtools.Util.processXml(r15.f285377i), (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x06f6, code lost:
        if (r3 == null) goto L_0x0773;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x06fa, code lost:
        if (r3.f195582i != 5) goto L_0x0773;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x0702, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r3.f195586j) != false) goto L_0x0773;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:?, code lost:
        r10 = java.net.URLEncoder.encode(r3.f195586j, "UTF-8");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x070c, code lost:
        r5 = r40;
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x0710, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x0711, code lost:
        r2 = 0;
        com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r14, r0, r10, new java.lang.Object[0]);
        r5 = r40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x0773, code lost:
        r5 = r40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0775, code lost:
        if (r5 != false) goto L_0x07ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0777, code lost:
        if (r3 == null) goto L_0x07ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x077d, code lost:
        if (r3.f195582i != 33) goto L_0x07ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x077f, code lost:
        r0 = new com.tencent.p014mm.autogen.events.AppBrandOuterMenuClickReportEvent();
        r2 = r0.f236137d;
        r4 = r15.f285369W;
        r2.f236141d = r4;
        r2.f236149l = r15.f285370X;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x078f, code lost:
        if (2 != r4) goto L_0x07ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x0791, code lost:
        r2.f236143f = r15.f285368V + com.tencent.xweb.file.XVFSFile.PATH_SEPARATOR + r15.f285366U;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x07ac, code lost:
        r2.f236143f = r15.f285368V;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x07b6, code lost:
        if (r1.endsWith("@chatroom") == false) goto L_0x07bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x07b8, code lost:
        r0.f236137d.f236145h = 2;
        r4 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x07bf, code lost:
        r4 = 1;
        r0.f236137d.f236145h = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x07c4, code lost:
        r2 = r0.f236137d;
        r2.f236142e = r3.f195653z2 + r4;
        r2.f236144g = r3.f195569e2;
        r2.f236138a = r3.f195573f2;
        r2.f236139b = r3.f195577g2;
        r2.f236140c = r3.f195467A2;
        r2.f236146i = r10;
        r2.f236147j = com.tencent.p014mm.sdk.platformtools.Util.nowSecond();
        r2 = r0.f236137d;
        r2.f236148k = 2;
        r2.f236150m = r3.f195589j2;
        r0.publish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0092, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0094, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x096c, code lost:
        r1 = r15.f285376h;
        com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, "processVideoTransfer");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x0979, code lost:
        if (11 != r15.f285373e) goto L_0x099f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x0981, code lost:
        if (hd0.C98429r0.m127812c(r15.f285375g) == false) goto L_0x099f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x0983, code lost:
        com.tencent.p014mm.p136ui.widget.snackbar.C75026b.m89953c(r15, getResources().getString(com.tencent.p014mm.C0966R.string.ilv), r10, (com.tencent.p014mm.p136ui.widget.snackbar.C75018a.C75024d) null);
        r15.f285365T0.postDelayed(new rn3.C101413x(r15), 1800);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x099f, code lost:
        r19 = p682rz.C101491u.class;
        r13 = new com.tencent.p014mm.p136ui.transmit.MsgRetransmitUI.C97253i((rn3.C101407r) null);
        r2 = new java.util.LinkedList();
        r13.f285445a = r2;
        r2.addAll(r1);
        r11 = ((p682rz.C101491u) di3.C86312j.m106911c(r19)).mo140806Zd(r15.f285375g);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x09bf, code lost:
        if (r11 != null) goto L_0x0a08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0095, code lost:
        if (r1 != false) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x09d5, code lost:
        if (((com.tencent.p014mm.storage.C72972g4) eb0.C97625j3.m125812b().mo105911z()).b00(r15.f285374f).mo100983V3() == false) goto L_0x0a08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x09d7, code lost:
        r1 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x09df, code lost:
        if (r1.hasNext() == false) goto L_0x09eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x09e1, code lost:
        r15.mo136234P7(r1.next());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x09ed, code lost:
        if (r15.f285384r == false) goto L_0x09f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x09ef, code lost:
        com.tencent.p014mm.p136ui.widget.snackbar.C75026b.m89951a(r15, r15.getString(com.tencent.p014mm.C0966R.string.fjh));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x09f9, code lost:
        r15.f285365T0.postDelayed(new rn3.C101408s(r15), 1800);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x0a03, code lost:
        r33 = r0;
        r5 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0099, code lost:
        r1 = r15.f285373e;
        r3 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x0a08, code lost:
        r18 = r1.iterator();
        r7 = r15;
        r8 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x0a12, code lost:
        if (r18.hasNext() == false) goto L_0x0ce7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x0a14, code lost:
        r9 = r18.next();
        r1 = new java.lang.Object[2];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x0a1e, code lost:
        if (r11 == null) goto L_0x0a25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x0a20, code lost:
        r2 = r11.mo137700d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x0a25, code lost:
        r2 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x0a26, code lost:
        r1[0] = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x0a29, code lost:
        if (r11 == null) goto L_0x0a32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x0a2b, code lost:
        r2 = java.lang.Integer.valueOf(r11.f288562i);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a0, code lost:
        if (r1 == 11) goto L_0x096c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x0a32, code lost:
        r2 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x0a33, code lost:
        r1[1] = r2;
        com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, "info[%s, %s]", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x0a3b, code lost:
        if (r11 == null) goto L_0x0b29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x0a41, code lost:
        if (r11.f288562i != 199) goto L_0x0b29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x0a43, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.printInfoStack(r14, "start copy video", new java.lang.Object[0]);
        r5 = new com.tencent.p014mm.p136ui.transmit.MsgRetransmitUI.C97251g();
        r12 = r5;
        r1 = nj3.C76879j.m92723Q(r44, r8.getString(com.tencent.p014mm.C0966R.string.a3h), r8.getString(com.tencent.p014mm.C0966R.string.a2w), true, true, new com.tencent.p014mm.p136ui.transmit.C97255b(r8, r5));
        r8.f285385s = r1;
        r12.f285415b = r8;
        r12.f285420g = r8.f285375g;
        r12.f285414a = r1;
        r12.f285417d = r8.f285388v;
        r12.f285418e = r8.f285380o;
        r12.f285419f = r8.f285373e;
        r12.f285424k = false;
        r12.f285422i = r9;
        r12.f285425l = true;
        r12.f285426m = r8.f285384r;
        r12.f285429p = r13;
        r1 = ((p682rz.C101491u) di3.C86312j.m106911c(r19)).mo140806Zd(r8.f285375g);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x0aa9, code lost:
        if (r1 == null) goto L_0x0ac3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x0aad, code lost:
        if (r1.f288535C == null) goto L_0x0ac3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x0aaf, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105918d(r14, "msgRetrans streamvideo");
        r12.f285428o = r1.f288535C;
        r12.f285430q = r1.mo137707k();
        r12.f285431r = r1.f288567n;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a2, code lost:
        if (r1 != 1) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x0ac3, code lost:
        if (r1 == null) goto L_0x0ac9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x0ac5, code lost:
        r12.f285433t = r1.f288543K;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x0ac9, code lost:
        r12.execute(new java.lang.Object[0]);
        eb0.C116756s5.m164691d().mo180727a(eb0.C116756s5.f350055d, (java.lang.Object[]) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x0add, code lost:
        if (r8.f285374f != -1) goto L_0x0ae0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x0ae0, code lost:
        r1 = ((com.tencent.p014mm.storage.C72972g4) eb0.C97625j3.m125812b().mo105911z()).b00(r8.f285374f);
        r2 = com.tencent.p014mm.storage.C72996z1.m85820U5(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x0af4, code lost:
        if (r2 == false) goto L_0x0af9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x0af6, code lost:
        r3 = com.tencent.p014mm.p136ui.chatting.C73304a.C73306b.f215404g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x0af9, code lost:
        r3 = com.tencent.p014mm.p136ui.chatting.C73304a.C73306b.f215403f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x0afd, code lost:
        if (r8.f285356N == false) goto L_0x0b02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a6, code lost:
        if (r1 != 0) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x0aff, code lost:
        r4 = com.tencent.p014mm.p136ui.chatting.C73304a.C73307c.f215408f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x0b02, code lost:
        r4 = com.tencent.p014mm.p136ui.chatting.C73304a.C73307c.f215407e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x0b04, code lost:
        if (r2 == false) goto L_0x0b13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x0b06, code lost:
        r2 = ((p740wo.C53193b) di3.C86312j.m106911c(p740wo.C53193b.class)).mo73729p1(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x0b13, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x0b14, code lost:
        com.tencent.p014mm.p136ui.chatting.C73304a.m86447c(r3, r4, r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x0b17, code lost:
        r33 = r0;
        r0 = r8;
        r4 = r10;
        r29 = r11;
        r20 = r13;
        r2 = r14;
        r5 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x0b2c, code lost:
        if (r11 != null) goto L_0x0b35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x0b2e, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105928w(r14, "checkVideoCdnInfo info is null !!!");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a8, code lost:
        r15.f285360R = r15.f285376h.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x0b35, code lost:
        r1 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r11.mo137705i(), "msg", (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x0b41, code lost:
        if (r1 != null) goto L_0x0b49;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x0b43, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105928w(r14, "%s cdntra parse video recv xml failed");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x0b49, code lost:
        r5 = r1.get(".msg.videomsg.$cdnvideourl");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x0b56, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r5) == false) goto L_0x0b5b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x0b58, code lost:
        r12 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x0b5b, code lost:
        r4 = r1.get(".msg.videomsg.$aeskey");
        r3 = r1.get(".msg.videomsg.$md5");
        r21 = r1.get(".msg.videomsg.$newmd5");
        r25 = r1.get(".msg.videomsg.$cdnrawvideoaeskey");
        r26 = r1.get(".msg.videomsg.$cdnrawvideourl");
        r27 = r1.get(".msg.videomsg.$rawmd5");
        r12 = false;
        r22 = com.tencent.p014mm.sdk.platformtools.Util.getInt(r1.get(".msg.videomsg.$rawlength"), 0);
        r29 = com.tencent.p014mm.sdk.platformtools.Util.getInt(r1.get(".msg.videomsg.$length"), 0);
        r30 = com.tencent.p014mm.sdk.platformtools.Util.getInt(r1.get(".msg.videomsg.$playlength"), 0);
        r31 = com.tencent.p014mm.sdk.platformtools.Util.getInt(r1.get(".msg.videomsg.$cdnthumblength"), 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:0x0bca, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r3) == false) goto L_0x0c08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x0be6, code lost:
        if (com.tencent.p014mm.vfs.C86013q1.m106450k(((hd0.C98410o0) ((p682rz.C101488s) di3.C86312j.m106911c(p682rz.C101488s.class)).Kj0()).mo137728q(r11.mo137700d())) != false) goto L_0x0c08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:0x0be8, code lost:
        com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE.idkeyStat(1328, 1, 1, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x0bf5, code lost:
        r33 = r0;
        r0 = r8;
        r4 = r10;
        r29 = r11;
        r20 = r13;
        r2 = r14;
        r5 = r15;
        r10 = false;
        r15 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x0c08, code lost:
        r8 = new p1081gi.C98124g();
        r8.f287660d = "task_MsgRetransmitUI_3";
        r32 = r3;
        r3 = r26;
        r26 = r4;
        r33 = r0;
        r34 = r5;
        r0 = r1;
        r41 = r8;
        r8 = r22;
        r22 = r9;
        r29 = r11;
        r20 = r13;
        r1 = new com.tencent.p014mm.p136ui.transmit.C97256c(r44, r3, r5, r25, r26, r31, r8, r29, r22, r27, r32, r21, r30, r29);
        r1 = r41;
        r1.f287662f = r0;
        r2 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond();
        r0 = new java.lang.StringBuilder();
        r4 = r10;
        r0.append(r4);
        r5 = r44;
        r0.append(r5.f285374f);
        r7 = r22;
        r1.field_mediaId = com.tencent.p014mm.modelcdntran.C1297x.m1387b("checkExist", r2, r7, r0.toString());
        r2 = r34;
        r1.field_fileId = r2;
        r0 = r26;
        r1.field_aesKey = r0;
        r3 = r32;
        r1.field_filemd5 = r3;
        r1.field_fileType = 4;
        r1.field_talker = r7;
        r1.field_priority = 2;
        r1.field_svr_signature = r4;
        r1.field_onlycheckexist = true;
        r1.field_trysafecdn = true;
        r10 = false;
        r7 = new java.lang.Object[]{r2, r3, r0, r29.mo137705i()};
        r2 = r14;
        com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, "field_fileId:%s, md5:%s, field_aesKey:%s, xml:%s", r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:393:0x0cb1, code lost:
        if (((p663qo.C101213l) di3.C86312j.m106911c(p663qo.C101213l.class)).if0(r1) != false) goto L_0x0cbf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:394:0x0cb3, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, "check exist fail! download video before retransmit");
        finish();
        r0 = r5;
        r15 = r0;
        r12 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x0cbf, code lost:
        r5.f285384r = false;
        finish();
        r0 = r5;
        r15 = r0;
        r12 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:396:0x0cc7, code lost:
        if (r12 != false) goto L_0x0cd9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x0cc9, code lost:
        ((zt3.C119157j) zt3.C119157j.f356862d).mo183876g(new com.tencent.p014mm.p136ui.transmit.C97254a(r5), "MicroMsg.MsgRetransmitUI");
        r5.f285384r = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:0x0cd9, code lost:
        r7 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:0x0cda, code lost:
        r8 = r0;
        r14 = r2;
        r10 = r4;
        r15 = r5;
        r13 = r20;
        r11 = r29;
        r0 = r33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b6, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r15.f285376h) == false) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:400:0x0ce7, code lost:
        r33 = r0;
        r5 = r15;
        r15 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:402:0x0ced, code lost:
        if (r15.f285347E == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:403:0x0cef, code lost:
        r0 = com.tencent.p014mm.p136ui.chatting.C73313b1.f215414a;
        r1 = r0.f215427c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:404:0x0cf3, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:406:0x0cf9, code lost:
        if (r1.get() == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:407:0x0cfb, code lost:
        r0.f215427c.get().mo22502r7(r33);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b8, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105928w(r14, "doRetransmitOnSceneNormal: mUsernames isNullOrNil");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00bf, code lost:
        r1 = r15.f285376h.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:425:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:427:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:428:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:429:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c9, code lost:
        if (r15.f285373e != 12) goto L_0x00ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00cb, code lost:
        r2 = com.tencent.p014mm.p136ui.chatting.C73313b1.f215414a;
        r5 = new com.tencent.p014mm.p136ui.chatting.C73313b1.C73320g();
        r5.f215426b = r2.f215426b;
        r5.f215428d = r2.f215428d;
        r5.f215429e = r2.f215429e;
        r5.f215430f = r2.f215430f;
        r5.f215425a = r2.f215425a;
        r5.f215427c = r2.f215427c;
        r9 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ec, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ed, code lost:
        r2 = r15.f285355M;
        r5 = rn3.C90056j.f258712a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00f5, code lost:
        if (android.text.TextUtils.isEmpty(r2) == false) goto L_0x00f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00f8, code lost:
        r2 = r2.hashCode();
        r5 = rn3.C90056j.f258712a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00fe, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        r5.put(r2, java.lang.Math.max(r1, 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0106, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0107, code lost:
        r11 = r15.f285376h.iterator();
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0114, code lost:
        if (r11.hasNext() == false) goto L_0x06c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0116, code lost:
        r2 = r11.next();
        r36 = r1 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x011e, code lost:
        if (r36 != 0) goto L_0x0122;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0120, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0122, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0127, code lost:
        if (com.tencent.p014mm.storage.C72996z1.m85846q5(r2) == false) goto L_0x01d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0129, code lost:
        r1 = r15.f285373e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x012b, code lost:
        if (r1 == 0) goto L_0x01c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x012d, code lost:
        if (r1 == r12) goto L_0x01c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0132, code lost:
        if (r1 == r13) goto L_0x0167;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0134, code lost:
        if (r1 == r3) goto L_0x01c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0136, code lost:
        if (r1 == 5) goto L_0x015d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x013a, code lost:
        if (r1 == 12) goto L_0x01c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x013e, code lost:
        if (r1 == 13) goto L_0x01c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0142, code lost:
        if (r1 == 30) goto L_0x01c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0144, code lost:
        switch(r1) {
            case 7: goto L_0x0155;
            case 8: goto L_0x014d;
            case 9: goto L_0x01c7;
            case 10: goto L_0x0169;
            default: goto L_0x0147;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0147, code lost:
        r1 = r15.getString(com.tencent.p014mm.C0966R.string.a16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x014d, code lost:
        r1 = r15.getString(com.tencent.p014mm.C0966R.string.f8018ze);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0155, code lost:
        r1 = r15.getString(com.tencent.p014mm.C0966R.string.a47);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x015d, code lost:
        r1 = r15.getString(com.tencent.p014mm.C0966R.string.f7957xf);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0169, code lost:
        r1 = ((cc3.C26835d) new cc3.C26835d().mo141104j(r15.f285377i)).mo53871H();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x017b, code lost:
        if (r1 == 3) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x017f, code lost:
        if (r1 == 19) goto L_0x01ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0183, code lost:
        if (r1 == 24) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0187, code lost:
        if (r1 == 33) goto L_0x01c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x018b, code lost:
        if (r1 == 51) goto L_0x019b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x018f, code lost:
        if (r1 == 74) goto L_0x01c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0191, code lost:
        if (r1 == 5) goto L_0x01c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0194, code lost:
        if (r1 == 6) goto L_0x01c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0196, code lost:
        r1 = r15.getString(com.tencent.p014mm.C0966R.string.a16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x019b, code lost:
        r1 = r15.getString(com.tencent.p014mm.C0966R.string.f8009z5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01a3, code lost:
        r1 = r15.getString(com.tencent.p014mm.C0966R.string.a17);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01ab, code lost:
        r1 = r15.getString(com.tencent.p014mm.C0966R.string.a2b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01b3, code lost:
        r1 = r15.getString(com.tencent.p014mm.C0966R.string.a0s);
     */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x085b  */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x08fa  */
    /* JADX WARNING: Removed duplicated region for block: B:309:0x0903  */
    /* renamed from: J7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo136228J7() {
        /*
            r44 = this;
            r15 = r44
            s90.o$a r0 = s90.C77632o.C77633a.trans
            int r1 = r15.f285389w
            java.lang.String r14 = "MicroMsg.MsgRetransmitUI"
            r13 = 2
            r12 = 1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r12)
            r11 = 0
            if (r1 == 0) goto L_0x0032
            if (r1 == r12) goto L_0x002d
            if (r1 == r13) goto L_0x0028
            java.lang.Object[] r0 = new java.lang.Object[r12]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r11] = r1
            java.lang.String r1 = "unknown scene %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r14, r1, r0)
            r44.finish()
            goto L_0x0966
        L_0x0028:
            r44.mo136229K7()
            goto L_0x0966
        L_0x002d:
            r44.mo136230L7()
            goto L_0x0966
        L_0x0032:
            java.lang.Class<ht1.t1> r8 = ht1.C60200t1.class
            int r1 = r15.f285373e
            java.lang.String r2 = "Transfer text erro: content null"
            java.lang.String r10 = ""
            switch(r1) {
                case 0: goto L_0x0089;
                case 1: goto L_0x0089;
                case 2: goto L_0x0094;
                case 3: goto L_0x003d;
                case 4: goto L_0x0078;
                case 5: goto L_0x0089;
                case 6: goto L_0x0094;
                case 7: goto L_0x0061;
                case 8: goto L_0x0089;
                case 9: goto L_0x0050;
                case 10: goto L_0x0094;
                case 11: goto L_0x0089;
                case 12: goto L_0x0094;
                case 13: goto L_0x0094;
                case 14: goto L_0x0094;
                case 15: goto L_0x004c;
                case 16: goto L_0x0094;
                default: goto L_0x003d;
            }
        L_0x003d:
            java.lang.Object[] r2 = new java.lang.Object[r12]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2[r11] = r1
            java.lang.String r1 = "unknown type %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r14, r1, r2)
            goto L_0x0094
        L_0x004c:
            r44.finish()
            goto L_0x0092
        L_0x0050:
            java.lang.String r1 = r15.f285377i
            if (r1 == 0) goto L_0x005a
            boolean r1 = r1.equals(r10)
            if (r1 == 0) goto L_0x0094
        L_0x005a:
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r2)
            r44.finish()
            goto L_0x0092
        L_0x0061:
            boolean r1 = r44.mo136225G7()
            if (r1 != 0) goto L_0x006b
            r44.finish()
            goto L_0x0092
        L_0x006b:
            java.lang.String r1 = r15.f285375g
            if (r1 != 0) goto L_0x0094
            java.lang.String r1 = "Transfer fileName erro: fileName null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r1)
            r44.finish()
            goto L_0x0092
        L_0x0078:
            java.lang.String r1 = r15.f285377i
            if (r1 == 0) goto L_0x0082
            boolean r1 = r1.equals(r10)
            if (r1 == 0) goto L_0x0094
        L_0x0082:
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r2)
            r44.finish()
            goto L_0x0092
        L_0x0089:
            boolean r1 = r44.mo136225G7()
            if (r1 != 0) goto L_0x0094
            r44.finish()
        L_0x0092:
            r1 = 0
            goto L_0x0095
        L_0x0094:
            r1 = 1
        L_0x0095:
            if (r1 != 0) goto L_0x0099
            goto L_0x0966
        L_0x0099:
            int r1 = r15.f285373e
            r16 = -1
            r2 = 11
            r3 = 4
            if (r1 == r2) goto L_0x096c
            if (r1 != r12) goto L_0x00a6
            goto L_0x096c
        L_0x00a6:
            if (r1 != 0) goto L_0x00b0
            java.util.List<java.lang.String> r1 = r15.f285376h
            int r1 = r1.size()
            r15.f285360R = r1
        L_0x00b0:
            java.util.List<java.lang.String> r1 = r15.f285376h
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r1)
            if (r1 == 0) goto L_0x00bf
            java.lang.String r0 = "doRetransmitOnSceneNormal: mUsernames isNullOrNil"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r14, r0)
            goto L_0x0966
        L_0x00bf:
            java.util.List<java.lang.String> r1 = r15.f285376h
            int r1 = r1.size()
            int r2 = r15.f285373e
            r6 = 12
            if (r2 != r6) goto L_0x00ec
            com.tencent.mm.ui.chatting.b1$g r2 = com.tencent.p014mm.p136ui.chatting.C73313b1.f215414a
            com.tencent.mm.ui.chatting.b1$g r5 = new com.tencent.mm.ui.chatting.b1$g
            r5.<init>()
            boolean r9 = r2.f215426b
            r5.f215426b = r9
            java.lang.String r9 = r2.f215428d
            r5.f215428d = r9
            com.tencent.mm.autogen.events.DoFavoriteEvent r9 = r2.f215429e
            r5.f215429e = r9
            se3.c r9 = r2.f215430f
            r5.f215430f = r9
            java.util.List<com.tencent.mm.storage.f4> r9 = r2.f215425a
            r5.f215425a = r9
            java.lang.ref.WeakReference<s90.o> r2 = r2.f215427c
            r5.f215427c = r2
            r9 = r5
            goto L_0x00ed
        L_0x00ec:
            r9 = 0
        L_0x00ed:
            java.lang.String r2 = r15.f285355M
            android.util.SparseIntArray r5 = rn3.C90056j.f258712a
            boolean r5 = android.text.TextUtils.isEmpty(r2)
            if (r5 == 0) goto L_0x00f8
            goto L_0x0107
        L_0x00f8:
            int r2 = r2.hashCode()
            android.util.SparseIntArray r5 = rn3.C90056j.f258712a
            monitor-enter(r5)
            int r11 = java.lang.Math.max(r1, r12)     // Catch:{ all -> 0x0969 }
            r5.put(r2, r11)     // Catch:{ all -> 0x0969 }
            monitor-exit(r5)     // Catch:{ all -> 0x0969 }
        L_0x0107:
            java.util.List<java.lang.String> r2 = r15.f285376h
            java.util.Iterator r11 = r2.iterator()
            r5 = 1
        L_0x010e:
            boolean r2 = r11.hasNext()
            r4 = 5
            r6 = -1
            if (r2 == 0) goto L_0x06c6
            java.lang.Object r2 = r11.next()
            java.lang.String r2 = (java.lang.String) r2
            int r36 = r1 + -1
            if (r36 != 0) goto L_0x0122
            r6 = 1
            goto L_0x0123
        L_0x0122:
            r6 = 0
        L_0x0123:
            boolean r1 = com.tencent.p014mm.storage.C72996z1.m85846q5(r2)
            if (r1 == 0) goto L_0x01d0
            int r1 = r15.f285373e
            if (r1 == 0) goto L_0x01c5
            if (r1 == r12) goto L_0x01c5
            r12 = 2131821615(0x7f11042f, float:1.9275978E38)
            if (r1 == r13) goto L_0x0167
            if (r1 == r3) goto L_0x01c5
            if (r1 == r4) goto L_0x015d
            r13 = 12
            if (r1 == r13) goto L_0x01c7
            r3 = 13
            if (r1 == r3) goto L_0x01c7
            r3 = 30
            if (r1 == r3) goto L_0x01c7
            switch(r1) {
                case 7: goto L_0x0155;
                case 8: goto L_0x014d;
                case 9: goto L_0x01c7;
                case 10: goto L_0x0169;
                default: goto L_0x0147;
            }
        L_0x0147:
            java.lang.String r1 = r15.getString(r12)
            goto L_0x01ba
        L_0x014d:
            r1 = 2131821544(0x7f1103e8, float:1.9275834E38)
            java.lang.String r1 = r15.getString(r1)
            goto L_0x01ba
        L_0x0155:
            r1 = 2131821732(0x7f1104a4, float:1.9276215E38)
            java.lang.String r1 = r15.getString(r1)
            goto L_0x01ba
        L_0x015d:
            r13 = 12
            r1 = 2131821467(0x7f11039b, float:1.9275678E38)
            java.lang.String r1 = r15.getString(r1)
            goto L_0x01ba
        L_0x0167:
            r13 = 12
        L_0x0169:
            cc3.d r1 = new cc3.d
            r1.<init>()
            java.lang.String r3 = r15.f285377i
            sm2.a r1 = r1.mo141104j(r3)
            cc3.d r1 = (cc3.C26835d) r1
            int r1 = r1.mo53871H()
            r3 = 3
            if (r1 == r3) goto L_0x01b3
            r3 = 19
            if (r1 == r3) goto L_0x01ab
            r3 = 24
            if (r1 == r3) goto L_0x01a3
            r3 = 33
            if (r1 == r3) goto L_0x01c7
            r3 = 51
            if (r1 == r3) goto L_0x019b
            r3 = 74
            if (r1 == r3) goto L_0x01c7
            if (r1 == r4) goto L_0x01c7
            r3 = 6
            if (r1 == r3) goto L_0x01c7
            java.lang.String r1 = r15.getString(r12)
            goto L_0x01ba
        L_0x019b:
            r1 = 2131821532(0x7f1103dc, float:1.927581E38)
            java.lang.String r1 = r15.getString(r1)
            goto L_0x01ba
        L_0x01a3:
            r1 = 2131821616(0x7f110430, float:1.927598E38)
            java.lang.String r1 = r15.getString(r1)
            goto L_0x01ba
        L_0x01ab:
            r1 = 2131821659(0x7f11045b, float:1.9276067E38)
            java.lang.String r1 = r15.getString(r1)
            goto L_0x01ba
        L_0x01b3:
            r1 = 2131821602(0x7f110422, float:1.9275952E38)
            java.lang.String r1 = r15.getString(r1)
        L_0x01ba:
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r3 != 0) goto L_0x01c7
            r15.mo136236R7(r2, r1)
            r1 = 1
            goto L_0x01c8
        L_0x01c5:
            r13 = 12
        L_0x01c7:
            r1 = 0
        L_0x01c8:
            if (r1 == 0) goto L_0x01d2
            r5 = 1
            r12 = 4
            r23 = 3
            goto L_0x06bd
        L_0x01d0:
            r13 = 12
        L_0x01d2:
            int r1 = r15.f285373e
            java.lang.String r3 = "transfer finder topic to %s"
            java.lang.String r4 = "transfer finder feed to %s"
            java.lang.String r12 = "transfer finder name card to %s"
            switch(r1) {
                case 0: goto L_0x0682;
                case 1: goto L_0x01e0;
                case 2: goto L_0x0677;
                case 3: goto L_0x01e0;
                case 4: goto L_0x066a;
                case 5: goto L_0x065d;
                case 6: goto L_0x063e;
                case 7: goto L_0x0622;
                case 8: goto L_0x0589;
                case 9: goto L_0x0551;
                case 10: goto L_0x0523;
                case 11: goto L_0x01e0;
                case 12: goto L_0x04b8;
                case 13: goto L_0x04ab;
                case 14: goto L_0x0494;
                case 15: goto L_0x01e0;
                case 16: goto L_0x0677;
                case 17: goto L_0x01e0;
                case 18: goto L_0x0426;
                case 19: goto L_0x0677;
                case 20: goto L_0x03e5;
                case 21: goto L_0x03a7;
                case 22: goto L_0x0368;
                case 23: goto L_0x0329;
                case 24: goto L_0x02ea;
                case 25: goto L_0x03a7;
                case 26: goto L_0x0282;
                case 27: goto L_0x03a7;
                case 28: goto L_0x0240;
                case 29: goto L_0x0329;
                case 30: goto L_0x01f7;
                case 31: goto L_0x0329;
                case 32: goto L_0x03a7;
                case 33: goto L_0x01f7;
                case 34: goto L_0x01e9;
                default: goto L_0x01e0;
            }
        L_0x01e0:
            r40 = r5
            r19 = r6
        L_0x01e4:
            r12 = 4
            r23 = 3
            goto L_0x069d
        L_0x01e9:
            java.lang.Class<hg.d> r1 = p548hg.C98450d.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            hg.d r1 = (p548hg.C98450d) r1
            long r3 = r15.f285374f
            r1.es0(r15, r2, r3)
            goto L_0x01e0
        L_0x01f7:
            java.lang.String r3 = r15.f285377i
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x0424
            r3 = 2
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3 = 0
            r4[r3] = r1
            r1 = 1
            r4[r1] = r2
            java.lang.String r1 = "transfer type %d finder name card to %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r1, r4)
            java.lang.String r1 = r15.f285377i
            r3 = 0
            com.tencent.mm.message.l$b r29 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r1, r3)
            if (r29 == 0) goto L_0x0424
            com.tencent.mm.message.q r28 = com.tencent.p014mm.message.C80996q.C1279a.m1369a()
            r34 = 0
            r35 = 1
            java.lang.String r30 = ""
            java.lang.String r31 = ""
            java.lang.String r33 = ""
            r32 = r2
            android.util.Pair r1 = r28.mo112828y0(r29, r30, r31, r32, r33, r34, r35)
            if (r1 == 0) goto L_0x0422
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r3 = r15.f285374f
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            m125191W7(r1, r2, r3)
            goto L_0x0422
        L_0x0240:
            java.lang.String r1 = r15.f285377i
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x0424
            r1 = 1
            java.lang.Object[] r3 = new java.lang.Object[r1]
            r1 = 0
            r3[r1] = r2
            java.lang.String r1 = "transfer finder poi to %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r1, r3)
            java.lang.String r1 = r15.f285377i
            r3 = 0
            com.tencent.mm.message.l$b r29 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r1, r3)
            if (r29 == 0) goto L_0x0424
            com.tencent.mm.message.q r28 = com.tencent.p014mm.message.C80996q.C1279a.m1369a()
            r34 = 0
            r35 = 1
            java.lang.String r30 = ""
            java.lang.String r31 = ""
            java.lang.String r33 = ""
            r32 = r2
            android.util.Pair r1 = r28.mo112828y0(r29, r30, r31, r32, r33, r34, r35)
            if (r1 == 0) goto L_0x0422
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r3 = r15.f285374f
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            m125191W7(r1, r2, r3)
            goto L_0x0422
        L_0x0282:
            java.lang.String r1 = r15.f285377i
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x0424
            r1 = 1
            java.lang.Object[] r3 = new java.lang.Object[r1]
            r1 = 0
            r3[r1] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r4, r3)
            java.lang.String r1 = r15.f285377i
            r3 = 0
            com.tencent.mm.message.l$b r1 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r1, r3)
            if (r1 == 0) goto L_0x0424
            com.tencent.mm.message.q r28 = com.tencent.p014mm.message.C80996q.C1279a.m1369a()
            r34 = 0
            r35 = 1
            java.lang.String r30 = ""
            java.lang.String r31 = ""
            java.lang.String r33 = ""
            r29 = r1
            r32 = r2
            android.util.Pair r3 = r28.mo112828y0(r29, r30, r31, r32, r33, r34, r35)
            if (r3 == 0) goto L_0x02c1
            java.lang.Object r3 = r3.second
            java.lang.Long r3 = (java.lang.Long) r3
            long r4 = r15.f285374f
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            m125191W7(r3, r2, r4)
        L_0x02c1:
            java.lang.Class<ht1.l> r2 = ht1.C60181l.class
            com.tencent.mm.message.g r1 = r1.mo93555w(r2)
            ht1.l r1 = (ht1.C60181l) r1
            if (r1 == 0) goto L_0x0422
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            android.util.Pair r3 = new android.util.Pair
            te3.fw2 r1 = r1.f171715b
            java.lang.String r4 = r1.f183241d
            java.lang.String r1 = r1.f183248n
            r3.<init>(r4, r1)
            r2.add(r3)
            di3.d r1 = di3.C86312j.m106911c(r8)
            ht1.t1 r1 = (ht1.C60200t1) r1
            r3 = 1
            r1.Tr0(r2, r3)
            goto L_0x0422
        L_0x02ea:
            r3 = 1
            java.lang.String r1 = r15.f285377i
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x0424
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r3 = 0
            r1[r3] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r12, r1)
            java.lang.String r1 = r15.f285377i
            r3 = 0
            com.tencent.mm.message.l$b r29 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r1, r3)
            if (r29 == 0) goto L_0x0424
            com.tencent.mm.message.q r28 = com.tencent.p014mm.message.C80996q.C1279a.m1369a()
            r34 = 0
            r35 = 1
            java.lang.String r30 = ""
            java.lang.String r31 = ""
            java.lang.String r33 = ""
            r32 = r2
            android.util.Pair r1 = r28.mo112828y0(r29, r30, r31, r32, r33, r34, r35)
            if (r1 == 0) goto L_0x0422
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r3 = r15.f285374f
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            m125191W7(r1, r2, r3)
            goto L_0x0422
        L_0x0329:
            java.lang.String r1 = r15.f285377i
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x0424
            r1 = 1
            java.lang.Object[] r3 = new java.lang.Object[r1]
            r1 = 0
            r3[r1] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r12, r3)
            java.lang.String r1 = r15.f285377i
            r3 = 0
            com.tencent.mm.message.l$b r29 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r1, r3)
            if (r29 == 0) goto L_0x0424
            com.tencent.mm.message.q r28 = com.tencent.p014mm.message.C80996q.C1279a.m1369a()
            r34 = 0
            r35 = 1
            java.lang.String r30 = ""
            java.lang.String r31 = ""
            java.lang.String r33 = ""
            r32 = r2
            android.util.Pair r1 = r28.mo112828y0(r29, r30, r31, r32, r33, r34, r35)
            if (r1 == 0) goto L_0x0422
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r3 = r15.f285374f
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            m125191W7(r1, r2, r3)
            goto L_0x0422
        L_0x0368:
            java.lang.String r1 = r15.f285377i
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x0424
            r1 = 1
            java.lang.Object[] r4 = new java.lang.Object[r1]
            r1 = 0
            r4[r1] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r3, r4)
            java.lang.String r1 = r15.f285377i
            r3 = 0
            com.tencent.mm.message.l$b r29 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r1, r3)
            if (r29 == 0) goto L_0x0424
            com.tencent.mm.message.q r28 = com.tencent.p014mm.message.C80996q.C1279a.m1369a()
            r34 = 0
            r35 = 1
            java.lang.String r30 = ""
            java.lang.String r31 = ""
            java.lang.String r33 = ""
            r32 = r2
            android.util.Pair r1 = r28.mo112828y0(r29, r30, r31, r32, r33, r34, r35)
            if (r1 == 0) goto L_0x0422
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r3 = r15.f285374f
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            m125191W7(r1, r2, r3)
            goto L_0x0422
        L_0x03a7:
            java.lang.String r1 = r15.f285377i
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x0424
            r1 = 1
            java.lang.Object[] r4 = new java.lang.Object[r1]
            r1 = 0
            r4[r1] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r3, r4)
            java.lang.String r1 = r15.f285377i
            r3 = 0
            com.tencent.mm.message.l$b r29 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r1, r3)
            if (r29 == 0) goto L_0x0424
            com.tencent.mm.message.q r28 = com.tencent.p014mm.message.C80996q.C1279a.m1369a()
            r34 = 0
            r35 = 1
            java.lang.String r30 = ""
            java.lang.String r31 = ""
            java.lang.String r33 = ""
            r32 = r2
            android.util.Pair r1 = r28.mo112828y0(r29, r30, r31, r32, r33, r34, r35)
            if (r1 == 0) goto L_0x0422
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r3 = r15.f285374f
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            m125191W7(r1, r2, r3)
            goto L_0x0422
        L_0x03e5:
            java.lang.String r1 = r15.f285377i
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x0424
            r1 = 1
            java.lang.Object[] r3 = new java.lang.Object[r1]
            r1 = 0
            r3[r1] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r12, r3)
            java.lang.String r1 = r15.f285377i
            r3 = 0
            com.tencent.mm.message.l$b r29 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r1, r3)
            if (r29 == 0) goto L_0x0424
            com.tencent.mm.message.q r28 = com.tencent.p014mm.message.C80996q.C1279a.m1369a()
            r34 = 0
            r35 = 1
            java.lang.String r30 = ""
            java.lang.String r31 = ""
            java.lang.String r33 = ""
            r32 = r2
            android.util.Pair r1 = r28.mo112828y0(r29, r30, r31, r32, r33, r34, r35)
            if (r1 == 0) goto L_0x0422
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r3 = r15.f285374f
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            m125191W7(r1, r2, r3)
        L_0x0422:
            r1 = 1
            goto L_0x048d
        L_0x0424:
            r1 = 0
            goto L_0x048d
        L_0x0426:
            java.lang.String r1 = r15.f285377i
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x0424
            r1 = 1
            java.lang.Object[] r3 = new java.lang.Object[r1]
            r1 = 0
            r3[r1] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r4, r3)
            java.lang.String r1 = r15.f285377i
            r3 = 0
            com.tencent.mm.message.l$b r1 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r1, r3)
            if (r1 == 0) goto L_0x0424
            com.tencent.mm.message.q r28 = com.tencent.p014mm.message.C80996q.C1279a.m1369a()
            r34 = 0
            r35 = 1
            java.lang.String r30 = ""
            java.lang.String r31 = ""
            java.lang.String r33 = ""
            r29 = r1
            r32 = r2
            android.util.Pair r3 = r28.mo112828y0(r29, r30, r31, r32, r33, r34, r35)
            if (r3 == 0) goto L_0x0465
            java.lang.Object r3 = r3.second
            java.lang.Long r3 = (java.lang.Long) r3
            long r4 = r15.f285374f
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            m125191W7(r3, r2, r4)
        L_0x0465:
            java.lang.Class<ht1.f> r2 = ht1.C60166f.class
            com.tencent.mm.message.g r1 = r1.mo93555w(r2)
            ht1.f r1 = (ht1.C60166f) r1
            if (r1 == 0) goto L_0x0422
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            android.util.Pair r3 = new android.util.Pair
            te3.rk1 r1 = r1.f171710b
            java.lang.String r4 = r1.f185183d
            java.lang.String r1 = r1.f185191o
            r3.<init>(r4, r1)
            r2.add(r3)
            di3.d r1 = di3.C86312j.m106911c(r8)
            ht1.t1 r1 = (ht1.C60200t1) r1
            r3 = 0
            r1.Tr0(r2, r3)
            goto L_0x0422
        L_0x048d:
            r19 = r6
            r12 = 4
            r23 = 3
            goto L_0x069f
        L_0x0494:
            com.tencent.mm.autogen.events.ShareCouponCardEvent r1 = new com.tencent.mm.autogen.events.ShareCouponCardEvent
            r1.<init>()
            com.tencent.mm.autogen.events.ShareCouponCardEvent$a r3 = r1.f265099d
            r28 = r14
            long r13 = r15.f285374f
            r3.f265101b = r13
            java.lang.String r4 = r15.f285377i
            r3.f265100a = r4
            r3.f265102c = r2
            r1.publish()
            goto L_0x04b0
        L_0x04ab:
            r28 = r14
            com.tencent.p014mm.p136ui.chatting.C73313b1.m86460f(r15, r2, r6, r2)
        L_0x04b0:
            r40 = r5
            r19 = r6
            r14 = r28
            goto L_0x01e4
        L_0x04b8:
            r28 = r14
            java.lang.String r1 = "MicroMsg.ChattingEditModeRetransmitMsg"
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r3 == 0) goto L_0x04cf
            java.lang.String r2 = "do try retransmit fail, username is empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r2)
            r40 = r5
            r19 = r6
            r12 = 4
            r23 = 3
            goto L_0x0510
        L_0x04cf:
            if (r9 == 0) goto L_0x0504
            java.util.List<com.tencent.mm.storage.f4> r3 = r9.f215425a
            if (r3 == 0) goto L_0x0504
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x04dc
            goto L_0x0504
        L_0x04dc:
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r3 = 0
            r4[r3] = r2
            java.lang.String r3 = "post to do job, send to %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r1, r3, r4)
            com.tencent.mm.sdk.platformtools.QueueWorkerThread r13 = com.tencent.p014mm.p136ui.chatting.component.C73655y0.f216259q
            com.tencent.mm.ui.chatting.c1 r14 = new com.tencent.mm.ui.chatting.c1
            r25 = 0
            r1 = r14
            r4 = r2
            r2 = r9
            r12 = 4
            r23 = 3
            r3 = r44
            r40 = r5
            r5 = r6
            r19 = r6
            r6 = r25
            r1.<init>(r2, r3, r4, r5, r6)
            r13.add(r14)
            goto L_0x0510
        L_0x0504:
            r40 = r5
            r19 = r6
            r12 = 4
            r23 = 3
            java.lang.String r2 = "do try retransmit fail, select items empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r2)
        L_0x0510:
            java.lang.Class<kq.f> r1 = p185kq.C76622f.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            kq.f r1 = (p185kq.C76622f) r1
            java.util.List<java.lang.String> r2 = r15.f285376h
            java.util.ArrayList<java.lang.Long> r3 = r15.f285378j
            r1.N80(r2, r3)
            r14 = r28
            goto L_0x069d
        L_0x0523:
            r4 = r2
            r40 = r5
            r19 = r6
            r28 = r14
            r12 = 4
            r23 = 3
            com.tencent.mm.autogen.events.RecordOperationEvent r1 = new com.tencent.mm.autogen.events.RecordOperationEvent
            r1.<init>()
            com.tencent.mm.autogen.events.RecordOperationEvent$a r2 = r1.f265027d
            r2.f265029a = r12
            eb0.c r3 = eb0.C97625j3.m125812b()
            g62.l r3 = r3.mo105911z()
            long r5 = r15.f285374f
            com.tencent.mm.storage.g4 r3 = (com.tencent.p014mm.storage.C72972g4) r3
            com.tencent.mm.storage.f4 r3 = r3.b00(r5)
            r2.f265039k = r3
            com.tencent.mm.autogen.events.RecordOperationEvent$a r2 = r1.f265027d
            r2.f265033e = r4
            r1.publish()
            goto L_0x069d
        L_0x0551:
            r4 = r2
            r19 = r6
            r28 = r14
            r12 = 4
            r23 = 3
            pc0.a0$f r1 = pc0.C100760a0.m131931a(r4)
            r1.f295187a = r4
            java.lang.String r2 = r15.f285377i
            r1.f295189c = r2
            r2 = 48
            r1.f295190d = r2
            r2 = 0
            r1.f295191e = r2
            r1.f295194h = r12
            pc0.f r2 = new pc0.f
            r2.<init>()
            long r5 = r15.f285374f
            r2.f295214b = r5
            r1.f295206t = r2
            pc0.a0$b r1 = r1.mo140195a()
            r1.mo123694a()
            long r2 = r15.f285374f
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            m125192X7(r1, r4, r2)
            goto L_0x0675
        L_0x0589:
            r4 = r2
            r40 = r5
            r19 = r6
            r28 = r14
            r12 = 4
            r23 = 3
            java.lang.Class<f62.k0> r1 = f62.C75700k0.class
            k40.a r2 = f40.C86709a0.m107533q(r1)
            f62.k0 r2 = (f62.C75700k0) r2
            g62.l r2 = r2.mo96095LE()
            long r5 = r15.f285374f
            com.tencent.mm.storage.g4 r2 = (com.tencent.p014mm.storage.C72972g4) r2
            com.tencent.mm.storage.f4 r2 = r2.b00(r5)
            int r3 = r2.getType()
            r5 = 42
            if (r3 != r5) goto L_0x05d2
            java.lang.String r3 = "set forward flag"
            r14 = r28
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r14, r3)
            r2.mo101009o4()
            k40.a r1 = f40.C86709a0.m107533q(r1)
            f62.k0 r1 = (f62.C75700k0) r1
            g62.l r1 = r1.mo96095LE()
            long r5 = r15.f285374f
            com.tencent.mm.storage.g4 r1 = (com.tencent.p014mm.storage.C72972g4) r1
            r1.xy0(r5, r2)
            r1 = 21
            r5 = 1
            com.tencent.p014mm.modelsimple.C40359h0.m43532n1(r2, r1, r5)
            goto L_0x05d4
        L_0x05d2:
            r14 = r28
        L_0x05d4:
            boolean r1 = r2.mo100981T3()
            if (r1 != 0) goto L_0x05ee
            java.lang.String r1 = r15.f285377i
            com.tencent.mm.storage.f4$b r1 = com.tencent.p014mm.storage.C72963f4.C72964b.m85654f(r1)
            java.lang.String r1 = r1.f212675a
            boolean r1 = com.tencent.p014mm.storage.C72996z1.m85843n5(r1)
            if (r1 == 0) goto L_0x05eb
            r5 = 66
            goto L_0x05f0
        L_0x05eb:
            r5 = 42
            goto L_0x05f0
        L_0x05ee:
            r5 = 67
        L_0x05f0:
            pc0.a0$f r1 = pc0.C100760a0.m131931a(r4)
            r1.f295187a = r4
            java.lang.String r2 = r15.f285377i
            r1.f295189c = r2
            r1.f295190d = r5
            r2 = 1
            r1.f295191e = r2
            r1.f295194h = r12
            pc0.f r2 = new pc0.f
            r2.<init>()
            long r3 = r15.f285374f
            r2.f295214b = r3
            android.content.Intent r3 = r44.getIntent()
            java.lang.String r4 = "msg_forward_sns_obj_id"
            java.lang.String r3 = r3.getStringExtra(r4)
            r2.f295215c = r3
            r1.f295206t = r2
            pc0.a0$b r1 = r1.mo140195a()
            r1.mo123694a()
            goto L_0x069d
        L_0x0622:
            r4 = r2
            r19 = r6
            r12 = 4
            r23 = 3
            java.lang.String r1 = r15.f285375g
            int r2 = r15.f285380o
            java.lang.String r1 = kd0.C76552z.m92083u(r4, r1, r2)
            kd0.g r2 = new kd0.g
            r3 = 1
            r2.<init>(r1, r3)
            ob0.b0 r1 = eb0.C97625j3.m125815e()
            r1.mo123460f(r2)
            goto L_0x0675
        L_0x063e:
            r4 = r2
            r19 = r6
            r12 = 4
            r23 = 3
            java.lang.String r1 = r15.f285377i
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.processXml(r1)
            r2 = 0
            com.tencent.mm.message.l$b r1 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r1, r2)
            if (r1 != 0) goto L_0x0659
            java.lang.String r1 = "transfer app message error: app content null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r1)
            r1 = 0
            goto L_0x069f
        L_0x0659:
            r15.mo136237S7(r4, r1, r2, r2)
            goto L_0x0675
        L_0x065d:
            r4 = r2
            r19 = r6
            r1 = 0
            r12 = 4
            r23 = 3
            boolean r2 = r15.mo136235Q7(r4, r1)
            r1 = r2
            goto L_0x069f
        L_0x066a:
            r4 = r2
            r19 = r6
            r12 = 4
            r23 = 3
            java.lang.String r1 = r15.f285377i
            r15.mo136236R7(r4, r1)
        L_0x0675:
            r1 = 1
            goto L_0x069f
        L_0x0677:
            r4 = r2
            r19 = r6
            r12 = 4
            r23 = 3
            boolean r1 = r15.mo136234P7(r4)
            goto L_0x069f
        L_0x0682:
            r4 = r2
            r40 = r5
            r19 = r6
            r12 = 4
            r23 = 3
            com.tencent.mm.sdk.platformtools.MMHandlerThread r1 = f40.C86709a0.m107525e()
            r1.setHighPriority()
            zt3.t r1 = zt3.C119157j.f356862d
            rn3.r r2 = new rn3.r
            r2.<init>(r15, r4)
            zt3.j r1 = (zt3.C119157j) r1
            r1.mo183876g(r2, r14)
        L_0x069d:
            r1 = r40
        L_0x069f:
            boolean r2 = r15.f285347E
            if (r2 == 0) goto L_0x06bc
            if (r19 == 0) goto L_0x06bc
            com.tencent.mm.ui.chatting.b1$g r2 = com.tencent.p014mm.p136ui.chatting.C73313b1.f215414a
            java.lang.ref.WeakReference<s90.o> r3 = r2.f215427c
            if (r3 == 0) goto L_0x06bc
            java.lang.Object r3 = r3.get()
            if (r3 == 0) goto L_0x06bc
            java.lang.ref.WeakReference<s90.o> r2 = r2.f215427c
            java.lang.Object r2 = r2.get()
            s90.o r2 = (s90.C77632o) r2
            r2.mo22502r7(r0)
        L_0x06bc:
            r5 = r1
        L_0x06bd:
            r1 = r36
            r3 = 4
            r6 = 12
            r12 = 1
            r13 = 2
            goto L_0x010e
        L_0x06c6:
            r40 = r5
            r12 = 4
            r23 = 3
            java.util.List<java.lang.String> r0 = r15.f285376h
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            int r0 = r15.f285373e
            switch(r0) {
                case 0: goto L_0x06df;
                case 1: goto L_0x08fd;
                case 2: goto L_0x06df;
                case 3: goto L_0x06da;
                case 4: goto L_0x06df;
                case 5: goto L_0x06df;
                case 6: goto L_0x06df;
                case 7: goto L_0x06df;
                case 8: goto L_0x06df;
                case 9: goto L_0x06df;
                case 10: goto L_0x06df;
                case 11: goto L_0x08fd;
                case 12: goto L_0x06df;
                case 13: goto L_0x06df;
                case 14: goto L_0x06df;
                case 15: goto L_0x06da;
                case 16: goto L_0x06df;
                case 17: goto L_0x06da;
                case 18: goto L_0x06df;
                case 19: goto L_0x06df;
                case 20: goto L_0x06df;
                case 21: goto L_0x06df;
                case 22: goto L_0x06df;
                case 23: goto L_0x06df;
                case 24: goto L_0x06df;
                case 25: goto L_0x06df;
                case 26: goto L_0x06df;
                case 27: goto L_0x06df;
                case 28: goto L_0x06df;
                case 29: goto L_0x06df;
                case 30: goto L_0x06df;
                case 31: goto L_0x06df;
                case 32: goto L_0x06df;
                case 33: goto L_0x06df;
                default: goto L_0x06da;
            }
        L_0x06da:
            r44.finish()
            goto L_0x08fd
        L_0x06df:
            r2 = 2
            if (r0 == r2) goto L_0x06eb
            r2 = 16
            if (r0 != r2) goto L_0x06e7
            goto L_0x06eb
        L_0x06e7:
            r5 = r40
            goto L_0x07ef
        L_0x06eb:
            java.lang.String r0 = r15.f285377i
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.processXml(r0)
            r2 = 0
            com.tencent.mm.message.l$b r3 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r0, r2)
            if (r3 == 0) goto L_0x0773
            int r0 = r3.f195582i
            if (r0 != r4) goto L_0x0773
            java.lang.String r0 = r3.f195586j
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0773
            java.lang.String r0 = r3.f195586j     // Catch:{ UnsupportedEncodingException -> 0x0710 }
            java.lang.String r2 = "UTF-8"
            java.lang.String r10 = java.net.URLEncoder.encode(r0, r2)     // Catch:{ UnsupportedEncodingException -> 0x0710 }
            r5 = r40
            r2 = 0
            goto L_0x0719
        L_0x0710:
            r0 = move-exception
            r2 = 0
            java.lang.Object[] r5 = new java.lang.Object[r2]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r14, r0, r10, r5)
            r5 = r40
        L_0x0719:
            if (r5 == 0) goto L_0x071d
            r0 = 1
            goto L_0x071e
        L_0x071d:
            r0 = 2
        L_0x071e:
            r8 = 6
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r9 = 13378(0x3442, float:1.8747E-41)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r9)
            r8[r2] = r11
            java.lang.String r2 = r3.f195586j
            r3 = 1
            r8[r3] = r2
            long r2 = r15.f285364T
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r3 = 2
            r8[r3] = r2
            int r2 = r15.f285362S
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r8[r23] = r2
            r8[r12] = r7
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r8[r4] = r2
            java.lang.String r2 = "report(%s), url : %s, clickTimestamp : %d, scene : %d, actionType : %d, flag : %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r14, r2, r8)
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r3 = new java.lang.Object[r4]
            r4 = 0
            r3[r4] = r10
            long r10 = r15.f285364T
            java.lang.Long r4 = java.lang.Long.valueOf(r10)
            r8 = 1
            r3[r8] = r4
            int r4 = r15.f285362S
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r8 = 2
            r3[r8] = r4
            r3[r23] = r7
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3[r12] = r0
            r2.mo160131h(r9, r3)
            goto L_0x07ef
        L_0x0773:
            r5 = r40
            if (r5 != 0) goto L_0x07ef
            if (r3 == 0) goto L_0x07ef
            int r0 = r3.f195582i
            r2 = 33
            if (r0 != r2) goto L_0x07ef
            com.tencent.mm.autogen.events.AppBrandOuterMenuClickReportEvent r0 = new com.tencent.mm.autogen.events.AppBrandOuterMenuClickReportEvent
            r0.<init>()
            com.tencent.mm.autogen.events.AppBrandOuterMenuClickReportEvent$a r2 = r0.f236137d
            int r4 = r15.f285369W
            r2.f236141d = r4
            int r7 = r15.f285370X
            r2.f236149l = r7
            r7 = 2
            if (r7 != r4) goto L_0x07ac
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = r15.f285368V
            r4.append(r7)
            java.lang.String r7 = ":"
            r4.append(r7)
            java.lang.String r7 = r15.f285366U
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            r2.f236143f = r4
            goto L_0x07b0
        L_0x07ac:
            java.lang.String r4 = r15.f285368V
            r2.f236143f = r4
        L_0x07b0:
            java.lang.String r2 = "@chatroom"
            boolean r2 = r1.endsWith(r2)
            if (r2 == 0) goto L_0x07bf
            com.tencent.mm.autogen.events.AppBrandOuterMenuClickReportEvent$a r2 = r0.f236137d
            r4 = 2
            r2.f236145h = r4
            r4 = 1
            goto L_0x07c4
        L_0x07bf:
            com.tencent.mm.autogen.events.AppBrandOuterMenuClickReportEvent$a r2 = r0.f236137d
            r4 = 1
            r2.f236145h = r4
        L_0x07c4:
            com.tencent.mm.autogen.events.AppBrandOuterMenuClickReportEvent$a r2 = r0.f236137d
            int r7 = r3.f195653z2
            int r7 = r7 + r4
            r2.f236142e = r7
            java.lang.String r4 = r3.f195569e2
            r2.f236144g = r4
            java.lang.String r4 = r3.f195573f2
            r2.f236138a = r4
            java.lang.String r4 = r3.f195577g2
            r2.f236139b = r4
            int r4 = r3.f195467A2
            r2.f236140c = r4
            r2.f236146i = r10
            long r7 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            r2.f236147j = r7
            com.tencent.mm.autogen.events.AppBrandOuterMenuClickReportEvent$a r2 = r0.f236137d
            r4 = 2
            r2.f236148k = r4
            java.lang.String r3 = r3.f195589j2
            r2.f236150m = r3
            r0.publish()
        L_0x07ef:
            int r0 = r15.f285373e
            r2 = 12
            if (r0 == r2) goto L_0x0808
            r2 = 18
            if (r0 == r2) goto L_0x07fa
            goto L_0x0859
        L_0x07fa:
            java.lang.String r0 = r15.f285377i
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.processXml(r0)
            r2 = 0
            com.tencent.mm.message.l$b r0 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r0, r2)
            r15.mo136231M7(r0, r5)
        L_0x0808:
            java.util.ArrayList<java.lang.Long> r0 = r15.f285378j
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r0)
            if (r0 != 0) goto L_0x0859
            java.util.ArrayList<java.lang.Long> r0 = r15.f285378j
            java.util.Iterator r0 = r0.iterator()
        L_0x0816:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0859
            java.lang.Object r2 = r0.next()
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            eb0.c r4 = eb0.C97625j3.m125812b()
            g62.l r4 = r4.mo105911z()
            com.tencent.mm.storage.g4 r4 = (com.tencent.p014mm.storage.C72972g4) r4
            com.tencent.mm.storage.f4 r2 = r4.b00(r2)
            boolean r3 = r2.mo101020w3()
            if (r3 == 0) goto L_0x0816
            java.lang.String r3 = r2.getContent()
            if (r3 == 0) goto L_0x0816
            java.lang.String r2 = r2.getContent()
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.processXml(r2)
            r3 = 0
            com.tencent.mm.message.l$b r2 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r2, r3)
            if (r2 == 0) goto L_0x0816
            int r3 = r2.f195582i
            r4 = 51
            if (r3 != r4) goto L_0x0816
            r15.mo136231M7(r2, r5)
            goto L_0x0816
        L_0x0859:
            if (r5 == 0) goto L_0x08fa
            boolean r0 = r15.f285384r
            if (r0 == 0) goto L_0x0869
            r2 = 2131831222(0x7f1129b6, float:1.9295463E38)
            java.lang.String r0 = r15.getString(r2)
            com.tencent.p014mm.p136ui.widget.snackbar.C75026b.m89951a(r15, r0)
        L_0x0869:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.List<java.lang.String> r3 = r15.f285376h
            r2.addAll(r3)
            java.lang.String r3 = "SendMsgUsernames"
            r0.putStringArrayListExtra(r3, r2)
            java.lang.String r2 = "sendResult"
            r3 = 0
            r0.putExtra(r2, r3)
            r15.setResult(r6, r0)
            boolean r0 = r15.f285371Y
            if (r0 == 0) goto L_0x089e
            com.tencent.mm.sdk.platformtools.MMHandler r0 = r15.f285365T0
            rn3.o r2 = new rn3.o
            r2.<init>(r15)
            boolean r3 = r15.f285384r
            if (r3 == 0) goto L_0x0899
            r5 = 1800(0x708, double:8.893E-321)
            goto L_0x089b
        L_0x0899:
            r5 = 0
        L_0x089b:
            r0.postDelayed(r2, r5)
        L_0x089e:
            boolean r0 = r15.f285383q
            if (r0 == 0) goto L_0x08fd
            boolean r0 = r15.f285357P
            if (r0 != 0) goto L_0x08fd
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.tencent.mm.ui.chatting.ChattingUI> r2 = com.tencent.p014mm.p136ui.chatting.ChattingUI.class
            r0.<init>(r15, r2)
            r2 = 67108864(0x4000000, float:1.5046328E-36)
            r0.addFlags(r2)
            java.lang.String r2 = "Chat_User"
            r0.putExtra(r2, r1)
            int r1 = r15.f285382p0
            java.lang.String r2 = "scene_from"
            r0.putExtra(r2, r1)
            k20.a r9 = new k20.a
            r9.<init>()
            r9.mo10233c(r0)
            java.lang.Object[] r2 = r9.mo10232b()
            java.lang.String r3 = "com/tencent/mm/ui/transmit/MsgRetransmitUI"
            java.lang.String r4 = "done"
            java.lang.String r5 = "(Ljava/lang/String;)V"
            java.lang.String r6 = "Undefined"
            java.lang.String r7 = "startActivity"
            java.lang.String r8 = "(Landroid/content/Intent;)V"
            r1 = r44
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            r1 = 0
            java.lang.Object r0 = r9.mo10231a(r1)
            android.content.Intent r0 = (android.content.Intent) r0
            r15.startActivity(r0)
            java.lang.String r2 = "com/tencent/mm/ui/transmit/MsgRetransmitUI"
            java.lang.String r3 = "done"
            java.lang.String r4 = "(Ljava/lang/String;)V"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "startActivity"
            java.lang.String r7 = "(Landroid/content/Intent;)V"
            r1 = r44
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x08fd
        L_0x08fa:
            r44.finish()
        L_0x08fd:
            long r0 = r15.f285374f
            int r2 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r2 == 0) goto L_0x0966
            eb0.c r0 = eb0.C97625j3.m125812b()
            g62.l r0 = r0.mo105911z()
            long r1 = r15.f285374f
            com.tencent.mm.storage.g4 r0 = (com.tencent.p014mm.storage.C72972g4) r0
            com.tencent.mm.storage.f4 r0 = r0.b00(r1)
            com.tencent.mm.autogen.mmdata.rpt.MessageSecurityStruct r1 = new com.tencent.mm.autogen.mmdata.rpt.MessageSecurityStruct
            r1.<init>()
            int r2 = r0.mo108769t2()
            r3 = 1
            if (r2 != r3) goto L_0x0928
            f40.e r2 = f40.C86709a0.m107523b()
            java.lang.String r2 = r2.mo121112j()
            goto L_0x093f
        L_0x0928:
            java.lang.String r2 = r0.mo108768t()
            boolean r2 = com.tencent.p014mm.storage.C72996z1.m85820U5(r2)
            if (r2 == 0) goto L_0x093b
            java.lang.String r2 = r0.getContent()
            java.lang.String r2 = eb0.C75604z3.m90847s(r2)
            goto L_0x093f
        L_0x093b:
            java.lang.String r2 = r0.mo108768t()
        L_0x093f:
            r3 = 4
            r1.f265692g = r3
            long r3 = r15.f285374f
            r1.f265689d = r3
            int r3 = r0.getType()
            long r3 = (long) r3
            r1.f265694i = r3
            java.lang.String r3 = "SendUser"
            r4 = 1
            java.lang.String r2 = r1.mo86045b(r3, r2, r4)
            r1.f265691f = r2
            java.lang.String r0 = r0.mo108768t()
            java.lang.String r2 = "ChatName"
            java.lang.String r0 = r1.mo86045b(r2, r0, r4)
            r1.f265690e = r0
            r1.mo86054n()
        L_0x0966:
            r5 = r15
            goto L_0x0d08
        L_0x0969:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0969 }
            throw r0
        L_0x096c:
            r12 = 4
            r23 = 3
            java.util.List<java.lang.String> r1 = r15.f285376h
            java.lang.String r3 = "processVideoTransfer"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r3)
            int r3 = r15.f285373e
            if (r2 != r3) goto L_0x099f
            java.lang.String r2 = r15.f285375g
            boolean r2 = hd0.C98429r0.m127812c(r2)
            if (r2 == 0) goto L_0x099f
            android.content.res.Resources r1 = r44.getResources()
            r2 = 2131835640(0x7f113af8, float:1.9304424E38)
            java.lang.String r1 = r1.getString(r2)
            r2 = 0
            com.tencent.p014mm.p136ui.widget.snackbar.C75026b.m89953c(r15, r1, r10, r2)
            com.tencent.mm.sdk.platformtools.MMHandler r1 = r15.f285365T0
            rn3.x r2 = new rn3.x
            r2.<init>(r15)
            r3 = 1800(0x708, double:8.893E-321)
            r1.postDelayed(r2, r3)
            goto L_0x0a03
        L_0x099f:
            r2 = 0
            r3 = 1800(0x708, double:8.893E-321)
            java.lang.Class<rz.u> r19 = p682rz.C101491u.class
            com.tencent.mm.ui.transmit.MsgRetransmitUI$i r13 = new com.tencent.mm.ui.transmit.MsgRetransmitUI$i
            r13.<init>(r2)
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            r13.f285445a = r2
            r2.addAll(r1)
            di3.d r2 = di3.C86312j.m106911c(r19)
            rz.u r2 = (p682rz.C101491u) r2
            java.lang.String r5 = r15.f285375g
            hd0.n0 r11 = r2.mo140806Zd(r5)
            if (r11 != 0) goto L_0x0a08
            eb0.c r2 = eb0.C97625j3.m125812b()
            g62.l r2 = r2.mo105911z()
            long r5 = r15.f285374f
            com.tencent.mm.storage.g4 r2 = (com.tencent.p014mm.storage.C72972g4) r2
            com.tencent.mm.storage.f4 r2 = r2.b00(r5)
            boolean r2 = r2.mo100983V3()
            if (r2 == 0) goto L_0x0a08
            java.util.Iterator r1 = r1.iterator()
        L_0x09db:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x09eb
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            r15.mo136234P7(r2)
            goto L_0x09db
        L_0x09eb:
            boolean r1 = r15.f285384r
            if (r1 == 0) goto L_0x09f9
            r1 = 2131831222(0x7f1129b6, float:1.9295463E38)
            java.lang.String r1 = r15.getString(r1)
            com.tencent.p014mm.p136ui.widget.snackbar.C75026b.m89951a(r15, r1)
        L_0x09f9:
            com.tencent.mm.sdk.platformtools.MMHandler r1 = r15.f285365T0
            rn3.s r2 = new rn3.s
            r2.<init>(r15)
            r1.postDelayed(r2, r3)
        L_0x0a03:
            r33 = r0
            r5 = r15
            goto L_0x0ceb
        L_0x0a08:
            java.util.Iterator r18 = r1.iterator()
            r7 = r15
            r8 = r7
        L_0x0a0e:
            boolean r1 = r18.hasNext()
            if (r1 == 0) goto L_0x0ce7
            java.lang.Object r1 = r18.next()
            r9 = r1
            java.lang.String r9 = (java.lang.String) r9
            r6 = 2
            java.lang.Object[] r1 = new java.lang.Object[r6]
            if (r11 == 0) goto L_0x0a25
            java.lang.String r2 = r11.mo137700d()
            goto L_0x0a26
        L_0x0a25:
            r2 = r10
        L_0x0a26:
            r3 = 0
            r1[r3] = r2
            if (r11 == 0) goto L_0x0a32
            int r2 = r11.f288562i
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0a33
        L_0x0a32:
            r2 = r10
        L_0x0a33:
            r3 = 1
            r1[r3] = r2
            java.lang.String r2 = "info[%s, %s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r2, r1)
            if (r11 == 0) goto L_0x0b29
            int r1 = r11.f288562i
            r2 = 199(0xc7, float:2.79E-43)
            if (r1 != r2) goto L_0x0b29
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r1 = "start copy video"
            com.tencent.p014mm.sdk.platformtools.Log.printInfoStack(r14, r1, r2)
            com.tencent.mm.ui.transmit.MsgRetransmitUI$g r5 = new com.tencent.mm.ui.transmit.MsgRetransmitUI$g
            r5.<init>()
            r1 = 2131821704(0x7f110488, float:1.9276159E38)
            java.lang.String r2 = r8.getString(r1)
            r1 = 2131821681(0x7f110471, float:1.9276112E38)
            java.lang.String r3 = r8.getString(r1)
            com.tencent.mm.ui.transmit.b r4 = new com.tencent.mm.ui.transmit.b
            r4.<init>(r8, r5)
            r20 = 1
            r24 = 1
            r1 = r44
            r25 = r4
            r4 = r20
            r12 = r5
            r5 = r24
            r24 = 2
            r6 = r25
            qo3.i0 r1 = nj3.C76879j.m92723Q(r1, r2, r3, r4, r5, r6)
            r8.f285385s = r1
            r12.f285415b = r8
            java.lang.String r2 = r8.f285375g
            r12.f285420g = r2
            r12.f285414a = r1
            int r1 = r8.f285388v
            r12.f285417d = r1
            int r1 = r8.f285380o
            r12.f285418e = r1
            int r1 = r8.f285373e
            r12.f285419f = r1
            r1 = 0
            r12.f285424k = r1
            r12.f285422i = r9
            r6 = 1
            r12.f285425l = r6
            boolean r1 = r8.f285384r
            r12.f285426m = r1
            r12.f285429p = r13
            di3.d r1 = di3.C86312j.m106911c(r19)
            rz.u r1 = (p682rz.C101491u) r1
            java.lang.String r2 = r8.f285375g
            hd0.n0 r1 = r1.mo140806Zd(r2)
            if (r1 == 0) goto L_0x0ac3
            te3.tc4 r2 = r1.f288535C
            if (r2 == 0) goto L_0x0ac3
            java.lang.String r2 = "msgRetrans streamvideo"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r14, r2)
            te3.tc4 r2 = r1.f288535C
            r12.f285428o = r2
            java.lang.String r2 = r1.mo137707k()
            r12.f285430q = r2
            long r2 = r1.f288567n
            r12.f285431r = r2
        L_0x0ac3:
            if (r1 == 0) goto L_0x0ac9
            java.lang.String r1 = r1.f288543K
            r12.f285433t = r1
        L_0x0ac9:
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r12.execute(r2)
            eb0.s5 r1 = eb0.C116756s5.m164691d()
            int r2 = eb0.C116756s5.f350055d
            r3 = 0
            r1.mo180727a(r2, r3)
            long r1 = r8.f285374f
            int r3 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r3 != 0) goto L_0x0ae0
            goto L_0x0b17
        L_0x0ae0:
            eb0.c r1 = eb0.C97625j3.m125812b()
            g62.l r1 = r1.mo105911z()
            long r2 = r8.f285374f
            com.tencent.mm.storage.g4 r1 = (com.tencent.p014mm.storage.C72972g4) r1
            com.tencent.mm.storage.f4 r1 = r1.b00(r2)
            boolean r2 = com.tencent.p014mm.storage.C72996z1.m85820U5(r9)
            if (r2 == 0) goto L_0x0af9
            com.tencent.mm.ui.chatting.a$b r3 = com.tencent.p014mm.p136ui.chatting.C73304a.C73306b.Chatroom
            goto L_0x0afb
        L_0x0af9:
            com.tencent.mm.ui.chatting.a$b r3 = com.tencent.p014mm.p136ui.chatting.C73304a.C73306b.Chat
        L_0x0afb:
            boolean r4 = r8.f285356N
            if (r4 == 0) goto L_0x0b02
            com.tencent.mm.ui.chatting.a$c r4 = com.tencent.p014mm.p136ui.chatting.C73304a.C73307c.Full
            goto L_0x0b04
        L_0x0b02:
            com.tencent.mm.ui.chatting.a$c r4 = com.tencent.p014mm.p136ui.chatting.C73304a.C73307c.Samll
        L_0x0b04:
            if (r2 == 0) goto L_0x0b13
            java.lang.Class<wo.b> r2 = p740wo.C53193b.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            wo.b r2 = (p740wo.C53193b) r2
            int r2 = r2.mo73729p1(r9)
            goto L_0x0b14
        L_0x0b13:
            r2 = 0
        L_0x0b14:
            com.tencent.p014mm.p136ui.chatting.C73304a.m86447c(r3, r4, r1, r2)
        L_0x0b17:
            r33 = r0
            r0 = r8
            r4 = r10
            r29 = r11
            r20 = r13
            r2 = r14
            r5 = r15
            r6 = 4
            r8 = 2
            r9 = 1
            r10 = 0
            r28 = 0
            goto L_0x0cda
        L_0x0b29:
            r6 = 1
            r24 = 2
            if (r11 != 0) goto L_0x0b35
            java.lang.String r1 = "checkVideoCdnInfo info is null !!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r14, r1)
            r12 = 0
            goto L_0x0b58
        L_0x0b35:
            java.lang.String r1 = r11.mo137705i()
            java.lang.String r2 = "msg"
            r12 = 0
            java.util.Map r1 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r1, r2, r12)
            if (r1 != 0) goto L_0x0b49
            java.lang.String r1 = "%s cdntra parse video recv xml failed"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r14, r1)
            goto L_0x0b58
        L_0x0b49:
            java.lang.String r2 = ".msg.videomsg.$cdnvideourl"
            java.lang.Object r2 = r1.get(r2)
            r5 = r2
            java.lang.String r5 = (java.lang.String) r5
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r2 == 0) goto L_0x0b5b
        L_0x0b58:
            r12 = 0
            goto L_0x0bf5
        L_0x0b5b:
            java.lang.String r2 = ".msg.videomsg.$aeskey"
            java.lang.Object r2 = r1.get(r2)
            r4 = r2
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r2 = ".msg.videomsg.$md5"
            java.lang.Object r2 = r1.get(r2)
            r3 = r2
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r2 = ".msg.videomsg.$newmd5"
            java.lang.Object r2 = r1.get(r2)
            r21 = r2
            java.lang.String r21 = (java.lang.String) r21
            java.lang.String r2 = ".msg.videomsg.$cdnrawvideoaeskey"
            java.lang.Object r2 = r1.get(r2)
            r25 = r2
            java.lang.String r25 = (java.lang.String) r25
            java.lang.String r2 = ".msg.videomsg.$cdnrawvideourl"
            java.lang.Object r2 = r1.get(r2)
            r26 = r2
            java.lang.String r26 = (java.lang.String) r26
            java.lang.String r2 = ".msg.videomsg.$rawmd5"
            java.lang.Object r2 = r1.get(r2)
            r27 = r2
            java.lang.String r27 = (java.lang.String) r27
            java.lang.String r2 = ".msg.videomsg.$rawlength"
            java.lang.Object r2 = r1.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            r12 = 0
            int r22 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r12)
            java.lang.String r2 = ".msg.videomsg.$length"
            java.lang.Object r2 = r1.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            int r29 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r12)
            java.lang.String r2 = ".msg.videomsg.$playlength"
            java.lang.Object r2 = r1.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            int r30 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r12)
            java.lang.String r2 = ".msg.videomsg.$cdnthumblength"
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            int r31 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r1, (int) r12)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r1 == 0) goto L_0x0c08
            java.lang.Class<rz.s> r1 = p682rz.C101488s.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            rz.s r1 = (p682rz.C101488s) r1
            rz.t r1 = r1.Kj0()
            java.lang.String r2 = r11.mo137700d()
            hd0.o0 r1 = (hd0.C98410o0) r1
            java.lang.String r1 = r1.mo137728q(r2)
            boolean r1 = com.tencent.p014mm.vfs.C86013q1.m106450k(r1)
            if (r1 != 0) goto L_0x0c08
            com.tencent.mm.plugin.report.service.n r32 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r33 = 1328(0x530, double:6.56E-321)
            r35 = 1
            r37 = 1
            r39 = 1
            r32.idkeyStat(r33, r35, r37, r39)
        L_0x0bf5:
            r33 = r0
            r0 = r8
            r4 = r10
            r29 = r11
            r20 = r13
            r2 = r14
            r5 = r15
            r6 = 4
            r8 = 2
            r9 = 1
            r10 = 0
            r28 = 0
            r15 = r7
            goto L_0x0cc7
        L_0x0c08:
            gi.g r8 = new gi.g
            r8.<init>()
            java.lang.String r1 = "task_MsgRetransmitUI_3"
            r8.f287660d = r1
            com.tencent.mm.ui.transmit.c r7 = new com.tencent.mm.ui.transmit.c
            r1 = r7
            r2 = r44
            r32 = r3
            r3 = r26
            r26 = r4
            r4 = r5
            r33 = r0
            r0 = r5
            r5 = r25
            r25 = 1
            r6 = r26
            r34 = r0
            r0 = r7
            r7 = r31
            r41 = r8
            r8 = r22
            r22 = r9
            r28 = 0
            r9 = r29
            r42 = r10
            r10 = r22
            r29 = r11
            r11 = r27
            r12 = r32
            r20 = r13
            r13 = r21
            r43 = r14
            r14 = r30
            r15 = r29
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1 = r41
            r1.f287662f = r0
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r4 = r42
            r0.append(r4)
            r5 = r44
            long r6 = r5.f285374f
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r6 = "checkExist"
            r7 = r22
            java.lang.String r0 = com.tencent.p014mm.modelcdntran.C1297x.m1387b(r6, r2, r7, r0)
            r1.field_mediaId = r0
            r2 = r34
            r1.field_fileId = r2
            r0 = r26
            r1.field_aesKey = r0
            r3 = r32
            r1.field_filemd5 = r3
            r6 = 4
            r1.field_fileType = r6
            r1.field_talker = r7
            r8 = 2
            r1.field_priority = r8
            r1.field_svr_signature = r4
            r9 = 1
            r1.field_onlycheckexist = r9
            r1.field_trysafecdn = r9
            java.lang.Object[] r7 = new java.lang.Object[r6]
            r10 = 0
            r7[r10] = r2
            r7[r9] = r3
            r7[r8] = r0
            java.lang.String r0 = r29.mo137705i()
            r7[r23] = r0
            java.lang.String r0 = "field_fileId:%s, md5:%s, field_aesKey:%s, xml:%s"
            r2 = r43
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r0, r7)
            java.lang.Class<qo.l> r0 = p663qo.C101213l.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            qo.l r0 = (p663qo.C101213l) r0
            boolean r0 = r0.if0(r1)
            if (r0 != 0) goto L_0x0cbf
            java.lang.String r0 = "check exist fail! download video before retransmit"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            r44.finish()
            r0 = r5
            r15 = r0
            r12 = 0
            goto L_0x0cc7
        L_0x0cbf:
            r5.f285384r = r10
            r44.finish()
            r0 = r5
            r15 = r0
            r12 = 1
        L_0x0cc7:
            if (r12 != 0) goto L_0x0cd9
            zt3.t r1 = zt3.C119157j.f356862d
            com.tencent.mm.ui.transmit.a r3 = new com.tencent.mm.ui.transmit.a
            r3.<init>(r5)
            zt3.j r1 = (zt3.C119157j) r1
            java.lang.String r7 = "MicroMsg.MsgRetransmitUI"
            r1.mo183876g(r3, r7)
            r5.f285384r = r10
        L_0x0cd9:
            r7 = r15
        L_0x0cda:
            r8 = r0
            r14 = r2
            r10 = r4
            r15 = r5
            r13 = r20
            r11 = r29
            r0 = r33
            r12 = 4
            goto L_0x0a0e
        L_0x0ce7:
            r33 = r0
            r5 = r15
            r15 = r7
        L_0x0ceb:
            boolean r0 = r15.f285347E
            if (r0 == 0) goto L_0x0d08
            com.tencent.mm.ui.chatting.b1$g r0 = com.tencent.p014mm.p136ui.chatting.C73313b1.f215414a
            java.lang.ref.WeakReference<s90.o> r1 = r0.f215427c
            if (r1 == 0) goto L_0x0d08
            java.lang.Object r1 = r1.get()
            if (r1 == 0) goto L_0x0d08
            java.lang.ref.WeakReference<s90.o> r0 = r0.f215427c
            java.lang.Object r0 = r0.get()
            s90.o r0 = (s90.C77632o) r0
            r1 = r33
            r0.mo22502r7(r1)
        L_0x0d08:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.transmit.MsgRetransmitUI.mo136228J7():void");
    }

    /* renamed from: K7 */
    public final void mo136229K7() {
        View view;
        int i = this.f285373e;
        if (i == 2 || i == 16) {
            String str = this.f285376h.get(0);
            String string = getIntent().getExtras().getString(ConstantsAPI.APP_PACKAGE);
            C44561j jVar = new C44561j();
            jVar.field_packageName = string;
            C72709y1.yx0().get(jVar, "packageName");
            WXMediaMessage wXMediaMessage = new SendMessageToWX.Req(getIntent().getExtras()).message;
            C97262h hVar = new C97262h(new C97258d(this));
            byte[] bArr = wXMediaMessage.thumbData;
            Bitmap decodeByteArray = bArr == null ? null : BitmapUtil.decodeByteArray(bArr);
            switch (wXMediaMessage.mediaObject.type()) {
                case 1:
                    view = View.inflate(this, C0966R.C0971layout.f6520h3, (ViewGroup) null);
                    ((TextView) view.findViewById(C0966R.C0970id.kpm)).setText(wXMediaMessage.title);
                    break;
                case 2:
                    view = View.inflate(this, C0966R.C0971layout.f6519h2, (ViewGroup) null);
                    ((ImageView) view.findViewById(C0966R.C0970id.kk6)).setImageBitmap(decodeByteArray);
                    ((TextView) view.findViewById(C0966R.C0970id.kpm)).setText(wXMediaMessage.title);
                    break;
                case 3:
                    view = View.inflate(this, C0966R.C0971layout.f6518h1, (ViewGroup) null);
                    ((ImageView) view.findViewById(C0966R.C0970id.kk6)).setImageBitmap(decodeByteArray);
                    ((TextView) view.findViewById(C0966R.C0970id.kpm)).setText(wXMediaMessage.title);
                    ((TextView) view.findViewById(C0966R.C0970id.c2h)).setText(wXMediaMessage.description);
                    break;
                case 4:
                    view = View.inflate(this, C0966R.C0971layout.f6518h1, (ViewGroup) null);
                    ((ImageView) view.findViewById(C0966R.C0970id.kk6)).setImageBitmap(decodeByteArray);
                    ((TextView) view.findViewById(C0966R.C0970id.kpm)).setText(wXMediaMessage.title);
                    ((TextView) view.findViewById(C0966R.C0970id.c2h)).setText(wXMediaMessage.description);
                    break;
                case 5:
                    view = View.inflate(this, C0966R.C0971layout.f6518h1, (ViewGroup) null);
                    ((ImageView) view.findViewById(C0966R.C0970id.kk6)).setImageBitmap(decodeByteArray);
                    ((TextView) view.findViewById(C0966R.C0970id.kpm)).setText(wXMediaMessage.title);
                    ((TextView) view.findViewById(C0966R.C0970id.c2h)).setText(wXMediaMessage.description);
                    break;
                case 6:
                    view = View.inflate(this, C0966R.C0971layout.f6518h1, (ViewGroup) null);
                    ((ImageView) view.findViewById(C0966R.C0970id.kk6)).setImageBitmap(decodeByteArray);
                    ((TextView) view.findViewById(C0966R.C0970id.kpm)).setText(wXMediaMessage.title);
                    ((TextView) view.findViewById(C0966R.C0970id.c2h)).setText(wXMediaMessage.description);
                    break;
                case 7:
                    view = View.inflate(this, C0966R.C0971layout.f6518h1, (ViewGroup) null);
                    ((ImageView) view.findViewById(C0966R.C0970id.kk6)).setImageBitmap(decodeByteArray);
                    ((TextView) view.findViewById(C0966R.C0970id.kpm)).setText(wXMediaMessage.title);
                    ((TextView) view.findViewById(C0966R.C0970id.c2h)).setText(wXMediaMessage.description);
                    break;
                default:
                    Log.m105920e("MicroMsg.SendAppMessage", "unkown app message type, skipped, type=" + wXMediaMessage.mediaObject.type());
                    return;
            }
            View view2 = view;
            ((TextView) view2.findViewById(C0966R.C0970id.jyt)).setText(((C79138l) C86312j.m106911c(C79138l.class)).mo74011hv(this, jVar));
            hVar.f285472a = C76879j.m92747r(this, (String) null, view2, getString(C0966R.string.a2s), getString(C0966R.string.f7926wf), new C97260f(hVar), new C97261g(hVar));
        }
    }

    /* renamed from: L7 */
    public final void mo136230L7() {
        String str = this.f285376h.get(0);
        if (!mo136225G7()) {
            finish();
            return;
        }
        int i = this.f285373e;
        if (i != 0) {
            if (i != 1) {
                if (i == 5) {
                    mo136235Q7(str, true);
                    return;
                } else if (i != 11) {
                    Log.m105925i("MicroMsg.MsgRetransmitUI", "doRetransmitOnSceneShareFromSystemGallery unknown msg type:%d", Integer.valueOf(i));
                    return;
                }
            }
            if (!C114786m0.m161568a(this)) {
                C76879j.m92739j(this, C0966R.string.kaa, C0966R.string.a3h, C0966R.string.a18, C0966R.string.f7926wf, new C101411v(this, str), new C101412w(this));
                return;
            }
            mo136238T7(getIntent(), str);
            return;
        }
        List<String> list = this.f285394z;
        if (list != null && list.size() > 0) {
            this.f285345C = this.f285394z.size();
        }
        this.f285343A = new C101398k(this);
        C77398g G = C76879j.m92713G(this, getString(C0966R.string.gxk, new Object[]{1, Integer.valueOf(this.f285345C), 0}), getString(C0966R.string.a3h), true, new C101399l(this));
        this.f285386t = G;
        Log.m105925i("MicroMsg.MsgRetransmitUI", "show uploadImgDialog : %s", G);
        C77398g gVar = this.f285386t;
        if (gVar != null) {
            gVar.setOnCancelListener(new C101400m(this));
            this.f285386t.setCanceledOnTouchOutside(false);
            this.f285386t.mo107526f(-1).setText(C0966R.string.f7926wf);
        }
        ((C119157j) C119157j.f356862d).mo183876g(new C101403n(this, str), "MicroMsg.MsgRetransmitUI");
    }

    /* renamed from: M7 */
    public final void mo136231M7(C68070l.C68072b bVar, boolean z) {
        C64682rk1 rk12;
        if (this.f285393y0 && bVar != null) {
            ArrayList arrayList = new ArrayList(this.f285376h);
            long j = z ? 1 : 2;
            C60166f fVar = (C60166f) bVar.mo93555w(C60166f.class);
            if (fVar != null && (rk12 = fVar.f171710b) != null) {
                ((C60165e4) C86312j.m106911c(C60165e4.class)).mo85159U3(rk12, 7, j, Util.listToString(arrayList, ";"), (C49712hj1) null, (long) arrayList.size());
            }
        }
    }

    /* renamed from: N7 */
    public final boolean mo136232N7(String str) {
        boolean z = true;
        Log.m105925i("MicroMsg.MsgRetransmitUI", "isImage called, fn:%s", str);
        InputStream inputStream = null;
        try {
            InputStream E = C86013q1.m106423E(str);
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                MMBitmapFactory.m98738g(E, (Rect) null, options);
                if (options.outWidth < 0 || options.outHeight < 0) {
                    z = false;
                }
                Util.qualityClose(E);
                return z;
            } catch (FileNotFoundException unused) {
                inputStream = E;
                try {
                    Log.m105929w("MicroMsg.MsgRetransmitUI", "fn:%s not found.", str);
                    Util.qualityClose(inputStream);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    Util.qualityClose(inputStream);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                inputStream = E;
                Util.qualityClose(inputStream);
                throw th;
            }
        } catch (FileNotFoundException unused2) {
            Log.m105929w("MicroMsg.MsgRetransmitUI", "fn:%s not found.", str);
            Util.qualityClose(inputStream);
            return false;
        }
    }

    /* renamed from: O7 */
    public final boolean mo136233O7(byte[] bArr) {
        Log.m105925i("MicroMsg.MsgRetransmitUI", "isImage called, data[0-4]:[%d,%d,%d,%d,%d]", Byte.valueOf(bArr[0]), Byte.valueOf(bArr[1]), Byte.valueOf(bArr[2]), Byte.valueOf(bArr[3]), Byte.valueOf(bArr[4]));
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        MMBitmapFactory.m98733b(bArr, 0, bArr.length, options);
        return options.outWidth >= 0 && options.outHeight >= 0;
    }

    /* renamed from: P7 */
    public final boolean mo136234P7(String str) {
        byte[] bArr = null;
        C68070l.C68072b u = C68070l.C68072b.m80422u(Util.processXml(this.f285377i), (String) null);
        Log.m105919d("MicroMsg.MsgRetransmitUI", "summerbig processAppMessageTransfer msgContent[%s], content[%s]", this.f285377i, u);
        if (u == null) {
            Log.m105920e("MicroMsg.MsgRetransmitUI", "transfer app message error: app content null");
            return false;
        }
        int i = u.f195582i;
        if (i == 53 || i == 57) {
            String str2 = u.f195570f;
            C75592q0.m90789s();
            C100760a0.C100764f a = C100760a0.m131931a(str);
            a.f295187a = str;
            a.f295189c = str2;
            a.f295190d = C45628s0.m50810y(str);
            a.f295191e = 0;
            a.f295194h = 4;
            C100765f fVar = new C100765f();
            fVar.f295215c = getIntent().getStringExtra("msg_forward_sns_obj_id");
            fVar.f295214b = this.f285374f;
            a.f295206t = fVar;
            C100760a0.C89338b a2 = a.mo140195a();
            a2.mo123694a();
            m125192X7(a2, str, Long.valueOf(this.f285374f));
            return true;
        }
        if (i == 101) {
            C72915l lVar = (C72915l) u.mo93555w(C72915l.class);
            lVar.f212517h = 0;
            lVar.f212518i = "";
            u.mo93545f(lVar);
        }
        C72963f4 b002 = ((C72972g4) C97625j3.m125812b().mo105911z()).b00(this.f285374f);
        if (!b002.mo100967F3()) {
            String str3 = this.f285381p;
            if (str3 != null) {
                try {
                    bArr = C86013q1.m106433O(str3, 0, -1);
                    if (!mo136233O7(bArr)) {
                        return false;
                    }
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.MsgRetransmitUI", e, "", new Object[0]);
                    Log.m105921e("MicroMsg.MsgRetransmitUI", "send appmsg to %s, error:%s", str, e.getLocalizedMessage());
                }
            } else if (this.f285350H < 0 && b002.mo108765s2() != null && !b002.mo108765s2().equals("")) {
                try {
                    bArr = C86013q1.m106433O(((C92839m) ((C98201k) C86312j.m106911c(C98201k.class)).mo137277xi()).v10(b002.mo108765s2(), true), 0, -1);
                    if (!mo136233O7(bArr)) {
                        return false;
                    }
                } catch (Exception e2) {
                    Log.m105921e("MicroMsg.MsgRetransmitUI", "send appmsg to %s, error:%s", str, e2.getLocalizedMessage());
                }
            }
            byte[] bArr2 = bArr;
            C80995a aVar = (C80995a) u.mo93555w(C80995a.class);
            if (aVar == null) {
                aVar = new C80995a();
            }
            aVar.f237892I = this.f285359Q0;
            u.mo93545f(aVar);
            ((C119157j) C119157j.f356862d).mo183876g(new C97249e(str, u, bArr2, b002), "MicroMsg.MsgRetransmitUI");
        } else if (u.f195582i == 33) {
            C73687g1.m87265c(str, this.f285348F, u, C75571d6.m90697c(((HashMap) getIntent().getSerializableExtra("appbrand_params")).get("img_url"), (String) null));
        } else {
            C74343y0.m88750I(this, str, this.f285377i, b002.mo108769t2(), this.f285348F);
        }
        return true;
    }

    /* renamed from: Q7 */
    public final boolean mo136235Q7(String str, boolean z) {
        String str2 = str;
        Class cls = C39315g.class;
        if (this.f285375g == null) {
            return false;
        }
        EmojiInfo G = ((C98602h) ((C39315g) C86312j.m106911c(cls)).mo58035cm()).mo137999G(this.f285375g);
        long l = C86013q1.m106451l(G == null ? this.f285375g : G.mo62640K1());
        String K1 = G == null ? this.f285375g : G.mo62640K1();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapUtil.decodeFile(K1, options);
        boolean z2 = options.outHeight > C77092c.m93041c() || options.outWidth > C77092c.m93041c();
        if (l > ((long) C77092c.m93039a()) || z2) {
            Object[] objArr = new Object[2];
            objArr[0] = G == null ? DownloadInfo.FILENAME : G.getMd5();
            objArr[1] = Integer.valueOf(this.f285380o);
            Log.m105925i("MicroMsg.MsgRetransmitUI", "emoji is over size. md5:%s size:%d", objArr);
            this.f285371Y = false;
            this.f285384r = false;
            C76879j.m92754y(this, getString(C0966R.string.c5n), "", getString(C0966R.string.fmz), new C97245a());
            if (this.f285351I == 1) {
                C115669n.INSTANCE.mo160131h(13459, Long.valueOf(l), 1, G.getMd5(), 1);
            }
            return true;
        }
        if (this.f285351I == 1) {
            C115669n nVar = C115669n.INSTANCE;
            Object[] objArr2 = new Object[4];
            objArr2[0] = Long.valueOf(l);
            objArr2[1] = 0;
            objArr2[2] = G == null ? "" : G.getMd5();
            objArr2[3] = 1;
            nVar.mo160131h(13459, objArr2);
        }
        if (z) {
            if (G == null) {
                G = ((C98602h) ((C39315g) C86312j.m106911c(cls)).mo58035cm()).mo137999G(((C98602h) ((C39315g) C86312j.m106911c(cls)).mo58035cm()).mo137996D(getApplicationContext(), new WXMediaMessage(new WXEmojiObject(this.f285375g)), ""));
            }
            if (G != null) {
                C115669n.INSTANCE.mo160131h(13459, Long.valueOf(l), 0, G.getMd5(), 2);
                C74343y0.m88764h(G, str2);
            }
            finish();
            return true;
        } else if (G == null || l <= ((long) C77092c.m93042d())) {
            if (((C98602h) ((C39315g) C86312j.m106911c(cls)).mo58035cm()).mo138010Q(this, str2, this.f285375g)) {
                return true;
            }
            Log.m105920e("MicroMsg.MsgRetransmitUI", "Retransmit emoji failed.");
            return false;
        } else {
            C74343y0.m88764h(G, str2);
            return true;
        }
    }

    /* renamed from: R7 */
    public final boolean mo136236R7(String str, String str2) {
        Class cls = C77032h.class;
        C75592q0.m90789s();
        C100760a0.C100764f a = C100760a0.m131931a(str);
        a.f295187a = str;
        a.f295189c = str2;
        a.f295190d = C45628s0.m50810y(str);
        a.f295191e = 0;
        a.f295194h = 4;
        C100765f fVar = new C100765f();
        fVar.f295215c = getIntent().getStringExtra("msg_forward_sns_obj_id");
        fVar.f295214b = this.f285374f;
        a.f295206t = fVar;
        C100760a0.C89338b a2 = a.mo140195a();
        ((C77032h) C86312j.m106911c(cls)).mo107359RF(((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(a2.f257314b), this.f285374f);
        ((C77032h) C86312j.m106911c(cls)).mo107357DR();
        a2.mo123694a();
        m125192X7(a2, str, Long.valueOf(this.f285374f));
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x009f, code lost:
        if (com.tencent.p014mm.vfs.C86013q1.m106451l(r3.field_fileFullPath) != r3.field_totalLen) goto L_0x00a1;
     */
    /* renamed from: S7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo136237S7(java.lang.String r25, com.tencent.p014mm.message.C68070l.C68072b r26, byte[] r27, com.tencent.p014mm.storage.C72963f4 r28) {
        /*
            r24 = this;
            r8 = r24
            r6 = r25
            r7 = r26
            r9 = r28
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r1[r2] = r6
            java.lang.String r3 = r7.f195606o
            r4 = 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r1[r4] = r3
            java.lang.String r10 = "MicroMsg.MsgRetransmitUI"
            java.lang.String r3 = "summerbig send toUser[%s], attachid[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r3, r1)
            java.lang.String r1 = r7.f195606o
            com.tencent.mm.pluginsdk.model.app.d r1 = com.tencent.p014mm.pluginsdk.model.app.C72695v.m85065g(r1)
            java.lang.String r3 = r7.f195650z
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x0033
            java.lang.String r1 = r7.f195606o
            com.tencent.mm.pluginsdk.model.app.d r1 = com.tencent.p014mm.pluginsdk.model.app.C72695v.m85069k(r9, r1)
        L_0x0033:
            r3 = r1
            r1 = 4
            r15 = 3
            java.lang.String r14 = ""
            if (r3 == 0) goto L_0x0073
            java.lang.String r11 = r3.field_fileFullPath
            if (r11 == 0) goto L_0x0073
            boolean r11 = r11.equals(r14)
            if (r11 != 0) goto L_0x0073
            java.lang.String r11 = com.tencent.p014mm.pluginsdk.model.app.C72695v.m85067i()
            java.lang.String r12 = r7.f195570f
            java.lang.String r13 = r7.f195602n
            java.lang.String r11 = com.tencent.p014mm.pluginsdk.model.app.C72695v.m85063e(r11, r12, r13)
            java.lang.String r12 = r3.field_fileFullPath
            com.tencent.p014mm.vfs.C86013q1.m106442c(r12, r11)
            java.lang.Object[] r12 = new java.lang.Object[r1]
            java.lang.String r13 = r3.field_fileFullPath
            r12[r2] = r13
            java.lang.String r13 = r7.f195570f
            r12[r4] = r13
            r12[r0] = r11
            boolean r13 = r3.mo100146l2()
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            r12[r15] = r13
            java.lang.String r13 = "summerbig send old path[%s], title[%s] attachPath[%s]， finish[%b]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r13, r12)
            r13 = r11
            goto L_0x0074
        L_0x0073:
            r13 = r14
        L_0x0074:
            com.tencent.mm.message.l$b r12 = com.tencent.p014mm.message.C68070l.C68072b.m80418i(r26)
            r12.f195618r = r15
            r11 = 6
            if (r9 == 0) goto L_0x0108
            int r15 = r7.f195582i
            if (r15 != r11) goto L_0x0108
            java.lang.String r15 = r7.f195650z
            boolean r15 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r15)
            if (r15 != 0) goto L_0x0108
            if (r3 == 0) goto L_0x0108
            java.lang.String r15 = r3.field_fileFullPath
            boolean r15 = com.tencent.p014mm.vfs.C86013q1.m106450k(r15)
            if (r15 == 0) goto L_0x00a1
            java.lang.String r15 = r3.field_fileFullPath
            long r17 = com.tencent.p014mm.vfs.C86013q1.m106451l(r15)
            r20 = r5
            long r4 = r3.field_totalLen
            int r15 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r15 == 0) goto L_0x010a
        L_0x00a1:
            gi.g r11 = new gi.g
            r11.<init>()
            java.lang.String r0 = "task_MsgRetransmitUI_1"
            r11.f287660d = r0
            rn3.y r15 = new rn3.y
            r0 = r15
            r1 = r24
            r2 = r3
            r3 = r13
            r4 = r28
            r5 = r12
            r6 = r25
            r7 = r27
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r11.f287662f = r15
            long r0 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            java.lang.String r2 = r28.mo108768t()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r14)
            long r4 = r28.getMsgId()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "checkExist"
            java.lang.String r0 = com.tencent.p014mm.modelcdntran.C1297x.m1387b(r4, r0, r2, r3)
            r11.field_mediaId = r0
            java.lang.String r0 = r12.f195524R
            r11.field_aesKey = r0
            r0 = 19
            r11.field_fileType = r0
            java.lang.String r0 = r12.f195472C
            r11.field_authKey = r0
            java.lang.String r0 = r12.f195650z
            r11.f287672s = r0
            r11.field_fullpath = r13
            java.lang.Class<qo.l> r0 = p663qo.C101213l.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            qo.l r0 = (p663qo.C101213l) r0
            boolean r0 = r0.xf0(r11)
            if (r0 != 0) goto L_0x0107
            java.lang.String r0 = "openim attach download failed before rescend"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)
        L_0x0107:
            return
        L_0x0108:
            r20 = r5
        L_0x010a:
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r3 == 0) goto L_0x014f
            int r3 = r7.f195626t
            if (r3 != 0) goto L_0x011a
            int r4 = r7.f195594l
            r5 = 26214400(0x1900000, float:5.2897246E-38)
            if (r4 <= r5) goto L_0x014f
        L_0x011a:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r0[r2] = r1
            int r1 = r7.f195594l
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            java.lang.String r1 = "summerbig send attachPath is null islargefilemsg[%d], attachlen[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r1, r0)
            ob0.b0 r9 = eb0.C97625j3.m125815e()
            ld3.c r10 = new ld3.c
            r11 = 0
            com.tencent.mm.ui.transmit.MsgRetransmitUI$f r13 = new com.tencent.mm.ui.transmit.MsgRetransmitUI$f
            r0 = r13
            r1 = r24
            r2 = r26
            r3 = r12
            r4 = r25
            r5 = r27
            r0.<init>(r2, r3, r4, r5)
            r10.<init>(r7, r11, r6, r13)
            r9.mo123460f(r10)
            goto L_0x01fd
        L_0x014f:
            java.lang.String r10 = r7.f195562d
            java.lang.String r3 = r7.f195484F
            java.lang.String r15 = r8.f285355M
            java.lang.String r4 = r9.f230724G
            java.lang.String r17 = eb0.C75569c4.m90685r(r4)
            long r4 = r8.f285374f
            java.lang.String r18 = ""
            r9 = r12
            r21 = 6
            r11 = r3
            r3 = r12
            r12 = r25
            r22 = r14
            r14 = r27
            r23 = 3
            r16 = r18
            r18 = r4
            android.util.Pair r4 = com.tencent.p014mm.pluginsdk.model.app.C72695v.m85054G(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r4 = r4.second
            java.lang.Long r4 = (java.lang.Long) r4
            long r9 = r8.f285374f
            java.lang.Long r5 = java.lang.Long.valueOf(r9)
            m125191W7(r4, r6, r5)
            int r4 = r3.f195582i
            r5 = 36
            if (r4 != r5) goto L_0x01fd
            java.lang.String r4 = "chatroom"
            boolean r4 = r6.endsWith(r4)
            java.lang.String r5 = r3.f195586j
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r5)
            java.lang.String r5 = java.net.URLEncoder.encode(r5)
            java.lang.String r9 = r3.f195570f
            java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r9)
            java.lang.String r9 = java.net.URLEncoder.encode(r9)
            java.lang.String r10 = r3.f195574g
            java.lang.String r10 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r10)
            java.lang.String r10 = java.net.URLEncoder.encode(r10)
            java.lang.String r11 = r3.f195569e2
            java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r11)
            java.lang.String r11 = java.net.URLEncoder.encode(r11)
            java.lang.String r7 = r7.f195589j2
            com.tencent.mm.plugin.report.service.n r12 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r13 = 14127(0x372f, float:1.9796E-41)
            r14 = 15
            java.lang.Object[] r14 = new java.lang.Object[r14]
            java.lang.String r15 = r3.f195562d
            r14[r2] = r15
            java.lang.String r3 = r3.f195573f2
            r15 = 1
            r14[r15] = r3
            r14[r0] = r11
            r14[r23] = r9
            r14[r1] = r10
            r0 = 5
            r14[r0] = r22
            r14[r21] = r5
            r0 = 7
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r14[r0] = r1
            r0 = 8
            r14[r0] = r20
            r0 = 9
            r14[r0] = r20
            r0 = 10
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            r14[r0] = r1
            r0 = 11
            r14[r0] = r6
            r0 = 12
            r14[r0] = r20
            r0 = 13
            r14[r0] = r7
            r0 = 14
            r14[r0] = r22
            r12.mo160131h(r13, r14)
        L_0x01fd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.transmit.MsgRetransmitUI.mo136237S7(java.lang.String, com.tencent.mm.message.l$b, byte[], com.tencent.mm.storage.f4):void");
    }

    /* renamed from: T7 */
    public final void mo136238T7(Intent intent, String str) {
        if (this.f285346D) {
            this.f285345C = this.f285394z.size();
            ArrayList parcelableArrayList = intent.getExtras().getParcelableArrayList("android.intent.extra.STREAM");
            if (parcelableArrayList == null || parcelableArrayList.size() <= 0) {
                finish();
                return;
            }
            Iterator it = parcelableArrayList.iterator();
            while (it.hasNext()) {
                Parcelable parcelable = (Parcelable) it.next();
                if (!this.f285367U0) {
                    mo136240V7(str);
                } else {
                    return;
                }
            }
            return;
        }
        this.f285345C = 1;
        mo136240V7(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* renamed from: U7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo136239U7(java.lang.String r26, int r27, ob0.C47355o r28) {
        /*
            r25 = this;
            r11 = r25
            r12 = r26
            java.lang.Class<gt.k> r0 = p158gt.C98201k.class
            java.lang.String r13 = eb0.C75592q0.m90789s()
            eb0.c r1 = eb0.C97625j3.m125812b()
            g62.l r1 = r1.mo105911z()
            long r2 = r11.f285374f
            com.tencent.mm.storage.g4 r1 = (com.tencent.p014mm.storage.C72972g4) r1
            com.tencent.mm.storage.f4 r14 = r1.b00(r2)
            long r1 = r14.getMsgId()
            long r3 = r11.f285374f
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0218
            java.lang.String r1 = r14.getContent()
            long r2 = r14.getMsgId()
            r4 = 0
            r5 = 0
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x004c
            di3.d r2 = di3.C86312j.m106911c(r0)
            gt.k r2 = (p158gt.C98201k) r2
            gt.m r2 = r2.mo137277xi()
            java.lang.String r3 = r14.mo108768t()
            long r7 = r14.getMsgId()
            com.tencent.mm.modelimage.m r2 = (com.tencent.p014mm.modelimage.C92839m) r2
            com.tencent.mm.modelimage.k r2 = r2.mo127200vP(r3, r7)
            goto L_0x004d
        L_0x004c:
            r2 = r4
        L_0x004d:
            if (r2 == 0) goto L_0x0055
            long r7 = r2.f267374a
            int r3 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r3 > 0) goto L_0x0075
        L_0x0055:
            long r7 = r14.mo108774y2()
            int r3 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x0075
            di3.d r2 = di3.C86312j.m106911c(r0)
            gt.k r2 = (p158gt.C98201k) r2
            gt.m r2 = r2.mo137277xi()
            java.lang.String r3 = r14.mo108768t()
            long r7 = r14.mo108774y2()
            com.tencent.mm.modelimage.m r2 = (com.tencent.p014mm.modelimage.C92839m) r2
            com.tencent.mm.modelimage.k r2 = r2.mo127168NQ(r3, r7)
        L_0x0075:
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r3 == 0) goto L_0x0085
            long r7 = r14.mo108774y2()
            int r3 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x0085
            java.lang.String r1 = r2.f267393t
        L_0x0085:
            r15 = r1
            if (r2 == 0) goto L_0x01fe
            int r1 = r2.f267376c
            int r3 = r2.f267377d
            if (r1 < r3) goto L_0x0090
            if (r3 != 0) goto L_0x01fe
        L_0x0090:
            boolean r1 = r11.f285346D
            if (r1 != 0) goto L_0x01fe
            di3.d r0 = di3.C86312j.m106911c(r0)
            gt.k r0 = (p158gt.C98201k) r0
            gt.m r0 = r0.mo137277xi()
            java.lang.String r1 = r14.mo108768t()
            long r2 = r14.mo108774y2()
            com.tencent.mm.modelimage.m r0 = (com.tencent.p014mm.modelimage.C92839m) r0
            com.tencent.mm.modelimage.k r10 = r0.mo127168NQ(r1, r2)
            java.lang.String r0 = r10.f267393t
            java.lang.String r1 = "msg"
            java.util.Map r0 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r0, r1, r4)
            java.lang.String r9 = "MicroMsg.MsgRetransmitUI"
            r16 = 0
            r8 = 1
            if (r0 != 0) goto L_0x00d1
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.String r1 = r10.f267393t
            r0[r16] = r1
            java.lang.String r1 = "parse cdnInfo failed. [%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r9, r1, r0)
        L_0x00c8:
            r22 = r10
            r5 = r12
            r23 = r13
            r17 = r14
            goto L_0x01eb
        L_0x00d1:
            int r7 = r10.f267381h
            r6 = 2
            if (r7 == r8) goto L_0x00e1
            java.lang.String r1 = ".msg.img.$cdnmidimgurl"
            java.lang.Object r1 = r0.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            r5 = r1
            r3 = 2
            goto L_0x00eb
        L_0x00e1:
            java.lang.String r1 = ".msg.img.$cdnbigimgurl"
            java.lang.Object r1 = r0.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            r5 = r1
            r3 = 1
        L_0x00eb:
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            r1[r16] = r2
            r1[r8] = r5
            java.lang.String r2 = "cdntra read xml  comptype:%d url:[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r9, r2, r1)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r1 == 0) goto L_0x0106
            java.lang.String r0 = "cdntra get cdnUrlfailed."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r0)
            goto L_0x00c8
        L_0x0106:
            java.lang.String r1 = ".msg.img.$aeskey"
            java.lang.Object r1 = r0.get(r1)
            r4 = r1
            java.lang.String r4 = (java.lang.String) r4
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r1 == 0) goto L_0x011b
            java.lang.String r0 = "cdntra get aes key failed."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r0)
            goto L_0x00c8
        L_0x011b:
            int r1 = r10.f267386m
            long r1 = (long) r1
            java.lang.String r6 = r14.mo108768t()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r11 = ""
            r8.append(r11)
            r18 = r3
            r19 = r4
            long r3 = r14.getMsgId()
            r8.append(r3)
            java.lang.String r3 = r8.toString()
            java.lang.String r4 = "downimg"
            java.lang.String r1 = com.tencent.p014mm.modelcdntran.C1297x.m1387b(r4, r1, r6, r3)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 == 0) goto L_0x015b
            r8 = 1
            java.lang.Object[] r0 = new java.lang.Object[r8]
            long r1 = r14.mo108774y2()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0[r16] = r1
            java.lang.String r1 = "cdntra genClientId failed not use cdn imgLocalId:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r9, r1, r0)
            goto L_0x00c8
        L_0x015b:
            r8 = 1
            java.lang.String r1 = ".msg.img.$md5"
            java.lang.Object r0 = r0.get(r1)
            r6 = r0
            java.lang.String r6 = (java.lang.String) r6
            gi.g r4 = new gi.g
            r4.<init>()
            java.lang.String r0 = "task_MsgRetransmitUI_2"
            r4.f287660d = r0
            rn3.p r3 = new rn3.p
            r0 = r3
            r1 = r25
            r2 = r14
            r12 = r3
            r3 = r27
            r17 = r14
            r20 = r19
            r14 = r4
            r4 = r18
            r21 = r5
            r5 = r26
            r19 = r6
            r6 = r13
            r22 = r7
            r7 = r15
            r23 = r13
            r13 = 1
            r8 = r19
            r24 = r9
            r9 = r22
            r22 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r14.f287662f = r12
            long r0 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r11)
            long r3 = r17.getMsgId()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "checkExist"
            java.lang.String r0 = com.tencent.p014mm.modelcdntran.C1297x.m1387b(r3, r0, r5, r2)
            r14.field_mediaId = r0
            r1 = r21
            r14.field_fileId = r1
            r1 = r20
            r14.field_aesKey = r1
            r0 = r19
            r14.field_filemd5 = r0
            r6 = r18
            r14.field_fileType = r6
            r14.field_talker = r5
            r0 = 2
            r14.field_priority = r0
            r14.field_svr_signature = r11
            r14.field_onlycheckexist = r13
            r14.field_trysafecdn = r13
            java.lang.Class<qo.l> r0 = p663qo.C101213l.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            qo.l r0 = (p663qo.C101213l) r0
            boolean r0 = r0.if0(r14)
            if (r0 != 0) goto L_0x01e9
            java.lang.String r0 = "check exist fail! download img before retransmit"
            r1 = r24
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
            goto L_0x01eb
        L_0x01e9:
            r16 = 1
        L_0x01eb:
            if (r16 != 0) goto L_0x022c
            r0 = r25
            r1 = r22
            r2 = r17
            r3 = r15
            r4 = r27
            r5 = r26
            r6 = r23
            r0.mo136226H7(r1, r2, r3, r4, r5, r6)
            goto L_0x022c
        L_0x01fe:
            r5 = r12
            r23 = r13
            if (r2 == 0) goto L_0x0206
            long r0 = r2.f267374a
            goto L_0x0208
        L_0x0206:
            r0 = -1
        L_0x0208:
            r6 = r0
            r0 = r25
            r1 = r26
            r2 = r27
            r3 = r23
            r4 = r15
            r5 = r28
            r0.mo136227I7(r1, r2, r3, r4, r5, r6)
            goto L_0x022c
        L_0x0218:
            r5 = r12
            r23 = r13
            r6 = -1
            java.lang.String r4 = ""
            r0 = r25
            r1 = r26
            r2 = r27
            r3 = r23
            r5 = r28
            r0.mo136227I7(r1, r2, r3, r4, r5, r6)
        L_0x022c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.transmit.MsgRetransmitUI.mo136239U7(java.lang.String, int, ob0.o):void");
    }

    /* renamed from: V7 */
    public final void mo136240V7(String str) {
        Log.m105924i("MicroMsg.MsgRetransmitUI", "sendMultiVideo");
        if (getIntent().getBooleanExtra("KISFileFromCopyTmpPath", false) && this.f285375g.startsWith(C46848g.Dx0())) {
            Log.m105925i("MicroMsg.MsgRetransmitUI", "sendMultiVideo, fileName is from shareImgTmpPath:%s", this.f285375g);
            getIntent().putExtra("ImportVideoTempPath", this.f285375g);
        }
        C96790t0 t0Var = new C96790t0(this, (List<String>) null, getIntent(), str, 1, new C97246b(), false);
        ((C119157j) C119157j.f356862d).mo183875f(t0Var);
        this.f285385s = C76879j.m92723Q(this, getString(C0966R.string.a3h), getString(C0966R.string.a4d), true, true, new C97247c(t0Var));
    }

    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        String str;
        super.onActivityResult(i, i2, intent);
        if (i2 != -1) {
            ((C77032h) C86312j.m106911c(C77032h.class)).mo107357DR();
        }
        String str2 = "";
        if (intent != null) {
            str = intent.getStringExtra("custom_send_text");
            String stringExtra = intent.getStringExtra("Select_Conv_User");
            if (!Util.isNullOrNil(stringExtra)) {
                this.f285376h = Util.stringsToList(stringExtra.split(","));
            }
        } else {
            str = str2;
        }
        if (this.f285372Z) {
            C76933e a = C76933e.m92785a();
            List<String> list = this.f285376h;
            MultiMessageForwardStruct multiMessageForwardStruct = a.f224830a;
            multiMessageForwardStruct.f194289j = multiMessageForwardStruct.mo86045b("ToUsername", Util.listToString(list, ";"), true);
            C76933e.m92785a().f224830a.f194285f = Util.isNullOrNil(str) ? 2 : 1;
        }
        if (i2 != -1) {
            C68070l.C68072b u = C68070l.C68072b.m80422u(Util.processXml(this.f285377i), (String) null);
            if (u != null && u.f195582i == 5 && u.f195586j != null) {
                Log.m105919d("MicroMsg.MsgRetransmitUI", "report(%s), url : %s, clickTimestamp : %d, scene : %d, actionType : %d, flag : %d", 13378, u.f195586j, Long.valueOf(this.f285364T), Integer.valueOf(this.f285362S), 1, 3);
                try {
                    str2 = URLEncoder.encode(u.f195586j, "UTF-8");
                } catch (UnsupportedEncodingException e) {
                    Log.printErrStackTrace("MicroMsg.MsgRetransmitUI", e, str2, new Object[0]);
                }
                C115669n.INSTANCE.mo160131h(13378, str2, Long.valueOf(this.f285364T), Integer.valueOf(this.f285362S), 1, 3);
            } else if (u != null && u.f195582i == 33) {
                AppBrandOuterMenuClickReportEvent appBrandOuterMenuClickReportEvent = new AppBrandOuterMenuClickReportEvent();
                AppBrandOuterMenuClickReportEvent.C80703a aVar = appBrandOuterMenuClickReportEvent.f236137d;
                aVar.f236149l = this.f285370X;
                int i3 = this.f285369W;
                aVar.f236141d = i3;
                if (2 == i3) {
                    aVar.f236143f = this.f285368V + XVFSFile.PATH_SEPARATOR + this.f285366U;
                } else {
                    aVar.f236143f = this.f285368V;
                }
                AppBrandOuterMenuClickReportEvent.C80703a aVar2 = appBrandOuterMenuClickReportEvent.f236137d;
                aVar2.f236142e = u.f195653z2 + 1;
                aVar2.f236144g = u.f195569e2;
                aVar2.f236138a = u.f195573f2;
                aVar2.f236139b = u.f195577g2;
                aVar2.f236140c = u.f195467A2;
                aVar2.f236145h = 1;
                aVar2.f236146i = str2;
                aVar2.f236147j = Util.nowSecond();
                AppBrandOuterMenuClickReportEvent.C80703a aVar3 = appBrandOuterMenuClickReportEvent.f236137d;
                aVar3.f236148k = 3;
                aVar3.f236150m = u.f195589j2;
                appBrandOuterMenuClickReportEvent.publish();
            }
            if (this.f285372Z) {
                C76933e.m92785a().mo107269c();
            }
            finish();
        } else if (i != 0) {
            Log.m105920e("MicroMsg.MsgRetransmitUI", "onActivityResult, unknown requestCode = " + i);
        } else {
            if (intent.getBooleanExtra("key_is_biz_chat", false)) {
                intent.getLongExtra("key_biz_chat_id", -1);
            }
            int intExtra = intent.getIntExtra("Retr_Msg_Type", -1);
            if (intExtra != -1) {
                Log.m105925i("MicroMsg.MsgRetransmitUI", "summerbig replace msgType %d->%d", Integer.valueOf(this.f285373e), Integer.valueOf(intExtra));
                this.f285373e = intExtra;
            }
            this.f285359Q0 = intent.getBooleanExtra("KSendGroupToDo", false);
            intent.getIntExtra("KShowTodoIntroduceView", 0);
            Object[] objArr = new Object[3];
            objArr[0] = Integer.valueOf(this.f285373e);
            objArr[1] = Integer.valueOf(this.f285389w);
            objArr[2] = Integer.valueOf(Util.isNullOrNil((List) this.f285376h) ? 0 : this.f285376h.size());
            Log.m105925i("MicroMsg.MsgRetransmitUI", "summersafecdn onActivityResult doRetransmit msgType[%d], iScene[%d], size[%d]", objArr);
            int i4 = this.f285373e;
            String str3 = this.f285377i;
            C31952w0 w0Var = ((C31941o0) C86312j.m106911c(C31941o0.class)).get(i4);
            if (w0Var != null) {
                w0Var.mo56432a(this, this.f285376h.get(0), str3, new C101410u(this, C89779i0.m112248e(this, getString(C0966R.string.a4d), true, 3, (DialogInterface.OnCancelListener) null)));
            }
            if (!(w0Var != null)) {
                mo136228J7();
                if (!TextUtils.isEmpty(str)) {
                    for (String next : this.f285376h) {
                        SendMsgEvent sendMsgEvent = new SendMsgEvent();
                        SendMsgEvent.C1132a aVar4 = sendMsgEvent.f9496d;
                        aVar4.f9497a = next;
                        aVar4.f9498b = str;
                        aVar4.f9499c = C45628s0.m50810y(next);
                        sendMsgEvent.f9496d.f9500d = 0;
                        sendMsgEvent.publish();
                    }
                }
                if (this.f285372Z) {
                    C76933e a2 = C76933e.m92785a();
                    a2.mo107270d(1);
                    a2.mo107268b();
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x02ff  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0319  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0398  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x03c7  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x03d0  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x03ea  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0403  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x041b  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0428  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r21) {
        /*
            r20 = this;
            r0 = r20
            super.onCreate(r21)
            r1 = 0
            r0.overridePendingTransition(r1, r1)
            android.view.Window r2 = r20.getWindow()
            com.tencent.p014mm.p136ui.C85875k4.m106177d0(r2)
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            r0.f285364T = r2
            android.content.Intent r2 = r20.getIntent()
            java.lang.String r3 = "Retr_Msg_Type"
            r4 = -1
            int r2 = r2.getIntExtra(r3, r4)
            r0.f285373e = r2
            android.content.Intent r2 = r20.getIntent()
            java.lang.String r5 = "Retr_Msg_content_bytes"
            boolean r2 = r2.hasExtra(r5)
            if (r2 == 0) goto L_0x003f
            java.lang.String r2 = new java.lang.String
            android.content.Intent r6 = r20.getIntent()
            byte[] r6 = r6.getByteArrayExtra(r5)
            r2.<init>(r6)
            r0.f285377i = r2
            goto L_0x004b
        L_0x003f:
            android.content.Intent r2 = r20.getIntent()
            java.lang.String r6 = "Retr_Msg_content"
            java.lang.String r2 = r2.getStringExtra(r6)
            r0.f285377i = r2
        L_0x004b:
            android.content.Intent r2 = r20.getIntent()
            r6 = -1
            java.lang.String r8 = "Retr_Msg_Id"
            long r6 = r2.getLongExtra(r8, r6)
            r0.f285374f = r6
            android.content.Intent r2 = r20.getIntent()
            java.lang.String r6 = "Retr_Msg_Id_List"
            java.io.Serializable r2 = r2.getSerializableExtra(r6)
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            r0.f285378j = r2
            android.content.Intent r2 = r20.getIntent()
            java.lang.String r7 = "Retr_From_Chatting_Forward_Scene"
            r9 = 1
            int r2 = r2.getIntExtra(r7, r9)
            r0.f285379n = r2
            android.content.Intent r2 = r20.getIntent()
            java.lang.String r10 = "Retr_File_Name"
            java.lang.String r2 = r2.getStringExtra(r10)
            r0.f285375g = r2
            android.content.Intent r2 = r20.getIntent()
            java.lang.String r10 = "Retr_File_Path_List"
            java.util.ArrayList r2 = r2.getStringArrayListExtra(r10)
            r0.f285394z = r2
            if (r2 == 0) goto L_0x0096
            int r2 = r2.size()
            if (r2 <= 0) goto L_0x0096
            r2 = 1
            goto L_0x0097
        L_0x0096:
            r2 = 0
        L_0x0097:
            r0.f285346D = r2
            android.content.Intent r2 = r20.getIntent()
            java.lang.String r10 = "Retr_Compress_Type"
            int r2 = r2.getIntExtra(r10, r1)
            r0.f285387u = r2
            android.content.Intent r2 = r20.getIntent()
            java.lang.String r10 = "Retr_Scene"
            int r2 = r2.getIntExtra(r10, r1)
            r0.f285389w = r2
            android.content.Intent r2 = r20.getIntent()
            java.lang.String r10 = "Retr_length"
            int r2 = r2.getIntExtra(r10, r1)
            r0.f285380o = r2
            android.content.Intent r2 = r20.getIntent()
            java.lang.String r10 = "Retr_video_isexport"
            int r2 = r2.getIntExtra(r10, r1)
            r0.f285388v = r2
            android.content.Intent r2 = r20.getIntent()
            java.lang.String r10 = "Retr_Msg_thumb_path"
            java.lang.String r2 = r2.getStringExtra(r10)
            r0.f285381p = r2
            android.content.Intent r2 = r20.getIntent()
            java.lang.String r11 = "Retr_go_to_chattingUI"
            boolean r2 = r2.getBooleanExtra(r11, r9)
            r0.f285383q = r2
            android.content.Intent r2 = r20.getIntent()
            java.lang.String r11 = "Retr_start_where_you_are"
            boolean r2 = r2.getBooleanExtra(r11, r9)
            r0.f285357P = r2
            android.content.Intent r2 = r20.getIntent()
            int r11 = r0.f285389w
            if (r11 != 0) goto L_0x00f7
            r11 = 1
            goto L_0x00f8
        L_0x00f7:
            r11 = 0
        L_0x00f8:
            java.lang.String r12 = "Multi_Retr"
            boolean r2 = r2.getBooleanExtra(r12, r11)
            r0.f285358Q = r2
            if (r2 == 0) goto L_0x0104
            r0.f285357P = r9
        L_0x0104:
            android.content.Intent r2 = r20.getIntent()
            boolean r11 = r0.f285357P
            java.lang.String r12 = "Retr_show_success_tips"
            boolean r2 = r2.getBooleanExtra(r12, r11)
            r0.f285384r = r2
            android.content.Intent r2 = r20.getIntent()
            java.lang.String r11 = "Edit_Mode_Sigle_Msg"
            boolean r2 = r2.getBooleanExtra(r11, r1)
            r0.f285347E = r2
            android.content.Intent r2 = r20.getIntent()
            java.lang.String r11 = "is_group_chat"
            boolean r2 = r2.getBooleanExtra(r11, r1)
            r0.f285348F = r2
            android.content.Intent r2 = r20.getIntent()
            java.lang.String r11 = "msg_uuid"
            java.lang.String r2 = r2.getStringExtra(r11)
            r0.f285349G = r2
            android.content.Intent r2 = r20.getIntent()
            java.lang.String r11 = "Retr_Biz_Msg_Selected_Msg_Index"
            int r2 = r2.getIntExtra(r11, r4)
            r0.f285350H = r2
            android.content.Intent r2 = r20.getIntent()
            java.lang.String r12 = "Retr_NewYear_Thumb_Path"
            r2.getStringExtra(r12)
            android.content.Intent r2 = r20.getIntent()
            java.lang.String r12 = "Retr_MsgImgScene"
            int r2 = r2.getIntExtra(r12, r1)
            r0.f285351I = r2
            android.content.Intent r2 = r20.getIntent()
            r12 = -998637568(0xffffffffc47a0000, float:-1000.0)
            java.lang.String r13 = "Retr_Longtitude"
            float r2 = r2.getFloatExtra(r13, r12)
            r0.f285352J = r2
            android.content.Intent r2 = r20.getIntent()
            java.lang.String r13 = "Retr_Latitude"
            float r2 = r2.getFloatExtra(r13, r12)
            r0.f285353K = r2
            android.content.Intent r2 = r20.getIntent()
            java.lang.String r12 = "Retr_AttachedContent"
            java.lang.String r2 = r2.getStringExtra(r12)
            r0.f285354L = r2
            android.content.Intent r2 = r20.getIntent()
            java.lang.String r12 = "Retr_From"
            java.lang.String r2 = r2.getStringExtra(r12)
            java.lang.String r12 = "gallery"
            boolean r2 = r12.equals(r2)
            r0.f285356N = r2
            android.content.Intent r2 = r20.getIntent()
            java.lang.String r12 = "reportSessionId"
            java.lang.String r2 = r2.getStringExtra(r12)
            r0.f285355M = r2
            android.content.Intent r2 = r20.getIntent()
            java.lang.String r12 = "Retr_MsgFromScene"
            int r2 = r2.getIntExtra(r12, r1)
            r0.f285362S = r2
            android.content.Intent r2 = r20.getIntent()
            java.lang.String r12 = "Retr_MsgFromUserName"
            java.lang.String r2 = r2.getStringExtra(r12)
            r0.f285366U = r2
            android.content.Intent r2 = r20.getIntent()
            java.lang.String r12 = "Retr_MsgTalker"
            java.lang.String r2 = r2.getStringExtra(r12)
            r0.f285368V = r2
            android.content.Intent r2 = r20.getIntent()
            java.lang.String r12 = "Retr_MsgAppBrandFromScene"
            int r2 = r2.getIntExtra(r12, r9)
            r0.f285369W = r2
            android.content.Intent r2 = r20.getIntent()
            java.lang.String r12 = "Retr_MsgAppBrandServiceType"
            int r2 = r2.getIntExtra(r12, r1)
            r0.f285370X = r2
            android.content.Intent r2 = r20.getIntent()
            java.lang.String r12 = "Retr_MsgFromMoreSelectRetransmit"
            boolean r2 = r2.getBooleanExtra(r12, r1)
            r0.f285372Z = r2
            android.content.Intent r2 = r20.getIntent()
            java.lang.String r12 = "scene_from"
            int r2 = r2.getIntExtra(r12, r1)
            r0.f285382p0 = r2
            android.content.Intent r2 = r20.getIntent()
            java.lang.String r13 = "Retr_MsgQuickShare"
            boolean r2 = r2.getBooleanExtra(r13, r1)
            r0.f285391x0 = r2
            android.content.Intent r2 = r20.getIntent()
            java.lang.String r13 = "Retr_NeedReport"
            boolean r2 = r2.getBooleanExtra(r13, r9)
            r0.f285393y0 = r2
            android.content.Intent r2 = r20.getIntent()
            java.lang.String r13 = "Retr_finder_in_stream"
            boolean r2 = r2.getBooleanExtra(r13, r1)
            r0.f285361R0 = r2
            android.content.Intent r2 = r20.getIntent()
            java.lang.String r14 = "img_source_url"
            java.lang.String r2 = r2.getStringExtra(r14)
            r0.f285363S0 = r2
            ob0.b0 r2 = eb0.C97625j3.m125815e()
            r14 = 110(0x6e, float:1.54E-43)
            r2.mo123455a(r14, r0)
            boolean r2 = nj3.C88990b.m111196e()
            if (r2 != 0) goto L_0x0238
            r2 = 2131493407(0x7f0c021f, float:1.8610293E38)
            r0.setContentView(r2)
        L_0x0238:
            if (r21 == 0) goto L_0x023b
            return
        L_0x023b:
            boolean r2 = r0.f285391x0
            if (r2 != 0) goto L_0x0449
            android.content.Intent r2 = new android.content.Intent
            java.lang.Class<com.tencent.mm.ui.transmit.SelectConversationUI> r14 = com.tencent.p014mm.p136ui.transmit.SelectConversationUI.class
            r2.<init>(r0, r14)
            java.lang.String r14 = "scene"
            r15 = 8
            r2.putExtra(r14, r15)
            java.lang.String r14 = "select_is_ret"
            r2.putExtra(r14, r9)
            boolean r14 = r0.f285361R0
            r2.putExtra(r13, r14)
            boolean r13 = r0.f285358Q
            java.lang.String r14 = "mutil_select_is_ret"
            if (r13 == 0) goto L_0x0263
            r2.putExtra(r14, r9)
        L_0x0263:
            int r13 = r0.f285373e
            r4 = 2
            java.lang.String r9 = "Select_Conv_Type"
            if (r13 == r4) goto L_0x0382
            r4 = 23
            java.lang.String r1 = "search_range"
            if (r13 == r4) goto L_0x0361
            r4 = 6
            if (r13 == r4) goto L_0x0382
            r4 = 7
            if (r13 == r4) goto L_0x0382
            java.lang.String r4 = "forward_card"
            java.lang.String r15 = "MicroMsg.MsgRetransmitUI"
            r17 = r10
            java.lang.String r10 = "getView : parse possible friend msg failed"
            r18 = 131072(0x20000, float:1.83671E-40)
            r19 = r7
            r7 = 8
            if (r13 == r7) goto L_0x0320
            switch(r13) {
                case 12: goto L_0x0298;
                case 13: goto L_0x0291;
                case 14: goto L_0x0386;
                case 15: goto L_0x0386;
                case 16: goto L_0x0386;
                default: goto L_0x028a;
            }
        L_0x028a:
            r1 = 35
            r2.putExtra(r9, r1)
            goto L_0x03b5
        L_0x0291:
            r1 = 43
            r2.putExtra(r9, r1)
            goto L_0x03b5
        L_0x0298:
            com.tencent.mm.ui.chatting.b1$g r7 = com.tencent.p014mm.p136ui.chatting.C73313b1.f215414a
            java.util.List<com.tencent.mm.storage.f4> r11 = r7.f215425a
            if (r11 == 0) goto L_0x02fc
            boolean r11 = r11.isEmpty()
            if (r11 == 0) goto L_0x02a5
            goto L_0x02fc
        L_0x02a5:
            java.util.List<com.tencent.mm.storage.f4> r7 = r7.f215425a
            java.util.Iterator r7 = r7.iterator()
        L_0x02ab:
            boolean r11 = r7.hasNext()
            if (r11 == 0) goto L_0x02fc
            java.lang.Object r11 = r7.next()
            com.tencent.mm.storage.f4 r11 = (com.tencent.p014mm.storage.C72963f4) r11
            eb0.c r13 = eb0.C97625j3.m125812b()
            g62.l r13 = r13.mo105911z()
            r16 = r7
            java.lang.String r7 = r11.getContent()
            com.tencent.mm.storage.g4 r13 = (com.tencent.p014mm.storage.C72972g4) r13
            com.tencent.mm.storage.f4$b r7 = r13.Rv0(r7)
            java.lang.String r13 = r7.f212675a
            if (r13 == 0) goto L_0x02d5
            int r13 = r13.length()
            if (r13 > 0) goto L_0x02da
        L_0x02d5:
            java.lang.String r13 = "MicroMsg.ChattingEditModeRetransmitMsg"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r10)
        L_0x02da:
            int r7 = r7.f212691q
            java.util.Set<java.lang.String> r13 = eb0.C45628s0.f123410p
            boolean r7 = com.tencent.p014mm.storage.C72996z1.m85810M4(r7)
            if (r7 != 0) goto L_0x02f9
            int r7 = r11.getType()
            r13 = 42
            if (r7 != r13) goto L_0x02f9
            int r7 = r11.f230723F
            r7 = r7 & 512(0x200, float:7.175E-43)
            if (r7 <= 0) goto L_0x02f4
            r7 = 1
            goto L_0x02f5
        L_0x02f4:
            r7 = 0
        L_0x02f5:
            if (r7 == 0) goto L_0x02f9
            r7 = 1
            goto L_0x02fd
        L_0x02f9:
            r7 = r16
            goto L_0x02ab
        L_0x02fc:
            r7 = 0
        L_0x02fd:
            if (r7 == 0) goto L_0x0319
            java.lang.String r7 = "has can forward card"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r15, r7)
            r7 = 7
            r2.putExtra(r9, r7)
            r7 = 0
            r2.putExtra(r14, r7)
            r9 = 1
            int[] r10 = new int[r9]
            r10[r7] = r18
            r2.putExtra(r1, r10)
            r2.putExtra(r4, r9)
            goto L_0x03b5
        L_0x0319:
            r1 = 35
            r2.putExtra(r9, r1)
            goto L_0x03b5
        L_0x0320:
            eb0.c r7 = eb0.C97625j3.m125812b()
            g62.l r7 = r7.mo105911z()
            java.lang.String r11 = r0.f285377i
            com.tencent.mm.storage.g4 r7 = (com.tencent.p014mm.storage.C72972g4) r7
            com.tencent.mm.storage.f4$b r7 = r7.Rv0(r11)
            java.lang.String r11 = r7.f212675a
            if (r11 == 0) goto L_0x033a
            int r11 = r11.length()
            if (r11 > 0) goto L_0x033d
        L_0x033a:
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r10)
        L_0x033d:
            int r7 = r7.f212691q
            java.util.Set<java.lang.String> r10 = eb0.C45628s0.f123410p
            boolean r7 = com.tencent.p014mm.storage.C72996z1.m85810M4(r7)
            if (r7 != 0) goto L_0x035b
            r7 = 7
            r2.putExtra(r9, r7)
            r7 = 1
            int[] r9 = new int[r7]
            r10 = 0
            r9[r10] = r18
            r2.putExtra(r1, r9)
            r2.putExtra(r14, r10)
            r2.putExtra(r4, r7)
            goto L_0x03b5
        L_0x035b:
            r4 = 3
            r10 = 0
            r2.putExtra(r9, r4)
            goto L_0x03b5
        L_0x0361:
            r19 = r7
            r17 = r10
            r4 = 3
            r10 = 0
            android.content.Intent r7 = r20.getIntent()
            int r7 = r7.getIntExtra(r9, r10)
            android.content.Intent r10 = r20.getIntent()
            int[] r10 = r10.getIntArrayExtra(r1)
            r2.putExtra(r1, r10)
            r1 = r7 | 3
            r1 = r1 | 32
            r2.putExtra(r9, r1)
            goto L_0x03b5
        L_0x0382:
            r19 = r7
            r17 = r10
        L_0x0386:
            android.content.Intent r1 = r20.getIntent()
            java.lang.String r4 = "appbrand_params"
            java.io.Serializable r1 = r1.getSerializableExtra(r4)
            r2.putExtra(r4, r1)
            int r1 = r0.f285362S
            r4 = 3
            if (r1 != r4) goto L_0x039d
            r0.f285382p0 = r4
            r2.putExtra(r12, r4)
        L_0x039d:
            int r1 = r0.f285350H
            r2.putExtra(r11, r1)
            android.content.Intent r1 = r20.getIntent()
            java.lang.String r4 = "Retr_Big_File"
            r7 = 0
            boolean r1 = r1.getBooleanExtra(r4, r7)
            r2.putExtra(r4, r1)
            r1 = 35
            r2.putExtra(r9, r1)
        L_0x03b5:
            int r1 = r0.f285373e
            r2.putExtra(r3, r1)
            long r3 = r0.f285374f
            r2.putExtra(r8, r3)
            java.util.ArrayList<java.lang.Long> r1 = r0.f285378j
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r1)
            if (r1 != 0) goto L_0x03cc
            java.util.ArrayList<java.lang.Long> r1 = r0.f285378j
            r2.putExtra(r6, r1)
        L_0x03cc:
            java.lang.String r1 = r0.f285377i
            if (r1 == 0) goto L_0x03d7
            byte[] r1 = r1.getBytes()
            r2.putExtra(r5, r1)
        L_0x03d7:
            int r1 = r0.f285379n
            r3 = r19
            r2.putExtra(r3, r1)
            android.content.Intent r1 = r20.getIntent()
            java.lang.String r3 = "Select_Data_Send_To_WeWork"
            boolean r1 = r1.hasExtra(r3)
            if (r1 == 0) goto L_0x03f7
            android.content.Intent r1 = r20.getIntent()
            android.os.Parcelable r1 = r1.getParcelableExtra(r3)
            com.tencent.mm.sendtowework.BaseDataToWeWork r1 = (com.tencent.p014mm.sendtowework.BaseDataToWeWork) r1
            r2.putExtra(r3, r1)
        L_0x03f7:
            android.content.Intent r1 = r20.getIntent()
            java.lang.String r3 = "content_type_forward_to_wework"
            boolean r1 = r1.hasExtra(r3)
            if (r1 == 0) goto L_0x040f
            android.content.Intent r1 = r20.getIntent()
            r4 = -1
            int r1 = r1.getIntExtra(r3, r4)
            r2.putExtra(r3, r1)
        L_0x040f:
            android.content.Intent r1 = r20.getIntent()
            java.lang.String r3 = "from_scene_forward_to_wework"
            boolean r1 = r1.hasExtra(r3)
            if (r1 == 0) goto L_0x0428
            android.content.Intent r1 = r20.getIntent()
            r4 = 0
            int r1 = r1.getIntExtra(r3, r4)
            r2.putExtra(r3, r1)
            goto L_0x0429
        L_0x0428:
            r4 = 0
        L_0x0429:
            java.lang.String r1 = r0.f285381p
            r3 = r17
            r2.putExtra(r3, r1)
            java.lang.String r1 = r0.f285375g
            java.lang.String r3 = "image_path"
            r2.putExtra(r3, r1)
            int r1 = r0.f285382p0
            r2.putExtra(r12, r1)
            r0.startActivityForResult(r2, r4)
            r1 = 2130772171(0x7f0100cb, float:1.7147453E38)
            r2 = 2130771992(0x7f010018, float:1.714709E38)
            r0.overridePendingTransition(r1, r2)
            goto L_0x049c
        L_0x0449:
            android.content.Intent r1 = r20.getIntent()
            java.lang.String r2 = "Select_Conv_User"
            java.lang.String r1 = r1.getStringExtra(r2)
            android.content.Intent r2 = r20.getIntent()
            java.lang.String r3 = "custom_send_text"
            java.lang.String r2 = r2.getStringExtra(r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.f285376h = r3
            r3.add(r1)
            r20.mo136228J7()
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 != 0) goto L_0x049c
            java.util.List<java.lang.String> r1 = r0.f285376h
            java.util.Iterator r1 = r1.iterator()
        L_0x0476:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x049c
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            com.tencent.mm.autogen.events.SendMsgEvent r4 = new com.tencent.mm.autogen.events.SendMsgEvent
            r4.<init>()
            com.tencent.mm.autogen.events.SendMsgEvent$a r5 = r4.f9496d
            r5.f9497a = r3
            r5.f9498b = r2
            int r3 = eb0.C45628s0.m50810y(r3)
            r5.f9499c = r3
            com.tencent.mm.autogen.events.SendMsgEvent$a r3 = r4.f9496d
            r5 = 0
            r3.f9500d = r5
            r4.publish()
            goto L_0x0476
        L_0x049c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.transmit.MsgRetransmitUI.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        if (!this.f285392y) {
            C97625j3.m125815e().mo123470p(110, this);
        }
        super.onDestroy();
    }

    @DoNotCheckLeakForActivities
    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        List<String> list;
        Log.m105925i("MicroMsg.MsgRetransmitUI", "errType : %s, errCode : %s, errMsg : %s.", Integer.valueOf(i), Integer.valueOf(i2), str);
        if (yVar.getType() == 110 && (yVar instanceof C92809c0)) {
            C92809c0 c0Var = (C92809c0) yVar;
            if (getIntent().getBooleanExtra("Retr_FromMainTimeline", false)) {
                String stringExtra = getIntent().getStringExtra("Retr_KSnsId");
                if (C72996z1.m85820U5(c0Var.f267254G)) {
                    SnsForwardFeedToChatRoomForDataReportEvent snsForwardFeedToChatRoomForDataReportEvent = new SnsForwardFeedToChatRoomForDataReportEvent();
                    snsForwardFeedToChatRoomForDataReportEvent.f265152d.f265153a = stringExtra;
                    snsForwardFeedToChatRoomForDataReportEvent.publish();
                } else {
                    SnsForwardFeedToSingleChatForDataReportEvent snsForwardFeedToSingleChatForDataReportEvent = new SnsForwardFeedToSingleChatForDataReportEvent();
                    snsForwardFeedToSingleChatForDataReportEvent.f265155d.f265156a = stringExtra;
                    snsForwardFeedToSingleChatForDataReportEvent.publish();
                }
            }
            List<String> list2 = this.f285394z;
            if (list2 == null || list2.size() <= 1) {
                C77398g gVar = this.f285386t;
                if (gVar != null) {
                    gVar.dismiss();
                    Log.m105925i("MicroMsg.MsgRetransmitUI", "uploadImgDialog dismissed : %s", this.f285386t.toString());
                    this.f285386t = null;
                }
                int i3 = this.f285360R - 1;
                this.f285360R = i3;
                if (i3 <= 0 || !this.f285358Q) {
                    this.f285392y = false;
                    C97625j3.m125815e().mo123470p(110, this);
                    if (this.f285389w != 0) {
                        finish();
                        if (this.f285383q && !this.f285357P) {
                            Intent intent = new Intent(this, ChattingUI.class);
                            intent.addFlags(67108864);
                            intent.putExtra("Chat_User", c0Var.f267254G);
                            intent.putExtra("scene_from", this.f285382p0);
                            C9556a aVar = new C9556a();
                            aVar.mo10233c(intent);
                            C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/ui/transmit/MsgRetransmitUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            startActivity((Intent) aVar.mo10231a(0));
                            C117292a.m165359e(this, "com/tencent/mm/ui/transmit/MsgRetransmitUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            this.f285394z.remove(0);
            String str2 = c0Var.f267254G;
            if (Util.isNullOrNil(str2) && (list = this.f285376h) != null) {
                str2 = list.get(0);
            }
            mo136239U7(str2, 3, this.f285343A);
        }
    }
}
