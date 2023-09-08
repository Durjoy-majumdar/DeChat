package t22;

import android.net.Uri;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.QueueWorkerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.vfs.VFSStrategy;
import com.tencent.xweb.file.XVFSFile;
import dd3.C75351c;
import dd3.C75352e;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import lc3.C10485b;
import ob0.C11385n;
import ob0.C117747y;
import p823sg.C90193h;
import wm0.C38230b;

/* renamed from: t22.r */
public class C77830r implements C11385n {

    /* renamed from: j */
    public static final String f226770j = (HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fmg) + "/api?size=%d*%d&center=%f,%f&zoom=%d&referer=weixin");

    /* renamed from: d */
    public QueueWorkerThread f226771d = new QueueWorkerThread(1, "location_worker");

    /* renamed from: e */
    public LinkedList<C75352e> f226772e = new LinkedList<>();

    /* renamed from: f */
    public C75352e f226773f = null;

    /* renamed from: g */
    public List<C75351c> f226774g = new ArrayList();

    /* renamed from: h */
    public int f226775h = 300;

    /* renamed from: i */
    public int f226776i = 300;

    /* renamed from: t22.r$a */
    public class C77831a implements QueueWorkerThread.ThreadObject {

        /* renamed from: d */
        public byte[] f226777d;

        /* renamed from: e */
        public String f226778e = "";

        /* renamed from: f */
        public boolean f226779f;

        /* renamed from: g */
        public int f226780g;

        /* renamed from: h */
        public int f226781h;

        /* renamed from: i */
        public String f226782i;

        public C77831a(boolean z, String str, String str2) {
            this.f226779f = z;
            this.f226780g = C77830r.this.f226775h;
            this.f226781h = C77830r.this.f226776i;
            this.f226778e = str;
            while (true) {
                int i = this.f226780g;
                int i2 = this.f226781h;
                if (i * i2 > 270000) {
                    this.f226780g = (int) (((double) i) / 1.2d);
                    this.f226781h = (int) (((double) i2) / 1.2d);
                } else {
                    this.f226782i = str2;
                    Log.m105925i("MicroMsg.StaticMapServer", "get url %s %s", str, Util.nullAs(str2, ""));
                    return;
                }
            }
        }

        public boolean doInBackground() {
            byte[] httpGet = Util.httpGet(this.f226778e);
            this.f226777d = httpGet;
            if (httpGet == null) {
                return true;
            }
            C86013q1.m106438T(this.f226782i, httpGet, 0, httpGet.length);
            return true;
        }

        public boolean onPostExecute() {
            StringBuilder sb = new StringBuilder();
            sb.append("http onPostExecute ");
            sb.append(this.f226777d == null);
            sb.append(" isGoole: ");
            sb.append(this.f226779f);
            Log.m105924i("MicroMsg.StaticMapServer", sb.toString());
            if (this.f226777d != null) {
                C77830r rVar = C77830r.this;
                String str = C77830r.f226770j;
                rVar.mo107945b(true, 0);
                return false;
            } else if (this.f226779f) {
                C77830r rVar2 = C77830r.this;
                if (rVar2.f226773f == null) {
                    rVar2.mo107945b(false, 0);
                    return false;
                }
                String format = String.format(C77830r.f226770j, new Object[]{Integer.valueOf(this.f226780g), Integer.valueOf(this.f226781h), Float.valueOf(C77830r.this.f226773f.f221514b), Float.valueOf(C77830r.this.f226773f.f221513a), Integer.valueOf(C77830r.this.f226773f.f221515c)});
                this.f226778e = format;
                C77830r rVar3 = C77830r.this;
                rVar3.f226771d.add(new C77831a(false, format, C77830r.m93926a(rVar3.f226773f)));
                return false;
            } else {
                C77830r rVar4 = C77830r.this;
                String str2 = C77830r.f226770j;
                rVar4.mo107945b(false, 0);
                return false;
            }
        }
    }

    public C77830r() {
        C86709a0.m107524d().mo123455a(C38230b.CTRL_INDEX, this);
    }

    /* renamed from: a */
    public static String m93926a(C75352e eVar) {
        String f = C90193h.m112878f((eVar.toString() + "").getBytes());
        String str = VFSStrategy.m163776d("StaticMap") + XVFSFile.SEPARATOR_CHAR + f.charAt(0) + f.charAt(1) + "/" + f.charAt(3) + f.charAt(4) + "/";
        if (!C86013q1.m106450k(str)) {
            Uri n = C116299g2.m163858n(str);
            String path = n.getPath();
            if (path != null) {
                String k = C116299g2.m163855k(path, false, false);
                if (!n.getPath().equals(k)) {
                    n = n.buildUpon().path(k).build();
                }
            }
            C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
            if (l.mo177810a()) {
                l.f348991a.mo119937g(l.f348992b);
            }
        }
        return str + "static_map_" + f;
    }

    /* renamed from: b */
    public final void mo107945b(boolean z, int i) {
        Log.m105925i("MicroMsg.StaticMapServer", "httpgetStaticmapDone %b", Boolean.valueOf(z));
        if (z) {
            if (this.f226773f != null) {
                Iterator it = ((ArrayList) this.f226774g).iterator();
                while (it.hasNext()) {
                    C75351c cVar = (C75351c) it.next();
                    if (cVar != null) {
                        cVar.mo105669a(m93926a(this.f226773f), this.f226773f);
                    }
                }
            }
        } else if (this.f226773f != null) {
            Iterator it4 = ((ArrayList) this.f226774g).iterator();
            while (it4.hasNext()) {
                C75351c cVar2 = (C75351c) it4.next();
                if (cVar2 != null) {
                    cVar2.mo105670b(this.f226773f);
                }
            }
        }
        this.f226773f = null;
        mo107947d();
    }

    /* renamed from: c */
    public void mo107946c(C75351c cVar) {
        ((ArrayList) this.f226774g).remove(cVar);
        Log.m105924i("MicroMsg.StaticMapServer", "removeCallback " + ((ArrayList) this.f226774g).size());
        if (((ArrayList) this.f226774g).size() == 0) {
            Log.m105924i("MicroMsg.StaticMapServer", "clean task");
            this.f226772e.clear();
            this.f226773f = null;
            Log.m105924i("MicroMsg.StaticMapServer", "stop static map server");
            C86709a0.m107524d().mo123470p(C38230b.CTRL_INDEX, this);
        }
    }

    /* renamed from: d */
    public final void mo107947d() {
        int i;
        if (this.f226773f == null && this.f226772e.size() > 0) {
            this.f226773f = this.f226772e.removeFirst();
            try {
                i = Integer.valueOf(Util.nullAs(((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("StaticMapGetClient"), "")).intValue();
            } catch (Exception unused) {
                i = 0;
            }
            Log.m105925i("MicroMsg.StaticMapServer", "run local %d", Integer.valueOf(i));
            if (i == 0) {
                C75352e eVar = this.f226773f;
                C86709a0.m107524d().mo123460f(new C48533l(eVar.f221513a, eVar.f221514b, eVar.f221515c + 1, 0, this.f226775h, this.f226776i, m93926a(eVar), LocaleUtil.getApplicationLanguage()));
                return;
            }
            int i2 = this.f226775h;
            int i3 = this.f226776i;
            while (i2 * i3 > 270000) {
                i2 = (int) (((double) i2) / 1.2d);
                i3 = (int) (((double) i3) / 1.2d);
            }
            if (Util.isOverseasUser(MMApplicationContext.getContext())) {
                this.f226771d.add(new C77831a(true, String.format("https://maps.googleapis.com/maps/api/staticmap?size=%dx%d&center=%f,%f&zoom=%d&format=jpg&language=%s&sensor=true", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Float.valueOf(this.f226773f.f221513a), Float.valueOf(this.f226773f.f221514b), Integer.valueOf(this.f226773f.f221515c), LocaleUtil.getApplicationLanguage()}), m93926a(this.f226773f)));
                return;
            }
            this.f226771d.add(new C77831a(false, String.format(f226770j, new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Float.valueOf(this.f226773f.f221514b), Float.valueOf(this.f226773f.f221513a), Integer.valueOf(this.f226773f.f221515c)}), m93926a(this.f226773f)));
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (yVar.getType() != 648) {
            return;
        }
        if (i == 0 && i2 == 0 && this.f226773f != null) {
            mo107945b(true, i);
        } else {
            mo107945b(false, i);
        }
    }
}
