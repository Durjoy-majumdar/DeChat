package ha0;

import a14.C0000n0;
import android.graphics.Bitmap;
import android.net.Uri;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.xweb.file.XVFSFile;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.Result;
import kotlin.ResultKt;
import rx3.C13598b0;
import sx3.C110818d0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;
import z04.C112550d0;

@C91590f(mo125468c = "com.tencent.mm.mj_template.maas.HeicTranscodeHelper$transcode$2", mo125469f = "HeicTranscodeHelper.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: ha0.b */
public final class C8498b extends C91594j implements C32227p<C0000n0, C15601d<? super String>, Object> {

    /* renamed from: d */
    public final /* synthetic */ String f27522d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8498b(String str, C15601d<? super C8498b> dVar) {
        super(2, dVar);
        this.f27522d = str;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C8498b(this.f27522d, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C8498b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        ResultKt.throwOnFailure(obj);
        Log.m105924i("MicroMsg.Maas.HeicTranscodeHelper", "transcode file " + this.f27522d);
        Uri n = C116299g2.m163858n(this.f27522d);
        String path = n.getPath();
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!n.getPath().equals(k)) {
                n = n.buildUpon().path(k).build();
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(C8499c.f27523a);
        sb.append(XVFSFile.SEPARATOR_CHAR);
        String path2 = n.getPath();
        int lastIndexOf = path2.lastIndexOf("/");
        if (lastIndexOf >= 0) {
            path2 = path2.substring(lastIndexOf + 1);
        }
        String str = path2;
        C87412m.m108593f(str, "file.name");
        String str2 = (String) C110818d0.m150917O(C112550d0.m153785U(str, new String[]{"."}, false, 0, 6, (Object) null), 0);
        if (str2 == null) {
            str2 = String.valueOf(System.currentTimeMillis());
        }
        sb.append(str2);
        sb.append("_transcoded.jpg");
        String sb4 = sb.toString();
        Uri n2 = C116299g2.m163858n(sb4);
        String path3 = n2.getPath();
        if (path3 != null) {
            String k2 = C116299g2.m163855k(path3, false, false);
            if (!n2.getPath().equals(k2)) {
                n2 = n2.buildUpon().path(k2).build();
            }
        }
        String str3 = null;
        C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n2, (C116281f0.C116288h) null);
        if (!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b)) {
            Log.m105924i("MicroMsg.Maas.HeicTranscodeHelper", this.f27522d + " has cache " + sb4);
            return sb4;
        }
        Log.m105924i("MicroMsg.Maas.HeicTranscodeHelper", "start transcode for file " + this.f27522d);
        long currentTimeMillis = System.currentTimeMillis();
        Bitmap createThumbBitmap = BitmapUtil.createThumbBitmap(this.f27522d, 4096, 4096, true, false);
        if (createThumbBitmap == null) {
            Log.m105920e("MicroMsg.Maas.HeicTranscodeHelper", "decode bitmap error " + this.f27522d);
            return null;
        }
        Log.m105924i("MicroMsg.Maas.HeicTranscodeHelper", "decode success, start encode " + this.f27522d + ", takes " + (System.currentTimeMillis() - currentTimeMillis));
        String str4 = this.f27522d;
        try {
            Result.Companion companion = Result.Companion;
            BitmapUtil.saveBitmapToImage(createThumbBitmap, 100, Bitmap.CompressFormat.JPEG, sb4, true);
            Log.m105924i("MicroMsg.Maas.HeicTranscodeHelper", "encode success " + str4 + ", takes " + (System.currentTimeMillis() - currentTimeMillis));
            obj2 = Result.m168114constructorimpl(sb4);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj2 = Result.m168114constructorimpl(ResultKt.createFailure(th));
        }
        String str5 = this.f27522d;
        Throwable r3 = Result.m168117exceptionOrNullimpl(obj2);
        if (r3 == null) {
            str3 = obj2;
        } else {
            Log.printErrStackTrace("MicroMsg.Maas.HeicTranscodeHelper", r3, "save bitmap error " + str5, new Object[0]);
        }
        return str3;
    }
}
