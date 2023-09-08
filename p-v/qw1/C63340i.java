package qw1;

import android.media.MediaFormat;
import android.net.Uri;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.FileSystem;
import gy3.C87412m;
import java.io.File;
import kotlin.Result;
import kotlin.ResultKt;
import p914oj.C110052b;
import rx3.C13604l;
import z04.C112550d0;
import z04.C112551y;

/* renamed from: qw1.i */
public final class C63340i {

    /* renamed from: a */
    public static final C63340i f179709a = new C63340i();

    /* renamed from: a */
    public final C13604l<String, Integer> mo88237a(String str) {
        boolean z;
        MediaFormat mediaFormat;
        Uri n = C116299g2.m163858n(str);
        String path = n.getPath();
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!n.getPath().equals(k)) {
                n = n.buildUpon().path(k).build();
            }
        }
        String str2 = null;
        C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
        if (!l.mo177810a()) {
            z = false;
        } else {
            FileSystem.C85995c cVar = l.f348991a;
            String w = cVar.mo119947w(l.f348992b, false);
            z = w != null ? new File(w).canRead() : cVar.mo119948x(l.f348992b);
        }
        if (z) {
            C110052b bVar = new C110052b();
            try {
                bVar.mo161392k(str);
                int d = bVar.mo161385d();
                int i = 0;
                while (true) {
                    if (i >= d) {
                        mediaFormat = null;
                        break;
                    }
                    mediaFormat = bVar.mo161386e(i);
                    C87412m.m108593f(mediaFormat, "mediaExtractor.getTrackFormat(i)");
                    if (mediaFormat.containsKey("mime")) {
                        String string = mediaFormat.getString("mime");
                        boolean z2 = true;
                        if (string == null || !C112550d0.m153801u(string, "video", true)) {
                            z2 = false;
                        }
                        if (z2) {
                            break;
                        }
                    }
                    i++;
                }
                int i2 = -1;
                if (mediaFormat != null) {
                    if (mediaFormat.containsKey(Scopes.PROFILE)) {
                        i2 = mediaFormat.getInteger(Scopes.PROFILE);
                    }
                    if (mediaFormat.containsKey("mime")) {
                        str2 = mediaFormat.getString("mime");
                    }
                }
                bVar.mo161388g();
                return new C13604l<>(str2, Integer.valueOf(i2));
            } catch (Exception unused) {
                throw new RuntimeException("Unable to set source " + str);
            }
        } else {
            throw new RuntimeException("Unable to read " + str);
        }
    }

    /* renamed from: b */
    public final boolean mo88238b(String str) {
        C13604l lVar;
        C87412m.m108594g(str, "path");
        try {
            Result.Companion companion = Result.Companion;
            lVar = Result.m168114constructorimpl(mo88237a(str));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            lVar = Result.m168114constructorimpl(ResultKt.createFailure(th));
        }
        C13604l lVar2 = new C13604l(null, -1);
        if (Result.m168120isFailureimpl(lVar)) {
            lVar = lVar2;
        }
        C13604l lVar3 = (C13604l) lVar;
        return C112551y.m153809i("video/hevc", (String) lVar3.f38555d, true) ? ((Number) lVar3.f38556e).intValue() == 1 : !C112551y.m153809i("video/avc", (String) lVar3.f38555d, true) || ((Number) lVar3.f38556e).intValue() != 16;
    }
}
