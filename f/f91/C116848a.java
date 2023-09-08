package f91;

import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;

/* renamed from: f91.a */
public final class C116848a {

    /* renamed from: a */
    public static final C116849a f350239a = new C116849a((C8480h) null);

    /* renamed from: f91.a$a */
    public static final class C116849a {
        public C116849a(C8480h hVar) {
        }

        /* renamed from: a */
        public final void mo180847a(int i, long j) {
            try {
                String str = "hell_mlprocseq_" + i;
                if (!TextUtils.isEmpty(str)) {
                    C116850b.m164832b().putLong(str, j);
                }
            } catch (Exception e) {
                Log.printErrStackTrace("HABBYGE-MALI.HellMultiProcessSeqGenerator", e, "HellMultiProcessSeqGenerator.writeback", new Object[0]);
            }
        }
    }
}
