package p927ab;

import android.text.TextUtils;
import com.github.henryye.nativeiv.BaseImageDecodeService;
import com.github.henryye.nativeiv.ImageDecodeConfig;
import com.github.henryye.nativeiv.api.IImageDecodeService;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import hr0.C87583a;
import hr0.C87584b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p1019p6.C89314a;
import p224ra.C89909e;
import p935cb.C79980i;
import p958eb.C86474e;
import p992kb.C88127c;
import p992kb.C88130d;
import zt3.C119157j;

/* renamed from: ab.d */
public class C79479d implements IImageDecodeService.C80188b {

    /* renamed from: a */
    public boolean f233032a;

    /* renamed from: b */
    public WeakReference<C86474e> f233033b = null;

    /* renamed from: c */
    public BaseImageDecodeService f233034c = null;

    /* renamed from: d */
    public String f233035d = "";

    /* renamed from: e */
    public ArrayList<String> f233036e;

    /* renamed from: f */
    public boolean f233037f;

    /* renamed from: g */
    public int f233038g;

    /* renamed from: h */
    public double f233039h;

    /* renamed from: i */
    public int f233040i = 1004;

    /* renamed from: c */
    public static void m96442c(C79479d dVar, String str, C89314a aVar) {
        dVar.getClass();
        Class cls = C87584b.class;
        if (aVar.f257271e.equalsIgnoreCase("base64")) {
            dVar.f233036e.add(MD5Util.getMD5String(str));
            ((C87584b) C89909e.m112439d(cls, true)).mo121691h(18076, "", aVar.f257271e, dVar.f233035d, Integer.valueOf(dVar.f233040i), Long.valueOf(aVar.f257267a), -1L, -1L);
            return;
        }
        dVar.f233036e.add(str);
        ((C87584b) C89909e.m112439d(cls, true)).mo121691h(18076, str, aVar.f257271e, dVar.f233035d, Integer.valueOf(dVar.f233040i), Long.valueOf(aVar.f257267a), -1L, -1L);
    }

    /* renamed from: a */
    public void mo109472a(String str, Object obj, IImageDecodeService.C80190c cVar, ImageDecodeConfig imageDecodeConfig) {
    }

    /* renamed from: b */
    public void mo109473b(String str, IImageDecodeService.C80188b.C80189a aVar, C89314a aVar2) {
        C79980i.C79982b bVar = C79980i.C79982b.ERROR;
        switch (aVar.ordinal()) {
            case 0:
                C88127c a = C88127c.m109723a(this.f233035d);
                long j = aVar2.f257267a;
                long j2 = aVar2.f257268b;
                a.getClass();
                ((C119157j) C119157j.f356862d).mo183875f(new C88130d(a, j));
                a.f254893i.add(Long.valueOf(j2));
                ((C119157j) C119157j.f356862d).mo183875f(new C79478c(this, str, aVar2));
                if (aVar2.f257268b >= 1000) {
                    mo109475e(11);
                    return;
                }
                return;
            case 1:
                if (TextUtils.isEmpty(aVar2.f257272f)) {
                    mo109474d(str, bVar, MMApplicationContext.getContext().getString(C0966R.string.a5p));
                } else {
                    mo109474d(str, bVar, String.format("%s: %s", new Object[]{MMApplicationContext.getContext().getString(C0966R.string.a5p), aVar2.f257272f}));
                }
                mo109475e(7);
                return;
            case 2:
                mo109474d(str, bVar, MMApplicationContext.getContext().getString(C0966R.string.a5q));
                mo109475e(5);
                return;
            case 4:
                mo109474d(str, bVar, MMApplicationContext.getContext().getString(C0966R.string.a5l));
                mo109475e(0);
                return;
            case 5:
                mo109474d(str, bVar, String.format(MMApplicationContext.getContext().getString(C0966R.string.a5r), new Object[]{Integer.valueOf(aVar2.f257269c), Integer.valueOf(aVar2.f257270d), -1L, -1L}));
                mo109475e(3);
                return;
            case 6:
                Log.m105921e("MicroMsg.MBImageDecodeRegistry", "IOEXCEPTION path:%s", str);
                mo109474d(str, bVar, MMApplicationContext.getContext().getString(C0966R.string.a5m));
                mo109475e(4);
                return;
            case 7:
                Log.m105921e("MicroMsg.MBImageDecodeRegistry", "OUT_OF_MEMORY path:%s", str);
                mo109474d(str, bVar, MMApplicationContext.getContext().getString(C0966R.string.a5n));
                mo109475e(1);
                return;
            case 8:
                Log.m105925i("MicroMsg.MBImageDecodeRegistry", "USE_LEGACY path:%s", str);
                mo109475e(8);
                return;
            case 10:
                Log.m105921e("MicroMsg.MBImageDecodeRegistry", "NATIVE_DECODE_ERROR path:%s", str);
                mo109474d(str, bVar, MMApplicationContext.getContext().getString(C0966R.string.a5i));
                mo109475e(5);
                return;
            case 11:
                Log.m105921e("MicroMsg.MBImageDecodeRegistry", "THROW_EXCEPTION path:%s", str);
                mo109474d(str, bVar, MMApplicationContext.getContext().getString(C0966R.string.a5o));
                mo109475e(16);
                return;
            default:
                return;
        }
    }

    /* renamed from: d */
    public final void mo109474d(String str, C79980i.C79982b bVar, String str2) {
        if (this.f233033b.get() != null) {
            C79980i A = this.f233033b.get().mo120894A();
            A.mo110167a(bVar, str + ": " + str2);
        }
    }

    /* renamed from: e */
    public final void mo109475e(int i) {
        ((C87583a) C89909e.m112439d(C87583a.class, true)).idkeyStat(807, (long) i, 1, false);
    }
}
