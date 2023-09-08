package hd0;

import a11.C39478b;
import com.tencent.p014mm.autogen.mmdata.rpt.PreloadVideoInfoStruct;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pointers.PBool;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.p014mm.vfs.C86009m1;
import di3.C86312j;
import eb0.C75604z3;
import eb0.z3$$h;
import f40.C86709a0;
import h81.C32735h;
import hd0.C98411p;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import lc3.C10485b;
import p556hw.C98548d;
import u13.C101938c;
import xb0.C38471b;
import zt3.C119157j;

/* renamed from: hd0.x */
public class C98438x implements C98411p.C98414c {

    /* renamed from: a */
    public LinkedList<C72963f4> f288719a;

    /* renamed from: b */
    public long f288720b;

    /* renamed from: c */
    public int f288721c;

    /* renamed from: d */
    public int f288722d;

    /* renamed from: e */
    public boolean f288723e;

    /* renamed from: f */
    public boolean f288724f;

    /* renamed from: g */
    public boolean f288725g;

    /* renamed from: h */
    public boolean f288726h;

    /* renamed from: i */
    public C98441c f288727i;

    /* renamed from: j */
    public C98411p f288728j;

    /* renamed from: k */
    public long f288729k;

    /* renamed from: hd0.x$a */
    public class C98439a implements Runnable {
        public C98439a() {
        }

        public void run() {
            C98411p pVar = C98438x.this.f288728j;
            if (pVar != null) {
                pVar.mo137738e();
            }
            C98438x.this.f288728j = null;
        }
    }

    /* renamed from: hd0.x$b */
    public class C98440b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C98411p f288731d;

        public C98440b(C98411p pVar) {
            this.f288731d = pVar;
        }

        public void run() {
            long j = this.f288731d.f288594b;
            synchronized (C98438x.this.f288719a) {
                Iterator<C72963f4> it = C98438x.this.f288719a.iterator();
                while (it.hasNext()) {
                    C72963f4 next = it.next();
                    if (next != null && next.getMsgId() == j) {
                        Log.m105925i("MicroMsg.PreloadVideoService", "%d find msg[%d], remove now", Integer.valueOf(C98438x.this.hashCode()), Long.valueOf(j));
                        it.remove();
                    }
                }
            }
            C98438x.this.mo137774e(true);
            C98438x xVar = C98438x.this;
            C98411p pVar = xVar.f288728j;
            if (pVar != null) {
                pVar.f288609q = null;
            }
            xVar.f288728j = null;
            C98438x.m127860b(xVar, 111, 1);
            C98438x xVar2 = C98438x.this;
            xVar2.getClass();
            ((C119157j) C119157j.f356862d).mo183875f(new C98444y(xVar2));
        }
    }

    /* renamed from: hd0.x$c */
    public static class C98441c implements C98548d.C98549a {

        /* renamed from: a */
        public final WeakReference<C98438x> f288733a;

        public C98441c(C98438x xVar) {
            this.f288733a = new WeakReference<>(xVar);
        }
    }

    public C98438x() {
        this.f288719a = new LinkedList<>();
        this.f288720b = 0;
        this.f288721c = 0;
        this.f288722d = 0;
        this.f288723e = false;
        this.f288724f = false;
        this.f288725g = false;
        this.f288726h = false;
        this.f288727i = null;
        this.f288728j = null;
        this.f288729k = 0;
        this.f288727i = new C98441c(this);
        ((C98548d) C86312j.m106911c(C98548d.class)).mo137918AM(this.f288727i);
    }

    /* renamed from: b */
    public static boolean m127860b(C98438x xVar, int i, int i2) {
        int i3 = i;
        xVar.getClass();
        long currentTicks = Util.currentTicks();
        char c = 1;
        char c2 = 0;
        boolean z = i3 == 111;
        long nowSecond = Util.nowSecond() - (((long) ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("PreLoadVideoExpiredTime", 1)) * 86400);
        int i4 = 5;
        Log.m105925i("MicroMsg.PreloadVideoService", "%d start to delete expired file limit[%d] status[%d] expiredTime[%d] isC2C[%b]", Integer.valueOf(xVar.hashCode()), Integer.valueOf(i2), Integer.valueOf(i), Long.valueOf(nowSecond), Boolean.valueOf(z));
        List<C98408n0> j = C98398h0.Bx0().mo137724j(i3, i2, nowSecond);
        if (j.isEmpty()) {
            return false;
        }
        int i5 = 0;
        for (C98408n0 next : j) {
            if (next != null) {
                String q = C98398h0.Bx0().mo137728q(next.mo137700d());
                if (!Util.isNullOrNil(q)) {
                    C86009m1 m1Var = new C86009m1(q);
                    if (m1Var.mo119967g()) {
                        long r = m1Var.mo119980r();
                        Object[] objArr = new Object[i4];
                        objArr[c2] = next.mo137700d();
                        objArr[c] = Long.valueOf(r);
                        objArr[2] = Integer.valueOf(next.f288539G);
                        objArr[3] = Long.valueOf(next.f288564k);
                        objArr[4] = q;
                        Log.m105925i("MicroMsg.PreloadVideoService", "%s file[%d %d] lastmodifytime[%d] path[%s]", objArr);
                        if (r > 0 && r <= ((long) next.f288539G)) {
                            m1Var.mo119966f();
                            i5++;
                        }
                    }
                }
                next.f288539G = 0;
                next.f288548P = 1;
                C98429r0.m127808N(next);
                c = 1;
                c2 = 0;
                i4 = 5;
            }
        }
        if (z) {
            C115669n.INSTANCE.idkeyStat(354, 144, (long) i5, false);
        } else {
            C115669n.INSTANCE.idkeyStat(354, 145, (long) i5, false);
        }
        Log.m105925i("MicroMsg.PreloadVideoService", "%d delete expire file size %d delete count %d costTime[%d]", Integer.valueOf(xVar.hashCode()), Integer.valueOf(((LinkedList) j).size()), Integer.valueOf(i5), Long.valueOf(Util.ticksToNow(currentTicks)));
        return false;
    }

    /* renamed from: c */
    public static boolean m127861c(C98438x xVar, C72963f4 f4Var, PBool pBool) {
        int i;
        C98438x xVar2 = xVar;
        C72963f4 f4Var2 = f4Var;
        PBool pBool2 = pBool;
        xVar.getClass();
        if (f4Var2 == null) {
            pBool2.value = true;
            return false;
        }
        C98408n0 i2 = C98429r0.m127818i(f4Var.mo108765s2());
        int i3 = 2;
        if (i2 != null && i2.mo137710n()) {
            Log.m105925i("MicroMsg.PreloadVideoService", "%d it finish download all file[%s], needn't preload", Integer.valueOf(xVar.hashCode()), i2.mo137700d());
            Map<String, String> parseXml = XmlParser.parseXml(i2.mo137705i(), "msg", (String) null);
            String str = parseXml.get(".msg.videomsg.$newmd5");
            String str2 = parseXml.get(".msg.videomsg.$cdnvideourl");
            boolean U5 = C72996z1.m85820U5(i2.mo137707k());
            if (!U5) {
                i3 = 1;
            }
            xVar.mo137775f(str, i3, (long) i2.f288559f, i2.mo137701e(), i2.mo137707k(), C72996z1.m85820U5(i2.mo137707k()) ? ((C39478b) C86312j.m106911c(C39478b.class)).mo62080p1(i2.mo137707k()) : 0, str2, "", "");
            C115669n nVar = C115669n.INSTANCE;
            nVar.idkeyStat(354, 146, 1, false);
            if (U5) {
                nVar.idkeyStat(354, 126, 1, false);
            } else {
                nVar.idkeyStat(354, 125, 1, false);
            }
            pBool2.value = true;
            return false;
        } else if (xVar2.mo137777h(f4Var.mo108768t())) {
            Log.m105925i("MicroMsg.PreloadVideoService", "%d use new preload strategy", Integer.valueOf(xVar.hashCode()));
            pBool2.value = true;
            return false;
        } else if (Util.milliSecondsToNow(f4Var.getCreateTime()) >= 86400000) {
            Log.m105925i("MicroMsg.PreloadVideoService", "%d more than 1 day don't preload", Integer.valueOf(xVar.hashCode()));
            pBool2.value = true;
            return false;
        } else if (xVar2.mo137773d(true)) {
            Log.m105925i("MicroMsg.PreloadVideoService", "%d check c2c video preload timestamp[%d]", Integer.valueOf(xVar.hashCode()), Long.valueOf(xVar2.f288720b));
            pBool2.value = false;
            return false;
        } else {
            Log.m105925i("MicroMsg.PreloadVideoService", "%d check c2c video preload %d %s", Integer.valueOf(xVar.hashCode()), Long.valueOf(f4Var.getMsgId()), f4Var2.f230724G);
            z3$$h w = C75604z3.m90851w(f4Var2.f230724G);
            if (w == null) {
                pBool2.value = true;
                return false;
            }
            if (xVar2.mo137777h(f4Var.mo108768t())) {
                i = 1;
            } else if (w.f222114u <= 0) {
                pBool2.value = true;
                return false;
            } else if (C38471b.m41885a(w.f222116w)) {
                pBool2.value = false;
                return false;
            } else if (NetStatusUtil.isWifi(MMApplicationContext.getContext())) {
                i = w.f222115v & 1;
            } else if (NetStatusUtil.is4G(MMApplicationContext.getContext())) {
                i = w.f222115v & 2;
            } else if (NetStatusUtil.is3G(MMApplicationContext.getContext())) {
                i = w.f222115v & 4;
            } else {
                pBool2.value = false;
                return false;
            }
            if (i > 0) {
                pBool2.value = false;
                return true;
            }
            pBool2.value = false;
            return false;
        }
    }

    /* renamed from: a */
    public void mo131025a(C98411p pVar, boolean z, int i, int i2) {
        if (pVar == null) {
            Log.m105921e("MicroMsg.PreloadVideoService", "%d on preload finish but scene is null?", Integer.valueOf(hashCode()));
            return;
        }
        if (this.f288728j != pVar) {
            Log.m105929w("MicroMsg.PreloadVideoService", "%d on preload finish, but scene callback not same object.", Integer.valueOf(hashCode()));
        }
        Log.m105925i("MicroMsg.PreloadVideoService", "%d preload video[%s] finish success[%b] range[%d, %d]", Integer.valueOf(hashCode()), pVar.mo137736c(), Boolean.valueOf(z), Integer.valueOf(i), Integer.valueOf(i2));
        ((C119157j) C119157j.f356862d).mo183875f(new C98440b(pVar));
    }

    /* renamed from: d */
    public boolean mo137773d(boolean z) {
        int i;
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_SNS_HAD_PRELOAD_COUNT_INT;
        C72994y1.C72995a aVar2 = C72994y1.C72995a.USERINFO_C2C_HAD_PRELOAD_COUNT_INT;
        C85801v1 i2 = C86709a0.m107535s().mo121142i();
        C72994y1.C72995a aVar3 = C72994y1.C72995a.USERINFO_HAD_PRELOAD_TIME_LONG;
        long longValue = ((Long) i2.mo119685f(aVar3, -1L)).longValue();
        this.f288720b = longValue;
        if (Util.milliSecondsToNow(longValue) >= 86400000) {
            this.f288720b = Util.nowMilliSecond();
            C86709a0.m107535s().mo121142i().mo119677K(aVar3, Long.valueOf(this.f288720b));
            C86709a0.m107535s().mo121142i().mo119677K(aVar2, 0);
            C86709a0.m107535s().mo121142i().mo119677K(aVar, 0);
            this.f288726h = false;
            this.f288725g = false;
        }
        this.f288721c = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(aVar2, 0)).intValue();
        int intValue = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(aVar, 0)).intValue();
        this.f288722d = intValue;
        int i3 = 1000;
        if (z) {
            intValue = this.f288721c;
            i = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("C2CMaxPreloadVideo", 100);
        } else {
            i = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_timeline_max_preload, 1000);
        }
        if (i > 0) {
            i3 = i;
        }
        boolean z2 = intValue >= i3;
        Log.m105925i("MicroMsg.PreloadVideoService", "%d check more preload count result[%b] config[%d] hadPreloadCount[%d %d %d] ", Integer.valueOf(hashCode()), Boolean.valueOf(z2), Integer.valueOf(i3), Integer.valueOf(intValue), Integer.valueOf(this.f288721c), Integer.valueOf(this.f288722d));
        if (z2) {
            if (z) {
                if (!this.f288725g) {
                    this.f288725g = true;
                    C115669n.INSTANCE.idkeyStat(354, 127, 1, false);
                }
            } else if (!this.f288726h) {
                this.f288726h = true;
                C115669n.INSTANCE.idkeyStat(354, 128, 1, false);
            }
        }
        return z2;
    }

    /* renamed from: e */
    public void mo137774e(boolean z) {
        if (z) {
            C85801v1 i = C86709a0.m107535s().mo121142i();
            C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_C2C_HAD_PRELOAD_COUNT_INT;
            this.f288721c = ((Integer) i.mo119685f(aVar, 0)).intValue() + 1;
            C86709a0.m107535s().mo121142i().mo119677K(aVar, Integer.valueOf(this.f288721c));
            return;
        }
        C85801v1 i2 = C86709a0.m107535s().mo121142i();
        C72994y1.C72995a aVar2 = C72994y1.C72995a.USERINFO_SNS_HAD_PRELOAD_COUNT_INT;
        this.f288722d = ((Integer) i2.mo119685f(aVar2, 0)).intValue() + 1;
        C86709a0.m107535s().mo121142i().mo119677K(aVar2, Integer.valueOf(this.f288722d));
    }

    /* renamed from: f */
    public void mo137775f(String str, int i, long j, String str2, String str3, int i2, String str4, String str5, String str6) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(Util.nowSecond());
        stringBuffer.append(",");
        stringBuffer.append(Util.nowSecond());
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(str);
        stringBuffer.append(",");
        stringBuffer.append(i);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(j);
        stringBuffer.append(",");
        stringBuffer.append("");
        stringBuffer.append(",");
        stringBuffer.append(str2);
        stringBuffer.append(",");
        stringBuffer.append(str3);
        stringBuffer.append(",");
        stringBuffer.append(i2);
        stringBuffer.append(",");
        stringBuffer.append(str4);
        stringBuffer.append(",");
        stringBuffer.append(str5);
        stringBuffer.append(",");
        stringBuffer.append(C101938c.m134167a(str6));
        String stringBuffer2 = stringBuffer.toString();
        Log.m105919d("MicroMsg.PreloadVideoService", "%d rpt content[%s]", Integer.valueOf(hashCode()), stringBuffer2);
        new PreloadVideoInfoStruct(stringBuffer2).mo86054n();
    }

    /* renamed from: g */
    public void mo137776g() {
        Log.m105925i("MicroMsg.PreloadVideoService", "%d stop download", Integer.valueOf(hashCode()));
        ((C119157j) C119157j.f356862d).mo183875f(new C98439a());
    }

    /* renamed from: h */
    public final boolean mo137777h(String str) {
        return ((C98548d) C86312j.m106911c(C98548d.class)).mo137920xN(str) != 0;
    }
}
