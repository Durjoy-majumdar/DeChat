package l72;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: l72.a */
public class C109273a {

    /* renamed from: l72.a$a */
    public static class C109274a {

        /* renamed from: a */
        public int f327145a;

        /* renamed from: b */
        public int f327146b = 2;

        public C109274a(int i) {
            if (i == 1) {
                this.f327145a = 1;
            } else if (i == 2) {
                this.f327145a = 2;
            } else if (i == 512) {
                this.f327146b = 1;
                this.f327145a = 2;
            } else if (i == 4) {
                this.f327145a = 4;
            }
        }

        public String toString() {
            return "VideoEditCountData{scene=" + this.f327145a + ", source=" + this.f327146b + '}';
        }
    }

    /* renamed from: l72.a$b */
    public static class C109275b {

        /* renamed from: a */
        public int f327147a;

        /* renamed from: b */
        public boolean f327148b;

        /* renamed from: c */
        public int f327149c;

        /* renamed from: d */
        public int f327150d;

        /* renamed from: e */
        public int f327151e;

        /* renamed from: f */
        public int f327152f;

        /* renamed from: g */
        public boolean f327153g;

        /* renamed from: h */
        public int f327154h;

        /* renamed from: i */
        public int f327155i;

        /* renamed from: j */
        public int f327156j;

        /* renamed from: k */
        public int f327157k;

        public C109275b(int i) {
            if (i == 1) {
                this.f327147a = 2;
            } else if (i == 2) {
                this.f327147a = 4;
            } else if (i == 512) {
                this.f327147a = 3;
            } else if (i == 4) {
                this.f327147a = 8;
            }
        }

        public String toString() {
            return "VideoEditDetailData{scene=" + this.f327147a + ", isCancel=" + this.f327148b + ", rawDuration=" + this.f327149c + ", cropDuration=" + this.f327150d + ", emojiItemCount=" + this.f327151e + ", textItemCount=" + this.f327152f + ", isCrop=" + this.f327153g + ", undoCount=" + this.f327154h + ", doodleCount=" + this.f327155i + ", penColors=" + this.f327156j + ", textColor=" + this.f327157k + '}';
        }
    }

    /* renamed from: a */
    public static void m148388a(C109274a aVar) {
        Log.m105925i("MicroMsg.VideoEditReporter", "[report-VideoEditCountData] %s", aVar.toString());
        C115669n.INSTANCE.mo160131h(14529, Integer.valueOf(aVar.f327145a), Integer.valueOf(aVar.f327146b));
    }

    /* renamed from: b */
    public static void m148389b(C109275b bVar, String str) {
        C115669n nVar = C115669n.INSTANCE;
        Object[] objArr = new Object[14];
        objArr[0] = Integer.valueOf(bVar.f327147a);
        objArr[1] = Integer.valueOf(bVar.f327148b ? 2 : 1);
        objArr[2] = Integer.valueOf(bVar.f327151e);
        objArr[3] = Integer.valueOf(bVar.f327152f);
        objArr[4] = Integer.valueOf(bVar.f327155i);
        objArr[5] = Boolean.valueOf(bVar.f327153g);
        objArr[6] = Integer.valueOf(bVar.f327154h);
        objArr[7] = Integer.valueOf(bVar.f327149c);
        objArr[8] = Integer.valueOf(bVar.f327150d);
        objArr[9] = Integer.valueOf(bVar.f327156j);
        objArr[10] = 0;
        objArr[11] = Integer.valueOf(bVar.f327157k);
        objArr[12] = str;
        objArr[13] = Long.valueOf(Util.nowSecond());
        nVar.mo160131h(14362, objArr);
        Log.m105925i("MicroMsg.VideoEditReporter", "[report-VideoEditDetailData] %s", bVar.toString());
    }
}
