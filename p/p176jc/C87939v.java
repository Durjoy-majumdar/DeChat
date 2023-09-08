package p176jc;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import java.util.ArrayList;
import java.util.HashMap;
import rx3.C13598b0;

/* renamed from: jc.v */
public final class C87939v {

    /* renamed from: a */
    public static final C87939v f254498a = new C87939v();

    /* renamed from: b */
    public static HashMap<Long, C87940a> f254499b = new HashMap<>();

    /* renamed from: c */
    public static HashMap<Integer, Long> f254500c = new HashMap<>();

    /* renamed from: d */
    public static HashMap<Integer, C32226l<Boolean, C13598b0>> f254501d = new HashMap<>();

    /* renamed from: jc.v$a */
    public static final class C87940a {

        /* renamed from: a */
        public long f254502a;

        /* renamed from: b */
        public C87941b f254503b;

        /* renamed from: c */
        public HashMap<Integer, C87941b> f254504c;

        /* renamed from: d */
        public boolean f254505d;

        /* renamed from: e */
        public int f254506e;

        /* renamed from: f */
        public ArrayList<Integer> f254507f;

        public C87940a() {
            this(0);
        }

        /* renamed from: a */
        public final void mo122408a(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append("runtimePtr:");
            sb.append(this.f254502a);
            sb.append(" firstEngine costTime: ");
            C87941b bVar = this.f254503b;
            sb.append(bVar.f254509b - bVar.f254508a);
            Log.m105924i("SkylineManager", sb.toString());
            int size = this.f254504c.size();
            if (size != 0) {
                long j = 0;
                for (C87941b next : this.f254504c.values()) {
                    j += next.f254509b - next.f254508a;
                }
                Log.m105924i("SkylineManager", "runtimePtr:" + this.f254502a + " otherEngine sum:" + j + " count:" + size + " avgTime: " + (j / ((long) size)));
            }
        }

        public C87940a(long j) {
            this.f254502a = j;
            this.f254503b = new C87941b();
            this.f254504c = new HashMap<>();
            this.f254505d = true;
            this.f254506e = -1;
            this.f254507f = new ArrayList<>();
        }
    }

    /* renamed from: jc.v$b */
    public static final class C87941b {

        /* renamed from: a */
        public long f254508a;

        /* renamed from: b */
        public long f254509b;
    }
}
