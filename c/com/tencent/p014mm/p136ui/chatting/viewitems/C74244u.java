package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import ba3.C39750a;
import bp3.C67301m;
import ck3.C67391b;
import com.google.android.gms.actions.SearchIntents;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.GiftCardEvent;
import com.tencent.p014mm.autogen.events.NotifyGroupTodoEvent;
import com.tencent.p014mm.autogen.events.OpenNoteFromSessionEvent;
import com.tencent.p014mm.autogen.events.RecordOperationEvent;
import com.tencent.p014mm.message.C68065f;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.message.C80995a;
import com.tencent.p014mm.message.C92721n;
import com.tencent.p014mm.modelimage.C92839m;
import com.tencent.p014mm.modelstat.C68144a;
import com.tencent.p014mm.modelstat.C92859v;
import com.tencent.p014mm.p136ui.C74928u;
import com.tencent.p014mm.p136ui.MMImageView;
import com.tencent.p014mm.p136ui.chatting.C73724j2;
import com.tencent.p014mm.p136ui.chatting.C73736k2;
import com.tencent.p014mm.p136ui.chatting.C73745l4;
import com.tencent.p014mm.p136ui.chatting.C73756m2;
import com.tencent.p014mm.p136ui.chatting.C73763n2;
import com.tencent.p014mm.p136ui.chatting.C73764n3;
import com.tencent.p014mm.p136ui.chatting.C73774p2;
import com.tencent.p014mm.p136ui.chatting.component.C73521l0;
import com.tencent.p014mm.p136ui.chatting.manager.C6789c;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74059i7;
import com.tencent.p014mm.p136ui.tools.C74860u1;
import com.tencent.p014mm.p136ui.tools.ShowImageUI;
import com.tencent.p014mm.p136ui.transmit.C74917p;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.p136ui.widget.MMPinProgressBtn;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.plugin.fav.p047ui.C93594f1;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder;
import com.tencent.p014mm.pluginsdk.model.app.C72683d;
import com.tencent.p014mm.pluginsdk.model.app.C72695v;
import com.tencent.p014mm.pluginsdk.model.app.C72709y1;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.smiley.C96965r;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.FileReaderHelper;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import cy0.C75308c;
import di3.C86312j;
import e30.C75539a;
import eb0.C31543z5;
import eb0.C45628s0;
import eb0.C45629t0;
import eb0.C75592q0;
import eb0.C75604z3;
import eb0.C97625j3;
import ex0.C45696d;
import ex0.C45700h;
import f40.C86709a0;
import f62.C75700k0;
import gc0.C20828a;
import h81.C32735h;
import hc0.C20937c;
import j20.C117292a;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import k20.C60958c;
import k20.C9556a;
import kb0.C33860c;
import kb0.C76528a;
import ke3.C88144b;
import kg3.C76577a;
import kr0.C76629w0;
import kr0.C76630x0;
import lg3.C88494d;
import nj3.C76879j;
import nj3.C76912y0;
import org.xwalk.core.XWalkEnvironment;
import p03.C21914h;
import p03.C21915i;
import p1031sb.C90159e;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98124g;
import p158gt.C76057w;
import p158gt.C98201k;
import p182kk.C61104a;
import p203mi.C24982c0;
import p203mi.C76758b0;
import p243tn.C14050a;
import p244tt.C14088e;
import p248ug.C102027b;
import p529fv.C59331r;
import p629ny.C76979h;
import p644pi.C77089d;
import p684si.C77711c;
import p684si.C77712d;
import p763ym.C79139p;
import pb1.C100734q;
import qo3.C77407n;
import rb0.C47987l;
import t90.C77877a;
import te3.C101834rc0;
import te3.C101846tc0;
import te3.C64719t23;
import te3.C77915dp3;
import te3.C77955jv3;
import te3.j25;
import te3.uh4;
import te3.w25;
import u73.C101987v0;
import u73.C90621r0;
import vr2.C102260r;
import wc3.C102430l;
import wd3.C22898h;
import wd3.C22908r;
import zj3.C79368l;
import zt3.C119157j;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.u */
public class C74244u {

    /* renamed from: a */
    public static boolean f217993a;

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.u$j */
    public static class C44867j {

        /* renamed from: a */
        public String f121722a;

        /* renamed from: b */
        public String f121723b;

        /* renamed from: c */
        public String f121724c;

        /* renamed from: d */
        public String f121725d;

        /* renamed from: e */
        public String f121726e;

        /* renamed from: f */
        public String f121727f;
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.u$c */
    public static final class C57796c {
        /* renamed from: a */
        public static void m66768a(Intent intent, C67391b bVar, C72963f4 f4Var, C74023i iVar) {
            String r = bVar.mo91577r();
            String y = iVar.mo103068y(bVar, f4Var);
            Bundle bundle = new Bundle();
            if (bVar.mo91583x()) {
                bundle.putInt("stat_scene", 2);
            } else {
                bundle.putInt("stat_scene", C45628s0.m50738C(r) ? 7 : 1);
            }
            bundle.putString("stat_msg_id", "msg_" + Long.toString(f4Var.mo108774y2()));
            bundle.putString("stat_chat_talker_username", r);
            bundle.putString("stat_send_msg_user", y);
            intent.putExtra("_stat_obj", bundle);
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.u$a */
    public class C74245a implements C74917p.C74919b {

        /* renamed from: a */
        public final /* synthetic */ C72963f4 f217994a;

        /* renamed from: b */
        public final /* synthetic */ C74023i.C74026c f217995b;

        /* renamed from: c */
        public final /* synthetic */ C67391b f217996c;

        /* renamed from: d */
        public final /* synthetic */ int f217997d;

        public C74245a(C72963f4 f4Var, C74023i.C74026c cVar, C67391b bVar, int i) {
            this.f217994a = f4Var;
            this.f217995b = cVar;
            this.f217996c = bVar;
            this.f217997d = i;
        }

        /* renamed from: a */
        public void mo103253a() {
            C74244u.m88502m(this.f217994a, this.f217995b, this.f217996c, this.f217997d, 1);
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.u$b */
    public class C74246b implements C76758b0.C76762d {

        /* renamed from: a */
        public final /* synthetic */ boolean f217998a;

        /* renamed from: b */
        public final /* synthetic */ C74023i.C74026c f217999b;

        /* renamed from: c */
        public final /* synthetic */ C67391b f218000c;

        /* renamed from: d */
        public final /* synthetic */ C72963f4 f218001d;

        public C74246b(boolean z, C74023i.C74026c cVar, C67391b bVar, C72963f4 f4Var) {
            this.f217998a = z;
            this.f217999b = cVar;
            this.f218000c = bVar;
            this.f218001d = f4Var;
        }

        /* renamed from: a */
        public void mo102497a() {
            Pair pair;
            WxaAttributes N2;
            boolean z = !this.f217998a;
            C74023i.C74026c cVar = this.f217999b;
            C67391b bVar = this.f218000c;
            if (cVar instanceof C74255e) {
                C74244u.m88507r(z, (C74255e) cVar, bVar);
            } else if (cVar instanceof C74059i7.C74068g) {
                C74059i7.m88004h(z, (C74059i7.C74068g) cVar, bVar);
            }
            C72963f4 f4Var = this.f218001d;
            Class cls = C77089d.class;
            if (f4Var == null) {
                Log.m105920e("MicroMsg.roomTodo.RoomTodoHelp", "msginfo is null");
                pair = new Pair(Boolean.FALSE, "");
            } else if (f4Var.mo100971J3()) {
                C77955jv3 jv32 = new C77955jv3();
                jv32.f227698d = "related_msgid_" + f4Var.mo108774y2();
                jv32.f227699e = "roomannouncement@app.origin";
                jv32.f227700f = "";
                jv32.f227701g = C31543z5.m39455e();
                jv32.f227703i = MMApplicationContext.getContext().getString(C0966R.string.b4n);
                jv32.f227704j = C67301m.m79637b(f4Var);
                jv32.f227705n = f4Var.mo108774y2();
                jv32.f227706o = C75592q0.m90789s();
                ((C77089d) C86312j.m106911c(cls)).zx0().mo86267a(f4Var.mo108768t(), 0, jv32);
                pair = new Pair(Boolean.TRUE, jv32.f227698d);
            } else {
                C68070l.C68072b u = C68070l.C68072b.m80422u(f4Var.getContent(), (String) null);
                if (u == null) {
                    Log.m105920e("MicroMsg.roomTodo.RoomTodoHelp", "content is null");
                    pair = new Pair(Boolean.FALSE, "");
                } else {
                    C77955jv3 jv33 = new C77955jv3();
                    C80995a aVar = (C80995a) u.mo93555w(C80995a.class);
                    if (aVar == null || Util.isNullOrNil(aVar.f237909r)) {
                        jv33.f227698d = "related_msgid_" + f4Var.mo108774y2();
                    } else {
                        jv33.f227698d = aVar.f237909r;
                    }
                    jv33.f227699e = u.f195573f2;
                    jv33.f227700f = u.f195569e2;
                    jv33.f227701g = C31543z5.m39455e();
                    String str = u.f195570f;
                    if (Util.isNullOrNil(str) && (N2 = ((C76629w0) C86312j.m106911c(C76629w0.class)).mo106879N2(u.f195573f2)) != null && !Util.isNullOrNil(N2.field_nickname)) {
                        str = N2.field_nickname;
                    }
                    jv33.f227703i = str;
                    jv33.f227704j = C67301m.m79637b(f4Var);
                    jv33.f227705n = f4Var.mo108774y2();
                    jv33.f227706o = C75592q0.m90789s();
                    jv33.f227707p = u.f195593k2;
                    jv33.f227708q = f4Var.mo108768t();
                    ((C77089d) C86312j.m106911c(cls)).zx0().mo86267a(f4Var.mo108768t(), 0, jv33);
                    pair = new Pair(Boolean.TRUE, jv33.f227698d);
                }
            }
            Log.m105925i("MicroMsg.ChattingItemAppMsg", "handleTodoClickImp addtodo msgId(%s) result:%s", Long.valueOf(this.f218001d.mo108774y2()), pair);
        }

        /* renamed from: b */
        public void mo102498b() {
            C77955jv3 jv32;
            boolean z = !this.f217998a;
            C74023i.C74026c cVar = this.f217999b;
            C67391b bVar = this.f218000c;
            if (cVar instanceof C74255e) {
                C74244u.m88507r(z, (C74255e) cVar, bVar);
            } else if (cVar instanceof C74059i7.C74068g) {
                C74059i7.m88004h(z, (C74059i7.C74068g) cVar, bVar);
            }
            C72963f4 f4Var = this.f218001d;
            Class cls = C77089d.class;
            Class cls2 = C75700k0.class;
            C77711c Lo = ((C77089d) C86312j.m106911c(cls)).wx0().mo107864Lo(f4Var.mo108768t(), f4Var.f230738V);
            if (Lo != null) {
                Iterator it = ((ArrayList) Lo.f226492S).iterator();
                while (it.hasNext()) {
                    C72963f4 h302 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls2)).mo96095LE()).h30(f4Var.mo108768t(), ((Long) it.next()).longValue());
                    h302.mo108737Q2("");
                    ((C72972g4) ((C75700k0) C86709a0.m107533q(cls2)).mo96095LE()).xy0(h302.getMsgId(), h302);
                }
                NotifyGroupTodoEvent notifyGroupTodoEvent = new NotifyGroupTodoEvent();
                NotifyGroupTodoEvent.C67740a aVar = notifyGroupTodoEvent.f193762d;
                aVar.f193763a = 1;
                aVar.f193765c = f4Var.f230738V;
                aVar.f193764b = f4Var.mo108768t();
                notifyGroupTodoEvent.asyncPublish(Looper.getMainLooper());
                Log.m105925i("MicroMsg.roomTodo.RoomTodoHelp", "recallTodoByClickMsg todoId:%s result:%s", f4Var.f230738V, Boolean.valueOf(C76758b0.m92504i(Lo)));
                jv32 = C76758b0.m92497b(Lo);
            } else {
                C72963f4 h303 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls2)).mo96095LE()).h30(f4Var.mo108768t(), f4Var.mo108774y2());
                h303.mo108737Q2("");
                ((C72972g4) ((C75700k0) C86709a0.m107533q(cls2)).mo96095LE()).xy0(h303.getMsgId(), h303);
                jv32 = new C77955jv3();
                jv32.f227698d = f4Var.f230738V;
                C68070l.C68072b u = C68070l.C68072b.m80422u(f4Var.getContent(), (String) null);
                if (u == null) {
                    jv32.f227699e = "";
                    jv32.f227700f = "";
                    jv32.f227703i = "";
                } else {
                    jv32.f227699e = u.f195573f2;
                    jv32.f227700f = u.f195569e2;
                    jv32.f227703i = u.f195570f;
                }
                jv32.f227701g = (int) (f4Var.getCreateTime() / 10000);
                jv32.f227704j = C67301m.m79637b(f4Var);
                jv32.f227705n = f4Var.mo108774y2();
                jv32.f227706o = "";
                Log.m105925i("MicroMsg.roomTodo.RoomTodoHelp", "recallTodoByClickMsg todoId:%s", f4Var.f230738V);
            }
            ((C77089d) C86312j.m106911c(cls)).zx0().mo86267a(f4Var.mo108768t(), 1, jv32);
            Log.m105925i("MicroMsg.ChattingItemAppMsg", "handleTodoClickImp recall msgId(%s) result:%s", Long.valueOf(this.f218001d.mo108774y2()), new Pair(Boolean.TRUE, f4Var.f230738V));
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.u$d */
    public static class C74247d {

        /* renamed from: a */
        public static HashSet<String> f218002a;

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.u$d$a */
        public class C74248a implements C98124g.C98125a {

            /* renamed from: d */
            public final /* synthetic */ C67391b f218003d;

            /* renamed from: e */
            public final /* synthetic */ Intent f218004e;

            /* renamed from: f */
            public final /* synthetic */ int f218005f;

            /* renamed from: g */
            public final /* synthetic */ C88144b.C76564c f218006g;

            /* renamed from: h */
            public final /* synthetic */ C72963f4 f218007h;

            /* renamed from: i */
            public final /* synthetic */ C72683d f218008i;

            /* renamed from: com.tencent.mm.ui.chatting.viewitems.u$d$a$a */
            public class C74249a implements Runnable {

                /* renamed from: com.tencent.mm.ui.chatting.viewitems.u$d$a$a$a */
                public class C74250a implements DialogInterface.OnClickListener {
                    public C74250a(C74249a aVar) {
                    }

                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                }

                public C74249a() {
                }

                public void run() {
                    Log.m105924i("MicroMsg.AppMessageUtil", "appmsg is expired or clean!!!");
                    C76879j.m92749t(C74248a.this.f218003d.mo91565f(), C74248a.this.f218003d.mo91565f().getString(C0966R.string.cuz), C74248a.this.f218003d.mo91565f().getString(C0966R.string.a3h), new C74250a(this));
                }
            }

            /* renamed from: com.tencent.mm.ui.chatting.viewitems.u$d$a$b */
            public class C74251b implements Runnable {
                public C74251b() {
                }

                public void run() {
                    C76879j.m92748s(C74248a.this.f218003d.mo91565f(), C74248a.this.f218003d.mo91572m().getString(C0966R.string.buw), "");
                }
            }

            public C74248a(C67391b bVar, Intent intent, int i, C88144b.C76564c cVar, C72963f4 f4Var, C72683d dVar) {
                this.f218003d = bVar;
                this.f218004e = intent;
                this.f218005f = i;
                this.f218006g = cVar;
                this.f218007h = f4Var;
                this.f218008i = dVar;
            }

            /* renamed from: g0 */
            public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
                C72683d dVar2;
                Object[] objArr = new Object[7];
                objArr[0] = str;
                Integer valueOf = Integer.valueOf(i);
                boolean z2 = true;
                objArr[1] = valueOf;
                objArr[2] = cVar;
                objArr[3] = dVar;
                objArr[4] = Boolean.valueOf(cVar != null);
                if (dVar == null) {
                    z2 = false;
                }
                objArr[5] = Boolean.valueOf(z2);
                objArr[6] = Boolean.valueOf(z);
                Log.m105925i("MicroMsg.AppMessageUtil", "summerbig cdnCallback mediaId:%s startRet:%d proginfo:[%s] res:[%s], progressing[%b], finish[%b], onlyCheckExist[%b]", objArr);
                if (dVar != null) {
                    if (dVar.field_exist_whencheck) {
                        this.f218003d.mo91557R(this.f218004e, this.f218005f, this.f218006g);
                    } else if (this.f218007h.mo100972K3() || ((dVar2 = this.f218008i) != null && C73521l0.m86925b(this.f218007h, dVar2.field_fileFullPath))) {
                        ((C119157j) C119157j.f356862d).mo183895z(new C74249a());
                    } else {
                        ((C119157j) C119157j.f356862d).mo183895z(new C74251b());
                    }
                }
                return 0;
            }

            /* renamed from: h */
            public void mo1774h(String str, ByteArrayOutputStream byteArrayOutputStream) {
            }

            /* renamed from: j */
            public byte[] mo1775j(String str, byte[] bArr) {
                return new byte[0];
            }
        }

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.u$d$b */
        public class C74252b implements DialogInterface.OnClickListener {
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        }

        /* renamed from: a */
        public static boolean m88511a(C67391b bVar, Intent intent, C72963f4 f4Var, String str, int i, C88144b.C76564c cVar) {
            if (f4Var.mo100972K3() || C73521l0.m86925b(f4Var, str)) {
                Log.m105924i("MicroMsg.AppMessageUtil", "appmsg is expired or clean!!!");
                C76879j.m92749t(bVar.mo91565f(), bVar.mo91565f().getString(C0966R.string.cuz), bVar.mo91565f().getString(C0966R.string.a3h), new C74252b());
                return true;
            }
            bVar.mo91557R(intent, i, cVar);
            return false;
        }

        /* renamed from: b */
        public static boolean m88512b(String str) {
            String h302 = ((C92839m) ((C98201k) C86312j.m106911c(C98201k.class)).mo137277xi()).h30(str);
            boolean z = false;
            if (!C86013q1.m106450k(h302)) {
                return false;
            }
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            Bitmap decodeFile = BitmapUtil.decodeFile(h302, options);
            int i = options.outWidth;
            if (options.outHeight * i > 1048576) {
                Log.m105925i("MicroMsg.AppMessageUtil", "Bitmap to big:%d/%d", Integer.valueOf(i), Integer.valueOf(options.outHeight));
                z = true;
            }
            if (decodeFile != null) {
                decodeFile.recycle();
            }
            return z;
        }

        /* renamed from: c */
        public static boolean m88513c(String str) {
            return Util.isImageExt(str);
        }

        /* renamed from: d */
        public static boolean m88514d(String str) {
            if (f218002a == null) {
                HashSet<String> hashSet = new HashSet<>();
                f218002a = hashSet;
                hashSet.add("h264");
                f218002a.add("h26l");
                f218002a.add("264");
                f218002a.add("avc");
                f218002a.add("mov");
                f218002a.add("mp4");
                f218002a.add(FileReaderHelper.M4A_EXT);
                f218002a.add("3gp");
                f218002a.add("3g2");
                f218002a.add("mj2");
                f218002a.add("m4v");
                f218002a.add("swf");
                f218002a.add("vob");
                f218002a.add("mpg");
                f218002a.add("rmvb");
            }
            return f218002a.contains(str);
        }

        /* JADX WARNING: Removed duplicated region for block: B:50:0x0181  */
        /* JADX WARNING: Removed duplicated region for block: B:99:0x039a  */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static void m88515e(ck3.C67391b r29, com.tencent.p014mm.storage.C72963f4 r30, java.lang.String r31, int r32, ke3.C88144b.C76564c r33) {
            /*
                r7 = r29
                r8 = r30
                r9 = r31
                r10 = r32
                r11 = r33
                java.lang.Class<com.tencent.mm.message.a> r0 = com.tencent.p014mm.message.C80995a.class
                boolean r1 = r29.mo91583x()
                java.lang.String r2 = r30.getContent()
                int r3 = r30.mo108769t2()
                java.lang.String r1 = eb0.C75604z3.m90840l(r1, r2, r3)
                android.content.Intent r12 = new android.content.Intent
                android.app.Activity r2 = r29.mo91565f()
                java.lang.Class<com.tencent.mm.ui.transmit.MsgRetransmitUI> r3 = com.tencent.p014mm.p136ui.transmit.MsgRetransmitUI.class
                r12.<init>(r2, r3)
                if (r1 == 0) goto L_0x0032
                byte[] r2 = r1.getBytes()
                java.lang.String r3 = "Retr_Msg_content_bytes"
                r12.putExtra(r3, r2)
            L_0x0032:
                java.lang.String r2 = "Retr_MsgFromScene"
                r13 = 2
                r12.putExtra(r2, r13)
                r2 = 0
                com.tencent.mm.message.l$b r14 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r1, r2)
                r1 = 11
                r2 = 10
                r15 = 3
                java.lang.String r3 = "Retr_Msg_Type"
                java.lang.String r6 = ""
                if (r14 == 0) goto L_0x0054
                r4 = 19
                int r5 = r14.f195582i
                if (r4 != r5) goto L_0x0054
                r12.putExtra(r3, r2)
            L_0x0051:
                r13 = r14
                goto L_0x016d
            L_0x0054:
                if (r14 == 0) goto L_0x0060
                r4 = 24
                int r5 = r14.f195582i
                if (r4 != r5) goto L_0x0060
                r12.putExtra(r3, r2)
                goto L_0x0051
            L_0x0060:
                if (r14 == 0) goto L_0x006e
                r4 = 16
                int r5 = r14.f195582i
                if (r4 != r5) goto L_0x006e
                r0 = 14
                r12.putExtra(r3, r0)
                goto L_0x0051
            L_0x006e:
                r4 = 33
                if (r14 == 0) goto L_0x0085
                int r5 = r14.f195582i
                if (r4 == r5) goto L_0x007a
                r2 = 36
                if (r2 != r5) goto L_0x0085
            L_0x007a:
                com.tencent.mm.message.OnAppBrandAppMessageRetransmitEvent r2 = new com.tencent.mm.message.OnAppBrandAppMessageRetransmitEvent
                r2.<init>()
                r2.f195352d = r14
                r2.publish()
                goto L_0x0096
            L_0x0085:
                if (r14 == 0) goto L_0x008d
                r2 = 76
                int r5 = r14.f195582i
                if (r2 == r5) goto L_0x0091
            L_0x008d:
                int r2 = r14.f195582i
                if (r2 != r15) goto L_0x0096
            L_0x0091:
                java.lang.String r2 = "content_type_forward_to_wework"
                r12.putExtra(r2, r1)
            L_0x0096:
                r12.putExtra(r3, r13)
                java.lang.String r2 = r30.mo108768t()
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r6)
                long r4 = r30.mo108774y2()
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                java.lang.String r3 = eb0.C86493v0.m107223a(r3)
                java.lang.String r4 = "reportSessionId"
                r12.putExtra(r4, r3)
                eb0.v0 r4 = eb0.C86493v0.m107224d()
                r5 = 1
                eb0.v0$c r3 = r4.mo120947c(r3, r5)
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "msg_"
                r4.append(r5)
                r18 = r14
                long r13 = r30.mo108774y2()
                r4.append(r13)
                java.lang.String r4 = r4.toString()
                java.lang.String r5 = "prePublishId"
                r3.mo120962i(r5, r4)
                java.lang.String r4 = "preUsername"
                r3.mo120962i(r4, r9)
                java.lang.String r4 = "preChatName"
                r3.mo120962i(r4, r2)
                r13 = r18
                if (r18 == 0) goto L_0x0110
                com.tencent.mm.message.g r2 = r13.mo93555w(r0)
                if (r2 == 0) goto L_0x0110
                com.tencent.mm.message.g r2 = r13.mo93555w(r0)
                com.tencent.mm.message.a r2 = (com.tencent.p014mm.message.C80995a) r2
                int r2 = r2.f237895d
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                java.lang.String r4 = "appservicetype"
                r3.mo120962i(r4, r2)
                com.tencent.mm.message.g r0 = r13.mo93555w(r0)
                com.tencent.mm.message.a r0 = (com.tencent.p014mm.message.C80995a) r0
                int r0 = r0.f237895d
                java.lang.String r2 = "Retr_MsgAppBrandServiceType"
                r12.putExtra(r2, r0)
            L_0x0110:
                if (r13 == 0) goto L_0x0156
                int r0 = r13.f195582i
                r2 = 33
                if (r2 != r0) goto L_0x0156
                com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r0 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.SessionAppbrand
                android.app.Activity r2 = r29.mo91565f()
                boolean r0 = r0.checkAvailable(r2)
                if (r0 != 0) goto L_0x0125
                return
            L_0x0125:
                boolean r0 = r29.mo91583x()
                java.lang.String r2 = "Retr_MsgAppBrandFromScene"
                java.lang.String r4 = "fromScene"
                if (r0 == 0) goto L_0x013c
                r0 = 2
                java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
                r3.mo120962i(r4, r5)
                r12.putExtra(r2, r0)
                r0 = 1
                goto L_0x0147
            L_0x013c:
                r0 = 1
                java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
                r3.mo120962i(r4, r5)
                r12.putExtra(r2, r0)
            L_0x0147:
                java.lang.String r2 = "Retr_MsgFromUserName"
                r12.putExtra(r2, r9)
                java.lang.String r2 = r30.mo108768t()
                java.lang.String r4 = "Retr_MsgTalker"
                r12.putExtra(r4, r2)
                goto L_0x0157
            L_0x0156:
                r0 = 1
            L_0x0157:
                java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
                java.lang.String r0 = "sendAppMsgScene"
                r3.mo120962i(r0, r2)
                java.lang.Class<jr2.r> r0 = jr2.C76442r.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                jr2.r r0 = (jr2.C76442r) r0
                java.lang.String r2 = "adExtStr"
                r0.mo106656pL(r2, r3, r8)
            L_0x016d:
                long r2 = r30.getMsgId()
                java.lang.String r0 = "Retr_Msg_Id"
                r12.putExtra(r0, r2)
                long r2 = r30.getMsgId()
                java.lang.String r0 = "Retr_Security_Msg_Id"
                r12.putExtra(r0, r2)
                if (r13 == 0) goto L_0x039a
                int r0 = r13.f195582i
                r2 = 6
                if (r0 == r2) goto L_0x0189
                r0 = r7
                goto L_0x039c
            L_0x0189:
                r14 = 4
                r3 = 0
                r17 = 0
                if (r0 != r2) goto L_0x0234
                kj2.d r18 = kj2.C117407d.INSTANCE
                r19 = 1203(0x4b3, double:5.944E-321)
                r21 = 7
                r23 = 1
                r25 = 0
                r18.idkeyStat(r19, r21, r23, r25)
                long r18 = r30.mo108774y2()
                java.lang.Class<t90.b> r0 = t90.C77878b.class
                com.tencent.mm.message.g r0 = r13.mo93555w(r0)
                t90.b r0 = (t90.C77878b) r0
                r20 = r6
                if (r0 == 0) goto L_0x01b5
                long r5 = r0.f226901b
                int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                if (r0 == 0) goto L_0x01b5
                r18 = r5
            L_0x01b5:
                com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r6 = 13
                java.lang.Object[] r6 = new java.lang.Object[r6]
                java.lang.String r3 = r13.f195500J
                r6[r17] = r3
                int r3 = r13.f195626t
                r4 = 5
                r5 = 1
                if (r3 != r5) goto L_0x01c7
                r3 = 7
                goto L_0x01c8
            L_0x01c7:
                r3 = 5
            L_0x01c8:
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r6[r5] = r3
                int r3 = r13.f195594l
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r5 = 2
                r6[r5] = r3
                java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
                r6[r15] = r3
                long r25 = eb0.C31543z5.m39453c()
                long r27 = r30.getCreateTime()
                long r25 = r25 - r27
                r27 = 1000(0x3e8, double:4.94E-321)
                long r25 = r25 / r27
                java.lang.Long r3 = java.lang.Long.valueOf(r25)
                r6[r14] = r3
                java.lang.String r3 = r13.f195602n
                r6[r4] = r3
                java.lang.String r3 = r30.mo108768t()
                r6[r2] = r3
                r2 = 1
                java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
                r5 = 7
                r6[r5] = r3
                r2 = 8
                r6[r2] = r20
                r2 = 9
                java.lang.Long r3 = java.lang.Long.valueOf(r18)
                r6[r2] = r3
                long r2 = r30.getCreateTime()
                java.lang.Long r2 = java.lang.Long.valueOf(r2)
                r3 = 10
                r6[r3] = r2
                long r2 = eb0.C31543z5.m39451a()
                java.lang.Long r2 = java.lang.Long.valueOf(r2)
                r6[r1] = r2
                r1 = 12
                r2 = 1
                java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
                r6[r1] = r3
                r1 = 14665(0x3949, float:2.055E-41)
                r0.mo160131h(r1, r6)
                goto L_0x0237
            L_0x0234:
                r20 = r6
                r5 = 7
            L_0x0237:
                int r0 = r13.f195626t
                if (r0 != 0) goto L_0x0244
                int r0 = r13.f195594l
                r1 = 26214400(0x1900000, float:5.2897246E-38)
                if (r0 <= r1) goto L_0x0242
                goto L_0x0244
            L_0x0242:
                r0 = 0
                goto L_0x0245
            L_0x0244:
                r0 = 1
            L_0x0245:
                java.lang.String r1 = "Retr_Big_File"
                r12.putExtra(r1, r0)
                java.lang.String r2 = r13.f195606o
                com.tencent.mm.pluginsdk.model.app.d r6 = com.tencent.p014mm.pluginsdk.model.app.C72695v.m85065g(r2)
                java.lang.String r4 = "MicroMsg.AppMessageUtil"
                if (r6 == 0) goto L_0x02cd
                com.tencent.mm.vfs.m1 r2 = new com.tencent.mm.vfs.m1
                java.lang.String r3 = r6.field_fileFullPath
                r2.<init>((java.lang.String) r3)
                boolean r3 = r2.mo119967g()
                if (r3 == 0) goto L_0x026f
                long r2 = r2.mo119980r()
                long r14 = r6.field_totalLen
                int r19 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
                if (r19 != 0) goto L_0x026f
                r7.mo91557R(r12, r10, r11)
                return
            L_0x026f:
                long r2 = r6.field_offset
                r14 = 0
                int r19 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
                if (r19 <= 0) goto L_0x02cd
                long r14 = r6.field_totalLen
                int r19 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
                if (r19 <= 0) goto L_0x02cd
                java.lang.String r0 = r6.field_fileFullPath
                boolean r1 = r30.mo100972K3()
                if (r1 != 0) goto L_0x028e
                boolean r0 = com.tencent.p014mm.p136ui.chatting.component.C73521l0.m86925b(r8, r0)
                if (r0 == 0) goto L_0x028c
                goto L_0x028e
            L_0x028c:
                r5 = 0
                goto L_0x02b6
            L_0x028e:
                java.lang.String r0 = "appmsg is expired or clean!!!"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
                android.app.Activity r0 = r29.mo91565f()
                android.app.Activity r1 = r29.mo91565f()
                r2 = 2131825915(0x7f1114fb, float:1.92847E38)
                java.lang.String r1 = r1.getString(r2)
                android.app.Activity r2 = r29.mo91565f()
                r3 = 2131821704(0x7f110488, float:1.9276159E38)
                java.lang.String r2 = r2.getString(r3)
                com.tencent.mm.ui.chatting.viewitems.a0 r3 = new com.tencent.mm.ui.chatting.viewitems.a0
                r3.<init>()
                nj3.C76879j.m92749t(r0, r1, r2, r3)
                r5 = 1
            L_0x02b6:
                if (r5 != 0) goto L_0x02cc
                android.app.Activity r0 = r29.mo91565f()
                android.content.res.Resources r1 = r29.mo91572m()
                r2 = 2131824451(0x7f110f43, float:1.928173E38)
                java.lang.String r1 = r1.getString(r2)
                r14 = r20
                nj3.C76879j.m92748s(r0, r1, r14)
            L_0x02cc:
                return
            L_0x02cd:
                r14 = r20
                r2 = 3
                java.lang.Object[] r3 = new java.lang.Object[r2]
                int r2 = r13.f195594l
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r3[r17] = r2
                java.lang.String r2 = r13.f195500J
                r15 = 1
                r3[r15] = r2
                java.lang.String r2 = r13.f195524R
                java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.secPrint(r2)
                r16 = 2
                r3[r16] = r2
                java.lang.String r2 = "summerbig retrans content.attachlen[%d], cdnAttachUrl[%s], aesKey[%s]"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r2, r3)
                if (r0 != 0) goto L_0x02ff
                r3 = 0
                r0 = r29
                r1 = r12
                r2 = r30
                r4 = r32
                r5 = r33
                m88511a(r0, r1, r2, r3, r4, r5)
                return
            L_0x02ff:
                r12.putExtra(r1, r0)
                gi.g r3 = new gi.g
                r3.<init>()
                java.lang.String r0 = "task_ChattingItemAppMsg"
                r3.f287660d = r0
                com.tencent.mm.ui.chatting.viewitems.u$d$a r2 = new com.tencent.mm.ui.chatting.viewitems.u$d$a
                r0 = r2
                r1 = r29
                r15 = r2
                r2 = r12
                r8 = r3
                r3 = r32
                r20 = r14
                r14 = r4
                r4 = r33
                r7 = 7
                r5 = r30
                r7 = r20
                r0.<init>(r1, r2, r3, r4, r5, r6)
                r8.f287662f = r15
                long r0 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r7)
                long r3 = r30.getMsgId()
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                java.lang.String r3 = "checkExist"
                java.lang.String r0 = com.tencent.p014mm.modelcdntran.C1297x.m1387b(r3, r0, r9, r2)
                r8.field_mediaId = r0
                java.lang.String r0 = r13.f195500J
                r8.field_fileId = r0
                java.lang.String r0 = r13.f195524R
                r8.field_aesKey = r0
                java.lang.String r0 = r13.f195622s
                r8.field_filemd5 = r0
                r0 = 7
                r8.field_fileType = r0
                r8.field_talker = r9
                r0 = 2
                r8.field_priority = r0
                r8.field_svr_signature = r7
                r0 = 1
                r8.field_onlycheckexist = r0
                java.lang.Class<qo.l> r1 = p663qo.C101213l.class
                di3.d r1 = di3.C86312j.m106911c(r1)
                qo.l r1 = (p663qo.C101213l) r1
                boolean r1 = r1.if0(r8)
                r2 = 4
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
                r2[r17] = r3
                java.lang.String r3 = r8.field_fileId
                r2[r0] = r3
                java.lang.String r0 = r8.field_mediaId
                r3 = 2
                r2[r3] = r0
                java.lang.String r0 = r8.field_aesKey
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.secPrint(r0)
                r3 = 3
                r2[r3] = r0
                java.lang.String r0 = "summerbig retrans to startupDownloadMedia ret[%b], field_fileId[%s], field_mediaId[%s], field_aesKey[%s]"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r0, r2)
                if (r1 != 0) goto L_0x0399
                r3 = 0
                r0 = r29
                r1 = r12
                r2 = r30
                r4 = r32
                r5 = r33
                m88511a(r0, r1, r2, r3, r4, r5)
            L_0x0399:
                return
            L_0x039a:
                r0 = r29
            L_0x039c:
                r0.mo91557R(r12, r10, r11)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.C74247d.m88515e(ck3.b, com.tencent.mm.storage.f4, java.lang.String, int, ke3.b$c):void");
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.u$h */
    public static class C74253h {

        /* renamed from: a */
        public boolean f218011a = false;

        public C74253h(C74245a aVar) {
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.u$i */
    public static class C74254i {

        /* renamed from: a */
        public C44867j f218012a;

        /* renamed from: b */
        public long f218013b;

        /* renamed from: c */
        public String f218014c;

        /* renamed from: d */
        public String f218015d;

        /* renamed from: e */
        public int f218016e = -1;

        /* renamed from: f */
        public C64719t23 f218017f = null;

        /* renamed from: g */
        public int f218018g = 0;

        /* renamed from: h */
        public String f218019h;
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.u$e */
    public static final class C74255e extends C74023i.C74026c {

        /* renamed from: s0 */
        public static int[] f218020s0 = {C0966R.C0970id.b85, C0966R.C0970id.b86, C0966R.C0970id.b87, C0966R.C0970id.b88, C0966R.C0970id.b89};

        /* renamed from: A */
        public ImageView f218021A;

        /* renamed from: B */
        public ImageView f218022B;

        /* renamed from: C */
        public LinearLayout f218023C;

        /* renamed from: D */
        public ImageView f218024D;

        /* renamed from: E */
        public TextView f218025E;

        /* renamed from: F */
        public ImageView f218026F;

        /* renamed from: G */
        public TextView f218027G;

        /* renamed from: H */
        public TextView f218028H;

        /* renamed from: I */
        public LinearLayout f218029I;

        /* renamed from: J */
        public ImageView f218030J;

        /* renamed from: K */
        public ImageView f218031K;

        /* renamed from: L */
        public ImageView f218032L;

        /* renamed from: M */
        public TextView f218033M;

        /* renamed from: N */
        public ImageView f218034N;

        /* renamed from: O */
        public ImageView f218035O;

        /* renamed from: P */
        public ImageView f218036P;

        /* renamed from: Q */
        public ImageView f218037Q;

        /* renamed from: R */
        public LinearLayout f218038R;

        /* renamed from: S */
        public TextView f218039S;

        /* renamed from: T */
        public TextView f218040T;

        /* renamed from: U */
        public ImageView f218041U;

        /* renamed from: V */
        public ImageView f218042V;

        /* renamed from: W */
        public ImageView f218043W;

        /* renamed from: X */
        public TextView f218044X;

        /* renamed from: Y */
        public ImageView f218045Y;

        /* renamed from: Z */
        public LinearLayout f218046Z;

        /* renamed from: a0 */
        public MMNeat7extView f218047a0;

        /* renamed from: b */
        public MMImageView f218048b;

        /* renamed from: b0 */
        public ImageView f218049b0;

        /* renamed from: c */
        public MMNeat7extView f218050c;

        /* renamed from: c0 */
        public ImageView f218051c0;

        /* renamed from: d */
        public TextView f218052d;

        /* renamed from: d0 */
        public ImageView f218053d0;

        /* renamed from: e */
        public TextView f218054e;

        /* renamed from: e0 */
        public TextView f218055e0;

        /* renamed from: f */
        public ImageView f218056f;

        /* renamed from: f0 */
        public TextView f218057f0;

        /* renamed from: g */
        public ImageView f218058g;

        /* renamed from: g0 */
        public TextView f218059g0;

        /* renamed from: h */
        public TextView f218060h;

        /* renamed from: h0 */
        public LinearLayout f218061h0;

        /* renamed from: i */
        public LinearLayout f218062i;

        /* renamed from: i0 */
        public LinearLayout f218063i0;

        /* renamed from: j */
        public TextView f218064j;

        /* renamed from: j0 */
        public ImageView f218065j0;

        /* renamed from: k */
        public ImageView f218066k;

        /* renamed from: k0 */
        public TextView f218067k0;

        /* renamed from: l */
        public MMPinProgressBtn f218068l;

        /* renamed from: l0 */
        public TextView f218069l0;

        /* renamed from: m */
        public ImageView f218070m;

        /* renamed from: m0 */
        public ImageView f218071m0;

        /* renamed from: n */
        public ImageView f218072n;

        /* renamed from: n0 */
        public RelativeLayout f218073n0;

        /* renamed from: o */
        public ImageView f218074o;

        /* renamed from: o0 */
        public LinearLayout f218075o0;

        /* renamed from: p */
        public ImageView f218076p;

        /* renamed from: p0 */
        public TextView f218077p0;

        /* renamed from: q */
        public TextView f218078q;

        /* renamed from: q0 */
        public int f218079q0 = 0;

        /* renamed from: r */
        public ImageView f218080r;

        /* renamed from: r0 */
        public int f218081r0 = Integer.MAX_VALUE;

        /* renamed from: s */
        public LinearLayout f218082s;

        /* renamed from: t */
        public ViewGroup f218083t;

        /* renamed from: u */
        public LinearLayout f218084u;

        /* renamed from: v */
        public RelativeLayout f218085v;

        /* renamed from: w */
        public FrameLayout f218086w;

        /* renamed from: x */
        public LinearLayout f218087x;

        /* renamed from: y */
        public LinearLayout f218088y;

        /* renamed from: z */
        public ViewStub f218089z;

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.u$e$a */
        public class C74256a implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ Boolean f218090d;

            /* renamed from: e */
            public final /* synthetic */ long f218091e;

            /* renamed from: f */
            public final /* synthetic */ C72963f4 f218092f;

            /* renamed from: g */
            public final /* synthetic */ String f218093g;

            public C74256a(Boolean bool, long j, C72963f4 f4Var, String str) {
                this.f218090d = bool;
                this.f218091e = j;
                this.f218092f = f4Var;
                this.f218093g = str;
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsg$AppMsgViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                if (this.f218090d.booleanValue()) {
                    C72695v.m85077s(this.f218091e, this.f218092f.mo108768t(), this.f218093g);
                } else {
                    C72695v.m85078t(this.f218091e, this.f218093g);
                    this.f218092f.mo100991d(5);
                    ((C72972g4) C97625j3.m125812b().mo105911z()).b00(this.f218091e);
                }
                C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsg$AppMsgViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.u$e$b */
        public class C74257b implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ Boolean f218094d;

            /* renamed from: e */
            public final /* synthetic */ long f218095e;

            /* renamed from: f */
            public final /* synthetic */ String f218096f;

            /* renamed from: g */
            public final /* synthetic */ C72963f4 f218097g;

            public C74257b(Boolean bool, long j, String str, C72963f4 f4Var) {
                this.f218094d = bool;
                this.f218095e = j;
                this.f218096f = str;
                this.f218097g = f4Var;
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsg$AppMsgViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                if (!this.f218094d.booleanValue()) {
                    C72695v.m85079u(this.f218095e, this.f218096f);
                    this.f218097g.mo100991d(1);
                    ((C72972g4) C97625j3.m125812b().mo105911z()).b00(this.f218095e);
                }
                C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsg$AppMsgViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.u$e$c */
        public class C74258c implements C76057w.C76058a {

            /* renamed from: com.tencent.mm.ui.chatting.viewitems.u$e$c$a */
            public class C74259a implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ Bitmap f218099d;

                public C74259a(Bitmap bitmap) {
                    this.f218099d = bitmap;
                }

                public void run() {
                    C74255e.this.f218056f.setImageBitmap(this.f218099d);
                }
            }

            public C74258c() {
            }

            /* renamed from: a */
            public void mo25933a(String str, Bitmap bitmap, String str2) {
                MMHandlerThread.postToMainThread(new C74259a(bitmap));
            }
        }

        public C74255e() {
            new ArrayList();
        }

        /* renamed from: c */
        public static void m88521c(C74255e eVar, C68070l.C68072b bVar) {
            String str = bVar.f195646y;
            if (!Util.isNullOrNil(str)) {
                C20937c.C20939b bVar2 = new C20937c.C20939b();
                bVar2.f59359o = C0966R.color.f3237k_;
                bVar2.f59347c = true;
                bVar2.f59345a = true;
                C20828a.m22825b().mo32519h(str, eVar.f218048b, bVar2.mo32666a());
            }
        }

        /* renamed from: e */
        public static void m88522e(C67391b bVar, C74255e eVar, C68070l.C68072b bVar2) {
            String l = bVar2.mo93549l(bVar.mo91565f(), false);
            if (!Util.isNullOrNil(l)) {
                eVar.f218062i.setVisibility(0);
                eVar.f218054e.setVisibility(0);
                eVar.f218056f.setVisibility(0);
                eVar.f218054e.setText(l);
                int i = bVar2.f195597l2;
                if (i == 0) {
                    eVar.f218056f.setImageResource(C0966R.raw.my_life_around_default_icon);
                } else if (1 == i || !Util.isNullOrNil(bVar2.f195613p2)) {
                    ((C76057w) C86312j.m106911c(C76057w.class)).h60(Util.isNullOrNil(bVar2.f195613p2) ? bVar2.f195471B2 : bVar2.f195613p2, new C74258c());
                }
            }
        }

        /* renamed from: f */
        public static void m88523f(C67391b bVar, C74255e eVar, C68070l.C68072b bVar2, C72963f4 f4Var, boolean z) {
            int b;
            eVar.f218087x.setVisibility(8);
            eVar.f218046Z.setVisibility(0);
            eVar.f218063i0.setVisibility(0);
            String str = bVar2.f195570f;
            if (str == null || str.length() <= 0) {
                eVar.f218047a0.setVisibility(8);
            } else {
                eVar.f218047a0.setMaxLines(2);
                eVar.f218047a0.setVisibility(0);
                eVar.f218047a0.mo104279b(bVar2.mo93550m());
            }
            C68065f fVar = (C68065f) bVar2.mo93555w(C68065f.class);
            String d = C92721n.m116876d(fVar != null ? fVar.f195419d : 0);
            if (!Util.isNullOrNil(d)) {
                eVar.f218057f0.setVisibility(0);
                eVar.f218057f0.setText(d);
            } else {
                eVar.f218057f0.setVisibility(8);
            }
            eVar.f218053d0.setVisibility(0);
            if (fVar != null) {
                if ((fVar.f195424i & 1) != 0) {
                    eVar.f218057f0.setVisibility(8);
                    eVar.f218053d0.setVisibility(8);
                }
            }
            C6805l4.m7091a(bVar.mo91565f(), bVar2, eVar.f218051c0, eVar.f218055e0);
            C6805l4.m7092b(eVar.f218059g0, bVar2, "MicroMsg.AppMsgViewHolder");
            eVar.f218066k.setVisibility(4);
            int h = C76577a.m92157h(bVar.mo91565f(), C0966R.dimen.f4284yo) - C76577a.m92151b(bVar.mo91565f(), 24);
            int i = (h * 9) / 16;
            if (C76577a.m92165p(bVar.mo91565f()) > 1.0f && eVar.f218073n0.getLayoutParams().height != (b = (int) ((((((float) eVar.f218079q0) / C88494d.f255615g) - (((float) C76577a.m92151b(bVar.mo91565f(), 29)) * C76577a.m92165p(bVar.mo91565f()))) * 9.0f) / 16.0f))) {
                eVar.f218073n0.getLayoutParams().height = b;
                eVar.f218073n0.requestLayout();
            }
            if (z || !Util.isNullOrNil(bVar2.f195646y)) {
                String a = C102027b.m134386a(bVar2.f195646y, 4, true);
                C20937c.C20939b bVar3 = new C20937c.C20939b();
                bVar3.f59359o = C0966R.color.f3237k_;
                bVar3.f59347c = true;
                bVar3.f59350f = C14050a.m13405b(a);
                bVar3.f59354j = h;
                bVar3.f59355k = i;
                bVar3.f59369y = new C22908r(4);
                bVar3.f59370z = new C22898h(4);
                bVar3.f59345a = true;
                C20828a.m22825b().mo32519h(a, eVar.f218049b0, bVar3.mo32666a());
                return;
            }
            Bitmap bitmap = null;
            if (!C74247d.m88512b(f4Var.mo108765s2())) {
                bitmap = ((C92839m) ((C98201k) C86312j.m106911c(C98201k.class)).mo137277xi()).mo127188jo(f4Var.mo108765s2(), C76577a.m92156g(bVar.mo91565f()), false);
            }
            if (bitmap == null || bitmap.isRecycled()) {
                eVar.f218049b0.setImageResource(C0966R.color.f3237k_);
            } else {
                eVar.f218049b0.setImageBitmap(bitmap);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0086, code lost:
            if (r6.f299308i1.equals("WeNoteHtmlFile") != false) goto L_0x0088;
         */
        /* JADX WARNING: Removed duplicated region for block: B:102:0x02dc  */
        /* JADX WARNING: Removed duplicated region for block: B:103:0x02de  */
        /* JADX WARNING: Removed duplicated region for block: B:106:0x02ea  */
        /* JADX WARNING: Removed duplicated region for block: B:112:0x031f  */
        /* JADX WARNING: Removed duplicated region for block: B:114:0x0324  */
        /* JADX WARNING: Removed duplicated region for block: B:117:0x032a  */
        /* JADX WARNING: Removed duplicated region for block: B:148:0x050d  */
        /* JADX WARNING: Removed duplicated region for block: B:149:0x0522  */
        /* JADX WARNING: Removed duplicated region for block: B:152:0x0528  */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0098  */
        /* JADX WARNING: Removed duplicated region for block: B:171:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0106  */
        /* renamed from: g */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static void m88524g(ck3.C67391b r29, com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.C74255e r30, com.tencent.p014mm.message.C68070l.C68072b r31, com.tencent.p014mm.storage.C72963f4 r32, boolean r33) {
            /*
                r0 = r30
                r1 = r31
                java.lang.Class<ny.h> r2 = p629ny.C76979h.class
                com.tencent.mm.autogen.events.RecordOperationEvent r3 = new com.tencent.mm.autogen.events.RecordOperationEvent
                r3.<init>()
                com.tencent.mm.autogen.events.RecordOperationEvent$a r4 = r3.f265027d
                r5 = 0
                r4.f265029a = r5
                java.lang.String r6 = r1.f195571f0
                r4.f265030b = r6
                r3.publish()
                com.tencent.mm.autogen.events.RecordOperationEvent$b r3 = r3.f265028e
                te3.dp3 r3 = r3.f265048a
                android.widget.RelativeLayout r4 = r0.f218085v
                r6 = 8
                r4.setVisibility(r6)
                r4 = 4
                java.lang.String[] r15 = new java.lang.String[r4]
                java.lang.String[] r14 = new java.lang.String[r4]
                java.lang.String[] r13 = new java.lang.String[r4]
                int[] r12 = new int[r4]
                java.lang.String[] r7 = new java.lang.String[r4]
                java.lang.String[] r8 = new java.lang.String[r4]
                int[] r9 = new int[r4]
                java.lang.String[] r11 = new java.lang.String[r4]
                if (r3 == 0) goto L_0x055a
                java.lang.String r10 = r3.f227154e
                java.lang.String r1 = r1.f195574g
                java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r10, (java.lang.String) r1)
                java.util.LinkedList<te3.rc0> r10 = r3.f227155f
                java.util.Iterator r10 = r10.iterator()
                r4 = 0
                r16 = 0
                r17 = 0
            L_0x0048:
                boolean r18 = r10.hasNext()
                java.lang.String r5 = ""
                java.lang.String r6 = ">"
                r20 = r2
                java.lang.String r2 = "&gt;"
                r21 = r3
                java.lang.String r3 = "<"
                r22 = r4
                java.lang.String r4 = "&lt;"
                r23 = r2
                java.lang.String r2 = "\n"
                r24 = r6
                if (r18 == 0) goto L_0x0148
                java.lang.Object r18 = r10.next()
                r6 = r18
                te3.rc0 r6 = (te3.C101834rc0) r6
                boolean r18 = com.tencent.p014mm.plugin.fav.p047ui.C93594f1.m118177e(r6)
                if (r18 == 0) goto L_0x008f
                r18 = r10
                java.lang.String r10 = r6.f299308i1
                boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
                if (r10 != 0) goto L_0x008c
                java.lang.String r10 = r6.f299308i1
                r27 = r3
                java.lang.String r3 = "WeNoteHtmlFile"
                boolean r3 = r10.equals(r3)
                if (r3 == 0) goto L_0x0093
            L_0x0088:
                r4 = r22
                goto L_0x013d
            L_0x008c:
                r27 = r3
                goto L_0x0093
            L_0x008f:
                r27 = r3
                r18 = r10
            L_0x0093:
                int r3 = r6.f299258I
                r10 = 1
                if (r3 == r10) goto L_0x0106
                r10 = 2
                if (r3 == r10) goto L_0x00c7
                r2 = 8
                if (r3 == r2) goto L_0x00a0
                goto L_0x00c3
            L_0x00a0:
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
                if (r2 == 0) goto L_0x00c3
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                r3 = 2131821530(0x7f1103da, float:1.9275806E38)
                java.lang.String r2 = r2.getString(r3)
                r1.append(r2)
                java.lang.String r2 = r6.f299297d
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                goto L_0x0088
            L_0x00c3:
                r3 = r17
                goto L_0x0139
            L_0x00c7:
                if (r33 == 0) goto L_0x00dc
                android.widget.RelativeLayout r2 = r0.f218085v
                r3 = 0
                r2.setVisibility(r3)
                com.tencent.mm.ui.MMImageView r2 = r0.f218048b
                r2.setVisibility(r3)
                com.tencent.mm.ui.MMImageView r2 = r0.f218048b
                r3 = 2131230947(0x7f0800e3, float:1.8077961E38)
                r2.setImageResource(r3)
            L_0x00dc:
                r3 = r17
                r2 = 4
                if (r3 >= r2) goto L_0x0103
                java.lang.String r2 = r6.f299305h
                r15[r3] = r2
                java.lang.String r2 = r6.f299309j
                r14[r3] = r2
                java.lang.String r2 = r6.f299288X
                r13[r3] = r2
                long r4 = r6.f299336x0
                int r2 = (int) r4
                r12[r3] = r2
                java.lang.String r2 = r6.f299325s
                r7[r3] = r2
                java.lang.String r2 = r6.f299329u
                r8[r3] = r2
                long r4 = r6.f299276R
                int r2 = (int) r4
                r9[r3] = r2
                java.lang.String r2 = r6.f299280T
                r11[r3] = r2
            L_0x0103:
                int r17 = r3 + 1
                goto L_0x0088
            L_0x0106:
                r3 = r17
                if (r16 != 0) goto L_0x0139
                java.lang.String r10 = r6.f299301f
                boolean r17 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
                if (r17 == 0) goto L_0x0113
                goto L_0x0139
            L_0x0113:
                java.lang.String r2 = r10.replaceAll(r2, r5)
                java.lang.String r2 = r2.trim()
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
                if (r2 != 0) goto L_0x0132
                java.lang.String r2 = r6.f299301f
                r6 = r27
                java.lang.String r2 = r2.replaceAll(r4, r6)
                r4 = r23
                r10 = r24
                java.lang.String r4 = r2.replaceAll(r4, r10)
                goto L_0x0134
            L_0x0132:
                r4 = r22
            L_0x0134:
                r17 = r3
                r16 = 1
                goto L_0x013d
            L_0x0139:
                r17 = r3
                goto L_0x0088
            L_0x013d:
                r10 = r18
                r2 = r20
                r3 = r21
                r5 = 0
                r6 = 8
                goto L_0x0048
            L_0x0148:
                r6 = r3
                r3 = r17
                r7 = r23
                r10 = r24
                if (r22 == 0) goto L_0x0207
                r17 = r13
                r9 = r22
                r8 = 2
                java.lang.String[] r13 = r9.split(r2, r8)
                java.util.ArrayList r8 = new java.util.ArrayList
                r8.<init>()
                int r9 = r13.length
                if (r9 <= 0) goto L_0x017a
                int r9 = r13.length
                r18 = r15
                r15 = 0
            L_0x0166:
                if (r15 >= r9) goto L_0x017c
                r23 = r9
                r9 = r13[r15]
                int r24 = r9.length()
                if (r24 <= 0) goto L_0x0175
                r8.add(r9)
            L_0x0175:
                int r15 = r15 + 1
                r9 = r23
                goto L_0x0166
            L_0x017a:
                r18 = r15
            L_0x017c:
                int r9 = r8.size()
                r13 = 1
                if (r9 != r13) goto L_0x0185
                r9 = 1
                goto L_0x0186
            L_0x0185:
                r9 = 0
            L_0x0186:
                int r15 = r8.size()
                if (r15 != r13) goto L_0x01a5
                r13 = r21
                java.util.LinkedList<te3.rc0> r13 = r13.f227155f
                int r13 = r13.size()
                r15 = 2
                if (r13 != r15) goto L_0x01a5
                android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                r2 = 2131825821(0x7f11149d, float:1.9284509E38)
                java.lang.String r1 = r1.getString(r2)
                r2 = r22
                goto L_0x0202
            L_0x01a5:
                if (r3 <= 0) goto L_0x01be
                r13 = 0
                java.lang.Object r1 = r8.get(r13)
                java.lang.String r1 = (java.lang.String) r1
                int r2 = r8.size()
                r15 = 1
                if (r2 <= r15) goto L_0x01bc
                java.lang.Object r2 = r8.get(r15)
                java.lang.String r2 = (java.lang.String) r2
                goto L_0x0202
            L_0x01bc:
                r2 = 0
                goto L_0x0202
            L_0x01be:
                r13 = 0
                r15 = 1
                java.lang.Object r8 = r8.get(r13)
                java.lang.String r8 = (java.lang.String) r8
                java.lang.String r15 = java.util.regex.Pattern.quote(r8)
                r33 = r8
                r8 = 2
                java.lang.String[] r1 = r1.split(r15, r8)
                r8 = r1[r13]
                java.lang.String r8 = r8.trim()
                int r15 = r1.length
                r13 = 1
                if (r15 <= r13) goto L_0x01ff
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r15 = 0
                r21 = r1[r15]
                java.lang.String r15 = r21.trim()
                r8.<init>(r15)
                r8.append(r2)
                r1 = r1[r13]
                java.lang.String r1 = r1.trim()
                r8.append(r1)
                java.lang.String r1 = r8.toString()
                java.lang.String r1 = r1.trim()
                r2 = r1
                r1 = r33
                goto L_0x0202
            L_0x01ff:
                r1 = r33
                r2 = r8
            L_0x0202:
                java.lang.String r1 = r1.trim()
                goto L_0x021c
            L_0x0207:
                r17 = r13
                r18 = r15
                android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                r8 = 2131825821(0x7f11149d, float:1.9284509E38)
                java.lang.String r2 = r2.getString(r8)
                r9 = 0
                r28 = r2
                r2 = r1
                r1 = r28
            L_0x021c:
                if (r1 == 0) goto L_0x0226
                java.lang.String r1 = r1.replaceAll(r4, r6)
                java.lang.String r1 = r1.replaceAll(r7, r10)
            L_0x0226:
                di3.d r8 = di3.C86312j.m106911c(r20)
                ny.h r8 = (p629ny.C76979h) r8
                android.widget.TextView r13 = r0.f218064j
                android.content.Context r13 = r13.getContext()
                android.widget.TextView r15 = r0.f218064j
                float r15 = r15.getTextSize()
                int r15 = (int) r15
                android.text.SpannableString r1 = r8.op0(r13, r1, r15)
                android.widget.TextView r8 = r0.f218064j
                r8.setText(r1)
                if (r2 == 0) goto L_0x0261
                int r1 = r2.length()
                r8 = 100
                if (r1 <= r8) goto L_0x0261
                boolean r1 = com.tencent.p014mm.smiley.C96965r.f284067d
                com.tencent.mm.smiley.r r1 = com.tencent.p014mm.smiley.C96965r.C44649c.f121057a
                r13 = 0
                int r1 = r1.mo135555g(r2, r13, r8)
                java.lang.String r1 = r2.substring(r13, r1)
                java.lang.String r1 = r1.replaceAll(r4, r6)
                java.lang.String r2 = r1.replaceAll(r7, r10)
            L_0x0261:
                di3.d r1 = di3.C86312j.m106911c(r20)
                ny.h r1 = (p629ny.C76979h) r1
                android.widget.TextView r4 = r0.f218052d
                android.content.Context r4 = r4.getContext()
                android.widget.TextView r6 = r0.f218052d
                float r6 = r6.getTextSize()
                int r6 = (int) r6
                android.text.SpannableString r1 = r1.op0(r4, r2, r6)
                android.widget.TextView r4 = r0.f218052d
                r4.setText(r1)
                if (r3 <= 0) goto L_0x054d
                android.widget.RelativeLayout r1 = r0.f218085v
                r4 = 8
                r1.setVisibility(r4)
                if (r9 != 0) goto L_0x02a5
                if (r16 == 0) goto L_0x02a5
                boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
                if (r1 == 0) goto L_0x0291
                goto L_0x02a5
            L_0x0291:
                android.widget.TextView r1 = r0.f218052d
                r2 = 1
                r1.setMaxLines(r2)
                android.widget.TextView r1 = r0.f218052d
                r4 = 0
                r1.setVisibility(r4)
                android.widget.TextView r1 = r0.f218064j
                r1.setMaxLines(r2)
                r2 = 8
                goto L_0x02b2
            L_0x02a5:
                android.widget.TextView r1 = r0.f218052d
                r2 = 8
                r1.setVisibility(r2)
                android.widget.TextView r1 = r0.f218064j
                r4 = 2
                r1.setMaxLines(r4)
            L_0x02b2:
                android.widget.ImageView r1 = r0.f218021A
                r1.setVisibility(r2)
                android.view.ViewStub r1 = r0.f218089z
                r2 = 2131493722(0x7f0c035a, float:1.8610932E38)
                r1.setLayoutResource(r2)
                android.widget.LinearLayout r1 = r0.f218088y     // Catch:{ Exception -> 0x02d3 }
                if (r1 != 0) goto L_0x02ce
                android.view.ViewStub r1 = r0.f218089z     // Catch:{ Exception -> 0x02d3 }
                android.view.View r1 = r1.inflate()     // Catch:{ Exception -> 0x02d3 }
                android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1     // Catch:{ Exception -> 0x02d3 }
                r0.f218088y = r1     // Catch:{ Exception -> 0x02d3 }
                goto L_0x02d9
            L_0x02ce:
                r2 = 0
                r1.setVisibility(r2)     // Catch:{ Exception -> 0x02d4 }
                goto L_0x02d9
            L_0x02d3:
                r2 = 0
            L_0x02d4:
                android.view.ViewStub r1 = r0.f218089z
                r1.setVisibility(r2)
            L_0x02d9:
                r1 = 4
                if (r3 <= r1) goto L_0x02de
                r2 = 4
                goto L_0x02df
            L_0x02de:
                r2 = r3
            L_0x02df:
                java.lang.String r4 = r32.mo108768t()
                long r9 = r32.getMsgId()
                r6 = 0
            L_0x02e8:
                if (r6 > r1) goto L_0x0305
                android.widget.LinearLayout r1 = r0.f218088y
                int[] r7 = f218020s0
                r7 = r7[r6]
                android.view.View r1 = r1.findViewById(r7)
                com.tencent.mm.ui.MMImageView r1 = (com.tencent.p014mm.p136ui.MMImageView) r1
                r7 = 0
                if (r1 == 0) goto L_0x0301
                r1.setImageDrawable(r7)
                r8 = 8
                r1.setVisibility(r8)
            L_0x0301:
                int r6 = r6 + 1
                r1 = 4
                goto L_0x02e8
            L_0x0305:
                android.widget.LinearLayout r1 = r0.f218088y
                r6 = 2131299390(0x7f090c3e, float:1.821678E38)
                android.view.View r1 = r1.findViewById(r6)
                android.widget.ImageView r1 = (android.widget.ImageView) r1
                android.widget.LinearLayout r7 = r0.f218088y
                r15 = 2131299384(0x7f090c38, float:1.8216768E38)
                android.view.View r7 = r7.findViewById(r15)
                android.widget.TextView r7 = (android.widget.TextView) r7
                r8 = 8
                if (r1 == 0) goto L_0x0322
                r1.setVisibility(r8)
            L_0x0322:
                if (r7 == 0) goto L_0x0327
                r7.setVisibility(r8)
            L_0x0327:
                r1 = 0
            L_0x0328:
                if (r1 >= r2) goto L_0x04f3
                r7 = 1
                if (r2 != r7) goto L_0x033a
                android.widget.LinearLayout r7 = r0.f218088y
                int[] r8 = f218020s0
                r8 = r8[r1]
                android.view.View r7 = r7.findViewById(r8)
                com.tencent.mm.ui.MMImageView r7 = (com.tencent.p014mm.p136ui.MMImageView) r7
                goto L_0x0348
            L_0x033a:
                android.widget.LinearLayout r7 = r0.f218088y
                int[] r8 = f218020s0
                int r13 = r1 + 1
                r8 = r8[r13]
                android.view.View r7 = r7.findViewById(r8)
                com.tencent.mm.ui.MMImageView r7 = (com.tencent.p014mm.p136ui.MMImageView) r7
            L_0x0348:
                r8 = 0
                r7.setVisibility(r8)
                te3.rc0 r8 = new te3.rc0
                r8.<init>()
                r13 = r11[r1]
                r8.mo141257m(r13)
                r13 = 1
                java.lang.String r8 = qg2.C101147j0.m132611D(r8, r9, r13)
                android.content.res.Resources r13 = r29.mo91572m()
                r15 = 2131165219(0x7f070023, float:1.7944649E38)
                float r13 = r13.getDimension(r15)
                int r13 = (int) r13
                r15 = r12[r1]
                r16 = r7
                long r6 = (long) r15
                java.lang.StringBuilder r15 = new java.lang.StringBuilder
                r15.<init>()
                r15.append(r5)
                r19 = r9
                r9 = r11[r1]
                r15.append(r9)
                java.lang.String r9 = r15.toString()
                java.lang.String r10 = "downappthumb"
                java.lang.String r6 = com.tencent.p014mm.modelcdntran.C1297x.m1387b(r10, r6, r4, r9)
                oa1.d r7 = oa1.C117731d.m166007c()
                pf3.b r9 = new pf3.b
                r9.<init>()
                int r7 = r7.mo182440a(r9)
                r9 = 2131755376(0x7f100170, float:1.914163E38)
                r15 = 1
                if (r7 != r15) goto L_0x0446
                if (r6 == 0) goto L_0x0440
                wb0.a r7 = new wb0.a
                r7.<init>(r6)
                r6 = r14[r1]
                java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r6, (java.lang.String) r5)
                java.lang.String r15 = "<set-?>"
                gy3.C87412m.m108594g(r6, r15)
                r7.f189599c = r6
                r6 = r18[r1]
                java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r6, (java.lang.String) r5)
                gy3.C87412m.m108594g(r6, r15)
                r7.f189598b = r6
                java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r4, (java.lang.String) r5)
                gy3.C87412m.m108594g(r6, r15)
                r7.f189604h = r6
                r6 = r17[r1]
                java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r6, (java.lang.String) r5)
                gy3.C87412m.m108594g(r6, r15)
                r7.f189602f = r6
                r6 = r12[r1]
                r21 = r11
                long r10 = (long) r6
                r7.f189603g = r10
                r6 = 1
                r7.f189600d = r6
                java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r8, (java.lang.String) r5)
                gy3.C87412m.m108594g(r8, r15)
                r7.f189601e = r8
                n20.g r8 = new n20.g
                r8.<init>(r13, r13)
                if (r2 != r6) goto L_0x03e8
                r8.f175195d = r9
                goto L_0x03ed
            L_0x03e8:
                r6 = 2131755375(0x7f10016f, float:1.9141628E38)
                r8.f175195d = r6
            L_0x03ed:
                rx3.g r6 = com.tencent.p014mm.p136ui.chatting.viewitems.C57778k2.f165348a
                java.lang.Class<qo.j> r6 = p663qo.C63286j.class
                di3.d r6 = di3.C86312j.m106911c(r6)
                qo.j r6 = (p663qo.C63286j) r6
                java.lang.String r6 = r6.s10(r8, r7)
                java.lang.Class<n20.s> r9 = n20.C61611s.class
                di3.d r9 = di3.C86312j.m106911c(r9)
                n20.s r9 = (n20.C61611s) r9
                java.lang.String r10 = r7.f189601e
                r11 = r16
                com.tencent.mm.sdk.pipeline.PipelineState r6 = r9.mo84733ng(r6, r8, r11, r10)
                java.lang.String r8 = "KeyCdnParams"
                r6.put(r8, r7)
                r8 = 24
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                java.lang.String r9 = "KeyAppMsgSubType"
                r6.put(r9, r8)
                java.lang.String r7 = r7.f189602f
                java.lang.String r8 = "KeyFileMd5"
                r6.put(r8, r7)
                rx3.g r7 = com.tencent.p014mm.p136ui.chatting.viewitems.C57778k2.f165348a
                rx3.n r7 = (rx3.C36570n) r7
                java.lang.Object r7 = r7.getValue()
                n20.f r7 = (n20.C61604f) r7
                r7.mo86542a(r6)
                r22 = r2
                r26 = r3
                r24 = r5
                r23 = r12
                r25 = r14
                r3 = 2131299384(0x7f090c38, float:1.8216768E38)
                r27 = 1
                goto L_0x04db
            L_0x0440:
                r21 = r11
                r11 = r16
                r15 = 1
                goto L_0x044a
            L_0x0446:
                r21 = r11
                r11 = r16
            L_0x044a:
                if (r2 != r15) goto L_0x0453
                r11.setImageResource(r9)
                r7 = 2131755375(0x7f10016f, float:1.9141628E38)
                goto L_0x0459
            L_0x0453:
                r7 = 2131755375(0x7f10016f, float:1.9141628E38)
                r11.setImageResource(r7)
            L_0x0459:
                hc0.c$b r9 = new hc0.c$b
                r9.<init>()
                r9.f59353i = r15
                r9.f59366v = r15
                r9.f59361q = r7
                r9.f59354j = r13
                r9.f59355k = r13
                r9.f59344B = r6
                hc0.c r6 = r9.mo32666a()
                gc0.a r7 = gc0.C20828a.m22825b()
                r9 = r18[r1]
                android.graphics.Bitmap r7 = r7.mo32516e(r9)
                if (r7 == 0) goto L_0x048d
                r11.setImageBitmap(r7)
            L_0x047d:
                r22 = r2
                r26 = r3
                r24 = r5
                r23 = r12
                r25 = r14
                r3 = 2131299384(0x7f090c38, float:1.8216768E38)
                r27 = 1
                goto L_0x04d4
            L_0x048d:
                boolean r7 = com.tencent.p014mm.vfs.C86013q1.m106450k(r8)
                if (r7 == 0) goto L_0x049b
                gc0.a r7 = gc0.C20828a.m22825b()
                r7.mo32519h(r8, r11, r6)
                goto L_0x047d
            L_0x049b:
                r6 = r18[r1]
                boolean r6 = android.text.TextUtils.isEmpty(r6)
                if (r6 != 0) goto L_0x047d
                java.lang.Class<ob0.l> r6 = ob0.C35135l.class
                r7 = 49
                java.lang.Integer r13 = java.lang.Integer.valueOf(r7)
                com.tencent.mm.ui.chatting.viewitems.b0 r11 = new com.tencent.mm.ui.chatting.viewitems.b0
                r7 = r11
                r16 = r8
                r8 = r29
                r9 = r21
                r10 = r1
                r22 = r2
                r2 = r11
                r11 = r14
                r23 = r12
                r12 = r18
                r24 = r5
                r5 = r13
                r13 = r17
                r25 = r14
                r14 = r23
                r26 = r3
                r3 = 2131299384(0x7f090c38, float:1.8216768E38)
                r27 = 1
                r15 = r4
                r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)
                p261wl.C38166b.m41756c(r6, r5, r2)
            L_0x04d4:
                java.lang.String r2 = "MicroMsg.AppMsgViewHolder"
                java.lang.String r5 = "note get thumb"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r5)
            L_0x04db:
                int r1 = r1 + 1
                r9 = r19
                r11 = r21
                r2 = r22
                r12 = r23
                r5 = r24
                r14 = r25
                r3 = r26
                r6 = 2131299390(0x7f090c3e, float:1.821678E38)
                r15 = 2131299384(0x7f090c38, float:1.8216768E38)
                goto L_0x0328
            L_0x04f3:
                r26 = r3
                r3 = 2131299384(0x7f090c38, float:1.8216768E38)
                android.widget.LinearLayout r1 = r0.f218088y
                r2 = 2131299390(0x7f090c3e, float:1.821678E38)
                android.view.View r1 = r1.findViewById(r2)
                android.widget.ImageView r1 = (android.widget.ImageView) r1
                android.widget.LinearLayout r0 = r0.f218088y
                android.view.View r0 = r0.findViewById(r3)
                android.widget.TextView r0 = (android.widget.TextView) r0
                if (r0 == 0) goto L_0x0522
                android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                android.content.res.Resources r2 = r2.getResources()
                r3 = 2131165644(0x7f0701cc, float:1.794551E38)
                int r2 = r2.getDimensionPixelSize(r3)
                float r2 = (float) r2
                r3 = 0
                r0.setTextSize(r3, r2)
                goto L_0x0523
            L_0x0522:
                r3 = 0
            L_0x0523:
                r5 = r26
                r2 = 4
                if (r5 <= r2) goto L_0x055a
                if (r1 == 0) goto L_0x052d
                r1.setVisibility(r3)
            L_0x052d:
                if (r0 == 0) goto L_0x055a
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "("
                r1.append(r2)
                r1.append(r5)
                java.lang.String r2 = ")"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.setText(r1)
                r1 = 0
                r0.setVisibility(r1)
                goto L_0x055a
            L_0x054d:
                r1 = 0
                android.view.ViewStub r2 = r0.f218089z
                r3 = 8
                r2.setVisibility(r3)
                android.widget.ImageView r0 = r0.f218021A
                r0.setVisibility(r1)
            L_0x055a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.C74255e.m88524g(ck3.b, com.tencent.mm.ui.chatting.viewitems.u$e, com.tencent.mm.message.l$b, com.tencent.mm.storage.f4, boolean):void");
        }

        /* renamed from: h */
        public static void m88525h(C67391b bVar, C74255e eVar, C68070l.C68072b bVar2, boolean z) {
            String str;
            C74255e eVar2 = eVar;
            C68070l.C68072b bVar3 = bVar2;
            Class cls = C76979h.class;
            eVar2.f218050c.setVisibility(8);
            String str2 = bVar3.f195570f;
            String str3 = null;
            if (str2 == null || str2.trim().length() <= 0) {
                eVar2.f218064j.setVisibility(8);
                str = null;
            } else {
                str = bVar3.f195570f;
                eVar2.f218064j.setVisibility(0);
                eVar2.f218064j.setMaxLines(2);
            }
            eVar2.f218052d.setMaxLines(4);
            eVar2.f218076p.setVisibility(8);
            eVar2.f218066k.setVisibility(4);
            if (z) {
                eVar2.f218048b.setVisibility(8);
            }
            RecordOperationEvent recordOperationEvent = new RecordOperationEvent();
            RecordOperationEvent.C92551a aVar = recordOperationEvent.f265027d;
            aVar.f265029a = 0;
            aVar.f265030b = bVar3.f195571f0;
            recordOperationEvent.publish();
            C77915dp3 dp32 = recordOperationEvent.f265028e.f265048a;
            if (dp32 != null) {
                eVar2.f218064j.setText(((C76979h) C86312j.m106911c(cls)).yp0(eVar2.f218064j.getContext(), Util.nullAs(dp32.f227153d, bVar3.f195570f), eVar2.f218064j.getTextSize()));
                String str4 = dp32.f227154e;
                if (str4 == null) {
                    Log.m105921e("MicroMsg.AppMsgViewHolder", "recordMsg desc is null !! recordInfo = [%s]", bVar3.f195571f0);
                } else {
                    str4 = str4.replaceAll("&lt;", "<").replaceAll("&gt;", ">");
                }
                if (str4 != null && str4.length() > 100) {
                    boolean z2 = C96965r.f284067d;
                    str4 = str4.substring(0, C96965r.C44649c.f121057a.mo135555g(str4, 0, 100));
                }
                eVar2.f218052d.setText(((C76979h) C86312j.m106911c(cls)).yp0(eVar2.f218052d.getContext(), Util.nullAs(str4, bVar3.f195574g), eVar2.f218052d.getTextSize()));
                Iterator<C101834rc0> it = dp32.f227155f.iterator();
                String str5 = null;
                boolean z3 = false;
                while (it.hasNext()) {
                    C101834rc0 next = it.next();
                    if (!C93594f1.m118177e(next) || Util.isNullOrNil(next.f299308i1) || !next.f299308i1.equals("WeNoteHtmlFile")) {
                        C101846tc0 tc02 = next.f299296c1.f299405d;
                        if (tc02.f299525o != null) {
                            if (Util.isNullOrNil(str)) {
                                str = bVar.mo91565f().getString(C0966R.string.htm);
                            }
                            z3 = true;
                        } else if (tc02.f299519f != null) {
                            if (str3 == null) {
                                str3 = next.f299298d1;
                            } else {
                                String str6 = next.f299298d1;
                                if (str3 != str6) {
                                    str5 = str6;
                                }
                            }
                        }
                        int i = next.f299258I;
                        if (i == 10 || i == 11 || i == 14) {
                            if (z) {
                                eVar2.f218048b.setVisibility(0);
                                eVar2.f218048b.setImageResource(C0966R.raw.app_attach_file_icon_unknow);
                            }
                        } else if (i != 16) {
                            if (i != 22) {
                                if (i != 29) {
                                    switch (i) {
                                        case 2:
                                            if (!z) {
                                                break;
                                            } else {
                                                eVar2.f218048b.setVisibility(0);
                                                eVar2.f218048b.setImageResource(C0966R.C0969drawable.btu);
                                                break;
                                            }
                                        case 3:
                                            if (!z) {
                                                break;
                                            } else {
                                                eVar2.f218048b.setVisibility(0);
                                                eVar2.f218048b.setImageResource(C0966R.raw.app_attach_file_icon_voice);
                                                break;
                                            }
                                        case 4:
                                            if (z) {
                                                eVar2.f218048b.setVisibility(0);
                                                eVar2.f218048b.setImageResource(C0966R.raw.app_attach_file_icon_video);
                                            }
                                            eVar2.f218076p.setVisibility(0);
                                            eVar2.f218076p.setImageResource(C0966R.C0969drawable.azb);
                                            break;
                                        case 5:
                                            if (!z) {
                                                break;
                                            } else {
                                                eVar2.f218048b.setVisibility(0);
                                                eVar2.f218048b.setImageResource(C0966R.raw.app_attach_file_icon_webpage);
                                                break;
                                            }
                                        case 6:
                                            eVar2.f218048b.setVisibility(0);
                                            eVar2.f218048b.setImageResource(C0966R.raw.app_attach_file_icon_location);
                                            break;
                                        case 7:
                                            if (z) {
                                                eVar2.f218048b.setVisibility(0);
                                                eVar2.f218048b.setImageResource(C0966R.raw.app_attach_file_icon_music);
                                            }
                                            eVar2.f218076p.setVisibility(0);
                                            eVar2.f218076p.setImageResource(C0966R.C0969drawable.ajs);
                                            break;
                                        case 8:
                                            if (!z) {
                                                break;
                                            } else {
                                                eVar2.f218048b.setVisibility(0);
                                                eVar2.f218048b.setImageResource(C102430l.m135146a(next.f299262K));
                                                break;
                                            }
                                    }
                                } else {
                                    if (z) {
                                        eVar2.f218048b.setVisibility(0);
                                        eVar2.f218048b.setImageResource(C0966R.raw.app_attach_file_icon_music);
                                    }
                                    eVar2.f218076p.setVisibility(0);
                                    eVar2.f218076p.setImageResource(C0966R.C0969drawable.ajs);
                                }
                            } else if (z && !C100734q.m131837a0()) {
                                eVar2.f218048b.setVisibility(0);
                                eVar2.f218048b.setImageResource(C0966R.raw.icons_outlined_finder_icon);
                            }
                        } else if (z) {
                            eVar2.f218048b.setVisibility(0);
                            eVar2.f218048b.setImageResource(C0966R.C0969drawable.bfa);
                        }
                    }
                }
                if (str3 != null && str5 == null && !z3) {
                    str = bVar.mo91565f().getString(C0966R.string.cq9, new Object[]{str3});
                } else if (str3 != null && str5 != null && !str3.equals(str5) && !z3) {
                    str = bVar.mo91565f().getString(C0966R.string.cq8, new Object[]{str3, str5});
                }
            }
            if (!Util.isNullOrNil(str)) {
                eVar2.f218064j.setText(str);
                eVar2.f218064j.setVisibility(0);
            }
            eVar2.f218048b.setVisibility(8);
            eVar2.f218085v.setVisibility(8);
        }

        /* renamed from: i */
        public static void m88526i(C74255e eVar, Boolean bool, C72963f4 f4Var, String str, String str2) {
            long msgId = f4Var.getMsgId();
            C72683d Yt = C72709y1.vx0().mo100150Yt(msgId);
            if (Yt == null) {
                Log.m105929w("MicroMsg.AppMsgViewHolder", "attach info is null, msgId: %s, attachName: %s", Long.valueOf(msgId), str2);
                return;
            }
            if (bool.booleanValue()) {
                long j = Yt.field_status;
                if (j == 101) {
                    eVar.f218074o.setVisibility(0);
                    eVar.f218068l.setVisibility(0);
                    eVar.f218070m.setVisibility(0);
                } else if (j == 102) {
                    eVar.f218074o.setVisibility(8);
                    eVar.f218068l.setVisibility(8);
                    eVar.f218070m.setVisibility(8);
                } else {
                    eVar.f218074o.setVisibility(8);
                    eVar.f218068l.setVisibility(8);
                    eVar.f218070m.setVisibility(8);
                }
            } else {
                long j2 = Yt.field_status;
                if (j2 == 101) {
                    eVar.f218074o.setVisibility(0);
                    eVar.f218072n.setVisibility(8);
                } else if (j2 == 105) {
                    eVar.f218074o.setVisibility(8);
                    eVar.f218072n.setVisibility(0);
                } else {
                    eVar.f218074o.setVisibility(8);
                    eVar.f218072n.setVisibility(8);
                }
            }
            if (f4Var.getStatus() == 5) {
                eVar.f218074o.setVisibility(8);
                eVar.f218072n.setVisibility(8);
            }
            Boolean bool2 = bool;
            long j3 = msgId;
            eVar.f218074o.setOnClickListener(new C74256a(bool2, j3, f4Var, str2));
            eVar.f218072n.setOnClickListener(new C74257b(bool2, j3, str2, f4Var));
        }

        /* renamed from: j */
        public static void m88527j(C74255e eVar, String str, int i) {
            int m = C72695v.m85071m(str);
            if (m == -1 || m >= 100 || i <= 0) {
                eVar.f218068l.setVisibility(8);
                eVar.f218070m.setVisibility(8);
                return;
            }
            eVar.f218068l.setVisibility(0);
            eVar.f218070m.setVisibility(0);
            eVar.f218068l.setProgress(m);
        }

        /* renamed from: d */
        public C74255e mo103258d(View view, boolean z) {
            super.create(view);
            LinearLayout linearLayout = (LinearLayout) view.findViewById(C0966R.C0970id.b2p);
            this.f218048b = (MMImageView) view.findViewById(C0966R.C0970id.b3j);
            this.f218050c = (MMNeat7extView) view.findViewById(C0966R.C0970id.b3l);
            this.f218064j = (TextView) view.findViewById(C0966R.C0970id.b3o);
            this.f218052d = (TextView) view.findViewById(C0966R.C0970id.b2z);
            this.f218054e = (TextView) view.findViewById(C0966R.C0970id.b3g);
            this.f218056f = (ImageView) view.findViewById(C0966R.C0970id.b3d);
            this.f218060h = (TextView) view.findViewById(C0966R.C0970id.b3f);
            this.f218058g = (ImageView) view.findViewById(C0966R.C0970id.b3e);
            this.f218062i = (LinearLayout) view.findViewById(C0966R.C0970id.b3c);
            this.f218066k = (ImageView) view.findViewById(C0966R.C0970id.b3h);
            this.f218068l = (MMPinProgressBtn) view.findViewById(C0966R.C0970id.b4r);
            this.f218070m = (ImageView) this.convertView.findViewById(C0966R.C0970id.b4q);
            this.f218072n = (ImageView) this.convertView.findViewById(C0966R.C0970id.b4g);
            this.f218074o = (ImageView) this.convertView.findViewById(C0966R.C0970id.b8y);
            this.f218076p = (ImageView) view.findViewById(C0966R.C0970id.f357661b31);
            this.f218078q = (TextView) view.findViewById(C0966R.C0970id.b2v);
            this.f218080r = (ImageView) view.findViewById(C0966R.C0970id.b3b);
            this.checkBox = (CheckBox) view.findViewById(C0966R.C0970id.b46);
            this.maskView = view.findViewById(C0966R.C0970id.b7h);
            this.userTV = (TextView) view.findViewById(C0966R.C0970id.b9_);
            ChattingItemFooter chattingItemFooter = (ChattingItemFooter) view.findViewById(C0966R.C0970id.ecx);
            this.f218082s = (LinearLayout) view.findViewById(C0966R.C0970id.f6053w0);
            this.f218083t = (ViewGroup) view.findViewById(C0966R.C0970id.g4s);
            TextView textView = (TextView) view.findViewById(C0966R.C0970id.g4p);
            this.f218084u = (LinearLayout) view.findViewById(C0966R.C0970id.b3p);
            this.f218086w = (FrameLayout) view.findViewById(C0966R.C0970id.b47);
            this.f218087x = (LinearLayout) view.findViewById(C0966R.C0970id.b2w);
            ImageView imageView = (ImageView) view.findViewById(C0966R.C0970id.b4e);
            this.f218085v = (RelativeLayout) view.findViewById(C0966R.C0970id.b3i);
            this.f218089z = (ViewStub) view.findViewById(C0966R.C0970id.hiq);
            this.f218021A = (ImageView) view.findViewById(C0966R.C0970id.b4j);
            if (!z) {
                this.f218022B = (ImageView) this.convertView.findViewById(C0966R.C0970id.b8x);
                this.uploadingPB = (ProgressBar) this.convertView.findViewById(C0966R.C0970id.f359466l14);
            }
            this.f218029I = (LinearLayout) view.findViewById(C0966R.C0970id.b2d);
            this.f218026F = (ImageView) view.findViewById(C0966R.C0970id.b2q);
            this.f218027G = (TextView) view.findViewById(C0966R.C0970id.b2s);
            this.f218033M = (TextView) view.findViewById(C0966R.C0970id.b2o);
            this.f218032L = (ImageView) view.findViewById(C0966R.C0970id.cku);
            this.f218030J = (ImageView) view.findViewById(C0966R.C0970id.b2e);
            this.f218031K = (ImageView) view.findViewById(C0966R.C0970id.b2b);
            this.f218023C = (LinearLayout) view.findViewById(C0966R.C0970id.b2c);
            this.f218024D = (ImageView) view.findViewById(C0966R.C0970id.b1o);
            this.f218025E = (TextView) view.findViewById(C0966R.C0970id.b1p);
            this.f218028H = (TextView) view.findViewById(C0966R.C0970id.b2r);
            this.f218034N = (ImageView) view.findViewById(C0966R.C0970id.b1q);
            this.f218035O = (ImageView) view.findViewById(C0966R.C0970id.b1s);
            this.f218036P = (ImageView) view.findViewById(C0966R.C0970id.iiw);
            this.f218037Q = (ImageView) view.findViewById(C0966R.C0970id.iiv);
            this.f218038R = (LinearLayout) view.findViewById(C0966R.C0970id.b2h);
            this.f218039S = (TextView) view.findViewById(C0966R.C0970id.b2n);
            this.f218040T = (TextView) view.findViewById(C0966R.C0970id.b2j);
            this.f218041U = (ImageView) view.findViewById(C0966R.C0970id.b2k);
            this.f218042V = (ImageView) view.findViewById(C0966R.C0970id.b2i);
            this.f218043W = (ImageView) view.findViewById(C0966R.C0970id.b2l);
            this.f218044X = (TextView) view.findViewById(C0966R.C0970id.b2m);
            this.f218045Y = (ImageView) view.findViewById(C0966R.C0970id.b2g);
            this.f218046Z = (LinearLayout) view.findViewById(C0966R.C0970id.f357663b33);
            this.f218053d0 = (ImageView) view.findViewById(C0966R.C0970id.b37);
            this.f218047a0 = (MMNeat7extView) view.findViewById(C0966R.C0970id.b38);
            this.f218049b0 = (ImageView) view.findViewById(C0966R.C0970id.b36);
            this.f218061h0 = (LinearLayout) view.findViewById(C0966R.C0970id.h0g);
            this.f218063i0 = (LinearLayout) view.findViewById(C0966R.C0970id.h0i);
            this.f218071m0 = (ImageView) view.findViewById(C0966R.C0970id.h0h);
            this.f218073n0 = (RelativeLayout) view.findViewById(C0966R.C0970id.f357664b34);
            this.f218065j0 = (ImageView) this.f218061h0.findViewById(C0966R.C0970id.f357660b30);
            this.f218067k0 = (TextView) this.f218061h0.findViewById(C0966R.C0970id.f357662b32);
            this.f218069l0 = (TextView) this.f218061h0.findViewById(C0966R.C0970id.b3a);
            this.f218051c0 = (ImageView) this.f218063i0.findViewById(C0966R.C0970id.f357660b30);
            this.f218055e0 = (TextView) this.f218063i0.findViewById(C0966R.C0970id.f357662b32);
            this.f218059g0 = (TextView) this.f218063i0.findViewById(C0966R.C0970id.b3a);
            this.f218057f0 = (TextView) view.findViewById(C0966R.C0970id.b35);
            this.f218075o0 = (LinearLayout) view.findViewById(C0966R.C0970id.b3m);
            this.f218077p0 = (TextView) view.findViewById(C0966R.C0970id.b3n);
            TextView textView2 = this.f218064j;
            if (textView2 != null) {
                this.f218081r0 = textView2.getMaxLines();
            }
            this.f218079q0 = C74023i.m87885l(MMApplicationContext.getContext());
            boolean z2 = false;
            if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_group_todo_disable, 0) == 1) {
                z2 = true;
            }
            if (z2) {
                this.f218075o0.setVisibility(8);
            }
            return this;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.u$f */
    public static class C74260f extends C74023i {

        /* renamed from: v */
        public C67391b f218101v;

        /* renamed from: w */
        public C73724j2 f218102w;

        /* renamed from: x */
        public C73756m2 f218103x;

        /* renamed from: y */
        public C73736k2 f218104y;

        /* renamed from: z */
        public C73763n2 f218105z;

        /* JADX WARNING: Removed duplicated region for block: B:61:0x01e1 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x01e2 A[RETURN] */
        /* renamed from: s0 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static boolean m88530s0(com.tencent.p014mm.message.C68070l.C68072b r17, ck3.C67391b r18, com.tencent.p014mm.p136ui.chatting.viewitems.C74023i r19, com.tencent.p014mm.storage.C72963f4 r20) {
            /*
                r4 = r17
                r0 = r18
                java.lang.Class<zj3.e> r1 = zj3.C79348e.class
                r2 = 6
                java.lang.Object[] r3 = new java.lang.Object[r2]
                java.lang.String r5 = r4.f195573f2
                r6 = 0
                r3[r6] = r5
                java.lang.String r5 = r4.f195569e2
                r7 = 1
                r3[r7] = r5
                java.lang.String r5 = r4.f195577g2
                r8 = 2
                r3[r8] = r5
                java.lang.String r5 = r4.f195586j
                r9 = 3
                r3[r9] = r5
                int r5 = r4.f195653z2
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r10 = 4
                r3[r10] = r5
                java.lang.String r5 = r4.f195585i2
                r10 = 5
                r3[r10] = r5
                java.lang.String r5 = "MicroMsg.ChattingItemAppMsgFrom"
                java.lang.String r10 = "username: %s , path: %s ,appid %s ,url : %s, pkgType : %s, md5 : %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r10, r3)
                int r3 = r4.f195582i
                r5 = 44
                if (r5 != r3) goto L_0x004e
                boolean r3 = r4.mo93554q(r6)
                if (r3 == 0) goto L_0x004d
                android.app.Activity r3 = r18.mo91565f()
                java.lang.String r3 = r4.mo93549l(r3, r6)
                boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
                if (r3 == 0) goto L_0x004e
            L_0x004d:
                return r6
            L_0x004e:
                java.lang.String r3 = r18.mo91577r()
                r5 = r19
                r10 = r20
                java.lang.String r11 = r5.mo103068y(r0, r10)
                android.os.Bundle r12 = new android.os.Bundle
                r12.<init>()
                com.tencent.mm.ui.chatting.BaseChattingUIFragment r13 = r0.f193286j
                boolean r13 = r13 instanceof com.tencent.p014mm.p136ui.chatting.AppBrandServiceChattingUI.AppBrandServiceChattingFmUI
                java.lang.String r14 = "stat_scene"
                if (r13 == 0) goto L_0x006e
                r13 = 10
                r12.putInt(r14, r13)
                goto L_0x0084
            L_0x006e:
                boolean r13 = r18.mo91583x()
                if (r13 == 0) goto L_0x0078
                r12.putInt(r14, r8)
                goto L_0x0084
            L_0x0078:
                boolean r13 = eb0.C45628s0.m50738C(r3)
                if (r13 == 0) goto L_0x0080
                r13 = 7
                goto L_0x0081
            L_0x0080:
                r13 = 1
            L_0x0081:
                r12.putInt(r14, r13)
            L_0x0084:
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                java.lang.String r14 = "msg_"
                r13.append(r14)
                long r14 = r20.mo108774y2()
                java.lang.String r14 = java.lang.Long.toString(r14)
                r13.append(r14)
                java.lang.String r13 = r13.toString()
                java.lang.String r14 = "stat_msg_id"
                r12.putString(r14, r13)
                java.lang.String r13 = "stat_chat_talker_username"
                r12.putString(r13, r3)
                java.lang.String r13 = "stat_send_msg_user"
                r12.putString(r13, r11)
                java.lang.String r13 = r18.mo91577r()
                int r13 = kb0.C76528a.m92004a(r13)
                com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.m88494e(r17, r18, r19, r20)
                int r5 = r4.f195581h2
                java.lang.String r14 = "chat_type"
                java.lang.String r15 = "chatroom_username"
                java.lang.String r16 = ""
                if (r5 == 0) goto L_0x0151
                if (r5 == r7) goto L_0x00e6
                if (r5 == r8) goto L_0x0151
                if (r5 == r9) goto L_0x00cd
                r0 = 1
                goto L_0x01dc
            L_0x00cd:
                boolean r1 = r18.mo91583x()
                if (r1 == 0) goto L_0x00d5
                r1 = r3
                goto L_0x00d7
            L_0x00d5:
                r1 = r16
            L_0x00d7:
                r12.putString(r15, r1)
                r12.putInt(r14, r13)
                boolean r0 = r18.mo91583x()
                kb0.C88132b.m109737g(r3, r11, r0, r4, r12)
                goto L_0x01db
            L_0x00e6:
                android.content.Intent r1 = new android.content.Intent
                r1.<init>()
                java.lang.String r5 = r4.f195573f2
                java.lang.String r9 = "key_username"
                r1.putExtra(r9, r5)
                boolean r5 = r18.mo91583x()
                java.lang.String r9 = "key_scene_note"
                java.lang.String r13 = "key_from_scene"
                if (r5 == 0) goto L_0x0117
                r1.putExtra(r13, r7)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r5.append(r3)
                java.lang.String r3 = ":"
                r5.append(r3)
                r5.append(r11)
                java.lang.String r3 = r5.toString()
                r1.putExtra(r9, r3)
                goto L_0x011d
            L_0x0117:
                r1.putExtra(r13, r8)
                r1.putExtra(r9, r3)
            L_0x011d:
                com.tencent.mm.plugin.appbrand.config.WxaExposedParams$b r3 = new com.tencent.mm.plugin.appbrand.config.WxaExposedParams$b
                r3.<init>()
                java.lang.String r5 = r4.f195577g2
                r3.f239557a = r5
                r3.f239566j = r2
                int r2 = r4.f195653z2
                r3.f239564h = r2
                r3.f239563g = r6
                com.tencent.mm.plugin.appbrand.config.WxaExposedParams r2 = r3.mo113977a()
                java.lang.String r3 = "key_scene_exposed_params"
                r1.putExtra(r3, r2)
                r2 = 1237(0x4d5, float:1.733E-42)
                java.lang.String r3 = "key_wxapp_scene"
                r1.putExtra(r3, r2)
                java.lang.String r2 = "_stat_obj"
                r1.putExtra(r2, r12)
                android.app.Activity r0 = r18.mo91565f()
                r2 = 0
                java.lang.String r3 = "appbrand"
                java.lang.String r4 = ".ui.AppBrandProfileUI"
                ke3.C88144b.m109791i(r0, r3, r4, r1, r2)
                goto L_0x01db
            L_0x0151:
                com.tencent.mm.ui.chatting.BaseChattingUIFragment r2 = r0.f193286j
                boolean r2 = r2 instanceof com.tencent.p014mm.p136ui.chatting.AppBrandServiceChattingUI.AppBrandServiceChattingFmUI
                if (r2 == 0) goto L_0x0165
                r2 = 1073(0x431, float:1.504E-42)
                r5 = 0
                r0 = r3
                r1 = r11
                r3 = r5
                r4 = r17
                r5 = r12
                kb0.C88132b.m109734e(r0, r1, r2, r3, r4, r5)
                goto L_0x01db
            L_0x0165:
                boolean r2 = rb0.C47987l.m53344l2(r20)
                if (r2 == 0) goto L_0x0199
                rb0.n r2 = rb0.C48009v0.Hx0()
                rb0.l r2 = r2.mo72784qq(r3)
                com.tencent.mm.ui.chatting.manager.a r0 = r0.f193278b
                xi.d r0 = r0.mo102812a(r1)
                zj3.e r0 = (zj3.C79348e) r0
                if (r0 == 0) goto L_0x018b
                ug.c r1 = r0.getBizInfo()
                if (r1 == 0) goto L_0x018b
                ug.c r0 = r0.getBizInfo()
                java.lang.String r0 = r0.field_appId
                r16 = r0
            L_0x018b:
                java.lang.String r1 = r2.field_nickname
                r2 = 1157(0x485, float:1.621E-42)
                r0 = r3
                r3 = r16
                r4 = r17
                r5 = r12
                kb0.C88132b.m109734e(r0, r1, r2, r3, r4, r5)
                goto L_0x01db
            L_0x0199:
                boolean r2 = eb0.C45628s0.m50738C(r3)
                if (r2 == 0) goto L_0x01c4
                com.tencent.mm.ui.chatting.manager.a r0 = r0.f193278b
                xi.d r0 = r0.mo102812a(r1)
                zj3.e r0 = (zj3.C79348e) r0
                if (r0 == 0) goto L_0x01b7
                ug.c r1 = r0.getBizInfo()
                if (r1 == 0) goto L_0x01b7
                ug.c r0 = r0.getBizInfo()
                java.lang.String r0 = r0.field_appId
                r16 = r0
            L_0x01b7:
                r2 = 1074(0x432, float:1.505E-42)
                r0 = r3
                r1 = r11
                r3 = r16
                r4 = r17
                r5 = r12
                kb0.C88132b.m109734e(r0, r1, r2, r3, r4, r5)
                goto L_0x01db
            L_0x01c4:
                boolean r1 = r18.mo91583x()
                if (r1 == 0) goto L_0x01cc
                r1 = r3
                goto L_0x01ce
            L_0x01cc:
                r1 = r16
            L_0x01ce:
                r12.putString(r15, r1)
                r12.putInt(r14, r13)
                boolean r0 = r18.mo91583x()
                kb0.C88132b.m109736f(r3, r11, r0, r4, r12)
            L_0x01db:
                r0 = 0
            L_0x01dc:
                com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.m88495f(r20)
                if (r0 != 0) goto L_0x01e2
                return r7
            L_0x01e2:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.C74260f.m88530s0(com.tencent.mm.message.l$b, ck3.b, com.tencent.mm.ui.chatting.viewitems.i, com.tencent.mm.storage.f4):boolean");
        }

        /* renamed from: t0 */
        public static boolean m88531t0(C68070l.C68072b bVar, C67391b bVar2, C74023i iVar, C72963f4 f4Var) {
            C68070l.C68072b bVar3 = bVar;
            C80995a aVar = (C80995a) bVar.mo93555w(C80995a.class);
            if (aVar == null || Util.isNullOrNil(aVar.f237888E) || Util.isNullOrNil(aVar.f237890G)) {
                Log.m105928w("MicroMsg.ChattingItemAppMsgFrom", "hy: no remote url provided. treat as default");
                return false;
            }
            String str = aVar.f237888E;
            String str2 = aVar.f237886C;
            String str3 = Util.isNullOrNil(aVar.f237891H) ? bVar3.f195574g : aVar.f237891H;
            String str4 = aVar.f237889F;
            String str5 = bVar3.f195577g2;
            String str6 = aVar.f237890G;
            Log.m105925i("MicroMsg.ChattingItemAppMsgFrom", "hy: request start videoUrl: %s, localPath: %s, videoDesc: %s, videoButtonText: %s, appid: %s, videoThumbUrl: %s", str, str2, str3, str4, str5, str6);
            C115669n nVar = C115669n.INSTANCE;
            Object[] objArr = new Object[4];
            objArr[0] = Integer.valueOf(C72996z1.m85820U5(bVar2.mo91577r()) ? 2 : 1);
            objArr[1] = str5;
            objArr[2] = 1;
            objArr[3] = 1;
            nVar.mo160131h(17608, objArr);
            if (!Util.isNullOrNil(str)) {
                Bundle bundle = new Bundle();
                bundle.putString("key_chatting_wording", str3);
                bundle.putString("key_chatting_text", str4);
                bundle.putString("key_chatting_appid", str5);
                bundle.putLong("key_msg_id", f4Var.getMsgId());
                bundle.putString("key_talker_username", bVar2.mo91577r());
                bundle.putString("key_sender_username", iVar.mo103068y(bVar2, f4Var));
                C74244u.m88493d(bVar2, str, str2, str6, true, bundle);
            } else {
                Log.m105928w("MicroMsg.ChattingItemAppMsgFrom", "hy: video msg invalid!!");
            }
            return true;
        }

        /* renamed from: u0 */
        public static boolean m88532u0(View view, C67391b bVar, C72963f4 f4Var, int i, boolean z, String str, String str2, C74023i iVar) {
            if (i != 19) {
                return false;
            }
            Intent intent = new Intent();
            intent.putExtra("message_id", f4Var.getMsgId());
            intent.putExtra("Retr_Security_Msg_Id", f4Var.getMsgId());
            intent.putExtra("big_appmsg", z);
            int b = C45629t0.m50815b(str2, bVar.mo91577r());
            intent.putExtra("prePublishId", "msg_" + Long.toString(f4Var.mo108774y2()));
            intent.putExtra("preUsername", str2);
            intent.putExtra("preChatName", bVar.mo91577r());
            intent.putExtra("preChatTYPE", b);
            intent.putExtra("msgUsername", str);
            intent.putExtra("serverMsgID", String.valueOf(f4Var.mo108774y2()));
            intent.putExtra("chatTypeForAppbrand", C76528a.m92004a(bVar.mo91577r()));
            C57796c.m66768a(intent, bVar, f4Var, iVar);
            C68144a.m80545a(f4Var);
            C88144b.m109791i(bVar.mo91565f(), "record", ".ui.RecordMsgDetailUI", intent, (Bundle) null);
            return true;
        }

        /* renamed from: v0 */
        public static boolean m88533v0(C68070l.C68072b bVar, C67391b bVar2, C74023i iVar, C72963f4 f4Var) {
            C68070l.C68072b bVar3 = bVar;
            C74023i iVar2 = iVar;
            Class cls = C79139p.class;
            if (C61104a.m71669y(bVar2.mo91565f()) || C61104a.m71665u(bVar2.mo91565f()) || C61104a.m71649e(bVar2.mo91565f())) {
                Log.m105924i("MicroMsg.ChattingItemAppMsgFrom", "Voip is running, can't do this");
                return true;
            } else if (iVar2.mo103069A(bVar2, bVar3, f4Var)) {
                return true;
            } else {
                String K3 = ((C79139p) C86312j.m106911c(cls)).mo108862K3(bVar3.f195586j, StateEvent.Name.MESSAGE);
                String K32 = ((C79139p) C86312j.m106911c(cls)).mo108862K3(bVar3.f195590k, StateEvent.Name.MESSAGE);
                PackageInfo w = iVar2.mo103101w(bVar2.mo91565f(), bVar3.f195562d);
                iVar.mo103070B(bVar2, K3, K32, w == null ? null : w.versionName, w == null ? 0 : w.versionCode, bVar3.f195562d, true, f4Var.getMsgId(), f4Var.mo108774y2(), f4Var, bVar);
                return true;
            }
        }

        /* renamed from: w0 */
        public static boolean m88534w0(C68070l.C68072b bVar, C67391b bVar2, C74023i iVar, C72963f4 f4Var) {
            C74860u1 u1Var = C74860u1.f220100a;
            Log.m105924i("MicroMsg.VoiceStateHolder", "open appBrand");
            u1Var.mo104088b(false);
            if (!Util.isNullOrNil(bVar.f195577g2) || !Util.isNullOrNil(bVar.f195573f2)) {
                String r = bVar2.mo91577r();
                String y = iVar.mo103068y(bVar2, f4Var);
                Bundle bundle = new Bundle();
                if (bVar2.mo91583x()) {
                    bundle.putInt("stat_scene", 2);
                } else {
                    bundle.putInt("stat_scene", C45628s0.m50738C(r) ? 7 : 1);
                }
                bundle.putString("stat_msg_id", "msg_" + Long.toString(f4Var.mo108774y2()));
                bundle.putString("stat_chat_talker_username", r);
                bundle.putString("stat_send_msg_user", y);
                bundle.putBoolean("stat_kf_guide", C47987l.m53344l2(f4Var));
                bundle.putInt("chat_type", C76528a.m92004a(bVar2.mo91577r()));
                ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106897rj(bVar2.mo91565f(), bVar2.mo91577r(), iVar.mo103068y(bVar2, f4Var), bVar2.mo91583x(), bVar, bundle);
                return true;
            }
            String K3 = ((C79139p) C86312j.m106911c(C79139p.class)).mo108862K3(bVar.f195586j, bVar2.mo91583x() ? "groupmessage" : "singlemessage");
            Intent intent = new Intent();
            intent.putExtra("rawUrl", K3);
            intent.putExtra("webpageTitle", bVar.f195570f);
            intent.putExtra("shortUrl", bVar.f195586j);
            C88144b.m109791i(bVar2.mo91565f(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            return true;
        }

        /* renamed from: x0 */
        public static boolean m88535x0(C68070l.C68072b bVar, View view, C67391b bVar2, C74023i iVar, C72963f4 f4Var) {
            Intent intent;
            C68070l.C68072b bVar3 = bVar;
            C67391b bVar4 = bVar2;
            C74023i iVar2 = iVar;
            C72963f4 f4Var2 = f4Var;
            Class cls = C45696d.class;
            String str = bVar3.f195586j;
            if (str == null || str.equals("")) {
                return false;
            }
            if (!C72996z1.m85807K5(f4Var.mo108768t())) {
                C75539a.m90582b(true, f4Var.mo108774y2(), f4Var.mo108768t());
            }
            if (!Util.isNullOrNil(bVar3.f195475C2)) {
                Intent intent2 = new Intent();
                intent2.putExtra("sns_landig_pages_from_source", 5);
                intent2.putExtra("msg_id", f4Var.getMsgId());
                intent2.putExtra("sns_landing_pages_xml", bVar3.f195475C2);
                intent2.putExtra("sns_landing_pages_share_thumb_url", f4Var.mo108765s2());
                String q = C102260r.m134877q(bVar3.f195488G, f4Var.mo108768t());
                if (!TextUtils.isEmpty(q)) {
                    intent2.putExtra("sns_landing_pages_extra", q);
                }
                Log.m105924i("MicroMsg.SnsAdNativeLandingPagesUI.uxInfo", "open Ad ChattingItemAppMsg handleUrlClickFrom, selfUserName is " + C75592q0.m90789s() + ", extraData is " + q);
                intent2.addFlags(268435456);
                C88144b.m109791i(bVar2.mo91565f(), "sns", ".ui.SnsAdNativeLandingPagesPreviewUI", intent2, (Bundle) null);
                C92859v.m117131i(f4Var);
                return true;
            }
            C90621r0 r0Var = (C90621r0) bVar3.mo93555w(C90621r0.class);
            if (r0Var == null || Util.isNullOrNil(r0Var.f260345b)) {
                String K3 = ((C79139p) C86312j.m106911c(C79139p.class)).mo108862K3(bVar3.f195586j, bVar2.mo91583x() ? "groupmessage" : "singlemessage");
                String str2 = bVar3.f195586j;
                PackageInfo w = iVar2.mo103101w(bVar2.mo91565f(), bVar3.f195562d);
                Intent intent3 = new Intent();
                int intExtra = bVar2.mo91565f().getIntent().getIntExtra("KOpenArticleSceneFromScene", 10000);
                if (((C45696d) C86709a0.m107533q(cls)).mo70989eQ(K3)) {
                    K3 = ((C45696d) C86709a0.m107533q(cls)).mo70959F2(K3, 1, intExtra, (int) (System.currentTimeMillis() / 1000));
                }
                intent3.putExtra("rawUrl", K3);
                intent3.putExtra("webpageTitle", bVar3.f195570f);
                String str3 = bVar3.f195562d;
                if (str3 != null && ("wx751a1acca5688ba3".equals(str3) || "wxfbc915ff7c30e335".equals(bVar3.f195562d) || "wx482a4001c37e2b74".equals(bVar3.f195562d))) {
                    Bundle bundle = new Bundle();
                    bundle.putString("jsapi_args_appid", bVar3.f195562d);
                    intent3.putExtra("jsapiargs", bundle);
                }
                if (!Util.isNullOrNil(str2)) {
                    intent3.putExtra("shortUrl", str2);
                } else {
                    intent3.putExtra("shortUrl", bVar3.f195586j);
                }
                intent3.putExtra("version_name", w == null ? null : w.versionName);
                intent3.putExtra("version_code", w == null ? 0 : w.versionCode);
                if (!Util.isNullOrNil(bVar3.f195634v)) {
                    intent3.putExtra("srcUsername", bVar3.f195634v);
                    intent3.putExtra("srcDisplayname", bVar3.f195638w);
                }
                intent3.putExtra("msg_id", f4Var.getMsgId());
                intent3.putExtra("KPublisherId", "msg_" + Long.toString(f4Var.mo108774y2()));
                intent3.putExtra("KAppId", bVar3.f195562d);
                intent3.putExtra("geta8key_username", bVar2.mo91577r());
                intent3.putExtra("pre_username", iVar2.mo103068y(bVar4, f4Var2));
                intent3.putExtra("from_scence", 2);
                intent3.putExtra("expid_str", f4Var2.f230733Q);
                intent3.putExtra("msgUsername", bVar3.f195488G);
                intent3.putExtra("serverMsgID", String.valueOf(f4Var.mo108774y2()));
                intent3.putExtra("KMsgType", f4Var.getType());
                intent3.putExtra("KAppMsgType", bVar3.f195582i);
                int b = C45629t0.m50815b(iVar2.mo103068y(bVar4, f4Var2), bVar2.mo91577r());
                intent3.putExtra("prePublishId", "msg_" + Long.toString(f4Var.mo108774y2()));
                intent3.putExtra("preUsername", iVar2.mo103068y(bVar4, f4Var2));
                intent3.putExtra("preChatName", bVar2.mo91577r());
                intent3.putExtra("preChatTYPE", b);
                intent3.putExtra("preMsgIndex", 0);
                int i = b != 1 ? b != 2 ? (b == 6 || b == 7) ? 5 : 0 : 2 : 3;
                intent3.putExtra("share_report_pre_msg_url", bVar3.f195586j);
                intent3.putExtra("share_report_pre_msg_title", bVar3.f195570f);
                intent3.putExtra("share_report_pre_msg_desc", bVar3.f195574g);
                intent3.putExtra("share_report_pre_msg_icon_url", bVar3.f195646y);
                intent3.putExtra("share_report_pre_msg_appid", bVar3.f195562d);
                intent3.putExtra("share_report_from_scene", i);
                intent3.putExtra("geta8key_scene", 1);
                if (i == 5) {
                    intent3.putExtra("share_report_biz_username", bVar2.mo91577r());
                }
                C68065f fVar = (C68065f) bVar3.mo93555w(C68065f.class);
                int i2 = fVar != null ? fVar.f195417b : -1;
                intent3.putExtra(C74928u.C45093i.f122318j, i2);
                intent3.putExtra("key_enable_teen_mode_check", true);
                C74244u.m88496g(bVar3, bVar4, intent3);
                intent3.addFlags(536870912);
                C74244u.m88505p(intent3, f4Var2, bVar3);
                if (fVar == null || i2 != 16) {
                    C74023i.m87882c0(bVar4, f4Var2);
                    if (((C45696d) C86709a0.m107533q(cls)).mo70957E5(3)) {
                        intent = intent3;
                        if (((C45696d) C86709a0.m107533q(cls)).Ms0(bVar2.mo91565f(), K3, i2, false, 1, intExtra, intent)) {
                            Log.m105924i("MicroMsg.ChattingItemAppMsgFrom", "jump to TmplWebview");
                            return true;
                        }
                    } else {
                        intent = intent3;
                    }
                    C88144b.m109791i(bVar2.mo91565f(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
                    return true;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putInt("biz_video_scene", 1);
                bundle2.putInt(C74928u.C74929b.f220309a, intExtra);
                bundle2.putInt("geta8key_scene", 1);
                bundle2.putString("geta8key_username", bVar2.mo91577r());
                if (r0Var != null && !Util.isNullOrNil(r0Var.f260345b)) {
                    C39750a.f106644a.mo62388d(r0Var.f260345b);
                }
                C75308c.m90328a(bVar2.mo91565f(), f4Var.getMsgId(), f4Var.mo108774y2(), 0, bundle2);
                return true;
            }
            w25 w25 = new w25();
            w25.f259899d = r0Var.f260345b;
            w25.f259900e = r0Var.f260346c;
            w25.f259901f = r0Var.f260347d;
            w25.f259902g = r0Var.f260348e;
            w25.f259903h = r0Var.f260349f;
            w25.f259904i = r0Var.f260358o;
            w25.f259905j = r0Var.f260350g;
            w25.f259906n = r0Var.f260351h;
            w25.f259907o = r0Var.f260352i;
            w25.f259908p = r0Var.f260353j;
            w25.f259909q = r0Var.f260354k;
            w25.f259910r = r0Var.f260355l;
            w25.f259911s = r0Var.f260356m;
            w25.f259912t = r0Var.f260357n;
            w25.f259913u = r0Var.f260359p;
            w25.f259915w = r0Var.f260361r;
            w25.f259916x = r0Var.f260362s;
            w25.f259918z = r0Var.f260364u;
            w25.f259914v = r0Var.f260360q;
            uh4 o = C21914h.m25167o(w25, 32, bVar2.mo91565f().getString(C0966R.string.f3q));
            C21915i.m25173e(w25, f4Var2);
            C101987v0.m134280n(bVar2.mo91565f(), o);
            return true;
        }

        /* renamed from: E */
        public View mo26231E(LayoutInflater layoutInflater, View view) {
            if (view != null && view.getTag() != null) {
                return view;
            }
            C6807n4 n4Var = new C6807n4(layoutInflater, C0966R.C0971layout.f6880r2);
            C74255e eVar = new C74255e();
            eVar.mo103258d(n4Var, true);
            n4Var.setTag(eVar);
            return n4Var;
        }

        /* renamed from: R */
        public boolean mo26232R() {
            return false;
        }

        /* renamed from: X */
        public boolean mo26233X(MenuItem menuItem, C67391b bVar, C72963f4 f4Var) {
            String content;
            C68070l.C68072b u;
            int itemId = menuItem.getItemId();
            if (itemId != 111) {
                if (!(itemId != 114 || (content = f4Var.getContent()) == null || (u = C68070l.C68072b.m80422u(content, (String) null)) == null)) {
                    switch (C74244u.m88491b(f4Var, u)) {
                        case 1:
                            C73745l4.m87344e(C75604z3.m90840l(bVar.mo91583x(), f4Var.getContent(), f4Var.mo108769t2()), bVar.mo91565f());
                            break;
                        case 2:
                            C73745l4.m87343d(f4Var, bVar.mo91565f(), mo103068y(bVar, f4Var), bVar.mo91583x());
                            break;
                        case 3:
                            C73745l4.m87341b(f4Var, C75604z3.m90840l(bVar.mo91583x(), f4Var.getContent(), f4Var.mo108769t2()), bVar.mo91565f(), 512);
                            break;
                        case 4:
                            C73745l4.m87345f(f4Var, bVar.mo91565f());
                            break;
                        case 5:
                            C73745l4.m87341b(f4Var, C75604z3.m90840l(bVar.mo91583x(), f4Var.getContent(), f4Var.mo108769t2()), bVar.mo91565f(), 128);
                            break;
                        case 6:
                            C73745l4.m87341b(f4Var, C75604z3.m90840l(bVar.mo91583x(), f4Var.getContent(), f4Var.mo108769t2()), bVar.mo91565f(), 256);
                            break;
                        case 8:
                            C73745l4.m87342c(f4Var, bVar.mo91565f());
                            break;
                    }
                }
                return false;
            } else if (!C73764n3.m87369a(f4Var)) {
                C76879j.m92754y(bVar.mo91565f(), bVar.mo91565f().getString(C0966R.string.cm7), "", bVar.mo91565f().getString(C0966R.string.lkg), (DialogInterface.OnClickListener) null);
                return false;
            } else {
                C6789c.m7088a(f4Var, bVar.mo91565f(), new u$f$$a(this, bVar, f4Var));
                return false;
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:39:0x011f, code lost:
            if (rb0.C48009v0.Fx0().mo72759TO(512) > 0) goto L_0x0121;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x0180, code lost:
            if (rb0.C48009v0.Fx0().mo72759TO(64) > 0) goto L_0x0121;
         */
        /* JADX WARNING: Removed duplicated region for block: B:86:0x0201  */
        /* JADX WARNING: Removed duplicated region for block: B:89:0x021e  */
        /* JADX WARNING: Removed duplicated region for block: B:92:0x0229  */
        /* renamed from: Z */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo26235Z(nj3.C76874e0 r18, android.view.View r19, android.view.ContextMenu.ContextMenuInfo r20, com.tencent.p014mm.storage.C72963f4 r21) {
            /*
                r17 = this;
                r0 = r17
                r1 = r21
                java.lang.Class<ym.l> r2 = p763ym.C79138l.class
                java.lang.Object r3 = r19.getTag()
                com.tencent.mm.ui.chatting.viewitems.t8 r3 = (com.tencent.p014mm.p136ui.chatting.viewitems.C74243t8) r3
                int r3 = r3.mo103252b()
                ck3.b r4 = r0.f218101v
                boolean r4 = r4.mo91583x()
                java.lang.String r5 = r21.getContent()
                int r6 = r21.mo108769t2()
                java.lang.String r4 = eb0.C75604z3.m90840l(r4, r5, r6)
                int r10 = com.tencent.p014mm.pluginsdk.model.app.C72695v.m85071m(r4)
                ck3.b r4 = r0.f218101v
                boolean r4 = r4.mo91583x()
                java.lang.String r5 = r21.getContent()
                int r6 = r21.mo108769t2()
                java.lang.String r4 = eb0.C75604z3.m90840l(r4, r5, r6)
                r5 = 0
                com.tencent.mm.message.l$b r11 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r4, r5)
                di3.d r4 = di3.C86312j.m106911c(r2)
                ym.l r4 = (p763ym.C79138l) r4
                java.lang.String r5 = r11.f195562d
                r12 = 0
                com.tencent.mm.pluginsdk.model.app.j r13 = r4.mo73990GW(r5, r12)
                di3.d r2 = di3.C86312j.m106911c(r2)
                ym.l r2 = (p763ym.C79138l) r2
                boolean r2 = r2.E10(r13)
                r14 = 6
                if (r2 == 0) goto L_0x00b9
                boolean r2 = com.tencent.p014mm.p136ui.chatting.C74343y0.m88768l(r21)
                if (r2 != 0) goto L_0x00b9
                boolean r2 = eb0.C75569c4.m90687t(r21)
                if (r2 != 0) goto L_0x00b9
                boolean r2 = com.tencent.p014mm.p136ui.chatting.C74343y0.m88767k(r21)
                if (r2 != 0) goto L_0x00b9
                boolean r2 = com.tencent.p014mm.p136ui.chatting.C74343y0.m88748G(r21)
                if (r2 != 0) goto L_0x00b9
                int r2 = r11.f195582i
                r4 = 2131834845(0x7f1137dd, float:1.9302812E38)
                if (r2 != r14) goto L_0x00a3
                java.lang.String r2 = r11.f195606o
                com.tencent.mm.pluginsdk.model.app.d r2 = com.tencent.p014mm.pluginsdk.model.app.C72695v.m85065g(r2)
                if (r2 == 0) goto L_0x0086
                java.lang.String r2 = r2.field_fileFullPath
                boolean r2 = com.tencent.p014mm.p136ui.chatting.component.C73521l0.m86925b(r1, r2)
                if (r2 != 0) goto L_0x00b9
            L_0x0086:
                boolean r2 = r21.mo100972K3()
                if (r2 != 0) goto L_0x00b9
                r6 = 111(0x6f, float:1.56E-43)
                r7 = 0
                ck3.b r2 = r0.f218101v
                android.content.res.Resources r2 = r2.mo91572m()
                java.lang.String r8 = r2.getString(r4)
                r9 = 2131756158(0x7f10047e, float:1.9143216E38)
                r4 = r18
                r5 = r3
                r4.mo107136c(r5, r6, r7, r8, r9)
                goto L_0x00b9
            L_0x00a3:
                r6 = 111(0x6f, float:1.56E-43)
                r7 = 0
                ck3.b r2 = r0.f218101v
                android.content.res.Resources r2 = r2.mo91572m()
                java.lang.String r8 = r2.getString(r4)
                r9 = 2131756158(0x7f10047e, float:1.9143216E38)
                r4 = r18
                r5 = r3
                r4.mo107136c(r5, r6, r7, r8, r9)
            L_0x00b9:
                int r2 = r11.f195594l
                r15 = 2131823546(0x7f110bba, float:1.9279895E38)
                r16 = 1
                if (r2 <= 0) goto L_0x00cd
                if (r2 <= 0) goto L_0x00c9
                r2 = 100
                if (r10 < r2) goto L_0x00c9
                goto L_0x00cd
            L_0x00c9:
                r10 = r18
                goto L_0x019f
            L_0x00cd:
                int r2 = com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.m88491b(r1, r11)
                r4 = 8
                if (r2 == r4) goto L_0x0176
                r4 = 16
                if (r2 == r4) goto L_0x0147
                r4 = 34
                if (r2 == r4) goto L_0x012d
                switch(r2) {
                    case 1: goto L_0x0128;
                    case 2: goto L_0x0123;
                    case 3: goto L_0x0115;
                    case 4: goto L_0x010f;
                    case 5: goto L_0x0109;
                    case 6: goto L_0x00e2;
                    default: goto L_0x00e0;
                }
            L_0x00e0:
                goto L_0x0152
            L_0x00e2:
                boolean r2 = rb0.C47984k.m53329c()
                java.lang.String r4 = r11.f195602n
                boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isImageExt(r4)
                if (r4 != 0) goto L_0x0183
                r6 = 150(0x96, float:2.1E-43)
                r7 = 0
                ck3.b r4 = r0.f218101v
                android.content.res.Resources r4 = r4.mo91572m()
                r5 = 2131823555(0x7f110bc3, float:1.9279913E38)
                java.lang.String r8 = r4.getString(r5)
                r9 = 2131756111(0x7f10044f, float:1.914312E38)
                r4 = r18
                r5 = r3
                r4.mo107136c(r5, r6, r7, r8, r9)
                goto L_0x0183
            L_0x0109:
                boolean r2 = rb0.C47984k.m53331e()
                goto L_0x0183
            L_0x010f:
                boolean r2 = rb0.C47984k.m53333g()
                goto L_0x0183
            L_0x0115:
                rb0.j r2 = rb0.C48009v0.Fx0()
                r4 = 512(0x200, float:7.175E-43)
                int r2 = r2.mo72759TO(r4)
                if (r2 <= 0) goto L_0x0152
            L_0x0121:
                r2 = 1
                goto L_0x0183
            L_0x0123:
                boolean r2 = rb0.C47984k.m53330d()
                goto L_0x0183
            L_0x0128:
                boolean r2 = rb0.C47984k.m53332f()
                goto L_0x0183
            L_0x012d:
                r18.clear()
                r6 = 100
                r7 = 0
                ck3.b r1 = r0.f218101v
                android.content.res.Resources r1 = r1.mo91572m()
                java.lang.String r8 = r1.getString(r15)
                r9 = 2131756004(0x7f1003e4, float:1.9142903E38)
                r4 = r18
                r5 = r3
                r4.mo107136c(r5, r6, r7, r8, r9)
                return r12
            L_0x0147:
                int r2 = r11.f195531T0
                r4 = 5
                r5 = 2
                if (r2 == r4) goto L_0x0154
                if (r2 == r14) goto L_0x0154
                if (r2 != r5) goto L_0x0152
                goto L_0x0154
            L_0x0152:
                r2 = 0
                goto L_0x0183
            L_0x0154:
                if (r2 != r5) goto L_0x015c
                boolean r1 = eb0.C75569c4.m90690w(r21)
                if (r1 == 0) goto L_0x015f
            L_0x015c:
                r18.clear()
            L_0x015f:
                r6 = 100
                r7 = 0
                ck3.b r1 = r0.f218101v
                android.content.res.Resources r1 = r1.mo91572m()
                java.lang.String r8 = r1.getString(r15)
                r9 = 2131756004(0x7f1003e4, float:1.9142903E38)
                r4 = r18
                r5 = r3
                r4.mo107136c(r5, r6, r7, r8, r9)
                return r12
            L_0x0176:
                rb0.j r2 = rb0.C48009v0.Fx0()
                r4 = 64
                int r2 = r2.mo72759TO(r4)
                if (r2 <= 0) goto L_0x0152
                goto L_0x0121
            L_0x0183:
                if (r2 == 0) goto L_0x00c9
                ck3.b r2 = r0.f218101v
                boolean r2 = r2.mo91584y()
                if (r2 != 0) goto L_0x00c9
                r2 = 114(0x72, float:1.6E-43)
                android.content.Context r4 = r19.getContext()
                r5 = 2131823541(0x7f110bb5, float:1.9279885E38)
                java.lang.String r4 = r4.getString(r5)
                r10 = r18
                r10.add((int) r3, (int) r2, (int) r12, (java.lang.CharSequence) r4)
            L_0x019f:
                java.lang.String r2 = "favorite"
                ke3.C88144b.m109788f(r2)
                if (r13 == 0) goto L_0x01ac
                boolean r2 = r13.mo69359k()
                if (r2 != 0) goto L_0x01eb
            L_0x01ac:
                int r2 = r11.f195617q2
                if (r2 != 0) goto L_0x01eb
                int r2 = com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.m88491b(r1, r11)
                r4 = 10
                if (r2 == r4) goto L_0x01d4
                r4 = 13
                if (r2 == r4) goto L_0x01d4
                r4 = 24
                if (r2 == r4) goto L_0x01d4
                r4 = 33
                if (r2 == r4) goto L_0x01d4
                r4 = 36
                if (r2 == r4) goto L_0x01d4
                r4 = 19
                if (r2 == r4) goto L_0x01d4
                r4 = 20
                if (r2 == r4) goto L_0x01d4
                switch(r2) {
                    case 1: goto L_0x01d4;
                    case 2: goto L_0x01d4;
                    case 3: goto L_0x01d4;
                    case 4: goto L_0x01d4;
                    case 5: goto L_0x01d4;
                    case 6: goto L_0x01d4;
                    default: goto L_0x01d3;
                }
            L_0x01d3:
                goto L_0x01eb
            L_0x01d4:
                r6 = 116(0x74, float:1.63E-43)
                r7 = 0
                android.content.Context r2 = r19.getContext()
                r4 = 2131834033(0x7f1134b1, float:1.9301165E38)
                java.lang.String r8 = r2.getString(r4)
                r9 = 2131756032(0x7f100400, float:1.914296E38)
                r4 = r18
                r5 = r3
                r4.mo107136c(r5, r6, r7, r8, r9)
            L_0x01eb:
                com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent r2 = new com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent
                r2.<init>()
                com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent$a r4 = r2.f236178d
                long r5 = r21.getMsgId()
                r4.f236180a = r5
                r2.publish()
                com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent$b r2 = r2.f236179e
                boolean r2 = r2.f236182a
                if (r2 == 0) goto L_0x0218
                r6 = 129(0x81, float:1.81E-43)
                r7 = 0
                android.content.Context r2 = r19.getContext()
                r4 = 2131823554(0x7f110bc2, float:1.927991E38)
                java.lang.String r8 = r2.getString(r4)
                r9 = 2131756110(0x7f10044e, float:1.9143118E38)
                r4 = r18
                r5 = r3
                r4.mo107136c(r5, r6, r7, r8, r9)
            L_0x0218:
                boolean r1 = eb0.C75569c4.m90690w(r21)
                if (r1 == 0) goto L_0x0221
                r18.clear()
            L_0x0221:
                ck3.b r1 = r0.f218101v
                boolean r1 = r1.mo91584y()
                if (r1 != 0) goto L_0x023f
                r6 = 100
                r7 = 0
                ck3.b r1 = r0.f218101v
                android.content.res.Resources r1 = r1.mo91572m()
                java.lang.String r8 = r1.getString(r15)
                r9 = 2131756004(0x7f1003e4, float:1.9142903E38)
                r4 = r18
                r5 = r3
                r4.mo107136c(r5, r6, r7, r8, r9)
            L_0x023f:
                return r16
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.C74260f.mo26235Z(nj3.e0, android.view.View, android.view.ContextMenu$ContextMenuInfo, com.tencent.mm.storage.f4):boolean");
        }

        /* JADX WARNING: Removed duplicated region for block: B:89:0x01ea A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:90:0x01eb A[RETURN] */
        /* renamed from: a0 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo26236a0(android.view.View r30, ck3.C67391b r31, com.tencent.p014mm.storage.C72963f4 r32) {
            /*
                r29 = this;
                r8 = r29
                r9 = r30
                r10 = r31
                r11 = r32
                java.lang.Class<ky2.i> r12 = ky2.C10432i.class
                com.tencent.mm.modelstat.a$a r0 = com.tencent.p014mm.modelstat.C68144a.C68145a.Click
                com.tencent.p014mm.modelstat.C68144a.m80547c(r11, r0)
                java.lang.Class<i21.h> r0 = i21.C98591h.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                i21.h r0 = (i21.C98591h) r0
                java.lang.String r1 = r32.mo108768t()
                r0.Gr0(r1)
                java.lang.String r0 = r32.getContent()
                java.lang.Boolean r1 = java.lang.Boolean.FALSE
                r13 = 0
                if (r0 != 0) goto L_0x0028
                return r13
            L_0x0028:
                boolean r2 = r31.mo91583x()
                java.lang.String r3 = r32.getContent()
                int r4 = r32.mo108769t2()
                java.lang.String r2 = eb0.C75604z3.m90840l(r2, r3, r4)
                r14 = 0
                com.tencent.mm.message.l$b r15 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r2, r14)
                com.tencent.mm.message.o r0 = com.tencent.p014mm.message.C68075o.m80440a(r0)
                if (r15 != 0) goto L_0x0044
                return r13
            L_0x0044:
                int r0 = r0.f195664b
                if (r0 == 0) goto L_0x004c
                java.lang.Boolean r1 = java.lang.Boolean.TRUE
                r15.f195582i = r0
            L_0x004c:
                r16 = r1
                java.lang.Class<ym.l> r0 = p763ym.C79138l.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                ym.l r0 = (p763ym.C79138l) r0
                java.lang.String r1 = r15.f195562d
                com.tencent.mm.pluginsdk.model.app.j r7 = r0.mo73990GW(r1, r13)
                java.lang.String r20 = r8.mo103097o(r10, r11)
                if (r7 == 0) goto L_0x007a
                long r5 = r32.mo108774y2()
                java.lang.String r17 = r31.mo91577r()
                r0 = r29
                r1 = r31
                r2 = r15
                r3 = r20
                r4 = r7
                r28 = r7
                r7 = r17
                r0.mo103094j(r1, r2, r3, r4, r5, r7)
                goto L_0x007c
            L_0x007a:
                r28 = r7
            L_0x007c:
                int r0 = com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.m88491b(r11, r15)
                r1 = 3
                r2 = 2
                r7 = 1
                if (r0 == r1) goto L_0x0357
                r1 = 4
                if (r0 == r1) goto L_0x0355
                r1 = 6
                java.lang.String r3 = "app_msg_id"
                java.lang.String r4 = "scene"
                java.lang.String r5 = "com.tencent.mm.ui.chatting.AppAttachDownloadUI"
                if (r0 == r1) goto L_0x02f1
                r1 = 7
                if (r0 == r1) goto L_0x0286
                r1 = 10
                r2 = 65536(0x10000, float:9.18355E-41)
                if (r0 == r1) goto L_0x024d
                r1 = 13
                if (r0 == r1) goto L_0x0223
                r1 = 16
                java.lang.String r3 = "card"
                if (r0 == r1) goto L_0x01fa
                r1 = 24
                if (r0 == r1) goto L_0x01f6
                r1 = 36
                if (r0 == r1) goto L_0x01ec
                r1 = 44
                if (r0 == r1) goto L_0x01c8
                r1 = 48
                if (r0 == r1) goto L_0x01be
                r1 = 68
                if (r0 == r1) goto L_0x01b7
                r1 = 19
                if (r0 == r1) goto L_0x019e
                r1 = 20
                if (r0 == r1) goto L_0x0165
                r1 = 33
                if (r0 == r1) goto L_0x01c8
                r1 = 34
                if (r0 == r1) goto L_0x011a
                r1 = 83
                if (r0 == r1) goto L_0x00fa
                r1 = 84
                if (r0 == r1) goto L_0x00d4
            L_0x00d1:
                r0 = 1
                goto L_0x01e2
            L_0x00d4:
                di3.d r0 = di3.C86312j.m106911c(r12)
                r17 = r0
                ky2.i r17 = (ky2.C10432i) r17
                android.app.Activity r18 = r31.mo91565f()
                java.lang.String r19 = eb0.C75592q0.m90789s()
                long r21 = r32.getCreateTime()
                long r23 = r32.mo108774y2()
                java.lang.String r25 = r32.getContent()
                java.lang.String r26 = r32.mo108765s2()
                java.lang.Boolean r27 = java.lang.Boolean.TRUE
                r17.mo10744WJ(r18, r19, r20, r21, r23, r25, r26, r27)
                return r7
            L_0x00fa:
                di3.d r0 = di3.C86312j.m106911c(r12)
                ky2.i r0 = (ky2.C10432i) r0
                android.app.Activity r1 = r31.mo91565f()
                java.lang.String r2 = r15.f195591k0
                java.lang.Class<t90.d> r3 = t90.C13867d.class
                com.tencent.mm.message.g r3 = r15.mo93555w(r3)
                t90.d r3 = (t90.C13867d) r3
                java.lang.String r4 = r3.f39030b
                long r5 = r32.getCreateTime()
                r3 = r20
                r0.dt0(r1, r2, r3, r4, r5)
                return r7
            L_0x011a:
                android.content.Intent r0 = new android.content.Intent
                r0.<init>()
                java.lang.String r1 = r8.mo103068y(r10, r11)
                java.lang.String r2 = "key_from_user_name"
                r0.putExtra(r2, r1)
                int r1 = r15.f195534U0
                java.lang.String r2 = "key_biz_uin"
                r0.putExtra(r2, r1)
                java.lang.String r1 = r15.f195537V0
                java.lang.String r2 = "key_order_id"
                r0.putExtra(r2, r1)
                java.lang.String r1 = r32.mo108768t()
                if (r1 == 0) goto L_0x015b
                java.lang.String r1 = r32.mo108768t()
                java.lang.String r2 = ""
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x015b
                java.lang.String r1 = r32.mo108768t()
                boolean r1 = com.tencent.p014mm.storage.C72996z1.m85820U5(r1)
                if (r1 == 0) goto L_0x015b
                java.lang.String r1 = r32.mo108768t()
                java.lang.String r2 = "key_chatroom_name"
                r0.putExtra(r2, r1)
            L_0x015b:
                android.app.Activity r1 = r31.mo91565f()
                java.lang.String r2 = ".ui.CardGiftAcceptUI"
                ke3.C88144b.m109791i(r1, r3, r2, r0, r14)
                return r7
            L_0x0165:
                java.lang.String r0 = r15.f195567e0
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                if (r0 == 0) goto L_0x016e
                return r13
            L_0x016e:
                android.content.Intent r0 = new android.content.Intent
                r0.<init>()
                r0.setFlags(r2)
                java.lang.String r1 = r15.f195567e0
                java.lang.String r2 = "key_TV_xml"
                r0.putExtra(r2, r1)
                java.lang.String r1 = "key_TV_getProductInfoScene"
                r0.putExtra(r1, r7)
                java.lang.String r1 = r32.mo108765s2()
                if (r1 != 0) goto L_0x0191
                long r1 = r32.getMsgId()
                java.lang.String r3 = "key_TVInfoUI_chatting_msgId"
                r0.putExtra(r3, r1)
            L_0x0191:
                android.app.Activity r1 = r31.mo91565f()
                java.lang.String r2 = "shake"
                java.lang.String r3 = ".ui.TVInfoUI"
                ke3.C88144b.m109791i(r1, r2, r3, r0, r14)
                return r7
            L_0x019e:
                r3 = 19
                boolean r4 = r16.booleanValue()
                java.lang.String r6 = r8.mo103068y(r10, r11)
                r0 = r30
                r1 = r31
                r2 = r32
                r5 = r20
                r7 = r29
                boolean r0 = m88532u0(r0, r1, r2, r3, r4, r5, r6, r7)
                return r0
            L_0x01b7:
                boolean r0 = com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.m88492c(r15, r9, r10, r8, r11)
                if (r0 == 0) goto L_0x00d1
                return r7
            L_0x01be:
                boolean r0 = m88531t0(r15, r10, r8, r11)
                if (r0 != 0) goto L_0x01c6
                goto L_0x00d1
            L_0x01c6:
                r0 = 0
                goto L_0x01e2
            L_0x01c8:
                com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r0 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.SessionAppbrand
                android.app.Activity r1 = r31.mo91565f()
                boolean r0 = r0.checkAvailable(r1)
                if (r0 != 0) goto L_0x01d5
                return r7
            L_0x01d5:
                boolean r0 = m88530s0(r15, r10, r8, r11)
                if (r0 == 0) goto L_0x00d1
                com.tencent.p014mm.p136ui.chatting.component.C19729d.m21410g6(r10, r9, r11)
                com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.m87882c0(r31, r32)
                return r7
            L_0x01e2:
                if (r0 == 0) goto L_0x01eb
                boolean r0 = m88535x0(r15, r9, r10, r8, r11)
                if (r0 == 0) goto L_0x01eb
                return r7
            L_0x01eb:
                return r13
            L_0x01ec:
                m88534w0(r15, r10, r8, r11)
                com.tencent.p014mm.p136ui.chatting.component.C19729d.m21410g6(r10, r9, r11)
                com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.m87882c0(r31, r32)
                return r7
            L_0x01f6:
                com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.m88500k(r15, r10, r11)
                return r7
            L_0x01fa:
                java.lang.String r0 = r15.f195522Q0
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                if (r0 == 0) goto L_0x0203
                return r13
            L_0x0203:
                android.content.Intent r0 = new android.content.Intent
                r0.<init>()
                r0.setFlags(r2)
                java.lang.String r1 = r15.f195522Q0
                java.lang.String r2 = "key_card_app_msg"
                r0.putExtra(r2, r1)
                int r1 = r15.f195531T0
                java.lang.String r2 = "key_from_scene"
                r0.putExtra(r2, r1)
                android.app.Activity r1 = r31.mo91565f()
                java.lang.String r2 = ".ui.CardDetailUI"
                ke3.C88144b.m109791i(r1, r3, r2, r0, r14)
                return r7
            L_0x0223:
                java.lang.String r0 = r15.f195579h0
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                if (r0 == 0) goto L_0x022c
                return r13
            L_0x022c:
                android.content.Intent r0 = new android.content.Intent
                r0.<init>()
                r0.setFlags(r2)
                java.lang.String r1 = r15.f195579h0
                java.lang.String r2 = "key_product_info"
                r0.putExtra(r2, r1)
                java.lang.String r1 = "key_product_scene"
                r0.putExtra(r1, r7)
                android.app.Activity r1 = r31.mo91565f()
                java.lang.String r2 = "product"
                java.lang.String r3 = ".ui.MallProductUI"
                ke3.C88144b.m109791i(r1, r2, r3, r0, r14)
                return r7
            L_0x024d:
                java.lang.String r0 = r15.f195555b0
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                if (r0 == 0) goto L_0x0256
                return r13
            L_0x0256:
                android.content.Intent r0 = new android.content.Intent
                r0.<init>()
                r0.setFlags(r2)
                java.lang.String r1 = r15.f195555b0
                java.lang.String r2 = "key_Product_xml"
                r0.putExtra(r2, r1)
                java.lang.String r1 = "key_ProductUI_getProductInfoScene"
                r0.putExtra(r1, r7)
                java.lang.String r1 = r32.mo108765s2()
                if (r1 != 0) goto L_0x0279
                long r1 = r32.getMsgId()
                java.lang.String r3 = "key_ProductUI_chatting_msgId"
                r0.putExtra(r3, r1)
            L_0x0279:
                android.app.Activity r1 = r31.mo91565f()
                java.lang.String r2 = "scanner"
                java.lang.String r3 = ".ui.ProductUI"
                ke3.C88144b.m109791i(r1, r2, r3, r0, r14)
                return r7
            L_0x0286:
                r6 = r28
                if (r6 == 0) goto L_0x0297
                boolean r0 = r6.mo69359k()
                if (r0 == 0) goto L_0x0297
                boolean r0 = r8.mo103086e(r10, r6)
                if (r0 == 0) goto L_0x0297
                return r7
            L_0x0297:
                java.lang.String r0 = r15.f195606o
                if (r0 == 0) goto L_0x02d2
                int r0 = r0.length()
                if (r0 != 0) goto L_0x02a2
                goto L_0x02d2
            L_0x02a2:
                boolean r0 = r8.f217197d
                if (r0 != 0) goto L_0x02b4
                android.app.Activity r0 = r31.mo91565f()
                com.tencent.mm.ui.chatting.BaseChattingUIFragment r1 = r10.f193286j
                android.view.View r1 = r1.getContentView()
                nj3.C76912y0.m92771j(r0, r1)
                return r7
            L_0x02b4:
                android.content.Intent r0 = new android.content.Intent
                r0.<init>()
                android.app.Activity r1 = r31.mo91565f()
                r0.setClassName(r1, r5)
                long r5 = r32.getMsgId()
                r0.putExtra(r3, r5)
                r0.putExtra(r4, r2)
                com.tencent.mm.ui.chatting.BaseChattingUIFragment r1 = r10.f193286j
                r2 = 210(0xd2, float:2.94E-43)
                r1.startActivityForResult(r0, r2)
                goto L_0x02f0
            L_0x02d2:
                java.lang.Class<zj3.b> r0 = zj3.C79339b.class
                com.tencent.mm.ui.chatting.manager.a r1 = r10.f193278b
                xi.d r0 = r1.mo102812a(r0)
                r9 = r0
                zj3.b r9 = (zj3.C79339b) r9
                com.tencent.mm.ui.chatting.viewitems.u$f$$b r12 = new com.tencent.mm.ui.chatting.viewitems.u$f$$b
                r0 = r12
                r1 = r29
                r2 = r6
                r3 = r31
                r4 = r15
                r5 = r20
                r6 = r32
                r0.<init>(r1, r2, r3, r4, r5, r6)
                r9.mo102380Y3(r11, r12)
            L_0x02f0:
                return r7
            L_0x02f1:
                boolean r0 = r8.f217197d
                if (r0 != 0) goto L_0x0303
                android.app.Activity r0 = r31.mo91565f()
                com.tencent.mm.ui.chatting.BaseChattingUIFragment r1 = r10.f193286j
                android.view.View r1 = r1.getContentView()
                nj3.C76912y0.m92771j(r0, r1)
                return r7
            L_0x0303:
                android.content.Intent r0 = new android.content.Intent
                r0.<init>()
                android.app.Activity r1 = r31.mo91565f()
                r0.setClassName(r1, r5)
                r0.putExtra(r4, r2)
                long r1 = r32.getMsgId()
                r0.putExtra(r3, r1)
                k20.a r9 = new k20.a
                r9.<init>()
                r9.mo10233c(r0)
                java.lang.Object[] r1 = r9.mo10232b()
                java.lang.String r2 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsg$ChattingItemAppMsgFrom"
                java.lang.String r3 = "onItemClick"
                java.lang.String r4 = "(Landroid/view/View;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)Z"
                java.lang.String r5 = "Undefined"
                java.lang.String r6 = "startActivity"
                java.lang.String r11 = "(Landroid/content/Intent;)V"
                r0 = r31
                r12 = 1
                r7 = r11
                j20.C117292a.m165358d(r0, r1, r2, r3, r4, r5, r6, r7)
                java.lang.Object r0 = r9.mo10231a(r13)
                android.content.Intent r0 = (android.content.Intent) r0
                r10.mo91556Q(r0)
                java.lang.String r1 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsg$ChattingItemAppMsgFrom"
                java.lang.String r2 = "onItemClick"
                java.lang.String r3 = "(Landroid/view/View;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)Z"
                java.lang.String r4 = "Undefined"
                java.lang.String r5 = "startActivity"
                java.lang.String r6 = "(Landroid/content/Intent;)V"
                r0 = r31
                j20.C117292a.m165359e(r0, r1, r2, r3, r4, r5, r6)
                return r12
            L_0x0355:
                r12 = 1
                goto L_0x037f
            L_0x0357:
                r12 = 1
                com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r0 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.SessionMusic
                android.app.Activity r3 = r31.mo91565f()
                boolean r0 = r0.checkAvailable(r3)
                if (r0 != 0) goto L_0x0365
                return r12
            L_0x0365:
                com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r3 = 13043(0x32f3, float:1.8277E-41)
                java.lang.Object[] r1 = new java.lang.Object[r1]
                java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
                r1[r13] = r4
                java.lang.String r4 = r15.f195574g
                r1[r12] = r4
                java.lang.String r4 = r15.f195562d
                r1[r2] = r4
                r0.mo160131h(r3, r1)
                com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.m87882c0(r31, r32)
            L_0x037f:
                m88533v0(r15, r10, r8, r11)
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.C74260f.mo26236a0(android.view.View, ck3.b, com.tencent.mm.storage.f4):boolean");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x015d, code lost:
            r3 = r5.field_appName;
         */
        /* JADX WARNING: Removed duplicated region for block: B:104:0x03e2  */
        /* JADX WARNING: Removed duplicated region for block: B:109:0x03fe  */
        /* JADX WARNING: Removed duplicated region for block: B:110:0x0411  */
        /* JADX WARNING: Removed duplicated region for block: B:113:0x043c  */
        /* JADX WARNING: Removed duplicated region for block: B:121:0x045f  */
        /* JADX WARNING: Removed duplicated region for block: B:524:0x13fe  */
        /* JADX WARNING: Removed duplicated region for block: B:541:0x146d  */
        /* JADX WARNING: Removed duplicated region for block: B:577:0x1596  */
        /* JADX WARNING: Removed duplicated region for block: B:581:0x15c0  */
        /* JADX WARNING: Removed duplicated region for block: B:75:0x033a  */
        /* JADX WARNING: Removed duplicated region for block: B:76:0x033c  */
        /* JADX WARNING: Removed duplicated region for block: B:78:0x033f  */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x0365  */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo26237f(com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.C74026c r37, ck3.C67391b r38, com.tencent.p014mm.storage.C72963f4 r39, java.lang.String r40) {
            /*
                r36 = this;
                r8 = r36
                r9 = r37
                r10 = r38
                r15 = r39
                r11 = r40
                java.lang.Class<kr0.w0> r12 = kr0.C76629w0.class
                java.lang.Class<zj3.l> r14 = zj3.C79368l.class
                java.lang.Class<kb0.i> r25 = kb0.C76529i.class
                java.lang.Class<ym.l> r26 = p763ym.C79138l.class
                java.lang.Class<gt.k> r27 = p158gt.C98201k.class
                r13 = r9
                com.tencent.mm.ui.chatting.viewitems.u$e r13 = (com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.C74255e) r13
                r8.f218101v = r10
                android.widget.TextView r0 = r13.f218064j
                if (r0 == 0) goto L_0x0022
                int r1 = r13.f218081r0
                r0.setMaxLines(r1)
            L_0x0022:
                java.lang.String r6 = r39.getContent()
                java.lang.Class<zj3.n> r0 = zj3.C79371n.class
                xi.d r0 = r10.mo91560a(r0)
                zj3.n r0 = (zj3.C79371n) r0
                r0.mo102405C3(r15)
                r0.mo102409q3(r15)
                r0.mo102406W4(r15)
                android.view.View r0 = r9.convertView
                com.tencent.p014mm.p136ui.chatting.component.C19729d.m21411h6(r10, r0, r15)
                java.lang.String r7 = "MicroMsg.ChattingItemAppMsgFrom"
                r5 = 0
                r4 = 2
                r3 = 1
                r2 = 0
                if (r6 == 0) goto L_0x0056
                java.lang.String r0 = r39.mo108775z2()
                com.tencent.mm.message.l$b r0 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r6, r0)
                com.tencent.mm.message.o r1 = com.tencent.p014mm.message.C68075o.m80440a(r6)
                r35 = r1
                r1 = r0
                r0 = r35
                goto L_0x006b
            L_0x0056:
                java.lang.Object[] r0 = new java.lang.Object[r4]
                long r16 = r39.getMsgId()
                java.lang.Long r1 = java.lang.Long.valueOf(r16)
                r0[r2] = r1
                r0[r3] = r11
                java.lang.String r1 = "amessage, msgid:%s, user:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r1, r0)
                r0 = r5
                r1 = r0
            L_0x006b:
                com.tencent.mm.ui.chatting.viewitems.t8 r2 = new com.tencent.mm.ui.chatting.viewitems.t8
                boolean r4 = r38.mo91583x()
                r2.<init>(r15, r4, r13, r5)
                android.widget.LinearLayout r4 = r13.f218075o0
                r5 = 8
                com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.m88490a(r4, r5)
                if (r1 == 0) goto L_0x15cb
                com.tencent.mm.ui.widget.MMNeat7extView r4 = r13.f218050c
                java.lang.String r5 = r1.mo93550m()
                r4.mo104279b(r5)
                android.widget.TextView r4 = r13.f218052d
                java.lang.String r5 = r1.mo93548k()
                r4.setText(r5)
                android.widget.TextView r4 = r13.f218064j
                r4.setMaxLines(r3)
                com.tencent.mm.ui.widget.MMNeat7extView r4 = r13.f218050c
                android.app.Activity r5 = r38.mo91565f()
                android.content.res.Resources r5 = r5.getResources()
                r3 = 2131099800(0x7f060098, float:1.7811963E38)
                int r3 = r5.getColor(r3)
                r4.setTextColor(r3)
                android.widget.TextView r3 = r13.f218052d
                android.app.Activity r4 = r38.mo91565f()
                android.content.res.Resources r4 = r4.getResources()
                r5 = 2131100897(0x7f0604e1, float:1.7814188E38)
                int r4 = r4.getColor(r5)
                r3.setTextColor(r4)
                android.widget.LinearLayout r3 = r13.f218087x
                r4 = 2131231612(0x7f08037c, float:1.807931E38)
                r3.setBackgroundResource(r4)
                android.widget.LinearLayout r3 = r13.f218087x
                android.app.Activity r5 = r38.mo91565f()
                android.content.res.Resources r5 = r5.getResources()
                r4 = 2131165574(0x7f070186, float:1.7945369E38)
                int r4 = r5.getDimensionPixelSize(r4)
                r5 = 0
                r3.setPadding(r5, r4, r5, r5)
                com.tencent.mm.ui.MMImageView r3 = r13.f218048b
                r3.setVisibility(r5)
                android.widget.RelativeLayout r3 = r13.f218085v
                r3.setVisibility(r5)
                android.widget.TextView r3 = r13.f218052d
                r3.setVisibility(r5)
                com.tencent.mm.ui.widget.MMPinProgressBtn r3 = r13.f218068l
                r5 = 8
                r3.setVisibility(r5)
                android.widget.ImageView r3 = r13.f218074o
                r3.setVisibility(r5)
                android.widget.ImageView r3 = r13.f218072n
                r3.setVisibility(r5)
                android.view.ViewStub r3 = r13.f218089z
                r3.setVisibility(r5)
                android.widget.ImageView r3 = r13.f218021A
                r3.setVisibility(r5)
                android.widget.ImageView r3 = r13.f218058g
                r3.setVisibility(r5)
                android.widget.TextView r3 = r13.f218060h
                r3.setVisibility(r5)
                android.widget.LinearLayout r3 = r13.f218029I
                r3.setVisibility(r5)
                android.widget.LinearLayout r3 = r13.f218023C
                r3.setVisibility(r5)
                android.widget.LinearLayout r3 = r13.f218087x
                r4 = 0
                r3.setVisibility(r4)
                android.widget.LinearLayout r3 = r13.f218038R
                r3.setVisibility(r5)
                android.widget.LinearLayout r3 = r13.f218046Z
                r3.setVisibility(r5)
                android.widget.LinearLayout r3 = r13.f218061h0
                r3.setVisibility(r5)
                android.widget.ImageView r3 = r13.f218071m0
                r3.setVisibility(r5)
                android.widget.FrameLayout r3 = r13.f218086w
                int r4 = r13.f218079q0
                r13.resetChatBubbleWidth(r3, r4)
                java.lang.Class<com.tencent.mm.message.i> r3 = com.tencent.p014mm.message.C68068i.class
                com.tencent.mm.message.g r3 = r1.mo93555w(r3)
                com.tencent.mm.message.i r3 = (com.tencent.p014mm.message.C68068i) r3
                android.widget.FrameLayout r3 = r13.f218086w
                r4 = 2131231612(0x7f08037c, float:1.807931E38)
                r3.setBackgroundResource(r4)
                di3.d r3 = di3.C86312j.m106911c(r26)
                ym.l r3 = (p763ym.C79138l) r3
                java.lang.String r4 = r1.f195562d
                int r5 = r1.f195480E
                com.tencent.mm.pluginsdk.model.app.j r5 = r3.mo74003UV(r4, r5)
                if (r5 == 0) goto L_0x015b
                r8.mo103095k(r10, r1, r15)
            L_0x015b:
                if (r5 == 0) goto L_0x016f
                java.lang.String r3 = r5.field_appName
                if (r3 == 0) goto L_0x016f
                java.lang.String r3 = r3.trim()
                int r3 = r3.length()
                if (r3 > 0) goto L_0x016c
                goto L_0x016f
            L_0x016c:
                java.lang.String r3 = r5.field_appName
                goto L_0x0171
            L_0x016f:
                java.lang.String r3 = r1.f195484F
            L_0x0171:
                android.app.Activity r4 = r38.mo91565f()
                r21 = r0
                r0 = 12
                kg3.C76577a.m92151b(r4, r0)
                int r0 = r1.f195582i
                r4 = 20
                if (r0 == r4) goto L_0x0190
                java.lang.String r0 = r1.f195562d
                java.lang.String r4 = "wxaf060266bfa9a35c"
                boolean r0 = r4.equals(r0)
                if (r0 == 0) goto L_0x018e
                goto L_0x0190
            L_0x018e:
                r0 = 1
                goto L_0x0198
            L_0x0190:
                wc3.b0 r0 = wc3.C78535a0.m94863b()
                boolean r0 = r0.isShowShakeTV()
            L_0x0198:
                r23 = r14
                r14 = 19
                if (r0 == 0) goto L_0x025a
                java.lang.String r0 = r1.f195562d
                if (r0 == 0) goto L_0x025a
                int r0 = r0.length()
                if (r0 <= 0) goto L_0x025a
                boolean r0 = r8.mo103084W(r3)
                if (r0 == 0) goto L_0x025a
                di3.d r0 = di3.C86312j.m106911c(r26)
                ym.l r0 = (p763ym.C79138l) r0
                android.app.Activity r4 = r38.mo91565f()
                java.lang.String r0 = r0.mo74019xG(r4, r5, r3)
                int r3 = r1.f195582i
                if (r3 != r14) goto L_0x01dd
                android.widget.TextView r3 = r13.f218054e
                android.app.Activity r4 = r38.mo91565f()
                android.content.res.Resources r4 = r4.getResources()
                r20 = r1
                r14 = 1
                java.lang.Object[] r1 = new java.lang.Object[r14]
                r14 = 0
                r1[r14] = r0
                r0 = 2131833874(0x7f113412, float:1.9300842E38)
                java.lang.String r0 = r4.getString(r0, r1)
                r3.setText(r0)
                goto L_0x01e5
            L_0x01dd:
                r20 = r1
                r14 = 0
                android.widget.TextView r1 = r13.f218054e
                r1.setText(r0)
            L_0x01e5:
                android.widget.TextView r0 = r13.f218054e
                r0.setVisibility(r14)
                android.widget.TextView r0 = r13.f218054e
                r4 = 0
                r0.setCompoundDrawables(r4, r4, r4, r4)
                android.widget.LinearLayout r0 = r13.f218062i
                r0.setVisibility(r14)
                android.widget.ImageView r0 = r13.f218056f
                r0.setVisibility(r14)
                if (r5 == 0) goto L_0x0230
                boolean r0 = r5.mo69359k()
                if (r0 == 0) goto L_0x0230
                android.widget.TextView r3 = r13.f218054e
                java.lang.String r1 = r5.field_packageName
                long r28 = r39.mo108774y2()
                r14 = r21
                r0 = r36
                r18 = r1
                r30 = r20
                r1 = r38
                r16 = r2
                r20 = r12
                r12 = 0
                r2 = r3
                r3 = r39
                r17 = r4
                r4 = r30
                r31 = r5
                r5 = r18
                r32 = r6
                r33 = r7
                r6 = r28
                r0.mo103074H(r1, r2, r3, r4, r5, r6)
                r5 = r30
                goto L_0x0248
            L_0x0230:
                r16 = r2
                r31 = r5
                r32 = r6
                r33 = r7
                r30 = r20
                r14 = r21
                r20 = r12
                r12 = 0
                android.widget.TextView r0 = r13.f218054e
                r5 = r30
                java.lang.String r1 = r5.f195562d
                r8.mo103076J(r10, r0, r1)
            L_0x0248:
                android.widget.ImageView r0 = r13.f218056f
                r1 = 2131231699(0x7f0803d3, float:1.8079486E38)
                r0.setImageResource(r1)
                android.widget.ImageView r0 = r13.f218056f
                java.lang.String r1 = r5.f195562d
                r8.mo103078L(r10, r0, r1)
                r1 = 8
                goto L_0x028f
            L_0x025a:
                r16 = r2
                r31 = r5
                r32 = r6
                r33 = r7
                r20 = r12
                r14 = r21
                r12 = 0
                r5 = r1
                int r0 = r5.f195582i
                r1 = 24
                if (r0 != r1) goto L_0x0294
                android.widget.TextView r0 = r13.f218054e
                android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                r2 = 2131825615(0x7f1113cf, float:1.9284091E38)
                java.lang.String r1 = r1.getString(r2)
                r0.setText(r1)
                android.widget.LinearLayout r0 = r13.f218062i
                r0.setVisibility(r12)
                android.widget.TextView r0 = r13.f218054e
                r0.setVisibility(r12)
                android.widget.ImageView r0 = r13.f218056f
                r1 = 8
                r0.setVisibility(r1)
            L_0x028f:
                r2 = 84
                r3 = 1
                goto L_0x0331
            L_0x0294:
                r1 = 8
                r2 = 83
                if (r0 == r2) goto L_0x030f
                r2 = 84
                if (r0 != r2) goto L_0x02a0
                goto L_0x0311
            L_0x02a0:
                r3 = 19
                if (r0 == r3) goto L_0x02ee
                if (r14 == 0) goto L_0x02ab
                int r4 = r14.f195664b
                if (r4 != r3) goto L_0x02ab
                goto L_0x02ee
            L_0x02ab:
                r3 = 68
                if (r0 != r3) goto L_0x02d6
                int r0 = r5.f195633u2
                r3 = 1
                if (r0 != r3) goto L_0x02d7
                if (r0 != r3) goto L_0x0331
                android.widget.TextView r0 = r13.f218054e
                android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                r6 = 2131831971(0x7f112ca3, float:1.9296983E38)
                java.lang.String r4 = r4.getString(r6)
                r0.setText(r4)
                android.widget.LinearLayout r0 = r13.f218062i
                r0.setVisibility(r12)
                android.widget.TextView r0 = r13.f218054e
                r0.setVisibility(r12)
                android.widget.ImageView r0 = r13.f218056f
                r0.setVisibility(r1)
                goto L_0x0331
            L_0x02d6:
                r3 = 1
            L_0x02d7:
                boolean r0 = com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.m88506q(r5, r13)
                if (r0 != 0) goto L_0x0331
                android.widget.LinearLayout r0 = r13.f218062i
                r0.setVisibility(r1)
                android.widget.TextView r0 = r13.f218054e
                r0.setVisibility(r1)
                android.widget.ImageView r0 = r13.f218056f
                r0.setVisibility(r1)
                r0 = 0
                goto L_0x0332
            L_0x02ee:
                r3 = 1
                android.widget.TextView r0 = r13.f218054e
                android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                r6 = 2131823532(0x7f110bac, float:1.9279866E38)
                java.lang.String r4 = r4.getString(r6)
                r0.setText(r4)
                android.widget.LinearLayout r0 = r13.f218062i
                r0.setVisibility(r12)
                android.widget.TextView r0 = r13.f218054e
                r0.setVisibility(r12)
                android.widget.ImageView r0 = r13.f218056f
                r0.setVisibility(r1)
                goto L_0x0331
            L_0x030f:
                r2 = 84
            L_0x0311:
                r3 = 1
                android.widget.TextView r0 = r13.f218054e
                android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                r6 = 2131821701(0x7f110485, float:1.9276153E38)
                java.lang.String r4 = r4.getString(r6)
                r0.setText(r4)
                android.widget.LinearLayout r0 = r13.f218062i
                r0.setVisibility(r12)
                android.widget.TextView r0 = r13.f218054e
                r0.setVisibility(r12)
                android.widget.ImageView r0 = r13.f218056f
                r0.setVisibility(r1)
            L_0x0331:
                r0 = 1
            L_0x0332:
                com.tencent.mm.message.l$b$a r4 = r5.f195554b
                if (r4 == 0) goto L_0x033c
                int r4 = r4.f195660g
                if (r4 == 0) goto L_0x033c
                r4 = 1
                goto L_0x033d
            L_0x033c:
                r4 = 0
            L_0x033d:
                if (r4 == 0) goto L_0x0345
                android.widget.LinearLayout r0 = r13.f218062i
                r0.setVisibility(r1)
                r0 = 0
            L_0x0345:
                android.widget.LinearLayout r4 = r13.f218062i
                r6 = 2131234067(0x7f080d13, float:1.808429E38)
                r4.setBackgroundResource(r6)
                com.tencent.mm.ui.MMImageView r4 = r13.f218048b
                r4.setVisibility(r12)
                boolean r4 = r5.mo93553p()
                r7 = 48
                r1 = 36
                r2 = 33
                r6 = 44
                r3 = 3
                if (r4 != 0) goto L_0x03e2
                boolean r4 = r8.f217197d
                if (r4 == 0) goto L_0x03e2
                int r4 = r5.f195582i
                if (r4 == r2) goto L_0x0396
                if (r4 == r1) goto L_0x0396
                if (r4 == r6) goto L_0x0396
                if (r4 == r7) goto L_0x0396
                java.lang.String r4 = r39.mo108765s2()
                boolean r4 = com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.C74247d.m88512b(r4)
                if (r4 != 0) goto L_0x0396
                di3.d r4 = di3.C86312j.m106911c(r27)
                gt.k r4 = (p158gt.C98201k) r4
                gt.m r4 = r4.mo137277xi()
                java.lang.String r2 = r39.mo108765s2()
                android.app.Activity r19 = r38.mo91565f()
                float r7 = kg3.C76577a.m92156g(r19)
                com.tencent.mm.modelimage.m r4 = (com.tencent.p014mm.modelimage.C92839m) r4
                android.graphics.Bitmap r2 = r4.mo127188jo(r2, r7, r12)
                goto L_0x0397
            L_0x0396:
                r2 = 0
            L_0x0397:
                if (r2 == 0) goto L_0x03b4
                boolean r4 = r2.isRecycled()
                if (r4 != 0) goto L_0x03b4
                android.app.Activity r4 = r38.mo91565f()
                r7 = 1
                int r4 = kg3.C76577a.m92151b(r4, r7)
                float r4 = (float) r4
                android.graphics.Bitmap r4 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getRoundedCornerBitmap(r2, r12, r4)
                com.tencent.mm.ui.MMImageView r7 = r13.f218048b
                r7.setImageBitmap(r4)
                r4 = 0
                goto L_0x03b5
            L_0x03b4:
                r4 = 1
            L_0x03b5:
                int r7 = com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.m88491b(r15, r5)
                if (r7 != r3) goto L_0x03e0
                android.widget.LinearLayout r7 = r13.f218087x
                android.view.ViewTreeObserver r7 = r7.getViewTreeObserver()
                com.tencent.mm.ui.chatting.viewitems.u$f$$c r3 = new com.tencent.mm.ui.chatting.viewitems.u$f$$c
                r3.<init>(r8, r13, r10, r2)
                r7.addOnPreDrawListener(r3)
                boolean r2 = com.tencent.p014mm.p136ui.C85875k4.m106211z()
                if (r2 == 0) goto L_0x03d8
                android.widget.LinearLayout r2 = r13.f218062i
                r3 = 2131234067(0x7f080d13, float:1.808429E38)
                r2.setBackgroundResource(r3)
                goto L_0x03e0
            L_0x03d8:
                android.widget.LinearLayout r2 = r13.f218062i
                r3 = 2131231680(0x7f0803c0, float:1.8079448E38)
                r2.setBackgroundResource(r3)
            L_0x03e0:
                r2 = r4
                goto L_0x03f3
            L_0x03e2:
                com.tencent.mm.ui.MMImageView r2 = r13.f218048b
                android.content.res.Resources r3 = r38.mo91572m()
                r4 = 2131234285(0x7f080ded, float:1.8084731E38)
                android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeResource(r3, r4)
                r2.setImageBitmap(r3)
                r2 = 0
            L_0x03f3:
                java.lang.String r3 = r5.f195642x
                if (r3 == 0) goto L_0x0411
                int r3 = r3.length()
                if (r3 != 0) goto L_0x03fe
                goto L_0x0411
            L_0x03fe:
                android.widget.TextView r3 = r13.f218078q
                r3.setVisibility(r12)
                android.widget.TextView r3 = r13.f218078q
                java.lang.String r4 = r5.f195642x
                com.tencent.mm.ui.chatting.viewitems.t8 r4 = com.tencent.p014mm.p136ui.chatting.viewitems.C74243t8.m88488a(r4)
                r8.mo103073G(r10, r3, r4)
                r4 = 8
                goto L_0x0418
            L_0x0411:
                android.widget.TextView r3 = r13.f218078q
                r4 = 8
                r3.setVisibility(r4)
            L_0x0418:
                android.widget.ImageView r3 = r13.f218076p
                r7 = 0
                r3.setOnClickListener(r7)
                android.widget.LinearLayout r3 = r13.f218082s
                r3.setVisibility(r12)
                android.widget.ImageView r3 = r13.f218066k
                r3.setVisibility(r4)
                android.widget.LinearLayout r3 = r13.f218084u
                r3.setVisibility(r12)
                android.view.ViewGroup r3 = r13.f218083t
                r3.setVisibility(r4)
                int r3 = com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.m88491b(r15, r5)
                int r4 = r5.f195582i
                r7 = 66
                if (r4 != r7) goto L_0x0451
                java.lang.String r3 = r5.f195573f2
                boolean r3 = android.text.TextUtils.isEmpty(r3)
                if (r3 == 0) goto L_0x044f
                java.lang.String r3 = r5.f195577g2
                boolean r3 = android.text.TextUtils.isEmpty(r3)
                if (r3 != 0) goto L_0x044d
                goto L_0x044f
            L_0x044d:
                r3 = 5
                goto L_0x0451
            L_0x044f:
                r3 = 33
            L_0x0451:
                android.view.View r4 = r9.convertView
                com.tencent.mm.ui.chatting.viewitems.u$f$$d r7 = new com.tencent.mm.ui.chatting.viewitems.u$f$$d
                r7.<init>(r8, r15, r3)
                zp3.C23564m.m28138h(r4, r7)
                java.lang.String r4 = "file://"
                if (r3 == 0) goto L_0x13fe
                r12 = 10
                if (r3 == r12) goto L_0x135e
                r12 = 13
                if (r3 == r12) goto L_0x12ed
                r12 = 16
                r7 = 240(0xf0, float:3.36E-43)
                if (r3 == r1) goto L_0x11bc
                r1 = 40
                if (r3 == r1) goto L_0x11aa
                if (r3 == r6) goto L_0x1195
                r1 = 48
                if (r3 == r1) goto L_0x10d0
                r1 = 97
                if (r3 == r1) goto L_0x0f91
                r1 = 3
                if (r3 == r1) goto L_0x0ea2
                r1 = 4
                if (r3 == r1) goto L_0x0e06
                r1 = 5
                if (r3 == r1) goto L_0x0ce2
                r0 = 6
                if (r3 == r0) goto L_0x0c4b
                r0 = 7
                if (r3 == r0) goto L_0x0bd1
                r0 = 15
                if (r3 == r0) goto L_0x0af1
                if (r3 == r12) goto L_0x0a6f
                r0 = 19
                if (r3 == r0) goto L_0x0a65
                r0 = 20
                if (r3 == r0) goto L_0x09ef
                r0 = 33
                if (r3 == r0) goto L_0x07ca
                r0 = 34
                if (r3 == r0) goto L_0x0679
                r0 = 83
                if (r3 == r0) goto L_0x0630
                r0 = 84
                if (r3 == r0) goto L_0x0630
                switch(r3) {
                    case 24: goto L_0x05a4;
                    case 25: goto L_0x04b2;
                    case 26: goto L_0x0f91;
                    case 27: goto L_0x0f91;
                    default: goto L_0x04ab;
                }
            L_0x04ab:
                r1 = r13
                r6 = r15
                r9 = 0
                r15 = r23
                goto L_0x11a6
            L_0x04b2:
                java.lang.String r0 = r5.f195570f
                if (r0 == 0) goto L_0x04c5
                int r0 = r0.length()
                if (r0 <= 0) goto L_0x04c5
                com.tencent.mm.ui.widget.MMNeat7extView r0 = r13.f218050c
                r1 = 0
                r0.setVisibility(r1)
                r3 = 8
                goto L_0x04cd
            L_0x04c5:
                r1 = 0
                com.tencent.mm.ui.widget.MMNeat7extView r0 = r13.f218050c
                r3 = 8
                r0.setVisibility(r3)
            L_0x04cd:
                android.widget.TextView r0 = r13.f218052d
                r0.setVisibility(r1)
                android.widget.TextView r0 = r13.f218064j
                r0.setVisibility(r3)
                android.widget.ImageView r0 = r13.f218076p
                r0.setVisibility(r3)
                android.widget.ImageView r0 = r13.f218066k
                r3 = 4
                r0.setVisibility(r3)
                android.widget.TextView r0 = r13.f218052d
                r9 = 2
                r0.setMaxLines(r9)
                if (r2 == 0) goto L_0x0551
                java.lang.String r0 = r5.f195646y
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                if (r0 != 0) goto L_0x0516
                k60.e r0 = k60.C99101e.f290570a
                k60.a r0 = r0.mo138479a()
                java.lang.String r3 = r5.f195646y
                l60.b r0 = r0.mo85955a(r3)
                n60.f$a r3 = new n60.f$a
                r3.<init>()
                r7 = 1
                r3.mo139399b(r7)
                n60.f r3 = r3.mo139398a()
                r0.mo138758f(r3)
                com.tencent.mm.ui.MMImageView r3 = r13.f218048b
                l60.a r0 = (l60.C99342a) r0
                r0.mo85954d(r3)
                goto L_0x0551
            L_0x0516:
                di3.d r0 = di3.C86312j.m106911c(r27)
                gt.k r0 = (p158gt.C98201k) r0
                gt.m r0 = r0.mo137277xi()
                java.lang.String r17 = r39.mo108765s2()
                r18 = 1
                android.app.Activity r3 = r38.mo91565f()
                float r19 = kg3.C76577a.m92156g(r3)
                r20 = 0
                r21 = 1
                r16 = r0
                com.tencent.mm.modelimage.m r16 = (com.tencent.p014mm.modelimage.C92839m) r16
                android.graphics.Bitmap r0 = r16.mo127167Lo(r17, r18, r19, r20, r21)
                if (r0 == 0) goto L_0x0549
                boolean r3 = r0.isRecycled()
                if (r3 == 0) goto L_0x0543
                goto L_0x0549
            L_0x0543:
                com.tencent.mm.ui.MMImageView r3 = r13.f218048b
                r3.setImageBitmap(r0)
                goto L_0x0551
            L_0x0549:
                com.tencent.mm.ui.MMImageView r0 = r13.f218048b
                r3 = 2131755119(0x7f10006f, float:1.9141108E38)
                r0.setImageResource(r3)
            L_0x0551:
                com.tencent.mm.ui.chatting.viewitems.t8 r0 = new com.tencent.mm.ui.chatting.viewitems.t8
                r16 = 0
                java.lang.String r17 = r38.mo91576q()
                java.lang.String r3 = r5.f195634v
                java.lang.String r7 = r5.f195638w
                java.lang.String r14 = r5.f195570f
                int r12 = r5.f195502J1
                java.lang.String r11 = r5.f195505K1
                java.lang.String r1 = r5.f195508L1
                java.lang.String r6 = r5.f195586j
                r19 = 0
                java.lang.String r20 = ""
                r22 = r11
                r11 = r0
                r21 = r12
                r9 = 0
                r12 = r39
                r28 = r13
                r13 = r19
                r34 = r23
                r23 = r14
                r14 = r28
                r15 = r20
                r18 = r3
                r19 = r7
                r20 = r23
                r23 = r1
                r24 = r6
                r11.<init>((com.tencent.p014mm.storage.C72963f4) r12, (boolean) r13, (uj3.C78208e) r14, (java.lang.String) r15, (boolean) r16, (java.lang.String) r17, (java.lang.String) r18, (java.lang.String) r19, (java.lang.String) r20, (int) r21, (java.lang.String) r22, (java.lang.String) r23, (java.lang.String) r24)
                java.lang.String r1 = r5.f195570f
                r0.f217982p = r1
                r1 = r28
                android.widget.FrameLayout r3 = r1.f218086w
                r3.setTag(r0)
                android.widget.FrameLayout r3 = r1.f218086w
                com.tencent.mm.ui.chatting.j2 r6 = r8.mo103262o0(r10)
                r3.setOnClickListener(r6)
                r6 = r39
                goto L_0x0bcc
            L_0x05a4:
                r1 = r13
                r34 = r23
                r9 = 0
                com.tencent.mm.ui.widget.MMNeat7extView r0 = r1.f218050c
                r3 = 8
                r0.setVisibility(r3)
                android.widget.TextView r0 = r1.f218064j
                r0.setVisibility(r9)
                java.lang.String r0 = r5.f195570f
                if (r0 == 0) goto L_0x05e2
                java.lang.String r0 = r0.trim()
                int r0 = r0.length()
                if (r0 <= 0) goto L_0x05e2
                android.widget.TextView r0 = r1.f218064j
                java.lang.Class<ny.h> r3 = p629ny.C76979h.class
                di3.d r3 = di3.C86312j.m106911c(r3)
                ny.h r3 = (p629ny.C76979h) r3
                android.widget.TextView r6 = r1.f218064j
                android.content.Context r6 = r6.getContext()
                java.lang.String r7 = r5.f195570f
                android.widget.TextView r11 = r1.f218064j
                float r11 = r11.getTextSize()
                android.text.SpannableString r3 = r3.yp0(r6, r7, r11)
                r0.setText(r3)
                goto L_0x060a
            L_0x05e2:
                android.widget.TextView r0 = r1.f218064j
                java.lang.Class<ny.h> r3 = p629ny.C76979h.class
                di3.d r3 = di3.C86312j.m106911c(r3)
                ny.h r3 = (p629ny.C76979h) r3
                android.widget.TextView r6 = r1.f218064j
                android.content.Context r6 = r6.getContext()
                android.content.Context r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                r11 = 2131825821(0x7f11149d, float:1.9284509E38)
                java.lang.String r7 = r7.getString(r11)
                android.widget.TextView r11 = r1.f218064j
                float r11 = r11.getTextSize()
                android.text.SpannableString r3 = r3.yp0(r6, r7, r11)
                r0.setText(r3)
            L_0x060a:
                android.widget.TextView r0 = r1.f218052d
                r3 = 3
                r0.setMaxLines(r3)
                android.widget.ImageView r0 = r1.f218076p
                r3 = 8
                r0.setVisibility(r3)
                android.widget.ImageView r0 = r1.f218066k
                r6 = 4
                r0.setVisibility(r6)
                if (r2 == 0) goto L_0x0629
                com.tencent.mm.ui.MMImageView r0 = r1.f218048b
                r0.setVisibility(r3)
                android.widget.RelativeLayout r0 = r1.f218085v
                r0.setVisibility(r3)
            L_0x0629:
                r6 = r39
                com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.C74255e.m88524g(r10, r1, r5, r6, r2)
                goto L_0x0aed
            L_0x0630:
                r1 = r13
                r6 = r15
                r34 = r23
                r9 = 0
                com.tencent.mm.ui.MMImageView r0 = r1.f218048b
                r3 = 2131233367(0x7f080a57, float:1.808287E38)
                r0.setImageResource(r3)
                com.tencent.mm.ui.widget.MMNeat7extView r0 = r1.f218050c
                r3 = 8
                r0.setVisibility(r3)
                java.lang.String r0 = r5.f195570f
                if (r0 == 0) goto L_0x0665
                int r0 = r0.length()
                if (r0 <= 0) goto L_0x0665
                android.widget.TextView r0 = r1.f218064j
                r3 = 3
                r0.setMaxLines(r3)
                android.widget.TextView r0 = r1.f218064j
                r0.setVisibility(r9)
                android.widget.TextView r0 = r1.f218064j
                java.lang.String r3 = r5.mo93550m()
                r0.setText(r3)
                r3 = 8
                goto L_0x066c
            L_0x0665:
                android.widget.TextView r0 = r1.f218064j
                r3 = 8
                r0.setVisibility(r3)
            L_0x066c:
                android.widget.ImageView r0 = r1.f218076p
                r0.setVisibility(r3)
                android.widget.ImageView r0 = r1.f218066k
                r3 = 4
                r0.setVisibility(r3)
                goto L_0x0aed
            L_0x0679:
                r1 = r13
                r6 = r15
                r34 = r23
                r9 = 0
                java.lang.String r0 = r5.f195570f
                if (r0 == 0) goto L_0x06c5
                int r0 = r0.length()
                if (r0 <= 0) goto L_0x06c5
                com.tencent.mm.ui.widget.MMNeat7extView r0 = r1.f218050c
                r0.setVisibility(r9)
                java.lang.String r0 = r5.f195552a1
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                if (r0 != 0) goto L_0x06b0
                com.tencent.mm.ui.widget.MMNeat7extView r0 = r1.f218050c
                java.lang.String r3 = r5.f195552a1
                android.app.Activity r7 = r38.mo91565f()
                android.content.res.Resources r7 = r7.getResources()
                r11 = 2131101252(0x7f060644, float:1.7814908E38)
                int r7 = r7.getColor(r11)
                int r3 = com.tencent.p014mm.sdk.platformtools.Util.convertStringToRGB(r3, r7)
                r0.setTextColor(r3)
                goto L_0x06cc
            L_0x06b0:
                com.tencent.mm.ui.widget.MMNeat7extView r0 = r1.f218050c
                android.app.Activity r3 = r38.mo91565f()
                android.content.res.Resources r3 = r3.getResources()
                r7 = 2131101252(0x7f060644, float:1.7814908E38)
                int r3 = r3.getColor(r7)
                r0.setTextColor(r3)
                goto L_0x06cc
            L_0x06c5:
                com.tencent.mm.ui.widget.MMNeat7extView r0 = r1.f218050c
                r3 = 8
                r0.setVisibility(r3)
            L_0x06cc:
                android.widget.TextView r0 = r1.f218052d
                r3 = 2
                r0.setMaxLines(r3)
                android.widget.TextView r0 = r1.f218052d
                r0.setVisibility(r9)
                java.lang.String r0 = r5.f195556b1
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                if (r0 != 0) goto L_0x06fa
                android.widget.TextView r0 = r1.f218052d
                java.lang.String r3 = r5.f195556b1
                android.app.Activity r7 = r38.mo91565f()
                android.content.res.Resources r7 = r7.getResources()
                r11 = 2131100884(0x7f0604d4, float:1.7814162E38)
                int r7 = r7.getColor(r11)
                int r3 = com.tencent.p014mm.sdk.platformtools.Util.convertStringToRGB(r3, r7)
                r0.setTextColor(r3)
                goto L_0x070e
            L_0x06fa:
                android.widget.TextView r0 = r1.f218052d
                android.app.Activity r3 = r38.mo91565f()
                android.content.res.Resources r3 = r3.getResources()
                r7 = 2131100884(0x7f0604d4, float:1.7814162E38)
                int r3 = r3.getColor(r7)
                r0.setTextColor(r3)
            L_0x070e:
                android.widget.TextView r0 = r1.f218064j
                r3 = 8
                r0.setVisibility(r3)
                android.widget.ImageView r0 = r1.f218066k
                r7 = 4
                r0.setVisibility(r7)
                android.widget.ImageView r0 = r1.f218076p
                r0.setVisibility(r3)
                android.widget.LinearLayout r0 = r1.f218062i
                r0.setVisibility(r9)
                android.widget.TextView r0 = r1.f218054e
                r0.setVisibility(r9)
                java.lang.String r0 = r5.f195540W0
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                if (r0 != 0) goto L_0x073a
                android.widget.TextView r0 = r1.f218054e
                java.lang.String r3 = r5.f195540W0
                r0.setText(r3)
                goto L_0x0742
            L_0x073a:
                android.widget.TextView r0 = r1.f218054e
                r3 = 2131823529(0x7f110ba9, float:1.927986E38)
                r0.setText(r3)
            L_0x0742:
                boolean r0 = r8.f217197d
                if (r0 == 0) goto L_0x07b8
                di3.d r0 = di3.C86312j.m106911c(r27)
                gt.k r0 = (p158gt.C98201k) r0
                gt.m r0 = r0.mo137277xi()
                java.lang.String r3 = r39.mo108765s2()
                android.app.Activity r7 = r38.mo91565f()
                float r7 = kg3.C76577a.m92156g(r7)
                com.tencent.mm.modelimage.m r0 = (com.tencent.p014mm.modelimage.C92839m) r0
                android.graphics.Bitmap r0 = r0.mo127188jo(r3, r7, r9)
                if (r0 == 0) goto L_0x077a
                boolean r3 = r0.isRecycled()
                if (r3 != 0) goto L_0x077a
                int r3 = r0.getWidth()
                r7 = 2
                int r3 = r3 / r7
                float r3 = (float) r3
                android.graphics.Bitmap r3 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getRoundedCornerBitmap(r0, r9, r3)
                com.tencent.mm.ui.MMImageView r7 = r1.f218048b
                r7.setImageBitmap(r3)
            L_0x077a:
                java.lang.String r3 = r5.f195549Z0
                boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
                if (r3 != 0) goto L_0x07a8
                gc0.a r0 = gc0.C20828a.m22825b()
                java.lang.String r3 = r5.f195549Z0
                android.widget.ImageView r7 = new android.widget.ImageView
                android.app.Activity r11 = r38.mo91565f()
                r7.<init>(r11)
                hc0.c$b r11 = new hc0.c$b
                r11.<init>()
                r12 = 1
                r11.mo32677l(r12)
                hc0.c r11 = r11.mo32666a()
                com.tencent.mm.ui.chatting.viewitems.u$f$$j r12 = new com.tencent.mm.ui.chatting.viewitems.u$f$$j
                r12.<init>(r8, r1, r10)
                r0.mo32520i(r3, r7, r11, r12)
                goto L_0x0aed
            L_0x07a8:
                android.widget.LinearLayout r3 = r1.f218087x
                android.view.ViewTreeObserver r3 = r3.getViewTreeObserver()
                com.tencent.mm.ui.chatting.viewitems.u$f$$k r7 = new com.tencent.mm.ui.chatting.viewitems.u$f$$k
                r7.<init>(r8, r1, r10, r0)
                r3.addOnPreDrawListener(r7)
                goto L_0x0aed
            L_0x07b8:
                com.tencent.mm.ui.MMImageView r0 = r1.f218048b
                android.content.res.Resources r3 = r38.mo91572m()
                r7 = 2131234285(0x7f080ded, float:1.8084731E38)
                android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeResource(r3, r7)
                r0.setImageBitmap(r3)
                goto L_0x0aed
            L_0x07ca:
                r1 = r13
                r6 = r15
                r34 = r23
                r9 = 0
                com.tencent.p014mm.p136ui.chatting.viewitems.C85822j6.m106040a(r1, r5, r3)
                di3.d r0 = di3.C86312j.m106911c(r20)
                kr0.w0 r0 = (kr0.C76629w0) r0
                java.lang.String r3 = r5.f195573f2
                com.tencent.mm.plugin.appbrand.config.WxaAttributes r0 = r0.mo106879N2(r3)
                java.lang.String r3 = r5.f195573f2
                kb0.C88132b.m109732c(r3, r0, r5)
                int r3 = r5.f195581h2
                r11 = 1
                if (r3 == r11) goto L_0x092e
                r11 = 2
                if (r3 == r11) goto L_0x080f
                r11 = 3
                if (r3 == r11) goto L_0x080f
                android.widget.LinearLayout r0 = r1.f218062i
                r0.setVisibility(r9)
                android.widget.ImageView r0 = r1.f218056f
                r0.setVisibility(r9)
                android.widget.ImageView r0 = r1.f218056f
                r3 = 0
                r0.setBackground(r3)
                android.widget.ImageView r0 = r1.f218056f
                r3 = 2131755171(0x7f1000a3, float:1.9141214E38)
                r0.setImageResource(r3)
                android.widget.TextView r0 = r1.f218054e
                com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.m88504o(r0, r5)
                r15 = r34
                goto L_0x11a6
            L_0x080f:
                android.widget.FrameLayout r3 = r1.f218086w
                android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
                if (r3 == 0) goto L_0x0825
                android.widget.FrameLayout r3 = r1.f218086w
                android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
                r11 = -2
                r3.width = r11
                android.widget.FrameLayout r3 = r1.f218086w
                r3.requestLayout()
            L_0x0825:
                if (r0 == 0) goto L_0x082a
                java.lang.String r3 = r0.field_nickname
                goto L_0x082c
            L_0x082a:
                java.lang.String r3 = r5.f195638w
            L_0x082c:
                if (r0 == 0) goto L_0x0831
                java.lang.String r11 = r0.field_smallHeadURL
                goto L_0x0833
            L_0x0831:
                java.lang.String r11 = r5.f195471B2
            L_0x0833:
                android.widget.LinearLayout r13 = r1.f218087x
                r14 = 8
                r13.setVisibility(r14)
                android.widget.LinearLayout r13 = r1.f218029I
                r13.setVisibility(r9)
                android.widget.LinearLayout r13 = r1.f218023C
                r13.setVisibility(r14)
                android.widget.LinearLayout r13 = r1.f218038R
                r13.setVisibility(r14)
                android.widget.TextView r13 = r1.f218027G
                r13.setText(r3)
                android.widget.TextView r3 = r1.f218028H
                com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.m88504o(r3, r5)
                gc0.a r3 = gc0.C20828a.m22825b()
                android.widget.ImageView r13 = r1.f218026F
                hc0.c r14 = com.tencent.p014mm.p136ui.chatting.viewitems.C6808o3.f24365a
                r3.mo32519h(r11, r13, r14)
                di3.d r3 = di3.C86312j.m106911c(r27)
                gt.k r3 = (p158gt.C98201k) r3
                gt.m r3 = r3.mo137277xi()
                java.lang.String r11 = r39.mo108765s2()
                com.tencent.mm.modelimage.m r3 = (com.tencent.p014mm.modelimage.C92839m) r3
                java.lang.String r3 = r3.h30(r11)
                android.widget.ImageView r11 = r1.f218030J
                r13 = 0
                r11.setImageBitmap(r13)
                android.widget.ImageView r11 = r1.f218030J
                r13 = 4
                r11.setVisibility(r13)
                r11 = 1
                boolean r13 = com.tencent.p014mm.p136ui.chatting.viewitems.C85822j6.m106042c(r5, r0, r11)
                if (r13 == 0) goto L_0x089e
                android.widget.ImageView r0 = r1.f218036P
                r0.setVisibility(r9)
                android.widget.ImageView r0 = r1.f218034N
                r11 = 8
                r0.setVisibility(r11)
                android.widget.ImageView r0 = r1.f218036P
                com.tencent.p014mm.plugin.appbrand.p026ui.C84704w4.m104354a(r0)
                com.tencent.p014mm.p136ui.chatting.component.C19729d.m21409b(r10, r6, r9)
                goto L_0x08d0
            L_0x089e:
                boolean r0 = com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.m88498i(r5, r0, r12)
                if (r0 == 0) goto L_0x08c2
                boolean r0 = com.tencent.p014mm.p136ui.chatting.viewitems.C85822j6.m106041b(r5)
                if (r0 == 0) goto L_0x08c2
                android.widget.ImageView r0 = r1.f218034N
                r0.setVisibility(r9)
                android.widget.ImageView r0 = r1.f218036P
                r11 = 8
                r0.setVisibility(r11)
                android.widget.ImageView r0 = r1.f218034N
                com.tencent.p014mm.plugin.appbrand.p026ui.C84711y4.m104367a(r0)
                r0 = 1
                com.tencent.p014mm.p136ui.chatting.component.C19729d.m21409b(r10, r6, r0)
                goto L_0x08d0
            L_0x08c2:
                r11 = 8
                android.widget.ImageView r0 = r1.f218036P
                r0.setVisibility(r11)
                android.widget.ImageView r0 = r1.f218034N
                r0.setVisibility(r11)
            L_0x08d0:
                boolean r0 = com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.m88503n(r6, r5, r10)
                if (r0 == 0) goto L_0x08f6
                android.widget.LinearLayout r0 = r1.f218075o0
                com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.m88490a(r0, r9)
                java.lang.String r0 = r39.mo108763q2()
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                android.widget.LinearLayout r11 = r1.f218075o0
                r11.setTag(r6)
                android.widget.LinearLayout r11 = r1.f218075o0
                com.tencent.mm.ui.chatting.viewitems.u$f$$f r12 = new com.tencent.mm.ui.chatting.viewitems.u$f$$f
                r12.<init>(r8, r1, r10)
                r11.setOnClickListener(r12)
                com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.m88507r(r0, r1, r10)
                goto L_0x08fd
            L_0x08f6:
                android.widget.LinearLayout r0 = r1.f218075o0
                r11 = 8
                com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.m88490a(r0, r11)
            L_0x08fd:
                java.lang.Class<com.tencent.mm.message.a> r0 = com.tencent.p014mm.message.C80995a.class
                com.tencent.mm.message.g r0 = r5.mo93555w(r0)
                com.tencent.mm.message.a r0 = (com.tencent.p014mm.message.C80995a) r0
                if (r0 == 0) goto L_0x090e
                int r0 = r0.f237911t
                r11 = 1
                if (r0 != r11) goto L_0x090e
                r0 = 1
                goto L_0x090f
            L_0x090e:
                r0 = 0
            L_0x090f:
                lb0.b r11 = lb0.C88394b.m110233l()
                com.tencent.mm.ui.chatting.viewitems.u$f$$g r12 = new com.tencent.mm.ui.chatting.viewitems.u$f$$g
                r12.<init>(r8, r1, r0, r10)
                java.lang.String r0 = com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.m88499j(r3)
                di3.d r3 = di3.C86312j.m106911c(r25)
                kb0.i r3 = (kb0.C76529i) r3
                r13 = 192(0xc0, float:2.69E-43)
                lb0.b$h r3 = r3.Ij0(r7, r13)
                r7 = 0
                r11.mo122797p(r12, r0, r7, r3)
                goto L_0x0aed
            L_0x092e:
                if (r0 == 0) goto L_0x0933
                java.lang.String r3 = r0.field_nickname
                goto L_0x0935
            L_0x0933:
                java.lang.String r3 = r5.f195570f
            L_0x0935:
                if (r0 == 0) goto L_0x093a
                java.lang.String r7 = r0.field_smallHeadURL
                goto L_0x093b
            L_0x093a:
                r7 = 0
            L_0x093b:
                android.widget.LinearLayout r11 = r1.f218087x
                r12 = 8
                r11.setVisibility(r12)
                android.widget.LinearLayout r11 = r1.f218029I
                r11.setVisibility(r12)
                android.widget.LinearLayout r11 = r1.f218023C
                r11.setVisibility(r9)
                android.widget.TextView r11 = r1.f218025E
                r11.setText(r3)
                android.widget.LinearLayout r3 = r1.f218038R
                r3.setVisibility(r12)
                boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
                if (r3 == 0) goto L_0x098f
                di3.d r3 = di3.C86312j.m106911c(r27)
                gt.k r3 = (p158gt.C98201k) r3
                gt.m r3 = r3.mo137277xi()
                java.lang.String r7 = r39.mo108765s2()
                com.tencent.mm.modelimage.m r3 = (com.tencent.p014mm.modelimage.C92839m) r3
                java.lang.String r3 = r3.h30(r7)
                lb0.b r7 = lb0.C88394b.m110233l()
                android.widget.ImageView r11 = r1.f218024D
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                r12.append(r4)
                r12.append(r3)
                java.lang.String r3 = r12.toString()
                android.graphics.drawable.Drawable r12 = lb0.C88393a.m110230a()
                lb0.k r13 = lb0.C88431k.f255437d
                r7.mo122786b(r11, r3, r12, r13)
                goto L_0x099e
            L_0x098f:
                lb0.b r3 = lb0.C88394b.m110233l()
                android.widget.ImageView r11 = r1.f218024D
                android.graphics.drawable.Drawable r12 = lb0.C88393a.m110230a()
                lb0.k r13 = lb0.C88431k.f255437d
                r3.mo122786b(r11, r7, r12, r13)
            L_0x099e:
                r3 = 2
                boolean r7 = com.tencent.p014mm.p136ui.chatting.viewitems.C85822j6.m106042c(r5, r0, r3)
                if (r7 == 0) goto L_0x09be
                android.widget.ImageView r0 = r1.f218037Q
                r0.setVisibility(r9)
                android.widget.ImageView r0 = r1.f218035O
                r3 = 8
                r0.setVisibility(r3)
                android.widget.ImageView r0 = r1.f218037Q
                com.tencent.p014mm.plugin.appbrand.p026ui.C84704w4.m104354a(r0)
                com.tencent.p014mm.p136ui.chatting.component.C19729d.m21409b(r10, r6, r9)
                goto L_0x09ea
            L_0x09be:
                r3 = 8
                r7 = 15
                boolean r0 = com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.m88498i(r5, r0, r7)
                if (r0 == 0) goto L_0x09de
                android.widget.ImageView r0 = r1.f218035O
                r0.setVisibility(r9)
                android.widget.ImageView r0 = r1.f218037Q
                r0.setVisibility(r3)
                android.widget.ImageView r0 = r1.f218035O
                com.tencent.p014mm.plugin.appbrand.p026ui.C84711y4.m104367a(r0)
                r0 = 1
                com.tencent.p014mm.p136ui.chatting.component.C19729d.m21409b(r10, r6, r0)
                goto L_0x09ea
            L_0x09de:
                android.widget.ImageView r0 = r1.f218037Q
                r0.setVisibility(r3)
                android.widget.ImageView r0 = r1.f218035O
                r0.setVisibility(r3)
            L_0x09ea:
                com.tencent.p014mm.p136ui.chatting.viewitems.C85822j6.m106043d()
                goto L_0x0aed
            L_0x09ef:
                r1 = r13
                r6 = r15
                r34 = r23
                r9 = 0
                java.lang.String r0 = r5.f195570f
                if (r0 == 0) goto L_0x0a14
                int r0 = r0.length()
                if (r0 <= 0) goto L_0x0a14
                com.tencent.mm.ui.widget.MMNeat7extView r0 = r1.f218050c
                r0.setVisibility(r9)
                com.tencent.mm.ui.widget.MMNeat7extView r0 = r1.f218050c
                java.lang.String r3 = r5.mo93550m()
                r0.mo104279b(r3)
                android.widget.TextView r0 = r1.f218064j
                r3 = 8
                r0.setVisibility(r3)
                goto L_0x0a16
            L_0x0a14:
                r3 = 8
            L_0x0a16:
                android.widget.TextView r0 = r1.f218052d
                r7 = 4
                r0.setMaxLines(r7)
                android.widget.ImageView r0 = r1.f218066k
                r0.setVisibility(r7)
                android.widget.ImageView r0 = r1.f218076p
                r0.setVisibility(r3)
                if (r2 == 0) goto L_0x0aed
                di3.d r0 = di3.C86312j.m106911c(r27)
                gt.k r0 = (p158gt.C98201k) r0
                gt.m r0 = r0.mo137277xi()
                java.lang.String r18 = r39.mo108765s2()
                r19 = 1
                android.app.Activity r3 = r38.mo91565f()
                float r20 = kg3.C76577a.m92156g(r3)
                r21 = 0
                r22 = 1
                r17 = r0
                com.tencent.mm.modelimage.m r17 = (com.tencent.p014mm.modelimage.C92839m) r17
                android.graphics.Bitmap r0 = r17.mo127167Lo(r18, r19, r20, r21, r22)
                if (r0 == 0) goto L_0x0a5b
                boolean r3 = r0.isRecycled()
                if (r3 != 0) goto L_0x0a5b
                com.tencent.mm.ui.MMImageView r3 = r1.f218048b
                r3.setImageBitmap(r0)
                goto L_0x0aed
            L_0x0a5b:
                com.tencent.mm.ui.MMImageView r0 = r1.f218048b
                r3 = 2131755119(0x7f10006f, float:1.9141108E38)
                r0.setImageResource(r3)
                goto L_0x0aed
            L_0x0a65:
                r1 = r13
                r6 = r15
                r34 = r23
                r9 = 0
                com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.C74255e.m88525h(r10, r1, r5, r2)
                goto L_0x0aed
            L_0x0a6f:
                r1 = r13
                r6 = r15
                r34 = r23
                r9 = 0
                com.tencent.mm.ui.widget.MMNeat7extView r0 = r1.f218050c
                r0.setVisibility(r9)
                com.tencent.mm.ui.widget.MMNeat7extView r0 = r1.f218050c
                java.lang.String r3 = r5.f195574g
                r0.mo104279b(r3)
                android.widget.TextView r0 = r1.f218052d
                java.lang.String r3 = r5.f195528S0
                r0.setText(r3)
                java.lang.String r0 = r5.f195570f
                if (r0 == 0) goto L_0x0aa0
                int r0 = r0.length()
                if (r0 <= 0) goto L_0x0aa0
                android.widget.TextView r0 = r1.f218064j
                r0.setVisibility(r9)
                android.widget.TextView r0 = r1.f218064j
                java.lang.String r3 = r5.f195570f
                r0.setText(r3)
                r3 = 8
                goto L_0x0aa7
            L_0x0aa0:
                android.widget.TextView r0 = r1.f218064j
                r3 = 8
                r0.setVisibility(r3)
            L_0x0aa7:
                android.widget.TextView r0 = r1.f218052d
                r7 = 4
                r0.setMaxLines(r7)
                android.widget.ImageView r0 = r1.f218066k
                r0.setVisibility(r7)
                android.widget.ImageView r0 = r1.f218076p
                r0.setVisibility(r3)
                if (r2 == 0) goto L_0x0aed
                di3.d r0 = di3.C86312j.m106911c(r27)
                gt.k r0 = (p158gt.C98201k) r0
                gt.m r0 = r0.mo137277xi()
                java.lang.String r18 = r39.mo108765s2()
                r19 = 1
                android.app.Activity r3 = r38.mo91565f()
                float r20 = kg3.C76577a.m92156g(r3)
                r21 = 0
                r22 = 1
                r17 = r0
                com.tencent.mm.modelimage.m r17 = (com.tencent.p014mm.modelimage.C92839m) r17
                android.graphics.Bitmap r0 = r17.mo127167Lo(r18, r19, r20, r21, r22)
                if (r0 == 0) goto L_0x0ae5
                com.tencent.mm.ui.MMImageView r3 = r1.f218048b
                r3.setImageBitmap(r0)
                goto L_0x0aed
            L_0x0ae5:
                com.tencent.mm.ui.MMImageView r0 = r1.f218048b
                r3 = 2131755119(0x7f10006f, float:1.9141108E38)
                r0.setImageResource(r3)
            L_0x0aed:
                r15 = r34
                goto L_0x1465
            L_0x0af1:
                r1 = r13
                r6 = r15
                r34 = r23
                r9 = 0
                java.lang.String r0 = r5.f195570f
                if (r0 == 0) goto L_0x0b08
                int r0 = r0.length()
                if (r0 <= 0) goto L_0x0b08
                com.tencent.mm.ui.widget.MMNeat7extView r0 = r1.f218050c
                r0.setVisibility(r9)
                r3 = 8
                goto L_0x0b0f
            L_0x0b08:
                com.tencent.mm.ui.widget.MMNeat7extView r0 = r1.f218050c
                r3 = 8
                r0.setVisibility(r3)
            L_0x0b0f:
                android.widget.TextView r0 = r1.f218052d
                r0.setVisibility(r9)
                android.widget.TextView r0 = r1.f218064j
                r0.setVisibility(r3)
                android.widget.ImageView r0 = r1.f218076p
                r0.setVisibility(r3)
                android.widget.ImageView r0 = r1.f218066k
                r3 = 4
                r0.setVisibility(r3)
                android.widget.TextView r0 = r1.f218052d
                r3 = 2
                r0.setMaxLines(r3)
                if (r2 == 0) goto L_0x0b90
                java.lang.String r0 = r5.f195646y
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                if (r0 != 0) goto L_0x0b58
                k60.e r0 = k60.C99101e.f290570a
                k60.a r0 = r0.mo138479a()
                java.lang.String r3 = r5.f195646y
                l60.b r0 = r0.mo85955a(r3)
                n60.f$a r3 = new n60.f$a
                r3.<init>()
                r7 = 1
                r3.mo139399b(r7)
                n60.f r3 = r3.mo139398a()
                r0.mo138758f(r3)
                com.tencent.mm.ui.MMImageView r3 = r1.f218048b
                l60.a r0 = (l60.C99342a) r0
                r0.mo85954d(r3)
                goto L_0x0b90
            L_0x0b58:
                di3.d r0 = di3.C86312j.m106911c(r27)
                gt.k r0 = (p158gt.C98201k) r0
                gt.m r0 = r0.mo137277xi()
                java.lang.String r12 = r39.mo108765s2()
                r13 = 1
                android.app.Activity r3 = r38.mo91565f()
                float r14 = kg3.C76577a.m92156g(r3)
                r15 = 0
                r16 = 1
                r11 = r0
                com.tencent.mm.modelimage.m r11 = (com.tencent.p014mm.modelimage.C92839m) r11
                android.graphics.Bitmap r0 = r11.mo127167Lo(r12, r13, r14, r15, r16)
                if (r0 == 0) goto L_0x0b88
                boolean r3 = r0.isRecycled()
                if (r3 == 0) goto L_0x0b82
                goto L_0x0b88
            L_0x0b82:
                com.tencent.mm.ui.MMImageView r3 = r1.f218048b
                r3.setImageBitmap(r0)
                goto L_0x0b90
            L_0x0b88:
                com.tencent.mm.ui.MMImageView r0 = r1.f218048b
                r3 = 2131755119(0x7f10006f, float:1.9141108E38)
                r0.setImageResource(r3)
            L_0x0b90:
                com.tencent.mm.ui.chatting.viewitems.t8 r0 = new com.tencent.mm.ui.chatting.viewitems.t8
                r13 = 0
                r16 = 0
                java.lang.String r3 = r5.f195570f
                java.lang.String r7 = r5.f195634v
                java.lang.String r15 = r5.f195638w
                java.lang.String r14 = r5.f195583i0
                java.lang.String r12 = r5.f195586j
                r23 = 0
                r24 = 0
                java.lang.String r17 = ""
                r11 = r0
                r22 = r12
                r12 = r39
                r21 = r14
                r14 = r1
                r19 = r15
                r15 = r17
                r17 = r3
                r18 = r7
                r20 = r3
                r11.<init>((com.tencent.p014mm.storage.C72963f4) r12, (boolean) r13, (uj3.C78208e) r14, (java.lang.String) r15, (boolean) r16, (java.lang.String) r17, (java.lang.String) r18, (java.lang.String) r19, (java.lang.String) r20, (java.lang.String) r21, (java.lang.String) r22, (boolean) r23, (boolean) r24)
                java.lang.String r3 = r5.f195570f
                r0.f217982p = r3
                android.widget.FrameLayout r3 = r1.f218086w
                r3.setTag(r0)
                android.widget.FrameLayout r3 = r1.f218086w
                com.tencent.mm.ui.chatting.l2 r7 = r8.mo103096n(r10)
                r3.setOnClickListener(r7)
            L_0x0bcc:
                r15 = r34
                r3 = 1
                goto L_0x1468
            L_0x0bd1:
                r1 = r13
                r6 = r15
                r34 = r23
                r9 = 0
                com.tencent.mm.ui.widget.MMNeat7extView r0 = r1.f218050c
                r3 = 8
                r0.setVisibility(r3)
                java.lang.String r0 = r5.f195570f
                if (r0 == 0) goto L_0x0c02
                java.lang.String r0 = r0.trim()
                int r0 = r0.length()
                if (r0 <= 0) goto L_0x0c02
                android.widget.TextView r0 = r1.f218064j
                r3 = 2
                r0.setMaxLines(r3)
                android.widget.TextView r0 = r1.f218064j
                r0.setVisibility(r9)
                android.widget.TextView r0 = r1.f218064j
                java.lang.String r3 = r5.mo93550m()
                r0.setText(r3)
                r3 = 8
                goto L_0x0c09
            L_0x0c02:
                android.widget.TextView r0 = r1.f218064j
                r3 = 8
                r0.setVisibility(r3)
            L_0x0c09:
                android.widget.TextView r0 = r1.f218052d
                r7 = 3
                r0.setMaxLines(r7)
                android.widget.ImageView r0 = r1.f218076p
                r0.setVisibility(r3)
                android.widget.ImageView r0 = r1.f218066k
                r3 = 4
                r0.setVisibility(r3)
                if (r2 == 0) goto L_0x0cdd
                di3.d r0 = di3.C86312j.m106911c(r26)
                ym.l r0 = (p763ym.C79138l) r0
                java.lang.String r3 = r5.f195562d
                android.app.Activity r7 = r38.mo91565f()
                float r7 = kg3.C76577a.m92156g(r7)
                r11 = 1
                android.graphics.Bitmap r0 = r0.mo74018ub(r3, r11, r7)
                if (r0 == 0) goto L_0x0c41
                boolean r3 = r0.isRecycled()
                if (r3 == 0) goto L_0x0c3a
                goto L_0x0c41
            L_0x0c3a:
                com.tencent.mm.ui.MMImageView r3 = r1.f218048b
                r3.setImageBitmap(r0)
                goto L_0x0cdd
            L_0x0c41:
                com.tencent.mm.ui.MMImageView r0 = r1.f218048b
                r3 = 2131755119(0x7f10006f, float:1.9141108E38)
                r0.setImageResource(r3)
                goto L_0x0cdd
            L_0x0c4b:
                r1 = r13
                r6 = r15
                r34 = r23
                r9 = 0
                java.lang.String r0 = r5.f195570f
                if (r0 == 0) goto L_0x0c68
                int r0 = r0.length()
                if (r0 <= 0) goto L_0x0c68
                com.tencent.mm.ui.widget.MMNeat7extView r0 = r1.f218050c
                r0.setVisibility(r9)
                com.tencent.mm.ui.widget.MMNeat7extView r0 = r1.f218050c
                r3 = 2
                r0.setMaxLines(r3)
                r3 = 8
                goto L_0x0c6f
            L_0x0c68:
                com.tencent.mm.ui.widget.MMNeat7extView r0 = r1.f218050c
                r3 = 8
                r0.setVisibility(r3)
            L_0x0c6f:
                android.widget.TextView r0 = r1.f218052d
                r0.setVisibility(r9)
                android.widget.TextView r0 = r1.f218064j
                r0.setVisibility(r3)
                android.widget.ImageView r0 = r1.f218076p
                r0.setVisibility(r3)
                android.widget.ImageView r0 = r1.f218066k
                r3 = 4
                r0.setVisibility(r3)
                android.widget.TextView r0 = r1.f218052d
                r3 = 2
                r0.setMaxLines(r3)
                android.widget.TextView r0 = r1.f218052d
                int r3 = r5.f195594l
                long r11 = (long) r3
                java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.getSizeKB(r11)
                r0.setText(r3)
                int r0 = r5.f195594l
                r3 = r32
                com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.C74255e.m88527j(r1, r3, r0)
                java.lang.Boolean r0 = java.lang.Boolean.TRUE
                java.lang.String r3 = r5.f195606o
                java.lang.String r7 = r5.f195570f
                com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.C74255e.m88526i(r1, r0, r6, r3, r7)
                if (r2 == 0) goto L_0x0cdd
                java.lang.String r0 = r5.f195602n
                boolean r0 = com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.C74247d.m88513c(r0)
                if (r0 == 0) goto L_0x0cb9
                com.tencent.mm.ui.MMImageView r0 = r1.f218048b
                r3 = 2131231074(0x7f080162, float:1.8078219E38)
                r0.setImageResource(r3)
                goto L_0x0cdd
            L_0x0cb9:
                java.lang.String r0 = r5.f195602n
                boolean r0 = com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.C74247d.m88514d(r0)
                if (r0 == 0) goto L_0x0cca
                com.tencent.mm.ui.MMImageView r0 = r1.f218048b
                r3 = 2131755116(0x7f10006c, float:1.9141102E38)
                r0.setImageResource(r3)
                goto L_0x0cdd
            L_0x0cca:
                com.tencent.mm.ui.MMImageView r0 = r1.f218048b
                java.lang.Class<wm.f> r3 = p262wm.C22923f.class
                di3.d r3 = di3.C86312j.m106911c(r3)
                wm.f r3 = (p262wm.C22923f) r3
                java.lang.String r7 = r5.f195602n
                int r3 = r3.mo35908u8(r7)
                r0.setImageResource(r3)
            L_0x0cdd:
                r3 = 2
                r11 = 50
                goto L_0x0aed
            L_0x0ce2:
                r1 = r13
                r6 = r15
                r34 = r23
                r9 = 0
                com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.m88497h(r11, r10, r6, r5)
                java.lang.Class<com.tencent.mm.message.f> r3 = com.tencent.p014mm.message.C68065f.class
                com.tencent.mm.message.g r3 = r5.mo93555w(r3)
                com.tencent.mm.message.f r3 = (com.tencent.p014mm.message.C68065f) r3
                if (r3 == 0) goto L_0x0d10
                int r7 = r3.f195417b
                boolean r7 = com.tencent.p014mm.message.C68065f.m80397f(r7)
                if (r7 == 0) goto L_0x0d10
                com.tencent.mm.plugin.brandservice.ui.timeline.preload.l r7 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40726l.f109414a
                java.lang.String r11 = r5.f195586j
                int r13 = r3.f195417b
                r7.mo63636e(r11, r13)
                int r7 = r3.f195417b
                if (r7 != r12) goto L_0x0d10
                com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.C74255e.m88523f(r10, r1, r5, r6, r2)
            L_0x0d0c:
                r11 = 50
                goto L_0x0e03
            L_0x0d10:
                if (r0 != 0) goto L_0x0d34
                boolean r0 = com.tencent.p014mm.p136ui.chatting.viewitems.C6805l4.m7093c(r5, r3)
                if (r0 == 0) goto L_0x0d34
                android.widget.LinearLayout r0 = r1.f218061h0
                r0.setVisibility(r9)
                android.widget.ImageView r0 = r1.f218071m0
                r0.setVisibility(r9)
                android.app.Activity r0 = r38.mo91565f()
                android.widget.ImageView r3 = r1.f218065j0
                android.widget.TextView r7 = r1.f218067k0
                com.tencent.p014mm.p136ui.chatting.viewitems.C6805l4.m7091a(r0, r5, r3, r7)
                android.widget.TextView r0 = r1.f218069l0
                r3 = r33
                com.tencent.p014mm.p136ui.chatting.viewitems.C6805l4.m7092b(r0, r5, r3)
            L_0x0d34:
                com.tencent.mm.ui.widget.MMNeat7extView r0 = r1.f218050c
                r3 = 8
                r0.setVisibility(r3)
                java.lang.String r0 = r5.f195570f
                if (r0 == 0) goto L_0x0d5a
                int r0 = r0.length()
                if (r0 <= 0) goto L_0x0d5a
                android.widget.TextView r0 = r1.f218064j
                r3 = 2
                r0.setMaxLines(r3)
                android.widget.TextView r0 = r1.f218064j
                r0.setVisibility(r9)
                android.widget.TextView r0 = r1.f218064j
                java.lang.String r3 = r5.mo93550m()
                r0.setText(r3)
                goto L_0x0d61
            L_0x0d5a:
                android.widget.TextView r0 = r1.f218064j
                r3 = 8
                r0.setVisibility(r3)
            L_0x0d61:
                android.widget.TextView r0 = r1.f218052d
                r3 = 3
                r0.setMaxLines(r3)
                java.lang.Class<u73.r0> r0 = u73.C90621r0.class
                com.tencent.mm.message.g r0 = r5.mo93555w(r0)
                u73.r0 r0 = (u73.C90621r0) r0
                if (r0 == 0) goto L_0x0d7b
                java.lang.String r0 = r0.f260345b
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                if (r0 != 0) goto L_0x0d7b
                r3 = 1
                goto L_0x0d7c
            L_0x0d7b:
                r3 = 0
            L_0x0d7c:
                if (r3 == 0) goto L_0x0d8c
                android.widget.ImageView r0 = r1.f218076p
                r0.setVisibility(r9)
                android.widget.ImageView r0 = r1.f218076p
                r3 = 2131235399(0x7f081247, float:1.808699E38)
                r0.setImageResource(r3)
                goto L_0x0d93
            L_0x0d8c:
                android.widget.ImageView r0 = r1.f218076p
                r3 = 8
                r0.setVisibility(r3)
            L_0x0d93:
                android.widget.ImageView r0 = r1.f218066k
                r3 = 4
                r0.setVisibility(r3)
                if (r2 == 0) goto L_0x0d0c
                hc0.c$b r0 = new hc0.c$b
                r0.<init>()
                r3 = 2131755119(0x7f10006f, float:1.9141108E38)
                r0.mo32670e(r3)
                r3 = 1
                r0.mo32669d(r3)
                java.lang.String r3 = p243tn.C14050a.m13404a()
                r0.mo32674i(r3)
                wd3.r r3 = new wd3.r
                r3.<init>()
                r0.mo32673h(r3)
                wd3.h r3 = new wd3.h
                r3.<init>()
                r0.mo32672g(r3)
                android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                r11 = 50
                int r3 = kg3.C76577a.m92151b(r3, r11)
                android.content.Context r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                int r7 = kg3.C76577a.m92151b(r7, r11)
                r0.mo32667b(r3, r7)
                r3 = 1
                r0.mo32668c(r3)
                r0.mo32675j(r3)
                android.content.Context r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                int r7 = kg3.C76577a.m92151b(r7, r3)
                float r3 = (float) r7
                r0.mo32676k(r3)
                gc0.a r3 = gc0.C20828a.m22825b()
                java.lang.String r7 = r5.f195646y
                boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
                if (r7 == 0) goto L_0x0df8
                java.lang.String r7 = r5.f195464A
                goto L_0x0dfa
            L_0x0df8:
                java.lang.String r7 = r5.f195646y
            L_0x0dfa:
                com.tencent.mm.ui.MMImageView r12 = r1.f218048b
                hc0.c r0 = r0.mo32666a()
                r3.mo32519h(r7, r12, r0)
            L_0x0e03:
                r3 = 2
                goto L_0x0aed
            L_0x0e06:
                r1 = r13
                r6 = r15
                r34 = r23
                r9 = 0
                r11 = 50
                java.lang.String r0 = r5.f195570f
                if (r0 == 0) goto L_0x0e1f
                int r0 = r0.length()
                if (r0 <= 0) goto L_0x0e1f
                com.tencent.mm.ui.widget.MMNeat7extView r0 = r1.f218050c
                r0.setVisibility(r9)
                r3 = 8
                goto L_0x0e26
            L_0x0e1f:
                com.tencent.mm.ui.widget.MMNeat7extView r0 = r1.f218050c
                r3 = 8
                r0.setVisibility(r3)
            L_0x0e26:
                android.widget.TextView r0 = r1.f218052d
                r0.setVisibility(r9)
                android.widget.TextView r0 = r1.f218064j
                r0.setVisibility(r3)
                android.widget.ImageView r0 = r1.f218076p
                r0.setVisibility(r9)
                android.widget.ImageView r0 = r1.f218076p
                r3 = 2131235399(0x7f081247, float:1.808699E38)
                r0.setImageResource(r3)
                android.widget.ImageView r0 = r1.f218066k
                r3 = 4
                r0.setVisibility(r3)
                android.widget.TextView r0 = r1.f218052d
                r3 = 2
                r0.setMaxLines(r3)
                if (r2 == 0) goto L_0x0aed
                hc0.c$b r0 = new hc0.c$b
                r0.<init>()
                r7 = 2131755119(0x7f10006f, float:1.9141108E38)
                r0.mo32670e(r7)
                r7 = 1
                r0.mo32669d(r7)
                android.content.Context r12 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                int r12 = kg3.C76577a.m92151b(r12, r11)
                android.content.Context r13 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                int r13 = kg3.C76577a.m92151b(r13, r11)
                r0.mo32667b(r12, r13)
                r0.mo32668c(r7)
                r0.mo32675j(r7)
                android.content.Context r12 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                int r12 = kg3.C76577a.m92151b(r12, r7)
                float r7 = (float) r12
                r0.mo32676k(r7)
                gc0.a r7 = gc0.C20828a.m22825b()
                java.lang.String r12 = r5.f195646y
                boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
                if (r12 == 0) goto L_0x0e8e
                java.lang.String r12 = r5.f195464A
                goto L_0x0e90
            L_0x0e8e:
                java.lang.String r12 = r5.f195646y
            L_0x0e90:
                com.tencent.mm.ui.MMImageView r13 = r1.f218048b
                hc0.c r0 = r0.mo32666a()
                r7.mo32519h(r12, r13, r0)
                android.widget.ImageView r0 = r1.f218076p
                r7 = 8
                r0.setVisibility(r7)
                goto L_0x0aed
            L_0x0ea2:
                r0 = r9
                r1 = r13
                r6 = r15
                r34 = r23
                r9 = 0
                r11 = 50
                r13 = 2
                java.lang.String r3 = r5.f195570f
                if (r3 == 0) goto L_0x0ed1
                int r3 = r3.length()
                if (r3 <= 0) goto L_0x0ed1
                com.tencent.mm.ui.widget.MMNeat7extView r3 = r1.f218050c
                r3.setVisibility(r9)
                com.tencent.mm.ui.widget.MMNeat7extView r3 = r1.f218050c
                android.app.Activity r7 = r38.mo91565f()
                android.content.res.Resources r7 = r7.getResources()
                r12 = 2131101837(0x7f06088d, float:1.7816095E38)
                int r7 = r7.getColor(r12)
                r3.setTextColor(r7)
                r7 = 8
                goto L_0x0ed8
            L_0x0ed1:
                com.tencent.mm.ui.widget.MMNeat7extView r3 = r1.f218050c
                r7 = 8
                r3.setVisibility(r7)
            L_0x0ed8:
                android.widget.TextView r3 = r1.f218052d
                r3.setVisibility(r9)
                android.widget.TextView r3 = r1.f218052d
                android.app.Activity r12 = r38.mo91565f()
                android.content.res.Resources r12 = r12.getResources()
                r14 = 2131101837(0x7f06088d, float:1.7816095E38)
                int r12 = r12.getColor(r14)
                r3.setTextColor(r12)
                android.widget.TextView r3 = r1.f218064j
                r3.setVisibility(r7)
                android.widget.ImageView r3 = r1.f218066k
                r7 = 4
                r3.setVisibility(r7)
                android.widget.ImageView r3 = r1.f218076p
                r3.setVisibility(r9)
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                long r14 = r39.getMsgId()
                r3.append(r14)
                java.lang.String r7 = "_msg"
                r3.append(r7)
                java.lang.String r3 = r3.toString()
                java.lang.String r0 = r0.playingMsgId
                boolean r0 = r3.equals(r0)
                if (r0 == 0) goto L_0x0f27
                android.widget.ImageView r0 = r1.f218076p
                r3 = 2131234209(0x7f080da1, float:1.8084577E38)
                r0.setImageResource(r3)
                goto L_0x0f2f
            L_0x0f27:
                android.widget.ImageView r0 = r1.f218076p
                r3 = 2131234211(0x7f080da3, float:1.8084581E38)
                r0.setImageResource(r3)
            L_0x0f2f:
                android.widget.TextView r0 = r1.f218052d
                r0.setMaxLines(r13)
                if (r2 == 0) goto L_0x0f62
                di3.d r0 = di3.C86312j.m106911c(r26)
                ym.l r0 = (p763ym.C79138l) r0
                java.lang.String r3 = r5.f195562d
                android.app.Activity r7 = r38.mo91565f()
                float r7 = kg3.C76577a.m92156g(r7)
                r12 = 1
                android.graphics.Bitmap r0 = r0.mo74018ub(r3, r12, r7)
                if (r0 == 0) goto L_0x0f5a
                boolean r3 = r0.isRecycled()
                if (r3 == 0) goto L_0x0f54
                goto L_0x0f5a
            L_0x0f54:
                com.tencent.mm.ui.MMImageView r3 = r1.f218048b
                r3.setImageBitmap(r0)
                goto L_0x0f62
            L_0x0f5a:
                com.tencent.mm.ui.MMImageView r0 = r1.f218048b
                r3 = 2131755090(0x7f100052, float:1.914105E38)
                r0.setImageResource(r3)
            L_0x0f62:
                com.tencent.mm.ui.chatting.viewitems.u$i r0 = new com.tencent.mm.ui.chatting.viewitems.u$i
                r0.<init>()
                long r14 = r39.getMsgId()
                r0.f218013b = r14
                java.lang.String r3 = r39.getContent()
                r0.f218015d = r3
                java.lang.String r3 = r39.mo108765s2()
                r0.f218014c = r3
                android.widget.ImageView r3 = r1.f218076p
                r3.setTag(r0)
                android.widget.ImageView r0 = r1.f218076p
                r15 = r34
                xi.d r3 = r10.mo91560a(r15)
                zj3.l r3 = (zj3.C79368l) r3
                com.tencent.mm.ui.u2 r3 = r3.mo108210s2()
                r0.setOnClickListener(r3)
                goto L_0x1465
            L_0x0f91:
                r1 = r13
                r6 = r15
                r15 = r23
                r9 = 0
                r11 = 50
                r13 = 2
                java.lang.String r0 = r5.f195570f
                if (r0 == 0) goto L_0x0fab
                int r0 = r0.length()
                if (r0 <= 0) goto L_0x0fab
                com.tencent.mm.ui.widget.MMNeat7extView r0 = r1.f218050c
                r0.setVisibility(r9)
                r3 = 8
                goto L_0x0fb2
            L_0x0fab:
                com.tencent.mm.ui.widget.MMNeat7extView r0 = r1.f218050c
                r3 = 8
                r0.setVisibility(r3)
            L_0x0fb2:
                android.widget.TextView r0 = r1.f218052d
                r0.setVisibility(r9)
                android.widget.TextView r0 = r1.f218064j
                r0.setVisibility(r3)
                android.widget.ImageView r0 = r1.f218076p
                r0.setVisibility(r3)
                android.widget.ImageView r0 = r1.f218066k
                r3 = 4
                r0.setVisibility(r3)
                android.widget.TextView r0 = r1.f218052d
                r0.setMaxLines(r13)
                if (r2 == 0) goto L_0x1035
                java.lang.String r0 = r5.f195646y
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                if (r0 != 0) goto L_0x0ffa
                k60.e r0 = k60.C99101e.f290570a
                k60.a r0 = r0.mo138479a()
                java.lang.String r3 = r5.f195646y
                l60.b r0 = r0.mo85955a(r3)
                n60.f$a r3 = new n60.f$a
                r3.<init>()
                r7 = 1
                r3.mo139399b(r7)
                n60.f r3 = r3.mo139398a()
                r0.mo138758f(r3)
                com.tencent.mm.ui.MMImageView r3 = r1.f218048b
                l60.a r0 = (l60.C99342a) r0
                r0.mo85954d(r3)
                goto L_0x1035
            L_0x0ffa:
                di3.d r0 = di3.C86312j.m106911c(r27)
                gt.k r0 = (p158gt.C98201k) r0
                gt.m r0 = r0.mo137277xi()
                java.lang.String r17 = r39.mo108765s2()
                r18 = 1
                android.app.Activity r3 = r38.mo91565f()
                float r19 = kg3.C76577a.m92156g(r3)
                r20 = 0
                r21 = 1
                r16 = r0
                com.tencent.mm.modelimage.m r16 = (com.tencent.p014mm.modelimage.C92839m) r16
                android.graphics.Bitmap r0 = r16.mo127167Lo(r17, r18, r19, r20, r21)
                if (r0 == 0) goto L_0x102d
                boolean r3 = r0.isRecycled()
                if (r3 == 0) goto L_0x1027
                goto L_0x102d
            L_0x1027:
                com.tencent.mm.ui.MMImageView r3 = r1.f218048b
                r3.setImageBitmap(r0)
                goto L_0x1035
            L_0x102d:
                com.tencent.mm.ui.MMImageView r0 = r1.f218048b
                r3 = 2131755119(0x7f10006f, float:1.9141108E38)
                r0.setImageResource(r3)
            L_0x1035:
                com.tencent.mm.ui.chatting.viewitems.t8 r0 = new com.tencent.mm.ui.chatting.viewitems.t8
                r0.<init>()
                r0.f212238a = r6
                r0.f217969c = r9
                r0.f217970d = r1
                r38.mo91576q()
                java.lang.String r3 = r5.f195634v
                r0.f217972f = r3
                java.lang.String r3 = r5.f195638w
                r0.f217973g = r3
                java.lang.String r3 = r5.f195570f
                r0.f217974h = r3
                int r3 = r5.f195582i
                r7 = 26
                if (r3 != r7) goto L_0x1077
                int r3 = r5.f195511M1
                r0.f217981o = r3
                java.lang.String r3 = r5.f195514N1
                r0.f217982p = r3
                java.lang.String r3 = r5.f195517O1
                r0.f217983q = r3
                java.lang.String r3 = r5.f195520P1
                r0.f217984r = r3
                java.lang.String r3 = r5.f195523Q1
                r0.f217985s = r3
                int r3 = r5.f195526R1
                r0.f217986t = r3
                android.widget.FrameLayout r3 = r1.f218086w
                com.tencent.mm.ui.chatting.m2 r7 = r8.mo103264q0(r10)
                r3.setOnClickListener(r7)
                goto L_0x10c6
            L_0x1077:
                r7 = 27
                if (r3 != r7) goto L_0x109d
                int r3 = r5.f195511M1
                r0.f217981o = r3
                java.lang.String r3 = r5.f195514N1
                r0.f217982p = r3
                java.lang.String r3 = r5.f195517O1
                r0.f217983q = r3
                java.lang.String r3 = r5.f195520P1
                r0.f217984r = r3
                java.lang.String r3 = r5.f195523Q1
                r0.f217985s = r3
                int r3 = r5.f195526R1
                r0.f217986t = r3
                android.widget.FrameLayout r3 = r1.f218086w
                com.tencent.mm.ui.chatting.k2 r7 = r8.mo103263p0(r10)
                r3.setOnClickListener(r7)
                goto L_0x10c6
            L_0x109d:
                r7 = 97
                if (r3 != r7) goto L_0x10c8
                int r3 = r5.f195511M1
                r0.f217981o = r3
                java.lang.String r3 = r5.f195514N1
                r0.f217982p = r3
                java.lang.String r3 = r5.f195517O1
                r0.f217983q = r3
                java.lang.String r3 = r5.f195520P1
                r0.f217984r = r3
                java.lang.String r3 = r5.f195523Q1
                r0.f217985s = r3
                int r3 = r5.f195526R1
                r0.f217986t = r3
                java.lang.String r3 = r5.f195529S1
                r0.f217987u = r3
                android.widget.FrameLayout r3 = r1.f218086w
                com.tencent.mm.ui.chatting.n2 r7 = r8.mo103265r0(r10)
                r3.setOnClickListener(r7)
            L_0x10c6:
                r3 = 1
                goto L_0x10c9
            L_0x10c8:
                r3 = 0
            L_0x10c9:
                android.widget.FrameLayout r7 = r1.f218086w
                r7.setTag(r0)
                goto L_0x1468
            L_0x10d0:
                r1 = r13
                r6 = r15
                r15 = r23
                r3 = r33
                r9 = 0
                r11 = 50
                r13 = 2
                java.lang.Class<com.tencent.mm.message.a> r0 = com.tencent.p014mm.message.C80995a.class
                com.tencent.mm.message.g r0 = r5.mo93555w(r0)
                com.tencent.mm.message.a r0 = (com.tencent.p014mm.message.C80995a) r0
                java.lang.String r12 = r5.f195471B2
                java.lang.String r14 = r5.f195638w
                java.lang.String r11 = r5.f195570f
                java.lang.String r13 = r5.f195574g
                if (r0 == 0) goto L_0x118f
                java.lang.String r7 = r0.f237888E
                boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
                if (r7 != 0) goto L_0x118f
                java.lang.String r7 = r0.f237890G
                boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
                if (r7 == 0) goto L_0x10fe
                goto L_0x118f
            L_0x10fe:
                android.widget.TextView r3 = r1.f218044X
                r3.setText(r14)
                android.widget.LinearLayout r3 = r1.f218087x
                r7 = 8
                r3.setVisibility(r7)
                android.widget.LinearLayout r3 = r1.f218029I
                r3.setVisibility(r7)
                android.widget.LinearLayout r3 = r1.f218023C
                r3.setVisibility(r7)
                android.widget.ImageView r3 = r1.f218045Y
                r3.setVisibility(r9)
                android.widget.ImageView r3 = r1.f218041U
                r3.setVisibility(r7)
                android.widget.ImageView r3 = r1.f218045Y
                android.app.Activity r7 = r38.mo91565f()
                r14 = 2131756957(0x7f10079d, float:1.9144836E38)
                android.graphics.drawable.Drawable r7 = kg3.C76577a.m92158i(r7, r14)
                r3.setImageDrawable(r7)
                android.widget.LinearLayout r3 = r1.f218038R
                r3.setVisibility(r9)
                android.widget.TextView r3 = r1.f218039S
                r3.setText(r11)
                android.widget.TextView r3 = r1.f218040T
                r3.setText(r13)
                java.lang.Class<gt.w> r3 = p158gt.C76057w.class
                di3.d r3 = di3.C86312j.m106911c(r3)
                gt.w r3 = (p158gt.C76057w) r3
                com.tencent.mm.ui.chatting.viewitems.u$f$$h r7 = new com.tencent.mm.ui.chatting.viewitems.u$f$$h
                r7.<init>(r8, r1)
                r3.h60(r12, r7)
                lb0.b r3 = lb0.C88394b.m110233l()
                java.lang.String r7 = r0.f237890G
                di3.d r11 = di3.C86312j.m106911c(r25)
                kb0.i r11 = (kb0.C76529i) r11
                r12 = 120(0x78, float:1.68E-43)
                kb0.i$a r13 = kb0.C76529i.C76530a.DECODE_TYPE_ORIGIN
                r14 = 240(0xf0, float:3.36E-43)
                lb0.b$h r11 = r11.mo106759Hc(r14, r12, r13)
                android.graphics.Bitmap r3 = r3.mo122791g(r7, r11)
                if (r3 == 0) goto L_0x1170
                android.widget.ImageView r0 = r1.f218042V
                r0.setImageBitmap(r3)
                goto L_0x1465
            L_0x1170:
                lb0.b r3 = lb0.C88394b.m110233l()
                com.tencent.mm.ui.chatting.viewitems.u$f$$i r7 = new com.tencent.mm.ui.chatting.viewitems.u$f$$i
                r7.<init>(r8, r1)
                java.lang.String r0 = r0.f237890G
                di3.d r11 = di3.C86312j.m106911c(r25)
                kb0.i r11 = (kb0.C76529i) r11
                r12 = 120(0x78, float:1.68E-43)
                r14 = 240(0xf0, float:3.36E-43)
                lb0.b$h r11 = r11.mo106759Hc(r14, r12, r13)
                r12 = 0
                r3.mo122797p(r7, r0, r12, r11)
                goto L_0x1465
            L_0x118f:
                java.lang.String r0 = "hy: no video url. treat as default"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r0)
                goto L_0x11a6
            L_0x1195:
                r1 = r13
                r6 = r15
                r15 = r23
                r9 = 0
                android.widget.TextView r0 = r1.f218064j
                r3 = 2
                r0.setMaxLines(r3)
                android.widget.TextView r0 = r1.f218052d
                r3 = 3
                r0.setMaxLines(r3)
            L_0x11a6:
                r0 = 1
                r3 = 0
                goto L_0x146b
            L_0x11aa:
                r1 = r13
                r6 = r15
                r15 = r23
                r9 = 0
                if (r14 == 0) goto L_0x1465
                int r0 = r14.f195664b
                r3 = 19
                if (r0 != r3) goto L_0x1465
                com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.C74255e.m88525h(r10, r1, r5, r2)
                goto L_0x1465
            L_0x11bc:
                r1 = r13
                r6 = r15
                r15 = r23
                r9 = 0
                com.tencent.p014mm.p136ui.chatting.viewitems.C85822j6.m106040a(r1, r5, r3)
                android.widget.FrameLayout r0 = r1.f218086w
                android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
                if (r0 == 0) goto L_0x11da
                android.widget.FrameLayout r0 = r1.f218086w
                android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
                r3 = -2
                r0.width = r3
                android.widget.FrameLayout r0 = r1.f218086w
                r0.requestLayout()
            L_0x11da:
                di3.d r0 = di3.C86312j.m106911c(r20)
                kr0.w0 r0 = (kr0.C76629w0) r0
                java.lang.String r3 = r5.f195573f2
                com.tencent.mm.plugin.appbrand.config.WxaAttributes r0 = r0.mo106879N2(r3)
                java.lang.String r3 = r5.f195573f2
                kb0.C88132b.m109732c(r3, r0, r5)
                if (r0 == 0) goto L_0x11f0
                java.lang.String r3 = r0.field_nickname
                goto L_0x11f2
            L_0x11f0:
                java.lang.String r3 = r5.f195638w
            L_0x11f2:
                if (r0 == 0) goto L_0x11f7
                java.lang.String r7 = r0.field_smallHeadURL
                goto L_0x11f9
            L_0x11f7:
                java.lang.String r7 = r5.f195471B2
            L_0x11f9:
                android.widget.LinearLayout r11 = r1.f218087x
                r13 = 8
                r11.setVisibility(r13)
                android.widget.LinearLayout r11 = r1.f218029I
                r11.setVisibility(r9)
                android.widget.LinearLayout r11 = r1.f218023C
                r11.setVisibility(r13)
                android.widget.LinearLayout r11 = r1.f218038R
                r11.setVisibility(r13)
                boolean r11 = com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.m88503n(r6, r5, r10)
                if (r11 == 0) goto L_0x1235
                android.widget.LinearLayout r11 = r1.f218075o0
                com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.m88490a(r11, r9)
                java.lang.String r11 = r39.mo108763q2()
                boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
                android.widget.LinearLayout r13 = r1.f218075o0
                r13.setTag(r6)
                android.widget.LinearLayout r13 = r1.f218075o0
                com.tencent.mm.ui.chatting.viewitems.u$f$$e r14 = new com.tencent.mm.ui.chatting.viewitems.u$f$$e
                r14.<init>(r8, r1, r10)
                r13.setOnClickListener(r14)
                com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.m88507r(r11, r1, r10)
                goto L_0x123c
            L_0x1235:
                android.widget.LinearLayout r11 = r1.f218075o0
                r13 = 8
                com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.m88490a(r11, r13)
            L_0x123c:
                android.widget.TextView r11 = r1.f218027G
                r11.setText(r3)
                android.widget.TextView r3 = r1.f218028H
                com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.m88504o(r3, r5)
                gc0.a r3 = gc0.C20828a.m22825b()
                android.widget.ImageView r11 = r1.f218026F
                hc0.c r13 = com.tencent.p014mm.p136ui.chatting.viewitems.C6808o3.f24365a
                r3.mo32519h(r7, r11, r13)
                di3.d r3 = di3.C86312j.m106911c(r27)
                gt.k r3 = (p158gt.C98201k) r3
                gt.m r3 = r3.mo137277xi()
                java.lang.String r7 = r39.mo108765s2()
                com.tencent.mm.modelimage.m r3 = (com.tencent.p014mm.modelimage.C92839m) r3
                java.lang.String r3 = r3.h30(r7)
                android.widget.ImageView r7 = r1.f218030J
                r11 = 0
                r7.setImageBitmap(r11)
                lb0.b r18 = lb0.C88394b.m110233l()
                android.widget.ImageView r7 = r1.f218030J
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                r11.append(r4)
                r11.append(r3)
                java.lang.String r20 = r11.toString()
                r21 = 0
                r22 = 0
                di3.d r3 = di3.C86312j.m106911c(r25)
                kb0.i r3 = (kb0.C76529i) r3
                r11 = 192(0xc0, float:2.69E-43)
                r13 = 240(0xf0, float:3.36E-43)
                lb0.b$h r23 = r3.Ij0(r13, r11)
                r19 = r7
                r18.mo122787c(r19, r20, r21, r22, r23)
                r3 = 1
                boolean r7 = com.tencent.p014mm.p136ui.chatting.viewitems.C85822j6.m106042c(r5, r0, r3)
                if (r7 == 0) goto L_0x12b8
                android.widget.ImageView r0 = r1.f218036P
                r0.setVisibility(r9)
                android.widget.ImageView r0 = r1.f218034N
                r3 = 8
                r0.setVisibility(r3)
                android.widget.ImageView r0 = r1.f218036P
                com.tencent.p014mm.plugin.appbrand.p026ui.C84704w4.m104354a(r0)
                com.tencent.p014mm.p136ui.chatting.component.C19729d.m21409b(r10, r6, r9)
                goto L_0x1465
            L_0x12b8:
                boolean r0 = com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.m88498i(r5, r0, r12)
                if (r0 == 0) goto L_0x12dd
                boolean r0 = com.tencent.p014mm.p136ui.chatting.viewitems.C85822j6.m106041b(r5)
                if (r0 == 0) goto L_0x12dd
                android.widget.ImageView r0 = r1.f218034N
                r0.setVisibility(r9)
                android.widget.ImageView r0 = r1.f218036P
                r3 = 8
                r0.setVisibility(r3)
                android.widget.ImageView r0 = r1.f218034N
                com.tencent.p014mm.plugin.appbrand.p026ui.C84711y4.m104367a(r0)
                r0 = 1
                com.tencent.p014mm.p136ui.chatting.component.C19729d.m21409b(r10, r6, r0)
                goto L_0x1465
            L_0x12dd:
                r3 = 8
                android.widget.ImageView r0 = r1.f218036P
                r0.setVisibility(r3)
                android.widget.ImageView r0 = r1.f218034N
                r0.setVisibility(r3)
                goto L_0x1465
            L_0x12ed:
                r1 = r13
                r6 = r15
                r15 = r23
                r9 = 0
                com.tencent.mm.ui.widget.MMNeat7extView r0 = r1.f218050c
                r0.setVisibility(r9)
                com.tencent.mm.ui.widget.MMNeat7extView r0 = r1.f218050c
                java.lang.String r3 = r5.mo93550m()
                r0.mo104279b(r3)
                android.widget.TextView r0 = r1.f218064j
                r0.setVisibility(r9)
                android.widget.TextView r0 = r1.f218064j
                r3 = 2131823580(0x7f110bdc, float:1.9279964E38)
                r0.setText(r3)
                android.widget.TextView r0 = r1.f218052d
                r3 = 4
                r0.setMaxLines(r3)
                android.widget.ImageView r0 = r1.f218066k
                r0.setVisibility(r3)
                android.widget.ImageView r0 = r1.f218076p
                r3 = 8
                r0.setVisibility(r3)
                if (r2 == 0) goto L_0x1465
                di3.d r0 = di3.C86312j.m106911c(r27)
                gt.k r0 = (p158gt.C98201k) r0
                gt.m r0 = r0.mo137277xi()
                java.lang.String r18 = r39.mo108765s2()
                r19 = 1
                android.app.Activity r3 = r38.mo91565f()
                float r20 = kg3.C76577a.m92156g(r3)
                r21 = 0
                r22 = 1
                r17 = r0
                com.tencent.mm.modelimage.m r17 = (com.tencent.p014mm.modelimage.C92839m) r17
                android.graphics.Bitmap r0 = r17.mo127167Lo(r18, r19, r20, r21, r22)
                if (r0 == 0) goto L_0x1354
                boolean r3 = r0.isRecycled()
                if (r3 != 0) goto L_0x1354
                com.tencent.mm.ui.MMImageView r3 = r1.f218048b
                r3.setImageBitmap(r0)
                goto L_0x1465
            L_0x1354:
                com.tencent.mm.ui.MMImageView r0 = r1.f218048b
                r3 = 2131755119(0x7f10006f, float:1.9141108E38)
                r0.setImageResource(r3)
                goto L_0x1465
            L_0x135e:
                r1 = r13
                r6 = r15
                r15 = r23
                r9 = 0
                android.widget.TextView r0 = r1.f218064j
                r0.setVisibility(r9)
                int r0 = r5.f195551a0
                r3 = 1
                if (r0 != r3) goto L_0x1376
                android.widget.TextView r0 = r1.f218064j
                r3 = 2131835285(0x7f113995, float:1.9303704E38)
                r0.setText(r3)
                goto L_0x1396
            L_0x1376:
                r3 = 2
                if (r0 != r3) goto L_0x1382
                android.widget.TextView r0 = r1.f218064j
                r3 = 2131835287(0x7f113997, float:1.9303708E38)
                r0.setText(r3)
                goto L_0x1396
            L_0x1382:
                r3 = 3
                if (r0 != r3) goto L_0x138e
                android.widget.TextView r0 = r1.f218064j
                r3 = 2131835286(0x7f113996, float:1.9303706E38)
                r0.setText(r3)
                goto L_0x1396
            L_0x138e:
                android.widget.TextView r0 = r1.f218064j
                r3 = 2131835288(0x7f113998, float:1.930371E38)
                r0.setText(r3)
            L_0x1396:
                java.lang.String r0 = r5.f195570f
                if (r0 == 0) goto L_0x13ae
                int r0 = r0.length()
                if (r0 <= 0) goto L_0x13ae
                com.tencent.mm.ui.widget.MMNeat7extView r0 = r1.f218050c
                r0.setVisibility(r9)
                com.tencent.mm.ui.widget.MMNeat7extView r0 = r1.f218050c
                java.lang.String r3 = r5.mo93550m()
                r0.mo104279b(r3)
            L_0x13ae:
                android.widget.TextView r0 = r1.f218052d
                r3 = 4
                r0.setMaxLines(r3)
                android.widget.ImageView r0 = r1.f218066k
                r0.setVisibility(r3)
                android.widget.ImageView r0 = r1.f218076p
                r3 = 8
                r0.setVisibility(r3)
                if (r2 == 0) goto L_0x1465
                di3.d r0 = di3.C86312j.m106911c(r27)
                gt.k r0 = (p158gt.C98201k) r0
                gt.m r0 = r0.mo137277xi()
                java.lang.String r18 = r39.mo108765s2()
                r19 = 1
                android.app.Activity r3 = r38.mo91565f()
                float r20 = kg3.C76577a.m92156g(r3)
                r21 = 0
                r22 = 1
                r17 = r0
                com.tencent.mm.modelimage.m r17 = (com.tencent.p014mm.modelimage.C92839m) r17
                android.graphics.Bitmap r0 = r17.mo127167Lo(r18, r19, r20, r21, r22)
                if (r0 == 0) goto L_0x13f5
                boolean r3 = r0.isRecycled()
                if (r3 != 0) goto L_0x13f5
                com.tencent.mm.ui.MMImageView r3 = r1.f218048b
                r3.setImageBitmap(r0)
                goto L_0x1465
            L_0x13f5:
                com.tencent.mm.ui.MMImageView r0 = r1.f218048b
                r3 = 2131755119(0x7f10006f, float:1.9141108E38)
                r0.setImageResource(r3)
                goto L_0x1465
            L_0x13fe:
                r1 = r13
                r6 = r15
                r15 = r23
                r9 = 0
                java.lang.String r0 = r5.f195570f
                if (r0 == 0) goto L_0x1415
                int r0 = r0.length()
                if (r0 <= 0) goto L_0x1415
                com.tencent.mm.ui.widget.MMNeat7extView r0 = r1.f218050c
                r0.setVisibility(r9)
                r3 = 8
                goto L_0x141c
            L_0x1415:
                com.tencent.mm.ui.widget.MMNeat7extView r0 = r1.f218050c
                r3 = 8
                r0.setVisibility(r3)
            L_0x141c:
                android.widget.TextView r0 = r1.f218052d
                r0.setVisibility(r9)
                android.widget.TextView r0 = r1.f218064j
                r0.setVisibility(r3)
                android.widget.ImageView r0 = r1.f218076p
                r0.setVisibility(r3)
                android.widget.ImageView r0 = r1.f218066k
                r3 = 4
                r0.setVisibility(r3)
                android.widget.TextView r0 = r1.f218052d
                r3 = 2
                r0.setMaxLines(r3)
                if (r2 == 0) goto L_0x1465
                di3.d r0 = di3.C86312j.m106911c(r26)
                ym.l r0 = (p763ym.C79138l) r0
                java.lang.String r3 = r5.f195562d
                android.app.Activity r7 = r38.mo91565f()
                float r7 = kg3.C76577a.m92156g(r7)
                r11 = 1
                android.graphics.Bitmap r0 = r0.mo74018ub(r3, r11, r7)
                if (r0 == 0) goto L_0x145d
                boolean r3 = r0.isRecycled()
                if (r3 == 0) goto L_0x1457
                goto L_0x145d
            L_0x1457:
                com.tencent.mm.ui.MMImageView r3 = r1.f218048b
                r3.setImageBitmap(r0)
                goto L_0x1465
            L_0x145d:
                com.tencent.mm.ui.MMImageView r0 = r1.f218048b
                r3 = 2131755119(0x7f10006f, float:1.9141108E38)
                r0.setImageResource(r3)
            L_0x1465:
                r0 = r16
                r3 = 0
            L_0x1468:
                r16 = r0
                r0 = 0
            L_0x146b:
                if (r0 == 0) goto L_0x1590
                java.lang.String r0 = r5.f195570f
                if (r0 == 0) goto L_0x148c
                int r0 = r0.length()
                if (r0 <= 0) goto L_0x148c
                android.widget.TextView r0 = r1.f218064j
                r0.setVisibility(r9)
                android.widget.TextView r0 = r1.f218064j
                r7 = 2
                r0.setMaxLines(r7)
                android.widget.TextView r0 = r1.f218064j
                java.lang.String r7 = r5.f195570f
                r0.setText(r7)
                r7 = 8
                goto L_0x1493
            L_0x148c:
                android.widget.TextView r0 = r1.f218064j
                r7 = 8
                r0.setVisibility(r7)
            L_0x1493:
                com.tencent.mm.ui.widget.MMNeat7extView r0 = r1.f218050c
                r0.setVisibility(r7)
                if (r2 == 0) goto L_0x1587
                int r0 = r5.f195582i
                r2 = 33
                if (r0 == r2) goto L_0x1541
                r2 = 36
                if (r0 != r2) goto L_0x14a6
                goto L_0x1541
            L_0x14a6:
                r2 = 44
                if (r0 != r2) goto L_0x14b7
                java.lang.String r0 = r5.f195646y
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                if (r0 != 0) goto L_0x14b7
                com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.C74255e.m88521c(r1, r5)
                goto L_0x1587
            L_0x14b7:
                di3.d r0 = di3.C86312j.m106911c(r27)
                gt.k r0 = (p158gt.C98201k) r0
                gt.m r0 = r0.mo137277xi()
                java.lang.String r18 = r39.mo108765s2()
                r19 = 1
                android.app.Activity r2 = r38.mo91565f()
                float r20 = kg3.C76577a.m92156g(r2)
                r21 = 0
                r22 = 1
                r17 = r0
                com.tencent.mm.modelimage.m r17 = (com.tencent.p014mm.modelimage.C92839m) r17
                android.graphics.Bitmap r0 = r17.mo127167Lo(r18, r19, r20, r21, r22)
                if (r0 == 0) goto L_0x14e3
                boolean r2 = r0.isRecycled()
                if (r2 == 0) goto L_0x14ff
            L_0x14e3:
                di3.d r0 = di3.C86312j.m106911c(r27)
                gt.k r0 = (p158gt.C98201k) r0
                gt.m r0 = r0.mo137277xi()
                java.lang.String r2 = r39.mo108765s2()
                android.app.Activity r4 = r38.mo91565f()
                float r4 = kg3.C76577a.m92156g(r4)
                com.tencent.mm.modelimage.m r0 = (com.tencent.p014mm.modelimage.C92839m) r0
                android.graphics.Bitmap r0 = r0.mo127188jo(r2, r4, r9)
            L_0x14ff:
                if (r0 == 0) goto L_0x150e
                boolean r2 = r0.isRecycled()
                if (r2 != 0) goto L_0x150e
                com.tencent.mm.ui.MMImageView r2 = r1.f218048b
                r2.setImageBitmap(r0)
                goto L_0x1587
            L_0x150e:
                java.lang.String r0 = r5.f195646y
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                if (r0 != 0) goto L_0x1538
                java.lang.String r0 = r5.f195646y
                hc0.c$b r2 = new hc0.c$b
                r2.<init>()
                r4 = 2131100307(0x7f060293, float:1.7812992E38)
                r2.mo32670e(r4)
                r4 = 1
                r2.mo32669d(r4)
                r2.mo32668c(r4)
                gc0.a r4 = gc0.C20828a.m22825b()
                android.widget.ImageView r7 = r1.f218049b0
                hc0.c r2 = r2.mo32666a()
                r4.mo32519h(r0, r7, r2)
                goto L_0x1587
            L_0x1538:
                com.tencent.mm.ui.MMImageView r0 = r1.f218048b
                r2 = 2131231074(0x7f080162, float:1.8078219E38)
                r0.setImageResource(r2)
                goto L_0x1587
            L_0x1541:
                di3.d r0 = di3.C86312j.m106911c(r27)
                gt.k r0 = (p158gt.C98201k) r0
                gt.m r0 = r0.mo137277xi()
                java.lang.String r2 = r39.mo108765s2()
                com.tencent.mm.modelimage.m r0 = (com.tencent.p014mm.modelimage.C92839m) r0
                java.lang.String r0 = r0.h30(r2)
                com.tencent.mm.ui.MMImageView r2 = r1.f218048b
                r7 = 2131755119(0x7f10006f, float:1.9141108E38)
                r2.setImageResource(r7)
                lb0.b r17 = lb0.C88394b.m110233l()
                com.tencent.mm.ui.MMImageView r2 = r1.f218048b
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r4)
                r7.append(r0)
                java.lang.String r19 = r7.toString()
                r20 = 0
                r21 = 0
                di3.d r0 = di3.C86312j.m106911c(r25)
                kb0.i r0 = (kb0.C76529i) r0
                r4 = 50
                lb0.b$h r22 = r0.Ij0(r4, r4)
                r18 = r2
                r17.mo122787c(r18, r19, r20, r21, r22)
            L_0x1587:
                int r0 = r5.f195582i
                r2 = 44
                if (r0 != r2) goto L_0x1590
                com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.C74255e.m88522e(r10, r1, r5)
            L_0x1590:
                boolean r0 = r38.mo91583x()
                if (r0 != 0) goto L_0x15c0
                di3.d r0 = di3.C86312j.m106911c(r26)
                ym.l r0 = (p763ym.C79138l) r0
                r2 = r31
                boolean r0 = r0.mo73991JL(r2)
                if (r0 == 0) goto L_0x15b8
                android.widget.ImageView r0 = r1.f218080r
                r0.setVisibility(r9)
                android.widget.ImageView r0 = r1.f218080r
                com.tencent.mm.ui.chatting.viewitems.t8 r2 = new com.tencent.mm.ui.chatting.viewitems.t8
                r2.<init>()
                r2.f217989w = r5
                r2.f212238a = r6
                r8.mo103072F(r10, r0, r2)
                goto L_0x15c7
            L_0x15b8:
                android.widget.ImageView r0 = r1.f218080r
                r2 = 8
                r0.setVisibility(r2)
                goto L_0x15c7
            L_0x15c0:
                r2 = 8
                android.widget.ImageView r0 = r1.f218080r
                r0.setVisibility(r2)
            L_0x15c7:
                r2 = r3
                r0 = r16
                goto L_0x15d3
            L_0x15cb:
                r16 = r2
                r1 = r13
                r15 = r14
                r9 = 0
                r0 = r16
                r2 = 0
            L_0x15d3:
                if (r2 != 0) goto L_0x15e3
                android.widget.FrameLayout r2 = r1.f218086w
                r2.setTag(r0)
                android.widget.FrameLayout r0 = r1.f218086w
                com.tencent.mm.ui.chatting.viewitems.i$f r2 = r8.mo103099u(r10)
                r0.setOnClickListener(r2)
            L_0x15e3:
                boolean r0 = r8.f217197d
                if (r0 == 0) goto L_0x15ff
                android.widget.FrameLayout r0 = r1.f218086w
                com.tencent.mm.ui.chatting.viewitems.i$e r2 = r8.mo103098p(r10)
                r0.setOnLongClickListener(r2)
                android.widget.FrameLayout r0 = r1.f218086w
                xi.d r1 = r10.mo91560a(r15)
                zj3.l r1 = (zj3.C79368l) r1
                com.tencent.mm.ui.chatting.h2 r1 = r1.mo108189Z4()
                r0.setOnTouchListener(r1)
            L_0x15ff:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.C74260f.mo26237f(com.tencent.mm.ui.chatting.viewitems.i$c, ck3.b, com.tencent.mm.storage.f4, java.lang.String):void");
        }

        /* renamed from: k0 */
        public boolean mo26238k0(int i, boolean z) {
            if (!z) {
                return i == 49 || i == 335544369 || i == 402653233 || i == 369098801 || i == 738197553 || i == 905969713;
            }
            return false;
        }

        /* renamed from: o0 */
        public C73724j2 mo103262o0(C67391b bVar) {
            if (this.f218102w == null) {
                this.f218102w = new C73724j2(bVar);
            }
            return this.f218102w;
        }

        /* renamed from: p0 */
        public C73736k2 mo103263p0(C67391b bVar) {
            if (this.f218104y == null) {
                this.f218104y = new C73736k2(bVar);
            }
            return this.f218104y;
        }

        /* renamed from: q0 */
        public C73756m2 mo103264q0(C67391b bVar) {
            if (this.f218103x == null) {
                this.f218103x = new C73756m2(bVar);
            }
            return this.f218103x;
        }

        /* renamed from: r0 */
        public C73763n2 mo103265r0(C67391b bVar) {
            if (this.f218105z == null) {
                this.f218105z = new C73763n2(bVar);
            }
            return this.f218105z;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.u$g */
    public static class C74261g extends C74023i implements C73774p2 {

        /* renamed from: v */
        public C67391b f218106v;

        /* renamed from: w */
        public C73724j2 f218107w;

        /* renamed from: x */
        public C73756m2 f218108x;

        /* renamed from: y */
        public C73736k2 f218109y;

        /* renamed from: z */
        public C73763n2 f218110z;

        /* JADX WARNING: Removed duplicated region for block: B:46:0x019b A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x019c A[RETURN] */
        /* renamed from: s0 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static boolean m88547s0(com.tencent.p014mm.message.C68070l.C68072b r16, ck3.C67391b r17, com.tencent.p014mm.p136ui.chatting.viewitems.C74023i r18, com.tencent.p014mm.storage.C72963f4 r19) {
            /*
                r4 = r16
                r0 = r17
                r1 = 6
                java.lang.Object[] r2 = new java.lang.Object[r1]
                java.lang.String r3 = r4.f195573f2
                r6 = 0
                r2[r6] = r3
                java.lang.String r3 = r4.f195569e2
                r7 = 1
                r2[r7] = r3
                java.lang.String r3 = r4.f195577g2
                r5 = 2
                r2[r5] = r3
                java.lang.String r3 = r4.f195586j
                r8 = 3
                r2[r8] = r3
                int r3 = r4.f195653z2
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r9 = 4
                r2[r9] = r3
                java.lang.String r3 = r4.f195585i2
                r9 = 5
                r2[r9] = r3
                java.lang.String r3 = "MicroMsg.ChattingItemAppMsgTo"
                java.lang.String r9 = "username: %s , path: %s ,appid %s ,url : %s, pkgType : %s, md5 : %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r9, r2)
                int r2 = r4.f195582i
                r3 = 44
                if (r3 != r2) goto L_0x004c
                boolean r2 = r4.mo93554q(r6)
                if (r2 == 0) goto L_0x004b
                android.app.Activity r2 = r17.mo91565f()
                java.lang.String r2 = r4.mo93549l(r2, r6)
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
                if (r2 == 0) goto L_0x004c
            L_0x004b:
                return r6
            L_0x004c:
                java.lang.String r2 = r17.mo91577r()
                r3 = r18
                r9 = r19
                java.lang.String r10 = r3.mo103068y(r0, r9)
                android.os.Bundle r11 = new android.os.Bundle
                r11.<init>()
                com.tencent.mm.ui.chatting.BaseChattingUIFragment r12 = r0.f193286j
                boolean r12 = r12 instanceof com.tencent.p014mm.p136ui.chatting.AppBrandServiceChattingUI.AppBrandServiceChattingFmUI
                java.lang.String r13 = "stat_scene"
                if (r12 == 0) goto L_0x006c
                r12 = 10
                r11.putInt(r13, r12)
                goto L_0x0082
            L_0x006c:
                boolean r12 = r17.mo91583x()
                if (r12 == 0) goto L_0x0076
                r11.putInt(r13, r5)
                goto L_0x0082
            L_0x0076:
                boolean r12 = eb0.C45628s0.m50738C(r2)
                if (r12 == 0) goto L_0x007e
                r12 = 7
                goto L_0x007f
            L_0x007e:
                r12 = 1
            L_0x007f:
                r11.putInt(r13, r12)
            L_0x0082:
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "msg_"
                r12.append(r13)
                long r13 = r19.mo108774y2()
                java.lang.String r13 = java.lang.Long.toString(r13)
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                java.lang.String r13 = "stat_msg_id"
                r11.putString(r13, r12)
                java.lang.String r12 = "stat_chat_talker_username"
                r11.putString(r12, r2)
                java.lang.String r12 = "stat_send_msg_user"
                r11.putString(r12, r10)
                boolean r12 = rb0.C47987l.m53344l2(r19)
                java.lang.String r13 = "stat_kf_guide"
                r11.putBoolean(r13, r12)
                java.lang.String r12 = r17.mo91577r()
                int r12 = kb0.C76528a.m92004a(r12)
                com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.m88494e(r16, r17, r18, r19)
                int r3 = r4.f195581h2
                java.lang.String r13 = "chat_type"
                java.lang.String r14 = "chatroom_username"
                java.lang.String r15 = ""
                if (r3 == 0) goto L_0x0159
                if (r3 == r7) goto L_0x00eb
                if (r3 == r5) goto L_0x0159
                if (r3 == r8) goto L_0x00d5
                r0 = 1
                goto L_0x0196
            L_0x00d5:
                boolean r1 = r17.mo91583x()
                if (r1 == 0) goto L_0x00dc
                r15 = r2
            L_0x00dc:
                r11.putString(r14, r15)
                r11.putInt(r13, r12)
                boolean r0 = r17.mo91583x()
                kb0.C88132b.m109737g(r2, r10, r0, r4, r11)
                goto L_0x0195
            L_0x00eb:
                android.content.Intent r3 = new android.content.Intent
                r3.<init>()
                java.lang.String r8 = r4.f195573f2
                java.lang.String r12 = "key_username"
                r3.putExtra(r12, r8)
                boolean r8 = r17.mo91583x()
                java.lang.String r12 = "key_scene_note"
                java.lang.String r13 = "key_from_scene"
                if (r8 == 0) goto L_0x0120
                r3.putExtra(r13, r7)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r5 = r17.mo91577r()
                r2.append(r5)
                java.lang.String r5 = ":"
                r2.append(r5)
                r2.append(r10)
                java.lang.String r2 = r2.toString()
                r3.putExtra(r12, r2)
                goto L_0x0126
            L_0x0120:
                r3.putExtra(r13, r5)
                r3.putExtra(r12, r2)
            L_0x0126:
                java.lang.String r2 = "_stat_obj"
                r3.putExtra(r2, r11)
                com.tencent.mm.plugin.appbrand.config.WxaExposedParams$b r2 = new com.tencent.mm.plugin.appbrand.config.WxaExposedParams$b
                r2.<init>()
                java.lang.String r5 = r4.f195577g2
                r2.f239557a = r5
                r2.f239566j = r1
                int r1 = r4.f195653z2
                r2.f239564h = r1
                r2.f239563g = r6
                com.tencent.mm.plugin.appbrand.config.WxaExposedParams r1 = r2.mo113977a()
                java.lang.String r2 = "key_scene_exposed_params"
                r3.putExtra(r2, r1)
                r1 = 1237(0x4d5, float:1.733E-42)
                java.lang.String r2 = "key_wxapp_scene"
                r3.putExtra(r2, r1)
                android.app.Activity r0 = r17.mo91565f()
                r1 = 0
                java.lang.String r2 = "appbrand"
                java.lang.String r4 = ".ui.AppBrandProfileUI"
                ke3.C88144b.m109791i(r0, r2, r4, r3, r1)
                goto L_0x0195
            L_0x0159:
                com.tencent.mm.ui.chatting.BaseChattingUIFragment r1 = r0.f193286j
                boolean r1 = r1 instanceof com.tencent.p014mm.p136ui.chatting.AppBrandServiceChattingUI.AppBrandServiceChattingFmUI
                if (r1 == 0) goto L_0x016d
                r3 = 1073(0x431, float:1.504E-42)
                r5 = 0
                r0 = r2
                r1 = r10
                r2 = r3
                r3 = r5
                r4 = r16
                r5 = r11
                kb0.C88132b.m109734e(r0, r1, r2, r3, r4, r5)
                goto L_0x0195
            L_0x016d:
                boolean r1 = eb0.C45628s0.m50738C(r2)
                if (r1 == 0) goto L_0x0181
                r3 = 1074(0x432, float:1.505E-42)
                r5 = 0
                r0 = r2
                r1 = r10
                r2 = r3
                r3 = r5
                r4 = r16
                r5 = r11
                kb0.C88132b.m109734e(r0, r1, r2, r3, r4, r5)
                goto L_0x0195
            L_0x0181:
                boolean r1 = r17.mo91583x()
                if (r1 == 0) goto L_0x0188
                r15 = r2
            L_0x0188:
                r11.putString(r14, r15)
                r11.putInt(r13, r12)
                boolean r0 = r17.mo91583x()
                kb0.C88132b.m109736f(r2, r10, r0, r4, r11)
            L_0x0195:
                r0 = 0
            L_0x0196:
                com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.m88495f(r19)
                if (r0 != 0) goto L_0x019c
                return r7
            L_0x019c:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.C74261g.m88547s0(com.tencent.mm.message.l$b, ck3.b, com.tencent.mm.ui.chatting.viewitems.i, com.tencent.mm.storage.f4):boolean");
        }

        /* renamed from: t0 */
        public static boolean m88548t0(C68070l.C68072b bVar, C67391b bVar2, C74023i iVar, C72963f4 f4Var) {
            C68070l.C68072b bVar3 = bVar;
            C80995a aVar = (C80995a) bVar3.mo93555w(C80995a.class);
            if (aVar == null || Util.isNullOrNil(aVar.f237888E) || Util.isNullOrNil(aVar.f237890G)) {
                C67391b bVar4 = bVar2;
                Log.m105928w("MicroMsg.ChattingItemAppMsgTo", "hy: no remote url provided. give a hint");
                C76912y0.makeText((Context) bVar2.mo91565f(), (CharSequence) bVar2.mo91572m().getString(C0966R.string.a2w), 0).show();
                return true;
            }
            String str = aVar.f237888E;
            String str2 = aVar.f237886C;
            String str3 = aVar.f237887D;
            String str4 = Util.isNullOrNil(aVar.f237891H) ? bVar3.f195574g : aVar.f237891H;
            String str5 = aVar.f237889F;
            String str6 = bVar3.f195577g2;
            String str7 = aVar.f237890G;
            Log.m105925i("MicroMsg.ChattingItemAppMsgTo", "hy: request start videoUrl: %s, localPath: %s, videoDesc: %s, videoButtonText: %s, appid: %s, thumbUrl: %s", str, str2, str4, str5, str6, str7);
            C115669n nVar = C115669n.INSTANCE;
            Object[] objArr = new Object[4];
            objArr[0] = Integer.valueOf(C72996z1.m85820U5(bVar2.mo91577r()) ? 2 : 1);
            objArr[1] = str6;
            objArr[2] = 1;
            objArr[3] = 1;
            nVar.mo160131h(17608, objArr);
            if (!Util.isNullOrNil(str) || (!Util.isNullOrNil(str2) && C86013q1.m106450k(str2) && Util.nullAsNil(C86013q1.m106456q(str2)).equals(str3))) {
                Bundle bundle = new Bundle();
                bundle.putInt("key_chatting_type", bVar3.f195582i);
                bundle.putString("key_chatting_wording", str4);
                bundle.putString("key_chatting_text", str5);
                bundle.putString("key_chatting_appid", str6);
                bundle.putLong("key_msg_id", f4Var.getMsgId());
                bundle.putString("key_talker_username", bVar2.mo91577r());
                bundle.putString("key_sender_username", iVar.mo103068y(bVar2, f4Var));
                C74244u.m88493d(bVar2, str, str2, str7, true, bundle);
            } else {
                Log.m105928w("MicroMsg.ChattingItemAppMsgTo", "hy: video msg invalid!!");
            }
            return false;
        }

        /* renamed from: u0 */
        public static boolean m88549u0(C68070l.C68072b bVar, View view, C67391b bVar2, C74023i iVar, C72963f4 f4Var) {
            String str = bVar.f195586j;
            int i = 0;
            if (str == null || str.equals("")) {
                return false;
            }
            if (!Util.isNullOrNil(bVar.f195475C2)) {
                Intent intent = new Intent();
                intent.putExtra("sns_landig_pages_from_source", 5);
                intent.putExtra("msg_id", f4Var.getMsgId());
                intent.putExtra("sns_landing_pages_xml", bVar.f195475C2);
                intent.putExtra("sns_landing_pages_share_thumb_url", f4Var.mo108765s2());
                intent.addFlags(268435456);
                String q = C102260r.m134877q(bVar2.f193285i, f4Var.mo108768t());
                Log.m105924i("MicroMsg.SnsAdNativeLandingPagesUI.uxInfo", "open Ad ChattingItemAppMsg handleDefaultClickTo, selfUserName is " + C75592q0.m90789s() + ", extraData is " + q);
                C88144b.m109791i(bVar2.mo91565f(), "sns", ".ui.SnsAdNativeLandingPagesPreviewUI", intent, (Bundle) null);
                return true;
            }
            C90621r0 r0Var = (C90621r0) bVar.mo93555w(C90621r0.class);
            if (r0Var == null || Util.isNullOrNil(r0Var.f260345b)) {
                String K3 = ((C79139p) C86312j.m106911c(C79139p.class)).mo108862K3(bVar.f195586j, bVar2.mo91583x() ? "groupmessage" : "singlemessage");
                String str2 = bVar.f195586j;
                PackageInfo w = iVar.mo103101w(bVar2.mo91565f(), bVar.f195562d);
                Intent intent2 = new Intent();
                intent2.putExtra("rawUrl", K3);
                intent2.putExtra("webpageTitle", bVar.f195570f);
                String str3 = bVar.f195562d;
                if (str3 != null && ("wx751a1acca5688ba3".equals(str3) || "wxfbc915ff7c30e335".equals(bVar.f195562d) || "wx482a4001c37e2b74".equals(bVar.f195562d))) {
                    Bundle bundle = new Bundle();
                    bundle.putString("jsapi_args_appid", bVar.f195562d);
                    intent2.putExtra("jsapiargs", bundle);
                }
                if (!Util.isNullOrNil(str2)) {
                    intent2.putExtra("shortUrl", str2);
                } else {
                    intent2.putExtra("shortUrl", bVar.f195586j);
                }
                intent2.putExtra("version_name", w == null ? null : w.versionName);
                intent2.putExtra("version_code", w == null ? 0 : w.versionCode);
                if (!Util.isNullOrNil(bVar.f195634v)) {
                    intent2.putExtra("srcUsername", bVar.f195634v);
                    intent2.putExtra("srcDisplayname", bVar.f195638w);
                }
                intent2.putExtra("msg_id", f4Var.getMsgId());
                intent2.putExtra("KPublisherId", "msg_" + Long.toString(f4Var.mo108774y2()));
                intent2.putExtra("KAppId", bVar.f195562d);
                intent2.putExtra("geta8key_username", bVar2.mo91577r());
                intent2.putExtra("pre_username", iVar.mo103068y(bVar2, f4Var));
                intent2.putExtra("from_scence", 2);
                intent2.putExtra("expid_str", f4Var.f230733Q);
                intent2.putExtra("key_enable_teen_mode_check", true);
                C74244u.m88505p(intent2, f4Var, bVar);
                int b = C45629t0.m50815b(iVar.mo103068y(bVar2, f4Var), bVar2.mo91577r());
                intent2.putExtra("prePublishId", "msg_" + Long.toString(f4Var.mo108774y2()));
                intent2.putExtra("preUsername", iVar.mo103068y(bVar2, f4Var));
                intent2.putExtra("preChatName", bVar2.mo91577r());
                intent2.putExtra("preChatTYPE", b);
                intent2.putExtra("preMsgIndex", 0);
                if (b == 1) {
                    i = 3;
                } else if (b == 2) {
                    i = 2;
                } else if (b == 6 || b == 7) {
                    i = 5;
                }
                intent2.putExtra("share_report_pre_msg_url", bVar.f195586j);
                intent2.putExtra("share_report_pre_msg_title", bVar.f195570f);
                intent2.putExtra("share_report_pre_msg_desc", bVar.f195574g);
                intent2.putExtra("share_report_pre_msg_icon_url", bVar.f195646y);
                intent2.putExtra("share_report_pre_msg_appid", bVar.f195562d);
                intent2.putExtra("share_report_from_scene", i);
                if (i == 5) {
                    intent2.putExtra("share_report_biz_username", bVar2.mo91577r());
                }
                C88144b.m109791i(bVar2.mo91565f(), "webview", ".ui.tools.WebViewUI", intent2, (Bundle) null);
                return true;
            }
            w25 w25 = new w25();
            w25.f259899d = r0Var.f260345b;
            w25.f259900e = r0Var.f260346c;
            w25.f259901f = r0Var.f260347d;
            w25.f259902g = r0Var.f260348e;
            w25.f259903h = r0Var.f260349f;
            w25.f259904i = r0Var.f260358o;
            w25.f259905j = r0Var.f260350g;
            w25.f259906n = r0Var.f260351h;
            w25.f259907o = r0Var.f260352i;
            w25.f259908p = r0Var.f260353j;
            w25.f259909q = r0Var.f260354k;
            w25.f259910r = r0Var.f260355l;
            w25.f259911s = r0Var.f260356m;
            w25.f259912t = r0Var.f260357n;
            w25.f259913u = r0Var.f260359p;
            w25.f259915w = r0Var.f260361r;
            w25.f259916x = r0Var.f260362s;
            w25.f259918z = r0Var.f260364u;
            w25.f259914v = r0Var.f260360q;
            C101987v0.m134280n(bVar2.mo91565f(), C21914h.m25167o(w25, 32, bVar2.mo91565f().getString(C0966R.string.f3q)));
            C21915i.m25173e(w25, f4Var);
            return true;
        }

        /* renamed from: v0 */
        public static boolean m88550v0(View view, C67391b bVar, C72963f4 f4Var, int i, String str, C74023i iVar) {
            if (i != 19) {
                return false;
            }
            Intent intent = new Intent();
            intent.putExtra("message_id", f4Var.getMsgId());
            intent.putExtra("Retr_Security_Msg_Id", f4Var.getMsgId());
            int b = C45629t0.m50815b(str, bVar.mo91577r());
            intent.putExtra("prePublishId", "msg_" + Long.toString(f4Var.mo108774y2()));
            intent.putExtra("preUsername", str);
            intent.putExtra("preChatName", bVar.mo91577r());
            intent.putExtra("preChatTYPE", b);
            intent.putExtra("msgUsername", bVar.f193285i);
            intent.putExtra("serverMsgID", String.valueOf(f4Var.mo108774y2()));
            intent.putExtra("chatTypeForAppbrand", C76528a.m92004a(bVar.mo91577r()));
            C57796c.m66768a(intent, bVar, f4Var, iVar);
            C68144a.m80545a(f4Var);
            C88144b.m109791i(bVar.mo91565f(), "record", ".ui.RecordMsgDetailUI", intent, (Bundle) null);
            return true;
        }

        /* renamed from: w0 */
        public static boolean m88551w0(C68070l.C68072b bVar, C67391b bVar2, C74023i iVar, C72963f4 f4Var) {
            C68070l.C68072b bVar3 = bVar;
            C74023i iVar2 = iVar;
            Class cls = C79139p.class;
            if (iVar2.mo103069A(bVar2, bVar3, f4Var)) {
                return true;
            }
            String K3 = ((C79139p) C86312j.m106911c(cls)).mo108862K3(bVar3.f195586j, StateEvent.Name.MESSAGE);
            String K32 = ((C79139p) C86312j.m106911c(cls)).mo108862K3(bVar3.f195590k, StateEvent.Name.MESSAGE);
            PackageInfo w = iVar2.mo103101w(bVar2.mo91565f(), bVar3.f195562d);
            iVar.mo103070B(bVar2, K3, K32, w == null ? null : w.versionName, w == null ? 0 : w.versionCode, bVar3.f195562d, true, f4Var.getMsgId(), f4Var.mo108774y2(), f4Var, bVar);
            return true;
        }

        /* renamed from: x0 */
        public static boolean m88552x0(C68070l.C68072b bVar, C67391b bVar2, C74023i iVar, C72963f4 f4Var) {
            if (!Util.isNullOrNil(bVar.f195577g2) || !Util.isNullOrNil(bVar.f195573f2)) {
                String r = bVar2.mo91577r();
                String y = iVar.mo103068y(bVar2, f4Var);
                Bundle bundle = new Bundle();
                if (bVar2.mo91583x()) {
                    bundle.putInt("stat_scene", 2);
                } else {
                    bundle.putInt("stat_scene", C45628s0.m50738C(r) ? 7 : 1);
                }
                bundle.putString("stat_msg_id", "msg_" + Long.toString(f4Var.mo108774y2()));
                bundle.putString("stat_chat_talker_username", r);
                bundle.putString("stat_send_msg_user", y);
                bundle.putBoolean("stat_kf_guide", C47987l.m53344l2(f4Var));
                bundle.putInt("chat_type", C76528a.m92004a(bVar2.mo91577r()));
                ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106897rj(bVar2.mo91565f(), bVar2.mo91577r(), iVar.mo103068y(bVar2, f4Var), bVar2.mo91583x(), bVar, bundle);
                return true;
            }
            String K3 = ((C79139p) C86312j.m106911c(C79139p.class)).mo108862K3(bVar.f195586j, bVar2.mo91583x() ? "groupmessage" : "singlemessage");
            Intent intent = new Intent();
            intent.putExtra("rawUrl", K3);
            intent.putExtra("webpageTitle", bVar.f195570f);
            intent.putExtra("shortUrl", bVar.f195586j);
            C88144b.m109791i(bVar2.mo91565f(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            return true;
        }

        /* renamed from: y0 */
        public static boolean m88553y0(C68070l.C68072b bVar, View view, C67391b bVar2, C74023i iVar, C72963f4 f4Var) {
            C68070l.C68072b bVar3 = bVar;
            C67391b bVar4 = bVar2;
            C74023i iVar2 = iVar;
            C72963f4 f4Var2 = f4Var;
            Class cls = C45696d.class;
            if (!C72996z1.m85807K5(f4Var.mo108768t())) {
                C75539a.m90582b(false, f4Var.mo108774y2(), f4Var.mo108768t());
            }
            if (!Util.isNullOrNil(bVar3.f195475C2)) {
                Intent intent = new Intent();
                intent.putExtra("sns_landig_pages_from_source", 5);
                intent.putExtra("msg_id", f4Var.getMsgId());
                intent.putExtra("sns_landing_pages_xml", bVar3.f195475C2);
                intent.putExtra("sns_landing_pages_share_thumb_url", f4Var.mo108765s2());
                String q = C102260r.m134877q(bVar4.f193285i, f4Var.mo108768t());
                if (!TextUtils.isEmpty(q)) {
                    intent.putExtra("sns_landing_pages_extra", q);
                }
                Log.m105924i("MicroMsg.SnsAdNativeLandingPagesUI.uxInfo", "open Ad ChattingItemAppMsg handleUrlClickTo, selfUserName is " + C75592q0.m90789s() + ", extraData is " + q);
                intent.addFlags(268435456);
                C88144b.m109791i(bVar2.mo91565f(), "sns", ".ui.SnsAdNativeLandingPagesPreviewUI", intent, (Bundle) null);
                C92859v.m117131i(f4Var);
                return true;
            }
            C90621r0 r0Var = (C90621r0) bVar3.mo93555w(C90621r0.class);
            if (r0Var == null || Util.isNullOrNil(r0Var.f260345b)) {
                String str = bVar3.f195586j;
                if (str == null || str.equals("")) {
                    return true;
                }
                String K3 = ((C79139p) C86312j.m106911c(C79139p.class)).mo108862K3(bVar3.f195586j, bVar2.mo91583x() ? "groupmessage" : "singlemessage");
                String str2 = bVar3.f195590k;
                int intExtra = bVar2.mo91565f().getIntent().getIntExtra("KOpenArticleSceneFromScene", 10000);
                if (((C45696d) C86709a0.m107533q(cls)).mo70989eQ(K3)) {
                    K3 = ((C45696d) C86709a0.m107533q(cls)).mo70959F2(K3, 1, intExtra, (int) (System.currentTimeMillis() / 1000));
                }
                PackageInfo w = iVar2.mo103101w(bVar2.mo91565f(), bVar3.f195562d);
                Intent intent2 = new Intent();
                intent2.putExtra("rawUrl", K3);
                intent2.putExtra("webpageTitle", bVar3.f195570f);
                intent2.putExtra("msgUsername", bVar4.f193285i);
                intent2.putExtra("serverMsgID", String.valueOf(f4Var.mo108774y2()));
                String str3 = K3;
                intent2.putExtra("KMsgType", f4Var.getType());
                intent2.putExtra("KAppMsgType", bVar3.f195582i);
                Bundle bundle = new Bundle();
                Class cls2 = cls;
                bundle.putString("key_snsad_statextstr", bVar3.f195535U1);
                String str4 = bVar3.f195562d;
                if (str4 != null && ("wx751a1acca5688ba3".equals(str4) || "wxfbc915ff7c30e335".equals(bVar3.f195562d) || "wx482a4001c37e2b74".equals(bVar3.f195562d))) {
                    bundle.putString("jsapi_args_appid", bVar3.f195562d);
                }
                intent2.putExtra("jsapiargs", bundle);
                if (!Util.isNullOrNil(str2)) {
                    intent2.putExtra("shortUrl", str2);
                } else {
                    intent2.putExtra("shortUrl", bVar3.f195586j);
                }
                intent2.putExtra("version_name", w == null ? null : w.versionName);
                intent2.putExtra("version_code", w == null ? 0 : w.versionCode);
                if (!Util.isNullOrNil(bVar3.f195634v)) {
                    intent2.putExtra("srcUsername", bVar3.f195634v);
                    intent2.putExtra("srcDisplayname", bVar3.f195638w);
                }
                intent2.putExtra("msg_id", f4Var.getMsgId());
                C74244u.m88505p(intent2, f4Var2, bVar3);
                intent2.putExtra("KPublisherId", "msg_" + Long.toString(f4Var.mo108774y2()));
                intent2.putExtra("KAppId", bVar3.f195562d);
                intent2.putExtra("geta8key_username", bVar2.mo91577r());
                intent2.putExtra("pre_username", iVar2.mo103068y(bVar4, f4Var2));
                int i = 2;
                intent2.putExtra("from_scence", 2);
                int b = C45629t0.m50815b(iVar2.mo103068y(bVar4, f4Var2), bVar2.mo91577r());
                intent2.putExtra("prePublishId", "msg_" + Long.toString(f4Var.mo108774y2()));
                intent2.putExtra("preUsername", iVar2.mo103068y(bVar4, f4Var2));
                intent2.putExtra("preChatName", bVar2.mo91577r());
                intent2.putExtra("preChatTYPE", b);
                intent2.putExtra("preMsgIndex", 0);
                if (b == 1) {
                    i = 3;
                } else if (b != 2) {
                    i = (b == 6 || b == 7) ? 5 : 0;
                }
                intent2.putExtra("share_report_pre_msg_url", bVar3.f195586j);
                intent2.putExtra("share_report_pre_msg_title", bVar3.f195570f);
                intent2.putExtra("share_report_pre_msg_desc", bVar3.f195574g);
                intent2.putExtra("share_report_pre_msg_icon_url", bVar3.f195646y);
                intent2.putExtra("share_report_pre_msg_appid", bVar3.f195562d);
                intent2.putExtra("geta8key_scene", 1);
                intent2.putExtra("share_report_from_scene", i);
                if (i == 5) {
                    intent2.putExtra("share_report_biz_username", bVar2.mo91577r());
                }
                C68065f fVar = (C68065f) bVar3.mo93555w(C68065f.class);
                int i2 = fVar != null ? fVar.f195417b : -1;
                intent2.putExtra(C74928u.C45093i.f122318j, i2);
                intent2.putExtra("key_enable_teen_mode_check", true);
                intent2.putExtra("msgUsername", bVar4.f193285i);
                intent2.putExtra("serverMsgID", String.valueOf(f4Var.mo108774y2()));
                if (fVar == null || i2 != 16) {
                    C74244u.m88496g(bVar3, bVar4, intent2);
                    if (!((C45696d) C86709a0.m107533q(cls2)).mo70957E5(3) || !((C45696d) C86709a0.m107533q(cls2)).Ms0(bVar2.mo91565f(), str3, i2, false, 1, intExtra, intent2)) {
                        intent2.putExtra("pay_chat_type", C76528a.m92004a(bVar2.mo91577r()));
                        C88144b.m109791i(bVar2.mo91565f(), "webview", ".ui.tools.WebViewUI", intent2, (Bundle) null);
                        return true;
                    }
                    Log.m105924i("MicroMsg.ChattingItemAppMsgTo", "jump to TmplWebview");
                    return true;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putInt("biz_video_scene", 1);
                bundle2.putInt(C74928u.C74929b.f220309a, intExtra);
                bundle2.putInt("geta8key_scene", 1);
                bundle2.putString("geta8key_username", bVar2.mo91577r());
                bundle2.putString("webpageTitle", bVar3.f195570f);
                if (r0Var != null && !Util.isNullOrNil(r0Var.f260345b)) {
                    C39750a.f106644a.mo62388d(r0Var.f260345b);
                }
                C75308c.m90328a(bVar2.mo91565f(), f4Var.getMsgId(), f4Var.mo108774y2(), 0, bundle2);
                return true;
            }
            w25 w25 = new w25();
            w25.f259899d = r0Var.f260345b;
            w25.f259900e = r0Var.f260346c;
            w25.f259901f = r0Var.f260347d;
            w25.f259902g = r0Var.f260348e;
            w25.f259903h = r0Var.f260349f;
            w25.f259904i = r0Var.f260358o;
            w25.f259905j = r0Var.f260350g;
            w25.f259906n = r0Var.f260351h;
            w25.f259907o = r0Var.f260352i;
            w25.f259908p = r0Var.f260353j;
            w25.f259909q = r0Var.f260354k;
            w25.f259910r = r0Var.f260355l;
            w25.f259911s = r0Var.f260356m;
            w25.f259912t = r0Var.f260357n;
            w25.f259913u = r0Var.f260359p;
            w25.f259915w = r0Var.f260361r;
            w25.f259916x = r0Var.f260362s;
            w25.f259918z = r0Var.f260364u;
            w25.f259914v = r0Var.f260360q;
            C101987v0.m134280n(bVar2.mo91565f(), C21914h.m25167o(w25, 32, bVar2.mo91565f().getString(C0966R.string.f3q)));
            C21915i.m25173e(w25, f4Var2);
            return true;
        }

        /* renamed from: z0 */
        public static boolean m88554z0(long j, String str, C67391b bVar) {
            C72683d qq = C72709y1.vx0().mo100154qq(str);
            if (qq == null || !qq.mo100146l2()) {
                return false;
            }
            C72963f4 b002 = ((C72972g4) C97625j3.m125812b().mo105911z()).b00(j);
            if (b002.mo100972K3()) {
                Log.m105925i("MicroMsg.ChattingItemAppMsgTo", "openImg:: msg is clean, attachId %s, msgId: %d, msgSvrId: %d, imgPath: %s", str, Long.valueOf(j), Long.valueOf(b002.mo108774y2()), b002.mo108765s2());
                Intent intent = new Intent();
                intent.setClassName(bVar.mo91565f(), "com.tencent.mm.ui.chatting.ResourcesExceedUI");
                intent.putExtra("clean_view_type", 1);
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                C117292a.m165358d(bVar, aVar.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsg$ChattingItemAppMsgTo", "openImg", "(JLjava/lang/String;Lcom/tencent/mm/ui/chatting/context/ChattingContext;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                bVar.mo91556Q((Intent) aVar.mo10231a(0));
                C117292a.m165359e(bVar, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsg$ChattingItemAppMsgTo", "openImg", "(JLjava/lang/String;Lcom/tencent/mm/ui/chatting/context/ChattingContext;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return true;
            }
            Intent intent2 = new Intent(bVar.mo91565f(), ShowImageUI.class);
            intent2.putExtra("key_image_path", qq.field_fileFullPath);
            intent2.putExtra("key_message_id", j);
            intent2.putExtra("key_favorite", true);
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(intent2);
            C117292a.m165358d(bVar, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsg$ChattingItemAppMsgTo", "openImg", "(JLjava/lang/String;Lcom/tencent/mm/ui/chatting/context/ChattingContext;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            bVar.mo91556Q((Intent) aVar2.mo10231a(0));
            C117292a.m165359e(bVar, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsg$ChattingItemAppMsgTo", "openImg", "(JLjava/lang/String;Lcom/tencent/mm/ui/chatting/context/ChattingContext;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }

        /* renamed from: A0 */
        public final void mo103266A0(C74255e eVar, C79368l lVar, C72963f4 f4Var) {
            if (f4Var.getStatus() != 2 || !mo103080N(lVar, f4Var.getMsgId())) {
                ImageView imageView = eVar.f218022B;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    return;
                }
                return;
            }
            ImageView imageView2 = eVar.f218022B;
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            }
        }

        /* renamed from: E */
        public View mo26231E(LayoutInflater layoutInflater, View view) {
            if (view != null && view.getTag() != null) {
                return view;
            }
            C6807n4 n4Var = new C6807n4(layoutInflater, C0966R.C0971layout.f6931sj);
            C74255e eVar = new C74255e();
            eVar.mo103258d(n4Var, false);
            n4Var.setTag(eVar);
            return n4Var;
        }

        /* renamed from: R */
        public boolean mo26232R() {
            return true;
        }

        /* renamed from: X */
        public boolean mo26233X(MenuItem menuItem, C67391b bVar, C72963f4 f4Var) {
            C68070l.C68072b u;
            String content;
            C68070l.C68072b u2;
            int itemId = menuItem.getItemId();
            if (itemId == 103) {
                String content2 = f4Var.getContent();
                if (!(content2 == null || (u = C68070l.C68072b.m80422u(content2, (String) null)) == null || u.f195582i != 16)) {
                    GiftCardEvent giftCardEvent = new GiftCardEvent();
                    GiftCardEvent.C67716a aVar = giftCardEvent.f193670d;
                    aVar.f193671a = u.f195522Q0;
                    aVar.f193672b = f4Var.getMsgId();
                    giftCardEvent.f193670d.f193673c = f4Var.mo108768t();
                    giftCardEvent.publish();
                }
            } else if (itemId != 111) {
                if (!(itemId != 114 || (content = f4Var.getContent()) == null || (u2 = C68070l.C68072b.m80422u(content, (String) null)) == null)) {
                    switch (C74244u.m88491b(f4Var, u2)) {
                        case 1:
                            C73745l4.m87344e(C75604z3.m90840l(bVar.mo91583x(), f4Var.getContent(), f4Var.mo108769t2()), bVar.mo91565f());
                            break;
                        case 2:
                            C73745l4.m87343d(f4Var, bVar.mo91565f(), mo103068y(bVar, f4Var), bVar.mo91583x());
                            break;
                        case 3:
                            C73745l4.m87341b(f4Var, C75604z3.m90840l(bVar.mo91583x(), f4Var.getContent(), f4Var.mo108769t2()), bVar.mo91565f(), 512);
                            break;
                        case 4:
                            C73745l4.m87345f(f4Var, bVar.mo91565f());
                            break;
                        case 5:
                            C73745l4.m87341b(f4Var, C75604z3.m90840l(bVar.mo91583x(), f4Var.getContent(), f4Var.mo108769t2()), bVar.mo91565f(), 128);
                            break;
                        case 6:
                            C73745l4.m87341b(f4Var, C75604z3.m90840l(bVar.mo91583x(), f4Var.getContent(), f4Var.mo108769t2()), bVar.mo91565f(), 256);
                            break;
                        case 8:
                            C73745l4.m87342c(f4Var, bVar.mo91565f());
                            break;
                    }
                }
                return false;
            } else {
                C6789c.m7088a(f4Var, bVar.mo91565f(), new u$g$$a(this, bVar, f4Var));
                return false;
            }
            return false;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:47:0x011e, code lost:
            if (rb0.C48009v0.Fx0().mo72759TO(512) > 0) goto L_0x0120;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:0x017a, code lost:
            if (rb0.C48009v0.Fx0().mo72759TO(64) > 0) goto L_0x0120;
         */
        /* JADX WARNING: Removed duplicated region for block: B:102:0x022e  */
        /* JADX WARNING: Removed duplicated region for block: B:74:0x01a8  */
        /* renamed from: Z */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo26235Z(nj3.C76874e0 r17, android.view.View r18, android.view.ContextMenu.ContextMenuInfo r19, com.tencent.p014mm.storage.C72963f4 r20) {
            /*
                r16 = this;
                r0 = r16
                r1 = r20
                java.lang.Class<ym.l> r2 = p763ym.C79138l.class
                java.lang.Object r3 = r18.getTag()
                com.tencent.mm.ui.chatting.viewitems.t8 r3 = (com.tencent.p014mm.p136ui.chatting.viewitems.C74243t8) r3
                int r3 = r3.mo103252b()
                java.lang.String r4 = r20.getContent()
                r10 = 1
                if (r4 != 0) goto L_0x0018
                return r10
            L_0x0018:
                ck3.b r4 = r0.f218106v
                boolean r4 = r4.mo91583x()
                java.lang.String r5 = r20.getContent()
                int r6 = r20.mo108769t2()
                java.lang.String r4 = eb0.C75604z3.m90840l(r4, r5, r6)
                r5 = 0
                com.tencent.mm.message.l$b r11 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r4, r5)
                if (r11 != 0) goto L_0x0032
                return r10
            L_0x0032:
                di3.d r4 = di3.C86312j.m106911c(r2)
                ym.l r4 = (p763ym.C79138l) r4
                java.lang.String r5 = r11.f195562d
                r12 = 0
                com.tencent.mm.pluginsdk.model.app.j r13 = r4.mo73990GW(r5, r12)
                boolean r4 = eb0.C75569c4.m90690w(r20)
                r14 = 19
                if (r4 != 0) goto L_0x008e
                boolean r4 = eb0.C75569c4.m90687t(r20)
                if (r4 != 0) goto L_0x008e
                di3.d r2 = di3.C86312j.m106911c(r2)
                ym.l r2 = (p763ym.C79138l) r2
                boolean r2 = r2.E10(r13)
                if (r2 == 0) goto L_0x008e
                boolean r2 = com.tencent.p014mm.p136ui.chatting.C74343y0.m88768l(r20)
                if (r2 != 0) goto L_0x008e
                boolean r2 = com.tencent.p014mm.p136ui.chatting.C74343y0.m88767k(r20)
                if (r2 != 0) goto L_0x008e
                boolean r2 = com.tencent.p014mm.p136ui.chatting.C74343y0.m88748G(r20)
                if (r2 != 0) goto L_0x008e
                int r2 = r11.f195582i
                if (r2 != r14) goto L_0x0075
                int r2 = r20.getStatus()
                if (r2 == r10) goto L_0x008e
            L_0x0075:
                r6 = 111(0x6f, float:1.56E-43)
                r7 = 0
                ck3.b r2 = r0.f218106v
                android.content.res.Resources r2 = r2.mo91572m()
                r4 = 2131834845(0x7f1137dd, float:1.9302812E38)
                java.lang.String r8 = r2.getString(r4)
                r9 = 2131756158(0x7f10047e, float:1.9143216E38)
                r4 = r17
                r5 = r3
                r4.mo107136c(r5, r6, r7, r8, r9)
            L_0x008e:
                boolean r2 = r20.mo101000j3()
                if (r2 != 0) goto L_0x0098
                int r2 = r1.f230728K
                if (r2 != r10) goto L_0x00c9
            L_0x0098:
                ck3.b r2 = r0.f218106v
                boolean r2 = r0.mo103083Q(r1, r2)
                if (r2 == 0) goto L_0x00c9
                java.lang.String r2 = r20.mo108768t()
                boolean r2 = r0.mo103081O(r2)
                if (r2 == 0) goto L_0x00c9
                ck3.b r2 = r0.f218106v
                boolean r2 = r2.mo91580u()
                if (r2 != 0) goto L_0x00c9
                r6 = 123(0x7b, float:1.72E-43)
                r7 = 0
                android.content.Context r2 = r18.getContext()
                r4 = 2131823560(0x7f110bc8, float:1.9279923E38)
                java.lang.String r8 = r2.getString(r4)
                r9 = 2131756134(0x7f100466, float:1.9143167E38)
                r4 = r17
                r5 = r3
                r4.mo107136c(r5, r6, r7, r8, r9)
            L_0x00c9:
                int r2 = com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.m88491b(r1, r11)
                r4 = 8
                r15 = 2131823546(0x7f110bba, float:1.9279895E38)
                if (r2 == r4) goto L_0x0170
                r4 = 16
                if (r2 == r4) goto L_0x0146
                r4 = 34
                if (r2 == r4) goto L_0x012c
                switch(r2) {
                    case 1: goto L_0x0127;
                    case 2: goto L_0x0122;
                    case 3: goto L_0x0114;
                    case 4: goto L_0x010e;
                    case 5: goto L_0x0108;
                    case 6: goto L_0x00e1;
                    default: goto L_0x00df;
                }
            L_0x00df:
                goto L_0x0152
            L_0x00e1:
                boolean r2 = rb0.C47984k.m53329c()
                java.lang.String r4 = r11.f195602n
                boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isImageExt(r4)
                if (r4 != 0) goto L_0x017d
                r6 = 150(0x96, float:2.1E-43)
                r7 = 0
                ck3.b r4 = r0.f218106v
                android.content.res.Resources r4 = r4.mo91572m()
                r5 = 2131823555(0x7f110bc3, float:1.9279913E38)
                java.lang.String r8 = r4.getString(r5)
                r9 = 2131756111(0x7f10044f, float:1.914312E38)
                r4 = r17
                r5 = r3
                r4.mo107136c(r5, r6, r7, r8, r9)
                goto L_0x017d
            L_0x0108:
                boolean r2 = rb0.C47984k.m53331e()
                goto L_0x017d
            L_0x010e:
                boolean r2 = rb0.C47984k.m53333g()
                goto L_0x017d
            L_0x0114:
                rb0.j r2 = rb0.C48009v0.Fx0()
                r4 = 512(0x200, float:7.175E-43)
                int r2 = r2.mo72759TO(r4)
                if (r2 <= 0) goto L_0x0152
            L_0x0120:
                r2 = 1
                goto L_0x017d
            L_0x0122:
                boolean r2 = rb0.C47984k.m53330d()
                goto L_0x017d
            L_0x0127:
                boolean r2 = rb0.C47984k.m53332f()
                goto L_0x017d
            L_0x012c:
                r17.clear()
                r6 = 100
                r7 = 0
                ck3.b r1 = r0.f218106v
                android.content.res.Resources r1 = r1.mo91572m()
                java.lang.String r8 = r1.getString(r15)
                r9 = 2131756004(0x7f1003e4, float:1.9142903E38)
                r4 = r17
                r5 = r3
                r4.mo107136c(r5, r6, r7, r8, r9)
                return r12
            L_0x0146:
                int r2 = r11.f195531T0
                r4 = 5
                r5 = 2
                if (r2 == r4) goto L_0x0154
                r4 = 6
                if (r2 == r4) goto L_0x0154
                if (r2 != r5) goto L_0x0152
                goto L_0x0154
            L_0x0152:
                r2 = 0
                goto L_0x017d
            L_0x0154:
                if (r2 == r5) goto L_0x0159
                r17.clear()
            L_0x0159:
                r6 = 100
                r7 = 0
                ck3.b r1 = r0.f218106v
                android.content.res.Resources r1 = r1.mo91572m()
                java.lang.String r8 = r1.getString(r15)
                r9 = 2131756004(0x7f1003e4, float:1.9142903E38)
                r4 = r17
                r5 = r3
                r4.mo107136c(r5, r6, r7, r8, r9)
                return r12
            L_0x0170:
                rb0.j r2 = rb0.C48009v0.Fx0()
                r4 = 64
                int r2 = r2.mo72759TO(r4)
                if (r2 <= 0) goto L_0x0152
                goto L_0x0120
            L_0x017d:
                boolean r4 = eb0.C75569c4.m90690w(r20)
                if (r4 != 0) goto L_0x01a0
                if (r2 == 0) goto L_0x01a0
                ck3.b r2 = r0.f218106v
                boolean r2 = r2.mo91584y()
                if (r2 != 0) goto L_0x01a0
                r2 = 114(0x72, float:1.6E-43)
                android.content.Context r4 = r18.getContext()
                r5 = 2131823541(0x7f110bb5, float:1.9279885E38)
                java.lang.String r4 = r4.getString(r5)
                r9 = r17
                r9.add((int) r3, (int) r2, (int) r12, (java.lang.CharSequence) r4)
                goto L_0x01a2
            L_0x01a0:
                r9 = r17
            L_0x01a2:
                boolean r2 = eb0.C75569c4.m90690w(r20)
                if (r2 != 0) goto L_0x01f3
                java.lang.String r2 = "favorite"
                ke3.C88144b.m109788f(r2)
                if (r13 == 0) goto L_0x01b5
                boolean r2 = r13.mo69359k()
                if (r2 != 0) goto L_0x01f3
            L_0x01b5:
                int r2 = r11.f195617q2
                if (r2 != 0) goto L_0x01f3
                int r2 = com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.m88491b(r1, r11)
                r4 = 10
                if (r2 == r4) goto L_0x01db
                r4 = 13
                if (r2 == r4) goto L_0x01db
                r4 = 24
                if (r2 == r4) goto L_0x01db
                r4 = 33
                if (r2 == r4) goto L_0x01db
                r4 = 36
                if (r2 == r4) goto L_0x01db
                if (r2 == r14) goto L_0x01db
                r4 = 20
                if (r2 == r4) goto L_0x01db
                switch(r2) {
                    case 1: goto L_0x01db;
                    case 2: goto L_0x01db;
                    case 3: goto L_0x01db;
                    case 4: goto L_0x01db;
                    case 5: goto L_0x01db;
                    case 6: goto L_0x01db;
                    default: goto L_0x01da;
                }
            L_0x01da:
                goto L_0x01f3
            L_0x01db:
                r6 = 116(0x74, float:1.63E-43)
                r7 = 0
                android.content.Context r2 = r18.getContext()
                r4 = 2131834033(0x7f1134b1, float:1.9301165E38)
                java.lang.String r8 = r2.getString(r4)
                r2 = 2131756032(0x7f100400, float:1.914296E38)
                r4 = r17
                r5 = r3
                r9 = r2
                r4.mo107136c(r5, r6, r7, r8, r9)
            L_0x01f3:
                com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent r2 = new com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent
                r2.<init>()
                com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent$a r4 = r2.f236178d
                long r5 = r20.getMsgId()
                r4.f236180a = r5
                r2.publish()
                boolean r1 = eb0.C75569c4.m90690w(r20)
                if (r1 != 0) goto L_0x0226
                com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent$b r1 = r2.f236179e
                boolean r1 = r1.f236182a
                if (r1 == 0) goto L_0x0226
                r6 = 129(0x81, float:1.81E-43)
                r7 = 0
                android.content.Context r1 = r18.getContext()
                r2 = 2131823554(0x7f110bc2, float:1.927991E38)
                java.lang.String r8 = r1.getString(r2)
                r9 = 2131756110(0x7f10044e, float:1.9143118E38)
                r4 = r17
                r5 = r3
                r4.mo107136c(r5, r6, r7, r8, r9)
            L_0x0226:
                ck3.b r1 = r0.f218106v
                boolean r1 = r1.mo91584y()
                if (r1 != 0) goto L_0x0244
                r6 = 100
                r7 = 0
                ck3.b r1 = r0.f218106v
                android.content.res.Resources r1 = r1.mo91572m()
                java.lang.String r8 = r1.getString(r15)
                r9 = 2131756004(0x7f1003e4, float:1.9142903E38)
                r4 = r17
                r5 = r3
                r4.mo107136c(r5, r6, r7, r8, r9)
            L_0x0244:
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.C74261g.mo26235Z(nj3.e0, android.view.View, android.view.ContextMenu$ContextMenuInfo, com.tencent.mm.storage.f4):boolean");
        }

        /* renamed from: a */
        public void mo70162a(View view, C67391b bVar, C72963f4 f4Var) {
            C76879j.m92707A(bVar.mo91565f(), bVar.mo91572m().getString(C0966R.string.f360268bb1), "", bVar.mo91572m().getString(C0966R.string.a2j), bVar.mo91572m().getString(C0966R.string.f7926wf), new u$g$$c(this, f4Var, bVar), new u$g$$d(this));
        }

        /* JADX WARNING: Removed duplicated region for block: B:91:0x01c7 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:92:0x01c8 A[RETURN] */
        /* renamed from: a0 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo26236a0(android.view.View r24, ck3.C67391b r25, com.tencent.p014mm.storage.C72963f4 r26) {
            /*
                r23 = this;
                r8 = r23
                r9 = r24
                r10 = r25
                r11 = r26
                java.lang.Class<ky2.i> r12 = ky2.C10432i.class
                java.lang.Class<i21.h> r0 = i21.C98591h.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                i21.h r0 = (i21.C98591h) r0
                java.lang.String r1 = r26.mo108768t()
                r0.Gr0(r1)
                java.lang.Object r0 = r24.getTag()
                com.tencent.mm.ui.chatting.viewitems.t8 r0 = (com.tencent.p014mm.p136ui.chatting.viewitems.C74243t8) r0
                java.lang.String r0 = r26.getContent()
                r13 = 0
                if (r0 != 0) goto L_0x0027
                return r13
            L_0x0027:
                r14 = 0
                com.tencent.mm.message.l$b r15 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r0, r14)
                if (r15 != 0) goto L_0x002f
                return r13
            L_0x002f:
                java.lang.Class<ym.l> r0 = p763ym.C79138l.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                ym.l r0 = (p763ym.C79138l) r0
                java.lang.String r1 = r15.f195562d
                com.tencent.mm.pluginsdk.model.app.j r7 = r0.getAppInfo(r1)
                if (r7 == 0) goto L_0x0061
                java.lang.String r0 = r7.field_appId
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                if (r0 != 0) goto L_0x0061
                java.lang.String r3 = eb0.C75592q0.m90789s()
                long r5 = r26.mo108774y2()
                java.lang.String r16 = r25.mo91577r()
                r0 = r23
                r1 = r25
                r2 = r15
                r4 = r7
                r17 = r7
                r7 = r16
                r0.mo103094j(r1, r2, r3, r4, r5, r7)
                goto L_0x0063
            L_0x0061:
                r17 = r7
            L_0x0063:
                int r0 = com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.m88491b(r11, r15)
                r1 = 3
                r2 = 2
                r7 = 1
                if (r0 == r1) goto L_0x031a
                r1 = 4
                if (r0 == r1) goto L_0x0318
                r1 = 5
                if (r0 == r1) goto L_0x0313
                r1 = 6
                if (r0 == r1) goto L_0x028d
                r1 = 7
                if (r0 == r1) goto L_0x0260
                r1 = 10
                r2 = 65536(0x10000, float:9.18355E-41)
                if (r0 == r1) goto L_0x0227
                r1 = 13
                if (r0 == r1) goto L_0x01fd
                r1 = 16
                java.lang.String r3 = "card"
                if (r0 == r1) goto L_0x01d4
                r1 = 24
                if (r0 == r1) goto L_0x01d0
                r1 = 36
                if (r0 == r1) goto L_0x01c9
                r1 = 44
                if (r0 == r1) goto L_0x01a8
                r1 = 48
                if (r0 == r1) goto L_0x019f
                r1 = 68
                if (r0 == r1) goto L_0x0198
                r1 = 19
                if (r0 == r1) goto L_0x0185
                r1 = 20
                if (r0 == r1) goto L_0x014c
                r1 = 33
                if (r0 == r1) goto L_0x01a8
                r1 = 34
                if (r0 == r1) goto L_0x010a
                r1 = 83
                if (r0 == r1) goto L_0x00e2
                r1 = 84
                if (r0 == r1) goto L_0x00b7
            L_0x00b4:
                r0 = 1
                goto L_0x01bf
            L_0x00b7:
                di3.d r0 = di3.C86312j.m106911c(r12)
                r9 = r0
                ky2.i r9 = (ky2.C10432i) r9
                android.app.Activity r0 = r25.mo91565f()
                java.lang.String r1 = r25.mo91577r()
                java.lang.String r12 = eb0.C75592q0.m90789s()
                long r13 = r26.getCreateTime()
                long r15 = r26.mo108774y2()
                java.lang.String r17 = r26.getContent()
                java.lang.String r18 = r26.mo108765s2()
                java.lang.Boolean r19 = java.lang.Boolean.TRUE
                r10 = r0
                r11 = r1
                r9.mo10744WJ(r10, r11, r12, r13, r15, r17, r18, r19)
                return r7
            L_0x00e2:
                di3.d r0 = di3.C86312j.m106911c(r12)
                r16 = r0
                ky2.i r16 = (ky2.C10432i) r16
                android.app.Activity r17 = r25.mo91565f()
                java.lang.String r0 = r15.f195591k0
                java.lang.String r19 = eb0.C75592q0.m90789s()
                java.lang.Class<t90.d> r1 = t90.C13867d.class
                com.tencent.mm.message.g r1 = r15.mo93555w(r1)
                t90.d r1 = (t90.C13867d) r1
                java.lang.String r1 = r1.f39030b
                long r21 = r26.getCreateTime()
                r18 = r0
                r20 = r1
                r16.dt0(r17, r18, r19, r20, r21)
                return r7
            L_0x010a:
                android.content.Intent r0 = new android.content.Intent
                r0.<init>()
                int r1 = r15.f195534U0
                java.lang.String r2 = "key_biz_uin"
                r0.putExtra(r2, r1)
                java.lang.String r1 = r15.f195537V0
                java.lang.String r2 = "key_order_id"
                r0.putExtra(r2, r1)
                java.lang.String r1 = r26.mo108768t()
                if (r1 == 0) goto L_0x0142
                java.lang.String r1 = r26.mo108768t()
                java.lang.String r2 = ""
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0142
                java.lang.String r1 = r26.mo108768t()
                boolean r1 = com.tencent.p014mm.storage.C72996z1.m85820U5(r1)
                if (r1 == 0) goto L_0x0142
                java.lang.String r1 = r26.mo108768t()
                java.lang.String r2 = "key_chatroom_name"
                r0.putExtra(r2, r1)
            L_0x0142:
                android.app.Activity r1 = r25.mo91565f()
                java.lang.String r2 = ".ui.CardGiftAcceptUI"
                ke3.C88144b.m109791i(r1, r3, r2, r0, r14)
                return r7
            L_0x014c:
                java.lang.String r0 = r15.f195567e0
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                if (r0 == 0) goto L_0x0155
                return r13
            L_0x0155:
                android.content.Intent r0 = new android.content.Intent
                r0.<init>()
                r0.setFlags(r2)
                java.lang.String r1 = r15.f195567e0
                java.lang.String r2 = "key_TV_xml"
                r0.putExtra(r2, r1)
                java.lang.String r1 = "key_TV_getProductInfoScene"
                r0.putExtra(r1, r7)
                java.lang.String r1 = r26.mo108765s2()
                if (r1 != 0) goto L_0x0178
                long r1 = r26.getMsgId()
                java.lang.String r3 = "key_TVInfoUI_chatting_msgId"
                r0.putExtra(r3, r1)
            L_0x0178:
                android.app.Activity r1 = r25.mo91565f()
                java.lang.String r2 = "shake"
                java.lang.String r3 = ".ui.TVInfoUI"
                ke3.C88144b.m109791i(r1, r2, r3, r0, r14)
                return r7
            L_0x0185:
                r3 = 19
                java.lang.String r4 = r8.mo103068y(r10, r11)
                r0 = r24
                r1 = r25
                r2 = r26
                r5 = r23
                boolean r0 = m88550v0(r0, r1, r2, r3, r4, r5)
                return r0
            L_0x0198:
                boolean r0 = com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.m88492c(r15, r9, r10, r8, r11)
                if (r0 == 0) goto L_0x00b4
                return r7
            L_0x019f:
                boolean r0 = m88548t0(r15, r10, r8, r11)
                if (r0 == 0) goto L_0x01a6
                return r7
            L_0x01a6:
                r0 = 0
                goto L_0x01bf
            L_0x01a8:
                com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r0 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.SessionAppbrand
                android.app.Activity r1 = r25.mo91565f()
                boolean r0 = r0.checkAvailable(r1)
                if (r0 != 0) goto L_0x01b5
                return r7
            L_0x01b5:
                boolean r0 = m88547s0(r15, r10, r8, r11)
                if (r0 == 0) goto L_0x00b4
                com.tencent.p014mm.p136ui.chatting.component.C19729d.m21410g6(r10, r9, r11)
                return r7
            L_0x01bf:
                if (r0 == 0) goto L_0x01c8
                boolean r0 = m88549u0(r15, r9, r10, r8, r11)
                if (r0 == 0) goto L_0x01c8
                return r7
            L_0x01c8:
                return r13
            L_0x01c9:
                m88552x0(r15, r10, r8, r11)
                com.tencent.p014mm.p136ui.chatting.component.C19729d.m21410g6(r10, r9, r11)
                return r7
            L_0x01d0:
                com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.m88500k(r15, r10, r11)
                return r7
            L_0x01d4:
                java.lang.String r0 = r15.f195522Q0
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                if (r0 == 0) goto L_0x01dd
                return r13
            L_0x01dd:
                android.content.Intent r0 = new android.content.Intent
                r0.<init>()
                r0.setFlags(r2)
                java.lang.String r1 = r15.f195522Q0
                java.lang.String r2 = "key_card_app_msg"
                r0.putExtra(r2, r1)
                int r1 = r15.f195531T0
                java.lang.String r2 = "key_from_scene"
                r0.putExtra(r2, r1)
                android.app.Activity r1 = r25.mo91565f()
                java.lang.String r2 = ".ui.CardDetailUI"
                ke3.C88144b.m109791i(r1, r3, r2, r0, r14)
                return r7
            L_0x01fd:
                java.lang.String r0 = r15.f195579h0
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                if (r0 == 0) goto L_0x0206
                return r13
            L_0x0206:
                android.content.Intent r0 = new android.content.Intent
                r0.<init>()
                r0.setFlags(r2)
                java.lang.String r1 = r15.f195579h0
                java.lang.String r2 = "key_product_info"
                r0.putExtra(r2, r1)
                java.lang.String r1 = "key_product_scene"
                r0.putExtra(r1, r7)
                android.app.Activity r1 = r25.mo91565f()
                java.lang.String r2 = "product"
                java.lang.String r3 = ".ui.MallProductUI"
                ke3.C88144b.m109791i(r1, r2, r3, r0, r14)
                return r7
            L_0x0227:
                java.lang.String r0 = r15.f195555b0
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                if (r0 == 0) goto L_0x0230
                return r13
            L_0x0230:
                android.content.Intent r0 = new android.content.Intent
                r0.<init>()
                r0.setFlags(r2)
                java.lang.String r1 = r15.f195555b0
                java.lang.String r2 = "key_Product_xml"
                r0.putExtra(r2, r1)
                java.lang.String r1 = "key_ProductUI_getProductInfoScene"
                r0.putExtra(r1, r7)
                java.lang.String r1 = r26.mo108765s2()
                if (r1 != 0) goto L_0x0253
                long r1 = r26.getMsgId()
                java.lang.String r3 = "key_ProductUI_chatting_msgId"
                r0.putExtra(r3, r1)
            L_0x0253:
                android.app.Activity r1 = r25.mo91565f()
                java.lang.String r2 = "scanner"
                java.lang.String r3 = ".ui.ProductUI"
                ke3.C88144b.m109791i(r1, r2, r3, r0, r14)
                return r7
            L_0x0260:
                r2 = r17
                if (r2 == 0) goto L_0x0271
                boolean r0 = r2.mo69359k()
                if (r0 == 0) goto L_0x0271
                boolean r0 = r8.mo103086e(r10, r2)
                if (r0 == 0) goto L_0x0271
                return r7
            L_0x0271:
                java.lang.Class<zj3.b> r0 = zj3.C79339b.class
                com.tencent.mm.ui.chatting.manager.a r1 = r10.f193278b
                xi.d r0 = r1.mo102812a(r0)
                r6 = r0
                zj3.b r6 = (zj3.C79339b) r6
                com.tencent.mm.ui.chatting.viewitems.u$g$$b r9 = new com.tencent.mm.ui.chatting.viewitems.u$g$$b
                r0 = r9
                r1 = r23
                r3 = r25
                r4 = r15
                r5 = r26
                r0.<init>(r1, r2, r3, r4, r5)
                r6.mo102380Y3(r11, r9)
                return r7
            L_0x028d:
                eb0.c r0 = eb0.C97625j3.m125812b()
                boolean r0 = r0.mo105883I()
                if (r0 != 0) goto L_0x02a5
                android.app.Activity r0 = r25.mo91565f()
                com.tencent.mm.ui.chatting.BaseChattingUIFragment r1 = r10.f193286j
                android.view.View r1 = r1.getContentView()
                nj3.C76912y0.m92771j(r0, r1)
                return r7
            L_0x02a5:
                java.lang.String r0 = r15.f195602n
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isImageExt(r0)
                if (r0 == 0) goto L_0x02ba
                long r0 = r26.getMsgId()
                java.lang.String r3 = r15.f195606o
                boolean r0 = m88554z0(r0, r3, r10)
                if (r0 == 0) goto L_0x02ba
                return r7
            L_0x02ba:
                android.content.Intent r0 = new android.content.Intent
                r0.<init>()
                android.app.Activity r1 = r25.mo91565f()
                java.lang.String r3 = "com.tencent.mm.ui.chatting.AppAttachDownloadUI"
                r0.setClassName(r1, r3)
                java.lang.String r1 = "scene"
                r0.putExtra(r1, r2)
                long r1 = r26.getMsgId()
                java.lang.String r3 = "app_msg_id"
                r0.putExtra(r3, r1)
                k20.a r9 = new k20.a
                r9.<init>()
                r9.mo10233c(r0)
                java.lang.Object[] r1 = r9.mo10232b()
                java.lang.String r2 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsg$ChattingItemAppMsgTo"
                java.lang.String r3 = "onItemClick"
                java.lang.String r4 = "(Landroid/view/View;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)Z"
                java.lang.String r5 = "Undefined"
                java.lang.String r6 = "startActivity"
                java.lang.String r11 = "(Landroid/content/Intent;)V"
                r0 = r25
                r12 = 1
                r7 = r11
                j20.C117292a.m165358d(r0, r1, r2, r3, r4, r5, r6, r7)
                java.lang.Object r0 = r9.mo10231a(r13)
                android.content.Intent r0 = (android.content.Intent) r0
                r10.mo91556Q(r0)
                java.lang.String r1 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsg$ChattingItemAppMsgTo"
                java.lang.String r2 = "onItemClick"
                java.lang.String r3 = "(Landroid/view/View;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)Z"
                java.lang.String r4 = "Undefined"
                java.lang.String r5 = "startActivity"
                java.lang.String r6 = "(Landroid/content/Intent;)V"
                r0 = r25
                j20.C117292a.m165359e(r0, r1, r2, r3, r4, r5, r6)
                return r12
            L_0x0313:
                r12 = 1
                m88553y0(r15, r9, r10, r8, r11)
                return r12
            L_0x0318:
                r12 = 1
                goto L_0x033f
            L_0x031a:
                r12 = 1
                com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r0 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.SessionMusic
                android.app.Activity r3 = r25.mo91565f()
                boolean r0 = r0.checkAvailable(r3)
                if (r0 != 0) goto L_0x0328
                return r12
            L_0x0328:
                com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r3 = 13043(0x32f3, float:1.8277E-41)
                java.lang.Object[] r1 = new java.lang.Object[r1]
                java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
                r1[r13] = r4
                java.lang.String r4 = r15.f195574g
                r1[r12] = r4
                java.lang.String r4 = r15.f195562d
                r1[r2] = r4
                r0.mo160131h(r3, r1)
            L_0x033f:
                m88551w0(r15, r10, r8, r11)
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.C74261g.mo26236a0(android.view.View, ck3.b, com.tencent.mm.storage.f4):boolean");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x012b, code lost:
            r1 = r0.field_appName;
         */
        /* JADX WARNING: Removed duplicated region for block: B:100:0x03be  */
        /* JADX WARNING: Removed duplicated region for block: B:272:0x0996  */
        /* JADX WARNING: Removed duplicated region for block: B:574:0x1493  */
        /* JADX WARNING: Removed duplicated region for block: B:591:0x1500  */
        /* JADX WARNING: Removed duplicated region for block: B:69:0x02fe  */
        /* JADX WARNING: Removed duplicated region for block: B:89:0x0379  */
        /* JADX WARNING: Removed duplicated region for block: B:92:0x039a  */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo26237f(com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.C74026c r35, ck3.C67391b r36, com.tencent.p014mm.storage.C72963f4 r37, java.lang.String r38) {
            /*
                r34 = this;
                r8 = r34
                r9 = r35
                r10 = r36
                r15 = r37
                java.lang.Class<kr0.w0> r11 = kr0.C76629w0.class
                java.lang.Class<zj3.n> r0 = zj3.C79371n.class
                java.lang.Class<kb0.i> r25 = kb0.C76529i.class
                java.lang.Class<ym.l> r12 = p763ym.C79138l.class
                java.lang.Class<zj3.l> r14 = zj3.C79368l.class
                java.lang.Class<gt.k> r26 = p158gt.C98201k.class
                r13 = r9
                com.tencent.mm.ui.chatting.viewitems.u$e r13 = (com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.C74255e) r13
                r8.f218106v = r10
                xi.d r1 = r10.mo91560a(r0)
                zj3.n r1 = (zj3.C79371n) r1
                r1.mo102406W4(r15)
                android.view.View r1 = r9.convertView
                com.tencent.p014mm.p136ui.chatting.component.C19729d.m21411h6(r10, r1, r15)
                android.widget.TextView r1 = r13.f218064j
                if (r1 == 0) goto L_0x0030
                int r2 = r13.f218081r0
                r1.setMaxLines(r2)
            L_0x0030:
                java.lang.String r6 = r37.getContent()
                xi.d r0 = r10.mo91560a(r0)
                zj3.n r0 = (zj3.C79371n) r0
                r0.mo102405C3(r15)
                r7 = 0
                if (r6 == 0) goto L_0x004f
                java.lang.String r0 = r37.mo108775z2()
                com.tencent.mm.message.l$b r0 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r6, r0)
                com.tencent.mm.message.o r1 = com.tencent.p014mm.message.C68075o.m80440a(r6)
                r5 = r0
                r4 = r1
                goto L_0x0051
            L_0x004f:
                r4 = r7
                r5 = r4
            L_0x0051:
                com.tencent.mm.ui.chatting.viewitems.t8 r3 = new com.tencent.mm.ui.chatting.viewitems.t8
                boolean r0 = r36.mo91583x()
                r3.<init>(r15, r0, r13, r7)
                android.widget.LinearLayout r0 = r13.f218075o0
                r2 = 8
                com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.m88490a(r0, r2)
                if (r5 == 0) goto L_0x1627
                di3.d r0 = di3.C86312j.m106911c(r12)
                ym.l r0 = (p763ym.C79138l) r0
                java.lang.String r7 = r5.f195562d
                int r2 = r5.f195480E
                com.tencent.mm.pluginsdk.model.app.j r0 = r0.mo74003UV(r7, r2)
                com.tencent.mm.ui.widget.MMNeat7extView r2 = r13.f218050c
                java.lang.String r7 = r5.f195570f
                r2.mo104279b(r7)
                android.widget.TextView r2 = r13.f218052d
                java.lang.String r7 = r5.f195574g
                r2.setText(r7)
                android.widget.TextView r2 = r13.f218064j
                r7 = 1
                r2.setMaxLines(r7)
                com.tencent.mm.ui.widget.MMNeat7extView r2 = r13.f218050c
                android.app.Activity r18 = r36.mo91565f()
                android.content.res.Resources r7 = r18.getResources()
                r1 = 2131099800(0x7f060098, float:1.7811963E38)
                int r1 = r7.getColor(r1)
                r2.setTextColor(r1)
                android.widget.TextView r1 = r13.f218052d
                android.app.Activity r2 = r36.mo91565f()
                android.content.res.Resources r2 = r2.getResources()
                r7 = 2131100897(0x7f0604e1, float:1.7814188E38)
                int r2 = r2.getColor(r7)
                r1.setTextColor(r2)
                android.widget.LinearLayout r1 = r13.f218087x
                r2 = 2131231726(0x7f0803ee, float:1.8079541E38)
                r1.setBackgroundResource(r2)
                android.widget.LinearLayout r1 = r13.f218087x
                android.app.Activity r2 = r36.mo91565f()
                android.content.res.Resources r2 = r2.getResources()
                r7 = 2131165574(0x7f070186, float:1.7945369E38)
                int r2 = r2.getDimensionPixelSize(r7)
                r7 = 0
                r1.setPadding(r7, r2, r7, r7)
                com.tencent.mm.ui.MMImageView r1 = r13.f218048b
                r1.setVisibility(r7)
                android.widget.RelativeLayout r1 = r13.f218085v
                r1.setVisibility(r7)
                android.widget.TextView r1 = r13.f218052d
                r1.setVisibility(r7)
                android.view.ViewStub r1 = r13.f218089z
                r2 = 8
                r1.setVisibility(r2)
                android.widget.ImageView r1 = r13.f218021A
                r1.setVisibility(r2)
                android.widget.ImageView r1 = r13.f218074o
                r1.setVisibility(r2)
                android.widget.ImageView r1 = r13.f218072n
                r1.setVisibility(r2)
                android.widget.ImageView r1 = r13.f218066k
                r1.setVisibility(r2)
                android.widget.TextView r1 = r13.f218060h
                r1.setVisibility(r2)
                android.widget.ImageView r1 = r13.f218058g
                r1.setVisibility(r2)
                android.widget.LinearLayout r1 = r13.f218029I
                r1.setVisibility(r2)
                android.widget.LinearLayout r1 = r13.f218023C
                r1.setVisibility(r2)
                android.widget.LinearLayout r1 = r13.f218087x
                r7 = 0
                r1.setVisibility(r7)
                android.widget.LinearLayout r1 = r13.f218038R
                r1.setVisibility(r2)
                android.widget.LinearLayout r1 = r13.f218046Z
                r1.setVisibility(r2)
                android.widget.LinearLayout r1 = r13.f218061h0
                r1.setVisibility(r2)
                android.widget.ImageView r1 = r13.f218071m0
                r1.setVisibility(r2)
                android.widget.FrameLayout r1 = r13.f218086w
                int r7 = r13.f218079q0
                r13.resetChatBubbleWidth(r1, r7)
                if (r0 == 0) goto L_0x013d
                java.lang.String r1 = r0.field_appName
                if (r1 == 0) goto L_0x013d
                java.lang.String r1 = r1.trim()
                int r1 = r1.length()
                if (r1 > 0) goto L_0x013a
                goto L_0x013d
            L_0x013a:
                java.lang.String r1 = r0.field_appName
                goto L_0x013f
            L_0x013d:
                java.lang.String r1 = r5.f195484F
            L_0x013f:
                int r7 = r5.f195582i
                r17 = r14
                r14 = 20
                if (r7 == r14) goto L_0x0155
                java.lang.String r7 = r5.f195562d
                java.lang.String r2 = "wxaf060266bfa9a35c"
                boolean r2 = r2.equals(r7)
                if (r2 == 0) goto L_0x0153
                goto L_0x0155
            L_0x0153:
                r2 = 1
                goto L_0x015d
            L_0x0155:
                wc3.b0 r2 = wc3.C78535a0.m94863b()
                boolean r2 = r2.isShowShakeTV()
            L_0x015d:
                r14 = 19
                if (r2 == 0) goto L_0x020d
                java.lang.String r2 = r5.f195562d
                if (r2 == 0) goto L_0x020d
                int r2 = r2.length()
                if (r2 <= 0) goto L_0x020d
                boolean r2 = r8.mo103084W(r1)
                if (r2 == 0) goto L_0x020d
                di3.d r2 = di3.C86312j.m106911c(r12)
                ym.l r2 = (p763ym.C79138l) r2
                android.app.Activity r7 = r36.mo91565f()
                java.lang.String r1 = r2.mo74019xG(r7, r0, r1)
                int r2 = r5.f195582i
                if (r2 != r14) goto L_0x01a0
                android.widget.TextView r2 = r13.f218054e
                android.app.Activity r7 = r36.mo91565f()
                android.content.res.Resources r7 = r7.getResources()
                r19 = r3
                r14 = 1
                java.lang.Object[] r3 = new java.lang.Object[r14]
                r14 = 0
                r3[r14] = r1
                r1 = 2131833874(0x7f113412, float:1.9300842E38)
                java.lang.String r1 = r7.getString(r1, r3)
                r2.setText(r1)
                goto L_0x01a8
            L_0x01a0:
                r19 = r3
                r14 = 0
                android.widget.TextView r2 = r13.f218054e
                r2.setText(r1)
            L_0x01a8:
                android.widget.LinearLayout r1 = r13.f218062i
                r1.setVisibility(r14)
                android.widget.TextView r1 = r13.f218054e
                r1.setVisibility(r14)
                android.widget.TextView r1 = r13.f218054e
                r7 = 0
                r1.setCompoundDrawables(r7, r7, r7, r7)
                android.widget.ImageView r1 = r13.f218056f
                r1.setVisibility(r14)
                if (r0 == 0) goto L_0x01e9
                boolean r1 = r0.mo69359k()
                if (r1 == 0) goto L_0x01e9
                android.widget.TextView r2 = r13.f218054e
                java.lang.String r3 = r0.field_packageName
                long r28 = r37.mo108774y2()
                r0 = r34
                r1 = r36
                r18 = r3
                r16 = r19
                r3 = r37
                r30 = r4
                r4 = r5
                r14 = r5
                r5 = r18
                r31 = r6
                r18 = r12
                r12 = 84
                r6 = r28
                r0.mo103074H(r1, r2, r3, r4, r5, r6)
                goto L_0x01fb
            L_0x01e9:
                r30 = r4
                r14 = r5
                r31 = r6
                r18 = r12
                r16 = r19
                r12 = 84
                android.widget.TextView r0 = r13.f218054e
                java.lang.String r1 = r14.f195562d
                r8.mo103076J(r10, r0, r1)
            L_0x01fb:
                android.widget.ImageView r0 = r13.f218056f
                r1 = 2131231699(0x7f0803d3, float:1.8079486E38)
                r0.setImageResource(r1)
                android.widget.ImageView r0 = r13.f218056f
                java.lang.String r1 = r14.f195562d
                r8.mo103078L(r10, r0, r1)
                r1 = 8
                goto L_0x0240
            L_0x020d:
                r16 = r3
                r30 = r4
                r14 = r5
                r31 = r6
                r18 = r12
                r12 = 84
                int r0 = r14.f195582i
                r1 = 24
                if (r0 != r1) goto L_0x0245
                android.widget.TextView r0 = r13.f218054e
                android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                r2 = 2131825615(0x7f1113cf, float:1.9284091E38)
                java.lang.String r1 = r1.getString(r2)
                r0.setText(r1)
                android.widget.LinearLayout r0 = r13.f218062i
                r1 = 0
                r0.setVisibility(r1)
                android.widget.TextView r0 = r13.f218054e
                r0.setVisibility(r1)
                android.widget.ImageView r0 = r13.f218056f
                r1 = 8
                r0.setVisibility(r1)
            L_0x0240:
                r7 = r30
            L_0x0242:
                r2 = 0
                goto L_0x02e3
            L_0x0245:
                r1 = 8
                r2 = 83
                if (r0 == r2) goto L_0x02c1
                if (r0 != r12) goto L_0x024f
                goto L_0x02c1
            L_0x024f:
                r2 = 19
                r7 = r30
                if (r0 == r2) goto L_0x02a0
                if (r7 == 0) goto L_0x025c
                int r3 = r7.f195664b
                if (r3 != r2) goto L_0x025c
                goto L_0x02a0
            L_0x025c:
                r2 = 68
                if (r0 != r2) goto L_0x0288
                int r0 = r14.f195633u2
                r2 = 1
                if (r0 != r2) goto L_0x0288
                if (r0 != r2) goto L_0x0242
                android.widget.TextView r0 = r13.f218054e
                android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                r3 = 2131831971(0x7f112ca3, float:1.9296983E38)
                java.lang.String r2 = r2.getString(r3)
                r0.setText(r2)
                android.widget.LinearLayout r0 = r13.f218062i
                r2 = 0
                r0.setVisibility(r2)
                android.widget.TextView r0 = r13.f218054e
                r0.setVisibility(r2)
                android.widget.ImageView r0 = r13.f218056f
                r0.setVisibility(r1)
                goto L_0x0242
            L_0x0288:
                boolean r0 = com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.m88506q(r14, r13)
                if (r0 != 0) goto L_0x0242
                android.widget.LinearLayout r0 = r13.f218062i
                r0.setVisibility(r1)
                android.widget.TextView r0 = r13.f218054e
                r0.setVisibility(r1)
                android.widget.ImageView r0 = r13.f218056f
                r0.setVisibility(r1)
                r0 = 0
                r2 = 0
                goto L_0x02e4
            L_0x02a0:
                android.widget.TextView r0 = r13.f218054e
                android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                r3 = 2131823532(0x7f110bac, float:1.9279866E38)
                java.lang.String r2 = r2.getString(r3)
                r0.setText(r2)
                android.widget.LinearLayout r0 = r13.f218062i
                r2 = 0
                r0.setVisibility(r2)
                android.widget.TextView r0 = r13.f218054e
                r0.setVisibility(r2)
                android.widget.ImageView r0 = r13.f218056f
                r0.setVisibility(r1)
                goto L_0x02e3
            L_0x02c1:
                r7 = r30
                r2 = 0
                android.widget.TextView r0 = r13.f218054e
                android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                r4 = 2131821701(0x7f110485, float:1.9276153E38)
                java.lang.String r3 = r3.getString(r4)
                r0.setText(r3)
                android.widget.LinearLayout r0 = r13.f218062i
                r0.setVisibility(r2)
                android.widget.TextView r0 = r13.f218054e
                r0.setVisibility(r2)
                android.widget.ImageView r0 = r13.f218056f
                r0.setVisibility(r1)
            L_0x02e3:
                r0 = 1
            L_0x02e4:
                android.widget.LinearLayout r3 = r13.f218062i
                r4 = 2131234067(0x7f080d13, float:1.808429E38)
                r3.setBackgroundResource(r4)
                com.tencent.mm.ui.MMImageView r3 = r13.f218048b
                r3.setVisibility(r2)
                boolean r2 = r8.f217197d
                r3 = 3
                r5 = 48
                r1 = 36
                r12 = 33
                r6 = 44
                if (r2 == 0) goto L_0x0379
                int r2 = r14.f195582i
                if (r2 == r12) goto L_0x0330
                if (r2 == r1) goto L_0x0330
                if (r2 == r6) goto L_0x0330
                if (r2 == r5) goto L_0x0330
                java.lang.String r2 = r37.mo108765s2()
                boolean r2 = com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.C74247d.m88512b(r2)
                if (r2 != 0) goto L_0x0330
                di3.d r2 = di3.C86312j.m106911c(r26)
                gt.k r2 = (p158gt.C98201k) r2
                gt.m r2 = r2.mo137277xi()
                java.lang.String r12 = r37.mo108765s2()
                android.app.Activity r30 = r36.mo91565f()
                float r5 = kg3.C76577a.m92156g(r30)
                com.tencent.mm.modelimage.m r2 = (com.tencent.p014mm.modelimage.C92839m) r2
                r6 = 0
                android.graphics.Bitmap r2 = r2.mo127188jo(r12, r5, r6)
                goto L_0x0331
            L_0x0330:
                r2 = 0
            L_0x0331:
                if (r2 == 0) goto L_0x034f
                boolean r5 = r2.isRecycled()
                if (r5 != 0) goto L_0x034f
                android.app.Activity r5 = r36.mo91565f()
                r6 = 1
                int r5 = kg3.C76577a.m92151b(r5, r6)
                float r5 = (float) r5
                r6 = 0
                android.graphics.Bitmap r5 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getRoundedCornerBitmap(r2, r6, r5)
                com.tencent.mm.ui.MMImageView r6 = r13.f218048b
                r6.setImageBitmap(r5)
                r5 = 0
                goto L_0x0350
            L_0x034f:
                r5 = 1
            L_0x0350:
                int r6 = com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.m88491b(r15, r14)
                if (r6 != r3) goto L_0x038a
                android.widget.LinearLayout r6 = r13.f218087x
                android.view.ViewTreeObserver r6 = r6.getViewTreeObserver()
                com.tencent.mm.ui.chatting.viewitems.u$g$$e r12 = new com.tencent.mm.ui.chatting.viewitems.u$g$$e
                r12.<init>(r8, r13, r10, r2)
                r6.addOnPreDrawListener(r12)
                boolean r2 = com.tencent.p014mm.p136ui.C85875k4.m106211z()
                if (r2 == 0) goto L_0x0370
                android.widget.LinearLayout r2 = r13.f218062i
                r2.setBackgroundResource(r4)
                goto L_0x038a
            L_0x0370:
                android.widget.LinearLayout r2 = r13.f218062i
                r4 = 2131231680(0x7f0803c0, float:1.8079448E38)
                r2.setBackgroundResource(r4)
                goto L_0x038a
            L_0x0379:
                com.tencent.mm.ui.MMImageView r2 = r13.f218048b
                android.content.res.Resources r4 = r36.mo91572m()
                r5 = 2131234285(0x7f080ded, float:1.8084731E38)
                android.graphics.Bitmap r4 = android.graphics.BitmapFactory.decodeResource(r4, r5)
                r2.setImageBitmap(r4)
                r5 = 0
            L_0x038a:
                android.widget.ImageView r2 = r13.f218076p
                r4 = 0
                r2.setOnClickListener(r4)
                int r2 = com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.m88491b(r15, r14)
                int r4 = r14.f195582i
                r6 = 66
                if (r4 != r6) goto L_0x03af
                java.lang.String r2 = r14.f195573f2
                boolean r2 = android.text.TextUtils.isEmpty(r2)
                if (r2 == 0) goto L_0x03ad
                java.lang.String r2 = r14.f195577g2
                boolean r2 = android.text.TextUtils.isEmpty(r2)
                if (r2 != 0) goto L_0x03ab
                goto L_0x03ad
            L_0x03ab:
                r2 = 5
                goto L_0x03af
            L_0x03ad:
                r2 = 33
            L_0x03af:
                android.view.View r4 = r9.convertView
                com.tencent.mm.ui.chatting.viewitems.u$g$$f r6 = new com.tencent.mm.ui.chatting.viewitems.u$g$$f
                r6.<init>(r8, r15, r2)
                zp3.C23564m.m28138h(r4, r6)
                java.lang.String r4 = "file://"
                r6 = 4
                if (r2 == 0) goto L_0x1493
                r12 = 10
                if (r2 == r12) goto L_0x13f7
                r12 = 13
                if (r2 == r12) goto L_0x1389
                r12 = 240(0xf0, float:3.36E-43)
                if (r2 == r1) goto L_0x1235
                r1 = 40
                if (r2 == r1) goto L_0x1221
                r1 = 44
                if (r2 == r1) goto L_0x1209
                java.lang.String r1 = "MicroMsg.ChattingItemAppMsgTo"
                r7 = 48
                if (r2 == r7) goto L_0x1121
                r7 = 97
                if (r2 == r7) goto L_0x0fde
                if (r2 == r3) goto L_0x0edc
                if (r2 == r6) goto L_0x0e3f
                r7 = 5
                if (r2 == r7) goto L_0x0d0b
                r0 = 6
                if (r2 == r0) goto L_0x0c6d
                r0 = 7
                if (r2 == r0) goto L_0x0bde
                r0 = 15
                if (r2 == r0) goto L_0x0af2
                r0 = 16
                if (r2 == r0) goto L_0x0a69
                r0 = 19
                if (r2 == r0) goto L_0x0a38
                r0 = 20
                if (r2 == r0) goto L_0x09be
                r0 = 33
                if (r2 == r0) goto L_0x077d
                r1 = 34
                if (r2 == r1) goto L_0x0611
                r1 = 83
                if (r2 == r1) goto L_0x05c6
                r1 = 84
                if (r2 == r1) goto L_0x05c6
                switch(r2) {
                    case 24: goto L_0x0521;
                    case 25: goto L_0x041a;
                    case 26: goto L_0x0fde;
                    case 27: goto L_0x0fde;
                    default: goto L_0x040c;
                }
            L_0x040c:
                r27 = r4
                r9 = r13
                r7 = r14
                r0 = r15
                r4 = r17
                r1 = 0
                r14 = r27
                r2 = 1
                r15 = 1
                goto L_0x09b6
            L_0x041a:
                java.lang.String r1 = r14.f195570f
                if (r1 == 0) goto L_0x042d
                int r1 = r1.length()
                if (r1 <= 0) goto L_0x042d
                com.tencent.mm.ui.widget.MMNeat7extView r1 = r13.f218050c
                r2 = 0
                r1.setVisibility(r2)
                r3 = 8
                goto L_0x0435
            L_0x042d:
                r2 = 0
                com.tencent.mm.ui.widget.MMNeat7extView r1 = r13.f218050c
                r3 = 8
                r1.setVisibility(r3)
            L_0x0435:
                android.widget.TextView r1 = r13.f218052d
                r1.setVisibility(r2)
                android.widget.TextView r1 = r13.f218064j
                r1.setVisibility(r3)
                android.widget.ImageView r1 = r13.f218076p
                r1.setVisibility(r3)
                android.widget.ImageView r1 = r13.f218066k
                r1.setVisibility(r6)
                android.widget.TextView r1 = r13.f218052d
                r3 = 2
                r1.setMaxLines(r3)
                if (r5 == 0) goto L_0x04bd
                java.lang.String r1 = r14.f195646y
                boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
                if (r1 != 0) goto L_0x0480
                k60.e r1 = k60.C99101e.f290570a
                k60.a r1 = r1.mo138479a()
                java.lang.String r6 = r14.f195646y
                l60.b r1 = r1.mo85955a(r6)
                n60.f$a r6 = new n60.f$a
                r6.<init>()
                r7 = 1
                r6.mo139399b(r7)
                n60.f r6 = r6.mo139398a()
                r1.mo138758f(r6)
                com.tencent.mm.ui.MMImageView r6 = r13.f218048b
                l60.a r1 = (l60.C99342a) r1
                r1.mo85954d(r6)
            L_0x047c:
                r6 = 2131755119(0x7f10006f, float:1.9141108E38)
                goto L_0x04c1
            L_0x0480:
                r7 = 1
                di3.d r1 = di3.C86312j.m106911c(r26)
                gt.k r1 = (p158gt.C98201k) r1
                gt.m r1 = r1.mo137277xi()
                java.lang.String r19 = r37.mo108765s2()
                r20 = 1
                android.app.Activity r6 = r36.mo91565f()
                float r21 = kg3.C76577a.m92156g(r6)
                r22 = 0
                r23 = 1
                r18 = r1
                com.tencent.mm.modelimage.m r18 = (com.tencent.p014mm.modelimage.C92839m) r18
                android.graphics.Bitmap r1 = r18.mo127167Lo(r19, r20, r21, r22, r23)
                if (r1 == 0) goto L_0x04b4
                boolean r6 = r1.isRecycled()
                if (r6 == 0) goto L_0x04ae
                goto L_0x04b4
            L_0x04ae:
                com.tencent.mm.ui.MMImageView r6 = r13.f218048b
                r6.setImageBitmap(r1)
                goto L_0x047c
            L_0x04b4:
                com.tencent.mm.ui.MMImageView r1 = r13.f218048b
                r6 = 2131755119(0x7f10006f, float:1.9141108E38)
                r1.setImageResource(r6)
                goto L_0x04c1
            L_0x04bd:
                r6 = 2131755119(0x7f10006f, float:1.9141108E38)
                r7 = 1
            L_0x04c1:
                com.tencent.mm.ui.chatting.viewitems.t8 r1 = new com.tencent.mm.ui.chatting.viewitems.t8
                r16 = 0
                java.lang.String r9 = r36.mo91576q()
                java.lang.String r12 = r14.f195634v
                java.lang.String r11 = r14.f195638w
                java.lang.String r0 = r14.f195570f
                int r2 = r14.f195502J1
                java.lang.String r3 = r14.f195505K1
                java.lang.String r6 = r14.f195508L1
                java.lang.String r7 = r14.f195586j
                r19 = 0
                java.lang.String r20 = ""
                r21 = r11
                r11 = r1
                r27 = r4
                r22 = r12
                r4 = 2
                r12 = r37
                r29 = r13
                r13 = r19
                r32 = r14
                r4 = r17
                r14 = r29
                r15 = r20
                r17 = r9
                r18 = r22
                r19 = r21
                r20 = r0
                r21 = r2
                r22 = r3
                r23 = r6
                r24 = r7
                r11.<init>((com.tencent.p014mm.storage.C72963f4) r12, (boolean) r13, (uj3.C78208e) r14, (java.lang.String) r15, (boolean) r16, (java.lang.String) r17, (java.lang.String) r18, (java.lang.String) r19, (java.lang.String) r20, (int) r21, (java.lang.String) r22, (java.lang.String) r23, (java.lang.String) r24)
                r7 = r32
                java.lang.String r0 = r7.f195570f
                r1.f217982p = r0
                r9 = r29
                android.widget.FrameLayout r0 = r9.f218086w
                r0.setTag(r1)
                android.widget.FrameLayout r0 = r9.f218086w
                com.tencent.mm.ui.chatting.j2 r2 = r8.mo103267o0(r10)
                r0.setOnClickListener(r2)
                r0 = r37
                r3 = r1
                r33 = r27
                goto L_0x0bd6
            L_0x0521:
                r27 = r4
                r9 = r13
                r7 = r14
                r4 = r17
                com.tencent.mm.ui.widget.MMNeat7extView r0 = r9.f218050c
                r1 = 8
                r0.setVisibility(r1)
                android.widget.TextView r0 = r9.f218064j
                r1 = 0
                r0.setVisibility(r1)
                java.lang.String r0 = r7.f195570f
                if (r0 == 0) goto L_0x055f
                int r0 = r0.length()
                if (r0 <= 0) goto L_0x055f
                android.widget.TextView r0 = r9.f218064j
                java.lang.Class<ny.h> r2 = p629ny.C76979h.class
                di3.d r2 = di3.C86312j.m106911c(r2)
                ny.h r2 = (p629ny.C76979h) r2
                android.widget.TextView r11 = r9.f218064j
                android.content.Context r11 = r11.getContext()
                java.lang.String r12 = r7.f195570f
                android.widget.TextView r13 = r9.f218064j
                float r13 = r13.getTextSize()
                int r13 = (int) r13
                android.text.SpannableString r2 = r2.op0(r11, r12, r13)
                r0.setText(r2)
                goto L_0x0588
            L_0x055f:
                android.widget.TextView r0 = r9.f218064j
                java.lang.Class<ny.h> r2 = p629ny.C76979h.class
                di3.d r2 = di3.C86312j.m106911c(r2)
                ny.h r2 = (p629ny.C76979h) r2
                android.widget.TextView r11 = r9.f218064j
                android.content.Context r11 = r11.getContext()
                android.content.Context r12 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                r13 = 2131825821(0x7f11149d, float:1.9284509E38)
                java.lang.String r12 = r12.getString(r13)
                android.widget.TextView r13 = r9.f218064j
                float r13 = r13.getTextSize()
                int r13 = (int) r13
                android.text.SpannableString r2 = r2.op0(r11, r12, r13)
                r0.setText(r2)
            L_0x0588:
                android.widget.TextView r0 = r9.f218052d
                r0.setMaxLines(r3)
                android.widget.ImageView r0 = r9.f218066k
                r0.setVisibility(r6)
                android.widget.ImageView r0 = r9.f218076p
                r2 = 8
                r0.setVisibility(r2)
                if (r5 == 0) goto L_0x05a0
                com.tencent.mm.ui.MMImageView r0 = r9.f218048b
                r0.setVisibility(r2)
            L_0x05a0:
                r0 = r37
                com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.C74255e.m88524g(r10, r9, r7, r0, r5)
                boolean r2 = com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.m87878T()
                if (r2 == 0) goto L_0x05b8
                xi.d r2 = r10.mo91560a(r4)
                zj3.l r2 = (zj3.C79368l) r2
                r8.mo103266A0(r9, r2, r0)
                r8.mo103091h0(r9, r1)
                goto L_0x060e
            L_0x05b8:
                int r2 = r37.getStatus()
                r3 = 2
                if (r2 >= r3) goto L_0x05c1
                r2 = 1
                goto L_0x05c2
            L_0x05c1:
                r2 = 0
            L_0x05c2:
                r8.mo103091h0(r9, r2)
                goto L_0x060e
            L_0x05c6:
                r27 = r4
                r9 = r13
                r7 = r14
                r0 = r15
                r4 = r17
                r1 = 0
                com.tencent.mm.ui.MMImageView r2 = r9.f218048b
                r11 = 2131233367(0x7f080a57, float:1.808287E38)
                r2.setImageResource(r11)
                com.tencent.mm.ui.widget.MMNeat7extView r2 = r9.f218050c
                r11 = 8
                r2.setVisibility(r11)
                java.lang.String r2 = r7.f195570f
                if (r2 == 0) goto L_0x05fd
                int r2 = r2.length()
                if (r2 <= 0) goto L_0x05fd
                android.widget.TextView r2 = r9.f218064j
                r2.setMaxLines(r3)
                android.widget.TextView r2 = r9.f218064j
                r2.setVisibility(r1)
                android.widget.TextView r2 = r9.f218064j
                java.lang.String r3 = r7.mo93550m()
                r2.setText(r3)
                r3 = 8
                goto L_0x0604
            L_0x05fd:
                android.widget.TextView r2 = r9.f218064j
                r3 = 8
                r2.setVisibility(r3)
            L_0x0604:
                android.widget.ImageView r2 = r9.f218076p
                r2.setVisibility(r3)
                android.widget.ImageView r2 = r9.f218066k
                r2.setVisibility(r6)
            L_0x060e:
                r15 = 1
                goto L_0x0779
            L_0x0611:
                r27 = r4
                r9 = r13
                r7 = r14
                r0 = r15
                r4 = r17
                r1 = 0
                java.lang.String r2 = r7.f195570f
                if (r2 == 0) goto L_0x0677
                int r2 = r2.length()
                if (r2 <= 0) goto L_0x0677
                com.tencent.mm.ui.widget.MMNeat7extView r2 = r9.f218050c
                r2.setVisibility(r1)
                java.lang.String r2 = r7.f195552a1
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
                r3 = 2131101252(0x7f060644, float:1.7814908E38)
                if (r2 != 0) goto L_0x0665
                java.lang.String r2 = r7.f195552a1
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
                if (r2 != 0) goto L_0x0653
                com.tencent.mm.ui.widget.MMNeat7extView r2 = r9.f218050c
                java.lang.String r11 = r7.f195552a1
                android.app.Activity r12 = r36.mo91565f()
                android.content.res.Resources r12 = r12.getResources()
                int r3 = r12.getColor(r3)
                int r3 = com.tencent.p014mm.sdk.platformtools.Util.convertStringToRGB(r11, r3)
                r2.setTextColor(r3)
                goto L_0x067e
            L_0x0653:
                com.tencent.mm.ui.widget.MMNeat7extView r2 = r9.f218050c
                android.app.Activity r11 = r36.mo91565f()
                android.content.res.Resources r11 = r11.getResources()
                int r3 = r11.getColor(r3)
                r2.setTextColor(r3)
                goto L_0x067e
            L_0x0665:
                com.tencent.mm.ui.widget.MMNeat7extView r2 = r9.f218050c
                android.app.Activity r11 = r36.mo91565f()
                android.content.res.Resources r11 = r11.getResources()
                int r3 = r11.getColor(r3)
                r2.setTextColor(r3)
                goto L_0x067e
            L_0x0677:
                com.tencent.mm.ui.widget.MMNeat7extView r2 = r9.f218050c
                r3 = 8
                r2.setVisibility(r3)
            L_0x067e:
                android.widget.TextView r2 = r9.f218052d
                r3 = 2
                r2.setMaxLines(r3)
                android.widget.TextView r2 = r9.f218052d
                r2.setVisibility(r1)
                java.lang.String r2 = r7.f195556b1
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
                if (r2 != 0) goto L_0x06ac
                android.widget.TextView r2 = r9.f218052d
                java.lang.String r3 = r7.f195556b1
                android.app.Activity r11 = r36.mo91565f()
                android.content.res.Resources r11 = r11.getResources()
                r12 = 2131100884(0x7f0604d4, float:1.7814162E38)
                int r11 = r11.getColor(r12)
                int r3 = com.tencent.p014mm.sdk.platformtools.Util.convertStringToRGB(r3, r11)
                r2.setTextColor(r3)
                goto L_0x06c0
            L_0x06ac:
                android.widget.TextView r2 = r9.f218052d
                android.app.Activity r3 = r36.mo91565f()
                android.content.res.Resources r3 = r3.getResources()
                r11 = 2131100884(0x7f0604d4, float:1.7814162E38)
                int r3 = r3.getColor(r11)
                r2.setTextColor(r3)
            L_0x06c0:
                android.widget.TextView r2 = r9.f218064j
                r3 = 8
                r2.setVisibility(r3)
                android.widget.ImageView r2 = r9.f218066k
                r2.setVisibility(r6)
                android.widget.ImageView r2 = r9.f218076p
                r2.setVisibility(r3)
                android.widget.LinearLayout r2 = r9.f218062i
                r2.setVisibility(r1)
                android.widget.TextView r2 = r9.f218054e
                r2.setVisibility(r1)
                java.lang.String r2 = r7.f195540W0
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
                if (r2 != 0) goto L_0x06eb
                android.widget.TextView r2 = r9.f218054e
                java.lang.String r3 = r7.f195540W0
                r2.setText(r3)
                goto L_0x06f3
            L_0x06eb:
                android.widget.TextView r2 = r9.f218054e
                r3 = 2131823529(0x7f110ba9, float:1.927986E38)
                r2.setText(r3)
            L_0x06f3:
                boolean r2 = r8.f217197d
                if (r2 == 0) goto L_0x0768
                di3.d r2 = di3.C86312j.m106911c(r26)
                gt.k r2 = (p158gt.C98201k) r2
                gt.m r2 = r2.mo137277xi()
                java.lang.String r3 = r37.mo108765s2()
                android.app.Activity r6 = r36.mo91565f()
                float r6 = kg3.C76577a.m92156g(r6)
                com.tencent.mm.modelimage.m r2 = (com.tencent.p014mm.modelimage.C92839m) r2
                android.graphics.Bitmap r2 = r2.mo127188jo(r3, r6, r1)
                if (r2 == 0) goto L_0x072b
                boolean r3 = r2.isRecycled()
                if (r3 != 0) goto L_0x072b
                int r3 = r2.getWidth()
                r6 = 2
                int r3 = r3 / r6
                float r3 = (float) r3
                android.graphics.Bitmap r3 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getRoundedCornerBitmap(r2, r1, r3)
                com.tencent.mm.ui.MMImageView r6 = r9.f218048b
                r6.setImageBitmap(r3)
            L_0x072b:
                java.lang.String r3 = r7.f195549Z0
                boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
                if (r3 != 0) goto L_0x0758
                gc0.a r2 = gc0.C20828a.m22825b()
                java.lang.String r3 = r7.f195549Z0
                android.widget.ImageView r6 = new android.widget.ImageView
                android.app.Activity r11 = r36.mo91565f()
                r6.<init>(r11)
                hc0.c$b r11 = new hc0.c$b
                r11.<init>()
                r15 = 1
                r11.mo32677l(r15)
                hc0.c r11 = r11.mo32666a()
                com.tencent.mm.ui.chatting.viewitems.u$g$$l r12 = new com.tencent.mm.ui.chatting.viewitems.u$g$$l
                r12.<init>(r8, r9, r10)
                r2.mo32520i(r3, r6, r11, r12)
                goto L_0x0779
            L_0x0758:
                r15 = 1
                android.widget.LinearLayout r3 = r9.f218087x
                android.view.ViewTreeObserver r3 = r3.getViewTreeObserver()
                com.tencent.mm.ui.chatting.viewitems.u$g$$m r6 = new com.tencent.mm.ui.chatting.viewitems.u$g$$m
                r6.<init>(r8, r9, r10, r2)
                r3.addOnPreDrawListener(r6)
                goto L_0x0779
            L_0x0768:
                r15 = 1
                com.tencent.mm.ui.MMImageView r2 = r9.f218048b
                android.content.res.Resources r3 = r36.mo91572m()
                r6 = 2131234285(0x7f080ded, float:1.8084731E38)
                android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeResource(r3, r6)
                r2.setImageBitmap(r3)
            L_0x0779:
                r33 = r27
                goto L_0x0aeb
            L_0x077d:
                r27 = r4
                r9 = r13
                r7 = r14
                r0 = r15
                r4 = r17
                r1 = 0
                r15 = 1
                com.tencent.p014mm.p136ui.chatting.viewitems.C85822j6.m106040a(r9, r7, r2)
                di3.d r2 = di3.C86312j.m106911c(r11)
                kr0.w0 r2 = (kr0.C76629w0) r2
                java.lang.String r6 = r7.f195573f2
                com.tencent.mm.plugin.appbrand.config.WxaAttributes r2 = r2.mo106879N2(r6)
                java.lang.String r6 = r7.f195573f2
                kb0.C88132b.m109732c(r6, r2, r7)
                int r6 = r7.f195581h2
                if (r6 == r15) goto L_0x08d4
                r11 = 2
                if (r6 == r11) goto L_0x07c5
                if (r6 == r3) goto L_0x07c5
                android.widget.LinearLayout r2 = r9.f218062i
                r2.setVisibility(r1)
                android.widget.ImageView r2 = r9.f218056f
                r2.setVisibility(r1)
                android.widget.ImageView r2 = r9.f218056f
                r3 = 0
                r2.setBackground(r3)
                android.widget.ImageView r2 = r9.f218056f
                r3 = 2131755171(0x7f1000a3, float:1.9141214E38)
                r2.setImageResource(r3)
                android.widget.TextView r2 = r9.f218054e
                com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.m88504o(r2, r7)
                r14 = r27
                r2 = 1
                goto L_0x0994
            L_0x07c5:
                android.widget.FrameLayout r3 = r9.f218086w
                android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
                if (r3 == 0) goto L_0x07db
                android.widget.FrameLayout r3 = r9.f218086w
                android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
                r6 = -2
                r3.width = r6
                android.widget.FrameLayout r3 = r9.f218086w
                r3.requestLayout()
            L_0x07db:
                if (r2 == 0) goto L_0x07e0
                java.lang.String r3 = r2.field_nickname
                goto L_0x07e2
            L_0x07e0:
                java.lang.String r3 = r7.f195638w
            L_0x07e2:
                if (r2 == 0) goto L_0x07e7
                java.lang.String r6 = r2.field_smallHeadURL
                goto L_0x07e9
            L_0x07e7:
                java.lang.String r6 = r7.f195471B2
            L_0x07e9:
                android.widget.LinearLayout r11 = r9.f218087x
                r13 = 8
                r11.setVisibility(r13)
                android.widget.LinearLayout r11 = r9.f218029I
                r11.setVisibility(r1)
                android.widget.LinearLayout r11 = r9.f218023C
                r11.setVisibility(r13)
                android.widget.LinearLayout r11 = r9.f218038R
                r11.setVisibility(r13)
                android.widget.TextView r11 = r9.f218027G
                r11.setText(r3)
                android.widget.TextView r3 = r9.f218028H
                com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.m88504o(r3, r7)
                gc0.a r3 = gc0.C20828a.m22825b()
                android.widget.ImageView r11 = r9.f218026F
                hc0.c r13 = com.tencent.p014mm.p136ui.chatting.viewitems.C6808o3.f24365a
                r3.mo32519h(r6, r11, r13)
                di3.d r3 = di3.C86312j.m106911c(r26)
                gt.k r3 = (p158gt.C98201k) r3
                gt.m r3 = r3.mo137277xi()
                java.lang.String r6 = r37.mo108765s2()
                com.tencent.mm.modelimage.m r3 = (com.tencent.p014mm.modelimage.C92839m) r3
                java.lang.String r3 = r3.h30(r6)
                android.widget.ImageView r6 = r9.f218030J
                r11 = 0
                r6.setImageBitmap(r11)
                android.widget.ImageView r6 = r9.f218032L
                r6.setVisibility(r1)
                boolean r6 = com.tencent.p014mm.p136ui.chatting.viewitems.C85822j6.m106042c(r7, r2, r15)
                if (r6 == 0) goto L_0x084b
                android.widget.ImageView r2 = r9.f218036P
                r2.setVisibility(r1)
                android.widget.ImageView r2 = r9.f218036P
                com.tencent.p014mm.plugin.appbrand.p026ui.C84704w4.m104354a(r2)
                com.tencent.p014mm.p136ui.chatting.component.C19729d.m21409b(r10, r0, r1)
                goto L_0x0875
            L_0x084b:
                r6 = 16
                boolean r2 = com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.m88498i(r7, r2, r6)
                if (r2 == 0) goto L_0x0867
                boolean r2 = com.tencent.p014mm.p136ui.chatting.viewitems.C85822j6.m106041b(r7)
                if (r2 == 0) goto L_0x0867
                android.widget.ImageView r2 = r9.f218034N
                r2.setVisibility(r1)
                android.widget.ImageView r2 = r9.f218034N
                com.tencent.p014mm.plugin.appbrand.p026ui.C84711y4.m104367a(r2)
                com.tencent.p014mm.p136ui.chatting.component.C19729d.m21409b(r10, r0, r15)
                goto L_0x0875
            L_0x0867:
                android.widget.ImageView r2 = r9.f218036P
                r6 = 8
                r2.setVisibility(r6)
                android.widget.ImageView r2 = r9.f218034N
                r2.setVisibility(r6)
            L_0x0875:
                boolean r2 = com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.m88503n(r0, r7, r10)
                if (r2 == 0) goto L_0x089b
                android.widget.LinearLayout r2 = r9.f218075o0
                com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.m88490a(r2, r1)
                java.lang.String r2 = r37.mo108763q2()
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
                android.widget.LinearLayout r6 = r9.f218075o0
                r6.setTag(r0)
                android.widget.LinearLayout r6 = r9.f218075o0
                com.tencent.mm.ui.chatting.viewitems.u$g$$h r11 = new com.tencent.mm.ui.chatting.viewitems.u$g$$h
                r11.<init>(r8, r9, r10)
                r6.setOnClickListener(r11)
                com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.m88507r(r2, r9, r10)
                goto L_0x08a2
            L_0x089b:
                android.widget.LinearLayout r2 = r9.f218075o0
                r6 = 8
                com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.m88490a(r2, r6)
            L_0x08a2:
                java.lang.Class<com.tencent.mm.message.a> r2 = com.tencent.p014mm.message.C80995a.class
                com.tencent.mm.message.g r2 = r7.mo93555w(r2)
                com.tencent.mm.message.a r2 = (com.tencent.p014mm.message.C80995a) r2
                if (r2 == 0) goto L_0x08b2
                int r2 = r2.f237911t
                if (r2 != r15) goto L_0x08b2
                r2 = 1
                goto L_0x08b3
            L_0x08b2:
                r2 = 0
            L_0x08b3:
                lb0.b r6 = lb0.C88394b.m110233l()
                com.tencent.mm.ui.chatting.viewitems.u$g$$i r11 = new com.tencent.mm.ui.chatting.viewitems.u$g$$i
                r11.<init>(r8, r9, r2, r10)
                java.lang.String r2 = com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.m88499j(r3)
                di3.d r3 = di3.C86312j.m106911c(r25)
                kb0.i r3 = (kb0.C76529i) r3
                r13 = 192(0xc0, float:2.69E-43)
                lb0.b$h r3 = r3.Ij0(r12, r13)
                r12 = 0
                r6.mo122797p(r11, r2, r12, r3)
                r14 = r27
                goto L_0x0993
            L_0x08d4:
                if (r2 == 0) goto L_0x08d9
                java.lang.String r3 = r2.field_nickname
                goto L_0x08db
            L_0x08d9:
                java.lang.String r3 = r7.f195570f
            L_0x08db:
                if (r2 == 0) goto L_0x08e0
                java.lang.String r6 = r2.field_smallHeadURL
                goto L_0x08e1
            L_0x08e0:
                r6 = 0
            L_0x08e1:
                android.widget.LinearLayout r11 = r9.f218087x
                r12 = 8
                r11.setVisibility(r12)
                android.widget.LinearLayout r11 = r9.f218029I
                r11.setVisibility(r12)
                android.widget.LinearLayout r11 = r9.f218023C
                r11.setVisibility(r1)
                android.widget.TextView r11 = r9.f218025E
                r11.setText(r3)
                android.widget.LinearLayout r3 = r9.f218038R
                r3.setVisibility(r12)
                boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
                if (r3 == 0) goto L_0x0937
                di3.d r3 = di3.C86312j.m106911c(r26)
                gt.k r3 = (p158gt.C98201k) r3
                gt.m r3 = r3.mo137277xi()
                java.lang.String r6 = r37.mo108765s2()
                com.tencent.mm.modelimage.m r3 = (com.tencent.p014mm.modelimage.C92839m) r3
                java.lang.String r3 = r3.h30(r6)
                lb0.b r6 = lb0.C88394b.m110233l()
                android.widget.ImageView r11 = r9.f218024D
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                r14 = r27
                r12.append(r14)
                r12.append(r3)
                java.lang.String r3 = r12.toString()
                android.graphics.drawable.Drawable r12 = lb0.C88393a.m110230a()
                lb0.k r13 = lb0.C88431k.f255437d
                r6.mo122786b(r11, r3, r12, r13)
                goto L_0x0948
            L_0x0937:
                r14 = r27
                lb0.b r3 = lb0.C88394b.m110233l()
                android.widget.ImageView r11 = r9.f218024D
                android.graphics.drawable.Drawable r12 = lb0.C88393a.m110230a()
                lb0.k r13 = lb0.C88431k.f255437d
                r3.mo122786b(r11, r6, r12, r13)
            L_0x0948:
                r3 = 2
                boolean r6 = com.tencent.p014mm.p136ui.chatting.viewitems.C85822j6.m106042c(r7, r2, r3)
                if (r6 == 0) goto L_0x0968
                android.widget.ImageView r2 = r9.f218037Q
                r2.setVisibility(r1)
                android.widget.ImageView r2 = r9.f218035O
                r3 = 8
                r2.setVisibility(r3)
                android.widget.ImageView r2 = r9.f218037Q
                com.tencent.p014mm.plugin.appbrand.p026ui.C84704w4.m104354a(r2)
                com.tencent.p014mm.p136ui.chatting.component.C19729d.m21409b(r10, r0, r1)
                goto L_0x0993
            L_0x0968:
                r3 = 8
                r6 = 15
                boolean r2 = com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.m88498i(r7, r2, r6)
                if (r2 == 0) goto L_0x0987
                android.widget.ImageView r2 = r9.f218035O
                r2.setVisibility(r1)
                android.widget.ImageView r2 = r9.f218037Q
                r2.setVisibility(r3)
                android.widget.ImageView r2 = r9.f218035O
                com.tencent.p014mm.plugin.appbrand.p026ui.C84711y4.m104367a(r2)
                com.tencent.p014mm.p136ui.chatting.component.C19729d.m21409b(r10, r0, r15)
                goto L_0x0993
            L_0x0987:
                android.widget.ImageView r2 = r9.f218037Q
                r2.setVisibility(r3)
                android.widget.ImageView r2 = r9.f218035O
                r2.setVisibility(r3)
            L_0x0993:
                r2 = 0
            L_0x0994:
                if (r2 != 0) goto L_0x09b6
                boolean r3 = com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.m87878T()
                if (r3 == 0) goto L_0x09a9
                xi.d r3 = r10.mo91560a(r4)
                zj3.l r3 = (zj3.C79368l) r3
                r8.mo103266A0(r9, r3, r0)
                r8.mo103091h0(r9, r1)
                goto L_0x09b6
            L_0x09a9:
                int r3 = r37.getStatus()
                r6 = 2
                if (r3 >= r6) goto L_0x09b2
                r3 = 1
                goto L_0x09b3
            L_0x09b2:
                r3 = 0
            L_0x09b3:
                r8.mo103091h0(r9, r3)
            L_0x09b6:
                r1 = r2
                r33 = r14
                r3 = r16
                r2 = 0
                goto L_0x0bd8
            L_0x09be:
                r9 = r13
                r7 = r14
                r0 = r15
                r1 = 0
                r15 = 1
                r14 = r4
                r4 = r17
                java.lang.String r2 = r7.f195570f
                if (r2 == 0) goto L_0x09e4
                int r2 = r2.length()
                if (r2 <= 0) goto L_0x09e4
                com.tencent.mm.ui.widget.MMNeat7extView r2 = r9.f218050c
                r2.setVisibility(r1)
                com.tencent.mm.ui.widget.MMNeat7extView r2 = r9.f218050c
                java.lang.String r3 = r7.f195570f
                r2.mo104279b(r3)
                android.widget.TextView r2 = r9.f218064j
                r3 = 8
                r2.setVisibility(r3)
                goto L_0x09e6
            L_0x09e4:
                r3 = 8
            L_0x09e6:
                android.widget.TextView r2 = r9.f218052d
                r2.setMaxLines(r6)
                android.widget.ImageView r2 = r9.f218066k
                r2.setVisibility(r6)
                android.widget.ImageView r2 = r9.f218076p
                r2.setVisibility(r3)
                if (r5 == 0) goto L_0x0a33
                di3.d r2 = di3.C86312j.m106911c(r26)
                gt.k r2 = (p158gt.C98201k) r2
                gt.m r2 = r2.mo137277xi()
                java.lang.String r18 = r37.mo108765s2()
                r19 = 1
                android.app.Activity r3 = r36.mo91565f()
                float r20 = kg3.C76577a.m92156g(r3)
                r21 = 0
                r22 = 1
                r17 = r2
                com.tencent.mm.modelimage.m r17 = (com.tencent.p014mm.modelimage.C92839m) r17
                android.graphics.Bitmap r2 = r17.mo127167Lo(r18, r19, r20, r21, r22)
                if (r2 == 0) goto L_0x0a29
                boolean r3 = r2.isRecycled()
                if (r3 != 0) goto L_0x0a29
                com.tencent.mm.ui.MMImageView r3 = r9.f218048b
                r3.setImageBitmap(r2)
                goto L_0x0a33
            L_0x0a29:
                com.tencent.mm.ui.MMImageView r2 = r9.f218048b
                r3 = 2131755119(0x7f10006f, float:1.9141108E38)
                r2.setImageResource(r3)
                goto L_0x0ae9
            L_0x0a33:
                r3 = 2131755119(0x7f10006f, float:1.9141108E38)
                goto L_0x0ae9
            L_0x0a38:
                r9 = r13
                r7 = r14
                r0 = r15
                r1 = 0
                r3 = 2131755119(0x7f10006f, float:1.9141108E38)
                r15 = 1
                r14 = r4
                r4 = r17
                com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.C74255e.m88525h(r10, r9, r7, r5)
                boolean r2 = com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.m87878T()
                if (r2 == 0) goto L_0x0a5a
                xi.d r2 = r10.mo91560a(r4)
                zj3.l r2 = (zj3.C79368l) r2
                r8.mo103266A0(r9, r2, r0)
                r8.mo103091h0(r9, r1)
                goto L_0x0ae9
            L_0x0a5a:
                int r2 = r37.getStatus()
                r6 = 2
                if (r2 >= r6) goto L_0x0a63
                r2 = 1
                goto L_0x0a64
            L_0x0a63:
                r2 = 0
            L_0x0a64:
                r8.mo103091h0(r9, r2)
                goto L_0x0ae9
            L_0x0a69:
                r9 = r13
                r7 = r14
                r0 = r15
                r1 = 0
                r3 = 2131755119(0x7f10006f, float:1.9141108E38)
                r15 = 1
                r14 = r4
                r4 = r17
                com.tencent.mm.ui.widget.MMNeat7extView r2 = r9.f218050c
                r2.setVisibility(r1)
                com.tencent.mm.ui.widget.MMNeat7extView r2 = r9.f218050c
                java.lang.String r11 = r7.f195574g
                r2.mo104279b(r11)
                android.widget.TextView r2 = r9.f218052d
                java.lang.String r11 = r7.f195528S0
                r2.setText(r11)
                java.lang.String r2 = r7.f195570f
                if (r2 == 0) goto L_0x0aa0
                int r2 = r2.length()
                if (r2 <= 0) goto L_0x0aa0
                android.widget.TextView r2 = r9.f218064j
                r2.setVisibility(r1)
                android.widget.TextView r2 = r9.f218064j
                java.lang.String r11 = r7.f195570f
                r2.setText(r11)
                r11 = 8
                goto L_0x0aa7
            L_0x0aa0:
                android.widget.TextView r2 = r9.f218064j
                r11 = 8
                r2.setVisibility(r11)
            L_0x0aa7:
                android.widget.TextView r2 = r9.f218052d
                r2.setMaxLines(r6)
                android.widget.ImageView r2 = r9.f218066k
                r2.setVisibility(r6)
                android.widget.ImageView r2 = r9.f218076p
                r2.setVisibility(r11)
                if (r5 == 0) goto L_0x0ae9
                di3.d r2 = di3.C86312j.m106911c(r26)
                gt.k r2 = (p158gt.C98201k) r2
                gt.m r2 = r2.mo137277xi()
                java.lang.String r18 = r37.mo108765s2()
                r19 = 1
                android.app.Activity r6 = r36.mo91565f()
                float r20 = kg3.C76577a.m92156g(r6)
                r21 = 0
                r22 = 1
                r17 = r2
                com.tencent.mm.modelimage.m r17 = (com.tencent.p014mm.modelimage.C92839m) r17
                android.graphics.Bitmap r2 = r17.mo127167Lo(r18, r19, r20, r21, r22)
                if (r2 == 0) goto L_0x0ae4
                com.tencent.mm.ui.MMImageView r6 = r9.f218048b
                r6.setImageBitmap(r2)
                goto L_0x0ae9
            L_0x0ae4:
                com.tencent.mm.ui.MMImageView r2 = r9.f218048b
                r2.setImageResource(r3)
            L_0x0ae9:
                r33 = r14
            L_0x0aeb:
                r2 = 0
                r13 = 2131755119(0x7f10006f, float:1.9141108E38)
                r14 = 1
                goto L_0x0d06
            L_0x0af2:
                r9 = r13
                r7 = r14
                r0 = r15
                r1 = 0
                r3 = 2131755119(0x7f10006f, float:1.9141108E38)
                r15 = 1
                r14 = r4
                r4 = r17
                java.lang.String r2 = r7.f195570f
                if (r2 == 0) goto L_0x0b0f
                int r2 = r2.length()
                if (r2 <= 0) goto L_0x0b0f
                com.tencent.mm.ui.widget.MMNeat7extView r2 = r9.f218050c
                r2.setVisibility(r1)
                r11 = 8
                goto L_0x0b16
            L_0x0b0f:
                com.tencent.mm.ui.widget.MMNeat7extView r2 = r9.f218050c
                r11 = 8
                r2.setVisibility(r11)
            L_0x0b16:
                android.widget.TextView r2 = r9.f218052d
                r2.setVisibility(r1)
                android.widget.TextView r2 = r9.f218064j
                r2.setVisibility(r11)
                android.widget.ImageView r2 = r9.f218076p
                r2.setVisibility(r11)
                android.widget.ImageView r2 = r9.f218066k
                r2.setVisibility(r6)
                android.widget.TextView r2 = r9.f218052d
                r6 = 2
                r2.setMaxLines(r6)
                if (r5 == 0) goto L_0x0b95
                java.lang.String r2 = r7.f195646y
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
                if (r2 != 0) goto L_0x0b5d
                k60.e r2 = k60.C99101e.f290570a
                k60.a r2 = r2.mo138479a()
                java.lang.String r6 = r7.f195646y
                l60.b r2 = r2.mo85955a(r6)
                n60.f$a r6 = new n60.f$a
                r6.<init>()
                r6.mo139399b(r15)
                n60.f r6 = r6.mo139398a()
                r2.mo138758f(r6)
                com.tencent.mm.ui.MMImageView r6 = r9.f218048b
                l60.a r2 = (l60.C99342a) r2
                r2.mo85954d(r6)
                goto L_0x0b95
            L_0x0b5d:
                di3.d r2 = di3.C86312j.m106911c(r26)
                gt.k r2 = (p158gt.C98201k) r2
                gt.m r2 = r2.mo137277xi()
                java.lang.String r17 = r37.mo108765s2()
                r18 = 1
                android.app.Activity r6 = r36.mo91565f()
                float r19 = kg3.C76577a.m92156g(r6)
                r20 = 0
                r21 = 1
                r16 = r2
                com.tencent.mm.modelimage.m r16 = (com.tencent.p014mm.modelimage.C92839m) r16
                android.graphics.Bitmap r2 = r16.mo127167Lo(r17, r18, r19, r20, r21)
                if (r2 == 0) goto L_0x0b90
                boolean r6 = r2.isRecycled()
                if (r6 == 0) goto L_0x0b8a
                goto L_0x0b90
            L_0x0b8a:
                com.tencent.mm.ui.MMImageView r6 = r9.f218048b
                r6.setImageBitmap(r2)
                goto L_0x0b95
            L_0x0b90:
                com.tencent.mm.ui.MMImageView r2 = r9.f218048b
                r2.setImageResource(r3)
            L_0x0b95:
                com.tencent.mm.ui.chatting.viewitems.t8 r2 = new com.tencent.mm.ui.chatting.viewitems.t8
                r13 = 0
                r16 = 0
                java.lang.String r17 = r36.mo91576q()
                java.lang.String r6 = r7.f195634v
                java.lang.String r12 = r7.f195638w
                java.lang.String r11 = r7.f195570f
                java.lang.String r3 = r7.f195583i0
                java.lang.String r1 = r7.f195586j
                r23 = 0
                r24 = 0
                java.lang.String r18 = ""
                r20 = r11
                r11 = r2
                r19 = r12
                r12 = r37
                r33 = r14
                r14 = r9
                r15 = r18
                r18 = r6
                r21 = r3
                r22 = r1
                r11.<init>((com.tencent.p014mm.storage.C72963f4) r12, (boolean) r13, (uj3.C78208e) r14, (java.lang.String) r15, (boolean) r16, (java.lang.String) r17, (java.lang.String) r18, (java.lang.String) r19, (java.lang.String) r20, (java.lang.String) r21, (java.lang.String) r22, (boolean) r23, (boolean) r24)
                java.lang.String r1 = r7.f195570f
                r2.f217982p = r1
                android.widget.FrameLayout r1 = r9.f218086w
                r1.setTag(r2)
                android.widget.FrameLayout r1 = r9.f218086w
                com.tencent.mm.ui.chatting.l2 r3 = r8.mo103096n(r10)
                r1.setOnClickListener(r3)
                r3 = r2
            L_0x0bd6:
                r1 = 0
                r2 = 1
            L_0x0bd8:
                r15 = r0
                r11 = r1
                r0 = r7
                r13 = r9
                goto L_0x111c
            L_0x0bde:
                r33 = r4
                r9 = r13
                r7 = r14
                r0 = r15
                r4 = r17
                r13 = 2131755119(0x7f10006f, float:1.9141108E38)
                com.tencent.mm.ui.widget.MMNeat7extView r1 = r9.f218050c
                r2 = 8
                r1.setVisibility(r2)
                java.lang.String r1 = r7.f195570f
                if (r1 == 0) goto L_0x0c0f
                int r1 = r1.length()
                if (r1 <= 0) goto L_0x0c0f
                android.widget.TextView r1 = r9.f218064j
                r2 = 2
                r1.setMaxLines(r2)
                android.widget.TextView r1 = r9.f218064j
                r2 = 0
                r1.setVisibility(r2)
                android.widget.TextView r1 = r9.f218064j
                java.lang.String r2 = r7.f195570f
                r1.setText(r2)
                r2 = 8
                goto L_0x0c16
            L_0x0c0f:
                android.widget.TextView r1 = r9.f218064j
                r2 = 8
                r1.setVisibility(r2)
            L_0x0c16:
                android.widget.TextView r1 = r9.f218052d
                r1.setMaxLines(r3)
                android.widget.ImageView r1 = r9.f218066k
                r1.setVisibility(r6)
                android.widget.ImageView r1 = r9.f218076p
                r1.setVisibility(r2)
                if (r5 == 0) goto L_0x0c51
                di3.d r1 = di3.C86312j.m106911c(r18)
                ym.l r1 = (p763ym.C79138l) r1
                java.lang.String r2 = r7.f195562d
                android.app.Activity r3 = r36.mo91565f()
                float r3 = kg3.C76577a.m92156g(r3)
                r14 = 1
                android.graphics.Bitmap r1 = r1.mo74018ub(r2, r14, r3)
                if (r1 == 0) goto L_0x0c4b
                boolean r2 = r1.isRecycled()
                if (r2 == 0) goto L_0x0c45
                goto L_0x0c4b
            L_0x0c45:
                com.tencent.mm.ui.MMImageView r2 = r9.f218048b
                r2.setImageBitmap(r1)
                goto L_0x0c52
            L_0x0c4b:
                com.tencent.mm.ui.MMImageView r1 = r9.f218048b
                r1.setImageResource(r13)
                goto L_0x0c52
            L_0x0c51:
                r14 = 1
            L_0x0c52:
                boolean r1 = com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.m87878T()
                if (r1 == 0) goto L_0x0c5f
                r1 = 0
                r8.mo103091h0(r9, r1)
            L_0x0c5c:
                r2 = 0
                goto L_0x0d06
            L_0x0c5f:
                int r1 = r37.getStatus()
                r2 = 2
                if (r1 >= r2) goto L_0x0c68
                r1 = 1
                goto L_0x0c69
            L_0x0c68:
                r1 = 0
            L_0x0c69:
                r8.mo103091h0(r9, r1)
                goto L_0x0c5c
            L_0x0c6d:
                r33 = r4
                r9 = r13
                r7 = r14
                r0 = r15
                r4 = r17
                r13 = 2131755119(0x7f10006f, float:1.9141108E38)
                r14 = 1
                java.lang.String r1 = r7.f195570f
                if (r1 == 0) goto L_0x0c91
                int r1 = r1.length()
                if (r1 <= 0) goto L_0x0c91
                com.tencent.mm.ui.widget.MMNeat7extView r1 = r9.f218050c
                r2 = 0
                r1.setVisibility(r2)
                com.tencent.mm.ui.widget.MMNeat7extView r1 = r9.f218050c
                r3 = 2
                r1.setMaxLines(r3)
                r3 = 8
                goto L_0x0c99
            L_0x0c91:
                r2 = 0
                com.tencent.mm.ui.widget.MMNeat7extView r1 = r9.f218050c
                r3 = 8
                r1.setVisibility(r3)
            L_0x0c99:
                android.widget.TextView r1 = r9.f218052d
                r1.setVisibility(r2)
                android.widget.TextView r1 = r9.f218064j
                r1.setVisibility(r3)
                android.widget.ImageView r1 = r9.f218066k
                r1.setVisibility(r6)
                android.widget.TextView r1 = r9.f218052d
                r6 = 2
                r1.setMaxLines(r6)
                android.widget.TextView r1 = r9.f218052d
                int r6 = r7.f195594l
                long r11 = (long) r6
                java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.getSizeKB(r11)
                r1.setText(r6)
                android.widget.ImageView r1 = r9.f218076p
                r1.setVisibility(r3)
                int r1 = r7.f195594l
                r3 = r31
                com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.C74255e.m88527j(r9, r3, r1)
                java.lang.Boolean r1 = java.lang.Boolean.FALSE
                java.lang.String r3 = r7.f195606o
                java.lang.String r6 = r7.f195570f
                com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.C74255e.m88526i(r9, r1, r0, r3, r6)
                if (r5 == 0) goto L_0x0d06
                java.lang.String r1 = r7.f195602n
                boolean r1 = com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.C74247d.m88513c(r1)
                if (r1 == 0) goto L_0x0ce2
                com.tencent.mm.ui.MMImageView r1 = r9.f218048b
                r3 = 2131231074(0x7f080162, float:1.8078219E38)
                r1.setImageResource(r3)
                goto L_0x0d06
            L_0x0ce2:
                java.lang.String r1 = r7.f195602n
                boolean r1 = com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.C74247d.m88514d(r1)
                if (r1 == 0) goto L_0x0cf3
                com.tencent.mm.ui.MMImageView r1 = r9.f218048b
                r3 = 2131755116(0x7f10006c, float:1.9141102E38)
                r1.setImageResource(r3)
                goto L_0x0d06
            L_0x0cf3:
                com.tencent.mm.ui.MMImageView r1 = r9.f218048b
                java.lang.Class<wm.f> r3 = p262wm.C22923f.class
                di3.d r3 = di3.C86312j.m106911c(r3)
                wm.f r3 = (p262wm.C22923f) r3
                java.lang.String r6 = r7.f195602n
                int r3 = r3.mo35908u8(r6)
                r1.setImageResource(r3)
            L_0x0d06:
                r15 = r0
            L_0x0d07:
                r0 = r7
                r13 = r9
                goto L_0x1230
            L_0x0d0b:
                r2 = r38
                r33 = r4
                r9 = r13
                r7 = r14
                r4 = r17
                r11 = 0
                r13 = 2131755119(0x7f10006f, float:1.9141108E38)
                r14 = 1
                com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.m88497h(r2, r10, r15, r7)
                java.lang.Class<com.tencent.mm.message.f> r2 = com.tencent.p014mm.message.C68065f.class
                com.tencent.mm.message.g r2 = r7.mo93555w(r2)
                com.tencent.mm.message.f r2 = (com.tencent.p014mm.message.C68065f) r2
                if (r2 == 0) goto L_0x0d40
                int r12 = r2.f195417b
                boolean r12 = com.tencent.p014mm.message.C68065f.m80397f(r12)
                if (r12 == 0) goto L_0x0d40
                com.tencent.mm.plugin.brandservice.ui.timeline.preload.l r12 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40726l.f109414a
                java.lang.String r14 = r7.f195586j
                int r13 = r2.f195417b
                r12.mo63636e(r14, r13)
                int r12 = r2.f195417b
                r13 = 16
                if (r12 != r13) goto L_0x0d40
                com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.C74255e.m88523f(r10, r9, r7, r15, r5)
                goto L_0x0d07
            L_0x0d40:
                if (r0 != 0) goto L_0x0d62
                boolean r0 = com.tencent.p014mm.p136ui.chatting.viewitems.C6805l4.m7093c(r7, r2)
                if (r0 == 0) goto L_0x0d62
                android.widget.LinearLayout r0 = r9.f218061h0
                r0.setVisibility(r11)
                android.widget.ImageView r0 = r9.f218071m0
                r0.setVisibility(r11)
                android.app.Activity r0 = r36.mo91565f()
                android.widget.ImageView r2 = r9.f218065j0
                android.widget.TextView r12 = r9.f218067k0
                com.tencent.p014mm.p136ui.chatting.viewitems.C6805l4.m7091a(r0, r7, r2, r12)
                android.widget.TextView r0 = r9.f218069l0
                com.tencent.p014mm.p136ui.chatting.viewitems.C6805l4.m7092b(r0, r7, r1)
            L_0x0d62:
                com.tencent.mm.ui.widget.MMNeat7extView r0 = r9.f218050c
                r1 = 8
                r0.setVisibility(r1)
                java.lang.String r0 = r7.f195570f
                if (r0 == 0) goto L_0x0d86
                int r0 = r0.length()
                if (r0 <= 0) goto L_0x0d86
                android.widget.TextView r0 = r9.f218064j
                r1 = 2
                r0.setMaxLines(r1)
                android.widget.TextView r0 = r9.f218064j
                r0.setVisibility(r11)
                android.widget.TextView r0 = r9.f218064j
                java.lang.String r1 = r7.f195570f
                r0.setText(r1)
                goto L_0x0d8d
            L_0x0d86:
                android.widget.TextView r0 = r9.f218064j
                r1 = 8
                r0.setVisibility(r1)
            L_0x0d8d:
                android.widget.TextView r0 = r9.f218052d
                r0.setMaxLines(r3)
                android.widget.ImageView r0 = r9.f218066k
                r0.setVisibility(r6)
                java.lang.Class<u73.r0> r0 = u73.C90621r0.class
                com.tencent.mm.message.g r0 = r7.mo93555w(r0)
                u73.r0 r0 = (u73.C90621r0) r0
                if (r0 == 0) goto L_0x0dab
                java.lang.String r0 = r0.f260345b
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                if (r0 != 0) goto L_0x0dab
                r1 = 1
                goto L_0x0dac
            L_0x0dab:
                r1 = 0
            L_0x0dac:
                if (r1 == 0) goto L_0x0dbc
                android.widget.ImageView r0 = r9.f218076p
                r1 = 2131235399(0x7f081247, float:1.808699E38)
                r0.setImageResource(r1)
                android.widget.ImageView r0 = r9.f218076p
                r0.setVisibility(r11)
                goto L_0x0dc3
            L_0x0dbc:
                android.widget.ImageView r0 = r9.f218076p
                r1 = 8
                r0.setVisibility(r1)
            L_0x0dc3:
                if (r5 == 0) goto L_0x0e1c
                hc0.c$b r0 = new hc0.c$b
                r0.<init>()
                r1 = 2131755119(0x7f10006f, float:1.9141108E38)
                r0.mo32670e(r1)
                r1 = 1
                r0.mo32669d(r1)
                java.lang.String r2 = p243tn.C14050a.m13404a()
                r0.mo32674i(r2)
                android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                r3 = 50
                int r2 = kg3.C76577a.m92151b(r2, r3)
                android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                int r3 = kg3.C76577a.m92151b(r6, r3)
                r0.mo32667b(r2, r3)
                r0.mo32668c(r1)
                r0.mo32675j(r1)
                android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                int r2 = kg3.C76577a.m92151b(r2, r1)
                float r1 = (float) r2
                r0.mo32676k(r1)
                gc0.a r1 = gc0.C20828a.m22825b()
                java.lang.String r2 = r7.f195646y
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
                if (r2 == 0) goto L_0x0e11
                java.lang.String r2 = r7.f195464A
                goto L_0x0e13
            L_0x0e11:
                java.lang.String r2 = r7.f195646y
            L_0x0e13:
                com.tencent.mm.ui.MMImageView r3 = r9.f218048b
                hc0.c r0 = r0.mo32666a()
                r1.mo32519h(r2, r3, r0)
            L_0x0e1c:
                boolean r0 = com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.m87878T()
                if (r0 == 0) goto L_0x0e30
                xi.d r0 = r10.mo91560a(r4)
                zj3.l r0 = (zj3.C79368l) r0
                r8.mo103266A0(r9, r0, r15)
                r8.mo103091h0(r9, r11)
                goto L_0x0d07
            L_0x0e30:
                int r0 = r37.getStatus()
                r1 = 2
                if (r0 >= r1) goto L_0x0e39
                r1 = 1
                goto L_0x0e3a
            L_0x0e39:
                r1 = 0
            L_0x0e3a:
                r8.mo103091h0(r9, r1)
                goto L_0x0d07
            L_0x0e3f:
                r33 = r4
                r9 = r13
                r7 = r14
                r4 = r17
                r11 = 0
                java.lang.String r0 = r7.f195570f
                if (r0 == 0) goto L_0x0e58
                int r0 = r0.length()
                if (r0 <= 0) goto L_0x0e58
                com.tencent.mm.ui.widget.MMNeat7extView r0 = r9.f218050c
                r0.setVisibility(r11)
                r1 = 8
                goto L_0x0e5f
            L_0x0e58:
                com.tencent.mm.ui.widget.MMNeat7extView r0 = r9.f218050c
                r1 = 8
                r0.setVisibility(r1)
            L_0x0e5f:
                android.widget.TextView r0 = r9.f218052d
                r0.setVisibility(r11)
                android.widget.TextView r0 = r9.f218064j
                r0.setVisibility(r1)
                android.widget.TextView r0 = r9.f218052d
                r1 = 2
                r0.setMaxLines(r1)
                android.widget.ImageView r0 = r9.f218066k
                r0.setVisibility(r6)
                android.widget.ImageView r0 = r9.f218076p
                r0.setVisibility(r11)
                android.widget.ImageView r0 = r9.f218076p
                r1 = 2131235399(0x7f081247, float:1.808699E38)
                r0.setImageResource(r1)
                if (r5 == 0) goto L_0x0d07
                hc0.c$b r0 = new hc0.c$b
                r0.<init>()
                r1 = 2131755119(0x7f10006f, float:1.9141108E38)
                r0.mo32670e(r1)
                r1 = 1
                r0.mo32669d(r1)
                android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                r3 = 50
                int r2 = kg3.C76577a.m92151b(r2, r3)
                android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                int r3 = kg3.C76577a.m92151b(r6, r3)
                r0.mo32667b(r2, r3)
                r0.mo32668c(r1)
                r0.mo32675j(r1)
                android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                int r2 = kg3.C76577a.m92151b(r2, r1)
                float r1 = (float) r2
                r0.mo32676k(r1)
                gc0.a r1 = gc0.C20828a.m22825b()
                java.lang.String r2 = r7.f195646y
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
                if (r2 == 0) goto L_0x0ec8
                java.lang.String r2 = r7.f195464A
                goto L_0x0eca
            L_0x0ec8:
                java.lang.String r2 = r7.f195646y
            L_0x0eca:
                com.tencent.mm.ui.MMImageView r3 = r9.f218048b
                hc0.c r0 = r0.mo32666a()
                r1.mo32519h(r2, r3, r0)
                android.widget.ImageView r0 = r9.f218076p
                r1 = 8
                r0.setVisibility(r1)
                goto L_0x0d07
            L_0x0edc:
                r33 = r4
                r7 = r14
                r4 = r17
                r11 = 0
                java.lang.String r0 = r7.f195570f
                if (r0 == 0) goto L_0x0f08
                int r0 = r0.length()
                if (r0 <= 0) goto L_0x0f08
                com.tencent.mm.ui.widget.MMNeat7extView r0 = r13.f218050c
                r0.setVisibility(r11)
                com.tencent.mm.ui.widget.MMNeat7extView r0 = r13.f218050c
                android.app.Activity r1 = r36.mo91565f()
                android.content.res.Resources r1 = r1.getResources()
                r2 = 2131101837(0x7f06088d, float:1.7816095E38)
                int r1 = r1.getColor(r2)
                r0.setTextColor(r1)
                r1 = 8
                goto L_0x0f0f
            L_0x0f08:
                com.tencent.mm.ui.widget.MMNeat7extView r0 = r13.f218050c
                r1 = 8
                r0.setVisibility(r1)
            L_0x0f0f:
                android.widget.TextView r0 = r13.f218052d
                r0.setVisibility(r11)
                android.widget.TextView r0 = r13.f218052d
                android.app.Activity r2 = r36.mo91565f()
                android.content.res.Resources r2 = r2.getResources()
                r3 = 2131101837(0x7f06088d, float:1.7816095E38)
                int r2 = r2.getColor(r3)
                r0.setTextColor(r2)
                android.widget.TextView r0 = r13.f218064j
                r0.setVisibility(r1)
                android.widget.ImageView r0 = r13.f218066k
                r0.setVisibility(r6)
                android.widget.TextView r0 = r13.f218052d
                r1 = 2
                r0.setMaxLines(r1)
                android.widget.ImageView r0 = r13.f218076p
                r0.setVisibility(r11)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                long r1 = r37.getMsgId()
                r0.append(r1)
                java.lang.String r1 = "_msg"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = r9.playingMsgId
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x0f63
                android.widget.ImageView r0 = r13.f218076p
                r1 = 2131234209(0x7f080da1, float:1.8084577E38)
                r0.setImageResource(r1)
                goto L_0x0f6b
            L_0x0f63:
                android.widget.ImageView r0 = r13.f218076p
                r1 = 2131234211(0x7f080da3, float:1.8084581E38)
                r0.setImageResource(r1)
            L_0x0f6b:
                com.tencent.mm.ui.chatting.viewitems.u$i r0 = new com.tencent.mm.ui.chatting.viewitems.u$i
                r0.<init>()
                long r1 = r37.getMsgId()
                r0.f218013b = r1
                java.lang.String r1 = r37.getContent()
                r0.f218015d = r1
                java.lang.String r1 = r37.mo108765s2()
                r0.f218014c = r1
                android.widget.ImageView r1 = r13.f218076p
                r1.setTag(r0)
                android.widget.ImageView r0 = r13.f218076p
                xi.d r1 = r10.mo91560a(r4)
                zj3.l r1 = (zj3.C79368l) r1
                com.tencent.mm.ui.u2 r1 = r1.mo108210s2()
                r0.setOnClickListener(r1)
                if (r5 == 0) goto L_0x0fc4
                di3.d r0 = di3.C86312j.m106911c(r18)
                ym.l r0 = (p763ym.C79138l) r0
                java.lang.String r1 = r7.f195562d
                android.app.Activity r2 = r36.mo91565f()
                float r2 = kg3.C76577a.m92156g(r2)
                r3 = 1
                android.graphics.Bitmap r0 = r0.mo74018ub(r1, r3, r2)
                if (r0 == 0) goto L_0x0fbc
                boolean r1 = r0.isRecycled()
                if (r1 == 0) goto L_0x0fb6
                goto L_0x0fbc
            L_0x0fb6:
                com.tencent.mm.ui.MMImageView r1 = r13.f218048b
                r1.setImageBitmap(r0)
                goto L_0x0fc4
            L_0x0fbc:
                com.tencent.mm.ui.MMImageView r0 = r13.f218048b
                r1 = 2131755090(0x7f100052, float:1.914105E38)
                r0.setImageResource(r1)
            L_0x0fc4:
                boolean r0 = com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.m87878T()
                if (r0 == 0) goto L_0x0fcf
                r8.mo103091h0(r13, r11)
                goto L_0x1207
            L_0x0fcf:
                int r0 = r37.getStatus()
                r1 = 2
                if (r0 >= r1) goto L_0x0fd8
                r1 = 1
                goto L_0x0fd9
            L_0x0fd8:
                r1 = 0
            L_0x0fd9:
                r8.mo103091h0(r13, r1)
                goto L_0x1207
            L_0x0fde:
                r33 = r4
                r7 = r14
                r4 = r17
                r11 = 0
                java.lang.String r0 = r7.f195570f
                if (r0 == 0) goto L_0x0ff6
                int r0 = r0.length()
                if (r0 <= 0) goto L_0x0ff6
                com.tencent.mm.ui.widget.MMNeat7extView r0 = r13.f218050c
                r0.setVisibility(r11)
                r1 = 8
                goto L_0x0ffd
            L_0x0ff6:
                com.tencent.mm.ui.widget.MMNeat7extView r0 = r13.f218050c
                r1 = 8
                r0.setVisibility(r1)
            L_0x0ffd:
                android.widget.TextView r0 = r13.f218052d
                r0.setVisibility(r11)
                android.widget.TextView r0 = r13.f218064j
                r0.setVisibility(r1)
                android.widget.ImageView r0 = r13.f218076p
                r0.setVisibility(r1)
                android.widget.ImageView r0 = r13.f218066k
                r0.setVisibility(r6)
                android.widget.TextView r0 = r13.f218052d
                r1 = 2
                r0.setMaxLines(r1)
                if (r5 == 0) goto L_0x1080
                java.lang.String r0 = r7.f195646y
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                if (r0 != 0) goto L_0x1045
                k60.e r0 = k60.C99101e.f290570a
                k60.a r0 = r0.mo138479a()
                java.lang.String r1 = r7.f195646y
                l60.b r0 = r0.mo85955a(r1)
                n60.f$a r1 = new n60.f$a
                r1.<init>()
                r2 = 1
                r1.mo139399b(r2)
                n60.f r1 = r1.mo139398a()
                r0.mo138758f(r1)
                com.tencent.mm.ui.MMImageView r1 = r13.f218048b
                l60.a r0 = (l60.C99342a) r0
                r0.mo85954d(r1)
                goto L_0x1080
            L_0x1045:
                di3.d r0 = di3.C86312j.m106911c(r26)
                gt.k r0 = (p158gt.C98201k) r0
                gt.m r0 = r0.mo137277xi()
                java.lang.String r17 = r37.mo108765s2()
                r18 = 1
                android.app.Activity r1 = r36.mo91565f()
                float r19 = kg3.C76577a.m92156g(r1)
                r20 = 0
                r21 = 1
                r16 = r0
                com.tencent.mm.modelimage.m r16 = (com.tencent.p014mm.modelimage.C92839m) r16
                android.graphics.Bitmap r0 = r16.mo127167Lo(r17, r18, r19, r20, r21)
                if (r0 == 0) goto L_0x1078
                boolean r1 = r0.isRecycled()
                if (r1 == 0) goto L_0x1072
                goto L_0x1078
            L_0x1072:
                com.tencent.mm.ui.MMImageView r1 = r13.f218048b
                r1.setImageBitmap(r0)
                goto L_0x1080
            L_0x1078:
                com.tencent.mm.ui.MMImageView r0 = r13.f218048b
                r1 = 2131755119(0x7f10006f, float:1.9141108E38)
                r0.setImageResource(r1)
            L_0x1080:
                com.tencent.mm.ui.chatting.viewitems.t8 r0 = new com.tencent.mm.ui.chatting.viewitems.t8
                r0.<init>()
                r0.f212238a = r15
                r0.f217969c = r11
                r0.f217970d = r13
                r36.mo91576q()
                java.lang.String r1 = r7.f195634v
                r0.f217972f = r1
                java.lang.String r1 = r7.f195638w
                r0.f217973g = r1
                java.lang.String r1 = r7.f195570f
                r0.f217974h = r1
                int r1 = r7.f195582i
                r2 = 26
                if (r1 != r2) goto L_0x10c2
                int r1 = r7.f195511M1
                r0.f217981o = r1
                java.lang.String r1 = r7.f195514N1
                r0.f217982p = r1
                java.lang.String r1 = r7.f195517O1
                r0.f217983q = r1
                java.lang.String r1 = r7.f195520P1
                r0.f217984r = r1
                java.lang.String r1 = r7.f195523Q1
                r0.f217985s = r1
                int r1 = r7.f195526R1
                r0.f217986t = r1
                android.widget.FrameLayout r1 = r13.f218086w
                com.tencent.mm.ui.chatting.m2 r2 = r8.mo103269q0(r10)
                r1.setOnClickListener(r2)
                goto L_0x1111
            L_0x10c2:
                r2 = 27
                if (r1 != r2) goto L_0x10e8
                int r1 = r7.f195511M1
                r0.f217981o = r1
                java.lang.String r1 = r7.f195514N1
                r0.f217982p = r1
                java.lang.String r1 = r7.f195517O1
                r0.f217983q = r1
                java.lang.String r1 = r7.f195520P1
                r0.f217984r = r1
                java.lang.String r1 = r7.f195523Q1
                r0.f217985s = r1
                int r1 = r7.f195526R1
                r0.f217986t = r1
                android.widget.FrameLayout r1 = r13.f218086w
                com.tencent.mm.ui.chatting.k2 r2 = r8.mo103268p0(r10)
                r1.setOnClickListener(r2)
                goto L_0x1111
            L_0x10e8:
                r2 = 97
                if (r1 != r2) goto L_0x1113
                int r1 = r7.f195511M1
                r0.f217981o = r1
                java.lang.String r1 = r7.f195514N1
                r0.f217982p = r1
                java.lang.String r1 = r7.f195517O1
                r0.f217983q = r1
                java.lang.String r1 = r7.f195520P1
                r0.f217984r = r1
                java.lang.String r1 = r7.f195523Q1
                r0.f217985s = r1
                int r1 = r7.f195526R1
                r0.f217986t = r1
                java.lang.String r1 = r7.f195529S1
                r0.f217987u = r1
                android.widget.FrameLayout r1 = r13.f218086w
                com.tencent.mm.ui.chatting.n2 r2 = r8.mo103270r0(r10)
                r1.setOnClickListener(r2)
            L_0x1111:
                r1 = 1
                goto L_0x1114
            L_0x1113:
                r1 = 0
            L_0x1114:
                android.widget.FrameLayout r2 = r13.f218086w
                r2.setTag(r0)
                r3 = r0
                r2 = r1
                r0 = r7
            L_0x111c:
                r9 = r33
                r1 = 0
                goto L_0x14fe
            L_0x1121:
                r33 = r4
                r7 = r14
                r4 = r17
                r11 = 0
                java.lang.Class<com.tencent.mm.message.a> r0 = com.tencent.p014mm.message.C80995a.class
                com.tencent.mm.message.g r0 = r7.mo93555w(r0)
                com.tencent.mm.message.a r0 = (com.tencent.p014mm.message.C80995a) r0
                java.lang.String r2 = r7.f195471B2
                java.lang.String r3 = r7.f195638w
                java.lang.String r6 = r7.f195570f
                java.lang.String r9 = r7.f195574g
                if (r0 != 0) goto L_0x1140
                java.lang.String r0 = "hy: no appbrand piece. treat as default"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r0)
                goto L_0x121a
            L_0x1140:
                java.lang.String r14 = r0.f237888E
                boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
                if (r14 != 0) goto L_0x1150
                java.lang.String r14 = r0.f237890G
                boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
                if (r14 == 0) goto L_0x115f
            L_0x1150:
                java.lang.String r0 = r0.f237886C
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                if (r0 == 0) goto L_0x115f
                java.lang.String r0 = "hy: no video url. treat as default"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r0)
                goto L_0x121a
            L_0x115f:
                android.widget.TextView r0 = r13.f218044X
                r0.setText(r3)
                android.widget.LinearLayout r0 = r13.f218087x
                r1 = 8
                r0.setVisibility(r1)
                android.widget.LinearLayout r0 = r13.f218029I
                r0.setVisibility(r1)
                android.widget.LinearLayout r0 = r13.f218023C
                r0.setVisibility(r1)
                android.widget.ImageView r0 = r13.f218045Y
                r0.setVisibility(r11)
                android.widget.ImageView r0 = r13.f218041U
                r0.setVisibility(r1)
                android.widget.ImageView r0 = r13.f218045Y
                android.app.Activity r1 = r36.mo91565f()
                r3 = 2131756957(0x7f10079d, float:1.9144836E38)
                android.graphics.drawable.Drawable r1 = kg3.C76577a.m92158i(r1, r3)
                r0.setImageDrawable(r1)
                android.widget.LinearLayout r0 = r13.f218038R
                r0.setVisibility(r11)
                android.widget.TextView r0 = r13.f218039S
                r0.setText(r6)
                android.widget.TextView r0 = r13.f218040T
                r0.setText(r9)
                java.lang.Class<gt.w> r0 = p158gt.C76057w.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                gt.w r0 = (p158gt.C76057w) r0
                com.tencent.mm.ui.chatting.viewitems.u$g$$j r1 = new com.tencent.mm.ui.chatting.viewitems.u$g$$j
                r1.<init>(r8, r13)
                r0.h60(r2, r1)
                di3.d r0 = di3.C86312j.m106911c(r26)
                gt.k r0 = (p158gt.C98201k) r0
                gt.m r0 = r0.mo137277xi()
                java.lang.String r1 = r37.mo108765s2()
                com.tencent.mm.modelimage.m r0 = (com.tencent.p014mm.modelimage.C92839m) r0
                java.lang.String r0 = r0.h30(r1)
                android.widget.ImageView r1 = r13.f218042V
                r2 = 0
                r1.setImageBitmap(r2)
                lb0.b r1 = lb0.C88394b.m110233l()
                com.tencent.mm.ui.chatting.viewitems.u$g$$k r3 = new com.tencent.mm.ui.chatting.viewitems.u$g$$k
                r3.<init>(r8, r13)
                java.lang.String r0 = com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.m88499j(r0)
                di3.d r6 = di3.C86312j.m106911c(r25)
                kb0.i r6 = (kb0.C76529i) r6
                r9 = 120(0x78, float:1.68E-43)
                kb0.i$a r14 = kb0.C76529i.C76530a.DECODE_TYPE_ORIGIN
                lb0.b$h r6 = r6.mo106759Hc(r12, r9, r14)
                r1.mo122797p(r3, r0, r2, r6)
                boolean r0 = com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.m87878T()
                if (r0 == 0) goto L_0x11fa
                xi.d r0 = r10.mo91560a(r4)
                zj3.l r0 = (zj3.C79368l) r0
                r8.mo103266A0(r13, r0, r15)
                r8.mo103091h0(r13, r11)
                r1 = 2
                goto L_0x1207
            L_0x11fa:
                int r0 = r37.getStatus()
                r1 = 2
                if (r0 >= r1) goto L_0x1203
                r0 = 1
                goto L_0x1204
            L_0x1203:
                r0 = 0
            L_0x1204:
                r8.mo103091h0(r13, r0)
            L_0x1207:
                r0 = r7
                goto L_0x1230
            L_0x1209:
                r33 = r4
                r7 = r14
                r4 = r17
                r1 = 2
                r11 = 0
                android.widget.TextView r0 = r13.f218052d
                r0.setMaxLines(r3)
                android.widget.TextView r0 = r13.f218064j
                r0.setMaxLines(r1)
            L_0x121a:
                r0 = r7
                r9 = r33
                r1 = 0
                r2 = 1
                goto L_0x14fa
            L_0x1221:
                r33 = r4
                r0 = r14
                r4 = r17
                r11 = 0
                int r1 = r7.f195664b
                r2 = 19
                if (r1 != r2) goto L_0x1230
                com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.C74255e.m88525h(r10, r13, r0, r5)
            L_0x1230:
                r9 = r33
                r1 = 0
                goto L_0x14f9
            L_0x1235:
                r33 = r4
                r0 = r14
                r4 = r17
                r1 = 0
                com.tencent.p014mm.p136ui.chatting.viewitems.C85822j6.m106040a(r13, r0, r2)
                android.widget.FrameLayout r2 = r13.f218086w
                android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
                if (r2 == 0) goto L_0x1254
                android.widget.FrameLayout r2 = r13.f218086w
                android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
                r3 = -2
                r2.width = r3
                android.widget.FrameLayout r2 = r13.f218086w
                r2.requestLayout()
            L_0x1254:
                di3.d r2 = di3.C86312j.m106911c(r11)
                kr0.w0 r2 = (kr0.C76629w0) r2
                java.lang.String r3 = r0.f195573f2
                com.tencent.mm.plugin.appbrand.config.WxaAttributes r2 = r2.mo106879N2(r3)
                java.lang.String r3 = r0.f195573f2
                kb0.C88132b.m109732c(r3, r2, r0)
                if (r2 == 0) goto L_0x126a
                java.lang.String r3 = r2.field_nickname
                goto L_0x126c
            L_0x126a:
                java.lang.String r3 = r0.f195638w
            L_0x126c:
                if (r2 == 0) goto L_0x1271
                java.lang.String r6 = r2.field_smallHeadURL
                goto L_0x1273
            L_0x1271:
                java.lang.String r6 = r0.f195471B2
            L_0x1273:
                android.widget.LinearLayout r7 = r13.f218087x
                r9 = 8
                r7.setVisibility(r9)
                android.widget.LinearLayout r7 = r13.f218029I
                r7.setVisibility(r1)
                android.widget.LinearLayout r7 = r13.f218023C
                r7.setVisibility(r9)
                android.widget.LinearLayout r7 = r13.f218038R
                r7.setVisibility(r9)
                android.widget.TextView r7 = r13.f218027G
                r7.setText(r3)
                android.widget.TextView r3 = r13.f218028H
                com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.m88504o(r3, r0)
                boolean r3 = com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.m88503n(r15, r0, r10)
                if (r3 == 0) goto L_0x12b9
                android.widget.LinearLayout r3 = r13.f218075o0
                com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.m88490a(r3, r1)
                java.lang.String r3 = r37.mo108763q2()
                boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
                android.widget.LinearLayout r7 = r13.f218075o0
                r7.setTag(r15)
                android.widget.LinearLayout r7 = r13.f218075o0
                com.tencent.mm.ui.chatting.viewitems.u$g$$g r9 = new com.tencent.mm.ui.chatting.viewitems.u$g$$g
                r9.<init>(r8, r13, r10)
                r7.setOnClickListener(r9)
                com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.m88507r(r3, r13, r10)
                goto L_0x12c0
            L_0x12b9:
                android.widget.LinearLayout r3 = r13.f218075o0
                r7 = 8
                com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.m88490a(r3, r7)
            L_0x12c0:
                gc0.a r3 = gc0.C20828a.m22825b()
                android.widget.ImageView r7 = r13.f218026F
                hc0.c r9 = com.tencent.p014mm.p136ui.chatting.viewitems.C6808o3.f24365a
                r3.mo32519h(r6, r7, r9)
                di3.d r3 = di3.C86312j.m106911c(r26)
                gt.k r3 = (p158gt.C98201k) r3
                gt.m r3 = r3.mo137277xi()
                java.lang.String r6 = r37.mo108765s2()
                com.tencent.mm.modelimage.m r3 = (com.tencent.p014mm.modelimage.C92839m) r3
                java.lang.String r3 = r3.h30(r6)
                android.widget.ImageView r6 = r13.f218030J
                r7 = 0
                r6.setImageBitmap(r7)
                lb0.b r17 = lb0.C88394b.m110233l()
                android.widget.ImageView r6 = r13.f218030J
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r9 = r33
                r7.append(r9)
                r7.append(r3)
                java.lang.String r19 = r7.toString()
                r20 = 0
                r21 = 0
                di3.d r3 = di3.C86312j.m106911c(r25)
                kb0.i r3 = (kb0.C76529i) r3
                r7 = 192(0xc0, float:2.69E-43)
                lb0.b$h r22 = r3.Ij0(r12, r7)
                r18 = r6
                r17.mo122787c(r18, r19, r20, r21, r22)
                boolean r3 = com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.m87878T()
                if (r3 == 0) goto L_0x1324
                xi.d r3 = r10.mo91560a(r4)
                zj3.l r3 = (zj3.C79368l) r3
                r8.mo103266A0(r13, r3, r15)
                r8.mo103091h0(r13, r1)
                goto L_0x1331
            L_0x1324:
                int r3 = r37.getStatus()
                r6 = 2
                if (r3 >= r6) goto L_0x132d
                r3 = 1
                goto L_0x132e
            L_0x132d:
                r3 = 0
            L_0x132e:
                r8.mo103091h0(r13, r3)
            L_0x1331:
                r3 = 1
                boolean r6 = com.tencent.p014mm.p136ui.chatting.viewitems.C85822j6.m106042c(r0, r2, r3)
                if (r6 == 0) goto L_0x1352
                android.widget.ImageView r2 = r13.f218036P
                r2.setVisibility(r1)
                android.widget.ImageView r2 = r13.f218034N
                r3 = 8
                r2.setVisibility(r3)
                android.widget.ImageView r2 = r13.f218036P
                com.tencent.p014mm.plugin.appbrand.p026ui.C84704w4.m104354a(r2)
                com.tencent.p014mm.p136ui.chatting.component.C19729d.m21409b(r10, r15, r1)
                goto L_0x14f9
            L_0x1352:
                r3 = 16
                boolean r2 = com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.m88498i(r0, r2, r3)
                if (r2 == 0) goto L_0x1379
                boolean r2 = com.tencent.p014mm.p136ui.chatting.viewitems.C85822j6.m106041b(r0)
                if (r2 == 0) goto L_0x1379
                android.widget.ImageView r2 = r13.f218034N
                r2.setVisibility(r1)
                android.widget.ImageView r2 = r13.f218036P
                r3 = 8
                r2.setVisibility(r3)
                android.widget.ImageView r2 = r13.f218034N
                com.tencent.p014mm.plugin.appbrand.p026ui.C84711y4.m104367a(r2)
                r2 = 1
                com.tencent.p014mm.p136ui.chatting.component.C19729d.m21409b(r10, r15, r2)
                goto L_0x14f9
            L_0x1379:
                r3 = 8
                android.widget.ImageView r2 = r13.f218036P
                r2.setVisibility(r3)
                android.widget.ImageView r2 = r13.f218034N
                r2.setVisibility(r3)
                goto L_0x14f9
            L_0x1389:
                r9 = r4
                r0 = r14
                r4 = r17
                r1 = 0
                com.tencent.mm.ui.widget.MMNeat7extView r2 = r13.f218050c
                r2.setVisibility(r1)
                com.tencent.mm.ui.widget.MMNeat7extView r2 = r13.f218050c
                java.lang.String r3 = r0.f195570f
                r2.mo104279b(r3)
                android.widget.TextView r2 = r13.f218064j
                r2.setVisibility(r1)
                android.widget.TextView r2 = r13.f218064j
                r3 = 2131823580(0x7f110bdc, float:1.9279964E38)
                r2.setText(r3)
                android.widget.TextView r2 = r13.f218052d
                r2.setMaxLines(r6)
                android.widget.ImageView r2 = r13.f218066k
                r2.setVisibility(r6)
                android.widget.ImageView r2 = r13.f218076p
                r3 = 8
                r2.setVisibility(r3)
                if (r5 == 0) goto L_0x14f9
                di3.d r2 = di3.C86312j.m106911c(r26)
                gt.k r2 = (p158gt.C98201k) r2
                gt.m r2 = r2.mo137277xi()
                java.lang.String r18 = r37.mo108765s2()
                r19 = 1
                android.app.Activity r3 = r36.mo91565f()
                float r20 = kg3.C76577a.m92156g(r3)
                r21 = 0
                r22 = 1
                r17 = r2
                com.tencent.mm.modelimage.m r17 = (com.tencent.p014mm.modelimage.C92839m) r17
                android.graphics.Bitmap r2 = r17.mo127167Lo(r18, r19, r20, r21, r22)
                if (r2 == 0) goto L_0x13ed
                boolean r3 = r2.isRecycled()
                if (r3 != 0) goto L_0x13ed
                com.tencent.mm.ui.MMImageView r3 = r13.f218048b
                r3.setImageBitmap(r2)
                goto L_0x14f9
            L_0x13ed:
                com.tencent.mm.ui.MMImageView r2 = r13.f218048b
                r3 = 2131755119(0x7f10006f, float:1.9141108E38)
                r2.setImageResource(r3)
                goto L_0x14f9
            L_0x13f7:
                r9 = r4
                r0 = r14
                r4 = r17
                r1 = 0
                android.widget.TextView r2 = r13.f218064j
                r2.setVisibility(r1)
                int r2 = r0.f195551a0
                r7 = 1
                if (r2 != r7) goto L_0x140f
                android.widget.TextView r2 = r13.f218064j
                r3 = 2131835285(0x7f113995, float:1.9303704E38)
                r2.setText(r3)
                goto L_0x142e
            L_0x140f:
                r7 = 2
                if (r2 != r7) goto L_0x141b
                android.widget.TextView r2 = r13.f218064j
                r3 = 2131835287(0x7f113997, float:1.9303708E38)
                r2.setText(r3)
                goto L_0x142e
            L_0x141b:
                if (r2 != r3) goto L_0x1426
                android.widget.TextView r2 = r13.f218064j
                r3 = 2131835286(0x7f113996, float:1.9303706E38)
                r2.setText(r3)
                goto L_0x142e
            L_0x1426:
                android.widget.TextView r2 = r13.f218064j
                r3 = 2131835288(0x7f113998, float:1.930371E38)
                r2.setText(r3)
            L_0x142e:
                java.lang.String r2 = r0.f195570f
                if (r2 == 0) goto L_0x1444
                int r2 = r2.length()
                if (r2 <= 0) goto L_0x1444
                com.tencent.mm.ui.widget.MMNeat7extView r2 = r13.f218050c
                r2.setVisibility(r1)
                com.tencent.mm.ui.widget.MMNeat7extView r2 = r13.f218050c
                java.lang.String r3 = r0.f195570f
                r2.mo104279b(r3)
            L_0x1444:
                android.widget.TextView r2 = r13.f218052d
                r2.setMaxLines(r6)
                android.widget.ImageView r2 = r13.f218066k
                r2.setVisibility(r6)
                android.widget.ImageView r2 = r13.f218076p
                r3 = 8
                r2.setVisibility(r3)
                if (r5 == 0) goto L_0x14f9
                di3.d r2 = di3.C86312j.m106911c(r26)
                gt.k r2 = (p158gt.C98201k) r2
                gt.m r2 = r2.mo137277xi()
                java.lang.String r18 = r37.mo108765s2()
                r19 = 1
                android.app.Activity r3 = r36.mo91565f()
                float r20 = kg3.C76577a.m92156g(r3)
                r21 = 0
                r22 = 1
                r17 = r2
                com.tencent.mm.modelimage.m r17 = (com.tencent.p014mm.modelimage.C92839m) r17
                android.graphics.Bitmap r2 = r17.mo127167Lo(r18, r19, r20, r21, r22)
                if (r2 == 0) goto L_0x148a
                boolean r3 = r2.isRecycled()
                if (r3 != 0) goto L_0x148a
                com.tencent.mm.ui.MMImageView r3 = r13.f218048b
                r3.setImageBitmap(r2)
                goto L_0x14f9
            L_0x148a:
                com.tencent.mm.ui.MMImageView r2 = r13.f218048b
                r3 = 2131755119(0x7f10006f, float:1.9141108E38)
                r2.setImageResource(r3)
                goto L_0x14f9
            L_0x1493:
                r9 = r4
                r0 = r14
                r4 = r17
                r1 = 0
                java.lang.String r2 = r0.f195570f
                if (r2 == 0) goto L_0x14aa
                int r2 = r2.length()
                if (r2 <= 0) goto L_0x14aa
                com.tencent.mm.ui.widget.MMNeat7extView r2 = r13.f218050c
                r2.setVisibility(r1)
                r3 = 8
                goto L_0x14b1
            L_0x14aa:
                com.tencent.mm.ui.widget.MMNeat7extView r2 = r13.f218050c
                r3 = 8
                r2.setVisibility(r3)
            L_0x14b1:
                android.widget.TextView r2 = r13.f218052d
                r2.setVisibility(r1)
                android.widget.TextView r2 = r13.f218064j
                r2.setVisibility(r3)
                android.widget.ImageView r2 = r13.f218066k
                r2.setVisibility(r3)
                android.widget.ImageView r2 = r13.f218076p
                r2.setVisibility(r6)
                android.widget.TextView r2 = r13.f218052d
                r3 = 2
                r2.setMaxLines(r3)
                if (r5 == 0) goto L_0x14f9
                di3.d r2 = di3.C86312j.m106911c(r18)
                ym.l r2 = (p763ym.C79138l) r2
                java.lang.String r3 = r0.f195562d
                android.app.Activity r6 = r36.mo91565f()
                float r6 = kg3.C76577a.m92156g(r6)
                r7 = 1
                android.graphics.Bitmap r2 = r2.mo74018ub(r3, r7, r6)
                if (r2 == 0) goto L_0x14f1
                boolean r3 = r2.isRecycled()
                if (r3 == 0) goto L_0x14eb
                goto L_0x14f1
            L_0x14eb:
                com.tencent.mm.ui.MMImageView r3 = r13.f218048b
                r3.setImageBitmap(r2)
                goto L_0x14f9
            L_0x14f1:
                com.tencent.mm.ui.MMImageView r2 = r13.f218048b
                r3 = 2131755119(0x7f10006f, float:1.9141108E38)
                r2.setImageResource(r3)
            L_0x14f9:
                r2 = 0
            L_0x14fa:
                r11 = r2
                r3 = r16
                r2 = 0
            L_0x14fe:
                if (r11 == 0) goto L_0x1625
                java.lang.String r6 = r0.f195570f
                if (r6 == 0) goto L_0x151f
                int r6 = r6.length()
                if (r6 <= 0) goto L_0x151f
                android.widget.TextView r6 = r13.f218064j
                r6.setVisibility(r1)
                android.widget.TextView r6 = r13.f218064j
                r7 = 2
                r6.setMaxLines(r7)
                android.widget.TextView r6 = r13.f218064j
                java.lang.String r7 = r0.f195570f
                r6.setText(r7)
                r7 = 8
                goto L_0x1526
            L_0x151f:
                android.widget.TextView r6 = r13.f218064j
                r7 = 8
                r6.setVisibility(r7)
            L_0x1526:
                com.tencent.mm.ui.widget.MMNeat7extView r6 = r13.f218050c
                r6.setVisibility(r7)
                if (r5 == 0) goto L_0x161c
                int r5 = r0.f195582i
                r6 = 33
                if (r5 == r6) goto L_0x15d4
                r6 = 36
                if (r5 != r6) goto L_0x1539
                goto L_0x15d4
            L_0x1539:
                r6 = 44
                if (r5 != r6) goto L_0x154a
                java.lang.String r5 = r0.f195646y
                boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
                if (r5 != 0) goto L_0x154a
                com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.C74255e.m88521c(r13, r0)
                goto L_0x161c
            L_0x154a:
                di3.d r5 = di3.C86312j.m106911c(r26)
                gt.k r5 = (p158gt.C98201k) r5
                gt.m r5 = r5.mo137277xi()
                java.lang.String r17 = r37.mo108765s2()
                r18 = 1
                android.app.Activity r6 = r36.mo91565f()
                float r19 = kg3.C76577a.m92156g(r6)
                r20 = 0
                r21 = 1
                r16 = r5
                com.tencent.mm.modelimage.m r16 = (com.tencent.p014mm.modelimage.C92839m) r16
                android.graphics.Bitmap r5 = r16.mo127167Lo(r17, r18, r19, r20, r21)
                if (r5 == 0) goto L_0x1576
                boolean r6 = r5.isRecycled()
                if (r6 == 0) goto L_0x1592
            L_0x1576:
                di3.d r5 = di3.C86312j.m106911c(r26)
                gt.k r5 = (p158gt.C98201k) r5
                gt.m r5 = r5.mo137277xi()
                java.lang.String r6 = r37.mo108765s2()
                android.app.Activity r7 = r36.mo91565f()
                float r7 = kg3.C76577a.m92156g(r7)
                com.tencent.mm.modelimage.m r5 = (com.tencent.p014mm.modelimage.C92839m) r5
                android.graphics.Bitmap r5 = r5.mo127188jo(r6, r7, r1)
            L_0x1592:
                if (r5 == 0) goto L_0x15a1
                boolean r1 = r5.isRecycled()
                if (r1 != 0) goto L_0x15a1
                com.tencent.mm.ui.MMImageView r1 = r13.f218048b
                r1.setImageBitmap(r5)
                goto L_0x161c
            L_0x15a1:
                java.lang.String r1 = r0.f195646y
                boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
                if (r1 != 0) goto L_0x15cb
                java.lang.String r1 = r0.f195646y
                hc0.c$b r5 = new hc0.c$b
                r5.<init>()
                r6 = 2131100307(0x7f060293, float:1.7812992E38)
                r5.mo32670e(r6)
                r6 = 1
                r5.mo32669d(r6)
                r5.mo32668c(r6)
                gc0.a r6 = gc0.C20828a.m22825b()
                android.widget.ImageView r7 = r13.f218049b0
                hc0.c r5 = r5.mo32666a()
                r6.mo32519h(r1, r7, r5)
                goto L_0x161c
            L_0x15cb:
                com.tencent.mm.ui.MMImageView r1 = r13.f218048b
                r5 = 2131231074(0x7f080162, float:1.8078219E38)
                r1.setImageResource(r5)
                goto L_0x161c
            L_0x15d4:
                di3.d r1 = di3.C86312j.m106911c(r26)
                gt.k r1 = (p158gt.C98201k) r1
                gt.m r1 = r1.mo137277xi()
                java.lang.String r5 = r37.mo108765s2()
                com.tencent.mm.modelimage.m r1 = (com.tencent.p014mm.modelimage.C92839m) r1
                java.lang.String r1 = r1.h30(r5)
                com.tencent.mm.ui.MMImageView r5 = r13.f218048b
                r6 = 2131755119(0x7f10006f, float:1.9141108E38)
                r5.setImageResource(r6)
                lb0.b r16 = lb0.C88394b.m110233l()
                com.tencent.mm.ui.MMImageView r5 = r13.f218048b
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r9)
                r6.append(r1)
                java.lang.String r18 = r6.toString()
                r19 = 0
                r20 = 0
                di3.d r1 = di3.C86312j.m106911c(r25)
                kb0.i r1 = (kb0.C76529i) r1
                r6 = 52
                r7 = 52
                lb0.b$h r21 = r1.Ij0(r6, r7)
                r17 = r5
                r16.mo122787c(r17, r18, r19, r20, r21)
            L_0x161c:
                int r1 = r0.f195582i
                r5 = 44
                if (r1 != r5) goto L_0x1625
                com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.C74255e.m88522e(r10, r13, r0)
            L_0x1625:
                r1 = r2
                goto L_0x162b
            L_0x1627:
                r16 = r3
                r4 = r14
                r1 = 0
            L_0x162b:
                if (r1 != 0) goto L_0x163b
                android.widget.FrameLayout r0 = r13.f218086w
                r0.setTag(r3)
                android.widget.FrameLayout r0 = r13.f218086w
                com.tencent.mm.ui.chatting.viewitems.i$f r1 = r8.mo103099u(r10)
                r0.setOnClickListener(r1)
            L_0x163b:
                boolean r0 = r8.f217197d
                if (r0 == 0) goto L_0x1657
                android.widget.FrameLayout r0 = r13.f218086w
                com.tencent.mm.ui.chatting.viewitems.i$e r1 = r8.mo103098p(r10)
                r0.setOnLongClickListener(r1)
                android.widget.FrameLayout r0 = r13.f218086w
                xi.d r1 = r10.mo91560a(r4)
                zj3.l r1 = (zj3.C79368l) r1
                com.tencent.mm.ui.chatting.h2 r1 = r1.mo108189Z4()
                r0.setOnTouchListener(r1)
            L_0x1657:
                java.lang.String r3 = r36.mo91573n()
                boolean r4 = r36.mo91583x()
                r0 = r34
                r1 = r13
                r2 = r37
                r5 = r36
                r6 = r34
                r0.mo103087e0(r1, r2, r3, r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.C74261g.mo26237f(com.tencent.mm.ui.chatting.viewitems.i$c, ck3.b, com.tencent.mm.storage.f4, java.lang.String):void");
        }

        /* renamed from: k0 */
        public boolean mo26238k0(int i, boolean z) {
            if (z) {
                return i == 49 || i == 335544369 || i == 402653233 || i == 369098801 || i == 738197553 || i == 905969713;
            }
            return false;
        }

        /* renamed from: o0 */
        public C73724j2 mo103267o0(C67391b bVar) {
            if (this.f218107w == null) {
                this.f218107w = new C73724j2(bVar);
            }
            return this.f218107w;
        }

        /* renamed from: p0 */
        public C73736k2 mo103268p0(C67391b bVar) {
            if (this.f218109y == null) {
                this.f218109y = new C73736k2(bVar);
            }
            return this.f218109y;
        }

        /* renamed from: q0 */
        public C73756m2 mo103269q0(C67391b bVar) {
            if (this.f218108x == null) {
                this.f218108x = new C73756m2(bVar);
            }
            return this.f218108x;
        }

        /* renamed from: r0 */
        public C73763n2 mo103270r0(C67391b bVar) {
            if (this.f218110z == null) {
                this.f218110z = new C73763n2(bVar);
            }
            return this.f218110z;
        }
    }

    /* renamed from: a */
    public static void m88490a(View view, int i) {
        boolean z = true;
        if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_group_todo_disable, 0) != 1) {
            z = false;
        }
        if (!z) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsg", "setTodoContainerVisibility", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsg", "setTodoContainerVisibility", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(8);
        C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsg", "setTodoContainerVisibility", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsg", "setTodoContainerVisibility", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: b */
    public static int m88491b(C72963f4 f4Var, C68070l.C68072b bVar) {
        Class cls = C59331r.class;
        if (bVar.f195582i != 3 || ((C59331r) C86312j.m106911c(cls)).mo84029q1(bVar.f195562d) || !((C59331r) C86312j.m106911c(cls)).mo84027kM()) {
            return bVar.f195582i;
        }
        return 5;
    }

    /* renamed from: c */
    public static boolean m88492c(C68070l.C68072b bVar, View view, C67391b bVar2, C74023i iVar, C72963f4 f4Var) {
        C68070l.C68072b bVar3 = bVar;
        Class cls = C14088e.class;
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo175913w(1293, 34, 1);
        String str = bVar3.f195621r2;
        String str2 = bVar3.f195625s2;
        String str3 = bVar3.f195629t2;
        if (Util.isNullOrNil(str)) {
            return false;
        }
        boolean z = !Util.isNullOrNil(bVar3.f195586j);
        if (!(!z || ((C14088e) C86312j.m106911c(cls)).e00(str))) {
            nVar.mo175913w(1293, 84, 1);
            return false;
        }
        nVar.mo175913w(1293, 83, 1);
        Bundle bundle = new Bundle();
        bundle.putString("appId", str);
        if (!Util.isNullOrNil(str2)) {
            bundle.putString("path", str2);
        }
        if (!Util.isNullOrNil(str3)) {
            bundle.putString(SearchIntents.EXTRA_QUERY, str3);
        }
        ((C14088e) C86312j.m106911c(cls)).mo13510OP(bVar2.mo91565f(), bundle, true, false, new C74324z(C76879j.m92723Q(bVar2.mo91565f(), bVar2.mo91565f().getString(C0966R.string.a3h), bVar2.mo91565f().getString(C0966R.string.a4d), true, true, new C74308y()), z, bVar, view, bVar2, iVar, f4Var));
        return true;
    }

    /* renamed from: d */
    public static boolean m88493d(C67391b bVar, String str, String str2, String str3, boolean z, Bundle bundle) {
        Intent putExtra = new Intent().putExtra("key_video_url", str);
        putExtra.putExtra("key_video_url", str);
        putExtra.putExtra("key_cover_path", str3);
        putExtra.putExtra("key_auto_save", z);
        putExtra.putExtra("key_local_file_path", str2);
        putExtra.putExtra("key_ext_data", bundle);
        putExtra.putExtra("key_scene", 1);
        C88144b.m109791i(bVar.mo91565f(), XWalkEnvironment.MODULE_APPBRAND, ".ui.AppBrandVideoPreviewUI", putExtra, (Bundle) null);
        return true;
    }

    /* renamed from: e */
    public static void m88494e(C68070l.C68072b bVar, C67391b bVar2, C74023i iVar, C72963f4 f4Var) {
        int i = bVar.f195581h2;
        if (i == 0 || i == 2 || i == 3) {
            WCPaySessionInfoRecorder.f210858a.mo99898a(bVar.f195573f2, new WCPaySessionInfoRecorder.JsApiPayInfo(bVar2.mo91577r(), iVar.mo103068y(bVar2, f4Var), 0, ""));
        }
    }

    /* renamed from: f */
    public static void m88495f(C72963f4 f4Var) {
        boolean z;
        C74860u1 u1Var = C74860u1.f220100a;
        Log.m105924i("MicroMsg.VoiceStateHolder", "open appBrand");
        u1Var.mo104088b(false);
        if (f4Var == null) {
            Log.m105920e("MicroMsg.ChattingItemAppMsg", "handleAppBrandClickIncludeTodo: msginfo is null");
        } else if (!Util.isNullOrNil(f4Var.f230738V)) {
            C77711c Lo = ((C77089d) C86312j.m106911c(C77089d.class)).wx0().mo107864Lo(f4Var.mo108768t(), f4Var.f230738V);
            if (Lo == null) {
                Log.m105921e("MicroMsg.ChattingItemAppMsg", "handleAppBrandClickIncludeTodo stoTodo(%s) == null", Boolean.valueOf(Util.isNullOrNil(f4Var.f230738V)));
                return;
            }
            boolean e = C76758b0.m92500e(Lo);
            if (e) {
                z = C76758b0.m92505j(Lo);
                if (z) {
                    NotifyGroupTodoEvent notifyGroupTodoEvent = new NotifyGroupTodoEvent();
                    NotifyGroupTodoEvent.C67740a aVar = notifyGroupTodoEvent.f193762d;
                    aVar.f193763a = 3;
                    aVar.f193764b = f4Var.mo108768t();
                    notifyGroupTodoEvent.f193762d.f193765c = f4Var.f230738V;
                    notifyGroupTodoEvent.asyncPublish(Looper.getMainLooper());
                }
            } else {
                z = false;
            }
            C24982c0.m31597a(f4Var.mo108768t(), 0, 3, f4Var.f230738V, C76758b0.m92498c(f4Var));
            Log.m105925i("MicroMsg.ChattingItemAppMsg", "handleAppBrandClickIncludeTodo stoTodo(%s) update finish(%s %s)", Boolean.valueOf(Util.isNullOrNil(f4Var.f230738V)), Boolean.valueOf(z), Boolean.valueOf(e));
        }
    }

    /* renamed from: g */
    public static void m88496g(C68070l.C68072b bVar, C67391b bVar2, Intent intent) {
        C77877a aVar = (C77877a) bVar.mo93555w(C77877a.class);
        if (aVar != null && aVar.f226900b) {
            Bundle bundleExtra = intent.getBundleExtra("jsapiargs");
            if (bundleExtra == null) {
                bundleExtra = new Bundle();
            }
            int i = 1;
            bundleExtra.putBoolean("k_is_secret_msg", true);
            j25 j25 = new j25();
            j25.f135831d = (int) (System.currentTimeMillis() / 1000);
            if (bVar2.mo91583x()) {
                i = 2;
            }
            j25.f135834g = i;
            j25.f135835h = bVar2.mo91577r();
            j25.f135832e = bVar.f195586j;
            j25.f135833f = bVar.f195562d;
            try {
                bundleExtra.putByteArray("key_webview_secret_msg_info", j25.toByteArray());
                intent.putExtra("jsapiargs", bundleExtra);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.ChattingItemAppMsg", e, "fillWebPageSecretMsgInfo exception", new Object[0]);
            }
        }
    }

    /* renamed from: h */
    public static void m88497h(String str, C67391b bVar, C72963f4 f4Var, C68070l.C68072b bVar2) {
        String str2 = str;
        C68070l.C68072b bVar3 = bVar2;
        Class cls = C45696d.class;
        if (!TextUtils.isEmpty(bVar3.f195586j)) {
            long createTime = f4Var.getCreateTime();
            String r = bVar.mo91577r();
            int b = C45629t0.m50815b(str2, r);
            C68065f fVar = (C68065f) bVar3.mo93555w(C68065f.class);
            int i = fVar != null ? fVar.f195417b : -1;
            ((C45696d) C86709a0.m107533q(cls)).Tn0(bVar3.f195586j, i, 1, Long.valueOf(f4Var.mo108774y2()), r, Integer.valueOf(b), str2, Long.valueOf(createTime), Long.valueOf(((C45696d) C86709a0.m107533q(cls)).mo70963J2(r)));
            ((C45700h) C86709a0.m107533q(C45700h.class)).mo71036ed(bVar3.f195586j, 1, bVar3.f195562d, bVar3.f195570f, bVar3.f195574g, bVar.mo91583x() ? "groupmessage" : "singlemessage", 2);
            if (!f217993a && i != -1 && ((C45696d) C86709a0.m107533q(cls)).mo70957E5(23)) {
                f217993a = true;
                ((C45696d) C86709a0.m107533q(cls)).mo70972RM(1);
            }
        }
    }

    /* renamed from: i */
    public static boolean m88498i(C68070l.C68072b bVar, WxaAttributes wxaAttributes, int i) {
        boolean z;
        boolean b;
        Class cls = C80995a.class;
        boolean z2 = true;
        if (wxaAttributes == null) {
            C80995a aVar = (C80995a) bVar.mo93555w(cls);
            z = aVar != null ? C90159e.m112823b(aVar.f237906o, i) : false;
            Log.m105925i("MicroMsg.ChattingItemAppMsg", "[wantShowRelievedBuyFlag] attrs is null, get showRelievedBuyFlag flag from AppContentAppBrandPiece showRelievedBuyFlag:%b", Boolean.valueOf(z));
        } else {
            C80995a aVar2 = (C80995a) bVar.mo93555w(cls);
            if (wxaAttributes.mo113942o2() == null || bVar.f195467A2 <= wxaAttributes.mo113942o2().f239452d || aVar2 == null) {
                b = C90159e.m112823b(wxaAttributes.mo113940m2() != null ? wxaAttributes.mo113940m2().f239500p : 0, i);
            } else {
                boolean b2 = C90159e.m112823b(aVar2.f237906o, i);
                Log.m105925i("MicroMsg.ChattingItemAppMsg", "[wantShowRelievedBuyFlag] appbrandVersion:%d, appVersion:%d", Integer.valueOf(bVar.f195467A2), Integer.valueOf(wxaAttributes.mo113942o2().f239452d));
                b = b2;
            }
            Log.m105925i("MicroMsg.ChattingItemAppMsg", "[wantShowRelievedBuyFlag] use attrs:%b", Boolean.valueOf(z));
        }
        if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.relievedbuy, 0) != 1) {
            z2 = false;
        }
        return z & z2;
    }

    /* renamed from: j */
    public static String m88499j(String str) {
        if (str != null && str.startsWith("wcf://")) {
            return str;
        }
        return "file://" + str;
    }

    /* renamed from: k */
    public static void m88500k(C68070l.C68072b bVar, C67391b bVar2, C72963f4 f4Var) {
        OpenNoteFromSessionEvent openNoteFromSessionEvent = new OpenNoteFromSessionEvent();
        openNoteFromSessionEvent.f193796d.f193799c = bVar2.mo91565f();
        openNoteFromSessionEvent.f193796d.f193797a = f4Var.getMsgId();
        openNoteFromSessionEvent.f193796d.f193800d = bVar2.mo91583x();
        OpenNoteFromSessionEvent.C67750a aVar = openNoteFromSessionEvent.f193796d;
        aVar.f193798b = bVar.f195571f0;
        aVar.f193801e = 6;
        openNoteFromSessionEvent.publish();
    }

    /* renamed from: l */
    public static void m88501l(C72963f4 f4Var, C74023i.C74026c cVar, C67391b bVar, int i) {
        if (f4Var == null) {
            Log.m105920e("MicroMsg.ChattingItemAppMsg", "handleAppBrandClickIncludeTodo: msginfo is null");
        } else if (MultiProcessMMKV.getMMKV("group_to_do").getBoolean("introduce_dialog_first", true)) {
            MultiProcessMMKV.getMMKV("group_to_do").edit().putBoolean("introduce_dialog_first", false);
            Activity f = bVar.mo91565f();
            boolean isNullOrNil = Util.isNullOrNil(f4Var.f230738V);
            String r = bVar.mo91577r();
            String str = f4Var.f230738V;
            String c = C76758b0.m92498c(f4Var);
            C74245a aVar = new C74245a(f4Var, cVar, bVar, i);
            C77407n nVar = new C77407n((Context) f, 1, false);
            View inflate = View.inflate(f, C0966R.C0971layout.c_x, (ViewGroup) null);
            ImageView imageView = (ImageView) inflate.findViewById(C0966R.C0970id.kq4);
            if (LocaleUtil.isChineseAppLang()) {
                imageView.setImageResource(C0966R.C0969drawable.cdh);
            } else {
                imageView.setImageResource(C0966R.C0969drawable.cdi);
            }
            C74253h hVar = new C74253h((C74245a) null);
            inflate.findViewById(C0966R.C0970id.kq8).setOnClickListener(new C74275v(hVar, nVar, aVar));
            nVar.f225771i = new C44868w(nVar, inflate);
            nVar.f225761d = new C74293x(hVar, r, 0, isNullOrNil, str, c);
            nVar.mo107559d(true);
            nVar.mo107573q();
        } else {
            m88502m(f4Var, cVar, bVar, i, 0);
        }
    }

    /* renamed from: m */
    public static void m88502m(C72963f4 f4Var, C74023i.C74026c cVar, C67391b bVar, int i, int i2) {
        String str;
        if (f4Var == null) {
            Log.m105920e("MicroMsg.ChattingItemAppMsg", "handleAppBrandClickIncludeTodo: msginfo is null");
            return;
        }
        boolean isNullOrNil = Util.isNullOrNil(f4Var.f230738V);
        Activity f = bVar.mo91565f();
        String t = f4Var.mo108768t();
        if (!Util.isNullOrNil(f4Var.f230738V)) {
            str = f4Var.f230738V;
        } else if (f4Var.mo100971J3()) {
            str = "related_msgid_" + f4Var.mo108774y2();
        } else {
            C68070l.C68072b u = C68070l.C68072b.m80422u(f4Var.getContent(), (String) null);
            if (u == null) {
                Log.m105920e("MicroMsg.roomTodo.RoomTodoHelp", "content is null");
                str = "";
            } else {
                C80995a aVar = (C80995a) u.mo93555w(C80995a.class);
                if (aVar == null || Util.isNullOrNil(aVar.f237909r)) {
                    str = "related_msgid_" + f4Var.mo108774y2();
                } else {
                    str = aVar.f237909r;
                }
            }
        }
        C76758b0.m92503h(f, t, str, C76758b0.m92498c(f4Var), isNullOrNil, 2, i, i2, new C74246b(isNullOrNil, cVar, bVar, f4Var));
    }

    /* renamed from: n */
    public static boolean m88503n(C72963f4 f4Var, C68070l.C68072b bVar, C67391b bVar2) {
        if (f4Var == null || bVar == null) {
            return false;
        }
        if (!C33860c.m40172a(bVar)) {
            if (!(bVar.f195582i == 44)) {
                return false;
            }
        }
        return C31543z5.m39453c() - f4Var.getCreateTime() < C77712d.f226493e.longValue() && C45628s0.m50755T(bVar2.mo91577r());
    }

    /* renamed from: o */
    public static void m88504o(TextView textView, C68070l.C68072b bVar) {
        int i = bVar.f195653z2;
        if (i == 1) {
            textView.setText(C0966R.string.f7869ui);
        } else if (i != 2) {
            textView.setText(C0966R.string.f7674nk);
        } else {
            textView.setText(C0966R.string.f7868uh);
        }
        textView.setVisibility(0);
    }

    /* renamed from: p */
    public static void m88505p(Intent intent, C72963f4 f4Var, C68070l.C68072b bVar) {
        intent.putExtra("webpageTitle", bVar.f195570f);
        intent.putExtra("thumbUrl", bVar.f195646y);
        intent.putExtra("thumbPath", ((C92839m) ((C98201k) C86312j.m106911c(C98201k.class)).mo137277xi()).h30(f4Var.mo108765s2()));
    }

    /* renamed from: q */
    public static boolean m88506q(C68070l.C68072b bVar, C74255e eVar) {
        C90621r0 r0Var = (C90621r0) bVar.mo93555w(C90621r0.class);
        if (!(r0Var != null && !Util.isNullOrNil(r0Var.f260345b))) {
            return false;
        }
        eVar.f218062i.setVisibility(0);
        eVar.f218054e.setVisibility(0);
        eVar.f218054e.setText(C0966R.string.k3n);
        eVar.f218056f.setVisibility(0);
        eVar.f218056f.setImageResource(C0966R.C0969drawable.cdj);
        return true;
    }

    /* renamed from: r */
    public static void m88507r(boolean z, C74255e eVar, C67391b bVar) {
        if (eVar != null) {
            if (z) {
                eVar.f218075o0.setBackgroundResource(C0966R.C0969drawable.f4760m5);
                eVar.f218077p0.setTextColor(bVar.mo91565f().getResources().getColor(C0966R.color.BW_100_Alpha_0_8));
                eVar.f218077p0.setText(C0966R.string.f360865fg2);
                return;
            }
            eVar.f218075o0.setBackgroundResource(C0966R.C0969drawable.f4761m6);
            eVar.f218077p0.setTextColor(bVar.mo91565f().getResources().getColor(C0966R.color.f2939n));
            eVar.f218077p0.setText(C0966R.string.fg4);
        }
    }
}
