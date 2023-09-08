package p143ds;

import android.graphics.Matrix;
import android.graphics.Rect;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.xweb.file.XVFSFile;
import fy3.C32227p;
import gy3.C87412m;
import rx3.C13598b0;
import z04.C91602g0;

/* renamed from: ds.m */
public interface C7510m {

    /* renamed from: ds.m$b */
    public static final class C7511b {
        /* renamed from: a */
        public static /* synthetic */ void m7645a(C7510m mVar, String str, int i, Matrix matrix, Rect rect, Rect rect2, Rect rect3, int i2, boolean z, C32227p pVar, int i3, Object obj) {
            if (obj == null) {
                mVar.mo8635a(str, i, matrix, rect, rect2, rect3, i2, (i3 & 128) != 0 ? false : z, pVar);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: post");
        }
    }

    /* renamed from: ds.m$a */
    public static final class C7512a {

        /* renamed from: a */
        public String f25766a = "";

        /* renamed from: b */
        public String f25767b;

        /* renamed from: c */
        public String f25768c;

        /* renamed from: d */
        public int f25769d;

        /* renamed from: e */
        public int f25770e;

        /* renamed from: f */
        public int f25771f;

        /* renamed from: g */
        public int f25772g;

        public C7512a() {
            int dimension = (int) MMApplicationContext.getResources().getDimension(C0966R.dimen.aag);
            this.f25769d = dimension;
            this.f25770e = dimension;
            this.f25771f = 80;
        }

        /* renamed from: a */
        public final void mo8636a(String str) {
            C87412m.m108594g(str, "value");
            if (C91602g0.m114945m0(str) != '/') {
                str = str + XVFSFile.SEPARATOR_CHAR;
            }
            this.f25766a = str;
        }
    }

    /* renamed from: ds.m$c */
    public static class C7513c {

        /* renamed from: a */
        public int f25773a;

        /* renamed from: b */
        public String f25774b = "";

        /* renamed from: c */
        public int f25775c;

        public C7513c(int i) {
            this.f25773a = i;
        }
    }

    /* renamed from: a */
    void mo8635a(String str, int i, Matrix matrix, Rect rect, Rect rect2, Rect rect3, int i2, boolean z, C32227p<? super Boolean, ? super C7513c, C13598b0> pVar);
}
