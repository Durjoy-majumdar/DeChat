package p548hg;

import android.content.Context;
import com.tencent.p014mm.autogen.events.DoFavoriteEvent;
import com.tencent.p014mm.storage.C72963f4;
import di3.C7335d;
import gy3.C87412m;
import java.util.List;
import p158gt.C59701t;
import p434ig.C98674g;
import p434ig.C98680m;
import te3.C101841sc0;

/* renamed from: hg.d */
public interface C98450d extends C7335d {

    /* renamed from: hg.d$a */
    public enum C59881a {
        TYPE_IMG,
        TYPE_VIDEO
    }

    /* renamed from: hg.d$b */
    public static final class C59882b {

        /* renamed from: a */
        public final String f170950a;

        /* renamed from: b */
        public final boolean f170951b;

        /* renamed from: c */
        public final int f170952c;

        /* renamed from: d */
        public final C59881a f170953d;

        public C59882b(String str, boolean z, int i, C59881a aVar) {
            C87412m.m108594g(str, "mediaFilePath");
            C87412m.m108594g(aVar, "mediaType");
            this.f170950a = str;
            this.f170951b = z;
            this.f170952c = i;
            this.f170953d = aVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C59882b)) {
                return false;
            }
            C59882b bVar = (C59882b) obj;
            return C87412m.m108589b(this.f170950a, bVar.f170950a) && this.f170951b == bVar.f170951b && this.f170952c == bVar.f170952c && this.f170953d == bVar.f170953d;
        }

        public int hashCode() {
            int hashCode = this.f170950a.hashCode() * 31;
            boolean z = this.f170951b;
            if (z) {
                z = true;
            }
            return ((((hashCode + (z ? 1 : 0)) * 31) + this.f170952c) * 31) + this.f170953d.hashCode();
        }

        public String toString() {
            return "AlbumSendInfo(mediaFilePath=" + this.f170950a + ", compress=" + this.f170951b + ", duration=" + this.f170952c + ", mediaType=" + this.f170953d + ')';
        }
    }

    /* renamed from: DG */
    void mo137791DG(int i, String str, List<C59882b> list);

    void Eu0(List<String> list, List<String> list2, List<String> list3, int[] iArr, String str, int i, boolean z, C59701t tVar);

    /* renamed from: FC */
    String mo137793FC(Context context, C98674g gVar);

    /* renamed from: Ml */
    String mo137794Ml(Context context, String str);

    /* renamed from: VP */
    void mo137795VP(Context context, String str, C98674g gVar, C72963f4 f4Var);

    /* renamed from: XO */
    String mo137796XO(Context context, C98680m mVar);

    /* renamed from: al */
    String mo137797al(Context context, String str);

    /* renamed from: ep */
    boolean mo137798ep(String str);

    void es0(Context context, String str, long j);

    /* renamed from: fg */
    boolean mo137800fg(C101841sc0 sc02, DoFavoriteEvent doFavoriteEvent, C72963f4 f4Var);

    String km0(List<? extends C59881a> list);

    String m30(C98680m mVar);
}
