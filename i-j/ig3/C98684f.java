package ig3;

import android.content.Context;
import android.database.Cursor;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.modelimage.C1299o;
import com.tencent.p014mm.modelimage.C92836k;
import com.tencent.p014mm.modelimage.C92839m;
import com.tencent.p014mm.plugin.zero.C85597u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import f40.C86709a0;
import hd0.C98408n0;
import hd0.C98410o0;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import ob0.C11385n;
import ob0.C117747y;
import p158gt.C76054m;
import p158gt.C98201k;
import p158gt.C98204q;
import p248ug.C102030l0;
import p682rz.C101482k;
import p682rz.C101488s;
import p682rz.C101491u;
import te3.C101767ct3;
import te3.C101770ds3;
import te3.C101803ks3;

@C86522b(dependencies = {C85597u.class}, onProcess = {C80625v0.MATCH_MM})
/* renamed from: ig3.f */
public class C98684f extends C86301e implements C11385n, C102030l0 {

    /* renamed from: d */
    public ConcurrentHashMap<String, C101803ks3> f289382d = new ConcurrentHashMap<>();

    /* renamed from: ig3.f$a */
    public class C98685a implements C11385n {

        /* renamed from: d */
        public final /* synthetic */ C101803ks3 f289383d;

        public C98685a(C101803ks3 ks32) {
            this.f289383d = ks32;
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            yVar.setHasCallbackToQueue(true);
            if (i == 0 && i2 == 0) {
                Log.m105925i("MicroMsg.MediaSecurityReport", "report successfully! %s", C98684f.vx0(C98684f.this, this.f289383d));
                return;
            }
            Log.m105921e("MicroMsg.MediaSecurityReport", "report error![%s:%s] %s", Integer.valueOf(i), Integer.valueOf(i2), C98684f.vx0(C98684f.this, this.f289383d));
        }
    }

    /* renamed from: ig3.f$b */
    public class C98686b implements C11385n {

        /* renamed from: d */
        public final /* synthetic */ C101803ks3 f289385d;

        public C98686b(C101803ks3 ks32) {
            this.f289385d = ks32;
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            yVar.setHasCallbackToQueue(true);
            if (i == 0 && i2 == 0) {
                Log.m105925i("MicroMsg.MediaSecurityReport", "report successfully! %s", C98684f.vx0(C98684f.this, this.f289385d));
                return;
            }
            Log.m105921e("MicroMsg.MediaSecurityReport", "report error![%s:%s] %s", Integer.valueOf(i), Integer.valueOf(i2), C98684f.vx0(C98684f.this, this.f289385d));
        }
    }

    public static String vx0(C98684f fVar, C101803ks3 ks32) {
        fVar.getClass();
        C101770ds3 ds32 = ks32.f298664e;
        return String.format("[image] %s,%s | %s,%s | %s %s", new Object[]{ds32.f298122d, ds32.f298123e, ds32.f298125g, ds32.f298126h, ks32.f298667h, ks32.f298666g});
    }

    /* renamed from: gf */
    public void mo138094gf(String str, String str2, long j, String str3, String str4) {
        C92836k kVar;
        Class cls = C98201k.class;
        if (j <= 0) {
            C76054m xi = ((C98201k) C86312j.m106911c(cls)).mo137277xi();
            String a = C1299o.m1389a(str);
            C92839m mVar = (C92839m) xi;
            mVar.getClass();
            kVar = new C92836k();
            String b = C92839m.C92844e.m117106b("");
            Cursor wx02 = mVar.wx0(b, (String[]) null, "origImgMD5=?", new String[]{"" + a}, (String) null, (String) null, (String) null, false);
            if (wx02.moveToFirst()) {
                kVar.mo127131b(wx02);
            }
            wx02.close();
        } else {
            kVar = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127194nP(Long.valueOf(j));
        }
        if (kVar.f267374a > 0) {
            Map<String, String> parseXml = XmlParser.parseXml(kVar.f267393t, "msg", (String) null);
            if (parseXml == null) {
                Log.m105929w("MicroMsg.MediaSecurityReport", "attrs == null! %s %s", str, Long.valueOf(j));
                return;
            }
            C101803ks3 ks32 = new C101803ks3();
            ks32.f298663d = 1;
            ks32.f298666g = str4;
            ks32.f298667h = new LinkedList<>(Util.stringsToList(str3.split(",")));
            C101770ds3 ds32 = new C101770ds3();
            ds32.f298125g = parseXml.get(".msg.img.$cdnmidimgurl");
            ds32.f298126h = parseXml.get(".msg.img.$aeskey");
            ds32.f298127i = "";
            ks32.f298664e = ds32;
            this.f289382d.put(str2, ks32);
            return;
        }
        Log.m105929w("MicroMsg.MediaSecurityReport", "[recordImage] imgInfo is null! %s %s", str, Long.valueOf(j));
    }

    public void onCreate(Context context) {
        super.onCreate(context);
        if (MMApplicationContext.isMainProcess()) {
            Log.m105924i("MicroMsg.MediaSecurityReport", APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
            C86709a0.m107524d().mo123455a(110, this);
            C86709a0.m107524d().mo123455a(149, this);
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if ((yVar.getType() != 110 && yVar.getType() != 149) || i != 0 || i2 != 0) {
            return;
        }
        if (yVar instanceof C98204q) {
            C98204q qVar = (C98204q) yVar;
            if (qVar.mo127079p()) {
                String O0 = qVar.mo127072O0();
                C101803ks3 remove = this.f289382d.remove(qVar.mo127074f1());
                if (O0 != null && remove != null) {
                    Map<String, String> parseXml = XmlParser.parseXml(O0, "msg", (String) null);
                    if (parseXml == null) {
                        Log.m105928w("MicroMsg.MediaSecurityReport", "attrs == null!");
                        return;
                    }
                    C101770ds3 ds32 = remove.f298664e;
                    ds32.f298122d = parseXml.get(".msg.img.$cdnmidimgurl");
                    ds32.f298123e = parseXml.get(".msg.img.$aeskey");
                    ds32.f298124f = "";
                    Log.m105925i("MicroMsg.MediaSecurityReport", "report! OrigImgPath:%s", qVar.mo127074f1());
                    new C98687h(remove).doScene(C86709a0.m107524d().f256809d, new C98685a(remove));
                }
            }
        } else if (yVar instanceof C101482k) {
            C101482k kVar = (C101482k) yVar;
            C101803ks3 remove2 = this.f289382d.remove(kVar.mo137742a());
            String A0 = kVar.mo137741A0();
            if (A0 != null && remove2 != null) {
                Map<String, String> parseXml2 = XmlParser.parseXml(A0, "msg", (String) null);
                if (parseXml2 == null) {
                    Log.m105928w("MicroMsg.MediaSecurityReport", "attrs == null!");
                    return;
                }
                C101767ct3 ct32 = remove2.f298665f;
                ct32.f298057e = parseXml2.get(".msg.videomsg.$aeskey");
                ct32.f298056d = parseXml2.get(".msg.videomsg.$cdnvideourll");
                C98408n0 videoInfo = kVar.getVideoInfo();
                ct32.f298058f = videoInfo.f288579z;
                ct32.f298059g = "";
                ct32.f298060h = (float) videoInfo.f288566m;
                ct32.f298061i = ct32.f298056d;
                ct32.f298062j = ct32.f298057e;
                ct32.f298063n = C1299o.m1389a(((C98410o0) ((C101488s) C86312j.m106911c(C101488s.class)).Kj0()).mo137729r(videoInfo.mo137700d()));
                Log.m105925i("MicroMsg.MediaSecurityReport", "report! OrigVideoPath:%s", kVar.mo137742a());
                new C98687h(remove2).doScene(C86709a0.m107524d().f256809d, new C98686b(remove2));
            }
        }
    }

    public void v20(String str, String str2, String str3, String str4) {
        C98408n0 Zd = ((C101491u) C86312j.m106911c(C101491u.class)).mo140806Zd(str);
        if (Zd == null || Zd.f288567n <= 0) {
            Log.m105929w("MicroMsg.MediaSecurityReport", "[recordVideo] imgInfo is null! %s", str);
            return;
        }
        Map<String, String> parseXml = XmlParser.parseXml(Zd.mo137705i(), "msg", (String) null);
        if (parseXml == null) {
            Log.m105929w("MicroMsg.MediaSecurityReport", "attrs == null! %s", str);
            return;
        }
        C101803ks3 ks32 = new C101803ks3();
        ks32.f298663d = 2;
        ks32.f298666g = str4;
        ks32.f298667h = new LinkedList<>(Util.stringsToList(str3.split(",")));
        C101767ct3 ct32 = new C101767ct3();
        ct32.f298064o = Zd.f288579z;
        ct32.f298065p = "";
        ct32.f298069t = (float) Zd.f288566m;
        ct32.f298068s = C1299o.m1389a(((C98410o0) ((C101488s) C86312j.m106911c(C101488s.class)).Kj0()).mo137729r(str));
        ct32.f298066q = parseXml.get(".msg.videomsg.$cdnvideourl");
        ct32.f298067r = parseXml.get(".msg.videomsg.$aeskey");
        ks32.f298665f = ct32;
        this.f289382d.put(str2, ks32);
    }
}
