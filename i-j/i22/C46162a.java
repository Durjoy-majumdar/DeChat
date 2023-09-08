package i22;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import ob0.C47350c;
import p728vs.C52989c;
import pe3.C47465a;
import te3.C48857bh2;
import te3.C51018qv3;
import te3.C51163rv3;
import te3.C51874wt1;
import te3.C52018xt1;

/* renamed from: i22.a */
public enum C46162a {
    INSTANCE;
    

    /* renamed from: d */
    public byte[] f124443d;

    /* renamed from: e */
    public Map<String, C46164b> f124444e;

    /* renamed from: i22.a$a */
    public class C46163a implements C40324j.C40326a {

        /* renamed from: a */
        public final /* synthetic */ C46165c f124445a;

        /* renamed from: b */
        public final /* synthetic */ C51874wt1 f124446b;

        /* renamed from: c */
        public final /* synthetic */ boolean f124447c;

        /* renamed from: d */
        public final /* synthetic */ String f124448d;

        public C46163a(C46165c cVar, C51874wt1 wt12, boolean z, String str) {
            this.f124445a = cVar;
            this.f124446b = wt12;
            this.f124447c = z;
            this.f124448d = str;
        }

        /* renamed from: a */
        public void mo288a(int i, int i2, String str, C47350c cVar) {
            int i3;
            Log.m105925i("LiteApp.LiteAppGetA8Key", "errType:%d errCode:%d ", Integer.valueOf(i), Integer.valueOf(i2));
            C47465a aVar = cVar.f127056b.f127083a;
            if (aVar instanceof C52018xt1) {
                C52018xt1 xt12 = (C52018xt1) aVar;
                Log.m105924i("LiteApp.LiteAppGetA8Key", "fullurl:" + xt12.f144941d);
                String str2 = xt12.f144941d;
                if (str2 == null) {
                    C46165c cVar2 = this.f124445a;
                    if (cVar2 != null) {
                        cVar2.mo66577a();
                        return;
                    }
                    return;
                }
                int indexOf = str2.indexOf("?");
                if (indexOf < 0 || (i3 = indexOf + 1) >= xt12.f144941d.length()) {
                    Log.m105920e("LiteApp.LiteAppGetA8Key", "paramPos invalid");
                    C46165c cVar3 = this.f124445a;
                    if (cVar3 != null) {
                        cVar3.mo66577a();
                        return;
                    }
                    return;
                }
                String[] split = xt12.f144941d.substring(i3).split("&");
                if (split == null) {
                    Log.m105920e("LiteApp.LiteAppGetA8Key", "params invalid");
                    C46165c cVar4 = this.f124445a;
                    if (cVar4 != null) {
                        cVar4.mo66577a();
                        return;
                    }
                    return;
                }
                C46164b bVar = new C46164b(C46162a.this);
                bVar.f124451b = this.f124446b.f144285y;
                for (String str3 : split) {
                    int indexOf2 = str3.indexOf(61);
                    if (indexOf2 >= 0) {
                        String trim = str3.substring(0, indexOf2).trim();
                        if (this.f124447c || (!trim.equals("uin") && !trim.equals("exportKey") && !trim.equals("exportkey"))) {
                            if (bVar.f124450a == null) {
                                bVar.f124450a = str3;
                            } else {
                                bVar.f124450a += "&" + str3;
                            }
                            ((HashMap) bVar.f124453d).put(trim, str3.substring(indexOf2 + 1).trim());
                        }
                    } else if (bVar.f124450a == null) {
                        bVar.f124450a = str3;
                    } else {
                        bVar.f124450a += "&" + str3;
                    }
                }
                Iterator<C48857bh2> it = xt12.f144958x.iterator();
                while (it.hasNext()) {
                    C48857bh2 next = it.next();
                    ((HashMap) bVar.f124452c).put(next.f131120d, next.f131121e);
                }
                ((ConcurrentHashMap) C46162a.this.f124444e).put(this.f124448d, bVar);
                C46165c cVar5 = this.f124445a;
                if (cVar5 != null) {
                    cVar5.mo66578b(bVar);
                    return;
                }
                return;
            }
            Log.m105920e("LiteApp.LiteAppGetA8Key", "getA8Key call back resp is null");
            C46165c cVar6 = this.f124445a;
            if (cVar6 != null) {
                cVar6.mo66577a();
            }
        }
    }

    /* renamed from: i22.a$b */
    public class C46164b {

        /* renamed from: a */
        public String f124450a;

        /* renamed from: b */
        public int f124451b;

        /* renamed from: c */
        public Map<String, String> f124452c;

        /* renamed from: d */
        public Map<String, String> f124453d;

        public C46164b(C46162a aVar) {
            this.f124452c = new HashMap();
            this.f124453d = new HashMap();
        }
    }

    /* renamed from: i22.a$c */
    public interface C46165c {
        /* renamed from: a */
        void mo66577a();

        /* renamed from: b */
        void mo66578b(C46164b bVar);
    }

    /* renamed from: a */
    public void mo71600a(String str, boolean z, C46165c cVar) {
        String str2;
        NetworkInfo activeNetworkInfo;
        int currentTimeMillis = (int) System.currentTimeMillis();
        C47350c cO = ((C52989c) C86312j.m106911c(C52989c.class)).mo73576cO(str, 0);
        C51874wt1 wt12 = (C51874wt1) cO.f127055a.f127080a;
        wt12.f144267d = 2;
        C51163rv3 rv32 = new C51163rv3();
        rv32.f141175d = str;
        rv32.f141176e = true;
        wt12.f144272i = rv32;
        wt12.f144275o = 0;
        wt12.f144276p = "";
        wt12.f144279s = 0;
        wt12.f144281u = 0;
        ConnectivityManager connectivityManager = (ConnectivityManager) MMApplicationContext.getContext().getSystemService("connectivity");
        if (!(connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null)) {
            if (activeNetworkInfo.getType() == 1) {
                str2 = "WIFI";
            } else if (activeNetworkInfo.getExtraInfo() != null) {
                str2 = activeNetworkInfo.getExtraInfo().toLowerCase();
            }
            wt12.f144282v = str2;
            wt12.f144285y = currentTimeMillis;
            wt12.f144286z = "";
            wt12.f144253A = 0;
            C51163rv3 rv33 = new C51163rv3();
            rv33.f141175d = "";
            rv33.f141176e = true;
            wt12.f144269f = rv33;
            C51018qv3 qv32 = new C51018qv3();
            qv32.mo73350k(this.f124443d);
            wt12.f144254B = qv32;
            ((C40324j) C86312j.m106911c(C40324j.class)).mo63014eH(cO, new C46163a(cVar, (C51874wt1) cO.f127055a.f127080a, z, str));
        }
        str2 = "no";
        wt12.f144282v = str2;
        wt12.f144285y = currentTimeMillis;
        wt12.f144286z = "";
        wt12.f144253A = 0;
        C51163rv3 rv332 = new C51163rv3();
        rv332.f141175d = "";
        rv332.f141176e = true;
        wt12.f144269f = rv332;
        C51018qv3 qv322 = new C51018qv3();
        qv322.mo73350k(this.f124443d);
        wt12.f144254B = qv322;
        ((C40324j) C86312j.m106911c(C40324j.class)).mo63014eH(cO, new C46163a(cVar, (C51874wt1) cO.f127055a.f127080a, z, str));
    }
}
