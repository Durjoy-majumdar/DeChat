package z33;

import android.util.Size;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.file.XVFSFile;
import java.util.HashMap;
import l33.C109247e;
import v33.C111384c;
import w33.C111717b;
import w33.C111730z;
import x33.C112039b;

/* renamed from: z33.f */
public final class C112593f {

    /* renamed from: a */
    public static final C112593f f337156a = new C112593f();

    /* renamed from: b */
    public static int f337157b;

    /* renamed from: c */
    public static int f337158c;

    /* renamed from: d */
    public static int f337159d;

    /* renamed from: e */
    public static boolean f337160e;

    /* renamed from: f */
    public static Size f337161f = C112595h.m153924k();

    static {
        C112595h.f337166a.mo164372p();
    }

    /* renamed from: a */
    public final void mo164363a() {
        f337159d = 0;
        f337157b = 0;
        f337158c = 0;
        C112595h.f337166a.mo164372p();
        f337161f = C112595h.m153924k();
    }

    /* renamed from: b */
    public final String mo164364b() {
        StringBuilder sb = new StringBuilder();
        sb.append(f337157b);
        sb.append(XVFSFile.PATH_SEPARATOR_CHAR);
        sb.append(f337158c);
        return sb.toString();
    }

    /* renamed from: c */
    public final void mo164365c(boolean z) {
        C112039b.C112040a aVar;
        int i = 1;
        if (z) {
            if (f337159d != 1) {
                Log.m105924i("MicroMsg.VoIPEncoderInfo", "encode trans to soft");
            } else {
                return;
            }
        } else if (f337159d != 2) {
            Log.m105924i("MicroMsg.VoIPEncoderInfo", "encode trans to hard");
            i = 2;
        } else {
            return;
        }
        f337159d = i;
        C111717b bVar = C111384c.f333466e;
        if (bVar != null) {
            Log.m105924i("MicroMsg.VoIPEncoderReport", "encode mode change to soft " + z);
            long j = C109247e.vx0().f333458r;
            String str = z ? "EncoderModeChangeSoft" : "EncoderModeChangeHard";
            String str2 = bVar.f334414d;
            if (!(str2 == null || (aVar = bVar.f334411a.get(str2)) == null)) {
                aVar.mo163758b();
            }
            C112039b.C112040a aVar2 = bVar.f334411a.get(str);
            if (aVar2 == null) {
                aVar2 = new C112039b.C112040a();
            }
            aVar2.f335401a = str;
            aVar2.mo163760d(Util.milliSecondsToNow(j));
            bVar.f334411a.put(str, aVar2);
            bVar.f334414d = str;
        }
    }

    /* renamed from: d */
    public final void mo164366d(int i, int i2) {
        if (!(i == f337157b && i2 == f337158c)) {
            Log.m105924i("MicroMsg.VoIPEncoderInfo", "set encode size:[" + i + ',' + i2 + ']');
            C111717b bVar = C111384c.f333466e;
            if (bVar != null) {
                Size size = new Size(i, i2);
                Log.m105924i("MicroMsg.VoIPEncoderReport", "encoder size change to " + size.getWidth() + " * " + size.getHeight());
                long j = C109247e.vx0().f333458r;
                StringBuilder sb = new StringBuilder();
                sb.append("EncoderDrawSizeChanged_");
                sb.append(Math.max(size.getWidth(), size.getHeight()));
                String sb4 = sb.toString();
                HashMap<String, C112039b.C112040a> hashMap = bVar.f334412b;
                C112039b.C112040a aVar = hashMap.get("EncodeBadFrame_" + Math.max(size.getWidth(), size.getHeight()));
                if (aVar != null) {
                    aVar.mo163758b();
                }
                C112039b.C112040a aVar2 = bVar.f334411a.get(bVar.f334413c);
                if (aVar2 != null) {
                    aVar2.mo163758b();
                }
                C112039b.C112040a aVar3 = bVar.f334411a.get(sb4);
                if (aVar3 == null) {
                    aVar3 = new C112039b.C112040a();
                }
                aVar3.mo163762f(sb4);
                aVar3.mo163760d(Util.milliSecondsToNow(j));
                aVar3.mo163763g(String.valueOf(Math.max(size.getWidth(), size.getHeight())));
                bVar.f334411a.put(sb4, aVar3);
                bVar.f334413c = sb4;
            }
            C111730z zVar = C111730z.f334576a;
            C111730z.f334577b.add(Integer.valueOf(i));
        }
        f337157b = i;
        f337158c = i2;
        Size size2 = f337161f;
        if (size2 != null) {
            f337157b = size2.getWidth();
            f337158c = size2.getHeight();
        }
    }
}
