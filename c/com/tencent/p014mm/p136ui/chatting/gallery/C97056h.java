package com.tencent.p014mm.p136ui.chatting.gallery;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.C2CImgWaitingTimeStruct;
import com.tencent.p014mm.graphics.MMBitmapFactory;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.modelimage.C1300x;
import com.tencent.p014mm.modelimage.C92822e;
import com.tencent.p014mm.modelimage.C92836k;
import com.tencent.p014mm.modelimage.C92839m;
import com.tencent.p014mm.p136ui.base.MultiTouchImageView;
import com.tencent.p014mm.p136ui.base.WxImageView;
import com.tencent.p014mm.p136ui.chatting.ChattingUI;
import com.tencent.p014mm.p136ui.transmit.MsgRetransmitUI;
import com.tencent.p014mm.platformtools.ExportFileUtil;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.scanner.C94466j;
import com.tencent.p014mm.plugin.webview.p128ui.tools.media.C44080p;
import com.tencent.p014mm.plugin.webview.p128ui.tools.media.C44085t;
import com.tencent.p014mm.pluginsdk.model.app.C72683d;
import com.tencent.p014mm.pluginsdk.model.app.C72695v;
import com.tencent.p014mm.pluginsdk.model.app.C72709y1;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.ForceGpuUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.system.AndroidMediaUtil;
import com.tencent.p014mm.storage.C72954a0;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import eb0.C116756s5;
import eb0.C75569c4;
import eb0.C75592q0;
import eb0.C97625j3;
import g62.C75875l;
import hd0.C98408n0;
import hd0.C98410o0;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import java.util.concurrent.Callable;
import junit.framework.Assert;
import k20.C9556a;
import nj3.C100120b1;
import nj3.C76879j;
import nj3.C76912y0;
import ob0.C117747y;
import p158gt.C76053l;
import p158gt.C98201k;
import p159gw.C98250h;
import p215oo.C77032h;
import p329d3.C86165a;
import p556hw.C76247e;
import p682rz.C101488s;
import p682rz.C101489t;
import p682rz.C101491u;
import p740wo.C53193b;
import p749xh.C38543c8;
import p755xs.C102720b;
import pc0.C100760a0;
import s90.C48300n;
import sf0.C101594c0;
import sf0.C48373d0;
import te3.tc4;
import zt3.C119157j;

/* renamed from: com.tencent.mm.ui.chatting.gallery.h */
public class C97056h extends C100120b1 {

    /* renamed from: A */
    public static final Set<Long> f284711A = new HashSet();

    /* renamed from: y */
    public static long f284712y = -1;

    /* renamed from: z */
    public static boolean f284713z;

    /* renamed from: g */
    public ImageGalleryUI f284714g;

    /* renamed from: h */
    public C97063f f284715h;

    /* renamed from: i */
    public String f284716i;

    /* renamed from: j */
    public boolean f284717j = true;

    /* renamed from: n */
    public boolean f284718n = false;

    /* renamed from: o */
    public C97100o f284719o;

    /* renamed from: p */
    public C97052g f284720p;

    /* renamed from: q */
    public C97150w f284721q;

    /* renamed from: r */
    public C97068h f284722r;

    /* renamed from: s */
    public boolean f284723s = false;

    /* renamed from: t */
    public String f284724t = null;

    /* renamed from: u */
    public boolean f284725u = true;

    /* renamed from: v */
    public boolean f284726v = true;

    /* renamed from: w */
    public C2CImgWaitingTimeStruct f284727w;

    /* renamed from: x */
    public final Map<C72963f4, Boolean> f284728x;

    /* renamed from: com.tencent.mm.ui.chatting.gallery.h$a */
    public class C97057a implements Callable<String> {

        /* renamed from: d */
        public final /* synthetic */ List f284729d;

        /* renamed from: e */
        public final /* synthetic */ Context f284730e;

        public C97057a(List list, Context context) {
            this.f284729d = list;
            this.f284730e = context;
        }

        public Object call() {
            boolean z = false;
            boolean z2 = this.f284729d.size() <= 1;
            for (C72963f4 f4Var : this.f284729d) {
                boolean m = C97056h.m124955K(f4Var) ? C97056h.m124959m(this.f284730e, f4Var, z2) : C97056h.m124957k(this.f284730e, f4Var, z2);
                if (!z && m) {
                    z = true;
                }
            }
            if (z2) {
                return "";
            }
            if (z) {
                return "Success";
            }
            return null;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.gallery.h$b */
    public class C97058b implements C86165a<String> {

        /* renamed from: a */
        public final /* synthetic */ Context f284731a;

        public C97058b(Context context) {
            this.f284731a = context;
        }

        public void accept(Object obj) {
            String str = (String) obj;
            if (str == null) {
                Context context = this.f284731a;
                ExportFileUtil.m117209g(context, context.getString(C0966R.string.ial));
            } else if (!TextUtils.isEmpty(str)) {
                Context context2 = this.f284731a;
                ExportFileUtil.m117209g(context2, context2.getString(C0966R.string.cgo, new Object[]{AndroidMediaUtil.getSysCameraDirPath()}));
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.gallery.h$c */
    public class C97059c implements Callable<String> {

        /* renamed from: d */
        public final /* synthetic */ Context f284732d;

        /* renamed from: e */
        public final /* synthetic */ C72963f4 f284733e;

        /* renamed from: f */
        public final /* synthetic */ boolean f284734f;

        public C97059c(Context context, C72963f4 f4Var, boolean z) {
            this.f284732d = context;
            this.f284733e = f4Var;
            this.f284734f = z;
        }

        public Object call() {
            return C97056h.m124957k(this.f284732d, this.f284733e, this.f284734f) ? "Success" : "Fail";
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.gallery.h$d */
    public class C97060d implements C86165a<String> {

        /* renamed from: a */
        public final /* synthetic */ boolean f284735a;

        /* renamed from: b */
        public final /* synthetic */ Context f284736b;

        public C97060d(boolean z, Context context) {
            this.f284735a = z;
            this.f284736b = context;
        }

        public void accept(Object obj) {
            String str = (String) obj;
            if (this.f284735a && str == null) {
                Context context = this.f284736b;
                ExportFileUtil.m117209g(context, context.getString(C0966R.string.iak));
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.gallery.h$e */
    public class C97061e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C72963f4 f284737d;

        /* renamed from: e */
        public final /* synthetic */ C97087m1 f284738e;

        /* renamed from: f */
        public final /* synthetic */ String f284739f;

        /* renamed from: com.tencent.mm.ui.chatting.gallery.h$e$a */
        public class C97062a implements C72695v.C72701f {
            public C97062a() {
            }

            /* renamed from: m */
            public void mo100168m(int i, int i2, C117747y yVar) {
                Bitmap bitmap;
                if (i == i2) {
                    Log.m105919d("MicroMsg.ImageGalleryAdapter", "appmsgImg download finish! msgid: %s", Long.valueOf(C97061e.this.f284737d.getMsgId()));
                    C97087m1 m1Var = C97061e.this.f284738e;
                    m1Var.mo135972h(m1Var.f284858y, 8);
                    try {
                        String str = C97061e.this.f284739f;
                        Vector<WeakReference<C102720b.C78973a>> vector = C101594c0.f297416a;
                        C101594c0.C101596b bVar = C101594c0.C101596b.INSTANCE;
                        if (Util.isNullOrNil(str)) {
                            Log.m105928w("MicroMsg.MMPictureLogic", "error input, path is null");
                            bitmap = null;
                        } else {
                            bitmap = BitmapUtil.getBitmapNative(str, 0, 0);
                        }
                    } catch (OutOfMemoryError unused) {
                        Log.m105929w("MicroMsg.ImageGalleryAdapter", "[tomys] Oops, app img [%s] is too large, use resample version.", C97061e.this.f284739f);
                        Runtime.getRuntime().gc();
                        Runtime.getRuntime().runFinalization();
                        bitmap = ((C102720b) C86312j.m106911c(C102720b.class)).mo142105Ou(C97061e.this.f284739f);
                    }
                    if (bitmap != null) {
                        C97061e.this.f284738e.f284820C.setEnableHorLongBmpMode(false);
                        ForceGpuUtil.decideLayerType(C97061e.this.f284738e.f284820C, bitmap.getWidth(), bitmap.getHeight());
                        MultiTouchImageView multiTouchImageView = C97061e.this.f284738e.f284820C;
                        int width = bitmap.getWidth();
                        int height = bitmap.getHeight();
                        multiTouchImageView.f348280o = width;
                        multiTouchImageView.f348281p = height;
                        C97061e.this.f284738e.f284820C.setImageBitmap(bitmap);
                        C97061e.this.f284738e.f284820C.invalidate();
                    }
                }
            }
        }

        public C97061e(C97056h hVar, C72963f4 f4Var, C97087m1 m1Var, String str) {
            this.f284737d = f4Var;
            this.f284738e = m1Var;
            this.f284739f = str;
        }

        public void run() {
            C72695v.m85062d(this.f284737d, new C97062a());
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.gallery.h$f */
    public static class C97063f {

        /* renamed from: p */
        public static int f284741p = 100000;

        /* renamed from: a */
        public String f284742a;

        /* renamed from: b */
        public List<C72963f4> f284743b;

        /* renamed from: c */
        public int f284744c;

        /* renamed from: d */
        public int f284745d;

        /* renamed from: e */
        public int f284746e;

        /* renamed from: f */
        public int f284747f;

        /* renamed from: g */
        public boolean f284748g = false;

        /* renamed from: h */
        public int f284749h;

        /* renamed from: i */
        public int f284750i;

        /* renamed from: j */
        public int f284751j;

        /* renamed from: k */
        public long f284752k;

        /* renamed from: l */
        public C97056h f284753l;

        /* renamed from: m */
        public HashMap<Long, C92836k> f284754m = new HashMap<>();

        /* renamed from: n */
        public HashMap<Long, C92836k> f284755n = new HashMap<>();

        /* renamed from: o */
        public MMHandler f284756o = new MMHandler();

        /* renamed from: com.tencent.mm.ui.chatting.gallery.h$f$a */
        public class C97064a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ long f284757d;

            /* renamed from: e */
            public final /* synthetic */ Boolean f284758e;

            /* renamed from: f */
            public final /* synthetic */ C97056h f284759f;

            /* renamed from: com.tencent.mm.ui.chatting.gallery.h$f$a$a */
            public class C97065a implements Runnable {
                public C97065a() {
                }

                public void run() {
                    C97063f.m124990a(C97063f.this, true);
                    C97068h hVar = C97064a.this.f284759f.f284722r;
                    if (hVar != null) {
                        ImageGalleryUI$$h imageGalleryUI$$h = (ImageGalleryUI$$h) hVar;
                        ImageGalleryUI imageGalleryUI = imageGalleryUI$$h.f284511a;
                        if (imageGalleryUI.f284432g != null) {
                            imageGalleryUI.mo135753X8(false);
                            imageGalleryUI$$h.f284511a.mo135739Q8(true);
                            C97056h hVar2 = imageGalleryUI$$h.f284511a.f284432g;
                            int i = C97063f.f284741p;
                            if (hVar2.f284719o != null && C97056h.m124953H(hVar2.mo135937y(i))) {
                                hVar2.f284719o.f284888h.onPageSelected(i);
                            }
                        }
                    }
                }
            }

            public C97064a(long j, Boolean bool, C97056h hVar) {
                this.f284757d = j;
                this.f284758e = bool;
                this.f284759f = hVar;
            }

            public void run() {
                String str;
                String str2;
                String str3;
                long j;
                char c;
                int i;
                String str4;
                int i2;
                int i3;
                int i4;
                long j2;
                String str5;
                int i5;
                C97063f fVar = C97063f.this;
                long j3 = this.f284757d;
                fVar.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                Log.m105924i("MicroMsg.AutoList", "isBizChat = " + C97056h.f284713z);
                if (C97056h.f284713z) {
                    fVar.f284749h = C97625j3.m125812b().mo105897l().mo100927k(fVar.f284742a, C97056h.f284712y);
                } else {
                    fVar.f284749h = ((C72972g4) C97625j3.m125812b().mo105911z()).wx0(fVar.f284742a);
                }
                Log.m105924i("MicroMsg.AutoList", "<init>, totalCount = " + fVar.f284749h);
                Log.m105925i("MicroMsg.AutoList", "totalCount spent : %s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                String str6 = "MicroMsg.AutoList";
                long currentTimeMillis2 = System.currentTimeMillis();
                if (C97056h.f284713z) {
                    C72954a0 l = C97625j3.m125812b().mo105897l();
                    String str7 = fVar.f284742a;
                    long j4 = C97056h.f284712y;
                    String str8 = " ";
                    C72963f4 b002 = ((C72972g4) l.f212648a).b00(j3);
                    if (b002.getMsgId() == 0) {
                        Log.m105920e("MicroMsg.BizChatMessageStorage", "getCountEarlyThan fail, msg does not exist");
                        j2 = j3;
                        str = "MicroMsg.MsgInfoStorage";
                        str5 = "getCountEarlyThan fail, msg does not exist";
                        i5 = 0;
                    } else {
                        str5 = "getCountEarlyThan fail, msg does not exist";
                        String str9 = str7;
                        str = "MicroMsg.MsgInfoStorage";
                        String str10 = str9;
                        String e = l.mo100941e(str10);
                        j2 = j3;
                        StringBuilder sb = new StringBuilder();
                        sb.append("SELECT COUNT(*) FROM ");
                        sb.append(e);
                        sb.append(" INDEXED BY bizmessageBizChatIdTypeCreateTimeIndex ");
                        sb.append(" WHERE ");
                        sb.append(l.mo100925i(str10));
                        sb.append(l.mo100928l(str10, j4));
                        sb.append("AND ");
                        l.f212648a.getClass();
                        sb.append("type IN (3,39,13,43,62,44,268435505,486539313,1124073521)");
                        sb.append(" AND ");
                        sb.append("createTime");
                        sb.append(" < ");
                        sb.append(b002.getCreateTime());
                        Cursor rawQuery = l.mo100940c().rawQuery(sb.toString(), (String[]) null);
                        i5 = rawQuery.moveToLast() ? rawQuery.getInt(0) : 0;
                        rawQuery.close();
                    }
                    fVar.f284750i = i5;
                    str2 = str8;
                    str3 = str5;
                    j = j2;
                    i = 1;
                    c = 0;
                } else {
                    long j5 = j3;
                    str = "MicroMsg.MsgInfoStorage";
                    String str11 = " ";
                    String str12 = "getCountEarlyThan fail, msg does not exist";
                    C75875l z = C97625j3.m125812b().mo105911z();
                    String str13 = fVar.f284742a;
                    C72972g4 g4Var = (C72972g4) z;
                    j = j5;
                    C72963f4 b003 = g4Var.b00(j);
                    if (b003.getMsgId() == 0) {
                        str3 = str12;
                        Log.m105920e(str, str3);
                        str2 = str11;
                        i3 = 0;
                        c = 0;
                    } else {
                        String str14 = str;
                        str3 = str12;
                        String hy02 = g4Var.hy0(str13);
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("SELECT COUNT(*) FROM ");
                        sb4.append(hy02);
                        str2 = str11;
                        sb4.append(str2);
                        sb4.append(g4Var.xx0(hy02));
                        sb4.append(" WHERE ");
                        sb4.append(g4Var.mo101130mL(str13));
                        sb4.append(g4Var.iy0(str13));
                        sb4.append("AND ");
                        sb4.append("type IN (3,39,13,43,62,44,268435505,486539313,1124073521)");
                        sb4.append(" AND ");
                        sb4.append("createTime");
                        sb4.append(" < ");
                        sb4.append(b003.getCreateTime());
                        Cursor rawQuery2 = g4Var.f212775p.rawQuery(sb4.toString(), (String[]) null, 2);
                        if (rawQuery2.moveToFirst()) {
                            c = 0;
                            i4 = rawQuery2.getInt(0);
                        } else {
                            c = 0;
                            i4 = 0;
                        }
                        rawQuery2.close();
                        i3 = i4;
                    }
                    fVar.f284750i = i3;
                    i = 1;
                }
                Object[] objArr = new Object[i];
                objArr[c] = Long.valueOf(System.currentTimeMillis() - currentTimeMillis2);
                String str15 = str6;
                Log.m105925i(str15, "min spent : %s", objArr);
                if (System.currentTimeMillis() - currentTimeMillis2 > 1000) {
                    C75875l z2 = C97625j3.m125812b().mo105911z();
                    String str16 = fVar.f284742a;
                    C72972g4 g4Var2 = (C72972g4) z2;
                    C72963f4 b004 = g4Var2.b00(j);
                    if (b004.getMsgId() == 0) {
                        Log.m105920e(str, str3);
                        i2 = 1;
                        str4 = null;
                    } else {
                        String hy03 = g4Var2.hy0(str16);
                        Cursor rawQuery3 = g4Var2.f212775p.rawQuery("EXPLAIN QUERY PLAN SELECT COUNT(*) FROM " + hy03 + str2 + g4Var2.xx0(hy03) + " WHERE" + g4Var2.mo101130mL(str16) + g4Var2.iy0(str16) + "AND " + "type IN (3,39,13,43,62,44,268435505,486539313,1124073521)" + " AND " + "createTime" + " < " + b004.getCreateTime(), (String[]) null);
                        str4 = "";
                        if (rawQuery3.moveToFirst()) {
                            for (int i6 = 0; i6 < rawQuery3.getColumnCount(); i6++) {
                                str4 = str4 + rawQuery3.getString(i6) + str2;
                            }
                        }
                        rawQuery3.close();
                        i2 = 1;
                    }
                    Object[] objArr2 = new Object[i2];
                    objArr2[0] = str4;
                    Log.m105929w(str15, "explain : %s", objArr2);
                }
                fVar.f284751j = fVar.f284750i;
                fVar.f284752k = j;
                if (this.f284758e.booleanValue()) {
                    C97063f.this.f284756o.postDelayed(new C97065a(), 0);
                }
            }
        }

        /* renamed from: com.tencent.mm.ui.chatting.gallery.h$f$b */
        public class C97066b implements ImageGalleryUI$$w0 {

            /* renamed from: a */
            public final /* synthetic */ C97056h f284762a;

            public C97066b(C97056h hVar) {
                this.f284762a = hVar;
            }

            /* renamed from: a */
            public void mo135948a(Boolean bool) {
                Log.m105924i("MicroMsg.AutoList", "isPlaying : " + bool);
                if (!bool.booleanValue()) {
                    C97063f.m124990a(C97063f.this, true);
                    C97068h hVar = this.f284762a.f284722r;
                    if (hVar != null) {
                        ImageGalleryUI$$h imageGalleryUI$$h = (ImageGalleryUI$$h) hVar;
                        ImageGalleryUI imageGalleryUI = imageGalleryUI$$h.f284511a;
                        if (imageGalleryUI.f284432g != null) {
                            imageGalleryUI.mo135753X8(false);
                            imageGalleryUI$$h.f284511a.mo135739Q8(true);
                            C97056h hVar2 = imageGalleryUI$$h.f284511a.f284432g;
                            int i = C97063f.f284741p;
                            if (hVar2.f284719o != null && C97056h.m124953H(hVar2.mo135937y(i))) {
                                hVar2.f284719o.f284888h.onPageSelected(i);
                            }
                        }
                    }
                }
            }
        }

        public C97063f(long j, String str, C97056h hVar, Boolean bool, int i) {
            boolean z = false;
            this.f284742a = str;
            this.f284743b = new LinkedList();
            this.f284753l = hVar;
            this.f284746e = i;
            if (hVar.f284723s) {
                this.f284743b.add(C97052g.m124925m(str, hVar.f284714g));
                f284741p = 0;
                return;
            }
            f284741p = 100000;
            C72963f4 b002 = ((C72972g4) C97625j3.m125812b().mo105911z()).b00(j);
            if (b002.getMsgId() == 0) {
                Assert.assertTrue("MicroMsg.AutoList <init>, currentMsg does not exist, currentMsgId = " + j + ", stack = " + Util.getStack(), false);
                return;
            }
            this.f284743b.add(b002);
            int i2 = this.f284746e;
            if (!(i2 == 1)) {
                if (!(i2 == 2 ? true : z)) {
                    C97625j3.m125817g().postToWorker(new C97064a(j, bool, hVar));
                    hVar.f284714g.f284428e2 = new C97066b(hVar);
                }
            }
        }

        /* renamed from: a */
        public static void m124990a(C97063f fVar, boolean z) {
            int i;
            fVar.f284748g = true;
            int i2 = fVar.f284749h;
            fVar.f284744c = i2;
            fVar.f284745d = fVar.f284750i;
            fVar.f284747f = fVar.f284751j;
            Log.m105925i("MicroMsg.AutoList", "totalCount %s min %s start %s", Integer.valueOf(i2), Integer.valueOf(fVar.f284745d), Integer.valueOf(fVar.f284747f));
            Log.m105925i("MicroMsg.AutoList", "min spent : %s", Long.valueOf(System.currentTimeMillis() - System.currentTimeMillis()));
            long currentTimeMillis = System.currentTimeMillis();
            fVar.mo135944d(fVar.f284752k, true);
            Log.m105925i("MicroMsg.AutoList", "loadMsgInfo spent : %s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            long currentTimeMillis2 = System.currentTimeMillis();
            fVar.mo135944d(fVar.f284752k, false);
            Log.m105925i("MicroMsg.AutoList", "loadMsgInfo spent : %s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis2));
            fVar.f284753l.notifyDataSetChanged();
            if (!fVar.f284753l.f284714g.isFinishing() && (i = f284741p) > 0) {
                C97056h hVar = fVar.f284753l;
                hVar.mo129060d(i - 1, (View) hVar.f293276f.get(i - 1), fVar.f284753l.f284714g.f284450n);
            }
        }

        /* renamed from: b */
        public C72963f4 mo135942b(int i) {
            int i2 = (i - f284741p) + this.f284747f;
            int size = (this.f284745d + ((LinkedList) this.f284743b).size()) - 1;
            if (i2 < this.f284745d || i2 > size) {
                Log.m105920e("MicroMsg.AutoList", "get, invalid pos " + i2 + ", min = " + this.f284745d + ", max = " + size);
                return null;
            }
            Log.m105918d("MicroMsg.AutoList", "get, pos = " + i2);
            int i3 = this.f284745d;
            if (i2 == i3) {
                C72963f4 f4Var = (C72963f4) ((LinkedList) this.f284743b).get(0);
                if (this.f284748g) {
                    mo135944d(f4Var.getMsgId(), false);
                }
                return f4Var;
            } else if (i2 != size || size >= this.f284744c - 1) {
                return (C72963f4) ((LinkedList) this.f284743b).get(i2 - i3);
            } else {
                LinkedList linkedList = (LinkedList) this.f284743b;
                C72963f4 f4Var2 = (C72963f4) linkedList.get(linkedList.size() - 1);
                if (this.f284748g) {
                    mo135944d(f4Var2.getMsgId(), true);
                }
                return f4Var2;
            }
        }

        /* renamed from: c */
        public int mo135943c() {
            return (this.f284744c - this.f284747f) + f284741p + 1;
        }

        /* JADX WARNING: Removed duplicated region for block: B:46:0x0272  */
        /* JADX WARNING: Removed duplicated region for block: B:86:0x04c0  */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo135944d(long r29, boolean r31) {
            /*
                r28 = this;
                r0 = r28
                r1 = r29
                r3 = r31
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "start loadMsgInfo, currentMsgId = "
                r4.append(r5)
                r4.append(r1)
                java.lang.String r5 = ", forward = "
                r4.append(r5)
                r4.append(r3)
                java.lang.String r4 = r4.toString()
                java.lang.String r6 = "MicroMsg.AutoList"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r4)
                boolean r4 = com.tencent.p014mm.p136ui.chatting.gallery.C97056h.f284713z
                java.lang.String r7 = " ASC limit "
                java.lang.String r8 = " > "
                java.lang.String r9 = " DESC limit "
                java.lang.String r10 = " < "
                java.lang.String r11 = "getImgMessage fail, msg is null"
                java.lang.String r12 = "createTime"
                java.lang.String r13 = "select * from "
                java.lang.String r14 = " where"
                java.lang.String r15 = "AND "
                r16 = r6
                java.lang.String r6 = "type IN (3,39,13,43,62,44,268435505,486539313,1124073521)"
                r17 = r5
                java.lang.String r5 = " AND "
                r18 = 0
                r20 = r9
                java.lang.String r9 = "getImgMessage fail, argument is invalid, limit = 10"
                r21 = r9
                if (r4 == 0) goto L_0x017c
                eb0.c r4 = eb0.C97625j3.m125812b()
                com.tencent.mm.storage.a0 r4 = r4.mo105897l()
                java.lang.String r9 = r0.f284742a
                r22 = r7
                r23 = r8
                long r7 = com.tencent.p014mm.p136ui.chatting.gallery.C97056h.f284712y
                r4.getClass()
                long r24 = java.lang.System.currentTimeMillis()
                java.lang.String r0 = "MicroMsg.BizChatMessageStorage"
                if (r9 == 0) goto L_0x0173
                int r26 = r9.length()
                if (r26 == 0) goto L_0x0173
                r26 = r10
                g62.l r10 = r4.f212648a
                com.tencent.mm.storage.g4 r10 = (com.tencent.p014mm.storage.C72972g4) r10
                long r1 = r10.Wa0(r9, r1)
                int r10 = (r1 > r18 ? 1 : (r1 == r18 ? 0 : -1))
                if (r10 != 0) goto L_0x0081
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r11)
                goto L_0x0179
            L_0x0081:
                java.util.ArrayList r10 = new java.util.ArrayList
                r10.<init>()
                java.lang.String r11 = "  order by "
                r27 = r0
                java.lang.String r0 = " INDEXED BY bizmessageBizChatIdTypeCreateTimeIndex "
                if (r3 == 0) goto L_0x00da
                r29 = r10
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                r10.append(r13)
                java.lang.String r13 = r4.mo100941e(r9)
                r10.append(r13)
                r10.append(r0)
                r10.append(r14)
                java.lang.String r0 = r4.mo100928l(r9, r7)
                r10.append(r0)
                r10.append(r15)
                g62.l r0 = r4.f212648a
                r0.getClass()
                r10.append(r6)
                r10.append(r5)
                r10.append(r12)
                r0 = r23
                r10.append(r0)
                r10.append(r1)
                r10.append(r11)
                r10.append(r12)
                r7 = r22
                r10.append(r7)
                r0 = 10
                r10.append(r0)
                java.lang.String r0 = r10.toString()
                goto L_0x0125
            L_0x00da:
                r29 = r10
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                r10.append(r13)
                java.lang.String r13 = r4.mo100941e(r9)
                r10.append(r13)
                r10.append(r0)
                r10.append(r14)
                java.lang.String r0 = r4.mo100928l(r9, r7)
                r10.append(r0)
                r10.append(r15)
                g62.l r0 = r4.f212648a
                r0.getClass()
                r10.append(r6)
                r10.append(r5)
                r10.append(r12)
                r8 = r26
                r10.append(r8)
                r10.append(r1)
                r10.append(r11)
                r10.append(r12)
                r9 = r20
                r10.append(r9)
                r0 = 10
                r10.append(r0)
                java.lang.String r0 = r10.toString()
            L_0x0125:
                zh3.f r1 = r4.mo100940c()
                r2 = 0
                android.database.Cursor r0 = r1.rawQuery(r0, r2)
                boolean r1 = r0.moveToFirst()
                if (r1 == 0) goto L_0x0154
            L_0x0134:
                boolean r1 = r0.isAfterLast()
                if (r1 != 0) goto L_0x0154
                com.tencent.mm.storage.f4 r1 = new com.tencent.mm.storage.f4
                r1.<init>()
                r1.convertFrom(r0)
                r0.moveToNext()
                if (r3 == 0) goto L_0x014d
                r2 = r29
                r2.add(r1)
                goto L_0x0134
            L_0x014d:
                r2 = r29
                r4 = 0
                r2.add(r4, r1)
                goto L_0x0134
            L_0x0154:
                r2 = r29
                r4 = 0
                r0.close()
                r0 = 1
                java.lang.Object[] r1 = new java.lang.Object[r0]
                long r5 = java.lang.System.currentTimeMillis()
                long r5 = r5 - r24
                java.lang.Long r0 = java.lang.Long.valueOf(r5)
                r1[r4] = r0
                java.lang.String r0 = "getBizChatImgVideoMessage spent : %s"
                r4 = r27
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r0, r1)
                r9 = r2
                goto L_0x0268
            L_0x0173:
                r4 = r0
                r10 = r21
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r10)
            L_0x0179:
                r9 = 0
                goto L_0x0268
            L_0x017c:
                r0 = r8
                r8 = r10
                r9 = r20
                r10 = r21
                eb0.c r4 = eb0.C97625j3.m125812b()
                g62.l r4 = r4.mo105911z()
                r10 = r28
                java.lang.String r9 = r10.f284742a
                com.tencent.mm.storage.g4 r4 = (com.tencent.p014mm.storage.C72972g4) r4
                r4.getClass()
                java.lang.String r10 = "MicroMsg.MsgInfoStorage"
                if (r9 == 0) goto L_0x0261
                int r22 = r9.length()
                if (r22 == 0) goto L_0x0261
                long r1 = r4.Wa0(r9, r1)
                int r21 = (r1 > r18 ? 1 : (r1 == r18 ? 0 : -1))
                if (r21 != 0) goto L_0x01a9
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r11)
                goto L_0x0179
            L_0x01a9:
                java.util.ArrayList r10 = new java.util.ArrayList
                r10.<init>()
                java.lang.String r11 = " order by "
                if (r3 == 0) goto L_0x01f7
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r8.append(r13)
                java.lang.String r13 = r4.hy0(r9)
                r8.append(r13)
                r8.append(r14)
                java.lang.String r13 = r4.mo101130mL(r9)
                r8.append(r13)
                java.lang.String r9 = r4.iy0(r9)
                r8.append(r9)
                r8.append(r15)
                r8.append(r6)
                r8.append(r5)
                r8.append(r12)
                r8.append(r0)
                r8.append(r1)
                r8.append(r11)
                r8.append(r12)
                r8.append(r7)
                r0 = 10
                r8.append(r0)
                java.lang.String r0 = r8.toString()
                goto L_0x023d
            L_0x01f7:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r13)
                java.lang.String r7 = r4.hy0(r9)
                r0.append(r7)
                r0.append(r14)
                java.lang.String r7 = r4.mo101130mL(r9)
                r0.append(r7)
                java.lang.String r7 = r4.iy0(r9)
                r0.append(r7)
                r0.append(r15)
                r0.append(r6)
                r0.append(r5)
                r0.append(r12)
                r0.append(r8)
                r0.append(r1)
                r0.append(r11)
                r0.append(r12)
                r1 = r20
                r0.append(r1)
                r1 = 10
                r0.append(r1)
                java.lang.String r0 = r0.toString()
            L_0x023d:
                zh3.f r1 = r4.f212775p
                r2 = 2
                r4 = 0
                android.database.Cursor r0 = r1.rawQuery(r0, r4, r2)
            L_0x0245:
                boolean r1 = r0.moveToNext()
                if (r1 == 0) goto L_0x0257
                com.tencent.mm.storage.f4 r1 = new com.tencent.mm.storage.f4
                r1.<init>()
                r1.convertFrom(r0)
                r10.add(r1)
                goto L_0x0245
            L_0x0257:
                if (r3 != 0) goto L_0x025c
                java.util.Collections.reverse(r10)
            L_0x025c:
                r0.close()
                r9 = r10
                goto L_0x0268
            L_0x0261:
                r4 = 0
                r0 = r21
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)
                r9 = r4
            L_0x0268:
                if (r9 == 0) goto L_0x04c0
                int r0 = r9.size()
                if (r0 != 0) goto L_0x0272
                goto L_0x04c0
            L_0x0272:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "loadMsgInfo done, new added list, size = "
                r0.append(r1)
                int r1 = r9.size()
                r0.append(r1)
                r1 = r17
                r0.append(r1)
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                r1 = r16
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
                long r4 = java.lang.System.currentTimeMillis()
                java.lang.Class<gt.k> r0 = p158gt.C98201k.class
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                java.util.ArrayList r6 = new java.util.ArrayList
                r6.<init>()
                r7 = 0
            L_0x02a6:
                int r8 = r9.size()
                if (r7 >= r8) goto L_0x02ea
                java.lang.Object r8 = r9.get(r7)
                com.tencent.mm.storage.f4 r8 = (com.tencent.p014mm.storage.C72963f4) r8
                boolean r8 = com.tencent.p014mm.p136ui.chatting.gallery.C97056h.m124953H(r8)
                if (r8 == 0) goto L_0x02e7
                java.lang.Object r8 = r9.get(r7)
                com.tencent.mm.storage.f4 r8 = (com.tencent.p014mm.storage.C72963f4) r8
                long r10 = r8.mo108774y2()
                java.lang.Long r8 = java.lang.Long.valueOf(r10)
                r2.add(r8)
                java.lang.Object r8 = r9.get(r7)
                com.tencent.mm.storage.f4 r8 = (com.tencent.p014mm.storage.C72963f4) r8
                int r8 = r8.mo108769t2()
                r10 = 1
                if (r8 != r10) goto L_0x02e7
                java.lang.Object r8 = r9.get(r7)
                com.tencent.mm.storage.f4 r8 = (com.tencent.p014mm.storage.C72963f4) r8
                long r10 = r8.getMsgId()
                java.lang.Long r8 = java.lang.Long.valueOf(r10)
                r6.add(r8)
            L_0x02e7:
                int r7 = r7 + 1
                goto L_0x02a6
            L_0x02ea:
                r7 = r28
                java.util.HashMap<java.lang.Long, com.tencent.mm.modelimage.k> r8 = r7.f284754m
                di3.d r10 = di3.C86312j.m106911c(r0)
                gt.k r10 = (p158gt.C98201k) r10
                gt.m r10 = r10.mo137277xi()
                r11 = 0
                java.lang.Long[] r12 = new java.lang.Long[r11]
                java.lang.Object[] r2 = r2.toArray(r12)
                java.lang.Long[] r2 = (java.lang.Long[]) r2
                r11 = r10
                com.tencent.mm.modelimage.m r11 = (com.tencent.p014mm.modelimage.C92839m) r11
                r11.getClass()
                int r10 = r2.length
                java.lang.String r19 = "("
                r14 = r19
                r12 = 0
                r13 = 1
            L_0x030e:
                java.lang.String r15 = ","
                if (r12 >= r10) goto L_0x034d
                r16 = r2[r12]
                r29 = r9
                r17 = r10
                long r9 = r16.longValue()
                r30 = r2
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r14)
                if (r13 == 0) goto L_0x032d
                java.lang.Long r9 = java.lang.Long.valueOf(r9)
                goto L_0x033c
            L_0x032d:
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                r13.append(r15)
                r13.append(r9)
                java.lang.String r9 = r13.toString()
            L_0x033c:
                r2.append(r9)
                java.lang.String r14 = r2.toString()
                int r12 = r12 + 1
                r9 = r29
                r2 = r30
                r10 = r17
                r13 = 0
                goto L_0x030e
            L_0x034d:
                r29 = r9
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r14)
                java.lang.String r9 = ")"
                r2.append(r9)
                java.lang.String r2 = r2.toString()
                r13 = 0
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r12 = "msgSvrId in "
                r10.append(r12)
                r10.append(r2)
                java.lang.String r14 = r10.toString()
                r2 = 0
                r16 = 0
                r17 = 0
                r18 = 0
                java.lang.String r12 = "ImgInfo2"
                r10 = r15
                r15 = r2
                android.database.Cursor r2 = r11.vx0(r12, r13, r14, r15, r16, r17, r18)
                java.util.HashMap r11 = new java.util.HashMap
                r11.<init>()
            L_0x0387:
                boolean r12 = r2.moveToNext()
                if (r12 == 0) goto L_0x039f
                com.tencent.mm.modelimage.k r12 = new com.tencent.mm.modelimage.k
                r12.<init>()
                r12.mo127131b(r2)
                long r13 = r12.f267375b
                java.lang.Long r13 = java.lang.Long.valueOf(r13)
                r11.put(r13, r12)
                goto L_0x0387
            L_0x039f:
                r2.close()
                r8.putAll(r11)
                java.util.HashMap<java.lang.Long, com.tencent.mm.modelimage.k> r2 = r7.f284755n
                di3.d r0 = di3.C86312j.m106911c(r0)
                gt.k r0 = (p158gt.C98201k) r0
                gt.m r0 = r0.mo137277xi()
                r8 = 0
                java.lang.Long[] r11 = new java.lang.Long[r8]
                java.lang.Object[] r6 = r6.toArray(r11)
                java.lang.Long[] r6 = (java.lang.Long[]) r6
                r11 = r0
                com.tencent.mm.modelimage.m r11 = (com.tencent.p014mm.modelimage.C92839m) r11
                r11.getClass()
                int r0 = r6.length
                r13 = r19
                r8 = 0
                r12 = 1
            L_0x03c5:
                if (r8 >= r0) goto L_0x03fa
                r14 = r6[r8]
                long r14 = r14.longValue()
                r16 = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r13)
                if (r12 == 0) goto L_0x03de
                java.lang.Long r12 = java.lang.Long.valueOf(r14)
                goto L_0x03ed
            L_0x03de:
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                r12.append(r10)
                r12.append(r14)
                java.lang.String r12 = r12.toString()
            L_0x03ed:
                r0.append(r12)
                java.lang.String r13 = r0.toString()
                int r8 = r8 + 1
                r0 = r16
                r12 = 0
                goto L_0x03c5
            L_0x03fa:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r13)
                r0.append(r9)
                java.lang.String r0 = r0.toString()
                r13 = 0
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r8 = "msglocalid in "
                r6.append(r8)
                r6.append(r0)
                java.lang.String r14 = r6.toString()
                r15 = 0
                r16 = 0
                r17 = 0
                r18 = 0
                java.lang.String r12 = "ImgInfo2"
                android.database.Cursor r0 = r11.vx0(r12, r13, r14, r15, r16, r17, r18)
                java.util.HashMap r6 = new java.util.HashMap
                r6.<init>()
            L_0x042e:
                boolean r8 = r0.moveToNext()
                if (r8 == 0) goto L_0x0446
                com.tencent.mm.modelimage.k r8 = new com.tencent.mm.modelimage.k
                r8.<init>()
                r8.mo127131b(r0)
                long r9 = r8.f267375b
                java.lang.Long r9 = java.lang.Long.valueOf(r9)
                r6.put(r9, r8)
                goto L_0x042e
            L_0x0446:
                r0.close()
                r2.putAll(r6)
                r0 = 1
                java.lang.Object[] r0 = new java.lang.Object[r0]
                long r8 = java.lang.System.currentTimeMillis()
                long r8 = r8 - r4
                java.lang.Long r2 = java.lang.Long.valueOf(r8)
                r4 = 0
                r0[r4] = r2
                java.lang.String r2 = "loadImgInfo spent : %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r0)
                if (r3 == 0) goto L_0x046d
                java.util.List<com.tencent.mm.storage.f4> r0 = r7.f284743b
                java.util.LinkedList r0 = (java.util.LinkedList) r0
                r9 = r29
                r0.addAll(r9)
                goto L_0x04bf
            L_0x046d:
                r9 = r29
                java.util.List<com.tencent.mm.storage.f4> r0 = r7.f284743b
                java.util.LinkedList r0 = (java.util.LinkedList) r0
                r0.addAll(r4, r9)
                int r0 = r7.f284745d
                int r2 = r9.size()
                int r0 = r0 - r2
                r7.f284745d = r0
                if (r0 >= 0) goto L_0x0499
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "loadMsgInfo fail, min should not be minus, min = "
                r0.append(r2)
                int r2 = r7.f284745d
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
                return
            L_0x0499:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "min from "
                r0.append(r2)
                int r2 = r7.f284745d
                int r3 = r9.size()
                int r2 = r2 + r3
                r0.append(r2)
                java.lang.String r2 = " to "
                r0.append(r2)
                int r2 = r7.f284745d
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            L_0x04bf:
                return
            L_0x04c0:
                r7 = r28
                r1 = r16
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "loadMsgInfo fail, addedMsgList is null, forward = "
                r0.append(r2)
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.gallery.C97056h.C97063f.mo135944d(long, boolean):void");
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AutoList, Size = " + ((LinkedList) this.f284743b).size());
            sb.append("; Content = {");
            for (C72963f4 msgId : this.f284743b) {
                sb.append(msgId.getMsgId());
                sb.append(",");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.gallery.h$g */
    public enum C97067g {
        unkown,
        image,
        video,
        sight,
        appimage
    }

    /* renamed from: com.tencent.mm.ui.chatting.gallery.h$h */
    public interface C97068h {
    }

    public C97056h(ImageGalleryUI imageGalleryUI, long j, String str, boolean z, long j2, boolean z2, String str2, Boolean bool, int i) {
        ImageGalleryUI imageGalleryUI2 = imageGalleryUI;
        long j3 = j;
        String str3 = str;
        boolean z3 = true;
        new ArrayList();
        this.f284727w = null;
        this.f284728x = new HashMap();
        boolean booleanExtra = imageGalleryUI.getIntent().getBooleanExtra("img_gallery_is_mp_video_without_msg", false);
        this.f284723s = booleanExtra;
        if (!booleanExtra) {
            Assert.assertTrue("MicroMsg.ImageGalleryAdapter, invalid argument, context = " + imageGalleryUI + ", currentMsgId = " + j + ", talker = " + str + ", stack = " + Util.getStack(), (j3 <= 0 || str3 == null || str.length() <= 0) ? false : z3);
        }
        this.f284714g = imageGalleryUI2;
        f284713z = z;
        f284712y = j2;
        this.f284724t = str3;
        this.f284715h = new C97063f(j, str, this, bool, i);
        this.f284718n = z2;
        this.f284716i = str2;
        this.f284719o = new C97100o(this, new int[this.f284715h.mo135943c()]);
        if (C97136u0.m125067H()) {
            this.f284720p = new C97136u0(this);
        } else {
            this.f284720p = new ImageGalleryVideoHandler(this);
        }
        this.f284721q = new C97150w(this);
    }

    /* renamed from: B */
    public static C97067g m124949B(C72963f4 f4Var) {
        C97067g gVar = C97067g.video;
        return m124952F(f4Var) ? C97067g.appimage : m124953H(f4Var) ? C97067g.image : m124950D(f4Var) ? C97067g.sight : (!m124955K(f4Var) && !m124954I(f4Var)) ? C97067g.unkown : gVar;
    }

    /* renamed from: D */
    public static boolean m124950D(C72963f4 f4Var) {
        C98408n0 Zd;
        tc4 tc4;
        if (!(f4Var == null || f4Var.mo100983V3() || (Zd = ((C101491u) C86312j.m106911c(C101491u.class)).mo140806Zd(f4Var.mo108765s2())) == null || (tc4 = Zd.f288535C) == null)) {
            if (!Util.isNullOrNil(tc4.f299537d)) {
                return true;
            }
            tc4 tc42 = Zd.f288535C;
            if (tc42.f299538e > 0 || !Util.isNullOrNil(tc42.f299539f) || !Util.isNullOrNil(Zd.f288535C.f299540g) || !Util.isNullOrNil(Zd.f288535C.f299541h) || !Util.isNullOrNil(Zd.f288535C.f299542i) || !Util.isNullOrNil(Zd.f288535C.f299543j) || !Util.isNullOrNil(Zd.f288535C.f299544n)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: E */
    public static boolean m124951E(C72963f4 f4Var) {
        return f4Var != null && f4Var.getType() == 49;
    }

    /* renamed from: F */
    public static boolean m124952F(C72963f4 f4Var) {
        return f4Var != null && f4Var.getType() == 268435505;
    }

    /* renamed from: H */
    public static boolean m124953H(C72963f4 f4Var) {
        if (f4Var == null) {
            return false;
        }
        return f4Var.getType() == 3 || f4Var.getType() == 39 || f4Var.getType() == 13 || f4Var.getType() == 1124073521;
    }

    /* renamed from: I */
    public static boolean m124954I(C72963f4 f4Var) {
        return f4Var != null && f4Var.getType() == 62;
    }

    /* renamed from: K */
    public static boolean m124955K(C72963f4 f4Var) {
        if (f4Var != null && !m124950D(f4Var)) {
            return f4Var.getType() == 43 || f4Var.getType() == 486539313 || f4Var.getType() == 44 || f4Var.getType() == 62;
        }
        return false;
    }

    /* renamed from: j */
    public static void m124956j(Context context, List<C72963f4> list) {
        if (context != null && list != null && list.size() > 0) {
            ((C98250h) C86312j.m106911c(C98250h.class)).Rj0(context, new C97057a(list, context), new C97058b(context));
        }
    }

    /* renamed from: k */
    public static boolean m124957k(Context context, C72963f4 f4Var, boolean z) {
        C92836k kVar;
        String str;
        if (m124952F(f4Var)) {
            str = m124960s(f4Var);
            kVar = null;
        } else if (f4Var == null || f4Var.getMsgId() == 0) {
            Log.m105920e("MicroMsg.ImageGalleryAdapter", "msg is null");
            if (z) {
                ExportFileUtil.m117209g(context, context.getString(C0966R.string.iak));
            }
            return false;
        } else {
            kVar = C97100o.m125011p(f4Var);
            if (kVar == null || kVar.f267374a == 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("doRestransmitMsg fail, msgLocalId = ");
                sb.append(Long.valueOf(f4Var.getMsgId()));
                sb.append(", imgLocalId = ");
                sb.append(kVar == null ? "null" : Long.valueOf(kVar.f267374a));
                Log.m105920e("MicroMsg.ImageGalleryAdapter", sb.toString());
                if (z) {
                    ExportFileUtil.m117209g(context, context.getString(C0966R.string.iak));
                }
                return false;
            }
            str = C97100o.m125012r(f4Var, kVar, false);
        }
        if (str == null || str.length() == 0) {
            Log.m105920e("MicroMsg.ImageGalleryAdapter", "doRestransmitMsg fail, bigImgPath is null, msgLocalId = " + f4Var.getMsgId());
            if (z) {
                ExportFileUtil.m117209g(context, context.getString(C0966R.string.iak));
            }
            return false;
        }
        if (((HashSet) f284711A).contains(Long.valueOf(f4Var.getMsgId()))) {
            str = ((C94466j) C86312j.m106911c(C94466j.class)).Gb0(str).field_resultFile;
        }
        String sE = ((C98250h) C86312j.m106911c(C98250h.class)).mo137350sE(context, str);
        if (!Util.isNullOrNil(sE)) {
            if (z) {
                ExportFileUtil.m117209g(context, context.getString(C0966R.string.bwc, new Object[]{AndroidMediaUtil.getToastSysCameraPath()}));
            }
            ((C119157j) C119157j.f356862d).mo183876g(new C97081l(str, f4Var, kVar), "MsgImgExportReport");
            C48373d0.f129498a.mo73085b(C86013q1.m106456q(sE), C75569c4.m90685r(f4Var.f230724G));
            return true;
        }
        if (z) {
            ExportFileUtil.m117209g(context, context.getString(C0966R.string.iak));
        }
        return false;
    }

    /* renamed from: l */
    public static void m124958l(Context context, C72963f4 f4Var, boolean z) {
        if (context != null && f4Var != null) {
            ((C98250h) C86312j.m106911c(C98250h.class)).Rj0(context, new C97059c(context, f4Var, z), new C97060d(z, context));
        }
    }

    /* renamed from: m */
    public static boolean m124959m(Context context, C72963f4 f4Var, boolean z) {
        boolean z2;
        Context context2 = context;
        C72963f4 f4Var2 = f4Var;
        Class cls = C101488s.class;
        if (f4Var2 == null) {
            return false;
        }
        C98408n0 f = ((C98410o0) ((C101488s) C86312j.m106911c(cls)).Kj0()).mo137720f(f4Var.mo108765s2());
        String str = null;
        if (f != null) {
            int p1 = C72996z1.m85820U5(f.mo137707k()) ? ((C53193b) C86312j.m106911c(C53193b.class)).mo73729p1(f.mo137707k()) : 0;
            z2 = f.mo137710n();
            String str2 = f.f288546N;
            C115669n nVar = C115669n.INSTANCE;
            nVar.idkeyStat(106, 216, 1, false);
            nVar.mo160131h(12084, Integer.valueOf(f.f288559f), Integer.valueOf(f.f288566m * 1000), 0, 2, f.mo137707k(), Integer.valueOf(p1), C98408n0.m127710c(f.mo137705i()), Long.valueOf(f.f288563j));
            str = str2;
        } else {
            z2 = false;
        }
        if (!z2) {
            Log.m105928w("MicroMsg.ImageGalleryAdapter", "do export video but video had not download finish.");
            if (z) {
                ExportFileUtil.m117209g(context2, context2.getString(C0966R.string.kag));
            }
            return false;
        }
        C98408n0 Zd = ((C101491u) C86312j.m106911c(C101491u.class)).mo140806Zd(str);
        boolean n = Zd != null ? Zd.mo137710n() : false;
        C101489t Kj0 = ((C101488s) C86312j.m106911c(cls)).Kj0();
        if (!n) {
            str = f4Var.mo108765s2();
        }
        String q = ((C98410o0) Kj0).mo137728q(str);
        String o502 = ((C98250h) C86312j.m106911c(C98250h.class)).o50(context2, q);
        if (Util.isNullOrNil(o502)) {
            if (z) {
                ExportFileUtil.m117209g(context2, context2.getString(C0966R.string.kag));
            }
            return false;
        }
        if (z) {
            ExportFileUtil.m117209g(context2, context2.getString(C0966R.string.kah, new Object[]{AndroidMediaUtil.getFriendlySdcardPath(o502)}));
        }
        C48373d0.f129498a.mo73085b(C86013q1.m106456q(o502), C75569c4.m90685r(f4Var2.f230724G));
        AndroidMediaUtil.refreshMediaScannerAsync(o502, context2);
        ((C119157j) C119157j.f356862d).mo183876g(new C97078k(f4Var2, q, f), "MsgVideoExportReport");
        return true;
    }

    /* renamed from: s */
    public static String m124960s(C72963f4 f4Var) {
        String str;
        C72683d qq;
        C68070l.C68072b u = C68070l.C68072b.m80422u(f4Var.getContent(), (String) null);
        if (u == null || (str = u.f195606o) == null || str.length() <= 0 || (qq = C72709y1.vx0().mo100154qq(u.f195606o)) == null) {
            return null;
        }
        return qq.field_fileFullPath;
    }

    /* renamed from: A */
    public Boolean mo135914A(C72963f4 f4Var) {
        if (this.f284728x.containsKey(f4Var)) {
            return this.f284728x.get(f4Var);
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: com.tencent.mm.ui.chatting.gallery.m1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo129060d(int r18, android.view.View r19, android.view.ViewGroup r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            com.tencent.mm.storage.f4 r2 = r17.mo135937y(r18)
            r3 = 0
            if (r19 != 0) goto L_0x001d
            com.tencent.mm.ui.chatting.gallery.ImageGalleryUI r4 = r0.f284714g
            r5 = 2131495993(0x7f0c0c39, float:1.8615538E38)
            android.view.View r4 = android.view.View.inflate(r4, r5, r3)
            com.tencent.mm.ui.chatting.gallery.m1 r5 = new com.tencent.mm.ui.chatting.gallery.m1
            r5.<init>(r0, r4, r2)
            r4.setTag(r5)
            goto L_0x0026
        L_0x001d:
            java.lang.Object r4 = r19.getTag()
            r5 = r4
            com.tencent.mm.ui.chatting.gallery.m1 r5 = (com.tencent.p014mm.p136ui.chatting.gallery.C97087m1) r5
            r4 = r19
        L_0x0026:
            com.tencent.mm.ui.chatting.gallery.h$g r6 = m124949B(r2)
            r5.mo135971g(r1, r6, r2)
            r7 = 2
            java.lang.Object[] r8 = new java.lang.Object[r7]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r18)
            r10 = 0
            r8[r10] = r9
            r9 = 1
            r8[r9] = r6
            java.lang.String r11 = "MicroMsg.ImageGalleryAdapter"
            java.lang.String r12 = "position:%d, type: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r11, r12, r8)
            boolean r8 = m124952F(r2)
            if (r8 != 0) goto L_0x0051
            boolean r8 = m124953H(r2)
            if (r8 == 0) goto L_0x004f
            goto L_0x0051
        L_0x004f:
            r8 = 0
            goto L_0x0052
        L_0x0051:
            r8 = 1
        L_0x0052:
            if (r8 == 0) goto L_0x0068
            java.util.Map<com.tencent.mm.storage.f4, java.lang.Boolean> r8 = r0.f284728x
            java.util.HashMap r8 = (java.util.HashMap) r8
            boolean r8 = r8.containsKey(r2)
            if (r8 != 0) goto L_0x005f
            goto L_0x0068
        L_0x005f:
            java.lang.Boolean r8 = r0.mo135914A(r2)
            boolean r8 = r8.booleanValue()
            goto L_0x0069
        L_0x0068:
            r8 = 0
        L_0x0069:
            if (r8 == 0) goto L_0x0071
            r0.mo135931r(r5, r2, r1)
            r0.f284726v = r10
            return r4
        L_0x0071:
            int r6 = r6.ordinal()
            r8 = 3
            if (r6 == r9) goto L_0x0090
            if (r6 == r7) goto L_0x008a
            if (r6 == r8) goto L_0x0084
            r11 = 4
            if (r6 == r11) goto L_0x0080
            goto L_0x0095
        L_0x0080:
            r0.mo135930q(r5, r2, r1)
            goto L_0x0095
        L_0x0084:
            com.tencent.mm.ui.chatting.gallery.w r6 = r0.f284721q
            r6.mo135842g(r5, r2, r1)
            goto L_0x0095
        L_0x008a:
            com.tencent.mm.ui.chatting.gallery.g r6 = r0.f284720p
            r6.mo135842g(r5, r2, r1)
            goto L_0x0095
        L_0x0090:
            com.tencent.mm.ui.chatting.gallery.o r6 = r0.f284719o
            r6.mo135842g(r5, r2, r1)
        L_0x0095:
            r0.f284726v = r10
            if (r2 == 0) goto L_0x01bc
            int r6 = r2.getType()
            r11 = 1124073521(0x43000031, float:128.00075)
            if (r6 != r11) goto L_0x01bc
            ig.g r6 = com.tencent.p014mm.album.p836ui.c2c.gallery.C55068a.m62186B6(r2)
            r5.mo135966b(r2, r6)
            com.tencent.mm.album.ui.c2c.gallery.a r11 = r5.f284824G
            r11.getClass()
            androidx.recyclerview.widget.RecyclerView r12 = r11.mo85797d6()
            android.content.Context r12 = r12.getContext()
            r13 = 88
            int r12 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r12, r13)
            androidx.recyclerview.widget.RecyclerView r13 = r11.mo85797d6()
            android.content.Context r13 = r13.getContext()
            r14 = 90
            int r13 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r13, r14)
            com.tencent.mm.album.ui.c2c.gallery.a$a r14 = com.tencent.p014mm.album.p836ui.c2c.gallery.C55068a.f154624N
            int r15 = r14.mo76190b(r6)
            java.util.List<ig.d> r3 = r6.f289364h
            int r3 = r3.size()
            int r3 = r3 % r15
            if (r3 != 0) goto L_0x00e1
            java.util.List<ig.d> r3 = r6.f289364h
            int r3 = r3.size()
            int r3 = r3 / r15
            goto L_0x00e9
        L_0x00e1:
            java.util.List<ig.d> r3 = r6.f289364h
            int r3 = r3.size()
            int r3 = r3 / r15
            int r3 = r3 + r9
        L_0x00e9:
            int r9 = r14.mo76190b(r6)
            androidx.recyclerview.widget.RecyclerView r15 = r11.mo85797d6()
            android.content.Context r15 = r15.getContext()
            android.graphics.Point r15 = com.tencent.p014mm.p136ui.C85875k4.m106184h(r15)
            int r1 = r15.y
            int r15 = r15.x
            androidx.recyclerview.widget.RecyclerView r16 = r11.mo85797d6()
            android.content.Context r10 = r16.getContext()
            java.lang.String r7 = "recyclerView.context"
            gy3.C87412m.m108593f(r10, r7)
            if (r9 >= r8) goto L_0x0114
            r8 = 204(0xcc, float:2.86E-43)
            int r8 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r10, r8)
            goto L_0x011a
        L_0x0114:
            r8 = 136(0x88, float:1.9E-43)
            int r8 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r10, r8)
        L_0x011a:
            int r8 = r8 * r3
            int r1 = r1 - r8
            int r3 = r3 + -1
            androidx.recyclerview.widget.RecyclerView r8 = r11.mo85797d6()
            android.content.Context r8 = r8.getContext()
            gy3.C87412m.m108593f(r8, r7)
            r10 = 2
            int r8 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r8, r10)
            int r3 = r3 * r8
            int r1 = r1 - r3
            float r1 = (float) r1
            androidx.recyclerview.widget.RecyclerView r3 = r11.mo85797d6()
            android.content.Context r3 = r3.getContext()
            android.content.res.Resources r3 = r3.getResources()
            r8 = 2131165290(0x7f07006a, float:1.7944793E38)
            float r3 = r3.getDimension(r8)
            float r1 = r1 - r3
            int r1 = (int) r1
            r3 = 2
            int r1 = r1 / r3
            if (r1 >= r12) goto L_0x014d
            goto L_0x014e
        L_0x014d:
            r12 = r1
        L_0x014e:
            r11.f154628J = r12
            r11.f154629K = r13
            androidx.recyclerview.widget.RecyclerView r1 = r11.mo85797d6()
            android.content.Context r1 = r1.getContext()
            gy3.C87412m.m108593f(r1, r7)
            int r1 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r1, r3)
            int r3 = r9 + -1
            int r1 = r1 * r3
            int r15 = r15 - r1
            int r15 = r15 / r9
            r11.f154630L = r15
            androidx.recyclerview.widget.GridLayoutManager r1 = r11.f154631M
            if (r1 == 0) goto L_0x01b5
            r1.mo16940i0(r9)
            int r1 = r14.mo76190b(r6)
            java.util.ArrayList r1 = r14.mo76189a(r2, r6, r1)
            java.util.List r2 = r11.getData()
            r2.clear()
            java.util.List r2 = r11.getData()
            r2.addAll(r1)
            r11.notifyDataSetChanged()
            android.widget.FrameLayout r1 = r5.f284822E
            r2 = 0
            r5.mo135972h(r1, r2)
            com.tencent.mm.ui.base.MultiTouchImageView r1 = r5.f284820C
            r2 = 8
            r5.mo135972h(r1, r2)
            com.tencent.mm.ui.base.WxImageView r1 = r5.f284821D
            r5.mo135972h(r1, r2)
            android.widget.LinearLayout r1 = r5.f284854u
            r5.mo135972h(r1, r2)
            android.widget.LinearLayout r1 = r5.f284859z
            r5.mo135972h(r1, r2)
            android.widget.ProgressBar r1 = r5.f284858y
            r5.mo135972h(r1, r2)
            android.widget.RelativeLayout r1 = r5.f284845l
            r5.mo135972h(r1, r2)
            android.widget.RelativeLayout r1 = r5.f284838e
            r5.mo135972h(r1, r2)
            goto L_0x01c3
        L_0x01b5:
            java.lang.String r1 = "gridLM"
            gy3.C87412m.m108603p(r1)
            r1 = 0
            throw r1
        L_0x01bc:
            r2 = 8
            android.widget.FrameLayout r1 = r5.f284822E
            r5.mo135972h(r1, r2)
        L_0x01c3:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.gallery.C97056h.mo129060d(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    /* renamed from: G */
    public boolean mo135916G(C72963f4 f4Var, C92836k kVar) {
        if (f4Var == null || kVar == null) {
            return false;
        }
        return ((C92822e) ((C98201k) C86312j.m106911c(C98201k.class)).Jp0()).mo127105g(kVar.f267374a, f4Var.getMsgId(), 1);
    }

    /* renamed from: L */
    public void mo135917L(int i) {
        C98408n0 l;
        C97150w wVar = this.f284721q;
        C72963f4 y = wVar.f284638d.mo135937y(i);
        C97087m1 h = wVar.mo135877h(i);
        if (y != null && h != null && (l = wVar.mo136053l(y)) != null) {
            if (y.mo108769t2() == 0) {
                int i2 = l.f288562i;
                if (i2 == 113 || i2 == 111 || i2 == 112) {
                    wVar.mo136052k(l, h);
                    return;
                } else if (i2 == 198) {
                    wVar.mo136052k(l, h);
                    return;
                }
            }
            wVar.mo136055n(y, h);
        }
    }

    /* renamed from: M */
    public void mo135918M(C72963f4 f4Var, boolean z, int i) {
        Log.m105924i("MicroMsg.ImageGalleryAdapter", "setTranslateStatus() called with: msg = [" + f4Var.getMsgId() + "], translate = [" + z + "], position = [" + i + "]");
        if (m124952F(f4Var) || m124953H(f4Var)) {
            ((HashMap) this.f284728x).put(f4Var, Boolean.valueOf(z));
            C97067g gVar = null;
            if (m124952F(f4Var)) {
                gVar = C97067g.appimage;
            } else if (m124953H(f4Var)) {
                gVar = C97067g.image;
            }
            mo135934v().mo135971g(i, gVar, f4Var);
            if (z) {
                ((HashSet) f284711A).add(Long.valueOf(f4Var.getMsgId()));
                mo135931r(mo135934v(), f4Var, i);
                return;
            }
            ((HashSet) f284711A).remove(Long.valueOf(f4Var.getMsgId()));
            if (m124952F(f4Var)) {
                mo135930q(mo135934v(), f4Var, i);
            } else if (m124953H(f4Var)) {
                this.f284719o.mo135842g(mo135934v(), f4Var, i);
            }
        }
    }

    /* renamed from: N */
    public void mo135919N(C72963f4 f4Var, boolean z) {
        if (f4Var != null) {
            C72963f4 w = mo135935w();
            int i = 2;
            if (w == null || w.getMsgId() != f4Var.getMsgId()) {
                Log.m105919d("MicroMsg.ImageGalleryAdapter", "it is not curr msg[%d] handle nothing. arg msg[%d]", Long.valueOf(w.getMsgId()), Long.valueOf(f4Var.getMsgId()));
                return;
            }
            long y2 = f4Var.mo108774y2();
            C2CImgWaitingTimeStruct c2CImgWaitingTimeStruct = this.f284727w;
            if (!(c2CImgWaitingTimeStruct == null || (c2CImgWaitingTimeStruct.f265344f == y2 && c2CImgWaitingTimeStruct.f265346h == z))) {
                long nowMilliSecond = Util.nowMilliSecond();
                c2CImgWaitingTimeStruct.f265351m = nowMilliSecond;
                c2CImgWaitingTimeStruct.mo86048e("FinishDownloadTimeStampMs", nowMilliSecond);
                c2CImgWaitingTimeStruct.f265352n = C2CImgWaitingTimeStruct.C92612a.cancel;
                c2CImgWaitingTimeStruct.mo86054n();
            }
            C2CImgWaitingTimeStruct c2CImgWaitingTimeStruct2 = new C2CImgWaitingTimeStruct();
            this.f284727w = c2CImgWaitingTimeStruct2;
            long nowMilliSecond2 = Util.nowMilliSecond();
            c2CImgWaitingTimeStruct2.f265350l = nowMilliSecond2;
            c2CImgWaitingTimeStruct2.mo86048e("StartDownloadTimeStampMs", nowMilliSecond2);
            C2CImgWaitingTimeStruct c2CImgWaitingTimeStruct3 = this.f284727w;
            c2CImgWaitingTimeStruct3.f265344f = y2;
            c2CImgWaitingTimeStruct3.f265345g = f4Var.getCreateTime();
            c2CImgWaitingTimeStruct3.f265346h = z;
            if (C72996z1.m85820U5(this.f284724t)) {
                i = ((C53193b) C86312j.m106911c(C53193b.class)).mo73729p1(this.f284724t);
            }
            C2CImgWaitingTimeStruct c2CImgWaitingTimeStruct4 = this.f284727w;
            c2CImgWaitingTimeStruct4.f265342d = c2CImgWaitingTimeStruct4.mo86045b("ChatName", this.f284724t, true);
            c2CImgWaitingTimeStruct4.f265343e = (long) i;
        }
    }

    /* renamed from: O */
    public void mo135920O(C72963f4 f4Var, C92836k kVar, int i, C2CImgWaitingTimeStruct.C92612a aVar) {
        C2CImgWaitingTimeStruct c2CImgWaitingTimeStruct;
        long j;
        long j2;
        if (f4Var != null && (c2CImgWaitingTimeStruct = this.f284727w) != null) {
            long nowMilliSecond = Util.nowMilliSecond();
            c2CImgWaitingTimeStruct.f265351m = nowMilliSecond;
            c2CImgWaitingTimeStruct.mo86048e("FinishDownloadTimeStampMs", nowMilliSecond);
            c2CImgWaitingTimeStruct.f265352n = aVar;
            long y2 = f4Var.mo108774y2();
            boolean z = i == 1;
            C2CImgWaitingTimeStruct c2CImgWaitingTimeStruct2 = this.f284727w;
            long j3 = c2CImgWaitingTimeStruct2.f265344f;
            if (j3 == y2 || c2CImgWaitingTimeStruct2.f265346h == z) {
                long currentTicks = Util.currentTicks();
                long j4 = 0;
                if (aVar == C2CImgWaitingTimeStruct.C92612a.ok) {
                    String r = C97100o.m125012r(f4Var, kVar, false);
                    if (!Util.isNullOrNil(r)) {
                        j4 = C86013q1.m106451l(r);
                        this.f284719o.getClass();
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        Bitmap d = MMBitmapFactory.m98735d(r, options);
                        if (d != null) {
                            d.recycle();
                        }
                        j = (long) options.outWidth;
                        j2 = (long) options.outHeight;
                        C2CImgWaitingTimeStruct c2CImgWaitingTimeStruct3 = this.f284727w;
                        c2CImgWaitingTimeStruct3.f265347i = j4;
                        c2CImgWaitingTimeStruct3.f265349k = j2;
                        c2CImgWaitingTimeStruct3.f265348j = j;
                        c2CImgWaitingTimeStruct3.mo86054n();
                        Log.m105925i("MicroMsg.ImageGalleryAdapter", "stopWaitingImg [%d] [%s]", Long.valueOf(Util.ticksToNow(currentTicks)), this.f284727w.mo1005p());
                        this.f284727w = null;
                        return;
                    }
                }
                j2 = 0;
                j = 0;
                C2CImgWaitingTimeStruct c2CImgWaitingTimeStruct32 = this.f284727w;
                c2CImgWaitingTimeStruct32.f265347i = j4;
                c2CImgWaitingTimeStruct32.f265349k = j2;
                c2CImgWaitingTimeStruct32.f265348j = j;
                c2CImgWaitingTimeStruct32.mo86054n();
                Log.m105925i("MicroMsg.ImageGalleryAdapter", "stopWaitingImg [%d] [%s]", Long.valueOf(Util.ticksToNow(currentTicks)), this.f284727w.mo1005p());
                this.f284727w = null;
                return;
            }
            Log.m105929w("MicroMsg.ImageGalleryAdapter", "waiting img[%d] download finish but other img[%d] download finish callback don't report", Long.valueOf(j3), Long.valueOf(y2));
            C2CImgWaitingTimeStruct c2CImgWaitingTimeStruct4 = this.f284727w;
            c2CImgWaitingTimeStruct4.f265352n = C2CImgWaitingTimeStruct.C92612a.cancel;
            c2CImgWaitingTimeStruct4.mo86054n();
        }
    }

    /* renamed from: P */
    public void mo135921P(int i) {
        this.f284720p.mo135824A(mo135937y(i), i);
    }

    /* renamed from: Q */
    public void mo135922Q(int i, boolean z) {
        int i2 = i;
        C97100o oVar = this.f284719o;
        oVar.getClass();
        Class cls = C98201k.class;
        Log.m105924i("MicroMsg.ImageGalleryHolderImage", "viewHdImg, pos = " + i2);
        C72963f4 y = oVar.f284638d.mo135937y(i2);
        if (y == null || y.getMsgId() == 0) {
            Log.m105920e("MicroMsg.ImageGalleryHolderImage", "msg is null");
        } else if (!m124953H(y)) {
            Log.m105920e("MicroMsg.ImageGalleryHolderImage", "not img can't download hd");
        } else {
            C92836k q = oVar.mo135996q(y, true);
            if (q == null || q.f267374a == 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("viewHdImg fail, msgLocalId = ");
                sb.append(Long.valueOf(y.getMsgId()));
                sb.append(", imgLocalId = ");
                sb.append(q == null ? "null" : Long.valueOf(q.f267374a));
                Log.m105920e("MicroMsg.ImageGalleryHolderImage", sb.toString());
                return;
            }
            oVar.mo136003y(y, 3);
            if (oVar.mo135877h(i2) != null) {
                oVar.mo135991k(oVar.mo135877h(i2), y, q, true, false, i);
            }
            C97056h hVar = oVar.f284638d;
            if (hVar != null) {
                hVar.mo135919N(y, true);
            }
            if (z) {
                C97108o1 a = C97108o1.m125035a();
                a.getClass();
                Log.m105925i("MicroMsg.ImageHDDownloadAndSaveMgr", "[oreh download_and_save] startScene, msgLoacalID:%d", Long.valueOf(y.getMsgId()));
                a.f284914d.add(Long.valueOf(y.getMsgId()));
                ((C92822e) ((C98201k) C86312j.m106911c(cls)).Jp0()).mo127100b(q.f267374a, y.getMsgId(), 1, Integer.valueOf(i), C0966R.C0969drawable.by8, a, 0, false);
                return;
            }
            ((C76247e) C86312j.m106911c(C76247e.class)).mo106499Gn(y.getMsgId());
            ((C92822e) ((C98201k) C86312j.m106911c(cls)).Jp0()).mo127100b(q.f267374a, y.getMsgId(), 1, Integer.valueOf(i), C0966R.C0969drawable.by8, oVar, 0, false);
        }
    }

    /* renamed from: a */
    public boolean mo135923a() {
        return this.f284725u;
    }

    /* renamed from: b */
    public int mo135924b() {
        return C97063f.f284741p - this.f284715h.f284747f;
    }

    /* renamed from: c */
    public MultiTouchImageView mo129059c(int i, boolean z) {
        View e = mo139420e(i);
        if (e == null) {
            Log.m105921e("MicroMsg.ImageGalleryAdapter", "position : %s getMultiTouchImageViewByPosition is null", Integer.valueOf(i));
            return null;
        }
        View findViewById = e.findViewById(C0966R.C0970id.f39);
        if (findViewById == null || (z && findViewById.getVisibility() == 8)) {
            return null;
        }
        return (MultiTouchImageView) findViewById;
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
        super.destroyItem(viewGroup, i, obj);
    }

    /* renamed from: f */
    public WxImageView mo129061f(int i, boolean z) {
        View findViewById;
        View e = mo139420e(i);
        if (e == null || (findViewById = e.findViewById(C0966R.C0970id.f359612lu3)) == null || (z && findViewById.getVisibility() == 8)) {
            return null;
        }
        return (WxImageView) findViewById;
    }

    /* renamed from: g */
    public boolean mo135925g() {
        View e;
        RecyclerView recyclerView;
        if (!mo135935w().mo101016t3() || (e = mo139420e(this.f284714g.mo135768f8())) == null || (recyclerView = (RecyclerView) e.findViewById(C0966R.C0970id.e6k)) == null) {
            return false;
        }
        return !recyclerView.canScrollVertically(-1);
    }

    public int getCount() {
        return this.f284715h.mo135943c();
    }

    /* renamed from: h */
    public int mo135926h() {
        int i = C97063f.f284741p;
        C97063f fVar = this.f284715h;
        return ((i - fVar.f284747f) + fVar.f284744c) - 1;
    }

    /* renamed from: n */
    public void mo135927n(C72963f4 f4Var) {
        C72963f4 f4Var2 = f4Var;
        Class<MsgRetransmitUI> cls = MsgRetransmitUI.class;
        C92836k p = C97100o.m125011p(f4Var);
        if (f4Var2 == null || f4Var.getMsgId() == 0 || p == null || p.f267374a == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("doRestransmitMsg fail, msgLocalId = ");
            Object obj = "null";
            sb.append(f4Var2 == null ? obj : Long.valueOf(f4Var.getMsgId()));
            sb.append(", imgLocalId = ");
            if (p != null) {
                obj = Long.valueOf(p.f267374a);
            }
            sb.append(obj);
            Log.m105920e("MicroMsg.ImageGalleryAdapter", sb.toString());
        } else if (f4Var.mo101016t3()) {
            Log.m105924i("MicroMsg.ImageGalleryAdapter", "directly send user is empty, select one");
            Intent intent = new Intent(this.f284714g, cls);
            intent.putExtra("Retr_Msg_Id", f4Var.getMsgId());
            intent.putExtra("Retr_Msg_Type", 34);
            intent.putExtra("Multi_Retr", true);
            intent.putExtra("Retr_Msg_content", f4Var.getContent());
            intent.putExtra("Retr_go_to_chattingUI", false);
            intent.putExtra("Retr_show_success_tips", true);
            ImageGalleryUI imageGalleryUI = this.f284714g;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            ImageGalleryUI imageGalleryUI2 = imageGalleryUI;
            C117292a.m165358d(imageGalleryUI2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryAdapter", "doRestransmitAlbum", "(Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            imageGalleryUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(imageGalleryUI2, "com/tencent/mm/ui/chatting/gallery/ImageGalleryAdapter", "doRestransmitAlbum", "(Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else {
            String r = C97100o.m125012r(f4Var2, p, false);
            if (Util.isNullOrNil(r)) {
                Log.m105920e("MicroMsg.ImageGalleryAdapter", "doRestransmitMsg fail, bigImgPath is null, msgLocalId = " + f4Var.getMsgId() + ", imgLocalId = " + p.f267374a);
                return;
            }
            int t = mo135932t(f4Var2, p);
            long msgId = f4Var.getMsgId();
            String b = C1300x.m1391b(f4Var);
            if (Util.isNullOrNil(r)) {
                Log.m105920e("MicroMsg.ImageGalleryAdapter", "doRestransmitImg fail, imgPath is null");
            } else if (Util.isNullOrNil(this.f284716i)) {
                Log.m105924i("MicroMsg.ImageGalleryAdapter", "directly send user is empty, select one");
                Intent intent2 = new Intent(this.f284714g, cls);
                intent2.putExtra("Retr_File_Name", r);
                intent2.putExtra("Retr_Msg_Id", msgId);
                intent2.putExtra("Retr_Msg_Type", 0);
                intent2.putExtra("Retr_Compress_Type", t);
                intent2.putExtra("img_source_url", b);
                ImageGalleryUI imageGalleryUI3 = this.f284714g;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(intent2);
                ImageGalleryUI imageGalleryUI4 = imageGalleryUI3;
                C117292a.m165358d(imageGalleryUI4, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryAdapter", "doRestranmitImg", "(Ljava/lang/String;IJLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                imageGalleryUI3.startActivity((Intent) aVar2.mo10231a(0));
                C117292a.m165359e(imageGalleryUI4, "com/tencent/mm/ui/chatting/gallery/ImageGalleryAdapter", "doRestranmitImg", "(Ljava/lang/String;IJLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                ((C77032h) C86312j.m106911c(C77032h.class)).setScene(5);
            } else {
                Log.m105925i("MicroMsg.ImageGalleryAdapter", "directly send user %s", this.f284716i);
                if (!Util.isNullOrNil(r)) {
                    C100760a0.C100764f b2 = C100760a0.m131932b(C100760a0.C100763e.IMAGE);
                    b2.f295195i = 4;
                    b2.f295188b = C75592q0.m90789s();
                    b2.f295187a = this.f284716i;
                    b2.f295196j = r;
                    b2.f295197k = t;
                    b2.f295198l = null;
                    b2.f295194h = 6;
                    b2.mo140195a().mo123694a();
                    C116756s5.m164691d().mo180727a(C116756s5.f350054c, (Object[]) null);
                }
                if (this.f284717j) {
                    Intent intent3 = new Intent(this.f284714g, ChattingUI.class);
                    intent3.addFlags(67108864);
                    intent3.putExtra("Chat_User", this.f284716i);
                    ImageGalleryUI imageGalleryUI5 = this.f284714g;
                    C9556a aVar3 = new C9556a();
                    aVar3.mo10233c(intent3);
                    ImageGalleryUI imageGalleryUI6 = imageGalleryUI5;
                    C117292a.m165358d(imageGalleryUI6, aVar3.mo10232b(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryAdapter", "doRestranmitImg", "(Ljava/lang/String;IJLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    imageGalleryUI5.startActivity((Intent) aVar3.mo10231a(0));
                    C117292a.m165359e(imageGalleryUI6, "com/tencent/mm/ui/chatting/gallery/ImageGalleryAdapter", "doRestranmitImg", "(Ljava/lang/String;IJLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } else {
                    ImageGalleryUI imageGalleryUI7 = this.f284714g;
                    C76879j.m92726T(imageGalleryUI7, imageGalleryUI7.getString(C0966R.string.a2o));
                }
                C115669n.INSTANCE.mo160131h(10424, 3, 4, this.f284716i);
            }
        }
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
    }

    /* renamed from: o */
    public void mo135928o(int i) {
        C72963f4 y = mo135937y(i);
        int ordinal = m124949B(y).ordinal();
        if (ordinal == 2 || ordinal == 3) {
            mo135929p(y);
        } else if (ordinal != 4) {
            mo135927n(y);
        } else {
            String s = m124960s(y);
            Intent intent = new Intent(this.f284714g, MsgRetransmitUI.class);
            intent.putExtra("Retr_File_Name", s);
            intent.putExtra("Retr_Msg_Id", y.getMsgId());
            intent.putExtra("Retr_Msg_Type", 16);
            intent.putExtra("Retr_Msg_content", y.getContent());
            intent.putExtra("Retr_Compress_Type", 0);
            ImageGalleryUI imageGalleryUI = this.f284714g;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            ImageGalleryUI imageGalleryUI2 = imageGalleryUI;
            C117292a.m165358d(imageGalleryUI2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryAdapter", "doRestransmitAppImg", "(Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            imageGalleryUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(imageGalleryUI2, "com/tencent/mm/ui/chatting/gallery/ImageGalleryAdapter", "doRestransmitAppImg", "(Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            ((C77032h) C86312j.m106911c(C77032h.class)).setScene(5);
        }
    }

    /* renamed from: p */
    public void mo135929p(C72963f4 f4Var) {
        if (!C97625j3.m125812b().mo105883I()) {
            C76912y0.m92771j(this.f284714g, (View) null);
        } else if (f4Var.mo100983V3()) {
            C48300n n = C97052g.m124926n(f4Var);
            if (n == null) {
                Log.m105920e("MicroMsg.ImageGalleryAdapter", "doRestransmitVideo mpShareVideoInfo should not be null");
                return;
            }
            ImageGalleryUI imageGalleryUI = this.f284714g;
            if (imageGalleryUI.f284438i == null) {
                imageGalleryUI.f284438i = new C44085t();
            }
            imageGalleryUI.f284438i.f119434a = n;
            boolean z = this.f284723s;
            n.f129348y = imageGalleryUI.f284478w.f284965m;
            C44080p.f119428a.mo68714b(imageGalleryUI, n.f133370h, "", n.f133369g, n.f133374o, z ? 1 : 0);
        } else {
            C98408n0 Zd = ((C101491u) C86312j.m106911c(C101491u.class)).mo140806Zd(f4Var.mo108765s2());
            if (Zd == null) {
                Log.m105920e("MicroMsg.ImageGalleryAdapter", "videoInfo should not be null");
                return;
            }
            Intent intent = new Intent(this.f284714g, MsgRetransmitUI.class);
            intent.putExtra("Retr_length", Zd.f288566m);
            intent.putExtra("Retr_File_Name", f4Var.mo108765s2());
            intent.putExtra("Retr_video_isexport", Zd.f288572s);
            intent.putExtra("Retr_Msg_Type", m124954I(f4Var) ? 11 : 1);
            intent.putExtra("Retr_Msg_Id", f4Var.getMsgId());
            intent.putExtra("Retr_From", "gallery");
            ImageGalleryUI imageGalleryUI2 = this.f284714g;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            ImageGalleryUI imageGalleryUI3 = imageGalleryUI2;
            C117292a.m165358d(imageGalleryUI3, aVar.mo10232b(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryAdapter", "doRestransmitVideo", "(Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            imageGalleryUI2.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(imageGalleryUI3, "com/tencent/mm/ui/chatting/gallery/ImageGalleryAdapter", "doRestransmitVideo", "(Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            ((C77032h) C86312j.m106911c(C77032h.class)).setScene(5);
        }
    }

    /* renamed from: q */
    public final void mo135930q(C97087m1 m1Var, C72963f4 f4Var, int i) {
        Bitmap bitmap;
        Class cls = C102720b.class;
        m1Var.mo135972h(m1Var.f284820C, 0);
        m1Var.mo135972h(m1Var.f284854u, 8);
        m1Var.mo135972h(m1Var.f284858y, 8);
        m1Var.mo135972h(m1Var.f284859z, 8);
        m1Var.mo135972h(m1Var.f284850q, 8);
        String s = m124960s(f4Var);
        try {
            Vector<WeakReference<C102720b.C78973a>> vector = C101594c0.f297416a;
            C101594c0.C101596b bVar = C101594c0.C101596b.INSTANCE;
            if (Util.isNullOrNil(s)) {
                Log.m105928w("MicroMsg.MMPictureLogic", "error input, path is null");
                bitmap = null;
            } else {
                bitmap = BitmapUtil.getBitmapNative(s, 0, 0);
            }
        } catch (OutOfMemoryError unused) {
            Log.m105929w("MicroMsg.ImageGalleryAdapter", "[tomys] Oops, app img [%s] is too large, use resample version.", s);
            Runtime.getRuntime().gc();
            Runtime.getRuntime().runFinalization();
            bitmap = ((C102720b) C86312j.m106911c(cls)).mo142105Ou(s);
        }
        if (bitmap == null) {
            bitmap = ((C102720b) C86312j.m106911c(cls)).mo142105Ou(((C92839m) ((C98201k) C86312j.m106911c(C98201k.class)).mo137277xi()).v10(f4Var.mo108765s2(), true));
            m1Var.mo135972h(m1Var.f284858y, 0);
            new MMHandler().post(new C97061e(this, f4Var, m1Var, s));
        }
        if (bitmap == null) {
            Log.m105928w("MicroMsg.ImageGalleryAdapter", "get image fail");
            m1Var.f284820C.setVisibility(8);
            m1Var.mo135968d();
            m1Var.f284859z.setVisibility(0);
            m1Var.mo135968d();
            m1Var.f284819B.setImageResource(C0966R.raw.image_download_fail_icon);
            m1Var.mo135968d();
            m1Var.f284818A.setText(this.f284714g.getString(C0966R.string.fqr));
            return;
        }
        m1Var.f284820C.setEnableHorLongBmpMode(false);
        ForceGpuUtil.decideLayerType(m1Var.f284820C, bitmap.getWidth(), bitmap.getHeight());
        MultiTouchImageView multiTouchImageView = m1Var.f284820C;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        multiTouchImageView.f348280o = width;
        multiTouchImageView.f348281p = height;
        m1Var.f284820C.setImageBitmap(bitmap);
        m1Var.f284820C.invalidate();
    }

    /* renamed from: r */
    public void mo135931r(C97087m1 m1Var, C72963f4 f4Var, int i) {
        String str;
        if (m124952F(f4Var)) {
            str = m124960s(f4Var);
        } else if (m124953H(f4Var)) {
            C97100o oVar = this.f284719o;
            str = oVar.mo135997s(f4Var, oVar.mo135996q(f4Var, false), false);
        } else {
            return;
        }
        C38543c8 Gb0 = ((C94466j) C86312j.m106911c(C94466j.class)).Gb0(str);
        String str2 = Gb0 != null ? Gb0.field_resultFile : null;
        m1Var.mo135972h(m1Var.f284820C, 0);
        m1Var.mo135972h(m1Var.f284854u, 8);
        m1Var.mo135972h(m1Var.f284858y, 8);
        m1Var.mo135972h(m1Var.f284859z, 8);
        m1Var.mo135972h(m1Var.f284850q, 8);
        Bitmap Ou = ((C102720b) C86312j.m106911c(C102720b.class)).mo142105Ou(str2);
        if (Ou == null) {
            Log.m105928w("MicroMsg.ImageGalleryAdapter", "get image fail");
            m1Var.f284820C.setImageResource(C0966R.raw.download_image_icon);
            return;
        }
        m1Var.f284820C.setEnableHorLongBmpMode(false);
        MultiTouchImageView multiTouchImageView = m1Var.f284820C;
        int width = Ou.getWidth();
        int height = Ou.getHeight();
        multiTouchImageView.f348280o = width;
        multiTouchImageView.f348281p = height;
        m1Var.f284820C.setImageBitmap(Ou);
        m1Var.f284820C.invalidate();
    }

    /* renamed from: t */
    public int mo135932t(C72963f4 f4Var, C92836k kVar) {
        C92836k jD;
        C92836k jD2;
        Class cls = C98201k.class;
        Class cls2 = C76053l.class;
        if (f4Var.mo108769t2() == 1) {
            if (kVar.mo127145p() && (jD2 = ((C76053l) C86312j.m106911c(cls2)).mo106261jD(kVar)) != null && jD2.f267374a > 0 && jD2.mo127146q()) {
                if (C86013q1.m106450k(((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127174TY(jD2.f267378e, "", "", true))) {
                    return 1;
                }
            }
            return 0;
        }
        if (kVar.mo127146q() && kVar.mo127145p() && (jD = ((C76053l) C86312j.m106911c(cls2)).mo106261jD(kVar)) != null && jD.f267374a > 0 && jD.mo127146q()) {
            if (C86013q1.m106450k(((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127174TY(jD.f267378e, "", "", true))) {
                return 1;
            }
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c2, code lost:
        if (r1.field_isUpload == false) goto L_0x00c5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.tencent.p014mm.p136ui.chatting.gallery.C97149u1 mo135933u() {
        /*
            r15 = this;
            com.tencent.mm.ui.chatting.gallery.u1 r0 = com.tencent.p014mm.p136ui.chatting.gallery.C97149u1.NOT_DOWNLOADED
            com.tencent.mm.ui.chatting.gallery.u1 r1 = com.tencent.p014mm.p136ui.chatting.gallery.C97149u1.EXPIRED
            com.tencent.mm.ui.chatting.gallery.u1 r2 = com.tencent.p014mm.p136ui.chatting.gallery.C97149u1.DOWNLOADED
            com.tencent.mm.storage.f4 r3 = r15.mo135935w()
            java.lang.String r4 = "MicroMsg.ImageGalleryAdapter"
            java.lang.String r5 = "getCurResourceState, msgInfo is null"
            r6 = 0
            if (r3 != 0) goto L_0x0015
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r5)
            return r6
        L_0x0015:
            com.tencent.mm.ui.chatting.gallery.h$g r7 = m124949B(r3)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "getCurResourceState, type: "
            r8.append(r9)
            r8.append(r7)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r8)
            int r4 = r7.ordinal()
            r7 = 4
            r8 = 1
            if (r4 == r8) goto L_0x0145
            r9 = 2
            java.lang.String r10 = "getCurResourceState, downloaded"
            java.lang.String r11 = "getCurResourceState, not downloaded"
            r12 = 198(0xc6, float:2.77E-43)
            java.lang.String r13 = "getCurResourceState, videoInfo is null or failed"
            java.lang.String r14 = "getCurResourceState, msgInfo is cleaned"
            if (r4 == r9) goto L_0x0105
            r9 = 3
            if (r4 == r9) goto L_0x00ca
            if (r4 == r7) goto L_0x0048
            return r6
        L_0x0048:
            boolean r4 = r3.mo100972K3()
            if (r4 == 0) goto L_0x0051
            r0 = r1
            goto L_0x00c9
        L_0x0051:
            java.lang.String r1 = r3.getContent()
            com.tencent.mm.message.l$b r1 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r1, r6)
            if (r1 != 0) goto L_0x005e
        L_0x005b:
            r0 = r6
            goto L_0x00c9
        L_0x005e:
            java.lang.String r4 = r1.f195606o
            if (r4 == 0) goto L_0x005b
            int r4 = r4.length()
            if (r4 <= 0) goto L_0x005b
            com.tencent.mm.pluginsdk.model.app.e r4 = com.tencent.p014mm.pluginsdk.model.app.C72709y1.vx0()
            java.lang.String r1 = r1.f195606o
            com.tencent.mm.pluginsdk.model.app.d r1 = r4.mo100154qq(r1)
            r4 = 0
            if (r1 == 0) goto L_0x00c5
            java.lang.String r5 = r1.field_fileFullPath
            android.net.Uri r5 = com.tencent.p014mm.vfs.C116299g2.m163858n(r5)
            java.lang.String r7 = r5.getPath()
            if (r7 == 0) goto L_0x009b
            java.lang.String r7 = com.tencent.p014mm.vfs.C116299g2.m163855k(r7, r4, r4)
            java.lang.String r9 = r5.getPath()
            boolean r9 = r9.equals(r7)
            if (r9 != 0) goto L_0x009b
            android.net.Uri$Builder r5 = r5.buildUpon()
            android.net.Uri$Builder r5 = r5.path(r7)
            android.net.Uri r5 = r5.build()
        L_0x009b:
            com.tencent.mm.vfs.f0 r7 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            com.tencent.mm.vfs.f0$h r5 = r7.mo177799l(r5, r6)
            boolean r6 = r5.mo177810a()
            if (r6 != 0) goto L_0x00a9
            r5 = 0
            goto L_0x00b1
        L_0x00a9:
            com.tencent.mm.vfs.FileSystem$c r6 = r5.f348991a
            java.lang.String r5 = r5.f348992b
            boolean r5 = r6.mo119948x(r5)
        L_0x00b1:
            if (r5 != 0) goto L_0x00b4
            goto L_0x00c5
        L_0x00b4:
            boolean r5 = r1.mo100146l2()
            if (r5 != 0) goto L_0x00c6
            int r3 = r3.mo108769t2()
            if (r3 != r8) goto L_0x00c5
            boolean r1 = r1.field_isUpload
            if (r1 == 0) goto L_0x00c5
            goto L_0x00c6
        L_0x00c5:
            r8 = 0
        L_0x00c6:
            if (r8 == 0) goto L_0x00c9
            r0 = r2
        L_0x00c9:
            return r0
        L_0x00ca:
            com.tencent.mm.ui.chatting.gallery.w r3 = r15.f284721q
            com.tencent.mm.ui.chatting.gallery.h r4 = r3.f284638d
            com.tencent.mm.storage.f4 r4 = r4.mo135935w()
            java.lang.String r7 = "MicroMsg.ImageGallerySightHandler"
            if (r4 != 0) goto L_0x00db
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r5)
            r0 = r6
            goto L_0x0104
        L_0x00db:
            boolean r5 = r4.mo100972K3()
            if (r5 == 0) goto L_0x00e6
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r14)
        L_0x00e4:
            r0 = r1
            goto L_0x0104
        L_0x00e6:
            hd0.n0 r3 = r3.mo136053l(r4)
            if (r3 == 0) goto L_0x0100
            int r4 = r3.f288562i
            if (r4 != r12) goto L_0x00f1
            goto L_0x0100
        L_0x00f1:
            boolean r1 = r3.mo137710n()
            if (r1 == 0) goto L_0x00fc
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r10)
            r0 = r2
            goto L_0x0104
        L_0x00fc:
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r11)
            goto L_0x0104
        L_0x0100:
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r13)
            goto L_0x00e4
        L_0x0104:
            return r0
        L_0x0105:
            com.tencent.mm.ui.chatting.gallery.g r3 = r15.f284720p
            com.tencent.mm.ui.chatting.gallery.h r3 = r3.f284638d
            com.tencent.mm.storage.f4 r3 = r3.mo135935w()
            java.lang.String r4 = "MicroMsg.Imagegallery.handler.video"
            if (r3 != 0) goto L_0x0116
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            r0 = r6
            goto L_0x0144
        L_0x0116:
            boolean r5 = r3.mo100983V3()
            if (r5 != 0) goto L_0x0126
            boolean r5 = r3.mo100972K3()
            if (r5 == 0) goto L_0x0126
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r14)
            goto L_0x0143
        L_0x0126:
            hd0.n0 r3 = com.tencent.p014mm.p136ui.chatting.gallery.C97052g.m124927o(r3)
            if (r3 == 0) goto L_0x0140
            int r5 = r3.f288562i
            if (r5 != r12) goto L_0x0131
            goto L_0x0140
        L_0x0131:
            boolean r1 = r3.mo137710n()
            if (r1 == 0) goto L_0x013c
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r10)
            r0 = r2
            goto L_0x0144
        L_0x013c:
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r11)
            goto L_0x0144
        L_0x0140:
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r13)
        L_0x0143:
            r0 = r1
        L_0x0144:
            return r0
        L_0x0145:
            com.tencent.mm.ui.chatting.gallery.o r3 = r15.f284719o
            com.tencent.mm.ui.chatting.gallery.h r4 = r3.f284638d
            com.tencent.mm.storage.f4 r4 = r4.mo135935w()
            java.lang.String r8 = "MicroMsg.ImageGalleryHolderImage"
            if (r4 != 0) goto L_0x0156
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r5)
            r0 = r6
            goto L_0x017a
        L_0x0156:
            int r3 = r3.mo136004z(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "getCurResourceState, msgState: "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r4)
            if (r3 == r7) goto L_0x0179
            r2 = 5
            if (r3 == r2) goto L_0x0177
            r2 = 6
            if (r3 == r2) goto L_0x0177
            goto L_0x017a
        L_0x0177:
            r0 = r1
            goto L_0x017a
        L_0x0179:
            r0 = r2
        L_0x017a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.gallery.C97056h.mo135933u():com.tencent.mm.ui.chatting.gallery.u1");
    }

    /* renamed from: v */
    public C97087m1 mo135934v() {
        C97087m1 h = this.f284719o.mo135877h(this.f284714g.mo135768f8());
        if (h == null) {
            h = this.f284720p.mo135877h(this.f284714g.mo135768f8());
        }
        return h == null ? this.f284721q.mo135877h(this.f284714g.mo135768f8()) : h;
    }

    /* renamed from: w */
    public C72963f4 mo135935w() {
        return mo135937y(this.f284714g.mo135768f8());
    }

    /* renamed from: x */
    public C92836k mo135936x(C72963f4 f4Var, boolean z) {
        return this.f284719o.mo135996q(f4Var, z);
    }

    /* renamed from: y */
    public C72963f4 mo135937y(int i) {
        return this.f284715h.mo135942b(i);
    }

    /* renamed from: z */
    public View mo135938z(int i) {
        View e = mo139420e(i);
        if (e == null) {
            Log.m105921e("MicroMsg.ImageGalleryAdapter", "position : %s getTPVideoViewByPosition is null", Integer.valueOf(i));
            return null;
        }
        View findViewById = e.findViewById(C0966R.C0970id.opi);
        if (findViewById == null || findViewById.getVisibility() == 8) {
            return null;
        }
        return findViewById;
    }
}
