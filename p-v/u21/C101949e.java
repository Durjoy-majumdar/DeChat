package u21;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Looper;
import com.tencent.mapsdk.internal.C0947jz;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.modelvideoh265toh264.C92862f;
import com.tencent.p014mm.plugin.component.editor.C93086o;
import com.tencent.p014mm.plugin.sight.base.ABAPrams;
import com.tencent.p014mm.plugin.sight.base.AdaptiveAdjustBitrate;
import com.tencent.p014mm.plugin.sight.base.SightVideoJNI;
import com.tencent.p014mm.pluginsdk.model.C30680l1;
import com.tencent.p014mm.pluginsdk.model.C30685u0;
import com.tencent.p014mm.pluginsdk.model.C96790t0;
import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.QueueWorkerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import f40.C86709a0;
import hd0.C98398h0;
import hd0.C98408n0;
import hd0.C98410o0;
import hd0.C98426q0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p21.C100625j;
import p21.C100630o;
import p645pj.C35511a;
import p682rz.C101491u;
import p823sg.C101614i;
import p914oj.C100361a;
import u21.C101953f;
import uf0.C102016c;
import xb0.C102609h;

/* renamed from: u21.e */
public class C101949e extends Thread implements C101953f {

    /* renamed from: r */
    public static HashMap<String, C101952b> f300131r = new HashMap<>();

    /* renamed from: s */
    public static Object f300132s = new byte[0];

    /* renamed from: t */
    public static QueueWorkerThread f300133t;

    /* renamed from: d */
    public List<String> f300134d;

    /* renamed from: e */
    public List<Integer> f300135e;

    /* renamed from: f */
    public List<String> f300136f;

    /* renamed from: g */
    public List<String> f300137g;

    /* renamed from: h */
    public List<Integer> f300138h;

    /* renamed from: i */
    public C101953f.C101954a f300139i;

    /* renamed from: j */
    public C100625j f300140j;

    /* renamed from: n */
    public String f300141n;

    /* renamed from: o */
    public String f300142o;

    /* renamed from: p */
    public C96790t0.C96792b f300143p = new C96790t0.C96792b();

    /* renamed from: q */
    public boolean f300144q = false;

    /* renamed from: u21.e$a */
    public class C101950a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f300145d;

        /* renamed from: e */
        public final /* synthetic */ String f300146e;

        /* renamed from: u21.e$a$a */
        public class C101951a implements Runnable {
            public C101951a() {
            }

            public void run() {
                C101949e eVar = C101949e.this;
                ((C93086o) eVar.f300139i).mo127580a(eVar.f300142o, eVar.f300140j);
            }
        }

        public C101950a(int i, String str) {
            this.f300145d = i;
            this.f300146e = str;
        }

        public void run() {
            int i;
            C101949e eVar = C101949e.this;
            if (eVar.f300144q || (i = this.f300145d) == -50006) {
                C101953f.C101954a aVar = eVar.f300139i;
                String str = this.f300146e;
                C100625j jVar = eVar.f300140j;
                C93086o oVar = (C93086o) aVar;
                oVar.getClass();
                C100630o oVar2 = (C100630o) jVar;
                Log.m105924i("MicroMsg.EditorActivityUI", "compressNoteVideo onImportFinish");
                if (!Util.isNullOrNil(str) && C86013q1.m106450k(str) && oVar2 != null) {
                    oVar2.f294827s = str;
                    C101941c.m134173q().mo141461r(oVar2, oVar.f268176a.f268048j.mo127569c(), true, true, false, true, false);
                    oVar.f268176a.mo127491Z7(true, 100);
                    oVar.f268176a.mo127490Y7(1, 0);
                }
            } else {
                C101953f.C101954a aVar2 = eVar.f300139i;
                C100625j jVar2 = eVar.f300140j;
                C93086o oVar3 = (C93086o) aVar2;
                if (i == -50002) {
                    oVar3.f268176a.mo127486U7();
                } else if (i == -50008) {
                    oVar3.f268176a.mo127486U7();
                } else {
                    oVar3.getClass();
                }
            }
            if (C101949e.this.f300144q || this.f300145d != -50006) {
                C86709a0.m107525e().postToWorkerDelayed(new C101951a(), 80);
            }
        }
    }

    /* renamed from: u21.e$b */
    public static final class C101952b extends C96790t0.C96793d {

        /* renamed from: v */
        public C100625j f300149v;

        /* renamed from: w */
        public C101953f.C101954a f300150w;

        public C101952b(C101950a aVar) {
        }

        public boolean doInBackground() {
            boolean z;
            synchronized (C101949e.f300132s) {
                z = !C101949e.f300131r.containsKey(this.f283553d);
            }
            if (!z) {
                z = ((C101491u) C86312j.m106911c(C101491u.class)).mo140806Zd(this.f283553d) == null;
            }
            if (z) {
                Log.m105929w("MicroMsg.EditorVideoCompress", "remuxing job has been removed, filename %s", this.f283553d);
                return true;
            }
            mo135069a();
            return true;
        }

        public boolean onPostExecute() {
            synchronized (C101949e.f300132s) {
                C101949e.f300131r.remove(this.f283553d);
            }
            C101953f.C101954a aVar = this.f300150w;
            if (aVar == null) {
                return false;
            }
            ((C93086o) aVar).mo127580a(this.f283555f, this.f300149v);
            return false;
        }
    }

    public C101949e(List<String> list, String str, String str2, C100625j jVar, C101953f.C101954a aVar) {
        this.f300134d = list;
        this.f300135e = new ArrayList();
        this.f300136f = new ArrayList();
        this.f300138h = new ArrayList();
        this.f300137g = new ArrayList();
        this.f300139i = aVar;
        this.f300140j = jVar;
        this.f300142o = str2;
        this.f300141n = str;
    }

    /* renamed from: a */
    public final void mo141475a(int i, String str, String str2, int i2, VideoTransPara videoTransPara, Context context, String str3) {
        Log.m105925i("MicroMsg.EditorVideoCompress", "finish to import %s to %s | ret %d | duration %d", str2, str, Integer.valueOf(i), Integer.valueOf(i2));
        synchronized (this) {
            ((ArrayList) this.f300135e).add(Integer.valueOf(i));
            ((ArrayList) this.f300136f).add(str);
            ((ArrayList) this.f300137g).add(str2);
            ((ArrayList) this.f300138h).add(Integer.valueOf(i2));
        }
        if (!(i == -50002 || i == -50008)) {
            if (i == -50006) {
                if (Util.isNullOrNil(str)) {
                    Log.m105928w("MicroMsg.EditorVideoCompress", "do insertVideoStorage, but file name is null");
                } else {
                    C98408n0 n0Var = new C98408n0();
                    n0Var.f288554a = str;
                    n0Var.f288566m = 1;
                    n0Var.f288570q = null;
                    n0Var.f288571r = (String) C86709a0.m107535s().mo121142i().mo119684e(2, "");
                    n0Var.f288563j = Util.nowSecond();
                    n0Var.f288564k = Util.nowSecond();
                    n0Var.f288575v = null;
                    n0Var.f288574u = str2;
                    if (!Util.isNullOrNil(str2)) {
                        n0Var.f288572s = 1;
                    }
                    n0Var.f288559f = 0;
                    C98398h0.Bx0().mo137730s(n0Var);
                }
                if (f300133t == null) {
                    f300133t = new QueueWorkerThread(10, "remuxing-thread-" + System.currentTimeMillis(), 1, Looper.getMainLooper());
                }
                C101952b bVar = new C101952b((C101950a) null);
                synchronized (f300132s) {
                    f300131r.put(str, bVar);
                }
                bVar.f283553d = str;
                bVar.f283554e = str2;
                bVar.f283555f = this.f300142o;
                bVar.f283559j = videoTransPara;
                bVar.f283557h = 1;
                bVar.f300150w = this.f300139i;
                bVar.f300149v = this.f300140j;
                bVar.f283567u = C92862f.m117175h(str2);
                new ArrayList();
                new ArrayList();
                bVar.f283560n = this.f300143p.f283552a;
                f300133t.add(bVar);
            } else if (i >= 0) {
                this.f300144q = true;
            }
        }
        if (this.f300139i != null) {
            MMHandlerThread.postToMainThread(new C101950a(i, str3));
        }
    }

    public void run() {
        String str;
        String str2;
        String str3;
        C100361a.C77012a aVar;
        int i;
        boolean z;
        Context context;
        C100361a.C77012a aVar2;
        String str4;
        String str5;
        String str6;
        VideoTransPara videoTransPara;
        String str7;
        int i2;
        int i3;
        String str8;
        String str9;
        String str10;
        String str11;
        boolean z2;
        int i4;
        int i5;
        C100361a.C77012a aVar3;
        String str12;
        boolean z3;
        VideoTransPara videoTransPara2;
        PInt pInt;
        VideoTransPara videoTransPara3;
        PInt pInt2;
        char c;
        char c2;
        char c3;
        C101949e eVar = this;
        List<String> list = eVar.f300134d;
        if (list != null && list.size() > 0) {
            int i6 = 0;
            int i7 = 0;
            while (i7 < eVar.f300134d.size()) {
                Object[] objArr = new Object[1];
                objArr[i6] = eVar.f300134d.toString();
                Log.m105925i("MicroMsg.EditorVideoCompress", "start to import %s", objArr);
                Intent intent = new Intent();
                intent.setData(Uri.parse("file://" + eVar.f300134d.get(i7)));
                Context context2 = MMApplicationContext.getContext();
                if (Util.isNullOrNil(eVar.f300141n) || Util.isNullOrNil(eVar.f300142o)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("note_");
                    C101614i<String, ArrayList<C98408n0>> iVar = C98410o0.f288586c;
                    sb.append(C98426q0.m127793a((String) C86709a0.m107535s().mo121142i().mo119684e(2, "")));
                    String sb4 = sb.toString();
                    String r = C98398h0.Bx0().mo137729r(sb4);
                    str3 = C98398h0.Bx0().mo137728q(sb4);
                    str = sb4;
                    str2 = r;
                } else {
                    String str13 = eVar.f300141n;
                    String str14 = eVar.f300142o;
                    String substring = str14.substring(str14.lastIndexOf("/") + 1, eVar.f300142o.length());
                    str3 = eVar.f300142o;
                    str2 = str13;
                    str = substring;
                }
                String str15 = str3;
                boolean is2G = NetStatusUtil.is2G(MMApplicationContext.getContext());
                try {
                    aVar = C100361a.m131253b(context2, intent, -1);
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.EditorVideoCompress", e, "", new Object[i6]);
                    aVar = null;
                }
                String str16 = aVar != null ? aVar.f224997a : null;
                if (Util.isNullOrNil(str16)) {
                    Log.m105920e("MicroMsg.EditorVideoCompress", "GetVideoMetadata filed.");
                    mo141475a(-50005, str, str16, 0, (VideoTransPara) null, context2, (String) null);
                    i = i7;
                } else {
                    boolean a = C102016c.m134339a(str16);
                    long l = C86013q1.m106451l(str16);
                    if (a) {
                        PInt pInt3 = new PInt();
                        C96790t0.C96792b bVar = eVar.f300143p;
                        if (C102609h.Fx0().zx0(str16)) {
                            Object[] objArr2 = new Object[1];
                            objArr2[i6] = str16;
                            Log.m105925i("MicroMsg.EditorVideoCompress", "check remuxing, this video had wx meta do not remuxing. %s ", objArr2);
                            pInt3.value = 1;
                            aVar2 = aVar;
                            pInt = pInt3;
                            z = a;
                            str7 = "GetVideoMetadata filed.";
                            str6 = str2;
                            str5 = str15;
                            i = i7;
                            context = context2;
                            str4 = "";
                        } else {
                            VideoTransPara a2 = C92862f.m117168a(str16);
                            Boolean valueOf = Boolean.valueOf(C92862f.m117175h(str16));
                            str7 = "GetVideoMetadata filed.";
                            Object[] objArr3 = new Object[2];
                            objArr3[i6] = a2;
                            objArr3[1] = null;
                            Log.m105919d("MicroMsg.EditorVideoCompress", "check remuxing old para %s, customVideoTransPara: %s", objArr3);
                            VideoTransPara Ex0 = C102609h.Fx0().Ex0(a2, (String) null);
                            if (Ex0 == null) {
                                Log.m105925i("MicroMsg.EditorVideoCompress", "get C2C album video para is null. old para %s", a2);
                                pInt3.value = -5;
                                aVar2 = aVar;
                                pInt = pInt3;
                                z = a;
                                str6 = str2;
                                str5 = str15;
                                i = i7;
                                videoTransPara2 = null;
                                context = context2;
                                str4 = "";
                            } else {
                                Log.m105919d("MicroMsg.EditorVideoCompress", "check remuxing new para %s", Ex0);
                                if (C30685u0.f82571a.mo57539a()) {
                                    Ex0.f267154A = 1;
                                }
                                int[] iArr = {0, 0, 0};
                                int i8 = Ex0.f267169g;
                                iArr[0] = i8;
                                str6 = str2;
                                int i9 = Ex0.f267166d;
                                str5 = str15;
                                iArr[1] = i9;
                                int i15 = Ex0.f267167e;
                                iArr[2] = i15;
                                int i16 = Ex0.f267180u;
                                i = i7;
                                if (i16 == 1 || i16 == 2) {
                                    str4 = "";
                                    aVar2 = aVar;
                                    context = context2;
                                    z = a;
                                    pInt2 = pInt3;
                                    videoTransPara3 = a2;
                                    ABAPrams b = AdaptiveAdjustBitrate.m119557b(str16, i15, i9, Ex0.f267168f, i8, 10.0f, 0.0f, Ex0.f267160G, Ex0.f267182w, 0.0f, Ex0.f267184y, Ex0.f267185z, Ex0.f267154A, Ex0.f267155B, Ex0.f267156C, false);
                                    bVar.f283552a = b;
                                    if (b != null) {
                                        iArr[0] = b.outputKbps * 1000;
                                    }
                                    if (b == null || b.resolutionAdjust <= 0) {
                                        c3 = 1;
                                    } else {
                                        c3 = 1;
                                        iArr[1] = b.outputWidth;
                                        iArr[2] = b.outputHeight;
                                    }
                                    Object[] objArr4 = new Object[3];
                                    objArr4[0] = Integer.valueOf(iArr[0]);
                                    objArr4[c3] = Integer.valueOf(iArr[c3]);
                                    c = 2;
                                    objArr4[2] = Integer.valueOf(iArr[2]);
                                    Log.m105925i("MicroMsg.EditorVideoCompress", "ABA: Adaptive Bitrate Methods:videoBitrate [%d]  targetWidth [%d]  targetHeight [%d]", objArr4);
                                    C98398h0.xx0().mo126991o(bVar.f283552a);
                                    c2 = 0;
                                } else {
                                    Log.m105924i("MicroMsg.EditorVideoCompress", "c2c ABA: No use ABA algorithm");
                                    aVar2 = aVar;
                                    pInt2 = pInt3;
                                    videoTransPara3 = a2;
                                    z = a;
                                    context = context2;
                                    str4 = "";
                                    c2 = 0;
                                    c = 2;
                                }
                                int i17 = iArr[c2];
                                Ex0.f267169g = i17;
                                Ex0.f267166d = iArr[1];
                                Ex0.f267167e = iArr[c];
                                VideoTransPara videoTransPara4 = videoTransPara3;
                                int i18 = videoTransPara4.f267169g;
                                if (i18 <= 640000 || i17 > i18) {
                                    pInt = pInt2;
                                    Log.m105925i("MicroMsg.EditorVideoCompress", "new bitrate is bigger than old bitrate %s %s", Ex0, videoTransPara4);
                                    if (valueOf.booleanValue()) {
                                        pInt.value = 0;
                                        videoTransPara2 = videoTransPara4;
                                    } else {
                                        pInt.value = 1;
                                    }
                                } else {
                                    int i19 = videoTransPara4.f267170h * 1000;
                                    C35511a aVar4 = C35511a.f94971a;
                                    if (i19 >= aVar4.mo60283a() * 1000) {
                                        pInt = pInt2;
                                        pInt.value = -6;
                                    } else {
                                        pInt = pInt2;
                                        if (valueOf.booleanValue()) {
                                            pInt.value = 0;
                                        } else {
                                            boolean is2G2 = NetStatusUtil.is2G(MMApplicationContext.getContext());
                                            pInt.value = SightVideoJNI.shouldRemuxingVFS(str16, Ex0.f267166d, Ex0.f267167e, is2G2 ? 10485760 : C30680l1.m39149a(), is2G2 ? 60000.0d : (double) (aVar4.mo60283a() * 1000), 1000000);
                                        }
                                        videoTransPara2 = Ex0;
                                    }
                                }
                            }
                            i3 = pInt.value;
                            videoTransPara = videoTransPara2;
                            i2 = 3;
                        }
                        videoTransPara2 = null;
                        i3 = pInt.value;
                        videoTransPara = videoTransPara2;
                        i2 = 3;
                    } else {
                        aVar2 = aVar;
                        z = a;
                        str7 = "GetVideoMetadata filed.";
                        str6 = str2;
                        str5 = str15;
                        i = i7;
                        context = context2;
                        str4 = "";
                        i3 = l > ((long) (is2G ? 10485760 : 26214400)) ? -5 : 1;
                        i2 = 3;
                        videoTransPara = null;
                    }
                    Object[] objArr5 = new Object[i2];
                    objArr5[0] = Integer.valueOf(i3);
                    objArr5[1] = Boolean.valueOf(z);
                    objArr5[2] = Long.valueOf(l);
                    Log.m105925i("MicroMsg.EditorVideoCompress", "check remuxing, ret %d isMp4 %b length %d", objArr5);
                    switch (i3) {
                        case -6:
                        case -4:
                        case -3:
                        case -2:
                            mo141475a(-50002, str, str16, 0, (VideoTransPara) null, context, (String) null);
                            continue;
                        case -5:
                            mo141475a(-50008, str, str16, 0, (VideoTransPara) null, context, (String) null);
                            continue;
                        case -1:
                            mo141475a(-50007, str, str16, 0, (VideoTransPara) null, context, (String) null);
                            continue;
                        case 0:
                            str10 = str16;
                            str11 = str7;
                            str9 = str6;
                            str8 = str5;
                            i4 = 0;
                            z2 = true;
                            break;
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                            if (l > 26214400) {
                                i4 = -50002;
                                str11 = str7;
                                str10 = str16;
                                str9 = str6;
                                str8 = str5;
                                mo141475a(-50002, str, str16, 0, (VideoTransPara) null, context, (String) null);
                            } else {
                                str10 = str16;
                                str11 = str7;
                                str9 = str6;
                                str8 = str5;
                                i4 = 0;
                            }
                            z2 = false;
                            break;
                        default:
                            Log.m105920e("MicroMsg.EditorVideoCompress", "unknown check type");
                            mo141475a(-50001, str, str16, 0, (VideoTransPara) null, context, (String) null);
                            continue;
                    }
                    if (aVar2 == null) {
                        Log.m105920e("MicroMsg.EditorVideoCompress", str11);
                        mo141475a(-50005, str, str10, 0, (VideoTransPara) null, context, (String) null);
                    } else {
                        if (!z2) {
                            C86013q1.m106442c(str10, str8);
                            i5 = i4;
                            aVar3 = aVar2;
                        } else {
                            aVar3 = aVar2;
                            i5 = -50006;
                        }
                        int videoMsToSec = Util.videoMsToSec((long) aVar3.f224999c);
                        Bitmap bitmap = aVar3.f224998b;
                        if (bitmap != null) {
                            try {
                                BitmapUtil.saveBitmapToImage(bitmap, 60, Bitmap.CompressFormat.JPEG, str9, true);
                                str12 = str4;
                                z3 = false;
                            } catch (Exception e2) {
                                str12 = str4;
                                Log.printErrStackTrace("MicroMsg.EditorVideoCompress", e2, str12, new Object[0]);
                            }
                        } else {
                            str12 = str4;
                            z3 = true;
                        }
                        if (z3) {
                            try {
                                BitmapUtil.saveBitmapToImage(BitmapUtil.createColorBitmap(-16777216, C0947jz.f2205e, 480), 60, Bitmap.CompressFormat.JPEG, str9, true);
                            } catch (Exception e3) {
                                Log.printErrStackTrace("MicroMsg.EditorVideoCompress", e3, str12, new Object[0]);
                            }
                        }
                        if (!z2 && !C86013q1.m106450k(str8)) {
                            i5 = -50003;
                        }
                        if (!C86013q1.m106450k(str9)) {
                            i5 = -50004;
                        }
                        mo141475a(i5, str, str10, videoMsToSec, videoTransPara, context, str9);
                        i7 = i + 1;
                        i6 = 0;
                        eVar = this;
                    }
                }
                i7 = i + 1;
                i6 = 0;
                eVar = this;
            }
        }
    }
}
