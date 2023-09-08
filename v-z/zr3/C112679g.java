package zr3;

import as3.C103907w;
import as3.C103909x;
import bs3.C104161b;
import bs3.C104164e;
import com.tencent.p014mm.plugin.multitalk.model.C105845w;
import com.tencent.p014mm.plugin.multitalk.model.C42575l0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.api.TPOptionalID;
import com.tencent.xweb.util.WXWebReporter;
import cs3.C106962a;
import ds3.C107065e;
import f40.C86709a0;
import java.util.Iterator;
import java.util.LinkedList;
import p978i9.C108421e;

/* renamed from: zr3.g */
public class C112679g {

    /* renamed from: e */
    public static C112679g f337390e;

    /* renamed from: a */
    public int f337391a;

    /* renamed from: b */
    public LinkedList<C112681b> f337392b;

    /* renamed from: c */
    public C107065e f337393c;

    /* renamed from: d */
    public boolean f337394d;

    /* renamed from: zr3.g$b */
    public class C112681b {

        /* renamed from: a */
        public int f337395a;

        /* renamed from: b */
        public String f337396b;

        /* renamed from: c */
        public C112669a f337397c;

        /* renamed from: d */
        public C112671c f337398d;

        public C112681b(C112679g gVar, C112680a aVar) {
        }
    }

    public C112679g() {
        this.f337391a = 0;
        this.f337392b = null;
        this.f337393c = null;
        this.f337394d = true;
        this.f337392b = new LinkedList<>();
        this.f337394d = true;
    }

    /* renamed from: e */
    public static C112679g m154059e() {
        if (f337390e == null) {
            synchronized (C112679g.class) {
                if (f337390e == null) {
                    f337390e = new C112679g();
                }
            }
        }
        return f337390e;
    }

    /* renamed from: a */
    public final int mo164413a(C112669a aVar, C112671c cVar, String str, int i, byte[] bArr, int i2, int i3, int i4, int i5) {
        int i6;
        byte[] bArr2;
        int i7;
        String str2 = str;
        int i8 = i;
        synchronized (this.f337392b) {
            i6 = this.f337391a + 1;
            this.f337391a = i6;
        }
        try {
            bArr2 = mo164416d(i, bArr, i2, i3, i6, i5, 0);
        } catch (Exception unused) {
            C104161b.m138997f("NetError", "newTaskHelper addTask body null");
            bArr2 = null;
        }
        if (bArr2 == null) {
            C104161b.m138997f("NETCMD", "cmd:" + i8 + "|body is null");
            return -1;
        } else if (bArr2.length > 61440) {
            C104161b.m138997f("NETCMD", "cmd:" + i8 + "|body too large");
            return -1;
        } else {
            C112681b bVar = new C112681b(this, (C112680a) null);
            bVar.f337395a = i6;
            bVar.f337397c = aVar;
            bVar.f337398d = cVar;
            bVar.f337396b = str2;
            synchronized (this.f337392b) {
                this.f337392b.add(bVar);
            }
            switch (i8) {
                case 139:
                    i7 = 1918;
                    break;
                case 141:
                    i7 = 1919;
                    break;
                case TPOptionalID.f349338xc9bdf6cd /*143*/:
                    i7 = 1927;
                    break;
                case 145:
                    i7 = 1931;
                    break;
                case 147:
                    i7 = 1932;
                    break;
                case WXWebReporter.WXWEB_IDKEY_PLUGIN_CONFIG_DOWNLOAD:
                    i7 = 1929;
                    break;
                case WXWebReporter.WXWEB_IDKEY_PLUGIN_CONFIG_DOWNLOAD_FAILED:
                    i7 = 1928;
                    break;
                case WXWebReporter.WXWEB_IDKEY_FULL_SCREEN_JS_USE_DOWNLOAD:
                    i7 = 1935;
                    break;
                case 211:
                    i7 = 1937;
                    break;
                case 221:
                    i7 = 1938;
                    break;
                case WXWebReporter.WXWEB_IDKEY_DEBUG_LINK_FROM_WEB:
                    i7 = 1939;
                    break;
                default:
                    i7 = 1933;
                    break;
            }
            C104161b.m138993b("NETCMD", "CLTSEND|", Integer.valueOf(i6), Integer.valueOf(i7), str2, C106962a.f320180a);
            C107065e eVar = this.f337393c;
            if (eVar != null) {
                ((C105845w.C105846a) eVar).getClass();
                Log.m105924i("MicroMsg.MT.MultiTalkEngine", "sendMultiTalkReq " + i6 + " cmdid " + i7);
                C86709a0.m107524d().mo123460f(new C42575l0(i6, i7, bArr2));
            }
            return i6;
        }
    }

    /* renamed from: b */
    public final int mo164414b(C112669a aVar, C112671c cVar, int i, String str, byte[] bArr, int i2, int i3) {
        if (!this.f337394d) {
            C104161b.m138997f("NETCMD", "doSendTask mIsInitSucc is false");
            return -1;
        }
        try {
            return mo164413a(aVar, cVar, str, i, bArr, 0, 0, i2, i3);
        } catch (Throwable th) {
            C104161b.m138997f("NETCMD", "Exception doSendTask", th);
            return -1;
        }
    }

    /* renamed from: c */
    public final C112681b mo164415c(int i) {
        C112681b bVar;
        synchronized (this.f337392b) {
            Iterator<C112681b> it = this.f337392b.iterator();
            bVar = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C112681b next = it.next();
                if (next.f337395a == i) {
                    bVar = next;
                    break;
                }
            }
        }
        return bVar;
    }

    /* renamed from: d */
    public final byte[] mo164416d(int i, byte[] bArr, int i2, int i3, int i4, int i5, int i6) {
        int length = bArr.length;
        if (bArr.length >= 200) {
            int length2 = bArr.length;
            int length3 = bArr.length;
        }
        C103907w wVar = new C103907w();
        wVar.f307206c = i;
        wVar.f307207d = i4;
        wVar.f307205b = C106962a.f320180a;
        wVar.f307210g = i5;
        C103909x xVar = new C103909x();
        xVar.f307213b = wVar;
        xVar.f307214c = bArr;
        return C108421e.m146906d(xVar);
    }

    /* renamed from: f */
    public final void mo164417f(C112681b bVar, int i, int i2, byte[] bArr) {
        try {
            C112671c cVar = bVar.f337398d;
            if (cVar != null) {
                cVar.mo164402a(i2, bArr);
            }
            C112669a aVar = bVar.f337397c;
            if (aVar != null) {
                ((C104164e.C104165a) aVar).mo145790a(bVar.f337396b, i, i2, bArr);
            }
        } catch (Exception e) {
            C104161b.m138997f("NETCMD", "postRespData", e.getMessage());
        }
        synchronized (this.f337392b) {
            this.f337392b.remove(bVar);
        }
    }
}
